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
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          RuntimeException var4_ref = null;
          try {
            try {
              this.a(param2, param1, param0 ^ 39);
              if (param0 != 7) {
                this.a((String) null, -0.27448931336402893f, 32, (ul) null, (String) null);
              }
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException((String) null);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref;
            stackIn_9_1 = new StringBuilder().append("sg.R(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(byte param0) {
        int dupTemp$1 = 0;
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
          this.field_I.field_z[0] = 1;
          var7 = 307200;
          if (param0 > -7) {
            this.field_o = -116;
          }
          while (var7 > 0) {
            while (true) {
              if (var8 != 0) {
                return;
              }
              var7--;
              dupTemp$1 = this.field_I.field_z[var7];
              var3 = dupTemp$1;
              if (dupTemp$1 == 0) {
                tc.field_b[var7] = 0;
                continue;
              }
              break;
            }
            var2_int = tc.field_b[var7];
            var6 = (var2_int & 255) * (255 & var3);
            var4 = (255 & var3 >> 16) * (16711680 & var2_int);
            var5 = ((var3 & 65280) >> 8) * (var2_int & 65280);
            tc.field_b[var7] = kc.a(kc.a(pk.a(var4, -16777216), pk.a(16711680, var5)), pk.a(65280, var6)) >>> 8;
          }
          return;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param1 >= -109) {
            this.field_l = 103;
          }
          var3_int = 0;
          while (mm.field_a.length > var3_int) {
            if (param0.equals(mm.field_a[var3_int].field_l)) {
              stackIn_10_0 = var3_int;
              return stackIn_10_0;
            }
            var3_int++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sg.I(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(String param0, byte param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (null == this.field_ib ||
            this.field_j >= this.field_ib.length) {
            var3_int = this.field_j + 1;
            var4 = new String[var3_int];
            var5 = 0;
            while (var5 < this.field_j) {
              var4[var5] = this.field_ib[var5];
              var5++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_ib = var4;
            }
          }
          if (param1 != 53) {
            this.field_q = (ah[]) null;
          }
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_ib[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(vk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, 28978, false);
          var3_int = -22 / ((-32 - param1) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("sg.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, wm param4, int param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11_int = 0;
        int[] var11 = null;
        float var12 = 0.0f;
        int[] var13_ref_int__ = null;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15_int = 0;
        float var15 = 0.0f;
        int var16_int = 0;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var7_intLifetime5;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        float var12Lifetime1;
        float var14Lifetime1;
        var18 = HoldTheLine.field_D;
        try {
          if (0 != (196608 & param4.field_J)) {
            return;
          }
          var7_int = param4.field_A.field_h - param0;
          if (param3 != -35) {
            return;
          }
          var8 = param4.field_A.field_f - param1;
          var9 = (float)Math.sqrt((double)(var7_int * var7_int + var8 * var8));
          var10 = var9 / (float)param2;
          if (2.0f <= var10) {
            return;
          }
          var10 = 2.0f - var10;
          if (var10 > 1.0f) {
            var10 = 1.0f;
          }
          if (!param4.field_E.field_d) {
            var11_int = param4.field_E.field_a / 2;
            if (var11_int < 4) {
              var11_int = 4;
            }
            var12 = (float)(6.283185307179586 / (double)var11_int);
            var13_ref_int__ = new int[var11_int * 4];
            var14 = 0.0f;
            var15_int = 0;
            while (true) {
              if (var11_int > var15_int) {
                var16_int = (int)((double)param4.field_A.field_h + (double)param4.field_E.field_a * Math.cos((double)var14));
                var7_intLifetime1 = var16_int - param0;
                var17_int = (int)((double)param4.field_A.field_f - (double)param4.field_E.field_a * Math.sin((double)var14));
                var13_ref_int__[var15_int * 4] = var16_int;
                var8Lifetime1 = var17_int - param1;
                var13_ref_int__[var15_int * 4 + 1] = var17_int;
                var13_ref_int__[2 + var15_int * 4] = var7_intLifetime1 / 4 + var16_int;
                var13_ref_int__[3 + 4 * var15_int] = var8Lifetime1 / 4 + var17_int;
                var14 = var14 + var12;
                var15_int++;
                if (var18 == 0) {
                  continue;
                }
              } else {
                var13_ref_int__ = qk.a(var13_ref_int__, (byte) -121);
              }
              break;
            }
            if (param5 > 256) {
              param5 = 256;
            }
            if (0 > param5) {
              param5 = 0;
            }
            lj.a(0, (int)(var10 * (float)param5), 0, var13_ref_int__, (byte) -56, 0);
            if (var18 == 0) {
              return;
            }
          }
          var11 = new int[16];
          var12Lifetime1 = param4.field_w.field_j;
          var13 = param4.field_w.field_g;
          var14Lifetime1 = -var13;
          var15 = var12Lifetime1;
          var16 = (float)param4.field_E.field_m;
          var17 = (float)param4.field_E.field_h;
          nc.field_g = (int)((float)param4.field_A.field_h + var16 * var12Lifetime1 + var14Lifetime1 * var17);
          rf.field_X = (int)(var16 * var13 + (float)param4.field_A.field_f + var15 * var17);
          var8Lifetime2 = -param1 + rf.field_X;
          var7_intLifetime2 = nc.field_g - param0;
          var11[0] = nc.field_g;
          var11[1] = rf.field_X;
          rf.field_X = rf.field_X + var8Lifetime2 / 4;
          nc.field_g = nc.field_g + var7_intLifetime2 / 4;
          var11[3] = rf.field_X;
          var11[2] = nc.field_g;
          rf.field_X = (int)(-(var13 * var16) + (float)param4.field_A.field_f + var15 * var17);
          nc.field_g = (int)(var17 * var14Lifetime1 + (-(var16 * var12Lifetime1) + (float)param4.field_A.field_h));
          var11[5] = rf.field_X;
          var7_intLifetime3 = nc.field_g - param0;
          var11[4] = nc.field_g;
          var8Lifetime3 = rf.field_X - param1;
          rf.field_X = rf.field_X + var8Lifetime3 / 4;
          nc.field_g = nc.field_g + var7_intLifetime3 / 4;
          var11[6] = nc.field_g;
          var11[7] = rf.field_X;
          rf.field_X = (int)(-(var15 * var17) + ((float)param4.field_A.field_f - var13 * var16));
          nc.field_g = (int)((float)param4.field_A.field_h - var16 * var12Lifetime1 - var14Lifetime1 * var17);
          var7_intLifetime4 = nc.field_g - param0;
          var11[8] = nc.field_g;
          var11[9] = rf.field_X;
          var8Lifetime4 = -param1 + rf.field_X;
          rf.field_X = rf.field_X + var8Lifetime4 / 4;
          nc.field_g = nc.field_g + var7_intLifetime4 / 4;
          var11[11] = rf.field_X;
          var11[10] = nc.field_g;
          rf.field_X = (int)(-(var15 * var17) + (var13 * var16 + (float)param4.field_A.field_f));
          nc.field_g = (int)(-(var14Lifetime1 * var17) + (var16 * var12Lifetime1 + (float)param4.field_A.field_h));
          var11[12] = nc.field_g;
          var11[13] = rf.field_X;
          var7_intLifetime5 = -param0 + nc.field_g;
          var8Lifetime5 = rf.field_X - param1;
          rf.field_X = rf.field_X + var8Lifetime5 / 4;
          nc.field_g = nc.field_g + var7_intLifetime5 / 4;
          var11[14] = nc.field_g;
          var11[15] = rf.field_X;
          var11 = qk.a(var11, (byte) -113);
          if (param5 > 256) {
            param5 = 256;
          }
          if (0 > param5) {
            param5 = 0;
          }
          dl.a(var11, (byte) -67, (int)(var10 * (float)param5), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_41_0 = runtimeException;
          stackIn_41_1 = new StringBuilder().append("sg.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, wm param3, int param4, float param5) {
        ja stackIn_7_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_6_0;
        ja var7 = null;
        RuntimeException var7_ref = null;
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
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var7 = this.field_C[3 & param3.field_J];
          if (param0 != -30808) {
            this.a((vk) null, 51, false);
          }
          var8 = 0;
          var9_int = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var9_int < this.field_z) {
              var10_ref_ja = this.field_C[var9_int];
              stackOut_6_0 = var10_ref_ja;
              stackIn_33_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var22 == 0) {
                if (stackIn_7_0 != null &&
                  1 >= -var10_ref_ja.field_q + param3.field_q &&
                  -var10_ref_ja.field_q + param3.field_q >= -1) {
                  var11 = var10_ref_ja.field_A.field_h - param3.field_A.field_h;
                  var12 = -param3.field_A.field_f + var10_ref_ja.field_A.field_f;
                  var13 = param4 + param3.field_B + var10_ref_ja.field_B;
                  var14 = var11 * var11 + var12 * var12;
                  if (var14 < var13 * var13) {
                    if (var10_ref_ja.field_rc == 0) {
                      var8++;
                    }
                    var15 = (float)Math.sqrt((double)var14);
                    if (var15 < (float)(var10_ref_ja.field_B + param3.field_B)) {
                      var15 = (float)(param3.field_B + var10_ref_ja.field_B);
                    }
                    var16 = 1.0f - ((float)(-param3.field_B) + (var15 - (float)var10_ref_ja.field_B)) / (float)(2 * param4);
                    var17 = param5 * var16;
                    if (var10_ref_ja.field_J != 2) {
                      var18 = var10_ref_ja.field_C.field_l * var10_ref_ja.a((byte) 118, ek.field_c);
                      var19 = var17 / var18;
                      var20 = (float)(-param3.field_A.field_h + var10_ref_ja.field_A.field_h) / var15 * var19;
                      var21 = (float)(var10_ref_ja.field_A.field_f - param3.field_A.field_f) / var15 * var19;
                      var10_ref_ja.field_t = var10_ref_ja.field_t + var20;
                      var10_ref_ja.field_x = var10_ref_ja.field_x + var21;
                      var10_ref_ja.field_j = ln.a(-29407, var17) * 5.0f;
                      var10_ref_ja.a(2, param2);
                    }
                    var10_ref_ja.a(var16, param0 ^ -30808, var7, param1);
                  }
                }
                var9_int++;
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (null != ih.field_n);
              if (decompiledFrameRemainder0) {
                stackIn_33_0 = ih.field_n.b((byte) 125);
              }
            }
            if (decompiledFrameRemainder0) {
              var9 = (vf) (stackIn_33_0);
              while (var9 != null) {
                mo.field_q.field_f = 12 + var9.field_i;
                mo.field_q.field_h = 12 + var9.field_B;
                var10 = mo.field_q.field_h - param3.field_A.field_h;
                var11Lifetime1 = -param3.field_A.field_f + mo.field_q.field_f;
                var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10 * var10;
                var13Lifetime1 = 6 * (param4 * param4);
                stackIn_44_0 = ~var13Lifetime1;
                if (var22 != 0) {
                  break L2;
                }
                if (stackIn_44_0 < ~var12Lifetime1) {
                  var14Lifetime1 = (var13Lifetime1 * 2 - var12Lifetime1) * 4096;
                  var10 = var14Lifetime1 * var10 / (var13Lifetime1 * 2);
                  var11Lifetime1 = var11Lifetime1 * var14Lifetime1 / (var13Lifetime1 * 2);
                  var9.a(var7, var10, (byte) 24, var11Lifetime1);
                }
                var9 = (vf) (ih.field_n.c((byte) -94));
              }
            }
            stackIn_44_0 = var8;
            break;
          }
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_48_0 = var7_ref;
          stackIn_48_1 = new StringBuilder().append("sg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(byte param0, wm param1, ja param2) {
        ja stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        oa stackIn_49_0 = null;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        String stackIn_230_2 = null;
        StringBuilder stackIn_233_1 = null;
        String stackIn_234_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        float var5_float = 0.0f;
        float var6 = 0.0f;
        oa var7 = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (!im.a(param2, param1, 32758)) {
            return false;
          }
          if (param0 >= -86) {
            this.field_a = -68;
          }
          if ((param1.field_J & 512) == 0) {
            if (0 != (1024 & param1.field_J)) {
              if ((2048 & param1.field_J) != 0 &&
                ~param2.field_mc != ~(param1.field_J & 3)) {
                this.a(param1, false);
                return true;
              }
              return false;
            }
            if ((param1.field_J & 8192) != 0) {
              if ((param1.field_J & 2048) != 0 &&
                (param1.field_J & 3) != param2.field_mc) {
                this.d(param1, 28977);
                if ((3 & param1.field_J) == 0) {
                  this.field_o = this.field_o | 8;
                }
                return true;
              }
              return false;
            }
            if ((262144 & param1.field_J) != 0) {
              return false;
            }
            param2.field_T = 20;
            stackIn_33_0 = (ja) (param2);
            stackIn_34_1 = (this.field_J != 2) && (this.field_J != 6);
            stackIn_33_0.field_V = stackIn_34_1;
            param2.field_H = param2.e((byte) 45);
            vl.field_c.field_g = (float)(-(-param2.field_A.field_f + param1.field_A.field_f));
            vl.field_c.field_j = (float)(-(param1.field_A.field_h - param2.field_A.field_h));
            if (0.0f != vl.field_c.field_j ||
              vl.field_c.field_g != 0.0f) {
              vl.field_c.a(-1);
              var4_float = vl.field_c.field_g * param2.field_x + vl.field_c.field_j * param2.field_t;
              if (0.0f >= var4_float) {
                var5_float = 0.800000011920929f * param2.a((byte) 112, sl.field_c);
                var6 = var4_float * -(1.0f + var5_float);
                param2.field_x = param2.field_x + var6 * vl.field_c.field_g;
                param2.field_t = param2.field_t + var6 * vl.field_c.field_j;
                param2.a(-var4_float, 0, (ja) null, 0);
                if (-30 + this.field_ab > param2.field_cb) {
                  if (2 != param2.field_J &&
                    param2.field_Fb[2] <= 0) {
                    stackIn_49_0 = sj.field_K;
                  } else {
                    stackIn_49_0 = vn.field_h;
                  }
                  var7 = stackIn_49_0;
                  bd.a((byte) 54, param2, var7, var7.field_q);
                  param2.field_cb = this.field_ab;
                }
                param2.a((byte) 109, param1);
              }
            }
            return true;
          }
          var4_int = 3 & param1.field_J;
          if ((-1 == this.field_mb ||
            (this.field_o & 4) == 0 &&
            param2.field_W != null) && param2.c(3, var4_int)) {
            param1.d(0);
            if (param2.field_mc == 0) {
              this.field_rb[11] = -1;
              var5 = 0;
              while (true) {
                if (var5 < 3) {
                  stackIn_92_0 = var5;
                  stackIn_92_1 = var4_int;
                  if (var8 == 0) {
                    if (stackIn_92_0 != stackIn_92_1) {
                      this.field_rb[8 + var5] = -1;
                    }
                    var5++;
                    continue;
                  }
                } else {
                  stackIn_92_0 = ~this.field_rb[var4_int + 8];
                  stackIn_92_1 = -1;
                }
                if (stackIn_92_0 == stackIn_92_1) {
                  this.field_rb[var4_int + 8] = 1;
                }
                if (0 == var4_int) {
                  if ((256 & this.field_H) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 8);
                    this.field_H = this.field_H ^ 256;
                  }
                  if ((64 & this.field_H) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 6);
                    if (var8 != 0) {
                      this.field_N = this.field_N + (this.field_p * this.field_l << 6);
                    }
                  } else {
                    this.field_N = this.field_N + (this.field_p * this.field_l << 6);
                  }
                  this.field_H = this.field_H ^ 64;
                  if ((64 & this.field_H) == 64) {
                    if ((this.field_H & 67108864) == 0) {
                      this.field_N = this.field_N - (this.field_l * this.field_p << 26);
                      if (var8 != 0) {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 26);
                      }
                    } else {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 26);
                    }
                    this.field_H = this.field_H ^ 67108864;
                    if (0 == (67108864 & this.field_H)) {
                      if ((this.field_H & 512) != 0) {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 9);
                        if (var8 != 0) {
                          this.field_N = this.field_N - (this.field_l * this.field_p << 9);
                        }
                      } else {
                        this.field_N = this.field_N - (this.field_l * this.field_p << 9);
                      }
                      this.field_H = this.field_H ^ 512;
                    }
                  }
                }
                if (var4_int == 1) {
                  if ((this.field_H & 524288) == 524288) {
                    this.field_H = this.field_H ^ 524288;
                    this.field_N = this.field_N + (this.field_l * this.field_p << 19);
                  }
                  if ((this.field_H & 16777216) != 0) {
                    this.field_N = this.field_N + (this.field_l * this.field_p << 24);
                    if (var8 != 0) {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 24);
                    }
                  } else {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 24);
                  }
                  this.field_H = this.field_H ^ 16777216;
                  if ((16777216 & this.field_H) == 16777216) {
                    if ((this.field_H & 2097152) == 0) {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 21);
                      if (var8 != 0) {
                        this.field_N = this.field_N + (this.field_p * this.field_l << 21);
                      }
                    } else {
                      this.field_N = this.field_N + (this.field_p * this.field_l << 21);
                    }
                    this.field_H = this.field_H ^ 2097152;
                    if (2097152 == (2097152 & this.field_H)) {
                      if ((this.field_H & 2) == 0) {
                        this.field_N = this.field_N - (this.field_p * this.field_l << 1);
                        if (var8 != 0) {
                          this.field_N = this.field_N + (this.field_l * this.field_p << 1);
                        }
                      } else {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 1);
                      }
                      this.field_H = this.field_H ^ 2;
                    }
                  }
                }
                if (var4_int == 2) {
                  if (0 == (16 & this.field_H)) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 4);
                    this.field_H = this.field_H ^ 16;
                  }
                  if ((this.field_H & 1) == 0) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 0);
                    if (var8 != 0) {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 0);
                    }
                  } else {
                    this.field_N = this.field_N + (this.field_l * this.field_p << 0);
                  }
                  this.field_H = this.field_H ^ 1;
                  if ((this.field_H & 1) == 0) {
                    if ((536870912 & this.field_H) != 0) {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 29);
                      if (var8 != 0) {
                        this.field_N = this.field_N - (this.field_p * this.field_l << 29);
                      }
                    } else {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 29);
                    }
                    this.field_H = this.field_H ^ 536870912;
                    if (0 == (536870912 & this.field_H)) {
                      if ((131072 & this.field_H) == 0) {
                        this.field_N = this.field_N - (this.field_l * this.field_p << 17);
                        if (var8 != 0) {
                          this.field_N = this.field_N + (this.field_l * this.field_p << 17);
                        }
                      } else {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 17);
                      }
                      this.field_H = this.field_H ^ 131072;
                    }
                  }
                }
                if (var4_int != 3) {
                  break;
                }
                if (8 == (8 & this.field_H)) {
                  this.field_H = this.field_H ^ 8;
                  this.field_N = this.field_N + (this.field_l * this.field_p << 3);
                }
                if ((32 & this.field_H) != 0) {
                  this.field_N = this.field_N + (this.field_l * this.field_p << 5);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 5);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_p * this.field_l << 5);
                }
                this.field_H = this.field_H ^ 32;
                if (0 != (32 & this.field_H)) {
                  break;
                }
                if ((this.field_H & 2048) != 0) {
                  this.field_N = this.field_N + (this.field_p * this.field_l << 11);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 11);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_p * this.field_l << 11);
                }
                this.field_H = this.field_H ^ 2048;
                if ((this.field_H & 2048) != 2048) {
                  break;
                }
                if (0 != (33554432 & this.field_H)) {
                  this.field_N = this.field_N + (this.field_p * this.field_l << 25);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 25);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_l * this.field_p << 25);
                }
                this.field_H = this.field_H ^ 33554432;
                break;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_229_0 = var4;
          stackIn_229_1 = new StringBuilder().append("sg.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_230_2 = "null";
          } else {
            stackIn_230_2 = "{...}";
          }
          stackIn_233_1 = ((StringBuilder) (Object) stackIn_229_1).append(stackIn_230_2).append(',');
          if (param2 == null) {
            stackIn_234_2 = "null";
          } else {
            stackIn_234_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_229_0), ((StringBuilder) (Object) stackIn_233_1).append(stackIn_234_2).append(')').toString());
        }
    }

    private final void c(wm param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param1 >= -32) {
            this.field_lb = (bm) null;
          }
          if (0 == (param0.field_J & 65536) &&
            this.field_pb) {
            if ((param0.field_J & 16384) == 0 &&
              param0.field_E.field_d) {
              var3 = new int[8];
              var4 = param0.field_w.field_j;
              var5 = param0.field_w.field_g;
              var6 = -var5;
              var7 = var4;
              var8 = param0.field_E.field_h;
              if (0.0f < var4 + var5) {
                var8 = -var8;
              }
              var3[4] = (int)((float)param0.field_A.field_h - (float)(param0.field_E.field_m >> 1) * var4 + (float)var8 * var6);
              var3[0] = (int)((float)param0.field_A.field_h + (float)param0.field_E.field_m * var4 + (float)var8 * var6);
              var3[2] = (int)((float)param0.field_A.field_h - (float)param0.field_E.field_m * var4 + (float)var8 * var6);
              var3[3] = (int)(-(var5 * (float)param0.field_E.field_m) + (float)param0.field_A.field_f + (float)var8 * var7);
              var3[5] = (int)((float)param0.field_A.field_f - (float)(param0.field_E.field_m >> 1) * var5 + (float)var8 * var7);
              var3[1] = (int)((float)var8 * var7 + ((float)param0.field_A.field_f + var5 * (float)param0.field_E.field_m));
              var3[6] = (int)((float)(param0.field_E.field_m >> 1) * var4 + (float)param0.field_A.field_h + var6 * (float)var8);
              var3[7] = (int)((float)param0.field_A.field_f + (float)(param0.field_E.field_m >> 1) * var5 + (float)var8 * var7);
              var9 = 4;
              while (var9 < 8) {
                var3[var9] = var3[var9] + this.field_db.field_k * 2;
                var3[1 + var9] = var3[1 + var9] + this.field_db.field_a * 2;
                var9 += 2;
                if (var10 != 0) {
                  return;
                }
              }
              dl.a(var3, (byte) -116, 128, 0);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("sg.DB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, long param1) {
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        oa stackIn_29_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ui var7 = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 != -3) {
            this.a(-112);
          }
          if (this.field_F <= 0) {
            boolean decompiledFrameRemainder0 = true;
            var4_int = (int)(param1 % 157L);
            if ((var4_int < 2 ||
              var4_int >= 139 &&
              var4_int <= 141) && hc.a(0, (int)(param1 << 6)) < 0) {
              stackIn_18_0 = 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_18_0 = 0;
            }
            var5 = stackIn_18_0;
            if (var5 == 0) {
              if ((var4_int == 5) &&
                (!(hc.a(0, (int)(param1 << 6)) >= 3))) {
                var6 = 84 + (tn.a((int)(param1 << 6), 5255) * 40 >> 16);
                stackIn_28_0 = param0 + 296;
                if (0L == (1L & param1)) {
                  stackIn_29_1 = se.field_m;
                } else {
                  stackIn_29_1 = uj.field_a;
                }
                var7 = qf.a(stackIn_28_0, stackIn_29_1);
                if (null != var7) {
                  var7.a((byte) -126, var6);
                }
                if (var8 != 0) {
                  this.field_F = 84 + (tn.a((int)(param1 << 6), 5255) * 40 >> 16);
                  var6 = this.field_F;
                  var7 = qf.a(293, qd.field_j);
                  if (null != var7) {
                    var7.a((byte) -125, var6);
                    var7.field_j.i(var6 * 150 + 300);
                  }
                }
              }
            } else {
              this.field_F = 84 + (tn.a((int)(param1 << 6), 5255) * 40 >> 16);
              var6 = this.field_F;
              var7 = qf.a(293, qd.field_j);
              if (null != var7) {
                var7.a((byte) -125, var6);
                var7.field_j.i(var6 * 150 + 300);
              }
            }
            if (var8 == 0) {
              return;
            }
          }
          this.field_F = this.field_F - 14;
          if (0 > this.field_F) {
            this.field_F = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, ja param1, ja param2) {
        ja stackIn_31_0;
        float stackIn_31_1;
        int stackIn_31_2;
        ja stackIn_31_3;
        int stackIn_32_4 = 0;
        ja stackIn_41_0;
        float stackIn_41_1;
        int stackIn_41_2;
        ja stackIn_41_3;
        int stackIn_42_4 = 0;
        oa stackIn_55_0 = null;
        oa stackIn_66_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
        oa var20Lifetime1;
        float var20_floatLifetime1;
        float var21Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          if (!qf.a((byte) -73, param2, param1)) {
            return;
          }
          this.a(param2, 0.0f, param0 ^ param0, -0.5f * kk.field_k * vl.field_c.field_j, -0.5f * kk.field_k * vl.field_c.field_g);
          this.a(param1, 0.0f, 0, vl.field_c.field_j * (kk.field_k * 0.5f), kk.field_k * 0.5f * vl.field_c.field_g);
          param2.field_A.field_f = (int)param2.field_u;
          param2.field_A.field_h = (int)param2.field_y;
          param1.field_A.field_h = (int)param1.field_y;
          param1.field_A.field_f = (int)param1.field_u;
          var4_float = -param2.field_t + param1.field_t;
          var5 = -param2.field_x + param1.field_x;
          var6 = var5 * vl.field_c.field_g + vl.field_c.field_j * var4_float;
          if (var6 > 0.0f) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
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
          if (param2.field_J != 2 &&
            param1.field_J != 2 ||
            param2.field_J == 2 &&
            param1.field_J == 2) {
            var20_float = var12 * var12 / var18 + (1.0f / var17 + 1.0f / var15 + var9 * var9 / var16);
            var21 = 1.7999999523162842f * var6 / var20_float;
            param2.field_x = param2.field_x + var21 / var15 * vl.field_c.field_g;
            param2.field_t = param2.field_t + var21 / var15 * vl.field_c.field_j;
            param1.field_t = param1.field_t - vl.field_c.field_j * (var21 / var17);
            param1.field_x = param1.field_x - vl.field_c.field_g * (var21 / var17);
            if (param2.field_J == 2) {
              param2.field_j = ln.a(-29407, var9) * 5.0f;
              param2.a(param0 + 2, 100);
              param1.field_j = 5.0f * ln.a(-29407, var12);
              param1.a(2, 100);
            }
            decompiledFrameRemainder0 = (var22 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (param2.field_J != 2) {
              var20_floatLifetime1 = var16 + var9 * (var9 * var15);
              var21Lifetime1 = var16 * (var6 * -(1.0f + var19)) / var20_floatLifetime1;
              param2.field_t = param2.field_t - var21Lifetime1 * vl.field_c.field_j;
              param2.field_x = param2.field_x - var21Lifetime1 * vl.field_c.field_g;
              param2.field_j = ln.a(-29407, var9) * 5.0f;
              param2.a(param0 ^ 2, 100);
              if (var22 != 0) {
                var20_floatLifetime1 = var12 * (var12 * var17) + var18;
                var21Lifetime1 = var18 * (-(var19 + 1.0f) * var6) / var20_floatLifetime1;
                param1.field_x = param1.field_x + vl.field_c.field_g * var21Lifetime1;
                param1.field_t = param1.field_t + var21Lifetime1 * vl.field_c.field_j;
                param1.field_j = 5.0f * ln.a(-29407, var12);
                param1.a(param0 + 2, 100);
              }
            } else {
              var20_floatLifetime1 = var12 * (var12 * var17) + var18;
              var21Lifetime1 = var18 * (-(var19 + 1.0f) * var6) / var20_floatLifetime1;
              param1.field_x = param1.field_x + vl.field_c.field_g * var21Lifetime1;
              param1.field_t = param1.field_t + var21Lifetime1 * vl.field_c.field_j;
              param1.field_j = 5.0f * ln.a(-29407, var12);
              param1.a(param0 + 2, 100);
            }
          }
          if (param1.field_J != 2) {
            stackIn_31_0 = (ja) (param2);
            stackIn_31_1 = -var6;
            stackIn_31_2 = 0;
            stackIn_31_3 = (ja) (param1);
            if (!(var14 > var13)) {
              stackIn_32_4 = 2;
            } else {
              stackIn_32_4 = 1;
            }
            ((ja) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_32_4);
            if (var22 != 0) {
              param2.a(1.0f, param0 ^ 0, param1, 5);
            }
          } else {
            param2.a(1.0f, param0 ^ 0, param1, 5);
          }
          if (param2.field_J != 2) {
            stackIn_41_0 = (ja) (param1);
            stackIn_41_1 = -var6;
            stackIn_41_2 = 0;
            stackIn_41_3 = (ja) (param2);
            if (var13 > var14) {
              stackIn_42_4 = 1;
            } else {
              stackIn_42_4 = 2;
            }
            ((ja) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_42_4);
            if (var22 != 0) {
              param1.a(1.0f, 0, param2, 5);
            }
          } else {
            param1.a(1.0f, 0, param2, 5);
          }
          if (param2.field_cb < this.field_ab - 30) {
            if (param2.field_J != 2 &&
              0 >= param2.field_Fb[2]) {
              stackIn_55_0 = sj.field_K;
            } else {
              stackIn_55_0 = vn.field_h;
            }
            var20 = stackIn_55_0;
            bd.a((byte) 20, param2, var20, var20.field_q);
            param2.field_cb = this.field_ab;
          }
          if (this.field_ab - 30 > param1.field_cb) {
            if (param1.field_J != 2 &&
              param1.field_Fb[2] <= 0) {
              stackIn_66_0 = sj.field_K;
            } else {
              stackIn_66_0 = vn.field_h;
            }
            var20Lifetime1 = stackIn_66_0;
            bd.a((byte) 63, param1, var20Lifetime1, var20Lifetime1.field_q);
            param1.field_cb = this.field_ab;
          }
          param2.a((byte) 103, param1);
          param1.a((byte) 68, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_72_0 = var4;
          stackIn_72_1 = new StringBuilder().append("sg.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        ih var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_E) {
            throw new RuntimeException((String) null);
          }
          if ((ti.field_z & 1 << param0) != 0) {
            return;
          }
          fieldTemp$1 = this.field_fb;
          this.field_fb = this.field_fb + 1;
          this.field_V[fieldTemp$1] = param0;
          ii.field_c = ii.field_c | 1 << param0;
          var4_int = -19 / ((param2 - 36) / 62);
          ti.field_z = ti.field_z | 1 << param0;
          if (!l.field_b) {
            var5 = new ih(param0, param1, this.field_l, this.field_N, this.field_p, this.field_H);
            if (pj.b((byte) 92)) {
              fb.field_n.a((byte) -117, var5);
              if (HoldTheLine.field_D == 0) {
                return;
              }
            }
            na.a(4, var5, (byte) -79);
            go.field_k = va.a((byte) -101, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "sg.LB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = HoldTheLine.field_D;
        try {
          if (param8 > -117) {
            sg.b(true);
          }
          while (true) {
            param6--;
            if (0 <= param6) {
              var10 = param5;
              var11 = param1;
              var12 = param9;
              var13 = param3;
              var14 = param7;
              var15 = (16711422 & var10[var11]) >> 1;
              var10[var11] = (pk.a(var13, 33423793) >> 9) + (pk.a(var12 >> 1, 16711680) + ((pk.a(var14, 33439411) >> 17) + var15));
              param7 = param7 + param0;
              param1++;
              param3 = param3 + param4;
              param9 = param9 + param2;
              if (var16 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_13_0 = var10_ref;
          stackIn_13_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 47) {
            this.field_W = (ah) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.A(" + param0 + ')');
        }
    }

    final int d(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            param0 >= 0 &&
            param1 < 640 &&
            480 > param0) {
            stackIn_13_0 = this.field_lb.field_m[param1 + 640 * param0];
            return stackIn_13_0;
          }
          if (b.a(false, param1, param0, this.field_nb)) {
            stackIn_21_0 = (!b.a(false, param1, param0, this.field_jb)) ? 8 : 12;
            return stackIn_21_0;
          }
          var4_int = 94 / ((12 - param2) / 42);
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        wm var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          this.field_B = -1;
          this.field_k = 0;
          this.field_ab = 0;
          this.field_mb = 0;
          this.field_h = 0;
          this.field_z = 0;
          var2 = (wm) (this.field_cb.b((byte) 89));
          if (param0 != 4) {
            return;
          }
          while (null != var2) {
            if (var3 != 0) {
              return;
            }
            if ((var2.field_J & 512) != 0) {
              var2.d(param0 ^ 4);
            }
            var2 = (wm) (this.field_cb.c((byte) 114));
          }
          this.field_S = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "sg.LA(" + param0 + ')');
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.field_C.field_v.a(param0.field_r, 27788);
          var4 = -(var3.field_s >> 1) + param0.field_A.field_h;
          var5 = param0.field_A.field_f - (var3.field_y >> 1);
          var6 = this.a(var5, var4, var3, -95, param0.field_q);
          if (var6 != null) {
            stackIn_4_0 = var6;
            return stackIn_4_0;
          }
          var7 = new qm(0, param1);
          var7.field_h = (int)(-((float)param0.field_C.field_k * param0.field_w.field_g) + param0.field_y + (float)param0.field_C.field_K * param0.field_w.field_j);
          var7.field_f = (int)(param0.field_w.field_g * (float)param0.field_C.field_K + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
          if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
            stackIn_7_0 = var7;
            return stackIn_7_0;
          }
          var7.field_h = (int)(param0.field_w.field_g * (float)param0.field_C.field_k + param0.field_y + param0.field_w.field_j * (float)param0.field_C.field_K);
          var7.field_f = (int)((float)param0.field_C.field_K * param0.field_w.field_g + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
          if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
            stackIn_12_0 = var7;
            return stackIn_12_0;
          }
          var7.field_h = (int)(-((float)param0.field_C.field_K * param0.field_w.field_j) + (-(param0.field_w.field_g * (float)param0.field_C.field_k) + param0.field_y));
          var7.field_f = (int)(-((float)param0.field_C.field_K * param0.field_w.field_g) + ((float)param0.field_C.field_k * param0.field_w.field_j + param0.field_u));
          if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
            stackIn_17_0 = var7;
            return stackIn_17_0;
          }
          var7.field_h = (int)(param0.field_y + (float)param0.field_C.field_k * param0.field_w.field_g - param0.field_w.field_j * (float)param0.field_C.field_K);
          var7.field_f = (int)(-(param0.field_w.field_g * (float)param0.field_C.field_K) + (param0.field_u - param0.field_w.field_j * (float)param0.field_C.field_k));
          if (!this.a(param0.field_q, var7.field_f, true, var7.field_h)) {
            stackIn_22_0 = var7;
            return stackIn_22_0;
          }
          stackIn_24_0 = null;
          return (qm) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_28_0 = var3_ref;
          stackIn_28_1 = new StringBuilder().append("sg.JB(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(wm param0, int param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj var3 = null;
        RuntimeException var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 < 39) {
            this.a(-16, (na) null);
          }
          if ((8192 & param0.field_J) != 0 &&
            this.d((byte) 47)) {
            return;
          }
          if (0 == (1048576 & param0.field_J)) {
            var3 = param0.a((byte) -124);
            if (var8 != 0) {
              var3 = param0.field_H;
            }
          } else {
            var3 = param0.field_H;
          }
          if (0 == (131072 & param0.field_J)) {
            boolean decompiledSharedTail1 = ((param0.field_J & 128) != 0);
            if (!decompiledSharedTail1) {
              var3.a(-(var3.field_o >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var3.field_v >> 1));
              decompiledSharedTail1 = (var8 != 0);
            }
            if (decompiledSharedTail1) {
              var3.c(-(var3.field_o >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var3.field_v >> 1), this.field_C[param0.field_J & 3].field_Eb);
            }
            ok.a(32381);
            this.field_I.f();
            var3.e(-(var3.field_o >> 1) + param0.field_A.field_h, -(var3.field_v >> 1) + param0.field_A.field_f, 0);
            ug.b(-1);
            if (var8 == 0) {
              return;
            }
          }
          var4 = (float)param0.field_C / 150.0f;
          var5 = 4.0f * var4 * (-var4 + 1.0f) + 1.0f;
          var6 = (int)((float)param0.field_H.field_o * var5);
          var7 = (int)((float)param0.field_H.field_v * var5);
          param0.a((byte) -118);
          boolean decompiledSharedTail0 = ((param0.field_J & 128) == 0);
          if (!decompiledSharedTail0) {
            var3.b(-(var6 >> 1) + param0.field_A.field_h, -(var7 >> 1) + param0.field_A.field_f, var6, var7, this.field_C[param0.field_J & 3].field_Eb);
            decompiledSharedTail0 = (var8 != 0);
          }
          if (decompiledSharedTail0) {
            var3.a(-(var6 >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var7 >> 1), var6, var7);
          }
          ok.a(32381);
          this.field_I.f();
          var3.c(param0.field_A.field_h - (var6 >> 1), param0.field_A.field_f - (var7 >> 1), var6, var7, 0);
          ug.b(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("sg.VA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, in param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        try {
          var8 = (int)(param1.field_g * 15.0f + param1.field_j * -15.0f) + param3;
          var9 = (int)(param1.field_g * -15.0f - param1.field_j * 15.0f) + param4;
          tc.d(param3, param4, var8, var9, param2);
          var7 = var9;
          var6_int = var8;
          var9Lifetime1 = (int)(-(5.0f * param1.field_j) + -15.0f * param1.field_g) + param4;
          var8Lifetime1 = param3 + (int)(param1.field_j * -15.0f + 5.0f * param1.field_g);
          tc.d(var6_int, var7, var8Lifetime1, var9Lifetime1, param2);
          var6_intLifetime1 = var8Lifetime1;
          var7Lifetime1 = var9Lifetime1;
          var8Lifetime2 = param3 + (int)(-25.0f * param1.field_j + param1.field_g * 5.0f);
          var9Lifetime2 = (int)(param1.field_g * -25.0f - param1.field_j * 5.0f) + param4;
          tc.d(var6_intLifetime1, var7Lifetime1, var8Lifetime2, var9Lifetime2, param2);
          var7Lifetime2 = var9Lifetime2;
          var6_intLifetime2 = var8Lifetime2;
          var8Lifetime3 = (int)(-25.0f * param1.field_j - 5.0f * param1.field_g) + param3;
          var10 = 53 / ((param0 - 71) / 39);
          var9Lifetime3 = param4 + (int)(5.0f * param1.field_j + -25.0f * param1.field_g);
          tc.d(var6_intLifetime2, var7Lifetime2, var8Lifetime3, var9Lifetime3, param2);
          var7Lifetime3 = var9Lifetime3;
          var6_intLifetime3 = var8Lifetime3;
          var9Lifetime4 = (int)(5.0f * param1.field_j + param1.field_g * -15.0f) + param4;
          var8Lifetime4 = (int)(param1.field_j * -15.0f - 5.0f * param1.field_g) + param3;
          tc.d(var6_intLifetime3, var7Lifetime3, var8Lifetime4, var9Lifetime4, param2);
          var6_intLifetime4 = var8Lifetime4;
          var7Lifetime4 = var9Lifetime4;
          var8Lifetime5 = param3 + (int)(-(param1.field_g * 15.0f) + -15.0f * param1.field_j);
          var9Lifetime5 = param4 + (int)(15.0f * param1.field_j + param1.field_g * -15.0f);
          tc.d(var6_intLifetime4, var7Lifetime4, var8Lifetime5, var9Lifetime5, param2);
          tc.d(var8Lifetime5, var9Lifetime5, param3, param4, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("sg.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_115_1 = 0;
        in stackIn_115_2 = null;
        Object stackIn_116_0;
        int stackIn_116_3;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5_ref_ja = null;
        int var5 = 0;
        int var6 = 0;
        float var6_float = 0.0f;
        wm var7_ref_wm = null;
        int var7 = 0;
        hj var7_ref_hj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        wd var15_ref_wd = null;
        int var15 = 0;
        qm var16_ref_qm = null;
        int var16 = 0;
        in var17_ref_in = null;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        wm var7_ref_wmLifetime1;
        int stackIn_31_0Lifetime1;
        int stackIn_31_0Lifetime2;
        int stackIn_31_1Lifetime1;
        int stackIn_31_1Lifetime2;
        int stackIn_157_0Lifetime1;
        int stackIn_157_1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        float var14Lifetime1;
        int var5Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        var19 = HoldTheLine.field_D;
        try {
          if (param0 != -16) {
            this.a((wm) null, 58);
          }
          this.a((byte) -109);
          this.a(true);
          var4 = 0;
          L1: while (var4 < this.field_h) {
            var5_ref_ja = this.field_C[var4];
            var6 = 0;
            if (var19 == 0) {
              var7_ref_wm = (wm) (this.field_cb.b((byte) 102));
              while (var7_ref_wm != null) {
                stackIn_31_0 = ~var5_ref_ja.field_q;
                stackIn_31_1 = ~var7_ref_wm.field_q;
                if (stackIn_31_0 > stackIn_31_1 &&
                  var7_ref_wm.a(2048, var5_ref_ja.field_A)) {
                  var6 = 1;
                } else {
                  var7_ref_wm = (wm) (this.field_cb.c((byte) 90));
                  continue;
                }
                break;
              }
              if (var6 == 0) {
                var7_ref_wmLifetime1 = (wm) (this.field_d.b((byte) 107));
                while (var7_ref_wmLifetime1 != null) {
                  stackIn_31_0Lifetime1 = var7_ref_wmLifetime1.field_q;
                  stackIn_31_1Lifetime1 = var5_ref_ja.field_q;
                  if (stackIn_31_0Lifetime1 > stackIn_31_1Lifetime1 &&
                    var7_ref_wmLifetime1.a(2048, var5_ref_ja.field_A)) {
                    var6 = 1;
                    break;
                  }
                  var7_ref_wmLifetime1 = (wm) (this.field_d.c((byte) -63));
                }
              }
              stackIn_31_0Lifetime2 = -265;
              stackIn_31_1Lifetime2 = ~var5_ref_ja.field_A.field_h;
              if (stackIn_31_0Lifetime2 > stackIn_31_1Lifetime2 &&
                var5_ref_ja.field_A.field_h < 394 &&
                var5_ref_ja.field_A.field_f < 40) {
                var6 = 1;
              }
              if (2 == this.field_J) {
                stackIn_48_0 = (480 >= var5_ref_ja.field_A.field_h) ? 0 : 1;
                var9 = stackIn_48_0;
                stackIn_52_0 = (160 <= var5_ref_ja.field_A.field_h) ? 0 : 1;
                var8 = stackIn_52_0;
              } else {
                stackIn_59_0 = (var5_ref_ja.field_A.field_h >= 64) ? 0 : 1;
                var8 = stackIn_59_0;
                stackIn_63_0 = (var5_ref_ja.field_A.field_h <= 576) ? 0 : 1;
                var9 = stackIn_63_0;
              }
              stackIn_68_0 = (64 <= var5_ref_ja.field_A.field_f) ? 0 : 1;
              var10 = stackIn_68_0;
              stackIn_72_0 = (var5_ref_ja.field_A.field_f <= 416) ? 0 : 1;
              var11 = stackIn_72_0;
              if ((var8 != 0 ||
                var9 != 0) && (var10 != 0 ||
                var11 != 0)) {
                var12 = 0;
                if (var11 != 0) {
                  var12 += 2;
                }
                if (var9 != 0) {
                  var12++;
                }
                if (this.field_h > var12) {
                  var6 = 1;
                }
              }
              if (0 < this.field_ab &&
                var5_ref_ja.field_W != null &&
                var5_ref_ja.field_tb > 50 &&
                0 == var5_ref_ja.field_O) {
                stackIn_106_0 = 1;
              } else {
                stackIn_106_0 = 0;
              }
              var12Lifetime1 = stackIn_106_0;
              if (var6 != 0) {
                stackIn_115_1 = -72;
                stackIn_115_2 = var5_ref_ja.field_w;
                if (var12Lifetime1 != 0 &&
                  this.field_bb / 10 % 2 == 0) {
                  stackIn_116_0 = this;
                  stackIn_116_3 = 16777215;
                } else {
                  stackIn_116_0 = this;
                  stackIn_116_3 = var5_ref_ja.field_Eb;
                }
                this.a((byte) stackIn_115_1, stackIn_115_2, stackIn_116_3, var5_ref_ja.field_A.field_h, var5_ref_ja.field_A.field_f);
              }
              if (this.field_bb % 20 < 10 &&
                null != var5_ref_ja.field_W &&
                var5_ref_ja.field_Lb > 50 &&
                this.field_J != 2) {
                var13 = (int)var5_ref_ja.field_Ib;
                var14 = (float)(-var13) + var5_ref_ja.field_Ib;
                if (0.0f == var14 &&
                  ~var13 == ~this.field_sb.length) {
                  var13--;
                  var14 = 1.0f;
                }
                var15_ref_wd = this.field_sb[var13];
                var16_ref_qm = var15_ref_wd.a(false, var14);
                var17_ref_in = var15_ref_wd.a((byte) 120, var14);
                var18 = var5_ref_ja.field_Eb;
                this.a((byte) 13, var17_ref_in, var18, var16_ref_qm.field_h, var16_ref_qm.field_f);
              }
              var13Lifetime1 = var5_ref_ja.field_Fb[2] + var5_ref_ja.field_Fb[0] + (var5_ref_ja.field_Fb[1] + var5_ref_ja.field_Fb[3]);
              var14Lifetime1 = 0.0f;
              var15 = 0;
              while (var15 < 3) {
                var16 = 0;
                stackIn_157_0 = var5_ref_ja.field_hc[var15];
                stackIn_157_1 = -1;
                if (stackIn_157_0 != stackIn_157_1) {
                  if (var5_ref_ja.field_hc[var15] != 0) {
                    if (var5_ref_ja.field_hc[var15] == 1) {
                      var16 = 65280;
                    } else if (var5_ref_ja.field_hc[var15] == 2) {
                      var16 = 255;
                    }
                  } else {
                    var16 = 16711680;
                  }
                  var17 = 3.1415927410125732f * (2.0f * (float)(this.field_bb % 100)) / 100.0f + var14Lifetime1;
                  var2_int = var5_ref_ja.field_A.field_h + (int)((double)var5_ref_ja.field_B * Math.cos((double)var17));
                  var14Lifetime1 = var14Lifetime1 + 6.2831854820251465f / (float)var13Lifetime1;
                  var3 = var5_ref_ja.field_A.field_f - (int)((double)var5_ref_ja.field_B * Math.sin((double)var17));
                  tc.d(var2_int, var3, 3, var16);
                  var16 = var16 >> 1 & 8355711;
                  tc.c(var2_int, var3, 3, var16);
                }
                var15++;
              }
              stackIn_157_0Lifetime1 = ~var5_ref_ja.field_ob;
              stackIn_157_1Lifetime1 = -26;
              if (stackIn_157_0Lifetime1 >= stackIn_157_1Lifetime1 &&
                0 < this.field_ab) {
                pd.a(hk.field_a[20 + var5_ref_ja.field_R], param0 - 12, var5_ref_ja.field_A.field_f - 15, -25 + var5_ref_ja.field_A.field_h, 200 - (var5_ref_ja.field_ob * 8 - 512), 16777215);
              }
              var4++;
              continue L1;
            }
            break;
          }
          if (this.field_fb > 0) {
            var5 = 0;
            if (50 <= this.field_G) {
              if (!(this.field_G <= 150)) {
                var6_float = (float)Math.exp(0.04000000283122063);
                var7 = -100 + (this.field_G - 50);
                var5 = (int)((double)(640.0f / (-1.0f + var6_float)) * (1.0 - Math.exp((double)((float)var7 * 0.0020000000949949026f))));
                if (var19 != 0) {
                  var6_float = (float)Math.exp(1.0);
                  var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)this.field_G)) - 1.0));
                }
              }
            } else {
              var6_float = (float)Math.exp(1.0);
              var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)this.field_G)) - 1.0));
            }
            var6Lifetime1 = this.field_V[0];
            var7_ref_hj = ak.a(-40, false, var6Lifetime1);
            var8Lifetime1 = nm.field_c.a(ae.field_c[var6Lifetime1]) + 48;
            tc.f(3 + var5, 3, var8Lifetime1, 36, 0);
            tc.a(var5 + 2, 2, var8Lifetime1 + 2, 38, 16777215);
            var7_ref_hj.a(5 + var5, 5, 32, 32);
            if (var6Lifetime1 == 12) {
              pe.a(32, 4209, 21 + var5, 21);
            }
            nm.field_c.a(ae.field_c[var6Lifetime1], 48 + var5, 30, 0, -1);
          }
          if (this.field_j > 0) {
            if (null == this.field_R) {
              var5Lifetime1 = ho.field_j.a(this.field_ib[0]);
              var6Lifetime2 = ho.field_j.field_F;
              this.field_R = new hj(var5Lifetime1, var6Lifetime2);
              vb.a(-121, this.field_R);
              ho.field_j.a(this.field_ib[0], 0, ho.field_j.field_G, 0, -1);
              ug.b(param0 + 15);
            }
            var5Lifetime1Lifetime1 = 4096 - (this.field_s << 12) / 50;
            var6Lifetime2Lifetime1 = var5Lifetime1Lifetime1 * this.field_R.field_s >> 12;
            var7Lifetime1 = this.field_R.field_y * var5Lifetime1Lifetime1 >> 12;
            this.field_R.a(640 - var6Lifetime2Lifetime1 >> 1, 480 - var7Lifetime1 >> 1, var6Lifetime2Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.FB(" + param0 + ')');
        }
    }

    private final void a(cg param0, int param1) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        ja stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        boolean stackIn_184_1 = false;
        int stackIn_186_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        RuntimeException stackIn_194_0 = null;
        StringBuilder stackIn_194_1 = null;
        String stackIn_195_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        wm var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted0 = true;
          if (0 == param0.field_c) {
            var3_int = this.field_h;
            this.field_z = 1 + param0.field_d;
            this.field_h = 1 + param0.field_d;
            var4 = var3_int;
            while (var4 < this.field_h) {
              this.field_C[var4].l(554646678);
              var4++;
              if (var5 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if (decompiledFrameCompleted3) {
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3)) {
            if (param0.field_c != 1) {
              if (param0.field_c == 6) {
                if (param0.field_d != -1) {
                  this.field_o = this.field_o & -5;
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.field_o = this.field_o | 4;
                  decompiledFrameRemainder0 = (var5 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (param0.field_c == 2) {
                  if (-114 != param0.field_d) {
                    this.field_D = param0.field_d;
                    if (-101 != param0.field_d) {
                      this.field_tb = 256;
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.field_tb = 0;
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    this.field_tb = 255;
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (3 != param0.field_c) {
                    if (param0.field_c != 4) {
                      if (param0.field_c == 5) {
                        if (-107 == param0.field_d) {
                          if (param0.field_h != -106) {
                            var3_int = 0;
                            do {
                              if (var3_int >= 4) {
                                var3_int = 0;
                                break;
                              }
                              this.field_C[param0.field_h].field_Fb[var3_int] = 0;
                              var3_int++;
                            } while (var5 == 0);
                            do {
                              if (3 <= var3_int) {
                                this.field_C[param0.field_h].field_J = -1;
                                break;
                              }
                              this.field_C[param0.field_h].field_hc[var3_int] = -1;
                              var3_int++;
                            } while (var5 == 0);
                            decompiledFrameRemainder0 = (var5 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            var4 = 0;
                            while (this.field_h > var4) {
                              stackIn_186_0 = 0;
                              if (var5 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              var3_int = stackIn_186_0;
                              while (var3_int < 4) {
                                this.field_C[var4].field_Fb[var3_int] = 0;
                                var3_int++;
                              }
                              var3_int = 0;
                              while (var3_int < 3) {
                                this.field_C[var4].field_hc[var3_int] = -1;
                                var3_int++;
                              }
                              this.field_C[var4].field_J = -1;
                              var4++;
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = (var5 != 0);
                            }
                          }
                        }
                        if ((decompiledFrameRemainder0) &&
                          (decompiledFrameCompleted2)) {
                          var3 = (wm) (this.field_cb.b((byte) 106));
                          while (null != var3) {
                            stackIn_187_0 = 0;
                            stackIn_187_1 = var3.field_J & 512;
                            if (var5 != 0) {
                              decompiledFrameCompleted1 = false;
                              break;
                            }
                            if (stackIn_187_0 != stackIn_187_1 && (param0.field_d == -106 ||
                              (var3.field_J & 3) == param0.field_d)) {
                              var3.d(0);
                            }
                            var3 = (wm) (this.field_cb.c((byte) -52));
                          }
                          if (decompiledFrameCompleted1) {
                            decompiledFrameRemainder0 = (var5 != 0);
                          }
                        }
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted2) &&
                        (decompiledFrameCompleted1)) {
                        if (param0.field_c == 7) {
                          var3_int = 0;
                          while (true) {
                            if (var3_int < 4) {
                              this.field_C[param0.field_d].field_Fb[var3_int] = 0;
                              var3_int++;
                              if (var5 == 0) {
                                continue;
                              }
                            } else {
                              this.field_C[param0.field_d].field_hc[0] = param0.field_h;
                              this.field_C[param0.field_d].field_hc[1] = param0.field_e;
                              this.field_C[param0.field_d].field_hc[2] = param0.field_k;
                            }
                            break;
                          }
                          if (param0.field_h != -1) {
                            dupTemp$0 = this.field_C[param0.field_d].field_Fb;
                            dupTemp$0[param0.field_h] = dupTemp$0[param0.field_h] + 1;
                          }
                          if (param0.field_e != -1) {
                            dupTemp$1 = this.field_C[param0.field_d].field_Fb;
                            dupTemp$1[param0.field_e] = dupTemp$1[param0.field_e] + 1;
                          }
                          if (-1 != param0.field_k) {
                            dupTemp$2 = this.field_C[param0.field_d].field_Fb;
                            dupTemp$2[param0.field_k] = dupTemp$2[param0.field_k] + 1;
                          }
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (param0.field_c != 8) {
                            if (param0.field_c == 9) {
                              stackIn_139_0 = this.field_C[param0.field_d];
                              stackIn_140_1 = (param0.field_h != 0);
                              stackIn_139_0.field_jb = stackIn_140_1;
                              this.field_C[param0.field_d].field_M = param0.field_h;
                              decompiledFrameRemainder0 = (var5 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if (10 != param0.field_c) {
                                if (param0.field_c == 11) {
                                  this.field_B = param0.field_d;
                                  this.field_U = false;
                                  this.field_ob = -1;
                                  decompiledFrameRemainder0 = (var5 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (param0.field_c == 12) {
                                    this.field_S = false;
                                    this.field_mb = -1;
                                    decompiledFrameRemainder0 = (var5 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (param0.field_c == 13))) {
                                    this.field_mb = -1;
                                    qn.a(7, false, false);
                                    decompiledFrameRemainder0 = (var5 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                this.field_z = param0.field_d;
                                this.field_h = param0.field_d;
                                var3_int = 0;
                                while (var3_int < this.field_h) {
                                  this.field_C[var3_int].l(554646678);
                                  var3_int++;
                                  if (var5 != 0) {
                                    decompiledFrameCompleted0 = false;
                                    break;
                                  }
                                }
                                if (decompiledFrameCompleted0) {
                                  decompiledFrameRemainder0 = (var5 != 0);
                                }
                              }
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameCompleted0)) {
                            this.field_C[param0.field_d].field_bc = param0.field_h;
                            if (var5 != 0) {
                              this.b(24936, param0.field_h, param0.field_d);
                              this.a(param0.field_d, -1, param0.field_h);
                              stackIn_184_1 = (param0.field_d == -1);
                              this.field_S = stackIn_184_1;
                            }
                          }
                        }
                      }
                    } else {
                      this.b(24936, param0.field_h, param0.field_d);
                      if (var5 != 0) {
                        this.a(param0.field_d, -1, param0.field_h);
                        stackIn_184_1 = (param0.field_d == -1);
                        this.field_S = stackIn_184_1;
                      }
                    }
                  } else {
                    this.a(param0.field_d, -1, param0.field_h);
                    if (var5 != 0) {
                      stackIn_184_1 = (param0.field_d == -1);
                      this.field_S = stackIn_184_1;
                    }
                  }
                }
              }
            } else {
              stackIn_184_1 = (param0.field_d == -1);
              this.field_S = stackIn_184_1;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_186_0 = param1;
          }
          if (decompiledFrameCompleted1) {
            stackIn_187_0 = stackIn_186_0;
            stackIn_187_1 = -88;
          }
          if (stackIn_187_0 >= stackIn_187_1) {
            this.b(-43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_194_0 = var3_ref;
          stackIn_194_1 = new StringBuilder().append("sg.AA(");
          if (param0 == null) {
            stackIn_195_2 = "null";
          } else {
            stackIn_195_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_194_0), ((StringBuilder) (Object) stackIn_194_1).append(stackIn_195_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_85_0 = 0;
        ul stackIn_98_0 = null;
        ul stackIn_119_0 = null;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        ul stackIn_132_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        ji var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        ul var3 = null;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        wm var6 = null;
        int var6_int = 0;
        ja var6_ref = null;
        ji var6_ref2 = null;
        int var7_int = 0;
        ja var7 = null;
        ul var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        wm var6Lifetime1;
        int var4_intLifetime1;
        var9 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (this.field_D != -101) {
            var2_int = this.field_bb % 60;
            stackIn_5_0 = 10;
            if (var2_int > 30) {
              stackIn_6_1 = 60 - var2_int;
            } else {
              stackIn_6_1 = var2_int;
            }
            var3_int = stackIn_5_0 + stackIn_6_1 / 2;
            var4_int = (30 + this.field_bb) % 60;
            stackIn_9_0 = 10;
            if (var4_int <= 30) {
              stackIn_10_1 = var4_int;
            } else {
              stackIn_10_1 = -var4_int + 60;
            }
            var5_int = stackIn_9_0 + stackIn_10_1 / 2;
            if (-101 >= this.field_D ||
              15 <= this.field_bb % 30) {
              if (-106 > this.field_D) {
                if (-111 >= this.field_D) {
                  if ((this.field_D != -111) &&
                    (decompiledFrameRemainder0 = !(this.field_D < -113))) {
                    var6 = (wm) (this.field_cb.b((byte) 114));
                    while (var6 != null) {
                      if (var9 != 0) {
                        decompiledFrameCompleted3 = false;
                        break;
                      }
                      stackIn_31_0 = 0;
                      stackIn_31_1 = var6.field_J & 32768;
                      if (stackIn_31_0 != stackIn_31_1 && (this.field_D == -112 &&
                        (var6.field_J & 3) == 0 ||
                        this.field_D == -113 &&
                        (3 & var6.field_J) == 1)) {
                        var7_int = 0;
                        while (var7_int < 2) {
                          stackIn_31_0 = ~var7_int;
                          stackIn_31_1 = -1;
                          stackIn_51_0 = (stackIn_31_0 == stackIn_31_1) ? var3_int : var5_int;
                          var8 = stackIn_51_0;
                          tc.e(var6.field_A.field_h + (int)(var6.field_w.field_j * (float)(var6.field_k + var8) + var6.field_w.field_g * (float)(var8 + var6.field_i)), var6.field_A.field_f + (int)((float)(var6.field_k + var8) * var6.field_w.field_g - var6.field_w.field_j * (float)(var6.field_i + var8)), (int)(var6.field_w.field_j * (float)(var8 + var6.field_k) - var6.field_w.field_g * (float)(var6.field_i + var8)) + var6.field_A.field_h, (int)((float)(var8 + var6.field_i) * var6.field_w.field_j + (float)(var8 + var6.field_k) * var6.field_w.field_g) + var6.field_A.field_f, 16777087, this.field_tb);
                          tc.e(var6.field_A.field_h + (int)(var6.field_w.field_j * (float)(var8 + var6.field_k) - (float)(var8 + var6.field_i) * var6.field_w.field_g), var6.field_A.field_f + (int)((float)(var6.field_k + var8) * var6.field_w.field_g + (float)(var6.field_i + var8) * var6.field_w.field_j), var6.field_A.field_h + (int)((float)(var6.field_k + var8) * -var6.field_w.field_j - (float)(var6.field_i + var8) * var6.field_w.field_g), var6.field_A.field_f + (int)(-var6.field_w.field_g * (float)(var6.field_k + var8) + var6.field_w.field_j * (float)(var8 + var6.field_i)), 16777087, this.field_tb);
                          tc.e((int)(-(var6.field_w.field_g * (float)(var6.field_i + var8)) + (float)(var6.field_k + var8) * -var6.field_w.field_j) + var6.field_A.field_h, (int)(-var6.field_w.field_g * (float)(var6.field_k + var8) + (float)(var8 + var6.field_i) * var6.field_w.field_j) + var6.field_A.field_f, var6.field_A.field_h + (int)(var6.field_w.field_g * (float)(var8 + var6.field_i) + (float)(var6.field_k + var8) * -var6.field_w.field_j), var6.field_A.field_f + (int)(-var6.field_w.field_g * (float)(var8 + var6.field_k) - var6.field_w.field_j * (float)(var6.field_i + var8)), 16777087, this.field_tb);
                          tc.e((int)(var6.field_w.field_g * (float)(var6.field_i + var8) + -var6.field_w.field_j * (float)(var6.field_k + var8)) + var6.field_A.field_h, var6.field_A.field_f + (int)(-((float)(var8 + var6.field_i) * var6.field_w.field_j) + -var6.field_w.field_g * (float)(var8 + var6.field_k)), var6.field_A.field_h + (int)(var6.field_w.field_j * (float)(var8 + var6.field_k) + (float)(var8 + var6.field_i) * var6.field_w.field_g), (int)((float)(var8 + var6.field_k) * var6.field_w.field_g - var6.field_w.field_j * (float)(var6.field_i + var8)) + var6.field_A.field_f, 16777087, this.field_tb);
                          var7_int++;
                        }
                      }
                      var6 = (wm) (this.field_cb.c((byte) -84));
                      continue;
                    }
                    if (decompiledFrameCompleted3) {
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted3)) {
                    var6_int = 0;
                    while (var6_int < this.field_h) {
                      var7 = this.field_C[var6_int];
                      oc.a(var3_int, var7.field_A.field_f, var7.field_A.field_h, 16777087, (byte) -95, this.field_tb);
                      oc.a(var5_int, var7.field_A.field_f, var7.field_A.field_h, 16777087, (byte) -92, this.field_tb);
                      var6_int++;
                      if (var9 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted3) &&
                  (decompiledFrameCompleted2)) {
                  var6_ref = this.field_C[-107 - this.field_D];
                  oc.a(var3_int, var6_ref.field_A.field_f, var6_ref.field_A.field_h, 16777087, (byte) -102, this.field_tb);
                  oc.a(var5_int, var6_ref.field_A.field_f, var6_ref.field_A.field_h, 16777087, (byte) 108, this.field_tb);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                var6Lifetime1 = (wm) (this.field_cb.b((byte) 116));
                while (null != var6Lifetime1) {
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (0 != (512 & var6Lifetime1.field_J) && (-106 == this.field_D ||
                    -this.field_D - 102 == (3 & var6Lifetime1.field_J))) {
                    oc.a(var3_int, var6Lifetime1.field_A.field_f, var6Lifetime1.field_A.field_h, 16777087, (byte) 109, this.field_tb);
                    oc.a(var5_int, var6Lifetime1.field_A.field_f, var6Lifetime1.field_A.field_h, 16777087, (byte) 93, this.field_tb);
                  }
                  var6Lifetime1 = (wm) (this.field_cb.c((byte) -61));
                }
                if ((decompiledFrameCompleted1) &&
                  (var9 != 0)) {
                  if (this.field_D >= 0) {
                    stackIn_85_0 = this.field_D;
                  } else {
                    stackIn_85_0 = this.field_sb.length + this.field_D;
                  }
                  var6_int = stackIn_85_0;
                  jb.a(this.field_sb, var6_int, false, 115, bn.field_l, var6_int + 1);
                }
              }
            } else {
              if (this.field_D >= 0) {
                stackIn_85_0 = this.field_D;
              } else {
                stackIn_85_0 = this.field_sb.length + this.field_D;
              }
              var6_int = stackIn_85_0;
              jb.a(this.field_sb, var6_int, false, 115, bn.field_l, var6_int + 1);
            }
          }
          var2 = mm.field_a[this.field_mb];
          if (param0 != -3) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          if (null != var2.field_j &&
            var2.field_g != null) {
            if (this.field_n != 1) {
              stackIn_98_0 = var2.field_j;
            } else {
              stackIn_98_0 = var2.field_g;
            }
            var3 = stackIn_98_0;
            var4_intLifetime1 = 0;
            while (var4_intLifetime1 < 2) {
              stackIn_124_0 = ~(var3.field_f - 30);
              stackIn_124_1 = ~this.field_C[0].field_A.field_h;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_124_0 > stackIn_124_1 &&
                var3.field_f + var3.field_d + 30 > this.field_C[0].field_A.field_h &&
                var3.field_c - 30 < this.field_C[0].field_A.field_f &&
                var3.field_c + var3.field_g + 30 > this.field_C[0].field_A.field_f) {
                this.field_n = 1 - this.field_n;
                if (this.field_n == 1) {
                  stackIn_119_0 = var2.field_g;
                } else {
                  stackIn_119_0 = var2.field_j;
                }
                var3 = stackIn_119_0;
              }
              var4_intLifetime1++;
            }
            if ((decompiledFrameCompleted0) &&
              (var9 != 0)) {
              var3 = var2.field_j;
            }
          } else {
            var3 = var2.field_j;
          }
          if (decompiledFrameCompleted0) {
            stackIn_124_0 = ~this.field_a;
            stackIn_124_1 = ~this.field_mb;
          }
          if (stackIn_124_0 != stackIn_124_1) {
            var4 = (float)Math.exp((double)(-0.20000000298023224f * (float)this.field_k));
            var5 = -var4 + 1.0f;
            if (-1 != this.field_a) {
              var6_ref2 = mm.field_a[this.field_a];
              if (this.field_n == 1) {
                stackIn_132_0 = var6_ref2.field_g;
              } else {
                stackIn_132_0 = var6_ref2.field_j;
              }
              var7_ref = stackIn_132_0;
              if (var7_ref != null) {
                this.a(var6_ref2.field_h, var5, param0 - 11237, var7_ref, var6_ref2.field_f);
              }
            }
            if (var3 != null) {
              this.a(var2.field_h, var4, param0 ^ 11237, var3, var2.field_f);
            }
            if (var9 == 0) {
              return;
            }
          }
          if (null != var3) {
            this.a(var2.field_h, 0.0f, -11240, var3, var2.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "sg.H(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, int param4, vk param5, boolean param6) {
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_150_0 = 0;
        ja stackIn_201_0 = null;
        wm stackIn_205_0 = null;
        Object stackIn_211_0 = null;
        Object stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_204_0;
        Object var8 = null;
        int var9_int = 0;
        Object var9 = null;
        vf var10_ref_vf = null;
        int var10 = 0;
        qm var10_ref_qm = null;
        int var11_int = 0;
        wm var11 = null;
        int var12 = 0;
        wm var13 = null;
        int var14 = 0;
        int var10Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          ch.a(9);
          this.field_J = param2;
          this.field_kb = false;
          this.field_E = param6;
          this.field_I = new hj(640, 480);
          this.c((byte) -69);
          this.field_U = false;
          this.field_B = 8;
          this.field_b = false;
          if (param3 < 3) {
            this.field_I = (hj) null;
          }
          boolean decompiledFrameCompleted4 = true;
          this.field_C = new ja[64];
          this.field_P = 0;
          this.field_bb = 0;
          this.field_S = false;
          this.field_ab = -150;
          var8 = null;
          if (this.field_J == 0 &&
            mi.field_d == 7) {
            var8 = new int[4];
            var9_int = 0;
            while (var9_int < 4) {
              stackIn_29_0 = ~var9_int;
              stackIn_29_1 = ~dk.field_g;
              if (var14 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
              if (stackIn_29_0 > stackIn_29_1) {
                ((int[]) (var8))[var9_int] = 3 - var9_int;
              } else if (var9_int <= dk.field_g) {
                ((int[]) (var8))[var9_int] = 0;
              } else {
                ((int[]) (var8))[var9_int] = -var9_int + 4;
              }
              var9_int++;
            }
          }
          if (decompiledFrameCompleted4) {
            this.a((byte) 7, (int[]) (var8), param5);
            stackIn_29_0 = 16616;
            stackIn_29_1 = 0;
          }
          boolean decompiledFrameCompleted3 = true;
          if (kb.a(stackIn_29_0, stackIn_29_1) &&
            2 == this.field_J) {
            ih.field_n = new ah();
            var9_int = 0;
            while (var9_int < 200) {
              var10_ref_vf = new vf();
              ih.field_n.a((byte) -94, var10_ref_vf);
              var9_int++;
              if (var14 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            this.field_V = new int[16];
            this.field_rb = new int[16];
            this.field_rb[6] = -1;
            this.field_t = nj.field_d;
            this.field_j = 0;
            this.field_g = tn.field_c;
            this.field_hb = ni.field_b;
            this.field_s = 0;
            this.field_rb[11] = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_r != 0) {
            if (this.field_r != 1) {
              if (this.field_r != 2) {
                this.field_H = -2084705208;
                this.field_N = 1884993344;
                this.field_p = 1744876195;
                this.field_l = 674154881;
                decompiledFrameRemainder1 = (var14 != 0);
              }
              if (decompiledFrameRemainder1) {
                this.field_N = 1627384728;
                this.field_p = -81247984;
                this.field_H = -2084713400;
                this.field_l = 1752551195;
                if (var14 != 0) {
                  this.field_N = -1947303144;
                  this.field_p = 2016652736;
                  this.field_l = -1138652621;
                  this.field_H = -1816269752;
                  this.field_l = 723448452;
                  this.field_H = -1816277944;
                  this.field_N = -127488232;
                  this.field_p = -1996410128;
                }
              }
            } else {
              this.field_N = -1947303144;
              this.field_p = 2016652736;
              this.field_l = -1138652621;
              this.field_H = -1816269752;
              if (var14 != 0) {
                this.field_l = 723448452;
                this.field_H = -1816277944;
                this.field_N = -127488232;
                this.field_p = -1996410128;
              }
            }
          } else {
            this.field_l = 723448452;
            this.field_H = -1816277944;
            this.field_N = -127488232;
            this.field_p = -1996410128;
          }
          boolean decompiledFrameCompleted2 = true;
          this.field_G = 0;
          this.field_y = cm.field_a;
          this.field_rb[7] = -1;
          if (param0) {
            stackIn_67_0 = (this.field_E) ? 2 : 1;
            var9_int = stackIn_67_0;
            var10 = -var9_int + this.field_h;
            if (var10 > 0) {
              var11_int = 0;
              while (var11_int < var10) {
                stackIn_82_0 = var9_int;
                if (var14 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                var12 = stackIn_82_0;
                while (var12 < (-1 + this.field_z)) {
                  this.field_C[var12] = this.field_C[1 + var12];
                  var12++;
                }
                this.field_z = this.field_z - 1;
                this.field_h = this.field_h - 1;
                var11_int++;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_82_0 = this.field_E ? 1 : 0;
          }
          if (stackIn_82_0 != 0) {
            this.field_C[0].field_W = ae.field_f;
            this.field_C[1].field_W = ij.field_c;
            if (param4 != -1) {
              this.field_C[0].a(20385, ge.field_c[param4]);
            }
            if (param1 != -1) {
              this.field_C[1].a(20385, ge.field_c[param1]);
              if ((var14 != 0) && (5 != this.field_J &&
                this.field_J != 6 &&
                this.field_J != 4)) {
                this.field_C[0].field_W = fd.field_a;
                if (-1 != param4) {
                  this.field_C[0].a(20385, ge.field_c[param4]);
                }
              }
            }
          } else {
            if (5 != this.field_J &&
              this.field_J != 6 &&
              this.field_J != 4) {
              this.field_C[0].field_W = fd.field_a;
              if (-1 != param4) {
                this.field_C[0].a(20385, ge.field_c[param4]);
              }
            }
          }
          var9_int = 0;
          L26: while (true) {
            if (var9_int < this.field_z) {
              this.field_C[var9_int].field_mc = var9_int;
              stackIn_201_0 = this.field_C[var9_int];
              if (var14 == 0) {
                if (stackIn_201_0.field_C.field_v == null) {
                  this.field_C[var9_int].field_C.field_v = this.field_C[var9_int].field_C.field_b.c((byte) 51);
                }
                if (null == this.field_C[var9_int].field_C.field_h) {
                  this.field_C[var9_int].field_C.field_h = this.field_C[var9_int].field_C.field_z.c((byte) 7);
                }
                var9_int++;
                continue;
              }
            } else {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              if (this.field_J == 5) {
                var9 = (wm) (this.field_cb.b((byte) 125));
                while (null != var9) {
                  stackIn_150_0 = ~(((wm) (var9)).field_J & 512);
                  if (var14 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_150_0 != -1) {
                    ((wm) (var9)).d(0);
                  }
                  var9 = (wm) (this.field_cb.c((byte) -57));
                }
              } else {
                if (this.field_J == 6) {
                  var9_int = 0;
                  while (8 > var9_int) {
                    var10_ref_qm = new qm(0, 0);
                    stackIn_150_0 = 0;
                    if (var14 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var11_int = stackIn_150_0;
                    do {
                      var10_ref_qm.field_h = kj.b(2, 640);
                      var10_ref_qm.field_f = kj.b(2, 480);
                      var11_int = this.d(var10_ref_qm.field_f, var10_ref_qm.field_h, -118);
                      stackIn_139_0 = -1;
                      stackIn_139_1 = ~var11_int;
                    } while (stackIn_139_0 == stackIn_139_1);
                    stackIn_139_0 = ~(var11_int & 48);
                    stackIn_139_1 = -1;
                    if (stackIn_139_0 == stackIn_139_1) {
                      stackIn_148_0 = ((var11_int & 12) == 0) ? -1 : 0;
                    } else {
                      stackIn_148_0 = 1;
                    }
                    var12 = stackIn_148_0;
                    var13 = new wm(var10_ref_qm, 1, var12);
                    this.field_cb.a((byte) -120, var13);
                    var9_int++;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                stackIn_150_0 = 0;
              }
              var9_int = stackIn_150_0;
              while (true) {
                if (var9_int < this.field_z) {
                  this.field_C[var9_int].field_hb = kj.b(2, 3);
                  var9_int++;
                  if (var14 == 0) {
                    continue;
                  }
                } else {
                  this.field_mb = -1;
                  this.field_a = -1;
                  this.field_o = 0;
                  this.field_D = -101;
                }
                boolean decompiledFrameRemainder0 = true;
                if (this.field_J == 3) {
                  this.e(4);
                  decompiledFrameRemainder0 = (var14 != 0);
                }
                if (decompiledFrameRemainder0) {
                  boolean decompiledSharedTail0 = (2 != this.field_J ||
                    kb.a(16616, 0) ||
                    param6 ||
                    !(on.field_s));
                  if (!decompiledSharedTail0) {
                    on.field_s = false;
                    tn.a(0);
                    this.b("demolition", (byte) 8);
                    decompiledSharedTail0 = (var14 != 0);
                  }
                  if ((decompiledSharedTail0) && (this.field_r == 3 &&
                    ij.field_l &&
                    this.field_J != 5 &&
                    this.field_J != 6 &&
                    this.field_J != 2)) {
                    ij.field_l = false;
                    tn.a(0);
                    this.b("night", (byte) 8);
                  }
                }
                this.field_W = new ah();
                if (this.field_J >= 5) {
                  break L26;
                }
                if (param6) {
                  stackIn_201_0 = null;
                  break;
                }
                stackIn_201_0 = this.field_C[0];
                break;
              }
            }
            sa.a(stackIn_201_0, -15676);
            if (var14 == 0) {
              return;
            }
            break;
          }
          var9 = null;
          var10Lifetime1 = 0;
          var11 = (wm) (this.field_cb.b((byte) 89));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var11))) {
            stackOut_204_0 = var11;
            stackIn_211_0 = stackOut_204_0;
            stackIn_205_0 = stackOut_204_0;
            if (var14 == 0) {
              if (stackIn_205_0.field_A.field_h > var10Lifetime1) {
                var10Lifetime1 = var11.field_A.field_h;
                var9 = var11;
              }
              var11 = (wm) (this.field_cb.c((byte) -80));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_211_0 = var9;
          }
          sa.a((ee) (stackIn_211_0), -15676);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_216_0 = var8;
          stackIn_216_1 = new StringBuilder().append("sg.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw kk.a((Throwable) (stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(wm param0, boolean param1) {
        int discarded$6 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.d(0);
          rd.a(oa.field_p.field_q, param0.field_A, -78, oa.field_p);
          kn.a(0, param0.field_A.field_f, 0, 64, 1, -16, param0.field_A.field_h, param0.field_q, this.field_M, 16776960, 0, 255, 20);
          discarded$6 = this.a(-30808, 3, 25, param0, 32, 100000.0f);
          if (param1) {
            this.g(-25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sg.DA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, ja param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var3_int = 70 + param1.field_C.field_K;
          var4 = param1.field_r;
          var4 = (float)((double)var4 * 10.185916357881302);
          var5 = Math.round(var4);
          L1: while (true) {
            if (var5 < 0) {
              var5 += 64;
              if (var9 == 0) {
                continue;
              }
            } else {
              while (var5 >= 64) {
                var5 -= 64;
                if (var9 != 0) {
                  break L1;
                }
              }
              var4 = 6.2831854820251465f * (float)var5 / (float)param0;
            }
            break;
          }
          var6 = param1.field_A.field_h + (int)((double)var3_int * Math.cos((double)var4));
          var7 = param1.field_A.field_f + (int)(-Math.sin((double)var4) * (double)var3_int);
          vb.a(param0 ^ -7, this.field_I);
          var8 = qk.field_f.a(param1.field_r, param0 + 27724);
          pa.a(-(var8.field_v >> 1) + var7, -(var8.field_o >> 1) + var6, 121, var8);
          ug.b(param0 - 65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("sg.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_184_2 = 0;
        int stackIn_184_3 = 0;
        int stackIn_184_4 = 0;
        int stackIn_204_3 = 0;
        int stackIn_207_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var18 = HoldTheLine.field_D;
        try {
          if (param0 != -109) {
            this.field_m = (ue[]) null;
          }
          var2_int = 0;
          L1: while (true) {
            stackIn_6_0 = ~var2_int;
            stackIn_6_1 = ~this.field_h;
            if (stackIn_6_0 > stackIn_6_1) {
              var6 = this.field_C[var2_int];
              if (var18 != 0) {
                return;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 == this.field_J ||
                this.field_J == 3) {
                var7 = var6.field_mc;
                switch ((var18 == 0
                  || var7 == 1
                  || var7 == 2
                  ) ? var7 : -1) {
                  case 0:
                    var4 = 30;
                    var3 = 10;
                    {
                      break;
                    }
                  case 1:
                    var3 = 580;
                    var4 = 30;
                    {
                      break;
                    }
                  case 2:
                    var3 = 10;
                    var4 = 420;
                    {
                      break;
                    }
                  default:
                    var3 = 580;
                    var4 = 420;
                }
                var7 = var6.field_tc;
                if (var6.field_ob <= 10 &&
                  !this.field_S &&
                  dg.field_c == -1) {
                  stackIn_40_0 = -var6.field_ob + 10;
                } else {
                  stackIn_40_0 = 0;
                }
                var8 = stackIn_40_0;
                ek.a(-1, 1024 + var8 * 16, hk.field_a[20 + var6.field_R], var3, var7, var4);
                var9 = var6.field_mc;
                switch ((var18 == 0
                  || var9 == 1
                  || var9 == 2
                  ) ? var9 : -1) {
                  case 0:
                    var4 = 3;
                    var3 = 5;
                    {
                      break;
                    }
                  case 1:
                    var4 = 3;
                    var3 = 615;
                    {
                      break;
                    }
                  case 2:
                    var4 = 453;
                    var3 = 5;
                    {
                      break;
                    }
                  default:
                    var3 = 615;
                    var4 = 453;
                }
                var9 = var6.field_bc % 10;
                if (10 >= var6.field_X &&
                  !this.field_S &&
                  dg.field_c == -1) {
                  stackIn_66_0 = 10 - var6.field_X;
                } else {
                  stackIn_66_0 = 0;
                }
                var8 = stackIn_66_0;
                if (this.field_B < var6.field_bc &&
                  this.field_B != -1) {
                  var9 = this.field_B;
                  if (10 > this.field_bb % 20) {
                    var7 = 16777215;
                  }
                }
                pd.a(hk.field_a[var9 + 10], -100, var4, var3, 1024 + var8 * 16, var7);
                var10 = var6.field_mc;
                switch ((var18 == 0
                  || var10 == 1
                  || var10 == 2
                  ) ? var10 : -1) {
                  case 0:
                    var4 = 3;
                    var3 = 20;
                    {
                      break;
                    }
                  case 1:
                    var3 = 576;
                    var4 = 3;
                    {
                      break;
                    }
                  case 2:
                    var3 = 22;
                    var4 = 453;
                    {
                      break;
                    }
                  default:
                    var3 = 577;
                    var4 = 453;
                }
                hk.field_a[24].a(var3, var4);
              } else {
                if (this.field_J == 2) {
                  var7 = var6.field_mc;
                  switch ((var18 == 0
                    || var7 == 1
                    || var7 == 2
                    ) ? var7 : -1) {
                    case 0:
                      var4 = 30;
                      var3 = 10;
                      {
                        break;
                      }
                    case 1:
                      var3 = 580;
                      var4 = 30;
                      {
                        break;
                      }
                    case 2:
                      var4 = 420;
                      var3 = 10;
                      {
                        break;
                      }
                    default:
                      var4 = 420;
                      var3 = 580;
                  }
                  var7 = var6.field_tc;
                  if (var6.field_ob <= 10 &&
                    !this.field_S &&
                    dg.field_c == -1) {
                    stackIn_120_0 = -var6.field_ob + 10;
                  } else {
                    stackIn_120_0 = 0;
                  }
                  var8 = stackIn_120_0;
                  ek.a(-1, 16 * var8 + 1024, hk.field_a[var6.field_R + 20], var3, var7, var4);
                  var9 = var6.field_mc;
                  switch ((var18 == 0
                    || var9 == 2
                    ) ? var9 : -1) {
                    case 0:
                      var3 = 5;
                      var4 = 3;
                      {
                        break;
                      }
                    case 1:
                      var3 = 615;
                      var4 = 3;
                      {
                        break;
                      }
                    case 2:
                      var3 = 5;
                      var4 = 453;
                      {
                        break;
                      }
                    default:
                      var4 = 453;
                      var3 = 615;
                  }
                  if (var6.field_X <= 10 &&
                    !this.field_S &&
                    dg.field_c == -1) {
                    stackIn_149_0 = -var6.field_X + 10;
                  } else {
                    stackIn_149_0 = 0;
                  }
                  var8 = stackIn_149_0;
                  stackIn_153_0 = (!kb.a(16616, 0)) ? 2 : 3;
                  var9 = stackIn_153_0;
                  if (var6.field_mc == 0 ||
                    var6.field_mc == 2) {
                    var3 = var3 + 12 * var9;
                  }
                  var10 = var6.field_Sb;
                  var11 = 0;
                  while (var9 > var11) {
                    var12 = var10 % 10;
                    pd.a(hk.field_a[var12 + 10], -95, var4, var3 - 12 * var11, 1024 + var8 * 16, var7);
                    var10 = var10 / 10;
                    var11++;
                  }
                  var11 = var6.field_mc;
                  switch ((var18 == 0
                    || var11 == 1
                    || var11 == 2
                    ) ? var11 : -1) {
                    case 0:
                      var5 = 1;
                      var3 = 80;
                      var4 = 35;
                      {
                        break;
                      }
                    case 1:
                      var5 = 1;
                      var4 = 35;
                      var3 = 505;
                      {
                        break;
                      }
                    case 2:
                      var4 = 425;
                      var3 = 80;
                      var5 = 1;
                      {
                        break;
                      }
                    default:
                      var4 = 425;
                      var5 = 1;
                      var3 = 505;
                  }
                  var11 = (int)(var6.field_N * 80.0f / (float)var6.field_C.field_i);
                  var12 = (int)(var6.field_lc * 80.0f / (float)var6.field_C.field_i);
                  var13 = 0;
                  L55: while (true) {
                    if (var13 >= 2) {
                      while (true) {
                        var13 = 0;
                        while (20 > var13) {
                          tc.b(-2 + (-(var5 * var13 / 2) + var3), var4 + var13, 2, 0);
                          tc.b(-(var5 * var13 / 2) + (80 + var3), var4 + var13, 2, 0);
                          var13++;
                        }
                        var13 = 0;
                        while (var13 < 3) {
                          tc.b(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb);
                          stackIn_207_0 = 0;
                          var14 = stackIn_207_0;
                          while (3 > var14) {
                            stackIn_184_0 = 80 + (var3 - (-(var14 * 10) + (30 + var13 * var5 / 2)));
                            stackIn_184_1 = var13 + var4;
                            stackIn_184_2 = 10;
                            stackIn_184_3 = 0;
                            stackIn_184_4 = var14 % 2;
                            if (stackIn_184_3 == stackIn_184_4) {
                              stackIn_204_3 = 16777215;
                            } else {
                              stackIn_204_3 = var6.field_Eb;
                            }
                            tc.b(stackIn_184_0, stackIn_184_1, stackIn_184_2, stackIn_204_3);
                            var14++;
                          }
                          var13++;
                        }
                        break L55;
                      }
                    } else {
                      tc.b((var13 + 1) * var5 / 2 + var3 - 2, -1 + (var4 - var13), 84, 0);
                      stackIn_184_0 = -2;
                      stackIn_184_1 = var3;
                      stackIn_184_2 = var5;
                      stackIn_184_3 = var13;
                      stackIn_184_4 = -20;
                      while (true) {
                        tc.b(stackIn_184_0 + (stackIn_184_1 - stackIn_184_2 * (stackIn_184_3 - stackIn_184_4) / 2), var4 + (20 + var13), 84, 0);
                        var13++;
                        continue L55;
                      }
                    }

                  }
                  stackIn_207_0 = 3;
                  var13 = stackIn_207_0;
                  while (var13 < 20) {
                    stackIn_6_0 = -51;
                    stackIn_6_1 = ~var11;
                    if (stackIn_6_0 >= stackIn_6_1) {
                      tc.c(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb, 192);
                    } else {
                      tc.c(var3 - var5 * var13 / 2, var13 + var4, var11, var6.field_Eb, 192);
                      tc.c(var3 - (var5 * var13 / 2 - var11), var4 + var13, -var11 + 50, var6.field_Eb >> 1 & 8355711, 192);
                    }
                    var14 = 0;
                    while (3 > var14) {
                      stackIn_239_0 = -1;
                      stackIn_239_1 = ~(var14 % 2);
                      if (stackIn_239_0 != stackIn_239_1) {
                        stackIn_225_0 = var6.field_Eb;
                      } else {
                        stackIn_225_0 = 16777215;
                      }
                      var15 = stackIn_225_0;
                      var16 = (var15 & 16711422) >> 1;
                      var17 = 80 + (-30 + 10 * var14);
                      if (var11 < var17) {
                        tc.c(var3 + var17 - var5 * var13 / 2, var4 + var13, 10, var16, 192);
                      } else if (var17 + 10 <= var11) {
                        tc.c(var3 + var17 - var13 * var5 / 2, var4 + var13, 10, var15, 192);
                      } else {
                        tc.c(var3 + var17 - var13 * var5 / 2, var13 + var4, -var17 + var11, var15, 192);
                        tc.c(var3 + var11 - var5 * var13 / 2, var4 + var13, 10 - (-var17 + var11), var16, 192);
                      }
                      var14++;
                    }
                    stackIn_239_0 = ~var11;
                    stackIn_239_1 = ~var12;
                    if (stackIn_239_0 < stackIn_239_1) {
                      tc.c(-(var5 * var13 / 2) + var3 + var12, var4 + var13, -var12 + var11, 16777215, 256);
                    }
                    var13++;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (this.field_J == 1 &&
                    var6.field_bc > 0) {
                    var7 = var6.field_mc;
                    switch ((var18 == 0
                      || var7 == 2
                      ) ? var7 : -1) {
                      case 0:
                        var4 = 10;
                        var3 = 10;
                        var5 = 12;
                        {
                          break;
                        }
                      case 1:
                        var5 = 12;
                        var3 = 575;
                        var4 = 10;
                        {
                          break;
                        }
                      case 2:
                        var3 = 10;
                        var5 = 12;
                        var4 = 450;
                        {
                          break;
                        }
                      default:
                        var4 = 450;
                        var5 = 12;
                        var3 = 575;
                    }
                    var7 = var6.field_ab / 50;
                    var7 = var7 % 100;
                    var8 = var7 / 10;
                    var9 = var7 % 10;
                    var10 = var6.field_ab % 50 / 5;
                    var11 = 2 * (var6.field_ab % 5);
                    ek.a(-1, 1024, hk.field_a[10 + var8], var3, 16777215, var4);
                    ek.a(-1, 1024, hk.field_a[10 + var9], var5 + var3, 16777215, var4);
                    ek.a(-1, 768, hk.field_a[var10 + 10], var3 + var5 * 2, 16777215, var4 + 1);
                    ek.a(-1, 768, hk.field_a[10 + var11], (11 * var5 >> 2) + var3, 16777215, 1 + var4);
                  }
                }
              }
              var2_int++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.BB(" + param0 + ')');
        }
    }

    private final void a(int param0, na param1) {
        RuntimeException runtimeException = null;
        hj var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ok.a(32381);
          this.field_I.f();
          var3 = de.field_Q;
          pa.a(-(var3.field_y >> 1) + param1.field_n, param1.field_l - (var3.field_s >> 1), 103, var3);
          ug.b(-1);
          if (param0 >= -24) {
            this.field_W = (ah) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("sg.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 96) {
            this.field_eb = (int[]) null;
          }
          this.g(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.NA(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        try {
          var2_int = 264;
          var3 = 22;
          var4 = this.field_ab;
          var5 = this.field_ab;
          if (this.field_J != 0 &&
            3 != this.field_J) {
            if (this.field_J == 1 &&
              0 < this.field_ab) {
              var5 = this.field_C[0].field_X;
              var4 = this.field_C[0].field_X;
              if (HoldTheLine.field_D != 0 &&
                this.field_U) {
                var4 = this.field_ob;
              }
            }
          } else {
            if (this.field_U) {
              var4 = this.field_ob;
            }
          }
          if (this.field_ab < 0) {
            var4 = -this.field_ab;
          }
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
          if (!param0) {
            this.a((byte) -128, (in) null, 61, -5, 7);
          }
          if (!this.field_U &&
            var14 <= 10) {
            stackIn_31_0 = -(var14 / 2) + 5;
          } else {
            stackIn_31_0 = 0;
          }
          var15 = stackIn_31_0;
          var16 = oa.a(500, var5, -3248);
          if (!this.field_U &&
            var16 <= 10) {
            stackIn_38_0 = -(var16 / 2) + 5;
          } else {
            stackIn_38_0 = 0;
          }
          var17 = stackIn_38_0;
          var18 = oa.a(3000, var5, -3248);
          if (!this.field_U &&
            var18 <= 10) {
            stackIn_45_0 = -(var18 / 2) + 5;
          } else {
            stackIn_45_0 = 0;
          }
          var19 = stackIn_45_0;
          var20 = oa.a(30000, var5, -3248);
          if (!this.field_U &&
            var20 <= 10) {
            stackIn_52_0 = 5 - var20 / 2;
          } else {
            stackIn_52_0 = 0;
          }
          var21 = stackIn_52_0;
          if (this.field_S ||
            dg.field_c != -1) {
            var17 = 0;
            var19 = 0;
            var21 = 0;
            var15 = 0;
          }
          stackIn_63_0 = (this.field_ab < 0) ? 16760576 : 16777215;
          var22 = stackIn_63_0;
          ek.a(-1, 1024, hk.field_a[27], var3 * 2 + var2_int, var22, 20);
          ek.a(-1, 64 * var21 + 1024, hk.field_a[0 + var8], var2_int, var22, 10);
          ek.a(-1, var19 * 64 + 1024, hk.field_a[0 + var9], var3 + var2_int, var22, 10);
          ek.a(-1, 1024 + var17 * 64, hk.field_a[0 + var10], 8 + (2 * var3 + var2_int), var22, 10);
          ek.a(-1, var15 * 64 + 1024, hk.field_a[var11 + 0], 8 + var2_int + var3 * 3, var22, 10);
          ek.a(-1, 768, hk.field_a[var12 + 0], var2_int + (4 * var3 + 8), var22, 11);
          ek.a(-1, 768, hk.field_a[0 + var13], 8 + ((19 * var3 >> 2) + var2_int), var22, 11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.HB(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_v = null;
          if (param0 != -26919) {
            sg.d(-48);
          }
          field_gb = (String[][]) null;
          field_Y = null;
          field_Z = null;
          field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "sg.IB(" + param0 + ')');
        }
    }

    private final qm a(int param0, int param1, hj param2, int param3, int param4) {
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_62_0 = null;
        qm stackIn_64_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_57_0Lifetime1;
        int stackIn_57_1Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          param1 = param1 + param2.field_u;
          if (param1 < 640 &&
            param1 > -param2.field_s) {
            param0 = param0 + param2.field_x;
            if (param0 < 480 &&
              -param2.field_y < param0) {
              stackIn_17_0 = (param1 <= 0) ? 0 : param1;
              var6_int = stackIn_17_0;
              var7 = param2.field_s + param1;
              if (var7 > 640) {
                var7 = 640;
              }
              stackIn_25_0 = (param0 <= 0) ? 0 : param0;
              var8 = stackIn_25_0;
              var9 = param2.field_y + param0;
              if (var9 > 480) {
                var9 = 480;
              }
              var7 = var7 - var6_int;
              var9 = var9 - var8;
              var10 = var8 * 640 + var6_int;
              if (param3 >= -57) {
                this.field_k = 21;
              }
              var11 = 640 - var7;
              var12 = var6_int - (param1 - (-param0 + var8) * param2.field_s);
              var13 = param2.field_s - var7;
              var14 = this.field_lb.field_m;
              if (param4 >= 1) {
                stackIn_40_0 = 60;
              } else {
                stackIn_40_0 = (param4 <= -1) ? 15 : 63;
              }
              var15 = stackIn_40_0;
              var16 = 0;
              var17 = 0;
              var18 = 0;
              var6_int = var6_int + var7;
              var8 = var8 + var9;
              var19 = param2.field_z;
              var20 = -var9;
              L8: while (true) {
                if (var20 < 0) {
                  stackIn_59_0 = -var7;
                  if (var22 != 0) {
                    break L8;
                  }
                  var21 = stackIn_59_0;
                  while (var21 < 0) {
                    stackIn_57_0 = ~var19[var12];
                    stackIn_57_1 = -1;
                    if (stackIn_57_0 != stackIn_57_1 &&
                      0 == (var15 & var14[var10])) {
                      var16 = var16 + var21;
                      var17 = var17 + var20;
                      var18++;
                    }
                    var12++;
                    var10++;
                    var21++;
                  }
                  var10 = var10 + var11;
                  stackIn_57_0Lifetime1 = var12;
                  stackIn_57_1Lifetime1 = var13;
                  var12 = stackIn_57_0Lifetime1 + stackIn_57_1Lifetime1;
                  var20++;
                  continue L8;
                }
                stackIn_59_0 = var18;
                break;
              }
              if (stackIn_59_0 == 0) {
                stackIn_62_0 = null;
                return (qm) (stackIn_62_0);
              }
              stackIn_64_0 = new qm(var16 / var18 + (var7 + param1), var17 / var18 + var9 + param0);
              return stackIn_64_0;
            }
            stackIn_12_0 = null;
            return (qm) (stackIn_12_0);
          }
          stackIn_6_0 = null;
          return (qm) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_68_0 = var6;
          stackIn_68_1 = new StringBuilder().append("sg.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(int param0, ja param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_kb == null) {
            param1.field_kb = sf.a(param1.field_C.field_d, (byte) 27, param1.field_Eb);
          }
          vb.a(-67, this.field_I);
          if (param0 != 32249) {
            this.a(false);
          }
          pa.a(param1.field_A.field_f - (param1.field_kb.field_y >> 1), param1.field_A.field_h - (param1.field_kb.field_s >> 1), 108, param1.field_kb);
          ug.b(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sg.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted1 = true;
          var2_int = 5;
          if (null == this.field_O) {
            this.field_O = new ah[var2_int];
            var3 = 0;
            while (this.field_O.length > var3) {
              this.field_O[var3] = new ah();
              var3++;
              if (var4 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (var4 != 0)) {
              eb.a(false, this.field_O);
            }
          } else {
            eb.a(false, this.field_O);
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_q == null) {
            this.field_q = new ah[var2_int];
            var3Lifetime1 = 0;
            while (var3Lifetime1 < this.field_q.length) {
              this.field_q[var3Lifetime1] = new ah();
              var3Lifetime1++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var4 != 0)) {
              eb.a(false, this.field_q);
            }
          } else {
            eb.a(false, this.field_q);
          }
          if (this.field_M == null) {
            this.field_M = new ah[var2_int];
            var3Lifetime2 = 0;
            while (this.field_M.length > var3Lifetime2) {
              this.field_M[var3Lifetime2] = new ah();
              var3Lifetime2++;
              if (var4 != 0) {
                return;
              }
            }
            if (var4 != 0) {
              eb.a(false, this.field_M);
            }
          } else {
            eb.a(false, this.field_M);
          }
          this.field_Q = new ah();
          var3Lifetime3 = -112 % ((param0 + 8) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.SA(" + param0 + ')');
        }
    }

    private final void a(wm param0, ja param1, byte param2) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        float var4_floatLifetime1;
        var6 = HoldTheLine.field_D;
        try {
          if (!im.a(param1, param0, 32758)) {
            return;
          }
          if (param2 != 7) {
            this.field_f = false;
          }
          if ((3 & param0.field_J) != 0) {
            if (1 == (3 & param0.field_J)) {
              var4_float = param0.field_w.field_g * param1.field_x + param1.field_t * param0.field_w.field_j;
              if (10.0f < var4_float) {
                param1.field_t = param1.field_t * 0.949999988079071f;
                param1.field_x = param1.field_x * 0.949999988079071f;
              }
              if (var6 == 0) {
                return;
              }
            }
            if ((3 & param0.field_J) != 2) {
              return;
            }
            var4_int = (int)(param1.field_y - (float)param1.field_C.field_K * param1.field_w.field_j);
            var5 = (int)(param1.field_u - (float)param1.field_C.field_K * param1.field_w.field_g);
            if ((param0.field_B * param0.field_B) > ((-param0.field_A.field_h + var4_int) * (-param0.field_A.field_h + var4_int) + (-param0.field_A.field_f + var5) * (var5 - param0.field_A.field_f))) {
              param1.field_Q = 50;
            }
            if (var6 == 0) {
              return;
            }
          }
          var4_floatLifetime1 = param1.field_x * param0.field_w.field_g + param1.field_t * param0.field_w.field_j;
          if (-1.0f <= var4_floatLifetime1) {
            param1.field_t = param1.field_t + param0.field_w.field_j * 2.0f;
            param1.field_x = param1.field_x + 2.0f * param0.field_w.field_g;
            if (var6 == 0) {
              return;
            }
          }
          if (var4_floatLifetime1 < -5.0f) {
            param1.field_x = param1.field_x * 0.949999988079071f;
            param1.field_t = param1.field_t * 0.949999988079071f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("sg.O(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    final void f(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_32_1 = false;
        wm stackIn_70_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        boolean stackIn_95_1 = false;
        boolean stackIn_114_1 = false;
        boolean stackIn_125_1 = false;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        ja stackIn_179_0 = null;
        ja stackIn_201_0 = null;
        Object stackIn_227_0 = null;
        vf stackIn_231_0 = null;
        Object stackIn_240_0 = null;
        int stackIn_249_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_303_1 = 0;
        int stackIn_345_0 = 0;
        int stackIn_345_1 = 0;
        int stackIn_356_0 = 0;
        int stackIn_356_1 = 0;
        boolean stackIn_413_1 = false;
        int stackIn_505_0 = 0;
        int stackIn_505_1 = 0;
        int stackIn_535_0 = 0;
        int stackIn_535_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_178_0;
        ja stackOut_200_0;
        vf stackOut_230_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wm var4 = null;
        int var4_int = 0;
        vf var4_ref = null;
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
        wm var4Lifetime1;
        vf var4_refLifetime1;
        int stackIn_88_0Lifetime1;
        int stackIn_88_1Lifetime1;
        int stackIn_303_0Lifetime1;
        int stackIn_303_1Lifetime1;
        int stackIn_345_0Lifetime1;
        int stackIn_345_1Lifetime1;
        int var5_intLifetime1;
        int var7_intLifetime1;
        int var5_intLifetime2;
        var13 = HoldTheLine.field_D;
        try {
          if (this.field_mb != -1) {
            this.b(31782);
          }
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted5 = true;
          if (5 > this.field_J) {
            while (qh.c(-64)) {
              stackIn_148_0 = aa.field_n;
              stackIn_148_1 = 13;
              if (var13 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
              if (stackIn_148_0 == stackIn_148_1) {
                pg.a(1, (byte) 100, true);
                wm.a(true, false, 1);
                return;
              }
              if (mg.field_c) {
                if (aa.field_n == 1) {
                  stackIn_24_0 = !(kb.field_c);
                  kb.field_c = stackIn_24_0;
                }
                if (2 == aa.field_n) {
                  stackIn_32_1 = !(this.field_kb);
                  this.field_kb = stackIn_32_1;
                }
                if (lk.field_g[82]) {
                  if (aa.field_n == 9) {
                    var4 = (wm) (this.field_cb.b((byte) 110));
                    while (null != var4) {
                      stackIn_88_0 = ~(var4.field_J & 512);
                      stackIn_88_1 = -1;
                      if (stackIn_88_0 != stackIn_88_1) {
                        var4.d(0);
                      }
                      var4 = (wm) (this.field_cb.c((byte) 127));
                    }
                    l.field_b = true;
                  } else {
                    var4_int = -1;
                    if (aa.field_n == 5) {
                      var4_int = 0;
                    }
                    if (aa.field_n == 6) {
                      var4_int = 1;
                    }
                    if (7 == aa.field_n) {
                      var4_int = 2;
                    }
                    if (aa.field_n == 8) {
                      var4_int = 3;
                    }
                    if (-1 != var4_int) {
                      l.field_b = true;
                      var5 = (wm) (this.field_cb.b((byte) 112));
                      while (null != var5) {
                        stackIn_88_0 = 0;
                        stackIn_88_1 = 512 & var5.field_J;
                        if (stackIn_88_0 != stackIn_88_1) {
                          var5.field_J = var5.field_J & -4;
                          var5.field_J = var5.field_J | var4_int;
                          stackIn_70_0 = var5;
                          if (3 != var4_int) {
                            stackIn_71_1 = 2 + var4_int;
                          } else {
                            stackIn_71_1 = 1;
                          }
                          stackIn_70_0.field_E = ci.a(stackIn_71_1, (byte) 17);
                        }
                        var5 = (wm) (this.field_cb.c((byte) -72));
                      }
                    }
                  }
                } else {
                  if (5 == aa.field_n) {
                    this.field_C[0].c(3, 0);
                    l.field_b = true;
                  }
                  if (aa.field_n == 6) {
                    this.field_C[0].c(3, 1);
                    l.field_b = true;
                  }
                  if (aa.field_n == 7) {
                    this.field_C[0].c(3, 2);
                    l.field_b = true;
                  }
                }
                stackIn_88_0Lifetime1 = aa.field_n;
                stackIn_88_1Lifetime1 = 12;
                if (stackIn_88_0Lifetime1 == stackIn_88_1Lifetime1) {
                  stackIn_95_1 = !(this.field_T);
                  this.field_T = stackIn_95_1;
                  l.field_b = true;
                }
                if (aa.field_n == 10) {
                  var2_int = 1;
                  while (var2_int < this.field_h) {
                    this.field_C[var2_int].field_bc = this.field_B;
                    var2_int++;
                  }
                  l.field_b = true;
                }
                if (aa.field_n == 11) {
                  l.field_b = true;
                  this.field_C[0].field_bc = this.field_B;
                }
                if (27 == aa.field_n) {
                  stackIn_114_1 = !(this.field_c);
                  this.field_c = stackIn_114_1;
                  l.field_b = true;
                }
                if (28 == aa.field_n) {
                  l.field_b = true;
                  this.field_C[0].field_W = (int[][]) null;
                }
                if (aa.field_n == 89) {
                  stackIn_125_1 = !(this.field_f);
                  this.field_f = stackIn_125_1;
                  l.field_b = true;
                }
              }
              if (aa.field_n == 84) {
                this.field_o = this.field_o | 1;
              }
              if (aa.field_n == 83) {
                this.field_o = this.field_o | 2;
              }
              if (aa.field_n % 2 != 0) {
                this.field_N = this.field_N + this.field_l * this.field_H;
                this.field_t = this.field_t + this.field_hb;
                this.field_p = this.field_p - 1;
                this.field_g = this.field_g + 1;
                continue;
              }
              this.field_l = this.field_l + 1;
              this.field_t = this.field_t + 1;
              this.field_y = this.field_y - 1;
              this.field_N = this.field_N - this.field_p * this.field_H;
            }
          }
          if (decompiledFrameCompleted5) {
            this.field_bb = this.field_bb + 1;
            if (ih.field_n != null) {
              var4_ref = (vf) (ih.field_n.b((byte) 113));
              while (null != var4_ref) {
                var4_ref.g(-19895);
                var4_ref = (vf) (ih.field_n.c((byte) -43));
                if (var13 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted4) {
              stackIn_148_0 = ~this.field_fb;
              stackIn_148_1 = -1;
            }
          }
          if ((decompiledFrameCompleted4) &&
            (stackIn_148_0 < stackIn_148_1)) {
            fieldTemp$0 = this.field_G + 1;
            this.field_G = this.field_G + 1;
            if (170 <= fieldTemp$0) {
              var2_int = 0;
              while (true) {
                if (this.field_fb - 1 > var2_int) {
                  this.field_V[var2_int] = this.field_V[1 + var2_int];
                  var2_int++;
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.field_G = 0;
                }
                break;
              }
              this.field_fb = this.field_fb - 1;
            }
          }
          if (this.field_j > 0) {
            fieldTemp$1 = this.field_s + 1;
            this.field_s = this.field_s + 1;
            if (50 <= fieldTemp$1) {
              var2_int = 0;
              while (true) {
                if ((-1 + this.field_j) > var2_int) {
                  this.field_ib[var2_int] = this.field_ib[1 + var2_int];
                  var2_int++;
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.field_j = this.field_j - 1;
                  this.field_R = null;
                }
                break;
              }
              this.field_s = 0;
            }
          }
          if (this.field_S) {
            return;
          }
          var2_int = 0;
          L50: while (true) {
            if (this.field_z > var2_int) {
              stackOut_178_0 = this.field_C[var2_int];
              stackIn_240_0 = stackOut_178_0;
              stackIn_179_0 = stackOut_178_0;
              if (var13 == 0) {
                if (stackIn_179_0 != null) {
                  this.field_C[var2_int].g(-1245);
                }
                var2_int++;
                continue;
              }
            } else {
              boolean decompiledFrameCompleted3 = true;
              if (this.field_ab > 0) {
                var2_int = 0;
                while (var2_int < this.field_z) {
                  stackIn_227_0 = null;
                  if (var13 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_227_0 != this.field_C[var2_int] ||
                    var13 != 0) {
                    this.field_C[var2_int].j(0);
                    this.a(this.field_C[var2_int], 0.019999999552965164f * this.field_C[var2_int].field_j, 0, 3.5f * this.field_C[var2_int].field_t * 0.019999999552965164f, this.field_C[var2_int].field_x * 3.5f * 0.019999999552965164f);
                  }
                  var2_int++;
                }
              }
              if (decompiledFrameCompleted3) {
                var2_int = 0;
                while (this.field_z > var2_int) {
                  stackOut_200_0 = this.field_C[var2_int];
                  stackIn_240_0 = stackOut_200_0;
                  stackIn_201_0 = stackOut_200_0;
                  if (var13 != 0) {
                    break L50;
                  }
                  if (stackIn_201_0 != null ||
                    var13 != 0) {
                    var3 = 1 + var2_int;
                    while (this.field_z > var3) {
                      stackIn_227_0 = null;
                      if (stackIn_227_0 != this.field_C[var3]) {
                        this.a(0, this.field_C[var3], this.field_C[var2_int]);
                      }
                      if (this.field_C[var2_int] != null) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (this.field_C[var2_int] != null) {
                      this.field_C[var2_int].b((byte) 56);
                    }
                  }
                  var2_int++;
                }
                if (param0 > -35) {
                  this.a((byte) 52);
                }
                stackIn_227_0 = null;
              }
              if (stackIn_227_0 != ih.field_n) {
                var2_int = 0;
                while (var2_int < this.field_h) {
                  stackOut_230_0 = (vf) (ih.field_n.b((byte) 113));
                  stackIn_240_0 = stackOut_230_0;
                  stackIn_231_0 = stackOut_230_0;
                  if (var13 != 0) {
                    break L50;
                  }
                  var4_refLifetime1 = stackIn_231_0;
                  while (null != var4_refLifetime1) {
                    this.a(var4_refLifetime1, -103, this.field_C[var2_int]);
                    var4_refLifetime1 = (vf) (ih.field_n.c((byte) -73));
                  }
                  var2_int++;
                }
              }
              stackIn_240_0 = this.field_cb.b((byte) 86);
            }
            break;
          }
          var4Lifetime1 = (wm) (stackIn_240_0);
          while (true) {
            if (null != var4Lifetime1) {
              var4Lifetime1.g(0);
              stackIn_266_0 = 8 & var4Lifetime1.field_J;
              if (var13 == 0) {
                stackIn_249_0 = (stackIn_266_0 == 0) ? 0 : 1;
                if ((var4Lifetime1.field_J & 4) == 0) {
                  stackIn_253_1 = 0;
                } else {
                  stackIn_253_1 = 1;
                }
                if ((stackIn_249_0 & stackIn_253_1) != 0) {
                  this.a(-1, var4Lifetime1);
                }
                var4Lifetime1 = (wm) (this.field_cb.c((byte) -95));
                continue;
              }
            } else {
              var4Lifetime1 = (wm) (this.field_d.b((byte) 127));
              while (true) {
                if (null != var4Lifetime1) {
                  var4Lifetime1.g(0);
                  var4Lifetime1 = (wm) (this.field_d.c((byte) 95));
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.field_W.a(-30510, this.field_cb);
                }
                break;
              }
              stackIn_266_0 = 0;
            }
            break;
          }
          var2_int = stackIn_266_0;
          L81: while (true) {
            L82: {
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameCompleted1 = true;
              if (var2_int < 5) {
                this.a(false, this.field_O[var2_int]);
                this.a(false, this.field_M[var2_int]);
                this.a(false, this.field_q[var2_int]);
                var2_int++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                if (this.field_J != 0) {
                  if (this.field_J != 2) {
                    if (this.field_J != 3) {
                      break L82;
                    }
                    if (this.field_B != -1) {
                      var5_int = 0;
                      var2_int = 0;
                      while (var2_int < this.field_h) {
                        stackIn_303_0 = ~this.field_B;
                        stackIn_303_1 = ~this.field_C[var2_int].field_bc;
                        if (var13 != 0) {
                          if (stackIn_303_0 > stackIn_303_1) {
                            stackIn_535_0 = this.field_P;
                            stackIn_535_1 = this.field_C[var2_int].field_bc;
                            break L81;
                          }
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        if (stackIn_303_0 <= stackIn_303_1 &&
                          null != this.field_C[var2_int].field_W) {
                          var5_int = 1;
                        }
                        var2_int++;
                      }
                      if ((decompiledFrameCompleted2) && (!this.field_U &&
                        var5_int == 0)) {
                        this.field_U = true;
                        this.field_ob = this.field_ab;
                        this.a(ee.field_o, (byte) 53);
                        qh.a(0, 1);
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      var2_int = 0;
                      while (true) {
                        stackIn_303_0Lifetime1 = ~var2_int;
                        stackIn_303_1Lifetime1 = ~this.field_h;
                        if (stackIn_303_0Lifetime1 <= stackIn_303_1Lifetime1) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        stackIn_535_0 = this.field_P;
                        stackIn_535_1 = this.field_C[var2_int].field_bc;
                        if (var13 != 0) {
                          break L81;
                        }
                        if (stackIn_535_0 < stackIn_535_1) {
                          this.field_P = this.field_C[var2_int].field_bc;
                          if (~this.field_B == ~this.field_P) {
                            this.a(hc.field_d, (byte) 53);
                          }
                        }
                        var2_int++;
                      }
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    var5_intLifetime2 = 0;
                    var2_int = 0;
                    L95: while (true) {
                      boolean decompiledFrameRemainder2 = true;
                      if (var2_int < this.field_h) {
                        stackIn_345_0 = this.field_C[var2_int].field_Sb;
                        stackIn_345_1 = 5;
                        if (var13 != 0) {
                          if (stackIn_345_0 > stackIn_345_1) {
                            stackIn_356_0 = ~this.field_P;
                            stackIn_356_1 = ~this.field_C[var2_int].field_Sb;
                            break L95;
                          }
                          decompiledFrameRemainder2 = false;
                        }
                        else {
                          if (stackIn_345_0 >= stackIn_345_1) {
                            var5_intLifetime2 = 1;
                            if (var2_int == 0 &&
                              !this.field_E &&
                              kb.a(16616, 0)) {
                              this.a(15, 240, (byte) 118);
                            }
                          }
                          var2_int++;
                          continue;
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        if (!this.field_U &&
                          var5_intLifetime2 != 0) {
                          this.field_ob = this.field_ab;
                          this.field_U = true;
                          this.a(ee.field_o, (byte) 53);
                          if (2 <= this.field_C[0].field_R) {
                            qh.a(0, 2);
                            if (var13 != 0) {
                              qh.a(0, 1);
                            }
                          } else {
                            qh.a(0, 1);
                          }
                        }
                        var2_int = 0;
                        while (true) {
                          stackIn_345_0Lifetime1 = this.field_h;
                          stackIn_345_1Lifetime1 = var2_int;
                          if (stackIn_345_0Lifetime1 <= stackIn_345_1Lifetime1) {
                            break;
                          }
                          stackIn_356_0 = ~this.field_P;
                          stackIn_356_1 = ~this.field_C[var2_int].field_Sb;
                          if (var13 != 0) {
                            break L95;
                          }
                          if (stackIn_356_0 > stackIn_356_1) {
                            this.field_P = this.field_C[var2_int].field_Sb;
                          }
                          var2_int++;
                        }
                      }
                      stackIn_356_0 = this.field_e;
                      stackIn_356_1 = this.field_P;
                      break;
                    }
                    if (stackIn_356_0 < stackIn_356_1) {
                      boolean decompiledSharedTail0 = !(kb.a(16616, 0));
                      if (!decompiledSharedTail0) {
                        var6 = 25;
                        while (true) {
                          if (var6 <= 100) {
                            var7_int = 5 - var6;
                            stackIn_535_0 = this.field_e;
                            stackIn_535_1 = var7_int;
                            if (var13 != 0) {
                              break L81;
                            }
                            if (stackIn_535_0 < stackIn_535_1 &&
                              this.field_P >= var7_int) {
                              this.a(sd.a(ag.field_p, new String[]{Integer.toString(var6)}, true), (byte) 53);
                            } else {
                              var6 += 25;
                              continue;
                            }
                          }
                          break;
                        }
                        decompiledSharedTail0 = (var13 != 0);
                      }
                      if (decompiledSharedTail0) {
                        if (this.field_P == 3) {
                          this.a(ij.field_n, (byte) 53);
                        }
                        if (4 == this.field_P) {
                          this.a(pd.field_g, (byte) 53);
                        }
                      }
                      this.field_e = this.field_P;
                    }
                    if (var13 == 0) {
                      break L82;
                    }
                  }
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var5_intLifetime1 = 0;
                var2_int = 0;
                L113: while (true) {
                  if (var2_int < this.field_h) {
                    stackIn_505_0 = ~this.field_C[var2_int].field_bc;
                    stackIn_505_1 = ~this.field_B;
                    if (var13 == 0) {
                      if (stackIn_505_0 >= stackIn_505_1 &&
                        this.field_C[var2_int].field_W != null) {
                        var5_intLifetime1 = 1;
                      }
                      var2_int++;
                      continue;
                    }
                  } else {
                    if (!this.field_U &&
                      var5_intLifetime1 == 0) {
                      this.field_U = true;
                      this.field_ob = this.field_ab;
                      this.a(ee.field_o, (byte) 53);
                      if (!this.field_E) {
                        stackIn_413_1 = (this.field_C[0].field_R == 0);
                        this.field_b = stackIn_413_1;
                        if (this.field_b) {
                          if (this.field_rb[11] == 1) {
                            this.a(11, 244, (byte) -60);
                          }
                          if (this.field_rb[8] == 1) {
                            this.a(8, 247, (byte) -38);
                          }
                          if (1 == this.field_rb[9]) {
                            this.a(9, 246, (byte) 99);
                          }
                          if (this.field_rb[10] == 1) {
                            this.a(10, 245, (byte) 99);
                          }
                          if (this.field_rb[12] == 1) {
                            this.a(12, 243, (byte) 100);
                          }
                        }
                        if (this.field_C[0].field_R < 2) {
                          qh.a(0, 1);
                          if (var13 != 0) {
                            qh.a(0, 2);
                          }
                        } else {
                          qh.a(0, 2);
                        }
                        if ((7 == mi.field_d) &&
                          (!(2 <= this.field_C[0].field_R)) &&
                          (~(pc.field_l[cf.field_w] - 1) == ~vg.field_P)) {
                          var6 = hn.field_y + this.field_ob;
                          if (cf.field_w == 0 &&
                            22500 > var6) {
                            this.a(2, 253, (byte) -119);
                          }
                          if (cf.field_w == 1 &&
                            30500 > var6) {
                            this.a(4, 251, (byte) 119);
                          }
                          if (cf.field_w == 2 &&
                            var6 < 29000) {
                            this.a(3, 252, (byte) -34);
                          }
                          if (cf.field_w == 3 &&
                            var6 < 34000) {
                            this.a(5, 250, (byte) -105);
                          }
                          tg.a(cf.field_w, 5, var6);
                          var7_intLifetime1 = 1;
                          var8 = 0;
                          var2_int = 0;
                          while (true) {
                            if (4 > var2_int) {
                              stackIn_505_0 = d.field_c[var2_int];
                              stackIn_505_1 = -1;
                              if (var13 != 0) {
                                break L113;
                              }
                              if (stackIn_505_0 == stackIn_505_1) {
                                var7_intLifetime1 = 0;
                              } else {
                                var8 = var8 + d.field_c[var2_int];
                                var2_int++;
                                continue;
                              }
                            }
                            break;
                          }
                          if (var7_intLifetime1 != 0) {
                            this.a(0, 255, (byte) -94);
                            if (var8 < 109500) {
                              this.a(1, 254, (byte) -83);
                            }
                          }
                          if (var13 != 0) {
                            if (this.field_C[0].field_R == 0 ||
                              this.field_C[1].field_R == 0) {
                              qh.a(0, 1);
                              qh.a(0, 2);
                            } else {
                              qh.a(0, 2);
                            }
                          }
                        }
                      } else {
                        if (this.field_C[0].field_R == 0 ||
                          this.field_C[1].field_R == 0) {
                          qh.a(0, 1);
                          if (var13 != 0) {
                            qh.a(0, 2);
                          }
                        } else {
                          qh.a(0, 2);
                        }
                      }
                    }
                    var2_int = 0;
                    while (true) {
                      stackIn_505_0 = ~var2_int;
                      stackIn_505_1 = ~this.field_h;
                      if (stackIn_505_0 <= stackIn_505_1) {
                        break L82;
                      }
                      stackIn_535_0 = this.field_P;
                      stackIn_535_1 = this.field_C[var2_int].field_bc;
                      if (var13 != 0) {
                        break L81;
                      }
                      if (stackIn_535_0 < stackIn_535_1) {
                        this.field_P = this.field_C[var2_int].field_bc;
                        if (~this.field_P == ~this.field_B) {
                          this.a(hc.field_d, (byte) 53);
                        }
                      }
                      var2_int++;
                    }
                  }
                  break;
                }
                while (stackIn_505_0 > stackIn_505_1) {
                  stackIn_535_0 = this.field_P;
                  stackIn_535_1 = this.field_C[var2_int].field_bc;
                  if (var13 != 0) {
                    break L81;
                  }
                  if (stackIn_535_0 < stackIn_535_1) {
                    this.field_P = this.field_C[var2_int].field_bc;
                    if (~this.field_P == ~this.field_B) {
                      this.a(hc.field_d, (byte) 53);
                    }
                  }
                  var2_int++;
                  stackIn_505_0 = ~var2_int;
                  stackIn_505_1 = ~this.field_h;
                }
              }
            }
            if (this.field_U &&
              -this.field_ob + this.field_ab >= 150 &&
              !this.field_T &&
              this.field_J != 3 &&
              this.field_fb == 0) {
              qn.a(7, false, false);
            }
            stackIn_535_0 = this.field_r;
            stackIn_535_1 = 3;
            break;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_535_0 == stackIn_535_1 &&
            this.field_J != 2) {
            var2_int = 0;
            do {
              if (this.field_w.length <= var2_int) {
                var2_int = 0;
                break;
              }
              this.field_eb[var2_int] = 0;
              var2_int++;
            } while (var13 == 0);
            while (var2_int < this.field_h) {
              var5_ref = this.field_C[var2_int];
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != var5_ref.field_W ||
                var13 != 0) {
                var6 = var5_ref.field_Eb;
                var7 = 0.0f;
                var3 = 0;
                while (var3 < (int)var5_ref.field_Ib) {
                  var7 = var7 + this.field_sb[var3].f(50);
                  var3++;
                }
                if ((int)var5_ref.field_Ib != this.field_sb.length) {
                  var7 = var7 + this.field_sb[(int)var5_ref.field_Ib].f(50) * (var5_ref.field_Ib - (float)(int)var5_ref.field_Ib);
                }
                var8 = (int)(var7 / this.field_A);
                var3 = 1;
                while (4 > var3) {
                  var9 = (var3 + var8) % this.field_w.length;
                  var10 = (float)(-this.field_x[var9] + var5_ref.field_A.field_h);
                  var11 = (float)(var5_ref.field_A.field_f - this.field_u[var9]);
                  var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
                  var10 = var10 / var12;
                  var11 = var11 / var12;
                  this.field_eb[var9] = this.c(this.field_eb[var9], 6293, var6);
                  var3++;
                }
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            decompiledFrameRemainder0 = (!(kb.a(16616, 0)) ||
              2 != this.field_J);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_ab == -100) {
              this.a(cj.field_L, (byte) 53);
            }
            if (-50 == this.field_ab) {
              this.a(io.field_a, (byte) 53);
            }
            decompiledFrameRemainder1 = (this.field_ab == 0);
            if (decompiledFrameRemainder1) {
              this.a(il.field_b, (byte) 53);
              decompiledFrameRemainder1 = (var13 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.field_ab == -100) {
              this.a(vj.field_n, (byte) 53);
            }
            if (this.field_ab == 0) {
              this.a(il.field_b, (byte) 53);
            }
          }
          fieldTemp$2 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$2 > 0 &&
            !this.field_U) {
            this.field_t = this.field_t + this.field_hb;
            this.field_N = this.field_N - this.field_p * this.field_l;
            this.field_H = this.field_H + 1;
            this.field_y = this.field_y - (hn.field_y + (this.field_ab + this.field_g));
            this.field_hb = this.field_hb - 1;
          }
          if (this.field_ab <= -50 &&
            this.field_r == 3) {
            var5_ref2 = (na) (this.field_Q.b((byte) 104));
            while (null != var5_ref2) {
              if (var13 != 0) {
                return;
              }
              if (!var5_ref2.field_j) {
                if (!(kj.b(2, 400) >= this.field_ab + 150)) {
                  var5_ref2.field_j = true;
                }
              } else {
                if (kj.b(2, 400) < (-50 - this.field_ab)) {
                  var5_ref2.field_j = false;
                }
              }
              var5_ref2 = (na) (this.field_Q.c((byte) 96));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "sg.B(" + param0 + ')');
        }
    }

    private final void d(wm param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          param0.d(0);
          rd.a(u.field_O.field_q, param0.field_A, -124, u.field_O);
          kn.a(0, param0.field_A.field_f, 0, 128, param1 - 28976, -1, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 32, 400);
          kn.a(0, param0.field_A.field_f, 0, 128, param1 ^ 28976, -4, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 128, 60);
          kn.a(0, param0.field_A.field_f, 0, 128, param1 - 28976, -8, param0.field_A.field_h, 3, this.field_M, 16777215, 0, 255, 20);
          var3_int = this.a(param1 ^ -2407, 4, 250, param0, 32, 200000.0f);
          if (param1 != 28977) {
            this.b((wm) null, 63);
          }
          var4 = param0.field_J & 3;
          if (0 == var4 &&
            !this.field_E &&
            var3_int >= 3) {
            this.a(13, 242, (byte) 112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("sg.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, qm param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = this.a(param0, param2.field_h, -3, param2.field_f);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("sg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(String param0, float param1, int param2, ul param3, String param4) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          var6_int = param3.field_f;
          var7 = param3.field_c;
          var8 = param3.field_d;
          if (var8 == -1) {
            var8 = 480;
          }
          var9 = param3.field_g;
          if (var9 == -1) {
            var9 = 13 + (nm.field_c.d(param0, var8) * 20 + 18 * HoldTheLine.field_F.d(param4, var8));
          }
          if (-1 == var6_int) {
            var6_int = -var8 + 640 >> 1;
          }
          if (-1 == var7) {
            var7 = 100;
          }
          var10 = param3.field_b;
          switch ((var12 == 0
            || var10 == 1
            || var10 == 3
            ) ? var10 : -1) {
            case 0:
              var6_int = (int)((float)var6_int - param1 * (float)(var6_int + (var8 + 40)));
              if (var12 == 0) {
                break;
              }
            case 1:
              var6_int = (int)((float)var6_int + param1 * (float)(-var6_int + 680));
              if (var12 == 0) {
                break;
              }
            case 2:
              var7 = (int)((float)var7 - param1 * (float)(var9 + var7 + 40));
              if (var12 == 0) {
                break;
              }
            case 3:
              var7 = (int)((float)var7 + param1 * (float)(-var7 + 520));
            default:
              break;
          }
          mk.a(var8, var9, var7, (byte) -42, var6_int);
          var10 = var7;
          var11 = nm.field_c.d(param0, var8);
          nm.field_c.a(param0, var6_int, var10, var8, 20 * var11, 0, -1, 1, 0, 20);
          var10 = var10 + (5 + 20 * var11);
          HoldTheLine.field_F.a(param4, var6_int, var10, var8, var9, 0, -1, 1, 0, 18);
          if (param2 != -11240) {
            this.field_o = 33;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_40_0 = var6;
          stackIn_40_1 = new StringBuilder().append("sg.UA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1) {
        qm discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        jk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        try {
          param1++;
          if (param0) {
            discarded$0 = this.a((ja) null, 102);
          }
          var3 = (jk) (this.field_O[param1].b((byte) 118));
          do {
            if (var3 == null) {
              var3 = (jk) (this.field_M[param1].b((byte) 99));
              break;
            }
            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
            var3 = (jk) (this.field_O[param1].c((byte) -23));
          } while (var4 == 0);
          do {
            if (null == var3) {
              var3 = (jk) (this.field_q[param1].b((byte) 87));
              break;
            }
            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
            var3 = (jk) (this.field_M[param1].c((byte) 88));
          } while (var4 == 0);
          do {
            if (null == var3) {
              if (this.field_r != 3) {
                return;
              }
              vb.a(-76, this.field_I);
              break;
            }
            tc.e(-var3.field_u + var3.field_t >> 10, var3.field_k >> 10, var3.field_u + var3.field_t >> 10, var3.field_k >> 10, var3.field_o, var3.field_q >> 2);
            tc.e(var3.field_t >> 10, var3.field_k - var3.field_u >> 10, var3.field_t >> 10, var3.field_k + var3.field_u >> 10, var3.field_o, var3.field_q >> 2);
            var3 = (jk) (this.field_q[param1].c((byte) -44));
          } while (var4 == 0);
          var3 = (jk) (this.field_O[param1].b((byte) 94));
          do {
            if (null == var3) {
              var3 = (jk) (this.field_M[param1].b((byte) 120));
              break;
            }
            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, 16777215, var3.field_q >> 2);
            var3 = (jk) (this.field_O[param1].c((byte) -68));
          } while (var4 == 0);
          do {
            if (var3 == null) {
              var3 = (jk) (this.field_q[param1].b((byte) 85));
              break;
            }
            tc.g(var3.field_t >> 10, var3.field_k >> 10, var3.field_u >> 10, 16777215, var3.field_q >> 2);
            var3 = (jk) (this.field_M[param1].c((byte) -84));
          } while (var4 == 0);
          while (var3 != null) {
            tc.e(var3.field_t - var3.field_u >> 10, var3.field_k >> 10, var3.field_t + var3.field_u >> 10, var3.field_k >> 10, 16777215, var3.field_q >> 2);
            tc.e(var3.field_t >> 10, -var3.field_u + var3.field_k >> 10, var3.field_t >> 10, var3.field_u + var3.field_k >> 10, 16777215, var3.field_q >> 2);
            var3 = (jk) (this.field_q[param1].c((byte) -32));
            if (var4 != 0) {
              return;
            }
          }
          ug.b(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3_ref), "sg.MA(" + param0 + ',' + param1 + ')');
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
        int var4_int = 0;
        int var1;
        int var2;
        wm var3;
        na var4;
        vf var4_ref;
        int var1Lifetime1;
        int var2Lifetime1;
        int var1Lifetime1Lifetime1;
        int var1Lifetime1Lifetime2;
        int var1Lifetime1Lifetime3;
        wm var3Lifetime1;
        wm var3Lifetime2;
        wm var3Lifetime3;
        if (this.field_r == 3) {
          if (!kb.a(16616, 0)) {
            var1 = 307200;
            while (var1 > 0) {
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
            }
          } else {
            var2 = this.field_F * 65793;
            var1 = 307200;
            while (var1 > 0) {
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
            }
          }
        }
        this.e((byte) 106);
        for (var2Lifetime1 = -1; var2Lifetime1 <= 3; var2Lifetime1++) {
          var3 = (wm) (this.field_d.b((byte) 102));
          while (var3 != null) {
            if (var3.field_q == var2Lifetime1) {
              this.c(var3, -127);
            }
            var3 = (wm) (this.field_d.c((byte) -126));
          }
          var3Lifetime1 = (wm) (this.field_d.b((byte) 105));
          while (var3Lifetime1 != null) {
            if (var3Lifetime1.field_q == var2Lifetime1) {
              this.a(var3Lifetime1, 115);
            }
            var3Lifetime1 = (wm) (this.field_d.c((byte) -59));
          }
          if (this.field_r == 3 &&
            this.field_J != 2) {
            for (var1Lifetime1 = 0; var1Lifetime1 < this.field_w.length; var1Lifetime1++) {
              if (this.field_sb[this.field_w[var1Lifetime1]].field_k == var2Lifetime1 &&
                this.field_eb[var1Lifetime1] != 0) {
                tc.f(this.field_x[var1Lifetime1] - 1, this.field_u[var1Lifetime1] - 1, 3, 3, this.field_eb[var1Lifetime1]);
                ok.a(32381);
                this.field_I.f();
                tc.f(this.field_x[var1Lifetime1] - 1, this.field_u[var1Lifetime1] - 1, 3, 3, 16777215);
                ug.b(-1);
              }
            }
          }
          var4 = (na) (this.field_Q.b((byte) 94));
          while (var4 != null) {
            if (var4.field_j &&
              var4.field_m == var2Lifetime1) {
              this.a(-28, var4);
            }
            var4 = (na) (this.field_Q.c((byte) -125));
          }
          var3Lifetime2 = (wm) (this.field_cb.b((byte) 114));
          while (var3Lifetime2 != null) {
            if (var3Lifetime2.field_q == var2Lifetime1) {
              this.b(var3Lifetime2, 8192);
            }
            var3Lifetime2 = (wm) (this.field_cb.c((byte) 127));
          }
          for (var1Lifetime1Lifetime1 = 0; var1Lifetime1Lifetime1 < this.field_h; var1Lifetime1Lifetime1++) {
            if (this.field_C[var1Lifetime1Lifetime1] != null &&
              this.field_C[var1Lifetime1Lifetime1].field_q == var2Lifetime1) {
              for (var4_int = 0; var4_int < 8; var4_int++) {
                this.a(var4_int, -403, this.field_C[var1Lifetime1Lifetime1]);
              }
            }
          }
          if (ih.field_n != null &&
            var2Lifetime1 == 0) {
            var4_ref = (vf) (ih.field_n.b((byte) 105));
            while (var4_ref != null) {
              var4_ref.d((byte) -99);
              var4_ref = (vf) (ih.field_n.c((byte) -59));
            }
          }
          var3Lifetime3 = (wm) (this.field_cb.b((byte) 126));
          while (var3Lifetime3 != null) {
            if (var3Lifetime3.field_q == var2Lifetime1) {
              this.a(var3Lifetime3, 122);
            }
            var3Lifetime3 = (wm) (this.field_cb.c((byte) -108));
          }
          for (var1Lifetime1Lifetime2 = 0; var1Lifetime1Lifetime2 < this.field_z; var1Lifetime1Lifetime2++) {
            if (this.field_C[var1Lifetime1Lifetime2] != null &&
              this.field_C[var1Lifetime1Lifetime2].field_q == var2Lifetime1) {
              this.a(this.field_C[var1Lifetime1Lifetime2], (byte) 101);
            }
          }
          if (this.field_r == 3) {
            for (var1Lifetime1Lifetime3 = 0; var1Lifetime1Lifetime3 < this.field_h; var1Lifetime1Lifetime3++) {
              if (this.field_C[var1Lifetime1Lifetime3] != null &&
                this.field_C[var1Lifetime1Lifetime3].field_q == var2Lifetime1) {
                this.a(64, this.field_C[var1Lifetime1Lifetime3]);
              }
            }
          }
          this.a(false, var2Lifetime1);
        }
        if (kb.a(16616, 0)) {
          this.a((long)this.field_bb, true);
        }
        if (this.field_r == 3 &&
          !this.field_c) {
          this.b((byte) -96);
        }
        if (this.field_J < 5) {
          this.c(-16);
        }
        if (this.field_mb != -1) {
          this.a(-3);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            0 <= param3 &&
            param1 < 640 &&
            param3 < 480) {
            var5_int = this.field_lb.field_m[param3 * 640 + param1] & 85;
            if (param0 >= 1) {
              var5_int = var5_int & 60;
            }
            if (param0 <= -1) {
              var5_int = var5_int & 15;
            }
            return (var5_int != 0);
          }
          if (param2 != -3) {
            this.b((String) null, (byte) -127);
          }
          stackIn_25_0 = b.a(false, param1, param3, this.field_jb);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "sg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void b(boolean param0) {
        if (!kb.b(92)) {
          return;
        }
        try {
          pe.a(4, param0, (byte) 35);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sg.NB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        float dupTemp$0 = 0.0f;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
        var17 = HoldTheLine.field_D;
        try {
          var4_float = this.field_C[0].field_vb;
          var5 = ce.a(-1, this.field_sb) / (float)(param1 + 1);
          var6 = (int)var4_float;
          var7 = this.field_sb[var6].f(50);
          var8 = (-var4_float + (float)(var6 + 1)) * var7;
          var9 = var5;
          if (param0 != 24936) {
            this.a(33, 114, (ja) null);
          }
          var10 = 0;
          L1: while (true) {
            stackIn_6_0 = ~var10;
            stackIn_6_1 = ~param1;
            if (stackIn_6_0 > stackIn_6_1) {
              while (true) {
                if (var17 != 0) {
                  return;
                }
                if (var9 > var8) {
                  var6++;
                  stackIn_6_0 = ~var6;
                  stackIn_6_1 = ~this.field_sb.length;
                  if (stackIn_6_0 == stackIn_6_1) {
                    var6 = 0;
                  }
                  var9 = var9 - var8;
                  dupTemp$0 = this.field_sb[var6].f(50);
                  var7 = dupTemp$0;
                  var8 = dupTemp$0;
                  continue;
                }
                break;
              }
              var8 = var8 - var9;
              var9 = var5;
              var11 = -(var8 / var7) + 1.0f;
              var12 = this.field_sb[var6].a(false, var11);
              var13 = this.field_sb[var6].a((byte) 125, var11);
              var14 = new qm(var12);
              var15 = -1;
              while (var15 <= 1) {
                var14.field_f = var12.field_f - (int)((float)(30 * var15) * var13.field_j);
                var14.field_h = (int)(var13.field_g * (float)(var15 * 30)) + var12.field_h;
                stackIn_6_0 = 0;
                stackIn_6_1 = ~param2;
                if (stackIn_6_0 != stackIn_6_1) {
                  if (param2 == 3) {
                    stackIn_25_0 = 0;
                  } else {
                    stackIn_25_0 = param2 + 1;
                  }
                } else {
                  stackIn_25_0 = 3 & var10 + (var15 + 1);
                }
                var16 = stackIn_25_0;
                this.field_cb.a((byte) -64, new wm(var14, var16 + 1, -1));
                var15++;
              }
              var10++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ja param0, byte param1) {
        qm discarded$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_1 = 0;
        float stackIn_48_0 = 0.0f;
        boolean stackIn_51_0 = false;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_50_0;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        var11 = HoldTheLine.field_D;
        try {
          if (this.field_ab < 0 &&
            null != param0.field_W) {
            stackIn_8_0 = 1;
          } else {
            stackIn_8_0 = 0;
          }
          var3_int = stackIn_8_0;
          stackIn_17_0 = var3_int;
          if (this.field_J == 2 &&
            this.field_ab > 0 &&
            param0.field_L > 0) {
            stackIn_18_1 = 1;
          } else {
            stackIn_18_1 = 0;
          }
          var3_intLifetime1 = stackIn_17_0 | stackIn_18_1;
          stackIn_30_0 = var3_intLifetime1;
          if (this.field_ab > 0 &&
            null != param0.field_W &&
            param0.field_tb > 50 &&
            param0.field_O == 0) {
            stackIn_31_1 = 1;
          } else {
            stackIn_31_1 = 0;
          }
          var3_intLifetime2 = stackIn_30_0 | stackIn_31_1;
          stackIn_34_0 = var3_intLifetime2;
          if (this.field_bb / 10 % 2 != 0) {
            stackIn_35_1 = 0;
          } else {
            stackIn_35_1 = 1;
          }
          boolean decompiledFrameCompleted0 = true;
          var3_intLifetime3 = stackIn_34_0 & stackIn_35_1;
          var3_intLifetime3 = var3_intLifetime3 & 1;
          if (param0.field_rc != 2) {
            var4 = param0.field_C.field_v.a(param0.field_r, 27788);
            if (2 == this.field_J) {
              var5 = (param0.field_L << 12) / 150 + 4096;
              if (var5 != 4096) {
                ok.a(32381);
                var6_int = var4.field_s * var5 >> 12;
                var7_int = var4.field_y * var5 >> 12;
                var8_ref_hj = new hj(var6_int, var7_int);
                var8_ref_hj.f();
                var4.a(0, 0, var6_int, var7_int);
                var4 = var8_ref_hj;
                ug.b(-1);
              }
            }
            if (var3_intLifetime3 == 0) {
              stackIn_48_0 = (!this.field_pb) ? 0.5f : 1.0f;
              var5_float = stackIn_48_0;
              var6 = (na) (this.field_Q.b((byte) 87));
              while (null != var6) {
                stackOut_50_0 = var6.field_j;
                stackIn_68_0 = stackOut_50_0 ? 1 : 0;
                stackIn_51_0 = stackOut_50_0;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_51_0) {
                  var7 = (float)(param0.field_A.field_h - var6.field_l);
                  var8 = (float)(param0.field_A.field_f - var6.field_n);
                  var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
                  var7 = var7 / var9;
                  var8 = var8 / var9;
                  var10 = -(var9 / (float)(2 * var6.field_i)) + 1.0f;
                  if (0.0f < var10) {
                    var5_float = var5_float + var10;
                  }
                }
                var6 = (na) (this.field_Q.c((byte) 94));
              }
              if (decompiledFrameCompleted0) {
                gh.a(var4, param0.field_A.field_h, 0, param0.field_Eb, var5_float, param0.field_A.field_f);
              }
            }
            if (decompiledFrameCompleted0) {
              if (var3_intLifetime3 != 0 ||
                var11 != 0) {
                ch.a(param0.field_Eb, param0.field_A.field_f, var4, param0.field_A.field_h, (byte) 98);
              }
              if (var11 != 0) {
                var4 = param0.field_C.field_h.a(param0.field_r, 27788);
                var5 = (30000 - param0.field_L) * 256 / 180;
                if (256 <= var5) {
                  var4.a(-(var4.field_s >> 1) + param0.field_A.field_h, -(var4.field_y >> 1) + param0.field_A.field_f);
                  var4.d(-(var4.field_s >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var4.field_y >> 1), var5);
                } else {
                  var4.d(-(var4.field_s >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var4.field_y >> 1), var5);
                }
              }
            }
          } else {
            var4 = param0.field_C.field_h.a(param0.field_r, 27788);
            var5 = (30000 - param0.field_L) * 256 / 180;
            boolean decompiledSharedTail0 = !(256 <= var5);
            if (!decompiledSharedTail0) {
              var4.a(-(var4.field_s >> 1) + param0.field_A.field_h, -(var4.field_y >> 1) + param0.field_A.field_f);
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              var4.d(-(var4.field_s >> 1) + param0.field_A.field_h, param0.field_A.field_f - (var4.field_y >> 1), var5);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_68_0 = param1;
          }
          if (stackIn_68_0 < 96) {
            discarded$0 = this.a(-17, 85, (hj) null, -39, 48);
          }
          if (this.field_kb &&
            param0.field_Ib != -1.0f) {
            var4_ref = le.a(this.field_sb, param0.field_Ib, (byte) -112);
            tc.d(var4_ref.field_h, var4_ref.field_f, 5, param0.field_Eb);
          }
          if (param0.field_J != 2) {
            if (param0.field_Fb[2] < 2) {
              if (param0.field_Fb[2] == 1) {
                tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 255, 32);
                if (var11 != 0) {
                  tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 8355839, 128);
                  tc.g(param0.field_A.field_h, param0.field_A.field_f, (int)((float)param0.field_C.field_d * 1.2999999523162842f), 8355839, 128);
                }
              }
            } else {
              tc.g(param0.field_A.field_h, param0.field_A.field_f, param0.field_C.field_d, 8355839, 128);
              if (var11 != 0) {
                tc.g(param0.field_A.field_h, param0.field_A.field_f, (int)((float)param0.field_C.field_d * 1.2999999523162842f), 8355839, 128);
              }
            }
          } else {
            tc.g(param0.field_A.field_h, param0.field_A.field_f, (int)((float)param0.field_C.field_d * 1.2999999523162842f), 8355839, 128);
          }
          if (this.field_r == 3) {
            this.b(32249, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("sg.S(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, wm param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        in var3 = null;
        RuntimeException var3_ref = null;
        qm var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        try {
          if (param0 != -1) {
            field_Z = (String) null;
          }
          if (!this.a(param1.field_q, param1.field_A.field_f, true, param1.field_A.field_h)) {
            var3 = new in(0.0f, 0.0f);
            var4 = dd.a(0, var3, this.field_nb, param1.field_q, param1.field_A);
            if ((8192 & param1.field_J) != 0) {
              this.d(param1, param0 ^ -28978);
              if ((3 & param1.field_J) != 0) {
                return;
              }
              this.field_o = this.field_o | 16;
              if (HoldTheLine.field_D == 0) {
                return;
              }
            }
            param1.field_y = (float)var4.field_h;
            param1.field_u = (float)var4.field_f;
            var5 = param1.field_x * var3.field_g + param1.field_t * var3.field_j;
            var6 = -1.7999999523162842f * var5;
            param1.field_t = param1.field_t + var3.field_j * var6;
            param1.field_x = param1.field_x + var6 * var3.field_g;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("sg.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(vk param0, int[] param1, int param2) throws IOException {
        qm discarded$0 = null;
        int incrementValue$3 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_23_1 = 0;
        dd stackIn_34_0;
        dd stackIn_34_1;
        qm stackIn_34_2;
        qm stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_34_6;
        int stackIn_34_7;
        int stackIn_34_8;
        int stackIn_34_9;
        int stackIn_34_10;
        int stackIn_34_11;
        int stackIn_34_12;
        int stackIn_34_13;
        int stackIn_34_14;
        dd stackIn_35_0 = null;
        dd stackIn_35_1 = null;
        boolean stackIn_35_15 = false;
        boolean stackIn_38_16 = false;
        boolean stackIn_41_17 = false;
        boolean stackIn_44_18 = false;
        boolean stackIn_47_19 = false;
        boolean stackIn_50_20 = false;
        hn stackIn_53_0;
        hn stackIn_53_1;
        qm stackIn_53_2;
        int stackIn_53_3;
        float stackIn_53_4;
        float stackIn_53_5;
        int stackIn_53_6;
        int stackIn_53_7;
        int stackIn_53_8;
        int stackIn_53_9;
        int stackIn_53_10;
        Object stackIn_53_11;
        Object stackIn_53_12;
        qm stackIn_53_13;
        hn stackIn_54_0 = null;
        hn stackIn_54_1 = null;
        boolean stackIn_54_14 = false;
        boolean stackIn_57_15 = false;
        boolean stackIn_60_16 = false;
        boolean stackIn_63_17 = false;
        boolean stackIn_66_18 = false;
        boolean stackIn_69_19 = false;
        dd stackIn_74_0;
        dd stackIn_74_1;
        qm stackIn_74_2;
        qm stackIn_74_3;
        int stackIn_74_4;
        int stackIn_74_5;
        int stackIn_74_6;
        int stackIn_74_7;
        int stackIn_74_8;
        int stackIn_74_9;
        int stackIn_74_10;
        int stackIn_74_11;
        int stackIn_74_12;
        int stackIn_74_13;
        int stackIn_74_14;
        dd stackIn_75_0 = null;
        dd stackIn_75_1 = null;
        boolean stackIn_75_15 = false;
        boolean stackIn_78_16 = false;
        boolean stackIn_81_17 = false;
        boolean stackIn_84_18 = false;
        boolean stackIn_87_19 = false;
        boolean stackIn_90_20 = false;
        float stackIn_94_0 = 0.0f;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        float stackIn_135_0 = 0.0f;
        Object stackIn_139_0 = null;
        wd stackIn_162_0 = null;
        int stackIn_163_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        ja[] stackIn_189_0;
        int stackIn_189_1;
        ja stackIn_189_2;
        ja stackIn_189_3;
        int stackIn_189_4;
        int stackIn_189_5;
        int stackIn_189_6;
        float stackIn_189_7;
        float stackIn_189_8;
        ja stackIn_190_2 = null;
        ja stackIn_190_3 = null;
        wd stackIn_190_9 = null;
        ja[] stackIn_203_0;
        int stackIn_203_1;
        ja stackIn_203_2;
        ja stackIn_203_3;
        int stackIn_203_4;
        int stackIn_203_5;
        int stackIn_203_6;
        float stackIn_203_7;
        float stackIn_203_8;
        ja stackIn_204_2 = null;
        ja stackIn_204_3 = null;
        wd stackIn_204_9 = null;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_228_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_277_0 = 0;
        RuntimeException stackIn_295_0 = null;
        StringBuilder stackIn_295_1 = null;
        String stackIn_296_2 = null;
        StringBuilder stackIn_299_1 = null;
        String stackIn_300_2 = null;
        RuntimeException decompiledCaughtException = null;
        th var4 = null;
        RuntimeException var4_ref = null;
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
        qm var24 = null;
        dd var24_ref = null;
        int var25_int = 0;
        hn var25 = null;
        int[] var26 = null;
        hn var26_ref = null;
        float var27 = 0.0f;
        float var28_float = 0.0f;
        int var28 = 0;
        qm var29_ref_qm = null;
        int var29 = 0;
        hn var30_ref_hn = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        float var36 = 0.0f;
        float var37 = 0.0f;
        Object var38 = null;
        int var39_int = 0;
        Object var39 = null;
        int var40 = 0;
        dd var40_ref_dd = null;
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
        dn var46 = null;
        float var46_float = 0.0f;
        wm var46_ref = null;
        float var47_float = 0.0f;
        int var47 = 0;
        int var48 = 0;
        na var49 = null;
        int var50 = 0;
        dd stackIn_35_0Lifetime1;
        dd stackIn_35_0Lifetime2;
        dd stackIn_35_0Lifetime3;
        dd stackIn_35_0Lifetime4;
        dd stackIn_35_0Lifetime5;
        dd stackIn_35_1Lifetime1;
        dd stackIn_35_1Lifetime2;
        dd stackIn_35_1Lifetime3;
        dd stackIn_35_1Lifetime4;
        dd stackIn_35_1Lifetime5;
        hn stackIn_54_0Lifetime1;
        hn stackIn_54_0Lifetime2;
        hn stackIn_54_0Lifetime3;
        hn stackIn_54_0Lifetime4;
        hn stackIn_54_0Lifetime5;
        hn stackIn_54_1Lifetime1;
        hn stackIn_54_1Lifetime2;
        hn stackIn_54_1Lifetime3;
        hn stackIn_54_1Lifetime4;
        hn stackIn_54_1Lifetime5;
        dd stackIn_75_0Lifetime1;
        dd stackIn_75_0Lifetime2;
        dd stackIn_75_0Lifetime3;
        dd stackIn_75_0Lifetime4;
        dd stackIn_75_0Lifetime5;
        dd stackIn_75_1Lifetime1;
        dd stackIn_75_1Lifetime2;
        dd stackIn_75_1Lifetime3;
        dd stackIn_75_1Lifetime4;
        dd stackIn_75_1Lifetime5;
        wd stackIn_162_0Lifetime1;
        qm var43_ref_qmLifetime1;
        int stackIn_174_0Lifetime1;
        int stackIn_174_1Lifetime1;
        int stackIn_259_0Lifetime1;
        int stackIn_259_1Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        float var27Lifetime1;
        int var43Lifetime1;
        int var44_intLifetime1;
        float var45Lifetime1;
        int var15Lifetime1Lifetime1;
        int var16Lifetime1Lifetime1;
        int var43Lifetime1Lifetime1;
        var50 = HoldTheLine.field_D;
        try {
          var4 = new th(param0.field_s);
          var5 = new byte[ho.field_m.length];
          var4.a(ho.field_m.length, 0, (byte) 106, var5);
          if (!nd.a(ho.field_m, 0, var5)) {
            throw new IOException("Invalid file format!");
          }
          boolean decompiledFrameRemainder1 = true;
          var6 = new byte[rh.field_a.length];
          var4.a(rh.field_a.length, 0, (byte) 98, var6);
          if (nd.a(bi.field_b, param2 - 32, var6)) {
            var7 = 0;
            decompiledFrameRemainder1 = (var50 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (!nd.a(nc.field_e, 0, var6)) {
              throw new IOException("Invalid file version!");
            }
            var7 = 1;
          }
          this.field_L = (byte)var4.f((byte) -48);
          this.field_X = this.field_L & 7;
          if (this.field_X != 0) {
            if (this.field_X >= 3) {
              if (this.field_X < 6) {
                stackIn_23_1 = 2;
              } else {
                stackIn_23_1 = 3;
              }
            } else {
              stackIn_23_1 = 1;
            }
          } else {
            stackIn_23_1 = 0;
          }
          this.field_r = stackIn_23_1;
          var8 = var4.f((byte) -47);
          var9 = var4.f((byte) -123);
          var10 = 0;
          var11 = 0;
          if (var7 != 0) {
            var10 = var4.f((byte) -105);
            var11 = var4.f((byte) -52);
          }
          var12 = var4.f((byte) -104);
          var13 = new byte[var8 * 2];
          var4.a(var8 * 2, 0, (byte) 115, var13);
          var20 = new ei();
          this.field_cb = new ah();
          this.field_d = new ah();
          var14 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 <= var14))) {
            var21 = new qm(var4.k(-48), var4.k(-108));
            var22 = new qm(var4.k(-113), var4.k(93));
            var16 = var4.f(0);
            var17 = var4.f((byte) -108);
            var18 = var4.f(0);
            var19 = var4.f(0);
            if (var50 == 0) {
              stackIn_34_0 = null;
              stackIn_34_1 = null;
              stackIn_34_2 = var21;
              stackIn_34_3 = var22;
              stackIn_34_4 = var16;
              stackIn_34_5 = 0;
              stackIn_34_6 = 0;
              stackIn_34_7 = 0;
              stackIn_34_8 = 0;
              stackIn_34_9 = 0;
              stackIn_34_10 = 0;
              stackIn_34_11 = 0;
              stackIn_34_12 = 0;
              stackIn_34_13 = var18;
              stackIn_34_14 = var19;
              if ((2 & var17) == 0) {
                stackIn_35_0 = null;
                stackIn_35_1 = null;
                stackIn_35_15 = false;
              } else {
                stackIn_35_0 = null;
                stackIn_35_1 = null;
                stackIn_35_15 = true;
              }
              if ((4 & var17) == 0) {
                stackIn_35_0Lifetime1 = null;
                stackIn_35_1Lifetime1 = null;
                stackIn_38_16 = false;
              } else {
                stackIn_35_0Lifetime1 = null;
                stackIn_35_1Lifetime1 = null;
                stackIn_38_16 = true;
              }
              if (0 == (var17 & 1)) {
                stackIn_35_0Lifetime2 = null;
                stackIn_35_1Lifetime2 = null;
                stackIn_41_17 = false;
              } else {
                stackIn_35_0Lifetime2 = null;
                stackIn_35_1Lifetime2 = null;
                stackIn_41_17 = true;
              }
              if ((var17 & 8) == 0) {
                stackIn_35_0Lifetime3 = null;
                stackIn_35_1Lifetime3 = null;
                stackIn_44_18 = false;
              } else {
                stackIn_35_0Lifetime3 = null;
                stackIn_35_1Lifetime3 = null;
                stackIn_44_18 = true;
              }
              if ((var17 & 16) == 0) {
                stackIn_35_0Lifetime4 = null;
                stackIn_35_1Lifetime4 = null;
                stackIn_47_19 = false;
              } else {
                stackIn_35_0Lifetime4 = null;
                stackIn_35_1Lifetime4 = null;
                stackIn_47_19 = true;
              }
              if ((32 & var17) == 0) {
                stackIn_35_0Lifetime5 = null;
                stackIn_35_1Lifetime5 = null;
                stackIn_50_20 = false;
              } else {
                stackIn_35_0Lifetime5 = null;
                stackIn_35_1Lifetime5 = null;
                stackIn_50_20 = true;
              }
              var23 = new dd(stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_34_7, stackIn_34_8, stackIn_34_9, stackIn_34_10, stackIn_34_11, stackIn_34_12, stackIn_34_13, stackIn_34_14, stackIn_35_15, stackIn_38_16, stackIn_41_17, stackIn_44_18, stackIn_47_19, stackIn_50_20, 0.0f, 0.0f, 3.1415927410125732f);
              var20.a(var23, (byte) 6);
              var24 = new qm(var4.k(96), var4.k(-105));
              var25_int = var4.k(param2 - 149);
              var26 = new int[]{-var4.f((byte) -30), -var4.f((byte) -51), var4.f((byte) -23), var4.f((byte) -47)};
              var17 = var4.f((byte) -46);
              var27 = (float)var4.h(-14232) / 256.0f;
              var28_float = (float)var4.h(-14232) / 256.0f;
              var16 = var4.f(0);
              var29_ref_qm = new qm(var4.k(param2 - 101), var4.k(param2 + 83));
              stackIn_53_0 = null;
              stackIn_53_1 = null;
              stackIn_53_2 = var24;
              stackIn_53_3 = var25_int;
              stackIn_53_4 = var27;
              stackIn_53_5 = var28_float;
              stackIn_53_6 = var16;
              stackIn_53_7 = var26[1];
              stackIn_53_8 = var26[2];
              stackIn_53_9 = var26[0];
              stackIn_53_10 = var26[3];
              stackIn_53_11 = null;
              stackIn_53_12 = null;
              stackIn_53_13 = var29_ref_qm;
              if (0 == (var17 & 2)) {
                stackIn_54_0 = null;
                stackIn_54_1 = null;
                stackIn_54_14 = false;
              } else {
                stackIn_54_0 = null;
                stackIn_54_1 = null;
                stackIn_54_14 = true;
              }
              if (0 == (var17 & 4)) {
                stackIn_54_0Lifetime1 = null;
                stackIn_54_1Lifetime1 = null;
                stackIn_57_15 = false;
              } else {
                stackIn_54_0Lifetime1 = null;
                stackIn_54_1Lifetime1 = null;
                stackIn_57_15 = true;
              }
              if (0 == (var17 & 1)) {
                stackIn_54_0Lifetime2 = null;
                stackIn_54_1Lifetime2 = null;
                stackIn_60_16 = false;
              } else {
                stackIn_54_0Lifetime2 = null;
                stackIn_54_1Lifetime2 = null;
                stackIn_60_16 = true;
              }
              if ((var17 & 8) == 0) {
                stackIn_54_0Lifetime3 = null;
                stackIn_54_1Lifetime3 = null;
                stackIn_63_17 = false;
              } else {
                stackIn_54_0Lifetime3 = null;
                stackIn_54_1Lifetime3 = null;
                stackIn_63_17 = true;
              }
              if ((16 & var17) == 0) {
                stackIn_54_0Lifetime4 = null;
                stackIn_54_1Lifetime4 = null;
                stackIn_66_18 = false;
              } else {
                stackIn_54_0Lifetime4 = null;
                stackIn_54_1Lifetime4 = null;
                stackIn_66_18 = true;
              }
              if ((32 & var17) == 0) {
                stackIn_54_0Lifetime5 = null;
                stackIn_54_1Lifetime5 = null;
                stackIn_69_19 = false;
              } else {
                stackIn_54_0Lifetime5 = null;
                stackIn_54_1Lifetime5 = null;
                stackIn_69_19 = true;
              }
              var30_ref_hn = new hn(stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_53_5, stackIn_53_6, stackIn_53_7, stackIn_53_8, stackIn_53_9, stackIn_53_10, (qm) (stackIn_53_11), (qm) (stackIn_53_12), stackIn_53_13, stackIn_54_14, stackIn_57_15, stackIn_60_16, stackIn_63_17, stackIn_66_18, stackIn_69_19);
              var20.a(var30_ref_hn, (byte) 6);
              var14++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var21 = new qm(var4.h(-14232), var4.h(param2 ^ -14264));
            var22 = new qm(var4.h(-14232), var4.h(param2 - 14264));
            var16 = var4.f(0);
            var17 = var4.f((byte) -75);
            var18 = var4.f(0);
            var19 = var4.f(0);
          }
          stackIn_74_0 = null;
          stackIn_74_1 = null;
          stackIn_74_2 = var21;
          stackIn_74_3 = var22;
          stackIn_74_4 = var16;
          stackIn_74_5 = 0;
          stackIn_74_6 = 0;
          stackIn_74_7 = 0;
          stackIn_74_8 = 0;
          stackIn_74_9 = 0;
          stackIn_74_10 = 0;
          stackIn_74_11 = 0;
          stackIn_74_12 = 0;
          stackIn_74_13 = var18;
          stackIn_74_14 = var19;
          if (0 == (2 & var17)) {
            stackIn_75_0 = null;
            stackIn_75_1 = null;
            stackIn_75_15 = false;
          } else {
            stackIn_75_0 = null;
            stackIn_75_1 = null;
            stackIn_75_15 = true;
          }
          if ((var17 & 4) == 0) {
            stackIn_75_0Lifetime1 = null;
            stackIn_75_1Lifetime1 = null;
            stackIn_78_16 = false;
          } else {
            stackIn_75_0Lifetime1 = null;
            stackIn_75_1Lifetime1 = null;
            stackIn_78_16 = true;
          }
          if ((var17 & 1) == 0) {
            stackIn_75_0Lifetime2 = null;
            stackIn_75_1Lifetime2 = null;
            stackIn_81_17 = false;
          } else {
            stackIn_75_0Lifetime2 = null;
            stackIn_75_1Lifetime2 = null;
            stackIn_81_17 = true;
          }
          if (0 == (8 & var17)) {
            stackIn_75_0Lifetime3 = null;
            stackIn_75_1Lifetime3 = null;
            stackIn_84_18 = false;
          } else {
            stackIn_75_0Lifetime3 = null;
            stackIn_75_1Lifetime3 = null;
            stackIn_84_18 = true;
          }
          if ((16 & var17) == 0) {
            stackIn_75_0Lifetime4 = null;
            stackIn_75_1Lifetime4 = null;
            stackIn_87_19 = false;
          } else {
            stackIn_75_0Lifetime4 = null;
            stackIn_75_1Lifetime4 = null;
            stackIn_87_19 = true;
          }
          if ((var17 & param2) == 0) {
            stackIn_75_0Lifetime5 = null;
            stackIn_75_1Lifetime5 = null;
            stackIn_90_20 = false;
          } else {
            stackIn_75_0Lifetime5 = null;
            stackIn_75_1Lifetime5 = null;
            stackIn_90_20 = true;
          }
          var23 = new dd(stackIn_74_2, stackIn_74_3, stackIn_74_4, stackIn_74_5, stackIn_74_6, stackIn_74_7, stackIn_74_8, stackIn_74_9, stackIn_74_10, stackIn_74_11, stackIn_74_12, stackIn_74_13, stackIn_74_14, stackIn_75_15, stackIn_78_16, stackIn_81_17, stackIn_84_18, stackIn_87_19, stackIn_90_20, 0.0f, 0.0f, 3.1415927410125732f);
          var24_ref = (dd) (var20.field_b[0]);
          var25 = (hn) (var20.field_b[1]);
          var26_ref = (hn) (var20.field_b[-1 + var20.field_e]);
          var20.a(var23, (byte) 6);
          var27Lifetime1 = var23.f(50) / (var23.f(50) + var24_ref.f(50));
          var28 = var26_ref.field_N;
          var29 = var25.field_N;
          var30 = var26_ref.field_P;
          var31 = var25.field_P;
          var32 = var26_ref.field_B;
          var33 = var25.field_B;
          var34 = var26_ref.field_L;
          var35 = var25.field_L;
          var36 = (float)((double)var27Lifetime1 * 3.141592653589793);
          if (!(var25.field_I > var25.field_E)) {
            stackIn_94_0 = 3.1415927410125732f + var25.field_E;
          } else {
            stackIn_94_0 = var25.field_E;
          }
          boolean decompiledFrameCompleted3 = true;
          var37 = stackIn_94_0;
          var38 = null;
          if (var7 == 0) {
            this.field_i = null;
            this.field_m = null;
          }
          if (var7 != 0 ||
            var50 != 0) {
            var38 = new wd[var10];
            this.field_i = new sb[var10];
            var14 = 0;
            do {
              if (var10 <= var14) {
                this.field_m = new ue[var11];
                break;
              }
              this.field_i[var14] = new sb();
              var39_int = var4.f((byte) -27);
              ((Object[]) (var38))[var14] = (wd) (var20.field_b[var39_int]);
              this.field_i[var14].field_b = (float)var4.k(106) / 32768.0f - 0.5f;
              var14++;
            } while (var50 == 0);
            var14 = 0;
            while (var11 > var14) {
              this.field_m[var14] = new ue();
              var4.f((byte) -94);
              var4.f((byte) -79);
              var39_int = var4.k(-108);
              var40 = var4.k(64);
              var4.k(81);
              discarded$0 = new qm(var39_int, var40);
              var14++;
              if (var50 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            var23.field_z = var26_ref.field_L;
            var14 = 0;
            var23.field_y = var36;
            var24_ref.field_G = var36;
            var23.field_O = var26_ref.field_N;
            var23.field_K = var26_ref.field_P;
            var23.field_I = var26_ref.field_B;
          }
          var39 = null;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameRemainder4 = true;
            var40_ref_dd = (dd) (var20.field_b[var14]);
            var40_ref_dd.b(param2 + 43, var37);
            if (~var40_ref_dd.field_R.field_h == ~var40_ref_dd.field_P.field_h) {
              stackIn_127_0 = ~var40_ref_dd.field_R.field_f;
              stackIn_127_1 = ~var40_ref_dd.field_P.field_f;
              decompiledFrameRemainder0 = (var50 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_127_0 == stackIn_127_1)) {
                var20.a(true, var14);
                decompiledFrameRemainder4 = false;
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder0)) {
              var40_ref_dd.field_L = var31;
              var14++;
              var40_ref_dd.field_z = var34;
              var40_ref_dd.field_O = var28;
              var40_ref_dd.field_K = var30;
              var40_ref_dd.field_A = var35;
              var40_ref_dd.field_I = var32;
              var40_ref_dd.field_N = var29;
              var40_ref_dd.field_C = var33;
            }
            if (decompiledFrameRemainder0) {
              if (var39 != null) {
                ((hn) (var39)).field_Q = var40_ref_dd.p(-1);
              }
              stackIn_127_0 = ~var14;
              stackIn_127_1 = ~var20.field_e;
            }
            if (stackIn_127_0 > stackIn_127_1 ||
              var50 != 0) {
              var41_ref_hn = (hn) (var20.field_b[var14]);
              var41_ref_hn.field_F = var40_ref_dd.b((byte) -128);
              var14++;
              if (!(var41_ref_hn.field_I > var41_ref_hn.field_E)) {
                stackIn_135_0 = 3.1415927410125732f + var41_ref_hn.field_I;
              } else {
                stackIn_135_0 = var41_ref_hn.field_I;
              }
              var37 = stackIn_135_0;
              var28 = var29;
              if (var14 < var20.field_e - 1) {
                stackIn_139_0 = var20.field_b[var14 + 1];
              } else {
                stackIn_139_0 = var25;
              }
              var42_ref_hn = (hn) (stackIn_139_0);
              var29 = var42_ref_hn.field_N;
              var30 = var31;
              var31 = var42_ref_hn.field_P;
              var32 = var33;
              var34 = var35;
              var33 = var42_ref_hn.field_B;
              var39 = var41_ref_hn;
              var35 = var42_ref_hn.field_L;
              if (var50 == 0) {
                continue;
              }
            }
            break;
          }
          this.field_sb = new wd[var20.field_e];
          var14 = 0;
          L43: while (true) {
            if (var20.field_e > var14) {
              this.field_sb[var14] = (wd) (var20.field_b[var14]);
              var14++;
              if (var50 == 0) {
                continue;
              }
            } else {
              if (var7 != 0) {
                var14 = 0;
                while (var10 > var14) {
                  stackIn_163_0 = 0;
                  if (var50 != 0) {
                    break L43;
                  }
                  var15 = stackIn_163_0;
                  while (var15 < this.field_sb.length) {
                    stackIn_162_0 = this.field_sb[var15];
                    if (stackIn_162_0 == ((Object[]) (var38))[var14]) {
                      this.field_sb[var15].b(this.field_i[var14].field_b, param2 ^ 7561012);
                    }
                    var15++;
                  }
                  var14++;
                }
              }
            }
            stackIn_162_0Lifetime1 = this.field_sb[this.field_sb.length - 1];
            stackIn_163_0 = stackIn_162_0Lifetime1.field_k;
            break;
          }
          var40 = stackIn_163_0;
          var41 = this.field_sb[0].field_k;
          var14 = 0;
          L52: while (true) {
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            if (var14 < this.field_sb.length) {
              var42 = this.field_sb[(1 + var14) % this.field_sb.length].field_k;
              stackIn_174_0 = 0;
              stackIn_174_1 = var41;
              if (var50 != 0) {
                if (stackIn_174_0 < stackIn_174_1) {
                  var43_ref_qm = new qm(var4.h(-14232), var4.h(-14232));
                  var44_int = var4.f((byte) -24);
                  var45 = (float)(3.141592653589793 * (double)var4.f((byte) -60) / 128.0);
                  var16Lifetime1 = var4.f(0);
                  stackIn_223_0 = var44_int;
                  stackIn_223_1 = 5;
                  break L52;
                }
                decompiledFrameRemainder3 = false;
              }
              else {
                if (stackIn_174_0 == stackIn_174_1) {
                  this.field_sb[var14].field_o = (float)(var42 - var40) / this.field_sb[var14].f(50);
                }
                var40 = var41;
                var41 = var42;
                var14++;
                continue;
              }
            }
            if (decompiledFrameRemainder3) {
              sb.field_a = this.field_sb;
              var14 = 0;
              while (true) {
                stackIn_174_0Lifetime1 = var14;
                stackIn_174_1Lifetime1 = var12;
                if (stackIn_174_0Lifetime1 >= stackIn_174_1Lifetime1) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                var43_ref_qmLifetime1 = new qm(var4.h(-14232), var4.h(-14232));
                var44_intLifetime1 = var4.f((byte) -24);
                var45Lifetime1 = (float)(3.141592653589793 * (double)var4.f((byte) -60) / 128.0);
                var16Lifetime1Lifetime1 = var4.f(0);
                stackIn_223_0 = var44_intLifetime1;
                stackIn_223_1 = 5;
                if (var50 != 0) {
                  break L52;
                }
                if (stackIn_223_0 >= stackIn_223_1 &&
                  var44_intLifetime1 <= 8) {
                  var46 = ge.field_c[this.field_r * 2];
                  var47_float = hi.a(this.field_sb.length, 0.0f, -1, this.field_sb, -24659, var43_ref_qmLifetime1, var16Lifetime1Lifetime1);
                  if (var47_float == -1.0f) {
                    break;
                  }
                  fieldTemp$1 = this.field_z;
                  this.field_z = this.field_z + 1;
                  stackIn_189_0 = this.field_C;
                  stackIn_189_1 = fieldTemp$1;
                  stackIn_189_2 = null;
                  stackIn_189_3 = null;
                  stackIn_189_4 = var43_ref_qmLifetime1.field_h;
                  stackIn_189_5 = var43_ref_qmLifetime1.field_f;
                  stackIn_189_6 = var16Lifetime1Lifetime1;
                  stackIn_189_7 = var45Lifetime1;
                  stackIn_189_8 = var47_float;
                  if (var47_float == (float)this.field_sb.length) {
                    stackIn_190_2 = null;
                    stackIn_190_3 = null;
                    stackIn_190_9 = this.field_sb[0];
                  } else {
                    stackIn_190_2 = null;
                    stackIn_190_3 = null;
                    stackIn_190_9 = this.field_sb[(int)var47_float];
                  }
                  stackIn_189_0[stackIn_189_1] = new ja(stackIn_189_4, stackIn_189_5, stackIn_189_6, stackIn_189_7, stackIn_189_8, stackIn_190_9, var46, 0);
                } else if (var44_intLifetime1 >= 62 &&
                  69 >= var44_intLifetime1) {
                  var46_float = hi.a(this.field_sb.length, 0.0f, 1, this.field_sb, param2 ^ -24691, var43_ref_qmLifetime1, var16Lifetime1Lifetime1);
                  if (-1.0f == var46_float) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  fieldTemp$2 = this.field_z;
                  this.field_z = this.field_z + 1;
                  stackIn_203_0 = this.field_C;
                  stackIn_203_1 = fieldTemp$2;
                  stackIn_203_2 = null;
                  stackIn_203_3 = null;
                  stackIn_203_4 = var43_ref_qmLifetime1.field_h;
                  stackIn_203_5 = var43_ref_qmLifetime1.field_f;
                  stackIn_203_6 = var16Lifetime1Lifetime1;
                  stackIn_203_7 = var45Lifetime1;
                  stackIn_203_8 = var46_float;
                  if ((float)this.field_sb.length == var46_float) {
                    stackIn_204_2 = null;
                    stackIn_204_3 = null;
                    stackIn_204_9 = this.field_sb[0];
                  } else {
                    stackIn_204_2 = null;
                    stackIn_204_3 = null;
                    stackIn_204_9 = this.field_sb[(int)var46_float];
                  }
                  stackIn_203_0[stackIn_203_1] = new ja(stackIn_203_4, stackIn_203_5, stackIn_203_6, stackIn_203_7, stackIn_203_8, stackIn_204_9, ge.field_c[-62 + var44_intLifetime1], 1);
                } else {
                  var46_ref = new wm(var43_ref_qmLifetime1, var44_intLifetime1, var16Lifetime1Lifetime1, var45Lifetime1, 0.0f, 0.0f);
                  if ((1048576 & var46_ref.field_J) != 0) {
                    var46_ref.a((byte) -113);
                    var46_ref.field_H = var46_ref.field_H.e();
                  }
                  if ((var46_ref.field_J & 32768) == 0) {
                    this.field_cb.a((byte) -84, var46_ref);
                  } else {
                    this.field_d.a((byte) -92, var46_ref);
                  }
                  var46_ref.a(-1, sb.field_a);
                  if (53 != var44_intLifetime1) {
                    if (54 == var44_intLifetime1) {
                      var47 = var43_ref_qmLifetime1.field_h - (int)(Math.sin((double)var45Lifetime1) * 35.0);
                      var48 = var43_ref_qmLifetime1.field_f - (int)(Math.cos((double)var45Lifetime1) * 35.0);
                      var49 = new na(var47, var48, var16Lifetime1Lifetime1, 60, de.field_Q);
                      this.field_Q.a((byte) -117, var49);
                      var47 = var43_ref_qmLifetime1.field_h + (int)(Math.sin((double)var45Lifetime1) * 35.0);
                      var48 = var43_ref_qmLifetime1.field_f + (int)(Math.cos((double)var45Lifetime1) * 35.0);
                      var49 = new na(var47, var48, var16Lifetime1Lifetime1, 60, de.field_Q);
                      this.field_Q.a((byte) -118, var49);
                    }
                  } else {
                    var47 = var43_ref_qmLifetime1.field_h - (int)(10.0 * Math.sin((double)var45Lifetime1));
                    var48 = var43_ref_qmLifetime1.field_f - (int)(Math.cos((double)var45Lifetime1) * 10.0);
                    var49 = new na(var47, var48, var16Lifetime1Lifetime1, 60, de.field_Q);
                    this.field_Q.a((byte) -81, var49);
                  }
                }
                var14++;
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                throw new RuntimeException((String) null);
              }
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameCompleted2)) {
              throw new RuntimeException((String) null);
            }
            stackIn_223_0 = ~this.field_z;
            stackIn_223_1 = -1;
            break;
          }
          if (stackIn_223_0 == stackIn_223_1) {
            throw new RuntimeException((String) null);
          }
          var14 = 0;
          while (true) {
            stackIn_228_0 = var14;
            if (stackIn_228_0 < this.field_z) {
              stackIn_247_0 = 0;
              if (var50 == 0) {
                if (stackIn_247_0 == this.field_C[var14].field_rc) {
                  this.field_h = this.field_h + 1;
                  var43 = 0;
                  var15Lifetime1 = 0;
                  while (this.field_z > var15Lifetime1) {
                    stackIn_228_0 = this.field_C[var15Lifetime1].field_rc;
                    if (stackIn_228_0 == 0 &&
                      this.field_C[var15Lifetime1].field_Ib > this.field_C[var14].field_Ib) {
                      var43++;
                    }
                    var15Lifetime1++;
                  }
                  this.field_C[var14].field_R = var43;
                }
                var14++;
                continue;
              }
            } else {
              stackIn_247_0 = 0;
            }
            var15Lifetime1Lifetime1 = stackIn_247_0;
            var14 = this.field_h;
            L87: while (true) {
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameCompleted0 = true;
              L90: {
                if (this.field_z > var14) {
                  stackIn_259_0 = 0;
                  stackIn_259_1 = this.field_C[var14].field_rc;
                  if (var50 != 0) {
                    if (stackIn_259_0 < stackIn_259_1) {
                      var43Lifetime1 = param1[this.field_C[var14].field_R];
                      stackIn_269_0 = var43Lifetime1;
                      stackIn_269_1 = var14;
                      break L90;
                    }
                    decompiledFrameRemainder5 = false;
                  }
                  else {
                    if (stackIn_259_0 == stackIn_259_1) {
                      var43_ref_ja = this.field_C[var14];
                      this.field_C[var14] = this.field_C[var15Lifetime1Lifetime1];
                      incrementValue$3 = var15Lifetime1Lifetime1;
                      var15Lifetime1Lifetime1++;
                      this.field_C[incrementValue$3] = var43_ref_ja;
                    }
                    var14++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder5) {
                  if (null == param1) {
                    param1 = new int[]{3, 2, 1, 0};
                  }
                  var14 = 0;
                  while (true) {
                    stackIn_259_0Lifetime1 = var14;
                    stackIn_259_1Lifetime1 = this.field_h;
                    if (stackIn_259_0Lifetime1 >= stackIn_259_1Lifetime1) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var43Lifetime1 = param1[this.field_C[var14].field_R];
                    stackIn_269_0 = var43Lifetime1;
                    stackIn_269_1 = var14;
                    if (var50 != 0) {
                      break;
                    }
                    if (stackIn_269_0 != stackIn_269_1) {
                      var44 = this.field_C[var43Lifetime1];
                      this.field_C[var43Lifetime1] = this.field_C[var14];
                      this.field_C[var14] = var44;
                    }
                    var14++;
                  }
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameCompleted0)) {
                while (stackIn_269_0 > stackIn_269_1) {
                  this.field_C[var14].field_Eb = nc.field_j[var14];
                  this.field_C[var14].field_tc = ii.field_d[var14];
                  var43Lifetime1 = pf.field_c[this.field_r];
                  stackIn_277_0 = var14 & 1;
                  if (var50 != 0) {
                    break L87;
                  }
                  if (stackIn_277_0 == 0) {
                    var43Lifetime1 = var43Lifetime1 ^ 1;
                  }
                  this.field_C[var14].a(param2 + 20353, ge.field_c[var43Lifetime1]);
                  var14++;
                  stackIn_269_0 = ~var14;
                  stackIn_269_1 = ~this.field_h;
                }
                decompiledFrameRemainder2 = false;
              }
              if (decompiledFrameRemainder2) {
                var14 = 0;
                while (true) {
                  stackIn_269_0 = ~var14;
                  stackIn_269_1 = ~this.field_h;
                  if (stackIn_269_0 <= stackIn_269_1) {
                    break;
                  }
                  this.field_C[var14].field_Eb = nc.field_j[var14];
                  this.field_C[var14].field_tc = ii.field_d[var14];
                  var43Lifetime1Lifetime1 = pf.field_c[this.field_r];
                  stackIn_277_0 = var14 & 1;
                  if (var50 != 0) {
                    break L87;
                  }
                  if (stackIn_277_0 == 0) {
                    var43Lifetime1Lifetime1 = var43Lifetime1Lifetime1 ^ 1;
                  }
                  this.field_C[var14].a(param2 + 20353, ge.field_c[var43Lifetime1Lifetime1]);
                  var14++;
                }
              }
              stackIn_277_0 = this.field_h;
              break;
            }
            var14 = stackIn_277_0;
            L103: while (true) {
              if (var14 < this.field_z) {
                this.field_C[var14].field_Eb = 8421504;
                this.field_C[var14].field_tc = 0;
                var14++;
                if (var50 == 0) {
                  continue;
                }
              } else {
                if (3 == this.field_r) {
                  this.field_pb = false;
                  if (var50 == 0) {
                    break L103;
                  }
                }
                this.field_pb = true;
              }
              this.field_db = new wb(5, 5);
              break;
            }
            this.a(param0, -77);
            sb.field_a = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_295_0 = var4_ref;
          stackIn_295_1 = new StringBuilder().append("sg.W(");
          if (param0 == null) {
            stackIn_296_2 = "null";
          } else {
            stackIn_296_2 = "{...}";
          }
          stackIn_299_1 = ((StringBuilder) (Object) stackIn_295_1).append(stackIn_296_2).append(',');
          if (param1 == null) {
            stackIn_300_2 = "null";
          } else {
            stackIn_300_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_295_0), ((StringBuilder) (Object) stackIn_299_1).append(stackIn_300_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0, ah param1) {
        RuntimeException runtimeException = null;
        jk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var3 = (jk) (param1.b((byte) 124));
          if (param0) {
            this.field_J = 78;
          }
          while (var3 != null) {
            if (var4 != 0) {
              return;
            }
            if (var3.field_i != 0) {
              var3.f(-115);
              if (0 >= var3.field_i) {
                var3.a((byte) -21);
              }
            }
            var3 = (jk) (param1.c((byte) -76));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6293) {
            this.field_P = 13;
          }
          stackIn_4_0 = param0 | param2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(wm param0, int param1) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int var3_intLifetime1;
        var13 = HoldTheLine.field_D;
        try {
          if ((param0.field_J & 65536) != 0) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_pb) {
            var3_int = param0.field_A.field_h;
            var4_int = param0.field_A.field_f;
            if ((131072 & param0.field_J) != 0) {
              var4_int = param0.field_F;
              var3_int = param0.field_D;
            }
            if ((16384 & param0.field_J) != 0) {
              hc.a(128, param0.a((byte) -110), (byte) -108, this.field_db.field_k + var3_int, this.field_db.field_a + var4_int);
              decompiledFrameRemainder0 = (var13 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(param0.field_E.field_d);
              if (!decompiledSharedTail0) {
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
                while (true) {
                  if (8 > var12) {
                    var5[var12 + 8] = var5[var12] + this.field_db.field_k;
                    var5[var12 + 9] = var5[var12 + 1] + this.field_db.field_a;
                    var12 += 2;
                    if (var13 == 0) {
                      continue;
                    }
                  } else {
                    var5 = qk.a(var5, (byte) -127);
                    dl.a(var5, (byte) -106, 128, 0);
                  }
                  break;
                }
                decompiledSharedTail0 = (var13 != 0);
              }
              if (decompiledSharedTail0) {
                tc.g(var3_int + this.field_db.field_k, var4_int + this.field_db.field_a, param0.field_E.field_a, 0, 128);
              }
            }
          }
          if (param1 != 8192) {
            return;
          }
          var3_intLifetime1 = param0.field_q + 1;
          while (var3_intLifetime1 < 4) {
            if (var13 != 0) {
              return;
            }
            var4 = (jk) (this.field_M[var3_intLifetime1].b((byte) 111));
            while (var4 != null) {
              this.a(var4.field_t >> 10, var4.field_k >> 10, var4.field_u >> 10, (byte) -35, param0, var4.field_q * 2 >> 2);
              var4 = (jk) (this.field_M[var3_intLifetime1].c((byte) 121));
            }
            var3_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("sg.GA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(long param0, boolean param1) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = HoldTheLine.field_D;
        try {
          this.a((byte) -3, param0);
          if (3 != this.field_r) {
            var4_int = this.field_F + 128;
            if (this.field_J == 2 ||
              this.field_J == 6) {
              var4_int = var4_int + 256 >> 1;
            }
            o.a(128, 480, 0, var4_int, 640, -4441, 0);
          }
          var4_intLifetime1 = 1 * hc.a(0, (int)(param0 << 1)) + 2 * tn.a((int)(param0 >> 1), 5255) >> 20;
          var5 = ((int)param0 * 640 - 1) % 1337;
          var6 = var5 / 640;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var6 >= 480))) {
            stackIn_23_0 = -1;
            stackIn_23_1 = ~((var5 * 3 + 5 * var6) % 9);
            if (var7 == 0) {
              if (stackIn_23_0 == stackIn_23_1) {
                tc.d(var5, var6, -3 + (var5 + var4_intLifetime1), var6 - 7, 6715272);
              }
              var5 += 939;
              if (640 >= var5) {
                continue;
              }
              var6 = var6 + var5 / 640;
              var5 = var5 % 640;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            var5 = (-1 + (int)param0 * 640) % 917;
            stackIn_23_0 = var5;
            stackIn_23_1 = 640;
          }
          var6Lifetime1 = stackIn_23_0 / stackIn_23_1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6Lifetime1 >= 480))) {
            stackIn_36_0 = (var6Lifetime1 * 4 + var5 * 2) % 7;
            if (var7 == 0) {
              if (stackIn_36_0 == 0) {
                tc.d(var5, var6Lifetime1, var4_intLifetime1 + (-3 + var5), -5 + var6Lifetime1, 3364192);
              }
              var5 += 547;
              if (640 >= var5) {
                continue;
              }
              var6Lifetime1 = var6Lifetime1 + var5 / 640;
              var5 = var5 % 640;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_36_0 = param1 ? 1 : 0;
          }
          if (stackIn_36_0 != 1) {
            this.field_qb = (hj) null;
          }
          var5Lifetime1 = (640 * (int)param0 - 1) % 593;
          var6Lifetime2 = var5Lifetime1 / 640;
          while (var6Lifetime2 < 480) {
            if ((2 * var5Lifetime1 + var6Lifetime2 * 4) % 7 == 0) {
              tc.d(var5Lifetime1, var6Lifetime2, -4 + (var5Lifetime1 + var4_intLifetime1), -7 + var6Lifetime2, 5461344);
            }
            var5Lifetime1 += 375;
            if (var5Lifetime1 <= 640) {
              continue;
            }
            var6Lifetime2 = var6Lifetime2 + var5Lifetime1 / 640;
            var5Lifetime1 = var5Lifetime1 % 640;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(String param0, byte param1) {
        int fieldTemp$1 = 0;
        ji var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.field_a = this.field_mb;
          if (param0 != null) {
            this.field_mb = this.a(param0, -118);
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            fieldTemp$1 = this.field_mb + 1;
            this.field_mb = this.field_mb + 1;
            if (~fieldTemp$1 == ~mm.field_a.length) {
              throw new RuntimeException();
            }
          }
          if (this.field_mb != this.field_a) {
            this.field_k = 0;
          }
          var3 = mm.field_a[this.field_mb];
          if (param1 != 8) {
            this.b((String) null, (byte) 71);
          }
          var4 = 0;
          while (var4 < var3.field_c) {
            this.a(var3.field_e[var4], -99);
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("sg.EA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ja param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= 3))) {
            stackIn_22_0 = param2.field_Fb[var4_int];
            stackIn_22_1 = 3;
            if (var7 == 0) {
              if (stackIn_22_0 == stackIn_22_1) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                var6 = var4_int;
                if (var6 == 0) {
                  var5 = 16711680;
                  decompiledFrameRemainder1 = false;
                } else {
                  decompiledFrameRemainder0 = (var6 == 1);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  var5 = 65280;
                  decompiledFrameRemainder1 = false;
                }
                if (decompiledFrameRemainder1) {
                  var5 = 8355839;
                }
                tc.g(param2.field_A.field_h, param2.field_A.field_f, 4 + param0 * 4, var5, 16);
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_22_0 = param1;
            stackIn_22_1 = -403;
          }
          if (stackIn_22_0 != stackIn_22_1) {
            this.field_lb = (bm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_29_0 = runtimeException;
          stackIn_29_1 = new StringBuilder().append("sg.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_172_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ji var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ok var4 = null;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_165_0Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          var2 = mm.field_a[this.field_mb];
          var3 = 0;
          L0: while (true) {
            if (var3 < var2.field_b) {
              var4 = var2.field_p[var3];
              var5 = 1;
              stackIn_172_0 = 0;
              if (var10 != 0) {
                break L0;
              }
              var6 = stackIn_172_0;
              while (true) {
                if (var4.field_d > var6) {
                  var7 = var4.field_a[var6];
                  stackIn_165_0 = var7.field_d;
                  if (stackIn_165_0 == 0) {
                    stackIn_15_0 = var5;
                    if ((this.field_o & 1) == 0) {
                      stackIn_16_1 = 0;
                    } else {
                      stackIn_16_1 = 1;
                    }
                    var5 = stackIn_15_0 & stackIn_16_1;
                  } else if (var7.field_d != 1) {
                    if (var7.field_d == 2) {
                      if (var7.field_b < 0) {
                        stackIn_29_0 = var7.field_b + this.field_sb.length;
                      } else {
                        stackIn_29_0 = var7.field_b;
                      }
                      var8 = stackIn_29_0;
                      var9 = (int)this.field_C[0].field_vb;
                      if (var9 < var8 &&
                        (var7.field_c & 1) == 0) {
                        var5 = 0;
                      }
                      if (var8 == var9 &&
                        (var7.field_c & 2) == 0) {
                        var5 = 0;
                      }
                      if (var8 < var9 &&
                        (4 & var7.field_c) == 0) {
                        var5 = 0;
                      }
                    } else if (3 != var7.field_d) {
                      if (var7.field_d == 4) {
                        if (this.field_C[var7.field_c].field_J != var7.field_b) {
                          var5 = 0;
                        }
                      } else if (var7.field_d == 5) {
                        var8 = this.field_C[var7.field_c].field_bc;
                        var9 = var7.field_e;
                        if (var8 < var9 &&
                          (var7.field_b & 1) == 0) {
                          var5 = 0;
                        }
                        if (var9 == var8 &&
                          (2 & var7.field_b) == 0) {
                          var5 = 0;
                        }
                        if (var9 < var8 &&
                          0 == (4 & var7.field_b)) {
                          var5 = 0;
                        }
                      } else if (var7.field_d != 9) {
                        if (var7.field_d == 6) {
                          stackIn_93_0 = var5;
                          if ((8 & this.field_o) == 0) {
                            stackIn_94_1 = 0;
                          } else {
                            stackIn_94_1 = 1;
                          }
                          var5 = stackIn_93_0 & stackIn_94_1;
                        } else if (7 == var7.field_d) {
                          stackIn_103_0 = var5;
                          if (0 == (16 & this.field_o)) {
                            stackIn_104_1 = 0;
                          } else {
                            stackIn_104_1 = 1;
                          }
                          var5 = stackIn_103_0 & stackIn_104_1;
                        } else if (8 == var7.field_d) {
                          stackIn_116_0 = var5;
                          if (this.field_U &&
                            -this.field_ob + this.field_ab >= 150) {
                            stackIn_117_1 = 1;
                          } else {
                            stackIn_117_1 = 0;
                          }
                          var5 = stackIn_116_0 & stackIn_117_1;
                        }
                      } else {
                        var8 = this.field_C[var7.field_c].field_R;
                        var9 = var7.field_e;
                        if (var9 > var8 &&
                          0 == (1 & var7.field_b)) {
                          var5 = 0;
                        }
                        if (~var9 == ~var8 &&
                          0 == (2 & var7.field_b)) {
                          var5 = 0;
                        }
                        if (var8 > var9 &&
                          (var7.field_b & 4) == 0) {
                          var5 = 0;
                        }
                      }
                    } else {
                      var8 = this.field_C[0].field_Fb[var7.field_c];
                      var9 = var7.field_e;
                      if (var9 > var8 &&
                        (1 & var7.field_b) == 0) {
                        var5 = 0;
                      }
                      if (~var8 == ~var9 &&
                        (2 & var7.field_b) == 0) {
                        var5 = 0;
                      }
                      if (var8 > var9 &&
                        (var7.field_b & 4) == 0) {
                        var5 = 0;
                      }
                    }
                  } else {
                    stackIn_161_0 = var5;
                    if (0 == (2 & this.field_o)) {
                      stackIn_162_1 = 0;
                    } else {
                      stackIn_162_1 = 1;
                    }
                    var5 = stackIn_161_0 & stackIn_162_1;
                  }
                  var6++;
                  continue;
                }
                stackIn_165_0Lifetime1 = var5;
                if (stackIn_165_0Lifetime1 != 0) {
                  this.b(var4.field_b, (byte) 8);
                  break;
                }
                var3++;
                continue L0;
              }
            }
            stackIn_172_0 = param0;
            break;
          }
          if (stackIn_172_0 != 31782) {
            field_Y = (String) null;
          }
          if (0 < this.field_tb &&
            this.field_tb < 256) {
            fieldTemp$0 = this.field_tb - 3;
            this.field_tb = this.field_tb - 3;
            if (fieldTemp$0 <= 0) {
              this.field_D = -101;
            }
          }
          if (~this.field_a != ~this.field_mb) {
            fieldTemp$1 = this.field_k + 1;
            this.field_k = this.field_k + 1;
            if (fieldTemp$1 == 40) {
              this.field_a = this.field_mb;
            }
          }
          this.field_o = this.field_o & -28;
          if (this.field_mb == -1) {
            pc.field_h = 255;
            if (var10 == 0) {
              return;
            }
          }
          if (null != mm.field_a[this.field_mb].field_j) {
            fieldTemp$2 = pc.field_h - 4;
            pc.field_h = pc.field_h - 4;
            if (fieldTemp$2 >= 0) {
              return;
            }
            pc.field_h = 0;
            if (var10 == 0) {
              return;
            }
          }
          fieldTemp$3 = pc.field_h + 4;
          pc.field_h = pc.field_h + 4;
          if (fieldTemp$3 > 255) {
            pc.field_h = 255;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "sg.RA(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_31_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          if (param3 >= 0 &&
            param1 >= 0 &&
            640 > param3 &&
            param1 < 480) {
            var5_int = this.field_lb.field_m[param3 + 640 * param1];
            if (param0 >= 1) {
              var5_int = var5_int & 60;
            }
            if ((param0 < 1 ||
              HoldTheLine.field_D != 0) &&
              param0 <= -1) {
              var5_int = var5_int & 15;
            }
            return (0 != var5_int);
          }
          stackIn_31_0 = b.a(!param2, param3, param1, this.field_nb);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "sg.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(ja param0, float param1, int param2, float param3, float param4) {
        int stackIn_24_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var6_float = 0.0f;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8_int = 0;
        wm var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var6_float = (float)Math.sqrt((double)(param3 * param3 + param4 * param4));
          var7 = 1 + (int)var6_float;
          param1 = param1 / (float)var7;
          param3 = param3 / (float)var7;
          param4 = param4 / (float)var7;
          var8_int = 0;
          while (var7 > var8_int) {
            if (0.0f != param1) {
              param0.field_r = param0.field_r + param1;
              param0.field_w.a(param0.field_r, (byte) -54);
            }
            param0.field_y = param0.field_y + param3;
            param0.field_u = param0.field_u + param4;
            param0.field_A.field_f = (int)param0.field_u;
            param0.field_A.field_h = (int)param0.field_y;
            if (!this.a(true, param0) ||
              var9 != 0) {
              var8_int++;
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          var8 = (wm) (this.field_d.b((byte) 108));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8))) {
            stackIn_24_0 = 262144 & var8.field_J;
            if (var9 == 0) {
              if (stackIn_24_0 != 0) {
                this.a(var8, param0, (byte) 7);
              }
              var8 = (wm) (this.field_d.c((byte) 92));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            param0.a(-1, bl.field_r.field_sb);
            stackIn_24_0 = param2;
          }
          if (stackIn_24_0 != ~param0.field_v) {
            param0.field_q = bl.field_r.field_sb[param0.field_v].field_k;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("sg.P(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(boolean param0, ja param1) {
        int fieldTemp$0 = 0;
        ja stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        oa stackIn_34_0 = null;
        qm stackIn_47_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn var3 = null;
        RuntimeException var3_ref = null;
        qm var4 = null;
        in var5_ref_in = null;
        int var5 = 0;
        int var6_int = 0;
        float var6_float = 0.0f;
        wm var6 = null;
        qm var7 = null;
        float var7_float = 0.0f;
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
        qm var7Lifetime1;
        var17 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted0 = true;
          var3 = param1.field_C;
          var4 = this.a(param1, 0);
          if (var4 != null) {
            var5_ref_in = new in(0.0f, 0.0f);
            var6_int = 0;
            while (true) {
              if (var6_int < 10) {
                dd.a(0, var5_ref_in, this.field_nb, param1.field_q, var4);
                param1.field_u = param1.field_u + var5_ref_in.field_g;
                param1.field_y = param1.field_y + var5_ref_in.field_j;
                param1.field_A.field_f = (int)param1.field_u;
                param1.field_A.field_h = (int)param1.field_y;
                var7 = this.a(param1, 0);
                stackIn_47_0 = var7;
                if (var17 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_47_0 != null ||
                  var17 != 0) {
                  var4 = var7;
                  var6_int++;
                  continue;
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              var6_float = -param1.field_y + (float)var4.field_h;
              param1.field_T = 20;
              var7_float = -param1.field_u + (float)var4.field_f;
              stackIn_20_0 = (ja) (param1);
              stackIn_21_1 = (this.field_J != 2) && (this.field_J != 6);
              stackIn_20_0.field_V = stackIn_21_1;
              param1.field_H = param1.e((byte) 45);
              var8_float = (-(var7_float * var5_ref_in.field_j) + var6_float * var5_ref_in.field_g) / 3.5f;
              var9_float = param1.field_j * (-var7_float / 3.5f);
              var10_float = var6_float / 3.5f * param1.field_j;
              var11_float = var8_float * (var8_float * var3.field_l) + var3.field_a;
              var12 = var5_ref_in.field_g * (param1.field_x + var10_float) + var5_ref_in.field_j * (param1.field_t + var9_float);
              if (0.0f > var12) {
                var13 = 0.800000011920929f * param1.a((byte) 114, sl.field_c);
                var14 = -(1.0f + var13) * var12 * var3.field_a / var11_float;
                param1.field_t = param1.field_t + var14 * var5_ref_in.field_j;
                param1.field_x = param1.field_x + var14 * var5_ref_in.field_g;
                var15 = var12 * (-var8_float * -(var13 + 1.0f)) * var3.field_l / var11_float;
                param1.field_j = param1.field_j + var15;
                param1.a(-var12, 0, (ja) null, 0);
                if ((this.field_ab - 30) > param1.field_cb) {
                  if (param1.field_J != 2 &&
                    0 >= param1.field_Fb[2]) {
                    stackIn_34_0 = sj.field_K;
                  } else {
                    stackIn_34_0 = vn.field_h;
                  }
                  var16 = stackIn_34_0;
                  bd.a((byte) 113, param1, var16, var16.field_q);
                  param1.field_cb = this.field_ab;
                }
                param1.a((byte) 67, (ee) null);
                if (param1.field_W != null) {
                  this.field_rb[7] = -1;
                  this.field_rb[6] = -1;
                  if ((this.field_H & 134217728) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 27);
                    this.field_H = this.field_H ^ 134217728;
                  }
                  if ((this.field_H & 16384) == 16384) {
                    this.field_N = this.field_N + (this.field_p * this.field_l << 14);
                    this.field_H = this.field_H ^ 16384;
                  }
                }
              }
              param1.field_A.field_h = (int)param1.field_y;
              param1.field_A.field_f = (int)param1.field_u;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_47_0 = var4;
          }
          stackIn_51_0 = (stackIn_47_0 == null) ? 0 : 1;
          var5 = stackIn_51_0;
          var6 = (wm) (this.field_cb.b((byte) 98));
          do {
            if (null == var6) {
              var6 = (wm) (this.field_d.b((byte) 117));
              break;
            }
            var5 = var5 != 0 | this.a((byte) -96, var6, param1) ? 1 : 0;
            var6 = (wm) (this.field_cb.c((byte) -25));
          } while (var17 == 0);
          while (var6 != null) {
            var5 = var5 != 0 | this.a((byte) -109, var6, param1) ? 1 : 0;
            var6 = (wm) (this.field_d.c((byte) 86));
            if (var17 == 0) {
              continue;
            }
            break;
          }
          var7Lifetime1 = new qm(0, 0);
          var8 = new qm(0, 0);
          var9 = new qm(0, 0);
          var10 = new qm(0, 0);
          var7Lifetime1.field_f = (int)(param1.field_w.field_g * (float)param1.field_C.field_K + ((float)param1.field_C.field_k * param1.field_w.field_j + param1.field_u));
          var7Lifetime1.field_h = (int)(-(param1.field_w.field_g * (float)param1.field_C.field_k) + param1.field_y + param1.field_w.field_j * (float)param1.field_C.field_K);
          var8.field_h = (int)((float)param1.field_C.field_K * param1.field_w.field_j + (param1.field_y + param1.field_w.field_g * (float)param1.field_C.field_k));
          var8.field_f = (int)(-((float)param1.field_C.field_k * param1.field_w.field_j) + param1.field_u + (float)param1.field_C.field_K * param1.field_w.field_g);
          var9.field_h = (int)(-((float)param1.field_C.field_K * param1.field_w.field_j) + (-((float)param1.field_C.field_k * param1.field_w.field_g) + param1.field_y));
          var9.field_f = (int)(-((float)param1.field_C.field_K * param1.field_w.field_g) + (param1.field_u + (float)param1.field_C.field_k * param1.field_w.field_j));
          var10.field_f = (int)(-((float)param1.field_C.field_k * param1.field_w.field_j) + param1.field_u - param1.field_w.field_g * (float)param1.field_C.field_K);
          var10.field_h = (int)(-((float)param1.field_C.field_K * param1.field_w.field_j) + (param1.field_y + param1.field_w.field_g * (float)param1.field_C.field_k));
          var11 = 0;
          if (!this.a(param1.field_q, var7Lifetime1.field_f, param0, var7Lifetime1.field_h)) {
            var11++;
          }
          if (!this.a(param1.field_q, var8.field_f, param0, var8.field_h)) {
            var11++;
          }
          if (!this.a(param1.field_q, var9.field_f, true, var9.field_h)) {
            var11++;
          }
          if (!this.a(param1.field_q, var10.field_f, param0, var10.field_h)) {
            var11++;
          }
          boolean decompiledSharedTail0 = (!(this.a(param1.field_q, (int)param1.field_u, true, (int)param1.field_y)) ||
            !(3 > var11));
          if (!decompiledSharedTail0) {
            param1.field_Zb.field_h = (int)param1.field_y;
            param1.field_db = 0;
            param1.field_Zb.field_f = (int)param1.field_u;
            decompiledSharedTail0 = (var17 != 0);
          }
          if (decompiledSharedTail0) {
            fieldTemp$0 = param1.field_db + 1;
            param1.field_db = param1.field_db + 1;
            if (fieldTemp$0 > 20) {
              param1.field_u = (float)param1.field_Zb.field_f;
              param1.field_y = (float)param1.field_Zb.field_h;
            }
          }
          stackIn_88_0 = var5;
          return stackIn_88_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_92_0 = var3_ref;
          stackIn_92_1 = new StringBuilder().append("sg.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        float dupTemp$0 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          var4_float = this.field_C[0].field_vb;
          var5 = ce.a(param1, this.field_sb) / (float)(param2 + 1);
          var6 = (int)var4_float;
          var7 = this.field_sb[var6].f(50);
          var8 = var7 * ((float)(1 + var6) - var4_float);
          var9 = var5;
          var10 = 0;
          L0: while (true) {
            stackIn_3_0 = ~var10;
            stackIn_3_1 = ~param2;
            if (stackIn_3_0 > stackIn_3_1) {
              while (true) {
                if (var13 != 0) {
                  return;
                }
                if (var9 > var8) {
                  var6++;
                  stackIn_3_0 = var6;
                  stackIn_3_1 = this.field_sb.length;
                  if (stackIn_3_0 == stackIn_3_1) {
                    var6 = 0;
                  }
                  var9 = var9 - var8;
                  dupTemp$0 = this.field_sb[var6].f(50);
                  var7 = dupTemp$0;
                  var8 = dupTemp$0;
                  continue;
                }
                break;
              }
              var8 = var8 - var9;
              var9 = var5;
              var11 = this.field_sb[var6].a(false, -(var8 / var7) + 1.0f);
              if (param0 == -1) {
                stackIn_21_0 = kj.b(2, 4);
              } else {
                if (3 != param0) {
                  stackIn_21_0 = 1 + param0;
                } else {
                  stackIn_21_0 = 0;
                }
              }
              var12 = stackIn_21_0;
              this.field_cb.a((byte) -91, new wm(var11, 1 + var12, -1));
              var10++;
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "sg.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(vk param0, int param1, boolean param2) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        ei var4 = null;
        RuntimeException var4_ref = null;
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
        var16 = HoldTheLine.field_D;
        try {
          if (this.field_lb == null) {
            this.field_lb = new bm(640, 480, 256);
          }
          var4_int = 0;
          while (true) {
            stackIn_7_0 = 4;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_7_0 > var4_int) {
              stackIn_47_0 = 0;
              decompiledFrameRemainder0 = (var16 == 0);
              if (decompiledFrameRemainder0) {
                var5_int = stackIn_47_0;
                while (true) {
                  stackIn_11_0 = ~var5_int;
                  stackIn_11_1 = -5;
                  if (stackIn_11_0 > stackIn_11_1) {
                    stackIn_7_0 = 0;
                    var6_int = stackIn_7_0;
                    while (var6_int < 4) {
                      var7_int = 16 * var6_int + 4 * var5_int + var4_int;
                      this.field_lb.field_n[var7_int] = 0;
                      stackIn_11_0 = ~var4_int;
                      stackIn_11_1 = -4;
                      if (stackIn_11_0 != stackIn_11_1) {
                        if (var4_int == 2) {
                          this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 128);
                        }
                      } else {
                        this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 255);
                      }
                      if (var5_int == 3) {
                        this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 65280);
                      } else {
                        if (var5_int == 2) {
                          this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 32768);
                        }
                      }
                      if (3 != var6_int) {
                        if (2 == var6_int) {
                          this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 8388608);
                        }
                      } else {
                        this.field_lb.field_n[var7_int] = kc.a(this.field_lb.field_n[var7_int], 16711680);
                      }
                      var6_int++;
                    }
                    var5_int++;
                    continue;
                  }
                  break;
                }
                var4_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_47_0 = ~this.field_r;
            }
            if (stackIn_47_0 == -4) {
              tn.a(this.field_sb, 10000536, new rk(this.field_lb, (byte) 3));
            }
            if (stackIn_47_0 != -4 ||
              var16 != 0) {
              tn.a(this.field_sb, 10000536, new rk(this.field_lb, (byte) 2));
              mn.a(this.field_sb, new rk(this.field_lb, (byte) 3), (byte) -20);
            }
            ok.a(32381);
            if (this.field_qb == null) {
              this.field_qb = new hj(640, 480);
            }
            this.field_qb.f();
            dj.a(this.field_J, param0, false);
            var4 = new ei();
            if (param1 != 28978) {
              return;
            }
            L19: {
              var5 = new ei();
              var6 = new ei();
              var7 = new ei();
              var8 = new ei();
              lf.a(var6, var8, var5, var4, this.field_sb, var7, -110);
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
                while (var14 < var10) {
                  while (true) {
                    stackIn_73_0 = $cfr$fcmpg(var13, var11);
                    if (var16 != 0) {
                      break L19;
                    }
                    if (stackIn_73_0 < 0) {
                      var11 = var11 - var13;
                      var12++;
                      var13 = this.field_sb[var12].f(param1 - 28928);
                      continue;
                    }
                    break;
                  }
                  this.field_w[var14] = var12;
                  var15 = this.field_sb[var12].a(false, var11 / var13);
                  this.field_x[var14] = var15.field_h;
                  this.field_u[var14] = var15.field_f;
                  tc.f(var15.field_h - 1, -1 + var15.field_f, 3, 3, 8421504);
                  var11 = var11 + this.field_A;
                  var14++;
                }
              }
              stackIn_73_0 = -1;
            }
            ug.b(stackIn_73_0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_78_0 = var4_ref;
          stackIn_78_1 = new StringBuilder().append("sg.QA(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(vf param0, int param1, ja param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param2.field_z &&
            param0.c((byte) -111)) {
            mo.field_q.field_h = param0.field_B + 12;
            mo.field_q.field_f = param0.field_i + 12;
            var4_int = -param2.field_A.field_h + mo.field_q.field_h;
            var5 = mo.field_q.field_f - param2.field_A.field_f;
            var6 = param2.field_B + 8;
            if ((var6 * var6) <= (var5 * var5 + var4_int * var4_int)) {
              return;
            }
            if (!ca.a(mo.field_q, param2.field_i, param2.field_A, 8, param2.field_w, param2.field_k, 83)) {
              return;
            }
            param2.field_Sb = param2.field_Sb + 1;
            param0.a(param2, (int)(param2.field_t * 8192.0f), (byte) 62, (int)(param2.field_x * 8192.0f));
            if (param1 >= -73) {
              this.field_jb = (ei) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("sg.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    sg(vk param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param3, param5, param1, (byte) 113, param4, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_Y = null;
        field_K = "Rocket boost";
        field_Z = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_v = new ah();
    }

    private static int $cfr$fcmpg(float left, float right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
