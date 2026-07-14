/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static int[] field_g;
    static String field_c;
    r field_i;
    String field_a;
    String field_e;
    static int field_d;
    String field_f;
    static fe field_h;
    int field_b;

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte[] param2, int param3, int param4, byte param5, ed param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Vertigo2.field_L ? 1 : 0;
          var7 = g.a(param4, param5 + -25412);
          if (null != sd.field_O) {
            break L0;
          } else {
            sd.field_O = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if ((var9 ^ -1) <= -5) {
            L2: {
              if (param5 == 63) {
                break L2;
              } else {
                field_g = null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == kh.field_b) {
                  break L4;
                } else {
                  if (kh.field_b.field_p.length >= var7) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              kh.field_b = new ed(var7);
              break L3;
            }
            L5: {
              L6: {
                kh.field_b.field_u = 0;
                kh.field_b.a(param3, param5 ^ -10149, param2, param4);
                kh.field_b.h(var7, 2);
                kh.field_b.a(var15, -12257);
                if (null == hh.field_b) {
                  break L6;
                } else {
                  if (100 <= hh.field_b.field_p.length) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              hh.field_b = new ed(100);
              break L5;
            }
            hh.field_b.field_u = 0;
            hh.field_b.f(10, 79);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (-5 >= (var11 ^ -1)) {
                hh.field_b.d(param4, param5 + -1846);
                hh.field_b.a(param0, param1, 9157);
                param6.a(0, -10140, hh.field_b.field_p, hh.field_b.field_u);
                param6.a(0, param5 + -10203, kh.field_b.field_p, kh.field_b.field_u);
                return;
              } else {
                hh.field_b.e(var15[var11], 0);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = sd.field_O.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 < 47) {
            int discarded$0 = qp.a(-86, 78);
        }
        param0 = param0 | param0 >>> -1173735839;
        param0 = param0 | param0 >>> -45926590;
        param0 = param0 | param0 >>> -1784525180;
        param0 = param0 | param0 >>> -1067875864;
        param0 = param0 | param0 >>> 1969021232;
        return param0 + 1;
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        if (param0 != -19721) {
            int discarded$0 = qp.a(52, -56);
        }
        field_h = null;
    }

    private qp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
