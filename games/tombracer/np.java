/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ka {
    private float[] field_y;
    private byte field_Z;
    private fd[] field_f;
    private short field_U;
    private short field_M;
    private tj field_g;
    private int field_L;
    private int[] field_K;
    private int field_N;
    private short[] field_X;
    private tj field_ab;
    private aba field_i;
    private va field_Q;
    private short[] field_z;
    private short[] field_cb;
    private sca field_jb;
    private boolean field_l;
    private short field_T;
    private tj field_F;
    private boolean field_s;
    private int[] field_p;
    private int field_G;
    private int field_bb;
    private short field_B;
    private short[] field_I;
    private int[][] field_j;
    private byte[] field_O;
    private short field_eb;
    private short field_v;
    static cn field_m;
    private short[] field_fb;
    private short field_S;
    private short[] field_hb;
    private int[][] field_C;
    private ava[] field_D;
    private byte[] field_o;
    private short[] field_H;
    private int field_u;
    static byte[] field_J;
    private short field_k;
    private short field_h;
    private tj field_kb;
    private int field_W;
    private float[] field_n;
    private short[] field_q;
    private boolean field_gb;
    private cka field_R;
    private pm[] field_r;
    private int field_lb;
    private afa field_w;
    private int field_ib;
    private int[][] field_d;
    private int[] field_e;
    private short[] field_E;
    private rga[] field_t;
    static java.awt.Image field_x;
    private int[] field_P;
    static String field_V;
    private short[] field_Y;
    private int[] field_A;
    private short[] field_db;

    private final void c(int param0) {
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
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
        int var14Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_lb <= var10))) {
            var11 = this.field_P[var10];
            var12 = this.field_K[var10];
            stackIn_33_0 = var2_int;
            stackIn_33_1 = var11;
            if (var15 == 0) {
              if (stackIn_33_0 > stackIn_33_1) {
                var2_int = var11;
              }
              if (var3 > var12) {
                var3 = var12;
              }
              if (var6 < var12) {
                var6 = var12;
              }
              var13 = this.field_A[var10];
              if (var11 > var5) {
                var5 = var11;
              }
              if (var4 > var13) {
                var4 = var13;
              }
              if (var7 < var13) {
                var7 = var13;
              }
              var14 = var13 * var13 + var11 * var11;
              if (var8 < var14) {
                var8 = var14;
              }
              var14Lifetime1 = var12 * var12 + var11 * var11 + var13 * var13;
              if (var14Lifetime1 > var9) {
                var9 = var14Lifetime1;
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = param0;
            stackIn_33_1 = 2709;
          }
          if (stackIn_33_0 != stackIn_33_1) {
            return;
          }
          this.field_k = (short)var4;
          this.field_T = (short)var5;
          this.field_S = (short)var7;
          this.field_eb = (short)var3;
          this.field_U = (short)var2_int;
          this.field_v = (short)var6;
          this.field_M = (short)(int)(0.99 + Math.sqrt((double)var8));
          Math.sqrt((double)var9);
          this.field_l = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.S(" + param0 + ')');
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_lb <= var4_int))) {
            if (var5 == 0) {
              if (0 != param0) {
                this.field_P[var4_int] = this.field_P[var4_int] + param0;
              }
              if (0 != param1) {
                this.field_K[var4_int] = this.field_K[var4_int] + param1;
              }
              if (param2 != 0) {
                this.field_A[var4_int] = this.field_A[var4_int] + param2;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_l = false;
          }
          if (this.field_g != null) {
            this.field_g.field_d = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1, byte param2, short param3, int param4) {
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        dw var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = cla.field_m[qp.c(param1, param4, 117)];
          if (param3 != -1) {
            var7 = this.field_R.field_c.a((byte) -79, 65535 & param3);
            var8 = 255 & var7.field_c;
            if (var8 != 0) {
              if (param4 < 0) {
                var9 = 0;
                if (var13 != 0) {
                  if (param4 <= 127) {
                    var9 = param4 * 131586;
                    var9 = 16777215;
                  } else {
                    var9 = 16777215;
                  }
                }
              } else {
                if (param4 <= 127) {
                  var9 = param4 * 131586;
                  if (var13 != 0) {
                    var9 = 16777215;
                  }
                } else {
                  var9 = 16777215;
                }
              }
              if (var8 != 256) {
                var10 = var8;
                var11 = 256 - var8;
                var6_int = (-16711936 & (16711935 & var9) * var10 + (16711935 & var6_int) * var11) + (16711680 & var11 * (65280 & var6_int) + (65280 & var9) * var10) >> 8;
                if (var13 != 0) {
                  var6_int = var9;
                }
              } else {
                var6_int = var9;
              }
            }
            var9Lifetime1 = 255 & var7.field_i;
            if (0 != var9Lifetime1) {
              var9Lifetime1 += 256;
              var10Lifetime1 = (var6_int >> 16 & 255) * var9Lifetime1;
              if (var10Lifetime1 > 65535) {
                var10Lifetime1 = 65535;
              }
              var11Lifetime1 = var9Lifetime1 * ((65280 & var6_int) >> 8);
              if (var11Lifetime1 > 65535) {
                var11Lifetime1 = 65535;
              }
              var12 = var9Lifetime1 * (var6_int & 255);
              if (var12 > 65535) {
                var12 = 65535;
              }
              var6_int = (var12 >> 8) + ((16711843 & var10Lifetime1 << 8) + (65280 & var11Lifetime1));
            }
          }
          if (param0 != -2117016184) {
            this.b();
          }
          stackIn_31_0 = (var6_int << 8) + 255 - (param2 & 255);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "np.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void FA(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = qu.field_b[param0];
          var3 = qu.field_d[param0];
          var4 = 0;
          do {
            if (this.field_lb <= var4) {
              this.field_l = false;
              break;
            }
            var5 = this.field_K[var4] * var3 - var2_int * this.field_A[var4] >> 14;
            this.field_A[var4] = var3 * this.field_A[var4] + var2_int * this.field_K[var4] >> 14;
            this.field_K[var4] = var5;
            var4++;
          } while (var6 == 0);
          if (this.field_g != null) {
            this.field_g.field_d = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.FA(" + param0 + ')');
        }
    }

    private final short a(long param0, int param1, int param2, int param3, byte param4, int param5, int param6, float param7, oc param8, float param9) {
        int fieldTemp$0 = 0;
        short stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        short stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          var12_int = this.field_e[param5];
          var13 = this.field_e[1 + param5];
          var14 = 0;
          var15 = var12_int;
          L1: while (true) {
            if (var15 < var13) {
              var16 = this.field_q[var15];
              stackIn_18_0 = var16;
              if (var17 != 0) {
                break L1;
              }
              if (stackIn_18_0 == 0) {
                var14 = var15;
              } else {
                if (~qka.field_m[var15] == ~param0) {
                  stackIn_15_0 = (short)(-1 + var16);
                  return stackIn_15_0;
                }
                var15++;
                continue;
              }
            }
            this.field_q[var14] = (short)(1 + this.field_L);
            qka.field_m[var14] = param0;
            this.field_E[this.field_L] = (short)param6;
            stackIn_18_0 = param4;
            break;
          }
          if (stackIn_18_0 != -40) {
            this.field_s = true;
          }
          this.field_Y[this.field_L] = (short)param2;
          this.field_cb[this.field_L] = (short)param1;
          this.field_O[this.field_L] = (byte)param3;
          this.field_n[this.field_L] = param9;
          this.field_y[this.field_L] = param7;
          fieldTemp$0 = this.field_L;
          this.field_L = this.field_L + 1;
          stackIn_22_0 = (short)fieldTemp$0;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_26_0 = var12;
          stackIn_26_1 = new StringBuilder().append("np.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param9).append(')').toString());
        }
    }

    private final ka a(boolean param0, int param1, boolean param2, int param3, np param4, np param5) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        short[] array$3 = null;
        byte[] array$4 = null;
        short[] array$5 = null;
        short[] array$6 = null;
        short[] array$7 = null;
        aba fieldTemp$8 = null;
        float[] array$9 = null;
        float[] array$10 = null;
        short[] array$11 = null;
        short[] array$12 = null;
        short[] array$13 = null;
        short[] array$14 = null;
        fd[] array$15 = null;
        int stackIn_79_0 = 0;
        np stackIn_326_0 = null;
        RuntimeException stackIn_330_0 = null;
        StringBuilder stackIn_330_1 = null;
        String stackIn_331_2 = null;
        StringBuilder stackIn_334_1 = null;
        String stackIn_335_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        aba var11_ref_aba = null;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var12Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          param5.field_h = this.field_h;
          if ((param1 & 256) != 0) {
            param5.field_s = true;
          }
          if ((param1 & 256) == 0 ||
            var13 != 0) {
            param5.field_s = this.field_s;
          }
          param5.field_N = this.field_N;
          param5.field_bb = param1;
          param5.field_B = this.field_B;
          param5.field_Z = (byte) 0;
          param5.field_u = this.field_u;
          param5.field_G = this.field_G;
          param5.field_W = this.field_W;
          param5.field_ib = this.field_ib;
          param5.field_L = this.field_L;
          param5.field_lb = this.field_lb;
          var7_int = jj.a(this.field_u, param1, -32842) ? 1 : 0;
          var8 = mg.a((byte) -53, this.field_u, param1) ? 1 : 0;
          var9 = gha.a(this.field_u, param1, param3 ^ -22830) ? 1 : 0;
          var10 = var8 | var7_int | var9;
          if (param3 != -22857) {
            this.field_q = (short[]) null;
          }
          boolean decompiledFrameCompleted9 = true;
          if (var10 == 0) {
            param5.field_A = this.field_A;
            param5.field_K = this.field_K;
            param5.field_P = this.field_P;
          }
          if (var10 != 0 ||
            var13 != 0) {
            if (var7_int == 0) {
              param5.field_P = this.field_P;
              if (var13 != 0) {
                if (param4.field_P != null &&
                  this.field_N <= param4.field_P.length) {
                  param5.field_P = param4.field_P;
                  array$0 = new int[this.field_N];
                  param4.field_P = array$0;
                  param5.field_P = array$0;
                } else {
                  array$0 = new int[this.field_N];
                  param4.field_P = array$0;
                  param5.field_P = array$0;
                }
              }
            } else {
              if (param4.field_P != null &&
                this.field_N <= param4.field_P.length) {
                param5.field_P = param4.field_P;
                if (var13 != 0) {
                  array$0 = new int[this.field_N];
                  param4.field_P = array$0;
                  param5.field_P = array$0;
                }
              } else {
                array$0 = new int[this.field_N];
                param4.field_P = array$0;
                param5.field_P = array$0;
              }
            }
            if (var8 == 0) {
              param5.field_K = this.field_K;
              if (var13 != 0) {
                if (null != param4.field_K &&
                  this.field_N <= param4.field_K.length) {
                  param5.field_K = param4.field_K;
                  array$1 = new int[this.field_N];
                  param4.field_K = array$1;
                  param5.field_K = array$1;
                } else {
                  array$1 = new int[this.field_N];
                  param4.field_K = array$1;
                  param5.field_K = array$1;
                }
              }
            } else {
              if (null != param4.field_K &&
                this.field_N <= param4.field_K.length) {
                param5.field_K = param4.field_K;
                if (var13 != 0) {
                  array$1 = new int[this.field_N];
                  param4.field_K = array$1;
                  param5.field_K = array$1;
                }
              } else {
                array$1 = new int[this.field_N];
                param4.field_K = array$1;
                param5.field_K = array$1;
              }
            }
            if (var9 != 0) {
              if (param4.field_A == null ||
                !(param4.field_A.length >= this.field_N)) {
                array$2 = new int[this.field_N];
                param4.field_A = array$2;
                param5.field_A = array$2;
                if (var13 != 0) {
                  param5.field_A = param4.field_A;
                  param5.field_A = this.field_A;
                }
              } else {
                param5.field_A = param4.field_A;
                if (var13 != 0) {
                  param5.field_A = this.field_A;
                }
              }
            } else {
              param5.field_A = this.field_A;
            }
            var11 = 0;
            while (var11 < this.field_N) {
              stackIn_79_0 = var7_int;
              if (var13 != 0) {
                decompiledFrameCompleted9 = false;
                break;
              }
              if (stackIn_79_0 != 0) {
                param5.field_P[var11] = this.field_P[var11];
              }
              if (var8 != 0) {
                param5.field_K[var11] = this.field_K[var11];
              }
              if (var9 != 0) {
                param5.field_A[var11] = this.field_A[var11];
              }
              var11++;
            }
          }
          if (decompiledFrameCompleted9) {
            stackIn_79_0 = so.a(param1, (byte) -106, this.field_u) ? 1 : 0;
          }
          if (stackIn_79_0 == 0) {
            if (!hha.a(this.field_u, 0, param1)) {
              param5.field_g = null;
              if (var13 != 0) {
                param5.field_g = this.field_g;
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 1);
                }
                param5.field_g = param4.field_g;
                param5.field_g.field_d = this.field_g.field_d;
                param5.field_g.field_g = this.field_g.field_g;
              }
            } else {
              param5.field_g = this.field_g;
              if (var13 != 0) {
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 1);
                }
                param5.field_g = param4.field_g;
                param5.field_g.field_d = this.field_g.field_d;
                param5.field_g.field_g = this.field_g.field_g;
              }
            }
          } else {
            if (param2) {
              param5.field_Z = (byte)(param5.field_Z | 1);
            }
            param5.field_g = param4.field_g;
            param5.field_g.field_d = this.field_g.field_d;
            param5.field_g.field_g = this.field_g.field_g;
          }
          boolean decompiledFrameCompleted8 = true;
          if (o.a(-1, this.field_u, param1)) {
            if (null == param4.field_X ||
              !(this.field_W <= param4.field_X.length)) {
              array$3 = new short[this.field_W];
              param4.field_X = array$3;
              param5.field_X = array$3;
              if (var13 != 0) {
                param5.field_X = param4.field_X;
              }
            } else {
              param5.field_X = param4.field_X;
            }
            var11Lifetime1 = 0;
            while (var11Lifetime1 < this.field_W) {
              param5.field_X[var11Lifetime1] = this.field_X[var11Lifetime1];
              var11Lifetime1++;
              if (var13 != 0) {
                decompiledFrameCompleted8 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted8) &&
              (var13 != 0)) {
              param5.field_X = this.field_X;
            }
          } else {
            param5.field_X = this.field_X;
          }
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameRemainder2 = true;
          if (!mpa.a(false, this.field_u, param1)) {
            param5.field_o = this.field_o;
            decompiledFrameRemainder2 = (var13 != 0);
          }
          if (decompiledFrameRemainder2) {
            if (null == param4.field_o ||
              !(param4.field_o.length >= this.field_W)) {
              array$4 = new byte[this.field_W];
              param4.field_o = array$4;
              param5.field_o = array$4;
              if (var13 != 0) {
                param5.field_o = param4.field_o;
              }
            } else {
              param5.field_o = param4.field_o;
            }
            var11Lifetime2 = 0;
            while (this.field_W > var11Lifetime2) {
              param5.field_o[var11Lifetime2] = this.field_o[var11Lifetime2];
              var11Lifetime2++;
              if (var13 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted7) &&
            (vua.e(param1, this.field_u, 13650))) {
            if (param2) {
              param5.field_Z = (byte)(param5.field_Z | 2);
            }
            param5.field_kb = param4.field_kb;
            param5.field_kb.field_d = this.field_kb.field_d;
            param5.field_kb.field_g = this.field_kb.field_g;
            decompiledFrameRemainder3 = (var13 != 0);
          }
          if (decompiledFrameRemainder3) {
            if (we.b(param1, this.field_u, 2048)) {
              param5.field_kb = this.field_kb;
              if (var13 != 0) {
                param5.field_kb = null;
              }
            } else {
              param5.field_kb = null;
            }
          }
          L41: {
            boolean decompiledFrameCompleted5 = true;
            if (!cra.a(this.field_u, -17, param1)) {
              param5.field_O = this.field_O;
              param5.field_i = this.field_i;
              param5.field_Y = this.field_Y;
              param5.field_cb = this.field_cb;
              param5.field_E = this.field_E;
              if (var13 == 0) {
                break L41;
              }
            }
            L43: {
              if (param4.field_E != null &&
                param4.field_E.length >= this.field_L) {
                param5.field_Y = param4.field_Y;
                param5.field_E = param4.field_E;
                param5.field_cb = param4.field_cb;
                if (var13 == 0) {
                  break L43;
                }
              }
              var11Lifetime3 = this.field_L;
              array$5 = new short[var11Lifetime3];
              param4.field_Y = array$5;
              param5.field_Y = array$5;
              array$6 = new short[var11Lifetime3];
              param4.field_E = array$6;
              param5.field_E = array$6;
              array$7 = new short[var11Lifetime3];
              param4.field_cb = array$7;
              param5.field_cb = array$7;
            }
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted6 = true;
            if (null == this.field_i) {
              var11Lifetime3 = 0;
              while (var11Lifetime3 < this.field_L) {
                param5.field_E[var11Lifetime3] = this.field_E[var11Lifetime3];
                param5.field_Y[var11Lifetime3] = this.field_Y[var11Lifetime3];
                param5.field_cb[var11Lifetime3] = this.field_cb[var11Lifetime3];
                var11Lifetime3++;
                if (var13 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted6) {
                decompiledFrameRemainder1 = (var13 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted6)) {
              if (null == param4.field_i) {
                param4.field_i = new aba();
              }
              fieldTemp$8 = param4.field_i;
              param5.field_i = param4.field_i;
              var11_ref_aba = fieldTemp$8;
              if (var11_ref_aba.field_d == null ||
                !(this.field_L <= var11_ref_aba.field_d.length)) {
                var12 = this.field_L;
                var11_ref_aba.field_f = new short[var12];
                var11_ref_aba.field_e = new byte[var12];
                var11_ref_aba.field_d = new short[var12];
                var11_ref_aba.field_b = new short[var12];
              }
              var12 = 0;
              while (this.field_L > var12) {
                param5.field_E[var12] = this.field_E[var12];
                param5.field_Y[var12] = this.field_Y[var12];
                param5.field_cb[var12] = this.field_cb[var12];
                var11_ref_aba.field_d[var12] = this.field_i.field_d[var12];
                var11_ref_aba.field_b[var12] = this.field_i.field_b[var12];
                var11_ref_aba.field_f[var12] = this.field_i.field_f[var12];
                var11_ref_aba.field_e[var12] = this.field_i.field_e[var12];
                var12++;
                if (var13 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted5) {
              param5.field_O = this.field_O;
            }
          }
          if (!ooa.a(this.field_u, param1, -100)) {
            if (kb.a(this.field_u, param1, (byte) 17)) {
              param5.field_F = this.field_F;
              if (var13 != 0) {
                param5.field_F = null;
                param5.field_F = param4.field_F;
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 4);
                }
                param5.field_F.field_g = this.field_F.field_g;
                param5.field_F.field_d = this.field_F.field_d;
              }
            } else {
              param5.field_F = null;
              if (var13 != 0) {
                param5.field_F = param4.field_F;
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 4);
                }
                param5.field_F.field_g = this.field_F.field_g;
                param5.field_F.field_d = this.field_F.field_d;
              }
            }
          } else {
            param5.field_F = param4.field_F;
            if (param2) {
              param5.field_Z = (byte)(param5.field_Z | 4);
            }
            param5.field_F.field_g = this.field_F.field_g;
            param5.field_F.field_d = this.field_F.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted4 = true;
          L59: {
            if (!hh.a(param1, (byte) 5, this.field_u)) {
              param5.field_n = this.field_n;
              param5.field_y = this.field_y;
              if (var13 == 0) {
                break L59;
              }
            }
            if (null == param4.field_n ||
              !(param4.field_n.length >= this.field_W)) {
              var11Lifetime4 = this.field_L;
              array$9 = new float[var11Lifetime4];
              param4.field_y = array$9;
              param5.field_y = array$9;
              array$10 = new float[var11Lifetime4];
              param4.field_n = array$10;
              param5.field_n = array$10;
              if (var13 != 0) {
                param5.field_n = param4.field_n;
                param5.field_y = param4.field_y;
              }
            } else {
              param5.field_n = param4.field_n;
              param5.field_y = param4.field_y;
            }
            var11Lifetime4 = 0;
            while (this.field_L > var11Lifetime4) {
              param5.field_n[var11Lifetime4] = this.field_n[var11Lifetime4];
              param5.field_y[var11Lifetime4] = this.field_y[var11Lifetime4];
              var11Lifetime4++;
              if (var13 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted4) {
            if (!upa.a(this.field_u, 0, param1)) {
              if (!wu.a(-17, this.field_u, param1)) {
                param5.field_ab = null;
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if (decompiledFrameRemainder0) {
                param5.field_ab = this.field_ab;
                decompiledFrameRemainder0 = (var13 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              param5.field_ab = param4.field_ab;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param2) {
              param5.field_Z = (byte)(param5.field_Z | 8);
            }
            param5.field_ab.field_g = this.field_ab.field_g;
            param5.field_ab.field_d = this.field_ab.field_d;
          }
          boolean decompiledFrameCompleted3 = true;
          if (qp.a(param1, (byte) -71, this.field_u)) {
            L70: {
              if (param4.field_H != null &&
                param4.field_H.length >= this.field_W) {
                param5.field_z = param4.field_z;
                param5.field_H = param4.field_H;
                param5.field_hb = param4.field_hb;
                if (var13 == 0) {
                  break L70;
                }
              }
              var11Lifetime5 = this.field_W;
              array$11 = new short[var11Lifetime5];
              param4.field_hb = array$11;
              param5.field_hb = array$11;
              array$12 = new short[var11Lifetime5];
              param4.field_H = array$12;
              param5.field_H = array$12;
              array$13 = new short[var11Lifetime5];
              param4.field_z = array$13;
              param5.field_z = array$13;
            }
            var11Lifetime5 = 0;
            while (var11Lifetime5 < this.field_W) {
              param5.field_H[var11Lifetime5] = this.field_H[var11Lifetime5];
              param5.field_z[var11Lifetime5] = this.field_z[var11Lifetime5];
              param5.field_hb[var11Lifetime5] = this.field_hb[var11Lifetime5];
              var11Lifetime5++;
              if (var13 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted3) &&
              (var13 != 0)) {
              param5.field_hb = this.field_hb;
              param5.field_z = this.field_z;
              param5.field_H = this.field_H;
            }
          } else {
            param5.field_hb = this.field_hb;
            param5.field_z = this.field_z;
            param5.field_H = this.field_H;
          }
          if (!tia.b(this.field_u, -23403, param1)) {
            if (!mm.a(-123, param1, this.field_u)) {
              param5.field_w = null;
              if (var13 != 0) {
                param5.field_w = this.field_w;
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 16);
                }
                param5.field_w = param4.field_w;
                param5.field_w.field_a = this.field_w.field_a;
              }
            } else {
              param5.field_w = this.field_w;
              if (var13 != 0) {
                if (param2) {
                  param5.field_Z = (byte)(param5.field_Z | 16);
                }
                param5.field_w = param4.field_w;
                param5.field_w.field_a = this.field_w.field_a;
              }
            }
          } else {
            if (param2) {
              param5.field_Z = (byte)(param5.field_Z | 16);
            }
            param5.field_w = param4.field_w;
            param5.field_w.field_a = this.field_w.field_a;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          L79: {
            boolean decompiledFrameCompleted2 = true;
            L81: {
              if (!aca.a(param1, 32768, this.field_u)) {
                param5.field_I = this.field_I;
                if (var13 == 0) {
                  break L81;
                }
              }
              if (null == param4.field_I ||
                !(param4.field_I.length >= this.field_W)) {
                var11Lifetime6 = this.field_W;
                array$14 = new short[var11Lifetime6];
                param4.field_I = array$14;
                param5.field_I = array$14;
                if (var13 != 0) {
                  param5.field_I = param4.field_I;
                }
              } else {
                param5.field_I = param4.field_I;
              }
              var11Lifetime6 = 0;
              while (var11Lifetime6 < this.field_W) {
                param5.field_I[var11Lifetime6] = this.field_I[var11Lifetime6];
                var11Lifetime6++;
                if (var13 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted2) &&
              (!qba.a(this.field_u, 480, param1))) {
              param5.field_f = this.field_f;
              if (var13 == 0) {
                break L79;
              }
            }
            if (null != param4.field_f &&
              this.field_G <= param4.field_f.length) {
              param5.field_f = param4.field_f;
              var11Lifetime6 = 0;
              while (this.field_G > var11Lifetime6) {
                param5.field_f[var11Lifetime6].a(167, this.field_f[var11Lifetime6]);
                var11Lifetime6++;
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (var13 == 0)) {
                break L79;
              }
            }
            if (decompiledFrameCompleted1) {
              var11Lifetime6 = this.field_G;
              array$15 = new fd[var11Lifetime6];
              param4.field_f = array$15;
              param5.field_f = array$15;
              var12Lifetime1 = 0;
              while (this.field_G > var12Lifetime1) {
                param5.field_f[var12Lifetime1] = this.field_f[var12Lifetime1].a((byte) 78);
                var12Lifetime1++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            param5.field_j = this.field_j;
            param5.field_q = this.field_q;
          }
          boolean decompiledSharedTail0 = (this.field_l);
          if (!decompiledSharedTail0) {
            param5.field_l = false;
            decompiledSharedTail0 = (var13 != 0);
          }
          if (decompiledSharedTail0) {
            param5.field_v = this.field_v;
            param5.field_S = this.field_S;
            param5.field_l = true;
            param5.field_k = this.field_k;
            param5.field_U = this.field_U;
            param5.field_eb = this.field_eb;
            param5.field_M = this.field_M;
            param5.field_T = this.field_T;
          }
          param5.field_t = this.field_t;
          param5.field_D = this.field_D;
          param5.field_r = this.field_r;
          param5.field_db = this.field_db;
          param5.field_C = this.field_C;
          param5.field_e = this.field_e;
          param5.field_p = this.field_p;
          param5.field_fb = this.field_fb;
          param5.field_d = this.field_d;
          stackIn_326_0 = (np) (param5);
          return (ka) ((Object) stackIn_326_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_330_0 = var7;
          stackIn_330_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_331_2 = "null";
          } else {
            stackIn_331_2 = "{...}";
          }
          stackIn_334_1 = ((StringBuilder) (Object) stackIn_330_1).append(stackIn_331_2).append(',');
          if (param5 == null) {
            stackIn_335_2 = "null";
          } else {
            stackIn_335_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_330_0), ((StringBuilder) (Object) stackIn_334_1).append(stackIn_335_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        qf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if ((this.field_ib * 6) <= this.field_R.field_cb.field_g.length) {
            this.field_R.field_cb.field_h = 0;
            if (var5 != 0) {
              this.field_R.field_cb = new qf((this.field_ib + 100) * 6);
            }
          } else {
            this.field_R.field_cb = new qf((this.field_ib + 100) * 6);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          var3 = this.field_R.field_cb;
          if (!this.field_R.field_O) {
            var4 = 0;
            while (this.field_ib > var4) {
              var3.d((int) this.field_H[var4], -87);
              var3.d((int) this.field_z[var4], 124);
              var3.d((int) this.field_hb[var4], 120);
              var4++;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            var4Lifetime1 = 0;
            while (this.field_ib > var4Lifetime1) {
              var3.f(-1477662136, (int) this.field_H[var4Lifetime1]);
              var3.f(-1477662136, (int) this.field_z[var4Lifetime1]);
              var3.f(-1477662136, (int) this.field_hb[var4Lifetime1]);
              var4Lifetime1++;
              if (var5 != 0) {
                return;
              }
            }
          }
          if (0 != var3.field_h) {
            if (param0 > 0) {
              this.I(68, (int[]) null, -92, 111, -30, false, -95, (int[]) null);
            }
            if (param1) {
              if (null == this.field_jb) {
                this.field_jb = this.field_R.a(-81, var3.field_h, 5123, true, var3.field_g);
                if (var5 != 0) {
                  this.field_jb.a(var3.field_h, -11783, var3.field_g, 5123);
                }
              } else {
                this.field_jb.a(var3.field_h, -11783, var3.field_g, 5123);
              }
              this.field_w.field_a = this.field_jb;
            }
            if (!param1 ||
              var5 != 0) {
              this.field_w.field_a = this.field_R.a(-56, var3.field_h, 5123, false, var3.field_g);
            }
            if (!param1) {
              this.field_gb = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "np.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        pm var6 = null;
        int var7_int = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pm var6Lifetime1;
        fd var7Lifetime1;
        int stackIn_23_0Lifetime1;
        int stackIn_23_1Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          L2: while (true) {
            if (var5_int < this.field_W) {
              var6_int = 65535 & this.field_X[var5_int];
              var7_int = (var6_int & 65466) >> 10;
              var8 = (var6_int & 905) >> 7;
              var9 = 127 & var6_int;
              stackIn_23_0 = 0;
              stackIn_23_1 = ~param0;
              if (var10 != 0) {
                if (stackIn_23_0 < stackIn_23_1) {
                  var6 = this.field_r[var5_int];
                  var7 = this.field_f[var5_int];
                  var7.field_c = 16777215 & cla.field_m[this.field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                  var5_int++;
                  return;
                }
                break L2;
              }
              if (stackIn_23_0 != stackIn_23_1) {
                var7_int = var7_int + ((param0 - var7_int) * param3 >> 7);
              }
              if (param1 != -1) {
                var8 = var8 + ((-var8 + param1) * param3 >> 7);
              }
              if (-1 != param2) {
                var9 = ((-var9 + param2) * param3 >> 7) + var9;
              }
              this.field_X[var5_int] = (short)fh.a(fh.a(var7_int << 10, var8 << 7), var9);
              var5_int++;
              continue;
            }
            if (this.field_r == null) {
              break L2;
            }
            var5_int = 0;
            while (true) {
              stackIn_23_0Lifetime1 = var5_int;
              stackIn_23_1Lifetime1 = this.field_G;
              if (stackIn_23_0Lifetime1 >= stackIn_23_1Lifetime1) {
                break;
              }
              var6Lifetime1 = this.field_r[var5_int];
              var7Lifetime1 = this.field_f[var5_int];
              var7Lifetime1.field_c = 16777215 & cla.field_m[this.field_X[var6Lifetime1.field_l] & 65535] | -16777216 & var7Lifetime1.field_c;
              var5_int++;
              if (var10 != 0) {
                return;
              }
            }
            break;
          }
          if (this.field_kb != null) {
            this.field_kb.field_d = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "np.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        np dupTemp$0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_23_2 = 0;
        Object stackIn_24_0;
        boolean stackIn_24_3;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        np var4 = null;
        RuntimeException var4_ref = null;
        np var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 1) {
            if (param0 == 2) {
              var4 = this.field_R.field_Nb;
              var5 = this.field_R.field_eb;
            }
            if (param0 != 2 ||
              var6 != 0) {
              if (param0 == 3) {
                var4 = this.field_R.field_Ub;
                var5 = this.field_R.field_sc;
              }
              if (param0 != 3 ||
                var6 != 0) {
                if (4 != param0) {
                  if (param0 == 5) {
                    var5 = this.field_R.field_Xb;
                    var4 = this.field_R.field_yb;
                    if (var6 != 0) {
                      dupTemp$0 = new np(this.field_R);
                      var5 = dupTemp$0;
                      var4 = dupTemp$0;
                      var5 = this.field_R.field_D;
                      var4 = this.field_R.field_E;
                      var4 = this.field_R.field_w;
                      var5 = this.field_R.field_i;
                    }
                  } else {
                    dupTemp$0 = new np(this.field_R);
                    var5 = dupTemp$0;
                    var4 = dupTemp$0;
                    if (var6 != 0) {
                      var5 = this.field_R.field_D;
                      var4 = this.field_R.field_E;
                      var4 = this.field_R.field_w;
                      var5 = this.field_R.field_i;
                    }
                  }
                } else {
                  var5 = this.field_R.field_D;
                  var4 = this.field_R.field_E;
                  if (var6 != 0) {
                    var4 = this.field_R.field_w;
                    var5 = this.field_R.field_i;
                  }
                }
              }}} else {
            var4 = this.field_R.field_w;
            var5 = this.field_R.field_i;
          }
          stackIn_23_1 = param2;
          stackIn_23_2 = param1;
          if (param0 == 0) {
            stackIn_24_0 = this;
            stackIn_24_3 = false;
          } else {
            stackIn_24_0 = this;
            stackIn_24_3 = true;
          }
          stackIn_25_0 = this.a(stackIn_23_1, stackIn_23_2, stackIn_24_3, -22857, var5, var4);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "np.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(gda param0, el param1, int param2, int param3) {
        oba var5 = null;
        oba var6 = null;
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
        int var23 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_L == 0) {
            return;
          }
          var5 = this.field_R.field_jd;
          if (!this.field_l) {
            this.c(2709);
          }
          var6 = (oba) (param0);
          it.field_a = var6.field_h * var5.field_q + (var5.field_j * var6.field_k + var5.field_h * var6.field_r);
          bja.field_b = var5.field_o + (var6.field_o * var5.field_q + (var6.field_p * var5.field_h + var5.field_j * var6.field_m));
          var7 = bja.field_b + it.field_a * (float)this.field_eb;
          var8 = bja.field_b + it.field_a * (float)this.field_v;
          if (!(var7 > var8)) {
            var10 = var8 + (float)this.field_M;
            var9 = (float)(-this.field_M) + var7;
          }
          if (var7 > var8 ||
            var23 != 0) {
            var10 = (float)this.field_M + var7;
            var9 = (float)(-this.field_M) + var8;
          }
          if (this.field_R.field_m <= var9) {
            return;
          }
          if (var10 <= (float)this.field_R.field_Gc) {
            return;
          }
          eqa.field_a = var5.field_k * var6.field_r + var6.field_k * var5.field_l + var6.field_h * var5.field_s;
          aka.field_B = var5.field_s * var6.field_o + (var6.field_p * var5.field_k + var5.field_l * var6.field_m) + var5.field_m;
          var11 = aka.field_B + eqa.field_a * (float)this.field_eb;
          var12 = (float)this.field_v * eqa.field_a + aka.field_B;
          if (!(var11 > var12)) {
            var14 = (var12 + (float)this.field_M) * (float)this.field_R.field_W;
            var13 = (float)this.field_R.field_W * (var11 - (float)this.field_M);
          }
          if (var11 > var12 ||
            var23 != 0) {
            var14 = (var11 + (float)this.field_M) * (float)this.field_R.field_W;
            var13 = (var12 - (float)this.field_M) * (float)this.field_R.field_W;
          }
          if (this.field_R.field_od <= var13 / (float)param2) {
            return;
          }
          if (this.field_R.field_s >= var14 / (float)param2) {
            return;
          }
          nw.field_u = var5.field_g * var6.field_h + (var5.field_i * var6.field_k + var6.field_r * var5.field_r);
          ef.field_s = var5.field_p + (var6.field_o * var5.field_g + (var6.field_p * var5.field_r + var5.field_i * var6.field_m));
          var15 = ef.field_s + nw.field_u * (float)this.field_eb;
          var16 = (float)this.field_v * nw.field_u + ef.field_s;
          if (var15 > var16) {
            var18 = (float)this.field_R.field_kb * (var15 + (float)this.field_M);
            var17 = (float)this.field_R.field_kb * (var16 - (float)this.field_M);
          }
          if (!(var15 > var16) ||
            var23 != 0) {
            var17 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
            var18 = (var16 + (float)this.field_M) * (float)this.field_R.field_kb;
          }
          if (this.field_R.field_Db <= var17 / (float)param2) {
            return;
          }
          if (this.field_R.field_nd >= var18 / (float)param2) {
            return;
          }
          if (null != param1 ||
            null != this.field_r) {
            is.field_Ab = var5.field_l * var6.field_l + var5.field_k * var6.field_i + var6.field_j * var5.field_s;
            roa.field_u = var6.field_l * var5.field_j + var5.field_h * var6.field_i + var6.field_j * var5.field_q;
            mu.field_ub = var6.field_q * var5.field_s + (var5.field_l * var6.field_s + var5.field_k * var6.field_g);
            bva.field_c = var6.field_q * var5.field_g + (var6.field_g * var5.field_r + var6.field_s * var5.field_i);
            qi.field_L = var6.field_i * var5.field_r + var5.field_i * var6.field_l + var5.field_g * var6.field_j;
            kka.field_q = var5.field_h * var6.field_g + var6.field_s * var5.field_j + var6.field_q * var5.field_q;
          }
          if (null != param1) {
            var19 = this.field_U + this.field_T >> 1;
            var20 = this.field_k + this.field_S >> 1;
            var21 = (int)(it.field_a * (float)this.field_eb + (roa.field_u * (float)var19 + bja.field_b) + kka.field_q * (float)var20);
            var22 = (int)((float)var20 * kka.field_q + (it.field_a * (float)this.field_v + (roa.field_u * (float)var19 + bja.field_b)));
            if (var21 < this.field_R.field_Gc &&
              this.field_R.field_Gc <= var22) {
            }
          }
          this.field_R.a((byte) 88, (float)param2);
          this.field_R.j((byte) -121);
          this.field_R.b(var6, 112);
          this.a(false);
          this.field_R.n((byte) -91);
          this.b((byte) -30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("np.Q(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_108_0 = 0;
        Object stackIn_112_0 = null;
        short[] stackIn_112_1 = null;
        Object stackIn_140_0 = null;
        int stackIn_155_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        RuntimeException stackIn_435_0 = null;
        StringBuilder stackIn_435_1 = null;
        String stackIn_436_2 = null;
        StringBuilder stackIn_439_1 = null;
        String stackIn_440_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        int var12_int = 0;
        int[] var12 = null;
        fd var12_ref = null;
        int var13 = 0;
        int[] var13_ref_int__ = null;
        int var14_int = 0;
        fd var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35_int = 0;
        int[] var35 = null;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        Object stackIn_112_0Lifetime1;
        short[] stackIn_112_1Lifetime1;
        Object stackIn_140_0Lifetime1;
        int stackIn_101_0Lifetime1;
        int stackIn_101_1Lifetime1;
        int stackIn_108_0Lifetime1;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          var9_int = param1.length;
          if (param0 == 0) {
            param4 = param4 << 4;
            param2 = param2 << 4;
            param3 = param3 << 4;
            rp.field_i = 0;
            var10 = 0;
            dj.field_b = 0;
            via.field_e = 0;
            var11 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var9_int <= var11))) {
              var12_int = param1[var11];
              stackIn_27_0 = ~var12_int;
              stackIn_27_1 = ~this.field_d.length;
              if (var47 == 0) {
                if (stackIn_27_0 > stackIn_27_1) {
                  var13_ref_int__ = this.field_d[var12_int];
                  var14_int = 0;
                  while (var14_int < var13_ref_int__.length) {
                    var15 = var13_ref_int__[var14_int];
                    if (null == this.field_db ||
                      (param6 & this.field_db[var15]) != 0) {
                      rp.field_i = rp.field_i + this.field_P[var15];
                      via.field_e = via.field_e + this.field_K[var15];
                      dj.field_b = dj.field_b + this.field_A[var15];
                      var10++;
                    }
                    var14_int++;
                  }
                }
                var11++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_27_0 = -1;
              stackIn_27_1 = ~var10;
            }
            if (stackIn_27_0 <= stackIn_27_1) {
              via.field_e = param3;
              dj.field_b = param4;
              rp.field_i = param2;
              if (var47 == 0) {
                return;
              }
            }
            via.field_e = param3 + via.field_e / var10;
            dj.field_b = dj.field_b / var10 + param4;
            rp.field_i = param2 + rp.field_i / var10;
            vea.field_b = true;
            return;
          }
          if (param0 == 1) {
            if (param7 != null) {
              var10 = 8192 + (param2 * param7[0] - (-(param3 * param7[1]) - param7[2] * param4)) >> 14;
              var11 = 8192 + param7[4] * param3 + (param7[3] * param2 + param7[5] * param4) >> 14;
              var12_int = param7[6] * param2 + (param7[7] * param3 + param4 * param7[8] + 8192) >> 14;
              param4 = var12_int;
              param3 = var11;
              param2 = var10;
            }
            param2 = param2 << 4;
            param4 = param4 << 4;
            param3 = param3 << 4;
            var10 = 0;
            L1: while (var9_int > var10) {
              var11 = param1[var10];
              L3: while (this.field_d.length > var11) {
                var12 = this.field_d[var11];
                var13 = 0;
                while (var12.length > var13) {
                  var14_int = var12[var13];
                  if (var47 != 0) {
                    continue L3;
                  }
                  if (this.field_db == null ||
                    (param6 & this.field_db[var14_int]) != 0 ||
                    var47 != 0) {
                    this.field_P[var14_int] = this.field_P[var14_int] + param2;
                    this.field_K[var14_int] = this.field_K[var14_int] + param3;
                    this.field_A[var14_int] = this.field_A[var14_int] + param4;
                  }
                  var13++;
                }
                break;
              }
              var10++;
              if (var47 == 0) {
                continue L1;
              }
              return;
            }
            return;
          }
          if (param0 != 2) {
            if (param0 == 3) {
              if (param7 == null) {
                var10 = 0;
                while (var10 < var9_int) {
                  var11 = param1[var10];
                  if (var47 != 0) {
                    return;
                  }
                  if (this.field_d.length > var11) {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    while (var13 < var12.length) {
                      var14_int = var12[var13];
                      if (null == this.field_db ||
                        0 != (this.field_db[var14_int] & param6) ||
                        var47 != 0) {
                        this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                        this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                        this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                        this.field_P[var14_int] = this.field_P[var14_int] * param2 >> 7;
                        this.field_K[var14_int] = this.field_K[var14_int] * param3 >> 7;
                        this.field_A[var14_int] = this.field_A[var14_int] * param4 >> 7;
                        this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                        this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                        this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                      }
                      var13++;
                    }
                  }
                  var10++;
                }
                if (var47 == 0) {
                  return;
                }
              }
              var10 = param7[9] << 4;
              var11 = param7[10] << 4;
              var12_int = param7[11] << 4;
              var13 = param7[12] << 4;
              var14_int = param7[13] << 4;
              var15 = param7[14] << 4;
              if (vea.field_b) {
                var16 = 8192 + (param7[0] * rp.field_i + param7[3] * via.field_e + dj.field_b * param7[6]) >> 14;
                var17 = 8192 + (via.field_e * param7[4] + (param7[1] * rp.field_i + param7[7] * dj.field_b)) >> 14;
                var18 = 8192 + (via.field_e * param7[5] + rp.field_i * param7[2]) + dj.field_b * param7[8] >> 14;
                var17 = var17 + var14_int;
                var16 = var16 + var13;
                via.field_e = var17;
                rp.field_i = var16;
                var18 = var18 + var15;
                vea.field_b = false;
                dj.field_b = var18;
              }
              var16 = param2 << 15 >> 7;
              var17 = param3 << 15 >> 7;
              var18 = param4 << 15 >> 7;
              var19 = 8192 + var16 * -rp.field_i >> 14;
              var20 = var17 * -via.field_e + 8192 >> 14;
              var21 = 8192 + var18 * -dj.field_b >> 14;
              var22 = var19 + rp.field_i;
              var23 = var20 + via.field_e;
              var24 = var21 + dj.field_b;
              var25 = new int[9];
              var25[0] = var16 * param7[0] + 8192 >> 14;
              var25[2] = var16 * param7[6] + 8192 >> 14;
              var25[1] = 8192 + param7[3] * var16 >> 14;
              var25[3] = 8192 + param7[1] * var17 >> 14;
              var25[6] = param7[2] * var18 + 8192 >> 14;
              var25[4] = 8192 + param7[4] * var17 >> 14;
              var25[5] = 8192 + var17 * param7[7] >> 14;
              var25[8] = 8192 + param7[8] * var18 >> 14;
              var25[7] = 8192 + var18 * param7[5] >> 14;
              var26 = var16 * var13 + 8192 >> 14;
              var27 = 8192 + var17 * var14_int >> 14;
              var27 = var27 + var23;
              var28 = var18 * var15 + 8192 >> 14;
              var26 = var26 + var22;
              var28 = var28 + var24;
              var29 = new int[9];
              var30 = 0;
              while (true) {
                stackIn_245_0 = 3;
                boolean decompiledFrameRemainder2 = true;
                if (stackIn_245_0 > var30) {
                  stackIn_260_0 = 0;
                  decompiledFrameRemainder2 = (var47 == 0);
                  if (decompiledFrameRemainder2) {
                    var31 = stackIn_260_0;
                    while (var31 < 3) {
                      var32 = 0;
                      stackIn_245_0 = 0;
                      var33 = stackIn_245_0;
                      while (var33 < 3) {
                        var32 = var32 + var25[var31 + 3 * var33] * param7[var33 + var30 * 3];
                        var33++;
                      }
                      var29[3 * var30 + var31] = var32 + 8192 >> 14;
                      var31++;
                    }
                    var30++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder2) {
                  var30 = 8192 + var26 * param7[0] + var27 * param7[1] + var28 * param7[2] >> 14;
                  stackIn_260_0 = 8192 + (var28 * param7[5] + (var26 * param7[3] + param7[4] * var27)) >> 14;
                }
                var31 = stackIn_260_0;
                var30 = var30 + var10;
                var31 = var31 + var11;
                var32 = 8192 + (var28 * param7[8] + var26 * param7[6] + var27 * param7[7]) >> 14;
                var32 = var32 + var12_int;
                var33 = 0;
                do {
                  if (var33 >= var9_int) {
                    return;
                  }
                  boolean decompiledFrameCompleted4 = true;
                  var34 = param1[var33];
                  if (var34 < this.field_d.length) {
                    var35 = this.field_d[var34];
                    var36 = 0;
                    while (var36 < var35.length) {
                      var37 = var35[var36];
                      if (var47 != 0) {
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                      if (null == this.field_db ||
                        (param6 & this.field_db[var37]) != 0) {
                        var38 = this.field_A[var37] * var29[2] + (this.field_P[var37] * var29[0] + var29[1] * this.field_K[var37] + 8192) >> 14;
                        var39 = 8192 + (this.field_K[var37] * var29[4] + this.field_P[var37] * var29[3] + this.field_A[var37] * var29[5]) >> 14;
                        var38 = var38 + var30;
                        var39 = var39 + var31;
                        var40 = 8192 + (var29[8] * this.field_A[var37] + var29[6] * this.field_P[var37]) + this.field_K[var37] * var29[7] >> 14;
                        this.field_P[var37] = var38;
                        var40 = var40 + var32;
                        this.field_K[var37] = var39;
                        this.field_A[var37] = var40;
                      }
                      var36++;
                    }
                  }
                  if (decompiledFrameCompleted4) {
                    var33++;
                  }
                } while (var47 == 0);
                return;
              }
            }
            if (param0 == 5) {
              if (this.field_j != null) {
                var10 = 0;
                while (var10 < var9_int) {
                  var11 = param1[var10];
                  stackIn_322_0 = this.field_j.length;
                  stackIn_322_1 = var11;
                  if (var47 != 0) {
                    if (stackIn_322_0 > stackIn_322_1) {
                      var11_ref_pm = this.field_r[var10];
                      var12_ref = this.field_f[var10];
                      var12_ref.field_c = -(this.field_o[var11_ref_pm.field_l] & 255) + 255 << 24 | 16777215 & var12_ref.field_c;
                      var10++;
                      return;
                    }
                    return;
                  }
                  if (stackIn_322_0 > stackIn_322_1) {
                    var12 = this.field_j[var11];
                    var13 = 0;
                    while (var12.length > var13) {
                      var14_int = var12[var13];
                      if (null == this.field_fb ||
                        0 != (param6 & this.field_fb[var14_int]) ||
                        var47 != 0) {
                        var15 = param2 * 8 + (this.field_o[var14_int] & 255);
                        if (var15 >= 0) {
                          if (var15 > 255) {
                            var15 = 255;
                          }
                        } else {
                          var15 = 0;
                        }
                        this.field_o[var14_int] = (byte)var15;
                        if (null != this.field_kb) {
                          this.field_kb.field_d = null;
                        }
                      }
                      var13++;
                    }
                  }
                  var10++;
                }
                if (this.field_r == null) {
                  return;
                }
                var10 = 0;
                do {
                  stackIn_322_0 = ~var10;
                  stackIn_322_1 = ~this.field_G;
                  if (stackIn_322_0 <= stackIn_322_1) {
                    return;
                  }
                  var11_ref_pm = this.field_r[var10];
                  var12_ref = this.field_f[var10];
                  var12_ref.field_c = -(this.field_o[var11_ref_pm.field_l] & 255) + 255 << 24 | 16777215 & var12_ref.field_c;
                  var10++;
                } while (var47 == 0);
                return;
              }
              return;
            }
            if (param0 != 7) {
              if (param0 == 8) {
                if (this.field_C != null) {
                  var10 = 0;
                  do {
                    if (var10 >= var9_int) {
                      return;
                    }
                    boolean decompiledFrameCompleted3 = true;
                    var11 = param1[var10];
                    if (this.field_C.length > var11) {
                      var12 = this.field_C[var11];
                      var13 = 0;
                      while (var13 < var12.length) {
                        var14 = this.field_f[var12[var13]];
                        var14.field_h = var14.field_h + param2;
                        var14.field_a = var14.field_a + param3;
                        var13++;
                        if (var47 != 0) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted3) {
                      var10++;
                    }
                  } while (var47 == 0);
                  return;
                }
                return;
              }
              if (param0 == 10) {
                if (this.field_C != null) {
                  var10 = 0;
                  do {
                    if (var9_int <= var10) {
                      return;
                    }
                    boolean decompiledFrameCompleted2 = true;
                    var11 = param1[var10];
                    if (var11 < this.field_C.length) {
                      var12 = this.field_C[var11];
                      var13 = 0;
                      while (var13 < var12.length) {
                        var14 = this.field_f[var12[var13]];
                        var14.field_b = var14.field_b * param2 >> 7;
                        var14.field_f = param3 * var14.field_f >> 7;
                        var13++;
                        if (var47 != 0) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      var10++;
                    }
                  } while (var47 == 0);
                  return;
                }
                return;
              }
              if (param0 != 9) {
                return;
              }
              if (null != this.field_C) {
                var10 = 0;
                do {
                  if (var9_int <= var10) {
                    return;
                  }
                  boolean decompiledFrameCompleted1 = true;
                  var11 = param1[var10];
                  if (var11 < this.field_C.length) {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    while (var12.length > var13) {
                      var14 = this.field_f[var12[var13]];
                      var14.field_g = 16383 & param2 + var14.field_g;
                      var13++;
                      if (var47 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var10++;
                  }
                } while (var47 == 0);
                return;
              }
              return;
            }
            if (null != this.field_j) {
              var10 = 0;
              while (var10 < var9_int) {
                var11 = param1[var10];
                stackIn_373_0 = ~var11;
                stackIn_373_1 = ~this.field_j.length;
                if (var47 != 0) {
                  if (stackIn_373_0 < stackIn_373_1) {
                    var11_ref_pm = this.field_r[var10];
                    var12_ref = this.field_f[var10];
                    var12_ref.field_c = cla.field_m[this.field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                    var10++;
                    return;
                  }
                  return;
                }
                if (stackIn_373_0 > stackIn_373_1) {
                  var12 = this.field_j[var11];
                  var13 = 0;
                  while (var12.length > var13) {
                    var14_int = var12[var13];
                    if (this.field_fb == null ||
                      (this.field_fb[var14_int] & param6) != 0 ||
                      var47 != 0) {
                      var15 = this.field_X[var14_int] & 65535;
                      var16 = (64685 & var15) >> 10;
                      var17 = 7 & var15 >> 7;
                      var16 = 63 & param2 + var16;
                      var17 = var17 + param3 / 4;
                      var18 = var15 & 127;
                      var18 = var18 + param4;
                      if (0 > var17) {
                        var17 = 0;
                      } else {
                        if (7 < var17) {
                          var17 = 7;
                        }
                      }
                      if (var18 >= 0) {
                        if (127 < var18) {
                          var18 = 127;
                        }
                      } else {
                        var18 = 0;
                      }
                      this.field_X[var14_int] = (short)fh.a(var18, fh.a(var17 << 7, var16 << 10));
                      if (null != this.field_kb) {
                        this.field_kb.field_d = null;
                      }
                    }
                    var13++;
                  }
                }
                var10++;
              }
              if (null == this.field_r) {
                return;
              }
              var10 = 0;
              do {
                stackIn_373_0 = var10;
                stackIn_373_1 = this.field_G;
                if (stackIn_373_0 >= stackIn_373_1) {
                  return;
                }
                var11_ref_pm = this.field_r[var10];
                var12_ref = this.field_f[var10];
                var12_ref.field_c = cla.field_m[this.field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                var10++;
              } while (var47 == 0);
              return;
            }
            return;
          }
          if (null == param7) {
            var10 = 0;
            L11: while (true) {
              boolean decompiledFrameRemainder3 = true;
              if (var9_int > var10) {
                var11 = param1[var10];
                stackIn_101_0 = this.field_d.length;
                stackIn_101_1 = var11;
                if (var47 != 0) {
                  if (stackIn_101_0 > stackIn_101_1) {
                    var11 = param1[var10];
                    break L11;
                  }
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (stackIn_101_0 > stackIn_101_1) {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    while (var13 < var12.length) {
                      var14_int = var12[var13];
                      stackIn_112_0 = null;
                      stackIn_112_1 = this.field_db;
                      if (stackIn_112_0 == stackIn_112_1 ||
                        (this.field_db[var14_int] & param6) != 0) {
                        this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                        this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                        this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                        if (param4 != 0) {
                          var15 = qu.field_b[param4];
                          var16 = qu.field_d[param4];
                          var17 = var15 * this.field_K[var14_int] - (-(this.field_P[var14_int] * var16) - 16383) >> 14;
                          this.field_K[var14_int] = 16383 + (var16 * this.field_K[var14_int] - var15 * this.field_P[var14_int]) >> 14;
                          this.field_P[var14_int] = var17;
                        }
                        if (param2 != 0) {
                          var15 = qu.field_b[param2];
                          var16 = qu.field_d[param2];
                          var17 = 16383 + (var16 * this.field_K[var14_int] - this.field_A[var14_int] * var15) >> 14;
                          this.field_A[var14_int] = 16383 + (var15 * this.field_K[var14_int] + var16 * this.field_A[var14_int]) >> 14;
                          this.field_K[var14_int] = var17;
                        }
                        if (param3 != 0) {
                          var15 = qu.field_b[param3];
                          var16 = qu.field_d[param3];
                          var17 = 16383 + this.field_P[var14_int] * var16 + var15 * this.field_A[var14_int] >> 14;
                          this.field_A[var14_int] = 16383 + var16 * this.field_A[var14_int] - this.field_P[var14_int] * var15 >> 14;
                          this.field_P[var14_int] = var17;
                        }
                        this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                        this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                        this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                      }
                      var13++;
                    }
                  }
                  var10++;
                  continue;
                }
              }
              if (decompiledFrameRemainder3) {
                if (!param5) {
                  return;
                }
                var10 = 0;
                while (true) {
                  stackIn_101_0Lifetime1 = ~var10;
                  stackIn_101_1Lifetime1 = ~var9_int;
                  if (stackIn_101_0Lifetime1 <= stackIn_101_1Lifetime1) {
                    break;
                  }
                  var11 = param1[var10];
                  if (var47 != 0) {
                    break L11;
                  }
                  if (var11 < this.field_d.length) {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    while (true) {
                      stackIn_108_0 = ~var13;
                      if (stackIn_108_0 <= ~var12.length) {
                        break;
                      }
                      var14_int = var12[var13];
                      stackIn_140_0 = null;
                      stackIn_112_0Lifetime1 = stackIn_140_0;
                      stackIn_112_1Lifetime1 = this.field_db;
                      if (stackIn_112_0Lifetime1 == stackIn_112_1Lifetime1 ||
                        (this.field_db[var14_int] & param6) != 0 ||
                        var47 != 0) {
                        var15 = this.field_e[var14_int];
                        var16 = this.field_e[1 + var14_int];
                        var17 = var15;
                        while (var17 < var16) {
                          var18 = -1 + this.field_q[var17];
                          stackIn_108_0Lifetime1 = ~var18;
                          if (stackIn_108_0Lifetime1 == 0 &&
                            var47 == 0) {
                            break;
                          }
                          if (param4 != 0) {
                            var19 = qu.field_b[param4];
                            var20 = qu.field_d[param4];
                            var21 = 16383 + this.field_E[var18] * var20 + var19 * this.field_Y[var18] >> 14;
                            this.field_Y[var18] = (short)(-(var19 * this.field_E[var18]) + (var20 * this.field_Y[var18] + 16383) >> 14);
                            this.field_E[var18] = (short)var21;
                          }
                          if (0 != param2) {
                            var19 = qu.field_b[param2];
                            var20 = qu.field_d[param2];
                            var21 = var20 * this.field_Y[var18] - var19 * this.field_cb[var18] + 16383 >> 14;
                            this.field_cb[var18] = (short)(16383 + (this.field_cb[var18] * var20 + this.field_Y[var18] * var19) >> 14);
                            this.field_Y[var18] = (short)var21;
                          }
                          if (param3 != 0) {
                            var19 = qu.field_b[param3];
                            var20 = qu.field_d[param3];
                            var21 = 16383 + this.field_cb[var18] * var19 + var20 * this.field_E[var18] >> 14;
                            this.field_cb[var18] = (short)(this.field_cb[var18] * var20 + (-(var19 * this.field_E[var18]) + 16383) >> 14);
                            this.field_E[var18] = (short)var21;
                          }
                          var17++;
                        }
                      }
                      var13++;
                    }
                  }
                  var10++;
                }
              }
              stackIn_140_0Lifetime1 = null;
              if (stackIn_140_0Lifetime1 == this.field_F &&
                this.field_kb != null) {
                this.field_kb.field_d = null;
              }
              break;
            }
            if (this.field_F == null) {
              return;
            }
            this.field_F.field_d = null;
            if (var47 == 0) {
              return;
            }
          }
          var10 = param7[9] << 4;
          var11 = param7[10] << 4;
          var12_int = param7[11] << 4;
          var13 = param7[12] << 4;
          var14_int = param7[13] << 4;
          var15 = param7[14] << 4;
          if (vea.field_b) {
            var16 = 8192 + (dj.field_b * param7[6] + via.field_e * param7[3] + param7[0] * rp.field_i) >> 14;
            var17 = dj.field_b * param7[7] + (param7[4] * via.field_e + rp.field_i * param7[1] + 8192) >> 14;
            var18 = param7[2] * rp.field_i + (param7[5] * via.field_e + dj.field_b * param7[8] + 8192) >> 14;
            var16 = var16 + var13;
            var17 = var17 + var14_int;
            via.field_e = var17;
            var18 = var18 + var15;
            rp.field_i = var16;
            vea.field_b = false;
            dj.field_b = var18;
          }
          var16_ref_int__ = new int[9];
          var17 = qu.field_d[param2];
          var18 = qu.field_b[param2];
          var19 = qu.field_d[param3];
          var20 = qu.field_b[param3];
          var21 = qu.field_d[param4];
          var22 = qu.field_b[param4];
          var23 = 8192 + var21 * var18 >> 14;
          var24 = 8192 + var18 * var22 >> 14;
          var16_ref_int__[7] = var19 * var23 + var22 * var20 + 8192 >> 14;
          var16_ref_int__[4] = 8192 + var17 * var21 >> 14;
          var16_ref_int__[0] = 8192 + (var24 * var20 + var21 * var19) >> 14;
          var16_ref_int__[6] = var24 * var19 + -var20 * var21 + 8192 >> 14;
          var16_ref_int__[3] = var22 * var17 + 8192 >> 14;
          var16_ref_int__[5] = -var18;
          var16_ref_int__[8] = var19 * var17 + 8192 >> 14;
          var16_ref_int__[1] = var20 * var23 + -var19 * var22 + 8192 >> 14;
          var16_ref_int__[2] = var17 * var20 + 8192 >> 14;
          var25_int = 8192 + (var16_ref_int__[2] * -dj.field_b + -rp.field_i * var16_ref_int__[0] + var16_ref_int__[1] * -via.field_e) >> 14;
          var26 = 8192 + var16_ref_int__[5] * -dj.field_b + (-rp.field_i * var16_ref_int__[3] + -via.field_e * var16_ref_int__[4]) >> 14;
          var27 = -dj.field_b * var16_ref_int__[8] + (-via.field_e * var16_ref_int__[7] + var16_ref_int__[6] * -rp.field_i + 8192) >> 14;
          var28 = var25_int + rp.field_i;
          var29_int = via.field_e + var26;
          var30 = var27 + dj.field_b;
          var31_ref_int__ = new int[9];
          var32 = 0;
          while (true) {
            stackIn_155_0 = 3;
            boolean decompiledFrameRemainder1 = true;
            if (stackIn_155_0 > var32) {
              stackIn_170_0 = 0;
              decompiledFrameRemainder1 = (var47 == 0);
              if (decompiledFrameRemainder1) {
                var33 = stackIn_170_0;
                while (var33 < 3) {
                  var34 = 0;
                  stackIn_155_0 = 0;
                  var35_int = stackIn_155_0;
                  while (var35_int < 3) {
                    var34 = var34 + param7[var35_int + var33 * 3] * var16_ref_int__[var35_int + var32 * 3];
                    var35_int++;
                  }
                  var31_ref_int__[var32 * 3 + var33] = 8192 + var34 >> 14;
                  var33++;
                }
                var32++;
                continue;
              }
            }
            if (decompiledFrameRemainder1) {
              var32 = 8192 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) + var16_ref_int__[2] * var15 >> 14;
              stackIn_170_0 = var16_ref_int__[5] * var15 + var16_ref_int__[4] * var14_int + var16_ref_int__[3] * var13 + 8192 >> 14;
            }
            var33 = stackIn_170_0;
            var32 = var32 + var28;
            var33 = var33 + var29_int;
            var34 = 8192 + var16_ref_int__[6] * var13 + var14_int * var16_ref_int__[7] + var15 * var16_ref_int__[8] >> 14;
            var34 = var34 + var30;
            var35 = new int[9];
            var36 = 0;
            while (true) {
              stackIn_172_0 = 3;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_172_0 > var36) {
                stackIn_187_0 = 0;
                decompiledFrameRemainder0 = (var47 == 0);
                if (decompiledFrameRemainder0) {
                  var37 = stackIn_187_0;
                  while (var37 < 3) {
                    var38 = 0;
                    stackIn_172_0 = 0;
                    var39 = stackIn_172_0;
                    while (var39 < 3) {
                      var38 = var38 + param7[var39 + 3 * var36] * var31_ref_int__[var37 + var39 * 3];
                      var39++;
                    }
                    var35[3 * var36 + var37] = 8192 + var38 >> 14;
                    var37++;
                  }
                  var36++;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                var36 = 8192 + (var34 * param7[2] + var32 * param7[0] + param7[1] * var33) >> 14;
                stackIn_187_0 = 8192 + (var33 * param7[4] + param7[3] * var32 + param7[5] * var34) >> 14;
              }
              var37 = stackIn_187_0;
              var36 = var36 + var10;
              var37 = var37 + var11;
              var38 = var33 * param7[7] + (param7[6] * var32 + param7[8] * var34) + 8192 >> 14;
              var38 = var38 + var12_int;
              var39 = 0;
              do {
                if (var9_int <= var39) {
                  return;
                }
                boolean decompiledFrameCompleted0 = true;
                var40 = param1[var39];
                if (var40 < this.field_d.length) {
                  var41 = this.field_d[var40];
                  var42 = 0;
                  while (var41.length > var42) {
                    var43 = var41[var42];
                    if (var47 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (null == this.field_db ||
                      (this.field_db[var43] & param6) != 0 ||
                      var47 != 0) {
                      var44 = 8192 + var35[2] * this.field_A[var43] + (this.field_P[var43] * var35[0] + this.field_K[var43] * var35[1]) >> 14;
                      var45 = var35[5] * this.field_A[var43] + (this.field_K[var43] * var35[4] + this.field_P[var43] * var35[3] + 8192) >> 14;
                      var44 = var44 + var36;
                      var45 = var45 + var37;
                      var46 = var35[8] * this.field_A[var43] + this.field_K[var43] * var35[7] + (this.field_P[var43] * var35[6] + 8192) >> 14;
                      var46 = var46 + var38;
                      this.field_P[var43] = var44;
                      this.field_K[var43] = var45;
                      this.field_A[var43] = var46;
                    }
                    var42++;
                  }
                }
                if (decompiledFrameCompleted0) {
                  var39++;
                }
              } while (var47 == 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_435_0 = var9;
          stackIn_435_1 = new StringBuilder().append("np.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_436_2 = "null";
          } else {
            stackIn_436_2 = "{...}";
          }
          stackIn_439_1 = ((StringBuilder) (Object) stackIn_435_1).append(stackIn_436_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_440_2 = "null";
          } else {
            stackIn_440_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_435_0), ((StringBuilder) (Object) stackIn_439_1).append(stackIn_440_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -19) {
            field_m = (cn) null;
          }
          var1_int = jv.d(-77);
          var2 = za.a(18998);
          aoa.field_b.a((byte) 57, var1_int + (jf.field_q << 1), -gm.field_m + wp.field_b, wt.field_a - jf.field_q, (gm.field_m << 1) + var2);
          mi.a(125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "np.P(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var14 = 0;
        cka stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        oba var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        pm var4 = null;
        fd var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (null != this.field_r) {
            var2 = this.field_R.field_mc;
            this.field_R.u(28630);
            stackIn_7_0 = this.field_R;
            stackIn_8_1 = !(this.field_s);
            ((cka) (Object) stackIn_7_0).a(stackIn_8_1, false);
            this.field_R.a(param0 ^ -35, false);
            this.field_R.a((tj) null, this.field_R.field_Rb, (tj) null, -114, this.field_R.field_Bc);
            var3 = 0;
            while (var3 < this.field_G) {
              var4 = this.field_r[var3];
              var5 = this.field_f[var3];
              stackOut_10_0 = var4.field_g;
              stackIn_21_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_0 = stackOut_10_0;
              if (var14 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!stackIn_11_0 ||
                !this.field_R.f()) {
                var6 = (float)(this.field_P[var4.field_b] + this.field_P[var4.field_k] + this.field_P[var4.field_m]) * 0.3333333134651184f;
                var7 = 0.3333333134651184f * (float)(this.field_K[var4.field_b] + this.field_K[var4.field_k] + this.field_K[var4.field_m]);
                var8 = (float)(this.field_A[var4.field_k] + this.field_A[var4.field_m] + this.field_A[var4.field_b]) * 0.3333333134651184f;
                var9 = aka.field_B + (var8 * mu.field_ub + (eqa.field_a * var7 + var6 * is.field_Ab));
                var10 = ef.field_s + (var6 * qi.field_L + nw.field_u * var7 + bva.field_c * var8);
                var11 = bja.field_b + (kka.field_q * var8 + (var7 * it.field_a + var6 * roa.field_u));
                var12 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + (var10 * var10 + var9 * var9)))) * (float)var4.field_j;
                var2.a(var5.field_g, var12 * var11 + -var11, var9 + (float)var5.field_h - var9 * var12, var4.field_e * var5.field_f >> 7, (byte) -60, var4.field_i * var5.field_b >> 7, var12 * var10 + (-var10 + (float)var5.field_a));
                this.field_R.a(var2, 0);
                var13 = var5.field_c;
                jaggl.OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
                this.field_R.c((int) var4.field_f, 32677);
                this.field_R.a((byte) 94, (int) var4.field_c);
                this.field_R.a(0, 4, 7, true);
              }
              var3++;
            }
            if (decompiledFrameCompleted0) {
              this.field_R.a(true, false);
              this.field_R.n((byte) -65);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_21_0 = param0;
          }
          if (stackIn_21_0 != -30) {
            this.a(-99, (int[]) null, -39, -40, 4, -64, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "np.F(" + param0 + ')');
        }
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        oba var4 = null;
        RuntimeException var4_ref = null;
        oba var5 = null;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_L == 0) {
            return;
          }
          var4 = this.field_R.field_jd;
          var5 = (oba) (param0);
          if (!this.field_l) {
            this.c(2709);
          }
          bja.field_b = var4.field_o + (var4.field_j * var5.field_m + var4.field_h * var5.field_p + var4.field_q * var5.field_o);
          it.field_a = var5.field_k * var4.field_j + var4.field_h * var5.field_r + var4.field_q * var5.field_h;
          var6 = bja.field_b + (float)this.field_eb * it.field_a;
          var7 = bja.field_b + it.field_a * (float)this.field_v;
          if (var7 < var6) {
            var8 = var7 - (float)this.field_M;
            var9 = (float)this.field_M + var6;
          }
          if (!(var7 < var6) ||
            var24 != 0) {
            var9 = var7 + (float)this.field_M;
            var8 = (float)(-this.field_M) + var6;
          }
          if (var8 >= this.field_R.field_u) {
            return;
          }
          if ((float)this.field_R.field_Gc >= var9) {
            return;
          }
          eqa.field_a = var5.field_h * var4.field_s + (var5.field_r * var4.field_k + var5.field_k * var4.field_l);
          aka.field_B = var5.field_m * var4.field_l + var5.field_p * var4.field_k + var4.field_s * var5.field_o + var4.field_m;
          var10 = aka.field_B + (float)this.field_eb * eqa.field_a;
          var11 = eqa.field_a * (float)this.field_v + aka.field_B;
          if (!(var10 > var11)) {
            var13 = (float)this.field_R.field_W * (var11 + (float)this.field_M);
            var12 = (var10 - (float)this.field_M) * (float)this.field_R.field_W;
          }
          if (var10 > var11 ||
            var24 != 0) {
            var13 = ((float)this.field_M + var10) * (float)this.field_R.field_W;
            var12 = ((float)(-this.field_M) + var11) * (float)this.field_R.field_W;
          }
          if (this.field_R.field_od <= var12 / var9) {
            return;
          }
          if (var13 / var9 <= this.field_R.field_s) {
            return;
          }
          nw.field_u = var4.field_r * var5.field_r + var4.field_i * var5.field_k + var5.field_h * var4.field_g;
          ef.field_s = var5.field_o * var4.field_g + (var5.field_m * var4.field_i + var5.field_p * var4.field_r) + var4.field_p;
          var14 = ef.field_s + (float)this.field_eb * nw.field_u;
          var15 = ef.field_s + nw.field_u * (float)this.field_v;
          if (var15 < var14) {
            var17 = (float)this.field_R.field_kb * (var14 + (float)this.field_M);
            var16 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
          }
          if (!(var15 < var14) ||
            var24 != 0) {
            var16 = (float)this.field_R.field_kb * ((float)(-this.field_M) + var14);
            var17 = (float)this.field_R.field_kb * ((float)this.field_M + var15);
          }
          if (this.field_R.field_Db <= var16 / var9) {
            return;
          }
          if (this.field_R.field_nd >= var17 / var9) {
            return;
          }
          if (param1 != null ||
            this.field_r != null) {
            is.field_Ab = var5.field_i * var4.field_k + var5.field_l * var4.field_l + var4.field_s * var5.field_j;
            roa.field_u = var4.field_q * var5.field_j + (var5.field_l * var4.field_j + var5.field_i * var4.field_h);
            kka.field_q = var4.field_q * var5.field_q + (var5.field_g * var4.field_h + var4.field_j * var5.field_s);
            mu.field_ub = var4.field_s * var5.field_q + (var4.field_l * var5.field_s + var5.field_g * var4.field_k);
            qi.field_L = var5.field_j * var4.field_g + (var5.field_i * var4.field_r + var4.field_i * var5.field_l);
            bva.field_c = var5.field_s * var4.field_i + var4.field_r * var5.field_g + var5.field_q * var4.field_g;
          }
          if (param1 != null) {
            var18 = 0;
            var19 = 1;
            var20 = this.field_U + this.field_T >> 1;
            var21 = this.field_k + this.field_S >> 1;
            var22 = (int)((float)var21 * kka.field_q + (it.field_a * (float)this.field_eb + ((float)var20 * roa.field_u + bja.field_b)));
            if (this.field_R.field_Gc > var22) {
              var18 = 1;
            }
            var23 = (int)(bja.field_b + roa.field_u * (float)var20 + it.field_a * (float)this.field_v + (float)var21 * kka.field_q);
            if (var23 < this.field_R.field_Gc) {
              var18 = 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var18 != 0) {
              if (var22 < this.field_R.field_Gc &&
                this.field_R.field_Gc > var23) {
                var19 = 0;
                decompiledFrameRemainder0 = (var24 != 0);
              }
              if ((decompiledFrameRemainder0) && (var22 >= this.field_R.field_Gc &&
                var23 < this.field_R.field_Gc)) {
              }
            }
            if (var19 != 0 &&
              var23 >= var22) {
            }
          }
          this.field_R.c(false);
          this.field_R.b(var5, 117);
          this.a(false);
          this.field_R.n((byte) -96);
          this.b((byte) -30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_67_0 = var4_ref;
          stackIn_67_1 = new StringBuilder().append("np.N(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b() {
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_d == null) {
            return false;
          }
          var1_int = 0;
          do {
            if (this.field_N <= var1_int) {
              rp.field_i = 0;
              dj.field_b = 0;
              via.field_e = 0;
              break;
            }
            this.field_P[var1_int] = this.field_P[var1_int] << 4;
            this.field_K[var1_int] = this.field_K[var1_int] << 4;
            this.field_A[var1_int] = this.field_A[var1_int] << 4;
            var1_int++;
          } while (var2 == 0);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "np.NA()");
        }
    }

    private final void a(int param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_109_0 = 0;
        float stackIn_137_0 = 0.0f;
        float stackIn_163_0 = 0.0f;
        float stackIn_163_1 = 0.0f;
        float stackIn_164_2 = 0.0f;
        float stackIn_193_0 = 0.0f;
        int stackIn_215_0 = 0;
        int stackIn_244_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qf var12 = null;
        int var13_int = 0;
        short[] var13 = null;
        va var13_ref = null;
        int var14_int = 0;
        short[] var14 = null;
        int var15_int = 0;
        short[] var15 = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19 = 0;
        float var19_float = 0.0f;
        int var20 = 0;
        float var20_float = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        int var34 = 0;
        int var35 = 0;
        short[] var13Lifetime1;
        short[] var14Lifetime1;
        short[] var15Lifetime1;
        byte[] var16Lifetime1;
        int stackIn_95_0Lifetime1;
        int stackIn_95_1Lifetime1;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var14_intLifetime1;
        int var15_intLifetime1;
        int var16_intLifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        float var18Lifetime1;
        int var19Lifetime1;
        float var19_floatLifetime1;
        float var19_floatLifetime2;
        int var20Lifetime1;
        float var21Lifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var13_intLifetime3;
        int var14_intLifetime2;
        int var17_intLifetime2;
        float var18Lifetime2;
        float var18Lifetime3;
        int var19Lifetime2;
        int var20Lifetime2;
        int var13_intLifetime2Lifetime1;
        int var17_intLifetime1Lifetime1;
        int var17_intLifetime1Lifetime2;
        int var19Lifetime1Lifetime1;
        int var20Lifetime1Lifetime1;
        float var21Lifetime1Lifetime1;
        var35 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_kb != null &&
            this.field_kb.field_d == null) {
            stackIn_8_0 = 1;
          } else {
            stackIn_8_0 = 0;
          }
          var3_int = stackIn_8_0;
          if (null != this.field_F &&
            null == this.field_F.field_d) {
            stackIn_15_0 = 1;
          } else {
            stackIn_15_0 = 0;
          }
          var4 = stackIn_15_0;
          if (null != this.field_g &&
            this.field_g.field_d == null) {
            stackIn_22_0 = 1;
          } else {
            stackIn_22_0 = 0;
          }
          var5 = stackIn_22_0;
          if (param0 != 0) {
            return;
          }
          if (this.field_ab != null &&
            this.field_ab.field_d == null) {
            stackIn_31_0 = 1;
          } else {
            stackIn_31_0 = 0;
          }
          var6 = stackIn_31_0;
          if (param1) {
            stackIn_37_0 = var6;
            if ((8 & this.field_Z) == 0) {
              stackIn_38_1 = 0;
            } else {
              stackIn_38_1 = 1;
            }
            var6 = stackIn_37_0 & stackIn_38_1;
            stackIn_41_0 = var5;
            if ((this.field_Z & 1) == 0) {
              stackIn_42_1 = 0;
            } else {
              stackIn_42_1 = 1;
            }
            var5 = stackIn_41_0 & stackIn_42_1;
            stackIn_45_0 = var4;
            if ((4 & this.field_Z) == 0) {
              stackIn_46_1 = 0;
            } else {
              stackIn_46_1 = 1;
            }
            var4 = stackIn_45_0 & stackIn_46_1;
            stackIn_49_0 = var3_int;
            if ((2 & this.field_Z) == 0) {
              stackIn_50_1 = 0;
            } else {
              stackIn_50_1 = 1;
            }
            var3_int = stackIn_49_0 & stackIn_50_1;
          }
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          if (var5 != 0) {
            var8 = var7;
            var7 = (byte)(var7 + 12);
          }
          var11 = 0;
          if (var3_int != 0) {
            var9 = var7;
            var7 = (byte)(var7 + 4);
          }
          if (var4 != 0) {
            var10 = var7;
            var7 = (byte)(var7 + 12);
          }
          if (var6 != 0) {
            var11 = var7;
            var7 = (byte)(var7 + 8);
          }
          if (var7 == 0) {
            return;
          }
          if (this.field_R.field_cb.field_g.length < (this.field_L * var7)) {
            this.field_R.field_cb = new qf((this.field_L + 100) * var7);
            if (var35 != 0) {
              this.field_R.field_cb.field_h = 0;
            }
          } else {
            this.field_R.field_cb.field_h = 0;
          }
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameCompleted6 = true;
          boolean decompiledFrameRemainder2 = true;
          var12 = this.field_R.field_cb;
          if (var5 != 0) {
            if (!this.field_R.field_O) {
              var13_int = 0;
              while (true) {
                stackIn_79_0 = ~var13_int;
                stackIn_79_1 = ~this.field_lb;
                if (stackIn_79_0 > stackIn_79_1) {
                  var14_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_int]);
                  var15_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_int]);
                  var16_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_int]);
                  var17_int = this.field_e[var13_int];
                  var18_int = this.field_e[1 + var13_int];
                  stackIn_109_0 = var17_int;
                  if (var35 != 0) {
                    decompiledFrameCompleted7 = false;
                    break;
                  }
                  var19 = stackIn_109_0;
                  while (var18_int > var19) {
                    var20 = this.field_q[var19] - 1;
                    stackIn_79_0 = 0;
                    stackIn_79_1 = ~var20;
                    if (stackIn_79_0 != stackIn_79_1 ||
                      var35 != 0) {
                      var12.field_h = var7 * var20;
                      var12.a((byte) -35, var14_int);
                      var12.a((byte) -35, var15_int);
                      var12.a((byte) -35, var16_int);
                      var19++;
                      continue;
                    }
                    break;
                  }
                  var13_int++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted7) {
                decompiledFrameRemainder2 = (var35 != 0);
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameCompleted7)) {
              var13_intLifetime3 = 0;
              while (true) {
                stackIn_95_0 = ~var13_intLifetime3;
                stackIn_95_1 = ~this.field_lb;
                if (stackIn_95_0 <= stackIn_95_1) {
                  break;
                }
                var14_intLifetime2 = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_intLifetime3]);
                var15_intLifetime1 = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_intLifetime3]);
                var16_intLifetime1 = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_intLifetime3]);
                var17_intLifetime2 = this.field_e[var13_intLifetime3];
                var18_intLifetime1 = this.field_e[1 + var13_intLifetime3];
                stackIn_109_0 = var17_intLifetime2;
                if (var35 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
                var19Lifetime2 = stackIn_109_0;
                while (var19Lifetime2 < var18_intLifetime1) {
                  var20Lifetime2 = this.field_q[var19Lifetime2] - 1;
                  stackIn_95_0Lifetime1 = -1;
                  stackIn_95_1Lifetime1 = var20Lifetime2;
                  if (stackIn_95_0Lifetime1 != stackIn_95_1Lifetime1 ||
                    var35 != 0) {
                    var12.field_h = var20Lifetime2 * var7;
                    var12.a(var14_intLifetime2, (byte) -72);
                    var12.a(var15_intLifetime1, (byte) -13);
                    var12.a(var16_intLifetime1, (byte) 81);
                    var19Lifetime2++;
                    continue;
                  }
                  break;
                }
                var13_intLifetime3++;
              }
            }
          }
          if ((decompiledFrameCompleted7) &&
            (decompiledFrameCompleted6)) {
            stackIn_109_0 = var3_int;
          }
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted5 = true;
          if (stackIn_109_0 != 0) {
            if (null != this.field_F) {
              var13_intLifetime1 = 0;
              while (this.field_W > var13_intLifetime1) {
                var14_intLifetime1 = this.a(-2117016184, (int) this.field_X[var13_intLifetime1], this.field_o[var13_intLifetime1], this.field_I[var13_intLifetime1], (int) this.field_B);
                var12.field_h = var9 + var7 * this.field_H[var13_intLifetime1];
                var12.a(var14_intLifetime1, (byte) 92);
                var12.field_h = var7 * this.field_z[var13_intLifetime1] + var9;
                var12.a(var14_intLifetime1, (byte) 91);
                var12.field_h = var9 + this.field_hb[var13_intLifetime1] * var7;
                var12.a(var14_intLifetime1, (byte) 113);
                var13_intLifetime1++;
                if (var35 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted5) {
                decompiledFrameRemainder1 = (var35 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted5)) {
              boolean decompiledSharedTail1 = (this.field_i == null);
              if (!decompiledSharedTail1) {
                var16 = this.field_i.field_e;
                var13 = this.field_i.field_d;
                var14 = this.field_i.field_b;
                var15 = this.field_i.field_f;
                decompiledSharedTail1 = (var35 != 0);
              }
              if (decompiledSharedTail1) {
                var16 = this.field_O;
                var13 = this.field_E;
                var14 = this.field_Y;
                var15 = this.field_cb;
              }
              var28 = this.field_R.field_Wb[0];
              var29 = this.field_R.field_Wb[1];
              var30 = this.field_R.field_Wb[2];
              var31 = this.field_R.field_tc;
              var32 = this.field_R.field_cd * 768.0f / (float)this.field_h;
              var33 = 768.0f * this.field_R.field_Sb / (float)this.field_h;
              var34 = 0;
              while (this.field_W > var34) {
                var24 = this.a(-2117016184, (int) this.field_X[var34], this.field_o[var34], this.field_I[var34], (int) this.field_B);
                var20_float = (float)(var24 >>> 24) * this.field_R.field_wc;
                var22 = this.field_R.field_bc * (float)(255 & var24 >> 8);
                var21 = (float)(var24 >> 16 & 255) * this.field_R.field_Fb;
                var23 = this.field_H[var34];
                var17_intLifetime1 = (short)var16[var23];
                stackIn_215_0 = var17_intLifetime1;
                if (var35 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
                if (stackIn_215_0 != 0) {
                  var18 = ((float)var15[var23] * var30 + ((float)var13[var23] * var28 + var29 * (float)var14[var23])) / (float)(var17_intLifetime1 * 256);
                } else {
                  var18 = ((float)var15[var23] * var30 + ((float)var14[var23] * var29 + var28 * (float)var13[var23])) * 0.0026041667442768812f;
                }
                stackIn_137_0 = (var18 < 0.0f) ? var33 : var32;
                var19_float = stackIn_137_0 * var18 + var31;
                var25 = (int)(var20_float * var19_float);
                var26 = (int)(var19_float * var21);
                if (var25 < 0) {
                  var25 = 0;
                } else {
                  if (var25 > 255) {
                    var25 = 255;
                  }
                }
                if (0 > var26) {
                  var26 = 0;
                } else {
                  if (255 < var26) {
                    var26 = 255;
                  }
                }
                var27 = (int)(var19_float * var22);
                var12.field_h = var9 + var23 * var7;
                if (0 > var27) {
                  var27 = 0;
                } else {
                  if (255 < var27) {
                    var27 = 255;
                  }
                }
                var12.i(var25, param0 + 0);
                var12.i(var26, 0);
                var12.i(var27, 0);
                var12.i(255 - (this.field_o[var34] & 255), 0);
                var23Lifetime1 = this.field_z[var34];
                var17_intLifetime1Lifetime1 = (short)var16[var23Lifetime1];
                if (var17_intLifetime1Lifetime1 != 0) {
                  var18Lifetime2 = (var30 * (float)var15[var23Lifetime1] + (var28 * (float)var13[var23Lifetime1] + var29 * (float)var14[var23Lifetime1])) / (float)(256 * var17_intLifetime1Lifetime1);
                } else {
                  var18Lifetime2 = ((float)var13[var23Lifetime1] * var28 + var29 * (float)var14[var23Lifetime1] + (float)var15[var23Lifetime1] * var30) * 0.0026041667442768812f;
                }
                stackIn_163_0 = var31;
                stackIn_163_1 = var18Lifetime2;
                if (!(0.0f > var18Lifetime2)) {
                  stackIn_164_2 = var32;
                } else {
                  stackIn_164_2 = var33;
                }
                var19_floatLifetime1 = stackIn_163_0 + stackIn_163_1 * stackIn_164_2;
                var25Lifetime1 = (int)(var20_float * var19_floatLifetime1);
                var26Lifetime1 = (int)(var19_floatLifetime1 * var21);
                if (var25Lifetime1 >= 0) {
                  if (255 < var25Lifetime1) {
                    var25Lifetime1 = 255;
                  }
                } else {
                  var25Lifetime1 = 0;
                }
                var27Lifetime1 = (int)(var19_floatLifetime1 * var22);
                if (var26Lifetime1 >= 0) {
                  if (255 < var26Lifetime1) {
                    var26Lifetime1 = 255;
                  }
                } else {
                  var26Lifetime1 = 0;
                }
                if (var27Lifetime1 >= 0) {
                  if (var27Lifetime1 > 255) {
                    var27Lifetime1 = 255;
                  }
                } else {
                  var27Lifetime1 = 0;
                }
                var12.field_h = var23Lifetime1 * var7 + var9;
                var12.i(var25Lifetime1, param0 + 0);
                var12.i(var26Lifetime1, param0 ^ 0);
                var12.i(var27Lifetime1, 0);
                var12.i(255 - (255 & this.field_o[var34]), param0 + 0);
                var23Lifetime2 = this.field_hb[var34];
                var17_intLifetime1Lifetime2 = (short)var16[var23Lifetime2];
                if (var17_intLifetime1Lifetime2 != 0) {
                  var18Lifetime3 = ((float)var15[var23Lifetime2] * var30 + (var29 * (float)var14[var23Lifetime2] + var28 * (float)var13[var23Lifetime2])) / (float)(var17_intLifetime1Lifetime2 * 256);
                } else {
                  var18Lifetime3 = 0.0026041667442768812f * ((float)var13[var23Lifetime2] * var28 + var29 * (float)var14[var23Lifetime2] + (float)var15[var23Lifetime2] * var30);
                }
                stackIn_193_0 = (!(0.0f > var18Lifetime3)) ? var32 : var33;
                var19_floatLifetime2 = stackIn_193_0 * var18Lifetime3 + var31;
                var25Lifetime2 = (int)(var19_floatLifetime2 * var20_float);
                var26Lifetime2 = (int)(var19_floatLifetime2 * var21);
                if (var25Lifetime2 >= 0) {
                  if (var25Lifetime2 > 255) {
                    var25Lifetime2 = 255;
                  }
                } else {
                  var25Lifetime2 = 0;
                }
                var27Lifetime2 = (int)(var22 * var19_floatLifetime2);
                if (var26Lifetime2 < 0) {
                  var26Lifetime2 = 0;
                } else {
                  if (var26Lifetime2 > 255) {
                    var26Lifetime2 = 255;
                  }
                }
                if (0 > var27Lifetime2) {
                  var27Lifetime2 = 0;
                } else {
                  if (var27Lifetime2 > 255) {
                    var27Lifetime2 = 255;
                  }
                }
                var12.field_h = var9 + var7 * var23Lifetime2;
                var12.i(var25Lifetime2, 0);
                var12.i(var26Lifetime2, 0);
                var12.i(var27Lifetime2, 0);
                var12.i(-(this.field_o[var34] & 255) + 255, 0);
                var34++;
              }
            }
          }
          if (decompiledFrameCompleted4) {
            stackIn_215_0 = var4;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          L69: {
            if (stackIn_215_0 != 0) {
              if (null != this.field_i) {
                var13Lifetime1 = this.field_i.field_d;
                var16Lifetime1 = this.field_i.field_e;
                var15Lifetime1 = this.field_i.field_f;
                var14Lifetime1 = this.field_i.field_b;
                if (var35 != 0) {
                  var15Lifetime1 = this.field_cb;
                  var14Lifetime1 = this.field_Y;
                  var13Lifetime1 = this.field_E;
                  var16Lifetime1 = this.field_O;
                }
              } else {
                var15Lifetime1 = this.field_cb;
                var14Lifetime1 = this.field_Y;
                var13Lifetime1 = this.field_E;
                var16Lifetime1 = this.field_O;
              }
              var17 = 3.0f / (float)this.field_h;
              var12.field_h = var10;
              var18Lifetime1 = 3.0f / (float)(this.field_h + this.field_h / 2);
              if (!this.field_R.field_O) {
                var19Lifetime1 = 0;
                while (this.field_L > var19Lifetime1) {
                  var20Lifetime1 = 255 & var16Lifetime1[var19Lifetime1];
                  stackIn_244_0 = -1;
                  if (var35 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_244_0 != ~var20Lifetime1) {
                    var21Lifetime1 = var17 / (float)var20Lifetime1;
                    var12.a((byte) 114, var21Lifetime1 * (float)var13Lifetime1[var19Lifetime1]);
                    var12.a((byte) 114, (float)var14Lifetime1[var19Lifetime1] * var21Lifetime1);
                    var12.a((byte) 114, (float)var15Lifetime1[var19Lifetime1] * var21Lifetime1);
                  } else {
                    var12.a((byte) 114, var18Lifetime1 * (float)var13Lifetime1[var19Lifetime1]);
                    var12.a((byte) 114, (float)var14Lifetime1[var19Lifetime1] * var18Lifetime1);
                    var12.a((byte) 114, (float)var15Lifetime1[var19Lifetime1] * var18Lifetime1);
                  }
                  var12.field_h = var12.field_h + (-12 + var7);
                  var19Lifetime1++;
                }
                if ((decompiledFrameCompleted3) &&
                  (var35 == 0)) {
                  break L69;
                }
              }
              if (decompiledFrameCompleted3) {
                var19Lifetime1Lifetime1 = 0;
                while (this.field_L > var19Lifetime1Lifetime1) {
                  var20Lifetime1Lifetime1 = var16Lifetime1[var19Lifetime1Lifetime1] & 255;
                  stackIn_244_0 = ~var20Lifetime1Lifetime1;
                  if (var35 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  if (stackIn_244_0 != -1) {
                    var21Lifetime1Lifetime1 = var17 / (float)var20Lifetime1Lifetime1;
                    var12.a(17133, var21Lifetime1Lifetime1 * (float)var13Lifetime1[var19Lifetime1Lifetime1]);
                    var12.a(17133, (float)var14Lifetime1[var19Lifetime1Lifetime1] * var21Lifetime1Lifetime1);
                    var12.a(param0 + 17133, var21Lifetime1Lifetime1 * (float)var15Lifetime1[var19Lifetime1Lifetime1]);
                  } else {
                    var12.a(17133, (float)var13Lifetime1[var19Lifetime1Lifetime1] * var18Lifetime1);
                    var12.a(17133, (float)var14Lifetime1[var19Lifetime1Lifetime1] * var18Lifetime1);
                    var12.a(17133, (float)var15Lifetime1[var19Lifetime1Lifetime1] * var18Lifetime1);
                  }
                  var12.field_h = var12.field_h + (-12 + var7);
                  var19Lifetime1Lifetime1++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            stackIn_244_0 = var6;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_244_0 != 0) {
            var12.field_h = var11;
            if (this.field_R.field_O) {
              var13_intLifetime2 = 0;
              while (this.field_L > var13_intLifetime2) {
                var12.a(17133, this.field_n[var13_intLifetime2]);
                var12.a(17133, this.field_y[var13_intLifetime2]);
                var12.field_h = var12.field_h + (var7 - 8);
                var13_intLifetime2++;
                if (var35 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder0 = (var35 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              var13_intLifetime2Lifetime1 = 0;
              while (this.field_L > var13_intLifetime2Lifetime1) {
                var12.a((byte) 114, this.field_n[var13_intLifetime2Lifetime1]);
                var12.a((byte) 114, this.field_y[var13_intLifetime2Lifetime1]);
                var12.field_h = var12.field_h + (-8 + var7);
                var13_intLifetime2Lifetime1++;
                if (var35 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            var12.field_h = this.field_L * var7;
          }
          if (param1) {
            boolean decompiledSharedTail0 = (this.field_Q == null);
            if (!decompiledSharedTail0) {
              this.field_Q.a(var7, var12.field_h, (byte) -112, var12.field_g);
              decompiledSharedTail0 = (var35 != 0);
            }
            if (decompiledSharedTail0) {
              this.field_Q = this.field_R.a(var12.field_h, var12.field_g, var7, true, (byte) 117);
            }
            this.field_Z = (byte) 0;
            var13_ref = this.field_Q;
          }
          if (!param1 ||
            var35 != 0) {
            var13_ref = this.field_R.a(var12.field_h, var12.field_g, var7, false, (byte) 99);
            this.field_gb = true;
          }
          if (var5 != 0) {
            this.field_g.field_g = (byte) var8;
            this.field_g.field_d = var13_ref;
          }
          if (var6 != 0) {
            this.field_ab.field_g = (byte) var11;
            this.field_ab.field_d = var13_ref;
          }
          if (var3_int != 0) {
            this.field_kb.field_g = (byte) var9;
            this.field_kb.field_d = var13_ref;
          }
          if (var4 != 0) {
            this.field_F.field_d = var13_ref;
            this.field_F.field_g = (byte) var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "np.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void a() {
    }

    private final void a(boolean param0) {
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        cka stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        boolean stackIn_25_2 = false;
        cka stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean stackIn_38_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_ib == 0) {
            return;
          }
          if (this.field_Z != 0) {
            this.a(0, true);
          }
          this.a(0, param0);
          if (this.field_w != null) {
            if (null == this.field_w.field_a) {
              stackIn_16_1 = -24;
              stackIn_17_2 = (0 != (this.field_Z & 16));
              this.a((byte) stackIn_16_1, stackIn_17_2);
            }
            if (this.field_w.field_a != null) {
              stackIn_24_0 = this.field_R;
              stackIn_24_1 = 96;
              stackIn_25_2 = (this.field_F != null);
              ((cka) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_25_2);
              this.field_R.a(this.field_kb, this.field_ab, this.field_F, -120, this.field_g);
              var2_int = -1 + this.field_p.length;
              var3 = 0;
              while (var3 < var2_int) {
                var4 = this.field_p[var3];
                var5 = this.field_p[1 + var3];
                var6 = 65535 & this.field_I[var4];
                if (var7 != 0) {
                  return;
                }
                if (var6 == 65535) {
                  var6 = -1;
                }
                stackIn_37_0 = this.field_R;
                stackIn_37_1 = 70;
                stackIn_38_2 = (null != this.field_F);
                ((cka) (Object) stackIn_37_0).a((byte) stackIn_37_1, stackIn_38_2, var6);
                this.field_R.a(3 * var4, 4, -513, this.field_w.field_a, 3 * (var5 - var4));
                var3++;
              }
            }
          }
          this.c((byte) 31);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.L(" + param0 + ')');
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= this.field_lb))) {
            if (var5 == 0) {
              if (param0 != 128) {
                this.field_P[var4_int] = param0 * this.field_P[var4_int] >> 7;
              }
              if (param1 != 128) {
                this.field_K[var4_int] = param1 * this.field_K[var4_int] >> 7;
              }
              if (param2 != 128) {
                this.field_A[var4_int] = this.field_A[var4_int] * param2 >> 7;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_l = false;
          }
          if (this.field_g != null) {
            this.field_g.field_d = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        RuntimeException stackIn_284_0 = null;
        StringBuilder stackIn_284_1 = null;
        String stackIn_285_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        pm var10_ref_pm = null;
        int[] var11 = null;
        fd var11_ref = null;
        int var11_int = 0;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        int var13_int = 0;
        fd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_82_0Lifetime1;
        int stackIn_83_0Lifetime1;
        int stackIn_83_1Lifetime1;
        int stackIn_90_0Lifetime1;
        int stackIn_90_1Lifetime1;
        int stackIn_164_0Lifetime1;
        int stackIn_164_1Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = param1.length;
          if (0 == param0) {
            param4 = param4 << 4;
            param3 = param3 << 4;
            param2 = param2 << 4;
            var9 = 0;
            dj.field_b = 0;
            rp.field_i = 0;
            via.field_e = 0;
            var10 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8_int <= var10))) {
              var11_int = param1[var10];
              stackIn_18_0 = ~var11_int;
              stackIn_18_1 = ~this.field_d.length;
              if (var21 == 0) {
                if (stackIn_18_0 > stackIn_18_1) {
                  var12_ref_int__ = this.field_d[var11_int];
                  var13_int = 0;
                  while (var13_int < var12_ref_int__.length) {
                    var14 = var12_ref_int__[var13_int];
                    rp.field_i = rp.field_i + this.field_P[var14];
                    via.field_e = via.field_e + this.field_K[var14];
                    var9++;
                    dj.field_b = dj.field_b + this.field_A[var14];
                    var13_int++;
                  }
                }
                var10++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_18_0 = ~var9;
              stackIn_18_1 = -1;
            }
            if (stackIn_18_0 >= stackIn_18_1) {
              rp.field_i = param2;
              dj.field_b = param4;
              via.field_e = param3;
              if (var21 == 0) {
                return;
              }
            }
            rp.field_i = param2 + rp.field_i / var9;
            via.field_e = param3 + via.field_e / var9;
            dj.field_b = dj.field_b / var9 + param4;
            return;
          }
          if (param0 == 1) {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            var9 = 0;
            while (var8_int > var9) {
              boolean decompiledFrameCompleted5 = true;
              var10 = param1[var9];
              if (var10 < this.field_d.length) {
                var11 = this.field_d[var10];
                var12 = 0;
                while (var12 < var11.length) {
                  var13_int = var11[var12];
                  this.field_P[var13_int] = this.field_P[var13_int] + param2;
                  this.field_K[var13_int] = this.field_K[var13_int] + param3;
                  this.field_A[var13_int] = this.field_A[var13_int] + param4;
                  var12++;
                  if (var21 != 0) {
                    decompiledFrameCompleted5 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted5) {
                var9++;
              }
              if (var21 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (2 != param0) {
            if (param0 == 3) {
              var9 = 0;
              while (var8_int > var9) {
                boolean decompiledFrameCompleted4 = true;
                var10 = param1[var9];
                if (this.field_d.length > var10) {
                  var11 = this.field_d[var10];
                  var12 = 0;
                  while (var11.length > var12) {
                    var13_int = var11[var12];
                    this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                    this.field_P[var13_int] = param2 * this.field_P[var13_int] >> 7;
                    this.field_K[var13_int] = this.field_K[var13_int] * param3 >> 7;
                    this.field_A[var13_int] = param4 * this.field_A[var13_int] >> 7;
                    this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                    var12++;
                    if (var21 != 0) {
                      decompiledFrameCompleted4 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted4) {
                  var9++;
                }
                if (var21 == 0) {
                  continue;
                }
                break;
              }
              return;
            }
            if (5 == param0) {
              if (this.field_j != null) {
                var9 = 0;
                while (var8_int > var9) {
                  var10 = param1[var9];
                  stackIn_174_0 = ~this.field_j.length;
                  stackIn_174_1 = ~var10;
                  if (var21 != 0) {
                    if (stackIn_174_0 < stackIn_174_1) {
                      var10_ref_pm = this.field_r[var9];
                      var11_ref = this.field_f[var9];
                      var11_ref.field_c = var11_ref.field_c & 16777215 | -(this.field_o[var10_ref_pm.field_l] & 255) + 255 << 24;
                      var9++;
                      return;
                    }
                    return;
                  }
                  if (stackIn_174_0 < stackIn_174_1) {
                    var11 = this.field_j[var10];
                    var12 = 0;
                    while (true) {
                      if (var12 < var11.length) {
                        var13_int = var11[var12];
                        var14 = 8 * param2 + (255 & this.field_o[var13_int]);
                        stackIn_164_0 = 0;
                        stackIn_164_1 = var14;
                        if (stackIn_164_0 <= stackIn_164_1) {
                          if (var14 > 255) {
                            var14 = 255;
                          }
                        } else {
                          var14 = 0;
                        }
                        this.field_o[var13_int] = (byte)var14;
                        var12++;
                        continue;
                      }
                      stackIn_164_0Lifetime1 = 0;
                      stackIn_164_1Lifetime1 = var11.length;
                      if (stackIn_164_0Lifetime1 >= stackIn_164_1Lifetime1) {
                        break;
                      }
                      if (this.field_kb == null) {
                        break;
                      }
                      this.field_kb.field_d = null;
                      break;
                    }
                  }
                  var9++;
                }
                if (null == this.field_r) {
                  return;
                }
                var9 = 0;
                do {
                  stackIn_174_0 = ~this.field_G;
                  stackIn_174_1 = ~var9;
                  if (stackIn_174_0 >= stackIn_174_1) {
                    return;
                  }
                  var10_ref_pm = this.field_r[var9];
                  var11_ref = this.field_f[var9];
                  var11_ref.field_c = var11_ref.field_c & 16777215 | -(this.field_o[var10_ref_pm.field_l] & 255) + 255 << 24;
                  var9++;
                } while (var21 == 0);
                return;
              }
              return;
            }
            if (param0 == 7) {
              if (null != this.field_j) {
                var9 = 0;
                L26: while (true) {
                  stackIn_185_0 = ~var8_int;
                  stackIn_185_1 = ~var9;
                  if (stackIn_185_0 < stackIn_185_1) {
                    var10 = param1[var9];
                    stackIn_221_0 = ~var10;
                    stackIn_221_1 = ~this.field_j.length;
                    if (var21 != 0) {
                      if (stackIn_221_0 > stackIn_221_1) {
                        var10_ref_pm = this.field_r[var9];
                        var11_ref = this.field_f[var9];
                        var11_ref.field_c = 16777215 & cla.field_m[this.field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                        var9++;
                        return;
                      }
                      return;
                    }
                    if (stackIn_221_0 > stackIn_221_1) {
                      var11 = this.field_j[var10];
                      var12 = 0;
                      while (var11.length > var12) {
                        var13_int = var11[var12];
                        var14 = this.field_X[var13_int] & 65535;
                        var15 = (var14 & 64694) >> 10;
                        var16 = (var14 & 1011) >> 7;
                        var16 = var16 + param3 / 4;
                        var15 = 63 & param2 + var15;
                        var17 = var14 & 127;
                        stackIn_185_0 = ~var16;
                        stackIn_185_1 = -1;
                        if (stackIn_185_0 <= stackIn_185_1) {
                          if (var16 > 7) {
                            var16 = 7;
                          }
                        } else {
                          var16 = 0;
                        }
                        var17 = var17 + param4;
                        if (var17 < 0) {
                          var17 = 0;
                        } else {
                          if (var17 > 127) {
                            var17 = 127;
                          }
                        }
                        this.field_X[var13_int] = (short)fh.a(fh.a(var16 << 7, var15 << 10), var17);
                        var12++;
                      }
                      if (var11.length > 0 &&
                        null != this.field_kb) {
                        this.field_kb.field_d = null;
                      }
                    }
                    var9++;
                    continue L26;
                  }
                  break;
                }
                if (this.field_r == null) {
                  return;
                }
                var9 = 0;
                do {
                  stackIn_221_0 = this.field_G;
                  stackIn_221_1 = var9;
                  if (stackIn_221_0 <= stackIn_221_1) {
                    return;
                  }
                  var10_ref_pm = this.field_r[var9];
                  var11_ref = this.field_f[var9];
                  var11_ref.field_c = 16777215 & cla.field_m[this.field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                  var9++;
                } while (var21 == 0);
                return;
              }
              return;
            }
            if (param0 == 8) {
              if (null != this.field_C) {
                var9 = 0;
                do {
                  if (var9 >= var8_int) {
                    return;
                  }
                  boolean decompiledFrameCompleted3 = true;
                  var10 = param1[var9];
                  if (this.field_C.length > var10) {
                    var11 = this.field_C[var10];
                    var12 = 0;
                    while (var11.length > var12) {
                      var13 = this.field_f[var11[var12]];
                      var13.field_h = var13.field_h + param2;
                      var13.field_a = var13.field_a + param3;
                      var12++;
                      if (var21 != 0) {
                        decompiledFrameCompleted3 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted3) {
                    var9++;
                  }
                } while (var21 == 0);
                return;
              }
              return;
            }
            if (param0 == 10) {
              if (this.field_C != null) {
                var9 = 0;
                do {
                  if (var8_int <= var9) {
                    return;
                  }
                  boolean decompiledFrameCompleted2 = true;
                  var10 = param1[var9];
                  if (var10 < this.field_C.length) {
                    var11 = this.field_C[var10];
                    var12 = 0;
                    while (var12 < var11.length) {
                      var13 = this.field_f[var11[var12]];
                      var13.field_f = param3 * var13.field_f >> 7;
                      var13.field_b = var13.field_b * param2 >> 7;
                      var12++;
                      if (var21 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                  }
                  if (decompiledFrameCompleted2) {
                    var9++;
                  }
                } while (var21 == 0);
                return;
              }
              return;
            }
            if (param0 != 9) {
              return;
            }
            if (null != this.field_C) {
              var9 = 0;
              do {
                if (var9 >= var8_int) {
                  return;
                }
                boolean decompiledFrameCompleted1 = true;
                var10 = param1[var9];
                if (this.field_C.length > var10) {
                  var11 = this.field_C[var10];
                  var12 = 0;
                  while (var11.length > var12) {
                    var13 = this.field_f[var11[var12]];
                    var13.field_g = 16383 & var13.field_g + param2;
                    var12++;
                    if (var21 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted1) {
                  var9++;
                }
              } while (var21 == 0);
              return;
            }
            return;
          }
          var9 = 0;
          while (true) {
            stackIn_45_0 = ~var9;
            stackIn_45_1 = ~var8_int;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            if (stackIn_45_0 > stackIn_45_1) {
              var10 = param1[var9];
              stackIn_83_0 = ~var10;
              stackIn_83_1 = ~this.field_d.length;
              if (var21 != 0) {
                if (stackIn_83_0 > stackIn_83_1) {
                  var10 = param1[var9];
                  decompiledFrameRemainder0 = false;
                }
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                if (stackIn_83_0 > stackIn_83_1) {
                  var11 = this.field_d[var10];
                  if ((param5 & 1) != 0) {
                    var12 = 0;
                    while (var11.length > var12) {
                      var13_int = var11[var12];
                      this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                      this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                      this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                      stackIn_45_0 = ~param2;
                      stackIn_45_1 = -1;
                      if (stackIn_45_0 != stackIn_45_1) {
                        var14 = qu.field_b[param2];
                        var15 = qu.field_d[param2];
                        var16 = -(this.field_A[var13_int] * var14) + (var15 * this.field_K[var13_int] + 16383) >> 14;
                        this.field_A[var13_int] = this.field_A[var13_int] * var15 + this.field_K[var13_int] * var14 + 16383 >> 14;
                        this.field_K[var13_int] = var16;
                      }
                      if (param4 != 0) {
                        var14 = qu.field_b[param4];
                        var15 = qu.field_d[param4];
                        var16 = 16383 + var14 * this.field_K[var13_int] + this.field_P[var13_int] * var15 >> 14;
                        this.field_K[var13_int] = this.field_K[var13_int] * var15 - var14 * this.field_P[var13_int] + 16383 >> 14;
                        this.field_P[var13_int] = var16;
                      }
                      if (param3 != 0) {
                        var14 = qu.field_b[param3];
                        var15 = qu.field_d[param3];
                        var16 = 16383 + this.field_A[var13_int] * var14 + var15 * this.field_P[var13_int] >> 14;
                        this.field_A[var13_int] = 16383 + var15 * this.field_A[var13_int] - var14 * this.field_P[var13_int] >> 14;
                        this.field_P[var13_int] = var16;
                      }
                      this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                      this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                      this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                      var12++;
                    }
                  } else {
                    var12 = 0;
                    while (var11.length > var12) {
                      var13_int = var11[var12];
                      this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                      this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                      this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                      stackIn_45_0 = 0;
                      stackIn_45_1 = param4;
                      if (stackIn_45_0 != stackIn_45_1) {
                        var14 = qu.field_b[param4];
                        var15 = qu.field_d[param4];
                        var16 = this.field_P[var13_int] * var15 + this.field_K[var13_int] * var14 + 16383 >> 14;
                        this.field_K[var13_int] = 16383 + (var15 * this.field_K[var13_int] - var14 * this.field_P[var13_int]) >> 14;
                        this.field_P[var13_int] = var16;
                      }
                      if (param2 != 0) {
                        var14 = qu.field_b[param2];
                        var15 = qu.field_d[param2];
                        var16 = var15 * this.field_K[var13_int] - var14 * this.field_A[var13_int] + 16383 >> 14;
                        this.field_A[var13_int] = var14 * this.field_K[var13_int] + this.field_A[var13_int] * var15 + 16383 >> 14;
                        this.field_K[var13_int] = var16;
                      }
                      if (0 != param3) {
                        var14 = qu.field_b[param3];
                        var15 = qu.field_d[param3];
                        var16 = this.field_A[var13_int] * var14 - (-(var15 * this.field_P[var13_int]) - 16383) >> 14;
                        this.field_A[var13_int] = -(var14 * this.field_P[var13_int]) + (this.field_A[var13_int] * var15 + 16383) >> 14;
                        this.field_P[var13_int] = var16;
                      }
                      this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                      this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                      this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                      var12++;
                    }
                  }
                }
                var9++;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              if (!param6) {
                return;
              }
              var9 = 0;
              while (true) {
                stackIn_82_0 = ~var9;
                stackIn_83_0Lifetime1 = stackIn_82_0;
                stackIn_83_1Lifetime1 = ~var8_int;
                if (stackIn_83_0Lifetime1 <= stackIn_83_1Lifetime1) {
                  break;
                }
                var10 = param1[var9];
                if (var21 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (var10 < this.field_d.length) {
                  var11 = this.field_d[var10];
                  var12 = 0;
                  while (true) {
                    stackIn_90_0 = var12;
                    stackIn_90_1 = var11.length;
                    if (stackIn_90_0 >= stackIn_90_1) {
                      break;
                    }
                    var13_int = var11[var12];
                    var14 = this.field_e[var13_int];
                    var15 = this.field_e[1 + var13_int];
                    stackIn_82_0Lifetime1 = var14;
                    var16 = stackIn_82_0Lifetime1;
                    while (var16 < var15) {
                      var17 = -1 + this.field_q[var16];
                      stackIn_90_0Lifetime1 = -1;
                      stackIn_90_1Lifetime1 = var17;
                      if (stackIn_90_0Lifetime1 != stackIn_90_1Lifetime1 ||
                        var21 != 0) {
                        if (param4 != 0) {
                          var18 = qu.field_b[param4];
                          var19 = qu.field_d[param4];
                          var20 = 16383 + var19 * this.field_E[var17] + this.field_Y[var17] * var18 >> 14;
                          this.field_Y[var17] = (short)(var19 * this.field_Y[var17] - var18 * this.field_E[var17] + 16383 >> 14);
                          this.field_E[var17] = (short)var20;
                        }
                        if (param2 != 0) {
                          var18Lifetime1 = qu.field_b[param2];
                          var19Lifetime1 = qu.field_d[param2];
                          var20Lifetime1 = 16383 + this.field_Y[var17] * var19Lifetime1 - var18Lifetime1 * this.field_cb[var17] >> 14;
                          this.field_cb[var17] = (short)(this.field_Y[var17] * var18Lifetime1 + var19Lifetime1 * this.field_cb[var17] + 16383 >> 14);
                          this.field_Y[var17] = (short)var20Lifetime1;
                        }
                        if (param3 != 0) {
                          var18Lifetime2 = qu.field_b[param3];
                          var19Lifetime2 = qu.field_d[param3];
                          var20Lifetime2 = 16383 + (var19Lifetime2 * this.field_E[var17] + var18Lifetime2 * this.field_cb[var17]) >> 14;
                          this.field_cb[var17] = (short)(16383 + var19Lifetime2 * this.field_cb[var17] - var18Lifetime2 * this.field_E[var17] >> 14);
                          this.field_E[var17] = (short)var20Lifetime2;
                        }
                        var16++;
                        continue;
                      }
                      break;
                    }
                    var12++;
                  }
                }
                var9++;
                continue;
              }
            }
            if ((decompiledFrameRemainder0) && (decompiledFrameCompleted0) && (this.field_F == null &&
              this.field_kb != null)) {
              this.field_kb.field_d = null;
            }
            if (null != this.field_F) {
              this.field_F.field_d = null;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_284_0 = var8;
          stackIn_284_1 = new StringBuilder().append("np.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_285_2 = "null";
          } else {
            stackIn_285_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_284_0), ((StringBuilder) (Object) stackIn_284_1).append(stackIn_285_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void d(int param0) {
        try {
          field_V = null;
          int var1_int = -40 % ((56 - param0) / 48);
          field_J = null;
          field_m = null;
          field_x = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "np.M(" + param0 + ')');
        }
    }

    final void wa() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = 0;
          L1: while (true) {
            if (var1_int < this.field_N) {
              this.field_P[var1_int] = this.field_P[var1_int] + 7 >> 4;
              this.field_K[var1_int] = this.field_K[var1_int] + 7 >> 4;
              this.field_A[var1_int] = 7 + this.field_A[var1_int] >> 4;
              var1_int++;
              if (var2 == 0) {
                continue;
              }
            } else {
              if (null == this.field_g) {
                break L1;
              }
            }
            this.field_g.field_d = null;
            break;
          }
          this.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.wa()");
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_gb) {
            return;
          }
          this.field_gb = false;
          if (null == this.field_D &&
            this.field_t == null &&
            this.field_r == null &&
            !aw.c(-17275, this.field_u, this.field_bb)) {
            var2_int = 0;
            var3 = 0;
            if (null != this.field_P &&
              !uv.a(this.field_u, 1, this.field_bb)) {
              if (this.field_g == null ||
                this.field_g.field_d != null) {
                if (!this.field_l) {
                  this.c(2709);
                }
                var2_int = 1;
                if (var5 != 0) {
                  this.field_gb = true;
                }
              } else {
                this.field_gb = true;
              }
            }
            var4 = 0;
            if (null != this.field_K &&
              !pt.a(-61, this.field_bb, this.field_u)) {
              if (null != this.field_g &&
                null == this.field_g.field_d) {
                this.field_gb = true;
                if (var5 != 0) {
                  if (!this.field_l) {
                    this.c(2709);
                  }
                  var3 = 1;
                }
              } else {
                if (!this.field_l) {
                  this.c(2709);
                }
                var3 = 1;
              }
            }
            if (this.field_A != null &&
              !jc.c(this.field_u, -23717, this.field_bb)) {
              if (this.field_g == null ||
                null != this.field_g.field_d) {
                if (!this.field_l) {
                  this.c(2709);
                }
                var4 = 1;
                if (var5 != 0) {
                  this.field_gb = true;
                }
              } else {
                this.field_gb = true;
              }
            }
            if (var3 != 0) {
              this.field_K = null;
            }
            if (var4 != 0) {
              this.field_A = null;
            }
            if (var2_int != 0) {
              this.field_P = null;
            }
          }
          if (null != this.field_q &&
            this.field_P == null &&
            null == this.field_K &&
            this.field_A == null) {
            this.field_e = null;
            this.field_q = null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_O != null &&
            !oea.a(this.field_bb, this.field_u, (byte) 115)) {
            if (null != this.field_F) {
              if (this.field_F.field_d != null) {
                this.field_cb = null;
                this.field_O = null;
                this.field_E = null;
                this.field_Y = null;
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.field_gb = true;
                if (var5 != 0) {
                  if (null == this.field_kb ||
                    this.field_kb.field_d != null) {
                    this.field_O = null;
                    this.field_cb = null;
                    this.field_Y = null;
                    this.field_E = null;
                    this.field_gb = true;
                  } else {
                    this.field_gb = true;
                  }
                }
              }
            } else {
              if (null == this.field_kb ||
                this.field_kb.field_d != null) {
                this.field_O = null;
                this.field_cb = null;
                this.field_Y = null;
                this.field_E = null;
                if (var5 != 0) {
                  this.field_gb = true;
                }
              } else {
                this.field_gb = true;
              }
            }
          }
          var2_intLifetime1 = -95 % ((param0 + 49) / 55);
          if (null != this.field_X &&
            !sm.a(2, this.field_bb, this.field_u)) {
            if (null == this.field_kb ||
              null != this.field_kb.field_d) {
              this.field_X = null;
              if (var5 != 0) {
                this.field_gb = true;
              }
            } else {
              this.field_gb = true;
            }
          }
          if (this.field_o != null &&
            !gda.b(107, this.field_u, this.field_bb)) {
            if (null == this.field_kb ||
              null != this.field_kb.field_d) {
              this.field_o = null;
              if (var5 != 0) {
                this.field_gb = true;
              }
            } else {
              this.field_gb = true;
            }
          }
          if (null != this.field_n &&
            !lva.a(this.field_bb, (byte) -21, this.field_u)) {
            if (null == this.field_ab ||
              this.field_ab.field_d != null) {
              this.field_n = null;
              this.field_y = null;
              if (var5 != 0) {
                this.field_gb = true;
              }
            } else {
              this.field_gb = true;
            }
          }
          if (null != this.field_I &&
            !in.a(this.field_bb, this.field_u, (byte) -115)) {
            if (null != this.field_kb &&
              this.field_kb.field_d == null) {
              this.field_gb = true;
              if (var5 != 0) {
                this.field_I = null;
              }
            } else {
              this.field_I = null;
            }
          }
          if (this.field_H != null &&
            !ae.a(this.field_bb, this.field_u, 6100)) {
            if ((this.field_w == null ||
              this.field_w.field_a != null) &&
              (null == this.field_kb ||
              this.field_kb.field_d != null)) {
              this.field_z = null;
              this.field_hb = null;
              this.field_H = null;
              if (var5 != 0) {
                this.field_gb = true;
              }
            } else {
              this.field_gb = true;
            }
          }
          if (this.field_j != null &&
            !aw.d(-26571, this.field_bb, this.field_u)) {
            this.field_j = (int[][]) null;
            this.field_fb = null;
          }
          if (null != this.field_d &&
            !kda.b(this.field_bb, 124, this.field_u)) {
            this.field_db = null;
            this.field_d = (int[][]) null;
          }
          if (null != this.field_C &&
            !eo.a(this.field_u, (byte) -125, this.field_bb)) {
            this.field_C = (int[][]) null;
          }
          if (this.field_p != null &&
            (this.field_bb & 2048) == 0 &&
            (this.field_bb & 262144) == 0) {
            this.field_p = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.J(" + param0 + ')');
        }
    }

    np(cka param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_L = 0;
        this.field_l = false;
        this.field_N = 0;
        this.field_s = false;
        this.field_gb = true;
        this.field_ib = 0;
        this.field_W = 0;
        this.field_lb = 0;
        try {
          this.field_R = param0;
          this.field_g = new tj((va) null, 5126, 3, 0);
          this.field_ab = new tj((va) null, 5126, 2, 0);
          this.field_F = new tj((va) null, 5126, 3, 0);
          this.field_kb = new tj((va) null, 5121, 4, 0);
          this.field_w = new afa();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("np.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    np(cka param0, oc param1, int param2, int param3, int param4, int param5) {
        int fieldTemp$0 = 0;
        short dupTemp$1 = 0;
        short dupTemp$2 = 0;
        short dupTemp$3 = 0;
        uo dupTemp$4 = null;
        int[] array$6 = null;
        int dupTemp$7 = 0;
        int[] arrayValue$8 = null;
        int incrementValue$5 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_148_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_188_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_312_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        oc stackIn_353_0 = null;
        int stackIn_356_0 = 0;
        int stackIn_356_1 = 0;
        int stackIn_372_0 = 0;
        RuntimeException stackIn_391_0 = null;
        StringBuilder stackIn_391_1 = null;
        String stackIn_392_2 = null;
        StringBuilder stackIn_395_1 = null;
        String stackIn_396_2 = null;
        RuntimeException decompiledCaughtException = null;
        d var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        dw var10_ref_dw = null;
        int var10 = 0;
        int var11_int = 0;
        pa[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        ima var14_ref = null;
        int var15_int = 0;
        uo[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22_int = 0;
        float var22 = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        pa var31_ref_pa = null;
        uo var31_ref_uo = null;
        int var31 = 0;
        int var32_int = 0;
        long var32_long = 0L;
        uo var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        pa var37 = null;
        float[] var38_ref_float__ = null;
        float var38 = 0.0f;
        int var39_int = 0;
        float var39 = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        int var43_int = 0;
        float var43 = 0.0f;
        int var44_int = 0;
        float var44 = 0.0f;
        int var45_int = 0;
        float var45 = 0.0f;
        int var46_int = 0;
        float var46 = 0.0f;
        int var47_int = 0;
        float var47 = 0.0f;
        int var48_int = 0;
        float var48 = 0.0f;
        int var49_int = 0;
        float var49 = 0.0f;
        int var50_int = 0;
        float var50 = 0.0f;
        int var51_int = 0;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        var63 = TombRacer.field_G ? 1 : 0;
        this.field_L = 0;
        this.field_l = false;
        this.field_N = 0;
        this.field_s = false;
        this.field_gb = true;
        this.field_ib = 0;
        this.field_W = 0;
        this.field_lb = 0;
        try {
          this.field_bb = param2;
          this.field_R = param0;
          this.field_u = param5;
          if (hha.a(param5, 0, param2)) {
            this.field_g = new tj((va) null, 5126, 3, 0);
          }
          if (wu.a(-17, param5, param2)) {
            this.field_ab = new tj((va) null, 5126, 2, 0);
          }
          if (kb.a(param5, param2, (byte) 17)) {
            this.field_F = new tj((va) null, 5126, 3, 0);
          }
          if (we.b(param2, param5, 2048)) {
            this.field_kb = new tj((va) null, 5121, 4, 0);
          }
          if (mm.a(-122, param2, param5)) {
            this.field_w = new afa();
          }
          var7 = param0.field_c;
          var8 = new int[param1.field_o];
          this.field_e = new int[param1.field_L + 1];
          var9_int = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(param1.field_o > var9_int)))) {
            if (var63 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (param1.field_G == null ||
                2 != param1.field_G[var9_int]) {
                if (param1.field_r != null &&
                  param1.field_r[var9_int] != -1) {
                  var10_ref_dw = var7.a((byte) 111, param1.field_r[var9_int] & 65535);
                  decompiledFrameRemainder0 = (((64 & this.field_u) != 0 &&
                    var10_ref_dw.field_p) || !(var10_ref_dw.field_f));
                }
                if (decompiledFrameRemainder0) {
                  fieldTemp$0 = this.field_W;
                  this.field_W = this.field_W + 1;
                  var8[fieldTemp$0] = var9_int;
                  dupTemp$1 = param1.field_a[var9_int];
                  this.field_e[dupTemp$1] = this.field_e[dupTemp$1] + 1;
                  dupTemp$2 = param1.field_t[var9_int];
                  this.field_e[dupTemp$2] = this.field_e[dupTemp$2] + 1;
                  dupTemp$3 = param1.field_J[var9_int];
                  this.field_e[dupTemp$3] = this.field_e[dupTemp$3] + 1;
                }
              }
              var9_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_ib = this.field_W;
          }
          var9 = new long[this.field_W];
          stackIn_49_0 = ((this.field_bb & 256) == 0) ? 0 : 1;
          var10 = stackIn_49_0;
          var11_int = 0;
          while (true) {
            stackIn_51_0 = var11_int;
            stackIn_51_1 = this.field_W;
            if (stackIn_51_0 < stackIn_51_1) {
              var12 = var8[var11_int];
              var13_ref = null;
              var14_int = 0;
              var15_int = 0;
              var16 = 0;
              var17 = 0;
              if (var63 == 0) {
                boolean decompiledFrameRemainder1 = true;
                if (null != param1.field_m) {
                  var18 = 0;
                  var19_int = 0;
                  while (var19_int < param1.field_m.length) {
                    var20_ref_jt = param1.field_m[var19_int];
                    stackIn_51_0 = ~var12;
                    stackIn_51_1 = ~var20_ref_jt.field_a;
                    if (stackIn_51_0 == stackIn_51_1) {
                      var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                      if (var21_ref_lp.field_i) {
                        var18 = 1;
                      }
                      if (var21_ref_lp.field_f != -1) {
                        var22_ref_dw = var7.a((byte) -92, var21_ref_lp.field_f);
                        if (var22_ref_dw.field_d == 2) {
                          this.field_s = true;
                        }
                      }
                    }
                    var19_int++;
                  }
                  if (var18 != 0) {
                    var9[var11_int] = 9223372036854775807L;
                    this.field_ib = this.field_ib - 1;
                    decompiledFrameRemainder1 = false;
                  }
                }
                if (decompiledFrameRemainder1) {
                  var18 = -1;
                  if (param1.field_r != null) {
                    var18 = param1.field_r[var12];
                    if (var18 != -1) {
                      var13_ref = var7.a((byte) 118, 65535 & var18);
                      if ((64 & this.field_u) == 0 ||
                        !((dw) (var13_ref)).field_p) {
                        var16 = ((dw) (var13_ref)).field_h;
                        if (0 == ((dw) (var13_ref)).field_s &&
                          0 != ((dw) (var13_ref)).field_o) {
                        }
                        var17 = ((dw) (var13_ref)).field_a;
                      } else {
                        var18 = -1;
                        var13_ref = null;
                      }
                    }
                  }
                  if ((param1.field_n == null ||
                    param1.field_n[var12] == 0) &&
                    (var13_ref == null ||
                    ((dw) (var13_ref)).field_d == 0)) {
                    stackIn_107_0 = 0;
                  } else {
                    stackIn_107_0 = 1;
                  }
                  var19_int = stackIn_107_0;
                  if ((var10 != 0 ||
                    var19_int != 0) && null != param1.field_C) {
                    var14_int = var14_int + (param1.field_C[var12] << 17);
                  }
                  if (var19_int != 0) {
                    var14_int = var14_int + 65536;
                  }
                  var14_int = var14_int + (var16 << 8 & 65280);
                  var15_int = var15_int + ((var18 & 65535) << 16);
                  var14_int = var14_int + (var17 & 255);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = ((long)var14_int << 32) + (long)var15_int;
                  this.field_s = this.field_s | var19_int != 0;
                }
                var11_int++;
                continue;
              }
            } else {
              ofa.a(var8, var9, 93);
              this.field_P = param1.field_b;
              this.field_A = param1.field_p;
              this.field_N = param1.field_E;
              this.field_K = param1.field_I;
              this.field_lb = param1.field_L;
              this.field_db = param1.field_y;
              this.field_t = param1.field_e;
            }
            boolean decompiledFrameCompleted0 = true;
            var11 = new pa[this.field_lb];
            this.field_D = param1.field_B;
            if (param1.field_m != null) {
              this.field_G = param1.field_m.length;
              this.field_f = new fd[this.field_G];
              this.field_r = new pm[this.field_G];
              var12 = 0;
              while (var12 < this.field_G) {
                var13_ref = param1.field_m[var12];
                var14 = fw.a(((jt) (var13_ref)).field_d, false);
                var15_int = -1;
                stackIn_148_0 = 0;
                if (var63 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var16 = stackIn_148_0;
                while (this.field_W > var16) {
                  stackIn_139_0 = ~((jt) (var13_ref)).field_a;
                  stackIn_139_1 = ~var8[var16];
                  if (stackIn_139_0 == stackIn_139_1) {
                    var15_int = var16;
                  } else {
                    var16++;
                    continue;
                  }
                  break;
                }
                stackIn_139_0 = 0;
                stackIn_139_1 = ~var15_int;
                if (stackIn_139_0 == stackIn_139_1) {
                  throw new RuntimeException();
                }
                var16 = cla.field_m[param1.field_A[((jt) (var13_ref)).field_a] & 65535] & 16777215;
                stackIn_145_0 = var16;
                stackIn_145_1 = 255;
                if (param1.field_n != null) {
                  stackIn_146_2 = param1.field_n[((jt) (var13_ref)).field_a];
                } else {
                  stackIn_146_2 = 0;
                }
                var16 = stackIn_145_0 | stackIn_145_1 - stackIn_146_2 << 24;
                this.field_r[var12] = new pm(var15_int, (int) param1.field_a[((jt) (var13_ref)).field_a], (int) param1.field_t[((jt) (var13_ref)).field_a], (int) param1.field_J[((jt) (var13_ref)).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) (var13_ref)).field_c);
                this.field_f[var12] = new fd(var16);
                var12++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_148_0 = this.field_W * 3;
            }
            var12 = stackIn_148_0;
            if (null != param1.field_h) {
              this.field_fb = new short[this.field_W];
            }
            this.field_y = new float[var12];
            this.field_n = new float[var12];
            this.field_Y = new short[var12];
            this.field_I = new short[this.field_W];
            this.field_E = new short[var12];
            this.field_hb = new short[this.field_W];
            this.field_O = new byte[var12];
            this.field_cb = new short[var12];
            this.field_o = new byte[this.field_W];
            this.field_h = (short)param4;
            this.field_z = new short[this.field_W];
            this.field_H = new short[this.field_W];
            this.field_B = (short)param3;
            this.field_X = new short[this.field_W];
            this.field_q = new short[var12];
            qka.field_m = new long[var12];
            var13 = 0;
            var14_int = 0;
            do {
              if (!(var14_int < param1.field_L)) {
                this.field_e[param1.field_L] = var13;
                break;
              }
              var15_int = this.field_e[var14_int];
              this.field_e[var14_int] = var13;
              var13 = var13 + var15_int;
              var11[var14_int] = new pa();
              var14_int++;
            } while (var63 == 0);
            var14_ref = qqa.a(var8, param1, this.field_W, (byte) -6);
            var15 = new uo[param1.field_o];
            var16 = 0;
            L47: while (true) {
              if (var16 < param1.field_o) {
                var17 = param1.field_a[var16];
                var18 = param1.field_t[var16];
                var19_int = param1.field_J[var16];
                var20 = this.field_P[var18] - this.field_P[var17];
                var21 = this.field_K[var18] - this.field_K[var17];
                var22_int = this.field_A[var18] - this.field_A[var17];
                var23_int = this.field_P[var19_int] - this.field_P[var17];
                var24_int = -this.field_K[var17] + this.field_K[var19_int];
                var25_int = this.field_A[var19_int] - this.field_A[var17];
                var26_int = var21 * var25_int - var24_int * var22_int;
                var27_int = var22_int * var23_int - var25_int * var20;
                stackIn_196_0 = var20 * var24_int - var21 * var23_int;
                if (var63 != 0) {
                  break L47;
                }
                var28 = stackIn_196_0;
                while (true) {
                  if (8192 >= var26_int) {
                    stackIn_181_0 = -8193;
                    stackIn_181_1 = ~var27_int;
                  }
                  if (8192 < var26_int || (stackIn_181_0 > stackIn_181_1 ||
                    var28 > 8192 ||
                    -8192 > var26_int ||
                    -8192 > var27_int ||
                    -8192 > var28)) {
                    var26_int = var26_int >> 1;
                    var28 = var28 >> 1;
                    stackIn_181_0 = var27_int;
                    stackIn_181_1 = 1;
                    var27_int = stackIn_181_0 >> stackIn_181_1;
                    continue;
                  }
                  break;
                }
                var29 = (int)Math.sqrt((double)(var28 * var28 + var26_int * var26_int + var27_int * var27_int));
                if (var29 <= 0) {
                  var29 = 1;
                }
                var27_int = 256 * var27_int / var29;
                var28 = var28 * 256 / var29;
                var26_int = 256 * var26_int / var29;
                if (param1.field_G != null) {
                  stackIn_188_0 = param1.field_G[var16];
                } else {
                  stackIn_188_0 = 0;
                }
                var30 = stackIn_188_0;
                if (var30 == 0) {
                  var31_ref_pa = var11[var17];
                  var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                  var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                  var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                  var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                  var31_ref_pa = var11[var18];
                  var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                  var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                  var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                  var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                  var31_ref_pa = var11[var19_int];
                  var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                  var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                  var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                  var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                } else {
                  if (var30 == 1) {
                    dupTemp$4 = new uo();
                    var15[var16] = dupTemp$4;
                    var31_ref_uo = dupTemp$4;
                    var31_ref_uo.field_a = var28;
                    var31_ref_uo.field_b = var26_int;
                    var31_ref_uo.field_c = var27_int;
                  }
                }
                var16++;
                continue;
              }
              stackIn_196_0 = 0;
              break;
            }
            var16 = stackIn_196_0;
            L60: while (true) {
              if (var16 < this.field_W) {
                var17 = var8[var16];
                var18 = param1.field_A[var17] & 65535;
                stackIn_353_0 = (oc) (param1);
                if (var63 == 0) {
                  if (stackIn_353_0.field_g == null) {
                    var19_int = -1;
                  } else {
                    var19_int = param1.field_g[var17];
                  }
                  if (param1.field_n != null) {
                    var20 = 255 & param1.field_n[var17];
                  } else {
                    var20 = 0;
                  }
                  if (param1.field_r == null) {
                    stackIn_211_0 = -1;
                  } else {
                    stackIn_211_0 = param1.field_r[var17];
                  }
                  var21 = stackIn_211_0;
                  if (-1 != var21 &&
                    (64 & this.field_u) != 0) {
                    var22_ref_dw = var7.a((byte) -92, 65535 & var21);
                    if (var22_ref_dw.field_p) {
                      var21 = -1;
                    }
                  }
                  var22 = 0.0f;
                  var23 = 0.0f;
                  var24 = 0.0f;
                  var25 = 0.0f;
                  var26 = 0.0f;
                  var27 = 0.0f;
                  var28 = 0;
                  var29 = 0;
                  var30 = 0;
                  if (-1 != var21) {
                    if (var19_int == -1) {
                      var23 = 1.0f;
                      var22 = 0.0f;
                      var24 = 1.0f;
                      var27 = 0.0f;
                      var26 = 0.0f;
                      var29 = 2;
                      var25 = 1.0f;
                      var28 = 1;
                    } else {
                      var19_int = var19_int & 255;
                      var31 = param1.field_u[var19_int];
                      if (var31 != 0) {
                        var32_int = param1.field_a[var17];
                        var33_int = param1.field_t[var17];
                        var34 = param1.field_J[var17];
                        var35 = var14_ref.field_a[var19_int];
                        var36 = var14_ref.field_c[var19_int];
                        var37_int = var14_ref.field_d[var19_int];
                        var38_ref_float__ = var14_ref.field_b[var19_int];
                        var39_int = param1.field_z[var19_int];
                        var40 = (float)param1.field_d[var19_int] / 256.0f;
                        switch (var31) {
                          case 3:
                            ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var32_int]);
                            var22 = dia.field_p[0];
                            var23 = dia.field_p[1];
                            ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var33_int]);
                            var25 = dia.field_p[1];
                            var24 = dia.field_p[0];
                            ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var34]);
                            var27 = dia.field_p[1];
                            var26 = dia.field_p[0];
                            if ((var39_int & 1) == 0) {
                              if (var26 - var22 > 0.5f) {
                                var29 = 1;
                                var26 = var26 - 1.0f;
                              } else {
                                if (var22 - var26 > 0.5f) {
                                  var26 = var26 + 1.0f;
                                  var29 = 2;
                                }
                              }
                              if (var24 - var22 > 0.5f) {
                                var24 = var24 - 1.0f;
                                var28 = 1;
                              } else if (var22 - var24 > 0.5f) {
                                var24 = var24 + 1.0f;
                                var28 = 2;
                              }
                            } else {
                              if (!(0.5f < var27 - var23)) {
                                if (var23 - var27 > 0.5f) {
                                  var27 = var27 + 1.0f;
                                  var29 = 2;
                                }
                              } else {
                                var29 = 1;
                                var27 = var27 - 1.0f;
                              }
                              if (!(var25 - var23 > 0.5f)) {
                                if (0.5f < var23 - var25) {
                                  var28 = 2;
                                  var25 = var25 + 1.0f;
                                }
                              } else {
                                var25 = var25 - 1.0f;
                                var28 = 1;
                              }
                            }
                            break;
                          case 2:
                            var41 = (float)param1.field_v[var19_int] / 256.0f;
                            var42 = (float)param1.field_c[var19_int] / 256.0f;
                            var43_int = param1.field_b[var33_int] - param1.field_b[var32_int];
                            var44_int = param1.field_I[var33_int] - param1.field_I[var32_int];
                            var45_int = param1.field_p[var33_int] - param1.field_p[var32_int];
                            var46_int = -param1.field_b[var32_int] + param1.field_b[var34];
                            var47_int = -param1.field_I[var32_int] + param1.field_I[var34];
                            var48_int = -param1.field_p[var32_int] + param1.field_p[var34];
                            var49_int = var48_int * var44_int - var47_int * var45_int;
                            var50_int = var45_int * var46_int - var48_int * var43_int;
                            var51_int = -(var44_int * var46_int) + var47_int * var43_int;
                            var52 = 64.0f / (float)param1.field_j[var19_int];
                            var53 = 64.0f / (float)param1.field_f[var19_int];
                            var54 = 64.0f / (float)param1.field_x[var19_int];
                            var55 = (var38_ref_float__[2] * (float)var51_int + (var38_ref_float__[0] * (float)var49_int + (float)var50_int * var38_ref_float__[1])) / var52;
                            var56 = (var38_ref_float__[4] * (float)var50_int + (float)var49_int * var38_ref_float__[3] + var38_ref_float__[5] * (float)var51_int) / var53;
                            var57 = (var38_ref_float__[8] * (float)var51_int + ((float)var50_int * var38_ref_float__[7] + var38_ref_float__[6] * (float)var49_int)) / var54;
                            var30 = mr.a(var57, var56, false, var55);
                            as.a(var36, dia.field_p, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -101, var40, var39_int, var38_ref_float__);
                            var22 = dia.field_p[0];
                            var23 = dia.field_p[1];
                            as.a(var36, dia.field_p, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], -95, var40, var39_int, var38_ref_float__);
                            var25 = dia.field_p[1];
                            var24 = dia.field_p[0];
                            as.a(var36, dia.field_p, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], -99, var40, var39_int, var38_ref_float__);
                            var26 = dia.field_p[0];
                            var27 = dia.field_p[1];
                            break;
                          case 1:
                            var41 = (float)param1.field_x[var19_int] / 1024.0f;
                            loa.a(var39_int, dia.field_p, var41, param1.field_p[var32_int], param1.field_I[var32_int], 86, var38_ref_float__, var40, var36, var37_int, param1.field_b[var32_int], var35);
                            var23 = dia.field_p[1];
                            var22 = dia.field_p[0];
                            loa.a(var39_int, dia.field_p, var41, param1.field_p[var33_int], param1.field_I[var33_int], -68, var38_ref_float__, var40, var36, var37_int, param1.field_b[var33_int], var35);
                            var25 = dia.field_p[1];
                            var24 = dia.field_p[0];
                            loa.a(var39_int, dia.field_p, var41, param1.field_p[var34], param1.field_I[var34], 113, var38_ref_float__, var40, var36, var37_int, param1.field_b[var34], var35);
                            var26 = dia.field_p[0];
                            var27 = dia.field_p[1];
                            var42 = var41 / 2.0f;
                            if ((var39_int & 1) == 0) {
                              if (var26 - var22 > var42) {
                                var26 = var26 - var41;
                                var29 = 1;
                              } else {
                                if (var42 < -var26 + var22) {
                                  var26 = var26 + var41;
                                  var29 = 2;
                                }
                              }
                              if (var42 < -var22 + var24) {
                                var24 = var24 - var41;
                                var28 = 1;
                              } else if (var42 < -var24 + var22) {
                                var24 = var24 + var41;
                                var28 = 2;
                              }
                            } else {
                              if (var42 < var25 - var23) {
                                var28 = 1;
                                var25 = var25 - var41;
                              } else {
                                if (-var25 + var23 > var42) {
                                  var25 = var25 + var41;
                                  var28 = 2;
                                }
                              }
                              if (!(-var23 + var27 > var42)) {
                                if (var42 < var23 - var27) {
                                  var29 = 2;
                                  var27 = var27 + var41;
                                }
                              } else {
                                var27 = var27 - var41;
                                var29 = 1;
                              }
                            }
                            break;
                          default:
                            break;
                        }
                      } else {
                        var32_int = param1.field_a[var17];
                        var33_int = param1.field_t[var17];
                        var34 = param1.field_J[var17];
                        var35 = param1.field_s[var19_int];
                        var36 = param1.field_q[var19_int];
                        var37_int = param1.field_K[var19_int];
                        var38 = (float)param1.field_b[var35];
                        var39 = (float)param1.field_I[var35];
                        var40 = (float)param1.field_p[var35];
                        var41 = (float)param1.field_b[var36] - var38;
                        var42 = (float)param1.field_I[var36] - var39;
                        var43 = (float)param1.field_p[var36] - var40;
                        var44 = (float)param1.field_b[var37_int] - var38;
                        var45 = (float)param1.field_I[var37_int] - var39;
                        var46 = (float)param1.field_p[var37_int] - var40;
                        var47 = -var38 + (float)param1.field_b[var32_int];
                        var48 = (float)param1.field_I[var32_int] - var39;
                        var49 = (float)param1.field_p[var32_int] - var40;
                        var50 = (float)param1.field_b[var33_int] - var38;
                        var51 = (float)param1.field_I[var33_int] - var39;
                        var52 = (float)param1.field_p[var33_int] - var40;
                        var53 = (float)param1.field_b[var34] - var38;
                        var54 = (float)param1.field_I[var34] - var39;
                        var55 = -var40 + (float)param1.field_p[var34];
                        var56 = var46 * var42 - var43 * var45;
                        var57 = -(var41 * var46) + var43 * var44;
                        var58 = -(var44 * var42) + var41 * var45;
                        var59 = var45 * var58 - var57 * var46;
                        var60 = var46 * var56 - var44 * var58;
                        var61 = -(var45 * var56) + var44 * var57;
                        var62 = 1.0f / (var41 * var59 + var42 * var60 + var61 * var43);
                        var26 = (var54 * var60 + var53 * var59 + var61 * var55) * var62;
                        var24 = (var51 * var60 + var59 * var50 + var61 * var52) * var62;
                        var22 = (var61 * var49 + (var59 * var47 + var60 * var48)) * var62;
                        var61 = var41 * var57 - var42 * var56;
                        var60 = -(var58 * var41) + var43 * var56;
                        var59 = -(var43 * var57) + var58 * var42;
                        var62 = 1.0f / (var45 * var60 + var44 * var59 + var46 * var61);
                        var25 = (var59 * var50 + var51 * var60 + var52 * var61) * var62;
                        var23 = (var61 * var49 + (var48 * var60 + var59 * var47)) * var62;
                        var27 = (var55 * var61 + (var60 * var54 + var59 * var53)) * var62;
                      }
                    }
                  }
                  if (param1.field_G != null) {
                    var31 = param1.field_G[var17];
                  } else {
                    var31 = 0;
                  }
                  if (0 == var31) {
                    var32_long = (long)(var19_int << 2) + ((long)var20 + ((long)(var30 << 24) + (long)(var18 << 8)) << 32);
                    var34 = param1.field_a[var17];
                    var35 = param1.field_t[var17];
                    var36 = param1.field_J[var17];
                    var37 = var11[var34];
                    this.field_H[var16] = this.a(var32_long, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var34, var37.field_e, var23, param1, var22);
                    var37 = var11[var35];
                    this.field_z[var16] = this.a(var32_long + (long)var28, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var35, var37.field_e, var25, param1, var24);
                    var37 = var11[var36];
                    this.field_hb[var16] = this.a(var32_long + (long)var29, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var36, var37.field_e, var27, param1, var26);
                  } else {
                    if (var31 == 1) {
                      var32 = var15[var17];
                      stackIn_312_0 = (256 + var32.field_a << 22) + ((var32.field_c + 256 << 12) + (var19_int << 2));
                      if (var32.field_b > 0) {
                        stackIn_313_1 = 1024;
                      } else {
                        stackIn_313_1 = 2048;
                      }
                      var33 = (long)(stackIn_312_0 + stackIn_313_1) + ((long)var20 + (long)(var18 << 8) + (long)(var30 << 24) << 32);
                      this.field_H[var16] = this.a(var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_a[var17], var32.field_b, var23, param1, var22);
                      this.field_z[var16] = this.a(var33 + (long)var28, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_t[var17], var32.field_b, var25, param1, var24);
                      this.field_hb[var16] = this.a((long)var29 + var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_J[var17], var32.field_b, var27, param1, var26);
                    }
                  }
                  if (param1.field_n != null) {
                    this.field_o[var16] = param1.field_n[var17];
                  }
                  if (param1.field_h != null) {
                    this.field_fb[var16] = param1.field_h[var17];
                  }
                  this.field_X[var16] = param1.field_A[var17];
                  this.field_I[var16] = (short) var21;
                  var16++;
                  continue;
                }
              } else {
                var16 = 0;
                var17 = -10000;
                var18 = 0;
                L97: while (true) {
                  if (this.field_ib > var18) {
                    var19_int = this.field_I[var18];
                    stackIn_332_0 = ~var19_int;
                    stackIn_332_1 = ~var17;
                    if (var63 != 0) {
                      if (stackIn_332_0 < stackIn_332_1) {
                        var19_int = this.field_I[var18];
                        stackIn_356_0 = ~var19_int;
                        stackIn_356_1 = ~var17;
                        break L60;
                      }
                      break L97;
                    }
                    if (stackIn_332_0 != stackIn_332_1) {
                      var17 = var19_int;
                      var16++;
                    }
                    var18++;
                    continue;
                  }
                  this.field_p = new int[var16 + 1];
                  var17 = -10000;
                  var16 = 0;
                  var18 = 0;
                  while (true) {
                    stackIn_332_0 = ~this.field_ib;
                    stackIn_332_1 = ~var18;
                    if (stackIn_332_0 >= stackIn_332_1) {
                      break;
                    }
                    var19_int = this.field_I[var18];
                    stackIn_356_0 = ~var19_int;
                    stackIn_356_1 = ~var17;
                    if (var63 != 0) {
                      break L60;
                    }
                    if (stackIn_356_0 != stackIn_356_1) {
                      incrementValue$5 = var16;
                      var16++;
                      this.field_p[incrementValue$5] = var18;
                      var17 = var19_int;
                    }
                    var18++;
                  }
                  break;
                }
                this.field_p[var16] = this.field_ib;
                qka.field_m = null;
                this.field_E = rna.a(this.field_E, true, this.field_L);
                this.field_Y = rna.a(this.field_Y, true, this.field_L);
                this.field_cb = rna.a(this.field_cb, true, this.field_L);
                this.field_O = pt.a(this.field_O, this.field_L, 4096);
                this.field_n = lpa.a(this.field_L, 50, this.field_n);
                this.field_y = lpa.a(this.field_L, 50, this.field_y);
                if (null != param1.field_l &&
                  kda.b(param2, 104, this.field_u)) {
                  this.field_d = param1.a(false, (byte) 64);
                }
                if (null != param1.field_m &&
                  eo.a(this.field_u, (byte) 83, param2)) {
                  this.field_C = param1.b((byte) -91);
                }
                stackIn_353_0 = (oc) (param1);
              }
              if (stackIn_353_0.field_D == null) {
                return;
              }
              stackIn_356_0 = -26571;
              stackIn_356_1 = param2;
              break;
            }
            if (aw.d(stackIn_356_0, stackIn_356_1, this.field_u)) {
              var18 = 0;
              var19 = new int[256];
              var20 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var20 >= this.field_W))) {
                var21 = param1.field_D[var8[var20]];
                stackIn_372_0 = var21;
                if (var63 == 0) {
                  if (stackIn_372_0 >= 0) {
                    if (var21 > var18) {
                      var18 = var21;
                    }
                    var19[var21] = var19[var21] + 1;
                  }
                  var20++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                this.field_j = new int[1 + var18][];
                stackIn_372_0 = 0;
              }
              var20 = stackIn_372_0;
              do {
                if (var18 < var20) {
                  var20 = 0;
                  break;
                }
                array$6 = new int[var19[var20]];
                this.field_j[var20] = array$6;
                var19[var20] = 0;
                var20++;
              } while (var63 == 0);
              while (true) {
                if (this.field_W <= var20) {
                  return;
                }
                var21 = param1.field_D[var8[var20]];
                if (var63 != 0) {
                  return;
                }
                if (var21 >= 0) {
                  dupTemp$7 = var19[var21];
                  arrayValue$8 = this.field_j[var21];
                  var19[var21] = dupTemp$7 + 1;
                  arrayValue$8[dupTemp$7] = var20;
                }
                var20++;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_391_0 = var7_ref;
          stackIn_391_1 = new StringBuilder().append("np.<init>(");
          if (param0 == null) {
            stackIn_392_2 = "null";
          } else {
            stackIn_392_2 = "{...}";
          }
          stackIn_395_1 = ((StringBuilder) (Object) stackIn_391_1).append(stackIn_392_2).append(',');
          if (param1 == null) {
            stackIn_396_2 = "null";
          } else {
            stackIn_396_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_391_0), ((StringBuilder) (Object) stackIn_395_1).append(stackIn_396_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_V = "<%0> has entered another game.";
    }
}
