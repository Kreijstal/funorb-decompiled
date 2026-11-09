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

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var5 = -14 + IntegerMath.floorLog2(-117, param2 ^ param2 >> 31 | param3 ^ param3 >> 31 | param0 >> 31 ^ param0);
        if (var5 > 0) {
          param3 = param3 >> var5;
          param0 = param0 >> var5;
          param2 = param2 >> var5;
        }
        if (0 >= param3) {
          return -1;
        }
        var6 = -(param0 * (2 * param3)) + param2 * param2;
        if (param1 >= -100) {
          return 115;
        }
        if (var6 < 0) {
          return -1;
        }
        var7 = IntrusiveDequeCursor.b(-22415, var6);
        var8 = (var7 - param2 << param4) / param3;
        var9 = (-var7 - param2 << param4) / param3;
        if (var8 >= 0 &&
          var8 <= 1 << param4) {
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
        if (1 << param4 < var9) {
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
            im.field_a.draw(this.x >> 8, this.y >> 8, 0, (256 / this.initialLifetime * this.remainingTicks << 24) + this.color, 1);
            return;
          }
          uc.field_a.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), 1024, 0, 3, 16777215 + (256 / this.initialLifetime * this.remainingTicks << 24), 1);
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

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          BurstParticle.a(false, false);
          RenderPresentationException.field_a.render(0, 0, false);
          return;
        }
        RenderPresentationException.field_a.render(0, 0, false);
    }

    static {
    }
}
