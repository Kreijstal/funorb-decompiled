/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_c;
    static String[] field_b;
    static df field_h;
    static String field_f;
    static double field_i;
    static byte[] field_a;
    static String field_e;
    static hl field_d;
    static long field_g;

    final static boolean b(int param0) {
        int var1 = -12 % ((-4 - param0) / 36);
        if (!(-1 != rl.field_d)) {
            if (!(en.b(117, 1))) {
                return false;
            }
            rl.field_d = kb.field_q.d((byte) -99);
            kb.field_q.field_t = 0;
        }
        if (!(rl.field_d != -2)) {
            if (!(en.b(125, 2))) {
                return false;
            }
            rl.field_d = kb.field_q.e(127);
            kb.field_q.field_t = 0;
        }
        return en.b(115, rl.field_d);
    }

    final static void a(ah param0, ah param1, ah param2) {
        RuntimeException var4 = null;
        kh[] var5 = null;
        kh[][] var6 = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        kh[] var11 = null;
        oh var12 = null;
        int var12_int = 0;
        oh var13 = null;
        int var14 = 0;
        kh[] var15 = null;
        oh var16 = null;
        int[][] var17 = null;
        oh var18 = null;
        oh var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var14 = TetraLink.field_J;
        try {
          L0: {
            hn.field_O = bf.a((byte) -128, param0, "commonui", "frame_top");
            mc.field_i = bf.a((byte) -83, param0, "commonui", "frame_bottom");
            ac.field_c = ug.a(param0, (byte) -45, "jagex_logo_grey", "commonui");
            mf.field_q = bf.a((byte) -81, param0, "commonui", "button");
            fj.field_q = qa.a("commonui", -1, param0, "validation");
            int discarded$5 = 95;
            dh.field_d = (jb) (Object) od.a(param0, "arezzo12", param1, "commonui");
            int discarded$6 = 95;
            od.field_S = (jb) (Object) od.a(param0, "arezzo14", param1, "commonui");
            int discarded$7 = 95;
            ab.field_V = (jb) (Object) od.a(param0, "arezzo14bold", param1, "commonui");
            var18 = new oh(param2.a("button.gif", "", true), (java.awt.Component) (Object) uh.field_b);
            kh discarded$8 = qk.a((byte) 80, param0, "commonui", "dropdown");
            int discarded$9 = -1409;
            var5 = el.a(param0, "screen_options", "commonui");
            pj.field_a = new kh[4];
            ul.field_c = new kh[4];
            dh.field_g = new kh[4];
            var6 = new kh[][]{ul.field_c, pj.field_a, dh.field_g};
            var7 = -7;
            var22 = new int[4][];
            var21 = var22;
            var20 = var21;
            var17 = var20;
            var8 = var17;
            var8[0] = var5[0].field_p;
            var9 = 1;
            L1: while (true) {
              if (var22.length <= var9) {
                var9 = var5[0].field_o[0];
                var22[2][var9] = 16777215;
                var22[1][var9] = 2394342;
                var22[3][var9] = 4767999;
                var10 = 0;
                L2: while (true) {
                  if (3 <= var10) {
                    var10 = var18.field_E;
                    nm.b((byte) 111);
                    var18.c();
                    ra.d(0, 0, ra.field_f, ra.field_e);
                    var16 = new oh(var10, var10);
                    var19 = var16;
                    var19.c();
                    var18.b(0, 0);
                    var12 = new oh(var10, var10);
                    var12.c();
                    var18.b(-var18.field_u + var10, 0);
                    var13 = new oh(var18.field_u - var10 * 2, var10);
                    var13.c();
                    var18.b(-var10, 0);
                    dh.a(-581);
                    mf.field_q = new oh[]{var16, var13, var12};
                    break L0;
                  } else {
                    var15 = var6[var10];
                    var11 = var15;
                    var12_int = 0;
                    L3: while (true) {
                      if (var12_int >= var15.length) {
                        var10++;
                        continue L2;
                      } else {
                        var15[var12_int] = gb.a(false, var22[var12_int], var5[var10]);
                        var12_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8[var9] = (int[]) var22[0].clone();
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ua.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -97 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 != 123) {
            boolean discarded$0 = ua.b(93);
        }
        int discarded$1 = 106;
        eh.b();
        int discarded$2 = -119;
        bj.a();
    }

    public static void c() {
        field_h = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a() {
        cd.field_a = false;
        fn.field_K = kb.field_q.d((byte) -99) == 0 ? true : false;
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = aa.field_Nb;
            var3 = a.field_a;
            var4 = bk.field_i.field_Ib.c(param1, 500);
            var5 = bk.field_i.field_Ib.b(param1, 500) + 6;
            var6 = var4 * qe.field_d + 2;
            var7 = eo.a(var5, (byte) 108, var2_int, 12);
            int discarded$0 = -8748;
            var8 = mh.a(20, var3, var6);
            ra.b(var7, var8, var5, var6, 0);
            ra.c(1 + var7, 1 + var8, var5 + -2, var6 + -2, 16777088);
            int discarded$1 = bk.field_i.field_Ib.a(param1, var7 + 3, -bk.field_i.field_Ib.field_N + ai.field_d + (var8 - -1), 500, 1000, 0, -1, 0, 0, qe.field_d);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ua.E(" + 7918 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 11 / ((param0 - -85) / 36);
        if (param1 >= 4096) {
            return param1 < 6144 ? -km.field_n[6144 + -param1] : km.field_n[-6144 + param1];
        }
        return 2048 <= param1 ? -km.field_n[param1 - 2048] : km.field_n[2048 - param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"turntime_icons"};
        field_c = -1;
        field_e = "Names should contain a maximum of 12 characters";
        field_f = "Achieved";
        field_h = new df(0);
    }
}
