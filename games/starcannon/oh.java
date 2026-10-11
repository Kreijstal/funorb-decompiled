/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int[][] field_e;
    static int[] field_c;
    static hl[] field_d;
    static rj field_a;
    static String field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 18097) {
            field_e = (int[][]) null;
          }
          stackIn_3_0 = cc.a(param1, param0, true, param2 - 18162);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -1) {
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = (int[][]) null;
          field_a = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_e = (int[][]) null;
        field_a = null;
    }

    final static java.awt.Frame a(int param0, ka param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        jk[] var9 = null;
        bk var10 = null;
        try {
          if (param5 >= -91) {
            field_c = (int[]) null;
          }
          if (!param1.a((byte) -68)) {
            stackIn_4_0 = null;
            return (java.awt.Frame) (stackIn_4_0);
          }
          if (0 == param2) {
            var9 = el.a(false, param1);
            var6 = var9;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var9.length > var8; var8++) {
              if (var9[var8].field_d == param3 &&
                var9[var8].field_h == param0 && ((param4 == 0 ||
                var9[var8].field_i == param4) &&
                (var7_int == 0 ||
                !(var9[var8].field_e <= param2)))) {
                var7_int = 1;
                param2 = var9[var8].field_e;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var10 = param1.a(param4, param0, param2, param3, 2024561328);
          while (0 == var10.field_b) {
            uc.a(-119, 10L);
          }
          var7 = (java.awt.Frame) (var10.field_f);
          if (var7 == null) {
            return null;
          }
          if (var10.field_b != 2) {
            return var7;
          }
          eg.a(var7, (byte) -47, param1);
          stackIn_34_0 = null;
          return (java.awt.Frame) (stackIn_34_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_37_0 = var6_ref;
          stackIn_37_1 = new StringBuilder().append("oh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = "Connection lost. <%0>";
    }
}
