/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends hb {
    static bb field_nb;
    static ak field_mb;
    static int field_ob;
    static ak field_pb;

    final void c(ng param0, int param1) {
        super.c(param0, -128);
        if (param1 >= -111) {
            field_pb = null;
        }
    }

    final static String a(int param0, String param1, int param2) {
        if (param0 == 1) {
          return sd.a(bg.field_f, param2 + 17311, new String[1]);
        } else {
          if (param0 != 2) {
            if ((param0 ^ -1) != -4) {
              if ((param0 ^ -1) != -5) {
                if ((param0 ^ -1) == -6) {
                  return sd.a(ll.field_p, 38, new String[1]);
                } else {
                  if (param0 != 6) {
                    if ((param0 ^ -1) != -8) {
                      if (param0 != -9) {
                        if (-12 == param0) {
                          return sd.a(vg.field_e, param2 ^ -17208, new String[1]);
                        } else {
                          if ((param0 ^ -1) != -13) {
                            if (param2 == -17279) {
                              if (13 == param0) {
                                return sd.a(un.field_c, 118, new String[1]);
                              } else {
                                return null;
                              }
                            } else {
                              field_mb = null;
                              if (13 == param0) {
                                return sd.a(un.field_c, 118, new String[1]);
                              } else {
                                return null;
                              }
                            }
                          } else {
                            return sd.a(li.field_j, 59, new String[1]);
                          }
                        }
                      } else {
                        return sd.a(an.field_d, param2 ^ -17206, new String[1]);
                      }
                    } else {
                      return sd.a(wi.field_e, 41, new String[1]);
                    }
                  } else {
                    return sd.a(kc.field_n, 123, new String[1]);
                  }
                }
              } else {
                return sd.a(rp.field_b, 85, new String[1]);
              }
            } else {
              return sd.a(gg.field_v, param2 + 17298, new String[1]);
            }
          } else {
            return sd.a(cf.field_w, param2 + 17402, new String[1]);
          }
        }
    }

    on(kn param0, ng param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void g(byte param0) {
        field_mb = null;
        if (param0 <= 60) {
            field_pb = null;
            field_pb = null;
            field_nb = null;
            return;
        }
        field_pb = null;
        field_nb = null;
    }

    final static ld a(byte[] param0, int param1) {
        ld var2 = null;
        Object var3 = null;
        if (param0 != null) {
          var2 = new ld(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, fl.field_g, wo.field_f);
          re.b(140);
          if (param1 <= 25) {
            var3 = null;
            ld discarded$2 = on.a((byte[]) null, -110);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, java.awt.Color param2, int param3, String param4) {
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
                        var9 = ec.field_u.getGraphics();
                        if (a.field_L == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        a.field_L = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, uo.field_i, wp.field_c);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param2 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == jg.field_K) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        jg.field_K = ec.field_u.createImage(304, 34);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = jg.field_K.getGraphics();
                        var10.setColor(param2);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param3 * 3, 30);
                        if (param0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_ob = -85;
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
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param3 + 2, 2, -(param3 * 3) + 300, 30);
                        var10.setFont(a.field_L);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(jg.field_K, uo.field_i / 2 + -152, wp.field_c / 2 + -18, (java.awt.image.ImageObserver) null);
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = uo.field_i / 2 - 152;
                        var8 = -18 + wp.field_c / 2;
                        var9.setColor(param2);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, var8 - -2, 3 * param3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, var8 + 1, 301, 31);
                        var9.fillRect(3 * param3 + var7 + 2, 2 + var8, 300 - param3 * 3, 30);
                        var9.setFont(a.field_L);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param4, (304 - param4.length() * 6) / 2 + var7, 22 + var8);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == tg.field_h) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9.setFont(a.field_L);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(tg.field_h, uo.field_i / 2 - tg.field_h.length() * 6 / 2, -26 + wp.field_c / 2);
                        return;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    ec.field_u.repaint();
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new bb();
    }
}
