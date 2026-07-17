/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static int field_a;

    final static void a() {
        int discarded$0 = -1461;
        lb.field_O = le.a();
        gl.field_E = new vl();
        nk.a(true, 41, true);
    }

    final static int a(oh param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = param1.length();
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  if (var4_int >= var5) {
                    break L2;
                  } else {
                    var4_int = var5;
                    break L2;
                  }
                }
                stackOut_19_0 = var4_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  var8 = param1.charAt(var7);
                  var5 = var5 + param0.a((char) var8);
                  if (param2 <= var5) {
                    L4: {
                      if (var8 == 32) {
                        var5 = var5 - param0.a((char) var8);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (var8 == 32) {
                      L5: {
                        if (var4_int < var5) {
                          var4_int = var5;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var5 = 0;
                      break L3;
                    } else {
                      L6: {
                        if (var8 != 45) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L1;
                    }
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("jh.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_20_0;
    }

    static {
    }
}
