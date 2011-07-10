/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Samples.Basic;

import edu.uci.ics.jung.graph.SparseGraph;
public class BugTest {
     public static void main(String[] args) {
         SparseGraph<String,Integer> g = new SparseGraph<String,Integer>();
         g.addVertex("A"); g.addVertex("B");
         g.addEdge(1, "A", "B");
         g.removeEdge(1);
         g.addEdge(2, "A", "B"); // Exception thrown here...
                  System.out.println("Edge between A & B: " + g.findEdge("A", "B") );
         System.out.println(g);
         g.addEdge(3, "A", "B");
         System.out.println(g);
         System.out.println("Edge between A & B: " + g.findEdge("A", "B") );
    }
}
