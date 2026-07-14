/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 <= -55) {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                if (32 == param0) {
                  break L1;
                } else {
                  if (param0 == 95) {
                    break L1;
                  } else {
                    if (param0 != 45) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final static q a(boolean param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param0) {
            field_a = -121;
        }
        return vc.field_N;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 43) {
            field_a = 114;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -76) {
            uf.a(60);
        }
        return !dl.field_l.b(-26753) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 20;
        field_b = "Create your own free Jagex account";
    }
}
