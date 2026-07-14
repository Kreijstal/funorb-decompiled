/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static double field_b;
    static String field_c;
    static km[][] field_d;
    static int[] field_a;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 1) {
            Object var2 = null;
            String discarded$0 = rl.a((CharSequence) null, (byte) -95);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != bj.field_cb) {
            qf.field_a = 0;
            o.field_b = param0.getX();
            cb.field_b = param0.getY();
            rc.field_d = true;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        if (param1 != -70) {
            return null;
        }
        String var2 = tf.a(37, jl.a(param0, false));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= 59) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_b = -0.663807600848664;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (lg.field_d != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) lg.field_d;
                    // monitorenter lg.field_d
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        lg.field_d = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (bj.field_cb != null) {
            nd.field_l = 0;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (bj.field_cb != null) {
            qf.field_a = 0;
            o.field_b = -1;
            cb.field_b = -1;
            rc.field_d = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != bj.field_cb) {
          qf.field_a = 0;
          ub.field_b = param0.getX();
          pd.field_Eb = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              bl.field_g = 2;
              nd.field_l = 2;
              var2 = param0.getModifiers();
              if ((4 & var2) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 == (8 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              rc.field_d = true;
              if ((16 & var2) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
              return;
            }
          } else {
            L3: {
              bl.field_g = 1;
              nd.field_l = 1;
              var2 = param0.getModifiers();
              if ((4 & var2) == 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 == (8 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              rc.field_d = true;
              if ((16 & var2) == 0) {
                break L5;
              } else {
                break L5;
              }
            }
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (bj.field_cb != null) {
          L0: {
            qf.field_a = 0;
            nd.field_l = 0;
            rc.field_d = true;
            var2 = param0.getModifiers();
            if ((var2 & 16) != 0) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != (8 & var2)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((var2 & 4) == 0) {
              break L2;
            } else {
              break L2;
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        } else {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (bj.field_cb != null) {
            qf.field_a = 0;
            o.field_b = param0.getX();
            cb.field_b = param0.getY();
            rc.field_d = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == bj.field_cb)) {
            qf.field_a = 0;
            o.field_b = param0.getX();
            cb.field_b = param0.getY();
            rc.field_d = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0.0;
        field_d = new km[2][7];
        field_c = "Name is available";
        field_a = new int[]{2};
    }
}
