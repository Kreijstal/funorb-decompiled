/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static long field_e;
    int field_d;
    int field_g;
    int field_f;
    static String field_a;
    int field_c;
    int field_b;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -20 % ((param0 + 59) / 49);
    }

    final static void a(ei param0, boolean param1, ei param2, int param3, ei param4, ei param5) {
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (!param1) {
            ul.a((byte) -113);
          }
          if (param3 == 1) {
            for (var6_int = 0; param0.field_e > var6_int; var6_int++) {
              for (var7 = 0; var7 < param4.field_e; var7++) {
                qf.a(param5, (vj) (param0.field_b[var6_int]), param3, -3, var6_int, (vj) (param4.field_b[var7]), var7, param2);
              }
            }
            return;
          }
          var6_intLifetime1 = 0;
          while (true) {
            if (param0.field_e <= var6_intLifetime1) {
              return;
            }
            var9 = var6_intLifetime1 + 2;
            var7Lifetime1 = var9;
            while (true) {
              stackIn_17_0 = ~var9;
              if (var6_intLifetime1 != 0) {
                stackIn_18_1 = param0.field_e;
              } else {
                stackIn_18_1 = param0.field_e - 1;
              }
              if (stackIn_17_0 > ~stackIn_18_1) {
                qf.a(param5, (vj) (param0.field_b[var6_intLifetime1]), param3, -3, var6_intLifetime1, (vj) (param0.field_b[var9]), var9, param2);
                var9++;
                continue;
              }
              break;
            }
            var6_intLifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("ul.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    ul(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param1;
        this.field_c = param2;
        this.field_b = param0;
        this.field_g = param4;
        this.field_d = param3;
    }

    static {
        field_a = "Unpacking sound effects";
    }
}
