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
            stackOut_79_0 = (RuntimeException) var7;
            stackOut_79_1 = new StringBuilder().append("rk.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L23;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L23;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 41);
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
          throw wm.a((Throwable) (Object) var1, "rk.E(" + param0 + 41);
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
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
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        of stackIn_28_0 = null;
        boolean stackIn_28_1 = false;
        of stackIn_29_0 = null;
        boolean stackIn_29_1 = false;
        of stackIn_30_0 = null;
        boolean stackIn_30_1 = false;
        int stackIn_30_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        vh stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        vh stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        vh stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        of stackOut_27_0 = null;
        boolean stackOut_27_1 = false;
        of stackOut_29_0 = null;
        boolean stackOut_29_1 = false;
        int stackOut_29_2 = 0;
        of stackOut_28_0 = null;
        boolean stackOut_28_1 = false;
        int stackOut_28_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        vh stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        vh stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        vh stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int stackOut_83_4 = 0;
        L0: {
          var31 = Pool.field_O;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == em.field_L) {
            break L0;
          } else {
            L1: {
              if (null != dl.field_j) {
                break L1;
              } else {
                if (null != ci.field_d) {
                  break L1;
                } else {
                  if (w.field_j != null) {
                    break L1;
                  } else {
                    if (null == op.field_a) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (dr.field_c <= var9) {
                break L0;
              } else {
                L3: {
                  var10_int = 255 & em.field_L.field_tc[var9];
                  if (null == dl.field_j) {
                    break L3;
                  } else {
                    if (dl.field_j[var9] != null) {
                      if (!dl.field_j[var9][var10_int]) {
                        break L3;
                      } else {
                        var5_int = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == ci.field_d) {
                    break L4;
                  } else {
                    if (null != ci.field_d[var9]) {
                      L5: {
                        var11_int = ci.field_d[var9][var10_int];
                        if (var6 >= var11_int) {
                          break L5;
                        } else {
                          var6 = var11_int;
                          break L5;
                        }
                      }
                      if (0 == var11_int) {
                        break L4;
                      } else {
                        if (rg.field_s) {
                          break L4;
                        } else {
                          var5_int = 1;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (op.field_a == null) {
                    break L6;
                  } else {
                    if (op.field_a[var9] != null) {
                      var8 = var8 | op.field_a[var9][var10_int];
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (null == w.field_j) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L8: {
          stackOut_27_0 = (of) param2;
          stackOut_27_1 = param0;
          stackIn_29_0 = stackOut_27_0;
          stackIn_29_1 = stackOut_27_1;
          stackIn_28_0 = stackOut_27_0;
          stackIn_28_1 = stackOut_27_1;
          if (pf.field_c != param2) {
            stackOut_29_0 = (of) (Object) stackIn_29_0;
            stackOut_29_1 = stackIn_29_1;
            stackOut_29_2 = 0;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            stackIn_30_2 = stackOut_29_2;
            break L8;
          } else {
            stackOut_28_0 = (of) (Object) stackIn_28_0;
            stackOut_28_1 = stackIn_28_1;
            stackOut_28_2 = 1;
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_30_2 = stackOut_28_2;
            break L8;
          }
        }
        L9: {
          if (((of) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2 == 0, 2, (byte) 86, 2 * (ad.field_x - -2), (2 + ad.field_x) * (4 * param1))) {
            stackOut_32_0 = 0;
            stackIn_33_0 = stackOut_32_0;
            break L9;
          } else {
            stackOut_31_0 = 1;
            stackIn_33_0 = stackOut_31_0;
            break L9;
          }
        }
        L10: {
          var9 = stackIn_33_0;
          var10 = param2.field_Rb.field_T;
          var11 = null;
          if (param4 == -83) {
            break L10;
          } else {
            rk.a(true, -46, (of) null, -111, (byte) 66);
            break L10;
          }
        }
        var12 = (im) (Object) var10.c((byte) 115);
        L11: while (true) {
          if (var12 == null) {
            return;
          } else {
            L12: {
              var13 = 0;
              if (null != var12.field_T) {
                break L12;
              } else {
                L13: {
                  var12.field_ac = new vh(0L, ge.field_s);
                  var12.a(-106, var12.field_ac);
                  var12.field_Tb = new vh(0L, tm.field_d);
                  if (!tq.field_p) {
                    break L13;
                  } else {
                    var12.a(param4 + 165, var12.field_Tb);
                    break L13;
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
                break L12;
              }
            }
            L14: {
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
                break L14;
              } else {
                var21 += 42;
                break L14;
              }
            }
            L15: {
              var20 = lr.a(var12.field_ac.field_I, var20, var21);
              if (var20.equals((Object) (Object) var12.field_jc)) {
                stackOut_45_0 = 0;
                stackIn_46_0 = stackOut_45_0;
                break L15;
              } else {
                stackOut_44_0 = 1;
                stackIn_46_0 = stackOut_44_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_46_0;
              if (var12.field_bc >= 4) {
                var20 = "<img=" + (gf.field_a + -4 + var12.field_bc) + ">" + var20;
                break L16;
              } else {
                if (var12.field_bc > 0) {
                  var20 = "<img=" + (var12.field_bc - 1) + ">" + var20;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              var12.field_ac.field_nb = var20;
              if (!var12.c(true)) {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Pb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var12.field_Rb < var6) {
                      break L19;
                    } else {
                      if (var12.field_Xb < var7) {
                        break L19;
                      } else {
                        if ((var8 & ~var12.field_Nb) <= 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  var24_int = 8421504;
                  var23_int = 8414771;
                  break L18;
                }
                L21: {
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
                      var12.field_ac.field_nb = nr.a(new String[1], -1, ma.field_f);
                      var12.field_Zb.field_nb = be.field_K;
                      break L21;
                    } else {
                      if (var12.field_Yb) {
                        var12.field_ac.field_nb = nr.a(new String[1], -1, dj.field_j);
                        var12.field_lc.field_nb = ie.field_b;
                        var12.field_Zb.field_nb = qa.field_u;
                        break L21;
                      } else {
                        var12.field_lc.field_nb = kn.field_k;
                        break L21;
                      }
                    }
                  } else {
                    if (!em.field_L.field_ec) {
                      var12.field_Zb.field_nb = bl.field_e;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (null == em.field_L) {
                    break L22;
                  } else {
                    int discarded$5 = 85;
                    if (!cj.e()) {
                      break L22;
                    } else {
                      if (var12.field_Sb == ve.field_m) {
                        break L22;
                      } else {
                        L23: {
                          if (null != var12.field_lc.field_nb) {
                            var26 = var12.field_lc.b(true) - -(kj.field_j * 2);
                            var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                            var25_int = var25_int + var26;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (null != var12.field_Zb.field_nb) {
                          L24: {
                            if (param2 == wo.field_f) {
                              var26 = 40;
                              break L24;
                            } else {
                              var26 = var12.field_Zb.b(true) - -(kj.field_j * 2);
                              break L24;
                            }
                          }
                          var12.field_Zb.b(var19, 2147483647, var25_int, var26, ad.field_x);
                          var25_int = var25_int + var26;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
                L25: {
                  stackOut_82_0 = var12.field_ac;
                  stackOut_82_1 = var19;
                  stackOut_82_2 = 2147483647;
                  stackOut_82_3 = var25_int;
                  stackIn_84_0 = stackOut_82_0;
                  stackIn_84_1 = stackOut_82_1;
                  stackIn_84_2 = stackOut_82_2;
                  stackIn_84_3 = stackOut_82_3;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  stackIn_83_2 = stackOut_82_2;
                  stackIn_83_3 = stackOut_82_3;
                  if (!tq.field_p) {
                    stackOut_84_0 = (vh) (Object) stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = stackIn_84_2;
                    stackOut_84_3 = stackIn_84_3;
                    stackOut_84_4 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    stackIn_85_2 = stackOut_84_2;
                    stackIn_85_3 = stackOut_84_3;
                    stackIn_85_4 = stackOut_84_4;
                    break L25;
                  } else {
                    stackOut_83_0 = (vh) (Object) stackIn_83_0;
                    stackOut_83_1 = stackIn_83_1;
                    stackOut_83_2 = stackIn_83_2;
                    stackOut_83_3 = stackIn_83_3;
                    stackOut_83_4 = 42;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    stackIn_85_2 = stackOut_83_2;
                    stackIn_85_3 = stackOut_83_3;
                    stackIn_85_4 = stackOut_83_4;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    ((vh) (Object) stackIn_85_0).b(stackIn_85_1, stackIn_85_2, stackIn_85_3, -stackIn_85_4 + (var12.field_gb - var25_int), ad.field_x);
                    var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
                    var12.field_Tb.b(var19, param4 + -2147483566, -40 + var12.field_gb, 40, ad.field_x);
                    if (!var12.field_ac.field_W) {
                      break L27;
                    } else {
                      if (var22 == 0) {
                        break L27;
                      } else {
                        kk.field_B = var12.field_jc;
                        if (null == lo.field_c) {
                          break L26;
                        } else {
                          if (null == lo.field_c[var12.field_bc]) {
                            break L26;
                          } else {
                            kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  if (!var12.field_ac.field_W) {
                    break L26;
                  } else {
                    if (null == lo.field_c) {
                      break L26;
                    } else {
                      if (lo.field_c[var12.field_bc] == null) {
                        break L26;
                      } else {
                        kk.field_B = lo.field_c[var12.field_bc];
                        break L26;
                      }
                    }
                  }
                }
                var19 = var19 + ad.field_x;
                break L17;
              } else {
                break L17;
              }
            }
            L28: {
              int discarded$6 = -126;
              var23 = vk.a(var20, var12.field_hc);
              var24 = var23;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
                var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
                var12.field_kc.field_nb = var23;
                var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_int);
                var19 = var19 + ad.field_x * var24_int;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var9 == 0) {
                var12.field_Cb = var19 + -var12.field_Db;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var13 == 0) {
                break L30;
              } else {
                param2.field_Rb.a((vh) var11, 2, (vh) (Object) var12, -119);
                break L30;
              }
            }
            L31: {
              if (var12.field_R == 0) {
                break L31;
              } else {
                if (var12.c(true)) {
                  break L31;
                } else {
                  if (0 != var12.field_lc.field_R) {
                    k.a(param3, (byte) -127, var12.field_Sb);
                    break L31;
                  } else {
                    if (0 == var12.field_Zb.field_R) {
                      ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                      break L31;
                    } else {
                      int discarded$7 = 0;
                      jk.a(var12.field_Sb, param3);
                      break L31;
                    }
                  }
                }
              }
            }
            L32: {
              if (!var12.field_db) {
                break L32;
              } else {
                if (!var12.c(true)) {
                  L33: {
                    var24 = null;
                    if (var12.field_Sb == ve.field_m) {
                      L34: {
                        if (var5_int == 0) {
                          break L34;
                        } else {
                          if (!var12.field_Pb) {
                            var24 = nr.field_db;
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      if (var7 > var12.field_Xb) {
                        L35: {
                          var25_int = var7 + -var12.field_Xb;
                          if (var25_int != 1) {
                            break L35;
                          } else {
                            var24 = rf.field_f;
                            break L35;
                          }
                        }
                        var24 = nr.a(new String[2], -1, vm.field_n);
                        break L33;
                      } else {
                        if (var12.field_Rb < var6) {
                          var24 = nr.a(new String[2], -1, ld.field_i);
                          break L33;
                        } else {
                          if (-1 != (var8 & var12.field_Nb)) {
                            var25_int = s.a(~var12.field_Nb & var8, (byte) 111);
                            var24 = dl.field_a;
                            if (var25_int <= 0) {
                              break L33;
                            } else {
                              if (null == fg.field_f) {
                                break L33;
                              } else {
                                if (fg.field_f.length < var25_int) {
                                  break L33;
                                } else {
                                  if (fg.field_f[var25_int - 1] != null) {
                                    var24 = fg.field_f[var25_int - 1][1];
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                    } else {
                      L36: {
                        if (var5_int == 0) {
                          break L36;
                        } else {
                          if (!var12.field_Pb) {
                            var24 = nr.a(new String[1], -1, dq.field_c);
                            break L33;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (var7 <= var12.field_Xb) {
                        if (var6 <= var12.field_Rb) {
                          if (-1 == (var8 & var12.field_Nb)) {
                            break L33;
                          } else {
                            var25_int = s.a(~var12.field_Nb & var8, (byte) 100);
                            var24 = nr.a(new String[1], -1, en.field_a);
                            if (var25_int <= 0) {
                              break L33;
                            } else {
                              if (fg.field_f == null) {
                                break L33;
                              } else {
                                if (var25_int > fg.field_f.length) {
                                  break L33;
                                } else {
                                  if (null == fg.field_f[-1 + var25_int]) {
                                    break L33;
                                  } else {
                                    var24 = nr.a(new String[1], -1, fg.field_f[var25_int - 1][2]);
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = nr.a(new String[2], -1, jq.field_a);
                          break L33;
                        }
                      } else {
                        L37: {
                          var25_int = -var12.field_Xb + var7;
                          if (1 != var25_int) {
                            break L37;
                          } else {
                            var24 = nr.a(new String[1], -1, jd.field_i);
                            break L37;
                          }
                        }
                        var24 = nr.a(new String[2], -1, sm.field_A);
                        break L33;
                      }
                    }
                  }
                  if (var24 != null) {
                    var24 = "<col=A00000>" + var24;
                    var30 = var24;
                    var25 = var30;
                    var24 = var25;
                    var30 = var24;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L38: while (true) {
                      if (dr.field_c <= var27_int) {
                        L39: {
                          L40: {
                            if (param2 != wo.field_f) {
                              break L40;
                            } else {
                              int discarded$8 = 85;
                              if (cj.e()) {
                                if (var26 == 0) {
                                  var24 = var24 + "<br>" + nr.a(new String[1], -1, ii.field_c);
                                  break L39;
                                } else {
                                  var24 = var24 + "<br>" + hm.field_g + var25;
                                  break L39;
                                }
                              } else {
                                break L40;
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var24 + "<br>" + nr.a(new String[1], -1, sf.field_x);
                            break L39;
                          } else {
                            var24 = var24 + "<br>" + tp.field_d + var25;
                            break L39;
                          }
                        }
                        L41: {
                          if (param2 != wo.field_f) {
                            break L41;
                          } else {
                            int discarded$9 = 85;
                            if (cj.e()) {
                              break L41;
                            } else {
                              var27 = em.field_L.field_Ob;
                              var24 = var24 + "<br>" + nr.a(new String[1], param4 ^ 82, ke.field_b);
                              break L41;
                            }
                          }
                        }
                        kk.field_B = var24;
                        break L32;
                      } else {
                        L42: {
                          var28 = 255 & em.field_L.field_tc[var27_int];
                          var29 = 0;
                          if (dl.field_j == null) {
                            break L42;
                          } else {
                            if (dl.field_j[var27_int] != null) {
                              if (!dl.field_j[var27_int][var28]) {
                                break L42;
                              } else {
                                if (var12.field_Pb) {
                                  break L42;
                                } else {
                                  var29 = 1;
                                  break L42;
                                }
                              }
                            } else {
                              break L42;
                            }
                          }
                        }
                        L43: {
                          if (ci.field_d == null) {
                            break L43;
                          } else {
                            if (ci.field_d[var27_int] == null) {
                              break L43;
                            } else {
                              L44: {
                                var30_int = ci.field_d[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (rg.field_s) {
                                    break L44;
                                  } else {
                                    if (var12.field_Pb) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var30_int <= var12.field_Rb) {
                                break L43;
                              } else {
                                var29 = 1;
                                break L43;
                              }
                            }
                          }
                        }
                        L45: {
                          if (null == w.field_j) {
                            break L45;
                          } else {
                            if (w.field_j[var27_int] == null) {
                              break L45;
                            } else {
                              L46: {
                                var30_int = w.field_j[var27_int][var28];
                                if (var30_int == 0) {
                                  break L46;
                                } else {
                                  if (rg.field_s) {
                                    break L46;
                                  } else {
                                    if (var12.field_Pb) {
                                      break L46;
                                    } else {
                                      var29 = 1;
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (var30_int > var12.field_Xb) {
                                var29 = 1;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (op.field_a == null) {
                            break L47;
                          } else {
                            if (op.field_a[var27_int] != null) {
                              if ((op.field_a[var27_int][var28] & ~var12.field_Nb) != 0) {
                                var29 = 1;
                                break L47;
                              } else {
                                break L47;
                              }
                            } else {
                              break L47;
                            }
                          }
                        }
                        L48: {
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
                              break L48;
                            } else {
                              var25 = var30;
                              break L48;
                            }
                          } else {
                            break L48;
                          }
                        }
                        var27_int++;
                        continue L38;
                      }
                    }
                  } else {
                    break L32;
                  }
                } else {
                  var11 = (Object) (Object) var12;
                  var12 = (im) (Object) var10.f((byte) -5);
                  continue L11;
                }
              }
            }
            var11 = (Object) (Object) var12;
            var12 = (im) (Object) var10.f((byte) -5);
            continue L11;
          }
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
                    var7_int = ((rk) this).field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L4;
                    } else {
                      int incrementValue$8 = param1;
                      param1++;
                      param3[incrementValue$8] = (byte)(~var10);
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
                      var7_int = ((rk) this).field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$9 = param1;
                      param1++;
                      param3[incrementValue$9] = (byte)var10;
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
                    if (-1 == (32 & var9)) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = ((rk) this).field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param1;
                      param1++;
                      param3[incrementValue$10] = (byte)(~var10);
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
                      var7_int = ((rk) this).field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L10;
                    } else {
                      int incrementValue$11 = param1;
                      param1++;
                      param3[incrementValue$11] = (byte)(~var10);
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
                      var7_int = ((rk) this).field_c[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$12 = param1;
                      param1++;
                      param3[incrementValue$12] = (byte)(~var10);
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
                      var7_int = ((rk) this).field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] >= 0) {
                      break L14;
                    } else {
                      int incrementValue$13 = param1;
                      param1++;
                      param3[incrementValue$13] = (byte)(~var10);
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
                      var7_int = ((rk) this).field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (((rk) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param1;
                      param1++;
                      param3[incrementValue$14] = (byte)var10;
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
                    if (-1 != (1 & var9)) {
                      var7_int = ((rk) this).field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = ((rk) this).field_c[var7_int];
                    if (0 > ((rk) this).field_c[var7_int]) {
                      int incrementValue$15 = param1;
                      param1++;
                      param3[incrementValue$15] = (byte)(~var10);
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
                    field_h = null;
                    break L19;
                  }
                }
                stackOut_64_0 = -param2 + 1 + var8;
                stackIn_65_0 = stackOut_64_0;
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
          L20: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("rk.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          L21: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param5 + 41);
        }
        return stackIn_65_0;
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
            var8 = param3 << 3;
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
                stackOut_14_0 = -param3 + (7 + var8 >> 3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                var9 = param4[param0] & 255;
                var10 = ((rk) this).field_b[var9];
                var11 = ((rk) this).field_a[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = (var11 + var13 - 1 >> 3) + var12;
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
            stackOut_16_0 = (RuntimeException) var7;
            stackOut_16_1 = new StringBuilder().append("rk.C(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param3).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param5 + 41);
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = Pool.field_O;
        try {
          if (tl.field_J == ta.field_a) {
            L0: {
              L1: {
                var2_long = rl.a((byte) -103);
                if (0 == ii.field_d) {
                  break L1;
                } else {
                  if (wq.field_b >= 0) {
                    break L1;
                  } else {
                    L2: {
                      var4_ref_fr = (fr) (Object) vn.field_g.c((byte) -112);
                      if (var4_ref_fr == null) {
                        break L2;
                      } else {
                        if (var4_ref_fr.field_p < var2_long) {
                          var4_ref_fr.a((byte) -117);
                          of.field_Pb = var4_ref_fr.field_l.length;
                          kn.field_e.field_v = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= of.field_Pb) {
                              hb.field_e = vd.field_g;
                              vd.field_g = ia.field_l;
                              ia.field_l = uq.field_c;
                              uq.field_c = var4_ref_fr.field_r;
                              stackOut_12_0 = 1;
                              stackIn_13_0 = stackOut_12_0;
                              return stackIn_13_0 != 0;
                            } else {
                              kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_15_0 = wq.field_b;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  }
                }
              }
              stackOut_14_0 = wq.field_b;
              stackIn_17_0 = stackOut_14_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_17_0 >= 0) {
                  break L5;
                } else {
                  kn.field_e.field_v = 0;
                  if (!lq.b((byte) 107, 1)) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    wq.field_b = kn.field_e.q(107);
                    kn.field_e.field_v = 0;
                    of.field_Pb = param1[wq.field_b];
                    break L5;
                  }
                }
              }
              int discarded$1 = 39;
              if (!wf.a()) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                return stackIn_26_0 != 0;
              } else {
                if (ii.field_d != 0) {
                  L6: {
                    var4 = ii.field_d;
                    if (hn.field_a == 0.0) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
                      if (var4 >= 0) {
                        break L6;
                      } else {
                        var4 = 0;
                        break L6;
                      }
                    }
                  }
                  var5 = new fr(var2_long + (long)var4, wq.field_b, new byte[of.field_Pb]);
                  var6 = 0;
                  L7: while (true) {
                    if (var6 >= of.field_Pb) {
                      vn.field_g.b((byte) -64, (ma) (Object) var5);
                      wq.field_b = -1;
                      stackOut_16_0 = wq.field_b;
                      stackIn_17_0 = stackOut_16_0;
                      continue L4;
                    } else {
                      var5.field_l[var6] = kn.field_e.field_t[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  hb.field_e = vd.field_g;
                  vd.field_g = ia.field_l;
                  ia.field_l = uq.field_c;
                  uq.field_c = wq.field_b;
                  wq.field_b = -1;
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0 != 0;
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
          L8: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("rk.F(").append(0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
    }

    final static int b(boolean param0) {
        if (!param0) {
            rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
        }
        return di.field_e + (ol.field_e << 2) + (ec.field_i << 4);
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_h = null;
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
            ((rk) this).field_a = param0;
            ((rk) this).field_b = new int[var2_int];
            ((rk) this).field_c = new int[8];
            var3 = new int[33];
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
                      var8 = var3[var6];
                      ((rk) this).field_b[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var9 = var7 | var8;
                        var10 = var6 + -1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var3[var10];
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
                    var3[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            ((rk) this).field_c[var10] = ~var5;
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
                                  if (((rk) this).field_c[var10] != 0) {
                                    break L8;
                                  } else {
                                    ((rk) this).field_c[var10] = var4;
                                    break L8;
                                  }
                                }
                                var10 = ((rk) this).field_c[var10];
                                break L7;
                              }
                            }
                            L9: {
                              if (((rk) this).field_c.length > var10) {
                                break L9;
                              } else {
                                var13 = new int[((rk) this).field_c.length * 2];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= ((rk) this).field_c.length) {
                                    ((rk) this).field_c = var13;
                                    break L9;
                                  } else {
                                    var13[var14] = ((rk) this).field_c[var14];
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
                          if (var8 != var3[var10]) {
                            break L11;
                          } else {
                            var3[var10] = var9;
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
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("rk.<init>(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
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
