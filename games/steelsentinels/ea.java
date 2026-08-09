/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ea {
    static boolean field_k;
    int field_i;
    int field_j;
    static wk[] field_m;
    static gk[] field_b;
    static gh field_f;
    int field_g;
    static String field_e;
    static ul field_c;
    int field_n;
    static int field_h;
    int field_d;
    int field_a;
    static gh field_l;

    abstract void a(int param0, int param1, int param2);

    public static void a(byte param0) {
        if (param0 < 55) {
            return;
        }
        field_m = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_l = null;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (param1.equals("I")) {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.equals("S")) {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param1.equals("J")) {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param1.equals("D")) {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L1: {
                            if (param0 == 10126) {
                              break L1;
                            } else {
                              field_l = (gh) null;
                              break L1;
                            }
                          }
                          if (!param1.equals("C")) {
                            stackIn_31_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("ea.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    abstract void a(int param0, int param1);

    final static na a(int param0, int param1, int param2, int param3) {
        int stackIn_41_0 = 0;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        na var8_ref_na;
        int var9;
        na var9_ref_na;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        var13 = SteelSentinels.field_G;
        sn.field_j.field_Ub.field_M.g(6);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = uc.field_a - 1;
        L0: while (true) {
          if (0 > var7) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= uc.field_a) {
                L2: {
                  var8 = sn.field_j.field_Ub.field_lb + sn.field_j.field_Ub.field_Lb - (-var6 + var7);
                  sn.field_j.field_Ub.field_Lb = sn.field_j.field_Ub.field_Lb - var8;
                  sn.field_j.field_Ub.field_eb = sn.field_j.field_Ub.field_eb + var8;
                  if (cn.field_l) {
                    sn.field_j.field_Ub.field_Lb = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!cn.field_l) {
                    break L3;
                  } else {
                    rg.field_f = true;
                    sn.field_j.field_Ub.field_eb = -sn.field_j.field_Ub.field_Lb + sn.field_j.field_Tb.field_Lb;
                    sn.field_j.field_Ub.field_gb = 0;
                    cn.field_l = false;
                    break L3;
                  }
                }
                sn.field_j.field_Ub.field_lb = -sn.field_j.field_Ub.field_Lb + var7;
                if (param2 > 0) {
                  L4: {
                    if (!jn.field_g) {
                      break L4;
                    } else {
                      if (hh.field_a == null) {
                        break L4;
                      } else {
                        rg.field_f = true;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = sn.field_j.field_Tb.field_Lb - (sn.field_j.field_Ub.field_Lb - -sn.field_j.field_Ub.field_lb);
                    if (!rg.field_f) {
                      break L5;
                    } else {
                      sn.field_j.field_Ub.field_gb = -sn.field_j.field_Ub.field_eb + var9;
                      break L5;
                    }
                  }
                  L6: {
                    sn.field_j.a(true, 8113, param3, param0 * 2 * param3);
                    if (var9 != sn.field_j.field_Ub.field_eb + sn.field_j.field_Ub.field_gb) {
                      stackIn_41_0 = 0;
                      break L6;
                    } else {
                      stackIn_41_0 = 1;
                      break L6;
                    }
                  }
                  rg.field_f = stackIn_41_0 != 0;
                  return (na) (var4);
                } else {
                  return (na) null;
                }
              } else {
                var9_ref_na = ph.field_e[var8];
                if (null != var9_ref_na.field_m) {
                  sn.field_j.field_Ub.a(var9_ref_na.field_m, 127);
                  var9_ref_na.field_m.a(0, var7, param3, param1, var9_ref_na.field_m.g(-2147483648));
                  var7 = var7 + param3;
                  if (var9_ref_na.field_m.field_Eb != 0) {
                    var4 = var9_ref_na;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L7: {
              var8_ref_na = ph.field_e[var7];
              var9 = 0;
              if (fj.field_e) {
                break L7;
              } else {
                if (var5 >= cj.field_h) {
                  break L7;
                } else {
                  var10_int = ei.a(var8_ref_na.field_k, 1);
                  if (var8_ref_na.a((byte) 58) >= var10_int) {
                    L8: {
                      if (var8_ref_na.field_g) {
                        break L8;
                      } else {
                        if (!o.a(-99, var8_ref_na.field_p)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_na.field_m = null;
              var7--;
              continue L0;
            } else {
              L9: {
                var5++;
                if (var8_ref_na.field_m == null) {
                  break L9;
                } else {
                  if (cn.field_l) {
                    break L9;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (var8_ref_na.field_m != null) {
                  break L10;
                } else {
                  ln.field_e = ln.field_e + 1;
                  break L10;
                }
              }
              var10 = nk.a(-118, var8_ref_na);
              var11 = var10 + mi.a(var8_ref_na.field_o);
              var12 = rf.a(-102, var8_ref_na);
              var8_ref_na.field_m = new gh(0L, td.field_ic, var11);
              var8_ref_na.field_m.field_xb = (8355711 & td.field_ic.field_xb >> 1728986241) + -(8355711 & var12 >> -24950719) + var12;
              var8_ref_na.field_m.field_L = pl.field_X;
              var8_ref_na.field_m.field_nb = var12;
              var8_ref_na.field_m.field_rb = ((td.field_ic.field_rb & 16711422) >> -718646335) + (-((16711422 & var12) >> 946727041) + var12);
              var6 = var6 + param3;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(cm param0, int param1) {
        uk var2 = null;
        try {
            uk.b(param0.a("", -742, "headers.packvorbis"));
            if (param1 != 1728986241) {
                field_c = (ul) null;
            }
            var2 = uk.a(param0, "jagex logo2.packvorbis", "");
            var2.a();
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Sentinels Expansion";
    }
}
