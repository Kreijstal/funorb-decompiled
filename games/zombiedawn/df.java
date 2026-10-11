/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends le {
    static af field_j;
    boolean field_k;
    static int field_i;
    static boolean field_h;
    static boolean field_l;

    final static boolean a(int param0) {
        if (param0 == 1) {
          return !gl.field_E.a(117) ? true : false;
        }
        field_l = false;
        return !gl.field_E.a(117) ? true : false;
    }

    public static void c(int param0) {
        if (param0 != -24231) {
          return;
        }
        field_j = null;
    }

    final static vn[] a(byte param0, String param1, String param2, dj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vn[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24) {
            field_l = true;
          }
          var4_int = param3.a(param1, (byte) 8);
          var5 = param3.a(var4_int, param2, true);
          stackIn_3_0 = an.a(var4_int, var5, 127, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("df.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    df() {
    }

    static {
        field_j = new af();
        field_i = 1;
        field_h = true;
    }
}
