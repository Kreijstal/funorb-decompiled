/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport044 extends MixedSupport086 {
    static String stringState0187;
    static SceneWidget sceneWidgetState0034;
    private java.nio.ByteBuffer byteBufferState0001;

    final byte[] computeByteArray0605(int integerArgument1) {
        if (integerArgument1 != 256) {
          return (byte[]) null;
        }
        byte[] byteArrayLocal1 = new byte[this.byteBufferState0001.capacity()];
        byte[] byteArrayLocal2 = byteArrayLocal1;
        this.byteBufferState0001.position(0);
        this.byteBufferState0001.get(byteArrayLocal1);
        return byteArrayLocal1;
    }

    final static void performAction0606(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2, ResourceArchive resourceArchiveArgument3, int integerArgument4) {
        RgbSprite rgbSpriteLocal1 = null;
        IndexedSprite[] indexedSpriteArrayLocal2 = null;
        IndexedSprite[][] indexedSpriteArrayArrayLocal3 = null;
        int[][] integerArrayArrayLocal4 = null;
        int[][] integerArrayArrayLocal5 = null;
        int[][] integerArrayArrayLocal6 = null;
        IndexedSprite[] indexedSpriteArrayLocal7 = null;
        int integerLocal8 = 0;
        RgbSprite rgbSpriteLocal9 = null;
        RgbSprite rgbSpriteLocal10 = null;
        RgbSprite rgbSpriteLocal11 = null;
        RgbSprite rgbSpriteLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal16;
        int integerLocal17;
        try {
          NetworkSupport002.rgbSpriteArrayState0003 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument1, "commonui", "frame_top");
          UiComponentPart011.rgbSpriteArrayState0013 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument1, "commonui", "frame_bottom");
          MixedSupport069.rgbSpriteState0025 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument1, "jagex_logo_grey", "commonui", 8192);
          MixedSupport115.rgbSpriteArrayState0024 = MixedSupport011.computeRgbSpriteArray0167(112, resourceArchiveArgument1, "commonui", "button");
          MixedSupport129.rgbSpriteArrayState0028 = MixedSupport003.computeRgbSpriteArray0040(0, "commonui", "validation", resourceArchiveArgument1);
          MixedSupport011.bitmapFontState0006 = (BitmapFont) ((Object) MixedSupport147.computeRenderingSupport0121955(resourceArchiveArgument3, resourceArchiveArgument1, "commonui", (byte) 110, "arezzo12"));
          GameDomainSupport003.bitmapFontState0015 = (BitmapFont) ((Object) MixedSupport147.computeRenderingSupport0121955(resourceArchiveArgument3, resourceArchiveArgument1, "commonui", (byte) 93, "arezzo14"));
          GameDomainSupport002.bitmapFontState0012 = (BitmapFont) ((Object) MixedSupport147.computeRenderingSupport0121955(resourceArchiveArgument3, resourceArchiveArgument1, "commonui", (byte) -121, "arezzo14bold"));
          rgbSpriteLocal1 = new RgbSprite(resourceArchiveArgument2.computeByteArray0916(0, "", "button.gif"), (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
          GameApplet.computeIndexedSprite0757("dropdown", resourceArchiveArgument1, "commonui", (byte) 73);
          indexedSpriteArrayLocal2 = UiComponentPart030.computeIndexedSpriteArray1760("screen_options", resourceArchiveArgument1, false, "commonui");
          UiComponentPart007.indexedSpriteArrayState0002 = new IndexedSprite[4];
          ThemeTips.indexedSpriteArrayState0004 = new IndexedSprite[4];
          MixedSupport002.indexedSpriteArrayState0001 = new IndexedSprite[4];
          indexedSpriteArrayArrayLocal3 = new IndexedSprite[][]{UiComponentPart007.indexedSpriteArrayState0002, ThemeTips.indexedSpriteArrayState0004, MixedSupport002.indexedSpriteArrayState0001};
          integerArrayArrayLocal4 = new int[4][];
          integerArrayArrayLocal5 = integerArrayArrayLocal4;
          integerArrayArrayLocal6 = integerArrayArrayLocal5;
          integerArrayArrayLocal6[0] = indexedSpriteArrayLocal2[0].integerArrayState0183;
          for (integerLocal13 = 1; integerLocal13 < integerArrayArrayLocal4.length; integerLocal13++) {
            integerArrayArrayLocal6[integerLocal13] = (int[]) ((Object) integerArrayArrayLocal4[0].clone());
          }
          integerLocal16 = indexedSpriteArrayLocal2[0].byteArrayState0021[0];
          integerArrayArrayLocal4[2][integerLocal16] = 16777215;
          integerArrayArrayLocal4[1][integerLocal16] = 2394342;
          integerArrayArrayLocal4[3][integerLocal16] = 4767999;
          for (integerLocal14 = 0; integerLocal14 < 3; integerLocal14++) {
            indexedSpriteArrayLocal7 = indexedSpriteArrayArrayLocal3[integerLocal14];
            IndexedSprite[] indexedSpriteArrayLocal18 = indexedSpriteArrayLocal7;
            for (integerLocal8 = 0; indexedSpriteArrayLocal7.length > integerLocal8; integerLocal8++) {
              indexedSpriteArrayLocal7[integerLocal8] = MixedSupport052.computeIndexedSprite0684(0, integerArrayArrayLocal4[integerLocal8], indexedSpriteArrayLocal2[integerLocal14]);
            }
          }
          integerLocal17 = rgbSpriteLocal1.integerState0255;
          IterableNodeCollection.performAction1876(-9074);
          rgbSpriteLocal1.performAction0278();
          SoftwareRaster.performAction0733(0, 0, SoftwareRaster.integerState0285, SoftwareRaster.integerState0284);
          rgbSpriteLocal9 = new RgbSprite(integerLocal17, integerLocal17);
          rgbSpriteLocal10 = rgbSpriteLocal9;
          rgbSpriteLocal10.performAction0278();
          rgbSpriteLocal1.performAction0312(0, integerArgument4);
          rgbSpriteLocal11 = new RgbSprite(integerLocal17, integerLocal17);
          rgbSpriteLocal11.performAction0278();
          rgbSpriteLocal1.performAction0312(integerLocal17 - rgbSpriteLocal1.integerState0258, 0);
          rgbSpriteLocal12 = new RgbSprite(rgbSpriteLocal1.integerState0258 - 2 * integerLocal17, integerLocal17);
          rgbSpriteLocal12.performAction0278();
          rgbSpriteLocal1.performAction0312(-integerLocal17, 0);
          MixedSupport086.performAction1200((byte) -5);
          MixedSupport115.rgbSpriteArrayState0024 = new RgbSprite[]{rgbSpriteLocal9, rgbSpriteLocal12, rgbSpriteLocal11};
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fn.F(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ')');
        }
    }

    MixedSupport044() {
    }

    public static void performAction0608(int integerArgument1) {
        if (integerArgument1 != 0) {
          ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
          MixedSupport044.performAction0606((ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, 51);
        }
        sceneWidgetState0034 = null;
        stringState0187 = null;
    }

    final void performAction0607(byte[] byteArrayArgument1, boolean booleanArgument2) {
        this.byteBufferState0001 = java.nio.ByteBuffer.allocateDirect(byteArrayArgument1.length);
        this.byteBufferState0001.position(0);
        if (!booleanArgument2) {
          return;
        }
        try {
          this.byteBufferState0001.put(byteArrayArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fn.A(" + (byteArrayArgument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    static {
        stringState0187 = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
