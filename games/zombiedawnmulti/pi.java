/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_c;
    int field_d;
    static String field_b;
    static ri field_f;
    static String field_h;
    static String field_e;
    static int field_i;
    static String field_g;
    static ip field_a;

    pi(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 != -19162) {
          field_b = (String) null;
          field_f = null;
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int[] param4, int param5, int param6, int param7) {
        if (!param3) {
            return;
        }
        try {
            int[] var9 = (int[]) null;
            vk.a((int[]) null, param1, param6, param2, (byte) -117, param4, param5, param7, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, ic param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              mj.field_Fb[0] = c.field_c.nextInt();
              mj.field_Fb[1] = c.field_c.nextInt();
              mj.field_Fb[2] = (int)(nm.field_c >> 1948345184);
              mj.field_Fb[3] = (int)nm.field_c;
              pm.field_R.field_j = 0;
              pm.field_R.b(33, mj.field_Fb[0]);
              pm.field_R.b(param0 ^ 84, mj.field_Fb[1]);
              pm.field_R.b(-111, mj.field_Fb[2]);
              pm.field_R.b(param0 ^ 88, mj.field_Fb[3]);
              jq.a(pm.field_R, 13746);
              pm.field_R.a(param4, (byte) -54);
              if (param0 == -59) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param3.a(pm.field_R, -1);
                ma.field_a.field_j = 0;
                if (!param2) {
                  break L3;
                } else {
                  ma.field_a.a(-102, 18);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ma.field_a.a(param0 ^ -68, 16);
              break L2;
            }
            L4: {
              ma.field_a.field_j = ma.field_a.field_j + 2;
              var5_int = ma.field_a.field_j;
              ma.field_a.b(95, v.field_f);
              ma.field_a.a(qa.field_i, true);
              var6 = 0;
              if (cm.field_e) {
                var6 = var6 | 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!gj.field_e) {
                break L5;
              } else {
                var6 = var6 | 4;
                break L5;
              }
            }
            L6: {
              if (!param1) {
                break L6;
              } else {
                var6 = var6 | 8;
                break L6;
              }
            }
            L7: {
              if (null != oe.field_f) {
                var6 = var6 | 16;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              ma.field_a.a(-81, var6);
              var7 = wg.a(0, jl.b(0));
              if (var7 == null) {
                var7 = "";
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              ma.field_a.a(var7, (byte) 105);
              if (null != oe.field_f) {
                ma.field_a.b(-16171, oe.field_f);
                break L9;
              } else {
                break L9;
              }
            }
            hd.a(gn.field_L, (byte) -122, tp.field_v, pm.field_R, ma.field_a);
            ma.field_a.b(false, -var5_int + ma.field_a.field_j);
            cb.a(-1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= oo.field_f) {
                break L1;
              } else {
                param3 = param3 - (oo.field_f - param1);
                param1 = oo.field_f;
                break L1;
              }
            }
            L2: {
              if (oo.field_e > param5) {
                param4 = param4 - (-param5 + oo.field_e);
                param5 = oo.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (oo.field_g >= param1 + param3) {
                break L3;
              } else {
                param3 = oo.field_g - param1;
                break L3;
              }
            }
            if (param0 <= -88) {
              L4: {
                if (oo.field_d < param4 + param5) {
                  param4 = oo.field_d + -param5;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if ((param3 ^ -1) >= -1) {
                  break L5;
                } else {
                  if (-1 > (param4 ^ -1)) {
                    var6_int = oo.field_b * param5 + param1;
                    var7 = oo.field_b + -param3;
                    param5 = -param4;
                    L6: while (true) {
                      if (param5 >= 0) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (var12 == 0) {
                          param1 = -param3;
                          L7: while (true) {
                            L8: {
                              if (param1 >= 0) {
                                stackOut_31_0 = var6_int;
                                stackOut_31_1 = var7;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                break L8;
                              } else {
                                var8 = oo.field_i[var6_int];
                                stackOut_23_0 = 255 & var8 >> -191798296;
                                stackOut_23_1 = param2;
                                stackIn_32_0 = stackOut_23_0;
                                stackIn_32_1 = stackOut_23_1;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (var12 != 0) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (stackIn_24_0 <= stackIn_24_1) {
                                      break L9;
                                    } else {
                                      if ((255 & var8 >> -1579167280) > (var8 & 65280) >> -194018744) {
                                        break L9;
                                      } else {
                                        L10: {
                                          var9 = ((16711680 & var8) >> 1703656975) - 60;
                                          if (var9 > 255) {
                                            var9 = 255;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var10 = 65280 & var8;
                                        var10 = -(var10 >> 1524593221) + (var10 >> -1951905311) & 65280;
                                        var11 = 31 & var8 >> -656512189;
                                        oo.field_i[var6_int] = cr.b(cr.b(var9 << -46440176, var10), var11);
                                        break L9;
                                      }
                                    }
                                  }
                                  var6_int++;
                                  param1++;
                                  continue L7;
                                }
                              }
                            }
                            var6_int = stackIn_32_0 + stackIn_32_1;
                            param5++;
                            continue L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    break L5;
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
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "pi.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        field_c = "Offline";
        field_h = "Traits affect your zombies for the entire match. Drag GREEN (square) research here to apply it.";
        field_b = "Return to lobby";
        field_g = "Suggested names: ";
        field_e = "Message game";
        field_a = new ip();
    }
}
