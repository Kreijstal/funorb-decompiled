/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    static int avatarShockFrameIndex;
    int fullWidth;
    int trimX;
    int width;
    int fullHeight;
    int height;
    int trimY;

    abstract void drawAlpha(int x, int y, int alpha256);

    abstract void draw(int x, int y);

    private final static IndexedSprite copyIndexedSpriteWithPalette(int methodGuard, int[] palette, IndexedSprite sourceSprite) {
        IndexedSprite copy = null;
        RuntimeException copyFailureForContext = null;
        IndexedSprite nullWrongGuardResult = null;
        IndexedSprite copyBeforeReturn = null;
        RuntimeException copyFailureBeforeDescription = null;
        StringBuilder copyMessagePrefix = null;
        String paletteDescription = null;
        StringBuilder messageBeforeSource = null;
        String sourceDescription = null;
        RuntimeException caughtCopyFailure = null;
        try {
          copy = new IndexedSprite(0, 0, 0);
          copy.width = sourceSprite.width;
          copy.fullWidth = sourceSprite.fullWidth;
          copy.height = sourceSprite.height;
          if (methodGuard >= -62) {
            nullWrongGuardResult = (IndexedSprite) null;
            return nullWrongGuardResult;
          }
          copy.fullHeight = sourceSprite.fullHeight;
          copy.palette = palette;
          copy.indices = sourceSprite.indices;
          copy.trimY = sourceSprite.trimY;
          copy.trimX = sourceSprite.trimX;
          copyBeforeReturn = copy;
          return copyBeforeReturn;
        } catch (java.lang.RuntimeException copyFailure) {
          caughtCopyFailure = copyFailure;
          copyFailureForContext = caughtCopyFailure;
          copyFailureBeforeDescription = copyFailureForContext;
          copyMessagePrefix = new StringBuilder().append("ha.I(").append(methodGuard).append(',');
          if (palette == null) {
            paletteDescription = "null";
          } else {
            paletteDescription = "{...}";
          }
          messageBeforeSource = ((StringBuilder) (Object) copyMessagePrefix).append(paletteDescription).append(',');
          if (sourceSprite == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) copyFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeSource).append(sourceDescription).append(')').toString());
        }
    }

    final static void loadCommonUiResources(byte methodGuard, ResourceArchive buttonImageArchive, ResourceArchive spriteArchive, ResourceArchive fontArchive) {
        Sprite buttonImage = null;
        IndexedSprite[] screenOptionFrames = null;
        IndexedSprite[][] screenOptionStateSets = null;
        int[][] statePalettes = null;
        int[][] palettesBeforeWorkingAlias = null;
        int[][] workingPalettes = null;
        IndexedSprite[] currentFrameStates = null;
        int paletteStateIndex = 0;
        Sprite leftButtonCap = null;
        Sprite leftButtonCapRasterAlias = null;
        Sprite rightButtonCap = null;
        Sprite buttonCenter = null;
        int paletteCloneIndexThenRecoloredIndex = 0;
        int spriteFrameIndexThenButtonHeight = 0;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
            RasterTargetRestoreSupport.dialogTopFrameSprites = OpacityWidget.loadSpriteFrames("frame_top", "commonui", spriteArchive, 0);
            UnderlinedButtonRenderer.frameBottomSprites = OpacityWidget.loadSpriteFrames("frame_bottom", "commonui", spriteArchive, 0);
            AvatarFeedbackSupport.grayJagexLogoSprite = ScorePopupSupport.loadSprite("jagex_logo_grey", spriteArchive, (byte) -78, "commonui");
            MouseWheelInput.commonButtonSprites = OpacityWidget.loadSpriteFrames("button", "commonui", spriteArchive, 0);
            ClientClockSupport.validationStateSprites = ByteArrayPoolSupport.loadSpritesByName((byte) -39, "validation", "commonui", spriteArchive);
            UiFontResources.commonUiSmallFont = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(fontArchive, 1, "arezzo12", "commonui", spriteArchive));
            DialogLayer.sharedUiFont = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(fontArchive, 1, "arezzo14", "commonui", spriteArchive));
            UiFontResources.commonUiBoldFont = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(fontArchive, 1, "arezzo14bold", "commonui", spriteArchive));
            buttonImage = new Sprite(buttonImageArchive.getNamedFile(0, "", "button.gif"), (java.awt.Component) ((Object) MessageDialog.gameCanvas));
            SocketConnector.loadIndexedSprite(spriteArchive, 1, "commonui", "dropdown");
            screenOptionFrames = MenuScreen.loadIndexedSpriteFrames("commonui", "screen_options", true, spriteArchive);
            DebugOverviewCompositor.screenOptionOneStateSprites = new IndexedSprite[4];
            ClientTimingSupport.screenOptionTwoStateSprites = new IndexedSprite[4];
            PointerMenuState.screenOptionThreeStateSprites = new IndexedSprite[4];
            screenOptionStateSets = new IndexedSprite[][]{DebugOverviewCompositor.screenOptionOneStateSprites, ClientTimingSupport.screenOptionTwoStateSprites, PointerMenuState.screenOptionThreeStateSprites};
            statePalettes = new int[4][];
            palettesBeforeWorkingAlias = statePalettes;
            workingPalettes = palettesBeforeWorkingAlias;
            workingPalettes[0] = screenOptionFrames[0].palette;
            for (paletteCloneIndexThenRecoloredIndex = 1; statePalettes.length > paletteCloneIndexThenRecoloredIndex; paletteCloneIndexThenRecoloredIndex++) {
                workingPalettes[paletteCloneIndexThenRecoloredIndex] = (int[]) ((Object) statePalettes[0].clone());
            }
            paletteCloneIndexThenRecoloredIndex = screenOptionFrames[0].indices[0];
            statePalettes[2][paletteCloneIndexThenRecoloredIndex] = 16777215;
            statePalettes[1][paletteCloneIndexThenRecoloredIndex] = 2394342;
            statePalettes[3][paletteCloneIndexThenRecoloredIndex] = 4767999;
            for (spriteFrameIndexThenButtonHeight = 0; spriteFrameIndexThenButtonHeight < 3; spriteFrameIndexThenButtonHeight++) {
                currentFrameStates = screenOptionStateSets[spriteFrameIndexThenButtonHeight];
                IndexedSprite[] unusedFrameStatesAlias = currentFrameStates;
                for (paletteStateIndex = 0; paletteStateIndex < currentFrameStates.length; paletteStateIndex++) {
                    currentFrameStates[paletteStateIndex] = IndexedSpriteState.copyIndexedSpriteWithPalette(-84, statePalettes[paletteStateIndex], screenOptionFrames[spriteFrameIndexThenButtonHeight]);
                }
            }
            spriteFrameIndexThenButtonHeight = buttonImage.height;
            SpriteCheckboxRenderer.pushRasterTarget(-105);
            if (methodGuard <= 98) {
                IndexedSprite unusedNullSpriteSnapshot = (IndexedSprite) null;
                IndexedSpriteState.copyIndexedSpriteWithPalette(72, (int[]) null, (IndexedSprite) null);
            }
            buttonImage.setAsRasterTarget();
            SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight);
            leftButtonCap = new Sprite(spriteFrameIndexThenButtonHeight, spriteFrameIndexThenButtonHeight);
            leftButtonCapRasterAlias = leftButtonCap;
            leftButtonCapRasterAlias.setAsRasterTarget();
            buttonImage.drawUnmasked(0, 0);
            rightButtonCap = new Sprite(spriteFrameIndexThenButtonHeight, spriteFrameIndexThenButtonHeight);
            rightButtonCap.setAsRasterTarget();
            buttonImage.drawUnmasked(spriteFrameIndexThenButtonHeight - buttonImage.width, 0);
            buttonCenter = new Sprite(buttonImage.width - 2 * spriteFrameIndexThenButtonHeight, spriteFrameIndexThenButtonHeight);
            buttonCenter.setAsRasterTarget();
            buttonImage.drawUnmasked(-spriteFrameIndexThenButtonHeight, 0);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            MouseWheelInput.commonButtonSprites = new Sprite[]{leftButtonCap, buttonCenter, rightButtonCap};
        } catch (RuntimeException loadFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loadFailure), "ha.G(" + methodGuard + ',' + (buttonImageArchive != null ? "{...}" : "null") + ',' + (spriteArchive != null ? "{...}" : "null") + ',' + (fontArchive != null ? "{...}" : "null") + ')');
        }
    }

    final static int getKeyboardIdleTicks(int methodGuard) {
        int guardQuotient = 77 / ((methodGuard + 17) / 52);
        return TextPairLoginPayload.keyboardIdleTicks;
    }

    static {
        avatarShockFrameIndex = 0;
    }
}
