/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_b;
    static byte[][][] field_a;
    static int[] field_f;
    static nn field_d;
    static String field_e;
    static int field_c;

    final static void a(boolean param0, int param1, int param2, boolean param3, fr param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
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
        boolean stackIn_10_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        boolean stackIn_41_0 = false;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        boolean stackOut_40_0 = false;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ed.b(9, 3 * (-param1 + param2));
              var6 = param1 * 3;
              lj.a(0);
              var7 = var5_int + -10;
              if (param4.field_A <= 0) {
                break L1;
              } else {
                if (null == param4.field_p) {
                  break L1;
                } else {
                  qi.a((byte) 109);
                  break L1;
                }
              }
            }
            mc.field_c = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param4.field_C >= ~var8) {
                    break L4;
                  } else {
                    var9 = param4.field_G[var8];
                    var10 = param4.field_b[var8];
                    var11 = param4.field_c[var8];
                    stackOut_9_0 = param0;
                    stackIn_41_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0) {
                            var12 = da.field_M[var9];
                            var13 = ed.field_e[var9];
                            var14 = da.field_M[var10] - var12;
                            var15 = -var12 + da.field_M[var11];
                            var16 = ed.field_e[var10] - var13;
                            var17 = -var13 + ed.field_e[var11];
                            if (var14 * var17 + -(var15 * var16) >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var12 = vo.field_v[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          var13 = vo.field_v[var10];
                          if (var13 == -2147483648) {
                            break L5;
                          } else {
                            var14 = vo.field_v[var11];
                            if (var14 == -2147483648) {
                              break L5;
                            } else {
                              L7: {
                                var15 = var12 + (var13 - -var14 + -var6);
                                if (var7 < 0) {
                                  stackOut_21_0 = var15 << -var7;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L7;
                                } else {
                                  stackOut_19_0 = var15 >> var7;
                                  stackIn_22_0 = stackOut_19_0;
                                  break L7;
                                }
                              }
                              var16 = -stackIn_22_0 + (fi.field_w.length + -1);
                              var17 = fi.field_w[var16];
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (var17 >> 4 == 0) {
                                      break L10;
                                    } else {
                                      var16--;
                                      stackOut_24_0 = -1;
                                      stackOut_24_1 = ~var16;
                                      stackIn_32_0 = stackOut_24_0;
                                      stackIn_32_1 = stackOut_24_1;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      if (var19 != 0) {
                                        break L9;
                                      } else {
                                        L11: {
                                          if (stackIn_25_0 < stackIn_25_1) {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L11;
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                        var17 = fi.field_w[var16];
                                        if (var19 == 0) {
                                          continue L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_31_0 = var16 << 4;
                                  stackOut_31_1 = var17;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  break L9;
                                }
                                L12: {
                                  var18 = stackIn_32_0 + stackIn_32_1;
                                  ek.field_jb[var18] = var8;
                                  fi.field_w[var16] = var17 + 1;
                                  if (param4.field_A <= 0) {
                                    break L12;
                                  } else {
                                    if (param4.field_p == null) {
                                      break L12;
                                    } else {
                                      ke.field_m[param4.field_p[var8]] = ke.field_m[param4.field_p[var8]] + 1;
                                      break L12;
                                    }
                                  }
                                }
                                mc.field_c = mc.field_c + 1;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_40_0 = param3;
                stackIn_41_0 = stackOut_40_0;
                break L3;
              }
              L13: {
                if (!stackIn_41_0) {
                  break L13;
                } else {
                  field_e = null;
                  break L13;
                }
              }
              L14: {
                L15: {
                  if (0 >= param4.field_A) {
                    break L15;
                  } else {
                    if (param4.field_p == null) {
                      break L15;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (var9 >= ke.field_m.length) {
                          break L15;
                        } else {
                          var10 = ke.field_m[var9];
                          ke.field_m[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var5;
            stackOut_55_1 = new StringBuilder().append("bm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param4 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L17;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L17;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ')');
        }
    }

    final static void a(byte param0, mf param1) {
        RuntimeException var2 = null;
        pi var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        fr var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_ref = new pi(param1.a(-72, "logo.fo3d", ""));
            var3 = var2_ref.l(param0 + 325);
            var2_ref.n(param0 + -47);
            um.field_o = rk.a(var2_ref, 24);
            gg.field_i = new fr[var3];
            rn.field_e = new int[var3][];
            if (param0 == -70) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~var3) {
                      break L3;
                    } else {
                      gg.field_i[var4] = hc.a(16, var2_ref);
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
                  var2_ref.f((byte) 116);
                  break L2;
                }
                var4 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (~var4 <= ~var3) {
                        break L6;
                      } else {
                        var5 = gg.field_i[var4];
                        var5.a(6, 127, 1, 6, 6);
                        var5.c(param0 + 93);
                        var6 = new int[]{var5.field_N + var5.field_f >> 1, var5.field_d + var5.field_y >> 1, var5.field_x + var5.field_q >> 1};
                        rn.field_e[var4] = var6;
                        var5.a(-var6[2], param0 ^ -70, -var6[0], -var6[1]);
                        var4++;
                        if (var7 != 0) {
                          break L5;
                        } else {
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    break L5;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("bm.E(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, j param3, int param4, int param5, String param6, byte param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        double var9 = 0.0;
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param3.field_U < 50) {
              return;
            } else {
              L1: {
                var8_int = -50 + param3.field_U;
                var9 = 250.0 * Math.abs(Math.cos(0.1 * (double)var8_int)) * Math.exp((double)(-var8_int) / 40.0);
                if (param7 >= 69) {
                  break L1;
                } else {
                  field_c = -9;
                  break L1;
                }
              }
              L2: {
                if (var8_int < 110) {
                  break L2;
                } else {
                  var9 = 0.0;
                  break L2;
                }
              }
              L3: {
                var9 = var9 / (double)param5;
                vn.field_w.d(param0 - 7 / param5, -(7 / param5) + (param1 + -(int)var9));
                vn.field_w.g(-(7 / param5) + param0, (int)var9 + -(7 / param5) + (param1 - -vn.field_w.field_z));
                if (var8_int >= 130) {
                  L4: {
                    var11 = var8_int + -130;
                    if (var11 <= 100) {
                      break L4;
                    } else {
                      var11 = 100;
                      break L4;
                    }
                  }
                  var11 = var11 * 128 / 50;
                  nn.field_g.b(param6, param0 + param4 / (2 * param5), nn.field_g.field_B + (param2 / (2 * param5) + (param1 + -(100 / param5))), 0, -1, var11);
                  lo.a(param4, var11, 60, param0, param5, param1, param2, param3);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param6 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, vl param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        qc var6 = null;
        kl var6_ref = null;
        Object var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        oe[] var8_ref_oe__ = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_74_0 = 0;
        kl stackIn_78_0 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_73_0 = false;
        kl stackOut_77_0 = null;
        kl stackOut_75_0 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param3 == -30791) {
                break L1;
              } else {
                bm.a(98, -116, false, -50, (vl) null);
                break L1;
              }
            }
            var6 = (qc) (Object) param4.d(-65);
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    var7_ref = null;
                    stackOut_6_0 = 1;
                    stackIn_74_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0 != var6.field_m) {
                          L6: {
                            if (var6.field_m == 0) {
                              break L6;
                            } else {
                              if (var6.field_m != 2) {
                                if (var6.field_m == 4) {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  if (var6.field_m == 5) {
                                    var7_ref = (Object) (Object) ta.field_e[5];
                                    break L5;
                                  } else {
                                    if (6 != var6.field_m) {
                                      if (var6.field_m == 7) {
                                        var7_ref = (Object) (Object) ta.field_e[7];
                                        break L5;
                                      } else {
                                        if (3 == var6.field_m) {
                                          var7_ref = (Object) (Object) ef.field_a[var6.field_j];
                                          break L5;
                                        } else {
                                          if (8 == var6.field_m) {
                                            var7_ref = (Object) (Object) ta.field_e[10];
                                            break L5;
                                          } else {
                                            if (9 == var6.field_m) {
                                              var7_ref = (Object) (Object) ta.field_e[11];
                                              break L5;
                                            } else {
                                              if (var6.field_m == 10) {
                                                var7_ref = (Object) (Object) ta.field_e[12];
                                                break L5;
                                              } else {
                                                if (var6.field_m == 11) {
                                                  var7_ref = (Object) (Object) cg.field_p[oo.field_w.a(-37880252, cg.field_p.length)];
                                                  break L5;
                                                } else {
                                                  if (var6.field_m != 12) {
                                                    if (var6.field_m == 14) {
                                                      var7_ref = (Object) (Object) ta.field_e[14];
                                                      break L5;
                                                    } else {
                                                      if (var6.field_m != 13) {
                                                        break L5;
                                                      } else {
                                                        var7_ref = (Object) (Object) ta.field_e[15];
                                                        break L5;
                                                      }
                                                    }
                                                  } else {
                                                    var7_ref = (Object) (Object) ta.field_e[13];
                                                    break L5;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var7_ref = (Object) (Object) ta.field_e[6];
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                var7_ref = (Object) (Object) fr.field_e[oo.field_w.a(-37880252, fr.field_e.length)];
                                break L5;
                              }
                            }
                          }
                          var7_ref = (Object) (Object) mh.field_ob[oo.field_w.a(-37880252, mh.field_ob.length)];
                          break L5;
                        } else {
                          if (oa.field_Sb != null) {
                            L7: {
                              var8_ref_oe__ = oa.field_Sb.a(0);
                              if (0 < oa.field_Sb.field_l) {
                                var7_ref = (Object) (Object) var8_ref_oe__[oo.field_w.a(-37880252, oa.field_Sb.field_l)];
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        if (null != var7_ref) {
                          j.a((oe) var7_ref, -56, param0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var6 = (qc) (Object) param4.a((byte) 116);
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_73_0 = param2;
                stackIn_74_0 = stackOut_73_0 ? 1 : 0;
                break L3;
              }
              L9: {
                if (stackIn_74_0 == 0) {
                  stackOut_77_0 = to.field_k;
                  stackIn_78_0 = stackOut_77_0;
                  break L9;
                } else {
                  stackOut_75_0 = me.field_d;
                  stackIn_78_0 = stackOut_75_0;
                  break L9;
                }
              }
              L10: {
                var6_ref = stackIn_78_0;
                var7 = var5_int * param1;
                var8 = var6_ref.h();
                var9 = var5_int + 1 << 2;
                if (var8 - -var9 >= var7) {
                  break L10;
                } else {
                  var7 = var8 - -var9;
                  break L10;
                }
              }
              L11: {
                if (~(var8 - var9) < ~var7) {
                  var7 = var8 + -var9;
                  break L11;
                } else {
                  break L11;
                }
              }
              var6_ref.d(ki.field_d * var7 / 256);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var5;
            stackOut_86_1 = new StringBuilder().append("bm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_89_0 = stackOut_86_0;
            stackIn_89_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param4 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L12;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_90_0 = stackOut_87_0;
              stackIn_90_1 = stackOut_87_1;
              stackIn_90_2 = stackOut_87_2;
              break L12;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_90_0, stackIn_90_2 + ')');
        }
    }

    final static void a(mf param0, mf param1, int param2, mf param3, wp param4, mf param5, mf param6) {
        RuntimeException var7 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ln.a(param6, param4, param0, param5, param1, param2 ^ -24870, param3);
                fd.field_d[1] = (ki) (Object) new fi(1, "BaB_arctic", "BaB_block_arctic", 6);
                fd.field_d[2] = (ki) (Object) new oo(2, "BaB_chocolate", "BaB_block_chocolate", 8);
                fd.field_d[3] = (ki) (Object) new sn(3, "BaB_construction", "BaB_block_construction", 8);
                fd.field_d[4] = (ki) (Object) new gi(4, "BaB_desert", "BaB_block_desert", 4);
                fd.field_d[6] = (ki) (Object) new ip(6, "BaB_jungle", "BaB_block_jungle", 4);
                fd.field_d[7] = (ki) (Object) new ai(7, "BaB_city_paris", "BaB_block_city", 5);
                fd.field_d[8] = (ki) (Object) new ci(8, "BaB_space", "BaB_block_space", 8);
                fd.field_d[9] = (ki) (Object) new td(9, "BaB_volcano", "BaB_block_volcano", 6);
                fd.field_d[10] = (ki) (Object) new jk(10, "BaB_underthesea", "BaB_block_underwater", 5);
                if (lc.a(0, param2 ^ -24881)) {
                  break L2;
                } else {
                  fd.field_d[5] = (ki) (Object) new qb(5, "BaB_farmyard", "BaB_block_farmyard", 7);
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              fd.field_d[5] = (ki) (Object) new dp(5, "BaB_halloween", "BaB_block_halloween", 8);
              break L1;
            }
            L3: {
              if (param2 == 24876) {
                break L3;
              } else {
                bm.a((byte) 96);
                break L3;
              }
            }
            fd.field_d[11] = (ki) (Object) new qa(11, "BAB_ninja", "BaB_block_ninja", 7);
            sk.field_H = 11;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("bm.B(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
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
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_e = null;
            field_d = null;
            field_b = null;
            field_f = null;
            int var1_int = -21 / ((param0 - -44) / 60);
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bm.F(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Set up new game";
        field_f = new int[]{29, 31, 30, 8};
        field_e = "<%0> cannot join; the game has started.";
        field_c = 200;
    }
}
