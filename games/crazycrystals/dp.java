/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends jb {
    int field_f;
    boolean field_k;
    static String field_j;
    static int field_h;
    static String field_i;
    int[] field_g;

    public static void a(int param0) {
        field_j = null;
        int var1 = -70 % ((-87 - param0) / 39);
        field_i = null;
    }

    final static f[][] a(int param0, int param1, int param2, String[] param3, int param4, int param5) {
        f[][] stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        f[][] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bb var10 = null;
        int var11 = 0;
        f[][] var12 = null;
        int var13 = 0;
        f[][] var14 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        var11 = CrazyCrystals.field_B;
        try {
          if (param1 != -27919) {
            field_j = (String) null;
          }
          var12 = new f[param5][param0];
          var14 = var12;
          var6 = var14;
          for (var7 = 0; param0 > var7; var7++) {
            var12[0][var7] = aj.field_s;
          }
          for (var7Lifetime1 = 1; -1 + param5 > var7Lifetime1; var7Lifetime1++) {
            var14[var7Lifetime1][0] = aj.field_s;
            for (var8 = 1; var8 < param0 - 1; var8++) {
              var14[var7Lifetime1][var8] = bm.field_g;
            }
            var14[var7Lifetime1][-1 + param0] = aj.field_s;
          }
          for (var7Lifetime2 = 0; var7Lifetime2 < param0; var7Lifetime2++) {
            var6[param5 - 1][var7Lifetime2] = aj.field_s;
          }
          for (var7Lifetime3 = 0; var7Lifetime3 < param3.length; var7Lifetime3++) {
            var13 = 0;
            var8Lifetime1 = var13;
            while (var13 < param3[0].length()) {
              var9 = param3[var7Lifetime3].charAt(var13);
              if (var9 == 64 ||
                42 == var9) {
                var10 = new bb(bm.field_g);
                var10.field_p = 2;
                var6[-param3.length + param2 + var7Lifetime3][param4 + var13] = (f) ((Object) var10);
              }
              if (var9 == 42) {
                var6[param2 - param3.length + var7Lifetime3][var13 + param4] = (f) ((Object) new jo(bm.field_g, 0));
              }
              if (var9 == 35) {
                var6[var7Lifetime3 + param2 - param3.length][var13 + param4] = (f) ((Object) new pj(0, 0, bm.field_g));
              }
              if (var9 == 47) {
                var6[param2 - param3.length + var7Lifetime3][var13 + param4] = (f) ((Object) new pj(0, 1, bm.field_g));
              }
              if (var9 == 76) {
                var6[var7Lifetime3 + (-param3.length + param2)][param4 + var13] = (f) ((Object) new pj(0, 2, bm.field_g));
              }
              if (var9 == 96) {
                var6[var7Lifetime3 + (-param3.length + param2)][param4 + var13] = (f) ((Object) new pj(0, 3, bm.field_g));
              }
              if (39 == var9) {
                var6[var7Lifetime3 - param3.length + param2][param4 + var13] = (f) ((Object) new pj(0, 4, bm.field_g));
              }
              var13++;
            }
          }
          no.a(0, -8383, 0, var14);
          stackIn_42_0 = var6;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_45_0 = var6_ref;
          stackIn_45_1 = new StringBuilder().append("dp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    dp() {
        this.field_k = false;
    }

    static {
        field_j = "Loading graphics";
        field_h = 0;
        field_i = "Go Back";
    }
}
