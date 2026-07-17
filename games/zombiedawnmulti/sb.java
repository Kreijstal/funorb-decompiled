/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    int field_j;
    int field_h;
    int field_a;
    static ip field_i;
    int field_b;
    static String field_g;
    static String field_k;
    static int field_c;
    int field_e;
    int field_f;
    static String field_d;

    final static ma a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        ma stackIn_27_0 = null;
        ma stackIn_40_0 = null;
        ma stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_8_0 = null;
        ma stackOut_43_0 = null;
        ma stackOut_39_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        ma stackOut_26_0 = null;
        ma stackOut_12_0 = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            L0: {
              if (param0 == 32351) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
            if (64 < var2_int) {
              stackOut_8_0 = er.field_f;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L1: while (true) {
                  if (var4 < var2_int) {
                    L2: {
                      var5 = param1.charAt(var4);
                      if (46 != var5) {
                        if (cd.field_Kb.indexOf(var5) != -1) {
                          var3 = 0;
                          break L2;
                        } else {
                          stackOut_43_0 = so.field_t;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        }
                      } else {
                        L3: {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            if (var2_int - 1 == var4) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                var3 = 1;
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = so.field_t;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param1.charAt(var2_int + -1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L4: while (true) {
                    if (var4 < -1 + var2_int) {
                      L5: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L6: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L6;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L6;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L5;
                        } else {
                          L7: {
                            if (var5 != 34) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = so.field_t;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0;
                              } else {
                                break L7;
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
                  stackOut_12_0 = so.field_t;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
          } else {
            stackOut_2_0 = jo.field_e;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("sb.V(").append(param0).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_k = null;
        int var1 = 2;
        field_i = null;
    }

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Add <%0> to ignore list";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_i = new ip();
    }
}
