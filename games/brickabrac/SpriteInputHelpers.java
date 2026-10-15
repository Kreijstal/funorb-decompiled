/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteInputHelpers {
    static IndexedSprite[] field_f;
    static int[] pendingAchievementMask;
    static String ignoreTabLabel;
    static String[] field_c;
    static RgbSprite parisSmallSprite;
    static int keyChangeWriteIndex;

    final static RgbSprite createHalfSizeSprite(int obfuscationGuard, RgbSprite sprite) {
        RgbSprite halfSprite = null;
        RuntimeException failure = null;
        byte[] unusedBytes = null;
        RgbSprite result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String spriteSummary = null;
        RuntimeException caughtFailure = null;
        try {
          halfSprite = new RgbSprite(sprite.canvasWidth / 2, sprite.canvasHeight / 2);
          if (obfuscationGuard != -16371) {
            unusedBytes = (byte[]) null;
            SpriteInputHelpers.requestCreateGame(-81, (byte[]) null, 117, false, 81, (byte) 40);
          }
          halfSprite.bindRasterTarget();
          sprite.drawHalfSize(0, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 103);
          result = halfSprite;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("pl.F(").append(obfuscationGuard).append(',');
          if (sprite == null) {
            spriteSummary = "null";
          } else {
            spriteSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(spriteSummary).append(')').toString());
        }
    }

    final static void requestCreateGame(int opcode, byte[] settings, int choiceId, boolean creationFlag128, int modeWord, byte obfuscationGuard) {
        BitPacketBuffer packet = null;
        int payloadStart = 0;
        int creationWord = 0;
        try {
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          payloadStart = packet.position;
          packet.writeByte(15, 4);
          packet.writeByte(81, choiceId);
          if (obfuscationGuard >= -55) {
            pendingAchievementMask = (int[]) null;
          }
          creationWord = modeWord;
          if (creationFlag128) {
            creationWord += 128;
          }
          packet.writeByte(46, creationWord);
          packet.writeBytes(settings, -1, 0, settings.length);
          packet.backfillByteLength((byte) 123, -payloadStart + packet.position);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pl.B(" + opcode + ',' + (settings != null ? "{...}" : "null") + ',' + choiceId + ',' + creationFlag128 + ',' + modeWord + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
          ResourceArchive var2 = (ResourceArchive) null;
          SpriteInputHelpers.loadRgbSpriteByName((String) null, (String) null, (byte) -53, (ResourceArchive) null);
        }
        field_c = null;
        parisSmallSprite = null;
        ignoreTabLabel = null;
        pendingAchievementMask = null;
    }

    final static void encodeBinaryMaskRuns(RgbSprite sprite, int firstOffsetRow) {
        int offsetRow = 0;
        int column = 0;
        int sourceIndexBeforeIncrement = 0;
        int offsetIndexBeforeIncrement = 0;
        int runIndexBeforeIncrement = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String spriteSummary = null;
        RuntimeException caughtFailure = null;
        int[] offsetsAlias = null;
        RuntimeException failure = null;
        int sourceIndex = 0;
        int runCount = 0;
        int[] encodedPixels = null;
        int opaqueRunLength = 0;
        int transparentRunLength = 0;
        int sourcePixel = 0;
        int unusedGameFlag = 0;
        int[] offsetsInitialAlias = null;
        int[] offsetsAllocatedAlias = null;
        int[] rowOffsets = null;
        int encodedIndex;
        int offsetCopyIndex;
        int runCopyIndex;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          rowOffsets = new int[sprite.height];
          offsetsAllocatedAlias = rowOffsets;
          offsetsInitialAlias = offsetsAllocatedAlias;
          offsetsAlias = offsetsInitialAlias;
          sourceIndex = 0;
          runCount = 0;
          for (offsetRow = firstOffsetRow; offsetRow < sprite.height; offsetRow++) {
            offsetsInitialAlias[offsetRow] = runCount + sprite.height;
            opaqueRunLength = 0;
            transparentRunLength = 0;
            for (column = 0; sprite.width > column; column++) {
              sourceIndexBeforeIncrement = sourceIndex;
              sourceIndex++;
              sourcePixel = sprite.pixels[sourceIndexBeforeIncrement];
              if (sourcePixel == 0) {
                if (0 < opaqueRunLength) {
                  opaqueRunLength = 0;
                  runCount++;
                }
                transparentRunLength++;
                sprite.pixels[runCount] = -transparentRunLength;
              } else {
                if (0 < transparentRunLength) {
                  runCount++;
                  transparentRunLength = 0;
                }
                opaqueRunLength++;
                sprite.pixels[runCount] = opaqueRunLength;
              }
            }
            runCount++;
          }
          encodedIndex = 0;
          encodedPixels = new int[runCount + sprite.height];
          for (offsetCopyIndex = 0; sprite.height > offsetCopyIndex; offsetCopyIndex++) {
            offsetIndexBeforeIncrement = encodedIndex;
            encodedIndex++;
            encodedPixels[offsetIndexBeforeIncrement] = rowOffsets[offsetCopyIndex];
          }
          for (runCopyIndex = 0; runCount > runCopyIndex; runCopyIndex++) {
            runIndexBeforeIncrement = encodedIndex;
            encodedIndex++;
            encodedPixels[runIndexBeforeIncrement] = sprite.pixels[runCopyIndex];
          }
          sprite.pixels = encodedPixels;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("pl.A(");
          if (sprite == null) {
            spriteSummary = "null";
          } else {
            spriteSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(spriteSummary).append(',').append(firstOffsetRow).append(')').toString());
        }
    }

    final static void attachMouseInput(java.awt.Component component, int obfuscationGuard) {
        try {
          component.addMouseListener(PowerUpWarning.mouseInput);
          component.addMouseMotionListener(PowerUpWarning.mouseInput);
          if (obfuscationGuard != 7282) {
            ResourceArchive unusedArchive = (ResourceArchive) null;
            SpriteInputHelpers.loadRgbSpriteByName((String) null, (String) null, (byte) 8, (ResourceArchive) null);
          }
          component.addFocusListener(PowerUpWarning.mouseInput);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "pl.E(" + (component != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static int measureTextChoiceLine(int obfuscationGuard, String text, boolean buttonLine) {
        RuntimeException measurementFailure = null;
        int buttonWidth = 0;
        int bodyWidth = 0;
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String textArgumentSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 0) {
            SpriteInputHelpers.a(-94);
          }
          if (!buttonLine) {
            bodyWidth = Widget.textChoiceBodyFont.measureText(text);
            return bodyWidth;
          }
          buttonWidth = PowerUpWarning.textChoiceButtonFont.measureText(text);
          return buttonWidth;
        } catch (java.lang.RuntimeException caughtMeasurementFailure) {
          caughtFailure = caughtMeasurementFailure;
          measurementFailure = caughtFailure;
          contextFailure = measurementFailure;
          contextPrefix = new StringBuilder().append("pl.G(").append(obfuscationGuard).append(',');
          if (text == null) {
            textArgumentSummary = "null";
          } else {
            textArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(textArgumentSummary).append(',').append(buttonLine).append(')').toString());
        }
    }

    final static RgbSprite loadRgbSpriteByName(String groupName, String fileName, byte obfuscationGuard, ResourceArchive archive) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RgbSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = archive.getGroupId(groupName, false);
          var5 = archive.getFileId(var4_int, -108, fileName);
          var6 = 116 % ((40 - obfuscationGuard) / 57);
          stackIn_1_0 = AccountRegistrationPanel.loadRgbSprite(-873, archive, var4_int, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pl.D(");
          if (groupName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        ignoreTabLabel = "Ignore";
        pendingAchievementMask = Ball.createAchievementMask(8);
        keyChangeWriteIndex = 0;
        field_c = new String[]{"All scores", "My scores", "Best each"};
    }
}
