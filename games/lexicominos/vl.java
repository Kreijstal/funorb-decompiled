/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static ab field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 < 72) {
            return;
        }
        field_a = null;
    }

    final static long b(int param0) {
        if (param0 >= -86) {
            return rf.c(0) - ta.field_e;
        }
        return rf.c(0) - ta.field_e;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        CharSequence var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_29_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 != param0) {
                var4_int = param0 + param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L2: while (true) {
                      L3: {
                        if (var7 >= var4_int) {
                          if (param3 <= -67) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          var8 = param1[var7];
                          if (var9 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (var8 != null) {
                                discarded$3 = var6.append(var8);
                                break L4;
                              } else {
                                discarded$4 = var6.append("null");
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  discarded$5 = var6.append(var8);
                                  break L4;
                                }
                              }
                            }
                            var7++;
                            continue L2;
                          }
                        }
                      }
                      stackOut_29_0 = var6.toString();
                      stackIn_30_0 = stackOut_29_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    L5: {
                      L6: {
                        var7_ref_CharSequence = param1[var6_int];
                        if (var7_ref_CharSequence != null) {
                          break L6;
                        } else {
                          var5 += 4;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = var5 + var7_ref_CharSequence.length();
                      break L5;
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              } else {
                var10 = param1[param2];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_9_0 = var10.toString();
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_30_0;
            }
          }
        }
    }

    static {
    }
}
