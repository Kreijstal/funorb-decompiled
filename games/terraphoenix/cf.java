/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_c;
    static vg field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (th.field_g != null) {
                dj.field_e = -1;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("cf.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == th.field_g) {
                break L1;
              } else {
                L2: {
                  L3: {
                    eb.field_F = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int < lf.field_a.length) {
                        var2_int = lf.field_a[var2_int];
                        if (-1 != (128 & var2_int ^ -1)) {
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
                  if (0 > dj.field_e) {
                    break L4;
                  } else {
                    if (var2_int < 0) {
                      break L4;
                    } else {
                      sj.field_g[dj.field_e] = var2_int;
                      dj.field_e = dj.field_e + 1 & 127;
                      if (vl.field_h == dj.field_e) {
                        dj.field_e = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 1 + u.field_g & 127;
                    if (var3 == r.field_V) {
                      break L5;
                    } else {
                      ll.field_b[u.field_g] = var2_int;
                      ah.field_E[u.field_g] = (char)0;
                      u.field_g = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  break L1;
                } else {
                  if ((var2_int ^ -1) == -86) {
                    param0.consume();
                    break L1;
                  } else {
                    if (10 != var2_int) {
                      break L1;
                    } else {
                      param0.consume();
                      break L1;
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

            stackIn_27_1 = new StringBuilder().append("cf.keyPressed(");

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
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final static void a(he param0, boolean param1, Object param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = (vg) null;
                break L1;
              }
            }
            if (param0.field_g != null) {
              var3_int = 0;
              L2: while (true) {
                L3: {
                  if ((var3_int ^ -1) <= -51) {
                    break L3;
                  } else {
                    if (null == param0.field_g.peekEvent()) {
                      break L3;
                    } else {
                      gi.a((byte) -78, 1L);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param2 != null) {
                        param0.field_g.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("cf.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != th.field_g) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && re.a(-10152, (char) var2_int)) {
                    var3 = 127 & u.field_g - -1;
                    if (!(r.field_V == var3)) {
                        ll.field_b[u.field_g] = -1;
                        ah.field_E[u.field_g] = (char)var2_int;
                        u.field_g = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "cf.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = (String) null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
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
              if (null == th.field_g) {
                break L1;
              } else {
                L2: {
                  L3: {
                    eb.field_F = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (lf.field_a.length > var2_int) {
                        var2_int = -129 & lf.field_a[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((dj.field_e ^ -1) > -1) {
                  break L1;
                } else {
                  if (0 > var2_int) {
                    break L1;
                  } else {
                    sj.field_g[dj.field_e] = var2_int ^ -1;
                    dj.field_e = 1 + dj.field_e & 127;
                    if (vl.field_h != dj.field_e) {
                      break L1;
                    } else {
                      dj.field_e = -1;
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

            stackIn_14_1 = new StringBuilder().append("cf.keyReleased(");

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
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_b = "Achieved";
        field_c = "Captain ";
    }
}
