/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends dj {
    static int field_E;
    static int field_H;
    static iw field_I;
    static String[] field_F;
    static hd field_G;

    final static void d(boolean param0) {
        nl var1 = null;
        nl var2 = null;
        if (!param0) {
          df.g(57);
        }
        if (0 != et.field_d.field_R[1].field_g) {
          if (et.field_d.field_V.field_m == 1) {
            var1 = et.field_d.a((byte) 104, 0);
            var2 = et.field_d.a((byte) -71, 1);
            ej.b(var1.f(-121) - var2.f(-99), -2, var1.a(true) - var2.a(true), 10);
          }
          et.field_d.field_R[1].field_g = 0;
        }
    }

    final static vn a(int param0, int param1, boolean param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        boolean[][] var4;
        boolean[][] var5;
        int var6;
        int var7;
        vn var8;
        int var9;
        int var10;
        short[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        boolean[][] var20;
        int var21;
        boolean[][] var22;
        boolean[][] var24;
        boolean[][] var25;
        boolean[][] var27;
        short[] var29;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        boolean[][] var27Lifetime1;
        var19 = Kickabout.field_G;
        var25 = je.field_g[param0].field_l[0];
        var22 = var25;
        var20 = var22;
        var4 = var20;
        var27 = je.field_g[param0].field_l[1];
        var24 = var27;
        var5 = var24;
        var6 = (short)param3;
        var7 = (short)param1;
        var8 = new vn(of.field_f, param2, false, true, true);
        var29 = of.field_f.field_p;
        var12 = var8.field_p;
        var13 = 0;
        for (var14 = 0; var14 < var25.length; var14++) {
          var15 = 20;
          for (var16 = 0; var16 < var25[0].length; var16++) {
            var17 = var16;
            stackIn_7_0 = (!var20[-var14 + 12][var17]) ? var6 : var7;
            var10 = stackIn_7_0;
            var9 = ks.a(var15, var13, 120, 7);
            for (var18 = 0; var18 < var29.length; var18++) {
              if (var29[var18] == var9) {
                var12[var18] = (short)var10;
              }
            }
            var15 += 5;
          }
          var13 += 3;
        }
        var27Lifetime1 = var24;
        var13Lifetime1 = 0;
        for (var14Lifetime1 = 0; var27Lifetime1.length > var14Lifetime1; var14Lifetime1++) {
          var15Lifetime1 = 20;
          for (var16Lifetime1 = 0; var16Lifetime1 < var27Lifetime1[0].length; var16Lifetime1++) {
            var17Lifetime1 = 9 - var16Lifetime1;
            stackIn_24_0 = (var5[-var14Lifetime1 + 12][var17Lifetime1]) ? var7 : var6;
            var10Lifetime1 = stackIn_24_0;
            var9Lifetime1 = ks.a(var15Lifetime1, var13Lifetime1, 119, 6);
            var15Lifetime1 += 5;
            var21 = 0;
            var18Lifetime1 = var21;
            while (var29.length > var21) {
              if (var29[var21] == var9Lifetime1) {
                var12[var21] = (short)var10Lifetime1;
              }
              var21++;
            }
          }
          var13Lifetime1 += 3;
        }
        return var8;
    }

    df() {
    }

    final void a(int param0, boolean param1) {
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        ot stackIn_23_0 = null;
        int var3;
        ot var4;
        int var4_int;
        int var5;
        int var6;
        String var8;
        int var9;
        var9 = Kickabout.field_G;
        super.a(param0, param1);
        if (this.field_C == 0) {
          on.a(this.field_j + 40, 198, 560, 200, 10, 65793, 128);
          ms.a(wa.field_b, this.field_j + 40, 560, false, 0, 126);
          un.field_d.a(c.field_h.toLowerCase(), 56 + this.field_j, 222, 16777215, -1);
          for (var3 = 0; var3 < 3; var3++) {
            pb.field_C.c(ml.field_t[var3], 150 + this.field_j, 256 + 50 * var3, 16777215, -1);
            pb.field_C.a(jq.field_a[var3], this.field_j + 170, 243 + var3 * 50, 420, 300, 16777215, -1, 0, 0, 16);
          }
        } else {
          if (this.field_C == 1) {
            for (var3 = 0; var3 < 2; var3++) {
              stackIn_9_0 = (var3 == 1) ? 1 : 0;
              var4_int = stackIn_9_0;
              stackIn_12_0 = (var4_int != 0) ? 345 : 50;
              var5 = stackIn_12_0;
              var5 = var5 + this.field_j;
              var6 = 146;
              on.a(-10 + var5, 126, 265, 270, 10, 65793, 140);
              if (var3 == 1) {
                var6 += 50;
              }
              for (var7 = 0; var7 < tj.field_w[var3].length; var7++) {
                var8 = tj.field_w[var3][var7];
                var6 = var6 + (20 + pb.field_C.a(var8, var5, var6, 245, 999, 16777215, -1, 0, 0, 16) * 16);
              }
            }
            for (var3 = 0; var3 < 4; var3++) {
              if (0 == (var3 & 1)) {
                stackIn_23_0 = eq.field_h;
              } else {
                stackIn_23_0 = ml.field_q;
              }
              var4 = stackIn_23_0;
              ((ut) ((Object) var4)).c(var3 * 45 + 380 + this.field_j, 145);
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_F = null;
        if (param0) {
          field_H = 29;
        }
        field_I = null;
        field_G = null;
    }

    final static int g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          var1_int = 0;
          while (nk.$cfr$intArgs$b$c4997cb15529(-59)) {
            re.field_c.d(105);
            if (!re.field_c.c(-1)) {
              continue;
            }
            var1_int = 1;
          }
          if (param0 >= -35) {
            df.c(true);
          }
          re.field_c.a(-21174, ts.b(n.field_m, el.field_A, 16756), ts.b(vc.field_y, sm.field_q, 16756));
          if (re.field_c.c(-1)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            re.field_c.field_e >= 0) {
            var2 = gl.field_d[re.field_c.field_e];
            if (2 == var2) {
              dh.c((byte) -77);
            }
          }
          stackIn_16_0 = var2;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "df.K(" + param0 + ')');
        }
    }

    static {
        field_H = 0;
    }
}
