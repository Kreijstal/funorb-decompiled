/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static void a(sj param0, sj param1, byte param2) {
        if (param2 > -68) {
            return;
        }
        gs.field_d = param0;
        gd.field_c = param1;
    }

    final static void b(int param0, byte param1) {
        if (param1 != -110) {
            return;
        }
        vp.field_a = (param0 << 922461456) / 150;
        vp.field_f = param0 * 400 / 150;
        vp.field_c = param0 * 100 / 150;
    }

    final static int a(int param0, byte param1) {
        int var2 = 33 % ((param1 - -15) / 62);
        return pc.a(param0, -524289) >> -809030872;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(nr.field_q == null)) {
            rc.field_d = -1;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(nr.field_q == null)) {
            var2 = param0.getKeyChar();
            if (0 != var2) {
                if (65535 != var2) {
                    if (!(!kd.a((char) var2, (byte) 80))) {
                        var3 = du.field_j - -1 & 127;
                        if (!(var3 == wl.field_n)) {
                            bt.field_a[du.field_j] = -1;
                            up.field_a[du.field_j] = (char)var2;
                            du.field_j = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    final static void a(byte param0) {
        int var1 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var26 = Kickabout.field_G;
          var1 = fp.field_f * 6 >> -457451640;
          var2 = 2 * am.field_h[0].field_i;
          var3 = 3 * hl.field_e[0].field_a;
          var4 = 146 * hw.field_i >> 701010632;
          var5 = hw.field_i * 140 >> 1430181160;
          if (qr.a(0, (byte) -1) >= -var2 + 896 >> -552461279) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (ig.a(0, 4620) >= 1344 - var3 >> -468273375) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_6_0;
          if (896 - -var2 >> 1117017345 >= qr.a(640, (byte) -1)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var8 = stackIn_9_0;
          if (ig.a(480, 4620) <= 1344 + var3 >> 1528069985) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var9 = stackIn_12_0;
          var10 = b.c(-75, 448);
          var11 = go.a(672, (byte) -56);
          var12 = am.field_h[0].field_i * hw.field_i >> 1782151016;
          var13 = hw.field_i * hl.field_e[0].field_a >> 1569125960;
          var14 = var10 + (-(1 * var12) + 0);
          var15 = -(1 * var13) + (var11 - (var13 >> -1707105791));
          var16 = var12 * 2 + var14;
          var17 = var13 * 3 + var15;
          var18 = c.field_f[0].field_v * hw.field_i >> 707003880;
          var20 = 84 % ((30 - param0) / 34);
          var19 = c.field_f[0].field_o * hw.field_i >> -1271150552;
          var21 = hw.field_i * (ch.field_o.field_o + 78) >> 1508309640;
          if (var6 == 0) {
            if (var8 == 0) {
              break L4;
            } else {
              im.a(-12376, var16, var15 - var5, (ut) (Object) tm.field_z);
              im.a(-12376, var16, -var18 + var15, c.field_f[1]);
              break L4;
            }
          } else {
            if (var8 == 0) {
              break L4;
            } else {
              if (var7 == 0) {
                break L4;
              } else {
                im.a(-12376, var16, var15 - var5, (ut) (Object) tm.field_z);
                im.a(-12376, var16, -var18 + var15, c.field_f[1]);
                break L4;
              }
            }
          }
        }
        var22 = 0;
        L5: while (true) {
          if ((var22 ^ -1) <= -3) {
            var22 = 0;
            L6: while (true) {
              if (-4 >= (var22 ^ -1)) {
                L7: {
                  if (var6 != 0) {
                    if (var8 != 0) {
                      if (var9 == 0) {
                        break L7;
                      } else {
                        im.a(-12376, var16, var17, (ut) (Object) pf.field_b);
                        im.a(-12376, var16, var17, c.field_f[3]);
                        break L7;
                      }
                    } else {
                      if (var8 == 0) {
                        break L7;
                      } else {
                        im.a(-12376, var16, var17, (ut) (Object) pf.field_b);
                        im.a(-12376, var16, var17, c.field_f[3]);
                        break L7;
                      }
                    }
                  } else {
                    if (var8 == 0) {
                      break L7;
                    } else {
                      if (var9 == 0) {
                        break L7;
                      } else {
                        im.a(-12376, var16, var17, (ut) (Object) pf.field_b);
                        im.a(-12376, var16, var17, c.field_f[3]);
                        break L7;
                      }
                    }
                  }
                }
                var22 = b.c(-82, -130);
                var23 = b.c(-70, 998);
                var24 = 0;
                L8: while (true) {
                  if ((var24 ^ -1) <= -9) {
                    return;
                  } else {
                    var25 = go.a(40 + (-22 + hn.field_f.field_v) * var24, (byte) -56);
                    im.a(-12376, var22, var25, hn.field_f);
                    im.a(-12376, var23, var25, da.field_m);
                    var24++;
                    continue L8;
                  }
                }
              } else {
                L9: {
                  if (var6 != 0) {
                    im.a(-12376, -var21 + var14, var13 * var22 + var15, ch.field_o);
                    wf.a(-840618968, -var19 + var14, hl.field_e[var1], var22 * var13 + var15);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (var8 != 0) {
                  im.a(-12376, var16, var13 * var22 + var15, mt.field_d);
                  wf.a(-840618968, var16 + var4, hq.field_e[var1], var15 + var22 * var13);
                  var22++;
                  continue L6;
                } else {
                  var22++;
                  continue L6;
                }
              }
            }
          } else {
            L10: {
              if (var7 == 0) {
                break L10;
              } else {
                im.a(-12376, var14 - -(var12 * var22), -var5 + var15, od.field_p);
                wf.a(-840618968, var12 * var22 + var14, am.field_h[var1], -var18 + var15);
                break L10;
              }
            }
            if (var9 != 0) {
              im.a(-12376, var12 * var22 + var14, var17, qj.field_a);
              wf.a(-840618968, var14 + var22 * var12, ub.field_G[var1], var17 - -var5);
              var22++;
              continue L5;
            } else {
              var22++;
              continue L5;
            }
          }
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == nr.field_q) {
            break L0;
          } else {
            L1: {
              L2: {
                fj.field_c = 0;
                var2 = param0.getKeyCode();
                if ((var2 ^ -1) > -1) {
                  break L2;
                } else {
                  if (fb.field_Q.length <= var2) {
                    break L2;
                  } else {
                    var2 = fb.field_Q[var2];
                    if ((128 & var2) == -1) {
                      if (-1 < (rc.field_d ^ -1)) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          mp.field_j[rc.field_d] = var2;
                          rc.field_d = 127 & 1 + rc.field_d;
                          if (rc.field_d != tv.field_i) {
                            break L1;
                          } else {
                            rc.field_d = -1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (-1 > rc.field_d) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          mp.field_j[rc.field_d] = var2;
                          rc.field_d = 127 & 1 + rc.field_d;
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
                }
              }
              var2 = -1;
              if (-1 < (rc.field_d ^ -1)) {
                break L1;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L1;
                } else {
                  mp.field_j[rc.field_d] = var2;
                  rc.field_d = 127 & 1 + rc.field_d;
                  if (rc.field_d != tv.field_i) {
                    break L1;
                  } else {
                    rc.field_d = -1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (var2 < 0) {
                break L3;
              } else {
                var3 = 127 & du.field_j + 1;
                if (var3 == wl.field_n) {
                  break L3;
                } else {
                  bt.field_a[du.field_j] = var2;
                  up.field_a[du.field_j] = (char)0;
                  du.field_j = var3;
                  break L3;
                }
              }
            }
            L4: {
              var3 = param0.getModifiers();
              if (-1 != (var3 & 10 ^ -1)) {
                break L4;
              } else {
                if (var2 == -86) {
                  break L4;
                } else {
                  if (-11 != var2) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (nr.field_q == null) {
            break L0;
          } else {
            L1: {
              L2: {
                fj.field_c = 0;
                var2 = param0.getKeyCode();
                if ((var2 ^ -1) > -1) {
                  break L2;
                } else {
                  if (fb.field_Q.length > var2) {
                    var2 = fb.field_Q[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (rc.field_d < 0) {
              break L0;
            } else {
              if ((var2 ^ -1) > -1) {
                break L0;
              } else {
                mp.field_j[rc.field_d] = var2 ^ -1;
                rc.field_d = rc.field_d - -1 & 127;
                if (rc.field_d != tv.field_i) {
                  break L0;
                } else {
                  rc.field_d = -1;
                  break L0;
                }
              }
            }
          }
        }
        param0.consume();
    }

    final static void b(int param0) {
        int var2 = 0;
        if (!((iu.field_i ^ -1) >= -1)) {
            iu.field_i = iu.field_i - 1;
            return;
        }
        if (param0 != 40) {
            field_c = -21;
        }
        int var1 = pq.field_Q.field_o + 5;
        if (vl.field_d) {
            if (-1 + pq.field_L.length > bm.field_I) {
                bm.field_I = bm.field_I + 1;
                gp.field_i = pq.field_L[bm.field_I] * var1 >> -1957990964;
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
