/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends rk {
    static String field_u;
    byte[] field_q;
    static bi field_p;
    static String field_s;
    static int field_n;
    int field_o;
    static int field_m;
    static fh field_t;
    long field_r;

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
          return;
        }
        field_t = null;
        field_u = null;
        field_p = null;
    }

    final static boolean a(char param0, int param1) {
        if (param1 != -58) {
          field_s = (String) null;
          if (48 > param0) {
            return false;
          }
          if (param0 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > param0) {
          return false;
        }
        if (param0 <= 57) {
          return true;
        }
        return false;
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -24682) {
            stackIn_4_0 = tb.a(0, param1, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    hc(long param0, int param1, byte[] param2) {
        try {
          this.field_q = param2;
          this.field_r = param0;
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
