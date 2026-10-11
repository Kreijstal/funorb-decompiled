/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends bn {
    static String field_F;
    int field_H;
    int field_B;
    int field_N;
    static int[] field_D;
    private int field_v;
    private static int[] field_y;
    static int[] field_L;
    int field_M;
    ee[] field_P;
    static jp field_K;
    int field_S;
    int field_J;
    private int field_G;
    static jp[][] field_I;
    static int field_E;
    static kg field_x;
    static byte[] field_O;
    static mh field_A;
    static String field_z;
    int field_R;
    int field_C;
    static jp field_w;

    final int a(int param0, StringBuilder param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 79) {
            this.f(-33);
          }
          var3_int = super.a(107, param1);
          if (param1 != null) {
            discarded$4 = param1.append(this.field_j + " " + this.field_m + " ");
            discarded$5 = param1.append(this.field_k + " " + " " + this.field_o + " ");
            discarded$6 = param1.append(this.field_G + " " + this.field_J + " " + this.field_S + " " + this.field_M + " ");
            discarded$7 = param1.append(this.field_R + "\n");
          }
          var3_int = var3_int ^ (this.field_J * 19 + this.field_G * 23 - (-(this.field_S * 17) - 4641) ^ 405 + 27 * this.field_N << 21 ^ 47802 + this.field_M * 3 << 4 ^ 4643 + this.field_R * 23 << 8);
          var3_int = var3_int ^ this.field_H * 7 + 35 << 2;
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("on.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(cl param0, byte param1) {
        int var3_int = 0;
        ee var4_ref_ee = null;
        int incrementValue$0 = 0;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3_intLifetime1;
        if (param0.field_p.a(false)) {
          return;
        }
        if (param1 > -87) {
          return;
        }
        try {
          this.field_G = param0.field_t;
          this.field_P = new ee[param0.field_p.e(119)];
          var3_int = 0;
          var4_ref_ee = (ee) (param0.field_p.d(-38));
          while (var4_ref_ee != null) {
            incrementValue$0 = var3_int;
            var3_int++;
            this.field_P[incrementValue$0] = var4_ref_ee;
            var4_ref_ee = (ee) (param0.field_p.a((byte) 116));
          }
          this.field_v = -1 + this.field_P.length;
          this.field_C = 0;
          var3_intLifetime1 = 0;
          var4 = 0;
          while (var3_intLifetime1 <= this.field_J) {
            var4 = var3_intLifetime1;
            this.f(68);
            var3_intLifetime1 = var3_intLifetime1 + this.field_P[this.field_C].field_t;
          }
          this.field_S = -var4 + this.field_J;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "on.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    on() {
        this(0, 0, 0, 0, 0);
    }

    on(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0, param1, param2, param3, 8704, 4096, param4);
        this.field_R = -1;
        this.field_J = param7;
        this.field_N = param5;
        this.field_M = param6;
    }

    private final void a(j param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 15165) {
            this.a((byte) -67, false);
          }
          if ((this.field_N & 2) != 0 &&
            param0.a(26, this.field_i)) {
            param0.field_pb.a(new ge(this.field_j + this.field_u / 2 - 2048, this.field_m + this.field_s * 2, this.field_i), (byte) 3);
            if (!r.field_A) {
              return;
            }
            jc.a(this.field_i, 2, (byte) -92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("on.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(cl param0, boolean param1, int param2) {
        try {
          this.a(param0, (byte) -105);
          this.a((byte) 36, param1);
          if (param2 != 4) {
            on.a((byte) -120, -81);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "on.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        ee var6 = this.field_P[this.field_v];
        ee var4 = this.field_P[this.field_C];
        this.field_k = -var6.field_j + var4.field_j;
        int var5 = var4.field_t;
        this.field_o = var4.field_m - var6.field_m;
        if (param0 <= 33) {
          this.f(-3);
        }
        this.field_j = this.field_S * this.field_k / var5 + var6.field_j;
        this.field_m = var6.field_m + this.field_o * this.field_S / var5;
        if (param1) {
          this.field_k = this.field_k / var5;
          this.field_o = this.field_o / var5;
        } else {
          this.field_k = 0;
          this.field_o = 0;
        }
    }

    public static void d(int param0) {
        field_D = null;
        field_w = null;
        field_I = (jp[][]) null;
        field_A = null;
        field_z = null;
        if (param0 != 4641) {
          field_x = (kg) null;
        }
        field_L = null;
        field_y = null;
        field_x = null;
        field_K = null;
        field_O = null;
        field_F = null;
    }

    final void a(byte param0, j param1, no param2) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn var7 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = (vn) (param2);
          if (this.field_i == 28) {
            param1.a((byte) -63, this, var7);
            return;
          }
          if ((sg.field_n & 1 << this.field_i) != 0 ||
            var7.field_v == 0 &&
            var7.field_J == 0) {
            super.a((byte) 53, param1, param2);
            var7.field_I = var7.field_I + 1;
            if (sh.field_a != 8 &&
              sh.field_a != 4) {
              var7.field_o = -var7.field_o;
              var5 = ae.field_b * (this.field_o - var7.field_o);
              if (var5 < 0) {
                var7.field_o = this.field_o;
              }
            } else {
              var7.field_k = -var7.field_k;
              var5 = mn.field_A * (this.field_k - var7.field_k);
              if (0 > var5) {
                var7.field_k = this.field_k;
              }
            }
            var7.field_C = var7.field_C + 1;
            if ((var7.field_I & 3) == 0) {
              var7.field_k = var7.field_k + (-param1.a(4, (byte) 62) + 2);
              var7.field_o = var7.field_o + (2 - param1.a(4, (byte) 62));
            }
          }
          stackIn_21_0 = (var7.field_J != 0) ? 0 : 1;
          var5Lifetime1 = stackIn_21_0;
          stackIn_24_0 = var5Lifetime1;
          if (this.field_i == 19 &&
            sh.field_a != 1) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          var5Lifetime2 = stackIn_24_0 & stackIn_26_1;
          stackIn_29_0 = var5Lifetime2;
          if (20 == this.field_i &&
            sh.field_a != 2) {
            stackIn_31_1 = 0;
          } else {
            stackIn_31_1 = 1;
          }
          var5Lifetime3 = stackIn_29_0 & stackIn_31_1;
          if (var5Lifetime3 != 0) {
            if (25 == this.field_i) {
              param1.a(-27);
            }
            if (this.field_i != 27 ||
              this.field_R != 26) {
              if (this.field_i == 26 &&
                this.field_R == 27) {
                this.field_i = 27;
                this.field_R = 0;
                this.field_B = 1;
              } else {
                if (param1.field_l + 1 != ej.field_E[this.field_i]) {
                  if ((this.field_N & 1) == 0) {
                    param1.field_l = 0;
                  }
                } else {
                  param1.field_l = param1.field_l + 1;
                }
                this.field_R = ue.field_b[this.field_i];
                dupTemp$0 = rb.field_a[this.field_i];
                this.field_B = dupTemp$0;
                if (dupTemp$0 < 0) {
                  if (param1.a(100, (byte) 62) > 65) {
                    if (sh.field_a != 1) {
                      if (sh.field_a == 2) {
                        this.field_B = 7;
                      } else {
                        if (sh.field_a != 8) {
                          this.field_B = 9;
                        } else {
                          this.field_B = 8;
                        }
                      }
                    } else {
                      this.field_B = 6;
                    }
                  } else {
                    this.field_B = param1.a(6, (byte) 62);
                  }
                }
                this.a(param1, 15165);
              }
              this.field_l = 0;
            }
          }
          if (19 == this.field_i &&
            this.field_R < 0) {
            this.field_R = this.field_i;
            this.field_B = 12;
          }
          if (20 == this.field_i &&
            this.field_R < 0) {
            this.field_B = 12;
            this.field_R = this.field_i;
          }
          if (param0 != 53) {
            field_F = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("on.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final boolean a(no param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != (4 & this.field_N) &&
            this.field_P[this.field_v].field_t == 1 &&
            0 == this.field_S) {
            return false;
          }
          if ((1 << this.field_i & sg.field_n) == 0 &&
            0 != ((vn) (param0)).field_J) {
            return false;
          }
          if (this.field_R == 0) {
            return false;
          }
          var3_int = -83 % ((-29 - param1) / 35);
          stackIn_13_0 = super.a(param0, (byte) -120);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("on.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var1 = (-640 + kp.field_a) / 2;
        int var2 = hj.field_Yb * hj.field_Yb;
        int var3 = var2 - ml.field_b * ml.field_b;
        fe.field_gb.a(-124 + (lb.field_d - 90), 90, -(199 * var3 / var2) + var1, 199, (byte) 64);
        if (param0 >= -50) {
          on.d(61);
        }
        rm.field_a.a(-4 + lb.field_d - 120, 0, 438 * var3 / var2 + (var1 + 202), 438, (byte) 64);
    }

    on(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, 0, 0, 0);
    }

    final void f(int param0) {
        int fieldTemp$0 = this.field_C + 1;
        this.field_C = this.field_C + 1;
        this.field_C = fieldTemp$0 % this.field_P.length;
        int fieldTemp$1 = this.field_v + 1;
        this.field_v = this.field_v + 1;
        this.field_v = fieldTemp$1 % this.field_P.length;
        if (param0 <= 61) {
          wq var3 = (wq) null;
          this.a(-99, (wq) null);
        }
        this.field_J = this.field_J % this.field_G;
        this.field_S = 0;
    }

    final static int a(byte param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        qj.field_j = 0;
        dm.field_d = null;
        fc.field_e = null;
        int var2 = gd.field_a;
        gd.field_a = up.field_z;
        int var3 = -47 / ((param0 + 22) / 61);
        if (param1 == 51) {
          vd.field_f.field_f = 2;
        } else {
          if (param1 != 50) {
            vd.field_f.field_f = 1;
          } else {
            vd.field_f.field_f = 5;
          }
        }
        up.field_z = var2;
        vd.field_f.field_i = vd.field_f.field_i + 1;
        if (2 <= vd.field_f.field_i &&
          param1 == 51) {
          return 2;
        }
        if (vd.field_f.field_i >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(vd.field_f.field_i < 4)) {
          return 1;
        }
        return -1;
    }

    final void a(int param0, wq param1) {
        cl var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 89) {
            var4 = (cl) null;
            this.a((cl) null, (byte) 44);
          }
          super.a(93, param1);
          this.field_R = param1.b(true);
          if (this.field_R > 0) {
            this.field_B = param1.l(255);
          }
          this.field_N = param1.l(255) & 255;
          if ((4 & this.field_N) != 0) {
            this.field_M = param1.l(255);
            this.field_J = param1.i(65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("on.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_y = new int[65536];
        field_L = new int[65536];
        field_D = new int[]{100, 200, 300, 300, 500, 100, 300, 300, 500, 200, 500, 500, 500, 1000, 300, 1000, 100, 300, 500, 300, 500, 1000, 500, 300, 500, 1000, 300, 200, 500, 200, 100, 200, 100, 200, 100, 100, 100, 100, 100, 500, 1000, 200};
        field_F = "You must play <%1> more rated games before playing with the current options.";
        for (var0 = 0; var0 < 65536; var0++) {
          var1 = 256.0 - Math.sqrt((double)var0);
          field_L[var0] = (int)(var1 * var1 + 0.5);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_y[var0Lifetime1] = (int)Math.floor((double)var0Lifetime1 * 0.0234375 + (-(9.0 * var1Lifetime1) + 768.5));
        }
        field_z = "<%0> has lost connection.";
    }
}
