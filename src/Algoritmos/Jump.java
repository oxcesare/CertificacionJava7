/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author cralducinr
 */
public class Jump {

    public static void main(String[] args) {
        
        int [] A = {2,3,1,1,4};
        Jump c = new Jump();
        c.canJump(A);

    }

    public boolean canJump(int[] A) {
        if (A.length <= 1) {
            return true;
        }

        int max = A[0]; //max stands for the largest index that can be reached.

        for (int i = 0; i < A.length; i++) {
            //if not enough to go to next
            if (max <= i && A[i] == 0) {
                return false;
            }

            //update max    
            if (i + A[i] > max) {
                max = i + A[i];
            }

            //max is enough to reach the end
            if (max >= A.length - 1) {
                return true;
            }
        }

        return false;
    }

}
