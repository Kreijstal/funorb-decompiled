/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi {
    java.awt.Image field_b;
    static int[] field_c;
    int[] field_e;
    static int field_d;
    int field_g;
    int field_f;
    static int field_a;

    final static void a(n param0, byte param1, int[] param2, boolean param3, boolean param4, int[] param5, boolean param6) {
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
        int var31 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        short stackOut_59_1 = 0;
        boolean stackOut_68_0 = false;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var31 = stellarshard.field_B;
        try {
          L0: {
            var7_int = 2147483647;
            var9 = -47 % ((param1 - -36) / 57);
            var8 = -2147483648;
            var22 = param5[3] >> 2;
            var23 = param5[4] >> 2;
            var24 = param5[5] >> 2;
            var25 = param5[6] >> 2;
            var26 = param5[7] >> 2;
            var27 = param5[8] >> 2;
            var28 = param5[9] >> 2;
            var29 = param5[10] >> 2;
            var30 = param5[11] >> 2;
            var14 = var26 * param2[4] + (var25 * param2[3] + var27 * param2[5]) >> 14;
            var13 = param2[5] * var24 + (param2[4] * var23 + param2[3] * var22) >> 14;
            var17 = var25 * param2[6] - (-(var26 * param2[7]) - param2[8] * var27) >> 14;
            var19 = var24 * param2[11] + var22 * param2[9] + param2[10] * var23 >> 14;
            var18 = param2[8] * var30 + (var29 * param2[7] + var28 * param2[6]) >> 14;
            var20 = param2[10] * var26 + (var25 * param2[9] - -(var27 * param2[11])) >> 14;
            var21 = var30 * param2[11] + var28 * param2[9] + param2[10] * var29 >> 14;
            var16 = param2[8] * var24 + param2[6] * var22 + param2[7] * var23 >> 14;
            var15 = var28 * param2[3] + param2[4] * var29 - -(var30 * param2[5]) >> 14;
            var22 = param2[0] + -param5[0];
            var23 = -param5[1] + param2[1];
            var24 = param2[2] - param5[2];
            var10 = param5[3] * var22 + (param5[4] * var23 - -(param5[5] * var24)) >> 16 + -fc.field_e;
            var12 = var23 * param5[10] + (param5[9] * var22 + var24 * param5[11]) >> 16;
            var11 = param5[8] * var24 + param5[7] * var23 + param5[6] * var22 >> 16 + -fc.field_e;
            var22 = cc.field_n;
            var23 = cc.field_p;
            var24 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~var24 <= ~param0.field_n) {
                      break L4;
                    } else {
                      var25 = param0.field_f[var24];
                      var26 = param0.field_b[var24];
                      var27 = param0.field_a[var24];
                      var28 = (var27 * var19 + var26 * var16 + var25 * var13 >> 16 - fc.field_e) + var10;
                      var29 = var11 + (var27 * var20 + var14 * var25 - -(var17 * var26) >> 16 - fc.field_e);
                      var30 = (var21 * var27 + var18 * var26 + var25 * var15 >> 16) + var12;
                      stackOut_3_0 = 50;
                      stackOut_3_1 = var30;
                      stackIn_60_0 = stackOut_3_0;
                      stackIn_60_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var31 != 0) {
                        L5: while (true) {
                          if (stackIn_60_0 >= stackIn_60_1) {
                            break L3;
                          } else {
                            stackOut_61_0 = ~hc.field_f.length;
                            stackIn_69_0 = stackOut_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            if (var31 != 0) {
                              break L2;
                            } else {
                              stackOut_62_0 = stackIn_62_0;
                              stackIn_64_0 = stackOut_62_0;
                              if (stackIn_64_0 >= ~var19) {
                                break L3;
                              } else {
                                var20 = param0.field_r[var19];
                                var21 = param0.field_e[var19];
                                var22 = param0.field_K[var19];
                                hc.field_f[var19] = var13 * var21 + var20 * var10 - -(var16 * var22) >> 16;
                                le.field_m[var19] = var17 * var22 + (var14 * var21 + var20 * var11) >> 16;
                                fl.field_d[var19] = var20 * var12 - (-(var15 * var21) + -(var18 * var22)) >> 16;
                                var19++;
                                if (var31 == 0) {
                                  stackOut_59_0 = var19;
                                  stackOut_59_1 = param0.field_D;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  continue L5;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_4_0 <= stackIn_4_1) {
                              break L7;
                            } else {
                              wl.field_P[var24] = -2147483648;
                              if (var31 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            nh.field_d[var24] = var22 - -(var28 / var30);
                            od.field_s[var24] = var23 + var29 / var30;
                            if (var7_int <= var30) {
                              break L8;
                            } else {
                              var7_int = var30;
                              break L8;
                            }
                          }
                          L9: {
                            if (var8 >= var30) {
                              break L9;
                            } else {
                              var8 = var30;
                              break L9;
                            }
                          }
                          wl.field_P[var24] = var30;
                          break L6;
                        }
                        L10: {
                          if (!param4) {
                            break L10;
                          } else {
                            aa.field_c[var24] = var28 >> fc.field_e;
                            kf.field_b[var24] = var29 >> fc.field_e;
                            be.field_b[var24] = var30;
                            break L10;
                          }
                        }
                        var24++;
                        if (var31 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (null == param0.field_O) {
                        break L12;
                      } else {
                        if (null == param0.field_B) {
                          break L12;
                        } else {
                          if (null == param0.field_w) {
                            break L12;
                          } else {
                            if (param0.field_A == null) {
                              break L12;
                            } else {
                              if (param0.field_y == null) {
                                break L12;
                              } else {
                                if (null == param0.field_j) {
                                  break L12;
                                } else {
                                  if (param0.field_o == null) {
                                    break L12;
                                  } else {
                                    if (param0.field_J == null) {
                                      break L12;
                                    } else {
                                      if (null != param0.field_q) {
                                        var24 = 0;
                                        L13: while (true) {
                                          if (~param0.field_C >= ~var24) {
                                            break L12;
                                          } else {
                                            var25 = param0.field_O[var24];
                                            var26 = param0.field_B[var24];
                                            var27 = param0.field_w[var24];
                                            ih.field_e[var24] = (var19 * var27 + var13 * var25 + var16 * var26 >> 16) + var10;
                                            ma.field_k[var24] = (var27 * var20 + (var17 * var26 + var25 * var14) >> 16) + var11;
                                            wb.field_g[var24] = (var27 * var21 + (var25 * var15 - -(var26 * var18)) >> 16) + var12;
                                            var25 = param0.field_A[var24];
                                            var26 = param0.field_y[var24];
                                            var27 = param0.field_j[var24];
                                            jf.field_k[var24] = (var27 * var19 + var26 * var16 + var25 * var13 >> 16) + var10;
                                            se.field_C[var24] = var11 + (var27 * var20 + var25 * var14 + var26 * var17 >> 16);
                                            pl.field_S[var24] = var12 - -(var27 * var21 + (var25 * var15 + var26 * var18) >> 16);
                                            var25 = param0.field_o[var24];
                                            var26 = param0.field_J[var24];
                                            var27 = param0.field_q[var24];
                                            ua.field_e[var24] = (var25 * var13 + var16 * var26 - -(var19 * var27) >> 16) + var10;
                                            nk.field_a[var24] = var11 - -(var20 * var27 + var14 * var25 + var26 * var17 >> 16);
                                            eb.field_b[var24] = var12 + (var25 * var15 - (-(var26 * var18) - var27 * var21) >> 16);
                                            var24++;
                                            if (var31 != 0) {
                                              break L11;
                                            } else {
                                              if (var31 == 0) {
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
                    if (param3) {
                      var10 = param2[3];
                      var11 = param2[4];
                      var12 = param2[5];
                      var13 = param2[6];
                      var14 = param2[7];
                      var15 = param2[8];
                      var16 = param2[9];
                      var17 = param2[10];
                      var18 = param2[11];
                      break L11;
                    } else {
                      break L3;
                    }
                  }
                  var19 = 0;
                  L14: while (true) {
                    stackOut_59_0 = var19;
                    stackOut_59_1 = param0.field_D;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    if (stackIn_60_0 >= stackIn_60_1) {
                      break L3;
                    } else {
                      stackOut_61_0 = ~hc.field_f.length;
                      stackIn_69_0 = stackOut_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      if (var31 != 0) {
                        break L2;
                      } else {
                        stackOut_62_0 = stackIn_62_0;
                        stackIn_64_0 = stackOut_62_0;
                        if (stackIn_64_0 >= ~var19) {
                          break L3;
                        } else {
                          var20 = param0.field_r[var19];
                          var21 = param0.field_e[var19];
                          var22 = param0.field_K[var19];
                          hc.field_f[var19] = var13 * var21 + var20 * var10 - -(var16 * var22) >> 16;
                          le.field_m[var19] = var17 * var22 + (var14 * var21 + var20 * var11) >> 16;
                          fl.field_d[var19] = var20 * var12 - (-(var15 * var21) + -(var18 * var22)) >> 16;
                          var19++;
                          if (var31 == 0) {
                            continue L14;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_68_0 = param6;
                stackIn_69_0 = stackOut_68_0 ? 1 : 0;
                break L2;
              }
              rh.a(stackIn_69_0 != 0, param0, (byte) -115, var7_int, var8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("vi.E(");
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L15;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L15;
            }
          }
          L16: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param1).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L16;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L16;
            }
          }
          L17: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param5 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L17;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L17;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ',' + param6 + ')');
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, byte param3);

    final void a(byte param0) {
        try {
            ti.a(((vi) this).field_e, ((vi) this).field_g, ((vi) this).field_f);
            if (param0 != -107) {
                ((vi) this).a((java.awt.Component) null, 82, 120, (byte) 92);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "vi.F(" + param0 + ')');
        }
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_a = 90;
                break L1;
              }
            }
            L2: {
              if (null == na.field_d) {
                break L2;
              } else {
                na.field_d.i(-21535);
                break L2;
              }
            }
            L3: {
              if (null != qf.field_d) {
                qf.field_d.k(29960);
                break L3;
              } else {
                break L3;
              }
            }
            ld.e((byte) -111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "vi.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_c = null;
            if (param0 <= 79) {
                vi.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "vi.B(" + param0 + ')');
        }
    }

    static {
    }
}
