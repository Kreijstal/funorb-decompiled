/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends di {
    static int[] field_p;
    private ej field_n;
    static int field_o;
    static String field_m;

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 117 / ((26 - param1) / 56);
          if (this.field_n instanceof v) {
            var4 = ((v) ((Object) this.field_n)).a(29730);
            if (var4 != null) {
              if (var4.a(-16323) == dg.field_c &&
                !param0.equals(this.field_n.field_o)) {
                stackIn_7_0 = hl.field_e;
                return stackIn_7_0;
              }
              stackIn_9_0 = var4.b((byte) 119);
              return stackIn_9_0;
            }
          }
          if (param0.equals(this.field_n.field_o)) {
            return null;
          }
          stackIn_13_0 = hl.field_e;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("mg.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_m = null;
        field_p = null;
        if (param0 != -27) {
          ci[] var2 = (ci[]) null;
          mg.a(33, -128, (ci[]) null, -11, 74, -27, 87, 16, 114, (ci[]) null, 20, 25, (pk) null, 41, (ci[]) null);
        }
    }

    final im b(String param0, int param1) {
        rc var3 = null;
        RuntimeException var3_ref = null;
        im stackIn_5_0 = null;
        im stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof v) {
            var3 = ((v) ((Object) this.field_n)).a(29730);
            if (var3 != null &&
              var3.a(-16323) != dg.field_c) {
              stackIn_5_0 = qf.field_d;
              return stackIn_5_0;
            }
          }
          if (param1 != 0) {
            field_p = (int[]) null;
          }
          if (param0.equals(this.field_n.field_o)) {
            stackIn_11_0 = dg.field_c;
          } else {
            stackIn_11_0 = qf.field_d;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("mg.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    mg(ej param0, ej param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, ci[] param2, int param3, int param4, int param5, int param6, int param7, int param8, ci[] param9, int param10, int param11, pk param12, int param13, ci[] param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        int var17 = 0;
        try {
          var15_int = param12.field_p + param12.field_u;
          var16 = param12.field_u;
          var17 = 19 / ((-26 - param5) / 53);
          mb.a(param3, param12, param4, 480, param9, param11, param2, (byte) 77, param13, param1, var16, var15_int, var15_int, param14, param10, param8, param12, param6, var16, param0, param7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_4_0 = var15;
          stackIn_4_1 = new StringBuilder().append("mg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_o = 0;
        field_p = new int[8192];
        field_m = "That name is not available";
    }
}
