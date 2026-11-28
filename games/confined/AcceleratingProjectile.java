/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AcceleratingProjectile extends MovingTunnelEntity {
    static String field_R;
    MovingTunnelEntity field_Y;
    static RgbSprite[] field_T;
    static int field_Q;
    static int field_U;
    static String field_Z;
    static String field_W;
    double field_X;
    da field_ab;
    int field_S;
    private int field_V;

    AcceleratingProjectile(GameSession param0, double param1, double param2, double param3, MovingTunnelEntity param4, PcmSample param5) {
        super(param0, param4.field_E, param4.field_t, param4.field_D, param1, param2);
        this.field_V = 0;
        this.field_S = 1;
        try {
          this.field_Y = param4;
          this.field_X = param3;
          new gk((TunnelEntity) (this), param5).field_w = 2.0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void dispatchEntityCollision(TunnelEntity param0, int param1) {
        try {
          param0.onAcceleratingProjectileContact(123, this);
          if (param1 >= -81) {
            PowerUpPickup var4 = (PowerUpPickup) null;
            this.onPowerUpContact((PowerUpPickup) null, (byte) 40);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final double applyDamage(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
          field_W = (String) null;
        }
        param2 = param2 - 4.0;
        return param2 < 0.0 ? 0.0 : param2;
    }

    final boolean canBeHitByProjectileRay(int param0) {
        if (param0 != 5) {
          return false;
        }
        return true;
    }

    AcceleratingProjectile(GameSession param0, MovingTunnelEntity param1, double param2, double param3, double param4, double[] param5, double param6, double param7, double param8, PcmSample param9) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param2, param3);
        double var17_double = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var31 = 0.0;
        double var29 = 0.0;
        double var23Lifetime1;
        double var25Lifetime1;
        double var27Lifetime1;
        double var29Lifetime1;
        this.field_V = 0;
        this.field_S = 1;
        try {
          this.field_G = param1.field_G;
          this.field_t = this.field_t + (param5[4] * param6 + param5[7] * param7 + param8 * param5[10]);
          this.field_D = this.field_D + (param8 * param5[11] + (param6 * param5[5] + param5[8] * param7));
          this.field_X = param4;
          this.field_E = this.field_E + (param6 * param5[3] + param5[6] * param7 + param5[9] * param8);
          this.field_K = param1.field_K;
          this.field_L = param1.field_L;
          this.field_Y = param1;
          this.field_ab = new da();
          var17_double = -this.field_E + param0.field_B.field_Lb.field_i;
          var19 = param0.field_B.field_Lb.field_f - this.field_t;
          var21 = param0.field_B.field_Lb.field_j - this.field_D;
          var23 = -var19;
          var25 = var17_double;
          var27 = Math.sqrt(var25 * var25 + var23 * var23);
          if (var27 >= 0.0001) {
            var25 = var25 / var27;
            var23 = var23 / var27;
            var29 = Math.atan2(var27, var21);
            this.field_ab.a(var29, 0.0, var23, var25, 7);
          }
          var23Lifetime1 = var17_double;
          var25Lifetime1 = var19;
          var29Lifetime1 = var21;
          var27Lifetime1 = Math.sqrt(var29Lifetime1 * var29Lifetime1 + (var25Lifetime1 * var25Lifetime1 + var23Lifetime1 * var23Lifetime1));
          if (var27Lifetime1 < 0.001) {
            var27Lifetime1 = 0.001;
          }
          var27Lifetime1 = 1.0 / var27Lifetime1;
          var29Lifetime1 = var29Lifetime1 * var27Lifetime1;
          var25Lifetime1 = var25Lifetime1 * var27Lifetime1;
          var23Lifetime1 = var23Lifetime1 * var27Lifetime1;
          var31 = Math.random() * 6.283185307179586;
          hd.field_e.a(var31, var29Lifetime1, var23Lifetime1, var25Lifetime1, 7);
          this.field_ab.a(-57, hd.field_e);
          new gk((TunnelEntity) (this), param9).field_w = 2.0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean canBeTargetedBy(boolean param0, TunnelEntity param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          AcceleratingProjectile.l(-64);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ah.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void b(boolean param0, MovingTunnelEntity param1) {
        if (param1 == this.field_Y &&
          (param1.field_z || this.field_S > 0)) {
          this.field_S = this.field_S + 1;
          return;
        }
        try {
          this.a(param1, 0.0, -85);
          param1.applyDamage(14170, param0, this.field_X);
          this.d(10797);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onMovingEntityContact(boolean param0, MovingTunnelEntity param1) {
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_3_1 = !(param0);
          this.b(stackIn_3_1, param1);
          if (!param0) {
            this.field_X = -0.41923518349279615;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ah.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean canBeHitByLightningArcFrom(TunnelEntity param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ah.WA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int computeCrc32(byte[] param0, int param1, int param2, byte param3) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var4_int = -1;
          var5 = -74 % ((param3 + 54) / 57);
          for (var6 = param1; var6 < param2; var6++) {
            var4_int = ca.field_n[(param0[var6] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ah.UA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    AcceleratingProjectile(GameSession param0, PlayerShip param1, double param2, double param3, double param4, PcmSample param5) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param2, param3);
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        this.field_V = 0;
        this.field_S = 1;
        try {
          this.field_X = param4;
          this.field_Y = (MovingTunnelEntity) ((Object) param1);
          this.field_L = param1.field_L;
          this.field_K = param1.field_K;
          this.field_G = param1.field_G;
          this.field_ab = new da(param1.field_jb);
          var13 = new double[12];
          var12 = var13;
          var11 = var12;
          double[] var10 = var11;
          this.field_ab.a((byte) 81, var13);
          this.field_E = this.field_E + var13[9] * param1.field_C;
          this.field_t = this.field_t + param1.field_C * var13[10];
          this.field_D = this.field_D + var13[11] * param1.field_C;
          new gk((TunnelEntity) (this), param5).field_w = 2.0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void onCameraContact(int param0, TunnelCamera param1) {
        try {
          if (param0 != -1) {
            field_R = (String) null;
          }
          param1.onAcceleratingProjectileContact(73, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onExpandingPulseContact(boolean param0, ExpandingPulseProjectile param1) {
        if (param0) {
          return;
        }
        try {
          param1.c((MovingTunnelEntity) (this), -7442);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onShockwaveContact(int param0, ShockwaveBlast param1) {
        try {
          param1.onAcceleratingProjectileContact(113, this);
          if (param0 != -23154) {
            TunnelEntity var4 = (TunnelEntity) null;
            this.dispatchEntityCollision((TunnelEntity) null, -105);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param2 > -105) {
          field_Q = -2;
        }
        if (param1) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        return ag.field_d[var4];
    }

    final void onPowerUpContact(PowerUpPickup param0, byte param1) {
        try {
          int var3_int = -66 / ((-35 - param1) / 60);
          param0.onAcceleratingProjectileContact(-43, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void resetStaticState(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != -128) {
          field_U = -127;
        }
        field_W = null;
        field_Z = null;
    }

    final void resolveTunnelWallContact(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14 = -this.field_E + param3;
        if (param0 != 256) {
          field_R = (String) null;
        }
        double var16 = param1 - this.field_t;
        double var18 = param5 - this.field_D;
        if (this.field_C * this.field_C * 0.25 > var18 * var18 + (var14 * var14 + var16 * var16)) {
          this.d(10797);
        }
    }

    final void onDampedProjectileContact(byte param0, DampedProjectile param1) {
        if (param0 != 9) {
          return;
        }
        try {
          param1.onAcceleratingProjectileContact(param0 ^ -53, this);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ah.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static e[] l(int param0) {
        if (param0 != 20253) {
          return (e[]) null;
        }
        return new e[]{ConfirmedEmailAvailabilityValidator.field_l, rn.field_a, tl.field_e, PrimaryNodeDeque.field_f, li.field_k, Bzip2State.field_o, LabeledWidgetContainer.field_N, ch.field_a, ij.field_s, og.field_i, KeyboardInput.field_g, FullscreenStatusDialog.field_lb, IntrusiveNode.field_g, ModalDialog.field_R};
    }

    final boolean isAlliedWithPlayer(int param0) {
        if (param0 >= -54) {
          this.field_X = -0.13909911227676286;
        }
        return this.field_Y.isAlliedWithPlayer(-104);
    }

    void updateForTunnelSegment(int param0, int param1) {
        if (0 < this.field_S) {
          this.field_S = this.field_S - 1;
        }
        double[] var8 = new double[12];
        double[] var7 = var8;
        double[] var6 = var7;
        double[] var3 = var6;
        this.field_ab.a((byte) 72, var8);
        double var4 = this.field_Y.isAlliedWithPlayer(-62) ? 0.99 : 0.97;
        this.field_G = (this.field_G + var8[10] * 0.01) * var4;
        this.field_L = var4 * (0.01 * var8[11] + this.field_L);
        this.field_K = (this.field_K + var8[9] * 0.01) * var4;
        super.updateForTunnelSegment(param0, param1);
        this.field_V = this.field_V + 1;
        if (this.field_V == 120) {
          this.d(10797);
        }
    }

    final void onHomingProjectileContact(int param0, HomingProjectile param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!this.isAlliedWithPlayer(-96) &&
            param1.isAlliedWithPlayer(-110)) {
            param1.b((MovingTunnelEntity) (this), -125);
          }
          if (param0 > -29) {
            field_R = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ah.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void onAcceleratingProjectileContact(int param0, AcceleratingProjectile param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == param1.field_Y && (this.field_z ||
            !(0 >= param1.field_S))) {
            param1.field_S = param1.field_S + 1;
            return;
          }
          this.b(false, param1);
          param1.d(10797);
          var3_int = -57 % ((14 - param0) / 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ah.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_Z = "Charge cannon";
        field_R = "<%0> concussion missiles";
        field_W = "1 nuclear missile";
        field_Q = -1;
    }
}
