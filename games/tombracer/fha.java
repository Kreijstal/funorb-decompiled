/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha {
    static String[] field_a;

    public static void releaseStatics(byte param0) {
        field_a = null;
        int var1 = -23 % ((param0 - 77) / 44);
    }

    final static void a(boolean param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        uca.field_f = BoulderComponent.a(param2, "commonui", 5, "frame_top");
        if (!param0) {
          return;
        }
        try {
          fua.field_f = BoulderComponent.a(param2, "commonui", 5, "frame_bottom");
          ApproachPlayerLocomotor.field_s = nia.a(param2, "commonui", "jagex_logo_grey", -101);
          nga.field_n = BoulderComponent.a(param2, "commonui", 5, "button");
          pq.field_b = Particle.a("validation", param2, "commonui", -57);
          eka.field_o = (BitmapFont) ((Object) SnakePitModel.a(param2, param1, false, "commonui", "arezzo12"));
          KeySwitchComponent.field_J = (BitmapFont) ((Object) SnakePitModel.a(param2, param1, false, "commonui", "arezzo14"));
          ft.field_c = (BitmapFont) ((Object) SnakePitModel.a(param2, param1, false, "commonui", "arezzo14bold"));
          var17 = new Sprite(param3.a("button.gif", (byte) 118, ""), (java.awt.Component) ((Object) nma.field_l));
          uv.a("dropdown", param2, "commonui", 8864);
          var5 = tw.a((byte) 127, "screen_options", "commonui", param2);
          ita.field_e = new IndexedSprite[4];
          rra.field_a = new IndexedSprite[4];
          ie.field_f = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{ie.field_f, rra.field_a, ita.field_e};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_g;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_h[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = Corpse.a(21938, var19[var11_int], var5[var9]);
            }
          }
          var9Lifetime1 = var17.field_q;
          gb.a(-29711);
          var17.c();
          SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_a);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.c();
          var17.d(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.c();
          var17.d(var9Lifetime1 - var17.field_m, 0);
          var12 = new Sprite(var17.field_m - var9Lifetime1 * 2, var9Lifetime1);
          var12.c();
          var17.d(-var9Lifetime1, 0);
          pfa.a(1);
          nga.field_n = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fha.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
