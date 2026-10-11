/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static re field_c;
    static String field_d;
    static byte[][] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = (byte[][]) null;
        field_d = null;
        if (param0 <= 37) {
          field_a = 13;
        }
    }

    final static void a(Object param0, byte param1, uf param2) {
        int var3_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (null == param2.field_i) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (param2.field_i.peekEvent() != null) {
              wl.a(1L, false);
              continue;
            }
            break;
          }
          try {
            if (param1 != -127) {
              return;
            }
            if (param0 == null) {
              return;
            }
            param2.field_i.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("f.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_d = "Please wait...";
        field_b = new byte[1000][];
        field_a = 4;
        field_c = null;
    }
}
