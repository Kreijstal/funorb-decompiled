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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
          throw ig.a((Throwable) ((Object) var1), "ou.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        fh.field_i = false;
        ac.field_n = false;
        if (!param0) {
            return;
        }
        try {
            gl.a(127, -1);
            oh.field_L = nb.field_i;
            mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ou.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, kl param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 24402) {
                break L1;
              } else {
                this.field_d = false;
                break L1;
              }
            }
            L2: {
              if (null == this.field_e) {
                break L2;
              } else {
                if (2 > this.field_e.length) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == (param1 ^ -1)) {
                      break L3;
                    } else {
                      if ((param1 ^ -1) == -2) {
                        break L3;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if ((df.field_M ^ -1) < -1) {
                      break L4;
                    } else {
                      if (-2 != (param1 ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_d) {
                          break L4;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  this.field_e[param1] = param2;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("ou.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
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

    final static void b(byte param0) {
        if (param0 <= 114) {
            return;
        }
        try {
            vi.a("", 640, (String) null);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ou.D(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        bb var6 = null;
        lo var7 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_i == null) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if ((this.field_i.length ^ -1) < (param2 ^ -1)) {
                    L2: {
                      if (this.field_i[param2] == null) {
                        break L2;
                      } else {
                        if ((param1 ^ -1) > -1) {
                          break L2;
                        } else {
                          if ((this.field_i[param2].length ^ -1) >= (param1 ^ -1)) {
                            break L2;
                          } else {
                            if (null == this.field_i[param2][param1]) {
                              stackIn_25_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var5_int = param0;
                              var6 = new bb(this.field_i[param2][param1]);
                              var7 = (lo) ((Object) var6.c(param0 + 50));
                              L3: while (true) {
                                if (null == var7) {
                                  stackIn_35_0 = var5_int;
                                  decompiledRegionSelector0 = 3;
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
                                  var7 = (lo) ((Object) var6.b(param0 + 50));
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "ou.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              return stackIn_35_0;
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_b = new lo[wn.field_eb.length];
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
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = this.field_e[0].a(wn.field_eb[var2_int], 35, "");
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (-1 != (var3.length ^ -1)) {
                      this.field_b[var2_int] = new lo(-1, var3);
                      var2_int++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ou.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final lo a(int param0, int param1, int param2, int param3, int param4) {
        Object stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_42_0 = null;
        lo stackIn_45_0 = null;
        Object stackIn_50_0 = null;
        lo stackIn_67_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bb var6 = null;
        RuntimeException var6_ref = null;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_i) {
                break L1;
              } else {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if ((param3 ^ -1) <= (this.field_i.length ^ -1)) {
                    break L1;
                  } else {
                    if ((ns.field_A.length ^ -1) < (param3 ^ -1)) {
                      L2: {
                        if (null == this.field_i[param3]) {
                          break L2;
                        } else {
                          if (0 > param2) {
                            break L2;
                          } else {
                            if (param2 >= this.field_i[param3].length) {
                              break L2;
                            } else {
                              L3: {
                                if (this.field_i.length != ns.field_A.length) {
                                  break L3;
                                } else {
                                  if (ns.field_A[param3].length != this.field_i[param3].length) {
                                    break L3;
                                  } else {
                                    L4: {
                                      if (-2 != (param3 ^ -1)) {
                                        break L4;
                                      } else {
                                        if (this.field_d) {
                                          break L4;
                                        } else {
                                          if ((df.field_M ^ -1) > -1) {
                                            stackIn_42_0 = null;
                                            decompiledRegionSelector0 = 3;
                                            break L0;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                    if (param1 == 4136) {
                                      if (null == this.field_i[param3][param2]) {
                                        stackIn_50_0 = null;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      } else {
                                        var6 = new bb(this.field_i[param3][param2]);
                                        var7 = (lo) ((Object) var6.c(param1 + -4086));
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
                                                  if ((var8 ^ -1) != (param4 ^ -1)) {
                                                    break L7;
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              L8: {
                                                if ((param0 ^ -1) < (var7.field_k ^ -1)) {
                                                  break L8;
                                                } else {
                                                  var8++;
                                                  break L8;
                                                }
                                              }
                                              var7 = (lo) ((Object) var6.b(50));
                                              continue L5;
                                            }
                                          }
                                          stackIn_67_0 = (lo) (var7);
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      stackIn_45_0 = (lo) null;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackIn_31_0 = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_12_0 = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6_ref), "ou.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lo) ((Object) stackIn_12_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (lo) ((Object) stackIn_23_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (lo) ((Object) stackIn_31_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (lo) ((Object) stackIn_42_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_45_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (lo) ((Object) stackIn_50_0);
                  } else {
                    return stackIn_67_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(pu param0, boolean param1, boolean param2, boolean param3, boolean param4, int[] param5, int[] param6) {
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
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var30 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param6[3] >> -797777182;
            var22 = param6[4] >> -1676208542;
            var23 = param6[5] >> -769021630;
            var24 = param6[6] >> -785033918;
            var25 = param6[7] >> 2008853346;
            var26 = param6[8] >> 1593592386;
            var27 = param6[9] >> 1649947522;
            var28 = param6[10] >> -1672009598;
            var12 = param5[3] * var21 - -(param5[4] * var22) - -(param5[5] * var23) >> 1438734990;
            var29 = param6[11] >> 309062722;
            var13 = param5[5] * var26 + (var25 * param5[4] + var24 * param5[3]) >> 471178126;
            var18 = var22 * param5[10] + var21 * param5[9] - -(var23 * param5[11]) >> 955377582;
            var16 = var24 * param5[6] - -(param5[7] * var25) + param5[8] * var26 >> -1021184978;
            var17 = var29 * param5[8] + (param5[6] * var27 - -(var28 * param5[7])) >> 1600821998;
            var14 = param5[5] * var29 + var27 * param5[3] + var28 * param5[4] >> 1187986126;
            var15 = param5[7] * var22 + (param5[6] * var21 + param5[8] * var23) >> 1357556334;
            var19 = param5[9] * var24 + (param5[10] * var25 + var26 * param5[11]) >> -1310059378;
            var20 = param5[10] * var28 + var27 * param5[9] - -(var29 * param5[11]) >> 1670841550;
            var21 = -param6[0] + param5[0];
            var22 = -param6[1] + param5[1];
            var23 = param5[2] - param6[2];
            var9 = param6[5] * var23 + (param6[4] * var22 + param6[3] * var21) >> -fn.field_M + 16;
            if (param2) {
              var11 = var23 * param6[11] + var22 * param6[10] + var21 * param6[9] >> -2137610896;
              var10 = param6[6] * var21 - -(param6[7] * var22) - -(param6[8] * var23) >> -fn.field_M + 16;
              var21 = tm.field_c;
              var22 = tm.field_j;
              var23 = 0;
              L1: while (true) {
                L2: {
                  if (var23 >= param0.field_O) {
                    L3: {
                      if (null == param0.field_g) {
                        break L3;
                      } else {
                        if (param0.field_M == null) {
                          break L3;
                        } else {
                          if (param0.field_v == null) {
                            break L3;
                          } else {
                            if (param0.field_N == null) {
                              break L3;
                            } else {
                              if (null == param0.field_a) {
                                break L3;
                              } else {
                                if (param0.field_n == null) {
                                  break L3;
                                } else {
                                  if (param0.field_m == null) {
                                    break L3;
                                  } else {
                                    if (param0.field_F == null) {
                                      break L3;
                                    } else {
                                      if (param0.field_I == null) {
                                        break L3;
                                      } else {
                                        var23 = 0;
                                        L4: while (true) {
                                          if (var23 >= param0.field_q) {
                                            break L3;
                                          } else {
                                            var24 = param0.field_g[var23];
                                            var25 = param0.field_M[var23];
                                            var26 = param0.field_v[var23];
                                            dl.field_c[var23] = (var26 * var18 + (var24 * var12 - -(var15 * var25)) >> -1513517264) + var9;
                                            jb.field_p[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 1397744784) + var10;
                                            uq.field_u[var23] = (var24 * var14 + (var17 * var25 + var26 * var20) >> 441867984) + var11;
                                            var24 = param0.field_N[var23];
                                            var25 = param0.field_a[var23];
                                            var26 = param0.field_n[var23];
                                            ju.field_c[var23] = (var18 * var26 + (var12 * var24 - -(var15 * var25)) >> -1756043856) + var9;
                                            ji.field_c[var23] = var10 - -(var13 * var24 + (var16 * var25 + var26 * var19) >> -1433100912);
                                            fl.field_f[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 1993611856) + var11;
                                            var24 = param0.field_m[var23];
                                            var25 = param0.field_F[var23];
                                            var26 = param0.field_I[var23];
                                            dj.field_b[var23] = (var26 * var18 + var12 * var24 - -(var15 * var25) >> 246774288) + var9;
                                            li.field_k[var23] = var10 - -(var16 * var25 + var24 * var13 - -(var19 * var26) >> 1438952656);
                                            is.field_e[var23] = var11 + (var26 * var20 + (var25 * var17 + var24 * var14) >> 570715120);
                                            var23++;
                                            continue L4;
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
                    if (!param1) {
                      break L2;
                    } else {
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
                      L5: while (true) {
                        stackIn_58_0 = param0.field_t;
                        stackIn_58_1 = var18;
                        if (stackIn_58_0 <= stackIn_58_1) {
                          break L2;
                        } else {
                          if (var18 >= ArmiesOfGielinor.field_I.length) {
                            break L2;
                          } else {
                            var19 = param0.field_l[var18];
                            var20 = param0.field_f[var18];
                            var21 = param0.field_x[var18];
                            ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 - -(var21 * var15)) >> -372822352;
                            kb.field_m[var18] = var16 * var21 + var10 * var19 - -(var20 * var13) >> -834210192;
                            rj.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> -44736688;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var24 = param0.field_z[var23];
                    var25 = param0.field_y[var23];
                    var26 = param0.field_o[var23];
                    var27 = (var18 * var26 + (var24 * var12 - -(var25 * var15)) >> -fn.field_M + 16) + var9;
                    var28 = (var13 * var24 + var25 * var16 - -(var19 * var26) >> -fn.field_M + 16) + var10;
                    var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 994250640) + var11;
                    stackIn_58_0 = 50;

                    stackIn_58_1 = var29;

                    L7: {
                      if (stackIn_58_0 <= stackIn_58_1) {
                        L8: {
                          ca.field_f[var23] = var21 - -(var27 / var29);
                          fa.field_k[var23] = var28 / var29 + var22;
                          ls.field_c[var23] = var29;
                          if ((var29 ^ -1) >= (var8 ^ -1)) {
                            break L8;
                          } else {
                            var8 = var29;
                            break L8;
                          }
                        }
                        if (var7_int > var29) {
                          var7_int = var29;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        ls.field_c[var23] = -2147483648;
                        break L7;
                      }
                    }
                    L9: {
                      if (param4) {
                        uh.field_f[var23] = var27 >> fn.field_M;
                        ew.field_a[var23] = var28 >> fn.field_M;
                        qt.field_c[var23] = var29;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var23++;
                    continue L1;
                  }
                }
                et.a(param0, -10, param3, var7_int, var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("ou.L(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L10;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L11;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param6 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L12;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_69_0), stackIn_77_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = -1;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 > 1) {
                    break L3;
                  } else {
                    stackIn_31_0 = -1;

                    stackIn_31_1 = var4 ^ -1;

                    L4: {
                      if (stackIn_31_0 < stackIn_31_1) {
                        break L4;
                      } else {
                        if (var4 < lp.field_a.length) {
                          var5 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if ((lp.field_a[var4].length ^ -1) >= (var5 ^ -1)) {
                                  break L7;
                                } else {
                                  stackIn_23_0 = lp.field_a[var4][var5] ^ -1;

                                  stackIn_23_1 = param1 ^ -1;

                                  if (stackIn_23_0 != stackIn_23_1) {
                                    var5++;
                                    continue L5;
                                  } else {
                                    var3_int = var4;
                                    break L7;
                                  }
                                }
                              }
                              stackIn_23_0 = 0;
                              stackIn_23_1 = var3_int;
                              break L6;
                            }
                            if (stackIn_23_0 > stackIn_23_1) {
                              var4++;
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackIn_11_0 = -1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
                stackIn_31_0 = param0;
                stackIn_31_1 = var3_int;
                break L2;
              }
              L8: {
                if (stackIn_31_0 == stackIn_31_1) {
                  break L8;
                } else {
                  if (1 != var3_int) {
                    stackIn_38_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L8;
                  }
                }
              }
              stackIn_40_0 = var3_int;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ou.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_38_0;
          } else {
            return stackIn_40_0;
          }
        }
    }

    private final kl a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_30_0 = null;
        kl stackIn_32_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_e == null) {
                break L1;
              } else {
                if (this.field_e.length == 2) {
                  L2: {
                    if (param1 < 0) {
                      break L2;
                    } else {
                      if (ns.field_A.length <= param1) {
                        break L2;
                      } else {
                        L3: {
                          var3_int = this.b(0, param1);
                          if ((var3_int ^ -1) == param0) {
                            break L3;
                          } else {
                            if (var3_int != 1) {
                              stackIn_21_0 = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if ((var3_int ^ -1) != -2) {
                            break L4;
                          } else {
                            if (this.field_d) {
                              break L4;
                            } else {
                              if (0 < df.field_M) {
                                break L4;
                              } else {
                                stackIn_30_0 = null;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        stackIn_32_0 = this.field_e[var3_int];
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                  stackIn_13_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ou.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kl) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kl) ((Object) stackIn_13_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (kl) ((Object) stackIn_21_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (kl) ((Object) stackIn_30_0);
              } else {
                return stackIn_32_0;
              }
            }
          }
        }
    }

    private final void b(int param0) {
        at[] array$1 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_i = new at[ns.field_A.length][];
            var2_int = 35 / ((70 - param0) / 47);
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= (ns.field_A.length ^ -1)) {
                break L0;
              } else {
                array$1 = new at[ns.field_A[var3].length];
                this.field_i[var3] = array$1;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ou.N(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var6 = 0;
        int var7 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (param1 ^ -1)) {
                break L1;
              } else {
                if (-2 != (param1 ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                  if (this.field_d) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            L3: {
              var3 = lp.field_a[param1];
              if (!param0) {
                break L3;
              } else {
                field_h = (vo) null;
                break L3;
              }
            }
            var4 = 0;
            L4: while (true) {
              if ((var4 ^ -1) <= (var3.length ^ -1)) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  var5 = var3[var4];
                  if (-1 < (var5 ^ -1)) {
                    break L5;
                  } else {
                    if ((var5 ^ -1) > (ns.field_A.length ^ -1)) {
                      var6 = ns.field_A[var5].length;
                      var7 = 0;
                      L6: while (true) {
                        if (var6 <= var7) {
                          break L5;
                        } else {
                          this.a(5301, var7, var5);
                          var7++;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var4++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "ou.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final lo a(byte param0, int param1) {
        RuntimeException var3 = null;
        lo stackIn_4_0 = null;
        lo stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < this.field_b.length) {
              stackIn_4_0 = this.field_b[param1];
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 59) {
                  break L1;
                } else {
                  field_c = 32;
                  break L1;
                }
              }
              stackIn_9_0 = this.field_b[0];
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ou.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_9_0;
        }
    }

    ou(kl param0, kl param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_e = new kl[2];
            this.field_d = param2;
            this.a(24402, 0, param0);
            this.a(24402, 1, param1);
            this.b(-127);
            this.a(false, 0);
            this.a(false, 1);
            this.a((byte) 111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ou.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        kl var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = this.a(param0 ^ -5302, param2);
            if (param0 == 5301) {
              if (var4 != null) {
                this.field_i[param2][param1] = new at();
                var5 = 0;
                L1: while (true) {
                  if (ns.field_A[param2][param1].length <= var5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var6 = var4.a(ns.field_A[param2][param1][var5], param0 + -5249, "");
                      if (var6 == null) {
                        break L2;
                      } else {
                        if (var6.length != 0) {
                          this.field_i[param2][param1].a((byte) -119, (tc) (new lo(var5, var6)));
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "ou.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_a = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_f = "Played";
        field_c = 0;
        field_g = "Hide lobby chat";
        field_j = "Equipment Stock";
    }
}
