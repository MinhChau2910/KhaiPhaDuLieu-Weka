/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SMO;
import weka.core.Debug;
import weka.core.Debug.Random;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Admin
 */
public class MySVMModel extends MyKnowledgeModel {
    SMO svm;

    public MySVMModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
    
    public void buildSVM(String filename) throws Exception{
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        this.svm = new SMO();
        svm.buildClassifier(this.trainset);
    }
    
    public void evaluateSVM(String filename) throws Exception{
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        Random rnd = new Debug.Random(1);
        int folds = 10;
        Evaluation eval = new Evaluation(this.trainset);
        eval.crossValidateModel(this.svm, this.testset, folds, rnd);
        System.out.println(eval.toSummaryString(
            "\nKet qua danh gia mo hinh 10-folds cross validation -------------\n", false));
    }
    
    public void predictClassLabel(String fileIn, String fileOut) throws Exception{
        DataSource ds = new DataSource(fileIn);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //predict label for each instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = this.svm.classifyInstance(unlabel.instance(i));
            unlabel.instance(i).setClassValue(predict);
        }
        
        BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileOut));
        outWriter.write(unlabel.toString());
        outWriter.newLine();
        outWriter.flush();
        outWriter.close();
    }

    @Override
    public String toString() {
        return this.svm.toString();
    }
}
