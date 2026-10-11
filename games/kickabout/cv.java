/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cv {
    static int field_d;
    static boolean field_e;
    static ut[][] field_b;
    static int[] field_a;
    static String field_c;
    static String field_g;
    static hu field_f;

    final static void a(int param0) {
        int incrementValue$45 = 0;
        int incrementValue$44 = 0;
        int incrementValue$43 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int incrementValue$54 = 0;
        int incrementValue$55 = 0;
        int incrementValue$56 = 0;
        int incrementValue$57 = 0;
        int incrementValue$58 = 0;
        int incrementValue$59 = 0;
        int incrementValue$60 = 0;
        int incrementValue$61 = 0;
        int incrementValue$62 = 0;
        int incrementValue$63 = 0;
        int incrementValue$64 = 0;
        int incrementValue$65 = 0;
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int incrementValue$68 = 0;
        int incrementValue$69 = 0;
        int var1_int = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ut var3_ref_ut = null;
        int var4 = 0;
        int var5 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (rm.field_C != 0) {
            if (rm.field_C == 1) {
              oi.field_e = new oh[26];
              var1_int = 0;
              for (var2 = 0; var2 < 14; var2++) {
                var3_ref_ut = oo.field_b[p.a((byte) -24, 3)];
                var4 = -280;
                var5 = -200 + var2 * 130;
                if (p.a((byte) -24, 2) == 0) {
                  var4 = -110 + (-var4 + 896);
                }
                incrementValue$45 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$45] = new oh(var3_ref_ut, var4, var5);
              }
              var2Lifetime1 = -40;
              for (var3 = 0; var3 < 6; var3++) {
                incrementValue$44 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$44] = new oh(ku.field_g[p.a((byte) -24, 2)], var2Lifetime1, 1394);
                stackIn_17_0 = var2Lifetime1;
                if (0 == (var3 & 1)) {
                  stackIn_18_1 = 95;
                } else {
                  stackIn_18_1 = 265;
                }
                var2Lifetime1 = stackIn_17_0 + stackIn_18_1;
              }
              var2Lifetime2 = -40;
              for (var3Lifetime1 = 0; var3Lifetime1 < 6; var3Lifetime1++) {
                incrementValue$43 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$43] = new oh(ku.field_g[p.a((byte) -24, 2)], var2Lifetime2, -90);
                stackIn_22_0 = var2Lifetime2;
                stackIn_22_1 = ~(1 & var3Lifetime1);
                stackIn_22_2 = -1;
                if (stackIn_22_1 != stackIn_22_2) {
                  stackIn_25_1 = 265;
                } else {
                  stackIn_25_1 = 95;
                }
                var2Lifetime2 = stackIn_22_0 + stackIn_25_1;
              }
            } else {
              if (rm.field_C == 2) {
                oi.field_e = new oh[5];
                var1_int = 0;
                incrementValue$46 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$46] = new oh(oo.field_b[1], 1002, -229);
                incrementValue$47 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$47] = new oh(oo.field_b[2], 1126, -206);
                incrementValue$48 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$48] = new oh(oo.field_b[0], -332, 200);
                incrementValue$49 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$49] = new oh(oo.field_b[0], -170, 1428);
                incrementValue$50 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$50] = new oh(oo.field_b[1], -296, 1415);
              } else {
                if (rm.field_C == 3) {
                  oi.field_e = new oh[]{};
                }
              }
            }
          } else {
            oi.field_e = new oh[19];
            var1_int = 0;
            incrementValue$51 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$51] = new oh(oo.field_b[0], -156, -31);
            incrementValue$52 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$52] = new oh(oo.field_b[2], 933, 763);
            incrementValue$53 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$53] = new oh(oo.field_b[0], 943, -36);
            incrementValue$54 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$54] = new oh(oo.field_b[0], -141, 1275);
            incrementValue$55 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$55] = new oh(ku.field_g[0], -390, 629);
            incrementValue$56 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$56] = new oh(ku.field_g[1], -264, 584);
            incrementValue$57 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$57] = new oh(ku.field_g[1], -357, 447);
            incrementValue$58 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$58] = new oh(ku.field_g[0], -259, 379);
            incrementValue$59 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$59] = new oh(oo.field_b[0], 180, 1371);
            incrementValue$60 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$60] = new oh(oo.field_b[1], 566, 1422);
            incrementValue$61 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$61] = new oh(oo.field_b[0], 750, 1353);
            incrementValue$62 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$62] = new oh(oo.field_b[2], 51, 1415);
            incrementValue$63 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$63] = new oh(oo.field_b[1], 1014, 211);
            incrementValue$64 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$64] = new oh(oo.field_b[2], 775, -174);
            incrementValue$65 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$65] = new oh(oo.field_b[1], 570, -220);
            incrementValue$66 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$66] = new oh(oo.field_b[0], 211, -199);
            incrementValue$67 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$67] = new oh(oo.field_b[2], -31, -163);
            incrementValue$68 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$68] = new oh(oo.field_b[1], -288, 1213);
            incrementValue$69 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$69] = new oh(oo.field_b[2], -200, 1041);
          }
          if (param0 != 11383) {
            field_e = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "cv.J(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = Kickabout.field_G;
        try {
          if (null == ra.field_G) {
            return;
          }
          if (cq.field_h instanceof rm) {
            ug.field_e = null;
          }
          ra.field_G.a(256, true, -91, cq.field_h);
          cq.field_h = ra.field_G;
          ra.field_G = null;
          ce.field_I = 0;
          wr.field_f = po.a(cq.field_h, -4);
          if (wi.field_B) {
            sr.field_l = null;
            wi.field_B = false;
          }
          if (al.field_Db) {
            um.field_e = null;
            al.field_Db = false;
            oa.b(-23217);
            mv.$cfr$intArgs$a$6121ff5511c4(119);
            el.g(0);
          }
          if (mc.field_j) {
            vs.field_g = null;
            ve.field_R = new tf();
            var9 = bh.field_f;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
              var9[var2] = 0;
            }
            var10 = ha.field_F;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (var6 < 8) {
              var10[var6] = 0;
              var6++;
            }
            mc.field_j = false;
          }
          if (k.field_k) {
            vc.f((byte) 119);
            vr.a(-2);
            qg.a(0);
            k.field_k = false;
          }
          if (param0 < 42) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "cv.I(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        field_a = null;
        field_b = (ut[][]) null;
        if (param0 > -5) {
          cv.a(117);
        }
    }

    static {
        field_e = true;
        field_b = new ut[3][4];
        field_a = new int[6];
        field_a[0] = 1549;
        field_a[4] = -1;
        field_a[5] = -1;
        field_a[2] = 1049;
        field_a[3] = 3049;
        field_a[1] = 799;
        field_g = "The invitation has been withdrawn.";
    }
}
