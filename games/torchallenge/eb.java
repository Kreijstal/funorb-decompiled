/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends da {
    static int[] field_k;
    boolean field_j;
    static boolean field_n;
    static ka[] field_p;
    static int[] field_s;
    byte[] field_q;
    static String field_i;
    static char[] field_r;
    static boolean field_o;
    static eb field_l;
    static boolean field_m;

    final static boolean a(String param0, boolean param1, String param2, int param3, dg param4, int param5, String param6) {
        ta var7 = null;
        Object var8 = null;
        ta var10 = null;
        ta var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (mg.field_c == gj.field_a) {
          if (param3 == 193) {
            var11 = new ta(t.field_b, param4);
            var7 = var11;
            t.field_b.a((byte) 125, (ee) (Object) var11);
            if (!wi.a(0)) {
              L0: {
                mj.field_d = param6;
                cf.field_f = param5;
                uf.field_j = param2;
                if (!param1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              cj.field_d = stackIn_15_0 != 0;
              pd.field_h = null;
              gj.field_a = qc.field_i;
              vb.field_m = param0;
              return true;
            } else {
              var11.h((byte) 21);
              return true;
            }
          } else {
            var8 = null;
            boolean discarded$1 = eb.a((String) null, false, (String) null, -40, (dg) null, -123, (String) null);
            var10 = new ta(t.field_b, param4);
            var7 = var10;
            t.field_b.a((byte) 125, (ee) (Object) var10);
            if (!wi.a(0)) {
              L1: {
                mj.field_d = param6;
                cf.field_f = param5;
                uf.field_j = param2;
                if (!param1) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              cj.field_d = stackIn_8_0 != 0;
              pd.field_h = null;
              gj.field_a = qc.field_i;
              vb.field_m = param0;
              return true;
            } else {
              var10.h((byte) 21);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_i = null;
        field_r = null;
        field_l = null;
        if (param0 != 237) {
            return;
        }
        field_k = null;
        field_p = null;
    }

    eb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Resume Game";
        field_r = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_s = new int[]{34, 34, 34};
    }
}
