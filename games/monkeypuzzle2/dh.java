/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static cd field_d;
    static volatile int field_b;
    static int field_c;
    static String field_a;

    final static am a(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_5_0 = null;
        am stackIn_9_0 = null;
        am stackIn_19_0 = null;
        am stackIn_23_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 > 40) {
                break L1;
              } else {
                field_b = 88;
                break L1;
              }
            }
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -64) {
                stackIn_9_0 = wk.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 == 45) {
                        L4: {
                          if (0 == var3) {
                            break L4;
                          } else {
                            if (var2_int + -1 != var3) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackIn_19_0 = lh.field_c;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((fb.field_i.indexOf(var4) ^ -1) == 0) {
                          stackIn_23_0 = lh.field_c;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_5_0 = si.field_s;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("dh.C(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        kd.field_a = null;
        ii.field_T = 0;
        pg.field_a = null;
        if (!param0) {
            field_a = (String) null;
            var2 = oh.field_c;
            oh.field_c = pi.field_o;
            if ((param1 ^ -1) == -52) {
                lg.field_n.field_a = 2;
                pi.field_o = var2;
                lg.field_n.field_b = lg.field_n.field_b + 1;
                if (-3 < (lg.field_n.field_b ^ -1)) {
                    if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                        return 5;
                    }
                    if (!(-5 < (lg.field_n.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(51 != param1)) {
                    return 2;
                }
                if (lg.field_n.field_b < 2) {
                    if (!(-5 < (lg.field_n.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if ((param1 ^ -1) == -51) {
                    return 5;
                }
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (50 != param1) {
                lg.field_n.field_a = 1;
                pi.field_o = var2;
                lg.field_n.field_b = lg.field_n.field_b + 1;
                if (-3 < (lg.field_n.field_b ^ -1)) {
                    if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                        return 5;
                    }
                    if (!(-5 < (lg.field_n.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(51 != param1)) {
                    return 2;
                }
                if (lg.field_n.field_b < 2) {
                    if (!(-5 < (lg.field_n.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if ((param1 ^ -1) == -51) {
                    return 5;
                }
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            lg.field_n.field_a = 5;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (-3 < (lg.field_n.field_b ^ -1)) {
                if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                    return 5;
                }
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (!(51 != param1)) {
                return 2;
            }
            if (lg.field_n.field_b < 2) {
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if ((param1 ^ -1) == -51) {
                return 5;
            }
            if (!(-5 < (lg.field_n.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        var2 = oh.field_c;
        oh.field_c = pi.field_o;
        if ((param1 ^ -1) == -52) {
            lg.field_n.field_a = 2;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (-3 >= (lg.field_n.field_b ^ -1)) {
                if (51 == param1) {
                    return 2;
                }
                if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                    return 5;
                }
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                return 5;
            }
            if (!(-5 < (lg.field_n.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        if (50 != param1) {
            lg.field_n.field_a = 1;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (-3 >= (lg.field_n.field_b ^ -1)) {
                if (51 == param1) {
                    return 2;
                }
                if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                    return 5;
                }
                if (!(-5 < (lg.field_n.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                return 5;
            }
            if (!(-5 < (lg.field_n.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        lg.field_n.field_a = 5;
        pi.field_o = var2;
        lg.field_n.field_b = lg.field_n.field_b + 1;
        if (-3 >= (lg.field_n.field_b ^ -1)) {
            if (51 == param1) {
                return 2;
            }
            if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
                return 5;
            }
            if (!(-5 < (lg.field_n.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        if (lg.field_n.field_b >= 2 && (param1 ^ -1) == -51) {
            return 5;
        }
        if (!(-5 < (lg.field_n.field_b ^ -1))) {
            return 1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -14955) {
            dh.a(-41);
        }
    }

    static {
        field_b = -1;
        field_a = "Suggested names: ";
        field_d = new cd("usename");
    }
}
