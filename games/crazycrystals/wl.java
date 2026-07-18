/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends ij {
    volatile boolean field_n;
    boolean field_q;
    boolean field_l;
    static volatile boolean field_m;
    static dl[][] field_p;
    static dl field_o;

    abstract byte[] e(int param0);

    final static void a(int[] param0, jg param1, int param2, boolean param3, boolean param4, int[] param5, boolean param6) {
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_61_0 = 0;
        short stackOut_61_1 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
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
        var30 = CrazyCrystals.field_B;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 2;
            var22 = param0[4] >> 2;
            var23 = param0[5] >> 2;
            var24 = param0[6] >> 2;
            var25 = param0[7] >> 2;
            var26 = param0[8] >> 2;
            var27 = param0[9] >> 2;
            var28 = param0[10] >> 2;
            var12 = param5[5] * var23 + param5[4] * var22 + param5[3] * var21 >> 14;
            var29 = param0[11] >> 2;
            var13 = param5[3] * var24 + (var25 * param5[4] + var26 * param5[5]) >> 14;
            var14 = var29 * param5[5] + (param5[3] * var27 - -(param5[4] * var28)) >> 14;
            var20 = var29 * param5[11] + param5[10] * var28 + param5[9] * var27 >> 14;
            var19 = var24 * param5[param2] - (-(var25 * param5[10]) + -(param5[11] * var26)) >> 14;
            var16 = param5[8] * var26 + var25 * param5[7] + param5[6] * var24 >> 14;
            var18 = param5[9] * var21 - (-(var22 * param5[10]) - param5[11] * var23) >> 14;
            var17 = var29 * param5[8] + (var27 * param5[6] - -(var28 * param5[7])) >> 14;
            var15 = var21 * param5[6] - -(var22 * param5[7]) + param5[8] * var23 >> 14;
            var21 = -param0[0] + param5[0];
            var22 = param5[1] + -param0[1];
            var23 = param5[2] - param0[2];
            var9 = var23 * param0[5] + (var21 * param0[3] + var22 * param0[4]) >> 16 + -li.field_c;
            var11 = param0[9] * var21 + (param0[10] * var22 - -(var23 * param0[11])) >> 16;
            var10 = var23 * param0[8] + param0[6] * var21 - -(var22 * param0[7]) >> 16 - li.field_c;
            var21 = nb.field_h;
            var22 = nb.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var23 <= ~param1.field_n) {
                    break L3;
                  } else {
                    var24 = param1.field_L[var23];
                    var25 = param1.field_G[var23];
                    var26 = param1.field_b[var23];
                    var27 = (var15 * var25 + var12 * var24 - -(var26 * var18) >> 16 + -li.field_c) + var9;
                    var28 = var10 - -(var19 * var26 + var25 * var16 + var13 * var24 >> 16 + -li.field_c);
                    var29 = var11 + (var26 * var20 + var14 * var24 + var25 * var17 >> 16);
                    stackOut_3_0 = ~var29;
                    stackOut_3_1 = -51;
                    stackIn_62_0 = stackOut_3_0;
                    stackIn_62_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var30 != 0) {
                      L4: while (true) {
                        if (stackIn_62_0 >= stackIn_62_1) {
                          break L2;
                        } else {
                          if (~cf.field_b.length >= ~var18) {
                            break L2;
                          } else {
                            var19 = param1.field_a[var18];
                            var20 = param1.field_N[var18];
                            var21 = param1.field_u[var18];
                            cf.field_b[var18] = var15 * var21 + var12 * var20 + var9 * var19 >> 16;
                            jp.field_a[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
                            vm.field_d[var18] = var19 * var11 - (-(var14 * var20) + -(var21 * var17)) >> 16;
                            var18++;
                            if (var30 == 0) {
                              stackOut_61_0 = var18;
                              stackOut_61_1 = param1.field_D;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              continue L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_4_0 <= stackIn_4_1) {
                            break L6;
                          } else {
                            cf.field_g[var23] = -2147483648;
                            if (var30 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          dn.field_a[var23] = var21 - -(var27 / var29);
                          qk.field_E[var23] = var28 / var29 + var22;
                          cf.field_g[var23] = var29;
                          if (var29 > var8) {
                            var8 = var29;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (~var29 > ~var7_int) {
                          var7_int = var29;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L8: {
                        if (param3) {
                          gl.field_d[var23] = var27 >> li.field_c;
                          qm.field_q[var23] = var28 >> li.field_c;
                          ff.field_b[var23] = var29;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var23++;
                      if (var30 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L9: {
                  L10: {
                    if (param1.field_P == null) {
                      break L10;
                    } else {
                      if (null == param1.field_f) {
                        break L10;
                      } else {
                        if (null == param1.field_H) {
                          break L10;
                        } else {
                          if (null == param1.field_q) {
                            break L10;
                          } else {
                            if (param1.field_d == null) {
                              break L10;
                            } else {
                              if (param1.field_M == null) {
                                break L10;
                              } else {
                                if (null == param1.field_z) {
                                  break L10;
                                } else {
                                  if (param1.field_m == null) {
                                    break L10;
                                  } else {
                                    if (param1.field_y == null) {
                                      break L10;
                                    } else {
                                      var23 = 0;
                                      L11: while (true) {
                                        if (param1.field_I <= var23) {
                                          break L10;
                                        } else {
                                          var24 = param1.field_P[var23];
                                          var25 = param1.field_f[var23];
                                          var26 = param1.field_H[var23];
                                          qa.field_i[var23] = (var12 * var24 - (-(var15 * var25) + -(var18 * var26)) >> 16) + var9;
                                          fh.field_k[var23] = var10 - -(var25 * var16 + var24 * var13 + var19 * var26 >> 16);
                                          vg.field_b[var23] = (var14 * var24 - (-(var17 * var25) - var26 * var20) >> 16) + var11;
                                          var24 = param1.field_q[var23];
                                          var25 = param1.field_d[var23];
                                          var26 = param1.field_M[var23];
                                          ol.field_C[var23] = (var15 * var25 + (var12 * var24 + var26 * var18) >> 16) + var9;
                                          ud.field_bb[var23] = (var24 * var13 - -(var16 * var25) + var26 * var19 >> 16) + var10;
                                          ol.field_y[var23] = var11 - -(var26 * var20 + var14 * var24 - -(var17 * var25) >> 16);
                                          var24 = param1.field_z[var23];
                                          var25 = param1.field_m[var23];
                                          var26 = param1.field_y[var23];
                                          hp.field_q[var23] = (var18 * var26 + var25 * var15 + var24 * var12 >> 16) + var9;
                                          vf.field_e[var23] = var10 + (var25 * var16 + (var13 * var24 - -(var19 * var26)) >> 16);
                                          d.field_a[var23] = (var25 * var17 + var24 * var14 - -(var26 * var20) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L9;
                                          } else {
                                            if (var30 == 0) {
                                              continue L11;
                                            } else {
                                              break L10;
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
                        }
                      }
                    }
                  }
                  if (param6) {
                    var9 = param5[3];
                    var10 = param5[4];
                    var11 = param5[5];
                    var12 = param5[6];
                    var13 = param5[7];
                    var14 = param5[8];
                    var15 = param5[9];
                    var16 = param5[10];
                    var17 = param5[11];
                    break L9;
                  } else {
                    break L2;
                  }
                }
                var18 = 0;
                L12: while (true) {
                  stackOut_61_0 = var18;
                  stackOut_61_1 = param1.field_D;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  if (stackIn_62_0 >= stackIn_62_1) {
                    break L2;
                  } else {
                    if (~cf.field_b.length >= ~var18) {
                      break L2;
                    } else {
                      var19 = param1.field_a[var18];
                      var20 = param1.field_N[var18];
                      var21 = param1.field_u[var18];
                      cf.field_b[var18] = var15 * var21 + var12 * var20 + var9 * var19 >> 16;
                      jp.field_a[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
                      vm.field_d[var18] = var19 * var11 - (-(var14 * var20) + -(var21 * var17)) >> 16;
                      var18++;
                      if (var30 == 0) {
                        continue L12;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              ok.a(param1, var7_int, (byte) -119, param4, var8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("wl.K(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L13;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L13;
            }
          }
          L14: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
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
              break L14;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L14;
            }
          }
          L15: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param5 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L15;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L15;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param6 + ')');
        }
    }

    wl() {
        ((wl) this).field_n = true;
    }

    final static dl[] a(int param0, int param1, db param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        dl[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 53) {
                break L1;
              } else {
                int[] discarded$2 = wl.a((byte) 54);
                break L1;
              }
            }
            if (gm.a(param2, param0, true, param1)) {
              stackOut_6_0 = mm.a(71);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (dl[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("wl.J(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static int[] a(byte param0) {
        RuntimeException var1 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -26) {
                break L1;
              } else {
                field_m = false;
                break L1;
              }
            }
            stackOut_3_0 = new int[8];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "wl.L(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              sm.field_j = (63 & param1) >> 4;
              j.field_j = (param1 & 13) >> 2;
              if (sm.field_j > 2) {
                sm.field_j = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (j.field_j <= 2) {
                break L2;
              } else {
                j.field_j = 2;
                break L2;
              }
            }
            L3: {
              no.field_m = 3 & param1;
              if (no.field_m <= 2) {
                break L3;
              } else {
                no.field_m = 2;
                break L3;
              }
            }
            L4: {
              if (param0 == 7) {
                break L4;
              } else {
                field_o = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "wl.N(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            field_o = null;
            if (param0 >= -38) {
                int[] discarded$0 = wl.a((byte) 90);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "wl.M(" + param0 + ')');
        }
    }

    abstract int b(byte param0);

    final static dl a(String param0, db param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        dl stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var4_int = param1.a(param3, -1);
            if (param2 == 10) {
              var5 = param1.a(-2862, param0, var4_int);
              stackOut_3_0 = sj.a(var5, var4_int, param1, 28);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dl) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("wl.O(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
    }
}
