/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 < -10) {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
        field_c = (String) null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        sa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        sa stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param2.length > param0) {
            var3 = new sa();
            ((i) ((Object) var3)).a(param2, (byte) -122);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1) {
            stackIn_11_0 = cl.a(0, param2);
            return stackIn_11_0;
          }
          stackIn_9_0 = (byte[]) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = param3;
        if (param1) {
          var4 += 4;
        }
        if (!param2) {
          if (param0) {
            var4++;
          }
          return td.field_c[var4];
        }
        var4 += 2;
        if (param0) {
          var4++;
        }
        return td.field_c[var4];
    }

    static {
        field_a = "Fullscreen";
        field_c = "to over <%0> great games";
        field_d = "Sound Off";
        field_b = "More suggestions";
    }
}
