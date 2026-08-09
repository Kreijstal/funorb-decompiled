/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rrb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static llb field_b;

    final static void a(byte param0) {
        int var1 = 56 / ((0 - param0) / 50);
    }

    final static int a(int param0, int param1) {
        if (param0 != 22433) {
          field_b = (llb) null;
          return -4096 + (4096 ^ param1 & 8191);
        } else {
          return -4096 + (4096 ^ param1 & 8191);
        }
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
              if (null != gha.field_q) {
                L2: {
                  L3: {
                    baa.field_q = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (ee.field_o.length > var2_int) {
                        var2_int = ee.field_o[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (dh.field_p ^ -1)) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    kq.field_o[dh.field_p] = var2_int ^ -1;
                    dh.field_p = 127 & 1 + dh.field_p;
                    if (wlb.field_p != dh.field_p) {
                      break L1;
                    } else {
                      dh.field_p = -1;
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

            stackIn_16_1 = new StringBuilder().append("rrb.keyReleased(");

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
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != gha.field_q) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && var2_int != 65535) {
                    if (!(!mia.a((char) var2_int, true))) {
                        var3 = tna.field_o + 1 & 127;
                        if (!(var3 == bva.field_c)) {
                            npa.field_a[tna.field_o] = -1;
                            gca.field_q[tna.field_o] = (char)var2_int;
                            tna.field_o = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rrb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
            L1: {
              if (null == gha.field_q) {
                break L1;
              } else {
                L2: {
                  L3: {
                    baa.field_q = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (ee.field_o.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = ee.field_o[var2_int];
                        if ((128 & var2_int) != 0) {
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
                  if (dh.field_p < 0) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) > -1) {
                      break L4;
                    } else {
                      kq.field_o[dh.field_p] = var2_int;
                      dh.field_p = dh.field_p + 1 & 127;
                      if (dh.field_p == wlb.field_p) {
                        dh.field_p = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 <= var2_int) {
                    var3 = 127 & 1 + tna.field_o;
                    if (var3 == bva.field_c) {
                      break L5;
                    } else {
                      npa.field_a[tna.field_o] = var2_int;
                      gca.field_q[tna.field_o] = (char)0;
                      tna.field_o = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    break L6;
                  } else {
                    if (85 == var2_int) {
                      break L6;
                    } else {
                      if (-11 == (var2_int ^ -1)) {
                        break L6;
                      } else {
                        return;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("rrb.keyPressed(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final static abb b(int param0) {
        if (param0 >= -37) {
            field_a = 79;
            return (abb) ((Object) new tgb());
        }
        return (abb) ((Object) new tgb());
    }

    final static int a(byte param0, int param1, int param2, int param3, String param4) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 23) {
                break L1;
              } else {
                rrb.a(115);
                break L1;
              }
            }
            if (!li.field_i) {
              stackIn_6_0 = ita.a(param2, 7988).b(param4, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = de.a(param2, 300).a(param3, param4, true, (aja[]) null);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("rrb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
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
            if (null != gha.field_q) {
              dh.field_p = -1;
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

            stackIn_6_1 = new StringBuilder().append("rrb.focusLost(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -1) {
            rrb.b(-72);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = 40;
    }
}
