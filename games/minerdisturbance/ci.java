/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static double field_k;
    java.awt.Image field_g;
    static ll field_i;
    int field_c;
    int[] field_f;
    static byte[][] field_a;
    static String[][] field_h;
    int field_d;
    static bd field_e;
    static String field_j;
    static boolean field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        L0: {
          gj.a(param1 ^ 2670, (java.awt.Component) (Object) param0);
          vd.a((byte) -106, (java.awt.Component) (Object) param0);
          if (null != pf.field_e) {
            pf.field_e.a(1000, (java.awt.Component) (Object) param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 0) {
          field_h = null;
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 36) {
          if (fh.field_b >= 10) {
            if (qc.field_b) {
              return false;
            } else {
              L0: {
                if (gd.b((byte) -97)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_i = null;
          if (fh.field_b >= 10) {
            if (qc.field_b) {
              return false;
            } else {
              L1: {
                if (gd.b((byte) -97)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(byte param0) {
        eh.a(((ci) this).field_f, ((ci) this).field_c, ((ci) this).field_d);
        if (param0 != -45) {
            Object var3 = null;
            ((ci) this).a((java.awt.Component) null, -30, 28, 18);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        if (param0 != 0) {
          field_b = true;
          field_h = null;
          field_a = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_a = null;
          field_i = null;
          return;
        }
    }

    final static ln a(ln param0, byte param1, int[] param2) {
        ln var3 = new ln(0, 0, 0);
        int var4 = 111 / ((param1 - -29) / 57);
        var3.field_k = param0.field_k;
        var3.field_n = param2;
        var3.field_a = param0.field_a;
        var3.field_f = param0.field_f;
        var3.field_b = param0.field_b;
        var3.field_m = param0.field_m;
        var3.field_j = param0.field_j;
        var3.field_e = param0.field_e;
        return var3;
    }

    final static boolean a(int param0, String param1) {
        if (param0 != -27933) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return in.field_b.equals((Object) (Object) cl.a(-95, var3));
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[][]{new String[1]};
        field_k = 0.0;
        field_e = new bd();
        field_j = "You are not currently logged in to the service. To save your score, progress and Achievements, you must log in or create an account.";
    }
}
