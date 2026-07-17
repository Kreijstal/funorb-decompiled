/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static bd field_h;
    static String field_a;
    static int field_l;
    static String field_e;
    static bd field_d;
    static int field_c;
    static String field_k;
    static bd field_j;
    static bd field_f;
    static String field_g;
    static bd field_i;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
              if (null == nj.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ae.field_s = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (var2_int < vc.field_i.length) {
                        var2_int = -129 & vc.field_i[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > uc.field_b) {
                  break L1;
                } else {
                  if (var2_int < 0) {
                    break L1;
                  } else {
                    al.field_W[uc.field_b] = ~var2_int;
                    uc.field_b = uc.field_b + 1 & 127;
                    if (md.field_o == uc.field_b) {
                      uc.field_b = -1;
                      break L1;
                    } else {
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
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("jg.keyReleased(");
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
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
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
              if (null == nj.field_c) {
                break L1;
              } else {
                uc.field_b = -1;
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
            stackOut_3_1 = new StringBuilder().append("jg.focusLost(");
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
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (null == nj.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ae.field_s = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (vc.field_i.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = vc.field_i[var2_int];
                        if ((var2_int & 128) != 0) {
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
                  if (uc.field_b < 0) {
                    break L4;
                  } else {
                    if (0 > var2_int) {
                      break L4;
                    } else {
                      al.field_W[uc.field_b] = var2_int;
                      uc.field_b = 127 & 1 + uc.field_b;
                      if (~uc.field_b == ~md.field_o) {
                        uc.field_b = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 127 & 1 + oa.field_a;
                    if (~var3 == ~ee.field_e) {
                      break L5;
                    } else {
                      cm.field_a[oa.field_a] = var2_int;
                      pe.field_db[oa.field_a] = ' ';
                      oa.field_a = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (var2_int == 85) {
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
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("jg.keyPressed(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == nj.field_c)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0) {
                    if (65535 != var2_int) {
                        if (j.a(false, (char) var2_int)) {
                            var3 = 1 + oa.field_a & 127;
                            if (!(ee.field_e == var3)) {
                                cm.field_a[oa.field_a] = -1;
                                pe.field_db[oa.field_a] = (char)var2_int;
                                oa.field_a = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "jg.keyTyped(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = im.field_e.a(ri.field_n, 8799, true, mf.field_b);
            im.field_e.e((byte) 114);
            L1: while (true) {
              if (!jn.e((byte) -79)) {
                if (dn.field_a == -1) {
                  var1_int = -20 / ((param0 - -42) / 36);
                  if (!eh.field_e) {
                    if (ti.field_b == ki.field_f) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      if (c.field_a.d((byte) -112)) {
                        if (ti.field_b != od.field_I) {
                          stackOut_20_0 = -1;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          stackOut_18_0 = 2;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  } else {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  var1_int = dn.field_a;
                  g.a((byte) 122, -1);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$13 = im.field_e.a(pj.field_e, aj.field_e, 80);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "jg.B(" + param0 + 41);
        }
        return stackIn_21_0;
    }

    final static ue a(int param0, byte param1, fd param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ue var7 = null;
        java.awt.Frame var8 = null;
        ue stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ue stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = g.a(param4, param3, (byte) 30, param2, 0, param0);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new ue();
                var7.field_i = var8;
                java.awt.Component discarded$8 = var7.field_i.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param0, param4);
                if (param1 < -32) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (ue) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("jg.C(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + 0 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 > -98) {
            field_e = null;
            hn.field_b = param1;
            qh.field_s = param2;
            return;
        }
        hn.field_b = param1;
        qh.field_s = param2;
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_k = null;
        int var1 = 0;
        field_a = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_j = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Login: ";
        field_e = "Open in popup window";
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_k = "Destroy the reactor to stop more spawn entering the base, then get back to the lift.";
        field_a = "Charges planted: ";
    }
}
