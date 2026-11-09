/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReassignUpgradesScreen extends MenuScreen {
    static int field_l;
    static long field_j;
    private int field_k;
    static int[] hslToRgb;

    public static void releaseStatics(byte param0) {
        if (param0 < 31) {
          return;
        }
        hslToRgb = null;
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
        ToolkitSprite[] stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          DelegatingCanvas.a(up.field_c, 490, -20 - MouseWheelInput.field_b.width() / 2 + 290, opacity << 24, 3, toolkit, MouseWheelInput.field_b.width() + 100, -5, 1, true);
          ForceFieldRingEffect.field_t.a(NextLevelChoiceOverlay.reassignPowerupsText, 5023231 | opacity << 24, -1, 60, 320, 0);
          hc.field_e.a(NextLevelChoiceOverlay.reassignPowerupsText, -1, -1, 60, 320, 0);
          MessageDialog.field_db.a(200, 5023231 | opacity << 24, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 75, -1, 0, 0, guard - 6432, LegacyOpenGlPbuffer.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.a(200, -1, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 75, -1, 0, 0, guard ^ 11104, LegacyOpenGlPbuffer.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          QueuedIntArrayRequest.field_k.a(LegacyOpenGlInterleavedStream.formatIndexedTokens(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.d(guard ^ -19334) - IsaacCipher.field_k)}, (byte) -128).toUpperCase(), 5023231 | opacity << 24, -1, 180, 320, 0);
          GameTrackPlayback.field_a.a(LegacyOpenGlInterleavedStream.formatIndexedTokens(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.d(guard + 19434) - IsaacCipher.field_k)}, (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
          var4_int = 140;
          var5 = 0;
          while (392 >= var4_int) {
            var6_ref_ha = toolkit;
            var7 = -10 + var4_int;
            if (var5 == this.field_k) {
              stackIn_6_0 = IntrusiveDeque.field_c;
            } else {
              stackIn_6_0 = SecondaryNodeDequeIterator.field_a;
            }
            var8 = stackIn_6_0;
            DelegatingCanvas.a(var8, 170, var7, 0, 1, var6_ref_ha, 131, 185, 1, true);
            if (PasswordInputRenderer.upgradeAllocation[var5] == 1) {
              stackIn_12_0 = (HardwareUnlitEffect.d(17079) - IsaacCipher.field_k == 0) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var6 = stackIn_12_0;
            QueuedIntArrayRequest.field_k.a(UpgradeStatNames.names[var5].toUpperCase(), opacity << 24 | 5023231, -1, 225, var4_int + 51, 0);
            GameTrackPlayback.field_a.a(UpgradeStatNames.names[var5].toUpperCase(), -1, -1, 225, 55 + (var4_int - 4), guard ^ -2355);
            if (var6 == 0) {
              MusicCrossfadeStream.field_q[var5].draw(55 + var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1), 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            } else {
              MusicCrossfadeStream.field_q[15 + var5].draw(55 + var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1), (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1) + 200, 1, 0, 2);
            }
            QueuedIntArrayRequest.field_k.a(Integer.toString(PasswordInputRenderer.upgradeAllocation[var5]), 5023231 | opacity << 24, -16777216, 320, 55 + var4_int, 0);
            GameTrackPlayback.field_a.a(Integer.toString(PasswordInputRenderer.upgradeAllocation[var5]), -1, -16777216, 320, 55 + var4_int, guard ^ -2355);
            var5++;
            var4_int += 126;
          }
          super.render(opacity, toolkit, guard);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("bb.B(").append(opacity).append(',');
          if (toolkit == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(')').toString());
        }
    }

    public ReassignUpgradesScreen() {
        super(9);
    }

    final void update(int param0) {
        int var2;
        int var3;
        int var3Lifetime1;
        super.update(param0);
        var2 = (PointLight.mouseX - 140) / 126;
        if (PointLight.mouseX < 140) {
          var2 = -1;
          var3 = (-200 + pi.field_e) / 150;
          if (!(pi.field_e >= 200) ||
            !(pi.field_e <= 350)) {
            var3 = -1;
          }
          this.field_k = var3 * 3 + var2;
          if ((-140 + PointLight.mouseX) % 126 > 111) {
            this.field_k = -1;
          }
          if (this.field_k >= 3) {
            this.field_k = -1;
            if (this.field_k < -1) {
              this.field_k = -1;
            }
            if (this.field_k > -1) {
              if (1 == ActiveCanvasProvider.field_c &&
                0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
                PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
                IsaacCipher.field_k = IsaacCipher.field_k + 1;
                if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
                  return;
                }
                PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
                IsaacCipher.field_k = IsaacCipher.field_k - 1;
                return;
              }
              if (2 == ActiveCanvasProvider.field_c) {
                PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
                IsaacCipher.field_k = IsaacCipher.field_k - 1;
                if (PasswordInputRenderer.upgradeAllocation[this.field_k] < 1) {
                  PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
                  IsaacCipher.field_k = IsaacCipher.field_k + 1;
                }
              }
            }
            return;
          }
          if (this.field_k < -1) {
            this.field_k = -1;
          }
          if (this.field_k <= -1) {
            return;
          }
          if (1 != ActiveCanvasProvider.field_c) {
            if (2 != ActiveCanvasProvider.field_c) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] >= 1) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
            return;
          }
          if (0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            return;
          }
          if (2 == ActiveCanvasProvider.field_c) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] < 1) {
              PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
              IsaacCipher.field_k = IsaacCipher.field_k + 1;
            }
          }
          return;
        }
        if (520 < PointLight.mouseX) {
          var2 = -1;
        }
        var3Lifetime1 = (-200 + pi.field_e) / 150;
        if (pi.field_e < 200) {
          var3Lifetime1 = -1;
          this.field_k = var3Lifetime1 * 3 + var2;
          if ((-140 + PointLight.mouseX) % 126 > 111) {
            this.field_k = -1;
          }
          if (this.field_k >= 3) {
            this.field_k = -1;
            if (this.field_k < -1) {
              this.field_k = -1;
            }
            if (this.field_k > -1) {
              if (1 == ActiveCanvasProvider.field_c &&
                0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
                PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
                IsaacCipher.field_k = IsaacCipher.field_k + 1;
                if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
                  return;
                }
                PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
                IsaacCipher.field_k = IsaacCipher.field_k - 1;
                return;
              }
              if (2 == ActiveCanvasProvider.field_c) {
                PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
                IsaacCipher.field_k = IsaacCipher.field_k - 1;
                if (PasswordInputRenderer.upgradeAllocation[this.field_k] < 1) {
                  PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
                  IsaacCipher.field_k = IsaacCipher.field_k + 1;
                }
              }
            }
            return;
          }
          if (this.field_k < -1) {
            this.field_k = -1;
          }
          if (this.field_k <= -1) {
            return;
          }
          if (1 != ActiveCanvasProvider.field_c) {
            if (2 != ActiveCanvasProvider.field_c) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] >= 1) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
            return;
          }
          if (0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            return;
          }
          if (2 == ActiveCanvasProvider.field_c) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] < 1) {
              PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
              IsaacCipher.field_k = IsaacCipher.field_k + 1;
            }
          }
          return;
        }
        if (pi.field_e > 350) {
          var3Lifetime1 = -1;
        }
        this.field_k = var3Lifetime1 * 3 + var2;
        if ((-140 + PointLight.mouseX) % 126 > 111) {
          this.field_k = -1;
        }
        if (this.field_k < 3) {
          if (this.field_k < -1) {
            this.field_k = -1;
          }
          if (this.field_k <= -1) {
            return;
          }
          if (1 == ActiveCanvasProvider.field_c &&
            0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
            if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
              return;
            }
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
            IsaacCipher.field_k = IsaacCipher.field_k - 1;
            return;
          }
          if (2 != ActiveCanvasProvider.field_c) {
            return;
          }
          PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
          IsaacCipher.field_k = IsaacCipher.field_k - 1;
          if (PasswordInputRenderer.upgradeAllocation[this.field_k] >= 1) {
            return;
          }
          PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
          IsaacCipher.field_k = IsaacCipher.field_k + 1;
          return;
        }
        this.field_k = -1;
        if (this.field_k < -1) {
          this.field_k = -1;
        }
        if (this.field_k <= -1) {
          return;
        }
        if (1 != ActiveCanvasProvider.field_c) {
          if (2 != ActiveCanvasProvider.field_c) {
            return;
          }
          PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
          IsaacCipher.field_k = IsaacCipher.field_k - 1;
          if (PasswordInputRenderer.upgradeAllocation[this.field_k] >= 1) {
            return;
          }
          PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
          IsaacCipher.field_k = IsaacCipher.field_k + 1;
          return;
        }
        if (0 < HardwareUnlitEffect.d(param0 ^ -2765) - IsaacCipher.field_k) {
          PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] + 1;
          IsaacCipher.field_k = IsaacCipher.field_k + 1;
          if (PasswordInputRenderer.upgradeAllocation[this.field_k] <= 10) {
            return;
          }
          PasswordInputRenderer.upgradeAllocation[this.field_k] = 10;
          IsaacCipher.field_k = IsaacCipher.field_k - 1;
          return;
        }
        if (2 == ActiveCanvasProvider.field_c) {
          PasswordInputRenderer.upgradeAllocation[this.field_k] = PasswordInputRenderer.upgradeAllocation[this.field_k] - 1;
          IsaacCipher.field_k = IsaacCipher.field_k - 1;
          if (PasswordInputRenderer.upgradeAllocation[this.field_k] < 1) {
            PasswordInputRenderer.upgradeAllocation[this.field_k] = 1;
            IsaacCipher.field_k = IsaacCipher.field_k + 1;
          }
        }
        return;
    }

    static {
    }
}
