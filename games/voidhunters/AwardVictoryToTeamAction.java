/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwardVictoryToTeamAction extends MissionAction implements DiffableState {
    static int[] field_c;
    static int[] field_a;
    private int team;

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        AwardVictoryToTeamAction var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (AwardVictoryToTeamAction) (param1);
          var4 = -69 % ((param0 - 22) / 59);
          stackIn_5_0 = (super.differsFrom((byte) -127, param1)) || (this.team != var3.team);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("ika.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final String getDescription(int param0) {
        if (param0 == -1325) {
          return "Award victory to team " + this.team;
        }
        this.getDescription(-23);
        return "Award victory to team " + this.team;
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          super.readState(param0, param1);
          this.team = param0.readBits(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ika.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        AwardVictoryToTeamAction var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -93);
          var3 = (AwardVictoryToTeamAction) (other);
          var4 = 0;
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.team != var3.team) {
            var4 = 1;
            System.out.println("int team has changed. before=" + var3.team + ", now=" + this.team);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionActionAwardVictory has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ika.F(");
          if (other == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.copyTo((byte) -5, (SerializableGameState) null);
          }
          super.writeState(param0, -119);
          param0.writeBits(-632, this.team, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ika.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static TextureRectangleShape decodeTextureRectangleShape(int param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        TextureRectangleShape stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 32) {
            AwardVictoryToTeamAction.a(42, true);
          }
          stackIn_3_0 = new TextureRectangleShape(param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readUnsignedMedium((byte) -75), param1.readUnsignedMedium((byte) -94), param1.readUnsignedByte((byte) -119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ika.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
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
          stackIn_7_1 = new StringBuilder().append("ika.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getParameter(int param0, int param1) {
        if (param1 > -100) {
          this.team = -95;
          return this.team;
        }
        return this.team;
    }

    final static void a(int param0, boolean param1) {
        LogoMaterial.openDisplayModeDialog((byte) 116);
        if (param0 != -356) {
          PacketBuffer var3 = (PacketBuffer) null;
          AwardVictoryToTeamAction.decodeTextureRectangleShape(-32, (PacketBuffer) null);
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        AwardVictoryToTeamAction var4 = (AwardVictoryToTeamAction) (param1);
        AwardVictoryToTeamAction var3 = var4;
        super.copyTo((byte) 80, param1);
        if (param0 <= 54) {
          return;
        }
        try {
          var4.team = this.team;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ika.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          field_a = (int[]) null;
        }
    }

    final void setParameter(World param0, boolean param1, int param2, int param3) {
        try {
          this.team = param3;
          if (param1) {
            AwardVictoryToTeamAction.a(30, true);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ika.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public AwardVictoryToTeamAction() {
    }

    AwardVictoryToTeamAction(int param0) {
        this.team = param0;
    }

    final void execute(int param0, int[] param1, GameSnapshot param2) {
        try {
          SetGrapplingHookCooldown.a(202, "wins_for_team_" + this.team, param0);
          param2.missionState.finishRound(false, this.team);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ika.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[2];
        field_a = new int[1];
    }
}
