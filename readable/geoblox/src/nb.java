/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String loadingFontsText;

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kc.a((java.awt.Component) ((Object) param1), 0);
          df.a(false, (java.awt.Component) ((Object) param1));
          if (param0 != -2) {
            loadingFontsText = (String) null;
          }
          if (null == vc.field_f) {
            return;
          }
          vc.field_f.a((java.awt.Component) ((Object) param1), (byte) 83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);
          stackIn_7_1 = new StringBuilder().append("nb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
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
        pooledEntity = (GameplayEntity) ((Object) ra.availableEntities.removeLast(1));
        if (pooledEntity == null) {
          return;
        }
        pointerCenterOffsetX = (double)(-320 + pointerX);
        pointerCenterOffsetY = (double)(-240 + pointerY);
        pointerX = (int)(320.0 + (pointerCenterOffsetX * Math.cos((double)(-el.gameplaySession.boardAngleRadians)) - pointerCenterOffsetY * Math.sin((double)(-el.gameplaySession.boardAngleRadians))));
        pointerY = (int)(Math.sin((double)(-el.gameplaySession.boardAngleRadians)) * pointerCenterOffsetX + Math.cos((double)(-el.gameplaySession.boardAngleRadians)) * pointerCenterOffsetY + 240.0);
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
          entityBeforeVariantSelection = (GameplayEntity) (pooledEntity);
          motionGuardBeforeVariantSelection = methodGuard + 28113;
          boardXBeforeVariantSelection = (float)pointerX;
          kindBeforeVariantSelection = spriteKindId;
          inwardVelocityXBeforeVariantSelection = (float)(320 - pointerX);
          selectedVariantId = (spriteKindId != 2) ? -1 : variantId;
          L5: {
            zeroLifetimeTicks = 0;
            unusedMotionFloat = 0.0f;
            boardYForCategorySelection = (float)pointerY;
            inwardVelocityYForCategorySelection = (float)(-pointerY + 240);
            if (spriteKindId != 2) {
              if (1 != spriteKindId) {
                initializationCategory = -1;
                break L5;
              }
            }
            initializationCategory = categoryId;
          }
          ((GameplayEntity) (Object) entityBeforeVariantSelection).initializeEntityMotion(motionGuardBeforeVariantSelection, boardXBeforeVariantSelection, kindBeforeVariantSelection, inwardVelocityXBeforeVariantSelection, selectedVariantId, zeroLifetimeTicks, unusedMotionFloat, boardYForCategorySelection, inwardVelocityYForCategorySelection, initializationCategory, 0.0f);
        }
        pooledEntity.entityQueue = null;
        ji.movingEntities.addLast(methodGuard ^ 28286, pooledEntity);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = Geoblox.field_C;
        if (param10 != -2) {
            return;
        }
        if (param4 <= param7) {
            if (param15 > param7) {
                SpriteState.a(param3, param11, param13, param1, param15, param9, param2, param0, param4, param14, param6, SoftwareRasterizer.framebuffer, param12, param8, param5, param7, -1275583984);
                return;
            }
            if (param15 > param4) {
                SpriteState.a(param1, param11, param13, param3, param7, param0, param6, param9, param4, param8, param2, SoftwareRasterizer.framebuffer, param12, param14, param5, param15, -1275583984);
                return;
            }
            SpriteState.a(param1, param2, param8, param12, param7, param0, param6, param5, param15, param13, param11, SoftwareRasterizer.framebuffer, param3, param14, param9, param4, -1275583984);
            return;
        }
        if (param4 < param15) {
            SpriteState.a(param3, param6, param14, param12, param15, param9, param2, param5, param7, param13, param11, SoftwareRasterizer.framebuffer, param1, param8, param0, param4, param10 ^ 1275583982);
            return;
        }
        if (param15 > param7) {
            SpriteState.a(param12, param6, param14, param3, param4, param5, param11, param9, param7, param8, param2, SoftwareRasterizer.framebuffer, param1, param13, param0, param15, -1275583984);
            return;
        }
        SpriteState.a(param12, param2, param8, param1, param4, param5, param11, param0, param15, param14, param6, SoftwareRasterizer.framebuffer, param3, param13, param9, param7, -1275583984);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            loadingFontsText = (String) null;
            if (rb.field_d == null) {
                return false;
            }
            if (rb.field_d.a(-119)) {
                return true;
            }
            return false;
        }
        if (rb.field_d == null) {
            return false;
        }
        if (rb.field_d.a(-119)) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 >= -80) {
            nb.a(108);
            loadingFontsText = null;
            return;
        }
        loadingFontsText = null;
    }

    static {
        loadingFontsText = "Loading fonts";
    }
}
