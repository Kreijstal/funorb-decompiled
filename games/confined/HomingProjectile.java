/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class HomingProjectile extends MovingTunnelEntity {
    static String field_S;
    static byte[][] field_Z;
    MovingTunnelEntity field_R;
    static String field_X;
    double field_Y;
    static PcmSample field_T;
    TunnelEntity field_W;
    double field_V;
    int field_Q;
    static String field_U;

    final boolean isAlliedWithPlayer(int param0) {
        if (param0 >= -54) {
          HomingProjectile.clearDeclaredStaticReferences(-59);
          return this.field_R.isAlliedWithPlayer(-67);
        }
        return this.field_R.isAlliedWithPlayer(-67);
    }

    HomingProjectile(GameSession param0, double param1, double param2, double param3, double param4, double param5, MovingTunnelEntity param6, double param7, double param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_W = null;
        this.field_Q = 1;
        try {
          this.field_V = param7;
          this.field_R = param6;
          this.field_Y = param8;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    void dispatchEntityCollision(TunnelEntity param0, int param1) {
        if (param1 > -81) {
          return;
        }
        try {
          param0.onHomingProjectileContact(-80, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void onCameraContact(int param0, TunnelCamera param1) {
        try {
          param1.onHomingProjectileContact(-61, this);
          if (param0 != -1) {
            this.field_W = (TunnelEntity) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void updateForTunnelSegment(int param0, int param1) {
        TunnelEntity dupTemp$0 = null;
        if (0 < this.field_Q) {
          this.field_Q = this.field_Q - 1;
        }
        if (this.field_W == null) {
          super.updateForTunnelSegment(param0, param1);
          return;
        }
        double var3 = Math.sqrt(this.field_K * this.field_K + this.field_G * this.field_G + this.field_L * this.field_L);
        if (var3 < 0.001) {
          var3 = 0.001;
        }
        double var5 = this.field_K / var3;
        double var7 = this.field_G / var3;
        double var9 = this.field_L / var3;
        if (this.a(var9, this.field_W, var5, 1, var7)) {
          dupTemp$0 = this.a(var5, var7, var9, false);
          this.field_W = dupTemp$0;
          if (dupTemp$0 == null) {
            super.updateForTunnelSegment(param0, param1);
            return;
          }
          this.b(this.field_W, (byte) 106);
          this.a(true, this.field_Y, 27871);
          super.updateForTunnelSegment(param0, param1);
          return;
        }
        this.b(this.field_W, (byte) 106);
        this.a(true, this.field_Y, 27871);
        super.updateForTunnelSegment(param0, param1);
    }

    void onExpandingPulseContact(boolean param0, ExpandingPulseProjectile param1) {
        try {
          if (param0) {
            this.field_W = (TunnelEntity) null;
          }
          param1.onHomingProjectileContact(-51, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static RgbSprite[] a(ResourceArchive param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -122) {
            field_S = (String) null;
          }
          if (mc.a(param3, param1, param0, (byte) 119)) {
            stackIn_6_0 = ja.a(-122);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (RgbSprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("hf.SA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void onShockwaveContact(int param0, ShockwaveBlast param1) {
        try {
          param1.onHomingProjectileContact(param0 + 23056, this);
          if (param0 != -23154) {
            ResourceArchive var4 = (ResourceArchive) null;
            HomingProjectile.a((ResourceArchive) null, -38, (byte) -52, 80);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void onMovingEntityContact(boolean param0, MovingTunnelEntity param1) {
        try {
          this.b(param1, -126);
          if (!param0) {
            field_X = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(int param0) {
        if (param0 == 50) {
          return RichTextWidget.field_S == ValidatedTextField.field_fb ? true : false;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        HomingProjectile.a((ResourceArchive) null, -32, (byte) 16, -69);
        return RichTextWidget.field_S == ValidatedTextField.field_fb ? true : false;
    }

    final double applyDamage(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
          this.field_V = -1.316130172528065;
          return param2;
        }
        return param2;
    }

    boolean canBeHitByLightningArcFrom(TunnelEntity param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            return false;
          }
          this.field_Q = 4;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hf.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void onAcceleratingProjectileContact(int param0, AcceleratingProjectile param1) {
        try {
          param1.onHomingProjectileContact(-35, this);
          int var3_int = 3 / ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean canBeHitByProjectileRay(int param0) {
        if (param0 != 5) {
          MovingTunnelEntity var3 = (MovingTunnelEntity) null;
          this.onMovingEntityContact(true, (MovingTunnelEntity) null);
          return false;
        }
        return false;
    }

    void onPowerUpContact(PowerUpPickup param0, byte param1) {
        try {
          int var3_int = 75 / ((param1 + 35) / 60);
          param0.onHomingProjectileContact(-84, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void resolveTunnelWallContact(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        if (param0 != 256) {
          return;
        }
        this.d(param0 ^ 11053);
    }

    void onHomingProjectileContact(int param0, HomingProjectile param1) {
        try {
          if (param0 > -29) {
            ShockwaveBlast var4 = (ShockwaveBlast) null;
            this.onShockwaveContact(-7, (ShockwaveBlast) null);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void onDampedProjectileContact(byte param0, DampedProjectile param1) {
        if (param0 != 9) {
          return;
        }
        try {
          param1.onHomingProjectileContact(param0 - 106, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean canBeTargetedBy(boolean param0, TunnelEntity param1) {
        RuntimeException var3 = null;
        DampedProjectile var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (DampedProjectile) null;
            this.onDampedProjectileContact((byte) -53, (DampedProjectile) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hf.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_U = null;
        field_S = null;
        int var1 = 12 % ((param0 - 4) / 35);
        field_X = null;
        field_Z = (byte[][]) null;
        field_T = null;
    }

    void b(MovingTunnelEntity param0, int param1) {
        if (param0 == this.field_R &&
          this.field_Q > 0) {
          this.field_Q = this.field_Q + 1;
          return;
        }
        this.a(param0, 0.0, -77);
        param0.applyDamage(14170, false, this.field_V);
        if (param1 >= -122) {
          return;
        }
        try {
          this.d(10797);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_X = "<%0> homing missiles";
        field_S = "Connection timed out. Please try using a different server.";
        field_Z = new byte[50][];
        field_U = "Updates will sent to the email address you've given";
    }
}
