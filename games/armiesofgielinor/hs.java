/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hs extends kb implements gw {
    static String field_D;
    kb[] field_C;
    static String field_I;
    static fp field_H;
    static int[] field_G;
    static wk[] field_F;
    static String[] field_E;

    void a(int param0, int param1, int param2, kb param3) {
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        kb var9 = null;
        kb[] var10 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            super.a(param0 ^ 0, param1, param2, param3);
            if (null == this.field_C) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = this.field_C;
                var6 = 0;
                if (param0 == 32722) {
                  break L1;
                } else {
                  var9 = (kb) null;
                  this.a(100, 40, 117, -12, 65, -112, (kb) null);
                  break L1;
                }
              }
              L2: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = var10[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      var7.a(32722, param1 - -this.field_B, this.field_p + param2, param3);
                      break L3;
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("hs.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static js a(String param0, int param1, String param2) {
        js var3 = null;
        RuntimeException var3_ref = null;
        js stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 235) {
                break L1;
              } else {
                hs.a(124);
                break L1;
              }
            }
            L2: {
              var3 = js.a(mb.field_B, param0, param2);
              if (var3 != null) {
                var3.field_B = null;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (js) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("hs.IA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(boolean param0, boolean param1, jd param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        wk[] stackIn_54_0 = null;
        int[] stackIn_54_1 = null;
        wk[] stackIn_55_0 = null;
        int[] stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_71_0 = 0;
        jd stackIn_82_0 = null;
        jd stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_110_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        ne var18 = null;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              cf.field_t.b(param4 + 2, param7 + param6 + -73);
              fe.b(param4 + 0, -76 + param6 + param7, 309, 71, io.field_m, nd.field_b, 0, 0);
              qn.b(param4 + 7, param7 + -70 + param6, 25, 25, 0, 128);
              qn.b(37 - -param4, param7 + -70 + param6, 265, 25, 0, 128);
              var21 = param2.q((byte) 67);
              var8 = var21.toLowerCase();
              qn.f(param4 + 37, param7 + -70 + param6, 245 - -param4, param6 + (param7 - 45));
              fe.a(var8, -param3 + (param4 + 42), param6 - 43 + param7, 16777215, true);
              qn.a();
              fe.c(param2.field_Y - -param2.field_A + "/" + param2.field_t, param4 + 272, param6 - (42 - param7), 16777215, param1);
              ro.field_rb[param2.g(0)].a(param4 + 9, param7 + -66 + param6);
              var9 = param2.l(-27014);
              qn.b(59 + param4, param7 + -41 + param6, 30, 30, 0, 128);
              cp.field_e[eb.a((byte) -120, (var9 ^ -1) & 3)].a(param4 + 62, param7 - (-param6 + 41));
              var10 = param2.field_N;
              if ((var10 ^ -1) != -35) {
                break L1;
              } else {
                if (param2.field_W) {
                  var10 = 75;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var11 = bw.field_m[var10][6];
              var12 = bw.field_m[var10][7];
              if (!param2.field_W) {
                break L2;
              } else {
                if (34 == param2.field_N) {
                  var12 = 7;
                  var11 = 2;
                  if ((param2.j(20640) ^ -1) != -4) {
                    break L2;
                  } else {
                    var12 = var12 + param2.d(1, -105);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                L5: {
                  if (param2.field_N == 81) {
                    break L5;
                  } else {
                    if (-5 == (param2.field_N ^ -1)) {
                      break L5;
                    } else {
                      if (74 != param2.field_N) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (-4 != (param2.j(20640) ^ -1)) {
                  break L4;
                } else {
                  var12 = var12 + param2.d(1, 96);
                  break L3;
                }
              }
              L6: {
                if ((param2.g(0) ^ -1) != -4) {
                  break L6;
                } else {
                  if (-3 != (param2.j(20640) ^ -1)) {
                    break L6;
                  } else {
                    var12 = var12 + param2.d(1, -102);
                    break L3;
                  }
                }
              }
              if (param2.g(0) != 2) {
                break L3;
              } else {
                if (param2.j(20640) != 1) {
                  break L3;
                } else {
                  var12 = var12 + param2.d(1, -116);
                  break L3;
                }
              }
            }
            L7: {
              if (var11 != var12) {
                qn.b(param4 + 92, param7 - 41 - -param6, 39, 30, 0, 128);
                fe.c(fo.a(4800, td.field_a, new String[]{Integer.toString(var11), Integer.toString(var12)}), param4 + 111, param7 + -41 + (param6 - -30), 16777215, true);
                break L7;
              } else {
                qn.b(96 + param4, -41 - (-param6 - param7), 30, 30, 0, 128);
                fe.c(Integer.toString(var11), param4 + 111, -41 - (-param6 - (param7 - -30)), 16777215, true);
                break L7;
              }
            }
            L8: {
              var13 = 0;
              qn.a(307 + param4 - 20, param7 + -26 + param6, 17, 0, 128);
              var14 = bw.field_m[param2.field_N][12];
              if ((var14 ^ -1) < 0) {
                if (var14 < lb.field_e.length) {
                  lb.field_e[var14].a(-35 + (308 + param4), -42 - -param6 + param7);
                  break L8;
                } else {
                  qn.a(-35 + (param4 + 308), param7 + param6 - 42, 25, (int)(Math.random() * 16777215.0), 128);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                var15 = eb.a((byte) -104, var9 >> -1675603870);
                if ((var15 & 3) > 0) {
                  break L10;
                } else {
                  if (-1 != (var15 ^ -1)) {
                    stackIn_35_0 = 0;
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              stackIn_35_0 = 1;
              break L9;
            }
            var16 = stackIn_35_0 + (var15 >> 418503522);
            qn.b(param4 + 284 + -150, -41 - -param6 + param7, 130, 30 * var16, 0, 128);
            var17 = 5;
            L11: while (true) {
              if (1 >= var17) {
                L12: {
                  if (param2.field_P == 0) {
                    break L12;
                  } else {
                    L13: {
                      if (7 <= param2.field_P) {
                        stackIn_44_0 = 0;
                        break L13;
                      } else {
                        stackIn_44_0 = -1 + param2.field_o;
                        break L13;
                      }
                    }
                    var17 = stackIn_44_0;
                    lf.field_h[vr.field_a[param2.field_P + -1] + var17].h(-(30 * (var13 & 3)) + (235 + param4), param7 + (-36 + param6) - -((var13 >> 850621730) * 30));
                    km.field_h[0].h(param4 + 233 + -(30 * (3 & var13)), 30 * (var13 >> -2014716030) + param7 + -37 + param6);
                    var13++;
                    break L12;
                  }
                }
                L14: {
                  if ((param2.field_r ^ -1) >= 0) {
                    break L14;
                  } else {
                    lf.field_h[co.field_p[param2.j(20640)][param2.c((byte) 81)]].h(235 - -param4 + -((var13 & 3) * 30), (var13 >> 1916596002) * 30 + param7 + (-36 + param6));
                    km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), (var13 >> 1277196226) * 30 + -37 - -param6 + param7);
                    var13++;
                    break L14;
                  }
                }
                L15: {
                  if (-1 > (param2.field_ab ^ -1)) {
                    lf.field_h[uj.field_o[param2.field_ab - 1]].h(-((3 & var13) * 30) + (235 - -param4), 30 * (var13 >> 2043688066) + -36 - (-param6 - param7));
                    km.field_h[0].h(param4 + 233 - 30 * (3 & var13), (var13 >> 263838306) * 30 + param7 + param6 - 37);
                    var13++;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param2.field_cb > 0) {
                    L17: {
                      stackIn_54_0 = lf.field_h;

                      stackIn_54_1 = jq.field_H;

                      if (3 >= param2.field_cb) {
                        stackIn_55_0 = (wk[]) ((Object) stackIn_54_0);
                        stackIn_55_1 = (int[]) ((Object) stackIn_54_1);
                        stackIn_55_2 = -1 + param2.field_cb;
                        break L17;
                      } else {
                        stackIn_55_0 = (wk[]) ((Object) stackIn_54_0);
                        stackIn_55_1 = (int[]) ((Object) stackIn_54_1);
                        stackIn_55_2 = 2;
                        break L17;
                      }
                    }
                    ((wk) (Object) stackIn_55_0[stackIn_55_1[stackIn_55_2]]).h(235 + param4 + -((var13 & 3) * 30), param7 + (-36 + param6) - -(30 * (var13 >> 258866466)));
                    km.field_h[0].h(-((var13 & 3) * 30) + (233 + param4), (var13 >> -876283038) * 30 + param7 - (-param6 + 37));
                    var13++;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L18: {
                  if (!param2.field_C) {
                    break L18;
                  } else {
                    lf.field_h[133].h(-((3 & var13) * 30) + 235 - -param4, param6 - (36 - param7 + -(30 * (var13 >> 258823074))));
                    km.field_h[0].h(param4 + 233 + -(30 * (3 & var13)), -37 + (param6 + param7) + (var13 >> 1029666146) * 30);
                    var13++;
                    break L18;
                  }
                }
                L19: {
                  if (param2.field_bb) {
                    lf.field_h[122 + bw.field_m[param2.field_N][2]].h(param4 + (235 - (var13 & 3) * 30), param7 - 36 - (-param6 - (var13 >> 1444835394) * 30));
                    km.field_h[0].h(param4 + 233 + -(30 * (var13 & 3)), param7 - 37 - (-param6 + -((var13 >> -1694575454) * 30)));
                    var13++;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (!param2.field_F) {
                    break L20;
                  } else {
                    lf.field_h[j.field_j[td.a(param2.field_N, (byte) -125)]].h(-((3 & var13) * 30) + 235 - -param4, 30 * (var13 >> -1028241726) + param7 - -param6 - 36);
                    km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), param6 + -37 + (param7 - -((var13 >> 128128130) * 30)));
                    var13++;
                    break L20;
                  }
                }
                L21: {
                  if (-81 == (param5 ^ -1)) {
                    if (param0) {
                      if (ml.a(59 + param7, 26 + param4, 21, false)) {
                        stackIn_71_0 = 1;
                        break L21;
                      } else {
                        stackIn_71_0 = 0;
                        break L21;
                      }
                    } else {
                      stackIn_71_0 = 0;
                      break L21;
                    }
                  } else {
                    stackIn_71_0 = 0;
                    break L21;
                  }
                }
                L22: {
                  L23: {
                    var17 = stackIn_71_0;
                    if (param2.field_N == 39) {
                      L24: {
                        if (param2.field_s) {
                          break L24;
                        } else {
                          if (param2.field_B != 0) {
                            lw.field_ob.g(11 - -param4, param6 + (-36 + param7));
                            ii.field_a[2].g(11 + param4, -36 + (param6 + param7));
                            if (var17 == 0) {
                              break L23;
                            } else {
                              lw.field_ob.f(11 + param4, param7 - (-param6 + 36), 128);
                              break L23;
                            }
                          } else {
                            break L24;
                          }
                        }
                      }
                      lw.field_ob.g(param4 + 11, param7 - -param6 + -36, 128);
                      ii.field_a[2].g(param4 + 11, param7 + param6 - 36, 128);
                      break L23;
                    } else {
                      if ((param2.field_N ^ -1) != -73) {
                        L25: {
                          if (-18 != (param2.field_N ^ -1)) {
                            break L25;
                          } else {
                            L26: {
                              stackIn_82_0 = (jd) (param2);

                              if (param1) {
                                stackIn_83_0 = (jd) ((Object) stackIn_82_0);
                                stackIn_83_1 = 0;
                                break L26;
                              } else {
                                stackIn_83_0 = (jd) ((Object) stackIn_82_0);
                                stackIn_83_1 = 1;
                                break L26;
                              }
                            }
                            if (((jd) (Object) stackIn_83_0).c(stackIn_83_1 != 0)) {
                              break L25;
                            } else {
                              L27: {
                                if (param2.field_s) {
                                  break L27;
                                } else {
                                  if (-1 != (param2.field_B ^ -1)) {
                                    lw.field_ob.g(11 - -param4, param7 - 36 - -param6);
                                    ii.field_a[1].g(param4 + 11, param7 + param6 - 36);
                                    if (var17 == 0) {
                                      break L23;
                                    } else {
                                      lw.field_ob.f(11 + param4, -36 - (-param6 - param7), 128);
                                      break L23;
                                    }
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              lw.field_ob.g(param4 + 11, param6 - 36 + param7, 128);
                              ii.field_a[1].g(11 - -param4, param6 - 36 + param7, 128);
                              break L23;
                            }
                          }
                        }
                        L28: {
                          if ((param2.field_N ^ -1) != -8) {
                            break L28;
                          } else {
                            if (param2.field_W) {
                              break L28;
                            } else {
                              L29: {
                                var18_int = param2.field_l.field_Eb[param2.field_J - -(param2.field_w * param2.field_l.field_v)].field_h;
                                if (0 == var18_int) {
                                  stackIn_95_0 = 0;
                                  break L29;
                                } else {
                                  stackIn_95_0 = 1;
                                  break L29;
                                }
                              }
                              L30: {
                                var19 = stackIn_95_0;
                                if (param2.field_s) {
                                  break L30;
                                } else {
                                  if (param2.field_B == 0) {
                                    break L30;
                                  } else {
                                    if (var19 == 0) {
                                      lw.field_ob.g(param4 + 11, param7 + (param6 + -36));
                                      ii.field_a[4].g(param4 + 11, param7 - -param6 - 36);
                                      if (var17 != 0) {
                                        lw.field_ob.f(11 - -param4, param7 + (-36 + param6), 128);
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                              lw.field_ob.g(11 - -param4, param6 + (-36 + param7), 128);
                              ii.field_a[4].g(11 + param4, -36 - -param6 + param7, 128);
                              break L23;
                            }
                          }
                        }
                        L31: {
                          if (param2.field_N != 34) {
                            break L31;
                          } else {
                            if (!param2.field_W) {
                              L32: {
                                var18 = param2.field_l.field_Eb[param2.field_w * param2.field_l.field_v + param2.field_J];
                                if (var18.f(19725)) {
                                  stackIn_110_0 = 0;
                                  break L32;
                                } else {
                                  stackIn_110_0 = 1;
                                  break L32;
                                }
                              }
                              L33: {
                                var19 = stackIn_110_0;
                                if (param2.field_s) {
                                  break L33;
                                } else {
                                  if (param2.field_B == 0) {
                                    break L33;
                                  } else {
                                    if (var19 != 0) {
                                      break L33;
                                    } else {
                                      lw.field_ob.g(param4 + 11, -36 + (param6 + param7));
                                      ii.field_a[0].g(11 + param4, -36 + param6 + param7);
                                      if (var17 != 0) {
                                        lw.field_ob.f(param4 + 11, -36 + param6 + param7, 128);
                                        break L23;
                                      } else {
                                        km.field_h[1].g(7 + param4, -40 + (param6 + param7));
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                              lw.field_ob.g(11 - -param4, param6 - 36 + param7, 128);
                              ii.field_a[0].g(11 + param4, param7 - 36 - -param6, 128);
                              break L23;
                            } else {
                              break L31;
                            }
                          }
                        }
                        lw.field_ob.g(11 + param4, -36 - (-param6 - param7), 128);
                        break L23;
                      } else {
                        L34: {
                          if (param2.field_s) {
                            break L34;
                          } else {
                            if (0 == param2.field_B) {
                              break L34;
                            } else {
                              lw.field_ob.g(11 + param4, param7 - (-param6 + 36));
                              ii.field_a[3].g(param4 + 11, param6 - (36 - param7));
                              if (var17 != 0) {
                                lw.field_ob.f(param4 + 11, param6 + (-36 + param7), 128);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        lw.field_ob.g(11 + param4, param6 + (-36 + param7), 128);
                        ii.field_a[3].g(param4 + 11, param7 - (-param6 - -36), 128);
                        break L23;
                      }
                    }
                  }
                  km.field_h[1].g(7 + param4, -40 + (param6 + param7));
                  break L22;
                }
                break L0;
              } else {
                L35: {
                  if ((var9 & 1 << var17) == 0) {
                    break L35;
                  } else {
                    cp.field_e[var17 - -1].a(-(30 * (3 & var13)) + 235 - -param4, (var13 >> -812551454) * 30 + (param7 - 41 - -param6));
                    var13++;
                    break L35;
                  }
                }
                var17--;
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var8_ref = decompiledCaughtException;
            stackIn_127_0 = (RuntimeException) (var8_ref);

            stackIn_127_1 = new StringBuilder().append("hs.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "null";
              break L36;
            } else {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "{...}";
              break L36;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final int g(int param0) {
        int var2;
        kb[] var3;
        int var4;
        kb var5;
        int var7;
        kb var8;
        int var6;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          if (param0 == -31989) {
            break L0;
          } else {
            var8 = (kb) null;
            this.a(-72, 104, -12, -47, (kb) null, 52, 17);
            break L0;
          }
        }
        var3 = this.field_C;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.g(-31989);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        kb[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == this.field_C) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var12 = this.field_C;
                var8 = var12;
                if (param5 >= 93) {
                  break L1;
                } else {
                  this.g(-110);
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(false)) {
                        break L3;
                      } else {
                        if (var10.a(param0, param1, param2, param3, param4, 103, param6)) {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8_ref);

            stackIn_20_1 = new StringBuilder().append("hs.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5;
        kb var6;
        int var7;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 != 0) {
            break L0;
          } else {
            if (null != this.field_k) {
              this.field_k.a((kb) (this), param0, -121, true, param1);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param2 < -82) {
            break L1;
          } else {
            this.f(-101);
            break L1;
          }
        }
        L2: {
          if (null != this.field_C) {
            var5 = -1 + this.field_C.length;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = this.field_C[var5];
                if (var6 != null) {
                  var6.a(this.field_B + param0, param1 - -this.field_p, (byte) -124, param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final boolean a(kb param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kb var5 = null;
        kb var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        kb stackIn_7_0 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C != null) {
              var4_int = 0;
              L1: while (true) {
                if (this.field_C.length <= var4_int) {
                  if (param2) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_G = (int[]) null;
                    return false;
                  }
                } else {
                  var5 = this.field_C[var4_int];
                  var6 = var5;
                  var6 = var5;
                  stackIn_7_0 = (kb) (var5);
                  L2: {
                    if (stackIn_7_0 == null) {
                      break L2;
                    } else {
                      if (var5.a(false)) {
                        var4_int = var4_int + param1;
                        L3: while (true) {
                          if (this.field_C.length <= var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_C[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (var6.a(11, param0)) {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int + param1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("hs.EA(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param0, (byte) 55, param1)) {
                this.a(param0, param3, true, param1);
                this.a(param3, -121, param1, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 26477) {
                break L2;
              } else {
                this.a((kb) null, -91, '￨', -125);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hs.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    hs(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
    }

    final boolean a(byte param0, kb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kb var5 = null;
        kb var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == this.field_C) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 > 79) {
                  break L1;
                } else {
                  hs.b(45, -36);
                  break L1;
                }
              }
              var4_int = this.field_C.length - 1;
              L2: while (true) {
                if (0 > var4_int) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_C[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.a(false)) {
                        var4_int = var4_int - param2;
                        L4: while (true) {
                          if (var4_int < 0) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_C[var4_int];
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (!var6.a(11, param1)) {
                                  break L5;
                                } else {
                                  stackIn_17_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int - param2;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("hs.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        kb[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        kb[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C != null) {
              var9 = this.field_C;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  var5_int = param1;
                  if (var5_int != 80) {
                    if (param3 == -12215) {
                      stackIn_20_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      field_E = (String[]) null;
                      return false;
                    }
                  } else {
                    L2: {
                      if (!br.field_f[81]) {
                        stackIn_16_0 = this.b(-57, param0);
                        break L2;
                      } else {
                        stackIn_16_0 = this.a((byte) 88, param0);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (!var7.a(false)) {
                        break L3;
                      } else {
                        if (!var7.a(param0, param1, param2, -12215)) {
                          break L3;
                        } else {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("hs.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    abstract void d(byte param0);

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        int var9 = 0;
        kb[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C != null) {
              var10 = this.field_C;
              if (param1 < -95) {
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var10.length) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var7 = var10[var6];
                    discarded$6 = param2.append('\n');
                    var8 = 0;
                    L2: while (true) {
                      if (param3 < var8) {
                        L3: {
                          if (var7 != null) {
                            var7.a(param3 + 1, param2, 26477, param0);
                            break L3;
                          } else {
                            discarded$7 = param2.append("null");
                            break L3;
                          }
                        }
                        var6++;
                        continue L1;
                      } else {
                        discarded$8 = param2.append(' ');
                        var8++;
                        continue L2;
                      }
                    }
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
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("hs.MA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
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

    final static void b(int param0, int param1) {
        if (!((param1 ^ -1) <= -1)) {
            return;
        }
        int var2 = 0 % ((43 - param0) / 60);
        param1 = uc.field_d[param1][8];
        if (param1 < 0) {
            return;
        }
        sn var3 = am.field_v[param1];
        if (var3 != null && 0 != var3.field_o.length) {
            ub.a((byte) 127, var3);
        }
    }

    final String h(int param0) {
        kb[] var2;
        int var3;
        kb var4;
        int var6;
        String var5;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_C) {
          var2 = this.field_C;
          if (param0 == 21384) {
            var3 = 0;
            L0: while (true) {
              if (var2.length > var3) {
                var4 = var2[var3];
                if (var4 != null) {
                  var5 = var4.h(21384);
                  if (var5 != null) {
                    return var5;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return null != this.a((byte) -86) ? true : false;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        kb[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C != null) {
              if (param3 > 103) {
                var12 = this.field_C;
                var8 = var12;
                var9 = 0;
                L1: while (true) {
                  if (var12.length <= var9) {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L2;
                      } else {
                        if (!var10.a(param0, this.field_B + param1, this.field_p + param2, 108, param4, param5, param6)) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("hs.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_E = null;
        field_G = null;
        field_F = null;
        field_H = null;
        field_I = null;
        field_D = null;
    }

    final void f(int param0) {
        kb[] var2;
        int var3;
        kb var4;
        int var5;
        kb[] var6;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            field_D = (String) null;
            break L0;
          }
        }
        var6 = this.field_C;
        var2 = var6;
        var3 = 0;
        L1: while (true) {
          if (var6.length <= var3) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.f(1);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final boolean a(byte param0, kb param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 88) {
                break L1;
              } else {
                field_H = (fp) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) 99, param1, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hs.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 121);
    }

    private final kb a(byte param0) {
        kb[] var2;
        int var3;
        kb var4;
        int var5;
        kb[] var6;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_C != null) {
          var6 = this.field_C;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 > -64) {
                return (kb) null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.a(false)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        kb[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        kb var10 = null;
        int var11 = 0;
        kb[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_C;
              var7 = var12;
              var9 = 100 / ((param3 - -58) / 53);
              var8 = 0;
              L1: while (true) {
                if (var12.length <= var8) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var8];
                    if (var10 == null) {
                      break L2;
                    } else {
                      var10.a(this.field_p + param0, param1, param2, (byte) -126, param4, this.field_B + param5);
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("hs.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, kb param1) {
        kb[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        kb var5 = null;
        int var6 = 0;
        kb[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == 11) {
              var7 = this.field_C;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.a(11, param1)) {
                        break L2;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("hs.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean b(int param0, kb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 41 / ((2 - param0) / 58);
            stackIn_1_0 = this.a(param1, 1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("hs.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (-225 >= (bp.field_e ^ -1)) {
            mh.a(256, (byte) -60);
        } else {
            var1 = bp.field_e % 32;
            mh.a(bp.field_e + 32 - var1, (byte) -36);
        }
        if (param0 != 30) {
            field_H = (fp) null;
        }
    }

    static {
        field_I = "/";
        field_D = "Options";
        field_E = new String[]{"turntime_icons", "mapsize_icons", "gamelength_icons", "maptype_icons", "team_icons", "equipment_icons"};
        field_G = new int[]{20, 30, 40, 60, 10};
    }
}
