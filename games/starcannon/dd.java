/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static ge field_b;
    static rb field_a;

    final synchronized static long b(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(db.field_C <= var1)) {
          ek.field_d = ek.field_d + (-var1 + db.field_C);
        }
        if (param0 >= 55) {
          db.field_C = var1;
          return var1 + ek.field_d;
        }
        dd.b(1);
        db.field_C = var1;
        return var1 + ek.field_d;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -54) {
          field_a = (rb) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param3 != -23466) {
            return;
          }
          try {
            var4 = param0.getGraphics();
            hg.field_y.a(param2, param1, var4, 19291);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("dd.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 25) {
          dd.a((byte) 121);
          return sc.a(ll.b(116), true);
        }
        return sc.a(ll.b(116), true);
    }

    static {
        field_b = new ge();
    }
}
