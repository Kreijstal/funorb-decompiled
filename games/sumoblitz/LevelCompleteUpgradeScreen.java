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
        var2 = (ko.field_p - 140) / 126;
        if (ko.field_p < 140) {
          var2 = -1;
          var3 = (-200 + pi.field_e) / 150;
          if (!(200 <= pi.field_e) ||
            !(pi.field_e <= 350)) {
            var3 = -1;
          }
          this.field_i = var2 + var3 * 3;
          if ((ko.field_p - 140) % 126 > 111) {
            this.field_i = -1;
          }
          if (this.field_i >= 3) {
            this.field_i = -1;
            if (-1 > this.field_i) {
              this.field_i = -1;
            }
            if (-1 != this.field_i) {
              if (hk.field_c == 1 &&
                HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
                pl.field_u = pl.field_u + 1;
                if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                  return;
                }
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
                pl.field_u = pl.field_u - 1;
                return;
              }
              if (hk.field_c == 2) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
                pl.field_u = pl.field_u - 1;
                if (LegacyOpenGlSpecularEffect.field_h[this.field_i] < 1) {
                  LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
                  pl.field_u = pl.field_u + 1;
                }
              }
            }
            return;
          }
          if (-1 <= this.field_i) {
            if (-1 == this.field_i) {
              return;
            }
            if (hk.field_c == 1 &&
              HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
              pl.field_u = pl.field_u + 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
              pl.field_u = pl.field_u - 1;
              return;
            }
            if (hk.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
            pl.field_u = pl.field_u - 1;
            if (LegacyOpenGlSpecularEffect.field_h[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
            pl.field_u = pl.field_u + 1;
            return;
          }
          this.field_i = -1;
          if (-1 != this.field_i) {
            if (hk.field_c == 1 &&
              HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
              pl.field_u = pl.field_u + 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
              pl.field_u = pl.field_u - 1;
              return;
            }
            if (hk.field_c == 2) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
              pl.field_u = pl.field_u - 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] < 1) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
                pl.field_u = pl.field_u + 1;
              }
            }
          }
          return;
        }
        if (ko.field_p > 520) {
          var2 = -1;
        }
        var3Lifetime1 = (-200 + pi.field_e) / 150;
        if (200 > pi.field_e) {
          var3Lifetime1 = -1;
          this.field_i = var2 + var3Lifetime1 * 3;
          if ((ko.field_p - 140) % 126 > 111) {
            this.field_i = -1;
          }
          if (this.field_i >= 3) {
            this.field_i = -1;
            if (-1 > this.field_i) {
              this.field_i = -1;
            }
            if (-1 != this.field_i) {
              if (hk.field_c == 1 &&
                HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
                pl.field_u = pl.field_u + 1;
                if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                  return;
                }
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
                pl.field_u = pl.field_u - 1;
                return;
              }
              if (hk.field_c == 2) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
                pl.field_u = pl.field_u - 1;
                if (LegacyOpenGlSpecularEffect.field_h[this.field_i] < 1) {
                  LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
                  pl.field_u = pl.field_u + 1;
                }
              }
            }
            return;
          }
          if (-1 <= this.field_i) {
            if (-1 == this.field_i) {
              return;
            }
            if (hk.field_c == 1 &&
              HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
              pl.field_u = pl.field_u + 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
              pl.field_u = pl.field_u - 1;
              return;
            }
            if (hk.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
            pl.field_u = pl.field_u - 1;
            if (LegacyOpenGlSpecularEffect.field_h[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
            pl.field_u = pl.field_u + 1;
            return;
          }
          this.field_i = -1;
          if (-1 != this.field_i) {
            if (hk.field_c == 1 &&
              HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
              pl.field_u = pl.field_u + 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
              pl.field_u = pl.field_u - 1;
              return;
            }
            if (hk.field_c == 2) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
              pl.field_u = pl.field_u - 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] < 1) {
                LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
                pl.field_u = pl.field_u + 1;
              }
            }
          }
          return;
        }
        if (pi.field_e > 350) {
          var3Lifetime1 = -1;
        }
        this.field_i = var2 + var3Lifetime1 * 3;
        if ((ko.field_p - 140) % 126 > 111) {
          this.field_i = -1;
        }
        if (this.field_i >= 3) {
          this.field_i = -1;
          if (-1 > this.field_i) {
            this.field_i = -1;
          }
          if (-1 != this.field_i) {
            if (hk.field_c == 1 &&
              HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
              pl.field_u = pl.field_u + 1;
              if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
                return;
              }
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
              pl.field_u = pl.field_u - 1;
              return;
            }
            if (hk.field_c != 2) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
            pl.field_u = pl.field_u - 1;
            if (LegacyOpenGlSpecularEffect.field_h[this.field_i] >= 1) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
            pl.field_u = pl.field_u + 1;
            return;
          }
          return;
        }
        if (-1 <= this.field_i) {
          if (-1 == this.field_i) {
            return;
          }
          if (hk.field_c == 1 &&
            HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
            pl.field_u = pl.field_u + 1;
            if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
              return;
            }
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
            pl.field_u = pl.field_u - 1;
            return;
          }
          if (hk.field_c == 2) {
            LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
            pl.field_u = pl.field_u - 1;
            if (LegacyOpenGlSpecularEffect.field_h[this.field_i] < 1) {
              LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
              pl.field_u = pl.field_u + 1;
              return;
            }
          }
          return;
        }
        this.field_i = -1;
        if (-1 == this.field_i) {
          return;
        }
        if (hk.field_c == 1 &&
          HardwareUnlitEffect.d(17079) - pl.field_u > 0) {
          LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] + 1;
          pl.field_u = pl.field_u + 1;
          if (LegacyOpenGlSpecularEffect.field_h[this.field_i] <= 10) {
            return;
          }
          LegacyOpenGlSpecularEffect.field_h[this.field_i] = 10;
          pl.field_u = pl.field_u - 1;
          return;
        }
        if (hk.field_c != 2) {
          return;
        }
        LegacyOpenGlSpecularEffect.field_h[this.field_i] = LegacyOpenGlSpecularEffect.field_h[this.field_i] - 1;
        pl.field_u = pl.field_u - 1;
        if (LegacyOpenGlSpecularEffect.field_h[this.field_i] >= 1) {
          return;
        }
        LegacyOpenGlSpecularEffect.field_h[this.field_i] = 1;
        pl.field_u = pl.field_u + 1;
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
          wo.a(up.field_c, 490, -20 + (-(MouseWheelInput.field_b.width() / 2) + 290), opacity << 24, 3, toolkit, 100 + MouseWheelInput.field_b.width(), -5, 1, true);
          ForceFieldRingEffect.field_t.a(cm.levelCompleteText, 5023231 | opacity << 24, -1, 55, 320, 0);
          hc.field_e.a(cm.levelCompleteText, -1, -1, 55, 320, 0);
          if (guard != -2355) {
            this.field_i = 108;
          }
          qv.field_k.a(100, opacity << 24 | 5023231, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 40, -1, 0, 0, guard - 6432, ps.scoreText.toUpperCase() + " " + il.field_a + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + dp.b(jk.field_a, guard - 21265), (SpriteMask) null, 1, 1);
          uq.field_a.a(100, -1, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 40, -1, 0, 0, -8787, ps.scoreText.toUpperCase() + " " + il.field_a + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + dp.b(jk.field_a, -23620), (SpriteMask) null, 1, 1);
          MessageDialog.field_db.a(200, 5023231 | opacity << 24, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 118, -1, 0, 0, -8787, wh.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.a(200, -1, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 118, -1, 0, 0, guard ^ 11104, wh.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          qv.field_k.a(ic.a(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.d(17079) - pl.field_u)}, (byte) -128).toUpperCase(), opacity << 24 | 5023231, -1, 180, 320, 0);
          uq.field_a.a(ic.a(HotspotTextWidget.pointsRemainingText, new String[]{Integer.toString(HardwareUnlitEffect.d(17079) - pl.field_u)}, (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
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
            wo.a(var8, 170, var7, 0, 1, var6_ref_ha, 131, 185, 1, true);
            if (LegacyOpenGlSpecularEffect.field_h[var5] == 1) {
              stackIn_14_0 = (HardwareUnlitEffect.d(17079) - pl.field_u == 0) ? 1 : 0;
            } else {
              stackIn_14_0 = 0;
            }
            var6 = stackIn_14_0;
            qv.field_k.a(UpgradeStatNames.names[var5].toUpperCase(), opacity << 24 | 5023231, -1, 225, -4 + (var4_int + 55), guard + 2355);
            uq.field_a.a(UpgradeStatNames.names[var5].toUpperCase(), -1, -1, 225, -4 + (var4_int + 55), guard ^ -2355);
            if (var6 != 0) {
              MusicCrossfadeStream.field_q[15 + var5].draw(55 + (var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1)), 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            } else {
              MusicCrossfadeStream.field_q[var5].draw(-(MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1) + 55 + var4_int, 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            }
            qv.field_k.a(Integer.toString(LegacyOpenGlSpecularEffect.field_h[var5]), 5023231 | opacity << 24, -16777216, 320, 55 + var4_int, 0);
            uq.field_a.a(Integer.toString(LegacyOpenGlSpecularEffect.field_h[var5]), -1, -16777216, 320, var4_int + 55, 0);
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

    final static void b(byte param0) {
        int var1 = 0;
        if (32 < kr.field_c) {
          var1 = kr.field_c % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          lf.a(-var1 + kr.field_c, (byte) -58);
          if (param0 < 121) {
            LevelCompleteUpgradeScreen.b((byte) -57);
            return;
          }
          return;
        }
        lf.a(0, (byte) -58);
        if (param0 < 121) {
          LevelCompleteUpgradeScreen.b((byte) -57);
          return;
        }
    }

    static {
        field_k = new int[1];
    }
}
