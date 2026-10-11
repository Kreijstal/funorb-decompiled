/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends pm {
    static pa[] field_g;
    static int field_f;

    ko(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(rb param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.f(-129);
            if (param1 < var3_int) {
              var3_int = param1;
            }
            if (param2 > -100) {
              stackIn_5_0 = (String) null;
              return stackIn_5_0;
            }
            var4 = new byte[var3_int];
            param0.field_g = param0.field_g + tq.field_i.a(0, var3_int, param0.field_f, true, param0.field_g, var4);
            var5 = hf.a(26, var3_int, 0, var4);
            stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ko.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final eo a(int param0) {
        if (param0 >= -51) {
          this.a(-83);
          return iu.field_h;
        }
        return iu.field_h;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != 0) {
          rb var2 = (rb) null;
          ko.a((rb) null, 0, (byte) -22);
        }
    }

    static {
    }
}
