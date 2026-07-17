/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    final static void a(boolean param0, int param1, db[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param4 > 0) {
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
                        break L0;
                      } else {
                        param2[1].d(param3, param1);
                        param3 = param3 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ac.B(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
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
