/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static ej field_b;
    static int field_a;

    final static fn a(String param0, boolean param1, String param2, boolean param3) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param1) {
            String var7 = (String) null;
            op.a((String) null, true, (String) null, false);
          }
          long var4_long = 0L;
          Object var6 = null;
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            CharSequence var8 = (CharSequence) ((Object) param2);
            var4_long = AceOfSkies.a(var8, -47);
          }
          fn stackIn_6_0 = wb.a(param3, (String) (var6), param0, var4_long, true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("op.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 6337) {
          field_b = null;
          return;
        }
        String var2 = (String) null;
        op.a((String) null, true, (String) null, false);
        field_b = null;
    }

    final static void a(int param0, ResourceArchive param1) {
        t.a(param1.a("headers.packvorbis", (byte) -71, ""));
        if (param0 != 20786) {
          return;
        }
        try {
          t var2 = t.a(param1, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "op.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new ej(10, 2, 2, 0);
    }
}
