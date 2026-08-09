/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bs implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static pa[] field_b;
    static jb field_a;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (ua.field_d == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    he.field_n = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int >= so.field_d.length) {
                        break L3;
                      } else {
                        var2_int = so.field_d[var2_int];
                        if (0 != (var2_int & 128)) {
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
                  if (-1 < (fb.field_a ^ -1)) {
                    break L4;
                  } else {
                    if (-1 < (var2_int ^ -1)) {
                      break L4;
                    } else {
                      da.field_b[fb.field_a] = var2_int;
                      fb.field_a = 127 & fb.field_a + 1;
                      if (fb.field_a != gr.field_h) {
                        break L4;
                      } else {
                        fb.field_a = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 127 & 1 + nl.field_w;
                    if (var3 == ch.field_a) {
                      break L5;
                    } else {
                      ps.field_e[nl.field_w] = var2_int;
                      qb.field_o[nl.field_w] = (char)0;
                      nl.field_w = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    break L6;
                  } else {
                    if (var2_int == 85) {
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
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("bs.keyPressed(");

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
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static ll[] a(int param0, boolean param1) {
        ll[] var2;
        ll[] var3;
        var3 = new ll[9];
        var2 = var3;
        var3[4] = tn.a(param0, 64, true);
        if (param1) {
          field_b = (pa[]) null;
          return var2;
        } else {
          return var2;
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
              if (null != ua.field_d) {
                L2: {
                  L3: {
                    he.field_n = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int >= so.field_d.length) {
                        break L3;
                      } else {
                        var2_int = so.field_d[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (fb.field_a ^ -1)) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    da.field_b[fb.field_a] = var2_int ^ -1;
                    fb.field_a = fb.field_a - -1 & 127;
                    if (fb.field_a != gr.field_h) {
                      break L1;
                    } else {
                      fb.field_a = -1;
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
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("bs.keyReleased(");

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
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 127) {
            field_a = (jb) null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ua.field_d) {
                break L1;
              } else {
                fb.field_a = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bs.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param2 ^ -1) < param0) {
              if (!mg.a(param2, (byte) -20)) {
                var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var4 < var3_int) {
                    stackIn_9_0 = qg.a((byte) 119, param2, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              } else {
                stackIn_4_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> -68849632);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("bs.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_9_0;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (ua.field_d != null) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && var2_int != 65535 && mr.a((char) var2_int, 2004352972)) {
                    var3 = 1 + nl.field_w & 127;
                    if (!(var3 == ch.field_a)) {
                        ps.field_e[nl.field_w] = -1;
                        qb.field_o[nl.field_w] = (char)var2_int;
                        nl.field_w = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bs.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new jb();
    }
}
