/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int[] field_f;
    static int[] field_e;
    static boolean field_d;
    static ko field_c;
    static String field_g;
    static String field_a;
    static vh field_b;

    final static String b(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return th.field_g;
    }

    public static void a(boolean param0) {
        String discarded$2 = null;
        field_c = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_e = null;
        if (!param0) {
          discarded$2 = rc.b(false);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        field_e = new int[]{16777215, 16777062, 6711039, 16737894, 10040268, 16764006, 6750054, 10053171, 3355443, 16777062, 6711039, 16737894, 10040268, 16764006, 6750054, 10053171};
        field_g = "<%0> : ";
        field_c = new ko();
        field_a = "That concludes the Nine-ball Tutorial! Simple, eh? Press <img=3> to go to the options menu to end the tutorial.";
    }
}
