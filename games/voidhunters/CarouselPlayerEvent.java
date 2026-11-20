/*
 * Decompiled by CFR-JS 0.4.0.
 */
class CarouselPlayerEvent extends CarouselEvent implements DiffableState {
    int playerId;
    static SpecialOrderDefinition[] specialOrderDefinitions;
    static String field_l;
    static int field_j;
    static int field_m;

    public void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          super.writeState(param0, -121);
          if (param1 >= -109) {
            field_m = -29;
          }
          this.writePlayerId((byte) -121, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pca.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void readPlayerId(IsaacPacketBuffer param0, int param1) {
        RuntimeException var3 = null;
        IsaacPacketBuffer var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (IsaacPacketBuffer) null;
            this.writeState((IsaacPacketBuffer) null, -21);
          }
          if (!SetDebrisProjectileCollision.field_o) {
            return;
          }
          this.playerId = param0.readBits(param1 + 0, EnvironmentReflectionGpuMaterialEffect.field_h);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pca.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public void copyTo(byte param0, SerializableGameState param1) {
        CarouselPlayerEvent var5 = null;
        CarouselPlayerEvent var6 = null;
        if (param0 < 54) {
          return;
        }
        try {
          var5 = (CarouselPlayerEvent) (param1);
          var6 = var5;
          super.copyTo((byte) 126, param1);
          var6.playerId = this.playerId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pca.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void writePlayerId(byte param0, IsaacPacketBuffer param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -116) {
            CarouselPlayerEvent.matchesVertexDataMask(-90, -61, 89);
          }
          if (!SetDebrisProjectileCollision.field_o) {
            return;
          }
          param1.writeBits(-632, this.playerId, EnvironmentReflectionGpuMaterialEffect.field_h);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pca.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    protected CarouselPlayerEvent() {
    }

    public void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        CarouselPlayerEvent var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.reportDifferences(other, -22);
          var3 = (CarouselPlayerEvent) (other);
          var4 = 0;
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.playerId != var3.playerId) {
            GetSniperCannonAimarc.a(-6940, "int playerid has changed. before=" + var3.playerId + ", now=" + this.playerId);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          GetSniperCannonAimarc.a(-6940, "This instance of CarouselPlayerEvent has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("pca.F(");
          if (other == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        CarouselPlayerEvent var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -110 / ((param0 - 22) / 59);
          var4 = (CarouselPlayerEvent) (param1);
          stackIn_5_0 = (super.differsFrom((byte) -50, param1)) || (this.playerId != var4.playerId);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pca.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.reportDifferences((SerializableGameState) null, -35);
          }
          super.readState(param0, param1);
          this.readPlayerId(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pca.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean matchesVertexDataMask(int param0, int param1, int param2) {
        if (param0 >= 1) {
          return 0 != (param1 & 34) ? true : false;
        }
        CarouselPlayerEvent.clearSharedReferences(40);
        return 0 != (param1 & 34) ? true : false;
    }

    public static void clearSharedReferences(int param0) {
        field_l = null;
        specialOrderDefinitions = null;
        int var1 = -58 % ((-48 - param0) / 44);
    }

    static {
        field_l = "More standard weapons";
        field_j = 0;
        field_m = 1;
    }
}
