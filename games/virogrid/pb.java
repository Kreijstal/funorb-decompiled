/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends l {
    static String field_m;
    int field_o;
    int field_j;
    static km field_p;
    static String field_k;
    static int[] field_i;
    pb field_q;
    static String field_l;
    static String field_n;
    int field_g;
    int field_r;
    int field_s;
    static int field_h;

    final static boolean a(int param0) {
        if (param0 == 4) {
          if (null != kk.field_q) {
            if (!kk.field_q.c(-1558)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_p = null;
          if (null != kk.field_q) {
            if (!kk.field_q.c(-1558)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte[] param0, eh param1, String[] param2, int param3, boolean param4, int param5, byte[] param6, rm[] param7, eh param8, int[] param9, String[][] param10, int[] param11, String[][] param12, boolean param13, eh param14, mg[][] param15, mg[][] param16) {
        Object var18 = null;
        nm.a(param6, param7, param9, param12, param0, param8, 1, (String[]) null, param10, param16, param4, param15, param5, param11, (byte) -94, param2, param1, param14, param3);
        if (!param13) {
            return;
        }
        pb.a((byte[]) null, (eh) null, (String[]) null, 25, false, 29, (byte[]) null, (rm[]) null, (eh) null, (int[]) null, (String[][]) null, (int[]) null, (String[][]) null, false, (eh) null, (mg[][]) null, (mg[][]) null);
    }

    pb(int param0, int param1, int param2, int param3, int param4) {
        ((pb) this).field_j = param3;
        ((pb) this).field_s = param4;
        ((pb) this).field_r = param1;
        ((pb) this).field_o = param0;
        ((pb) this).field_g = param2;
    }

    public static void a(byte param0) {
        field_m = null;
        int var1 = -55 % ((-5 - param0) / 34);
        field_k = null;
        field_p = null;
        field_i = null;
        field_l = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "white";
        field_i = new int[4];
        field_h = -1;
        field_n = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Accept unrated rematch";
    }
}
