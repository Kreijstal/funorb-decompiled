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

    public static void c() {
        field_G = null;
        field_K = null;
        field_C = null;
    }

    final static void a() {
        da var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        eh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (eh) (Object) nh.field_cb.c((byte) -43);
            L1: while (true) {
              if (var4 == null) {
                var2 = ga.field_w.c((byte) 111);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    kk.a(6, -117);
                    var2 = ga.field_w.c(-270);
                    continue L2;
                  }
                }
              } else {
                sa.a((byte) 61, 6, var4);
                var4 = (eh) (Object) nh.field_cb.c(-270);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2_ref, "ek.C(" + -26445 + 44 + 6 + 41);
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param0 - -((ek) this).field_p;
            bc.a(((ek) this).field_l + param3, ((ek) this).field_O.field_u + param0, param3, -((ek) this).field_O.field_u + var5_int, param1 + -13469);
            var6 = param0 - ((ek) this).field_F;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  if (param1 == 13470) {
                    break L2;
                  } else {
                    ((ek) this).field_F = -127;
                    break L2;
                  }
                }
                L3: {
                  int discarded$3 = -9;
                  ie.b();
                  if (qg.field_a > ((ek) this).field_O.field_u + param0) {
                    break L3;
                  } else {
                    ad.a(-86, ((ek) this).field_E);
                    param2.g(-((ek) this).field_F, 0);
                    param2.g(-((ek) this).field_F + ((ek) this).field_Q * 2, 0);
                    ((ek) this).field_N.c(0, 0);
                    int discarded$4 = -9;
                    ie.b();
                    ((ek) this).field_E.g(param0, param3);
                    break L3;
                  }
                }
                L4: {
                  if (qg.field_c >= -((ek) this).field_O.field_u + var5_int) {
                    ad.a(param1 + -13345, ((ek) this).field_E);
                    var7 = ((ek) this).field_F + (((ek) this).field_p + -((ek) this).field_O.field_u);
                    L5: while (true) {
                      if (2 * ((ek) this).field_Q >= var7) {
                        param2.g(-var7, 0);
                        param2.g(2 * ((ek) this).field_Q - var7, 0);
                        ((ek) this).field_O.c(0, 0);
                        int discarded$5 = -9;
                        ie.b();
                        ((ek) this).field_E.g(-((ek) this).field_O.field_u + var5_int, param3);
                        break L4;
                      } else {
                        var7 = var7 - ((ek) this).field_Q * 2;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param2.g(var6, param3);
                var6 = var6 + param2.field_u;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ek.G(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    private final ka a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        int var2 = ((ek) this).field_l >> 1;
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
                qg.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        int discarded$0 = -9;
        ie.b();
        return var3;
    }

    final void b(int param0, int param1, int param2) {
        ((ek) this).field_J = param1 >> 1 & 8355711;
        ((ek) this).field_D = param1;
        if (param0 != 23927) {
            ((ek) this).field_I = 76;
        }
        ((ek) this).field_H = param2;
        ((ek) this).field_I = (16711422 & param2) >> 1;
        this.g(param0 + -23444);
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((ek) this).field_L) {
                break L1;
              } else {
                ((ek) this).field_F = ((ek) this).field_F + 1;
                if (2 * ((ek) this).field_Q >= ((ek) this).field_F) {
                  break L1;
                } else {
                  ((ek) this).field_F = ((ek) this).field_F - 2 * ((ek) this).field_Q;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 <= -97) {
                break L2;
              } else {
                ka discarded$2 = this.a(67);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ek.U(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static byte[] a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          he.a(param0, 0, var3, 0, var2_int);
          return var3;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ek.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -43 + 41);
        }
    }

    final static void h() {
        fk.a(true, 4);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            String var3 = null;
            int var4 = 0;
            String var5 = null;
            java.net.URL var6 = null;
            var2_int = -69 % ((param0 - -1) / 44);
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
        ((ek) this).field_E = new ka(((ek) this).field_l >> 1, ((ek) this).field_l);
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
            bc.a(var6 + ((ek) this).field_l, var5 + (((ek) this).field_p * ((ek) this).field_A >> 16), var6, var5 - -((ek) this).field_p, 1);
            this.a(var5, 13470, ((ek) this).field_B[1], var6);
            int discarded$0 = -9;
            ie.b();
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        var14 = new ka(((ek) this).field_Q * 2, ((ek) this).field_l);
        ad.a(-126, var14);
        var5 = ((ek) this).field_l >> 1;
        var6 = 0;
        L0: while (true) {
          if (((ek) this).field_l <= var6) {
            int discarded$1 = -9;
            ie.b();
            return var14;
          } else {
            L1: {
              var7 = (-1 + ((ek) this).field_Q * 2) * (var6 >> 1) % (2 * ((ek) this).field_Q);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              var10 = -var5 + var6;
              var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
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
              qg.b(var7, var6, ((ek) this).field_Q, var12);
              var9 = param1 & 65280;
              qg.b(var7 - ((ek) this).field_Q * 2, var6, ((ek) this).field_Q, var12);
              var8 = 16711935 & param1;
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            qg.b(var7 - -((ek) this).field_Q, var6, ((ek) this).field_Q, var12);
            qg.b(var7 - ((ek) this).field_Q, var6, ((ek) this).field_Q, var12);
            var6++;
            continue L0;
          }
        }
    }

    ek(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, (param6 & 16711422) >> 1);
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
