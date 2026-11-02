/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerCaptureSupport {
    static HuffmanCodec chatHuffmanCodec;
    static RgbSprite[] field_a;
    static String field_b;

    public static void releaseStatics(int obfuscationGuard) {
        chatHuffmanCodec = null;
        if (obfuscationGuard != 2) {
          chatHuffmanCodec = (HuffmanCodec) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void capturePointerInput(byte obfuscationGuard) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = BattleCharacter.pointerInputHandler;
        synchronized (var1) {
          ProgressMessageDialog.pointerButton = GridWidgetContainer.heldPointerButton;
          PointerIdleState.pointerIdleTicks = PointerIdleState.pointerIdleTicks + 1;
          AiPlanningStrategy.pointerX = DiskCacheRequest.livePointerX;
          ko.pointerY = ResourceArchive.livePointerY;
          BitmapTextWidgetPainter.pointerChangedSnapshot = DropTargetWidgetContainer.pointerChanged;
          var2 = 48 / ((36 - obfuscationGuard) / 56);
          DropTargetWidgetContainer.pointerChanged = false;
          DeployEvent.pointerPressButton = ArchiveIndex.pressedPointerButton;
          BattleTutorial.pointerPressX = QuickChatMenu.lastPointerPressX;
          TeleportAction.pointerPressY = BoundedFile.lastPointerPressY;
          ArchiveIndex.pressedPointerButton = 0;
          PasswordLoginCredentials.pointerButtonMask = EffectPresentation.livePointerButtonMask;
        }
    }

    final static void a(int param0, int param1) {
        try {
          try {
            AppletScriptBridge.callScriptFunction(CombatEvent.d((byte) -117), "resizing", new Object[]{new Integer(param0)}, 90);
          } catch (Throwable throwable) {
          }
          int var2 = 87 % ((param1 - 39) / 40);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        IndexedSprite var13 = null;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != ManaStarParticle.activeTerrainSprites &&
            0 <= param5 &&
            ManaStarParticle.activeTerrainSprites.length > param5 &&
            ManaStarParticle.activeTerrainSprites[param5] != null) {
            if (param6 &&
              ManaStarParticle.activeTerrainSprites.length >= 1) {
              var8 = ManaStarParticle.activeTerrainSprites[0];
              if (var8 != null) {
                if (param4) {
                  var8.drawHalfSize(IgnoreListLookupSupport.a(true, param0), MatchConditionEntry.a(param1, (byte) 94));
                } else {
                  var8.draw(IgnoreListLookupSupport.a(true, param0), MatchConditionEntry.a(param1, (byte) 94));
                }
              }
            }
            if (0 == param7) {
              return;
            }
            stackIn_20_0 = (param7 != 7);
            if (stackIn_20_0 ^ param6) {
              if (param7 == 9) {
                param7 = 2;
              }
              var8_int = 0;
              while (var8_int < 4) {
                if (~param7 == ~QuickChatCategory.field_G[6]) {
                  param2 = param7;
                }
                var9 = param2;
                var10 = param2;
                var11 = param2;
                if (param2 != param7 && (param7 == QuickChatCategory.field_G[1] ||
                  QuickChatCategory.field_G[4] == param7)) {
                  var9 = param7;
                }
                var12 = var8_int + (param7 * 20 + FullscreenDisplayMode.a(var11, param7, var10, var9, param3 - 27089));
                if (var12 >= 0 &&
                  var12 < ManaStarParticle.activeTerrainSprites.length) {
                  var13 = ManaStarParticle.activeTerrainSprites[var12];
                  if (var13 != null) {
                    if (!param4) {
                      var13.draw(IgnoreListLookupSupport.a(true, param0), MatchConditionEntry.a(param1, (byte) 94));
                    } else {
                      var13.drawHalfSize(IgnoreListLookupSupport.a(true, param0), MatchConditionEntry.a(param1, (byte) 94));
                    }
                  }
                  var8_int++;
                  continue;
                }
                return;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var8_ref), "ds.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Loading sound effects";
    }
}
