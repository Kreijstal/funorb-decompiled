/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ParisBackground extends BackgroundScene {
    static String field_t;
    static char[] cp1252Extensions;
    static boolean field_s;

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -51 % ((-28 - obfuscationGuard) / 43);
          if (-1 < colorIndex) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, ReflectionCheck.parisBackgroundColors[colorIndex], 928072);
          }
          if (-1 >= colorIndex ||
            BrickABrac.field_J) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 928072);
          }
          if (this.hasSprites((byte) -105)) {
            pl.parisSmallSprite.drawTransparent(destinationX, destinationY);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ai.G(" + obfuscationGuard + ',' + colorIndex + ',' + destinationX + ',' + destinationY + ')');
        }
    }

    final RgbSprite c(byte param0) {
        RuntimeException var2 = null;
        RgbSprite stackIn_2_0 = null;
        RgbSprite stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -74) {
            stackIn_4_0 = BallPulseEffect.parisCharacterSprite;
            return stackIn_4_0;
          }
          stackIn_2_0 = (RgbSprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ai.H(" + param0 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          UsernameSuggestionPanel.field_N = param2;
          if (param0 != 24) {
            ParisBackground.readLevelMetadata((byte) 116, (PacketBuffer) null);
          }
          WidgetTextLayout.field_a = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ai.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static LevelMetadata readLevelMetadata(byte obfuscationGuard, PacketBuffer packet) {
        LevelMetadata var2 = null;
        RuntimeException var2_ref = null;
        LevelMetadata stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new LevelMetadata();
          if (obfuscationGuard != -12) {
            ParisBackground.a((byte) -119, 0.37269747257232666f, (String) null);
          }
          var2.readMetadata(obfuscationGuard - 12976, packet);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ai.A(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!AchievementIcon.field_m.ensureGroupAvailableByName("paris", -28138)) {
            return false;
          }
          NinjaBackground.parisNearSprite = pl.loadRgbSpriteByName("paris", "paris_near", (byte) -51, AchievementIcon.field_m);
          QuickChatParameterType.parisMidSprite = pl.loadRgbSpriteByName("paris", "paris_mid", (byte) 98, AchievementIcon.field_m);
          ToggleButtonWidget.parisFarSprite = pl.loadRgbSpriteByName("paris", "paris_far", (byte) -100, AchievementIcon.field_m);
          pl.parisSmallSprite = pl.loadRgbSpriteByName("paris", "paris_small", (byte) 108, AchievementIcon.field_m);
          BallPulseEffect.parisCharacterSprite = pl.loadRgbSpriteByName("paris", "paris_character", (byte) -43, AchievementIcon.field_m);
          IntrusiveHashTable.field_i = jh.a(0, NinjaBackground.parisNearSprite);
          if (obfuscationGuard) {
            ParisBackground.a((UiComponent) null, (TextFont) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (byte) 19, false, (VerticalScrollbar) null, (UiComponent) null);
          }
          UnderwaterBackground.field_t = jh.a(0, QuickChatParameterType.parisMidSprite);
          MembershipBenefitsScreen.field_s = jh.a(0, ToggleButtonWidget.parisFarSprite);
          uq.b(QuickChatParameterType.parisMidSprite);
          uq.b(UnderwaterBackground.field_t);
          uq.b(NinjaBackground.parisNearSprite);
          uq.b(IntrusiveHashTable.field_i);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ai.F(" + obfuscationGuard + ')');
        }
    }

    ParisBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          boolean decompiledSharedTail0 = !(!this.hasSprites((byte) -124));
          if (!decompiledSharedTail0) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, ReflectionCheck.parisBackgroundColors[colorIndex], 928072);
            decompiledSharedTail0 = (BrickABrac.field_J);
          }
          if (decompiledSharedTail0) {
            var6 = kd.a(this.sceneId, colorIndex, (byte) -34);
            if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
              StrongCacheEntry.a(0, MembershipBenefitsScreen.field_s, 2, 0, colorIndex, var6);
              var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            }
            wo.a(destinationY, scroll16, UnderwaterBackground.field_t, 118, 306, 0, destinationX, 2, IntrusiveHashTable.field_i, var6.sprite, colorIndex);
          }
          if (obfuscationGuard >= -84) {
            ParisBackground.a((byte) -61, -0.03386414423584938f, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var6_ref), "ai.C(" + destinationY + ',' + obfuscationGuard + ',' + destinationX + ',' + colorIndex + ',' + scroll16 + ')');
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -91) {
            this.drawFullBackground(false, 87, -76, -86, -25);
          }
          stackIn_19_0 = (NinjaBackground.parisNearSprite != null) && (null != QuickChatParameterType.parisMidSprite) && (ToggleButtonWidget.parisFarSprite != null) && (pl.parisSmallSprite != null) && (null != BallPulseEffect.parisCharacterSprite);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ai.E(" + obfuscationGuard + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != 0) {
          return;
        }
        try {
          cp1252Extensions = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ai.N(" + param0 + ')');
        }
    }

    final static void a(UiComponent param0, TextFont param1, UiComponent param2, UiComponent param3, UiComponent param4, UiComponent param5, UiComponent param6, UiComponent param7, byte param8, boolean param9, VerticalScrollbar param10, UiComponent param11) {
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RgbSprite[] var16 = null;
        UiComponent var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          QuickChatParameterType.field_d = param9;
          sj.field_a = param6;
          BackgroundScene.field_i[0] = 16764000;
          BackgroundScene.field_i[3] = 16736511;
          BackgroundScene.field_i[1] = 6356832;
          CachedArchiveSource.field_y = param1;
          BackgroundScene.field_i[4] = 16711935;
          BackgroundScene.field_i[2] = 9474303;
          TextFieldRenderer.field_C[2] = 16736352;
          BackgroundScene.field_i[4] = 16711935;
          GameOverlayHelpers.field_d = 8421504;
          TextFieldRenderer.field_C[3] = 16736511;
          TextFieldRenderer.field_C[0] = 16764000;
          if (param8 != 61) {
            ParisBackground.a((UiComponent) null, (TextFont) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (byte) 97, false, (VerticalScrollbar) null, (UiComponent) null);
          }
          TextFieldRenderer.field_C[1] = 6356832;
          var12 = new RgbSprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new RgbSprite[9];
          var16[4] = var12;
          DualLinkDeque.field_d = new UiComponent(0L, param0);
          sh.field_d = new UiComponent(0L, param2);
          DualLinkDeque.field_d.addChild(sh.field_d, 0);
          var17 = new UiComponent(0L, (UiComponent) null);
          var17.children = new NodeDeque();
          AchievementIcon.field_q = new ScrollPane(0L, var17, param5, param10);
          sh.field_d.addChild(AchievementIcon.field_q, param8 - 61);
          BallPulseEffect.field_n = new UiComponent(0L, param3);
          sh.field_d.addChild(BallPulseEffect.field_n, 0);
          PasswordValidator.field_n = new UiComponent(0L, param7);
          PasswordValidator.field_n.font = CachedArchiveSource.field_y;
          BallPulseEffect.field_n.addChild(PasswordValidator.field_n, 0);
          BallPulseEffect.field_n.markDescendantsToInheritVisualState(true);
          ap.field_e = new UiComponent(0L, (UiComponent) null);
          ap.field_e.frameSprites = var16;
          BallPulseEffect.field_n.addChild(ap.field_e, 0);
          HalloweenBackground.field_w = new UiComponent[5];
          vj.field_a = new UiComponent[5];
          QuickChatPhraseDefinition.field_F = new UiComponent[5];
          IntrusiveHashIterator.field_i = new UiComponent[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = 0;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 != var18) {
                if (var18 != 1 ||
                  !QuickChatParameterType.field_d) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = ContentTransitionLayer.field_hb;
                  }
                } else {
                  var19 = UiComponent.field_Z;
                }
              } else {
                if (!QuickChatParameterType.field_d) {
                  stackIn_30_0 = QuickChatHelpDialog.field_Wb;
                } else {
                  stackIn_30_0 = ArcticBackground.field_u;
                }
                var19 = stackIn_30_0;
              }
              if (decompiledFrameRemainder0) {
                IntrusiveHashIterator.field_i[var18] = new UiComponent(0L, param11);
                HalloweenBackground.field_w[var18] = new UiComponent(0L, sj.field_a, var19);
                vj.field_a[var18] = new UiComponent(0L, (UiComponent) null);
                vj.field_a[var18].verticalAlignment = 1;
                QuickChatPhraseDefinition.field_F[var18] = new UiComponent(0L, sj.field_a);
                QuickChatPhraseDefinition.field_F[var18].verticalAlignment = 1;
                IntrusiveHashIterator.field_i[var18].addChild(HalloweenBackground.field_w[var18], 0);
                IntrusiveHashIterator.field_i[var18].addChild(vj.field_a[var18], 0);
                IntrusiveHashIterator.field_i[var18].addChild(QuickChatPhraseDefinition.field_F[var18], 0);
                IntrusiveHashIterator.field_i[var18].markDescendantsToInheritVisualState(true);
                DualLinkDeque.field_d.addChild(IntrusiveHashIterator.field_i[var18], 0);
                ContentTransitionLayer.field_pb = ContentTransitionLayer.field_pb + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            LegacyUtf8Decoder.field_c = new UiComponent(0L, param4);
            LegacyUtf8Decoder.field_c.text = RadialSelectorWidget.field_Y;
            DualLinkDeque.field_d.addChild(LegacyUtf8Decoder.field_c, 0);
            stackIn_34_0 = IntrusiveHashIterator.a(false) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !TextWidgetRenderer.field_e) {
            return;
          }
          vd.field_a = new BirthDateEntryPanel(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_44_0 = var12_ref;
          stackIn_44_1 = new StringBuilder().append("ai.M(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',');
          if (param4 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param5 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param6 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param7 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param11 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          if (!obfuscationGuard) {
            cp1252Extensions = (char[]) null;
          }
          if (!this.hasSprites((byte) -97)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, ReflectionCheck.parisBackgroundColors[colorIndex], 928072);
            if (!BrickABrac.field_J) {
              return;
            }
          }
          var6 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            StrongCacheEntry.a(0, ToggleButtonWidget.parisFarSprite, 1, 0, colorIndex, var6);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          wo.a(destinationY, scroll16, QuickChatParameterType.parisMidSprite, 127, 640, 0, destinationX, 1, NinjaBackground.parisNearSprite, var6.sprite, colorIndex);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var6_ref), "ai.K(" + obfuscationGuard + ',' + scroll16 + ',' + destinationY + ',' + colorIndex + ',' + destinationX + ')');
        }
    }

    static {
        cp1252Extensions = new char[]{'€', '\0', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\0', 'Ž', '\0', '\0', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\0', 'ž', 'Ÿ'};
        field_s = false;
    }
}
