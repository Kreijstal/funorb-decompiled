/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static jta field_a;
    static fp field_c;
    static String field_b;
    static uca[] field_d;

    public static void a(int param0) {
        CharSequence var2;
        if (param0 != -1) {
          var2 = (CharSequence) null;
          ej.a(false, false, (CharSequence) null);
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        ej.a(-107);
                        break L2;
                      }
                    }
                    var4 = jd.a(1, param2);
                    if (var4 == null) {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if ((var4.length() ^ -1) <= -2) {
                        L3: {
                          if (hf.a(-62, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (hf.a(114, var4.charAt(-1 + var4.length()))) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param2.length() <= var6) {
                                  if (-1 <= (var5 ^ -1)) {
                                    stackIn_36_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_34_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param2.charAt(var6);
                                    if (!hf.a(-73, (char) var7)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if ((var5 ^ -1) > -3) {
                                      break L6;
                                    } else {
                                      if (param1) {
                                        break L6;
                                      } else {
                                        stackIn_30_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Close";
        field_c = new fp();
    }
}
