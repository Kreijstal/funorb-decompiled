/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fe extends km {
    static String field_Kb;
    static boolean field_Fb;
    private StringBuilder field_Eb;
    static String field_Lb;
    private km field_Jb;
    private km field_Hb;
    private int field_Ib;
    static boolean field_Gb;

    final static void a(int[] param0, boolean param1, boolean param2, wm param3, boolean param4, int[] param5, boolean param6) {
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_66_0 = 0;
        boolean stackOut_66_1 = false;
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
        var30 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> 2;
            var22 = param5[4] >> 2;
            var23 = param5[5] >> 2;
            var24 = param5[6] >> 2;
            var25 = param5[7] >> 2;
            var26 = param5[8] >> 2;
            var27 = param5[9] >> 2;
            var28 = param5[10] >> 2;
            var12 = param0[5] * var23 + var21 * param0[3] - -(var22 * param0[4]) >> 14;
            var13 = var25 * param0[4] + (param0[3] * var24 - -(param0[5] * var26)) >> 14;
            var29 = param5[11] >> 2;
            var18 = param0[11] * var23 + param0[9] * var21 + var22 * param0[10] >> 14;
            var16 = var26 * param0[8] + var24 * param0[6] - -(var25 * param0[7]) >> 14;
            var14 = param0[5] * var29 + (param0[4] * var28 + param0[3] * var27) >> 14;
            if (param2) {
              var15 = param0[8] * var23 + (var21 * param0[6] - -(var22 * param0[7])) >> 14;
              var17 = param0[7] * var28 + (param0[6] * var27 + param0[8] * var29) >> 14;
              var20 = param0[9] * var27 - -(var28 * param0[10]) - -(param0[11] * var29) >> 14;
              var19 = var26 * param0[11] + param0[10] * var25 + var24 * param0[9] >> 14;
              var21 = param0[0] + -param5[0];
              var22 = param0[1] - param5[1];
              var23 = -param5[2] + param0[2];
              var9 = param5[5] * var23 + (var21 * param5[3] + param5[4] * var22) >> 16 - gb.field_N;
              var11 = var23 * param5[11] + param5[9] * var21 - -(var22 * param5[10]) >> 16;
              var10 = param5[6] * var21 - (-(var22 * param5[7]) + -(var23 * param5[8])) >> 16 + -gb.field_N;
              var21 = fk.field_j;
              var22 = fk.field_k;
              var23 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var23 >= param3.field_h) {
                        break L4;
                      } else {
                        var24 = param3.field_l[var23];
                        var25 = param3.field_b[var23];
                        var26 = param3.field_H[var23];
                        var27 = var9 - -(var26 * var18 + var12 * var24 - -(var15 * var25) >> -gb.field_N + 16);
                        var28 = (var24 * var13 - -(var25 * var16) + var19 * var26 >> -gb.field_N + 16) + var10;
                        var29 = var11 + (var26 * var20 + var14 * var24 + var25 * var17 >> 16);
                        stackOut_5_0 = var29;
                        stackOut_5_1 = 50;
                        stackIn_67_0 = stackOut_5_0;
                        stackIn_67_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 < stackIn_6_1) {
                                break L6;
                              } else {
                                L7: {
                                  en.field_Hb[var23] = var27 / var29 + var21;
                                  ld.field_h[var23] = var22 - -(var28 / var29);
                                  dn.field_a[var23] = var29;
                                  if (~var29 < ~var8) {
                                    var8 = var29;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var7_int > var29) {
                                  var7_int = var29;
                                  if (var30 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                            dn.field_a[var23] = -2147483648;
                            break L5;
                          }
                          L8: {
                            if (!param6) {
                              break L8;
                            } else {
                              mk.field_gb[var23] = var27 >> gb.field_N;
                              ea.field_c[var23] = var28 >> gb.field_N;
                              hh.field_b[var23] = var29;
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
                      if (null == param3.field_R) {
                        break L9;
                      } else {
                        if (param3.field_E == null) {
                          break L9;
                        } else {
                          if (param3.field_f == null) {
                            break L9;
                          } else {
                            if (param3.field_q == null) {
                              break L9;
                            } else {
                              if (null == param3.field_c) {
                                break L9;
                              } else {
                                if (null == param3.field_o) {
                                  break L9;
                                } else {
                                  if (null == param3.field_n) {
                                    break L9;
                                  } else {
                                    if (param3.field_P == null) {
                                      break L9;
                                    } else {
                                      if (param3.field_M != null) {
                                        var23 = 0;
                                        L10: while (true) {
                                          if (param3.field_k <= var23) {
                                            break L9;
                                          } else {
                                            var24 = param3.field_R[var23];
                                            var25 = param3.field_E[var23];
                                            var26 = param3.field_f[var23];
                                            nm.field_a[var23] = var9 + (var24 * var12 + var15 * var25 - -(var26 * var18) >> 16);
                                            hf.field_A[var23] = (var19 * var26 + (var16 * var25 + var13 * var24) >> 16) + var10;
                                            gl.field_b[var23] = var11 - -(var25 * var17 + (var14 * var24 - -(var26 * var20)) >> 16);
                                            var24 = param3.field_q[var23];
                                            var25 = param3.field_c[var23];
                                            var26 = param3.field_o[var23];
                                            d.field_Lb[var23] = (var18 * var26 + var25 * var15 + var24 * var12 >> 16) + var9;
                                            qe.field_i[var23] = var10 + (var25 * var16 + (var24 * var13 - -(var26 * var19)) >> 16);
                                            pg.field_j[var23] = (var26 * var20 + (var25 * var17 + var14 * var24) >> 16) + var11;
                                            var24 = param3.field_n[var23];
                                            var25 = param3.field_P[var23];
                                            var26 = param3.field_M[var23];
                                            hf.field_z[var23] = (var18 * var26 + var15 * var25 + var24 * var12 >> 16) + var9;
                                            ag.field_i[var23] = var10 - -(var19 * var26 + var24 * var13 - -(var16 * var25) >> 16);
                                            ul.field_h[var23] = (var25 * var17 + (var24 * var14 - -(var20 * var26)) >> 16) + var11;
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
                    L11: {
                      if (!param1) {
                        break L11;
                      } else {
                        var9 = param0[3];
                        var10 = param0[4];
                        var11 = param0[5];
                        var12 = param0[6];
                        var13 = param0[7];
                        var14 = param0[8];
                        var15 = param0[9];
                        var16 = param0[10];
                        var17 = param0[11];
                        var18 = 0;
                        L12: while (true) {
                          if (~param3.field_i >= ~var18) {
                            break L11;
                          } else {
                            stackOut_61_0 = u.field_q.length;
                            stackOut_61_1 = var18;
                            stackIn_67_0 = stackOut_61_0;
                            stackIn_67_1 = stackOut_61_1;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              if (stackIn_62_0 <= stackIn_62_1) {
                                break L11;
                              } else {
                                var19 = param3.field_A[var18];
                                var20 = param3.field_G[var18];
                                var21 = param3.field_D[var18];
                                u.field_q[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
                                fb.field_p[var18] = var10 * var19 - (-(var20 * var13) - var16 * var21) >> 16;
                                dc.field_Q[var18] = var11 * var19 + (var14 * var20 + var17 * var21) >> 16;
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
                    stackOut_66_0 = var8;
                    stackOut_66_1 = param2;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1 ? 1 : 0;
                    break L3;
                  }
                  lj.a(stackIn_67_0, stackIn_67_1 != 0, param4, var7_int, param3);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("fe.C(");
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
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
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
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param4).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param6 + ')');
        }
    }

    final boolean e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((fe) this).field_Ib == 0) {
              L1: {
                if (um.field_Gb != 85) {
                  break L1;
                } else {
                  if (((fe) this).field_Eb.length() <= 0) {
                    break L1;
                  } else {
                    StringBuilder discarded$3 = gi.a(((fe) this).field_Eb, -18340, -1 + ((fe) this).field_Eb.length(), ' ');
                    break L1;
                  }
                }
              }
              L2: {
                if (((fe) this).field_Eb.length() >= 12) {
                  break L2;
                } else {
                  L3: {
                    var2_int = Character.toLowerCase(nm.field_d);
                    if (var2_int == 32) {
                      var2_int = 95;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var2_int != 95) {
                      break L4;
                    } else {
                      if (((fe) this).field_Eb.length() <= 0) {
                        break L4;
                      } else {
                        StringBuilder discarded$4 = ((fe) this).field_Eb.append((char) var2_int);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (bm.a((char) var2_int, false)) {
                      break L5;
                    } else {
                      if (!kf.a(0, (char) var2_int)) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  StringBuilder discarded$5 = ((fe) this).field_Eb.append((char) var2_int);
                  break L2;
                }
              }
              L6: {
                if (um.field_Gb == 84) {
                  L7: {
                    if (((fe) this).field_Eb.length() <= 0) {
                      break L7;
                    } else {
                      ((fe) this).field_V = ((fe) this).field_Eb.toString();
                      ((fe) this).field_Ib = 2;
                      if (!Virogrid.field_F) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((fe) this).field_Ib = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (um.field_Gb == 13) {
                  ((fe) this).field_Ib = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0 >= 20) {
                  break L9;
                } else {
                  ((fe) this).field_Ib = -124;
                  break L9;
                }
              }
              stackOut_42_0 = 1;
              stackIn_43_0 = stackOut_42_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "fe.D(" + param0 + ')');
        }
        return stackIn_43_0 != 0;
    }

    fe(int param0, int param1, int param2, int param3, String param4, km param5, km param6, km param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((fe) this).field_Ib = 0;
        try {
          L0: {
            ((fe) this).field_Jb = new km(0L, param6, param4);
            ((fe) this).a(0, ((fe) this).field_Jb);
            ((fe) this).field_Hb = new km(0L, param7);
            ((fe) this).field_Hb.field_E = 16764006;
            ((fe) this).a(0, ((fe) this).field_Hb);
            ((fe) this).field_Hb.field_eb = "|";
            ((fe) this).field_Eb = new StringBuilder(12);
            var9_int = ((fe) this).field_Jb.c((byte) 127);
            ((fe) this).field_Jb.a(5, pg.field_e, var9_int, (byte) -125, 3);
            ((fe) this).field_Hb.a(5, pg.field_e, var9_int, (byte) -80, pg.field_e + 3);
            var10 = 5 + (5 + var9_int);
            var11 = 3 + 2 * pg.field_e + 3;
            var12 = sh.b(0, param2, param0, var10);
            var13 = p.a(-1, var11, param1, param3);
            ((fe) this).a(var12, var11, var10, (byte) -55, var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("fe.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param7 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, String param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String stackIn_5_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_2_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        byte stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_66_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              dm.field_u = param2;
              rk.field_f = true;
              var5_ref = param4;
              if (param3) {
                stackOut_4_0 = wn.field_z;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = vi.field_m;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = stackIn_5_0;
                if (0 == dm.field_u) {
                  break L3;
                } else {
                  if (dm.field_u == 1) {
                    var7 = sf.a((byte) 121, var5_ref, pm.field_j, 480, gg.field_I);
                    var8 = var7 + 2;
                    vg.field_F = new String[var8];
                    wf.field_f = new int[var8];
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (~var8 >= ~var9) {
                            break L6;
                          } else {
                            wf.field_f[var9] = -1;
                            var9++;
                            if (var10 != 0) {
                              break L5;
                            } else {
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        ia.field_e = new int[1];
                        break L5;
                      }
                      var9 = 0;
                      L7: while (true) {
                        L8: {
                          L9: {
                            if (var7 <= var9) {
                              break L9;
                            } else {
                              vg.field_F[var9] = gg.field_I[var9];
                              var9++;
                              if (var10 != 0) {
                                break L8;
                              } else {
                                if (var10 == 0) {
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          vg.field_F[var8 + -2] = "";
                          vg.field_F[-1 + var8] = je.field_I;
                          wf.field_f[-1 + var8] = 0;
                          ia.field_e[0] = 2;
                          break L8;
                        }
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              }
              var7 = sf.a((byte) 124, var5_ref, pm.field_j, 480, gg.field_I);
              var8 = var7 + 3;
              wf.field_f = new int[var8];
              vg.field_F = new String[var8];
              var9 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (var8 <= var9) {
                      break L12;
                    } else {
                      wf.field_f[var9] = -1;
                      var9++;
                      if (var10 != 0) {
                        break L11;
                      } else {
                        if (var10 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  ia.field_e = new int[2];
                  break L11;
                }
                var9 = 0;
                L13: while (true) {
                  L14: {
                    L15: {
                      if (var7 <= var9) {
                        break L15;
                      } else {
                        vg.field_F[var9] = gg.field_I[var9];
                        var9++;
                        if (var10 != 0) {
                          break L14;
                        } else {
                          if (var10 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    vg.field_F[-3 + var8] = "";
                    vg.field_F[-2 + var8] = var6;
                    wf.field_f[-2 + var8] = 0;
                    ia.field_e[0] = 1;
                    vg.field_F[-1 + var8] = je.field_I;
                    wf.field_f[-1 + var8] = 1;
                    break L14;
                  }
                  ia.field_e[1] = 2;
                  break L2;
                }
              }
            }
            g.field_b.field_o = ia.field_e.length;
            var7 = 0;
            var8 = 0;
            L16: while (true) {
              L17: {
                L18: {
                  if (~vg.field_F.length >= ~var8) {
                    break L18;
                  } else {
                    stackOut_43_0 = -1;
                    stackOut_43_1 = ~wf.field_f[var8];
                    stackIn_60_0 = stackOut_43_0;
                    stackIn_60_1 = stackOut_43_1;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    if (var10 != 0) {
                      break L17;
                    } else {
                      L19: {
                        if (stackIn_44_0 < stackIn_44_1) {
                          stackOut_49_0 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          break L19;
                        } else {
                          stackOut_47_0 = 1;
                          stackIn_50_0 = stackOut_47_0;
                          break L19;
                        }
                      }
                      L20: {
                        var9 = an.a(stackIn_50_0 != 0, (byte) 57, vg.field_F[var8]);
                        if (-1 != wf.field_f[var8]) {
                          var9 = var9 + dj.field_e * 2;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (var9 > var7) {
                          var7 = var9;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L16;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                lj.field_g = g.field_b.field_o * (hd.field_e + ng.field_P << 1);
                sh.field_rb = -(var7 >> 1) + mh.field_g - -var7;
                dg.field_x = mh.field_g - (var7 >> 1);
                stackOut_59_0 = param0;
                stackOut_59_1 = 45;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                break L17;
              }
              L22: {
                if (stackIn_60_0 == stackIn_60_1) {
                  break L22;
                } else {
                  field_Fb = true;
                  break L22;
                }
              }
              var8 = 0;
              L23: while (true) {
                L24: {
                  L25: {
                    if (~var8 <= ~vg.field_F.length) {
                      break L25;
                    } else {
                      stackOut_65_0 = lj.field_g;
                      stackOut_65_1 = -1;
                      stackOut_65_2 = ~wf.field_f[var8];
                      stackIn_74_0 = stackOut_65_0;
                      stackIn_74_1 = stackOut_65_1;
                      stackIn_74_2 = stackOut_65_2;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      stackIn_66_2 = stackOut_65_2;
                      if (var10 != 0) {
                        break L24;
                      } else {
                        L26: {
                          stackOut_66_0 = stackIn_66_0;
                          stackIn_71_0 = stackOut_66_0;
                          stackIn_67_0 = stackOut_66_0;
                          if (stackIn_66_1 >= stackIn_66_2) {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = di.field_o;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            break L26;
                          } else {
                            stackOut_67_0 = stackIn_67_0;
                            stackIn_69_0 = stackOut_67_0;
                            stackOut_69_0 = stackIn_69_0;
                            stackOut_69_1 = bn.field_b;
                            stackIn_72_0 = stackOut_69_0;
                            stackIn_72_1 = stackOut_69_1;
                            break L26;
                          }
                        }
                        lj.field_g = stackIn_72_0 + stackIn_72_1;
                        var8++;
                        if (var10 == 0) {
                          continue L23;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  stackOut_73_0 = kn.field_I;
                  stackOut_73_1 = lj.field_g;
                  stackOut_73_2 = 1;
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L24;
                }
                tl.field_i = stackIn_74_0 + -(stackIn_74_1 >> stackIn_74_2);
                g.field_b.a(param1, ve.a(hk.field_Jb, nl.field_u, (byte) 66), -563, 0);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var5 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var5;
            stackOut_76_1 = new StringBuilder().append("fe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param4 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L27;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L27;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        boolean stackOut_45_0 = false;
        int stackOut_56_0 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fe) this).a(param0, (byte) 118);
              if (param1 == -28624) {
                break L1;
              } else {
                field_Lb = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0) {
                  L4: while (true) {
                    if (!nd.b((byte) -128)) {
                      break L3;
                    } else {
                      L5: {
                        if (um.field_Gb != 85) {
                          break L5;
                        } else {
                          if (((fe) this).field_Eb.length() <= 0) {
                            break L5;
                          } else {
                            StringBuilder discarded$2 = gi.a(((fe) this).field_Eb, -18340, -1 + ((fe) this).field_Eb.length(), ' ');
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (mf.a((CharSequence) (Object) ((fe) this).field_Eb, nm.field_d, -13)) {
                            break L7;
                          } else {
                            L8: {
                              if (((fe) this).field_Eb.length() != 0) {
                                break L8;
                              } else {
                                if (91 == nm.field_d) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (((fe) this).field_Eb.length() != 1) {
                                break L9;
                              } else {
                                if (nm.field_d == 35) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (93 == nm.field_d) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        StringBuilder discarded$3 = ((fe) this).field_Eb.append(nm.field_d);
                        break L6;
                      }
                      if (84 != um.field_Gb) {
                        if (um.field_Gb != 13) {
                          continue L4;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_43_0 = stackOut_42_0;
                          stackOut_43_0 = stackIn_43_0;
                          stackIn_46_0 = stackOut_43_0;
                          stackIn_44_0 = stackOut_43_0;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            return stackIn_44_0;
                          }
                        }
                      } else {
                        if (((fe) this).field_Eb.length() <= 0) {
                          stackOut_39_0 = 1;
                          stackIn_40_0 = stackOut_39_0;
                          return stackIn_40_0;
                        } else {
                          ((fe) this).field_V = ((fe) this).field_Eb.toString();
                          stackOut_37_0 = 2;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((fe) this).field_Hb.field_V = ((fe) this).field_Eb.toString();
              stackOut_45_0 = param0;
              stackIn_46_0 = stackOut_45_0 ? 1 : 0;
              break L2;
            }
            L10: {
              if (stackIn_46_0 == 0) {
                break L10;
              } else {
                if (0 == oi.field_g) {
                  break L10;
                } else {
                  if (((fe) this).field_nb == 0) {
                    ((fe) this).field_Ib = 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            stackOut_56_0 = ((fe) this).field_Ib;
            stackIn_57_0 = stackOut_56_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "fe.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_57_0;
    }

    final static rm a(rm param0, int[] param1, byte param2) {
        rm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        rm stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        rm stackOut_3_0 = null;
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
        try {
          L0: {
            var3 = new rm(0, 0, 0);
            var3.field_d = param0.field_d;
            var3.field_m = param1;
            var3.field_j = param0.field_j;
            var3.field_i = param0.field_i;
            var3.field_n = param0.field_n;
            if (param2 < -10) {
              var3.field_b = param0.field_b;
              var3.field_l = param0.field_l;
              var3.field_a = param0.field_a;
              stackOut_3_0 = (rm) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("fe.B(");
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (vg.field_I.field_t) {
                  break L2;
                } else {
                  L3: {
                    if (0 != (1 << vg.field_I.field_e & vg.field_I.field_C.field_b)) {
                      break L3;
                    } else {
                      L4: {
                        if (vg.field_I.field_C.field_b == 0) {
                          break L4;
                        } else {
                          de.field_pb[18] = rf.field_g;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if ((vg.field_I.field_v | 1 << vg.field_I.field_e) == 3) {
                          break L5;
                        } else {
                          de.field_pb[18] = eb.field_g;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      de.field_pb[18] = f.field_d;
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  de.field_pb[18] = ic.field_s;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if ((vg.field_I.field_C.field_b & 1 << vg.field_I.field_e) != 0) {
                  break L6;
                } else {
                  L7: {
                    if (0 != vg.field_I.field_C.field_b) {
                      break L7;
                    } else {
                      L8: {
                        if (3 != (1 << vg.field_I.field_e | vg.field_I.field_v)) {
                          break L8;
                        } else {
                          de.field_pb[18] = nk.field_M;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      de.field_pb[18] = ei.field_e;
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  de.field_pb[18] = pb.field_m;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              de.field_pb[18] = ic.field_b;
              break L1;
            }
            L9: {
              if (param0 == 1) {
                break L9;
              } else {
                field_Lb = null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "fe.E(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 32498) {
                break L1;
              } else {
                field_Kb = null;
                break L1;
              }
            }
            field_Kb = null;
            field_Lb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "fe.G(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = false;
        field_Kb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
