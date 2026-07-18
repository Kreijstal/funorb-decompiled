/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;

    public static void a(byte param0) {
        try {
            field_a = null;
            if (param0 != 120) {
                String discarded$0 = kk.a(26);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kk.A(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        String stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + vua.field_B + " " + hla.field_xb + " " + ufa.field_c + ") " + oka.field_z;
                if (uca.field_d > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (uca.field_d <= var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = vc.field_q.field_g[var2] & 255;
                      var4 = var3 >> -1438821180;
                      stackOut_6_0 = var4;
                      stackOut_6_1 = 10;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_23_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 < stackIn_7_1) {
                              break L5;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 48;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var3 = var3 & 15;
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_22_0 = param0;
              stackOut_22_1 = 32;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            if (stackIn_23_0 == stackIn_23_1) {
              stackOut_26_0 = (String) var1_ref;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_24_0 = null;
              stackIn_25_0 = stackOut_24_0;
              return (String) (Object) stackIn_25_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "kk.B(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponents";
    }
}
