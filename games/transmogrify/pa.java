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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof wh) {
                stackIn_3_0 = (qg) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var15 = (wh) ((Object) stackIn_3_0);
              var8 = 6 % ((param3 - 51) / 47);
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              sb.a(param4.field_p + param0, param4.field_n + param1, param4.field_l, param4.field_h, this.field_j);
              var7 = var15.field_H + (param0 - -param4.field_p);
              var9 = var15.field_G + (param4.field_n + param1);
              sb.c(var7, var9, var15.field_A, this.field_d);
              if (-1 != var15.field_D) {
                var10 = (double)var15.field_D * 3.141592653589793 * 2.0 / (double)var15.field_C;
                var12 = (int)(-Math.sin(var10) * (double)var15.field_A);
                var13 = (int)(Math.cos(var10) * (double)var15.field_A);
                sb.c(var12 + var7, var13 + var9, 1, this.field_c);
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
            if (this.field_g != null) {
              var14 = var15.field_A + var15.field_H - -this.field_e;
              this.field_g.a(param4.field_k, var14 + param4.field_p + param0, this.field_f + (param4.field_n + param1), -this.field_e - (var14 - param4.field_l), -(this.field_e << 169330433) + param4.field_h, this.field_i, this.field_b, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 <= -45) {
          if ((gl.field_y ^ -1) <= -11) {
            if (bi.field_L < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = (String) null;
          if ((gl.field_y ^ -1) <= -11) {
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
        int var1 = -3 % ((param0 - -60) / 60);
        field_a = null;
        field_h = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9_int = param7 + jk.field_x.a(true);
              if (param6 <= oa.field_j) {
                if (param6 - -param4 > oa.field_j) {
                  if (param0 <= bk.field_a) {
                    if (bk.field_a < var9_int + param0) {
                      stackIn_10_0 = 1;
                      break L1;
                    } else {
                      stackIn_10_0 = 0;
                      break L1;
                    }
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_10_0 = 0;
                  break L1;
                }
              } else {
                stackIn_10_0 = 0;
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
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("pa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    pa(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_e = param1;
            this.field_i = param3;
            this.field_c = param6;
            this.field_f = param2;
            this.field_g = param0;
            this.field_j = param7;
            this.field_b = param4;
            this.field_d = param5;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_a = "Play the game without logging in just yet";
    }
}
