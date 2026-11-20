/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RemoveEventAction extends MissionAction implements DiffableState {
    static dpb field_a;

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          super.readState(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oca.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        try {
          if (param0 <= 54) {
            this.getDescription(-78);
          }
          super.copyTo((byte) 63, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oca.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final WorldPoint getWorldPosition(World param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26964) {
            return null;
          }
          field_a = (dpb) null;
          stackIn_3_0 = null;
          return (WorldPoint) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oca.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 90 / ((param0 + 87) / 38);
        field_a = null;
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
          var3_int = 110 % ((22 - param0) / 59);
          stackIn_1_0 = super.differsFrom((byte) 95, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("oca.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 >= -109) {
            RemoveEventAction.clearSharedReferences(49);
          }
          super.writeState(param0, -110);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oca.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        try {
          if (obfuscationGuard >= -19) {
            field_a = (dpb) null;
          }
          super.reportDifferences(other, -68);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oca.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void execute(int param0, int[] param1, GameSnapshot param2) {
        try {
          if (param0 != 1) {
            IsaacPacketBuffer var5 = (IsaacPacketBuffer) null;
            this.readState((IsaacPacketBuffer) null, true);
          }
          param2.world.getMissionControl(0).c((byte) 55);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oca.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String getDescription(int param0) {
        if (param0 != -1325) {
          return (String) null;
        }
        return "Remove this event";
    }

    public RemoveEventAction() {
    }

    static {
        field_a = new dpb();
    }
}
