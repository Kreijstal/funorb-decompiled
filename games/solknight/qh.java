/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sf field_b;
    static int field_c;
    static String field_d;
    static String field_e;
    static int[] field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == i.field_J)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0) {
                    if (var2_int != 65535) {
                        if (hi.a((char) var2_int, (byte) 70)) {
                            var3 = 127 & rh.field_e + 1;
                            if (var3 != pf.field_a) {
                                lb.field_V[rh.field_e] = -1;
                                r.field_g[rh.field_e] = (char)var2_int;
                                rh.field_e = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "qh.keyTyped(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static ff[] a(int param0) {
        if (param0 > -63) {
          field_b = null;
          return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
        } else {
          return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (null != i.field_J) {
                L2: {
                  L3: {
                    lf.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int < sg.field_b.length) {
                        var2_int = -129 & sg.field_b[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (fg.field_b < 0) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    ci.field_qb[fg.field_b] = ~var2_int;
                    fg.field_b = 127 & fg.field_b + 1;
                    if (fg.field_b == qd.field_d) {
                      fg.field_b = -1;
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
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("qh.keyReleased(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
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
            L1: {
              if (i.field_J == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    lf.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (sg.field_b.length > var2_int) {
                        var2_int = sg.field_b[var2_int];
                        if ((128 & var2_int) == 0) {
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
                  if (fg.field_b < 0) {
                    break L4;
                  } else {
                    if (var2_int >= 0) {
                      ci.field_qb[fg.field_b] = var2_int;
                      fg.field_b = fg.field_b + 1 & 127;
                      if (qd.field_d != fg.field_b) {
                        break L4;
                      } else {
                        fg.field_b = -1;
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
                    var3 = 127 & 1 + rh.field_e;
                    if (var3 == pf.field_a) {
                      break L5;
                    } else {
                      lb.field_V[rh.field_e] = var2_int;
                      r.field_g[rh.field_e] = ' ';
                      rh.field_e = var3;
                      break L5;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2_int) {
                    param0.consume();
                    return;
                  } else {
                    if (var2_int != 10) {
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
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("qh.keyPressed(");
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
          throw fc.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final static java.awt.Container a(byte param0) {
        if (!(null == oc.field_a)) {
            return (java.awt.Container) (Object) oc.field_a;
        }
        return (java.awt.Container) (Object) ia.g(95);
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (null != i.field_J) {
              fg.field_b = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qh.focusLost(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L1: {
            var4 += 2;
            if (param2) {
              var4++;
              break L1;
            } else {
              break L1;
            }
          }
          return ua.field_M[var4];
        } else {
          L2: {
            if (param2) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return ua.field_M[var4];
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please enter your age in years";
        field_d = "Your email address is used to identify this account";
        field_a = new int[]{100, 200, 350, 500, 700, 900, 1150, 1300};
    }
}
