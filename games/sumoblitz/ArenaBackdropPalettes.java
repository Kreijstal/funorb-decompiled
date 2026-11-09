/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArenaBackdropPalettes {
    static int[][] palettes;
    static String notCompletedText;
    static String field_d;
    static int uniqueDroneTypeStreak;

    static long xor(long left, long right) {
        return left ^ right;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        palettes = (int[][]) null;
        if (param0 != 84) {
          ArenaBackdropPalettes.releaseStatics((byte) 127);
          notCompletedText = null;
          return;
        }
        notCompletedText = null;
    }

    static {
        notCompletedText = "not completed";
        palettes = new int[][]{new int[]{-14277033, -15585213, -13919072}, new int[]{-12792366, -14277033, -6178359}, new int[]{-14268072, -9864870, -11182489}, new int[]{-14141416, -8812229, -8820409}, new int[]{-11252113, -8820409, -9864870}, new int[]{-10927218, -12507818, -8570810}, new int[]{-12381421, -13948885, -15198440}};
        uniqueDroneTypeStreak = 0;
    }
}
