/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelCompleteUpgradeScreen extends MenuScreen {
    private int field_i;
    static int[] field_k;
    static Sprite[] field_j;

    final void update(int param0) {
        int var2;
        int var3;
        int var3Lifetime1;
        super.update(param0);
        var2 = (PointLight.mouseX - 140) / 126;
        if (PointLight.mouseX < 140) {
          var2 = -1;
          var3 = (-200 + ArenaDefinitionCodec.field_e) / 150;
          if (!(200 <= ArenaDefinitionCodec.field_e) ||
            !(ArenaDefinitionCodec.field_e <= 350)) {
            var3 = -1;
          }
          this.field_i = var2 + var3 * 3;
          if ((PointLight.mouseX - 140) % 126 > 111) {
            this.field_i = -1;
          }
          if (this.field_i >= 3) {
            this.field_i = -1;
            if (-1 > this.field_i) {
              this.field_i = -1;
            }
            if (-1 != this.field_i) {
              if (ActiveCanvasProvider.field_c == 1 &&
                HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
                if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                  return;
                }
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
                return;
              }
              if (ActiveCanvasProvider.field_c == 2) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
                if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] < 1) {
                  LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
                  IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
                }
              }
            }
            return;
          }
          if (-1 <= this.field_i) {
            if (-1 == this.field_i) {
              return;
            }
            if (ActiveCanvasProvider.field_c == 1 &&
              HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              return;
            }
            if (ActiveCanvasProvider.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
            return;
          }
          this.field_i = -1;
          if (-1 != this.field_i) {
            if (ActiveCanvasProvider.field_c == 1 &&
              HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              return;
            }
            if (ActiveCanvasProvider.field_c == 2) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] < 1) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              }
            }
          }
          return;
        }
        if (PointLight.mouseX > 520) {
          var2 = -1;
        }
        var3Lifetime1 = (-200 + ArenaDefinitionCodec.field_e) / 150;
        if (200 > ArenaDefinitionCodec.field_e) {
          var3Lifetime1 = -1;
          this.field_i = var2 + var3Lifetime1 * 3;
          if ((PointLight.mouseX - 140) % 126 > 111) {
            this.field_i = -1;
          }
          if (this.field_i >= 3) {
            this.field_i = -1;
            if (-1 > this.field_i) {
              this.field_i = -1;
            }
            if (-1 != this.field_i) {
              if (ActiveCanvasProvider.field_c == 1 &&
                HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
                if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                  return;
                }
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
                return;
              }
              if (ActiveCanvasProvider.field_c == 2) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
                if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] < 1) {
                  LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
                  IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
                }
              }
            }
            return;
          }
          if (-1 <= this.field_i) {
            if (-1 == this.field_i) {
              return;
            }
            if (ActiveCanvasProvider.field_c == 1 &&
              HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              return;
            }
            if (ActiveCanvasProvider.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
            return;
          }
          this.field_i = -1;
          if (-1 != this.field_i) {
            if (ActiveCanvasProvider.field_c == 1 &&
              HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              return;
            }
            if (ActiveCanvasProvider.field_c == 2) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] < 1) {
                LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
                IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              }
            }
          }
          return;
        }
        if (ArenaDefinitionCodec.field_e > 350) {
          var3Lifetime1 = -1;
        }
        this.field_i = var2 + var3Lifetime1 * 3;
        if ((PointLight.mouseX - 140) % 126 > 111) {
          this.field_i = -1;
        }
        if (this.field_i >= 3) {
          this.field_i = -1;
          if (-1 > this.field_i) {
            this.field_i = -1;
          }
          if (-1 != this.field_i) {
            if (ActiveCanvasProvider.field_c == 1 &&
              HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
              return;
            }
            if (ActiveCanvasProvider.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
            return;
          }
          return;
        }
        if (-1 <= this.field_i) {
          if (-1 == this.field_i) {
            return;
          }
          if (ActiveCanvasProvider.field_c == 1 &&
            HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
              return;
            }
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
            return;
          }
          if (ActiveCanvasProvider.field_c == 2) {
            LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
            IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] < 1) {
              LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
              IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
              return;
            }
          }
          return;
        }
        this.field_i = -1;
        if (-1 == this.field_i) {
          return;
        }
        if (ActiveCanvasProvider.field_c == 1 &&
          HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints > 0) {
          LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] + 1;
          IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
          if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] <= 10) {
            return;
          }
          LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 10;
          IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
          return;
        }
        if (ActiveCanvasProvider.field_c != 2) {
          return;
        }
        LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] - 1;
        IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints - 1;
        if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] >= 1) {
          return;
        }
        LegacyOpenGlSpecularEffect.pendingUpgradeLevels[this.field_i] = 1;
        IsaacPacketBuffer.allocatedUpgradePoints = IsaacPacketBuffer.allocatedUpgradePoints + 1;
        return;
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_k = null;
        if (param0 != 32) {
          field_k = (int[]) null;
        }
    }

    final void render(int opacity, GraphicsToolkit toolkit, int guard) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        GraphicsToolkit var6_ref_ha = null;
        int var6 = 0;
        int var7 = 0;
        ToolkitSprite[] var8 = null;
        int var9 = 0;
        ToolkitSprite[] stackIn_8_0 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          DelegatingCanvas.drawToolkitNineSlice(IntroMeshProjection.field_c, 490, -20 + (-(MouseWheelInput.field_b.width() / 2) + 290), opacity << 24, 3, toolkit, 100 + MouseWheelInput.field_b.width(), -5, 1, true);
          ForceFieldRingEffect.field_t.drawCenteredText(LegacyOpenGlSprite.levelCompleteText, 5023231 | opacity << 24, -1, 55, 320, 0);
          AccountStatusDialogState.headingFont.drawCenteredText(LegacyOpenGlSprite.levelCompleteText, -1, -1, 55, 320, 0);
          if (guard != -2355) {
            this.field_i = 108;
          }
          QueuedIntArrayRequest.field_k.drawWrappedText(100, opacity << 24 | 5023231, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 40, -1, 0, 0, guard - 6432, AchievementThresholds.scoreText.toUpperCase() + " " + BlendMode.lastLevelScore + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + UiStyleNode.formatGameTime(Js5ClientState.field_a, guard - 21265), (SpriteMask) null, 1, 1);
          GameTrackPlayback.field_a.drawWrappedText(100, -1, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 40, -1, 0, 0, -8787, AchievementThresholds.scoreText.toUpperCase() + " " + BlendMode.lastLevelScore + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + UiStyleNode.formatGameTime(Js5ClientState.field_a, -23620), (SpriteMask) null, 1, 1);
          MessageDialog.field_db.drawWrappedText(200, 5023231 | opacity << 24, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 118, -1, 0, 0, -8787, LegacyOpenGlPbuffer.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.drawWrappedText(200, -1, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 118, -1, 0, 0, guard ^ 11104, LegacyOpenGlPbuffer.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          QueuedIntArrayRequest.field_k.drawCenteredText(LegacyOpenGlInterleavedStream.formatIndexedTokens(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints)}, (byte) -128).toUpperCase(), opacity << 24 | 5023231, -1, 180, 320, 0);
          GameTrackPlayback.field_a.drawCenteredText(LegacyOpenGlInterleavedStream.formatIndexedTokens(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints)}, (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
          var4_int = 140;
          var5 = 0;
          while (400 > var4_int) {
            var6_ref_ha = toolkit;
            var7 = -10 + var4_int;
            if (this.field_i == var5) {
              stackIn_8_0 = IntrusiveDeque.field_c;
            } else {
              stackIn_8_0 = SecondaryNodeDequeIterator.field_a;
            }
            var8 = stackIn_8_0;
            DelegatingCanvas.drawToolkitNineSlice(var8, 170, var7, 0, 1, var6_ref_ha, 131, 185, 1, true);
            if (LegacyOpenGlSpecularEffect.pendingUpgradeLevels[var5] == 1) {
              stackIn_14_0 = (HardwareUnlitEffect.completedLevelCount(17079) - IsaacPacketBuffer.allocatedUpgradePoints == 0) ? 1 : 0;
            } else {
              stackIn_14_0 = 0;
            }
            var6 = stackIn_14_0;
            QueuedIntArrayRequest.field_k.drawCenteredText(UpgradeStatNames.names[var5].toUpperCase(), opacity << 24 | 5023231, -1, 225, -4 + (var4_int + 55), guard + 2355);
            GameTrackPlayback.field_a.drawCenteredText(UpgradeStatNames.names[var5].toUpperCase(), -1, -1, 225, -4 + (var4_int + 55), guard ^ -2355);
            if (var6 != 0) {
              MusicCrossfadeStream.field_q[15 + var5].draw(55 + (var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1)), 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            } else {
              MusicCrossfadeStream.field_q[var5].draw(-(MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1) + 55 + var4_int, 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            }
            QueuedIntArrayRequest.field_k.drawCenteredText(Integer.toString(LegacyOpenGlSpecularEffect.pendingUpgradeLevels[var5]), 5023231 | opacity << 24, -16777216, 320, 55 + var4_int, 0);
            GameTrackPlayback.field_a.drawCenteredText(Integer.toString(LegacyOpenGlSpecularEffect.pendingUpgradeLevels[var5]), -1, -16777216, 320, var4_int + 55, 0);
            var5++;
            var4_int += 126;
          }
          super.render(opacity, toolkit, guard ^ 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_22_0 = runtimeException;
          stackIn_22_1 = new StringBuilder().append("jp.B(").append(opacity).append(',');
          if (toolkit == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(guard).append(')').toString());
        }
    }

    public LevelCompleteUpgradeScreen() {
        super(10);
    }

    final static void decreaseSoundVolume(byte guard) {
        int var1 = 0;
        if (32 < RasterColorTables.soundVolume) {
          var1 = RasterColorTables.soundVolume % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          LegacyOpenGlRenderBufferSet.setSoundVolume(-var1 + RasterColorTables.soundVolume, (byte) -58);
          if (guard < 121) {
            LevelCompleteUpgradeScreen.decreaseSoundVolume((byte) -57);
            return;
          }
          return;
        }
        LegacyOpenGlRenderBufferSet.setSoundVolume(0, (byte) -58);
        if (guard < 121) {
          LevelCompleteUpgradeScreen.decreaseSoundVolume((byte) -57);
          return;
        }
    }

    static {
        field_k = new int[1];
    }
}
