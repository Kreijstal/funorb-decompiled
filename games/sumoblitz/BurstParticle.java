/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BurstParticle extends TimedSceneEffect {
    private int textureKind;
    static int field_t;
    private int velocityYQ8;
    private int initialLifetime;
    private int velocityXQ8;

    final boolean updateAndIsExpired(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.initialLifetime <= this.remainingTicks) {
          if (param0 != -2567) {
            this.velocityXQ8 = -90;
            return super.updateAndIsExpired(-2567);
          }
          return super.updateAndIsExpired(-2567);
        }
        this.y = this.y + this.velocityYQ8;
        this.x = this.x + this.velocityXQ8;
        this.velocityYQ8 = this.velocityYQ8 * 251 / 300;
        this.velocityXQ8 = 251 * this.velocityXQ8 / 300;
        if (this.velocityXQ8 < 0) {
          this.velocityXQ8 = this.velocityXQ8 - 1;
          if (this.velocityYQ8 < 0) {
            this.velocityYQ8 = this.velocityYQ8 - 1;
            if (param0 != -2567) {
              this.velocityXQ8 = -90;
              return super.updateAndIsExpired(-2567);
            }
            return super.updateAndIsExpired(-2567);
          }
          this.velocityYQ8 = this.velocityYQ8 + 1;
          if (param0 != -2567) {
            this.velocityXQ8 = -90;
            return super.updateAndIsExpired(-2567);
          }
          return super.updateAndIsExpired(-2567);
        }
        this.velocityXQ8 = this.velocityXQ8 + 1;
        if (this.velocityYQ8 < 0) {
          this.velocityYQ8 = this.velocityYQ8 - 1;
          if (param0 == -2567) {
            return super.updateAndIsExpired(-2567);
          }
          this.velocityXQ8 = -90;
          return super.updateAndIsExpired(-2567);
        }
        this.velocityYQ8 = this.velocityYQ8 + 1;
        if (param0 == -2567) {
          return super.updateAndIsExpired(-2567);
        }
        this.velocityXQ8 = -90;
        return super.updateAndIsExpired(-2567);
    }

    final static int firstCollisionFraction(int constant, int guard, int linear, int twiceQuadratic, int fractionBits) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var5 = -14 + IntegerMath.floorLog2(-117, linear ^ linear >> 31 | twiceQuadratic ^ twiceQuadratic >> 31 | constant >> 31 ^ constant);
        if (var5 > 0) {
          twiceQuadratic = twiceQuadratic >> var5;
          constant = constant >> var5;
          linear = linear >> var5;
        }
        if (0 >= twiceQuadratic) {
          return -1;
        }
        var6 = -(constant * (2 * twiceQuadratic)) + linear * linear;
        if (guard >= -100) {
          return 115;
        }
        if (var6 < 0) {
          return -1;
        }
        var7 = IntrusiveDequeCursor.approximateIntegerSqrt(-22415, var6);
        var8 = (var7 - linear << fractionBits) / twiceQuadratic;
        var9 = (-var7 - linear << fractionBits) / twiceQuadratic;
        if (var8 >= 0 &&
          var8 <= 1 << fractionBits) {
          if (0 > var9) {
            return var8;
          }
          if (var8 <= var9) {
            return var8;
          }
          return var9;
        }
        if (var9 < 0) {
          return -1;
        }
        if (1 << fractionBits < var9) {
          return -1;
        }
        return var9;
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -121) {
            this.updateAndIsExpired(84);
          }
          if (this.textureKind != 0) {
            ParticleSpriteResources.sparkSprite.draw(this.x >> 8, this.y >> 8, 0, (256 / this.initialLifetime * this.remainingTicks << 24) + this.color, 1);
            return;
          }
          IntroductionOverlaySupport.field_a.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), 1024, 0, 3, 16777215 + (256 / this.initialLifetime * this.remainingTicks << 24), 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vt.C(");
          if (toolkit == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    BurstParticle(int lifetimeTicks, int xQ8, int yQ8, int color, int velocityXQ8, int velocityYQ8, int textureKind) {
        super(lifetimeTicks, xQ8, yQ8, color);
        this.initialLifetime = lifetimeTicks;
        this.velocityYQ8 = velocityYQ8;
        this.textureKind = textureKind;
        this.velocityXQ8 = velocityXQ8;
    }

    final static void renderDialogLayer(boolean unused, boolean guard) {
        if (!guard) {
          BurstParticle.renderDialogLayer(false, false);
          RenderPresentationException.field_a.render(0, 0, false);
          return;
        }
        RenderPresentationException.field_a.render(0, 0, false);
    }

    static {
    }
}
