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

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        int var1 = 55 / ((param0 - 38) / 48);
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

    final static int a(int param0, int param1, int param2) {
        NumberFormatException var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param2 == -16306) {
            break L0;
          } else {
            vc.a((byte) 16);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(lka.field_E[param0][param1]);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
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
