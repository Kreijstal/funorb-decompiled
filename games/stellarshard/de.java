/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static bd field_c;
    static li field_d;
    static th field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 4) {
          de.a(57);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = stellarshard.field_B;
        try {
          if (param0 >= param4) {
            return;
          }
          if (param0 + 1 >= param3) {
            return;
          }
          if (5 + param0 < param3 &&
            param6 != param2) {
            var7_int = (param1 & (param2 & param6)) + ((param2 >> 1) + (param6 >> 1));
            var8 = param0;
            var9 = param6;
            var10 = param2;
            for (var11 = param0; param3 > var11; var11++) {
              var12 = fj.field_b[var11];
              if (!param5) {
                stackIn_23_0 = vh.field_h[var12];
              } else {
                stackIn_23_0 = se.field_B[var12];
              }
              var13 = stackIn_23_0;
              if (var7_int >= var13) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                fj.field_b[var11] = fj.field_b[var8];
                if (var9 > var13) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                fj.field_b[incrementValue$0] = var12;
              }
            }
            de.a(param0, param1 ^ 0, var9, var8, param4, param5, param6);
            de.a(var8, param1 + 0, param2, param3, param4, param5, var10);
            return;
          }
          for (var7_intLifetime1 = param3 - 1; var7_intLifetime1 > param0; var7_intLifetime1--) {
            for (var8Lifetime1 = param0; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = fj.field_b[var8Lifetime1];
              var10Lifetime1 = fj.field_b[var8Lifetime1 + 1];
              if (hf.a(var10Lifetime1, param5, var9Lifetime1, (byte) 41)) {
                fj.field_b[var8Lifetime1] = var10Lifetime1;
                fj.field_b[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var7), "de.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static bk a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        bk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -16) {
            var3 = (String) null;
            de.a((String) null, 4);
          }
          stackIn_3_0 = new bk(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("de.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new li(1, 2, 2, 0);
        field_a = new th();
        field_b = new int[4];
    }
}
