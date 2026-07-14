/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static dd[] field_a;
    static mg field_c;
    static String field_e;
    static String field_f;
    static boolean[] field_d;
    static int field_b;

    final static int a(int param0, String param1, boolean param2) {
        if (param0 != 3) {
            field_c = null;
        }
        if (param2) {
            return lj.field_a.b(param1);
        }
        return pb.field_e.b(param1);
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        if (param1 < 108) {
            return;
        }
        if (em.field_g == null) {
            em.field_g = new nd(nb.field_a, rh.field_e);
            nb.field_a.b((qa) (Object) em.field_g, (byte) -35);
        }
        em.field_g.a(param0, param3, param2, -122);
        gb.c();
        kb.a(0, true);
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        fi var4_ref_fi = null;
        int var4 = 0;
        ql var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ih var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var8 = fleas.field_A ? 1 : 0;
        var10 = ae.field_a;
        if (param0 <= -94) {
          L0: {
            var2 = var10.e(false);
            var3 = var10.e(false);
            if (-1 != (var2 ^ -1)) {
              if ((var2 ^ -1) != -2) {
                ud.a("LR1: " + ak.a(true), (Throwable) null, 0);
                k.c(-28354);
                break L0;
              } else {
                var4 = var10.a(255);
                var5 = (ql) (Object) sd.field_d.c((byte) 47);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_i != var3) {
                          break L3;
                        } else {
                          if (var5.field_m == var4) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = (ql) (Object) sd.field_d.b((byte) -105);
                      continue L1;
                    }
                  }
                  if (var5 == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var5.c(-1);
                    break L0;
                  }
                }
              }
            } else {
              var4_ref_fi = (fi) (Object) lk.field_O.c((byte) 47);
              if (var4_ref_fi == null) {
                k.c(-28354);
                return;
              } else {
                L4: {
                  var5_int = -var10.field_i + pd.field_l;
                  var14 = var4_ref_fi.field_m;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5_int > var14.length << -935529886) {
                    var5_int = var14.length << -725528670;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_fi.field_p = true;
                    var4_ref_fi.c(-1);
                    break L0;
                  } else {
                    var6[var7 >> 1659577602] = var6[var7 >> 1659577602] + (var10.e(false) << sc.a(768, var7 << 1904173800));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, byte param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = ol.field_e.getGraphics();
                        if (null == ic.field_bb) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ic.field_bb = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, ki.field_a, gm.field_nb);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param4 <= -37) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_f = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (bd.field_kb != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        bd.field_kb = ol.field_e.createImage(304, 34);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = bd.field_kb.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param0, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param0 + 2, 2, 300 - param0 * 3, 30);
                        var10.setFont(ic.field_bb);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, (304 + -(6 * param2.length())) / 2, 22);
                        boolean discarded$1 = var9.drawImage(bd.field_kb, -152 + ki.field_a / 2, -18 + gm.field_nb / 2, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = ki.field_a / 2 + -152;
                        var8 = gm.field_nb / 2 - 18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, 1 + var8, 301, 31);
                        var9.fillRect(2 + (var7 - -(param0 * 3)), var8 - -2, 300 - param0 * 3, 30);
                        var9.setFont(ic.field_bb);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param2, var7 - -((304 + -(6 * param2.length())) / 2), var8 - -22);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == vi.field_b) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9.setFont(ic.field_bb);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(vi.field_b, ki.field_a / 2 - 6 * vi.field_b.length() / 2, -26 + gm.field_nb / 2);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    ol.field_e.repaint();
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_e = "Login: ";
        field_c = new mg();
        field_b = 16822275;
    }
}
