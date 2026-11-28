/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends TunnelEntity {
    private double field_O;
    private DynamicLight field_I;
    static int field_P;
    static ResourceArchive field_N;
    private int field_J;
    static volatile int field_L;
    double field_K;
    static byte[] field_F;
    static String field_G;
    gk field_M;

    void onMovingEntityContact(boolean param0, MovingTunnelEntity param1) {
        try {
          if (!param0) {
            field_P = -79;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isAlliedWithPlayer(int param0) {
        if (param0 > -54) {
          this.participatesInEntityCollisions((byte) 11);
          return false;
        }
        return false;
    }

    ka(TunnelEntity param0, double param1, PcmSample param2) {
        this(param0.field_A, param0.field_E, param0.field_t, param0.field_D, param0.field_C * param1, param2);
    }

    final void onCameraContact(int param0, TunnelCamera param1) {
        try {
          if (param0 != -1) {
            field_F = (byte[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateForTunnelSegment(int param0, int param1) {
        this.field_K = this.field_K + this.field_O;
        this.field_J = (int)this.field_K;
        if (param0 != 11878) {
          this.updateForTunnelSegment(96, -128);
          if (this.field_J < uc.field_db.length) {
            return;
          }
          this.field_z = true;
          if (null != this.field_M) {
            this.field_M.field_t = null;
            return;
          }
          return;
        }
        if (this.field_J < uc.field_db.length) {
          return;
        }
        this.field_z = true;
        if (null == this.field_M) {
          return;
        }
        this.field_M.field_t = null;
    }

    final boolean canBeHitByProjectileRay(int param0) {
        if (param0 != 5) {
          field_G = (String) null;
          return false;
        }
        return false;
    }

    void onHomingProjectileContact(int param0, HomingProjectile param1) {
        try {
          if (param0 >= -29) {
            ShockwaveBlast var4 = (ShockwaveBlast) null;
            this.onShockwaveContact(-79, (ShockwaveBlast) null);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void onShockwaveContact(int param0, ShockwaveBlast param1) {
        try {
          if (param0 != -23154) {
            this.field_K = -0.9744507612027556;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void collectEntityLights(PrimaryNodeDeque param0, byte param1) {
        try {
          this.field_I.field_t = this.field_E;
          this.field_I.field_o = this.field_t;
          this.field_I.field_p = this.field_D;
          this.field_I.field_u = this.field_C * (this.field_C * (64.0 / (double)uc.field_db.length)) * ((double)uc.field_db.length - this.field_K);
          int var3_int = -113 % ((-2 - param1) / 62);
          param0.addLast((IntrusiveNode) (this.field_I), (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean participatesInEntityCollisions(byte param0) {
        if (param0 < 64) {
          field_P = -1;
          return false;
        }
        return false;
    }

    void onAcceleratingProjectileContact(int param0, AcceleratingProjectile param1) {
        try {
          int var3_int = 98 % ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawInTunnel(PrimaryNodeDeque param0, double param1, int param2, TunnelCamera param3, DynamicLight param4) {
        try {
          if (param2 >= -5) {
            field_G = (String) null;
          }
          this.a(-13, uc.field_db[this.field_J], param1, param3);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(ResourceArchive param0, String param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.ensureIndexLoaded(param2 + 12)) {
            stackIn_2_0 = (String) (param1);
            return stackIn_2_0;
          }
          if (param2 != -12) {
            field_G = (String) null;
          }
          stackIn_6_0 = param3 + " - " + param0.getArchiveLoadPercent(-123) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ka.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void dispatchEntityCollision(TunnelEntity param0, int param1) {
        try {
          if (param1 >= -81) {
            this.field_O = 2.3214224287080496;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean k(int param0) {
        if (param0 != -58) {
          return true;
        }
        return AccountServiceResult.field_h;
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_6_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 != 23617) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(97 + (var5 - 65));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ka.U(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    void onExpandingPulseContact(boolean param0, ExpandingPulseProjectile param1) {
        try {
          if (param0) {
            ShockwaveBlast var4 = (ShockwaveBlast) null;
            this.onShockwaveContact(98, (ShockwaveBlast) null);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
          field_G = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void onDampedProjectileContact(byte param0, DampedProjectile param1) {
        try {
          if (param0 != 9) {
            TunnelEntity var4 = (TunnelEntity) null;
            this.dispatchEntityCollision((TunnelEntity) null, 62);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean canBeTargetedBy(boolean param0, TunnelEntity param1) {
        RuntimeException var3 = null;
        PowerUpPickup var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (PowerUpPickup) null;
            this.onPowerUpContact((PowerUpPickup) null, (byte) -89);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean participatesInTunnelCollisions(int param0) {
        if (param0 != 8) {
          field_N = (ResourceArchive) null;
          return false;
        }
        return false;
    }

    void onPowerUpContact(PowerUpPickup param0, byte param1) {
        try {
          int var3_int = -120 / ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ka(GameSession param0, double param1, double param2, double param3, double param4, PcmSample param5) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var11 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_J = 0;
        this.field_K = 0.0;
        this.field_I = new DynamicLight((TunnelEntity) (this));
        try {
          this.field_O = (double)uc.field_db.length / (Math.pow(param4, 0.3333333333333333) * 64.0);
          if (param5 == null) {
            return;
          }
          this.field_M = new gk((TunnelEntity) (this), param5, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_7_0 = var11;
          stackIn_7_1 = new StringBuilder().append("ka.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        if (param0 != 0) {
          field_P = 76;
          field_G = null;
          field_N = null;
          field_F = null;
          return;
        }
        field_G = null;
        field_N = null;
        field_F = null;
    }

    final void onLightningArcContact(LightningArc param0, boolean param1) {
        try {
          if (!param1) {
            field_F = (byte[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void onProjectileHit(ProjectileRay param0, int param1) {
        try {
          if (param1 <= 122) {
            field_N = (ResourceArchive) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ka.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean h(byte param0) {
        ag.field_h = true;
        int var1 = -51 / ((param0 - 22) / 43);
        ClientException.field_e = ri.correctedCurrentTimeMillis(-3) + 15000L;
        return IntrusiveNode.field_e == 11 ? true : false;
    }

    static {
        field_L = 0;
        field_G = "Error connecting to server. Please try using a different server.";
    }
}
