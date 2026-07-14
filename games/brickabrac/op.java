/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static boolean field_a;

    final static String a(int param0, boolean param1, String param2) {
        int var5 = 0;
        int var6 = 0;
        mp var7 = null;
        mp var8 = null;
        pi var9 = null;
        CharSequence var10 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        var10 = (CharSequence) (Object) param2;
        if (tk.a(var10, param1)) {
          if (-3 == (wk.field_m ^ -1)) {
            var8 = pf.a(param1, param2);
            if (var8 == null) {
              return rd.a(ka.field_C, new String[1], (byte) 103);
            } else {
              nm discarded$1 = bf.field_N.a((byte) 107, (nm) (Object) var8);
              L0: while (true) {
                var7 = (mp) (Object) bf.field_N.a((byte) 116);
                if (var7 == null) {
                  var8.b((byte) 111);
                  var8.d(3);
                  ol.field_w = ol.field_w - 1;
                  var9 = k.field_h;
                  var9.e(-13413, param0);
                  var9.field_l = var9.field_l + 1;
                  var5 = var9.field_l;
                  var9.a(-13, 1);
                  var9.a(param2, -1);
                  var9.d((byte) 118, -var5 + var9.field_l);
                  return null;
                } else {
                  var7.field_Sb = var7.field_Sb - 1;
                  continue L0;
                }
              }
            }
          } else {
            return hj.field_Ub;
          }
        } else {
          return om.field_Xb;
        }
    }

    final static void a(int param0, jp[] param1, int param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_11_0;
        int stackOut_10_0;
        int stackOut_14_0;
        int stackOut_13_0;
        int stackOut_17_0;
        int stackOut_16_0;
        int stackOut_20_0;
        int stackOut_19_0;
        var23 = BrickABrac.field_J ? 1 : 0;
        if (param1 == null) {
          return;
        } else {
          if (-1 > (param2 ^ -1)) {
            L0: {
              if (param4 >= -1) {
                break L0;
              } else {
                if (-1 == param5) {
                  break L0;
                } else {
                  L1: {
                    if (null != param1[3]) {
                      stackOut_11_0 = param1[3].field_x;
                      stackIn_12_0 = stackOut_11_0;
                      break L1;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_12_0;
                    if (null == param1[5]) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L2;
                    } else {
                      stackOut_13_0 = param1[5].field_x;
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_15_0;
                    if (null == param1[1]) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L3;
                    } else {
                      stackOut_16_0 = param1[1].field_z;
                      stackIn_18_0 = stackOut_16_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_18_0;
                    if (null == param1[7]) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L4;
                    } else {
                      stackOut_19_0 = param1[7].field_z;
                      stackIn_21_0 = stackOut_19_0;
                      break L4;
                    }
                  }
                  L5: {
                    var10 = stackIn_21_0;
                    var11 = param2 + param0;
                    var12 = param6 + param4;
                    var13 = var7 + param0;
                    var14 = -var8 + var11;
                    var15 = var9 + param6;
                    var16 = -var10 + var12;
                    var17 = var13;
                    var18 = var14;
                    if (var18 < var17) {
                      var18 = param0 - -(param2 * var7 / (var8 + var7));
                      var17 = param0 - -(param2 * var7 / (var8 + var7));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var19 = var15;
                    var20 = var16;
                    if (var19 <= var20) {
                      break L6;
                    } else {
                      var20 = param4 * var9 / (var9 - -var10) + param6;
                      var19 = param4 * var9 / (var9 - -var10) + param6;
                      break L6;
                    }
                  }
                  L7: {
                    lb.a(rg.field_g);
                    if (param1[0] == null) {
                      break L7;
                    } else {
                      lb.d(param0, param6, var17, var19);
                      param1[0].b(param0, param6, param5);
                      lb.b(rg.field_g);
                      break L7;
                    }
                  }
                  L8: {
                    if (null != param1[2]) {
                      lb.d(var18, param6, var11, var19);
                      param1[2].b(var14, param6, param5);
                      lb.b(rg.field_g);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (null != param1[param3]) {
                      lb.d(param0, var20, var17, var12);
                      param1[6].b(param0, var16, param5);
                      lb.b(rg.field_g);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param1[8] == null) {
                      break L10;
                    } else {
                      lb.d(var18, var20, var11, var12);
                      param1[8].b(var14, var16, param5);
                      lb.b(rg.field_g);
                      break L10;
                    }
                  }
                  L11: {
                    if (param1[1] == null) {
                      break L11;
                    } else {
                      if (param1[1].field_x != 0) {
                        lb.d(var17, param6, var18, var19);
                        var21 = var13;
                        L12: while (true) {
                          L13: {
                            if (var14 <= var21) {
                              break L13;
                            } else {
                              param1[1].b(var21, param6, param5);
                              var21 = var21 + param1[1].field_x;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          lb.b(rg.field_g);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (param1[7] == null) {
                      break L14;
                    } else {
                      if (-1 == (param1[7].field_x ^ -1)) {
                        break L14;
                      } else {
                        lb.d(var17, var20, var18, var12);
                        var21 = var13;
                        L15: while (true) {
                          L16: {
                            if (var14 <= var21) {
                              break L16;
                            } else {
                              param1[7].b(var21, var16, param5);
                              var21 = var21 + param1[7].field_x;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          lb.b(rg.field_g);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (param1[3] == null) {
                      break L17;
                    } else {
                      if (-1 != (param1[3].field_z ^ -1)) {
                        lb.d(param0, var19, var17, var20);
                        var21 = var15;
                        L18: while (true) {
                          L19: {
                            if (var21 >= var16) {
                              break L19;
                            } else {
                              param1[3].b(param0, var21, param5);
                              var21 = var21 + param1[3].field_z;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          lb.b(rg.field_g);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (param1[5] == null) {
                      break L20;
                    } else {
                      if (param1[5].field_z == 0) {
                        break L20;
                      } else {
                        lb.d(var18, var19, var11, var20);
                        var21 = var15;
                        L21: while (true) {
                          L22: {
                            if (var21 >= var16) {
                              break L22;
                            } else {
                              param1[5].b(var14, var21, param5);
                              var21 = var21 + param1[5].field_z;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          lb.b(rg.field_g);
                          break L20;
                        }
                      }
                    }
                  }
                  L23: {
                    if (null == param1[4]) {
                      break L23;
                    } else {
                      if (param1[4].field_x == 0) {
                        break L23;
                      } else {
                        if (0 == param1[4].field_z) {
                          break L23;
                        } else {
                          lb.d(var17, var19, var18, var20);
                          var21 = var15;
                          L24: while (true) {
                            L25: {
                              if (var16 <= var21) {
                                break L25;
                              } else {
                                var22 = var13;
                                L26: while (true) {
                                  L27: {
                                    if (var22 >= var14) {
                                      break L27;
                                    } else {
                                      param1[4].b(var22, var21, param5);
                                      var22 = var22 + param1[4].field_x;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var21 = var21 + param1[4].field_z;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            lb.b(rg.field_g);
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null != gp.field_c) {
            L1: {
              L2: {
                ge.field_w = 0;
                var2 = param0.getKeyCode();
                if (var2 < 0) {
                  break L2;
                } else {
                  if (tf.field_a.length > var2) {
                    var2 = -129 & tf.field_a[var2];
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if ((pl.field_d ^ -1) > -1) {
              break L0;
            } else {
              if ((var2 ^ -1) > -1) {
                break L0;
              } else {
                lo.field_b[pl.field_d] = var2 ^ -1;
                pl.field_d = 1 + pl.field_d & 127;
                if (ek.field_cb != pl.field_d) {
                  break L0;
                } else {
                  pl.field_d = -1;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        param0.consume();
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == gp.field_c) {
            break L0;
          } else {
            L1: {
              L2: {
                ge.field_w = 0;
                var2 = param0.getKeyCode();
                if (0 > var2) {
                  break L2;
                } else {
                  if (var2 >= tf.field_a.length) {
                    break L2;
                  } else {
                    var2 = tf.field_a[var2];
                    if (0 == (128 & var2)) {
                      if ((pl.field_d ^ -1) > -1) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          lo.field_b[pl.field_d] = var2;
                          pl.field_d = 127 & 1 + pl.field_d;
                          if (pl.field_d != ek.field_cb) {
                            break L1;
                          } else {
                            pl.field_d = -1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if ((pl.field_d ^ -1) > -1) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          lo.field_b[pl.field_d] = var2;
                          pl.field_d = 127 & 1 + pl.field_d;
                          if (pl.field_d != ek.field_cb) {
                            break L1;
                          } else {
                            pl.field_d = -1;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2 = -1;
              if ((pl.field_d ^ -1) > -1) {
                break L1;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L1;
                } else {
                  lo.field_b[pl.field_d] = var2;
                  pl.field_d = 127 & 1 + pl.field_d;
                  if (pl.field_d != ek.field_cb) {
                    break L1;
                  } else {
                    pl.field_d = -1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (-1 >= (var2 ^ -1)) {
                var3 = 127 & hb.field_w - -1;
                if (si.field_m == var3) {
                  break L3;
                } else {
                  ef.field_d[hb.field_w] = var2;
                  vp.field_r[hb.field_w] = (char)0;
                  hb.field_w = var3;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              var3 = param0.getModifiers();
              if ((var3 & 10) != 0) {
                break L4;
              } else {
                if (-86 == (var2 ^ -1)) {
                  break L4;
                } else {
                  if (var2 == 10) {
                    break L4;
                  } else {
                    break L0;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        }
    }

    final static void a(vc param0, int param1) {
        kp.field_d.insertElementAt((Object) (Object) param0, param1);
    }

    final static String a(boolean param0, int param1) {
        if (param0) {
            Object var3 = null;
            op.a((vc) null, -56);
        }
        return rd.a(lh.field_t, new String[1], (byte) 103).toLowerCase();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -42) {
            field_a = false;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (gp.field_c != null) {
            var2 = param0.getKeyChar();
            if (0 != var2) {
                if (var2 != 65535) {
                    if (!(!od.a((char) var2, -12))) {
                        var3 = 127 & hb.field_w - -1;
                        if (!(si.field_m == var3)) {
                            ef.field_d[hb.field_w] = -1;
                            vp.field_r[hb.field_w] = (char)var2;
                            hb.field_w = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = 0;
        if (param2 != -1) {
          return 59;
        } else {
          L0: while (true) {
            if (-1 <= (param0 ^ -1)) {
              return var3;
            } else {
              var3 = 1 & param1 | var3 << 1003380929;
              param0--;
              param1 = param1 >>> 1;
              continue L0;
            }
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (gp.field_c != null) {
            pl.field_d = -1;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Balls destroy bricks, giving you points.<br><br>The first brick a ball destroys after touching the paddle is worth 10 points, the next is worth 11, the next 12, and so on.";
    }
}
