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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        try {
          L0: {
            if (param6 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param4) {
                  break L1;
                } else {
                  if ((param5 ^ -1) >= -1) {
                    break L1;
                  } else {
                    if (0 == param2) {
                      break L1;
                    } else {
                      L2: {
                        if (null != param6[3]) {
                          stackOut_10_0 = param6[3].field_w;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_11_0;
                        if (param6[5] == null) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          break L3;
                        } else {
                          stackOut_12_0 = param6[5].field_w;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_14_0;
                        if (null != param6[1]) {
                          stackOut_16_0 = param6[1].field_y;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = 0;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_17_0;
                        if (param6[7] != null) {
                          stackOut_19_0 = param6[7].field_y;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      var10 = stackIn_20_0;
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
                          if (var18 < var17) {
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
                          if (var19 > var20) {
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
                                if (var21 >= var14) {
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
                                if (var14 <= var21) {
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
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
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
            stackOut_79_0 = (RuntimeException) (var7);
            stackOut_79_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L23;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L23;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
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
          throw wm.a((Throwable) ((Object) var1), "rk.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ko var10 = null;
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
        String var24 = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        of var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        of stackIn_39_0 = null;
        boolean stackIn_39_1 = false;
        of stackIn_40_0 = null;
        boolean stackIn_40_1 = false;
        of stackIn_41_0 = null;
        boolean stackIn_41_1 = false;
        int stackIn_41_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        vh stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        vh stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        vh stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        RuntimeException stackIn_215_0 = null;
        StringBuilder stackIn_215_1 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_216_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        of stackOut_38_0 = null;
        boolean stackOut_38_1 = false;
        of stackOut_40_0 = null;
        boolean stackOut_40_1 = false;
        int stackOut_40_2 = 0;
        of stackOut_39_0 = null;
        boolean stackOut_39_1 = false;
        int stackOut_39_2 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        vh stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        vh stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        vh stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        RuntimeException stackOut_213_0 = null;
        StringBuilder stackOut_213_1 = null;
        RuntimeException stackOut_215_0 = null;
        StringBuilder stackOut_215_1 = null;
        String stackOut_215_2 = null;
        RuntimeException stackOut_214_0 = null;
        StringBuilder stackOut_214_1 = null;
        String stackOut_214_2 = null;
        var31 = Pool.field_O;
        try {
          L0: {
            L1: {
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
                  if (dr.field_c <= var9) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = 255 & em.field_L.field_tc[var9];
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
                    if (null != w.field_j) {
                      if (null != w.field_j[var9]) {
                        L8: {
                          var11_int = w.field_j[var9][var10_int];
                          if (var11_int > var7) {
                            var7 = var11_int;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var11_int != 0) {
                          if (!rg.field_s) {
                            var5_int = 1;
                            var9++;
                            continue L3;
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          var9++;
                          continue L3;
                        }
                      } else {
                        var9++;
                        continue L3;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L9: {
              stackOut_38_0 = (of) (param2);
              stackOut_38_1 = param0;
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              if (pf.field_c != param2) {
                stackOut_40_0 = (of) ((Object) stackIn_40_0);
                stackOut_40_1 = stackIn_40_1;
                stackOut_40_2 = 0;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                stackIn_41_2 = stackOut_40_2;
                break L9;
              } else {
                stackOut_39_0 = (of) ((Object) stackIn_39_0);
                stackOut_39_1 = stackIn_39_1;
                stackOut_39_2 = 1;
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_41_2 = stackOut_39_2;
                break L9;
              }
            }
            L10: {
              if (((of) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 == 0, 2, (byte) 86, 2 * (ad.field_x - -2), (2 + ad.field_x) * (4 * param1))) {
                stackOut_43_0 = 0;
                stackIn_44_0 = stackOut_43_0;
                break L10;
              } else {
                stackOut_42_0 = 1;
                stackIn_44_0 = stackOut_42_0;
                break L10;
              }
            }
            L11: {
              var9 = stackIn_44_0;
              var10 = param2.field_Rb.field_T;
              var11 = null;
              if (param4 == -83) {
                break L11;
              } else {
                var32 = (of) null;
                rk.a(true, -46, (of) null, -111, (byte) 66);
                break L11;
              }
            }
            var12 = (im) ((Object) var10.c((byte) 115));
            L12: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L13: {
                  var13 = 0;
                  if (null != var12.field_T) {
                    break L13;
                  } else {
                    L14: {
                      var12.field_ac = new vh(0L, ge.field_s);
                      var12.a(-106, var12.field_ac);
                      var12.field_Tb = new vh(0L, tm.field_d);
                      if (!tq.field_p) {
                        break L14;
                      } else {
                        var12.a(param4 + 165, var12.field_Tb);
                        break L14;
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
                    break L13;
                  }
                }
                L15: {
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
                  var33 = var12.field_jc;
                  var21 = 72;
                  if (ci.field_c != param2) {
                    break L15;
                  } else {
                    var21 += 42;
                    break L15;
                  }
                }
                L16: {
                  var34 = lr.a(var12.field_ac.field_I, var33, var21);
                  var20 = var34;
                  if (var34.equals(var12.field_jc)) {
                    stackOut_56_0 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    break L16;
                  } else {
                    stackOut_55_0 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    break L16;
                  }
                }
                L17: {
                  var22 = stackIn_57_0;
                  if ((var12.field_bc ^ -1) <= -5) {
                    var20 = "<img=" + (gf.field_a + -4 + var12.field_bc) + ">" + var34;
                    break L17;
                  } else {
                    if (var12.field_bc > 0) {
                      var20 = "<img=" + (var12.field_bc - 1) + ">" + var34;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  var12.field_ac.field_nb = var20;
                  if (!var12.c(true)) {
                    L19: {
                      L20: {
                        L21: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L21;
                          } else {
                            if (!var12.field_Pb) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var12.field_Rb < var6) {
                          break L20;
                        } else {
                          if (var12.field_Xb < var7) {
                            break L20;
                          } else {
                            if ((var8 & (var12.field_Nb ^ -1) ^ -1) >= -1) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L19;
                    }
                    L22: {
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
                        if (var12.field_mc) {
                          var12.field_ac.field_nb = nr.a(new String[]{var20}, -1, ma.field_f);
                          var12.field_Zb.field_nb = be.field_K;
                          break L22;
                        } else {
                          if (var12.field_Yb) {
                            var12.field_ac.field_nb = nr.a(new String[]{var20}, -1, dj.field_j);
                            var12.field_lc.field_nb = ie.field_b;
                            var12.field_Zb.field_nb = qa.field_u;
                            break L22;
                          } else {
                            var12.field_lc.field_nb = kn.field_k;
                            break L22;
                          }
                        }
                      } else {
                        if (!em.field_L.field_ec) {
                          var12.field_Zb.field_nb = bl.field_e;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      var25_int = 0;
                      if (null == em.field_L) {
                        break L23;
                      } else {
                        if (!cj.e((byte) 85)) {
                          break L23;
                        } else {
                          if (var12.field_Sb == ve.field_m) {
                            break L23;
                          } else {
                            L24: {
                              if (null != var12.field_lc.field_nb) {
                                var26 = var12.field_lc.b(true) - -(kj.field_j * 2);
                                var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                var25_int = var25_int + var26;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (null != var12.field_Zb.field_nb) {
                              L25: {
                                if (param2 == wo.field_f) {
                                  var26 = 40;
                                  break L25;
                                } else {
                                  var26 = var12.field_Zb.b(true) - -(kj.field_j * 2);
                                  break L25;
                                }
                              }
                              var12.field_Zb.b(var19, 2147483647, var25_int, var26, ad.field_x);
                              var25_int = var25_int + var26;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                    }
                    L26: {
                      stackOut_93_0 = var12.field_ac;
                      stackOut_93_1 = var19;
                      stackOut_93_2 = 2147483647;
                      stackOut_93_3 = var25_int;
                      stackIn_95_0 = stackOut_93_0;
                      stackIn_95_1 = stackOut_93_1;
                      stackIn_95_2 = stackOut_93_2;
                      stackIn_95_3 = stackOut_93_3;
                      stackIn_94_0 = stackOut_93_0;
                      stackIn_94_1 = stackOut_93_1;
                      stackIn_94_2 = stackOut_93_2;
                      stackIn_94_3 = stackOut_93_3;
                      if (!tq.field_p) {
                        stackOut_95_0 = (vh) ((Object) stackIn_95_0);
                        stackOut_95_1 = stackIn_95_1;
                        stackOut_95_2 = stackIn_95_2;
                        stackOut_95_3 = stackIn_95_3;
                        stackOut_95_4 = 0;
                        stackIn_96_0 = stackOut_95_0;
                        stackIn_96_1 = stackOut_95_1;
                        stackIn_96_2 = stackOut_95_2;
                        stackIn_96_3 = stackOut_95_3;
                        stackIn_96_4 = stackOut_95_4;
                        break L26;
                      } else {
                        stackOut_94_0 = (vh) ((Object) stackIn_94_0);
                        stackOut_94_1 = stackIn_94_1;
                        stackOut_94_2 = stackIn_94_2;
                        stackOut_94_3 = stackIn_94_3;
                        stackOut_94_4 = 42;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        stackIn_96_2 = stackOut_94_2;
                        stackIn_96_3 = stackOut_94_3;
                        stackIn_96_4 = stackOut_94_4;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        ((vh) (Object) stackIn_96_0).b(stackIn_96_1, stackIn_96_2, stackIn_96_3, -stackIn_96_4 + (var12.field_gb - var25_int), ad.field_x);
                        var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
                        var12.field_Tb.b(var19, param4 + -2147483566, -40 + var12.field_gb, 40, ad.field_x);
                        if (!var12.field_ac.field_W) {
                          break L28;
                        } else {
                          if (var22 == 0) {
                            break L28;
                          } else {
                            kk.field_B = var12.field_jc;
                            if (null == lo.field_c) {
                              break L27;
                            } else {
                              if (null == lo.field_c[var12.field_bc]) {
                                break L27;
                              } else {
                                kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                                break L27;
                              }
                            }
                          }
                        }
                      }
                      if (!var12.field_ac.field_W) {
                        break L27;
                      } else {
                        if (null == lo.field_c) {
                          break L27;
                        } else {
                          if (lo.field_c[var12.field_bc] == null) {
                            break L27;
                          } else {
                            kk.field_B = lo.field_c[var12.field_bc];
                            break L27;
                          }
                        }
                      }
                    }
                    var19 = var19 + ad.field_x;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L29: {
                  var23 = vk.a(var20, var12.field_hc, (byte) -126);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 != null) {
                    var24_int = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
                    var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
                    var12.field_kc.field_nb = var23;
                    var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_int);
                    var19 = var19 + ad.field_x * var24_int;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (var9 == 0) {
                    var12.field_Cb = var19 + -var12.field_Db;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var13 == 0) {
                    break L31;
                  } else {
                    param2.field_Rb.a((vh) (var11), 2, var12, -119);
                    break L31;
                  }
                }
                L32: {
                  if (-1 == (var12.field_R ^ -1)) {
                    break L32;
                  } else {
                    if (var12.c(true)) {
                      break L32;
                    } else {
                      if (0 != var12.field_lc.field_R) {
                        k.a(param3, (byte) -127, var12.field_Sb);
                        break L32;
                      } else {
                        if (0 == var12.field_Zb.field_R) {
                          ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                          break L32;
                        } else {
                          jk.a(var12.field_Sb, param3, 0);
                          break L32;
                        }
                      }
                    }
                  }
                }
                L33: {
                  if (!var12.field_db) {
                    break L33;
                  } else {
                    if (!var12.c(true)) {
                      L34: {
                        var24 = null;
                        if (var12.field_Sb == ve.field_m) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (!var12.field_Pb) {
                                var24 = nr.field_db;
                                var30 = var24;
                                var25 = var30;
                                var24 = var25;
                                var30 = var24;
                                var25 = var30;
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          if (var7 > var12.field_Xb) {
                            L36: {
                              var25_int = var7 + -var12.field_Xb;
                              if ((var25_int ^ -1) != -2) {
                                break L36;
                              } else {
                                var24 = rf.field_f;
                                break L36;
                              }
                            }
                            var24 = nr.a(new String[]{null, Integer.toString(var25_int)}, -1, vm.field_n);
                            break L34;
                          } else {
                            if (var12.field_Rb < var6) {
                              var24 = nr.a(new String[]{null, Integer.toString(var6)}, -1, ld.field_i);
                              break L34;
                            } else {
                              if (-1 != (var8 & (var12.field_Nb ^ -1) ^ -1)) {
                                var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 111);
                                var24 = dl.field_a;
                                if (var25_int <= 0) {
                                  break L34;
                                } else {
                                  if (null == fg.field_f) {
                                    break L34;
                                  } else {
                                    if (fg.field_f.length < var25_int) {
                                      break L34;
                                    } else {
                                      if (fg.field_f[var25_int - 1] != null) {
                                        var24 = fg.field_f[var25_int - 1][1];
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (!var12.field_Pb) {
                                var24 = nr.a(new String[]{var20}, -1, dq.field_c);
                                break L34;
                              } else {
                                break L37;
                              }
                            }
                          }
                          if (var7 <= var12.field_Xb) {
                            if (var6 <= var12.field_Rb) {
                              if (-1 == (var8 & (var12.field_Nb ^ -1) ^ -1)) {
                                break L34;
                              } else {
                                var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 100);
                                var24 = nr.a(new String[]{var20}, -1, en.field_a);
                                if ((var25_int ^ -1) >= -1) {
                                  break L34;
                                } else {
                                  if (fg.field_f == null) {
                                    break L34;
                                  } else {
                                    if (var25_int > fg.field_f.length) {
                                      break L34;
                                    } else {
                                      if (null == fg.field_f[-1 + var25_int]) {
                                        break L34;
                                      } else {
                                        var24 = nr.a(new String[]{var20}, -1, fg.field_f[var25_int - 1][2]);
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = nr.a(new String[]{var20, Integer.toString(var6)}, -1, jq.field_a);
                              break L34;
                            }
                          } else {
                            L38: {
                              var25_int = -var12.field_Xb + var7;
                              if (1 != var25_int) {
                                break L38;
                              } else {
                                var24 = nr.a(new String[]{var20}, -1, jd.field_i);
                                break L38;
                              }
                            }
                            var24 = nr.a(new String[]{var20, Integer.toString(var25_int)}, -1, sm.field_A);
                            break L34;
                          }
                        }
                      }
                      if (var24 != null) {
                        var35 = "<col=A00000>" + var24;
                        var30 = var35;
                        var25 = var30;
                        var24 = var25;
                        var30 = var35;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L39: while (true) {
                          if (dr.field_c <= var27_int) {
                            L40: {
                              L41: {
                                if (param2 != wo.field_f) {
                                  break L41;
                                } else {
                                  if (cj.e((byte) 85)) {
                                    if (var26 == 0) {
                                      var24 = var35 + "<br>" + nr.a(new String[]{var25}, -1, ii.field_c);
                                      break L40;
                                    } else {
                                      var24 = var35 + "<br>" + hm.field_g + var25;
                                      break L40;
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (var26 == 0) {
                                var24 = var35 + "<br>" + nr.a(new String[]{var25}, -1, sf.field_x);
                                break L40;
                              } else {
                                var24 = var35 + "<br>" + tp.field_d + var25;
                                break L40;
                              }
                            }
                            L42: {
                              if (param2 != wo.field_f) {
                                break L42;
                              } else {
                                if (cj.e((byte) 85)) {
                                  break L42;
                                } else {
                                  var27 = em.field_L.field_Ob;
                                  var24 = var24 + "<br>" + nr.a(new String[]{var27}, param4 ^ 82, ke.field_b);
                                  break L42;
                                }
                              }
                            }
                            kk.field_B = var24;
                            break L33;
                          } else {
                            L43: {
                              var28 = 255 & em.field_L.field_tc[var27_int];
                              var29 = 0;
                              if (dl.field_j == null) {
                                break L43;
                              } else {
                                if (dl.field_j[var27_int] != null) {
                                  if (!dl.field_j[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (var12.field_Pb) {
                                      break L43;
                                    } else {
                                      var29 = 1;
                                      break L43;
                                    }
                                  }
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L44: {
                              if (ci.field_d == null) {
                                break L44;
                              } else {
                                if (ci.field_d[var27_int] == null) {
                                  break L44;
                                } else {
                                  L45: {
                                    var30_int = ci.field_d[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L45;
                                    } else {
                                      if (rg.field_s) {
                                        break L45;
                                      } else {
                                        if (var12.field_Pb) {
                                          break L45;
                                        } else {
                                          var29 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Rb) {
                                    break L44;
                                  } else {
                                    var29 = 1;
                                    break L44;
                                  }
                                }
                              }
                            }
                            L46: {
                              if (null == w.field_j) {
                                break L46;
                              } else {
                                if (w.field_j[var27_int] == null) {
                                  break L46;
                                } else {
                                  L47: {
                                    var30_int = w.field_j[var27_int][var28];
                                    if (-1 == (var30_int ^ -1)) {
                                      break L47;
                                    } else {
                                      if (rg.field_s) {
                                        break L47;
                                      } else {
                                        if (var12.field_Pb) {
                                          break L47;
                                        } else {
                                          var29 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int > var12.field_Xb) {
                                    var29 = 1;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            L48: {
                              if (op.field_a == null) {
                                break L48;
                              } else {
                                if (op.field_a[var27_int] != null) {
                                  if ((op.field_a[var27_int][var28] & (var12.field_Nb ^ -1)) != 0) {
                                    var29 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            L49: {
                              if (var29 != 0) {
                                var30 = "<col=A00000>" + ck.field_R[var27_int] + "</col>";
                                var25 = var30;
                                var24 = var25;
                                var25 = var30;
                                if (var25 != null) {
                                  var26 = 1;
                                  var25 = var25 + ", " + var30;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var25 = var30;
                                  break L49;
                                }
                              } else {
                                break L49;
                              }
                            }
                            var27_int++;
                            continue L39;
                          }
                        }
                      } else {
                        break L33;
                      }
                    } else {
                      var11 = var12;
                      var12 = (im) ((Object) var10.f((byte) -5));
                      continue L12;
                    }
                  }
                }
                var11 = var12;
                var12 = (im) ((Object) var10.f((byte) -5));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_213_0 = (RuntimeException) (var5);
            stackOut_213_1 = new StringBuilder().append("rk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_215_0 = stackOut_213_0;
            stackIn_215_1 = stackOut_213_1;
            stackIn_214_0 = stackOut_213_0;
            stackIn_214_1 = stackOut_213_1;
            if (param2 == null) {
              stackOut_215_0 = (RuntimeException) ((Object) stackIn_215_0);
              stackOut_215_1 = (StringBuilder) ((Object) stackIn_215_1);
              stackOut_215_2 = "null";
              stackIn_216_0 = stackOut_215_0;
              stackIn_216_1 = stackOut_215_1;
              stackIn_216_2 = stackOut_215_2;
              break L50;
            } else {
              stackOut_214_0 = (RuntimeException) ((Object) stackIn_214_0);
              stackOut_214_1 = (StringBuilder) ((Object) stackIn_214_1);
              stackOut_214_2 = "{...}";
              stackIn_216_0 = stackOut_214_0;
              stackIn_216_1 = stackOut_214_1;
              stackIn_216_2 = stackOut_214_2;
              break L50;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_216_0), stackIn_216_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if (param5 != 0) {
              param5 = param5 + param1;
              var7_int = 0;
              var8 = param2;
              L1: while (true) {
                L2: {
                  var9 = param4[var8];
                  if (0 > var9) {
                    var7_int = this.field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L4;
                    } else {
                      incrementValue$8 = param1;
                      param1++;
                      param3[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param5 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 == (64 & var9)) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = this.field_c[var7_int];
                    if (-1 < (this.field_c[var7_int] ^ -1)) {
                      incrementValue$9 = param1;
                      param1++;
                      param3[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param1 < param5) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-1 == (32 & var9 ^ -1)) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$10 = param1;
                      param1++;
                      param3[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param1 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L10;
                    } else {
                      incrementValue$11 = param1;
                      param1++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param1 < param5) {
                        var7_int = 0;
                        break L10;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L11: {
                    if ((8 & var9) == 0) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = this.field_c[var7_int];
                    if (-1 < (this.field_c[var7_int] ^ -1)) {
                      incrementValue$12 = param1;
                      param1++;
                      param3[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param5 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((4 & var9) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L14;
                    } else {
                      incrementValue$13 = param1;
                      param1++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param5 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if ((2 & var9) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$14 = param1;
                      param1++;
                      param3[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param5 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-1 != (1 & var9 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = this.field_c[var7_int];
                    if (0 > this.field_c[var7_int]) {
                      incrementValue$15 = param1;
                      param1++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param5 > param1) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                L19: {
                  if (param0 == 36) {
                    break L19;
                  } else {
                    field_h = (String) null;
                    break L19;
                  }
                }
                stackOut_64_0 = -param2 + 1 + var8;
                stackIn_65_0 = stackOut_64_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var7);
            stackOut_66_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          L21: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_65_0;
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int discarded$2 = 0;
        int dupTemp$3 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
            var7_int = 0;
            param1 = param1 + param0;
            var8 = param3 << -1597699549;
            L1: while (true) {
              if (param1 <= param0) {
                L2: {
                  if (param5) {
                    break L2;
                  } else {
                    discarded$2 = rk.b(false);
                    break L2;
                  }
                }
                stackOut_14_0 = -param3 + (7 + var8 >> 1517095843);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                var9 = param4[param0] & 255;
                var10 = this.field_b[var9];
                var11 = this.field_a[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> -938037629;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 342817823;
                    var14 = (var11 + var13 - 1 >> 522306211) + var12;
                    var13 += 24;
                    dupTemp$3 = md.a(var7_int, var10 >>> var13);
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
            stackOut_16_0 = (RuntimeException) (var7);
            stackOut_16_1 = new StringBuilder().append("rk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param3).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param5 + ')');
        }
        return stackIn_15_0;
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
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (tl.field_J == ta.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2_long = rl.a((byte) -103);
                        if (param0 == ii.field_d) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((wq.field_b ^ -1) <= -1) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_ref_fr = (fr) ((Object) vn.field_g.c((byte) -112));
                        if (var4_ref_fr == null) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4_ref_fr.field_p < var2_long) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_ref_fr.a((byte) -117);
                        of.field_Pb = var4_ref_fr.field_l.length;
                        kn.field_e.field_v = 0;
                        var5_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5_int >= of.field_Pb) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
                        var5_int++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        hb.field_e = vd.field_g;
                        vd.field_g = ia.field_l;
                        ia.field_l = uq.field_c;
                        uq.field_c = var4_ref_fr.field_r;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    stackOut_14_0 = wq.field_b;
                    stackIn_17_0 = stackOut_14_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = wq.field_b;
                    stackIn_17_0 = stackOut_15_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = wq.field_b;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 >= 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        kn.field_e.field_v = 0;
                        if (!lq.b((byte) 107, 1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        wq.field_b = kn.field_e.q(param0 + 107);
                        kn.field_e.field_v = 0;
                        of.field_Pb = param1[wq.field_b];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!wf.a((byte) 39)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        if (ii.field_d != 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        hb.field_e = vd.field_g;
                        vd.field_g = ia.field_l;
                        ia.field_l = uq.field_c;
                        uq.field_c = wq.field_b;
                        wq.field_b = -1;
                        stackOut_28_0 = 1;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        var4 = ii.field_d;
                        if (hn.field_a == 0.0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
                        if ((var4 ^ -1) <= -1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = new fr(var2_long + (long)var4, wq.field_b, new byte[of.field_Pb]);
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var6 >= of.field_Pb) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5.field_l[var6] = kn.field_e.field_t[var6];
                        var6++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        vn.field_g.b((byte) -64, var5);
                        wq.field_b = -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackOut_37_0 = (RuntimeException) (var2);
                    stackOut_37_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (param1 == null) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackOut_38_2 = "{...}";
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackOut_39_2 = "null";
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw wm.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(boolean param0) {
        if (!param0) {
            dd[] var2 = (dd[]) null;
            rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
        }
        return di.field_e + (ol.field_e << 775822690) + (ec.field_i << 961008452);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_g = null;
        field_h = null;
        if (param0) {
            field_e = (String) null;
        }
        field_i = null;
        field_f = null;
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
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            this.field_a = param0;
            this.field_b = new int[var2_int];
            this.field_c = new int[8];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_b[var5] = var8;
                      if (-1 == (var8 & var7 ^ -1)) {
                        var9 = var7 | var8;
                        var10 = var6 + -1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if (var11 != var8) {
                              break L3;
                            } else {
                              var12 = 1 << 32 + -var10;
                              if ((var12 & var11) != 0) {
                                var3[var10] = var3[var10 - 1];
                                break L3;
                              } else {
                                var3[var10] = md.a(var12, var11);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            this.field_c[var10] = var5 ^ -1;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = var10 + 1;
                              break L2;
                            }
                          } else {
                            L7: {
                              var12 = -2147483648 >>> var11;
                              if ((var8 & var12) == 0) {
                                var10++;
                                break L7;
                              } else {
                                L8: {
                                  if (this.field_c[var10] != 0) {
                                    break L8;
                                  } else {
                                    this.field_c[var10] = var4;
                                    break L8;
                                  }
                                }
                                var10 = this.field_c[var10];
                                break L7;
                              }
                            }
                            L9: {
                              if (this.field_c.length > var10) {
                                break L9;
                              } else {
                                var13 = new int[this.field_c.length * 2];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= this.field_c.length) {
                                    this.field_c = var13;
                                    break L9;
                                  } else {
                                    var13[var14] = this.field_c[var14];
                                    var14++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L11: {
                          if (var8 != var17[var10]) {
                            break L11;
                          } else {
                            var17[var10] = var9;
                            break L11;
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var2);
            stackOut_35_1 = new StringBuilder().append("rk.<init>(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
    }

    static {
        field_e = "You<%0> are all out of lives!";
        field_h = "Waiting for sound effects";
        field_i = "This entry doesn't match";
        field_f = "Report abuse";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
