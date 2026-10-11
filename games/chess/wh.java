/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static sa field_b;
    static String[][] field_g;
    static String field_e;
    static rk field_c;
    static String[] field_a;
    static String field_d;
    static int field_f;

    final static int a(int param0, ld param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Chess.field_G;
        try {
          var2_int = uh.field_l;
          if (param1.field_k != 2) {
            if (4 != param1.field_k) {
              if (~gb.field_t == ~param1.field_m) {
                var2_intLifetime1 = vm.field_i[param1.field_k];
              } else {
                var2_intLifetime1 = kg.field_P[param1.field_k];
              }
            } else {
              var2_intLifetime1 = kg.field_P[param1.field_k];
            }
          } else {
            if (!param1.field_d) {
              if (param1.field_e == 0 &&
                param1.field_q == 0) {
                var2_intLifetime1 = vm.field_i[param1.field_k];
              } else {
                var2_intLifetime1 = kg.field_P[param1.field_k];
              }
            } else {
              var2_intLifetime1 = uh.field_l;
            }
          }
          if (param0 != -1) {
            field_c = (rk) null;
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("wh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        km var17 = null;
        int[] var19 = wb.field_d;
        int[] var18 = var19;
        int[] var16 = var18;
        int[] var6 = var16;
        int var7 = wb.field_h;
        int var8 = 7 % ((param0 + 10) / 58);
        int var9 = wb.field_c;
        km var10 = new km(param2, param1 - 2 * param2);
        var10.e();
        wb.c(0, 0, param2, -(2 * param2) + param1, param3, param4);
        km var11 = new km(param2, param2);
        var11.e();
        wb.f(0, 0, param2, param2, param3);
        km var12 = new km(16, param2);
        var12.e();
        wb.f(0, 0, 16, param2, param3);
        km var13 = new km(param2, param2);
        var13.e();
        wb.f(0, 0, param2, param2, param4);
        km var14 = new km(16, param2);
        var14.e();
        wb.f(0, 0, 16, param2, param4);
        Object var15 = null;
        if (param5 > 0) {
          var17 = new km(16, 16);
          var15 = var17;
          var17.e();
          wb.f(0, 0, 16, 16, param5);
        }
        wb.a(var19, var7, var9);
        return new km[]{var11, var12, var11, var10, (km) (var15), var10, var13, var14, var13};
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 == -46) {
          field_a = null;
          field_b = null;
          field_g = (String[][]) null;
          field_d = null;
          field_c = null;
          return;
        }
        field_b = (sa) null;
        field_a = null;
        field_b = null;
        field_g = (String[][]) null;
        field_d = null;
        field_c = null;
    }

    static {
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_e = "Email (Login):";
        field_g = new String[][]{new String[]{"60", "50", "40", "30", "20", "10", "5"}};
        field_d = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = 0;
        field_b = new sa();
    }
}
