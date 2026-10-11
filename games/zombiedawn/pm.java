/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pm extends um implements ok {
    static String field_e;
    private tb field_d;
    static java.math.BigInteger field_c;

    final static void a(int param0, int param1, jc param2) {
        am var3 = null;
        try {
          var3 = dp.field_e;
          var3.j(11, param1);
          var3.i(5, -107);
          var3.i(param0, -98);
          var3.a(param2.field_s, (byte) 105);
          var3.i(param2.field_u, -114);
          var3.i(param2.field_o, param0 ^ -126);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          pm.a(true);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final String c(int param0) {
        if (param0 > -48) {
          return (String) null;
        }
        return this.a(this.field_d.field_o, (byte) -117);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, vn[] param8, int param9, vn[] param10, rb param11, vn[] param12, byte param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var15_int = param11.field_w + param11.field_x;
          var16 = param11.field_w;
          qo.a(param7, var15_int, param8, param5, param10, param11, param1, param2, param6, (byte) -75, var16, param0, param9, var15_int, param3, var16, param4, param14, param11, param12);
          if (param13 <= -58) {
            return;
          }
          field_e = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("pm.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param11 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param12 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public final void b(tb param0, int param1) {
        try {
          int var3_int = 101 % ((param1 - 35) / 38);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pm.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tb param0, int param1) {
        try {
          this.a(-7674);
          if (param1 != 8) {
            field_c = (java.math.BigInteger) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 <= 98) {
          field_c = (java.math.BigInteger) null;
          if (null != this.field_d.field_o) {
            return this.field_d.field_o.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_d.field_o) {
          return true;
        }
        if (this.field_d.field_o.length() != 0) {
          return false;
        }
        return true;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = ZombieDawn.field_J;
        ej.field_a = new vn(60, 60);
        ej.field_a.a();
        bi.g(30, 30, 28, 4521728);
        og.field_x = new vn[8];
        for (var1_int = 0; 8 > var1_int; var1_int++) {
          og.field_x[var1_int] = new vn(22, 22);
          og.field_x[var1_int].a();
          bi.g(11, 11, 2 + var1_int, 5622784);
          bi.g(11, 11, var1_int, 65793);
        }
        if (param0 != 36) {
          return;
        }
        try {
          cn.field_f.b(69);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pm.F(" + param0 + ')');
        }
    }

    abstract rh a(String param0, int param1);

    abstract String a(String param0, byte param1);

    pm(tb param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final rh c(byte param0) {
        if (param0 == -7) {
          return this.a(this.field_d.field_o, param0 + 9);
        }
        tb var3 = (tb) null;
        this.a((tb) null, 59);
        return this.a(this.field_d.field_o, param0 + 9);
    }

    static {
        field_e = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
