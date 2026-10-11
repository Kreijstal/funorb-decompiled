/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends pc {
    private boolean field_w;
    private int[] field_J;
    private int[] field_V;
    int[][] field_F;
    static vi field_D;
    static String field_z;
    private int[] field_S;
    private int field_W;
    static int field_C;
    private int[] field_p;
    private int field_Y;
    String[] field_Q;
    private int field_ab;
    private boolean field_t;
    private int field_Z;
    private int[] field_K;
    private int[] field_T;
    private String field_L;
    private String[] field_O;
    String[][] field_X;
    private float[] field_A;
    private int[] field_B;
    private int field_u;
    static String field_v;
    private float field_r;
    private float[] field_x;
    String[][] field_G;
    private int field_M;
    private int field_q;
    hj[][] field_o;
    private int field_R;
    static tk field_s;
    private int[] field_N;
    private int[] field_H;
    private int field_E;
    private int[] field_I;
    int field_P;
    static fo field_y;

    final void c(int param0, int param1) {
        if (param1 != -3565) {
          return;
        }
        this.a(param0, true, (byte) 122, false);
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        if (param3 >= -75) {
          this.field_A = (float[]) null;
        }
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        if (!param0) {
          this.field_A = (float[]) null;
        }
        if (this.field_k) {
          return;
        }
        if (aa.field_n == 1 &&
          mg.field_c) {
          stackIn_10_0 = !(kb.field_c);
          kb.field_c = stackIn_10_0;
        }
        if (!pj.b((byte) 116) &&
          this.field_a <= 1) {
          stackIn_16_0 = 0;
        } else {
          stackIn_16_0 = 1;
        }
        var2 = stackIn_16_0;
        stackIn_19_0 = (this.field_a > 1) ? 0 : 2;
        var3 = stackIn_19_0;
        if (aa.field_n == 98) {
          fieldTemp$0 = this.field_q - 1;
          this.field_q = this.field_q - 1;
          if (0 > fieldTemp$0) {
            if (1 != this.field_Y) {
              if (0 == this.field_Y &&
                var2 != 0) {
                this.field_Y = 1;
                this.field_Z = var3;
                this.field_q = -1;
                return;
              }
              this.field_Y = 0;
              this.field_q = -1;
              return;
            }
            if (this.field_R == -1) {
              this.field_R = 0;
            }
            this.field_q = this.field_c;
            this.field_Y = -1;
          } else {
            this.field_Y = -1;
            this.field_g = true;
            if (this.field_F[this.field_q].length != this.field_F[this.field_q + 1].length) {
              var4 = this.field_F[this.field_q].length - this.field_F[1 + this.field_q].length;
              this.field_R = this.field_R + var4 / 2;
              if (0 > this.field_R) {
                this.field_R = 0;
              }
              if (this.field_R <= this.field_F[this.field_q].length - 1) {
                return;
              }
              this.field_R = -1 + this.field_F[this.field_q].length;
              return;
            }
          }
        } else {
          if (aa.field_n == 84) {
            if (this.field_Y != -1) {
              this.a(this.field_Y, this.field_J[this.field_Y], 2, -79);
              return;
            }
            if (this.field_q == -1) {
              return;
            }
            if (this.field_R == -1) {
              return;
            }
            this.b(this.field_R, this.field_q, 16777215);
            this.a(this.field_q, true, (byte) 122, false);
            this.field_g = true;
            return;
          }
          if (99 == aa.field_n) {
            if (-1 != this.field_q) {
              fieldTemp$1 = this.field_q + 1;
              this.field_q = this.field_q + 1;
              if (fieldTemp$1 < this.field_a) {
                this.field_g = true;
                this.field_Y = -1;
                if (this.field_F[this.field_q].length == this.field_F[-1 + this.field_q].length) {
                  return;
                }
                var4 = -this.field_F[-1 + this.field_q].length + this.field_F[this.field_q].length;
                this.field_R = this.field_R + var4 / 2;
                if (this.field_R < 0) {
                  this.field_R = 0;
                }
                if ((-1 + this.field_F[this.field_q].length) >= this.field_R) {
                  return;
                }
                this.field_R = this.field_F[this.field_q].length - 1;
                return;
              }
            }
            if (this.field_Y != 0) {
              if (this.field_Y != 1 &&
                var2 != 0) {
                this.field_q = -1;
                this.field_Z = var3;
                this.field_Y = 1;
                return;
              }
              this.field_q = -1;
              this.field_Y = 0;
              return;
            }
            this.field_q = 0;
            this.field_Y = -1;
            if (this.field_R == -1) {
              this.field_R = 0;
              return;
            }
          } else {
            if (aa.field_n == 1 &&
              lk.field_g[82] &&
              mg.field_c) {
              l.field_b = true;
              hk.field_d = -1 + pc.field_l[3];
              ao.field_b = 3;
              h.b((byte) -78);
              this.d((byte) -77, 0);
              return;
            }
            if (this.field_Y != -1) {
              if (aa.field_n == 96) {
                this.a(this.field_Y, this.field_J[this.field_Y], 1, -45);
              }
              if (97 == aa.field_n) {
                this.a(this.field_Y, this.field_J[this.field_Y], 0, 3);
                return;
              }
            } else {
              if (this.field_q == -1) {
                return;
              }
              if (aa.field_n == 96) {
                fieldTemp$2 = this.field_R - 1;
                this.field_R = this.field_R - 1;
                if (fieldTemp$2 < 0) {
                  this.field_R = this.field_R + 1;
                }
              }
              if (97 != aa.field_n) {
                return;
              }
              fieldTemp$3 = this.field_R + 1;
              this.field_R = this.field_R + 1;
              if (fieldTemp$3 >= this.field_F[this.field_q].length) {
                this.field_R = this.field_R - 1;
                return;
              }
            }
          }
        }
        return;
    }

    final boolean b(byte param0) {
        int var2 = 78 / ((param0 - 19) / 59);
        return this.field_P == 3 ? true : false;
    }

    private final void d(int param0) {
        int var6 = 0;
        int discarded$0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_3 = 0;
        int var2;
        float var2_float;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        var8 = HoldTheLine.field_D;
        if (this.field_P == 1) {
          var2 = this.d(rf.field_X, -110, nc.field_g);
          if (var2 != -1 ||
            !this.field_g) {
            this.field_Y = var2;
            this.field_g = false;
          }
          var3 = this.a(rf.field_X, false);
          if (0 <= var3 &&
            this.field_a > var3) {
            var4 = rf.field_X - this.c((byte) -113, var3);
            var5 = -1;
            if (var4 > 18 &&
              var4 < 102) {
              for (var6 = 0; this.field_F[var3].length > var6; var6++) {
                var7 = nc.field_g - this.a(var3, 4, var6);
                if (var7 > 24 &&
                  var7 < 136) {
                  var5 = var6;
                  break;
                }
              }
            }
            if (var5 != -1 ||
              !this.field_g) {
              this.field_q = var3;
              this.field_R = var5;
              this.field_g = false;
              if (this.field_R != -1 &&
                this.field_a - 1 == this.field_q) {
                this.b(this.field_R, this.field_q, 16777215);
                ci.a(1, (byte) 125, 13, this.field_R);
              }
            }
          }
        }
        if (this.field_a - 1 == this.field_q) {
          var2_float = (float)nc.field_g / 640.0f;
          this.c(this.field_a - 1, -1, (int)((float)this.field_V[-1 + this.field_a] * var2_float));
        }
        if (gg.field_J != 0) {
          if (0 == this.field_P) {
            this.field_W = 0;
            this.field_r = (float)this.field_M;
            this.field_P = 1;
            return;
          }
          if (this.field_P == 2) {
            this.field_W = 0;
            this.field_P = 3;
            this.field_r = (float)this.field_M;
            return;
          }
          if (this.field_Y != -1) {
            var2Lifetime1 = this.d(rf.field_X, -108, nc.field_g);
            if (var2Lifetime1 != this.field_Y) {
              return;
            }
            stackIn_39_1 = this.field_Y;
            stackIn_39_2 = this.field_J[this.field_Y];
            if (1 != gg.field_J) {
              stackIn_40_3 = 4;
            } else {
              stackIn_40_3 = 3;
            }
            this.a(stackIn_39_1, stackIn_39_2, stackIn_40_3, -69);
            return;
          }
        }
        if (gg.field_J == 1 &&
          nc.field_g != -1) {
          this.field_q = this.a(jb.field_U, false);
          if (this.field_q >= 0 &&
            this.field_q < this.field_a) {
            var2Lifetime2 = jb.field_U - this.c((byte) -113, this.field_q);
            if (var2Lifetime2 > 18 &&
              94 > var2Lifetime2) {
              for (var3Lifetime1 = 0; this.field_F[this.field_q].length > var3Lifetime1; var3Lifetime1++) {
                var4Lifetime1 = lb.field_x - this.a(this.field_q, 4, var3Lifetime1);
                if (var4Lifetime1 > 24 &&
                  136 > var4Lifetime1 && (this.field_q == -1 + this.field_a ||
                  this.field_H[this.field_q] != var3Lifetime1)) {
                  this.b(var3Lifetime1, this.field_q, 16777215);
                  this.a(this.field_q, false, (byte) 122, false);
                  break;
                }
              }
            }
          }
        }
        if (param0 <= 85) {
          discarded$0 = this.a(81, true);
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        int[] var10 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        this.field_u = -1;
        if (param0 >= -74) {
          this.a((byte) -107, false);
        }
        for (var3 = param1 + 1; var3 < this.field_a; var3++) {
          var10 = this.field_H;
          var5 = var3;
          this.field_N[var3] = -1;
          var10[var5] = -1;
          this.field_p[var3] = (-640 + this.field_V[var3]) / 2;
        }
        this.field_a = param1 + 1;
        if (this.field_c > param1) {
          this.field_c = param1;
        }
        if (this.field_q > param1) {
          this.field_q = param1;
          this.field_R = this.field_N[param1];
          if (this.field_R == -1) {
            this.field_R = 0;
          }
        }
        om.a(new String[][]{this.field_O, this.field_G[this.field_c]}, 103, 13);
        this.field_M = 312 + (112 - 112 * this.field_a);
    }

    final void a(int param0) {
        int var3_int = 0;
        int var2;
        String var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        var6 = HoldTheLine.field_D;
        if (3 == this.field_P) {
          return;
        }
        for (var2 = 0; var2 < 4; var2++) {
          if (null != this.field_F[var2]) {
            this.b((byte) 47, var2);
          }
        }
        var2Lifetime1 = 0;
        if (param0 != -55) {
          return;
        }
        if (this.field_P == 2) {
          var2Lifetime1 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)(this.field_W - 5))) + 1.0));
        }
        fl.a(this.field_L.toUpperCase(), var2Lifetime1, 1, param0 - 1698, 8);
        for (var3_int = 0; var3_int < this.field_J.length; var3_int++) {
          this.a(this.a((byte) -128, var3_int), this.field_J[var3_int], true, var3_int);
        }
        var3 = this.field_Q[this.field_a - 1];
        if (var3 != null) {
          var4 = HoldTheLine.field_F.a(var3);
          var5 = this.c((byte) -113, this.field_a - 1);
          tc.c(0, var5, 20 + var4, 28, 0, 192);
          tc.a(0, var5, 20 + var4, 28, 16777215);
          HoldTheLine.field_F.a(var3, 10, 18 + var5, 4, -1);
        }
        oi.a(1, 13);
        return;
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        if (param1) {
          return -38;
        }
        for (var3 = -1 + this.field_a; var3 >= 0; var3--) {
          var4 = this.c((byte) -113, var3);
          if (param0 >= var4 &&
            var4 + 112 > param0) {
            return var3;
          }
        }
        return -1;
    }

    private final int a(int param0, int param1, int param2) {
        if (param1 != 4) {
          this.field_R = -9;
        }
        return 160 * param2 + (240 - (int)this.field_A[param0]);
    }

    private final void a(int param0, byte param1) {
        this.field_V[param0] = this.field_F[param0].length * 160;
        this.c(param0, -1, 0);
        this.field_A[param0] = (float)this.field_p[param0];
        int var3 = -102 / ((-66 - param1) / 45);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        this.field_P = 0;
        this.field_W = 0;
        for (var3 = 0; var3 < 4; var3++) {
          this.field_B[var3] = 0;
        }
        this.field_M = 312;
        this.field_u = -1;
        this.field_q = !param1 ? 0 : -1;
        this.field_r = 480.0f;
        if (param0 != 69) {
          return;
        }
        this.field_ab = 0;
        this.field_a = 1;
        this.field_c = 0;
        this.field_Z = 0;
        this.field_R = !param1 ? 0 : -1;
        this.a(true, 6267);
        om.a(new String[][]{this.field_O, this.field_G[0]}, 67, 13);
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (this.field_F[param1].length <= param0) {
          param0 = -1 + this.field_F[param1].length;
        }
        if (param2 != 16777215) {
          this.field_Y = -76;
        }
        this.field_H[param1] = param0;
        this.field_N[param1] = this.field_F[param1][param0];
        this.c(param1, -1, param0 * 160 + 80);
    }

    final static void b(int param0, byte param1) {
        hl var2 = null;
        int var3 = 0;
        fl var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 != 51) {
            return;
          }
          var4 = (fl) (pd.field_e.b((byte) 125));
          while (var4 != null) {
            om.a(27391, var4, param0);
            var4 = (fl) (pd.field_e.c((byte) -89));
          }
          var2 = oc.field_d.b((byte) 121);
          while (var2 != null) {
            q.a(param0, 60);
            var2 = oc.field_d.c((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "ec.LB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0, int param1) {
        if (param0 < 97) {
          this.field_S = (int[]) null;
        }
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 != -122) {
          return;
        }
        field_z = null;
        field_v = null;
        field_s = null;
        field_D = null;
    }

    private final int e(byte param0, int param1) {
        int var3 = 78 % ((74 - param0) / 33);
        return 240 - (int)this.field_A[param1];
    }

    final void c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var4 = HoldTheLine.field_D;
        if (this.field_P == 3) {
          return;
        }
        if (this.field_P == 0) {
          if (this.field_W == 0) {
            bd.a(17405, 64, 0, j.field_c.field_f);
            bd.a(param0 + 17514, 64, 256, j.field_c.field_h);
          }
          fieldTemp$0 = this.field_W + 1;
          this.field_W = this.field_W + 1;
          if (fieldTemp$0 == 5 * this.field_J.length + 50) {
            this.field_P = 1;
            this.field_W = 0;
          }
        } else {
          if (this.field_P == 2) {
            fieldTemp$1 = this.field_W + 1;
            this.field_W = this.field_W + 1;
            if (-260.0 > (double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)(fieldTemp$1 - 5))))) {
              this.field_P = 3;
              this.field_W = 0;
            }
          }
        }
        var2 = (float)this.field_M - this.field_r;
        this.field_r = this.field_r + 0.20000000298023224f * var2;
        if (this.field_u != -1 &&
          Math.abs(var2) < 5.0f) {
          this.a(-1 + this.field_a, this.field_w, (byte) 122, true);
        }
        for (var3 = 0; this.field_a > var3; var3++) {
          if ((float)this.field_p[var3] != this.field_A[var3]) {
            this.field_A[var3] = this.field_A[var3] + ((float)this.field_p[var3] - this.field_A[var3]) * 0.05000000074505806f;
          }
          if (this.field_B[var3] > 0) {
            this.field_B[var3] = this.field_B[var3] - 1;
          }
        }
        var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < this.field_J.length) {
          this.field_x[var5] = this.field_x[var5] + (-this.field_x[var5] + (float)this.field_I[var5]) * 0.20000000298023224f;
          var5++;
        }
        if (param0 != -109) {
          ec.e((byte) 121);
        }
        if (1 >= this.field_P) {
          if (na.field_k &&
            -1 != nc.field_g) {
            this.d(86);
          }
          while (qh.c(-85)) {
            this.a(true);
          }
        }
        th.b(true);
        return;
    }

    private final int c(byte param0, int param1) {
        if (param0 != -113) {
          return -39;
        }
        return 112 * param1 + (int)this.field_r;
    }

    final void d(byte param0) {
        if (this.field_P != 2) {
          if (3 == this.field_P) {
            return;
          }
          bn.a(1, -107);
          this.field_P = 2;
          if (param0 >= -104) {
            return;
          }
          this.field_W = 0;
          this.field_M = 480;
          return;
        }
    }

    private final void a(String param0, int param1, int[] param2, hj[] param3, boolean param4, String[] param5, String[] param6, int param7) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_F[this.field_a] = param2;
          this.field_o[this.field_a] = param3;
          this.field_X[this.field_a] = param6;
          this.field_G[this.field_a] = param5;
          this.field_Q[this.field_a] = param0;
          this.field_T[this.field_a] = param1;
          this.field_H[this.field_a] = -1;
          this.field_N[this.field_a] = -1;
          if (param4) {
            this.field_q = this.field_a;
            this.field_R = 0;
          }
          this.a(this.field_a, (byte) 126);
          fieldTemp$0 = this.field_a;
          this.field_a = this.field_a + 1;
          this.field_c = fieldTemp$0;
          om.a(new String[][]{this.field_O, this.field_G[this.field_c]}, param7 ^ 374, 13);
          this.field_M = -(112 * (this.field_a - 1)) + param7;
          this.field_u = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("ec.FB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3;
        hj[] var4;
        String[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var14;
        int var10Lifetime1;
        var11 = HoldTheLine.field_D;
        var14 = this.field_F[param1];
        var13 = var14;
        var3 = var13;
        var4 = this.field_o[param1];
        var5 = this.field_X[param1];
        if (param0 != 47) {
          field_y = (fo) null;
        }
        if (var3 == null) {
          return;
        }
        var6 = this.e((byte) 17, param1) + 24;
        var7 = this.c((byte) -113, param1);
        var8 = 18 + var7;
        var9 = (424 - var7) * 256 / 112;
        if (16 >= var9) {
          return;
        }
        if (var9 < 256) {
          hh.field_e.d(0, var7, var9);
          for (var10 = 0; var10 < var14.length; var10++) {
            if (var10 == this.field_H[param1] &&
              this.field_Y == -1) {
              tc.c(var6 - 5, -5 + var8, 121, 94, 16777215, var9 >> 1);
              var4[var10].d(var6, var8, var9);
              if (this.field_B[param1] > 0 &&
                (-this.field_B[param1] + 90) % 30 <= 15) {
                tc.c(var6, var8, 111, 84, 16777215, var9 >> 1);
              }
            } else if (this.field_q == param1 &&
              this.field_R == var10 &&
              this.field_Y == -1) {
              tc.c(-5 + var6, -5 + var8, 121, 94, 16777215, var9 >> 1);
              var4[var10].d(var6, var8, var9);
            } else {
              var4[var10].d(var6, var8, var9);
              o.a(128, 84, var8, 128, 111, param0 - 4488, var6);
            }
            wb.a(20, var5[var10], 4, 2, 111, var8, var6, 74, param0 ^ -48, 1, HoldTheLine.field_F);
            var6 += 160;
          }
          return;
        }
        hh.field_e.b(0, var7);
        var12 = 0;
        var10Lifetime1 = var12;
        while (var12 < var14.length) {
          if (param1 == this.field_q &&
            this.field_R == var12 &&
            this.field_Y == -1) {
            tc.c(-5 + var6, -5 + var8, 121, 94, 16744576, 128);
            var4[var12].b(var6, var8);
          } else if (this.field_H[param1] == var12 &&
            this.field_Y == -1) {
            tc.c(var6 - 5, -5 + var8, 121, 94, 16777215, 128);
            var4[var12].b(var6, var8);
            if (this.field_B[param1] > 0 &&
              (-this.field_B[param1] + 90) % 30 <= 15) {
              tc.c(var6, var8, 111, 84, 16777215, 128);
            }
          } else {
            var4[var12].b(var6, var8);
            o.a(128, 84, var8, 128, 111, -4441, var6);
          }
          wb.a(20, var5[var12], 4, 2, 111, var8, var6, 74, -1, 1, HoldTheLine.field_F);
          var6 += 160;
          var12++;
        }
        return;
    }

    private final void c(int param0, int param1, int param2) {
        if (this.field_V[param0] <= 640) {
          this.field_p[param0] = (-160 + this.field_V[param0]) / 2;
          return;
        }
        int var4 = -80 + param2;
        if (param1 != -1) {
          field_s = (tk) null;
        }
        if (var4 < 240) {
          var4 = 240;
        }
        if (-400 + this.field_V[param0] < var4) {
          var4 = this.field_V[param0] - 400;
        }
        this.field_p[param0] = var4;
    }

    final void a(int param0, int param1) {
        if (param0 != 1) {
          String[] var4 = (String[]) null;
          this.a((String) null, 117, (int[]) null, (hj[]) null, true, (String[]) null, (String[]) null, 115);
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        String[] array$0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        int[] stackIn_21_0 = null;
        String[] stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        StringBuilder stackIn_31_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_36_0 = null;
        String stackIn_37_1 = null;
        StringBuilder stackIn_40_0 = null;
        String stackIn_41_1 = null;
        String[] stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        String stackIn_44_3 = null;
        int[] stackIn_46_0 = null;
        String[] stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_47_3;
        int var5;
        int var6;
        String var7;
        String[] var7_array;
        String var8;
        String[] var9;
        String var9_ref;
        int var10;
        var10 = HoldTheLine.field_D;
        var5 = 0;
        if (0 == this.field_P) {
          var5 = 50 - this.field_W + 5 * param3;
        } else {
          if (this.field_P == 2) {
            var5 = this.field_W - (-25 + 5 * (this.field_J.length - param3));
          }
        }
        if (!param2) {
          return;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        var6 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var5))));
        var6 = (int)((float)var6 + this.field_x[param3]);
        if (param1 == 22) {
          if (7 != mi.field_d) {
            if (mi.field_d == 0) {
              stackIn_36_0 = new StringBuilder();
              if (!wb.field_c) {
                stackIn_37_1 = tf.field_r;
              } else {
                stackIn_37_1 = h.field_e;
              }
              var7 = ((StringBuilder) (Object) stackIn_36_0).append(stackIn_37_1).append(" ").append(bo.field_a).toString();
            } else {
              if (mi.field_d == 1) {
                var7 = cj.field_M;
              } else {
                if (mi.field_d != 2) {
                  throw new RuntimeException();
                }
                stackIn_31_0 = new StringBuilder();
                if (wb.field_c) {
                  stackIn_32_1 = h.field_e;
                } else {
                  stackIn_32_1 = tf.field_r;
                }
                var7 = ((StringBuilder) (Object) stackIn_31_0).append(stackIn_32_1).append(" ").append(qm.field_g).toString();
              }
            }
          } else {
            var7 = pg.field_H;
          }
          var7 = uk.field_c[20] + var7;
          stackIn_40_0 = new StringBuilder().append(uk.field_c[21]);
          if (em.field_o) {
            stackIn_41_1 = hf.field_l;
          } else {
            stackIn_41_1 = dl.field_h;
          }
          var8 = ((StringBuilder) (Object) stackIn_40_0).append(stackIn_41_1).toString();
          array$0 = new String[3];
          stackIn_43_0 = array$0;
          stackIn_43_1 = array$0;
          stackIn_43_2 = 2;
          if (this.field_t) {
            stackIn_44_3 = var8;
          } else {
            stackIn_44_3 = "";
          }
          stackIn_43_1[stackIn_43_2] = stackIn_44_3;
          var9 = stackIn_43_0;
          stackIn_46_0 = this.field_K;
          stackIn_46_1 = var9;
          stackIn_46_2 = 120;
          if (this.field_Y == param3) {
            stackIn_47_3 = this.field_ab;
          } else {
            stackIn_47_3 = -1;
          }
          fk.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_47_3, param0, -1, var6);
        } else {
          if (param1 == 23) {
            if (this.field_a > 1) {
              stackIn_16_0 = lg.field_r;
            } else {
              stackIn_16_0 = "";
            }
            var8 = stackIn_16_0;
            var7 = var8;
            var7 = var8;
            if (pj.b((byte) 124)) {
              stackIn_19_0 = uk.field_c[9];
            } else {
              stackIn_19_0 = "";
            }
            var9_ref = stackIn_19_0;
            var7 = var9_ref;
            var7 = var9_ref;
            var7_array = new String[]{var8, "", var9_ref};
            stackIn_21_0 = this.field_K;
            stackIn_21_1 = var7_array;
            stackIn_21_2 = 72;
            if (this.field_Y != param3) {
              stackIn_22_3 = -1;
            } else {
              stackIn_22_3 = this.field_Z;
            }
            fk.a(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_22_3, param0, -1, var6);
          }
        }
        return;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_50_0 = false;
        boolean stackIn_78_0 = false;
        boolean stackIn_85_0 = false;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_127_1 = 0;
        int stackIn_133_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = HoldTheLine.field_D;
        stackIn_3_0 = (param2 != 1) ? 0 : 1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (param2 != 0) ? 0 : 1;
        var6 = stackIn_6_0;
        var9 = 116 / ((param3 - 55) / 51);
        if (param2 != 2) {
          stackIn_12_0 = (param2 == 3) ? 1 : 0;
        } else {
          stackIn_12_0 = 1;
        }
        var7 = stackIn_12_0;
        stackIn_15_0 = (param2 != 4) ? 0 : 1;
        var8 = stackIn_15_0;
        if (param2 != 2) {
          stackIn_21_0 = (param2 == 3) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var10 = stackIn_21_0;
        if (param2 == 3) {
          stackIn_27_0 = 1;
        } else {
          stackIn_27_0 = (param2 == 4) ? 1 : 0;
        }
        var11 = stackIn_27_0;
        qf.a(293, cf.field_r);
        if (param1 != 22) {
          if (param1 == 23) {
            stackIn_97_0 = (0 < this.field_c) ? 0 : 2;
            var12 = stackIn_97_0;
            if (pj.b((byte) 90)) {
              stackIn_102_0 = (this.field_c <= 0) ? 0 : 1;
            } else {
              stackIn_102_0 = 0;
            }
            var13 = stackIn_102_0;
            if (var5 != 0 ||
              var6 != 0) {
              if (var13 == 0) {
                this.field_Z = var12;
              } else {
                if (this.field_Z != 0) {
                  stackIn_109_1 = 0;
                } else {
                  stackIn_109_1 = 2;
                }
                this.field_Z = stackIn_109_1;
              }
            }
            if (var10 != 0) {
              if (0 == this.field_Z) {
                if (this.field_c != 0) {
                  this.d((byte) -92, -1 + this.field_c);
                  this.field_g = true;
                  this.field_Y = -1;
                }
              } else {
                if (this.field_Z == 2 &&
                  pj.b((byte) 113)) {
                  i.a((byte) 60, true);
                }
              }
            }
            if (var13 == 0) {
              if (var7 != 0 ||
                var8 != 0) {
                this.field_Z = var12;
              }
            } else {
              if (var7 != 0) {
                if (this.field_Z == 2) {
                  stackIn_127_1 = 0;
                } else {
                  stackIn_127_1 = 2;
                }
                this.field_Z = stackIn_127_1;
              }
              if (var8 != 0) {
                if (this.field_Z == 0) {
                  stackIn_133_1 = 2;
                } else {
                  stackIn_133_1 = 0;
                }
                this.field_Z = stackIn_133_1;
              }
            }
          }
        } else {
          stackIn_31_0 = (this.field_t) ? 2 : 1;
          var12 = stackIn_31_0;
          if (var5 == 0) {
            if (var6 != 0) {
              fieldTemp$0 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (var12 < fieldTemp$0) {
                this.field_ab = 0;
              }
            }
          } else {
            fieldTemp$1 = this.field_ab - 1;
            this.field_ab = this.field_ab - 1;
            if (0 > fieldTemp$1) {
              this.field_ab = var12;
            }
          }
          if (this.field_ab == 0) {
            if (var7 != 0) {
              if (mi.field_d == 7) {
                wb.field_c = false;
                mi.field_d = 0;
              } else {
                if (mi.field_d == 0) {
                  if (wb.field_c) {
                    mi.field_d = 1;
                  }
                  stackIn_85_0 = !(wb.field_c);
                  wb.field_c = stackIn_85_0;
                } else {
                  if (1 != mi.field_d) {
                    if (2 == mi.field_d) {
                      if (wb.field_c) {
                        mi.field_d = 7;
                      }
                      stackIn_78_0 = !(wb.field_c);
                      wb.field_c = stackIn_78_0;
                    }
                  } else {
                    mi.field_d = 2;
                  }
                }
              }
            } else {
              if (var8 != 0) {
                if (7 != mi.field_d) {
                  if (mi.field_d != 0) {
                    if (mi.field_d != 1) {
                      if (mi.field_d == 2) {
                        if (!wb.field_c) {
                          mi.field_d = 1;
                        }
                        wb.field_c = false;
                      }
                    } else {
                      mi.field_d = 0;
                      wb.field_c = true;
                    }
                  } else {
                    if (!wb.field_c) {
                      mi.field_d = 7;
                    }
                    wb.field_c = false;
                  }
                } else {
                  wb.field_c = true;
                  mi.field_d = 2;
                }
              }
            }
            if (var7 != 0 ||
              var8 != 0) {
              h.b((byte) 125);
              this.field_O[param0] = cc.field_C[mi.field_d];
              this.a(false, 6267);
              this.a(0, (byte) -124);
              this.field_H[0] = -1;
              this.field_N[0] = -1;
              this.d((byte) -96, 0);
            }
          } else {
            if (1 != this.field_ab) {
              if (this.field_t && (var10 != 0 ||
                var7 != 0 ||
                var8 != 0)) {
                stackIn_50_0 = !(em.field_o);
                em.field_o = stackIn_50_0;
              }
            } else {
              if (var10 != 0) {
                wm.a(var11 != 0, false, 0);
              }
            }
          }
        }

    }

    private final int d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param1 > -51) {
          this.field_L = (String) null;
        }
        var4 = 0;
        while (this.field_J.length > var4) {
          var5 = this.a((byte) -128, var4);
          if (param0 < var5 ||
            30 + var5 < param0) {
            var4++;
            continue;
          }
          break;
        }
        if (this.field_J.length == var4) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (22 != this.field_J[var4]) {
          if ((this.field_J[var4] != 23) &&
            (decompiledFrameRemainder0 = (!(param2 >= 15) ||
            !(param2 <= 355)))) {
            return -1;
          }
          if (decompiledFrameRemainder0) {
            this.field_Z = fj.a(this.field_S, (byte) -119, param2);
          }
        } else {
          this.field_ab = fj.a(this.field_K, (byte) -119, param2);
          if (this.field_ab == 0) {
            ci.a(0, (byte) 67, 13, 0);
          } else {
            if (this.field_ab == 2 &&
              this.field_t) {
              ci.a(0, (byte) 100, 13, 1);
            }
          }
        }
        return var4;
    }

    final void a(boolean param0, int param1) {
        int discarded$0 = 0;
        this.field_J = em.field_i[this.field_E];
        this.field_t = wb.field_c;
        if (param1 != 6267) {
          discarded$0 = this.d(20, 52, -61);
        }
        this.field_t = this.field_t | (mi.field_d == 1 ? true : false);
        this.field_t = this.field_t & (mi.field_d != 7 ? true : false);
        this.field_O = new String[]{cc.field_C[mi.field_d], cd.field_c};
    }

    private final void a(int param0, boolean param1, byte param2, boolean param3) {
        boolean stackIn_4_1 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_20_1 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_28_1 = false;
        String stackIn_34_0 = null;
        String stackIn_47_0 = null;
        int stackIn_54_0 = 0;
        boolean stackIn_55_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_62_1 = false;
        int stackIn_70_0 = 0;
        boolean stackIn_71_1 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        String var10;
        int var11;
        hj[] var12;
        hj[] var13;
        hj[] var14;
        hj[] var15;
        var11 = HoldTheLine.field_D;
        this.field_Y = -1;
        if (this.field_a - 1 > param0) {
          this.d((byte) -75, param0);
          this.field_u = this.field_H[param0];
          stackIn_4_1 = (param1);
          this.field_w = stackIn_4_1;
          return;
        }
        this.field_u = -1;
        qf.a(293, cf.field_r);
        var5 = this.field_H[param0];
        if (param2 != 122) {
          this.field_p = (int[]) null;
        }
        var6 = this.field_N[param0];
        if (-1 == var5) {
          return;
        }
        this.field_B[param0] = 90;
        if (mi.field_d == 7) {
          if (param0 == 0) {
            if (param3) {
              return;
            }
            var7 = pf.a((byte) 60, var6);
            if (var7 != 0) {
              return;
            }
            cf.field_w = var6;
            vg.field_P = 0;
            bn.a(var6 + 4, -107);
            stackIn_70_0 = -21383;
            stackIn_71_1 = !(param1);
            ma.a(stackIn_70_0, stackIn_71_1);
          }
        } else {
          if (mi.field_d != 1 &&
            mi.field_d != 0) {
            if (param0 == 0) {
              vg.field_P = var6;
              cf.field_w = var6;
              var7 = pf.a((byte) 92, cf.field_w);
              if (0 == var7) {
                var8 = cf.field_w;
                var13 = new hj[]{ua.field_b.a(84, go.field_g[var8][0], 9, 111), ua.field_b.a(84, go.field_g[var8][1], param2 ^ 115, 111)};
                if (!wb.field_c) {
                  stackIn_34_0 = ui.field_m;
                } else {
                  stackIn_34_0 = ui.field_m + " " + ac.field_g;
                }
                var10 = stackIn_34_0;
                this.a(var10, 16711680, go.field_g[var8], var13, param1, v.field_A[var8], sg.field_gb[var8], 312);
              }
              bn.a(4 + cf.field_w, param2 ^ -16);
              return;
            }
            if (1 != param0) {
              if (param0 != 2) {
                return;
              }
              if (param3) {
                return;
              }
              ah.field_b = var6;
              stackIn_27_0 = -21383;
              stackIn_28_1 = !(param1);
              ma.a(stackIn_27_0, stackIn_28_1);
              return;
            }
            t.field_l = var6;
            if (wb.field_c) {
              var7 = cf.field_w;
              var12 = new hj[]{ua.field_b.a(84, go.field_g[var7][0] + 8, 9, 111), ua.field_b.a(84, 8 + go.field_g[var7][1], 9, 111)};
              this.a(ui.field_m + " " + qe.field_e, 65280, go.field_g[var7], var12, param1, v.field_A[var7], sg.field_gb[var7], 312);
              return;
            }
            if (param3) {
              return;
            }
            stackIn_19_0 = -21383;
            stackIn_20_1 = !(param1);
            ma.a(stackIn_19_0, stackIn_20_1);
            return;
          }
          if (0 == param0) {
            var7 = pf.a((byte) 65, var6);
            if (var7 == 0) {
              cf.field_w = var6;
              bn.a(4 + var6, -112);
              h.b((byte) 101);
              this.a(nc.field_a, qm.field_i[var5], this.field_F[1], this.field_o[1], param1, this.field_G[1], this.field_X[1], 312);
            }
          }
          if (param0 == 1) {
            vg.field_P = var6;
            var7 = kn.b((byte) -49).field_p;
            if (gj.a(vg.field_P, -70, cf.field_w) == 0) {
              var14 = new hj[]{ua.field_b.a(84, go.field_g[var7][0], 9, 111), ua.field_b.a(84, go.field_g[var7][1], 9, 111)};
              if (wb.field_c) {
                stackIn_47_0 = ui.field_m + " " + ac.field_g;
              } else {
                stackIn_47_0 = ui.field_m;
              }
              var9 = stackIn_47_0;
              this.a(var9, 16711680, go.field_g[var7], var14, param1, v.field_A[var7], sg.field_gb[var7], 312);
            }
          }
          if (param0 == 2) {
            t.field_l = var6;
            var7 = kn.b((byte) -49).field_p;
            if (wb.field_c) {
              var15 = new hj[]{ua.field_b.a(84, 8 + go.field_g[var7][0], 9, 111), ua.field_b.a(84, go.field_g[var7][1] + 8, 9, 111)};
              this.a(ui.field_m + " " + qe.field_e, 65280, go.field_g[var7], var15, param1, v.field_A[var7], sg.field_gb[var7], 312);
            } else {
              if (!param3) {
                stackIn_54_0 = -21383;
                stackIn_55_1 = !(param1);
                ma.a(stackIn_54_0, stackIn_55_1);
              }
            }
          }
          if (param0 == 3 &&
            !param3) {
            ah.field_b = var6;
            stackIn_61_0 = -21383;
            stackIn_62_1 = !(param1);
            ma.a(stackIn_61_0, stackIn_62_1);
            return;
          }
        }
        return;
    }

    private final int a(byte param0, int param1) {
        if (this.field_J[param1] == 23) {
          return 448;
        }
        if (param0 > -123) {
          this.a((byte) -56, true);
        }
        return 35 * (1 + param1) + 8;
    }

    ec(int param0, int[] param1, hj[] param2, String[] param3, String[] param4, String param5, int param6) {
        int var8_int = 0;
        this.field_S = new int[]{0, 240, 140, 240};
        this.field_K = new int[]{0, 240, 140, 240};
        try {
          this.field_F = new int[4][];
          this.field_o = new hj[4][];
          this.field_X = new String[4][];
          this.field_G = new String[4][];
          this.field_E = param0;
          this.field_J = em.field_i[param0];
          this.field_x = new float[this.field_J.length];
          this.field_I = new int[this.field_J.length];
          this.field_T = new int[4];
          this.field_B = new int[4];
          this.field_V = new int[4];
          this.field_A = new float[4];
          this.field_N = new int[4];
          this.field_H = new int[4];
          this.field_Q = new String[4];
          this.field_p = new int[4];
          this.field_L = qe.field_g[param0];
          for (var8_int = 0; var8_int < 4; var8_int++) {
            this.field_V[var8_int] = 0;
            this.field_A[var8_int] = 0.0f;
            this.field_p[var8_int] = 0;
            this.field_H[var8_int] = -1;
            this.field_N[var8_int] = -1;
          }
          this.field_F[0] = param1;
          this.field_o[0] = param2;
          this.field_X[0] = param3;
          this.field_G[0] = param4;
          if (pj.b((byte) 93)) {
            this.field_O = new String[]{cc.field_C[mi.field_d], null, cd.field_c};
          } else {
            this.field_O = new String[]{cc.field_C[mi.field_d], cd.field_c};
          }
          this.field_Q[0] = param5;
          this.field_T[0] = param6;
          this.field_H[0] = -1;
          this.field_a = 1;
          this.field_N[0] = param1[0];
          this.a(0, (byte) -122);
          this.a((byte) 69, false);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    static {
        field_C = 0;
    }
}
