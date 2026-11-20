/*
 * Decompiled by CFR-JS 0.4.0.
 */
class CarouselPlayerInfo implements DiffableState {
    boolean connected;

    public boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CarouselPlayerInfo var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -73 % ((param0 - 22) / 59);
          var4 = (CarouselPlayerInfo) (param1);
          stackIn_3_0 = (this.connected) ? 0 : 1;
          if (var4.connected) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          stackIn_9_0 = (stackIn_3_0 != stackIn_6_1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void onLeave(boolean param0, CarouselSlot param1, int param2, int param3) {
        try {
          if (!param0) {
            CarouselSlot var6 = (CarouselSlot) null;
            this.onLeave(true, (CarouselSlot) null, -49, 117);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bha.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        CarouselPlayerInfo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -19) {
            this.connected = true;
          }
          var3 = (CarouselPlayerInfo) (other);
          var4 = 0;
          stackIn_4_0 = this.connected;
          if (var3.connected) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            var4 = 1;
            GetSniperCannonAimarc.a(-6940, "boolean connected has changed. before=" + var3.connected + ", now=" + this.connected);
          }
          if (var4 == 0) {
            return;
          }
          SetDebrisGrabbingRange.a((byte) -73, "This instance of CarouselPlayerInfo has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bha.F(");
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          this.connected = LegacyOpenGlSpecularEffect.readBoolean(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void onJoin(CarouselSlot param0, int param1, int param2, int param3) {
        try {
          if (param2 != -24354) {
            this.connected = true;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bha.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
            this.readState((IsaacPacketBuffer) null, true);
          }
          DateOfBirthInput.writeBoolean(param0, -82, this.connected);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void copyTo(byte param0, SerializableGameState param1) {
        CarouselPlayerInfo var5 = null;
        CarouselPlayerInfo var6 = null;
        if (param0 <= 54) {
          return;
        }
        try {
          var5 = (CarouselPlayerInfo) (param1);
          var6 = var5;
          var6.connected = this.connected;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
