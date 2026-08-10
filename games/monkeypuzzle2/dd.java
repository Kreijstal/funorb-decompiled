/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends RuntimeException {
    static int field_d;
    Throwable field_b;
    String field_c;
    static String field_a;
    static int field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 74 / ((-51 - param0) / 54);
    }

    dd(Throwable param0, String param1) {
        this.field_c = param1;
        this.field_b = param0;
    }

    final static am a(String param0, boolean param1) {
        am stackIn_3_0 = null;
        am stackIn_6_0 = null;
        am stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        am stackIn_23_0 = null;
        am stackIn_36_0 = null;
        am stackIn_41_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 != var2_int) {
              if (-65 <= (var2_int ^ -1)) {
                if (34 != param0.charAt(0)) {
                  var3 = param1 ? 1 : 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int > var4) {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (-1 == qd.field_b.indexOf(var5)) {
                            stackIn_41_0 = lh.field_c;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L2;
                          }
                        } else {
                          L3: {
                            if (-1 == (var4 ^ -1)) {
                              break L3;
                            } else {
                              if (var4 == var2_int + -1) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_36_0 = lh.field_c;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (-35 == (param0.charAt(-1 + var2_int) ^ -1)) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var4 < -1 + var2_int) {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackIn_19_0 = 0;
                                break L6;
                              } else {
                                stackIn_19_0 = 1;
                                break L6;
                              }
                            }
                            var3 = stackIn_19_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  stackIn_23_0 = lh.field_c;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = lh.field_c;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = wk.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = si.field_s;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var2);

            stackIn_47_1 = new StringBuilder().append("dd.B(");

            if (param0 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L8;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0;
                } else {
                  return stackIn_41_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = 21;
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_e = 0;
    }
}
