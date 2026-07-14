/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * ((c) this).field_N, ((c) this).field_x);
        cl.a(-112, var14);
        var5 = ((c) this).field_x >> 985941857;
        var6 = 0;
        L0: while (true) {
          if (((c) this).field_x <= var6) {
            L1: {
              if (param1 == 16711935) {
                break L1;
              } else {
                ((c) this).field_O = 56;
                break L1;
              }
            }
            mf.e(4096);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -168292607) * (-1 + 2 * ((c) this).field_N) % (2 * ((c) this).field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 206831848;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              mi.b(var7, var6, ((c) this).field_N, var12);
              var9 = param2 & 65280;
              var8 = param2 & 16711935;
              mi.b(var7 + -(2 * ((c) this).field_N), var6, ((c) this).field_N, var12);
              if ((var11 ^ -1) <= -257) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> 2133927368;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            mi.b(((c) this).field_N + var7, var6, ((c) this).field_N, var12);
            mi.b(var7 - ((c) this).field_N, var6, ((c) this).field_N, var12);
            var6++;
            continue L0;
          }
        }
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 571924641 & 8355711, param6 >> 209702273 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        if (param0 != -277997311) {
            field_H = -117;
        }
        ((c) this).field_S = new o[]{this.b(((c) this).field_O, param0 + 294709246, ((c) this).field_K), this.b(((c) this).field_I, param0 ^ -275703298, ((c) this).field_F)};
        ((c) this).field_P = this.a((byte) -119);
        ((c) this).field_A = ((c) this).field_P.b();
        ((c) this).field_G = new o(((c) this).field_x >> -277997311, ((c) this).field_x);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        if (param1 != 18874) {
            ((c) this).a((byte) -66, -124, 9);
        }
        if (((c) this).field_B) {
            ((c) this).field_D = ((c) this).field_D + 1;
            if (((c) this).field_N * 2 < ((c) this).field_D) {
                ((c) this).field_D = ((c) this).field_D - ((c) this).field_N * 2;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param1)) {
            return;
        }
        int var5 = ((c) this).field_m + param2;
        int var6 = param0 - -((c) this).field_j;
        this.a(param3, var6, ((c) this).field_S[0], var5);
        if ((((c) this).field_R ^ -1) > -65537) {
            kf.a((byte) 97, var5 - -(((c) this).field_t * ((c) this).field_R >> 451556400), var6, var5 - -((c) this).field_t, ((c) this).field_x + var6);
            this.a(0, var6, ((c) this).field_S[1], var5);
            mf.e(4096);
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var5 = ((c) this).field_t + param3;
        kf.a((byte) 97, param3 + ((c) this).field_P.field_p, param1, -((c) this).field_P.field_p + var5, ((c) this).field_x + param1);
        var6 = -((c) this).field_D + param3;
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                o discarded$1 = this.a((byte) 120);
                break L1;
              }
            }
            L2: {
              mf.e(4096);
              if (mi.field_b > ((c) this).field_P.field_p + param3) {
                break L2;
              } else {
                cl.a(param0 ^ -100, ((c) this).field_G);
                param2.d(-((c) this).field_D, 0);
                param2.d(-((c) this).field_D + 2 * ((c) this).field_N, 0);
                ((c) this).field_A.g(0, 0);
                mf.e(param0 ^ 4096);
                ((c) this).field_G.d(param3, param1);
                break L2;
              }
            }
            L3: {
              if (mi.field_k < -((c) this).field_P.field_p + var5) {
                break L3;
              } else {
                cl.a(param0 + -119, ((c) this).field_G);
                var7 = ((c) this).field_D + (-((c) this).field_P.field_p + ((c) this).field_t);
                L4: while (true) {
                  if (var7 <= 2 * ((c) this).field_N) {
                    param2.d(-var7, 0);
                    param2.d(-var7 + 2 * ((c) this).field_N, 0);
                    ((c) this).field_P.g(0, 0);
                    mf.e(param0 ^ 4096);
                    ((c) this).field_G.d(-((c) this).field_P.field_p + var5, param1);
                    break L3;
                  } else {
                    var7 = var7 - ((c) this).field_N * 2;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param2.d(var6, param1);
            var6 = var6 + param2.field_p;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((c) this).field_F = (param1 & 16711422) >> 32005889;
        ((c) this).field_I = 8355711 & param2 >> 797935009;
        ((c) this).field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        ((c) this).field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -97 % ((param0 - -47) / 39);
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (gb.a(param1, 126)) {
            return true;
        }
        char[] var6 = hh.field_N;
        char[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        var2 = qk.field_k;
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (!(var4 != param1)) {
                return true;
            }
        }
        return false;
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((c) this).field_I = param7;
        ((c) this).field_K = param6;
        ((c) this).field_F = param8;
        ((c) this).field_O = param5;
        ((c) this).field_N = param4;
        ((c) this).b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var2 = ((c) this).field_x >> 148199553;
        if (param0 != -119) {
            return null;
        }
        o var3 = new o(var2, ((c) this).field_x);
        cl.a(-98, var3);
        for (var4 = 0; ((c) this).field_x > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((c) this).field_x));
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                mi.a(var5, var4, var8 << 1261525928 | var8 | var8 << -874209264);
            }
        }
        mf.e(4096);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
