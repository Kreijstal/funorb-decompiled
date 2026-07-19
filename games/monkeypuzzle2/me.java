/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ug {
    int field_m;
    static String field_h;
    static boolean field_e;
    int field_k;
    static byte[][][] field_g;
    static String field_n;
    static ha field_f;
    static int[] field_i;
    static String field_l;
    static int[] field_j;

    public static void a(boolean param0) {
        if (!param0) {
          me.a(true);
          field_i = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_h = null;
          field_n = null;
          field_g = (byte[][][]) null;
          return;
        } else {
          field_i = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_h = null;
          field_n = null;
          field_g = (byte[][][]) null;
          return;
        }
    }

    private me() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Unable to connect to the data server. Please check any firewall you are using.";
        field_n = "End Game";
        field_l = "That name is not available";
        field_j = new int[8192];
    }
}
