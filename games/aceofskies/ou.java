/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ou extends wt {
    static char[] field_n;

    ou() {
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
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
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1.length();
              if (-2 < (var3_int ^ -1)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var3_int ^ -1) >= -13) {
                  L1: {
                    var4 = vu.a(127, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 > var4.length()) {
                        break L1;
                      } else {
                        L2: {
                          if (za.a((byte) 117, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                              break L2;
                            } else {
                              if (param0 == 19069) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (0 < var5) {
                                      stackIn_36_0 = 0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L4: {
                                      var7 = param1.charAt(var6);
                                      if (za.a((byte) 117, (char) var7)) {
                                        var5++;
                                        break L4;
                                      } else {
                                        var5 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L5;
                                      } else {
                                        if (param2) {
                                          break L5;
                                        } else {
                                          stackIn_31_0 = 0;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L3;
                                  }
                                }
                              } else {
                                stackIn_22_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("ou.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L6;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0 != 0;
                  } else {
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_n = null;
        if (param0 != 108) {
            field_n = (char[]) null;
        }
    }

    static {
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
