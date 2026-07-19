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
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      this.a(param2, param1, param0 ^ 39);
                      if (param0 == 7) {
                        break L2;
                      } else {
                        this.a((String) null, -0.27448931336402893f, 32, (ul) null, (String) null);
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException((String) null);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref);
                stackOut_6_1 = new StringBuilder().append("sg.R(").append(param0).append(',');
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L3;
                }
              }
              L4: {
                stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L4;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              this.field_I.field_z[0] = 1;
              var7 = 307200;
              if (param0 <= -7) {
                break L1;
              } else {
                this.field_o = -116;
                break L1;
              }
            }
            L2: while (true) {
              if ((var7 ^ -1) >= -1) {
                break L0;
              } else {
                L3: while (true) {
                  var7--;
                  var3 = this.field_I.field_z[var7];
                  if (this.field_I.field_z[var7] != 0) {
                    var2_int = tc.field_b[var7];
                    var6 = (var2_int & 255) * (255 & var3);
                    var4 = (255 & var3 >> -1541940752) * (16711680 & var2_int);
                    var5 = ((var3 & 65280) >> -2084567224) * (var2_int & 65280);
                    tc.field_b[var7] = kc.a(kc.a(pk.a(var4, -16777216), pk.a(16711680, var5)), pk.a(65280, var6)) >>> -719214040;
                    continue L2;
                  } else {
                    tc.field_b[var7] = 0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "sg.MB(" + param0 + ')');
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 < -109) {
                break L1;
              } else {
                this.field_l = 103;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if ((mm.field_a.length ^ -1) >= (var3_int ^ -1)) {
                throw new RuntimeException();
              } else {
                if (param0.equals(mm.field_a[var3_int].field_l)) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var3_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("sg.I(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    private final void a(String param0, byte param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_ib) {
                  break L2;
                } else {
                  if (this.field_j < this.field_ib.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = this.field_j - -1;
              var4 = new String[var3_int];
              var5 = 0;
              L3: while (true) {
                if (var5 >= this.field_j) {
                  this.field_ib = var4;
                  break L1;
                } else {
                  var4[var5] = this.field_ib[var5];
                  var5++;
                  continue L3;
                }
              }
            }
            L4: {
              if (param1 == 53) {
                break L4;
              } else {
                this.field_q = (ah[]) null;
                break L4;
              }
            }
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_ib[fieldTemp$1] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("sg.G(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(vk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a(param0, 28978, false);
            var3_int = -22 / ((-32 - param1) / 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (runtimeException);
            stackOut_2_1 = new StringBuilder().append("sg.F(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var18 = HoldTheLine.field_D;
        try {
          L0: {
            if (0 == (196608 & param4.field_J)) {
              var7_int = param4.field_A.field_h + -param0;
              if (param3 == -35) {
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
                        var11 = new int[16];
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
                        var11[0] = nc.field_g;
                        var11[1] = rf.field_X;
                        rf.field_X = rf.field_X + var8 / 4;
                        nc.field_g = nc.field_g + var7_int / 4;
                        var11[3] = rf.field_X;
                        var11[2] = nc.field_g;
                        rf.field_X = (int)(-(var13 * var16) + (float)param4.field_A.field_f + var15 * var17);
                        nc.field_g = (int)(var17 * var14 + (-(var16 * var12) + (float)param4.field_A.field_h));
                        var11[5] = rf.field_X;
                        var7_int = nc.field_g - param0;
                        var11[4] = nc.field_g;
                        var8 = rf.field_X + -param1;
                        rf.field_X = rf.field_X + var8 / 4;
                        nc.field_g = nc.field_g + var7_int / 4;
                        var11[6] = nc.field_g;
                        var11[7] = rf.field_X;
                        rf.field_X = (int)(-(var15 * var17) + ((float)param4.field_A.field_f - var13 * var16));
                        nc.field_g = (int)((float)param4.field_A.field_h - var16 * var12 - var14 * var17);
                        var7_int = nc.field_g + -param0;
                        var11[8] = nc.field_g;
                        var11[9] = rf.field_X;
                        var8 = -param1 + rf.field_X;
                        rf.field_X = rf.field_X + var8 / 4;
                        nc.field_g = nc.field_g + var7_int / 4;
                        var11[11] = rf.field_X;
                        var11[10] = nc.field_g;
                        rf.field_X = (int)(-(var15 * var17) + (var13 * var16 + (float)param4.field_A.field_f));
                        nc.field_g = (int)(-(var14 * var17) + (var16 * var12 + (float)param4.field_A.field_h));
                        var11[12] = nc.field_g;
                        var11[13] = rf.field_X;
                        var7_int = -param0 + nc.field_g;
                        var8 = rf.field_X + -param1;
                        rf.field_X = rf.field_X + var8 / 4;
                        nc.field_g = nc.field_g + var7_int / 4;
                        var11[14] = nc.field_g;
                        var11[15] = rf.field_X;
                        var11 = qk.a(var11, (byte) -113);
                        if (-257 > (param5 ^ -1)) {
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
                        if (-5 < (var11_int ^ -1)) {
                          var11_int = 4;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var12 = (float)(6.283185307179586 / (double)var11_int);
                      var13_ref_int__ = new int[var11_int * 4];
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
                          var13_ref_int__[var15_int * 4] = var16_int;
                          var8 = var17_int - param1;
                          var13_ref_int__[var15_int * 4 + 1] = var17_int;
                          var13_ref_int__[2 + var15_int * 4] = var7_int / 4 + var16_int;
                          var13_ref_int__[3 + 4 * var15_int] = var8 / 4 + var17_int;
                          var14 = var14 + var12;
                          var15_int++;
                          continue L6;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var7);
            stackOut_36_1 = new StringBuilder().append("sg.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
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
        hl stackIn_32_0 = null;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_30_0 = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var7_ref = this.field_C[3 & param3.field_J];
              if (param0 == -30808) {
                break L1;
              } else {
                this.a((vk) null, 51, false);
                break L1;
              }
            }
            var8 = 0;
            var9_int = 0;
            L2: while (true) {
              if (var9_int >= this.field_z) {
                L3: {
                  if (null == ih.field_n) {
                    break L3;
                  } else {
                    stackOut_30_0 = ih.field_n.b((byte) 125);
                    stackIn_32_0 = stackOut_30_0;
                    var9 = (vf) ((Object) stackIn_32_0);
                    L4: while (true) {
                      if (var9 == null) {
                        break L3;
                      } else {
                        L5: {
                          mo.field_q.field_f = 12 + var9.field_i;
                          mo.field_q.field_h = 12 + var9.field_B;
                          var10 = mo.field_q.field_h - param3.field_A.field_h;
                          var11 = -param3.field_A.field_f + mo.field_q.field_f;
                          var12 = var11 * var11 + var10 * var10;
                          var13 = 6 * (param4 * param4);
                          if ((var13 ^ -1) < (var12 ^ -1)) {
                            var14 = (var13 * 2 + -var12) * 4096;
                            var10 = var14 * var10 / (var13 * 2);
                            var11 = var11 * var14 / (var13 * 2);
                            var9.a(var7_ref, var10, (byte) 24, var11);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var9 = (vf) ((Object) ih.field_n.c((byte) -94));
                        continue L4;
                      }
                    }
                  }
                }
                stackOut_41_0 = var8;
                stackIn_42_0 = stackOut_41_0;
                break L0;
              } else {
                L6: {
                  var10_ref_ja = this.field_C[var9_int];
                  if (var10_ref_ja == null) {
                    break L6;
                  } else {
                    if (1 < -var10_ref_ja.field_q + param3.field_q) {
                      break L6;
                    } else {
                      if (0 < (-var10_ref_ja.field_q + param3.field_q ^ -1)) {
                        break L6;
                      } else {
                        var11 = var10_ref_ja.field_A.field_h - param3.field_A.field_h;
                        var12 = -param3.field_A.field_f + var10_ref_ja.field_A.field_f;
                        var13 = param4 + param3.field_B + var10_ref_ja.field_B;
                        var14 = var11 * var11 + var12 * var12;
                        if (var14 < var13 * var13) {
                          L7: {
                            if ((var10_ref_ja.field_rc ^ -1) != -1) {
                              break L7;
                            } else {
                              var8++;
                              break L7;
                            }
                          }
                          L8: {
                            var15 = (float)Math.sqrt((double)var14);
                            if (var15 >= (float)(var10_ref_ja.field_B - -param3.field_B)) {
                              break L8;
                            } else {
                              var15 = (float)(param3.field_B + var10_ref_ja.field_B);
                              break L8;
                            }
                          }
                          L9: {
                            var16 = 1.0f - ((float)(-param3.field_B) + (var15 - (float)var10_ref_ja.field_B)) / (float)(2 * param4);
                            var17 = param5 * var16;
                            if (-3 != (var10_ref_ja.field_J ^ -1)) {
                              var18 = var10_ref_ja.field_C.field_l * var10_ref_ja.a((byte) 118, ek.field_c);
                              var19 = var17 / var18;
                              var20 = (float)(-param3.field_A.field_h + var10_ref_ja.field_A.field_h) / var15 * var19;
                              var21 = (float)(var10_ref_ja.field_A.field_f + -param3.field_A.field_f) / var15 * var19;
                              var10_ref_ja.field_t = var10_ref_ja.field_t + var20;
                              var10_ref_ja.field_x = var10_ref_ja.field_x + var21;
                              var10_ref_ja.field_j = ln.a(-29407, var17) * 5.0f;
                              var10_ref_ja.a(2, param2);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10_ref_ja.a(var16, param0 ^ -30808, var7_ref, param1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                var9_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var7);
            stackOut_43_1 = new StringBuilder().append("sg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_42_0;
    }

    private final boolean a(byte param0, wm param1, ja param2) {
        kk discarded$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        float var4_float = 0.0f;
        int var5 = 0;
        float var5_float = 0.0f;
        float var6 = 0.0f;
        oa var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        ja stackIn_26_0 = null;
        ja stackIn_28_0 = null;
        ja stackIn_29_0 = null;
        ja stackIn_31_0 = null;
        ja stackIn_33_0 = null;
        ja stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        oa stackIn_49_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_223_0 = 0;
        RuntimeException stackIn_225_0 = null;
        StringBuilder stackIn_225_1 = null;
        RuntimeException stackIn_227_0 = null;
        StringBuilder stackIn_227_1 = null;
        RuntimeException stackIn_228_0 = null;
        StringBuilder stackIn_228_1 = null;
        String stackIn_228_2 = null;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        String stackIn_232_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_220_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_222_0 = 0;
        ja stackOut_25_0 = null;
        ja stackOut_26_0 = null;
        ja stackOut_28_0 = null;
        ja stackOut_29_0 = null;
        ja stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        ja stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        oa stackOut_46_0 = null;
        oa stackOut_48_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_224_0 = null;
        StringBuilder stackOut_224_1 = null;
        RuntimeException stackOut_227_0 = null;
        StringBuilder stackOut_227_1 = null;
        String stackOut_227_2 = null;
        RuntimeException stackOut_225_0 = null;
        StringBuilder stackOut_225_1 = null;
        String stackOut_225_2 = null;
        RuntimeException stackOut_228_0 = null;
        StringBuilder stackOut_228_1 = null;
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        String stackOut_231_2 = null;
        RuntimeException stackOut_229_0 = null;
        StringBuilder stackOut_229_1 = null;
        String stackOut_229_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (im.a(param2, param1, 32758)) {
              L1: {
                if (param0 < -86) {
                  break L1;
                } else {
                  this.field_a = -68;
                  break L1;
                }
              }
              if ((param1.field_J & 512 ^ -1) != -1) {
                L2: {
                  L3: {
                    var4_int = 3 & param1.field_J;
                    if (-1 == this.field_mb) {
                      break L3;
                    } else {
                      if ((this.field_o & 4) != 0) {
                        break L2;
                      } else {
                        if (param2.field_W == null) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param2.c(3, var4_int)) {
                    param1.d(0);
                    if (param2.field_mc == 0) {
                      this.field_rb[11] = -1;
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= 3) {
                          L5: {
                            if ((this.field_rb[var4_int + 8] ^ -1) == -1) {
                              this.field_rb[var4_int + 8] = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (0 != var4_int) {
                              break L6;
                            } else {
                              L7: {
                                if (-1 != (256 & this.field_H ^ -1)) {
                                  break L7;
                                } else {
                                  this.field_N = this.field_N - (this.field_p * this.field_l << -728201304);
                                  this.field_H = this.field_H ^ 256;
                                  break L7;
                                }
                              }
                              L8: {
                                if ((64 & this.field_H ^ -1) != -1) {
                                  this.field_N = this.field_N + (this.field_p * this.field_l << 1373421574);
                                  break L8;
                                } else {
                                  this.field_N = this.field_N - (this.field_p * this.field_l << 875209350);
                                  break L8;
                                }
                              }
                              this.field_H = this.field_H ^ 64;
                              if (-65 == (64 & this.field_H ^ -1)) {
                                L9: {
                                  if ((this.field_H & 67108864) != 0) {
                                    this.field_N = this.field_N + (this.field_l * this.field_p << -1029390950);
                                    break L9;
                                  } else {
                                    this.field_N = this.field_N - (this.field_l * this.field_p << 928068122);
                                    break L9;
                                  }
                                }
                                this.field_H = this.field_H ^ 67108864;
                                if (0 == (67108864 & this.field_H)) {
                                  L10: {
                                    if ((this.field_H & 512 ^ -1) == -1) {
                                      this.field_N = this.field_N - (this.field_l * this.field_p << -110154935);
                                      break L10;
                                    } else {
                                      this.field_N = this.field_N + (this.field_l * this.field_p << 63190089);
                                      break L10;
                                    }
                                  }
                                  this.field_H = this.field_H ^ 512;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          L11: {
                            if (-2 != (var4_int ^ -1)) {
                              break L11;
                            } else {
                              L12: {
                                if (-524289 == (this.field_H & 524288 ^ -1)) {
                                  this.field_H = this.field_H ^ 524288;
                                  this.field_N = this.field_N + (this.field_l * this.field_p << 2058891187);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if ((this.field_H & 16777216) == 0) {
                                  this.field_N = this.field_N - (this.field_p * this.field_l << -611421448);
                                  break L13;
                                } else {
                                  this.field_N = this.field_N + (this.field_l * this.field_p << 306408536);
                                  break L13;
                                }
                              }
                              this.field_H = this.field_H ^ 16777216;
                              if (-16777217 == (16777216 & this.field_H ^ -1)) {
                                L14: {
                                  if ((this.field_H & 2097152 ^ -1) != -1) {
                                    this.field_N = this.field_N + (this.field_p * this.field_l << -12503275);
                                    break L14;
                                  } else {
                                    this.field_N = this.field_N - (this.field_p * this.field_l << 710790069);
                                    break L14;
                                  }
                                }
                                this.field_H = this.field_H ^ 2097152;
                                if (2097152 != (2097152 & this.field_H)) {
                                  break L11;
                                } else {
                                  L15: {
                                    if ((this.field_H & 2) != 0) {
                                      this.field_N = this.field_N + (this.field_l * this.field_p << 773517889);
                                      break L15;
                                    } else {
                                      this.field_N = this.field_N - (this.field_p * this.field_l << -1280757151);
                                      break L15;
                                    }
                                  }
                                  this.field_H = this.field_H ^ 2;
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          L16: {
                            if ((var4_int ^ -1) != -3) {
                              break L16;
                            } else {
                              L17: {
                                if (0 == (16 & this.field_H)) {
                                  this.field_N = this.field_N - (this.field_l * this.field_p << 336252644);
                                  this.field_H = this.field_H ^ 16;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (-1 != (this.field_H & 1 ^ -1)) {
                                  this.field_N = this.field_N + (this.field_l * this.field_p << 2081044160);
                                  break L18;
                                } else {
                                  this.field_N = this.field_N - (this.field_l * this.field_p << 911615488);
                                  break L18;
                                }
                              }
                              this.field_H = this.field_H ^ 1;
                              if (-1 == (this.field_H & 1 ^ -1)) {
                                L19: {
                                  if ((536870912 & this.field_H ^ -1) == -1) {
                                    this.field_N = this.field_N - (this.field_p * this.field_l << 1980561085);
                                    break L19;
                                  } else {
                                    this.field_N = this.field_N + (this.field_l * this.field_p << 38293021);
                                    break L19;
                                  }
                                }
                                this.field_H = this.field_H ^ 536870912;
                                if (0 != (536870912 & this.field_H)) {
                                  break L16;
                                } else {
                                  L20: {
                                    if (-1 != (131072 & this.field_H ^ -1)) {
                                      this.field_N = this.field_N + (this.field_l * this.field_p << -807626863);
                                      break L20;
                                    } else {
                                      this.field_N = this.field_N - (this.field_l * this.field_p << 713988145);
                                      break L20;
                                    }
                                  }
                                  this.field_H = this.field_H ^ 131072;
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (-4 == (var4_int ^ -1)) {
                            L21: {
                              if (8 == (8 & this.field_H)) {
                                this.field_H = this.field_H ^ 8;
                                this.field_N = this.field_N + (this.field_l * this.field_p << 1204790147);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              if ((32 & this.field_H) == 0) {
                                this.field_N = this.field_N - (this.field_p * this.field_l << -832701307);
                                break L22;
                              } else {
                                this.field_N = this.field_N + (this.field_l * this.field_p << 1854633093);
                                break L22;
                              }
                            }
                            this.field_H = this.field_H ^ 32;
                            if (0 != (32 & this.field_H)) {
                              break L2;
                            } else {
                              L23: {
                                if ((this.field_H & 2048 ^ -1) == -1) {
                                  this.field_N = this.field_N - (this.field_p * this.field_l << 419935979);
                                  break L23;
                                } else {
                                  this.field_N = this.field_N + (this.field_p * this.field_l << -1674952821);
                                  break L23;
                                }
                              }
                              this.field_H = this.field_H ^ 2048;
                              if (-2049 != (this.field_H & 2048 ^ -1)) {
                                break L2;
                              } else {
                                L24: {
                                  if (0 == (33554432 & this.field_H)) {
                                    this.field_N = this.field_N - (this.field_l * this.field_p << 1255834873);
                                    break L24;
                                  } else {
                                    this.field_N = this.field_N + (this.field_p * this.field_l << 241612857);
                                    break L24;
                                  }
                                }
                                this.field_H = this.field_H ^ 33554432;
                                break L2;
                              }
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          L25: {
                            if (var5 != var4_int) {
                              this.field_rb[8 - -var5] = -1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                stackOut_220_0 = 0;
                stackIn_221_0 = stackOut_220_0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                if (0 == (1024 & param1.field_J)) {
                  if ((param1.field_J & 8192 ^ -1) != -1) {
                    L26: {
                      if ((param1.field_J & 2048 ^ -1) == -1) {
                        break L26;
                      } else {
                        if ((param1.field_J & 3) != param2.field_mc) {
                          L27: {
                            this.d(param1, 28977);
                            if (-1 == (3 & param1.field_J ^ -1)) {
                              this.field_o = this.field_o | 8;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          stackOut_63_0 = 1;
                          stackIn_64_0 = stackOut_63_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L26;
                        }
                      }
                    }
                    stackOut_65_0 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if ((262144 & param1.field_J) != 0) {
                      stackOut_222_0 = 0;
                      stackIn_223_0 = stackOut_222_0;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      L28: {
                        L29: {
                          param2.field_T = 20;
                          stackOut_25_0 = (ja) (param2);
                          stackIn_33_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (-3 == (this.field_J ^ -1)) {
                            break L29;
                          } else {
                            stackOut_26_0 = (ja) ((Object) stackIn_26_0);
                            stackIn_28_0 = stackOut_26_0;
                            stackOut_28_0 = (ja) ((Object) stackIn_28_0);
                            stackIn_33_0 = stackOut_28_0;
                            stackIn_29_0 = stackOut_28_0;
                            if (-7 == (this.field_J ^ -1)) {
                              break L29;
                            } else {
                              stackOut_29_0 = (ja) ((Object) stackIn_29_0);
                              stackIn_31_0 = stackOut_29_0;
                              stackOut_31_0 = (ja) ((Object) stackIn_31_0);
                              stackOut_31_1 = 1;
                              stackIn_34_0 = stackOut_31_0;
                              stackIn_34_1 = stackOut_31_1;
                              break L28;
                            }
                          }
                        }
                        stackOut_33_0 = (ja) ((Object) stackIn_33_0);
                        stackOut_33_1 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L28;
                      }
                      L30: {
                        L31: {
                          stackIn_34_0.field_V = stackIn_34_1 != 0;
                          param2.field_H = param2.e((byte) 45);
                          vl.field_c.field_g = (float)(-(-param2.field_A.field_f + param1.field_A.field_f));
                          vl.field_c.field_j = (float)(-(param1.field_A.field_h - param2.field_A.field_h));
                          if (0.0f != vl.field_c.field_j) {
                            break L31;
                          } else {
                            if (vl.field_c.field_g == 0.0f) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        vl.field_c.a(-1);
                        var4_float = vl.field_c.field_g * param2.field_x + vl.field_c.field_j * param2.field_t;
                        if (0.0f < var4_float) {
                          break L30;
                        } else {
                          L32: {
                            var5_float = 0.800000011920929f * param2.a((byte) 112, sl.field_c);
                            var6 = var4_float * -(1.0f + var5_float);
                            param2.field_x = param2.field_x + var6 * vl.field_c.field_g;
                            param2.field_t = param2.field_t + var6 * vl.field_c.field_j;
                            param2.a(-var4_float, 0, (ja) null, 0);
                            if (-30 + this.field_ab > param2.field_cb) {
                              L33: {
                                L34: {
                                  if (2 == param2.field_J) {
                                    break L34;
                                  } else {
                                    if ((param2.field_Fb[2] ^ -1) < -1) {
                                      break L34;
                                    } else {
                                      stackOut_46_0 = sj.field_K;
                                      stackIn_49_0 = stackOut_46_0;
                                      break L33;
                                    }
                                  }
                                }
                                stackOut_48_0 = vn.field_h;
                                stackIn_49_0 = stackOut_48_0;
                                break L33;
                              }
                              var7 = stackIn_49_0;
                              discarded$1 = bd.a((byte) 54, param2, var7, var7.field_q);
                              param2.field_cb = this.field_ab;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          param2.a((byte) 109, param1);
                          break L30;
                        }
                      }
                      stackOut_51_0 = 1;
                      stackIn_52_0 = stackOut_51_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  L35: {
                    if ((2048 & param1.field_J ^ -1) == -1) {
                      break L35;
                    } else {
                      if ((param2.field_mc ^ -1) == (param1.field_J & 3 ^ -1)) {
                        break L35;
                      } else {
                        this.a(param1, false);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var4 = decompiledCaughtException;
            stackOut_224_0 = (RuntimeException) (var4);
            stackOut_224_1 = new StringBuilder().append("sg.IA(").append(param0).append(',');
            stackIn_227_0 = stackOut_224_0;
            stackIn_227_1 = stackOut_224_1;
            stackIn_225_0 = stackOut_224_0;
            stackIn_225_1 = stackOut_224_1;
            if (param1 == null) {
              stackOut_227_0 = (RuntimeException) ((Object) stackIn_227_0);
              stackOut_227_1 = (StringBuilder) ((Object) stackIn_227_1);
              stackOut_227_2 = "null";
              stackIn_228_0 = stackOut_227_0;
              stackIn_228_1 = stackOut_227_1;
              stackIn_228_2 = stackOut_227_2;
              break L36;
            } else {
              stackOut_225_0 = (RuntimeException) ((Object) stackIn_225_0);
              stackOut_225_1 = (StringBuilder) ((Object) stackIn_225_1);
              stackOut_225_2 = "{...}";
              stackIn_228_0 = stackOut_225_0;
              stackIn_228_1 = stackOut_225_1;
              stackIn_228_2 = stackOut_225_2;
              break L36;
            }
          }
          L37: {
            stackOut_228_0 = (RuntimeException) ((Object) stackIn_228_0);
            stackOut_228_1 = ((StringBuilder) (Object) stackIn_228_1).append(stackIn_228_2).append(',');
            stackIn_231_0 = stackOut_228_0;
            stackIn_231_1 = stackOut_228_1;
            stackIn_229_0 = stackOut_228_0;
            stackIn_229_1 = stackOut_228_1;
            if (param2 == null) {
              stackOut_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackOut_231_1 = (StringBuilder) ((Object) stackIn_231_1);
              stackOut_231_2 = "null";
              stackIn_232_0 = stackOut_231_0;
              stackIn_232_1 = stackOut_231_1;
              stackIn_232_2 = stackOut_231_2;
              break L37;
            } else {
              stackOut_229_0 = (RuntimeException) ((Object) stackIn_229_0);
              stackOut_229_1 = (StringBuilder) ((Object) stackIn_229_1);
              stackOut_229_2 = "{...}";
              stackIn_232_0 = stackOut_229_0;
              stackIn_232_1 = stackOut_229_1;
              stackIn_232_2 = stackOut_229_2;
              break L37;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_232_0), stackIn_232_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_52_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_64_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_66_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_221_0 != 0;
                    } else {
                      return stackIn_223_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void c(wm param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 < -32) {
                break L1;
              } else {
                this.field_lb = (bm) null;
                break L1;
              }
            }
            L2: {
              if (0 != (param0.field_J & 65536)) {
                break L2;
              } else {
                if (this.field_pb) {
                  L3: {
                    if ((param0.field_J & 16384) != 0) {
                      break L3;
                    } else {
                      if (!param0.field_E.field_d) {
                        break L3;
                      } else {
                        L4: {
                          var3_array = new int[8];
                          var4 = param0.field_w.field_j;
                          var5 = param0.field_w.field_g;
                          var6 = -var5;
                          var7 = var4;
                          var8 = param0.field_E.field_h;
                          if (0.0f >= var4 + var5) {
                            break L4;
                          } else {
                            var8 = -var8;
                            break L4;
                          }
                        }
                        var3_array[4] = (int)((float)param0.field_A.field_h - (float)(param0.field_E.field_m >> -873700543) * var4 + (float)var8 * var6);
                        var3_array[0] = (int)((float)param0.field_A.field_h + (float)param0.field_E.field_m * var4 + (float)var8 * var6);
                        var3_array[2] = (int)((float)param0.field_A.field_h - (float)param0.field_E.field_m * var4 + (float)var8 * var6);
                        var3_array[3] = (int)(-(var5 * (float)param0.field_E.field_m) + (float)param0.field_A.field_f + (float)var8 * var7);
                        var3_array[5] = (int)((float)param0.field_A.field_f - (float)(param0.field_E.field_m >> 1827703969) * var5 + (float)var8 * var7);
                        var3_array[1] = (int)((float)var8 * var7 + ((float)param0.field_A.field_f + var5 * (float)param0.field_E.field_m));
                        var3_array[6] = (int)((float)(param0.field_E.field_m >> 1115899169) * var4 + (float)param0.field_A.field_h + var6 * (float)var8);
                        var3_array[7] = (int)((float)param0.field_A.field_f + (float)(param0.field_E.field_m >> 2068120257) * var5 + (float)var8 * var7);
                        var9 = 4;
                        L5: while (true) {
                          if (var9 >= 8) {
                            dl.a(var3_array, (byte) -116, 128, 0);
                            break L3;
                          } else {
                            var3_array[var9] = var3_array[var9] + this.field_db.field_k * 2;
                            var3_array[1 + var9] = var3_array[1 + var9] + this.field_db.field_a * 2;
                            var9 += 2;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("sg.DB(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, long param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ui var7 = null;
        int var8 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        oa stackIn_29_1 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        oa stackOut_28_1 = null;
        int stackOut_26_0 = 0;
        oa stackOut_26_1 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                this.a(-112);
                break L1;
              }
            }
            L2: {
              if (-1 > (this.field_F ^ -1)) {
                this.field_F = this.field_F - 14;
                if (0 > this.field_F) {
                  this.field_F = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                L3: {
                  L4: {
                    L5: {
                      var4_int = (int)(param1 % 157L);
                      if (var4_int < 2) {
                        break L5;
                      } else {
                        if (-140 < (var4_int ^ -1)) {
                          break L4;
                        } else {
                          if ((var4_int ^ -1) < -142) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (-1 >= (hc.a(0, (int)(param1 << -616225402)) ^ -1)) {
                      break L4;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_18_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                }
                L6: {
                  var5 = stackIn_18_0;
                  if (var5 != 0) {
                    this.field_F = 84 + (tn.a((int)(param1 << -1277703226), 5255) * 40 >> -605367792);
                    var6 = this.field_F;
                    var7 = qf.a(293, qd.field_j);
                    if (null == var7) {
                      break L6;
                    } else {
                      var7.a((byte) -125, var6);
                      var7.field_j.i(var6 * 150 + 300);
                      break L6;
                    }
                  } else {
                    if (-6 != (var4_int ^ -1)) {
                      break L6;
                    } else {
                      if (-4 >= (hc.a(0, (int)(param1 << -290594170)) ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          var6 = 84 + (tn.a((int)(param1 << 330998598), 5255) * 40 >> -559334736);
                          stackOut_25_0 = param0 + 296;
                          stackIn_28_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (0L == (1L & param1)) {
                            stackOut_28_0 = stackIn_28_0;
                            stackOut_28_1 = se.field_m;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            break L7;
                          } else {
                            stackOut_26_0 = stackIn_26_0;
                            stackOut_26_1 = uj.field_a;
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_29_1 = stackOut_26_1;
                            break L7;
                          }
                        }
                        L8: {
                          var7 = qf.a(stackIn_29_0, stackIn_29_1);
                          if (null != var7) {
                            var7.a((byte) -126, var6);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        break L6;
                      }
                    }
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, ja param1, ja param2) {
        kk discarded$2 = null;
        kk discarded$3 = null;
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
        ja stackIn_27_0 = null;
        float stackIn_27_1 = 0.0f;
        int stackIn_27_2 = 0;
        ja stackIn_27_3 = null;
        ja stackIn_29_0 = null;
        float stackIn_29_1 = 0.0f;
        int stackIn_29_2 = 0;
        ja stackIn_29_3 = null;
        ja stackIn_31_0 = null;
        float stackIn_31_1 = 0.0f;
        int stackIn_31_2 = 0;
        ja stackIn_31_3 = null;
        ja stackIn_32_0 = null;
        float stackIn_32_1 = 0.0f;
        int stackIn_32_2 = 0;
        ja stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        ja stackIn_37_0 = null;
        float stackIn_37_1 = 0.0f;
        int stackIn_37_2 = 0;
        ja stackIn_37_3 = null;
        ja stackIn_39_0 = null;
        float stackIn_39_1 = 0.0f;
        int stackIn_39_2 = 0;
        ja stackIn_39_3 = null;
        ja stackIn_41_0 = null;
        float stackIn_41_1 = 0.0f;
        int stackIn_41_2 = 0;
        ja stackIn_41_3 = null;
        ja stackIn_42_0 = null;
        float stackIn_42_1 = 0.0f;
        int stackIn_42_2 = 0;
        ja stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        oa stackIn_55_0 = null;
        oa stackIn_66_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_26_0 = null;
        float stackOut_26_1 = 0.0f;
        int stackOut_26_2 = 0;
        ja stackOut_26_3 = null;
        ja stackOut_31_0 = null;
        float stackOut_31_1 = 0.0f;
        int stackOut_31_2 = 0;
        ja stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        ja stackOut_27_0 = null;
        float stackOut_27_1 = 0.0f;
        int stackOut_27_2 = 0;
        ja stackOut_27_3 = null;
        ja stackOut_29_0 = null;
        float stackOut_29_1 = 0.0f;
        int stackOut_29_2 = 0;
        ja stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        ja stackOut_36_0 = null;
        float stackOut_36_1 = 0.0f;
        int stackOut_36_2 = 0;
        ja stackOut_36_3 = null;
        ja stackOut_41_0 = null;
        float stackOut_41_1 = 0.0f;
        int stackOut_41_2 = 0;
        ja stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        ja stackOut_37_0 = null;
        float stackOut_37_1 = 0.0f;
        int stackOut_37_2 = 0;
        ja stackOut_37_3 = null;
        ja stackOut_39_0 = null;
        float stackOut_39_1 = 0.0f;
        int stackOut_39_2 = 0;
        ja stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        oa stackOut_54_0 = null;
        oa stackOut_52_0 = null;
        oa stackOut_63_0 = null;
        oa stackOut_65_0 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            if (qf.a((byte) -73, param2, param1)) {
              this.a(param2, 0.0f, param0 ^ param0, -0.5f * kk.field_k * vl.field_c.field_j, -0.5f * kk.field_k * vl.field_c.field_g);
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
                      if ((param2.field_J ^ -1) != -3) {
                        break L4;
                      } else {
                        if ((param1.field_J ^ -1) != -3) {
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
                      param1.a(param0 + 2, 100);
                      break L1;
                    } else {
                      var20_float = var16 + var9 * (var9 * var15);
                      var21 = var16 * (var6 * -(1.0f + var19)) / var20_float;
                      param2.field_t = param2.field_t - var21 * vl.field_c.field_j;
                      param2.field_x = param2.field_x - var21 * vl.field_c.field_g;
                      param2.field_j = ln.a(-29407, var9) * 5.0f;
                      param2.a(param0 ^ 2, 100);
                      break L1;
                    }
                  }
                  L5: {
                    var20_float = var12 * var12 / var18 + (1.0f / var17 + 1.0f / var15 + var9 * var9 / var16);
                    var21 = 1.7999999523162842f * var6 / var20_float;
                    param2.field_x = param2.field_x + var21 / var15 * vl.field_c.field_g;
                    param2.field_t = param2.field_t + var21 / var15 * vl.field_c.field_j;
                    param1.field_t = param1.field_t - vl.field_c.field_j * (var21 / var17);
                    param1.field_x = param1.field_x - vl.field_c.field_g * (var21 / var17);
                    if ((param2.field_J ^ -1) == -3) {
                      param2.field_j = ln.a(-29407, var9) * 5.0f;
                      param2.a(param0 + 2, 100);
                      param1.field_j = 5.0f * ln.a(-29407, var12);
                      param1.a(2, 100);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  break L1;
                }
                L6: {
                  if ((param1.field_J ^ -1) == -3) {
                    param2.a(1.0f, param0 ^ 0, param1, 5);
                    break L6;
                  } else {
                    L7: {
                      stackOut_26_0 = (ja) (param2);
                      stackOut_26_1 = -var6;
                      stackOut_26_2 = 0;
                      stackOut_26_3 = (ja) (param1);
                      stackIn_31_0 = stackOut_26_0;
                      stackIn_31_1 = stackOut_26_1;
                      stackIn_31_2 = stackOut_26_2;
                      stackIn_31_3 = stackOut_26_3;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      if (var14 <= var13) {
                        stackOut_31_0 = (ja) ((Object) stackIn_31_0);
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = stackIn_31_2;
                        stackOut_31_3 = (ja) ((Object) stackIn_31_3);
                        stackOut_31_4 = 2;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        stackIn_32_3 = stackOut_31_3;
                        stackIn_32_4 = stackOut_31_4;
                        break L7;
                      } else {
                        stackOut_27_0 = (ja) ((Object) stackIn_27_0);
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = (ja) ((Object) stackIn_27_3);
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        stackIn_29_3 = stackOut_27_3;
                        stackOut_29_0 = (ja) ((Object) stackIn_29_0);
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = (ja) ((Object) stackIn_29_3);
                        stackOut_29_4 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        stackIn_32_3 = stackOut_29_3;
                        stackIn_32_4 = stackOut_29_4;
                        break L7;
                      }
                    }
                    ((ja) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4);
                    break L6;
                  }
                }
                L8: {
                  if (-3 == (param2.field_J ^ -1)) {
                    param1.a(1.0f, 0, param2, 5);
                    break L8;
                  } else {
                    L9: {
                      stackOut_36_0 = (ja) (param1);
                      stackOut_36_1 = -var6;
                      stackOut_36_2 = 0;
                      stackOut_36_3 = (ja) (param2);
                      stackIn_41_0 = stackOut_36_0;
                      stackIn_41_1 = stackOut_36_1;
                      stackIn_41_2 = stackOut_36_2;
                      stackIn_41_3 = stackOut_36_3;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      if (var13 > var14) {
                        stackOut_41_0 = (ja) ((Object) stackIn_41_0);
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = stackIn_41_2;
                        stackOut_41_3 = (ja) ((Object) stackIn_41_3);
                        stackOut_41_4 = 1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        stackIn_42_3 = stackOut_41_3;
                        stackIn_42_4 = stackOut_41_4;
                        break L9;
                      } else {
                        stackOut_37_0 = (ja) ((Object) stackIn_37_0);
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = (ja) ((Object) stackIn_37_3);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackOut_39_0 = (ja) ((Object) stackIn_39_0);
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = (ja) ((Object) stackIn_39_3);
                        stackOut_39_4 = 2;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        stackIn_42_3 = stackOut_39_3;
                        stackIn_42_4 = stackOut_39_4;
                        break L9;
                      }
                    }
                    ((ja) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4);
                    break L8;
                  }
                }
                L10: {
                  if (param2.field_cb < this.field_ab + -30) {
                    L11: {
                      L12: {
                        if (param2.field_J == 2) {
                          break L12;
                        } else {
                          if (0 >= param2.field_Fb[2]) {
                            stackOut_54_0 = sj.field_K;
                            stackIn_55_0 = stackOut_54_0;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      stackOut_52_0 = vn.field_h;
                      stackIn_55_0 = stackOut_52_0;
                      break L11;
                    }
                    var20 = stackIn_55_0;
                    discarded$2 = bd.a((byte) 20, param2, var20, var20.field_q);
                    param2.field_cb = this.field_ab;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L13: {
                  if (this.field_ab + -30 <= param1.field_cb) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if ((param1.field_J ^ -1) == -3) {
                          break L15;
                        } else {
                          if (-1 > (param1.field_Fb[2] ^ -1)) {
                            break L15;
                          } else {
                            stackOut_63_0 = sj.field_K;
                            stackIn_66_0 = stackOut_63_0;
                            break L14;
                          }
                        }
                      }
                      stackOut_65_0 = vn.field_h;
                      stackIn_66_0 = stackOut_65_0;
                      break L14;
                    }
                    var20 = stackIn_66_0;
                    discarded$3 = bd.a((byte) 63, param1, var20, var20.field_q);
                    param1.field_cb = this.field_ab;
                    break L13;
                  }
                }
                param2.a((byte) 103, param1);
                param1.a((byte) 68, param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var4);
            stackOut_69_1 = new StringBuilder().append("sg.KB(").append(param0).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L16;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L16;
            }
          }
          L17: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L17;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L17;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int fieldTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        ih var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_E) {
              if (-1 == (ti.field_z & 1 << param0 ^ -1)) {
                L1: {
                  fieldTemp$3 = this.field_fb;
                  this.field_fb = this.field_fb + 1;
                  this.field_V[fieldTemp$3] = param0;
                  ii.field_c = ii.field_c | 1 << param0;
                  var4_int = -19 / ((param2 - 36) / 62);
                  ti.field_z = ti.field_z | 1 << param0;
                  if (l.field_b) {
                    break L1;
                  } else {
                    var5 = new ih(param0, param1, this.field_l, this.field_N, this.field_p, this.field_H);
                    if (!pj.b((byte) 92)) {
                      na.a(4, var5, (byte) -79);
                      go.field_k = va.a((byte) -101, 4);
                      break L1;
                    } else {
                      fb.field_n.a((byte) -117, var5);
                      break L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new RuntimeException((String) null);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.LB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                var10 = param5;
                var11 = param1;
                var12 = param9;
                var13 = param3;
                var14 = param7;
                var15 = (16711422 & var10[var11]) >> 1763630113;
                var10[var11] = (pk.a(var13, 33423793) >> -132371767) + (pk.a(var12 >> -1960602399, 16711680) + ((pk.a(var14, 33439411) >> 1664297969) + var15));
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
            stackOut_9_0 = (RuntimeException) (var10_ref);
            stackOut_9_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final boolean d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 47) {
                break L1;
              } else {
                this.field_W = (ah) null;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.A(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final int d(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (-1 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (param1 >= 640) {
                    break L1;
                  } else {
                    if (480 > param0) {
                      stackOut_12_0 = this.field_lb.field_m[param1 + 640 * param0];
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (!b.a(false, param1, param0, this.field_nb)) {
              var4_int = 94 / ((12 - param2) / 42);
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L2: {
                if (!b.a(false, param1, param0, this.field_jb)) {
                  stackOut_20_0 = 8;
                  stackIn_21_0 = stackOut_20_0;
                  break L2;
                } else {
                  stackOut_18_0 = 12;
                  stackIn_21_0 = stackOut_18_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        wm var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            this.field_B = -1;
            this.field_k = 0;
            this.field_ab = 0;
            this.field_mb = 0;
            this.field_h = 0;
            this.field_z = 0;
            var2 = (wm) ((Object) this.field_cb.b((byte) 89));
            if (param0 == 4) {
              L1: while (true) {
                if (null == var2) {
                  this.field_S = true;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if ((var2.field_J & 512 ^ -1) == -1) {
                      break L2;
                    } else {
                      var2.d(param0 ^ 4);
                      break L2;
                    }
                  }
                  var2 = (wm) ((Object) this.field_cb.c((byte) 114));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "sg.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final qm a(ja param0, int param1) {
        hj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        qm var6 = null;
        qm var7 = null;
        qm stackIn_4_0 = null;
        qm stackIn_7_0 = null;
        qm stackIn_12_0 = null;
        qm stackIn_17_0 = null;
        qm stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qm stackOut_3_0 = null;
        qm stackOut_11_0 = null;
        qm stackOut_16_0 = null;
        qm stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        qm stackOut_6_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var3 = param0.field_C.field_v.a(param0.field_r, 27788);
            var4 = -(var3.field_s >> -425548255) + param0.field_A.field_h;
            var5 = param0.field_A.field_f - (var3.field_y >> -250545279);
            var6 = this.a(var5, var4, var3, -95, param0.field_q);
            if (var6 != null) {
              stackOut_3_0 = (qm) (var6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7 = new qm(0, param1);
              var7.field_h = (int)(-((float)param0.field_C.field_k * param0.field_w.field_g) + param0.field_y + (float)param0.field_C.field_K * param0.field_w.field_j);
              var7.field_f = (int)(param0.field_w.field_g * (float)param0.field_C.field_K + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
              if (this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
                var7.field_h = (int)(param0.field_w.field_g * (float)param0.field_C.field_k + param0.field_y + param0.field_w.field_j * (float)param0.field_C.field_K);
                var7.field_f = (int)((float)param0.field_C.field_K * param0.field_w.field_g + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
                if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
                  stackOut_11_0 = (qm) (var7);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7.field_h = (int)(-((float)param0.field_C.field_K * param0.field_w.field_j) + (-(param0.field_w.field_g * (float)param0.field_C.field_k) + param0.field_y));
                  var7.field_f = (int)(-((float)param0.field_C.field_K * param0.field_w.field_g) + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
                  if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
                    stackOut_16_0 = (qm) (var7);
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var7.field_h = (int)(param0.field_y + (float)param0.field_C.field_k * param0.field_w.field_g - param0.field_w.field_j * (float)param0.field_C.field_K);
                    var7.field_f = (int)(-(param0.field_w.field_g * (float)param0.field_C.field_K) + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
                    if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
                      stackOut_21_0 = (qm) (var7);
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = (qm) (var7);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3_ref);
            stackOut_25_1 = new StringBuilder().append("sg.JB(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L1;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return (qm) ((Object) stackIn_24_0);
                }
              }
            }
          }
        }
    }

    private final void a(wm param0, int param1) {
        hj discarded$1 = null;
        RuntimeException var3 = null;
        hj var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 >= 39) {
                break L1;
              } else {
                this.a(-16, (na) null);
                break L1;
              }
            }
            L2: {
              if ((8192 & param0.field_J ^ -1) == -1) {
                break L2;
              } else {
                if (!this.d((byte) 47)) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                  discarded$1 = param0.a((byte) -118);
                  if ((param0.field_J & 128 ^ -1) == -1) {
                    var3_ref.a(-(var6 >> 550611009) + param0.field_A.field_h, param0.field_A.field_f + -(var7 >> -414308063), var6, var7);
                    break L5;
                  } else {
                    var3_ref.b(-(var6 >> 992187585) + param0.field_A.field_h, -(var7 >> -644416543) + param0.field_A.field_f, var6, var7, this.field_C[param0.field_J & 3].field_Eb);
                    break L5;
                  }
                }
                ok.a(32381);
                this.field_I.f();
                var3_ref.c(param0.field_A.field_h - (var6 >> 748996961), param0.field_A.field_f - (var7 >> 956934433), var6, var7, 0);
                ug.b(-1);
                break L4;
              } else {
                L6: {
                  if ((param0.field_J & 128) != 0) {
                    var3_ref.c(-(var3_ref.field_o >> -456712127) + param0.field_A.field_h, param0.field_A.field_f + -(var3_ref.field_v >> 478405825), this.field_C[param0.field_J & 3].field_Eb);
                    break L6;
                  } else {
                    var3_ref.a(-(var3_ref.field_o >> 244112321) + param0.field_A.field_h, param0.field_A.field_f - (var3_ref.field_v >> 867639457));
                    break L6;
                  }
                }
                ok.a(32381);
                this.field_I.f();
                var3_ref.e(-(var3_ref.field_o >> 747219137) + param0.field_A.field_h, -(var3_ref.field_v >> -2099183967) + param0.field_A.field_f, 0);
                ug.b(-1);
                break L4;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("sg.VA(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("sg.KA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        float var17 = 0.0f;
        in var17_ref_in = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_102_0 = 0;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        in stackIn_104_2 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        in stackIn_106_2 = null;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        in stackIn_107_2 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        in stackIn_109_2 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        in stackIn_111_2 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        in stackIn_112_2 = null;
        int stackIn_112_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        in stackOut_103_2 = null;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        in stackOut_104_2 = null;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        in stackOut_106_2 = null;
        Object stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        in stackOut_107_2 = null;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        in stackOut_109_2 = null;
        int stackOut_109_3 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        in stackOut_111_2 = null;
        int stackOut_111_3 = 0;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -16) {
                break L1;
              } else {
                this.a((wm) null, 58);
                break L1;
              }
            }
            this.a((byte) -109);
            this.a(true);
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_h) {
                L3: {
                  if ((this.field_fb ^ -1) >= -1) {
                    break L3;
                  } else {
                    L4: {
                      var5 = 0;
                      if (50 > this.field_G) {
                        var6_float = (float)Math.exp(1.0);
                        var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)this.field_G)) - 1.0));
                        break L4;
                      } else {
                        if ((this.field_G ^ -1) >= -151) {
                          break L4;
                        } else {
                          var6_float = (float)Math.exp(0.04000000283122063);
                          var7 = -100 + (this.field_G + -50);
                          var5 = (int)((double)(640.0f / (-1.0f + var6_float)) * (1.0 - Math.exp((double)((float)var7 * 0.0020000000949949026f))));
                          break L4;
                        }
                      }
                    }
                    L5: {
                      var6 = this.field_V[0];
                      var7_ref_hj = ak.a(-40, false, var6);
                      var8 = nm.field_c.a(ae.field_c[var6]) + 48;
                      tc.f(3 + var5, 3, var8, 36, 0);
                      tc.a(var5 - -2, 2, var8 + 2, 38, 16777215);
                      var7_ref_hj.a(5 + var5, 5, 32, 32);
                      if ((var6 ^ -1) == -13) {
                        pe.a(32, 4209, 21 + var5, 21);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    nm.field_c.a(ae.field_c[var6], 48 + var5, 30, 0, -1);
                    break L3;
                  }
                }
                L6: {
                  if ((this.field_j ^ -1) < -1) {
                    L7: {
                      if (null == this.field_R) {
                        var5 = ho.field_j.a(this.field_ib[0]);
                        var6 = ho.field_j.field_F;
                        this.field_R = new hj(var5, var6);
                        vb.a(-121, this.field_R);
                        ho.field_j.a(this.field_ib[0], 0, ho.field_j.field_G, 0, -1);
                        ug.b(param0 + 15);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var5 = 4096 - (this.field_s << 852708332) / 50;
                    var6 = var5 * this.field_R.field_s >> 1133944204;
                    var7 = this.field_R.field_y * var5 >> -1674917716;
                    this.field_R.a(640 + -var6 >> 1294596897, 480 - var7 >> -1895525951, var6, var7);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                break L0;
              } else {
                var5_ref_ja = this.field_C[var4];
                var6 = 0;
                var7_ref_wm = (wm) ((Object) this.field_cb.b((byte) 102));
                L8: while (true) {
                  L9: {
                    if (var7_ref_wm == null) {
                      break L9;
                    } else {
                      L10: {
                        if ((var5_ref_ja.field_q ^ -1) <= (var7_ref_wm.field_q ^ -1)) {
                          break L10;
                        } else {
                          if (!var7_ref_wm.a(2048, var5_ref_ja.field_A)) {
                            break L10;
                          } else {
                            var6 = 1;
                            break L9;
                          }
                        }
                      }
                      var7_ref_wm = (wm) ((Object) this.field_cb.c((byte) 90));
                      continue L8;
                    }
                  }
                  L11: {
                    if (var6 != 0) {
                      break L11;
                    } else {
                      var7_ref_wm = (wm) ((Object) this.field_d.b((byte) 107));
                      L12: while (true) {
                        if (var7_ref_wm == null) {
                          break L11;
                        } else {
                          L13: {
                            if (var7_ref_wm.field_q <= var5_ref_ja.field_q) {
                              break L13;
                            } else {
                              if (!var7_ref_wm.a(2048, var5_ref_ja.field_A)) {
                                break L13;
                              } else {
                                var6 = 1;
                                break L11;
                              }
                            }
                          }
                          var7_ref_wm = (wm) ((Object) this.field_d.c((byte) -63));
                          continue L12;
                        }
                      }
                    }
                  }
                  L14: {
                    if (-265 <= (var5_ref_ja.field_A.field_h ^ -1)) {
                      break L14;
                    } else {
                      if ((var5_ref_ja.field_A.field_h ^ -1) <= -395) {
                        break L14;
                      } else {
                        if ((var5_ref_ja.field_A.field_f ^ -1) > -41) {
                          var6 = 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    if (2 != this.field_J) {
                      L16: {
                        if (-65 >= (var5_ref_ja.field_A.field_h ^ -1)) {
                          stackOut_54_0 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          break L16;
                        } else {
                          stackOut_52_0 = 1;
                          stackIn_55_0 = stackOut_52_0;
                          break L16;
                        }
                      }
                      L17: {
                        var8 = stackIn_55_0;
                        if (var5_ref_ja.field_A.field_h <= 576) {
                          stackOut_58_0 = 0;
                          stackIn_59_0 = stackOut_58_0;
                          break L17;
                        } else {
                          stackOut_56_0 = 1;
                          stackIn_59_0 = stackOut_56_0;
                          break L17;
                        }
                      }
                      var9 = stackIn_59_0;
                      break L15;
                    } else {
                      L18: {
                        if (480 >= var5_ref_ja.field_A.field_h) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L18;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_44_0 = stackOut_41_0;
                          break L18;
                        }
                      }
                      L19: {
                        var9 = stackIn_44_0;
                        if (160 <= var5_ref_ja.field_A.field_h) {
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L19;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_48_0 = stackOut_45_0;
                          break L19;
                        }
                      }
                      var8 = stackIn_48_0;
                      break L15;
                    }
                  }
                  L20: {
                    if (64 <= var5_ref_ja.field_A.field_f) {
                      stackOut_63_0 = 0;
                      stackIn_64_0 = stackOut_63_0;
                      break L20;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_64_0 = stackOut_61_0;
                      break L20;
                    }
                  }
                  L21: {
                    var10 = stackIn_64_0;
                    if ((var5_ref_ja.field_A.field_f ^ -1) >= -417) {
                      stackOut_67_0 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      break L21;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_68_0 = stackOut_65_0;
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      var11 = stackIn_68_0;
                      if (var8 != 0) {
                        break L23;
                      } else {
                        if (var9 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var10 != 0) {
                        break L24;
                      } else {
                        if (var11 == 0) {
                          break L22;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      var12 = 0;
                      if (var11 != 0) {
                        var12 += 2;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var9 == 0) {
                        break L26;
                      } else {
                        var12++;
                        break L26;
                      }
                    }
                    if (this.field_h > var12) {
                      var6 = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L27: {
                    L28: {
                      if (0 >= this.field_ab) {
                        break L28;
                      } else {
                        if (var5_ref_ja.field_W == null) {
                          break L28;
                        } else {
                          if (-51 <= (var5_ref_ja.field_tb ^ -1)) {
                            break L28;
                          } else {
                            if (0 != var5_ref_ja.field_O) {
                              break L28;
                            } else {
                              stackOut_99_0 = 1;
                              stackIn_102_0 = stackOut_99_0;
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    stackOut_101_0 = 0;
                    stackIn_102_0 = stackOut_101_0;
                    break L27;
                  }
                  L29: {
                    var12 = stackIn_102_0;
                    if (var6 == 0) {
                      break L29;
                    } else {
                      L30: {
                        L31: {
                          stackOut_103_0 = this;
                          stackOut_103_1 = -72;
                          stackOut_103_2 = var5_ref_ja.field_w;
                          stackIn_111_0 = stackOut_103_0;
                          stackIn_111_1 = stackOut_103_1;
                          stackIn_111_2 = stackOut_103_2;
                          stackIn_104_0 = stackOut_103_0;
                          stackIn_104_1 = stackOut_103_1;
                          stackIn_104_2 = stackOut_103_2;
                          if (var12 == 0) {
                            break L31;
                          } else {
                            stackOut_104_0 = this;
                            stackOut_104_1 = stackIn_104_1;
                            stackOut_104_2 = (in) ((Object) stackIn_104_2);
                            stackIn_106_0 = stackOut_104_0;
                            stackIn_106_1 = stackOut_104_1;
                            stackIn_106_2 = stackOut_104_2;
                            stackOut_106_0 = this;
                            stackOut_106_1 = stackIn_106_1;
                            stackOut_106_2 = (in) ((Object) stackIn_106_2);
                            stackIn_111_0 = stackOut_106_0;
                            stackIn_111_1 = stackOut_106_1;
                            stackIn_111_2 = stackOut_106_2;
                            stackIn_107_0 = stackOut_106_0;
                            stackIn_107_1 = stackOut_106_1;
                            stackIn_107_2 = stackOut_106_2;
                            if (this.field_bb / 10 % 2 != 0) {
                              break L31;
                            } else {
                              stackOut_107_0 = this;
                              stackOut_107_1 = stackIn_107_1;
                              stackOut_107_2 = (in) ((Object) stackIn_107_2);
                              stackIn_109_0 = stackOut_107_0;
                              stackIn_109_1 = stackOut_107_1;
                              stackIn_109_2 = stackOut_107_2;
                              stackOut_109_0 = this;
                              stackOut_109_1 = stackIn_109_1;
                              stackOut_109_2 = (in) ((Object) stackIn_109_2);
                              stackOut_109_3 = 16777215;
                              stackIn_112_0 = stackOut_109_0;
                              stackIn_112_1 = stackOut_109_1;
                              stackIn_112_2 = stackOut_109_2;
                              stackIn_112_3 = stackOut_109_3;
                              break L30;
                            }
                          }
                        }
                        stackOut_111_0 = this;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = (in) ((Object) stackIn_111_2);
                        stackOut_111_3 = var5_ref_ja.field_Eb;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        break L30;
                      }
                      this.a((byte) stackIn_112_1, stackIn_112_2, stackIn_112_3, var5_ref_ja.field_A.field_h, var5_ref_ja.field_A.field_f);
                      break L29;
                    }
                  }
                  L32: {
                    if (this.field_bb % 20 >= 10) {
                      break L32;
                    } else {
                      if (null == var5_ref_ja.field_W) {
                        break L32;
                      } else {
                        if (var5_ref_ja.field_Lb <= 50) {
                          break L32;
                        } else {
                          if ((this.field_J ^ -1) == -3) {
                            break L32;
                          } else {
                            L33: {
                              var13 = (int)var5_ref_ja.field_Ib;
                              var14 = (float)(-var13) + var5_ref_ja.field_Ib;
                              if (0.0f != var14) {
                                break L33;
                              } else {
                                if ((var13 ^ -1) != (this.field_sb.length ^ -1)) {
                                  break L33;
                                } else {
                                  var13--;
                                  var14 = 1.0f;
                                  break L33;
                                }
                              }
                            }
                            var15_ref_wd = this.field_sb[var13];
                            var16_ref_qm = var15_ref_wd.a(false, var14);
                            var17_ref_in = var15_ref_wd.a((byte) 120, var14);
                            var18 = var5_ref_ja.field_Eb;
                            this.a((byte) 13, var17_ref_in, var18, var16_ref_qm.field_h, var16_ref_qm.field_f);
                            break L32;
                          }
                        }
                      }
                    }
                  }
                  var13 = var5_ref_ja.field_Fb[2] + var5_ref_ja.field_Fb[0] + (var5_ref_ja.field_Fb[1] - -var5_ref_ja.field_Fb[3]);
                  var14 = 0.0f;
                  var15 = 0;
                  L34: while (true) {
                    if (-4 >= (var15 ^ -1)) {
                      L35: {
                        if ((var5_ref_ja.field_ob ^ -1) < -26) {
                          break L35;
                        } else {
                          if (0 < this.field_ab) {
                            pd.a(hk.field_a[20 - -var5_ref_ja.field_R], param0 + -12, var5_ref_ja.field_A.field_f - 15, -25 + var5_ref_ja.field_A.field_h, 200 - (var5_ref_ja.field_ob * 8 - 512), 16777215);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      L36: {
                        var16 = 0;
                        if (var5_ref_ja.field_hc[var15] != -1) {
                          L37: {
                            if ((var5_ref_ja.field_hc[var15] ^ -1) == -1) {
                              var16 = 16711680;
                              break L37;
                            } else {
                              if (-2 != (var5_ref_ja.field_hc[var15] ^ -1)) {
                                if (-3 != (var5_ref_ja.field_hc[var15] ^ -1)) {
                                  break L37;
                                } else {
                                  var16 = 255;
                                  break L37;
                                }
                              } else {
                                var16 = 65280;
                                break L37;
                              }
                            }
                          }
                          var17 = 3.1415927410125732f * (2.0f * (float)(this.field_bb % 100)) / 100.0f + var14;
                          var2_int = var5_ref_ja.field_A.field_h + (int)((double)var5_ref_ja.field_B * Math.cos((double)var17));
                          var14 = var14 + 6.2831854820251465f / (float)var13;
                          var3 = var5_ref_ja.field_A.field_f - (int)((double)var5_ref_ja.field_B * Math.sin((double)var17));
                          tc.d(var2_int, var3, 3, var16);
                          var16 = var16 >> -80742367 & 8355711;
                          tc.c(var2_int, var3, 3, var16);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      var15++;
                      continue L34;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.FB(" + param0 + ')');
        }
    }

    private final void a(cg param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        wm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ja stackIn_124_0 = null;
        ja stackIn_126_0 = null;
        ja stackIn_128_0 = null;
        ja stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        Object stackIn_167_0 = null;
        Object stackIn_169_0 = null;
        Object stackIn_171_0 = null;
        Object stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_166_0 = null;
        Object stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        Object stackOut_167_0 = null;
        Object stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        ja stackOut_123_0 = null;
        ja stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        ja stackOut_124_0 = null;
        ja stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        String stackOut_180_2 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 != param0.field_c) {
                if ((param0.field_c ^ -1) == -2) {
                  L2: {
                    stackOut_166_0 = this;
                    stackIn_171_0 = stackOut_166_0;
                    stackIn_167_0 = stackOut_166_0;
                    if ((param0.field_d ^ -1) != 0) {
                      stackOut_171_0 = this;
                      stackOut_171_1 = 0;
                      stackIn_172_0 = stackOut_171_0;
                      stackIn_172_1 = stackOut_171_1;
                      break L2;
                    } else {
                      stackOut_167_0 = this;
                      stackIn_169_0 = stackOut_167_0;
                      stackOut_169_0 = this;
                      stackOut_169_1 = 1;
                      stackIn_172_0 = stackOut_169_0;
                      stackIn_172_1 = stackOut_169_1;
                      break L2;
                    }
                  }
                  ((sg) (this)).field_S = stackIn_172_1 != 0;
                  break L1;
                } else {
                  if (param0.field_c != 6) {
                    if (-3 != (param0.field_c ^ -1)) {
                      if (3 == param0.field_c) {
                        this.a(param0.field_d, -1, param0.field_h);
                        break L1;
                      } else {
                        if (-5 == (param0.field_c ^ -1)) {
                          this.b(24936, param0.field_h, param0.field_d);
                          break L1;
                        } else {
                          if (param0.field_c != 5) {
                            if (-8 != (param0.field_c ^ -1)) {
                              if ((param0.field_c ^ -1) == -9) {
                                this.field_C[param0.field_d].field_bc = param0.field_h;
                                break L1;
                              } else {
                                if (-10 != (param0.field_c ^ -1)) {
                                  if (10 == param0.field_c) {
                                    this.field_z = param0.field_d;
                                    this.field_h = param0.field_d;
                                    var3_int = 0;
                                    L3: while (true) {
                                      if (var3_int >= this.field_h) {
                                        break L1;
                                      } else {
                                        this.field_C[var3_int].l(554646678);
                                        var3_int++;
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    if (-12 != (param0.field_c ^ -1)) {
                                      if ((param0.field_c ^ -1) != -13) {
                                        if (-14 == (param0.field_c ^ -1)) {
                                          this.field_mb = -1;
                                          qn.a(7, false, false);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        this.field_S = false;
                                        this.field_mb = -1;
                                        break L1;
                                      }
                                    } else {
                                      this.field_B = param0.field_d;
                                      this.field_U = false;
                                      this.field_ob = -1;
                                      break L1;
                                    }
                                  }
                                } else {
                                  L4: {
                                    stackOut_123_0 = this.field_C[param0.field_d];
                                    stackIn_128_0 = stackOut_123_0;
                                    stackIn_124_0 = stackOut_123_0;
                                    if (param0.field_h == 0) {
                                      stackOut_128_0 = (ja) ((Object) stackIn_128_0);
                                      stackOut_128_1 = 0;
                                      stackIn_129_0 = stackOut_128_0;
                                      stackIn_129_1 = stackOut_128_1;
                                      break L4;
                                    } else {
                                      stackOut_124_0 = (ja) ((Object) stackIn_124_0);
                                      stackIn_126_0 = stackOut_124_0;
                                      stackOut_126_0 = (ja) ((Object) stackIn_126_0);
                                      stackOut_126_1 = 1;
                                      stackIn_129_0 = stackOut_126_0;
                                      stackIn_129_1 = stackOut_126_1;
                                      break L4;
                                    }
                                  }
                                  stackIn_129_0.field_jb = stackIn_129_1 != 0;
                                  this.field_C[param0.field_d].field_M = param0.field_h;
                                  break L1;
                                }
                              }
                            } else {
                              var3_int = 0;
                              L5: while (true) {
                                if ((var3_int ^ -1) <= -5) {
                                  L6: {
                                    this.field_C[param0.field_d].field_hc[0] = param0.field_h;
                                    this.field_C[param0.field_d].field_hc[1] = param0.field_e;
                                    this.field_C[param0.field_d].field_hc[2] = param0.field_k;
                                    if (param0.field_h == -1) {
                                      break L6;
                                    } else {
                                      this.field_C[param0.field_d].field_Fb[param0.field_h] = this.field_C[param0.field_d].field_Fb[param0.field_h] + 1;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (param0.field_e == -1) {
                                      break L7;
                                    } else {
                                      this.field_C[param0.field_d].field_Fb[param0.field_e] = this.field_C[param0.field_d].field_Fb[param0.field_e] + 1;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (-1 == param0.field_k) {
                                      break L8;
                                    } else {
                                      this.field_C[param0.field_d].field_Fb[param0.field_k] = this.field_C[param0.field_d].field_Fb[param0.field_k] + 1;
                                      break L8;
                                    }
                                  }
                                  break L1;
                                } else {
                                  this.field_C[param0.field_d].field_Fb[var3_int] = 0;
                                  var3_int++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (-107 != param0.field_d) {
                              var3_ref = (wm) ((Object) this.field_cb.b((byte) 106));
                              L9: while (true) {
                                if (null == var3_ref) {
                                  break L1;
                                } else {
                                  L10: {
                                    if (0 != (var3_ref.field_J & 512)) {
                                      L11: {
                                        if (105 == (param0.field_d ^ -1)) {
                                          break L11;
                                        } else {
                                          if ((var3_ref.field_J & 3) != param0.field_d) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      var3_ref.d(0);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var3_ref = (wm) ((Object) this.field_cb.c((byte) -52));
                                  continue L9;
                                }
                              }
                            } else {
                              if ((param0.field_h ^ -1) == 105) {
                                var4 = 0;
                                L12: while (true) {
                                  if ((this.field_h ^ -1) >= (var4 ^ -1)) {
                                    break L1;
                                  } else {
                                    var3_int = 0;
                                    L13: while (true) {
                                      if ((var3_int ^ -1) <= -5) {
                                        var3_int = 0;
                                        L14: while (true) {
                                          if (-4 >= (var3_int ^ -1)) {
                                            this.field_C[var4].field_J = -1;
                                            var4++;
                                            continue L12;
                                          } else {
                                            this.field_C[var4].field_hc[var3_int] = -1;
                                            var3_int++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        this.field_C[var4].field_Fb[var3_int] = 0;
                                        var3_int++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_int = 0;
                                L15: while (true) {
                                  if ((var3_int ^ -1) <= -5) {
                                    var3_int = 0;
                                    L16: while (true) {
                                      if (3 <= var3_int) {
                                        this.field_C[param0.field_h].field_J = -1;
                                        break L1;
                                      } else {
                                        this.field_C[param0.field_h].field_hc[var3_int] = -1;
                                        var3_int++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    this.field_C[param0.field_h].field_Fb[var3_int] = 0;
                                    var3_int++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (-114 == param0.field_d) {
                        this.field_tb = 255;
                        break L1;
                      } else {
                        this.field_D = param0.field_d;
                        if (-101 == param0.field_d) {
                          this.field_tb = 0;
                          break L1;
                        } else {
                          this.field_tb = 256;
                          break L1;
                        }
                      }
                    }
                  } else {
                    if ((param0.field_d ^ -1) == 0) {
                      this.field_o = this.field_o | 4;
                      break L1;
                    } else {
                      this.field_o = this.field_o & -5;
                      break L1;
                    }
                  }
                }
              } else {
                var3_int = this.field_h;
                this.field_z = 1 + param0.field_d;
                this.field_h = 1 + param0.field_d;
                var4 = var3_int;
                L17: while (true) {
                  if (var4 >= this.field_h) {
                    break L1;
                  } else {
                    this.field_C[var4].l(554646678);
                    var4++;
                    continue L17;
                  }
                }
              }
            }
            L18: {
              if (param1 < -88) {
                break L18;
              } else {
                this.b(-43);
                break L18;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_177_0 = (RuntimeException) (var3);
            stackOut_177_1 = new StringBuilder().append("sg.AA(");
            stackIn_180_0 = stackOut_177_0;
            stackIn_180_1 = stackOut_177_1;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            if (param0 == null) {
              stackOut_180_0 = (RuntimeException) ((Object) stackIn_180_0);
              stackOut_180_1 = (StringBuilder) ((Object) stackIn_180_1);
              stackOut_180_2 = "null";
              stackIn_181_0 = stackOut_180_0;
              stackIn_181_1 = stackOut_180_1;
              stackIn_181_2 = stackOut_180_2;
              break L19;
            } else {
              stackOut_178_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackOut_178_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackOut_178_2 = "{...}";
              stackIn_181_0 = stackOut_178_0;
              stackIn_181_1 = stackOut_178_1;
              stackIn_181_2 = stackOut_178_2;
              break L19;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_181_0), stackIn_181_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        ji var2_ref = null;
        int var2_int = 0;
        ul var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var5_int = 0;
        ji var6 = null;
        wm var6_ref = null;
        ja var6_ref2 = null;
        int var6_int = 0;
        ul var7 = null;
        ja var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_81_0 = 0;
        ul stackIn_94_0 = null;
        ul stackIn_114_0 = null;
        ul stackIn_126_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        ul stackOut_93_0 = null;
        ul stackOut_91_0 = null;
        ul stackOut_113_0 = null;
        ul stackOut_111_0 = null;
        ul stackOut_125_0 = null;
        ul stackOut_123_0 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (this.field_D == -101) {
                break L1;
              } else {
                L2: {
                  var2_int = this.field_bb % 60;
                  stackOut_2_0 = 10;
                  stackIn_5_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if ((var2_int ^ -1) < -31) {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 60 - var2_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = var2_int;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_6_1 = stackOut_3_1;
                    break L2;
                  }
                }
                L3: {
                  var3_int = stackIn_6_0 + stackIn_6_1 / 2;
                  var4_int = (30 + this.field_bb) % 60;
                  stackOut_6_0 = 10;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4_int <= 30) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = var4_int;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L3;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = -var4_int + 60;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    break L3;
                  }
                }
                L4: {
                  var5_int = stackIn_10_0 + stackIn_10_1 / 2;
                  if (-101 >= this.field_D) {
                    break L4;
                  } else {
                    if (15 > this.field_bb % 30) {
                      L5: {
                        if ((this.field_D ^ -1) <= -1) {
                          stackOut_80_0 = this.field_D;
                          stackIn_81_0 = stackOut_80_0;
                          break L5;
                        } else {
                          stackOut_78_0 = this.field_sb.length - -this.field_D;
                          stackIn_81_0 = stackOut_78_0;
                          break L5;
                        }
                      }
                      var6_int = stackIn_81_0;
                      jb.a(this.field_sb, var6_int, false, 115, bn.field_l, var6_int + 1);
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-106 <= this.field_D) {
                  var6_ref = (wm) ((Object) this.field_cb.b((byte) 116));
                  L6: while (true) {
                    if (null == var6_ref) {
                      break L1;
                    } else {
                      L7: {
                        if (0 == (512 & var6_ref.field_J)) {
                          break L7;
                        } else {
                          L8: {
                            if (-106 == this.field_D) {
                              break L8;
                            } else {
                              if (-this.field_D + -102 == (3 & var6_ref.field_J)) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          oc.a(var3_int, var6_ref.field_A.field_f, var6_ref.field_A.field_h, 16777087, (byte) 109, this.field_tb);
                          oc.a(var5_int, var6_ref.field_A.field_f, var6_ref.field_A.field_h, 16777087, (byte) 93, this.field_tb);
                          break L7;
                        }
                      }
                      var6_ref = (wm) ((Object) this.field_cb.c((byte) -61));
                      continue L6;
                    }
                  }
                } else {
                  if (-111 < this.field_D) {
                    var6_ref2 = this.field_C[-107 + -this.field_D];
                    oc.a(var3_int, var6_ref2.field_A.field_f, var6_ref2.field_A.field_h, 16777087, (byte) -102, this.field_tb);
                    oc.a(var5_int, var6_ref2.field_A.field_f, var6_ref2.field_A.field_h, 16777087, (byte) 108, this.field_tb);
                    break L1;
                  } else {
                    if ((this.field_D ^ -1) == 110) {
                      var6_int = 0;
                      L9: while (true) {
                        if (var6_int >= this.field_h) {
                          break L1;
                        } else {
                          var7_ref = this.field_C[var6_int];
                          oc.a(var3_int, var7_ref.field_A.field_f, var7_ref.field_A.field_h, 16777087, (byte) -95, this.field_tb);
                          oc.a(var5_int, var7_ref.field_A.field_f, var7_ref.field_A.field_h, 16777087, (byte) -92, this.field_tb);
                          var6_int++;
                          continue L9;
                        }
                      }
                    } else {
                      if (this.field_D < -113) {
                        break L1;
                      } else {
                        var6_ref = (wm) ((Object) this.field_cb.b((byte) 114));
                        L10: while (true) {
                          if (var6_ref == null) {
                            break L1;
                          } else {
                            stackOut_28_0 = 0;
                            stackOut_28_1 = var6_ref.field_J & 32768;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            L11: {
                              if (stackIn_30_0 == stackIn_30_1) {
                                break L11;
                              } else {
                                L12: {
                                  L13: {
                                    if (this.field_D != -112) {
                                      break L13;
                                    } else {
                                      if ((var6_ref.field_J & 3 ^ -1) == -1) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if ((this.field_D ^ -1) != 112) {
                                    break L11;
                                  } else {
                                    if ((3 & var6_ref.field_J) == 1) {
                                      break L12;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var7_int = 0;
                                L14: while (true) {
                                  if ((var7_int ^ -1) <= -3) {
                                    break L11;
                                  } else {
                                    L15: {
                                      if ((var7_int ^ -1) == -1) {
                                        stackOut_48_0 = var3_int;
                                        stackIn_49_0 = stackOut_48_0;
                                        break L15;
                                      } else {
                                        stackOut_46_0 = var5_int;
                                        stackIn_49_0 = stackOut_46_0;
                                        break L15;
                                      }
                                    }
                                    var8 = stackIn_49_0;
                                    tc.e(var6_ref.field_A.field_h - -(int)(var6_ref.field_w.field_j * (float)(var6_ref.field_k - -var8) + var6_ref.field_w.field_g * (float)(var8 + var6_ref.field_i)), var6_ref.field_A.field_f + (int)((float)(var6_ref.field_k - -var8) * var6_ref.field_w.field_g - var6_ref.field_w.field_j * (float)(var6_ref.field_i + var8)), (int)(var6_ref.field_w.field_j * (float)(var8 + var6_ref.field_k) - var6_ref.field_w.field_g * (float)(var6_ref.field_i + var8)) + var6_ref.field_A.field_h, (int)((float)(var8 + var6_ref.field_i) * var6_ref.field_w.field_j + (float)(var8 + var6_ref.field_k) * var6_ref.field_w.field_g) + var6_ref.field_A.field_f, 16777087, this.field_tb);
                                    tc.e(var6_ref.field_A.field_h - -(int)(var6_ref.field_w.field_j * (float)(var8 + var6_ref.field_k) - (float)(var8 + var6_ref.field_i) * var6_ref.field_w.field_g), var6_ref.field_A.field_f - -(int)((float)(var6_ref.field_k - -var8) * var6_ref.field_w.field_g + (float)(var6_ref.field_i + var8) * var6_ref.field_w.field_j), var6_ref.field_A.field_h + (int)((float)(var6_ref.field_k - -var8) * -var6_ref.field_w.field_j - (float)(var6_ref.field_i + var8) * var6_ref.field_w.field_g), var6_ref.field_A.field_f - -(int)(-var6_ref.field_w.field_g * (float)(var6_ref.field_k + var8) + var6_ref.field_w.field_j * (float)(var8 + var6_ref.field_i)), 16777087, this.field_tb);
                                    tc.e((int)(-(var6_ref.field_w.field_g * (float)(var6_ref.field_i + var8)) + (float)(var6_ref.field_k + var8) * -var6_ref.field_w.field_j) + var6_ref.field_A.field_h, (int)(-var6_ref.field_w.field_g * (float)(var6_ref.field_k - -var8) + (float)(var8 + var6_ref.field_i) * var6_ref.field_w.field_j) + var6_ref.field_A.field_f, var6_ref.field_A.field_h - -(int)(var6_ref.field_w.field_g * (float)(var8 + var6_ref.field_i) + (float)(var6_ref.field_k - -var8) * -var6_ref.field_w.field_j), var6_ref.field_A.field_f + (int)(-var6_ref.field_w.field_g * (float)(var8 + var6_ref.field_k) - var6_ref.field_w.field_j * (float)(var6_ref.field_i + var8)), 16777087, this.field_tb);
                                    tc.e((int)(var6_ref.field_w.field_g * (float)(var6_ref.field_i - -var8) + -var6_ref.field_w.field_j * (float)(var6_ref.field_k + var8)) + var6_ref.field_A.field_h, var6_ref.field_A.field_f - -(int)(-((float)(var8 + var6_ref.field_i) * var6_ref.field_w.field_j) + -var6_ref.field_w.field_g * (float)(var8 + var6_ref.field_k)), var6_ref.field_A.field_h + (int)(var6_ref.field_w.field_j * (float)(var8 + var6_ref.field_k) + (float)(var8 + var6_ref.field_i) * var6_ref.field_w.field_g), (int)((float)(var8 + var6_ref.field_k) * var6_ref.field_w.field_g - var6_ref.field_w.field_j * (float)(var6_ref.field_i + var8)) + var6_ref.field_A.field_f, 16777087, this.field_tb);
                                    var7_int++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                            var6_ref = (wm) ((Object) this.field_cb.c((byte) -84));
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var2_ref = mm.field_a[this.field_mb];
            if (param0 == -3) {
              L16: {
                L17: {
                  if (null == var2_ref.field_j) {
                    break L17;
                  } else {
                    if (var2_ref.field_g == null) {
                      break L17;
                    } else {
                      L18: {
                        if (this.field_n != 1) {
                          stackOut_93_0 = var2_ref.field_j;
                          stackIn_94_0 = stackOut_93_0;
                          break L18;
                        } else {
                          stackOut_91_0 = var2_ref.field_g;
                          stackIn_94_0 = stackOut_91_0;
                          break L18;
                        }
                      }
                      var3 = stackIn_94_0;
                      var4_int = 0;
                      L19: while (true) {
                        if (-3 >= (var4_int ^ -1)) {
                          break L16;
                        } else {
                          L20: {
                            if ((var3.field_f + -30 ^ -1) <= (this.field_C[0].field_A.field_h ^ -1)) {
                              break L20;
                            } else {
                              if (var3.field_f + var3.field_d - -30 <= this.field_C[0].field_A.field_h) {
                                break L20;
                              } else {
                                if (var3.field_c + -30 >= this.field_C[0].field_A.field_f) {
                                  break L20;
                                } else {
                                  if (var3.field_c + var3.field_g - -30 > this.field_C[0].field_A.field_f) {
                                    L21: {
                                      this.field_n = 1 + -this.field_n;
                                      if ((this.field_n ^ -1) == -2) {
                                        stackOut_113_0 = var2_ref.field_g;
                                        stackIn_114_0 = stackOut_113_0;
                                        break L21;
                                      } else {
                                        stackOut_111_0 = var2_ref.field_j;
                                        stackIn_114_0 = stackOut_111_0;
                                        break L21;
                                      }
                                    }
                                    var3 = stackIn_114_0;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                          var4_int++;
                          continue L19;
                        }
                      }
                    }
                  }
                }
                var3 = var2_ref.field_j;
                break L16;
              }
              L22: {
                if ((this.field_a ^ -1) == (this.field_mb ^ -1)) {
                  if (null != var3) {
                    this.a(var2_ref.field_h, 0.0f, -11240, var3, var2_ref.field_f);
                    break L22;
                  } else {
                    break L22;
                  }
                } else {
                  L23: {
                    var4 = (float)Math.exp((double)(-0.20000000298023224f * (float)this.field_k));
                    var5 = -var4 + 1.0f;
                    if (-1 != this.field_a) {
                      L24: {
                        var6 = mm.field_a[this.field_a];
                        if (-2 == (this.field_n ^ -1)) {
                          stackOut_125_0 = var6.field_g;
                          stackIn_126_0 = stackOut_125_0;
                          break L24;
                        } else {
                          stackOut_123_0 = var6.field_j;
                          stackIn_126_0 = stackOut_123_0;
                          break L24;
                        }
                      }
                      var7 = stackIn_126_0;
                      if (var7 == null) {
                        break L23;
                      } else {
                        this.a(var6.field_h, var5, param0 + -11237, var7, var6.field_f);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L25: {
                    if (var3 == null) {
                      break L25;
                    } else {
                      this.a(var2_ref.field_h, var4, param0 ^ 11237, var3, var2_ref.field_f);
                      break L25;
                    }
                  }
                  break L22;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
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
        int stackIn_63_0 = 0;
        int stackIn_135_0 = 0;
        ja stackIn_185_0 = null;
        Object stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        Object stackIn_198_0 = null;
        StringBuilder stackIn_198_1 = null;
        Object stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        String stackIn_199_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_129_0 = 0;
        Object stackOut_184_0 = null;
        ja stackOut_182_0 = null;
        Object stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        Object stackOut_198_0 = null;
        StringBuilder stackOut_198_1 = null;
        String stackOut_198_2 = null;
        Object stackOut_196_0 = null;
        StringBuilder stackOut_196_1 = null;
        String stackOut_196_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ch.a(9);
              this.field_J = param2;
              this.field_kb = false;
              this.field_E = param6;
              this.field_I = new hj(640, 480);
              this.c((byte) -69);
              this.field_U = false;
              this.field_B = 8;
              this.field_b = false;
              if (param3 >= 3) {
                break L1;
              } else {
                this.field_I = (hj) null;
                break L1;
              }
            }
            L2: {
              this.field_C = new ja[64];
              this.field_P = 0;
              this.field_bb = 0;
              this.field_S = false;
              this.field_ab = -150;
              var8 = null;
              if (-1 != (this.field_J ^ -1)) {
                break L2;
              } else {
                if ((mi.field_d ^ -1) == -8) {
                  var8 = new int[4];
                  var9_int = 0;
                  L3: while (true) {
                    if (var9_int >= 4) {
                      break L2;
                    } else {
                      L4: {
                        if ((var9_int ^ -1) <= (dk.field_g ^ -1)) {
                          if ((var9_int ^ -1) < (dk.field_g ^ -1)) {
                            ((int[]) (var8))[var9_int] = -var9_int + 4;
                            break L4;
                          } else {
                            ((int[]) (var8))[var9_int] = 0;
                            break L4;
                          }
                        } else {
                          ((int[]) (var8))[var9_int] = 3 + -var9_int;
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
              this.a((byte) 7, (int[]) (var8), param5);
              if (!kb.a(16616, 0)) {
                break L5;
              } else {
                if (2 == this.field_J) {
                  ih.field_n = new ah();
                  var9_int = 0;
                  L6: while (true) {
                    if (var9_int >= 200) {
                      break L5;
                    } else {
                      var10_ref_vf = new vf();
                      ih.field_n.a((byte) -94, var10_ref_vf);
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
              this.field_V = new int[16];
              this.field_rb = new int[16];
              this.field_rb[6] = -1;
              this.field_t = nj.field_d;
              this.field_j = 0;
              this.field_g = tn.field_c;
              this.field_hb = ni.field_b;
              this.field_s = 0;
              this.field_rb[11] = 1;
              if ((this.field_r ^ -1) == -1) {
                this.field_l = 723448452;
                this.field_H = -1816277944;
                this.field_N = -127488232;
                this.field_p = -1996410128;
                break L7;
              } else {
                if (-2 == (this.field_r ^ -1)) {
                  this.field_N = -1947303144;
                  this.field_p = 2016652736;
                  this.field_l = -1138652621;
                  this.field_H = -1816269752;
                  break L7;
                } else {
                  if (-3 == (this.field_r ^ -1)) {
                    this.field_N = 1627384728;
                    this.field_p = -81247984;
                    this.field_H = -2084713400;
                    this.field_l = 1752551195;
                    break L7;
                  } else {
                    this.field_H = -2084705208;
                    this.field_N = 1884993344;
                    this.field_p = 1744876195;
                    this.field_l = 674154881;
                    break L7;
                  }
                }
              }
            }
            L8: {
              this.field_G = 0;
              this.field_y = cm.field_a;
              this.field_rb[7] = -1;
              if (!param0) {
                break L8;
              } else {
                L9: {
                  if (this.field_E) {
                    stackOut_62_0 = 2;
                    stackIn_63_0 = stackOut_62_0;
                    break L9;
                  } else {
                    stackOut_60_0 = 1;
                    stackIn_63_0 = stackOut_60_0;
                    break L9;
                  }
                }
                var9_int = stackIn_63_0;
                var10 = -var9_int + this.field_h;
                if (var10 > 0) {
                  var11_int = 0;
                  L10: while (true) {
                    if (var11_int >= var10) {
                      break L8;
                    } else {
                      var12 = var9_int;
                      L11: while (true) {
                        if ((var12 ^ -1) <= (-1 + this.field_z ^ -1)) {
                          this.field_z = this.field_z - 1;
                          this.field_h = this.field_h - 1;
                          var11_int++;
                          continue L10;
                        } else {
                          this.field_C[var12] = this.field_C[1 + var12];
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
              if (!this.field_E) {
                if (5 == this.field_J) {
                  break L12;
                } else {
                  if (this.field_J == 6) {
                    break L12;
                  } else {
                    if (this.field_J != 4) {
                      this.field_C[0].field_W = fd.field_a;
                      if (-1 == param4) {
                        break L12;
                      } else {
                        this.field_C[0].a(20385, ge.field_c[param4]);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              } else {
                L13: {
                  this.field_C[0].field_W = ae.field_f;
                  this.field_C[1].field_W = ij.field_c;
                  if (0 == (param4 ^ -1)) {
                    break L13;
                  } else {
                    this.field_C[0].a(20385, ge.field_c[param4]);
                    break L13;
                  }
                }
                if (0 != (param1 ^ -1)) {
                  this.field_C[1].a(20385, ge.field_c[param1]);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            var9_int = 0;
            L14: while (true) {
              if ((var9_int ^ -1) <= (this.field_z ^ -1)) {
                L15: {
                  if (-6 != (this.field_J ^ -1)) {
                    if (this.field_J == 6) {
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
                            var11_int = this.d(var10_ref_qm.field_f, var10_ref_qm.field_h, -118);
                            if (-1 == (var11_int ^ -1)) {
                              continue L17;
                            } else {
                              L18: {
                                if ((var11_int & 48 ^ -1) == -1) {
                                  if ((var11_int & 12 ^ -1) == -1) {
                                    stackOut_134_0 = -1;
                                    stackIn_135_0 = stackOut_134_0;
                                    break L18;
                                  } else {
                                    stackOut_132_0 = 0;
                                    stackIn_135_0 = stackOut_132_0;
                                    break L18;
                                  }
                                } else {
                                  stackOut_129_0 = 1;
                                  stackIn_135_0 = stackOut_129_0;
                                  break L18;
                                }
                              }
                              var12 = stackIn_135_0;
                              var13 = new wm(var10_ref_qm, 1, var12);
                              this.field_cb.a((byte) -120, var13);
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
                    var9 = (wm) ((Object) this.field_cb.b((byte) 125));
                    L19: while (true) {
                      if (null == var9) {
                        break L15;
                      } else {
                        L20: {
                          if ((var9.field_J & 512 ^ -1) != -1) {
                            var9.d(0);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var9 = (wm) ((Object) this.field_cb.c((byte) -57));
                        continue L19;
                      }
                    }
                  }
                }
                var9_int = 0;
                L21: while (true) {
                  if (var9_int >= this.field_z) {
                    L22: {
                      this.field_mb = -1;
                      this.field_a = -1;
                      this.field_o = 0;
                      this.field_D = -101;
                      if (-4 != (this.field_J ^ -1)) {
                        L23: {
                          if (2 != this.field_J) {
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
                        if (-4 != (this.field_r ^ -1)) {
                          break L22;
                        } else {
                          if (!ij.field_l) {
                            break L22;
                          } else {
                            if ((this.field_J ^ -1) == -6) {
                              break L22;
                            } else {
                              if (this.field_J == 6) {
                                break L22;
                              } else {
                                if (this.field_J != 2) {
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
                      this.field_W = new ah();
                      if (-6 >= (this.field_J ^ -1)) {
                        var9 = null;
                        var10 = 0;
                        var11 = (wm) ((Object) this.field_cb.b((byte) 89));
                        L25: while (true) {
                          if (null == var11) {
                            sa.a(var9, -15676);
                            break L24;
                          } else {
                            L26: {
                              if ((var11.field_A.field_h ^ -1) >= (var10 ^ -1)) {
                                break L26;
                              } else {
                                var10 = var11.field_A.field_h;
                                var9 = var11;
                                break L26;
                              }
                            }
                            var11 = (wm) ((Object) this.field_cb.c((byte) -80));
                            continue L25;
                          }
                        }
                      } else {
                        L27: {
                          if (param6) {
                            stackOut_184_0 = null;
                            stackIn_185_0 = (ja) ((Object) stackOut_184_0);
                            break L27;
                          } else {
                            stackOut_182_0 = this.field_C[0];
                            stackIn_185_0 = stackOut_182_0;
                            break L27;
                          }
                        }
                        sa.a(stackIn_185_0, -15676);
                        break L24;
                      }
                    }
                    break L0;
                  } else {
                    this.field_C[var9_int].field_hb = kj.b(2, 3);
                    var9_int++;
                    continue L21;
                  }
                }
              } else {
                L28: {
                  this.field_C[var9_int].field_mc = var9_int;
                  if (this.field_C[var9_int].field_C.field_v == null) {
                    this.field_C[var9_int].field_C.field_v = this.field_C[var9_int].field_C.field_b.c((byte) 51);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (null != this.field_C[var9_int].field_C.field_h) {
                    break L29;
                  } else {
                    this.field_C[var9_int].field_C.field_h = this.field_C[var9_int].field_C.field_z.c((byte) 7);
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
            var8 = decompiledCaughtException;
            stackOut_195_0 = var8;
            stackOut_195_1 = new StringBuilder().append("sg.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_198_0 = stackOut_195_0;
            stackIn_198_1 = stackOut_195_1;
            stackIn_196_0 = stackOut_195_0;
            stackIn_196_1 = stackOut_195_1;
            if (param5 == null) {
              stackOut_198_0 = stackIn_198_0;
              stackOut_198_1 = (StringBuilder) ((Object) stackIn_198_1);
              stackOut_198_2 = "null";
              stackIn_199_0 = stackOut_198_0;
              stackIn_199_1 = stackOut_198_1;
              stackIn_199_2 = stackOut_198_2;
              break L30;
            } else {
              stackOut_196_0 = stackIn_196_0;
              stackOut_196_1 = (StringBuilder) ((Object) stackIn_196_1);
              stackOut_196_2 = "{...}";
              stackIn_199_0 = stackOut_196_0;
              stackIn_199_1 = stackOut_196_1;
              stackIn_199_2 = stackOut_196_2;
              break L30;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_199_0), stackIn_199_2 + ',' + param6 + ')');
        }
    }

    final void a(wm param0, boolean param1) {
        jk discarded$8 = null;
        int discarded$9 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.d(0);
              rd.a(oa.field_p.field_q, param0.field_A, -78, oa.field_p);
              discarded$8 = kn.a(0, param0.field_A.field_f, 0, 64, 1, -16, param0.field_A.field_h, param0.field_q, this.field_M, 16776960, 0, 255, 20);
              discarded$9 = this.a(-30808, 3, 25, param0, 32, 100000.0f);
              if (!param1) {
                break L1;
              } else {
                this.g(-25);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sg.DA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, ja param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = 70 + param1.field_C.field_K;
            var4 = param1.field_r;
            var4 = (float)((double)var4 * 10.185916357881302);
            var5 = Math.round(var4);
            L1: while (true) {
              if (var5 >= 0) {
                L2: while (true) {
                  if ((var5 ^ -1) > -65) {
                    var4 = 6.2831854820251465f * (float)var5 / (float)param0;
                    var6 = param1.field_A.field_h - -(int)((double)var3_int * Math.cos((double)var4));
                    var7 = param1.field_A.field_f + (int)(-Math.sin((double)var4) * (double)var3_int);
                    vb.a(param0 ^ -7, this.field_I);
                    var8 = qk.field_f.a(param1.field_r, param0 + 27724);
                    pa.a(-(var8.field_v >> 2130123329) + var7, -(var8.field_o >> -532185407) + var6, 121, var8);
                    ug.b(param0 + -65);
                    break L0;
                  } else {
                    var5 -= 64;
                    continue L2;
                  }
                }
              } else {
                var5 += 64;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("sg.FA(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int stackIn_38_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_194_2 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_195_2 = 0;
        int stackIn_195_3 = 0;
        int stackIn_213_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_194_2 = 0;
        int stackOut_194_3 = 0;
        int stackOut_192_0 = 0;
        int stackOut_192_1 = 0;
        int stackOut_192_2 = 0;
        int stackOut_192_3 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        var18 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -109) {
                break L1;
              } else {
                this.field_m = (ue[]) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = this.field_C[var2_int];
                    if (0 == this.field_J) {
                      break L4;
                    } else {
                      if (-4 != (this.field_J ^ -1)) {
                        if ((this.field_J ^ -1) != -3) {
                          if (-2 == (this.field_J ^ -1)) {
                            if (var6.field_bc <= 0) {
                              break L3;
                            } else {
                              L5: {
                                var7 = var6.field_mc;
                                if (0 != var7) {
                                  if (1 != var7) {
                                    if (-3 == (var7 ^ -1)) {
                                      var3 = 10;
                                      var5 = 12;
                                      var4 = 450;
                                      break L5;
                                    } else {
                                      var4 = 450;
                                      var5 = 12;
                                      var3 = 575;
                                      break L5;
                                    }
                                  } else {
                                    var5 = 12;
                                    var3 = 575;
                                    var4 = 10;
                                    break L5;
                                  }
                                } else {
                                  var4 = 10;
                                  var3 = 10;
                                  var5 = 12;
                                  break L5;
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
                              ek.a(-1, 768, hk.field_a[10 - -var11], (11 * var5 >> 40092418) + var3, 16777215, 1 + var4);
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          L6: {
                            var7 = var6.field_mc;
                            if (var7 != 0) {
                              if (var7 == 1) {
                                var3 = 580;
                                var4 = 30;
                                break L6;
                              } else {
                                if ((var7 ^ -1) == -3) {
                                  var4 = 420;
                                  var3 = 10;
                                  break L6;
                                } else {
                                  var4 = 420;
                                  var3 = 580;
                                  break L6;
                                }
                              }
                            } else {
                              var4 = 30;
                              var3 = 10;
                              break L6;
                            }
                          }
                          L7: {
                            L8: {
                              var7 = var6.field_tc;
                              if (-11 > (var6.field_ob ^ -1)) {
                                break L8;
                              } else {
                                if (this.field_S) {
                                  break L8;
                                } else {
                                  if (dg.field_c == -1) {
                                    stackOut_117_0 = -var6.field_ob + 10;
                                    stackIn_118_0 = stackOut_117_0;
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            stackOut_115_0 = 0;
                            stackIn_118_0 = stackOut_115_0;
                            break L7;
                          }
                          L9: {
                            var8 = stackIn_118_0;
                            ek.a(-1, 16 * var8 + 1024, hk.field_a[var6.field_R + 20], var3, var7, var4);
                            var9 = var6.field_mc;
                            if ((var9 ^ -1) != -1) {
                              if (var9 != 1) {
                                if ((var9 ^ -1) == -3) {
                                  var3 = 5;
                                  var4 = 453;
                                  break L9;
                                } else {
                                  var4 = 453;
                                  var3 = 615;
                                  break L9;
                                }
                              } else {
                                var3 = 615;
                                var4 = 3;
                                break L9;
                              }
                            } else {
                              var3 = 5;
                              var4 = 3;
                              break L9;
                            }
                          }
                          L10: {
                            L11: {
                              if (var6.field_X > 10) {
                                break L11;
                              } else {
                                if (this.field_S) {
                                  break L11;
                                } else {
                                  if (dg.field_c == -1) {
                                    stackOut_146_0 = -var6.field_X + 10;
                                    stackIn_147_0 = stackOut_146_0;
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            stackOut_144_0 = 0;
                            stackIn_147_0 = stackOut_144_0;
                            break L10;
                          }
                          L12: {
                            var8 = stackIn_147_0;
                            if (!kb.a(16616, 0)) {
                              stackOut_150_0 = 2;
                              stackIn_151_0 = stackOut_150_0;
                              break L12;
                            } else {
                              stackOut_148_0 = 3;
                              stackIn_151_0 = stackOut_148_0;
                              break L12;
                            }
                          }
                          L13: {
                            L14: {
                              var9 = stackIn_151_0;
                              if ((var6.field_mc ^ -1) == -1) {
                                break L14;
                              } else {
                                if (var6.field_mc != 2) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var3 = var3 + 12 * var9;
                            break L13;
                          }
                          var10 = var6.field_Sb;
                          var11 = 0;
                          L15: while (true) {
                            if (var9 <= var11) {
                              L16: {
                                var11 = var6.field_mc;
                                if (-1 != (var11 ^ -1)) {
                                  if (1 == var11) {
                                    var5 = 1;
                                    var4 = 35;
                                    var3 = 505;
                                    break L16;
                                  } else {
                                    if (var11 == 2) {
                                      var4 = 425;
                                      var3 = 80;
                                      var5 = 1;
                                      break L16;
                                    } else {
                                      var4 = 425;
                                      var5 = 1;
                                      var3 = 505;
                                      break L16;
                                    }
                                  }
                                } else {
                                  var5 = 1;
                                  var3 = 80;
                                  var4 = 35;
                                  break L16;
                                }
                              }
                              var11 = (int)(var6.field_N * 80.0f / (float)var6.field_C.field_i);
                              var12 = (int)(var6.field_lc * 80.0f / (float)var6.field_C.field_i);
                              var13 = 0;
                              L17: while (true) {
                                if (-3 >= (var13 ^ -1)) {
                                  var13 = 0;
                                  L18: while (true) {
                                    if (20 <= var13) {
                                      var13 = 0;
                                      L19: while (true) {
                                        if (-4 >= (var13 ^ -1)) {
                                          var13 = 3;
                                          L20: while (true) {
                                            if ((var13 ^ -1) <= -21) {
                                              break L3;
                                            } else {
                                              L21: {
                                                if (-51 < (var11 ^ -1)) {
                                                  tc.c(var3 + -(var5 * var13 / 2), var13 + var4, var11, var6.field_Eb, 192);
                                                  tc.c(var3 - (var5 * var13 / 2 - var11), var4 - -var13, -var11 + 50, var6.field_Eb >> -1028617119 & 8355711, 192);
                                                  break L21;
                                                } else {
                                                  tc.c(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb, 192);
                                                  break L21;
                                                }
                                              }
                                              var14 = 0;
                                              L22: while (true) {
                                                if (3 <= var14) {
                                                  L23: {
                                                    if ((var11 ^ -1) >= (var12 ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      tc.c(-(var5 * var13 / 2) + var3 - -var12, var4 + var13, -var12 + var11, 16777215, 256);
                                                      break L23;
                                                    }
                                                  }
                                                  var13++;
                                                  continue L20;
                                                } else {
                                                  L24: {
                                                    if (-1 != (var14 % 2 ^ -1)) {
                                                      stackOut_212_0 = var6.field_Eb;
                                                      stackIn_213_0 = stackOut_212_0;
                                                      break L24;
                                                    } else {
                                                      stackOut_210_0 = 16777215;
                                                      stackIn_213_0 = stackOut_210_0;
                                                      break L24;
                                                    }
                                                  }
                                                  L25: {
                                                    var15 = stackIn_213_0;
                                                    var16 = (var15 & 16711422) >> -1774136511;
                                                    var17 = 80 + (-30 + 10 * var14);
                                                    if ((var11 ^ -1) <= (var17 ^ -1)) {
                                                      if (var17 + 10 > var11) {
                                                        tc.c(var3 + var17 - var13 * var5 / 2, var13 + var4, -var17 + var11, var15, 192);
                                                        tc.c(var3 + var11 - var5 * var13 / 2, var4 - -var13, 10 - (-var17 + var11), var16, 192);
                                                        break L25;
                                                      } else {
                                                        tc.c(var3 + var17 + -(var13 * var5 / 2), var4 - -var13, 10, var15, 192);
                                                        break L25;
                                                      }
                                                    } else {
                                                      tc.c(var3 + var17 - var5 * var13 / 2, var4 - -var13, 10, var16, 192);
                                                      break L25;
                                                    }
                                                  }
                                                  var14++;
                                                  continue L22;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          tc.b(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb);
                                          stackOut_187_0 = 0;
                                          stackIn_189_0 = stackOut_187_0;
                                          var14 = stackIn_189_0;
                                          L26: while (true) {
                                            if (3 <= var14) {
                                              var13++;
                                              continue L19;
                                            } else {
                                              L27: {
                                                stackOut_191_0 = 80 + (var3 - (-(var14 * 10) + (30 - -(var13 * var5 / 2))));
                                                stackOut_191_1 = var13 + var4;
                                                stackOut_191_2 = 10;
                                                stackIn_194_0 = stackOut_191_0;
                                                stackIn_194_1 = stackOut_191_1;
                                                stackIn_194_2 = stackOut_191_2;
                                                stackIn_192_0 = stackOut_191_0;
                                                stackIn_192_1 = stackOut_191_1;
                                                stackIn_192_2 = stackOut_191_2;
                                                if (0 == var14 % 2) {
                                                  stackOut_194_0 = stackIn_194_0;
                                                  stackOut_194_1 = stackIn_194_1;
                                                  stackOut_194_2 = stackIn_194_2;
                                                  stackOut_194_3 = 16777215;
                                                  stackIn_195_0 = stackOut_194_0;
                                                  stackIn_195_1 = stackOut_194_1;
                                                  stackIn_195_2 = stackOut_194_2;
                                                  stackIn_195_3 = stackOut_194_3;
                                                  break L27;
                                                } else {
                                                  stackOut_192_0 = stackIn_192_0;
                                                  stackOut_192_1 = stackIn_192_1;
                                                  stackOut_192_2 = stackIn_192_2;
                                                  stackOut_192_3 = var6.field_Eb;
                                                  stackIn_195_0 = stackOut_192_0;
                                                  stackIn_195_1 = stackOut_192_1;
                                                  stackIn_195_2 = stackOut_192_2;
                                                  stackIn_195_3 = stackOut_192_3;
                                                  break L27;
                                                }
                                              }
                                              tc.b(stackIn_195_0, stackIn_195_1, stackIn_195_2, stackIn_195_3);
                                              var14++;
                                              continue L26;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      tc.b(-2 + (-(var5 * var13 / 2) + var3), var4 + var13, 2, 0);
                                      tc.b(-(var5 * var13 / 2) + (80 + var3), var4 + var13, 2, 0);
                                      var13++;
                                      continue L18;
                                    }
                                  }
                                } else {
                                  tc.b((var13 + 1) * var5 / 2 + var3 - 2, -1 + (var4 + -var13), 84, 0);
                                  tc.b(-2 + (var3 - var5 * (var13 - -20) / 2), var4 + (20 - -var13), 84, 0);
                                  var13++;
                                  continue L17;
                                }
                              }
                            } else {
                              var12 = var10 % 10;
                              pd.a(hk.field_a[var12 + 10], -95, var4, var3 + -(12 * var11), 1024 + var8 * 16, var7);
                              var10 = var10 / 10;
                              var11++;
                              continue L15;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L28: {
                    var7 = var6.field_mc;
                    if ((var7 ^ -1) != -1) {
                      if ((var7 ^ -1) == -2) {
                        var3 = 580;
                        var4 = 30;
                        break L28;
                      } else {
                        if (var7 == 2) {
                          var3 = 10;
                          var4 = 420;
                          break L28;
                        } else {
                          var3 = 580;
                          var4 = 420;
                          break L28;
                        }
                      }
                    } else {
                      var4 = 30;
                      var3 = 10;
                      break L28;
                    }
                  }
                  L29: {
                    L30: {
                      var7 = var6.field_tc;
                      if ((var6.field_ob ^ -1) < -11) {
                        break L30;
                      } else {
                        if (this.field_S) {
                          break L30;
                        } else {
                          if (dg.field_c == -1) {
                            stackOut_37_0 = -var6.field_ob + 10;
                            stackIn_38_0 = stackOut_37_0;
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = 0;
                    stackIn_38_0 = stackOut_35_0;
                    break L29;
                  }
                  L31: {
                    var8 = stackIn_38_0;
                    ek.a(-1, 1024 + var8 * 16, hk.field_a[20 + var6.field_R], var3, var7, var4);
                    var9 = var6.field_mc;
                    if (-1 != (var9 ^ -1)) {
                      if (-2 == (var9 ^ -1)) {
                        var4 = 3;
                        var3 = 615;
                        break L31;
                      } else {
                        if (-3 == (var9 ^ -1)) {
                          var4 = 453;
                          var3 = 5;
                          break L31;
                        } else {
                          var3 = 615;
                          var4 = 453;
                          break L31;
                        }
                      }
                    } else {
                      var4 = 3;
                      var3 = 5;
                      break L31;
                    }
                  }
                  L32: {
                    L33: {
                      var9 = var6.field_bc % 10;
                      if (10 < var6.field_X) {
                        break L33;
                      } else {
                        if (this.field_S) {
                          break L33;
                        } else {
                          if (dg.field_c != -1) {
                            break L33;
                          } else {
                            stackOut_61_0 = 10 + -var6.field_X;
                            stackIn_64_0 = stackOut_61_0;
                            break L32;
                          }
                        }
                      }
                    }
                    stackOut_63_0 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    break L32;
                  }
                  L34: {
                    var8 = stackIn_64_0;
                    if (this.field_B >= var6.field_bc) {
                      break L34;
                    } else {
                      if (0 == (this.field_B ^ -1)) {
                        break L34;
                      } else {
                        var9 = this.field_B;
                        if (10 > this.field_bb % 20) {
                          var7 = 16777215;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  L35: {
                    pd.a(hk.field_a[var9 + 10], -100, var4, var3, 1024 - -(var8 * 16), var7);
                    var10 = var6.field_mc;
                    if ((var10 ^ -1) != -1) {
                      if (var10 == 1) {
                        var3 = 576;
                        var4 = 3;
                        break L35;
                      } else {
                        if (2 == var10) {
                          var3 = 22;
                          var4 = 453;
                          break L35;
                        } else {
                          var3 = 577;
                          var4 = 453;
                          break L35;
                        }
                      }
                    } else {
                      var4 = 3;
                      var3 = 20;
                      break L35;
                    }
                  }
                  hk.field_a[24].a(var3, var4);
                  break L3;
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.BB(" + param0 + ')');
        }
    }

    private final void a(int param0, na param1) {
        RuntimeException runtimeException = null;
        hj var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ok.a(32381);
              this.field_I.f();
              var3 = de.field_Q;
              pa.a(-(var3.field_y >> -276800223) + param1.field_n, param1.field_l + -(var3.field_s >> -1766709855), 103, var3);
              ug.b(-1);
              if (param0 < -24) {
                break L1;
              } else {
                this.field_W = (ah) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("sg.AB(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 96) {
                break L1;
              } else {
                this.field_eb = (int[]) null;
                break L1;
              }
            }
            this.g(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.NA(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 264;
                var3 = 22;
                var4 = this.field_ab;
                var5 = this.field_ab;
                if ((this.field_J ^ -1) == -1) {
                  break L2;
                } else {
                  if (3 == this.field_J) {
                    break L2;
                  } else {
                    if ((this.field_J ^ -1) != -2) {
                      break L1;
                    } else {
                      if (0 < this.field_ab) {
                        var5 = this.field_C[0].field_X;
                        var4 = this.field_C[0].field_X;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (!this.field_U) {
                break L1;
              } else {
                var4 = this.field_ob;
                break L1;
              }
            }
            L3: {
              if (-1 < (this.field_ab ^ -1)) {
                var4 = -this.field_ab;
                break L3;
              } else {
                break L3;
              }
            }
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
              if (param0) {
                break L4;
              } else {
                this.a((byte) -128, (in) null, 61, -5, 7);
                break L4;
              }
            }
            L5: {
              L6: {
                if (this.field_U) {
                  break L6;
                } else {
                  if (var14 > 10) {
                    break L6;
                  } else {
                    stackOut_28_0 = -(var14 / 2) + 5;
                    stackIn_31_0 = stackOut_28_0;
                    break L5;
                  }
                }
              }
              stackOut_30_0 = 0;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            }
            L7: {
              L8: {
                var15 = stackIn_31_0;
                var16 = oa.a(500, var5, -3248);
                if (this.field_U) {
                  break L8;
                } else {
                  if (-11 > (var16 ^ -1)) {
                    break L8;
                  } else {
                    stackOut_35_0 = -(var16 / 2) + 5;
                    stackIn_38_0 = stackOut_35_0;
                    break L7;
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L7;
            }
            L9: {
              L10: {
                var17 = stackIn_38_0;
                var18 = oa.a(3000, var5, -3248);
                if (this.field_U) {
                  break L10;
                } else {
                  if (-11 > (var18 ^ -1)) {
                    break L10;
                  } else {
                    stackOut_42_0 = -(var18 / 2) + 5;
                    stackIn_45_0 = stackOut_42_0;
                    break L9;
                  }
                }
              }
              stackOut_44_0 = 0;
              stackIn_45_0 = stackOut_44_0;
              break L9;
            }
            L11: {
              L12: {
                var19 = stackIn_45_0;
                var20 = oa.a(30000, var5, -3248);
                if (this.field_U) {
                  break L12;
                } else {
                  if ((var20 ^ -1) >= -11) {
                    stackOut_51_0 = 5 - var20 / 2;
                    stackIn_52_0 = stackOut_51_0;
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              stackOut_49_0 = 0;
              stackIn_52_0 = stackOut_49_0;
              break L11;
            }
            L13: {
              L14: {
                var21 = stackIn_52_0;
                if (this.field_S) {
                  break L14;
                } else {
                  if (0 != (dg.field_c ^ -1)) {
                    break L14;
                  } else {
                    break L13;
                  }
                }
              }
              var17 = 0;
              var19 = 0;
              var21 = 0;
              var15 = 0;
              break L13;
            }
            L15: {
              if (-1 < (this.field_ab ^ -1)) {
                stackOut_62_0 = 16760576;
                stackIn_63_0 = stackOut_62_0;
                break L15;
              } else {
                stackOut_60_0 = 16777215;
                stackIn_63_0 = stackOut_60_0;
                break L15;
              }
            }
            var22 = stackIn_63_0;
            ek.a(-1, 1024, hk.field_a[27], var3 * 2 + var2_int, var22, 20);
            ek.a(-1, 64 * var21 + 1024, hk.field_a[0 + var8], var2_int, var22, 10);
            ek.a(-1, var19 * 64 + 1024, hk.field_a[0 - -var9], var3 + var2_int, var22, 10);
            ek.a(-1, 1024 + var17 * 64, hk.field_a[0 + var10], 8 + (2 * var3 + var2_int), var22, 10);
            ek.a(-1, var15 * 64 + 1024, hk.field_a[var11 + 0], 8 + var2_int - -(var3 * 3), var22, 10);
            ek.a(-1, 768, hk.field_a[var12 + 0], var2_int + (4 * var3 - -8), var22, 11);
            ek.a(-1, 768, hk.field_a[0 - -var13], 8 + ((19 * var3 >> -197112414) + var2_int), var22, 11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.HB(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_v = null;
              if (param0 == -26919) {
                break L1;
              } else {
                sg.d(-48);
                break L1;
              }
            }
            field_gb = (String[][]) null;
            field_Y = null;
            field_Z = null;
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "sg.IB(" + param0 + ')');
        }
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
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        Object stackIn_58_0 = null;
        qm stackIn_60_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_57_0 = null;
        qm stackOut_59_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              param1 = param1 + param2.field_u;
              if ((param1 ^ -1) <= -641) {
                break L1;
              } else {
                if (param1 > -param2.field_s) {
                  L2: {
                    param0 = param0 + param2.field_x;
                    if (-481 >= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (-param2.field_y < param0) {
                        L3: {
                          if (-1 <= (param1 ^ -1)) {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            break L3;
                          } else {
                            stackOut_14_0 = param1;
                            stackIn_17_0 = stackOut_14_0;
                            break L3;
                          }
                        }
                        L4: {
                          var6_int = stackIn_17_0;
                          var7 = param2.field_s + param1;
                          if (var7 > 640) {
                            var7 = 640;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (param0 <= 0) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L5;
                          } else {
                            stackOut_22_0 = param0;
                            stackIn_25_0 = stackOut_22_0;
                            break L5;
                          }
                        }
                        L6: {
                          var8 = stackIn_25_0;
                          var9 = param2.field_y + param0;
                          if ((var9 ^ -1) < -481) {
                            var9 = 480;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var7 = var7 - var6_int;
                          var9 = var9 - var8;
                          var10 = var8 * 640 + var6_int;
                          if (param3 < -57) {
                            break L7;
                          } else {
                            this.field_k = 21;
                            break L7;
                          }
                        }
                        L8: {
                          var11 = 640 - var7;
                          var12 = var6_int - (param1 - (-param0 + var8) * param2.field_s);
                          var13 = param2.field_s + -var7;
                          var14 = this.field_lb.field_m;
                          if ((param4 ^ -1) <= -2) {
                            stackOut_39_0 = 60;
                            stackIn_40_0 = stackOut_39_0;
                            break L8;
                          } else {
                            if (param4 <= -1) {
                              stackOut_38_0 = 15;
                              stackIn_40_0 = stackOut_38_0;
                              break L8;
                            } else {
                              stackOut_36_0 = 63;
                              stackIn_40_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                        var15 = stackIn_40_0;
                        var16 = 0;
                        var17 = 0;
                        var18 = 0;
                        var6_int = var6_int + var7;
                        var8 = var8 + var9;
                        var19 = param2.field_z;
                        var20 = -var9;
                        L9: while (true) {
                          if (var20 >= 0) {
                            if (var18 == 0) {
                              stackOut_57_0 = null;
                              stackIn_58_0 = stackOut_57_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              stackOut_59_0 = new qm(var16 / var18 + (var7 + param1), var17 / var18 + var9 + param0);
                              stackIn_60_0 = stackOut_59_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            var21 = -var7;
                            L10: while (true) {
                              if (var21 >= 0) {
                                var10 = var10 + var11;
                                var12 = var12 + var13;
                                var20++;
                                continue L9;
                              } else {
                                L11: {
                                  if ((var19[var12] ^ -1) == -1) {
                                    break L11;
                                  } else {
                                    if (0 == (var15 & var14[var10])) {
                                      var16 = var16 + var21;
                                      var17 = var17 + var20;
                                      var18++;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var12++;
                                var10++;
                                var21++;
                                continue L10;
                              }
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var6);
            stackOut_61_1 = new StringBuilder().append("sg.U(").append(param0).append(',').append(param1).append(',');
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L12;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qm) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (qm) ((Object) stackIn_12_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (qm) ((Object) stackIn_58_0);
            } else {
              return stackIn_60_0;
            }
          }
        }
    }

    private final void b(int param0, ja param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_kb == null) {
                param1.field_kb = sf.a(param1.field_C.field_d, (byte) 27, param1.field_Eb);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              vb.a(-67, this.field_I);
              if (param0 == 32249) {
                break L2;
              } else {
                this.a(false);
                break L2;
              }
            }
            pa.a(param1.field_A.field_f - (param1.field_kb.field_y >> -1840594783), param1.field_A.field_h + -(param1.field_kb.field_s >> 2070050081), 108, param1.field_kb);
            ug.b(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("sg.HA(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2_int = 5;
              if (null != this.field_O) {
                eb.a(false, this.field_O);
                break L1;
              } else {
                this.field_O = new ah[var2_int];
                var3 = 0;
                L2: while (true) {
                  if ((this.field_O.length ^ -1) >= (var3 ^ -1)) {
                    break L1;
                  } else {
                    this.field_O[var3] = new ah();
                    var3++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (this.field_q != null) {
                eb.a(false, this.field_q);
                break L3;
              } else {
                this.field_q = new ah[var2_int];
                var3 = 0;
                L4: while (true) {
                  if (var3 >= this.field_q.length) {
                    break L3;
                  } else {
                    this.field_q[var3] = new ah();
                    var3++;
                    continue L4;
                  }
                }
              }
            }
            L5: {
              if (this.field_M != null) {
                eb.a(false, this.field_M);
                break L5;
              } else {
                this.field_M = new ah[var2_int];
                var3 = 0;
                L6: while (true) {
                  if ((this.field_M.length ^ -1) >= (var3 ^ -1)) {
                    break L5;
                  } else {
                    this.field_M[var3] = new ah();
                    var3++;
                    continue L6;
                  }
                }
              }
            }
            this.field_Q = new ah();
            var3 = -112 % ((param0 - -8) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.SA(" + param0 + ')');
        }
    }

    private final void a(wm param0, ja param1, byte param2) {
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            if (!im.a(param1, param0, 32758)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == 7) {
                  break L1;
                } else {
                  this.field_f = false;
                  break L1;
                }
              }
              L2: {
                if (-1 == (3 & param0.field_J ^ -1)) {
                  var4_float = param1.field_x * param0.field_w.field_g + param1.field_t * param0.field_w.field_j;
                  if (-1.0f > var4_float) {
                    if (var4_float >= -5.0f) {
                      break L2;
                    } else {
                      param1.field_x = param1.field_x * 0.949999988079071f;
                      param1.field_t = param1.field_t * 0.949999988079071f;
                      break L2;
                    }
                  } else {
                    param1.field_t = param1.field_t + param0.field_w.field_j * 2.0f;
                    param1.field_x = param1.field_x + 2.0f * param0.field_w.field_g;
                    break L2;
                  }
                } else {
                  if (1 != (3 & param0.field_J)) {
                    if ((3 & param0.field_J ^ -1) == -3) {
                      L3: {
                        var4_int = (int)(param1.field_y - (float)param1.field_C.field_K * param1.field_w.field_j);
                        var5 = (int)(param1.field_u - (float)param1.field_C.field_K * param1.field_w.field_g);
                        if ((param0.field_B * param0.field_B ^ -1) < ((-param0.field_A.field_h + var4_int) * (-param0.field_A.field_h + var4_int) + (-param0.field_A.field_f + var5) * (var5 - param0.field_A.field_f) ^ -1)) {
                          param1.field_Q = 50;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    L4: {
                      var4_float = param0.field_w.field_g * param1.field_x + param1.field_t * param0.field_w.field_j;
                      if (10.0f < var4_float) {
                        param1.field_t = param1.field_t * 0.949999988079071f;
                        param1.field_x = param1.field_x * 0.949999988079071f;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("sg.O(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L5;
            }
          }
          L6: {
            stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L6;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        vf var4 = null;
        int var4_int = 0;
        wm var4_ref = null;
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
        int stackIn_23_0 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        wm stackIn_65_0 = null;
        wm stackIn_67_0 = null;
        wm stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackIn_106_0 = null;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_117_0 = null;
        Object stackIn_119_0 = null;
        Object stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackIn_228_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_279_0 = 0;
        int stackIn_279_1 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        Object stackIn_374_0 = null;
        Object stackIn_376_0 = null;
        Object stackIn_378_0 = null;
        Object stackIn_379_0 = null;
        int stackIn_379_1 = 0;
        int stackIn_472_0 = 0;
        int stackIn_472_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        wm stackOut_64_0 = null;
        wm stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        wm stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_85_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_86_0 = null;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        Object stackOut_105_0 = null;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        Object stackOut_115_0 = null;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_373_0 = null;
        Object stackOut_378_0 = null;
        int stackOut_378_1 = 0;
        Object stackOut_374_0 = null;
        Object stackOut_376_0 = null;
        int stackOut_376_1 = 0;
        int stackOut_470_0 = 0;
        int stackOut_470_1 = 0;
        int stackOut_316_0 = 0;
        int stackOut_316_1 = 0;
        int stackOut_277_0 = 0;
        int stackOut_277_1 = 0;
        int stackOut_227_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        int stackOut_229_0 = 0;
        int stackOut_229_1 = 0;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 == (this.field_mb ^ -1)) {
                break L1;
              } else {
                this.b(31782);
                break L1;
              }
            }
            L2: {
              if (5 <= this.field_J) {
                break L2;
              } else {
                L3: while (true) {
                  if (!qh.c(-64)) {
                    break L2;
                  } else {
                    if (aa.field_n != 13) {
                      L4: {
                        if (mg.field_c) {
                          L5: {
                            if (aa.field_n == 1) {
                              L6: {
                                if (kb.field_c) {
                                  stackOut_22_0 = 0;
                                  stackIn_23_0 = stackOut_22_0;
                                  break L6;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_23_0 = stackOut_20_0;
                                  break L6;
                                }
                              }
                              kb.field_c = stackIn_23_0 != 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L7: {
                            if (2 == aa.field_n) {
                              L8: {
                                stackOut_27_0 = this;
                                stackIn_30_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (this.field_kb) {
                                  stackOut_30_0 = this;
                                  stackOut_30_1 = 0;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  break L8;
                                } else {
                                  stackOut_28_0 = this;
                                  stackOut_28_1 = 1;
                                  stackIn_31_0 = stackOut_28_0;
                                  stackIn_31_1 = stackOut_28_1;
                                  break L8;
                                }
                              }
                              ((sg) (this)).field_kb = stackIn_31_1 != 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L9: {
                            if (!lk.field_g[82]) {
                              L10: {
                                if (5 != aa.field_n) {
                                  break L10;
                                } else {
                                  discarded$6 = this.field_C[0].c(3, 0);
                                  l.field_b = true;
                                  break L10;
                                }
                              }
                              L11: {
                                if ((aa.field_n ^ -1) == -7) {
                                  discarded$7 = this.field_C[0].c(3, 1);
                                  l.field_b = true;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              if (aa.field_n == 7) {
                                discarded$8 = this.field_C[0].c(3, 2);
                                l.field_b = true;
                                break L9;
                              } else {
                                break L9;
                              }
                            } else {
                              if (aa.field_n != 9) {
                                L12: {
                                  var4_int = -1;
                                  if ((aa.field_n ^ -1) == -6) {
                                    var4_int = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (aa.field_n == 6) {
                                    var4_int = 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (7 != aa.field_n) {
                                    break L14;
                                  } else {
                                    var4_int = 2;
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (-9 != (aa.field_n ^ -1)) {
                                    break L15;
                                  } else {
                                    var4_int = 3;
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (-1 == var4_int) {
                                    break L16;
                                  } else {
                                    l.field_b = true;
                                    var5 = (wm) ((Object) this.field_cb.b((byte) 112));
                                    L17: while (true) {
                                      if (null == var5) {
                                        break L16;
                                      } else {
                                        L18: {
                                          if (0 != (512 & var5.field_J)) {
                                            L19: {
                                              var5.field_J = var5.field_J & -4;
                                              var5.field_J = var5.field_J | var4_int;
                                              stackOut_64_0 = (wm) (var5);
                                              stackIn_67_0 = stackOut_64_0;
                                              stackIn_65_0 = stackOut_64_0;
                                              if (3 != var4_int) {
                                                stackOut_67_0 = (wm) ((Object) stackIn_67_0);
                                                stackOut_67_1 = 2 + var4_int;
                                                stackIn_68_0 = stackOut_67_0;
                                                stackIn_68_1 = stackOut_67_1;
                                                break L19;
                                              } else {
                                                stackOut_65_0 = (wm) ((Object) stackIn_65_0);
                                                stackOut_65_1 = 1;
                                                stackIn_68_0 = stackOut_65_0;
                                                stackIn_68_1 = stackOut_65_1;
                                                break L19;
                                              }
                                            }
                                            stackIn_68_0.field_E = ci.a(stackIn_68_1, (byte) 17);
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var5 = (wm) ((Object) this.field_cb.c((byte) -72));
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                                break L9;
                              } else {
                                var4_ref = (wm) ((Object) this.field_cb.b((byte) 110));
                                L20: while (true) {
                                  if (null == var4_ref) {
                                    l.field_b = true;
                                    break L9;
                                  } else {
                                    L21: {
                                      if ((var4_ref.field_J & 512 ^ -1) == -1) {
                                        break L21;
                                      } else {
                                        var4_ref.d(0);
                                        break L21;
                                      }
                                    }
                                    var4_ref = (wm) ((Object) this.field_cb.c((byte) 127));
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (aa.field_n != 12) {
                              break L22;
                            } else {
                              L23: {
                                stackOut_85_0 = this;
                                stackIn_90_0 = stackOut_85_0;
                                stackIn_86_0 = stackOut_85_0;
                                if (this.field_T) {
                                  stackOut_90_0 = this;
                                  stackOut_90_1 = 0;
                                  stackIn_91_0 = stackOut_90_0;
                                  stackIn_91_1 = stackOut_90_1;
                                  break L23;
                                } else {
                                  stackOut_86_0 = this;
                                  stackIn_88_0 = stackOut_86_0;
                                  stackOut_88_0 = this;
                                  stackOut_88_1 = 1;
                                  stackIn_91_0 = stackOut_88_0;
                                  stackIn_91_1 = stackOut_88_1;
                                  break L23;
                                }
                              }
                              ((sg) (this)).field_T = stackIn_91_1 != 0;
                              l.field_b = true;
                              break L22;
                            }
                          }
                          L24: {
                            if (aa.field_n != 10) {
                              break L24;
                            } else {
                              var2_int = 1;
                              L25: while (true) {
                                if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                  l.field_b = true;
                                  break L24;
                                } else {
                                  this.field_C[var2_int].field_bc = this.field_B;
                                  var2_int++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L26: {
                            if (-12 != (aa.field_n ^ -1)) {
                              break L26;
                            } else {
                              l.field_b = true;
                              this.field_C[0].field_bc = this.field_B;
                              break L26;
                            }
                          }
                          L27: {
                            if (27 == aa.field_n) {
                              L28: {
                                stackOut_105_0 = this;
                                stackIn_108_0 = stackOut_105_0;
                                stackIn_106_0 = stackOut_105_0;
                                if (this.field_c) {
                                  stackOut_108_0 = this;
                                  stackOut_108_1 = 0;
                                  stackIn_109_0 = stackOut_108_0;
                                  stackIn_109_1 = stackOut_108_1;
                                  break L28;
                                } else {
                                  stackOut_106_0 = this;
                                  stackOut_106_1 = 1;
                                  stackIn_109_0 = stackOut_106_0;
                                  stackIn_109_1 = stackOut_106_1;
                                  break L28;
                                }
                              }
                              ((sg) (this)).field_c = stackIn_109_1 != 0;
                              l.field_b = true;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L29: {
                            if (28 != aa.field_n) {
                              break L29;
                            } else {
                              l.field_b = true;
                              this.field_C[0].field_W = (int[][]) null;
                              break L29;
                            }
                          }
                          if (-90 != (aa.field_n ^ -1)) {
                            break L4;
                          } else {
                            L30: {
                              stackOut_114_0 = this;
                              stackIn_119_0 = stackOut_114_0;
                              stackIn_115_0 = stackOut_114_0;
                              if (this.field_f) {
                                stackOut_119_0 = this;
                                stackOut_119_1 = 0;
                                stackIn_120_0 = stackOut_119_0;
                                stackIn_120_1 = stackOut_119_1;
                                break L30;
                              } else {
                                stackOut_115_0 = this;
                                stackIn_117_0 = stackOut_115_0;
                                stackOut_117_0 = this;
                                stackOut_117_1 = 1;
                                stackIn_120_0 = stackOut_117_0;
                                stackIn_120_1 = stackOut_117_1;
                                break L30;
                              }
                            }
                            ((sg) (this)).field_f = stackIn_120_1 != 0;
                            l.field_b = true;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      L31: {
                        if (aa.field_n == 84) {
                          this.field_o = this.field_o | 1;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (aa.field_n != 83) {
                          break L32;
                        } else {
                          this.field_o = this.field_o | 2;
                          break L32;
                        }
                      }
                      if (-1 == (aa.field_n % 2 ^ -1)) {
                        this.field_l = this.field_l + 1;
                        this.field_t = this.field_t + 1;
                        this.field_y = this.field_y - 1;
                        this.field_N = this.field_N - this.field_p * this.field_H;
                        continue L3;
                      } else {
                        this.field_N = this.field_N + this.field_l * this.field_H;
                        this.field_t = this.field_t + this.field_hb;
                        this.field_p = this.field_p - 1;
                        this.field_g = this.field_g + 1;
                        continue L3;
                      }
                    } else {
                      pg.a(1, (byte) 100, true);
                      wm.a(true, false, 1);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            L33: {
              this.field_bb = this.field_bb + 1;
              if (ih.field_n != null) {
                var4 = (vf) ((Object) ih.field_n.b((byte) 113));
                L34: while (true) {
                  if (null == var4) {
                    break L33;
                  } else {
                    var4.g(-19895);
                    var4 = (vf) ((Object) ih.field_n.c((byte) -43));
                    continue L34;
                  }
                }
              } else {
                break L33;
              }
            }
            L35: {
              if ((this.field_fb ^ -1) >= -1) {
                break L35;
              } else {
                fieldTemp$9 = this.field_G + 1;
                this.field_G = this.field_G + 1;
                if (170 > fieldTemp$9) {
                  break L35;
                } else {
                  var2_int = 0;
                  L36: while (true) {
                    if (this.field_fb + -1 <= var2_int) {
                      this.field_G = 0;
                      this.field_fb = this.field_fb - 1;
                      break L35;
                    } else {
                      this.field_V[var2_int] = this.field_V[1 + var2_int];
                      var2_int++;
                      continue L36;
                    }
                  }
                }
              }
            }
            L37: {
              if ((this.field_j ^ -1) >= -1) {
                break L37;
              } else {
                fieldTemp$10 = this.field_s + 1;
                this.field_s = this.field_s + 1;
                if (50 > fieldTemp$10) {
                  break L37;
                } else {
                  var2_int = 0;
                  L38: while (true) {
                    if ((-1 + this.field_j ^ -1) >= (var2_int ^ -1)) {
                      this.field_j = this.field_j - 1;
                      this.field_R = null;
                      this.field_s = 0;
                      break L37;
                    } else {
                      this.field_ib[var2_int] = this.field_ib[1 + var2_int];
                      var2_int++;
                      continue L38;
                    }
                  }
                }
              }
            }
            if (this.field_S) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var2_int = 0;
              L39: while (true) {
                if ((this.field_z ^ -1) >= (var2_int ^ -1)) {
                  L40: {
                    if (-1 <= (this.field_ab ^ -1)) {
                      break L40;
                    } else {
                      var2_int = 0;
                      L41: while (true) {
                        if (var2_int >= this.field_z) {
                          break L40;
                        } else {
                          L42: {
                            if (null != this.field_C[var2_int]) {
                              this.field_C[var2_int].j(0);
                              this.a(this.field_C[var2_int], 0.019999999552965164f * this.field_C[var2_int].field_j, 0, 3.5f * this.field_C[var2_int].field_t * 0.019999999552965164f, this.field_C[var2_int].field_x * 3.5f * 0.019999999552965164f);
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          var2_int++;
                          continue L41;
                        }
                      }
                    }
                  }
                  var2_int = 0;
                  L43: while (true) {
                    if ((this.field_z ^ -1) >= (var2_int ^ -1)) {
                      L44: {
                        if (param0 <= -35) {
                          break L44;
                        } else {
                          this.a((byte) 52);
                          break L44;
                        }
                      }
                      L45: {
                        if (null == ih.field_n) {
                          break L45;
                        } else {
                          var2_int = 0;
                          L46: while (true) {
                            if (var2_int >= this.field_h) {
                              break L45;
                            } else {
                              var4 = (vf) ((Object) ih.field_n.b((byte) 113));
                              L47: while (true) {
                                if (null == var4) {
                                  var2_int++;
                                  continue L46;
                                } else {
                                  this.a(var4, -103, this.field_C[var2_int]);
                                  var4 = (vf) ((Object) ih.field_n.c((byte) -73));
                                  continue L47;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_ref = (wm) ((Object) this.field_cb.b((byte) 86));
                      L48: while (true) {
                        if (null == var4_ref) {
                          var4_ref = (wm) ((Object) this.field_d.b((byte) 127));
                          L49: while (true) {
                            if (null == var4_ref) {
                              this.field_W.a(-30510, this.field_cb);
                              var2_int = 0;
                              L50: while (true) {
                                if ((var2_int ^ -1) <= -6) {
                                  L51: {
                                    if (-1 == (this.field_J ^ -1)) {
                                      var5_int = 0;
                                      var2_int = 0;
                                      L52: while (true) {
                                        if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                          L53: {
                                            if (this.field_U) {
                                              break L53;
                                            } else {
                                              if (var5_int == 0) {
                                                this.field_U = true;
                                                this.field_ob = this.field_ab;
                                                this.a(ee.field_o, (byte) 53);
                                                if (this.field_E) {
                                                  L54: {
                                                    if (-1 == (this.field_C[0].field_R ^ -1)) {
                                                      break L54;
                                                    } else {
                                                      if (-1 != (this.field_C[1].field_R ^ -1)) {
                                                        qh.a(0, 2);
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  qh.a(0, 1);
                                                  break L53;
                                                } else {
                                                  L55: {
                                                    stackOut_373_0 = this;
                                                    stackIn_378_0 = stackOut_373_0;
                                                    stackIn_374_0 = stackOut_373_0;
                                                    if (this.field_C[0].field_R != 0) {
                                                      stackOut_378_0 = this;
                                                      stackOut_378_1 = 0;
                                                      stackIn_379_0 = stackOut_378_0;
                                                      stackIn_379_1 = stackOut_378_1;
                                                      break L55;
                                                    } else {
                                                      stackOut_374_0 = this;
                                                      stackIn_376_0 = stackOut_374_0;
                                                      stackOut_376_0 = this;
                                                      stackOut_376_1 = 1;
                                                      stackIn_379_0 = stackOut_376_0;
                                                      stackIn_379_1 = stackOut_376_1;
                                                      break L55;
                                                    }
                                                  }
                                                  L56: {
                                                    ((sg) (this)).field_b = stackIn_379_1 != 0;
                                                    if (!this.field_b) {
                                                      break L56;
                                                    } else {
                                                      L57: {
                                                        if ((this.field_rb[11] ^ -1) == -2) {
                                                          this.a(11, 244, (byte) -60);
                                                          break L57;
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                      L58: {
                                                        if ((this.field_rb[8] ^ -1) != -2) {
                                                          break L58;
                                                        } else {
                                                          this.a(8, 247, (byte) -38);
                                                          break L58;
                                                        }
                                                      }
                                                      L59: {
                                                        if (1 == this.field_rb[9]) {
                                                          this.a(9, 246, (byte) 99);
                                                          break L59;
                                                        } else {
                                                          break L59;
                                                        }
                                                      }
                                                      L60: {
                                                        if ((this.field_rb[10] ^ -1) == -2) {
                                                          this.a(10, 245, (byte) 99);
                                                          break L60;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                      if ((this.field_rb[12] ^ -1) == -2) {
                                                        this.a(12, 243, (byte) 100);
                                                        break L56;
                                                      } else {
                                                        break L56;
                                                      }
                                                    }
                                                  }
                                                  L61: {
                                                    if (this.field_C[0].field_R >= 2) {
                                                      qh.a(0, 2);
                                                      break L61;
                                                    } else {
                                                      qh.a(0, 1);
                                                      break L61;
                                                    }
                                                  }
                                                  if (7 != mi.field_d) {
                                                    break L53;
                                                  } else {
                                                    if (2 <= this.field_C[0].field_R) {
                                                      break L53;
                                                    } else {
                                                      if ((pc.field_l[cf.field_w] + -1 ^ -1) == (vg.field_P ^ -1)) {
                                                        L62: {
                                                          var6 = hn.field_y - -this.field_ob;
                                                          if (cf.field_w != 0) {
                                                            break L62;
                                                          } else {
                                                            if (22500 > var6) {
                                                              this.a(2, 253, (byte) -119);
                                                              break L62;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        L63: {
                                                          if ((cf.field_w ^ -1) == -2) {
                                                            if (30500 <= var6) {
                                                              break L63;
                                                            } else {
                                                              this.a(4, 251, (byte) 119);
                                                              break L63;
                                                            }
                                                          } else {
                                                            break L63;
                                                          }
                                                        }
                                                        L64: {
                                                          if (-3 != (cf.field_w ^ -1)) {
                                                            break L64;
                                                          } else {
                                                            if ((var6 ^ -1) <= -29001) {
                                                              break L64;
                                                            } else {
                                                              this.a(3, 252, (byte) -34);
                                                              break L64;
                                                            }
                                                          }
                                                        }
                                                        L65: {
                                                          if (cf.field_w == 3) {
                                                            if (var6 < 34000) {
                                                              this.a(5, 250, (byte) -105);
                                                              break L65;
                                                            } else {
                                                              break L65;
                                                            }
                                                          } else {
                                                            break L65;
                                                          }
                                                        }
                                                        tg.a(cf.field_w, 5, var6);
                                                        var7_int = 1;
                                                        var8 = 0;
                                                        var2_int = 0;
                                                        L66: while (true) {
                                                          L67: {
                                                            if (4 <= var2_int) {
                                                              break L67;
                                                            } else {
                                                              if (d.field_c[var2_int] != -1) {
                                                                var8 = var8 + d.field_c[var2_int];
                                                                var2_int++;
                                                                continue L66;
                                                              } else {
                                                                var7_int = 0;
                                                                break L67;
                                                              }
                                                            }
                                                          }
                                                          L68: {
                                                            if (var7_int == 0) {
                                                              break L68;
                                                            } else {
                                                              this.a(0, 255, (byte) -94);
                                                              if (-109501 < (var8 ^ -1)) {
                                                                this.a(1, 254, (byte) -83);
                                                                break L68;
                                                              } else {
                                                                break L68;
                                                              }
                                                            }
                                                          }
                                                          break L53;
                                                        }
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                          var2_int = 0;
                                          L69: while (true) {
                                            if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                              break L51;
                                            } else {
                                              stackOut_470_0 = this.field_P;
                                              stackOut_470_1 = this.field_C[var2_int].field_bc;
                                              stackIn_472_0 = stackOut_470_0;
                                              stackIn_472_1 = stackOut_470_1;
                                              L70: {
                                                if (stackIn_472_0 >= stackIn_472_1) {
                                                  break L70;
                                                } else {
                                                  this.field_P = this.field_C[var2_int].field_bc;
                                                  if ((this.field_P ^ -1) != (this.field_B ^ -1)) {
                                                    break L70;
                                                  } else {
                                                    this.a(hc.field_d, (byte) 53);
                                                    break L70;
                                                  }
                                                }
                                              }
                                              var2_int++;
                                              continue L69;
                                            }
                                          }
                                        } else {
                                          L71: {
                                            if ((this.field_C[var2_int].field_bc ^ -1) < (this.field_B ^ -1)) {
                                              break L71;
                                            } else {
                                              if (this.field_C[var2_int].field_W != null) {
                                                var5_int = 1;
                                                break L71;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          var2_int++;
                                          continue L52;
                                        }
                                      }
                                    } else {
                                      if (this.field_J == 2) {
                                        var5_int = 0;
                                        var2_int = 0;
                                        L72: while (true) {
                                          if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                            L73: {
                                              if (this.field_U) {
                                                break L73;
                                              } else {
                                                if (var5_int != 0) {
                                                  this.field_ob = this.field_ab;
                                                  this.field_U = true;
                                                  this.a(ee.field_o, (byte) 53);
                                                  if (2 > this.field_C[0].field_R) {
                                                    qh.a(0, 1);
                                                    break L73;
                                                  } else {
                                                    qh.a(0, 2);
                                                    break L73;
                                                  }
                                                } else {
                                                  break L73;
                                                }
                                              }
                                            }
                                            var2_int = 0;
                                            L74: while (true) {
                                              if (this.field_h <= var2_int) {
                                                L75: {
                                                  if (this.field_e < this.field_P) {
                                                    L76: {
                                                      if (!kb.a(16616, 0)) {
                                                        L77: {
                                                          if (-4 == (this.field_P ^ -1)) {
                                                            this.a(ij.field_n, (byte) 53);
                                                            break L77;
                                                          } else {
                                                            break L77;
                                                          }
                                                        }
                                                        if (4 == this.field_P) {
                                                          this.a(pd.field_g, (byte) 53);
                                                          break L76;
                                                        } else {
                                                          break L76;
                                                        }
                                                      } else {
                                                        var6 = 25;
                                                        L78: while (true) {
                                                          L79: {
                                                            if (var6 > 100) {
                                                              break L79;
                                                            } else {
                                                              L80: {
                                                                var7_int = 5 - var6;
                                                                if (this.field_e >= var7_int) {
                                                                  break L80;
                                                                } else {
                                                                  if ((this.field_P ^ -1) > (var7_int ^ -1)) {
                                                                    break L80;
                                                                  } else {
                                                                    this.a(sd.a(ag.field_p, new String[]{Integer.toString(var6)}, true), (byte) 53);
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                              var6 += 25;
                                                              continue L78;
                                                            }
                                                          }
                                                          break L76;
                                                        }
                                                      }
                                                    }
                                                    this.field_e = this.field_P;
                                                    break L75;
                                                  } else {
                                                    break L75;
                                                  }
                                                }
                                                break L51;
                                              } else {
                                                stackOut_316_0 = this.field_P ^ -1;
                                                stackOut_316_1 = this.field_C[var2_int].field_Sb ^ -1;
                                                stackIn_318_0 = stackOut_316_0;
                                                stackIn_318_1 = stackOut_316_1;
                                                L81: {
                                                  if (stackIn_318_0 > stackIn_318_1) {
                                                    this.field_P = this.field_C[var2_int].field_Sb;
                                                    break L81;
                                                  } else {
                                                    break L81;
                                                  }
                                                }
                                                var2_int++;
                                                continue L74;
                                              }
                                            }
                                          } else {
                                            L82: {
                                              if (this.field_C[var2_int].field_Sb < 5) {
                                                break L82;
                                              } else {
                                                var5_int = 1;
                                                if (var2_int != 0) {
                                                  break L82;
                                                } else {
                                                  if (this.field_E) {
                                                    break L82;
                                                  } else {
                                                    if (!kb.a(16616, 0)) {
                                                      break L82;
                                                    } else {
                                                      this.a(15, 240, (byte) 118);
                                                      break L82;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var2_int++;
                                            continue L72;
                                          }
                                        }
                                      } else {
                                        if (-4 != (this.field_J ^ -1)) {
                                          break L51;
                                        } else {
                                          L83: {
                                            if ((this.field_B ^ -1) != 0) {
                                              var5_int = 0;
                                              var2_int = 0;
                                              L84: while (true) {
                                                if (var2_int >= this.field_h) {
                                                  if (this.field_U) {
                                                    break L83;
                                                  } else {
                                                    if (var5_int != 0) {
                                                      break L83;
                                                    } else {
                                                      this.field_U = true;
                                                      this.field_ob = this.field_ab;
                                                      this.a(ee.field_o, (byte) 53);
                                                      qh.a(0, 1);
                                                      break L83;
                                                    }
                                                  }
                                                } else {
                                                  L85: {
                                                    if ((this.field_B ^ -1) > (this.field_C[var2_int].field_bc ^ -1)) {
                                                      break L85;
                                                    } else {
                                                      if (null == this.field_C[var2_int].field_W) {
                                                        break L85;
                                                      } else {
                                                        var5_int = 1;
                                                        break L85;
                                                      }
                                                    }
                                                  }
                                                  var2_int++;
                                                  continue L84;
                                                }
                                              }
                                            } else {
                                              break L83;
                                            }
                                          }
                                          var2_int = 0;
                                          L86: while (true) {
                                            if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                              break L51;
                                            } else {
                                              stackOut_277_0 = this.field_P;
                                              stackOut_277_1 = this.field_C[var2_int].field_bc;
                                              stackIn_279_0 = stackOut_277_0;
                                              stackIn_279_1 = stackOut_277_1;
                                              L87: {
                                                if (stackIn_279_0 < stackIn_279_1) {
                                                  this.field_P = this.field_C[var2_int].field_bc;
                                                  if ((this.field_B ^ -1) != (this.field_P ^ -1)) {
                                                    break L87;
                                                  } else {
                                                    this.a(hc.field_d, (byte) 53);
                                                    break L87;
                                                  }
                                                } else {
                                                  break L87;
                                                }
                                              }
                                              var2_int++;
                                              continue L86;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L88: {
                                    if (!this.field_U) {
                                      break L88;
                                    } else {
                                      if (-this.field_ob + this.field_ab < 150) {
                                        break L88;
                                      } else {
                                        if (this.field_T) {
                                          break L88;
                                        } else {
                                          if (-4 == (this.field_J ^ -1)) {
                                            break L88;
                                          } else {
                                            if (this.field_fb == 0) {
                                              qn.a(7, false, false);
                                              break L88;
                                            } else {
                                              break L88;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L89: {
                                    if (this.field_r != 3) {
                                      break L89;
                                    } else {
                                      if (this.field_J == 2) {
                                        break L89;
                                      } else {
                                        var2_int = 0;
                                        L90: while (true) {
                                          if ((this.field_w.length ^ -1) >= (var2_int ^ -1)) {
                                            var2_int = 0;
                                            L91: while (true) {
                                              if ((var2_int ^ -1) <= (this.field_h ^ -1)) {
                                                break L89;
                                              } else {
                                                L92: {
                                                  var5_ref = this.field_C[var2_int];
                                                  if (null != var5_ref.field_W) {
                                                    var6 = var5_ref.field_Eb;
                                                    var7 = 0.0f;
                                                    var3 = 0;
                                                    L93: while (true) {
                                                      if ((var3 ^ -1) <= ((int)var5_ref.field_Ib ^ -1)) {
                                                        L94: {
                                                          if ((int)var5_ref.field_Ib != this.field_sb.length) {
                                                            var7 = var7 + this.field_sb[(int)var5_ref.field_Ib].f(50) * (var5_ref.field_Ib - (float)(int)var5_ref.field_Ib);
                                                            break L94;
                                                          } else {
                                                            break L94;
                                                          }
                                                        }
                                                        var8 = (int)(var7 / this.field_A);
                                                        var3 = 1;
                                                        L95: while (true) {
                                                          if (4 <= var3) {
                                                            break L92;
                                                          } else {
                                                            var9 = (var3 + var8) % this.field_w.length;
                                                            var10 = (float)(-this.field_x[var9] + var5_ref.field_A.field_h);
                                                            var11 = (float)(var5_ref.field_A.field_f - this.field_u[var9]);
                                                            var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
                                                            var10 = var10 / var12;
                                                            var11 = var11 / var12;
                                                            this.field_eb[var9] = this.c(this.field_eb[var9], 6293, var6);
                                                            var3++;
                                                            continue L95;
                                                          }
                                                        }
                                                      } else {
                                                        var7 = var7 + this.field_sb[var3].f(50);
                                                        var3++;
                                                        continue L93;
                                                      }
                                                    }
                                                  } else {
                                                    break L92;
                                                  }
                                                }
                                                var2_int++;
                                                continue L91;
                                              }
                                            }
                                          } else {
                                            this.field_eb[var2_int] = 0;
                                            var2_int++;
                                            continue L90;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L96: {
                                    L97: {
                                      if (!kb.a(16616, 0)) {
                                        break L97;
                                      } else {
                                        if (2 == this.field_J) {
                                          L98: {
                                            if (this.field_ab != -100) {
                                              break L98;
                                            } else {
                                              this.a(vj.field_n, (byte) 53);
                                              break L98;
                                            }
                                          }
                                          if ((this.field_ab ^ -1) != -1) {
                                            break L96;
                                          } else {
                                            this.a(il.field_b, (byte) 53);
                                            break L96;
                                          }
                                        } else {
                                          break L97;
                                        }
                                      }
                                    }
                                    L99: {
                                      if ((this.field_ab ^ -1) == 99) {
                                        this.a(cj.field_L, (byte) 53);
                                        break L99;
                                      } else {
                                        break L99;
                                      }
                                    }
                                    L100: {
                                      if (-50 == this.field_ab) {
                                        this.a(io.field_a, (byte) 53);
                                        break L100;
                                      } else {
                                        break L100;
                                      }
                                    }
                                    if (-1 != (this.field_ab ^ -1)) {
                                      break L96;
                                    } else {
                                      this.a(il.field_b, (byte) 53);
                                      break L96;
                                    }
                                  }
                                  L101: {
                                    fieldTemp$11 = this.field_ab + 1;
                                    this.field_ab = this.field_ab + 1;
                                    if (fieldTemp$11 <= 0) {
                                      break L101;
                                    } else {
                                      if (!this.field_U) {
                                        this.field_t = this.field_t + this.field_hb;
                                        this.field_N = this.field_N - this.field_p * this.field_l;
                                        this.field_H = this.field_H + 1;
                                        this.field_y = this.field_y - (hn.field_y + (this.field_ab + this.field_g));
                                        this.field_hb = this.field_hb - 1;
                                        break L101;
                                      } else {
                                        break L101;
                                      }
                                    }
                                  }
                                  L102: {
                                    if (49 > (this.field_ab ^ -1)) {
                                      break L102;
                                    } else {
                                      if (this.field_r == 3) {
                                        var5_ref2 = (na) ((Object) this.field_Q.b((byte) 104));
                                        L103: while (true) {
                                          if (null == var5_ref2) {
                                            break L102;
                                          } else {
                                            L104: {
                                              if (var5_ref2.field_j) {
                                                if ((kj.b(2, 400) ^ -1) <= (-50 + -this.field_ab ^ -1)) {
                                                  break L104;
                                                } else {
                                                  var5_ref2.field_j = false;
                                                  break L104;
                                                }
                                              } else {
                                                if (kj.b(2, 400) < this.field_ab + 150) {
                                                  var5_ref2.field_j = true;
                                                  break L104;
                                                } else {
                                                  break L104;
                                                }
                                              }
                                            }
                                            var5_ref2 = (na) ((Object) this.field_Q.c((byte) 96));
                                            continue L103;
                                          }
                                        }
                                      } else {
                                        break L102;
                                      }
                                    }
                                  }
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  this.a(false, this.field_O[var2_int]);
                                  this.a(false, this.field_M[var2_int]);
                                  this.a(false, this.field_q[var2_int]);
                                  var2_int++;
                                  continue L50;
                                }
                              }
                            } else {
                              var4_ref.g(0);
                              var4_ref = (wm) ((Object) this.field_d.c((byte) 95));
                              continue L49;
                            }
                          }
                        } else {
                          L105: {
                            var4_ref.g(0);
                            if ((8 & var4_ref.field_J) == 0) {
                              stackOut_227_0 = 0;
                              stackIn_228_0 = stackOut_227_0;
                              break L105;
                            } else {
                              stackOut_225_0 = 1;
                              stackIn_228_0 = stackOut_225_0;
                              break L105;
                            }
                          }
                          L106: {
                            stackOut_228_0 = stackIn_228_0;
                            stackIn_231_0 = stackOut_228_0;
                            stackIn_229_0 = stackOut_228_0;
                            if ((var4_ref.field_J & 4) == 0) {
                              stackOut_231_0 = stackIn_231_0;
                              stackOut_231_1 = 0;
                              stackIn_232_0 = stackOut_231_0;
                              stackIn_232_1 = stackOut_231_1;
                              break L106;
                            } else {
                              stackOut_229_0 = stackIn_229_0;
                              stackOut_229_1 = 1;
                              stackIn_232_0 = stackOut_229_0;
                              stackIn_232_1 = stackOut_229_1;
                              break L106;
                            }
                          }
                          L107: {
                            if ((stackIn_232_0 & stackIn_232_1) != 0) {
                              this.a(-1, var4_ref);
                              break L107;
                            } else {
                              break L107;
                            }
                          }
                          var4_ref = (wm) ((Object) this.field_cb.c((byte) -95));
                          continue L48;
                        }
                      }
                    } else {
                      L108: {
                        if (this.field_C[var2_int] != null) {
                          var3 = 1 + var2_int;
                          L109: while (true) {
                            L110: {
                              if ((this.field_z ^ -1) >= (var3 ^ -1)) {
                                break L110;
                              } else {
                                L111: {
                                  if (null == this.field_C[var3]) {
                                    break L111;
                                  } else {
                                    this.a(0, this.field_C[var3], this.field_C[var2_int]);
                                    break L111;
                                  }
                                }
                                if (this.field_C[var2_int] == null) {
                                  break L110;
                                } else {
                                  var3++;
                                  continue L109;
                                }
                              }
                            }
                            if (this.field_C[var2_int] == null) {
                              break L108;
                            } else {
                              this.field_C[var2_int].b((byte) 56);
                              break L108;
                            }
                          }
                        } else {
                          break L108;
                        }
                      }
                      var2_int++;
                      continue L43;
                    }
                  }
                } else {
                  L112: {
                    if (this.field_C[var2_int] == null) {
                      break L112;
                    } else {
                      this.field_C[var2_int].g(-1245);
                      break L112;
                    }
                  }
                  var2_int++;
                  continue L39;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void d(wm param0, int param1) {
        jk discarded$3 = null;
        jk discarded$4 = null;
        jk discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              param0.d(0);
              rd.a(u.field_O.field_q, param0.field_A, -124, u.field_O);
              discarded$3 = kn.a(0, param0.field_A.field_f, 0, 128, param1 + -28976, -1, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 32, 400);
              discarded$4 = kn.a(0, param0.field_A.field_f, 0, 128, param1 ^ 28976, -4, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 128, 60);
              discarded$5 = kn.a(0, param0.field_A.field_f, 0, 128, param1 + -28976, -8, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 255, 20);
              var3_int = this.a(param1 ^ -2407, 4, 250, param0, 32, 200000.0f);
              if (param1 == 28977) {
                break L1;
              } else {
                this.b((wm) null, 63);
                break L1;
              }
            }
            L2: {
              var4 = param0.field_J & 3;
              if (0 != var4) {
                break L2;
              } else {
                if (this.field_E) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) <= -4) {
                    this.a(13, 242, (byte) 112);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("sg.L(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, boolean param1, qm param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = this.a(param0, param2.field_h, -3, param2.field_f);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("sg.K(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(String param0, float param1, int param2, ul param3, String param4) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
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
              if ((var9 ^ -1) == 0) {
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
                var6_int = -var8 + 640 >> -1154526623;
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
              discarded$2 = nm.field_c.a(param0, var6_int, var10, var8, 20 * var11, 0, -1, 1, 0, 20);
              var10 = var10 + (5 + 20 * var11);
              discarded$3 = HoldTheLine.field_F.a(param4, var6_int, var10, var8, var9, 0, -1, 1, 0, 18);
              if (param2 == -11240) {
                break L6;
              } else {
                this.field_o = 33;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("sg.UA(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L7;
            }
          }
          L8: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L8;
            }
          }
          L9: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L9;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        qm discarded$1 = null;
        RuntimeException var3 = null;
        jk var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              param1++;
              if (!param0) {
                break L1;
              } else {
                discarded$1 = this.a((ja) null, 102);
                break L1;
              }
            }
            var3_ref = (jk) ((Object) this.field_O[param1].b((byte) 118));
            L2: while (true) {
              if (var3_ref == null) {
                var3_ref = (jk) ((Object) this.field_M[param1].b((byte) 99));
                L3: while (true) {
                  if (null == var3_ref) {
                    var3_ref = (jk) ((Object) this.field_q[param1].b((byte) 87));
                    L4: while (true) {
                      if (null == var3_ref) {
                        L5: {
                          if (-4 == (this.field_r ^ -1)) {
                            vb.a(-76, this.field_I);
                            var3_ref = (jk) ((Object) this.field_O[param1].b((byte) 94));
                            L6: while (true) {
                              if (null == var3_ref) {
                                var3_ref = (jk) ((Object) this.field_M[param1].b((byte) 120));
                                L7: while (true) {
                                  if (var3_ref == null) {
                                    var3_ref = (jk) ((Object) this.field_q[param1].b((byte) 85));
                                    L8: while (true) {
                                      if (var3_ref == null) {
                                        ug.b(-1);
                                        break L5;
                                      } else {
                                        tc.e(var3_ref.field_t - var3_ref.field_u >> 1826037098, var3_ref.field_k >> -905635670, var3_ref.field_t + var3_ref.field_u >> 1265233194, var3_ref.field_k >> 1775188010, 16777215, var3_ref.field_q >> -1282966558);
                                        tc.e(var3_ref.field_t >> -1064304950, -var3_ref.field_u + var3_ref.field_k >> 1622986538, var3_ref.field_t >> -504954422, var3_ref.field_u + var3_ref.field_k >> 519587146, 16777215, var3_ref.field_q >> -1839463390);
                                        var3_ref = (jk) ((Object) this.field_q[param1].c((byte) -32));
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    tc.g(var3_ref.field_t >> 839606506, var3_ref.field_k >> 415937898, var3_ref.field_u >> -576659158, 16777215, var3_ref.field_q >> 213539714);
                                    var3_ref = (jk) ((Object) this.field_M[param1].c((byte) -84));
                                    continue L7;
                                  }
                                }
                              } else {
                                tc.g(var3_ref.field_t >> 218663338, var3_ref.field_k >> 836070762, var3_ref.field_u >> -1940883254, 16777215, var3_ref.field_q >> -820891742);
                                var3_ref = (jk) ((Object) this.field_O[param1].c((byte) -68));
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        break L0;
                      } else {
                        tc.e(-var3_ref.field_u + var3_ref.field_t >> -2140018870, var3_ref.field_k >> 1596159978, var3_ref.field_u + var3_ref.field_t >> 983605258, var3_ref.field_k >> -1196502710, var3_ref.field_o, var3_ref.field_q >> -1935993502);
                        tc.e(var3_ref.field_t >> 1674731242, var3_ref.field_k + -var3_ref.field_u >> -328596662, var3_ref.field_t >> 816795530, var3_ref.field_k - -var3_ref.field_u >> 455567562, var3_ref.field_o, var3_ref.field_q >> -829095102);
                        var3_ref = (jk) ((Object) this.field_q[param1].c((byte) -44));
                        continue L4;
                      }
                    }
                  } else {
                    tc.g(var3_ref.field_t >> 2041188586, var3_ref.field_k >> -2067987478, var3_ref.field_u >> 1885377482, var3_ref.field_o, var3_ref.field_q >> -1787315998);
                    var3_ref = (jk) ((Object) this.field_M[param1].c((byte) 88));
                    continue L3;
                  }
                }
              } else {
                tc.g(var3_ref.field_t >> 2055052266, var3_ref.field_k >> -1608826966, var3_ref.field_u >> -1588706966, var3_ref.field_o, var3_ref.field_q >> 110000578);
                var3_ref = (jk) ((Object) this.field_O[param1].c((byte) -23));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "sg.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        try {
            this.field_qb.b(0, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sg.TA(" + param0 + ')');
        }
    }

    final void a() {
        int var1 = 0;
        int var2 = 0;
        wm var3 = null;
        na var4 = null;
        vf var4_ref = null;
        int var4_int = 0;
        L0: {
          if (this.field_r != 3) {
            break L0;
          } else {
            if (!kb.a(16616, 0)) {
              var1 = 307200;
              L1: while (true) {
                if (var1 <= 0) {
                  break L0;
                } else {
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  var1--;
                  this.field_I.field_z[var1] = 0;
                  continue L1;
                }
              }
            } else {
              var2 = this.field_F * 65793;
              var1 = 307200;
              L2: while (true) {
                if (var1 <= 0) {
                  break L0;
                } else {
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  var1--;
                  this.field_I.field_z[var1] = var2;
                  continue L2;
                }
              }
            }
          }
        }
        this.e((byte) 106);
        var2 = -1;
        L3: while (true) {
          if (var2 > 3) {
            L4: {
              if (!kb.a(16616, 0)) {
                break L4;
              } else {
                this.a((long)this.field_bb, true);
                break L4;
              }
            }
            L5: {
              if (this.field_r != 3) {
                break L5;
              } else {
                if (this.field_c) {
                  break L5;
                } else {
                  this.b((byte) -96);
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_J >= 5) {
                break L6;
              } else {
                this.c(-16);
                break L6;
              }
            }
            L7: {
              if (this.field_mb == -1) {
                break L7;
              } else {
                this.a(-3);
                break L7;
              }
            }
            return;
          } else {
            var3 = (wm) ((Object) this.field_d.b((byte) 102));
            L8: while (true) {
              if (var3 == null) {
                var3 = (wm) ((Object) this.field_d.b((byte) 105));
                L9: while (true) {
                  if (var3 == null) {
                    L10: {
                      if (this.field_r != 3) {
                        break L10;
                      } else {
                        if (this.field_J == 2) {
                          break L10;
                        } else {
                          var1 = 0;
                          L11: while (true) {
                            if (var1 >= this.field_w.length) {
                              break L10;
                            } else {
                              L12: {
                                if (this.field_sb[this.field_w[var1]].field_k != var2) {
                                  break L12;
                                } else {
                                  if (this.field_eb[var1] == 0) {
                                    break L12;
                                  } else {
                                    tc.f(this.field_x[var1] - 1, this.field_u[var1] - 1, 3, 3, this.field_eb[var1]);
                                    ok.a(32381);
                                    this.field_I.f();
                                    tc.f(this.field_x[var1] - 1, this.field_u[var1] - 1, 3, 3, 16777215);
                                    ug.b(-1);
                                    break L12;
                                  }
                                }
                              }
                              var1++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                    var4 = (na) ((Object) this.field_Q.b((byte) 94));
                    L13: while (true) {
                      if (var4 == null) {
                        var3 = (wm) ((Object) this.field_cb.b((byte) 114));
                        L14: while (true) {
                          if (var3 == null) {
                            var1 = 0;
                            L15: while (true) {
                              if (var1 >= this.field_h) {
                                L16: {
                                  if (ih.field_n == null) {
                                    break L16;
                                  } else {
                                    if (var2 != 0) {
                                      break L16;
                                    } else {
                                      var4_ref = (vf) ((Object) ih.field_n.b((byte) 105));
                                      L17: while (true) {
                                        if (var4_ref == null) {
                                          break L16;
                                        } else {
                                          var4_ref.d((byte) -99);
                                          var4_ref = (vf) ((Object) ih.field_n.c((byte) -59));
                                          continue L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3 = (wm) ((Object) this.field_cb.b((byte) 126));
                                L18: while (true) {
                                  if (var3 == null) {
                                    var1 = 0;
                                    L19: while (true) {
                                      if (var1 >= this.field_z) {
                                        L20: {
                                          if (this.field_r != 3) {
                                            break L20;
                                          } else {
                                            var1 = 0;
                                            L21: while (true) {
                                              if (var1 >= this.field_h) {
                                                break L20;
                                              } else {
                                                L22: {
                                                  if (this.field_C[var1] == null) {
                                                    break L22;
                                                  } else {
                                                    if (this.field_C[var1].field_q != var2) {
                                                      break L22;
                                                    } else {
                                                      this.a(64, this.field_C[var1]);
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                var1++;
                                                continue L21;
                                              }
                                            }
                                          }
                                        }
                                        this.a(false, var2);
                                        var2++;
                                        continue L3;
                                      } else {
                                        L23: {
                                          if (this.field_C[var1] == null) {
                                            break L23;
                                          } else {
                                            if (this.field_C[var1].field_q != var2) {
                                              break L23;
                                            } else {
                                              this.a(this.field_C[var1], (byte) 101);
                                              break L23;
                                            }
                                          }
                                        }
                                        var1++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L24: {
                                      if (var3.field_q != var2) {
                                        break L24;
                                      } else {
                                        this.a(var3, 122);
                                        break L24;
                                      }
                                    }
                                    var3 = (wm) ((Object) this.field_cb.c((byte) -108));
                                    continue L18;
                                  }
                                }
                              } else {
                                L25: {
                                  if (this.field_C[var1] == null) {
                                    break L25;
                                  } else {
                                    if (this.field_C[var1].field_q != var2) {
                                      break L25;
                                    } else {
                                      var4_int = 0;
                                      L26: while (true) {
                                        if (var4_int >= 8) {
                                          break L25;
                                        } else {
                                          this.a(var4_int, -403, this.field_C[var1]);
                                          var4_int++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                }
                                var1++;
                                continue L15;
                              }
                            }
                          } else {
                            L27: {
                              if (var3.field_q != var2) {
                                break L27;
                              } else {
                                this.b(var3, 8192);
                                break L27;
                              }
                            }
                            var3 = (wm) ((Object) this.field_cb.c((byte) 127));
                            continue L14;
                          }
                        }
                      } else {
                        L28: {
                          if (!var4.field_j) {
                            break L28;
                          } else {
                            if (var4.field_m != var2) {
                              break L28;
                            } else {
                              this.a(-28, var4);
                              break L28;
                            }
                          }
                        }
                        var4 = (na) ((Object) this.field_Q.c((byte) -125));
                        continue L13;
                      }
                    }
                  } else {
                    L29: {
                      if (var3.field_q != var2) {
                        break L29;
                      } else {
                        this.a(var3, 115);
                        break L29;
                      }
                    }
                    var3 = (wm) ((Object) this.field_d.c((byte) -59));
                    continue L9;
                  }
                }
              } else {
                L30: {
                  if (var3.field_q != var2) {
                    break L30;
                  } else {
                    this.c(var3, -127);
                    break L30;
                  }
                }
                var3 = (wm) ((Object) this.field_d.c((byte) -126));
                continue L8;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_20_0 = 0;
        boolean stackIn_25_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_24_0 = false;
        try {
          L0: {
            L1: {
              if (-1 < (param1 ^ -1)) {
                break L1;
              } else {
                if (0 > param3) {
                  break L1;
                } else {
                  if (-641 >= (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (-481 >= (param3 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        var5_int = this.field_lb.field_m[param3 * 640 + param1] & 85;
                        if (param0 < 1) {
                          break L2;
                        } else {
                          var5_int = var5_int & 60;
                          break L2;
                        }
                      }
                      L3: {
                        if (0 <= (param0 ^ -1)) {
                          var5_int = var5_int & 15;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (-1 == (var5_int ^ -1)) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_20_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            L5: {
              if (param2 == -3) {
                break L5;
              } else {
                this.b((String) null, (byte) -127);
                break L5;
              }
            }
            stackOut_24_0 = b.a(false, param1, param3, this.field_jb);
            stackIn_25_0 = stackOut_24_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "sg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_25_0;
        }
    }

    final static void b(boolean param0) {
        if (!(kb.b(92))) {
            return;
        }
        try {
            pe.a(4, param0, (byte) 35);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sg.NB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        float dupTemp$1 = 0.0f;
        RuntimeException var4 = null;
        float var4_float = 0.0f;
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
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_float = this.field_C[0].field_vb;
              var5 = ce.a(-1, this.field_sb) / (float)(param1 - -1);
              var6 = (int)var4_float;
              var7 = this.field_sb[var6].f(50);
              var8 = (-var4_float + (float)(var6 + 1)) * var7;
              var9 = var5;
              if (param0 == 24936) {
                break L1;
              } else {
                this.a(33, 114, (ja) null);
                break L1;
              }
            }
            var10 = 0;
            L2: while (true) {
              if ((var10 ^ -1) <= (param1 ^ -1)) {
                break L0;
              } else {
                L3: while (true) {
                  if (var9 <= var8) {
                    var8 = var8 - var9;
                    var9 = var5;
                    var11 = -(var8 / var7) + 1.0f;
                    var12 = this.field_sb[var6].a(false, var11);
                    var13 = this.field_sb[var6].a((byte) 125, var11);
                    var14 = new qm(var12);
                    var15 = -1;
                    L4: while (true) {
                      if (var15 > 1) {
                        var10++;
                        continue L2;
                      } else {
                        L5: {
                          var14.field_f = var12.field_f + -(int)((float)(30 * var15) * var13.field_j);
                          var14.field_h = (int)(var13.field_g * (float)(var15 * 30)) + var12.field_h;
                          if (0 != (param2 ^ -1)) {
                            if (param2 == 3) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L5;
                            } else {
                              stackOut_18_0 = param2 + 1;
                              stackIn_21_0 = stackOut_18_0;
                              break L5;
                            }
                          } else {
                            stackOut_15_0 = 3 & var10 + (var15 + 1);
                            stackIn_21_0 = stackOut_15_0;
                            break L5;
                          }
                        }
                        var16 = stackIn_21_0;
                        this.field_cb.a((byte) -64, new wm(var14, var16 + 1, -1));
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    var6++;
                    stackOut_7_0 = var6 ^ -1;
                    stackOut_7_1 = this.field_sb.length ^ -1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    L6: {
                      if (stackIn_9_0 != stackIn_9_1) {
                        break L6;
                      } else {
                        var6 = 0;
                        break L6;
                      }
                    }
                    var9 = var9 - var8;
                    dupTemp$1 = this.field_sb[var6].f(50);
                    var7 = dupTemp$1;
                    var8 = dupTemp$1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ja param0, byte param1) {
        qm discarded$1 = null;
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
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        float stackIn_48_0 = 0.0f;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        float stackOut_47_0 = 0.0f;
        float stackOut_45_0 = 0.0f;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 >= (this.field_ab ^ -1)) {
                  break L2;
                } else {
                  if (null == param0.field_W) {
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            L3: {
              L4: {
                var3_int = stackIn_8_0;
                stackOut_8_0 = var3_int;
                stackIn_17_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (-3 != (this.field_J ^ -1)) {
                  break L4;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackIn_17_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (this.field_ab <= 0) {
                    break L4;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackIn_12_0 = stackOut_10_0;
                    stackOut_12_0 = stackIn_12_0;
                    stackIn_17_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (param0.field_L <= 0) {
                      break L4;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackIn_15_0 = stackOut_13_0;
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_18_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L3;
            }
            L5: {
              L6: {
                var3_int = stackIn_18_0 | stackIn_18_1;
                stackOut_18_0 = var3_int;
                stackIn_30_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if ((this.field_ab ^ -1) >= -1) {
                  break L6;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackIn_30_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (null == param0.field_W) {
                    break L6;
                  } else {
                    stackOut_20_0 = stackIn_20_0;
                    stackIn_22_0 = stackOut_20_0;
                    stackOut_22_0 = stackIn_22_0;
                    stackIn_30_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if ((param0.field_tb ^ -1) >= -51) {
                      break L6;
                    } else {
                      stackOut_23_0 = stackIn_23_0;
                      stackIn_25_0 = stackOut_23_0;
                      stackOut_25_0 = stackIn_25_0;
                      stackIn_30_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (-1 != (param0.field_O ^ -1)) {
                        break L6;
                      } else {
                        stackOut_26_0 = stackIn_26_0;
                        stackIn_28_0 = stackOut_26_0;
                        stackOut_28_0 = stackIn_28_0;
                        stackOut_28_1 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = 0;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              break L5;
            }
            L7: {
              var3_int = stackIn_31_0 | stackIn_31_1;
              stackOut_31_0 = var3_int;
              stackIn_34_0 = stackOut_31_0;
              stackIn_32_0 = stackOut_31_0;
              if ((this.field_bb / 10 % 2 ^ -1) != -1) {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = 0;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L7;
              } else {
                stackOut_32_0 = stackIn_32_0;
                stackOut_32_1 = 1;
                stackIn_35_0 = stackOut_32_0;
                stackIn_35_1 = stackOut_32_1;
                break L7;
              }
            }
            L8: {
              var3_int = stackIn_35_0 & stackIn_35_1;
              var3_int = var3_int & 1;
              if (param0.field_rc == 2) {
                var4 = param0.field_C.field_h.a(param0.field_r, 27788);
                var5 = (30000 + -param0.field_L) * 256 / 180;
                if (256 > var5) {
                  var4.d(-(var4.field_s >> -688898911) + param0.field_A.field_h, param0.field_A.field_f + -(var4.field_y >> 1620979809), var5);
                  break L8;
                } else {
                  var4.a(-(var4.field_s >> -830955647) + param0.field_A.field_h, -(var4.field_y >> 694313537) + param0.field_A.field_f);
                  break L8;
                }
              } else {
                L9: {
                  var4 = param0.field_C.field_v.a(param0.field_r, 27788);
                  if (2 == this.field_J) {
                    var5 = (param0.field_L << 1813347980) / 150 + 4096;
                    if (-4097 == (var5 ^ -1)) {
                      break L9;
                    } else {
                      ok.a(32381);
                      var6_int = var4.field_s * var5 >> -1718023860;
                      var7_int = var4.field_y * var5 >> -484982772;
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
                L10: {
                  if (var3_int != 0) {
                    ch.a(param0.field_Eb, param0.field_A.field_f, var4, param0.field_A.field_h, (byte) 98);
                    break L10;
                  } else {
                    L11: {
                      if (!this.field_pb) {
                        stackOut_47_0 = 0.5f;
                        stackIn_48_0 = stackOut_47_0;
                        break L11;
                      } else {
                        stackOut_45_0 = 1.0f;
                        stackIn_48_0 = stackOut_45_0;
                        break L11;
                      }
                    }
                    var5_float = stackIn_48_0;
                    var6 = (na) ((Object) this.field_Q.b((byte) 87));
                    L12: while (true) {
                      if (null == var6) {
                        gh.a(var4, param0.field_A.field_h, 0, param0.field_Eb, var5_float, param0.field_A.field_f);
                        break L10;
                      } else {
                        L13: {
                          if (!var6.field_j) {
                            break L13;
                          } else {
                            var7 = (float)(param0.field_A.field_h + -var6.field_l);
                            var8 = (float)(param0.field_A.field_f + -var6.field_n);
                            var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
                            var7 = var7 / var9;
                            var8 = var8 / var9;
                            var10 = -(var9 / (float)(2 * var6.field_i)) + 1.0f;
                            if (0.0f >= var10) {
                              break L13;
                            } else {
                              var5_float = var5_float + var10;
                              break L13;
                            }
                          }
                        }
                        var6 = (na) ((Object) this.field_Q.c((byte) 94));
                        continue L12;
                      }
                    }
                  }
                }
                break L8;
              }
            }
            L14: {
              if (param1 >= 96) {
                break L14;
              } else {
                discarded$1 = this.a(-17, 85, (hj) null, -39, 48);
                break L14;
              }
            }
            L15: {
              if (!this.field_kb) {
                break L15;
              } else {
                if (param0.field_Ib != -1.0f) {
                  var4_ref = le.a(this.field_sb, param0.field_Ib, (byte) -112);
                  tc.d(var4_ref.field_h, var4_ref.field_f, 5, param0.field_Eb);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              if (param0.field_J == 2) {
                tc.g(param0.field_A.field_h, param0.field_A.field_f, (int)((float)param0.field_C.field_d * 1.2999999523162842f), 8355839, 128);
                break L16;
              } else {
                if (param0.field_Fb[2] >= 2) {
                  tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 8355839, 128);
                  break L16;
                } else {
                  if (param0.field_Fb[2] == 1) {
                    tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 255, 32);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
            }
            L17: {
              if (-4 == (this.field_r ^ -1)) {
                this.b(32249, param0);
                break L17;
              } else {
                break L17;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var3);
            stackOut_96_1 = new StringBuilder().append("sg.S(");
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L18;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L18;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, wm param1) {
        RuntimeException var3 = null;
        in var3_ref = null;
        qm var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_Z = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param1.field_q, param1.field_A.field_f, true, param1.field_A.field_h)) {
                break L2;
              } else {
                var3_ref = new in(0.0f, 0.0f);
                var4 = dd.a(0, var3_ref, this.field_nb, param1.field_q, param1.field_A);
                if ((8192 & param1.field_J ^ -1) == -1) {
                  param1.field_y = (float)var4.field_h;
                  param1.field_u = (float)var4.field_f;
                  var5 = param1.field_x * var3_ref.field_g + param1.field_t * var3_ref.field_j;
                  var6 = -1.7999999523162842f * var5;
                  param1.field_t = param1.field_t + var3_ref.field_j * var6;
                  param1.field_x = param1.field_x + var6 * var3_ref.field_g;
                  break L2;
                } else {
                  this.d(param1, param0 ^ -28978);
                  if ((3 & param1.field_J ^ -1) == -1) {
                    this.field_o = this.field_o | 16;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("sg.V(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    private final void a(vk param0, int[] param1, int param2) throws IOException {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        qm discarded$12 = null;
        qm discarded$13 = null;
        int incrementValue$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        hj discarded$17 = null;
        RuntimeException var4 = null;
        th var4_ref = null;
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
        hn var25 = null;
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
        dd var40_ref_dd = null;
        int var40 = 0;
        hn var41_ref_hn = null;
        int var41 = 0;
        hn var42_ref_hn = null;
        int var42 = 0;
        qm var43_ref_qm = null;
        int var43 = 0;
        ja var43_ref_ja = null;
        int var44_int = 0;
        ja var44 = null;
        float var45 = 0.0f;
        wm var46 = null;
        float var46_float = 0.0f;
        dn var46_ref = null;
        float var47_float = 0.0f;
        int var47 = 0;
        int var48 = 0;
        na var49 = null;
        int var50 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
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
        dd stackIn_39_0 = null;
        dd stackIn_39_1 = null;
        qm stackIn_39_2 = null;
        qm stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        int stackIn_39_6 = 0;
        int stackIn_39_7 = 0;
        int stackIn_39_8 = 0;
        int stackIn_39_9 = 0;
        int stackIn_39_10 = 0;
        int stackIn_39_11 = 0;
        int stackIn_39_12 = 0;
        int stackIn_39_13 = 0;
        int stackIn_39_14 = 0;
        int stackIn_39_15 = 0;
        int stackIn_39_16 = 0;
        dd stackIn_40_0 = null;
        dd stackIn_40_1 = null;
        qm stackIn_40_2 = null;
        qm stackIn_40_3 = null;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        int stackIn_40_7 = 0;
        int stackIn_40_8 = 0;
        int stackIn_40_9 = 0;
        int stackIn_40_10 = 0;
        int stackIn_40_11 = 0;
        int stackIn_40_12 = 0;
        int stackIn_40_13 = 0;
        int stackIn_40_14 = 0;
        int stackIn_40_15 = 0;
        int stackIn_40_16 = 0;
        int stackIn_40_17 = 0;
        dd stackIn_41_0 = null;
        dd stackIn_41_1 = null;
        qm stackIn_41_2 = null;
        qm stackIn_41_3 = null;
        int stackIn_41_4 = 0;
        int stackIn_41_5 = 0;
        int stackIn_41_6 = 0;
        int stackIn_41_7 = 0;
        int stackIn_41_8 = 0;
        int stackIn_41_9 = 0;
        int stackIn_41_10 = 0;
        int stackIn_41_11 = 0;
        int stackIn_41_12 = 0;
        int stackIn_41_13 = 0;
        int stackIn_41_14 = 0;
        int stackIn_41_15 = 0;
        int stackIn_41_16 = 0;
        int stackIn_41_17 = 0;
        dd stackIn_42_0 = null;
        dd stackIn_42_1 = null;
        qm stackIn_42_2 = null;
        qm stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        int stackIn_42_8 = 0;
        int stackIn_42_9 = 0;
        int stackIn_42_10 = 0;
        int stackIn_42_11 = 0;
        int stackIn_42_12 = 0;
        int stackIn_42_13 = 0;
        int stackIn_42_14 = 0;
        int stackIn_42_15 = 0;
        int stackIn_42_16 = 0;
        int stackIn_42_17 = 0;
        dd stackIn_43_0 = null;
        dd stackIn_43_1 = null;
        qm stackIn_43_2 = null;
        qm stackIn_43_3 = null;
        int stackIn_43_4 = 0;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        int stackIn_43_8 = 0;
        int stackIn_43_9 = 0;
        int stackIn_43_10 = 0;
        int stackIn_43_11 = 0;
        int stackIn_43_12 = 0;
        int stackIn_43_13 = 0;
        int stackIn_43_14 = 0;
        int stackIn_43_15 = 0;
        int stackIn_43_16 = 0;
        int stackIn_43_17 = 0;
        int stackIn_43_18 = 0;
        dd stackIn_44_0 = null;
        dd stackIn_44_1 = null;
        qm stackIn_44_2 = null;
        qm stackIn_44_3 = null;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        int stackIn_44_9 = 0;
        int stackIn_44_10 = 0;
        int stackIn_44_11 = 0;
        int stackIn_44_12 = 0;
        int stackIn_44_13 = 0;
        int stackIn_44_14 = 0;
        int stackIn_44_15 = 0;
        int stackIn_44_16 = 0;
        int stackIn_44_17 = 0;
        int stackIn_44_18 = 0;
        dd stackIn_45_0 = null;
        dd stackIn_45_1 = null;
        qm stackIn_45_2 = null;
        qm stackIn_45_3 = null;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        int stackIn_45_6 = 0;
        int stackIn_45_7 = 0;
        int stackIn_45_8 = 0;
        int stackIn_45_9 = 0;
        int stackIn_45_10 = 0;
        int stackIn_45_11 = 0;
        int stackIn_45_12 = 0;
        int stackIn_45_13 = 0;
        int stackIn_45_14 = 0;
        int stackIn_45_15 = 0;
        int stackIn_45_16 = 0;
        int stackIn_45_17 = 0;
        int stackIn_45_18 = 0;
        dd stackIn_46_0 = null;
        dd stackIn_46_1 = null;
        qm stackIn_46_2 = null;
        qm stackIn_46_3 = null;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_46_10 = 0;
        int stackIn_46_11 = 0;
        int stackIn_46_12 = 0;
        int stackIn_46_13 = 0;
        int stackIn_46_14 = 0;
        int stackIn_46_15 = 0;
        int stackIn_46_16 = 0;
        int stackIn_46_17 = 0;
        int stackIn_46_18 = 0;
        int stackIn_46_19 = 0;
        dd stackIn_47_0 = null;
        dd stackIn_47_1 = null;
        qm stackIn_47_2 = null;
        qm stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        int stackIn_47_11 = 0;
        int stackIn_47_12 = 0;
        int stackIn_47_13 = 0;
        int stackIn_47_14 = 0;
        int stackIn_47_15 = 0;
        int stackIn_47_16 = 0;
        int stackIn_47_17 = 0;
        int stackIn_47_18 = 0;
        int stackIn_47_19 = 0;
        dd stackIn_48_0 = null;
        dd stackIn_48_1 = null;
        qm stackIn_48_2 = null;
        qm stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int stackIn_48_8 = 0;
        int stackIn_48_9 = 0;
        int stackIn_48_10 = 0;
        int stackIn_48_11 = 0;
        int stackIn_48_12 = 0;
        int stackIn_48_13 = 0;
        int stackIn_48_14 = 0;
        int stackIn_48_15 = 0;
        int stackIn_48_16 = 0;
        int stackIn_48_17 = 0;
        int stackIn_48_18 = 0;
        int stackIn_48_19 = 0;
        dd stackIn_49_0 = null;
        dd stackIn_49_1 = null;
        qm stackIn_49_2 = null;
        qm stackIn_49_3 = null;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_49_10 = 0;
        int stackIn_49_11 = 0;
        int stackIn_49_12 = 0;
        int stackIn_49_13 = 0;
        int stackIn_49_14 = 0;
        int stackIn_49_15 = 0;
        int stackIn_49_16 = 0;
        int stackIn_49_17 = 0;
        int stackIn_49_18 = 0;
        int stackIn_49_19 = 0;
        int stackIn_49_20 = 0;
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
        hn stackIn_57_0 = null;
        hn stackIn_57_1 = null;
        qm stackIn_57_2 = null;
        int stackIn_57_3 = 0;
        float stackIn_57_4 = 0.0f;
        float stackIn_57_5 = 0.0f;
        int stackIn_57_6 = 0;
        int stackIn_57_7 = 0;
        int stackIn_57_8 = 0;
        int stackIn_57_9 = 0;
        int stackIn_57_10 = 0;
        Object stackIn_57_11 = null;
        Object stackIn_57_12 = null;
        qm stackIn_57_13 = null;
        int stackIn_57_14 = 0;
        int stackIn_57_15 = 0;
        hn stackIn_58_0 = null;
        hn stackIn_58_1 = null;
        qm stackIn_58_2 = null;
        int stackIn_58_3 = 0;
        float stackIn_58_4 = 0.0f;
        float stackIn_58_5 = 0.0f;
        int stackIn_58_6 = 0;
        int stackIn_58_7 = 0;
        int stackIn_58_8 = 0;
        int stackIn_58_9 = 0;
        int stackIn_58_10 = 0;
        Object stackIn_58_11 = null;
        Object stackIn_58_12 = null;
        qm stackIn_58_13 = null;
        int stackIn_58_14 = 0;
        int stackIn_58_15 = 0;
        hn stackIn_59_0 = null;
        hn stackIn_59_1 = null;
        qm stackIn_59_2 = null;
        int stackIn_59_3 = 0;
        float stackIn_59_4 = 0.0f;
        float stackIn_59_5 = 0.0f;
        int stackIn_59_6 = 0;
        int stackIn_59_7 = 0;
        int stackIn_59_8 = 0;
        int stackIn_59_9 = 0;
        int stackIn_59_10 = 0;
        Object stackIn_59_11 = null;
        Object stackIn_59_12 = null;
        qm stackIn_59_13 = null;
        int stackIn_59_14 = 0;
        int stackIn_59_15 = 0;
        int stackIn_59_16 = 0;
        hn stackIn_60_0 = null;
        hn stackIn_60_1 = null;
        qm stackIn_60_2 = null;
        int stackIn_60_3 = 0;
        float stackIn_60_4 = 0.0f;
        float stackIn_60_5 = 0.0f;
        int stackIn_60_6 = 0;
        int stackIn_60_7 = 0;
        int stackIn_60_8 = 0;
        int stackIn_60_9 = 0;
        int stackIn_60_10 = 0;
        Object stackIn_60_11 = null;
        Object stackIn_60_12 = null;
        qm stackIn_60_13 = null;
        int stackIn_60_14 = 0;
        int stackIn_60_15 = 0;
        int stackIn_60_16 = 0;
        hn stackIn_61_0 = null;
        hn stackIn_61_1 = null;
        qm stackIn_61_2 = null;
        int stackIn_61_3 = 0;
        float stackIn_61_4 = 0.0f;
        float stackIn_61_5 = 0.0f;
        int stackIn_61_6 = 0;
        int stackIn_61_7 = 0;
        int stackIn_61_8 = 0;
        int stackIn_61_9 = 0;
        int stackIn_61_10 = 0;
        Object stackIn_61_11 = null;
        Object stackIn_61_12 = null;
        qm stackIn_61_13 = null;
        int stackIn_61_14 = 0;
        int stackIn_61_15 = 0;
        int stackIn_61_16 = 0;
        hn stackIn_62_0 = null;
        hn stackIn_62_1 = null;
        qm stackIn_62_2 = null;
        int stackIn_62_3 = 0;
        float stackIn_62_4 = 0.0f;
        float stackIn_62_5 = 0.0f;
        int stackIn_62_6 = 0;
        int stackIn_62_7 = 0;
        int stackIn_62_8 = 0;
        int stackIn_62_9 = 0;
        int stackIn_62_10 = 0;
        Object stackIn_62_11 = null;
        Object stackIn_62_12 = null;
        qm stackIn_62_13 = null;
        int stackIn_62_14 = 0;
        int stackIn_62_15 = 0;
        int stackIn_62_16 = 0;
        int stackIn_62_17 = 0;
        hn stackIn_63_0 = null;
        hn stackIn_63_1 = null;
        qm stackIn_63_2 = null;
        int stackIn_63_3 = 0;
        float stackIn_63_4 = 0.0f;
        float stackIn_63_5 = 0.0f;
        int stackIn_63_6 = 0;
        int stackIn_63_7 = 0;
        int stackIn_63_8 = 0;
        int stackIn_63_9 = 0;
        int stackIn_63_10 = 0;
        Object stackIn_63_11 = null;
        Object stackIn_63_12 = null;
        qm stackIn_63_13 = null;
        int stackIn_63_14 = 0;
        int stackIn_63_15 = 0;
        int stackIn_63_16 = 0;
        int stackIn_63_17 = 0;
        hn stackIn_64_0 = null;
        hn stackIn_64_1 = null;
        qm stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        float stackIn_64_4 = 0.0f;
        float stackIn_64_5 = 0.0f;
        int stackIn_64_6 = 0;
        int stackIn_64_7 = 0;
        int stackIn_64_8 = 0;
        int stackIn_64_9 = 0;
        int stackIn_64_10 = 0;
        Object stackIn_64_11 = null;
        Object stackIn_64_12 = null;
        qm stackIn_64_13 = null;
        int stackIn_64_14 = 0;
        int stackIn_64_15 = 0;
        int stackIn_64_16 = 0;
        int stackIn_64_17 = 0;
        hn stackIn_65_0 = null;
        hn stackIn_65_1 = null;
        qm stackIn_65_2 = null;
        int stackIn_65_3 = 0;
        float stackIn_65_4 = 0.0f;
        float stackIn_65_5 = 0.0f;
        int stackIn_65_6 = 0;
        int stackIn_65_7 = 0;
        int stackIn_65_8 = 0;
        int stackIn_65_9 = 0;
        int stackIn_65_10 = 0;
        Object stackIn_65_11 = null;
        Object stackIn_65_12 = null;
        qm stackIn_65_13 = null;
        int stackIn_65_14 = 0;
        int stackIn_65_15 = 0;
        int stackIn_65_16 = 0;
        int stackIn_65_17 = 0;
        int stackIn_65_18 = 0;
        hn stackIn_66_0 = null;
        hn stackIn_66_1 = null;
        qm stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        float stackIn_66_4 = 0.0f;
        float stackIn_66_5 = 0.0f;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        int stackIn_66_8 = 0;
        int stackIn_66_9 = 0;
        int stackIn_66_10 = 0;
        Object stackIn_66_11 = null;
        Object stackIn_66_12 = null;
        qm stackIn_66_13 = null;
        int stackIn_66_14 = 0;
        int stackIn_66_15 = 0;
        int stackIn_66_16 = 0;
        int stackIn_66_17 = 0;
        int stackIn_66_18 = 0;
        hn stackIn_67_0 = null;
        hn stackIn_67_1 = null;
        qm stackIn_67_2 = null;
        int stackIn_67_3 = 0;
        float stackIn_67_4 = 0.0f;
        float stackIn_67_5 = 0.0f;
        int stackIn_67_6 = 0;
        int stackIn_67_7 = 0;
        int stackIn_67_8 = 0;
        int stackIn_67_9 = 0;
        int stackIn_67_10 = 0;
        Object stackIn_67_11 = null;
        Object stackIn_67_12 = null;
        qm stackIn_67_13 = null;
        int stackIn_67_14 = 0;
        int stackIn_67_15 = 0;
        int stackIn_67_16 = 0;
        int stackIn_67_17 = 0;
        int stackIn_67_18 = 0;
        hn stackIn_68_0 = null;
        hn stackIn_68_1 = null;
        qm stackIn_68_2 = null;
        int stackIn_68_3 = 0;
        float stackIn_68_4 = 0.0f;
        float stackIn_68_5 = 0.0f;
        int stackIn_68_6 = 0;
        int stackIn_68_7 = 0;
        int stackIn_68_8 = 0;
        int stackIn_68_9 = 0;
        int stackIn_68_10 = 0;
        Object stackIn_68_11 = null;
        Object stackIn_68_12 = null;
        qm stackIn_68_13 = null;
        int stackIn_68_14 = 0;
        int stackIn_68_15 = 0;
        int stackIn_68_16 = 0;
        int stackIn_68_17 = 0;
        int stackIn_68_18 = 0;
        int stackIn_68_19 = 0;
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
        dd stackIn_76_0 = null;
        dd stackIn_76_1 = null;
        qm stackIn_76_2 = null;
        qm stackIn_76_3 = null;
        int stackIn_76_4 = 0;
        int stackIn_76_5 = 0;
        int stackIn_76_6 = 0;
        int stackIn_76_7 = 0;
        int stackIn_76_8 = 0;
        int stackIn_76_9 = 0;
        int stackIn_76_10 = 0;
        int stackIn_76_11 = 0;
        int stackIn_76_12 = 0;
        int stackIn_76_13 = 0;
        int stackIn_76_14 = 0;
        int stackIn_76_15 = 0;
        int stackIn_76_16 = 0;
        dd stackIn_77_0 = null;
        dd stackIn_77_1 = null;
        qm stackIn_77_2 = null;
        qm stackIn_77_3 = null;
        int stackIn_77_4 = 0;
        int stackIn_77_5 = 0;
        int stackIn_77_6 = 0;
        int stackIn_77_7 = 0;
        int stackIn_77_8 = 0;
        int stackIn_77_9 = 0;
        int stackIn_77_10 = 0;
        int stackIn_77_11 = 0;
        int stackIn_77_12 = 0;
        int stackIn_77_13 = 0;
        int stackIn_77_14 = 0;
        int stackIn_77_15 = 0;
        int stackIn_77_16 = 0;
        dd stackIn_78_0 = null;
        dd stackIn_78_1 = null;
        qm stackIn_78_2 = null;
        qm stackIn_78_3 = null;
        int stackIn_78_4 = 0;
        int stackIn_78_5 = 0;
        int stackIn_78_6 = 0;
        int stackIn_78_7 = 0;
        int stackIn_78_8 = 0;
        int stackIn_78_9 = 0;
        int stackIn_78_10 = 0;
        int stackIn_78_11 = 0;
        int stackIn_78_12 = 0;
        int stackIn_78_13 = 0;
        int stackIn_78_14 = 0;
        int stackIn_78_15 = 0;
        int stackIn_78_16 = 0;
        dd stackIn_79_0 = null;
        dd stackIn_79_1 = null;
        qm stackIn_79_2 = null;
        qm stackIn_79_3 = null;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        int stackIn_79_6 = 0;
        int stackIn_79_7 = 0;
        int stackIn_79_8 = 0;
        int stackIn_79_9 = 0;
        int stackIn_79_10 = 0;
        int stackIn_79_11 = 0;
        int stackIn_79_12 = 0;
        int stackIn_79_13 = 0;
        int stackIn_79_14 = 0;
        int stackIn_79_15 = 0;
        int stackIn_79_16 = 0;
        int stackIn_79_17 = 0;
        dd stackIn_80_0 = null;
        dd stackIn_80_1 = null;
        qm stackIn_80_2 = null;
        qm stackIn_80_3 = null;
        int stackIn_80_4 = 0;
        int stackIn_80_5 = 0;
        int stackIn_80_6 = 0;
        int stackIn_80_7 = 0;
        int stackIn_80_8 = 0;
        int stackIn_80_9 = 0;
        int stackIn_80_10 = 0;
        int stackIn_80_11 = 0;
        int stackIn_80_12 = 0;
        int stackIn_80_13 = 0;
        int stackIn_80_14 = 0;
        int stackIn_80_15 = 0;
        int stackIn_80_16 = 0;
        int stackIn_80_17 = 0;
        dd stackIn_81_0 = null;
        dd stackIn_81_1 = null;
        qm stackIn_81_2 = null;
        qm stackIn_81_3 = null;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        int stackIn_81_6 = 0;
        int stackIn_81_7 = 0;
        int stackIn_81_8 = 0;
        int stackIn_81_9 = 0;
        int stackIn_81_10 = 0;
        int stackIn_81_11 = 0;
        int stackIn_81_12 = 0;
        int stackIn_81_13 = 0;
        int stackIn_81_14 = 0;
        int stackIn_81_15 = 0;
        int stackIn_81_16 = 0;
        int stackIn_81_17 = 0;
        dd stackIn_82_0 = null;
        dd stackIn_82_1 = null;
        qm stackIn_82_2 = null;
        qm stackIn_82_3 = null;
        int stackIn_82_4 = 0;
        int stackIn_82_5 = 0;
        int stackIn_82_6 = 0;
        int stackIn_82_7 = 0;
        int stackIn_82_8 = 0;
        int stackIn_82_9 = 0;
        int stackIn_82_10 = 0;
        int stackIn_82_11 = 0;
        int stackIn_82_12 = 0;
        int stackIn_82_13 = 0;
        int stackIn_82_14 = 0;
        int stackIn_82_15 = 0;
        int stackIn_82_16 = 0;
        int stackIn_82_17 = 0;
        int stackIn_82_18 = 0;
        dd stackIn_83_0 = null;
        dd stackIn_83_1 = null;
        qm stackIn_83_2 = null;
        qm stackIn_83_3 = null;
        int stackIn_83_4 = 0;
        int stackIn_83_5 = 0;
        int stackIn_83_6 = 0;
        int stackIn_83_7 = 0;
        int stackIn_83_8 = 0;
        int stackIn_83_9 = 0;
        int stackIn_83_10 = 0;
        int stackIn_83_11 = 0;
        int stackIn_83_12 = 0;
        int stackIn_83_13 = 0;
        int stackIn_83_14 = 0;
        int stackIn_83_15 = 0;
        int stackIn_83_16 = 0;
        int stackIn_83_17 = 0;
        int stackIn_83_18 = 0;
        dd stackIn_84_0 = null;
        dd stackIn_84_1 = null;
        qm stackIn_84_2 = null;
        qm stackIn_84_3 = null;
        int stackIn_84_4 = 0;
        int stackIn_84_5 = 0;
        int stackIn_84_6 = 0;
        int stackIn_84_7 = 0;
        int stackIn_84_8 = 0;
        int stackIn_84_9 = 0;
        int stackIn_84_10 = 0;
        int stackIn_84_11 = 0;
        int stackIn_84_12 = 0;
        int stackIn_84_13 = 0;
        int stackIn_84_14 = 0;
        int stackIn_84_15 = 0;
        int stackIn_84_16 = 0;
        int stackIn_84_17 = 0;
        int stackIn_84_18 = 0;
        dd stackIn_85_0 = null;
        dd stackIn_85_1 = null;
        qm stackIn_85_2 = null;
        qm stackIn_85_3 = null;
        int stackIn_85_4 = 0;
        int stackIn_85_5 = 0;
        int stackIn_85_6 = 0;
        int stackIn_85_7 = 0;
        int stackIn_85_8 = 0;
        int stackIn_85_9 = 0;
        int stackIn_85_10 = 0;
        int stackIn_85_11 = 0;
        int stackIn_85_12 = 0;
        int stackIn_85_13 = 0;
        int stackIn_85_14 = 0;
        int stackIn_85_15 = 0;
        int stackIn_85_16 = 0;
        int stackIn_85_17 = 0;
        int stackIn_85_18 = 0;
        int stackIn_85_19 = 0;
        dd stackIn_86_0 = null;
        dd stackIn_86_1 = null;
        qm stackIn_86_2 = null;
        qm stackIn_86_3 = null;
        int stackIn_86_4 = 0;
        int stackIn_86_5 = 0;
        int stackIn_86_6 = 0;
        int stackIn_86_7 = 0;
        int stackIn_86_8 = 0;
        int stackIn_86_9 = 0;
        int stackIn_86_10 = 0;
        int stackIn_86_11 = 0;
        int stackIn_86_12 = 0;
        int stackIn_86_13 = 0;
        int stackIn_86_14 = 0;
        int stackIn_86_15 = 0;
        int stackIn_86_16 = 0;
        int stackIn_86_17 = 0;
        int stackIn_86_18 = 0;
        int stackIn_86_19 = 0;
        dd stackIn_87_0 = null;
        dd stackIn_87_1 = null;
        qm stackIn_87_2 = null;
        qm stackIn_87_3 = null;
        int stackIn_87_4 = 0;
        int stackIn_87_5 = 0;
        int stackIn_87_6 = 0;
        int stackIn_87_7 = 0;
        int stackIn_87_8 = 0;
        int stackIn_87_9 = 0;
        int stackIn_87_10 = 0;
        int stackIn_87_11 = 0;
        int stackIn_87_12 = 0;
        int stackIn_87_13 = 0;
        int stackIn_87_14 = 0;
        int stackIn_87_15 = 0;
        int stackIn_87_16 = 0;
        int stackIn_87_17 = 0;
        int stackIn_87_18 = 0;
        int stackIn_87_19 = 0;
        dd stackIn_88_0 = null;
        dd stackIn_88_1 = null;
        qm stackIn_88_2 = null;
        qm stackIn_88_3 = null;
        int stackIn_88_4 = 0;
        int stackIn_88_5 = 0;
        int stackIn_88_6 = 0;
        int stackIn_88_7 = 0;
        int stackIn_88_8 = 0;
        int stackIn_88_9 = 0;
        int stackIn_88_10 = 0;
        int stackIn_88_11 = 0;
        int stackIn_88_12 = 0;
        int stackIn_88_13 = 0;
        int stackIn_88_14 = 0;
        int stackIn_88_15 = 0;
        int stackIn_88_16 = 0;
        int stackIn_88_17 = 0;
        int stackIn_88_18 = 0;
        int stackIn_88_19 = 0;
        int stackIn_88_20 = 0;
        float stackIn_92_0 = 0.0f;
        float stackIn_127_0 = 0.0f;
        hn stackIn_131_0 = null;
        ja[] stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        ja stackIn_171_2 = null;
        ja stackIn_171_3 = null;
        int stackIn_171_4 = 0;
        int stackIn_171_5 = 0;
        int stackIn_171_6 = 0;
        float stackIn_171_7 = 0.0f;
        float stackIn_171_8 = 0.0f;
        ja[] stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        ja stackIn_173_2 = null;
        ja stackIn_173_3 = null;
        int stackIn_173_4 = 0;
        int stackIn_173_5 = 0;
        int stackIn_173_6 = 0;
        float stackIn_173_7 = 0.0f;
        float stackIn_173_8 = 0.0f;
        ja[] stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        ja stackIn_174_2 = null;
        ja stackIn_174_3 = null;
        int stackIn_174_4 = 0;
        int stackIn_174_5 = 0;
        int stackIn_174_6 = 0;
        float stackIn_174_7 = 0.0f;
        float stackIn_174_8 = 0.0f;
        wd stackIn_174_9 = null;
        ja[] stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        ja stackIn_185_2 = null;
        ja stackIn_185_3 = null;
        int stackIn_185_4 = 0;
        int stackIn_185_5 = 0;
        int stackIn_185_6 = 0;
        float stackIn_185_7 = 0.0f;
        float stackIn_185_8 = 0.0f;
        ja[] stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        ja stackIn_187_2 = null;
        ja stackIn_187_3 = null;
        int stackIn_187_4 = 0;
        int stackIn_187_5 = 0;
        int stackIn_187_6 = 0;
        float stackIn_187_7 = 0.0f;
        float stackIn_187_8 = 0.0f;
        ja[] stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        ja stackIn_188_2 = null;
        ja stackIn_188_3 = null;
        int stackIn_188_4 = 0;
        int stackIn_188_5 = 0;
        int stackIn_188_6 = 0;
        float stackIn_188_7 = 0.0f;
        float stackIn_188_8 = 0.0f;
        wd stackIn_188_9 = null;
        RuntimeException stackIn_265_0 = null;
        StringBuilder stackIn_265_1 = null;
        RuntimeException stackIn_267_0 = null;
        StringBuilder stackIn_267_1 = null;
        RuntimeException stackIn_268_0 = null;
        StringBuilder stackIn_268_1 = null;
        String stackIn_268_2 = null;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        String stackIn_272_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
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
        dd stackOut_75_0 = null;
        dd stackOut_75_1 = null;
        qm stackOut_75_2 = null;
        qm stackOut_75_3 = null;
        int stackOut_75_4 = 0;
        int stackOut_75_5 = 0;
        int stackOut_75_6 = 0;
        int stackOut_75_7 = 0;
        int stackOut_75_8 = 0;
        int stackOut_75_9 = 0;
        int stackOut_75_10 = 0;
        int stackOut_75_11 = 0;
        int stackOut_75_12 = 0;
        int stackOut_75_13 = 0;
        int stackOut_75_14 = 0;
        int stackOut_75_15 = 0;
        int stackOut_75_16 = 0;
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
        dd stackOut_76_0 = null;
        dd stackOut_76_1 = null;
        qm stackOut_76_2 = null;
        qm stackOut_76_3 = null;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        int stackOut_76_6 = 0;
        int stackOut_76_7 = 0;
        int stackOut_76_8 = 0;
        int stackOut_76_9 = 0;
        int stackOut_76_10 = 0;
        int stackOut_76_11 = 0;
        int stackOut_76_12 = 0;
        int stackOut_76_13 = 0;
        int stackOut_76_14 = 0;
        int stackOut_76_15 = 0;
        int stackOut_76_16 = 0;
        dd stackOut_78_0 = null;
        dd stackOut_78_1 = null;
        qm stackOut_78_2 = null;
        qm stackOut_78_3 = null;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        int stackOut_78_6 = 0;
        int stackOut_78_7 = 0;
        int stackOut_78_8 = 0;
        int stackOut_78_9 = 0;
        int stackOut_78_10 = 0;
        int stackOut_78_11 = 0;
        int stackOut_78_12 = 0;
        int stackOut_78_13 = 0;
        int stackOut_78_14 = 0;
        int stackOut_78_15 = 0;
        int stackOut_78_16 = 0;
        int stackOut_78_17 = 0;
        dd stackOut_77_0 = null;
        dd stackOut_77_1 = null;
        qm stackOut_77_2 = null;
        qm stackOut_77_3 = null;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        int stackOut_77_6 = 0;
        int stackOut_77_7 = 0;
        int stackOut_77_8 = 0;
        int stackOut_77_9 = 0;
        int stackOut_77_10 = 0;
        int stackOut_77_11 = 0;
        int stackOut_77_12 = 0;
        int stackOut_77_13 = 0;
        int stackOut_77_14 = 0;
        int stackOut_77_15 = 0;
        int stackOut_77_16 = 0;
        int stackOut_77_17 = 0;
        dd stackOut_79_0 = null;
        dd stackOut_79_1 = null;
        qm stackOut_79_2 = null;
        qm stackOut_79_3 = null;
        int stackOut_79_4 = 0;
        int stackOut_79_5 = 0;
        int stackOut_79_6 = 0;
        int stackOut_79_7 = 0;
        int stackOut_79_8 = 0;
        int stackOut_79_9 = 0;
        int stackOut_79_10 = 0;
        int stackOut_79_11 = 0;
        int stackOut_79_12 = 0;
        int stackOut_79_13 = 0;
        int stackOut_79_14 = 0;
        int stackOut_79_15 = 0;
        int stackOut_79_16 = 0;
        int stackOut_79_17 = 0;
        dd stackOut_81_0 = null;
        dd stackOut_81_1 = null;
        qm stackOut_81_2 = null;
        qm stackOut_81_3 = null;
        int stackOut_81_4 = 0;
        int stackOut_81_5 = 0;
        int stackOut_81_6 = 0;
        int stackOut_81_7 = 0;
        int stackOut_81_8 = 0;
        int stackOut_81_9 = 0;
        int stackOut_81_10 = 0;
        int stackOut_81_11 = 0;
        int stackOut_81_12 = 0;
        int stackOut_81_13 = 0;
        int stackOut_81_14 = 0;
        int stackOut_81_15 = 0;
        int stackOut_81_16 = 0;
        int stackOut_81_17 = 0;
        int stackOut_81_18 = 0;
        dd stackOut_80_0 = null;
        dd stackOut_80_1 = null;
        qm stackOut_80_2 = null;
        qm stackOut_80_3 = null;
        int stackOut_80_4 = 0;
        int stackOut_80_5 = 0;
        int stackOut_80_6 = 0;
        int stackOut_80_7 = 0;
        int stackOut_80_8 = 0;
        int stackOut_80_9 = 0;
        int stackOut_80_10 = 0;
        int stackOut_80_11 = 0;
        int stackOut_80_12 = 0;
        int stackOut_80_13 = 0;
        int stackOut_80_14 = 0;
        int stackOut_80_15 = 0;
        int stackOut_80_16 = 0;
        int stackOut_80_17 = 0;
        int stackOut_80_18 = 0;
        dd stackOut_82_0 = null;
        dd stackOut_82_1 = null;
        qm stackOut_82_2 = null;
        qm stackOut_82_3 = null;
        int stackOut_82_4 = 0;
        int stackOut_82_5 = 0;
        int stackOut_82_6 = 0;
        int stackOut_82_7 = 0;
        int stackOut_82_8 = 0;
        int stackOut_82_9 = 0;
        int stackOut_82_10 = 0;
        int stackOut_82_11 = 0;
        int stackOut_82_12 = 0;
        int stackOut_82_13 = 0;
        int stackOut_82_14 = 0;
        int stackOut_82_15 = 0;
        int stackOut_82_16 = 0;
        int stackOut_82_17 = 0;
        int stackOut_82_18 = 0;
        dd stackOut_84_0 = null;
        dd stackOut_84_1 = null;
        qm stackOut_84_2 = null;
        qm stackOut_84_3 = null;
        int stackOut_84_4 = 0;
        int stackOut_84_5 = 0;
        int stackOut_84_6 = 0;
        int stackOut_84_7 = 0;
        int stackOut_84_8 = 0;
        int stackOut_84_9 = 0;
        int stackOut_84_10 = 0;
        int stackOut_84_11 = 0;
        int stackOut_84_12 = 0;
        int stackOut_84_13 = 0;
        int stackOut_84_14 = 0;
        int stackOut_84_15 = 0;
        int stackOut_84_16 = 0;
        int stackOut_84_17 = 0;
        int stackOut_84_18 = 0;
        int stackOut_84_19 = 0;
        dd stackOut_83_0 = null;
        dd stackOut_83_1 = null;
        qm stackOut_83_2 = null;
        qm stackOut_83_3 = null;
        int stackOut_83_4 = 0;
        int stackOut_83_5 = 0;
        int stackOut_83_6 = 0;
        int stackOut_83_7 = 0;
        int stackOut_83_8 = 0;
        int stackOut_83_9 = 0;
        int stackOut_83_10 = 0;
        int stackOut_83_11 = 0;
        int stackOut_83_12 = 0;
        int stackOut_83_13 = 0;
        int stackOut_83_14 = 0;
        int stackOut_83_15 = 0;
        int stackOut_83_16 = 0;
        int stackOut_83_17 = 0;
        int stackOut_83_18 = 0;
        int stackOut_83_19 = 0;
        dd stackOut_85_0 = null;
        dd stackOut_85_1 = null;
        qm stackOut_85_2 = null;
        qm stackOut_85_3 = null;
        int stackOut_85_4 = 0;
        int stackOut_85_5 = 0;
        int stackOut_85_6 = 0;
        int stackOut_85_7 = 0;
        int stackOut_85_8 = 0;
        int stackOut_85_9 = 0;
        int stackOut_85_10 = 0;
        int stackOut_85_11 = 0;
        int stackOut_85_12 = 0;
        int stackOut_85_13 = 0;
        int stackOut_85_14 = 0;
        int stackOut_85_15 = 0;
        int stackOut_85_16 = 0;
        int stackOut_85_17 = 0;
        int stackOut_85_18 = 0;
        int stackOut_85_19 = 0;
        dd stackOut_87_0 = null;
        dd stackOut_87_1 = null;
        qm stackOut_87_2 = null;
        qm stackOut_87_3 = null;
        int stackOut_87_4 = 0;
        int stackOut_87_5 = 0;
        int stackOut_87_6 = 0;
        int stackOut_87_7 = 0;
        int stackOut_87_8 = 0;
        int stackOut_87_9 = 0;
        int stackOut_87_10 = 0;
        int stackOut_87_11 = 0;
        int stackOut_87_12 = 0;
        int stackOut_87_13 = 0;
        int stackOut_87_14 = 0;
        int stackOut_87_15 = 0;
        int stackOut_87_16 = 0;
        int stackOut_87_17 = 0;
        int stackOut_87_18 = 0;
        int stackOut_87_19 = 0;
        int stackOut_87_20 = 0;
        dd stackOut_86_0 = null;
        dd stackOut_86_1 = null;
        qm stackOut_86_2 = null;
        qm stackOut_86_3 = null;
        int stackOut_86_4 = 0;
        int stackOut_86_5 = 0;
        int stackOut_86_6 = 0;
        int stackOut_86_7 = 0;
        int stackOut_86_8 = 0;
        int stackOut_86_9 = 0;
        int stackOut_86_10 = 0;
        int stackOut_86_11 = 0;
        int stackOut_86_12 = 0;
        int stackOut_86_13 = 0;
        int stackOut_86_14 = 0;
        int stackOut_86_15 = 0;
        int stackOut_86_16 = 0;
        int stackOut_86_17 = 0;
        int stackOut_86_18 = 0;
        int stackOut_86_19 = 0;
        int stackOut_86_20 = 0;
        float stackOut_91_0 = 0.0f;
        float stackOut_89_0 = 0.0f;
        float stackOut_126_0 = 0.0f;
        float stackOut_124_0 = 0.0f;
        Object stackOut_130_0 = null;
        hn stackOut_128_0 = null;
        ja[] stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        ja stackOut_170_2 = null;
        ja stackOut_170_3 = null;
        int stackOut_170_4 = 0;
        int stackOut_170_5 = 0;
        int stackOut_170_6 = 0;
        float stackOut_170_7 = 0.0f;
        float stackOut_170_8 = 0.0f;
        ja[] stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        ja stackOut_173_2 = null;
        ja stackOut_173_3 = null;
        int stackOut_173_4 = 0;
        int stackOut_173_5 = 0;
        int stackOut_173_6 = 0;
        float stackOut_173_7 = 0.0f;
        float stackOut_173_8 = 0.0f;
        wd stackOut_173_9 = null;
        ja[] stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        ja stackOut_171_2 = null;
        ja stackOut_171_3 = null;
        int stackOut_171_4 = 0;
        int stackOut_171_5 = 0;
        int stackOut_171_6 = 0;
        float stackOut_171_7 = 0.0f;
        float stackOut_171_8 = 0.0f;
        wd stackOut_171_9 = null;
        ja[] stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        ja stackOut_184_2 = null;
        ja stackOut_184_3 = null;
        int stackOut_184_4 = 0;
        int stackOut_184_5 = 0;
        int stackOut_184_6 = 0;
        float stackOut_184_7 = 0.0f;
        float stackOut_184_8 = 0.0f;
        ja[] stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        ja stackOut_187_2 = null;
        ja stackOut_187_3 = null;
        int stackOut_187_4 = 0;
        int stackOut_187_5 = 0;
        int stackOut_187_6 = 0;
        float stackOut_187_7 = 0.0f;
        float stackOut_187_8 = 0.0f;
        wd stackOut_187_9 = null;
        ja[] stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        ja stackOut_185_2 = null;
        ja stackOut_185_3 = null;
        int stackOut_185_4 = 0;
        int stackOut_185_5 = 0;
        int stackOut_185_6 = 0;
        float stackOut_185_7 = 0.0f;
        float stackOut_185_8 = 0.0f;
        wd stackOut_185_9 = null;
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
        dd stackOut_39_0 = null;
        dd stackOut_39_1 = null;
        qm stackOut_39_2 = null;
        qm stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        int stackOut_39_7 = 0;
        int stackOut_39_8 = 0;
        int stackOut_39_9 = 0;
        int stackOut_39_10 = 0;
        int stackOut_39_11 = 0;
        int stackOut_39_12 = 0;
        int stackOut_39_13 = 0;
        int stackOut_39_14 = 0;
        int stackOut_39_15 = 0;
        int stackOut_39_16 = 0;
        int stackOut_39_17 = 0;
        dd stackOut_38_0 = null;
        dd stackOut_38_1 = null;
        qm stackOut_38_2 = null;
        qm stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        int stackOut_38_5 = 0;
        int stackOut_38_6 = 0;
        int stackOut_38_7 = 0;
        int stackOut_38_8 = 0;
        int stackOut_38_9 = 0;
        int stackOut_38_10 = 0;
        int stackOut_38_11 = 0;
        int stackOut_38_12 = 0;
        int stackOut_38_13 = 0;
        int stackOut_38_14 = 0;
        int stackOut_38_15 = 0;
        int stackOut_38_16 = 0;
        int stackOut_38_17 = 0;
        dd stackOut_40_0 = null;
        dd stackOut_40_1 = null;
        qm stackOut_40_2 = null;
        qm stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        int stackOut_40_6 = 0;
        int stackOut_40_7 = 0;
        int stackOut_40_8 = 0;
        int stackOut_40_9 = 0;
        int stackOut_40_10 = 0;
        int stackOut_40_11 = 0;
        int stackOut_40_12 = 0;
        int stackOut_40_13 = 0;
        int stackOut_40_14 = 0;
        int stackOut_40_15 = 0;
        int stackOut_40_16 = 0;
        int stackOut_40_17 = 0;
        dd stackOut_42_0 = null;
        dd stackOut_42_1 = null;
        qm stackOut_42_2 = null;
        qm stackOut_42_3 = null;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        int stackOut_42_8 = 0;
        int stackOut_42_9 = 0;
        int stackOut_42_10 = 0;
        int stackOut_42_11 = 0;
        int stackOut_42_12 = 0;
        int stackOut_42_13 = 0;
        int stackOut_42_14 = 0;
        int stackOut_42_15 = 0;
        int stackOut_42_16 = 0;
        int stackOut_42_17 = 0;
        int stackOut_42_18 = 0;
        dd stackOut_41_0 = null;
        dd stackOut_41_1 = null;
        qm stackOut_41_2 = null;
        qm stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        int stackOut_41_8 = 0;
        int stackOut_41_9 = 0;
        int stackOut_41_10 = 0;
        int stackOut_41_11 = 0;
        int stackOut_41_12 = 0;
        int stackOut_41_13 = 0;
        int stackOut_41_14 = 0;
        int stackOut_41_15 = 0;
        int stackOut_41_16 = 0;
        int stackOut_41_17 = 0;
        int stackOut_41_18 = 0;
        dd stackOut_43_0 = null;
        dd stackOut_43_1 = null;
        qm stackOut_43_2 = null;
        qm stackOut_43_3 = null;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        int stackOut_43_9 = 0;
        int stackOut_43_10 = 0;
        int stackOut_43_11 = 0;
        int stackOut_43_12 = 0;
        int stackOut_43_13 = 0;
        int stackOut_43_14 = 0;
        int stackOut_43_15 = 0;
        int stackOut_43_16 = 0;
        int stackOut_43_17 = 0;
        int stackOut_43_18 = 0;
        dd stackOut_45_0 = null;
        dd stackOut_45_1 = null;
        qm stackOut_45_2 = null;
        qm stackOut_45_3 = null;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_45_10 = 0;
        int stackOut_45_11 = 0;
        int stackOut_45_12 = 0;
        int stackOut_45_13 = 0;
        int stackOut_45_14 = 0;
        int stackOut_45_15 = 0;
        int stackOut_45_16 = 0;
        int stackOut_45_17 = 0;
        int stackOut_45_18 = 0;
        int stackOut_45_19 = 0;
        dd stackOut_44_0 = null;
        dd stackOut_44_1 = null;
        qm stackOut_44_2 = null;
        qm stackOut_44_3 = null;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        int stackOut_44_7 = 0;
        int stackOut_44_8 = 0;
        int stackOut_44_9 = 0;
        int stackOut_44_10 = 0;
        int stackOut_44_11 = 0;
        int stackOut_44_12 = 0;
        int stackOut_44_13 = 0;
        int stackOut_44_14 = 0;
        int stackOut_44_15 = 0;
        int stackOut_44_16 = 0;
        int stackOut_44_17 = 0;
        int stackOut_44_18 = 0;
        int stackOut_44_19 = 0;
        dd stackOut_46_0 = null;
        dd stackOut_46_1 = null;
        qm stackOut_46_2 = null;
        qm stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_46_10 = 0;
        int stackOut_46_11 = 0;
        int stackOut_46_12 = 0;
        int stackOut_46_13 = 0;
        int stackOut_46_14 = 0;
        int stackOut_46_15 = 0;
        int stackOut_46_16 = 0;
        int stackOut_46_17 = 0;
        int stackOut_46_18 = 0;
        int stackOut_46_19 = 0;
        dd stackOut_48_0 = null;
        dd stackOut_48_1 = null;
        qm stackOut_48_2 = null;
        qm stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        int stackOut_48_7 = 0;
        int stackOut_48_8 = 0;
        int stackOut_48_9 = 0;
        int stackOut_48_10 = 0;
        int stackOut_48_11 = 0;
        int stackOut_48_12 = 0;
        int stackOut_48_13 = 0;
        int stackOut_48_14 = 0;
        int stackOut_48_15 = 0;
        int stackOut_48_16 = 0;
        int stackOut_48_17 = 0;
        int stackOut_48_18 = 0;
        int stackOut_48_19 = 0;
        int stackOut_48_20 = 0;
        dd stackOut_47_0 = null;
        dd stackOut_47_1 = null;
        qm stackOut_47_2 = null;
        qm stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int stackOut_47_8 = 0;
        int stackOut_47_9 = 0;
        int stackOut_47_10 = 0;
        int stackOut_47_11 = 0;
        int stackOut_47_12 = 0;
        int stackOut_47_13 = 0;
        int stackOut_47_14 = 0;
        int stackOut_47_15 = 0;
        int stackOut_47_16 = 0;
        int stackOut_47_17 = 0;
        int stackOut_47_18 = 0;
        int stackOut_47_19 = 0;
        int stackOut_47_20 = 0;
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
        hn stackOut_56_0 = null;
        hn stackOut_56_1 = null;
        qm stackOut_56_2 = null;
        int stackOut_56_3 = 0;
        float stackOut_56_4 = 0.0f;
        float stackOut_56_5 = 0.0f;
        int stackOut_56_6 = 0;
        int stackOut_56_7 = 0;
        int stackOut_56_8 = 0;
        int stackOut_56_9 = 0;
        int stackOut_56_10 = 0;
        Object stackOut_56_11 = null;
        Object stackOut_56_12 = null;
        qm stackOut_56_13 = null;
        int stackOut_56_14 = 0;
        int stackOut_56_15 = 0;
        hn stackOut_58_0 = null;
        hn stackOut_58_1 = null;
        qm stackOut_58_2 = null;
        int stackOut_58_3 = 0;
        float stackOut_58_4 = 0.0f;
        float stackOut_58_5 = 0.0f;
        int stackOut_58_6 = 0;
        int stackOut_58_7 = 0;
        int stackOut_58_8 = 0;
        int stackOut_58_9 = 0;
        int stackOut_58_10 = 0;
        Object stackOut_58_11 = null;
        Object stackOut_58_12 = null;
        qm stackOut_58_13 = null;
        int stackOut_58_14 = 0;
        int stackOut_58_15 = 0;
        int stackOut_58_16 = 0;
        hn stackOut_57_0 = null;
        hn stackOut_57_1 = null;
        qm stackOut_57_2 = null;
        int stackOut_57_3 = 0;
        float stackOut_57_4 = 0.0f;
        float stackOut_57_5 = 0.0f;
        int stackOut_57_6 = 0;
        int stackOut_57_7 = 0;
        int stackOut_57_8 = 0;
        int stackOut_57_9 = 0;
        int stackOut_57_10 = 0;
        Object stackOut_57_11 = null;
        Object stackOut_57_12 = null;
        qm stackOut_57_13 = null;
        int stackOut_57_14 = 0;
        int stackOut_57_15 = 0;
        int stackOut_57_16 = 0;
        hn stackOut_59_0 = null;
        hn stackOut_59_1 = null;
        qm stackOut_59_2 = null;
        int stackOut_59_3 = 0;
        float stackOut_59_4 = 0.0f;
        float stackOut_59_5 = 0.0f;
        int stackOut_59_6 = 0;
        int stackOut_59_7 = 0;
        int stackOut_59_8 = 0;
        int stackOut_59_9 = 0;
        int stackOut_59_10 = 0;
        Object stackOut_59_11 = null;
        Object stackOut_59_12 = null;
        qm stackOut_59_13 = null;
        int stackOut_59_14 = 0;
        int stackOut_59_15 = 0;
        int stackOut_59_16 = 0;
        hn stackOut_61_0 = null;
        hn stackOut_61_1 = null;
        qm stackOut_61_2 = null;
        int stackOut_61_3 = 0;
        float stackOut_61_4 = 0.0f;
        float stackOut_61_5 = 0.0f;
        int stackOut_61_6 = 0;
        int stackOut_61_7 = 0;
        int stackOut_61_8 = 0;
        int stackOut_61_9 = 0;
        int stackOut_61_10 = 0;
        Object stackOut_61_11 = null;
        Object stackOut_61_12 = null;
        qm stackOut_61_13 = null;
        int stackOut_61_14 = 0;
        int stackOut_61_15 = 0;
        int stackOut_61_16 = 0;
        int stackOut_61_17 = 0;
        hn stackOut_60_0 = null;
        hn stackOut_60_1 = null;
        qm stackOut_60_2 = null;
        int stackOut_60_3 = 0;
        float stackOut_60_4 = 0.0f;
        float stackOut_60_5 = 0.0f;
        int stackOut_60_6 = 0;
        int stackOut_60_7 = 0;
        int stackOut_60_8 = 0;
        int stackOut_60_9 = 0;
        int stackOut_60_10 = 0;
        Object stackOut_60_11 = null;
        Object stackOut_60_12 = null;
        qm stackOut_60_13 = null;
        int stackOut_60_14 = 0;
        int stackOut_60_15 = 0;
        int stackOut_60_16 = 0;
        int stackOut_60_17 = 0;
        hn stackOut_62_0 = null;
        hn stackOut_62_1 = null;
        qm stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        float stackOut_62_4 = 0.0f;
        float stackOut_62_5 = 0.0f;
        int stackOut_62_6 = 0;
        int stackOut_62_7 = 0;
        int stackOut_62_8 = 0;
        int stackOut_62_9 = 0;
        int stackOut_62_10 = 0;
        Object stackOut_62_11 = null;
        Object stackOut_62_12 = null;
        qm stackOut_62_13 = null;
        int stackOut_62_14 = 0;
        int stackOut_62_15 = 0;
        int stackOut_62_16 = 0;
        int stackOut_62_17 = 0;
        hn stackOut_64_0 = null;
        hn stackOut_64_1 = null;
        qm stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        float stackOut_64_4 = 0.0f;
        float stackOut_64_5 = 0.0f;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        int stackOut_64_8 = 0;
        int stackOut_64_9 = 0;
        int stackOut_64_10 = 0;
        Object stackOut_64_11 = null;
        Object stackOut_64_12 = null;
        qm stackOut_64_13 = null;
        int stackOut_64_14 = 0;
        int stackOut_64_15 = 0;
        int stackOut_64_16 = 0;
        int stackOut_64_17 = 0;
        int stackOut_64_18 = 0;
        hn stackOut_63_0 = null;
        hn stackOut_63_1 = null;
        qm stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        float stackOut_63_4 = 0.0f;
        float stackOut_63_5 = 0.0f;
        int stackOut_63_6 = 0;
        int stackOut_63_7 = 0;
        int stackOut_63_8 = 0;
        int stackOut_63_9 = 0;
        int stackOut_63_10 = 0;
        Object stackOut_63_11 = null;
        Object stackOut_63_12 = null;
        qm stackOut_63_13 = null;
        int stackOut_63_14 = 0;
        int stackOut_63_15 = 0;
        int stackOut_63_16 = 0;
        int stackOut_63_17 = 0;
        int stackOut_63_18 = 0;
        hn stackOut_65_0 = null;
        hn stackOut_65_1 = null;
        qm stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        float stackOut_65_4 = 0.0f;
        float stackOut_65_5 = 0.0f;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        int stackOut_65_8 = 0;
        int stackOut_65_9 = 0;
        int stackOut_65_10 = 0;
        Object stackOut_65_11 = null;
        Object stackOut_65_12 = null;
        qm stackOut_65_13 = null;
        int stackOut_65_14 = 0;
        int stackOut_65_15 = 0;
        int stackOut_65_16 = 0;
        int stackOut_65_17 = 0;
        int stackOut_65_18 = 0;
        hn stackOut_67_0 = null;
        hn stackOut_67_1 = null;
        qm stackOut_67_2 = null;
        int stackOut_67_3 = 0;
        float stackOut_67_4 = 0.0f;
        float stackOut_67_5 = 0.0f;
        int stackOut_67_6 = 0;
        int stackOut_67_7 = 0;
        int stackOut_67_8 = 0;
        int stackOut_67_9 = 0;
        int stackOut_67_10 = 0;
        Object stackOut_67_11 = null;
        Object stackOut_67_12 = null;
        qm stackOut_67_13 = null;
        int stackOut_67_14 = 0;
        int stackOut_67_15 = 0;
        int stackOut_67_16 = 0;
        int stackOut_67_17 = 0;
        int stackOut_67_18 = 0;
        int stackOut_67_19 = 0;
        hn stackOut_66_0 = null;
        hn stackOut_66_1 = null;
        qm stackOut_66_2 = null;
        int stackOut_66_3 = 0;
        float stackOut_66_4 = 0.0f;
        float stackOut_66_5 = 0.0f;
        int stackOut_66_6 = 0;
        int stackOut_66_7 = 0;
        int stackOut_66_8 = 0;
        int stackOut_66_9 = 0;
        int stackOut_66_10 = 0;
        Object stackOut_66_11 = null;
        Object stackOut_66_12 = null;
        qm stackOut_66_13 = null;
        int stackOut_66_14 = 0;
        int stackOut_66_15 = 0;
        int stackOut_66_16 = 0;
        int stackOut_66_17 = 0;
        int stackOut_66_18 = 0;
        int stackOut_66_19 = 0;
        RuntimeException stackOut_264_0 = null;
        StringBuilder stackOut_264_1 = null;
        RuntimeException stackOut_267_0 = null;
        StringBuilder stackOut_267_1 = null;
        String stackOut_267_2 = null;
        RuntimeException stackOut_265_0 = null;
        StringBuilder stackOut_265_1 = null;
        String stackOut_265_2 = null;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        RuntimeException stackOut_271_0 = null;
        StringBuilder stackOut_271_1 = null;
        String stackOut_271_2 = null;
        RuntimeException stackOut_269_0 = null;
        StringBuilder stackOut_269_1 = null;
        String stackOut_269_2 = null;
        var50 = HoldTheLine.field_D;
        try {
          L0: {
            var4_ref = new th(param0.field_s);
            var5 = new byte[ho.field_m.length];
            var4_ref.a(ho.field_m.length, 0, (byte) 106, var5);
            if (!nd.a(ho.field_m, 0, var5)) {
              throw new IOException("Invalid file format!");
            } else {
              L1: {
                var6 = new byte[rh.field_a.length];
                var4_ref.a(rh.field_a.length, 0, (byte) 98, var6);
                if (!nd.a(bi.field_b, param2 + -32, var6)) {
                  if (nd.a(nc.field_e, 0, var6)) {
                    var7 = 1;
                    break L1;
                  } else {
                    throw new IOException("Invalid file version!");
                  }
                } else {
                  var7 = 0;
                  break L1;
                }
              }
              L2: {
                this.field_L = (byte)var4_ref.f((byte) -48);
                this.field_X = this.field_L & 7;
                stackOut_13_0 = this;
                stackIn_16_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (-1 != (this.field_X ^ -1)) {
                  stackOut_16_0 = this;
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (this.field_X >= 3) {
                    stackOut_19_0 = this;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if ((this.field_X ^ -1) > -7) {
                      stackOut_22_0 = this;
                      stackOut_22_1 = 2;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L2;
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = 3;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_23_1 = stackOut_20_1;
                      break L2;
                    }
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_23_0 = stackOut_17_0;
                    stackIn_23_1 = stackOut_17_1;
                    break L2;
                  }
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_23_0 = stackOut_14_0;
                  stackIn_23_1 = stackOut_14_1;
                  break L2;
                }
              }
              L3: {
                ((sg) (this)).field_r = stackIn_23_1;
                var8 = var4_ref.f((byte) -47);
                var9 = var4_ref.f((byte) -123);
                var10 = 0;
                var11 = 0;
                if (var7 != 0) {
                  var10 = var4_ref.f((byte) -105);
                  var11 = var4_ref.f((byte) -52);
                  break L3;
                } else {
                  break L3;
                }
              }
              var12 = var4_ref.f((byte) -104);
              var13 = new byte[var8 * 2];
              var4_ref.a(var8 * 2, 0, (byte) 115, var13);
              var20 = new ei();
              this.field_cb = new ah();
              this.field_d = new ah();
              var14 = 0;
              L4: while (true) {
                if ((var9 ^ -1) >= (var14 ^ -1)) {
                  L5: {
                    var21 = new qm(var4_ref.h(-14232), var4_ref.h(param2 ^ -14264));
                    var22 = new qm(var4_ref.h(-14232), var4_ref.h(param2 + -14264));
                    var16 = var4_ref.f(0);
                    var17 = var4_ref.f((byte) -75);
                    var18 = var4_ref.f(0);
                    var19 = var4_ref.f(0);
                    stackOut_69_0 = null;
                    stackOut_69_1 = null;
                    stackOut_69_2 = (qm) (var21);
                    stackOut_69_3 = (qm) (var22);
                    stackOut_69_4 = var16;
                    stackOut_69_5 = 0;
                    stackOut_69_6 = 0;
                    stackOut_69_7 = 0;
                    stackOut_69_8 = 0;
                    stackOut_69_9 = 0;
                    stackOut_69_10 = 0;
                    stackOut_69_11 = 0;
                    stackOut_69_12 = 0;
                    stackOut_69_13 = var18;
                    stackOut_69_14 = var19;
                    stackIn_72_0 = stackOut_69_0;
                    stackIn_72_1 = stackOut_69_1;
                    stackIn_72_2 = stackOut_69_2;
                    stackIn_72_3 = stackOut_69_3;
                    stackIn_72_4 = stackOut_69_4;
                    stackIn_72_5 = stackOut_69_5;
                    stackIn_72_6 = stackOut_69_6;
                    stackIn_72_7 = stackOut_69_7;
                    stackIn_72_8 = stackOut_69_8;
                    stackIn_72_9 = stackOut_69_9;
                    stackIn_72_10 = stackOut_69_10;
                    stackIn_72_11 = stackOut_69_11;
                    stackIn_72_12 = stackOut_69_12;
                    stackIn_72_13 = stackOut_69_13;
                    stackIn_72_14 = stackOut_69_14;
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
                    if (0 == (2 & var17)) {
                      stackOut_72_0 = null;
                      stackOut_72_1 = null;
                      stackOut_72_2 = (qm) ((Object) stackIn_72_2);
                      stackOut_72_3 = (qm) ((Object) stackIn_72_3);
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
                      stackOut_72_15 = 0;
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
                      break L5;
                    } else {
                      stackOut_70_0 = null;
                      stackOut_70_1 = null;
                      stackOut_70_2 = (qm) ((Object) stackIn_70_2);
                      stackOut_70_3 = (qm) ((Object) stackIn_70_3);
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
                      stackOut_70_15 = 1;
                      stackIn_73_0 = stackOut_70_0;
                      stackIn_73_1 = stackOut_70_1;
                      stackIn_73_2 = stackOut_70_2;
                      stackIn_73_3 = stackOut_70_3;
                      stackIn_73_4 = stackOut_70_4;
                      stackIn_73_5 = stackOut_70_5;
                      stackIn_73_6 = stackOut_70_6;
                      stackIn_73_7 = stackOut_70_7;
                      stackIn_73_8 = stackOut_70_8;
                      stackIn_73_9 = stackOut_70_9;
                      stackIn_73_10 = stackOut_70_10;
                      stackIn_73_11 = stackOut_70_11;
                      stackIn_73_12 = stackOut_70_12;
                      stackIn_73_13 = stackOut_70_13;
                      stackIn_73_14 = stackOut_70_14;
                      stackIn_73_15 = stackOut_70_15;
                      break L5;
                    }
                  }
                  L6: {
                    stackOut_73_0 = null;
                    stackOut_73_1 = null;
                    stackOut_73_2 = (qm) ((Object) stackIn_73_2);
                    stackOut_73_3 = (qm) ((Object) stackIn_73_3);
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
                    stackIn_74_0 = stackOut_73_0;
                    stackIn_74_1 = stackOut_73_1;
                    stackIn_74_2 = stackOut_73_2;
                    stackIn_74_3 = stackOut_73_3;
                    stackIn_74_4 = stackOut_73_4;
                    stackIn_74_5 = stackOut_73_5;
                    stackIn_74_6 = stackOut_73_6;
                    stackIn_74_7 = stackOut_73_7;
                    stackIn_74_8 = stackOut_73_8;
                    stackIn_74_9 = stackOut_73_9;
                    stackIn_74_10 = stackOut_73_10;
                    stackIn_74_11 = stackOut_73_11;
                    stackIn_74_12 = stackOut_73_12;
                    stackIn_74_13 = stackOut_73_13;
                    stackIn_74_14 = stackOut_73_14;
                    stackIn_74_15 = stackOut_73_15;
                    if ((var17 & 4) == 0) {
                      stackOut_75_0 = null;
                      stackOut_75_1 = null;
                      stackOut_75_2 = (qm) ((Object) stackIn_75_2);
                      stackOut_75_3 = (qm) ((Object) stackIn_75_3);
                      stackOut_75_4 = stackIn_75_4;
                      stackOut_75_5 = stackIn_75_5;
                      stackOut_75_6 = stackIn_75_6;
                      stackOut_75_7 = stackIn_75_7;
                      stackOut_75_8 = stackIn_75_8;
                      stackOut_75_9 = stackIn_75_9;
                      stackOut_75_10 = stackIn_75_10;
                      stackOut_75_11 = stackIn_75_11;
                      stackOut_75_12 = stackIn_75_12;
                      stackOut_75_13 = stackIn_75_13;
                      stackOut_75_14 = stackIn_75_14;
                      stackOut_75_15 = stackIn_75_15;
                      stackOut_75_16 = 0;
                      stackIn_76_0 = stackOut_75_0;
                      stackIn_76_1 = stackOut_75_1;
                      stackIn_76_2 = stackOut_75_2;
                      stackIn_76_3 = stackOut_75_3;
                      stackIn_76_4 = stackOut_75_4;
                      stackIn_76_5 = stackOut_75_5;
                      stackIn_76_6 = stackOut_75_6;
                      stackIn_76_7 = stackOut_75_7;
                      stackIn_76_8 = stackOut_75_8;
                      stackIn_76_9 = stackOut_75_9;
                      stackIn_76_10 = stackOut_75_10;
                      stackIn_76_11 = stackOut_75_11;
                      stackIn_76_12 = stackOut_75_12;
                      stackIn_76_13 = stackOut_75_13;
                      stackIn_76_14 = stackOut_75_14;
                      stackIn_76_15 = stackOut_75_15;
                      stackIn_76_16 = stackOut_75_16;
                      break L6;
                    } else {
                      stackOut_74_0 = null;
                      stackOut_74_1 = null;
                      stackOut_74_2 = (qm) ((Object) stackIn_74_2);
                      stackOut_74_3 = (qm) ((Object) stackIn_74_3);
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
                      stackOut_74_16 = 1;
                      stackIn_76_0 = stackOut_74_0;
                      stackIn_76_1 = stackOut_74_1;
                      stackIn_76_2 = stackOut_74_2;
                      stackIn_76_3 = stackOut_74_3;
                      stackIn_76_4 = stackOut_74_4;
                      stackIn_76_5 = stackOut_74_5;
                      stackIn_76_6 = stackOut_74_6;
                      stackIn_76_7 = stackOut_74_7;
                      stackIn_76_8 = stackOut_74_8;
                      stackIn_76_9 = stackOut_74_9;
                      stackIn_76_10 = stackOut_74_10;
                      stackIn_76_11 = stackOut_74_11;
                      stackIn_76_12 = stackOut_74_12;
                      stackIn_76_13 = stackOut_74_13;
                      stackIn_76_14 = stackOut_74_14;
                      stackIn_76_15 = stackOut_74_15;
                      stackIn_76_16 = stackOut_74_16;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_76_0 = null;
                    stackOut_76_1 = null;
                    stackOut_76_2 = (qm) ((Object) stackIn_76_2);
                    stackOut_76_3 = (qm) ((Object) stackIn_76_3);
                    stackOut_76_4 = stackIn_76_4;
                    stackOut_76_5 = stackIn_76_5;
                    stackOut_76_6 = stackIn_76_6;
                    stackOut_76_7 = stackIn_76_7;
                    stackOut_76_8 = stackIn_76_8;
                    stackOut_76_9 = stackIn_76_9;
                    stackOut_76_10 = stackIn_76_10;
                    stackOut_76_11 = stackIn_76_11;
                    stackOut_76_12 = stackIn_76_12;
                    stackOut_76_13 = stackIn_76_13;
                    stackOut_76_14 = stackIn_76_14;
                    stackOut_76_15 = stackIn_76_15;
                    stackOut_76_16 = stackIn_76_16;
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_78_1 = stackOut_76_1;
                    stackIn_78_2 = stackOut_76_2;
                    stackIn_78_3 = stackOut_76_3;
                    stackIn_78_4 = stackOut_76_4;
                    stackIn_78_5 = stackOut_76_5;
                    stackIn_78_6 = stackOut_76_6;
                    stackIn_78_7 = stackOut_76_7;
                    stackIn_78_8 = stackOut_76_8;
                    stackIn_78_9 = stackOut_76_9;
                    stackIn_78_10 = stackOut_76_10;
                    stackIn_78_11 = stackOut_76_11;
                    stackIn_78_12 = stackOut_76_12;
                    stackIn_78_13 = stackOut_76_13;
                    stackIn_78_14 = stackOut_76_14;
                    stackIn_78_15 = stackOut_76_15;
                    stackIn_78_16 = stackOut_76_16;
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    stackIn_77_2 = stackOut_76_2;
                    stackIn_77_3 = stackOut_76_3;
                    stackIn_77_4 = stackOut_76_4;
                    stackIn_77_5 = stackOut_76_5;
                    stackIn_77_6 = stackOut_76_6;
                    stackIn_77_7 = stackOut_76_7;
                    stackIn_77_8 = stackOut_76_8;
                    stackIn_77_9 = stackOut_76_9;
                    stackIn_77_10 = stackOut_76_10;
                    stackIn_77_11 = stackOut_76_11;
                    stackIn_77_12 = stackOut_76_12;
                    stackIn_77_13 = stackOut_76_13;
                    stackIn_77_14 = stackOut_76_14;
                    stackIn_77_15 = stackOut_76_15;
                    stackIn_77_16 = stackOut_76_16;
                    if (-1 == (var17 & 1 ^ -1)) {
                      stackOut_78_0 = null;
                      stackOut_78_1 = null;
                      stackOut_78_2 = (qm) ((Object) stackIn_78_2);
                      stackOut_78_3 = (qm) ((Object) stackIn_78_3);
                      stackOut_78_4 = stackIn_78_4;
                      stackOut_78_5 = stackIn_78_5;
                      stackOut_78_6 = stackIn_78_6;
                      stackOut_78_7 = stackIn_78_7;
                      stackOut_78_8 = stackIn_78_8;
                      stackOut_78_9 = stackIn_78_9;
                      stackOut_78_10 = stackIn_78_10;
                      stackOut_78_11 = stackIn_78_11;
                      stackOut_78_12 = stackIn_78_12;
                      stackOut_78_13 = stackIn_78_13;
                      stackOut_78_14 = stackIn_78_14;
                      stackOut_78_15 = stackIn_78_15;
                      stackOut_78_16 = stackIn_78_16;
                      stackOut_78_17 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      stackIn_79_2 = stackOut_78_2;
                      stackIn_79_3 = stackOut_78_3;
                      stackIn_79_4 = stackOut_78_4;
                      stackIn_79_5 = stackOut_78_5;
                      stackIn_79_6 = stackOut_78_6;
                      stackIn_79_7 = stackOut_78_7;
                      stackIn_79_8 = stackOut_78_8;
                      stackIn_79_9 = stackOut_78_9;
                      stackIn_79_10 = stackOut_78_10;
                      stackIn_79_11 = stackOut_78_11;
                      stackIn_79_12 = stackOut_78_12;
                      stackIn_79_13 = stackOut_78_13;
                      stackIn_79_14 = stackOut_78_14;
                      stackIn_79_15 = stackOut_78_15;
                      stackIn_79_16 = stackOut_78_16;
                      stackIn_79_17 = stackOut_78_17;
                      break L7;
                    } else {
                      stackOut_77_0 = null;
                      stackOut_77_1 = null;
                      stackOut_77_2 = (qm) ((Object) stackIn_77_2);
                      stackOut_77_3 = (qm) ((Object) stackIn_77_3);
                      stackOut_77_4 = stackIn_77_4;
                      stackOut_77_5 = stackIn_77_5;
                      stackOut_77_6 = stackIn_77_6;
                      stackOut_77_7 = stackIn_77_7;
                      stackOut_77_8 = stackIn_77_8;
                      stackOut_77_9 = stackIn_77_9;
                      stackOut_77_10 = stackIn_77_10;
                      stackOut_77_11 = stackIn_77_11;
                      stackOut_77_12 = stackIn_77_12;
                      stackOut_77_13 = stackIn_77_13;
                      stackOut_77_14 = stackIn_77_14;
                      stackOut_77_15 = stackIn_77_15;
                      stackOut_77_16 = stackIn_77_16;
                      stackOut_77_17 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      stackIn_79_2 = stackOut_77_2;
                      stackIn_79_3 = stackOut_77_3;
                      stackIn_79_4 = stackOut_77_4;
                      stackIn_79_5 = stackOut_77_5;
                      stackIn_79_6 = stackOut_77_6;
                      stackIn_79_7 = stackOut_77_7;
                      stackIn_79_8 = stackOut_77_8;
                      stackIn_79_9 = stackOut_77_9;
                      stackIn_79_10 = stackOut_77_10;
                      stackIn_79_11 = stackOut_77_11;
                      stackIn_79_12 = stackOut_77_12;
                      stackIn_79_13 = stackOut_77_13;
                      stackIn_79_14 = stackOut_77_14;
                      stackIn_79_15 = stackOut_77_15;
                      stackIn_79_16 = stackOut_77_16;
                      stackIn_79_17 = stackOut_77_17;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_79_0 = null;
                    stackOut_79_1 = null;
                    stackOut_79_2 = (qm) ((Object) stackIn_79_2);
                    stackOut_79_3 = (qm) ((Object) stackIn_79_3);
                    stackOut_79_4 = stackIn_79_4;
                    stackOut_79_5 = stackIn_79_5;
                    stackOut_79_6 = stackIn_79_6;
                    stackOut_79_7 = stackIn_79_7;
                    stackOut_79_8 = stackIn_79_8;
                    stackOut_79_9 = stackIn_79_9;
                    stackOut_79_10 = stackIn_79_10;
                    stackOut_79_11 = stackIn_79_11;
                    stackOut_79_12 = stackIn_79_12;
                    stackOut_79_13 = stackIn_79_13;
                    stackOut_79_14 = stackIn_79_14;
                    stackOut_79_15 = stackIn_79_15;
                    stackOut_79_16 = stackIn_79_16;
                    stackOut_79_17 = stackIn_79_17;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    stackIn_81_2 = stackOut_79_2;
                    stackIn_81_3 = stackOut_79_3;
                    stackIn_81_4 = stackOut_79_4;
                    stackIn_81_5 = stackOut_79_5;
                    stackIn_81_6 = stackOut_79_6;
                    stackIn_81_7 = stackOut_79_7;
                    stackIn_81_8 = stackOut_79_8;
                    stackIn_81_9 = stackOut_79_9;
                    stackIn_81_10 = stackOut_79_10;
                    stackIn_81_11 = stackOut_79_11;
                    stackIn_81_12 = stackOut_79_12;
                    stackIn_81_13 = stackOut_79_13;
                    stackIn_81_14 = stackOut_79_14;
                    stackIn_81_15 = stackOut_79_15;
                    stackIn_81_16 = stackOut_79_16;
                    stackIn_81_17 = stackOut_79_17;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    stackIn_80_2 = stackOut_79_2;
                    stackIn_80_3 = stackOut_79_3;
                    stackIn_80_4 = stackOut_79_4;
                    stackIn_80_5 = stackOut_79_5;
                    stackIn_80_6 = stackOut_79_6;
                    stackIn_80_7 = stackOut_79_7;
                    stackIn_80_8 = stackOut_79_8;
                    stackIn_80_9 = stackOut_79_9;
                    stackIn_80_10 = stackOut_79_10;
                    stackIn_80_11 = stackOut_79_11;
                    stackIn_80_12 = stackOut_79_12;
                    stackIn_80_13 = stackOut_79_13;
                    stackIn_80_14 = stackOut_79_14;
                    stackIn_80_15 = stackOut_79_15;
                    stackIn_80_16 = stackOut_79_16;
                    stackIn_80_17 = stackOut_79_17;
                    if (0 == (8 & var17)) {
                      stackOut_81_0 = null;
                      stackOut_81_1 = null;
                      stackOut_81_2 = (qm) ((Object) stackIn_81_2);
                      stackOut_81_3 = (qm) ((Object) stackIn_81_3);
                      stackOut_81_4 = stackIn_81_4;
                      stackOut_81_5 = stackIn_81_5;
                      stackOut_81_6 = stackIn_81_6;
                      stackOut_81_7 = stackIn_81_7;
                      stackOut_81_8 = stackIn_81_8;
                      stackOut_81_9 = stackIn_81_9;
                      stackOut_81_10 = stackIn_81_10;
                      stackOut_81_11 = stackIn_81_11;
                      stackOut_81_12 = stackIn_81_12;
                      stackOut_81_13 = stackIn_81_13;
                      stackOut_81_14 = stackIn_81_14;
                      stackOut_81_15 = stackIn_81_15;
                      stackOut_81_16 = stackIn_81_16;
                      stackOut_81_17 = stackIn_81_17;
                      stackOut_81_18 = 0;
                      stackIn_82_0 = stackOut_81_0;
                      stackIn_82_1 = stackOut_81_1;
                      stackIn_82_2 = stackOut_81_2;
                      stackIn_82_3 = stackOut_81_3;
                      stackIn_82_4 = stackOut_81_4;
                      stackIn_82_5 = stackOut_81_5;
                      stackIn_82_6 = stackOut_81_6;
                      stackIn_82_7 = stackOut_81_7;
                      stackIn_82_8 = stackOut_81_8;
                      stackIn_82_9 = stackOut_81_9;
                      stackIn_82_10 = stackOut_81_10;
                      stackIn_82_11 = stackOut_81_11;
                      stackIn_82_12 = stackOut_81_12;
                      stackIn_82_13 = stackOut_81_13;
                      stackIn_82_14 = stackOut_81_14;
                      stackIn_82_15 = stackOut_81_15;
                      stackIn_82_16 = stackOut_81_16;
                      stackIn_82_17 = stackOut_81_17;
                      stackIn_82_18 = stackOut_81_18;
                      break L8;
                    } else {
                      stackOut_80_0 = null;
                      stackOut_80_1 = null;
                      stackOut_80_2 = (qm) ((Object) stackIn_80_2);
                      stackOut_80_3 = (qm) ((Object) stackIn_80_3);
                      stackOut_80_4 = stackIn_80_4;
                      stackOut_80_5 = stackIn_80_5;
                      stackOut_80_6 = stackIn_80_6;
                      stackOut_80_7 = stackIn_80_7;
                      stackOut_80_8 = stackIn_80_8;
                      stackOut_80_9 = stackIn_80_9;
                      stackOut_80_10 = stackIn_80_10;
                      stackOut_80_11 = stackIn_80_11;
                      stackOut_80_12 = stackIn_80_12;
                      stackOut_80_13 = stackIn_80_13;
                      stackOut_80_14 = stackIn_80_14;
                      stackOut_80_15 = stackIn_80_15;
                      stackOut_80_16 = stackIn_80_16;
                      stackOut_80_17 = stackIn_80_17;
                      stackOut_80_18 = 1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_82_2 = stackOut_80_2;
                      stackIn_82_3 = stackOut_80_3;
                      stackIn_82_4 = stackOut_80_4;
                      stackIn_82_5 = stackOut_80_5;
                      stackIn_82_6 = stackOut_80_6;
                      stackIn_82_7 = stackOut_80_7;
                      stackIn_82_8 = stackOut_80_8;
                      stackIn_82_9 = stackOut_80_9;
                      stackIn_82_10 = stackOut_80_10;
                      stackIn_82_11 = stackOut_80_11;
                      stackIn_82_12 = stackOut_80_12;
                      stackIn_82_13 = stackOut_80_13;
                      stackIn_82_14 = stackOut_80_14;
                      stackIn_82_15 = stackOut_80_15;
                      stackIn_82_16 = stackOut_80_16;
                      stackIn_82_17 = stackOut_80_17;
                      stackIn_82_18 = stackOut_80_18;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_82_0 = null;
                    stackOut_82_1 = null;
                    stackOut_82_2 = (qm) ((Object) stackIn_82_2);
                    stackOut_82_3 = (qm) ((Object) stackIn_82_3);
                    stackOut_82_4 = stackIn_82_4;
                    stackOut_82_5 = stackIn_82_5;
                    stackOut_82_6 = stackIn_82_6;
                    stackOut_82_7 = stackIn_82_7;
                    stackOut_82_8 = stackIn_82_8;
                    stackOut_82_9 = stackIn_82_9;
                    stackOut_82_10 = stackIn_82_10;
                    stackOut_82_11 = stackIn_82_11;
                    stackOut_82_12 = stackIn_82_12;
                    stackOut_82_13 = stackIn_82_13;
                    stackOut_82_14 = stackIn_82_14;
                    stackOut_82_15 = stackIn_82_15;
                    stackOut_82_16 = stackIn_82_16;
                    stackOut_82_17 = stackIn_82_17;
                    stackOut_82_18 = stackIn_82_18;
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    stackIn_84_2 = stackOut_82_2;
                    stackIn_84_3 = stackOut_82_3;
                    stackIn_84_4 = stackOut_82_4;
                    stackIn_84_5 = stackOut_82_5;
                    stackIn_84_6 = stackOut_82_6;
                    stackIn_84_7 = stackOut_82_7;
                    stackIn_84_8 = stackOut_82_8;
                    stackIn_84_9 = stackOut_82_9;
                    stackIn_84_10 = stackOut_82_10;
                    stackIn_84_11 = stackOut_82_11;
                    stackIn_84_12 = stackOut_82_12;
                    stackIn_84_13 = stackOut_82_13;
                    stackIn_84_14 = stackOut_82_14;
                    stackIn_84_15 = stackOut_82_15;
                    stackIn_84_16 = stackOut_82_16;
                    stackIn_84_17 = stackOut_82_17;
                    stackIn_84_18 = stackOut_82_18;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    stackIn_83_2 = stackOut_82_2;
                    stackIn_83_3 = stackOut_82_3;
                    stackIn_83_4 = stackOut_82_4;
                    stackIn_83_5 = stackOut_82_5;
                    stackIn_83_6 = stackOut_82_6;
                    stackIn_83_7 = stackOut_82_7;
                    stackIn_83_8 = stackOut_82_8;
                    stackIn_83_9 = stackOut_82_9;
                    stackIn_83_10 = stackOut_82_10;
                    stackIn_83_11 = stackOut_82_11;
                    stackIn_83_12 = stackOut_82_12;
                    stackIn_83_13 = stackOut_82_13;
                    stackIn_83_14 = stackOut_82_14;
                    stackIn_83_15 = stackOut_82_15;
                    stackIn_83_16 = stackOut_82_16;
                    stackIn_83_17 = stackOut_82_17;
                    stackIn_83_18 = stackOut_82_18;
                    if ((16 & var17) == 0) {
                      stackOut_84_0 = null;
                      stackOut_84_1 = null;
                      stackOut_84_2 = (qm) ((Object) stackIn_84_2);
                      stackOut_84_3 = (qm) ((Object) stackIn_84_3);
                      stackOut_84_4 = stackIn_84_4;
                      stackOut_84_5 = stackIn_84_5;
                      stackOut_84_6 = stackIn_84_6;
                      stackOut_84_7 = stackIn_84_7;
                      stackOut_84_8 = stackIn_84_8;
                      stackOut_84_9 = stackIn_84_9;
                      stackOut_84_10 = stackIn_84_10;
                      stackOut_84_11 = stackIn_84_11;
                      stackOut_84_12 = stackIn_84_12;
                      stackOut_84_13 = stackIn_84_13;
                      stackOut_84_14 = stackIn_84_14;
                      stackOut_84_15 = stackIn_84_15;
                      stackOut_84_16 = stackIn_84_16;
                      stackOut_84_17 = stackIn_84_17;
                      stackOut_84_18 = stackIn_84_18;
                      stackOut_84_19 = 0;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      stackIn_85_2 = stackOut_84_2;
                      stackIn_85_3 = stackOut_84_3;
                      stackIn_85_4 = stackOut_84_4;
                      stackIn_85_5 = stackOut_84_5;
                      stackIn_85_6 = stackOut_84_6;
                      stackIn_85_7 = stackOut_84_7;
                      stackIn_85_8 = stackOut_84_8;
                      stackIn_85_9 = stackOut_84_9;
                      stackIn_85_10 = stackOut_84_10;
                      stackIn_85_11 = stackOut_84_11;
                      stackIn_85_12 = stackOut_84_12;
                      stackIn_85_13 = stackOut_84_13;
                      stackIn_85_14 = stackOut_84_14;
                      stackIn_85_15 = stackOut_84_15;
                      stackIn_85_16 = stackOut_84_16;
                      stackIn_85_17 = stackOut_84_17;
                      stackIn_85_18 = stackOut_84_18;
                      stackIn_85_19 = stackOut_84_19;
                      break L9;
                    } else {
                      stackOut_83_0 = null;
                      stackOut_83_1 = null;
                      stackOut_83_2 = (qm) ((Object) stackIn_83_2);
                      stackOut_83_3 = (qm) ((Object) stackIn_83_3);
                      stackOut_83_4 = stackIn_83_4;
                      stackOut_83_5 = stackIn_83_5;
                      stackOut_83_6 = stackIn_83_6;
                      stackOut_83_7 = stackIn_83_7;
                      stackOut_83_8 = stackIn_83_8;
                      stackOut_83_9 = stackIn_83_9;
                      stackOut_83_10 = stackIn_83_10;
                      stackOut_83_11 = stackIn_83_11;
                      stackOut_83_12 = stackIn_83_12;
                      stackOut_83_13 = stackIn_83_13;
                      stackOut_83_14 = stackIn_83_14;
                      stackOut_83_15 = stackIn_83_15;
                      stackOut_83_16 = stackIn_83_16;
                      stackOut_83_17 = stackIn_83_17;
                      stackOut_83_18 = stackIn_83_18;
                      stackOut_83_19 = 1;
                      stackIn_85_0 = stackOut_83_0;
                      stackIn_85_1 = stackOut_83_1;
                      stackIn_85_2 = stackOut_83_2;
                      stackIn_85_3 = stackOut_83_3;
                      stackIn_85_4 = stackOut_83_4;
                      stackIn_85_5 = stackOut_83_5;
                      stackIn_85_6 = stackOut_83_6;
                      stackIn_85_7 = stackOut_83_7;
                      stackIn_85_8 = stackOut_83_8;
                      stackIn_85_9 = stackOut_83_9;
                      stackIn_85_10 = stackOut_83_10;
                      stackIn_85_11 = stackOut_83_11;
                      stackIn_85_12 = stackOut_83_12;
                      stackIn_85_13 = stackOut_83_13;
                      stackIn_85_14 = stackOut_83_14;
                      stackIn_85_15 = stackOut_83_15;
                      stackIn_85_16 = stackOut_83_16;
                      stackIn_85_17 = stackOut_83_17;
                      stackIn_85_18 = stackOut_83_18;
                      stackIn_85_19 = stackOut_83_19;
                      break L9;
                    }
                  }
                  L10: {
                    stackOut_85_0 = null;
                    stackOut_85_1 = null;
                    stackOut_85_2 = (qm) ((Object) stackIn_85_2);
                    stackOut_85_3 = (qm) ((Object) stackIn_85_3);
                    stackOut_85_4 = stackIn_85_4;
                    stackOut_85_5 = stackIn_85_5;
                    stackOut_85_6 = stackIn_85_6;
                    stackOut_85_7 = stackIn_85_7;
                    stackOut_85_8 = stackIn_85_8;
                    stackOut_85_9 = stackIn_85_9;
                    stackOut_85_10 = stackIn_85_10;
                    stackOut_85_11 = stackIn_85_11;
                    stackOut_85_12 = stackIn_85_12;
                    stackOut_85_13 = stackIn_85_13;
                    stackOut_85_14 = stackIn_85_14;
                    stackOut_85_15 = stackIn_85_15;
                    stackOut_85_16 = stackIn_85_16;
                    stackOut_85_17 = stackIn_85_17;
                    stackOut_85_18 = stackIn_85_18;
                    stackOut_85_19 = stackIn_85_19;
                    stackIn_87_0 = stackOut_85_0;
                    stackIn_87_1 = stackOut_85_1;
                    stackIn_87_2 = stackOut_85_2;
                    stackIn_87_3 = stackOut_85_3;
                    stackIn_87_4 = stackOut_85_4;
                    stackIn_87_5 = stackOut_85_5;
                    stackIn_87_6 = stackOut_85_6;
                    stackIn_87_7 = stackOut_85_7;
                    stackIn_87_8 = stackOut_85_8;
                    stackIn_87_9 = stackOut_85_9;
                    stackIn_87_10 = stackOut_85_10;
                    stackIn_87_11 = stackOut_85_11;
                    stackIn_87_12 = stackOut_85_12;
                    stackIn_87_13 = stackOut_85_13;
                    stackIn_87_14 = stackOut_85_14;
                    stackIn_87_15 = stackOut_85_15;
                    stackIn_87_16 = stackOut_85_16;
                    stackIn_87_17 = stackOut_85_17;
                    stackIn_87_18 = stackOut_85_18;
                    stackIn_87_19 = stackOut_85_19;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    stackIn_86_2 = stackOut_85_2;
                    stackIn_86_3 = stackOut_85_3;
                    stackIn_86_4 = stackOut_85_4;
                    stackIn_86_5 = stackOut_85_5;
                    stackIn_86_6 = stackOut_85_6;
                    stackIn_86_7 = stackOut_85_7;
                    stackIn_86_8 = stackOut_85_8;
                    stackIn_86_9 = stackOut_85_9;
                    stackIn_86_10 = stackOut_85_10;
                    stackIn_86_11 = stackOut_85_11;
                    stackIn_86_12 = stackOut_85_12;
                    stackIn_86_13 = stackOut_85_13;
                    stackIn_86_14 = stackOut_85_14;
                    stackIn_86_15 = stackOut_85_15;
                    stackIn_86_16 = stackOut_85_16;
                    stackIn_86_17 = stackOut_85_17;
                    stackIn_86_18 = stackOut_85_18;
                    stackIn_86_19 = stackOut_85_19;
                    if ((var17 & param2) == 0) {
                      stackOut_87_0 = null;
                      stackOut_87_1 = null;
                      stackOut_87_2 = (qm) ((Object) stackIn_87_2);
                      stackOut_87_3 = (qm) ((Object) stackIn_87_3);
                      stackOut_87_4 = stackIn_87_4;
                      stackOut_87_5 = stackIn_87_5;
                      stackOut_87_6 = stackIn_87_6;
                      stackOut_87_7 = stackIn_87_7;
                      stackOut_87_8 = stackIn_87_8;
                      stackOut_87_9 = stackIn_87_9;
                      stackOut_87_10 = stackIn_87_10;
                      stackOut_87_11 = stackIn_87_11;
                      stackOut_87_12 = stackIn_87_12;
                      stackOut_87_13 = stackIn_87_13;
                      stackOut_87_14 = stackIn_87_14;
                      stackOut_87_15 = stackIn_87_15;
                      stackOut_87_16 = stackIn_87_16;
                      stackOut_87_17 = stackIn_87_17;
                      stackOut_87_18 = stackIn_87_18;
                      stackOut_87_19 = stackIn_87_19;
                      stackOut_87_20 = 0;
                      stackIn_88_0 = stackOut_87_0;
                      stackIn_88_1 = stackOut_87_1;
                      stackIn_88_2 = stackOut_87_2;
                      stackIn_88_3 = stackOut_87_3;
                      stackIn_88_4 = stackOut_87_4;
                      stackIn_88_5 = stackOut_87_5;
                      stackIn_88_6 = stackOut_87_6;
                      stackIn_88_7 = stackOut_87_7;
                      stackIn_88_8 = stackOut_87_8;
                      stackIn_88_9 = stackOut_87_9;
                      stackIn_88_10 = stackOut_87_10;
                      stackIn_88_11 = stackOut_87_11;
                      stackIn_88_12 = stackOut_87_12;
                      stackIn_88_13 = stackOut_87_13;
                      stackIn_88_14 = stackOut_87_14;
                      stackIn_88_15 = stackOut_87_15;
                      stackIn_88_16 = stackOut_87_16;
                      stackIn_88_17 = stackOut_87_17;
                      stackIn_88_18 = stackOut_87_18;
                      stackIn_88_19 = stackOut_87_19;
                      stackIn_88_20 = stackOut_87_20;
                      break L10;
                    } else {
                      stackOut_86_0 = null;
                      stackOut_86_1 = null;
                      stackOut_86_2 = (qm) ((Object) stackIn_86_2);
                      stackOut_86_3 = (qm) ((Object) stackIn_86_3);
                      stackOut_86_4 = stackIn_86_4;
                      stackOut_86_5 = stackIn_86_5;
                      stackOut_86_6 = stackIn_86_6;
                      stackOut_86_7 = stackIn_86_7;
                      stackOut_86_8 = stackIn_86_8;
                      stackOut_86_9 = stackIn_86_9;
                      stackOut_86_10 = stackIn_86_10;
                      stackOut_86_11 = stackIn_86_11;
                      stackOut_86_12 = stackIn_86_12;
                      stackOut_86_13 = stackIn_86_13;
                      stackOut_86_14 = stackIn_86_14;
                      stackOut_86_15 = stackIn_86_15;
                      stackOut_86_16 = stackIn_86_16;
                      stackOut_86_17 = stackIn_86_17;
                      stackOut_86_18 = stackIn_86_18;
                      stackOut_86_19 = stackIn_86_19;
                      stackOut_86_20 = 1;
                      stackIn_88_0 = stackOut_86_0;
                      stackIn_88_1 = stackOut_86_1;
                      stackIn_88_2 = stackOut_86_2;
                      stackIn_88_3 = stackOut_86_3;
                      stackIn_88_4 = stackOut_86_4;
                      stackIn_88_5 = stackOut_86_5;
                      stackIn_88_6 = stackOut_86_6;
                      stackIn_88_7 = stackOut_86_7;
                      stackIn_88_8 = stackOut_86_8;
                      stackIn_88_9 = stackOut_86_9;
                      stackIn_88_10 = stackOut_86_10;
                      stackIn_88_11 = stackOut_86_11;
                      stackIn_88_12 = stackOut_86_12;
                      stackIn_88_13 = stackOut_86_13;
                      stackIn_88_14 = stackOut_86_14;
                      stackIn_88_15 = stackOut_86_15;
                      stackIn_88_16 = stackOut_86_16;
                      stackIn_88_17 = stackOut_86_17;
                      stackIn_88_18 = stackOut_86_18;
                      stackIn_88_19 = stackOut_86_19;
                      stackIn_88_20 = stackOut_86_20;
                      break L10;
                    }
                  }
                  L11: {
                    var23 = new dd(stackIn_88_2, stackIn_88_3, stackIn_88_4, stackIn_88_5, stackIn_88_6, stackIn_88_7, stackIn_88_8, stackIn_88_9, stackIn_88_10, stackIn_88_11, stackIn_88_12, stackIn_88_13, stackIn_88_14, stackIn_88_15 != 0, stackIn_88_16 != 0, stackIn_88_17 != 0, stackIn_88_18 != 0, stackIn_88_19 != 0, stackIn_88_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                    var24 = (dd) (var20.field_b[0]);
                    var25 = (hn) (var20.field_b[1]);
                    var26 = (hn) (var20.field_b[-1 + var20.field_e]);
                    var20.a(var23, (byte) 6);
                    var27 = var23.f(50) / (var23.f(50) + var24.f(50));
                    var28 = var26.field_N;
                    var29 = var25.field_N;
                    var30 = var26.field_P;
                    var31 = var25.field_P;
                    var32 = var26.field_B;
                    var33 = var25.field_B;
                    var34 = var26.field_L;
                    var35 = var25.field_L;
                    var36 = (float)((double)var27 * 3.141592653589793);
                    if (var25.field_I <= var25.field_E) {
                      stackOut_91_0 = 3.1415927410125732f + var25.field_E;
                      stackIn_92_0 = stackOut_91_0;
                      break L11;
                    } else {
                      stackOut_89_0 = var25.field_E;
                      stackIn_92_0 = stackOut_89_0;
                      break L11;
                    }
                  }
                  L12: {
                    var37 = stackIn_92_0;
                    var38 = null;
                    if (var7 != 0) {
                      var38 = new wd[var10];
                      this.field_i = new sb[var10];
                      var14 = 0;
                      L13: while (true) {
                        if ((var10 ^ -1) >= (var14 ^ -1)) {
                          this.field_m = new ue[var11];
                          var14 = 0;
                          L14: while (true) {
                            if (var11 <= var14) {
                              break L12;
                            } else {
                              this.field_m[var14] = new ue();
                              discarded$9 = var4_ref.f((byte) -94);
                              discarded$10 = var4_ref.f((byte) -79);
                              var39_int = var4_ref.k(-108);
                              var40 = var4_ref.k(64);
                              discarded$11 = var4_ref.k(81);
                              discarded$12 = new qm(var39_int, var40);
                              var14++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_i[var14] = new sb();
                          var39_int = var4_ref.f((byte) -27);
                          ((Object[]) (var38))[var14] = (wd) (var20.field_b[var39_int]);
                          this.field_i[var14].field_b = (float)var4_ref.k(106) / 32768.0f - 0.5f;
                          var14++;
                          continue L13;
                        }
                      }
                    } else {
                      this.field_i = null;
                      this.field_m = null;
                      break L12;
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
                  L15: while (true) {
                    L16: {
                      L17: {
                        var40_ref_dd = (dd) (var20.field_b[var14]);
                        var40_ref_dd.b(param2 + 43, var37);
                        if ((var40_ref_dd.field_R.field_h ^ -1) != (var40_ref_dd.field_P.field_h ^ -1)) {
                          break L17;
                        } else {
                          if ((var40_ref_dd.field_R.field_f ^ -1) != (var40_ref_dd.field_P.field_f ^ -1)) {
                            break L17;
                          } else {
                            var20.a(true, var14);
                            break L16;
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
                      break L16;
                    }
                    L18: {
                      if (var39 == null) {
                        break L18;
                      } else {
                        ((hn) (var39)).field_Q = var40_ref_dd.p(-1);
                        break L18;
                      }
                    }
                    if ((var14 ^ -1) > (var20.field_e ^ -1)) {
                      L19: {
                        var41_ref_hn = (hn) (var20.field_b[var14]);
                        var41_ref_hn.field_F = var40_ref_dd.b((byte) -128);
                        var14++;
                        if (var41_ref_hn.field_I <= var41_ref_hn.field_E) {
                          stackOut_126_0 = 3.1415927410125732f + var41_ref_hn.field_I;
                          stackIn_127_0 = stackOut_126_0;
                          break L19;
                        } else {
                          stackOut_124_0 = var41_ref_hn.field_I;
                          stackIn_127_0 = stackOut_124_0;
                          break L19;
                        }
                      }
                      L20: {
                        var37 = stackIn_127_0;
                        var28 = var29;
                        if (var14 < var20.field_e + -1) {
                          stackOut_130_0 = var20.field_b[var14 - -1];
                          stackIn_131_0 = (hn) ((Object) stackOut_130_0);
                          break L20;
                        } else {
                          stackOut_128_0 = (hn) (var25);
                          stackIn_131_0 = stackOut_128_0;
                          break L20;
                        }
                      }
                      var42_ref_hn = stackIn_131_0;
                      var29 = var42_ref_hn.field_N;
                      var30 = var31;
                      var31 = var42_ref_hn.field_P;
                      var32 = var33;
                      var34 = var35;
                      var33 = var42_ref_hn.field_B;
                      var39 = var41_ref_hn;
                      var35 = var42_ref_hn.field_L;
                      continue L15;
                    } else {
                      this.field_sb = new wd[var20.field_e];
                      var14 = 0;
                      L21: while (true) {
                        if (var20.field_e <= var14) {
                          L22: {
                            if (var7 == 0) {
                              break L22;
                            } else {
                              var14 = 0;
                              L23: while (true) {
                                if ((var10 ^ -1) >= (var14 ^ -1)) {
                                  break L22;
                                } else {
                                  var15 = 0;
                                  L24: while (true) {
                                    if ((var15 ^ -1) <= (this.field_sb.length ^ -1)) {
                                      var14++;
                                      continue L23;
                                    } else {
                                      L25: {
                                        if (this.field_sb[var15] == ((Object[]) (var38))[var14]) {
                                          discarded$13 = this.field_sb[var15].b(this.field_i[var14].field_b, param2 ^ 7561012);
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var15++;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var40 = this.field_sb[this.field_sb.length - 1].field_k;
                          var41 = this.field_sb[0].field_k;
                          var14 = 0;
                          L26: while (true) {
                            if ((var14 ^ -1) <= (this.field_sb.length ^ -1)) {
                              sb.field_a = this.field_sb;
                              var14 = 0;
                              L27: while (true) {
                                if (var14 >= var12) {
                                  if ((this.field_z ^ -1) != -1) {
                                    var14 = 0;
                                    L28: while (true) {
                                      if (var14 >= this.field_z) {
                                        var15 = 0;
                                        var14 = this.field_h;
                                        L29: while (true) {
                                          if (this.field_z <= var14) {
                                            L30: {
                                              if (null != param1) {
                                                break L30;
                                              } else {
                                                param1 = new int[]{3, 2, 1, 0};
                                                break L30;
                                              }
                                            }
                                            var14 = 0;
                                            L31: while (true) {
                                              if (var14 >= this.field_h) {
                                                var14 = 0;
                                                L32: while (true) {
                                                  if ((var14 ^ -1) <= (this.field_h ^ -1)) {
                                                    var14 = this.field_h;
                                                    L33: while (true) {
                                                      if (var14 >= this.field_z) {
                                                        L34: {
                                                          if (3 != this.field_r) {
                                                            this.field_pb = true;
                                                            this.field_db = new wb(5, 5);
                                                            break L34;
                                                          } else {
                                                            this.field_pb = false;
                                                            break L34;
                                                          }
                                                        }
                                                        this.a(param0, -77);
                                                        sb.field_a = null;
                                                        break L0;
                                                      } else {
                                                        this.field_C[var14].field_Eb = 8421504;
                                                        this.field_C[var14].field_tc = 0;
                                                        var14++;
                                                        continue L33;
                                                      }
                                                    }
                                                  } else {
                                                    L35: {
                                                      this.field_C[var14].field_Eb = nc.field_j[var14];
                                                      this.field_C[var14].field_tc = ii.field_d[var14];
                                                      var43 = pf.field_c[this.field_r];
                                                      if ((var14 & 1) != 0) {
                                                        break L35;
                                                      } else {
                                                        var43 = var43 ^ 1;
                                                        break L35;
                                                      }
                                                    }
                                                    this.field_C[var14].a(param2 + 20353, ge.field_c[var43]);
                                                    var14++;
                                                    continue L32;
                                                  }
                                                }
                                              } else {
                                                L36: {
                                                  var43 = param1[this.field_C[var14].field_R];
                                                  if (var43 != var14) {
                                                    var44 = this.field_C[var43];
                                                    this.field_C[var43] = this.field_C[var14];
                                                    this.field_C[var14] = var44;
                                                    break L36;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                                var14++;
                                                continue L31;
                                              }
                                            }
                                          } else {
                                            L37: {
                                              if (0 != this.field_C[var14].field_rc) {
                                                break L37;
                                              } else {
                                                var43_ref_ja = this.field_C[var14];
                                                this.field_C[var14] = this.field_C[var15];
                                                incrementValue$14 = var15;
                                                var15++;
                                                this.field_C[incrementValue$14] = var43_ref_ja;
                                                break L37;
                                              }
                                            }
                                            var14++;
                                            continue L29;
                                          }
                                        }
                                      } else {
                                        L38: {
                                          if (0 != this.field_C[var14].field_rc) {
                                            break L38;
                                          } else {
                                            this.field_h = this.field_h + 1;
                                            var43 = 0;
                                            var15 = 0;
                                            L39: while (true) {
                                              if (this.field_z <= var15) {
                                                this.field_C[var14].field_R = var43;
                                                break L38;
                                              } else {
                                                L40: {
                                                  if (this.field_C[var15].field_rc != 0) {
                                                    break L40;
                                                  } else {
                                                    if (this.field_C[var15].field_Ib > this.field_C[var14].field_Ib) {
                                                      var43++;
                                                      break L40;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                                var15++;
                                                continue L39;
                                              }
                                            }
                                          }
                                        }
                                        var14++;
                                        continue L28;
                                      }
                                    }
                                  } else {
                                    throw new RuntimeException((String) null);
                                  }
                                } else {
                                  L41: {
                                    L42: {
                                      var43_ref_qm = new qm(var4_ref.h(-14232), var4_ref.h(-14232));
                                      var44_int = var4_ref.f((byte) -24);
                                      var45 = (float)(3.141592653589793 * (double)var4_ref.f((byte) -60) / 128.0);
                                      var16 = var4_ref.f(0);
                                      if (var44_int < 5) {
                                        break L42;
                                      } else {
                                        if ((var44_int ^ -1) < -9) {
                                          break L42;
                                        } else {
                                          var46_ref = ge.field_c[this.field_r * 2];
                                          var47_float = hi.a(this.field_sb.length, 0.0f, -1, this.field_sb, -24659, var43_ref_qm, var16);
                                          if (var47_float == -1.0f) {
                                            throw new RuntimeException((String) null);
                                          } else {
                                            L43: {
                                              fieldTemp$15 = this.field_z;
                                              this.field_z = this.field_z + 1;
                                              stackOut_170_0 = this.field_C;
                                              stackOut_170_1 = fieldTemp$15;
                                              stackOut_170_2 = null;
                                              stackOut_170_3 = null;
                                              stackOut_170_4 = var43_ref_qm.field_h;
                                              stackOut_170_5 = var43_ref_qm.field_f;
                                              stackOut_170_6 = var16;
                                              stackOut_170_7 = var45;
                                              stackOut_170_8 = var47_float;
                                              stackIn_173_0 = stackOut_170_0;
                                              stackIn_173_1 = stackOut_170_1;
                                              stackIn_173_2 = stackOut_170_2;
                                              stackIn_173_3 = stackOut_170_3;
                                              stackIn_173_4 = stackOut_170_4;
                                              stackIn_173_5 = stackOut_170_5;
                                              stackIn_173_6 = stackOut_170_6;
                                              stackIn_173_7 = stackOut_170_7;
                                              stackIn_173_8 = stackOut_170_8;
                                              stackIn_171_0 = stackOut_170_0;
                                              stackIn_171_1 = stackOut_170_1;
                                              stackIn_171_2 = stackOut_170_2;
                                              stackIn_171_3 = stackOut_170_3;
                                              stackIn_171_4 = stackOut_170_4;
                                              stackIn_171_5 = stackOut_170_5;
                                              stackIn_171_6 = stackOut_170_6;
                                              stackIn_171_7 = stackOut_170_7;
                                              stackIn_171_8 = stackOut_170_8;
                                              if (var47_float == (float)this.field_sb.length) {
                                                stackOut_173_0 = (ja[]) ((Object) stackIn_173_0);
                                                stackOut_173_1 = stackIn_173_1;
                                                stackOut_173_2 = null;
                                                stackOut_173_3 = null;
                                                stackOut_173_4 = stackIn_173_4;
                                                stackOut_173_5 = stackIn_173_5;
                                                stackOut_173_6 = stackIn_173_6;
                                                stackOut_173_7 = stackIn_173_7;
                                                stackOut_173_8 = stackIn_173_8;
                                                stackOut_173_9 = this.field_sb[0];
                                                stackIn_174_0 = stackOut_173_0;
                                                stackIn_174_1 = stackOut_173_1;
                                                stackIn_174_2 = stackOut_173_2;
                                                stackIn_174_3 = stackOut_173_3;
                                                stackIn_174_4 = stackOut_173_4;
                                                stackIn_174_5 = stackOut_173_5;
                                                stackIn_174_6 = stackOut_173_6;
                                                stackIn_174_7 = stackOut_173_7;
                                                stackIn_174_8 = stackOut_173_8;
                                                stackIn_174_9 = stackOut_173_9;
                                                break L43;
                                              } else {
                                                stackOut_171_0 = (ja[]) ((Object) stackIn_171_0);
                                                stackOut_171_1 = stackIn_171_1;
                                                stackOut_171_2 = null;
                                                stackOut_171_3 = null;
                                                stackOut_171_4 = stackIn_171_4;
                                                stackOut_171_5 = stackIn_171_5;
                                                stackOut_171_6 = stackIn_171_6;
                                                stackOut_171_7 = stackIn_171_7;
                                                stackOut_171_8 = stackIn_171_8;
                                                stackOut_171_9 = this.field_sb[(int)var47_float];
                                                stackIn_174_0 = stackOut_171_0;
                                                stackIn_174_1 = stackOut_171_1;
                                                stackIn_174_2 = stackOut_171_2;
                                                stackIn_174_3 = stackOut_171_3;
                                                stackIn_174_4 = stackOut_171_4;
                                                stackIn_174_5 = stackOut_171_5;
                                                stackIn_174_6 = stackOut_171_6;
                                                stackIn_174_7 = stackOut_171_7;
                                                stackIn_174_8 = stackOut_171_8;
                                                stackIn_174_9 = stackOut_171_9;
                                                break L43;
                                              }
                                            }
                                            stackIn_174_0[stackIn_174_1] = new ja(stackIn_174_4, stackIn_174_5, stackIn_174_6, stackIn_174_7, stackIn_174_8, stackIn_174_9, var46_ref, 0);
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    L44: {
                                      if (var44_int < 62) {
                                        break L44;
                                      } else {
                                        if (69 >= var44_int) {
                                          var46_float = hi.a(this.field_sb.length, 0.0f, 1, this.field_sb, param2 ^ -24691, var43_ref_qm, var16);
                                          if (-1.0f != var46_float) {
                                            L45: {
                                              fieldTemp$16 = this.field_z;
                                              this.field_z = this.field_z + 1;
                                              stackOut_184_0 = this.field_C;
                                              stackOut_184_1 = fieldTemp$16;
                                              stackOut_184_2 = null;
                                              stackOut_184_3 = null;
                                              stackOut_184_4 = var43_ref_qm.field_h;
                                              stackOut_184_5 = var43_ref_qm.field_f;
                                              stackOut_184_6 = var16;
                                              stackOut_184_7 = var45;
                                              stackOut_184_8 = var46_float;
                                              stackIn_187_0 = stackOut_184_0;
                                              stackIn_187_1 = stackOut_184_1;
                                              stackIn_187_2 = stackOut_184_2;
                                              stackIn_187_3 = stackOut_184_3;
                                              stackIn_187_4 = stackOut_184_4;
                                              stackIn_187_5 = stackOut_184_5;
                                              stackIn_187_6 = stackOut_184_6;
                                              stackIn_187_7 = stackOut_184_7;
                                              stackIn_187_8 = stackOut_184_8;
                                              stackIn_185_0 = stackOut_184_0;
                                              stackIn_185_1 = stackOut_184_1;
                                              stackIn_185_2 = stackOut_184_2;
                                              stackIn_185_3 = stackOut_184_3;
                                              stackIn_185_4 = stackOut_184_4;
                                              stackIn_185_5 = stackOut_184_5;
                                              stackIn_185_6 = stackOut_184_6;
                                              stackIn_185_7 = stackOut_184_7;
                                              stackIn_185_8 = stackOut_184_8;
                                              if ((float)this.field_sb.length == var46_float) {
                                                stackOut_187_0 = (ja[]) ((Object) stackIn_187_0);
                                                stackOut_187_1 = stackIn_187_1;
                                                stackOut_187_2 = null;
                                                stackOut_187_3 = null;
                                                stackOut_187_4 = stackIn_187_4;
                                                stackOut_187_5 = stackIn_187_5;
                                                stackOut_187_6 = stackIn_187_6;
                                                stackOut_187_7 = stackIn_187_7;
                                                stackOut_187_8 = stackIn_187_8;
                                                stackOut_187_9 = this.field_sb[0];
                                                stackIn_188_0 = stackOut_187_0;
                                                stackIn_188_1 = stackOut_187_1;
                                                stackIn_188_2 = stackOut_187_2;
                                                stackIn_188_3 = stackOut_187_3;
                                                stackIn_188_4 = stackOut_187_4;
                                                stackIn_188_5 = stackOut_187_5;
                                                stackIn_188_6 = stackOut_187_6;
                                                stackIn_188_7 = stackOut_187_7;
                                                stackIn_188_8 = stackOut_187_8;
                                                stackIn_188_9 = stackOut_187_9;
                                                break L45;
                                              } else {
                                                stackOut_185_0 = (ja[]) ((Object) stackIn_185_0);
                                                stackOut_185_1 = stackIn_185_1;
                                                stackOut_185_2 = null;
                                                stackOut_185_3 = null;
                                                stackOut_185_4 = stackIn_185_4;
                                                stackOut_185_5 = stackIn_185_5;
                                                stackOut_185_6 = stackIn_185_6;
                                                stackOut_185_7 = stackIn_185_7;
                                                stackOut_185_8 = stackIn_185_8;
                                                stackOut_185_9 = this.field_sb[(int)var46_float];
                                                stackIn_188_0 = stackOut_185_0;
                                                stackIn_188_1 = stackOut_185_1;
                                                stackIn_188_2 = stackOut_185_2;
                                                stackIn_188_3 = stackOut_185_3;
                                                stackIn_188_4 = stackOut_185_4;
                                                stackIn_188_5 = stackOut_185_5;
                                                stackIn_188_6 = stackOut_185_6;
                                                stackIn_188_7 = stackOut_185_7;
                                                stackIn_188_8 = stackOut_185_8;
                                                stackIn_188_9 = stackOut_185_9;
                                                break L45;
                                              }
                                            }
                                            stackIn_188_0[stackIn_188_1] = new ja(stackIn_188_4, stackIn_188_5, stackIn_188_6, stackIn_188_7, stackIn_188_8, stackIn_188_9, ge.field_c[-62 + var44_int], 1);
                                            break L41;
                                          } else {
                                            throw new RuntimeException((String) null);
                                          }
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    L46: {
                                      var46 = new wm(var43_ref_qm, var44_int, var16, var45, 0.0f, 0.0f);
                                      if (-1 != (1048576 & var46.field_J ^ -1)) {
                                        discarded$17 = var46.a((byte) -113);
                                        var46.field_H = var46.field_H.e();
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                    L47: {
                                      if ((var46.field_J & 32768) != 0) {
                                        this.field_d.a((byte) -92, var46);
                                        break L47;
                                      } else {
                                        this.field_cb.a((byte) -84, var46);
                                        break L47;
                                      }
                                    }
                                    var46.a(-1, sb.field_a);
                                    if (53 == var44_int) {
                                      var47 = var43_ref_qm.field_h + -(int)(10.0 * Math.sin((double)var45));
                                      var48 = var43_ref_qm.field_f + -(int)(Math.cos((double)var45) * 10.0);
                                      var49 = new na(var47, var48, var16, 60, de.field_Q);
                                      this.field_Q.a((byte) -81, var49);
                                      break L41;
                                    } else {
                                      if (54 != var44_int) {
                                        break L41;
                                      } else {
                                        var47 = var43_ref_qm.field_h + -(int)(Math.sin((double)var45) * 35.0);
                                        var48 = var43_ref_qm.field_f + -(int)(Math.cos((double)var45) * 35.0);
                                        var49 = new na(var47, var48, var16, 60, de.field_Q);
                                        this.field_Q.a((byte) -117, var49);
                                        var47 = var43_ref_qm.field_h + (int)(Math.sin((double)var45) * 35.0);
                                        var48 = var43_ref_qm.field_f - -(int)(Math.cos((double)var45) * 35.0);
                                        var49 = new na(var47, var48, var16, 60, de.field_Q);
                                        this.field_Q.a((byte) -118, var49);
                                        break L41;
                                      }
                                    }
                                  }
                                  var14++;
                                  continue L27;
                                }
                              }
                            } else {
                              L48: {
                                var42 = this.field_sb[(1 + var14) % this.field_sb.length].field_k;
                                if (0 == var41) {
                                  this.field_sb[var14].field_o = (float)(var42 + -var40) / this.field_sb[var14].f(50);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              var40 = var41;
                              var41 = var42;
                              var14++;
                              continue L26;
                            }
                          }
                        } else {
                          this.field_sb[var14] = (wd) (var20.field_b[var14]);
                          var14++;
                          continue L21;
                        }
                      }
                    }
                  }
                } else {
                  L49: {
                    var21 = new qm(var4_ref.k(-48), var4_ref.k(-108));
                    var22 = new qm(var4_ref.k(-113), var4_ref.k(93));
                    var16 = var4_ref.f(0);
                    var17 = var4_ref.f((byte) -108);
                    var18 = var4_ref.f(0);
                    var19 = var4_ref.f(0);
                    stackOut_29_0 = null;
                    stackOut_29_1 = null;
                    stackOut_29_2 = (qm) (var21);
                    stackOut_29_3 = (qm) (var22);
                    stackOut_29_4 = var16;
                    stackOut_29_5 = 0;
                    stackOut_29_6 = 0;
                    stackOut_29_7 = 0;
                    stackOut_29_8 = 0;
                    stackOut_29_9 = 0;
                    stackOut_29_10 = 0;
                    stackOut_29_11 = 0;
                    stackOut_29_12 = 0;
                    stackOut_29_13 = var18;
                    stackOut_29_14 = var19;
                    stackIn_33_0 = stackOut_29_0;
                    stackIn_33_1 = stackOut_29_1;
                    stackIn_33_2 = stackOut_29_2;
                    stackIn_33_3 = stackOut_29_3;
                    stackIn_33_4 = stackOut_29_4;
                    stackIn_33_5 = stackOut_29_5;
                    stackIn_33_6 = stackOut_29_6;
                    stackIn_33_7 = stackOut_29_7;
                    stackIn_33_8 = stackOut_29_8;
                    stackIn_33_9 = stackOut_29_9;
                    stackIn_33_10 = stackOut_29_10;
                    stackIn_33_11 = stackOut_29_11;
                    stackIn_33_12 = stackOut_29_12;
                    stackIn_33_13 = stackOut_29_13;
                    stackIn_33_14 = stackOut_29_14;
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
                    if (-1 == (2 & var17 ^ -1)) {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = (qm) ((Object) stackIn_33_2);
                      stackOut_33_3 = (qm) ((Object) stackIn_33_3);
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
                      stackOut_33_15 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      stackIn_34_4 = stackOut_33_4;
                      stackIn_34_5 = stackOut_33_5;
                      stackIn_34_6 = stackOut_33_6;
                      stackIn_34_7 = stackOut_33_7;
                      stackIn_34_8 = stackOut_33_8;
                      stackIn_34_9 = stackOut_33_9;
                      stackIn_34_10 = stackOut_33_10;
                      stackIn_34_11 = stackOut_33_11;
                      stackIn_34_12 = stackOut_33_12;
                      stackIn_34_13 = stackOut_33_13;
                      stackIn_34_14 = stackOut_33_14;
                      stackIn_34_15 = stackOut_33_15;
                      break L49;
                    } else {
                      stackOut_30_0 = null;
                      stackOut_30_1 = null;
                      stackOut_30_2 = (qm) ((Object) stackIn_30_2);
                      stackOut_30_3 = (qm) ((Object) stackIn_30_3);
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
                      stackOut_32_0 = null;
                      stackOut_32_1 = null;
                      stackOut_32_2 = (qm) ((Object) stackIn_32_2);
                      stackOut_32_3 = (qm) ((Object) stackIn_32_3);
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
                      stackOut_32_15 = 1;
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
                      break L49;
                    }
                  }
                  L50: {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = (qm) ((Object) stackIn_34_2);
                    stackOut_34_3 = (qm) ((Object) stackIn_34_3);
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
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    stackIn_36_5 = stackOut_34_5;
                    stackIn_36_6 = stackOut_34_6;
                    stackIn_36_7 = stackOut_34_7;
                    stackIn_36_8 = stackOut_34_8;
                    stackIn_36_9 = stackOut_34_9;
                    stackIn_36_10 = stackOut_34_10;
                    stackIn_36_11 = stackOut_34_11;
                    stackIn_36_12 = stackOut_34_12;
                    stackIn_36_13 = stackOut_34_13;
                    stackIn_36_14 = stackOut_34_14;
                    stackIn_36_15 = stackOut_34_15;
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
                    if (-1 == (4 & var17 ^ -1)) {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = (qm) ((Object) stackIn_36_2);
                      stackOut_36_3 = (qm) ((Object) stackIn_36_3);
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
                      stackOut_36_16 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      stackIn_37_5 = stackOut_36_5;
                      stackIn_37_6 = stackOut_36_6;
                      stackIn_37_7 = stackOut_36_7;
                      stackIn_37_8 = stackOut_36_8;
                      stackIn_37_9 = stackOut_36_9;
                      stackIn_37_10 = stackOut_36_10;
                      stackIn_37_11 = stackOut_36_11;
                      stackIn_37_12 = stackOut_36_12;
                      stackIn_37_13 = stackOut_36_13;
                      stackIn_37_14 = stackOut_36_14;
                      stackIn_37_15 = stackOut_36_15;
                      stackIn_37_16 = stackOut_36_16;
                      break L50;
                    } else {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = (qm) ((Object) stackIn_35_2);
                      stackOut_35_3 = (qm) ((Object) stackIn_35_3);
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
                      stackOut_35_16 = 1;
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
                      break L50;
                    }
                  }
                  L51: {
                    stackOut_37_0 = null;
                    stackOut_37_1 = null;
                    stackOut_37_2 = (qm) ((Object) stackIn_37_2);
                    stackOut_37_3 = (qm) ((Object) stackIn_37_3);
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
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    stackIn_39_3 = stackOut_37_3;
                    stackIn_39_4 = stackOut_37_4;
                    stackIn_39_5 = stackOut_37_5;
                    stackIn_39_6 = stackOut_37_6;
                    stackIn_39_7 = stackOut_37_7;
                    stackIn_39_8 = stackOut_37_8;
                    stackIn_39_9 = stackOut_37_9;
                    stackIn_39_10 = stackOut_37_10;
                    stackIn_39_11 = stackOut_37_11;
                    stackIn_39_12 = stackOut_37_12;
                    stackIn_39_13 = stackOut_37_13;
                    stackIn_39_14 = stackOut_37_14;
                    stackIn_39_15 = stackOut_37_15;
                    stackIn_39_16 = stackOut_37_16;
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
                    if (0 == (var17 & 1)) {
                      stackOut_39_0 = null;
                      stackOut_39_1 = null;
                      stackOut_39_2 = (qm) ((Object) stackIn_39_2);
                      stackOut_39_3 = (qm) ((Object) stackIn_39_3);
                      stackOut_39_4 = stackIn_39_4;
                      stackOut_39_5 = stackIn_39_5;
                      stackOut_39_6 = stackIn_39_6;
                      stackOut_39_7 = stackIn_39_7;
                      stackOut_39_8 = stackIn_39_8;
                      stackOut_39_9 = stackIn_39_9;
                      stackOut_39_10 = stackIn_39_10;
                      stackOut_39_11 = stackIn_39_11;
                      stackOut_39_12 = stackIn_39_12;
                      stackOut_39_13 = stackIn_39_13;
                      stackOut_39_14 = stackIn_39_14;
                      stackOut_39_15 = stackIn_39_15;
                      stackOut_39_16 = stackIn_39_16;
                      stackOut_39_17 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      stackIn_40_3 = stackOut_39_3;
                      stackIn_40_4 = stackOut_39_4;
                      stackIn_40_5 = stackOut_39_5;
                      stackIn_40_6 = stackOut_39_6;
                      stackIn_40_7 = stackOut_39_7;
                      stackIn_40_8 = stackOut_39_8;
                      stackIn_40_9 = stackOut_39_9;
                      stackIn_40_10 = stackOut_39_10;
                      stackIn_40_11 = stackOut_39_11;
                      stackIn_40_12 = stackOut_39_12;
                      stackIn_40_13 = stackOut_39_13;
                      stackIn_40_14 = stackOut_39_14;
                      stackIn_40_15 = stackOut_39_15;
                      stackIn_40_16 = stackOut_39_16;
                      stackIn_40_17 = stackOut_39_17;
                      break L51;
                    } else {
                      stackOut_38_0 = null;
                      stackOut_38_1 = null;
                      stackOut_38_2 = (qm) ((Object) stackIn_38_2);
                      stackOut_38_3 = (qm) ((Object) stackIn_38_3);
                      stackOut_38_4 = stackIn_38_4;
                      stackOut_38_5 = stackIn_38_5;
                      stackOut_38_6 = stackIn_38_6;
                      stackOut_38_7 = stackIn_38_7;
                      stackOut_38_8 = stackIn_38_8;
                      stackOut_38_9 = stackIn_38_9;
                      stackOut_38_10 = stackIn_38_10;
                      stackOut_38_11 = stackIn_38_11;
                      stackOut_38_12 = stackIn_38_12;
                      stackOut_38_13 = stackIn_38_13;
                      stackOut_38_14 = stackIn_38_14;
                      stackOut_38_15 = stackIn_38_15;
                      stackOut_38_16 = stackIn_38_16;
                      stackOut_38_17 = 1;
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
                      stackIn_40_14 = stackOut_38_14;
                      stackIn_40_15 = stackOut_38_15;
                      stackIn_40_16 = stackOut_38_16;
                      stackIn_40_17 = stackOut_38_17;
                      break L51;
                    }
                  }
                  L52: {
                    stackOut_40_0 = null;
                    stackOut_40_1 = null;
                    stackOut_40_2 = (qm) ((Object) stackIn_40_2);
                    stackOut_40_3 = (qm) ((Object) stackIn_40_3);
                    stackOut_40_4 = stackIn_40_4;
                    stackOut_40_5 = stackIn_40_5;
                    stackOut_40_6 = stackIn_40_6;
                    stackOut_40_7 = stackIn_40_7;
                    stackOut_40_8 = stackIn_40_8;
                    stackOut_40_9 = stackIn_40_9;
                    stackOut_40_10 = stackIn_40_10;
                    stackOut_40_11 = stackIn_40_11;
                    stackOut_40_12 = stackIn_40_12;
                    stackOut_40_13 = stackIn_40_13;
                    stackOut_40_14 = stackIn_40_14;
                    stackOut_40_15 = stackIn_40_15;
                    stackOut_40_16 = stackIn_40_16;
                    stackOut_40_17 = stackIn_40_17;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_42_2 = stackOut_40_2;
                    stackIn_42_3 = stackOut_40_3;
                    stackIn_42_4 = stackOut_40_4;
                    stackIn_42_5 = stackOut_40_5;
                    stackIn_42_6 = stackOut_40_6;
                    stackIn_42_7 = stackOut_40_7;
                    stackIn_42_8 = stackOut_40_8;
                    stackIn_42_9 = stackOut_40_9;
                    stackIn_42_10 = stackOut_40_10;
                    stackIn_42_11 = stackOut_40_11;
                    stackIn_42_12 = stackOut_40_12;
                    stackIn_42_13 = stackOut_40_13;
                    stackIn_42_14 = stackOut_40_14;
                    stackIn_42_15 = stackOut_40_15;
                    stackIn_42_16 = stackOut_40_16;
                    stackIn_42_17 = stackOut_40_17;
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
                    stackIn_41_15 = stackOut_40_15;
                    stackIn_41_16 = stackOut_40_16;
                    stackIn_41_17 = stackOut_40_17;
                    if (-1 == (var17 & 8 ^ -1)) {
                      stackOut_42_0 = null;
                      stackOut_42_1 = null;
                      stackOut_42_2 = (qm) ((Object) stackIn_42_2);
                      stackOut_42_3 = (qm) ((Object) stackIn_42_3);
                      stackOut_42_4 = stackIn_42_4;
                      stackOut_42_5 = stackIn_42_5;
                      stackOut_42_6 = stackIn_42_6;
                      stackOut_42_7 = stackIn_42_7;
                      stackOut_42_8 = stackIn_42_8;
                      stackOut_42_9 = stackIn_42_9;
                      stackOut_42_10 = stackIn_42_10;
                      stackOut_42_11 = stackIn_42_11;
                      stackOut_42_12 = stackIn_42_12;
                      stackOut_42_13 = stackIn_42_13;
                      stackOut_42_14 = stackIn_42_14;
                      stackOut_42_15 = stackIn_42_15;
                      stackOut_42_16 = stackIn_42_16;
                      stackOut_42_17 = stackIn_42_17;
                      stackOut_42_18 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      stackIn_43_2 = stackOut_42_2;
                      stackIn_43_3 = stackOut_42_3;
                      stackIn_43_4 = stackOut_42_4;
                      stackIn_43_5 = stackOut_42_5;
                      stackIn_43_6 = stackOut_42_6;
                      stackIn_43_7 = stackOut_42_7;
                      stackIn_43_8 = stackOut_42_8;
                      stackIn_43_9 = stackOut_42_9;
                      stackIn_43_10 = stackOut_42_10;
                      stackIn_43_11 = stackOut_42_11;
                      stackIn_43_12 = stackOut_42_12;
                      stackIn_43_13 = stackOut_42_13;
                      stackIn_43_14 = stackOut_42_14;
                      stackIn_43_15 = stackOut_42_15;
                      stackIn_43_16 = stackOut_42_16;
                      stackIn_43_17 = stackOut_42_17;
                      stackIn_43_18 = stackOut_42_18;
                      break L52;
                    } else {
                      stackOut_41_0 = null;
                      stackOut_41_1 = null;
                      stackOut_41_2 = (qm) ((Object) stackIn_41_2);
                      stackOut_41_3 = (qm) ((Object) stackIn_41_3);
                      stackOut_41_4 = stackIn_41_4;
                      stackOut_41_5 = stackIn_41_5;
                      stackOut_41_6 = stackIn_41_6;
                      stackOut_41_7 = stackIn_41_7;
                      stackOut_41_8 = stackIn_41_8;
                      stackOut_41_9 = stackIn_41_9;
                      stackOut_41_10 = stackIn_41_10;
                      stackOut_41_11 = stackIn_41_11;
                      stackOut_41_12 = stackIn_41_12;
                      stackOut_41_13 = stackIn_41_13;
                      stackOut_41_14 = stackIn_41_14;
                      stackOut_41_15 = stackIn_41_15;
                      stackOut_41_16 = stackIn_41_16;
                      stackOut_41_17 = stackIn_41_17;
                      stackOut_41_18 = 1;
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
                      stackIn_43_15 = stackOut_41_15;
                      stackIn_43_16 = stackOut_41_16;
                      stackIn_43_17 = stackOut_41_17;
                      stackIn_43_18 = stackOut_41_18;
                      break L52;
                    }
                  }
                  L53: {
                    stackOut_43_0 = null;
                    stackOut_43_1 = null;
                    stackOut_43_2 = (qm) ((Object) stackIn_43_2);
                    stackOut_43_3 = (qm) ((Object) stackIn_43_3);
                    stackOut_43_4 = stackIn_43_4;
                    stackOut_43_5 = stackIn_43_5;
                    stackOut_43_6 = stackIn_43_6;
                    stackOut_43_7 = stackIn_43_7;
                    stackOut_43_8 = stackIn_43_8;
                    stackOut_43_9 = stackIn_43_9;
                    stackOut_43_10 = stackIn_43_10;
                    stackOut_43_11 = stackIn_43_11;
                    stackOut_43_12 = stackIn_43_12;
                    stackOut_43_13 = stackIn_43_13;
                    stackOut_43_14 = stackIn_43_14;
                    stackOut_43_15 = stackIn_43_15;
                    stackOut_43_16 = stackIn_43_16;
                    stackOut_43_17 = stackIn_43_17;
                    stackOut_43_18 = stackIn_43_18;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    stackIn_45_2 = stackOut_43_2;
                    stackIn_45_3 = stackOut_43_3;
                    stackIn_45_4 = stackOut_43_4;
                    stackIn_45_5 = stackOut_43_5;
                    stackIn_45_6 = stackOut_43_6;
                    stackIn_45_7 = stackOut_43_7;
                    stackIn_45_8 = stackOut_43_8;
                    stackIn_45_9 = stackOut_43_9;
                    stackIn_45_10 = stackOut_43_10;
                    stackIn_45_11 = stackOut_43_11;
                    stackIn_45_12 = stackOut_43_12;
                    stackIn_45_13 = stackOut_43_13;
                    stackIn_45_14 = stackOut_43_14;
                    stackIn_45_15 = stackOut_43_15;
                    stackIn_45_16 = stackOut_43_16;
                    stackIn_45_17 = stackOut_43_17;
                    stackIn_45_18 = stackOut_43_18;
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
                    stackIn_44_16 = stackOut_43_16;
                    stackIn_44_17 = stackOut_43_17;
                    stackIn_44_18 = stackOut_43_18;
                    if ((var17 & 16 ^ -1) == -1) {
                      stackOut_45_0 = null;
                      stackOut_45_1 = null;
                      stackOut_45_2 = (qm) ((Object) stackIn_45_2);
                      stackOut_45_3 = (qm) ((Object) stackIn_45_3);
                      stackOut_45_4 = stackIn_45_4;
                      stackOut_45_5 = stackIn_45_5;
                      stackOut_45_6 = stackIn_45_6;
                      stackOut_45_7 = stackIn_45_7;
                      stackOut_45_8 = stackIn_45_8;
                      stackOut_45_9 = stackIn_45_9;
                      stackOut_45_10 = stackIn_45_10;
                      stackOut_45_11 = stackIn_45_11;
                      stackOut_45_12 = stackIn_45_12;
                      stackOut_45_13 = stackIn_45_13;
                      stackOut_45_14 = stackIn_45_14;
                      stackOut_45_15 = stackIn_45_15;
                      stackOut_45_16 = stackIn_45_16;
                      stackOut_45_17 = stackIn_45_17;
                      stackOut_45_18 = stackIn_45_18;
                      stackOut_45_19 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      stackIn_46_2 = stackOut_45_2;
                      stackIn_46_3 = stackOut_45_3;
                      stackIn_46_4 = stackOut_45_4;
                      stackIn_46_5 = stackOut_45_5;
                      stackIn_46_6 = stackOut_45_6;
                      stackIn_46_7 = stackOut_45_7;
                      stackIn_46_8 = stackOut_45_8;
                      stackIn_46_9 = stackOut_45_9;
                      stackIn_46_10 = stackOut_45_10;
                      stackIn_46_11 = stackOut_45_11;
                      stackIn_46_12 = stackOut_45_12;
                      stackIn_46_13 = stackOut_45_13;
                      stackIn_46_14 = stackOut_45_14;
                      stackIn_46_15 = stackOut_45_15;
                      stackIn_46_16 = stackOut_45_16;
                      stackIn_46_17 = stackOut_45_17;
                      stackIn_46_18 = stackOut_45_18;
                      stackIn_46_19 = stackOut_45_19;
                      break L53;
                    } else {
                      stackOut_44_0 = null;
                      stackOut_44_1 = null;
                      stackOut_44_2 = (qm) ((Object) stackIn_44_2);
                      stackOut_44_3 = (qm) ((Object) stackIn_44_3);
                      stackOut_44_4 = stackIn_44_4;
                      stackOut_44_5 = stackIn_44_5;
                      stackOut_44_6 = stackIn_44_6;
                      stackOut_44_7 = stackIn_44_7;
                      stackOut_44_8 = stackIn_44_8;
                      stackOut_44_9 = stackIn_44_9;
                      stackOut_44_10 = stackIn_44_10;
                      stackOut_44_11 = stackIn_44_11;
                      stackOut_44_12 = stackIn_44_12;
                      stackOut_44_13 = stackIn_44_13;
                      stackOut_44_14 = stackIn_44_14;
                      stackOut_44_15 = stackIn_44_15;
                      stackOut_44_16 = stackIn_44_16;
                      stackOut_44_17 = stackIn_44_17;
                      stackOut_44_18 = stackIn_44_18;
                      stackOut_44_19 = 1;
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
                      stackIn_46_16 = stackOut_44_16;
                      stackIn_46_17 = stackOut_44_17;
                      stackIn_46_18 = stackOut_44_18;
                      stackIn_46_19 = stackOut_44_19;
                      break L53;
                    }
                  }
                  L54: {
                    stackOut_46_0 = null;
                    stackOut_46_1 = null;
                    stackOut_46_2 = (qm) ((Object) stackIn_46_2);
                    stackOut_46_3 = (qm) ((Object) stackIn_46_3);
                    stackOut_46_4 = stackIn_46_4;
                    stackOut_46_5 = stackIn_46_5;
                    stackOut_46_6 = stackIn_46_6;
                    stackOut_46_7 = stackIn_46_7;
                    stackOut_46_8 = stackIn_46_8;
                    stackOut_46_9 = stackIn_46_9;
                    stackOut_46_10 = stackIn_46_10;
                    stackOut_46_11 = stackIn_46_11;
                    stackOut_46_12 = stackIn_46_12;
                    stackOut_46_13 = stackIn_46_13;
                    stackOut_46_14 = stackIn_46_14;
                    stackOut_46_15 = stackIn_46_15;
                    stackOut_46_16 = stackIn_46_16;
                    stackOut_46_17 = stackIn_46_17;
                    stackOut_46_18 = stackIn_46_18;
                    stackOut_46_19 = stackIn_46_19;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_48_2 = stackOut_46_2;
                    stackIn_48_3 = stackOut_46_3;
                    stackIn_48_4 = stackOut_46_4;
                    stackIn_48_5 = stackOut_46_5;
                    stackIn_48_6 = stackOut_46_6;
                    stackIn_48_7 = stackOut_46_7;
                    stackIn_48_8 = stackOut_46_8;
                    stackIn_48_9 = stackOut_46_9;
                    stackIn_48_10 = stackOut_46_10;
                    stackIn_48_11 = stackOut_46_11;
                    stackIn_48_12 = stackOut_46_12;
                    stackIn_48_13 = stackOut_46_13;
                    stackIn_48_14 = stackOut_46_14;
                    stackIn_48_15 = stackOut_46_15;
                    stackIn_48_16 = stackOut_46_16;
                    stackIn_48_17 = stackOut_46_17;
                    stackIn_48_18 = stackOut_46_18;
                    stackIn_48_19 = stackOut_46_19;
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
                    stackIn_47_17 = stackOut_46_17;
                    stackIn_47_18 = stackOut_46_18;
                    stackIn_47_19 = stackOut_46_19;
                    if (-1 == (32 & var17 ^ -1)) {
                      stackOut_48_0 = null;
                      stackOut_48_1 = null;
                      stackOut_48_2 = (qm) ((Object) stackIn_48_2);
                      stackOut_48_3 = (qm) ((Object) stackIn_48_3);
                      stackOut_48_4 = stackIn_48_4;
                      stackOut_48_5 = stackIn_48_5;
                      stackOut_48_6 = stackIn_48_6;
                      stackOut_48_7 = stackIn_48_7;
                      stackOut_48_8 = stackIn_48_8;
                      stackOut_48_9 = stackIn_48_9;
                      stackOut_48_10 = stackIn_48_10;
                      stackOut_48_11 = stackIn_48_11;
                      stackOut_48_12 = stackIn_48_12;
                      stackOut_48_13 = stackIn_48_13;
                      stackOut_48_14 = stackIn_48_14;
                      stackOut_48_15 = stackIn_48_15;
                      stackOut_48_16 = stackIn_48_16;
                      stackOut_48_17 = stackIn_48_17;
                      stackOut_48_18 = stackIn_48_18;
                      stackOut_48_19 = stackIn_48_19;
                      stackOut_48_20 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      stackIn_49_2 = stackOut_48_2;
                      stackIn_49_3 = stackOut_48_3;
                      stackIn_49_4 = stackOut_48_4;
                      stackIn_49_5 = stackOut_48_5;
                      stackIn_49_6 = stackOut_48_6;
                      stackIn_49_7 = stackOut_48_7;
                      stackIn_49_8 = stackOut_48_8;
                      stackIn_49_9 = stackOut_48_9;
                      stackIn_49_10 = stackOut_48_10;
                      stackIn_49_11 = stackOut_48_11;
                      stackIn_49_12 = stackOut_48_12;
                      stackIn_49_13 = stackOut_48_13;
                      stackIn_49_14 = stackOut_48_14;
                      stackIn_49_15 = stackOut_48_15;
                      stackIn_49_16 = stackOut_48_16;
                      stackIn_49_17 = stackOut_48_17;
                      stackIn_49_18 = stackOut_48_18;
                      stackIn_49_19 = stackOut_48_19;
                      stackIn_49_20 = stackOut_48_20;
                      break L54;
                    } else {
                      stackOut_47_0 = null;
                      stackOut_47_1 = null;
                      stackOut_47_2 = (qm) ((Object) stackIn_47_2);
                      stackOut_47_3 = (qm) ((Object) stackIn_47_3);
                      stackOut_47_4 = stackIn_47_4;
                      stackOut_47_5 = stackIn_47_5;
                      stackOut_47_6 = stackIn_47_6;
                      stackOut_47_7 = stackIn_47_7;
                      stackOut_47_8 = stackIn_47_8;
                      stackOut_47_9 = stackIn_47_9;
                      stackOut_47_10 = stackIn_47_10;
                      stackOut_47_11 = stackIn_47_11;
                      stackOut_47_12 = stackIn_47_12;
                      stackOut_47_13 = stackIn_47_13;
                      stackOut_47_14 = stackIn_47_14;
                      stackOut_47_15 = stackIn_47_15;
                      stackOut_47_16 = stackIn_47_16;
                      stackOut_47_17 = stackIn_47_17;
                      stackOut_47_18 = stackIn_47_18;
                      stackOut_47_19 = stackIn_47_19;
                      stackOut_47_20 = 1;
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
                      stackIn_49_17 = stackOut_47_17;
                      stackIn_49_18 = stackOut_47_18;
                      stackIn_49_19 = stackOut_47_19;
                      stackIn_49_20 = stackOut_47_20;
                      break L54;
                    }
                  }
                  L55: {
                    var23 = new dd(stackIn_49_2, stackIn_49_3, stackIn_49_4, stackIn_49_5, stackIn_49_6, stackIn_49_7, stackIn_49_8, stackIn_49_9, stackIn_49_10, stackIn_49_11, stackIn_49_12, stackIn_49_13, stackIn_49_14, stackIn_49_15 != 0, stackIn_49_16 != 0, stackIn_49_17 != 0, stackIn_49_18 != 0, stackIn_49_19 != 0, stackIn_49_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                    var20.a(var23, (byte) 6);
                    var24_ref = new qm(var4_ref.k(96), var4_ref.k(-105));
                    var25_int = var4_ref.k(param2 + -149);
                    var26_array = new int[]{-var4_ref.f((byte) -30), -var4_ref.f((byte) -51), var4_ref.f((byte) -23), var4_ref.f((byte) -47)};
                    var17 = var4_ref.f((byte) -46);
                    var27 = (float)var4_ref.h(-14232) / 256.0f;
                    var28_float = (float)var4_ref.h(-14232) / 256.0f;
                    var16 = var4_ref.f(0);
                    var29_ref_qm = new qm(var4_ref.k(param2 + -101), var4_ref.k(param2 + 83));
                    stackOut_49_0 = null;
                    stackOut_49_1 = null;
                    stackOut_49_2 = (qm) (var24_ref);
                    stackOut_49_3 = var25_int;
                    stackOut_49_4 = var27;
                    stackOut_49_5 = var28_float;
                    stackOut_49_6 = var16;
                    stackOut_49_7 = var26_array[1];
                    stackOut_49_8 = var26_array[2];
                    stackOut_49_9 = var26_array[0];
                    stackOut_49_10 = var26_array[3];
                    stackOut_49_11 = null;
                    stackOut_49_12 = null;
                    stackOut_49_13 = (qm) (var29_ref_qm);
                    stackIn_52_0 = stackOut_49_0;
                    stackIn_52_1 = stackOut_49_1;
                    stackIn_52_2 = stackOut_49_2;
                    stackIn_52_3 = stackOut_49_3;
                    stackIn_52_4 = stackOut_49_4;
                    stackIn_52_5 = stackOut_49_5;
                    stackIn_52_6 = stackOut_49_6;
                    stackIn_52_7 = stackOut_49_7;
                    stackIn_52_8 = stackOut_49_8;
                    stackIn_52_9 = stackOut_49_9;
                    stackIn_52_10 = stackOut_49_10;
                    stackIn_52_11 = stackOut_49_11;
                    stackIn_52_12 = stackOut_49_12;
                    stackIn_52_13 = stackOut_49_13;
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
                    if (0 == (var17 & 2)) {
                      stackOut_52_0 = null;
                      stackOut_52_1 = null;
                      stackOut_52_2 = (qm) ((Object) stackIn_52_2);
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
                      stackOut_52_13 = (qm) ((Object) stackIn_52_13);
                      stackOut_52_14 = 0;
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
                      break L55;
                    } else {
                      stackOut_50_0 = null;
                      stackOut_50_1 = null;
                      stackOut_50_2 = (qm) ((Object) stackIn_50_2);
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
                      stackOut_50_13 = (qm) ((Object) stackIn_50_13);
                      stackOut_50_14 = 1;
                      stackIn_53_0 = stackOut_50_0;
                      stackIn_53_1 = stackOut_50_1;
                      stackIn_53_2 = stackOut_50_2;
                      stackIn_53_3 = stackOut_50_3;
                      stackIn_53_4 = stackOut_50_4;
                      stackIn_53_5 = stackOut_50_5;
                      stackIn_53_6 = stackOut_50_6;
                      stackIn_53_7 = stackOut_50_7;
                      stackIn_53_8 = stackOut_50_8;
                      stackIn_53_9 = stackOut_50_9;
                      stackIn_53_10 = stackOut_50_10;
                      stackIn_53_11 = stackOut_50_11;
                      stackIn_53_12 = stackOut_50_12;
                      stackIn_53_13 = stackOut_50_13;
                      stackIn_53_14 = stackOut_50_14;
                      break L55;
                    }
                  }
                  L56: {
                    stackOut_53_0 = null;
                    stackOut_53_1 = null;
                    stackOut_53_2 = (qm) ((Object) stackIn_53_2);
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
                    stackOut_53_13 = (qm) ((Object) stackIn_53_13);
                    stackOut_53_14 = stackIn_53_14;
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
                    if (0 == (var17 & 4)) {
                      stackOut_55_0 = null;
                      stackOut_55_1 = null;
                      stackOut_55_2 = (qm) ((Object) stackIn_55_2);
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
                      stackOut_55_13 = (qm) ((Object) stackIn_55_13);
                      stackOut_55_14 = stackIn_55_14;
                      stackOut_55_15 = 0;
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
                      break L56;
                    } else {
                      stackOut_54_0 = null;
                      stackOut_54_1 = null;
                      stackOut_54_2 = (qm) ((Object) stackIn_54_2);
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
                      stackOut_54_13 = (qm) ((Object) stackIn_54_13);
                      stackOut_54_14 = stackIn_54_14;
                      stackOut_54_15 = 1;
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
                      break L56;
                    }
                  }
                  L57: {
                    stackOut_56_0 = null;
                    stackOut_56_1 = null;
                    stackOut_56_2 = (qm) ((Object) stackIn_56_2);
                    stackOut_56_3 = stackIn_56_3;
                    stackOut_56_4 = stackIn_56_4;
                    stackOut_56_5 = stackIn_56_5;
                    stackOut_56_6 = stackIn_56_6;
                    stackOut_56_7 = stackIn_56_7;
                    stackOut_56_8 = stackIn_56_8;
                    stackOut_56_9 = stackIn_56_9;
                    stackOut_56_10 = stackIn_56_10;
                    stackOut_56_11 = stackIn_56_11;
                    stackOut_56_12 = stackIn_56_12;
                    stackOut_56_13 = (qm) ((Object) stackIn_56_13);
                    stackOut_56_14 = stackIn_56_14;
                    stackOut_56_15 = stackIn_56_15;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    stackIn_58_3 = stackOut_56_3;
                    stackIn_58_4 = stackOut_56_4;
                    stackIn_58_5 = stackOut_56_5;
                    stackIn_58_6 = stackOut_56_6;
                    stackIn_58_7 = stackOut_56_7;
                    stackIn_58_8 = stackOut_56_8;
                    stackIn_58_9 = stackOut_56_9;
                    stackIn_58_10 = stackOut_56_10;
                    stackIn_58_11 = stackOut_56_11;
                    stackIn_58_12 = stackOut_56_12;
                    stackIn_58_13 = stackOut_56_13;
                    stackIn_58_14 = stackOut_56_14;
                    stackIn_58_15 = stackOut_56_15;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    stackIn_57_3 = stackOut_56_3;
                    stackIn_57_4 = stackOut_56_4;
                    stackIn_57_5 = stackOut_56_5;
                    stackIn_57_6 = stackOut_56_6;
                    stackIn_57_7 = stackOut_56_7;
                    stackIn_57_8 = stackOut_56_8;
                    stackIn_57_9 = stackOut_56_9;
                    stackIn_57_10 = stackOut_56_10;
                    stackIn_57_11 = stackOut_56_11;
                    stackIn_57_12 = stackOut_56_12;
                    stackIn_57_13 = stackOut_56_13;
                    stackIn_57_14 = stackOut_56_14;
                    stackIn_57_15 = stackOut_56_15;
                    if (0 == (var17 & 1)) {
                      stackOut_58_0 = null;
                      stackOut_58_1 = null;
                      stackOut_58_2 = (qm) ((Object) stackIn_58_2);
                      stackOut_58_3 = stackIn_58_3;
                      stackOut_58_4 = stackIn_58_4;
                      stackOut_58_5 = stackIn_58_5;
                      stackOut_58_6 = stackIn_58_6;
                      stackOut_58_7 = stackIn_58_7;
                      stackOut_58_8 = stackIn_58_8;
                      stackOut_58_9 = stackIn_58_9;
                      stackOut_58_10 = stackIn_58_10;
                      stackOut_58_11 = stackIn_58_11;
                      stackOut_58_12 = stackIn_58_12;
                      stackOut_58_13 = (qm) ((Object) stackIn_58_13);
                      stackOut_58_14 = stackIn_58_14;
                      stackOut_58_15 = stackIn_58_15;
                      stackOut_58_16 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      stackIn_59_3 = stackOut_58_3;
                      stackIn_59_4 = stackOut_58_4;
                      stackIn_59_5 = stackOut_58_5;
                      stackIn_59_6 = stackOut_58_6;
                      stackIn_59_7 = stackOut_58_7;
                      stackIn_59_8 = stackOut_58_8;
                      stackIn_59_9 = stackOut_58_9;
                      stackIn_59_10 = stackOut_58_10;
                      stackIn_59_11 = stackOut_58_11;
                      stackIn_59_12 = stackOut_58_12;
                      stackIn_59_13 = stackOut_58_13;
                      stackIn_59_14 = stackOut_58_14;
                      stackIn_59_15 = stackOut_58_15;
                      stackIn_59_16 = stackOut_58_16;
                      break L57;
                    } else {
                      stackOut_57_0 = null;
                      stackOut_57_1 = null;
                      stackOut_57_2 = (qm) ((Object) stackIn_57_2);
                      stackOut_57_3 = stackIn_57_3;
                      stackOut_57_4 = stackIn_57_4;
                      stackOut_57_5 = stackIn_57_5;
                      stackOut_57_6 = stackIn_57_6;
                      stackOut_57_7 = stackIn_57_7;
                      stackOut_57_8 = stackIn_57_8;
                      stackOut_57_9 = stackIn_57_9;
                      stackOut_57_10 = stackIn_57_10;
                      stackOut_57_11 = stackIn_57_11;
                      stackOut_57_12 = stackIn_57_12;
                      stackOut_57_13 = (qm) ((Object) stackIn_57_13);
                      stackOut_57_14 = stackIn_57_14;
                      stackOut_57_15 = stackIn_57_15;
                      stackOut_57_16 = 1;
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
                      stackIn_59_15 = stackOut_57_15;
                      stackIn_59_16 = stackOut_57_16;
                      break L57;
                    }
                  }
                  L58: {
                    stackOut_59_0 = null;
                    stackOut_59_1 = null;
                    stackOut_59_2 = (qm) ((Object) stackIn_59_2);
                    stackOut_59_3 = stackIn_59_3;
                    stackOut_59_4 = stackIn_59_4;
                    stackOut_59_5 = stackIn_59_5;
                    stackOut_59_6 = stackIn_59_6;
                    stackOut_59_7 = stackIn_59_7;
                    stackOut_59_8 = stackIn_59_8;
                    stackOut_59_9 = stackIn_59_9;
                    stackOut_59_10 = stackIn_59_10;
                    stackOut_59_11 = stackIn_59_11;
                    stackOut_59_12 = stackIn_59_12;
                    stackOut_59_13 = (qm) ((Object) stackIn_59_13);
                    stackOut_59_14 = stackIn_59_14;
                    stackOut_59_15 = stackIn_59_15;
                    stackOut_59_16 = stackIn_59_16;
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    stackIn_61_2 = stackOut_59_2;
                    stackIn_61_3 = stackOut_59_3;
                    stackIn_61_4 = stackOut_59_4;
                    stackIn_61_5 = stackOut_59_5;
                    stackIn_61_6 = stackOut_59_6;
                    stackIn_61_7 = stackOut_59_7;
                    stackIn_61_8 = stackOut_59_8;
                    stackIn_61_9 = stackOut_59_9;
                    stackIn_61_10 = stackOut_59_10;
                    stackIn_61_11 = stackOut_59_11;
                    stackIn_61_12 = stackOut_59_12;
                    stackIn_61_13 = stackOut_59_13;
                    stackIn_61_14 = stackOut_59_14;
                    stackIn_61_15 = stackOut_59_15;
                    stackIn_61_16 = stackOut_59_16;
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
                    stackIn_60_16 = stackOut_59_16;
                    if ((var17 & 8) == 0) {
                      stackOut_61_0 = null;
                      stackOut_61_1 = null;
                      stackOut_61_2 = (qm) ((Object) stackIn_61_2);
                      stackOut_61_3 = stackIn_61_3;
                      stackOut_61_4 = stackIn_61_4;
                      stackOut_61_5 = stackIn_61_5;
                      stackOut_61_6 = stackIn_61_6;
                      stackOut_61_7 = stackIn_61_7;
                      stackOut_61_8 = stackIn_61_8;
                      stackOut_61_9 = stackIn_61_9;
                      stackOut_61_10 = stackIn_61_10;
                      stackOut_61_11 = stackIn_61_11;
                      stackOut_61_12 = stackIn_61_12;
                      stackOut_61_13 = (qm) ((Object) stackIn_61_13);
                      stackOut_61_14 = stackIn_61_14;
                      stackOut_61_15 = stackIn_61_15;
                      stackOut_61_16 = stackIn_61_16;
                      stackOut_61_17 = 0;
                      stackIn_62_0 = stackOut_61_0;
                      stackIn_62_1 = stackOut_61_1;
                      stackIn_62_2 = stackOut_61_2;
                      stackIn_62_3 = stackOut_61_3;
                      stackIn_62_4 = stackOut_61_4;
                      stackIn_62_5 = stackOut_61_5;
                      stackIn_62_6 = stackOut_61_6;
                      stackIn_62_7 = stackOut_61_7;
                      stackIn_62_8 = stackOut_61_8;
                      stackIn_62_9 = stackOut_61_9;
                      stackIn_62_10 = stackOut_61_10;
                      stackIn_62_11 = stackOut_61_11;
                      stackIn_62_12 = stackOut_61_12;
                      stackIn_62_13 = stackOut_61_13;
                      stackIn_62_14 = stackOut_61_14;
                      stackIn_62_15 = stackOut_61_15;
                      stackIn_62_16 = stackOut_61_16;
                      stackIn_62_17 = stackOut_61_17;
                      break L58;
                    } else {
                      stackOut_60_0 = null;
                      stackOut_60_1 = null;
                      stackOut_60_2 = (qm) ((Object) stackIn_60_2);
                      stackOut_60_3 = stackIn_60_3;
                      stackOut_60_4 = stackIn_60_4;
                      stackOut_60_5 = stackIn_60_5;
                      stackOut_60_6 = stackIn_60_6;
                      stackOut_60_7 = stackIn_60_7;
                      stackOut_60_8 = stackIn_60_8;
                      stackOut_60_9 = stackIn_60_9;
                      stackOut_60_10 = stackIn_60_10;
                      stackOut_60_11 = stackIn_60_11;
                      stackOut_60_12 = stackIn_60_12;
                      stackOut_60_13 = (qm) ((Object) stackIn_60_13);
                      stackOut_60_14 = stackIn_60_14;
                      stackOut_60_15 = stackIn_60_15;
                      stackOut_60_16 = stackIn_60_16;
                      stackOut_60_17 = 1;
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
                      stackIn_62_16 = stackOut_60_16;
                      stackIn_62_17 = stackOut_60_17;
                      break L58;
                    }
                  }
                  L59: {
                    stackOut_62_0 = null;
                    stackOut_62_1 = null;
                    stackOut_62_2 = (qm) ((Object) stackIn_62_2);
                    stackOut_62_3 = stackIn_62_3;
                    stackOut_62_4 = stackIn_62_4;
                    stackOut_62_5 = stackIn_62_5;
                    stackOut_62_6 = stackIn_62_6;
                    stackOut_62_7 = stackIn_62_7;
                    stackOut_62_8 = stackIn_62_8;
                    stackOut_62_9 = stackIn_62_9;
                    stackOut_62_10 = stackIn_62_10;
                    stackOut_62_11 = stackIn_62_11;
                    stackOut_62_12 = stackIn_62_12;
                    stackOut_62_13 = (qm) ((Object) stackIn_62_13);
                    stackOut_62_14 = stackIn_62_14;
                    stackOut_62_15 = stackIn_62_15;
                    stackOut_62_16 = stackIn_62_16;
                    stackOut_62_17 = stackIn_62_17;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_64_2 = stackOut_62_2;
                    stackIn_64_3 = stackOut_62_3;
                    stackIn_64_4 = stackOut_62_4;
                    stackIn_64_5 = stackOut_62_5;
                    stackIn_64_6 = stackOut_62_6;
                    stackIn_64_7 = stackOut_62_7;
                    stackIn_64_8 = stackOut_62_8;
                    stackIn_64_9 = stackOut_62_9;
                    stackIn_64_10 = stackOut_62_10;
                    stackIn_64_11 = stackOut_62_11;
                    stackIn_64_12 = stackOut_62_12;
                    stackIn_64_13 = stackOut_62_13;
                    stackIn_64_14 = stackOut_62_14;
                    stackIn_64_15 = stackOut_62_15;
                    stackIn_64_16 = stackOut_62_16;
                    stackIn_64_17 = stackOut_62_17;
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
                    stackIn_63_17 = stackOut_62_17;
                    if ((16 & var17) == 0) {
                      stackOut_64_0 = null;
                      stackOut_64_1 = null;
                      stackOut_64_2 = (qm) ((Object) stackIn_64_2);
                      stackOut_64_3 = stackIn_64_3;
                      stackOut_64_4 = stackIn_64_4;
                      stackOut_64_5 = stackIn_64_5;
                      stackOut_64_6 = stackIn_64_6;
                      stackOut_64_7 = stackIn_64_7;
                      stackOut_64_8 = stackIn_64_8;
                      stackOut_64_9 = stackIn_64_9;
                      stackOut_64_10 = stackIn_64_10;
                      stackOut_64_11 = stackIn_64_11;
                      stackOut_64_12 = stackIn_64_12;
                      stackOut_64_13 = (qm) ((Object) stackIn_64_13);
                      stackOut_64_14 = stackIn_64_14;
                      stackOut_64_15 = stackIn_64_15;
                      stackOut_64_16 = stackIn_64_16;
                      stackOut_64_17 = stackIn_64_17;
                      stackOut_64_18 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      stackIn_65_2 = stackOut_64_2;
                      stackIn_65_3 = stackOut_64_3;
                      stackIn_65_4 = stackOut_64_4;
                      stackIn_65_5 = stackOut_64_5;
                      stackIn_65_6 = stackOut_64_6;
                      stackIn_65_7 = stackOut_64_7;
                      stackIn_65_8 = stackOut_64_8;
                      stackIn_65_9 = stackOut_64_9;
                      stackIn_65_10 = stackOut_64_10;
                      stackIn_65_11 = stackOut_64_11;
                      stackIn_65_12 = stackOut_64_12;
                      stackIn_65_13 = stackOut_64_13;
                      stackIn_65_14 = stackOut_64_14;
                      stackIn_65_15 = stackOut_64_15;
                      stackIn_65_16 = stackOut_64_16;
                      stackIn_65_17 = stackOut_64_17;
                      stackIn_65_18 = stackOut_64_18;
                      break L59;
                    } else {
                      stackOut_63_0 = null;
                      stackOut_63_1 = null;
                      stackOut_63_2 = (qm) ((Object) stackIn_63_2);
                      stackOut_63_3 = stackIn_63_3;
                      stackOut_63_4 = stackIn_63_4;
                      stackOut_63_5 = stackIn_63_5;
                      stackOut_63_6 = stackIn_63_6;
                      stackOut_63_7 = stackIn_63_7;
                      stackOut_63_8 = stackIn_63_8;
                      stackOut_63_9 = stackIn_63_9;
                      stackOut_63_10 = stackIn_63_10;
                      stackOut_63_11 = stackIn_63_11;
                      stackOut_63_12 = stackIn_63_12;
                      stackOut_63_13 = (qm) ((Object) stackIn_63_13);
                      stackOut_63_14 = stackIn_63_14;
                      stackOut_63_15 = stackIn_63_15;
                      stackOut_63_16 = stackIn_63_16;
                      stackOut_63_17 = stackIn_63_17;
                      stackOut_63_18 = 1;
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
                      stackIn_65_17 = stackOut_63_17;
                      stackIn_65_18 = stackOut_63_18;
                      break L59;
                    }
                  }
                  L60: {
                    stackOut_65_0 = null;
                    stackOut_65_1 = null;
                    stackOut_65_2 = (qm) ((Object) stackIn_65_2);
                    stackOut_65_3 = stackIn_65_3;
                    stackOut_65_4 = stackIn_65_4;
                    stackOut_65_5 = stackIn_65_5;
                    stackOut_65_6 = stackIn_65_6;
                    stackOut_65_7 = stackIn_65_7;
                    stackOut_65_8 = stackIn_65_8;
                    stackOut_65_9 = stackIn_65_9;
                    stackOut_65_10 = stackIn_65_10;
                    stackOut_65_11 = stackIn_65_11;
                    stackOut_65_12 = stackIn_65_12;
                    stackOut_65_13 = (qm) ((Object) stackIn_65_13);
                    stackOut_65_14 = stackIn_65_14;
                    stackOut_65_15 = stackIn_65_15;
                    stackOut_65_16 = stackIn_65_16;
                    stackOut_65_17 = stackIn_65_17;
                    stackOut_65_18 = stackIn_65_18;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_67_2 = stackOut_65_2;
                    stackIn_67_3 = stackOut_65_3;
                    stackIn_67_4 = stackOut_65_4;
                    stackIn_67_5 = stackOut_65_5;
                    stackIn_67_6 = stackOut_65_6;
                    stackIn_67_7 = stackOut_65_7;
                    stackIn_67_8 = stackOut_65_8;
                    stackIn_67_9 = stackOut_65_9;
                    stackIn_67_10 = stackOut_65_10;
                    stackIn_67_11 = stackOut_65_11;
                    stackIn_67_12 = stackOut_65_12;
                    stackIn_67_13 = stackOut_65_13;
                    stackIn_67_14 = stackOut_65_14;
                    stackIn_67_15 = stackOut_65_15;
                    stackIn_67_16 = stackOut_65_16;
                    stackIn_67_17 = stackOut_65_17;
                    stackIn_67_18 = stackOut_65_18;
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
                    stackIn_66_18 = stackOut_65_18;
                    if ((32 & var17) == 0) {
                      stackOut_67_0 = null;
                      stackOut_67_1 = null;
                      stackOut_67_2 = (qm) ((Object) stackIn_67_2);
                      stackOut_67_3 = stackIn_67_3;
                      stackOut_67_4 = stackIn_67_4;
                      stackOut_67_5 = stackIn_67_5;
                      stackOut_67_6 = stackIn_67_6;
                      stackOut_67_7 = stackIn_67_7;
                      stackOut_67_8 = stackIn_67_8;
                      stackOut_67_9 = stackIn_67_9;
                      stackOut_67_10 = stackIn_67_10;
                      stackOut_67_11 = stackIn_67_11;
                      stackOut_67_12 = stackIn_67_12;
                      stackOut_67_13 = (qm) ((Object) stackIn_67_13);
                      stackOut_67_14 = stackIn_67_14;
                      stackOut_67_15 = stackIn_67_15;
                      stackOut_67_16 = stackIn_67_16;
                      stackOut_67_17 = stackIn_67_17;
                      stackOut_67_18 = stackIn_67_18;
                      stackOut_67_19 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      stackIn_68_2 = stackOut_67_2;
                      stackIn_68_3 = stackOut_67_3;
                      stackIn_68_4 = stackOut_67_4;
                      stackIn_68_5 = stackOut_67_5;
                      stackIn_68_6 = stackOut_67_6;
                      stackIn_68_7 = stackOut_67_7;
                      stackIn_68_8 = stackOut_67_8;
                      stackIn_68_9 = stackOut_67_9;
                      stackIn_68_10 = stackOut_67_10;
                      stackIn_68_11 = stackOut_67_11;
                      stackIn_68_12 = stackOut_67_12;
                      stackIn_68_13 = stackOut_67_13;
                      stackIn_68_14 = stackOut_67_14;
                      stackIn_68_15 = stackOut_67_15;
                      stackIn_68_16 = stackOut_67_16;
                      stackIn_68_17 = stackOut_67_17;
                      stackIn_68_18 = stackOut_67_18;
                      stackIn_68_19 = stackOut_67_19;
                      break L60;
                    } else {
                      stackOut_66_0 = null;
                      stackOut_66_1 = null;
                      stackOut_66_2 = (qm) ((Object) stackIn_66_2);
                      stackOut_66_3 = stackIn_66_3;
                      stackOut_66_4 = stackIn_66_4;
                      stackOut_66_5 = stackIn_66_5;
                      stackOut_66_6 = stackIn_66_6;
                      stackOut_66_7 = stackIn_66_7;
                      stackOut_66_8 = stackIn_66_8;
                      stackOut_66_9 = stackIn_66_9;
                      stackOut_66_10 = stackIn_66_10;
                      stackOut_66_11 = stackIn_66_11;
                      stackOut_66_12 = stackIn_66_12;
                      stackOut_66_13 = (qm) ((Object) stackIn_66_13);
                      stackOut_66_14 = stackIn_66_14;
                      stackOut_66_15 = stackIn_66_15;
                      stackOut_66_16 = stackIn_66_16;
                      stackOut_66_17 = stackIn_66_17;
                      stackOut_66_18 = stackIn_66_18;
                      stackOut_66_19 = 1;
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
                      stackIn_68_18 = stackOut_66_18;
                      stackIn_68_19 = stackOut_66_19;
                      break L60;
                    }
                  }
                  var30_ref_hn = new hn(stackIn_68_2, stackIn_68_3, stackIn_68_4, stackIn_68_5, stackIn_68_6, stackIn_68_7, stackIn_68_8, stackIn_68_9, stackIn_68_10, (qm) ((Object) stackIn_68_11), (qm) ((Object) stackIn_68_12), stackIn_68_13, stackIn_68_14 != 0, stackIn_68_15 != 0, stackIn_68_16 != 0, stackIn_68_17 != 0, stackIn_68_18 != 0, stackIn_68_19 != 0);
                  var20.a(var30_ref_hn, (byte) 6);
                  var14++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L61: {
            var4 = decompiledCaughtException;
            stackOut_264_0 = (RuntimeException) (var4);
            stackOut_264_1 = new StringBuilder().append("sg.W(");
            stackIn_267_0 = stackOut_264_0;
            stackIn_267_1 = stackOut_264_1;
            stackIn_265_0 = stackOut_264_0;
            stackIn_265_1 = stackOut_264_1;
            if (param0 == null) {
              stackOut_267_0 = (RuntimeException) ((Object) stackIn_267_0);
              stackOut_267_1 = (StringBuilder) ((Object) stackIn_267_1);
              stackOut_267_2 = "null";
              stackIn_268_0 = stackOut_267_0;
              stackIn_268_1 = stackOut_267_1;
              stackIn_268_2 = stackOut_267_2;
              break L61;
            } else {
              stackOut_265_0 = (RuntimeException) ((Object) stackIn_265_0);
              stackOut_265_1 = (StringBuilder) ((Object) stackIn_265_1);
              stackOut_265_2 = "{...}";
              stackIn_268_0 = stackOut_265_0;
              stackIn_268_1 = stackOut_265_1;
              stackIn_268_2 = stackOut_265_2;
              break L61;
            }
          }
          L62: {
            stackOut_268_0 = (RuntimeException) ((Object) stackIn_268_0);
            stackOut_268_1 = ((StringBuilder) (Object) stackIn_268_1).append(stackIn_268_2).append(',');
            stackIn_271_0 = stackOut_268_0;
            stackIn_271_1 = stackOut_268_1;
            stackIn_269_0 = stackOut_268_0;
            stackIn_269_1 = stackOut_268_1;
            if (param1 == null) {
              stackOut_271_0 = (RuntimeException) ((Object) stackIn_271_0);
              stackOut_271_1 = (StringBuilder) ((Object) stackIn_271_1);
              stackOut_271_2 = "null";
              stackIn_272_0 = stackOut_271_0;
              stackIn_272_1 = stackOut_271_1;
              stackIn_272_2 = stackOut_271_2;
              break L62;
            } else {
              stackOut_269_0 = (RuntimeException) ((Object) stackIn_269_0);
              stackOut_269_1 = (StringBuilder) ((Object) stackIn_269_1);
              stackOut_269_2 = "{...}";
              stackIn_272_0 = stackOut_269_0;
              stackIn_272_1 = stackOut_269_1;
              stackIn_272_2 = stackOut_269_2;
              break L62;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_272_0), stackIn_272_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, ah param1) {
        RuntimeException runtimeException = null;
        jk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3 = (jk) ((Object) param1.b((byte) 124));
              if (!param0) {
                break L1;
              } else {
                this.field_J = 78;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L3: {
                  if (var3.field_i == 0) {
                    break L3;
                  } else {
                    var3.f(-115);
                    if (0 >= var3.field_i) {
                      var3.a((byte) -21);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = (jk) ((Object) param1.c((byte) -76));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    private final int c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 6293) {
                break L1;
              } else {
                this.field_P = 13;
                break L1;
              }
            }
            stackOut_3_0 = param0 | param2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(wm param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        jk var4 = null;
        int[] var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            if (-1 == (param0.field_J & 65536 ^ -1)) {
              L1: {
                if (!this.field_pb) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0.field_A.field_h;
                    var4_int = param0.field_A.field_f;
                    if ((131072 & param0.field_J) == 0) {
                      break L2;
                    } else {
                      var4_int = param0.field_F;
                      var3_int = param0.field_D;
                      break L2;
                    }
                  }
                  if (-1 == (16384 & param0.field_J ^ -1)) {
                    if (!param0.field_E.field_d) {
                      tc.g(var3_int - -this.field_db.field_k, var4_int + this.field_db.field_a, param0.field_E.field_a, 0, 128);
                      break L1;
                    } else {
                      var5 = new int[16];
                      var6 = param0.field_w.field_j;
                      var7 = param0.field_w.field_g;
                      var8 = -var7;
                      var9 = var6;
                      var10 = (float)param0.field_E.field_m;
                      var11 = (float)param0.field_E.field_h;
                      var5[7] = (int)((float)var4_int + var10 * var7 - var11 * var9);
                      var5[2] = (int)(-(var10 * var6) + (float)var3_int + var8 * var11);
                      var5[3] = (int)(-(var10 * var7) + (float)var4_int + var9 * var11);
                      var5[1] = (int)((float)var4_int + var7 * var10 + var11 * var9);
                      var5[0] = (int)(var11 * var8 + ((float)var3_int + var10 * var6));
                      var5[4] = (int)(-(var10 * var6) + (float)var3_int - var11 * var8);
                      var5[6] = (int)(-(var11 * var8) + ((float)var3_int + var6 * var10));
                      var5[5] = (int)((float)var4_int - var7 * var10 - var9 * var11);
                      var12 = 0;
                      L3: while (true) {
                        if (8 <= var12) {
                          var5 = qk.a(var5, (byte) -127);
                          dl.a(var5, (byte) -106, 128, 0);
                          break L1;
                        } else {
                          var5[var12 + 8] = var5[var12] - -this.field_db.field_k;
                          var5[var12 + 9] = var5[var12 + 1] - -this.field_db.field_a;
                          var12 += 2;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    hc.a(128, param0.a((byte) -110), (byte) -108, this.field_db.field_k + var3_int, this.field_db.field_a + var4_int);
                    break L1;
                  }
                }
              }
              if (param1 == 8192) {
                var3_int = param0.field_q - -1;
                L4: while (true) {
                  if (var3_int >= 4) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = (jk) ((Object) this.field_M[var3_int].b((byte) 111));
                    L5: while (true) {
                      if (var4 == null) {
                        var3_int++;
                        continue L4;
                      } else {
                        this.a(var4.field_t >> 63550762, var4.field_k >> 415232074, var4.field_u >> 287519818, (byte) -35, param0, var4.field_q * 2 >> 1059030178);
                        var4 = (jk) ((Object) this.field_M[var3_int].c((byte) 121));
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var3);
            stackOut_32_1 = new StringBuilder().append("sg.GA(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(long param0, boolean param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              this.a((byte) -3, param0);
              if (3 != this.field_r) {
                L2: {
                  L3: {
                    var4_int = this.field_F + 128;
                    if (-3 == (this.field_J ^ -1)) {
                      break L3;
                    } else {
                      if (-7 != (this.field_J ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int = var4_int + 256 >> 1522721953;
                  break L2;
                }
                o.a(128, 480, 0, var4_int, 640, -4441, 0);
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 1 * hc.a(0, (int)(param0 << 889460929)) - -(2 * tn.a((int)(param0 >> -1297370047), 5255)) >> -367820460;
            var5 = ((int)param0 * 640 - 1) % 1337;
            var6 = var5 / 640;
            L4: while (true) {
              if (-481 >= (var6 ^ -1)) {
                var5 = (-1 + (int)param0 * 640) % 917;
                var6 = var5 / 640;
                L5: while (true) {
                  if (var6 >= 480) {
                    L6: {
                      if (param1) {
                        break L6;
                      } else {
                        this.field_qb = (hj) null;
                        break L6;
                      }
                    }
                    var5 = (640 * (int)param0 - 1) % 593;
                    var6 = var5 / 640;
                    L7: while (true) {
                      if (var6 >= 480) {
                        break L0;
                      } else {
                        L8: {
                          if (-1 == ((2 * var5 + var6 * 4) % 7 ^ -1)) {
                            tc.d(var5, var6, -4 + (var5 - -var4_int), -7 + var6, 5461344);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var5 += 375;
                        if (var5 <= 640) {
                          continue L7;
                        } else {
                          var6 = var6 + var5 / 640;
                          var5 = var5 % 640;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    L9: {
                      if ((var6 * 4 + var5 * 2) % 7 != 0) {
                        break L9;
                      } else {
                        tc.d(var5, var6, var4_int + (-3 + var5), -5 + var6, 3364192);
                        break L9;
                      }
                    }
                    var5 += 547;
                    if (640 < var5) {
                      var6 = var6 + var5 / 640;
                      var5 = var5 % 640;
                      continue L5;
                    } else {
                      continue L5;
                    }
                  }
                }
              } else {
                L10: {
                  if (-1 != ((var5 * 3 - -(5 * var6)) % 9 ^ -1)) {
                    break L10;
                  } else {
                    tc.d(var5, var6, -3 + (var5 + var4_int), var6 + -7, 6715272);
                    break L10;
                  }
                }
                var5 += 939;
                if (640 < var5) {
                  var6 = var6 + var5 / 640;
                  var5 = var5 % 640;
                  continue L4;
                } else {
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(String param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException var3 = null;
        ji var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              this.field_a = this.field_mb;
              if (param0 == null) {
                fieldTemp$1 = this.field_mb + 1;
                this.field_mb = this.field_mb + 1;
                if ((fieldTemp$1 ^ -1) != (mm.field_a.length ^ -1)) {
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                this.field_mb = this.a(param0, -118);
                break L1;
              }
            }
            L2: {
              if (this.field_mb == this.field_a) {
                break L2;
              } else {
                this.field_k = 0;
                break L2;
              }
            }
            L3: {
              var3_ref = mm.field_a[this.field_mb];
              if (param1 == 8) {
                break L3;
              } else {
                this.b((String) null, (byte) 71);
                break L3;
              }
            }
            var4 = 0;
            L4: while (true) {
              if (var4 >= var3_ref.field_c) {
                break L0;
              } else {
                this.a(var3_ref.field_e[var4], -99);
                var4++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("sg.EA(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, ja param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (-4 >= (var4_int ^ -1)) {
                L2: {
                  if (param1 == -403) {
                    break L2;
                  } else {
                    this.field_lb = (bm) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param2.field_Fb[var4_int] != 3) {
                    break L3;
                  } else {
                    L4: {
                      var6 = var4_int;
                      if (-1 != (var6 ^ -1)) {
                        if (var6 == 1) {
                          var5 = 65280;
                          break L4;
                        } else {
                          var5 = 8355839;
                          break L4;
                        }
                      } else {
                        var5 = 16711680;
                        break L4;
                      }
                    }
                    tc.g(param2.field_A.field_h, param2.field_A.field_f, 4 + param0 * 4, var5, 16);
                    break L3;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("sg.J(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    private final void b(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        ji var2_ref = null;
        int var3 = 0;
        ok var4 = null;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_154_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var2_ref = mm.field_a[this.field_mb];
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var3 >= var2_ref.field_b) {
                  break L2;
                } else {
                  var4 = var2_ref.field_p[var3];
                  var5 = 1;
                  var6 = 0;
                  L3: while (true) {
                    if (var4.field_d <= var6) {
                      if (var5 != 0) {
                        this.b(var4.field_b, (byte) 8);
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      L4: {
                        var7 = var4.field_a[var6];
                        if (var7.field_d != 0) {
                          if ((var7.field_d ^ -1) == -2) {
                            L5: {
                              stackOut_154_0 = var5;
                              stackIn_159_0 = stackOut_154_0;
                              stackIn_155_0 = stackOut_154_0;
                              if (0 == (2 & this.field_o)) {
                                stackOut_159_0 = stackIn_159_0;
                                stackOut_159_1 = 0;
                                stackIn_160_0 = stackOut_159_0;
                                stackIn_160_1 = stackOut_159_1;
                                break L5;
                              } else {
                                stackOut_155_0 = stackIn_155_0;
                                stackIn_157_0 = stackOut_155_0;
                                stackOut_157_0 = stackIn_157_0;
                                stackOut_157_1 = 1;
                                stackIn_160_0 = stackOut_157_0;
                                stackIn_160_1 = stackOut_157_1;
                                break L5;
                              }
                            }
                            var5 = stackIn_160_0 & stackIn_160_1;
                            break L4;
                          } else {
                            if (-3 != (var7.field_d ^ -1)) {
                              if (3 == var7.field_d) {
                                L6: {
                                  var8 = this.field_C[0].field_Fb[var7.field_c];
                                  var9 = var7.field_e;
                                  if (var9 <= var8) {
                                    break L6;
                                  } else {
                                    if ((1 & var7.field_b) == 0) {
                                      var5 = 0;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if ((var8 ^ -1) != (var9 ^ -1)) {
                                    break L7;
                                  } else {
                                    if ((2 & var7.field_b ^ -1) != -1) {
                                      break L7;
                                    } else {
                                      var5 = 0;
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (var8 <= var9) {
                                    break L8;
                                  } else {
                                    if ((var7.field_b & 4 ^ -1) != -1) {
                                      break L8;
                                    } else {
                                      var5 = 0;
                                      break L8;
                                    }
                                  }
                                }
                                break L4;
                              } else {
                                if ((var7.field_d ^ -1) != -5) {
                                  if (var7.field_d != 5) {
                                    if (-10 == (var7.field_d ^ -1)) {
                                      L9: {
                                        var8 = this.field_C[var7.field_c].field_R;
                                        var9 = var7.field_e;
                                        if (var9 <= var8) {
                                          break L9;
                                        } else {
                                          if (0 == (1 & var7.field_b)) {
                                            var5 = 0;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if ((var9 ^ -1) != (var8 ^ -1)) {
                                          break L10;
                                        } else {
                                          if (0 != (2 & var7.field_b)) {
                                            break L10;
                                          } else {
                                            var5 = 0;
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                                          break L11;
                                        } else {
                                          if ((var7.field_b & 4) == 0) {
                                            var5 = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      break L4;
                                    } else {
                                      if ((var7.field_d ^ -1) != -7) {
                                        if (7 != var7.field_d) {
                                          if (8 != var7.field_d) {
                                            break L4;
                                          } else {
                                            L12: {
                                              L13: {
                                                stackOut_106_0 = var5;
                                                stackIn_114_0 = stackOut_106_0;
                                                stackIn_107_0 = stackOut_106_0;
                                                if (!this.field_U) {
                                                  break L13;
                                                } else {
                                                  stackOut_107_0 = stackIn_107_0;
                                                  stackIn_109_0 = stackOut_107_0;
                                                  stackOut_109_0 = stackIn_109_0;
                                                  stackIn_114_0 = stackOut_109_0;
                                                  stackIn_110_0 = stackOut_109_0;
                                                  if (-151 < (-this.field_ob + this.field_ab ^ -1)) {
                                                    break L13;
                                                  } else {
                                                    stackOut_110_0 = stackIn_110_0;
                                                    stackIn_112_0 = stackOut_110_0;
                                                    stackOut_112_0 = stackIn_112_0;
                                                    stackOut_112_1 = 1;
                                                    stackIn_115_0 = stackOut_112_0;
                                                    stackIn_115_1 = stackOut_112_1;
                                                    break L12;
                                                  }
                                                }
                                              }
                                              stackOut_114_0 = stackIn_114_0;
                                              stackOut_114_1 = 0;
                                              stackIn_115_0 = stackOut_114_0;
                                              stackIn_115_1 = stackOut_114_1;
                                              break L12;
                                            }
                                            var5 = stackIn_115_0 & stackIn_115_1;
                                            break L4;
                                          }
                                        } else {
                                          L14: {
                                            stackOut_96_0 = var5;
                                            stackIn_101_0 = stackOut_96_0;
                                            stackIn_97_0 = stackOut_96_0;
                                            if (0 == (16 & this.field_o)) {
                                              stackOut_101_0 = stackIn_101_0;
                                              stackOut_101_1 = 0;
                                              stackIn_102_0 = stackOut_101_0;
                                              stackIn_102_1 = stackOut_101_1;
                                              break L14;
                                            } else {
                                              stackOut_97_0 = stackIn_97_0;
                                              stackIn_99_0 = stackOut_97_0;
                                              stackOut_99_0 = stackIn_99_0;
                                              stackOut_99_1 = 1;
                                              stackIn_102_0 = stackOut_99_0;
                                              stackIn_102_1 = stackOut_99_1;
                                              break L14;
                                            }
                                          }
                                          var5 = stackIn_102_0 & stackIn_102_1;
                                          break L4;
                                        }
                                      } else {
                                        L15: {
                                          stackOut_86_0 = var5;
                                          stackIn_91_0 = stackOut_86_0;
                                          stackIn_87_0 = stackOut_86_0;
                                          if (-1 == (8 & this.field_o ^ -1)) {
                                            stackOut_91_0 = stackIn_91_0;
                                            stackOut_91_1 = 0;
                                            stackIn_92_0 = stackOut_91_0;
                                            stackIn_92_1 = stackOut_91_1;
                                            break L15;
                                          } else {
                                            stackOut_87_0 = stackIn_87_0;
                                            stackIn_89_0 = stackOut_87_0;
                                            stackOut_89_0 = stackIn_89_0;
                                            stackOut_89_1 = 1;
                                            stackIn_92_0 = stackOut_89_0;
                                            stackIn_92_1 = stackOut_89_1;
                                            break L15;
                                          }
                                        }
                                        var5 = stackIn_92_0 & stackIn_92_1;
                                        break L4;
                                      }
                                    }
                                  } else {
                                    L16: {
                                      var8 = this.field_C[var7.field_c].field_bc;
                                      var9 = var7.field_e;
                                      if ((var8 ^ -1) <= (var9 ^ -1)) {
                                        break L16;
                                      } else {
                                        if (-1 == (var7.field_b & 1 ^ -1)) {
                                          var5 = 0;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var9 != var8) {
                                        break L17;
                                      } else {
                                        if (-1 == (2 & var7.field_b ^ -1)) {
                                          var5 = 0;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if ((var9 ^ -1) <= (var8 ^ -1)) {
                                        break L18;
                                      } else {
                                        if (0 == (4 & var7.field_b)) {
                                          var5 = 0;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } else {
                                  if (this.field_C[var7.field_c].field_J == var7.field_b) {
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                              }
                            } else {
                              L19: {
                                if (var7.field_b < 0) {
                                  stackOut_26_0 = var7.field_b + this.field_sb.length;
                                  stackIn_27_0 = stackOut_26_0;
                                  break L19;
                                } else {
                                  stackOut_24_0 = var7.field_b;
                                  stackIn_27_0 = stackOut_24_0;
                                  break L19;
                                }
                              }
                              L20: {
                                var8 = stackIn_27_0;
                                var9 = (int)this.field_C[0].field_vb;
                                if (var9 >= var8) {
                                  break L20;
                                } else {
                                  if (-1 == (var7.field_c & 1 ^ -1)) {
                                    var5 = 0;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (var8 != var9) {
                                  break L21;
                                } else {
                                  if ((var7.field_c & 2 ^ -1) != -1) {
                                    break L21;
                                  } else {
                                    var5 = 0;
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if ((var8 ^ -1) <= (var9 ^ -1)) {
                                  break L22;
                                } else {
                                  if (-1 != (4 & var7.field_c ^ -1)) {
                                    break L22;
                                  } else {
                                    var5 = 0;
                                    break L22;
                                  }
                                }
                              }
                              break L4;
                            }
                          }
                        } else {
                          L23: {
                            stackOut_8_0 = var5;
                            stackIn_13_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if ((this.field_o & 1) == 0) {
                              stackOut_13_0 = stackIn_13_0;
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L23;
                            } else {
                              stackOut_9_0 = stackIn_9_0;
                              stackIn_11_0 = stackOut_9_0;
                              stackOut_11_0 = stackIn_11_0;
                              stackOut_11_1 = 1;
                              stackIn_14_0 = stackOut_11_0;
                              stackIn_14_1 = stackOut_11_1;
                              break L23;
                            }
                          }
                          var5 = stackIn_14_0 & stackIn_14_1;
                          break L4;
                        }
                      }
                      var6++;
                      continue L3;
                    }
                  }
                }
              }
              L24: {
                if (param0 == 31782) {
                  break L24;
                } else {
                  field_Y = (String) null;
                  break L24;
                }
              }
              L25: {
                if (0 >= this.field_tb) {
                  break L25;
                } else {
                  if (-257 < (this.field_tb ^ -1)) {
                    fieldTemp$4 = this.field_tb - 3;
                    this.field_tb = this.field_tb - 3;
                    if (fieldTemp$4 <= 0) {
                      this.field_D = -101;
                      break L25;
                    } else {
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                if ((this.field_a ^ -1) == (this.field_mb ^ -1)) {
                  break L26;
                } else {
                  fieldTemp$5 = this.field_k + 1;
                  this.field_k = this.field_k + 1;
                  if (fieldTemp$5 != 40) {
                    break L26;
                  } else {
                    this.field_a = this.field_mb;
                    break L26;
                  }
                }
              }
              L27: {
                this.field_o = this.field_o & -28;
                if (0 != (this.field_mb ^ -1)) {
                  if (null == mm.field_a[this.field_mb].field_j) {
                    fieldTemp$6 = pc.field_h + 4;
                    pc.field_h = pc.field_h + 4;
                    if (-256 > (fieldTemp$6 ^ -1)) {
                      pc.field_h = 255;
                      break L27;
                    } else {
                      break L27;
                    }
                  } else {
                    fieldTemp$7 = pc.field_h - 4;
                    pc.field_h = pc.field_h - 4;
                    if (-1 < (fieldTemp$7 ^ -1)) {
                      pc.field_h = 0;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                } else {
                  pc.field_h = 255;
                  break L27;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.RA(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_31_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2) {
              L1: {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (-1 < (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (640 <= param3) {
                      break L1;
                    } else {
                      if (param1 >= 480) {
                        break L1;
                      } else {
                        L2: {
                          var5_int = this.field_lb.field_m[param3 + 640 * param1];
                          if ((param0 ^ -1) > -2) {
                            if ((param0 ^ -1) >= 0) {
                              var5_int = var5_int & 15;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            var5_int = var5_int & 60;
                            break L2;
                          }
                        }
                        L3: {
                          if (0 == var5_int) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L3;
                          } else {
                            stackOut_22_0 = 1;
                            stackIn_25_0 = stackOut_22_0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              L4: {
                if (param2) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L4;
                } else {
                  stackOut_27_0 = 1;
                  stackIn_30_0 = stackOut_27_0;
                  break L4;
                }
              }
              stackOut_30_0 = b.a(stackIn_30_0 != 0, param3, param1, this.field_nb);
              stackIn_31_0 = stackOut_30_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "sg.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0 != 0;
          } else {
            return stackIn_31_0;
          }
        }
    }

    private final void a(ja param0, float param1, int param2, float param3, float param4) {
        RuntimeException var6 = null;
        float var6_float = 0.0f;
        int var7 = 0;
        int var8_int = 0;
        wm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
                if ((var7 ^ -1) >= (var8_int ^ -1)) {
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
              var8 = (wm) ((Object) this.field_d.b((byte) 108));
              L4: while (true) {
                if (null == var8) {
                  L5: {
                    param0.a(-1, bl.field_r.field_sb);
                    if (param2 == (param0.field_v ^ -1)) {
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
                      this.a(var8, param0, (byte) 7);
                      break L6;
                    }
                  }
                  var8 = (wm) ((Object) this.field_d.c((byte) 92));
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var6);
            stackOut_26_1 = new StringBuilder().append("sg.P(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(boolean param0, ja param1) {
        qm discarded$3 = null;
        kk discarded$4 = null;
        int fieldTemp$5 = 0;
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
        ja stackIn_14_0 = null;
        ja stackIn_15_0 = null;
        ja stackIn_17_0 = null;
        ja stackIn_19_0 = null;
        ja stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        oa stackIn_33_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_13_0 = null;
        ja stackOut_14_0 = null;
        ja stackOut_15_0 = null;
        ja stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ja stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        oa stackOut_30_0 = null;
        oa stackOut_32_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_84_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
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
                    if ((var6_int ^ -1) <= -11) {
                      break L3;
                    } else {
                      discarded$3 = dd.a(0, var5_ref_in, this.field_nb, param1.field_q, var4);
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
                      stackOut_13_0 = (ja) (param1);
                      stackIn_19_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (-3 == (this.field_J ^ -1)) {
                        break L5;
                      } else {
                        stackOut_14_0 = (ja) ((Object) stackIn_14_0);
                        stackIn_19_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (-7 == (this.field_J ^ -1)) {
                          break L5;
                        } else {
                          stackOut_15_0 = (ja) ((Object) stackIn_15_0);
                          stackIn_17_0 = stackOut_15_0;
                          stackOut_17_0 = (ja) ((Object) stackIn_17_0);
                          stackOut_17_1 = 1;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          break L4;
                        }
                      }
                    }
                    stackOut_19_0 = (ja) ((Object) stackIn_19_0);
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L4;
                  }
                  L6: {
                    stackIn_20_0.field_V = stackIn_20_1 != 0;
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
                        if ((this.field_ab - 30 ^ -1) < (param1.field_cb ^ -1)) {
                          L8: {
                            L9: {
                              if (-3 == (param1.field_J ^ -1)) {
                                break L9;
                              } else {
                                if (0 < param1.field_Fb[2]) {
                                  break L9;
                                } else {
                                  stackOut_30_0 = sj.field_K;
                                  stackIn_33_0 = stackOut_30_0;
                                  break L8;
                                }
                              }
                            }
                            stackOut_32_0 = vn.field_h;
                            stackIn_33_0 = stackOut_32_0;
                            break L8;
                          }
                          var16 = stackIn_33_0;
                          discarded$4 = bd.a((byte) 113, param1, var16, var16.field_q);
                          param1.field_cb = this.field_ab;
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
                          this.field_rb[7] = -1;
                          this.field_rb[6] = -1;
                          if ((this.field_H & 134217728) == 0) {
                            this.field_N = this.field_N - (this.field_p * this.field_l << 246249819);
                            this.field_H = this.field_H ^ 134217728;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if ((this.field_H & 16384) != 16384) {
                          break L6;
                        } else {
                          this.field_N = this.field_N + (this.field_p * this.field_l << 1120018030);
                          this.field_H = this.field_H ^ 16384;
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
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L11;
              } else {
                stackOut_46_0 = 1;
                stackIn_49_0 = stackOut_46_0;
                break L11;
              }
            }
            var5 = stackIn_49_0;
            var6 = (wm) ((Object) this.field_cb.b((byte) 98));
            L12: while (true) {
              if (null == var6) {
                var6 = (wm) ((Object) this.field_d.b((byte) 117));
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
                      if (this.a(param1.field_q, var7.field_f, param0, var7.field_h)) {
                        break L14;
                      } else {
                        var11++;
                        break L14;
                      }
                    }
                    L15: {
                      if (!this.a(param1.field_q, var8.field_f, param0, var8.field_h)) {
                        var11++;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (!this.a(param1.field_q, var9.field_f, true, var9.field_h)) {
                        var11++;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (this.a(param1.field_q, var10.field_f, param0, var10.field_h)) {
                        break L17;
                      } else {
                        var11++;
                        break L17;
                      }
                    }
                    L18: {
                      L19: {
                        if (!this.a(param1.field_q, (int)param1.field_u, true, (int)param1.field_y)) {
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
                      fieldTemp$5 = param1.field_db + 1;
                      param1.field_db = param1.field_db + 1;
                      if (fieldTemp$5 > 20) {
                        param1.field_u = (float)param1.field_Zb.field_f;
                        param1.field_y = (float)param1.field_Zb.field_h;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    stackOut_84_0 = var5;
                    stackIn_85_0 = stackOut_84_0;
                    break L0;
                  } else {
                    var5 = var5 != 0 | this.a((byte) -109, var6, param1) ? 1 : 0;
                    var6 = (wm) ((Object) this.field_d.c((byte) 86));
                    continue L13;
                  }
                }
              } else {
                var5 = var5 != 0 | this.a((byte) -96, var6, param1) ? 1 : 0;
                var6 = (wm) ((Object) this.field_cb.c((byte) -25));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var3);
            stackOut_86_1 = new StringBuilder().append("sg.JA(").append(param0).append(',');
            stackIn_89_0 = stackOut_86_0;
            stackIn_89_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param1 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L20;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_90_0 = stackOut_87_0;
              stackIn_90_1 = stackOut_87_1;
              stackIn_90_2 = stackOut_87_2;
              break L20;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ')');
        }
        return stackIn_85_0 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        float dupTemp$1 = 0.0f;
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            var4_float = this.field_C[0].field_vb;
            var5 = ce.a(param1, this.field_sb) / (float)(param2 + 1);
            var6 = (int)var4_float;
            var7 = this.field_sb[var6].f(50);
            var8 = var7 * ((float)(1 - -var6) - var4_float);
            var9 = var5;
            var10 = 0;
            L1: while (true) {
              if ((var10 ^ -1) <= (param2 ^ -1)) {
                break L0;
              } else {
                L2: while (true) {
                  if (var9 <= var8) {
                    L3: {
                      var8 = var8 - var9;
                      var9 = var5;
                      var11 = this.field_sb[var6].a(false, -(var8 / var7) + 1.0f);
                      if (param0 == -1) {
                        stackOut_17_0 = kj.b(2, 4);
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        if (3 != param0) {
                          stackOut_16_0 = 1 + param0;
                          stackIn_18_0 = stackOut_16_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_18_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                    }
                    var12 = stackIn_18_0;
                    this.field_cb.a((byte) -91, new wm(var11, 1 + var12, -1));
                    var10++;
                    continue L1;
                  } else {
                    var6++;
                    stackOut_4_0 = var6;
                    stackOut_4_1 = this.field_sb.length;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    L4: {
                      if (stackIn_6_0 == stackIn_6_1) {
                        var6 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var9 = var9 - var8;
                    dupTemp$1 = this.field_sb[var6].f(50);
                    var7 = dupTemp$1;
                    var8 = dupTemp$1;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var16 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (this.field_lb == null) {
                this.field_lb = new bm(640, 480, 256);
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (4 <= var4_int) {
                L3: {
                  if ((this.field_r ^ -1) != -4) {
                    tn.a(this.field_sb, 10000536, new rk(this.field_lb, (byte) 2));
                    mn.a(this.field_sb, new rk(this.field_lb, (byte) 3), (byte) -20);
                    break L3;
                  } else {
                    tn.a(this.field_sb, 10000536, new rk(this.field_lb, (byte) 3));
                    break L3;
                  }
                }
                L4: {
                  ok.a(32381);
                  if (this.field_qb == null) {
                    this.field_qb = new hj(640, 480);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_qb.f();
                dj.a(this.field_J, param0, false);
                var4_ref = new ei();
                if (param1 == 28978) {
                  L5: {
                    var5 = new ei();
                    var6 = new ei();
                    var7 = new ei();
                    var8 = new ei();
                    lf.a(var6, var8, var5, var4_ref, this.field_sb, var7, -110);
                    var5 = mk.a(var5, (byte) -127);
                    var7 = mk.a(var7, (byte) -127);
                    var6 = mk.a(var6, (byte) -127);
                    var8 = mk.a(var8, (byte) -127);
                    this.field_jb = ao.a(var6, (byte) 21, param2, var5);
                    this.field_nb = ao.a(var8, (byte) 21, param2, var7);
                    l.a(29824, param0);
                    if (3 == this.field_r) {
                      var9 = ce.a(-1, this.field_sb);
                      var10 = 1 + (int)(var9 / 72.0f);
                      this.field_A = var9 / (float)var10;
                      var11 = 0.0f;
                      var12 = 0;
                      this.field_u = new int[var10];
                      this.field_w = new int[var10];
                      this.field_x = new int[var10];
                      this.field_eb = new int[var10];
                      var13 = this.field_sb[0].f(50);
                      var14 = 0;
                      L6: while (true) {
                        if (var14 >= var10) {
                          break L5;
                        } else {
                          L7: while (true) {
                            if (var13 >= var11) {
                              this.field_w[var14] = var12;
                              var15 = this.field_sb[var12].a(false, var11 / var13);
                              this.field_x[var14] = var15.field_h;
                              this.field_u[var14] = var15.field_f;
                              tc.f(var15.field_h - 1, -1 + var15.field_f, 3, 3, 8421504);
                              var11 = var11 + this.field_A;
                              var14++;
                              continue L6;
                            } else {
                              var11 = var11 - var13;
                              var12++;
                              var13 = this.field_sb[var12].f(param1 + -28928);
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5_int = 0;
                L8: while (true) {
                  if ((var5_int ^ -1) <= -5) {
                    var4_int++;
                    continue L2;
                  } else {
                    var6_int = 0;
                    L9: while (true) {
                      if ((var6_int ^ -1) <= -5) {
                        var5_int++;
                        continue L8;
                      } else {
                        L10: {
                          var7_int = 16 * var6_int + 4 * var5_int - -var4_int;
                          this.field_lb.field_n[var7_int] = 0;
                          if ((var4_int ^ -1) == -4) {
                            this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 255);
                            break L10;
                          } else {
                            if (var4_int != 2) {
                              break L10;
                            } else {
                              this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 128);
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if ((var5_int ^ -1) != -4) {
                            if (-3 != (var5_int ^ -1)) {
                              break L11;
                            } else {
                              this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 32768);
                              break L11;
                            }
                          } else {
                            this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 65280);
                            break L11;
                          }
                        }
                        L12: {
                          if (3 == var6_int) {
                            this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 16711680);
                            break L12;
                          } else {
                            if (2 == var6_int) {
                              this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 8388608);
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
            stackOut_65_0 = (RuntimeException) (var4);
            stackOut_65_1 = new StringBuilder().append("sg.QA(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L13;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L13;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(vf param0, int param1, ja param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                  if ((var6 * var6 ^ -1) < (var5 * var5 + var4_int * var4_int ^ -1)) {
                    if (ca.a(mo.field_q, param2.field_i, param2.field_A, 8, param2.field_w, param2.field_k, 83)) {
                      L2: {
                        param2.field_Sb = param2.field_Sb + 1;
                        param0.a(param2, (int)(param2.field_t * 8192.0f), (byte) 62, (int)(param2.field_x * 8192.0f));
                        if (param1 < -73) {
                          break L2;
                        } else {
                          this.field_jb = (ei) null;
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("sg.N(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    sg(vk param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.a(param3, param5, param1, (byte) 113, param4, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sg.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_Y = null;
        field_K = "Rocket boost";
        field_Z = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_v = new ah();
    }
}
