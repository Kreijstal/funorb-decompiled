/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int[] field_e;
    static String field_g;
    static boolean field_b;
    int field_h;
    static ek[] field_c;
    static qd field_i;
    static int field_d;
    static li field_a;
    static String field_f;

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        field_c = null;
        field_g = null;
        field_e = null;
        if (param0 != -50) {
          return;
        }
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ua(int param0) {
        this.field_h = param0;
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = stellarshard.field_B;
        try {
          var6_int = (param0 - param1 << 8) / param2.field_w;
          param4 = param4 + param2.field_t;
          param5 = param5 + param2.field_s;
          var7 = (param1 << 8) + var6_int * param2.field_t;
          var8 = param4 + param5 * ti.field_i;
          var9 = 0;
          var10 = param2.field_y;
          var11 = param2.field_v;
          var12 = ti.field_i - var11;
          var13 = param3;
          if (param5 < ti.field_f) {
            var14 = ti.field_f - param5;
            param5 = ti.field_f;
            var8 = var8 + ti.field_i * var14;
            var10 = var10 - var14;
            var9 = var9 + var14 * var11;
          }
          if (param4 < ti.field_e) {
            var14Lifetime1 = ti.field_e - param4;
            var9 = var9 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            param4 = ti.field_e;
            var7 = var7 + var14Lifetime1 * var6_int;
          }
          if (var10 + param5 > ti.field_l) {
            var10 = var10 - (param5 + var10 - ti.field_l);
          }
          if (ti.field_c < var11 + param4) {
            var14Lifetime2 = -ti.field_c + param4 + var11;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param5 = -var10; param5 < 0; param5++) {
              var14Lifetime3 = var7;
              for (param4 = -var11; param4 < 0; param4++) {
                var15 = var14Lifetime3 >> 8;
                var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (0 <= var15) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param2.field_z[incrementValue$0];
                  if (0 != var17) {
                    if (var15 > 255) {
                      ti.field_a[var8] = var17;
                    } else {
                      var18 = ti.field_a[var8];
                      var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8 & 16711935;
                      ti.field_a[var8] = (sa.a(16711841, var15 * sa.a(65280, var17) + var16 * sa.a(65280, var18)) >> 8) + var19;
                    }
                  }
                  var8++;
                } else {
                  var9++;
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_e = new int[8192];
        field_g = "Unpacking graphics";
        field_i = new qd(1);
        field_a = new li(0, 2, 2, 1);
        field_f = "Play the game without logging in just yet";
    }
}
