/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static boolean field_b;
    static String field_f;
    static el field_a;
    static int field_d;
    static String field_e;
    static hl field_c;
    static int field_g;

    final static void a(int param0, int param1, int param2, int param3) {
        tb.field_j.field_t = 0;
        tb.field_j.a(12, false);
        tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
        tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
        tb.field_j.a(param3, false);
        tb.field_j.a(param0, false);
        tb.field_j.b(param2, false);
        tb.field_j.a(ki.field_c, jg.field_c, -25035);
        nd.field_Lb.f(18, (byte) -92);
        int fieldTemp$0 = nd.field_Lb.field_t + 1;
        nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
        int var4 = fieldTemp$0;
        nd.field_Lb.a(param1, param1 + 128, tb.field_j.field_u, tb.field_j.field_t);
        nd.field_Lb.b(-var4 + nd.field_Lb.field_t, -2);
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        int var1 = -12 % ((0 - param0) / 63);
        field_a = null;
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
            if (vi.field_a != null) {
              mh.field_b = -1;
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

            stackIn_6_1 = new StringBuilder().append("qe.focusLost(");

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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(int param0, int param1, long param2) {
        bc var4 = nd.field_Lb;
        var4.f(param1, (byte) -92);
        var4.field_t = var4.field_t + 1;
        int var5 = var4.field_t;
        int var6 = 16 % ((param0 - -59) / 54);
        var4.a(7, false);
        var4.a(-1, param2);
        var4.b(var4.field_t + -var5, -2);
    }

    final static void a(int param0) {
        dh.field_q = em.b(param0 ^ param0);
        mf.field_s = new pk();
        jd.a((byte) -96, true, true);
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
              if (vi.field_a == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    wk.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (ci.field_y.length > var2_int) {
                        var2_int = ci.field_y[var2_int];
                        if ((128 & var2_int) != 0) {
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
                  if (mh.field_b < 0) {
                    break L4;
                  } else {
                    if (-1 < (var2_int ^ -1)) {
                      break L4;
                    } else {
                      ah.field_g[mh.field_b] = var2_int;
                      mh.field_b = mh.field_b + 1 & 127;
                      if (s.field_d == mh.field_b) {
                        mh.field_b = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 127 & eh.field_n - -1;
                    if (var3 == dh.field_m) {
                      break L5;
                    } else {
                      af.field_e[eh.field_n] = var2_int;
                      fm.field_c[eh.field_n] = (char)0;
                      eh.field_n = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  return;
                } else {
                  if ((var2_int ^ -1) == -86) {
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
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("qe.keyPressed(");

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
          throw oi.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
              if (vi.field_a != null) {
                L2: {
                  L3: {
                    wk.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (ci.field_y.length > var2_int) {
                        var2_int = -129 & ci.field_y[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > mh.field_b) {
                  break L1;
                } else {
                  if (-1 < (var2_int ^ -1)) {
                    break L1;
                  } else {
                    ah.field_g[mh.field_b] = var2_int ^ -1;
                    mh.field_b = 127 & mh.field_b - -1;
                    if (s.field_d == mh.field_b) {
                      mh.field_b = -1;
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

            stackIn_16_1 = new StringBuilder().append("qe.keyReleased(");

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
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == vi.field_a)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535) {
                    if (!(!le.a(128, (char) var2_int))) {
                        var3 = 127 & 1 + eh.field_n;
                        if (!(dh.field_m == var3)) {
                            af.field_e[eh.field_n] = -1;
                            fm.field_c[eh.field_n] = (char)var2_int;
                            eh.field_n = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "qe.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_f = "This game option has not yet been unlocked for use.";
        field_e = "<%0>'s game";
    }
}
