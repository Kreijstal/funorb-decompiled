/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    final static java.awt.Frame a(vh param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        vh var10 = null;
        sf[] var11 = null;
        rc var12 = null;
        var9 = Torquing.field_u;
        try {
          if (!param0.a((byte) 13)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param4 == 0) {
            var11 = no.a(param0, -33);
            var6 = var11;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var11.length > var8; var8++) {
              if (var11[var8].field_d == param2 &&
                var11[var8].field_c == param1 && ((param5 == 0 ||
                var11[var8].field_e == param5) &&
                (var7_int == 0 ||
                !(var11[var8].field_b <= param4)))) {
                param4 = var11[var8].field_b;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var12 = param0.a(true, param2, param1, param5, param4);
          while (var12.field_a == 0) {
            ub.a(1976, 10L);
          }
          if (param3 != 0) {
            var10 = (vh) null;
            jj.a((vh) null, 19, 84, -43, 52, 100);
          }
          var7 = (java.awt.Frame) (var12.field_d);
          if (var7 == null) {
            stackIn_32_0 = null;
            return (java.awt.Frame) (stackIn_32_0);
          }
          if (var12.field_a != 2) {
            stackIn_37_0 = var7;
            return stackIn_37_0;
          }
          ka.a(-123, var7, param0);
          stackIn_35_0 = null;
          return (java.awt.Frame) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = var6_ref;
          stackIn_40_1 = new StringBuilder().append("jj.B(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static sm a(sm param0, int[] param1, int param2) {
        sm var3 = null;
        RuntimeException var3_ref = null;
        sm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new sm(param2, 0, 0);
          var3.field_d = param0.field_d;
          var3.field_a = param0.field_a;
          var3.field_l = param0.field_l;
          var3.field_j = param0.field_j;
          var3.field_g = param0.field_g;
          var3.field_k = param1;
          var3.field_c = param0.field_c;
          var3.field_e = param0.field_e;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("jj.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
