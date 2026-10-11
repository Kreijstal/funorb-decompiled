/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static String field_e;
    static int field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 92) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, int param4, be param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        db[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        db[] var10 = null;
        eb var11 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!param5.b((byte) -100)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (~param1 == param3) {
            var10 = a.a(param5, -119);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_d == param0 &&
                var10[var8].field_b == param4 && ((param2 == 0 ||
                param2 == var10[var8].field_a) &&
                (var7_int == 0 ||
                !(param1 >= var10[var8].field_e)))) {
                param1 = var10[var8].field_e;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param5.a(param1, param0, param2, param3 + 28253, param4);
          while (var11.field_a == 0) {
            hb.a(10L, param3 + 122);
          }
          var7 = (java.awt.Frame) (var11.field_g);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (var11.field_a != 2) {
            stackIn_38_0 = var7;
            return stackIn_38_0;
          }
          tj.a(param5, var7, -23144);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        bm.field_d.a((byte) 82, param1, 0);
    }

    static {
        field_d = new int[12];
        field_d[1] = 1;
        field_d[4] = 5000;
        field_d[5] = 1000;
        field_d[3] = 5000;
        field_d[6] = 1;
        field_d[7] = 10;
        field_d[10] = 10;
        field_d[8] = 1;
        field_d[2] = 10;
        field_d[11] = 5000;
        field_d[0] = 1;
        field_d[9] = 10;
        field_e = "Unpacking music";
    }
}
