/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Debug;
import weka.core.Debug.Random;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Admin
 */
public class MyKNNModel extends MyKnowledgeModel {
    IBk knn;
    Evaluation eval;

    public MyKNNModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
    
    public void buildKNN(String filename) throws Exception{
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        this.knn = new IBk();
        knn.setOptions(model_options);
        knn.buildClassifier(this.trainset);
    }
    
    public void evaluateKNN(String filename) throws Exception{
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        Random rnd = new Debug.Random(1);
        int folds = 10;
        eval = new Evaluation(this.trainset);
        eval.crossValidateModel(this.knn, this.testset, folds, rnd);
        System.out.println(eval.toSummaryString(
            "\nKet qua danh gia mo hinh 10-folds cross validation -------------\n", false));
    }
    
    public void predictClassLabel(String fileIn, String fileOut) throws Exception{
        DataSource ds = new DataSource(fileIn);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //predict label for each instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = this.knn.classifyInstance(unlabel.instance(i));
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
        return this.knn.toString();
    }
}
