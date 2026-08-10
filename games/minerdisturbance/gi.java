/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static int field_c;
    static ea field_a;

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
              if (di.field_O != null) {
                L2: {
                  L3: {
                    hb.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
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
                if ((cg.field_H ^ -1) > -1) {
                  break L1;
                } else {
                  if (-1 < (var2_int ^ -1)) {
                    break L1;
                  } else {
                    ib.field_b[cg.field_H] = var2_int ^ -1;
                    cg.field_H = 127 & 1 + cg.field_H;
                    if (dm.field_b == cg.field_H) {
                      cg.field_H = -1;
                      break L1;
                    } else {
                      break L1;
                    }
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

            stackIn_16_1 = new StringBuilder().append("gi.keyReleased(");

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
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        pi var2 = null;
        int var3 = 0;
        hf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = (hf) ((Object) kk.field_a.b(96));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 85) {
                    break L2;
                  } else {
                    gi.a(-40, 0);
                    break L2;
                  }
                }
                var2 = ag.field_b.b(param0 + -8);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ca.a(param1, 1);
                    var2 = ag.field_b.b((byte) 56);
                    continue L3;
                  }
                }
              } else {
                ag.a(var4, param1, param0 + -195);
                var4 = (hf) ((Object) kk.field_a.b((byte) 56));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "gi.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (null != di.field_O) {
                cg.field_H = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gi.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != di.field_O) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && var2_int != 65535) {
                    if (!(!bn.a(93, (char) var2_int))) {
                        var3 = 127 & 1 + qf.field_n;
                        if (var3 != dn.field_w) {
                            jk.field_ib[qf.field_n] = -1;
                            hj.field_n[qf.field_n] = (char)var2_int;
                            qf.field_n = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gi.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            if (null != di.field_O) {
              L1: {
                L2: {
                  hb.field_b = 0;
                  var2_int = param0.getKeyCode();
                  if ((var2_int ^ -1) > -1) {
                    break L2;
                  } else {
                    if (d.field_d.length <= var2_int) {
                      break L2;
                    } else {
                      var2_int = d.field_d[var2_int];
                      if ((128 & var2_int) != 0) {
                        var2_int = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (0 > cg.field_H) {
                  break L3;
                } else {
                  if (-1 < (var2_int ^ -1)) {
                    break L3;
                  } else {
                    ib.field_b[cg.field_H] = var2_int;
                    cg.field_H = 127 & cg.field_H - -1;
                    if (cg.field_H != dm.field_b) {
                      break L3;
                    } else {
                      cg.field_H = -1;
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (0 <= var2_int) {
                  var3 = qf.field_n - -1 & 127;
                  if (var3 == dn.field_w) {
                    break L4;
                  } else {
                    jk.field_ib[qf.field_n] = var2_int;
                    hj.field_n[qf.field_n] = (char)0;
                    qf.field_n = var3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  break L5;
                } else {
                  if (var2_int == 85) {
                    break L5;
                  } else {
                    if ((var2_int ^ -1) == -11) {
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
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("gi.keyPressed(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    static {
        field_b = "2x multiplier: Doubles all points. Combines with 3x muliplier to make a 6x multiplier!";
    }
}
