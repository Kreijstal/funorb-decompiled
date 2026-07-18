/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou {
    static int field_c;
    static String field_f;
    static char[] field_a;
    static vo field_h;
    private at[][] field_i;
    private lo[] field_b;
    static String field_g;
    private kl[] field_e;
    private boolean field_d;
    static String field_j;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_g = null;
              if (param0 == 4116) {
                break L1;
              } else {
                ou.a(-15);
                break L1;
              }
            }
            field_h = null;
            field_f = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ou.A(" + param0 + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            fh.field_i = false;
            ac.field_n = false;
            gl.a(127, -1);
            oh.field_L = nb.field_i;
            mh.field_b = nb.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ou.M(" + true + ')');
        }
    }

    private final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((ou) this).field_e) {
                break L1;
              } else {
                if (2 > ((ou) this).field_e.length) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == 0) {
                      break L2;
                    } else {
                      if (param1 == 1) {
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  L3: {
                    if (df.field_M > 0) {
                      break L3;
                    } else {
                      if (param1 != 1) {
                        break L3;
                      } else {
                        if (((ou) this).field_d) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  ((ou) this).field_e[param1] = param2;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("ou.I(").append(24402).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final static void b(byte param0) {
        if (param0 <= 114) {
            return;
        }
        try {
            vi.a("", 640, (String) null);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ou.D(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        bb var6 = null;
        lo var7 = null;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ou) this).field_i == null) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (~((ou) this).field_i.length < ~param2) {
                    L2: {
                      if (((ou) this).field_i[param2] == null) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          break L2;
                        } else {
                          if (~((ou) this).field_i[param2].length >= ~param1) {
                            break L2;
                          } else {
                            if (null == ((ou) this).field_i[param2][param1]) {
                              stackOut_24_0 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              return stackIn_25_0;
                            } else {
                              var5_int = param0;
                              var6 = new bb(((ou) this).field_i[param2][param1]);
                              var7 = (lo) (Object) var6.c(param0 + 50);
                              L3: while (true) {
                                if (null == var7) {
                                  stackOut_34_0 = var5_int;
                                  stackIn_35_0 = stackOut_34_0;
                                  break L0;
                                } else {
                                  L4: {
                                    if (var7.field_k < param3) {
                                      break L4;
                                    } else {
                                      var5_int++;
                                      break L4;
                                    }
                                  }
                                  var7 = (lo) (Object) var6.b(param0 + 50);
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "ou.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_35_0;
    }

    private final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ou) this).field_b = new lo[wn.field_eb.length];
              var2_int = 0;
              if (param0 > 110) {
                break L1;
              } else {
                this.a((byte) -41);
                break L1;
              }
            }
            L2: while (true) {
              if (wn.field_eb.length <= var2_int) {
                break L0;
              } else {
                L3: {
                  var3 = ((ou) this).field_e[0].a(wn.field_eb[var2_int], 35, "");
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (var3.length != 0) {
                      ((ou) this).field_b[var2_int] = new lo(-1, var3);
                      var2_int++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "ou.F(" + param0 + ')');
        }
    }

    final lo a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        bb var6_ref = null;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_50_0 = null;
        lo stackIn_67_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_41_0 = null;
        Object stackOut_49_0 = null;
        lo stackOut_66_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_11_0 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((ou) this).field_i) {
                break L1;
              } else {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (~param3 <= ~((ou) this).field_i.length) {
                    break L1;
                  } else {
                    if (~ns.field_A.length < ~param3) {
                      L2: {
                        if (null == ((ou) this).field_i[param3]) {
                          break L2;
                        } else {
                          if (0 > param2) {
                            break L2;
                          } else {
                            if (param2 >= ((ou) this).field_i[param3].length) {
                              break L2;
                            } else {
                              L3: {
                                if (((ou) this).field_i.length != ns.field_A.length) {
                                  break L3;
                                } else {
                                  if (ns.field_A[param3].length != ((ou) this).field_i[param3].length) {
                                    break L3;
                                  } else {
                                    L4: {
                                      if (param3 != 1) {
                                        break L4;
                                      } else {
                                        if (((ou) this).field_d) {
                                          break L4;
                                        } else {
                                          if (df.field_M < 0) {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = stackOut_41_0;
                                            return (lo) (Object) stackIn_42_0;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                    if (param1 == 4136) {
                                      if (null == ((ou) this).field_i[param3][param2]) {
                                        stackOut_49_0 = null;
                                        stackIn_50_0 = stackOut_49_0;
                                        return (lo) (Object) stackIn_50_0;
                                      } else {
                                        var6_ref = new bb(((ou) this).field_i[param3][param2]);
                                        var7 = (lo) (Object) var6_ref.c(param1 + -4086);
                                        var8 = 0;
                                        L5: while (true) {
                                          L6: {
                                            if (var7 == null) {
                                              break L6;
                                            } else {
                                              L7: {
                                                if (param0 > var7.field_k) {
                                                  break L7;
                                                } else {
                                                  if (~var8 != ~param4) {
                                                    break L7;
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              L8: {
                                                if (~param0 < ~var7.field_k) {
                                                  break L8;
                                                } else {
                                                  var8++;
                                                  break L8;
                                                }
                                              }
                                              var7 = (lo) (Object) var6_ref.b(50);
                                              continue L5;
                                            }
                                          }
                                          stackOut_66_0 = (lo) var7;
                                          stackIn_67_0 = stackOut_66_0;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      stackOut_44_0 = null;
                                      stackIn_45_0 = stackOut_44_0;
                                      return (lo) (Object) stackIn_45_0;
                                    }
                                  }
                                }
                              }
                              stackOut_30_0 = null;
                              stackIn_31_0 = stackOut_30_0;
                              return (lo) (Object) stackIn_31_0;
                            }
                          }
                        }
                      }
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      return (lo) (Object) stackIn_23_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_11_0 = null;
            stackIn_12_0 = stackOut_11_0;
            return (lo) (Object) stackIn_12_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "ou.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_67_0;
    }

    final static void a(pu param0, boolean param1, boolean param2, boolean param3, boolean param4, int[] param5, int[] param6) {
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
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var30 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param6[3] >> 2;
            var22 = param6[4] >> 2;
            var23 = param6[5] >> 2;
            var24 = param6[6] >> 2;
            var25 = param6[7] >> 2;
            var26 = param6[8] >> 2;
            var27 = param6[9] >> 2;
            var28 = param6[10] >> 2;
            var12 = param5[3] * var21 - -(param5[4] * var22) - -(param5[5] * var23) >> 14;
            var29 = param6[11] >> 2;
            var13 = param5[5] * var26 + (var25 * param5[4] + var24 * param5[3]) >> 14;
            var18 = var22 * param5[10] + var21 * param5[9] - -(var23 * param5[11]) >> 14;
            var16 = var24 * param5[6] - -(param5[7] * var25) + param5[8] * var26 >> 14;
            var17 = var29 * param5[8] + (param5[6] * var27 - -(var28 * param5[7])) >> 14;
            var14 = param5[5] * var29 + var27 * param5[3] + var28 * param5[4] >> 14;
            var15 = param5[7] * var22 + (param5[6] * var21 + param5[8] * var23) >> 14;
            var19 = param5[9] * var24 + (param5[10] * var25 + var26 * param5[11]) >> 14;
            var20 = param5[10] * var28 + var27 * param5[9] - -(var29 * param5[11]) >> 14;
            var21 = -param6[0] + param5[0];
            var22 = -param6[1] + param5[1];
            var23 = param5[2] - param6[2];
            var9 = param6[5] * var23 + (param6[4] * var22 + param6[3] * var21) >> -fn.field_M + 16;
            var11 = var23 * param6[11] + var22 * param6[10] + var21 * param6[9] >> 16;
            var10 = param6[6] * var21 - -(param6[7] * var22) - -(param6[8] * var23) >> -fn.field_M + 16;
            var21 = tm.field_c;
            var22 = tm.field_j;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param0.field_O) {
                L2: {
                  if (null == param0.field_g) {
                    break L2;
                  } else {
                    if (param0.field_M == null) {
                      break L2;
                    } else {
                      if (param0.field_v == null) {
                        break L2;
                      } else {
                        if (param0.field_N == null) {
                          break L2;
                        } else {
                          if (null == param0.field_a) {
                            break L2;
                          } else {
                            if (param0.field_n == null) {
                              break L2;
                            } else {
                              if (param0.field_m == null) {
                                break L2;
                              } else {
                                if (param0.field_F == null) {
                                  break L2;
                                } else {
                                  if (param0.field_I == null) {
                                    break L2;
                                  } else {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (var23 >= param0.field_q) {
                                        break L2;
                                      } else {
                                        var24 = param0.field_g[var23];
                                        var25 = param0.field_M[var23];
                                        var26 = param0.field_v[var23];
                                        dl.field_c[var23] = (var26 * var18 + (var24 * var12 - -(var15 * var25)) >> 16) + var9;
                                        jb.field_p[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 16) + var10;
                                        uq.field_u[var23] = (var24 * var14 + (var17 * var25 + var26 * var20) >> 16) + var11;
                                        var24 = param0.field_N[var23];
                                        var25 = param0.field_a[var23];
                                        var26 = param0.field_n[var23];
                                        ju.field_c[var23] = (var18 * var26 + (var12 * var24 - -(var15 * var25)) >> 16) + var9;
                                        ji.field_c[var23] = var10 - -(var13 * var24 + (var16 * var25 + var26 * var19) >> 16);
                                        fl.field_f[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 16) + var11;
                                        var24 = param0.field_m[var23];
                                        var25 = param0.field_F[var23];
                                        var26 = param0.field_I[var23];
                                        dj.field_b[var23] = (var26 * var18 + var12 * var24 - -(var15 * var25) >> 16) + var9;
                                        li.field_k[var23] = var10 - -(var16 * var25 + var24 * var13 - -(var19 * var26) >> 16);
                                        is.field_e[var23] = var11 + (var26 * var20 + (var25 * var17 + var24 * var14) >> 16);
                                        var23++;
                                        continue L3;
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
                var9 = param5[3];
                var10 = param5[4];
                var11 = param5[5];
                var12 = param5[6];
                var13 = param5[7];
                var14 = param5[8];
                var15 = param5[9];
                var16 = param5[10];
                var17 = param5[11];
                var18 = 0;
                L4: while (true) {
                  L5: {
                    if (param0.field_t <= var18) {
                      break L5;
                    } else {
                      if (var18 >= ArmiesOfGielinor.field_I.length) {
                        break L5;
                      } else {
                        var19 = param0.field_l[var18];
                        var20 = param0.field_f[var18];
                        var21 = param0.field_x[var18];
                        ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 - -(var21 * var15)) >> 16;
                        kb.field_m[var18] = var16 * var21 + var10 * var19 - -(var20 * var13) >> 16;
                        rj.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  et.a(param0, -10, false, var7_int, var8);
                  break L0;
                }
              } else {
                L6: {
                  var24 = param0.field_z[var23];
                  var25 = param0.field_y[var23];
                  var26 = param0.field_o[var23];
                  var27 = (var18 * var26 + (var24 * var12 - -(var25 * var15)) >> -fn.field_M + 16) + var9;
                  var28 = (var13 * var24 + var25 * var16 - -(var19 * var26) >> -fn.field_M + 16) + var10;
                  var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 16) + var11;
                  if (50 <= var29) {
                    L7: {
                      ca.field_f[var23] = var21 - -(var27 / var29);
                      fa.field_k[var23] = var28 / var29 + var22;
                      ls.field_c[var23] = var29;
                      if (~var29 >= ~var8) {
                        break L7;
                      } else {
                        var8 = var29;
                        break L7;
                      }
                    }
                    if (var7_int > var29) {
                      var7_int = var29;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    ls.field_c[var23] = -2147483648;
                    break L6;
                  }
                }
                var23++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var7;
            stackOut_61_1 = new StringBuilder().append("ou.L(");
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L8;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L8;
            }
          }
          L9: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(true).append(',').append(true).append(',').append(false).append(',').append(false).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param5 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L9;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L9;
            }
          }
          L10: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param6 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L10;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = -1;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 > 1) {
                  break L2;
                } else {
                  L3: {
                    if (var4 < 0) {
                      break L3;
                    } else {
                      if (var4 < lp.field_a.length) {
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (~lp.field_a[var4].length >= ~var5) {
                              break L5;
                            } else {
                              if (~lp.field_a[var4][var5] != ~param1) {
                                var5++;
                                continue L4;
                              } else {
                                var3_int = var4;
                                break L5;
                              }
                            }
                          }
                          if (0 > var3_int) {
                            var4++;
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              L6: {
                if (0 == var3_int) {
                  break L6;
                } else {
                  if (1 != var3_int) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_35_0 = var3_int;
              stackIn_36_0 = stackOut_35_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ou.C(" + 0 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    private final kl a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_30_0 = null;
        kl stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_29_0 = null;
        kl stackOut_31_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (((ou) this).field_e == null) {
                break L1;
              } else {
                if (((ou) this).field_e.length == 2) {
                  L2: {
                    if (param1 < 0) {
                      break L2;
                    } else {
                      if (ns.field_A.length <= param1) {
                        break L2;
                      } else {
                        L3: {
                          var3_int = this.b(0, param1);
                          if (var3_int == 0) {
                            break L3;
                          } else {
                            if (var3_int != 1) {
                              stackOut_20_0 = null;
                              stackIn_21_0 = stackOut_20_0;
                              return (kl) (Object) stackIn_21_0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (var3_int != 1) {
                            break L4;
                          } else {
                            if (((ou) this).field_d) {
                              break L4;
                            } else {
                              if (0 < df.field_M) {
                                break L4;
                              } else {
                                stackOut_29_0 = null;
                                stackIn_30_0 = stackOut_29_0;
                                return (kl) (Object) stackIn_30_0;
                              }
                            }
                          }
                        }
                        stackOut_31_0 = ((ou) this).field_e[var3_int];
                        stackIn_32_0 = stackOut_31_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (kl) (Object) stackIn_13_0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
            return (kl) (Object) stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ou.J(" + -1 + ',' + param1 + ')');
        }
        return stackIn_32_0;
    }

    private final void b() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((ou) this).field_i = new at[ns.field_A.length][];
            var2_int = 8;
            var3 = 0;
            L1: while (true) {
              if (~var3 <= ~ns.field_A.length) {
                break L0;
              } else {
                ((ou) this).field_i[var3] = new at[ns.field_A[var3].length];
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "ou.N(" + -127 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                if (param1 != 1) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (0 < df.field_M) {
                break L2;
              } else {
                if (param1 != 1) {
                  break L2;
                } else {
                  if (((ou) this).field_d) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
            }
            var3 = lp.field_a[param1];
            var4 = 0;
            L3: while (true) {
              if (~var4 <= ~var3.length) {
                break L0;
              } else {
                L4: {
                  var5 = var3[var4];
                  if (var5 < 0) {
                    break L4;
                  } else {
                    if (~var5 > ~ns.field_A.length) {
                      var6 = ns.field_A[var5].length;
                      var7 = 0;
                      L5: while (true) {
                        if (var6 <= var7) {
                          break L4;
                        } else {
                          this.a(5301, var7, var5);
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "ou.B(" + false + ',' + param1 + ')');
        }
    }

    final lo a(byte param0, int param1) {
        RuntimeException var3 = null;
        lo stackIn_4_0 = null;
        lo stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        lo stackOut_3_0 = null;
        lo stackOut_8_0 = null;
        try {
          L0: {
            if (param1 < ((ou) this).field_b.length) {
              stackOut_3_0 = ((ou) this).field_b[param1];
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 == 59) {
                  break L1;
                } else {
                  field_c = 32;
                  break L1;
                }
              }
              stackOut_8_0 = ((ou) this).field_b[0];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ou.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    ou(kl param0, kl param1, boolean param2) {
        RuntimeException var4 = null;
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
        try {
          L0: {
            ((ou) this).field_e = new kl[2];
            ((ou) this).field_d = param2;
            this.a(24402, 0, param0);
            this.a(24402, 1, param1);
            int discarded$2 = -127;
            this.b();
            this.a(false, 0);
            this.a(false, 1);
            this.a((byte) 111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("ou.<init>(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        kl var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = this.a(-1, param2);
            if (var4 != null) {
              ((ou) this).field_i[param2][param1] = new at();
              var5 = 0;
              L1: while (true) {
                if (ns.field_A[param2][param1].length <= var5) {
                  break L0;
                } else {
                  L2: {
                    var6 = var4.a(ns.field_A[param2][param1][var5], 52, "");
                    if (var6 == null) {
                      break L2;
                    } else {
                      if (var6.length != 0) {
                        ((ou) this).field_i[param2][param1].a((byte) -119, (tc) (Object) new lo(var5, var6));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4_ref, "ou.G(" + 5301 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_f = "Played";
        field_c = 0;
        field_g = "Hide lobby chat";
        field_j = "Equipment Stock";
    }
}
