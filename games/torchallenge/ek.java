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
        da var2 = null;
        int var3 = 0;
        eh var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (eh) ((Object) nh.field_cb.c((byte) -43));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == -26445) {
                    break L2;
                  } else {
                    field_G = (eg) null;
                    break L2;
                  }
                }
                var2 = ga.field_w.c((byte) 111);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    kk.a(param1, -117);
                    var2 = ga.field_w.c(-270);
                    continue L3;
                  }
                }
              } else {
                sa.a((byte) 61, param1, var4);
                var4 = (eh) ((Object) nh.field_cb.c(param0 + 26175));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "ek.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 100) {
            this.field_D = 71;
        }
        super.a((byte) 108, param1, param2, param3, param4);
        this.g(483);
    }

    private final void a(int param0, int param1, ka param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param0 - -this.field_p;
            bc.a(this.field_l + param3, this.field_O.field_u + param0, param3, -this.field_O.field_u + var5_int, param1 + -13469);
            var6 = param0 - this.field_F;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  if (param1 == 13470) {
                    break L2;
                  } else {
                    this.field_F = -127;
                    break L2;
                  }
                }
                L3: {
                  ie.b((byte) -9);
                  if (qg.field_a > this.field_O.field_u + param0) {
                    break L3;
                  } else {
                    ad.a(-86, this.field_E);
                    param2.g(-this.field_F, 0);
                    param2.g(-this.field_F + this.field_Q * 2, 0);
                    this.field_N.c(0, 0);
                    ie.b((byte) -9);
                    this.field_E.g(param0, param3);
                    break L3;
                  }
                }
                L4: {
                  if (qg.field_c >= -this.field_O.field_u + var5_int) {
                    ad.a(param1 + -13345, this.field_E);
                    var7 = this.field_F + (this.field_p + -this.field_O.field_u);
                    L5: while (true) {
                      if (2 * this.field_Q >= var7) {
                        param2.g(-var7, 0);
                        param2.g(2 * this.field_Q - var7, 0);
                        this.field_O.c(0, 0);
                        ie.b((byte) -9);
                        this.field_E.g(-this.field_O.field_u + var5_int, param3);
                        break L4;
                      } else {
                        var7 = var7 - this.field_Q * 2;
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
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("ek.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    private final ka a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        int var2 = this.field_l >> -955961631;
        ka var3 = new ka(var2, this.field_l);
        ad.a(param0 + 120, var3);
        if (param0 != 1) {
            this.field_O = (ka) null;
        }
        for (var4 = 0; var4 < this.field_l; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_l));
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
        this.field_J = param1 >> 944131425 & 8355711;
        this.field_D = param1;
        if (param0 != 23927) {
            this.field_I = 76;
        }
        this.field_H = param2;
        this.field_I = (16711422 & param2) >> 846436609;
        this.g(param0 + -23444);
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        ka discarded$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_L) {
                break L1;
              } else {
                this.field_F = this.field_F + 1;
                if (2 * this.field_Q >= this.field_F) {
                  break L1;
                } else {
                  this.field_F = this.field_F - 2 * this.field_Q;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 <= -97) {
                break L2;
              } else {
                discarded$1 = this.a(67);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ek.U(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            he.a(param0, 0, var3, 0, var2_int);
            if (param1 < -37) {
              stackIn_4_0 = (byte[]) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ek.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void h(int param0) {
        if (param0 != 1) {
            field_C = (k) null;
        }
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
        this.field_B = new ka[]{this.a(false, this.field_H, this.field_D), this.a(false, this.field_I, this.field_J)};
        this.field_O = this.a(param0 ^ 482);
        this.field_N = this.field_O.i();
        if (param0 != 483) {
            ka var3 = (ka) null;
            this.a(-14, 14, (ka) null, 57);
        }
        this.field_E = new ka(this.field_l >> -394628223, this.field_l);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (0 != param3) {
            return;
        }
        int var5 = param1 - -this.field_m;
        int var6 = param0 + this.field_i;
        if (param2) {
            return;
        }
        this.a(var5, 13470, this.field_B[0], var6);
        if (this.field_A < 65536) {
            bc.a(var6 + this.field_l, var5 + (this.field_p * this.field_A >> 1116179760), var6, var5 - -this.field_p, 1);
            this.a(var5, 13470, this.field_B[1], var6);
            ie.b((byte) -9);
        }
    }

    private ek(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_J = param7;
        this.field_Q = param4;
        this.field_D = param5;
        this.field_H = param6;
        this.field_I = param8;
        this.a((byte) 127, param0, param3, param2, param1);
    }

    private final ka a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
            return (ka) null;
        }
        ka var14 = new ka(this.field_Q * 2, this.field_l);
        ad.a(-126, var14);
        int var5 = this.field_l >> -1470091423;
        for (var6 = 0; this.field_l > var6; var6++) {
            var7 = (-1 + this.field_Q * 2) * (var6 >> 1564667041) % (2 * this.field_Q);
            var8 = 16711935 & param2;
            var9 = param2 & 65280;
            var10 = -var5 + var6;
            var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
            var12 = var11 >= 256 ? var9 | var8 : (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> -380065176;
            qg.b(var7, var6, this.field_Q, var12);
            var9 = param1 & 65280;
            qg.b(var7 - this.field_Q * 2, var6, this.field_Q, var12);
            var8 = 16711935 & param1;
            var12 = 256 > var11 ? (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 1494184168 : var9 | var8;
            qg.b(var7 - -this.field_Q, var6, this.field_Q, var12);
            qg.b(var7 - this.field_Q, var6, this.field_Q, var12);
        }
        ie.b((byte) -9);
        return var14;
    }

    ek(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> -566463711, (param6 & 16711422) >> -1632517951);
    }

    static {
        field_C = new k(8, 0, 4, 1);
        field_K = new int[8192];
        field_P = false;
    }
}
