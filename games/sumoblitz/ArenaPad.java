/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ArenaPad extends IntrusiveNode {
    private int highlightAlpha;
    int radiusPixels;
    private boolean contactThisTick;
    int padType;
    static String[] waitingForTextTranslations;
    static String waitingForLevelsText;
    private int orientation;
    private int acceleratorTargetXQ8;
    int yQ8;
    private int acceleratorTargetYQ8;
    private boolean exploding;
    int field_s;
    private int teleportCooldownTicks;
    private int explosionTicksRemaining;
    private int triggerCooldownTicks;
    private IntrusiveDeque effects;
    int xQ8;
    private int ageTicks;

    public static void releaseStatics(int param0) {
        try {
          waitingForLevelsText = null;
          waitingForTextTranslations = null;
          if (param0 != 1432625512) {
            ArenaPad.a((PacketBuffer) null, (byte) -50);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nm.B(" + param0 + ')');
        }
    }

    private final void bounceDrone(Drone drone, int guard) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        int var7Lifetime1;
        try {
          var3_int = drone.radiusQ8 + (this.radiusPixels << 8);
          var4 = drone.xQ8 - this.xQ8;
          var5 = drone.yQ8 - this.yQ8;
          var6 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var5 * (float)var5 + (float)var4 * (float)var4))));
          if (var3_int > var6) {
            var7 = var4 * (-var6 + var3_int) / var6;
            drone.xQ8 = drone.xQ8 + (var7 << 1);
            var8_int = var5 * (var3_int - var6) / var6;
            drone.yQ8 = drone.yQ8 + (var8_int << 1);
          }
          var4 = (var4 << 8) / var6;
          var5 = (var5 << 8) / var6;
          drone.field_d = 0;
          if (guard >= -61) {
            this.xQ8 = -35;
          }
          var7Lifetime1 = -(var4 * drone.velocityYQ8) + drone.velocityXQ8 * var5 >> 8;
          var8 = 2.0;
          if (this.exploding) {
            var8 = 5.0;
          }
          if (6 == this.padType) {
            var8 = 0.5;
          }
          var10 = (int)(var8 * 800.0) << 8;
          drone.velocityXQ8 = var5 * var7Lifetime1 + var10 * var4 / drone.mass >> 8;
          drone.velocityYQ8 = var5 * var10 / drone.mass - var4 * var7Lifetime1 >> 8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("nm.A(");
          if (drone == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    final void applyToDrone(Drone drone, int guard) {
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_165_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        IntrusiveDeque var5 = null;
        IntrusiveDequeCursor var6 = null;
        int var7 = 0;
        ArenaPad var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var9Lifetime1;
        int var3_intLifetime2;
        int var4Lifetime2;
        var17 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (drone.isBlastActive(57)) {
            return;
          }
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var9 = this.padType;
          if ((var9 != 7 ||
            var17 != 0) &&
            (decompiledFrameRemainder0 = (6 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder1 = (var9 != 0)) &&
            (decompiledFrameRemainder2 = (var9 != 1 ||
            var17 != 0)) &&
            (decompiledFrameRemainder3 = (2 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder4 = (3 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder5 = (var9 != 4)) &&
            (decompiledFrameRemainder7 = (var9 == 5))) {
            decompiledFrameRemainder6 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (!this.exploding &&
              0 >= this.triggerCooldownTicks) {
              this.explosionTicksRemaining = 12;
              this.triggerCooldownTicks = 200;
              this.exploding = true;
              gn.a(3, true);
              ts.a(this.xQ8, this.effects, -16240, 25, 65535, this.yQ8);
            }
            decompiledFrameRemainder7 = !(this.explosionTicksRemaining <= 0);
            if (decompiledFrameRemainder7) {
              this.bounceDrone(drone, guard ^ -16777041);
              decompiledFrameRemainder7 = (var17 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (this.triggerCooldownTicks > 0) {
              this.bounceDrone(drone, guard - 16777029);
              decompiledFrameRemainder7 = (var17 != 0);
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder7 = (!(drone.isBlastActive(guard ^ 16776998)) ||
              var17 != 0))) {
              if (drone.variant == 1 &&
                drone.variantCooldownTicks == 0) {
                var9Lifetime1 = -drone.xQ8 + this.xQ8;
                var10 = this.yQ8 - drone.yQ8;
                var11 = Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var10 * var10));
                var13 = Math.asin((double)var9Lifetime1 / var11);
                var15 = var13 + 3.141592653589793;
                if (!(Math.abs(-drone.facingRadians + var15) < 1.5707963267948966)) {
                  SecondaryNodeQueue.a(drone, (byte) 113);
                  this.triggerCooldownTicks = 200;
                  if (12 == OpenGlShaderProgram.levelIndex) {
                    ValidationMessageWidget.field_P = true;
                  }
                  ts.a(this.xQ8, this.effects, -16240, 25, 65535, this.yQ8);
                  decompiledFrameRemainder7 = (var17 != 0);
                }
                if (decompiledFrameRemainder7) {
                  if (drone.velocityYQ8 < 0 &&
                    -this.yQ8 + drone.yQ8 > 0 ||
                    !(0 >= drone.velocityYQ8) &&
                    !(drone.yQ8 - this.yQ8 >= 0)) {
                    drone.velocityYQ8 = drone.velocityYQ8 * -2;
                  }
                  if (drone.velocityXQ8 < 0 &&
                    0 < -this.xQ8 + drone.xQ8 ||
                    !(0 >= drone.velocityXQ8) &&
                    !(-this.xQ8 + drone.xQ8 >= 0)) {
                    drone.velocityXQ8 = drone.velocityXQ8 * -2;
                  }
                  drone.onVariantContact((byte) -55);
                  this.triggerCooldownTicks = 200;
                  decompiledFrameRemainder7 = (var17 != 0);
                }
              }
              if (decompiledFrameRemainder7) {
                SecondaryNodeQueue.a(drone, (byte) 113);
                if (OpenGlShaderProgram.levelIndex == 12) {
                  ValidationMessageWidget.field_P = true;
                }
                this.triggerCooldownTicks = 200;
                ts.a(this.xQ8, this.effects, -16240, 25, 65535, this.yQ8);
                decompiledFrameRemainder7 = (var17 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var3_int = -drone.xQ8 + this.acceleratorTargetXQ8;
            var4 = -drone.yQ8 + this.acceleratorTargetYQ8;
            drone.velocityXQ8 = (int)((double)drone.velocityXQ8 + 0.00016 * (double)RasterBuffer.a(-63, var3_int) * Math.pow((double)var3_int, 2.0) / (double)drone.mass);
            drone.velocityYQ8 = (int)((double)drone.velocityYQ8 + (double)RasterBuffer.a(-69, var4) * 0.00016 * Math.pow((double)var4, 2.0) / (double)drone.mass);
            drone.steeringSuppressed = true;
            LegacyOpenGlDisplayLists.a(-111, ExpandingRingEffect.nextRandomInt(4, HardwareGraphicsHeap.field_o, (byte) -96) + 6, false);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            drone.onIce = true;
            this.contactThisTick = true;
            LegacyOpenGlDisplayLists.a(-112, 1, false);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var5 = is.arenaPads;
            var7 = 0;
            var6 = new IntrusiveDequeCursor(var5);
            var8 = (ArenaPad) (var6.first((byte) -80));
            while (true) {
              if (null != var8) {
                stackIn_145_0 = var8.padType;
                stackIn_145_1 = 2;
                if (var17 == 0) {
                  if (stackIn_145_0 == stackIn_145_1 &&
                    0 >= this.teleportCooldownTicks &&
                    ~var8.field_s != ~this.field_s &&
                    0 == ExpandingRingEffect.nextRandomInt(6, HardwareGraphicsHeap.field_o, (byte) -96)) {
                    drone.xQ8 = var8.xQ8;
                    drone.yQ8 = var8.yQ8;
                    var8.teleportCooldownTicks = 60;
                    var7 = 1;
                  }
                  var8 = (ArenaPad) (var6.next(guard ^ 16776960));
                  continue;
                }
              } else {
                if (var7 == 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_145_0 = 5;
                stackIn_145_1 = 1;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              gn.a(stackIn_145_0, stackIn_145_1 != 0);
              ts.a(this.xQ8, this.effects, -16240, 10, 16776960, this.yQ8);
              decompiledFrameRemainder7 = (var17 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameCompleted0)) {
            this.bounceDrone(drone, -68);
            gn.a(13, true);
            decompiledFrameRemainder7 = (drone.droneType == 0);
            if (decompiledFrameRemainder7) {
              PowerupPickup.field_v = PowerupPickup.field_v + 1;
              decompiledFrameRemainder7 = !(MessageDialog.field_ab > 0);
              if (decompiledFrameRemainder7) {
                MessageDialog.field_ab = 250;
                decompiledFrameRemainder7 = (var17 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameCompleted0)) {
            var3_intLifetime2 = this.xQ8 - drone.xQ8;
            var4Lifetime2 = -drone.yQ8 + this.yQ8;
            drone.velocityXQ8 = (int)((double)drone.velocityXQ8 + (double)RasterBuffer.a(guard ^ -16777002, var3_intLifetime2) * 0.000035 * Math.pow((double)var3_intLifetime2, 2.0) / (double)drone.mass);
            drone.velocityYQ8 = (int)((double)drone.velocityYQ8 + (double)RasterBuffer.a(-115, var4Lifetime2) * 0.000035 * Math.pow((double)var4Lifetime2, 2.0) / (double)drone.mass);
            this.contactThisTick = true;
            LegacyOpenGlDisplayLists.a(-119, 1, true);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameCompleted0)) {
            var4Lifetime1 = this.yQ8 - drone.yQ8;
            var3_intLifetime1 = -drone.xQ8 + this.xQ8;
            drone.velocityXQ8 = (int)((double)drone.velocityXQ8 - (double)RasterBuffer.a(-56, var3_intLifetime1) * 0.000035 * Math.pow((double)var3_intLifetime1, 2.0) / (double)drone.mass);
            drone.velocityYQ8 = (int)((double)drone.velocityYQ8 - 0.000035 * (double)RasterBuffer.a(-52, var4Lifetime1) * Math.pow((double)var4Lifetime1, 2.0) / (double)drone.mass);
            this.contactThisTick = true;
            LegacyOpenGlDisplayLists.a(-123, 2, true);
          }
          if (guard != 16776960) {
            this.triggerCooldownTicks = 113;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_164_0 = var3;
          stackIn_164_1 = new StringBuilder().append("nm.D(");
          if (drone == null) {
            stackIn_165_2 = "null";
          } else {
            stackIn_165_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_164_0), ((StringBuilder) (Object) stackIn_164_1).append(stackIn_165_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean overlapsDrone(Drone drone, int guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 2145812808) {
            this.bounceDrone((Drone) null, 12);
          }
          var3_int = drone.radiusQ8 + (this.radiusPixels << 8);
          stackIn_4_0 = wn.a(drone.yQ8, var3_int, -114, this.xQ8, drone.xQ8, this.yQ8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nm.C(");
          if (drone == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        TimedSceneEffect var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3_int = this.padType;
          if ((var3_int != 6 ||
            var4 != 0) &&
            (decompiledFrameRemainder0 = (var3_int != 7)) &&
            (decompiledFrameRemainder1 = (var3_int != 0 ||
            var4 != 0)) &&
            (decompiledFrameRemainder2 = (var3_int != 1 ||
            var4 != 0)) &&
            (decompiledFrameRemainder3 = (var3_int != 2)) &&
            (decompiledFrameRemainder4 = (var3_int != 3)) &&
            (decompiledFrameRemainder5 = (var3_int != 4 ||
            var4 != 0)) &&
            (decompiledFrameRemainder7 = (5 == var3_int))) {
            decompiledFrameRemainder6 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            o.field_b[0].draw((this.xQ8 >> 8) - (o.field_b[0].width() >> 1), (this.yQ8 >> 8) - (o.field_b[0].height() >> 1));
            decompiledFrameRemainder7 = !(this.triggerCooldownTicks > 5);
            if (decompiledFrameRemainder7) {
              o.field_b[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 4096, (this.ageTicks << 10) % 65536, 1, 0, 2);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            OpenGlTexture3D.field_p[0].draw((this.xQ8 >> 8) - (OpenGlTexture3D.field_p[0].width() >> 1), (this.yQ8 >> 8) - (OpenGlTexture3D.field_p[0].height() >> 1));
            if (this.triggerCooldownTicks <= 5 &&
              (this.ageTicks >> 5) % 2 == 1) {
              OpenGlTexture3D.field_p[1].draw((this.xQ8 >> 8) - (OpenGlTexture3D.field_p[1].width() >> 1), (this.yQ8 >> 8) - (OpenGlTexture3D.field_p[1].height() >> 1), 1, 0, 2);
            }
            decompiledFrameRemainder7 = (this.exploding);
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder7 = (ul.field_f == 0))) {
              kw.field_a.drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)((double)this.radiusPixels / 28.0 * 3072.0), 0, 1, 0, 2);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            ArchiveProvider.field_a[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, this.orientation);
            ArchiveProvider.field_a[(this.ageTicks >> 5) % ArchiveProvider.field_a.length].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, this.orientation, 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            uc.field_e[0].draw((this.xQ8 >> 8) - (uc.field_e[0].width() >> 1), (this.yQ8 >> 8) - (uc.field_e[0].height() >> 1));
            uc.field_e[1].draw((this.xQ8 >> 8) - (uc.field_e[1].width() >> 1), (this.yQ8 >> 8) - (uc.field_e[1].height() >> 1), 1, 0, 2);
            DirectByteArrayStorage.field_e.draw((this.xQ8 >> 8) - (DirectByteArrayStorage.field_e.width() >> 1), (this.yQ8 >> 8) - (DirectByteArrayStorage.field_e.height() >> 1), 0, 16777215 + (this.highlightAlpha << 24), 1);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            uj.field_b[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 4096, 0);
            uj.field_b[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 4096, (this.ageTicks << 10) % 65536, 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            kk.field_f.draw((this.xQ8 >> 8) - (kk.field_f.width() >> 1), (this.yQ8 >> 8) - (kk.field_f.height() >> 1), 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            LegacyOpenGlSpriteTexture.field_r[0].draw((this.xQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[0].width() >> 1), (this.yQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[0].height() >> 1));
            LegacyOpenGlSpriteTexture.field_r[1].draw((this.xQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[1].width() >> 1), (this.yQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[1].height() >> 1), 0, -15687169, 1);
            decompiledFrameRemainder7 = (ul.field_f == 1);
            if (decompiledFrameRemainder7) {
              vl.field_c.draw((this.xQ8 >> 8) - (vl.field_c.width() >> 1), (this.yQ8 >> 8) - (vl.field_c.height() >> 1), 0, -15687169, 1);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder7) {
            LegacyOpenGlSpriteTexture.field_r[0].draw((this.xQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[0].width() >> 1), (this.yQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[0].height() >> 1));
            LegacyOpenGlSpriteTexture.field_r[1].draw((this.xQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[1].width() >> 1), (this.yQ8 >> 8) - (LegacyOpenGlSpriteTexture.field_r[1].height() >> 1), 0, -31744, 1);
            if (1 == ul.field_f) {
              vl.field_c.draw((this.xQ8 >> 8) - (vl.field_c.width() >> 1), (this.yQ8 >> 8) - (vl.field_c.height() >> 1), 0, -31744, 1);
            }
          }
          if (guard != -15687169) {
            this.overlapsDrone((Drone) null, -20);
          }
          var3 = (TimedSceneEffect) (this.effects.first(67));
          while (var3 != null) {
            var3.render(toolkit, -128);
            var3 = (TimedSceneEffect) (this.effects.next((byte) 18));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_97_0 = var3_ref;
          stackIn_97_1 = new StringBuilder().append("nm.H(");
          if (toolkit == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(guard).append(')').toString());
        }
    }

    final void update(int param0) {
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        TimedSceneEffect var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 1048149637) {
            this.highlightAlpha = -49;
          }
          if (!this.contactThisTick) {
            if (this.highlightAlpha > 72) {
              this.highlightAlpha = this.highlightAlpha - 2;
              if (var3 != 0 &&
                200 > this.highlightAlpha) {
                this.highlightAlpha = this.highlightAlpha + 2;
              }
            }
          } else {
            if (200 > this.highlightAlpha) {
              this.highlightAlpha = this.highlightAlpha + 2;
            }
          }
          if (this.exploding) {
            this.explosionTicksRemaining = this.explosionTicksRemaining - 1;
            this.radiusPixels = this.radiusPixels + 2;
            if (this.explosionTicksRemaining == 0) {
              this.radiusPixels = 20;
              this.exploding = false;
            }
          }
          if (this.teleportCooldownTicks > 0) {
            this.teleportCooldownTicks = this.teleportCooldownTicks - 1;
          }
          if (this.triggerCooldownTicks > 0) {
            this.triggerCooldownTicks = this.triggerCooldownTicks - 1;
          }
          var2 = (TimedSceneEffect) (this.effects.first(74));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackOut_32_0 = var2.updateAndIsExpired(-2567);
            stackIn_40_0 = stackOut_32_0 ? 1 : 0;
            stackIn_33_0 = stackOut_32_0;
            if (var3 == 0) {
              if (stackIn_33_0) {
                var2.unlink(false);
              }
              var2 = (TimedSceneEffect) (this.effects.next((byte) 18));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.ageTicks = this.ageTicks + 1;
            this.contactThisTick = false;
            stackIn_40_0 = ~this.padType;
          }
          if (stackIn_40_0 == -6 &&
            this.ageTicks % 50 == 0 &&
            ul.field_f == 0) {
            this.effects.addLast((IntrusiveNode) (new ForceFieldRingEffect(this.xQ8 >> 8, this.yQ8 >> 8, 16745472, true)), (byte) 39);
          }
          if (this.padType == 4 &&
            0 == this.ageTicks % 50 &&
            ul.field_f == 0) {
            this.effects.addLast((IntrusiveNode) (new ForceFieldRingEffect(this.xQ8 >> 8, this.yQ8 >> 8, 1090047, false)), (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "nm.E(" + param0 + ')');
        }
    }

    final static void a(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param1 < 30) {
            ArenaPad.releaseStatics(-34);
          }
          DisplayModeConfirmationDialog.field_U = param0.readUnsignedShort(255) << 5;
          var2_int = param0.readUnsignedByte(-31302);
          DisplayModeConfirmationDialog.field_U = DisplayModeConfirmationDialog.field_U + (var2_int >> 3);
          SoftLruCache.field_f = 1835008 & var2_int << 18;
          SoftLruCache.field_f = SoftLruCache.field_f + (param0.readUnsignedShort(255) << 2);
          var2_intLifetime1 = param0.readUnsignedByte(-31302);
          SoftLruCache.field_f = SoftLruCache.field_f + (var2_intLifetime1 >> 6);
          ReassignUpgradesScreen.field_l = (63 & var2_intLifetime1) << 15;
          ReassignUpgradesScreen.field_l = ReassignUpgradesScreen.field_l + (param0.readUnsignedByte(-31302) << 7);
          var2_intLifetime2 = param0.readUnsignedByte(-31302);
          LegacyWaterTextureResources.field_d = 65536 & var2_intLifetime2 << 16;
          ReassignUpgradesScreen.field_l = ReassignUpgradesScreen.field_l + (var2_intLifetime2 >> 1);
          LegacyWaterTextureResources.field_d = LegacyWaterTextureResources.field_d + param0.readUnsignedShort(255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nm.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void initializePad(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = this.padType;
          switch ((var3 == 0
            || var2_int == 0
            || var2_int == 1
            || var2_int == 2
            || var2_int == 3
            || var2_int == 5
            || var2_int == 6
            || var2_int == 7
            ) ? var2_int : -1) {
            case 0:
              this.radiusPixels = 20;
              this.computeAcceleratorTarget((byte) 47);
              if (var3 == 0) {
                break;
              }
            case 1:
              this.radiusPixels = 55;
              if (var3 == 0) {
                break;
              }
            case 2:
              this.radiusPixels = 20;
              if (var3 == 0) {
                break;
              }
            case 3:
              this.radiusPixels = 20;
              if (var3 == 0) {
                break;
              }
            case 4:
              this.radiusPixels = 75;
              if (var3 == 0) {
                break;
              }
            case 5:
              this.radiusPixels = 75;
              if (var3 == 0) {
                break;
              }
            case 6:
              this.radiusPixels = 15;
              if (var3 == 0) {
                break;
              }
            case 7:
              this.radiusPixels = 20;
            default:
              break;
          }
          if (param0 != -115) {
            this.update(89);
          }
          this.effects = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "nm.F(" + param0 + ')');
        }
    }

    private final void computeAcceleratorTarget(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        double var7 = 0.0;
        try {
          var2_double = -1.5707963267948966 + (double)this.orientation / 65536.0 * 6.283185307179586;
          int var6 = 20 % ((param0 + 24) / 41);
          var4 = 19200.0 * Math.sin(-var2_double);
          var7 = 19200.0 * Math.cos(-var2_double);
          this.acceleratorTargetYQ8 = (int)((double)this.yQ8 + var4);
          this.acceleratorTargetXQ8 = (int)(var7 + (double)this.xQ8);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nm.I(" + param0 + ')');
        }
    }

    ArenaPad(int padType, int xPixels, int yPixels, int orientation) {
        this.highlightAlpha = 72;
        try {
          this.yQ8 = yPixels << 8;
          this.xQ8 = xPixels << 8;
          this.orientation = orientation;
          this.padType = padType;
          this.initializePad((byte) -115);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nm.<init>(" + padType + ',' + xPixels + ',' + yPixels + ',' + orientation + ')');
        }
    }

    static {
        waitingForLevelsText = "Waiting for levels";
        waitingForTextTranslations = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
