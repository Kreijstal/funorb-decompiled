/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_h;
    static String field_g;
    static String field_a;
    static String field_f;
    static boolean field_c;
    static km field_b;
    static String field_e;
    static int field_d;

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
            if (w.field_L != null) {
              ch.field_f = -1;
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

            stackIn_6_1 = new StringBuilder().append("ld.focusLost(");

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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(byte param0, int param1, boolean param2, String param3, String param4, String param5, int param6) {
        uh var7 = null;
        RuntimeException var7_ref = null;
        uh var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new uh(param3);
              var8 = new uh(param4);
              if (param0 == 2) {
                break L1;
              } else {
                field_c = false;
                break L1;
              }
            }
            stackIn_3_0 = wh.a(param6, param2, param1, true, param5, var7, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("ld.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
        ij.field_k = new km(0L, (km) null);
        if (ql.field_d) {
          ij.field_k.a(0, qd.field_f);
          ij.field_k.a(0, ij.field_m);
          dd.field_b = new jm(fj.field_a, ij.field_k);
          fd.field_y = new km(0L, (km) null);
          fd.field_y.a(0, dd.field_b.field_c);
          fd.field_y.a(param0, s.field_b);
          id.b(param0 + -105);
          return;
        } else {
          ij.field_k.a(0, ij.field_m);
          dd.field_b = new jm(fj.field_a, ij.field_k);
          fd.field_y = new km(0L, (km) null);
          fd.field_y.a(0, dd.field_b.field_c);
          fd.field_y.a(param0, s.field_b);
          id.b(param0 + -105);
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (w.field_L != null) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && hc.a((char) var2_int, -1)) {
                    var3 = 127 & hh.field_e + 1;
                    if (var3 != ph.field_h) {
                        cj.field_o[hh.field_e] = -1;
                        hg.field_q[hh.field_e] = (char)var2_int;
                        hh.field_e = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ld.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 64 / ((15 - param0) / 44);
        field_g = null;
        field_h = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != w.field_L) {
                L2: {
                  L3: {
                    um.field_Fb = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int < wd.field_c.length) {
                        var2_int = -129 & wd.field_c[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (ch.field_f < 0) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    ab.field_H[ch.field_f] = var2_int ^ -1;
                    ch.field_f = ch.field_f - -1 & 127;
                    if (ch.field_f == bf.field_i) {
                      ch.field_f = -1;
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
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("ld.keyReleased(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, wg param3) {
        try {
            if (param0 != -1) {
                ld.a((byte) -63);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ld.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (w.field_L == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    um.field_Fb = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (wd.field_c.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = wd.field_c[var2_int];
                        if (-1 == (128 & var2_int ^ -1)) {
                          break L2;
                        } else {
                          var2_int = -1;
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (ch.field_f < 0) {
                    break L4;
                  } else {
                    if (0 > var2_int) {
                      break L4;
                    } else {
                      ab.field_H[ch.field_f] = var2_int;
                      ch.field_f = 1 + ch.field_f & 127;
                      if (bf.field_i != ch.field_f) {
                        break L4;
                      } else {
                        ch.field_f = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 1 + hh.field_e & 127;
                    if (ph.field_h != var3) {
                      cj.field_o[hh.field_e] = var2_int;
                      hg.field_q[hh.field_e] = (char)0;
                      hh.field_e = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    break L6;
                  } else {
                    if ((var2_int ^ -1) == -86) {
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
            runtimeException = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (runtimeException);

            stackIn_23_1 = new StringBuilder().append("ld.keyPressed(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_h = new int[8192];
        field_f = "3D";
        field_a = "Encouraging rule breaking";
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
