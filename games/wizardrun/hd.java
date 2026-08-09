/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ub {
    private o field_K;
    private int field_B;
    static uf field_C;
    private o[] field_G;
    private int field_H;
    private o field_y;
    private int field_A;
    private int field_J;
    private int field_L;
    int field_z;
    static String field_E;
    boolean field_I;
    private int field_F;
    private o field_D;

    private final void a(int param0) {
        this.field_G = new o[]{this.a(this.field_B, this.field_H, (byte) -11), this.a(this.field_L, this.field_F, (byte) -11)};
        this.field_D = this.d(10706);
        this.field_y = this.field_D.c();
        if (param0 != -24060) {
            this.field_G = (o[]) null;
        }
        this.field_K = new o(this.field_n >> -1233486591, this.field_n);
    }

    private final o a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = wizardrun.field_H;
        o var14 = new o(this.field_J * 2, this.field_n);
        ud.a(var14, false);
        int var5 = this.field_n >> -1028717695;
        if (param2 != -11) {
            return (o) null;
        }
        for (var6 = 0; this.field_n > var6; var6++) {
            var7 = (-1 + 2 * this.field_J) * (var6 >> -1223937823) % (this.field_J * 2);
            var8 = param1 & 16711935;
            var9 = param1 & 65280;
            var10 = -var5 + var6;
            var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
            var12 = var11 < 256 ? (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 1117284808 : var8 | var9;
            ed.f(var7, var6, this.field_J, var12);
            var9 = 65280 & param0;
            ed.f(-(this.field_J * 2) + var7, var6, this.field_J, var12);
            var8 = param0 & 16711935;
            var12 = -257 >= (var11 ^ -1) ? var8 | var9 : (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 832271112;
            ed.f(var7 - -this.field_J, var6, this.field_J, var12);
            ed.f(var7 - this.field_J, var6, this.field_J, var12);
        }
        bb.b(4);
        return var14;
    }

    final void a(int param0, int param1, int param2) {
        this.field_L = (param2 & 16711422) >> -1076176703;
        this.field_F = (param0 & 16711422) >> 616044449;
        this.field_H = param0;
        this.field_B = param2;
        this.a(-24060);
        if (param1 != -1028717695) {
            this.field_A = 0;
        }
    }

    private final void a(o param0, int param1, int param2, int param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var5_int = param2 + this.field_r;
            eb.a(param3, param1 + this.field_n, param2 - -this.field_D.field_z, param1, var5_int + -this.field_D.field_z);
            var6 = param2 + -this.field_A;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  bb.b(4);
                  if (ed.field_c > param2 - -this.field_D.field_z) {
                    break L2;
                  } else {
                    ud.a(this.field_K, false);
                    param0.e(-this.field_A, 0);
                    param0.e(this.field_J * 2 + -this.field_A, 0);
                    this.field_y.f(0, 0);
                    bb.b(4);
                    this.field_K.e(param2, param1);
                    break L2;
                  }
                }
                L3: {
                  if (var5_int + -this.field_D.field_z > ed.field_l) {
                    break L3;
                  } else {
                    ud.a(this.field_K, false);
                    var7 = this.field_r + -this.field_D.field_z + this.field_A;
                    L4: while (true) {
                      if (this.field_J * 2 >= var7) {
                        param0.e(-var7, 0);
                        param0.e(-var7 + 2 * this.field_J, 0);
                        this.field_D.f(0, 0);
                        bb.b(4);
                        this.field_K.e(var5_int - this.field_D.field_z, param1);
                        break L3;
                      } else {
                        var7 = var7 - this.field_J * 2;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.e(var6, param1);
                var6 = var6 + param0.field_z;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("hd.GA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final o d(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = wizardrun.field_H;
        int var2 = this.field_n >> -814613535;
        o var3 = new o(var2, this.field_n);
        if (param0 != 10706) {
            return (o) null;
        }
        ud.a(var3, false);
        for (var4 = 0; var4 < this.field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((this.field_n + -var4) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                ed.a(var5, var4, var8 << 976313000 | var8 | var8 << 459657008);
            }
        }
        bb.b(4);
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 736264577 & 8355711, param6 >> -1828109023 & 8355711);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 108) {
            this.field_K = (o) null;
        }
        super.a(122, param1, param2, param3, param4);
        this.a(-24060);
    }

    final static void a(kl param0, int param1) {
        nc var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              nc.a(param0.a(-85, "", "headers.packvorbis"));
              var2 = nc.a(param0, "jagex logo2.packvorbis", "");
              var2.b();
              if (param1 < -96) {
                break L1;
              } else {
                field_C = (uf) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("hd.FA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = param0 + this.field_o;
        int var6 = param3 - -this.field_l;
        this.a(this.field_G[param1], var6, var5, param1 ^ 0);
        if (this.field_z < 65536) {
            eb.a(0, this.field_n + var6, var5 - -(this.field_r * this.field_z >> -786771408), var6, var5 + this.field_r);
            this.a(this.field_G[1], var6, var5, 0);
            bb.b(4);
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == 10000536) {
              L1: {
                if (!this.field_I) {
                  break L1;
                } else {
                  this.field_A = this.field_A + 1;
                  if (2 * this.field_J < this.field_A) {
                    this.field_A = this.field_A - 2 * this.field_J;
                    break L1;
                  } else {
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean g(byte param0) {
        int var1 = -126 % ((param0 - -10) / 63);
        return true;
    }

    public static void a(byte param0) {
        if (param0 < 96) {
            hd.a((byte) -5);
        }
        field_C = null;
        field_E = null;
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_J = param4;
        this.field_F = param7;
        this.field_L = param8;
        this.field_B = param6;
        this.field_H = param5;
        this.a(113, param1, param3, param2, param0);
    }

    static {
        field_C = new uf("email");
        field_E = "to return to the normal view.";
    }
}
