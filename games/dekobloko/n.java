/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static String field_d;
    static String field_a;
    static String field_b;

    public static void b(int param0) {
        if (param0 != 128) {
          field_d = (String) null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, cc param1, mm param2, int param3, int param4, cc param5, int param6, mm param7, int param8, int param9, cc param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            lk.a(param7, true, param2, param8);
            var21_int = 80 % ((param12 - -81) / 39);
            s.a(param6, param20, (byte) -91, param0, param16);
            pj.a(31004, param15, param14);
            ci.a(param10, param13, param4, (byte) -63, param11, param5);
            gk.a(param19, param18, (byte) -75, param1);
            wf.a(param17, param3, param9, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("n.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
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
            if (f.field_r != null) {
              L1: {
                L2: {
                  om.field_d = 0;
                  var2_int = param0.getKeyCode();
                  if (0 > var2_int) {
                    break L2;
                  } else {
                    if (var2_int >= be.field_w.length) {
                      break L2;
                    } else {
                      var2_int = be.field_w[var2_int];
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
                if (wi.field_b < 0) {
                  break L3;
                } else {
                  if ((var2_int ^ -1) > -1) {
                    break L3;
                  } else {
                    la.field_h[wi.field_b] = var2_int;
                    wi.field_b = wi.field_b - -1 & 127;
                    if (wi.field_b != rc.field_a) {
                      break L3;
                    } else {
                      wi.field_b = -1;
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = jh.field_e + 1 & 127;
                  if (var3 != sf.field_B) {
                    pf.field_i[jh.field_e] = var2_int;
                    bl.field_Z[jh.field_e] = (char)0;
                    jh.field_e = var3;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              var3 = param0.getModifiers();
              if ((var3 & 10) != 0) {
                param0.consume();
                return;
              } else {
                if (var2_int == 85) {
                  param0.consume();
                  return;
                } else {
                  if (var2_int != 10) {
                    break L0;
                  } else {
                    param0.consume();
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("n.keyPressed(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (null != f.field_r) {
                wi.field_b = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "n.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (f.field_r != null) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int) {
                    if (!(!he.a(-97, (char) var2_int))) {
                        var3 = 1 + jh.field_e & 127;
                        if (!(var3 == sf.field_B)) {
                            pf.field_i[jh.field_e] = -1;
                            bl.field_Z[jh.field_e] = (char)var2_int;
                            jh.field_e = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "n.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

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
              if (f.field_r == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    om.field_d = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int >= be.field_w.length) {
                        break L3;
                      } else {
                        var2_int = be.field_w[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (wi.field_b < 0) {
                  break L1;
                } else {
                  if (var2_int < 0) {
                    break L1;
                  } else {
                    la.field_h[wi.field_b] = var2_int ^ -1;
                    wi.field_b = 127 & wi.field_b - -1;
                    if (rc.field_a == wi.field_b) {
                      wi.field_b = -1;
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
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("n.keyReleased(");

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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 != -74) {
            n.a((byte) -95);
            return (int)(1000000000L / ul.field_g);
        }
        return (int)(1000000000L / ul.field_g);
    }

    final static void a(int param0) {
        int var1;
        int var2;
        var2 = client.field_A ? 1 : 0;
        ed.field_d = null;
        if (param0 == 1) {
          mg.field_Nb = false;
          if (!vb.field_Z) {
            var1 = bb.field_e;
            if (0 >= var1) {
              cl.field_r.n(-127);
              em.a(-1199770620);
              return;
            } else {
              if (var1 == 1) {
                ed.field_d = aa.field_d;
                ed.field_d = db.a(new CharSequence[]{(CharSequence) ((Object) ed.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) hf.field_b)}, -62);
                cl.field_r.n(-127);
                em.a(-1199770620);
                return;
              } else {
                ed.field_d = cm.a((byte) 87, jc.field_e, new String[]{Integer.toString(var1)});
                ed.field_d = db.a(new CharSequence[]{(CharSequence) ((Object) ed.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) hf.field_b)}, -62);
                cl.field_r.n(-127);
                em.a(-1199770620);
                return;
              }
            }
          } else {
            cl.field_r.o(4210752);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < param2) {
                var3_int = param1;
                param1 = param2;
                param2 = var3_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 37) {
                break L2;
              } else {
                n.b(77);
                break L2;
              }
            }
            L3: while (true) {
              if (param2 == 0) {
                stackIn_9_0 = param1;
                break L0;
              } else {
                var3_int = param1 % param2;
                param1 = param2;
                param2 = var3_int;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "n.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_d = "Day";
        field_a = "Total: ";
    }
}
