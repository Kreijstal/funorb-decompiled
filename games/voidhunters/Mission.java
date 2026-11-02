/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Mission implements DiffableState {
    private World savedState;

    public final void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = 81;
          stackIn_3_2 = (this.savedState != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.savedState.b(param0, -120);
          }
          if (param1 >= -109) {
            this.savedState = (World) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hkb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          Mission.b(36);
        }
        stackIn_7_0 = (ar.field_d) || (GetPhasedEnergyBeamPulsetime.e((byte) 103));
        return stackIn_7_0;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        Mission var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -104 % ((22 - param0) / 59);
          var4 = (Mission) (param1);
          stackIn_3_0 = (null != this.savedState) ? 0 : 1;
          if (null != var4.savedState) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && (this.savedState == null ||
            !this.savedState.a((byte) 96, var4.savedState))) {
            stackIn_12_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_12_0 = true;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hkb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
          Mission.b(29);
        }
        return this.savedState.d(false);
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (kv.a(param1, param0)) {
            if (null == this.savedState) {
              this.savedState = new World();
            }
            this.savedState.a(param0, false);
          } else {
            this.savedState = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hkb.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        Mission var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 <= 54) {
            return;
          }
          var3 = (Mission) (param1);
          if (null == this.savedState) {
            var3.savedState = null;
          } else {
            if (null == var3.savedState) {
              var3.savedState = new World();
            }
            this.savedState.b((byte) 108, var3.savedState);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("hkb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int var4 = 0;
        tv var5 = null;
        Mission var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var6 = (Mission) (other);
          if (obfuscationGuard > -19) {
            var5 = (tv) null;
            this.reportDifferences((tv) null, 5);
          }
          if (this.savedState != null &&
            var6.savedState != null) {
            this.savedState.reportDifferences(var6.savedState, -32);
          }
          var4 = 0;
          stackIn_8_0 = (this.savedState != null) ? 0 : 1;
          if (var6.savedState != null) {
            stackIn_11_1 = 0;
          } else {
            stackIn_11_1 = 1;
          }
          if ((stackIn_8_0 ^ stackIn_11_1) != 0 ||
            this.savedState != null &&
            this.savedState.a((byte) 82, var6.savedState)) {
            var4 = 1;
            System.out.println("World saved_state has changed. before=" + var6.savedState + ", now=" + this.savedState);
          }
          if (var4 != 0) {
            System.out.println("This instance of Mission has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("hkb.F(");
          if (other == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(boolean param0, GameSnapshot param1, int param2) {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Ship[] var5_ref_sg__ = null;
        int var5 = 0;
        Ship[] var6_ref_sg__ = null;
        int var6 = 0;
        Ship var8 = null;
        Player var9 = null;
        int var10 = 0;
        World var11 = null;
        var10 = VoidHunters.field_G;
        try {
          var11 = param1.world;
          if (param0) {
            var5_ref_sg__ = var11.getShips(1000);
            var6_ref_sg__ = var5_ref_sg__;
            for (var7 = 0; var7 < var6_ref_sg__.length; var7++) {
              var8 = var6_ref_sg__[var7];
              if (var8 != null &&
                var8.getOwner((byte) -117) >= 0 &&
                !var8.l((byte) -10)) {
                if (SetMachineGunAimspeed.field_o == 0) {
                  var8.h(17704, 2);
                }
                var9 = param1.a(var8.getOwner((byte) -117), (byte) 59);
                if (null == var9.savedShip) {
                  var9.savedShip = new Ship();
                }
                var8.b((byte) 92, var9.savedShip);
                var9.savedShip.u(-14);
              }
            }
          }
          var5 = var11.f(24797);
          this.savedState.b((byte) 58, var11);
          var6 = -74 / ((param2 - 66) / 59);
          var11.b(-123, false);
          var11.a(0, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("hkb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    Mission() {
    }

    Mission(World param0) {
        try {
          this.savedState = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hkb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
