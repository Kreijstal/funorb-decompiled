/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntityContactSupport {
    static String ticketingOneUnreadText;
    static LoginPayload pendingLoginPayload;
    static EmailAvailabilityQuery activeEmailAvailabilityQuery;

    final static void resetFrameTimingHistory(int methodGuard) {
        int guardResidueThenRenderHistoryIndex = 0;
        int updateHistoryIndex = 0;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
            ReflectionCheckRequest.field_p.a(111);
            guardResidueThenRenderHistoryIndex = 10 / ((methodGuard - 68) / 57);
            for (updateHistoryIndex = 0; updateHistoryIndex < 32; updateHistoryIndex++) {
                ArchiveRequest.field_p[updateHistoryIndex] = 0L;
            }
            for (guardResidueThenRenderHistoryIndex = 0; guardResidueThenRenderHistoryIndex < 32; guardResidueThenRenderHistoryIndex++) {
                RasterTargetSnapshot.field_l[guardResidueThenRenderHistoryIndex] = 0L;
            }
            TriangleMesh.field_w = 0;
        } catch (RuntimeException timingResetFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) timingResetFailure), "ih.C(" + methodGuard + ')');
        }
    }

    final static boolean areEntityQueuesSettled(int methodGuard) {
        boolean settledQueuesResult = false;
        if (methodGuard != 0) {
          return true;
        }
        settledQueuesResult = (ArchiveNetworkClient.movingEntities.isEmpty(13519)) && (SecondaryDeque.spawnQueue.isEmpty(13519)) && (DelegatingCanvas.transientEntities.isEmpty(methodGuard + 13519)) && (!Bzip2DecoderState.avatarShockContactPending);
        return settledQueuesResult;
    }

    public static void releaseStaticReferences(byte methodGuard) {
        if (methodGuard <= 46) {
            return;
        }
        pendingLoginPayload = null;
        activeEmailAvailabilityQuery = null;
        ticketingOneUnreadText = null;
    }

    final static void linkEntityAtMaskContacts(int negativeHorizontalClipGuard, int contactY, GameplayEntity entity, int contactX) {
        int overlapRowsRemaining = 0;
        int overlapColumnsRemaining = 0;
        int ownershipWidthOrZero = 0;
        int ownershipHeightOrZero = 0;
        int firstScratchColumnValue = 0;
        int firstScratchRowValue = 0;
        int contactedEntityIsKindTwo = 0;
        int incomingEntityIsKindTwo = 0;
        RuntimeException contactFailureCause = null;
        StringBuilder contactFailurePrefix = null;
        String entityArgumentDescription = null;
        RuntimeException caughtContactFailure = null;
        int scratchLeft = 0;
        RuntimeException contactFailureForContext = null;
        int scratchTop = 0;
        int ownershipOffsetX = 0;
        int ownershipOffsetY = 0;
        int scratchWidth = 0;
        int ownershipWidthOrEmptyOverlap = 0;
        int scratchHeight = 0;
        int ownershipHeightOrEmptyOverlap = 0;
        int firstScratchColumn = 0;
        int firstScratchRow = 0;
        int overlapWidth = 0;
        int overlapHeight = 0;
        int scratchPixelIndex = 0;
        int scratchRowSkip = 0;
        int ownershipPixelIndex = 0;
        int ownershipRowSkip = 0;
        GameplayEntity contactedEntity = null;
        int kindTwoMismatch = 0;
        Object unusedContactScratch = null;
        GameplayEntity pooledConversionEntity = null;
        int clientControlSnapshot = 0;
        int[] scratchPixels = null;
        int[] ownershipPixels = null;
        unusedContactScratch = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          scratchLeft = contactX - HotspotTextWidget.spriteScratchRaster.fullWidth / 2;
          scratchLeft = scratchLeft + HotspotTextWidget.spriteScratchRaster.trimX;
          scratchTop = -(HotspotTextWidget.spriteScratchRaster.fullHeight / 2) + contactY;
          scratchTop = scratchTop + HotspotTextWidget.spriteScratchRaster.trimY;
          ownershipOffsetX = -scratchLeft + bk.boardOwnershipRaster.trimX;
          ownershipOffsetY = bk.boardOwnershipRaster.trimY - scratchTop;
          scratchWidth = HotspotTextWidget.spriteScratchRaster.width;
          if (scratchWidth <= ownershipOffsetX) {
            ownershipWidthOrZero = 0;
          } else {
            ownershipWidthOrZero = bk.boardOwnershipRaster.width;
          }
          ownershipWidthOrEmptyOverlap = ownershipWidthOrZero;
          scratchHeight = HotspotTextWidget.spriteScratchRaster.height;
          if (ownershipOffsetY >= scratchHeight) {
            ownershipHeightOrZero = 0;
          } else {
            ownershipHeightOrZero = bk.boardOwnershipRaster.height;
          }
          ownershipHeightOrEmptyOverlap = ownershipHeightOrZero;
          firstScratchColumnValue = (~ownershipOffsetX >= negativeHorizontalClipGuard) ? 0 : ownershipOffsetX;
          firstScratchColumn = firstScratchColumnValue;
          firstScratchRowValue = (ownershipOffsetY > 0) ? ownershipOffsetY : 0;
          firstScratchRow = firstScratchRowValue;
          overlapWidth = ownershipOffsetX + ownershipWidthOrEmptyOverlap;
          if (overlapWidth > scratchWidth) {
            overlapWidth = scratchWidth;
          }
          overlapHeight = ownershipHeightOrEmptyOverlap + ownershipOffsetY;
          if (overlapHeight > scratchHeight) {
            overlapHeight = scratchHeight;
          }
          overlapWidth = overlapWidth - firstScratchColumn;
          overlapHeight = overlapHeight - firstScratchRow;
          scratchPixelIndex = scratchWidth * firstScratchRow + firstScratchColumn;
          scratchRowSkip = -overlapWidth + scratchWidth;
          ownershipPixelIndex = firstScratchColumn + (-ownershipOffsetX + (-ownershipOffsetY + firstScratchRow) * ownershipWidthOrEmptyOverlap);
          ownershipRowSkip = -overlapWidth + ownershipWidthOrEmptyOverlap;
          scratchPixels = HotspotTextWidget.spriteScratchRaster.pixels;
          ownershipPixels = bk.boardOwnershipRaster.pixels;
          for (overlapRowsRemaining = overlapHeight; 0 < overlapRowsRemaining; overlapRowsRemaining--) {
            for (overlapColumnsRemaining = overlapWidth; overlapColumnsRemaining > 0; overlapColumnsRemaining--) {
              if (scratchPixels[scratchPixelIndex] != 0) {
                if (ownershipPixels[ownershipPixelIndex] != 16777215) {
                  if (ownershipPixels[ownershipPixelIndex] != 0) {
                    contactedEntity = RasterTargetSnapshot.entitiesById[-1 + ownershipPixels[ownershipPixelIndex]];
                    contactedEntityIsKindTwo = (contactedEntity.entitySpriteKindId != 2) ? 0 : 1;
                    if (entity.entitySpriteKindId != 2) {
                      incomingEntityIsKindTwo = 0;
                    } else {
                      incomingEntityIsKindTwo = 1;
                    }
                    kindTwoMismatch = contactedEntityIsKindTwo ^ incomingEntityIsKindTwo;
                    if (kindTwoMismatch != 0) {
                      pooledConversionEntity = (GameplayEntity) ((Object) SecondaryNodeDeque.availableEntities.removeLast(1));
                      if (pooledConversionEntity != null) {
                        if ((entity.entitySpriteKindId == 2) &&
                            (kindTwoMismatch != 0)) {
                          pooledConversionEntity.initializeEntityMotion(negativeHorizontalClipGuard ^ -97, (float)contactX, 8, entity.velocityX, entity.spriteVariantIndex, 0, entity.spriteAngleRadians, (float)contactY, entity.velocityY, entity.entityCategoryKey, 0.0f);
                        } else {
                          pooledConversionEntity.initializeEntityMotion(-121, contactedEntity.positionX, 8, contactedEntity.velocityX, contactedEntity.spriteVariantIndex, 0, contactedEntity.spriteAngleRadians, contactedEntity.positionY, contactedEntity.velocityY, contactedEntity.entityCategoryKey, 0.0f);
                        }
                        DelegatingCanvas.transientEntities.addLast(-42, pooledConversionEntity);
                      }
                    }
                    if (EntityLinkSupport.linkTouchingEntities(contactedEntity, entity, false)) {
                      return;
                    }
                  }
                } else {
                  entity.touchesAvatar = true;
                  if (entity.entitySpriteKindId != 3) {
                    if (4 == entity.entitySpriteKindId) {
                      AvatarFeedbackSupport.requestAvatarFeedback(7, false);
                    }
                  } else {
                    Bzip2DecoderState.avatarShockContactPending = true;
                  }
                }
              }
              ownershipPixelIndex++;
              scratchPixelIndex++;
            }
            ownershipPixelIndex = ownershipPixelIndex + ownershipRowSkip;
            scratchPixelIndex = scratchPixelIndex + scratchRowSkip;
          }
          return;
        } catch (java.lang.RuntimeException contactFailure) {
          caughtContactFailure = contactFailure;
          contactFailureForContext = caughtContactFailure;
          contactFailureCause = contactFailureForContext;
          contactFailurePrefix = new StringBuilder().append("ih.A(").append(negativeHorizontalClipGuard).append(',').append(contactY).append(',');
          if (entity == null) {
            entityArgumentDescription = "null";
          } else {
            entityArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contactFailureCause), ((StringBuilder) (Object) contactFailurePrefix).append(entityArgumentDescription).append(',').append(contactX).append(')').toString());
        }
    }

    final static byte[] readNamedRootArchiveFile(int methodGuard, String fileName) {
        RuntimeException fileFailureForContext = null;
        byte[] disabledFileResult = null;
        byte[] fileBytesResult = null;
        RuntimeException fileFailureCause = null;
        StringBuilder fileFailurePrefix = null;
        String fileNameArgumentDescription = null;
        RuntimeException caughtFileFailure = null;
        try {
          if (methodGuard > 119) {
            fileBytesResult = LoginPanel.field_O.getNamedFile(0, fileName, "");
            return fileBytesResult;
          }
          disabledFileResult = (byte[]) null;
          return disabledFileResult;
        } catch (java.lang.RuntimeException fileFailure) {
          caughtFileFailure = fileFailure;
          fileFailureForContext = caughtFileFailure;
          fileFailureCause = fileFailureForContext;
          fileFailurePrefix = new StringBuilder().append("ih.E(").append(methodGuard).append(',');
          if (fileName == null) {
            fileNameArgumentDescription = "null";
          } else {
            fileNameArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fileFailureCause), ((StringBuilder) (Object) fileFailurePrefix).append(fileNameArgumentDescription).append(')').toString());
        }
    }

    static {
        ticketingOneUnreadText = "You have 1 unread message!";
        pendingLoginPayload = null;
    }
}
