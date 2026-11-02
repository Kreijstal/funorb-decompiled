/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    int field_f;
    static cd field_c;
    int field_i;
    int field_k;
    int field_d;
    static String quittowebsite;
    static int[] field_m;
    static String field_b;
    static String xWantsToJoin;
    static String canceldraw;
    static long[] field_l;
    static int[] field_a;
    static int field_g;
    private static String field_z;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          canceldraw = null;
          xWantsToJoin = null;
          field_m = null;
          field_l = null;
          field_a = null;
          field_b = null;
          quittowebsite = null;
          return;
        }
        field_l = (long[]) null;
        canceldraw = null;
        xWantsToJoin = null;
        field_m = null;
        field_l = null;
        field_a = null;
        field_b = null;
        quittowebsite = null;
    }

    static {
        field_z = "dj.A(";
        field_c = new cd();
        field_m = new int[]{14, 15, 16, 8, 52, 53};
        xWantsToJoin = "<%0> wants to join";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        canceldraw = "Cancel draw";
        quittowebsite = "Quit to website";
        field_l = new long[32];
        field_g = 150;
        field_a = new int[7];
    }
}
