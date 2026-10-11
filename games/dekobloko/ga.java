/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements lh {
    static String field_d;
    static jc field_e;
    static String field_a;
    static String field_c;
    static String field_b;

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, mm param7, byte param8, int param9, int param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11_int = 2;
          if (param7 == se.field_S) {
            var11_int = 1;
          }
          param7.a(param3, param10 - var11_int, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, -var11_int + param10, param2, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, param10 - var11_int, param2 + var11_int, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, param10, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
          if (param8 > -123) {
            ga.a(false, -18, 81);
          }
          param7.a(param3, param10, param2 + var11_int, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, param10 + var11_int, param2 - var11_int, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, param10 + var11_int, param2, param0, param5, 65793, -1, param9, param1, param4);
          param7.a(param3, var11_int + param10, param2 + var11_int, param0, param5, 65793, -1, param9, param1, param4);
          if (param7 == w.field_kb) {
            param7.a(param3, 1 + param10, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, param10 - 1, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, param10 + var11_int, -1 + param2, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, -var11_int + param10, param2 - 1, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, var11_int + param10, 1 + param2, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, param10 - var11_int, param2 + 1, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, param10 + 1, var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
            param7.a(param3, -1 + param10, param2 + var11_int, param0, param5, 65793, -1, param9, param1, param4);
          }
          stackIn_8_0 = param7.a(param3, param10, param2, param0, param5, param6, -1, param9, param1, param4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_11_0 = var11;
          stackIn_11_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -52) {
          field_d = (String) null;
        }
        field_e = null;
        field_a = null;
    }

    final static void b(byte param0) {
        aa.field_f = new vj();
        if (param0 != -112) {
          field_e = (jc) null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (param0) {
          field_a = (String) null;
        }
        uf var3 = we.field_b;
        var3.f(param2, -4);
        var3.a(true, 3);
        var3.a(true, 10);
        var3.d(-1, param1);
    }

    final static jc a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_8_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = hm.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = (jc) (field_e);
            return stackIn_8_0;
          }
          var3 = 0;
          if (param0 != 7017) {
            field_d = (String) null;
          }
          while (var3 < var2_int) {
            var4 = param1.charAt(var3);
            if (45 == var4) {
              if (var3 == 0 ||
                var3 == -1 + var2_int) {
                stackIn_18_0 = be.field_x;
                return stackIn_18_0;
              }
            } else {
              if (v.field_c.indexOf(var4) == -1) {
                stackIn_22_0 = be.field_x;
                return stackIn_22_0;
              }
            }
            var3++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ga.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Rating";
        field_e = new jc();
        field_c = "Confirm Password: ";
        field_b = "Loading backgrounds";
    }
}
