/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.meta.AdaBoostM1;
import weka.classifiers.meta.Vote;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author FPT
 */
public class MyVotingModel extends MyKnowledgeModel {
    Evaluation eval;
    Vote voting;
    
    public  MyVotingModel(){
        
    }
    public  MyVotingModel(String filename, String m_opts, String d_opts) throws Exception{
        super(filename ,m_opts, d_opts);
    }
    public void buildMyVotingModel(String filename) throws Exception{
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        voting = new Vote();
        Classifier[] classifiers = { new NaiveBayes(),
                                     new J48(),
                                     new RandomForest()};
        
        voting.setClassifiers(classifiers);
        voting.setCombinationRule(new SelectedTag(Vote.MAJORITY_VOTING_RULE, Vote.TAGS_RULES));
        voting.buildClassifier(trainset);
    }
    public void evaluateVotingModel(String filename) throws Exception{
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        Random rnd = new Random(1);
        int folds = 10;
        eval = new Evaluation(this.trainset);
        eval.crossValidateModel(voting, testset, folds, rnd);
        System.out.println(eval.toSummaryString(
            "\nKet qua danh gia mo hinh 10-folds cross validation -------------\n", false));
        
    }
    public void predictClassLabel(String fileIn, String fileOut) throws Exception{
        DataSource ds = new DataSource(fileIn);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //predict label for each instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = voting.classifyInstance(unlabel.instance(i));
            unlabel.instance(i).setClassValue(predict);
        }
        
        BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileOut));
        outWriter.write(unlabel.toString());
        outWriter.newLine();
        outWriter.flush();
        outWriter.close();
    }
    
}
