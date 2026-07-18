/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_a;
    static String[] field_b;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                String discarded$2 = sb.a(-48);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "sb.B(" + param0 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = Main.field_T;
          if (param3 >= 82) {
            break L0;
          } else {
            field_a = 88;
            break L0;
          }
        }
        var4_int = param0.indexOf(param1);
        L1: while (true) {
          L2: {
            L3: {
              if (var4_int == -1) {
                break L3;
              } else {
                param0 = param0.substring(0, var4_int) + param2 + param0.substring(param1.length() + var4_int);
                stackOut_5_0 = (String) param0;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  var4_int = ((String) (Object) stackIn_6_0).indexOf(param1, var4_int + param2.length());
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_7_0 = (String) param0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          }
          return stackIn_8_0;
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3871) {
                break L1;
              } else {
                field_a = 86;
                break L1;
              }
            }
            stackOut_3_0 = rd.field_j.c(false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "sb.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
