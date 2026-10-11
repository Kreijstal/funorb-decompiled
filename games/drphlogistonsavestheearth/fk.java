/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends gi {
    static he field_m;
    int field_o;
    int field_s;
    fk field_k;
    static qb field_q;
    static he field_l;
    int field_n;
    static String field_p;
    static int[] field_t;
    static vj field_h;
    int field_j;
    int field_i;
    static String field_r;

    public static void a(byte param0) {
        field_m = null;
        if (param0 == 111) {
          field_p = null;
          field_r = null;
          field_q = null;
          field_t = null;
          field_l = null;
          field_h = null;
          return;
        }
        field_r = (String) null;
        field_p = null;
        field_r = null;
        field_q = null;
        field_t = null;
        field_l = null;
        field_h = null;
    }

    final static nh a(int param0, vj param1, int param2, int param3) {
        RuntimeException var4 = null;
        vj var5 = null;
        nh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 16711680) {
            var5 = (vj) null;
            fk.a(-100, (vj) null, -21, -59);
          }
          if (!fl.a(param2, param1, param0, (byte) -98)) {
            return null;
          }
          stackIn_6_0 = ta.a(param3 ^ 16732209);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param5 < wj.field_g) {
            param1 = param1 - (wj.field_g - param5);
            param5 = wj.field_g;
          }
          if (param2 < wj.field_e) {
            param0 = param0 - (wj.field_e - param2);
            param2 = wj.field_e;
          }
          if (wj.field_b < param5 + param1) {
            param1 = -param5 + wj.field_b;
          }
          if (param0 + param2 > wj.field_j) {
            param0 = -param2 + wj.field_j;
          }
          if (param1 > 0 &&
            param0 > 0) {
            var6_int = param5 + wj.field_k * param2;
            var8 = 9 % ((22 - param4) / 43);
            var7 = wj.field_k - param1;
            for (param2 = -param0; param2 < 0; param2++) {
              for (param5 = -param1; param5 < 0; param5++) {
                var9 = wj.field_l[var6_int];
                if (param3 < (255 & var9 >> 8) &&
                  (255 & var9 >> 16) <= (255 & var9 >> 8)) {
                  var10 = (510 & var9 >> 15) - 60;
                  if (var10 > 255) {
                    var10 = 255;
                  }
                  var11 = 65280 & var9;
                  var11 = 65280 & (var11 >> 1) - (var11 >> 5);
                  var12 = (255 & var9) >> 3;
                  wj.field_l[var6_int] = li.a(li.a(var10 << 16, var11), var12);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var6), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fk(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param4;
        this.field_n = param3;
        this.field_s = param0;
        this.field_i = param2;
        this.field_o = param1;
    }

    static {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_t = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680};
        field_r = "Name is available";
    }
}
