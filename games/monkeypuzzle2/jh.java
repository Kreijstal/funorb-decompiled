/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends we {
    static int[] field_y;
    boolean field_G;
    private int field_x;
    private int field_H;
    private int field_E;
    static ra field_C;
    private int field_u;
    private le field_w;
    private le[] field_z;
    private le field_B;
    private int field_v;
    private int field_F;
    private le field_A;
    int field_D;

    final void a(byte param0, int param1, int param2) {
        ((jh) this).field_H = (16711422 & param1) >> 1644892769;
        ((jh) this).field_x = param2;
        ((jh) this).field_F = param1;
        ((jh) this).field_E = 8355711 & param2 >> -1127695039;
        this.j(param0 ^ -115);
        if (param0 != -115) {
            ((jh) this).field_G = false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (param1 ^ -1)) {
            return;
        }
        int var5 = ((jh) this).field_r + param3;
        if (param0 != 30) {
            field_y = null;
        }
        int var6 = ((jh) this).field_e + param2;
        this.a(-82, ((jh) this).field_z[0], var5, var6);
        if (!(((jh) this).field_D >= 65536)) {
            qi.a(var5 + ((jh) this).field_l, true, ((jh) this).field_p + var6, var5 + (((jh) this).field_D * ((jh) this).field_l >> -1080957648), var6);
            this.a(-52, ((jh) this).field_z[1], var5, var6);
            tj.b(653);
        }
    }

    private final void j(int param0) {
        ((jh) this).field_z = new le[]{this.b((byte) 86, ((jh) this).field_x, ((jh) this).field_F), this.b((byte) 86, ((jh) this).field_E, ((jh) this).field_H)};
        ((jh) this).field_w = this.i(param0 ^ -40982079);
        ((jh) this).field_A = ((jh) this).field_w.a();
        if (param0 != 0) {
            ((jh) this).field_F = 23;
        }
        ((jh) this).field_B = new le(((jh) this).field_p >> 1940438849, ((jh) this).field_p);
    }

    private final le b(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        le var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var14 = new le(((jh) this).field_v * 2, ((jh) this).field_p);
        mc.a(param0 ^ -8551, var14);
        var5 = ((jh) this).field_p >> 2141461473;
        var6 = 0;
        L0: while (true) {
          if (((jh) this).field_p <= var6) {
            L1: {
              if (param0 == 86) {
                break L1;
              } else {
                ((jh) this).field_x = -11;
                break L1;
              }
            }
            tj.b(param0 + 567);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -998348415) * (2 * ((jh) this).field_v - 1) % (((jh) this).field_v * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (256 > var11) {
                stackOut_4_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 1348263720;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              ge.a(var7, var6, ((jh) this).field_v, var12);
              var9 = 65280 & param1;
              ge.a(-(2 * ((jh) this).field_v) + var7, var6, ((jh) this).field_v, var12);
              var8 = param1 & 16711935;
              if (256 > var11) {
                stackOut_7_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -673414552;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            ge.a(var7 + ((jh) this).field_v, var6, ((jh) this).field_v, var12);
            ge.a(var7 - ((jh) this).field_v, var6, ((jh) this).field_v, var12);
            var6++;
            continue L0;
          }
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -40982079, (16711422 & param6) >> 498563969);
    }

    private final void a(int param0, le param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          var5 = ((jh) this).field_l + param2;
          if (param0 < -37) {
            break L0;
          } else {
            var9 = null;
            this.a(118, (le) null, -87, 86);
            break L0;
          }
        }
        qi.a(var5 + -((jh) this).field_w.field_k, true, ((jh) this).field_p + param3, param2 - -((jh) this).field_w.field_k, param3);
        var6 = param2 + -((jh) this).field_u;
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              tj.b(653);
              if (ge.field_a > param2 + ((jh) this).field_w.field_k) {
                break L2;
              } else {
                mc.a(-8497, ((jh) this).field_B);
                param1.c(-((jh) this).field_u, 0);
                param1.c(((jh) this).field_v * 2 + -((jh) this).field_u, 0);
                ((jh) this).field_A.d(0, 0);
                tj.b(653);
                ((jh) this).field_B.c(param2, param3);
                break L2;
              }
            }
            L3: {
              if (-((jh) this).field_w.field_k + var5 > ge.field_j) {
                break L3;
              } else {
                mc.a(-8497, ((jh) this).field_B);
                var7 = ((jh) this).field_u + (((jh) this).field_l + -((jh) this).field_w.field_k);
                L4: while (true) {
                  if (var7 <= 2 * ((jh) this).field_v) {
                    param1.c(-var7, 0);
                    param1.c(2 * ((jh) this).field_v + -var7, 0);
                    ((jh) this).field_w.d(0, 0);
                    tj.b(653);
                    ((jh) this).field_B.c(-((jh) this).field_w.field_k + var5, param3);
                    break L3;
                  } else {
                    var7 = var7 - ((jh) this).field_v * 2;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param1.c(var6, param3);
            var6 = var6 + param1.field_k;
            continue L1;
          }
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        if (param3 >= -13) {
            return;
        }
        if (((jh) this).field_G) {
            ((jh) this).field_u = ((jh) this).field_u + 1;
            if (((jh) this).field_v * 2 < ((jh) this).field_u) {
                ((jh) this).field_u = ((jh) this).field_u - 2 * ((jh) this).field_v;
            }
        }
    }

    private final le i(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -40982079) {
            ((jh) this).field_B = null;
        }
        int var2 = ((jh) this).field_p >> -392079999;
        le var3 = new le(var2, ((jh) this).field_p);
        mc.a(-8497, var3);
        for (var4 = 0; var4 < ((jh) this).field_p; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((jh) this).field_p + -var4));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
                }
                ge.a(var5, var4, var8 << -1290801304 | var8 | var8 << 1231877072);
            }
        }
        tj.b(653);
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 7434) {
            jh.a(-65);
        }
        field_C = null;
        field_y = null;
    }

    private jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((jh) this).field_F = param5;
        ((jh) this).field_E = param8;
        ((jh) this).field_x = param6;
        ((jh) this).field_v = param4;
        ((jh) this).field_H = param7;
        ((jh) this).a(param3, 13361, param0, param2, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[8192];
    }
}
