/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr extends gn {
    static String field_f;
    int field_i;
    int field_j;
    static boolean[] field_h;
    int field_e;
    static boolean field_k;
    static int[][][][] field_m;
    int field_l;
    int field_g;
    int field_n;

    final static void b(int param0) {
        du.field_n = param0 + Math.max(q.field_d.a(ag.field_l), q.field_d.a(h.field_a));
    }

    public static void a(int param0) {
        field_m = (int[][][][]) null;
        if (param0 != 2) {
          hr.a(-112);
        }
        field_h = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        oh[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        oh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ut var15 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime3Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime3Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var9Lifetime1Lifetime1;
        var14 = Kickabout.field_G;
        try {
          var15 = j.a(-5275);
          if (pb.field_B &&
            var15 != null) {
            on.a(0, 0, 640, 480, tm.field_x[ih.field_c][rm.field_C]);
            var2_int = var15.field_v;
            var3 = var15.field_v;
            var4_int = -1 + ai.a(0, 6784) / var2_int;
            var5 = 1 + ai.a(640, 6784) / var2_int;
            var6 = qj.a(-6779, 0) / var3 - 1;
            var7 = qj.a(-6779, 640) / var3 + 1;
            for (var8 = var4_int; var8 < var5; var8++) {
              for (var9 = var6; var7 > var9; var9++) {
                var10 = ug.a(param0 ^ -48, var8 * var2_int);
                var11 = lf.a((byte) -85, var9 * var3);
                var12 = ug.a(param0 + 48, var8 * var2_int + var2_int);
                var13 = lf.a((byte) -97, var3 * var9 + var3);
                on.e(var10, var11, var12 - var10, var13 - var11, 65793);
                pb.field_C.d('(' + Integer.toString(var8) + ',' + Integer.toString(var9) + ')', var10 + (-var10 + var12 >> 1), (-var11 + var13 >> 1) + var11, 16777215, 65793);
              }
            }
          }
          if (var15 != null) {
            if (bn.field_G != var15) {
              ja.field_S = var15.b();
              bn.field_G = var15;
              ou.field_B = -1;
            }
            if (hw.field_i != ou.field_B) {
              ou.field_B = hw.field_i;
              var2_intLifetime1 = var15.field_o * hw.field_i >> 8;
              var3Lifetime1 = hw.field_i * var15.field_v >> 8;
              iw.a(param0 ^ 10, ja.field_S);
              var15.a(0, 0, var2_intLifetime1, var3Lifetime1);
              ta.e(118);
            }
            stackIn_20_0 = (qr.a(0, (byte) -1) >= 0) ? 0 : 1;
            var2_intLifetime1Lifetime1 = stackIn_20_0;
            stackIn_23_0 = (896 >= qr.a(640, (byte) -1)) ? 0 : 1;
            var3Lifetime1Lifetime1 = stackIn_23_0;
            stackIn_26_0 = (ig.a(0, param0 + 4668) >= 0) ? 0 : 1;
            var4_intLifetime1 = stackIn_26_0;
            stackIn_29_0 = (ig.a(480, 4620) <= 1344) ? 0 : 1;
            var5Lifetime1 = stackIn_29_0;
            if (var2_intLifetime1Lifetime1 != 0) {
              var6Lifetime1 = b.c(param0 - 26, -15 - var15.field_o);
              stackIn_33_0 = -15;
              if (var4_intLifetime1 != 0) {
                stackIn_34_1 = var15.field_v;
              } else {
                stackIn_34_1 = 0;
              }
              var7Lifetime1 = stackIn_33_0 - stackIn_34_1;
              stackIn_36_0 = 1344;
              if (var5Lifetime1 == 0) {
                stackIn_37_1 = 0;
              } else {
                stackIn_37_1 = var15.field_v;
              }
              var8Lifetime1 = stackIn_36_0 + stackIn_37_1;
              while (var7Lifetime1 < var8Lifetime1) {
                ja.field_S.d(var6Lifetime1, go.a(var7Lifetime1, (byte) -56));
                var7Lifetime1 = var7Lifetime1 + var15.field_v;
              }
            }
            if (var4_intLifetime1 != 0) {
              var6Lifetime1Lifetime1 = go.a(-var15.field_v - 15, (byte) -56);
              for (var7Lifetime1Lifetime1 = -15; var7Lifetime1Lifetime1 < 896; var7Lifetime1Lifetime1 = var7Lifetime1Lifetime1 + var15.field_o) {
                ja.field_S.d(b.c(-44, var7Lifetime1Lifetime1), var6Lifetime1Lifetime1);
              }
            }
            if (var5Lifetime1 != 0) {
              for (var6Lifetime1Lifetime2 = -15; var6Lifetime1Lifetime2 + var15.field_v < 1344; var6Lifetime1Lifetime2 = var6Lifetime1Lifetime2 + var15.field_v) {
              }
              for (var7Lifetime1Lifetime2 = 0; var7Lifetime1Lifetime2 < 2; var7Lifetime1Lifetime2++) {
                var8Lifetime1Lifetime1 = go.a(var6Lifetime1Lifetime2, (byte) -56);
                for (var9Lifetime1 = -15; 896 > var9Lifetime1; var9Lifetime1 = var9Lifetime1 + var15.field_o) {
                  ja.field_S.d(b.c(-16, var9Lifetime1), var8Lifetime1Lifetime1);
                }
                var6Lifetime1Lifetime2 = var6Lifetime1Lifetime2 + var15.field_v;
              }
            }
            if (var3Lifetime1Lifetime1 != 0) {
              for (var6Lifetime1Lifetime3 = -15; var15.field_o + var6Lifetime1Lifetime3 < 896; var6Lifetime1Lifetime3 = var6Lifetime1Lifetime3 + var15.field_o) {
              }
              for (var7Lifetime1Lifetime3 = 0; var7Lifetime1Lifetime3 < 2; var7Lifetime1Lifetime3++) {
                var8Lifetime1Lifetime2 = b.c(-63, var6Lifetime1Lifetime3);
                stackIn_62_0 = -15;
                if (var4_intLifetime1 != 0) {
                  stackIn_63_1 = var15.field_v;
                } else {
                  stackIn_63_1 = 0;
                }
                var9Lifetime1Lifetime1 = stackIn_62_0 - stackIn_63_1;
                if (var5Lifetime1 != 0) {
                  stackIn_66_0 = var15.field_v;
                } else {
                  stackIn_66_0 = 0;
                }
                var10Lifetime1 = stackIn_66_0 + 1359;
                while (var9Lifetime1Lifetime1 < var10Lifetime1) {
                  ja.field_S.d(var8Lifetime1Lifetime2, go.a(var9Lifetime1Lifetime1, (byte) -56));
                  var9Lifetime1Lifetime1 = var9Lifetime1Lifetime1 + var15.field_v;
                }
                var6Lifetime1Lifetime3 = var6Lifetime1Lifetime3 + var15.field_o;
              }
            }
          } else {
            on.a(0, 0, 640, 480, tm.field_x[ih.field_c][rm.field_C]);
          }
          if (lg.field_a != null) {
            var2_intLifetime2 = b.c(-29, -15);
            var3Lifetime2 = go.a(-15, (byte) -56);
            if (hw.field_i == 256) {
              lg.field_a.d(var2_intLifetime2, var3Lifetime2);
            } else {
              lg.field_a.a(var2_intLifetime2, var3Lifetime2, lg.field_a.field_o * hw.field_i >> 8, hw.field_i * lg.field_a.field_v >> 8);
            }
          }
          if (!wh.field_q) {
            if (rm.field_C == 3) {
              de.a((byte) 92);
            }
            if (rm.field_C == 2) {
              pd.a((byte) -79);
            }
            if (bv.field_l != null) {
              var2_intLifetime3 = fp.field_f * 6 >> 8;
              if (3 >= var2_intLifetime3) {
                stackIn_85_0 = var2_intLifetime3;
              } else {
                stackIn_85_0 = 6 - var2_intLifetime3;
              }
              var2_intLifetime3Lifetime1 = stackIn_85_0;
              for (var3Lifetime3 = 0; var3Lifetime3 < bv.field_l.length; var3Lifetime3++) {
                if (bv.field_l[var3Lifetime3] != null) {
                  bv.field_l[var3Lifetime3].a(var2_intLifetime3Lifetime1, true);
                }
              }
            }
            if (null != oi.field_e) {
              var2 = oi.field_e;
              for (var3Lifetime3Lifetime1 = 0; var2.length > var3Lifetime3Lifetime1; var3Lifetime3Lifetime1++) {
                var4 = var2[var3Lifetime3Lifetime1];
                var4.a((byte) 125);
              }
            }
          }
          if (param0 != -48) {
            hr.a(-68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "hr.B(" + param0 + ')');
        }
    }

    private hr() throws Throwable {
        throw new Error();
    }

    static {
        field_h = new boolean[64];
        field_m = new int[4][5][][];
        field_m[3][0] = new int[3][1];
        field_m[3][0][0][0] = 5449;
        field_m[3][0][1][0] = 9540;
        field_m[3][0][2][0] = 3352;
        field_m[3][1] = new int[3][1];
        field_m[3][1][0][0] = 5250;
        field_m[3][1][1][0] = 4373;
        field_m[3][1][2][0] = 5267;
        field_m[3][2] = new int[3][1];
        field_m[3][2][0][0] = 5250;
        field_m[3][2][1][0] = 5279;
        field_m[3][2][2][0] = 5530;
        field_m[3][3] = new int[3][2];
        field_m[3][3][0][0] = 3224;
        field_m[3][3][0][1] = 2193;
        field_m[3][3][1][0] = 8491;
        field_m[3][3][1][1] = 8476;
        field_m[3][3][2][0] = 4384;
        field_m[3][3][2][1] = 4378;
        field_m[3][4] = new int[3][2];
        field_m[3][4][0][0] = 5250;
        field_m[3][4][0][1] = 5292;
        field_m[3][4][1][1] = 5413;
        field_m[3][4][1][0] = 5420;
        field_m[2][0] = new int[3][1];
        field_m[3][4][2][1] = 5582;
        field_m[3][4][2][0] = 5445;
        field_m[2][0][0][0] = 2234;
        field_m[2][0][1][0] = 3390;
        field_m[2][0][2][0] = 3381;
        field_m[2][1] = new int[3][1];
        field_m[2][1][0][0] = 3;
        field_m[2][1][1][0] = 9530;
        field_m[2][1][2][0] = 5409;
        field_m[2][2] = new int[3][1];
        field_m[2][2][0][0] = 3;
        field_m[2][2][1][0] = 3219;
        field_m[2][2][2][0] = 3351;
        field_m[2][3] = new int[3][1];
        field_m[2][3][0][0] = 5250;
        field_m[2][3][1][0] = 5420;
        field_m[2][3][2][0] = 5445;
        field_m[2][4] = new int[3][1];
        field_m[2][4][0][0] = 5404;
        field_m[2][4][1][0] = 5560;
        field_m[2][4][2][0] = 3254;
        field_m[1][0] = new int[3][1];
        field_m[1][0][0][0] = 7555;
        field_m[1][0][1][0] = 4384;
        field_m[1][0][2][0] = 2220;
        field_m[1][1] = new int[3][2];
        field_m[1][1][0][1] = 8344;
        field_m[1][1][0][0] = 8659;
        field_m[1][1][1][1] = 4245;
        field_m[1][1][1][0] = 4385;
        field_m[1][1][2][0] = 7728;
        field_m[1][1][2][1] = 6552;
        field_m[1][2] = new int[3][1];
        field_m[1][2][0][0] = 3217;
        field_m[1][2][1][0] = 3203;
        field_m[1][3] = new int[3][1];
        field_m[1][2][2][0] = 3472;
        field_m[1][3][0][0] = 3226;
        field_m[1][3][1][0] = 3617;
        field_m[1][4] = new int[3][2];
        field_m[1][3][2][0] = 6448;
        field_m[1][4][0][1] = 7582;
        field_m[1][4][0][0] = 7474;
        field_m[1][4][1][1] = 7305;
        field_m[1][4][1][0] = 7305;
        field_m[1][4][2][1] = 3484;
        field_m[0][0] = new int[3][1];
        field_m[1][4][2][0] = 3484;
        field_m[0][0][0][0] = 7555;
        field_m[0][0][1][0] = 4367;
        field_m[0][1] = new int[3][1];
        field_m[0][0][2][0] = 3848;
        field_m[0][1][0][0] = 8658;
        field_m[0][1][1][0] = 6450;
        field_m[0][1][2][0] = 3479;
        field_m[0][2] = new int[3][1];
        field_m[0][2][0][0] = 3128;
        field_m[0][2][1][0] = 2226;
        field_m[0][2][2][0] = 3468;
        field_m[0][3] = new int[3][1];
        field_m[0][3][0][0] = 7555;
        field_m[0][3][1][0] = 7438;
        field_m[0][4] = new int[3][1];
        field_m[0][3][2][0] = 7951;
        field_m[0][4][0][0] = 3084;
        field_m[0][4][1][0] = 3351;
        field_m[0][4][2][0] = 9688;
        field_k = false;
    }
}
