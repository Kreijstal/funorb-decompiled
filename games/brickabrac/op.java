/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static boolean field_a;

    final static String a(int param0, boolean param1, String param2) {
        nm discarded$2 = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mp var7 = null;
        mp var8 = null;
        pi var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            if (tk.a(var10, param1)) {
              if (-3 == (wk.field_m ^ -1)) {
                var8 = pf.a(param1, param2);
                if (var8 != null) {
                  discarded$2 = bf.field_N.a((byte) 107, var8);
                  L1: while (true) {
                    var7 = (mp) ((Object) bf.field_N.a((byte) 116));
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
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7.field_Sb = var7.field_Sb - 1;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_8_0 = rd.a(ka.field_C, new String[]{param2}, (byte) 103);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = hj.field_Ub;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = om.field_Xb;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("op.E(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (String) ((Object) stackIn_14_0);
            }
          }
        }
    }

    final static void a(int param0, jp[] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var23 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 <= (param2 ^ -1)) {
                  break L1;
                } else {
                  if ((param4 ^ -1) >= -1) {
                    break L1;
                  } else {
                    if (-1 == (param5 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (null != param1[3]) {
                          stackOut_11_0 = param1[3].field_x;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_12_0 = stackOut_10_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_12_0;
                        if (null == param1[5]) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = param1[5].field_x;
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_15_0;
                        if (null == param1[1]) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = param1[1].field_z;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_18_0;
                        if (null == param1[7]) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = param1[7].field_z;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_21_0;
                        var11 = param2 + param0;
                        var12 = param6 + param4;
                        var13 = var7_int + param0;
                        var14 = -var8 + var11;
                        var15 = var9 + param6;
                        var16 = -var10 + var12;
                        var17 = var13;
                        var18 = var14;
                        if (var18 < var17) {
                          var18 = param0 - -(param2 * var7_int / (var8 + var7_int));
                          var17 = param0 - -(param2 * var7_int / (var8 + var7_int));
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var19 = var15;
                        var20 = var16;
                        if (var19 <= var20) {
                          break L7;
                        } else {
                          var20 = param4 * var9 / (var9 - -var10) + param6;
                          var19 = param4 * var9 / (var9 - -var10) + param6;
                          break L7;
                        }
                      }
                      L8: {
                        lb.a(rg.field_g);
                        if (param1[0] == null) {
                          break L8;
                        } else {
                          lb.d(param0, param6, var17, var19);
                          param1[0].b(param0, param6, param5);
                          lb.b(rg.field_g);
                          break L8;
                        }
                      }
                      L9: {
                        if (null != param1[2]) {
                          lb.d(var18, param6, var11, var19);
                          param1[2].b(var14, param6, param5);
                          lb.b(rg.field_g);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param1[param3]) {
                          lb.d(param0, var20, var17, var12);
                          param1[6].b(param0, var16, param5);
                          lb.b(rg.field_g);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (param1[8] == null) {
                          break L11;
                        } else {
                          lb.d(var18, var20, var11, var12);
                          param1[8].b(var14, var16, param5);
                          lb.b(rg.field_g);
                          break L11;
                        }
                      }
                      L12: {
                        if (param1[1] == null) {
                          break L12;
                        } else {
                          if (param1[1].field_x != 0) {
                            lb.d(var17, param6, var18, var19);
                            var21 = var13;
                            L13: while (true) {
                              if (var14 <= var21) {
                                lb.b(rg.field_g);
                                break L12;
                              } else {
                                param1[1].b(var21, param6, param5);
                                var21 = var21 + param1[1].field_x;
                                continue L13;
                              }
                            }
                          } else {
                            break L12;
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
                              if (var14 <= var21) {
                                lb.b(rg.field_g);
                                break L14;
                              } else {
                                param1[7].b(var21, var16, param5);
                                var21 = var21 + param1[7].field_x;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (param1[3] == null) {
                          break L16;
                        } else {
                          if (-1 != (param1[3].field_z ^ -1)) {
                            lb.d(param0, var19, var17, var20);
                            var21 = var15;
                            L17: while (true) {
                              if (var21 >= var16) {
                                lb.b(rg.field_g);
                                break L16;
                              } else {
                                param1[3].b(param0, var21, param5);
                                var21 = var21 + param1[3].field_z;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param1[5] == null) {
                          break L18;
                        } else {
                          if (param1[5].field_z == 0) {
                            break L18;
                          } else {
                            lb.d(var18, var19, var11, var20);
                            var21 = var15;
                            L19: while (true) {
                              if (var21 >= var16) {
                                lb.b(rg.field_g);
                                break L18;
                              } else {
                                param1[5].b(var14, var21, param5);
                                var21 = var21 + param1[5].field_z;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (null == param1[4]) {
                          break L20;
                        } else {
                          if (param1[4].field_x == 0) {
                            break L20;
                          } else {
                            if (0 == param1[4].field_z) {
                              break L20;
                            } else {
                              lb.d(var17, var19, var18, var20);
                              var21 = var15;
                              L21: while (true) {
                                if (var16 <= var21) {
                                  lb.b(rg.field_g);
                                  break L20;
                                } else {
                                  var22 = var13;
                                  L22: while (true) {
                                    if (var22 >= var14) {
                                      var21 = var21 + param1[4].field_z;
                                      continue L21;
                                    } else {
                                      param1[4].b(var22, var21, param5);
                                      var22 = var22 + param1[4].field_x;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var7);
            stackOut_73_1 = new StringBuilder().append("op.C(").append(param0).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (null != gp.field_c) {
                L2: {
                  L3: {
                    ge.field_w = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (tf.field_a.length > var2_int) {
                        var2_int = -129 & tf.field_a[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((pl.field_d ^ -1) > -1) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) > -1) {
                    break L1;
                  } else {
                    lo.field_b[pl.field_d] = var2_int ^ -1;
                    pl.field_d = 1 + pl.field_d & 127;
                    if (ek.field_cb != pl.field_d) {
                      break L1;
                    } else {
                      pl.field_d = -1;
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
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("op.keyReleased(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (null == gp.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ge.field_w = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (var2_int >= tf.field_a.length) {
                        break L3;
                      } else {
                        var2_int = tf.field_a[var2_int];
                        if (0 == (128 & var2_int)) {
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
                  if ((pl.field_d ^ -1) > -1) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) > -1) {
                      break L4;
                    } else {
                      lo.field_b[pl.field_d] = var2_int;
                      pl.field_d = 127 & 1 + pl.field_d;
                      if (pl.field_d != ek.field_cb) {
                        break L4;
                      } else {
                        pl.field_d = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (-1 >= (var2_int ^ -1)) {
                    var3 = 127 & hb.field_w - -1;
                    if (si.field_m == var3) {
                      break L5;
                    } else {
                      ef.field_d[hb.field_w] = var2_int;
                      vp.field_r[hb.field_w] = (char)0;
                      hb.field_w = var3;
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
                    if (-86 == (var2_int ^ -1)) {
                      break L6;
                    } else {
                      if (var2_int == 10) {
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
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("op.keyPressed(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final static void a(vc param0, int param1) {
        try {
            kp.field_d.insertElementAt(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "op.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, int param1) {
        if (param0) {
            vc var3 = (vc) null;
            op.a((vc) null, -56);
        }
        return rd.a(lh.field_t, new String[]{(-11 >= (param1 ^ -1) ? "" : "0") + Integer.toString(param1)}, (byte) 103).toLowerCase();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -42) {
            field_a = false;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (gp.field_c != null) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int) {
                    if (var2_int != 65535) {
                        if (!(!od.a((char) var2_int, -12))) {
                            var3 = 127 & hb.field_w - -1;
                            if (!(si.field_m == var3)) {
                                ef.field_d[hb.field_w] = -1;
                                vp.field_r[hb.field_w] = (char)var2_int;
                                hb.field_w = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "op.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (param2 == -1) {
              L1: while (true) {
                if (-1 <= (param0 ^ -1)) {
                  stackOut_6_0 = var3_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = 1 & param1 | var3_int << 1003380929;
                  param0--;
                  param1 = param1 >>> 1;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 59;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "op.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (gp.field_c == null) {
                break L1;
              } else {
                pl.field_d = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("op.focusLost(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_b = "Balls destroy bricks, giving you points.<br><br>The first brick a ball destroys after touching the paddle is worth 10 points, the next is worth 11, the next 12, and so on.";
    }
}
