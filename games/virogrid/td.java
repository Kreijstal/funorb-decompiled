/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static tf[] field_e;
    static int field_j;
    static String field_c;
    static il field_i;
    static ml[] field_d;
    static un field_b;
    static int field_h;
    static mg[] field_g;
    static eh field_a;
    static int field_f;

    final static void a(l param0, byte param1, l param2) {
        try {
          if (param2.field_a != null) {
            param2.a(false);
          }
          int var3_int = 37 / ((param1 + 12) / 33);
          param2.field_a = param0.field_a;
          param2.field_f = param0;
          param2.field_a.field_f = param2;
          param2.field_f.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "td.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param1.getGraphics();
            ca.field_M.a((byte) 120, param2, var4, param3);
            if (param0 != -30179) {
              return;
            }
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param1.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("td.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_b = null;
        field_e = null;
        if (param0 == 6666) {
          field_c = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        td.a(-12, (java.awt.Canvas) null, -119, 111);
        field_c = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    final static mg[] a(int param0, int param1, int param2, eh param3) {
        RuntimeException var4 = null;
        eh var5 = null;
        Object stackIn_2_0 = null;
        mg[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hn.a(param3, param2, param0, (byte) 109)) {
            stackIn_2_0 = null;
            return (mg[]) (stackIn_2_0);
          }
          if (param1 != 6887) {
            var5 = (eh) null;
            td.a(37, -9, -75, (eh) null);
          }
          stackIn_6_0 = kd.c(true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("td.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_c = "You must be a member to play with the current options.";
    }
}
