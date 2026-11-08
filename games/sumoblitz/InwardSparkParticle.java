/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InwardSparkParticle extends TimedSceneEffect {
    private int velocityYQ8;
    private int initialLifetime;
    static String livesText;
    private int textureKind;
    static int[] field_y;
    static pl field_v;
    private int velocityXQ8;
    static MouseWheelInput field_w;

    final static void f(int param0) {
        ct var1 = null;
        byte[] var3 = null;
        ks var1_ref = null;
        byte[] var4 = null;
        if (null == pd.field_n) {
          var1 = new ct();
          var3 = var1.a(128, 128, false, 16);
          pd.field_n = DroneDebris.storeByteArray((byte) -125, var3, false);
        }
        if (mk.field_d == null) {
          var1_ref = new ks();
          var4 = var1_ref.b(1, 128, 128, 16);
          mk.field_d = DroneDebris.storeByteArray((byte) -120, var4, false);
        }
        if (param0 != 23369) {
          livesText = (String) null;
        }
    }

    public static void releaseStatics(int param0) {
        livesText = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = -34 % ((param0 + 2) / 42);
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (guard > -121) {
            this.updateAndIsExpired(-59);
          }
          if (0 != this.textureKind) {
            im.field_a.a((float)(this.x >> 8), (float)(this.y >> 8), 4096, 0, 0, (this.remainingTicks * (128 / this.initialLifetime) << 24) + this.color, 1);
          } else {
            uc.field_a.a((float)(this.x >> 8), (float)(this.y >> 8), 1024, 0, 0, (this.remainingTicks * (128 / this.initialLifetime) << 24) + this.color, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("as.C(");
          if (toolkit == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    InwardSparkParticle(int lifetimeTicks, int xQ8, int yQ8, int color, int velocityXQ8, int velocityYQ8, int textureKind) {
        super(lifetimeTicks, xQ8, yQ8, color);
        this.velocityYQ8 = velocityYQ8;
        this.textureKind = textureKind;
        this.initialLifetime = lifetimeTicks;
        this.velocityXQ8 = velocityXQ8;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ce.field_o != null) {
            ce.field_o.field_B.a(param1, false);
          }
          if (ro.field_a != null) {
            ro.field_a.field_E.a(param1, false);
          }
          if (param0 != 256) {
            field_y = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("as.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean updateAndIsExpired(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.initialLifetime > this.remainingTicks) {
          this.x = this.x + this.velocityXQ8;
          this.y = this.y + this.velocityYQ8;
          this.velocityXQ8 = this.velocityXQ8 * 251 / 285;
          this.velocityYQ8 = this.velocityYQ8 * 251 / 285;
          if (this.velocityXQ8 < 0) {
            this.velocityXQ8 = this.velocityXQ8 - 1;
          } else {
            this.velocityXQ8 = this.velocityXQ8 + 1;
          }
          if (this.velocityYQ8 < 0) {
            this.velocityYQ8 = this.velocityYQ8 - 1;
          } else {
            this.velocityYQ8 = this.velocityYQ8 + 1;
          }
        }
        if (param0 != -2567) {
          InwardSparkParticle.releaseStatics(-88);
        }
        return super.updateAndIsExpired(param0 + 0);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        livesText = "lives: ";
        field_y = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((1 & var0) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_y[var1] = var0;
        }
    }
}
