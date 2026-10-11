/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends kd {
    int field_T;
    int field_C;
    private boolean field_L;
    private nk field_S;
    int field_V;
    private int field_D;
    private int field_z;
    gk field_U;
    int field_G;
    int field_E;
    gk field_R;
    int field_y;
    int field_N;
    int field_K;
    int field_Q;
    int field_W;
    private qd[] field_I;
    static dj field_F;
    private static int[] field_M;
    static pn field_A;
    static fm field_O;
    gk field_H;
    static String field_P;
    static int field_J;
    static boolean field_B;
    static String[] field_X;

    final static qb a(int param0, int param1, ee param2, int param3, int param4, boolean param5, int param6, int param7, int param8, int param9) {
        qb var10 = null;
        RuntimeException var10_ref = null;
        ee var11 = null;
        qb stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = ol.d((byte) -105);
          var10.field_O = param7;
          var10.field_B = param4;
          if (param3 <= 86) {
            var11 = (ee) null;
            nk.a(91, 120, (ee) null, -2, -98, true, 88, 125, 5, -15);
          }
          var10.field_P = param9;
          stackIn_4_0 = var10;
          stackIn_5_1 = (param5);
          stackIn_4_0.field_G = stackIn_5_1;
          var10.field_M = param0;
          var10.field_D = param6;
          var10.field_F = param8;
          var10.field_I = 0;
          var10.field_A = param1;
          var10.field_z = param2;
          stackIn_6_0 = var10;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_9_0 = var10_ref;
          stackIn_9_1 = new StringBuilder().append("nk.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        nk stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        nk stackOut_4_0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_11_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        var14 = SteelSentinels.field_G;
        var7 = this.field_z + param5;
        if (param4 != 49) {
          this.k(14);
        }
        var8 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_I.length <= var8))) {
          this.field_I[var8].field_m = -this.field_I[var8].field_i + this.field_I[var8].field_n + (var7 - param0) - this.field_D;
          this.field_I[var8].field_j = this.field_D + (this.field_I[var8].field_i + var7) + (this.field_I[var8].field_n + param0);
          stackOut_4_0 = this.field_I[var8].field_d;
          stackIn_11_0Lifetime1 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (var14 == 0) {
            if (stackIn_5_0 != null &&
              this.field_I[var8].field_u) {
              var9 = 16 * jh.a(8192 * -var7 / 65536, 4096) / 65536;
              var10 = 16 * kg.a(8192 * -var7 / 65536, (byte) -74) / 65536;
              var11 = (hj.field_w * ((this.field_I[var8].field_r - this.field_E) * var9 + (this.field_I[var8].field_s - this.field_G) * var10) >> 16) + param2;
              var12 = param3 + ((-(var9 * (this.field_I[var8].field_s - this.field_G)) + var10 * (-this.field_E + this.field_I[var8].field_r)) * hj.field_w >> 16);
              var13 = var7 + this.field_I[var8].field_n;
              this.a((byte) -101, param1, var13, var8, var11, param0, var12);
            }
            var8++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = this;
        }
        if (this.field_R != null) {
          this.field_R.a(this.field_G << 4, this.field_E << 4, param2 << 4, param3 << 4, -var7, hj.field_w);
        }
        if (param1) {
          this.field_K = var7 - param0 - this.field_D;
          this.field_W = this.field_D + var7 + param0;
        }
        var8Lifetime1 = 8 * hj.field_w / 4096;
        if (param2 - var8Lifetime1 < nj.field_V) {
          nj.field_V = param2 - var8Lifetime1;
        }
        if (param3 - var8Lifetime1 < ti.field_y) {
          ti.field_y = -var8Lifetime1 + param3;
        }
        if (lh.field_t < var8Lifetime1 + param3) {
          lh.field_t = var8Lifetime1 + param3;
        }
        if (en.field_d < var8Lifetime1 + param2) {
          en.field_d = var8Lifetime1 + param2;
        }
        var15 = 0;
        var9Lifetime1 = var15;
        while (var15 < this.field_I.length) {
          if (var14 == 0) {
            if (this.field_I[var15].field_q != -1 ||
              null != this.field_I[var15].field_d) {
              var10Lifetime1 = jh.a(8192 * -var7 / 65536, param4 + 4047) * 16 / 65536;
              var11Lifetime1 = 16 * kg.a(-var7 * 8192 / 65536, (byte) -82) / 65536;
              this.field_I[var15].field_k = (((-this.field_G + this.field_I[var15].field_s) * var11Lifetime1 + var10Lifetime1 * (-this.field_E + this.field_I[var15].field_r)) * hj.field_w >> 16) + param2;
              this.field_I[var15].field_l = ((var11Lifetime1 * (this.field_I[var15].field_r - this.field_E) - var10Lifetime1 * (-this.field_G + this.field_I[var15].field_s)) * hj.field_w >> 16) + param3;
              this.field_I[var15].field_f = var7 + this.field_I[var15].field_n;
              if (this.field_I[var15].field_d == null ||
                this.field_I[var15].field_u) {
                if (this.field_I[var15].field_d == null &&
                  this.field_I[var15].field_q != -1 &&
                  param1 &&
                  1024 != this.field_I[var15].field_q) {
                  if (nj.field_V > -var8Lifetime1 + this.field_I[var15].field_k) {
                    nj.field_V = this.field_I[var15].field_k - var8Lifetime1;
                  }
                  if (this.field_I[var15].field_k + var8Lifetime1 > en.field_d) {
                    en.field_d = this.field_I[var15].field_k + var8Lifetime1;
                  }
                  if (-var8Lifetime1 + this.field_I[var15].field_l < ti.field_y) {
                    ti.field_y = this.field_I[var15].field_l - var8Lifetime1;
                  }
                  if (lh.field_t < this.field_I[var15].field_l + var8Lifetime1) {
                    lh.field_t = this.field_I[var15].field_l + var8Lifetime1;
                  }
                  var10Lifetime1Lifetime1 = jh.a(this.field_I[var15].field_f * 8192 / 65536, 4096) * 16 / 65536;
                  var11Lifetime1Lifetime1 = kg.a(this.field_I[var15].field_f * 8192 / 65536, (byte) -68) * 16 / 65536;
                }
              } else {
                this.a((byte) -69, param1, this.field_I[var15].field_f, var15, this.field_I[var15].field_k, param0, this.field_I[var15].field_l);
              }
            }
            var15++;
            continue;
          }
          break;
        }
        return;
    }

    final nk[] a(int param0, mb param1, nk[] param2, int param3, int param4) {
        int stackIn_21_0 = 0;
        nk[] stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        nk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        var9 = SteelSentinels.field_G;
        try {
          if (param0 != 0) {
            this.field_R = (gk) null;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param4 != ja.a(this.field_N, false) ||
            this.field_Q <= 0 ||
            this.field_C > 0) {
            var6_int = 0;
            while (this.field_I.length > var6_int) {
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (this.field_I[var6_int].field_d != null) {
                param2 = this.field_I[var6_int].field_d.a(param0 + 0, param1, param2, param3, param4);
              }
              var6_int++;
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder0 = (var9 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            if (this.field_K <= param3) {
              stackIn_21_0 = (param3 <= this.field_W) ? 1 : 0;
            } else {
              stackIn_21_0 = 0;
            }
            var6_intLifetime1 = stackIn_21_0;
            if (var6_intLifetime1 != 0 &&
              param1.field_Lb &&
              bi.b(105, this.field_N) &&
              !param1.i(31, param0 - 27)) {
              var6_intLifetime1 = 0;
            }
            if (var6_intLifetime1 != 0) {
              var7 = new nk[param2.length + 1];
              var8 = 0;
              while (true) {
                if (param2.length > var8) {
                  var7[var8] = param2[var8];
                  var8++;
                  if (var9 == 0) {
                    continue;
                  }
                } else {
                  var7[param2.length] = this;
                }
                break;
              }
              param2 = var7;
            }
          }
          stackIn_36_0 = (nk[]) (param2);
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("nk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_4_0 = 0;
        nk stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        nk stackOut_6_0;
        var4 = SteelSentinels.field_G;
        if (this.field_N >= 0 &&
          this.field_N < tc.field_B.length) {
          stackIn_4_0 = tc.field_B[this.field_N];
        } else {
          stackIn_4_0 = 0;
        }
        var2 = stackIn_4_0;
        var3 = 0;
        L3: while (true) {
          if (var3 < this.field_I.length) {
            stackOut_6_0 = this.field_I[var3].field_d;
            stackIn_12_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var4 == 0) {
              if (stackIn_7_0 != null) {
                var2 = var2 + this.field_I[var3].field_d.e((byte) -63);
              }
              var3++;
              continue;
            }
          } else {
            if (param0 < -50) {
              break L3;
            }
            stackIn_12_0 = this;
          }
          ((nk) (stackIn_12_0)).field_U = (gk) null;
          break;
        }
        return var2;
    }

    final int a(byte param0, qd param1) {
        qd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qd var5 = null;
        nk var6 = null;
        int var7 = 0;
        int var8 = 0;
        qd[] var9 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          var9 = this.field_I;
          var3 = var9;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var9.length))) {
            var5 = var9[var4];
            var6 = var5.field_d;
            if (var8 == 0) {
              if (var6 != null) {
                if (var5.field_s == param1.field_s &&
                  var5.field_r == param1.field_r &&
                  var5.field_q == param1.field_q) {
                  stackIn_11_0 = var6.field_N;
                  return stackIn_11_0;
                }
                var7 = var6.a((byte) 2, param1);
                if (var7 >= 0) {
                  stackIn_14_0 = var7;
                  return stackIn_14_0;
                }
              }
              var4++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 != 2)) {
            field_J = 118;
          }
          stackIn_19_0 = -1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("nk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int g(int param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        int stackIn_10_0 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        if (param0 != 8192) {
          var5 = (String) null;
          this.a(-87, (String) null);
        }
        var3 = 0;
        while (this.field_I.length > var3) {
          stackIn_10_0 = var2 + this.field_I[var3].field_e;
          if (var4 != 0) {
            return stackIn_10_0;
          }
          var2 = stackIn_10_0;
          if (this.field_I[var3].field_d != null) {
            var2 = var2 + this.field_I[var3].field_d.g(param0 ^ 0);
          }
          var3++;
        }
        return var2;
    }

    final int j(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = param0;
        while (this.field_I.length > var3) {
          stackIn_7_0 = var2 + this.field_I[var3].field_w;
          if (var4 != 0) {
            return stackIn_7_0;
          }
          var2 = stackIn_7_0;
          if (this.field_I[var3].field_d != null) {
            var2 = var2 + this.field_I[var3].field_d.j(param0 ^ 0);
          }
          var3++;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        nk stackIn_9_1 = null;
        Object stackIn_27_0 = null;
        Object stackIn_27_1 = null;
        nk stackOut_8_1;
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
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = SteelSentinels.field_G;
        if (!this.field_L) {
          stackIn_3_0 = hj.field_w << 2;
        } else {
          stackIn_3_0 = hj.field_w;
        }
        var5 = stackIn_3_0;
        stackIn_6_0 = (!this.field_L) ? 2 : 4;
        var6 = stackIn_6_0;
        var7 = this.field_y;
        var8 = 0;
        L3: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (var8 < this.field_I.length) {
            stackIn_27_0 = null;
            stackOut_8_1 = this.field_I[var8].field_d;
            stackIn_27_1 = stackOut_8_1;
            stackIn_9_1 = stackOut_8_1;
            if (var13 == 0) {
              if (stackIn_27_0 != stackIn_9_1 &&
                this.field_I[var8].field_u) {
                var9 = jh.a(-var7 / 8, 4096) / 256;
                var10 = kg.a(-var7 / 8, (byte) -103) / 256;
                var11 = param3 * (hj.field_w * ((this.field_I[var8].field_r - this.field_E) * var9 + (this.field_I[var8].field_s - this.field_G) * var10) >> 20) + param1;
                var12 = ((-((this.field_I[var8].field_s - this.field_G) * var9) + (-this.field_E + this.field_I[var8].field_r) * var10) * hj.field_w >> 20) + param2;
                this.field_I[var8].field_d.a((byte) 122, var11, var12, param3);
              }
              var8++;
              continue;
            }
          } else {
            if (param0 < 97) {
              this.field_H = (gk) null;
            }
            decompiledFrameRemainder0 = (this.field_N != 108 ||
              !(vi.field_db));
            if (decompiledFrameRemainder0) {
              if (param3 == 1 &&
                null != this.field_U) {
                if (0 >= this.field_C) {
                  this.field_U.a(this.field_G << var6, this.field_E << var6, param1 << 4, param2 << 4, -var7, var5);
                  if (var13 == 0) {
                    break L3;
                  }
                }
                if (this.field_C > 50) {
                  break L3;
                }
                this.field_U.a(this.field_G << var6, this.field_E << var6, param1 << 4, param2 << 4, -var7, (-this.field_C + 50) * var5 / 50);
                if (var13 == 0) {
                  break L3;
                }
              }
              stackIn_27_0 = null;
              stackIn_27_1 = this;
            }
          }
          if (decompiledFrameRemainder0) {
            if (stackIn_27_0 == ((nk) (stackIn_27_1)).field_H) {
              break L3;
            }
            if (0 < this.field_C) {
              if (this.field_C > 50) {
                break L3;
              }
              this.field_H.a(this.field_H.field_g * 4 - this.field_G << var6, this.field_E << var6, param1 << 4, param2 << 4, var7, (-this.field_C + 50) * var5 / 50);
              if (var13 == 0) {
                break L3;
              }
            }
            this.field_H.a(4 * this.field_H.field_g - this.field_G << var6, this.field_E << var6, param1 << 4, param2 << 4, var7, var5);
            if (var13 == 0) {
              break L3;
            }
          }
          if (this.field_C <= 0) {
            this.field_U.a(140 << var6, 130 << var6, param1 << 4, param2 << 4, -var7, var5);
            if (var13 == 0) {
              break L3;
            }
          }
          if (50 >= this.field_C) {
            this.field_U.a(140 << var6, 130 << var6, param1 << 4, param2 << 4, -var7, (-this.field_C + 50) * var5 / 50);
          }
          break;
        }
        var14 = 0;
        var8Lifetime1 = var14;
        while (var14 < this.field_I.length) {
          if (var13 == 0) {
            if (null != this.field_I[var14].field_d &&
              !this.field_I[var14].field_u) {
              var9Lifetime1 = jh.a(-var7 / 8, 4096) / 256;
              var10Lifetime1 = kg.a(-var7 / 8, (byte) -71) / 256;
              var11Lifetime1 = param3 * (hj.field_w * ((this.field_I[var14].field_r - this.field_E) * var9Lifetime1 + var10Lifetime1 * (-this.field_G + this.field_I[var14].field_s)) >> 20) + param1;
              var12Lifetime1 = param2 + (hj.field_w * ((this.field_I[var14].field_r - this.field_E) * var10Lifetime1 - var9Lifetime1 * (-this.field_G + this.field_I[var14].field_s)) >> 20);
              this.field_I[var14].field_d.a((byte) 101, var11Lifetime1, var12Lifetime1, param3);
            }
            var14++;
            continue;
          }
          break;
        }
        return;
    }

    final int a(int param0, int[] param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nk var7 = null;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          var5_int = param3;
          while (this.field_I.length > var5_int) {
            if (null == this.field_I[var5_int].field_d) {
              if (-1 != this.field_I[var5_int].field_q) {
                var6 = param1[param0++];
                if (var6 != -1) {
                  var7 = ul.a(var6, (byte) 67);
                  if (var7 == null) {
                    dh.a(db.a("Component Id not valid ID=<%0> data_pos=<%1>", -61, new String[]{Integer.toString(var6), Integer.toString(-1 + param0)}), (byte) 118);
                    stackIn_10_0 = param0;
                    return stackIn_10_0;
                  }
                  if ((var7.field_Q & this.field_I[var5_int].field_q) == 0) {
                    dh.a(db.a("Component not correct id=<%0> type=<%0> desired=<%1>", -71, new String[]{Integer.toString(var6), Integer.toString(var7.field_Q), Integer.toString(this.field_I[var5_int].field_q)}), (byte) 124);
                    stackIn_13_0 = param0;
                    return stackIn_13_0;
                  }
                  this.field_I[var5_int].field_d = new nk(var7, param2);
                  param0 = this.field_I[var5_int].field_d.a(param0, param1, param2, 0);
                }
                if (var8 != 0) {
                  param0 = this.field_I[var5_int].field_d.a(param0, param1, param2, 0);
                }
              }
            } else {
              param0 = this.field_I[var5_int].field_d.a(param0, param1, param2, 0);
            }
            var5_int++;
            if (var8 == 0) {
              continue;
            }
            break;
          }
          stackIn_19_0 = param0;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("nk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_P = null;
        field_M = null;
        field_X = null;
        if (param0 != 20) {
          field_P = (String) null;
        }
        field_A = null;
        field_O = null;
    }

    final void b(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = SteelSentinels.field_G;
        var3 = 0;
        while (var3 < this.field_I.length) {
          if (var4 != 0) {
            return;
          }
          if (null != this.field_I[var3].field_d) {
            this.field_I[var3].field_d.b(param0, -107);
          }
          var3++;
        }
        var3Lifetime1 = -45 / ((param1 + 41) / 32);
        return;
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = SteelSentinels.field_G;
        this.field_T = param1;
        this.field_V = param3;
        if (param0 != -128) {
          this.l(35);
        }
        var5 = 0;
        while (var5 < this.field_I.length) {
          if (var10 == 0) {
            if (null != this.field_I[var5].field_d) {
              var6 = 32 * jh.a(-this.field_y * 8192 / 65536, 4096) / 65536;
              var7 = kg.a(-this.field_y * 8192 / 65536, (byte) -68) * 32 / 65536;
              var8 = param1 + ((-this.field_E + this.field_I[var5].field_r) * var6 + var7 * (this.field_I[var5].field_s - this.field_G)) * param2;
              var9 = param3 + (-this.field_E + this.field_I[var5].field_r) * var7 - var6 * (this.field_I[var5].field_s - this.field_G);
              this.field_I[var5].field_d.b((byte) -128, var8, param2, var9);
            }
            var5++;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, boolean param1, nk param2) {
        boolean stackIn_4_1 = false;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        int[] var12 = null;
        var8 = SteelSentinels.field_G;
        try {
          stackIn_4_1 = (param1);
          boolean decompiledFrameCompleted0 = true;
          this.field_L = stackIn_4_1;
          if (param1) {
            this.field_R = param2.field_R;
          }
          if (!param1 ||
            var8 != 0) {
            if (param2.field_U == null &&
              param2.field_R != null) {
              var9 = new wk(param2.field_R.field_g >> 2, param2.field_R.field_d >> 2);
              var10 = var9;
              var12 = pb.field_g;
              var10.d();
              param2.field_R.b(0, 0);
              pb.a(var12, 640, 480);
              param2.field_U = new gk(var10.field_z, var10.field_B, 129);
              var6 = var10.field_E.length - 1;
              while (var6 >= 0) {
                var7 = var9.field_E[var6];
                stackIn_24_0 = var7;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_24_0 == 0) {
                  param2.field_U.field_p[var6] = (byte) 0;
                } else if ((65535 & var7) == var7 >> 8) {
                  param2.field_U.field_p[var6] = (byte)(1 + 63 * ec.a(var7, 255) / 255);
                } else {
                  param2.field_U.field_p[var6] = (byte)(65 + 63 * ec.a(255, var7) / 255);
                }
                var6--;
              }
              if (decompiledFrameCompleted0) {
                param2.field_U.field_o = rm.field_h;
                param2.field_H = param2.field_U.b();
                param2.field_H.field_o = param2.field_U.field_o;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_U = param2.field_U;
              this.field_R = param2.field_R;
              this.field_H = param2.field_H;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_G = param2.field_G;
            this.field_D = param2.field_D;
            this.field_Q = param2.field_Q;
            this.field_z = param2.field_z;
            this.field_E = param2.field_E;
            this.field_N = param2.field_N;
            this.field_I = new qd[param2.field_I.length];
            stackIn_24_0 = param0;
          }
          if (stackIn_24_0 != -353384856) {
            this.a(41, (byte) 107);
          }
          var4_int = 0;
          while (var4_int < this.field_I.length) {
            this.field_I[var4_int] = new qd(param2.field_I[var4_int], param1);
            var4_int++;
            if (var8 != 0) {
              return;
            }
          }
          this.field_K = param2.field_K;
          this.field_y = param2.field_y;
          this.field_W = param2.field_W;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_35_0 = var4;
          stackIn_35_1 = new StringBuilder().append("nk.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 > -63) {
          return;
        }
        this.field_I[param3].field_d.a(this.field_D + param5 + this.field_I[param3].field_i, param1, param4, param6, (byte) 49, param2);
    }

    final void d(int param0, int param1) {
        ed.field_f = 0;
        gl.field_p = -1;
        si.field_t = 0;
        if (param0 != 65536) {
          this.field_y = 13;
        }
        this.e(param1, 5307);
    }

    final void a(byte param0, boolean param1, boolean param2) {
        if (this.field_C > 0) {
          this.field_C = this.field_C - 1;
          if (param2 &&
            this.field_Q == 128) {
            if (this.field_C > 75) {
              this.field_C = 75;
              if (SteelSentinels.field_G != 0 && (param1 &&
                this.field_C > 0)) {
                this.field_C = this.field_C - 1;
              }
            }
          } else {
            if (param1 &&
              this.field_C > 0) {
              this.field_C = this.field_C - 1;
            }
          }
        }
        if (param0 >= -23) {
          field_X = (String[]) null;
        }
    }

    final nk[] k(int param0) {
        int var2 = 66 / ((29 - param0) / 57);
        nk[] var3 = new nk[]{};
        return this.a(var3, 3);
    }

    final int i(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_9_0 = 0;
        var4 = SteelSentinels.field_G;
        if (param0 >= -104) {
          return 21;
        }
        var2 = 0;
        var3 = 0;
        while (this.field_I.length > var3) {
          stackIn_9_0 = var2 + this.field_I[var3].field_p;
          if (var4 != 0) {
            return stackIn_9_0;
          }
          var2 = stackIn_9_0;
          if (null != this.field_I[var3].field_d) {
            var2 = var2 + this.field_I[var3].field_d.i(-116);
          }
          var3++;
        }
        return var2;
    }

    final int h(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_9_0 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = 0;
        if (param0 != -31496) {
          return 18;
        }
        while (var3 < this.field_I.length) {
          stackIn_9_0 = var2 + this.field_I[var3].field_b;
          if (var4 != 0) {
            return stackIn_9_0;
          }
          var2 = stackIn_9_0;
          if (this.field_I[var3].field_d != null) {
            var2 = var2 + this.field_I[var3].field_d.h(-31496);
          }
          var3++;
        }
        return var2;
    }

    final qd c(int param0, int param1) {
        int var3 = 0;
        qd var4 = null;
        int var5 = 0;
        Object stackIn_14_0 = null;
        var5 = SteelSentinels.field_G;
        var3 = param0;
        while (true) {
          if (this.field_I.length <= var3) {
            return null;
          }
          stackIn_14_0 = null;
          if (var5 != 0) {
            return (qd) (stackIn_14_0);
          }
          if (stackIn_14_0 != this.field_I[var3].field_d) {
            if (this.field_I[var3].field_d.field_Q == 1024) {
              return this.field_I[var3];
            }
            var4 = this.field_I[var3].field_d.c(0, param1);
            if (var4 != null) {
              return var4;
            }
          } else {
            if (1024 == this.field_I[var3].field_q) {
              return this.field_I[var3];
            }
          }
          var3++;
        }
    }

    final boolean f(int param0, int param1) {
        int var3;
        int var4;
        int stackIn_12_0 = 0;
        var4 = SteelSentinels.field_G;
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 >= this.field_I.length))) {
          stackIn_12_0 = this.field_I[var3].field_q & param0;
          if (var4 == 0) {
            if (stackIn_12_0 > 0 &&
              this.field_I[var3].field_q != -1) {
              return true;
            }
            if (null != this.field_I[var3].field_d &&
              this.field_I[var3].field_d.f(param0, -1)) {
              return true;
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_12_0 = param1;
        }
        if (stackIn_12_0 == -1) {
          return false;
        }
        this.l(127);
        return false;
    }

    final int a(int param0, int[] param1, int param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          if (param0 != ~this.field_N) {
            incrementValue$2 = param2;
            param2++;
            param1[incrementValue$2] = this.field_N;
          }
          var4_int = 0;
          while (var4_int < this.field_I.length) {
            if (null == this.field_I[var4_int].field_d) {
              if (-1 != this.field_I[var4_int].field_q) {
                incrementValue$3 = param2;
                param2++;
                param1[incrementValue$3] = -1;
                if (var5 != 0) {
                  param2 = this.field_I[var4_int].field_d.a(0, param1, param2);
                }
              }
            } else {
              param2 = this.field_I[var4_int].field_d.a(0, param1, param2);
            }
            var4_int++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_13_0 = param2;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final String l(int param0) {
        int var3 = SteelSentinels.field_G;
        if (this.field_N >= 0 &&
          !(t.field_e.length <= this.field_N) &&
          t.field_e[this.field_N] != null) {
          return t.field_e[this.field_N];
        }
        if (param0 != -24719) {
          qd[] var4 = (qd[]) null;
          this.a((qd[]) null, -66, -17);
        }
        int var2 = 0;
        do {
          if (this.field_I.length <= var2) {
            return null;
          }
          if (this.field_I[var2].field_v != null) {
            return this.field_I[var2].field_v;
          }
          var2++;
        } while (var3 == 0);
        return null;
    }

    final int[] c(byte param0) {
        if (param0 != 125) {
          this.field_N = -25;
        }
        int[] var3 = new int[]{};
        int[] var2 = var3;
        return this.a(var3, param0 ^ 6900);
    }

    private final int[] a(int[] param0, int param1) {
        int[] stackIn_22_0 = null;
        int[] stackIn_25_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int[] stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int var4Lifetime1;
        var9 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          if ((1008 & this.field_Q) != 0 &&
            83 != this.field_N) {
            var3_int = 1;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (var4 >= this.field_I.length))) {
            if (var9 == 0) {
              if (null != this.field_I[var4].field_d) {
                var3_int = 0;
                param0 = this.field_I[var4].field_d.a(param0, 6793);
              }
              var4++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit2) &&
            (param1 != 6793)) {
            this.a((byte) -7, true, true);
          }
          if (var3_int != 0 &&
            -1 != this.field_N) {
            var4Lifetime1 = param0.length;
            var5_int = 0;
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (var5_int >= var4Lifetime1))) {
              stackIn_25_0 = (int[]) (param0);
              if (var9 == 0) {
                if (stackIn_25_0[var5_int] == ja.a(this.field_N, false)) {
                  stackIn_22_0 = (int[]) (param0);
                  return stackIn_22_0;
                }
                var5_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_25_0 = (int[]) (param0);
            }
            var11 = stackIn_25_0;
            var5 = var11;
            var10 = new int[var4Lifetime1 + 1];
            param0 = var10;
            var6 = ja.a(this.field_N, false);
            var7 = 0;
            var8 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var4Lifetime1 <= var8))) {
              stackIn_34_0 = -1;
              stackIn_34_1 = var6;
              if (var9 == 0) {
                if (stackIn_34_0 != stackIn_34_1 &&
                  var11[var8] > var6) {
                  var10[var7] = var6;
                  var6 = -1;
                  var7++;
                }
                var10[var7] = var11[var8];
                var7++;
                var8++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_34_0 = -1;
              stackIn_34_1 = var6;
            }
            if (stackIn_34_0 != stackIn_34_1) {
              var10[var4Lifetime1] = var6;
            }
          }
          stackIn_38_0 = (int[]) (param0);
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("nk.EA(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final nk a(int param0, byte param1) {
        nk var4 = null;
        int var5 = SteelSentinels.field_G;
        if (param1 > -29) {
          this.g(-116);
        }
        int var3 = 0;
        do {
          if (var3 >= this.field_I.length) {
            return null;
          }
          if (this.field_N == param0) {
            return this;
          }
          if (this.field_I[var3].field_d != null) {
            var4 = this.field_I[var3].field_d.a(param0, (byte) -73);
            if (var4 != null) {
              return var4;
            }
          }
          var3++;
        } while (var5 == 0);
        return null;
    }

    final static void a(byte param0, gi param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          um.field_W = param1.c((byte) -60) << 5;
          var2_int = param1.f((byte) -93);
          um.field_W = um.field_W + (var2_int >> 3);
          pm.field_S = var2_int << 18 & 1835008;
          pm.field_S = pm.field_S + (param1.c((byte) -60) << 2);
          var2_intLifetime1 = param1.f((byte) -59);
          pm.field_S = pm.field_S + (var2_intLifetime1 >> 6);
          uf.field_h = (63 & var2_intLifetime1) << 15;
          uf.field_h = uf.field_h + (param1.f((byte) -65) << 7);
          var2_intLifetime2 = param1.f((byte) -77);
          lb.field_Tb = (1 & var2_intLifetime2) << 16;
          uf.field_h = uf.field_h + (var2_intLifetime2 >> 1);
          lb.field_Tb = lb.field_Tb + param1.c((byte) -60);
          if (param0 > -70) {
            field_M = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("nk.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = SteelSentinels.field_G;
        var5 = this.field_z + param0;
        this.field_K = this.field_z + param3 - this.field_D;
        this.field_y = var5;
        this.field_W = param1 - (-this.field_D - this.field_z);
        var6 = param2;
        while (var6 < this.field_I.length) {
          if (var8 == 0) {
            if (this.field_I[var6].field_d != null) {
              var7 = var5 + this.field_I[var6].field_n;
              this.field_I[var6].field_d.field_S = this;
              this.field_I[var6].field_d.a(var7, this.field_W + (this.field_I[var6].field_i + this.field_I[var6].field_n), param2 + 0, this.field_I[var6].field_n + (-this.field_I[var6].field_i + this.field_K));
            }
            var6++;
            continue;
          }
          break;
        }
    }

    final nk a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        nk var5 = null;
        int var6 = 0;
        nk stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          var3_int = param0;
          while (true) {
            if (var3_int >= this.field_I.length) {
              return null;
            }
            var4 = this.field_I[var3_int].field_v;
            stackIn_16_0 = null;
            if (var6 == 0) {
              if (stackIn_16_0 != var4 &&
                var4.equals(param1)) {
                return this;
              }
              if (this.field_I[var3_int].field_d != null) {
                var5 = this.field_I[var3_int].field_d.a(param0 + 0, param1);
                if (var5 != null) {
                  stackIn_13_0 = var5;
                  return stackIn_13_0;
                }
              }
              var3_int++;
              continue;
            }
            break;
          }
          return (nk) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("nk.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static String a(int param0, na param1) {
        String stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          var2 = null;
          if (null != param1.field_d) {
            var2 = param1.field_d;
            if (param1.field_t == 1) {
              var2 = "<img=0>" + (String) (var2);
            }
            if (param1.field_t == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = -107 % ((-2 - param0) / 44);
          var4 = "";
          if ((param1.field_k == 2) &&
            (decompiledFrameRemainder0 = !(param1.field_g))) {
            if (0 != param1.field_w ||
              param1.field_n != 0) {
              var4 = db.a(ak.field_e, -99, new String[]{(String) (var2)});
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              var4 = db.a(hh.field_d, -93, new String[]{(String) (var2)});
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (param1.field_k == 0 &&
              cd.field_g) {
              var4 = "[" + kh.field_p + "] ";
            }
            if (param1.field_k == 1) {
              var4 = "[" + db.a(pd.field_ab, -102, new String[]{param1.field_s}) + "] ";
            }
            if (4 == param1.field_k &&
              qd.field_a != null) {
              var4 = "[" + qd.field_a + "] ";
            }
            if (param1.field_k == 3) {
              var4 = "[#" + param1.field_s + "] ";
            }
            if (!param1.field_g) {
              var4 = var4 + (String) (var2) + ": ";
            }
          }
          stackIn_32_0 = var4;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("nk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final nk[] a(nk[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        nk[] var8 = null;
        nk[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          if ((this.field_Q & 1008) != 0) {
            var3_int = 1;
          }
          if (param1 != 3) {
            field_B = true;
          }
          var4 = 0;
          L3: while (true) {
            if (var4 < this.field_I.length) {
              if (var7 == 0) {
                if (this.field_I[var4].field_d != null) {
                  var3_int = 0;
                  param0 = this.field_I[var4].field_d.a(param0, 3);
                }
                var4++;
                continue;
              }
            } else {
              if (var3_int != 0 &&
                this.field_N != -1) {
                var4 = param0.length;
                var5 = param0;
                var8 = new nk[1 + var4];
                param0 = var8;
                var6 = 0;
                while (var4 > var6) {
                  var8[var6] = var5[var6];
                  var6++;
                  if (var7 != 0) {
                    break L3;
                  }
                }
                var8[var4] = this;
              }
            }
            break;
          }
          stackIn_20_0 = (nk[]) (param0);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("nk.IA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        nk var4_ref_nk;
        int var4;
        int var5;
        var5 = SteelSentinels.field_G;
        this.field_y = (this.field_K + 8 * this.field_y + this.field_W) / 10;
        if (param1 > -82) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        if (ja.a(this.field_N, false) == param2 &&
          this.field_C <= 0) {
          if (param0 >= this.field_K &&
            this.field_W >= param0) {
            qi.field_k = true;
            if (sl.field_i != ic.field_P) {
              if (ic.field_P < this.field_W) {
                ic.field_P = this.field_W;
              }
              if (!(this.field_K >= sl.field_i)) {
                sl.field_i = this.field_K;
                if (var5 != 0) {
                  sl.field_i = this.field_K;
                  ic.field_P = this.field_W;
                }
              }
            } else {
              sl.field_i = this.field_K;
              ic.field_P = this.field_W;
            }
            this.field_y = param0;
            var4_ref_nk = this.field_S;
            while (var4_ref_nk != null) {
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (0 < -this.field_K + this.field_W) {
                var4_ref_nk.field_y = var4_ref_nk.field_K + (-var4_ref_nk.field_K + var4_ref_nk.field_W) * (-this.field_K + param0) / (-this.field_K + this.field_W);
              }
              var4_ref_nk = var4_ref_nk.field_S;
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if ((decompiledFrameCompleted0) &&
            (decompiledFrameRemainder0)) {
            if (!qi.field_k) {
              if (sl.field_i != ic.field_P) {
                if (sl.field_i > this.field_K) {
                  sl.field_i = this.field_K;
                }
                if (!(this.field_W <= ic.field_P)) {
                  ic.field_P = this.field_W;
                  if (var5 != 0) {
                    ic.field_P = this.field_W;
                    sl.field_i = this.field_K;
                  }
                }
              } else {
                ic.field_P = this.field_W;
                sl.field_i = this.field_K;
              }
            }
            decompiledFrameRemainder0 = (this.field_S != null);
            if (decompiledFrameRemainder0) {
              this.field_y = this.field_S.field_y - (this.field_S.field_K + this.field_S.field_W) / 2 + (this.field_W + this.field_K) / 2;
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (decompiledFrameRemainder0)) {
          if (null != this.field_S) {
            this.field_y = (this.field_W + this.field_K) / 2 + (this.field_S.field_y - (this.field_S.field_K + this.field_S.field_W) / 2);
          }
          var4 = 0;
          while (var4 < this.field_I.length) {
            if (var5 != 0) {
              break;
            }
            if (null != this.field_I[var4].field_d) {
              this.field_I[var4].field_d.a(param0, -90, param2);
            }
            var4++;
          }
        }

    }

    final static boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -14) {
          return false;
        }
        stackIn_6_0 = (!ni.b(24)) && (rd.field_b > 0);
        return stackIn_6_0;
    }

    final qd a(int param0, int param1) {
        qd[] var3;
        int var4;
        qd var5;
        qd var6;
        int var7;
        qd[] var8;
        Object stackIn_16_0 = null;
        var7 = SteelSentinels.field_G;
        var8 = this.field_I;
        var3 = var8;
        var4 = param0;
        while (true) {
          if (var8.length <= var4) {
            return null;
          }
          var5 = var8[var4];
          stackIn_16_0 = null;
          if (var7 != 0) {
            return (qd) (stackIn_16_0);
          }
          if (stackIn_16_0 != var5.field_d) {
            if (param1 == var5.field_d.field_Q) {
              return var5;
            }
            var6 = var5.field_d.a(param0 + 0, param1);
            if (var6 != null) {
              return var6;
            }
          }
          if (var5.field_q != -1 &&
            (var5.field_q & param1) != 0) {
            return var5;
          }
          var4++;
        }
    }

    private final void e(int param0, int param1) {
        nk[] discarded$1 = null;
        int var3;
        int var4;
        nk[] var5;
        var4 = SteelSentinels.field_G;
        if (param1 != 5307) {
          var5 = (nk[]) null;
          discarded$1 = this.a((nk[]) null, 24);
        }
        if (param0 == ja.a(this.field_N, false)) {
          if (0 >= this.field_C) {
            si.field_t = si.field_t + 1;
            if ((var4 != 0) && (gl.field_p == -1 ||
              !(this.field_C >= gl.field_p))) {
              gl.field_p = this.field_C;
            }
          } else {
            if (gl.field_p == -1 ||
              !(this.field_C >= gl.field_p)) {
              gl.field_p = this.field_C;
            }
          }
          ed.field_f = -17 + this.field_N;
        }
        var3 = 0;
        while (this.field_I.length > var3) {
          if (var4 == 0) {
            if (this.field_I[var3].field_d != null) {
              this.field_I[var3].field_d.e(param0, 5307);
            }
            var3++;
            continue;
          }
          break;
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 == 1 &&
          ef.b(-15020, param2)) {
          return 29;
        }
        if (param0 != -14487) {
          return 19;
        }
        return gi.field_s[param1];
    }

    final qd[] a(qd[] param0, int param1, int param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        qd[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        qd[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= this.field_I.length))) {
            stackIn_18_0 = -1;
            stackIn_18_1 = ~(this.field_I[var4_int].field_q & param2);
            if (var7 == 0) {
              if (stackIn_18_0 > stackIn_18_1 &&
                this.field_I[var4_int].field_q != -1) {
                var5 = new qd[param0.length + 1];
                var6 = 0;
                while (true) {
                  if (var6 < param0.length) {
                    var5[var6] = param0[var6];
                    var6++;
                    continue;
                  }
                  break;
                }
                var5[param0.length] = this.field_I[var4_int];
                param0 = var5;
              }
              if (null != this.field_I[var4_int].field_d) {
                param0 = this.field_I[var4_int].field_d.a(param0, -21636, param2);
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = param1;
            stackIn_18_1 = -21636;
          }
          if (stackIn_18_0 != stackIn_18_1) {
            this.field_R = (gk) null;
          }
          stackIn_21_0 = (qd[]) (param0);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("nk.JA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_intLifetime1;
        var5 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (param0 == ja.a(this.field_N, false) &&
            this.field_C <= 0) {
            var4_int = this.field_K;
            while (this.field_W > var4_int) {
              stackIn_12_0 = ~var4_int;
              stackIn_12_1 = -1;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_12_0 < stackIn_12_1 &&
                var4_int < 32768) {
                param2[var4_int >> 8] = param2[var4_int >> 8] + 1;
              }
              var4_int += 256;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_12_0 = param1;
            stackIn_12_1 = -1;
          }
          if (stackIn_12_0 != stackIn_12_1) {
            return;
          }
          var4_intLifetime1 = 0;
          while (this.field_I.length > var4_intLifetime1) {
            if (var5 != 0) {
              return;
            }
            if (null != this.field_I[var4_intLifetime1].field_d) {
              this.field_I[var4_intLifetime1].field_d.a(param0, -1, param2);
            }
            var4_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_23_0 = runtimeException;
          stackIn_23_1 = new StringBuilder().append("nk.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    nk(nk param0) {
        try {
          this.a(-353384856, true, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    nk(nk param0, boolean param1) {
        try {
          this.a(-353384856, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    nk(gk param0, int param1, int param2, int param3, int param4, int param5, qd[] param6) {
        try {
          this.field_W = 0;
          this.field_Q = param1;
          this.field_D = param5;
          this.field_I = param6;
          this.field_K = 0;
          this.field_G = param2;
          this.field_E = param3;
          this.field_L = true;
          this.field_N = -1;
          this.field_z = param4;
          this.field_R = param0;
          this.field_y = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    nk(gk param0, int param1, int param2, qd[] param3) {
        try {
          this.field_z = 0;
          this.field_K = 0;
          this.field_I = param3;
          this.field_E = param2;
          this.field_Q = -1;
          this.field_D = 0;
          this.field_y = 0;
          this.field_R = param0;
          this.field_L = true;
          this.field_N = -1;
          this.field_W = 0;
          this.field_G = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_F = new dj(3);
        field_M = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var4 = (long)(-1 + (var0 << 1));
          var6 = (long)(1 + (var0 << 1));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (field_M.length <= var3) {
            var3 = field_M.length - 1;
          }
          for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
            field_M[var1] = var0;
          }
        }
        field_O = new fm(9, 0, 4, 1);
        field_P = "Accept <%0> into this game";
        field_J = 0;
        field_X = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
