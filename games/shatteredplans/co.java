/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co extends wf {
    static long field_o;
    static String field_q;
    static String field_t;
    static bi[] field_p;
    static om field_s;
    static String field_r;

    public static void d(byte param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        if (param0 != -99) {
            field_o = -127L;
        }
        field_p = null;
        field_s = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, ob param1, java.math.BigInteger param2, ob param3, java.math.BigInteger param4) {
        ra.a(param2, param1, 0, 0, param4, param3.field_h, param3.field_j);
        if (param0 != 25050) {
            Object var6 = null;
            co.a(43, (ob) null, (java.math.BigInteger) null, (ob) null, (java.math.BigInteger) null);
        }
    }

    co(ln param0, boolean param1, boolean[] param2) {
        super(param0);
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        ln[] var8 = null;
        L0: {
          ((co) this).field_i = param0.field_N;
          if (param1) {
            break L0;
          } else {
            var8 = param0.field_D;
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var8.length) {
                break L0;
              } else {
                var6 = var8[var5];
                if (param2[var6.field_p]) {
                  ((co) this).field_i = ((co) this).field_i + 1;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Password: ";
        field_q = "Concluded";
        field_r = "Ask to join <%0>'s game";
    }
}
