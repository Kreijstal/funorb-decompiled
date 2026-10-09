/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SessionSocketSupport {
    static char[] base37NameAlphabet;
    static boolean avatarShockPending;
    static TextTemplateArgumentType textTemplateArgumentTypeOne;
    static String mouseOverIconText;
    static String[] gameSoundResourceNames;
    static String countdownLabelText;

    final static void markZeroOutlinePixels(int[] pixels, int pixelIndex, int leftIndex, int rightIndex, int aboveIndex, int belowIndex, int width, int remainingRows, int rowSkip) {
        int remainingColumns = 0;
        remainingRows--;
        while (remainingRows >= 0) {
          for (remainingColumns = width - 1; remainingColumns >= 0; remainingColumns--) {
            if (pixels[pixelIndex] <= 1) {
              pixelIndex++;
              continue;
            }
            leftIndex = pixelIndex - 1;
            rightIndex = pixelIndex + 1;
            aboveIndex = pixelIndex - SoftwareRasterizer.stride;
            belowIndex = pixelIndex + SoftwareRasterizer.stride;
            if (pixels[aboveIndex + 1] == 0) {
              pixels[aboveIndex + 1] = 1;
            }
            if (pixels[belowIndex + 1] == 0) {
              pixels[belowIndex + 1] = 1;
            }
            if (pixels[aboveIndex - 1] == 0) {
              pixels[aboveIndex - 1] = 1;
            }
            if (pixels[belowIndex - 1] == 0) {
              pixels[belowIndex - 1] = 1;
            }
            if (pixels[leftIndex] == 0) {
              pixels[leftIndex] = 1;
            }
            if (pixels[rightIndex] == 0) {
              pixels[rightIndex] = 1;
            }
            if (pixels[aboveIndex] == 0) {
              pixels[aboveIndex] = 1;
            }
            if (pixels[belowIndex] == 0) {
              pixels[belowIndex] = 1;
            }
            if (pixels[leftIndex - 1] == 0) {
              pixels[leftIndex - 1] = 1;
            }
            if (pixels[rightIndex + 1] == 0) {
              pixels[rightIndex + 1] = 1;
            }
            if (pixels[aboveIndex - SoftwareRasterizer.stride] == 0) {
              pixels[aboveIndex - SoftwareRasterizer.stride] = 1;
            }
            if (pixels[belowIndex + SoftwareRasterizer.stride] != 0) {
              pixelIndex++;
              continue;
            }
            pixels[belowIndex + SoftwareRasterizer.stride] = 1;
            pixelIndex++;
          }
          pixelIndex = pixelIndex + rowSkip;
          remainingRows--;
        }
    }

    public static void releaseSessionSocketResources(byte methodGuard) {
        countdownLabelText = null;
        mouseOverIconText = null;
        if (methodGuard < 51) {
            gameSoundResourceNames = (String[]) null;
        }
        textTemplateArgumentTypeOne = null;
        base37NameAlphabet = null;
        gameSoundResourceNames = null;
    }

    final static PaletteBitmapFont loadPaletteFont(String groupName, ResourceArchive glyphGraphicsArchive, ResourceArchive fontMetricsArchive, boolean methodGuard, String resourceName) {
        int archiveGroupId = 0;
        RuntimeException fontFailureForContext = null;
        int archiveFileId = 0;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String groupNameDescription = null;
        StringBuilder fontMessageAfterFirstDescription = null;
        String glyphArchiveDescription = null;
        StringBuilder fontMessageAfterSecondDescription = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageAfterThirdDescription = null;
        String resourceNameDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (!methodGuard) {
            gameSoundResourceNames = (String[]) null;
          }
          archiveGroupId = glyphGraphicsArchive.findGroupId((byte) 127, groupName);
          archiveFileId = glyphGraphicsArchive.findFileId(resourceName, -107, archiveGroupId);
          fontBeforeReturn = ValidationMessageWidget.loadPaletteFontById(fontMetricsArchive, archiveGroupId, -128, glyphGraphicsArchive, archiveFileId);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("w.A(");
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          fontMessageAfterFirstDescription = ((StringBuilder) (Object) fontMessagePrefix).append(groupNameDescription).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          fontMessageAfterSecondDescription = ((StringBuilder) (Object) fontMessageAfterFirstDescription).append(glyphArchiveDescription).append(',');
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageAfterThirdDescription = ((StringBuilder) (Object) fontMessageAfterSecondDescription).append(metricsArchiveDescription).append(',').append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeDescriptions), ((StringBuilder) (Object) fontMessageAfterThirdDescription).append(resourceNameDescription).append(')').toString());
        }
    }

    final static boolean pollSessionSocketOpening(boolean useLongLoginPayload, int methodGuard) {
        try {
            PacketBuffer incomingBufferSnapshot = null;
            PacketBuffer incomingBufferAlias = null;
            if (null == NetworkArchiveRequest.sessionSocketOpenTask) {
                NetworkArchiveRequest.sessionSocketOpenTask = GameplayEntity.sessionTaskDispatcher.requestSocket(NetworkArchiveRequest.sessionServerPort, MultiHandleSliderWidget.sessionServerHost, false);
            }
            if (methodGuard != 52) {
                textTemplateArgumentTypeOne = (TextTemplateArgumentType) null;
            }
            if (NetworkArchiveRequest.sessionSocketOpenTask.status == 0) {
                return false;
            }
            long socketCompletionTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(methodGuard ^ -12500);
            CanvasResizeController.lastSessionSocketWriteMillis = socketCompletionTimeMillis;
            AudioService.sessionActivityStartMillis = socketCompletionTimeMillis;
            if (1 != NetworkArchiveRequest.sessionSocketOpenTask.status) {
                PacketBuffer.currentProtocolStage = AchievementQuery.socketOpenFailedStage;
            } else {
                try {
                    SpriteCheckboxRenderer.sessionSocket = new BufferedSocket((java.net.Socket) (NetworkArchiveRequest.sessionSocketOpenTask.result), GameplayEntity.sessionTaskDispatcher);
                    incomingBufferSnapshot = LogoCompositor.sessionPacketBuffer;
                    incomingBufferAlias = incomingBufferSnapshot;
                    CacheReference.outgoingSessionBuffer.position = 0;
                    incomingBufferAlias.position = 0;
                    MidiNoteMixer.thirdPreviousPacketOpcode = useLongLoginPayload ? -2 : -1;
                    AttachedEntityRenderer.secondPreviousPacketOpcode = useLongLoginPayload ? -2 : -1;
                    VisualPropertyNode.previousPacketOpcode = useLongLoginPayload ? -2 : -1;
                    PacketBuffer.currentProtocolStage = IterableNodeHashTable.requestReadyStage;
                    ConnectionHeaderSupport.writeConnectionHeader(FullscreenEntrySupport.sessionLanguageId, true, ClientRenderingState.sessionClientId, EmailAvailabilityValidator.sessionServerNumber, CacheReference.outgoingSessionBuffer);
                    NanoFrameTimer.flushSessionWrites(methodGuard ^ -53, -1);
                } catch (IOException socketSetupFailure) {
                    PacketBuffer.currentProtocolStage = AchievementQuery.socketOpenFailedStage;
                }
            }
            NetworkArchiveRequest.sessionSocketOpenTask = null;
            return true;
        } catch (RuntimeException | Error uncheckedSocketFailure) {
            throw uncheckedSocketFailure;
        } catch (Throwable checkedSocketFailure) {
            throw new RuntimeException(checkedSocketFailure);
        }
    }

    private final static void copyPixelsIntoEmptyDestination(int[] destinationPixels, int[] sourcePixels, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int negativeRowIndex = 0;
        int rowEndIndex;
        for (negativeRowIndex = -height; negativeRowIndex < 0; negativeRowIndex++) {
          rowEndIndex = destinationIndex + width - 3;
          while (destinationIndex < rowEndIndex) {
            if (destinationPixels[destinationIndex] == 0) {
              destinationPixels[destinationIndex] = sourcePixels[sourceIndex];
            }
            destinationIndex++;
            sourceIndex++;
            if (destinationPixels[destinationIndex] == 0) {
              destinationPixels[destinationIndex] = sourcePixels[sourceIndex];
            }
            destinationIndex++;
            sourceIndex++;
            if (destinationPixels[destinationIndex] == 0) {
              destinationPixels[destinationIndex] = sourcePixels[sourceIndex];
            }
            destinationIndex++;
            sourceIndex++;
            if (destinationPixels[destinationIndex] != 0) {
              destinationIndex++;
              sourceIndex++;
              continue;
            }
            destinationPixels[destinationIndex] = sourcePixels[sourceIndex];
            destinationIndex++;
            sourceIndex++;
          }
          rowEndIndex += 3;
          while (destinationIndex < rowEndIndex) {
            if (destinationPixels[destinationIndex] != 0) {
              destinationIndex++;
              sourceIndex++;
              continue;
            }
            destinationPixels[destinationIndex] = sourcePixels[sourceIndex];
            destinationIndex++;
            sourceIndex++;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final static void drawSpriteIntoEmptyDestination(Sprite sprite, int destinationX, int destinationY) {
        int clippedPixelCount = 0;
        int clippedPixelCountLiteralPhase1;
        int clippedPixelCountLiteralPhase2;
        destinationX = destinationX + sprite.trimX;
        destinationY = destinationY + sprite.trimY;
        int destinationIndex = destinationX + destinationY * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = sprite.height;
        int drawWidth = sprite.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (destinationY < SoftwareRasterizer.clipTop) {
            clippedPixelCount = SoftwareRasterizer.clipTop - destinationY;
            drawHeight = drawHeight - clippedPixelCount;
            destinationY = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedPixelCount * drawWidth;
            destinationIndex = destinationIndex + clippedPixelCount * SoftwareRasterizer.stride;
        }
        if (destinationY + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (destinationY + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (destinationX < SoftwareRasterizer.clipLeft) {
            clippedPixelCountLiteralPhase1 = SoftwareRasterizer.clipLeft - destinationX;
            drawWidth = drawWidth - clippedPixelCountLiteralPhase1;
            destinationX = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedPixelCountLiteralPhase1;
            destinationIndex = destinationIndex + clippedPixelCountLiteralPhase1;
            sourceRowSkip = sourceRowSkip + clippedPixelCountLiteralPhase1;
            destinationRowSkip = destinationRowSkip + clippedPixelCountLiteralPhase1;
        }
        if (destinationX + drawWidth > SoftwareRasterizer.clipRight) {
            clippedPixelCountLiteralPhase2 = destinationX + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedPixelCountLiteralPhase2;
            sourceRowSkip = sourceRowSkip + clippedPixelCountLiteralPhase2;
            destinationRowSkip = destinationRowSkip + clippedPixelCountLiteralPhase2;
        }
        if (drawWidth <= 0 || drawHeight <= 0) {
            return;
        }
        SessionSocketSupport.copyPixelsIntoEmptyDestination(SoftwareRasterizer.framebuffer, sprite.pixels, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
    }

    final static void evaluateSessionSupportGuard(int methodGuard) {
        int sentinelRemainder = -58 % ((methodGuard + 28) / 50);
    }

    static {
        base37NameAlphabet = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        mouseOverIconText = "Mouse over an icon for details";
        textTemplateArgumentTypeOne = new TextTemplateArgumentType(1, 2, 2, 0);
        countdownLabelText = "Countdown";
        gameSoundResourceNames = new String[]{"menu_select", "jewel_1", "jewel_2", "jewel_3", "space_1", "space_2", "space_3", "sun_1", "sun_2", "sun_3", "baking_1", "baking_2", "baking_3", "germs_1", "germs_2", "germs_3", "sport_1", "sport_2", "sport_3", "sweets_1", "sweets_2", "sweets_3", "cry", "to_angry", "to_excited", "to_happy", "to_unhappy", "electric_shock", "bubble_swell", "button_bleep", "geom_rain", "geom_vanish", "bonus", "round_clear"};
    }
}
