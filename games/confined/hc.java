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
        if (param1 == -58) {
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_s = (String) null;
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -24682) {
              stackIn_4_0 = tb.a(0, param1, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("hc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
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
