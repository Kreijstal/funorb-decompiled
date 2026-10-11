/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ara extends jea {
    static jea field_ub;
    static int field_xb;
    static boolean field_wb;
    static String field_yb;
    private jea field_tb;
    static jpa field_vb;

    final boolean a(boolean param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 < 7) {
          field_yb = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        this.c(42, true);
        if ((hf.field_b == 0 ||
          0 != this.field_y) && this.field_tb.field_y == 0) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
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
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var14Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = param5 - param4;
          var7 = -param2 + param3;
          if (var7 == 0) {
            if (0 != var6_int) {
              dfa.a(param2, param5, param4, param1, param0 + 0);
            }
            return;
          }
          if (var6_int == 0) {
            uea.a(param3, param1, param4, param2, false);
            return;
          }
          if (var6_int < 0) {
            var6_int = -var6_int;
          }
          if (var7 < 0) {
            var7 = -var7;
          }
          stackIn_18_0 = (var7 >= var6_int) ? 0 : 1;
          var8 = stackIn_18_0;
          if (var8 != 0) {
            var9 = param2;
            var10 = param3;
            param2 = param4;
            param3 = param5;
            param4 = var9;
            param5 = var10;
          }
          if (param0 != 0) {
            field_xb = 36;
          }
          if (param3 < param2) {
            var9Lifetime1 = param2;
            param2 = param3;
            var10Lifetime1 = param4;
            param3 = var9Lifetime1;
            param4 = param5;
            param5 = var10Lifetime1;
          }
          var9Lifetime2 = param4;
          var10Lifetime2 = param3 - param2;
          var11 = param5 - param4;
          var12 = -(var10Lifetime2 >> 1);
          stackIn_29_0 = (param4 < param5) ? 1 : -1;
          var13 = stackIn_29_0;
          if (var11 < 0) {
            var11 = -var11;
          }
          if (var8 != 0) {
            for (var14 = param2; var14 <= param3; var14++) {
              vaa.field_a[var14][var9Lifetime2] = param1;
              var12 = var12 + var11;
              if (var12 > 0) {
                var12 = var12 - var10Lifetime2;
                var9Lifetime2 = var9Lifetime2 + var13;
              }
            }
            return;
          }
          var16 = param2;
          var14Lifetime1 = var16;
          while (param3 >= var16) {
            var12 = var12 + var11;
            vaa.field_a[var9Lifetime2][var16] = param1;
            if (var12 > 0) {
              var12 = var12 - var10Lifetime2;
              var9Lifetime2 = var9Lifetime2 + var13;
            }
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "ara.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    ara(jea param0, jea param1, jea param2, jea param3, jea param4, jea param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        jea var8 = null;
        jea var9 = null;
        int var10 = 0;
        int var11 = 0;
        jea var13 = null;
        jea var14 = null;
        int var15 = 0;
        jea var17 = null;
        int var10Lifetime1;
        try {
          var17 = new jea(0L, param1, iw.field_a.toUpperCase());
          var17.field_z = 1;
          this.field_tb = new jea(0L, param2);
          var8 = new jea(0L, param3);
          var9 = new jea(0L, param3, kpa.field_b);
          var9.field_z = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; ufa.field_q.length > var12; var12++) {
            var13 = new jea(0L, param3, s.field_b[var12]);
            var14 = new jea(0L, param3, ufa.field_q[var12]);
            var15 = param3.field_H.b(ufa.field_q[var12]);
            if (var11 < var15) {
              var11 = var15;
            }
            var13.a(65, 15, -23776, var10, 20);
            var14.a(640, 15, -23776, var10, 90);
            var8.b(-127, var13);
            var10 += 30;
            var8.b(-126, var14);
          }
          var17.a(20 + var11 + 90, 24, -23776, 0, 0);
          var10 += 15;
          this.a(var17.field_G, var17.field_t + var10, -23776, 100, 100);
          this.field_tb.a(15, 15, -23776, 5, -20 + var17.field_G);
          var8.a(this.field_G, this.field_t - var17.field_t, -23776, var17.field_t, 0);
          var9.a(this.field_G, 15, -23776, 20, 0);
          var8.field_w = hca.c(var8.field_t, 2105376, 3, 11579568, -125, 8421504);
          var17.b(-125, this.field_tb);
          var8.b(-128, var9);
          this.b(-123, var17);
          this.b(-128, var8);
          var10Lifetime1 = -(this.field_t >> 1) + 240;
          this.field_qb = -(this.field_G >> 1) + 320;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("ara.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_yb = null;
        field_ub = null;
        field_vb = null;
        if (param0) {
          ara.a(true);
        }
    }

    static {
        field_yb = "<%0> finished";
    }
}
