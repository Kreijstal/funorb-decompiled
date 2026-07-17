/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    int field_H;
    int field_g;
    int field_N;
    boolean field_f;
    private bm field_lb;
    private boolean field_c;
    private int field_P;
    int field_z;
    int field_B;
    private hj field_R;
    private boolean field_b;
    ah field_W;
    int field_r;
    private int field_n;
    ah[] field_O;
    private int[] field_x;
    int field_h;
    private ue[] field_m;
    private int field_a;
    private ah field_Q;
    wd[] field_sb;
    ei field_nb;
    private int field_s;
    int field_y;
    ah[] field_M;
    int field_ab;
    private int field_o;
    private int field_D;
    static String field_Y;
    int field_p;
    private boolean field_kb;
    int field_l;
    static String field_K;
    private int field_F;
    private wb field_db;
    private int[] field_w;
    int field_mb;
    int field_J;
    int field_t;
    private float field_A;
    private int[] field_eb;
    private int[] field_u;
    int[] field_rb;
    private int[] field_V;
    ah field_cb;
    private int field_k;
    ja[] field_C;
    private int field_j;
    private byte field_L;
    private int field_bb;
    private boolean field_S;
    int field_hb;
    private int field_G;
    ah field_d;
    ah[] field_q;
    private hj field_I;
    static ah field_v;
    static String[][] field_gb;
    boolean field_U;
    private String[] field_ib;
    private ei field_jb;
    private boolean field_pb;
    private int field_fb;
    boolean field_E;
    boolean field_T;
    private int field_e;
    hj field_qb;
    private int field_tb;
    int field_ob;
    static String field_Z;
    sb[] field_i;
    private int field_X;

    private final void a(byte param0, int[] param1, vk param2) {
        try {
            IOException var4 = null;
            RuntimeException var4_ref = null;
            Object var5 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                {
                  L1: {
                    int discarded$2 = 32;
                    this.a(param2, param1);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref;
                stackOut_4_1 = new StringBuilder().append("sg.R(").append(7).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
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
              L3: {
                stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param2 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L3;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b() {
        int var3 = 0;
        int var2 = 0;
        int var6 = 0;
        int var4 = 0;
        int var5 = 0;
        int var8 = HoldTheLine.field_D;
        ((sg) this).field_I.field_z[0] = 1;
        int var7 = 307200;
        while (var7 > 0) {
            while (true) {
                var7--;
                var3 = ((sg) this).field_I.field_z[var7];
                if (((sg) this).field_I.field_z[var7] != 0) {
                    break;
                }
                tc.field_b[var7] = 0;
            }
            var2 = tc.field_b[var7];
            var6 = (var2 & 255) * (255 & var3);
            var4 = (255 & var3 >> 16) * (16711680 & var2);
            var5 = ((var3 & 65280) >> 8) * (var2 & 65280);
            tc.field_b[var7] = kc.a(kc.a(pk.a(var4, -16777216), pk.a(16711680, var5)), pk.a(65280, var6)) >>> 8;
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          var3_int = 0;
          L0: while (true) {
            if (~mm.field_a.length >= ~var3_int) {
              throw new RuntimeException();
            } else {
              if (param0.equals((Object) (Object) mm.field_a[var3_int].field_l)) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var3_int++;
                continue L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("sg.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + -118 + 41);
        }
    }

    private final void a(String param0) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((sg) this).field_ib) {
                  break L2;
                } else {
                  if (((sg) this).field_j < ((sg) this).field_ib.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = ((sg) this).field_j - -1;
              var4 = new String[var3_int];
              var5 = 0;
              L3: while (true) {
                if (var5 >= ((sg) this).field_j) {
                  ((sg) this).field_ib = var4;
                  break L1;
                } else {
                  var4[var5] = ((sg) this).field_ib[var5];
                  var5++;
                  continue L3;
                }
              }
            }
            int fieldTemp$2 = ((sg) this).field_j;
            ((sg) this).field_j = ((sg) this).field_j + 1;
            ((sg) this).field_ib[fieldTemp$2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("sg.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 53 + 41);
        }
    }

    private final void a(vk param0) {
        try {
            this.a(param0, 28978, false);
            int var3_int = -22;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sg.F(" + (param0 != null ? "{...}" : "null") + 44 + -77 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, wm param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int[] var11 = null;
        int var11_int = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[] var13_ref_int__ = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var15_int = 0;
        float var16 = 0.0f;
        int var16_int = 0;
        float var17 = 0.0f;
        int var17_int = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var18 = HoldTheLine.field_D;
        try {
          L0: {
            if (0 == (196608 & param4.field_J)) {
              var7_int = param4.field_A.field_h + -param0;
              var8 = param4.field_A.field_f + -param1;
              var9 = (float)Math.sqrt((double)(var7_int * var7_int + var8 * var8));
              var10 = var9 / (float)param2;
              if (2.0f > var10) {
                L1: {
                  var10 = 2.0f - var10;
                  if (var10 > 1.0f) {
                    var10 = 1.0f;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param4.field_E.field_d) {
                    L3: {
                      var20 = new int[16];
                      var11 = var20;
                      var12 = param4.field_w.field_j;
                      var13 = param4.field_w.field_g;
                      var14 = -var13;
                      var15 = var12;
                      var16 = (float)param4.field_E.field_m;
                      var17 = (float)param4.field_E.field_h;
                      nc.field_g = (int)((float)param4.field_A.field_h + var16 * var12 + var14 * var17);
                      rf.field_X = (int)(var16 * var13 + (float)param4.field_A.field_f + var15 * var17);
                      var8 = -param1 + rf.field_X;
                      var7_int = nc.field_g + -param0;
                      var20[0] = nc.field_g;
                      var20[1] = rf.field_X;
                      rf.field_X = rf.field_X + var8 / 4;
                      nc.field_g = nc.field_g + var7_int / 4;
                      var20[3] = rf.field_X;
                      var20[2] = nc.field_g;
                      rf.field_X = (int)(-(var13 * var16) + (float)param4.field_A.field_f + var15 * var17);
                      nc.field_g = (int)(var17 * var14 + (-(var16 * var12) + (float)param4.field_A.field_h));
                      var20[5] = rf.field_X;
                      var7_int = nc.field_g - param0;
                      var20[4] = nc.field_g;
                      var8 = rf.field_X + -param1;
                      rf.field_X = rf.field_X + var8 / 4;
                      nc.field_g = nc.field_g + var7_int / 4;
                      var20[6] = nc.field_g;
                      var20[7] = rf.field_X;
                      rf.field_X = (int)(-(var15 * var17) + ((float)param4.field_A.field_f - var13 * var16));
                      nc.field_g = (int)((float)param4.field_A.field_h - var16 * var12 - var14 * var17);
                      var7_int = nc.field_g + -param0;
                      var20[8] = nc.field_g;
                      var20[9] = rf.field_X;
                      var8 = -param1 + rf.field_X;
                      rf.field_X = rf.field_X + var8 / 4;
                      nc.field_g = nc.field_g + var7_int / 4;
                      var20[11] = rf.field_X;
                      var20[10] = nc.field_g;
                      rf.field_X = (int)(-(var15 * var17) + (var13 * var16 + (float)param4.field_A.field_f));
                      nc.field_g = (int)(-(var14 * var17) + (var16 * var12 + (float)param4.field_A.field_h));
                      var20[12] = nc.field_g;
                      var20[13] = rf.field_X;
                      var7_int = -param0 + nc.field_g;
                      var8 = rf.field_X + -param1;
                      rf.field_X = rf.field_X + var8 / 4;
                      nc.field_g = nc.field_g + var7_int / 4;
                      var20[14] = nc.field_g;
                      var20[15] = rf.field_X;
                      var11 = qk.a(var11, (byte) -113);
                      if (param5 > 256) {
                        param5 = 256;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (0 <= param5) {
                        break L4;
                      } else {
                        param5 = 0;
                        break L4;
                      }
                    }
                    dl.a(var11, (byte) -67, (int)(var10 * (float)param5), 0);
                    break L2;
                  } else {
                    L5: {
                      var11_int = param4.field_E.field_a / 2;
                      if (var11_int < 4) {
                        var11_int = 4;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var12 = (float)(6.283185307179586 / (double)var11_int);
                    var19 = new int[var11_int * 4];
                    var13_ref_int__ = var19;
                    var14 = 0.0f;
                    var15_int = 0;
                    L6: while (true) {
                      if (var11_int <= var15_int) {
                        L7: {
                          var13_ref_int__ = qk.a(var13_ref_int__, (byte) -121);
                          if (param5 <= 256) {
                            break L7;
                          } else {
                            param5 = 256;
                            break L7;
                          }
                        }
                        L8: {
                          if (0 > param5) {
                            param5 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        lj.a(0, (int)(var10 * (float)param5), 0, var13_ref_int__, (byte) -56, 0);
                        break L2;
                      } else {
                        var16_int = (int)((double)param4.field_A.field_h + (double)param4.field_E.field_a * Math.cos((double)var14));
                        var7_int = var16_int - param0;
                        var17_int = (int)((double)param4.field_A.field_f - (double)param4.field_E.field_a * Math.sin((double)var14));
                        var19[var15_int * 4] = var16_int;
                        var8 = var17_int - param1;
                        var19[var15_int * 4 + 1] = var17_int;
                        var13_ref_int__[2 + var15_int * 4] = var7_int / 4 + var16_int;
                        var13_ref_int__[3 + 4 * var15_int] = var8 / 4 + var17_int;
                        var14 = var14 + var12;
                        var15_int++;
                        continue L6;
                      }
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var7;
            stackOut_30_1 = new StringBuilder().append("sg.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(-35).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param5 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, wm param3, int param4, float param5) {
        RuntimeException var7 = null;
        ja var7_ref = null;
        int var8 = 0;
        int var9_int = 0;
        vf var9 = null;
        ja var10_ref_ja = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            var7_ref = ((sg) this).field_C[3 & param3.field_J];
            var8 = 0;
            var9_int = 0;
            L1: while (true) {
              if (var9_int >= ((sg) this).field_z) {
                L2: {
                  if (null == ih.field_n) {
                    break L2;
                  } else {
                    var9 = (vf) (Object) ih.field_n.b((byte) 125);
                    L3: while (true) {
                      if (var9 == null) {
                        break L2;
                      } else {
                        L4: {
                          mo.field_q.field_f = 12 + var9.field_i;
                          mo.field_q.field_h = 12 + var9.field_B;
                          var10 = mo.field_q.field_h - param3.field_A.field_h;
                          var11 = -param3.field_A.field_f + mo.field_q.field_f;
                          var12 = var11 * var11 + var10 * var10;
                          var13 = 6144;
                          if (~var13 < ~var12) {
                            var14 = (var13 * 2 + -var12) * 4096;
                            var10 = var14 * var10 / (var13 * 2);
                            var11 = var11 * var14 / (var13 * 2);
                            var9.a(var7_ref, var10, (byte) 24, var11);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var9 = (vf) (Object) ih.field_n.c((byte) -94);
                        continue L3;
                      }
                    }
                  }
                }
                stackOut_24_0 = var8;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L5: {
                  var10_ref_ja = ((sg) this).field_C[var9_int];
                  if (var10_ref_ja == null) {
                    break L5;
                  } else {
                    if (1 < -var10_ref_ja.field_q + param3.field_q) {
                      break L5;
                    } else {
                      if (-var10_ref_ja.field_q + param3.field_q < -1) {
                        break L5;
                      } else {
                        var11 = var10_ref_ja.field_A.field_h - param3.field_A.field_h;
                        var12 = -param3.field_A.field_f + var10_ref_ja.field_A.field_f;
                        var13 = 32 + param3.field_B + var10_ref_ja.field_B;
                        var14 = var11 * var11 + var12 * var12;
                        if (var14 < var13 * var13) {
                          L6: {
                            if (var10_ref_ja.field_rc != 0) {
                              break L6;
                            } else {
                              var8++;
                              break L6;
                            }
                          }
                          L7: {
                            var15 = (float)Math.sqrt((double)var14);
                            if (var15 >= (float)(var10_ref_ja.field_B - -param3.field_B)) {
                              break L7;
                            } else {
                              var15 = (float)(param3.field_B + var10_ref_ja.field_B);
                              break L7;
                            }
                          }
                          L8: {
                            var16 = 1.0f - ((float)(-param3.field_B) + (var15 - (float)var10_ref_ja.field_B)) / (float)64;
                            var17 = param5 * var16;
                            if (var10_ref_ja.field_J != 2) {
                              var18 = var10_ref_ja.field_C.field_l * var10_ref_ja.a((byte) 118, ek.field_c);
                              var19 = var17 / var18;
                              var20 = (float)(-param3.field_A.field_h + var10_ref_ja.field_A.field_h) / var15 * var19;
                              var21 = (float)(var10_ref_ja.field_A.field_f + -param3.field_A.field_f) / var15 * var19;
                              var10_ref_ja.field_t = var10_ref_ja.field_t + var20;
                              var10_ref_ja.field_x = var10_ref_ja.field_x + var21;
                              var10_ref_ja.field_j = ln.a(-29407, var17) * 5.0f;
                              var10_ref_ja.a(2, param2);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10_ref_ja.a(var16, 0, var7_ref, param1);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var7;
            stackOut_26_1 = new StringBuilder().append("sg.M(").append(-30808).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + 32 + 44 + param5 + 41);
        }
        return stackIn_25_0;
    }

    private final boolean a(byte param0, wm param1, ja param2) {
        int var4_int = 0;
        float var4_float = 0.0f;
        int var5 = 0;
        float var5_float = 0.0f;
        float var6 = 0.0f;
        oa var7 = null;
        int var8 = 0;
        ja stackIn_13_0 = null;
        ja stackIn_14_0 = null;
        ja stackIn_15_0 = null;
        ja stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        oa stackIn_26_0 = null;
        ja stackOut_12_0 = null;
        ja stackOut_13_0 = null;
        ja stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ja stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        oa stackOut_24_0 = null;
        oa stackOut_25_0 = null;
        var8 = HoldTheLine.field_D;
        int discarded$3 = 32758;
        if (im.a((ee) (Object) param2, (ee) (Object) param1)) {
          L0: {
            if (param0 < -86) {
              break L0;
            } else {
              ((sg) this).field_a = -68;
              break L0;
            }
          }
          if ((param1.field_J & 512) != 0) {
            L1: {
              L2: {
                var4_int = 3 & param1.field_J;
                if (-1 == ((sg) this).field_mb) {
                  break L2;
                } else {
                  if ((((sg) this).field_o & 4) != 0) {
                    break L1;
                  } else {
                    if (param2.field_W == null) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param2.c(3, var4_int)) {
                param1.d(0);
                if (param2.field_mc == 0) {
                  ((sg) this).field_rb[11] = -1;
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= 3) {
                      L4: {
                        if (((sg) this).field_rb[var4_int + 8] == 0) {
                          ((sg) this).field_rb[var4_int + 8] = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (0 != var4_int) {
                          break L5;
                        } else {
                          L6: {
                            if ((256 & ((sg) this).field_H) != 0) {
                              break L6;
                            } else {
                              ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 8);
                              ((sg) this).field_H = ((sg) this).field_H ^ 256;
                              break L6;
                            }
                          }
                          L7: {
                            if ((64 & ((sg) this).field_H) != 0) {
                              ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_p * ((sg) this).field_l << 6);
                              break L7;
                            } else {
                              ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 6);
                              break L7;
                            }
                          }
                          ((sg) this).field_H = ((sg) this).field_H ^ 64;
                          if ((64 & ((sg) this).field_H) == 64) {
                            L8: {
                              if ((((sg) this).field_H & 67108864) != 0) {
                                ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 26);
                                break L8;
                              } else {
                                ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_l * ((sg) this).field_p << 26);
                                break L8;
                              }
                            }
                            ((sg) this).field_H = ((sg) this).field_H ^ 67108864;
                            if (0 == (67108864 & ((sg) this).field_H)) {
                              L9: {
                                if ((((sg) this).field_H & 512) == 0) {
                                  ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_l * ((sg) this).field_p << 9);
                                  break L9;
                                } else {
                                  ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 9);
                                  break L9;
                                }
                              }
                              ((sg) this).field_H = ((sg) this).field_H ^ 512;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L10: {
                        if (var4_int != 1) {
                          break L10;
                        } else {
                          L11: {
                            if ((((sg) this).field_H & 524288) == 524288) {
                              ((sg) this).field_H = ((sg) this).field_H ^ 524288;
                              ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 19);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if ((((sg) this).field_H & 16777216) == 0) {
                              ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 24);
                              break L12;
                            } else {
                              ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 24);
                              break L12;
                            }
                          }
                          ((sg) this).field_H = ((sg) this).field_H ^ 16777216;
                          if ((16777216 & ((sg) this).field_H) == 16777216) {
                            L13: {
                              if ((((sg) this).field_H & 2097152) != 0) {
                                ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_p * ((sg) this).field_l << 21);
                                break L13;
                              } else {
                                ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 21);
                                break L13;
                              }
                            }
                            ((sg) this).field_H = ((sg) this).field_H ^ 2097152;
                            if (2097152 != (2097152 & ((sg) this).field_H)) {
                              break L10;
                            } else {
                              L14: {
                                if ((((sg) this).field_H & 2) != 0) {
                                  ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 1);
                                  break L14;
                                } else {
                                  ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 1);
                                  break L14;
                                }
                              }
                              ((sg) this).field_H = ((sg) this).field_H ^ 2;
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      L15: {
                        if (var4_int != 2) {
                          break L15;
                        } else {
                          L16: {
                            if (0 == (16 & ((sg) this).field_H)) {
                              ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_l * ((sg) this).field_p << 4);
                              ((sg) this).field_H = ((sg) this).field_H ^ 16;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if ((((sg) this).field_H & 1) != 0) {
                              ((sg) this).field_N = ((sg) this).field_N + ((sg) this).field_l * ((sg) this).field_p;
                              break L17;
                            } else {
                              ((sg) this).field_N = ((sg) this).field_N - ((sg) this).field_l * ((sg) this).field_p;
                              break L17;
                            }
                          }
                          ((sg) this).field_H = ((sg) this).field_H ^ 1;
                          if ((((sg) this).field_H & 1) == 0) {
                            L18: {
                              if ((536870912 & ((sg) this).field_H) == 0) {
                                ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 29);
                                break L18;
                              } else {
                                ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 29);
                                break L18;
                              }
                            }
                            ((sg) this).field_H = ((sg) this).field_H ^ 536870912;
                            if (0 != (536870912 & ((sg) this).field_H)) {
                              break L15;
                            } else {
                              L19: {
                                if ((131072 & ((sg) this).field_H) != 0) {
                                  ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 17);
                                  break L19;
                                } else {
                                  ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_l * ((sg) this).field_p << 17);
                                  break L19;
                                }
                              }
                              ((sg) this).field_H = ((sg) this).field_H ^ 131072;
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (var4_int == 3) {
                        L20: {
                          if (8 == (8 & ((sg) this).field_H)) {
                            ((sg) this).field_H = ((sg) this).field_H ^ 8;
                            ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 3);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if ((32 & ((sg) this).field_H) == 0) {
                            ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 5);
                            break L21;
                          } else {
                            ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_l * ((sg) this).field_p << 5);
                            break L21;
                          }
                        }
                        ((sg) this).field_H = ((sg) this).field_H ^ 32;
                        if (0 != (32 & ((sg) this).field_H)) {
                          break L1;
                        } else {
                          L22: {
                            if ((((sg) this).field_H & 2048) == 0) {
                              ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 11);
                              break L22;
                            } else {
                              ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_p * ((sg) this).field_l << 11);
                              break L22;
                            }
                          }
                          ((sg) this).field_H = ((sg) this).field_H ^ 2048;
                          if ((((sg) this).field_H & 2048) != 2048) {
                            break L1;
                          } else {
                            L23: {
                              if (0 == (33554432 & ((sg) this).field_H)) {
                                ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_l * ((sg) this).field_p << 25);
                                break L23;
                              } else {
                                ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_p * ((sg) this).field_l << 25);
                                break L23;
                              }
                            }
                            ((sg) this).field_H = ((sg) this).field_H ^ 33554432;
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      L24: {
                        if (var5 != var4_int) {
                          ((sg) this).field_rb[8 - -var5] = -1;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            return false;
          } else {
            if (0 == (1024 & param1.field_J)) {
              if ((param1.field_J & 8192) != 0) {
                if ((param1.field_J & 2048) == 0) {
                  return false;
                } else {
                  if ((param1.field_J & 3) != param2.field_mc) {
                    L25: {
                      int discarded$4 = 28977;
                      this.d(param1);
                      if ((3 & param1.field_J) == 0) {
                        ((sg) this).field_o = ((sg) this).field_o | 8;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if ((262144 & param1.field_J) != 0) {
                  return false;
                } else {
                  L26: {
                    L27: {
                      param2.field_T = 20;
                      stackOut_12_0 = (ja) param2;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (((sg) this).field_J == 2) {
                        break L27;
                      } else {
                        stackOut_13_0 = (ja) (Object) stackIn_13_0;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (((sg) this).field_J == 6) {
                          break L27;
                        } else {
                          stackOut_14_0 = (ja) (Object) stackIn_14_0;
                          stackOut_14_1 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          break L26;
                        }
                      }
                    }
                    stackOut_15_0 = (ja) (Object) stackIn_15_0;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L26;
                  }
                  L28: {
                    L29: {
                      stackIn_16_0.field_V = stackIn_16_1 != 0;
                      param2.field_H = param2.e((byte) 45);
                      vl.field_c.field_g = (float)(-(-param2.field_A.field_f + param1.field_A.field_f));
                      vl.field_c.field_j = (float)(-(param1.field_A.field_h - param2.field_A.field_h));
                      if (0.0f != vl.field_c.field_j) {
                        break L29;
                      } else {
                        if (vl.field_c.field_g == 0.0f) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    vl.field_c.a(-1);
                    var4_float = vl.field_c.field_g * param2.field_x + vl.field_c.field_j * param2.field_t;
                    if (0.0f < var4_float) {
                      break L28;
                    } else {
                      L30: {
                        var5_float = 0.800000011920929f * param2.a((byte) 112, sl.field_c);
                        var6 = var4_float * -(1.0f + var5_float);
                        param2.field_x = param2.field_x + var6 * vl.field_c.field_g;
                        param2.field_t = param2.field_t + var6 * vl.field_c.field_j;
                        param2.a(-var4_float, 0, (ja) null, 0);
                        if (-30 + ((sg) this).field_ab > param2.field_cb) {
                          L31: {
                            L32: {
                              if (2 == param2.field_J) {
                                break L32;
                              } else {
                                if (param2.field_Fb[2] > 0) {
                                  break L32;
                                } else {
                                  stackOut_24_0 = sj.field_K;
                                  stackIn_26_0 = stackOut_24_0;
                                  break L31;
                                }
                              }
                            }
                            stackOut_25_0 = vn.field_h;
                            stackIn_26_0 = stackOut_25_0;
                            break L31;
                          }
                          var7 = stackIn_26_0;
                          kk discarded$5 = bd.a((byte) 54, (ee) (Object) param2, (el) (Object) var7, var7.field_q);
                          param2.field_cb = ((sg) this).field_ab;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      param2.a((byte) 109, (ee) (Object) param1);
                      break L28;
                    }
                  }
                  return true;
                }
              }
            } else {
              L33: {
                if ((2048 & param1.field_J) == 0) {
                  break L33;
                } else {
                  if (~param2.field_mc == ~(param1.field_J & 3)) {
                    break L33;
                  } else {
                    ((sg) this).a(param1, false);
                    return true;
                  }
                }
              }
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void c(wm param0) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 != (param0.field_J & 65536)) {
                break L1;
              } else {
                if (((sg) this).field_pb) {
                  L2: {
                    if ((param0.field_J & 16384) != 0) {
                      break L2;
                    } else {
                      if (!param0.field_E.field_d) {
                        break L2;
                      } else {
                        L3: {
                          var11 = new int[8];
                          var3_array = var11;
                          var4 = param0.field_w.field_j;
                          var5 = param0.field_w.field_g;
                          var6 = -var5;
                          var7 = var4;
                          var8 = param0.field_E.field_h;
                          if (0.0f >= var4 + var5) {
                            break L3;
                          } else {
                            var8 = -var8;
                            break L3;
                          }
                        }
                        var11[4] = (int)((float)param0.field_A.field_h - (float)(param0.field_E.field_m >> 1) * var4 + (float)var8 * var6);
                        var11[0] = (int)((float)param0.field_A.field_h + (float)param0.field_E.field_m * var4 + (float)var8 * var6);
                        var11[2] = (int)((float)param0.field_A.field_h - (float)param0.field_E.field_m * var4 + (float)var8 * var6);
                        var11[3] = (int)(-(var5 * (float)param0.field_E.field_m) + (float)param0.field_A.field_f + (float)var8 * var7);
                        var11[5] = (int)((float)param0.field_A.field_f - (float)(param0.field_E.field_m >> 1) * var5 + (float)var8 * var7);
                        var11[1] = (int)((float)var8 * var7 + ((float)param0.field_A.field_f + var5 * (float)param0.field_E.field_m));
                        var11[6] = (int)((float)(param0.field_E.field_m >> 1) * var4 + (float)param0.field_A.field_h + var6 * (float)var8);
                        var11[7] = (int)((float)param0.field_A.field_f + (float)(param0.field_E.field_m >> 1) * var5 + (float)var8 * var7);
                        var9 = 4;
                        L4: while (true) {
                          if (var9 >= 8) {
                            dl.a(var3_array, (byte) -116, 128, 0);
                            break L2;
                          } else {
                            var11[var9] = var11[var9] + ((sg) this).field_db.field_k * 2;
                            var11[1 + var9] = var11[1 + var9] + ((sg) this).field_db.field_a * 2;
                            var9 += 2;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("sg.DB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -127 + 41);
        }
    }

    private final void a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ui var7 = null;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        oa stackIn_16_1 = null;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        oa stackOut_15_1 = null;
        int stackOut_14_0 = 0;
        oa stackOut_14_1 = null;
        L0: {
          var8 = HoldTheLine.field_D;
          if (param0 == -3) {
            break L0;
          } else {
            this.a(-112);
            break L0;
          }
        }
        L1: {
          if (((sg) this).field_F > 0) {
            ((sg) this).field_F = ((sg) this).field_F - 14;
            if (0 > ((sg) this).field_F) {
              ((sg) this).field_F = 0;
              break L1;
            } else {
              break L1;
            }
          } else {
            L2: {
              L3: {
                L4: {
                  var4 = (int)(param1 % 157L);
                  if (var4 < 2) {
                    break L4;
                  } else {
                    if (var4 < 139) {
                      break L3;
                    } else {
                      if (var4 > 141) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (hc.a(0, (int)(param1 << 6)) >= 0) {
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            L5: {
              var5 = stackIn_10_0;
              if (var5 != 0) {
                ((sg) this).field_F = 84 + (tn.a((int)(param1 << 6), 5255) * 40 >> 16);
                var6 = ((sg) this).field_F;
                var7 = qf.a(293, (el) (Object) qd.field_j);
                if (var7 == null) {
                  break L5;
                } else {
                  var7.a((byte) -125, var6);
                  var7.field_j.i(var6 * 150 + 300);
                  break L1;
                }
              } else {
                if (var4 != 5) {
                  break L5;
                } else {
                  if (hc.a(0, (int)(param1 << 6)) >= 3) {
                    break L5;
                  } else {
                    L6: {
                      var6 = 84 + (tn.a((int)(param1 << 6), 5255) * 40 >> 16);
                      stackOut_13_0 = param0 + 296;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (0L == (1L & param1)) {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = se.field_m;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L6;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = uj.field_a;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L6;
                      }
                    }
                    var7 = qf.a(stackIn_16_0, (el) (Object) stackIn_16_1);
                    if (var7 != null) {
                      var7.a((byte) -126, var6);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L1;
          }
        }
    }

    private final void a(int param0, ja param1, ja param2) {
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20_float = 0.0f;
        oa var20 = null;
        float var21 = 0.0f;
        int var22 = 0;
        ja stackIn_19_0 = null;
        float stackIn_19_1 = 0.0f;
        int stackIn_19_2 = 0;
        ja stackIn_19_3 = null;
        ja stackIn_20_0 = null;
        float stackIn_20_1 = 0.0f;
        int stackIn_20_2 = 0;
        ja stackIn_20_3 = null;
        ja stackIn_21_0 = null;
        float stackIn_21_1 = 0.0f;
        int stackIn_21_2 = 0;
        ja stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        ja stackIn_25_0 = null;
        float stackIn_25_1 = 0.0f;
        int stackIn_25_2 = 0;
        ja stackIn_25_3 = null;
        ja stackIn_26_0 = null;
        float stackIn_26_1 = 0.0f;
        int stackIn_26_2 = 0;
        ja stackIn_26_3 = null;
        ja stackIn_27_0 = null;
        float stackIn_27_1 = 0.0f;
        int stackIn_27_2 = 0;
        ja stackIn_27_3 = null;
        int stackIn_27_4 = 0;
        oa stackIn_36_0 = null;
        oa stackIn_42_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_18_0 = null;
        float stackOut_18_1 = 0.0f;
        int stackOut_18_2 = 0;
        ja stackOut_18_3 = null;
        ja stackOut_20_0 = null;
        float stackOut_20_1 = 0.0f;
        int stackOut_20_2 = 0;
        ja stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        ja stackOut_19_0 = null;
        float stackOut_19_1 = 0.0f;
        int stackOut_19_2 = 0;
        ja stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        ja stackOut_24_0 = null;
        float stackOut_24_1 = 0.0f;
        int stackOut_24_2 = 0;
        ja stackOut_24_3 = null;
        ja stackOut_26_0 = null;
        float stackOut_26_1 = 0.0f;
        int stackOut_26_2 = 0;
        ja stackOut_26_3 = null;
        int stackOut_26_4 = 0;
        ja stackOut_25_0 = null;
        float stackOut_25_1 = 0.0f;
        int stackOut_25_2 = 0;
        ja stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        oa stackOut_35_0 = null;
        oa stackOut_34_0 = null;
        oa stackOut_40_0 = null;
        oa stackOut_41_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            if (qf.a((byte) -73, (ee) (Object) param2, (ee) (Object) param1)) {
              this.a(param2, 0.0f, 0, -0.5f * kk.field_k * vl.field_c.field_j, -0.5f * kk.field_k * vl.field_c.field_g);
              this.a(param1, 0.0f, 0, vl.field_c.field_j * (kk.field_k * 0.5f), kk.field_k * 0.5f * vl.field_c.field_g);
              param2.field_A.field_f = (int)param2.field_u;
              param2.field_A.field_h = (int)param2.field_y;
              param1.field_A.field_h = (int)param1.field_y;
              param1.field_A.field_f = (int)param1.field_u;
              var4_float = -param2.field_t + param1.field_t;
              var5 = -param2.field_x + param1.field_x;
              var6 = var5 * vl.field_c.field_g + vl.field_c.field_j * var4_float;
              if (var6 <= 0.0f) {
                L1: {
                  L2: {
                    L3: {
                      var7 = -mm.field_d + (float)param2.field_A.field_h;
                      var8 = (float)param2.field_A.field_f - lk.field_b;
                      var9 = (-(vl.field_c.field_j * var8) + var7 * vl.field_c.field_g) / 3.5f;
                      var10 = -mm.field_d + (float)param1.field_A.field_h;
                      var11 = (float)param1.field_A.field_f - lk.field_b;
                      var12 = (-(vl.field_c.field_j * var11) + vl.field_c.field_g * var10) / 3.5f;
                      var13 = var7 * param2.field_t + param2.field_x * var8;
                      var14 = var11 * param1.field_x + var10 * param1.field_t;
                      var15 = param2.field_C.field_l * param2.a((byte) 97, qb.field_f);
                      var16 = param2.field_C.field_a * param2.a((byte) 113, qb.field_e);
                      var17 = param1.field_C.field_l * param1.a((byte) 116, qb.field_f);
                      var18 = param1.field_C.field_a * param1.a((byte) 127, qb.field_e);
                      var19 = 0.800000011920929f * Math.max(param2.a((byte) 109, dl.field_m), param1.a((byte) 125, dl.field_m));
                      if (param2.field_J == 2) {
                        break L3;
                      } else {
                        if (param1.field_J != 2) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (param2.field_J != 2) {
                        break L4;
                      } else {
                        if (param1.field_J != 2) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (param2.field_J == 2) {
                      var20_float = var12 * (var12 * var17) + var18;
                      var21 = var18 * (-(var19 + 1.0f) * var6) / var20_float;
                      param1.field_x = param1.field_x + vl.field_c.field_g * var21;
                      param1.field_t = param1.field_t + var21 * vl.field_c.field_j;
                      param1.field_j = 5.0f * ln.a(-29407, var12);
                      param1.a(2, 100);
                      break L1;
                    } else {
                      var20_float = var16 + var9 * (var9 * var15);
                      var21 = var16 * (var6 * -(1.0f + var19)) / var20_float;
                      param2.field_t = param2.field_t - var21 * vl.field_c.field_j;
                      param2.field_x = param2.field_x - var21 * vl.field_c.field_g;
                      param2.field_j = ln.a(-29407, var9) * 5.0f;
                      param2.a(2, 100);
                      break L1;
                    }
                  }
                  var20_float = var12 * var12 / var18 + (1.0f / var17 + 1.0f / var15 + var9 * var9 / var16);
                  var21 = 1.7999999523162842f * var6 / var20_float;
                  param2.field_x = param2.field_x + var21 / var15 * vl.field_c.field_g;
                  param2.field_t = param2.field_t + var21 / var15 * vl.field_c.field_j;
                  param1.field_t = param1.field_t - vl.field_c.field_j * (var21 / var17);
                  param1.field_x = param1.field_x - vl.field_c.field_g * (var21 / var17);
                  if (param2.field_J == 2) {
                    param2.field_j = ln.a(-29407, var9) * 5.0f;
                    param2.a(2, 100);
                    param1.field_j = 5.0f * ln.a(-29407, var12);
                    param1.a(2, 100);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (param1.field_J == 2) {
                    param2.a(1.0f, 0, param1, 5);
                    break L5;
                  } else {
                    L6: {
                      stackOut_18_0 = (ja) param2;
                      stackOut_18_1 = -var6;
                      stackOut_18_2 = 0;
                      stackOut_18_3 = (ja) param1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      if (var14 <= var13) {
                        stackOut_20_0 = (ja) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = (ja) (Object) stackIn_20_3;
                        stackOut_20_4 = 2;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        break L6;
                      } else {
                        stackOut_19_0 = (ja) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = (ja) (Object) stackIn_19_3;
                        stackOut_19_4 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        break L6;
                      }
                    }
                    ((ja) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4);
                    break L5;
                  }
                }
                L7: {
                  if (param2.field_J == 2) {
                    param1.a(1.0f, 0, param2, 5);
                    break L7;
                  } else {
                    L8: {
                      stackOut_24_0 = (ja) param1;
                      stackOut_24_1 = -var6;
                      stackOut_24_2 = 0;
                      stackOut_24_3 = (ja) param2;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      if (var13 > var14) {
                        stackOut_26_0 = (ja) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = (ja) (Object) stackIn_26_3;
                        stackOut_26_4 = 1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        break L8;
                      } else {
                        stackOut_25_0 = (ja) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = (ja) (Object) stackIn_25_3;
                        stackOut_25_4 = 2;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        break L8;
                      }
                    }
                    ((ja) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4);
                    break L7;
                  }
                }
                L9: {
                  if (param2.field_cb < ((sg) this).field_ab + -30) {
                    L10: {
                      L11: {
                        if (param2.field_J == 2) {
                          break L11;
                        } else {
                          if (0 >= param2.field_Fb[2]) {
                            stackOut_35_0 = sj.field_K;
                            stackIn_36_0 = stackOut_35_0;
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      stackOut_34_0 = vn.field_h;
                      stackIn_36_0 = stackOut_34_0;
                      break L10;
                    }
                    var20 = stackIn_36_0;
                    kk discarded$2 = bd.a((byte) 20, (ee) (Object) param2, (el) (Object) var20, var20.field_q);
                    param2.field_cb = ((sg) this).field_ab;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L12: {
                  if (((sg) this).field_ab + -30 <= param1.field_cb) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (param1.field_J == 2) {
                          break L14;
                        } else {
                          if (param1.field_Fb[2] > 0) {
                            break L14;
                          } else {
                            stackOut_40_0 = sj.field_K;
                            stackIn_42_0 = stackOut_40_0;
                            break L13;
                          }
                        }
                      }
                      stackOut_41_0 = vn.field_h;
                      stackIn_42_0 = stackOut_41_0;
                      break L13;
                    }
                    var20 = stackIn_42_0;
                    kk discarded$3 = bd.a((byte) 63, (ee) (Object) param1, (el) (Object) var20, var20.field_q);
                    param1.field_cb = ((sg) this).field_ab;
                    break L12;
                  }
                }
                param2.a((byte) 103, (ee) (Object) param1);
                param1.a((byte) 68, (ee) (Object) param2);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var4;
            stackOut_45_1 = new StringBuilder().append("sg.KB(").append(0).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L15;
            }
          }
          L16: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L16;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
    }

    final void a(int param0, int param1, byte param2) {
        ih var5 = null;
        if (((sg) this).field_E) {
            Object var6 = null;
            throw new RuntimeException((String) null);
        }
        if ((ti.field_z & 1 << param0) != 0) {
            return;
        }
        int fieldTemp$0 = ((sg) this).field_fb;
        ((sg) this).field_fb = ((sg) this).field_fb + 1;
        ((sg) this).field_V[fieldTemp$0] = param0;
        ii.field_c = ii.field_c | 1 << param0;
        int var4 = -19 / ((param2 - 36) / 62);
        ti.field_z = ti.field_z | 1 << param0;
        if (!l.field_b) {
            var5 = new ih(param0, param1, ((sg) this).field_l, ((sg) this).field_N, ((sg) this).field_p, ((sg) this).field_H);
            if (pj.b((byte) 92)) {
                fb.field_n.a((byte) -117, (hl) (Object) var5);
            } else {
                int discarded$1 = -79;
                na.a(4, var5);
                go.field_k = va.a((byte) -101, 4);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param8 <= -117) {
                break L1;
              } else {
                sg.b(true);
                break L1;
              }
            }
            L2: while (true) {
              param6--;
              if (0 > param6) {
                break L0;
              } else {
                var17 = param5;
                var10 = var17;
                var11 = param1;
                var12 = param9;
                var13 = param3;
                var14 = param7;
                var15 = (16711422 & var17[var11]) >> 1;
                var10[var11] = (pk.a(var13, 33423793) >> 9) + (pk.a(var12 >> 1, 16711680) + ((pk.a(var14, 33439411) >> 17) + var15));
                param7 = param7 + param0;
                param1++;
                param3 = param3 + param4;
                param9 = param9 + param2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10_ref;
            stackOut_6_1 = new StringBuilder().append("sg.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final boolean d(byte param0) {
        if (param0 != 47) {
            ((sg) this).field_W = null;
            return false;
        }
        return false;
    }

    final int d(int param0, int param1, int param2) {
        if (param1 >= 0) {
            if (param0 >= 0) {
                if (param1 < 640) {
                    if (!(480 <= param0)) {
                        return ((sg) this).field_lb.field_m[param1 + 640 * param0];
                    }
                }
            }
        }
        if (b.a(false, param1, param0, ((sg) this).field_nb)) {
            return b.a(false, param1, param0, ((sg) this).field_jb) ? 12 : 8;
        }
        int var4 = 94 / ((12 - param2) / 42);
        return 0;
    }

    private final void e(int param0) {
        int var3 = HoldTheLine.field_D;
        ((sg) this).field_B = -1;
        ((sg) this).field_k = 0;
        ((sg) this).field_ab = 0;
        ((sg) this).field_mb = 0;
        ((sg) this).field_h = 0;
        ((sg) this).field_z = 0;
        wm var2 = (wm) (Object) ((sg) this).field_cb.b((byte) 89);
        while (var2 != null) {
            if ((var2.field_J & 512) != 0) {
                var2.d(0);
            }
            var2 = (wm) (Object) ((sg) this).field_cb.c((byte) 114);
        }
        ((sg) this).field_S = true;
    }

    private final qm a(ja param0, int param1) {
        hj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        qm var6 = null;
        qm var7 = null;
        qm stackIn_3_0 = null;
        qm stackIn_6_0 = null;
        qm stackIn_10_0 = null;
        qm stackIn_14_0 = null;
        qm stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm stackOut_2_0 = null;
        qm stackOut_9_0 = null;
        qm stackOut_13_0 = null;
        qm stackOut_17_0 = null;
        qm stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var3 = param0.field_C.field_v.a(param0.field_r, 27788);
            var4 = -(var3.field_s >> 1) + param0.field_A.field_h;
            var5 = param0.field_A.field_f - (var3.field_y >> 1);
            var6 = this.a(var5, var4, var3, -95, param0.field_q);
            if (var6 != null) {
              stackOut_2_0 = (qm) var6;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var7 = new qm(0, 0);
              var7.field_h = (int)(-((float)param0.field_C.field_k * param0.field_w.field_g) + param0.field_y + (float)param0.field_C.field_K * param0.field_w.field_j);
              var7.field_f = (int)(param0.field_w.field_g * (float)param0.field_C.field_K + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
              if (((sg) this).a(param0.field_q, var7.field_f, true, var7.field_h)) {
                var7.field_h = (int)(param0.field_w.field_g * (float)param0.field_C.field_k + param0.field_y + param0.field_w.field_j * (float)param0.field_C.field_K);
                var7.field_f = (int)((float)param0.field_C.field_K * param0.field_w.field_g + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
                if (!((sg) this).a(param0.field_q, var7.field_f, true, var7.field_h)) {
                  stackOut_9_0 = (qm) var7;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var7.field_h = (int)(-((float)param0.field_C.field_K * param0.field_w.field_j) + (-(param0.field_w.field_g * (float)param0.field_C.field_k) + param0.field_y));
                  var7.field_f = (int)(-((float)param0.field_C.field_K * param0.field_w.field_g) + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
                  if (!((sg) this).a(param0.field_q, var7.field_f, true, var7.field_h)) {
                    stackOut_13_0 = (qm) var7;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    var7.field_h = (int)(param0.field_y + (float)param0.field_C.field_k * param0.field_w.field_g - param0.field_w.field_j * (float)param0.field_C.field_K);
                    var7.field_f = (int)(-(param0.field_w.field_g * (float)param0.field_C.field_K) + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
                    if (!((sg) this).a(param0.field_q, var7.field_f, true, var7.field_h)) {
                      stackOut_17_0 = (qm) var7;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackOut_5_0 = (qm) var7;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("sg.JB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 0 + 41);
        }
        return stackIn_18_0;
    }

    private final void a(wm param0, int param1) {
        RuntimeException var3 = null;
        hj var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 >= 39) {
                break L1;
              } else {
                var9 = null;
                this.a(-16, (na) null);
                break L1;
              }
            }
            L2: {
              if ((8192 & param0.field_J) == 0) {
                break L2;
              } else {
                if (!((sg) this).d((byte) 47)) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              if (0 != (1048576 & param0.field_J)) {
                var3_ref = param0.field_H;
                break L3;
              } else {
                var3_ref = param0.a((byte) -124);
                break L3;
              }
            }
            L4: {
              if (0 != (131072 & param0.field_J)) {
                L5: {
                  var4 = (float)param0.field_C / 150.0f;
                  var5 = 4.0f * var4 * (-var4 + 1.0f) + 1.0f;
                  var6 = (int)((float)param0.field_H.field_o * var5);
                  var7 = (int)((float)param0.field_H.field_v * var5);
                  hj discarded$3 = param0.a((byte) -118);
                  if ((param0.field_J & 128) == 0) {
                    var3_ref.a(-(var6 >> 1) + param0.field_A.field_h, param0.field_A.field_f + -(var7 >> 1), var6, var7);
                    break L5;
                  } else {
                    var3_ref.b(-(var6 >> 1) + param0.field_A.field_h, -(var7 >> 1) + param0.field_A.field_f, var6, var7, ((sg) this).field_C[param0.field_J & 3].field_Eb);
                    break L5;
                  }
                }
                int discarded$4 = 32381;
                ok.a();
                ((sg) this).field_I.f();
                var3_ref.c(param0.field_A.field_h - (var6 >> 1), param0.field_A.field_f - (var7 >> 1), var6, var7, 0);
                ug.b(-1);
                break L4;
              } else {
                L6: {
                  if ((param0.field_J & 128) != 0) {
                    var3_ref.c(-(var3_ref.field_o >> 1) + param0.field_A.field_h, param0.field_A.field_f + -(var3_ref.field_v >> 1), ((sg) this).field_C[param0.field_J & 3].field_Eb);
                    break L6;
                  } else {
                    var3_ref.a(-(var3_ref.field_o >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var3_ref.field_v >> 1));
                    break L6;
                  }
                }
                int discarded$5 = 32381;
                ok.a();
                ((sg) this).field_I.f();
                var3_ref.e(-(var3_ref.field_o >> 1) + param0.field_A.field_h, -(var3_ref.field_v >> 1) + param0.field_A.field_f, 0);
                ug.b(-1);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("sg.VA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    private final void a(byte param0, in param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
            var8 = (int)(param1.field_g * 15.0f + param1.field_j * -15.0f) + param3;
            var9 = (int)(param1.field_g * -15.0f - param1.field_j * 15.0f) + param4;
            tc.d(param3, param4, var8, var9, param2);
            var7 = var9;
            var6_int = var8;
            var9 = (int)(-(5.0f * param1.field_j) + -15.0f * param1.field_g) + param4;
            var8 = param3 + (int)(param1.field_j * -15.0f + 5.0f * param1.field_g);
            tc.d(var6_int, var7, var8, var9, param2);
            var6_int = var8;
            var7 = var9;
            var8 = param3 + (int)(-25.0f * param1.field_j + param1.field_g * 5.0f);
            var9 = (int)(param1.field_g * -25.0f - param1.field_j * 5.0f) + param4;
            tc.d(var6_int, var7, var8, var9, param2);
            var7 = var9;
            var6_int = var8;
            var8 = (int)(-25.0f * param1.field_j - 5.0f * param1.field_g) + param3;
            var10 = 53 / ((param0 - 71) / 39);
            var9 = param4 - -(int)(5.0f * param1.field_j + -25.0f * param1.field_g);
            tc.d(var6_int, var7, var8, var9, param2);
            var7 = var9;
            var6_int = var8;
            var9 = (int)(5.0f * param1.field_j + param1.field_g * -15.0f) + param4;
            var8 = (int)(param1.field_j * -15.0f - 5.0f * param1.field_g) + param3;
            tc.d(var6_int, var7, var8, var9, param2);
            var6_int = var8;
            var7 = var9;
            var8 = param3 + (int)(-(param1.field_g * 15.0f) + -15.0f * param1.field_j);
            var9 = param4 + (int)(15.0f * param1.field_j + param1.field_g * -15.0f);
            tc.d(var6_int, var7, var8, var9, param2);
            tc.d(var8, var9, param3, param4, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("sg.KA(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ja var5_ref_ja = null;
        int var5 = 0;
        int var6 = 0;
        float var6_float = 0.0f;
        wm var7_ref_wm = null;
        hj var7_ref_hj = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        int var15 = 0;
        wd var15_ref_wd = null;
        int var16 = 0;
        qm var16_ref_qm = null;
        in var17_ref_in = null;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        in stackIn_63_2 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        in stackIn_64_2 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        in stackIn_65_2 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        in stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_60_0 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        in stackOut_62_2 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        in stackOut_63_2 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        in stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        in stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        var19 = HoldTheLine.field_D;
        this.a((byte) -109);
        this.a(true);
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((sg) this).field_h) {
            L1: {
              if (((sg) this).field_fb <= 0) {
                break L1;
              } else {
                L2: {
                  var5 = 0;
                  if (50 > ((sg) this).field_G) {
                    var6_float = (float)Math.exp(1.0);
                    var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)((sg) this).field_G)) - 1.0));
                    break L2;
                  } else {
                    if (((sg) this).field_G <= 150) {
                      break L2;
                    } else {
                      var6_float = (float)Math.exp(0.04000000283122063);
                      var7 = -100 + (((sg) this).field_G + -50);
                      var5 = (int)((double)(640.0f / (-1.0f + var6_float)) * (1.0 - Math.exp((double)((float)var7 * 0.0020000000949949026f))));
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = ((sg) this).field_V[0];
                  var7_ref_hj = ak.a(-40, false, var6);
                  var8 = nm.field_c.a(ae.field_c[var6]) + 48;
                  tc.f(3 + var5, 3, var8, 36, 0);
                  tc.a(var5 - -2, 2, var8 + 2, 38, 16777215);
                  var7_ref_hj.a(5 + var5, 5, 32, 32);
                  if (var6 == 12) {
                    pe.a(32, 4209, 21 + var5, 21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                nm.field_c.a(ae.field_c[var6], 48 + var5, 30, 0, -1);
                break L1;
              }
            }
            L4: {
              if (((sg) this).field_j > 0) {
                L5: {
                  if (null == ((sg) this).field_R) {
                    var5 = ho.field_j.a(((sg) this).field_ib[0]);
                    var6 = ho.field_j.field_F;
                    ((sg) this).field_R = new hj(var5, var6);
                    vb.a(-121, ((sg) this).field_R);
                    ho.field_j.a(((sg) this).field_ib[0], 0, ho.field_j.field_G, 0, -1);
                    ug.b(-1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var5 = 4096 - (((sg) this).field_s << 12) / 50;
                var6 = var5 * ((sg) this).field_R.field_s >> 12;
                var7 = ((sg) this).field_R.field_y * var5 >> 12;
                ((sg) this).field_R.a(640 + -var6 >> 1, 480 - var7 >> 1, var6, var7);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            var5_ref_ja = ((sg) this).field_C[var4];
            var6 = 0;
            var7_ref_wm = (wm) (Object) ((sg) this).field_cb.b((byte) 102);
            L6: while (true) {
              L7: {
                if (var7_ref_wm == null) {
                  break L7;
                } else {
                  L8: {
                    if (~var5_ref_ja.field_q <= ~var7_ref_wm.field_q) {
                      break L8;
                    } else {
                      if (!var7_ref_wm.a(2048, var5_ref_ja.field_A)) {
                        break L8;
                      } else {
                        var6 = 1;
                        break L7;
                      }
                    }
                  }
                  var7_ref_wm = (wm) (Object) ((sg) this).field_cb.c((byte) 90);
                  continue L6;
                }
              }
              L9: {
                if (var6 != 0) {
                  break L9;
                } else {
                  var7_ref_wm = (wm) (Object) ((sg) this).field_d.b((byte) 107);
                  L10: while (true) {
                    if (var7_ref_wm == null) {
                      break L9;
                    } else {
                      L11: {
                        if (var7_ref_wm.field_q <= var5_ref_ja.field_q) {
                          break L11;
                        } else {
                          if (!var7_ref_wm.a(2048, var5_ref_ja.field_A)) {
                            break L11;
                          } else {
                            var6 = 1;
                            break L9;
                          }
                        }
                      }
                      var7_ref_wm = (wm) (Object) ((sg) this).field_d.c((byte) -63);
                      continue L10;
                    }
                  }
                }
              }
              L12: {
                if (var5_ref_ja.field_A.field_h <= 264) {
                  break L12;
                } else {
                  if (var5_ref_ja.field_A.field_h >= 394) {
                    break L12;
                  } else {
                    if (var5_ref_ja.field_A.field_f < 40) {
                      var6 = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                if (2 != ((sg) this).field_J) {
                  L14: {
                    if (var5_ref_ja.field_A.field_h >= 64) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L14;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      break L14;
                    }
                  }
                  L15: {
                    var8 = stackIn_31_0;
                    if (var5_ref_ja.field_A.field_h <= 576) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L15;
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      break L15;
                    }
                  }
                  var9 = stackIn_34_0;
                  break L13;
                } else {
                  L16: {
                    if (480 >= var5_ref_ja.field_A.field_h) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L16;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L16;
                    }
                  }
                  L17: {
                    var9 = stackIn_24_0;
                    if (160 <= var5_ref_ja.field_A.field_h) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L17;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L17;
                    }
                  }
                  var8 = stackIn_27_0;
                  break L13;
                }
              }
              L18: {
                if (64 <= var5_ref_ja.field_A.field_f) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L18;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L18;
                }
              }
              L19: {
                var10 = stackIn_38_0;
                if (var5_ref_ja.field_A.field_f <= 416) {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  break L19;
                } else {
                  stackOut_39_0 = 1;
                  stackIn_41_0 = stackOut_39_0;
                  break L19;
                }
              }
              L20: {
                L21: {
                  var11 = stackIn_41_0;
                  if (var8 != 0) {
                    break L21;
                  } else {
                    if (var9 == 0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var10 != 0) {
                    break L22;
                  } else {
                    if (var11 == 0) {
                      break L20;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  var12 = 0;
                  if (var11 != 0) {
                    var12 += 2;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (var9 == 0) {
                    break L24;
                  } else {
                    var12++;
                    break L24;
                  }
                }
                if (((sg) this).field_h > var12) {
                  var6 = 1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L25: {
                L26: {
                  if (0 >= ((sg) this).field_ab) {
                    break L26;
                  } else {
                    if (var5_ref_ja.field_W == null) {
                      break L26;
                    } else {
                      if (var5_ref_ja.field_tb <= 50) {
                        break L26;
                      } else {
                        if (0 != var5_ref_ja.field_O) {
                          break L26;
                        } else {
                          stackOut_59_0 = 1;
                          stackIn_61_0 = stackOut_59_0;
                          break L25;
                        }
                      }
                    }
                  }
                }
                stackOut_60_0 = 0;
                stackIn_61_0 = stackOut_60_0;
                break L25;
              }
              L27: {
                var12 = stackIn_61_0;
                if (var6 == 0) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      stackOut_62_0 = this;
                      stackOut_62_1 = -72;
                      stackOut_62_2 = var5_ref_ja.field_w;
                      stackIn_65_0 = stackOut_62_0;
                      stackIn_65_1 = stackOut_62_1;
                      stackIn_65_2 = stackOut_62_2;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      stackIn_63_2 = stackOut_62_2;
                      if (var12 == 0) {
                        break L29;
                      } else {
                        stackOut_63_0 = this;
                        stackOut_63_1 = stackIn_63_1;
                        stackOut_63_2 = (in) (Object) stackIn_63_2;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        stackIn_65_2 = stackOut_63_2;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        stackIn_64_2 = stackOut_63_2;
                        if (((sg) this).field_bb / 10 % 2 != 0) {
                          break L29;
                        } else {
                          stackOut_64_0 = this;
                          stackOut_64_1 = stackIn_64_1;
                          stackOut_64_2 = (in) (Object) stackIn_64_2;
                          stackOut_64_3 = 16777215;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          stackIn_66_2 = stackOut_64_2;
                          stackIn_66_3 = stackOut_64_3;
                          break L28;
                        }
                      }
                    }
                    stackOut_65_0 = this;
                    stackOut_65_1 = stackIn_65_1;
                    stackOut_65_2 = (in) (Object) stackIn_65_2;
                    stackOut_65_3 = var5_ref_ja.field_Eb;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    stackIn_66_3 = stackOut_65_3;
                    break L28;
                  }
                  this.a((byte) stackIn_66_1, stackIn_66_2, stackIn_66_3, var5_ref_ja.field_A.field_h, var5_ref_ja.field_A.field_f);
                  break L27;
                }
              }
              L30: {
                if (((sg) this).field_bb % 20 >= 10) {
                  break L30;
                } else {
                  if (null == var5_ref_ja.field_W) {
                    break L30;
                  } else {
                    if (var5_ref_ja.field_Lb <= 50) {
                      break L30;
                    } else {
                      if (((sg) this).field_J == 2) {
                        break L30;
                      } else {
                        L31: {
                          var13 = (int)var5_ref_ja.field_Ib;
                          var14 = (float)(-var13) + var5_ref_ja.field_Ib;
                          if (0.0f != var14) {
                            break L31;
                          } else {
                            if (~var13 != ~((sg) this).field_sb.length) {
                              break L31;
                            } else {
                              var13--;
                              var14 = 1.0f;
                              break L31;
                            }
                          }
                        }
                        var15_ref_wd = ((sg) this).field_sb[var13];
                        var16_ref_qm = var15_ref_wd.a(false, var14);
                        var17_ref_in = var15_ref_wd.a((byte) 120, var14);
                        var18 = var5_ref_ja.field_Eb;
                        this.a((byte) 13, var17_ref_in, var18, var16_ref_qm.field_h, var16_ref_qm.field_f);
                        break L30;
                      }
                    }
                  }
                }
              }
              var13 = var5_ref_ja.field_Fb[2] + var5_ref_ja.field_Fb[0] + (var5_ref_ja.field_Fb[1] - -var5_ref_ja.field_Fb[3]);
              var14 = 0.0f;
              var15 = 0;
              L32: while (true) {
                if (var15 >= 3) {
                  L33: {
                    if (var5_ref_ja.field_ob > 25) {
                      break L33;
                    } else {
                      if (0 < ((sg) this).field_ab) {
                        pd.a(hk.field_a[20 - -var5_ref_ja.field_R], -28, var5_ref_ja.field_A.field_f - 15, -25 + var5_ref_ja.field_A.field_h, 200 - (var5_ref_ja.field_ob * 8 - 512), 16777215);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                  }
                  var4++;
                  continue L0;
                } else {
                  L34: {
                    var16 = 0;
                    if (var5_ref_ja.field_hc[var15] != -1) {
                      L35: {
                        if (var5_ref_ja.field_hc[var15] == 0) {
                          var16 = 16711680;
                          break L35;
                        } else {
                          if (var5_ref_ja.field_hc[var15] != 1) {
                            if (var5_ref_ja.field_hc[var15] != 2) {
                              break L35;
                            } else {
                              var16 = 255;
                              break L35;
                            }
                          } else {
                            var16 = 65280;
                            break L35;
                          }
                        }
                      }
                      var17 = 3.1415927410125732f * (2.0f * (float)(((sg) this).field_bb % 100)) / 100.0f + var14;
                      var2 = var5_ref_ja.field_A.field_h + (int)((double)var5_ref_ja.field_B * Math.cos((double)var17));
                      var14 = var14 + 6.2831854820251465f / (float)var13;
                      var3 = var5_ref_ja.field_A.field_f - (int)((double)var5_ref_ja.field_B * Math.sin((double)var17));
                      tc.d(var2, var3, 3, var16);
                      var16 = var16 >> 1 & 8355711;
                      tc.c(var2, var3, 3, var16);
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  var15++;
                  continue L32;
                }
              }
            }
          }
        }
    }

    private final void a(cg param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        wm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ja stackIn_59_0 = null;
        ja stackIn_60_0 = null;
        ja stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_76_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        ja stackOut_58_0 = null;
        ja stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        ja stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 != param0.field_c) {
                if (param0.field_c == 1) {
                  L2: {
                    stackOut_76_0 = this;
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_77_0 = stackOut_76_0;
                    if (param0.field_d != -1) {
                      stackOut_78_0 = this;
                      stackOut_78_1 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      break L2;
                    } else {
                      stackOut_77_0 = this;
                      stackOut_77_1 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      break L2;
                    }
                  }
                  ((sg) this).field_S = stackIn_79_1 != 0;
                  break L1;
                } else {
                  if (param0.field_c != 6) {
                    if (param0.field_c != 2) {
                      if (3 == param0.field_c) {
                        this.a(param0.field_d, -1, param0.field_h);
                        break L1;
                      } else {
                        if (param0.field_c == 4) {
                          this.b(24936, param0.field_h, param0.field_d);
                          break L1;
                        } else {
                          if (param0.field_c != 5) {
                            if (param0.field_c != 7) {
                              if (param0.field_c == 8) {
                                ((sg) this).field_C[param0.field_d].field_bc = param0.field_h;
                                break L1;
                              } else {
                                if (param0.field_c != 9) {
                                  if (10 == param0.field_c) {
                                    ((sg) this).field_z = param0.field_d;
                                    ((sg) this).field_h = param0.field_d;
                                    var3_int = 0;
                                    L3: while (true) {
                                      if (var3_int >= ((sg) this).field_h) {
                                        break L1;
                                      } else {
                                        ((sg) this).field_C[var3_int].l(554646678);
                                        var3_int++;
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    if (param0.field_c != 11) {
                                      if (param0.field_c != 12) {
                                        if (param0.field_c == 13) {
                                          ((sg) this).field_mb = -1;
                                          qn.a(7, false, false);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        ((sg) this).field_S = false;
                                        ((sg) this).field_mb = -1;
                                        break L1;
                                      }
                                    } else {
                                      ((sg) this).field_B = param0.field_d;
                                      ((sg) this).field_U = false;
                                      ((sg) this).field_ob = -1;
                                      break L1;
                                    }
                                  }
                                } else {
                                  L4: {
                                    stackOut_58_0 = ((sg) this).field_C[param0.field_d];
                                    stackIn_60_0 = stackOut_58_0;
                                    stackIn_59_0 = stackOut_58_0;
                                    if (param0.field_h == 0) {
                                      stackOut_60_0 = (ja) (Object) stackIn_60_0;
                                      stackOut_60_1 = 0;
                                      stackIn_61_0 = stackOut_60_0;
                                      stackIn_61_1 = stackOut_60_1;
                                      break L4;
                                    } else {
                                      stackOut_59_0 = (ja) (Object) stackIn_59_0;
                                      stackOut_59_1 = 1;
                                      stackIn_61_0 = stackOut_59_0;
                                      stackIn_61_1 = stackOut_59_1;
                                      break L4;
                                    }
                                  }
                                  stackIn_61_0.field_jb = stackIn_61_1 != 0;
                                  ((sg) this).field_C[param0.field_d].field_M = param0.field_h;
                                  break L1;
                                }
                              }
                            } else {
                              var3_int = 0;
                              L5: while (true) {
                                if (var3_int >= 4) {
                                  L6: {
                                    ((sg) this).field_C[param0.field_d].field_hc[0] = param0.field_h;
                                    ((sg) this).field_C[param0.field_d].field_hc[1] = param0.field_e;
                                    ((sg) this).field_C[param0.field_d].field_hc[2] = param0.field_k;
                                    if (param0.field_h == -1) {
                                      break L6;
                                    } else {
                                      ((sg) this).field_C[param0.field_d].field_Fb[param0.field_h] = ((sg) this).field_C[param0.field_d].field_Fb[param0.field_h] + 1;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (param0.field_e == -1) {
                                      break L7;
                                    } else {
                                      ((sg) this).field_C[param0.field_d].field_Fb[param0.field_e] = ((sg) this).field_C[param0.field_d].field_Fb[param0.field_e] + 1;
                                      break L7;
                                    }
                                  }
                                  if (-1 == param0.field_k) {
                                    break L1;
                                  } else {
                                    ((sg) this).field_C[param0.field_d].field_Fb[param0.field_k] = ((sg) this).field_C[param0.field_d].field_Fb[param0.field_k] + 1;
                                    break L1;
                                  }
                                } else {
                                  ((sg) this).field_C[param0.field_d].field_Fb[var3_int] = 0;
                                  var3_int++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (-107 != param0.field_d) {
                              var3_ref = (wm) (Object) ((sg) this).field_cb.b((byte) 106);
                              L8: while (true) {
                                if (var3_ref == null) {
                                  break L1;
                                } else {
                                  L9: {
                                    if (0 != (var3_ref.field_J & 512)) {
                                      L10: {
                                        if (param0.field_d == -106) {
                                          break L10;
                                        } else {
                                          if ((var3_ref.field_J & 3) != param0.field_d) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var3_ref.d(0);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var3_ref = (wm) (Object) ((sg) this).field_cb.c((byte) -52);
                                  continue L8;
                                }
                              }
                            } else {
                              if (param0.field_h == -106) {
                                var4 = 0;
                                L11: while (true) {
                                  if (~((sg) this).field_h >= ~var4) {
                                    break L1;
                                  } else {
                                    var3_int = 0;
                                    L12: while (true) {
                                      if (var3_int >= 4) {
                                        var3_int = 0;
                                        L13: while (true) {
                                          if (var3_int >= 3) {
                                            ((sg) this).field_C[var4].field_J = -1;
                                            var4++;
                                            continue L11;
                                          } else {
                                            ((sg) this).field_C[var4].field_hc[var3_int] = -1;
                                            var3_int++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        ((sg) this).field_C[var4].field_Fb[var3_int] = 0;
                                        var3_int++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_int = 0;
                                L14: while (true) {
                                  if (var3_int >= 4) {
                                    var3_int = 0;
                                    L15: while (true) {
                                      if (3 <= var3_int) {
                                        ((sg) this).field_C[param0.field_h].field_J = -1;
                                        break L1;
                                      } else {
                                        ((sg) this).field_C[param0.field_h].field_hc[var3_int] = -1;
                                        var3_int++;
                                        continue L15;
                                      }
                                    }
                                  } else {
                                    ((sg) this).field_C[param0.field_h].field_Fb[var3_int] = 0;
                                    var3_int++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (-114 == param0.field_d) {
                        ((sg) this).field_tb = 255;
                        break L1;
                      } else {
                        ((sg) this).field_D = param0.field_d;
                        if (-101 == param0.field_d) {
                          ((sg) this).field_tb = 0;
                          break L1;
                        } else {
                          ((sg) this).field_tb = 256;
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (param0.field_d == -1) {
                      ((sg) this).field_o = ((sg) this).field_o | 4;
                      break L1;
                    } else {
                      ((sg) this).field_o = ((sg) this).field_o & -5;
                      break L1;
                    }
                  }
                }
              } else {
                var3_int = ((sg) this).field_h;
                ((sg) this).field_z = 1 + param0.field_d;
                ((sg) this).field_h = 1 + param0.field_d;
                var4 = var3_int;
                L16: while (true) {
                  if (var4 >= ((sg) this).field_h) {
                    break L1;
                  } else {
                    ((sg) this).field_C[var4].l(554646678);
                    var4++;
                    continue L16;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("sg.AA(");
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L17;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + 44 + -99 + 41);
        }
    }

    private final void a(int param0) {
        ji var2 = null;
        int var2_int = 0;
        ul var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var5_int = 0;
        Object var6 = null;
        ji var6_ref = null;
        wm var6_ref2 = null;
        ja var6_ref3 = null;
        int var6_int = 0;
        ul var7 = null;
        ja var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        ul stackIn_53_0 = null;
        ul stackIn_63_0 = null;
        ul stackIn_72_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        ul stackOut_52_0 = null;
        ul stackOut_51_0 = null;
        ul stackOut_62_0 = null;
        ul stackOut_61_0 = null;
        ul stackOut_71_0 = null;
        ul stackOut_70_0 = null;
        L0: {
          var6 = null;
          var9 = HoldTheLine.field_D;
          if (((sg) this).field_D == -101) {
            break L0;
          } else {
            L1: {
              var2_int = ((sg) this).field_bb % 60;
              stackOut_1_0 = 10;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (var2_int > 30) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 60 - var2_int;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = var2_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0 + stackIn_4_1 / 2;
              var4_int = (30 + ((sg) this).field_bb) % 60;
              stackOut_4_0 = 10;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var4_int <= 30) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = -var4_int + 60;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              var5_int = stackIn_7_0 + stackIn_7_1 / 2;
              if (-101 >= ((sg) this).field_D) {
                break L3;
              } else {
                if (15 > ((sg) this).field_bb % 30) {
                  L4: {
                    if (((sg) this).field_D >= 0) {
                      stackOut_44_0 = ((sg) this).field_D;
                      stackIn_45_0 = stackOut_44_0;
                      break L4;
                    } else {
                      stackOut_43_0 = ((sg) this).field_sb.length - -((sg) this).field_D;
                      stackIn_45_0 = stackOut_43_0;
                      break L4;
                    }
                  }
                  var6_int = stackIn_45_0;
                  jb.a(((sg) this).field_sb, var6_int, false, 115, bn.field_l, var6_int + 1);
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            if (-106 <= ((sg) this).field_D) {
              var6_ref2 = (wm) (Object) ((sg) this).field_cb.b((byte) 116);
              L5: while (true) {
                if (var6_ref2 == null) {
                  break L0;
                } else {
                  L6: {
                    if (0 == (512 & var6_ref2.field_J)) {
                      break L6;
                    } else {
                      L7: {
                        if (-106 == ((sg) this).field_D) {
                          break L7;
                        } else {
                          if (-((sg) this).field_D + -102 == (3 & var6_ref2.field_J)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      oc.a(var3_int, var6_ref2.field_A.field_f, var6_ref2.field_A.field_h, 16777087, (byte) 109, ((sg) this).field_tb);
                      oc.a(var5_int, var6_ref2.field_A.field_f, var6_ref2.field_A.field_h, 16777087, (byte) 93, ((sg) this).field_tb);
                      break L6;
                    }
                  }
                  var6_ref2 = (wm) (Object) ((sg) this).field_cb.c((byte) -61);
                  continue L5;
                }
              }
            } else {
              if (-111 < ((sg) this).field_D) {
                var6_ref3 = ((sg) this).field_C[-107 + -((sg) this).field_D];
                oc.a(var3_int, var6_ref3.field_A.field_f, var6_ref3.field_A.field_h, 16777087, (byte) -102, ((sg) this).field_tb);
                oc.a(var5_int, var6_ref3.field_A.field_f, var6_ref3.field_A.field_h, 16777087, (byte) 108, ((sg) this).field_tb);
                break L0;
              } else {
                if (((sg) this).field_D == -111) {
                  var6_int = 0;
                  L8: while (true) {
                    if (var6_int >= ((sg) this).field_h) {
                      break L0;
                    } else {
                      var7_ref = ((sg) this).field_C[var6_int];
                      oc.a(var3_int, var7_ref.field_A.field_f, var7_ref.field_A.field_h, 16777087, (byte) -95, ((sg) this).field_tb);
                      oc.a(var5_int, var7_ref.field_A.field_f, var7_ref.field_A.field_h, 16777087, (byte) -92, ((sg) this).field_tb);
                      var6_int++;
                      continue L8;
                    }
                  }
                } else {
                  if (((sg) this).field_D < -113) {
                    break L0;
                  } else {
                    var6_ref2 = (wm) (Object) ((sg) this).field_cb.b((byte) 114);
                    L9: while (true) {
                      if (var6_ref2 == null) {
                        break L0;
                      } else {
                        L10: {
                          if (0 == (var6_ref2.field_J & 32768)) {
                            break L10;
                          } else {
                            L11: {
                              L12: {
                                if (((sg) this).field_D != -112) {
                                  break L12;
                                } else {
                                  if ((var6_ref2.field_J & 3) == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (((sg) this).field_D != -113) {
                                break L10;
                              } else {
                                if ((3 & var6_ref2.field_J) == 1) {
                                  break L11;
                                } else {
                                  var6_ref2 = (wm) (Object) ((sg) this).field_cb.c((byte) -84);
                                  continue L9;
                                }
                              }
                            }
                            var7_int = 0;
                            L13: while (true) {
                              if (var7_int >= 2) {
                                break L10;
                              } else {
                                L14: {
                                  if (var7_int == 0) {
                                    stackOut_27_0 = var3_int;
                                    stackIn_28_0 = stackOut_27_0;
                                    break L14;
                                  } else {
                                    stackOut_26_0 = var5_int;
                                    stackIn_28_0 = stackOut_26_0;
                                    break L14;
                                  }
                                }
                                var8 = stackIn_28_0;
                                tc.e(var6_ref2.field_A.field_h - -(int)(var6_ref2.field_w.field_j * (float)(var6_ref2.field_k - -var8) + var6_ref2.field_w.field_g * (float)(var8 + var6_ref2.field_i)), var6_ref2.field_A.field_f + (int)((float)(var6_ref2.field_k - -var8) * var6_ref2.field_w.field_g - var6_ref2.field_w.field_j * (float)(var6_ref2.field_i + var8)), (int)(var6_ref2.field_w.field_j * (float)(var8 + var6_ref2.field_k) - var6_ref2.field_w.field_g * (float)(var6_ref2.field_i + var8)) + var6_ref2.field_A.field_h, (int)((float)(var8 + var6_ref2.field_i) * var6_ref2.field_w.field_j + (float)(var8 + var6_ref2.field_k) * var6_ref2.field_w.field_g) + var6_ref2.field_A.field_f, 16777087, ((sg) this).field_tb);
                                tc.e(var6_ref2.field_A.field_h - -(int)(var6_ref2.field_w.field_j * (float)(var8 + var6_ref2.field_k) - (float)(var8 + var6_ref2.field_i) * var6_ref2.field_w.field_g), var6_ref2.field_A.field_f - -(int)((float)(var6_ref2.field_k - -var8) * var6_ref2.field_w.field_g + (float)(var6_ref2.field_i + var8) * var6_ref2.field_w.field_j), var6_ref2.field_A.field_h + (int)((float)(var6_ref2.field_k - -var8) * -var6_ref2.field_w.field_j - (float)(var6_ref2.field_i + var8) * var6_ref2.field_w.field_g), var6_ref2.field_A.field_f - -(int)(-var6_ref2.field_w.field_g * (float)(var6_ref2.field_k + var8) + var6_ref2.field_w.field_j * (float)(var8 + var6_ref2.field_i)), 16777087, ((sg) this).field_tb);
                                tc.e((int)(-(var6_ref2.field_w.field_g * (float)(var6_ref2.field_i + var8)) + (float)(var6_ref2.field_k + var8) * -var6_ref2.field_w.field_j) + var6_ref2.field_A.field_h, (int)(-var6_ref2.field_w.field_g * (float)(var6_ref2.field_k - -var8) + (float)(var8 + var6_ref2.field_i) * var6_ref2.field_w.field_j) + var6_ref2.field_A.field_f, var6_ref2.field_A.field_h - -(int)(var6_ref2.field_w.field_g * (float)(var8 + var6_ref2.field_i) + (float)(var6_ref2.field_k - -var8) * -var6_ref2.field_w.field_j), var6_ref2.field_A.field_f + (int)(-var6_ref2.field_w.field_g * (float)(var8 + var6_ref2.field_k) - var6_ref2.field_w.field_j * (float)(var6_ref2.field_i + var8)), 16777087, ((sg) this).field_tb);
                                tc.e((int)(var6_ref2.field_w.field_g * (float)(var6_ref2.field_i - -var8) + -var6_ref2.field_w.field_j * (float)(var6_ref2.field_k + var8)) + var6_ref2.field_A.field_h, var6_ref2.field_A.field_f - -(int)(-((float)(var8 + var6_ref2.field_i) * var6_ref2.field_w.field_j) + -var6_ref2.field_w.field_g * (float)(var8 + var6_ref2.field_k)), var6_ref2.field_A.field_h + (int)(var6_ref2.field_w.field_j * (float)(var8 + var6_ref2.field_k) + (float)(var8 + var6_ref2.field_i) * var6_ref2.field_w.field_g), (int)((float)(var8 + var6_ref2.field_k) * var6_ref2.field_w.field_g - var6_ref2.field_w.field_j * (float)(var6_ref2.field_i + var8)) + var6_ref2.field_A.field_f, 16777087, ((sg) this).field_tb);
                                var7_int++;
                                continue L13;
                              }
                            }
                          }
                        }
                        var6_ref2 = (wm) (Object) ((sg) this).field_cb.c((byte) -84);
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        var2 = mm.field_a[((sg) this).field_mb];
        if (param0 == -3) {
          L15: {
            L16: {
              if (null == var2.field_j) {
                break L16;
              } else {
                if (var2.field_g == null) {
                  break L16;
                } else {
                  L17: {
                    if (((sg) this).field_n != 1) {
                      stackOut_52_0 = var2.field_j;
                      stackIn_53_0 = stackOut_52_0;
                      break L17;
                    } else {
                      stackOut_51_0 = var2.field_g;
                      stackIn_53_0 = stackOut_51_0;
                      break L17;
                    }
                  }
                  var3 = stackIn_53_0;
                  var4_int = 0;
                  L18: while (true) {
                    if (var4_int >= 2) {
                      break L15;
                    } else {
                      L19: {
                        if (~(var3.field_f + -30) <= ~((sg) this).field_C[0].field_A.field_h) {
                          break L19;
                        } else {
                          if (var3.field_f + var3.field_d - -30 <= ((sg) this).field_C[0].field_A.field_h) {
                            break L19;
                          } else {
                            if (var3.field_c + -30 >= ((sg) this).field_C[0].field_A.field_f) {
                              break L19;
                            } else {
                              if (var3.field_c + var3.field_g - -30 > ((sg) this).field_C[0].field_A.field_f) {
                                L20: {
                                  ((sg) this).field_n = 1 + -((sg) this).field_n;
                                  if (((sg) this).field_n == 1) {
                                    stackOut_62_0 = var2.field_g;
                                    stackIn_63_0 = stackOut_62_0;
                                    break L20;
                                  } else {
                                    stackOut_61_0 = var2.field_j;
                                    stackIn_63_0 = stackOut_61_0;
                                    break L20;
                                  }
                                }
                                var3 = stackIn_63_0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      continue L18;
                    }
                  }
                }
              }
            }
            var3 = var2.field_j;
            break L15;
          }
          L21: {
            if (~((sg) this).field_a == ~((sg) this).field_mb) {
              if (var3 != null) {
                this.a(var2.field_h, 0.0f, -11240, var3, var2.field_f);
                break L21;
              } else {
                break L21;
              }
            } else {
              L22: {
                var4 = (float)Math.exp((double)(-0.20000000298023224f * (float)((sg) this).field_k));
                var5 = -var4 + 1.0f;
                if (-1 != ((sg) this).field_a) {
                  L23: {
                    var6_ref = mm.field_a[((sg) this).field_a];
                    if (((sg) this).field_n == 1) {
                      stackOut_71_0 = var6_ref.field_g;
                      stackIn_72_0 = stackOut_71_0;
                      break L23;
                    } else {
                      stackOut_70_0 = var6_ref.field_j;
                      stackIn_72_0 = stackOut_70_0;
                      break L23;
                    }
                  }
                  var7 = stackIn_72_0;
                  if (var7 == null) {
                    break L22;
                  } else {
                    this.a(var6_ref.field_h, var5, param0 + -11237, var7, var6_ref.field_f);
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              if (var3 == null) {
                break L21;
              } else {
                this.a(var2.field_h, var4, param0 ^ 11237, var3, var2.field_f);
                break L21;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, int param4, vk param5, boolean param6) {
        Object var8 = null;
        int var9_int = 0;
        wm var9 = null;
        vf var10_ref_vf = null;
        int var10 = 0;
        qm var10_ref_qm = null;
        int var11_int = 0;
        wm var11 = null;
        int var12 = 0;
        wm var13 = null;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_78_0 = 0;
        ja stackIn_100_0 = null;
        Object stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        Object stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        Object stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        Object stackOut_99_0 = null;
        ja stackOut_98_0 = null;
        Object stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        Object stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        Object stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              int discarded$5 = 9;
              ch.a();
              ((sg) this).field_J = param2;
              ((sg) this).field_kb = false;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param6) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((sg) this).field_E = stackIn_4_1 != 0;
              ((sg) this).field_I = new hj(640, 480);
              int discarded$6 = -69;
              this.c();
              ((sg) this).field_U = false;
              ((sg) this).field_B = 8;
              ((sg) this).field_b = false;
              ((sg) this).field_C = new ja[64];
              ((sg) this).field_P = 0;
              ((sg) this).field_bb = 0;
              ((sg) this).field_S = false;
              ((sg) this).field_ab = -150;
              var8 = null;
              if (((sg) this).field_J != 0) {
                break L2;
              } else {
                if (mi.field_d == 7) {
                  var8 = (Object) (Object) new int[4];
                  var9_int = 0;
                  L3: while (true) {
                    if (var9_int >= 4) {
                      break L2;
                    } else {
                      L4: {
                        if (~var9_int <= ~dk.field_g) {
                          if (~var9_int < ~dk.field_g) {
                            ((int[]) var8)[var9_int] = -var9_int + 4;
                            break L4;
                          } else {
                            ((int[]) var8)[var9_int] = 0;
                            break L4;
                          }
                        } else {
                          ((int[]) var8)[var9_int] = 3 + -var9_int;
                          break L4;
                        }
                      }
                      var9_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L5: {
              this.a((byte) 7, (int[]) var8, param5);
              if (!kb.a(16616, 0)) {
                break L5;
              } else {
                if (2 == ((sg) this).field_J) {
                  ih.field_n = new ah();
                  var9_int = 0;
                  L6: while (true) {
                    if (var9_int >= 200) {
                      break L5;
                    } else {
                      var10_ref_vf = new vf();
                      ih.field_n.a((byte) -94, (hl) (Object) var10_ref_vf);
                      var9_int++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              ((sg) this).field_V = new int[16];
              ((sg) this).field_rb = new int[16];
              ((sg) this).field_rb[6] = -1;
              ((sg) this).field_t = nj.field_d;
              ((sg) this).field_j = 0;
              ((sg) this).field_g = tn.field_c;
              ((sg) this).field_hb = ni.field_b;
              ((sg) this).field_s = 0;
              ((sg) this).field_rb[11] = 1;
              if (((sg) this).field_r == 0) {
                ((sg) this).field_l = 723448452;
                ((sg) this).field_H = -1816277944;
                ((sg) this).field_N = -127488232;
                ((sg) this).field_p = -1996410128;
                break L7;
              } else {
                if (((sg) this).field_r == 1) {
                  ((sg) this).field_N = -1947303144;
                  ((sg) this).field_p = 2016652736;
                  ((sg) this).field_l = -1138652621;
                  ((sg) this).field_H = -1816269752;
                  break L7;
                } else {
                  if (((sg) this).field_r == 2) {
                    ((sg) this).field_N = 1627384728;
                    ((sg) this).field_p = -81247984;
                    ((sg) this).field_H = -2084713400;
                    ((sg) this).field_l = 1752551195;
                    break L7;
                  } else {
                    ((sg) this).field_H = -2084705208;
                    ((sg) this).field_N = 1884993344;
                    ((sg) this).field_p = 1744876195;
                    ((sg) this).field_l = 674154881;
                    break L7;
                  }
                }
              }
            }
            L8: {
              ((sg) this).field_G = 0;
              ((sg) this).field_y = cm.field_a;
              ((sg) this).field_rb[7] = -1;
              if (!param0) {
                break L8;
              } else {
                L9: {
                  if (((sg) this).field_E) {
                    stackOut_31_0 = 2;
                    stackIn_32_0 = stackOut_31_0;
                    break L9;
                  } else {
                    stackOut_30_0 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    break L9;
                  }
                }
                var9_int = stackIn_32_0;
                var10 = -var9_int + ((sg) this).field_h;
                if (var10 > 0) {
                  var11_int = 0;
                  L10: while (true) {
                    if (var11_int >= var10) {
                      break L8;
                    } else {
                      var12 = var9_int;
                      L11: while (true) {
                        if (~var12 <= ~(-1 + ((sg) this).field_z)) {
                          ((sg) this).field_z = ((sg) this).field_z - 1;
                          ((sg) this).field_h = ((sg) this).field_h - 1;
                          var11_int++;
                          continue L10;
                        } else {
                          ((sg) this).field_C[var12] = ((sg) this).field_C[1 + var12];
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L12: {
              if (!((sg) this).field_E) {
                if (5 == ((sg) this).field_J) {
                  break L12;
                } else {
                  if (((sg) this).field_J == 6) {
                    break L12;
                  } else {
                    if (((sg) this).field_J != 4) {
                      ((sg) this).field_C[0].field_W = fd.field_a;
                      if (-1 == param4) {
                        break L12;
                      } else {
                        ((sg) this).field_C[0].a(20385, ge.field_c[param4]);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              } else {
                L13: {
                  ((sg) this).field_C[0].field_W = ae.field_f;
                  ((sg) this).field_C[1].field_W = ij.field_c;
                  if (param4 == -1) {
                    break L13;
                  } else {
                    ((sg) this).field_C[0].a(20385, ge.field_c[param4]);
                    break L13;
                  }
                }
                if (param1 != -1) {
                  ((sg) this).field_C[1].a(20385, ge.field_c[param1]);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            var9_int = 0;
            L14: while (true) {
              if (~var9_int <= ~((sg) this).field_z) {
                L15: {
                  if (((sg) this).field_J != 5) {
                    if (((sg) this).field_J == 6) {
                      var9_int = 0;
                      L16: while (true) {
                        if (8 <= var9_int) {
                          break L15;
                        } else {
                          var10_ref_qm = new qm(0, 0);
                          var11_int = 0;
                          L17: while (true) {
                            var10_ref_qm.field_h = kj.b(2, 640);
                            var10_ref_qm.field_f = kj.b(2, 480);
                            var11_int = ((sg) this).d(var10_ref_qm.field_f, var10_ref_qm.field_h, -118);
                            if (var11_int == 0) {
                              continue L17;
                            } else {
                              L18: {
                                if ((var11_int & 48) == 0) {
                                  if ((var11_int & 12) == 0) {
                                    stackOut_77_0 = -1;
                                    stackIn_78_0 = stackOut_77_0;
                                    break L18;
                                  } else {
                                    stackOut_76_0 = 0;
                                    stackIn_78_0 = stackOut_76_0;
                                    break L18;
                                  }
                                } else {
                                  stackOut_74_0 = 1;
                                  stackIn_78_0 = stackOut_74_0;
                                  break L18;
                                }
                              }
                              var12 = stackIn_78_0;
                              var13 = new wm(var10_ref_qm, 1, var12);
                              ((sg) this).field_cb.a((byte) -120, (hl) (Object) var13);
                              var9_int++;
                              continue L16;
                            }
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  } else {
                    var9 = (wm) (Object) ((sg) this).field_cb.b((byte) 125);
                    L19: while (true) {
                      if (var9 == null) {
                        break L15;
                      } else {
                        L20: {
                          if ((var9.field_J & 512) != 0) {
                            var9.d(0);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var9 = (wm) (Object) ((sg) this).field_cb.c((byte) -57);
                        continue L19;
                      }
                    }
                  }
                }
                var9_int = 0;
                L21: while (true) {
                  if (var9_int >= ((sg) this).field_z) {
                    L22: {
                      ((sg) this).field_mb = -1;
                      ((sg) this).field_a = -1;
                      ((sg) this).field_o = 0;
                      ((sg) this).field_D = -101;
                      if (((sg) this).field_J != 3) {
                        L23: {
                          if (2 != ((sg) this).field_J) {
                            break L23;
                          } else {
                            if (kb.a(16616, 0)) {
                              break L23;
                            } else {
                              if (param6) {
                                break L23;
                              } else {
                                if (!on.field_s) {
                                  break L23;
                                } else {
                                  on.field_s = false;
                                  tn.a(0);
                                  this.b("demolition", (byte) 8);
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        if (((sg) this).field_r != 3) {
                          break L22;
                        } else {
                          if (!ij.field_l) {
                            break L22;
                          } else {
                            if (((sg) this).field_J == 5) {
                              break L22;
                            } else {
                              if (((sg) this).field_J == 6) {
                                break L22;
                              } else {
                                if (((sg) this).field_J != 2) {
                                  ij.field_l = false;
                                  tn.a(0);
                                  this.b("night", (byte) 8);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.e(4);
                        break L22;
                      }
                    }
                    L24: {
                      ((sg) this).field_W = new ah();
                      if (((sg) this).field_J >= 5) {
                        var9 = null;
                        var10 = 0;
                        var11 = (wm) (Object) ((sg) this).field_cb.b((byte) 89);
                        L25: while (true) {
                          if (var11 == null) {
                            int discarded$7 = -15676;
                            sa.a((ee) (Object) var9);
                            break L24;
                          } else {
                            L26: {
                              if (~var11.field_A.field_h >= ~var10) {
                                break L26;
                              } else {
                                var10 = var11.field_A.field_h;
                                var9 = var11;
                                break L26;
                              }
                            }
                            var11 = (wm) (Object) ((sg) this).field_cb.c((byte) -80);
                            continue L25;
                          }
                        }
                      } else {
                        L27: {
                          if (param6) {
                            stackOut_99_0 = null;
                            stackIn_100_0 = (ja) (Object) stackOut_99_0;
                            break L27;
                          } else {
                            stackOut_98_0 = ((sg) this).field_C[0];
                            stackIn_100_0 = stackOut_98_0;
                            break L27;
                          }
                        }
                        int discarded$8 = -15676;
                        sa.a((ee) (Object) stackIn_100_0);
                        break L24;
                      }
                    }
                    break L0;
                  } else {
                    ((sg) this).field_C[var9_int].field_hb = kj.b(2, 3);
                    var9_int++;
                    continue L21;
                  }
                }
              } else {
                L28: {
                  ((sg) this).field_C[var9_int].field_mc = var9_int;
                  if (((sg) this).field_C[var9_int].field_C.field_v == null) {
                    ((sg) this).field_C[var9_int].field_C.field_v = ((sg) this).field_C[var9_int].field_C.field_b.c((byte) 51);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (null != ((sg) this).field_C[var9_int].field_C.field_h) {
                    break L29;
                  } else {
                    ((sg) this).field_C[var9_int].field_C.field_h = ((sg) this).field_C[var9_int].field_C.field_z.c((byte) 7);
                    break L29;
                  }
                }
                var9_int++;
                continue L14;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var8 = (Object) (Object) decompiledCaughtException;
            stackOut_108_0 = var8;
            stackOut_108_1 = new StringBuilder().append("sg.CB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(113).append(44).append(param4).append(44);
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param5 == null) {
              stackOut_110_0 = stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L30;
            } else {
              stackOut_109_0 = stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L30;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + 44 + param6 + 41);
        }
    }

    final void a(wm param0, boolean param1) {
        try {
            param0.d(0);
            rd.a(oa.field_p.field_q, param0.field_A, -78, (el) (Object) oa.field_p);
            jk discarded$0 = kn.a(0, param0.field_A.field_f, 0, 64, 1, -16, param0.field_A.field_h, param0.field_q, ((sg) this).field_M, 16776960, 0, 255, 20);
            int discarded$2 = this.a(-30808, 3, 25, param0, 32, 100000.0f);
            if (param1) {
                this.g(-25);
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sg.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0, ja param1) {
        int var3_int = 0;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var8 = null;
        int var9 = HoldTheLine.field_D;
        try {
            var3_int = 70 + param1.field_C.field_K;
            var4 = param1.field_r;
            var4 = (float)((double)var4 * 10.185916357881302);
            for (var5 = Math.round(var4); var5 < 0; var5 += 64) {
            }
            while (var5 >= 64) {
                var5 -= 64;
            }
            var4 = 6.2831854820251465f * (float)var5 / (float)64;
            var6 = param1.field_A.field_h - -(int)((double)var3_int * Math.cos((double)var4));
            var7 = param1.field_A.field_f + (int)(-Math.sin((double)var4) * (double)var3_int);
            vb.a(-71, ((sg) this).field_I);
            var8 = qk.field_f.a(param1.field_r, 27788);
            pa.a(-(var8.field_v >> 1) + var7, -(var8.field_o >> 1) + var6, 121, var8);
            ug.b(-1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sg.FA(" + 64 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ja var6 = null;
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
        int stackIn_22_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_127_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var18 = HoldTheLine.field_D;
          if (param0 == -109) {
            break L0;
          } else {
            ((sg) this).field_m = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (~var2 <= ~((sg) this).field_h) {
            return;
          } else {
            L2: {
              L3: {
                var6 = ((sg) this).field_C[var2];
                if (0 == ((sg) this).field_J) {
                  break L3;
                } else {
                  if (((sg) this).field_J != 3) {
                    if (((sg) this).field_J != 2) {
                      if (((sg) this).field_J == 1) {
                        if (var6.field_bc <= 0) {
                          break L2;
                        } else {
                          L4: {
                            var7 = var6.field_mc;
                            if (0 != var7) {
                              if (1 != var7) {
                                if (var7 == 2) {
                                  var3 = 10;
                                  var5 = 12;
                                  var4 = 450;
                                  break L4;
                                } else {
                                  var4 = 450;
                                  var5 = 12;
                                  var3 = 575;
                                  break L4;
                                }
                              } else {
                                var5 = 12;
                                var3 = 575;
                                var4 = 10;
                                break L4;
                              }
                            } else {
                              var4 = 10;
                              var3 = 10;
                              var5 = 12;
                              break L4;
                            }
                          }
                          var7 = var6.field_ab / 50;
                          var7 = var7 % 100;
                          var8 = var7 / 10;
                          var9 = var7 % 10;
                          var10 = var6.field_ab % 50 / 5;
                          var11 = 2 * (var6.field_ab % 5);
                          ek.a(-1, 1024, hk.field_a[10 + var8], var3, 16777215, var4);
                          ek.a(-1, 1024, hk.field_a[10 + var9], var5 + var3, 16777215, var4);
                          ek.a(-1, 768, hk.field_a[var10 + 10], var3 - -(var5 * 2), 16777215, var4 + 1);
                          ek.a(-1, 768, hk.field_a[10 - -var11], (11 * var5 >> 2) + var3, 16777215, 1 + var4);
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L5: {
                        var7 = var6.field_mc;
                        if (var7 != 0) {
                          if (var7 == 1) {
                            var3 = 580;
                            var4 = 30;
                            break L5;
                          } else {
                            if (var7 == 2) {
                              var4 = 420;
                              var3 = 10;
                              break L5;
                            } else {
                              var4 = 420;
                              var3 = 580;
                              break L5;
                            }
                          }
                        } else {
                          var4 = 30;
                          var3 = 10;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          var7 = var6.field_tc;
                          if (var6.field_ob > 10) {
                            break L7;
                          } else {
                            if (((sg) this).field_S) {
                              break L7;
                            } else {
                              if (dg.field_c == -1) {
                                stackOut_66_0 = -var6.field_ob + 10;
                                stackIn_67_0 = stackOut_66_0;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_65_0 = 0;
                        stackIn_67_0 = stackOut_65_0;
                        break L6;
                      }
                      L8: {
                        var8 = stackIn_67_0;
                        ek.a(-1, 16 * var8 + 1024, hk.field_a[var6.field_R + 20], var3, var7, var4);
                        var9 = var6.field_mc;
                        if (var9 != 0) {
                          if (var9 != 1) {
                            if (var9 == 2) {
                              var3 = 5;
                              var4 = 453;
                              break L8;
                            } else {
                              var4 = 453;
                              var3 = 615;
                              break L8;
                            }
                          } else {
                            var3 = 615;
                            var4 = 3;
                            break L8;
                          }
                        } else {
                          var3 = 5;
                          var4 = 3;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (var6.field_X > 10) {
                            break L10;
                          } else {
                            if (((sg) this).field_S) {
                              break L10;
                            } else {
                              if (dg.field_c == -1) {
                                stackOut_82_0 = -var6.field_X + 10;
                                stackIn_83_0 = stackOut_82_0;
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        stackOut_81_0 = 0;
                        stackIn_83_0 = stackOut_81_0;
                        break L9;
                      }
                      L11: {
                        var8 = stackIn_83_0;
                        if (!kb.a(16616, 0)) {
                          stackOut_85_0 = 2;
                          stackIn_86_0 = stackOut_85_0;
                          break L11;
                        } else {
                          stackOut_84_0 = 3;
                          stackIn_86_0 = stackOut_84_0;
                          break L11;
                        }
                      }
                      L12: {
                        L13: {
                          var9 = stackIn_86_0;
                          if (var6.field_mc == 0) {
                            break L13;
                          } else {
                            if (var6.field_mc != 2) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var3 = var3 + 12 * var9;
                        break L12;
                      }
                      var10 = var6.field_Sb;
                      var11 = 0;
                      L14: while (true) {
                        if (var9 <= var11) {
                          L15: {
                            var11 = var6.field_mc;
                            if (var11 != 0) {
                              if (1 == var11) {
                                var5 = 1;
                                var4 = 35;
                                var3 = 505;
                                break L15;
                              } else {
                                if (var11 == 2) {
                                  var4 = 425;
                                  var3 = 80;
                                  var5 = 1;
                                  break L15;
                                } else {
                                  var4 = 425;
                                  var5 = 1;
                                  var3 = 505;
                                  break L15;
                                }
                              }
                            } else {
                              var5 = 1;
                              var3 = 80;
                              var4 = 35;
                              break L15;
                            }
                          }
                          var11 = (int)(var6.field_N * 80.0f / (float)var6.field_C.field_i);
                          var12 = (int)(var6.field_lc * 80.0f / (float)var6.field_C.field_i);
                          var13 = 0;
                          L16: while (true) {
                            if (var13 >= 2) {
                              var13 = 0;
                              L17: while (true) {
                                if (20 <= var13) {
                                  var13 = 0;
                                  L18: while (true) {
                                    if (var13 >= 3) {
                                      var13 = 3;
                                      L19: while (true) {
                                        if (var13 >= 20) {
                                          break L2;
                                        } else {
                                          L20: {
                                            if (var11 < 50) {
                                              tc.c(var3 + -(var5 * var13 / 2), var13 + var4, var11, var6.field_Eb, 192);
                                              tc.c(var3 - (var5 * var13 / 2 - var11), var4 - -var13, -var11 + 50, var6.field_Eb >> 1 & 8355711, 192);
                                              break L20;
                                            } else {
                                              tc.c(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb, 192);
                                              break L20;
                                            }
                                          }
                                          var14 = 0;
                                          L21: while (true) {
                                            if (3 <= var14) {
                                              L22: {
                                                if (~var11 >= ~var12) {
                                                  break L22;
                                                } else {
                                                  tc.c(-(var5 * var13 / 2) + var3 - -var12, var4 + var13, -var12 + var11, 16777215, 256);
                                                  break L22;
                                                }
                                              }
                                              var13++;
                                              continue L19;
                                            } else {
                                              L23: {
                                                if (var14 % 2 != 0) {
                                                  stackOut_126_0 = var6.field_Eb;
                                                  stackIn_127_0 = stackOut_126_0;
                                                  break L23;
                                                } else {
                                                  stackOut_125_0 = 16777215;
                                                  stackIn_127_0 = stackOut_125_0;
                                                  break L23;
                                                }
                                              }
                                              L24: {
                                                var15 = stackIn_127_0;
                                                var16 = (var15 & 16711422) >> 1;
                                                var17 = 80 + (-30 + 10 * var14);
                                                if (~var11 <= ~var17) {
                                                  if (var17 + 10 > var11) {
                                                    tc.c(var3 + var17 - var13 * var5 / 2, var13 + var4, -var17 + var11, var15, 192);
                                                    tc.c(var3 + var11 - var5 * var13 / 2, var4 - -var13, 10 - (-var17 + var11), var16, 192);
                                                    break L24;
                                                  } else {
                                                    tc.c(var3 + var17 + -(var13 * var5 / 2), var4 - -var13, 10, var15, 192);
                                                    break L24;
                                                  }
                                                } else {
                                                  tc.c(var3 + var17 - var5 * var13 / 2, var4 - -var13, 10, var16, 192);
                                                  break L24;
                                                }
                                              }
                                              var14++;
                                              continue L21;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      tc.b(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb);
                                      var14 = 0;
                                      L25: while (true) {
                                        if (3 <= var14) {
                                          var13++;
                                          continue L18;
                                        } else {
                                          L26: {
                                            stackOut_112_0 = 80 + (var3 - (-(var14 * 10) + (30 - -(var13 * var5 / 2))));
                                            stackOut_112_1 = var13 + var4;
                                            stackOut_112_2 = 10;
                                            stackIn_114_0 = stackOut_112_0;
                                            stackIn_114_1 = stackOut_112_1;
                                            stackIn_114_2 = stackOut_112_2;
                                            stackIn_113_0 = stackOut_112_0;
                                            stackIn_113_1 = stackOut_112_1;
                                            stackIn_113_2 = stackOut_112_2;
                                            if (0 == var14 % 2) {
                                              stackOut_114_0 = stackIn_114_0;
                                              stackOut_114_1 = stackIn_114_1;
                                              stackOut_114_2 = stackIn_114_2;
                                              stackOut_114_3 = 16777215;
                                              stackIn_115_0 = stackOut_114_0;
                                              stackIn_115_1 = stackOut_114_1;
                                              stackIn_115_2 = stackOut_114_2;
                                              stackIn_115_3 = stackOut_114_3;
                                              break L26;
                                            } else {
                                              stackOut_113_0 = stackIn_113_0;
                                              stackOut_113_1 = stackIn_113_1;
                                              stackOut_113_2 = stackIn_113_2;
                                              stackOut_113_3 = var6.field_Eb;
                                              stackIn_115_0 = stackOut_113_0;
                                              stackIn_115_1 = stackOut_113_1;
                                              stackIn_115_2 = stackOut_113_2;
                                              stackIn_115_3 = stackOut_113_3;
                                              break L26;
                                            }
                                          }
                                          tc.b(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_115_3);
                                          var14++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  tc.b(-2 + (-(var5 * var13 / 2) + var3), var4 + var13, 2, 0);
                                  tc.b(-(var5 * var13 / 2) + (80 + var3), var4 + var13, 2, 0);
                                  var13++;
                                  continue L17;
                                }
                              }
                            } else {
                              tc.b((var13 + 1) * var5 / 2 + var3 - 2, -1 + (var4 + -var13), 84, 0);
                              tc.b(-2 + (var3 - var5 * (var13 - -20) / 2), var4 + (20 - -var13), 84, 0);
                              var13++;
                              continue L16;
                            }
                          }
                        } else {
                          var12 = var10 % 10;
                          pd.a(hk.field_a[var12 + 10], -95, var4, var3 + -(12 * var11), 1024 + var8 * 16, var7);
                          var10 = var10 / 10;
                          var11++;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L27: {
                var7 = var6.field_mc;
                if (var7 != 0) {
                  if (var7 == 1) {
                    var3 = 580;
                    var4 = 30;
                    break L27;
                  } else {
                    if (var7 == 2) {
                      var3 = 10;
                      var4 = 420;
                      break L27;
                    } else {
                      var3 = 580;
                      var4 = 420;
                      break L27;
                    }
                  }
                } else {
                  var4 = 30;
                  var3 = 10;
                  break L27;
                }
              }
              L28: {
                L29: {
                  var7 = var6.field_tc;
                  if (var6.field_ob > 10) {
                    break L29;
                  } else {
                    if (((sg) this).field_S) {
                      break L29;
                    } else {
                      if (dg.field_c == -1) {
                        stackOut_21_0 = -var6.field_ob + 10;
                        stackIn_22_0 = stackOut_21_0;
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_22_0 = stackOut_20_0;
                break L28;
              }
              L30: {
                var8 = stackIn_22_0;
                ek.a(-1, 1024 + var8 * 16, hk.field_a[20 + var6.field_R], var3, var7, var4);
                var9 = var6.field_mc;
                if (var9 != 0) {
                  if (var9 == 1) {
                    var4 = 3;
                    var3 = 615;
                    break L30;
                  } else {
                    if (var9 == 2) {
                      var4 = 453;
                      var3 = 5;
                      break L30;
                    } else {
                      var3 = 615;
                      var4 = 453;
                      break L30;
                    }
                  }
                } else {
                  var4 = 3;
                  var3 = 5;
                  break L30;
                }
              }
              L31: {
                L32: {
                  var9 = var6.field_bc % 10;
                  if (10 < var6.field_X) {
                    break L32;
                  } else {
                    if (((sg) this).field_S) {
                      break L32;
                    } else {
                      if (dg.field_c != -1) {
                        break L32;
                      } else {
                        stackOut_34_0 = 10 + -var6.field_X;
                        stackIn_36_0 = stackOut_34_0;
                        break L31;
                      }
                    }
                  }
                }
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L31;
              }
              L33: {
                var8 = stackIn_36_0;
                if (((sg) this).field_B >= var6.field_bc) {
                  break L33;
                } else {
                  if (((sg) this).field_B == -1) {
                    break L33;
                  } else {
                    var9 = ((sg) this).field_B;
                    if (10 > ((sg) this).field_bb % 20) {
                      var7 = 16777215;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                pd.a(hk.field_a[var9 + 10], -100, var4, var3, 1024 - -(var8 * 16), var7);
                var10 = var6.field_mc;
                if (var10 != 0) {
                  if (var10 == 1) {
                    var3 = 576;
                    var4 = 3;
                    break L34;
                  } else {
                    if (2 == var10) {
                      var3 = 22;
                      var4 = 453;
                      break L34;
                    } else {
                      var3 = 577;
                      var4 = 453;
                      break L34;
                    }
                  }
                } else {
                  var4 = 3;
                  var3 = 20;
                  break L34;
                }
              }
              hk.field_a[24].a(var3, var4);
              break L2;
            }
            var2++;
            continue L1;
          }
        }
    }

    private final void a(int param0, na param1) {
        hj var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 32381;
              ok.a();
              ((sg) this).field_I.f();
              var3 = de.field_Q;
              pa.a(-(var3.field_y >> 1) + param1.field_n, param1.field_l + -(var3.field_s >> 1), 103, var3);
              ug.b(-1);
              if (param0 < -24) {
                break L1;
              } else {
                ((sg) this).field_W = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("sg.AB(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void e() {
        this.g(0);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          L1: {
            var2 = 264;
            var3 = 22;
            var4 = ((sg) this).field_ab;
            var5 = ((sg) this).field_ab;
            if (((sg) this).field_J == 0) {
              break L1;
            } else {
              if (3 == ((sg) this).field_J) {
                break L1;
              } else {
                if (((sg) this).field_J != 1) {
                  break L0;
                } else {
                  if (0 < ((sg) this).field_ab) {
                    var5 = ((sg) this).field_C[0].field_X;
                    var4 = ((sg) this).field_C[0].field_X;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!((sg) this).field_U) {
            break L0;
          } else {
            var4 = ((sg) this).field_ob;
            break L0;
          }
        }
        L2: {
          if (((sg) this).field_ab < 0) {
            var4 = -((sg) this).field_ab;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            var6 = var4 / 50;
            var7 = var6 / 60;
            var6 = var6 % 60;
            var8 = var7 / 10 % 10;
            var9 = var7 % 10;
            var10 = var6 / 10;
            var11 = var6 % 10;
            var12 = var4 % 50 / 5;
            var13 = 2 * (var4 % 5);
            var14 = oa.a(50, var5, -3248);
            if (((sg) this).field_U) {
              break L4;
            } else {
              if (var14 > 10) {
                break L4;
              } else {
                stackOut_13_0 = -(var14 / 2) + 5;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L3;
        }
        L5: {
          L6: {
            var15 = stackIn_15_0;
            var16 = oa.a(500, var5, -3248);
            if (((sg) this).field_U) {
              break L6;
            } else {
              if (var16 > 10) {
                break L6;
              } else {
                stackOut_17_0 = -(var16 / 2) + 5;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
          }
          stackOut_18_0 = 0;
          stackIn_19_0 = stackOut_18_0;
          break L5;
        }
        L7: {
          L8: {
            var17 = stackIn_19_0;
            var18 = oa.a(3000, var5, -3248);
            if (((sg) this).field_U) {
              break L8;
            } else {
              if (var18 > 10) {
                break L8;
              } else {
                stackOut_21_0 = -(var18 / 2) + 5;
                stackIn_23_0 = stackOut_21_0;
                break L7;
              }
            }
          }
          stackOut_22_0 = 0;
          stackIn_23_0 = stackOut_22_0;
          break L7;
        }
        L9: {
          L10: {
            var19 = stackIn_23_0;
            var20 = oa.a(30000, var5, -3248);
            if (((sg) this).field_U) {
              break L10;
            } else {
              if (var20 <= 10) {
                stackOut_27_0 = 5 - var20 / 2;
                stackIn_28_0 = stackOut_27_0;
                break L9;
              } else {
                break L10;
              }
            }
          }
          stackOut_26_0 = 0;
          stackIn_28_0 = stackOut_26_0;
          break L9;
        }
        L11: {
          L12: {
            var21 = stackIn_28_0;
            if (((sg) this).field_S) {
              break L12;
            } else {
              if (dg.field_c != -1) {
                break L12;
              } else {
                break L11;
              }
            }
          }
          var17 = 0;
          var19 = 0;
          var21 = 0;
          var15 = 0;
          break L11;
        }
        L13: {
          if (((sg) this).field_ab < 0) {
            stackOut_34_0 = 16760576;
            stackIn_35_0 = stackOut_34_0;
            break L13;
          } else {
            stackOut_33_0 = 16777215;
            stackIn_35_0 = stackOut_33_0;
            break L13;
          }
        }
        var22 = stackIn_35_0;
        ek.a(-1, 1024, hk.field_a[27], var3 * 2 + var2, var22, 20);
        ek.a(-1, 64 * var21 + 1024, hk.field_a[var8], var2, var22, 10);
        ek.a(-1, var19 * 64 + 1024, hk.field_a[0 - -var9], var3 + var2, var22, 10);
        ek.a(-1, 1024 + var17 * 64, hk.field_a[var10], 8 + (2 * var3 + var2), var22, 10);
        ek.a(-1, var15 * 64 + 1024, hk.field_a[var11], 8 + var2 - -(var3 * 3), var22, 10);
        ek.a(-1, 768, hk.field_a[var12], var2 + (4 * var3 - -8), var22, 11);
        ek.a(-1, 768, hk.field_a[0 - -var13], 8 + ((19 * var3 >> 2) + var2), var22, 11);
    }

    public static void d(int param0) {
        field_v = null;
        if (param0 != -26919) {
            sg.d(-48);
        }
        field_gb = null;
        field_Y = null;
        field_Z = null;
        field_K = null;
    }

    private final qm a(int param0, int param1, hj param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        qm stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        qm stackOut_41_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            param1 = param1 + param2.field_u;
            if (param1 < 640) {
              if (param1 > -param2.field_s) {
                param0 = param0 + param2.field_x;
                if (param0 < 480) {
                  if (-param2.field_y < param0) {
                    L1: {
                      if (param1 <= 0) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L1;
                      } else {
                        stackOut_12_0 = param1;
                        stackIn_14_0 = stackOut_12_0;
                        break L1;
                      }
                    }
                    L2: {
                      var6_int = stackIn_14_0;
                      var7 = param2.field_s + param1;
                      if (var7 > 640) {
                        var7 = 640;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param0 <= 0) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_18_0 = param0;
                        stackIn_20_0 = stackOut_18_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_20_0;
                      var9 = param2.field_y + param0;
                      if (var9 > 480) {
                        var9 = 480;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var7 = var7 - var6_int;
                      var9 = var9 - var8;
                      var10 = var8 * 640 + var6_int;
                      var11 = 640 - var7;
                      var12 = var6_int - (param1 - (-param0 + var8) * param2.field_s);
                      var13 = param2.field_s + -var7;
                      var14 = ((sg) this).field_lb.field_m;
                      if (param4 >= 1) {
                        stackOut_27_0 = 60;
                        stackIn_28_0 = stackOut_27_0;
                        break L5;
                      } else {
                        if (param4 <= -1) {
                          stackOut_26_0 = 15;
                          stackIn_28_0 = stackOut_26_0;
                          break L5;
                        } else {
                          stackOut_25_0 = 63;
                          stackIn_28_0 = stackOut_25_0;
                          break L5;
                        }
                      }
                    }
                    var15 = stackIn_28_0;
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                    var6_int = var6_int + var7;
                    var8 = var8 + var9;
                    var19 = param2.field_z;
                    var20 = -var9;
                    L6: while (true) {
                      if (var20 >= 0) {
                        if (var18 != 0) {
                          stackOut_41_0 = new qm(var16 / var18 + (var7 + param1), var17 / var18 + var9 + param0);
                          stackIn_42_0 = stackOut_41_0;
                          break L0;
                        } else {
                          return null;
                        }
                      } else {
                        var21 = -var7;
                        L7: while (true) {
                          if (var21 >= 0) {
                            var10 = var10 + var11;
                            var12 = var12 + var13;
                            var20++;
                            continue L6;
                          } else {
                            L8: {
                              if (var19[var12] == 0) {
                                break L8;
                              } else {
                                if (0 == (var15 & var14[var10])) {
                                  var16 = var16 + var21;
                                  var17 = var17 + var20;
                                  var18++;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var12++;
                            var10++;
                            var21++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (qm) (Object) stackIn_10_0;
                  }
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (qm) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var6;
            stackOut_43_1 = new StringBuilder().append("sg.U(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + -95 + 44 + param4 + 41);
        }
        return stackIn_42_0;
    }

    private final void b(int param0, ja param1) {
        try {
            if (!(param1.field_kb != null)) {
                param1.field_kb = sf.a(param1.field_C.field_d, (byte) 27, param1.field_Eb);
            }
            vb.a(-67, ((sg) this).field_I);
            pa.a(param1.field_A.field_f - (param1.field_kb.field_y >> 1), param1.field_A.field_h + -(param1.field_kb.field_s >> 1), 108, param1.field_kb);
            ug.b(-1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sg.HA(" + 32249 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = 5;
          if (null != ((sg) this).field_O) {
            eb.a(false, ((sg) this).field_O);
            break L0;
          } else {
            ((sg) this).field_O = new ah[var2];
            var3 = 0;
            L1: while (true) {
              if (~((sg) this).field_O.length >= ~var3) {
                break L0;
              } else {
                ((sg) this).field_O[var3] = new ah();
                var3++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (((sg) this).field_q != null) {
            eb.a(false, ((sg) this).field_q);
            break L2;
          } else {
            ((sg) this).field_q = new ah[var2];
            var3 = 0;
            L3: while (true) {
              if (var3 >= ((sg) this).field_q.length) {
                break L2;
              } else {
                ((sg) this).field_q[var3] = new ah();
                var3++;
                continue L3;
              }
            }
          }
        }
        L4: {
          if (((sg) this).field_M != null) {
            eb.a(false, ((sg) this).field_M);
            break L4;
          } else {
            ((sg) this).field_M = new ah[var2];
            var3 = 0;
            L5: while (true) {
              if (~((sg) this).field_M.length >= ~var3) {
                break L4;
              } else {
                ((sg) this).field_M[var3] = new ah();
                var3++;
                continue L5;
              }
            }
          }
        }
        ((sg) this).field_Q = new ah();
        var3 = 0;
    }

    private final void a(wm param0, ja param1) {
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            int discarded$1 = 32758;
            if (!im.a((ee) (Object) param1, (ee) (Object) param0)) {
              return;
            } else {
              L1: {
                if ((3 & param0.field_J) == 0) {
                  var4_float = param1.field_x * param0.field_w.field_g + param1.field_t * param0.field_w.field_j;
                  if (-1.0f > var4_float) {
                    if (var4_float >= -5.0f) {
                      break L1;
                    } else {
                      param1.field_x = param1.field_x * 0.949999988079071f;
                      param1.field_t = param1.field_t * 0.949999988079071f;
                      break L1;
                    }
                  } else {
                    param1.field_t = param1.field_t + param0.field_w.field_j * 2.0f;
                    param1.field_x = param1.field_x + 2.0f * param0.field_w.field_g;
                    break L1;
                  }
                } else {
                  if (1 != (3 & param0.field_J)) {
                    if ((3 & param0.field_J) == 2) {
                      var4_int = (int)(param1.field_y - (float)param1.field_C.field_K * param1.field_w.field_j);
                      var5 = (int)(param1.field_u - (float)param1.field_C.field_K * param1.field_w.field_g);
                      if (~(param0.field_B * param0.field_B) < ~((-param0.field_A.field_h + var4_int) * (-param0.field_A.field_h + var4_int) + (-param0.field_A.field_f + var5) * (var5 - param0.field_A.field_f))) {
                        param1.field_Q = 50;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    var4_float = param0.field_w.field_g * param1.field_x + param1.field_t * param0.field_w.field_j;
                    if (10.0f < var4_float) {
                      param1.field_t = param1.field_t * 0.949999988079071f;
                      param1.field_x = param1.field_x * 0.949999988079071f;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("sg.O(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          L3: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 7 + 41);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        vf var4_ref = null;
        int var4_int = 0;
        wm var4_ref2 = null;
        wm var5 = null;
        int var5_int = 0;
        ja var5_ref = null;
        na var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        wm stackIn_44_0 = null;
        wm stackIn_45_0 = null;
        wm stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackIn_231_0 = null;
        Object stackIn_232_0 = null;
        Object stackIn_233_0 = null;
        int stackIn_233_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        wm stackOut_43_0 = null;
        wm stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        wm stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_78_0 = null;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_230_0 = null;
        Object stackOut_232_0 = null;
        int stackOut_232_1 = 0;
        Object stackOut_231_0 = null;
        int stackOut_231_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        L0: {
          var4 = null;
          var13 = HoldTheLine.field_D;
          if (((sg) this).field_mb == -1) {
            break L0;
          } else {
            this.b(31782);
            break L0;
          }
        }
        L1: {
          if (5 <= ((sg) this).field_J) {
            break L1;
          } else {
            L2: while (true) {
              if (!qh.c(-64)) {
                break L1;
              } else {
                if (aa.field_n != 13) {
                  L3: {
                    if (mg.field_c) {
                      L4: {
                        if (aa.field_n == 1) {
                          L5: {
                            if (kb.field_c) {
                              stackOut_12_0 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              break L5;
                            } else {
                              stackOut_11_0 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              break L5;
                            }
                          }
                          kb.field_c = stackIn_13_0 != 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (2 == aa.field_n) {
                          L7: {
                            stackOut_16_0 = this;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (((sg) this).field_kb) {
                              stackOut_18_0 = this;
                              stackOut_18_1 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              break L7;
                            } else {
                              stackOut_17_0 = this;
                              stackOut_17_1 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              break L7;
                            }
                          }
                          ((sg) this).field_kb = stackIn_19_1 != 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        if (!lk.field_g[82]) {
                          L9: {
                            if (5 != aa.field_n) {
                              break L9;
                            } else {
                              boolean discarded$20 = ((sg) this).field_C[0].c(3, 0);
                              l.field_b = true;
                              break L9;
                            }
                          }
                          L10: {
                            if (aa.field_n == 6) {
                              boolean discarded$21 = ((sg) this).field_C[0].c(3, 1);
                              l.field_b = true;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          if (aa.field_n == 7) {
                            boolean discarded$22 = ((sg) this).field_C[0].c(3, 2);
                            l.field_b = true;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          if (aa.field_n != 9) {
                            L11: {
                              var4_int = -1;
                              if (aa.field_n == 5) {
                                var4_int = 0;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (aa.field_n == 6) {
                                var4_int = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              if (7 != aa.field_n) {
                                break L13;
                              } else {
                                var4_int = 2;
                                break L13;
                              }
                            }
                            L14: {
                              if (aa.field_n != 8) {
                                break L14;
                              } else {
                                var4_int = 3;
                                break L14;
                              }
                            }
                            L15: {
                              if (-1 == var4_int) {
                                break L15;
                              } else {
                                l.field_b = true;
                                var5 = (wm) (Object) ((sg) this).field_cb.b((byte) 112);
                                L16: while (true) {
                                  if (var5 == null) {
                                    break L15;
                                  } else {
                                    L17: {
                                      if (0 != (512 & var5.field_J)) {
                                        L18: {
                                          var5.field_J = var5.field_J & -4;
                                          var5.field_J = var5.field_J | var4_int;
                                          stackOut_43_0 = (wm) var5;
                                          stackIn_45_0 = stackOut_43_0;
                                          stackIn_44_0 = stackOut_43_0;
                                          if (3 != var4_int) {
                                            stackOut_45_0 = (wm) (Object) stackIn_45_0;
                                            stackOut_45_1 = 2 + var4_int;
                                            stackIn_46_0 = stackOut_45_0;
                                            stackIn_46_1 = stackOut_45_1;
                                            break L18;
                                          } else {
                                            stackOut_44_0 = (wm) (Object) stackIn_44_0;
                                            stackOut_44_1 = 1;
                                            stackIn_46_0 = stackOut_44_0;
                                            stackIn_46_1 = stackOut_44_1;
                                            break L18;
                                          }
                                        }
                                        stackIn_46_0.field_E = ci.a(stackIn_46_1, (byte) 17);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    var5 = (wm) (Object) ((sg) this).field_cb.c((byte) -72);
                                    continue L16;
                                  }
                                }
                              }
                            }
                            break L8;
                          } else {
                            var4_ref2 = (wm) (Object) ((sg) this).field_cb.b((byte) 110);
                            L19: while (true) {
                              if (var4_ref2 == null) {
                                l.field_b = true;
                                break L8;
                              } else {
                                L20: {
                                  if ((var4_ref2.field_J & 512) == 0) {
                                    break L20;
                                  } else {
                                    var4_ref2.d(0);
                                    break L20;
                                  }
                                }
                                var4_ref2 = (wm) (Object) ((sg) this).field_cb.c((byte) 127);
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (aa.field_n != 12) {
                          break L21;
                        } else {
                          L22: {
                            stackOut_58_0 = this;
                            stackIn_60_0 = stackOut_58_0;
                            stackIn_59_0 = stackOut_58_0;
                            if (((sg) this).field_T) {
                              stackOut_60_0 = this;
                              stackOut_60_1 = 0;
                              stackIn_61_0 = stackOut_60_0;
                              stackIn_61_1 = stackOut_60_1;
                              break L22;
                            } else {
                              stackOut_59_0 = this;
                              stackOut_59_1 = 1;
                              stackIn_61_0 = stackOut_59_0;
                              stackIn_61_1 = stackOut_59_1;
                              break L22;
                            }
                          }
                          ((sg) this).field_T = stackIn_61_1 != 0;
                          l.field_b = true;
                          break L21;
                        }
                      }
                      L23: {
                        if (aa.field_n != 10) {
                          break L23;
                        } else {
                          var2 = 1;
                          L24: while (true) {
                            if (~var2 <= ~((sg) this).field_h) {
                              l.field_b = true;
                              break L23;
                            } else {
                              ((sg) this).field_C[var2].field_bc = ((sg) this).field_B;
                              var2++;
                              continue L24;
                            }
                          }
                        }
                      }
                      L25: {
                        if (aa.field_n != 11) {
                          break L25;
                        } else {
                          l.field_b = true;
                          ((sg) this).field_C[0].field_bc = ((sg) this).field_B;
                          break L25;
                        }
                      }
                      L26: {
                        if (27 == aa.field_n) {
                          L27: {
                            stackOut_71_0 = this;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_72_0 = stackOut_71_0;
                            if (((sg) this).field_c) {
                              stackOut_73_0 = this;
                              stackOut_73_1 = 0;
                              stackIn_74_0 = stackOut_73_0;
                              stackIn_74_1 = stackOut_73_1;
                              break L27;
                            } else {
                              stackOut_72_0 = this;
                              stackOut_72_1 = 1;
                              stackIn_74_0 = stackOut_72_0;
                              stackIn_74_1 = stackOut_72_1;
                              break L27;
                            }
                          }
                          ((sg) this).field_c = stackIn_74_1 != 0;
                          l.field_b = true;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L28: {
                        if (28 != aa.field_n) {
                          break L28;
                        } else {
                          l.field_b = true;
                          ((sg) this).field_C[0].field_W = null;
                          break L28;
                        }
                      }
                      if (aa.field_n != 89) {
                        break L3;
                      } else {
                        L29: {
                          stackOut_78_0 = this;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_79_0 = stackOut_78_0;
                          if (((sg) this).field_f) {
                            stackOut_80_0 = this;
                            stackOut_80_1 = 0;
                            stackIn_81_0 = stackOut_80_0;
                            stackIn_81_1 = stackOut_80_1;
                            break L29;
                          } else {
                            stackOut_79_0 = this;
                            stackOut_79_1 = 1;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            break L29;
                          }
                        }
                        ((sg) this).field_f = stackIn_81_1 != 0;
                        l.field_b = true;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L30: {
                    if (aa.field_n == 84) {
                      ((sg) this).field_o = ((sg) this).field_o | 1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (aa.field_n != 83) {
                      break L31;
                    } else {
                      ((sg) this).field_o = ((sg) this).field_o | 2;
                      break L31;
                    }
                  }
                  if (aa.field_n % 2 == 0) {
                    ((sg) this).field_l = ((sg) this).field_l + 1;
                    ((sg) this).field_t = ((sg) this).field_t + 1;
                    ((sg) this).field_y = ((sg) this).field_y - 1;
                    ((sg) this).field_N = ((sg) this).field_N - ((sg) this).field_p * ((sg) this).field_H;
                    continue L2;
                  } else {
                    ((sg) this).field_N = ((sg) this).field_N + ((sg) this).field_l * ((sg) this).field_H;
                    ((sg) this).field_t = ((sg) this).field_t + ((sg) this).field_hb;
                    ((sg) this).field_p = ((sg) this).field_p - 1;
                    ((sg) this).field_g = ((sg) this).field_g + 1;
                    continue L2;
                  }
                } else {
                  pg.a(1, (byte) 100, true);
                  wm.a(true, false, 1);
                  return;
                }
              }
            }
          }
        }
        L32: {
          ((sg) this).field_bb = ((sg) this).field_bb + 1;
          if (ih.field_n != null) {
            var4_ref = (vf) (Object) ih.field_n.b((byte) 113);
            L33: while (true) {
              if (var4_ref == null) {
                break L32;
              } else {
                var4_ref.g(-19895);
                var4_ref = (vf) (Object) ih.field_n.c((byte) -43);
                continue L33;
              }
            }
          } else {
            break L32;
          }
        }
        L34: {
          if (((sg) this).field_fb <= 0) {
            break L34;
          } else {
            int fieldTemp$23 = ((sg) this).field_G + 1;
            ((sg) this).field_G = ((sg) this).field_G + 1;
            if (170 > fieldTemp$23) {
              break L34;
            } else {
              var2 = 0;
              L35: while (true) {
                if (((sg) this).field_fb + -1 <= var2) {
                  ((sg) this).field_G = 0;
                  ((sg) this).field_fb = ((sg) this).field_fb - 1;
                  break L34;
                } else {
                  ((sg) this).field_V[var2] = ((sg) this).field_V[1 + var2];
                  var2++;
                  continue L35;
                }
              }
            }
          }
        }
        L36: {
          if (((sg) this).field_j <= 0) {
            break L36;
          } else {
            int fieldTemp$24 = ((sg) this).field_s + 1;
            ((sg) this).field_s = ((sg) this).field_s + 1;
            if (50 > fieldTemp$24) {
              break L36;
            } else {
              var2 = 0;
              L37: while (true) {
                if (~(-1 + ((sg) this).field_j) >= ~var2) {
                  ((sg) this).field_j = ((sg) this).field_j - 1;
                  ((sg) this).field_R = null;
                  ((sg) this).field_s = 0;
                  break L36;
                } else {
                  ((sg) this).field_ib[var2] = ((sg) this).field_ib[1 + var2];
                  var2++;
                  continue L37;
                }
              }
            }
          }
        }
        if (((sg) this).field_S) {
          return;
        } else {
          var2 = 0;
          L38: while (true) {
            if (~((sg) this).field_z >= ~var2) {
              L39: {
                if (((sg) this).field_ab <= 0) {
                  break L39;
                } else {
                  var2 = 0;
                  L40: while (true) {
                    if (var2 >= ((sg) this).field_z) {
                      break L39;
                    } else {
                      L41: {
                        if (null != ((sg) this).field_C[var2]) {
                          ((sg) this).field_C[var2].j(0);
                          this.a(((sg) this).field_C[var2], 0.019999999552965164f * ((sg) this).field_C[var2].field_j, 0, 3.5f * ((sg) this).field_C[var2].field_t * 0.019999999552965164f, ((sg) this).field_C[var2].field_x * 3.5f * 0.019999999552965164f);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      var2++;
                      continue L40;
                    }
                  }
                }
              }
              var2 = 0;
              L42: while (true) {
                if (~((sg) this).field_z >= ~var2) {
                  L43: {
                    if (param0 <= -35) {
                      break L43;
                    } else {
                      this.a((byte) 52);
                      break L43;
                    }
                  }
                  L44: {
                    if (null == ih.field_n) {
                      break L44;
                    } else {
                      var2 = 0;
                      L45: while (true) {
                        if (var2 >= ((sg) this).field_h) {
                          break L44;
                        } else {
                          var4_ref = (vf) (Object) ih.field_n.b((byte) 113);
                          L46: while (true) {
                            if (var4_ref == null) {
                              var2++;
                              continue L45;
                            } else {
                              this.a(var4_ref, -103, ((sg) this).field_C[var2]);
                              var4_ref = (vf) (Object) ih.field_n.c((byte) -73);
                              continue L46;
                            }
                          }
                        }
                      }
                    }
                  }
                  var4_ref2 = (wm) (Object) ((sg) this).field_cb.b((byte) 86);
                  L47: while (true) {
                    if (var4_ref2 == null) {
                      var4_ref2 = (wm) (Object) ((sg) this).field_d.b((byte) 127);
                      L48: while (true) {
                        if (var4_ref2 == null) {
                          ((sg) this).field_W.a(-30510, ((sg) this).field_cb);
                          var2 = 0;
                          L49: while (true) {
                            if (var2 >= 5) {
                              L50: {
                                if (((sg) this).field_J == 0) {
                                  var5_int = 0;
                                  var2 = 0;
                                  L51: while (true) {
                                    if (~var2 <= ~((sg) this).field_h) {
                                      L52: {
                                        if (((sg) this).field_U) {
                                          break L52;
                                        } else {
                                          if (var5_int == 0) {
                                            ((sg) this).field_U = true;
                                            ((sg) this).field_ob = ((sg) this).field_ab;
                                            int discarded$25 = 53;
                                            this.a(ee.field_o);
                                            if (((sg) this).field_E) {
                                              L53: {
                                                if (((sg) this).field_C[0].field_R == 0) {
                                                  break L53;
                                                } else {
                                                  if (((sg) this).field_C[1].field_R != 0) {
                                                    qh.a(0, 2);
                                                    break L52;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                              qh.a(0, 1);
                                              break L52;
                                            } else {
                                              L54: {
                                                stackOut_230_0 = this;
                                                stackIn_232_0 = stackOut_230_0;
                                                stackIn_231_0 = stackOut_230_0;
                                                if (((sg) this).field_C[0].field_R != 0) {
                                                  stackOut_232_0 = this;
                                                  stackOut_232_1 = 0;
                                                  stackIn_233_0 = stackOut_232_0;
                                                  stackIn_233_1 = stackOut_232_1;
                                                  break L54;
                                                } else {
                                                  stackOut_231_0 = this;
                                                  stackOut_231_1 = 1;
                                                  stackIn_233_0 = stackOut_231_0;
                                                  stackIn_233_1 = stackOut_231_1;
                                                  break L54;
                                                }
                                              }
                                              L55: {
                                                ((sg) this).field_b = stackIn_233_1 != 0;
                                                if (!((sg) this).field_b) {
                                                  break L55;
                                                } else {
                                                  L56: {
                                                    if (((sg) this).field_rb[11] == 1) {
                                                      ((sg) this).a(11, 244, (byte) -60);
                                                      break L56;
                                                    } else {
                                                      break L56;
                                                    }
                                                  }
                                                  L57: {
                                                    if (((sg) this).field_rb[8] != 1) {
                                                      break L57;
                                                    } else {
                                                      ((sg) this).a(8, 247, (byte) -38);
                                                      break L57;
                                                    }
                                                  }
                                                  L58: {
                                                    if (1 == ((sg) this).field_rb[9]) {
                                                      ((sg) this).a(9, 246, (byte) 99);
                                                      break L58;
                                                    } else {
                                                      break L58;
                                                    }
                                                  }
                                                  L59: {
                                                    if (((sg) this).field_rb[10] == 1) {
                                                      ((sg) this).a(10, 245, (byte) 99);
                                                      break L59;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                  if (((sg) this).field_rb[12] == 1) {
                                                    ((sg) this).a(12, 243, (byte) 100);
                                                    break L55;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                              }
                                              L60: {
                                                if (((sg) this).field_C[0].field_R >= 2) {
                                                  qh.a(0, 2);
                                                  break L60;
                                                } else {
                                                  qh.a(0, 1);
                                                  break L60;
                                                }
                                              }
                                              if (7 != mi.field_d) {
                                                break L52;
                                              } else {
                                                if (2 <= ((sg) this).field_C[0].field_R) {
                                                  break L52;
                                                } else {
                                                  if (~(pc.field_l[cf.field_w] + -1) == ~vg.field_P) {
                                                    L61: {
                                                      var6 = hn.field_y - -((sg) this).field_ob;
                                                      if (cf.field_w != 0) {
                                                        break L61;
                                                      } else {
                                                        if (22500 > var6) {
                                                          ((sg) this).a(2, 253, (byte) -119);
                                                          break L61;
                                                        } else {
                                                          break L61;
                                                        }
                                                      }
                                                    }
                                                    L62: {
                                                      if (cf.field_w == 1) {
                                                        if (30500 <= var6) {
                                                          break L62;
                                                        } else {
                                                          ((sg) this).a(4, 251, (byte) 119);
                                                          break L62;
                                                        }
                                                      } else {
                                                        break L62;
                                                      }
                                                    }
                                                    L63: {
                                                      if (cf.field_w != 2) {
                                                        break L63;
                                                      } else {
                                                        if (var6 >= 29000) {
                                                          break L63;
                                                        } else {
                                                          ((sg) this).a(3, 252, (byte) -34);
                                                          break L63;
                                                        }
                                                      }
                                                    }
                                                    L64: {
                                                      if (cf.field_w == 3) {
                                                        if (var6 < 34000) {
                                                          ((sg) this).a(5, 250, (byte) -105);
                                                          break L64;
                                                        } else {
                                                          break L64;
                                                        }
                                                      } else {
                                                        break L64;
                                                      }
                                                    }
                                                    tg.a(cf.field_w, 5, var6);
                                                    var7_int = 1;
                                                    var8 = 0;
                                                    var2 = 0;
                                                    L65: while (true) {
                                                      L66: {
                                                        if (4 <= var2) {
                                                          break L66;
                                                        } else {
                                                          if (d.field_c[var2] != -1) {
                                                            var8 = var8 + d.field_c[var2];
                                                            var2++;
                                                            continue L65;
                                                          } else {
                                                            var7_int = 0;
                                                            break L66;
                                                          }
                                                        }
                                                      }
                                                      L67: {
                                                        if (var7_int == 0) {
                                                          break L67;
                                                        } else {
                                                          ((sg) this).a(0, 255, (byte) -94);
                                                          if (var8 < 109500) {
                                                            ((sg) this).a(1, 254, (byte) -83);
                                                            break L67;
                                                          } else {
                                                            break L52;
                                                          }
                                                        }
                                                      }
                                                      break L52;
                                                    }
                                                  } else {
                                                    break L52;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      var2 = 0;
                                      L68: while (true) {
                                        if (~var2 <= ~((sg) this).field_h) {
                                          break L50;
                                        } else {
                                          L69: {
                                            if (((sg) this).field_P >= ((sg) this).field_C[var2].field_bc) {
                                              break L69;
                                            } else {
                                              ((sg) this).field_P = ((sg) this).field_C[var2].field_bc;
                                              if (~((sg) this).field_P != ~((sg) this).field_B) {
                                                break L69;
                                              } else {
                                                int discarded$26 = 53;
                                                this.a(hc.field_d);
                                                break L69;
                                              }
                                            }
                                          }
                                          var2++;
                                          continue L68;
                                        }
                                      }
                                    } else {
                                      L70: {
                                        if (~((sg) this).field_C[var2].field_bc < ~((sg) this).field_B) {
                                          break L70;
                                        } else {
                                          if (((sg) this).field_C[var2].field_W != null) {
                                            var5_int = 1;
                                            break L70;
                                          } else {
                                            break L70;
                                          }
                                        }
                                      }
                                      var2++;
                                      continue L51;
                                    }
                                  }
                                } else {
                                  if (((sg) this).field_J == 2) {
                                    var5_int = 0;
                                    var2 = 0;
                                    L71: while (true) {
                                      if (~var2 <= ~((sg) this).field_h) {
                                        L72: {
                                          if (((sg) this).field_U) {
                                            break L72;
                                          } else {
                                            if (var5_int != 0) {
                                              ((sg) this).field_ob = ((sg) this).field_ab;
                                              ((sg) this).field_U = true;
                                              int discarded$27 = 53;
                                              this.a(ee.field_o);
                                              if (2 > ((sg) this).field_C[0].field_R) {
                                                qh.a(0, 1);
                                                break L72;
                                              } else {
                                                qh.a(0, 2);
                                                break L72;
                                              }
                                            } else {
                                              break L72;
                                            }
                                          }
                                        }
                                        var2 = 0;
                                        L73: while (true) {
                                          if (((sg) this).field_h <= var2) {
                                            if (((sg) this).field_e < ((sg) this).field_P) {
                                              L74: {
                                                if (!kb.a(16616, 0)) {
                                                  L75: {
                                                    if (((sg) this).field_P == 3) {
                                                      int discarded$28 = 53;
                                                      this.a(ij.field_n);
                                                      break L75;
                                                    } else {
                                                      break L75;
                                                    }
                                                  }
                                                  if (4 == ((sg) this).field_P) {
                                                    int discarded$29 = 53;
                                                    this.a(pd.field_g);
                                                    break L74;
                                                  } else {
                                                    break L74;
                                                  }
                                                } else {
                                                  var6 = 25;
                                                  L76: while (true) {
                                                    if (var6 > 100) {
                                                      break L74;
                                                    } else {
                                                      L77: {
                                                        var7_int = 5 - var6;
                                                        if (((sg) this).field_e >= var7_int) {
                                                          break L77;
                                                        } else {
                                                          if (~((sg) this).field_P > ~var7_int) {
                                                            break L77;
                                                          } else {
                                                            int discarded$30 = 1;
                                                            int discarded$31 = 53;
                                                            this.a(sd.a(ag.field_p, new String[1]));
                                                            break L74;
                                                          }
                                                        }
                                                      }
                                                      var6 += 25;
                                                      continue L76;
                                                    }
                                                  }
                                                }
                                              }
                                              ((sg) this).field_e = ((sg) this).field_P;
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          } else {
                                            L78: {
                                              if (~((sg) this).field_P > ~((sg) this).field_C[var2].field_Sb) {
                                                ((sg) this).field_P = ((sg) this).field_C[var2].field_Sb;
                                                break L78;
                                              } else {
                                                break L78;
                                              }
                                            }
                                            var2++;
                                            continue L73;
                                          }
                                        }
                                      } else {
                                        L79: {
                                          if (((sg) this).field_C[var2].field_Sb < 5) {
                                            break L79;
                                          } else {
                                            var5_int = 1;
                                            if (var2 != 0) {
                                              break L79;
                                            } else {
                                              if (((sg) this).field_E) {
                                                break L79;
                                              } else {
                                                if (!kb.a(16616, 0)) {
                                                  break L79;
                                                } else {
                                                  ((sg) this).a(15, 240, (byte) 118);
                                                  break L79;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var2++;
                                        continue L71;
                                      }
                                    }
                                  } else {
                                    if (((sg) this).field_J != 3) {
                                      break L50;
                                    } else {
                                      L80: {
                                        if (((sg) this).field_B != -1) {
                                          var5_int = 0;
                                          var2 = 0;
                                          L81: while (true) {
                                            if (var2 >= ((sg) this).field_h) {
                                              if (((sg) this).field_U) {
                                                break L80;
                                              } else {
                                                if (var5_int != 0) {
                                                  break L80;
                                                } else {
                                                  ((sg) this).field_U = true;
                                                  ((sg) this).field_ob = ((sg) this).field_ab;
                                                  int discarded$32 = 53;
                                                  this.a(ee.field_o);
                                                  qh.a(0, 1);
                                                  break L80;
                                                }
                                              }
                                            } else {
                                              L82: {
                                                if (~((sg) this).field_B > ~((sg) this).field_C[var2].field_bc) {
                                                  break L82;
                                                } else {
                                                  if (null == ((sg) this).field_C[var2].field_W) {
                                                    break L82;
                                                  } else {
                                                    var5_int = 1;
                                                    break L82;
                                                  }
                                                }
                                              }
                                              var2++;
                                              continue L81;
                                            }
                                          }
                                        } else {
                                          break L80;
                                        }
                                      }
                                      var2 = 0;
                                      L83: while (true) {
                                        if (~var2 <= ~((sg) this).field_h) {
                                          break L50;
                                        } else {
                                          L84: {
                                            if (((sg) this).field_P < ((sg) this).field_C[var2].field_bc) {
                                              ((sg) this).field_P = ((sg) this).field_C[var2].field_bc;
                                              if (~((sg) this).field_B != ~((sg) this).field_P) {
                                                break L84;
                                              } else {
                                                int discarded$33 = 53;
                                                this.a(hc.field_d);
                                                break L84;
                                              }
                                            } else {
                                              break L84;
                                            }
                                          }
                                          var2++;
                                          continue L83;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L85: {
                                if (!((sg) this).field_U) {
                                  break L85;
                                } else {
                                  if (-((sg) this).field_ob + ((sg) this).field_ab < 150) {
                                    break L85;
                                  } else {
                                    if (((sg) this).field_T) {
                                      break L85;
                                    } else {
                                      if (((sg) this).field_J == 3) {
                                        break L85;
                                      } else {
                                        if (((sg) this).field_fb == 0) {
                                          qn.a(7, false, false);
                                          break L85;
                                        } else {
                                          break L85;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L86: {
                                if (((sg) this).field_r != 3) {
                                  break L86;
                                } else {
                                  if (((sg) this).field_J == 2) {
                                    break L86;
                                  } else {
                                    var2 = 0;
                                    L87: while (true) {
                                      if (~((sg) this).field_w.length >= ~var2) {
                                        var2 = 0;
                                        L88: while (true) {
                                          if (~var2 <= ~((sg) this).field_h) {
                                            break L86;
                                          } else {
                                            L89: {
                                              var5_ref = ((sg) this).field_C[var2];
                                              if (null != var5_ref.field_W) {
                                                var6 = var5_ref.field_Eb;
                                                var7 = 0.0f;
                                                var3 = 0;
                                                L90: while (true) {
                                                  if (~var3 <= ~(int)var5_ref.field_Ib) {
                                                    L91: {
                                                      if ((int)var5_ref.field_Ib != ((sg) this).field_sb.length) {
                                                        var7 = var7 + ((sg) this).field_sb[(int)var5_ref.field_Ib].f(50) * (var5_ref.field_Ib - (float)(int)var5_ref.field_Ib);
                                                        break L91;
                                                      } else {
                                                        break L91;
                                                      }
                                                    }
                                                    var8 = (int)(var7 / ((sg) this).field_A);
                                                    var3 = 1;
                                                    L92: while (true) {
                                                      if (4 <= var3) {
                                                        break L89;
                                                      } else {
                                                        var9 = (var3 + var8) % ((sg) this).field_w.length;
                                                        var10 = (float)(-((sg) this).field_x[var9] + var5_ref.field_A.field_h);
                                                        var11 = (float)(var5_ref.field_A.field_f - ((sg) this).field_u[var9]);
                                                        var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
                                                        var10 = var10 / var12;
                                                        var11 = var11 / var12;
                                                        ((sg) this).field_eb[var9] = this.c(((sg) this).field_eb[var9], 6293, var6);
                                                        var3++;
                                                        continue L92;
                                                      }
                                                    }
                                                  } else {
                                                    var7 = var7 + ((sg) this).field_sb[var3].f(50);
                                                    var3++;
                                                    continue L90;
                                                  }
                                                }
                                              } else {
                                                break L89;
                                              }
                                            }
                                            var2++;
                                            continue L88;
                                          }
                                        }
                                      } else {
                                        ((sg) this).field_eb[var2] = 0;
                                        var2++;
                                        continue L87;
                                      }
                                    }
                                  }
                                }
                              }
                              L93: {
                                L94: {
                                  if (!kb.a(16616, 0)) {
                                    break L94;
                                  } else {
                                    if (2 == ((sg) this).field_J) {
                                      L95: {
                                        if (((sg) this).field_ab != -100) {
                                          break L95;
                                        } else {
                                          int discarded$34 = 53;
                                          this.a(vj.field_n);
                                          break L95;
                                        }
                                      }
                                      if (((sg) this).field_ab != 0) {
                                        break L93;
                                      } else {
                                        int discarded$35 = 53;
                                        this.a(il.field_b);
                                        break L93;
                                      }
                                    } else {
                                      break L94;
                                    }
                                  }
                                }
                                L96: {
                                  if (((sg) this).field_ab == -100) {
                                    int discarded$36 = 53;
                                    this.a(cj.field_L);
                                    break L96;
                                  } else {
                                    break L96;
                                  }
                                }
                                L97: {
                                  if (-50 == ((sg) this).field_ab) {
                                    int discarded$37 = 53;
                                    this.a(io.field_a);
                                    break L97;
                                  } else {
                                    break L97;
                                  }
                                }
                                if (((sg) this).field_ab != 0) {
                                  break L93;
                                } else {
                                  int discarded$38 = 53;
                                  this.a(il.field_b);
                                  break L93;
                                }
                              }
                              L98: {
                                int fieldTemp$39 = ((sg) this).field_ab + 1;
                                ((sg) this).field_ab = ((sg) this).field_ab + 1;
                                if (fieldTemp$39 <= 0) {
                                  break L98;
                                } else {
                                  if (!((sg) this).field_U) {
                                    ((sg) this).field_t = ((sg) this).field_t + ((sg) this).field_hb;
                                    ((sg) this).field_N = ((sg) this).field_N - ((sg) this).field_p * ((sg) this).field_l;
                                    ((sg) this).field_H = ((sg) this).field_H + 1;
                                    ((sg) this).field_y = ((sg) this).field_y - (hn.field_y + (((sg) this).field_ab + ((sg) this).field_g));
                                    ((sg) this).field_hb = ((sg) this).field_hb - 1;
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                              }
                              L99: {
                                if (((sg) this).field_ab > -50) {
                                  break L99;
                                } else {
                                  if (((sg) this).field_r == 3) {
                                    var5_ref2 = (na) (Object) ((sg) this).field_Q.b((byte) 104);
                                    L100: while (true) {
                                      if (var5_ref2 == null) {
                                        break L99;
                                      } else {
                                        L101: {
                                          if (var5_ref2.field_j) {
                                            if (~kj.b(2, 400) <= ~(-50 + -((sg) this).field_ab)) {
                                              break L101;
                                            } else {
                                              var5_ref2.field_j = false;
                                              break L101;
                                            }
                                          } else {
                                            if (kj.b(2, 400) < ((sg) this).field_ab + 150) {
                                              var5_ref2.field_j = true;
                                              break L101;
                                            } else {
                                              var5_ref2 = (na) (Object) ((sg) this).field_Q.c((byte) 96);
                                              continue L100;
                                            }
                                          }
                                        }
                                        var5_ref2 = (na) (Object) ((sg) this).field_Q.c((byte) 96);
                                        continue L100;
                                      }
                                    }
                                  } else {
                                    break L99;
                                  }
                                }
                              }
                              return;
                            } else {
                              this.a(false, ((sg) this).field_O[var2]);
                              this.a(false, ((sg) this).field_M[var2]);
                              this.a(false, ((sg) this).field_q[var2]);
                              var2++;
                              continue L49;
                            }
                          }
                        } else {
                          var4_ref2.g(0);
                          var4_ref2 = (wm) (Object) ((sg) this).field_d.c((byte) 95);
                          continue L48;
                        }
                      }
                    } else {
                      L102: {
                        var4_ref2.g(0);
                        if ((8 & var4_ref2.field_J) == 0) {
                          stackOut_148_0 = 0;
                          stackIn_149_0 = stackOut_148_0;
                          break L102;
                        } else {
                          stackOut_147_0 = 1;
                          stackIn_149_0 = stackOut_147_0;
                          break L102;
                        }
                      }
                      L103: {
                        stackOut_149_0 = stackIn_149_0;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if ((var4_ref2.field_J & 4) == 0) {
                          stackOut_151_0 = stackIn_151_0;
                          stackOut_151_1 = 0;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L103;
                        } else {
                          stackOut_150_0 = stackIn_150_0;
                          stackOut_150_1 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L103;
                        }
                      }
                      L104: {
                        if ((stackIn_152_0 & stackIn_152_1) != 0) {
                          this.a(-1, var4_ref2);
                          break L104;
                        } else {
                          break L104;
                        }
                      }
                      var4_ref2 = (wm) (Object) ((sg) this).field_cb.c((byte) -95);
                      continue L47;
                    }
                  }
                } else {
                  L105: {
                    if (((sg) this).field_C[var2] != null) {
                      var3 = 1 + var2;
                      L106: while (true) {
                        L107: {
                          if (~((sg) this).field_z >= ~var3) {
                            break L107;
                          } else {
                            L108: {
                              if (null == ((sg) this).field_C[var3]) {
                                break L108;
                              } else {
                                this.a(0, ((sg) this).field_C[var3], ((sg) this).field_C[var2]);
                                break L108;
                              }
                            }
                            if (((sg) this).field_C[var2] == null) {
                              break L107;
                            } else {
                              var3++;
                              continue L106;
                            }
                          }
                        }
                        if (((sg) this).field_C[var2] == null) {
                          break L105;
                        } else {
                          ((sg) this).field_C[var2].b((byte) 56);
                          break L105;
                        }
                      }
                    } else {
                      break L105;
                    }
                  }
                  var2++;
                  continue L42;
                }
              }
            } else {
              L109: {
                if (((sg) this).field_C[var2] == null) {
                  break L109;
                } else {
                  ((sg) this).field_C[var2].g(-1245);
                  break L109;
                }
              }
              var2++;
              continue L38;
            }
          }
        }
    }

    private final void d(wm param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param0.d(0);
                rd.a(u.field_O.field_q, param0.field_A, -124, (el) (Object) u.field_O);
                jk discarded$3 = kn.a(0, param0.field_A.field_f, 0, 128, 1, -1, param0.field_A.field_h, 3, ((sg) this).field_M, 16777215, 0, 32, 400);
                jk discarded$4 = kn.a(0, param0.field_A.field_f, 0, 128, 1, -4, param0.field_A.field_h, 3, ((sg) this).field_M, 16777215, 0, 128, 60);
                jk discarded$5 = kn.a(0, param0.field_A.field_f, 0, 128, 1, -8, param0.field_A.field_h, 3, ((sg) this).field_M, 16777215, 0, 255, 20);
                var3_int = this.a(-30808, 4, 250, param0, 32, 200000.0f);
                var4 = param0.field_J & 3;
                if (0 != var4) {
                  break L2;
                } else {
                  if (((sg) this).field_E) {
                    break L2;
                  } else {
                    if (var3_int >= 3) {
                      ((sg) this).a(13, 242, (byte) 112);
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("sg.L(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 28977 + 41);
        }
    }

    final boolean a(int param0, boolean param1, qm param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = ((sg) this).a(param0, param2.field_h, -3, param2.field_f);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("sg.K(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(String param0, float param1, int param2, ul param3, String param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6_int = param3.field_f;
              var7 = param3.field_c;
              var8 = param3.field_d;
              if (var8 != -1) {
                break L1;
              } else {
                var8 = 480;
                break L1;
              }
            }
            L2: {
              var9 = param3.field_g;
              if (var9 == -1) {
                var9 = 13 + (nm.field_c.d(param0, var8) * 20 - -(18 * HoldTheLine.field_F.d(param4, var8)));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 != var6_int) {
                break L3;
              } else {
                var6_int = -var8 + 640 >> 1;
                break L3;
              }
            }
            L4: {
              if (-1 != var7) {
                break L4;
              } else {
                var7 = 100;
                break L4;
              }
            }
            L5: {
              var10 = param3.field_b;
              if (0 != var10) {
                if (var10 == 1) {
                  var6_int = (int)((float)var6_int + param1 * (float)(-var6_int + 680));
                  break L5;
                } else {
                  if (var10 != 2) {
                    if (3 == var10) {
                      var7 = (int)((float)var7 + param1 * (float)(-var7 + 520));
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    var7 = (int)((float)var7 - param1 * (float)(var9 + var7 - -40));
                    break L5;
                  }
                }
              } else {
                var6_int = (int)((float)var6_int - param1 * (float)(var6_int + (var8 - -40)));
                break L5;
              }
            }
            L6: {
              mk.a(var8, var9, var7, (byte) -42, var6_int);
              var10 = var7;
              var11 = nm.field_c.d(param0, var8);
              int discarded$2 = nm.field_c.a(param0, var6_int, var10, var8, 20 * var11, 0, -1, 1, 0, 20);
              var10 = var10 + (5 + 20 * var11);
              int discarded$3 = HoldTheLine.field_F.a(param4, var6_int, var10, var8, var9, 0, -1, 1, 0, 18);
              if (param2 == -11240) {
                break L6;
              } else {
                ((sg) this).field_o = 33;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("sg.UA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        jk var3 = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        param1++;
        var3 = (jk) (Object) ((sg) this).field_O[param1].b((byte) 118);
        L0: while (true) {
          if (var3 == null) {
            var3 = (jk) (Object) ((sg) this).field_M[param1].b((byte) 99);
            L1: while (true) {
              if (var3 == null) {
                var3 = (jk) (Object) ((sg) this).field_q[param1].b((byte) 87);
                L2: while (true) {
                  if (var3 == null) {
                    L3: {
                      if (((sg) this).field_r == 3) {
                        vb.a(-76, ((sg) this).field_I);
                        var3 = (jk) (Object) ((sg) this).field_O[param1].b((byte) 94);
                        L4: while (true) {
                          if (var3 == null) {
                            var3 = (jk) (Object) ((sg) this).field_M[param1].b((byte) 120);
                            L5: while (true) {
                              if (var3 == null) {
                                var3 = (jk) (Object) ((sg) this).field_q[param1].b((byte) 85);
                                L6: while (true) {
                                  if (var3 == null) {
                                    ug.b(-1);
                                    break L3;
                                  } else {
                                    tc.e(var3.field_t - var3.field_u >> 10, var3.field_k >> 10, var3.field_t + var3.field_u >> 10, var3.field_k >> 10, 16777215, var3.field_q >> 2);
                                    tc.e(var3.field_t >> 10, -var3.field_u + var3.field_k >> 10, var3.field_t >> 10, var3.field_u + var3.field_k >> 10, 16777215, var3.field_q >> 2);
                                    var3 = (jk) (Object) ((sg) this).field_q[param1].c((byte) -32);
                                    continue L6;
                                  }
                                }
                              } else {
                                tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, 16777215, var3.field_q >> 2);
                                var3 = (jk) (Object) ((sg) this).field_M[param1].c((byte) -84);
                                continue L5;
                              }
                            }
                          } else {
                            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, 16777215, var3.field_q >> 2);
                            var3 = (jk) (Object) ((sg) this).field_O[param1].c((byte) -68);
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    tc.e(-var3.field_u + var3.field_t >> 10, var3.field_k >> 10, var3.field_u + var3.field_t >> 10, var3.field_k >> 10, var3.field_o, var3.field_q >> 2);
                    tc.e(var3.field_t >> 10, var3.field_k + -var3.field_u >> 10, var3.field_t >> 10, var3.field_k - -var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
                    var3 = (jk) (Object) ((sg) this).field_q[param1].c((byte) -44);
                    continue L2;
                  }
                }
              } else {
                tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
                var3 = (jk) (Object) ((sg) this).field_M[param1].c((byte) 88);
                continue L1;
              }
            }
          } else {
            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
            var3 = (jk) (Object) ((sg) this).field_O[param1].c((byte) -23);
            continue L0;
          }
        }
    }

    private final void g(int param0) {
        ((sg) this).field_qb.b(0, param0);
    }

    final void a() {
        int var1 = 0;
        int var2 = 0;
        wm var3 = null;
        na var4 = null;
        vf var4_ref = null;
        int var4_int = 0;
        L0: {
          if (((sg) this).field_r != 3) {
            break L0;
          } else {
            if (!kb.a(16616, 0)) {
              var1 = 307200;
              L1: while (true) {
                if (var1 <= 0) {
                  break L0;
                } else {
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = 0;
                  continue L1;
                }
              }
            } else {
              var2 = ((sg) this).field_F * 65793;
              var1 = 307200;
              L2: while (true) {
                if (var1 <= 0) {
                  break L0;
                } else {
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  var1--;
                  ((sg) this).field_I.field_z[var1] = var2;
                  continue L2;
                }
              }
            }
          }
        }
        int discarded$7 = 106;
        this.e();
        var2 = -1;
        L3: while (true) {
          if (var2 > 3) {
            L4: {
              if (!kb.a(16616, 0)) {
                break L4;
              } else {
                int discarded$8 = 1;
                this.a((long)((sg) this).field_bb);
                break L4;
              }
            }
            L5: {
              if (((sg) this).field_r != 3) {
                break L5;
              } else {
                if (((sg) this).field_c) {
                  break L5;
                } else {
                  int discarded$9 = -96;
                  this.b();
                  break L5;
                }
              }
            }
            L6: {
              if (((sg) this).field_J >= 5) {
                break L6;
              } else {
                this.c(-16);
                break L6;
              }
            }
            if (((sg) this).field_mb == -1) {
              return;
            } else {
              this.a(-3);
              return;
            }
          } else {
            var3 = (wm) (Object) ((sg) this).field_d.b((byte) 102);
            L7: while (true) {
              if (var3 == null) {
                var3 = (wm) (Object) ((sg) this).field_d.b((byte) 105);
                L8: while (true) {
                  if (var3 == null) {
                    L9: {
                      if (((sg) this).field_r != 3) {
                        break L9;
                      } else {
                        if (((sg) this).field_J == 2) {
                          break L9;
                        } else {
                          var1 = 0;
                          L10: while (true) {
                            if (var1 >= ((sg) this).field_w.length) {
                              break L9;
                            } else {
                              L11: {
                                if (((sg) this).field_sb[((sg) this).field_w[var1]].field_k != var2) {
                                  break L11;
                                } else {
                                  if (((sg) this).field_eb[var1] == 0) {
                                    break L11;
                                  } else {
                                    tc.f(((sg) this).field_x[var1] - 1, ((sg) this).field_u[var1] - 1, 3, 3, ((sg) this).field_eb[var1]);
                                    int discarded$10 = 32381;
                                    ok.a();
                                    ((sg) this).field_I.f();
                                    tc.f(((sg) this).field_x[var1] - 1, ((sg) this).field_u[var1] - 1, 3, 3, 16777215);
                                    ug.b(-1);
                                    break L11;
                                  }
                                }
                              }
                              var1++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    var4 = (na) (Object) ((sg) this).field_Q.b((byte) 94);
                    L12: while (true) {
                      if (var4 == null) {
                        var3 = (wm) (Object) ((sg) this).field_cb.b((byte) 114);
                        L13: while (true) {
                          if (var3 == null) {
                            var1 = 0;
                            L14: while (true) {
                              if (var1 >= ((sg) this).field_h) {
                                L15: {
                                  if (ih.field_n == null) {
                                    break L15;
                                  } else {
                                    if (var2 != 0) {
                                      break L15;
                                    } else {
                                      var4_ref = (vf) (Object) ih.field_n.b((byte) 105);
                                      L16: while (true) {
                                        if (var4_ref == null) {
                                          break L15;
                                        } else {
                                          var4_ref.d((byte) -99);
                                          var4_ref = (vf) (Object) ih.field_n.c((byte) -59);
                                          continue L16;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3 = (wm) (Object) ((sg) this).field_cb.b((byte) 126);
                                L17: while (true) {
                                  if (var3 == null) {
                                    var1 = 0;
                                    L18: while (true) {
                                      if (var1 >= ((sg) this).field_z) {
                                        L19: {
                                          if (((sg) this).field_r != 3) {
                                            break L19;
                                          } else {
                                            var1 = 0;
                                            L20: while (true) {
                                              if (var1 >= ((sg) this).field_h) {
                                                break L19;
                                              } else {
                                                L21: {
                                                  if (((sg) this).field_C[var1] == null) {
                                                    break L21;
                                                  } else {
                                                    if (((sg) this).field_C[var1].field_q != var2) {
                                                      break L21;
                                                    } else {
                                                      this.a(64, ((sg) this).field_C[var1]);
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                var1++;
                                                continue L20;
                                              }
                                            }
                                          }
                                        }
                                        this.a(false, var2);
                                        var2++;
                                        continue L3;
                                      } else {
                                        L22: {
                                          if (((sg) this).field_C[var1] == null) {
                                            break L22;
                                          } else {
                                            if (((sg) this).field_C[var1].field_q != var2) {
                                              break L22;
                                            } else {
                                              int discarded$11 = 101;
                                              this.a(((sg) this).field_C[var1]);
                                              break L22;
                                            }
                                          }
                                        }
                                        var1++;
                                        continue L18;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      if (var3.field_q != var2) {
                                        break L23;
                                      } else {
                                        this.a(var3, 122);
                                        break L23;
                                      }
                                    }
                                    var3 = (wm) (Object) ((sg) this).field_cb.c((byte) -108);
                                    continue L17;
                                  }
                                }
                              } else {
                                L24: {
                                  if (((sg) this).field_C[var1] == null) {
                                    break L24;
                                  } else {
                                    if (((sg) this).field_C[var1].field_q != var2) {
                                      break L24;
                                    } else {
                                      var4_int = 0;
                                      L25: while (true) {
                                        if (var4_int >= 8) {
                                          break L24;
                                        } else {
                                          this.a(var4_int, -403, ((sg) this).field_C[var1]);
                                          var4_int++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                var1++;
                                continue L14;
                              }
                            }
                          } else {
                            L26: {
                              if (var3.field_q != var2) {
                                break L26;
                              } else {
                                int discarded$12 = 8192;
                                this.b(var3);
                                break L26;
                              }
                            }
                            var3 = (wm) (Object) ((sg) this).field_cb.c((byte) 127);
                            continue L13;
                          }
                        }
                      } else {
                        L27: {
                          if (!var4.field_j) {
                            break L27;
                          } else {
                            if (var4.field_m != var2) {
                              break L27;
                            } else {
                              this.a(-28, var4);
                              break L27;
                            }
                          }
                        }
                        var4 = (na) (Object) ((sg) this).field_Q.c((byte) -125);
                        continue L12;
                      }
                    }
                  } else {
                    L28: {
                      if (var3.field_q != var2) {
                        break L28;
                      } else {
                        this.a(var3, 115);
                        break L28;
                      }
                    }
                    var3 = (wm) (Object) ((sg) this).field_d.c((byte) -59);
                    continue L8;
                  }
                }
              } else {
                L29: {
                  if (var3.field_q != var2) {
                    break L29;
                  } else {
                    int discarded$13 = -127;
                    this.c(var3);
                    break L29;
                  }
                }
                var3 = (wm) (Object) ((sg) this).field_d.c((byte) -126);
                continue L7;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param1 >= 0) {
            if (0 <= param3) {
                if (param1 < 640) {
                    if (param3 < 480) {
                        var5 = ((sg) this).field_lb.field_m[param3 * 640 + param1] & 85;
                        if (param0 >= 1) {
                            var5 = var5 & 60;
                        }
                        if (!(param0 > -1)) {
                            var5 = var5 & 15;
                        }
                        return var5 != 0 ? true : false;
                    }
                }
            }
        }
        if (param2 != -3) {
            Object var6 = null;
            this.b((String) null, (byte) -127);
        }
        return b.a(false, param1, param3, ((sg) this).field_jb);
    }

    final static void b(boolean param0) {
        if (!(kb.b(92))) {
            return;
        }
        pe.a(4, param0, (byte) 35);
    }

    private final void b(int param0, int param1, int param2) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        qm var12 = null;
        in var13 = null;
        qm var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var17 = HoldTheLine.field_D;
        var4 = ((sg) this).field_C[0].field_vb;
        var5 = ce.a(-1, (wc[]) (Object) ((sg) this).field_sb) / (float)(param1 - -1);
        var6 = (int)var4;
        var7 = ((sg) this).field_sb[var6].f(50);
        var8 = (-var4 + (float)(var6 + 1)) * var7;
        var9 = var5;
        var10 = 0;
        L0: while (true) {
          if (~var10 <= ~param1) {
            return;
          } else {
            L1: while (true) {
              if (var9 <= var8) {
                var8 = var8 - var9;
                var9 = var5;
                var11 = -(var8 / var7) + 1.0f;
                var12 = ((sg) this).field_sb[var6].a(false, var11);
                var13 = ((sg) this).field_sb[var6].a((byte) 125, var11);
                var14 = new qm(var12);
                var15 = -1;
                L2: while (true) {
                  if (var15 > 1) {
                    var10++;
                    continue L0;
                  } else {
                    L3: {
                      var14.field_f = var12.field_f + -(int)((float)(30 * var15) * var13.field_j);
                      var14.field_h = (int)(var13.field_g * (float)(var15 * 30)) + var12.field_h;
                      if (param2 != -1) {
                        if (param2 == 3) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L3;
                        } else {
                          stackOut_11_0 = param2 + 1;
                          stackIn_13_0 = stackOut_11_0;
                          break L3;
                        }
                      } else {
                        stackOut_9_0 = 3 & var10 + (var15 + 1);
                        stackIn_13_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    var16 = stackIn_13_0;
                    ((sg) this).field_cb.a((byte) -64, (hl) (Object) new wm(var14, var16 + 1, -1));
                    var15++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  var6++;
                  if (~var6 != ~((sg) this).field_sb.length) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
                var9 = var9 - var8;
                var7 = ((sg) this).field_sb[var6].f(50);
                var8 = var7;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(ja param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        hj var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        float var5_float = 0.0f;
        int var6_int = 0;
        na var6 = null;
        int var7_int = 0;
        float var7 = 0.0f;
        hj var8_ref_hj = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        float stackIn_28_0 = 0.0f;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        float stackOut_27_0 = 0.0f;
        float stackOut_26_0 = 0.0f;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (((sg) this).field_ab >= 0) {
                  break L2;
                } else {
                  if (null == param0.field_W) {
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              L4: {
                var3_int = stackIn_5_0;
                stackOut_5_0 = var3_int;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (((sg) this).field_J != 2) {
                  break L4;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (((sg) this).field_ab <= 0) {
                    break L4;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (param0.field_L <= 0) {
                      break L4;
                    } else {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                }
              }
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L3;
            }
            L5: {
              L6: {
                var3_int = stackIn_10_0 | stackIn_10_1;
                stackOut_10_0 = var3_int;
                stackIn_15_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (((sg) this).field_ab <= 0) {
                  break L6;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackIn_15_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (null == param0.field_W) {
                    break L6;
                  } else {
                    stackOut_12_0 = stackIn_12_0;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (param0.field_tb <= 50) {
                      break L6;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (param0.field_O != 0) {
                        break L6;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L5;
            }
            L7: {
              var3_int = stackIn_16_0 | stackIn_16_1;
              stackOut_16_0 = var3_int;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (((sg) this).field_bb / 10 % 2 != 0) {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            L8: {
              var3_int = stackIn_19_0 & stackIn_19_1;
              var3_int = var3_int & 1;
              if (param0.field_rc == 2) {
                var4 = param0.field_C.field_h.a(param0.field_r, 27788);
                var5 = (30000 + -param0.field_L) * 256 / 180;
                if (256 > var5) {
                  var4.d(-(var4.field_s >> 1) + param0.field_A.field_h, param0.field_A.field_f + -(var4.field_y >> 1), var5);
                  break L8;
                } else {
                  var4.a(-(var4.field_s >> 1) + param0.field_A.field_h, -(var4.field_y >> 1) + param0.field_A.field_f);
                  break L8;
                }
              } else {
                L9: {
                  var4 = param0.field_C.field_v.a(param0.field_r, 27788);
                  if (2 == ((sg) this).field_J) {
                    var5 = (param0.field_L << 12) / 150 + 4096;
                    if (var5 == 4096) {
                      break L9;
                    } else {
                      int discarded$1 = 32381;
                      ok.a();
                      var6_int = var4.field_s * var5 >> 12;
                      var7_int = var4.field_y * var5 >> 12;
                      var8_ref_hj = new hj(var6_int, var7_int);
                      var8_ref_hj.f();
                      var4.a(0, 0, var6_int, var7_int);
                      var4 = var8_ref_hj;
                      ug.b(-1);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                if (var3_int != 0) {
                  ch.a(param0.field_Eb, param0.field_A.field_f, var4, param0.field_A.field_h, (byte) 98);
                  break L8;
                } else {
                  L10: {
                    if (!((sg) this).field_pb) {
                      stackOut_27_0 = 0.5f;
                      stackIn_28_0 = stackOut_27_0;
                      break L10;
                    } else {
                      stackOut_26_0 = 1.0f;
                      stackIn_28_0 = stackOut_26_0;
                      break L10;
                    }
                  }
                  var5_float = stackIn_28_0;
                  var6 = (na) (Object) ((sg) this).field_Q.b((byte) 87);
                  L11: while (true) {
                    if (var6 == null) {
                      gh.a(var4, param0.field_A.field_h, 0, param0.field_Eb, var5_float, param0.field_A.field_f);
                      break L8;
                    } else {
                      L12: {
                        if (!var6.field_j) {
                          break L12;
                        } else {
                          var7 = (float)(param0.field_A.field_h + -var6.field_l);
                          var8 = (float)(param0.field_A.field_f + -var6.field_n);
                          var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
                          var7 = var7 / var9;
                          var8 = var8 / var9;
                          var10 = -(var9 / (float)(2 * var6.field_i)) + 1.0f;
                          if (0.0f >= var10) {
                            break L12;
                          } else {
                            var5_float = var5_float + var10;
                            break L12;
                          }
                        }
                      }
                      var6 = (na) (Object) ((sg) this).field_Q.c((byte) 94);
                      continue L11;
                    }
                  }
                }
              }
            }
            L13: {
              if (!((sg) this).field_kb) {
                break L13;
              } else {
                if (param0.field_Ib != -1.0f) {
                  var4_ref = le.a((wc[]) (Object) ((sg) this).field_sb, param0.field_Ib, (byte) -112);
                  tc.d(var4_ref.field_h, var4_ref.field_f, 5, param0.field_Eb);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (param0.field_J == 2) {
                tc.g(param0.field_A.field_h, param0.field_A.field_f, (int)((float)param0.field_C.field_d * 1.2999999523162842f), 8355839, 128);
                break L14;
              } else {
                if (param0.field_Fb[2] >= 2) {
                  tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 8355839, 128);
                  break L14;
                } else {
                  if (param0.field_Fb[2] == 1) {
                    tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 255, 32);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L15: {
              if (((sg) this).field_r == 3) {
                this.b(32249, param0);
                break L15;
              } else {
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("sg.S(");
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L16;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + 101 + 41);
        }
    }

    private final void a(int param0, wm param1) {
        RuntimeException var3 = null;
        in var3_ref = null;
        qm var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((sg) this).a(param1.field_q, param1.field_A.field_f, true, param1.field_A.field_h)) {
                  break L2;
                } else {
                  var3_ref = new in(0.0f, 0.0f);
                  var4 = dd.a(0, var3_ref, ((sg) this).field_nb, param1.field_q, param1.field_A);
                  if ((8192 & param1.field_J) == 0) {
                    param1.field_y = (float)var4.field_h;
                    param1.field_u = (float)var4.field_f;
                    var5 = param1.field_x * var3_ref.field_g + param1.field_t * var3_ref.field_j;
                    var6 = -1.7999999523162842f * var5;
                    param1.field_t = param1.field_t + var3_ref.field_j * var6;
                    param1.field_x = param1.field_x + var6 * var3_ref.field_g;
                    break L2;
                  } else {
                    int discarded$1 = 28977;
                    this.d(param1);
                    if ((3 & param1.field_J) == 0) {
                      ((sg) this).field_o = ((sg) this).field_o | 16;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("sg.V(").append(-1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    private final void a(vk param0, int[] param1) throws IOException {
        th var4 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ei var20 = null;
        qm var21 = null;
        qm var22 = null;
        dd var23 = null;
        dd var24 = null;
        qm var24_ref = null;
        Object var25 = null;
        hn var25_ref = null;
        int var25_int = 0;
        hn var26 = null;
        int[] var26_array = null;
        float var27 = 0.0f;
        int var28 = 0;
        float var28_float = 0.0f;
        int var29 = 0;
        qm var29_ref_qm = null;
        int var30 = 0;
        hn var30_ref_hn = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        float var36 = 0.0f;
        float var37 = 0.0f;
        Object var38 = null;
        Object var39 = null;
        int var39_int = 0;
        Object var40_ref = null;
        dd var40_ref_dd = null;
        int var40 = 0;
        Object var41_ref = null;
        hn var41_ref_hn = null;
        int var41 = 0;
        Object var42_ref = null;
        hn var42_ref_hn = null;
        int var42 = 0;
        qm var43_ref_qm = null;
        int var43 = 0;
        ja var43_ref_ja = null;
        int var44_int = 0;
        ja var44 = null;
        float var45 = 0.0f;
        wm var46 = null;
        dn var46_ref = null;
        float var46_float = 0.0f;
        float var47_float = 0.0f;
        int var47 = 0;
        int var48 = 0;
        na var49 = null;
        int var50 = 0;
        Object var51 = null;
        Object var52 = null;
        Object var53 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        dd stackIn_21_0 = null;
        dd stackIn_21_1 = null;
        qm stackIn_21_2 = null;
        qm stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_21_8 = 0;
        int stackIn_21_9 = 0;
        int stackIn_21_10 = 0;
        int stackIn_21_11 = 0;
        int stackIn_21_12 = 0;
        int stackIn_21_13 = 0;
        int stackIn_21_14 = 0;
        dd stackIn_22_0 = null;
        dd stackIn_22_1 = null;
        qm stackIn_22_2 = null;
        qm stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        int stackIn_22_8 = 0;
        int stackIn_22_9 = 0;
        int stackIn_22_10 = 0;
        int stackIn_22_11 = 0;
        int stackIn_22_12 = 0;
        int stackIn_22_13 = 0;
        int stackIn_22_14 = 0;
        dd stackIn_23_0 = null;
        dd stackIn_23_1 = null;
        qm stackIn_23_2 = null;
        qm stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        int stackIn_23_8 = 0;
        int stackIn_23_9 = 0;
        int stackIn_23_10 = 0;
        int stackIn_23_11 = 0;
        int stackIn_23_12 = 0;
        int stackIn_23_13 = 0;
        int stackIn_23_14 = 0;
        int stackIn_23_15 = 0;
        dd stackIn_24_0 = null;
        dd stackIn_24_1 = null;
        qm stackIn_24_2 = null;
        qm stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        int stackIn_24_9 = 0;
        int stackIn_24_10 = 0;
        int stackIn_24_11 = 0;
        int stackIn_24_12 = 0;
        int stackIn_24_13 = 0;
        int stackIn_24_14 = 0;
        int stackIn_24_15 = 0;
        dd stackIn_25_0 = null;
        dd stackIn_25_1 = null;
        qm stackIn_25_2 = null;
        qm stackIn_25_3 = null;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        int stackIn_25_10 = 0;
        int stackIn_25_11 = 0;
        int stackIn_25_12 = 0;
        int stackIn_25_13 = 0;
        int stackIn_25_14 = 0;
        int stackIn_25_15 = 0;
        dd stackIn_26_0 = null;
        dd stackIn_26_1 = null;
        qm stackIn_26_2 = null;
        qm stackIn_26_3 = null;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        int stackIn_26_9 = 0;
        int stackIn_26_10 = 0;
        int stackIn_26_11 = 0;
        int stackIn_26_12 = 0;
        int stackIn_26_13 = 0;
        int stackIn_26_14 = 0;
        int stackIn_26_15 = 0;
        int stackIn_26_16 = 0;
        dd stackIn_27_0 = null;
        dd stackIn_27_1 = null;
        qm stackIn_27_2 = null;
        qm stackIn_27_3 = null;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        int stackIn_27_9 = 0;
        int stackIn_27_10 = 0;
        int stackIn_27_11 = 0;
        int stackIn_27_12 = 0;
        int stackIn_27_13 = 0;
        int stackIn_27_14 = 0;
        int stackIn_27_15 = 0;
        int stackIn_27_16 = 0;
        dd stackIn_28_0 = null;
        dd stackIn_28_1 = null;
        qm stackIn_28_2 = null;
        qm stackIn_28_3 = null;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        int stackIn_28_9 = 0;
        int stackIn_28_10 = 0;
        int stackIn_28_11 = 0;
        int stackIn_28_12 = 0;
        int stackIn_28_13 = 0;
        int stackIn_28_14 = 0;
        int stackIn_28_15 = 0;
        int stackIn_28_16 = 0;
        dd stackIn_29_0 = null;
        dd stackIn_29_1 = null;
        qm stackIn_29_2 = null;
        qm stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        int stackIn_29_9 = 0;
        int stackIn_29_10 = 0;
        int stackIn_29_11 = 0;
        int stackIn_29_12 = 0;
        int stackIn_29_13 = 0;
        int stackIn_29_14 = 0;
        int stackIn_29_15 = 0;
        int stackIn_29_16 = 0;
        int stackIn_29_17 = 0;
        dd stackIn_30_0 = null;
        dd stackIn_30_1 = null;
        qm stackIn_30_2 = null;
        qm stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        int stackIn_30_8 = 0;
        int stackIn_30_9 = 0;
        int stackIn_30_10 = 0;
        int stackIn_30_11 = 0;
        int stackIn_30_12 = 0;
        int stackIn_30_13 = 0;
        int stackIn_30_14 = 0;
        int stackIn_30_15 = 0;
        int stackIn_30_16 = 0;
        int stackIn_30_17 = 0;
        dd stackIn_31_0 = null;
        dd stackIn_31_1 = null;
        qm stackIn_31_2 = null;
        qm stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int stackIn_31_8 = 0;
        int stackIn_31_9 = 0;
        int stackIn_31_10 = 0;
        int stackIn_31_11 = 0;
        int stackIn_31_12 = 0;
        int stackIn_31_13 = 0;
        int stackIn_31_14 = 0;
        int stackIn_31_15 = 0;
        int stackIn_31_16 = 0;
        int stackIn_31_17 = 0;
        dd stackIn_32_0 = null;
        dd stackIn_32_1 = null;
        qm stackIn_32_2 = null;
        qm stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        int stackIn_32_7 = 0;
        int stackIn_32_8 = 0;
        int stackIn_32_9 = 0;
        int stackIn_32_10 = 0;
        int stackIn_32_11 = 0;
        int stackIn_32_12 = 0;
        int stackIn_32_13 = 0;
        int stackIn_32_14 = 0;
        int stackIn_32_15 = 0;
        int stackIn_32_16 = 0;
        int stackIn_32_17 = 0;
        int stackIn_32_18 = 0;
        dd stackIn_33_0 = null;
        dd stackIn_33_1 = null;
        qm stackIn_33_2 = null;
        qm stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        int stackIn_33_7 = 0;
        int stackIn_33_8 = 0;
        int stackIn_33_9 = 0;
        int stackIn_33_10 = 0;
        int stackIn_33_11 = 0;
        int stackIn_33_12 = 0;
        int stackIn_33_13 = 0;
        int stackIn_33_14 = 0;
        int stackIn_33_15 = 0;
        int stackIn_33_16 = 0;
        int stackIn_33_17 = 0;
        int stackIn_33_18 = 0;
        dd stackIn_34_0 = null;
        dd stackIn_34_1 = null;
        qm stackIn_34_2 = null;
        qm stackIn_34_3 = null;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        int stackIn_34_7 = 0;
        int stackIn_34_8 = 0;
        int stackIn_34_9 = 0;
        int stackIn_34_10 = 0;
        int stackIn_34_11 = 0;
        int stackIn_34_12 = 0;
        int stackIn_34_13 = 0;
        int stackIn_34_14 = 0;
        int stackIn_34_15 = 0;
        int stackIn_34_16 = 0;
        int stackIn_34_17 = 0;
        int stackIn_34_18 = 0;
        dd stackIn_35_0 = null;
        dd stackIn_35_1 = null;
        qm stackIn_35_2 = null;
        qm stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        int stackIn_35_8 = 0;
        int stackIn_35_9 = 0;
        int stackIn_35_10 = 0;
        int stackIn_35_11 = 0;
        int stackIn_35_12 = 0;
        int stackIn_35_13 = 0;
        int stackIn_35_14 = 0;
        int stackIn_35_15 = 0;
        int stackIn_35_16 = 0;
        int stackIn_35_17 = 0;
        int stackIn_35_18 = 0;
        int stackIn_35_19 = 0;
        dd stackIn_36_0 = null;
        dd stackIn_36_1 = null;
        qm stackIn_36_2 = null;
        qm stackIn_36_3 = null;
        int stackIn_36_4 = 0;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        int stackIn_36_8 = 0;
        int stackIn_36_9 = 0;
        int stackIn_36_10 = 0;
        int stackIn_36_11 = 0;
        int stackIn_36_12 = 0;
        int stackIn_36_13 = 0;
        int stackIn_36_14 = 0;
        int stackIn_36_15 = 0;
        int stackIn_36_16 = 0;
        int stackIn_36_17 = 0;
        int stackIn_36_18 = 0;
        int stackIn_36_19 = 0;
        dd stackIn_37_0 = null;
        dd stackIn_37_1 = null;
        qm stackIn_37_2 = null;
        qm stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        int stackIn_37_8 = 0;
        int stackIn_37_9 = 0;
        int stackIn_37_10 = 0;
        int stackIn_37_11 = 0;
        int stackIn_37_12 = 0;
        int stackIn_37_13 = 0;
        int stackIn_37_14 = 0;
        int stackIn_37_15 = 0;
        int stackIn_37_16 = 0;
        int stackIn_37_17 = 0;
        int stackIn_37_18 = 0;
        int stackIn_37_19 = 0;
        dd stackIn_38_0 = null;
        dd stackIn_38_1 = null;
        qm stackIn_38_2 = null;
        qm stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        int stackIn_38_6 = 0;
        int stackIn_38_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_38_9 = 0;
        int stackIn_38_10 = 0;
        int stackIn_38_11 = 0;
        int stackIn_38_12 = 0;
        int stackIn_38_13 = 0;
        int stackIn_38_14 = 0;
        int stackIn_38_15 = 0;
        int stackIn_38_16 = 0;
        int stackIn_38_17 = 0;
        int stackIn_38_18 = 0;
        int stackIn_38_19 = 0;
        int stackIn_38_20 = 0;
        hn stackIn_39_0 = null;
        hn stackIn_39_1 = null;
        qm stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        float stackIn_39_4 = 0.0f;
        float stackIn_39_5 = 0.0f;
        int stackIn_39_6 = 0;
        int stackIn_39_7 = 0;
        int stackIn_39_8 = 0;
        int stackIn_39_9 = 0;
        int stackIn_39_10 = 0;
        Object stackIn_39_11 = null;
        Object stackIn_39_12 = null;
        qm stackIn_39_13 = null;
        hn stackIn_40_0 = null;
        hn stackIn_40_1 = null;
        qm stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        float stackIn_40_4 = 0.0f;
        float stackIn_40_5 = 0.0f;
        int stackIn_40_6 = 0;
        int stackIn_40_7 = 0;
        int stackIn_40_8 = 0;
        int stackIn_40_9 = 0;
        int stackIn_40_10 = 0;
        Object stackIn_40_11 = null;
        Object stackIn_40_12 = null;
        qm stackIn_40_13 = null;
        hn stackIn_41_0 = null;
        hn stackIn_41_1 = null;
        qm stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        float stackIn_41_4 = 0.0f;
        float stackIn_41_5 = 0.0f;
        int stackIn_41_6 = 0;
        int stackIn_41_7 = 0;
        int stackIn_41_8 = 0;
        int stackIn_41_9 = 0;
        int stackIn_41_10 = 0;
        Object stackIn_41_11 = null;
        Object stackIn_41_12 = null;
        qm stackIn_41_13 = null;
        int stackIn_41_14 = 0;
        hn stackIn_42_0 = null;
        hn stackIn_42_1 = null;
        qm stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        float stackIn_42_4 = 0.0f;
        float stackIn_42_5 = 0.0f;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        int stackIn_42_8 = 0;
        int stackIn_42_9 = 0;
        int stackIn_42_10 = 0;
        Object stackIn_42_11 = null;
        Object stackIn_42_12 = null;
        qm stackIn_42_13 = null;
        int stackIn_42_14 = 0;
        hn stackIn_43_0 = null;
        hn stackIn_43_1 = null;
        qm stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        float stackIn_43_4 = 0.0f;
        float stackIn_43_5 = 0.0f;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        int stackIn_43_8 = 0;
        int stackIn_43_9 = 0;
        int stackIn_43_10 = 0;
        Object stackIn_43_11 = null;
        Object stackIn_43_12 = null;
        qm stackIn_43_13 = null;
        int stackIn_43_14 = 0;
        hn stackIn_44_0 = null;
        hn stackIn_44_1 = null;
        qm stackIn_44_2 = null;
        int stackIn_44_3 = 0;
        float stackIn_44_4 = 0.0f;
        float stackIn_44_5 = 0.0f;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        int stackIn_44_9 = 0;
        int stackIn_44_10 = 0;
        Object stackIn_44_11 = null;
        Object stackIn_44_12 = null;
        qm stackIn_44_13 = null;
        int stackIn_44_14 = 0;
        int stackIn_44_15 = 0;
        hn stackIn_45_0 = null;
        hn stackIn_45_1 = null;
        qm stackIn_45_2 = null;
        int stackIn_45_3 = 0;
        float stackIn_45_4 = 0.0f;
        float stackIn_45_5 = 0.0f;
        int stackIn_45_6 = 0;
        int stackIn_45_7 = 0;
        int stackIn_45_8 = 0;
        int stackIn_45_9 = 0;
        int stackIn_45_10 = 0;
        Object stackIn_45_11 = null;
        Object stackIn_45_12 = null;
        qm stackIn_45_13 = null;
        int stackIn_45_14 = 0;
        int stackIn_45_15 = 0;
        hn stackIn_46_0 = null;
        hn stackIn_46_1 = null;
        qm stackIn_46_2 = null;
        int stackIn_46_3 = 0;
        float stackIn_46_4 = 0.0f;
        float stackIn_46_5 = 0.0f;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_46_10 = 0;
        Object stackIn_46_11 = null;
        Object stackIn_46_12 = null;
        qm stackIn_46_13 = null;
        int stackIn_46_14 = 0;
        int stackIn_46_15 = 0;
        hn stackIn_47_0 = null;
        hn stackIn_47_1 = null;
        qm stackIn_47_2 = null;
        int stackIn_47_3 = 0;
        float stackIn_47_4 = 0.0f;
        float stackIn_47_5 = 0.0f;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        Object stackIn_47_11 = null;
        Object stackIn_47_12 = null;
        qm stackIn_47_13 = null;
        int stackIn_47_14 = 0;
        int stackIn_47_15 = 0;
        int stackIn_47_16 = 0;
        hn stackIn_48_0 = null;
        hn stackIn_48_1 = null;
        qm stackIn_48_2 = null;
        int stackIn_48_3 = 0;
        float stackIn_48_4 = 0.0f;
        float stackIn_48_5 = 0.0f;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int stackIn_48_8 = 0;
        int stackIn_48_9 = 0;
        int stackIn_48_10 = 0;
        Object stackIn_48_11 = null;
        Object stackIn_48_12 = null;
        qm stackIn_48_13 = null;
        int stackIn_48_14 = 0;
        int stackIn_48_15 = 0;
        int stackIn_48_16 = 0;
        hn stackIn_49_0 = null;
        hn stackIn_49_1 = null;
        qm stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        float stackIn_49_4 = 0.0f;
        float stackIn_49_5 = 0.0f;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_49_10 = 0;
        Object stackIn_49_11 = null;
        Object stackIn_49_12 = null;
        qm stackIn_49_13 = null;
        int stackIn_49_14 = 0;
        int stackIn_49_15 = 0;
        int stackIn_49_16 = 0;
        hn stackIn_50_0 = null;
        hn stackIn_50_1 = null;
        qm stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        float stackIn_50_4 = 0.0f;
        float stackIn_50_5 = 0.0f;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_50_9 = 0;
        int stackIn_50_10 = 0;
        Object stackIn_50_11 = null;
        Object stackIn_50_12 = null;
        qm stackIn_50_13 = null;
        int stackIn_50_14 = 0;
        int stackIn_50_15 = 0;
        int stackIn_50_16 = 0;
        int stackIn_50_17 = 0;
        hn stackIn_51_0 = null;
        hn stackIn_51_1 = null;
        qm stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        float stackIn_51_4 = 0.0f;
        float stackIn_51_5 = 0.0f;
        int stackIn_51_6 = 0;
        int stackIn_51_7 = 0;
        int stackIn_51_8 = 0;
        int stackIn_51_9 = 0;
        int stackIn_51_10 = 0;
        Object stackIn_51_11 = null;
        Object stackIn_51_12 = null;
        qm stackIn_51_13 = null;
        int stackIn_51_14 = 0;
        int stackIn_51_15 = 0;
        int stackIn_51_16 = 0;
        int stackIn_51_17 = 0;
        hn stackIn_52_0 = null;
        hn stackIn_52_1 = null;
        qm stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        float stackIn_52_4 = 0.0f;
        float stackIn_52_5 = 0.0f;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        int stackIn_52_8 = 0;
        int stackIn_52_9 = 0;
        int stackIn_52_10 = 0;
        Object stackIn_52_11 = null;
        Object stackIn_52_12 = null;
        qm stackIn_52_13 = null;
        int stackIn_52_14 = 0;
        int stackIn_52_15 = 0;
        int stackIn_52_16 = 0;
        int stackIn_52_17 = 0;
        hn stackIn_53_0 = null;
        hn stackIn_53_1 = null;
        qm stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        float stackIn_53_4 = 0.0f;
        float stackIn_53_5 = 0.0f;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        int stackIn_53_8 = 0;
        int stackIn_53_9 = 0;
        int stackIn_53_10 = 0;
        Object stackIn_53_11 = null;
        Object stackIn_53_12 = null;
        qm stackIn_53_13 = null;
        int stackIn_53_14 = 0;
        int stackIn_53_15 = 0;
        int stackIn_53_16 = 0;
        int stackIn_53_17 = 0;
        int stackIn_53_18 = 0;
        hn stackIn_54_0 = null;
        hn stackIn_54_1 = null;
        qm stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        float stackIn_54_4 = 0.0f;
        float stackIn_54_5 = 0.0f;
        int stackIn_54_6 = 0;
        int stackIn_54_7 = 0;
        int stackIn_54_8 = 0;
        int stackIn_54_9 = 0;
        int stackIn_54_10 = 0;
        Object stackIn_54_11 = null;
        Object stackIn_54_12 = null;
        qm stackIn_54_13 = null;
        int stackIn_54_14 = 0;
        int stackIn_54_15 = 0;
        int stackIn_54_16 = 0;
        int stackIn_54_17 = 0;
        int stackIn_54_18 = 0;
        hn stackIn_55_0 = null;
        hn stackIn_55_1 = null;
        qm stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        float stackIn_55_4 = 0.0f;
        float stackIn_55_5 = 0.0f;
        int stackIn_55_6 = 0;
        int stackIn_55_7 = 0;
        int stackIn_55_8 = 0;
        int stackIn_55_9 = 0;
        int stackIn_55_10 = 0;
        Object stackIn_55_11 = null;
        Object stackIn_55_12 = null;
        qm stackIn_55_13 = null;
        int stackIn_55_14 = 0;
        int stackIn_55_15 = 0;
        int stackIn_55_16 = 0;
        int stackIn_55_17 = 0;
        int stackIn_55_18 = 0;
        hn stackIn_56_0 = null;
        hn stackIn_56_1 = null;
        qm stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        float stackIn_56_4 = 0.0f;
        float stackIn_56_5 = 0.0f;
        int stackIn_56_6 = 0;
        int stackIn_56_7 = 0;
        int stackIn_56_8 = 0;
        int stackIn_56_9 = 0;
        int stackIn_56_10 = 0;
        Object stackIn_56_11 = null;
        Object stackIn_56_12 = null;
        qm stackIn_56_13 = null;
        int stackIn_56_14 = 0;
        int stackIn_56_15 = 0;
        int stackIn_56_16 = 0;
        int stackIn_56_17 = 0;
        int stackIn_56_18 = 0;
        int stackIn_56_19 = 0;
        dd stackIn_58_0 = null;
        dd stackIn_58_1 = null;
        qm stackIn_58_2 = null;
        qm stackIn_58_3 = null;
        int stackIn_58_4 = 0;
        int stackIn_58_5 = 0;
        int stackIn_58_6 = 0;
        int stackIn_58_7 = 0;
        int stackIn_58_8 = 0;
        int stackIn_58_9 = 0;
        int stackIn_58_10 = 0;
        int stackIn_58_11 = 0;
        int stackIn_58_12 = 0;
        int stackIn_58_13 = 0;
        int stackIn_58_14 = 0;
        dd stackIn_59_0 = null;
        dd stackIn_59_1 = null;
        qm stackIn_59_2 = null;
        qm stackIn_59_3 = null;
        int stackIn_59_4 = 0;
        int stackIn_59_5 = 0;
        int stackIn_59_6 = 0;
        int stackIn_59_7 = 0;
        int stackIn_59_8 = 0;
        int stackIn_59_9 = 0;
        int stackIn_59_10 = 0;
        int stackIn_59_11 = 0;
        int stackIn_59_12 = 0;
        int stackIn_59_13 = 0;
        int stackIn_59_14 = 0;
        dd stackIn_60_0 = null;
        dd stackIn_60_1 = null;
        qm stackIn_60_2 = null;
        qm stackIn_60_3 = null;
        int stackIn_60_4 = 0;
        int stackIn_60_5 = 0;
        int stackIn_60_6 = 0;
        int stackIn_60_7 = 0;
        int stackIn_60_8 = 0;
        int stackIn_60_9 = 0;
        int stackIn_60_10 = 0;
        int stackIn_60_11 = 0;
        int stackIn_60_12 = 0;
        int stackIn_60_13 = 0;
        int stackIn_60_14 = 0;
        int stackIn_60_15 = 0;
        dd stackIn_61_0 = null;
        dd stackIn_61_1 = null;
        qm stackIn_61_2 = null;
        qm stackIn_61_3 = null;
        int stackIn_61_4 = 0;
        int stackIn_61_5 = 0;
        int stackIn_61_6 = 0;
        int stackIn_61_7 = 0;
        int stackIn_61_8 = 0;
        int stackIn_61_9 = 0;
        int stackIn_61_10 = 0;
        int stackIn_61_11 = 0;
        int stackIn_61_12 = 0;
        int stackIn_61_13 = 0;
        int stackIn_61_14 = 0;
        int stackIn_61_15 = 0;
        dd stackIn_62_0 = null;
        dd stackIn_62_1 = null;
        qm stackIn_62_2 = null;
        qm stackIn_62_3 = null;
        int stackIn_62_4 = 0;
        int stackIn_62_5 = 0;
        int stackIn_62_6 = 0;
        int stackIn_62_7 = 0;
        int stackIn_62_8 = 0;
        int stackIn_62_9 = 0;
        int stackIn_62_10 = 0;
        int stackIn_62_11 = 0;
        int stackIn_62_12 = 0;
        int stackIn_62_13 = 0;
        int stackIn_62_14 = 0;
        int stackIn_62_15 = 0;
        dd stackIn_63_0 = null;
        dd stackIn_63_1 = null;
        qm stackIn_63_2 = null;
        qm stackIn_63_3 = null;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int stackIn_63_6 = 0;
        int stackIn_63_7 = 0;
        int stackIn_63_8 = 0;
        int stackIn_63_9 = 0;
        int stackIn_63_10 = 0;
        int stackIn_63_11 = 0;
        int stackIn_63_12 = 0;
        int stackIn_63_13 = 0;
        int stackIn_63_14 = 0;
        int stackIn_63_15 = 0;
        int stackIn_63_16 = 0;
        dd stackIn_64_0 = null;
        dd stackIn_64_1 = null;
        qm stackIn_64_2 = null;
        qm stackIn_64_3 = null;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_64_6 = 0;
        int stackIn_64_7 = 0;
        int stackIn_64_8 = 0;
        int stackIn_64_9 = 0;
        int stackIn_64_10 = 0;
        int stackIn_64_11 = 0;
        int stackIn_64_12 = 0;
        int stackIn_64_13 = 0;
        int stackIn_64_14 = 0;
        int stackIn_64_15 = 0;
        int stackIn_64_16 = 0;
        dd stackIn_65_0 = null;
        dd stackIn_65_1 = null;
        qm stackIn_65_2 = null;
        qm stackIn_65_3 = null;
        int stackIn_65_4 = 0;
        int stackIn_65_5 = 0;
        int stackIn_65_6 = 0;
        int stackIn_65_7 = 0;
        int stackIn_65_8 = 0;
        int stackIn_65_9 = 0;
        int stackIn_65_10 = 0;
        int stackIn_65_11 = 0;
        int stackIn_65_12 = 0;
        int stackIn_65_13 = 0;
        int stackIn_65_14 = 0;
        int stackIn_65_15 = 0;
        int stackIn_65_16 = 0;
        dd stackIn_66_0 = null;
        dd stackIn_66_1 = null;
        qm stackIn_66_2 = null;
        qm stackIn_66_3 = null;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        int stackIn_66_8 = 0;
        int stackIn_66_9 = 0;
        int stackIn_66_10 = 0;
        int stackIn_66_11 = 0;
        int stackIn_66_12 = 0;
        int stackIn_66_13 = 0;
        int stackIn_66_14 = 0;
        int stackIn_66_15 = 0;
        int stackIn_66_16 = 0;
        int stackIn_66_17 = 0;
        dd stackIn_67_0 = null;
        dd stackIn_67_1 = null;
        qm stackIn_67_2 = null;
        qm stackIn_67_3 = null;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        int stackIn_67_6 = 0;
        int stackIn_67_7 = 0;
        int stackIn_67_8 = 0;
        int stackIn_67_9 = 0;
        int stackIn_67_10 = 0;
        int stackIn_67_11 = 0;
        int stackIn_67_12 = 0;
        int stackIn_67_13 = 0;
        int stackIn_67_14 = 0;
        int stackIn_67_15 = 0;
        int stackIn_67_16 = 0;
        int stackIn_67_17 = 0;
        dd stackIn_68_0 = null;
        dd stackIn_68_1 = null;
        qm stackIn_68_2 = null;
        qm stackIn_68_3 = null;
        int stackIn_68_4 = 0;
        int stackIn_68_5 = 0;
        int stackIn_68_6 = 0;
        int stackIn_68_7 = 0;
        int stackIn_68_8 = 0;
        int stackIn_68_9 = 0;
        int stackIn_68_10 = 0;
        int stackIn_68_11 = 0;
        int stackIn_68_12 = 0;
        int stackIn_68_13 = 0;
        int stackIn_68_14 = 0;
        int stackIn_68_15 = 0;
        int stackIn_68_16 = 0;
        int stackIn_68_17 = 0;
        dd stackIn_69_0 = null;
        dd stackIn_69_1 = null;
        qm stackIn_69_2 = null;
        qm stackIn_69_3 = null;
        int stackIn_69_4 = 0;
        int stackIn_69_5 = 0;
        int stackIn_69_6 = 0;
        int stackIn_69_7 = 0;
        int stackIn_69_8 = 0;
        int stackIn_69_9 = 0;
        int stackIn_69_10 = 0;
        int stackIn_69_11 = 0;
        int stackIn_69_12 = 0;
        int stackIn_69_13 = 0;
        int stackIn_69_14 = 0;
        int stackIn_69_15 = 0;
        int stackIn_69_16 = 0;
        int stackIn_69_17 = 0;
        int stackIn_69_18 = 0;
        dd stackIn_70_0 = null;
        dd stackIn_70_1 = null;
        qm stackIn_70_2 = null;
        qm stackIn_70_3 = null;
        int stackIn_70_4 = 0;
        int stackIn_70_5 = 0;
        int stackIn_70_6 = 0;
        int stackIn_70_7 = 0;
        int stackIn_70_8 = 0;
        int stackIn_70_9 = 0;
        int stackIn_70_10 = 0;
        int stackIn_70_11 = 0;
        int stackIn_70_12 = 0;
        int stackIn_70_13 = 0;
        int stackIn_70_14 = 0;
        int stackIn_70_15 = 0;
        int stackIn_70_16 = 0;
        int stackIn_70_17 = 0;
        int stackIn_70_18 = 0;
        dd stackIn_71_0 = null;
        dd stackIn_71_1 = null;
        qm stackIn_71_2 = null;
        qm stackIn_71_3 = null;
        int stackIn_71_4 = 0;
        int stackIn_71_5 = 0;
        int stackIn_71_6 = 0;
        int stackIn_71_7 = 0;
        int stackIn_71_8 = 0;
        int stackIn_71_9 = 0;
        int stackIn_71_10 = 0;
        int stackIn_71_11 = 0;
        int stackIn_71_12 = 0;
        int stackIn_71_13 = 0;
        int stackIn_71_14 = 0;
        int stackIn_71_15 = 0;
        int stackIn_71_16 = 0;
        int stackIn_71_17 = 0;
        int stackIn_71_18 = 0;
        dd stackIn_72_0 = null;
        dd stackIn_72_1 = null;
        qm stackIn_72_2 = null;
        qm stackIn_72_3 = null;
        int stackIn_72_4 = 0;
        int stackIn_72_5 = 0;
        int stackIn_72_6 = 0;
        int stackIn_72_7 = 0;
        int stackIn_72_8 = 0;
        int stackIn_72_9 = 0;
        int stackIn_72_10 = 0;
        int stackIn_72_11 = 0;
        int stackIn_72_12 = 0;
        int stackIn_72_13 = 0;
        int stackIn_72_14 = 0;
        int stackIn_72_15 = 0;
        int stackIn_72_16 = 0;
        int stackIn_72_17 = 0;
        int stackIn_72_18 = 0;
        int stackIn_72_19 = 0;
        dd stackIn_73_0 = null;
        dd stackIn_73_1 = null;
        qm stackIn_73_2 = null;
        qm stackIn_73_3 = null;
        int stackIn_73_4 = 0;
        int stackIn_73_5 = 0;
        int stackIn_73_6 = 0;
        int stackIn_73_7 = 0;
        int stackIn_73_8 = 0;
        int stackIn_73_9 = 0;
        int stackIn_73_10 = 0;
        int stackIn_73_11 = 0;
        int stackIn_73_12 = 0;
        int stackIn_73_13 = 0;
        int stackIn_73_14 = 0;
        int stackIn_73_15 = 0;
        int stackIn_73_16 = 0;
        int stackIn_73_17 = 0;
        int stackIn_73_18 = 0;
        int stackIn_73_19 = 0;
        dd stackIn_74_0 = null;
        dd stackIn_74_1 = null;
        qm stackIn_74_2 = null;
        qm stackIn_74_3 = null;
        int stackIn_74_4 = 0;
        int stackIn_74_5 = 0;
        int stackIn_74_6 = 0;
        int stackIn_74_7 = 0;
        int stackIn_74_8 = 0;
        int stackIn_74_9 = 0;
        int stackIn_74_10 = 0;
        int stackIn_74_11 = 0;
        int stackIn_74_12 = 0;
        int stackIn_74_13 = 0;
        int stackIn_74_14 = 0;
        int stackIn_74_15 = 0;
        int stackIn_74_16 = 0;
        int stackIn_74_17 = 0;
        int stackIn_74_18 = 0;
        int stackIn_74_19 = 0;
        dd stackIn_75_0 = null;
        dd stackIn_75_1 = null;
        qm stackIn_75_2 = null;
        qm stackIn_75_3 = null;
        int stackIn_75_4 = 0;
        int stackIn_75_5 = 0;
        int stackIn_75_6 = 0;
        int stackIn_75_7 = 0;
        int stackIn_75_8 = 0;
        int stackIn_75_9 = 0;
        int stackIn_75_10 = 0;
        int stackIn_75_11 = 0;
        int stackIn_75_12 = 0;
        int stackIn_75_13 = 0;
        int stackIn_75_14 = 0;
        int stackIn_75_15 = 0;
        int stackIn_75_16 = 0;
        int stackIn_75_17 = 0;
        int stackIn_75_18 = 0;
        int stackIn_75_19 = 0;
        int stackIn_75_20 = 0;
        float stackIn_78_0 = 0.0f;
        float stackIn_98_0 = 0.0f;
        hn stackIn_101_0 = null;
        ja[] stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        ja stackIn_129_2 = null;
        ja stackIn_129_3 = null;
        int stackIn_129_4 = 0;
        int stackIn_129_5 = 0;
        int stackIn_129_6 = 0;
        float stackIn_129_7 = 0.0f;
        float stackIn_129_8 = 0.0f;
        ja[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        ja stackIn_130_2 = null;
        ja stackIn_130_3 = null;
        int stackIn_130_4 = 0;
        int stackIn_130_5 = 0;
        int stackIn_130_6 = 0;
        float stackIn_130_7 = 0.0f;
        float stackIn_130_8 = 0.0f;
        ja[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        ja stackIn_131_2 = null;
        ja stackIn_131_3 = null;
        int stackIn_131_4 = 0;
        int stackIn_131_5 = 0;
        int stackIn_131_6 = 0;
        float stackIn_131_7 = 0.0f;
        float stackIn_131_8 = 0.0f;
        wd stackIn_131_9 = null;
        ja[] stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        ja stackIn_138_2 = null;
        ja stackIn_138_3 = null;
        int stackIn_138_4 = 0;
        int stackIn_138_5 = 0;
        int stackIn_138_6 = 0;
        float stackIn_138_7 = 0.0f;
        float stackIn_138_8 = 0.0f;
        ja[] stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        ja stackIn_139_2 = null;
        ja stackIn_139_3 = null;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        int stackIn_139_6 = 0;
        float stackIn_139_7 = 0.0f;
        float stackIn_139_8 = 0.0f;
        ja[] stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        ja stackIn_140_2 = null;
        ja stackIn_140_3 = null;
        int stackIn_140_4 = 0;
        int stackIn_140_5 = 0;
        int stackIn_140_6 = 0;
        float stackIn_140_7 = 0.0f;
        float stackIn_140_8 = 0.0f;
        wd stackIn_140_9 = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        dd stackOut_57_0 = null;
        dd stackOut_57_1 = null;
        qm stackOut_57_2 = null;
        qm stackOut_57_3 = null;
        int stackOut_57_4 = 0;
        int stackOut_57_5 = 0;
        int stackOut_57_6 = 0;
        int stackOut_57_7 = 0;
        int stackOut_57_8 = 0;
        int stackOut_57_9 = 0;
        int stackOut_57_10 = 0;
        int stackOut_57_11 = 0;
        int stackOut_57_12 = 0;
        int stackOut_57_13 = 0;
        int stackOut_57_14 = 0;
        dd stackOut_59_0 = null;
        dd stackOut_59_1 = null;
        qm stackOut_59_2 = null;
        qm stackOut_59_3 = null;
        int stackOut_59_4 = 0;
        int stackOut_59_5 = 0;
        int stackOut_59_6 = 0;
        int stackOut_59_7 = 0;
        int stackOut_59_8 = 0;
        int stackOut_59_9 = 0;
        int stackOut_59_10 = 0;
        int stackOut_59_11 = 0;
        int stackOut_59_12 = 0;
        int stackOut_59_13 = 0;
        int stackOut_59_14 = 0;
        int stackOut_59_15 = 0;
        dd stackOut_58_0 = null;
        dd stackOut_58_1 = null;
        qm stackOut_58_2 = null;
        qm stackOut_58_3 = null;
        int stackOut_58_4 = 0;
        int stackOut_58_5 = 0;
        int stackOut_58_6 = 0;
        int stackOut_58_7 = 0;
        int stackOut_58_8 = 0;
        int stackOut_58_9 = 0;
        int stackOut_58_10 = 0;
        int stackOut_58_11 = 0;
        int stackOut_58_12 = 0;
        int stackOut_58_13 = 0;
        int stackOut_58_14 = 0;
        int stackOut_58_15 = 0;
        dd stackOut_60_0 = null;
        dd stackOut_60_1 = null;
        qm stackOut_60_2 = null;
        qm stackOut_60_3 = null;
        int stackOut_60_4 = 0;
        int stackOut_60_5 = 0;
        int stackOut_60_6 = 0;
        int stackOut_60_7 = 0;
        int stackOut_60_8 = 0;
        int stackOut_60_9 = 0;
        int stackOut_60_10 = 0;
        int stackOut_60_11 = 0;
        int stackOut_60_12 = 0;
        int stackOut_60_13 = 0;
        int stackOut_60_14 = 0;
        int stackOut_60_15 = 0;
        dd stackOut_62_0 = null;
        dd stackOut_62_1 = null;
        qm stackOut_62_2 = null;
        qm stackOut_62_3 = null;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_62_6 = 0;
        int stackOut_62_7 = 0;
        int stackOut_62_8 = 0;
        int stackOut_62_9 = 0;
        int stackOut_62_10 = 0;
        int stackOut_62_11 = 0;
        int stackOut_62_12 = 0;
        int stackOut_62_13 = 0;
        int stackOut_62_14 = 0;
        int stackOut_62_15 = 0;
        int stackOut_62_16 = 0;
        dd stackOut_61_0 = null;
        dd stackOut_61_1 = null;
        qm stackOut_61_2 = null;
        qm stackOut_61_3 = null;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        int stackOut_61_6 = 0;
        int stackOut_61_7 = 0;
        int stackOut_61_8 = 0;
        int stackOut_61_9 = 0;
        int stackOut_61_10 = 0;
        int stackOut_61_11 = 0;
        int stackOut_61_12 = 0;
        int stackOut_61_13 = 0;
        int stackOut_61_14 = 0;
        int stackOut_61_15 = 0;
        int stackOut_61_16 = 0;
        dd stackOut_63_0 = null;
        dd stackOut_63_1 = null;
        qm stackOut_63_2 = null;
        qm stackOut_63_3 = null;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        int stackOut_63_6 = 0;
        int stackOut_63_7 = 0;
        int stackOut_63_8 = 0;
        int stackOut_63_9 = 0;
        int stackOut_63_10 = 0;
        int stackOut_63_11 = 0;
        int stackOut_63_12 = 0;
        int stackOut_63_13 = 0;
        int stackOut_63_14 = 0;
        int stackOut_63_15 = 0;
        int stackOut_63_16 = 0;
        dd stackOut_65_0 = null;
        dd stackOut_65_1 = null;
        qm stackOut_65_2 = null;
        qm stackOut_65_3 = null;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        int stackOut_65_8 = 0;
        int stackOut_65_9 = 0;
        int stackOut_65_10 = 0;
        int stackOut_65_11 = 0;
        int stackOut_65_12 = 0;
        int stackOut_65_13 = 0;
        int stackOut_65_14 = 0;
        int stackOut_65_15 = 0;
        int stackOut_65_16 = 0;
        int stackOut_65_17 = 0;
        dd stackOut_64_0 = null;
        dd stackOut_64_1 = null;
        qm stackOut_64_2 = null;
        qm stackOut_64_3 = null;
        int stackOut_64_4 = 0;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        int stackOut_64_8 = 0;
        int stackOut_64_9 = 0;
        int stackOut_64_10 = 0;
        int stackOut_64_11 = 0;
        int stackOut_64_12 = 0;
        int stackOut_64_13 = 0;
        int stackOut_64_14 = 0;
        int stackOut_64_15 = 0;
        int stackOut_64_16 = 0;
        int stackOut_64_17 = 0;
        dd stackOut_66_0 = null;
        dd stackOut_66_1 = null;
        qm stackOut_66_2 = null;
        qm stackOut_66_3 = null;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_66_6 = 0;
        int stackOut_66_7 = 0;
        int stackOut_66_8 = 0;
        int stackOut_66_9 = 0;
        int stackOut_66_10 = 0;
        int stackOut_66_11 = 0;
        int stackOut_66_12 = 0;
        int stackOut_66_13 = 0;
        int stackOut_66_14 = 0;
        int stackOut_66_15 = 0;
        int stackOut_66_16 = 0;
        int stackOut_66_17 = 0;
        dd stackOut_68_0 = null;
        dd stackOut_68_1 = null;
        qm stackOut_68_2 = null;
        qm stackOut_68_3 = null;
        int stackOut_68_4 = 0;
        int stackOut_68_5 = 0;
        int stackOut_68_6 = 0;
        int stackOut_68_7 = 0;
        int stackOut_68_8 = 0;
        int stackOut_68_9 = 0;
        int stackOut_68_10 = 0;
        int stackOut_68_11 = 0;
        int stackOut_68_12 = 0;
        int stackOut_68_13 = 0;
        int stackOut_68_14 = 0;
        int stackOut_68_15 = 0;
        int stackOut_68_16 = 0;
        int stackOut_68_17 = 0;
        int stackOut_68_18 = 0;
        dd stackOut_67_0 = null;
        dd stackOut_67_1 = null;
        qm stackOut_67_2 = null;
        qm stackOut_67_3 = null;
        int stackOut_67_4 = 0;
        int stackOut_67_5 = 0;
        int stackOut_67_6 = 0;
        int stackOut_67_7 = 0;
        int stackOut_67_8 = 0;
        int stackOut_67_9 = 0;
        int stackOut_67_10 = 0;
        int stackOut_67_11 = 0;
        int stackOut_67_12 = 0;
        int stackOut_67_13 = 0;
        int stackOut_67_14 = 0;
        int stackOut_67_15 = 0;
        int stackOut_67_16 = 0;
        int stackOut_67_17 = 0;
        int stackOut_67_18 = 0;
        dd stackOut_69_0 = null;
        dd stackOut_69_1 = null;
        qm stackOut_69_2 = null;
        qm stackOut_69_3 = null;
        int stackOut_69_4 = 0;
        int stackOut_69_5 = 0;
        int stackOut_69_6 = 0;
        int stackOut_69_7 = 0;
        int stackOut_69_8 = 0;
        int stackOut_69_9 = 0;
        int stackOut_69_10 = 0;
        int stackOut_69_11 = 0;
        int stackOut_69_12 = 0;
        int stackOut_69_13 = 0;
        int stackOut_69_14 = 0;
        int stackOut_69_15 = 0;
        int stackOut_69_16 = 0;
        int stackOut_69_17 = 0;
        int stackOut_69_18 = 0;
        dd stackOut_71_0 = null;
        dd stackOut_71_1 = null;
        qm stackOut_71_2 = null;
        qm stackOut_71_3 = null;
        int stackOut_71_4 = 0;
        int stackOut_71_5 = 0;
        int stackOut_71_6 = 0;
        int stackOut_71_7 = 0;
        int stackOut_71_8 = 0;
        int stackOut_71_9 = 0;
        int stackOut_71_10 = 0;
        int stackOut_71_11 = 0;
        int stackOut_71_12 = 0;
        int stackOut_71_13 = 0;
        int stackOut_71_14 = 0;
        int stackOut_71_15 = 0;
        int stackOut_71_16 = 0;
        int stackOut_71_17 = 0;
        int stackOut_71_18 = 0;
        int stackOut_71_19 = 0;
        dd stackOut_70_0 = null;
        dd stackOut_70_1 = null;
        qm stackOut_70_2 = null;
        qm stackOut_70_3 = null;
        int stackOut_70_4 = 0;
        int stackOut_70_5 = 0;
        int stackOut_70_6 = 0;
        int stackOut_70_7 = 0;
        int stackOut_70_8 = 0;
        int stackOut_70_9 = 0;
        int stackOut_70_10 = 0;
        int stackOut_70_11 = 0;
        int stackOut_70_12 = 0;
        int stackOut_70_13 = 0;
        int stackOut_70_14 = 0;
        int stackOut_70_15 = 0;
        int stackOut_70_16 = 0;
        int stackOut_70_17 = 0;
        int stackOut_70_18 = 0;
        int stackOut_70_19 = 0;
        dd stackOut_72_0 = null;
        dd stackOut_72_1 = null;
        qm stackOut_72_2 = null;
        qm stackOut_72_3 = null;
        int stackOut_72_4 = 0;
        int stackOut_72_5 = 0;
        int stackOut_72_6 = 0;
        int stackOut_72_7 = 0;
        int stackOut_72_8 = 0;
        int stackOut_72_9 = 0;
        int stackOut_72_10 = 0;
        int stackOut_72_11 = 0;
        int stackOut_72_12 = 0;
        int stackOut_72_13 = 0;
        int stackOut_72_14 = 0;
        int stackOut_72_15 = 0;
        int stackOut_72_16 = 0;
        int stackOut_72_17 = 0;
        int stackOut_72_18 = 0;
        int stackOut_72_19 = 0;
        dd stackOut_74_0 = null;
        dd stackOut_74_1 = null;
        qm stackOut_74_2 = null;
        qm stackOut_74_3 = null;
        int stackOut_74_4 = 0;
        int stackOut_74_5 = 0;
        int stackOut_74_6 = 0;
        int stackOut_74_7 = 0;
        int stackOut_74_8 = 0;
        int stackOut_74_9 = 0;
        int stackOut_74_10 = 0;
        int stackOut_74_11 = 0;
        int stackOut_74_12 = 0;
        int stackOut_74_13 = 0;
        int stackOut_74_14 = 0;
        int stackOut_74_15 = 0;
        int stackOut_74_16 = 0;
        int stackOut_74_17 = 0;
        int stackOut_74_18 = 0;
        int stackOut_74_19 = 0;
        int stackOut_74_20 = 0;
        dd stackOut_73_0 = null;
        dd stackOut_73_1 = null;
        qm stackOut_73_2 = null;
        qm stackOut_73_3 = null;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        int stackOut_73_6 = 0;
        int stackOut_73_7 = 0;
        int stackOut_73_8 = 0;
        int stackOut_73_9 = 0;
        int stackOut_73_10 = 0;
        int stackOut_73_11 = 0;
        int stackOut_73_12 = 0;
        int stackOut_73_13 = 0;
        int stackOut_73_14 = 0;
        int stackOut_73_15 = 0;
        int stackOut_73_16 = 0;
        int stackOut_73_17 = 0;
        int stackOut_73_18 = 0;
        int stackOut_73_19 = 0;
        int stackOut_73_20 = 0;
        float stackOut_77_0 = 0.0f;
        float stackOut_76_0 = 0.0f;
        float stackOut_97_0 = 0.0f;
        float stackOut_96_0 = 0.0f;
        Object stackOut_100_0 = null;
        hn stackOut_99_0 = null;
        ja[] stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        ja stackOut_128_2 = null;
        ja stackOut_128_3 = null;
        int stackOut_128_4 = 0;
        int stackOut_128_5 = 0;
        int stackOut_128_6 = 0;
        float stackOut_128_7 = 0.0f;
        float stackOut_128_8 = 0.0f;
        ja[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        ja stackOut_130_2 = null;
        ja stackOut_130_3 = null;
        int stackOut_130_4 = 0;
        int stackOut_130_5 = 0;
        int stackOut_130_6 = 0;
        float stackOut_130_7 = 0.0f;
        float stackOut_130_8 = 0.0f;
        wd stackOut_130_9 = null;
        ja[] stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        ja stackOut_129_2 = null;
        ja stackOut_129_3 = null;
        int stackOut_129_4 = 0;
        int stackOut_129_5 = 0;
        int stackOut_129_6 = 0;
        float stackOut_129_7 = 0.0f;
        float stackOut_129_8 = 0.0f;
        wd stackOut_129_9 = null;
        ja[] stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        ja stackOut_137_2 = null;
        ja stackOut_137_3 = null;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_137_6 = 0;
        float stackOut_137_7 = 0.0f;
        float stackOut_137_8 = 0.0f;
        ja[] stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        ja stackOut_139_2 = null;
        ja stackOut_139_3 = null;
        int stackOut_139_4 = 0;
        int stackOut_139_5 = 0;
        int stackOut_139_6 = 0;
        float stackOut_139_7 = 0.0f;
        float stackOut_139_8 = 0.0f;
        wd stackOut_139_9 = null;
        ja[] stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        ja stackOut_138_2 = null;
        ja stackOut_138_3 = null;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        int stackOut_138_6 = 0;
        float stackOut_138_7 = 0.0f;
        float stackOut_138_8 = 0.0f;
        wd stackOut_138_9 = null;
        dd stackOut_20_0 = null;
        dd stackOut_20_1 = null;
        qm stackOut_20_2 = null;
        qm stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        int stackOut_20_9 = 0;
        int stackOut_20_10 = 0;
        int stackOut_20_11 = 0;
        int stackOut_20_12 = 0;
        int stackOut_20_13 = 0;
        int stackOut_20_14 = 0;
        dd stackOut_22_0 = null;
        dd stackOut_22_1 = null;
        qm stackOut_22_2 = null;
        qm stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        int stackOut_22_9 = 0;
        int stackOut_22_10 = 0;
        int stackOut_22_11 = 0;
        int stackOut_22_12 = 0;
        int stackOut_22_13 = 0;
        int stackOut_22_14 = 0;
        int stackOut_22_15 = 0;
        dd stackOut_21_0 = null;
        dd stackOut_21_1 = null;
        qm stackOut_21_2 = null;
        qm stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        int stackOut_21_8 = 0;
        int stackOut_21_9 = 0;
        int stackOut_21_10 = 0;
        int stackOut_21_11 = 0;
        int stackOut_21_12 = 0;
        int stackOut_21_13 = 0;
        int stackOut_21_14 = 0;
        int stackOut_21_15 = 0;
        dd stackOut_23_0 = null;
        dd stackOut_23_1 = null;
        qm stackOut_23_2 = null;
        qm stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        int stackOut_23_10 = 0;
        int stackOut_23_11 = 0;
        int stackOut_23_12 = 0;
        int stackOut_23_13 = 0;
        int stackOut_23_14 = 0;
        int stackOut_23_15 = 0;
        dd stackOut_25_0 = null;
        dd stackOut_25_1 = null;
        qm stackOut_25_2 = null;
        qm stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        int stackOut_25_9 = 0;
        int stackOut_25_10 = 0;
        int stackOut_25_11 = 0;
        int stackOut_25_12 = 0;
        int stackOut_25_13 = 0;
        int stackOut_25_14 = 0;
        int stackOut_25_15 = 0;
        int stackOut_25_16 = 0;
        dd stackOut_24_0 = null;
        dd stackOut_24_1 = null;
        qm stackOut_24_2 = null;
        qm stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        int stackOut_24_9 = 0;
        int stackOut_24_10 = 0;
        int stackOut_24_11 = 0;
        int stackOut_24_12 = 0;
        int stackOut_24_13 = 0;
        int stackOut_24_14 = 0;
        int stackOut_24_15 = 0;
        int stackOut_24_16 = 0;
        dd stackOut_26_0 = null;
        dd stackOut_26_1 = null;
        qm stackOut_26_2 = null;
        qm stackOut_26_3 = null;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        int stackOut_26_9 = 0;
        int stackOut_26_10 = 0;
        int stackOut_26_11 = 0;
        int stackOut_26_12 = 0;
        int stackOut_26_13 = 0;
        int stackOut_26_14 = 0;
        int stackOut_26_15 = 0;
        int stackOut_26_16 = 0;
        dd stackOut_28_0 = null;
        dd stackOut_28_1 = null;
        qm stackOut_28_2 = null;
        qm stackOut_28_3 = null;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        int stackOut_28_9 = 0;
        int stackOut_28_10 = 0;
        int stackOut_28_11 = 0;
        int stackOut_28_12 = 0;
        int stackOut_28_13 = 0;
        int stackOut_28_14 = 0;
        int stackOut_28_15 = 0;
        int stackOut_28_16 = 0;
        int stackOut_28_17 = 0;
        dd stackOut_27_0 = null;
        dd stackOut_27_1 = null;
        qm stackOut_27_2 = null;
        qm stackOut_27_3 = null;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        int stackOut_27_9 = 0;
        int stackOut_27_10 = 0;
        int stackOut_27_11 = 0;
        int stackOut_27_12 = 0;
        int stackOut_27_13 = 0;
        int stackOut_27_14 = 0;
        int stackOut_27_15 = 0;
        int stackOut_27_16 = 0;
        int stackOut_27_17 = 0;
        dd stackOut_29_0 = null;
        dd stackOut_29_1 = null;
        qm stackOut_29_2 = null;
        qm stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int stackOut_29_8 = 0;
        int stackOut_29_9 = 0;
        int stackOut_29_10 = 0;
        int stackOut_29_11 = 0;
        int stackOut_29_12 = 0;
        int stackOut_29_13 = 0;
        int stackOut_29_14 = 0;
        int stackOut_29_15 = 0;
        int stackOut_29_16 = 0;
        int stackOut_29_17 = 0;
        dd stackOut_31_0 = null;
        dd stackOut_31_1 = null;
        qm stackOut_31_2 = null;
        qm stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        int stackOut_31_7 = 0;
        int stackOut_31_8 = 0;
        int stackOut_31_9 = 0;
        int stackOut_31_10 = 0;
        int stackOut_31_11 = 0;
        int stackOut_31_12 = 0;
        int stackOut_31_13 = 0;
        int stackOut_31_14 = 0;
        int stackOut_31_15 = 0;
        int stackOut_31_16 = 0;
        int stackOut_31_17 = 0;
        int stackOut_31_18 = 0;
        dd stackOut_30_0 = null;
        dd stackOut_30_1 = null;
        qm stackOut_30_2 = null;
        qm stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int stackOut_30_8 = 0;
        int stackOut_30_9 = 0;
        int stackOut_30_10 = 0;
        int stackOut_30_11 = 0;
        int stackOut_30_12 = 0;
        int stackOut_30_13 = 0;
        int stackOut_30_14 = 0;
        int stackOut_30_15 = 0;
        int stackOut_30_16 = 0;
        int stackOut_30_17 = 0;
        int stackOut_30_18 = 0;
        dd stackOut_32_0 = null;
        dd stackOut_32_1 = null;
        qm stackOut_32_2 = null;
        qm stackOut_32_3 = null;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        int stackOut_32_7 = 0;
        int stackOut_32_8 = 0;
        int stackOut_32_9 = 0;
        int stackOut_32_10 = 0;
        int stackOut_32_11 = 0;
        int stackOut_32_12 = 0;
        int stackOut_32_13 = 0;
        int stackOut_32_14 = 0;
        int stackOut_32_15 = 0;
        int stackOut_32_16 = 0;
        int stackOut_32_17 = 0;
        int stackOut_32_18 = 0;
        dd stackOut_34_0 = null;
        dd stackOut_34_1 = null;
        qm stackOut_34_2 = null;
        qm stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        int stackOut_34_8 = 0;
        int stackOut_34_9 = 0;
        int stackOut_34_10 = 0;
        int stackOut_34_11 = 0;
        int stackOut_34_12 = 0;
        int stackOut_34_13 = 0;
        int stackOut_34_14 = 0;
        int stackOut_34_15 = 0;
        int stackOut_34_16 = 0;
        int stackOut_34_17 = 0;
        int stackOut_34_18 = 0;
        int stackOut_34_19 = 0;
        dd stackOut_33_0 = null;
        dd stackOut_33_1 = null;
        qm stackOut_33_2 = null;
        qm stackOut_33_3 = null;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_33_6 = 0;
        int stackOut_33_7 = 0;
        int stackOut_33_8 = 0;
        int stackOut_33_9 = 0;
        int stackOut_33_10 = 0;
        int stackOut_33_11 = 0;
        int stackOut_33_12 = 0;
        int stackOut_33_13 = 0;
        int stackOut_33_14 = 0;
        int stackOut_33_15 = 0;
        int stackOut_33_16 = 0;
        int stackOut_33_17 = 0;
        int stackOut_33_18 = 0;
        int stackOut_33_19 = 0;
        dd stackOut_35_0 = null;
        dd stackOut_35_1 = null;
        qm stackOut_35_2 = null;
        qm stackOut_35_3 = null;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        int stackOut_35_8 = 0;
        int stackOut_35_9 = 0;
        int stackOut_35_10 = 0;
        int stackOut_35_11 = 0;
        int stackOut_35_12 = 0;
        int stackOut_35_13 = 0;
        int stackOut_35_14 = 0;
        int stackOut_35_15 = 0;
        int stackOut_35_16 = 0;
        int stackOut_35_17 = 0;
        int stackOut_35_18 = 0;
        int stackOut_35_19 = 0;
        dd stackOut_37_0 = null;
        dd stackOut_37_1 = null;
        qm stackOut_37_2 = null;
        qm stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        int stackOut_37_8 = 0;
        int stackOut_37_9 = 0;
        int stackOut_37_10 = 0;
        int stackOut_37_11 = 0;
        int stackOut_37_12 = 0;
        int stackOut_37_13 = 0;
        int stackOut_37_14 = 0;
        int stackOut_37_15 = 0;
        int stackOut_37_16 = 0;
        int stackOut_37_17 = 0;
        int stackOut_37_18 = 0;
        int stackOut_37_19 = 0;
        int stackOut_37_20 = 0;
        dd stackOut_36_0 = null;
        dd stackOut_36_1 = null;
        qm stackOut_36_2 = null;
        qm stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_36_7 = 0;
        int stackOut_36_8 = 0;
        int stackOut_36_9 = 0;
        int stackOut_36_10 = 0;
        int stackOut_36_11 = 0;
        int stackOut_36_12 = 0;
        int stackOut_36_13 = 0;
        int stackOut_36_14 = 0;
        int stackOut_36_15 = 0;
        int stackOut_36_16 = 0;
        int stackOut_36_17 = 0;
        int stackOut_36_18 = 0;
        int stackOut_36_19 = 0;
        int stackOut_36_20 = 0;
        hn stackOut_38_0 = null;
        hn stackOut_38_1 = null;
        qm stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        float stackOut_38_4 = 0.0f;
        float stackOut_38_5 = 0.0f;
        int stackOut_38_6 = 0;
        int stackOut_38_7 = 0;
        int stackOut_38_8 = 0;
        int stackOut_38_9 = 0;
        int stackOut_38_10 = 0;
        Object stackOut_38_11 = null;
        Object stackOut_38_12 = null;
        qm stackOut_38_13 = null;
        hn stackOut_40_0 = null;
        hn stackOut_40_1 = null;
        qm stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        float stackOut_40_4 = 0.0f;
        float stackOut_40_5 = 0.0f;
        int stackOut_40_6 = 0;
        int stackOut_40_7 = 0;
        int stackOut_40_8 = 0;
        int stackOut_40_9 = 0;
        int stackOut_40_10 = 0;
        Object stackOut_40_11 = null;
        Object stackOut_40_12 = null;
        qm stackOut_40_13 = null;
        int stackOut_40_14 = 0;
        hn stackOut_39_0 = null;
        hn stackOut_39_1 = null;
        qm stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        float stackOut_39_4 = 0.0f;
        float stackOut_39_5 = 0.0f;
        int stackOut_39_6 = 0;
        int stackOut_39_7 = 0;
        int stackOut_39_8 = 0;
        int stackOut_39_9 = 0;
        int stackOut_39_10 = 0;
        Object stackOut_39_11 = null;
        Object stackOut_39_12 = null;
        qm stackOut_39_13 = null;
        int stackOut_39_14 = 0;
        hn stackOut_41_0 = null;
        hn stackOut_41_1 = null;
        qm stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        float stackOut_41_4 = 0.0f;
        float stackOut_41_5 = 0.0f;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        int stackOut_41_8 = 0;
        int stackOut_41_9 = 0;
        int stackOut_41_10 = 0;
        Object stackOut_41_11 = null;
        Object stackOut_41_12 = null;
        qm stackOut_41_13 = null;
        int stackOut_41_14 = 0;
        hn stackOut_43_0 = null;
        hn stackOut_43_1 = null;
        qm stackOut_43_2 = null;
        int stackOut_43_3 = 0;
        float stackOut_43_4 = 0.0f;
        float stackOut_43_5 = 0.0f;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        int stackOut_43_9 = 0;
        int stackOut_43_10 = 0;
        Object stackOut_43_11 = null;
        Object stackOut_43_12 = null;
        qm stackOut_43_13 = null;
        int stackOut_43_14 = 0;
        int stackOut_43_15 = 0;
        hn stackOut_42_0 = null;
        hn stackOut_42_1 = null;
        qm stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        float stackOut_42_4 = 0.0f;
        float stackOut_42_5 = 0.0f;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        int stackOut_42_8 = 0;
        int stackOut_42_9 = 0;
        int stackOut_42_10 = 0;
        Object stackOut_42_11 = null;
        Object stackOut_42_12 = null;
        qm stackOut_42_13 = null;
        int stackOut_42_14 = 0;
        int stackOut_42_15 = 0;
        hn stackOut_44_0 = null;
        hn stackOut_44_1 = null;
        qm stackOut_44_2 = null;
        int stackOut_44_3 = 0;
        float stackOut_44_4 = 0.0f;
        float stackOut_44_5 = 0.0f;
        int stackOut_44_6 = 0;
        int stackOut_44_7 = 0;
        int stackOut_44_8 = 0;
        int stackOut_44_9 = 0;
        int stackOut_44_10 = 0;
        Object stackOut_44_11 = null;
        Object stackOut_44_12 = null;
        qm stackOut_44_13 = null;
        int stackOut_44_14 = 0;
        int stackOut_44_15 = 0;
        hn stackOut_46_0 = null;
        hn stackOut_46_1 = null;
        qm stackOut_46_2 = null;
        int stackOut_46_3 = 0;
        float stackOut_46_4 = 0.0f;
        float stackOut_46_5 = 0.0f;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_46_10 = 0;
        Object stackOut_46_11 = null;
        Object stackOut_46_12 = null;
        qm stackOut_46_13 = null;
        int stackOut_46_14 = 0;
        int stackOut_46_15 = 0;
        int stackOut_46_16 = 0;
        hn stackOut_45_0 = null;
        hn stackOut_45_1 = null;
        qm stackOut_45_2 = null;
        int stackOut_45_3 = 0;
        float stackOut_45_4 = 0.0f;
        float stackOut_45_5 = 0.0f;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_45_10 = 0;
        Object stackOut_45_11 = null;
        Object stackOut_45_12 = null;
        qm stackOut_45_13 = null;
        int stackOut_45_14 = 0;
        int stackOut_45_15 = 0;
        int stackOut_45_16 = 0;
        hn stackOut_47_0 = null;
        hn stackOut_47_1 = null;
        qm stackOut_47_2 = null;
        int stackOut_47_3 = 0;
        float stackOut_47_4 = 0.0f;
        float stackOut_47_5 = 0.0f;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int stackOut_47_8 = 0;
        int stackOut_47_9 = 0;
        int stackOut_47_10 = 0;
        Object stackOut_47_11 = null;
        Object stackOut_47_12 = null;
        qm stackOut_47_13 = null;
        int stackOut_47_14 = 0;
        int stackOut_47_15 = 0;
        int stackOut_47_16 = 0;
        hn stackOut_49_0 = null;
        hn stackOut_49_1 = null;
        qm stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        float stackOut_49_4 = 0.0f;
        float stackOut_49_5 = 0.0f;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        int stackOut_49_8 = 0;
        int stackOut_49_9 = 0;
        int stackOut_49_10 = 0;
        Object stackOut_49_11 = null;
        Object stackOut_49_12 = null;
        qm stackOut_49_13 = null;
        int stackOut_49_14 = 0;
        int stackOut_49_15 = 0;
        int stackOut_49_16 = 0;
        int stackOut_49_17 = 0;
        hn stackOut_48_0 = null;
        hn stackOut_48_1 = null;
        qm stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        float stackOut_48_4 = 0.0f;
        float stackOut_48_5 = 0.0f;
        int stackOut_48_6 = 0;
        int stackOut_48_7 = 0;
        int stackOut_48_8 = 0;
        int stackOut_48_9 = 0;
        int stackOut_48_10 = 0;
        Object stackOut_48_11 = null;
        Object stackOut_48_12 = null;
        qm stackOut_48_13 = null;
        int stackOut_48_14 = 0;
        int stackOut_48_15 = 0;
        int stackOut_48_16 = 0;
        int stackOut_48_17 = 0;
        hn stackOut_50_0 = null;
        hn stackOut_50_1 = null;
        qm stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        float stackOut_50_4 = 0.0f;
        float stackOut_50_5 = 0.0f;
        int stackOut_50_6 = 0;
        int stackOut_50_7 = 0;
        int stackOut_50_8 = 0;
        int stackOut_50_9 = 0;
        int stackOut_50_10 = 0;
        Object stackOut_50_11 = null;
        Object stackOut_50_12 = null;
        qm stackOut_50_13 = null;
        int stackOut_50_14 = 0;
        int stackOut_50_15 = 0;
        int stackOut_50_16 = 0;
        int stackOut_50_17 = 0;
        hn stackOut_52_0 = null;
        hn stackOut_52_1 = null;
        qm stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        float stackOut_52_4 = 0.0f;
        float stackOut_52_5 = 0.0f;
        int stackOut_52_6 = 0;
        int stackOut_52_7 = 0;
        int stackOut_52_8 = 0;
        int stackOut_52_9 = 0;
        int stackOut_52_10 = 0;
        Object stackOut_52_11 = null;
        Object stackOut_52_12 = null;
        qm stackOut_52_13 = null;
        int stackOut_52_14 = 0;
        int stackOut_52_15 = 0;
        int stackOut_52_16 = 0;
        int stackOut_52_17 = 0;
        int stackOut_52_18 = 0;
        hn stackOut_51_0 = null;
        hn stackOut_51_1 = null;
        qm stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        float stackOut_51_4 = 0.0f;
        float stackOut_51_5 = 0.0f;
        int stackOut_51_6 = 0;
        int stackOut_51_7 = 0;
        int stackOut_51_8 = 0;
        int stackOut_51_9 = 0;
        int stackOut_51_10 = 0;
        Object stackOut_51_11 = null;
        Object stackOut_51_12 = null;
        qm stackOut_51_13 = null;
        int stackOut_51_14 = 0;
        int stackOut_51_15 = 0;
        int stackOut_51_16 = 0;
        int stackOut_51_17 = 0;
        int stackOut_51_18 = 0;
        hn stackOut_53_0 = null;
        hn stackOut_53_1 = null;
        qm stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        float stackOut_53_4 = 0.0f;
        float stackOut_53_5 = 0.0f;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        int stackOut_53_8 = 0;
        int stackOut_53_9 = 0;
        int stackOut_53_10 = 0;
        Object stackOut_53_11 = null;
        Object stackOut_53_12 = null;
        qm stackOut_53_13 = null;
        int stackOut_53_14 = 0;
        int stackOut_53_15 = 0;
        int stackOut_53_16 = 0;
        int stackOut_53_17 = 0;
        int stackOut_53_18 = 0;
        hn stackOut_55_0 = null;
        hn stackOut_55_1 = null;
        qm stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        float stackOut_55_4 = 0.0f;
        float stackOut_55_5 = 0.0f;
        int stackOut_55_6 = 0;
        int stackOut_55_7 = 0;
        int stackOut_55_8 = 0;
        int stackOut_55_9 = 0;
        int stackOut_55_10 = 0;
        Object stackOut_55_11 = null;
        Object stackOut_55_12 = null;
        qm stackOut_55_13 = null;
        int stackOut_55_14 = 0;
        int stackOut_55_15 = 0;
        int stackOut_55_16 = 0;
        int stackOut_55_17 = 0;
        int stackOut_55_18 = 0;
        int stackOut_55_19 = 0;
        hn stackOut_54_0 = null;
        hn stackOut_54_1 = null;
        qm stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        float stackOut_54_4 = 0.0f;
        float stackOut_54_5 = 0.0f;
        int stackOut_54_6 = 0;
        int stackOut_54_7 = 0;
        int stackOut_54_8 = 0;
        int stackOut_54_9 = 0;
        int stackOut_54_10 = 0;
        Object stackOut_54_11 = null;
        Object stackOut_54_12 = null;
        qm stackOut_54_13 = null;
        int stackOut_54_14 = 0;
        int stackOut_54_15 = 0;
        int stackOut_54_16 = 0;
        int stackOut_54_17 = 0;
        int stackOut_54_18 = 0;
        int stackOut_54_19 = 0;
        var25 = null;
        var40_ref = null;
        var41_ref = null;
        var42_ref = null;
        var50 = HoldTheLine.field_D;
        var4 = new th(param0.field_s);
        var5 = new byte[ho.field_m.length];
        var4.a(ho.field_m.length, 0, (byte) 106, var5);
        if (!nd.a(ho.field_m, 0, var5)) {
          throw new IOException("Invalid file format!");
        } else {
          L0: {
            var6 = new byte[rh.field_a.length];
            var4.a(rh.field_a.length, 0, (byte) 98, var6);
            if (!nd.a(bi.field_b, 0, var6)) {
              if (nd.a(nc.field_e, 0, var6)) {
                var7 = 1;
                break L0;
              } else {
                throw new IOException("Invalid file version!");
              }
            } else {
              var7 = 0;
              break L0;
            }
          }
          L1: {
            ((sg) this).field_L = (byte)var4.f((byte) -48);
            ((sg) this).field_X = ((sg) this).field_L & 7;
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (((sg) this).field_X != 0) {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (((sg) this).field_X >= 3) {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (((sg) this).field_X < 6) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L1;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 3;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L1;
                }
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_15_0 = stackOut_11_0;
                stackIn_15_1 = stackOut_11_1;
                break L1;
              }
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_15_0 = stackOut_9_0;
              stackIn_15_1 = stackOut_9_1;
              break L1;
            }
          }
          L2: {
            ((sg) this).field_r = stackIn_15_1;
            var8 = var4.f((byte) -47);
            var9 = var4.f((byte) -123);
            var10 = 0;
            var11 = 0;
            if (var7 != 0) {
              var10 = var4.f((byte) -105);
              var11 = var4.f((byte) -52);
              break L2;
            } else {
              break L2;
            }
          }
          var12 = var4.f((byte) -104);
          var13 = new byte[var8 * 2];
          var4.a(var8 * 2, 0, (byte) 115, var13);
          var20 = new ei();
          ((sg) this).field_cb = new ah();
          ((sg) this).field_d = new ah();
          var14 = 0;
          L3: while (true) {
            if (~var9 >= ~var14) {
              L4: {
                var21 = new qm(var4.h(-14232), var4.h(-14232));
                var22 = new qm(var4.h(-14232), var4.h(-14232));
                var16 = var4.f(0);
                var17 = var4.f((byte) -75);
                var18 = var4.f(0);
                var19 = var4.f(0);
                stackOut_57_0 = null;
                stackOut_57_1 = null;
                stackOut_57_2 = (qm) var21;
                stackOut_57_3 = (qm) var22;
                stackOut_57_4 = var16;
                stackOut_57_5 = 0;
                stackOut_57_6 = 0;
                stackOut_57_7 = 0;
                stackOut_57_8 = 0;
                stackOut_57_9 = 0;
                stackOut_57_10 = 0;
                stackOut_57_11 = 0;
                stackOut_57_12 = 0;
                stackOut_57_13 = var18;
                stackOut_57_14 = var19;
                stackIn_59_0 = stackOut_57_0;
                stackIn_59_1 = stackOut_57_1;
                stackIn_59_2 = stackOut_57_2;
                stackIn_59_3 = stackOut_57_3;
                stackIn_59_4 = stackOut_57_4;
                stackIn_59_5 = stackOut_57_5;
                stackIn_59_6 = stackOut_57_6;
                stackIn_59_7 = stackOut_57_7;
                stackIn_59_8 = stackOut_57_8;
                stackIn_59_9 = stackOut_57_9;
                stackIn_59_10 = stackOut_57_10;
                stackIn_59_11 = stackOut_57_11;
                stackIn_59_12 = stackOut_57_12;
                stackIn_59_13 = stackOut_57_13;
                stackIn_59_14 = stackOut_57_14;
                stackIn_58_0 = stackOut_57_0;
                stackIn_58_1 = stackOut_57_1;
                stackIn_58_2 = stackOut_57_2;
                stackIn_58_3 = stackOut_57_3;
                stackIn_58_4 = stackOut_57_4;
                stackIn_58_5 = stackOut_57_5;
                stackIn_58_6 = stackOut_57_6;
                stackIn_58_7 = stackOut_57_7;
                stackIn_58_8 = stackOut_57_8;
                stackIn_58_9 = stackOut_57_9;
                stackIn_58_10 = stackOut_57_10;
                stackIn_58_11 = stackOut_57_11;
                stackIn_58_12 = stackOut_57_12;
                stackIn_58_13 = stackOut_57_13;
                stackIn_58_14 = stackOut_57_14;
                if (0 == (2 & var17)) {
                  stackOut_59_0 = null;
                  stackOut_59_1 = null;
                  stackOut_59_2 = (qm) (Object) stackIn_59_2;
                  stackOut_59_3 = (qm) (Object) stackIn_59_3;
                  stackOut_59_4 = stackIn_59_4;
                  stackOut_59_5 = stackIn_59_5;
                  stackOut_59_6 = stackIn_59_6;
                  stackOut_59_7 = stackIn_59_7;
                  stackOut_59_8 = stackIn_59_8;
                  stackOut_59_9 = stackIn_59_9;
                  stackOut_59_10 = stackIn_59_10;
                  stackOut_59_11 = stackIn_59_11;
                  stackOut_59_12 = stackIn_59_12;
                  stackOut_59_13 = stackIn_59_13;
                  stackOut_59_14 = stackIn_59_14;
                  stackOut_59_15 = 0;
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  stackIn_60_2 = stackOut_59_2;
                  stackIn_60_3 = stackOut_59_3;
                  stackIn_60_4 = stackOut_59_4;
                  stackIn_60_5 = stackOut_59_5;
                  stackIn_60_6 = stackOut_59_6;
                  stackIn_60_7 = stackOut_59_7;
                  stackIn_60_8 = stackOut_59_8;
                  stackIn_60_9 = stackOut_59_9;
                  stackIn_60_10 = stackOut_59_10;
                  stackIn_60_11 = stackOut_59_11;
                  stackIn_60_12 = stackOut_59_12;
                  stackIn_60_13 = stackOut_59_13;
                  stackIn_60_14 = stackOut_59_14;
                  stackIn_60_15 = stackOut_59_15;
                  break L4;
                } else {
                  stackOut_58_0 = null;
                  stackOut_58_1 = null;
                  stackOut_58_2 = (qm) (Object) stackIn_58_2;
                  stackOut_58_3 = (qm) (Object) stackIn_58_3;
                  stackOut_58_4 = stackIn_58_4;
                  stackOut_58_5 = stackIn_58_5;
                  stackOut_58_6 = stackIn_58_6;
                  stackOut_58_7 = stackIn_58_7;
                  stackOut_58_8 = stackIn_58_8;
                  stackOut_58_9 = stackIn_58_9;
                  stackOut_58_10 = stackIn_58_10;
                  stackOut_58_11 = stackIn_58_11;
                  stackOut_58_12 = stackIn_58_12;
                  stackOut_58_13 = stackIn_58_13;
                  stackOut_58_14 = stackIn_58_14;
                  stackOut_58_15 = 1;
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_60_1 = stackOut_58_1;
                  stackIn_60_2 = stackOut_58_2;
                  stackIn_60_3 = stackOut_58_3;
                  stackIn_60_4 = stackOut_58_4;
                  stackIn_60_5 = stackOut_58_5;
                  stackIn_60_6 = stackOut_58_6;
                  stackIn_60_7 = stackOut_58_7;
                  stackIn_60_8 = stackOut_58_8;
                  stackIn_60_9 = stackOut_58_9;
                  stackIn_60_10 = stackOut_58_10;
                  stackIn_60_11 = stackOut_58_11;
                  stackIn_60_12 = stackOut_58_12;
                  stackIn_60_13 = stackOut_58_13;
                  stackIn_60_14 = stackOut_58_14;
                  stackIn_60_15 = stackOut_58_15;
                  break L4;
                }
              }
              L5: {
                stackOut_60_0 = null;
                stackOut_60_1 = null;
                stackOut_60_2 = (qm) (Object) stackIn_60_2;
                stackOut_60_3 = (qm) (Object) stackIn_60_3;
                stackOut_60_4 = stackIn_60_4;
                stackOut_60_5 = stackIn_60_5;
                stackOut_60_6 = stackIn_60_6;
                stackOut_60_7 = stackIn_60_7;
                stackOut_60_8 = stackIn_60_8;
                stackOut_60_9 = stackIn_60_9;
                stackOut_60_10 = stackIn_60_10;
                stackOut_60_11 = stackIn_60_11;
                stackOut_60_12 = stackIn_60_12;
                stackOut_60_13 = stackIn_60_13;
                stackOut_60_14 = stackIn_60_14;
                stackOut_60_15 = stackIn_60_15;
                stackIn_62_0 = stackOut_60_0;
                stackIn_62_1 = stackOut_60_1;
                stackIn_62_2 = stackOut_60_2;
                stackIn_62_3 = stackOut_60_3;
                stackIn_62_4 = stackOut_60_4;
                stackIn_62_5 = stackOut_60_5;
                stackIn_62_6 = stackOut_60_6;
                stackIn_62_7 = stackOut_60_7;
                stackIn_62_8 = stackOut_60_8;
                stackIn_62_9 = stackOut_60_9;
                stackIn_62_10 = stackOut_60_10;
                stackIn_62_11 = stackOut_60_11;
                stackIn_62_12 = stackOut_60_12;
                stackIn_62_13 = stackOut_60_13;
                stackIn_62_14 = stackOut_60_14;
                stackIn_62_15 = stackOut_60_15;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                stackIn_61_2 = stackOut_60_2;
                stackIn_61_3 = stackOut_60_3;
                stackIn_61_4 = stackOut_60_4;
                stackIn_61_5 = stackOut_60_5;
                stackIn_61_6 = stackOut_60_6;
                stackIn_61_7 = stackOut_60_7;
                stackIn_61_8 = stackOut_60_8;
                stackIn_61_9 = stackOut_60_9;
                stackIn_61_10 = stackOut_60_10;
                stackIn_61_11 = stackOut_60_11;
                stackIn_61_12 = stackOut_60_12;
                stackIn_61_13 = stackOut_60_13;
                stackIn_61_14 = stackOut_60_14;
                stackIn_61_15 = stackOut_60_15;
                if ((var17 & 4) == 0) {
                  stackOut_62_0 = null;
                  stackOut_62_1 = null;
                  stackOut_62_2 = (qm) (Object) stackIn_62_2;
                  stackOut_62_3 = (qm) (Object) stackIn_62_3;
                  stackOut_62_4 = stackIn_62_4;
                  stackOut_62_5 = stackIn_62_5;
                  stackOut_62_6 = stackIn_62_6;
                  stackOut_62_7 = stackIn_62_7;
                  stackOut_62_8 = stackIn_62_8;
                  stackOut_62_9 = stackIn_62_9;
                  stackOut_62_10 = stackIn_62_10;
                  stackOut_62_11 = stackIn_62_11;
                  stackOut_62_12 = stackIn_62_12;
                  stackOut_62_13 = stackIn_62_13;
                  stackOut_62_14 = stackIn_62_14;
                  stackOut_62_15 = stackIn_62_15;
                  stackOut_62_16 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  stackIn_63_2 = stackOut_62_2;
                  stackIn_63_3 = stackOut_62_3;
                  stackIn_63_4 = stackOut_62_4;
                  stackIn_63_5 = stackOut_62_5;
                  stackIn_63_6 = stackOut_62_6;
                  stackIn_63_7 = stackOut_62_7;
                  stackIn_63_8 = stackOut_62_8;
                  stackIn_63_9 = stackOut_62_9;
                  stackIn_63_10 = stackOut_62_10;
                  stackIn_63_11 = stackOut_62_11;
                  stackIn_63_12 = stackOut_62_12;
                  stackIn_63_13 = stackOut_62_13;
                  stackIn_63_14 = stackOut_62_14;
                  stackIn_63_15 = stackOut_62_15;
                  stackIn_63_16 = stackOut_62_16;
                  break L5;
                } else {
                  stackOut_61_0 = null;
                  stackOut_61_1 = null;
                  stackOut_61_2 = (qm) (Object) stackIn_61_2;
                  stackOut_61_3 = (qm) (Object) stackIn_61_3;
                  stackOut_61_4 = stackIn_61_4;
                  stackOut_61_5 = stackIn_61_5;
                  stackOut_61_6 = stackIn_61_6;
                  stackOut_61_7 = stackIn_61_7;
                  stackOut_61_8 = stackIn_61_8;
                  stackOut_61_9 = stackIn_61_9;
                  stackOut_61_10 = stackIn_61_10;
                  stackOut_61_11 = stackIn_61_11;
                  stackOut_61_12 = stackIn_61_12;
                  stackOut_61_13 = stackIn_61_13;
                  stackOut_61_14 = stackIn_61_14;
                  stackOut_61_15 = stackIn_61_15;
                  stackOut_61_16 = 1;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  stackIn_63_2 = stackOut_61_2;
                  stackIn_63_3 = stackOut_61_3;
                  stackIn_63_4 = stackOut_61_4;
                  stackIn_63_5 = stackOut_61_5;
                  stackIn_63_6 = stackOut_61_6;
                  stackIn_63_7 = stackOut_61_7;
                  stackIn_63_8 = stackOut_61_8;
                  stackIn_63_9 = stackOut_61_9;
                  stackIn_63_10 = stackOut_61_10;
                  stackIn_63_11 = stackOut_61_11;
                  stackIn_63_12 = stackOut_61_12;
                  stackIn_63_13 = stackOut_61_13;
                  stackIn_63_14 = stackOut_61_14;
                  stackIn_63_15 = stackOut_61_15;
                  stackIn_63_16 = stackOut_61_16;
                  break L5;
                }
              }
              L6: {
                stackOut_63_0 = null;
                stackOut_63_1 = null;
                stackOut_63_2 = (qm) (Object) stackIn_63_2;
                stackOut_63_3 = (qm) (Object) stackIn_63_3;
                stackOut_63_4 = stackIn_63_4;
                stackOut_63_5 = stackIn_63_5;
                stackOut_63_6 = stackIn_63_6;
                stackOut_63_7 = stackIn_63_7;
                stackOut_63_8 = stackIn_63_8;
                stackOut_63_9 = stackIn_63_9;
                stackOut_63_10 = stackIn_63_10;
                stackOut_63_11 = stackIn_63_11;
                stackOut_63_12 = stackIn_63_12;
                stackOut_63_13 = stackIn_63_13;
                stackOut_63_14 = stackIn_63_14;
                stackOut_63_15 = stackIn_63_15;
                stackOut_63_16 = stackIn_63_16;
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                stackIn_65_2 = stackOut_63_2;
                stackIn_65_3 = stackOut_63_3;
                stackIn_65_4 = stackOut_63_4;
                stackIn_65_5 = stackOut_63_5;
                stackIn_65_6 = stackOut_63_6;
                stackIn_65_7 = stackOut_63_7;
                stackIn_65_8 = stackOut_63_8;
                stackIn_65_9 = stackOut_63_9;
                stackIn_65_10 = stackOut_63_10;
                stackIn_65_11 = stackOut_63_11;
                stackIn_65_12 = stackOut_63_12;
                stackIn_65_13 = stackOut_63_13;
                stackIn_65_14 = stackOut_63_14;
                stackIn_65_15 = stackOut_63_15;
                stackIn_65_16 = stackOut_63_16;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                stackIn_64_2 = stackOut_63_2;
                stackIn_64_3 = stackOut_63_3;
                stackIn_64_4 = stackOut_63_4;
                stackIn_64_5 = stackOut_63_5;
                stackIn_64_6 = stackOut_63_6;
                stackIn_64_7 = stackOut_63_7;
                stackIn_64_8 = stackOut_63_8;
                stackIn_64_9 = stackOut_63_9;
                stackIn_64_10 = stackOut_63_10;
                stackIn_64_11 = stackOut_63_11;
                stackIn_64_12 = stackOut_63_12;
                stackIn_64_13 = stackOut_63_13;
                stackIn_64_14 = stackOut_63_14;
                stackIn_64_15 = stackOut_63_15;
                stackIn_64_16 = stackOut_63_16;
                if ((var17 & 1) == 0) {
                  stackOut_65_0 = null;
                  stackOut_65_1 = null;
                  stackOut_65_2 = (qm) (Object) stackIn_65_2;
                  stackOut_65_3 = (qm) (Object) stackIn_65_3;
                  stackOut_65_4 = stackIn_65_4;
                  stackOut_65_5 = stackIn_65_5;
                  stackOut_65_6 = stackIn_65_6;
                  stackOut_65_7 = stackIn_65_7;
                  stackOut_65_8 = stackIn_65_8;
                  stackOut_65_9 = stackIn_65_9;
                  stackOut_65_10 = stackIn_65_10;
                  stackOut_65_11 = stackIn_65_11;
                  stackOut_65_12 = stackIn_65_12;
                  stackOut_65_13 = stackIn_65_13;
                  stackOut_65_14 = stackIn_65_14;
                  stackOut_65_15 = stackIn_65_15;
                  stackOut_65_16 = stackIn_65_16;
                  stackOut_65_17 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  stackIn_66_2 = stackOut_65_2;
                  stackIn_66_3 = stackOut_65_3;
                  stackIn_66_4 = stackOut_65_4;
                  stackIn_66_5 = stackOut_65_5;
                  stackIn_66_6 = stackOut_65_6;
                  stackIn_66_7 = stackOut_65_7;
                  stackIn_66_8 = stackOut_65_8;
                  stackIn_66_9 = stackOut_65_9;
                  stackIn_66_10 = stackOut_65_10;
                  stackIn_66_11 = stackOut_65_11;
                  stackIn_66_12 = stackOut_65_12;
                  stackIn_66_13 = stackOut_65_13;
                  stackIn_66_14 = stackOut_65_14;
                  stackIn_66_15 = stackOut_65_15;
                  stackIn_66_16 = stackOut_65_16;
                  stackIn_66_17 = stackOut_65_17;
                  break L6;
                } else {
                  stackOut_64_0 = null;
                  stackOut_64_1 = null;
                  stackOut_64_2 = (qm) (Object) stackIn_64_2;
                  stackOut_64_3 = (qm) (Object) stackIn_64_3;
                  stackOut_64_4 = stackIn_64_4;
                  stackOut_64_5 = stackIn_64_5;
                  stackOut_64_6 = stackIn_64_6;
                  stackOut_64_7 = stackIn_64_7;
                  stackOut_64_8 = stackIn_64_8;
                  stackOut_64_9 = stackIn_64_9;
                  stackOut_64_10 = stackIn_64_10;
                  stackOut_64_11 = stackIn_64_11;
                  stackOut_64_12 = stackIn_64_12;
                  stackOut_64_13 = stackIn_64_13;
                  stackOut_64_14 = stackIn_64_14;
                  stackOut_64_15 = stackIn_64_15;
                  stackOut_64_16 = stackIn_64_16;
                  stackOut_64_17 = 1;
                  stackIn_66_0 = stackOut_64_0;
                  stackIn_66_1 = stackOut_64_1;
                  stackIn_66_2 = stackOut_64_2;
                  stackIn_66_3 = stackOut_64_3;
                  stackIn_66_4 = stackOut_64_4;
                  stackIn_66_5 = stackOut_64_5;
                  stackIn_66_6 = stackOut_64_6;
                  stackIn_66_7 = stackOut_64_7;
                  stackIn_66_8 = stackOut_64_8;
                  stackIn_66_9 = stackOut_64_9;
                  stackIn_66_10 = stackOut_64_10;
                  stackIn_66_11 = stackOut_64_11;
                  stackIn_66_12 = stackOut_64_12;
                  stackIn_66_13 = stackOut_64_13;
                  stackIn_66_14 = stackOut_64_14;
                  stackIn_66_15 = stackOut_64_15;
                  stackIn_66_16 = stackOut_64_16;
                  stackIn_66_17 = stackOut_64_17;
                  break L6;
                }
              }
              L7: {
                stackOut_66_0 = null;
                stackOut_66_1 = null;
                stackOut_66_2 = (qm) (Object) stackIn_66_2;
                stackOut_66_3 = (qm) (Object) stackIn_66_3;
                stackOut_66_4 = stackIn_66_4;
                stackOut_66_5 = stackIn_66_5;
                stackOut_66_6 = stackIn_66_6;
                stackOut_66_7 = stackIn_66_7;
                stackOut_66_8 = stackIn_66_8;
                stackOut_66_9 = stackIn_66_9;
                stackOut_66_10 = stackIn_66_10;
                stackOut_66_11 = stackIn_66_11;
                stackOut_66_12 = stackIn_66_12;
                stackOut_66_13 = stackIn_66_13;
                stackOut_66_14 = stackIn_66_14;
                stackOut_66_15 = stackIn_66_15;
                stackOut_66_16 = stackIn_66_16;
                stackOut_66_17 = stackIn_66_17;
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_68_2 = stackOut_66_2;
                stackIn_68_3 = stackOut_66_3;
                stackIn_68_4 = stackOut_66_4;
                stackIn_68_5 = stackOut_66_5;
                stackIn_68_6 = stackOut_66_6;
                stackIn_68_7 = stackOut_66_7;
                stackIn_68_8 = stackOut_66_8;
                stackIn_68_9 = stackOut_66_9;
                stackIn_68_10 = stackOut_66_10;
                stackIn_68_11 = stackOut_66_11;
                stackIn_68_12 = stackOut_66_12;
                stackIn_68_13 = stackOut_66_13;
                stackIn_68_14 = stackOut_66_14;
                stackIn_68_15 = stackOut_66_15;
                stackIn_68_16 = stackOut_66_16;
                stackIn_68_17 = stackOut_66_17;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                stackIn_67_2 = stackOut_66_2;
                stackIn_67_3 = stackOut_66_3;
                stackIn_67_4 = stackOut_66_4;
                stackIn_67_5 = stackOut_66_5;
                stackIn_67_6 = stackOut_66_6;
                stackIn_67_7 = stackOut_66_7;
                stackIn_67_8 = stackOut_66_8;
                stackIn_67_9 = stackOut_66_9;
                stackIn_67_10 = stackOut_66_10;
                stackIn_67_11 = stackOut_66_11;
                stackIn_67_12 = stackOut_66_12;
                stackIn_67_13 = stackOut_66_13;
                stackIn_67_14 = stackOut_66_14;
                stackIn_67_15 = stackOut_66_15;
                stackIn_67_16 = stackOut_66_16;
                stackIn_67_17 = stackOut_66_17;
                if (0 == (8 & var17)) {
                  stackOut_68_0 = null;
                  stackOut_68_1 = null;
                  stackOut_68_2 = (qm) (Object) stackIn_68_2;
                  stackOut_68_3 = (qm) (Object) stackIn_68_3;
                  stackOut_68_4 = stackIn_68_4;
                  stackOut_68_5 = stackIn_68_5;
                  stackOut_68_6 = stackIn_68_6;
                  stackOut_68_7 = stackIn_68_7;
                  stackOut_68_8 = stackIn_68_8;
                  stackOut_68_9 = stackIn_68_9;
                  stackOut_68_10 = stackIn_68_10;
                  stackOut_68_11 = stackIn_68_11;
                  stackOut_68_12 = stackIn_68_12;
                  stackOut_68_13 = stackIn_68_13;
                  stackOut_68_14 = stackIn_68_14;
                  stackOut_68_15 = stackIn_68_15;
                  stackOut_68_16 = stackIn_68_16;
                  stackOut_68_17 = stackIn_68_17;
                  stackOut_68_18 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  stackIn_69_3 = stackOut_68_3;
                  stackIn_69_4 = stackOut_68_4;
                  stackIn_69_5 = stackOut_68_5;
                  stackIn_69_6 = stackOut_68_6;
                  stackIn_69_7 = stackOut_68_7;
                  stackIn_69_8 = stackOut_68_8;
                  stackIn_69_9 = stackOut_68_9;
                  stackIn_69_10 = stackOut_68_10;
                  stackIn_69_11 = stackOut_68_11;
                  stackIn_69_12 = stackOut_68_12;
                  stackIn_69_13 = stackOut_68_13;
                  stackIn_69_14 = stackOut_68_14;
                  stackIn_69_15 = stackOut_68_15;
                  stackIn_69_16 = stackOut_68_16;
                  stackIn_69_17 = stackOut_68_17;
                  stackIn_69_18 = stackOut_68_18;
                  break L7;
                } else {
                  stackOut_67_0 = null;
                  stackOut_67_1 = null;
                  stackOut_67_2 = (qm) (Object) stackIn_67_2;
                  stackOut_67_3 = (qm) (Object) stackIn_67_3;
                  stackOut_67_4 = stackIn_67_4;
                  stackOut_67_5 = stackIn_67_5;
                  stackOut_67_6 = stackIn_67_6;
                  stackOut_67_7 = stackIn_67_7;
                  stackOut_67_8 = stackIn_67_8;
                  stackOut_67_9 = stackIn_67_9;
                  stackOut_67_10 = stackIn_67_10;
                  stackOut_67_11 = stackIn_67_11;
                  stackOut_67_12 = stackIn_67_12;
                  stackOut_67_13 = stackIn_67_13;
                  stackOut_67_14 = stackIn_67_14;
                  stackOut_67_15 = stackIn_67_15;
                  stackOut_67_16 = stackIn_67_16;
                  stackOut_67_17 = stackIn_67_17;
                  stackOut_67_18 = 1;
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  stackIn_69_3 = stackOut_67_3;
                  stackIn_69_4 = stackOut_67_4;
                  stackIn_69_5 = stackOut_67_5;
                  stackIn_69_6 = stackOut_67_6;
                  stackIn_69_7 = stackOut_67_7;
                  stackIn_69_8 = stackOut_67_8;
                  stackIn_69_9 = stackOut_67_9;
                  stackIn_69_10 = stackOut_67_10;
                  stackIn_69_11 = stackOut_67_11;
                  stackIn_69_12 = stackOut_67_12;
                  stackIn_69_13 = stackOut_67_13;
                  stackIn_69_14 = stackOut_67_14;
                  stackIn_69_15 = stackOut_67_15;
                  stackIn_69_16 = stackOut_67_16;
                  stackIn_69_17 = stackOut_67_17;
                  stackIn_69_18 = stackOut_67_18;
                  break L7;
                }
              }
              L8: {
                stackOut_69_0 = null;
                stackOut_69_1 = null;
                stackOut_69_2 = (qm) (Object) stackIn_69_2;
                stackOut_69_3 = (qm) (Object) stackIn_69_3;
                stackOut_69_4 = stackIn_69_4;
                stackOut_69_5 = stackIn_69_5;
                stackOut_69_6 = stackIn_69_6;
                stackOut_69_7 = stackIn_69_7;
                stackOut_69_8 = stackIn_69_8;
                stackOut_69_9 = stackIn_69_9;
                stackOut_69_10 = stackIn_69_10;
                stackOut_69_11 = stackIn_69_11;
                stackOut_69_12 = stackIn_69_12;
                stackOut_69_13 = stackIn_69_13;
                stackOut_69_14 = stackIn_69_14;
                stackOut_69_15 = stackIn_69_15;
                stackOut_69_16 = stackIn_69_16;
                stackOut_69_17 = stackIn_69_17;
                stackOut_69_18 = stackIn_69_18;
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_71_2 = stackOut_69_2;
                stackIn_71_3 = stackOut_69_3;
                stackIn_71_4 = stackOut_69_4;
                stackIn_71_5 = stackOut_69_5;
                stackIn_71_6 = stackOut_69_6;
                stackIn_71_7 = stackOut_69_7;
                stackIn_71_8 = stackOut_69_8;
                stackIn_71_9 = stackOut_69_9;
                stackIn_71_10 = stackOut_69_10;
                stackIn_71_11 = stackOut_69_11;
                stackIn_71_12 = stackOut_69_12;
                stackIn_71_13 = stackOut_69_13;
                stackIn_71_14 = stackOut_69_14;
                stackIn_71_15 = stackOut_69_15;
                stackIn_71_16 = stackOut_69_16;
                stackIn_71_17 = stackOut_69_17;
                stackIn_71_18 = stackOut_69_18;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                stackIn_70_2 = stackOut_69_2;
                stackIn_70_3 = stackOut_69_3;
                stackIn_70_4 = stackOut_69_4;
                stackIn_70_5 = stackOut_69_5;
                stackIn_70_6 = stackOut_69_6;
                stackIn_70_7 = stackOut_69_7;
                stackIn_70_8 = stackOut_69_8;
                stackIn_70_9 = stackOut_69_9;
                stackIn_70_10 = stackOut_69_10;
                stackIn_70_11 = stackOut_69_11;
                stackIn_70_12 = stackOut_69_12;
                stackIn_70_13 = stackOut_69_13;
                stackIn_70_14 = stackOut_69_14;
                stackIn_70_15 = stackOut_69_15;
                stackIn_70_16 = stackOut_69_16;
                stackIn_70_17 = stackOut_69_17;
                stackIn_70_18 = stackOut_69_18;
                if ((16 & var17) == 0) {
                  stackOut_71_0 = null;
                  stackOut_71_1 = null;
                  stackOut_71_2 = (qm) (Object) stackIn_71_2;
                  stackOut_71_3 = (qm) (Object) stackIn_71_3;
                  stackOut_71_4 = stackIn_71_4;
                  stackOut_71_5 = stackIn_71_5;
                  stackOut_71_6 = stackIn_71_6;
                  stackOut_71_7 = stackIn_71_7;
                  stackOut_71_8 = stackIn_71_8;
                  stackOut_71_9 = stackIn_71_9;
                  stackOut_71_10 = stackIn_71_10;
                  stackOut_71_11 = stackIn_71_11;
                  stackOut_71_12 = stackIn_71_12;
                  stackOut_71_13 = stackIn_71_13;
                  stackOut_71_14 = stackIn_71_14;
                  stackOut_71_15 = stackIn_71_15;
                  stackOut_71_16 = stackIn_71_16;
                  stackOut_71_17 = stackIn_71_17;
                  stackOut_71_18 = stackIn_71_18;
                  stackOut_71_19 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  stackIn_72_3 = stackOut_71_3;
                  stackIn_72_4 = stackOut_71_4;
                  stackIn_72_5 = stackOut_71_5;
                  stackIn_72_6 = stackOut_71_6;
                  stackIn_72_7 = stackOut_71_7;
                  stackIn_72_8 = stackOut_71_8;
                  stackIn_72_9 = stackOut_71_9;
                  stackIn_72_10 = stackOut_71_10;
                  stackIn_72_11 = stackOut_71_11;
                  stackIn_72_12 = stackOut_71_12;
                  stackIn_72_13 = stackOut_71_13;
                  stackIn_72_14 = stackOut_71_14;
                  stackIn_72_15 = stackOut_71_15;
                  stackIn_72_16 = stackOut_71_16;
                  stackIn_72_17 = stackOut_71_17;
                  stackIn_72_18 = stackOut_71_18;
                  stackIn_72_19 = stackOut_71_19;
                  break L8;
                } else {
                  stackOut_70_0 = null;
                  stackOut_70_1 = null;
                  stackOut_70_2 = (qm) (Object) stackIn_70_2;
                  stackOut_70_3 = (qm) (Object) stackIn_70_3;
                  stackOut_70_4 = stackIn_70_4;
                  stackOut_70_5 = stackIn_70_5;
                  stackOut_70_6 = stackIn_70_6;
                  stackOut_70_7 = stackIn_70_7;
                  stackOut_70_8 = stackIn_70_8;
                  stackOut_70_9 = stackIn_70_9;
                  stackOut_70_10 = stackIn_70_10;
                  stackOut_70_11 = stackIn_70_11;
                  stackOut_70_12 = stackIn_70_12;
                  stackOut_70_13 = stackIn_70_13;
                  stackOut_70_14 = stackIn_70_14;
                  stackOut_70_15 = stackIn_70_15;
                  stackOut_70_16 = stackIn_70_16;
                  stackOut_70_17 = stackIn_70_17;
                  stackOut_70_18 = stackIn_70_18;
                  stackOut_70_19 = 1;
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  stackIn_72_3 = stackOut_70_3;
                  stackIn_72_4 = stackOut_70_4;
                  stackIn_72_5 = stackOut_70_5;
                  stackIn_72_6 = stackOut_70_6;
                  stackIn_72_7 = stackOut_70_7;
                  stackIn_72_8 = stackOut_70_8;
                  stackIn_72_9 = stackOut_70_9;
                  stackIn_72_10 = stackOut_70_10;
                  stackIn_72_11 = stackOut_70_11;
                  stackIn_72_12 = stackOut_70_12;
                  stackIn_72_13 = stackOut_70_13;
                  stackIn_72_14 = stackOut_70_14;
                  stackIn_72_15 = stackOut_70_15;
                  stackIn_72_16 = stackOut_70_16;
                  stackIn_72_17 = stackOut_70_17;
                  stackIn_72_18 = stackOut_70_18;
                  stackIn_72_19 = stackOut_70_19;
                  break L8;
                }
              }
              L9: {
                stackOut_72_0 = null;
                stackOut_72_1 = null;
                stackOut_72_2 = (qm) (Object) stackIn_72_2;
                stackOut_72_3 = (qm) (Object) stackIn_72_3;
                stackOut_72_4 = stackIn_72_4;
                stackOut_72_5 = stackIn_72_5;
                stackOut_72_6 = stackIn_72_6;
                stackOut_72_7 = stackIn_72_7;
                stackOut_72_8 = stackIn_72_8;
                stackOut_72_9 = stackIn_72_9;
                stackOut_72_10 = stackIn_72_10;
                stackOut_72_11 = stackIn_72_11;
                stackOut_72_12 = stackIn_72_12;
                stackOut_72_13 = stackIn_72_13;
                stackOut_72_14 = stackIn_72_14;
                stackOut_72_15 = stackIn_72_15;
                stackOut_72_16 = stackIn_72_16;
                stackOut_72_17 = stackIn_72_17;
                stackOut_72_18 = stackIn_72_18;
                stackOut_72_19 = stackIn_72_19;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_74_2 = stackOut_72_2;
                stackIn_74_3 = stackOut_72_3;
                stackIn_74_4 = stackOut_72_4;
                stackIn_74_5 = stackOut_72_5;
                stackIn_74_6 = stackOut_72_6;
                stackIn_74_7 = stackOut_72_7;
                stackIn_74_8 = stackOut_72_8;
                stackIn_74_9 = stackOut_72_9;
                stackIn_74_10 = stackOut_72_10;
                stackIn_74_11 = stackOut_72_11;
                stackIn_74_12 = stackOut_72_12;
                stackIn_74_13 = stackOut_72_13;
                stackIn_74_14 = stackOut_72_14;
                stackIn_74_15 = stackOut_72_15;
                stackIn_74_16 = stackOut_72_16;
                stackIn_74_17 = stackOut_72_17;
                stackIn_74_18 = stackOut_72_18;
                stackIn_74_19 = stackOut_72_19;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                stackIn_73_2 = stackOut_72_2;
                stackIn_73_3 = stackOut_72_3;
                stackIn_73_4 = stackOut_72_4;
                stackIn_73_5 = stackOut_72_5;
                stackIn_73_6 = stackOut_72_6;
                stackIn_73_7 = stackOut_72_7;
                stackIn_73_8 = stackOut_72_8;
                stackIn_73_9 = stackOut_72_9;
                stackIn_73_10 = stackOut_72_10;
                stackIn_73_11 = stackOut_72_11;
                stackIn_73_12 = stackOut_72_12;
                stackIn_73_13 = stackOut_72_13;
                stackIn_73_14 = stackOut_72_14;
                stackIn_73_15 = stackOut_72_15;
                stackIn_73_16 = stackOut_72_16;
                stackIn_73_17 = stackOut_72_17;
                stackIn_73_18 = stackOut_72_18;
                stackIn_73_19 = stackOut_72_19;
                if ((var17 & 32) == 0) {
                  stackOut_74_0 = null;
                  stackOut_74_1 = null;
                  stackOut_74_2 = (qm) (Object) stackIn_74_2;
                  stackOut_74_3 = (qm) (Object) stackIn_74_3;
                  stackOut_74_4 = stackIn_74_4;
                  stackOut_74_5 = stackIn_74_5;
                  stackOut_74_6 = stackIn_74_6;
                  stackOut_74_7 = stackIn_74_7;
                  stackOut_74_8 = stackIn_74_8;
                  stackOut_74_9 = stackIn_74_9;
                  stackOut_74_10 = stackIn_74_10;
                  stackOut_74_11 = stackIn_74_11;
                  stackOut_74_12 = stackIn_74_12;
                  stackOut_74_13 = stackIn_74_13;
                  stackOut_74_14 = stackIn_74_14;
                  stackOut_74_15 = stackIn_74_15;
                  stackOut_74_16 = stackIn_74_16;
                  stackOut_74_17 = stackIn_74_17;
                  stackOut_74_18 = stackIn_74_18;
                  stackOut_74_19 = stackIn_74_19;
                  stackOut_74_20 = 0;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  stackIn_75_3 = stackOut_74_3;
                  stackIn_75_4 = stackOut_74_4;
                  stackIn_75_5 = stackOut_74_5;
                  stackIn_75_6 = stackOut_74_6;
                  stackIn_75_7 = stackOut_74_7;
                  stackIn_75_8 = stackOut_74_8;
                  stackIn_75_9 = stackOut_74_9;
                  stackIn_75_10 = stackOut_74_10;
                  stackIn_75_11 = stackOut_74_11;
                  stackIn_75_12 = stackOut_74_12;
                  stackIn_75_13 = stackOut_74_13;
                  stackIn_75_14 = stackOut_74_14;
                  stackIn_75_15 = stackOut_74_15;
                  stackIn_75_16 = stackOut_74_16;
                  stackIn_75_17 = stackOut_74_17;
                  stackIn_75_18 = stackOut_74_18;
                  stackIn_75_19 = stackOut_74_19;
                  stackIn_75_20 = stackOut_74_20;
                  break L9;
                } else {
                  stackOut_73_0 = null;
                  stackOut_73_1 = null;
                  stackOut_73_2 = (qm) (Object) stackIn_73_2;
                  stackOut_73_3 = (qm) (Object) stackIn_73_3;
                  stackOut_73_4 = stackIn_73_4;
                  stackOut_73_5 = stackIn_73_5;
                  stackOut_73_6 = stackIn_73_6;
                  stackOut_73_7 = stackIn_73_7;
                  stackOut_73_8 = stackIn_73_8;
                  stackOut_73_9 = stackIn_73_9;
                  stackOut_73_10 = stackIn_73_10;
                  stackOut_73_11 = stackIn_73_11;
                  stackOut_73_12 = stackIn_73_12;
                  stackOut_73_13 = stackIn_73_13;
                  stackOut_73_14 = stackIn_73_14;
                  stackOut_73_15 = stackIn_73_15;
                  stackOut_73_16 = stackIn_73_16;
                  stackOut_73_17 = stackIn_73_17;
                  stackOut_73_18 = stackIn_73_18;
                  stackOut_73_19 = stackIn_73_19;
                  stackOut_73_20 = 1;
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  stackIn_75_3 = stackOut_73_3;
                  stackIn_75_4 = stackOut_73_4;
                  stackIn_75_5 = stackOut_73_5;
                  stackIn_75_6 = stackOut_73_6;
                  stackIn_75_7 = stackOut_73_7;
                  stackIn_75_8 = stackOut_73_8;
                  stackIn_75_9 = stackOut_73_9;
                  stackIn_75_10 = stackOut_73_10;
                  stackIn_75_11 = stackOut_73_11;
                  stackIn_75_12 = stackOut_73_12;
                  stackIn_75_13 = stackOut_73_13;
                  stackIn_75_14 = stackOut_73_14;
                  stackIn_75_15 = stackOut_73_15;
                  stackIn_75_16 = stackOut_73_16;
                  stackIn_75_17 = stackOut_73_17;
                  stackIn_75_18 = stackOut_73_18;
                  stackIn_75_19 = stackOut_73_19;
                  stackIn_75_20 = stackOut_73_20;
                  break L9;
                }
              }
              L10: {
                var23 = new dd(stackIn_75_2, stackIn_75_3, stackIn_75_4, stackIn_75_5, stackIn_75_6, stackIn_75_7, stackIn_75_8, stackIn_75_9, stackIn_75_10, stackIn_75_11, stackIn_75_12, stackIn_75_13, stackIn_75_14, stackIn_75_15 != 0, stackIn_75_16 != 0, stackIn_75_17 != 0, stackIn_75_18 != 0, stackIn_75_19 != 0, stackIn_75_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                var24 = (dd) var20.field_b[0];
                var25_ref = (hn) var20.field_b[1];
                var26 = (hn) var20.field_b[-1 + var20.field_e];
                var20.a((Object) (Object) var23, (byte) 6);
                var27 = var23.f(50) / (var23.f(50) + var24.f(50));
                var28 = var26.field_N;
                var29 = var25_ref.field_N;
                var30 = var26.field_P;
                var31 = var25_ref.field_P;
                var32 = var26.field_B;
                var33 = var25_ref.field_B;
                var34 = var26.field_L;
                var35 = var25_ref.field_L;
                var36 = (float)((double)var27 * 3.141592653589793);
                if (var25_ref.field_I <= var25_ref.field_E) {
                  stackOut_77_0 = 3.1415927410125732f + var25_ref.field_E;
                  stackIn_78_0 = stackOut_77_0;
                  break L10;
                } else {
                  stackOut_76_0 = var25_ref.field_E;
                  stackIn_78_0 = stackOut_76_0;
                  break L10;
                }
              }
              L11: {
                var37 = stackIn_78_0;
                var38 = null;
                if (var7 != 0) {
                  var38 = (Object) (Object) new wd[var10];
                  ((sg) this).field_i = new sb[var10];
                  var14 = 0;
                  L12: while (true) {
                    if (~var10 >= ~var14) {
                      ((sg) this).field_m = new ue[var11];
                      var14 = 0;
                      L13: while (true) {
                        if (var11 <= var14) {
                          break L11;
                        } else {
                          ((sg) this).field_m[var14] = new ue();
                          int discarded$10 = var4.f((byte) -94);
                          int discarded$11 = var4.f((byte) -79);
                          var39_int = var4.k(-108);
                          var40 = var4.k(64);
                          int discarded$12 = var4.k(81);
                          qm discarded$13 = new qm(var39_int, var40);
                          var14++;
                          continue L13;
                        }
                      }
                    } else {
                      ((sg) this).field_i[var14] = new sb();
                      var39_int = var4.f((byte) -27);
                      ((Object[]) var38)[var14] = (Object) (Object) (wd) var20.field_b[var39_int];
                      ((sg) this).field_i[var14].field_b = (float)var4.k(106) / 32768.0f - 0.5f;
                      var14++;
                      continue L12;
                    }
                  }
                } else {
                  ((sg) this).field_i = null;
                  ((sg) this).field_m = null;
                  break L11;
                }
              }
              var23.field_z = var26.field_L;
              var14 = 0;
              var23.field_y = var36;
              var24.field_G = var36;
              var23.field_O = var26.field_N;
              var23.field_K = var26.field_P;
              var23.field_I = var26.field_B;
              var39 = null;
              L14: while (true) {
                L15: {
                  L16: {
                    var40_ref_dd = (dd) var20.field_b[var14];
                    var40_ref_dd.b(75, var37);
                    if (~var40_ref_dd.field_R.field_h != ~var40_ref_dd.field_P.field_h) {
                      break L16;
                    } else {
                      if (~var40_ref_dd.field_R.field_f != ~var40_ref_dd.field_P.field_f) {
                        break L16;
                      } else {
                        var20.a(true, var14);
                        break L15;
                      }
                    }
                  }
                  var40_ref_dd.field_L = var31;
                  var14++;
                  var40_ref_dd.field_z = var34;
                  var40_ref_dd.field_O = var28;
                  var40_ref_dd.field_K = var30;
                  var40_ref_dd.field_A = var35;
                  var40_ref_dd.field_I = var32;
                  var40_ref_dd.field_N = var29;
                  var40_ref_dd.field_C = var33;
                  break L15;
                }
                L17: {
                  if (var39 == null) {
                    break L17;
                  } else {
                    ((hn) var39).field_Q = var40_ref_dd.p(-1);
                    break L17;
                  }
                }
                if (~var14 > ~var20.field_e) {
                  L18: {
                    var41_ref_hn = (hn) var20.field_b[var14];
                    var41_ref_hn.field_F = var40_ref_dd.b((byte) -128);
                    var14++;
                    if (var41_ref_hn.field_I <= var41_ref_hn.field_E) {
                      stackOut_97_0 = 3.1415927410125732f + var41_ref_hn.field_I;
                      stackIn_98_0 = stackOut_97_0;
                      break L18;
                    } else {
                      stackOut_96_0 = var41_ref_hn.field_I;
                      stackIn_98_0 = stackOut_96_0;
                      break L18;
                    }
                  }
                  L19: {
                    var37 = stackIn_98_0;
                    var28 = var29;
                    if (var14 < var20.field_e + -1) {
                      stackOut_100_0 = var20.field_b[var14 - -1];
                      stackIn_101_0 = (hn) (Object) stackOut_100_0;
                      break L19;
                    } else {
                      stackOut_99_0 = (hn) var25_ref;
                      stackIn_101_0 = stackOut_99_0;
                      break L19;
                    }
                  }
                  var42_ref_hn = stackIn_101_0;
                  var29 = var42_ref_hn.field_N;
                  var30 = var31;
                  var31 = var42_ref_hn.field_P;
                  var32 = var33;
                  var34 = var35;
                  var33 = var42_ref_hn.field_B;
                  var39 = (Object) (Object) var41_ref_hn;
                  var35 = var42_ref_hn.field_L;
                  continue L14;
                } else {
                  ((sg) this).field_sb = new wd[var20.field_e];
                  var14 = 0;
                  L20: while (true) {
                    if (var20.field_e <= var14) {
                      L21: {
                        if (var7 == 0) {
                          break L21;
                        } else {
                          var14 = 0;
                          L22: while (true) {
                            if (~var10 >= ~var14) {
                              break L21;
                            } else {
                              var15 = 0;
                              L23: while (true) {
                                if (~var15 <= ~((sg) this).field_sb.length) {
                                  var14++;
                                  continue L22;
                                } else {
                                  L24: {
                                    if ((Object) (Object) ((sg) this).field_sb[var15] == ((Object[]) var38)[var14]) {
                                      qm discarded$14 = ((sg) this).field_sb[var15].b(((sg) this).field_i[var14].field_b, 7560980);
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  var15++;
                                  continue L23;
                                }
                              }
                            }
                          }
                        }
                      }
                      var40 = ((sg) this).field_sb[((sg) this).field_sb.length - 1].field_k;
                      var41 = ((sg) this).field_sb[0].field_k;
                      var14 = 0;
                      L25: while (true) {
                        if (~var14 <= ~((sg) this).field_sb.length) {
                          sb.field_a = ((sg) this).field_sb;
                          var14 = 0;
                          L26: while (true) {
                            if (var14 >= var12) {
                              if (((sg) this).field_z != 0) {
                                var14 = 0;
                                L27: while (true) {
                                  if (var14 >= ((sg) this).field_z) {
                                    var15 = 0;
                                    var14 = ((sg) this).field_h;
                                    L28: while (true) {
                                      if (((sg) this).field_z <= var14) {
                                        L29: {
                                          if (param1 != null) {
                                            break L29;
                                          } else {
                                            param1 = new int[]{3, 2, 1, 0};
                                            break L29;
                                          }
                                        }
                                        var14 = 0;
                                        L30: while (true) {
                                          if (var14 >= ((sg) this).field_h) {
                                            var14 = 0;
                                            L31: while (true) {
                                              if (~var14 <= ~((sg) this).field_h) {
                                                var14 = ((sg) this).field_h;
                                                L32: while (true) {
                                                  if (var14 >= ((sg) this).field_z) {
                                                    L33: {
                                                      if (3 != ((sg) this).field_r) {
                                                        ((sg) this).field_pb = true;
                                                        ((sg) this).field_db = new wb(5, 5);
                                                        break L33;
                                                      } else {
                                                        ((sg) this).field_pb = false;
                                                        break L33;
                                                      }
                                                    }
                                                    int discarded$15 = -77;
                                                    this.a(param0);
                                                    sb.field_a = null;
                                                    return;
                                                  } else {
                                                    ((sg) this).field_C[var14].field_Eb = 8421504;
                                                    ((sg) this).field_C[var14].field_tc = 0;
                                                    var14++;
                                                    continue L32;
                                                  }
                                                }
                                              } else {
                                                L34: {
                                                  ((sg) this).field_C[var14].field_Eb = nc.field_j[var14];
                                                  ((sg) this).field_C[var14].field_tc = ii.field_d[var14];
                                                  var43 = pf.field_c[((sg) this).field_r];
                                                  if ((var14 & 1) != 0) {
                                                    break L34;
                                                  } else {
                                                    var43 = var43 ^ 1;
                                                    break L34;
                                                  }
                                                }
                                                ((sg) this).field_C[var14].a(20385, ge.field_c[var43]);
                                                var14++;
                                                continue L31;
                                              }
                                            }
                                          } else {
                                            L35: {
                                              var43 = param1[((sg) this).field_C[var14].field_R];
                                              if (var43 != var14) {
                                                var44 = ((sg) this).field_C[var43];
                                                ((sg) this).field_C[var43] = ((sg) this).field_C[var14];
                                                ((sg) this).field_C[var14] = var44;
                                                break L35;
                                              } else {
                                                break L35;
                                              }
                                            }
                                            var14++;
                                            continue L30;
                                          }
                                        }
                                      } else {
                                        L36: {
                                          if (0 != ((sg) this).field_C[var14].field_rc) {
                                            break L36;
                                          } else {
                                            var43_ref_ja = ((sg) this).field_C[var14];
                                            ((sg) this).field_C[var14] = ((sg) this).field_C[var15];
                                            int incrementValue$16 = var15;
                                            var15++;
                                            ((sg) this).field_C[incrementValue$16] = var43_ref_ja;
                                            break L36;
                                          }
                                        }
                                        var14++;
                                        continue L28;
                                      }
                                    }
                                  } else {
                                    L37: {
                                      if (0 != ((sg) this).field_C[var14].field_rc) {
                                        break L37;
                                      } else {
                                        ((sg) this).field_h = ((sg) this).field_h + 1;
                                        var43 = 0;
                                        var15 = 0;
                                        L38: while (true) {
                                          if (((sg) this).field_z <= var15) {
                                            ((sg) this).field_C[var14].field_R = var43;
                                            break L37;
                                          } else {
                                            L39: {
                                              if (((sg) this).field_C[var15].field_rc != 0) {
                                                break L39;
                                              } else {
                                                if (((sg) this).field_C[var15].field_Ib > ((sg) this).field_C[var14].field_Ib) {
                                                  var43++;
                                                  break L39;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            var15++;
                                            continue L38;
                                          }
                                        }
                                      }
                                    }
                                    var14++;
                                    continue L27;
                                  }
                                }
                              } else {
                                var53 = null;
                                throw new RuntimeException((String) null);
                              }
                            } else {
                              L40: {
                                L41: {
                                  var43_ref_qm = new qm(var4.h(-14232), var4.h(-14232));
                                  var44_int = var4.f((byte) -24);
                                  var45 = (float)(3.141592653589793 * (double)var4.f((byte) -60) / 128.0);
                                  var16 = var4.f(0);
                                  if (var44_int < 5) {
                                    break L41;
                                  } else {
                                    if (var44_int > 8) {
                                      break L41;
                                    } else {
                                      var46_ref = ge.field_c[((sg) this).field_r * 2];
                                      var47_float = hi.a(((sg) this).field_sb.length, 0.0f, -1, ((sg) this).field_sb, -24659, var43_ref_qm, var16);
                                      if (var47_float == -1.0f) {
                                        var51 = null;
                                        throw new RuntimeException((String) null);
                                      } else {
                                        L42: {
                                          int fieldTemp$17 = ((sg) this).field_z;
                                          ((sg) this).field_z = ((sg) this).field_z + 1;
                                          stackOut_128_0 = ((sg) this).field_C;
                                          stackOut_128_1 = fieldTemp$17;
                                          stackOut_128_2 = null;
                                          stackOut_128_3 = null;
                                          stackOut_128_4 = var43_ref_qm.field_h;
                                          stackOut_128_5 = var43_ref_qm.field_f;
                                          stackOut_128_6 = var16;
                                          stackOut_128_7 = var45;
                                          stackOut_128_8 = var47_float;
                                          stackIn_130_0 = stackOut_128_0;
                                          stackIn_130_1 = stackOut_128_1;
                                          stackIn_130_2 = stackOut_128_2;
                                          stackIn_130_3 = stackOut_128_3;
                                          stackIn_130_4 = stackOut_128_4;
                                          stackIn_130_5 = stackOut_128_5;
                                          stackIn_130_6 = stackOut_128_6;
                                          stackIn_130_7 = stackOut_128_7;
                                          stackIn_130_8 = stackOut_128_8;
                                          stackIn_129_0 = stackOut_128_0;
                                          stackIn_129_1 = stackOut_128_1;
                                          stackIn_129_2 = stackOut_128_2;
                                          stackIn_129_3 = stackOut_128_3;
                                          stackIn_129_4 = stackOut_128_4;
                                          stackIn_129_5 = stackOut_128_5;
                                          stackIn_129_6 = stackOut_128_6;
                                          stackIn_129_7 = stackOut_128_7;
                                          stackIn_129_8 = stackOut_128_8;
                                          if (var47_float == (float)((sg) this).field_sb.length) {
                                            stackOut_130_0 = (ja[]) (Object) stackIn_130_0;
                                            stackOut_130_1 = stackIn_130_1;
                                            stackOut_130_2 = null;
                                            stackOut_130_3 = null;
                                            stackOut_130_4 = stackIn_130_4;
                                            stackOut_130_5 = stackIn_130_5;
                                            stackOut_130_6 = stackIn_130_6;
                                            stackOut_130_7 = stackIn_130_7;
                                            stackOut_130_8 = stackIn_130_8;
                                            stackOut_130_9 = ((sg) this).field_sb[0];
                                            stackIn_131_0 = stackOut_130_0;
                                            stackIn_131_1 = stackOut_130_1;
                                            stackIn_131_2 = stackOut_130_2;
                                            stackIn_131_3 = stackOut_130_3;
                                            stackIn_131_4 = stackOut_130_4;
                                            stackIn_131_5 = stackOut_130_5;
                                            stackIn_131_6 = stackOut_130_6;
                                            stackIn_131_7 = stackOut_130_7;
                                            stackIn_131_8 = stackOut_130_8;
                                            stackIn_131_9 = stackOut_130_9;
                                            break L42;
                                          } else {
                                            stackOut_129_0 = (ja[]) (Object) stackIn_129_0;
                                            stackOut_129_1 = stackIn_129_1;
                                            stackOut_129_2 = null;
                                            stackOut_129_3 = null;
                                            stackOut_129_4 = stackIn_129_4;
                                            stackOut_129_5 = stackIn_129_5;
                                            stackOut_129_6 = stackIn_129_6;
                                            stackOut_129_7 = stackIn_129_7;
                                            stackOut_129_8 = stackIn_129_8;
                                            stackOut_129_9 = ((sg) this).field_sb[(int)var47_float];
                                            stackIn_131_0 = stackOut_129_0;
                                            stackIn_131_1 = stackOut_129_1;
                                            stackIn_131_2 = stackOut_129_2;
                                            stackIn_131_3 = stackOut_129_3;
                                            stackIn_131_4 = stackOut_129_4;
                                            stackIn_131_5 = stackOut_129_5;
                                            stackIn_131_6 = stackOut_129_6;
                                            stackIn_131_7 = stackOut_129_7;
                                            stackIn_131_8 = stackOut_129_8;
                                            stackIn_131_9 = stackOut_129_9;
                                            break L42;
                                          }
                                        }
                                        stackIn_131_0[stackIn_131_1] = new ja(stackIn_131_4, stackIn_131_5, stackIn_131_6, stackIn_131_7, stackIn_131_8, stackIn_131_9, var46_ref, 0);
                                        break L40;
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  if (var44_int < 62) {
                                    break L43;
                                  } else {
                                    if (69 >= var44_int) {
                                      var46_float = hi.a(((sg) this).field_sb.length, 0.0f, 1, ((sg) this).field_sb, -24659, var43_ref_qm, var16);
                                      if (-1.0f != var46_float) {
                                        L44: {
                                          int fieldTemp$18 = ((sg) this).field_z;
                                          ((sg) this).field_z = ((sg) this).field_z + 1;
                                          stackOut_137_0 = ((sg) this).field_C;
                                          stackOut_137_1 = fieldTemp$18;
                                          stackOut_137_2 = null;
                                          stackOut_137_3 = null;
                                          stackOut_137_4 = var43_ref_qm.field_h;
                                          stackOut_137_5 = var43_ref_qm.field_f;
                                          stackOut_137_6 = var16;
                                          stackOut_137_7 = var45;
                                          stackOut_137_8 = var46_float;
                                          stackIn_139_0 = stackOut_137_0;
                                          stackIn_139_1 = stackOut_137_1;
                                          stackIn_139_2 = stackOut_137_2;
                                          stackIn_139_3 = stackOut_137_3;
                                          stackIn_139_4 = stackOut_137_4;
                                          stackIn_139_5 = stackOut_137_5;
                                          stackIn_139_6 = stackOut_137_6;
                                          stackIn_139_7 = stackOut_137_7;
                                          stackIn_139_8 = stackOut_137_8;
                                          stackIn_138_0 = stackOut_137_0;
                                          stackIn_138_1 = stackOut_137_1;
                                          stackIn_138_2 = stackOut_137_2;
                                          stackIn_138_3 = stackOut_137_3;
                                          stackIn_138_4 = stackOut_137_4;
                                          stackIn_138_5 = stackOut_137_5;
                                          stackIn_138_6 = stackOut_137_6;
                                          stackIn_138_7 = stackOut_137_7;
                                          stackIn_138_8 = stackOut_137_8;
                                          if ((float)((sg) this).field_sb.length == var46_float) {
                                            stackOut_139_0 = (ja[]) (Object) stackIn_139_0;
                                            stackOut_139_1 = stackIn_139_1;
                                            stackOut_139_2 = null;
                                            stackOut_139_3 = null;
                                            stackOut_139_4 = stackIn_139_4;
                                            stackOut_139_5 = stackIn_139_5;
                                            stackOut_139_6 = stackIn_139_6;
                                            stackOut_139_7 = stackIn_139_7;
                                            stackOut_139_8 = stackIn_139_8;
                                            stackOut_139_9 = ((sg) this).field_sb[0];
                                            stackIn_140_0 = stackOut_139_0;
                                            stackIn_140_1 = stackOut_139_1;
                                            stackIn_140_2 = stackOut_139_2;
                                            stackIn_140_3 = stackOut_139_3;
                                            stackIn_140_4 = stackOut_139_4;
                                            stackIn_140_5 = stackOut_139_5;
                                            stackIn_140_6 = stackOut_139_6;
                                            stackIn_140_7 = stackOut_139_7;
                                            stackIn_140_8 = stackOut_139_8;
                                            stackIn_140_9 = stackOut_139_9;
                                            break L44;
                                          } else {
                                            stackOut_138_0 = (ja[]) (Object) stackIn_138_0;
                                            stackOut_138_1 = stackIn_138_1;
                                            stackOut_138_2 = null;
                                            stackOut_138_3 = null;
                                            stackOut_138_4 = stackIn_138_4;
                                            stackOut_138_5 = stackIn_138_5;
                                            stackOut_138_6 = stackIn_138_6;
                                            stackOut_138_7 = stackIn_138_7;
                                            stackOut_138_8 = stackIn_138_8;
                                            stackOut_138_9 = ((sg) this).field_sb[(int)var46_float];
                                            stackIn_140_0 = stackOut_138_0;
                                            stackIn_140_1 = stackOut_138_1;
                                            stackIn_140_2 = stackOut_138_2;
                                            stackIn_140_3 = stackOut_138_3;
                                            stackIn_140_4 = stackOut_138_4;
                                            stackIn_140_5 = stackOut_138_5;
                                            stackIn_140_6 = stackOut_138_6;
                                            stackIn_140_7 = stackOut_138_7;
                                            stackIn_140_8 = stackOut_138_8;
                                            stackIn_140_9 = stackOut_138_9;
                                            break L44;
                                          }
                                        }
                                        stackIn_140_0[stackIn_140_1] = new ja(stackIn_140_4, stackIn_140_5, stackIn_140_6, stackIn_140_7, stackIn_140_8, stackIn_140_9, ge.field_c[-62 + var44_int], 1);
                                        break L40;
                                      } else {
                                        var52 = null;
                                        throw new RuntimeException((String) null);
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                L45: {
                                  var46 = new wm(var43_ref_qm, var44_int, var16, var45, 0.0f, 0.0f);
                                  if ((1048576 & var46.field_J) != 0) {
                                    hj discarded$19 = var46.a((byte) -113);
                                    var46.field_H = var46.field_H.e();
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                                L46: {
                                  if ((var46.field_J & 32768) != 0) {
                                    ((sg) this).field_d.a((byte) -92, (hl) (Object) var46);
                                    break L46;
                                  } else {
                                    ((sg) this).field_cb.a((byte) -84, (hl) (Object) var46);
                                    break L46;
                                  }
                                }
                                var46.a(-1, sb.field_a);
                                if (53 == var44_int) {
                                  var47 = var43_ref_qm.field_h + -(int)(10.0 * Math.sin((double)var45));
                                  var48 = var43_ref_qm.field_f + -(int)(Math.cos((double)var45) * 10.0);
                                  var49 = new na(var47, var48, var16, 60, de.field_Q);
                                  ((sg) this).field_Q.a((byte) -81, (hl) (Object) var49);
                                  break L40;
                                } else {
                                  if (54 != var44_int) {
                                    break L40;
                                  } else {
                                    var47 = var43_ref_qm.field_h + -(int)(Math.sin((double)var45) * 35.0);
                                    var48 = var43_ref_qm.field_f + -(int)(Math.cos((double)var45) * 35.0);
                                    var49 = new na(var47, var48, var16, 60, de.field_Q);
                                    ((sg) this).field_Q.a((byte) -117, (hl) (Object) var49);
                                    var47 = var43_ref_qm.field_h + (int)(Math.sin((double)var45) * 35.0);
                                    var48 = var43_ref_qm.field_f - -(int)(Math.cos((double)var45) * 35.0);
                                    var49 = new na(var47, var48, var16, 60, de.field_Q);
                                    ((sg) this).field_Q.a((byte) -118, (hl) (Object) var49);
                                    break L40;
                                  }
                                }
                              }
                              var14++;
                              continue L26;
                            }
                          }
                        } else {
                          L47: {
                            var42 = ((sg) this).field_sb[(1 + var14) % ((sg) this).field_sb.length].field_k;
                            if (0 == var41) {
                              ((sg) this).field_sb[var14].field_o = (float)(var42 + -var40) / ((sg) this).field_sb[var14].f(50);
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          var40 = var41;
                          var41 = var42;
                          var14++;
                          continue L25;
                        }
                      }
                    } else {
                      ((sg) this).field_sb[var14] = (wd) var20.field_b[var14];
                      var14++;
                      continue L20;
                    }
                  }
                }
              }
            } else {
              L48: {
                var21 = new qm(var4.k(-48), var4.k(-108));
                var22 = new qm(var4.k(-113), var4.k(93));
                var16 = var4.f(0);
                var17 = var4.f((byte) -108);
                var18 = var4.f(0);
                var19 = var4.f(0);
                stackOut_20_0 = null;
                stackOut_20_1 = null;
                stackOut_20_2 = (qm) var21;
                stackOut_20_3 = (qm) var22;
                stackOut_20_4 = var16;
                stackOut_20_5 = 0;
                stackOut_20_6 = 0;
                stackOut_20_7 = 0;
                stackOut_20_8 = 0;
                stackOut_20_9 = 0;
                stackOut_20_10 = 0;
                stackOut_20_11 = 0;
                stackOut_20_12 = 0;
                stackOut_20_13 = var18;
                stackOut_20_14 = var19;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                stackIn_22_4 = stackOut_20_4;
                stackIn_22_5 = stackOut_20_5;
                stackIn_22_6 = stackOut_20_6;
                stackIn_22_7 = stackOut_20_7;
                stackIn_22_8 = stackOut_20_8;
                stackIn_22_9 = stackOut_20_9;
                stackIn_22_10 = stackOut_20_10;
                stackIn_22_11 = stackOut_20_11;
                stackIn_22_12 = stackOut_20_12;
                stackIn_22_13 = stackOut_20_13;
                stackIn_22_14 = stackOut_20_14;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                stackIn_21_4 = stackOut_20_4;
                stackIn_21_5 = stackOut_20_5;
                stackIn_21_6 = stackOut_20_6;
                stackIn_21_7 = stackOut_20_7;
                stackIn_21_8 = stackOut_20_8;
                stackIn_21_9 = stackOut_20_9;
                stackIn_21_10 = stackOut_20_10;
                stackIn_21_11 = stackOut_20_11;
                stackIn_21_12 = stackOut_20_12;
                stackIn_21_13 = stackOut_20_13;
                stackIn_21_14 = stackOut_20_14;
                if ((2 & var17) == 0) {
                  stackOut_22_0 = null;
                  stackOut_22_1 = null;
                  stackOut_22_2 = (qm) (Object) stackIn_22_2;
                  stackOut_22_3 = (qm) (Object) stackIn_22_3;
                  stackOut_22_4 = stackIn_22_4;
                  stackOut_22_5 = stackIn_22_5;
                  stackOut_22_6 = stackIn_22_6;
                  stackOut_22_7 = stackIn_22_7;
                  stackOut_22_8 = stackIn_22_8;
                  stackOut_22_9 = stackIn_22_9;
                  stackOut_22_10 = stackIn_22_10;
                  stackOut_22_11 = stackIn_22_11;
                  stackOut_22_12 = stackIn_22_12;
                  stackOut_22_13 = stackIn_22_13;
                  stackOut_22_14 = stackIn_22_14;
                  stackOut_22_15 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  stackIn_23_4 = stackOut_22_4;
                  stackIn_23_5 = stackOut_22_5;
                  stackIn_23_6 = stackOut_22_6;
                  stackIn_23_7 = stackOut_22_7;
                  stackIn_23_8 = stackOut_22_8;
                  stackIn_23_9 = stackOut_22_9;
                  stackIn_23_10 = stackOut_22_10;
                  stackIn_23_11 = stackOut_22_11;
                  stackIn_23_12 = stackOut_22_12;
                  stackIn_23_13 = stackOut_22_13;
                  stackIn_23_14 = stackOut_22_14;
                  stackIn_23_15 = stackOut_22_15;
                  break L48;
                } else {
                  stackOut_21_0 = null;
                  stackOut_21_1 = null;
                  stackOut_21_2 = (qm) (Object) stackIn_21_2;
                  stackOut_21_3 = (qm) (Object) stackIn_21_3;
                  stackOut_21_4 = stackIn_21_4;
                  stackOut_21_5 = stackIn_21_5;
                  stackOut_21_6 = stackIn_21_6;
                  stackOut_21_7 = stackIn_21_7;
                  stackOut_21_8 = stackIn_21_8;
                  stackOut_21_9 = stackIn_21_9;
                  stackOut_21_10 = stackIn_21_10;
                  stackOut_21_11 = stackIn_21_11;
                  stackOut_21_12 = stackIn_21_12;
                  stackOut_21_13 = stackIn_21_13;
                  stackOut_21_14 = stackIn_21_14;
                  stackOut_21_15 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_23_5 = stackOut_21_5;
                  stackIn_23_6 = stackOut_21_6;
                  stackIn_23_7 = stackOut_21_7;
                  stackIn_23_8 = stackOut_21_8;
                  stackIn_23_9 = stackOut_21_9;
                  stackIn_23_10 = stackOut_21_10;
                  stackIn_23_11 = stackOut_21_11;
                  stackIn_23_12 = stackOut_21_12;
                  stackIn_23_13 = stackOut_21_13;
                  stackIn_23_14 = stackOut_21_14;
                  stackIn_23_15 = stackOut_21_15;
                  break L48;
                }
              }
              L49: {
                stackOut_23_0 = null;
                stackOut_23_1 = null;
                stackOut_23_2 = (qm) (Object) stackIn_23_2;
                stackOut_23_3 = (qm) (Object) stackIn_23_3;
                stackOut_23_4 = stackIn_23_4;
                stackOut_23_5 = stackIn_23_5;
                stackOut_23_6 = stackIn_23_6;
                stackOut_23_7 = stackIn_23_7;
                stackOut_23_8 = stackIn_23_8;
                stackOut_23_9 = stackIn_23_9;
                stackOut_23_10 = stackIn_23_10;
                stackOut_23_11 = stackIn_23_11;
                stackOut_23_12 = stackIn_23_12;
                stackOut_23_13 = stackIn_23_13;
                stackOut_23_14 = stackIn_23_14;
                stackOut_23_15 = stackIn_23_15;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                stackIn_25_4 = stackOut_23_4;
                stackIn_25_5 = stackOut_23_5;
                stackIn_25_6 = stackOut_23_6;
                stackIn_25_7 = stackOut_23_7;
                stackIn_25_8 = stackOut_23_8;
                stackIn_25_9 = stackOut_23_9;
                stackIn_25_10 = stackOut_23_10;
                stackIn_25_11 = stackOut_23_11;
                stackIn_25_12 = stackOut_23_12;
                stackIn_25_13 = stackOut_23_13;
                stackIn_25_14 = stackOut_23_14;
                stackIn_25_15 = stackOut_23_15;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                stackIn_24_4 = stackOut_23_4;
                stackIn_24_5 = stackOut_23_5;
                stackIn_24_6 = stackOut_23_6;
                stackIn_24_7 = stackOut_23_7;
                stackIn_24_8 = stackOut_23_8;
                stackIn_24_9 = stackOut_23_9;
                stackIn_24_10 = stackOut_23_10;
                stackIn_24_11 = stackOut_23_11;
                stackIn_24_12 = stackOut_23_12;
                stackIn_24_13 = stackOut_23_13;
                stackIn_24_14 = stackOut_23_14;
                stackIn_24_15 = stackOut_23_15;
                if ((4 & var17) == 0) {
                  stackOut_25_0 = null;
                  stackOut_25_1 = null;
                  stackOut_25_2 = (qm) (Object) stackIn_25_2;
                  stackOut_25_3 = (qm) (Object) stackIn_25_3;
                  stackOut_25_4 = stackIn_25_4;
                  stackOut_25_5 = stackIn_25_5;
                  stackOut_25_6 = stackIn_25_6;
                  stackOut_25_7 = stackIn_25_7;
                  stackOut_25_8 = stackIn_25_8;
                  stackOut_25_9 = stackIn_25_9;
                  stackOut_25_10 = stackIn_25_10;
                  stackOut_25_11 = stackIn_25_11;
                  stackOut_25_12 = stackIn_25_12;
                  stackOut_25_13 = stackIn_25_13;
                  stackOut_25_14 = stackIn_25_14;
                  stackOut_25_15 = stackIn_25_15;
                  stackOut_25_16 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  stackIn_26_3 = stackOut_25_3;
                  stackIn_26_4 = stackOut_25_4;
                  stackIn_26_5 = stackOut_25_5;
                  stackIn_26_6 = stackOut_25_6;
                  stackIn_26_7 = stackOut_25_7;
                  stackIn_26_8 = stackOut_25_8;
                  stackIn_26_9 = stackOut_25_9;
                  stackIn_26_10 = stackOut_25_10;
                  stackIn_26_11 = stackOut_25_11;
                  stackIn_26_12 = stackOut_25_12;
                  stackIn_26_13 = stackOut_25_13;
                  stackIn_26_14 = stackOut_25_14;
                  stackIn_26_15 = stackOut_25_15;
                  stackIn_26_16 = stackOut_25_16;
                  break L49;
                } else {
                  stackOut_24_0 = null;
                  stackOut_24_1 = null;
                  stackOut_24_2 = (qm) (Object) stackIn_24_2;
                  stackOut_24_3 = (qm) (Object) stackIn_24_3;
                  stackOut_24_4 = stackIn_24_4;
                  stackOut_24_5 = stackIn_24_5;
                  stackOut_24_6 = stackIn_24_6;
                  stackOut_24_7 = stackIn_24_7;
                  stackOut_24_8 = stackIn_24_8;
                  stackOut_24_9 = stackIn_24_9;
                  stackOut_24_10 = stackIn_24_10;
                  stackOut_24_11 = stackIn_24_11;
                  stackOut_24_12 = stackIn_24_12;
                  stackOut_24_13 = stackIn_24_13;
                  stackOut_24_14 = stackIn_24_14;
                  stackOut_24_15 = stackIn_24_15;
                  stackOut_24_16 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_26_8 = stackOut_24_8;
                  stackIn_26_9 = stackOut_24_9;
                  stackIn_26_10 = stackOut_24_10;
                  stackIn_26_11 = stackOut_24_11;
                  stackIn_26_12 = stackOut_24_12;
                  stackIn_26_13 = stackOut_24_13;
                  stackIn_26_14 = stackOut_24_14;
                  stackIn_26_15 = stackOut_24_15;
                  stackIn_26_16 = stackOut_24_16;
                  break L49;
                }
              }
              L50: {
                stackOut_26_0 = null;
                stackOut_26_1 = null;
                stackOut_26_2 = (qm) (Object) stackIn_26_2;
                stackOut_26_3 = (qm) (Object) stackIn_26_3;
                stackOut_26_4 = stackIn_26_4;
                stackOut_26_5 = stackIn_26_5;
                stackOut_26_6 = stackIn_26_6;
                stackOut_26_7 = stackIn_26_7;
                stackOut_26_8 = stackIn_26_8;
                stackOut_26_9 = stackIn_26_9;
                stackOut_26_10 = stackIn_26_10;
                stackOut_26_11 = stackIn_26_11;
                stackOut_26_12 = stackIn_26_12;
                stackOut_26_13 = stackIn_26_13;
                stackOut_26_14 = stackIn_26_14;
                stackOut_26_15 = stackIn_26_15;
                stackOut_26_16 = stackIn_26_16;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                stackIn_28_3 = stackOut_26_3;
                stackIn_28_4 = stackOut_26_4;
                stackIn_28_5 = stackOut_26_5;
                stackIn_28_6 = stackOut_26_6;
                stackIn_28_7 = stackOut_26_7;
                stackIn_28_8 = stackOut_26_8;
                stackIn_28_9 = stackOut_26_9;
                stackIn_28_10 = stackOut_26_10;
                stackIn_28_11 = stackOut_26_11;
                stackIn_28_12 = stackOut_26_12;
                stackIn_28_13 = stackOut_26_13;
                stackIn_28_14 = stackOut_26_14;
                stackIn_28_15 = stackOut_26_15;
                stackIn_28_16 = stackOut_26_16;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                stackIn_27_3 = stackOut_26_3;
                stackIn_27_4 = stackOut_26_4;
                stackIn_27_5 = stackOut_26_5;
                stackIn_27_6 = stackOut_26_6;
                stackIn_27_7 = stackOut_26_7;
                stackIn_27_8 = stackOut_26_8;
                stackIn_27_9 = stackOut_26_9;
                stackIn_27_10 = stackOut_26_10;
                stackIn_27_11 = stackOut_26_11;
                stackIn_27_12 = stackOut_26_12;
                stackIn_27_13 = stackOut_26_13;
                stackIn_27_14 = stackOut_26_14;
                stackIn_27_15 = stackOut_26_15;
                stackIn_27_16 = stackOut_26_16;
                if (0 == (var17 & 1)) {
                  stackOut_28_0 = null;
                  stackOut_28_1 = null;
                  stackOut_28_2 = (qm) (Object) stackIn_28_2;
                  stackOut_28_3 = (qm) (Object) stackIn_28_3;
                  stackOut_28_4 = stackIn_28_4;
                  stackOut_28_5 = stackIn_28_5;
                  stackOut_28_6 = stackIn_28_6;
                  stackOut_28_7 = stackIn_28_7;
                  stackOut_28_8 = stackIn_28_8;
                  stackOut_28_9 = stackIn_28_9;
                  stackOut_28_10 = stackIn_28_10;
                  stackOut_28_11 = stackIn_28_11;
                  stackOut_28_12 = stackIn_28_12;
                  stackOut_28_13 = stackIn_28_13;
                  stackOut_28_14 = stackIn_28_14;
                  stackOut_28_15 = stackIn_28_15;
                  stackOut_28_16 = stackIn_28_16;
                  stackOut_28_17 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  stackIn_29_3 = stackOut_28_3;
                  stackIn_29_4 = stackOut_28_4;
                  stackIn_29_5 = stackOut_28_5;
                  stackIn_29_6 = stackOut_28_6;
                  stackIn_29_7 = stackOut_28_7;
                  stackIn_29_8 = stackOut_28_8;
                  stackIn_29_9 = stackOut_28_9;
                  stackIn_29_10 = stackOut_28_10;
                  stackIn_29_11 = stackOut_28_11;
                  stackIn_29_12 = stackOut_28_12;
                  stackIn_29_13 = stackOut_28_13;
                  stackIn_29_14 = stackOut_28_14;
                  stackIn_29_15 = stackOut_28_15;
                  stackIn_29_16 = stackOut_28_16;
                  stackIn_29_17 = stackOut_28_17;
                  break L50;
                } else {
                  stackOut_27_0 = null;
                  stackOut_27_1 = null;
                  stackOut_27_2 = (qm) (Object) stackIn_27_2;
                  stackOut_27_3 = (qm) (Object) stackIn_27_3;
                  stackOut_27_4 = stackIn_27_4;
                  stackOut_27_5 = stackIn_27_5;
                  stackOut_27_6 = stackIn_27_6;
                  stackOut_27_7 = stackIn_27_7;
                  stackOut_27_8 = stackIn_27_8;
                  stackOut_27_9 = stackIn_27_9;
                  stackOut_27_10 = stackIn_27_10;
                  stackOut_27_11 = stackIn_27_11;
                  stackOut_27_12 = stackIn_27_12;
                  stackOut_27_13 = stackIn_27_13;
                  stackOut_27_14 = stackIn_27_14;
                  stackOut_27_15 = stackIn_27_15;
                  stackOut_27_16 = stackIn_27_16;
                  stackOut_27_17 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  stackIn_29_3 = stackOut_27_3;
                  stackIn_29_4 = stackOut_27_4;
                  stackIn_29_5 = stackOut_27_5;
                  stackIn_29_6 = stackOut_27_6;
                  stackIn_29_7 = stackOut_27_7;
                  stackIn_29_8 = stackOut_27_8;
                  stackIn_29_9 = stackOut_27_9;
                  stackIn_29_10 = stackOut_27_10;
                  stackIn_29_11 = stackOut_27_11;
                  stackIn_29_12 = stackOut_27_12;
                  stackIn_29_13 = stackOut_27_13;
                  stackIn_29_14 = stackOut_27_14;
                  stackIn_29_15 = stackOut_27_15;
                  stackIn_29_16 = stackOut_27_16;
                  stackIn_29_17 = stackOut_27_17;
                  break L50;
                }
              }
              L51: {
                stackOut_29_0 = null;
                stackOut_29_1 = null;
                stackOut_29_2 = (qm) (Object) stackIn_29_2;
                stackOut_29_3 = (qm) (Object) stackIn_29_3;
                stackOut_29_4 = stackIn_29_4;
                stackOut_29_5 = stackIn_29_5;
                stackOut_29_6 = stackIn_29_6;
                stackOut_29_7 = stackIn_29_7;
                stackOut_29_8 = stackIn_29_8;
                stackOut_29_9 = stackIn_29_9;
                stackOut_29_10 = stackIn_29_10;
                stackOut_29_11 = stackIn_29_11;
                stackOut_29_12 = stackIn_29_12;
                stackOut_29_13 = stackIn_29_13;
                stackOut_29_14 = stackIn_29_14;
                stackOut_29_15 = stackIn_29_15;
                stackOut_29_16 = stackIn_29_16;
                stackOut_29_17 = stackIn_29_17;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_31_2 = stackOut_29_2;
                stackIn_31_3 = stackOut_29_3;
                stackIn_31_4 = stackOut_29_4;
                stackIn_31_5 = stackOut_29_5;
                stackIn_31_6 = stackOut_29_6;
                stackIn_31_7 = stackOut_29_7;
                stackIn_31_8 = stackOut_29_8;
                stackIn_31_9 = stackOut_29_9;
                stackIn_31_10 = stackOut_29_10;
                stackIn_31_11 = stackOut_29_11;
                stackIn_31_12 = stackOut_29_12;
                stackIn_31_13 = stackOut_29_13;
                stackIn_31_14 = stackOut_29_14;
                stackIn_31_15 = stackOut_29_15;
                stackIn_31_16 = stackOut_29_16;
                stackIn_31_17 = stackOut_29_17;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                stackIn_30_2 = stackOut_29_2;
                stackIn_30_3 = stackOut_29_3;
                stackIn_30_4 = stackOut_29_4;
                stackIn_30_5 = stackOut_29_5;
                stackIn_30_6 = stackOut_29_6;
                stackIn_30_7 = stackOut_29_7;
                stackIn_30_8 = stackOut_29_8;
                stackIn_30_9 = stackOut_29_9;
                stackIn_30_10 = stackOut_29_10;
                stackIn_30_11 = stackOut_29_11;
                stackIn_30_12 = stackOut_29_12;
                stackIn_30_13 = stackOut_29_13;
                stackIn_30_14 = stackOut_29_14;
                stackIn_30_15 = stackOut_29_15;
                stackIn_30_16 = stackOut_29_16;
                stackIn_30_17 = stackOut_29_17;
                if ((var17 & 8) == 0) {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = (qm) (Object) stackIn_31_2;
                  stackOut_31_3 = (qm) (Object) stackIn_31_3;
                  stackOut_31_4 = stackIn_31_4;
                  stackOut_31_5 = stackIn_31_5;
                  stackOut_31_6 = stackIn_31_6;
                  stackOut_31_7 = stackIn_31_7;
                  stackOut_31_8 = stackIn_31_8;
                  stackOut_31_9 = stackIn_31_9;
                  stackOut_31_10 = stackIn_31_10;
                  stackOut_31_11 = stackIn_31_11;
                  stackOut_31_12 = stackIn_31_12;
                  stackOut_31_13 = stackIn_31_13;
                  stackOut_31_14 = stackIn_31_14;
                  stackOut_31_15 = stackIn_31_15;
                  stackOut_31_16 = stackIn_31_16;
                  stackOut_31_17 = stackIn_31_17;
                  stackOut_31_18 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  stackIn_32_4 = stackOut_31_4;
                  stackIn_32_5 = stackOut_31_5;
                  stackIn_32_6 = stackOut_31_6;
                  stackIn_32_7 = stackOut_31_7;
                  stackIn_32_8 = stackOut_31_8;
                  stackIn_32_9 = stackOut_31_9;
                  stackIn_32_10 = stackOut_31_10;
                  stackIn_32_11 = stackOut_31_11;
                  stackIn_32_12 = stackOut_31_12;
                  stackIn_32_13 = stackOut_31_13;
                  stackIn_32_14 = stackOut_31_14;
                  stackIn_32_15 = stackOut_31_15;
                  stackIn_32_16 = stackOut_31_16;
                  stackIn_32_17 = stackOut_31_17;
                  stackIn_32_18 = stackOut_31_18;
                  break L51;
                } else {
                  stackOut_30_0 = null;
                  stackOut_30_1 = null;
                  stackOut_30_2 = (qm) (Object) stackIn_30_2;
                  stackOut_30_3 = (qm) (Object) stackIn_30_3;
                  stackOut_30_4 = stackIn_30_4;
                  stackOut_30_5 = stackIn_30_5;
                  stackOut_30_6 = stackIn_30_6;
                  stackOut_30_7 = stackIn_30_7;
                  stackOut_30_8 = stackIn_30_8;
                  stackOut_30_9 = stackIn_30_9;
                  stackOut_30_10 = stackIn_30_10;
                  stackOut_30_11 = stackIn_30_11;
                  stackOut_30_12 = stackIn_30_12;
                  stackOut_30_13 = stackIn_30_13;
                  stackOut_30_14 = stackIn_30_14;
                  stackOut_30_15 = stackIn_30_15;
                  stackOut_30_16 = stackIn_30_16;
                  stackOut_30_17 = stackIn_30_17;
                  stackOut_30_18 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_32_4 = stackOut_30_4;
                  stackIn_32_5 = stackOut_30_5;
                  stackIn_32_6 = stackOut_30_6;
                  stackIn_32_7 = stackOut_30_7;
                  stackIn_32_8 = stackOut_30_8;
                  stackIn_32_9 = stackOut_30_9;
                  stackIn_32_10 = stackOut_30_10;
                  stackIn_32_11 = stackOut_30_11;
                  stackIn_32_12 = stackOut_30_12;
                  stackIn_32_13 = stackOut_30_13;
                  stackIn_32_14 = stackOut_30_14;
                  stackIn_32_15 = stackOut_30_15;
                  stackIn_32_16 = stackOut_30_16;
                  stackIn_32_17 = stackOut_30_17;
                  stackIn_32_18 = stackOut_30_18;
                  break L51;
                }
              }
              L52: {
                stackOut_32_0 = null;
                stackOut_32_1 = null;
                stackOut_32_2 = (qm) (Object) stackIn_32_2;
                stackOut_32_3 = (qm) (Object) stackIn_32_3;
                stackOut_32_4 = stackIn_32_4;
                stackOut_32_5 = stackIn_32_5;
                stackOut_32_6 = stackIn_32_6;
                stackOut_32_7 = stackIn_32_7;
                stackOut_32_8 = stackIn_32_8;
                stackOut_32_9 = stackIn_32_9;
                stackOut_32_10 = stackIn_32_10;
                stackOut_32_11 = stackIn_32_11;
                stackOut_32_12 = stackIn_32_12;
                stackOut_32_13 = stackIn_32_13;
                stackOut_32_14 = stackIn_32_14;
                stackOut_32_15 = stackIn_32_15;
                stackOut_32_16 = stackIn_32_16;
                stackOut_32_17 = stackIn_32_17;
                stackOut_32_18 = stackIn_32_18;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                stackIn_34_4 = stackOut_32_4;
                stackIn_34_5 = stackOut_32_5;
                stackIn_34_6 = stackOut_32_6;
                stackIn_34_7 = stackOut_32_7;
                stackIn_34_8 = stackOut_32_8;
                stackIn_34_9 = stackOut_32_9;
                stackIn_34_10 = stackOut_32_10;
                stackIn_34_11 = stackOut_32_11;
                stackIn_34_12 = stackOut_32_12;
                stackIn_34_13 = stackOut_32_13;
                stackIn_34_14 = stackOut_32_14;
                stackIn_34_15 = stackOut_32_15;
                stackIn_34_16 = stackOut_32_16;
                stackIn_34_17 = stackOut_32_17;
                stackIn_34_18 = stackOut_32_18;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                stackIn_33_4 = stackOut_32_4;
                stackIn_33_5 = stackOut_32_5;
                stackIn_33_6 = stackOut_32_6;
                stackIn_33_7 = stackOut_32_7;
                stackIn_33_8 = stackOut_32_8;
                stackIn_33_9 = stackOut_32_9;
                stackIn_33_10 = stackOut_32_10;
                stackIn_33_11 = stackOut_32_11;
                stackIn_33_12 = stackOut_32_12;
                stackIn_33_13 = stackOut_32_13;
                stackIn_33_14 = stackOut_32_14;
                stackIn_33_15 = stackOut_32_15;
                stackIn_33_16 = stackOut_32_16;
                stackIn_33_17 = stackOut_32_17;
                stackIn_33_18 = stackOut_32_18;
                if ((var17 & 16) == 0) {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = (qm) (Object) stackIn_34_2;
                  stackOut_34_3 = (qm) (Object) stackIn_34_3;
                  stackOut_34_4 = stackIn_34_4;
                  stackOut_34_5 = stackIn_34_5;
                  stackOut_34_6 = stackIn_34_6;
                  stackOut_34_7 = stackIn_34_7;
                  stackOut_34_8 = stackIn_34_8;
                  stackOut_34_9 = stackIn_34_9;
                  stackOut_34_10 = stackIn_34_10;
                  stackOut_34_11 = stackIn_34_11;
                  stackOut_34_12 = stackIn_34_12;
                  stackOut_34_13 = stackIn_34_13;
                  stackOut_34_14 = stackIn_34_14;
                  stackOut_34_15 = stackIn_34_15;
                  stackOut_34_16 = stackIn_34_16;
                  stackOut_34_17 = stackIn_34_17;
                  stackOut_34_18 = stackIn_34_18;
                  stackOut_34_19 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  stackIn_35_4 = stackOut_34_4;
                  stackIn_35_5 = stackOut_34_5;
                  stackIn_35_6 = stackOut_34_6;
                  stackIn_35_7 = stackOut_34_7;
                  stackIn_35_8 = stackOut_34_8;
                  stackIn_35_9 = stackOut_34_9;
                  stackIn_35_10 = stackOut_34_10;
                  stackIn_35_11 = stackOut_34_11;
                  stackIn_35_12 = stackOut_34_12;
                  stackIn_35_13 = stackOut_34_13;
                  stackIn_35_14 = stackOut_34_14;
                  stackIn_35_15 = stackOut_34_15;
                  stackIn_35_16 = stackOut_34_16;
                  stackIn_35_17 = stackOut_34_17;
                  stackIn_35_18 = stackOut_34_18;
                  stackIn_35_19 = stackOut_34_19;
                  break L52;
                } else {
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = (qm) (Object) stackIn_33_2;
                  stackOut_33_3 = (qm) (Object) stackIn_33_3;
                  stackOut_33_4 = stackIn_33_4;
                  stackOut_33_5 = stackIn_33_5;
                  stackOut_33_6 = stackIn_33_6;
                  stackOut_33_7 = stackIn_33_7;
                  stackOut_33_8 = stackIn_33_8;
                  stackOut_33_9 = stackIn_33_9;
                  stackOut_33_10 = stackIn_33_10;
                  stackOut_33_11 = stackIn_33_11;
                  stackOut_33_12 = stackIn_33_12;
                  stackOut_33_13 = stackIn_33_13;
                  stackOut_33_14 = stackIn_33_14;
                  stackOut_33_15 = stackIn_33_15;
                  stackOut_33_16 = stackIn_33_16;
                  stackOut_33_17 = stackIn_33_17;
                  stackOut_33_18 = stackIn_33_18;
                  stackOut_33_19 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  stackIn_35_5 = stackOut_33_5;
                  stackIn_35_6 = stackOut_33_6;
                  stackIn_35_7 = stackOut_33_7;
                  stackIn_35_8 = stackOut_33_8;
                  stackIn_35_9 = stackOut_33_9;
                  stackIn_35_10 = stackOut_33_10;
                  stackIn_35_11 = stackOut_33_11;
                  stackIn_35_12 = stackOut_33_12;
                  stackIn_35_13 = stackOut_33_13;
                  stackIn_35_14 = stackOut_33_14;
                  stackIn_35_15 = stackOut_33_15;
                  stackIn_35_16 = stackOut_33_16;
                  stackIn_35_17 = stackOut_33_17;
                  stackIn_35_18 = stackOut_33_18;
                  stackIn_35_19 = stackOut_33_19;
                  break L52;
                }
              }
              L53: {
                stackOut_35_0 = null;
                stackOut_35_1 = null;
                stackOut_35_2 = (qm) (Object) stackIn_35_2;
                stackOut_35_3 = (qm) (Object) stackIn_35_3;
                stackOut_35_4 = stackIn_35_4;
                stackOut_35_5 = stackIn_35_5;
                stackOut_35_6 = stackIn_35_6;
                stackOut_35_7 = stackIn_35_7;
                stackOut_35_8 = stackIn_35_8;
                stackOut_35_9 = stackIn_35_9;
                stackOut_35_10 = stackIn_35_10;
                stackOut_35_11 = stackIn_35_11;
                stackOut_35_12 = stackIn_35_12;
                stackOut_35_13 = stackIn_35_13;
                stackOut_35_14 = stackIn_35_14;
                stackOut_35_15 = stackIn_35_15;
                stackOut_35_16 = stackIn_35_16;
                stackOut_35_17 = stackIn_35_17;
                stackOut_35_18 = stackIn_35_18;
                stackOut_35_19 = stackIn_35_19;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_37_2 = stackOut_35_2;
                stackIn_37_3 = stackOut_35_3;
                stackIn_37_4 = stackOut_35_4;
                stackIn_37_5 = stackOut_35_5;
                stackIn_37_6 = stackOut_35_6;
                stackIn_37_7 = stackOut_35_7;
                stackIn_37_8 = stackOut_35_8;
                stackIn_37_9 = stackOut_35_9;
                stackIn_37_10 = stackOut_35_10;
                stackIn_37_11 = stackOut_35_11;
                stackIn_37_12 = stackOut_35_12;
                stackIn_37_13 = stackOut_35_13;
                stackIn_37_14 = stackOut_35_14;
                stackIn_37_15 = stackOut_35_15;
                stackIn_37_16 = stackOut_35_16;
                stackIn_37_17 = stackOut_35_17;
                stackIn_37_18 = stackOut_35_18;
                stackIn_37_19 = stackOut_35_19;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                stackIn_36_2 = stackOut_35_2;
                stackIn_36_3 = stackOut_35_3;
                stackIn_36_4 = stackOut_35_4;
                stackIn_36_5 = stackOut_35_5;
                stackIn_36_6 = stackOut_35_6;
                stackIn_36_7 = stackOut_35_7;
                stackIn_36_8 = stackOut_35_8;
                stackIn_36_9 = stackOut_35_9;
                stackIn_36_10 = stackOut_35_10;
                stackIn_36_11 = stackOut_35_11;
                stackIn_36_12 = stackOut_35_12;
                stackIn_36_13 = stackOut_35_13;
                stackIn_36_14 = stackOut_35_14;
                stackIn_36_15 = stackOut_35_15;
                stackIn_36_16 = stackOut_35_16;
                stackIn_36_17 = stackOut_35_17;
                stackIn_36_18 = stackOut_35_18;
                stackIn_36_19 = stackOut_35_19;
                if ((32 & var17) == 0) {
                  stackOut_37_0 = null;
                  stackOut_37_1 = null;
                  stackOut_37_2 = (qm) (Object) stackIn_37_2;
                  stackOut_37_3 = (qm) (Object) stackIn_37_3;
                  stackOut_37_4 = stackIn_37_4;
                  stackOut_37_5 = stackIn_37_5;
                  stackOut_37_6 = stackIn_37_6;
                  stackOut_37_7 = stackIn_37_7;
                  stackOut_37_8 = stackIn_37_8;
                  stackOut_37_9 = stackIn_37_9;
                  stackOut_37_10 = stackIn_37_10;
                  stackOut_37_11 = stackIn_37_11;
                  stackOut_37_12 = stackIn_37_12;
                  stackOut_37_13 = stackIn_37_13;
                  stackOut_37_14 = stackIn_37_14;
                  stackOut_37_15 = stackIn_37_15;
                  stackOut_37_16 = stackIn_37_16;
                  stackOut_37_17 = stackIn_37_17;
                  stackOut_37_18 = stackIn_37_18;
                  stackOut_37_19 = stackIn_37_19;
                  stackOut_37_20 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  stackIn_38_3 = stackOut_37_3;
                  stackIn_38_4 = stackOut_37_4;
                  stackIn_38_5 = stackOut_37_5;
                  stackIn_38_6 = stackOut_37_6;
                  stackIn_38_7 = stackOut_37_7;
                  stackIn_38_8 = stackOut_37_8;
                  stackIn_38_9 = stackOut_37_9;
                  stackIn_38_10 = stackOut_37_10;
                  stackIn_38_11 = stackOut_37_11;
                  stackIn_38_12 = stackOut_37_12;
                  stackIn_38_13 = stackOut_37_13;
                  stackIn_38_14 = stackOut_37_14;
                  stackIn_38_15 = stackOut_37_15;
                  stackIn_38_16 = stackOut_37_16;
                  stackIn_38_17 = stackOut_37_17;
                  stackIn_38_18 = stackOut_37_18;
                  stackIn_38_19 = stackOut_37_19;
                  stackIn_38_20 = stackOut_37_20;
                  break L53;
                } else {
                  stackOut_36_0 = null;
                  stackOut_36_1 = null;
                  stackOut_36_2 = (qm) (Object) stackIn_36_2;
                  stackOut_36_3 = (qm) (Object) stackIn_36_3;
                  stackOut_36_4 = stackIn_36_4;
                  stackOut_36_5 = stackIn_36_5;
                  stackOut_36_6 = stackIn_36_6;
                  stackOut_36_7 = stackIn_36_7;
                  stackOut_36_8 = stackIn_36_8;
                  stackOut_36_9 = stackIn_36_9;
                  stackOut_36_10 = stackIn_36_10;
                  stackOut_36_11 = stackIn_36_11;
                  stackOut_36_12 = stackIn_36_12;
                  stackOut_36_13 = stackIn_36_13;
                  stackOut_36_14 = stackIn_36_14;
                  stackOut_36_15 = stackIn_36_15;
                  stackOut_36_16 = stackIn_36_16;
                  stackOut_36_17 = stackIn_36_17;
                  stackOut_36_18 = stackIn_36_18;
                  stackOut_36_19 = stackIn_36_19;
                  stackOut_36_20 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  stackIn_38_3 = stackOut_36_3;
                  stackIn_38_4 = stackOut_36_4;
                  stackIn_38_5 = stackOut_36_5;
                  stackIn_38_6 = stackOut_36_6;
                  stackIn_38_7 = stackOut_36_7;
                  stackIn_38_8 = stackOut_36_8;
                  stackIn_38_9 = stackOut_36_9;
                  stackIn_38_10 = stackOut_36_10;
                  stackIn_38_11 = stackOut_36_11;
                  stackIn_38_12 = stackOut_36_12;
                  stackIn_38_13 = stackOut_36_13;
                  stackIn_38_14 = stackOut_36_14;
                  stackIn_38_15 = stackOut_36_15;
                  stackIn_38_16 = stackOut_36_16;
                  stackIn_38_17 = stackOut_36_17;
                  stackIn_38_18 = stackOut_36_18;
                  stackIn_38_19 = stackOut_36_19;
                  stackIn_38_20 = stackOut_36_20;
                  break L53;
                }
              }
              L54: {
                var23 = new dd(stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, stackIn_38_6, stackIn_38_7, stackIn_38_8, stackIn_38_9, stackIn_38_10, stackIn_38_11, stackIn_38_12, stackIn_38_13, stackIn_38_14, stackIn_38_15 != 0, stackIn_38_16 != 0, stackIn_38_17 != 0, stackIn_38_18 != 0, stackIn_38_19 != 0, stackIn_38_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                var20.a((Object) (Object) var23, (byte) 6);
                var24_ref = new qm(var4.k(96), var4.k(-105));
                var25_int = var4.k(-117);
                var26_array = new int[]{-var4.f((byte) -30), -var4.f((byte) -51), var4.f((byte) -23), var4.f((byte) -47)};
                var17 = var4.f((byte) -46);
                var27 = (float)var4.h(-14232) / 256.0f;
                var28_float = (float)var4.h(-14232) / 256.0f;
                var16 = var4.f(0);
                var29_ref_qm = new qm(var4.k(-69), var4.k(115));
                stackOut_38_0 = null;
                stackOut_38_1 = null;
                stackOut_38_2 = (qm) var24_ref;
                stackOut_38_3 = var25_int;
                stackOut_38_4 = var27;
                stackOut_38_5 = var28_float;
                stackOut_38_6 = var16;
                stackOut_38_7 = var26_array[1];
                stackOut_38_8 = var26_array[2];
                stackOut_38_9 = var26_array[0];
                stackOut_38_10 = var26_array[3];
                stackOut_38_11 = null;
                stackOut_38_12 = null;
                stackOut_38_13 = (qm) var29_ref_qm;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                stackIn_40_3 = stackOut_38_3;
                stackIn_40_4 = stackOut_38_4;
                stackIn_40_5 = stackOut_38_5;
                stackIn_40_6 = stackOut_38_6;
                stackIn_40_7 = stackOut_38_7;
                stackIn_40_8 = stackOut_38_8;
                stackIn_40_9 = stackOut_38_9;
                stackIn_40_10 = stackOut_38_10;
                stackIn_40_11 = stackOut_38_11;
                stackIn_40_12 = stackOut_38_12;
                stackIn_40_13 = stackOut_38_13;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                stackIn_39_3 = stackOut_38_3;
                stackIn_39_4 = stackOut_38_4;
                stackIn_39_5 = stackOut_38_5;
                stackIn_39_6 = stackOut_38_6;
                stackIn_39_7 = stackOut_38_7;
                stackIn_39_8 = stackOut_38_8;
                stackIn_39_9 = stackOut_38_9;
                stackIn_39_10 = stackOut_38_10;
                stackIn_39_11 = stackOut_38_11;
                stackIn_39_12 = stackOut_38_12;
                stackIn_39_13 = stackOut_38_13;
                if (0 == (var17 & 2)) {
                  stackOut_40_0 = null;
                  stackOut_40_1 = null;
                  stackOut_40_2 = (qm) (Object) stackIn_40_2;
                  stackOut_40_3 = stackIn_40_3;
                  stackOut_40_4 = stackIn_40_4;
                  stackOut_40_5 = stackIn_40_5;
                  stackOut_40_6 = stackIn_40_6;
                  stackOut_40_7 = stackIn_40_7;
                  stackOut_40_8 = stackIn_40_8;
                  stackOut_40_9 = stackIn_40_9;
                  stackOut_40_10 = stackIn_40_10;
                  stackOut_40_11 = stackIn_40_11;
                  stackOut_40_12 = stackIn_40_12;
                  stackOut_40_13 = (qm) (Object) stackIn_40_13;
                  stackOut_40_14 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  stackIn_41_3 = stackOut_40_3;
                  stackIn_41_4 = stackOut_40_4;
                  stackIn_41_5 = stackOut_40_5;
                  stackIn_41_6 = stackOut_40_6;
                  stackIn_41_7 = stackOut_40_7;
                  stackIn_41_8 = stackOut_40_8;
                  stackIn_41_9 = stackOut_40_9;
                  stackIn_41_10 = stackOut_40_10;
                  stackIn_41_11 = stackOut_40_11;
                  stackIn_41_12 = stackOut_40_12;
                  stackIn_41_13 = stackOut_40_13;
                  stackIn_41_14 = stackOut_40_14;
                  break L54;
                } else {
                  stackOut_39_0 = null;
                  stackOut_39_1 = null;
                  stackOut_39_2 = (qm) (Object) stackIn_39_2;
                  stackOut_39_3 = stackIn_39_3;
                  stackOut_39_4 = stackIn_39_4;
                  stackOut_39_5 = stackIn_39_5;
                  stackOut_39_6 = stackIn_39_6;
                  stackOut_39_7 = stackIn_39_7;
                  stackOut_39_8 = stackIn_39_8;
                  stackOut_39_9 = stackIn_39_9;
                  stackOut_39_10 = stackIn_39_10;
                  stackOut_39_11 = stackIn_39_11;
                  stackOut_39_12 = stackIn_39_12;
                  stackOut_39_13 = (qm) (Object) stackIn_39_13;
                  stackOut_39_14 = 1;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  stackIn_41_3 = stackOut_39_3;
                  stackIn_41_4 = stackOut_39_4;
                  stackIn_41_5 = stackOut_39_5;
                  stackIn_41_6 = stackOut_39_6;
                  stackIn_41_7 = stackOut_39_7;
                  stackIn_41_8 = stackOut_39_8;
                  stackIn_41_9 = stackOut_39_9;
                  stackIn_41_10 = stackOut_39_10;
                  stackIn_41_11 = stackOut_39_11;
                  stackIn_41_12 = stackOut_39_12;
                  stackIn_41_13 = stackOut_39_13;
                  stackIn_41_14 = stackOut_39_14;
                  break L54;
                }
              }
              L55: {
                stackOut_41_0 = null;
                stackOut_41_1 = null;
                stackOut_41_2 = (qm) (Object) stackIn_41_2;
                stackOut_41_3 = stackIn_41_3;
                stackOut_41_4 = stackIn_41_4;
                stackOut_41_5 = stackIn_41_5;
                stackOut_41_6 = stackIn_41_6;
                stackOut_41_7 = stackIn_41_7;
                stackOut_41_8 = stackIn_41_8;
                stackOut_41_9 = stackIn_41_9;
                stackOut_41_10 = stackIn_41_10;
                stackOut_41_11 = stackIn_41_11;
                stackOut_41_12 = stackIn_41_12;
                stackOut_41_13 = (qm) (Object) stackIn_41_13;
                stackOut_41_14 = stackIn_41_14;
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_43_2 = stackOut_41_2;
                stackIn_43_3 = stackOut_41_3;
                stackIn_43_4 = stackOut_41_4;
                stackIn_43_5 = stackOut_41_5;
                stackIn_43_6 = stackOut_41_6;
                stackIn_43_7 = stackOut_41_7;
                stackIn_43_8 = stackOut_41_8;
                stackIn_43_9 = stackOut_41_9;
                stackIn_43_10 = stackOut_41_10;
                stackIn_43_11 = stackOut_41_11;
                stackIn_43_12 = stackOut_41_12;
                stackIn_43_13 = stackOut_41_13;
                stackIn_43_14 = stackOut_41_14;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                stackIn_42_2 = stackOut_41_2;
                stackIn_42_3 = stackOut_41_3;
                stackIn_42_4 = stackOut_41_4;
                stackIn_42_5 = stackOut_41_5;
                stackIn_42_6 = stackOut_41_6;
                stackIn_42_7 = stackOut_41_7;
                stackIn_42_8 = stackOut_41_8;
                stackIn_42_9 = stackOut_41_9;
                stackIn_42_10 = stackOut_41_10;
                stackIn_42_11 = stackOut_41_11;
                stackIn_42_12 = stackOut_41_12;
                stackIn_42_13 = stackOut_41_13;
                stackIn_42_14 = stackOut_41_14;
                if (0 == (var17 & 4)) {
                  stackOut_43_0 = null;
                  stackOut_43_1 = null;
                  stackOut_43_2 = (qm) (Object) stackIn_43_2;
                  stackOut_43_3 = stackIn_43_3;
                  stackOut_43_4 = stackIn_43_4;
                  stackOut_43_5 = stackIn_43_5;
                  stackOut_43_6 = stackIn_43_6;
                  stackOut_43_7 = stackIn_43_7;
                  stackOut_43_8 = stackIn_43_8;
                  stackOut_43_9 = stackIn_43_9;
                  stackOut_43_10 = stackIn_43_10;
                  stackOut_43_11 = stackIn_43_11;
                  stackOut_43_12 = stackIn_43_12;
                  stackOut_43_13 = (qm) (Object) stackIn_43_13;
                  stackOut_43_14 = stackIn_43_14;
                  stackOut_43_15 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  stackIn_44_3 = stackOut_43_3;
                  stackIn_44_4 = stackOut_43_4;
                  stackIn_44_5 = stackOut_43_5;
                  stackIn_44_6 = stackOut_43_6;
                  stackIn_44_7 = stackOut_43_7;
                  stackIn_44_8 = stackOut_43_8;
                  stackIn_44_9 = stackOut_43_9;
                  stackIn_44_10 = stackOut_43_10;
                  stackIn_44_11 = stackOut_43_11;
                  stackIn_44_12 = stackOut_43_12;
                  stackIn_44_13 = stackOut_43_13;
                  stackIn_44_14 = stackOut_43_14;
                  stackIn_44_15 = stackOut_43_15;
                  break L55;
                } else {
                  stackOut_42_0 = null;
                  stackOut_42_1 = null;
                  stackOut_42_2 = (qm) (Object) stackIn_42_2;
                  stackOut_42_3 = stackIn_42_3;
                  stackOut_42_4 = stackIn_42_4;
                  stackOut_42_5 = stackIn_42_5;
                  stackOut_42_6 = stackIn_42_6;
                  stackOut_42_7 = stackIn_42_7;
                  stackOut_42_8 = stackIn_42_8;
                  stackOut_42_9 = stackIn_42_9;
                  stackOut_42_10 = stackIn_42_10;
                  stackOut_42_11 = stackIn_42_11;
                  stackOut_42_12 = stackIn_42_12;
                  stackOut_42_13 = (qm) (Object) stackIn_42_13;
                  stackOut_42_14 = stackIn_42_14;
                  stackOut_42_15 = 1;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  stackIn_44_3 = stackOut_42_3;
                  stackIn_44_4 = stackOut_42_4;
                  stackIn_44_5 = stackOut_42_5;
                  stackIn_44_6 = stackOut_42_6;
                  stackIn_44_7 = stackOut_42_7;
                  stackIn_44_8 = stackOut_42_8;
                  stackIn_44_9 = stackOut_42_9;
                  stackIn_44_10 = stackOut_42_10;
                  stackIn_44_11 = stackOut_42_11;
                  stackIn_44_12 = stackOut_42_12;
                  stackIn_44_13 = stackOut_42_13;
                  stackIn_44_14 = stackOut_42_14;
                  stackIn_44_15 = stackOut_42_15;
                  break L55;
                }
              }
              L56: {
                stackOut_44_0 = null;
                stackOut_44_1 = null;
                stackOut_44_2 = (qm) (Object) stackIn_44_2;
                stackOut_44_3 = stackIn_44_3;
                stackOut_44_4 = stackIn_44_4;
                stackOut_44_5 = stackIn_44_5;
                stackOut_44_6 = stackIn_44_6;
                stackOut_44_7 = stackIn_44_7;
                stackOut_44_8 = stackIn_44_8;
                stackOut_44_9 = stackIn_44_9;
                stackOut_44_10 = stackIn_44_10;
                stackOut_44_11 = stackIn_44_11;
                stackOut_44_12 = stackIn_44_12;
                stackOut_44_13 = (qm) (Object) stackIn_44_13;
                stackOut_44_14 = stackIn_44_14;
                stackOut_44_15 = stackIn_44_15;
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_46_2 = stackOut_44_2;
                stackIn_46_3 = stackOut_44_3;
                stackIn_46_4 = stackOut_44_4;
                stackIn_46_5 = stackOut_44_5;
                stackIn_46_6 = stackOut_44_6;
                stackIn_46_7 = stackOut_44_7;
                stackIn_46_8 = stackOut_44_8;
                stackIn_46_9 = stackOut_44_9;
                stackIn_46_10 = stackOut_44_10;
                stackIn_46_11 = stackOut_44_11;
                stackIn_46_12 = stackOut_44_12;
                stackIn_46_13 = stackOut_44_13;
                stackIn_46_14 = stackOut_44_14;
                stackIn_46_15 = stackOut_44_15;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                stackIn_45_2 = stackOut_44_2;
                stackIn_45_3 = stackOut_44_3;
                stackIn_45_4 = stackOut_44_4;
                stackIn_45_5 = stackOut_44_5;
                stackIn_45_6 = stackOut_44_6;
                stackIn_45_7 = stackOut_44_7;
                stackIn_45_8 = stackOut_44_8;
                stackIn_45_9 = stackOut_44_9;
                stackIn_45_10 = stackOut_44_10;
                stackIn_45_11 = stackOut_44_11;
                stackIn_45_12 = stackOut_44_12;
                stackIn_45_13 = stackOut_44_13;
                stackIn_45_14 = stackOut_44_14;
                stackIn_45_15 = stackOut_44_15;
                if (0 == (var17 & 1)) {
                  stackOut_46_0 = null;
                  stackOut_46_1 = null;
                  stackOut_46_2 = (qm) (Object) stackIn_46_2;
                  stackOut_46_3 = stackIn_46_3;
                  stackOut_46_4 = stackIn_46_4;
                  stackOut_46_5 = stackIn_46_5;
                  stackOut_46_6 = stackIn_46_6;
                  stackOut_46_7 = stackIn_46_7;
                  stackOut_46_8 = stackIn_46_8;
                  stackOut_46_9 = stackIn_46_9;
                  stackOut_46_10 = stackIn_46_10;
                  stackOut_46_11 = stackIn_46_11;
                  stackOut_46_12 = stackIn_46_12;
                  stackOut_46_13 = (qm) (Object) stackIn_46_13;
                  stackOut_46_14 = stackIn_46_14;
                  stackOut_46_15 = stackIn_46_15;
                  stackOut_46_16 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  stackIn_47_3 = stackOut_46_3;
                  stackIn_47_4 = stackOut_46_4;
                  stackIn_47_5 = stackOut_46_5;
                  stackIn_47_6 = stackOut_46_6;
                  stackIn_47_7 = stackOut_46_7;
                  stackIn_47_8 = stackOut_46_8;
                  stackIn_47_9 = stackOut_46_9;
                  stackIn_47_10 = stackOut_46_10;
                  stackIn_47_11 = stackOut_46_11;
                  stackIn_47_12 = stackOut_46_12;
                  stackIn_47_13 = stackOut_46_13;
                  stackIn_47_14 = stackOut_46_14;
                  stackIn_47_15 = stackOut_46_15;
                  stackIn_47_16 = stackOut_46_16;
                  break L56;
                } else {
                  stackOut_45_0 = null;
                  stackOut_45_1 = null;
                  stackOut_45_2 = (qm) (Object) stackIn_45_2;
                  stackOut_45_3 = stackIn_45_3;
                  stackOut_45_4 = stackIn_45_4;
                  stackOut_45_5 = stackIn_45_5;
                  stackOut_45_6 = stackIn_45_6;
                  stackOut_45_7 = stackIn_45_7;
                  stackOut_45_8 = stackIn_45_8;
                  stackOut_45_9 = stackIn_45_9;
                  stackOut_45_10 = stackIn_45_10;
                  stackOut_45_11 = stackIn_45_11;
                  stackOut_45_12 = stackIn_45_12;
                  stackOut_45_13 = (qm) (Object) stackIn_45_13;
                  stackOut_45_14 = stackIn_45_14;
                  stackOut_45_15 = stackIn_45_15;
                  stackOut_45_16 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  stackIn_47_3 = stackOut_45_3;
                  stackIn_47_4 = stackOut_45_4;
                  stackIn_47_5 = stackOut_45_5;
                  stackIn_47_6 = stackOut_45_6;
                  stackIn_47_7 = stackOut_45_7;
                  stackIn_47_8 = stackOut_45_8;
                  stackIn_47_9 = stackOut_45_9;
                  stackIn_47_10 = stackOut_45_10;
                  stackIn_47_11 = stackOut_45_11;
                  stackIn_47_12 = stackOut_45_12;
                  stackIn_47_13 = stackOut_45_13;
                  stackIn_47_14 = stackOut_45_14;
                  stackIn_47_15 = stackOut_45_15;
                  stackIn_47_16 = stackOut_45_16;
                  break L56;
                }
              }
              L57: {
                stackOut_47_0 = null;
                stackOut_47_1 = null;
                stackOut_47_2 = (qm) (Object) stackIn_47_2;
                stackOut_47_3 = stackIn_47_3;
                stackOut_47_4 = stackIn_47_4;
                stackOut_47_5 = stackIn_47_5;
                stackOut_47_6 = stackIn_47_6;
                stackOut_47_7 = stackIn_47_7;
                stackOut_47_8 = stackIn_47_8;
                stackOut_47_9 = stackIn_47_9;
                stackOut_47_10 = stackIn_47_10;
                stackOut_47_11 = stackIn_47_11;
                stackOut_47_12 = stackIn_47_12;
                stackOut_47_13 = (qm) (Object) stackIn_47_13;
                stackOut_47_14 = stackIn_47_14;
                stackOut_47_15 = stackIn_47_15;
                stackOut_47_16 = stackIn_47_16;
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_49_2 = stackOut_47_2;
                stackIn_49_3 = stackOut_47_3;
                stackIn_49_4 = stackOut_47_4;
                stackIn_49_5 = stackOut_47_5;
                stackIn_49_6 = stackOut_47_6;
                stackIn_49_7 = stackOut_47_7;
                stackIn_49_8 = stackOut_47_8;
                stackIn_49_9 = stackOut_47_9;
                stackIn_49_10 = stackOut_47_10;
                stackIn_49_11 = stackOut_47_11;
                stackIn_49_12 = stackOut_47_12;
                stackIn_49_13 = stackOut_47_13;
                stackIn_49_14 = stackOut_47_14;
                stackIn_49_15 = stackOut_47_15;
                stackIn_49_16 = stackOut_47_16;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                stackIn_48_2 = stackOut_47_2;
                stackIn_48_3 = stackOut_47_3;
                stackIn_48_4 = stackOut_47_4;
                stackIn_48_5 = stackOut_47_5;
                stackIn_48_6 = stackOut_47_6;
                stackIn_48_7 = stackOut_47_7;
                stackIn_48_8 = stackOut_47_8;
                stackIn_48_9 = stackOut_47_9;
                stackIn_48_10 = stackOut_47_10;
                stackIn_48_11 = stackOut_47_11;
                stackIn_48_12 = stackOut_47_12;
                stackIn_48_13 = stackOut_47_13;
                stackIn_48_14 = stackOut_47_14;
                stackIn_48_15 = stackOut_47_15;
                stackIn_48_16 = stackOut_47_16;
                if ((var17 & 8) == 0) {
                  stackOut_49_0 = null;
                  stackOut_49_1 = null;
                  stackOut_49_2 = (qm) (Object) stackIn_49_2;
                  stackOut_49_3 = stackIn_49_3;
                  stackOut_49_4 = stackIn_49_4;
                  stackOut_49_5 = stackIn_49_5;
                  stackOut_49_6 = stackIn_49_6;
                  stackOut_49_7 = stackIn_49_7;
                  stackOut_49_8 = stackIn_49_8;
                  stackOut_49_9 = stackIn_49_9;
                  stackOut_49_10 = stackIn_49_10;
                  stackOut_49_11 = stackIn_49_11;
                  stackOut_49_12 = stackIn_49_12;
                  stackOut_49_13 = (qm) (Object) stackIn_49_13;
                  stackOut_49_14 = stackIn_49_14;
                  stackOut_49_15 = stackIn_49_15;
                  stackOut_49_16 = stackIn_49_16;
                  stackOut_49_17 = 0;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  stackIn_50_3 = stackOut_49_3;
                  stackIn_50_4 = stackOut_49_4;
                  stackIn_50_5 = stackOut_49_5;
                  stackIn_50_6 = stackOut_49_6;
                  stackIn_50_7 = stackOut_49_7;
                  stackIn_50_8 = stackOut_49_8;
                  stackIn_50_9 = stackOut_49_9;
                  stackIn_50_10 = stackOut_49_10;
                  stackIn_50_11 = stackOut_49_11;
                  stackIn_50_12 = stackOut_49_12;
                  stackIn_50_13 = stackOut_49_13;
                  stackIn_50_14 = stackOut_49_14;
                  stackIn_50_15 = stackOut_49_15;
                  stackIn_50_16 = stackOut_49_16;
                  stackIn_50_17 = stackOut_49_17;
                  break L57;
                } else {
                  stackOut_48_0 = null;
                  stackOut_48_1 = null;
                  stackOut_48_2 = (qm) (Object) stackIn_48_2;
                  stackOut_48_3 = stackIn_48_3;
                  stackOut_48_4 = stackIn_48_4;
                  stackOut_48_5 = stackIn_48_5;
                  stackOut_48_6 = stackIn_48_6;
                  stackOut_48_7 = stackIn_48_7;
                  stackOut_48_8 = stackIn_48_8;
                  stackOut_48_9 = stackIn_48_9;
                  stackOut_48_10 = stackIn_48_10;
                  stackOut_48_11 = stackIn_48_11;
                  stackOut_48_12 = stackIn_48_12;
                  stackOut_48_13 = (qm) (Object) stackIn_48_13;
                  stackOut_48_14 = stackIn_48_14;
                  stackOut_48_15 = stackIn_48_15;
                  stackOut_48_16 = stackIn_48_16;
                  stackOut_48_17 = 1;
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  stackIn_50_3 = stackOut_48_3;
                  stackIn_50_4 = stackOut_48_4;
                  stackIn_50_5 = stackOut_48_5;
                  stackIn_50_6 = stackOut_48_6;
                  stackIn_50_7 = stackOut_48_7;
                  stackIn_50_8 = stackOut_48_8;
                  stackIn_50_9 = stackOut_48_9;
                  stackIn_50_10 = stackOut_48_10;
                  stackIn_50_11 = stackOut_48_11;
                  stackIn_50_12 = stackOut_48_12;
                  stackIn_50_13 = stackOut_48_13;
                  stackIn_50_14 = stackOut_48_14;
                  stackIn_50_15 = stackOut_48_15;
                  stackIn_50_16 = stackOut_48_16;
                  stackIn_50_17 = stackOut_48_17;
                  break L57;
                }
              }
              L58: {
                stackOut_50_0 = null;
                stackOut_50_1 = null;
                stackOut_50_2 = (qm) (Object) stackIn_50_2;
                stackOut_50_3 = stackIn_50_3;
                stackOut_50_4 = stackIn_50_4;
                stackOut_50_5 = stackIn_50_5;
                stackOut_50_6 = stackIn_50_6;
                stackOut_50_7 = stackIn_50_7;
                stackOut_50_8 = stackIn_50_8;
                stackOut_50_9 = stackIn_50_9;
                stackOut_50_10 = stackIn_50_10;
                stackOut_50_11 = stackIn_50_11;
                stackOut_50_12 = stackIn_50_12;
                stackOut_50_13 = (qm) (Object) stackIn_50_13;
                stackOut_50_14 = stackIn_50_14;
                stackOut_50_15 = stackIn_50_15;
                stackOut_50_16 = stackIn_50_16;
                stackOut_50_17 = stackIn_50_17;
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_52_2 = stackOut_50_2;
                stackIn_52_3 = stackOut_50_3;
                stackIn_52_4 = stackOut_50_4;
                stackIn_52_5 = stackOut_50_5;
                stackIn_52_6 = stackOut_50_6;
                stackIn_52_7 = stackOut_50_7;
                stackIn_52_8 = stackOut_50_8;
                stackIn_52_9 = stackOut_50_9;
                stackIn_52_10 = stackOut_50_10;
                stackIn_52_11 = stackOut_50_11;
                stackIn_52_12 = stackOut_50_12;
                stackIn_52_13 = stackOut_50_13;
                stackIn_52_14 = stackOut_50_14;
                stackIn_52_15 = stackOut_50_15;
                stackIn_52_16 = stackOut_50_16;
                stackIn_52_17 = stackOut_50_17;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                stackIn_51_2 = stackOut_50_2;
                stackIn_51_3 = stackOut_50_3;
                stackIn_51_4 = stackOut_50_4;
                stackIn_51_5 = stackOut_50_5;
                stackIn_51_6 = stackOut_50_6;
                stackIn_51_7 = stackOut_50_7;
                stackIn_51_8 = stackOut_50_8;
                stackIn_51_9 = stackOut_50_9;
                stackIn_51_10 = stackOut_50_10;
                stackIn_51_11 = stackOut_50_11;
                stackIn_51_12 = stackOut_50_12;
                stackIn_51_13 = stackOut_50_13;
                stackIn_51_14 = stackOut_50_14;
                stackIn_51_15 = stackOut_50_15;
                stackIn_51_16 = stackOut_50_16;
                stackIn_51_17 = stackOut_50_17;
                if ((16 & var17) == 0) {
                  stackOut_52_0 = null;
                  stackOut_52_1 = null;
                  stackOut_52_2 = (qm) (Object) stackIn_52_2;
                  stackOut_52_3 = stackIn_52_3;
                  stackOut_52_4 = stackIn_52_4;
                  stackOut_52_5 = stackIn_52_5;
                  stackOut_52_6 = stackIn_52_6;
                  stackOut_52_7 = stackIn_52_7;
                  stackOut_52_8 = stackIn_52_8;
                  stackOut_52_9 = stackIn_52_9;
                  stackOut_52_10 = stackIn_52_10;
                  stackOut_52_11 = stackIn_52_11;
                  stackOut_52_12 = stackIn_52_12;
                  stackOut_52_13 = (qm) (Object) stackIn_52_13;
                  stackOut_52_14 = stackIn_52_14;
                  stackOut_52_15 = stackIn_52_15;
                  stackOut_52_16 = stackIn_52_16;
                  stackOut_52_17 = stackIn_52_17;
                  stackOut_52_18 = 0;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  stackIn_53_3 = stackOut_52_3;
                  stackIn_53_4 = stackOut_52_4;
                  stackIn_53_5 = stackOut_52_5;
                  stackIn_53_6 = stackOut_52_6;
                  stackIn_53_7 = stackOut_52_7;
                  stackIn_53_8 = stackOut_52_8;
                  stackIn_53_9 = stackOut_52_9;
                  stackIn_53_10 = stackOut_52_10;
                  stackIn_53_11 = stackOut_52_11;
                  stackIn_53_12 = stackOut_52_12;
                  stackIn_53_13 = stackOut_52_13;
                  stackIn_53_14 = stackOut_52_14;
                  stackIn_53_15 = stackOut_52_15;
                  stackIn_53_16 = stackOut_52_16;
                  stackIn_53_17 = stackOut_52_17;
                  stackIn_53_18 = stackOut_52_18;
                  break L58;
                } else {
                  stackOut_51_0 = null;
                  stackOut_51_1 = null;
                  stackOut_51_2 = (qm) (Object) stackIn_51_2;
                  stackOut_51_3 = stackIn_51_3;
                  stackOut_51_4 = stackIn_51_4;
                  stackOut_51_5 = stackIn_51_5;
                  stackOut_51_6 = stackIn_51_6;
                  stackOut_51_7 = stackIn_51_7;
                  stackOut_51_8 = stackIn_51_8;
                  stackOut_51_9 = stackIn_51_9;
                  stackOut_51_10 = stackIn_51_10;
                  stackOut_51_11 = stackIn_51_11;
                  stackOut_51_12 = stackIn_51_12;
                  stackOut_51_13 = (qm) (Object) stackIn_51_13;
                  stackOut_51_14 = stackIn_51_14;
                  stackOut_51_15 = stackIn_51_15;
                  stackOut_51_16 = stackIn_51_16;
                  stackOut_51_17 = stackIn_51_17;
                  stackOut_51_18 = 1;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  stackIn_53_3 = stackOut_51_3;
                  stackIn_53_4 = stackOut_51_4;
                  stackIn_53_5 = stackOut_51_5;
                  stackIn_53_6 = stackOut_51_6;
                  stackIn_53_7 = stackOut_51_7;
                  stackIn_53_8 = stackOut_51_8;
                  stackIn_53_9 = stackOut_51_9;
                  stackIn_53_10 = stackOut_51_10;
                  stackIn_53_11 = stackOut_51_11;
                  stackIn_53_12 = stackOut_51_12;
                  stackIn_53_13 = stackOut_51_13;
                  stackIn_53_14 = stackOut_51_14;
                  stackIn_53_15 = stackOut_51_15;
                  stackIn_53_16 = stackOut_51_16;
                  stackIn_53_17 = stackOut_51_17;
                  stackIn_53_18 = stackOut_51_18;
                  break L58;
                }
              }
              L59: {
                stackOut_53_0 = null;
                stackOut_53_1 = null;
                stackOut_53_2 = (qm) (Object) stackIn_53_2;
                stackOut_53_3 = stackIn_53_3;
                stackOut_53_4 = stackIn_53_4;
                stackOut_53_5 = stackIn_53_5;
                stackOut_53_6 = stackIn_53_6;
                stackOut_53_7 = stackIn_53_7;
                stackOut_53_8 = stackIn_53_8;
                stackOut_53_9 = stackIn_53_9;
                stackOut_53_10 = stackIn_53_10;
                stackOut_53_11 = stackIn_53_11;
                stackOut_53_12 = stackIn_53_12;
                stackOut_53_13 = (qm) (Object) stackIn_53_13;
                stackOut_53_14 = stackIn_53_14;
                stackOut_53_15 = stackIn_53_15;
                stackOut_53_16 = stackIn_53_16;
                stackOut_53_17 = stackIn_53_17;
                stackOut_53_18 = stackIn_53_18;
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_55_2 = stackOut_53_2;
                stackIn_55_3 = stackOut_53_3;
                stackIn_55_4 = stackOut_53_4;
                stackIn_55_5 = stackOut_53_5;
                stackIn_55_6 = stackOut_53_6;
                stackIn_55_7 = stackOut_53_7;
                stackIn_55_8 = stackOut_53_8;
                stackIn_55_9 = stackOut_53_9;
                stackIn_55_10 = stackOut_53_10;
                stackIn_55_11 = stackOut_53_11;
                stackIn_55_12 = stackOut_53_12;
                stackIn_55_13 = stackOut_53_13;
                stackIn_55_14 = stackOut_53_14;
                stackIn_55_15 = stackOut_53_15;
                stackIn_55_16 = stackOut_53_16;
                stackIn_55_17 = stackOut_53_17;
                stackIn_55_18 = stackOut_53_18;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                stackIn_54_2 = stackOut_53_2;
                stackIn_54_3 = stackOut_53_3;
                stackIn_54_4 = stackOut_53_4;
                stackIn_54_5 = stackOut_53_5;
                stackIn_54_6 = stackOut_53_6;
                stackIn_54_7 = stackOut_53_7;
                stackIn_54_8 = stackOut_53_8;
                stackIn_54_9 = stackOut_53_9;
                stackIn_54_10 = stackOut_53_10;
                stackIn_54_11 = stackOut_53_11;
                stackIn_54_12 = stackOut_53_12;
                stackIn_54_13 = stackOut_53_13;
                stackIn_54_14 = stackOut_53_14;
                stackIn_54_15 = stackOut_53_15;
                stackIn_54_16 = stackOut_53_16;
                stackIn_54_17 = stackOut_53_17;
                stackIn_54_18 = stackOut_53_18;
                if ((32 & var17) == 0) {
                  stackOut_55_0 = null;
                  stackOut_55_1 = null;
                  stackOut_55_2 = (qm) (Object) stackIn_55_2;
                  stackOut_55_3 = stackIn_55_3;
                  stackOut_55_4 = stackIn_55_4;
                  stackOut_55_5 = stackIn_55_5;
                  stackOut_55_6 = stackIn_55_6;
                  stackOut_55_7 = stackIn_55_7;
                  stackOut_55_8 = stackIn_55_8;
                  stackOut_55_9 = stackIn_55_9;
                  stackOut_55_10 = stackIn_55_10;
                  stackOut_55_11 = stackIn_55_11;
                  stackOut_55_12 = stackIn_55_12;
                  stackOut_55_13 = (qm) (Object) stackIn_55_13;
                  stackOut_55_14 = stackIn_55_14;
                  stackOut_55_15 = stackIn_55_15;
                  stackOut_55_16 = stackIn_55_16;
                  stackOut_55_17 = stackIn_55_17;
                  stackOut_55_18 = stackIn_55_18;
                  stackOut_55_19 = 0;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  stackIn_56_3 = stackOut_55_3;
                  stackIn_56_4 = stackOut_55_4;
                  stackIn_56_5 = stackOut_55_5;
                  stackIn_56_6 = stackOut_55_6;
                  stackIn_56_7 = stackOut_55_7;
                  stackIn_56_8 = stackOut_55_8;
                  stackIn_56_9 = stackOut_55_9;
                  stackIn_56_10 = stackOut_55_10;
                  stackIn_56_11 = stackOut_55_11;
                  stackIn_56_12 = stackOut_55_12;
                  stackIn_56_13 = stackOut_55_13;
                  stackIn_56_14 = stackOut_55_14;
                  stackIn_56_15 = stackOut_55_15;
                  stackIn_56_16 = stackOut_55_16;
                  stackIn_56_17 = stackOut_55_17;
                  stackIn_56_18 = stackOut_55_18;
                  stackIn_56_19 = stackOut_55_19;
                  break L59;
                } else {
                  stackOut_54_0 = null;
                  stackOut_54_1 = null;
                  stackOut_54_2 = (qm) (Object) stackIn_54_2;
                  stackOut_54_3 = stackIn_54_3;
                  stackOut_54_4 = stackIn_54_4;
                  stackOut_54_5 = stackIn_54_5;
                  stackOut_54_6 = stackIn_54_6;
                  stackOut_54_7 = stackIn_54_7;
                  stackOut_54_8 = stackIn_54_8;
                  stackOut_54_9 = stackIn_54_9;
                  stackOut_54_10 = stackIn_54_10;
                  stackOut_54_11 = stackIn_54_11;
                  stackOut_54_12 = stackIn_54_12;
                  stackOut_54_13 = (qm) (Object) stackIn_54_13;
                  stackOut_54_14 = stackIn_54_14;
                  stackOut_54_15 = stackIn_54_15;
                  stackOut_54_16 = stackIn_54_16;
                  stackOut_54_17 = stackIn_54_17;
                  stackOut_54_18 = stackIn_54_18;
                  stackOut_54_19 = 1;
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  stackIn_56_3 = stackOut_54_3;
                  stackIn_56_4 = stackOut_54_4;
                  stackIn_56_5 = stackOut_54_5;
                  stackIn_56_6 = stackOut_54_6;
                  stackIn_56_7 = stackOut_54_7;
                  stackIn_56_8 = stackOut_54_8;
                  stackIn_56_9 = stackOut_54_9;
                  stackIn_56_10 = stackOut_54_10;
                  stackIn_56_11 = stackOut_54_11;
                  stackIn_56_12 = stackOut_54_12;
                  stackIn_56_13 = stackOut_54_13;
                  stackIn_56_14 = stackOut_54_14;
                  stackIn_56_15 = stackOut_54_15;
                  stackIn_56_16 = stackOut_54_16;
                  stackIn_56_17 = stackOut_54_17;
                  stackIn_56_18 = stackOut_54_18;
                  stackIn_56_19 = stackOut_54_19;
                  break L59;
                }
              }
              var30_ref_hn = new hn(stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_56_5, stackIn_56_6, stackIn_56_7, stackIn_56_8, stackIn_56_9, stackIn_56_10, (qm) (Object) stackIn_56_11, (qm) (Object) stackIn_56_12, stackIn_56_13, stackIn_56_14 != 0, stackIn_56_15 != 0, stackIn_56_16 != 0, stackIn_56_17 != 0, stackIn_56_18 != 0, stackIn_56_19 != 0);
              var20.a((Object) (Object) var30_ref_hn, (byte) 6);
              var14++;
              continue L3;
            }
          }
        }
    }

    private final void a(boolean param0, ah param1) {
        jk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var3 = (jk) (Object) param1.b((byte) 124);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_i == 0) {
                    break L2;
                  } else {
                    var3.f(-115);
                    if (0 >= var3.field_i) {
                      var3.a((byte) -21);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = (jk) (Object) param1.c((byte) -76);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("sg.C(").append(0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    private final int c(int param0, int param1, int param2) {
        return param0 | param2;
    }

    private final void b(wm param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            if ((param0.field_J & 65536) == 0) {
              L1: {
                if (!((sg) this).field_pb) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0.field_A.field_h;
                    var4 = param0.field_A.field_f;
                    if ((131072 & param0.field_J) == 0) {
                      break L2;
                    } else {
                      var4 = param0.field_F;
                      var3_int = param0.field_D;
                      break L2;
                    }
                  }
                  if ((16384 & param0.field_J) == 0) {
                    if (!param0.field_E.field_d) {
                      tc.g(var3_int - -((sg) this).field_db.field_k, var4 + ((sg) this).field_db.field_a, param0.field_E.field_a, 0, 128);
                      break L1;
                    } else {
                      var14 = new int[16];
                      var5 = var14;
                      var6 = param0.field_w.field_j;
                      var7 = param0.field_w.field_g;
                      var8 = -var7;
                      var9 = var6;
                      var10 = (float)param0.field_E.field_m;
                      var11 = (float)param0.field_E.field_h;
                      var14[7] = (int)((float)var4 + var10 * var7 - var11 * var9);
                      var14[2] = (int)(-(var10 * var6) + (float)var3_int + var8 * var11);
                      var14[3] = (int)(-(var10 * var7) + (float)var4 + var9 * var11);
                      var14[1] = (int)((float)var4 + var7 * var10 + var11 * var9);
                      var14[0] = (int)(var11 * var8 + ((float)var3_int + var10 * var6));
                      var14[4] = (int)(-(var10 * var6) + (float)var3_int - var11 * var8);
                      var14[6] = (int)(-(var11 * var8) + ((float)var3_int + var6 * var10));
                      var14[5] = (int)((float)var4 - var7 * var10 - var9 * var11);
                      var12 = 0;
                      L3: while (true) {
                        if (8 <= var12) {
                          var15 = qk.a(var5, (byte) -127);
                          dl.a(var15, (byte) -106, 128, 0);
                          break L1;
                        } else {
                          var14[var12 + 8] = var14[var12] - -((sg) this).field_db.field_k;
                          var14[var12 + 9] = var14[var12 + 1] - -((sg) this).field_db.field_a;
                          var12 += 2;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    hc.a(128, param0.a((byte) -110), (byte) -108, ((sg) this).field_db.field_k + var3_int, ((sg) this).field_db.field_a + var4);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("sg.GA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 8192 + 41);
        }
    }

    private final void a(long param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          this.a((byte) -3, param0);
          if (3 != ((sg) this).field_r) {
            L1: {
              L2: {
                var4 = ((sg) this).field_F + 128;
                if (((sg) this).field_J == 2) {
                  break L2;
                } else {
                  if (((sg) this).field_J != 6) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = var4 + 256 >> 1;
              break L1;
            }
            o.a(128, 480, 0, var4, 640, -4441, 0);
            break L0;
          } else {
            break L0;
          }
        }
        var4 = hc.a(0, (int)(param0 << 1)) - -(2 * tn.a((int)(param0 >> 1), 5255)) >> 20;
        var5 = ((int)param0 * 640 - 1) % 1337;
        var6 = var5 / 640;
        L3: while (true) {
          if (var6 >= 480) {
            var5 = (-1 + (int)param0 * 640) % 917;
            var6 = var5 / 640;
            L4: while (true) {
              if (var6 >= 480) {
                var5 = (640 * (int)param0 - 1) % 593;
                var6 = var5 / 640;
                L5: while (true) {
                  if (var6 >= 480) {
                    return;
                  } else {
                    L6: {
                      if ((2 * var5 + var6 * 4) % 7 == 0) {
                        tc.d(var5, var6, -4 + (var5 - -var4), -7 + var6, 5461344);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var5 += 375;
                    if (var5 <= 640) {
                      continue L5;
                    } else {
                      var6 = var6 + var5 / 640;
                      var5 = var5 % 640;
                      continue L5;
                    }
                  }
                }
              } else {
                L7: {
                  if ((var6 * 4 + var5 * 2) % 7 != 0) {
                    break L7;
                  } else {
                    tc.d(var5, var6, var4 + (-3 + var5), -5 + var6, 3364192);
                    break L7;
                  }
                }
                var5 += 547;
                if (640 < var5) {
                  var6 = var6 + var5 / 640;
                  var5 = var5 % 640;
                  continue L4;
                } else {
                  continue L4;
                }
              }
            }
          } else {
            L8: {
              if ((var5 * 3 - -(5 * var6)) % 9 != 0) {
                break L8;
              } else {
                tc.d(var5, var6, -3 + (var5 + var4), var6 + -7, 6715272);
                break L8;
              }
            }
            var5 += 939;
            if (640 < var5) {
              var6 = var6 + var5 / 640;
              var5 = var5 % 640;
              continue L3;
            } else {
              continue L3;
            }
          }
        }
    }

    private final void b(String param0, byte param1) {
        ji var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        ji var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ((sg) this).field_a = ((sg) this).field_mb;
              if (param0 == null) {
                int fieldTemp$9 = ((sg) this).field_mb + 1;
                ((sg) this).field_mb = ((sg) this).field_mb + 1;
                if (~fieldTemp$9 != ~mm.field_a.length) {
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                ((sg) this).field_mb = this.a(param0, -118);
                break L1;
              }
            }
            L2: {
              if (((sg) this).field_mb == ((sg) this).field_a) {
                break L2;
              } else {
                ((sg) this).field_k = 0;
                break L2;
              }
            }
            L3: {
              var7 = mm.field_a[((sg) this).field_mb];
              var3 = var7;
              if (param1 == 8) {
                break L3;
              } else {
                var6 = null;
                this.b((String) null, (byte) 71);
                break L3;
              }
            }
            var4 = 0;
            L4: while (true) {
              if (var4 >= var3.field_c) {
                break L0;
              } else {
                int discarded$10 = -99;
                this.a(var7.field_e[var4]);
                var4++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("sg.EA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, ja param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 3) {
                break L0;
              } else {
                L2: {
                  if (param2.field_Fb[var4_int] != 3) {
                    break L2;
                  } else {
                    L3: {
                      var6 = var4_int;
                      if (var6 != 0) {
                        if (var6 == 1) {
                          var5 = 65280;
                          break L3;
                        } else {
                          var5 = 8355839;
                          break L3;
                        }
                      } else {
                        var5 = 16711680;
                        break L3;
                      }
                    }
                    tc.g(param2.field_A.field_h, param2.field_A.field_f, 4 + param0 * 4, var5, 16);
                    break L2;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("sg.J(").append(param0).append(44).append(-403).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final void b(int param0) {
        ji var2 = null;
        int var3 = 0;
        ok var4 = null;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ji var11 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var10 = HoldTheLine.field_D;
        var11 = mm.field_a[((sg) this).field_mb];
        var2 = var11;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var3 >= var2.field_b) {
              break L1;
            } else {
              var4 = var11.field_p[var3];
              var5 = 1;
              var6 = 0;
              L2: while (true) {
                if (var4.field_d <= var6) {
                  if (var5 != 0) {
                    this.b(var4.field_b, (byte) 8);
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L3: {
                    var7 = var4.field_a[var6];
                    if (var7.field_d != 0) {
                      if (var7.field_d == 1) {
                        L4: {
                          stackOut_83_0 = var5;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_84_0 = stackOut_83_0;
                          if (0 == (2 & ((sg) this).field_o)) {
                            stackOut_85_0 = stackIn_85_0;
                            stackOut_85_1 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            break L4;
                          } else {
                            stackOut_84_0 = stackIn_84_0;
                            stackOut_84_1 = 1;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            break L4;
                          }
                        }
                        var5 = stackIn_86_0 & stackIn_86_1;
                        break L3;
                      } else {
                        if (var7.field_d != 2) {
                          if (3 == var7.field_d) {
                            L5: {
                              var8 = ((sg) this).field_C[0].field_Fb[var7.field_c];
                              var9 = var7.field_e;
                              if (var9 <= var8) {
                                break L5;
                              } else {
                                if ((1 & var7.field_b) == 0) {
                                  var5 = 0;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (~var8 != ~var9) {
                                break L6;
                              } else {
                                if ((2 & var7.field_b) != 0) {
                                  break L6;
                                } else {
                                  var5 = 0;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (var8 <= var9) {
                                break L7;
                              } else {
                                if ((var7.field_b & 4) != 0) {
                                  break L7;
                                } else {
                                  var5 = 0;
                                  break L7;
                                }
                              }
                            }
                            break L3;
                          } else {
                            if (var7.field_d != 4) {
                              if (var7.field_d != 5) {
                                if (var7.field_d == 9) {
                                  L8: {
                                    var8 = ((sg) this).field_C[var7.field_c].field_R;
                                    var9 = var7.field_e;
                                    if (var9 <= var8) {
                                      break L8;
                                    } else {
                                      if (0 == (1 & var7.field_b)) {
                                        var5 = 0;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (~var9 != ~var8) {
                                      break L9;
                                    } else {
                                      if (0 != (2 & var7.field_b)) {
                                        break L9;
                                      } else {
                                        var5 = 0;
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (~var8 >= ~var9) {
                                      break L10;
                                    } else {
                                      if ((var7.field_b & 4) == 0) {
                                        var5 = 0;
                                        break L10;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  break L3;
                                } else {
                                  if (var7.field_d != 6) {
                                    if (7 != var7.field_d) {
                                      if (8 != var7.field_d) {
                                        break L3;
                                      } else {
                                        L11: {
                                          L12: {
                                            stackOut_55_0 = var5;
                                            stackIn_58_0 = stackOut_55_0;
                                            stackIn_56_0 = stackOut_55_0;
                                            if (!((sg) this).field_U) {
                                              break L12;
                                            } else {
                                              stackOut_56_0 = stackIn_56_0;
                                              stackIn_58_0 = stackOut_56_0;
                                              stackIn_57_0 = stackOut_56_0;
                                              if (-((sg) this).field_ob + ((sg) this).field_ab < 150) {
                                                break L12;
                                              } else {
                                                stackOut_57_0 = stackIn_57_0;
                                                stackOut_57_1 = 1;
                                                stackIn_59_0 = stackOut_57_0;
                                                stackIn_59_1 = stackOut_57_1;
                                                break L11;
                                              }
                                            }
                                          }
                                          stackOut_58_0 = stackIn_58_0;
                                          stackOut_58_1 = 0;
                                          stackIn_59_0 = stackOut_58_0;
                                          stackIn_59_1 = stackOut_58_1;
                                          break L11;
                                        }
                                        var5 = stackIn_59_0 & stackIn_59_1;
                                        break L3;
                                      }
                                    } else {
                                      L13: {
                                        stackOut_50_0 = var5;
                                        stackIn_52_0 = stackOut_50_0;
                                        stackIn_51_0 = stackOut_50_0;
                                        if (0 == (16 & ((sg) this).field_o)) {
                                          stackOut_52_0 = stackIn_52_0;
                                          stackOut_52_1 = 0;
                                          stackIn_53_0 = stackOut_52_0;
                                          stackIn_53_1 = stackOut_52_1;
                                          break L13;
                                        } else {
                                          stackOut_51_0 = stackIn_51_0;
                                          stackOut_51_1 = 1;
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_53_1 = stackOut_51_1;
                                          break L13;
                                        }
                                      }
                                      var5 = stackIn_53_0 & stackIn_53_1;
                                      break L3;
                                    }
                                  } else {
                                    L14: {
                                      stackOut_45_0 = var5;
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if ((8 & ((sg) this).field_o) == 0) {
                                        stackOut_47_0 = stackIn_47_0;
                                        stackOut_47_1 = 0;
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        break L14;
                                      } else {
                                        stackOut_46_0 = stackIn_46_0;
                                        stackOut_46_1 = 1;
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        break L14;
                                      }
                                    }
                                    var5 = stackIn_48_0 & stackIn_48_1;
                                    break L3;
                                  }
                                }
                              } else {
                                L15: {
                                  var8 = ((sg) this).field_C[var7.field_c].field_bc;
                                  var9 = var7.field_e;
                                  if (~var8 <= ~var9) {
                                    break L15;
                                  } else {
                                    if ((var7.field_b & 1) == 0) {
                                      var5 = 0;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (var9 != var8) {
                                    break L16;
                                  } else {
                                    if ((2 & var7.field_b) == 0) {
                                      var5 = 0;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (~var9 <= ~var8) {
                                    break L17;
                                  } else {
                                    if (0 == (4 & var7.field_b)) {
                                      var5 = 0;
                                      break L17;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                break L3;
                              }
                            } else {
                              if (((sg) this).field_C[var7.field_c].field_J == var7.field_b) {
                                break L3;
                              } else {
                                var5 = 0;
                                break L3;
                              }
                            }
                          }
                        } else {
                          L18: {
                            if (var7.field_b < 0) {
                              stackOut_13_0 = var7.field_b + ((sg) this).field_sb.length;
                              stackIn_14_0 = stackOut_13_0;
                              break L18;
                            } else {
                              stackOut_12_0 = var7.field_b;
                              stackIn_14_0 = stackOut_12_0;
                              break L18;
                            }
                          }
                          L19: {
                            var8 = stackIn_14_0;
                            var9 = (int)((sg) this).field_C[0].field_vb;
                            if (var9 >= var8) {
                              break L19;
                            } else {
                              if ((var7.field_c & 1) == 0) {
                                var5 = 0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (var8 != var9) {
                              break L20;
                            } else {
                              if ((var7.field_c & 2) != 0) {
                                break L20;
                              } else {
                                var5 = 0;
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (~var8 <= ~var9) {
                              break L21;
                            } else {
                              if ((4 & var7.field_c) != 0) {
                                break L21;
                              } else {
                                var5 = 0;
                                break L21;
                              }
                            }
                          }
                          break L3;
                        }
                      }
                    } else {
                      L22: {
                        stackOut_5_0 = var5;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if ((((sg) this).field_o & 1) == 0) {
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L22;
                        } else {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L22;
                        }
                      }
                      var5 = stackIn_8_0 & stackIn_8_1;
                      break L3;
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            }
          }
          L23: {
            if (0 >= ((sg) this).field_tb) {
              break L23;
            } else {
              if (((sg) this).field_tb < 256) {
                int fieldTemp$4 = ((sg) this).field_tb - 3;
                ((sg) this).field_tb = ((sg) this).field_tb - 3;
                if (fieldTemp$4 <= 0) {
                  ((sg) this).field_D = -101;
                  break L23;
                } else {
                  break L23;
                }
              } else {
                break L23;
              }
            }
          }
          L24: {
            if (~((sg) this).field_a == ~((sg) this).field_mb) {
              break L24;
            } else {
              int fieldTemp$5 = ((sg) this).field_k + 1;
              ((sg) this).field_k = ((sg) this).field_k + 1;
              if (fieldTemp$5 != 40) {
                break L24;
              } else {
                ((sg) this).field_a = ((sg) this).field_mb;
                break L24;
              }
            }
          }
          L25: {
            ((sg) this).field_o = ((sg) this).field_o & -28;
            if (((sg) this).field_mb != -1) {
              if (null == mm.field_a[((sg) this).field_mb].field_j) {
                int fieldTemp$6 = pc.field_h + 4;
                pc.field_h = pc.field_h + 4;
                if (fieldTemp$6 > 255) {
                  pc.field_h = 255;
                  break L25;
                } else {
                  break L25;
                }
              } else {
                int fieldTemp$7 = pc.field_h - 4;
                pc.field_h = pc.field_h - 4;
                if (fieldTemp$7 < 0) {
                  pc.field_h = 0;
                  break L25;
                } else {
                  break L25;
                }
              }
            } else {
              pc.field_h = 255;
              break L25;
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        if (!param2) {
            return false;
        }
        if (param3 >= 0) {
            if (param1 >= 0) {
                if (640 > param3) {
                    if (param1 < 480) {
                        var5 = ((sg) this).field_lb.field_m[param3 + 640 * param1];
                        if (param0 >= 1) {
                            var5 = var5 & 60;
                        } else {
                            if (!(param0 > -1)) {
                                var5 = var5 & 15;
                            }
                        }
                        return 0 != var5 ? true : false;
                    }
                }
            }
        }
        return b.a(!param2 ? true : false, param3, param1, ((sg) this).field_nb);
    }

    private final void a(ja param0, float param1, int param2, float param3, float param4) {
        RuntimeException var6 = null;
        float var6_float = 0.0f;
        int var7 = 0;
        int var8_int = 0;
        wm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var6_float = (float)Math.sqrt((double)(param3 * param3 + param4 * param4));
            var7 = 1 + (int)var6_float;
            param1 = param1 / (float)var7;
            param3 = param3 / (float)var7;
            param4 = param4 / (float)var7;
            var8_int = 0;
            L1: while (true) {
              L2: {
                if (~var7 >= ~var8_int) {
                  break L2;
                } else {
                  L3: {
                    if (0.0f != param1) {
                      param0.field_r = param0.field_r + param1;
                      param0.field_w.a(param0.field_r, (byte) -54);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param0.field_y = param0.field_y + param3;
                  param0.field_u = param0.field_u + param4;
                  param0.field_A.field_f = (int)param0.field_u;
                  param0.field_A.field_h = (int)param0.field_y;
                  if (!this.a(true, param0)) {
                    var8_int++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = (wm) (Object) ((sg) this).field_d.b((byte) 108);
              L4: while (true) {
                if (var8 == null) {
                  L5: {
                    param0.a(-1, bl.field_r.field_sb);
                    if (param0.field_v == -1) {
                      break L5;
                    } else {
                      param0.field_q = bl.field_r.field_sb[param0.field_v].field_k;
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  L6: {
                    if ((262144 & var8.field_J) == 0) {
                      break L6;
                    } else {
                      int discarded$1 = 7;
                      this.a(var8, param0);
                      break L6;
                    }
                  }
                  var8 = (wm) (Object) ((sg) this).field_d.c((byte) 92);
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("sg.P(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + 0 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final boolean a(boolean param0, ja param1) {
        RuntimeException var3 = null;
        dn var3_ref = null;
        qm var4 = null;
        in var5_ref_in = null;
        int var5 = 0;
        int var6_int = 0;
        float var6_float = 0.0f;
        wm var6 = null;
        float var7_float = 0.0f;
        qm var7 = null;
        float var8_float = 0.0f;
        qm var8 = null;
        float var9_float = 0.0f;
        qm var9 = null;
        float var10_float = 0.0f;
        qm var10 = null;
        float var11_float = 0.0f;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        oa var16 = null;
        int var17 = 0;
        ja stackIn_9_0 = null;
        ja stackIn_10_0 = null;
        ja stackIn_11_0 = null;
        ja stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        oa stackIn_20_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_8_0 = null;
        ja stackOut_9_0 = null;
        ja stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ja stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        oa stackOut_18_0 = null;
        oa stackOut_19_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_ref = param1.field_C;
              var4 = this.a(param1, 0);
              if (var4 != null) {
                var5_ref_in = new in(0.0f, 0.0f);
                var6_int = 0;
                L2: while (true) {
                  L3: {
                    if (var6_int >= 10) {
                      break L3;
                    } else {
                      qm discarded$3 = dd.a(0, var5_ref_in, ((sg) this).field_nb, param1.field_q, var4);
                      param1.field_u = param1.field_u + var5_ref_in.field_g;
                      param1.field_y = param1.field_y + var5_ref_in.field_j;
                      param1.field_A.field_f = (int)param1.field_u;
                      param1.field_A.field_h = (int)param1.field_y;
                      var7 = this.a(param1, 0);
                      if (var7 != null) {
                        var4 = var7;
                        var6_int++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var6_float = -param1.field_y + (float)var4.field_h;
                      param1.field_T = 20;
                      var7_float = -param1.field_u + (float)var4.field_f;
                      stackOut_8_0 = (ja) param1;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (((sg) this).field_J == 2) {
                        break L5;
                      } else {
                        stackOut_9_0 = (ja) (Object) stackIn_9_0;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (((sg) this).field_J == 6) {
                          break L5;
                        } else {
                          stackOut_10_0 = (ja) (Object) stackIn_10_0;
                          stackOut_10_1 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L4;
                        }
                      }
                    }
                    stackOut_11_0 = (ja) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L4;
                  }
                  L6: {
                    stackIn_12_0.field_V = stackIn_12_1 != 0;
                    param1.field_H = param1.e((byte) 45);
                    var8_float = (-(var7_float * var5_ref_in.field_j) + var6_float * var5_ref_in.field_g) / 3.5f;
                    var9_float = param1.field_j * (-var7_float / 3.5f);
                    var10_float = var6_float / 3.5f * param1.field_j;
                    var11_float = var8_float * (var8_float * var3_ref.field_l) + var3_ref.field_a;
                    var12 = var5_ref_in.field_g * (param1.field_x + var10_float) + var5_ref_in.field_j * (param1.field_t + var9_float);
                    if (0.0f > var12) {
                      L7: {
                        var13 = 0.800000011920929f * param1.a((byte) 114, sl.field_c);
                        var14 = -(1.0f + var13) * var12 * var3_ref.field_a / var11_float;
                        param1.field_t = param1.field_t + var14 * var5_ref_in.field_j;
                        param1.field_x = param1.field_x + var14 * var5_ref_in.field_g;
                        var15 = var12 * (-var8_float * -(var13 + 1.0f)) * var3_ref.field_l / var11_float;
                        param1.field_j = param1.field_j + var15;
                        param1.a(-var12, 0, (ja) null, 0);
                        if (~(((sg) this).field_ab - 30) < ~param1.field_cb) {
                          L8: {
                            L9: {
                              if (param1.field_J == 2) {
                                break L9;
                              } else {
                                if (0 < param1.field_Fb[2]) {
                                  break L9;
                                } else {
                                  stackOut_18_0 = sj.field_K;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L8;
                                }
                              }
                            }
                            stackOut_19_0 = vn.field_h;
                            stackIn_20_0 = stackOut_19_0;
                            break L8;
                          }
                          var16 = stackIn_20_0;
                          kk discarded$4 = bd.a((byte) 113, (ee) (Object) param1, (el) (Object) var16, var16.field_q);
                          param1.field_cb = ((sg) this).field_ab;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      param1.a((byte) 67, (ee) null);
                      if (param1.field_W == null) {
                        break L6;
                      } else {
                        L10: {
                          ((sg) this).field_rb[7] = -1;
                          ((sg) this).field_rb[6] = -1;
                          if ((((sg) this).field_H & 134217728) == 0) {
                            ((sg) this).field_N = ((sg) this).field_N - (((sg) this).field_p * ((sg) this).field_l << 27);
                            ((sg) this).field_H = ((sg) this).field_H ^ 134217728;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if ((((sg) this).field_H & 16384) != 16384) {
                          break L6;
                        } else {
                          ((sg) this).field_N = ((sg) this).field_N + (((sg) this).field_p * ((sg) this).field_l << 14);
                          ((sg) this).field_H = ((sg) this).field_H ^ 16384;
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  param1.field_A.field_h = (int)param1.field_y;
                  param1.field_A.field_f = (int)param1.field_u;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L11: {
              if (var4 == null) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L11;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L11;
              }
            }
            var5 = stackIn_31_0;
            var6 = (wm) (Object) ((sg) this).field_cb.b((byte) 98);
            L12: while (true) {
              if (var6 == null) {
                var6 = (wm) (Object) ((sg) this).field_d.b((byte) 117);
                L13: while (true) {
                  if (var6 == null) {
                    L14: {
                      var7 = new qm(0, 0);
                      var8 = new qm(0, 0);
                      var9 = new qm(0, 0);
                      var10 = new qm(0, 0);
                      var7.field_f = (int)(param1.field_w.field_g * (float)param1.field_C.field_K + ((float)param1.field_C.field_k * param1.field_w.field_j + param1.field_u));
                      var7.field_h = (int)(-(param1.field_w.field_g * (float)param1.field_C.field_k) + param1.field_y + param1.field_w.field_j * (float)param1.field_C.field_K);
                      var8.field_h = (int)((float)param1.field_C.field_K * param1.field_w.field_j + (param1.field_y + param1.field_w.field_g * (float)param1.field_C.field_k));
                      var8.field_f = (int)(-((float)param1.field_C.field_k * param1.field_w.field_j) + param1.field_u + (float)param1.field_C.field_K * param1.field_w.field_g);
                      var9.field_h = (int)(-((float)param1.field_C.field_K * param1.field_w.field_j) + (-((float)param1.field_C.field_k * param1.field_w.field_g) + param1.field_y));
                      var9.field_f = (int)(-((float)param1.field_C.field_K * param1.field_w.field_g) + (param1.field_u + (float)param1.field_C.field_k * param1.field_w.field_j));
                      var10.field_f = (int)(-((float)param1.field_C.field_k * param1.field_w.field_j) + param1.field_u - param1.field_w.field_g * (float)param1.field_C.field_K);
                      var10.field_h = (int)(-((float)param1.field_C.field_K * param1.field_w.field_j) + (param1.field_y + param1.field_w.field_g * (float)param1.field_C.field_k));
                      var11 = 0;
                      if (((sg) this).a(param1.field_q, var7.field_f, true, var7.field_h)) {
                        break L14;
                      } else {
                        var11++;
                        break L14;
                      }
                    }
                    L15: {
                      if (!((sg) this).a(param1.field_q, var8.field_f, true, var8.field_h)) {
                        var11++;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (!((sg) this).a(param1.field_q, var9.field_f, true, var9.field_h)) {
                        var11++;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (((sg) this).a(param1.field_q, var10.field_f, true, var10.field_h)) {
                        break L17;
                      } else {
                        var11++;
                        break L17;
                      }
                    }
                    L18: {
                      L19: {
                        if (!((sg) this).a(param1.field_q, (int)param1.field_u, true, (int)param1.field_y)) {
                          break L19;
                        } else {
                          if (3 <= var11) {
                            break L19;
                          } else {
                            param1.field_Zb.field_h = (int)param1.field_y;
                            param1.field_db = 0;
                            param1.field_Zb.field_f = (int)param1.field_u;
                            break L18;
                          }
                        }
                      }
                      int fieldTemp$5 = param1.field_db + 1;
                      param1.field_db = param1.field_db + 1;
                      if (fieldTemp$5 > 20) {
                        param1.field_u = (float)param1.field_Zb.field_f;
                        param1.field_y = (float)param1.field_Zb.field_h;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    stackOut_53_0 = var5;
                    stackIn_54_0 = stackOut_53_0;
                    break L0;
                  } else {
                    var5 = var5 != 0 | this.a((byte) -109, var6, param1) ? 1 : 0;
                    var6 = (wm) (Object) ((sg) this).field_d.c((byte) 86);
                    continue L13;
                  }
                }
              } else {
                var5 = var5 != 0 | this.a((byte) -96, var6, param1) ? 1 : 0;
                var6 = (wm) (Object) ((sg) this).field_cb.c((byte) -25);
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var3;
            stackOut_55_1 = new StringBuilder().append("sg.JA(").append(1).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L20;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L20;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 41);
        }
        return stackIn_54_0 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var13 = HoldTheLine.field_D;
        var4 = ((sg) this).field_C[0].field_vb;
        var5 = ce.a(-1, (wc[]) (Object) ((sg) this).field_sb) / (float)(param2 + 1);
        var6 = (int)var4;
        var7 = ((sg) this).field_sb[var6].f(50);
        var8 = var7 * ((float)(1 - -var6) - var4);
        var9 = var5;
        var10 = 0;
        L0: while (true) {
          if (~var10 <= ~param2) {
            return;
          } else {
            L1: while (true) {
              if (var9 <= var8) {
                L2: {
                  var8 = var8 - var9;
                  var9 = var5;
                  var11 = ((sg) this).field_sb[var6].a(false, -(var8 / var7) + 1.0f);
                  if (param0 == -1) {
                    stackOut_11_0 = kj.b(2, 4);
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    if (3 != param0) {
                      stackOut_10_0 = 1 + param0;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                }
                var12 = stackIn_12_0;
                ((sg) this).field_cb.a((byte) -91, (hl) (Object) new wm(var11, 1 + var12, -1));
                var10++;
                continue L0;
              } else {
                L3: {
                  var6++;
                  if (var6 == ((sg) this).field_sb.length) {
                    var6 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var9 = var9 - var8;
                var7 = ((sg) this).field_sb[var6].f(50);
                var8 = var7;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(vk param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ei var4_ref = null;
        int var5_int = 0;
        ei var5 = null;
        int var6_int = 0;
        ei var6 = null;
        int var7_int = 0;
        ei var7 = null;
        ei var8 = null;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        qm var15 = null;
        int var16 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var16 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (((sg) this).field_lb == null) {
                ((sg) this).field_lb = new bm(640, 480, 256);
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (4 <= var4_int) {
                L3: {
                  if (((sg) this).field_r != 3) {
                    tn.a(((sg) this).field_sb, 10000536, (vd) (Object) new rk(((sg) this).field_lb, (byte) 2));
                    mn.a(((sg) this).field_sb, (vd) (Object) new rk(((sg) this).field_lb, (byte) 3), (byte) -20);
                    break L3;
                  } else {
                    tn.a(((sg) this).field_sb, 10000536, (vd) (Object) new rk(((sg) this).field_lb, (byte) 3));
                    break L3;
                  }
                }
                L4: {
                  int discarded$2 = 32381;
                  ok.a();
                  if (((sg) this).field_qb == null) {
                    ((sg) this).field_qb = new hj(640, 480);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((sg) this).field_qb.f();
                int discarded$3 = 0;
                dj.a(((sg) this).field_J, param0);
                var4_ref = new ei();
                L5: {
                  var5 = new ei();
                  var6 = new ei();
                  var7 = new ei();
                  var8 = new ei();
                  lf.a(var6, var8, var5, var4_ref, ((sg) this).field_sb, var7, -110);
                  var5 = mk.a(var5, (byte) -127);
                  var7 = mk.a(var7, (byte) -127);
                  var6 = mk.a(var6, (byte) -127);
                  var8 = mk.a(var8, (byte) -127);
                  ((sg) this).field_jb = ao.a(var6, (byte) 21, false, var5);
                  ((sg) this).field_nb = ao.a(var8, (byte) 21, false, var7);
                  l.a(29824, param0);
                  if (3 == ((sg) this).field_r) {
                    var9 = ce.a(-1, (wc[]) (Object) ((sg) this).field_sb);
                    var10 = 1 + (int)(var9 / 72.0f);
                    ((sg) this).field_A = var9 / (float)var10;
                    var11 = 0.0f;
                    var12 = 0;
                    ((sg) this).field_u = new int[var10];
                    ((sg) this).field_w = new int[var10];
                    ((sg) this).field_x = new int[var10];
                    ((sg) this).field_eb = new int[var10];
                    var13 = ((sg) this).field_sb[0].f(50);
                    var14 = 0;
                    L6: while (true) {
                      if (var14 >= var10) {
                        break L5;
                      } else {
                        L7: while (true) {
                          if (var13 >= var11) {
                            ((sg) this).field_w[var14] = var12;
                            var15 = ((sg) this).field_sb[var12].a(false, var11 / var13);
                            ((sg) this).field_x[var14] = var15.field_h;
                            ((sg) this).field_u[var14] = var15.field_f;
                            tc.f(var15.field_h - 1, -1 + var15.field_f, 3, 3, 8421504);
                            var11 = var11 + ((sg) this).field_A;
                            var14++;
                            continue L6;
                          } else {
                            var11 = var11 - var13;
                            var12++;
                            var13 = ((sg) this).field_sb[var12].f(50);
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                ug.b(-1);
                break L0;
              } else {
                var5_int = 0;
                L8: while (true) {
                  if (var5_int >= 4) {
                    var4_int++;
                    continue L2;
                  } else {
                    var6_int = 0;
                    L9: while (true) {
                      if (var6_int >= 4) {
                        var5_int++;
                        continue L8;
                      } else {
                        L10: {
                          var7_int = 16 * var6_int + 4 * var5_int - -var4_int;
                          ((sg) this).field_lb.field_n[var7_int] = 0;
                          if (var4_int == 3) {
                            ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 255);
                            break L10;
                          } else {
                            if (var4_int != 2) {
                              break L10;
                            } else {
                              ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 128);
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var5_int != 3) {
                            if (var5_int != 2) {
                              break L11;
                            } else {
                              ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 32768);
                              break L11;
                            }
                          } else {
                            ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 65280);
                            break L11;
                          }
                        }
                        L12: {
                          if (3 == var6_int) {
                            ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 16711680);
                            break L12;
                          } else {
                            if (2 == var6_int) {
                              ((sg) this).field_lb.field_n[var7_int] = kc.a(((sg) this).field_lb.field_n[var7_int], 8388608);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var6_int++;
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("sg.QA(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L13;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 28978 + 44 + 0 + 41);
        }
    }

    private final void a(vf param0, int param1, ja param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!param2.field_z) {
                break L1;
              } else {
                if (!param0.c((byte) -111)) {
                  break L1;
                } else {
                  mo.field_q.field_h = param0.field_B + 12;
                  mo.field_q.field_f = param0.field_i + 12;
                  var4_int = -param2.field_A.field_h + mo.field_q.field_h;
                  var5 = mo.field_q.field_f - param2.field_A.field_f;
                  var6 = param2.field_B + 8;
                  if (~(var6 * var6) < ~(var5 * var5 + var4_int * var4_int)) {
                    if (ca.a(mo.field_q, param2.field_i, param2.field_A, 8, param2.field_w, param2.field_k, 83)) {
                      param2.field_Sb = param2.field_Sb + 1;
                      param0.a(param2, (int)(param2.field_t * 8192.0f), (byte) 62, (int)(param2.field_x * 8192.0f));
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("sg.N(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(-103).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    sg(vk param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            this.a(param3, param5, param1, (byte) 113, param4, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = null;
        field_K = "Rocket boost";
        field_Z = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_v = new ah();
    }
}
