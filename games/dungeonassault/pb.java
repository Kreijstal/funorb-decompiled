/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Object;

final class pb extends wf {
    static int field_G;
    private Object field_E;
    static String field_H;
    static String field_F;
    static String field_I;

    public static void e(byte param0) {
        try {
            field_I = null;
            field_H = null;
            field_F = null;
            if (param0 != -78) {
                field_H = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "pb.C(" + param0 + ')');
        }
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "pb.B(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(boolean param0, int param1, int[] param2, boolean param3, qh param4, boolean param5, int[] param6) {
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
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var30 = DungeonAssault.field_K;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 2;
            var22 = param2[4] >> 2;
            var23 = param2[5] >> 2;
            var24 = param2[6] >> 2;
            var25 = param2[7] >> 2;
            var26 = param2[8] >> 2;
            var27 = param2[9] >> 2;
            var28 = param2[10] >> 2;
            var29 = param2[11] >> 2;
            var12 = var23 * param6[5] + var22 * param6[4] + param6[3] * var21 >> 14;
            var13 = param6[3] * var24 - (-(var25 * param6[4]) - param6[5] * var26) >> 14;
            var20 = var29 * param6[11] + (param6[9] * var27 - -(var28 * param6[10])) >> 14;
            var18 = var21 * param6[9] + (param6[10] * var22 + var23 * param6[11]) >> 14;
            var19 = var26 * param6[11] + var24 * param6[9] + param6[10] * var25 >> 14;
            var15 = param6[7] * var22 + (var21 * param6[6] + var23 * param6[8]) >> 14;
            var17 = var28 * param6[7] + (param6[6] * var27 - -(param6[8] * var29)) >> 14;
            var16 = param6[8] * var26 + (var24 * param6[6] + var25 * param6[7]) >> 14;
            var14 = var29 * param6[5] + (param6[4] * var28 + var27 * param6[3]) >> 14;
            var21 = -param2[0] + param6[0];
            var22 = param6[1] - param2[1];
            var23 = param6[2] - param2[2];
            var9 = var22 * param2[4] + (param2[3] * var21 - -(param2[5] * var23)) >> 16 - lh.field_t;
            var11 = param2[9] * var21 - -(var22 * param2[10]) - -(param2[11] * var23) >> 16;
            var10 = param2[8] * var23 + (var21 * param2[6] + param2[7] * var22) >> -lh.field_t + 16;
            var21 = re.field_d;
            var22 = re.field_h;
            var23 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var23 >= param4.field_B) {
                      break L4;
                    } else {
                      var24 = param4.field_L[var23];
                      var25 = param4.field_S[var23];
                      var26 = param4.field_z[var23];
                      var27 = var9 - -(var15 * var25 + (var12 * var24 + var26 * var18) >> -lh.field_t + 16);
                      var28 = var10 - -(var26 * var19 + (var13 * var24 - -(var25 * var16)) >> 16 + -lh.field_t);
                      var29 = (var26 * var20 + (var17 * var25 + var24 * var14) >> 16) + var11;
                      stackOut_3_0 = -51;
                      stackOut_3_1 = ~var29;
                      stackIn_62_0 = stackOut_3_0;
                      stackIn_62_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_4_0 >= stackIn_4_1) {
                              break L6;
                            } else {
                              ko.field_v[var23] = -2147483648;
                              if (var30 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            nj.field_g[var23] = var21 - -(var27 / var29);
                            ra.field_b[var23] = var28 / var29 + var22;
                            ko.field_v[var23] = var29;
                            if (var29 >= var7_int) {
                              break L7;
                            } else {
                              var7_int = var29;
                              break L7;
                            }
                          }
                          if (~var8 > ~var29) {
                            var8 = var29;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L8: {
                          if (!param5) {
                            break L8;
                          } else {
                            ie.field_k[var23] = var27 >> lh.field_t;
                            la.field_l[var23] = var28 >> lh.field_t;
                            ip.field_l[var23] = var29;
                            break L8;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    if (null == param4.field_k) {
                      break L9;
                    } else {
                      if (null == param4.field_g) {
                        break L9;
                      } else {
                        if (null == param4.field_O) {
                          break L9;
                        } else {
                          if (param4.field_r == null) {
                            break L9;
                          } else {
                            if (null == param4.field_m) {
                              break L9;
                            } else {
                              if (null == param4.field_T) {
                                break L9;
                              } else {
                                if (param4.field_u == null) {
                                  break L9;
                                } else {
                                  if (null == param4.field_K) {
                                    break L9;
                                  } else {
                                    if (null == param4.field_l) {
                                      break L9;
                                    } else {
                                      var23 = 0;
                                      L10: while (true) {
                                        if (~param4.field_h >= ~var23) {
                                          break L9;
                                        } else {
                                          var24 = param4.field_k[var23];
                                          var25 = param4.field_g[var23];
                                          var26 = param4.field_O[var23];
                                          gi.field_L[var23] = (var24 * var12 - -(var15 * var25) - -(var18 * var26) >> 16) + var9;
                                          lp.field_B[var23] = var10 - -(var13 * var24 - -(var25 * var16) + var19 * var26 >> 16);
                                          ok.field_S[var23] = var11 - -(var17 * var25 + var14 * var24 - -(var26 * var20) >> 16);
                                          var24 = param4.field_r[var23];
                                          var25 = param4.field_m[var23];
                                          var26 = param4.field_T[var23];
                                          fg.field_d[var23] = var9 - -(var12 * var24 - (-(var15 * var25) - var18 * var26) >> 16);
                                          lm.field_m[var23] = var10 + (var16 * var25 + var13 * var24 - -(var19 * var26) >> 16);
                                          tc.field_m[var23] = (var20 * var26 + (var14 * var24 - -(var17 * var25)) >> 16) + var11;
                                          var24 = param4.field_u[var23];
                                          var25 = param4.field_K[var23];
                                          var26 = param4.field_l[var23];
                                          i.field_l[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var18 * var26) >> 16);
                                          vj.field_d[var23] = (var26 * var19 + var24 * var13 - -(var16 * var25) >> 16) + var10;
                                          fm.field_h[var23] = (var14 * var24 + var17 * var25 - -(var26 * var20) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L10;
                                            } else {
                                              break L9;
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
                  L11: {
                    if (!param0) {
                      break L11;
                    } else {
                      var9 = param6[3];
                      var10 = param6[4];
                      var11 = param6[5];
                      var12 = param6[6];
                      var13 = param6[7];
                      var14 = param6[8];
                      var15 = param6[9];
                      var16 = param6[10];
                      var17 = param6[11];
                      var18 = 0;
                      L12: while (true) {
                        if (var18 >= param4.field_c) {
                          break L11;
                        } else {
                          stackOut_56_0 = hk.field_c.length;
                          stackOut_56_1 = var18;
                          stackIn_62_0 = stackOut_56_0;
                          stackIn_62_1 = stackOut_56_1;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          if (var30 != 0) {
                            break L3;
                          } else {
                            if (stackIn_57_0 <= stackIn_57_1) {
                              break L11;
                            } else {
                              var19 = param4.field_d[var18];
                              var20 = param4.field_P[var18];
                              var21 = param4.field_v[var18];
                              hk.field_c[var18] = var21 * var15 + (var19 * var9 - -(var20 * var12)) >> 16;
                              p.field_x[var18] = var10 * var19 - (-(var20 * var13) - var21 * var16) >> 16;
                              hd.field_j[var18] = var11 * var19 - -(var20 * var14) - -(var17 * var21) >> 16;
                              var18++;
                              if (var30 == 0) {
                                continue L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_61_0 = var7_int;
                  stackOut_61_1 = var8;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  break L3;
                }
                b.a(stackIn_62_0, stackIn_62_1, (byte) -84, param3, param4);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var7;
            stackOut_64_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L13;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L13;
            }
          }
          L14: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param3).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L14;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L14;
            }
          }
          L15: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param5).append(',');
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L15;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L15;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
    }

    final Object d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 22698) {
              stackOut_3_0 = ((pb) this).field_E;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "pb.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    pb(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((pb) this).field_E = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pb.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "The changes you have made to your stable have not yet been saved. Would you like them to be saved now?";
        field_I = "TREASURE:";
        field_H = "Continue";
    }
}
