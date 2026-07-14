/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static long field_a;
    static rh field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 <= -67) {
          L0: {
            var3 = bj.a(32, param1);
            if ((param0.indexOf(param1) ^ -1) != 0) {
              break L0;
            } else {
              if (-1 != param0.indexOf(var3)) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param0.startsWith(param1)) {
                      break L2;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param0.endsWith(param1)) {
                          break L2;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
                return stackIn_13_0 != 0;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        if (param0 != -30635) {
            field_b = null;
        }
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.length()) {
            if (param1 < -33) {
              return false;
            } else {
              field_a = -33L;
              return false;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!em.a((char) var3, 97)) {
              if (!rc.a(-58, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static od[] a(boolean param0) {
        if (param0) {
            od[] discarded$0 = ak.a(false);
        }
        return new od[]{mb.field_b, rl.field_W, td.field_I};
    }

    static {
    }
}
