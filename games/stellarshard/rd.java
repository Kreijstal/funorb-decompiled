/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static pb[][] field_a;

    final static void a(byte param0, float param1, String param2) {
        try {
          am.field_i = param2;
          fg.field_K = param1;
          if (param0 >= -37) {
            String var4 = (String) null;
            rd.a(false, (String) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < -26) {
          field_b = null;
          field_a = (pb[][]) null;
          return;
        }
        String var2 = (String) null;
        rd.a((String) null, 105);
        field_b = null;
        field_a = (pb[][]) null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() >= dl.field_G) {
            if (param0.length() > ce.field_d) {
              return true;
            }
            var2_int = 29 % ((-74 - param1) / 46);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("rd.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            rd.a((byte) 49);
          }
          if (lg.a(-117, param1)) {
            return false;
          }
          if (fl.a(param1, (byte) 19)) {
            return false;
          }
          if (rd.a(param1, -122)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (rb.a(param1, -56, param2)) {
            return false;
          }
          if (ji.a(param1, 95, param2)) {
            return false;
          }
          if (!mb.a(param1, (byte) 122, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("rd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    static {
        field_b = "Mega laser";
        field_a = new pb[8][32];
    }
}
