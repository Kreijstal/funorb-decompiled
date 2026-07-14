/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static mf field_c;
    static String field_b;
    static jp[][] field_a;

    final static void a(int param0, int param1, int param2, int param3, dh param4, int param5, int param6, int param7, int param8, int param9, jp[] param10, dh param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, jp[] param19, jp[] param20) {
        if (param7 != -111) {
          field_a = null;
          pa.a(param6, param18, param15, param4, param3, param5, param13, new ta(param10), param1, param14, param12, param9, param0, new ta(param19), param2, param8, param11, new ta(param20), param16, param17, 10);
          return;
        } else {
          pa.a(param6, param18, param15, param4, param3, param5, param13, new ta(param10), param1, param14, param12, param9, param0, new ta(param19), param2, param8, param11, new ta(param20), param16, param17, 10);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_a = null;
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, jp param1, int param2, int param3, j param4) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        jp var9 = null;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0;
        int stackOut_3_0;
        if (param0 <= -13) {
          L0: {
            var5 = param4.field_P;
            if (var5 >= 96) {
              stackOut_4_0 = 96;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = var5;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var6 = stackIn_5_0;
          var5 -= 50;
          lb.d(7, 7, param2, param3, 0, var6);
          if (var5 <= 0) {
            return;
          } else {
            L1: {
              var7 = 250.0 * Math.abs(Math.cos((double)var5 * 0.1)) * Math.exp((double)(-var5) / 40.0);
              if ((var5 ^ -1) > -111) {
                break L1;
              } else {
                var7 = 0.0;
                break L1;
              }
            }
            L2: {
              var9 = nl.field_b;
              var9.c((-var9.field_x + param2) / 2 + 7, -(int)var7 + 125);
              if ((var5 ^ -1) >= -96) {
                break L2;
              } else {
                L3: {
                  var10 = -95 + var5;
                  if (96 >= var10) {
                    break L3;
                  } else {
                    var10 = 96;
                    break L3;
                  }
                }
                param1.b(7 - -((-param1.field_x + param2) / 2), 260, var10 * 256 / 96);
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, oi param1, int param2, boolean param3) {
        if (!param3) {
            return -123;
        }
        return ln.a(param1.field_b, param0, true, param2);
    }

    final static dj a(byte param0) {
        Object var2 = null;
        if (param0 < 105) {
          var2 = null;
          int discarded$2 = ja.a(64, (oi) null, 69, false);
          return (dj) (Object) new cg();
        } else {
          return (dj) (Object) new cg();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try again";
    }
}
