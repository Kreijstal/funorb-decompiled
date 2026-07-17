/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot extends lba {
    static String field_t;
    static int field_v;
    private byte[] field_u;
    static String field_w;

    ot() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    public static void b(byte param0) {
        field_w = null;
        field_t = null;
        if (param0 > -66) {
            field_w = null;
        }
    }

    final byte[] a(int param0, boolean param1, int param2, int param3) {
        Object var6 = null;
        ((ot) this).field_u = new byte[param3 * (param0 * (param2 * 2))];
        ((ot) this).a(param0, param2, param3, (byte) -93);
        if (!param1) {
          var6 = null;
          iu discarded$2 = ot.a(13, 72, (cn) null, false);
          return ((ot) this).field_u;
        } else {
          return ((ot) this).field_u;
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2 * 2;
        int incrementValue$2 = var4;
        var4++;
        ((ot) this).field_u[incrementValue$2] = (byte) -1;
        var5 = 255 & param1;
        ((ot) this).field_u[var4] = (byte)(var5 * 3 >> 5);
        if (param0) {
          ot.b((byte) 20);
          return;
        } else {
          return;
        }
    }

    final static iu a(int param0, int param1, cn param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        iu stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (jna.a(false, param1, param0, param2)) {
              if (param3) {
                stackOut_6_0 = je.a((byte) 69);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (iu) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ot.J(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Accept rematch";
        field_v = 256;
        field_w = "Hide game chat";
    }
}
