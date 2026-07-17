/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    static kv[] field_d;
    static int field_a;
    static String field_f;
    static String field_b;
    static String field_e;
    static int field_c;

    public static void a() {
        field_f = null;
        field_e = null;
        field_b = null;
        int var1 = -27;
        field_d = null;
    }

    final static void a(byte param0) {
        if (dma.field_b == null) {
          if (param0 > -64) {
            field_b = null;
            return;
          } else {
            return;
          }
        } else {
          dma.field_b.a((byte) 45);
          dma.field_b = null;
          if (param0 <= -64) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        NumberFormatException var3 = null;
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        try {
          L0: {
            stackOut_1_0 = Integer.parseInt(lka.field_E[param0][param1]);
            stackIn_2_0 = stackOut_1_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_2_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This game has started.";
        field_e = "<%0> is not on your ignore list.";
        field_f = "Enter name of friend to delete from list";
    }
}
