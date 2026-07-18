/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_a;
    static bi[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -36;
    }

    final static bi a(boolean param0, ln param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        bi stackIn_4_0 = null;
        bi stackIn_20_0 = null;
        bi stackIn_22_0 = null;
        bi stackIn_24_0 = null;
        bi stackIn_26_0 = null;
        bi stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_3_0 = null;
        bi stackOut_19_0 = null;
        bi stackOut_21_0 = null;
        bi stackOut_23_0 = null;
        bi stackOut_25_0 = null;
        bi stackOut_27_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1.field_I.equalsIgnoreCase("Sol")) {
            stackOut_3_0 = qe.field_j;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var2_int = param1.field_B;
            if (var2_int == 0) {
              stackOut_19_0 = bj.field_H;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            } else {
              if (1 == var2_int) {
                stackOut_21_0 = tk.field_x;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0;
              } else {
                if (var2_int == 2) {
                  stackOut_23_0 = ta.field_a;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                } else {
                  if (3 != var2_int) {
                    if (var2_int != 4) {
                      if (5 == var2_int) {
                        stackOut_25_0 = kr.field_d;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        if (var2_int != 6) {
                          if (var2_int != 7) {
                            if (var2_int == 8) {
                              stackOut_27_0 = cp.field_t;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("uk.A(").append(false).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L0;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L0;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static l a(int param0, dc param1, ob param2, pf param3, fs[] param4, fs param5, byte param6, vr param7) throws jn, kr {
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
        ln var21_ref_ln = null;
        ln var22_ref_ln = null;
        int var22 = 0;
        int var23 = 0;
        ln var23_ref_ln = null;
        int var24 = 0;
        fs var25 = null;
        cs var25_ref = null;
        int var26 = 0;
        Object var27 = null;
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
        sd var38 = null;
        l stackIn_79_0 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_78_0 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var27 = null;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var8_int = param2.a(16711680);
                var9 = param2.f(-20976);
                var10 = param2.f(-20976);
                var11 = param2.f(-20976);
                var12 = hl.a(-33, var9);
                var13 = sa.a(var10, -109);
                var15_int = param0;
                if (var15_int != 0) {
                  if (var15_int != 2) {
                    if (var15_int == 1) {
                      var14 = (Object) (Object) new sh(param2, var8_int);
                      break L1;
                    } else {
                      if (3 != var15_int) {
                        throw new RuntimeException("No Received MapGenerator for gametype " + param0);
                      } else {
                        var14 = (Object) (Object) new mr(param2, var8_int, var12, var13, var11, param4.length);
                        break L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var14 = (Object) (Object) new rd(param2, var8_int, var12, var13, var11);
              break L1;
            }
            var15 = ((fo) var14).a((byte) -115);
            var16_ref_ln__ = var15.field_e;
            var17_int = 0;
            L3: while (true) {
              if (var16_ref_ln__.length <= var17_int) {
                var16 = param2.j(-71);
                var17 = new sd[var16];
                var18 = 0;
                L4: while (true) {
                  if (var16 <= var18) {
                    var18 = param2.j(-66);
                    var32 = new lo[var18];
                    var19 = var32;
                    var20 = 0;
                    L5: while (true) {
                      if (var18 <= var20) {
                        var15.b((byte) 80);
                        var20 = 0;
                        L6: while (true) {
                          if (var20 >= param4.length) {
                            var20 = 0;
                            L7: while (true) {
                              if (~var20 <= ~param4.length) {
                                var20 = 0;
                                L8: while (true) {
                                  if (~var20 <= ~param4.length) {
                                    L9: {
                                      if (param5 != null) {
                                        param5.field_w = param2.j(-101);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var20 = 0;
                                    L10: while (true) {
                                      if (param4.length <= var20) {
                                        param3.a(0);
                                        var20 = param2.j(-115);
                                        var21 = 0;
                                        L11: while (true) {
                                          if (~var20 >= ~var21) {
                                            param1.field_x.a(param2, (byte) -109);
                                            var21 = param2.j(-70);
                                            var22 = param2.j(-62);
                                            param1.a(var22, var21, false);
                                            var36 = param4;
                                            var24 = 0;
                                            L12: while (true) {
                                              if (~var24 <= ~var36.length) {
                                                stackOut_78_0 = (l) var15;
                                                stackIn_79_0 = stackOut_78_0;
                                                break L0;
                                              } else {
                                                L13: {
                                                  var37 = var36[var24];
                                                  var25 = var37;
                                                  if (var37.field_m == null) {
                                                    var25.field_m = new lo(var37, (ln) null);
                                                    break L13;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                                var24++;
                                                continue L12;
                                              }
                                            }
                                          } else {
                                            L14: {
                                              var34 = gq.a(var15.field_e, -2284, param2);
                                              var35 = gq.a(var15.field_e, -2284, param2);
                                              if (var34 == null) {
                                                break L14;
                                              } else {
                                                if (var35 != null) {
                                                  var24 = param2.j(-73);
                                                  var25_ref = new cs(var34, var35, var24);
                                                  param3.a((byte) -113, (oh) (Object) var25_ref);
                                                  var21++;
                                                  continue L11;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            throw new kr("Tannhauser Gate is unconnected at at least one end.");
                                          }
                                        }
                                      } else {
                                        var21 = 0;
                                        L15: while (true) {
                                          if (var21 >= 4) {
                                            var20++;
                                            continue L10;
                                          } else {
                                            param4[var20].field_u[var21] = param2.j(-115);
                                            var21++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var21 = 1 + var20;
                                    L16: while (true) {
                                      if (param4.length <= var21) {
                                        var20++;
                                        continue L8;
                                      } else {
                                        L17: {
                                          var22 = param2.g(-2852);
                                          if (127 == var22) {
                                            break L17;
                                          } else {
                                            param4[var20].field_h[var21] = true;
                                            param4[var21].field_h[var20] = true;
                                            param4[var20].field_f[var21] = var22;
                                            param4[var21].field_f[var20] = var22;
                                            break L17;
                                          }
                                        }
                                        var21++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var21 = 0;
                                L18: while (true) {
                                  if (param4.length <= var21) {
                                    var20++;
                                    continue L7;
                                  } else {
                                    param4[var20].field_h[var21] = false;
                                    var21++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          } else {
                            L19: {
                              if (param7.field_i) {
                                if (null != param4[var20].field_m) {
                                  vf.a(123, (sd) (Object) param4[var20].field_m);
                                  sh.a((sd) (Object) param4[var20].field_m, -5);
                                  var21_ref_ln = param4[var20].field_m.j(18229);
                                  L20: while (true) {
                                    if (var21_ref_ln == null) {
                                      break L19;
                                    } else {
                                      kd.a(param7, false, var21_ref_ln, (byte) -2);
                                      var21_ref_ln = param4[var20].field_m.h(-23410);
                                      continue L20;
                                    }
                                  }
                                } else {
                                  break L19;
                                }
                              } else {
                                var38 = (sd) (Object) param4[var20].field_i.d(0);
                                L21: while (true) {
                                  if (var38 == null) {
                                    break L19;
                                  } else {
                                    vf.a(127, var38);
                                    sh.a(var38, -5);
                                    var22_ref_ln = var38.j(18229);
                                    L22: while (true) {
                                      if (var22_ref_ln == null) {
                                        var38 = (sd) (Object) param4[var20].field_i.a((byte) -71);
                                        continue L21;
                                      } else {
                                        kd.a(param7, false, var22_ref_ln, (byte) -2);
                                        var22_ref_ln = var38.h(-23410);
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var20++;
                            continue L6;
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
                        L23: while (true) {
                          if (var23 <= var24) {
                            var20++;
                            continue L5;
                          } else {
                            var33 = var15.field_e[param2.j(-60)];
                            var32[var20].a(-21771, var33);
                            var24++;
                            continue L23;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = param4[param2.j(-123)];
                    var19_ref = var28;
                    var20_ref_ln = var15.field_e[param2.j(-123)];
                    var17[var18] = new sd(var28, var20_ref_ln);
                    var28.field_i.a((byte) -113, (oh) (Object) var17[var18]);
                    var17[var18].a(-21771, var20_ref_ln);
                    var20_ref_ln.field_R = var17[var18];
                    var20_ref_ln.field_y = var19_ref;
                    var21 = -1 + param2.j(-89);
                    var22 = 0;
                    L24: while (true) {
                      if (var22 >= var21) {
                        var18++;
                        continue L4;
                      } else {
                        var29 = var15.field_e[param2.j(-90)];
                        var23_ref_ln = var29;
                        var17[var18].a(-21771, var29);
                        var23_ref_ln.field_R = var17[var18];
                        var23_ref_ln.field_y = var19_ref;
                        var22++;
                        continue L24;
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
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var8 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var8;
            stackOut_80_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param1 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L25;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L25;
            }
          }
          L26: {
            stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param2 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L26;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L26;
            }
          }
          L27: {
            stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
            stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param3 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L27;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L27;
            }
          }
          L28: {
            stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param4 == null) {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L28;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L28;
            }
          }
          L29: {
            stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
            stackOut_92_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',');
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param5 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L29;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L29;
            }
          }
          L30: {
            stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
            stackOut_95_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_95_2).append(',').append(-7).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param7 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L30;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L30;
            }
          }
          throw r.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + ')');
        }
        return stackIn_79_0;
    }

    static {
    }
}
