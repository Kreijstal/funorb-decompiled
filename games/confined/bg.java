/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static pf field_b;
    static int field_f;
    static e field_g;
    static jb field_a;
    static kc field_d;
    static nf field_c;

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 == 175) {
          if (160 != param1) {
            if (param1 != 32) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          bg.a(-126, 'ﾻ');
          if (160 != param1) {
            if (param1 != 32) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != tf.field_p) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && nd.a((char) var2_int, (byte) -18)) {
                    var3 = oe.field_W - -1 & 127;
                    if (!(ic.field_b == var3)) {
                        ke.field_P[oe.field_W] = -1;
                        mk.field_n[oe.field_W] = (char)var2_int;
                        oe.field_W = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 12398) {
            return 114;
        }
        return (int)(1000000000L / ij.field_u);
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
            L1: {
              if (null == tf.field_p) {
                break L1;
              } else {
                L2: {
                  L3: {
                    cg.field_d = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (tj.field_z.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = tj.field_z[var2_int];
                        if (0 != (128 & var2_int)) {
                          var2_int = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (ab.field_a < 0) {
                    break L4;
                  } else {
                    if (-1 >= (var2_int ^ -1)) {
                      on.field_f[ab.field_a] = var2_int;
                      ab.field_a = 127 & 1 + ab.field_a;
                      if (ab.field_a == mi.field_g) {
                        ab.field_a = -1;
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
                  if (var2_int < 0) {
                    break L5;
                  } else {
                    var3 = 127 & 1 + oe.field_W;
                    if (ic.field_b == var3) {
                      break L5;
                    } else {
                      ke.field_P[oe.field_W] = var2_int;
                      mk.field_n[oe.field_W] = (char)0;
                      oe.field_W = var3;
                      break L5;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    param0.consume();
                    return;
                  } else {
                    if (10 != var2_int) {
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
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("bg.keyPressed(");

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
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (tf.field_p == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    cg.field_d = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (tj.field_z.length > var2_int) {
                        var2_int = tj.field_z[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (ab.field_a ^ -1)) {
                  break L1;
                } else {
                  if (0 > var2_int) {
                    break L1;
                  } else {
                    on.field_f[ab.field_a] = var2_int ^ -1;
                    ab.field_a = 1 + ab.field_a & 127;
                    if (mi.field_g != ab.field_a) {
                      break L1;
                    } else {
                      ab.field_a = -1;
                      break L1;
                    }
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("bg.keyReleased(");

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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 >= -45) {
          bg.a(104, '');
          field_e = null;
          field_c = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_g = null;
          field_b = null;
          return;
        }
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
              if (null == tf.field_p) {
                break L1;
              } else {
                ab.field_a = -1;
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

            stackIn_5_1 = new StringBuilder().append("bg.focusLost(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_e = "Invalid password.";
        field_g = new e(12, 0, 1, 0);
        field_c = new nf(270, 70);
    }
}
