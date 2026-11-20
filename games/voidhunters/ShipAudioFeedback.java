/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipAudioFeedback {
    private boolean selfDestructPrepared;
    private int lowEnergyWarningCooldown;
    private int previousEnergyProgress;
    private int trackedShipCount;
    private int lastSelfDestructSecond;
    private boolean reloading;
    private boolean selfDestructActive;

    final void updateEventSounds(int param0, int param1, GameSnapshot param2, Ship param3) {
        boolean stackIn_15_1 = false;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        boolean stackIn_58_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_68_1 = false;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Ship[] var9 = null;
        Ship[] var10_ref_sg__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Ship var12_ref_sg = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Ship var16 = null;
        int var11Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param1 != 84) {
            var16 = (Ship) null;
            this.refreshWarningSounds(-99, (GameSnapshot) null, (byte) -13, (Ship) null);
          }
          if (param3 == null) {
            this.reloading = false;
            this.previousEnergyProgress = 0;
            this.lastSelfDestructSecond = 0;
            this.trackedShipCount = 0;
            return;
          }
          var5_int = param3.isReloading((byte) -90) ? 1 : 0;
          if (this.reloading &&
            var5_int == 0) {
            GetNebulaFadesOutWhenClose.a(-112, PendingScoreboardRequest.soundEffects[18]);
          } else {
            if (var5_int != 0 &&
              !this.reloading) {
              GetNebulaFadesOutWhenClose.a(-86, PendingScoreboardRequest.soundEffects[10]);
            }
          }
          stackIn_15_1 = (var5_int != 0);
          this.reloading = stackIn_15_1;
          var6 = param3.getEnergyProgress(-55);
          var7 = 64;
          if (var6 < var7 &&
            var7 < this.previousEnergyProgress &&
            this.lowEnergyWarningCooldown <= 0) {
            GetNebulaFadesOutWhenClose.a(-87, PendingScoreboardRequest.soundEffects[16]);
            this.lowEnergyWarningCooldown = Particle.field_l;
          }
          if (this.lowEnergyWarningCooldown > 0) {
            this.lowEnergyWarningCooldown = this.lowEnergyWarningCooldown - 1;
          }
          this.previousEnergyProgress = var6;
          var8 = 0;
          var9 = param2.world.getShips(1000);
          var10_ref_sg__ = var9;
          for (var11 = 0; var10_ref_sg__.length > var11; var11++) {
            var12_ref_sg = var10_ref_sg__[var11];
            if (var12_ref_sg != null) {
              if (!var12_ref_sg.hasVisibilityFlag(2, (byte) -3)) {
                stackIn_32_0 = (!var12_ref_sg.hasVisibilityFlag(1, (byte) 69)) ? 1 : 0;
              } else {
                stackIn_32_0 = 0;
              }
              var13 = stackIn_32_0;
              if (var12_ref_sg.getTeam((byte) 98) == param3.getTeam((byte) 65)) {
                if (!ConsoleCharacterStream.a(param1 ^ 57, param2.world.getObjectiveType(false))) {
                  if (var12_ref_sg.getOwner((byte) -117) != param3.getOwner((byte) -117)) {
                    if (null != var12_ref_sg.getAi((byte) -108)) {
                      stackIn_44_0 = (var12_ref_sg.getAi((byte) -108).getParentPlayerId((byte) 127) != param0) ? 1 : 0;
                    } else {
                      stackIn_44_0 = 1;
                    }
                  } else {
                    stackIn_44_0 = 0;
                  }
                } else {
                  stackIn_44_0 = 0;
                }
              } else {
                stackIn_44_0 = 1;
              }
              var14 = stackIn_44_0;
              if (var13 != 0 &&
                var14 != 0) {
                var8++;
              }
            }
          }
          if (this.trackedShipCount < var8) {
            GetNebulaFadesOutWhenClose.a(param1 - 186, PendingScoreboardRequest.soundEffects[9]);
          }
          this.trackedShipCount = var8;
          var10 = param3.getSelfDestructPrepared((byte) -86) ? 1 : 0;
          if (var10 != 0 &&
            !this.selfDestructPrepared) {
            GetNebulaFadesOutWhenClose.a(-90, PendingScoreboardRequest.soundEffects[83]);
          }
          stackIn_58_1 = (var10 != 0);
          this.selfDestructPrepared = stackIn_58_1;
          stackIn_61_0 = (!param3.isSpecialOrderActive(9, 47)) ? 0 : 1;
          var11Lifetime1 = stackIn_61_0;
          if (var11Lifetime1 != 0 &&
            !this.selfDestructActive) {
            GetNebulaFadesOutWhenClose.a(-103, PendingScoreboardRequest.soundEffects[84]);
          }
          stackIn_68_1 = (var11Lifetime1 != 0);
          this.selfDestructActive = stackIn_68_1;
          if (var11Lifetime1 == 0) {
            return;
          }
          var12 = param3.getTimeUntilSelfDestructEffect(8) / Particle.field_l;
          if (var12 < 0) {
            var12 = 0;
          }
          if (this.lastSelfDestructSecond > var12) {
            GetNebulaFadesOutWhenClose.a(-98, PendingScoreboardRequest.soundEffects[85]);
          }
          this.lastSelfDestructSecond = var12;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("npb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final void refreshWarningSounds(int param0, GameSnapshot param1, byte param2, Ship param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Ship var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != null) {
            var5_int = param3.getHealthProgress(0);
            if (var5_int < 64) {
              GetBombletSprayProjectileDamage.refreshLoopingSound(15, 0, (byte) -53);
            }
            if (param1.world.hasHomingProjectileTargeting(param3.getId(false), -71)) {
              GetBombletSprayProjectileDamage.refreshLoopingSound(86, 0, (byte) -109);
            }
          }
          if (param2 == 70) {
            return;
          }
          var6 = (Ship) null;
          this.refreshWarningSounds(29, (GameSnapshot) null, (byte) -95, (Ship) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("npb.A(").append(param0).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
