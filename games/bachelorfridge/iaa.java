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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            param0 -= 8;
            var6_ref = (lh) (Object) param5.b((byte) 90);
            var7 = 0;
            L1: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L2: {
                  if (var6_ref.field_h < 0) {
                    L3: {
                      var8 = (326565 * var6_ref.field_h + 8357 * var6_ref.field_i & 630) + (var6_ref.field_o >> 1);
                      if (var8 <= 256) {
                        break L3;
                      } else {
                        var8 = 256;
                        break L3;
                      }
                    }
                    iga.field_a[2 + var7 % 7].a((var6_ref.field_i * 20 >> 16) + (param4 - 32), param0 - (((var6_ref.field_h - var6_ref.field_q) * 20 >> 16) + 34), var6_ref.field_o);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6_ref = (lh) (Object) param5.c(0);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("iaa.K(").append(param0).append(44).append(20).append(44).append(65280).append(44).append(-101).append(44).append(param4).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9_int = param4 + param6.field_t - -param2;
            var10 = param2 + (param4 + param6.field_t - -30);
            var11 = param6.field_u - -param0 - -(param6.field_p >> 1);
            dg.c(var9_int, 0, var10, var11);
            param6.d(-1 + param4, -1 + param0, 80);
            param6.d(-1 + param4, param0 + 1, 80);
            dg.b(ie.field_b);
            dg.c(var9_int - -1, 0, var10 - -1, var11);
            param6.d(param4 + 1, -1 + param0, 80);
            param6.d(1 + param4, param0 - -1, 80);
            dg.b(ie.field_b);
            var9_int = -30 + (-param2 + param4) + param6.field_t + param6.field_q;
            var10 = param6.field_q + param6.field_t - -param4 + -param2;
            dg.c(var9_int, var11, var10, 480);
            param6.d(-1 + param4, param0 + -1, 80);
            param6.d(-1 + param4, param0 - -1, 80);
            dg.b(ie.field_b);
            dg.c(var9_int + 1, var11, var10 + 1, 480);
            param6.d(param4 + 1, -1 + param0, 80);
            param6.d(1 + param4, 1 + param0, 80);
            dg.b(ie.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("iaa.N(").append(param0).append(44).append(80).append(44).append(param2).append(44).append(0).append(44).append(param4).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -3702 + 44 + 30 + 41);
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
