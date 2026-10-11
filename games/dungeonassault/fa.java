/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends ne {
    static String field_k;
    static boolean field_j;
    int field_l;
    ne field_o;
    static String field_m;
    static int field_i;
    ni field_n;

    final static int a(byte param0, int param1, int param2) {
        if (-1 == ce.field_p) {
          return hc.field_b;
        }
        int var5 = 119 / ((-85 - param0) / 41);
        double var3 = (double)ce.field_p / 50.0;
        double var6 = (-Math.cos(3.141592653589793 * var3) + 1.0) / 2.0;
        return (int)(var6 * (double)(param2 - param1)) + param1;
    }

    final static cn a(int param0, byte param1, int param2, int param3, int param4, cn param5) {
        int var12 = 0;
        cn stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = DungeonAssault.field_K;
        try {
          var6_int = 0;
          var7 = 0;
          if (param3 < 0) {
            var6_int = var6_int - param3;
            param4 = param4 + param3;
            param3 = 0;
          }
          if (param0 < 0) {
            param2 = param2 + param0;
            var7 = var7 - param0;
            param0 = 0;
          }
          if (gf.field_i < param4 + param3) {
            param4 = gf.field_i - param3;
          }
          if (param0 + param2 > gf.field_c) {
            param2 = -param0 + gf.field_c;
          }
          if (param4 < 0) {
            return null;
          }
          if (0 > param2) {
            return null;
          }
          if (param1 <= 92) {
            field_j = false;
          }
          if (param5 == null ||
            !(param5.field_y >= param4) ||
            !(param5.field_v >= param2)) {
            param5 = new cn(param4, param2);
          }
          var8 = -param4 + gf.field_i;
          var9 = -param4 + param5.field_y;
          var10 = param3 + gf.field_i * param0;
          var11 = -1;
          for (var12 = -param2; var12 < 0; var12++) {
            var13 = -param4;
            while (0 > var13) {
              var11++;
              param5.field_B[var11] = gf.field_b[var10];
              var13++;
              var10++;
            }
            var11 = var11 + var9;
            var10 = var10 + var8;
          }
          param5.field_w = var6_int;
          param5.field_A = var7;
          stackIn_29_0 = (cn) (param5);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("fa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_m = null;
        if (param0 != -28822) {
          fa.a((byte) -16, -26, 56);
        }
    }

    final void a(int param0, int param1) {
        int var3 = -119 / ((param1 + 68) / 41);
        this.field_l = param0;
        this.field_n.h(128 + oo.field_d * param0 >> 8);
    }

    fa(ni param0, ne param1) {
        try {
          this.field_n = param0;
          this.field_l = param0.i();
          this.field_o = param1;
          this.field_n.h(oo.field_d * this.field_l + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Achieved";
        field_k = "A vast pit occupies almost all of this room, except for a narrow ledge. There is no way to gauge its depth. A raider who falls here will continue falling for some time.<br><br>This trap will kill defeated raiders, even if they have abilities that would normally prevent death.";
    }
}
