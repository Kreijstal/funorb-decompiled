/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends gg {
    static String field_Z;
    static oj field_V;
    private int field_W;
    static int field_P;
    private int field_X;
    private int field_ab;
    static int field_O;
    private int field_T;
    static km field_R;
    private int field_U;
    private int field_S;
    static boolean[] field_Y;
    static int[] field_Q;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                var2 = param1.getDocumentBase().getFile();
                if (param0 != -11670) {
                    field_V = null;
                }
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!(0 > var3)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(og.a(param0 ^ 11669, param1, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_R = null;
        int var1 = -67 % ((-62 - param0) / 53);
        field_V = null;
        field_Z = null;
        field_Q = null;
        field_Y = null;
    }

    final static void f(byte param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        sg.field_j = 0;
        mj.field_z = 0;
        wl.field_a = null;
        co.field_f.a(false);
        bd.field_c.a(false);
        wb var1 = oa.field_h.a(true);
        int var2 = 57 / ((35 - param0) / 36);
        while (var1 != null) {
            var1.c(100);
            var1 = oa.field_h.b(-1);
        }
        var1 = ie.field_a.a(true);
        while (var1 != null) {
            var1.c(91);
            var1 = ie.field_a.b(-1);
        }
        oa.field_q = 0;
    }

    dc(je param0, int param1, int param2) {
        super(param0, param1, param2);
        ((dc) this).field_ab = 0;
        ((dc) this).field_T = 0;
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = Virogrid.field_F ? 1 : 0;
          df.a(6 + param2, param0 - -35, ((dc) this).field_g - 12, ((dc) this).field_m + -40, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param0;
          if (param1 > 8) {
            break L0;
          } else {
            boolean discarded$1 = ((dc) this).a((byte) -48);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var5 = 194;
            var4 = 22;
            var7 = 0;
            var8 = 35 + param0;
            L2: while (true) {
              if (var4 <= var7) {
                ed.field_d.d(-90 + ((dc) this).field_g + param2, param0 + 10);
                mb.a(-10 + ((dc) this).field_g, (byte) -117, qm.field_Kb, param2 - -5, 35 + param0);
                mb.a(((dc) this).field_g, (byte) -117, qg.field_j, param2, param0 - -((dc) this).field_m - 22);
                var4 = ((dc) this).field_m - 79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = param0 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << 1895828744 | var9 << 317127568);
                    df.b(param2, var8, 6, var9);
                    df.b(((dc) this).field_g + param2 - 6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 1619799824 | var9 << -424595384);
                df.b(param2, var8, 6, var9);
                df.b(((dc) this).field_g + (param2 - 6), var8, 6, var9);
                var8++;
                var7++;
                continue L2;
              }
            }
          } else {
            if (var8 >= df.field_g) {
              if (var8 < df.field_h) {
                L4: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = ((dc) this).field_g;
                  if ((var7 ^ -1) >= -21) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (20 - var7) * (20 + -var7) - -((-var10 + 20) * (20 + -var10));
                        if (-463 <= var12) {
                          if (-421 > var12) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 917519984 | var13 << -1904019064);
                            df.field_d[param2 + df.field_e * var8 + var10] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if ((var7 ^ -1) < -21) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (20 - var7) - -(var13 * var13);
                          if (462 >= var14) {
                            if ((var14 ^ -1) <= -421) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << -1900814232 | var15 << -606833808);
                              df.field_d[var8 * df.field_e - -param2 - -var11] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = var11 + 1;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -1504501360 | var9 << 1959742024);
                df.b(param2 + var10, var8, -var10 + var11, var9);
                var8++;
                var7++;
                continue L1;
              } else {
                var8++;
                var7++;
                continue L1;
              }
            } else {
              var8++;
              var7++;
              continue L1;
            }
          }
        }
    }

    boolean a(byte param0) {
        ((dc) this).j(-4236);
        int var2 = -82 / ((50 - param0) / 33);
        return super.a((byte) 102);
    }

    void i(int param0) {
        if (param0 < 43) {
            field_Z = null;
        }
    }

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if ((((dc) this).field_T ^ -1) < -1) {
            var2 = ((dc) this).field_X;
            var3 = ((dc) this).field_S;
            ((dc) this).field_ab = ((dc) this).field_ab + 1;
            if (((dc) this).field_ab + 1 < ((dc) this).field_T) {
                var4 = ((dc) this).field_ab * (2 * ((dc) this).field_T - ((dc) this).field_ab);
                var5 = ((dc) this).field_T * ((dc) this).field_T;
                var3 = ((dc) this).field_W + (-((dc) this).field_W + ((dc) this).field_S) * var4 / var5;
                var2 = ((dc) this).field_U - -((((dc) this).field_X + -((dc) this).field_U) * var4 / var5);
            } else {
                ((dc) this).field_T = 0;
                ((dc) this).i(90);
            }
            ((dc) this).c(var3, 109, var2);
        }
        if (param0 != 3) {
            Object var6 = null;
            dc.a(119, (java.applet.Applet) null);
        }
        return super.f(3);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 < param2)) {
            ((dc) this).c(param0, 108, param3);
            return;
        }
        ((dc) this).field_S = param0;
        ((dc) this).field_W = ((dc) this).field_m;
        ((dc) this).field_U = ((dc) this).field_g;
        ((dc) this).field_ab = param1;
        ((dc) this).field_X = param3;
        ((dc) this).field_T = param2;
    }

    void j(int param0) {
        if ((((dc) this).field_T ^ -1) >= -1) {
            return;
        }
        ((dc) this).c(((dc) this).field_S, 124, ((dc) this).field_X);
        if (param0 != -4236) {
            return;
        }
        ((dc) this).field_T = 0;
        ((dc) this).i(77);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Add friend";
        field_Y = new boolean[112];
        field_Q = new int[8192];
    }
}
