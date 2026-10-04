/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntitySpawnSupport {
    static String loadingFontsText;

    final static void detachCanvasInputListeners(int methodGuard, java.awt.Canvas canvas) {
        RuntimeException detachFailureForContext = null;
        RuntimeException detachContextCause = null;
        StringBuilder detachContextPrefix = null;
        String canvasArgumentDescription = null;
        RuntimeException caughtDetachFailure = null;
        try {
          BoardReconciliationSupport.detachKeyboardListener((java.awt.Component) ((Object) canvas), 0);
          LoginPayload.detachPointerInputListeners(false, (java.awt.Component) ((Object) canvas));
          if (methodGuard != -2) {
            loadingFontsText = (String) null;
          }
          if (null == CachedTextLayout.mouseWheelInput) {
            return;
          }
          CachedTextLayout.mouseWheelInput.detachWheelListener((java.awt.Component) ((Object) canvas), (byte) 83);
          return;
        } catch (java.lang.RuntimeException detachFailure) {
          caughtDetachFailure = detachFailure;
          detachFailureForContext = caughtDetachFailure;
          detachContextCause = detachFailureForContext;
          detachContextPrefix = new StringBuilder().append("nb.B(").append(methodGuard).append(',');
          if (canvas == null) {
            canvasArgumentDescription = "null";
          } else {
            canvasArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) detachContextCause), ((StringBuilder) (Object) detachContextPrefix).append(canvasArgumentDescription).append(')').toString());
        }
    }

    final static void spawnEntityAtPointer(int methodGuard, int pointerX, int categoryId, int pointerY, int variantId, boolean specialKinds) {
        GameplayEntity pooledEntity;
        double pointerCenterOffsetX;
        double pointerCenterOffsetY;
        int specialKindSelector;
        int spriteKindId;
        GameplayEntity entityBeforeVariantSelection;
        int motionGuardBeforeVariantSelection;
        float boardXBeforeVariantSelection;
        int kindBeforeVariantSelection;
        float inwardVelocityXBeforeVariantSelection;
        int selectedVariantId = 0;
        int zeroLifetimeTicks;
        float unusedMotionFloat;
        float boardYForCategorySelection;
        float inwardVelocityYForCategorySelection;
        int initializationCategory = 0;
        if (methodGuard != -28195) {
          return;
        }
        pooledEntity = (GameplayEntity) ((Object) SecondaryNodeDeque.availableEntities.removeLast(1));
        if (pooledEntity == null) {
          return;
        }
        pointerCenterOffsetX = (double)(-320 + pointerX);
        pointerCenterOffsetY = (double)(-240 + pointerY);
        pointerX = (int)(320.0 + (pointerCenterOffsetX * Math.cos((double)(-UiWidget.gameplaySession.boardAngleRadians)) - pointerCenterOffsetY * Math.sin((double)(-UiWidget.gameplaySession.boardAngleRadians))));
        pointerY = (int)(Math.sin((double)(-UiWidget.gameplaySession.boardAngleRadians)) * pointerCenterOffsetX + Math.cos((double)(-UiWidget.gameplaySession.boardAngleRadians)) * pointerCenterOffsetY + 240.0);
        if (!specialKinds) {
          pooledEntity.initializeEntityMotion(-75, (float)pointerX, 0, (float)(-pointerX + 320), variantId, 0, 0.0f, (float)pointerY, (float)(-pointerY + 240), categoryId, 0.0f);
        } else {
          specialKindSelector = (variantId + categoryId) % 4;
          spriteKindId = 0;
          if (specialKindSelector == 0) {
            spriteKindId = 2;
          }
          if (specialKindSelector == 1) {
            spriteKindId = 4;
          }
          if (specialKindSelector == 2) {
            spriteKindId = 3;
          }
          if (3 == specialKindSelector) {
            spriteKindId = 1;
          }
          entityBeforeVariantSelection = pooledEntity;
          motionGuardBeforeVariantSelection = methodGuard + 28113;
          boardXBeforeVariantSelection = (float)pointerX;
          kindBeforeVariantSelection = spriteKindId;
          inwardVelocityXBeforeVariantSelection = (float)(320 - pointerX);
          selectedVariantId = (spriteKindId != 2) ? -1 : variantId;
          zeroLifetimeTicks = 0;
          unusedMotionFloat = 0.0f;
          boardYForCategorySelection = (float)pointerY;
          inwardVelocityYForCategorySelection = (float)(-pointerY + 240);
          if ((spriteKindId != 2) &&
              (1 != spriteKindId)) {
            initializationCategory = -1;
          } else {
            initializationCategory = categoryId;
          }
          ((GameplayEntity) (Object) entityBeforeVariantSelection).initializeEntityMotion(motionGuardBeforeVariantSelection, boardXBeforeVariantSelection, kindBeforeVariantSelection, inwardVelocityXBeforeVariantSelection, selectedVariantId, zeroLifetimeTicks, unusedMotionFloat, boardYForCategorySelection, inwardVelocityYForCategorySelection, initializationCategory, 0.0f);
        }
        pooledEntity.entityQueue = null;
        ArchiveNetworkClient.movingEntities.addLast(methodGuard ^ 28286, pooledEntity);
    }

    final static void drawHalfBlendRgbTriangle(int vertexBBlue, int vertexBGreen, int vertexCRed, int vertexCGreen, int vertexAY, int vertexABlue, int vertexBRed, int vertexBY, int vertexCX, int vertexCBlue, int guard, int vertexARed, int vertexAGreen, int vertexAX, int vertexBX, int vertexCY) {
        int controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        if (guard != -2) {
            return;
        }
        if (vertexAY <= vertexBY) {
            if (vertexCY > vertexBY) {
                SpriteState.drawSortedHalfBlendRgbTriangle(vertexCGreen, vertexARed, vertexAX, vertexBGreen, vertexCY, vertexCBlue, vertexCRed, vertexBBlue, vertexAY, vertexBX, vertexBRed, SoftwareRasterizer.framebuffer, vertexAGreen, vertexCX, vertexABlue, vertexBY, -1275583984);
                return;
            }
            if (vertexCY > vertexAY) {
                SpriteState.drawSortedHalfBlendRgbTriangle(vertexBGreen, vertexARed, vertexAX, vertexCGreen, vertexBY, vertexBBlue, vertexBRed, vertexCBlue, vertexAY, vertexCX, vertexCRed, SoftwareRasterizer.framebuffer, vertexAGreen, vertexBX, vertexABlue, vertexCY, -1275583984);
                return;
            }
            SpriteState.drawSortedHalfBlendRgbTriangle(vertexBGreen, vertexCRed, vertexCX, vertexAGreen, vertexBY, vertexBBlue, vertexBRed, vertexABlue, vertexCY, vertexAX, vertexARed, SoftwareRasterizer.framebuffer, vertexCGreen, vertexBX, vertexCBlue, vertexAY, -1275583984);
            return;
        }
        if (vertexAY < vertexCY) {
            SpriteState.drawSortedHalfBlendRgbTriangle(vertexCGreen, vertexBRed, vertexBX, vertexAGreen, vertexCY, vertexCBlue, vertexCRed, vertexABlue, vertexBY, vertexAX, vertexARed, SoftwareRasterizer.framebuffer, vertexBGreen, vertexCX, vertexBBlue, vertexAY, guard ^ 1275583982);
            return;
        }
        if (vertexCY > vertexBY) {
            SpriteState.drawSortedHalfBlendRgbTriangle(vertexAGreen, vertexBRed, vertexBX, vertexCGreen, vertexAY, vertexABlue, vertexARed, vertexCBlue, vertexBY, vertexCX, vertexCRed, SoftwareRasterizer.framebuffer, vertexBGreen, vertexAX, vertexBBlue, vertexCY, -1275583984);
            return;
        }
        SpriteState.drawSortedHalfBlendRgbTriangle(vertexAGreen, vertexCRed, vertexCX, vertexBGreen, vertexAY, vertexABlue, vertexARed, vertexBBlue, vertexCY, vertexBX, vertexBRed, SoftwareRasterizer.framebuffer, vertexCGreen, vertexAX, vertexCBlue, vertexBY, -1275583984);
    }

    final static boolean isCanvasResizeAllowed(boolean preserveLoadingTextGuard) {
        if (!preserveLoadingTextGuard) {
            loadingFontsText = (String) null;
            if (FontLoadingSupport.canvasResizeController == null) {
                return false;
            }
            if (FontLoadingSupport.canvasResizeController.isResizeAllowed(-119)) {
                return true;
            }
            return false;
        }
        if (FontLoadingSupport.canvasResizeController == null) {
            return false;
        }
        if (FontLoadingSupport.canvasResizeController.isResizeAllowed(-119)) {
            return true;
        }
        return false;
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard >= -80) {
            EntitySpawnSupport.releaseStaticReferences(108);
            loadingFontsText = null;
            return;
        }
        loadingFontsText = null;
    }

    static {
        loadingFontsText = "Loading fonts";
    }
}
