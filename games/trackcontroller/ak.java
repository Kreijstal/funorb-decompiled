/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String field_a;
    static int field_b;
    static String field_c;

    final static void a(kk param0, int param1) {
        ml var2 = null;
        try {
            if (param1 != 4) {
                field_a = (String) null;
            }
            ml.a(param0.a("headers.packvorbis", param1 ^ -5, ""));
            var2 = ml.a(param0, "jagex logo2.packvorbis", "");
            var2.a();
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ak.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 64) {
            return;
        }
        field_c = null;
    }

    final static void a(kk param0, kk param1, kk param2, int param3) {
        qj var17 = null;
        ng[] var5 = null;
        ng[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ng[] var14 = null;
        int var11_int = 0;
        qj var15 = null;
        qj var18 = null;
        qj var11 = null;
        qj var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = TrackController.field_F ? 1 : 0;
        try {
            wj.field_a = ib.a(10, "commonui", param1, "frame_top");
            kf.field_d = ib.a(10, "commonui", param1, "frame_bottom");
            ol.field_n = ab.a("commonui", -15383, "jagex_logo_grey", param1);
            il.field_l = ib.a(10, "commonui", param1, "button");
            TrackController.field_D = uj.a("validation", param1, (byte) -109, "commonui");
            fk.field_a = (oh) ((Object) kh.a(param2, "arezzo12", param1, "commonui", 1));
            gk.field_c = (oh) ((Object) kh.a(param2, "arezzo14", param1, "commonui", 1));
            p.field_a = (oh) ((Object) kh.a(param2, "arezzo14bold", param1, "commonui", 1));
            var17 = new qj(param0.a("button.gif", -1, ""), (java.awt.Component) ((Object) ki.field_f));
            ti.a("dropdown", param1, "commonui", 17);
            var5 = ie.a("commonui", param1, "screen_options", 124);
            fj.field_M = new ng[4];
            al.field_j = new ng[4];
            bf.field_e = new ng[4];
            var6 = new ng[][]{al.field_j, bf.field_e, fj.field_M};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_m[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; var9 < 3; var9++) {
                var14 = var6[var9];
                ng[] var10 = var14;
                for (var11_int = 0; var14.length > var11_int; var11_int++) {
                    var14[var11_int] = ei.a(0, var5[var9], var19[var11_int]);
                }
            }
            var9 = var17.field_q;
            nk.b(false);
            if (param3 <= 124) {
                field_a = (String) null;
            }
            var17.a();
            ll.d(0, 0, ll.field_d, ll.field_k);
            var15 = new qj(var9, var9);
            var18 = var15;
            var18.a();
            var17.h(0, 0);
            var11 = new qj(var9, var9);
            var11.a();
            var17.h(-var17.field_t + var9, 0);
            var12 = new qj(var17.field_t + -(var9 * 2), var9);
            var12.a();
            var17.h(-var9, 0);
            ch.m(-108);
            il.field_l = new qj[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ak.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = "This game has been updated! Please reload this page.";
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
