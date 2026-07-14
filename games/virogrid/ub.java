/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends nb {
    static byte[] field_D;
    static volatile boolean field_F;
    byte field_A;
    jc field_B;
    static dl field_E;
    int field_C;
    static qm field_z;

    public static void f(int param0) {
        field_z = null;
        field_E = null;
        int var1 = 125 % ((-84 - param0) / 36);
        field_D = null;
    }

    final byte[] b(byte param0) {
        if (param0 == 39) {
          if (!((ub) this).field_t) {
            if (((ub) this).field_B.field_l < ((ub) this).field_B.field_g.length - ((ub) this).field_A) {
              throw new RuntimeException();
            } else {
              return ((ub) this).field_B.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    final static boolean g(int param0) {
        int var1 = 117 % ((5 - param0) / 51);
        return hm.a(d.field_Gb, oc.field_n, -24236);
    }

    final static void b(int param0, int param1) {
        hg var2 = null;
        var2 = gk.field_g;
        var2.g(param0, 8);
        if (param1 != -12508) {
          return;
        } else {
          var2.a(1, -126);
          var2.a(1, -82);
          return;
        }
    }

    final int e(int param0) {
        if (param0 == 0) {
          if (((ub) this).field_B == null) {
            return 0;
          } else {
            return 100 * ((ub) this).field_B.field_l / (-((ub) this).field_A + ((ub) this).field_B.field_g.length);
          }
        } else {
          boolean discarded$5 = ub.g(-41);
          if (((ub) this).field_B == null) {
            return 0;
          } else {
            return 100 * ((ub) this).field_B.field_l / (-((ub) this).field_A + ((ub) this).field_B.field_g.length);
          }
        }
    }

    final static kg a(int param0, String param1) {
        L0: {
          if (!w.field_I.b(-106)) {
            break L0;
          } else {
            if (!param1.equals((Object) (Object) w.field_I.a(32))) {
              w.field_I = oe.a(param1, false);
              break L0;
            } else {
              if (param0 > 54) {
                return w.field_I;
              } else {
                field_D = null;
                return w.field_I;
              }
            }
          }
        }
        if (param0 <= 54) {
          field_D = null;
          return w.field_I;
        } else {
          return w.field_I;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        if (param0 != 102) {
            return;
        }
        sa.a((byte) 107, param2, param1, false);
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, int param3, int param4) {
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
                        var9 = fi.field_v.getGraphics();
                        if (null != oh.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        oh.field_c = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, fl.field_i, km.field_B);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param0 = new java.awt.Color(140, 17, 17);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null != oj.field_Gb) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        oj.field_Gb = fi.field_v.createImage(304, 34);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = oj.field_Gb.getGraphics();
                        var10.setColor(param0);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param3, 30);
                        var7 = 1 / ((param4 - -88) / 35);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
                        var10.setFont(oh.field_c);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(oj.field_Gb, fl.field_i / 2 + -152, -18 + km.field_B / 2, (java.awt.image.ImageObserver) null);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + fl.field_i / 2;
                        var8 = -18 + km.field_B / 2;
                        var9.setColor(param0);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 - -2, 3 * param3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                        var9.fillRect(2 + (var7 - -(param3 * 3)), var8 + 2, 300 + -(3 * param3), 30);
                        var9.setFont(oh.field_c);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param2, var7 + (-(param2.length() * 6) + 304) / 2, 22 + var8);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (tm.field_k == null) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9.setFont(oh.field_c);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(tm.field_k, fl.field_i / 2 + -(tm.field_k.length() * 6 / 2), -26 + km.field_B / 2);
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var5 = (Exception) (Object) caughtException;
                    fi.field_v.repaint();
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ub() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = true;
        field_E = new dl();
    }
}
