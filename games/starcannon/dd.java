/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static ge field_b;
    static rb field_a;

    final synchronized static long b(int param0) {
        long var1 = 0L;
        L0: {
          var1 = System.currentTimeMillis();
          if (~db.field_C < ~var1) {
            ek.field_d = ek.field_d + (-var1 + db.field_C);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 55) {
          db.field_C = var1;
          return var1 + ek.field_d;
        } else {
          db.field_C = var1;
          return var1 + ek.field_d;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          if (param3 == -23466) {
            try {
              L0: {
                var4 = param0.getGraphics();
                hg.field_y.a(param2, param1, var4, 19291);
                var4.dispose();
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = (Exception) (Object) decompiledCaughtException;
              param0.repaint();
              return;
            }
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("dd.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 25) {
            boolean discarded$0 = dd.a((byte) 121);
            return sc.a(ll.b(116), true);
        }
        return sc.a(ll.b(116), true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ge();
    }
}
