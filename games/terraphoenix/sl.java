/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static ci[] field_b;
    static int field_d;
    static String field_c;
    static int field_e;
    static String field_f;
    static String field_a;

    final static void a(java.awt.Canvas param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          if (uh.field_H < 10) {
            L0: {
              var3_int = 0;
              if (il.field_e) {
                var3_int = 1;
                il.field_e = false;
                break L0;
              } else {
                break L0;
              }
            }
            int discarded$4 = -27;
            int discarded$5 = -1;
            sa.a(-26, vb.b(), fc.a(), oi.field_H, var3_int != 0);
            return;
          } else {
            if (!sl.a((byte) -40)) {
              l.a();
              ch.a((byte) -79, 240, 320);
              ia.a(0, param0, 0, (byte) 113);
              return;
            } else {
              if (q.field_Jb != 0) {
                ej.a(-12966, param0);
                return;
              } else {
                ad.a(param1, 0, false);
                ia.a(0, param0, 0, (byte) 126);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("sl.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + 80 + 41);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b() {
        field_c = null;
        field_b = null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -12) {
            return false;
        }
        return kf.field_f > 250 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "EXCLUSIVE";
        field_f = "Go Back";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_e = 20;
    }
}
