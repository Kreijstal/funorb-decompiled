/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PowerupPickup extends IntrusiveNode {
    static int field_t;
    int effectIndex;
    private int velocityXQ8;
    private int xQ8;
    private int ageTicks;
    static int[] field_k;
    int kind;
    int remainingTicks;
    static String field_s;
    private int velocityYQ8;
    static int field_v;
    private int radiusQ8;
    private int yQ8;
    private IntrusiveDeque effects;

    final void render(int guard, GraphicsToolkit toolkit) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        TimedSceneEffect var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if ((this.ageTicks % 10 <= 5 ||
            this.remainingTicks >= 200) &&
            !this.isMoving(0)) {
            if (0 == this.kind) {
              if (2 == this.effectIndex) {
                MusicCrossfadeStream.field_q[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
              } else if (this.effectIndex == 1) {
                MusicCrossfadeStream.field_q[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
              } else if (this.effectIndex == 0) {
                MusicCrossfadeStream.field_q[2].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
              }
            } else if (this.effectIndex == 2) {
              MusicCrossfadeStream.field_q[7].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            } else if (this.effectIndex == 1) {
              MusicCrossfadeStream.field_q[6].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            } else if (this.effectIndex == 0) {
              MusicCrossfadeStream.field_q[5].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            } else if (this.effectIndex == 3) {
              MusicCrossfadeStream.field_q[8].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            } else if (this.effectIndex == 4) {
              MusicCrossfadeStream.field_q[9].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            }
          } else {
            if (2 == this.effectIndex) {
              MusicCrossfadeStream.field_q[12].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
            } else {
              if (this.effectIndex != 1) {
                if (0 == this.effectIndex) {
                  MusicCrossfadeStream.field_q[10].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
                } else {
                  if (3 != this.effectIndex) {
                    if (this.effectIndex == 4) {
                      MusicCrossfadeStream.field_q[14].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
                    }
                  } else {
                    MusicCrossfadeStream.field_q[13].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
                  }
                }
              } else {
                MusicCrossfadeStream.field_q[11].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), 2048, 0, 1, 0, 2);
              }
            }
          }
          var5 = (TimedSceneEffect) (this.effects.first(126));
          if (guard > -53) {
            this.isMoving(-26);
          }
          while (var5 != null) {
            var5.render(toolkit, -127);
            var5 = (TimedSceneEffect) (this.effects.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("tl.A(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final int yQ8(int param0) {
        int var2 = 87 % ((param0 - 7) / 41);
        return this.yQ8;
    }

    private final int powerupTint(byte param0) {
        int var2;
        int var3;
        GraphicsToolkit var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 28) {
          var4 = (GraphicsToolkit) null;
          this.render(77, (GraphicsToolkit) null);
        }
        var2 = -1414832128;
        if (this.effectIndex == 0) {
          var2 = -1442815829;
        } else {
          if (this.effectIndex != 1) {
            if (3 == this.effectIndex) {
              var2 = -1426128896;
            } else {
              if (4 == this.effectIndex) {
                var2 = -1442796545;
              }
            }
          } else {
            var2 = -1436548949;
          }
        }
        return var2;
    }

    final boolean isMoving(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 0) {
          this.ageTicks = -46;
        }
        stackIn_7_0 = (0 != this.velocityXQ8) || (0 != this.velocityYQ8);
        return stackIn_7_0;
    }

    final int xQ8(byte param0) {
        int discarded$0 = 0;
        if (param0 != 70) {
          discarded$0 = this.powerupTint((byte) -57);
        }
        return this.xQ8;
    }

    final void update(int param0) {
        int var3;
        TimedSceneEffect var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        this.yQ8 = this.yQ8 + this.velocityYQ8;
        this.xQ8 = this.xQ8 + this.velocityXQ8;
        if (this.overlapsBouncerOrSpikePad(-114)) {
          if (this.velocityXQ8 == 0) {
            this.velocityXQ8 = 256;
          }
          if (0 == this.velocityYQ8) {
            this.velocityYQ8 = 256;
          }
        } else {
          this.velocityYQ8 = 251 * this.velocityYQ8 / 256;
          this.velocityXQ8 = 251 * this.velocityXQ8 / 256;
        }
        if (this.xQ8 <= 13312 &&
          this.velocityXQ8 <= 0) {
          if (this.velocityXQ8 == 0) {
            this.velocityXQ8 = 256;
          }
          this.velocityXQ8 = -this.velocityXQ8;
        } else {
          if (this.xQ8 > -52 + ArchiveCatalog.field_c << 8 &&
            this.velocityXQ8 >= 0) {
            if (0 == this.velocityXQ8) {
              this.velocityXQ8 = -256;
            }
            this.velocityXQ8 = -this.velocityXQ8;
          }
        }
        if (this.yQ8 <= 13312 &&
          this.velocityYQ8 <= 0) {
          if (this.velocityYQ8 == 0) {
            this.velocityYQ8 = 256;
          }
          this.velocityYQ8 = -this.velocityYQ8;
        } else {
          if (this.yQ8 > rl.field_k - 52 << 8 &&
            0 <= this.velocityYQ8) {
            if (this.velocityYQ8 == 0) {
              this.velocityYQ8 = 256;
            }
            this.velocityYQ8 = -this.velocityYQ8;
          }
        }
        if (1 == this.kind && (this.velocityXQ8 != 0 ||
          this.velocityYQ8 != 0)) {
          if (0 == this.ageTicks % 2) {
            this.effects.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + (this.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, -1024 + (this.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, this.powerupTint((byte) 105), 1 + this.effectIndex, true)), (byte) 39);
          } else {
            this.effects.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + (this.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, this.yQ8 - (-ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) + 1024) >> 8, this.powerupTint((byte) 65), 1 + this.effectIndex, false)), (byte) 39);
          }
        }
        if (param0 != -31255) {
          return;
        }
        var4 = (TimedSceneEffect) (this.effects.first(param0 ^ -31326));
        while (var4 != null) {
          if (var4.updateAndIsExpired(-2567)) {
            var4.unlink(false);
          }
          var4 = (TimedSceneEffect) (this.effects.next((byte) 18));
        }
        this.remainingTicks = this.remainingTicks - 1;
        this.ageTicks = this.ageTicks + 1;
        return;
    }

    private final boolean overlapsBouncerOrSpikePad(int param0) {
        IntrusiveDequeCursor var2;
        ArenaPad var3;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = new IntrusiveDequeCursor(QuickChatPhraseProvider.arenaPads);
        if (param0 > -106) {
          field_v = -85;
        }
        var3 = (ArenaPad) (var2.first((byte) -80));
        while (var3 != null) {
          var4 = (var3.radiusPixels << 8) + this.radiusQ8;
          if (wn.a(this.yQ8, var4, -117, var3.xQ8, this.xQ8, var3.yQ8) && (3 == var3.padType ||
            var3.padType == 6)) {
            return true;
          }
          var3 = (ArenaPad) (var2.next(0));
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 42) {
          return;
        }
        field_k = null;
        field_s = null;
    }

    final static void releaseSpriteDecoderArrays(byte param0) {
        if (param0 >= -13) {
          return;
        }
        StrongCacheReference.field_C = null;
        er.field_h = null;
        TextLayout.field_d = (byte[][]) null;
        LegacyOpenGlEffectManager.field_l = null;
        CheckboxRenderer.field_k = null;
        ScrollViewport.field_B = null;
    }

    final int radiusQ8(int param0) {
        if (param0 >= -32) {
          return 10;
        }
        return this.radiusQ8;
    }

    PowerupPickup(int kind, int effectIndex, int xQ8, int yQ8, int velocityXQ8, int velocityYQ8) {
        this.kind = kind;
        this.velocityXQ8 = velocityXQ8;
        this.remainingTicks = 1000;
        this.yQ8 = yQ8;
        this.velocityYQ8 = velocityYQ8;
        this.effectIndex = effectIndex;
        this.radiusQ8 = 5120;
        this.xQ8 = xQ8;
        this.effects = new IntrusiveDeque();
    }

    static {
        field_k = new int[8192];
        field_v = 0;
    }
}
