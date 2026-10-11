/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class hi extends fj {
    private int field_z;
    private qi field_V;
    private hj field_P;
    private int field_E;
    private hj field_cb;
    private int field_U;
    static int[] field_W;
    private int field_eb;
    private int field_J;
    private boolean field_G;
    private hj[] field_Z;
    private boolean field_O;
    private boolean field_db;
    private hj field_K;
    private int field_S;
    private boolean field_C;
    private boolean field_M;
    private int field_w;
    private hj field_F;
    private hj[] field_Q;
    private String field_bb;
    private hj[] field_B;
    private int field_A;
    private hj field_R;
    private int field_T;
    private int field_y;
    private int field_H;
    private int field_D;
    private int field_t;
    private String field_u;
    static hj field_N;
    private boolean field_ab;
    private int field_fb;
    private hj[] field_Y;
    private int field_I;
    private int field_L;
    private int field_X;
    private hj[] field_v;
    private int field_x;

    final static hj a(int param0, byte param1, int param2) {
        hj var3;
        int var4;
        int var5;
        hj var3Lifetime1;
        var5 = HoldTheLine.field_D;
        var3 = (hj) (hf.field_j.b((byte) 126));
        while (var3 != null) {
          if (var3.field_s == param0 &&
            param2 == var3.field_y) {
            return var3;
          }
          var3 = (hj) (hf.field_j.c((byte) 114));
        }
        var3Lifetime1 = new hj(param0, param2);
        var4 = param0 * param2;
        while (0 < var4) {
          var4--;
          var3Lifetime1.field_z[var4] = 1;
        }
        vb.a(-74, var3Lifetime1);
        if (param1 > -37) {
          return (hj) null;
        }
        if (128 < param2) {
          ra.field_hb.a(param0 - 128 >> 1, -128 + param2 >> 1);
        } else {
          ra.field_hb.d(-(param2 * 3 / 4) + param0 >> 1, 0, 3 * param2 / 4, param2);
        }
        hf.field_j.a((byte) -121, var3Lifetime1);
        ug.b(-1);
        return var3Lifetime1;
    }

    public static void c(byte param0) {
        int var1 = -105 % ((param0 - 37) / 49);
        field_N = null;
        field_W = null;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2, int param3) {
        java.awt.Graphics var4 = null;
        if (!param2) {
          hi.c((byte) -49);
        }
        try {
          var4 = param0.getGraphics();
          b.field_c.a(param1, param3, var4, 34);
          var4.dispose();
        } catch (Exception exception) {
          param0.repaint();
        }
    }

    final static void a(hj[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return;
          }
          if (param3 > 0 &&
            param1 > 0) {
            if (param0[3] == null) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param0[3].field_o;
            }
            var6_int = stackIn_9_0;
            if (param0[5] == null) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param0[5].field_o;
            }
            var7 = stackIn_12_0;
            if (null == param0[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param0[1].field_v;
            }
            var8 = stackIn_15_0;
            if (param0[7] != null) {
              stackIn_18_0 = param0[7].field_v;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param4 + param3;
            var11 = param5 + param1;
            var12 = param4 + var6_int;
            if (!param2) {
              return;
            }
            var13 = var10 - var7;
            var14 = var8 + param5;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 + var6_int * param3 / (var6_int + var7);
              var16 = param4 + var6_int * param3 / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            tc.b(bj.field_L);
            if (var19 < var18) {
              var19 = param1 * var8 / (var8 + var9) + param5;
              var18 = param1 * var8 / (var8 + var9) + param5;
            }
            if (null != param0[0]) {
              tc.e(param4, param5, var16, var18);
              param0[0].a(param4, param5);
              tc.a(bj.field_L);
            }
            if (null != param0[2]) {
              tc.e(var17, param5, var10, var18);
              param0[2].a(var13, param5);
              tc.a(bj.field_L);
            }
            if (null != param0[6]) {
              tc.e(param4, var19, var16, var11);
              param0[6].a(param4, var15);
              tc.a(bj.field_L);
            }
            if (null != param0[8]) {
              tc.e(var17, var19, var10, var11);
              param0[8].a(var13, var15);
              tc.a(bj.field_L);
            }
            if (null != param0[1] &&
              param0[1].field_o != 0) {
              tc.e(var16, param5, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param0[1].field_o) {
                param0[1].a(var20, param5);
              }
              tc.a(bj.field_L);
            }
            if (null != param0[7] &&
              param0[7].field_o != 0) {
              tc.e(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param0[7].field_o) {
                param0[7].a(var20Lifetime1, var15);
              }
              tc.a(bj.field_L);
            }
            if (null != param0[3] &&
              0 != param0[3].field_v) {
              tc.e(param4, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param0[3].field_v) {
                param0[3].a(param4, var20Lifetime2);
              }
              tc.a(bj.field_L);
            }
            if (param0[5] != null &&
              0 != param0[5].field_v) {
              tc.e(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param0[5].field_v) {
                param0[5].a(var13, var20Lifetime3);
              }
              tc.a(bj.field_L);
            }
            if (param0[4] != null &&
              param0[4].field_o != 0 &&
              0 != param0[4].field_v) {
              tc.e(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].field_v) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].field_o) {
                  param0[4].a(var21, var20Lifetime4);
                }
              }
              tc.a(bj.field_L);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("hi.N(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    hi(long param0, hi param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static ie a(int param0, int param1) {
        ie var2 = null;
        if (param1 < -51) {
          var2 = new ie();
          oc.field_d.a((byte) -104, var2);
          q.a(param0, 51);
          return var2;
        }
        return (ie) null;
    }

    private final void a(hi param0, int param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (null != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (!param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (null != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (param0.field_Y != null) {
              this.field_Y = param0.field_Y;
            }
            if (-2147483648 != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (256 != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_H != 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_eb != 0) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_z >= 0) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_t >= 0) {
              this.field_t = param0.field_t;
            }
            if (param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (param0.field_T != 0) {
              this.field_T = param0.field_T;
            }
            if (param0.field_y != -2147483648) {
              this.field_y = param0.field_y;
            }
            if (param0.field_S != 0) {
              this.field_S = param0.field_S;
            }
            if (param0.field_X >= 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_A != 0) {
              this.field_A = param0.field_A;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (-2147483648 != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (param0.field_P != null) {
              this.field_P = param0.field_P;
            }
            if (param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_L >= 0) {
              this.field_L = param0.field_L;
            }
            if (param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (param0.field_E != -2147483648) {
              this.field_E = param0.field_E;
            }
            if (param0.field_B != null) {
              this.field_B = param0.field_B;
            }
            if (param0.field_K != null) {
              this.field_K = param0.field_K;
            }
            if (-2147483648 != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (-2147483648 != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_I != 0) {
              this.field_I = param0.field_I;
            }
            if (null != param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (param0.field_bb != null) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_Q != null) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_fb != 0) {
              this.field_fb = param0.field_fb;
            }
          }
          var3_int = 32 % ((38 - param1) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("hi.O(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    final static float a(int param0, float param1, int param2, wd[] param3, int param4, qm param5, int param6) {
        int var8 = 0;
        float stackIn_8_0 = 0.0f;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        float stackIn_36_0 = 0.0f;
        float stackIn_45_0 = 0.0f;
        float stackIn_48_0 = 0.0f;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var9 = 0;
        wd var10 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        Object var20 = null;
        hn var20_ref = null;
        Object var21 = null;
        dd var21_ref = null;
        var20 = null;
        var21 = null;
        var19 = HoldTheLine.field_D;
        try {
          if (param2 == 0) {
            param0 = param0 * 2;
          }
          var7_int = (int)param1;
          param0++;
          if (param0 > param3.length) {
            param0 = param3.length;
          }
          if (param4 != -24659) {
            stackIn_8_0 = 1.185455083847046f;
            return stackIn_8_0;
          }
          for (var8 = 0; param0 > var8; var8++) {
            stackIn_13_0 = var7_int;
            if (0 == param2) {
              if (var8 % 2 != 1) {
                stackIn_16_1 = -(var8 / 2);
              } else {
                stackIn_16_1 = (1 + var8) / 2;
              }
            } else {
              stackIn_16_1 = param2 * var8;
            }
            var9 = stackIn_13_0 + stackIn_16_1;
            if (param3.length <= var9) {
              var9 = var9 - param3.length;
            }
            if (var9 < 0) {
              var9 = var9 + param3.length;
            }
            var10 = param3[var9];
            if (-var10.field_k + param6 <= 1 &&
              -1 <= param6 - var10.field_k) {
              if (var10 instanceof dd) {
                var21_ref = (dd) (var10);
                var12 = (float)(param5.field_h - var21_ref.field_R.field_h);
                var13 = (float)(-var21_ref.field_R.field_f + param5.field_f);
                var14 = var21_ref.field_B * var12 - var13 * var21_ref.field_D;
                if (!(0.0f > var14) &&
                  !(var21_ref.field_J < var14)) {
                  var15 = var14 / var21_ref.field_J;
                  var16 = var12 * var21_ref.field_D + var13 * var21_ref.field_B;
                  var17 = (float)var21_ref.d(var15, 0);
                  var18 = (float)var21_ref.c(96, var15);
                  if (var17 <= var16 &&
                    var16 <= var18) {
                    stackIn_45_0 = var15 + (float)var9;
                    return stackIn_45_0;
                  }
                }
              } else {
                var20_ref = (hn) (var10);
                var12 = (float)(-var20_ref.field_U.field_h + param5.field_h);
                var13 = (float)(-var20_ref.field_U.field_f + param5.field_f);
                var14 = (float)var20_ref.field_D;
                var15 = (float)var20_ref.field_R;
                if (var20_ref.field_E > var20_ref.field_I) {
                  var15 = (float)var20_ref.field_D;
                  var14 = (float)var20_ref.field_R;
                }
                var16 = var12 * var12 + var13 * var13;
                if (!(var16 < var14 * var14) &&
                  !(var16 > var15 * var15)) {
                  var17 = ha.a(var20_ref.field_U, param5, false);
                  var18 = var20_ref.a(var17, (byte) 72);
                  if (var18 >= 0.0f &&
                    1.0f >= var18) {
                    stackIn_36_0 = var18 + (float)var9;
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
          stackIn_48_0 = -1.0f;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_51_0 = var7;
          stackIn_51_1 = new StringBuilder().append("hi.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean b(int param0, byte param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (rd.field_e.field_l >= param0) {
            return true;
          }
          if (null == lk.field_h) {
            return false;
          }
          try {
            if (param1 != 40) {
              field_W = (int[]) null;
            }
            var2_int = lk.field_h.b(false);
            if (var2_int > 0) {
              if (var2_int > param0 - rd.field_e.field_l) {
                var2_int = -rd.field_e.field_l + param0;
              }
              lk.field_h.a(rd.field_e.field_i, var2_int, rd.field_e.field_l, 125);
              cm.field_b = bb.b(-1);
              rd.field_e.field_l = rd.field_e.field_l + var2_int;
              if (param0 > rd.field_e.field_l) {
                return false;
              }
              rd.field_e.field_l = 0;
              return true;
            }
            if (var2_int >= 0 &&
              sf.d(101) <= 30000L) {
              return false;
            }
            r.a(-28036);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            r.a(-28036);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(long param0, hi param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_G = true;
        this.field_J = -2147483648;
        this.field_U = -2147483648;
        this.field_C = false;
        this.field_w = 256;
        this.field_y = -2147483648;
        this.field_D = -2147483648;
        this.field_z = -1;
        this.field_E = -2147483648;
        this.field_t = -1;
        this.field_X = -1;
        this.field_L = -1;
        this.field_x = -2147483648;
        try {
          this.field_f = param0;
          this.a(param1, -114);
          if (param6 != null) {
            this.field_bb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_W = new int[4];
    }
}
