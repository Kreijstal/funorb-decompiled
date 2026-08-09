/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_f;
    static int field_a;
    static int[] field_e;
    static String field_c;
    static int field_d;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != cj.field_o) {
              L1: {
                L2: {
                  mb.field_f = 0;
                  var2_int = param0.getKeyCode();
                  if (0 > var2_int) {
                    break L2;
                  } else {
                    if (pb.field_c.length <= var2_int) {
                      break L2;
                    } else {
                      var2_int = pb.field_c[var2_int];
                      if ((var2_int & 128) == 0) {
                        break L1;
                      } else {
                        var2_int = -1;
                        break L1;
                      }
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (mg.field_f < 0) {
                  break L3;
                } else {
                  if (var2_int < 0) {
                    break L3;
                  } else {
                    md.field_b[mg.field_f] = var2_int;
                    mg.field_f = mg.field_f + 1 & 127;
                    if (hb.field_f != mg.field_f) {
                      break L3;
                    } else {
                      mg.field_f = -1;
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = ri.field_V - -1 & 127;
                  if (field_d != var3) {
                    mc.field_K[ri.field_V] = var2_int;
                    tk.field_o[ri.field_V] = (char)0;
                    ri.field_V = var3;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  break L5;
                } else {
                  if (85 == var2_int) {
                    break L5;
                  } else {
                    if (10 == var2_int) {
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

            stackIn_24_1 = new StringBuilder().append("lj.keyPressed(");

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
          throw sl.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (cj.field_o == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    mb.field_f = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (pb.field_c.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = -129 & pb.field_c[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (mg.field_f ^ -1)) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    md.field_b[mg.field_f] = var2_int ^ -1;
                    mg.field_f = 1 + mg.field_f & 127;
                    if (mg.field_f == hb.field_f) {
                      mg.field_f = -1;
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
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("lj.keyReleased(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 91) {
          field_e = (int[]) null;
          field_f = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(fc param0, fc param1, int param2) {
        try {
            if (!(null == param1.field_e)) {
                param1.a(-91);
            }
            if (param2 > -124) {
                field_a = -44;
            }
            param1.field_h = param0;
            param1.field_e = param0.field_e;
            param1.field_e.field_h = param1;
            param1.field_h.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(byte param0) {
        if (param0 < 111) {
          L0: {
            lj.a(-39);
            if (r.field_i != null) {
              r.field_i.d(16777215);
              r.field_i = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (r.field_i != null) {
              r.field_i.d(16777215);
              r.field_i = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (cj.field_o != null) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && nd.a(-92, (char) var2_int)) {
                    var3 = 1 + ri.field_V & 127;
                    if (field_d != var3) {
                        mc.field_K[ri.field_V] = -1;
                        tk.field_o[ri.field_V] = (char)var2_int;
                        ri.field_V = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lj.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
            if (null != cj.field_o) {
              mg.field_f = -1;
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

            stackIn_6_1 = new StringBuilder().append("lj.focusLost(");

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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
            field_f = "You cannot play this level yet. Create a free account to store your progress. If you have an account, log in to start at any level you've reached.";
            field_e = new int[256];
            field_c = "Please send me news and updates (I can unsubscribe at any time)";
            field_d = 0;
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (8 <= var2) {
                    field_e[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (1 & var0)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 2040663841 ^ -306674912;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
