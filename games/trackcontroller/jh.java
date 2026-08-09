/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static int field_a;

    final static void a(int param0) {
        lb.field_O = le.a(-1461);
        if (param0 >= -54) {
            return;
        }
        gl.field_E = new vl();
        nk.a(true, 41, true);
    }

    final static int a(oh param0, String param1, int param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!param3) {
                break L1;
              } else {
                jh.a(91);
                break L1;
              }
            }
            var5 = 0;
            var6 = param1.length();
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                L3: {
                  if (var4_int >= var5) {
                    break L3;
                  } else {
                    var4_int = var5;
                    break L3;
                  }
                }
                stackIn_23_0 = var4_int;
                break L0;
              } else {
                L4: {
                  var8 = param1.charAt(var7);
                  var5 = var5 + param0.a((char) var8);
                  if ((param2 ^ -1) >= (var5 ^ -1)) {
                    L5: {
                      if (var8 == 32) {
                        var5 = var5 - param0.a((char) var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var8 == 32) {
                        break L6;
                      } else {
                        if (var8 == 45) {
                          break L6;
                        } else {
                          var7++;
                          continue L2;
                        }
                      }
                    }
                    L7: {
                      if (var4_int < var5) {
                        var4_int = var5;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var5 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("jh.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0;
    }

    static {
    }
}
