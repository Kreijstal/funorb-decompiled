/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ma {
    static String field_O;
    static int[] field_M;
    static int field_P;
    static s field_N;

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        se var7 = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = lg.field_Y;
          if (var7 != null) {
            if (!this.a(param5, (byte) -58, param4, param0, param2)) {
              return;
            }
            if (this.field_v instanceof na) {
              ((na) (this.field_v)).a(var7, this, (byte) -128);
              lg.field_Y = null;
              return;
            }
            if (var7.field_v instanceof na) {
              ((na) (var7.field_v)).a(var7, this, (byte) -128);
              lg.field_Y = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "id.IB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private id(int param0, int param1, int param2, int param3, gl param4, kg param5, ce param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_L = param6;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "id.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static ck a(ji param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 8192) {
            field_N = (s) null;
          }
          var4_int = param0.b(-1, param2);
          var5 = param0.a(var4_int, 13030, param1);
          stackIn_3_0 = af.a(var5, 50, param0, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("id.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_M = null;
        field_N = null;
        if (param0) {
          field_O = null;
          return;
        }
        ck var2 = (ck) null;
        id.a(99, 26, 67, 28, -65, -116, 74, (ck) null, 106);
        field_O = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ck param7, int param8) {
        try {
          qk.field_k = param8;
          pm.field_d = param5;
          g.field_Q = param2;
          db.field_a = param3;
          le.field_y = param4;
          ce.field_r = param1;
          wg.field_b = param7;
          if (param6 != 8192) {
            id.c(false);
          }
          nk.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "id.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final static w g(int param0) {
        if (param0 != 8192) {
          id.c(false);
          return jg.b(false);
        }
        return jg.b(false);
    }

    static {
        field_O = "<%0>: <%1>";
        field_M = new int[8192];
    }
}
