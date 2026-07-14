/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_c;
    static vg field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(th.field_g == null)) {
            dj.field_e = -1;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == th.field_g) {
            break L0;
          } else {
            L1: {
              L2: {
                eb.field_F = 0;
                var2 = param0.getKeyCode();
                if (var2 < 0) {
                  break L2;
                } else {
                  if (var2 < lf.field_a.length) {
                    var2 = lf.field_a[var2];
                    if (-1 != (128 & var2 ^ -1)) {
                      var2 = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if (0 > dj.field_e) {
                break L3;
              } else {
                if (var2 < 0) {
                  break L3;
                } else {
                  sj.field_g[dj.field_e] = var2;
                  dj.field_e = dj.field_e + 1 & 127;
                  if (vl.field_h == dj.field_e) {
                    dj.field_e = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (var2 >= 0) {
                var3 = 1 + u.field_g & 127;
                if (var3 == r.field_V) {
                  break L4;
                } else {
                  ll.field_b[u.field_g] = var2;
                  ah.field_E[u.field_g] = (char)0;
                  u.field_g = var3;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var3 = param0.getModifiers();
            if ((var3 & 10) != 0) {
              param0.consume();
              break L0;
            } else {
              if ((var2 ^ -1) == -86) {
                param0.consume();
                break L0;
              } else {
                if (10 != var2) {
                  break L0;
                } else {
                  param0.consume();
                  break L0;
                }
              }
            }
          }
        }
    }

    final static void a(he param0, boolean param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = Terraphoenix.field_V;
          if (!param1) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (param0.field_g != null) {
          var3_int = 0;
          L1: while (true) {
            L2: {
              if ((var3_int ^ -1) <= -51) {
                break L2;
              } else {
                if (null == param0.field_g.peekEvent()) {
                  break L2;
                } else {
                  gi.a((byte) -78, 1L);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param2 != null) {
                  param0.field_g.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != th.field_g) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (re.a(-10152, (char) var2)) {
                        var3 = 127 & u.field_g - -1;
                        if (!(r.field_V == var3)) {
                            ll.field_b[u.field_g] = -1;
                            ah.field_E[u.field_g] = (char)var2;
                            u.field_g = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null == th.field_g) {
            break L0;
          } else {
            L1: {
              L2: {
                eb.field_F = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (lf.field_a.length > var2) {
                    var2 = -129 & lf.field_a[var2];
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if ((dj.field_e ^ -1) > -1) {
              break L0;
            } else {
              if (0 > var2) {
                break L0;
              } else {
                sj.field_g[dj.field_e] = var2 ^ -1;
                dj.field_e = 1 + dj.field_e & 127;
                if (vl.field_h != dj.field_e) {
                  break L0;
                } else {
                  dj.field_e = -1;
                  break L0;
                }
              }
            }
          }
        }
        param0.consume();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achieved";
        field_c = "Captain ";
    }
}
