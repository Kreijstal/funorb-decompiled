/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static String field_b;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ji.field_c == null) {
                break L1;
              } else {
                gm.field_O = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fe.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != ji.field_c) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int && ka.a((char) var2_int, 8192)) {
                    var3 = 1 + jc.field_j & 127;
                    if (var3 != rc.field_g) {
                        ac.field_f[jc.field_j] = -1;
                        na.field_a[jc.field_j] = (char)var2_int;
                        jc.field_j = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "fe.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 116) {
            field_a = 14;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            if (null != ji.field_c) {
              L1: {
                L2: {
                  dk.field_c = 0;
                  var2_int = param0.getKeyCode();
                  if (var2_int < 0) {
                    break L2;
                  } else {
                    if (d.field_d.length > var2_int) {
                      var2_int = d.field_d[var2_int];
                      if ((var2_int & 128) == 0) {
                        break L1;
                      } else {
                        var2_int = -1;
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (-1 < (gm.field_O ^ -1)) {
                  break L3;
                } else {
                  if ((var2_int ^ -1) <= -1) {
                    qk.field_f[gm.field_O] = var2_int;
                    gm.field_O = 127 & gm.field_O + 1;
                    if (b.field_l == gm.field_O) {
                      gm.field_O = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((var2_int ^ -1) <= -1) {
                  var3 = 127 & jc.field_j - -1;
                  if (rc.field_g == var3) {
                    break L4;
                  } else {
                    ac.field_f[jc.field_j] = var2_int;
                    na.field_a[jc.field_j] = (char)0;
                    jc.field_j = var3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              var3 = param0.getModifiers();
              if ((10 & var3) != 0) {
                param0.consume();
                return;
              } else {
                if (-86 == (var2_int ^ -1)) {
                  param0.consume();
                  return;
                } else {
                  if ((var2_int ^ -1) != -11) {
                    break L0;
                  } else {
                    param0.consume();
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("fe.keyPressed(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != ji.field_c) {
                L2: {
                  L3: {
                    dk.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (d.field_d.length > var2_int) {
                        var2_int = d.field_d[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (gm.field_O < 0) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    qk.field_f[gm.field_O] = var2_int ^ -1;
                    gm.field_O = gm.field_O + 1 & 127;
                    if (b.field_l != gm.field_O) {
                      break L1;
                    } else {
                      gm.field_O = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("fe.keyReleased(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_b = "Return to game";
    }
}
