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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        am stackIn_3_0 = null;
        am stackIn_6_0 = null;
        am stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        am stackIn_23_0 = null;
        am stackIn_37_0 = null;
        am stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am stackOut_36_0 = null;
        am stackOut_41_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        am stackOut_22_0 = null;
        am stackOut_9_0 = null;
        am stackOut_5_0 = null;
        am stackOut_2_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
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
                        L3: {
                          var5 = param0.charAt(var4);
                          if (var5 != 46) {
                            break L3;
                          } else {
                            L4: {
                              if (-1 == (var4 ^ -1)) {
                                break L4;
                              } else {
                                if (var4 == var2_int + -1) {
                                  break L4;
                                } else {
                                  if (var3 == 0) {
                                    var3 = 1;
                                    if (var6 == 0) {
                                      break L2;
                                    } else {
                                      break L3;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            stackOut_36_0 = lh.field_c;
                            stackIn_37_0 = stackOut_36_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                        if (-1 == qd.field_b.indexOf(var5)) {
                          stackOut_41_0 = lh.field_c;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          var3 = 0;
                          break L2;
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
                    L5: while (true) {
                      if (var4 < -1 + var2_int) {
                        L6: {
                          L7: {
                            var5 = param0.charAt(var4);
                            if (var5 == 92) {
                              L8: {
                                if (var3 != 0) {
                                  stackOut_18_0 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  break L8;
                                } else {
                                  stackOut_17_0 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  break L8;
                                }
                              }
                              var3 = stackIn_19_0;
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          L9: {
                            if (var5 != 34) {
                              break L9;
                            } else {
                              if (var3 != 0) {
                                break L9;
                              } else {
                                stackOut_22_0 = lh.field_c;
                                stackIn_23_0 = stackOut_22_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var3 = 0;
                          break L6;
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_9_0 = lh.field_c;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = wk.field_f;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = si.field_s;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var2);
            stackOut_47_1 = new StringBuilder().append("dd.B(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
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
                  return stackIn_37_0;
                } else {
                  return stackIn_42_0;
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
