/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static char[] field_b;
    static fj field_a;

    public static void a(int param0) {
        int var1 = -46 % ((param0 - 59) / 40);
        field_b = null;
        field_a = null;
    }

    abstract void a(int param0, byte[] param1);

    final static void a(ed param0, int param1, String param2, kc param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var10 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              if (param4 == 404465128) {
                break L1;
              } else {
                var10 = (kc) null;
                ll.a((ed) null, 108, (String) null, (kc) null, 30);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (param2.length() <= var7) {
                  break L3;
                } else {
                  var8 = param2.charAt(var7);
                  if (var9 == 0) {
                    L4: {
                      if (var8 == 60) {
                        var6 = (var5_int >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var6 != -1) {
                          break L6;
                        } else {
                          L7: {
                            if (var8 != 32) {
                              break L7;
                            } else {
                              var5_int = var5_int + param1;
                              break L7;
                            }
                          }
                          param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      param0.field_g[var7] = var6;
                      break L5;
                    }
                    L8: {
                      if (var8 == 62) {
                        var6 = -1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var7++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ll.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param4 + ')');
        }
    }

    abstract byte[] a(byte param0);

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -153798488) {
                break L1;
              } else {
                field_b = (char[]) null;
                break L1;
              }
            }
            L2: {
              if (gi.a(param0, param1 ^ 153798427) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ll.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_b = new char[128];
    }
}
