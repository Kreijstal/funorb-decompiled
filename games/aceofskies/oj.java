/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends sk {
    private go[] field_h;
    private boolean field_i;
    private boolean field_f;
    static volatile int field_g;

    oj(bf param0) {
        super(param0);
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((oj) this).field_f = false;
          if (!((bf) param0).field_Pb) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (3 <= ((bf) param0).field_h) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((oj) this).field_i = stackIn_4_1 != 0;
              if (!((oj) this).field_i) {
                stackOut_6_0 = 127;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 48;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var2 = stackIn_7_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            var14 = 0;
            L3: while (true) {
              if (-65 >= var14) {
                ((oj) this).field_h = new go[3];
                ((oj) this).field_h[0] = ((oj) this).field_b.a(64, -118, false, var27);
                ((oj) this).field_h[1] = ((oj) this).field_b.a(64, 80, false, var28);
                ((oj) this).field_h[2] = ((oj) this).field_b.a(64, -69, false, var29);
                break L0;
              } else {
                var15 = 0;
                L4: while (true) {
                  if (-65 <= var15) {
                    var14++;
                    continue L3;
                  } else {
                    var11 = 2.0f * (float)var15 / 64.0f - 1.0f;
                    var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                    var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                    var11 = var11 * var13;
                    var12 = var12 * var13;
                    var16 = 0;
                    L5: while (true) {
                      if (var16 >= 6) {
                        var9++;
                        var15++;
                        continue L4;
                      } else {
                        L6: {
                          if (-1 != (var16 ^ -1)) {
                            if (var16 != 1) {
                              if ((var16 ^ -1) != -3) {
                                if (var16 != 3) {
                                  if (var16 == 4) {
                                    var10 = var13;
                                    break L6;
                                  } else {
                                    var10 = -var13;
                                    break L6;
                                  }
                                } else {
                                  var10 = -var12;
                                  break L6;
                                }
                              } else {
                                var10 = var12;
                                break L6;
                              }
                            } else {
                              var10 = var11;
                              break L6;
                            }
                          } else {
                            var10 = -var11;
                            break L6;
                          }
                        }
                        L7: {
                          if (0.0f >= var10) {
                            var6 = 0;
                            var7 = 0;
                            var8 = 0;
                            break L7;
                          } else {
                            var6 = (int)((double)var2 * Math.pow((double)var10, 96.0));
                            var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2);
                            var8 = (int)((double)var2 * Math.pow((double)var10, 12.0));
                            break L7;
                          }
                        }
                        var27[var16][var9] = var6 << -916303880;
                        var28[var16][var9] = var7 << 1237101720;
                        var29[var16][var9] = var8 << 327094392;
                        var16++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        int var4 = 0;
        jj var5 = null;
        ec var6 = null;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (param1 > 2) {
            break L0;
          } else {
            var5 = (jj) null;
            ((oj) this).a(-6, -33, (jj) null);
            break L0;
          }
        }
        L1: {
          if (null == ((oj) this).field_h) {
            ((oj) this).field_b.a(ac.field_b, 0, 0);
            break L1;
          } else {
            if (!param0) {
              ((oj) this).field_b.a(ac.field_b, 0, 0);
              break L1;
            } else {
              ((oj) this).field_b.a(1, (byte) 78);
              ((oj) this).field_b.a(rg.field_A, false);
              var6 = ((oj) this).field_b.d(12343);
              var6.a(1024, 1);
              ((oj) this).field_b.a(qn.field_a, (byte) -127);
              if (((oj) this).field_i) {
                ((oj) this).field_b.a(lo.field_j, true, bd.field_C);
                ((oj) this).field_b.a(true, 0, true, dl.field_p, false);
                ((oj) this).field_b.a(ac.field_b, 0, 0);
                ((oj) this).field_b.a(0, (byte) 40);
                ((oj) this).field_f = true;
                break L1;
              } else {
                ((oj) this).field_b.a(bd.field_C, true, ru.field_a);
                ((oj) this).field_b.a((byte) 119, 0, un.field_i);
                ((oj) this).field_b.a(2, (byte) 79);
                ((oj) this).field_b.a(lo.field_j, true, bd.field_C);
                ((oj) this).field_b.a((byte) 120, 0, un.field_i);
                ((oj) this).field_b.a(true, 1, true, un.field_i, false);
                ((oj) this).field_b.a(ac.field_b, 0, 0);
                ((oj) this).field_b.a(((oj) this).field_b.field_Kb, -9135);
                ((oj) this).field_b.a(0, (byte) 40);
                ((oj) this).field_f = true;
                break L1;
              }
            }
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 72 / ((param1 - -82) / 34);
            if (param0 < 48) {
              break L1;
            } else {
              if (param0 > 57) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, jj param2) {
        ((oj) this).field_b.a(param2, -9135);
        ((oj) this).field_b.b(param0, false);
        if (param1 <= 66) {
            ((oj) this).field_h = (go[]) null;
        }
    }

    final static int f(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!ek.a((byte) -127)) {
            if (param0 == 5) {
              L1: {
                pr.field_b.a(rc.b((byte) -113, ln.field_c, lq.field_a), rc.b((byte) -105, ic.field_b, cf.field_g), -24702);
                if (pr.field_b.e((byte) 83)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  var3 = 0;
                  if (var1 == 0) {
                    break L3;
                  } else {
                    if (pr.field_b.field_g >= 0) {
                      L4: {
                        var3 = rm.field_g[pr.field_b.field_g];
                        if (var3 == 2) {
                          break L4;
                        } else {
                          if (5 == var3) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      ld.a(param0 + 14178);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var2 == 0) {
                  break L2;
                } else {
                  if (2 == ol.field_c) {
                    break L2;
                  } else {
                    ld.a(14183);
                    break L2;
                  }
                }
              }
              L5: {
                if (-1 != var3) {
                  break L5;
                } else {
                  if (-3 != ol.field_c) {
                    break L5;
                  } else {
                    var4 = kh.a(param0 ^ -64) - rb.field_e;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (var6 <= 0) {
                      nk.a((byte) -119, 5, true);
                      var3 = 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              return var3;
            } else {
              return 65;
            }
          } else {
            L6: {
              pr.field_b.a(true);
              if (!pr.field_b.e((byte) 115)) {
                break L6;
              } else {
                var1 = 1;
                break L6;
              }
            }
            if ((bk.field_f ^ -1) != -14) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        ((oj) this).field_b.a(ru.field_a, true, bd.field_C);
        if (param0) {
            ((oj) this).a(false);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, int param3, boolean param4) {
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
                        var9 = ci.field_f.getGraphics();
                        if (null != aq.field_b) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        aq.field_b = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, td.field_b, ps.field_h);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2 == 140) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (null == qn.field_d) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qn.field_d = ci.field_f.createImage(304, 34);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = qn.field_d.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 + 3 * param3, 2, 300 - 3 * param3, 30);
                        var10.setFont(aq.field_b);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
                        boolean discarded$2 = var9.drawImage(qn.field_d, td.field_b / 2 + -152, -18 + ps.field_h / 2, (java.awt.image.ImageObserver) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = td.field_b / 2 - 152;
                        var8 = ps.field_h / 2 - 18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 - -2, 2 + var8, param3 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                        var9.fillRect(2 + (var7 - -(3 * param3)), var8 + 2, -(param3 * 3) + 300, 30);
                        var9.setFont(aq.field_b);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, (304 + -(6 * param0.length())) / 2 + var7, 22 + var8);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (qh.field_b != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9.setFont(aq.field_b);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(qh.field_b, td.field_b / 2 + -(6 * qh.field_b.length() / 2), ps.field_h / 2 - 26);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var5 = (Exception) (Object) caughtException;
                    ci.field_f.repaint();
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!((oj) this).field_f) {
            ((oj) this).field_b.a(dl.field_p, 0, 0);
        } else {
            ((oj) this).field_b.a(1, (byte) 45);
            ((oj) this).field_b.a((jj) null, -9135);
            ((oj) this).field_b.a(b.field_b, false);
            ((oj) this).field_b.f(-21041);
            if (((oj) this).field_i) {
                ((oj) this).field_b.a(ru.field_a, true, ru.field_a);
                ((oj) this).field_b.a((byte) 118, 0, dl.field_p);
                ((oj) this).field_b.a(dl.field_p, 0, 0);
            } else {
                ((oj) this).field_b.a(ru.field_a, param0, ru.field_a);
                ((oj) this).field_b.a((byte) 121, 0, dl.field_p);
                ((oj) this).field_b.a(2, (byte) 26);
                ((oj) this).field_b.a(ru.field_a, true, ru.field_a);
                ((oj) this).field_b.a((byte) 122, 0, dl.field_p);
                ((oj) this).field_b.a((byte) 121, 1, un.field_i);
                ((oj) this).field_b.a(dl.field_p, 0, 0);
                ((oj) this).field_b.a((jj) null, -9135);
            }
            ((oj) this).field_b.a(0, (byte) 103);
            ((oj) this).field_f = false;
        }
        ((oj) this).field_b.a(ru.field_a, param0, ru.field_a);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
            int discarded$0 = oj.f(-93);
        }
        if (!(!((oj) this).field_f)) {
            ((oj) this).field_b.a(1, (byte) 101);
            ((oj) this).field_b.a((jj) (Object) ((oj) this).field_h[param1 - 1], -9135);
            ((oj) this).field_b.a(0, (byte) 104);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        jr.field_u = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        jt.a(var2, var3, var4, param1, 0);
        if (param0 != 26099) {
            java.awt.Color var6 = (java.awt.Color) null;
            oj.a((String) null, (java.awt.Color) null, -128, 49, true);
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            ((oj) this).a(true, (byte) -77);
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
