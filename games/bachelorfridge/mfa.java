/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mfa implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static int[] field_b;

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
              if (vv.field_e == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ce.field_x = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (ru.field_d.length > var2_int) {
                        var2_int = ru.field_d[var2_int];
                        if ((var2_int & 128) == 0) {
                          break L2;
                        } else {
                          var2_int = -1;
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
                  if (gfa.field_c < 0) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) > -1) {
                      break L4;
                    } else {
                      wd.field_x[gfa.field_c] = var2_int;
                      gfa.field_c = gfa.field_c - -1 & 127;
                      if (cj.field_i != gfa.field_c) {
                        break L4;
                      } else {
                        gfa.field_c = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 <= var2_int) {
                    var3 = lma.field_x - -1 & 127;
                    if (gha.field_q != var3) {
                      aq.field_a[lma.field_x] = var2_int;
                      dla.field_i[lma.field_x] = (char)0;
                      lma.field_x = var3;
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
                  if ((var3 & 10) != 0) {
                    break L6;
                  } else {
                    if (var2_int == 85) {
                      break L6;
                    } else {
                      if (-11 == (var2_int ^ -1)) {
                        break L6;
                      } else {
                        break L1;
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

            stackIn_24_1 = new StringBuilder().append("mfa.keyPressed(");

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
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == vv.field_e) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ce.field_x = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (var2_int < ru.field_d.length) {
                        var2_int = ru.field_d[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (gfa.field_c ^ -1)) {
                  break L1;
                } else {
                  if (0 > var2_int) {
                    break L1;
                  } else {
                    wd.field_x[gfa.field_c] = var2_int ^ -1;
                    gfa.field_c = 127 & gfa.field_c + 1;
                    if (gfa.field_c == cj.field_i) {
                      gfa.field_c = -1;
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
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("mfa.keyReleased(");

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
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static kv[] a(int param0) {
        kv[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = BachelorFridge.field_y;
        if (param0 == 10583) {
          var1 = new kv[ok.field_vb];
          var2 = 0;
          L0: while (true) {
            if (var2 >= ok.field_vb) {
              al.b(-18073);
              return var1;
            } else {
              var3 = eha.field_s[var2] * lq.field_A[var2];
              var20 = baa.field_P[var2];
              if (uf.field_b[var2]) {
                var22 = cea.field_d[var2];
                var16 = new int[var3];
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var3) {
                    var1[var2] = (kv) ((Object) new pa(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], var16));
                    var2++;
                    continue L0;
                  } else {
                    var6[var7] = mp.a(dda.a(var22[var7] << 756933880, -16777216), hk.field_f[dda.a((int) var20[var7], 255)]);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var9 = new int[var3];
                var21 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= var3) {
                    var1[var2] = new kv(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], var21);
                    var2++;
                    continue L0;
                  } else {
                    var9[var6_int] = hk.field_f[dda.a(255, (int) var20[var6_int])];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return (kv[]) null;
        }
    }

    final static kg a(boolean param0, int param1, int param2, int param3, ht param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        kg var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        kg stackIn_5_0 = null;
        kg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = ts.a(param3, param4, param1, param5, 2, param2);
            var6 = var8;
            if (var8 != null) {
              var7 = new kg();
              var7.field_g = var8;
              var7.field_g.add((java.awt.Component) ((Object) var7));
              if (param0) {
                var7.setBounds(0, 0, param1, param3);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackIn_7_0 = (kg) (var7);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (kg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6_ref);

            stackIn_10_1 = new StringBuilder().append("mfa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kg) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = (int[]) null;
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
              if (null == vv.field_e) {
                break L1;
              } else {
                gfa.field_c = -1;
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

            stackIn_5_1 = new StringBuilder().append("mfa.focusLost(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(vv.field_e == null)) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && 65535 != var2_int) {
                    if (!(!cga.a(255, (char) var2_int))) {
                        var3 = lma.field_x + 1 & 127;
                        if (!(var3 == gha.field_q)) {
                            aq.field_a[lma.field_x] = -1;
                            dla.field_i[lma.field_x] = (char)var2_int;
                            lma.field_x = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mfa.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[256];
    }
}
