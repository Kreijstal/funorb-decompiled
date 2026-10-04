/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends ButtonWidget {
    static byte[][] decodedSpriteAlpha;
    static Sprite spriteScratchRaster;
    static ByteArrayBuffer encryptedPayloadKeyScratchBuffer;
    private TextHotspotBounds hoveredHotspot;
    private String[] hotspotHoverTexts;
    static Sprite[] avatarCryBeginFrames;
    static boolean throwOnInvalidArchiveIds;
    private IntrusiveDeque hotspotBounds;

    final void activateButton(int buttonY, int methodGuard, int buttonX, int pointerButton) {
        super.activateButton(buttonY, methodGuard, buttonX, pointerButton);
        int relativeButtonX = -this.widgetX + buttonX;
        int relativeButtonY = buttonY - this.widgetY;
        TextHotspotBounds hitRecord = this.findHotspot((byte) -114, relativeButtonY, relativeButtonX);
        if (hitRecord != null && null != this.listener) {
            ((HotspotActivationListener) ((Object) this.listener)).onHotspotActivated((HotspotTextWidget) (this), hitRecord.hotspotId, methodGuard + 28924, pointerButton);
        }
    }

    final static LoginPayload createLoginPayloadForIdentifier(boolean useAlternateLongPayload, String base38Text, String loginIdentifierText, boolean clearKeyScratch) {
        long encodedIdentifier = 0L;
        RuntimeException identifierPayloadFailureForContext = null;
        Object identifierTextOrNull = null;
        CharSequence identifierCharacters = null;
        LoginPayload payloadBeforeReturn = null;
        RuntimeException identifierPayloadFailureBeforeDescription = null;
        StringBuilder identifierPayloadMessagePrefix = null;
        String base38TextDescription = null;
        StringBuilder identifierPayloadMessageBeforeIdentifier = null;
        String identifierDescription = null;
        RuntimeException caughtIdentifierPayloadFailure = null;
        try {
          encodedIdentifier = 0L;
          identifierTextOrNull = null;
          if (clearKeyScratch) {
            encryptedPayloadKeyScratchBuffer = (ByteArrayBuffer) null;
          }
          if (loginIdentifierText.indexOf('@') != -1) {
            identifierTextOrNull = loginIdentifierText;
          } else {
            identifierCharacters = (CharSequence) ((Object) loginIdentifierText);
            encodedIdentifier = ResourceArchive.a(identifierCharacters, -48);
          }
          payloadBeforeReturn = SecondaryDeque.createLoginPayload(true, encodedIdentifier, (String) (identifierTextOrNull), base38Text, useAlternateLongPayload);
          return payloadBeforeReturn;
        } catch (java.lang.RuntimeException identifierPayloadFailure) {
          caughtIdentifierPayloadFailure = identifierPayloadFailure;
          identifierPayloadFailureForContext = caughtIdentifierPayloadFailure;
          identifierPayloadFailureBeforeDescription = identifierPayloadFailureForContext;
          identifierPayloadMessagePrefix = new StringBuilder().append("vf.F(").append(useAlternateLongPayload).append(',');
          if (base38Text == null) {
            base38TextDescription = "null";
          } else {
            base38TextDescription = "{...}";
          }
          identifierPayloadMessageBeforeIdentifier = ((StringBuilder) (Object) identifierPayloadMessagePrefix).append(base38TextDescription).append(',');
          if (loginIdentifierText == null) {
            identifierDescription = "null";
          } else {
            identifierDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) identifierPayloadFailureBeforeDescription), ((StringBuilder) (Object) identifierPayloadMessageBeforeIdentifier).append(identifierDescription).append(',').append(clearKeyScratch).append(')').toString());
        }
    }

    public static void releaseHotspotSharedResources(int methodGuard) {
        if (methodGuard != 0) {
            throwOnInvalidArchiveIds = false;
        }
        spriteScratchRaster = null;
        encryptedPayloadKeyScratchBuffer = null;
        avatarCryBeginFrames = null;
        decodedSpriteAlpha = (byte[][]) null;
    }

    HotspotTextWidget(String text, WidgetRenderer renderer) {
        super(text, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
            this.renderer = renderer;
        } catch (RuntimeException hotspotConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hotspotConstructionFailure), "vf.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ')');
        }
    }

    String getHoverText(byte methodGuard) {
        if (null == this.hoveredHotspot) {
            return null;
        }
        if (this.hotspotHoverTexts == null) {
            return null;
        }
        if (this.hotspotHoverTexts.length <= this.hoveredHotspot.hotspotId) {
            return null;
        }
        if (methodGuard != 69) {
            return (String) null;
        }
        return this.hotspotHoverTexts[this.hoveredHotspot.hotspotId];
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int relativePointerX = 0;
        int relativePointerY = 0;
        RuntimeException pointerFailureBeforeDescription = null;
        StringBuilder pointerMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerFailure = null;
        RuntimeException pointerFailureForContext = null;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          this.hoveredHotspot = null;
          if (this.pointerInside) {
            relativePointerX = -this.widgetX + PrefixCodeDecoder.pointerXSnapshot - parentX;
            relativePointerY = -this.widgetY - parentY + PcmResampler.pointerYSnapshot;
            this.hoveredHotspot = this.findHotspot((byte) 72, relativePointerY, relativePointerX);
          }
          if (hoverGuard) {
            spriteScratchRaster = (Sprite) null;
          }
          return;
        } catch (java.lang.RuntimeException pointerFailure) {
          caughtPointerFailure = pointerFailure;
          pointerFailureForContext = caughtPointerFailure;
          pointerFailureBeforeDescription = pointerFailureForContext;
          pointerMessagePrefix = new StringBuilder().append("vf.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerFailureBeforeDescription), ((StringBuilder) (Object) pointerMessagePrefix).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int textOriginX = 0;
        int textOriginY = 0;
        int guardQuotient = 46 / ((1 - methodGuard) / 43);
        super.renderWidget(parentX, parentY, (byte) -42, renderPass);
        if (renderPass != 0) {
            return;
        }
        TextWidgetLayout textRenderer = (TextWidgetLayout) ((Object) this.renderer);
        TextHotspotBounds hoveredSegment = this.hoveredHotspot;
        if (hoveredSegment == null) {
        } else {
            textOriginX = textRenderer.getTextOriginX(parentX, (UiWidget) (this), (byte) 46);
            textOriginY = textRenderer.getTextOriginY(parentY, -2, (UiWidget) (this));
            do {
                ImageProducerRasterBuffer.a(-2 + textOriginY + hoveredSegment.y, 2 + hoveredSegment.width, 14164, 2 + hoveredSegment.height, hoveredSegment.x + (textOriginX - 2));
                hoveredSegment = hoveredSegment.nextSegment;
            } while (hoveredSegment != null);
        }
    }

    final static Boolean takePendingLoginBooleanReply(byte methodGuard) {
        Boolean pendingReplyBeforeClear = IntrusiveNodeHashTable.pendingLoginBooleanReply;
        int guardQuotient = -97 / ((methodGuard - 44) / 60);
        IntrusiveNodeHashTable.pendingLoginBooleanReply = null;
        return pendingReplyBeforeClear;
    }

    final static void initializeGameplayEntityPool(int methodGuard) {
        int entityId = 0;
        GameplayEntity newEntity = null;
        int unusedClientControlSnapshot = 0;
        RuntimeException caughtPoolFailure = null;
        RuntimeException poolFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 0) {
            return;
          }
          for (entityId = 0; 1000 > entityId; entityId++) {
            newEntity = new GameplayEntity(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, entityId);
            SecondaryNodeDeque.availableEntities.addLast(-117, newEntity);
            RasterTargetSnapshot.entitiesById[entityId] = newEntity;
          }
          return;
        } catch (java.lang.RuntimeException poolFailure) {
          caughtPoolFailure = poolFailure;
          poolFailureForContext = caughtPoolFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) poolFailureForContext), "vf.G(" + methodGuard + ')');
        }
    }

    boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException focusFailureForContext = null;
        RuntimeException focusFailureBeforeDescription = null;
        StringBuilder focusMessagePrefix = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        try {
          if (methodGuard >= -30) {
            this.activateButton(-15, -109, 48, 91);
          }
          return false;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          focusFailureForContext = caughtFocusFailure;
          focusFailureBeforeDescription = focusFailureForContext;
          focusMessagePrefix = new StringBuilder().append("vf.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureBeforeDescription), ((StringBuilder) (Object) focusMessagePrefix).append(focusContextDescription).append(')').toString());
        }
    }

    final static String readSessionPacketText(int methodGuard) {
        if (methodGuard != 1000) {
            String unusedNullIdentifierSnapshot = (String) null;
            HotspotTextWidget.createLoginPayloadForIdentifier(false, (String) null, (String) null, true);
        }
        return LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 101);
    }

    final void rebuildHotspotBounds(int methodGuard) {
        int lineIndex = 0;
        int segmentStartBeforeStore = 0;
        int segmentEndBeforeStore = 0;
        int guardQuotient;
        int closingTagOffsetOrSearchCursor;
        TextWidgetLayout textRenderer;
        TextLayout textLayout;
        int openingTagOffset;
        String hotspotIdText;
        int openingDelimiterOffsetOrHotspotId;
        int firstLineIndex;
        int lastLineIndex;
        Object previousSegmentOrNull;
        TextLayoutLine layoutLine;
        int segmentStartX;
        int segmentEndX;
        TextHotspotBounds newSegment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        this.hotspotBounds = new IntrusiveDeque();
        guardQuotient = 83 / ((methodGuard - 48) / 55);
        closingTagOffsetOrSearchCursor = 0;
        textRenderer = (TextWidgetLayout) ((Object) this.renderer);
        textLayout = textRenderer.getTextLayout((byte) 116, (UiWidget) (this));
        while (true) {
          openingTagOffset = this.widgetText.indexOf("<hotspot=", closingTagOffsetOrSearchCursor);
          if (-1 == openingTagOffset) {
            return;
          }
          openingDelimiterOffsetOrHotspotId = this.widgetText.indexOf(">", openingTagOffset);
          hotspotIdText = this.widgetText.substring(openingTagOffset + 9, openingDelimiterOffsetOrHotspotId);
          openingDelimiterOffsetOrHotspotId = Integer.parseInt(hotspotIdText);
          closingTagOffsetOrSearchCursor = this.widgetText.indexOf("</hotspot>", openingTagOffset);
          firstLineIndex = textLayout.getCaretLineIndex((byte) 24, openingTagOffset);
          lastLineIndex = textLayout.getCaretLineIndex((byte) 24, closingTagOffsetOrSearchCursor);
          previousSegmentOrNull = null;
          for (lineIndex = firstLineIndex; lastLineIndex >= lineIndex; lineIndex++) {
            layoutLine = textLayout.lines[lineIndex];
            if (firstLineIndex == lineIndex) {
              segmentStartBeforeStore = textLayout.getCaretX(openingTagOffset, 124);
            } else {
              segmentStartBeforeStore = layoutLine.caretX[0];
            }
            segmentStartX = segmentStartBeforeStore;
            if (lineIndex == lastLineIndex) {
              segmentEndBeforeStore = textLayout.getCaretX(closingTagOffsetOrSearchCursor, 116);
            } else {
              if (layoutLine == null) {
                segmentEndBeforeStore = 0;
              } else {
                segmentEndBeforeStore = layoutLine.caretX[-1 + layoutLine.caretX.length];
              }
            }
            segmentEndX = segmentEndBeforeStore;
            newSegment = new TextHotspotBounds(openingDelimiterOffsetOrHotspotId, segmentStartX, layoutLine.topY, segmentEndX - segmentStartX, Math.max(textRenderer.getFontHeight(1), -layoutLine.topY + layoutLine.bottomY));
            if (previousSegmentOrNull != null) {
              ((TextHotspotBounds) (previousSegmentOrNull)).nextSegment = newSegment;
            }
            this.hotspotBounds.addLast(-44, newSegment);
            previousSegmentOrNull = newSegment;
          }
          continue;
        }
    }

    final void setHotspotHoverText(int hotspotId, int methodGuard, String hoverText) {
        int hoverTextCopyIndex = 0;
        RuntimeException hoverTextFailureForContext = null;
        int guardRemainder = 0;
        String[] grownHoverTexts = null;
        int unusedClientControlSnapshot = 0;
        RuntimeException hoverTextFailureBeforeDescription = null;
        StringBuilder hoverTextMessagePrefix = null;
        String hoverTextDescription = null;
        RuntimeException caughtHoverTextFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          guardRemainder = 122 % ((41 - methodGuard) / 55);
          if (!((null != this.hotspotHoverTexts) &&
              (hotspotId < this.hotspotHoverTexts.length))) {
            grownHoverTexts = new String[hotspotId + 1];
            if (null != this.hotspotHoverTexts) {
              for (hoverTextCopyIndex = 0; hoverTextCopyIndex < this.hotspotHoverTexts.length; hoverTextCopyIndex++) {
                grownHoverTexts[hoverTextCopyIndex] = this.hotspotHoverTexts[hoverTextCopyIndex];
              }
            }
            this.hotspotHoverTexts = grownHoverTexts;
          }
          this.hotspotHoverTexts[hotspotId] = hoverText;
          return;
        } catch (java.lang.RuntimeException hoverTextFailure) {
          caughtHoverTextFailure = hoverTextFailure;
          hoverTextFailureForContext = caughtHoverTextFailure;
          hoverTextFailureBeforeDescription = hoverTextFailureForContext;
          hoverTextMessagePrefix = new StringBuilder().append("vf.M(").append(hotspotId).append(',').append(methodGuard).append(',');
          if (hoverText == null) {
            hoverTextDescription = "null";
          } else {
            hoverTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hoverTextFailureBeforeDescription), ((StringBuilder) (Object) hoverTextMessagePrefix).append(hoverTextDescription).append(')').toString());
        }
    }

    final void fitTextBounds(int x, int methodGuard, int y, int width) {
        if (methodGuard != 0) {
            encryptedPayloadKeyScratchBuffer = (ByteArrayBuffer) null;
        }
        this.setWidgetBounds(((TextWidgetLayout) ((Object) this.renderer)).getLayoutHeightWithPadding(14, (UiWidget) (this)), width, (byte) -40, y, x);
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        if (methodGuard > -6) {
            decodedSpriteAlpha = (byte[][]) null;
        }
        super.setWidgetBounds(height, width, (byte) -123, y, x);
        this.rebuildHotspotBounds(-96);
    }

    private final TextHotspotBounds findHotspot(byte methodGuard, int y, int x) {
        TextHotspotBounds hotspotHead;
        int guardQuotient;
        TextHotspotBounds segment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        guardQuotient = 3 / ((methodGuard + 46) / 58);
        hotspotHead = (TextHotspotBounds) ((Object) this.hotspotBounds.firstForIteration(0));
        while (hotspotHead != null) {
          segment = hotspotHead;
          while (segment != null) {
            if ((segment.x <= x) &&
                (y >= segment.y) &&
                (x < segment.width + segment.x) &&
                (y <= segment.y + segment.height)) {
              return hotspotHead;
            }
            segment = segment.nextSegment;
          }
          hotspotHead = (TextHotspotBounds) ((Object) this.hotspotBounds.nextForIteration(1));
        }
        return null;
    }

    static {
        throwOnInvalidArchiveIds = false;
        spriteScratchRaster = new Sprite((int)(0.5 + Math.sqrt(2592.0)) + 2, 2 + (int)(Math.sqrt(2592.0) + 0.5));
    }
}
