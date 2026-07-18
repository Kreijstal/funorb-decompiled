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
        ma stackIn_7_0 = null;
        ma stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ma stackIn_25_0 = null;
        ma stackIn_38_0 = null;
        ma stackIn_42_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_6_0 = null;
        ma stackOut_41_0 = null;
        ma stackOut_37_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ma stackOut_24_0 = null;
        ma stackOut_10_0 = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (64 < var2_int) {
              stackOut_6_0 = er.field_f;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2_int) {
                    L1: {
                      var5 = param1.charAt(var4);
                      if (46 != var5) {
                        if (cd.field_Kb.indexOf(var5) != -1) {
                          var3 = 0;
                          break L1;
                        } else {
                          stackOut_41_0 = so.field_t;
                          stackIn_42_0 = stackOut_41_0;
                          return stackIn_42_0;
                        }
                      } else {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (var2_int - 1 == var4) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                var3 = 1;
                                break L1;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = so.field_t;
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
                if (param1.charAt(var2_int + -1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var4 < -1 + var2_int) {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_24_0 = so.field_t;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0;
                              } else {
                                break L6;
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
                  stackOut_10_0 = so.field_t;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
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
          L7: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("sb.V(").append(32351).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
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
