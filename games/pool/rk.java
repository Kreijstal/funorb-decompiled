/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    private byte[] field_a;
    static int field_d;
    static String field_h;
    static String field_i;
    static String field_f;
    private int[] field_c;
    private int[] field_b;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, dd[] param6) {
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
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        try {
          L0: {
            if (param6 == null) {
              return;
            } else {
              L1: {
                if (0 >= param4) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    if (0 == param2) {
                      break L1;
                    } else {
                      L2: {
                        if (null != param6[3]) {
                          stackOut_16_0 = param6[3].field_w;
                          stackIn_17_0 = stackOut_16_0;
                          break L2;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_17_0;
                        if (param6[5] == null) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L3;
                        } else {
                          stackOut_18_0 = param6[5].field_w;
                          stackIn_21_0 = stackOut_18_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_21_0;
                        if (null != param6[1]) {
                          stackOut_24_0 = param6[1].field_y;
                          stackIn_25_0 = stackOut_24_0;
                          break L4;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_25_0 = stackOut_22_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_25_0;
                        if (param6[7] != null) {
                          stackOut_28_0 = param6[7].field_y;
                          stackIn_29_0 = stackOut_28_0;
                          break L5;
                        } else {
                          stackOut_26_0 = 0;
                          stackIn_29_0 = stackOut_26_0;
                          break L5;
                        }
                      }
                      var10 = stackIn_29_0;
                      var11 = param3 + param4;
                      var12 = param5 + param1;
                      var13 = param3 - -var7_int;
                      var14 = -var8 + var11;
                      var15 = param1 + var9;
                      var16 = var12 + -var10;
                      var17 = var13;
                      var18 = var14;
                      if (param0 >= 71) {
                        L6: {
                          if (~var18 > ~var17) {
                            var18 = param3 - -(param4 * var7_int / (var8 + var7_int));
                            var17 = param3 - -(param4 * var7_int / (var8 + var7_int));
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var19 = var15;
                          var20 = var16;
                          qh.a(mb.field_b);
                          if (~var19 < ~var20) {
                            var20 = var9 * param5 / (var9 + var10) + param1;
                            var19 = var9 * param5 / (var9 + var10) + param1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (null != param6[0]) {
                            qh.d(param3, param1, var17, var19);
                            param6[0].a(param3, param1, param2);
                            qh.b(mb.field_b);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != param6[2]) {
                            qh.d(var18, param1, var11, var19);
                            param6[2].a(var14, param1, param2);
                            qh.b(mb.field_b);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (param6[6] != null) {
                            qh.d(param3, var20, var17, var12);
                            param6[6].a(param3, var16, param2);
                            qh.b(mb.field_b);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (param6[8] != null) {
                            qh.d(var18, var20, var11, var12);
                            param6[8].a(var14, var16, param2);
                            qh.b(mb.field_b);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (param6[1] == null) {
                            break L12;
                          } else {
                            if (param6[1].field_w != 0) {
                              qh.d(var17, param1, var18, var19);
                              var21 = var13;
                              L13: while (true) {
                                if (~var21 <= ~var14) {
                                  qh.b(mb.field_b);
                                  break L12;
                                } else {
                                  param6[1].a(var21, param1, param2);
                                  var21 = var21 + param6[1].field_w;
                                  continue L13;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          if (param6[7] == null) {
                            break L14;
                          } else {
                            if (0 != param6[7].field_w) {
                              qh.d(var17, var20, var18, var12);
                              var21 = var13;
                              L15: while (true) {
                                if (~var14 >= ~var21) {
                                  qh.b(mb.field_b);
                                  break L14;
                                } else {
                                  param6[7].a(var21, var16, param2);
                                  var21 = var21 + param6[7].field_w;
                                  continue L15;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        L16: {
                          if (param6[3] == null) {
                            break L16;
                          } else {
                            if (0 == param6[3].field_y) {
                              break L16;
                            } else {
                              qh.d(param3, var19, var17, var20);
                              var21 = var15;
                              L17: while (true) {
                                if (var21 >= var16) {
                                  qh.b(mb.field_b);
                                  break L16;
                                } else {
                                  param6[3].a(param3, var21, param2);
                                  var21 = var21 + param6[3].field_y;
                                  continue L17;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (param6[5] == null) {
                            break L18;
                          } else {
                            if (param6[5].field_y != 0) {
                              qh.d(var18, var19, var11, var20);
                              var21 = var15;
                              L19: while (true) {
                                if (var16 <= var21) {
                                  qh.b(mb.field_b);
                                  break L18;
                                } else {
                                  param6[5].a(var14, var21, param2);
                                  var21 = var21 + param6[5].field_y;
                                  continue L19;
                                }
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                        L20: {
                          if (param6[4] == null) {
                            break L20;
                          } else {
                            if (0 == param6[4].field_w) {
                              break L20;
                            } else {
                              if (0 != param6[4].field_y) {
                                qh.d(var17, var19, var18, var20);
                                var21 = var15;
                                L21: while (true) {
                                  if (var16 <= var21) {
                                    qh.b(mb.field_b);
                                    break L20;
                                  } else {
                                    var22 = var13;
                                    L22: while (true) {
                                      if (var22 >= var14) {
                                        var21 = var21 + param6[4].field_y;
                                        continue L21;
                                      } else {
                                        param6[4].a(var22, var21, param2);
                                        var22 = var22 + param6[4].field_w;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_110_0 = (RuntimeException) var7;
            stackOut_110_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_113_0 = stackOut_110_0;
            stackIn_113_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param6 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L23;
            } else {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "{...}";
              stackIn_114_0 = stackOut_111_0;
              stackIn_114_1 = stackOut_111_1;
              stackIn_114_2 = stackOut_111_2;
              break L23;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_114_0, stackIn_114_2 + ')');
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            de.a(-100);
            var1_int = 4 + sa.field_h.field_w + sa.field_h.field_C;
            qh.c(0, -var1_int + 376, 32 + aq.field_a.length * 32, var1_int + 112, 8421504, 127);
            var2 = 0;
            var3 = 56 / ((-35 - param0) / 33);
            L1: while (true) {
              if (var2 >= aq.field_a.length) {
                break L0;
              } else {
                aq.field_a[var2].c(3);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rk.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ko var10 = null;
        int var10_int = 0;
        Object var11 = null;
        int var11_int = 0;
        im var12 = null;
        int var13 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        of stackIn_46_0 = null;
        boolean stackIn_46_1 = false;
        of stackIn_47_0 = null;
        boolean stackIn_47_1 = false;
        of stackIn_48_0 = null;
        boolean stackIn_48_1 = false;
        int stackIn_48_2 = 0;
        int stackIn_65_0 = 0;
        vh stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        vh stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        vh stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        of stackOut_45_0 = null;
        boolean stackOut_45_1 = false;
        of stackOut_47_0 = null;
        boolean stackOut_47_1 = false;
        int stackOut_47_2 = 0;
        of stackOut_46_0 = null;
        boolean stackOut_46_1 = false;
        int stackOut_46_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        vh stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        vh stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        vh stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        L0: {
          L1: {
            var31 = Pool.field_O;
            var5_int = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (null == em.field_L) {
              break L1;
            } else {
              L2: {
                if (null != dl.field_j) {
                  break L2;
                } else {
                  if (null != ci.field_d) {
                    break L2;
                  } else {
                    if (w.field_j != null) {
                      break L2;
                    } else {
                      if (null == op.field_a) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if (~dr.field_c >= ~var9) {
                  break L1;
                } else {
                  var10_int = 255 & em.field_L.field_tc[var9];
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == dl.field_j) {
                        break L4;
                      } else {
                        if (dl.field_j[var9] != null) {
                          if (!dl.field_j[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == ci.field_d) {
                        break L5;
                      } else {
                        if (null != ci.field_d[var9]) {
                          L6: {
                            var11_int = ci.field_d[var9][var10_int];
                            if (var6 >= var11_int) {
                              break L6;
                            } else {
                              var6 = var11_int;
                              break L6;
                            }
                          }
                          if (0 == var11_int) {
                            break L5;
                          } else {
                            if (rg.field_s) {
                              break L5;
                            } else {
                              var5_int = 1;
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (op.field_a == null) {
                        break L7;
                      } else {
                        if (op.field_a[var9] != null) {
                          var8 = var8 | op.field_a[var9][var10_int];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == w.field_j) {
                        break L8;
                      } else {
                        if (null == w.field_j[var9]) {
                          break L8;
                        } else {
                          L9: {
                            var11_int = w.field_j[var9][var10_int];
                            if (~var11_int < ~var7) {
                              var7 = var11_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (rg.field_s) {
                              break L8;
                            } else {
                              var5_int = 1;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_45_0 = (of) param2;
            stackOut_45_1 = param0;
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (pf.field_c != param2) {
              stackOut_47_0 = (of) (Object) stackIn_47_0;
              stackOut_47_1 = stackIn_47_1;
              stackOut_47_2 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L10;
            } else {
              stackOut_46_0 = (of) (Object) stackIn_46_0;
              stackOut_46_1 = stackIn_46_1;
              stackOut_46_2 = 1;
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L10;
            }
          }
          var9 = ((of) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2 != 0, 2, (byte) 86, 2 * (ad.field_x - -2), (2 + ad.field_x) * (4 * param1)) ? 1 : 0;
          break L0;
        }
        L11: {
          var10 = param2.field_Rb.field_T;
          var11 = null;
          if (param4 == -83) {
            break L11;
          } else {
            rk.a(true, -46, (of) null, -111, (byte) 66);
            break L11;
          }
        }
        var12 = (im) (Object) var10.c((byte) 115);
        L12: while (true) {
          L13: {
            L14: {
              if (null == var12) {
                break L14;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
                } else {
                  L15: {
                    if (null != var12.field_T) {
                      break L15;
                    } else {
                      L16: {
                        var12.field_ac = new vh(0L, ge.field_s);
                        var12.a(-106, var12.field_ac);
                        var12.field_Tb = new vh(0L, tm.field_d);
                        if (!tq.field_p) {
                          break L16;
                        } else {
                          var12.a(param4 + 165, var12.field_Tb);
                          break L16;
                        }
                      }
                      var12.field_Tb.field_Fb = 2;
                      var12.field_kc = new vh(0L, uo.field_Lb);
                      var12.a(3, var12.field_kc);
                      var12.d((byte) -125);
                      var12.field_lc = new vh(0L, p.field_i);
                      var12.a(13, var12.field_lc);
                      var12.field_Zb = new vh(0L, lh.field_g);
                      var13 = 1;
                      var12.a(37, var12.field_Zb);
                      break L15;
                    }
                  }
                  L17: {
                    var12.field_ac.field_nb = null;
                    var14 = var12.field_ac;
                    var12.field_ac.field_Db = 0;
                    var14.field_gb = 0;
                    var12.field_Tb.field_nb = null;
                    var12.field_Tb.field_Db = 0;
                    var15 = var12.field_Tb;
                    var12.field_lc.field_nb = null;
                    var15.field_gb = 0;
                    var16 = var12.field_lc;
                    var12.field_lc.field_Db = 0;
                    var12.field_Zb.field_nb = null;
                    var16.field_gb = 0;
                    var17 = var12.field_Zb;
                    var12.field_Zb.field_Db = 0;
                    var17.field_gb = 0;
                    var12.field_kc.field_nb = null;
                    var18 = var12.field_kc;
                    var12.field_kc.field_Db = 0;
                    var18.field_gb = 0;
                    var12.field_gb = param2.field_Rb.field_gb;
                    var19 = 0;
                    var20 = var12.field_jc;
                    var21 = 72;
                    if (ci.field_c != param2) {
                      break L17;
                    } else {
                      var21 += 42;
                      break L17;
                    }
                  }
                  L18: {
                    var20 = lr.a(var12.field_ac.field_I, var20, var21);
                    if (var20.equals((Object) (Object) var12.field_jc)) {
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L18;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var22 = stackIn_65_0;
                      if (var12.field_bc >= 4) {
                        break L20;
                      } else {
                        if (var12.field_bc > 0) {
                          var20 = "<img=" + (var12.field_bc - 1) + ">" + var20;
                          if (var31 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    var20 = "<img=" + (gf.field_a + -4 + var12.field_bc) + ">" + var20;
                    break L19;
                  }
                  L21: {
                    var12.field_ac.field_nb = var20;
                    if (!var12.c(true)) {
                      L22: {
                        L23: {
                          L24: {
                            var23_int = 16764006;
                            var24_int = 16777215;
                            if (var5_int == 0) {
                              break L24;
                            } else {
                              if (!var12.field_Pb) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if (~var12.field_Rb > ~var6) {
                            break L23;
                          } else {
                            if (~var12.field_Xb > ~var7) {
                              break L23;
                            } else {
                              if ((var8 & ~var12.field_Nb) <= 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        var24_int = 8421504;
                        var23_int = 8414771;
                        break L22;
                      }
                      L25: {
                        L26: {
                          var12.field_lc.field_N = var23_int;
                          var12.field_Tb.field_N = var23_int;
                          var12.field_ac.field_N = var23_int;
                          var12.field_ac.field_Bb = var24_int;
                          var12.field_ac.field_P = var24_int;
                          var12.field_ac.field_K = var24_int;
                          var12.field_Tb.field_Bb = var24_int;
                          var12.field_Tb.field_P = var24_int;
                          var12.field_Tb.field_K = var24_int;
                          var12.field_lc.field_Bb = var24_int;
                          var12.field_lc.field_P = var24_int;
                          var12.field_lc.field_K = var24_int;
                          if (wo.field_f != param2) {
                            break L26;
                          } else {
                            if (!em.field_L.field_ec) {
                              var12.field_Zb.field_nb = bl.field_e;
                              if (var31 == 0) {
                                break L25;
                              } else {
                                break L26;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                        L27: {
                          if (var12.field_mc) {
                            break L27;
                          } else {
                            L28: {
                              if (var12.field_Yb) {
                                break L28;
                              } else {
                                var12.field_lc.field_nb = kn.field_k;
                                if (var31 == 0) {
                                  break L25;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var12.field_ac.field_nb = nr.a(new String[1], -1, dj.field_j);
                            var12.field_lc.field_nb = ie.field_b;
                            var12.field_Zb.field_nb = qa.field_u;
                            if (var31 == 0) {
                              break L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var12.field_ac.field_nb = nr.a(new String[1], -1, ma.field_f);
                        var12.field_Zb.field_nb = be.field_K;
                        break L25;
                      }
                      L29: {
                        var25_int = 0;
                        if (null == em.field_L) {
                          break L29;
                        } else {
                          if (!cj.e((byte) 85)) {
                            break L29;
                          } else {
                            if (var12.field_Sb == ve.field_m) {
                              break L29;
                            } else {
                              L30: {
                                if (null != var12.field_lc.field_nb) {
                                  var26 = var12.field_lc.b(true) - -(kj.field_j * 2);
                                  var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                  var25_int = var25_int + var26;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              if (null != var12.field_Zb.field_nb) {
                                L31: {
                                  L32: {
                                    if (param2 == wo.field_f) {
                                      break L32;
                                    } else {
                                      var26 = var12.field_Zb.b(true) - -(kj.field_j * 2);
                                      if (var31 == 0) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  var26 = 40;
                                  break L31;
                                }
                                var12.field_Zb.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                var25_int = var25_int + var26;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                      }
                      L33: {
                        stackOut_112_0 = var12.field_ac;
                        stackOut_112_1 = var19;
                        stackOut_112_2 = 2147483647;
                        stackOut_112_3 = var25_int;
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_114_2 = stackOut_112_2;
                        stackIn_114_3 = stackOut_112_3;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        stackIn_113_2 = stackOut_112_2;
                        stackIn_113_3 = stackOut_112_3;
                        if (!tq.field_p) {
                          stackOut_114_0 = (vh) (Object) stackIn_114_0;
                          stackOut_114_1 = stackIn_114_1;
                          stackOut_114_2 = stackIn_114_2;
                          stackOut_114_3 = stackIn_114_3;
                          stackOut_114_4 = 0;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          break L33;
                        } else {
                          stackOut_113_0 = (vh) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 42;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_115_1 = stackOut_113_1;
                          stackIn_115_2 = stackOut_113_2;
                          stackIn_115_3 = stackOut_113_3;
                          stackIn_115_4 = stackOut_113_4;
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          ((vh) (Object) stackIn_115_0).b(stackIn_115_1, stackIn_115_2, stackIn_115_3, -stackIn_115_4 + (var12.field_gb - var25_int), ad.field_x);
                          var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
                          var12.field_Tb.b(var19, param4 + -2147483566, -40 + var12.field_gb, 40, ad.field_x);
                          if (!var12.field_ac.field_W) {
                            break L35;
                          } else {
                            if (var22 == 0) {
                              break L35;
                            } else {
                              kk.field_B = var12.field_jc;
                              if (null == lo.field_c) {
                                break L34;
                              } else {
                                if (null == lo.field_c[var12.field_bc]) {
                                  break L34;
                                } else {
                                  kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                                  if (var31 == 0) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (!var12.field_ac.field_W) {
                          break L34;
                        } else {
                          if (null == lo.field_c) {
                            break L34;
                          } else {
                            if (lo.field_c[var12.field_bc] == null) {
                              break L34;
                            } else {
                              kk.field_B = lo.field_c[var12.field_bc];
                              break L34;
                            }
                          }
                        }
                      }
                      var19 = var19 + ad.field_x;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L36: {
                    var23 = vk.a(var20, var12.field_hc, (byte) -126);
                    if (null != var23) {
                      var24_int = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
                      var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
                      var12.field_kc.field_nb = var23;
                      var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_int);
                      var19 = var19 + ad.field_x * var24_int;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (var9 == 0) {
                      var12.field_Cb = var19 + -var12.field_Db;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (var13 == 0) {
                      break L38;
                    } else {
                      param2.field_Rb.a((vh) var11, 2, (vh) (Object) var12, -119);
                      break L38;
                    }
                  }
                  L39: {
                    if (var12.field_R == 0) {
                      break L39;
                    } else {
                      if (var12.c(true)) {
                        break L39;
                      } else {
                        L40: {
                          if (0 != var12.field_lc.field_R) {
                            break L40;
                          } else {
                            L41: {
                              if (0 == var12.field_Zb.field_R) {
                                break L41;
                              } else {
                                jk.a(var12.field_Sb, param3, 0);
                                if (var31 == 0) {
                                  break L39;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                            if (var31 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        k.a(param3, (byte) -127, var12.field_Sb);
                        break L39;
                      }
                    }
                  }
                  L42: {
                    if (!var12.field_db) {
                      break L42;
                    } else {
                      if (!var12.c(true)) {
                        L43: {
                          var24 = null;
                          if (var12.field_Sb == ve.field_m) {
                            L44: {
                              if (var5_int == 0) {
                                break L44;
                              } else {
                                if (!var12.field_Pb) {
                                  var24 = (Object) (Object) nr.field_db;
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            if (var7 > var12.field_Xb) {
                              L45: {
                                var25_int = var7 + -var12.field_Xb;
                                if (var25_int != 1) {
                                  break L45;
                                } else {
                                  var24 = (Object) (Object) rf.field_f;
                                  break L45;
                                }
                              }
                              var24 = (Object) (Object) nr.a(new String[2], -1, vm.field_n);
                              break L43;
                            } else {
                              if (~var12.field_Rb > ~var6) {
                                var24 = (Object) (Object) nr.a(new String[2], -1, ld.field_i);
                                break L43;
                              } else {
                                if ((var8 & ~var12.field_Nb) != 0) {
                                  L46: {
                                    var25_int = s.a(~var12.field_Nb & var8, (byte) 111);
                                    var24 = (Object) (Object) dl.field_a;
                                    if (var25_int <= 0) {
                                      break L46;
                                    } else {
                                      if (null == fg.field_f) {
                                        break L46;
                                      } else {
                                        if (fg.field_f.length < var25_int) {
                                          break L46;
                                        } else {
                                          if (fg.field_f[var25_int - 1] != null) {
                                            var24 = (Object) (Object) fg.field_f[var25_int - 1][1];
                                            break L46;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          } else {
                            L47: {
                              if (var5_int == 0) {
                                break L47;
                              } else {
                                if (!var12.field_Pb) {
                                  var24 = (Object) (Object) nr.a(new String[1], -1, dq.field_c);
                                  break L43;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (~var7 >= ~var12.field_Xb) {
                              if (~var6 >= ~var12.field_Rb) {
                                if ((var8 & ~var12.field_Nb) == 0) {
                                  break L43;
                                } else {
                                  L48: {
                                    var25_int = s.a(~var12.field_Nb & var8, (byte) 100);
                                    var24 = (Object) (Object) nr.a(new String[1], -1, en.field_a);
                                    if (var25_int <= 0) {
                                      break L48;
                                    } else {
                                      if (fg.field_f == null) {
                                        break L48;
                                      } else {
                                        if (var25_int > fg.field_f.length) {
                                          break L48;
                                        } else {
                                          if (null == fg.field_f[-1 + var25_int]) {
                                            break L48;
                                          } else {
                                            var24 = (Object) (Object) nr.a(new String[1], -1, fg.field_f[var25_int - 1][2]);
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                }
                              } else {
                                var24 = (Object) (Object) nr.a(new String[2], -1, jq.field_a);
                                break L43;
                              }
                            } else {
                              L49: {
                                var25_int = -var12.field_Xb + var7;
                                if (1 != var25_int) {
                                  break L49;
                                } else {
                                  var24 = (Object) (Object) nr.a(new String[1], -1, jd.field_i);
                                  break L49;
                                }
                              }
                              var24 = (Object) (Object) nr.a(new String[2], -1, sm.field_A);
                              break L43;
                            }
                          }
                        }
                        if (var24 != null) {
                          var24 = (Object) (Object) ("<col=A00000>" + (String) var24);
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                L53: {
                                  L54: {
                                    if (~dr.field_c >= ~var27_int) {
                                      break L54;
                                    } else {
                                      var28 = 255 & em.field_L.field_tc[var27_int];
                                      var29 = 0;
                                      if (var31 != 0) {
                                        break L53;
                                      } else {
                                        L55: {
                                          if (dl.field_j == null) {
                                            break L55;
                                          } else {
                                            if (dl.field_j[var27_int] != null) {
                                              if (!dl.field_j[var27_int][var28]) {
                                                break L55;
                                              } else {
                                                if (var12.field_Pb) {
                                                  break L55;
                                                } else {
                                                  var29 = 1;
                                                  break L55;
                                                }
                                              }
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L56: {
                                          if (ci.field_d == null) {
                                            break L56;
                                          } else {
                                            if (ci.field_d[var27_int] == null) {
                                              break L56;
                                            } else {
                                              L57: {
                                                var30_int = ci.field_d[var27_int][var28];
                                                if (var30_int == 0) {
                                                  break L57;
                                                } else {
                                                  if (rg.field_s) {
                                                    break L57;
                                                  } else {
                                                    if (var12.field_Pb) {
                                                      break L57;
                                                    } else {
                                                      var29 = 1;
                                                      break L57;
                                                    }
                                                  }
                                                }
                                              }
                                              if (~var30_int >= ~var12.field_Rb) {
                                                break L56;
                                              } else {
                                                var29 = 1;
                                                break L56;
                                              }
                                            }
                                          }
                                        }
                                        L58: {
                                          if (null == w.field_j) {
                                            break L58;
                                          } else {
                                            if (w.field_j[var27_int] == null) {
                                              break L58;
                                            } else {
                                              L59: {
                                                var30_int = w.field_j[var27_int][var28];
                                                if (var30_int == 0) {
                                                  break L59;
                                                } else {
                                                  if (rg.field_s) {
                                                    break L59;
                                                  } else {
                                                    if (var12.field_Pb) {
                                                      break L59;
                                                    } else {
                                                      var29 = 1;
                                                      break L59;
                                                    }
                                                  }
                                                }
                                              }
                                              if (~var30_int < ~var12.field_Xb) {
                                                var29 = 1;
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                        }
                                        L60: {
                                          if (op.field_a == null) {
                                            break L60;
                                          } else {
                                            if (op.field_a[var27_int] != null) {
                                              if ((op.field_a[var27_int][var28] & ~var12.field_Nb) != 0) {
                                                var29 = 1;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                        L61: {
                                          if (var29 != 0) {
                                            L62: {
                                              var30 = "<col=A00000>" + ck.field_R[var27_int] + "</col>";
                                              if (null != var25) {
                                                break L62;
                                              } else {
                                                var25 = (Object) (Object) var30;
                                                if (var31 == 0) {
                                                  break L61;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                            var26 = 1;
                                            var25 = (Object) (Object) ((String) var25 + ", " + var30);
                                            break L61;
                                          } else {
                                            break L61;
                                          }
                                        }
                                        var27_int++;
                                        if (var31 == 0) {
                                          continue L50;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                  if (param2 != wo.field_f) {
                                    break L53;
                                  } else {
                                    if (cj.e((byte) 85)) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L63: {
                                  if (var26 == 0) {
                                    break L63;
                                  } else {
                                    var24 = (Object) (Object) ((String) var24 + "<br>" + tp.field_d + (String) var25);
                                    if (var31 == 0) {
                                      break L51;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                var24 = (Object) (Object) ((String) var24 + "<br>" + nr.a(new String[1], -1, sf.field_x));
                                if (var31 == 0) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                              L64: {
                                if (var26 == 0) {
                                  break L64;
                                } else {
                                  var24 = (Object) (Object) ((String) var24 + "<br>" + hm.field_g + (String) var25);
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              var24 = (Object) (Object) ((String) var24 + "<br>" + nr.a(new String[1], -1, ii.field_c));
                              break L51;
                            }
                            L65: {
                              if (param2 != wo.field_f) {
                                break L65;
                              } else {
                                if (cj.e((byte) 85)) {
                                  break L65;
                                } else {
                                  var27 = em.field_L.field_Ob;
                                  var24 = (Object) (Object) ((String) var24 + "<br>" + nr.a(new String[1], param4 ^ 82, ke.field_b));
                                  break L65;
                                }
                              }
                            }
                            kk.field_B = (String) var24;
                            break L42;
                          }
                        } else {
                          break L42;
                        }
                      } else {
                        break L42;
                      }
                    }
                  }
                  var11 = (Object) (Object) var12;
                  var12 = (im) (Object) var10.f((byte) -5);
                  if (var31 == 0) {
                    continue L12;
                  } else {
                    break L14;
                  }
                }
              }
            }
            break L13;
          }
          return;
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if (param5 != 0) {
              param5 = param5 + param1;
              var7_int = 0;
              var8 = param2;
              L1: while (true) {
                L2: {
                  L3: {
                    var9 = param4[var8];
                    if (0 > var9) {
                      break L3;
                    } else {
                      var7_int++;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7_int = ((rk) this).field_c[var7_int];
                  break L2;
                }
                L4: {
                  L5: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$8 = param1;
                      param1++;
                      param3[incrementValue$8] = (byte)(~var10);
                      if (~param5 >= ~param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (0 == (64 & var9)) {
                        break L7;
                      } else {
                        var7_int = ((rk) this).field_c[var7_int];
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int++;
                    break L6;
                  }
                  L8: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      L9: {
                        int incrementValue$9 = param1;
                        param1++;
                        param3[incrementValue$9] = (byte)(~var10);
                        if (~param1 > ~param5) {
                          break L9;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var7_int = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    L11: {
                      if ((32 & var9) == 0) {
                        break L11;
                      } else {
                        var7_int = ((rk) this).field_c[var7_int];
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var7_int++;
                    break L10;
                  }
                  L12: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param1;
                      param1++;
                      param3[incrementValue$10] = (byte)(~var10);
                      if (param1 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if ((var9 & 16) != 0) {
                        break L14;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var7_int = ((rk) this).field_c[var7_int];
                    break L13;
                  }
                  L15: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L15;
                    } else {
                      L16: {
                        int incrementValue$11 = param1;
                        param1++;
                        param3[incrementValue$11] = (byte)(~var10);
                        if (param1 < param5) {
                          break L16;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var7_int = 0;
                      break L15;
                    }
                  }
                  L17: {
                    L18: {
                      if ((8 & var9) == 0) {
                        break L18;
                      } else {
                        var7_int = ((rk) this).field_c[var7_int];
                        if (var11 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var7_int++;
                    break L17;
                  }
                  L19: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$12 = param1;
                      param1++;
                      param3[incrementValue$12] = (byte)(~var10);
                      if (~param5 >= ~param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    L21: {
                      if ((4 & var9) != 0) {
                        break L21;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var7_int = ((rk) this).field_c[var7_int];
                    break L20;
                  }
                  L22: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L22;
                    } else {
                      int incrementValue$13 = param1;
                      param1++;
                      param3[incrementValue$13] = (byte)(~var10);
                      if (param5 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    L24: {
                      if ((2 & var9) != 0) {
                        break L24;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int = ((rk) this).field_c[var7_int];
                    break L23;
                  }
                  L25: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param1;
                      param1++;
                      param3[incrementValue$14] = (byte)(~var10);
                      if (~param5 >= ~param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      if ((1 & var9) != 0) {
                        break L27;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var7_int = ((rk) this).field_c[var7_int];
                    break L26;
                  }
                  L28: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (0 > ((rk) this).field_c[var7_int]) {
                      L29: {
                        int incrementValue$15 = param1;
                        param1++;
                        param3[incrementValue$15] = (byte)(~var10);
                        if (param5 > param1) {
                          break L29;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L29;
                          }
                        }
                      }
                      var7_int = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    break L4;
                  }
                }
                L30: {
                  if (param0 == 36) {
                    break L30;
                  } else {
                    field_h = null;
                    break L30;
                  }
                }
                stackOut_94_0 = -param2 + 1 + var8;
                stackIn_95_0 = stackOut_94_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var7 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var7;
            stackOut_96_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param3 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L31;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L31;
            }
          }
          L32: {
            stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
            stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',');
            stackIn_103_0 = stackOut_100_0;
            stackIn_103_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param4 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L32;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_104_0 = stackOut_101_0;
              stackIn_104_1 = stackOut_101_1;
              stackIn_104_2 = stackOut_101_2;
              break L32;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + ',' + param5 + ')');
        }
        return stackIn_95_0;
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var7_int = 0;
            param1 = param1 + param0;
            var8 = param3 << -1597699549;
            L1: while (true) {
              if (param1 <= param0) {
                L2: {
                  if (param5) {
                    break L2;
                  } else {
                    int discarded$2 = rk.b(false);
                    break L2;
                  }
                }
                stackOut_18_0 = -param3 + (7 + var8 >> 1517095843);
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var9 = param4[param0] & 255;
                var10 = ((rk) this).field_b[var9];
                var11 = ((rk) this).field_a[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> -938037629;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 342817823;
                    var14 = (var11 + var13 - 1 >> 522306211) + var12;
                    var13 += 24;
                    int dupTemp$3 = md.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$3;
                    param2[var12] = (byte)dupTemp$3;
                    if (var14 > var12) {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L3;
                      } else {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                          break L3;
                        } else {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param2[var12] = (byte)(var10 >>> var13);
                          if (var14 > var12) {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param2[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8 = var8 + var11;
                  param0++;
                  continue L1;
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("rk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param3).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param5 + ')');
        }
        return stackIn_19_0;
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        fr var4_ref_fr = null;
        int var4 = 0;
        int var5_int = 0;
        fr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        boolean stackIn_27_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        boolean stackOut_24_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_31_0 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = Pool.field_O;
        try {
          if (tl.field_J == ta.field_a) {
            L0: {
              var2_long = rl.a((byte) -103);
              if (param0 == ii.field_d) {
                break L0;
              } else {
                if (wq.field_b >= 0) {
                  break L0;
                } else {
                  var4_ref_fr = (fr) (Object) vn.field_g.c((byte) -112);
                  if (var4_ref_fr == null) {
                    break L0;
                  } else {
                    if (var4_ref_fr.field_p < var2_long) {
                      var4_ref_fr.a((byte) -117);
                      of.field_Pb = var4_ref_fr.field_l.length;
                      kn.field_e.field_v = 0;
                      var5_int = 0;
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (var5_int >= of.field_Pb) {
                              break L3;
                            } else {
                              kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
                              var5_int++;
                              if (var7 != 0) {
                                break L2;
                              } else {
                                if (var7 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          hb.field_e = vd.field_g;
                          vd.field_g = ia.field_l;
                          ia.field_l = uq.field_c;
                          uq.field_c = var4_ref_fr.field_r;
                          break L2;
                        }
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L4: while (true) {
              L5: {
                L6: {
                  if (wq.field_b >= 0) {
                    break L6;
                  } else {
                    kn.field_e.field_v = 0;
                    stackOut_24_0 = lq.b((byte) 107, 1);
                    stackIn_35_0 = stackOut_24_0;
                    stackIn_25_0 = stackOut_24_0;
                    if (var7 != 0) {
                      break L5;
                    } else {
                      stackOut_25_0 = stackIn_25_0;
                      stackIn_27_0 = stackOut_25_0;
                      if (!stackIn_27_0) {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      } else {
                        wq.field_b = kn.field_e.q(param0 + 107);
                        kn.field_e.field_v = 0;
                        of.field_Pb = param1[wq.field_b];
                        break L6;
                      }
                    }
                  }
                }
                stackOut_34_0 = wf.a((byte) 39);
                stackIn_35_0 = stackOut_34_0;
                break L5;
              }
              if (!stackIn_35_0) {
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                return stackIn_38_0 != 0;
              } else {
                if (ii.field_d != 0) {
                  L7: {
                    var4 = ii.field_d;
                    if (hn.field_a == 0.0) {
                      break L7;
                    } else {
                      var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
                      if (var4 >= 0) {
                        break L7;
                      } else {
                        var4 = 0;
                        break L7;
                      }
                    }
                  }
                  var5 = new fr(var2_long + (long)var4, wq.field_b, new byte[of.field_Pb]);
                  var6 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (~var6 <= ~of.field_Pb) {
                          break L10;
                        } else {
                          var5.field_l[var6] = kn.field_e.field_t[var6];
                          var6++;
                          if (var7 != 0) {
                            break L9;
                          } else {
                            if (var7 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      vn.field_g.b((byte) -64, (ma) (Object) var5);
                      wq.field_b = -1;
                      break L9;
                    }
                    continue L4;
                  }
                } else {
                  hb.field_e = vd.field_g;
                  vd.field_g = ia.field_l;
                  ia.field_l = uq.field_c;
                  uq.field_c = wq.field_b;
                  wq.field_b = -1;
                  stackOut_40_0 = 1;
                  stackIn_41_0 = stackOut_40_0;
                  return stackIn_41_0 != 0;
                }
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L11;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
    }

    final static int b(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
                break L1;
              }
            }
            stackOut_3_0 = di.field_e + (ol.field_e << 775822690) + (ec.field_i << 961008452);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rk.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              field_g = null;
              field_h = null;
              if (!param0) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_i = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rk.A(" + param0 + ')');
        }
    }

    rk(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var15 = Pool.field_O;
        try {
          L0: {
            var2_int = param0.length;
            ((rk) this).field_a = param0;
            ((rk) this).field_b = new int[var2_int];
            ((rk) this).field_c = new int[8];
            var3 = new int[33];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var2_int;
              stackOut_2_1 = var5;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      var6 = param0[var5];
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (0 == var6) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                L8: {
                                  var7 = 1 << 32 - var6;
                                  var8 = var3[var6];
                                  ((rk) this).field_b[var5] = var8;
                                  if ((var8 & var7) == 0) {
                                    break L8;
                                  } else {
                                    var9 = var3[-1 + var6];
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var9 = var7 | var8;
                                var10 = var6 + -1;
                                L9: while (true) {
                                  if (var10 < 1) {
                                    break L7;
                                  } else {
                                    var11 = var3[var10];
                                    stackOut_12_0 = var11;
                                    stackOut_12_1 = var8;
                                    stackIn_27_0 = stackOut_12_0;
                                    stackIn_27_1 = stackOut_12_1;
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    if (var15 != 0) {
                                      break L6;
                                    } else {
                                      if (stackIn_13_0 != stackIn_13_1) {
                                        break L7;
                                      } else {
                                        L10: {
                                          L11: {
                                            var12 = 1 << 32 + -var10;
                                            if ((var12 & var11) != 0) {
                                              break L11;
                                            } else {
                                              var3[var10] = md.a(var12, var11);
                                              if (var15 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var3[var10] = var3[var10 - 1];
                                          if (var15 == 0) {
                                            break L7;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var10--;
                                        if (var15 == 0) {
                                          continue L9;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var3[var6] = var9;
                              stackOut_26_0 = 1;
                              stackOut_26_1 = var6;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              break L6;
                            }
                            var10 = stackIn_27_0 + stackIn_27_1;
                            L12: while (true) {
                              L13: {
                                if (var10 > 32) {
                                  break L13;
                                } else {
                                  stackOut_29_0 = var8;
                                  stackOut_29_1 = var3[var10];
                                  stackIn_3_0 = stackOut_29_0;
                                  stackIn_3_1 = stackOut_29_1;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  if (var15 != 0) {
                                    continue L2;
                                  } else {
                                    L14: {
                                      if (stackIn_30_0 == stackIn_30_1) {
                                        var3[var10] = var9;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var10++;
                                    if (var15 == 0) {
                                      continue L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              var11 = 0;
                              L15: while (true) {
                                L16: {
                                  L17: {
                                    if (~var6 >= ~var11) {
                                      break L17;
                                    } else {
                                      var12 = -2147483648 >>> var11;
                                      stackOut_36_0 = var8 & var12;
                                      stackIn_62_0 = stackOut_36_0;
                                      stackIn_37_0 = stackOut_36_0;
                                      if (var15 != 0) {
                                        break L16;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (stackIn_37_0 == 0) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (((rk) this).field_c[var10] == 0) {
                                                  ((rk) this).field_c[var10] = var4;
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              var10 = ((rk) this).field_c[var10];
                                              if (var15 == 0) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var10++;
                                          break L18;
                                        }
                                        L21: {
                                          L22: {
                                            if (~((rk) this).field_c.length >= ~var10) {
                                              var13 = new int[((rk) this).field_c.length * 2];
                                              var14 = 0;
                                              L23: while (true) {
                                                L24: {
                                                  if (~var14 <= ~((rk) this).field_c.length) {
                                                    break L24;
                                                  } else {
                                                    var13[var14] = ((rk) this).field_c[var14];
                                                    var14++;
                                                    if (var15 != 0) {
                                                      break L21;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L23;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                }
                                                ((rk) this).field_c = var13;
                                                break L22;
                                              }
                                            } else {
                                              break L22;
                                            }
                                          }
                                          var12 = var12 >>> 1;
                                          var11++;
                                          break L21;
                                        }
                                        if (var15 == 0) {
                                          continue L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                  ((rk) this).field_c[var10] = ~var5;
                                  stackOut_61_0 = var10;
                                  stackIn_62_0 = stackOut_61_0;
                                  break L16;
                                }
                                if (stackIn_62_0 < var4) {
                                  break L5;
                                } else {
                                  var4 = var10 + 1;
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var2 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var2;
            stackOut_66_1 = new StringBuilder().append("rk.<init>(");
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L25;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L25;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You<%0> are all out of lives!";
        field_h = "Waiting for sound effects";
        field_i = "This entry doesn't match";
        field_f = "Report abuse";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
