/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterSetupHelpers {
    static String field_c;
    static boolean field_f;
    static boolean[] field_b;
    static PlatformTaskDispatcher field_g;
    static String field_d;
    static int field_a;
    static String field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void initializeRaster(int param0, int param1, int param2) {
        BattleResetHelpers.field_c = param2;
        PaletteSpriteHelpers.field_c = param2;
        MusicPatchNode.field_r = param0;
        SceneTabStrip.field_Eb = param0;
        TextWidgetPainter.field_j = true;
        GameSelectionHelpers.field_m = null;
        int[] var4 = (int[]) null;
        SoftwareRasterizer.setTarget((int[]) null, 0, 0);
        GameSelectionHelpers.field_m = DraggableWidget.createRasterBuffer(param0, (java.awt.Component) ((Object) LoginMessageTable.field_c), param2, (byte) -123);
        GameSelectionHelpers.field_m.makeRasterTarget(true);
        ServerMessage.setScrollPosition((byte) 51, param2 / param1, param0 / 2);
        IconTextSceneWidget.setViewSize(param0, param1 ^ 19131, param2);
        MenuScreen.setScreenSize(param2, param0, false);
        ThreeButtonPanel.storeLayoutValues(true, param2 / 2, param0 / 2);
    }

    final static int[] buildRotationMatrix(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3 = GradientBarPainter.sine(115, param2);
        int var4 = BevelBoxPainter.cosine(param2, -107);
        int var5 = GradientBarPainter.sine(-95, param0);
        if (param1 == 66) {
          var6 = BevelBoxPainter.cosine(param0, -101);
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        RasterSetupHelpers.releaseStatics((byte) -82);
        var6 = BevelBoxPainter.cosine(param0, -101);
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static boolean startLogoutTimer(int param0) {
        LoginMethodHelpers.field_h = true;
        SceneTabStrip.field_Hb = TimeAndInputHelpers.monotonicTimeMillis(-26572) + 15000L;
        if (param0 <= -87) {
          return BitAndSpriteHelpers.field_j == 11 ? true : false;
        }
        RasterSetupHelpers.initializeRaster(50, -118, -15);
        return BitAndSpriteHelpers.field_j == 11 ? true : false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 49) {
          return;
        }
        field_d = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_f = true;
        field_c = "Rated game";
        field_d = "Stone spells focus on the creation and destruction of terrain.";
        field_b = new boolean[112];
        field_e = "Honour";
    }
}
