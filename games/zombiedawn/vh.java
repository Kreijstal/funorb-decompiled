/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static ec field_a;
    static vn[] field_e;
    static nk field_d;
    static int field_b;
    static sd field_c;

    final static void a(v param0, int param1, int param2, int param3, int param4, byte param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
        v var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = ZombieDawn.field_J;
        try {
          var6_int = (param1 - param2 << 8) / param0.field_a;
          param3 = param3 + param0.field_g;
          param4 = param4 + param0.field_h;
          var7 = (param2 << 8) + var6_int * param0.field_g;
          var8 = bi.field_f * param4 + param3;
          var9 = 0;
          var10 = param0.field_d;
          var11 = param0.field_j;
          var12 = -var11 + bi.field_f;
          var13 = 0;
          if (param4 < bi.field_l) {
            var14 = bi.field_l - param4;
            param4 = bi.field_l;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            var8 = var8 + bi.field_f * var14;
          }
          if (bi.field_d < var10 + param4) {
            var10 = var10 - (param4 + (var10 - bi.field_d));
          }
          if (bi.field_g > param3) {
            var14Lifetime1 = bi.field_g - param3;
            var7 = var7 + var14Lifetime1 * var6_int;
            param3 = bi.field_g;
            var8 = var8 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (param3 + var11 > bi.field_b) {
            var14Lifetime2 = var11 + param3 - bi.field_b;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (param5 != 84) {
            var21 = (v) null;
            vh.a((v) null, -118, 46, -65, -1, (byte) -59);
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; param4 < 0; param4++) {
              var14Lifetime3 = var7;
              for (param3 = -var11; param3 < 0; param3++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param0.field_l[param0.field_k[incrementValue$0] & 255];
                  if (0 != var17) {
                    if (var15 <= 255) {
                      var18 = bi.field_c[var8];
                      var19 = 16711935 & (16711935 & var17) * var15 + var16 * (var18 & 16711935) >> 8;
                      bi.field_c[var8] = (eg.a(eg.a(var17, 65280) * var15 + var16 * eg.a(65280, var18), 16711732) >> 8) + var19;
                    } else {
                      bi.field_c[var8] = var17;
                    }
                  }
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
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("vh.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 92 % ((param0 + 17) / 32);
        field_d = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = new nk(2);
        field_b = 0;
        field_c = new sd();
    }
}
