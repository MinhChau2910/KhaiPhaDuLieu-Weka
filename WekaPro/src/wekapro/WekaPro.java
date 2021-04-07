/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.trees.J48;

/**
 *
 * @author FPT
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //MyKnowledgeModel model = new MyKnowledgeModel ("C:\\Program Files\\Weka-3-9\\data\\iris.arff");
        //System.out.println(model);
        //model.saveData( "F:\\Data\\iris.arff");
        //model.saveData2CSV ("F:\\Data\\iris_CSV.csv");
        
        //MyAprioriModel model = new MyAprioriModel("C:\\Program Files\\Weka-3-9\\data\\weather.numeric.arff",
               //"-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1", 
               //"-R 2-3");
        //model.mineAssociationRules();
        //System.out.println(model);
        
        //MyFPGrowthModel model = new MyFPGrowthModel(
                //"C:\\Program Files\\Weka-3-9\\data\\weather.nominal.arff", 
                //"-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
                //"-N -R first-last");
        //model.mineAssociationRules();
        //System.out.println(model);
        
       // MyKnowledgeModel model = new MyKnowledgeModel( "C:\\Program Files\\Weka-3-9\\data\\iris.arff",null,null);
        //model.trainset = model.divideTrainTestR(model.dataset,80,false);
        //model.testset = model.divideTrainTestR(model.dataset,80,true);
        //System.out.println(model);
        //System.out.println(model.trainset.toSummaryString());
        //System.out.println(model.testset.toSummaryString());
        
        
        //MyDecisionTreeModel model = new MyDecisionTreeModel(
           //     "C:\\Users\\FPT\\Desktop\\data\\iris.arff"
           //     ,"-C 0.25 -M 2",null);
       // model.buildDecisionTree();
       // model.evaluateDecicsonTree();
       // System.out.println(model);
       //// model.saveModel("C:\\Users\\FPT\\Desktop\\models\\decision-tree", model.tree);
       // model.tree =(J48)model.loadModel("C:\\Users\\FPT\\Desktop\\models\\decsiontree.model");
       // model.predictClassLabel(model.testset); 
       
       
        //MyNaiveBayesModel model = new MyNaiveBayesModel();
        //model.buildNaiveBayes("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
        //model.evaluateNaivebayes("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
        //model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff",
        //                          "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-nb.arff");
        //System.out.println(model);
        
        //MyNeuralNetworkModel model = new MyNeuralNetworkModel("",
        //                        "-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a -R",
        //                        null);
        //model.buildNeuralNetwork("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
        //model.evaluateNeuralNetwork("C:\\\\Users\\\\FPT\\Desktop\\chude5\\iris-test.arff");
        //model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff",
          //                          "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-ann.arff");
        //System.out.println(model);
        
        //MySVMModel model = new MySVMModel("",
          //      "-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"wek a.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\""
                       // ,null);
        //model.buildSVM("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
        //model.evaluateSVM("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
        //model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
          //     "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-svm.arff");
        //System.out.println(model);
        
//        MyKNNModel model = new MyKNNModel("",
//                "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\""
//                        ,null);
//        model.buildKNN("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
//        model.evaluateKNN("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
//               "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict_knn.arff");
//        System.out.println(model);



        // phuong phap baging
//        MyBaggingModel model = new MyBaggingModel("",null
//                        ,null);
//        model.buildMyBaggingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
//        model.evaluateBaggingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
//               "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-bag.arff");
//        System.out.println("Finished");
        


        //phuong pháp boosting
//        MyBoostingModel model = new MyBoostingModel("",null
//                        ,null);
//        model.buildMyBoostingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
//        model.evaluateBoostingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
//               "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-boost.arff");
//        System.out.println("Finished");
        
        
//        //phuong phap voting
//        
//        MyVotingModel model = new MyVotingModel("",null
//                        ,null);
//        model.buildMyVotingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
//        model.evaluateVotingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
//               "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-vote .arff");
//        System.out.println("Finished");
        
        //phuongphap stacking
        
        MyBlendingModel model = new MyBlendingModel("",null
                        ,null);
        model.buildMyBlendingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-train.arff");
        model.evaluateBlendingModel("C:\\Users\\FPT\\Desktop\\chude5\\iris-test.arff");
        model.predictClassLabel("C:\\Users\\FPT\\Desktop\\chude5\\iris-unlabel.arff", 
               "C:\\Users\\FPT\\Desktop\\chude5\\iris-predict-blending.arff");
        System.out.println("Finished");
    }
    
}
