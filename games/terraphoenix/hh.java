/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends uf {
    static String field_l;
    static String field_p;
    int field_h;
    hh field_j;
    int field_q;
    int field_n;
    int field_o;
    int field_i;
    static ci field_m;
    static String field_k;

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        field_k = null;
        if (param0 != 255) {
          return;
        }
        field_m = null;
    }

    hh(int param0, int param1, int param2, int param3, int param4) {
        this.field_q = param3;
        this.field_h = param4;
        this.field_n = param1;
        this.field_o = param2;
        this.field_i = param0;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
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
        var13 = Terraphoenix.field_V;
        try {
          if (l.field_b > param3) {
            param0 = param0 - (l.field_b - param3);
            param3 = l.field_b;
          }
          if (param5 < l.field_d) {
            param2 = param2 - (-param5 + l.field_d);
            param5 = l.field_d;
          }
          var6_int = -100 / ((72 - param1) / 38);
          if (param0 + param3 > l.field_f) {
            param0 = -param3 + l.field_f;
          }
          if (param2 + param5 > l.field_c) {
            param2 = -param5 + l.field_c;
          }
          if (param0 > 0 &&
            param2 > 0) {
            var7 = param3 + param5 * l.field_k;
            var8 = -param0 + l.field_k;
            for (param5 = -param2; param5 < 0; param5++) {
              for (param3 = -param0; param3 < 0; param3++) {
                var9 = l.field_i[var7];
                if (param4 < (255 & var9 >> 8) &&
                  (65280 & var9) >> 8 >= (var9 >> 16 & 255)) {
                  var10 = (var9 >> 15 & 510) - 60;
                  if (var10 > 255) {
                    var10 = 255;
                  }
                  var11 = 65280 & var9;
                  var11 = -(var11 >> 5) + (var11 >> 1) & 65280;
                  var12 = 31 & var9 >> 3;
                  l.field_i[var7] = ei.b(var12, ei.b(var10 << 16, var11));
                }
                var7++;
              }
              var7 = var7 + var8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var6), "hh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_p = "P-1 PG";
        field_l = "pts";
        field_k = "Loading...";
        field_m = null;
    }
}
