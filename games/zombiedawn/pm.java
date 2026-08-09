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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        try {
          L0: {
            var15_int = param11.field_w + param11.field_x;
            var16 = param11.field_w;
            qo.a(param7, var15_int, param8, param5, param10, param11, param1, param2, param6, (byte) -75, var16, param0, param9, var15_int, param3, var16, param4, param14, param11, param12);
            if (param13 <= -58) {
              break L0;
            } else {
              field_e = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("pm.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param13 + ',' + param14 + ')');
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(-7674);
              if (param1 == 8) {
                break L1;
              } else {
                field_c = (java.math.BigInteger) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pm.G(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 > 98) {
          if (null != this.field_d.field_o) {
            if (this.field_d.field_o.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_c = (java.math.BigInteger) null;
          if (null == this.field_d.field_o) {
            return true;
          } else {
            L0: {
              if (this.field_d.field_o.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
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
        tb var3;
        if (param0 != -7) {
          var3 = (tb) null;
          this.a((tb) null, 59);
          return this.a(this.field_d.field_o, param0 + 9);
        } else {
          return this.a(this.field_d.field_o, param0 + 9);
        }
    }

    static {
        field_e = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
