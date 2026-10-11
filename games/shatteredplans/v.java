/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private bi[] field_c;
    static int field_e;
    static String field_a;
    static volatile int field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
          String var2 = (String) null;
          v.a((String) null, (byte) 104);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 < -102) {
          em.a(param0, param3, 7, param2, this.field_c, param1);
          return;
        }
        field_d = -42;
        em.a(param0, param3, 7, param2, this.field_c, param1);
    }

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = wd.a(jd.field_i, (byte) 123, bs.field_b);
          if (var2_int == 1) {
            param0 = "<img=0>" + param0;
          }
          if (param1 <= 4) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (var2_int == 2) {
            param0 = "<img=1>" + param0;
          }
          stackIn_10_0 = (String) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("v.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        cf.a(pd.field_f, (byte) 39);
        int var1 = -68 % ((param0 + 66) / 40);
    }

    v(bi[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 0;
        field_e = 3;
        field_a = "Return to Main Menu";
    }
}
