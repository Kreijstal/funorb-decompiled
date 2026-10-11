/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameDomainSupport001 {
    static int integerState0051;
    static RgbSprite[][] rgbSpriteArrayArrayState0002;
    static int integerState0052;
    static RgbSprite rgbSpriteState0006;
    static RgbSprite[] rgbSpriteArrayState0002;
    static int integerState0053;

    final static void performAction0105(boolean booleanArgument1) {
        RgbSprite rgbSpriteLocal1 = null;
        RgbSprite rgbSpriteLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          rgbSpriteLocal1 = new RgbSprite(540, 140);
          RenderingSupport015.performAction1778(booleanArgument1, rgbSpriteLocal1);
          MixedSupport109.performAction1539();
          SoftwareRaster.performAction0727();
          MixedSupport046.integerState0250 = 0;
          GameplayControls.performAction1977(0);
          rgbSpriteLocal2 = rgbSpriteLocal1.computeRgbSprite0299();
          for (integerLocal3 = 0; 15 > integerLocal3; integerLocal3++) {
            rgbSpriteLocal2.performAction0308(-2, -2, 16777215);
            SoftwareRaster.performAction0730(4, 4, 0, 0, 540, 140);
          }
          UiComponentPart025.rgbSpriteState0045.performAction0278();
          rgbSpriteLocal1.performAction0307(0, 0);
          MixedSupport086.performAction1200((byte) -5);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bb.E(" + booleanArgument1 + ')');
        }
    }

    final static void performAction0107(boolean booleanArgument1) {
        if (!booleanArgument1) {
          GameDomainSupport001.performAction0102((byte) -17);
        }
        UiComponentPart031.performAction1811((byte) -121);
        DiagnosticSupport001.performAction0366(booleanArgument1);
        MixedSupport102.sceneWidgetPart007State0001 = null;
        MixedSupport104.performAction1409(false);
    }

    public static void performAction0103(int integerArgument1) {
        rgbSpriteState0006 = null;
        rgbSpriteArrayArrayState0002 = (RgbSprite[][]) null;
        int integerLocal1 = -3 / ((integerArgument1 - 37) / 58);
        rgbSpriteArrayState0002 = null;
    }

    final static void performAction0106(boolean booleanArgument1, ResourceArchive resourceArchiveArgument2, IndexedSprite[] indexedSpriteArrayArgument3, int[] integerArrayArgument4, ResourceArchive resourceArchiveArgument5) {
        RgbSprite[] cachedRgbSpriteArrayLocal1 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal2 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal3 = null;
        RgbSprite[] cachedRgbSpriteArrayLocal4 = null;
        IndexedSprite[] indexedSpriteArrayLocal5 = null;
        IndexedSprite[] indexedSpriteArrayLocal6 = null;
        int[] integerArrayLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int[] integerArrayLocal10 = null;
        IndexedSprite[] indexedSpriteArrayLocal11 = null;
        int[] integerArrayLocal12 = null;
        int[] integerArrayLocal13 = null;
        int[] integerArrayLocal14 = null;
        int[] integerArrayLocal15 = null;
        RuntimeException stackRuntimeExceptionLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        StringBuilder stackStringBuilderLocal21 = null;
        String stackStringLocal22 = null;
        StringBuilder stackStringBuilderLocal23 = null;
        String stackStringLocal24 = null;
        RuntimeException caughtExceptionLocal25 = null;
        RuntimeException runtimeExceptionLocal26 = null;
        RenderingSupport010 renderingSupport010Local27 = null;
        SceneWidget sceneWidgetLocal28 = null;
        SceneWidget sceneWidgetLocal29 = null;
        SceneWidget sceneWidgetLocal30 = null;
        SceneWidget sceneWidgetLocal31 = null;
        RgbSprite[] rgbSpriteArrayLocal32 = null;
        RgbSprite[] rgbSpriteArrayLocal33 = null;
        RgbSprite[] rgbSpriteArrayLocal34 = null;
        SceneWidget sceneWidgetLocal35 = null;
        RgbSprite[] rgbSpriteArrayLocal36 = null;
        RgbSprite[] rgbSpriteArrayLocal37 = null;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          indexedSpriteArrayLocal11 = UiComponentPart030.computeIndexedSpriteArray1760("crowns", resourceArchiveArgument2, false, "lobby");
          indexedSpriteArrayLocal5 = indexedSpriteArrayLocal11;
          InputAdapter004.integerState0530 = indexedSpriteArrayLocal11.length;
          if (indexedSpriteArrayArgument3 != null) {
            indexedSpriteArrayLocal6 = new IndexedSprite[indexedSpriteArrayArgument3.length + InputAdapter004.integerState0530];
            for (integerLocal8 = 0; InputAdapter004.integerState0530 > integerLocal8; integerLocal8++) {
              indexedSpriteArrayLocal6[integerLocal8] = indexedSpriteArrayLocal11[integerLocal8];
            }
            for (integerLocal40 = 0; indexedSpriteArrayArgument3.length > integerLocal40; integerLocal40++) {
              indexedSpriteArrayLocal6[integerLocal40 + InputAdapter004.integerState0530] = indexedSpriteArrayArgument3[integerLocal40];
            }
            indexedSpriteArrayLocal5 = indexedSpriteArrayLocal6;
          }
          integerArrayLocal14 = new int[indexedSpriteArrayLocal5.length];
          integerArrayLocal12 = integerArrayLocal14;
          integerArrayLocal10 = integerArrayLocal12;
          integerArrayLocal15 = integerArrayLocal10;
          integerArrayLocal13 = integerArrayLocal15;
          integerArrayLocal7 = integerArrayLocal13;
          for (integerLocal38 = 0; integerLocal38 < InputAdapter004.integerState0530; integerLocal38++) {
            integerArrayLocal14[integerLocal38] = 10;
          }
          if (indexedSpriteArrayArgument3 != null) {
            if (integerArrayArgument4 != null) {
              for (integerLocal39 = 0; indexedSpriteArrayArgument3.length > integerLocal39; integerLocal39++) {
                integerArrayLocal7[integerLocal39 + InputAdapter004.integerState0530] = integerArrayArgument4[integerLocal39];
              }
            } else {
              for (integerLocal39 = 0; integerLocal39 < indexedSpriteArrayArgument3.length; integerLocal39++) {
                integerArrayLocal7[integerLocal39 + InputAdapter004.integerState0530] = indexedSpriteArrayArgument3[integerLocal39].integerState0423;
              }
            }
          }
          GameApplet.integerState0292 = 2;
          ComponentContainer.integerState0377 = 15;
          MouseInput.integerState0928 = 11;
          CollectionSupport003.integerState0540 = 4;
          MixedSupport064.integerState0335 = 2;
          renderingSupport010Local27 = MixedSupport016.computeRenderingSupport0100223("largefont", resourceArchiveArgument5, resourceArchiveArgument2, (byte) 91, "lobby");
          MixedSupport127.renderingSupport010State0006 = MixedSupport016.computeRenderingSupport0100223("generalfont", resourceArchiveArgument5, resourceArchiveArgument2, (byte) 121, "lobby");
          TextLineMetrics.renderingSupport010State0004 = MixedSupport016.computeRenderingSupport0100223("chatfont", resourceArchiveArgument5, resourceArchiveArgument2, (byte) 102, "lobby");
          renderingSupport010Local27.performAction1218(indexedSpriteArrayLocal5, integerArrayLocal15);
          MixedSupport127.renderingSupport010State0006.performAction1218(indexedSpriteArrayLocal5, integerArrayLocal15);
          TextLineMetrics.renderingSupport010State0004.performAction1218(indexedSpriteArrayLocal5, integerArrayLocal15);
          sceneWidgetLocal28 = new SceneWidget(0L, (SceneWidget) null);
          sceneWidgetLocal28.integerState0908 = ComponentContainer.integerState0377;
          sceneWidgetLocal28.integerState0910 = 16777215;
          sceneWidgetLocal28.bitmapFontState0020 = (BitmapFont) ((Object) renderingSupport010Local27);
          sceneWidgetLocal29 = sceneWidgetLocal28;
          sceneWidgetLocal28.integerState0885 = 1;
          sceneWidgetLocal29.integerState0916 = 1;
          sceneWidgetLocal30 = new SceneWidget(0L, (SceneWidget) null);
          sceneWidgetLocal30.integerState0908 = ComponentContainer.integerState0377;
          sceneWidgetLocal30.integerState0910 = 16777215;
          sceneWidgetLocal30.bitmapFontState0020 = (BitmapFont) ((Object) MixedSupport127.renderingSupport010State0006);
          sceneWidgetLocal31 = sceneWidgetLocal30;
          sceneWidgetLocal30.integerState0885 = 1;
          sceneWidgetLocal31.integerState0916 = 1;
          TranslatedUiText.sceneWidgetState0086 = new SceneWidget(0L, sceneWidgetLocal28);
          TranslatedUiText.sceneWidgetState0086.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 116, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "heading"));
          MixedSupport150.sceneWidgetState0146 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport150.sceneWidgetState0146.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(false, 120, false, 8421504, 4210752, -26198);
          DiagnosticSupport001.sceneWidgetState0017 = new SceneWidget(0L, (SceneWidget) null);
          DiagnosticSupport001.sceneWidgetState0017.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(1, -20982, 3, 114, 6316128, 6316128);
          MixedSupport005.sceneWidgetState0002 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport005.sceneWidgetState0002.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 126, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "popup"));
          rgbSpriteArrayLocal32 = RenderingSupport002.computeRgbSpriteArray0259((byte) 118, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "popup_mouseover"));
          rgbSpriteArrayLocal33 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "button");
          rgbSpriteArrayLocal34 = RenderingSupport002.computeRgbSpriteArray0259((byte) 119, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "tab_active"));
          MixedSupport127.sceneWidgetState0119 = new SceneWidget(0L, sceneWidgetLocal28);
          MixedSupport127.sceneWidgetState0119.rgbSpriteArrayState0033 = rgbSpriteArrayLocal34;
          UiComponentPart014.sceneWidgetState0053 = new SceneWidget(0L, (SceneWidget) null);
          UiComponentPart014.sceneWidgetState0053.rgbSpriteState0070 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "closebutton", "lobby", 8192);
          UiComponentPart014.sceneWidgetState0053.rgbSpriteState0067 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "closebutton_mouseover", "lobby", 8192);
          MixedSupport057.sceneWidgetState0051 = new SceneWidget(0L, sceneWidgetLocal28);
          MixedSupport057.sceneWidgetState0051.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(true, 40, true, 3815994, 2039583, -26198);
          MixedSupport039.sceneWidgetState0029 = new SceneWidget(0L, sceneWidgetLocal30);
          MixedSupport039.sceneWidgetState0029.integerState0893 = 2;
          MixedSupport039.sceneWidgetState0029.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(false, 30, true, 3815994, 2039583, -26198);
          UiComponentPart003.sceneWidgetState0008 = new SceneWidget(0L, sceneWidgetLocal30);
          UiComponentPart003.sceneWidgetState0008.integerState0893 = 2;
          UiComponentPart003.sceneWidgetState0008.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(false, 30, false, 3815994, 2039583, -26198);
          NetworkSupport003.sceneWidgetState0018 = new SceneWidget(0L, sceneWidgetLocal30);
          NetworkSupport003.sceneWidgetState0018.integerState0893 = 2;
          NetworkSupport003.sceneWidgetState0018.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(true, 30, false, 3815994, 2039583, -26198);
          MixedSupport132.sceneWidgetState0125 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport132.sceneWidgetState0125.bitmapFontState0020 = (BitmapFont) ((Object) MixedSupport127.renderingSupport010State0006);
          MixedSupport132.sceneWidgetState0125.integerState0908 = ComponentContainer.integerState0377;
          MixedSupport132.sceneWidgetState0125.integerState0885 = 1;
          MixedSupport132.sceneWidgetState0125.integerState0910 = 13421772;
          UiComponentPart007.sceneWidgetState0019 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
          UiComponentPart007.sceneWidgetState0019.integerState0912 = 8421504;
          UiComponentPart007.sceneWidgetState0019.integerState0906 = 16777215;
          UiComponentPart007.sceneWidgetState0019.integerState0889 = 16777215;
          UiComponentPart007.sceneWidgetState0019.integerState0910 = 16764006;
          UiComponentPart007.sceneWidgetState0019.integerState0899 = 16777215;
          sceneWidgetLocal35 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
          sceneWidgetLocal35.integerState0908 = ComponentContainer.integerState0377;
          sceneWidgetLocal35.integerState0910 = 16777215;
          sceneWidgetLocal35.bitmapFontState0020 = (BitmapFont) ((Object) renderingSupport010Local27);
          MixedSupport036.sceneWidgetState0028 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
          MixedSupport036.sceneWidgetState0028.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(booleanArgument1, 16, false, 2236962, 2236962, -26198);
          MixedSupport036.sceneWidgetState0028.integerState0893 = 2;
          InputAdapter006.sceneWidgetState0110 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
          InputAdapter006.sceneWidgetState0110.rgbSpriteArrayState0033 = RenderingSupport013.computeRgbSpriteArray1526(false, 16, false, 1513239, 1513239, -26198);
          InputAdapter006.sceneWidgetState0110.integerState0893 = 2;
          MixedSupport036.sceneWidgetState0027 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0028);
          MixedSupport036.sceneWidgetState0027.performAction1996(-118, UiComponentPart007.sceneWidgetState0019);
          RenderingSupport004.sceneWidgetState0040 = new SceneWidget(0L, InputAdapter006.sceneWidgetState0110);
          RenderingSupport004.sceneWidgetState0040.performAction1996(-125, UiComponentPart007.sceneWidgetState0019);
          rgbSpriteArrayLocal36 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "button_mouseover");
          MixedSupport063.sceneWidgetPart002State0001 = new SceneWidgetPart002(MixedSupport005.sceneWidgetState0002, rgbSpriteArrayLocal32, MixedSupport132.sceneWidgetState0125, UiComponentPart007.sceneWidgetState0019, 3, 2, MixedSupport064.integerState0335, 3, ComponentContainer.integerState0377);
          MixedSupport143.sceneWidgetState0128 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
          MixedSupport143.sceneWidgetState0128.rgbSpriteArrayState0035 = rgbSpriteArrayLocal36;
          MixedSupport143.sceneWidgetState0128.integerState0902 = 1;
          MixedSupport143.sceneWidgetState0128.integerState0901 = 1;
          MixedSupport143.sceneWidgetState0128.rgbSpriteArrayState0033 = rgbSpriteArrayLocal33;
          MixedSupport143.sceneWidgetState0128.integerState0884 = 1;
          MixedSupport143.sceneWidgetState0128.integerState0913 = 1;
          MixedSupport143.sceneWidgetState0128.rgbSpriteArrayState0036 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "button_mouseheld");
          MixedSupport143.sceneWidgetState0128.rgbSpriteArrayState0032 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "button_active");
          MixedSupport143.sceneWidgetState0128.rgbSpriteArrayState0034 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "button_disabled");
          MixedSupport143.sceneWidgetState0128.integerState0916 = 1;
          GameDomainSupport002.sceneWidgetState0022 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
          GameDomainSupport002.sceneWidgetState0022.integerState0916 = 1;
          GameDomainSupport002.sceneWidgetState0022.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 125, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "tab_inactive"));
          GameDomainSupport002.sceneWidgetState0022.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 126, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "tab_mouseover"));
          GameDomainSupport002.sceneWidgetState0022.rgbSpriteArrayState0032 = rgbSpriteArrayLocal34;
          MixedSupport035.sceneWidgetState0026 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport035.sceneWidgetState0026.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(-1, -20982, 3, 206, 1127256, 1856141);
          RenderingSupport001.sceneWidgetState0005 = new SceneWidget(0L, (SceneWidget) null);
          RenderingSupport001.sceneWidgetState0005.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(-1, -20982, 3, 290, 6052956, 11579568);
          MixedSupport021.sceneWidgetState0015 = new SceneWidget(0L, sceneWidgetLocal35);
          MixedSupport021.sceneWidgetState0015.integerState0913 = 1;
          MixedSupport021.sceneWidgetState0015.integerState0884 = 1;
          MixedSupport021.sceneWidgetState0015.integerState0916 = 1;
          MixedSupport021.sceneWidgetState0015.integerState0901 = 1;
          MixedSupport021.sceneWidgetState0015.integerState0902 = 1;
          MixedSupport076.sceneWidgetState0072 = new SceneWidget(0L, MixedSupport021.sceneWidgetState0015);
          ComponentDecorator.sceneWidgetState0077 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
          ComponentDecorator.sceneWidgetState0077.integerState0916 = 1;
          ComponentDecorator.sceneWidgetState0077.integerState0913 = 1;
          ComponentDecorator.sceneWidgetState0077.integerState0901 = 1;
          ComponentDecorator.sceneWidgetState0077.integerState0902 = 1;
          ComponentDecorator.sceneWidgetState0077.integerState0884 = 1;
          MixedSupport082.sceneWidgetState0076 = new SceneWidget(0L, ComponentDecorator.sceneWidgetState0077);
          UiComponentPart012.sceneWidgetState0042 = new SceneWidget(0L, ComponentDecorator.sceneWidgetState0077);
          MixedSupport053.sceneWidgetState0047 = new SceneWidget(0L, MixedSupport021.sceneWidgetState0015);
          NetworkSupport008.sceneWidgetState0094 = new SceneWidget(0L, ComponentDecorator.sceneWidgetState0077);
          MixedSupport113.sceneWidgetState0104 = new SceneWidget(0L, ComponentDecorator.sceneWidgetState0077);
          MixedSupport077.sceneWidgetState0073 = new SceneWidget(0L, ComponentDecorator.sceneWidgetState0077);
          ComponentDecorator.sceneWidgetState0077.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 116, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "smallbutton"));
          ComponentDecorator.sceneWidgetState0077.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 113, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "smallbutton_mouseover"));
          cachedRgbSpriteArrayLocal1 = RenderingSupport002.computeRgbSpriteArray0259((byte) 127, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "smallbutton_active"));
          ComponentDecorator.sceneWidgetState0077.rgbSpriteArrayState0032 = cachedRgbSpriteArrayLocal1;
          ComponentDecorator.sceneWidgetState0077.rgbSpriteArrayState0036 = cachedRgbSpriteArrayLocal1;
          ComponentDecorator.sceneWidgetState0077.rgbSpriteArrayState0034 = RenderingSupport002.computeRgbSpriteArray0259((byte) 115, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "smallbutton_disabled"));
          MixedSupport076.sceneWidgetState0072.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 123, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "mediumbutton"));
          MixedSupport076.sceneWidgetState0072.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 117, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "mediumbutton_mouseover"));
          MixedSupport076.sceneWidgetState0072.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 114, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "mediumbutton_mouseheld"));
          MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 120, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "bigbutton"));
          MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 114, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "bigbutton_mouseover"));
          MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 123, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "bigbutton_mouseheld"));
          MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0034 = RenderingSupport002.computeRgbSpriteArray0259((byte) 121, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "bigbutton_disabled"));
          MixedSupport082.sceneWidgetState0076.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 125, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "greenbutton"));
          MixedSupport082.sceneWidgetState0076.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 114, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "greenbutton_mouseover"));
          MixedSupport082.sceneWidgetState0076.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 123, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "greenbutton_mouseheld"));
          UiComponentPart012.sceneWidgetState0042.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 113, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "redbutton"));
          UiComponentPart012.sceneWidgetState0042.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 113, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "redbutton_mouseover"));
          UiComponentPart012.sceneWidgetState0042.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 123, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "redbutton_mouseheld"));
          MixedSupport053.sceneWidgetState0047.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 119, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "backbutton"));
          MixedSupport053.sceneWidgetState0047.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 117, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "backbutton_mouseover"));
          MixedSupport053.sceneWidgetState0047.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 120, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "backbutton_mouseheld"));
          MixedSupport053.sceneWidgetState0047.rgbSpriteArrayState0034 = RenderingSupport002.computeRgbSpriteArray0259((byte) 120, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "backbutton_disabled"));
          MixedSupport077.sceneWidgetState0073.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 122, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "gameoptionbutton"));
          MixedSupport077.sceneWidgetState0073.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 123, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "gameoptionbutton_mouseover"));
          cachedRgbSpriteArrayLocal2 = RenderingSupport002.computeRgbSpriteArray0259((byte) 117, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "gameoptionbutton_active"));
          MixedSupport077.sceneWidgetState0073.rgbSpriteArrayState0032 = cachedRgbSpriteArrayLocal2;
          MixedSupport077.sceneWidgetState0073.rgbSpriteArrayState0036 = cachedRgbSpriteArrayLocal2;
          MixedSupport077.sceneWidgetState0073.rgbSpriteArrayState0034 = RenderingSupport002.computeRgbSpriteArray0259((byte) 114, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "gameoptionbutton_disabled"));
          NetworkSupport008.sceneWidgetState0094.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 124, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatbutton"));
          NetworkSupport008.sceneWidgetState0094.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 114, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatbutton_mouseover"));
          cachedRgbSpriteArrayLocal3 = RenderingSupport002.computeRgbSpriteArray0259((byte) 125, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatbutton_active"));
          NetworkSupport008.sceneWidgetState0094.rgbSpriteArrayState0032 = cachedRgbSpriteArrayLocal3;
          NetworkSupport008.sceneWidgetState0094.rgbSpriteArrayState0036 = cachedRgbSpriteArrayLocal3;
          MixedSupport113.sceneWidgetState0104.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 124, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatfilterbutton"));
          MixedSupport113.sceneWidgetState0104.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 125, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatfilterbutton_mouseover"));
          cachedRgbSpriteArrayLocal4 = RenderingSupport002.computeRgbSpriteArray0259((byte) 126, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "chatfilterbutton_active"));
          MixedSupport113.sceneWidgetState0104.rgbSpriteArrayState0032 = cachedRgbSpriteArrayLocal4;
          MixedSupport113.sceneWidgetState0104.rgbSpriteArrayState0036 = cachedRgbSpriteArrayLocal4;
          rgbSpriteArrayLocal37 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "checkbox");
          InputAdapter002.sceneWidgetPart003State0001 = new SceneWidgetPart003(0L, rgbSpriteArrayLocal37[1], rgbSpriteArrayLocal37[0], 1, UiComponentPart007.sceneWidgetState0019, (String) null);
          TextLayout.sceneWidgetState0011 = new SceneWidget(0L, (SceneWidget) null);
          TextLayout.sceneWidgetState0011.rgbSpriteArrayState0033 = NodeDeque.computeRgbSpriteArray1964(UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "slideregion", "lobby", 8192), 32169);
          TextLayout.sceneWidgetState0011.rgbSpriteArrayState0035 = NodeDeque.computeRgbSpriteArray1964(UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "slideregion_mouseover", "lobby", 8192), 32169);
          TextLayout.sceneWidgetState0011.rgbSpriteArrayState0036 = NodeDeque.computeRgbSpriteArray1964(UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "slideregion_mouseheld", "lobby", 8192), 32169);
          TextLayout.sceneWidgetState0011.rgbSpriteArrayState0034 = NodeDeque.computeRgbSpriteArray1964(UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "slideregion_disabled", "lobby", 8192), 32169);
          MixedSupport090.sceneWidgetState0088 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport090.sceneWidgetState0088.rgbSpriteArrayState0033 = RenderingSupport002.computeRgbSpriteArray0259((byte) 122, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "dragbar"));
          MixedSupport090.sceneWidgetState0088.rgbSpriteArrayState0035 = RenderingSupport002.computeRgbSpriteArray0259((byte) 118, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "dragbar_mouseover"));
          MixedSupport090.sceneWidgetState0088.rgbSpriteArrayState0036 = RenderingSupport002.computeRgbSpriteArray0259((byte) 118, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "dragbar_mouseheld"));
          MixedSupport090.sceneWidgetState0088.rgbSpriteArrayState0034 = RenderingSupport002.computeRgbSpriteArray0259((byte) 124, MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument2, "lobby", "dragbar_disabled"));
          MixedSupport103.sceneWidgetState0096 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport103.sceneWidgetState0096.rgbSpriteState0070 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "upbutton", "lobby", 8192);
          MixedSupport103.sceneWidgetState0096.rgbSpriteState0067 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "upbutton_mouseover", "lobby", 8192);
          MixedSupport103.sceneWidgetState0096.rgbSpriteState0066 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "upbutton_mouseheld", "lobby", 8192);
          MixedSupport103.sceneWidgetState0096.rgbSpriteState0065 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "upbutton_disabled", "lobby", 8192);
          UiComponentPart005.sceneWidgetState0014 = new SceneWidget(0L, (SceneWidget) null);
          UiComponentPart005.sceneWidgetState0014.rgbSpriteState0070 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "downbutton", "lobby", 8192);
          UiComponentPart005.sceneWidgetState0014.rgbSpriteState0067 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "downbutton_mouseover", "lobby", 8192);
          UiComponentPart005.sceneWidgetState0014.rgbSpriteState0066 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "downbutton_mouseheld", "lobby", 8192);
          UiComponentPart005.sceneWidgetState0014.rgbSpriteState0065 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument2, "downbutton_disabled", "lobby", 8192);
          MixedSupport130.sceneWidgetPart006State0002 = new SceneWidgetPart006(0L, MixedSupport103.sceneWidgetState0096, UiComponentPart005.sceneWidgetState0014, TextLayout.sceneWidgetState0011, MixedSupport090.sceneWidgetState0088);
          UiComponentPart015.sceneWidgetPart010State0002 = new SceneWidgetPart010(0L, (SceneWidget) null, MixedSupport047.sceneWidgetState0038, MixedSupport130.sceneWidgetPart006State0002, ComponentDecorator.sceneWidgetState0077, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal41) {
          caughtExceptionLocal25 = caughtParameterLocal41;
          runtimeExceptionLocal26 = caughtExceptionLocal25;
          stackRuntimeExceptionLocal16 = runtimeExceptionLocal26;
          stackStringBuilderLocal17 = new StringBuilder().append("bb.C(").append(booleanArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',');
          if (indexedSpriteArrayArgument3 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          stackStringBuilderLocal21 = ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',');
          if (integerArrayArgument4 == null) {
            stackStringLocal22 = "null";
          } else {
            stackStringLocal22 = "{...}";
          }
          stackStringBuilderLocal23 = ((StringBuilder) (Object) stackStringBuilderLocal21).append(stackStringLocal22).append(',');
          if (resourceArchiveArgument5 == null) {
            stackStringLocal24 = "null";
          } else {
            stackStringLocal24 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal16), ((StringBuilder) (Object) stackStringBuilderLocal23).append(stackStringLocal24).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray0104(int integerArgument1, String stringArgument2, ResourceArchive resourceArchiveArgument3, String stringArgument4) {
        RgbSprite[] rgbSpriteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RgbSprite[] rgbSpriteArrayLocal3 = null;
        RgbSprite[] stackRgbSpriteArrayLocal4 = null;
        RgbSprite[] stackRgbSpriteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          rgbSpriteArrayLocal3 = MixedSupport011.computeRgbSpriteArray0167(integerArgument1 ^ 18144, resourceArchiveArgument3, stringArgument2, stringArgument4);
          rgbSpriteArrayLocal1 = rgbSpriteArrayLocal3;
          rgbSpriteArrayLocal3[1].integerState0254 = rgbSpriteArrayLocal3[1].integerState0258;
          rgbSpriteArrayLocal3[3].integerState0260 = rgbSpriteArrayLocal3[3].integerState0255;
          rgbSpriteArrayLocal3[7].integerState0254 = rgbSpriteArrayLocal3[7].integerState0258;
          if (integerArgument1 != 18064) {
            stackRgbSpriteArrayLocal4 = (RgbSprite[]) null;
            return stackRgbSpriteArrayLocal4;
          }
          rgbSpriteArrayLocal3[5].integerState0260 = rgbSpriteArrayLocal3[5].integerState0255;
          stackRgbSpriteArrayLocal5 = rgbSpriteArrayLocal1;
          return stackRgbSpriteArrayLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("bb.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    final static void performAction0102(byte byteArgument1) {
        if (byteArgument1 != -22) {
          GameDomainSupport001.performAction0103(-30);
        }
    }

    static {
        integerState0051 = -1;
        rgbSpriteArrayArrayState0002 = new RgbSprite[8][];
        integerState0053 = 0;
    }
}
