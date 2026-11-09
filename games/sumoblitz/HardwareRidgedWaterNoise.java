/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HardwareRidgedWaterNoise extends RidgedNoise3D {
    static int field_x;
    static java.applet.Applet field_z;
    static ToolkitSprite[] field_A;
    private byte[] pixels;

    HardwareRidgedWaterNoise() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static void awardDroneDefeatScore(int guard, Drone drone) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (drone.droneType != 0) {
            var2_double = vp.field_d[drone.variant] * (double)LegacyOpenGlFloatPostProcessEffect.droneBaseScores[drone.droneType];
            var2_double = var2_double + (double)(drone.field_G / 50);
            var2_double = var2_double * (double)pd.scoreMultiplier;
            IntrusiveDequeCursor.a((int)var2_double, -1372239541);
            if ((1 << drone.droneType & DisplayModeConfirmationDialog.droneTypeStreakMask) == 0) {
              DisplayModeConfirmationDialog.droneTypeStreakMask = DisplayModeConfirmationDialog.droneTypeStreakMask | 1 << drone.droneType;
              ArenaBackdropPalettes.uniqueDroneTypeStreak = ArenaBackdropPalettes.uniqueDroneTypeStreak + 1;
            } else {
              DisplayModeConfirmationDialog.droneTypeStreakMask = 0;
              ArenaBackdropPalettes.uniqueDroneTypeStreak = 1;
              DisplayModeConfirmationDialog.droneTypeStreakMask = DisplayModeConfirmationDialog.droneTypeStreakMask | 1 << drone.droneType;
            }
            HudMessageSupport.postHudMessage(Integer.toString((int)var2_double), drone.xQ8 >> 8, drone.yQ8 >> 8, 16777215, 28807);
            if (DisplayModeConfirmationDialog.droneTypeStreakMask != 0 &&
              AchievementThresholds.targets[13] == ArenaBackdropPalettes.uniqueDroneTypeStreak) {
              UnderageAccountInfoPanel.b(24753, 242, 13);
            }
            if (7 == OpenGlShaderProgram.levelIndex &&
              0 == AccountServiceResult.waveIndex) {
              if (drone.variant == 5) {
                BigBurstaProgress.bigDefeatBalance = BigBurstaProgress.bigDefeatBalance + 1;
              } else {
                BigBurstaProgress.bigDefeatBalance = BigBurstaProgress.bigDefeatBalance - 1;
              }
              if (BigBurstaProgress.bigDefeatBalance == 4) {
                UnderageAccountInfoPanel.b(24753, 240, 15);
              }
            }
          }
          if (guard != 6510) {
            HardwareRidgedWaterNoise.resetArcadeGameplay(true);
          }
          SoftwareRenderBuffer.a(drone.variant, (byte) 73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ct.A(").append(guard).append(',');
          if (drone == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final byte[] generate(int width, int height, boolean guard, int depth) {
        if (!guard) {
          this.pixels = new byte[2 * (width * height * depth)];
          this.generateVolume(depth, 206, height, width);
          return this.pixels;
        }
        return (byte[]) null;
    }

    final void writeVoxel(byte value, int index, int guard) {
        int var4 = 2 * index;
        int var5 = value & 255;
        int incrementValue$0 = var4;
        var4++;
        this.pixels[incrementValue$0] = (byte)-1;
        this.pixels[var4] = (byte)(3 * var5 >> 5);
        if (guard == 4096) {
          return;
        }
        field_x = 71;
    }

    public static void releaseStatics(byte param0) {
        field_z = null;
        if (param0 >= -15) {
          return;
        }
        field_A = null;
    }

    final static void resetArcadeGameplay(boolean initializeRound) {
        SpriteMask.drones = new Drone[100];
        WidgetStateStyle.initializePlayerDrone(72);
        EmailAvailabilityRequest.powerupPickups = new IntrusiveDeque();
        QuickChatPhraseProvider.arenaPads = new IntrusiveDeque();
        HardwareGraphicsHeap.field_o = new Random();
        ServerDataWriteRequest.droneSlotLimit = 1;
        FadingWidget.score = 0;
        GridWidgetContainer.livesRemaining = 1;
        TextureFormat.elapsedTicks = 0;
        MusicPatch.simulationPaused = false;
        if (initializeRound) {
          ke.beginCurrentWave(false);
          HardwareUnlitEffect.field_e = 1000;
          TextLayout.a(0, 8);
          return;
        }
    }

    static {
    }
}
