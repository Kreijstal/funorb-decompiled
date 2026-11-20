/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableModalPanel extends ModalPanel {
    static String[] field_F;
    private int resizeElapsed;
    private int resizeTargetWidth;
    private int resizeStartHeight;
    private int resizeTargetHeight;
    private int resizeStartWidth;
    static String field_D;
    private int resizeDuration;

    void onResizeComplete(int param0) {
        if (param0 != 15435) {
          ResizableModalPanel.k((byte) -22);
        }
    }

    void drawFrame(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = VoidHunters.field_G;
        SoftwareRasterizer2D.fillGradientRectangle(6 + param2, param0 + 35, this.width - 12, -40 + this.height, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (SoftwareRasterizer2D.clipTop <= var8 &&
            var8 < SoftwareRasterizer2D.clipBottom) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.width;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRasterizer2D.pixels[var10 + (var8 * SoftwareRasterizer2D.width + param2)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer2D.pixels[SoftwareRasterizer2D.width * var8 + param2 + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            SoftwareRasterizer2D.drawHorizontalLine(var10 + param2, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer2D.drawHorizontalLine(param2, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer2D.drawHorizontalLine(-6 + (param2 + this.width), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        GameMenuScreen.field_a.draw(-90 + this.width + param2, 10 + param0);
        GetMissionResnetResourceTickTime.a(param1 ^ 1630174240, 35 + param0, SetCountermeasureLauncherAimarc.field_p, 5 + param2, this.width - 10);
        if (param1 != 1630174241) {
          this.updateAndCheckClosed(59);
        }
        GetMissionResnetResourceTickTime.a(1, this.height + param0 - 22, SetPedrosRepairMode.field_q, param2, this.width);
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.height;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer2D.drawHorizontalLine(param2, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer2D.drawHorizontalLine(-6 + this.width + param2, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    ResizableModalPanel(ModalStack param0, int param1, int param2) {
        super(param0, param1, param2);
        this.resizeElapsed = 0;
        this.resizeDuration = 0;
    }

    public static void clearSharedReferences(int param0) {
        field_F = null;
        field_D = null;
        if (param0 != -27545) {
          ResizableModalPanel.clearSharedReferences(28);
        }
    }

    boolean updateAndCheckClosed(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 248) {
          return false;
        }
        if (this.resizeDuration <= 0) {
        } else {
          var2 = this.resizeTargetWidth;
          var3 = this.resizeTargetHeight;
          fieldTemp$0 = this.resizeElapsed + 1;
          this.resizeElapsed = this.resizeElapsed + 1;
          if (this.resizeDuration <= fieldTemp$0) {
            this.resizeDuration = 0;
            this.onResizeComplete(param0 + 15187);
          } else {
            var4 = (-this.resizeElapsed + this.resizeDuration * 2) * this.resizeElapsed;
            var5 = this.resizeDuration * this.resizeDuration;
            var3 = this.resizeStartHeight + (this.resizeTargetHeight - this.resizeStartHeight) * var4 / var5;
            var2 = this.resizeStartWidth + (-this.resizeStartWidth + this.resizeTargetWidth) * var4 / var5;
          }
          this.setCenteredSize(var2, -1860440319, var3);
        }
        return super.updateAndCheckClosed(248);
    }

    final static void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        IsaacPacketBuffer var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var14 = qga.field_b;
          var2 = var14.readUnsignedByte((byte) -87);
          var3 = (fa) (gm.field_H.first(param0 + 38));
          while (var3 != null) {
            if (~var3.field_f != ~var2) {
              var3 = (fa) (gm.field_H.next((byte) 95));
              continue;
            }
            break;
          }
          if (var3 == null) {
            FighterBayWeaponDefinition.l(-117);
            return;
          }
          if (param0 != -38) {
            field_D = (String) null;
          }
          var4 = var14.readUnsignedByte((byte) -118);
          if (var4 != 0) {
            SetAudioRangeCutoff.field_o[0] = IntIndexTable.field_a;
            var5 = var3.field_g;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              SetAudioRangeCutoff.field_o[var6_int] = var14.readString(param0 + 37);
            }
            GetUseCircleFill.a(var5, var4, 0);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              GetShieldsToggleCooldown.a(var14, true);
              if (var6_intLifetime1 != 0) {
                ujb.a(SetCountermeasuresPulseRadius.field_q, GetCountermeasureLauncherFireForce.field_o, SecondaryNodeQueue.field_d, 13336, var6_intLifetime1, QuickChatCategoryLoader.field_b);
              } else {
                ujb.a(SetCountermeasuresPulseRadius.field_q, GetCountermeasureLauncherFireForce.field_o, SecondaryNodeQueue.field_d, 13336, var6_intLifetime1, QuickChatCategoryLoader.field_b);
              }
            }
            SetLaserRandomness.a((byte) -29, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = MissionBuilder.field_e;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = UnlitGpuMaterialEffect.field_f[var9];
              var6[0][var10] = SetAudioRangeCutoff.field_o[var11];
              var18[0][var10 * 4] = GetLaserEnergyUsed.field_o[var11];
              var18[0][var10 * 4 + 1] = SetPhasedEnergyBeamRandomness.field_o[var11];
              var18[0][2 + var10 * 4] = GrowableIntArray.field_d[var11];
              var18[0][3 + 4 * var10] = GetMissionVariablesHudY.field_o[var11];
              if (SetPhysicsCollisionPhantomForceMultiplier.a((byte) -75, SetAudioRangeCutoff.field_o[var11]) &&
                0 == SetPhasedEnergyBeamRandomness.field_o[var11] + GrowableIntArray.field_d[var11] + GetMissionVariablesHudY.field_o[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = UnlitGpuMaterialEffect.field_f[var5 + var9Lifetime1];
              var6[1][var13] = SetAudioRangeCutoff.field_o[var11Lifetime1];
              var18[1][var13 * 4] = GetLaserEnergyUsed.field_o[var11Lifetime1];
              var18[1][1 + var13 * 4] = SetPhasedEnergyBeamRandomness.field_o[var11Lifetime1];
              var18[1][var13 * 4 + 2] = GrowableIntArray.field_d[var11Lifetime1];
              var18[1][3 + var13 * 4] = GetMissionVariablesHudY.field_o[var11Lifetime1];
              if (SetPhysicsCollisionPhantomForceMultiplier.a((byte) -75, SetAudioRangeCutoff.field_o[var11Lifetime1]) &&
                0 == GetMissionVariablesHudY.field_o[var11Lifetime1] + (GrowableIntArray.field_d[var11Lifetime1] + SetPhasedEnergyBeamRandomness.field_o[var11Lifetime1])) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.unlink(-3846);
            return;
          }
          var3.unlink(-3846);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "iw.MA(" + param0 + ')');
        }
    }

    final void animateSize(int param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.setCenteredSize(param1, -1860440319, param2);
          return;
        }
        this.resizeTargetWidth = param1;
        this.resizeTargetHeight = param2;
        this.resizeElapsed = 0;
        if (param0 <= 71) {
          this.animateSize(-109, 54, 31, -22);
        }
        this.resizeDuration = param3;
        this.resizeStartWidth = this.width;
        this.resizeStartHeight = this.height;
    }

    boolean finishAnimationsAndCheckClosed(byte param0) {
        if (param0 != 55) {
          this.resizeTargetHeight = -52;
        }
        this.finishResize(-10331);
        return super.finishAnimationsAndCheckClosed((byte) 55);
    }

    void finishResize(int param0) {
        if (this.resizeDuration <= 0) {
          return;
        }
        this.setCenteredSize(this.resizeTargetWidth, param0 ^ 1860450468, this.resizeTargetHeight);
        this.resizeDuration = 0;
        this.onResizeComplete(param0 + 25766);
        if (param0 != -10331) {
          ResizableModalPanel.k((byte) 34);
        }
    }

    static {
        field_F = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_D = "m";
    }
}
