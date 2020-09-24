public class NthUglyNumber {
    private static final Ugly u = new Ugly();

    public int nthUglyNumber(int n) {
        return u.nums[n - 1];
    }
}

class Ugly {
    public int[] nums = new int[1690];

    public Ugly() {
        nums[0] = 1;
        int ugly, p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < 1690; i++) {
            ugly = Math.min(Math.min(nums[p2] * 2, nums[p3] * 3), nums[p5] * 5);
            nums[i] = ugly;
            if (ugly == nums[p2] * 2) p2++;
            if (ugly == nums[p3] * 3) p3++;
            if (ugly == nums[p5] * 5) p5++;
        }
    }
}