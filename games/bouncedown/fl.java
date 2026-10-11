/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
          field_b = (int[]) null;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != 8192) {
            field_b = (int[]) null;
          }
          ph.a("", param1, (byte) 43);
          lg.a(0, param1);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static fb a(byte param0, String param1) {
        String var2 = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fb stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Bounce.field_N;
        try {
          if (tk.field_b == null) {
            stackIn_3_0 = null;
            return (fb) (stackIn_3_0);
          }
          if (param0 > -124) {
            field_b = (int[]) null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = ce.a(var6, 0);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (fb) (tk.field_b.a((long)var2.hashCode(), 0));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = ce.a(var7, 0);
            if (var4 == null) {
              var4 = var3.field_ob;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (fb) (tk.field_b.b(0));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static tg[] a(int param0, int param1, gk param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 19 / ((65 - param0) / 57);
          if (c.a(param2, false, param1, param3)) {
            return kc.a(true);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fl.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new int[8192];
        field_a = 500;
    }
}
