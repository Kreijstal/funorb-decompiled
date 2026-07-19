/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static int[] field_c;
    static String field_d;
    static ru field_e;
    static String field_a;
    static String field_b;

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_d = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
        if (param0 <= 89) {
            discarded$0 = qt.a(70, 71, (byte) -22);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param1 ^ -1) >= -1) {
                    break L3;
                  } else {
                    var3_int = var3_int << -683904767 | param0 & 1;
                    param1--;
                    param0 = param0 >>> 1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 <= -49) {
                  break L2;
                } else {
                  field_b = (String) null;
                  break L2;
                }
              }
              stackOut_8_0 = var3_int;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "qt.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(boolean param0) {
        tm.a();
        if (param0) {
            return;
        }
        tm.b(0.75f);
    }

    static {
        field_c = new int[8192];
        field_d = "Bridges can only be built on straight coastlines.";
        field_a = "Defeat the enemy leader to win this battle.";
        field_b = "You have withdrawn your request to join.";
    }
}
