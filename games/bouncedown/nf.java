/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;

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
              if (qj.field_c == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ak.field_y = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (mb.field_o.length > var2_int) {
                        var2_int = -129 & mb.field_o[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (db.field_R < 0) {
                  break L1;
                } else {
                  if (-1 >= (var2_int ^ -1)) {
                    di.field_b[db.field_R] = var2_int ^ -1;
                    db.field_R = 127 & 1 + db.field_R;
                    if (db.field_R == rj.field_g) {
                      db.field_R = -1;
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
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("nf.keyReleased(");

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
          throw ii.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == qj.field_c)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535) {
                    if (!(!vf.a(-13891, (char) var2_int))) {
                        var3 = Bounce.field_F + 1 & 127;
                        if (!(oh.field_a == var3)) {
                            pf.field_A[Bounce.field_F] = -1;
                            fk.field_b[Bounce.field_F] = (char)var2_int;
                            Bounce.field_F = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "nf.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            if (qj.field_c != null) {
              L1: {
                L2: {
                  ak.field_y = 0;
                  var2_int = param0.getKeyCode();
                  if (0 > var2_int) {
                    break L2;
                  } else {
                    if (mb.field_o.length > var2_int) {
                      var2_int = mb.field_o[var2_int];
                      if (-1 != (var2_int & 128 ^ -1)) {
                        var2_int = -1;
                        break L1;
                      } else {
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
                if (db.field_R < 0) {
                  break L3;
                } else {
                  if ((var2_int ^ -1) > -1) {
                    break L3;
                  } else {
                    di.field_b[db.field_R] = var2_int;
                    db.field_R = 127 & db.field_R - -1;
                    if (rj.field_g == db.field_R) {
                      db.field_R = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (0 <= var2_int) {
                  var3 = Bounce.field_F - -1 & 127;
                  if (var3 == oh.field_a) {
                    break L4;
                  } else {
                    pf.field_A[Bounce.field_F] = var2_int;
                    fk.field_b[Bounce.field_F] = (char)0;
                    Bounce.field_F = var3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if (-1 != (10 & var3 ^ -1)) {
                  break L5;
                } else {
                  if (85 == var2_int) {
                    break L5;
                  } else {
                    if (var2_int == 10) {
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
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("nf.keyPressed(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -58) {
            field_b = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

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
              if (qj.field_c == null) {
                break L1;
              } else {
                db.field_R = -1;
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

            stackIn_5_1 = new StringBuilder().append("nf.focusLost(");

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
          throw ii.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_a = "Play the game without logging in just yet";
        field_b = "Two Player Battle";
    }
}
