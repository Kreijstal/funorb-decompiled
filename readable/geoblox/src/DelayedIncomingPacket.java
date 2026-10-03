/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedIncomingPacket extends IntrusiveNode {
    int packetOpcode;
    long deliveryTimeMillis;
    byte[] payload;

    final static void clearMeshPriorityCounts(byte methodGuard) {
        int clearIndex0 = 0;
        int clearIndex1 = 0;
        int clearIndex2 = 0;
        int clearIndex3 = 0;
        int clearIndex4 = 0;
        int clearIndex5 = 0;
        int clearIndex6 = 0;
        int clearIndex7 = 0;
        int[] priorityCountsAlias = null;
        int clearIndex = 0;
        int arrayLength = 0;
        int controlFlagSnapshot = 0;
        int[] priorityCounts = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          priorityCounts = PasswordWidgetRenderer.meshFacePriorityWriteOffsets;
          priorityCountsAlias = priorityCounts;
          clearIndex = 0;
          arrayLength = priorityCounts.length;
          if (methodGuard != -35) {
            return;
          }
          while (clearIndex < arrayLength) {
            clearIndex0 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex0] = 0;
            clearIndex1 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex1] = 0;
            clearIndex2 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex2] = 0;
            clearIndex3 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex3] = 0;
            clearIndex4 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex4] = 0;
            clearIndex5 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex5] = 0;
            clearIndex6 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex6] = 0;
            clearIndex7 = clearIndex;
            clearIndex++;
            priorityCounts[clearIndex7] = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contextFailure), "ma.E(" + methodGuard + ')');
        }
    }

    final static boolean contactProbeOverlapsScratchSprite(boolean methodGuard, float diagnosticBoardAngleRadians, GameplayEntity diagnosticEntity) {
        RuntimeException contactOverlapFailureForContext = null;
        boolean overlapFound = false;
        RuntimeException contactOverlapFailureBeforeEntityDescription = null;
        StringBuilder contactOverlapMessagePrefix = null;
        String entityArgumentDescription = null;
        RuntimeException caughtContactOverlapFailure = null;
        try {
          if (!methodGuard) {
            DelayedIncomingPacket.tickArchiveLoading(-91);
          }
          overlapFound = PixelOverlapProbe.findFirstNonzeroPixelOverlap(SecondaryDeque.contactProbeRaster, 0, 0, HotspotTextWidget.spriteScratchRaster, -SecondaryDeque.contactProbeOffsetX + DialogLayer.rotatedEntityScreenX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -SecondaryDeque.contactProbeOffsetY - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + ValidationIconWidget.rotatedEntityScreenY);
          return overlapFound;
        } catch (java.lang.RuntimeException contactOverlapFailure) {
          caughtContactOverlapFailure = contactOverlapFailure;
          contactOverlapFailureForContext = caughtContactOverlapFailure;
          contactOverlapFailureBeforeEntityDescription = contactOverlapFailureForContext;
          contactOverlapMessagePrefix = new StringBuilder().append("ma.A(").append(methodGuard).append(',').append(diagnosticBoardAngleRadians).append(',');
          if (diagnosticEntity == null) {
            entityArgumentDescription = "null";
          } else {
            entityArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contactOverlapFailureBeforeEntityDescription), ((StringBuilder) (Object) contactOverlapMessagePrefix).append(entityArgumentDescription).append(')').toString());
        }
    }

    final static int tickArchiveLoading(int methodGuard) {
        DequeCursor.archiveCatalog.advanceArchiveLoading((byte) -65);
        if (methodGuard != 15869) {
            return 61;
        }
        if (!AsyncResourceDownloader.archiveNetworkClient.pollResponses((byte) 95)) {
            return WhirlpoolHash.advanceArchiveHandshake((byte) -74);
        }
        return 0;
    }

    final static boolean c(byte param0) {
        int var1 = 39 / ((param0 - 18) / 54);
        return fa.releasesPerTheme > CacheReference.field_m ? true : false;
    }

    final static void drawNineSlicePanel(int panelTop, int panelLeft, int panelHeight, byte methodGuard, int panelWidth, Sprite[] nineSliceSprites) {
        int centerTileX = 0;
        int selectedLeftBorderWidth = 0;
        int selectedRightBorderWidth = 0;
        int selectedTopBorderHeight = 0;
        int selectedBottomBorderHeight = 0;
        RuntimeException panelFailureBeforeSpriteDescription = null;
        StringBuilder panelMessagePrefix = null;
        String spriteArrayArgumentDescription = null;
        RuntimeException caughtPanelFailure = null;
        int leftBorderWidth = 0;
        RuntimeException panelFailureForContext = null;
        int rightBorderWidth = 0;
        int topBorderHeight = 0;
        int bottomBorderHeight = 0;
        int panelRight = 0;
        int panelBottom = 0;
        int centerTileLeft = 0;
        int centerTileRight = 0;
        int centerTileTop = 0;
        int centerTileBottom = 0;
        int centerClipLeft = 0;
        int centerClipRight = 0;
        int centerClipTop = 0;
        int centerClipBottom = 0;
        int edgeTileCoordinateOrCenterY = 0;
        int clientControlFlowGuardSnapshot = 0;
        clientControlFlowGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (nineSliceSprites == null) {
            return;
          }
          if ((panelWidth > 0) &&
              (0 < panelHeight)) {
            if (nineSliceSprites[3] == null) {
              selectedLeftBorderWidth = 0;
            } else {
              selectedLeftBorderWidth = nineSliceSprites[3].fullWidth;
            }
            leftBorderWidth = selectedLeftBorderWidth;
            if (null == nineSliceSprites[5]) {
              selectedRightBorderWidth = 0;
            } else {
              selectedRightBorderWidth = nineSliceSprites[5].fullWidth;
            }
            rightBorderWidth = selectedRightBorderWidth;
            if (methodGuard != -92) {
              return;
            }
            if (null != nineSliceSprites[1]) {
              selectedTopBorderHeight = nineSliceSprites[1].fullHeight;
            } else {
              selectedTopBorderHeight = 0;
            }
            topBorderHeight = selectedTopBorderHeight;
            if (null != nineSliceSprites[7]) {
              selectedBottomBorderHeight = nineSliceSprites[7].fullHeight;
            } else {
              selectedBottomBorderHeight = 0;
            }
            bottomBorderHeight = selectedBottomBorderHeight;
            panelRight = panelWidth + panelLeft;
            panelBottom = panelTop + panelHeight;
            centerTileLeft = panelLeft + leftBorderWidth;
            centerTileRight = panelRight - rightBorderWidth;
            centerTileTop = panelTop + topBorderHeight;
            centerTileBottom = -bottomBorderHeight + panelBottom;
            centerClipLeft = centerTileLeft;
            centerClipRight = centerTileRight;
            if (centerClipLeft > centerClipRight) {
              centerClipRight = leftBorderWidth * panelWidth / (leftBorderWidth + rightBorderWidth) + panelLeft;
              centerClipLeft = leftBorderWidth * panelWidth / (leftBorderWidth + rightBorderWidth) + panelLeft;
            }
            centerClipTop = centerTileTop;
            centerClipBottom = centerTileBottom;
            SoftwareRasterizer.saveClip(LabeledChildWidget.nineSliceSavedClip);
            if (centerClipBottom < centerClipTop) {
              centerClipBottom = panelHeight * topBorderHeight / (topBorderHeight + bottomBorderHeight) + panelTop;
              centerClipTop = panelHeight * topBorderHeight / (topBorderHeight + bottomBorderHeight) + panelTop;
            }
            if (null != nineSliceSprites[0]) {
              SoftwareRasterizer.intersectClip(panelLeft, panelTop, centerClipLeft, centerClipTop);
              nineSliceSprites[0].draw(panelLeft, panelTop);
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if (nineSliceSprites[2] != null) {
              SoftwareRasterizer.intersectClip(centerClipRight, panelTop, panelRight, centerClipTop);
              nineSliceSprites[2].draw(centerTileRight, panelTop);
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if (null != nineSliceSprites[6]) {
              SoftwareRasterizer.intersectClip(panelLeft, centerClipBottom, centerClipLeft, panelBottom);
              nineSliceSprites[6].draw(panelLeft, centerTileBottom);
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if (null != nineSliceSprites[8]) {
              SoftwareRasterizer.intersectClip(centerClipRight, centerClipBottom, panelRight, panelBottom);
              nineSliceSprites[8].draw(centerTileRight, centerTileBottom);
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if ((null != nineSliceSprites[1]) &&
                (nineSliceSprites[1].fullWidth != 0)) {
              SoftwareRasterizer.intersectClip(centerClipLeft, panelTop, centerClipRight, centerClipTop);
              for (edgeTileCoordinateOrCenterY = centerTileLeft; centerTileRight > edgeTileCoordinateOrCenterY; edgeTileCoordinateOrCenterY = edgeTileCoordinateOrCenterY + nineSliceSprites[1].fullWidth) {
                nineSliceSprites[1].draw(edgeTileCoordinateOrCenterY, panelTop);
              }
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if ((nineSliceSprites[7] != null) &&
                (0 != nineSliceSprites[7].fullWidth)) {
              SoftwareRasterizer.intersectClip(centerClipLeft, centerClipBottom, centerClipRight, panelBottom);
              for (edgeTileCoordinateOrCenterY = centerTileLeft; edgeTileCoordinateOrCenterY < centerTileRight; edgeTileCoordinateOrCenterY = edgeTileCoordinateOrCenterY + nineSliceSprites[7].fullWidth) {
                nineSliceSprites[7].draw(edgeTileCoordinateOrCenterY, centerTileBottom);
              }
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if ((nineSliceSprites[3] != null) &&
                (0 != nineSliceSprites[3].fullHeight)) {
              SoftwareRasterizer.intersectClip(panelLeft, centerClipTop, centerClipLeft, centerClipBottom);
              for (edgeTileCoordinateOrCenterY = centerTileTop; centerTileBottom > edgeTileCoordinateOrCenterY; edgeTileCoordinateOrCenterY = edgeTileCoordinateOrCenterY + nineSliceSprites[3].fullHeight) {
                nineSliceSprites[3].draw(panelLeft, edgeTileCoordinateOrCenterY);
              }
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if ((nineSliceSprites[5] != null) &&
                (nineSliceSprites[5].fullHeight != 0)) {
              SoftwareRasterizer.intersectClip(centerClipRight, centerClipTop, panelRight, centerClipBottom);
              for (edgeTileCoordinateOrCenterY = centerTileTop; edgeTileCoordinateOrCenterY < centerTileBottom; edgeTileCoordinateOrCenterY = edgeTileCoordinateOrCenterY + nineSliceSprites[5].fullHeight) {
                nineSliceSprites[5].draw(centerTileRight, edgeTileCoordinateOrCenterY);
              }
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
            }
            if ((nineSliceSprites[4] != null) &&
                (nineSliceSprites[4].fullWidth != 0) &&
                (0 != nineSliceSprites[4].fullHeight)) {
              SoftwareRasterizer.intersectClip(centerClipLeft, centerClipTop, centerClipRight, centerClipBottom);
              for (edgeTileCoordinateOrCenterY = centerTileTop; centerTileBottom > edgeTileCoordinateOrCenterY; edgeTileCoordinateOrCenterY = edgeTileCoordinateOrCenterY + nineSliceSprites[4].fullHeight) {
                for (centerTileX = centerTileLeft; centerTileX < centerTileRight; centerTileX = centerTileX + nineSliceSprites[4].fullWidth) {
                  nineSliceSprites[4].draw(centerTileX, edgeTileCoordinateOrCenterY);
                }
              }
              SoftwareRasterizer.restoreClip(LabeledChildWidget.nineSliceSavedClip);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException panelDrawingFailure) {
          caughtPanelFailure = panelDrawingFailure;
          panelFailureForContext = caughtPanelFailure;
          panelFailureBeforeSpriteDescription = panelFailureForContext;
          panelMessagePrefix = new StringBuilder().append("ma.B(").append(panelTop).append(',').append(panelLeft).append(',').append(panelHeight).append(',').append(methodGuard).append(',').append(panelWidth).append(',');
          if (nineSliceSprites == null) {
            spriteArrayArgumentDescription = "null";
          } else {
            spriteArrayArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) panelFailureBeforeSpriteDescription), ((StringBuilder) (Object) panelMessagePrefix).append(spriteArrayArgumentDescription).append(')').toString());
        }
    }

    final static boolean a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((param2.ensureIndexLoaded(0)) &&
              (param2.loadGroupByName("commonui", (byte) -127))) {
            if ((param1.ensureIndexLoaded(param3 + 11652)) &&
                (param1.loadGroupByName("commonui", (byte) -124))) {
              if (param3 != -11652) {
                return false;
              }
              if ((param0.ensureIndexLoaded(0)) &&
                  (param0.loadGroupByName("button.gif", (byte) -125))) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ma.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    DelayedIncomingPacket(long deliveryTimeMillis, int packetOpcode, byte[] payload) {
        try {
            this.packetOpcode = packetOpcode;
            this.payload = payload;
            this.deliveryTimeMillis = deliveryTimeMillis;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ma.<init>(" + deliveryTimeMillis + ',' + packetOpcode + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
