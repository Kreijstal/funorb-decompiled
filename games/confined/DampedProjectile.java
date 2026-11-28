/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DampedProjectile extends MovingTunnelEntity {
    da field_S;
    private da field_Q;
    private int field_T;
    static byte[] field_V;
    static String field_W;
    private MovingTunnelEntity field_X;
    private double field_Y;
    static boolean field_R;

    final boolean isAlliedWithPlayer(int param0) {
        if (param0 >= -54) {
          return false;
        }
        return this.field_X.isAlliedWithPlayer(-58);
    }

    final void onPowerUpContact(PowerUpPickup param0, byte param1) {
        try {
          int var3_int = -85 / ((-35 - param1) / 60);
          param0.onDampedProjectileContact((byte) 9, this);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, MovingTunnelEntity param1) {
        if (this.field_X == param1 &&
          this.field_T > 0) {
          this.field_T = this.field_T + 1;
          return;
        }
        try {
          this.a(param1, 1.0, -67);
          param1.applyDamage(14170, false, this.field_Y);
          this.d(10797);
          if (param0 < 98) {
            this.field_Y = 0.723536474622876;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onDampedProjectileContact(byte param0, DampedProjectile param1) {
        try {
          if (param0 != 9) {
            DampedProjectile.h((byte) -107);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateForTunnelSegment(int param0, int param1) {
        if (0 < this.field_T) {
          this.field_T = this.field_T - 1;
        }
        this.field_L = this.field_L * 0.95;
        this.field_G = this.field_G * 0.95;
        this.field_K = this.field_K * 0.95;
        this.field_S.a(param0 ^ -11818, this.field_Q);
        super.updateForTunnelSegment(param0, param1);
        if (!(this.field_D < 0.0)) {
          return;
        }
        this.field_s = 2;
        this.field_z = true;
    }

    final void onHomingProjectileContact(int param0, HomingProjectile param1) {
        try {
          if (param0 > -29) {
            ShockwaveBlast var4 = (ShockwaveBlast) null;
            this.onShockwaveContact(-51, (ShockwaveBlast) null);
          }
          param1.b((MovingTunnelEntity) (this), -127);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void resolveTunnelWallContact(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this.d(10797);
        if (param0 != 256) {
          ShockwaveBlast var15 = (ShockwaveBlast) null;
          this.onShockwaveContact(-82, (ShockwaveBlast) null);
        }
    }

    DampedProjectile(GameSession param0, MovingTunnelEntity param1, da param2, double param3, double param4, double param5) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param3, param4);
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        this.field_T = 1;
        this.field_Q = new da();
        try {
          this.field_X = param1;
          this.field_G = param1.field_G;
          this.field_Y = param5;
          this.field_K = param1.field_K;
          this.field_L = param1.field_L;
          this.field_S = new da(param2);
          var13 = new double[12];
          var12 = var13;
          var11 = var12;
          double[] var10 = var11;
          param2.a((byte) 62, var13);
          this.field_Q.a(0.04, var13[8], var13[6], var13[7], 7);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean canBeHitByProjectileRay(int param0) {
        if (param0 != 5) {
          return false;
        }
        return true;
    }

    final void onShockwaveContact(int param0, ShockwaveBlast param1) {
        try {
          param1.onDampedProjectileContact((byte) 9, this);
          if (param0 != -23154) {
            this.updateForTunnelSegment(-98, -49);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(byte param0) {
        if (param0 == -28) {
          field_W = null;
          field_V = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        DampedProjectile.a(4, (byte) -53, (CharSequence) null);
        field_W = null;
        field_V = null;
    }

    final void dispatchEntityCollision(TunnelEntity param0, int param1) {
        try {
          if (param1 > -81) {
            ExpandingPulseProjectile var4 = (ExpandingPulseProjectile) null;
            this.onExpandingPulseContact(false, (ExpandingPulseProjectile) null);
          }
          param0.onDampedProjectileContact((byte) 9, this);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void onMovingEntityContact(boolean param0, MovingTunnelEntity param1) {
        try {
          this.a(116, param1);
          if (!param0) {
            this.applyDamage(-127, false, 0.5826377833815527);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onExpandingPulseContact(boolean param0, ExpandingPulseProjectile param1) {
        try {
          if (param0) {
            this.field_T = -120;
          }
          param1.c((MovingTunnelEntity) (this), -7442);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onCameraContact(int param0, TunnelCamera param1) {
        try {
          param1.onDampedProjectileContact((byte) 9, this);
          if (param0 != -1) {
            field_W = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean canBeHitByLightningArcFrom(TunnelEntity param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            return false;
          }
          this.field_Y = -1.058661999384887;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sa.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
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
          field_R = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sa.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void onAcceleratingProjectileContact(int param0, AcceleratingProjectile param1) {
        try {
          param1.b(false, (MovingTunnelEntity) (this));
          int var3_int = -102 / ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final double applyDamage(int param0, boolean param1, double param2) {
        param2 = param2 - 4.0;
        this.d(param0 - 3373);
        if (param0 == 14170) {
          return !(param2 < 0.0) ? param2 : 0.0;
        }
        this.field_Y = -1.7791750168521754;
        return !(param2 < 0.0) ? param2 : 0.0;
    }

    final static void a(byte param0, int param1) {
        em.field_a = 20 * param1 / 50;
        if (param0 == -35) {
          gd.field_u = 4 * param1 / 50;
          return;
        }
        field_V = (byte[]) null;
        gd.field_u = 4 * param1 / 50;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 52) {
            stackIn_4_0 = b.a(true, param0, (byte) 16, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 93;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sa.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_W = "Others have tried#and failed.#If you succeed, your reward#will be#immeasurable.";
        field_V = new byte[65536];
        lj.a(field_V, 0, 65536, (byte) -128);
        field_R = false;
    }
}
