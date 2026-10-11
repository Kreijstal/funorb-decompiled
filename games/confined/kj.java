/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static volatile long field_a;
    static String field_d;
    static bi field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -30357) {
          field_c = (String) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(bi param0, int param1, pm param2) {
        try {
          da.a(param1, param1 - 96, param0, false, param2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -14) {
          return true;
        }
        if (gg.field_m == null) {
          return false;
        }
        if (gg.field_m.b(param0 - 99)) {
          return true;
        }
        return false;
    }

    final static bm[] a(mi param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            kj.a(13);
          }
          if (mc.a(param2, param1, param0, (byte) 119)) {
            return Confined.g((byte) 118);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = 0L;
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
