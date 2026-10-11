/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends ln {
    static go field_s;
    static lc field_o;
    static String field_r;
    static int[] field_q;
    static String field_p;

    final static wd a(boolean param0, float param1, wd param2) {
        RuntimeException var3 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_p = (String) null;
          }
          stackIn_3_0 = wc.a(param2, 0.0f, param1, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        vk.a(param0, param1, -113);
    }

    final static void f(int param0) {
        ka.field_g = param0;
    }

    fj() {
    }

    final static int a(int[] param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          param2 = param2 - param0[0];
          var4 = param0.length - 1;
          if (param1 != -119) {
            field_s = (go) null;
          }
          for (var3_int = 0; var3_int < var4; var3_int++) {
            var5 = param0[1 + var3_int];
            if (var5 > param2 &&
              param2 > 15) {
              stackIn_8_0 = var3_int;
              return stackIn_8_0;
            }
            param2 = param2 - var5;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("fj.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static hj a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        hj var6 = null;
        RuntimeException var6_ref = null;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new hj(param5, param3);
          hj.a(param2, var6, param1, param4, 0, param0, param5, param3);
          stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("fj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_s = null;
        field_q = null;
        int var1 = -99 / ((param0 + 1) / 60);
        field_o = null;
        field_r = null;
    }

    static {
        field_r = "Unpacking levels";
        field_p = "Snowcat";
    }
}
