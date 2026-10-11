/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lkb {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 199) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 < -100) {
          var2 = (-640 + gp.field_p) / 2;
          var3 = ldb.field_o * ldb.field_o;
          var4 = var3 - param0 * param0;
          rga.field_g.a(var2 - 199 * var4 / var3, 122, 199, 90, -94 + (-120 + dma.field_j));
          vva.field_r.a(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + dma.field_j);
          return;
        }
        lkb.a(92);
        var2Lifetime1 = (-640 + gp.field_p) / 2;
        var3Lifetime1 = ldb.field_o * ldb.field_o;
        var4Lifetime1 = var3Lifetime1 - param0 * param0;
        rga.field_g.a(var2Lifetime1 - 199 * var4Lifetime1 / var3Lifetime1, 122, 199, 90, -94 + (-120 + dma.field_j));
        vva.field_r.a(var2Lifetime1 + 202 + 438 * var4Lifetime1 / var3Lifetime1, 26, 438, 0, -124 + dma.field_j);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static lkb a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lkb var5 = null;
        lkb stackIn_6_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_13_0 = null;
        lkb stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -68) {
            field_a = (int[]) null;
          }
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_10_0 = br.field_f;
              return stackIn_10_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = hca.a((byte) 108, var3);
            if (var5 == null) {
              stackIn_15_0 = ofb.a(0, var4);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_6_0 = gca.field_r;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("lkb.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new int[1];
    }
}
