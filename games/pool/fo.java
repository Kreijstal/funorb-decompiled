/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_a;
    static int[][][] field_c;
    static String field_d;
    static int[] field_e;
    static int[] field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (wn.field_a != null) {
                L2: {
                  L3: {
                    ti.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int >= el.field_H.length) {
                        break L3;
                      } else {
                        var2_int = el.field_H[var2_int];
                        if (-1 == (var2_int & 128 ^ -1)) {
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
                  if (qq.field_xb < 0) {
                    break L4;
                  } else {
                    if (-1 >= (var2_int ^ -1)) {
                      field_b[qq.field_xb] = var2_int;
                      qq.field_xb = 1 + qq.field_xb & 127;
                      if (qq.field_xb != jq.field_g) {
                        break L4;
                      } else {
                        qq.field_xb = -1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (0 > var2_int) {
                    break L5;
                  } else {
                    var3 = op.field_h + 1 & 127;
                    if (var3 == bl.field_s) {
                      break L5;
                    } else {
                      ee.field_b[op.field_h] = var2_int;
                      ek.field_c[op.field_h] = (char)0;
                      op.field_h = var3;
                      break L5;
                    }
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    break L6;
                  } else {
                    if (-86 == (var2_int ^ -1)) {
                      break L6;
                    } else {
                      if ((var2_int ^ -1) != -11) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              } else {
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

            stackIn_23_1 = new StringBuilder().append("fo.keyPressed(");

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
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (sf.field_y < 10) {
                L2: {
                  var3_int = 0;
                  if (he.field_c) {
                    he.field_c = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                vc.a(var3_int != 0, 30, df.a((byte) 84), cm.field_H, tj.i(19535));
                break L1;
              } else {
                if (u.a(108)) {
                  if (fk.field_ab == 0) {
                    di.a(param1, (byte) 109, false);
                    fe.a(0, 0, (byte) -65, param2);
                    break L1;
                  } else {
                    vc.a(true, param2);
                    break L1;
                  }
                } else {
                  qh.d();
                  er.a(240, false, 320);
                  fe.a(0, 0, (byte) -89, param2);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -55) {
                break L3;
              } else {
                field_d = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("fo.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
        field_c = (int[][][]) null;
        field_e = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != wn.field_a) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int) {
                    if (!(!kn.a((byte) 112, (char) var2_int))) {
                        var3 = 1 + op.field_h & 127;
                        if (bl.field_s != var3) {
                            ee.field_b[op.field_h] = -1;
                            ek.field_c[op.field_h] = (char)var2_int;
                            op.field_h = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fo.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
              if (null == wn.field_a) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ti.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (el.field_H.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = el.field_H[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((qq.field_xb ^ -1) > -1) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    field_b[qq.field_xb] = var2_int ^ -1;
                    qq.field_xb = 127 & 1 + qq.field_xb;
                    if (qq.field_xb != jq.field_g) {
                      break L1;
                    } else {
                      qq.field_xb = -1;
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
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("fo.keyReleased(");

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
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static qb a(byte param0) {
        int var2 = 77 % ((20 - param0) / 41);
        qb var1 = new qb(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], v.field_b[0], ma.field_h);
        sh.h(-1);
        return var1;
    }

    final static void a(String param0, float param1, boolean param2) {
        try {
            if (param2) {
                fo.a((String) null, 0.6310321688652039f, false);
            }
            am.field_n = param0;
            kk.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fo.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
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
              if (wn.field_a == null) {
                break L1;
              } else {
                qq.field_xb = -1;
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

            stackIn_5_1 = new StringBuilder().append("fo.focusLost(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_d = "Find opponent";
            field_e = new int[256];
            field_b = new int[128];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_e[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> -149349503;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
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
