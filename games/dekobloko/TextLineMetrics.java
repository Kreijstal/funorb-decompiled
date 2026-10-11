/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLineMetrics {
    static RenderingSupport010 renderingSupport010State0004;
    static int[] integerArrayState0167;
    int topY;
    static MixedSupport015 mixedSupport015State0003;
    int bottomY;
    static int integerState0534;
    static boolean booleanState0119;
    static int integerState0535;
    int[] characterXPositions;

    final int getRightX(int integerArgument1) {
        if (integerArgument1 != -6375) {
          this.getRightX(75);
          if (null == this.characterXPositions) {
            return 0;
          }
          if (0 != this.characterXPositions.length) {
            return this.characterXPositions[this.characterXPositions.length - 1];
          }
          return 0;
        }
        if (null == this.characterXPositions) {
          return 0;
        }
        if (0 != this.characterXPositions.length) {
          return this.characterXPositions[this.characterXPositions.length - 1];
        }
        return 0;
    }

    final static void performAction1255(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5) {
        MixedSupport042.performAction0595(integerArgument4 + 20, 256, 16777215, MixedSupport093.stringState0371, integerArgument2, SceneWidget.renderingSupport010State0007);
        UiComponentPart029.renderingSupport010State0005.computeInteger1213(LoginCredentials.tutorialTips[integerArgument1], integerArgument2, integerArgument4 + 24, 120, 200, 16777215, -1, 0, 0, 16);
        if (integerArgument1 == 0) {
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][0].performAction0302(30 + integerArgument2, integerArgument4 + 101, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][0].performAction0302(48 + integerArgument2, 101 + integerArgument4, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][0].performAction0302(integerArgument2 + 66, integerArgument4 + 101, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][0].performAction0302(48 + integerArgument2, 83 + integerArgument4, 18, 18);
          if (byteArgument3 >= 59) {
            if (integerArgument1 != 1) {
              return;
            }
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 30, integerArgument4 + 101, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(48 + integerArgument2, 101 + integerArgument4, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 66, integerArgument4 + 101, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(30 + integerArgument2, integerArgument4 + 83, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(66 + integerArgument2, integerArgument4 + 83, 18, 18);
            return;
          }
          renderingSupport010State0004 = (RenderingSupport010) null;
          if (integerArgument1 == 1) {
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 30, integerArgument4 + 101, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(48 + integerArgument2, 101 + integerArgument4, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 66, integerArgument4 + 101, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(30 + integerArgument2, integerArgument4 + 83, 18, 18);
            MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(66 + integerArgument2, integerArgument4 + 83, 18, 18);
            return;
          }
          return;
        }
        if (byteArgument3 < 59) {
          renderingSupport010State0004 = (RenderingSupport010) null;
          if (integerArgument1 != 1) {
            return;
          }
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 30, integerArgument4 + 101, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(48 + integerArgument2, 101 + integerArgument4, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 66, integerArgument4 + 101, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(30 + integerArgument2, integerArgument4 + 83, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(66 + integerArgument2, integerArgument4 + 83, 18, 18);
          return;
        }
        if (integerArgument1 != 1) {
          return;
        }
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 30, integerArgument4 + 101, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(48 + integerArgument2, 101 + integerArgument4, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(integerArgument2 + 66, integerArgument4 + 101, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(30 + integerArgument2, integerArgument4 + 83, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument5][4].performAction0302(66 + integerArgument2, integerArgument4 + 83, 18, 18);
    }

    public static void performAction1254(int integerArgument1) {
        integerArrayState0167 = null;
        renderingSupport010State0004 = null;
        mixedSupport015State0003 = null;
        int integerLocal1 = -117 / ((-57 - integerArgument1) / 50);
    }

    final int findNearestCharacterIndex(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.characterXPositions == null) {
          return 0;
        }
        if (this.characterXPositions.length == 0) {
          return 0;
        }
        for (integerLocal1 = 1; this.characterXPositions.length > integerLocal1; integerLocal1++) {
          if (integerArgument1 < (this.characterXPositions[-1 + integerLocal1] + this.characterXPositions[integerLocal1] >> 1)) {
            return integerLocal1 - 1;
          }
        }
        if (integerArgument2 > 103) {
          return -1 + this.characterXPositions.length;
        }
        TextLineMetrics.performAction1254(-11);
        return -1 + this.characterXPositions.length;
    }

    final static boolean computeBoolean1256(int integerArgument1) {
        if (integerArgument1 != 48) {
          TextLineMetrics.performAction1255(-116, 95, (byte) -90, 127, 46);
          return ProxySocketFactory.codecSupport002State0001.computeBoolean1248(true);
        }
        return ProxySocketFactory.codecSupport002State0001.computeBoolean1248(true);
    }

    TextLineMetrics(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.topY = integerArgument1;
        this.characterXPositions = new int[integerArgument3 + 1];
        this.bottomY = integerArgument2;
    }

    static {
        integerState0535 = 0;
    }
}
