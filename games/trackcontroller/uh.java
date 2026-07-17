/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    int field_f;
    static int field_e;
    static String field_d;
    int field_g;
    int field_a;
    int field_h;
    int field_k;
    byte[] field_i;
    static bh[] field_b;
    int field_l;
    byte[] field_c;
    int field_j;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 0;
        field_d = null;
    }

    final static String a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static void a(int param0, na param1, int param2, int param3, int param4, na param5) {
        try {
            of.field_f = param0;
            mk.field_a = param5;
            int var6_int = 43 % ((49 - param3) / 32);
            mb.field_c = param4;
            na.field_e = param2;
            nh.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "uh.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (param0 != 1) {
                  L2: {
                    if (param1 >= 15) {
                      break L2;
                    } else {
                      int discarded$2 = uh.a(4, (byte) 36, 66);
                      break L2;
                    }
                  }
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_7_0 = var3_int * param2;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L3: {
                  if ((1 & param0) == 0) {
                    break L3;
                  } else {
                    var3_int = var3_int * param2;
                    break L3;
                  }
                }
                param2 = param2 * param2;
                param0 = param0 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "uh.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "to return to the normal view.";
        field_b = new bh[13];
    }
}
