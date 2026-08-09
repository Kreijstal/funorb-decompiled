/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    static ml field_d;
    static int[] field_a;
    static int field_c;
    static String[][] field_b;

    final static int a(boolean param0) {
        if (!param0) {
            return -97;
        }
        return fj.field_c;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1_int = qe.field_b[0];
              if (!param0) {
                break L1;
              } else {
                or.a((byte) -13);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (var2 >= qe.field_b.length) {
                break L0;
              } else {
                var3 = qe.field_b[var2];
                dv.a(nb.field_e, var2 << -2085062716, nb.field_e, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "or.B(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 1) {
            return;
        }
        System.out.println("Error: " + aj.a(-1, "%0a", "\n", param0));
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = (String[][]) null;
        field_a = null;
        if (param0 <= 33) {
            String var2 = (String) null;
            or.a((String) null, 5);
        }
    }

    final static void a(nu param0, int param1, int param2, byte param3) {
        nl var30 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][][] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = Kickabout.field_G;
        try {
            var30 = param0.field_P[param2][param1];
            var5 = var30.f(-110);
            var6 = var30.a(true);
            var7 = param0.field_r[param2];
            var8 = ws.field_c[var7][-1 + param1][2];
            var9 = ws.field_c[var7][-1 + param1][3];
            var10 = ws.field_c[var7][param1 + -1][0];
            var11 = ws.field_c[var7][-1 + param1][1];
            gl.a(6711, param0);
            if (-2 == (param2 ^ -1)) {
                var11 = -var9 + 1344 - var11;
                var10 = -var8 + 896 + -var10;
            }
            gt.a(param1, param2, (byte) 112, param0.field_r[param2]);
            var12 = ug.a(param3 + -99, var5);
            var13 = lf.a((byte) -96, var6);
            var14 = ug.a(0, ge.field_m[0]);
            var15 = lf.a((byte) -76, ge.field_m[1]);
            var16 = hw.field_i * 10 >> 772604840;
            var17 = (-1 + (1 << var30.field_I) & (1 + param1) * ((1 + param2) * 19) + param0.field_J) * hw.field_i >> -1126311544;
            if (param3 != 99) {
                field_a = (int[]) null;
            }
            var18 = (1 << var30.field_I) * hw.field_i >> -588611928;
            var19 = (param2 ^ -1) == -2 ? 13369344 : -3 != (ih.field_c ^ -1) ? 65793 : 16777215;
            var20 = 24;
            var21 = 24;
            if (!((10 & var30.field_G) != 0)) {
                var20 = var20 << 1;
            }
            if (-1 == (5 & var30.field_G ^ -1)) {
                var21 = var21 << 1;
            }
            var20 = hw.field_i * (var20 << 896717377) >> 224134120;
            var21 = hw.field_i * (var21 << 100844865) >> 1702606504;
            eo.a(ug.a(0, var10), lf.a((byte) -126, var11), hw.field_i * var8 >> 1113895688, hw.field_i * var9 >> 260971336, var19, 100);
            var22 = in.field_c[param2][-1 + param1];
            for (var23 = 0; 4 > var23; var23++) {
                for (var24 = 0; var24 < -1 + var22[var23].length; var24++) {
                    var25 = ug.a(param3 ^ 99, var22[var23][var24][0]);
                    var26 = lf.a((byte) -79, var22[var23][var24][1]);
                    var27 = ug.a(0, var22[var23][var24 - -1][0]);
                    var28 = lf.a((byte) -99, var22[var23][var24 - -1][1]);
                    on.e(var25, var26, var27, var28, var19, 128);
                }
            }
            eo.b(var14, var15, var16, 16777045);
            on.e(var12, var13, var14, var15, 16776960, 160);
            on.h(var12 - (var20 >> -900885343), var13 - (var21 >> -1450048543), var20, var21, 16776960, 160);
            on.a(var12 + -(var18 >> 273385889), 10 + var13, var18, 6, 65793);
            on.a(-(var18 >> -1934035935) + var12 - -1, var13 - -11, -2 + var18 - var17, 4, 13369344);
            on.c(1 + (var12 + -(var18 >> 341180449)), var13 - -12, -2 + (var18 + -var17), 16777215, 220);
            on.c(-(var18 >> 1584962049) + var12 - -1, var13 + 13, var18 - var17 - 2, 16777215, 120);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "or.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = new int[2];
        field_b = new String[][]{new String[]{"Play a 4 Minute game, rewards are reduced", "Play a 8 Minute game", "Play a 12 Minute game, rewards are increased"}, new String[]{"Play a normal game of Kickabout", "Play a Facebook Minileague Game"}, new String[]{"Play a normal game with your own team.", "Play an Exhibition Game with preset level 50 players. No experience is earnt."}, new String[]{"Play a single game.", "Play in a Knockout tournament."}};
    }
}
