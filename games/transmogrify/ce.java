/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static kg field_b;
    static int[] field_a;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (el.field_n == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    vd.field_a = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (tj.field_w.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = tj.field_w[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (j.field_b < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= -1) {
                    se.field_p[j.field_b] = var2_int ^ -1;
                    j.field_b = 127 & j.field_b + 1;
                    if (sc.field_a != j.field_b) {
                      break L1;
                    } else {
                      j.field_b = -1;
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
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("ce.keyReleased(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 == 0) {
          L0: {
            if (-1 == tg.field_a) {
              if (ue.a(1, 0)) {
                tg.field_a = nf.field_l.d((byte) 34);
                nf.field_l.field_h = 0;
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (1 == (tg.field_a ^ -1)) {
            if (!ue.a(2, 0)) {
              return false;
            } else {
              tg.field_a = nf.field_l.a((byte) -85);
              nf.field_l.field_h = 0;
              return ue.a(tg.field_a, param0 ^ 0);
            }
          } else {
            return ue.a(tg.field_a, param0 ^ 0);
          }
        } else {
          L1: {
            ce.a((byte) 110);
            if (-1 == tg.field_a) {
              if (ue.a(1, 0)) {
                tg.field_a = nf.field_l.d((byte) 34);
                nf.field_l.field_h = 0;
                break L1;
              } else {
                return false;
              }
            } else {
              break L1;
            }
          }
          if (1 == (tg.field_a ^ -1)) {
            if (!ue.a(2, 0)) {
              return false;
            } else {
              tg.field_a = nf.field_l.a((byte) -85);
              nf.field_l.field_h = 0;
              return ue.a(tg.field_a, param0 ^ 0);
            }
          } else {
            return ue.a(tg.field_a, param0 ^ 0);
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (el.field_n != null) {
                j.field_b = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ce.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == el.field_n)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int) {
                    if (!(!el.a(-9904, (char) var2_int))) {
                        var3 = 127 & dk.field_i + 1;
                        if (!(bg.field_l == var3)) {
                            te.field_c[dk.field_i] = -1;
                            hf.field_h[dk.field_i] = (char)var2_int;
                            dk.field_i = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ce.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
            L1: {
              if (el.field_n == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    vd.field_a = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (tj.field_w.length > var2_int) {
                        var2_int = tj.field_w[var2_int];
                        if (0 != (128 & var2_int)) {
                          var2_int = -1;
                          break L2;
                        } else {
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
                  if ((j.field_b ^ -1) > -1) {
                    break L4;
                  } else {
                    if (-1 >= (var2_int ^ -1)) {
                      se.field_p[j.field_b] = var2_int;
                      j.field_b = j.field_b + 1 & 127;
                      if (j.field_b == sc.field_a) {
                        j.field_b = -1;
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
                  if (-1 >= (var2_int ^ -1)) {
                    var3 = 1 + dk.field_i & 127;
                    if (bg.field_l == var3) {
                      break L5;
                    } else {
                      te.field_c[dk.field_i] = var2_int;
                      hf.field_h[dk.field_i] = (char)0;
                      dk.field_i = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if ((var2_int ^ -1) == -86) {
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
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("ce.keyPressed(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -127) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_c = 0;
    }
}
