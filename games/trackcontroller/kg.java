/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static qj[] field_e;
    static String field_a;
    static boolean field_f;
    static int field_d;
    static int[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != -1) {
          field_c = -1;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(boolean param0, byte param1, int param2, wb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4_int = -101 % ((param1 - 11) / 46);
          if (null != da.field_n) {
            ia.a(param0, param2, 1048576, 1000000, param3);
          }
          if (fj.field_P == null) {
            return;
          }
          var5 = sb.field_b;
          synchronized (var5) {
            fj.field_P.a(param2, (byte) -113, -1);
            if (param3 == ch.field_n) {
              return;
            }
            fj.field_P.f(11795);
            sb.field_b.c();
            ch.field_n = param3;
            if (ch.field_n != null) {
              fj.field_P.a(ch.field_n, 14526, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("kg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_c = 480;
        field_b = new int[256];
    }
}
