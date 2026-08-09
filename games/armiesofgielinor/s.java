/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static wk field_c;
    static at field_a;
    static at field_e;
    static int field_d;
    static String field_b;

    final static void a(int param0, int param1, on param2) {
        bv var3 = null;
        try {
            var3 = vl.field_n;
            var3.h(32161, param1);
            var3.b(1, 2);
            var3.b(1, 0);
            if (param0 <= 125) {
                field_b = (String) null;
            }
            var3.b(1, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "s.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param2 != 1) {
              if (2 == param2) {
                stackIn_6_0 = fo.a(4800, ea.field_d, new String[]{param1});
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-4 != (param2 ^ -1)) {
                  if ((param2 ^ -1) == -5) {
                    stackIn_13_0 = fo.a(4800, pp.field_X, new String[]{param1});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param2 != 5) {
                      if ((param2 ^ -1) == -7) {
                        stackIn_20_0 = fo.a(4800, di.field_j, new String[]{param1});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param2 == 7) {
                          stackIn_24_0 = fo.a(4800, bh.field_I, new String[]{param1});
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((param2 ^ -1) != -9) {
                            if (!param0) {
                              if (param2 != 11) {
                                if (-13 == (param2 ^ -1)) {
                                  stackIn_37_0 = fo.a(4800, cj.field_i, new String[]{param1});
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (param2 == 13) {
                                    stackIn_41_0 = fo.a(4800, cp.field_f, new String[]{param1});
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              } else {
                                stackIn_33_0 = fo.a(4800, ik.field_a, new String[]{param1});
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_30_0 = (String) null;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_27_0 = fo.a(4800, oc.field_Nb, new String[]{param1});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = fo.a(4800, ot.field_H, new String[]{param1});
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = fo.a(4800, m.field_b, new String[]{param1});
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = fo.a(4800, kf.field_B, new String[]{param1});
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("s.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L1;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
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
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_33_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_37_0;
                            } else {
                              return stackIn_41_0;
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

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        int var1 = -122 / ((param0 - -19) / 34);
        field_b = null;
    }

    static {
        field_a = new at();
        field_e = new at();
        field_b = "Achievements";
    }
}
