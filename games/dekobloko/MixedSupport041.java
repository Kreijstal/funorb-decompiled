/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport041 extends MixedSupport001 {
    static int integerState0234;
    private int integerState0235;
    static IndexedSprite[][] indexedSpriteArrayArrayState0002;
    static int[] integerArrayState0048;
    private int integerState0236;
    private int integerState0237;
    private RgbSprite[] rgbSpriteArrayState0012;

    public static void performAction0589(int integerArgument1) {
        if (integerArgument1 != 8) {
          integerArrayState0048 = (int[]) null;
          indexedSpriteArrayArrayState0002 = (IndexedSprite[][]) null;
          integerArrayState0048 = null;
          return;
        }
        indexedSpriteArrayArrayState0002 = (IndexedSprite[][]) null;
        integerArrayState0048 = null;
    }

    public MixedSupport041() {
        this(2188450, 2591221, 9543);
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        try {
          if (byteArgument4 >= -60) {
            MixedSupport041.performAction0589(-101);
          }
          if (!uiComponentArgument5.booleanState0018) {
            stackIntegerLocal1 = (uiComponentArgument5.computeBoolean0239(true)) ? 1 : 0;
          } else {
            stackIntegerLocal1 = 1;
          }
          integerLocal8 = stackIntegerLocal1;
          if (uiComponentArgument5 instanceof InteractiveComponent) {
            booleanArgument1 = booleanArgument1 & ((InteractiveComponent) (uiComponentArgument5)).booleanState0035;
          }
          if (!booleanArgument1) {
            stackIntegerLocal2 = this.integerState0235;
          } else {
            if (integerLocal8 != 0) {
              stackIntegerLocal2 = this.integerState0237;
            } else {
              stackIntegerLocal2 = this.integerState0236;
            }
          }
          integerLocal10 = stackIntegerLocal2;
          stackIntegerLocal3 = (booleanArgument1) ? 16777215 : 7105644;
          integerLocal11 = stackIntegerLocal3;
          MixedSupport115.performAction1660(integerArgument3 - (-uiComponentArgument5.integerState0104 - (uiComponentArgument5.integerState0108 - this.rgbSpriteArrayState0012[0].integerState0260 >> 1)), this.rgbSpriteArrayState0012, uiComponentArgument5.integerState0110 + integerArgument2, uiComponentArgument5.integerState0107, integerLocal10, -121);
          this.bitmapFontState0001.computeInteger1213(uiComponentArgument5.stringState0078, uiComponentArgument5.integerState0110 + integerArgument2, -2 + (uiComponentArgument5.integerState0104 + integerArgument3), uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, integerLocal11, -1, 1, 1, this.bitmapFontState0001.integerState0518);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal7 = caughtParameterLocal12;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("fk.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    private MixedSupport041(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.integerState0236 = integerArgument1;
        this.bitmapFontState0001 = GameDomainSupport002.bitmapFontState0012;
        this.rgbSpriteArrayState0012 = MixedSupport115.rgbSpriteArrayState0024;
        this.integerState0235 = integerArgument3;
        this.integerState0237 = integerArgument2;
    }

    static {
        indexedSpriteArrayArrayState0002 = new IndexedSprite[8][];
        integerArrayState0048 = new int[2];
    }
}
