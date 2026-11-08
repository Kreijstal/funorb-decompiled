/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerupTrailParticle extends TimedSceneEffect {
    private int textureIndex;
    private double initialLifetime;
    static int[] field_v;
    private boolean usePowerupTexture;
    static String toCustomerSupportText;

    public static void releaseStatics(int param0) {
        if (param0 != 3190) {
          return;
        }
        toCustomerSupportText = null;
        field_v = null;
    }

    PowerupTrailParticle(int lifetimeTicks, int xPixels, int yPixels, int color, int textureIndex, boolean usePowerupTexture) {
        super(lifetimeTicks, xPixels, yPixels, color);
        this.textureIndex = textureIndex;
        this.initialLifetime = (double)lifetimeTicks;
        this.usePowerupTexture = usePowerupTexture ? true : false;
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -121) {
            PowerupTrailParticle.releaseStatics(-79);
          }
          if (this.usePowerupTexture) {
            CachedArchiveProvider.field_j[this.textureIndex].a((float)this.x, (float)this.y, -200 + (2048 - (int)(2048.0 * ((this.initialLifetime - (double)this.remainingTicks) / this.initialLifetime))), 0, 3, 3 * this.remainingTicks << 24, 1);
            return;
          }
          uc.field_a.a((float)this.x, (float)this.y, -200 - (int)(((double)(-this.remainingTicks) + this.initialLifetime) / this.initialLifetime * 2048.0) + 2048, 0, 3, this.remainingTicks * 2 << 24, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("eq.C(");
          if (toolkit == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_v = new int[8192];
        toCustomerSupportText = "To Customer Support";
    }
}
