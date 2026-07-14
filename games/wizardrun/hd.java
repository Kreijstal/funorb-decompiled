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
        ((hd) this).field_G = new o[]{this.a(((hd) this).field_B, ((hd) this).field_H, (byte) -11), this.a(((hd) this).field_L, ((hd) this).field_F, (byte) -11)};
        ((hd) this).field_D = this.d(10706);
        ((hd) this).field_y = ((hd) this).field_D.c();
        if (param0 != -24060) {
            ((hd) this).field_G = null;
        }
        ((hd) this).field_K = new o(((hd) this).field_n >> -1233486591, ((hd) this).field_n);
    }

    private final o a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = wizardrun.field_H;
        var14 = new o(((hd) this).field_J * 2, ((hd) this).field_n);
        ud.a(var14, false);
        var5 = ((hd) this).field_n >> -1028717695;
        if (param2 == -11) {
          var6 = 0;
          L0: while (true) {
            if (((hd) this).field_n <= var6) {
              bb.b(4);
              return var14;
            } else {
              L1: {
                var7 = (-1 + 2 * ((hd) this).field_J) * (var6 >> -1223937823) % (((hd) this).field_J * 2);
                var8 = param1 & 16711935;
                var9 = param1 & 65280;
                var10 = -var5 + var6;
                var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
                if (var11 >= 256) {
                  stackOut_6_0 = var8 | var9;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 1117284808;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                ed.f(var7, var6, ((hd) this).field_J, var12);
                var9 = 65280 & param0;
                ed.f(-(((hd) this).field_J * 2) + var7, var6, ((hd) this).field_J, var12);
                var8 = param0 & 16711935;
                if (-257 < (var11 ^ -1)) {
                  stackOut_9_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 832271112;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var8 | var9;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              ed.f(var7 - -((hd) this).field_J, var6, ((hd) this).field_J, var12);
              ed.f(var7 - ((hd) this).field_J, var6, ((hd) this).field_J, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((hd) this).field_L = (param2 & 16711422) >> -1076176703;
        ((hd) this).field_F = (param0 & 16711422) >> 616044449;
        ((hd) this).field_H = param0;
        ((hd) this).field_B = param2;
        this.a(-24060);
        if (param1 != -1028717695) {
            ((hd) this).field_A = 0;
        }
    }

    private final void a(o param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var5 = param2 + ((hd) this).field_r;
        eb.a(param3, param1 + ((hd) this).field_n, param2 - -((hd) this).field_D.field_z, param1, var5 + -((hd) this).field_D.field_z);
        var6 = param2 + -((hd) this).field_A;
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              bb.b(4);
              if (ed.field_c > param2 - -((hd) this).field_D.field_z) {
                break L1;
              } else {
                ud.a(((hd) this).field_K, false);
                param0.e(-((hd) this).field_A, 0);
                param0.e(((hd) this).field_J * 2 + -((hd) this).field_A, 0);
                ((hd) this).field_y.f(0, 0);
                bb.b(4);
                ((hd) this).field_K.e(param2, param1);
                break L1;
              }
            }
            L2: {
              if (var5 + -((hd) this).field_D.field_z > ed.field_l) {
                break L2;
              } else {
                ud.a(((hd) this).field_K, false);
                var7 = ((hd) this).field_r + -((hd) this).field_D.field_z + ((hd) this).field_A;
                L3: while (true) {
                  if (((hd) this).field_J * 2 >= var7) {
                    param0.e(-var7, 0);
                    param0.e(-var7 + 2 * ((hd) this).field_J, 0);
                    ((hd) this).field_D.f(0, 0);
                    bb.b(4);
                    ((hd) this).field_K.e(var5 - ((hd) this).field_D.field_z, param1);
                    break L2;
                  } else {
                    var7 = var7 - ((hd) this).field_J * 2;
                    continue L3;
                  }
                }
              }
            }
            return;
          } else {
            param0.e(var6, param1);
            var6 = var6 + param0.field_z;
            continue L0;
          }
        }
    }

    private final o d(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = wizardrun.field_H;
        int var2 = ((hd) this).field_n >> -814613535;
        o var3 = new o(var2, ((hd) this).field_n);
        if (param0 != 10706) {
            return null;
        }
        ud.a(var3, false);
        for (var4 = 0; var4 < ((hd) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((hd) this).field_n + -var4) * var4);
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
            ((hd) this).field_K = null;
        }
        super.a(122, param1, param2, param3, param4);
        this.a(-24060);
    }

    final static void a(kl param0, int param1) {
        nc.a(param0.a(-85, "", "headers.packvorbis"));
        nc var2 = nc.a(param0, "jagex logo2.packvorbis", "");
        je discarded$3 = var2.b();
        if (param1 >= -96) {
            field_C = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = param0 + ((hd) this).field_o;
        int var6 = param3 - -((hd) this).field_l;
        this.a(((hd) this).field_G[param1], var6, var5, param1 ^ 0);
        if (((hd) this).field_z < 65536) {
            eb.a(0, ((hd) this).field_n + var6, var5 - -(((hd) this).field_r * ((hd) this).field_z >> -786771408), var6, var5 + ((hd) this).field_r);
            this.a(((hd) this).field_G[1], var6, var5, 0);
            bb.b(4);
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        if (param0 != 10000536) {
            return;
        }
        if (((hd) this).field_I) {
            ((hd) this).field_A = ((hd) this).field_A + 1;
            if (!(2 * ((hd) this).field_J >= ((hd) this).field_A)) {
                ((hd) this).field_A = ((hd) this).field_A - 2 * ((hd) this).field_J;
            }
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
        ((hd) this).field_J = param4;
        ((hd) this).field_F = param7;
        ((hd) this).field_L = param8;
        ((hd) this).field_B = param6;
        ((hd) this).field_H = param5;
        ((hd) this).a(113, param1, param3, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new uf("email");
        field_E = "to return to the normal view.";
    }
}
