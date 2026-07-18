/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os {
    int field_K;
    int field_e;
    int field_a;
    int field_x;
    byte[] field_r;
    byte field_v;
    int[][] field_C;
    int[][] field_k;
    int field_s;
    int field_z;
    static String field_d;
    int field_j;
    static rv field_l;
    byte[] field_y;
    boolean[] field_B;
    static String field_w;
    boolean[] field_c;
    int field_G;
    int[] field_L;
    int field_H;
    int[] field_u;
    byte[] field_m;
    int field_p;
    int field_q;
    int field_F;
    int field_A;
    int field_D;
    byte[] field_J;
    int[][] field_n;
    int[] field_f;
    int field_t;
    static String[] field_i;
    static ks field_I;
    byte[] field_g;
    byte[] field_h;
    int[] field_o;
    byte[][] field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        RuntimeException var16 = null;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param12 >= param2) {
                  break L2;
                } else {
                  L3: {
                    if (param2 >= param14) {
                      break L3;
                    } else {
                      mk.a(param15, param14, param0, param4, param6, param1, false, param12, param7, param8, param3, param11, param5, param9, on.field_a, param2, param10);
                      if (var17 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (~param14 >= ~param12) {
                      break L4;
                    } else {
                      mk.a(param15, param2, param10, param4, param1, param6, false, param12, param7, param11, param3, param8, param9, param5, on.field_a, param14, param0);
                      if (var17 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  mk.a(param0, param2, param10, param5, param1, param3, false, param14, param11, param7, param6, param8, param9, param4, on.field_a, param12, param15);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (param14 <= param12) {
                  break L5;
                } else {
                  mk.a(param10, param14, param0, param9, param6, param3, false, param2, param8, param7, param1, param11, param5, param4, on.field_a, param12, param15);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (~param14 < ~param2) {
                  break L6;
                } else {
                  mk.a(param0, param12, param15, param5, param3, param1, false, param14, param11, param8, param6, param7, param4, param9, on.field_a, param2, param10);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              mk.a(param10, param12, param15, param9, param3, param6, false, param2, param8, param11, param1, param7, param4, param5, on.field_a, param14, param0);
              break L1;
            }
            L7: {
              if (param13 == -15343) {
                break L7;
              } else {
                os.b(-5);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var16, "os.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wn.field_j = new ut(tn.field_e.field_o, tn.field_e.field_v);
              if (param0 <= -32) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            iw.field_g = new ut(wn.field_j.field_o << 1, wn.field_j.field_o << 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "os.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_I = null;
              field_l = null;
              if (param0 == 3) {
                break L1;
              } else {
                os.a(-82);
                break L1;
              }
            }
            field_w = null;
            field_i = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "os.E(" + param0 + ')');
        }
    }

    final static String a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 47) {
              stackOut_3_0 = param1.replace('t', 'r');
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("os.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(kk param0, boolean param1, int[] param2, int[] param3, byte param4, boolean param5, boolean param6) {
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
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        short stackOut_55_1 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
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
        var30 = Kickabout.field_G;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param3[3] >> 2;
            var22 = param3[4] >> 2;
            var23 = param3[5] >> 2;
            var24 = param3[6] >> 2;
            var25 = param3[7] >> 2;
            var26 = param3[8] >> 2;
            var27 = param3[9] >> 2;
            var28 = param3[10] >> 2;
            var13 = param2[5] * var26 + var24 * param2[3] + param2[4] * var25 >> 14;
            var29 = param3[11] >> 2;
            var12 = param2[4] * var22 + param2[3] * var21 + var23 * param2[5] >> 14;
            var20 = var29 * param2[11] + param2[10] * var28 + var27 * param2[9] >> 14;
            var16 = var26 * param2[8] + var24 * param2[6] - -(var25 * param2[7]) >> 14;
            var17 = param2[6] * var27 - (-(var28 * param2[7]) - var29 * param2[8]) >> 14;
            var18 = param2[11] * var23 + (param2[10] * var22 + var21 * param2[9]) >> 14;
            var14 = var29 * param2[5] + var27 * param2[3] - -(var28 * param2[4]) >> 14;
            var19 = var24 * param2[9] - -(param2[10] * var25) - -(var26 * param2[11]) >> 14;
            var15 = param2[6] * var21 - -(var22 * param2[7]) - -(var23 * param2[8]) >> 14;
            var21 = -param3[0] + param2[0];
            var22 = param2[1] - param3[1];
            var23 = param2[2] + -param3[2];
            var9 = var23 * param3[5] + param3[4] * var22 + param3[3] * var21 >> -im.field_yb + 16;
            var11 = var23 * param3[11] + param3[9] * var21 - -(param3[10] * var22) >> 16;
            var24 = -48 / ((9 - param4) / 45);
            var10 = param3[8] * var23 + var21 * param3[6] - -(param3[7] * var22) >> -im.field_yb + 16;
            var21 = t.field_p;
            var22 = t.field_e;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (~param0.field_b >= ~var23) {
                        break L5;
                      } else {
                        var24 = param0.field_f[var23];
                        var25 = param0.field_r[var23];
                        var26 = param0.field_P[var23];
                        var27 = (var26 * var18 + var24 * var12 - -(var25 * var15) >> 16 - im.field_yb) + var9;
                        var28 = (var26 * var19 + var24 * var13 - -(var16 * var25) >> 16 + -im.field_yb) + var10;
                        var29 = (var25 * var17 + (var24 * var14 - -(var20 * var26)) >> 16) + var11;
                        stackOut_3_0 = ~var29;
                        stackOut_3_1 = -51;
                        stackIn_56_0 = stackOut_3_0;
                        stackIn_56_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (var30 != 0) {
                          L6: while (true) {
                            if (stackIn_56_0 >= stackIn_56_1) {
                              break L4;
                            } else {
                              stackOut_57_0 = pv.field_F.length;
                              stackIn_65_0 = stackOut_57_0;
                              stackIn_58_0 = stackOut_57_0;
                              if (var30 != 0) {
                                break L3;
                              } else {
                                stackOut_58_0 = stackIn_58_0;
                                stackIn_60_0 = stackOut_58_0;
                                if (stackIn_60_0 <= var18) {
                                  break L4;
                                } else {
                                  var19 = param0.field_F[var18];
                                  var20 = param0.field_I[var18];
                                  var21 = param0.field_v[var18];
                                  pv.field_F[var18] = var9 * var19 - (-(var12 * var20) + -(var15 * var21)) >> 16;
                                  ba.field_q[var18] = var16 * var21 + (var19 * var10 - -(var13 * var20)) >> 16;
                                  el.field_E[var18] = var14 * var20 + (var11 * var19 - -(var21 * var17)) >> 16;
                                  var18++;
                                  if (var30 == 0) {
                                    stackOut_55_0 = var18;
                                    stackOut_55_1 = param0.field_k;
                                    stackIn_56_0 = stackOut_55_0;
                                    stackIn_56_1 = stackOut_55_1;
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
                              if (stackIn_4_0 > stackIn_4_1) {
                                break L8;
                              } else {
                                L9: {
                                  fb.field_M[var23] = var27 / var29 + var21;
                                  fk.field_k[var23] = var28 / var29 + var22;
                                  ld.field_e[var23] = var29;
                                  if (var29 <= var8) {
                                    break L9;
                                  } else {
                                    var8 = var29;
                                    break L9;
                                  }
                                }
                                if (~var7_int < ~var29) {
                                  var7_int = var29;
                                  if (var30 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ld.field_e[var23] = -2147483648;
                            break L7;
                          }
                          L10: {
                            if (param1) {
                              vf.field_M[var23] = var27 >> im.field_yb;
                              ud.field_B[var23] = var28 >> im.field_yb;
                              bw.field_f[var23] = var29;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var23++;
                          if (var30 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L11: {
                      if (param0.field_S == null) {
                        break L11;
                      } else {
                        if (null == param0.field_C) {
                          break L11;
                        } else {
                          if (null == param0.field_J) {
                            break L11;
                          } else {
                            if (null == param0.field_O) {
                              break L11;
                            } else {
                              if (null == param0.field_H) {
                                break L11;
                              } else {
                                if (param0.field_D == null) {
                                  break L11;
                                } else {
                                  if (param0.field_a == null) {
                                    break L11;
                                  } else {
                                    if (param0.field_e == null) {
                                      break L11;
                                    } else {
                                      if (null == param0.field_d) {
                                        break L11;
                                      } else {
                                        var23 = 0;
                                        L12: while (true) {
                                          if (~param0.field_g >= ~var23) {
                                            break L11;
                                          } else {
                                            var24 = param0.field_S[var23];
                                            var25 = param0.field_C[var23];
                                            var26 = param0.field_J[var23];
                                            jd.field_h[var23] = (var26 * var18 + var15 * var25 + var12 * var24 >> 16) + var9;
                                            un.field_a[var23] = var10 + (var16 * var25 + var24 * var13 - -(var26 * var19) >> 16);
                                            ir.field_A[var23] = var11 + (var20 * var26 + (var25 * var17 + var24 * var14) >> 16);
                                            var24 = param0.field_O[var23];
                                            var25 = param0.field_H[var23];
                                            var26 = param0.field_D[var23];
                                            qp.field_I[var23] = (var18 * var26 + (var12 * var24 - -(var15 * var25)) >> 16) + var9;
                                            ib.field_C[var23] = var10 + (var26 * var19 + (var16 * var25 + var24 * var13) >> 16);
                                            hg.field_I[var23] = (var25 * var17 + (var14 * var24 + var20 * var26) >> 16) + var11;
                                            var24 = param0.field_a[var23];
                                            var25 = param0.field_e[var23];
                                            var26 = param0.field_d[var23];
                                            li.field_g[var23] = (var12 * var24 + var15 * var25 + var26 * var18 >> 16) + var9;
                                            jl.field_e[var23] = (var19 * var26 + var24 * var13 + var25 * var16 >> 16) + var10;
                                            gp.field_g[var23] = var11 - -(var17 * var25 + (var24 * var14 + var26 * var20) >> 16);
                                            var23++;
                                            if (var30 != 0) {
                                              break L2;
                                            } else {
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
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!param6) {
                      break L4;
                    } else {
                      var9 = param2[3];
                      var10 = param2[4];
                      var11 = param2[5];
                      var12 = param2[6];
                      var13 = param2[7];
                      var14 = param2[8];
                      var15 = param2[9];
                      var16 = param2[10];
                      var17 = param2[11];
                      var18 = 0;
                      L13: while (true) {
                        stackOut_55_0 = var18;
                        stackOut_55_1 = param0.field_k;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (stackIn_56_0 >= stackIn_56_1) {
                          break L4;
                        } else {
                          stackOut_57_0 = pv.field_F.length;
                          stackIn_65_0 = stackOut_57_0;
                          stackIn_58_0 = stackOut_57_0;
                          if (var30 != 0) {
                            break L3;
                          } else {
                            stackOut_58_0 = stackIn_58_0;
                            stackIn_60_0 = stackOut_58_0;
                            if (stackIn_60_0 <= var18) {
                              break L4;
                            } else {
                              var19 = param0.field_F[var18];
                              var20 = param0.field_I[var18];
                              var21 = param0.field_v[var18];
                              pv.field_F[var18] = var9 * var19 - (-(var12 * var20) + -(var15 * var21)) >> 16;
                              ba.field_q[var18] = var16 * var21 + (var19 * var10 - -(var13 * var20)) >> 16;
                              el.field_E[var18] = var14 * var20 + (var11 * var19 - -(var21 * var17)) >> 16;
                              var18++;
                              if (var30 == 0) {
                                continue L13;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_64_0 = -336184828;
                  stackIn_65_0 = stackOut_64_0;
                  break L3;
                }
                wj.a(stackIn_65_0, param0, var7_int, var8, param5);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("os.B(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L14;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L14;
            }
          }
          L15: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
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
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    os() {
        ((os) this).field_s = 0;
        ((os) this).field_r = new byte[18002];
        ((os) this).field_c = new boolean[256];
        ((os) this).field_k = new int[6][258];
        ((os) this).field_L = new int[6];
        ((os) this).field_C = new int[6][258];
        ((os) this).field_B = new boolean[16];
        ((os) this).field_K = 0;
        ((os) this).field_u = new int[257];
        ((os) this).field_J = new byte[18002];
        ((os) this).field_n = new int[6][258];
        ((os) this).field_f = new int[16];
        ((os) this).field_m = new byte[256];
        ((os) this).field_g = new byte[4096];
        ((os) this).field_o = new int[256];
        ((os) this).field_b = new byte[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading extra data (1/2)";
        field_w = "You do not have a suitable number of players for the current options.";
        field_l = new rv();
        field_i = new String[]{"Rating", "League", "Avg. Stat"};
    }
}
