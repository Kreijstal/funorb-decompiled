/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport038 extends HashNode {
    int integerState0225;
    int integerState0226;
    int integerState0227;
    static BitmapFont bitmapFontState0013;
    int integerState0228;
    int integerState0229;
    int integerState0230;

    public static void performAction0575(int integerArgument1) {
        if (integerArgument1 > -5) {
          return;
        }
        bitmapFontState0013 = null;
    }

    final static void performAction0576(boolean booleanArgument1, int integerArgument2) {
        if (null != MixedSupport071.sceneWidgetPart001State0001) {
          if (!MixedSupport071.sceneWidgetPart001State0001.computeBoolean0171(-1, booleanArgument1)) {
            if (integerArgument2 != 10891) {
              bitmapFontState0013 = (BitmapFont) null;
              return;
            }
            return;
          }
          MixedSupport071.sceneWidgetPart001State0001 = null;
        }
        if (integerArgument2 == 10891) {
          return;
        }
        bitmapFontState0013 = (BitmapFont) null;
    }

    MixedSupport038(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        this.integerState0227 = integerArgument2;
        this.integerState0226 = integerArgument4;
        this.integerState0229 = integerArgument5;
        this.integerState0228 = integerArgument3;
        this.integerState0225 = integerArgument6;
        this.integerState0230 = integerArgument1;
    }

    static {
    }
}
