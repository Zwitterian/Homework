package homework4;

import java.util.Arrays;

public class HomeworkIIII {

    public void has22() {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {1, 2, 1, 2};
        int[] nums3 = {2, 1, 2};
        boolean success = false;

        for (int i = 0; i < nums1.length; i++) {
            if (i > 0 && nums1[i] == 2 && nums1[i - 1] == 2) {
                success = true;
            } else {
                success = false;
            }

        }
        System.out.println(success);

        for (int i = 0; i < nums2.length; i++) {
            if (i > 0 && nums2[i] == 2 && nums2[i - 1] == 2) {
                success = true;
            } else {
                success = false;
            }

        }
        System.out.println(success);

        for (int i = 0; i < nums3.length; i++) {
            if (i > 0 && nums3[i] == 2 && nums3[i - 1] == 2) {
                success = true;
            } else {
                success = false;
            }

        }
        System.out.println(success);
    }

    public void lucky13() {
        int[] nums1 = {0, 2, 4};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {1, 2, 4};
        boolean success = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 1 && nums1[i] == 3) {
                success = false;
            } else {
                success = true;
            }
        }
        System.out.println(success);

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 1 || nums2[i] == 3) {
                success = false;
            } else {
                success = true;
            }
        }
        System.out.println(success);

        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] == 1 || nums3[i] == 3) {
                success = false;
                if (nums3[i] == 1 || nums3[i] == 3) {
                    break;
                }
            } else {
                success = true;
            }
        }
        System.out.println(success);
    }

    public void oddInts() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 5, 3};
        int[] nums3 = {5, 2, 3};

        if (nums1[0] > nums1[1] && nums1[0] > nums1[2]) {
            System.out.println(nums1[0]);
        } else if (nums1[1] > nums1[0] && nums1[1] > nums1[2]) {
            System.out.println(nums1[1]);
        } else if (nums1[2] > nums1[1] && nums1[2] > nums1[0]) {
            System.out.println(nums1[2]);
        }

        if (nums2[0] > nums2[1] && nums2[0] > nums2[2]) {
            System.out.println(nums2[0]);
        } else if (nums2[1] > nums2[0] && nums2[1] > nums2[2]) {
            System.out.println(nums2[1]);
        } else if (nums2[2] > nums2[1] && nums2[2] > nums2[0]) {
            System.out.println(nums2[2]);
        }

        if (nums3[0] > nums3[1] && nums3[0] > nums3[2]) {
            System.out.println(nums3[0]);
        } else if (nums3[1] > nums3[0] && nums3[1] > nums3[2]) {
            System.out.println(nums3[1]);
        } else if (nums3[2] > nums3[1] && nums3[2] > nums3[0]) {
            System.out.println(nums3[2]);
        }
    }

    public void arrayFront9() {
        int[] nums1 = {1, 2, 9, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 9};
        int[] nums3 = {1, 2, 3, 4, 5};

        boolean success = false;

        for (int i = 0; i < nums1.length - 1; i++) {
            if (nums1[i] == 9) {
                success = true;
            }

        }
        System.out.println(success);

        success = false;
        for (int i = 0; i < nums2.length - 1; i++) {
            if (nums2[i] == 9) {
                success = true;
            }

        }
        System.out.println(success);
    }

    public void multiplier() {
        int[] nums1 = {1, 2, 3};
        nums1[0] = nums1[0] * nums1[0];
        nums1[1] = nums1[1] * nums1[1];
        nums1[2] = nums1[2] * nums1[2];
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {6, 8, -6, -8, 1};
        nums2[0] = nums2[0] * nums2[0];
        nums2[1] = nums2[1] * nums2[1];
        nums2[2] = nums2[2] * nums2[2];
        nums2[3] = nums2[3] * nums2[3];
        nums2[4] = nums2[4] * nums2[4];
        System.out.println(Arrays.toString(nums2));
    }

}


