/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends wf {
    int field_g;
    int field_h;

    final static ti a() {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        int[] var10 = new int[]{5872575, 5872575, 5872319, 5806782, 5806782, 5806526, 5806526, 5740989, 5740989, 5740733, 5740733, 5675196, 5674940, 5674940, 5674939, 5609147, 5609147, 5609147, 5543354, 5543354, 5543354, 5477561, 5477561, 5477561, 5411768, 5411768, 5411768, 5411768, 5345975, 5345975, 5345975, 5280182, 5280182, 5280182, 5214389, 5214389, 5214133, 5214133, 5148596, 5148340, 5148340, 5148340, 5082547, 5082547, 5082291, 5082291, 5016754, 5016498, 5016498, 5016498, 4950705, 4950705, 4950705, 4884912, 4884912, 4884912, 4819119, 4819119, 4819119, 4819119, 4753326, 4753326, 4753326, 4687533, 4687533, 4687533, 4621740, 4621740, 4621740, 4621484, 4555947, 4555947, 4555691, 4555691, 4490154, 4489898, 4489898, 4489898, 4424361, 4424105, 4424105, 4424105, 4358312, 4358312, 4358312, 4292519, 4292519, 4292519, 4226726, 4226726, 4226726, 4160933, 4160933, 4160933, 4160933, 4095140, 4095140, 4095140, 4029347, 4029347, 4029091, 4029091, 3963554, 3963298, 3963298, 3963298, 3897505, 3897505, 3897249, 3897249, 3831712, 3831456, 3831456, 3831456, 3765663, 3765663, 3765663, 3699870, 3699870, 3699870, 3634077, 3634077, 3634077, 3568284, 3568284, 3568284, 3568284, 3502491, 3502491, 3502491, 3436698, 3436698, 3436698, 3436442, 3370905, 3370905, 3370649, 3370649, 3305112, 3304856, 3304856, 3304856, 3239063, 3239063, 3239063, 3239063, 3173270, 3173270, 3173270, 3107477, 3107477, 3107477, 3041684, 3041684, 3041684, 2975891, 2975891, 2975891, 2910098, 2910098, 2910098, 2909842, 2844305, 2844305, 2844049, 2844049, 2778512, 2778256, 2778256, 2778000, 2712463, 2712463, 2712207, 2712207, 2646670, 2646414, 2646414, 2646414, 2580621, 2580621, 2580621, 2514828, 2514828, 2514828, 2449035, 2449035, 2449035, 2383242, 2383242, 2383242, 2317449, 2317449, 2317449, 2317449, 2251656, 2251656, 2251656, 2251400, 2185863, 2185863, 2185607, 2185607, 2120070, 2119814, 2119814, 2119814, 2054021, 2054021, 2054021, 1988228, 1988228, 1988228, 1988228, 1922435, 1922435, 1922435, 1856642, 1856642, 1856642, 1790849, 1790849, 1790849, 1725056, 1725056, 1725056, 1724800, 1659263, 1659263, 1659007, 1659007, 1593214, 1593214, 1593214, 1592958, 1527421, 1527421, 1527165, 1527165, 1461372, 1461372, 1461372, 1395579, 1395579, 1395579, 1395579, 1329786, 1329786, 1329786, 1263993, 1263993, 1263993, 1198200, 1198200, 1198200, 1132407, 1132407, 1132407, 1132151, 1066614, 1066614, 1066614, 1066358, 1000821, 1000821, 1000565, 1000565, 935028, 934772, 934772, 934772, 868979, 868979, 868979, 803186, 803186, 803186, 737393, 737393, 737137, 737137, 671600, 671344, 671344, 605807, 605551, 605551, 539758, 539758, 539758, 539502, 473965, 473965, 473709, 473709, 408172, 408172, 407916, 407916, 342379, 342123, 342123, 342123, 276330, 276330, 276330, 276330, 210537, 210537, 210537, 210537, 144744, 144744, 144744, 144744, 78951, 78951, 78951, 78950, 13158, 13158};
        int[] var1 = var10;
        ti var2 = new ti(640, 480);
        var2.e();
        int var3 = 0;
        int var4 = 637762;
        for (var5 = 0; var5 < 480; var5++) {
            var6 = var4;
            for (var7 = 0; var7 < 640; var7++) {
                var8 = (int)(Math.sqrt((double)var6) / 2.0);
                if (!(var10.length > var8)) {
                    var8 = -1 + var10.length;
                }
                int incrementValue$0 = var3;
                var3++;
                sb.field_h[incrementValue$0] = var10[var8];
                var6 = 1 + var6 - (-(var7 * 8) + 2556);
            }
            var4 = -1915 + 8 * var5 + var4;
        }
        var6 = -90;
        sb.d(0, 0, 640, 480, 65793);
        sb.d(1, 1, 638, 478, 16711422);
        return var2;
    }

    final static boolean d() {
        return db.field_a == of.field_d;
    }

    final static void a(int param0, int param1) {
        vj.field_a = id.field_a[param1];
        dj.field_c = je.field_b[param1];
        od.field_h = ei.field_a[param1];
        if (param0 != 1856642) {
            cf.a(96, -117);
        }
    }

    final static void a(ci param0, ci param1, ci param2, boolean param3) {
        dl.field_l = bh.a(-70, "");
        try {
            dl.field_l.a(false, false);
            int discarded$0 = 2394342;
            aj.a(param0, param1, param2);
            int discarded$1 = 81;
            eg.a();
            db.field_a = jh.field_n;
            rh.field_v = jh.field_n;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "cf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + 122 + ')');
        }
    }

    final static byte[] a(Object param0, boolean param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (!(param0 instanceof dj)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (dj) param0;
                stackOut_10_0 = var4.a(false);
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            } else {
              var3 = (byte[]) param0;
              if (!param1) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = pi.a((byte) -29, var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("cf.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L0;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + 16 + ')');
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
