/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jqb extends rqa {
    static float[] field_o;

    jqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, String param2, byte param3, int param4, int param5, da param6, ha param7, sw param8, int param9, int param10) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        eab var15 = null;
        try {
          var11_int = param8.a(param2, 1);
          var12 = param8.field_d + param8.field_e;
          var13 = param10;
          if (6 + var11_int + var13 > param5) {
            var13 = -6 + (-var11_int + param5);
          }
          var14 = -param8.field_d + param4 + 32;
          if (param1 < var12 + (var14 + 6)) {
            var14 = -6 + param1 - var12;
          }
          param7.a(114, var14, 6 + var11_int, -16777216 | param0, var13, 6 + var12);
          if (param3 != 100) {
            var15 = (eab) null;
            jqb.a(-53, -31, (eab) null, -44, -9, 98);
          }
          param7.a(var11_int + 4, (byte) 120, -16777216 | param9, var12 + 4, 1 + var14, 1 + var13);
          param6.a(true, param0 | -16777216, -1, param2, var14 + 3 + param8.field_d, var13 + 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_11_0 = var11;
          stackIn_11_1 = new StringBuilder().append("jqb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static java.awt.Frame a(int param0, int param1, eab param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        fm[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        fm[] var10 = null;
        mob var11 = null;
        var9 = VoidHunters.field_G;
        try {
          if (!param2.a(param0 - 11168)) {
            return null;
          }
          if (param1 == 0) {
            var10 = dtb.a(param2, -30334);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_c == param5 &&
                var10[var8].field_a == param3 && ((param4 == 0 ||
                var10[var8].field_d == param4) &&
                (var7_int == 0 ||
                !(param1 >= var10[var8].field_e)))) {
                var7_int = 1;
                param1 = var10[var8].field_e;
              }
            }
            if (var7_int == 0) {
              stackIn_28_0 = null;
              return (java.awt.Frame) (stackIn_28_0);
            }
          }
          var11 = param2.a(param3, 4, param1, param5, param4);
          while (0 == var11.field_f) {
            gdb.b(121, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_d);
          if (var7 == null) {
            stackIn_34_0 = null;
            return (java.awt.Frame) (stackIn_34_0);
          }
          if (param0 != 11168) {
            field_o = (float[]) null;
          }
          if (2 != var11.field_f) {
            return var7;
          }
          db.a(var7, param2, (byte) 31);
          stackIn_40_0 = null;
          return (java.awt.Frame) (stackIn_40_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("jqb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != -15) {
          jqb.e((byte) 23);
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (float[]) null;
          }
          stackIn_3_0 = new nc(qoa.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jqb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new float[2];
    }
}
