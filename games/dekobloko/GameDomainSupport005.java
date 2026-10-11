/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameDomainSupport005 {
    static String[] stringArrayState0028;
    ResourceArchive resourceArchiveState0013;
    String stringState0402;
    String stringState0403;
    int integerState0577;
    String stringState0404;
    static NodeDeque nodeDequeState0023;
    static String stringState0405;
    static int integerState0578;
    static String stringState0406;
    static MixedSupport048 mixedSupport048State0002;

    public static void performAction1385(byte byteArgument1) {
        if (byteArgument1 != 78) {
          GameDomainSupport005.performAction1385((byte) -103);
        }
        stringArrayState0028 = null;
        mixedSupport048State0002 = null;
        stringState0405 = null;
        stringState0406 = null;
        nodeDequeState0023 = null;
    }

    final static void performAction1388(boolean booleanArgument1) {
        int integerLocal1;
        String stringLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = -(45 * (ComponentContainer.renderingSupport008State0006.integerState0363 * ComponentContainer.renderingSupport008State0006.integerState0363) / 400) + 45;
        SoftwareRaster.performAction0720(0, integerLocal1 + 435, 640, 28, 16763904, 100);
        SoftwareRaster.performAction0718(0, integerLocal1 + 435, 640, 0);
        SoftwareRaster.performAction0718(0, integerLocal1 + 462, 640, 0);
        if (!booleanArgument1) {
          GameDomainSupport005.performAction1388(true);
        }
        if (UiComponentPart015.integerState0319 == 0) {
          stringLocal2 = stringArrayState0028[0];
        } else {
          if (UiComponentPart015.integerState0319 >= 3) {
            if (UiComponentPart015.integerState0319 < 7) {
              stringLocal2 = CollectionSupport001.computeString0336(83, stringArrayState0028[2], new String[]{Integer.toString(UiComponentPart015.integerState0319 + 1), Integer.toString(8)});
            } else {
              stringLocal2 = stringArrayState0028[3];
            }
          } else {
            stringLocal2 = CollectionSupport001.computeString0336(85, stringArrayState0028[1], new String[]{Integer.toString(UiComponentPart015.integerState0319 + 1), Integer.toString(8)});
          }
        }
        MixedSupport042.performAction0595(integerLocal1 + 454, 256, 16777215, stringLocal2, -(1023 & GameDomainSupport001.integerState0053) - 382, SceneWidget.renderingSupport010State0007);
        MixedSupport042.performAction0595(integerLocal1 + 454, 256, 16777215, stringLocal2, -(GameDomainSupport001.integerState0053 & 1023) + 642, SceneWidget.renderingSupport010State0007);
    }

    final static void performAction1386(int integerArgument1) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        boolean stackBooleanLocal5 = false;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        boolean stackBooleanLocal8 = false;
        RuntimeException caughtExceptionLocal9 = null;
        RgbSprite rgbSpriteLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        RgbSprite rgbSpriteLocal21 = null;
        int integerLocal22 = 0;
        RgbSprite rgbSpriteLocal23 = null;
        RgbSprite rgbSpriteLocal24 = null;
        String stringLocal25 = null;
        RgbSprite rgbSpriteLocal26 = null;
        String stringLocal27 = null;
        int[] integerArrayLocal28 = null;
        int[] integerArrayLocal29 = null;
        int[] integerArrayLocal30 = null;
        int[] integerArrayLocal31 = null;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        int integerLocal45;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (MixedSupport080.resourceArchiveState0011 != null &&
            MixedSupport080.resourceArchiveState0011.computeBoolean0904((byte) 121) &&
            MixedSupport080.resourceArchiveState0011.computeBoolean0918("benefits", (byte) -119) &&
            MixedSupport028.resourceArchiveState0004 != null &&
            MixedSupport028.resourceArchiveState0004.computeBoolean0904((byte) 121) &&
            MixedSupport028.resourceArchiveState0004.computeBoolean0918("benefits", (byte) 102)) {
            UiComponentPart008.rgbSpriteState0012 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "headline", "benefits", integerArgument1 + 7802);
            MixedSupport054.rgbSpriteState0019 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "blurbpane", "benefits", 8192);
            RichTextLayout.rgbSpriteState0015 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "button", "benefits", 8192);
            ResourceSupport004.rgbSpriteState0043 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "signup_text", "benefits", 8192);
            CodecSupport001.rgbSpriteState0031 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "menu_text", "benefits", 8192);
            NetworkSupport002.rgbSpriteState0008 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "button_frame", "benefits", integerArgument1 ^ 8582);
            RenderingSupport003.rgbSpriteState0017 = UiComponentPart015.computeRgbSprite0791(MixedSupport080.resourceArchiveState0011, "arrow", "benefits", 8192);
            NetworkSupport001.bitmapFontState0002 = (BitmapFont) ((Object) MixedSupport016.computeRenderingSupport0100223("large_font", MixedSupport028.resourceArchiveState0004, MixedSupport080.resourceArchiveState0011, (byte) 114, "benefits"));
            MixedSupport013.bitmapFontState0007 = (BitmapFont) ((Object) MixedSupport016.computeRenderingSupport0100223("small_font", MixedSupport028.resourceArchiveState0004, MixedSupport080.resourceArchiveState0011, (byte) 112, "benefits"));
            integerArrayLocal28 = SoftwareRaster.integerArrayState0063;
            integerLocal13 = SoftwareRaster.integerState0285;
            integerLocal14 = SoftwareRaster.integerState0284;
            SoftwareRaster.performAction0731(UiComponentPart013.integerArrayState0055);
            rgbSpriteLocal23 = new RgbSprite(4 + RenderingSupport003.rgbSpriteState0017.integerState0258, RenderingSupport003.rgbSpriteState0017.integerState0255 + 4);
            rgbSpriteLocal23.performAction0278();
            RenderingSupport003.rgbSpriteState0017.performAction0292(2, 2, MixedSupport093.integerState0546);
            CodecSupport003.performAction1617(2, 1, 0, 2, rgbSpriteLocal23, 0, rgbSpriteLocal23.integerState0258, rgbSpriteLocal23.integerState0255);
            RenderingSupport003.rgbSpriteState0017 = rgbSpriteLocal23;
            MixedSupport077.rgbSpriteState0028 = RenderingSupport003.rgbSpriteState0017.computeRgbSprite0311();
            rgbSpriteLocal24 = new RgbSprite(195, 221);
            integerLocal17 = rgbSpriteLocal24.integerState0258 / 2;
            rgbSpriteLocal24.performAction0278();
            NetworkSupport001.bitmapFontState0002.performAction1224(CollectionSupport001.computeString0336(84, MixedSupport004.stringState0015, new String[]{SoftwareFramebuffer.stringState0617}), integerLocal17, 40, 16777215, -1);
            MixedSupport013.bitmapFontState0007.performAction1224(CollectionSupport001.computeString0336(90, UiComponentPart025.stringState0450, new String[]{SoftwareFramebuffer.stringState0617}), integerLocal17, 60, 16777215, -1);
            NetworkSupport001.bitmapFontState0002.performAction1224(CollectionSupport001.computeString0336(126, MixedSupport117.stringState0486, new String[]{MixedSupport069.stringState0291}), integerLocal17, 110, 16777215, -1);
            MixedSupport013.bitmapFontState0007.performAction1224(CollectionSupport001.computeString0336(94, SocketFactory.stringState0611, new String[]{MixedSupport069.stringState0291}), integerLocal17, 130, 16777215, -1);
            NetworkSupport001.bitmapFontState0002.performAction1224(SocketFactory.stringState0615, integerLocal17, 180, 16777215, -1);
            MixedSupport013.bitmapFontState0007.performAction1224(MixedSupport117.stringState0487, integerLocal17, 200, 16777215, -1);
            CodecSupport003.performAction1617(3, 1, 0, integerArgument1 ^ 388, rgbSpriteLocal24, 0, rgbSpriteLocal24.integerState0258, rgbSpriteLocal24.integerState0255);
            MixedSupport054.rgbSpriteState0019.performAction0278();
            rgbSpriteLocal24.performAction0300(18 - MixedSupport054.rgbSpriteState0019.integerState0259, 241 - MixedSupport054.rgbSpriteState0019.integerState0256);
            for (integerLocal18 = 0; integerLocal18 < UiComponentPart009.stringArrayState0008.length; integerLocal18++) {
              MixedSupport147.rgbSpriteArrayState0031[integerLocal18].performAction0278();
              MixedSupport013.bitmapFontState0007.computeInteger1213(UiComponentPart009.stringArrayState0008[integerLocal18], 3, 3, -6 + MixedSupport147.rgbSpriteArrayState0031[integerLocal18].integerState0258, -6 + MixedSupport147.rgbSpriteArrayState0031[integerLocal18].integerState0255, MixedSupport093.integerState0546, -1, 1, 1, MixedSupport013.bitmapFontState0007.integerState0518 + MixedSupport013.bitmapFontState0007.integerState0523);
              CodecSupport003.performAction1617(3, 1, 0, 2, MixedSupport147.rgbSpriteArrayState0031[integerLocal18], 0, MixedSupport147.rgbSpriteArrayState0031[integerLocal18].integerState0258, MixedSupport147.rgbSpriteArrayState0031[integerLocal18].integerState0255);
            }
            UiComponentPart009.stringArrayState0008 = null;
            NetworkSupport008.rgbSpriteState0037 = ResourceSupport004.rgbSpriteState0043.computeRgbSprite0299();
            NetworkSupport008.rgbSpriteState0037.performAction0278();
            SceneWidgetPart014.performAction2011(31, 0, 2 * SoftwareRaster.integerState0284 / 3, 0, 64, SoftwareRaster.integerState0285);
            SoftwareRaster.performAction0724(integerArrayLocal28, integerLocal13, integerLocal14);
            SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
            MixedSupport080.resourceArchiveState0011 = null;
            MixedSupport121.integerState0753 = 434 + (-NetworkSupport002.rgbSpriteState0008.integerState0258 + RichTextLayout.rgbSpriteState0015.integerState0258) / 2;
            MixedSupport025.integerState0151 = (RichTextLayout.rgbSpriteState0015.integerState0258 - NetworkSupport002.rgbSpriteState0008.integerState0258) / 2 + 231;
            CollectionSupport002.integerState0138 = 390 + (-NetworkSupport002.rgbSpriteState0008.integerState0255 + RichTextLayout.rgbSpriteState0015.integerState0255) / 2;
            MixedSupport121.integerState0751 = 390 + (-NetworkSupport002.rgbSpriteState0008.integerState0255 + RichTextLayout.rgbSpriteState0015.integerState0255) / 2;
          }
          if (MixedSupport079.rgbSpriteState0030 == null) {
            return;
          }
          if (MouseInput.rgbSpriteState0073 != null &&
            null != NetworkSupport001.bitmapFontState0002) {
            integerArrayLocal29 = SoftwareRaster.integerArrayState0063;
            integerLocal32 = SoftwareRaster.integerState0285;
            integerLocal37 = SoftwareRaster.integerState0284;
            SoftwareRaster.performAction0731(UiComponentPart013.integerArrayState0055);
            stringLocal25 = CollectionSupport001.computeString0336(120, MixedSupport102.stringState0413, new String[]{ComponentDecorator.stringArrayState0020[MixedSupport112.integerState0683]});
            integerLocal16 = NetworkSupport001.bitmapFontState0002.computeInteger1222(stringLocal25, UiComponent.integerState0106);
            integerLocal41 = NetworkSupport001.bitmapFontState0002.computeInteger1223(stringLocal25, UiComponent.integerState0106, NetworkSupport001.bitmapFontState0002.integerState0518 + NetworkSupport001.bitmapFontState0002.integerState0523);
            integerLocal43 = MixedSupport106.integerState0591 + (-integerLocal16 + UiComponent.integerState0106) / 2;
            integerLocal16 += 6;
            integerLocal19 = BufferedSocket.integerState0668 + (CollectionSupport003.integerState0543 - integerLocal41) / 2;
            integerLocal43 -= 3;
            if (0 > integerLocal43) {
              integerLocal20 = -integerLocal43;
              integerLocal16 = integerLocal16 + integerLocal20 * 2;
              MixedSupport080.integerState0429 = MixedSupport080.integerState0429 - integerLocal20;
              MixedSupport106.integerState0591 = MixedSupport106.integerState0591 + integerLocal20;
              integerLocal43 = integerLocal43 + integerLocal20;
              MouseInput.rgbSpriteState0073.integerState0259 = MouseInput.rgbSpriteState0073.integerState0259 + integerLocal20;
              MouseInput.rgbSpriteState0073.integerState0254 = MouseInput.rgbSpriteState0073.integerState0254 + 2 * integerLocal20;
            }
            integerLocal19 -= 3;
            integerLocal41 += 6;
            if (MouseInput.rgbSpriteState0073.integerState0254 < integerLocal16 + integerLocal43) {
              integerLocal46 = integerLocal16 + (integerLocal43 - MouseInput.rgbSpriteState0073.integerState0254);
              MixedSupport080.integerState0429 = MixedSupport080.integerState0429 - integerLocal46;
              integerLocal43 = integerLocal43 + integerLocal46;
              MixedSupport106.integerState0591 = MixedSupport106.integerState0591 + integerLocal46;
              integerLocal16 = integerLocal16 + 2 * integerLocal46;
              MouseInput.rgbSpriteState0073.integerState0254 = MouseInput.rgbSpriteState0073.integerState0254 + integerLocal46 * 2;
              MouseInput.rgbSpriteState0073.integerState0259 = MouseInput.rgbSpriteState0073.integerState0259 + integerLocal46;
            }
            if (integerLocal19 < 0) {
              integerLocal47 = -integerLocal19;
              UiComponentPart011.integerState0240 = UiComponentPart011.integerState0240 - integerLocal47;
              integerLocal19 = integerLocal19 + integerLocal47;
              integerLocal41 = integerLocal41 + integerLocal47 * 2;
              BufferedSocket.integerState0668 = BufferedSocket.integerState0668 + integerLocal47;
              MouseInput.rgbSpriteState0073.integerState0260 = MouseInput.rgbSpriteState0073.integerState0260 + 2 * integerLocal47;
              MouseInput.rgbSpriteState0073.integerState0256 = MouseInput.rgbSpriteState0073.integerState0256 + integerLocal47;
            }
            if (MouseInput.rgbSpriteState0073.integerState0260 < integerLocal41 + integerLocal19) {
              integerLocal48 = integerLocal19 + (integerLocal41 - MouseInput.rgbSpriteState0073.integerState0260);
              MouseInput.rgbSpriteState0073.integerState0256 = MouseInput.rgbSpriteState0073.integerState0256 + integerLocal48;
              integerLocal41 = integerLocal41 + integerLocal48 * 2;
              MouseInput.rgbSpriteState0073.integerState0260 = MouseInput.rgbSpriteState0073.integerState0260 + 2 * integerLocal48;
              integerLocal19 = integerLocal19 + integerLocal48;
              UiComponentPart011.integerState0240 = UiComponentPart011.integerState0240 - integerLocal48;
              BufferedSocket.integerState0668 = BufferedSocket.integerState0668 + integerLocal48;
            }
            MouseInput.rgbSpriteState0073.performAction0291();
            rgbSpriteLocal21 = new RgbSprite(MouseInput.rgbSpriteState0073.integerState0254, MouseInput.rgbSpriteState0073.integerState0260);
            rgbSpriteLocal21.performAction0278();
            NetworkSupport001.bitmapFontState0002.computeInteger1213(stringLocal25, MixedSupport106.integerState0591, BufferedSocket.integerState0668, UiComponent.integerState0106, CollectionSupport003.integerState0543, 16777215, -1, 1, 1, NetworkSupport001.bitmapFontState0002.integerState0518 + NetworkSupport001.bitmapFontState0002.integerState0523);
            CodecSupport003.performAction1617(3, 1, 0, 2, rgbSpriteLocal21, 0, rgbSpriteLocal21.integerState0254, rgbSpriteLocal21.integerState0260);
            MouseInput.rgbSpriteState0073.performAction0278();
            rgbSpriteLocal21.performAction0300(0, 0);
            SceneWidget.rgbSpriteState0068 = new RgbSprite(640, 480);
            SceneWidget.rgbSpriteState0068.performAction0278();
            MouseInput.rgbSpriteState0073.performAction0309((MouseInput.rgbSpriteState0073.integerState0254 >> 1) + MixedSupport080.integerState0429, (MouseInput.rgbSpriteState0073.integerState0260 >> 1) + UiComponentPart011.integerState0240, DiagnosticSupport001.integerState0125, 4096);
            MouseInput.rgbSpriteState0073 = null;
            SceneWidget.rgbSpriteState0068.performAction0315();
            SoftwareRaster.performAction0724(integerArrayLocal29, integerLocal32, integerLocal37);
            SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
          }
          if (InputAdapter004.stringState0358 != null &&
            null != MixedSupport013.bitmapFontState0007) {
            integerArrayLocal30 = SoftwareRaster.integerArrayState0063;
            integerLocal33 = SoftwareRaster.integerState0285;
            integerLocal38 = SoftwareRaster.integerState0284;
            SoftwareRaster.performAction0731(UiComponentPart013.integerArrayState0055);
            rgbSpriteLocal26 = new RgbSprite(412, 43);
            stringLocal27 = CollectionSupport001.computeString0336(122, UiComponentPart007.stringState0111, new String[]{InputAdapter004.stringState0358});
            InputAdapter004.stringState0358 = null;
            rgbSpriteLocal26.performAction0278();
            MixedSupport013.bitmapFontState0007.computeInteger1213(stringLocal27, 3, 3, rgbSpriteLocal26.integerState0258 - 6, rgbSpriteLocal26.integerState0255 - 6, 16777215, -1, 0, 1, MixedSupport013.bitmapFontState0007.integerState0518 + MixedSupport013.bitmapFontState0007.integerState0523);
            CodecSupport003.performAction1617(3, 1, 0, 2, rgbSpriteLocal26, 0, rgbSpriteLocal26.integerState0258, rgbSpriteLocal26.integerState0255);
            MixedSupport079.rgbSpriteState0030.performAction0278();
            rgbSpriteLocal26.performAction0300(-MixedSupport079.rgbSpriteState0030.integerState0259 + 199, -MixedSupport079.rgbSpriteState0030.integerState0256 + 83);
            SoftwareRaster.performAction0724(integerArrayLocal30, integerLocal33, integerLocal38);
            SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
          }
          if (MixedSupport103.rgbSpriteState0040 != null &&
            MixedSupport013.bitmapFontState0007 != null) {
            integerArrayLocal31 = SoftwareRaster.integerArrayState0063;
            integerLocal34 = SoftwareRaster.integerState0285;
            integerLocal39 = SoftwareRaster.integerState0284;
            SoftwareRaster.performAction0731(UiComponentPart013.integerArrayState0055);
            integerLocal15 = 6 + MixedSupport013.bitmapFontState0007.computeInteger1222(UiComponentPart016.stringState0297, 640);
            integerLocal40 = 20 + (integerLocal15 + MixedSupport103.rgbSpriteState0040.integerState0254);
            integerLocal42 = -(integerLocal40 / 2) + 427;
            integerLocal44 = 20 + (integerLocal42 + MixedSupport103.rgbSpriteState0040.integerState0254);
            MixedSupport079.rgbSpriteState0030.performAction0278();
            MixedSupport013.bitmapFontState0007.performAction1211(UiComponentPart016.stringState0297, integerLocal44 - MixedSupport079.rgbSpriteState0030.integerState0259, MixedSupport013.bitmapFontState0007.integerState0523 + (MixedSupport013.bitmapFontState0007.integerState0518 + (-MixedSupport079.rgbSpriteState0030.integerState0256 + 155)), 16777215, -1);
            CodecSupport003.performAction1617(3, 1, -MixedSupport079.rgbSpriteState0030.integerState0259 + (integerLocal44 - 4), integerArgument1 ^ 388, MixedSupport079.rgbSpriteState0030, -MixedSupport079.rgbSpriteState0030.integerState0256 + 155, integerLocal15, 50);
            integerLocal45 = -MixedSupport079.rgbSpriteState0030.integerState0256 + 155 - (-MixedSupport013.bitmapFontState0007.integerState0518 - 3 + MixedSupport103.rgbSpriteState0040.integerState0260 - MixedSupport013.bitmapFontState0007.integerState0523) / 2;
            MixedSupport103.rgbSpriteState0040.performAction0300(integerLocal42 - MixedSupport079.rgbSpriteState0030.integerState0259, integerLocal45);
            SoftwareRaster.performAction0724(integerArrayLocal31, integerLocal34, integerLocal39);
            SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
            MixedSupport103.rgbSpriteState0040 = null;
          }
          SoftwareRaster.performAction0731(UiComponentPart013.integerArrayState0055);
          if (integerArgument1 != 390) {
            GameDomainSupport005.performAction1385((byte) 100);
          }
          SoftwareRaster.performAction0721(16, 16, 608, 112, 15, UiComponentPart026.integerState0673, SceneWidget.integerState0909);
          SoftwareRaster.performAction0721(231, 144, 393, 232, 15, UiComponentPart026.integerState0673, SceneWidget.integerState0909);
          if (null != UiComponentPart008.rgbSpriteState0012) {
            UiComponentPart008.rgbSpriteState0012.performAction0300(0, 0);
          }
          if (null != MixedSupport054.rgbSpriteState0019) {
            MixedSupport054.rgbSpriteState0019.performAction0300(0, 0);
          }
          MixedSupport079.rgbSpriteState0030.performAction0300(0, 0);
          if (null != SceneWidget.rgbSpriteState0068) {
            SceneWidget.rgbSpriteState0068.performAction0300(0, 0);
          }
          if (RichTextLayout.rgbSpriteState0015 != null &&
            null != NetworkSupport002.rgbSpriteState0008) {
            RichTextLayout.rgbSpriteState0015.performAction0300(231, 390);
            rgbSpriteLocal10 = ResourceSupport004.rgbSpriteState0043;
            if (MixedSupport114.mixedSupport121State0003.integerState0754 == 0) {
              rgbSpriteLocal10 = NetworkSupport008.rgbSpriteState0037;
            }
            rgbSpriteLocal10.performAction0300(0, 0);
            stackIntegerLocal1 = MixedSupport112.integerState0682;
            if (0 == MixedSupport114.mixedSupport121State0003.integerState0754) {
              stackIntegerLocal2 = 4;
            } else {
              stackIntegerLocal2 = 3;
            }
            integerLocal35 = (MixedSupport051.computeInteger0666(stackIntegerLocal1 << stackIntegerLocal2, (byte) -122) * 40 >> 16) + 40;
            if (integerLocal35 > 0) {
              RichTextLayout.rgbSpriteState0015.performAction0317(230, 389, integerLocal35);
              RichTextLayout.rgbSpriteState0015.performAction0317(232, 389, integerLocal35);
              RichTextLayout.rgbSpriteState0015.performAction0317(232, 391, integerLocal35);
              RichTextLayout.rgbSpriteState0015.performAction0317(230, 391, integerLocal35);
              rgbSpriteLocal10.performAction0317(1, 1, integerLocal35);
              rgbSpriteLocal10.performAction0317(-1, 1, integerLocal35);
              rgbSpriteLocal10.performAction0317(1, -1, integerLocal35);
              rgbSpriteLocal10.performAction0317(-1, -1, integerLocal35);
            }
            stackIntegerLocal3 = MixedSupport025.integerState0151;
            stackIntegerLocal4 = MixedSupport121.integerState0751;
            stackBooleanLocal5 = (MixedSupport114.mixedSupport121State0003.integerState0754 == 0);
            MixedSupport006.performAction0074(stackIntegerLocal3, stackIntegerLocal4, stackBooleanLocal5, 40);
          }
          if (null != RichTextLayout.rgbSpriteState0015 &&
            NetworkSupport002.rgbSpriteState0008 != null) {
            RichTextLayout.rgbSpriteState0015.performAction0300(434, 390);
            CodecSupport001.rgbSpriteState0031.performAction0300(0, 0);
            if (MixedSupport114.mixedSupport121State0003.integerState0754 == 1) {
              SceneWidgetPart014.performAction2011(31, 436, 7 * RichTextLayout.rgbSpriteState0015.integerState0255 / 12, 392, 64, -4 + RichTextLayout.rgbSpriteState0015.integerState0258);
            }
            stackIntegerLocal6 = MixedSupport121.integerState0753;
            stackIntegerLocal7 = CollectionSupport002.integerState0138;
            stackBooleanLocal8 = (MixedSupport114.mixedSupport121State0003.integerState0754 == 1);
            MixedSupport006.performAction0074(stackIntegerLocal6, stackIntegerLocal7, stackBooleanLocal8, 40);
          }
          if (null != RenderingSupport003.rgbSpriteState0017) {
            integerLocal11 = -(RenderingSupport003.rgbSpriteState0017.integerState0260 / 2) + 357;
            RenderingSupport003.rgbSpriteState0017.performAction0300(-RenderingSupport003.rgbSpriteState0017.integerState0254 + 269, integerLocal11);
            MixedSupport077.rgbSpriteState0028.performAction0300(586, integerLocal11);
            if (integerLocal11 < MixedSupport106.integerState0590 &&
              integerLocal11 + RenderingSupport003.rgbSpriteState0017.integerState0255 > MixedSupport106.integerState0590) {
              integerLocal36 = (40 * MixedSupport051.computeInteger0666(MixedSupport112.integerState0682 << 4, (byte) -122) >> 16) + 40;
              if (0 < integerLocal36) {
                if (HashNode.integerState0069 > 269 - RenderingSupport003.rgbSpriteState0017.integerState0258 &&
                  HashNode.integerState0069 < 269) {
                  RenderingSupport003.rgbSpriteState0017.performAction0317(-RenderingSupport003.rgbSpriteState0017.integerState0254 + 269 - 1, integerLocal11 - 1, integerLocal36);
                  RenderingSupport003.rgbSpriteState0017.performAction0317(1 + (269 - RenderingSupport003.rgbSpriteState0017.integerState0254), -1 + integerLocal11, integerLocal36);
                  RenderingSupport003.rgbSpriteState0017.performAction0317(-RenderingSupport003.rgbSpriteState0017.integerState0254 + 269 - 1, 1 + integerLocal11, integerLocal36);
                  RenderingSupport003.rgbSpriteState0017.performAction0317(-RenderingSupport003.rgbSpriteState0017.integerState0254 + 269 + 1, integerLocal11 + 1, integerLocal36);
                } else {
                  if (586 < HashNode.integerState0069) {
                    if (586 + RenderingSupport003.rgbSpriteState0017.integerState0258 <= HashNode.integerState0069) {
                      MixedSupport052.performAction0683(73);
                      MixedSupport147.rgbSpriteArrayState0031[MixedSupport153.integerState0930].performAction0300(269, 340);
                      return;
                    }
                    MixedSupport077.rgbSpriteState0028.performAction0317(585, -1 + integerLocal11, integerLocal36);
                    MixedSupport077.rgbSpriteState0028.performAction0317(587, -1 + integerLocal11, integerLocal36);
                    MixedSupport077.rgbSpriteState0028.performAction0317(585, 1 + integerLocal11, integerLocal36);
                    MixedSupport077.rgbSpriteState0028.performAction0317(587, 1 + integerLocal11, integerLocal36);
                  }
                }
              }
            }
          }
          MixedSupport052.performAction0683(73);
          MixedSupport147.rgbSpriteArrayState0031[MixedSupport153.integerState0930].performAction0300(269, 340);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal49) {
          caughtExceptionLocal9 = caughtParameterLocal49;
          runtimeExceptionLocal12 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal12), "pb.A(" + integerArgument1 + ')');
        }
    }

    final static void performAction1387(ResourceArchive resourceArchiveArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        MixedSupport145 mixedSupport145Local3 = null;
        int[] integerArrayLocal4 = null;
        int integerLocal5 = 0;
        CipherPacketBuffer cipherPacketBufferLocal6 = null;
        int integerLocal7 = 0;
        CipherPacketBuffer cipherPacketBufferLocal8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal6 = new CipherPacketBuffer(resourceArchiveArgument1.computeByteArray0916(0, "", "logo.fo3d"));
          cipherPacketBufferLocal8 = cipherPacketBufferLocal6;
          integerLocal1 = cipherPacketBufferLocal8.computeInteger2085((byte) -124);
          cipherPacketBufferLocal8.performAction1865((byte) -108);
          MixedSupport077.clientExceptionArrayState0001 = ReturnedShape.computeClientExceptionArray1624(122, cipherPacketBufferLocal8);
          UiComponentPart007.integerArrayArrayState0006 = new int[integerLocal1][];
          DiagnosticSupport002.mixedSupport145ArrayState0001 = new MixedSupport145[integerLocal1];
          for (integerLocal2 = 0; integerLocal2 < integerLocal1; integerLocal2++) {
            DiagnosticSupport002.mixedSupport145ArrayState0001[integerLocal2] = MixedSupport140.computeMixedSupport1451905(-128, cipherPacketBufferLocal6);
          }
          cipherPacketBufferLocal8.performAction1867((byte) -124);
          if (integerArgument2 >= -1) {
            stringState0406 = (String) null;
          }
          integerLocal7 = 0;
          integerLocal14 = integerLocal7;
          while (integerLocal1 > integerLocal7) {
            mixedSupport145Local3 = DiagnosticSupport002.mixedSupport145ArrayState0001[integerLocal7];
            mixedSupport145Local3.performAction1947(6, 6, (byte) 31, 6, 1);
            mixedSupport145Local3.performAction1945(-14200);
            integerArrayLocal4 = new int[]{mixedSupport145Local3.integerState0849 + mixedSupport145Local3.integerState0851 >> 1, mixedSupport145Local3.integerState0852 + mixedSupport145Local3.integerState0850 >> 1, mixedSupport145Local3.integerState0853 + mixedSupport145Local3.integerState0854 >> 1};
            UiComponentPart007.integerArrayArrayState0006[integerLocal7] = integerArrayLocal4;
            mixedSupport145Local3.performAction1944((byte) -111, -integerArrayLocal4[0], -integerArrayLocal4[1], -integerArrayLocal4[2]);
            integerLocal7++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal12 = caughtParameterLocal15;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal13;
          stackStringBuilderLocal10 = new StringBuilder().append("pb.B(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument2).append(')').toString());
        }
    }

    static {
        stringArrayState0028 = new String[]{"Play Stamina Mode to unlock themes for the multiplayer game!", "<%0> of <%1> themes unlocked for multiplayer - play Stamina Mode to unlock up to 4!", "<%0> of <%1> themes unlocked for multiplayer - play the Master Challenge to unlock the rest!", "All themes unlocked for multiplayer! Can you beat your Stamina and Master Challenge highscores?"};
        stringState0405 = "Try changing the following settings:  ";
        nodeDequeState0023 = new NodeDeque();
        integerState0578 = 128;
        stringState0406 = "Reload game";
        mixedSupport048State0002 = new MixedSupport048(3);
    }
}
