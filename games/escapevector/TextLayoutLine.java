/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    static int field_e;
    static boolean[] field_f;
    int bottom;
    int[] insertionX;
    int top;
    static int[] field_c;

    public static void releaseStatics(int guard) {
        field_f = null;
        field_c = null;
        if (guard != -19467) {
          TextLayoutLine.releaseStatics(42);
        }
    }

    final int width(int guard) {
        int stackIn_5_0 = 0;
        int var2 = -117 % ((guard - 60) / 52);
        if (this.insertionX != null &&
          this.insertionX.length != 0) {
          stackIn_5_0 = this.insertionX[-1 + this.insertionX.length];
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    final static int sineQ16(int angle, int guard) {
        if (guard >= -113) {
          return -7;
        }
        return MeshRasterState.sineQ16[angle & 2047];
    }

    final static void installThemeObjectSprites(int guard, int theme) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          boolean stackIn_4_0 = !(theme != 4);
          boolean var2_int = stackIn_4_0;
          if (NodeHashTableIterator.field_b == null) {
            return;
          }
          if (null == AccountMessagePanel.field_M) {
            return;
          }
          if (theme < 0 ||
            theme >= 7) {
            theme = 0;
          }
          if (theme == 5 ||
            theme == 6) {
            theme = 0;
          }
          Sprite[] var3 = NodeHashTableIterator.field_b[theme];
          if (var2_int) {
            var3 = ServerListNavigationSupport.field_a;
          }
          if (guard != 1) {
            TextLayoutLine.releaseStatics(98);
          }
          Sprite[] var4 = AccountMessagePanel.field_M[theme];
          for (int var5 = 0; 3 > var5; var5++) {
            if (var3 == null) {
              theme = 0;
              var3 = NodeHashTableIterator.field_b[theme];
              var4 = AccountMessagePanel.field_M[theme];
            }
            Sprite var6 = var3[var5];
            int var7 = var5 + 14;
            Sprite[] var8 = AchievementThresholdRule.objectSprites;
            if (var2_int) {
              var8 = ArchiveProvider.field_b;
            }
            var8[var7] = var6;
            Sprite var9 = var4[var5];
            StripedProgressBar.objectGlowSprites[var7] = var9;
          }
          DualLinkNode.initializeObjectSpriteSets(-1, theme);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "vl.B(" + guard + ',' + theme + ')');
        }
    }

    final int characterIndexAtX(byte guard, int x) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.insertionX == null) {
          return 0;
        }
        if (0 == this.insertionX.length) {
          return 0;
        }
        int var3 = 1;
        if (guard != 52) {
          this.characterIndexAtX((byte) -102, -12);
        }
        while (this.insertionX.length > var3) {
          if (this.insertionX[var3] + this.insertionX[-1 + var3] >> 1 > x) {
            return -1 + var3;
          }
          var3++;
        }
        return this.insertionX.length - 1;
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.bottom = param1;
        this.top = param0;
        this.insertionX = new int[1 + param2];
    }

    final static int[] createSpacedPositions(int step, int offset, int count, byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[count];
        int[] var4 = var7;
        for (int var5 = 0; var5 < count; var5++) {
          var7[var5] = (var5 + (offset + 1)) * step;
        }
        if (guard != -17) {
          field_f = (boolean[]) null;
        }
        return var4;
    }

    static {
        field_f = new boolean[]{false, false, false, false};
        field_c = new int[]{19, 20};
    }
}
