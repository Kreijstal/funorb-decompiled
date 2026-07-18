/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds extends wf {
    byte[] field_f;
    int field_g;
    static eo field_e;

    public static void a() {
        field_e = null;
    }

    private ds() throws Throwable {
        throw new Error();
    }

    final static w a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        w stackIn_4_0 = null;
        w stackIn_8_0 = null;
        w stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        w stackIn_25_0 = null;
        w stackIn_38_0 = null;
        w stackIn_43_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_3_0 = null;
        w stackOut_7_0 = null;
        w stackOut_42_0 = null;
        w stackOut_37_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        w stackOut_24_0 = null;
        w stackOut_11_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = nh.field_f;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (64 < var2_int) {
              stackOut_7_0 = ei.field_d;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2_int) {
                    L1: {
                      var5 = param1.charAt(var4);
                      if (var5 != 46) {
                        if (-1 == ph.field_f.indexOf(var5)) {
                          stackOut_42_0 = td.field_d;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      } else {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (var4 == var2_int - 1) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = td.field_d;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (34 == param1.charAt(var2_int - 1)) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var4 < var2_int + -1) {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L5;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_21_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_24_0 = td.field_d;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = td.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var2;
            stackOut_47_1 = new StringBuilder().append("ds.B(").append(false).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L7;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new eo(2);
    }
}
