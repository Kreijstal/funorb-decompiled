/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    final static void a(boolean param0, int param1, db[] param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (-1 > (param4 ^ -1)) {
                  if (param0) {
                    var5_int = param2[0].field_r;
                    var6 = param2[2].field_r;
                    var7 = param2[1].field_r;
                    param2[0].d(param3, param1);
                    param2[2].d(-var6 + param3 - -param4, param1);
                    lf.b(uh.field_C);
                    lf.f(var5_int + param3, param1, param4 + (param3 + -var6), param1 + param2[1].field_x);
                    var8 = var5_int + param3;
                    var9 = param4 + (param3 + -var6);
                    param3 = var8;
                    L2: while (true) {
                      if (param3 >= var9) {
                        lf.a(uh.field_C);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param2[1].d(param3, param1);
                        param3 = param3 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ac.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
            ac.a(true, 32, true, true);
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
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
            field_a = (String) null;
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
        field_a = "Names cannot start or end with space or underscore";
    }
}
