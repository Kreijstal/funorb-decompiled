/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dm field_a;
    static String field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (je.field_j != null) {
              L1: {
                L2: {
                  nk.field_e = 0;
                  var2_int = param0.getKeyCode();
                  if ((var2_int ^ -1) > -1) {
                    break L2;
                  } else {
                    if (oe.field_P.length <= var2_int) {
                      break L2;
                    } else {
                      var2_int = oe.field_P[var2_int];
                      if (-1 == (var2_int & 128 ^ -1)) {
                        break L1;
                      } else {
                        var2_int = -1;
                        break L1;
                      }
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (-1 < (ii.field_c ^ -1)) {
                  break L3;
                } else {
                  if (var2_int < 0) {
                    break L3;
                  } else {
                    gf.field_c[ii.field_c] = var2_int;
                    ii.field_c = 127 & 1 + ii.field_c;
                    if (gk.field_b == ii.field_c) {
                      ii.field_c = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = 127 & 1 + ba.field_c;
                  if (var3 != vd.field_n) {
                    kj.field_O[ba.field_c] = var2_int;
                    ai.field_n[ba.field_c] = (char)0;
                    ba.field_c = var3;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  break L5;
                } else {
                  if (85 == var2_int) {
                    break L5;
                  } else {
                    if (-11 == (var2_int ^ -1)) {
                      break L5;
                    } else {
                      return;
                    }
                  }
                }
              }
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("wl.keyPressed(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 31997) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(je.field_j == null)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && tc.a((byte) -112, (char) var2_int)) {
                    var3 = 1 + ba.field_c & 127;
                    if (var3 != vd.field_n) {
                        kj.field_O[ba.field_c] = -1;
                        ai.field_n[ba.field_c] = (char)var2_int;
                        ba.field_c = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wl.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (je.field_j != null) {
                L2: {
                  L3: {
                    nk.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (oe.field_P.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = oe.field_P[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (ii.field_c ^ -1)) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    gf.field_c[ii.field_c] = var2_int ^ -1;
                    ii.field_c = 1 + ii.field_c & 127;
                    if (gk.field_b == ii.field_c) {
                      ii.field_c = -1;
                      break L1;
                    } else {
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
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("wl.keyReleased(");

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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void b(int param0) {
        String var2 = (String) null;
        f.b(rh.field_i, (String) null, 7697781);
        if (param0 != -1) {
            field_a = (dm) null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != je.field_j) {
              ii.field_c = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wl.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_a = new dm(30, 30);
        field_b = "Clear bonus!";
    }
}
