/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FireworkBurst extends IntrusiveNode {
    private int trailStartAge;
    static int[] backgroundTintColors;
    private int[][] trailXHistory256;
    static RgbSprite[] activeBrickSprites;
    private int ageTicks;
    private int particleCount;
    private int particlesPerRing;
    static RgbSprite achievementOrbCoinSprite;
    private int[][] trailYHistory256;
    private int horizontalFlipAge;
    private int startDelayTicks;
    private int fadeTicks;
    private int lifetimeTicks;
    private int[] velocityY256;
    private int[] velocityX256;
    private int[] particleColorIndices;
    private int coreIntensityDecayPerTick;
    private int originY256;
    private int[] particleY256;
    private int fadeStartAge;
    private int[] particleX256;
    private int[] trailColorIndices;
    private int accelerationStartAge;
    private int haloIntensityDecayPerTick;
    private int trailIntensityDecayPerTick;
    static String matchmakingStatusText;
    private int trailLength;
    private int dampingEndAge;
    private int horizontalAcceleration256;
    private int originX256;
    private int gravity256;
    static int[] viewFacePointOneX;
    private int ringCount;

    final void advanceParticles(int firstParticle) {
        int remainingDelay = 0;
        int particleIndex = 0;
        int unusedClientFlag;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        if (this.startDelayTicks > 0) {
          remainingDelay = this.startDelayTicks - 1;
          this.startDelayTicks = this.startDelayTicks - 1;
          if (remainingDelay > 0) {
            return;
          }
        }
        for (particleIndex = firstParticle; particleIndex < this.particleCount; particleIndex++) {
          if (this.ageTicks > this.trailStartAge) {
            this.trailXHistory256[particleIndex][this.trailLength] = this.particleX256[particleIndex];
            this.trailYHistory256[particleIndex][this.trailLength] = this.particleY256[particleIndex];
          }
          boolean moveParticleAfterBranch = true;
          if (this.dampingEndAge > this.ageTicks) {
            this.velocityX256[particleIndex] = this.velocityX256[particleIndex] * 91 / 100;
            this.velocityY256[particleIndex] = this.velocityY256[particleIndex] * 91 / 100;
          } else {
            if (this.ageTicks > this.accelerationStartAge) {
              this.velocityY256[particleIndex] = this.velocityY256[particleIndex] + this.gravity256;
              this.velocityX256[particleIndex] = this.velocityX256[particleIndex] + this.horizontalAcceleration256;
              if (this.horizontalFlipAge >= this.ageTicks) {
                this.particleX256[particleIndex] = this.particleX256[particleIndex] + this.velocityX256[particleIndex];
                this.particleY256[particleIndex] = this.particleY256[particleIndex] + this.velocityY256[particleIndex];
                moveParticleAfterBranch = false;
              }
              else {
                if (this.horizontalAcceleration256 == 0) {
                  this.horizontalAcceleration256 = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 3) - 1;
                } else {
                  this.horizontalAcceleration256 = -this.horizontalAcceleration256;
                }
                this.horizontalFlipAge = this.lifetimeTicks + 1;
              }
            }
          }
          if (moveParticleAfterBranch) {
            this.particleX256[particleIndex] = this.particleX256[particleIndex] + this.velocityX256[particleIndex];
            this.particleY256[particleIndex] = this.particleY256[particleIndex] + this.velocityY256[particleIndex];
          }
        }
        if (this.ageTicks > this.fadeStartAge) {
          this.fadeTicks = this.fadeTicks + 1;
        }
        if (this.trailStartAge < this.ageTicks) {
          if (this.gravity256 != 0 &&
            2 * this.accelerationStartAge <= this.ageTicks) {
            this.trailLength = this.trailLength + 1;
          } else {
            if (this.ageTicks % 3 == 0) {
              this.trailLength = this.trailLength + 1;
            }
          }
        }
        int nextAge = this.ageTicks + 1;
        this.ageTicks = this.ageTicks + 1;
        if (this.lifetimeTicks == nextAge) {
          this.unlink((byte) 111);
          SocketConnector.activeFireworkCount = SocketConnector.activeFireworkCount - 1;
        }
    }

    final void drawParticles(int obfuscationGuard, int horizontalOffset16) {
        int particleIndex = 0;
        int trailIndex = 0;
        int unusedClientFlag;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -1196049244) {
          FireworkBurst.a(76);
        }
        if (0 < this.startDelayTicks) {
          return;
        }
        for (particleIndex = 0; this.particleCount > particleIndex; particleIndex++) {
          for (trailIndex = 0; trailIndex < this.trailLength; trailIndex++) {
            Rasterizer2D.drawRadialGlow((this.trailXHistory256[particleIndex][trailIndex] >> 4) + horizontalOffset16, this.trailYHistory256[particleIndex][trailIndex] >> 4, 48, -(this.trailIntensityDecayPerTick * this.fadeTicks) + 64, EmailLoginCredentials.fireworkColorRamps[this.trailColorIndices[particleIndex]]);
          }
          Rasterizer2D.drawRadialGlow(horizontalOffset16 + (this.particleX256[particleIndex] >> 4), this.particleY256[particleIndex] >> 4, 224, -(this.fadeTicks * this.haloIntensityDecayPerTick) + 165, EmailLoginCredentials.fireworkColorRamps[this.particleColorIndices[particleIndex]]);
          Rasterizer2D.drawRadialGlow((this.particleX256[particleIndex] >> 4) + horizontalOffset16, this.particleY256[particleIndex] >> 4, 64, -(this.coreIntensityDecayPerTick * this.fadeTicks) + 250, EmailLoginCredentials.fireworkColorRamps[this.particleColorIndices[particleIndex]]);
        }
        return;
    }

    public static void a(int param0) {
        matchmakingStatusText = null;
        if (param0 != 0) {
          matchmakingStatusText = (String) null;
        }
        achievementOrbCoinSprite = null;
        backgroundTintColors = null;
        activeBrickSprites = null;
        viewFacePointOneX = null;
    }

    FireworkBurst(int ringCount, int particlesPerRing, int originX, int originY) {
        int ringIndex = 0;
        int particleColorIndex = 0;
        int trailColorIndex = 0;
        int ringParticleIndex = 0;
        this.particlesPerRing = particlesPerRing;
        this.ringCount = ringCount;
        this.particleCount = this.particlesPerRing * this.ringCount;
        this.originX256 = originX << 8;
        this.originY256 = originY << 8;
        this.startDelayTicks = 30 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 30);
        this.lifetimeTicks = 100 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 30);
        this.trailStartAge = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 5) + 12;
        this.dampingEndAge = 19 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 3);
        this.accelerationStartAge = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 10) + 25;
        this.fadeStartAge = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 15) + 80;
        this.horizontalFlipAge = 2 * JungleBackground.fireworkRandom.nextBoundedInt(-37880252, this.lifetimeTicks);
        this.gravity256 = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 2) << 1;
        this.horizontalAcceleration256 = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 3) - 1;
        this.trailXHistory256 = new int[this.particleCount][this.lifetimeTicks];
        this.velocityY256 = new int[this.particleCount];
        this.particleColorIndices = new int[this.particleCount];
        this.particleY256 = new int[this.particleCount];
        this.particleX256 = new int[this.particleCount];
        this.trailColorIndices = new int[this.particleCount];
        this.velocityX256 = new int[this.particleCount];
        this.trailYHistory256 = new int[this.particleCount][this.lifetimeTicks];
        int particleIndex = 0;
        int ringSpeed256 = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 64) + 192;
        int angleStep8192 = 8192 / this.particlesPerRing;
        int angleJitter8192 = 0;
        for (ringIndex = 0; this.ringCount > ringIndex; ringIndex++) {
          particleColorIndex = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, EmailLoginCredentials.fireworkBaseColors.length);
          trailColorIndex = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, EmailLoginCredentials.fireworkBaseColors.length);
          for (ringParticleIndex = 0; this.particlesPerRing > ringParticleIndex; ringParticleIndex++) {
            angleJitter8192 = JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 800);
            this.particleX256[particleIndex] = this.originX256 + (JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 4) - 2 << 8);
            this.particleY256[particleIndex] = this.originY256 + (-2 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 4) << 8);
            this.velocityX256[particleIndex] = (InteractiveGameClient.sine8192(ringParticleIndex * angleStep8192 + angleJitter8192, -4097) >> 8) * ringSpeed256 >> 8;
            this.velocityY256[particleIndex] = ringSpeed256 * (BrickABrac.cosine8192(2048, angleJitter8192 + ringParticleIndex * angleStep8192) >> 8) >> 8;
            this.particleColorIndices[particleIndex] = particleColorIndex;
            this.trailColorIndices[particleIndex] = trailColorIndex;
            particleIndex++;
          }
          ringSpeed256 = ringSpeed256 + (128 + JungleBackground.fireworkRandom.nextBoundedInt(-37880252, 64));
        }
        this.haloIntensityDecayPerTick = 165 / (this.lifetimeTicks - this.fadeStartAge);
        this.trailIntensityDecayPerTick = 64 / (this.lifetimeTicks - this.fadeStartAge);
        this.coreIntensityDecayPerTick = 250 / (-this.fadeStartAge + this.lifetimeTicks);
    }

    static {
        backgroundTintColors = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        matchmakingStatusText = "Searching for opponents";
        viewFacePointOneX = new int[8192];
    }
}
