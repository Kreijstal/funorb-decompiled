/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    String field_a;
    private int field_g;
    private int field_e;
    private int field_d;
    private qk[] field_b;
    float field_c;
    static hi field_f;

    final boolean a(int param0) {
        RuntimeException var2 = null;
        qk var2_ref = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                gg.c(-8);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~((gg) this).field_g <= ~((gg) this).field_e) {
                    break L4;
                  } else {
                    var2_ref = ((gg) this).field_b[((gg) this).field_g];
                    stackOut_5_0 = var2_ref.field_a.a((byte) -121);
                    stackIn_40_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        this.a((byte) -128, var2_ref, 0);
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        L5: {
                          if (var2_ref.field_f < 0) {
                            break L5;
                          } else {
                            if (!var2_ref.field_a.a((byte) -18, var2_ref.field_f)) {
                              this.a((byte) -111, var2_ref, var2_ref.field_a.a(true, var2_ref.field_f));
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var2_ref.field_g == null) {
                            break L6;
                          } else {
                            if (var2_ref.field_a.a((byte) -1, var2_ref.field_g)) {
                              break L6;
                            } else {
                              this.a((byte) -128, var2_ref, var2_ref.field_a.a(param0 + -5, var2_ref.field_g));
                              stackOut_24_0 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              return stackIn_25_0 != 0;
                            }
                          }
                        }
                        L7: {
                          if (0 <= var2_ref.field_f) {
                            break L7;
                          } else {
                            if (var2_ref.field_g != null) {
                              break L7;
                            } else {
                              if (null == var2_ref.field_d) {
                                break L7;
                              } else {
                                if (var2_ref.field_a.c(32031)) {
                                  break L7;
                                } else {
                                  this.a((byte) -117, var2_ref, var2_ref.field_a.b(-22884));
                                  stackOut_36_0 = 0;
                                  stackIn_37_0 = stackOut_36_0;
                                  return stackIn_37_0 != 0;
                                }
                              }
                            }
                          }
                        }
                        ((gg) this).field_g = ((gg) this).field_g + 1;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_39_0 = 1;
                stackIn_40_0 = stackOut_39_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "gg.C(" + param0 + ')');
        }
        return stackIn_40_0 != 0;
    }

    public static void c(int param0) {
        try {
            field_f = null;
            int var1_int = 83 % ((27 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "gg.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, int[] param1, boolean param2, boolean param3, e param4, boolean param5, int[] param6) {
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_61_0 = 0;
        short stackOut_61_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var30 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              if (param0 >= 72) {
                break L1;
              } else {
                gg.b(-92);
                break L1;
              }
            }
            var21 = param1[3] >> 2;
            var22 = param1[4] >> 2;
            var23 = param1[5] >> 2;
            var24 = param1[6] >> 2;
            var25 = param1[7] >> 2;
            var26 = param1[8] >> 2;
            var27 = param1[9] >> 2;
            var28 = param1[10] >> 2;
            var29 = param1[11] >> 2;
            var13 = param6[3] * var24 + param6[4] * var25 - -(param6[5] * var26) >> 14;
            var12 = param6[5] * var23 + var21 * param6[3] - -(var22 * param6[4]) >> 14;
            var15 = param6[8] * var23 + (var21 * param6[6] + var22 * param6[7]) >> 14;
            var16 = param6[7] * var25 + param6[6] * var24 - -(param6[8] * var26) >> 14;
            var20 = var28 * param6[10] + var27 * param6[9] + var29 * param6[11] >> 14;
            var14 = param6[5] * var29 + (var28 * param6[4] + var27 * param6[3]) >> 14;
            var17 = param6[7] * var28 + (param6[6] * var27 - -(var29 * param6[8])) >> 14;
            var18 = param6[11] * var23 + var21 * param6[9] + param6[10] * var22 >> 14;
            var19 = var24 * param6[9] - (-(param6[10] * var25) - var26 * param6[11]) >> 14;
            var21 = -param1[0] + param6[0];
            var22 = -param1[1] + param6[1];
            var23 = -param1[2] + param6[2];
            var9 = var23 * param1[5] + param1[3] * var21 - -(param1[4] * var22) >> 16 - nd.field_m;
            var10 = var23 * param1[8] + var21 * param1[6] + var22 * param1[7] >> -nd.field_m + 16;
            var11 = var22 * param1[10] + var21 * param1[9] - -(var23 * param1[11]) >> 16;
            var21 = ka.field_f;
            var22 = ka.field_g;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (param4.field_M <= var23) {
                      break L5;
                    } else {
                      var24 = param4.field_v[var23];
                      var25 = param4.field_d[var23];
                      var26 = param4.field_B[var23];
                      var27 = var9 + (var25 * var15 + var12 * var24 - -(var26 * var18) >> 16 - nd.field_m);
                      var28 = (var25 * var16 + (var24 * var13 - -(var26 * var19)) >> -nd.field_m + 16) + var10;
                      var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> 16);
                      stackOut_6_0 = ~var29;
                      stackOut_6_1 = -51;
                      stackIn_62_0 = stackOut_6_0;
                      stackIn_62_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        L6: while (true) {
                          if (stackIn_62_0 >= stackIn_62_1) {
                            break L4;
                          } else {
                            stackOut_63_0 = ~var18;
                            stackOut_63_1 = ~mk.field_w.length;
                            stackIn_71_0 = stackOut_63_0;
                            stackIn_71_1 = stackOut_63_1;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = stackIn_64_1;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              if (stackIn_66_0 <= stackIn_66_1) {
                                break L4;
                              } else {
                                var19 = param4.field_e[var18];
                                var20 = param4.field_F[var18];
                                var21 = param4.field_L[var18];
                                mk.field_w[var18] = var15 * var21 + (var9 * var19 + var12 * var20) >> 16;
                                nh.field_j[var18] = var19 * var10 + (var20 * var13 + var21 * var16) >> 16;
                                d.field_b[var18] = var21 * var17 + (var14 * var20 + var19 * var11) >> 16;
                                var18++;
                                if (var30 == 0) {
                                  stackOut_61_0 = var18;
                                  stackOut_61_1 = param4.field_l;
                                  stackIn_62_0 = stackOut_61_0;
                                  stackIn_62_1 = stackOut_61_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_7_0 <= stackIn_7_1) {
                              break L8;
                            } else {
                              nd.field_l[var23] = -2147483648;
                              if (var30 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            sg.field_a[var23] = var27 / var29 + var21;
                            d.field_a[var23] = var22 + var28 / var29;
                            if (var7_int <= var29) {
                              break L9;
                            } else {
                              var7_int = var29;
                              break L9;
                            }
                          }
                          nd.field_l[var23] = var29;
                          if (~var8 <= ~var29) {
                            break L7;
                          } else {
                            var8 = var29;
                            break L7;
                          }
                        }
                        L10: {
                          if (!param5) {
                            break L10;
                          } else {
                            el.field_m[var23] = var27 >> nd.field_m;
                            hi.field_h[var23] = var28 >> nd.field_m;
                            rk.field_q[var23] = var29;
                            break L10;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (param4.field_j == null) {
                        break L12;
                      } else {
                        if (param4.field_a == null) {
                          break L12;
                        } else {
                          if (null == param4.field_c) {
                            break L12;
                          } else {
                            if (null == param4.field_g) {
                              break L12;
                            } else {
                              if (null == param4.field_Q) {
                                break L12;
                              } else {
                                if (param4.field_p == null) {
                                  break L12;
                                } else {
                                  if (param4.field_D == null) {
                                    break L12;
                                  } else {
                                    if (null == param4.field_E) {
                                      break L12;
                                    } else {
                                      if (null != param4.field_m) {
                                        var23 = 0;
                                        L13: while (true) {
                                          if (param4.field_C <= var23) {
                                            break L12;
                                          } else {
                                            var24 = param4.field_j[var23];
                                            var25 = param4.field_a[var23];
                                            var26 = param4.field_c[var23];
                                            db.field_e[var23] = var9 - -(var18 * var26 + (var24 * var12 + var15 * var25) >> 16);
                                            me.field_i[var23] = var10 - -(var13 * var24 - (-(var16 * var25) + -(var26 * var19)) >> 16);
                                            ec.field_c[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 16) + var11;
                                            var24 = param4.field_g[var23];
                                            var25 = param4.field_Q[var23];
                                            var26 = param4.field_p[var23];
                                            nk.field_e[var23] = (var18 * var26 + var24 * var12 + var15 * var25 >> 16) + var9;
                                            qe.field_z[var23] = var10 + (var26 * var19 + var16 * var25 + var13 * var24 >> 16);
                                            wi.field_d[var23] = (var25 * var17 + var14 * var24 - -(var26 * var20) >> 16) + var11;
                                            var24 = param4.field_D[var23];
                                            var25 = param4.field_E[var23];
                                            var26 = param4.field_m[var23];
                                            bl.field_d[var23] = (var15 * var25 + var12 * var24 - -(var18 * var26) >> 16) + var9;
                                            rl.field_d[var23] = var10 - -(var19 * var26 + (var25 * var16 + var13 * var24) >> 16);
                                            kf.field_g[var23] = (var14 * var24 - -(var17 * var25) - -(var26 * var20) >> 16) + var11;
                                            var23++;
                                            if (var30 != 0) {
                                              break L11;
                                            } else {
                                              if (var30 == 0) {
                                                continue L13;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param2) {
                      var9 = param6[3];
                      var10 = param6[4];
                      var11 = param6[5];
                      var12 = param6[6];
                      var13 = param6[7];
                      var14 = param6[8];
                      var15 = param6[9];
                      var16 = param6[10];
                      var17 = param6[11];
                      break L11;
                    } else {
                      break L4;
                    }
                  }
                  var18 = 0;
                  L14: while (true) {
                    stackOut_61_0 = var18;
                    stackOut_61_1 = param4.field_l;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (stackIn_62_0 >= stackIn_62_1) {
                      break L4;
                    } else {
                      stackOut_63_0 = ~var18;
                      stackOut_63_1 = ~mk.field_w.length;
                      stackIn_71_0 = stackOut_63_0;
                      stackIn_71_1 = stackOut_63_1;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        stackOut_64_0 = stackIn_64_0;
                        stackOut_64_1 = stackIn_64_1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        if (stackIn_66_0 <= stackIn_66_1) {
                          break L4;
                        } else {
                          var19 = param4.field_e[var18];
                          var20 = param4.field_F[var18];
                          var21 = param4.field_L[var18];
                          mk.field_w[var18] = var15 * var21 + (var9 * var19 + var12 * var20) >> 16;
                          nh.field_j[var18] = var19 * var10 + (var20 * var13 + var21 * var16) >> 16;
                          d.field_b[var18] = var21 * var17 + (var14 * var20 + var19 * var11) >> 16;
                          var18++;
                          if (var30 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_70_0 = var8;
                stackOut_70_1 = -128;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                break L3;
              }
              ej.a(stackIn_71_0, (byte) stackIn_71_1, param4, param3, var7_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var7;
            stackOut_73_1 = new StringBuilder().append("gg.E(").append(param0).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L15;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L15;
            }
          }
          L16: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L16;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L16;
            }
          }
          L17: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param5).append(',');
            stackIn_84_0 = stackOut_81_0;
            stackIn_84_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param6 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L17;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_85_0 = stackOut_82_0;
              stackIn_85_1 = stackOut_82_1;
              stackIn_85_2 = stackOut_82_2;
              break L17;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + ')');
        }
    }

    final static void b(int param0) {
        try {
            dg.b(-81);
            ba.a(119, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "gg.D(" + param0 + ')');
        }
    }

    private gg() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "gg.<init>()");
        }
    }

    private final void a(byte param0, qk param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -107) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_float = (float)(1 + ((gg) this).field_g) + (float)param2 / 100.0f;
                if (param2 != 0) {
                  break L3;
                } else {
                  ((gg) this).field_a = param1.field_b;
                  if (!Transmogrify.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((gg) this).field_a = param1.field_d + " - " + param2 + "%";
              break L2;
            }
            ((gg) this).field_c = (float)((gg) this).field_d * var4_float / (float)(1 + ((gg) this).field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("gg.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new hi();
    }
}
