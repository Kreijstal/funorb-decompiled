/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    int[] field_G;
    int[][] field_w;
    int field_h;
    int field_m;
    int[] field_k;
    boolean[] field_B;
    byte field_j;
    int field_p;
    int[][] field_r;
    byte[] field_E;
    int[] field_c;
    boolean[] field_v;
    byte[] field_D;
    int field_e;
    byte[] field_d;
    int[][] field_i;
    byte[][] field_g;
    int[] field_u;
    int field_A;
    byte[] field_f;
    byte[] field_y;
    int field_l;
    int field_x;
    static ci field_s;
    int field_b;
    int field_q;
    static ci[] field_a;
    int field_o;
    int field_C;
    int field_H;
    byte[] field_F;
    int field_n;
    int field_z;
    int field_t;

    public static void a(byte param0) {
        int var1 = -73 / ((param0 - 3) / 61);
        field_a = null;
        field_s = null;
    }

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 > 40) {
                break L1;
              } else {
                field_s = (ci) null;
                break L1;
              }
            }
            stackOut_2_0 = vc.field_f.a(param3, param4, param5 + -24, param2 - param4, 480, param6, -1, 0, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        pl.field_P = param2;
        if (param3 != -83) {
            field_a = (ci[]) null;
        }
        eb.field_I = param0;
        ib.field_cb = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, boolean param11, int param12) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            var13_int = param9 & 16711935;
            var14 = param9 >> 268757576 & 255;
            param8 = -param2;
            L1: while (true) {
              if (param8 >= 0) {
                L2: {
                  if (param11) {
                    break L2;
                  } else {
                    var16 = (int[]) null;
                    kb.a(-123, (int[]) null, -30, -85, -53, -125, (int[]) null, 41, 37, -119, -27, true, -85);
                    break L2;
                  }
                }
                break L0;
              } else {
                param7 = -param10;
                L3: while (true) {
                  if (-1 >= (param7 ^ -1)) {
                    param4 = param4 + param5;
                    param12 = param12 + param0;
                    param8++;
                    continue L1;
                  } else {
                    L4: {
                      incrementValue$3 = param12;
                      param12++;
                      param3 = param1[incrementValue$3];
                      if (param3 == 0) {
                        param4++;
                        break L4;
                      } else {
                        if (param3 >> -692654072 != (param3 & 65535)) {
                          incrementValue$4 = param4;
                          param4++;
                          param6[incrementValue$4] = param3;
                          break L4;
                        } else {
                          param3 = param3 & 255;
                          incrementValue$5 = param4;
                          param4++;
                          param6[incrementValue$5] = dg.a(param3 * var14, 65280) + dg.a(var13_int * param3 >> 180975112, 16711935);
                          if (param6[-1 + param4] != 0) {
                            break L4;
                          } else {
                            param6[param4 + -1] = 1;
                            break L4;
                          }
                        }
                      }
                    }
                    param7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var13 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var13);
            stackOut_16_1 = new StringBuilder().append("kb.C(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param6 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    kb() {
        this.field_G = new int[257];
        this.field_r = new int[6][258];
        this.field_v = new boolean[16];
        this.field_d = new byte[18002];
        this.field_B = new boolean[256];
        this.field_f = new byte[256];
        this.field_k = new int[16];
        this.field_q = 0;
        this.field_y = new byte[4096];
        this.field_E = new byte[18002];
        this.field_u = new int[256];
        this.field_i = new int[6][258];
        this.field_g = new byte[6][258];
        this.field_w = new int[6][258];
        this.field_z = 0;
        this.field_c = new int[6];
    }

    static {
        field_a = new ci[4];
    }
}
