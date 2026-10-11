/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_c;
    static int[] field_a;
    static mf field_b;

    final static void a(int param0, wg param1, int param2) {
        try {
          jb.field_b.a(0, param1);
          nd.a(param0, 1, param1);
          if (param2 > -6) {
            dj var4 = (dj) null;
            dd.a((String) null, (String) null, 118, (dj) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "dd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static v[] a(String param0, String param1, int param2, dj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wg var6 = null;
        v[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1864) {
            var6 = (wg) null;
            dd.a(34, (wg) null, 116);
          }
          var4_int = param3.a(param0, (byte) 8);
          var5 = param3.a(var4_int, param1, true);
          stackIn_3_0 = h.a(param3, var4_int, -87, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dd.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == 68) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        dj var2 = (dj) null;
        dd.a((String) null, (String) null, 95, (dj) null);
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_c = new int[4];
        field_a = new int[]{135, 135, 90, 120};
    }
}
