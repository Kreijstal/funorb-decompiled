/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iaa {
    static String[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        kha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 < -105) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            dea.field_n = 0;
            var1 = (kha) (Object) iea.field_d.b((byte) 90);
            L2: while (true) {
              if (var1 == null) {
                break L0;
              } else {
                L3: {
                  if (dga.field_a != 0) {
                    break L3;
                  } else {
                    dea.field_n = dea.field_n + fw.field_h[var1.field_h].field_f * var1.field_g;
                    break L3;
                  }
                }
                var1 = (kha) (Object) iea.field_d.c(0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "iaa.M(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, eaa param5) {
        RuntimeException var6 = null;
        lh var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param0 -= 8;
              var6_ref = (lh) (Object) param5.b((byte) 90);
              var7 = 0;
              if (param3 < -82) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            L2: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L3: {
                  if (var6_ref.field_h < 0) {
                    L4: {
                      var8 = (326565 * var6_ref.field_h + 8357 * var6_ref.field_i & 630) + (var6_ref.field_o >> 1);
                      if (var8 <= 256) {
                        break L4;
                      } else {
                        var8 = 256;
                        break L4;
                      }
                    }
                    iga.field_a[2 + var7 % 7].a((var6_ref.field_i * param1 >> 16) + (param4 - 32), param0 - (((var6_ref.field_h - var6_ref.field_q) * param1 >> 16) + 34), var6_ref.field_o);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_ref = (lh) (Object) param5.c(0);
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("iaa.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9_int = param4 + param6.field_t - -param2 - param3;
              var10 = param2 + (param4 + param6.field_t - -30);
              var11 = param6.field_u - -param0 - -(param6.field_p >> 1);
              dg.c(var9_int, 0, var10, param5 + var11);
              param6.d(-1 + param4, -1 + param0, param1);
              param6.d(-1 + param4, param0 + 1, param1);
              dg.b(ie.field_b);
              dg.c(var9_int - -1, 0, var10 - -1, var11 + param5);
              param6.d(param4 + 1, -1 + param0, param1);
              param6.d(1 + param4, param0 - -1, param1);
              dg.b(ie.field_b);
              var9_int = -30 + (-param2 + param4) + param6.field_t + param6.field_q;
              var10 = -param3 + (param6.field_q + param6.field_t - -param4 + -param2);
              dg.c(var9_int, var11 - param5, var10, 480);
              param6.d(-1 + param4, param0 + -1, param1);
              param6.d(-1 + param4, param0 - -1, param1);
              dg.b(ie.field_b);
              dg.c(var9_int + 1, -param5 + var11, var10 + 1, 480);
              param6.d(param4 + 1, -1 + param0, param1);
              if (param7 == -3702) {
                break L1;
              } else {
                field_a = false;
                break L1;
              }
            }
            param6.d(1 + param4, 1 + param0, param1);
            dg.b(ie.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("iaa.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param7 + 44 + 30 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
