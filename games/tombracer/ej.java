/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static jta field_a;
    static fp field_c;
    static String field_b;
    static uca[] field_d;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          boolean discarded$2 = ej.a(false, false, (CharSequence) null);
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
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
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
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
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
                                if (~param2.length() >= ~var6) {
                                  if (var5 <= 0) {
                                    stackOut_35_0 = 1;
                                    stackIn_36_0 = stackOut_35_0;
                                    break L0;
                                  } else {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    return stackIn_34_0 != 0;
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
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param1) {
                                        break L6;
                                      } else {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        return stackIn_30_0 != 0;
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
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("ej.B(").append(param0).append(44).append(param1).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
        return stackIn_36_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Close";
        field_c = new fp();
    }
}
