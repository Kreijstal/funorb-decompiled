/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mc extends df {
    static gq field_r;
    static bi field_u;
    static qr field_t;
    int field_p;
    static String field_q;
    static int[] field_s;
    static qr field_o;

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        field_q = null;
        if (param0) {
            return;
        }
        field_o = null;
    }

    mc(int param0) {
        this.field_p = param0;
    }

    abstract Object e(byte param0);

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                so.field_q.a(var4, param3, (byte) -92, param1);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref2 = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            if (param0 >= 21) {
              break L0;
            } else {
              field_o = (qr) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("mc.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = new gq(13, 0, 1, 0);
    }
}
