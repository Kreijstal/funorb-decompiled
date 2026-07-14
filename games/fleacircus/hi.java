/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends lh {
    static sf field_p;
    static int field_q;
    static String field_k;
    int field_l;
    int field_j;
    int field_m;
    int field_n;
    int field_i;
    int field_o;

    final static boolean a(byte param0) {
        if (param0 != -72) {
            field_p = null;
            return d.field_L;
        }
        return d.field_L;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        if (param0 != -38) {
          hi.c((byte) -59);
          cb.a(-105, "", param1);
          df.a(param1, 10245);
          return;
        } else {
          cb.a(-105, "", param1);
          df.a(param1, 10245);
          return;
        }
    }

    final static void a(ce param0, java.awt.Frame param1, byte param2) {
        od var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(param1, (byte) -34);
          L1: while (true) {
            if (-1 != (var3.field_b ^ -1)) {
              if (var3.field_b != 1) {
                vh.a(100L, 101);
                continue L0;
              } else {
                if (param2 != 52) {
                  field_q = -47;
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                } else {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                }
              }
            } else {
              vh.a(10L, 120);
              continue L1;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_p = null;
        if (param0 >= -63) {
            field_p = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    hi(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hi) this).field_i = param3;
        ((hi) this).field_m = param1;
        ((hi) this).field_n = param5;
        ((hi) this).field_o = param2;
        ((hi) this).field_l = param4;
        ((hi) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Names should contain a maximum of 12 characters";
        field_q = 0;
    }
}
