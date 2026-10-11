/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends gg {
    int field_m;
    static int field_n;
    int[] field_h;
    static int field_p;
    int field_l;
    int field_i;
    int field_o;
    int field_k;
    int field_j;

    final static void a(byte param0, hf param1) {
        int var2_int = 0;
        hf var3 = null;
        int var4 = 0;
        java.math.BigInteger var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1.field_e == null) {
            return;
          }
          if (param0 != -70) {
            var5 = (java.math.BigInteger) null;
            al.a((gb) null, (gb) null, (byte) 2, (java.math.BigInteger) null, (java.math.BigInteger) null);
          }
          if (0 != param1.field_j ||
            param1.field_a != 0) {
            for (var2_int = 0; field_p > var2_int; var2_int++) {
              var3 = kc.field_K[var2_int];
              if (var3.field_i == 2 &&
                var3.field_j == param1.field_j &&
                param1.field_a == var3.field_a) {
                return;
              }
            }
          }
          if (null == param1.field_g) {
          }
          qg.a(param1, (byte) -92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("al.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7) {
        try {
          this.field_k = param2;
          this.field_l = param0;
          this.field_i = param1;
          this.field_h = param4;
          int var9_int = 10 % ((param3 + 67) / 56);
          this.field_o = param7;
          this.field_j = param6;
          this.field_m = param5;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "al.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(gb param0, gb param1, byte param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
          ci.a(param0.field_l, param0.field_m, 8, param3, 0, param4, param1);
          if (param2 <= 71) {
            java.math.BigInteger var6 = (java.math.BigInteger) null;
            al.a((gb) null, (gb) null, (byte) 9, (java.math.BigInteger) null, (java.math.BigInteger) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "al.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    al() {
    }

    static {
    }
}
