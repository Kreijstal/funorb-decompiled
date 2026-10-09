/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogContent extends WidgetContainer implements ButtonActivationListener {
    private String messageText;
    private MessageDialog messageDialog;
    private ButtonWidget[] actionButtons;
    private int[] buttonActionIds;
    private BitmapFont messageFont;
    private int buttonSlotCount;
    static String createToUseText;
    static int fullscreenDialogPointerOriginY;

    private final void ensureButtonSlots(int methodGuard, int slotCount) {
        int buttonSlotIndex = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (this.buttonSlotCount >= slotCount) {
            return;
        }
        ButtonWidget[] allocatedButtons = new ButtonWidget[slotCount];
        ButtonWidget[] replacementButtonsAlias = allocatedButtons;
        int[] replacementActionIds = new int[slotCount];
        for (buttonSlotIndex = 0; buttonSlotIndex < this.buttonSlotCount; buttonSlotIndex++) {
            allocatedButtons[buttonSlotIndex] = this.actionButtons[buttonSlotIndex];
            replacementActionIds[buttonSlotIndex] = this.buttonActionIds[buttonSlotIndex];
        }
        this.actionButtons = replacementButtonsAlias;
        this.buttonActionIds = replacementActionIds;
        this.buttonSlotCount = slotCount;
        if (methodGuard != -11272) {
            this.messageFont = (BitmapFont) null;
        }
    }

    final static void loadLogoMeshesAndMaterials(ResourceArchive archive, int methodGuard) {
        int meshCount = 0;
        int meshIndexOrInitialCursor = 0;
        TriangleMesh mesh = null;
        int[] meshCenter = null;
        int controlFlagSnapshot = 0;
        PacketBuffer logoInput = null;
        int centerMeshIndex = 0;
        PacketBuffer logoInputAlias = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String archiveContextDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        int meshIndexOrInitialCursorLiteralPhase1;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          logoInput = new PacketBuffer(archive.getNamedFile(methodGuard + methodGuard, "", "logo.fo3d"));
          logoInputAlias = logoInput;
          meshCount = logoInputAlias.readUnsignedByte((byte) 34);
          logoInputAlias.beginBitAccess(methodGuard + 8);
          DirectByteStorage.meshMaterials = AvatarFeedbackSupport.readMeshMaterials(logoInputAlias, true);
          ArchiveIndex.logoMeshes = new TriangleMesh[meshCount];
          ValidationMessageWidget.logoMeshCenters = new int[meshCount][];
          for (meshIndexOrInitialCursor = 0; meshIndexOrInitialCursor < meshCount; meshIndexOrInitialCursor++) {
            ArchiveIndex.logoMeshes[meshIndexOrInitialCursor] = PasswordWidgetRenderer.decodePackedTriangleMesh(logoInput, (byte) 113);
          }
          logoInputAlias.endBitAccess(-16989);
          centerMeshIndex = 0;
          meshIndexOrInitialCursorLiteralPhase1 = centerMeshIndex;
          while (meshCount > centerMeshIndex) {
            mesh = ArchiveIndex.logoMeshes[centerMeshIndex];
            mesh.scaleVertices(6, 1, (byte) 89, 6, 6);
            mesh.refreshBounds((byte) -99);
            meshCenter = new int[]{mesh.minX + mesh.maxX >> 1, mesh.maxY + mesh.minY >> 1, mesh.maxZ + mesh.minZ >> 1};
            ValidationMessageWidget.logoMeshCenters[centerMeshIndex] = meshCenter;
            mesh.translateVertices(-meshCenter[0], -meshCenter[1], -9121, -meshCenter[2]);
            centerMeshIndex++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          failureContextBuilder = new StringBuilder().append("ni.KA(");
          if (archive == null) {
            archiveContextDescription = "null";
          } else {
            archiveContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(archiveContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final ButtonWidget appendButton(int verticalOffset, String label, WidgetListener listener) {
        ButtonWidget createdButton = null;
        RuntimeException appendFailureForContext = null;
        int buttonOffsetY = 0;
        ButtonWidget buttonBeforeReturn = null;
        RuntimeException appendFailureBeforeDescriptions = null;
        StringBuilder appendMessagePrefix = null;
        String labelDescription = null;
        StringBuilder appendMessageBeforeListener = null;
        String listenerDescription = null;
        RuntimeException appendFailure = null;
        try {
          createdButton = new ButtonWidget(label, listener);
          createdButton.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
          buttonOffsetY = verticalOffset + this.widgetHeight;
          this.setWidgetBounds(34 + this.widgetHeight, this.widgetWidth, (byte) -53, 0, 0);
          createdButton.setWidgetBounds(30, this.widgetWidth - 14, (byte) -33, buttonOffsetY, 7);
          this.addChild((byte) -73, createdButton);
          buttonBeforeReturn = createdButton;
          return buttonBeforeReturn;
        } catch (java.lang.RuntimeException caughtAppendFailure) {
          appendFailure = caughtAppendFailure;
          appendFailureForContext = appendFailure;
          appendFailureBeforeDescriptions = appendFailureForContext;
          appendMessagePrefix = new StringBuilder().append("ni.GA(").append(verticalOffset).append(',');
          if (label == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          appendMessageBeforeListener = ((StringBuilder) (Object) appendMessagePrefix).append(labelDescription).append(',');
          if (listener == null) {
            listenerDescription = "null";
          } else {
            listenerDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) appendFailureBeforeDescriptions), ((StringBuilder) (Object) appendMessageBeforeListener).append(listenerDescription).append(')').toString());
        }
    }

    MessageDialogContent(MessageDialog messageDialog, BitmapFont messageFont, String messageText) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int wrappedMessageHeight = 0;
        this.buttonSlotCount = 0;
        try {
            this.messageFont = messageFont;
            this.messageDialog = messageDialog;
            this.messageText = messageText;
            wrappedMessageHeight = null == this.messageText ? 0 : this.messageFont.measureWrappedHeight(this.messageText, 260, this.messageFont.maxAscent);
            this.setWidgetBounds(wrappedMessageHeight + 22, 288, (byte) -119, 0, 0);
        } catch (RuntimeException contentInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contentInitializationFailure), "ni.<init>(" + (messageDialog != null ? "{...}" : "null") + ',' + (messageFont != null ? "{...}" : "null") + ',' + (messageText != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawTransientEntities(int methodGuard) {
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity transientEntityToDraw = null;
        RuntimeException caughtTransientDrawFailure = null;
        RuntimeException transientDrawFailureForContext = null;
        clientControlFlowGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 484842465) {
            MessageDialogContent.drawTransientEntities(15);
          }
          transientEntityToDraw = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
          while (transientEntityToDraw != null) {
            transientEntityToDraw.drawRotatedEntityOnCurrentRaster(1915952803);
            transientEntityToDraw = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException transientDrawFailure) {
          caughtTransientDrawFailure = transientDrawFailure;
          transientDrawFailureForContext = caughtTransientDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) transientDrawFailureForContext), "ni.JA(" + methodGuard + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        super.renderWidget(parentX, parentY, (byte) 54, renderPass);
        this.messageFont.drawParagraph(this.messageText, this.widgetX + (parentX + 14), 10 + parentY + this.widgetY, this.widgetWidth - 28, this.widgetHeight, 16777215, -1, 0, 0, this.messageFont.maxAscent);
        int renderGuardQuotient = 35 / ((methodGuard - 1) / 43);
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        int buttonSlotIndex = 0;
        int buttonActionId = 0;
        int clientControlFlowSnapshot = 0;
        RuntimeException activationFailureBeforeDescription = null;
        StringBuilder activationMessagePrefix = null;
        String buttonDescription = null;
        RuntimeException activationFailure = null;
        RuntimeException activationFailureForContext = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          for (buttonSlotIndex = 0; buttonSlotIndex < this.buttonSlotCount; buttonSlotIndex++) {
            if (button != this.actionButtons[buttonSlotIndex]) {
              continue;
            }
            buttonActionId = this.buttonActionIds[buttonSlotIndex];
            if (buttonActionId != -1) {
              MidiNote.setPendingLoginUiAction(this.buttonActionIds[buttonSlotIndex], false);
            } else {
              this.messageDialog.dismissDialog((byte) -104);
            }
            break;
          }
          if (methodGuard != -20) {
            MessageDialogContent.releaseStaticReferences((byte) 87);
          }
          return;
        } catch (java.lang.RuntimeException caughtActivationFailure) {
          activationFailure = caughtActivationFailure;
          activationFailureForContext = activationFailure;
          activationFailureBeforeDescription = activationFailureForContext;
          activationMessagePrefix = new StringBuilder().append("ni.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonDescription = "null";
          } else {
            buttonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) activationFailureBeforeDescription), ((StringBuilder) (Object) activationMessagePrefix).append(buttonDescription).append(')').toString());
        }
    }

    final void appendActionButton(String label, int slotIncrement, int actionId) {
        int newButtonSlotIndex = 0;
        try {
            newButtonSlotIndex = this.buttonSlotCount;
            this.ensureButtonSlots(-11272, newButtonSlotIndex + slotIncrement);
            this.actionButtons[newButtonSlotIndex] = this.appendButton(-2, label, (WidgetListener) (this));
            this.buttonActionIds[newButtonSlotIndex] = actionId;
        } catch (RuntimeException actionAppendFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) actionAppendFailure), "ni.IA(" + (label != null ? "{...}" : "null") + ',' + slotIncrement + ',' + actionId + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        createToUseText = null;
        if (methodGuard >= -19) {
            createToUseText = (String) null;
        }
    }

    final static PaletteBitmapFont buildPaletteFontFromDecodedSprites(byte[] metrics, int methodGuard) {
        PaletteBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (metrics == null) {
            return null;
          }
          font = new PaletteBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, GmtTimestampSupport.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, ProgressBarWidget.decodedSpriteHeights, NanoFrameTimer.decodedSpritePalette, TextConcatenationSupport.decodedSpriteIndices);
          MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
          if (methodGuard >= -107) {
            createToUseText = (String) null;
          }
          fontBeforeReturn = font;
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("ni.MA(");
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createToUseText = "Create a free account to start using this feature";
    }
}
