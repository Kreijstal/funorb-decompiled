/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    final static void a(boolean param0, int param1, db[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (-1 > (param4 ^ -1)) {
              if (!param0) {
                return;
              } else {
                var5 = param2[0].field_r;
                var6 = param2[2].field_r;
                var7 = param2[1].field_r;
                param2[0].d(param3, param1);
                param2[2].d(-var6 + param3 - -param4, param1);
                lf.b(uh.field_C);
                lf.f(var5 + param3, param1, param4 + (param3 + -var6), param1 + param2[1].field_x);
                var8 = var5 + param3;
                var9 = param4 + (param3 + -var6);
                param3 = var8;
                L1: while (true) {
                  if (param3 >= var9) {
                    lf.a(uh.field_C);
                    return;
                  } else {
                    param2[1].d(param3, param1);
                    param3 = param3 + var7;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
            String discarded$0 = ac.a(true, 32, true, true);
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 < -46) {
          L0: {
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param3) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0) {
            var4++;
            return ll.field_e[var4];
          } else {
            return ll.field_e[var4];
          }
        } else {
          L2: {
            field_a = null;
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param3) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param0) {
            return ll.field_e[var4];
          } else {
            var4++;
            return ll.field_e[var4];
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot start or end with space or underscore";
    }
}
