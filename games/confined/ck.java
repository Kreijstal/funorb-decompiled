/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck {
    static String field_b;
    static bi field_a;

    final static void a(int param0, double param1, double param2, double param3) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1942300510) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var7_int = (int)(325.94932345220167 * param1);
            var8 = (int)(param2 * 325.94932345220167);
            var9 = (int)(param3 * 325.94932345220167);
            var10 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (var10 >= 4) {
                    break L4;
                  } else {
                    bh.field_b[-1 + var10] = ti.field_m[va.a(2047, (var10 * 4 + 3) * var7_int)] >> 2;
                    bh.field_b[2 + var10] = ti.field_m[va.a((3 + var10 * 4) * var8, 2047)] >> 2;
                    bh.field_b[5 + var10] = ti.field_m[va.a(2047, var9 * (3 - -(4 * var10)))] >> 2;
                    bh.field_b[8 + var10] = ti.field_j[va.a(2047, var7_int * (3 - -(var10 * 4)))] >> 2;
                    bh.field_b[var10 - -11] = ti.field_j[va.a(2047, var8 * (var10 * 4 + 3))] >> 2;
                    bh.field_b[var10 - -14] = ti.field_j[va.a(var9 * (var10 * 4 + 3), 2047)] >> 2;
                    var10++;
                    if (var11 != 0) {
                      break L3;
                    } else {
                      if (var11 == 0) {
                        continue L2;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var7, "ck.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int[] param0, int param1, boolean param2, int[] param3, boolean param4, boolean param5, rm param6) {
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
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var31 = Confined.field_J ? 1 : 0;
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
            var12 = var22 * param3[4] + (var21 * param3[3] + param3[5] * var23) >> 14;
            var13 = param3[5] * var26 + (var25 * param3[4] + param3[3] * var24) >> 14;
            var29 = param0[11] >> 2;
            var14 = param3[3] * var27 + var28 * param3[4] + var29 * param3[5] >> 14;
            var15 = var23 * param3[8] + param3[7] * var22 + var21 * param3[6] >> 14;
            var30 = 34 % ((25 - param1) / 62);
            var20 = var29 * param3[11] + var28 * param3[10] + var27 * param3[9] >> 14;
            var19 = param3[11] * var26 + (param3[10] * var25 + var24 * param3[9]) >> 14;
            var16 = var26 * param3[8] + var24 * param3[6] - -(var25 * param3[7]) >> 14;
            var18 = var22 * param3[10] + var21 * param3[9] - -(var23 * param3[11]) >> 14;
            var17 = var29 * param3[8] + (param3[7] * var28 + var27 * param3[6]) >> 14;
            var21 = param3[0] + -param0[0];
            var22 = -param0[1] + param3[1];
            var23 = -param0[2] + param3[2];
            var9 = var22 * param0[4] + var21 * param0[3] - -(param0[5] * var23) >> 16 + -pc.field_h;
            var10 = var23 * param0[8] + var21 * param0[6] + param0[7] * var22 >> -pc.field_h + 16;
            var11 = param0[10] * var22 + (var21 * param0[9] + param0[11] * var23) >> 16;
            var21 = ti.field_k;
            var22 = ti.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~param6.field_b >= ~var23) {
                      break L4;
                    } else {
                      var24 = param6.field_x[var23];
                      var25 = param6.field_v[var23];
                      var26 = param6.field_F[var23];
                      var27 = (var24 * var12 - (-(var15 * var25) - var26 * var18) >> 16 + -pc.field_h) + var9;
                      var28 = (var26 * var19 + var16 * var25 + var13 * var24 >> -pc.field_h + 16) + var10;
                      var29 = var11 + (var24 * var14 + var25 * var17 - -(var20 * var26) >> 16);
                      stackOut_3_0 = -51;
                      stackOut_3_1 = ~var29;
                      stackIn_59_0 = stackOut_3_0;
                      stackIn_59_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var31 != 0) {
                        L5: while (true) {
                          if (stackIn_59_0 >= stackIn_59_1) {
                            break L3;
                          } else {
                            stackOut_60_0 = ~var18;
                            stackOut_60_1 = ~tf.field_m.length;
                            stackIn_68_0 = stackOut_60_0;
                            stackIn_68_1 = stackOut_60_1;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            if (var31 != 0) {
                              break L2;
                            } else {
                              stackOut_61_0 = stackIn_61_0;
                              stackOut_61_1 = stackIn_61_1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              if (stackIn_63_0 <= stackIn_63_1) {
                                break L3;
                              } else {
                                var19 = param6.field_E[var18];
                                var20 = param6.field_y[var18];
                                var21 = param6.field_r[var18];
                                tf.field_m[var18] = var20 * var12 + var9 * var19 - -(var21 * var15) >> 16;
                                sd.field_c[var18] = var19 * var10 + (var20 * var13 + var16 * var21) >> 16;
                                w.field_R[var18] = var14 * var20 + (var11 * var19 - -(var17 * var21)) >> 16;
                                var18++;
                                if (var31 == 0) {
                                  stackOut_58_0 = ~param6.field_g;
                                  stackOut_58_1 = ~var18;
                                  stackIn_59_0 = stackOut_58_0;
                                  stackIn_59_1 = stackOut_58_1;
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
                            if (stackIn_4_0 < stackIn_4_1) {
                              break L7;
                            } else {
                              L8: {
                                qf.field_a[var23] = var27 / var29 + var21;
                                db.field_x[var23] = var22 - -(var28 / var29);
                                if (~var7_int >= ~var29) {
                                  break L8;
                                } else {
                                  var7_int = var29;
                                  break L8;
                                }
                              }
                              L9: {
                                if (~var8 > ~var29) {
                                  var8 = var29;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              cj.field_b[var23] = var29;
                              if (var31 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          cj.field_b[var23] = -2147483648;
                          break L6;
                        }
                        L10: {
                          if (!param2) {
                            break L10;
                          } else {
                            tg.field_T[var23] = var27 >> pc.field_h;
                            wl.field_d[var23] = var28 >> pc.field_h;
                            nm.field_C[var23] = var29;
                            break L10;
                          }
                        }
                        var23++;
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
                      if (null == param6.field_d) {
                        break L12;
                      } else {
                        if (null == param6.field_M) {
                          break L12;
                        } else {
                          if (null == param6.field_i) {
                            break L12;
                          } else {
                            if (param6.field_H == null) {
                              break L12;
                            } else {
                              if (null == param6.field_N) {
                                break L12;
                              } else {
                                if (param6.field_Q == null) {
                                  break L12;
                                } else {
                                  if (param6.field_c == null) {
                                    break L12;
                                  } else {
                                    if (param6.field_q == null) {
                                      break L12;
                                    } else {
                                      if (param6.field_n == null) {
                                        break L12;
                                      } else {
                                        var23 = 0;
                                        L13: while (true) {
                                          if (var23 >= param6.field_w) {
                                            break L12;
                                          } else {
                                            var24 = param6.field_d[var23];
                                            var25 = param6.field_M[var23];
                                            var26 = param6.field_i[var23];
                                            jd.field_e[var23] = (var18 * var26 + (var25 * var15 + var12 * var24) >> 16) + var9;
                                            gm.field_bb[var23] = (var25 * var16 + (var13 * var24 + var26 * var19) >> 16) + var10;
                                            mi.field_c[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 16) + var11;
                                            var24 = param6.field_H[var23];
                                            var25 = param6.field_N[var23];
                                            var26 = param6.field_Q[var23];
                                            lb.field_u[var23] = var9 + (var18 * var26 + var12 * var24 + var25 * var15 >> 16);
                                            oh.field_a[var23] = var10 + (var26 * var19 + (var24 * var13 + var16 * var25) >> 16);
                                            mf.field_g[var23] = var11 - -(var24 * var14 - (-(var17 * var25) - var26 * var20) >> 16);
                                            var24 = param6.field_c[var23];
                                            var25 = param6.field_q[var23];
                                            var26 = param6.field_n[var23];
                                            sc.field_i[var23] = var9 - -(var18 * var26 + (var12 * var24 + var15 * var25) >> 16);
                                            wa.field_d[var23] = (var26 * var19 + var25 * var16 + var24 * var13 >> 16) + var10;
                                            ba.field_P[var23] = (var20 * var26 + var25 * var17 + var14 * var24 >> 16) + var11;
                                            var23++;
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
                    if (param5) {
                      var9 = param3[3];
                      var10 = param3[4];
                      var11 = param3[5];
                      var12 = param3[6];
                      var13 = param3[7];
                      var14 = param3[8];
                      var15 = param3[9];
                      var16 = param3[10];
                      var17 = param3[11];
                      break L11;
                    } else {
                      break L3;
                    }
                  }
                  var18 = 0;
                  L14: while (true) {
                    stackOut_58_0 = ~param6.field_g;
                    stackOut_58_1 = ~var18;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (stackIn_59_0 >= stackIn_59_1) {
                      break L3;
                    } else {
                      stackOut_60_0 = ~var18;
                      stackOut_60_1 = ~tf.field_m.length;
                      stackIn_68_0 = stackOut_60_0;
                      stackIn_68_1 = stackOut_60_1;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if (var31 != 0) {
                        break L2;
                      } else {
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = stackIn_61_1;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        if (stackIn_63_0 <= stackIn_63_1) {
                          break L3;
                        } else {
                          var19 = param6.field_E[var18];
                          var20 = param6.field_y[var18];
                          var21 = param6.field_r[var18];
                          tf.field_m[var18] = var20 * var12 + var9 * var19 - -(var21 * var15) >> 16;
                          sd.field_c[var18] = var19 * var10 + (var20 * var13 + var16 * var21) >> 16;
                          w.field_R[var18] = var14 * var20 + (var11 * var19 - -(var17 * var21)) >> 16;
                          var18++;
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
                stackOut_67_0 = -126;
                stackOut_67_1 = var7_int;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                break L2;
              }
              rc.a((byte) stackIn_68_0, stackIn_68_1, param4, var8, param6);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("ck.G(");
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L15;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L15;
            }
          }
          L16: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L16;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L16;
            }
          }
          L17: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L17;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ')');
        }
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!je.a(0, param0, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3_int <= ~param1.length()) {
                      break L3;
                    } else {
                      stackOut_8_0 = og.a(-96, param1.charAt(var3_int));
                      stackIn_17_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_9_0) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = param2;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                L4: {
                  if (!stackIn_17_0) {
                    break L4;
                  } else {
                    va discarded$1 = ck.a((String) null, (byte) -10);
                    break L4;
                  }
                }
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("ck.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static va a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        va stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_10_0 = null;
        byte stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        va stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int >= ~var3) {
                    break L3;
                  } else {
                    var4 = param0.charAt(var3);
                    stackOut_3_0 = ~var4;
                    stackOut_3_1 = -49;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_14_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > stackIn_4_1) {
                          break L4;
                        } else {
                          if (var4 <= 57) {
                            var3++;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (va) (Object) stackIn_11_0;
                    }
                  }
                }
                stackOut_13_0 = param1;
                stackOut_13_1 = 126;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              }
              L5: {
                if (stackIn_14_0 >= stackIn_14_1) {
                  break L5;
                } else {
                  ck.a(35, (mi) null);
                  break L5;
                }
              }
              stackOut_17_0 = ql.field_k;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ck.E(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    abstract void a(java.awt.Component param0, byte param1);

    public static void a(byte param0) {
        try {
            int var1_int = -88 % ((param0 - 34) / 37);
            field_b = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ck.H(" + param0 + ')');
        }
    }

    final static void a(int param0, mi param1) {
        RuntimeException var2 = null;
        hb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        rm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_ref = new hb(param1.a(param0 ^ -26592, "logo.fo3d", ""));
            var3 = var2_ref.c(param0 ^ 26581);
            var2_ref.i(8);
            im.field_a = ul.a(var2_ref, 31662);
            Confined.field_K = new rm[var3];
            in.field_b = new int[var3][];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3) {
                    break L3;
                  } else {
                    Confined.field_K[var4] = kc.a(30035, var2_ref);
                    var4++;
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
                L4: {
                  if (param0 == 26613) {
                    break L4;
                  } else {
                    field_b = null;
                    break L4;
                  }
                }
                var2_ref.j(116);
                break L2;
              }
              var4 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var3 <= var4) {
                      break L7;
                    } else {
                      var5 = Confined.field_K[var4];
                      var5.a(6, 1, 6, (byte) 56, 6);
                      var5.b(27915);
                      var6 = new int[]{var5.field_I + var5.field_O >> 1, var5.field_L + var5.field_e >> 1, var5.field_t - -var5.field_s >> 1};
                      in.field_b[var4] = var6;
                      var5.a(-var6[1], -var6[2], 117, -var6[0]);
                      var4++;
                      if (var7 != 0) {
                        break L6;
                      } else {
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Hold <%0> to charge, and release to fire";
    }
}
