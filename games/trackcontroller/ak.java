/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String field_a;
    static int field_b;
    static String field_c;

    final static void a(Archive param0, int param1) {
        ml var2 = null;
        try {
          if (param1 != 4) {
            field_a = (String) null;
          }
          ml.a(param0.a("headers.packvorbis", param1 ^ -5, ""));
          var2 = ml.a(param0, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.a((Throwable) ((Object) runtimeException), "ak.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 64) {
          return;
        }
        field_c = null;
    }

    final static void a(Archive param0, Archive param1, Archive param2, int param3) {
        Sprite var17 = null;
        ng[] var5 = null;
        ng[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ng[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = TrackController.field_F ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          wj.field_a = ib.a(10, "commonui", param1, "frame_top");
          kf.field_d = ib.a(10, "commonui", param1, "frame_bottom");
          ol.field_n = ab.a("commonui", -15383, "jagex_logo_grey", param1);
          BufferedCacheFile.field_l = ib.a(10, "commonui", param1, "button");
          TrackController.field_D = uj.a("validation", param1, (byte) -109, "commonui");
          fk.field_a = (BitmapFont) ((Object) kh.a(param2, "arezzo12", param1, "commonui", 1));
          gk.field_c = (BitmapFont) ((Object) kh.a(param2, "arezzo14", param1, "commonui", 1));
          p.field_a = (BitmapFont) ((Object) kh.a(param2, "arezzo14bold", param1, "commonui", 1));
          var17 = new Sprite(param0.a("button.gif", -1, ""), (java.awt.Component) ((Object) ki.field_f));
          ti.a("dropdown", param1, "commonui", 17);
          var5 = ie.a("commonui", param1, "screen_options", 124);
          fj.field_M = new ng[4];
          UiWidget.field_j = new ng[4];
          bf.field_e = new ng[4];
          var6 = new ng[][]{UiWidget.field_j, bf.field_e, fj.field_M};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_m[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            ng[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = ei.a(0, var5[var9], var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.field_q;
          nk.b(false);
          if (param3 <= 124) {
            field_a = (String) null;
          }
          var17.a();
          SoftwareRasterizer.d(0, 0, SoftwareRasterizer.field_d, SoftwareRasterizer.field_k);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.a();
          var17.h(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.a();
          var17.h(-var17.field_t + var9Lifetime1, 0);
          var12 = new Sprite(var17.field_t - var9Lifetime1 * 2, var9Lifetime1);
          var12.a();
          var17.h(-var9Lifetime1, 0);
          GameShell.m(-108);
          BufferedCacheFile.field_l = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.a((Throwable) ((Object) runtimeException), "ak.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = "This game has been updated! Please reload this page.";
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
