/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatOpenHelpers {
    static int field_b;
    static int field_a;

    final static void openQuickChatMenu(QuickChatMenu param0, byte param1) {
        if (param0 == null) {
          return;
        }
        try {
          ScreenDisplayMode.field_h = param0;
          DraggableWidget.field_I.children.clear(43);
          if (param1 < 73) {
            field_b = 37;
          }
          DraggableWidget.field_I.addChild(ScreenDisplayMode.field_h, (byte) 26);
          PatchEnvelopeSet.field_l = true;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "mh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void drawBarTexture(int param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param2 = param2 + HelpPopup.field_Gb.field_D;
        param0 = param0 + HelpPopup.field_Gb.field_y;
        int var4 = param2 + param0 * SoftwareRasterizer.field_j;
        int var5 = 0;
        int var6 = HelpPopup.field_Gb.field_E;
        int var7 = HelpPopup.field_Gb.field_F;
        int var8 = SoftwareRasterizer.field_j - var7;
        if (!(param0 >= SoftwareRasterizer.field_f)) {
          var10 = -param0 + SoftwareRasterizer.field_f;
          var4 = var4 + var10 * SoftwareRasterizer.field_j;
          var6 = var6 - var10;
          param0 = SoftwareRasterizer.field_f;
          var5 = var5 + var10 * var7;
        }
        int var9 = param3;
        if (SoftwareRasterizer.field_e > param2) {
          var10Lifetime1 = -param2 + SoftwareRasterizer.field_e;
          var4 = var4 + var10Lifetime1;
          param2 = SoftwareRasterizer.field_e;
          var5 = var5 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var7 = var7 - var10Lifetime1;
        }
        if (!(SoftwareRasterizer.field_a >= param0 + var6)) {
          var6 = var6 - (var6 + (param0 - SoftwareRasterizer.field_a));
        }
        if (var7 + param2 > SoftwareRasterizer.field_h) {
          var10Lifetime2 = var7 + (param2 - SoftwareRasterizer.field_h);
          var8 = var8 + var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var7 = var7 - var10Lifetime2;
        }
        if (var7 <= 0) {
          return;
        }
        if (var6 > 0) {
          GrowableIntList.applyAlphaMaskDarken(SoftwareRasterizer.field_k, param3 ^ -123, param1, var6, var9, var4, var5, var7, var8, HelpPopup.field_Gb.pixels);
          return;
        }
    }

    static {
    }
}
