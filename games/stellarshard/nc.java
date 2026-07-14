/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends rj {
    private int field_O;
    private pb[] field_C;
    private int field_N;
    private pb field_I;
    int field_K;
    private int field_M;
    static ek[] field_F;
    private pb field_P;
    private int field_L;
    private int field_D;
    static int field_G;
    boolean field_B;
    static int field_A;
    private int field_z;
    static pf field_y;
    static int field_H;
    private pb field_E;

    private final pb d(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = stellarshard.field_B;
        int var2 = ((nc) this).field_t >> -649383871;
        pb var3 = new pb(var2, ((nc) this).field_t);
        if (param0) {
            pb discarded$0 = this.b(-65, -14, 113);
        }
        hj.a(var3, 1);
        for (var4 = 0; var4 < ((nc) this).field_t; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((nc) this).field_t + -var4));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                ti.a(var5, var4, var8 << -1762441904 | (var8 | var8 << -113903832));
            }
        }
        id.b((byte) -58);
        return var3;
    }

    final void c(int param0, int param1, int param2) {
        ((nc) this).field_O = (param2 & 16711422) >> -1344932351;
        ((nc) this).field_D = param2;
        ((nc) this).field_N = 8355711 & param1 >> 629055745;
        if (param0 != 65280) {
            return;
        }
        ((nc) this).field_L = param1;
        this.a(15035);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(-1 == (param0 ^ -1))) {
            return;
        }
        int var5 = param3 - -((nc) this).field_w;
        if (param1 != -57) {
            return;
        }
        int var6 = param2 - -((nc) this).field_k;
        this.a(var5, (byte) 46, var6, ((nc) this).field_C[0]);
        if (-65537 < (((nc) this).field_K ^ -1)) {
            gg.a(20, ((nc) this).field_p + var5, var6, var6 + ((nc) this).field_t, (((nc) this).field_K * ((nc) this).field_p >> -1381314256) + var5);
            this.a(var5, (byte) 46, var6, ((nc) this).field_C[1]);
            id.b((byte) -58);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 23987) {
            ((nc) this).field_K = -78;
        }
        super.b(param0, param1, param2, param3, param4 + 0);
        this.a(15035);
    }

    public static void e(boolean param0) {
        field_y = null;
        field_F = null;
        if (!param0) {
            nc.e(true);
        }
    }

    private final void a(int param0) {
        ((nc) this).field_C = new pb[]{this.b(((nc) this).field_L, ((nc) this).field_D, 0), this.b(((nc) this).field_N, ((nc) this).field_O, 0)};
        ((nc) this).field_P = this.d(false);
        if (param0 != 15035) {
            return;
        }
        ((nc) this).field_E = ((nc) this).field_P.f();
        ((nc) this).field_I = new pb(((nc) this).field_t >> 1890443585, ((nc) this).field_t);
    }

    final static void b(byte param0, int param1, int param2) {
        wg.field_c = param2;
        if (param0 != 98) {
            field_H = -55;
        }
        vk.field_b = param1;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        if (param1) {
            return;
        }
        if (((nc) this).field_B) {
            ((nc) this).field_z = ((nc) this).field_z + 1;
            if (((nc) this).field_z > ((nc) this).field_M * 2) {
                ((nc) this).field_z = ((nc) this).field_z - ((nc) this).field_M * 2;
            }
        }
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1229782785, 8355711 & param6 >> -1584689247);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        fk.a(-28092, (java.awt.Component) (Object) param0);
        if (param1 <= 84) {
            return;
        }
        ge.a((java.awt.Component) (Object) param0, (byte) -41);
        if (!(null == og.field_c)) {
            og.field_c.a((byte) -93, (java.awt.Component) (Object) param0);
        }
    }

    private final void a(int param0, byte param1, int param2, pb param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = stellarshard.field_B;
          if (param1 == 46) {
            break L0;
          } else {
            ((nc) this).field_C = null;
            break L0;
          }
        }
        var5 = param0 + ((nc) this).field_p;
        gg.a(42, var5 - ((nc) this).field_P.field_v, param2, ((nc) this).field_t + param2, ((nc) this).field_P.field_v + param0);
        var6 = -((nc) this).field_z + param0;
        L1: while (true) {
          if (var6 >= var5) {
            L2: {
              id.b((byte) -58);
              if (((nc) this).field_P.field_v + param0 >= ti.field_e) {
                hj.a(((nc) this).field_I, param1 ^ 47);
                param3.e(-((nc) this).field_z, 0);
                param3.e(-((nc) this).field_z + 2 * ((nc) this).field_M, 0);
                ((nc) this).field_E.c(0, 0);
                id.b((byte) -58);
                ((nc) this).field_I.e(param0, param2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ti.field_c < var5 - ((nc) this).field_P.field_v) {
                break L3;
              } else {
                hj.a(((nc) this).field_I, 1);
                var7 = ((nc) this).field_z + -((nc) this).field_P.field_v + ((nc) this).field_p;
                L4: while (true) {
                  if (2 * ((nc) this).field_M >= var7) {
                    param3.e(-var7, 0);
                    param3.e(2 * ((nc) this).field_M - var7, 0);
                    ((nc) this).field_P.c(0, 0);
                    id.b((byte) -58);
                    ((nc) this).field_I.e(var5 - ((nc) this).field_P.field_v, param2);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((nc) this).field_M;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param3.e(var6, param2);
            var6 = var6 + param3.field_v;
            continue L1;
          }
        }
    }

    private final pb b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = stellarshard.field_B;
        var14 = new pb(((nc) this).field_M * 2, ((nc) this).field_t);
        hj.a(var14, param2 + 1);
        var5 = ((nc) this).field_t >> 1924826689;
        var6 = param2;
        L0: while (true) {
          if (var6 >= ((nc) this).field_t) {
            id.b((byte) -58);
            return var14;
          } else {
            L1: {
              var7 = (-1 + ((nc) this).field_M * 2) * (var6 >> -1910791455) % (2 * ((nc) this).field_M);
              var8 = param1 & 16711935;
              var9 = param1 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (256 > var11) {
                stackOut_4_0 = (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> 124844104;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ti.g(var7, var6, ((nc) this).field_M, var12);
              ti.g(var7 - ((nc) this).field_M * 2, var6, ((nc) this).field_M, var12);
              var9 = param0 & 65280;
              var8 = param0 & 16711935;
              if (256 > var11) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 138105736;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ti.g(var7 + ((nc) this).field_M, var6, ((nc) this).field_M, var12);
            ti.g(-((nc) this).field_M + var7, var6, ((nc) this).field_M, var12);
            var6++;
            continue L0;
          }
        }
    }

    private nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((nc) this).field_N = param8;
        ((nc) this).field_O = param7;
        ((nc) this).field_L = param6;
        ((nc) this).field_M = param4;
        ((nc) this).field_D = param5;
        ((nc) this).b(param2, param0, param1, param3, 23987);
    }

    static {
    }
}
