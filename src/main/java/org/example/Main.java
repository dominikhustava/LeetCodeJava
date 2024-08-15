package org.example;

import org.example.easy.PalindromeNumber;
import org.example.easy.TwoSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //two sum execution
        int[] nums = {2,7,11,15};
        int[] nums1 = {3,2,4};
        int[] nums2 = {3,3};
        int target = 9;
        int target1 = 6;
        int target2 = 6;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));
        System.out.println(Arrays.toString(TwoSum.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(TwoSum.twoSum(nums2, target2)));

        //is Palindrome number
        int x = 121;
        System.out.println("is " + x + " palindrome?" + " -> " + PalindromeNumber.isPalindrome(x));
        int x1 = 144;
        System.out.println("is " + x1 + " palindrome?" + " -> " + PalindromeNumber.isPalindrome(x1));

    }
}