/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwardVictoryToWinnerAction extends MissionAction implements DiffableState {
    static Sprite[] field_a;
    static int field_b;

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            field_b = 74;
          }
          super.readState(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "via.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_a = (Sprite[]) null;
        }
    }

    AwardVictoryToWinnerAction() {
    }

    final WorldPoint getWorldPosition(World param0, int param1) {
        RuntimeException var3 = null;
        WorldPoint stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26964) {
            return null;
          }
          stackIn_3_0 = (WorldPoint) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("via.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final String getDescription(int param0) {
        if (param0 != -1325) {
          SerializableGameState var3 = (SerializableGameState) null;
          this.reportDifferences((SerializableGameState) null, -23);
        }
        return "Award victory to the winning player";
    }

    final void execute(int param0, int[] param1, GameSnapshot param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        Player var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (param0 != 1) {
            this.getDescription(31);
          }
          var4_int = 0;
          var5 = -1;
          for (var6 = 0; var6 < param2.players.length; var6++) {
            var7 = param2.getPlayer(var6, (byte) 59);
            if (var7.connected ||
              SetMissionResnetResourceTickTime.field_p != 0) {
              if (var4_int < var7.kills) {
                var4_int = var7.kills;
                var5 = var6;
              } else {
                if (var4_int == var7.kills) {
                  var5 = -1;
                }
              }
            }
          }
          if (0 <= var5) {
            param2.missionState.finishRound(false, var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("via.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          super.writeState(param0, -127);
          if (param1 > -109) {
            GameSnapshot var4 = (GameSnapshot) null;
            this.execute(62, (int[]) null, (GameSnapshot) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "via.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        try {
          super.reportDifferences(other, -70);
          if (obfuscationGuard >= -19) {
            field_b = 108;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "via.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -17 / ((22 - param0) / 59);
          stackIn_1_0 = super.differsFrom((byte) 91, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("via.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        try {
          super.copyTo((byte) 86, param1);
          if (param0 <= 54) {
            this.getDescription(67);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "via.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 1;
    }
}
