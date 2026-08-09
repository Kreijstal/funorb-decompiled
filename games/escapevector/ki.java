/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends r {
    private int field_F;
    private String field_G;
    private int field_K;
    static om field_H;
    private int field_D;
    private boolean field_E;
    private wl field_L;
    static int[] field_M;
    static String field_I;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 10592) {
                break L1;
              } else {
                ki.l(-55);
                break L1;
              }
            }
            stackIn_3_0 = wk.field_e.a(param1 ^ -10596, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ki.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void l(int param0) {
        field_M = null;
        field_H = null;
        if (param0 < 67) {
            field_M = (int[]) null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    final String d(int param0) {
        int var2 = this.field_C.field_u ? 1 : 0;
        this.field_C.field_u = this.field_u;
        String var3 = this.field_C.d(param0);
        this.field_C.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_6_0 = 0;
        wl stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        int stackIn_8_6;
        int stackIn_8_7;
        wl stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        var5 = this.field_k - -param3;
        var6 = this.field_j - -param0;
        super.a(param0, (byte) 114, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          L0: {
            if (!this.field_E) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              stackIn_6_0 = this.field_g - (this.field_D + this.field_K * 2);
              break L0;
            }
          }
          L1: {
            var7 = stackIn_6_0;
            stackIn_8_0 = this.field_L;

            stackIn_8_1 = this.field_G;

            stackIn_8_2 = this.field_K + var5 + var7;

            stackIn_8_3 = var6 + this.field_K;

            stackIn_8_4 = -this.field_K + this.field_D;

            stackIn_8_5 = -(this.field_K * 2) + this.field_x;

            stackIn_8_6 = this.field_F;

            stackIn_8_7 = -1;

            if (!this.field_E) {
              stackIn_9_0 = (wl) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 2;
              break L1;
            } else {
              stackIn_9_0 = (wl) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 0;
              break L1;
            }
          }
          ((wl) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, this.field_L.field_r);
          if (param1 < 85) {
            this.field_E = false;
            return;
          } else {
            return;
          }
        }
    }

    ki(int param0, int param1, int param2, int param3, hm param4, boolean param5, int param6, int param7, wl param8, int param9, String param10) {
        super(param0, param1, param2, param3, (db) null, (wn) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_C = param4;
              this.field_D = param6;
              this.field_F = param9;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ki) (this)).field_E = stackIn_4_1 != 0;
              this.field_K = param7;
              this.field_L = param8;
              this.field_G = param10;
              var12_int = -this.field_K + this.field_D;
              var13 = this.field_L.b(param10, var12_int, this.field_L.field_r) - -(2 * this.field_K);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(param2, param1, param0, true, var13);
                break L2;
              }
            }
            L3: {
              if (this.field_E) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 2 * this.field_K + this.field_D;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_C.a(-(3 * this.field_K) + (-this.field_D + param2), this.field_K + (var13 - param3 >> -155884159), var14, true, param3 + -(2 * this.field_K));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ki.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_H = new om(10, 2, 2, 0);
        field_M = new int[]{-1, -1, -1, 0};
        field_I = "Container not retrieved - restarting";
    }
}
