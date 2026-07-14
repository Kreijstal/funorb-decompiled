/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ee {
    int field_A;
    private int field_F;
    private ka[] field_B;
    private int field_J;
    private int field_D;
    static k field_C;
    private ka field_O;
    private ka field_N;
    private int field_Q;
    private ka field_E;
    private int field_I;
    boolean field_L;
    static int[] field_K;
    static boolean field_P;
    private int field_H;
    static eg field_G;

    public static void c(byte param0) {
        if (param0 <= 114) {
            return;
        }
        field_G = null;
        field_K = null;
        field_C = null;
    }

    final static void a(int param0, int param1) {
        int var3 = TorChallenge.field_F ? 1 : 0;
        eh var4 = (eh) (Object) nh.field_cb.c((byte) -43);
        while (var4 != null) {
            sa.a((byte) 61, param1, var4);
            var4 = (eh) (Object) nh.field_cb.c(param0 + 26175);
        }
        if (param0 != -26445) {
            field_G = null;
        }
        da var2 = ga.field_w.c((byte) 111);
        while (var2 != null) {
            kk.a(param1, -117);
            var2 = ga.field_w.c(-270);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 100) {
            ((ek) this).field_D = 71;
        }
        super.a((byte) 108, param1, param2, param3, param4);
        this.g(483);
    }

    private final void a(int param0, int param1, ka param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        var5 = param0 - -((ek) this).field_p;
        bc.a(((ek) this).field_l + param3, ((ek) this).field_O.field_u + param0, param3, -((ek) this).field_O.field_u + var5, param1 + -13469);
        var6 = param0 - ((ek) this).field_F;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (param1 == 13470) {
                break L1;
              } else {
                ((ek) this).field_F = -127;
                break L1;
              }
            }
            L2: {
              ie.b((byte) -9);
              if (qg.field_a > ((ek) this).field_O.field_u + param0) {
                break L2;
              } else {
                ad.a(-86, ((ek) this).field_E);
                param2.g(-((ek) this).field_F, 0);
                param2.g(-((ek) this).field_F + ((ek) this).field_Q * 2, 0);
                ((ek) this).field_N.c(0, 0);
                ie.b((byte) -9);
                ((ek) this).field_E.g(param0, param3);
                break L2;
              }
            }
            L3: {
              if (qg.field_c >= -((ek) this).field_O.field_u + var5) {
                ad.a(param1 + -13345, ((ek) this).field_E);
                var7 = ((ek) this).field_F + (((ek) this).field_p + -((ek) this).field_O.field_u);
                L4: while (true) {
                  if (2 * ((ek) this).field_Q >= var7) {
                    param2.g(-var7, 0);
                    param2.g(2 * ((ek) this).field_Q - var7, 0);
                    ((ek) this).field_O.c(0, 0);
                    ie.b((byte) -9);
                    ((ek) this).field_E.g(-((ek) this).field_O.field_u + var5, param3);
                    break L3;
                  } else {
                    var7 = var7 - ((ek) this).field_Q * 2;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param2.g(var6, param3);
            var6 = var6 + param2.field_u;
            continue L0;
          }
        }
    }

    private final ka a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        int var2 = ((ek) this).field_l >> -955961631;
        ka var3 = new ka(var2, ((ek) this).field_l);
        ad.a(param0 + 120, var3);
        if (param0 != 1) {
            ((ek) this).field_O = null;
        }
        for (var4 = 0; var4 < ((ek) this).field_l; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((ek) this).field_l));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                qg.a(var5, var4, var8 << 267597392 | (var8 | var8 << -1101589624));
            }
        }
        ie.b((byte) -9);
        return var3;
    }

    final void b(int param0, int param1, int param2) {
        ((ek) this).field_J = param1 >> 944131425 & 8355711;
        ((ek) this).field_D = param1;
        if (param0 != 23927) {
            ((ek) this).field_I = 76;
        }
        ((ek) this).field_H = param2;
        ((ek) this).field_I = (16711422 & param2) >> 846436609;
        this.g(param0 + -23444);
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        if (((ek) this).field_L) {
            ((ek) this).field_F = ((ek) this).field_F + 1;
            if (2 * ((ek) this).field_Q < ((ek) this).field_F) {
                ((ek) this).field_F = ((ek) this).field_F - 2 * ((ek) this).field_Q;
            }
        }
        if (param2 > -97) {
            ka discarded$0 = this.a(67);
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        he.a(param0, 0, var3, 0, var2);
        if (param1 >= -37) {
            return null;
        }
        return var3;
    }

    final static void h(int param0) {
        if (param0 != 1) {
            field_C = null;
        }
        fk.a(true, 4);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            int var4 = 0;
            String var5 = null;
            java.net.URL var6 = null;
            int var2 = -69 % ((param0 - -1) / 44);
            try {
                var3 = param1.getDocumentBase().getFile();
                var4 = var3.indexOf('?');
                var5 = "reload.ws";
                if (!(0 > var4)) {
                    var5 = var5 + var3.substring(var4);
                }
                var6 = new java.net.URL(param1.getCodeBase(), var5);
                param1.getAppletContext().showDocument(mc.a(var6, -1, param1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        ((ek) this).field_B = new ka[]{this.a(false, ((ek) this).field_H, ((ek) this).field_D), this.a(false, ((ek) this).field_I, ((ek) this).field_J)};
        ((ek) this).field_O = this.a(param0 ^ 482);
        ((ek) this).field_N = ((ek) this).field_O.i();
        if (param0 != 483) {
            Object var3 = null;
            this.a(-14, 14, (ka) null, 57);
        }
        ((ek) this).field_E = new ka(((ek) this).field_l >> -394628223, ((ek) this).field_l);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (0 != param3) {
            return;
        }
        int var5 = param1 - -((ek) this).field_m;
        int var6 = param0 + ((ek) this).field_i;
        if (param2) {
            return;
        }
        this.a(var5, 13470, ((ek) this).field_B[0], var6);
        if (((ek) this).field_A < 65536) {
            bc.a(var6 + ((ek) this).field_l, var5 + (((ek) this).field_p * ((ek) this).field_A >> 1116179760), var6, var5 - -((ek) this).field_p, 1);
            this.a(var5, 13470, ((ek) this).field_B[1], var6);
            ie.b((byte) -9);
        }
    }

    private ek(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ek) this).field_J = param7;
        ((ek) this).field_Q = param4;
        ((ek) this).field_D = param5;
        ((ek) this).field_H = param6;
        ((ek) this).field_I = param8;
        ((ek) this).a((byte) 127, param0, param3, param2, param1);
    }

    private final ka a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ka var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          var14 = new ka(((ek) this).field_Q * 2, ((ek) this).field_l);
          ad.a(-126, var14);
          var5 = ((ek) this).field_l >> -1470091423;
          var6 = 0;
          L0: while (true) {
            if (((ek) this).field_l <= var6) {
              ie.b((byte) -9);
              return var14;
            } else {
              L1: {
                var7 = (-1 + ((ek) this).field_Q * 2) * (var6 >> 1564667041) % (2 * ((ek) this).field_Q);
                var8 = 16711935 & param2;
                var9 = param2 & 65280;
                var10 = -var5 + var6;
                var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
                if (var11 < 256) {
                  stackOut_6_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> -380065176;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var9 | var8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                qg.b(var7, var6, ((ek) this).field_Q, var12);
                var9 = param1 & 65280;
                qg.b(var7 - ((ek) this).field_Q * 2, var6, ((ek) this).field_Q, var12);
                var8 = 16711935 & param1;
                if (256 <= var11) {
                  stackOut_9_0 = var9 | var8;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 1494184168;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              qg.b(var7 - -((ek) this).field_Q, var6, ((ek) this).field_Q, var12);
              qg.b(var7 - ((ek) this).field_Q, var6, ((ek) this).field_Q, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    ek(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> -566463711, (param6 & 16711422) >> -1632517951);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new k(8, 0, 4, 1);
        field_K = new int[8192];
        field_P = false;
    }
}
