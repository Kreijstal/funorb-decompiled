/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ae field_b;
    static String field_a;

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) rc.field_d);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) rc.field_d);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) rc.field_d);
        uh.field_i = 0;
        if (param1 != -64) {
            field_a = null;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(rc.field_d == null)) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (rc.field_d != null) {
            pg.field_g = 0;
            fb.field_j = param0.getX();
            oi.field_f = param0.getY();
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                na.field_c = 1;
                uh.field_i = 1;
            } else {
                na.field_c = 2;
                uh.field_i = 2;
            }
            var2 = param0.getModifiers();
            if ((var2 & 16) != 0) {
            }
            vj.field_Y = true;
            if ((var2 & 8) != 0) {
            }
            if ((4 & var2) == 0) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            field_a = null;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != rc.field_d) {
            pg.field_g = 0;
            uh.field_i = 0;
            vj.field_Y = true;
            var2 = param0.getModifiers();
            if ((16 & var2) == 0) {
            }
            if ((var2 & 8) == -1) {
            }
            if (-1 != (4 & var2)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static void a(int param0, rb param1, ka param2, boolean param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            va var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = StarCannon.field_A;
            var18 = new va();
            var18.field_n = param1.j(7909);
            var18.field_k = param1.f((byte) -79);
            var18.field_r = new int[var18.field_n];
            var18.field_i = new bk[var18.field_n];
            var18.field_l = new byte[var18.field_n][][];
            var18.field_g = new int[var18.field_n];
            var18.field_p = new bk[var18.field_n];
            var18.field_q = new int[var18.field_n];
            if (!param3) {
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_n) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_g[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param1.j(7909);
                        if (-1 == (var6_int ^ -1)) {
                          break L2;
                        } else {
                          if (var6_int == 1) {
                            break L2;
                          } else {
                            if (2 == var6_int) {
                              break L2;
                            } else {
                              L3: {
                                if ((var6_int ^ -1) == -4) {
                                  break L3;
                                } else {
                                  if ((var6_int ^ -1) == -5) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param1.a(-73);
                              var21 = param1.a(-114);
                              var9 = param1.j(7909);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var9 <= var11_int) {
                                  L5: {
                                    var24 = new byte[var9][];
                                    var23 = var24;
                                    var22 = var23;
                                    var19 = var22;
                                    var11 = var19;
                                    if (-4 != (var6_int ^ -1)) {
                                      break L5;
                                    } else {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var12_int >= var9) {
                                          break L5;
                                        } else {
                                          var13 = param1.f((byte) -101);
                                          var11[var12_int] = new byte[var13];
                                          param1.a(var13, (byte) 88, var24[var12_int], 0);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_r[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var17 >= var9) {
                                      var18.field_i[var5] = param2.a(oe.a(var20, false), var21, var12, 29389);
                                      var18.field_l[var5] = var24;
                                      var5++;
                                      break L1;
                                    } else {
                                      var12[var17] = oe.a(var10[var17], param3);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param1.a(-121);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param1.a(-58);
                        var16 = param1.a(-20);
                        var9 = 0;
                        if (-2 == (var6_int ^ -1)) {
                          var9 = param1.f((byte) -87);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var18.field_r[var5] = var6_int;
                      var18.field_q[var5] = var9;
                      var18.field_p[var5] = param2.a(oe.a(var15, false), -92, var16);
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_g[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_g[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != rc.field_d) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 31) {
            return true;
        }
        return ai.field_c;
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static ld a(String param0, int param1) {
        String var2 = null;
        ld var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = StarCannon.field_A;
        if (null != td.field_o) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = ni.a(114, var6);
            if (var2 == null) {
              var2 = (String) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = (ld) (Object) td.field_o.a((long)var2.hashCode(), 55);
          if (param1 >= 44) {
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_kb;
                  var4 = ni.a(117, var7);
                  if (var4 == null) {
                    var4 = var3.field_kb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3;
                } else {
                  var3 = (ld) (Object) td.field_o.b(1);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != rc.field_d) {
            pg.field_g = 0;
            hj.field_d = -1;
            wj.field_a = -1;
            vj.field_Y = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(null == rc.field_d)) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (rc.field_d != null) {
            uh.field_i = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ae();
        field_a = "Create";
    }
}
