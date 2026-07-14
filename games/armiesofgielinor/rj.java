/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends kb {
    private static int[] field_M;
    private int field_C;
    private int field_P;
    private int field_N;
    int field_D;
    static je field_F;
    private wk field_S;
    private int field_E;
    private int field_L;
    private wk[] field_O;
    private wk field_J;
    private int field_H;
    boolean field_R;
    private wk field_K;
    static String field_G;
    static int[] field_Q;

    private final wk b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wk var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var14 = new wk(((rj) this).field_C * 2, ((rj) this).field_w);
        vn.a(var14, 3);
        var5 = ((rj) this).field_w >> 279312513;
        if (param1 < -54) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((rj) this).field_w) {
              rf.b(-18862);
              return var14;
            } else {
              L1: {
                var7 = (((rj) this).field_C * 2 - 1) * (var6 >> 330885057) % (((rj) this).field_C * 2);
                var8 = param2 & 16711935;
                var9 = 65280 & param2;
                var10 = var6 + -var5;
                var11 = (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0) + 128;
                if ((var11 ^ -1) <= -257) {
                  stackOut_6_0 = var9 | var8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var8 * var11 & -16711936 | 16711680 & var11 * var9) >>> 382852360;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                qn.e(var7, var6, ((rj) this).field_C, var12);
                var8 = 16711935 & param0;
                qn.e(var7 + -(((rj) this).field_C * 2), var6, ((rj) this).field_C, var12);
                var9 = 65280 & param0;
                if ((var11 ^ -1) > -257) {
                  stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -392666296;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var9 | var8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              qn.e(var7 - -((rj) this).field_C, var6, ((rj) this).field_C, var12);
              qn.e(-((rj) this).field_C + var7, var6, ((rj) this).field_C, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        this.i(3);
    }

    final void c(int param0, int param1, int param2) {
        ((rj) this).field_L = param1;
        ((rj) this).field_H = param0;
        ((rj) this).field_P = param1 >> -1864971167 & 8355711;
        ((rj) this).field_E = 8355711 & param0 >> 928997857;
        this.i(3);
        if (param2 != 27178) {
            field_F = null;
        }
    }

    private final void a(int param0, int param1, wk param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = param3 + ((rj) this).field_l;
        id.a(((rj) this).field_J.field_y + param3, -((rj) this).field_J.field_y + var5, param1 + ((rj) this).field_w, param1, (byte) 87);
        var6 = -((rj) this).field_N + param3;
        var7 = -123 / ((param0 - -26) / 40);
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              rf.b(-18862);
              if (qn.field_j <= param3 + ((rj) this).field_J.field_y) {
                vn.a(((rj) this).field_K, 3);
                param2.g(-((rj) this).field_N, 0);
                param2.g(((rj) this).field_C * 2 - ((rj) this).field_N, 0);
                ((rj) this).field_S.b(0, 0);
                rf.b(-18862);
                ((rj) this).field_K.g(param3, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-((rj) this).field_J.field_y + var5 <= qn.field_e) {
                vn.a(((rj) this).field_K, 3);
                var8 = -((rj) this).field_J.field_y + ((rj) this).field_l + ((rj) this).field_N;
                L3: while (true) {
                  if (var8 <= ((rj) this).field_C * 2) {
                    param2.g(-var8, 0);
                    param2.g(-var8 + ((rj) this).field_C * 2, 0);
                    ((rj) this).field_J.b(0, 0);
                    rf.b(-18862);
                    ((rj) this).field_K.g(var5 - ((rj) this).field_J.field_y, param1);
                    break L2;
                  } else {
                    var8 = var8 - ((rj) this).field_C * 2;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            param2.g(var6, param1);
            var6 = var6 + param2.field_y;
            continue L0;
          }
        }
    }

    final static bi a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            bi var5 = null;
            dh var5_ref = null;
            Object stackIn_2_0 = null;
            bi stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            bi stackOut_3_0 = null;
            try {
              var4 = Class.forName("jo");
              var5 = (bi) var4.newInstance();
              if (param2 == 1423111778) {
                return (bi) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5.a(param0, param2 ^ -1423111760, param3, param1);
              stackOut_3_0 = (bi) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 616254785 & 8355711, (param6 & 16711422) >> -1924693887);
    }

    public static void a(byte param0) {
        field_G = null;
        field_M = null;
        field_F = null;
        if (param0 >= -67) {
            return;
        }
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -82) {
            return;
        }
        if (0 != param3) {
            return;
        }
        int var5 = ((rj) this).field_B + param0;
        int var6 = param1 + ((rj) this).field_p;
        this.a(-77, var6, ((rj) this).field_O[0], var5);
        if (!(65536 <= ((rj) this).field_D)) {
            id.a((((rj) this).field_l * ((rj) this).field_D >> 2083344304) + var5, var5 + ((rj) this).field_l, ((rj) this).field_w + var6, var6, (byte) 74);
            this.a(-103, var6, ((rj) this).field_O[1], var5);
            rf.b(-18862);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        if (!(!((rj) this).field_R)) {
            ((rj) this).field_N = ((rj) this).field_N + 1;
            if (!(((rj) this).field_C * 2 >= ((rj) this).field_N)) {
                ((rj) this).field_N = ((rj) this).field_N - ((rj) this).field_C * 2;
            }
        }
        if (param0 != 32722) {
            wk discarded$0 = this.b(11, 65, -18);
        }
    }

    final static void a(int param0) {
        if (nw.g(125)) {
            return;
        }
        if (!(ps.field_v)) {
            return;
        }
        byte[] var2 = new byte[2];
        byte[] var1 = var2;
        var2[param0] = (byte)(ek.field_d << 1423111778);
        var2[0] = (byte) 1;
        if (uc.field_a) {
            var2[1] = (byte)oe.c((int) var2[1], 2);
        }
        if (cu.field_a) {
            var2[1] = (byte)oe.c((int) var2[1], 1);
        }
        li discarded$0 = nm.a(0, 6, var2);
        ps.field_v = false;
    }

    private final wk j(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = ((rj) this).field_w >> -1242768831;
        wk var3 = new wk(var2, ((rj) this).field_w);
        vn.a(var3, param0 + -747);
        if (param0 != 750) {
            return null;
        }
        for (var4 = 0; var4 < ((rj) this).field_w; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((rj) this).field_w) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                qn.a(var5, var4, var8 | var8 << 2099005512 | var8 << -106028656);
            }
        }
        rf.b(param0 + -19612);
        return var3;
    }

    private final void i(int param0) {
        ((rj) this).field_O = new wk[]{this.b(((rj) this).field_H, -61, ((rj) this).field_L), this.b(((rj) this).field_E, -120, ((rj) this).field_P)};
        ((rj) this).field_J = this.j(750);
        ((rj) this).field_S = ((rj) this).field_J.e();
        if (param0 != 3) {
            field_Q = null;
        }
        ((rj) this).field_K = new wk(((rj) this).field_w >> 50714209, ((rj) this).field_w);
    }

    final static void d(byte param0) {
        c.field_e = null;
        qm.field_K = null;
        j.field_e = null;
        vj.field_j = null;
        if (param0 < 96) {
            return;
        }
        qv.field_j = null;
        iq.field_g = null;
    }

    private rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rj) this).field_L = param5;
        ((rj) this).field_H = param6;
        ((rj) this).field_P = param7;
        ((rj) this).field_C = param4;
        ((rj) this).field_E = param8;
        ((rj) this).a(param0, param2, param1, 8192, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_M = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
            field_M[var0] = 65536 * (var0 / 2) + (1 * var0 + 256 * (var0 / 3));
        }
        field_G = "Quality: ";
        field_Q = new int[8192];
    }
}
