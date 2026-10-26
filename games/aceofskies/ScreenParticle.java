/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenParticle {
    int xQ8;
    int radiusAccelerationQ8;
    int xAccelerationQ8;
    int radiusQ8;
    int yVelocityQ8;
    int yAccelerationQ8;
    int radiusVelocityQ8;
    int renderMode;
    int previousYQ8;
    static int field_o;
    int previousXQ8;
    int durationTicks;
    int ageTicks;
    int xVelocityQ8;
    int alphaScale;
    int yQ8;

    final void spawnBurst(int yAccelerationQ8, int xQ8, int spreadQ8, int durationTicks, int yQ8, int radiusQ8, int obfuscationGuard) {
        this.initializeMotion(yAccelerationQ8, 0, np.a(-spreadQ8 << 1, spreadQ8 >> 1, (byte) -50), radiusQ8, 0, np.a(-spreadQ8, spreadQ8, (byte) -56), xQ8, 0, yQ8, durationTicks, 0, 0, 255);
        if (obfuscationGuard != -1588713311) {
          this.xAccelerationQ8 = -84;
        } else {
          this.previousXQ8 = this.xQ8;
          this.previousYQ8 = this.yQ8;
          return;
        }
        this.previousXQ8 = this.xQ8;
        this.previousYQ8 = this.yQ8;
    }

    private final void initializeMotion(int yAccelerationQ8, int radiusAccelerationQ8, int yVelocityQ8, int radiusQ8, int radiusVelocityQ8, int xVelocityQ8, int xQ8, int renderMode, int yQ8, int durationTicks, int ageTicks, int xAccelerationQ8, int alphaScale) {
        this.renderMode = renderMode;
        this.xQ8 = xQ8;
        this.xAccelerationQ8 = xAccelerationQ8;
        this.yVelocityQ8 = yVelocityQ8;
        this.ageTicks = ageTicks;
        this.yAccelerationQ8 = yAccelerationQ8;
        this.alphaScale = alphaScale;
        this.yQ8 = yQ8;
        this.radiusAccelerationQ8 = radiusAccelerationQ8;
        this.radiusQ8 = radiusQ8;
        this.radiusVelocityQ8 = radiusVelocityQ8;
        this.xVelocityQ8 = xVelocityQ8;
        this.durationTicks = durationTicks;
    }

    final void spawnGrowingSprite(int xQ8, boolean obfuscationGuard, int durationTicks, int growthStepQ8, int radiusQ8, int alphaScale, int yQ8) {
        this.initializeMotion(0, 0, -growthStepQ8 << 3, radiusQ8, growthStepQ8, 0, xQ8, 1, yQ8, durationTicks, 0, 0, alphaScale);
        this.ageTicks = -this.durationTicks;
        if (obfuscationGuard) {
          this.spawnBurst(-38, -34, 83, 10, 51, 37, 91);
        }
    }

    static {
        field_o = 0;
    }
}
