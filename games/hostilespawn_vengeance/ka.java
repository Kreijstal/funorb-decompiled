/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends hi {
    static String[] field_o;
    static boolean field_r;
    static int field_q;
    static int[] field_p;

    ka(ig param0) {
        super(param0);
    }

    final bm a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        bm stackIn_5_0 = null;
        bm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 55 % ((param1 - 3) / 42);
          stackIn_3_0 = (hj.b(param0, 11242) != null) ? 0 : 1;
          var4 = stackIn_3_0;
          if (var4 != 0) {
            stackIn_7_0 = nd.field_d;
            return stackIn_7_0;
          }
          stackIn_5_0 = bi.field_d;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ka.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        try {
          jj.field_j[0].a((double)param2, (double)param0, false, (double)param3 + param1.field_c, 128);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void f(int param0) {
        field_o = null;
        int var1 = -102 / ((43 - param0) / 48);
        field_p = null;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 21 % ((param0 + 24) / 35);
          if (this.a(param1, (byte) 91) != bi.field_d) {
            return ak.field_g;
          }
          stackIn_3_0 = en.field_z;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 0) {
          return true;
        }
        if (j.field_c < param4) {
          return false;
        }
        if (j.field_c >= param4 + param3) {
          return false;
        }
        if (param0 > rb.field_m) {
          return false;
        }
        if (param0 + param2 > rb.field_m) {
          return true;
        }
        return false;
    }

    static {
        field_p = new int[]{3, 1};
    }
}
