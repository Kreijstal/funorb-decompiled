/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc extends qf {
    static String[] field_L;
    static sc field_P;
    static ik field_O;
    private int field_T;
    private int field_M;
    private int field_K;
    static String field_S;
    private int field_Q;
    static int field_N;
    static String field_R;
    private int field_V;
    private int field_U;

    jc(j param0, int param1, int param2) {
        super(param0, param1, param2);
        ((jc) this).field_K = 0;
        ((jc) this).field_Q = 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if ((param3 ^ -1) >= -1) {
            ((jc) this).a(param2, param1, -1);
            return;
        }
        ((jc) this).field_Q = param3;
        ((jc) this).field_U = param1;
        if (param0 > -25) {
            ((jc) this).a((byte) 23, -44, -23, 60);
        }
        ((jc) this).field_V = ((jc) this).field_q;
        ((jc) this).field_T = param2;
        ((jc) this).field_K = 0;
        ((jc) this).field_M = ((jc) this).field_h;
    }

    void q(int param0) {
        if (((jc) this).field_Q <= 0) {
            return;
        }
        ((jc) this).a(((jc) this).field_T, ((jc) this).field_U, -1);
        ((jc) this).field_Q = param0;
        ((jc) this).d((byte) -120);
    }

    final static void a(int param0, byte param1, boolean param2, ff param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        L0: {
          kb.field_e[0] = pg.field_a.nextInt();
          kb.field_e[1] = pg.field_a.nextInt();
          kb.field_e[3] = (int)hb.field_b;
          gh.field_h.field_i = 0;
          kb.field_e[2] = (int)(hb.field_b >> 1353322144);
          gh.field_h.a(-246, kb.field_e[0]);
          gh.field_h.a(-246, kb.field_e[1]);
          gh.field_h.a(-246, kb.field_e[2]);
          gh.field_h.a(-246, kb.field_e[3]);
          bj.a(gh.field_h, -25);
          gh.field_h.e(param0, 26040);
          param3.a(-1, gh.field_h);
          na.field_r.field_i = 0;
          if (param2) {
            na.field_r.b(-9469, 18);
            break L0;
          } else {
            na.field_r.b(-9469, 16);
            break L0;
          }
        }
        L1: {
          var5 = -40 % ((param1 - 14) / 58);
          na.field_r.field_i = na.field_r.field_i + 2;
          var6 = na.field_r.field_i;
          na.field_r.a(-246, nf.field_c);
          na.field_r.a(wk.field_d, (byte) 98);
          var7 = 0;
          if (!dg.field_F) {
            break L1;
          } else {
            var7 = var7 | 1;
            break L1;
          }
        }
        L2: {
          if (bj.field_m) {
            var7 = var7 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param4) {
            var7 = var7 | 8;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null != ia.field_b) {
            var7 = var7 | 16;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          na.field_r.b(-9469, var7);
          var8 = bi.a((byte) 95, mk.g(-128));
          if (var8 != null) {
            break L5;
          } else {
            var8 = "";
            break L5;
          }
        }
        L6: {
          na.field_r.a(var8, 19235);
          if (null != ia.field_b) {
            na.field_r.a(744825352, ia.field_b);
            break L6;
          } else {
            break L6;
          }
        }
        lf.a(wd.field_c, (pb) (Object) na.field_r, id.field_c, (byte) -75, gh.field_h);
        na.field_r.d(na.field_r.field_i - var6, -27308);
        fe.a((byte) -75, -1);
    }

    public static void p(int param0) {
        field_S = null;
        field_P = null;
        field_O = null;
        field_L = null;
        if (param0 != 42) {
            return;
        }
        field_R = null;
    }

    void d(byte param0) {
        if (param0 > -29) {
            boolean discarded$0 = ((jc) this).o(-87);
        }
    }

    boolean o(int param0) {
        if (param0 != 928516712) {
            boolean discarded$0 = ((jc) this).o(22);
        }
        ((jc) this).q(0);
        return this.o(928516712);
    }

    final static short[] a(w param0, int param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        var4 = param0.g(param1, -1);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param0.g(4, -1);
            var6 = (short)param0.g(16, -1);
            if (var5 <= 0) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (short)(param0.g(var5, -1) + var6);
                  var7++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param2 == 21) {
              break L5;
            } else {
              jc.p(-103);
              break L5;
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    void b(int param0, byte param1, int param2) {
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
        var16 = Main.field_T;
        vj.b(param0 + 6, 35 + param2, -12 + ((jc) this).field_h, -40 + ((jc) this).field_q, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = 35 + param2;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  if (param1 == -77) {
                    break L2;
                  } else {
                    field_O = (ik) null;
                    break L2;
                  }
                }
                pb.field_k.d(-90 + (param0 + ((jc) this).field_h), 10 + param2);
                cd.a(se.field_G, ((jc) this).field_h - 10, (byte) -94, param0 + 5, param2 - -35);
                cd.a(rc.field_k, ((jc) this).field_h, (byte) -94, param0, -22 + ((jc) this).field_q + param2);
                var4 = ((jc) this).field_q + -79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -1828462168 | var9 << -1427362256);
                    vj.d(param0, var8, 6, var9);
                    vj.d(-6 + (param0 + ((jc) this).field_h), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (var6 + -var5) / var4 + var5;
                var9 = var9 | (var9 << -1551015256 | var9 << -868207952);
                vj.d(param0, var8, 6, var9);
                vj.d(((jc) this).field_h + param0 + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (vj.field_h <= var8) {
              if (var8 < vj.field_b) {
                L4: {
                  var9 = var5 + var7 * (-var5 + var6) / var4;
                  var10 = 0;
                  var11 = ((jc) this).field_h;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (20 + -var7);
                        if (-463 <= var12) {
                          if (-421 <= var12) {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 1651975912 | var13 << 343515088);
                            vj.field_j[param0 + vj.field_l * var8 - -var10] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 >= var7) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (20 - var7);
                          if (-463 <= var14) {
                            if (-421 > var14) {
                              var12 = 1 + var11;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << 710527208 | var15 << -169723984);
                              vj.field_j[param0 + (vj.field_l * var8 + var11)] = var15;
                              var13++;
                              var11++;
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
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 928516712 | var9 << 1114861680);
                vj.d(var10 - -param0, var8, var11 - var10, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (-1 <= (((jc) this).field_Q ^ -1)) {
        } else {
            var2 = ((jc) this).field_U;
            var3 = ((jc) this).field_T;
            ((jc) this).field_K = ((jc) this).field_K + 1;
            if (((jc) this).field_Q > ((jc) this).field_K + 1) {
                var4 = ((jc) this).field_K * (-((jc) this).field_K + ((jc) this).field_Q * 2);
                var5 = ((jc) this).field_Q * ((jc) this).field_Q;
                var2 = var4 * (-((jc) this).field_M + ((jc) this).field_U) / var5 + ((jc) this).field_M;
                var3 = ((jc) this).field_V + (((jc) this).field_T + -((jc) this).field_V) * var4 / var5;
            } else {
                ((jc) this).field_Q = 0;
                ((jc) this).d((byte) -117);
            }
            ((jc) this).a(var3, var2, -1);
        }
        if (!param0) {
            ((jc) this).d((byte) -65);
        }
        return this.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_L = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_N = 0;
        field_R = "Creating your account";
    }
}
