/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iaa {
    static String[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        kha var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 < -105) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            dea.field_n = 0;
            var1 = (kha) ((Object) iea.field_d.b((byte) 90));
            L2: while (true) {
              if (var1 == null) {
                break L0;
              } else {
                L3: {
                  if (-1 != (dga.field_a ^ -1)) {
                    break L3;
                  } else {
                    dea.field_n = dea.field_n + fw.field_h[var1.field_h].field_f * var1.field_g;
                    break L3;
                  }
                }
                var1 = (kha) ((Object) iea.field_d.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "iaa.M(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, eaa param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param0 -= 8;
              var6 = (lh) ((Object) param5.b((byte) 90));
              var7 = 0;
              if (param3 < -82) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L3: {
                  if ((var6.field_h ^ -1) > -1) {
                    L4: {
                      var8 = (326565 * var6.field_h + 8357 * var6.field_i & 630) + (var6.field_o >> -1742503327);
                      if (var8 <= 256) {
                        break L4;
                      } else {
                        var8 = 256;
                        break L4;
                      }
                    }
                    iga.field_a[2 + var7 % 7].a((var6.field_i * param1 >> 1851439184) + (param4 - 32), param0 - (((var6.field_h - var6.field_q) * param1 >> -940705200) + 2 - -32), var6.field_o);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6 = (lh) ((Object) param5.c(0));
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6_ref);

            stackIn_13_1 = new StringBuilder().append("iaa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            var9_int = param4 + param6.field_t - -param2 - param3;
            var10 = param2 + (param4 + param6.field_t - -param8);
            var11 = param6.field_u - -param0 - -(param6.field_p >> -1647222847);
            dg.c(var9_int, 0, var10, param5 + var11);
            param6.d(-1 + param4, -1 + param0, param1);
            param6.d(-1 + param4, param0 + 1, param1);
            dg.b(ie.field_b);
            dg.c(var9_int - -1, 0, var10 - -1, var11 + param5);
            param6.d(param4 + 1, -1 + param0, param1);
            param6.d(1 + param4, param0 - -1, param1);
            dg.b(ie.field_b);
            var9_int = -param8 + (-param2 + param4) + param6.field_t + param6.field_q;
            var10 = -param3 + (param6.field_q + param6.field_t - -param4 + -param2);
            dg.c(var9_int, var11 - param5, var10, 480);
            param6.d(-1 + param4, param0 + -1, param1);
            param6.d(-1 + param4, param0 - -1, param1);
            dg.b(ie.field_b);
            dg.c(var9_int + 1, -param5 + var11, var10 + 1, 480);
            param6.d(param4 + 1, -1 + param0, param1);
            if (param7 != -3702) {
                field_a = false;
            }
            param6.d(1 + param4, 1 + param0, param1);
            dg.b(ie.field_b);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iaa.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > 85) {
            return;
        }
        eaa var2 = (eaa) null;
        iaa.a(83, -61, 60, (byte) -114, 105, (eaa) null);
    }

    static {
        field_a = true;
    }
}
