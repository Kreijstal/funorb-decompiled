/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static cd field_a;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -121) {
                break L1;
              } else {
                var4 = null;
                bi.a((byte) -69, (java.awt.Component) null);
                break L1;
              }
            }
            var3 = ci.a(param1, (byte) -79);
            if (-1 != param2.indexOf(param1)) {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (param2.indexOf(var3) == -1) {
                L2: {
                  L3: {
                    if (param2.startsWith(param1)) {
                      break L3;
                    } else {
                      if (param2.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param2.endsWith(param1)) {
                          break L3;
                        } else {
                          if (!param2.endsWith(var3)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("bi.A(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (ol.field_l == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    tb.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int >= vc.field_K.length) {
                        break L3;
                      } else {
                        var2_int = vc.field_K[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > vg.field_b) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    ji.field_e[vg.field_b] = ~var2_int;
                    vg.field_b = vg.field_b - -1 & 127;
                    if (ud.field_a == vg.field_b) {
                      vg.field_b = -1;
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
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("bi.keyReleased(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (ol.field_l != null) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int) {
                    if (var2_int != 65535) {
                        if (!(!rf.a((byte) -10, (char) var2_int))) {
                            var3 = Lexicominos.field_G + 1 & 127;
                            if (!(tj.field_h == var3)) {
                                gj.field_x[Lexicominos.field_G] = -1;
                                ok.field_q[Lexicominos.field_G] = (char)var2_int;
                                Lexicominos.field_G = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "bi.keyTyped(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) hh.field_M);
            if (param0 != 104) {
                field_a = null;
            }
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "bi.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (null == ol.field_l) {
                break L1;
              } else {
                vg.field_b = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bi.focusLost(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (ol.field_l != null) {
              L1: {
                L2: {
                  tb.field_b = 0;
                  var2_int = param0.getKeyCode();
                  if (var2_int < 0) {
                    break L2;
                  } else {
                    if (vc.field_K.length > var2_int) {
                      var2_int = vc.field_K[var2_int];
                      if (-1 == (128 & var2_int)) {
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
                if (0 > vg.field_b) {
                  break L3;
                } else {
                  if (-1 > var2_int) {
                    break L3;
                  } else {
                    ji.field_e[vg.field_b] = var2_int;
                    vg.field_b = 1 + vg.field_b & 127;
                    if (ud.field_a == vg.field_b) {
                      vg.field_b = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = 127 & 1 + Lexicominos.field_G;
                  if (tj.field_h == var3) {
                    break L4;
                  } else {
                    gj.field_x[Lexicominos.field_G] = var2_int;
                    ok.field_q[Lexicominos.field_G] = ' ';
                    Lexicominos.field_G = var3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
                  break L5;
                } else {
                  if (var2_int == 85) {
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
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("bi.keyPressed(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
    }
}
