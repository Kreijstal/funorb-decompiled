/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    int field_h;
    String field_g;
    mf field_b;
    String field_d;
    static ad field_e;
    static String field_c;
    static int field_a;
    String field_f;

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        sq.field_c = new kb(re.field_m, rf.field_c, am.field_Zb, ad.field_l, (mh) (Object) of.field_k, tk.field_t);
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = -88 % ((param0 - 44) / 45);
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != 13) {
            return;
        }
        if (224 <= ul.field_p) {
            wp.a(1, 256);
        } else {
            var1 = ul.field_p % 32;
            wp.a(param0 ^ 12, 32 + (ul.field_p - var1));
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = kj.field_D.getGraphics();
                        if (eo.field_g != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        eo.field_g = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param3) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, to.field_b, be.field_g);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null == oj.field_r) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        oj.field_r = kj.field_D.createImage(304, 34);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = oj.field_r.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, param4, 303, 33);
                        var10.fillRect(2, 2, param2 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 + 3 * param2, 2, -(3 * param2) + 300, 30);
                        var10.setFont(eo.field_g);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                        boolean discarded$2 = var9.drawImage(oj.field_r, to.field_b / 2 - 152, be.field_g / 2 + -18, (java.awt.image.ImageObserver) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + to.field_b / 2;
                        var8 = be.field_g / 2 + -18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, param2 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                        var9.fillRect(2 + var7 + param2 * 3, var8 + 2, 300 - param2 * 3, 30);
                        var9.setFont(eo.field_g);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, var7 - -((-(param0.length() * 6) + 304) / 2), 22 + var8);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (oi.field_g != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9.setFont(eo.field_g);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(oi.field_g, to.field_b / 2 - 6 * oi.field_g.length() / 2, -26 + be.field_g / 2);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    kj.field_D.repaint();
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        ak var5 = null;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_18_1 = 0;
        String[] stackIn_24_0 = null;
        tp[] stackIn_27_0 = null;
        int stackOut_11_0;
        int stackOut_10_0;
        boolean stackOut_15_0;
        boolean stackOut_17_0;
        int stackOut_17_1;
        boolean stackOut_16_0;
        int stackOut_16_1;
        String[] stackOut_23_0;
        String[] stackOut_22_0;
        String[] stackOut_20_0;
        tp[] stackOut_26_0;
        tp[] stackOut_25_0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var4 = pe.field_o.field_w;
        var5 = var4;
        ec.field_Q = oa.field_Sb;
        ci.field_r = pe.field_o.field_p;
        eg.field_k = pe.field_o.c(124);
        cb.field_n = pe.field_o.field_n;
        sk.field_I = pe.field_o.field_w.field_k;
        fh.field_h = new String[sk.field_I];
        var2 = 0;
        L0: while (true) {
          if (var2 >= sk.field_I) {
            pi.field_o = new int[var5.field_m.length];
            var2 = 0;
            L1: while (true) {
              if (var5.field_m.length <= var2) {
                da.field_C = new int[sk.field_I];
                var2 = 0;
                L2: while (true) {
                  if (var2 >= sk.field_I) {
                    L3: {
                      if (ci.field_r) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      wk.field_p = stackIn_12_0 != 0;
                      if (eg.field_k) {
                        break L4;
                      } else {
                        var2 = 0;
                        L5: while (true) {
                          if (pi.field_o.length <= var2) {
                            break L4;
                          } else {
                            L6: {
                              stackOut_15_0 = wk.field_p;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (pe.field_o.field_k != var5.field_m[var2]) {
                                stackOut_17_0 = stackIn_17_0;
                                stackOut_17_1 = 0;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                break L6;
                              } else {
                                stackOut_16_0 = stackIn_16_0;
                                stackOut_16_1 = 1;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                break L6;
                              }
                            }
                            wk.field_p = stackIn_18_0 | stackIn_18_1 != 0;
                            var2++;
                            continue L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (ci.field_r) {
                        if (cb.field_n) {
                          stackOut_23_0 = hm.field_b;
                          stackIn_24_0 = stackOut_23_0;
                          break L7;
                        } else {
                          stackOut_22_0 = ih.field_j;
                          stackIn_24_0 = stackOut_22_0;
                          break L7;
                        }
                      } else {
                        stackOut_20_0 = ar.field_a;
                        stackIn_24_0 = stackOut_20_0;
                        break L7;
                      }
                    }
                    L8: {
                      sj.field_c = (String[]) (Object) stackIn_24_0;
                      var2 = 57 % ((-7 - param0) / 42);
                      if (sk.field_I == 2) {
                        stackOut_26_0 = me.field_a;
                        stackIn_27_0 = stackOut_26_0;
                        break L8;
                      } else {
                        stackOut_25_0 = pl.field_f;
                        stackIn_27_0 = stackOut_25_0;
                        break L8;
                      }
                    }
                    qp.field_e = (tp[]) (Object) stackIn_27_0;
                    return;
                  } else {
                    da.field_C[var2] = var5.field_l[var2].field_H;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                pi.field_o[var2] = var5.field_m[var2];
                var2++;
                continue L1;
              }
            }
          } else {
            fh.field_h[var2] = var4.field_f[var2];
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "Not yet achieved";
    }
}
