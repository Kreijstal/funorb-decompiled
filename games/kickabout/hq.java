/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static hd field_c;
    static nm[] field_b;
    static boolean field_a;
    static int field_d;
    static kg[] field_e;

    final static boolean a(byte param0) {
        if (param0 != 10) {
          ml var2 = (ml) null;
          hq.a(-49, -20, (ml) null, 91);
          if (vj.field_c < 10) {
            return false;
          }
          if (!nb.field_f) {
            return !oh.b(-14954) ? true : false;
          }
          return false;
        }
        if (vj.field_c < 10) {
          return false;
        }
        if (!nb.field_f) {
          return !oh.b(-14954) ? true : false;
        }
        return false;
    }

    final static int a(int param0, int param1, ml param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 22531) {
            hq.a((byte) -59);
          }
          stackIn_3_0 = wr.a(param1, param2, 1 << param3, param3, 1 << param1, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (kd.field_s) {
          fa.b(-127);
        }
        if (param0 < 108) {
          hq.a((byte) 11);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 123 / ((param0 + 76) / 50);
        field_e = null;
    }

    static {
        field_a = false;
    }
}
