/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_b;
    static int field_a;

    final static String a(int param0, int param1) {
        String stackIn_16_0 = null;
        String var2;
        String var3;
        if (param1 != 19435) {
          ui.a(65, -11);
        }
        var2 = ll.field_m[param0];
        if (param0 == 10 && (g.field_Hb == 0 ||
          dc.field_z == 0 ||
          g.field_Hb == 12 ||
          12 == dc.field_z ||
          g.field_Hb == 1 ||
          dc.field_z == 1)) {
          var2 = ll.field_m[9];
        }
        if (param0 == 28) {
          if (!gl.field_Lb) {
            stackIn_16_0 = ql.field_g;
          } else {
            stackIn_16_0 = go.field_V;
          }
          var3 = stackIn_16_0;
          var2 = uf.field_b + var3;
        }
        return var2;
    }

    final static void a(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fn var4 = null;
        al var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        wj var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = DungeonAssault.field_K;
        try {
          if (param0 != 30592) {
            return;
          }
          var27 = ra.field_c;
          var2 = var27.c(true);
          if (var2 == 0) {
            var3 = var27.k(param0 - 30592);
            var4_ref = (al) (hg.field_n.e(-24172));
            while (var4_ref != null) {
              if (var3 != var4_ref.field_k) {
                var4_ref = (al) (hg.field_n.a(param0 ^ 30596));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              tl.a(-68);
              return;
            }
            var5 = var27.c(true);
            if (var5 == 0) {
              var4_ref.a(false);
              return;
            }
            var6 = var4_ref.field_l;
            lg.field_x[0].field_d = null;
            lg.field_x[0].field_e = false;
            lg.field_x[0].field_a = tc.field_u;
            var7 = var4_ref.field_p;
            for (var8_int = 1; var5 > var8_int; var8_int++) {
              lg.field_x[var8_int].field_a = var27.d(-122);
              lg.field_x[var8_int].field_e = false;
              if (var27.c(true) != 1) {
                lg.field_x[var8_int].field_d = null;
              } else {
                lg.field_x[var8_int].field_d = var27.d(-125);
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var34 = new long[3][var6];
            var35 = new int[3][var7 * var6];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var27.c(true);
            if (var18 <= 0) {
              var4_ref.a(false);
              return;
            }
            for (var19 = 0; var18 > var19; var19++) {
              var20 = var27.c(true);
              var21 = lg.field_x[var20].field_a;
              var22 = var27.c((byte) 89);
              var24 = var27.field_o;
              if (var19 < var6) {
                var8[0][var12] = var21;
                var9[0][var12] = lg.field_x[var20].field_d;
                var34[0][var12] = var22;
                var12++;
                for (var25 = 0; var7 > var25; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var35[0][incrementValue$0] = var27.h(-99);
                }
              }
              if (var21 != null &&
                eh.a(true, var21)) {
                var8[1][var13] = tc.field_u;
                var9[1][var13] = null;
                var34[1][var13] = var22;
                var27.field_o = var24;
                var13++;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var35[1][incrementValue$1] = var27.h(-37);
                }
              }
              if (var14 < var6 &&
                !lg.field_x[var20].field_e) {
                lg.field_x[var20].field_e = true;
                var8[2][var14] = var21;
                var9[2][var14] = lg.field_x[var20].field_d;
                var34[2][var14] = var22;
                var27.field_o = var24;
                var14++;
                for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var35[2][incrementValue$2] = var27.h(md.b(param0, -30643));
                }
              }
            }
            var4_ref.a(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.k(param0 - 30592);
            var27.c((byte) 68);
            var4 = (fn) (cb.field_a.e(-24172));
            while (var4 != null) {
              if (var3Lifetime1 != var4.field_r) {
                var4 = (fn) (cb.field_a.a(4));
                continue;
              }
              break;
            }
            if (var4 != null) {
              var4.a(false);
              return;
            }
            tl.a(-96);
            return;
          }
          sm.a((Throwable) null, 1, "HS1: " + sj.l(192));
          tl.a(-33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ui.A(" + param0 + ')');
        }
    }

    static {
    }
}
