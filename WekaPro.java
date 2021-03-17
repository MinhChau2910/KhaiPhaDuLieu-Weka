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
        
        
        MyDecisionTreeModel model = new MyDecisionTreeModel(
                "C:\\Users\\FPT\\Desktop\\data\\iris.arff"
                ,"-C 0.25 -M 2",null);
        model.buildDecisionTree();
        model.evaluateDecicsonTree();
        System.out.println(model);
        model.saveModel("C:\\Users\\FPT\\Desktop\\models\\decision-tree", model.tree);
        model.tree =(J48)model.loadModel("C:\\Users\\FPT\\Desktop\\models\\decsiontree.model");
        model.predictClassLabel(model.testset); 
    }
    
}
