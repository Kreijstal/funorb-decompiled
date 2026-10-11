/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends pi {
    static ea[][] field_o;
    static String field_r;
    static int field_p;
    static int field_n;
    byte[] field_s;
    static String field_q;

    final static void a(int param0, int param1, ln param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
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
        var20 = MinerDisturbance.field_ab;
        try {
          var6_int = (param0 - param1 << 8) / param2.field_j;
          var7 = (param1 << 8) + param2.field_b * var6_int;
          param5 = param5 + param2.field_b;
          param3 = param3 + param2.field_e;
          var8 = param3 * eh.field_g + param5;
          var9 = param4;
          var10 = param2.field_f;
          var11 = param2.field_a;
          var12 = eh.field_g - var11;
          if (param3 < eh.field_d) {
            var14 = eh.field_d - param3;
            var9 = var9 + var14 * var11;
            param3 = eh.field_d;
            var10 = var10 - var14;
            var8 = var8 + eh.field_g * var14;
          }
          var13 = 0;
          if (param5 < eh.field_a) {
            var14Lifetime1 = eh.field_a - param5;
            var12 = var12 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var9 = var9 + var14Lifetime1;
            param5 = eh.field_a;
            var8 = var8 + var14Lifetime1;
          }
          if (param3 + var10 > eh.field_e) {
            var10 = var10 - (-eh.field_e + (var10 + param3));
          }
          if (eh.field_k < var11 + param5) {
            var14Lifetime2 = -eh.field_k + param5 + var11;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param3 = -var10; 0 > param3; param3++) {
              var14Lifetime3 = var7;
              for (param5 = -var11; 0 > param5; param5++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param2.field_n[255 & param2.field_m[incrementValue$0]];
                  if (0 != var17) {
                    if (var15 > 255) {
                      eh.field_f[var8] = var17;
                    } else {
                      var18 = eh.field_f[var8];
                      var19 = 16711935 & var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8;
                      eh.field_f[var8] = (c.a(16711707, var16 * c.a(var18, 65280) + var15 * c.a(65280, var17)) >> 8) + var19;
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
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -28581) {
          return;
        }
        field_o = (ea[][]) null;
        field_r = null;
        field_q = null;
    }

    qf(byte[] param0) {
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new ea[2][9];
        field_p = 0;
        field_n = 0;
        field_q = "Anon.";
    }
}
