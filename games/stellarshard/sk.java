/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sk {
    static int field_b;
    static double[] field_a;
    static boolean[] field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            sk.a(false);
        }
        field_a = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 <= -102) {
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
                    if (45 != param0) {
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
          return false;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        int var4 = stellarshard.field_B;
        if (!(mj.a((byte) -27, param0, param2))) {
            return false;
        }
        for (var3 = param1; var3 < param2.length(); var3++) {
            if (!(b.a(param2.charAt(var3), (byte) -123))) {
                return false;
            }
        }
        return true;
    }

    abstract ua a(int param0);

    abstract void a(int param0, ka param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new double[12];
    }
}
