/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static int[] field_c;
    static int[] field_a;
    static boolean field_b;

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_a = null;
              if (param0 == 255) {
                break L1;
              } else {
                ck.b(97);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "ck.B(" + param0 + ')');
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
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        String stackOut_26_0 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
                if (bb.field_i > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (bb.field_i <= var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & id.field_b.field_m[var2];
                      var4 = var3 >> 1509718020;
                      stackOut_6_0 = -11;
                      stackOut_6_1 = ~var4;
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
                            var1_ref = var1_ref + (char)var4;
                            if (10 <= var3) {
                              break L7;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 55;
                          break L6;
                        }
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
              stackOut_22_1 = -13299;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            L8: {
              if (stackIn_23_0 == stackIn_23_1) {
                break L8;
              } else {
                String discarded$1 = ck.a(-82);
                break L8;
              }
            }
            stackOut_26_0 = (String) var1_ref;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "ck.A(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{20, 0, 0, 10, 0, 0, 0, 0, 0, 0};
        field_c = new int[4];
    }
}
