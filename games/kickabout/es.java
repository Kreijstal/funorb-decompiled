/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends gn {
    static byte[][] field_e;
    private int field_j;
    static int field_h;
    private int field_i;
    private int field_l;
    static String field_g;
    static vn field_k;
    static ut field_f;

    final void a(ml param0, byte param1) {
        param0.a(112, ((es) this).field_j);
        param0.a(((es) this).field_l, (byte) 118);
        param0.a(102, ((es) this).field_i);
        if (param1 < 89) {
            Object var4 = null;
            ((es) this).a((ml) null, (byte) 107);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 != -49) {
            return;
        }
        field_f = null;
        field_k = null;
    }

    es(int param0, int param1, int param2) {
        ((es) this).field_i = param2;
        ((es) this).field_l = param1;
        ((es) this).field_j = param0;
    }

    final static void a(int param0, nl param1, int param2, nl param3, tj param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        if ((param4.field_m ^ -1) == 0) {
          return;
        } else {
          var5 = param1.f(-92) + -param4.a(true);
          if (param0 >= -56) {
            L0: {
              var8 = null;
              es.a(-29, (nl) null, -8, (nl) null, (tj) null);
              var6 = param1.a(true) - param4.c(879306160);
              var7 = nb.a(param1, 170);
              if (var7 * var7 > var5 * var5 + var6 * var6) {
                param1.b(0, -1);
                param1.field_L = 200;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              var6 = param1.a(true) - param4.c(879306160);
              var7 = nb.a(param1, 170);
              if (var7 * var7 > var5 * var5 + var6 * var6) {
                param1.b(0, -1);
                param1.field_L = 200;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Continue";
    }
}
