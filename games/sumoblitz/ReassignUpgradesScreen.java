/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReassignUpgradesScreen extends MenuScreen {
    static int field_l;
    static long field_j;
    private int field_k;
    static int[] field_i;

    public static void releaseStatics(byte param0) {
        if (param0 < 31) {
          return;
        }
        field_i = null;
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
          wo.a(up.field_c, 490, -20 - MouseWheelInput.field_b.width() / 2 + 290, opacity << 24, 3, toolkit, MouseWheelInput.field_b.width() + 100, -5, 1, true);
          ForceFieldRingEffect.field_t.a(bw.reassignPowerupsText, 5023231 | opacity << 24, -1, 60, 320, 0);
          hc.field_e.a(bw.reassignPowerupsText, -1, -1, 60, 320, 0);
          MessageDialog.field_db.a(200, 5023231 | opacity << 24, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 75, -1, 0, 0, guard - 6432, wh.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.a(200, -1, 0, 300, 170, (int[]) null, (ToolkitSprite[]) null, 75, -1, 0, 0, guard ^ 11104, wh.clickToAssignPointsText, (SpriteMask) null, 1, 0);
          qv.field_k.a(ic.a(ar.pointsRemainingText, new String[]{Integer.toString(oc.d(guard ^ -19334) - ok.field_k)}, (byte) -128).toUpperCase(), 5023231 | opacity << 24, -1, 180, 320, 0);
          uq.field_a.a(ic.a(ar.pointsRemainingText, new String[]{Integer.toString(oc.d(guard + 19434) - ok.field_k)}, (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
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
            wo.a(var8, 170, var7, 0, 1, var6_ref_ha, 131, 185, 1, true);
            if (c.field_u[var5] == 1) {
              stackIn_12_0 = (oc.d(17079) - ok.field_k == 0) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var6 = stackIn_12_0;
            qv.field_k.a(UpgradeStatNames.names[var5].toUpperCase(), opacity << 24 | 5023231, -1, 225, var4_int + 51, 0);
            uq.field_a.a(UpgradeStatNames.names[var5].toUpperCase(), -1, -1, 225, 55 + (var4_int - 4), guard ^ -2355);
            if (var6 == 0) {
              MusicCrossfadeStream.field_q[var5].draw(55 + var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1), 200 + (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1), 1, 0, 2);
            } else {
              MusicCrossfadeStream.field_q[15 + var5].draw(55 + var4_int - (MusicCrossfadeStream.field_q[var5].paddedWidth() >> 1), (MusicCrossfadeStream.field_q[var5].paddedHeight() >> 1) + 200, 1, 0, 2);
            }
            qv.field_k.a(Integer.toString(c.field_u[var5]), 5023231 | opacity << 24, -16777216, 320, 55 + var4_int, 0);
            uq.field_a.a(Integer.toString(c.field_u[var5]), -1, -16777216, 320, 55 + var4_int, guard ^ -2355);
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
        var2 = (ko.field_p - 140) / 126;
        if (ko.field_p < 140) {
          var2 = -1;
          var3 = (-200 + pi.field_e) / 150;
          if (!(pi.field_e >= 200) ||
            !(pi.field_e <= 350)) {
            var3 = -1;
          }
          this.field_k = var3 * 3 + var2;
          if ((-140 + ko.field_p) % 126 > 111) {
            this.field_k = -1;
          }
          if (this.field_k >= 3) {
            this.field_k = -1;
            if (this.field_k < -1) {
              this.field_k = -1;
            }
            if (this.field_k > -1) {
              if (1 == hk.field_c &&
                0 < oc.d(param0 ^ -2765) - ok.field_k) {
                c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
                ok.field_k = ok.field_k + 1;
                if (c.field_u[this.field_k] <= 10) {
                  return;
                }
                c.field_u[this.field_k] = 10;
                ok.field_k = ok.field_k - 1;
                return;
              }
              if (2 == hk.field_c) {
                c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
                ok.field_k = ok.field_k - 1;
                if (c.field_u[this.field_k] < 1) {
                  c.field_u[this.field_k] = 1;
                  ok.field_k = ok.field_k + 1;
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
          if (1 != hk.field_c) {
            if (2 != hk.field_c) {
              return;
            }
            c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
            ok.field_k = ok.field_k - 1;
            if (c.field_u[this.field_k] >= 1) {
              return;
            }
            c.field_u[this.field_k] = 1;
            ok.field_k = ok.field_k + 1;
            return;
          }
          if (0 < oc.d(param0 ^ -2765) - ok.field_k) {
            c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
            ok.field_k = ok.field_k + 1;
            if (c.field_u[this.field_k] <= 10) {
              return;
            }
            c.field_u[this.field_k] = 10;
            ok.field_k = ok.field_k - 1;
            return;
          }
          if (2 == hk.field_c) {
            c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
            ok.field_k = ok.field_k - 1;
            if (c.field_u[this.field_k] < 1) {
              c.field_u[this.field_k] = 1;
              ok.field_k = ok.field_k + 1;
            }
          }
          return;
        }
        if (520 < ko.field_p) {
          var2 = -1;
        }
        var3Lifetime1 = (-200 + pi.field_e) / 150;
        if (pi.field_e < 200) {
          var3Lifetime1 = -1;
          this.field_k = var3Lifetime1 * 3 + var2;
          if ((-140 + ko.field_p) % 126 > 111) {
            this.field_k = -1;
          }
          if (this.field_k >= 3) {
            this.field_k = -1;
            if (this.field_k < -1) {
              this.field_k = -1;
            }
            if (this.field_k > -1) {
              if (1 == hk.field_c &&
                0 < oc.d(param0 ^ -2765) - ok.field_k) {
                c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
                ok.field_k = ok.field_k + 1;
                if (c.field_u[this.field_k] <= 10) {
                  return;
                }
                c.field_u[this.field_k] = 10;
                ok.field_k = ok.field_k - 1;
                return;
              }
              if (2 == hk.field_c) {
                c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
                ok.field_k = ok.field_k - 1;
                if (c.field_u[this.field_k] < 1) {
                  c.field_u[this.field_k] = 1;
                  ok.field_k = ok.field_k + 1;
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
          if (1 != hk.field_c) {
            if (2 != hk.field_c) {
              return;
            }
            c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
            ok.field_k = ok.field_k - 1;
            if (c.field_u[this.field_k] >= 1) {
              return;
            }
            c.field_u[this.field_k] = 1;
            ok.field_k = ok.field_k + 1;
            return;
          }
          if (0 < oc.d(param0 ^ -2765) - ok.field_k) {
            c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
            ok.field_k = ok.field_k + 1;
            if (c.field_u[this.field_k] <= 10) {
              return;
            }
            c.field_u[this.field_k] = 10;
            ok.field_k = ok.field_k - 1;
            return;
          }
          if (2 == hk.field_c) {
            c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
            ok.field_k = ok.field_k - 1;
            if (c.field_u[this.field_k] < 1) {
              c.field_u[this.field_k] = 1;
              ok.field_k = ok.field_k + 1;
            }
          }
          return;
        }
        if (pi.field_e > 350) {
          var3Lifetime1 = -1;
        }
        this.field_k = var3Lifetime1 * 3 + var2;
        if ((-140 + ko.field_p) % 126 > 111) {
          this.field_k = -1;
        }
        if (this.field_k < 3) {
          if (this.field_k < -1) {
            this.field_k = -1;
          }
          if (this.field_k <= -1) {
            return;
          }
          if (1 == hk.field_c &&
            0 < oc.d(param0 ^ -2765) - ok.field_k) {
            c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
            ok.field_k = ok.field_k + 1;
            if (c.field_u[this.field_k] <= 10) {
              return;
            }
            c.field_u[this.field_k] = 10;
            ok.field_k = ok.field_k - 1;
            return;
          }
          if (2 != hk.field_c) {
            return;
          }
          c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
          ok.field_k = ok.field_k - 1;
          if (c.field_u[this.field_k] >= 1) {
            return;
          }
          c.field_u[this.field_k] = 1;
          ok.field_k = ok.field_k + 1;
          return;
        }
        this.field_k = -1;
        if (this.field_k < -1) {
          this.field_k = -1;
        }
        if (this.field_k <= -1) {
          return;
        }
        if (1 != hk.field_c) {
          if (2 != hk.field_c) {
            return;
          }
          c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
          ok.field_k = ok.field_k - 1;
          if (c.field_u[this.field_k] >= 1) {
            return;
          }
          c.field_u[this.field_k] = 1;
          ok.field_k = ok.field_k + 1;
          return;
        }
        if (0 < oc.d(param0 ^ -2765) - ok.field_k) {
          c.field_u[this.field_k] = c.field_u[this.field_k] + 1;
          ok.field_k = ok.field_k + 1;
          if (c.field_u[this.field_k] <= 10) {
            return;
          }
          c.field_u[this.field_k] = 10;
          ok.field_k = ok.field_k - 1;
          return;
        }
        if (2 == hk.field_c) {
          c.field_u[this.field_k] = c.field_u[this.field_k] - 1;
          ok.field_k = ok.field_k - 1;
          if (c.field_u[this.field_k] < 1) {
            c.field_u[this.field_k] = 1;
            ok.field_k = ok.field_k + 1;
          }
        }
        return;
    }

    static {
    }
}
