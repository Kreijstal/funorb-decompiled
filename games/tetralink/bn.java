/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn extends IOException {
    static String field_a;
    static ve field_b;
    static r field_c;

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        tc var4_ref_tc = null;
        int var4 = 0;
        int var5_int = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_34_0 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_56_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (li.field_a != qi.field_p) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var2_long = k.a(0);
              L1: {
                if (i.field_f == 0) {
                  break L1;
                } else {
                  if (ti.field_e < 0) {
                    var4_ref_tc = (tc) (Object) v.field_z.c(false);
                    if (null == var4_ref_tc) {
                      break L1;
                    } else {
                      if (var4_ref_tc.field_r >= var2_long) {
                        break L1;
                      } else {
                        var4_ref_tc.b(false);
                        rl.field_d = var4_ref_tc.field_o.length;
                        kb.field_q.field_t = 0;
                        var5_int = 0;
                        L2: while (true) {
                          L3: {
                            L4: {
                              if (rl.field_d <= var5_int) {
                                break L4;
                              } else {
                                kb.field_q.field_u[var5_int] = var4_ref_tc.field_o[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  if (var7 == 0) {
                                    continue L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            mh.field_g = lk.field_sb;
                            lk.field_sb = md.field_A;
                            md.field_A = ua.field_c;
                            ua.field_c = var4_ref_tc.field_u;
                            break L3;
                          }
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (ti.field_e >= 0) {
                      break L7;
                    } else {
                      kb.field_q.field_t = 0;
                      stackOut_29_0 = en.b(97, 1);
                      stackIn_38_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (var7 != 0) {
                        break L6;
                      } else {
                        if (!stackIn_30_0) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0 != 0;
                        } else {
                          ti.field_e = kb.field_q.d(false);
                          kb.field_q.field_t = 0;
                          rl.field_d = param1[ti.field_e];
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_37_0 = ua.b(-73);
                  stackIn_38_0 = stackOut_37_0;
                  break L6;
                }
                if (!stackIn_38_0) {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  return stackIn_41_0 != 0;
                } else {
                  L8: {
                    if (i.field_f == 0) {
                      break L8;
                    } else {
                      L9: {
                        var4 = i.field_f;
                        if (0.0 == jg.field_f) {
                          break L9;
                        } else {
                          var4 = (int)((double)var4 + ca.field_i.nextGaussian() * jg.field_f);
                          if (var4 < 0) {
                            var4 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var5 = new tc(var2_long + (long)var4, ti.field_e, new byte[rl.field_d]);
                      var6 = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (~var6 <= ~rl.field_d) {
                              break L12;
                            } else {
                              var5.field_o[var6] = kb.field_q.field_u[var6];
                              var6++;
                              if (var7 != 0) {
                                break L11;
                              } else {
                                if (var7 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          v.field_z.a((mc) (Object) var5, false);
                          ti.field_e = -1;
                          break L11;
                        }
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  mh.field_g = lk.field_sb;
                  lk.field_sb = md.field_A;
                  md.field_A = ua.field_c;
                  ua.field_c = ti.field_e;
                  ti.field_e = -1;
                  stackOut_56_0 = 1;
                  stackIn_57_0 = stackOut_56_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var2;
            stackOut_58_1 = new StringBuilder().append("bn.B(").append(-19161).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L13;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L13;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ')');
        }
        return stackIn_57_0 != 0;
    }

    bn(String param0) {
        super(param0);
    }

    final static boolean a() {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            stackOut_3_0 = mb.field_u.a(9);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "bn.E(" + 21747 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param1 >= 0) {
              if (1582 <= param1) {
                if (param1 % 4 == 0) {
                  if (param1 % 100 == 0) {
                    if (param1 % 400 == 0) {
                      L1: {
                        if (param0 == 1) {
                          break L1;
                        } else {
                          field_b = null;
                          break L1;
                        }
                      }
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                }
              } else {
                L2: {
                  if (param1 % 4 != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_15_0 = stackOut_12_0;
                    break L2;
                  }
                }
                return stackIn_15_0 != 0;
              }
            } else {
              L3: {
                if ((param1 + 1) % 4 != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L3;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "bn.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0 != 0;
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "bn.A(" + -26623 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int[] param5, kc param6, int param7, int[] param8, int param9, int param10, int[] param11, int[] param12, int param13, int param14, int[] param15, int[] param16, int[] param17, int[] param18, int[] param19, int[] param20, int param21, byte[] param22, int[] param23) {
        int var24_int = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        L0: {
          L1: {
            var65 = TetraLink.field_J;
            if (a.field_b == null) {
              break L1;
            } else {
              if (~param21 < ~a.field_b.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var24_int = 100 + param21;
          uj.field_q = new int[var24_int];
          a.field_b = new int[var24_int];
          break L0;
        }
        L2: {
          L3: {
            if (rl.field_c == null) {
              break L3;
            } else {
              if (~rl.field_c.length <= ~(param7 * 2)) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var24_int = 2 * param7 + 100;
          rl.field_c = new int[var24_int];
          gm.field_b = new int[var24_int];
          break L2;
        }
        L4: {
          var24 = a.field_b;
          if (lm.field_f != null) {
            break L4;
          } else {
            lm.field_f = new int[16];
            break L4;
          }
        }
        L5: {
          L6: {
            var25 = uj.field_q;
            var26 = lm.field_f;
            var27 = rl.field_c;
            mf.field_u = 0;
            var28 = gm.field_b;
            k.field_e = 0;
            fh.field_g = 0;
            le.field_Xb = 0;
            if (null == ic.field_c) {
              break L6;
            } else {
              if (~ic.field_c.length > ~param21) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          ic.field_c = new int[param21 - -100];
          bd.field_a = new int[100 + param21];
          nn.field_S = new int[100 + param21];
          break L5;
        }
        L7: {
          L8: {
            if (null == ja.field_l) {
              break L8;
            } else {
              if (ja.field_l.length >= param7) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          ja.field_l = new int[100 + param7];
          db.field_f = new int[param7 + 100];
          wk.field_b = new int[param7 + 100];
          break L7;
        }
        L9: {
          if (null == param18) {
            break L9;
          } else {
            L10: {
              if (mc.field_m == null) {
                break L10;
              } else {
                if (mc.field_m.length >= param7) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            rk.field_b = new int[100 + param7];
            mc.field_m = new int[param7 + 100];
            tc.field_w = new int[100 + param7];
            break L9;
          }
        }
        L11: {
          L12: {
            if (null == am.field_b) {
              break L12;
            } else {
              if (~param21 >= ~am.field_b.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          cm.field_q = new int[100 + param21];
          am.field_b = new int[100 + param21];
          gd.field_Zb = new int[param21 - -100];
          break L11;
        }
        L13: {
          L14: {
            if (null == ve.field_a) {
              break L14;
            } else {
              if (ve.field_a.length < param7) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          kj.field_d = new int[100 + param7];
          ve.field_a = new int[100 + param7];
          hd.field_D = new int[100 + param7];
          break L13;
        }
        L15: {
          if (null == param18) {
            break L15;
          } else {
            L16: {
              if (ga.field_b == null) {
                break L16;
              } else {
                if (param7 > ga.field_b.length) {
                  break L16;
                } else {
                  break L15;
                }
              }
            }
            ga.field_b = new int[param7 - -100];
            fj.field_p = new int[param7 - -100];
            om.field_Yb = new int[param7 + 100];
            break L15;
          }
        }
        var29 = 0;
        var30 = 0;
        var31 = 0;
        var33 = 0;
        L17: while (true) {
          L18: {
            if (~param21 >= ~var33) {
              break L18;
            } else {
              var24[var33] = -1;
              var33++;
              if (var65 == 0) {
                continue L17;
              } else {
                break L18;
              }
            }
          }
          var32 = 0;
          var33 = 0;
          L19: while (true) {
            L20: {
              if (param21 <= var33) {
                break L20;
              } else {
                var25[var33] = -1;
                var33++;
                if (var65 == 0) {
                  continue L19;
                } else {
                  break L20;
                }
              }
            }
            var35 = 0;
            var36 = 0;
            var37 = 0;
            var38 = 0;
            L21: while (true) {
              L22: {
                L23: {
                  if (~var38 <= ~param7) {
                    break L23;
                  } else {
                    var39 = param2[var38];
                    var40 = param23[var38];
                    var41 = param20[var38];
                    var42 = param12[var39];
                    var43 = param5[var39];
                    var44 = param11[var39];
                    var45 = param12[var40];
                    var46 = param5[var40];
                    var47 = param11[var40];
                    var48 = param12[var41];
                    var49 = param5[var41];
                    var50 = param11[var41];
                    var51 = param3 * (-param14 + var44) + param4 * (-param1 + var42) - -((-param0 + var43) * param9);
                    var52 = param9 * (var46 + -param0) + ((-param1 + var45) * param4 + param3 * (var47 + -param14));
                    var53 = param4 * (-param1 + var48) - -(param9 * (var49 + -param0)) + param3 * (-param14 + var50);
                    stackOut_51_0 = ~(var53 | (var52 | var51));
                    stackOut_51_1 = -1;
                    stackIn_189_0 = stackOut_51_0;
                    stackIn_189_1 = stackOut_51_1;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    if (var65 != 0) {
                      break L22;
                    } else {
                      L24: {
                        L25: {
                          if (stackIn_52_0 <= stackIn_52_1) {
                            break L25;
                          } else {
                            L26: {
                              if ((-var53 | (-var52 | -var51)) >= 0) {
                                break L26;
                              } else {
                                L27: {
                                  if (~ic.field_c.length <= ~(4 + (param21 - -var29))) {
                                    break L27;
                                  } else {
                                    var54 = new int[param21 + var29 + 104];
                                    rd.a(ic.field_c, 0, var54, 0, k.field_e);
                                    ic.field_c = var54;
                                    var54 = new int[var29 + (param21 + 104)];
                                    rd.a(nn.field_S, 0, var54, 0, k.field_e);
                                    nn.field_S = var54;
                                    var54 = new int[104 + param21 - -var29];
                                    rd.a(bd.field_a, 0, var54, 0, k.field_e);
                                    bd.field_a = var54;
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (~am.field_b.length <= ~(var31 + (param21 + 4))) {
                                    break L28;
                                  } else {
                                    var54 = new int[104 + param21 - -var31];
                                    rd.a(am.field_b, 0, var54, 0, mf.field_u);
                                    am.field_b = var54;
                                    var54 = new int[104 + param21 + var31];
                                    rd.a(gd.field_Zb, 0, var54, 0, mf.field_u);
                                    gd.field_Zb = var54;
                                    var54 = new int[104 + (var31 + param21)];
                                    rd.a(cm.field_q, 0, var54, 0, mf.field_u);
                                    cm.field_q = var54;
                                    break L28;
                                  }
                                }
                                L29: {
                                  L30: {
                                    var55 = k.field_e;
                                    var56 = mf.field_u;
                                    var57 = 0;
                                    var58 = 0;
                                    if (param22 != null) {
                                      break L30;
                                    } else {
                                      L31: {
                                        if (null != param17) {
                                          break L31;
                                        } else {
                                          var64 = 1;
                                          if (var65 == 0) {
                                            break L29;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L32: {
                                        L33: {
                                          if (param17[var38] == -1) {
                                            break L33;
                                          } else {
                                            if (param17[var38] == -2) {
                                              break L33;
                                            } else {
                                              stackOut_69_0 = 1;
                                              stackIn_71_0 = stackOut_69_0;
                                              break L32;
                                            }
                                          }
                                        }
                                        stackOut_70_0 = 0;
                                        stackIn_71_0 = stackOut_70_0;
                                        break L32;
                                      }
                                      var64 = stackIn_71_0;
                                      if (var65 == 0) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L34: {
                                    if ((1 & param22[var38]) != 0) {
                                      stackOut_75_0 = 0;
                                      stackIn_76_0 = stackOut_75_0;
                                      break L34;
                                    } else {
                                      stackOut_74_0 = 1;
                                      stackIn_76_0 = stackOut_74_0;
                                      break L34;
                                    }
                                  }
                                  var64 = stackIn_76_0;
                                  break L29;
                                }
                                L35: {
                                  if (param18 == null) {
                                    break L35;
                                  } else {
                                    L36: {
                                      if (var64 == 0) {
                                        break L36;
                                      } else {
                                        var36 = 65535 & param8[var38];
                                        var37 = 65535 & param17[var38];
                                        var35 = param18[var38] & 65535;
                                        if (var65 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    var37 = param17[var38];
                                    var36 = param8[var38];
                                    var35 = param18[var38];
                                    break L35;
                                  }
                                }
                                L37: {
                                  if (0 <= var51) {
                                    L38: {
                                      var34 = var24[var39];
                                      if (var34 >= 0) {
                                        break L38;
                                      } else {
                                        int incrementValue$45 = var55;
                                        var55++;
                                        var34 = incrementValue$45;
                                        var24[var39] = incrementValue$45;
                                        ic.field_c[var34] = var42;
                                        nn.field_S[var34] = var43;
                                        bd.field_a[var34] = var44;
                                        break L38;
                                      }
                                    }
                                    var26[var57] = var34;
                                    var26[8 - -var57] = var35;
                                    var57++;
                                    break L37;
                                  } else {
                                    break L37;
                                  }
                                }
                                L39: {
                                  if (0 < var51) {
                                    break L39;
                                  } else {
                                    L40: {
                                      var34 = var25[var39];
                                      if (var34 < 0) {
                                        int incrementValue$46 = var56;
                                        var56++;
                                        var34 = incrementValue$46;
                                        var25[var39] = incrementValue$46;
                                        am.field_b[var34] = var42;
                                        gd.field_Zb[var34] = var43;
                                        cm.field_q[var34] = var44;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    var26[4 - -var58] = var34;
                                    var26[var58 + 12] = var35;
                                    var58++;
                                    break L39;
                                  }
                                }
                                L41: {
                                  if (var51 == 0) {
                                    break L41;
                                  } else {
                                    if (var52 == 0) {
                                      break L41;
                                    } else {
                                      if ((var52 ^ var51) >= 0) {
                                        break L41;
                                      } else {
                                        var63 = -var51 + var52;
                                        var61 = (var44 * var52 + -(var51 * var47)) / var63;
                                        int incrementValue$47 = var55;
                                        var55++;
                                        var34 = incrementValue$47;
                                        var60 = (var52 * var43 + -(var51 * var46)) / var63;
                                        var59 = (-(var51 * var45) + var42 * var52) / var63;
                                        var62 = (var52 * var35 - var51 * var36) / var63;
                                        ic.field_c[var34] = var59;
                                        nn.field_S[var34] = var60;
                                        bd.field_a[var34] = var61;
                                        var26[var57] = var34;
                                        var26[var57 + 8] = var62;
                                        var57++;
                                        int incrementValue$48 = var56;
                                        var56++;
                                        var34 = incrementValue$48;
                                        am.field_b[var34] = var59;
                                        gd.field_Zb[var34] = var60;
                                        cm.field_q[var34] = var61;
                                        var26[var58 + 4] = var34;
                                        var26[12 + var58] = var62;
                                        var58++;
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                L42: {
                                  if (var52 < 0) {
                                    break L42;
                                  } else {
                                    L43: {
                                      var34 = var24[var40];
                                      if (var34 >= 0) {
                                        break L43;
                                      } else {
                                        int incrementValue$49 = var55;
                                        var55++;
                                        var34 = incrementValue$49;
                                        var24[var40] = incrementValue$49;
                                        ic.field_c[var34] = var45;
                                        nn.field_S[var34] = var46;
                                        bd.field_a[var34] = var47;
                                        break L43;
                                      }
                                    }
                                    var26[var57] = var34;
                                    var26[8 - -var57] = var36;
                                    var57++;
                                    break L42;
                                  }
                                }
                                L44: {
                                  if (var52 > 0) {
                                    break L44;
                                  } else {
                                    L45: {
                                      var34 = var25[var40];
                                      if (var34 >= 0) {
                                        break L45;
                                      } else {
                                        int incrementValue$50 = var56;
                                        var56++;
                                        var34 = incrementValue$50;
                                        var25[var40] = incrementValue$50;
                                        am.field_b[var34] = var45;
                                        gd.field_Zb[var34] = var46;
                                        cm.field_q[var34] = var47;
                                        break L45;
                                      }
                                    }
                                    var26[var58 + 4] = var34;
                                    var26[12 + var58] = var36;
                                    var58++;
                                    break L44;
                                  }
                                }
                                L46: {
                                  if (0 == var52) {
                                    break L46;
                                  } else {
                                    if (0 == var53) {
                                      break L46;
                                    } else {
                                      if ((var52 ^ var53) >= 0) {
                                        break L46;
                                      } else {
                                        var63 = -var52 + var53;
                                        var59 = (var45 * var53 - var48 * var52) / var63;
                                        var62 = (-(var52 * var37) + var53 * var36) / var63;
                                        var60 = (var46 * var53 + -(var52 * var49)) / var63;
                                        var61 = (-(var50 * var52) + var47 * var53) / var63;
                                        int incrementValue$51 = var55;
                                        var55++;
                                        var34 = incrementValue$51;
                                        ic.field_c[var34] = var59;
                                        nn.field_S[var34] = var60;
                                        bd.field_a[var34] = var61;
                                        var26[var57] = var34;
                                        var26[var57 + 8] = var62;
                                        var57++;
                                        int incrementValue$52 = var56;
                                        var56++;
                                        var34 = incrementValue$52;
                                        am.field_b[var34] = var59;
                                        gd.field_Zb[var34] = var60;
                                        cm.field_q[var34] = var61;
                                        var26[4 + var58] = var34;
                                        var26[12 - -var58] = var62;
                                        var58++;
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                L47: {
                                  if (var53 < 0) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var34 = var24[var41];
                                      if (var34 < 0) {
                                        int incrementValue$53 = var55;
                                        var55++;
                                        var34 = incrementValue$53;
                                        var24[var41] = incrementValue$53;
                                        ic.field_c[var34] = var48;
                                        nn.field_S[var34] = var49;
                                        bd.field_a[var34] = var50;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    var26[var57] = var34;
                                    var26[8 + var57] = var37;
                                    var57++;
                                    break L47;
                                  }
                                }
                                L49: {
                                  if (var53 > 0) {
                                    break L49;
                                  } else {
                                    L50: {
                                      var34 = var25[var41];
                                      if (0 > var34) {
                                        int incrementValue$54 = var56;
                                        var56++;
                                        var34 = incrementValue$54;
                                        var25[var41] = incrementValue$54;
                                        am.field_b[var34] = var48;
                                        gd.field_Zb[var34] = var49;
                                        cm.field_q[var34] = var50;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                    var26[var58 + 4] = var34;
                                    var26[var58 + 12] = var37;
                                    var58++;
                                    break L49;
                                  }
                                }
                                L51: {
                                  if (0 == (var51 | var53)) {
                                    break L51;
                                  } else {
                                    if ((var51 ^ var53) < 0) {
                                      var63 = -var53 + var51;
                                      var60 = (-(var53 * var43) + var51 * var49) / var63;
                                      int incrementValue$55 = var55;
                                      var55++;
                                      var34 = incrementValue$55;
                                      var61 = (-(var53 * var44) + var50 * var51) / var63;
                                      var62 = (-(var53 * var35) + var51 * var37) / var63;
                                      var59 = (-(var53 * var42) + var51 * var48) / var63;
                                      ic.field_c[var34] = var59;
                                      nn.field_S[var34] = var60;
                                      bd.field_a[var34] = var61;
                                      var26[var57] = var34;
                                      var26[8 - -var57] = var62;
                                      var57++;
                                      int incrementValue$56 = var56;
                                      var56++;
                                      var34 = incrementValue$56;
                                      am.field_b[var34] = var59;
                                      gd.field_Zb[var34] = var60;
                                      cm.field_q[var34] = var61;
                                      var26[var58 + 4] = var34;
                                      var26[12 + var58] = var62;
                                      var58++;
                                      break L51;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  var29 = var29 + (-k.field_e + var55);
                                  var33 = fh.field_g;
                                  k.field_e = var55;
                                  if (~ja.field_l.length <= ~(-2 + var57 + var30 + param7)) {
                                    break L52;
                                  } else {
                                    var54 = new int[param7 + var30 + (var57 + 98)];
                                    rd.a(ja.field_l, 0, var54, 0, var33);
                                    ja.field_l = var54;
                                    var54 = new int[var57 + (param7 - -var30) + 98];
                                    rd.a(db.field_f, 0, var54, 0, var33);
                                    db.field_f = var54;
                                    var54 = new int[98 + var57 + (var30 + param7)];
                                    rd.a(wk.field_b, 0, var54, 0, var33);
                                    wk.field_b = var54;
                                    if (null != param18) {
                                      var54 = new int[98 + (var30 + (param7 + var57))];
                                      rd.a(mc.field_m, 0, var54, 0, var33);
                                      mc.field_m = var54;
                                      var54 = new int[var30 + (param7 + var57 - -98)];
                                      rd.a(tc.field_w, 0, var54, 0, var33);
                                      tc.field_w = var54;
                                      var54 = new int[98 + var57 + (var30 + param7)];
                                      rd.a(rk.field_b, 0, var54, 0, var33);
                                      rk.field_b = var54;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L53: {
                                  ja.field_l[var33] = var26[0];
                                  db.field_f[var33] = var26[1];
                                  wk.field_b[var33] = var26[2];
                                  if (param18 != null) {
                                    L54: {
                                      if (var64 != 0) {
                                        break L54;
                                      } else {
                                        mc.field_m[var33] = var35;
                                        rk.field_b[var33] = var37;
                                        if (var65 == 0) {
                                          break L53;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    mc.field_m[var33] = var26[8];
                                    tc.field_w[var33] = var26[9];
                                    rk.field_b[var33] = var26[10];
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                                L55: {
                                  int incrementValue$57 = var33;
                                  var33++;
                                  var27[incrementValue$57] = var38;
                                  if (4 != var57) {
                                    break L55;
                                  } else {
                                    L56: {
                                      ja.field_l[var33] = var26[2];
                                      db.field_f[var33] = var26[3];
                                      wk.field_b[var33] = var26[0];
                                      if (param18 != null) {
                                        L57: {
                                          if (var64 == 0) {
                                            break L57;
                                          } else {
                                            mc.field_m[var33] = var26[10];
                                            tc.field_w[var33] = var26[11];
                                            rk.field_b[var33] = var26[8];
                                            if (var65 == 0) {
                                              break L56;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        mc.field_m[var33] = var35;
                                        rk.field_b[var33] = var37;
                                        break L56;
                                      } else {
                                        break L56;
                                      }
                                    }
                                    var30++;
                                    int incrementValue$58 = var33;
                                    var33++;
                                    var27[incrementValue$58] = var38;
                                    break L55;
                                  }
                                }
                                L58: {
                                  fh.field_g = var33;
                                  var31 = var31 + (-mf.field_u + var56);
                                  mf.field_u = var56;
                                  var33 = le.field_Xb;
                                  if (~(var58 + param7 - (-var32 - -2)) < ~ve.field_a.length) {
                                    var54 = new int[var58 + (var32 + (param7 + 98))];
                                    rd.a(ve.field_a, 0, var54, 0, var33);
                                    ve.field_a = var54;
                                    var54 = new int[98 + var58 + (param7 + var32)];
                                    rd.a(hd.field_D, 0, var54, 0, var33);
                                    hd.field_D = var54;
                                    var54 = new int[param7 - (-var32 + -var58) - -98];
                                    rd.a(kj.field_d, 0, var54, 0, var33);
                                    kj.field_d = var54;
                                    if (null == param18) {
                                      break L58;
                                    } else {
                                      var54 = new int[param7 + var32 + (var58 + 98)];
                                      rd.a(ga.field_b, 0, var54, 0, var33);
                                      ga.field_b = var54;
                                      var54 = new int[98 + var58 + (param7 + var32)];
                                      rd.a(fj.field_p, 0, var54, 0, var33);
                                      fj.field_p = var54;
                                      var54 = new int[98 + (param7 + var32) - -var58];
                                      rd.a(om.field_Yb, 0, var54, 0, var33);
                                      om.field_Yb = var54;
                                      break L58;
                                    }
                                  } else {
                                    break L58;
                                  }
                                }
                                L59: {
                                  ve.field_a[var33] = var26[4];
                                  hd.field_D[var33] = var26[5];
                                  kj.field_d[var33] = var26[6];
                                  if (null == param18) {
                                    break L59;
                                  } else {
                                    L60: {
                                      if (var64 == 0) {
                                        break L60;
                                      } else {
                                        ga.field_b[var33] = var26[12];
                                        fj.field_p[var33] = var26[13];
                                        om.field_Yb[var33] = var26[14];
                                        if (var65 == 0) {
                                          break L59;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    ga.field_b[var33] = var35;
                                    om.field_Yb[var33] = var37;
                                    break L59;
                                  }
                                }
                                L61: {
                                  int incrementValue$59 = var33;
                                  var33++;
                                  var28[incrementValue$59] = var38;
                                  if (var58 == 4) {
                                    L62: {
                                      ve.field_a[var33] = var26[6];
                                      hd.field_D[var33] = var26[7];
                                      kj.field_d[var33] = var26[4];
                                      if (param18 != null) {
                                        L63: {
                                          if (var64 != 0) {
                                            break L63;
                                          } else {
                                            ga.field_b[var33] = var35;
                                            om.field_Yb[var33] = var37;
                                            if (var65 == 0) {
                                              break L62;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                        ga.field_b[var33] = var26[14];
                                        fj.field_p[var33] = var26[15];
                                        om.field_Yb[var33] = var26[12];
                                        break L62;
                                      } else {
                                        break L62;
                                      }
                                    }
                                    int incrementValue$60 = var33;
                                    var33++;
                                    var28[incrementValue$60] = var38;
                                    var32++;
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                                le.field_Xb = var33;
                                if (var65 == 0) {
                                  break L24;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            L64: {
                              int fieldTemp$61 = le.field_Xb;
                              le.field_Xb = le.field_Xb + 1;
                              var33 = fieldTemp$61;
                              var34 = var25[var39];
                              if (var34 >= 0) {
                                break L64;
                              } else {
                                int fieldTemp$62 = mf.field_u;
                                mf.field_u = mf.field_u + 1;
                                var34 = fieldTemp$62;
                                var25[var39] = fieldTemp$62;
                                am.field_b[var34] = var42;
                                gd.field_Zb[var34] = var43;
                                cm.field_q[var34] = var44;
                                break L64;
                              }
                            }
                            L65: {
                              ve.field_a[var33] = var34;
                              var34 = var25[var40];
                              if (var34 < 0) {
                                int fieldTemp$63 = mf.field_u;
                                mf.field_u = mf.field_u + 1;
                                var34 = fieldTemp$63;
                                var25[var40] = fieldTemp$63;
                                am.field_b[var34] = var45;
                                gd.field_Zb[var34] = var46;
                                cm.field_q[var34] = var47;
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                            L66: {
                              hd.field_D[var33] = var34;
                              var34 = var25[var41];
                              if (var34 >= 0) {
                                break L66;
                              } else {
                                int fieldTemp$64 = mf.field_u;
                                mf.field_u = mf.field_u + 1;
                                var34 = fieldTemp$64;
                                var25[var41] = fieldTemp$64;
                                am.field_b[var34] = var48;
                                gd.field_Zb[var34] = var49;
                                cm.field_q[var34] = var50;
                                break L66;
                              }
                            }
                            L67: {
                              kj.field_d[var33] = var34;
                              if (param18 != null) {
                                ga.field_b[var33] = param18[var38];
                                fj.field_p[var33] = param8[var38];
                                om.field_Yb[var33] = param17[var38];
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                            var28[var33] = var38;
                            if (var65 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L68: {
                          int fieldTemp$65 = fh.field_g;
                          fh.field_g = fh.field_g + 1;
                          var33 = fieldTemp$65;
                          var34 = var24[var39];
                          if (var34 >= 0) {
                            break L68;
                          } else {
                            int fieldTemp$66 = k.field_e;
                            k.field_e = k.field_e + 1;
                            var34 = fieldTemp$66;
                            var24[var39] = fieldTemp$66;
                            ic.field_c[var34] = var42;
                            nn.field_S[var34] = var43;
                            bd.field_a[var34] = var44;
                            break L68;
                          }
                        }
                        L69: {
                          ja.field_l[var33] = var34;
                          var34 = var24[var40];
                          if (0 > var34) {
                            int fieldTemp$67 = k.field_e;
                            k.field_e = k.field_e + 1;
                            var34 = fieldTemp$67;
                            var24[var40] = fieldTemp$67;
                            ic.field_c[var34] = var45;
                            nn.field_S[var34] = var46;
                            bd.field_a[var34] = var47;
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        L70: {
                          db.field_f[var33] = var34;
                          var34 = var24[var41];
                          if (var34 >= 0) {
                            break L70;
                          } else {
                            int fieldTemp$68 = k.field_e;
                            k.field_e = k.field_e + 1;
                            var34 = fieldTemp$68;
                            var24[var41] = fieldTemp$68;
                            ic.field_c[var34] = var48;
                            nn.field_S[var34] = var49;
                            bd.field_a[var34] = var50;
                            break L70;
                          }
                        }
                        L71: {
                          wk.field_b[var33] = var34;
                          if (null == param18) {
                            break L71;
                          } else {
                            mc.field_m[var33] = param18[var38];
                            tc.field_w[var33] = param8[var38];
                            rk.field_b[var33] = param17[var38];
                            break L71;
                          }
                        }
                        var27[var33] = var38;
                        break L24;
                      }
                      var38++;
                      if (var65 == 0) {
                        continue L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                bm.field_p = param10;
                hb.field_d = param10;
                d.field_b = mf.field_u;
                ea.field_e = k.field_e;
                stackOut_188_0 = 0;
                stackOut_188_1 = param10;
                stackIn_189_0 = stackOut_188_0;
                stackIn_189_1 = stackOut_188_1;
                break L22;
              }
              L72: {
                L73: {
                  if (stackIn_189_0 < stackIn_189_1) {
                    L74: {
                      if (null == param6) {
                        break L74;
                      } else {
                        L75: {
                          L76: {
                            byte[] fieldTemp$69 = param6.field_v;
                            va.field_q.field_v = param6.field_v;
                            fl.field_o.field_v = fieldTemp$69;
                            if (fl.field_o.field_k == null) {
                              break L76;
                            } else {
                              if (fl.field_o.field_k.length < param10) {
                                break L76;
                              } else {
                                break L75;
                              }
                            }
                          }
                          fl.field_o.field_Q = new short[param10];
                          fl.field_o.field_k = new short[param10];
                          fl.field_o.field_N = new short[param10];
                          break L75;
                        }
                        L77: {
                          L78: {
                            if (va.field_q.field_k == null) {
                              break L78;
                            } else {
                              if (~param10 < ~va.field_q.field_k.length) {
                                break L78;
                              } else {
                                break L77;
                              }
                            }
                          }
                          va.field_q.field_Q = new short[param10];
                          va.field_q.field_N = new short[param10];
                          va.field_q.field_k = new short[param10];
                          break L77;
                        }
                        var38 = 0;
                        L79: while (true) {
                          L80: {
                            L81: {
                              if (param10 <= var38) {
                                break L81;
                              } else {
                                if (var65 != 0) {
                                  break L80;
                                } else {
                                  L82: {
                                    L83: {
                                      if (param6.field_v[var38] == 0) {
                                        break L83;
                                      } else {
                                        va.field_q.field_k[var38] = param6.field_k[var38];
                                        fl.field_o.field_k[var38] = param6.field_k[var38];
                                        va.field_q.field_N[var38] = param6.field_N[var38];
                                        fl.field_o.field_N[var38] = param6.field_N[var38];
                                        va.field_q.field_Q[var38] = param6.field_Q[var38];
                                        fl.field_o.field_Q[var38] = param6.field_Q[var38];
                                        if (var65 == 0) {
                                          break L82;
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                    L84: {
                                      var33 = param6.field_k[var38];
                                      var34 = var24[var33];
                                      if (var34 >= 0) {
                                        break L84;
                                      } else {
                                        int fieldTemp$70 = k.field_e;
                                        k.field_e = k.field_e + 1;
                                        var34 = fieldTemp$70;
                                        var24[var33] = fieldTemp$70;
                                        ic.field_c[var34] = param12[var33];
                                        nn.field_S[var34] = param5[var33];
                                        bd.field_a[var34] = param11[var33];
                                        break L84;
                                      }
                                    }
                                    L85: {
                                      fl.field_o.field_k[var38] = (short)var34;
                                      var34 = var25[var33];
                                      if (var34 < 0) {
                                        int fieldTemp$71 = mf.field_u;
                                        mf.field_u = mf.field_u + 1;
                                        var34 = fieldTemp$71;
                                        var25[var33] = fieldTemp$71;
                                        am.field_b[var34] = param12[var33];
                                        gd.field_Zb[var34] = param5[var33];
                                        cm.field_q[var34] = param11[var33];
                                        break L85;
                                      } else {
                                        break L85;
                                      }
                                    }
                                    L86: {
                                      va.field_q.field_k[var38] = (short)var34;
                                      var33 = param6.field_N[var38];
                                      var34 = var24[var33];
                                      if (var34 >= 0) {
                                        break L86;
                                      } else {
                                        int fieldTemp$72 = k.field_e;
                                        k.field_e = k.field_e + 1;
                                        var34 = fieldTemp$72;
                                        var24[var33] = fieldTemp$72;
                                        ic.field_c[var34] = param12[var33];
                                        nn.field_S[var34] = param5[var33];
                                        bd.field_a[var34] = param11[var33];
                                        break L86;
                                      }
                                    }
                                    L87: {
                                      fl.field_o.field_N[var38] = (short)var34;
                                      var34 = var25[var33];
                                      if (var34 < 0) {
                                        int fieldTemp$73 = mf.field_u;
                                        mf.field_u = mf.field_u + 1;
                                        var34 = fieldTemp$73;
                                        var25[var33] = fieldTemp$73;
                                        am.field_b[var34] = param12[var33];
                                        gd.field_Zb[var34] = param5[var33];
                                        cm.field_q[var34] = param11[var33];
                                        break L87;
                                      } else {
                                        break L87;
                                      }
                                    }
                                    L88: {
                                      va.field_q.field_N[var38] = (short)var34;
                                      var33 = param6.field_Q[var38];
                                      var34 = var24[var33];
                                      if (var34 >= 0) {
                                        break L88;
                                      } else {
                                        int fieldTemp$74 = k.field_e;
                                        k.field_e = k.field_e + 1;
                                        var34 = fieldTemp$74;
                                        var24[var33] = fieldTemp$74;
                                        ic.field_c[var34] = param12[var33];
                                        nn.field_S[var34] = param5[var33];
                                        bd.field_a[var34] = param11[var33];
                                        break L88;
                                      }
                                    }
                                    L89: {
                                      fl.field_o.field_Q[var38] = (short)var34;
                                      var34 = var25[var33];
                                      if (0 <= var34) {
                                        break L89;
                                      } else {
                                        int fieldTemp$75 = mf.field_u;
                                        mf.field_u = mf.field_u + 1;
                                        var34 = fieldTemp$75;
                                        var25[var33] = fieldTemp$75;
                                        am.field_b[var34] = param12[var33];
                                        gd.field_Zb[var34] = param5[var33];
                                        cm.field_q[var34] = param11[var33];
                                        break L89;
                                      }
                                    }
                                    va.field_q.field_Q[var38] = (short)var34;
                                    break L82;
                                  }
                                  var38++;
                                  if (var65 == 0) {
                                    continue L79;
                                  } else {
                                    break L81;
                                  }
                                }
                              }
                            }
                            byte[] fieldTemp$76 = param6.field_S;
                            va.field_q.field_S = param6.field_S;
                            fl.field_o.field_S = fieldTemp$76;
                            byte[] fieldTemp$77 = param6.field_x;
                            va.field_q.field_x = param6.field_x;
                            fl.field_o.field_x = fieldTemp$77;
                            short[] fieldTemp$78 = param6.field_D;
                            va.field_q.field_D = param6.field_D;
                            fl.field_o.field_D = fieldTemp$78;
                            byte[] fieldTemp$79 = param6.field_n;
                            va.field_q.field_n = param6.field_n;
                            fl.field_o.field_n = fieldTemp$79;
                            byte[] fieldTemp$80 = param6.field_M;
                            va.field_q.field_M = param6.field_M;
                            fl.field_o.field_M = fieldTemp$80;
                            byte[] fieldTemp$81 = param6.field_F;
                            va.field_q.field_F = param6.field_F;
                            fl.field_o.field_F = fieldTemp$81;
                            short[] fieldTemp$82 = param6.field_L;
                            va.field_q.field_L = param6.field_L;
                            fl.field_o.field_L = fieldTemp$82;
                            short[] fieldTemp$83 = param6.field_l;
                            va.field_q.field_l = param6.field_l;
                            fl.field_o.field_l = fieldTemp$83;
                            break L80;
                          }
                          if (var65 == 0) {
                            break L73;
                          } else {
                            break L74;
                          }
                        }
                      }
                    }
                    L90: {
                      L91: {
                        if (bg.field_f == null) {
                          break L91;
                        } else {
                          if (~param10 < ~bg.field_f.length) {
                            break L91;
                          } else {
                            break L90;
                          }
                        }
                      }
                      gb.field_r = new int[param10];
                      bg.field_f = new int[param10];
                      ch.field_s = new int[param10];
                      break L90;
                    }
                    L92: {
                      L93: {
                        if (nh.field_Mb == null) {
                          break L93;
                        } else {
                          if (param10 <= nh.field_Mb.length) {
                            break L92;
                          } else {
                            break L93;
                          }
                        }
                      }
                      nh.field_Mb = new int[param10];
                      li.field_m = new int[param10];
                      gk.field_c = new int[param10];
                      break L92;
                    }
                    var38 = 0;
                    L94: while (true) {
                      if (~var38 <= ~param10) {
                        break L73;
                      } else {
                        var33 = param19[var38];
                        var34 = var24[var33];
                        if (var65 != 0) {
                          break L72;
                        } else {
                          L95: {
                            if (0 <= var34) {
                              break L95;
                            } else {
                              int fieldTemp$84 = k.field_e;
                              k.field_e = k.field_e + 1;
                              var34 = fieldTemp$84;
                              var24[var33] = fieldTemp$84;
                              ic.field_c[var34] = param12[var33];
                              nn.field_S[var34] = param5[var33];
                              bd.field_a[var34] = param11[var33];
                              break L95;
                            }
                          }
                          L96: {
                            bg.field_f[var38] = var34;
                            var34 = var25[var33];
                            if (var34 >= 0) {
                              break L96;
                            } else {
                              int fieldTemp$85 = mf.field_u;
                              mf.field_u = mf.field_u + 1;
                              var34 = fieldTemp$85;
                              var25[var33] = fieldTemp$85;
                              am.field_b[var34] = param12[var33];
                              gd.field_Zb[var34] = param5[var33];
                              cm.field_q[var34] = param11[var33];
                              break L96;
                            }
                          }
                          L97: {
                            nh.field_Mb[var38] = var34;
                            var33 = param16[var38];
                            var34 = var24[var33];
                            if (var34 < 0) {
                              int fieldTemp$86 = k.field_e;
                              k.field_e = k.field_e + 1;
                              var34 = fieldTemp$86;
                              var24[var33] = fieldTemp$86;
                              ic.field_c[var34] = param12[var33];
                              nn.field_S[var34] = param5[var33];
                              bd.field_a[var34] = param11[var33];
                              break L97;
                            } else {
                              break L97;
                            }
                          }
                          L98: {
                            gb.field_r[var38] = var34;
                            var34 = var25[var33];
                            if (var34 >= 0) {
                              break L98;
                            } else {
                              int fieldTemp$87 = mf.field_u;
                              mf.field_u = mf.field_u + 1;
                              var34 = fieldTemp$87;
                              var25[var33] = fieldTemp$87;
                              am.field_b[var34] = param12[var33];
                              gd.field_Zb[var34] = param5[var33];
                              cm.field_q[var34] = param11[var33];
                              break L98;
                            }
                          }
                          L99: {
                            li.field_m[var38] = var34;
                            var33 = param15[var38];
                            var34 = var24[var33];
                            if (0 > var34) {
                              int fieldTemp$88 = k.field_e;
                              k.field_e = k.field_e + 1;
                              var34 = fieldTemp$88;
                              var24[var33] = fieldTemp$88;
                              ic.field_c[var34] = param12[var33];
                              nn.field_S[var34] = param5[var33];
                              bd.field_a[var34] = param11[var33];
                              break L99;
                            } else {
                              break L99;
                            }
                          }
                          L100: {
                            ch.field_s[var38] = var34;
                            var34 = var25[var33];
                            if (var34 < 0) {
                              int fieldTemp$89 = mf.field_u;
                              mf.field_u = mf.field_u + 1;
                              var34 = fieldTemp$89;
                              var25[var33] = fieldTemp$89;
                              am.field_b[var34] = param12[var33];
                              gd.field_Zb[var34] = param5[var33];
                              cm.field_q[var34] = param11[var33];
                              break L100;
                            } else {
                              break L100;
                            }
                          }
                          gk.field_c[var38] = var34;
                          var38++;
                          if (var65 == 0) {
                            continue L94;
                          } else {
                            break L73;
                          }
                        }
                      }
                    }
                  } else {
                    break L73;
                  }
                }
                break L72;
              }
              return;
            }
          }
        }
    }

    static {
    }
}
