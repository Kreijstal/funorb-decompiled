/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_a;
    static bi[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 36 / ((-14 - param0) / 59);
    }

    final static bi a(boolean param0, ln param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        bi stackIn_6_0 = null;
        bi stackIn_22_0 = null;
        bi stackIn_24_0 = null;
        bi stackIn_26_0 = null;
        bi stackIn_28_0 = null;
        bi stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_5_0 = null;
        bi stackOut_21_0 = null;
        bi stackOut_23_0 = null;
        bi stackOut_25_0 = null;
        bi stackOut_27_0 = null;
        bi stackOut_29_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = (bi[]) null;
                break L1;
              }
            }
            if (param1.field_I.equalsIgnoreCase("Sol")) {
              stackOut_5_0 = qe.field_j;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = param1.field_B;
              if (var2_int == 0) {
                stackOut_21_0 = bj.field_H;
                stackIn_22_0 = stackOut_21_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (1 == var2_int) {
                  stackOut_23_0 = tk.field_x;
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2_int ^ -1) == -3) {
                    stackOut_25_0 = ta.field_a;
                    stackIn_26_0 = stackOut_25_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (3 != var2_int) {
                      if ((var2_int ^ -1) != -5) {
                        if (5 == var2_int) {
                          stackOut_27_0 = kr.field_d;
                          stackIn_28_0 = stackOut_27_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if ((var2_int ^ -1) != -7) {
                            if ((var2_int ^ -1) != -8) {
                              if ((var2_int ^ -1) == -9) {
                                stackOut_29_0 = cp.field_t;
                                stackIn_30_0 = stackOut_29_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                throw new RuntimeException("No image for this type of system: " + param1.field_B);
                              }
                            } else {
                              return ti.field_h;
                            }
                          } else {
                            return rk.field_k;
                          }
                        }
                      } else {
                        return rl.field_c;
                      }
                    } else {
                      return be.field_k;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("uk.A(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0;
                } else {
                  return stackIn_30_0;
                }
              }
            }
          }
        }
    }

    final static l a(int param0, dc param1, ob param2, pf param3, fs[] param4, fs param5, byte param6, vr param7) throws jn, kr {
        bi discarded$1 = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15_int = 0;
        l var15 = null;
        ln[] var16_ref_ln__ = null;
        int var16 = 0;
        int var17_int = 0;
        sd[] var17 = null;
        int var18 = 0;
        ln var18_ref_ln = null;
        lo[] var19 = null;
        fs var19_ref = null;
        int var20 = 0;
        ln var20_ref_ln = null;
        int var21 = 0;
        fs var21_ref_fs = null;
        sd var21_ref_sd = null;
        ln var21_ref_ln = null;
        ln var22_ref_ln = null;
        int var22 = 0;
        int var23 = 0;
        ln var23_ref_ln = null;
        int var24 = 0;
        fs var25 = null;
        cs var25_ref = null;
        int var26 = 0;
        ln var27 = null;
        fs var28 = null;
        ln var29 = null;
        fs var30 = null;
        ln var31 = null;
        lo[] var32 = null;
        ln var33 = null;
        ln var34 = null;
        ln var35 = null;
        fs[] var36 = null;
        fs var37 = null;
        l stackIn_81_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_80_0 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = param2.a(16711680);
              var9 = param2.f(param6 + -20969);
              var10 = param2.f(param6 + -20969);
              var11 = param2.f(-20976);
              var12 = hl.a(-33, var9);
              var13 = sa.a(var10, -109);
              if (param6 == -7) {
                break L1;
              } else {
                var27 = (ln) null;
                discarded$1 = uk.a(false, (ln) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var15_int = param0;
                if (-1 != (var15_int ^ -1)) {
                  if (-3 != (var15_int ^ -1)) {
                    if (-2 == (var15_int ^ -1)) {
                      var14 = new sh(param2, var8_int);
                      break L2;
                    } else {
                      if (3 != var15_int) {
                        throw new RuntimeException("No Received MapGenerator for gametype " + param0);
                      } else {
                        var14 = new mr(param2, var8_int, var12, var13, var11, param4.length);
                        break L2;
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var14 = new rd(param2, var8_int, var12, var13, var11);
              break L2;
            }
            var15 = ((fo) (var14)).a((byte) -115);
            var16_ref_ln__ = var15.field_e;
            var17_int = 0;
            L4: while (true) {
              if (var16_ref_ln__.length <= var17_int) {
                var16 = param2.j(-71);
                var17 = new sd[var16];
                var18 = 0;
                L5: while (true) {
                  if (var16 <= var18) {
                    var18 = param2.j(param6 ^ 71);
                    var32 = new lo[var18];
                    var19 = var32;
                    var20 = 0;
                    L6: while (true) {
                      if (var18 <= var20) {
                        var15.b((byte) 80);
                        var20 = 0;
                        L7: while (true) {
                          if (var20 >= param4.length) {
                            var20 = 0;
                            L8: while (true) {
                              if (var20 >= param4.length) {
                                var20 = 0;
                                L9: while (true) {
                                  if (var20 >= param4.length) {
                                    L10: {
                                      if (param5 != null) {
                                        param5.field_w = param2.j(param6 ^ 98);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var20 = 0;
                                    L11: while (true) {
                                      if (param4.length <= var20) {
                                        param3.a(0);
                                        var20 = param2.j(-115);
                                        var21 = 0;
                                        L12: while (true) {
                                          if (var20 <= var21) {
                                            param1.field_x.a(param2, (byte) -109);
                                            var21 = param2.j(param6 + -63);
                                            var22 = param2.j(param6 + -55);
                                            param1.a(var22, var21, false);
                                            var36 = param4;
                                            var24 = 0;
                                            L13: while (true) {
                                              if (var24 >= var36.length) {
                                                stackOut_80_0 = (l) (var15);
                                                stackIn_81_0 = stackOut_80_0;
                                                break L0;
                                              } else {
                                                L14: {
                                                  var37 = var36[var24];
                                                  var25 = var37;
                                                  if (var37.field_m == null) {
                                                    var25.field_m = new lo(var37, (ln) null);
                                                    break L14;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                                var24++;
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            L15: {
                                              var34 = gq.a(var15.field_e, -2284, param2);
                                              var35 = gq.a(var15.field_e, -2284, param2);
                                              if (var34 == null) {
                                                break L15;
                                              } else {
                                                if (var35 != null) {
                                                  var24 = param2.j(-73);
                                                  var25_ref = new cs(var34, var35, var24);
                                                  param3.a((byte) -113, var25_ref);
                                                  var21++;
                                                  continue L12;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            throw new kr("Tannhauser Gate is unconnected at at least one end.");
                                          }
                                        }
                                      } else {
                                        var21 = 0;
                                        L16: while (true) {
                                          if ((var21 ^ -1) <= -5) {
                                            var20++;
                                            continue L11;
                                          } else {
                                            param4[var20].field_u[var21] = param2.j(-115);
                                            var21++;
                                            continue L16;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var21 = 1 + var20;
                                    L17: while (true) {
                                      if (param4.length <= var21) {
                                        var20++;
                                        continue L9;
                                      } else {
                                        L18: {
                                          var22 = param2.g(-2852);
                                          if (127 == var22) {
                                            break L18;
                                          } else {
                                            param4[var20].field_h[var21] = true;
                                            param4[var21].field_h[var20] = true;
                                            param4[var20].field_f[var21] = var22;
                                            param4[var21].field_f[var20] = var22;
                                            break L18;
                                          }
                                        }
                                        var21++;
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var21 = 0;
                                L19: while (true) {
                                  if (param4.length <= var21) {
                                    var20++;
                                    continue L8;
                                  } else {
                                    param4[var20].field_h[var21] = false;
                                    var21++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          } else {
                            L20: {
                              if (param7.field_i) {
                                if (null != param4[var20].field_m) {
                                  vf.a(123, param4[var20].field_m);
                                  sh.a(param4[var20].field_m, -5);
                                  var21_ref_ln = param4[var20].field_m.j(18229);
                                  L21: while (true) {
                                    if (var21_ref_ln == null) {
                                      break L20;
                                    } else {
                                      kd.a(param7, false, var21_ref_ln, (byte) -2);
                                      var21_ref_ln = param4[var20].field_m.h(-23410);
                                      continue L21;
                                    }
                                  }
                                } else {
                                  break L20;
                                }
                              } else {
                                var21_ref_sd = (sd) ((Object) param4[var20].field_i.d(0));
                                L22: while (true) {
                                  if (var21_ref_sd == null) {
                                    break L20;
                                  } else {
                                    vf.a(127, var21_ref_sd);
                                    sh.a(var21_ref_sd, -5);
                                    var22_ref_ln = var21_ref_sd.j(18229);
                                    L23: while (true) {
                                      if (var22_ref_ln == null) {
                                        var21_ref_sd = (sd) ((Object) param4[var20].field_i.a((byte) -71));
                                        continue L22;
                                      } else {
                                        kd.a(param7, false, var22_ref_ln, (byte) -2);
                                        var22_ref_ln = var21_ref_sd.h(param6 ^ 23415);
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var20++;
                            continue L7;
                          }
                        }
                      } else {
                        var30 = param4[param2.j(-69)];
                        var21_ref_fs = var30;
                        var31 = var15.field_e[param2.j(-64)];
                        var19[var20] = new lo(var30, var31);
                        var21_ref_fs.field_m = var32[var20];
                        var32[var20].a(-21771, var31);
                        var23 = param2.j(-61) + -1;
                        var24 = 0;
                        L24: while (true) {
                          if (var23 <= var24) {
                            var20++;
                            continue L6;
                          } else {
                            var33 = var15.field_e[param2.j(-60)];
                            var32[var20].a(-21771, var33);
                            var24++;
                            continue L24;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = param4[param2.j(-123)];
                    var19_ref = var28;
                    var20_ref_ln = var15.field_e[param2.j(-123)];
                    var17[var18] = new sd(var28, var20_ref_ln);
                    var28.field_i.a((byte) -113, var17[var18]);
                    var17[var18].a(param6 ^ 21772, var20_ref_ln);
                    var20_ref_ln.field_R = var17[var18];
                    var20_ref_ln.field_y = var19_ref;
                    var21 = -1 + param2.j(-89);
                    var22 = 0;
                    L25: while (true) {
                      if (var22 >= var21) {
                        var18++;
                        continue L5;
                      } else {
                        var29 = var15.field_e[param2.j(-90)];
                        var23_ref_ln = var29;
                        var17[var18].a(-21771, var29);
                        var23_ref_ln.field_R = var17[var18];
                        var23_ref_ln.field_y = var19_ref;
                        var22++;
                        continue L25;
                      }
                    }
                  }
                }
              } else {
                var18_ref_ln = var16_ref_ln__[var17_int];
                var22_ref_ln = var18_ref_ln;
                var22_ref_ln = var18_ref_ln;
                var18_ref_ln.field_t = us.a(param2, param4, 2);
                var17_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) (var8);
            stackOut_82_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L26;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L26;
            }
          }
          L27: {
            stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param2 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L27;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L27;
            }
          }
          L28: {
            stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param3 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L28;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L28;
            }
          }
          L29: {
            stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
            stackOut_91_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',');
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param4 == null) {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L29;
            } else {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L29;
            }
          }
          L30: {
            stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param5 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L30;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L30;
            }
          }
          L31: {
            stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param6).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param7 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L31;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L31;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ')');
        }
        return stackIn_81_0;
    }

    static {
    }
}
