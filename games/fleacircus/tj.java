/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_c;
    static boolean field_d;
    static int field_a;
    static String field_b;
    private static String field_z;

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        var5 = fleas.field_A ? 1 : 0;
        if (param3 != -66) {
          return (String) null;
        } else {
          var4 = param1.indexOf(param0);
          L0: while (true) {
            L1: {
              L2: {
                if (0 == (var4 ^ -1)) {
                  break L2;
                } else {
                  param1 = param1.substring(0, var4) + param2 + param1.substring(var4 + param0.length());
                  stackOut_3_0 = (String) (param1);
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var4 = ((String) (Object) stackIn_4_0).indexOf(param0, var4 - -param2.length());
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_5_0 = (String) (param1);
              stackIn_6_0 = stackOut_5_0;
              break L1;
            }
            return stackIn_6_0;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
    }

    static {
        field_z = "tj.A(";
        field_d = false;
        field_b = "Waiting for music";
    }
}
