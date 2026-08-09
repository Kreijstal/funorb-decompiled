/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (rh.field_f != null) {
          var1 = rh.field_f;
          synchronized (var1) {
            L0: {
              rh.field_f = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              fm.a(14);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              fm.a(14);
              break L2;
            }
          }
          return;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param1.length()) {
                    break L3;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackIn_11_0 = ak.a((char) var3, (byte) 67);

                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_11_0) {
                          break L4;
                        } else {
                          if (!em.a((byte) -65, (char) var3)) {
                            stackIn_8_0 = 1;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_11_0 = param0;
                break L2;
              }
              if (stackIn_11_0) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("fm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    static {
    }
}
