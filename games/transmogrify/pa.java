/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa implements ui {
    private int field_i;
    private int field_j;
    private kg field_g;
    private int field_b;
    private int field_f;
    private int field_d;
    static boolean[] field_h;
    private int field_c;
    private int field_e;
    static String field_a;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wh var15 = null;
        qg stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        qg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof wh) {
                stackOut_2_0 = (qg) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (qg) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (wh) (Object) stackIn_3_0;
              var8 = 6 % ((param3 - 51) / 47);
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              sb.a(param4.field_p + param0, param4.field_n + param1, param4.field_l, param4.field_h, ((pa) this).field_j);
              var7 = var15.field_H + (param0 - -param4.field_p);
              var9 = var15.field_G + (param4.field_n + param1);
              sb.c(var7, var9, var15.field_A, ((pa) this).field_d);
              if (-1 != var15.field_D) {
                var10 = (double)var15.field_D * 3.141592653589793 * 2.0 / (double)var15.field_C;
                var12 = (int)(-Math.sin(var10) * (double)var15.field_A);
                var13 = (int)(Math.cos(var10) * (double)var15.field_A);
                sb.c(var12 + var7, var13 + var9, 1, ((pa) this).field_c);
                break L3;
              } else {
                break L3;
              }
            }
            sb.c(var7, var9, 2, 1);
            var10 = 3.141592653589793 * (double)var15.field_B * 2.0 / (double)var15.field_C;
            var12 = (int)(-Math.sin(var10) * (double)var15.field_A);
            var13 = (int)(Math.cos(var10) * (double)var15.field_A);
            sb.e(var7, var9, var7 + var12, var9 - -var13, 1);
            if (((pa) this).field_g != null) {
              var14 = var15.field_A + var15.field_H - -((pa) this).field_e;
              int discarded$1 = ((pa) this).field_g.a(param4.field_k, var14 + param4.field_p + param0, ((pa) this).field_f + (param4.field_n + param1), -((pa) this).field_e - (var14 - param4.field_l), -(((pa) this).field_e << 1) + param4.field_h, ((pa) this).field_i, ((pa) this).field_b, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 <= -45) {
          if (gl.field_y >= 10) {
            if (bi.field_L < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = null;
          if (gl.field_y >= 10) {
            if (bi.field_L < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_a = null;
        field_h = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var9_int = param7 + jk.field_x.a(true);
              if (param6 <= oa.field_j) {
                if (param6 - -param4 > oa.field_j) {
                  if (param0 <= bk.field_a) {
                    if (bk.field_a < var9_int + param0) {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L1;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_10_0 = stackOut_5_0;
                    break L1;
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_10_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_10_0 = stackOut_1_0;
                break L1;
              }
            }
            var10 = stackIn_10_0;
            jk.a(param2, param4, param3, param5, param0, var10 != 0, param1, param6, param8, (byte) 88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("pa.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    pa(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((pa) this).field_e = param1;
            ((pa) this).field_i = param3;
            ((pa) this).field_c = param6;
            ((pa) this).field_f = param2;
            ((pa) this).field_g = param0;
            ((pa) this).field_j = param7;
            ((pa) this).field_b = param4;
            ((pa) this).field_d = param5;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play the game without logging in just yet";
    }
}
