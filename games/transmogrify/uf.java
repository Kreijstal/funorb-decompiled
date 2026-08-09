/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        if (param1 <= -55) {
          if (param0 != 160) {
            if (32 != param0) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static q a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        int stackIn_11_0 = 0;
        q stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= var2_int) {
                    break L3;
                  } else {
                    var4 = param1.charAt(var3);
                    stackIn_11_0 = var4;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_11_0 >= 48) {
                        if (var4 <= 57) {
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackIn_8_0 = null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                }
                stackIn_11_0 = param0 ? 1 : 0;
                break L2;
              }
              L4: {
                if (stackIn_11_0 == 0) {
                  break L4;
                } else {
                  field_a = -121;
                  break L4;
                }
              }
              stackIn_14_0 = vc.field_N;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("uf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (q) ((Object) stackIn_8_0);
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 43) {
            field_a = 114;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -76) {
          L0: {
            uf.a(60);
            if (dl.field_l.b(-26753)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (dl.field_l.b(-26753)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_a = 20;
        field_b = "Create your own free Jagex account";
    }
}
