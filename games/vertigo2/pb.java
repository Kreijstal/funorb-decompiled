/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static boolean field_f;
    static dm field_b;
    static String field_c;
    static String field_e;
    static String field_d;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16711935) {
          pb.a((byte) -16, -56, 95, -50);
        }
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        oi.field_b = param3;
        ma.field_m = param2;
        int var4 = -120 / ((64 - param0) / 39);
        sr.field_a = param1;
    }

    final static void a(int param0, int param1, int param2, jp param3, int param4, int param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        uq stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uq var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        jp var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Vertigo2.field_L ? 1 : 0;
        try {
          var44 = param3;
          if (var44.field_x != null &&
            var44.field_G > 1) {
            var60 = var44.field_x;
            op.a(0, oq.field_F, 0, var60, false);
          } else {
            ln.b(0);
          }
          var54 = new int[param3.field_K];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          if (param7 < 30) {
            field_f = true;
          }
          var64 = new int[param3.field_K];
          var61 = pk.field_w;
          var62 = dp.field_A;
          var63 = dh.field_d;
          for (var13 = 0; param3.field_K > var13; var13++) {
            var14 = var61[var13] * param4 + var62[var13] * param1 + param6 * var63[var13] >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_17_0 = 128 + var14;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param2 * var62[var13] + (var61[var13] * param0 + var63[var13] * param5) >> 8;
            stackIn_19_0 = bl.field_r;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < ja.field_a; var13Lifetime1++) {
            var14Lifetime1 = ac.field_K[var13Lifetime1];
            var15Lifetime1 = param3.field_p[var14Lifetime1];
            var16 = param3.field_L[var14Lifetime1];
            var17 = param3.field_c[var14Lifetime1];
            if (pk.field_w.length > param3.field_g[var14Lifetime1]) {
              stackIn_26_0 = param3.field_g[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (param3.field_P[var14Lifetime1] < pk.field_w.length) {
              stackIn_29_0 = param3.field_P[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (pk.field_w.length > param3.field_C[var14Lifetime1]) {
              stackIn_32_0 = param3.field_C[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (wc.field_o != null &&
              param3.field_J != null &&
              param3.field_J.length > var14Lifetime1 &&
              param3.field_J[var14Lifetime1] != -1 &&
              wc.field_o.length > param3.field_J[var14Lifetime1]) {
              stackIn_40_0 = wc.field_o[param3.field_J[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = nj.field_a[var15Lifetime1];
            var23 = ml.field_t[var15Lifetime1];
            var24 = nj.field_a[var16];
            var25 = ml.field_t[var16];
            var26 = nj.field_a[var17];
            var27 = ml.field_t[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_45_0 = var21.field_e;
              } else {
                stackIn_45_0 = 8355711;
              }
              var30 = stackIn_45_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var28 * var31 >>> 8 & 989790463 | (var28 * var32 & 16711885) >>> 8;
              var33 = var33 + 65793 * var29;
              oj.a(var27, var22, var24, var26, (byte) 107, var23, var25, (16711422 & var33) >> 1);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_49_0 = var21.field_e;
              } else {
                stackIn_49_0 = 8355711;
              }
              var34 = stackIn_49_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (-16711842 & var35 * var28) >>> 8 | -436142336 & var36 * var28 >>> 8;
              var38 = var36 * var29 >>> 8 & -570360064 | 385810687 & var35 * var29 >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + var31 * 65793;
              var39 = (var30 * var36 & 16711862) >>> 8 | (-16711741 & var35 * var30) >>> 8;
              var39 = var39 + var33 * 65793;
              vj.a(var25, (byte) -122, 255 & var38, var38 >> 16, 255 & var39, var22, 255 & var37 >> 8, var37 >> 16, var24, var23, 255 & var39 >> 8, var26, var39 >> 16, var37 & 255, var38 >> 8 & 255, var27);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_d = "Oh, dear. There's a blue paint pot on this level. Until you pick it up, you can't paint the block beneath it purple! What's worse is that if you grab the blue pot, you'll have to paint five tiles blue before you can pick up some purple paint. The compass you can collect on this level should help - pick it up to get a zoomed-out view of the level.";
        field_f = false;
        field_c = "Click or press F10 to open Quick Chat";
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_a = "Return to lobby";
    }
}
