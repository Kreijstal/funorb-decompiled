/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wlb extends rqa {
    static dja field_q;
    static int field_p;
    static int field_o;

    final static dj g(byte param0) {
        dj discarded$0 = null;
        if (param0 != -65) {
            discarded$0 = wlb.g((byte) 0);
        }
        return new dj(wpa.a(param0 + 117), sva.e((byte) -34));
    }

    wlb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == 2) {
                break L1;
              } else {
                wlb.f((byte) -69);
                break L1;
              }
            }
            var5_int = 0;
            var6 = param3;
            var7 = -param3;
            ww.a(param0, param3 + param1, rba.field_b[param2], (byte) 75, param1 + -param3);
            var8 = -1;
            L2: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L3: {
                  var8 += 2;
                  var7 = var7 + var8;
                  var5_int++;
                  if (-1 >= (var7 ^ -1)) {
                    var6--;
                    var7 = var7 - (var6 << 1421120641);
                    var9_ref_int__ = rba.field_b[param2 - -var6];
                    var10_ref_int__ = rba.field_b[-var6 + param2];
                    var11_int = param1 - -var5_int;
                    var12_int = param1 - var5_int;
                    ww.a(param0, var11_int, var9_ref_int__, (byte) 75, var12_int);
                    ww.a(param0, var11_int, var10_ref_int__, (byte) 75, var12_int);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var9 = param1 + var6;
                var10 = -var6 + param1;
                var11 = rba.field_b[var5_int + param2];
                var12 = rba.field_b[-var5_int + param2];
                ww.a(param0, var9, var11, (byte) 75, var10);
                ww.a(param0, var9, var12, (byte) 75, var10);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "wlb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 != -70) {
            field_o = -17;
        }
        field_q = null;
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var4_long = 0L;
        Random var4_ref_Random = null;
        int var5 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int[][] var6_array = null;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        wfb var8_ref_wfb = null;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        wfb var16_ref = null;
        Object var17 = null;
        wfb var17_ref = null;
        Object var18 = null;
        wfb var18_ref = null;
        Object var19 = null;
        wfb var19_ref = null;
        wfb var20 = null;
        int[] var21 = null;
        Object var22 = null;
        wfb var22_ref = null;
        int[] var23 = null;
        Object var24 = null;
        wfb var24_ref = null;
        Object var25 = null;
        wfb var25_ref = null;
        int[] var26 = null;
        Object var27 = null;
        wfb var27_ref = null;
        int[] var28 = null;
        Object var29 = null;
        wfb var29_ref = null;
        Object var30 = null;
        wfb var30_ref = null;
        Object var31 = null;
        wfb var31_ref = null;
        Object var32 = null;
        wfb var32_ref = null;
        int[] var33 = null;
        Object var34 = null;
        wfb var34_ref = null;
        int[] var35 = null;
        Object var36 = null;
        wfb var36_ref = null;
        int[] var37 = null;
        Object var38 = null;
        wfb var38_ref = null;
        Object var39 = null;
        wfb var39_ref = null;
        Object var40 = null;
        wfb var40_ref = null;
        int[] var41 = null;
        Object var44 = null;
        wfb var44_ref = null;
        Object var46 = null;
        wfb var46_ref = null;
        Object var48 = null;
        wfb var48_ref = null;
        Object var50 = null;
        wfb var50_ref = null;
        Object var52 = null;
        wfb var52_ref = null;
        Object var54 = null;
        wfb var54_ref = null;
        Object var56 = null;
        wfb var56_ref = null;
        Object var58 = null;
        wfb var58_ref = null;
        Object var60 = null;
        wfb var60_ref = null;
        int[] var61 = null;
        wfb var62 = null;
        int[][] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var78 = null;
        int[][] var79 = null;
        int[] var90 = null;
        int[] var91 = null;
        int[] var92 = null;
        int[] var93 = null;
        int[] var94 = null;
        int[] var95 = null;
        int[] var96 = null;
        int[] var97 = null;
        int[] var98 = null;
        int[] var99 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var22 = null;
        var24 = null;
        var25 = null;
        var27 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var34 = null;
        var36 = null;
        var38 = null;
        var39 = null;
        var40 = null;
        var44 = null;
        var46 = null;
        var48 = null;
        var50 = null;
        var52 = null;
        var54 = null;
        var56 = null;
        var58 = null;
        var60 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              hab.field_g = new wfb[56];
              var16_ref = new wfb(new int[]{5, 0, -5, 4, -5, -4}, 0, 0);
              var16_ref.a(1, new lsb(5, 0, 0));
              var16_ref.a(param0 + -27, new lsb(2, -2, -2048));
              var16_ref.a(102, new lsb(2, 2, 2048));
              var16_ref.a(param0 ^ -56, new lsb(-1, 0, 0));
              var16_ref.a(-120, new lsb(-5, 0, 4096));
              hab.field_g[0] = var16_ref;
              var16_ref.field_w = new int[][]{new int[]{-2564, 0, -2564, -2086, -1456, -1626, -1456, -2233, -745, -2400, -117, -1103, 2559, 0}, new int[]{-515, -1919, 405, -1773, -305, -1501}};
              hab.field_g[1] = new wfb(new int[]{40, 0, 0, 40, -40, 0, 0, -40}, 0, 0);
              hab.field_g[1].a(-119, new lsb(40, 0, 0));
              hab.field_g[1].a(53, new lsb(0, 40, 2048));
              hab.field_g[1].a(-9, new lsb(-40, 0, 4096));
              hab.field_g[1].a(18, new lsb(0, -40, -2048));
              hab.field_g[1].a(1024, true);
              hab.field_g[1].field_h = 1024;
              hab.field_g[2] = new wfb(new int[]{10, 0, 0, 10, -10, 0, 0, -10}, 0, 0);
              hab.field_g[2].a(10, new lsb(10, 0, 0));
              hab.field_g[2].a(31, new lsb(0, 10, 2048));
              hab.field_g[2].a(-120, new lsb(-10, 0, 4096));
              hab.field_g[2].a(param0 + -71, new lsb(0, -10, -2048));
              hab.field_g[2].a(1024, true);
              var17_ref = new wfb(new int[]{2, 0, -2, 1, -2, -1}, 0, 0);
              var17_ref.field_t = new aqa();
              var17_ref.field_w = new int[][]{new int[]{-1024, 0, -1024, -517, -486, -517, -104, -423, 151, -219, 151, 0}};
              hab.field_g[12] = var17_ref;
              var17_ref.field_a = 5;
              var18_ref = new wfb(new int[]{3, 0, -4, 3, -4, -3}, 0, 0);
              var18_ref.field_t = new aqa();
              var18_ref.field_a = 5;
              hab.field_g[13] = var18_ref;
              var18_ref.field_w = new int[][]{new int[]{-2049, 0, -2049, -1547, -1223, -1547, -784, -1108, 376, -1108, 941, -543, 941, 0}};
              var19_ref = new wfb(new int[]{10, 0, -8, 4, -8, -4}, 0, 0);
              var19_ref.field_t = new aqa(46);
              var19_ref.a((byte) -128, 5);
              var19_ref.field_w = new int[][]{new int[]{-4112, 0, -4112, -2233, -2941, -2233, -2313, -1605, 4358, -1605, 5132, -832, 5132, 0}};
              var19_ref.field_a = 5;
              hab.field_g[46] = var19_ref;
              hab.field_g[14] = new wfb(new int[]{2, -1, 2, 1, -2, 0}, -2, 0);
              hab.field_g[14].field_c = new qjb(11);
              hab.field_g[14].field_w = new int[][]{new int[]{-1019, 0, -1019, -402, 658, -402, 658, -203, 1024, -203, 1024, 0}};
              hab.field_g[14].field_a = 0;
              hab.field_g[15] = new wfb(new int[]{5, -1, 5, 1, -5, 3, -5, -3}, -5, 0);
              hab.field_g[15].field_c = new qjb(0);
              hab.field_g[15].field_a = 0;
              hab.field_g[15].field_w = new int[][]{new int[]{-2562, 0, -2562, -1464, -826, -1464, -324, -962, 627, -962, 627, -627, 2562, -627, 2562, 0}};
              hab.field_g[16] = new wfb(new int[]{10, -3, 10, 3, -10, 1, -10, -1}, -10, 0);
              hab.field_g[16].field_c = new qjb(3);
              hab.field_g[16].field_w = new int[][]{new int[]{-5124, 0, -5124, -512, -4810, -826, 1202, -836, 1558, -1192, 4193, -1192, 4538, -1537, 5124, -1532, 5124, 0}};
              hab.field_g[16].field_a = 0;
              hab.field_g[27] = new wfb(new int[]{8, -3, 8, 3, -8, 1, -8, -1}, -8, 0);
              hab.field_g[27].field_c = new qjb(8);
              hab.field_g[27].a((byte) -118, 2);
              hab.field_g[27].field_w = new int[][]{new int[]{-4099, 0, -3911, -606, -2467, -983, 4078, -1547, 3911, -1024, 3220, -794, 2928, 0}};
              hab.field_g[27].field_a = 4;
              hab.field_g[17] = new wfb(new int[]{10, -5, 10, 5, -10, 3, -10, -3}, -10, 0);
              hab.field_g[17].field_c = new qjb(1);
              hab.field_g[17].field_a = 0;
              hab.field_g[19] = new wfb(new int[]{40, 5, -40, 5, -40, -5, 40, -5}, -35, 0);
              hab.field_g[19].a(20, new lsb(40, 0, 0));
              hab.field_g[19].field_e = new kma();
              hab.field_g[20] = new wfb(new int[]{20, 5, -20, 5, -20, -5, 20, -5}, -15, 0);
              hab.field_g[20].a(74, new lsb(20, 0, 0));
              hab.field_g[20].field_e = new kma();
              hab.field_g[29] = new wfb(new int[]{5, -5, 5, 5, -5, 5, -5, -5}, -5, 0);
              hab.field_g[29].a(12, new lsb(5, 0, 0));
              hab.field_g[29].a(-115, new lsb(0, 5, 2048));
              hab.field_g[29].a(param0 + -190, new lsb(0, -5, -2048));
              hab.field_g[29].field_a = 2;
              hab.field_g[23] = new wfb(new int[]{3, -3, 3, 3, -3, 1, -3, -1}, -3, 0);
              hab.field_g[23].field_c = new qjb(4);
              hab.field_g[23].field_w = new int[][]{new int[]{-1537, 0, -1537, -752, -1401, -888, -345, -888, 596, -1819, 1244, -1171, 543, -470, 1537, -470, 1537, 5}};
              hab.field_g[23].field_a = 0;
              hab.field_g[24] = new wfb(new int[]{4, -1, 4, 1, -4, 1, -4, -1}, -4, 0);
              hab.field_g[24].field_c = new qjb(6);
              hab.field_g[24].field_w = new int[][]{new int[]{-2049, 0, -2049, -512, -1045, -512, -1045, -324, -151, -324, -151, -156, 1181, -156, 1537, -512, 2049, 0}};
              hab.field_g[24].field_a = 0;
              hab.field_g[25] = new wfb(new int[]{8, -1, 8, 1, -8, 2, -8, -2}, -8, 0);
              hab.field_g[25].field_c = new qjb(7);
              if (param0 == 64) {
                break L1;
              } else {
                wlb.e((byte) 124);
                break L1;
              }
            }
            hab.field_g[25].field_a = 0;
            hab.field_g[25].field_w = new int[][]{new int[]{-4109, 0, -4109, -1129, 428, -1129, 428, -836, 1871, -836, 1871, -606, 4099, -606, 4099, -130, 1861, -130, 1861, 0}};
            hab.field_g[26] = new wfb(new int[]{6, -4, 6, 4, -6, 3, -6, -3}, -6, 0);
            hab.field_g[26].field_x = new lja();
            hab.field_g[26].a((byte) -103, 0);
            hab.field_g[26].field_w = new int[][]{new int[]{-3074, 0, -3074, -1003, -2854, -1223, -2185, -1223, -1840, -1568, -62, -1568, 428, -2049, 3084, -2049, 3084, -1192, 2562, -1192, 2562, 0}};
            hab.field_g[26].field_a = 4;
            hab.field_g[28] = new wfb(new int[]{3, -3, 3, 3, -3, 3, -3, -3}, 0, 0);
            hab.field_g[28].field_w = new int[][]{new int[]{-1537, 0, -1537, -653, -653, -1537, 653, -1537, 1532, -658, 1532, 5}, new int[]{-658, -1537, 10, -2196, 669, -1537, 1537, -1537, 1537, -669, 2206, 0}, new int[]{-658, -1537, -1537, -1537, -1537, -653, -2196, 0}};
            hab.field_g[42] = new wfb(new int[]{5, -8, 5, 8, -5, 5, -5, -5}, -5, 0);
            hab.field_g[42].field_g = new mua();
            hab.field_g[42].a((byte) -126, 3);
            hab.field_g[42].field_w = new int[][]{new int[]{-2562, 0, -2562, -2572, -1662, -2572, -1662, -2091, -658, -2091, -658, -3994, 282, -3994, 1035, -3618, 1579, -2969, 2081, -2154, 2332, -1171, 2415, 0}};
            hab.field_g[42].field_a = 1;
            hab.field_g[43] = new wfb(new int[]{3, -1, 3, 1, -3, 1, -3, -1}, -3, 0);
            hab.field_g[43].field_c = new qjb(9);
            hab.field_g[43].field_w = new int[][]{new int[]{-1537, 0, -1537, -512, -1045, -512, -1045, -386, -444, -386, -444, -177, 690, -177, 1024, -512, 1537, 0}};
            hab.field_g[43].field_a = 1;
            hab.field_g[44] = new wfb(new int[]{3, -3, 3, 3, -3, 5, -3, -5}, -3, 0);
            hab.field_g[44].field_c = new qjb(10);
            hab.field_g[44].a((byte) -105, 7);
            hab.field_g[44].field_a = 1;
            hab.field_g[44].field_w = new int[][]{new int[]{-1537, 0, -1537, -522, -491, -2572, -73, -2572, -73, -669, 1537, 0}};
            hab.field_g[47] = new wfb(new int[]{20, -18, 20, 18, -11, 18, -11, 5, -20, 5, -20, -5, -11, -5, -11, -18}, -20, 0);
            hab.field_g[47].field_B = 0;
            hab.field_g[47].field_A = new int[][]{new int[]{5, 6, 3, 4}, new int[]{7, 0, 1, 2}};
            hab.field_g[47].field_a = 6;
            hab.field_g[47].field_w = new int[][]{new int[]{-10248, 0, -10248, -1694, -9223, -2718, -7403, -2718, -7403, -1882, -6546, -1882, -6546, -2990, -146, -2990, -146, -1945, 794, -1945, 794, -3346, 3262, -3346, 3241, -4224, -5688, -4224, -5688, -8282, 10227, -8282, 10227, -4224, 4538, -4224, 4559, -3346, 6776, -3346, 6776, -2007, 7654, -2007, 7654, -2949, 9286, -2949, 10248, -1986, 10248, 0}};
            hab.field_g[47].field_q = 0;
            var1_int = 0;
            L2: while (true) {
              if (hab.field_g.length <= var1_int) {
                var1_int = 2560;
                var2 = (int)((double)var1_int * Math.sin(1.0471975511965976));
                hab.field_g[30] = new wfb(new int[]{var2, 0, -var2, var1_int, -var2, -var1_int}, -var2, 0);
                var3 = 1365;
                hab.field_g[30].a(-119, new lsb(0, var1_int / 2, var3));
                hab.field_g[30].a(param0 + 50, new lsb(0, -var1_int / 2, -var3));
                hab.field_g[30].a(106, 15);
                hab.field_g[30].field_a = 2;
                var20 = new wfb(new int[]{-var1_int, -var1_int, var1_int, -var1_int, var1_int - -(var2 * 2), 0, var1_int, var1_int, -var1_int, var1_int}, -var1_int, 0);
                var20.a(-116, new lsb(var1_int - -var2, var1_int / 2, var3));
                var20.a(96, new lsb(var2 + var1_int, -var1_int / 2, -var3));
                var20.a(-126, new lsb(0, var1_int, 2048));
                var20.a(-11, new lsb(0, -var1_int, -2048));
                var20.a(126, 15);
                var20.field_a = 2;
                hab.field_g[31] = var20;
                var4 = -var1_int;
                var5 = var1_int;
                var4 += 0;
                var5 = var5 - 2 * var1_int;
                var4 += 0;
                var5 = var5 - var1_int * 2;
                var4 = var4 + 2 * var1_int;
                var5 += 0;
                var4 += 0;
                var5 = var5 + var1_int * 2;
                var4 += 0;
                var5 = var5 + 2 * var1_int;
                var4 += 0;
                var5 = var5 + var1_int * 2;
                var4 = var4 - 2 * var1_int;
                var5 += 0;
                var21 = new int[]{var4, var5, var4, var5 - 2 * var1_int, var4, var5 - var1_int * 2, var4 + 2 * var1_int, var5, var4, var5 + var1_int * 2, var4, var5 + 2 * var1_int, var4, var5 + var1_int * 2, var4 - 2 * var1_int, var5};
                var6 = var21;
                var22_ref = new wfb(var6, -var1_int, 0);
                ta.a(var21, 124, var22_ref);
                var22_ref.a(105, 15);
                var22_ref.field_a = 2;
                hab.field_g[32] = var22_ref;
                var4 = -var1_int * 3;
                var5 = -var1_int;
                var64 = uca.a(var5, (byte) 9, new int[]{6, 6, 6, 9, 0, 0, 0}, var4);
                var23 = var64;
                var6 = var23;
                var24_ref = new wfb(var6, 3 * -var1_int, 0);
                ta.a(var64, 119, var24_ref);
                var24_ref.a(127, 15);
                var24_ref.field_a = 2;
                hab.field_g[40] = var24_ref;
                var4 = -var2;
                var5 = var1_int;
                var6 = uca.a(var5, (byte) 9, new int[]{3, 3, 7, 9, 9, 11}, var4);
                var25_ref = new wfb(var6, -var2, 0);
                var25_ref.a(param0 + 43, 15);
                var25_ref.field_a = 3;
                hab.field_g[37] = var25_ref;
                var25_ref.field_B = 0;
                var25_ref.field_q = 0;
                var4 = 0;
                var5 = 2 * -var2 + -var1_int;
                var4 = var4 + var1_int;
                var5 = var5 + 2 * var2;
                var4 += 0;
                var5 = var5 + var1_int * 2;
                var4 = var4 - var1_int;
                var5 = var5 + var2 * 2;
                var4 = var4 - var1_int;
                var5 = var5 - var2 * 2;
                var4 += 0;
                var5 = var5 - var1_int * 2;
                var26 = new int[]{var4, var5, var4 + var1_int, var5 + 2 * var2, var4, var5 + var1_int * 2, var4 - var1_int, var5 + var2 * 2, var4 - var1_int, var5 - var2 * 2, var4, var5 - var1_int * 2};
                var6 = var26;
                var27_ref = new wfb(var6, -var1_int, 0);
                ta.a(var26, 127, var27_ref);
                var27_ref.a(118, 15);
                hab.field_g[33] = var27_ref;
                var27_ref.field_a = 2;
                var4 = 5120;
                var5 = 0;
                var6_int = -fnb.field_a + -(var4 / 2);
                var5 = var5 + var4 / 2;
                var6_int = var6_int + fnb.field_a;
                var5 = var5 + var4;
                var6_int += 0;
                var5 += 0;
                var6_int = var6_int + var4;
                var5 = var5 - var4;
                var6_int += 0;
                var5 = var5 - var4 / 2;
                var6_int = var6_int + fnb.field_a;
                var5 = var5 - var4 / 2;
                var6_int = var6_int - fnb.field_a;
                var5 += 0;
                var6_int = var6_int - var4;
                var28 = new int[]{var5, var6_int, var5 + var4 / 2, var6_int + fnb.field_a, var5 + var4, var6_int, var5, var6_int + var4, var5 - var4, var6_int, var5 - var4 / 2, var6_int + fnb.field_a, var5 - var4 / 2, var6_int - fnb.field_a, var5, var6_int - var4};
                var7_ref_int__ = var28;
                var29_ref = new wfb(var7_ref_int__, -var4 / 2, 0);
                ta.a(var28, 114, var29_ref);
                var29_ref.a(110, 15);
                var29_ref.field_a = 2;
                hab.field_g[34] = var29_ref;
                var29_ref.field_A = new int[][]{new int[]{0, 1, 4, 5, 6, 7}, new int[]{1, 2, 3, 4}};
                var4 = -fnb.field_b / 2;
                var5 = -fnb.field_b / 2;
                var6 = uca.a(var5, (byte) 9, new int[]{1, 4, 7, 8, 9, 10, 11, 2, 5}, var4);
                var30_ref = new wfb(var6, -fnb.field_b / 2, 0);
                var30_ref.a(111, 15);
                var30_ref.field_A = new int[][]{new int[]{0, 1, 2, 3}, new int[]{0, 3, 4, 5, 6, 9}, new int[]{6, 7, 8, 9}};
                var30_ref.field_a = 3;
                hab.field_g[35] = var30_ref;
                var30_ref.field_B = 0;
                var30_ref.field_q = 0;
                var4 = -fnb.field_b / 2;
                var5 = 0;
                var6 = uca.a(var5, (byte) 9, new int[]{3, 7, 8, 11, 0}, var4);
                var31_ref = new wfb(var6, -fnb.field_b / 2, -fnb.field_b / 2);
                var31_ref.a(113, 15);
                var31_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4}, new int[]{4, 5, 0}};
                var31_ref.field_a = 3;
                var31_ref.field_B = 0;
                hab.field_g[36] = var31_ref;
                var31_ref.field_q = 0;
                var4 = -fnb.field_b / 2;
                var5 = 0;
                var6 = uca.a(var5, (byte) 9, new int[]{2, 6, 7, 10, 11}, var4);
                var32_ref = new wfb(var6, -fnb.field_b / 2, fnb.field_b / 2);
                var32_ref.a(101, 15);
                var32_ref.field_B = 0;
                var32_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4}, new int[]{4, 5, 0}};
                var32_ref.field_q = 0;
                hab.field_g[51] = var32_ref;
                var32_ref.field_a = 3;
                var4 = -fnb.field_b / 2;
                var5 = 0;
                var65 = uca.a(var5, (byte) 9, new int[]{4, 3, 7, 9, 10, 11}, var4);
                var33 = var65;
                var6 = var33;
                var34_ref = new wfb(var6, -fnb.field_b / 2, fnb.field_b / 2);
                ta.a(var65, 120, var34_ref);
                var34_ref.a(param0 + 63, 15);
                var34_ref.field_a = 2;
                var34_ref.field_A = new int[][]{new int[]{0, 1, 4, 5, 6}, new int[]{1, 2, 3, 4}};
                hab.field_g[38] = var34_ref;
                var4 = -fnb.field_b / 2;
                var5 = -fnb.field_b;
                var66 = uca.a(var5, (byte) 9, new int[]{7, 8, 9, 11, 3, 2}, var4);
                var35 = var66;
                var6 = var35;
                var36_ref = new wfb(var6, -fnb.field_b / 2, -fnb.field_b / 2);
                ta.a(var66, 119, var36_ref);
                var36_ref.a(param0 + 44, 15);
                var36_ref.field_A = new int[][]{new int[]{0, 1, 2, 5, 6}, new int[]{2, 3, 4, 5}};
                hab.field_g[39] = var36_ref;
                var36_ref.field_a = 2;
                var4 = -fnb.field_a;
                var5 = -fnb.field_b / 2;
                var67 = uca.a(var5, (byte) 9, new int[]{5, 7, 9, 11, 1}, var4);
                var37 = var67;
                var6 = var37;
                var38_ref = new wfb(var6, -fnb.field_a, 0);
                ta.a(var67, 118, var38_ref);
                var38_ref.a(114, 15);
                hab.field_g[41] = var38_ref;
                var38_ref.field_a = 2;
                var4 = -fnb.field_a;
                var5 = -fnb.field_b / 2;
                var6 = uca.a(var5, (byte) 9, new int[]{5, 7, 11, 7, 11, 1}, var4);
                var39_ref = new wfb(var6, -fnb.field_a, 0);
                var39_ref.a(108, 15);
                var39_ref.field_a = 4;
                hab.field_g[18] = var39_ref;
                var39_ref.field_B = 512;
                var39_ref.field_w = new int[][]{new int[]{-4454, 0, -4454, -4162, -3492, -5124, 20, -5124, 3681, -5124, 4643, -4162, 4643, -3471, 3670, -3471, 3681, 0}};
                var39_ref.field_A = new int[][]{new int[]{0, 1, 2, 3}, new int[]{0, 4, 5, 6}};
                hab.field_g[18].field_c = new qjb(2);
                hab.field_g[18].a((byte) -121, 6);
                var4 = -fnb.field_a;
                var5 = -fnb.field_b / 2;
                var6 = uca.a(var5, (byte) 9, new int[]{5, 7, 9, 11, 1}, var4);
                var40_ref = new wfb(var6, -fnb.field_a, 0);
                var40_ref.a(111, 15);
                var40_ref.field_n = 125;
                var40_ref.field_y = 50;
                var40_ref.field_w = new int[][]{new int[]{-4444, 0, -4444, -2572, -3011, -1735, -2290, -2269, -2698, -2760, -1129, -3869, -752, -3356, 10, -3848, 10, -5124, 4444, -2572, 3064, -1756, 3064, -941, 3733, -941, 3733, 0}};
                var40_ref.field_a = 6;
                var40_ref.field_d = 1;
                hab.field_g[45] = var40_ref;
                var40_ref.field_B = 896;
                var4 = 6 * -var1_int;
                var5 = 0;
                var4 = var4 + var1_int;
                var5 = var5 + -var2 * 2;
                var4 = var4 + 2 * var2;
                var5 = var5 - var1_int;
                var4 = var4 + var2 * 2;
                var5 = var5 - var1_int;
                var4 = var4 + 2 * var2;
                var5 = var5 + var1_int;
                var4 = var4 + 2 * var1_int;
                var5 += 0;
                var4 = var4 + var2 * 2;
                var5 = var5 - var1_int;
                var4 = var4 + var1_int;
                var5 = var5 + var2 * 2;
                var4 += 0;
                var5 = var5 + 2 * var1_int;
                var41 = new int[]{var4, var5, var4 + var1_int, var5 + -var2 * 2, var4 + 2 * var2, var5 - var1_int, var4 + var2 * 2, var5 - var1_int, var4 + 2 * var2, var5 + var1_int, var4 + 2 * var1_int, var5, var4 + var2 * 2, var5 - var1_int, var4 + var1_int, var5 + var2 * 2, var4, var5 + 2 * var1_int};
                var90 = gca.a((byte) 104, var41);
                var91 = qfa.a(1, var90);
                var44_ref = new wfb(var91, 0, 0);
                ta.a(var91, 114, var44_ref);
                var44_ref.a(param0 ^ 49, 15);
                var44_ref.field_s = true;
                var8_ref_wfb = var44_ref;
                hab.field_g[3] = var44_ref;
                var44_ref.field_A = new int[][]{new int[]{0, 2, 3, 11, 12, 14, 15}, new int[]{3, 4, 10, 11}, new int[]{4, 5, 6, 8, 9, 10}};
                var8_ref_wfb.field_f = true;
                var4 = -fnb.field_b * 4;
                var5 = -fnb.field_b / 2;
                var92 = uca.a(var5, (byte) 9, new int[]{5, 7, 6, 5, 6, 6, 7, 9, 11, 0, 0, 1, 0, 11, 1}, var4);
                var46_ref = new wfb(var92, 0, 0);
                ta.a(var92, 127, var46_ref);
                var46_ref.a(-113, new lsb(fnb.field_b, 0, 4096));
                var46_ref.a(-117, new lsb(3 * -fnb.field_b, 0, 4096));
                var46_ref.a(119, 15);
                var46_ref.field_s = true;
                var8_ref_wfb = var46_ref;
                var8_ref_wfb.field_f = true;
                hab.field_g[4] = var46_ref;
                var46_ref.field_A = new int[][]{new int[]{0, 1, 2, 13, 14, 15}, new int[]{2, 3, 12, 13}, new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
                var4 = 2 * -fnb.field_b;
                var5 = 0;
                var93 = uca.a(var5, (byte) 9, new int[]{3, 5, 2, 5, 8, 9, 6, 6, 7, 9, 11, 0, 0, 9, 10, 1, 4, 1}, var4);
                var48_ref = new wfb(var93, 0, 0);
                ta.a(var93, 116, var48_ref);
                var48_ref.a(param0 + 42, 15);
                var8_ref_wfb = var48_ref;
                var48_ref.field_s = true;
                hab.field_g[5] = var48_ref;
                var8_ref_wfb.field_f = true;
                var48_ref.field_A = new int[][]{new int[]{1, 5, 14, 18}, new int[]{2, 3, 4, 5}, new int[]{6, 8, 9, 10, 11, 13}, new int[]{14, 15, 16, 17}};
                var4 = -fnb.field_b * 2;
                var5 = -fnb.field_b;
                var94 = uca.a(var5, (byte) 9, new int[]{5, 7, 6, 7, 9, 11, 0, 11, 1, 3}, var4);
                var50_ref = new wfb(var94, 0, 0);
                ta.a(var94, 124, var50_ref);
                var50_ref.a(param0 ^ 92, new lsb(-fnb.field_b, 0, 0));
                var50_ref.a(120, 15);
                var50_ref.field_s = true;
                var8_ref_wfb = var50_ref;
                hab.field_g[6] = var50_ref;
                var50_ref.field_A = new int[][]{new int[]{0, 1, 2, 7, 8, 9}, new int[]{2, 3, 4, 5, 6, 7}};
                var8_ref_wfb.field_f = true;
                var4 = -fnb.field_b;
                var5 = -fnb.field_b / 2;
                var95 = uca.a(var5, (byte) 9, new int[]{1, 1, 4, 7, 7, 6, 7, 8, 10, 11, 0, 11, 11, 2, 5, 5}, var4);
                var52_ref = new wfb(var95, 0, 0);
                ta.a(var95, 122, var52_ref);
                var52_ref.a(param0 ^ 37, 15);
                var8_ref_wfb = var52_ref;
                var52_ref.field_s = true;
                hab.field_g[7] = var52_ref;
                var8_ref_wfb.field_f = true;
                var52_ref.field_A = new int[][]{new int[]{0, 2, 3, 5}, new int[]{0, 5, 6, 7, 8, 9, 10, 11, 16}, new int[]{11, 13, 14, 16}};
                var4 = 2 * -fnb.field_b;
                var5 = -fnb.field_b / 2;
                var96 = uca.a(var5, (byte) 9, new int[]{5, 5, 5, 7, 9, 9, 9, 11, 1, 1, 1}, var4);
                var54_ref = new wfb(var96, 0, 0);
                ta.a(var96, param0 ^ 51, var54_ref);
                var54_ref.a(104, 15);
                var8_ref_wfb = var54_ref;
                var54_ref.field_s = true;
                hab.field_g[8] = var54_ref;
                var8_ref_wfb.field_f = true;
                var4 = -fnb.field_b * 6;
                var5 = 0;
                var97 = uca.a(var5, (byte) 9, new int[]{5, 6, 6, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10, 11, 11, 0, 0, 1, 1, 2, 2, 0, 0}, var4);
                var56_ref = new wfb(var97, 0, 0);
                ta.a(var97, 121, var56_ref);
                var56_ref.a(107, 15);
                var56_ref.field_n = 125;
                var56_ref.field_y = 50;
                var56_ref.field_d = 1;
                var8_ref_wfb = var56_ref;
                var56_ref.field_s = true;
                hab.field_g[9] = var56_ref;
                var56_ref.field_A = new int[][]{new int[]{0, 1, 3, 24, 26}, new int[]{3, 5, 7, 9, 11, 13, 14, 16, 18, 20, 22, 24}};
                var8_ref_wfb.field_f = true;
                var4 = -fnb.field_a * 2;
                var5 = -fnb.field_b / 2;
                var98 = uca.a(var5, (byte) 9, new int[]{5, 6, 7, 6, 9, 0, 11, 0, 1}, var4);
                var58_ref = new wfb(var98, 0, 0);
                ta.a(var98, 120, var58_ref);
                var58_ref.a(114, 15);
                var8_ref_wfb = var58_ref;
                var58_ref.field_s = true;
                var58_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 6, 7, 8, 9}, new int[]{3, 4, 5, 6}};
                var8_ref_wfb.field_f = true;
                hab.field_g[10] = var58_ref;
                var4 = -(fnb.field_b / 2) + 4 * -fnb.field_b;
                var5 = fnb.field_b / 2;
                var99 = uca.a(var5, (byte) 9, new int[]{3, 4, 6, 8, 6, 4, 6, 8, 6, 6, 4, 6, 8, 9, 10, 0, 2, 0, 0, 10, 0, 2, 0, 10, 0}, var4);
                var60_ref = new wfb(var99, 0, 0);
                ta.a(var99, 114, var60_ref);
                var60_ref.a(120, 15);
                var60_ref.field_s = true;
                var8_ref_wfb = var60_ref;
                hab.field_g[11] = var60_ref;
                var8_ref_wfb.field_f = true;
                var60_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4, 23, 24, 25}, new int[]{4, 5, 22, 23}, new int[]{5, 6, 7, 8, 19, 20, 21, 22}, new int[]{8, 9, 10, 17, 18, 19}, new int[]{10, 11, 12, 13, 14, 15, 16, 17}};
                var4_long = 32L;
                var6_int = 12;
                var78 = new int[var6_int << 665926529];
                var61 = var78;
                var7_ref_int__ = var61;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= var78.length) {
                    hab.field_g[22] = new wfb(var78, 0, 0);
                    var62 = hab.field_g[22];
                    var62.field_w = new int[][]{new int[]{-8198, 0, -7236, -4099, -4392, -7194, 0, -8198, 3848, -7194, 6943, -4392, 8198, 0}, new int[]{-8198, 0, -8784, -2467, -7236, -4099, -6567, -6400, -4350, -7194, -2551, -8575, 0, -8198, 2509, -8491, 3848, -7194, 5981, -6483, 6901, -4392, 8282, -2509, 8156, 0}};
                    var62.field_a = 0;
                    var62.field_c = new qjb(5);
                    var62.a(128, true);
                    var62.field_p = var62.field_p >> 8;
                    var62.field_u = var62.field_u >> 16;
                    var4_ref_Random = new Random(135435642L);
                    hab.field_g[21] = jba.a(new int[][]{new int[]{-334, -50865, -28779, -43837, -43503, -24094, -43168, 3346, -48857, 21416, -40156, 38149, -5688, 46515, 10708, 38818, 38483, 39152, 53207, 18405, 56888, -9704, 45176, -20747, 36475, -42499, 17735, -44172}, new int[]{-26771, -40826, -38149, -23090, -28779, -3346, -36141, 14724, -26436, 27775, -3011, 18739, 17401, 26101, 42164, 18405, 52538, -7362, 42499, -18405, 33798, -39152, 16732, -40156, -334, -47518}, new int[]{-669, -43837, -21416, -35806, -27105, -25767, -20413, -10708, 334, -13050, 12047, 6692, 31456, 8366, 39822, -7027, 32460, -13385, 30117, -33129, 13385, -35471}}, 1000L, 12, var4_ref_Random, mgb.a((int) param0, 47), 2500L);
                    hab.field_g[48] = jba.a(new int[][]{new int[]{-4684, -53877, -25767, -48522, -29783, -36141, -48522, -21416, -49861, 10039, -29448, 20413, -8700, 41495, 32460, 39152, 45845, 28779, 45845, 6358, 56219, -20747, 46180, -41495, 22086, -50865}, new int[]{-4350, -50530, -20747, -45176, -23424, -32794, -35471, -17735, -28109, 1673, -6692, -334, 17401, 19743, 36475, 18739, 39487, 4350, 50530, -19743, 41830, -37479, 21082, -47853}, new int[]{-4015, -46849, -14389, -40826, -14724, -29783, -17735, -15393, 4350, -11043, 19074, -18739, 36810, -18070, 35806, -32125, 20413, -43503}}, 1000L, 12, var4_ref_Random, mgb.a((int) param0, 61), 2500L);
                    hab.field_g[49] = jba.a(new int[][]{new int[]{-669, -23759, -22086, -18405, -26771, 7027, -10039, 30452, 7027, 33129, 21082, 15058, 34133, 8700, 29113, -9704, 13050, -13720}, new int[]{-2342, -19074, -17735, -13720, -17066, 2342, -1673, 18739, 14389, 12381, 19743, -2677, 8366, -9369}, new int[]{-3011, -14054, -13720, -11043, -8700, 1003, 3681, 5354, 7027, -5354}}, 500L, 12, var4_ref_Random, param0 + 45, 1250L);
                    hab.field_g[50] = jba.a(new int[][]{new int[]{9369, -28109, -12716, -23424, -22420, -5354, -14724, 8366, -10708, 26101, 11377, 30117, 30117, 13385, 27105, -3011, 26771, -21082}, new int[]{8700, -23759, -9035, -19074, -14054, -5354, -5019, 3681, -334, 16062, 16397, 8700, 19074, -15058}, new int[]{7696, -19409, -5354, -15728, -2007, -4350, 10039, 1338, 15058, -13385}}, 500L, 12, var4_ref_Random, mgb.a((int) param0, -10), 1250L);
                    hab.field_g[52] = jba.a(new int[][]{new int[]{1003, -55550, -24428, -54211, -37479, -47184, -39822, -33798, -56888, -20078, -61573, 7696, -48188, 37145, -27105, 40156, -13385, 55884, 19409, 59231, 41160, 46515, 56219, 29448, 50865, 10039, 53207, -6692, 41160, -22755, 39487, -39152, 24763, -50530}, new int[]{-19743, -49192, -31456, -42833, -32794, -27105, -49526, -13385, -48857, 11712, -32125, 21751, -10708, 17066, 8366, 29448, 27440, 29448, 32794, 11043, 43168, -4350, 36810, -19074, 24763, -32125, 22086, -45176, 0, -50865}, new int[]{-17735, -44841, -26101, -39152, -25098, -22420, -37479, -5354, -32794, 8366, -7362, -334, 11712, 4350, 30117, -10708, 16397, -26436, 13720, -41830, -2342, -40156}}, 1500L, 12, var4_ref_Random, -127, 3000L);
                    hab.field_g[53] = jba.a(new int[][]{new int[]{-1003, -63916, -30452, -63581, -39822, -47518, -62912, -37479, -74290, 2007, -61239, 35471, -38818, 40826, -32125, 56888, 1338, 67597, 29448, 58227, 64250, 57558, 77636, 31456, 66928, 7362, 70943, -20747, 46849, -41495, 32125, -60235}, new int[]{-26436, -57892, -32794, -41160, -54546, -30117, -56888, 334, -31790, 15058, -19409, 39152, 13385, 39822, 24094, 13385, 48857, 3681, 54881, -20747, 41830, -34802, 28109, -53877, -669, -59231}, new int[]{-20413, -51534, -24094, -35471, -40156, -20413, -38818, -6023, -13050, 2677, 6023, -13720, 30117, -10708, 37145, -25098, 22755, -46180, -669, -54211}}, 1500L, 12, var4_ref_Random, 123, 3000L);
                    hab.field_g[54] = jba.a(new int[][]{new int[]{-3681, -11294, -11126, -5103, -11126, 5856, 83, 12549, 11294, 8115, 10373, -8533}, new int[]{-3011, -9202, -8700, -4433, -7445, 3681, -501, 5521, 6609, 3262, 7362, -6525}, new int[]{-2509, -7529, -6609, -3764, -2258, 585, 3262, -1422, 4099, -5688}}, 250L, 10, var4_ref_Random, mgb.a((int) param0, -108), 625L);
                    hab.field_g[55] = jba.a(new int[][]{new int[]{-3848, -11377, -12800, -5605, -12632, 6609, -6525, 12130, 10708, 8784, 12800, -250, 4183, -11294}, new int[]{-3346, -9118, -10206, -3764, -8951, 4433, 5186, 6190, 7362, 836, 3179, -8951}, new int[]{-2844, -6943, -7027, -3346, -4099, 1840, 2426, 1338, 1840, -6776}}, 250L, 10, var4_ref_Random, 122, 625L);
                    oea.field_o = 0;
                    gn.field_m = 0;
                    var4 = 0;
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= hab.field_g.length) {
                        kg.field_p = new int[var4];
                        feb.field_b = new int[var4];
                        break L0;
                      } else {
                        L5: {
                          if (tnb.a(130, var5)) {
                            gn.field_m = gn.field_m + 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (fbb.b(var5, 15923)) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (tr.a(125, var5)) {
                            oea.field_o = oea.field_o + 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          var79 = hab.field_g[var5].field_w;
                          var63 = var79;
                          var6_array = var63;
                          if (var6_array != null) {
                            var15 = 0;
                            var7 = var15;
                            L9: while (true) {
                              if (var15 >= var79.length) {
                                break L8;
                              } else {
                                L10: {
                                  var8 = var79[var15].length;
                                  if (var8 > var4) {
                                    var4 = var8;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var15++;
                                continue L9;
                              }
                            }
                          } else {
                            var7 = hab.field_g[var5].field_v.length;
                            if (var7 > var4) {
                              var4 = var7;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    var9 = (8192 * (var8 >> 1411174625) - -8192) / var6_int;
                    var10 = (long)fc.a(var9, (byte) -86) * var4_long >> 405153800;
                    var12 = var4_long * (long)eu.a(var9, param0 ^ 12) >> 1564010952;
                    var7_ref_int__[var8] = (int)var10;
                    var7_ref_int__[var8 + 1] = (int)var12;
                    var8 += 2;
                    continue L3;
                  }
                }
              } else {
                L11: {
                  if (hab.field_g[var1_int] != null) {
                    hab.field_g[var1_int].a(1, 89, true);
                    hab.field_g[var1_int].a(8, param0 + -1, false);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "wlb.D(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = 94;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(27, 82));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wlb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_q = (dja) ((Object) new agb());
        field_p = 0;
    }
}
