/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static id field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == wd.field_e)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && vo.a(-125, (char) var2_int)) {
                    var3 = jt.field_s - -1 & 127;
                    if (var3 != bj.field_a) {
                        cp.field_c[jt.field_s] = -1;
                        aa.field_c[jt.field_s] = (char)var2_int;
                        jt.field_s = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "hb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            if (null != wd.field_e) {
              L1: {
                L2: {
                  kj.field_e = 0;
                  var2_int = param0.getKeyCode();
                  if (0 > var2_int) {
                    break L2;
                  } else {
                    if (var2_int < kn.field_c.length) {
                      var2_int = kn.field_c[var2_int];
                      if (0 == (128 & var2_int)) {
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
                if (lv.field_i < 0) {
                  break L3;
                } else {
                  if (-1 >= (var2_int ^ -1)) {
                    jf.field_d[lv.field_i] = var2_int;
                    lv.field_i = lv.field_i - -1 & 127;
                    if (lv.field_i != ks.field_v) {
                      break L3;
                    } else {
                      lv.field_i = -1;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = 1 + jt.field_s & 127;
                  if (var3 != bj.field_a) {
                    cp.field_c[jt.field_s] = var2_int;
                    aa.field_c[jt.field_s] = (char)0;
                    jt.field_s = var3;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              var3 = param0.getModifiers();
              if (-1 != (var3 & 10 ^ -1)) {
                param0.consume();
                return;
              } else {
                if (-86 == (var2_int ^ -1)) {
                  param0.consume();
                  return;
                } else {
                  if (10 != var2_int) {
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
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("hb.keyPressed(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final static void a(ah param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (!(!gt.field_bb)) {
            return;
        }
        try {
            var2_int = param0.field_C;
            var3 = param0.field_z;
            var4 = -param0.field_E;
            var5 = param0.field_A;
            if (param1 != -1) {
                field_a = (id) null;
            }
            var6 = 1;
            var7 = fi.a(5, he.field_o, (byte) -96);
            bj.field_b.a((ms) (new tl(var6, var7, var2_int, var3, var4, var5)), (byte) 39);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "hb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
              if (null == wd.field_e) {
                break L1;
              } else {
                L2: {
                  L3: {
                    kj.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int >= kn.field_c.length) {
                        break L3;
                      } else {
                        var2_int = -129 & kn.field_c[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((lv.field_i ^ -1) > -1) {
                  break L1;
                } else {
                  if (-1 >= (var2_int ^ -1)) {
                    jf.field_d[lv.field_i] = var2_int ^ -1;
                    lv.field_i = lv.field_i + 1 & 127;
                    if (lv.field_i == ks.field_v) {
                      lv.field_i = -1;
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

            stackIn_15_1 = new StringBuilder().append("hb.keyReleased(");

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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -2851) {
            hb.a(-38);
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
            if (null != wd.field_e) {
              lv.field_i = -1;
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

            stackIn_6_1 = new StringBuilder().append("hb.focusLost(");

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static vo a(byte param0) {
        int var1 = -91 % ((79 - param0) / 41);
        return new vo(0, 0, ks.field_x.field_g, 0, (mh) null, ks.field_x.field_f, ks.field_x.field_p, ks.field_x.field_g, ks.field_x.field_g, ks.field_x.field_a, ks.field_x.field_b, false, true, 32768, 0);
    }

    final static boolean a(cn param0, int param1, cn param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -param2.field_kb + param0.field_kb;
              if (jm.field_d != param0.field_gb) {
                if (null != param0.field_gb) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (jm.field_d == param2.field_gb) {
                var3_int += 200;
                break L2;
              } else {
                if (null == param2.field_gb) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param1 == 0) {
              L3: {
                if (var3_int <= 0) {
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("hb.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    static {
        field_a = null;
    }
}
