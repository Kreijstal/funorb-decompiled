/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends bw {
    static fea field_g;
    byte[] field_h;
    static po field_f;

    public static void c(byte param0) {
        int var1 = 8 % ((-41 - param0) / 53);
        field_f = null;
        field_g = null;
    }

    final static void a(String param0, String param1, byte param2) {
        try {
          wi.a(false, param1, param0, (byte) -68);
          if (param2 <= 55) {
            g.c((byte) 93);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "g.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, vr param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3.b(108, param0, param1);
          var4 = var5;
          if (param2 != -30744) {
            g.c((byte) 41);
          }
          if (var5 == null) {
            return false;
          }
          hia.a(-42, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("g.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    g(byte[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
