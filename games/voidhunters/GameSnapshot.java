/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSnapshot extends tja implements DiffableState, utb {
    MissionState missionState;
    SettingsInstance settings;
    World world;
    MessageLog messageLog;

    public final void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -128);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -90;
          stackIn_3_2 = (this.world != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.world.b(param0, -113);
          }
          stackIn_8_0 = (faa) (param0);
          stackIn_8_1 = 46;
          stackIn_9_2 = (null != this.settings);
          if (vq.a(stackIn_8_0, stackIn_8_1, stackIn_9_2)) {
            this.settings.b(param0, -128);
          }
          stackIn_14_0 = (faa) (param0);
          stackIn_14_1 = 62;
          stackIn_15_2 = (null != this.missionState);
          if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_15_2)) {
            this.missionState.b(param0, -110);
          }
          if (param1 > -109) {
            this.world = (World) null;
          }
          stackIn_21_0 = (faa) (param0);
          stackIn_21_1 = -93;
          stackIn_22_2 = (this.messageLog != null);
          if (vq.a(stackIn_21_0, stackIn_21_1, stackIn_22_2)) {
            this.messageLog.b(param0, -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("rsb.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int[] var10Lifetime1;
        int[] var10Lifetime2;
        int[] var10Lifetime3;
        var7 = VoidHunters.field_G;
        if (param0 < 0) {
          return false;
        }
        if (param0 > 1) {
          return false;
        }
        var10 = new int[2];
        var9 = var10;
        var8 = var9;
        var4 = var8;
        for (var5 = 0; var5 < this.field_c.length; var5++) {
          if (this.field_c[var5].field_a ||
            SetMissionResnetResourceTickTime.field_p == 1) {
            var10Lifetime1 = var9;
            var6 = ((Player) (this.field_c[var5])).selectedTeam;
            if (0 <= var6 &&
              var10Lifetime1.length > var6) {
              var8[var6] = var8[var6] + 1;
            }
          }
        }
        var10Lifetime2 = var9;
        var10Lifetime3 = var9;
        if (param2 >= param1 &&
          param2 < var10Lifetime3.length) {
          var8[param2] = var8[param2] - 1;
        }
        var5Lifetime1 = 2147483647;
        for (var6Lifetime1 = 0; var6Lifetime1 < var10Lifetime3.length; var6Lifetime1++) {
          if (var5Lifetime1 > var10Lifetime3[var6Lifetime1]) {
            var5Lifetime1 = var10Lifetime3[var6Lifetime1];
          }
        }
        stackIn_33_0 = (var5Lifetime1 >= var10Lifetime3[param0]) ? 1 : 0;
        var6Lifetime2 = stackIn_33_0;
        return var6Lifetime2 != 0;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, param1);
          if (!kv.a(false, param0)) {
            this.world = null;
          } else {
            if (this.world == null) {
              this.world = new World();
            }
            this.world.a(param0, false);
          }
          if (kv.a(param1, param0)) {
            if (null == this.settings) {
              this.settings = new SettingsInstance();
            }
            this.settings.a(param0, param1);
          } else {
            this.settings = null;
          }
          if (!kv.a(param1, param0)) {
            this.missionState = null;
          } else {
            if (this.missionState == null) {
              this.missionState = new MissionState();
            }
            this.missionState.a(param0, false);
          }
          if (kv.a(false, param0)) {
            if (this.messageLog == null) {
              this.messageLog = new MessageLog();
            }
            this.messageLog.a(param0, false);
          } else {
            this.messageLog = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("rsb.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        super.a(param0, 122);
        if (param1 <= 93) {
          faa var4 = (faa) null;
          this.a((faa) null, -44);
        }
        this.world = new World(param0);
        this.settings = new SettingsInstance();
        this.missionState = new MissionState();
        this.messageLog = new MessageLog();
    }

    final Player a(int param0, byte param1) {
        if (param1 != 59) {
          tv var4 = (tv) null;
          this.reportDifferences((tv) null, -70);
        }
        if (param0 < 0) {
          return null;
        }
        if (param0 >= this.field_c.length) {
          return null;
        }
        return (Player) (this.field_c[param0]);
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        GameSnapshot var6 = null;
        GameSnapshot var7 = null;
        var4 = VoidHunters.field_G;
        try {
          super.b((byte) 115, param1);
          var6 = (GameSnapshot) (param1);
          var7 = var6;
          if (null != this.world) {
            if (null == var7.world) {
              var7.world = new World();
            }
            this.world.b((byte) 125, var7.world);
          } else {
            var6.world = null;
          }
          if (this.settings != null) {
            if (var7.settings == null) {
              var7.settings = new SettingsInstance();
            }
            this.settings.b((byte) 96, var7.settings);
          } else {
            var7.settings = null;
          }
          if (param0 <= 54) {
            var5 = (faa) null;
            this.b((faa) null, 64);
          }
          if (null != this.missionState) {
            if (null == var7.missionState) {
              var7.missionState = new MissionState();
            }
            this.missionState.b((byte) 91, var7.missionState);
          } else {
            var7.missionState = null;
          }
          if (this.messageLog == null) {
            var7.messageLog = null;
          } else {
            if (null == var7.messageLog) {
              var7.messageLog = new MessageLog();
            }
            this.messageLog.b((byte) 87, var7.messageLog);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("rsb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        GameSnapshot var5 = null;
        try {
          super.reportDifferences(other, -68);
          var5 = (GameSnapshot) (other);
          if (this.world != null &&
            null != var5.world) {
            this.world.reportDifferences(var5.world, -97);
          }
          if (this.settings != null &&
            var5.settings != null) {
            this.settings.reportDifferences(var5.settings, -89);
          }
          if (null != this.missionState &&
            null != var5.missionState) {
            this.missionState.reportDifferences(var5.missionState, -88);
          }
          if (null != this.messageLog &&
            null != var5.messageLog) {
            this.messageLog.reportDifferences(var5.messageLog, -64);
          }
          var4 = 0;
          stackIn_18_0 = (null != var5.world) ? 0 : 1;
          if (null != this.world) {
            stackIn_21_1 = 0;
          } else {
            stackIn_21_1 = 1;
          }
          if ((stackIn_18_0 ^ stackIn_21_1) != 0 ||
            this.world != null &&
            this.world.a((byte) 81, var5.world)) {
            System.out.println("World world has changed. before=" + var5.world + ", now=" + this.world);
            var4 = 1;
          }
          stackIn_29_0 = (null != var5.settings) ? 0 : 1;
          if (this.settings != null) {
            stackIn_32_1 = 0;
          } else {
            stackIn_32_1 = 1;
          }
          if ((stackIn_29_0 ^ stackIn_32_1) != 0 ||
            null != this.settings &&
            this.settings.a((byte) -103, var5.settings)) {
            System.out.println("SettingsInstance settings has changed. before=" + var5.settings + ", now=" + this.settings);
            var4 = 1;
          }
          stackIn_40_0 = (this.missionState != null) ? 0 : 1;
          if (null != var5.missionState) {
            stackIn_43_1 = 0;
          } else {
            stackIn_43_1 = 1;
          }
          if ((stackIn_40_0 ^ stackIn_43_1) != 0 ||
            null != this.missionState &&
            this.missionState.a((byte) -88, var5.missionState)) {
            var4 = 1;
            System.out.println("MissionState mission_state has changed. before=" + var5.missionState + ", now=" + this.missionState);
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          stackIn_53_0 = (null != this.messageLog) ? 0 : 1;
          if (var5.messageLog != null) {
            stackIn_56_1 = 0;
          } else {
            stackIn_56_1 = 1;
          }
          if ((stackIn_53_0 ^ stackIn_56_1) != 0 ||
            null != this.messageLog &&
            this.messageLog.a((byte) -115, var5.messageLog)) {
            var4 = 1;
            System.out.println("MessageLog message_log has changed. before=" + var5.messageLog + ", now=" + this.messageLog);
          }
          if (var4 != 0) {
            System.out.println("This instance of MyCarouselSlot has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("rsb.F(");
          if (other == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(tja param0, int param1, int param2, boolean param3) {
        Player var6 = null;
        int var8 = 0;
        int var5_int = 0;
        int var7 = VoidHunters.field_G;
        int var5_intLifetime1;
        try {
          ka.a(param1, param2 ^ -19265);
          this.settings.a((byte) 125);
          this.world.a(1799937864, param3, this.messageLog, (Player[]) (param0.field_c), this.missionState, param1, (Player[]) (this.field_c));
          this.missionState.a(this, param1, (byte) -19);
          if (param2 == fra.field_a) {
            for (var5_int = 0; this.field_c.length > var5_int; var5_int++) {
              var6 = (Player) (this.field_c[var5_int]);
              var6.triggers = -17 & var6.triggers;
            }
          }
          if (null != this.field_c) {
            var8 = 0;
            var5_intLifetime1 = var8;
            while (this.field_c.length > var8) {
              if (this.field_c[var8] != null) {
                ((Player) (this.field_c[var8])).c((byte) 11);
              }
              var8++;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rsb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(faa param0, int param1) {
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, false);
          if (param1 != 32) {
            return;
          }
          if (kv.a(false, param0)) {
            if (null == this.world) {
              this.world = new World();
            }
            this.world.a(param0, 32);
          } else {
            this.world = null;
          }
          if (!kv.a(false, param0)) {
            this.settings = null;
          } else {
            if (null == this.settings) {
              this.settings = new SettingsInstance();
            }
            this.settings.a(param0, false);
          }
          if (!kv.a(false, param0)) {
            this.missionState = null;
          } else {
            if (this.missionState == null) {
              this.missionState = new MissionState();
            }
            this.missionState.a(param0, false);
          }
          if (kv.a(false, param0)) {
            if (this.messageLog == null) {
              this.messageLog = new MessageLog();
            }
            this.messageLog.a(param0, false);
          } else {
            this.messageLog = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("rsb.L(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -118);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -121;
          stackIn_3_2 = (this.world != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.world.a(param0, (byte) -126);
          }
          if (param1 >= -91) {
            return;
          }
          stackIn_10_0 = (faa) (param0);
          stackIn_10_1 = -53;
          stackIn_11_2 = (null != this.settings);
          if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
            this.settings.b(param0, -127);
          }
          stackIn_15_0 = (faa) (param0);
          stackIn_15_1 = -88;
          stackIn_16_2 = (this.missionState != null);
          if (vq.a(stackIn_15_0, stackIn_15_1, stackIn_16_2)) {
            this.missionState.b(param0, -127);
          }
          stackIn_20_0 = (faa) (param0);
          stackIn_20_1 = 91;
          stackIn_21_2 = (this.messageLog != null);
          if (vq.a(stackIn_20_0, stackIn_20_1, stackIn_21_2)) {
            this.messageLog.b(param0, -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("rsb.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        boolean stackIn_43_0 = false;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        GameSnapshot var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -114 / ((param0 - 22) / 59);
          var5 = (GameSnapshot) (param1);
          if (!super.a((byte) -123, param1)) {
            stackIn_4_0 = (var5.world != null) ? 0 : 1;
            if (this.world != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (null == this.world ||
              !this.world.a((byte) -127, var5.world))) {
              stackIn_14_0 = (this.settings != null) ? 0 : 1;
              if (null != var5.settings) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.settings == null ||
                !this.settings.a((byte) 87, var5.settings))) {
                stackIn_24_0 = (this.missionState != null) ? 0 : 1;
                if (null != var5.missionState) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if ((stackIn_24_0 ^ stackIn_27_1) == 0 && (null == this.missionState ||
                  !this.missionState.a((byte) 90, var5.missionState))) {
                  stackIn_34_0 = (null != this.messageLog) ? 0 : 1;
                  if (var5.messageLog != null) {
                    stackIn_37_1 = 0;
                  } else {
                    stackIn_37_1 = 1;
                  }
                  if ((stackIn_34_0 ^ stackIn_37_1) == 0 && (this.messageLog == null ||
                    !this.messageLog.a((byte) 124, var5.messageLog))) {
                    stackIn_43_0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_43_0 = true;
          }
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_46_0 = var3;
          stackIn_46_1 = new StringBuilder().append("rsb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    GameSnapshot() {
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        Player var4 = null;
        int var5 = VoidHunters.field_G;
        for (var3 = 0; this.field_c.length > var3; var3++) {
          var4 = (Player) (this.field_c[var3]);
          var4.specialorder = -1;
        }
        if (param0) {
          this.missionState = (MissionState) null;
        }
        this.messageLog.a(81, param1);
    }

    static {
    }
}
