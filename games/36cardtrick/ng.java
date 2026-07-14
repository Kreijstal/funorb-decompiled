/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends lk {
    private int field_L;
    private int field_M;
    private kc[] field_K;
    private int field_G;
    private kc field_E;
    static byte field_H;
    private int field_z;
    static String field_y;
    private kc field_D;
    private int field_A;
    private int field_B;
    private kc field_F;
    boolean field_I;
    int field_J;

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        this.a(param0, param1, param2, param3, param4);
        this.b(!param4 ? true : false);
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_H = (byte) 43;
        }
        field_y = null;
    }

    ng(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> -17623231, 8355711 & param6 >> 1367466785);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == (param3 ^ -1))) {
            return;
        }
        int var5 = param0 - -((ng) this).field_o;
        int var6 = ((ng) this).field_i + param1;
        this.a(((ng) this).field_K[0], var6, false, var5);
        if (!(65536 <= ((ng) this).field_J)) {
            ek.a(var6, ((ng) this).field_h + var5, (((ng) this).field_J * ((ng) this).field_h >> -1356229808) + var5, (byte) 74, ((ng) this).field_q + var6);
            this.a(((ng) this).field_K[1], var6, false, var5);
            gg.a(14756);
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -68) {
            return false;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final void a(int param0, int param1, lk param2, int param3) {
        if (param3 != 3) {
            return;
        }
        if (((ng) this).field_I) {
            ((ng) this).field_B = ((ng) this).field_B + 1;
            if (((ng) this).field_B > 2 * ((ng) this).field_G) {
                ((ng) this).field_B = ((ng) this).field_B - 2 * ((ng) this).field_G;
            }
        }
    }

    private final void a(kc param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        L0: {
          var8 = Main.field_T;
          var5 = param3 - -((ng) this).field_h;
          ek.a(param1, -((ng) this).field_D.field_p + var5, ((ng) this).field_D.field_p + param3, (byte) 96, ((ng) this).field_q + param1);
          var6 = -((ng) this).field_B + param3;
          if (!param2) {
            break L0;
          } else {
            var9 = (lk) null;
            ((ng) this).a(-91, 67, (lk) null, -108);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              gg.a(14756);
              if (((ng) this).field_D.field_p + param3 >= vj.field_f) {
                dl.a(80, ((ng) this).field_F);
                param0.d(-((ng) this).field_B, 0);
                param0.d(((ng) this).field_G * 2 - ((ng) this).field_B, 0);
                ((ng) this).field_E.e(0, 0);
                gg.a(14756);
                ((ng) this).field_F.d(param3, param1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (vj.field_a >= -((ng) this).field_D.field_p + var5) {
                dl.a(-103, ((ng) this).field_F);
                var7 = ((ng) this).field_h - ((ng) this).field_D.field_p + ((ng) this).field_B;
                L4: while (true) {
                  if (var7 <= 2 * ((ng) this).field_G) {
                    param0.d(-var7, 0);
                    param0.d(-var7 + ((ng) this).field_G * 2, 0);
                    ((ng) this).field_D.e(0, 0);
                    gg.a(14756);
                    ((ng) this).field_F.d(-((ng) this).field_D.field_p + var5, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((ng) this).field_G;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param0.d(var6, param1);
            var6 = var6 + ((kc) param0).field_p;
            continue L1;
          }
        }
    }

    private final void b(boolean param0) {
        ((ng) this).field_K = new kc[]{this.a(((ng) this).field_z, ((ng) this).field_M, (byte) 88), this.a(((ng) this).field_A, ((ng) this).field_L, (byte) 88)};
        ((ng) this).field_D = this.a(param0);
        if (param0) {
            ng.a(-28);
        }
        ((ng) this).field_E = ((ng) this).field_D.a();
        ((ng) this).field_F = new kc(((ng) this).field_q >> 42959233, ((ng) this).field_q);
    }

    private final kc a(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Main.field_T;
        int var2 = ((ng) this).field_q >> 1220858753;
        if (param0) {
            kc discarded$0 = this.a(-57, 44, (byte) 37);
        }
        kc var3 = new kc(var2, ((ng) this).field_q);
        dl.a(-79, var3);
        for (var4 = 0; var4 < ((ng) this).field_q; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((ng) this).field_q));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                vj.a(var5, var4, var8 << 60704752 | (var8 << 1005872776 | var8));
            }
        }
        gg.a(14756);
        return var3;
    }

    private final kc a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kc var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = Main.field_T;
        var14 = new kc(2 * ((ng) this).field_G, ((ng) this).field_q);
        dl.a(102, var14);
        if (param2 == 88) {
          var5 = ((ng) this).field_q >> -723661823;
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((ng) this).field_q) {
              gg.a(param2 ^ 14844);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 1953269985) * (2 * ((ng) this).field_G + -1) % (2 * ((ng) this).field_G);
                var8 = 16711935 & param0;
                var9 = param0 & 65280;
                var10 = -var5 + var6;
                var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
                if (var11 >= 256) {
                  stackOut_6_0 = var9 | var8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 33747176;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                vj.d(var7, var6, ((ng) this).field_G, var12);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                vj.d(var7 - 2 * ((ng) this).field_G, var6, ((ng) this).field_G, var12);
                if (var11 < 256) {
                  stackOut_9_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 930999976;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var9 | var8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              vj.d(((ng) this).field_G + var7, var6, ((ng) this).field_G, var12);
              vj.d(-((ng) this).field_G + var7, var6, ((ng) this).field_G, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return (kc) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ng) this).field_M = param1;
        ((ng) this).field_A = 8355711 & param2 >> -839634559;
        ((ng) this).field_L = (16711422 & param1) >> 1749840961;
        if (param0 != 0) {
            ((ng) this).field_L = -68;
        }
        ((ng) this).field_z = param2;
        this.b(false);
    }

    private ng(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ng) this).field_L = param8;
        ((ng) this).field_G = param4;
        ((ng) this).field_M = param6;
        ((ng) this).field_z = param5;
        ((ng) this).field_A = param7;
        ((ng) this).a(param3, param1, param2, param0, true);
    }

    static {
    }
}
