/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static int field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == sj.field_d) {
                break L1;
              } else {
                L2: {
                  L3: {
                    mh.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int < mi.field_c.length) {
                        var2_int = mi.field_c[var2_int];
                        if (0 == (var2_int & 128)) {
                          break L2;
                        } else {
                          var2_int = -1;
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (-1 < (bg.field_rb ^ -1)) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) <= -1) {
                      oc.field_h[bg.field_rb] = var2_int;
                      bg.field_rb = 1 + bg.field_rb & 127;
                      if (field_b == bg.field_rb) {
                        bg.field_rb = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) <= -1) {
                    var3 = 1 + sa.field_b & 127;
                    if (ab.field_t == var3) {
                      break L5;
                    } else {
                      db.field_c[sa.field_b] = var2_int;
                      e.field_b[sa.field_b] = (char)0;
                      sa.field_b = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    param0.consume();
                    return;
                  } else {
                    if (-11 != (var2_int ^ -1)) {
                      break L1;
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("be.keyPressed(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
            if (sj.field_d != null) {
              bg.field_rb = -1;
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

            stackIn_6_1 = new StringBuilder().append("be.focusLost(");

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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (sj.field_d == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    mh.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (mi.field_c.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = -129 & mi.field_c[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (bg.field_rb < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= -1) {
                    oc.field_h[bg.field_rb] = var2_int ^ -1;
                    bg.field_rb = bg.field_rb + 1 & 127;
                    if (field_b == bg.field_rb) {
                      bg.field_rb = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("be.keyReleased(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(sj.field_d == null)) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && 65535 != var2_int) {
                    if (!(!cg.a(111, (char) var2_int))) {
                        var3 = sa.field_b - -1 & 127;
                        if (var3 != ab.field_t) {
                            db.field_c[sa.field_b] = -1;
                            e.field_b[sa.field_b] = (char)var2_int;
                            sa.field_b = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        ti.field_c = gf.field_h[param1];
        oe.field_d = ri.field_a[param1];
        int var2 = -109 / ((-56 - param0) / 40);
        fg.field_j = dg.field_I[param1];
    }

    static {
        field_b = 0;
    }
}
