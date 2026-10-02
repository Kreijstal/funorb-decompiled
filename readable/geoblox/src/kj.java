/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ia {
    private pc[][] field_D;
    private int[] field_p;
    private jb field_C;
    private int[] field_z;
    int[] field_u;
    static boolean[] field_o;
    static Sprite jewelsForegroundSprite;
    private int field_T;
    private int[] field_r;
    private fi field_q;
    private pc[][] field_j;
    private int[] field_v;
    int[] field_n;
    private int[] field_S;
    int[] field_m;
    private int[] field_L;
    private int[] field_M;
    static int field_J;
    private int[] field_K;
    private int field_R;
    private int[] field_y;
    private int[] field_s;
    static int[] field_O;
    private int[] field_Q;
    static int[] field_G;
    private int[] field_F;
    private int[] field_w;
    private int field_k;
    private ad field_I;
    private boolean field_B;
    private int field_t;
    private long field_x;
    private long field_A;
    private boolean field_P;
    private rf field_l;
    private int field_U;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (this.field_C.f()) {
              var4_int = this.field_C.field_d * this.field_T / AudioOutput.sampleRateHz;
              L1: while (true) {
                var5 = (long)param2 * (long)var4_int + this.field_x;
                if (this.field_A - var5 >= 0L) {
                  this.field_x = var5;
                  break L0;
                }
                var7 = (int)((-1L + this.field_A - (this.field_x - (long)var4_int)) / (long)var4_int);
                this.field_x = this.field_x + (long)var7 * (long)var4_int;
                this.field_I.a(param0, param1, var7);
                param2 = param2 - var7;
                param1 = param1 + var7;
                this.a((byte) 65);
                if (!this.field_C.f()) {
                  break L0;
                }
                continue L1;
              }
            }
          }
          this.field_I.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var4);

          stackIn_10_1 = new StringBuilder().append("kj.C(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -2832) {
            this.d(44);
        }
    }

    private final int a(byte param0, pc param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        t var10 = null;
        t var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_L[param1.field_t] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var10 = param1.field_x;
          var11 = var10;
          var4 = this.field_p[param1.field_t] * this.field_r[param1.field_t] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var5 = -83 % ((param0 - 44) / 55);
          var4 = 16384 + var4 * param1.field_w >> 15;
          var4 = 128 + var4 * this.field_R >> 8;
          var4 = var4 * this.field_L[param1.field_t] + 128 >> 8;
          if (var11.field_c > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_l * (double)var11.field_c) * (double)var4);
          }
          if (null != var11.field_f) {
            var6 = param1.field_o;
            var7 = var11.field_f[1 + param1.field_k];
            if (param1.field_k < var11.field_f.length - 2) {
              var8 = (var10.field_f[param1.field_k] & 255) << 8;
              var9 = (255 & var11.field_f[param1.field_k + 2]) << 8;
              var7 = var7 + (var11.field_f[param1.field_k + 3] - var7) * (-var8 + var6) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if (param1.field_y > 0) {
            if (var11.field_e != null) {
              var6 = param1.field_y;
              var7 = var11.field_e[1 + param1.field_q];
              if (-2 + var11.field_e.length > param1.field_q) {
                var8 = var10.field_e[param1.field_q] << 8 & 65280;
                var9 = var11.field_e[param1.field_q + 2] << 8 & 65280;
                var7 = var7 + (var11.field_e[param1.field_q + 3] - var7) * (-var8 + var6) / (-var8 + var9);
              }
              var4 = var7 * var4 + 32 >> 6;
            }
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = (RuntimeException) (var3);

          stackIn_22_1 = new StringBuilder().append("kj.KA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int a(int param0, pc param1) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        t var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            var3_int = (param1.field_n * param1.field_s >> 12) + param1.field_E;
            var3_int = var3_int + ((-8192 + this.field_y[param1.field_t]) * this.field_v[param1.field_t] >> 12);
            var4 = param1.field_x;
            if (0 < var4.field_d) {
              if (var4.field_b <= 0) {
                if (this.field_s[param1.field_t] <= 0) {
                  break L0;
                }
              }
              var5 = var4.field_b << 2;
              var6 = var4.field_j << 1;
              if (var6 > param1.field_j) {
                var5 = var5 * param1.field_j / var6;
              }
              var5 = var5 + (this.field_s[param1.field_t] >> 7);
              var7 = Math.sin(0.01227184630308513 * (double)(param1.field_m & 511));
              var3_int = var3_int + (int)(var7 * (double)var5);
            }
          }
          if (param0 <= 10) {
            stackIn_10_0 = -116;
            return stackIn_10_0;
          }
          var5 = (int)((double)(256 * param1.field_i.sampleRateHz) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)AudioOutput.sampleRateHz + 0.5);
          if (var5 < 1) {
            stackIn_14_0 = 1;
          } else {
            stackIn_14_0 = var5;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var3);

          stackIn_17_1 = new StringBuilder().append("kj.N(").append(param0).append(',');

          if (param1 == null) {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        md.field_e = null;
        if (!param0) {
            return;
        }
        hl.field_K = null;
        mj.field_a = (byte[][]) null;
        DualLinkNode.field_j = null;
        GameplaySession.field_m = null;
        cm.field_j = null;
    }

    private final void a(byte param0, int param1) {
        pc var3 = null;
        if (param0 != 39) {
            this.b((byte) -85, -70);
        }
        if (!((this.field_m[param1] & 2) == 0)) {
            var3 = (pc) ((Object) this.field_I.field_l.firstForIteration(0));
            while (var3 != null) {
                if (param1 == var3.field_t && null == this.field_j[param1][var3.field_D] && var3.field_y < 0) {
                    var3.field_y = 0;
                }
                var3 = (pc) ((Object) this.field_I.field_l.nextForIteration(1));
            }
        }
    }

    final boolean a(int param0, int param1, int[] param2, pc param3, boolean param4) {
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        t var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        try {
          L0: {
            param3.field_g = AudioOutput.sampleRateHz / 100;
            if (param3.field_y >= 0) {
              if (null != param3.field_u) {
                if (!param3.field_u.isSamplePositionOutOfRange()) {
                  break L0;
                }
              }
              param3.b(-1);
              param3.unlinkNode(param4);
              if (0 < param3.field_r) {
                if (param3 == this.field_D[param3.field_t][param3.field_r]) {
                  this.field_D[param3.field_t][param3.field_r] = null;
                  return true;
                }
              }
              return true;
            }
          }
          var6_int = param3.field_s;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_M[param3.field_t] * 0.0004921259842519685));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.field_s = var6_int;
          }
          param3.field_u.d(this.a(112, param3));
          var7 = param3.field_x;
          param3.field_m = param3.field_m + var7.field_d;
          param3.field_j = param3.field_j + 1;
          var8 = param4 ? 1 : 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param3.field_D << 8) + (param3.field_n * param3.field_s >> 12));
          if (var7.field_c > 0) {
            if (var7.field_h > 0) {
              param3.field_l = param3.field_l + (int)(128.0 * Math.pow(2.0, (double)var7.field_h * var9) + 0.5);
            } else {
              param3.field_l = param3.field_l + 128;
            }
            if (var7.field_c * param3.field_l >= 819200) {
              var8 = 1;
            }
          }
          L7: {
            if (var7.field_f != null) {
              if (var7.field_g > 0) {
                param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
              } else {
                param3.field_o = param3.field_o + 128;
              }
              L9: while (param3.field_k < -2 + var7.field_f.length) {
                if ((65280 & var7.field_f[param3.field_k + 2] << 8) < param3.field_o) {
                  param3.field_k = param3.field_k + 2;
                  continue L9;
                }
                break;
              }
              if (param3.field_k != -2 + var7.field_f.length) {
                break L7;
              }
              if (var7.field_f[param3.field_k + 1] != 0) {
                break L7;
              }
              var8 = 1;
              break L7;
            }
          }
          L11: {
            if (param3.field_y >= 0) {
              if (var7.field_e != null) {
                if ((this.field_m[param3.field_t] & 1) == 0) {
                  if (0 <= param3.field_r) {
                    if (param3 == this.field_D[param3.field_t][param3.field_r]) {
                      break L11;
                    }
                  }
                  if (0 < var7.field_a) {
                    param3.field_y = param3.field_y + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_a) * 128.0);
                  } else {
                    param3.field_y = param3.field_y + 128;
                  }
                  L14: while (-2 + var7.field_e.length > param3.field_q) {
                    if (param3.field_y > (var7.field_e[param3.field_q + 2] & 255) << 8) {
                      param3.field_q = param3.field_q + 2;
                      continue L14;
                    }
                    break;
                  }
                  if (-2 + var7.field_e.length != param3.field_q) {
                    break L11;
                  }
                  var8 = 1;
                  break L11;
                }
              }
            }
          }
          if (var8 == 0) {
            param3.field_u.a(param3.field_g, this.a((byte) -79, param3), this.a(param3, 761736646));
            return false;
          }
          param3.field_u.c(param3.field_g);
          if (param2 == null) {
            param3.field_u.b(param0);
          } else {
            param3.field_u.a(param2, param1, param0);
          }
          if (param3.field_u.g()) {
            this.field_I.field_m.a(param3.field_u);
          }
          param3.b(-1);
          if (0 <= param3.field_y) {
            param3.unlinkNode(false);
            if (0 < param3.field_r) {
              if (this.field_D[param3.field_t][param3.field_r] == param3) {
                this.field_D[param3.field_t][param3.field_r] = null;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_66_0 = (RuntimeException) (var6);

          stackIn_66_1 = new StringBuilder().append("kj.K(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
            stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
            stackIn_67_2 = "null";
          } else {
            stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
            stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
            stackIn_67_2 = "{...}";
          }


          stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

          if (param3 == null) {
            stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
            stackIn_70_2 = "null";
          } else {
            stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
            stackIn_70_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        pc var3 = null;
        if (!((this.field_m[param0] & 4) == 0)) {
            var3 = (pc) ((Object) this.field_I.field_l.firstForIteration(0));
            while (var3 != null) {
                if (!(var3.field_t != param0)) {
                    var3.field_B = 0;
                }
                var3 = (pc) ((Object) this.field_I.field_l.nextForIteration(1));
            }
        }
        if (param1 != 67) {
            this.field_l = (rf) null;
        }
    }

    final synchronized boolean a(ci param0, int param1, int param2, rf param3, rh param4) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        pj var8 = null;
        int var9 = 0;
        vl var10 = null;
        int var11 = 0;
        var11 = Geoblox.field_C;
        try {
          param3.b();
          var6_int = 1;
          var7 = null;
          if (~param1 < param2) {
            var7 = new int[]{param1};
          }
          var8 = (pj) ((Object) param3.field_g.a((byte) 125));
          L1: while (var8 != null) {
            var9 = (int)var8.field_a;
            var10 = (vl) ((Object) this.field_q.a((long)var9, (byte) -91));
            if (var10 == null) {
              var10 = vl.a(var9, (byte) 121, param4);
              if (var10 != null) {
                this.field_q.a((byte) 102, var10, (long)var9);
              } else {
                var6_int = 0;
              }
            }
            if (var10 != null) {
              if (!var10.a((int[]) (var7), var8.field_h, param2 + 36, param0)) {
                var6_int = 0;
              }
            }
            var8 = (pj) ((Object) param3.field_g.b(param2 - 100));
          }
          if (var6_int != 0) {
            param3.a();
          }
          stackIn_17_0 = var6_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var6);

          stackIn_20_1 = new StringBuilder().append("kj.T(");

          if (param0 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "{...}";
          }


          stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }


          stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

          if (param4 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        if (!(param1 >= 0)) {
            for (param1 = 0; param1 < 16; param1++) {
                this.b((byte) -22, param1);
            }
            return;
        }
        this.field_p[param1] = 12800;
        this.field_z[param1] = 8192;
        this.field_r[param1] = 16383;
        this.field_y[param1] = 8192;
        this.field_s[param1] = 0;
        this.field_M[param1] = 8192;
        this.a((byte) 39, param1);
        this.a(param1, (byte) 67);
        this.field_m[param1] = 0;
        if (param0 >= -12) {
            this.field_k = 55;
        }
        this.field_w[param1] = 32767;
        this.field_v[param1] = 256;
        this.field_u[param1] = 0;
        this.f(-112, 8192, param1);
    }

    private final void a(int param0, int param1, int param2) {
        this.field_F[param1] = param2;
        this.field_K[param1] = cd.a(param2, -128);
        if (param0 != -8581) {
            this.field_z = (int[]) null;
        }
        this.b(param1, -129, param2);
    }

    private final int a(pc param0, int param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        pc var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_z[param0.field_t];
          if (param1 != 761736646) {
            var4 = (pc) null;
            discarded$1 = this.a((pc) null, 124);
          }
          if (var3_int < 8192) {
            stackIn_6_0 = var3_int * param0.field_h + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - (32 + (128 - param0.field_h) * (16384 - var3_int) >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);

          stackIn_9_1 = new StringBuilder().append("kj.U(");

          if (param0 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(pc param0, byte param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param1 != -70) {
            field_o = (boolean[]) null;
          }
          L1: {
            var4_int = param0.field_i.samples.length;
            if (param2) {
              if (param0.field_i.pingPongLoop) {
                var6 = -param0.field_i.loopStart + var4_int + var4_int;
                var4_int = var4_int << 8;
                var5 = (int)((long)var6 * (long)this.field_u[param0.field_t] >> 6);
                if (var4_int > var5) {
                  break L1;
                }
                param0.field_u.b(true);
                var5 = -var5 + (var4_int + var4_int) - 1;
                break L1;
              }
            }
            var5 = (int)((long)var4_int * (long)this.field_u[param0.field_t] >> 6);
          }
          param0.field_u.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var4);

          stackIn_13_1 = new StringBuilder().append("kj.HA(");

          if (param0 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized ia c() {
        return null;
    }

    private final void c(int param0, int param1) {
        pc var3 = (pc) ((Object) this.field_I.field_l.firstForIteration(param1 ^ param1));
        while (var3 != null) {
            if (param0 < 0 || param0 == var3.field_t) {
                if (!(var3.field_y >= 0)) {
                    this.field_j[var3.field_t][var3.field_D] = null;
                    var3.field_y = 0;
                }
            }
            var3 = (pc) ((Object) this.field_I.field_l.nextForIteration(1));
        }
    }

    private final void c(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (param1 != 38) {
          return;
        }
        {
          var3 = 240 & param0;
          if (var3 == 128) {
            var4 = param0 & 15;
            var5 = (32542 & param0) >> 8;
            var6 = (param0 & 8361066) >> 16;
            this.b(23327, var5, var6, var4);
            return;
          }
          if (var3 == 144) {
            var4 = param0 & 15;
            var5 = (32525 & param0) >> 8;
            var6 = 127 & param0 >> 16;
            if (var6 > 0) {
              this.c(-1, var4, var6, var5);
            } else {
              this.b(23327, var5, 64, var4);
            }
            return;
          }
          if (var3 == 160) {
            var4 = 15 & param0;
            var5 = param0 >> 8 & 127;
            var6 = (8370933 & param0) >> 16;
            this.a(-40, var6, var5, var4);
            return;
          }
          if (var3 != 176) {
            if (192 == var3) {
              var4 = param0 & 15;
              var5 = (32632 & param0) >> 8;
              this.b(var4, param1 - 167, var5 + this.field_K[var4]);
              return;
            }
            if (var3 == 208) {
              var4 = param0 & 15;
              var5 = (32669 & param0) >> 8;
              this.d(var5, param1 ^ -2858, var4);
              return;
            }
            if (var3 == 224) {
              var4 = param0 & 15;
              var5 = (param0 >> 9 & 16256) + ((32673 & param0) >> 8);
              this.c(-108, var5, var4);
              return;
            }
            var3 = 255 & param0;
            if (255 != var3) {
              return;
            }
            this.a(true, param1 ^ 2097113);
            return;
          }
          var4 = 15 & param0;
          var5 = (param0 & 32577) >> 8;
          var6 = param0 >> 16 & 127;
          if (0 == var5) {
            this.field_K[var4] = (var6 << 14) + cd.a(this.field_K[var4], -2080769);
          }
          if (var5 == 32) {
            this.field_K[var4] = (var6 << 7) + cd.a(this.field_K[var4], -16257);
          }
          if (var5 == 1) {
            this.field_s[var4] = (var6 << 7) + cd.a(this.field_s[var4], -16257);
          }
          if (33 == var5) {
            this.field_s[var4] = var6 + cd.a(-128, this.field_s[var4]);
          }
          if (var5 == 5) {
            this.field_M[var4] = cd.a(-16257, this.field_M[var4]) + (var6 << 7);
          }
          if (var5 == 37) {
            this.field_M[var4] = cd.a(-128, this.field_M[var4]) + var6;
          }
          if (var5 == 7) {
            this.field_p[var4] = cd.a(this.field_p[var4], -16257) + (var6 << 7);
          }
          if (var5 == 39) {
            this.field_p[var4] = cd.a(-128, this.field_p[var4]) + var6;
          }
          if (var5 == 10) {
            this.field_z[var4] = cd.a(-16257, this.field_z[var4]) + (var6 << 7);
          }
          if (var5 == 42) {
            this.field_z[var4] = var6 + cd.a(-128, this.field_z[var4]);
          }
          if (var5 == 11) {
            this.field_r[var4] = (var6 << 7) + cd.a(-16257, this.field_r[var4]);
          }
          if (var5 == 43) {
            this.field_r[var4] = cd.a(-128, this.field_r[var4]) + var6;
          }
          if (var5 == 64) {
            if (var6 < 64) {
              this.field_m[var4] = cd.a(this.field_m[var4], -2);
            } else {
              this.field_m[var4] = lb.a(this.field_m[var4], 1);
            }
          }
          if (var5 == 65) {
            if (64 <= var6) {
              this.field_m[var4] = lb.a(this.field_m[var4], 2);
            } else {
              this.a((byte) 39, var4);
              this.field_m[var4] = cd.a(this.field_m[var4], -3);
            }
          }
          if (var5 == 99) {
            this.field_w[var4] = cd.a(this.field_w[var4], 127) + (var6 << 7);
          }
          if (var5 == 98) {
            this.field_w[var4] = var6 + cd.a(16256, this.field_w[var4]);
          }
          if (101 == var5) {
            this.field_w[var4] = (var6 << 7) + (cd.a(this.field_w[var4], 127) + 16384);
          }
          if (var5 == 100) {
            this.field_w[var4] = 16384 + (cd.a(16256, this.field_w[var4]) + var6);
          }
          if (120 == var5) {
            this.b(100, var4);
          }
          if (var5 == 121) {
            this.b((byte) -72, var4);
          }
          if (var5 == 123) {
            this.c(var4, param1 ^ 15421);
          }
          if (var5 == 6) {
            var7 = this.field_w[var4];
            if (16384 == var7) {
              this.field_v[var4] = cd.a(this.field_v[var4], -16257) + (var6 << 7);
            }
          }
          if (var5 == 38) {
            var7 = this.field_w[var4];
            if (var7 == 16384) {
              this.field_v[var4] = cd.a(this.field_v[var4], -128) + var6;
            }
          }
          if (16 == var5) {
            this.field_u[var4] = cd.a(-16257, this.field_u[var4]) + (var6 << 7);
          }
          if (48 == var5) {
            this.field_u[var4] = var6 + cd.a(this.field_u[var4], -128);
          }
          if (var5 == 81) {
            if (var6 >= 64) {
              this.field_m[var4] = lb.a(this.field_m[var4], 4);
            } else {
              this.a(var4, (byte) 67);
              this.field_m[var4] = cd.a(this.field_m[var4], -5);
            }
          }
          if (var5 == 17) {
            this.f(-118, (var6 << 7) + (this.field_Q[var4] & -16257), var4);
          }
          if (var5 == 49) {
            this.f(-102, (-128 & this.field_Q[var4]) + var6, var4);
          }
          return;
        }
    }

    private final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        if (param1 >= 0) {
            this.field_L[param1] = param2;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                this.field_L[var4] = param2;
            }
        }
        if (param0 != 74) {
            this.a((byte) 100, 93);
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_R = param0;
        if (param1 != 22) {
            this.field_x = 84L;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        long var5;
        int var7;
        var3 = -25 % ((29 - param0) / 34);
        var2 = this.field_t;
        var4 = this.field_k;
        var5 = this.field_A;
        if (this.field_l != null) {
          if (this.field_U == var4) {
            this.a(121, this.field_l, this.field_B, this.field_P);
            this.a((byte) 73);
            return;
          }
        }
        L1: while (true) {
          if (var4 != this.field_k) {
            this.field_k = var4;
            this.field_A = var5;
            this.field_t = var2;
            if (null != this.field_l) {
              if (this.field_U < var4) {
                this.field_k = this.field_U;
                this.field_t = -1;
                this.field_A = this.field_C.d(this.field_k);
              }
            }
            return;
          }
          L3: while (true) {
            L4: {
              if (this.field_C.field_a[var2] == var4) {
                this.field_C.a(var2);
                var7 = this.field_C.e(var2);
                if (1 != var7) {
                  if ((128 & var7) != 0) {
                    this.c(var7, (byte) 38);
                  }
                  this.field_C.f(var2);
                  this.field_C.b(var2);
                  continue L3;
                }
                this.field_C.d();
                this.field_C.b(var2);
                if (this.field_C.e()) {
                  if (this.field_l != null) {
                    this.a(this.field_B, this.field_l, -1706);
                    this.a((byte) -32);
                    return;
                  }
                  if (this.field_B) {
                    if (var4 != 0) {
                      this.field_C.a(var5);
                      break L4;
                    }
                  }
                  this.a(true, 2097151);
                  this.field_C.a();
                  return;
                }
              }
            }
            var2 = this.field_C.c();
            var4 = this.field_C.field_a[var2];
            var5 = this.field_C.d(var4);
            continue L1;
          }
        }
    }

    final synchronized void a(boolean param0, rf param1, int param2) {
        try {
            if (param2 != -1706) {
                this.field_t = -24;
            }
            this.a(param2 + 1832, param1, param0, true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kj.PA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pc var6;
        pc var7;
        var7 = this.field_j[param3][param1];
        if (var7 == null) {
          return;
        }
        this.field_j[param3][param1] = null;
        if (param0 != 23327) {
          this.field_U = -124;
        }
        L1: {
          if ((this.field_m[param3] & 2) != 0) {
            var6 = (pc) ((Object) this.field_I.field_l.firstForIteration(param0 ^ 23327));
            L2: while (var6 != null) {
              if (var7.field_t == var6.field_t) {
                if (0 > var6.field_y) {
                  if (var7 != var6) {
                    var7.field_y = 0;
                    break L1;
                  }
                }
              }
              var6 = (pc) ((Object) this.field_I.field_l.nextForIteration(1));
            }
            break L1;
          }
          var7.field_y = 0;
        }
    }

    private final void b(int param0, int param1) {
        pc var3;
        var3 = (pc) ((Object) this.field_I.field_l.firstForIteration(param0 - 100));
        L0: while (var3 != null) {
          L2: {
            if (param1 >= 0) {
              if (param1 != var3.field_t) {
                break L2;
              }
            }
            if (null != var3.field_u) {
              var3.field_u.c(AudioOutput.sampleRateHz / 100);
              if (var3.field_u.g()) {
                this.field_I.field_m.a(var3.field_u);
              }
              var3.b(-1);
            }
            if (var3.field_y < 0) {
              this.field_j[var3.field_t][var3.field_D] = null;
            }
            var3.unlinkNode(false);
          }
          var3 = (pc) ((Object) this.field_I.field_l.nextForIteration(1));
        }
        if (param0 != 100) {
          this.field_x = -48L;
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Geoblox.field_C;
        if (param0 <= 65) {
            this.c(-76, (byte) -34);
        }
        vl var4 = (vl) ((Object) this.field_q.a((byte) 125));
        while (var4 != null) {
            var4.a((byte) -121);
            var4 = (vl) ((Object) this.field_q.b(-52));
        }
    }

    private final void f(int param0, int param1, int param2) {
        this.field_Q[param2] = param1;
        if (param0 > -100) {
            this.a(-75, 124, -68);
        }
        this.field_n[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != this.field_S[param0]) {
            this.field_S[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                this.field_D[param0][var4] = null;
            }
        }
        if (param1 != -129) {
            this.field_v = (int[]) null;
        }
    }

    public static void b(boolean param0) {
        jewelsForegroundSprite = null;
        field_O = null;
        field_o = null;
        field_G = null;
        if (param0) {
            kj.c(-77);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            this.c(-1, 15387);
        } else {
            this.b(100, -1);
        }
        if (param1 != 2097151) {
            this.b(108);
        }
        this.b((byte) -109, -1);
        for (var3 = 0; var3 < 16; var3++) {
            this.field_S[var3] = this.field_F[var3];
        }
        int var4 = 0;
        var3 = var4;
        while (var4 < 16) {
            this.field_K[var4] = cd.a(this.field_F[var4], -128);
            var4++;
        }
    }

    final synchronized ia b() {
        return (ia) ((Object) this.field_I);
    }

    final synchronized void b(int param0) {
        int var2;
        long var3;
        int var5;
        L0: {
          if (this.field_C.f()) {
            var2 = this.field_T * this.field_C.field_d / AudioOutput.sampleRateHz;
            L1: while (true) {
              var3 = this.field_x + (long)param0 * (long)var2;
              if (-var3 + this.field_A >= 0L) {
                this.field_x = var3;
                break L0;
              }
              var5 = (int)((-1L + ((long)var2 - this.field_x + this.field_A)) / (long)var2);
              this.field_x = this.field_x + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_I.b(var5);
              this.a((byte) -42);
              if (this.field_C.f()) {
                continue L1;
              }
              break L0;
            }
          }
        }
        this.field_I.b(param0);
    }

    final boolean b(pc param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_u != null) {
            if (param1 == -1) {
              return false;
            }
            return true;
          }
          if (param0.field_y >= 0) {
            param0.unlinkNode(false);
            if (0 < param0.field_r) {
              if (this.field_D[param0.field_t][param0.field_r] == param0) {
                this.field_D[param0.field_t][param0.field_r] = null;
                return true;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var3);

          stackIn_15_1 = new StringBuilder().append("kj.IA(");

          if (param0 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.field_C.a();
        if (param0 < 78) {
            this.field_y = (int[]) null;
        }
        this.field_l = null;
        this.a(param1, 2097151);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pc stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_16_0;
        pc stackIn_16_1;
        int stackIn_16_2;
        boolean stackIn_16_3;
        pc var5;
        int var6_int;
        PcmSample var6;
        pc var7;
        pc var8;
        vl var9;
        vl var10;
        L0: {
          this.b(23327, param3, 64, param1);
          if (0 != (2 & this.field_m[param1])) {
            var5 = (pc) ((Object) this.field_I.field_l.lastForIteration(false));
            L1: while (var5 != null) {
              if (param1 == var5.field_t) {
                if (var5.field_y < 0) {
                  this.field_j[param1][var5.field_D] = null;
                  this.field_j[param1][param3] = var5;
                  var6_int = (var5.field_n * var5.field_s >> 12) + var5.field_E;
                  var5.field_E = var5.field_E + (param3 - var5.field_D << 8);
                  var5.field_D = param3;
                  var5.field_n = var6_int - var5.field_E;
                  var5.field_s = 4096;
                  return;
                }
              }
              var5 = (pc) ((Object) this.field_I.field_l.previousForIteration(~param0));
            }
            break L0;
          }
        }
        var9 = (vl) ((Object) this.field_q.a((long)this.field_S[param1], (byte) -105));
        var10 = var9;
        if (var10 == null) {
          return;
        }
        {
          var6 = var9.field_k[param3];
          if (var6 == null) {
            return;
          }
          {
            var7 = new pc();
            var7.field_t = param1;
            var7.field_z = var10;
            var7.field_i = var6;
            var7.field_x = var9.field_f[param3];
            var7.field_r = var9.field_i[param3];
            var7.field_D = param3;
            var7.field_w = var9.field_o[param3] * var10.field_g * (param2 * param2) + 1024 >> 11;
            var7.field_h = 255 & var9.field_m[param3];
            var7.field_E = (param3 << 8) - (var9.field_j[param3] & 32767);
            var7.field_q = 0;
            var7.field_l = 0;
            var7.field_o = 0;
            var7.field_k = 0;
            var7.field_y = -1;
            if (param0 == ~this.field_u[param1]) {
              var7.field_u = PcmSampleStream.a(var6, this.a(92, var7), this.a((byte) 117, var7), this.a(var7, 761736646));
            } else {
              var7.field_u = PcmSampleStream.a(var6, this.a(83, var7), 0, this.a(var7, 761736646));

              stackIn_15_1 = (pc) (var7);

              stackIn_15_2 = -70;

              if (0 <= var9.field_j[param3]) {
                stackIn_16_0 = this;
                stackIn_16_1 = (pc) ((Object) stackIn_15_1);
                stackIn_16_2 = stackIn_15_2;
                stackIn_16_3 = false;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = (pc) ((Object) stackIn_15_1);
                stackIn_16_2 = stackIn_15_2;
                stackIn_16_3 = true;
              }
              this.a(stackIn_16_1, (byte) stackIn_16_2, stackIn_16_3);
            }
            if (var9.field_j[param3] < 0) {
              var7.field_u.g(-1);
            }
            if (0 <= var7.field_r) {
              var8 = this.field_D[param1][var7.field_r];
              if (var8 != null) {
                if (var8.field_y < 0) {
                  this.field_j[param1][var8.field_D] = null;
                  var8.field_y = 0;
                }
              }
              this.field_D[param1][var7.field_r] = var7;
            }
            this.field_I.field_l.addLast(-70, var7);
            this.field_j[param1][param3] = var7;
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 > -107) {
            return;
        }
        this.field_y[param2] = param1;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -40) {
            int[] var6 = (int[]) null;
            this.a((int[]) null, -107, 119);
        }
    }

    final synchronized void d(int param0) {
        this.a((byte) 106, true);
        if (param0 != -9268) {
            this.field_F = (int[]) null;
        }
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != je.field_j) {
          var1 = je.field_j;
          synchronized (var1) {
            je.field_j = null;
          }
        }
        if (param0 != -11099) {
          field_J = 4;
        }
    }

    private final synchronized void a(int param0, rf param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            this.a((byte) 98, param3);
            this.field_C.a(param1.field_f);
            this.field_x = 0L;
            this.field_B = param2 ? true : false;
            var5_int = this.field_C.g();
            if (param0 <= 92) {
                this.a(60, (byte) -45);
            }
            for (var6 = 0; var6 < var5_int; var6++) {
                this.field_C.a(var6);
                this.field_C.f(var6);
                this.field_C.b(var6);
            }
            this.field_t = this.field_C.c();
            this.field_k = this.field_C.field_a[this.field_t];
            this.field_A = this.field_C.d(this.field_k);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kj.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void e(int param0, int param1, int param2) {
        if (param0 != -1636) {
            this.b((byte) -86, 98);
        }
        this.a(-8581, param1, param2);
    }

    public kj() {
        this.field_D = new pc[16][128];
        this.field_z = new int[16];
        this.field_u = new int[16];
        this.field_p = new int[16];
        this.field_S = new int[16];
        this.field_m = new int[16];
        this.field_v = new int[16];
        this.field_L = new int[16];
        this.field_s = new int[16];
        this.field_M = new int[16];
        this.field_j = new pc[16][128];
        this.field_r = new int[16];
        this.field_T = 1000000;
        this.field_K = new int[16];
        this.field_R = 256;
        this.field_n = new int[16];
        this.field_y = new int[16];
        this.field_Q = new int[16];
        this.field_F = new int[16];
        this.field_w = new int[16];
        this.field_C = new jb();
        this.field_I = new ad((kj) (this));
        this.field_q = new fi(128);
        this.a((byte) 74, -1, 256);
        this.a(true, 2097151);
    }

    static {
        field_J = 0;
        field_o = new boolean[112];
        field_O = new int[128];
        field_G = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
