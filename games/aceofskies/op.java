/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static ej field_b;
    static int field_a;

    final static fn a(String param0, boolean param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        fn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var7 = (String) null;
                op.a((String) null, true, (String) null, false);
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if (0 != (param2.indexOf('@') ^ -1)) {
                var6 = param2;
                break L2;
              } else {
                var8 = (CharSequence) ((Object) param2);
                var4_long = AceOfSkies.a(var8, -47);
                break L2;
              }
            }
            stackIn_6_0 = wb.a(param3, (String) (var6), param0, var4_long, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("op.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        String var2;
        if (param0 != 6337) {
          var2 = (String) null;
          op.a((String) null, true, (String) null, false);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, gk param1) {
        t var2 = null;
        t.a(param1.a("headers.packvorbis", (byte) -71, ""));
        if (param0 != 20786) {
            return;
        }
        try {
            var2 = t.a(param1, "jagex logo2.packvorbis", "");
            var2.a();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "op.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new ej(10, 2, 2, 0);
    }
}
