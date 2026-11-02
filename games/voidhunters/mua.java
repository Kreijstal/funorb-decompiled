/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mua extends ComponentBehaviour implements DiffableState {
    private boolean operationalLastFrame;
    static int field_d;
    private int previousShieldX;
    private int previousShieldY;

    final void a(boolean param0, int param1, ShipBody param2, int[] param3, World param4, int param5, int param6, int param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var9 = null;
        RuntimeException var9_ref = null;
        uwa var10 = null;
        int var11 = 0;
        int var12 = 0;
        Ship var13 = null;
        try {
          var9 = null;
          if (!(param2 instanceof Ship)) {
            if (this.operationalLastFrame) {
              this.operationalLastFrame = false;
              param2.d((byte) 59);
            }
            return;
          }
          var13 = (Ship) (param2);
          if (param6 <= 74) {
            return;
          }
          if (!param0 &&
            var13.getShieldsOn(31390)) {
            var13.t((byte) -112);
            if (var13.getShieldsOn(31390)) {
              var10 = ccb.field_a.a(0);
              var11 = 0;
              var12 = 0;
              if (this.operationalLastFrame) {
                var11 = -this.previousShieldX + param7;
                var12 = -this.previousShieldY + param1;
              }
              var10.a(SetMissileLauncherFireForce.field_q, param1, param7, rjb.field_u, 0, var11, (byte) 38, param2, param5, var12);
              this.operationalLastFrame = true;
              this.previousShieldY = param1;
              this.previousShieldX = param7;
              param2.d((byte) 80);
            }
            return;
          }
          if (this.operationalLastFrame) {
            this.operationalLastFrame = false;
            param2.d((byte) 113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_22_0 = var9_ref;
          stackIn_22_1 = new StringBuilder().append("mua.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(ShipBody param0, int[] param1, int param2, int param3, int param4, int param5, int param6, World param7, int param8, int param9, int param10) {
        Ship var13 = null;
        Object var12 = null;
        if (param0 instanceof Ship) {
          var13 = (Ship) (param0);
          var13.m(-13539);
        } else {
          return;
        }
        try {
          if (param2 != -9151) {
            field_d = 75;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mua.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        mua var6 = null;
        try {
          if (obfuscationGuard > -19) {
            var5 = (tv) null;
            this.a((byte) 121, (tv) null);
          }
          var6 = (mua) (other);
          super.reportDifferences(other, -50);
          var4 = 0;
          stackIn_5_0 = (var6.operationalLastFrame) ? 0 : 1;
          if (stackIn_5_0 == (this.operationalLastFrame ? 1 : 0)) {
            var4 = 1;
            System.out.println("boolean operational_last_frame has changed. before=" + var6.operationalLastFrame + ", now=" + this.operationalLastFrame);
          }
          if (this.previousShieldX != var6.previousShieldX) {
            System.out.println("int previous_shield_x has changed. before=" + var6.previousShieldX + ", now=" + this.previousShieldX);
            var4 = 1;
          }
          if (var6.previousShieldY != this.previousShieldY) {
            System.out.println("int previous_shield_y has changed. before=" + var6.previousShieldY + ", now=" + this.previousShieldY);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of ShieldBehaviour has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("mua.F(");
          if (other == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        mua var6 = null;
        mua var7 = null;
        try {
          if (param0 <= 54) {
            World var4 = (World) null;
            this.a((ShipBody) null, (int[]) null, -13, 109, 122, -45, -75, (World) null, -117, 73, 98);
          }
          super.b((byte) 85, param1);
          var6 = (mua) (param1);
          var7 = var6;
          var7.operationalLastFrame = this.operationalLastFrame;
          var7.previousShieldY = this.previousShieldY;
          var7.previousShieldX = this.previousShieldX;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -120);
          vq.a(param0, 120, this.operationalLastFrame);
          param0.a(-632, this.previousShieldX, 32);
          if (param1 >= -109) {
            this.operationalLastFrame = false;
          }
          param0.a(-632, this.previousShieldY, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, false);
          this.operationalLastFrame = kv.a(param1, param0);
          this.previousShieldX = param0.i(0, 32);
          this.previousShieldY = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mua.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        mua var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (mua) (param1);
          var4 = -29 % ((22 - param0) / 59);
          if (!super.a((byte) 93, param1)) {
            stackIn_4_0 = (this.operationalLastFrame) ? 0 : 1;
            if (stackIn_4_0 != (var3.operationalLastFrame ? 1 : 0) &&
              this.previousShieldX == var3.previousShieldX &&
              this.previousShieldY == var3.previousShieldY) {
              stackIn_10_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_10_0 = true;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("mua.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0, Ship param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 73) {
            this.previousShieldY = 89;
          }
          stackIn_3_0 = param1.l(-465);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mua.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public mua() {
    }

    static {
    }
}
