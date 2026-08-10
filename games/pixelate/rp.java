/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_a;

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
              if (null != mc.field_r) {
                L2: {
                  L3: {
                    ia.field_i = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int < tn.field_j.length) {
                        var2_int = tn.field_j[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((ol.field_q ^ -1) > -1) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    qp.field_Q[ol.field_q] = var2_int ^ -1;
                    ol.field_q = ol.field_q + 1 & 127;
                    if (ol.field_q != wm.field_c) {
                      break L1;
                    } else {
                      ol.field_q = -1;
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

            stackIn_16_1 = new StringBuilder().append("rp.keyReleased(");

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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, cb param4, int param5, String param6, int param7, int param8) {
        try {
            kj.field_s = param3;
            if (param7 != -21462) {
                String var10 = (String) null;
                rp.a(117, 59, -61, 116, (cb) null, -123, (String) null, 58, -63);
            }
            fj.field_a = param0;
            bl.field_e = param6;
            ak.field_ib = param2;
            ql.field_o = param8;
            pd.field_Eb = param5;
            lk.field_n = param1;
            ef.field_e = param4;
            pm.field_h = (rf) ((Object) new wn());
            fh.field_J = new gm(param4);
            ck.field_j = new am(pm.field_h, fh.field_J);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rp.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0, tf param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (((param1.field_F | param1.field_E | param1.field_D | param1.field_y) & 3) == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = (3 & param1.field_D) + param1.field_F;
              var3 = param1.field_E + (param1.field_y & 3);
              var2_int = var2_int - -4 - (var2_int & 3);
              var3 = -(var3 & 3) - (-4 - var3);
              var4 = new int[var2_int * var3];
              var5 = 0;
              var6 = (3 & param1.field_D) - -((3 & param1.field_y) * var2_int);
              var7 = 0;
              L1: while (true) {
                if (param1.field_E <= var7) {
                  L2: {
                    if (param0 == -59) {
                      break L2;
                    } else {
                      field_a = (String) null;
                      break L2;
                    }
                  }
                  param1.field_y = param1.field_y & -4;
                  param1.field_D = param1.field_D & -4;
                  param1.field_F = var2_int;
                  param1.field_E = var3;
                  param1.field_G = var4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (param1.field_F <= var8) {
                      var6 = var6 + (var2_int - param1.field_F);
                      var7++;
                      continue L1;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$0] = param1.field_G[incrementValue$1];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("rp.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (mc.field_r != null) {
                ol.field_q = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rp.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(mc.field_r == null)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && kj.a((char) var2_int, (byte) 111)) {
                    var3 = 127 & 1 + jd.field_s;
                    if (qn.field_p != var3) {
                        gn.field_z[jd.field_s] = -1;
                        fm.field_d[jd.field_s] = (char)var2_int;
                        jd.field_s = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rp.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == mc.field_r) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ia.field_i = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (tn.field_j.length > var2_int) {
                        var2_int = tn.field_j[var2_int];
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
                  if (0 > ol.field_q) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) > -1) {
                      break L4;
                    } else {
                      qp.field_Q[ol.field_q] = var2_int;
                      ol.field_q = 127 & 1 + ol.field_q;
                      if (ol.field_q == wm.field_c) {
                        ol.field_q = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (-1 < (var2_int ^ -1)) {
                    break L5;
                  } else {
                    var3 = 127 & 1 + jd.field_s;
                    if (qn.field_p != var3) {
                      gn.field_z[jd.field_s] = var2_int;
                      fm.field_d[jd.field_s] = (char)0;
                      jd.field_s = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    param0.consume();
                    return;
                  } else {
                    if (-11 != (var2_int ^ -1)) {
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

            stackIn_27_1 = new StringBuilder().append("rp.keyPressed(");

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
          throw aa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = "Create your own free Jagex account";
        field_b = "<%0> has left the lobby.";
    }
}
