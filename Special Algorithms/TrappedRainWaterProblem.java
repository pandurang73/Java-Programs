public class TrappedRainWaterProblem {
    public static void main(String args[]) {
        int height[] = { 5, 3, 0, 4, 1, 0, 4 };
        int n = height.length;
        int trappedWater = 0;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // calculate first left max boundary
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary's
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // now from this two arrays find minimum in same position and substract from
        // heights respect to same position

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        System.out.println("Total trapped water is " + trappedWater);

    }
}