/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends ec {
    static cn field_w;
    private ff field_v;
    static int field_s;
    private int field_t;
    static String field_x;
    static wh field_u;

    final void d(byte param0, int param1) {
        int fieldTemp$0 = ((wj) this).field_o;
        ((wj) this).field_o = ((wj) this).field_o + 1;
        ((wj) this).field_m[fieldTemp$0] = (byte)(param1 + ((wj) this).field_v.a(26979));
        if (param0 > -76) {
            ((wj) this).field_t = 30;
        }
    }

    final void a(int[] param0, byte param1) {
        try {
            int var3_int = -58 % ((-42 - param1) / 36);
            ((wj) this).field_v = new ff(param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wj.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int m(int param0) {
        if (param0 != 255) {
            return -17;
        }
        int fieldTemp$0 = ((wj) this).field_o;
        ((wj) this).field_o = ((wj) this).field_o + 1;
        return 255 & ((wj) this).field_m[fieldTemp$0] + -((wj) this).field_v.a(26979);
    }

    final int j(int param0, int param1) {
        int var7 = DungeonAssault.field_K;
        int var3 = ((wj) this).field_t >> 3;
        int var4 = -(7 & ((wj) this).field_t) + 8;
        int var5 = 0;
        ((wj) this).field_t = ((wj) this).field_t + param1;
        int var6 = -50 % ((param0 - 15) / 58);
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((wj) this).field_m[incrementValue$0] & ba.field_b[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (((wj) this).field_m[var3] & ba.field_b[var4]);
        } else {
            var5 = var5 + (((wj) this).field_m[var3] >> -param1 + var4 & ba.field_b[param1]);
        }
        return var5;
    }

    final void f(byte param0) {
        ((wj) this).field_o = (((wj) this).field_t + 7) / 8;
        if (param0 <= 19) {
            ((wj) this).f((byte) -32);
        }
    }

    wj(int param0) {
        super(param0);
    }

    wj(byte[] param0) {
        super(param0);
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                L2: {
                  if (param1 == 95) {
                    break L2;
                  } else {
                    ((wj) this).e(true);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((wj) this).field_o;
                ((wj) this).field_o = ((wj) this).field_o + 1;
                param3[var5_int - -param0] = (byte)(((wj) this).field_m[fieldTemp$2] + -((wj) this).field_v.a(26979));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("wj.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void n() {
        field_u = null;
        field_w = null;
        field_x = null;
    }

    final void e(boolean param0) {
        if (param0) {
            return;
        }
        ((wj) this).field_t = 8 * ((wj) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "The changes you have made to your dungeon have not yet been saved. Would you like them to be saved now?";
    }
}
