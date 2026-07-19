/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterable {
    kd field_a;
    static String field_h;
    static String[] field_g;
    static int field_b;
    static pn field_i;
    static boolean field_f;
    static int field_d;
    static wk[] field_j;
    static java.security.SecureRandom field_c;
    static wk field_e;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(ub.field_e);
            param1.removeMouseMotionListener(ub.field_e);
            param1.removeFocusListener(ub.field_e);
            wn.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final kd a(int param0) {
        kd var2 = null;
        L0: {
          if (param0 == 12515) {
            break L0;
          } else {
            field_b = 114;
            break L0;
          }
        }
        var2 = this.field_a.field_o;
        if (this.field_a == var2) {
          return null;
        } else {
          var2.e(480);
          return var2;
        }
    }

    final void a(byte param0, kd param1) {
        try {
            if (param0 <= 16) {
                field_i = (pn) null;
            }
            if (!(param1.field_v == null)) {
                param1.e(480);
            }
            param1.field_o = this.field_a;
            param1.field_v = this.field_a.field_v;
            param1.field_v.field_o = param1;
            param1.field_o.field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "hb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wh((hb) (this)));
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (param7 < lf.field_h) {
                  L2: {
                    var9_int = 54 / ((59 - param1) / 54);
                    if (param2 >= 0) {
                      break L2;
                    } else {
                      if (param5 >= 0) {
                        break L2;
                      } else {
                        if (-1 >= (param0 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < lf.field_g) {
                      break L3;
                    } else {
                      if (lf.field_g > param5) {
                        break L3;
                      } else {
                        if (lf.field_g <= param0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var15 = -param7 + param4;
                    if (param6 != param7) {
                      L5: {
                        var11 = param2 << 1267305840;
                        var10 = param2 << 1267305840;
                        var16 = -param7 + param6;
                        var13 = (-param2 + param0 << 696865424) / var15;
                        var12 = (-param2 + param5 << 1517472624) / var16;
                        if (var13 > var12) {
                          var14 = 0;
                          break L5;
                        } else {
                          var14 = 1;
                          var17 = var12;
                          var12 = var13;
                          var13 = var17;
                          break L5;
                        }
                      }
                      L6: {
                        if (param7 < 0) {
                          if (0 > param6) {
                            param7 = -param7 + param6;
                            var11 = var11 + var13 * param7;
                            var10 = var10 + param7 * var12;
                            param7 = param6;
                            break L6;
                          } else {
                            param7 = -param7;
                            var11 = var11 + param7 * var13;
                            var10 = var10 + var12 * param7;
                            param7 = 0;
                            var17 = lf.field_c[param7];
                            L7: while (true) {
                              if (param6 <= param7) {
                                break L6;
                              } else {
                                L8: {
                                  var18 = var10 >> 1231345296;
                                  if (var18 >= lf.field_g) {
                                    break L8;
                                  } else {
                                    var19 = (var11 >> 564464912) - (var10 >> -2072930480);
                                    if (-1 != (var19 ^ -1)) {
                                      L9: {
                                        if (var19 + var18 < lf.field_g) {
                                          break L9;
                                        } else {
                                          var19 = -1 + lf.field_g - var18;
                                          break L9;
                                        }
                                      }
                                      if (0 > var18) {
                                        k.a(true, param3, var18 + var19, var17, param8);
                                        break L8;
                                      } else {
                                        k.a(true, param3, var19, var18 + var17, param8);
                                        break L8;
                                      }
                                    } else {
                                      if ((var18 ^ -1) > -1) {
                                        break L8;
                                      } else {
                                        if (var18 < lf.field_g) {
                                          k.a(true, param3, var19, var17 + var18, param8);
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                param7++;
                                if (lf.field_h > param7) {
                                  var17 = var17 + pb.field_c;
                                  var11 = var11 + var13;
                                  var10 = var10 + var12;
                                  continue L7;
                                } else {
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          var17 = lf.field_c[param7];
                          L10: while (true) {
                            if (param6 <= param7) {
                              break L6;
                            } else {
                              L11: {
                                var18 = var10 >> 1231345296;
                                if (var18 >= lf.field_g) {
                                  break L11;
                                } else {
                                  var19 = (var11 >> 564464912) - (var10 >> -2072930480);
                                  if (-1 != (var19 ^ -1)) {
                                    L12: {
                                      if (var19 + var18 < lf.field_g) {
                                        break L12;
                                      } else {
                                        var19 = -1 + lf.field_g - var18;
                                        break L12;
                                      }
                                    }
                                    if (0 > var18) {
                                      k.a(true, param3, var18 + var19, var17, param8);
                                      break L11;
                                    } else {
                                      k.a(true, param3, var19, var18 + var17, param8);
                                      break L11;
                                    }
                                  } else {
                                    if ((var18 ^ -1) > -1) {
                                      break L11;
                                    } else {
                                      if (var18 < lf.field_g) {
                                        k.a(true, param3, var19, var17 + var18, param8);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              param7++;
                              if (lf.field_h > param7) {
                                var17 = var17 + pb.field_c;
                                var11 = var11 + var13;
                                var10 = var10 + var12;
                                continue L10;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                      var17 = param4 - param6;
                      if (-1 != (var17 ^ -1)) {
                        L13: {
                          var18 = param0 << 1901343184;
                          if (var14 == 0) {
                            var10 = param5 << 1965706384;
                            break L13;
                          } else {
                            var11 = param5 << 1121623184;
                            break L13;
                          }
                        }
                        var13 = (var18 + -var11) / var17;
                        var12 = (-var10 + var18) / var17;
                        break L4;
                      } else {
                        var12 = 0;
                        var13 = 0;
                        break L4;
                      }
                    } else {
                      L14: {
                        if (param4 != param7) {
                          var16 = -param6 + param4;
                          if (param5 <= param2) {
                            var13 = (param0 + -param2 << -1520475472) / var15;
                            var12 = (param0 - param5 << -537537584) / var16;
                            var11 = param2 << 1741891920;
                            var10 = param5 << -1519884656;
                            break L14;
                          } else {
                            var11 = param5 << -38451312;
                            var10 = param2 << -1392061104;
                            var12 = (param0 + -param2 << -1303604016) / var15;
                            var13 = (-param5 + param0 << -601132720) / var16;
                            break L14;
                          }
                        } else {
                          var10 = param2 << -1203320208;
                          var13 = 0;
                          var11 = param5 << -1956048752;
                          var12 = 0;
                          break L14;
                        }
                      }
                      var14 = 0;
                      if ((param7 ^ -1) > -1) {
                        param7 = Math.min(-param7, param6 - param7);
                        var11 = var11 + var13 * param7;
                        var10 = var10 + var12 * param7;
                        param7 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L15: {
                    if (0 <= param7) {
                      break L15;
                    } else {
                      param7 = -param7;
                      var10 = var10 + param7 * var12;
                      var11 = var11 + var13 * param7;
                      param7 = 0;
                      break L15;
                    }
                  }
                  var16 = lf.field_c[param7];
                  L16: while (true) {
                    if (param4 <= param7) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var17 = var10 >> 1274736176;
                        if (lf.field_g <= var17) {
                          break L17;
                        } else {
                          var18 = -(var10 >> 2004680432) + (var11 >> -1547207632);
                          if (var18 != 0) {
                            L18: {
                              if (var17 - -var18 >= lf.field_g) {
                                var18 = -var17 + lf.field_g - 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if ((var17 ^ -1) > -1) {
                              k.a(true, param3, var17 + var18, var16, param8);
                              break L17;
                            } else {
                              k.a(true, param3, var18, var16 + var17, param8);
                              break L17;
                            }
                          } else {
                            if (var17 < 0) {
                              break L17;
                            } else {
                              if (var17 < lf.field_g) {
                                k.a(true, param3, var18, var16 + var17, param8);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      param7++;
                      if (param7 >= lf.field_h) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var10 = var10 + var12;
                        var16 = var16 + pb.field_c;
                        var11 = var11 + var13;
                        continue L16;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_89_0 = (RuntimeException) (var9);
            stackOut_89_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param3 == null) {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L19;
            } else {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L19;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_92_0), stackIn_92_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            hb.a(true);
        }
        field_g = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    hb() {
        this.field_a = new kd();
        this.field_a.field_o = this.field_a;
        this.field_a.field_v = this.field_a;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (pd.field_S == null) {
              break L1;
            } else {
              if (param1 > pd.field_S.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          pd.field_S = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (ok.field_d == null) {
              break L3;
            } else {
              if (ok.field_d.length < param1) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ok.field_d = new int[2 * param1];
          break L2;
        }
        L4: {
          L5: {
            if (null == jm.field_r) {
              break L5;
            } else {
              if (param1 > jm.field_r.length) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          jm.field_r = new int[2 * param1];
          break L4;
        }
        L6: {
          L7: {
            if (null == ne.field_G) {
              break L7;
            } else {
              if (ne.field_G.length >= param1) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          ne.field_G = new int[param1 * 2];
          break L6;
        }
        L8: {
          if (param0 < -118) {
            break L8;
          } else {
            field_j = (wk[]) null;
            break L8;
          }
        }
        L9: {
          L10: {
            if (mb.field_T == null) {
              break L10;
            } else {
              if (mb.field_T.length < param1) {
                break L10;
              } else {
                break L9;
              }
            }
          }
          mb.field_T = new int[2 * param1];
          break L9;
        }
        L11: {
          L12: {
            if (null == eb.field_u) {
              break L12;
            } else {
              if (param1 <= eb.field_u.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          eb.field_u = new int[2 * param1];
          break L11;
        }
        L13: {
          L14: {
            if (un.field_j == null) {
              break L14;
            } else {
              if (param2 + param1 <= un.field_j.length) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          un.field_j = new int[(param2 + param1) * 2];
          break L13;
        }
        L15: {
          L16: {
            if (null == vd.field_g) {
              break L16;
            } else {
              if (vd.field_g.length >= param1) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          vd.field_g = new boolean[param1 * 2];
          break L15;
        }
        k.field_Lb = -2147483648;
        nj.field_S = 2147483647;
        kc.field_z = 0;
        ti.field_w = 2147483647;
        mj.field_cc = -2147483648;
    }

    final static void a(byte param0, wk[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var23 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if ((param2 ^ -1) >= -1) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param1[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param1[3].field_z;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param1[5] != null) {
                        stackOut_12_0 = param1[5].field_z;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param1[1] != null) {
                        stackOut_15_0 = param1[1].field_B;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param1[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param1[7].field_B;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var11 = -128 % ((param0 - -4) / 41);
                      var10 = param2 + param4;
                      var12 = param3 + param5;
                      var13 = param4 - -var6_int;
                      var14 = var10 - var7;
                      var15 = var8 + param3;
                      var16 = -var9 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var18 < var17) {
                        var18 = param4 + param2 * var6_int / (var6_int + var7);
                        var17 = param4 + param2 * var6_int / (var6_int + var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      pb.b(me.field_g);
                      if (var19 > var20) {
                        var20 = var8 * param5 / (var8 + var9) + param3;
                        var19 = var8 * param5 / (var8 + var9) + param3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param1[0] != null) {
                        pb.h(param4, param3, var17, var19);
                        param1[0].a(param4, param3);
                        pb.a(me.field_g);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param1[2] == null) {
                        break L9;
                      } else {
                        pb.h(var18, param3, var10, var19);
                        param1[2].a(var14, param3);
                        pb.a(me.field_g);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] != null) {
                        pb.h(param4, var20, var17, var12);
                        param1[6].a(param4, var16);
                        pb.a(me.field_g);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[8] != null) {
                        pb.h(var18, var20, var10, var12);
                        param1[8].a(var14, var16);
                        pb.a(me.field_g);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param1[1] == null) {
                        break L12;
                      } else {
                        if (0 == param1[1].field_z) {
                          break L12;
                        } else {
                          pb.h(var17, param3, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var21 >= var14) {
                              pb.a(me.field_g);
                              break L12;
                            } else {
                              param1[1].a(var21, param3);
                              var21 = var21 + param1[1].field_z;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param1[7]) {
                        break L14;
                      } else {
                        if (param1[7].field_z != 0) {
                          pb.h(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var21 >= var14) {
                              pb.a(me.field_g);
                              break L14;
                            } else {
                              param1[7].a(var21, var16);
                              var21 = var21 + param1[7].field_z;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param1[3] == null) {
                        break L16;
                      } else {
                        if (0 != param1[3].field_B) {
                          pb.h(param4, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var16 <= var21) {
                              pb.a(me.field_g);
                              break L16;
                            } else {
                              param1[3].a(param4, var21);
                              var21 = var21 + param1[3].field_B;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param1[5]) {
                        break L18;
                      } else {
                        if (0 == param1[5].field_B) {
                          break L18;
                        } else {
                          pb.h(var18, var19, var10, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var16 <= var21) {
                              pb.a(me.field_g);
                              break L18;
                            } else {
                              param1[5].a(var14, var21);
                              var21 = var21 + param1[5].field_B;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param1[4]) {
                        break L20;
                      } else {
                        if (param1[4].field_z == 0) {
                          break L20;
                        } else {
                          if (param1[4].field_B != 0) {
                            pb.h(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var16 <= var21) {
                                pb.a(me.field_g);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param1[4].field_B;
                                    continue L21;
                                  } else {
                                    param1[4].a(var22, var21);
                                    var22 = var22 + param1[4].field_z;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var6);
            stackOut_74_1 = new StringBuilder().append("hb.C(").append(param0).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        field_f = false;
        field_d = -1;
        field_h = "Rankings";
        field_g = new String[]{"Hold <img=26> and drag to move the camera.<br>'A','S','D' control walking.<br>'W' jump.", "'W','A','S','D' move the camera.<br>'Z','X','C' control walking.<br><img=26> or  'SHIFT'+<img=25> jump."};
    }
}
