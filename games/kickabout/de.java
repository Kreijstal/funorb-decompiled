/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static void a(sj param0, sj param1) {
        try {
            gs.field_d = param0;
            gd.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "de.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -69 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        vp.field_a = 21845;
        vp.field_f = 133;
        vp.field_c = 33;
    }

    final static int a(int param0, byte param1) {
        int var2 = 33 % ((param1 - -15) / 62);
        return pc.a(param0, -524289) >> 8;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (nr.field_q != null) {
                rc.field_d = -1;
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("de.focusLost(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(nr.field_q == null)) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int) {
                    if (65535 != var2_int) {
                        if (!(!kd.a((char) var2_int, (byte) 80))) {
                            var3 = du.field_j - -1 & 127;
                            if (!(var3 == wl.field_n)) {
                                bt.field_a[du.field_j] = -1;
                                up.field_a[du.field_j] = (char)var2_int;
                                du.field_j = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "de.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var26 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1_int = fp.field_f * 6 >> 8;
              var2 = 2 * am.field_h[0].field_i;
              var3 = 3 * hl.field_e[0].field_a;
              var4 = 146 * hw.field_i >> 8;
              var5 = hw.field_i * 140 >> 8;
              if (qr.a(0, (byte) -1) >= -var2 + 896 >> 1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ig.a(0, 4620) >= 1344 - var3 >> 1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_7_0;
              if (896 - -var2 >> 1 >= qr.a(640, (byte) -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_10_0;
              if (ig.a(480, 4620) <= 1344 + var3 >> 1) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_13_0;
              var10 = b.c(-75, 448);
              var11 = go.a(672, (byte) -56);
              var12 = am.field_h[0].field_i * hw.field_i >> 8;
              var13 = hw.field_i * hl.field_e[0].field_a >> 8;
              var14 = var10 + -var12;
              var15 = -var13 + (var11 - (var13 >> 1));
              var16 = var12 * 2 + var14;
              var17 = var13 * 3 + var15;
              var18 = c.field_f[0].field_v * hw.field_i >> 8;
              var20 = 0;
              var19 = c.field_f[0].field_o * hw.field_i >> 8;
              var21 = hw.field_i * (ch.field_o.field_o + 78) >> 8;
              if (var6 == 0) {
                break L5;
              } else {
                if (var7 != 0) {
                  im.a(-12376, -var21 + var14, var15 - var5, (ut) (Object) wh.field_p);
                  im.a(-12376, var14 - var19, var15 - var18, c.field_f[0]);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                if (var7 == 0) {
                  break L6;
                } else {
                  im.a(-12376, var16, var15 - var5, (ut) (Object) tm.field_z);
                  im.a(-12376, var16, -var18 + var15, c.field_f[1]);
                  break L6;
                }
              }
            }
            var22 = 0;
            L7: while (true) {
              if (var22 >= 2) {
                var22 = 0;
                L8: while (true) {
                  if (var22 >= 3) {
                    L9: {
                      if (var6 == 0) {
                        break L9;
                      } else {
                        if (var9 == 0) {
                          break L9;
                        } else {
                          im.a(-12376, -var21 + var14, var17, (ut) (Object) bf.field_x);
                          im.a(-12376, var14 + -var19, var17, c.field_f[2]);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8 == 0) {
                        break L10;
                      } else {
                        if (var9 == 0) {
                          break L10;
                        } else {
                          im.a(-12376, var16, var17, (ut) (Object) pf.field_b);
                          im.a(-12376, var16, var17, c.field_f[3]);
                          break L10;
                        }
                      }
                    }
                    var22 = b.c(-82, -130);
                    var23 = b.c(-70, 998);
                    var24 = 0;
                    L11: while (true) {
                      if (var24 >= 8) {
                        break L0;
                      } else {
                        var25 = go.a(40 + (-22 + hn.field_f.field_v) * var24, (byte) -56);
                        im.a(-12376, var22, var25, hn.field_f);
                        im.a(-12376, var23, var25, da.field_m);
                        var24++;
                        continue L11;
                      }
                    }
                  } else {
                    L12: {
                      if (var6 != 0) {
                        im.a(-12376, -var21 + var14, var13 * var22 + var15, ch.field_o);
                        wf.a(-840618968, -var19 + var14, hl.field_e[var1_int], var22 * var13 + var15);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (var8 == 0) {
                        break L13;
                      } else {
                        im.a(-12376, var16, var13 * var22 + var15, mt.field_d);
                        wf.a(-840618968, var16 + var4, hq.field_e[var1_int], var15 + var22 * var13);
                        break L13;
                      }
                    }
                    var22++;
                    continue L8;
                  }
                }
              } else {
                L14: {
                  if (var7 == 0) {
                    break L14;
                  } else {
                    im.a(-12376, var14 - -(var12 * var22), -var5 + var15, od.field_p);
                    wf.a(-840618968, var12 * var22 + var14, am.field_h[var1_int], -var18 + var15);
                    break L14;
                  }
                }
                L15: {
                  if (var9 == 0) {
                    break L15;
                  } else {
                    im.a(-12376, var12 * var22 + var14, var17, qj.field_a);
                    wf.a(-840618968, var14 + var22 * var12, ub.field_G[var1_int], var17 - -var5);
                    break L15;
                  }
                }
                var22++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "de.A(" + 92 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == nr.field_q) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      fj.field_c = 0;
                      var2_int = param0.getKeyCode();
                      if (var2_int < 0) {
                        break L4;
                      } else {
                        if (~fb.field_Q.length >= ~var2_int) {
                          break L4;
                        } else {
                          var2_int = fb.field_Q[var2_int];
                          if ((128 & var2_int) == 0) {
                            break L3;
                          } else {
                            var2_int = -1;
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = -1;
                    break L3;
                  }
                  L5: {
                    if (rc.field_d < 0) {
                      break L5;
                    } else {
                      if (var2_int < 0) {
                        break L5;
                      } else {
                        mp.field_j[rc.field_d] = var2_int;
                        rc.field_d = 127 & 1 + rc.field_d;
                        if (~rc.field_d != ~tv.field_i) {
                          break L5;
                        } else {
                          rc.field_d = -1;
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (var2_int < 0) {
                      break L6;
                    } else {
                      var3 = 127 & du.field_j + 1;
                      if (var3 == wl.field_n) {
                        break L6;
                      } else {
                        bt.field_a[du.field_j] = var2_int;
                        up.field_a[du.field_j] = ' ';
                        du.field_j = var3;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      break L7;
                    } else {
                      if (var2_int == 85) {
                        break L7;
                      } else {
                        if (var2_int != 10) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  param0.consume();
                  break L1;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("de.keyPressed(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (nr.field_q == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    fj.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (fb.field_Q.length > var2_int) {
                        var2_int = fb.field_Q[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (rc.field_d < 0) {
                  break L1;
                } else {
                  if (var2_int < 0) {
                    break L1;
                  } else {
                    mp.field_j[rc.field_d] = ~var2_int;
                    rc.field_d = rc.field_d - -1 & 127;
                    if (rc.field_d != tv.field_i) {
                      break L1;
                    } else {
                      rc.field_d = -1;
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
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("de.keyReleased(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void b() {
        int var2 = 0;
        if (!(iu.field_i <= 0)) {
            iu.field_i = iu.field_i - 1;
            return;
        }
        int var1 = pq.field_Q.field_o + 5;
        if (vl.field_d) {
            if (-1 + pq.field_L.length > bm.field_I) {
                bm.field_I = bm.field_I + 1;
                gp.field_i = pq.field_L[bm.field_I] * var1 >> 12;
            }
        }
        if (!vl.field_d) {
            if (!(bm.field_I <= 0)) {
                bm.field_I = bm.field_I - 1;
                var2 = -1 + pq.field_L.length;
                gp.field_i = var1 - (-bm.field_I + var2) * ((var2 + -bm.field_I) * var1) / (var2 * var2);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 3902) {
            field_c = -54;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press 'Esc' at any time to take an early bath.";
        field_b = new int[74];
        field_b[23] = 4;
        field_b[17] = -2;
        field_b[37] = -2;
        field_b[18] = 2;
        field_b[7] = 2;
        field_b[21] = 4;
        field_b[16] = -2;
        field_b[22] = 2;
        field_b[9] = 7;
        field_b[33] = 7;
        field_b[8] = 4;
        field_b[32] = 7;
        field_b[38] = 2;
        field_b[19] = -2;
        field_b[35] = -2;
        field_b[26] = 7;
        field_b[28] = 2;
        field_b[20] = 2;
        field_b[25] = 7;
        field_b[30] = 4;
        field_b[36] = 2;
        field_b[24] = 4;
        field_b[29] = 4;
        field_b[27] = 7;
        field_b[34] = -2;
        field_b[39] = 4;
        field_b[31] = 7;
    }
}
