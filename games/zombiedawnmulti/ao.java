/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_a;
    static int field_d;
    int field_f;
    static int field_e;
    static int field_c;
    static ja[] field_b;
    int field_g;
    static ja[] field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 > -21) {
          field_e = -25;
        }
        field_b = null;
        field_a = null;
    }

    final static int[] a(int[] param0, int param1, int[] param2) {
        int var4_int = 0;
        int[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0.length < 1 + param2.length) {
            throw new IllegalArgumentException("The colours array must have at least one more element than the gaps array!");
          }
          var3_int = 0;
          for (var4_int = 0; var4_int < param2.length; var4_int++) {
            var3_int = var3_int + param2[var4_int];
          }
          var4 = new int[var3_int];
          var5 = (16715550 & param0[0]) >> 16;
          var6 = 255 & param0[0] >> 8;
          var7 = 255 & param0[0];
          var8 = param0[1] >> 16 & 255;
          var9 = 255 & param0[1] >> 8;
          var10 = 255 & param0[1];
          var11 = 0;
          var12 = 0;
          var13 = 0;
          while (var3_int > var11) {
            var14 = param2[var12];
            var15 = -var13 + var14;
            var4[var11] = (var6 * var15 / var14 + var9 * var13 / var14 << 8) + ((var8 * var13 / var14 + var15 * var5 / var14 << 16) + var7 * var15 / var14) + var13 * var10 / var14;
            var13++;
            if (var13 >= var14) {
              var13 = 0;
              var5 = var8;
              var7 = var10;
              var12++;
              var6 = var9;
              if (param0.length > 1 + var12) {
                var9 = 255 & param0[var12 + 1] >> 8;
                var10 = param0[var12 + 1] & 255;
                var8 = (16729410 & param0[1 + var12]) >> 16;
              }
            }
            var11++;
          }
          if (param1 != -837539512) {
            field_c = -59;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ao.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    ao(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_g = param0;
    }

    static {
        field_d = 1;
        field_a = "Show all private chat";
    }
}
