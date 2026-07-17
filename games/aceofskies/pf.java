/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends mi {
    int field_B;
    static int[] field_A;
    int field_x;
    private int field_y;
    static int field_z;
    private ot field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L1: {
                var8_int = -((pf) this).field_B + (param2 - param1);
                var9 = ((pf) this).field_q + -(2 * ((pf) this).field_B);
                if (~var9 > ~var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((pf) this).field_y / var9;
                if (param3 != 1) {
                  if (param3 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (~((pf) this).field_w.a((byte) 123) >= ~var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((pf) this).field_w.a(var11, (byte) -58);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + ((pf) this).field_w.b(var12, 1);
                          var13 = var13 * var13;
                          if (~var13 > ~var10) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((pf) this).field_w.a((byte) -50, var8_int);
                  break L3;
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("pf.O(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param6 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final int c(boolean param0) {
        if (!param0) {
            return 16;
        }
        return ((pf) this).field_w.a((byte) -114);
    }

    final int a(int param0) {
        if (param0 != -3) {
            return -123;
        }
        return ((pf) this).field_y;
    }

    final int a(boolean param0, int param1) {
        if (param1 >= 0) {
          if (((pf) this).field_w.a((byte) -32) > param1) {
            if (param0) {
              return -3;
            } else {
              return ((pf) this).field_w.b(param1, 1);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private pf() throws Throwable {
        throw new Error();
    }

    public static void b(boolean param0) {
        field_A = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
