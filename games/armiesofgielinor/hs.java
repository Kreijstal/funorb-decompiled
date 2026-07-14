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
        kb var7 = null;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param0 ^ 0, param1, param2, param3);
        if (!(null != ((hs) this).field_C)) {
            return;
        }
        kb[] var10 = ((hs) this).field_C;
        int var6 = 0;
        if (param0 != 32722) {
            Object var9 = null;
            boolean discarded$0 = ((hs) this).a(100, 40, 117, -12, 65, -112, (kb) null);
        }
        while (var6 < var10.length) {
            var7 = var10[var6];
            if (var7 != null) {
                var7.a(32722, param1 - -((hs) this).field_B, ((hs) this).field_p + param2, param3);
            }
            var6++;
        }
    }

    final static js a(String param0, int param1, String param2) {
        if (param1 != 235) {
            hs.a(124);
        }
        js var3 = js.a(mb.field_B, param0, param2);
        if (!(var3 == null)) {
            var3.field_B = null;
        }
        return var3;
    }

    final static void a(boolean param0, boolean param1, jd param2, int param3, int param4, int param5, int param6, int param7) {
        String var8 = null;
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
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        wk[] stackIn_52_0 = null;
        int[] stackIn_52_1 = null;
        wk[] stackIn_53_0 = null;
        int[] stackIn_53_1 = null;
        wk[] stackIn_54_0 = null;
        int[] stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_67_0 = 0;
        jd stackIn_77_0 = null;
        jd stackIn_78_0 = null;
        jd stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_106_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        wk[] stackOut_51_0 = null;
        int[] stackOut_51_1 = null;
        wk[] stackOut_53_0 = null;
        int[] stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        wk[] stackOut_52_0 = null;
        int[] stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        jd stackOut_76_0 = null;
        jd stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        jd stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        L0: {
          var20 = ArmiesOfGielinor.field_M ? 1 : 0;
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
            break L0;
          } else {
            if (param2.field_W) {
              var10 = 75;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var11 = bw.field_m[var10][6];
          var12 = bw.field_m[var10][7];
          if (!param2.field_W) {
            break L1;
          } else {
            if (34 == param2.field_N) {
              var12 = 7;
              var11 = 2;
              if ((param2.j(20640) ^ -1) != -4) {
                break L1;
              } else {
                var12 = var12 + param2.d(1, -105);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            L4: {
              if (param2.field_N == 81) {
                break L4;
              } else {
                if (-5 == (param2.field_N ^ -1)) {
                  break L4;
                } else {
                  if (74 != param2.field_N) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (-4 != (param2.j(20640) ^ -1)) {
              break L3;
            } else {
              var12 = var12 + param2.d(1, 96);
              break L2;
            }
          }
          L5: {
            if ((param2.g(0) ^ -1) != -4) {
              break L5;
            } else {
              if (-3 != (param2.j(20640) ^ -1)) {
                break L5;
              } else {
                var12 = var12 + param2.d(1, -102);
                break L2;
              }
            }
          }
          if (param2.g(0) != 2) {
            break L2;
          } else {
            if (param2.j(20640) != 1) {
              break L2;
            } else {
              var12 = var12 + param2.d(1, -116);
              break L2;
            }
          }
        }
        L6: {
          if ((var11 ^ -1) != (var12 ^ -1)) {
            qn.b(param4 + 92, param7 - 41 - -param6, 39, 30, 0, 128);
            fe.c(fo.a(4800, td.field_a, new String[2]), param4 + 111, param7 + -41 + (param6 - -30), 16777215, true);
            break L6;
          } else {
            qn.b(96 + param4, -41 - (-param6 - param7), 30, 30, 0, 128);
            fe.c(Integer.toString(var11), param4 + 111, -41 - (-param6 - (param7 - -30)), 16777215, true);
            break L6;
          }
        }
        L7: {
          var13 = 0;
          qn.a(307 + param4 - 20, param7 + -26 + param6, 17, 0, 128);
          var14 = bw.field_m[param2.field_N][12];
          if ((var14 ^ -1) < 0) {
            if ((var14 ^ -1) > (lb.field_e.length ^ -1)) {
              lb.field_e[var14].a(-35 + (308 + param4), -42 - -param6 + param7);
              break L7;
            } else {
              qn.a(-35 + (param4 + 308), param7 + param6 - 42, 25, (int)(Math.random() * 16777215.0), 128);
              break L7;
            }
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            var15 = eb.a((byte) -104, var9 >> -1675603870);
            if ((var15 & 3) > 0) {
              break L9;
            } else {
              if (-1 != (var15 ^ -1)) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L8;
              } else {
                break L9;
              }
            }
          }
          stackOut_32_0 = 1;
          stackIn_34_0 = stackOut_32_0;
          break L8;
        }
        var16 = stackIn_34_0 + (var15 >> 418503522);
        qn.b(param4 + 284 + -150, -41 - -param6 + param7, 130, 30 * var16, 0, 128);
        var17 = 5;
        L10: while (true) {
          if (1 >= var17) {
            L11: {
              if ((param2.field_P ^ -1) == -1) {
                break L11;
              } else {
                L12: {
                  if (7 <= param2.field_P) {
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_41_0 = -1 + param2.field_o;
                    stackIn_43_0 = stackOut_41_0;
                    break L12;
                  }
                }
                var17 = stackIn_43_0;
                lf.field_h[vr.field_a[param2.field_P + -1] + var17].h(-(30 * (var13 & 3)) + (235 + param4), param7 + (-36 + param6) - -((var13 >> 850621730) * 30));
                km.field_h[0].h(param4 + 233 + -(30 * (3 & var13)), 30 * (var13 >> -2014716030) + param7 + -37 + param6);
                var13++;
                break L11;
              }
            }
            L13: {
              if ((param2.field_r ^ -1) >= 0) {
                break L13;
              } else {
                lf.field_h[co.field_p[param2.j(20640)][param2.c((byte) 81)]].h(235 - -param4 + -((var13 & 3) * 30), (var13 >> 1916596002) * 30 + param7 + (-36 + param6));
                km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), (var13 >> 1277196226) * 30 + -37 - -param6 + param7);
                var13++;
                break L13;
              }
            }
            L14: {
              if (-1 > (param2.field_ab ^ -1)) {
                lf.field_h[uj.field_o[param2.field_ab - 1]].h(-((3 & var13) * 30) + (235 - -param4), 30 * (var13 >> 2043688066) + -36 - (-param6 - param7));
                km.field_h[0].h(param4 + 233 - 30 * (3 & var13), (var13 >> 263838306) * 30 + param7 + param6 - 37);
                var13++;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (param2.field_cb > 0) {
                L16: {
                  stackOut_51_0 = lf.field_h;
                  stackOut_51_1 = jq.field_H;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  if (3 >= param2.field_cb) {
                    stackOut_53_0 = (wk[]) (Object) stackIn_53_0;
                    stackOut_53_1 = (int[]) (Object) stackIn_53_1;
                    stackOut_53_2 = -1 + param2.field_cb;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    stackIn_54_2 = stackOut_53_2;
                    break L16;
                  } else {
                    stackOut_52_0 = (wk[]) (Object) stackIn_52_0;
                    stackOut_52_1 = (int[]) (Object) stackIn_52_1;
                    stackOut_52_2 = 2;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    stackIn_54_2 = stackOut_52_2;
                    break L16;
                  }
                }
                ((wk) (Object) stackIn_54_0[stackIn_54_1[stackIn_54_2]]).h(235 + param4 + -((var13 & 3) * 30), param7 + (-36 + param6) - -(30 * (var13 >> 258866466)));
                km.field_h[0].h(-((var13 & 3) * 30) + (233 + param4), (var13 >> -876283038) * 30 + param7 - (-param6 + 37));
                var13++;
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              if (!param2.field_C) {
                break L17;
              } else {
                lf.field_h[133].h(-((3 & var13) * 30) + 235 - -param4, param6 - (36 - param7 + -(30 * (var13 >> 258823074))));
                km.field_h[0].h(param4 + 233 + -(30 * (3 & var13)), -37 + (param6 + param7) + (var13 >> 1029666146) * 30);
                var13++;
                break L17;
              }
            }
            L18: {
              if (param2.field_bb) {
                lf.field_h[122 + bw.field_m[param2.field_N][2]].h(param4 + (235 - (var13 & 3) * 30), param7 - 36 - (-param6 - (var13 >> 1444835394) * 30));
                km.field_h[0].h(param4 + 233 + -(30 * (var13 & 3)), param7 - 37 - (-param6 + -((var13 >> -1694575454) * 30)));
                var13++;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (!param2.field_F) {
                break L19;
              } else {
                lf.field_h[j.field_j[td.a(param2.field_N, (byte) -125)]].h(-((3 & var13) * 30) + 235 - -param4, 30 * (var13 >> -1028241726) + param7 - -param6 - 36);
                km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), param6 + -37 + (param7 - -((var13 >> 128128130) * 30)));
                var13++;
                break L19;
              }
            }
            L20: {
              L21: {
                if (-81 != (param5 ^ -1)) {
                  break L21;
                } else {
                  if (!param0) {
                    break L21;
                  } else {
                    if (!ml.a(59 + param7, 26 + param4, 21, false)) {
                      break L21;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      break L20;
                    }
                  }
                }
              }
              stackOut_66_0 = 0;
              stackIn_67_0 = stackOut_66_0;
              break L20;
            }
            L22: {
              L23: {
                var17 = stackIn_67_0;
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
                          stackOut_76_0 = (jd) param2;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_77_0 = stackOut_76_0;
                          if (param1) {
                            stackOut_78_0 = (jd) (Object) stackIn_78_0;
                            stackOut_78_1 = 0;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            break L26;
                          } else {
                            stackOut_77_0 = (jd) (Object) stackIn_77_0;
                            stackOut_77_1 = 1;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            break L26;
                          }
                        }
                        if (((jd) (Object) stackIn_79_0).c(stackIn_79_1 != 0)) {
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
                              stackOut_90_0 = 0;
                              stackIn_91_0 = stackOut_90_0;
                              break L29;
                            } else {
                              stackOut_89_0 = 1;
                              stackIn_91_0 = stackOut_89_0;
                              break L29;
                            }
                          }
                          L30: {
                            var19 = stackIn_91_0;
                            if (param2.field_s) {
                              break L30;
                            } else {
                              if ((param2.field_B ^ -1) == -1) {
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
                              stackOut_105_0 = 0;
                              stackIn_106_0 = stackOut_105_0;
                              break L32;
                            } else {
                              stackOut_104_0 = 1;
                              stackIn_106_0 = stackOut_104_0;
                              break L32;
                            }
                          }
                          L33: {
                            var19 = stackIn_106_0;
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
            return;
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
            continue L10;
          }
        }
    }

    final int g(int param0) {
        int var4 = 0;
        kb var5 = null;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        if (param0 != -31989) {
            Object var8 = null;
            boolean discarded$0 = ((hs) this).a(-72, 104, -12, -47, (kb) null, 52, 17);
        }
        kb[] var3 = ((hs) this).field_C;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(var5 == null)) {
                var6 = var5.g(-31989);
                if (!(var2 >= var6)) {
                    var2 = var6;
                }
            }
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        int var9 = 0;
        kb var10 = null;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(null != ((hs) this).field_C)) {
            return false;
        }
        kb[] var12 = ((hs) this).field_C;
        kb[] var8 = var12;
        if (param5 < 93) {
            int discarded$0 = ((hs) this).g(-110);
        }
        for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null) {
                if (var10.a(false)) {
                    if (!(!var10.a(param0, param1, param2, param3, param4, 103, param6))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        kb var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == 0) {
            if (!(null == ((hs) this).field_k)) {
                ((hs) this).field_k.a((kb) this, param0, -121, true, param1);
            }
        }
        if (param2 >= -82) {
            ((hs) this).f(-101);
        }
        if (!(null == ((hs) this).field_C)) {
            for (var5 = -1 + ((hs) this).field_C.length; var5 >= 0; var5--) {
                var6 = ((hs) this).field_C[var5];
                if (var6 != null) {
                    var6.a(((hs) this).field_B + param0, param1 - -((hs) this).field_p, (byte) -124, param3);
                }
            }
        }
    }

    final boolean a(kb param0, int param1, boolean param2) {
        int var4 = 0;
        kb var5 = null;
        kb var6 = null;
        kb var6_ref = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((hs) this).field_C == null) {
            return false;
        }
        for (var4 = 0; ((hs) this).field_C.length > var4; var4++) {
            var5 = ((hs) this).field_C[var4];
            var6 = var5;
            var6 = var5;
            if (var5 != null) {
                if (!(!var5.a(false))) {
                    var4 = var4 + param1;
                    while ((((hs) this).field_C.length ^ -1) < (var4 ^ -1)) {
                        var6_ref = ((hs) this).field_C[var4];
                        if (var6_ref != null) {
                            if (!(!var6_ref.a(11, param0))) {
                                return true;
                            }
                        }
                        var4 = var4 + param1;
                    }
                }
            }
        }
        if (!param2) {
            field_G = null;
            return false;
        }
        return false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (!(!((hs) this).a(param3, param0, (byte) 55, param1))) {
            ((hs) this).a(param0, param3, true, param1);
            this.a(param3, -121, param1, param0);
        }
        if (param2 != 26477) {
            boolean discarded$0 = ((hs) this).a((kb) null, -91, '￨', -125);
        }
        return param1;
    }

    hs(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
    }

    final boolean a(byte param0, kb param1, int param2) {
        int var4 = 0;
        kb var5 = null;
        kb var6 = null;
        kb var6_ref = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(null != ((hs) this).field_C)) {
            return false;
        }
        if (param0 <= 79) {
            hs.b(45, -36);
        }
        for (var4 = ((hs) this).field_C.length - 1; 0 <= var4; var4--) {
            var5 = ((hs) this).field_C[var4];
            var6 = var5;
            var6 = var5;
            if (var5 != null) {
                if (!(!var5.a(false))) {
                    var4 = var4 - param2;
                    while (var4 >= 0) {
                        var6_ref = ((hs) this).field_C[var4];
                        if (var6_ref != null) {
                            if (var6_ref.a(11, param1)) {
                                return true;
                            }
                        }
                        var4 = var4 - param2;
                    }
                }
            }
        }
        return false;
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        int var6 = 0;
        kb var7 = null;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((hs) this).field_C == null) {
            return false;
        }
        kb[] var9 = ((hs) this).field_C;
        kb[] var5_ref_kb__ = var9;
        for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
                if (var7.a(false)) {
                    if (var7.a(param0, param1, param2, -12215)) {
                        return true;
                    }
                }
            }
        }
        int var5 = param1;
        if (var5 == 80) {
            return br.field_f[81] ? ((hs) this).a((byte) 88, param0) : ((hs) this).b(-57, param0);
        }
        if (param3 != -12215) {
            field_E = null;
            return false;
        }
        return false;
    }

    abstract void d(byte param0);

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((hs) this).field_C == null) {
            return;
        }
        kb[] var10 = ((hs) this).field_C;
        if (param1 >= -95) {
            return;
        }
        for (var6 = 0; (var6 ^ -1) > (var10.length ^ -1); var6++) {
            var7 = var10[var6];
            StringBuilder discarded$0 = param2.append(10);
            for (var8 = 0; (param3 ^ -1) <= (var8 ^ -1); var8++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            if (var7 == null) {
                StringBuilder discarded$3 = param2.append("null");
            } else {
                StringBuilder discarded$4 = var7.a(param3 + 1, param2, 26477, param0);
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
        if (var3 != null) {
            if (0 != var3.field_o.length) {
                te discarded$0 = ub.a((byte) 127, var3);
            }
        }
    }

    final String h(int param0) {
        kb[] var2 = null;
        int var3 = 0;
        kb var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((hs) this).field_C) {
          var2 = ((hs) this).field_C;
          if (param0 == 21384) {
            var3 = 0;
            L0: while (true) {
              if ((var2.length ^ -1) < (var3 ^ -1)) {
                L1: {
                  var4 = var2[var3];
                  if (var4 != null) {
                    var5 = var4.h(21384);
                    if (var5 == null) {
                      break L1;
                    } else {
                      return var5;
                    }
                  } else {
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            return null;
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
        int var9 = 0;
        kb var10 = null;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((hs) this).field_C == null) {
            return false;
        }
        if (param3 <= 103) {
            return true;
        }
        kb[] var12 = ((hs) this).field_C;
        kb[] var8 = var12;
        for (var9 = 0; (var12.length ^ -1) < (var9 ^ -1); var9++) {
            var10 = var12[var9];
            if (var10 != null) {
                if (var10.a(param0, ((hs) this).field_B + param1, ((hs) this).field_p + param2, 108, param4, param5, param6)) {
                    return true;
                }
            }
        }
        return false;
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
        int var3 = 0;
        kb var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 1) {
            field_D = null;
        }
        kb[] var6 = ((hs) this).field_C;
        kb[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (!(var4 == null)) {
                var4.f(1);
            }
        }
    }

    final boolean a(byte param0, kb param1) {
        if (param0 != 88) {
            field_H = null;
        }
        return ((hs) this).a((byte) 99, param1, 1);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        ((hs) this).d((byte) 121);
    }

    private final kb a(byte param0) {
        int var3 = 0;
        kb var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((hs) this).field_C == null) {
            return null;
        }
        kb[] var6 = ((hs) this).field_C;
        kb[] var2 = var6;
        for (var3 = 0; (var3 ^ -1) > (var6.length ^ -1); var3++) {
            var4 = var6[var3];
            if (var4 != null) {
                if (!(!var4.a(false))) {
                    return var4;
                }
            }
        }
        if (param0 <= -64) {
            return null;
        }
        return null;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var8 = 0;
        kb var10 = null;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(((hs) this).field_C != null)) {
            return;
        }
        kb[] var12 = ((hs) this).field_C;
        kb[] var7 = var12;
        int var9 = 100 / ((param3 - -58) / 53);
        for (var8 = 0; var12.length > var8; var8++) {
            var10 = var12[var8];
            if (var10 != null) {
                var10.a(((hs) this).field_p + param0, param1, param2, (byte) -126, param4, ((hs) this).field_B + param5);
            }
        }
    }

    boolean a(int param0, kb param1) {
        int var4 = 0;
        kb var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 11) {
            return false;
        }
        kb[] var7 = ((hs) this).field_C;
        kb[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
                if (var5.a(11, param1)) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean b(int param0, kb param1) {
        int var3 = 41 / ((2 - param0) / 58);
        return ((hs) this).a(param1, 1, true);
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
            field_H = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "/";
        field_D = "Options";
        field_E = new String[]{"turntime_icons", "mapsize_icons", "gamelength_icons", "maptype_icons", "team_icons", "equipment_icons"};
        field_G = new int[]{20, 30, 40, 60, 10};
    }
}
