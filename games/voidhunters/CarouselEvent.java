/*
 * Decompiled by CFR-JS 0.4.0.
 */
class CarouselEvent extends IntrusiveNode implements DiffableState {
    boolean confirmed;
    static int field_h;
    int tick;
    CarouselSystemEvent systemEvent;
    boolean pendingApplication;

    public void writeState(IsaacPacketBuffer param0, int param1) {
        RuntimeException var3 = null;
        IsaacPacketBuffer stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.writeBits(-632, this.tick, SetMissilesTopSpeed.field_p);
          if (param1 >= -109) {
            return;
          }
          stackIn_4_0 = (IsaacPacketBuffer) (param0);
          stackIn_4_1 = 59;
          stackIn_5_2 = (this.systemEvent != null);
          if (!vq.writeBoolean(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            return;
          }
          this.systemEvent.writeState(param0, -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uqb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyTo(byte param0, PlayerNameRegistry param1, CarouselSlot param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        SerializableGameState var7 = null;
        PlayerJoin var8 = null;
        CarouselPlayerInfo var9 = null;
        PlayerLeave var10 = null;
        CarouselPlayerInfo var11 = null;
        try {
          if (param0 >= -111) {
            var7 = (SerializableGameState) null;
            this.differsFrom((byte) 62, (SerializableGameState) null);
          }
          if (this.systemEvent != null &&
            this.systemEvent.field_e != null) {
            var8 = this.systemEvent.field_e;
            var5 = var8.field_a;
            var9 = param2.players[var5];
            if (param1 != null) {
              param1.setPlayerName(var8.field_b, var5, (byte) -117);
            }
            var9.connected = true;
            var9.onJoin(param2, var5, -24354, this.tick);
            GetSniperCannonAimarc.a(-6940, "CarouselEvent: Applied join for " + var8.field_b);
          } else {
            if (null != this.systemEvent &&
              this.systemEvent.field_d != null) {
              var10 = this.systemEvent.field_d;
              var5 = var10.field_d;
              var11 = param2.players[var5];
              var11.connected = false;
              var11.onLeave(true, param2, this.tick, var5);
              GetSniperCannonAimarc.a(-6940, "CarouselEvent: Applied leave for player " + var5);
            }
          }
          if (null != this.systemEvent) {
            return;
          }
          this.applyCustomEvent(param1, 0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("uqb.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public boolean differsFrom(byte param0, SerializableGameState param1) {
        CarouselEvent var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (CarouselEvent) (param1);
          var4 = 72 % ((22 - param0) / 59);
          if (var3.tick == this.tick) {
            stackIn_4_0 = (this.systemEvent != null) ? 0 : 1;
            if (var3.systemEvent != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (null == this.systemEvent ||
              !this.systemEvent.differsFrom((byte) 121, var3.systemEvent))) {
              stackIn_13_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_13_0 = true;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        IsaacPacketBuffer var5 = null;
        CarouselEvent var6 = null;
        try {
          var6 = (CarouselEvent) (other);
          var4 = 0;
          if (this.tick != var6.tick) {
            GetSniperCannonAimarc.a(-6940, "int tick has changed. before=" + var6.tick + ", now=" + this.tick);
            var4 = 1;
          }
          if (obfuscationGuard > -19) {
            var5 = (IsaacPacketBuffer) null;
            this.writeState((IsaacPacketBuffer) null, 67);
          }
          if (this.systemEvent != null &&
            null != var6.systemEvent) {
            this.systemEvent.reportDifferences(var6.systemEvent, -70);
          }
          stackIn_12_0 = (null != this.systemEvent) ? 0 : 1;
          if (var6.systemEvent != null) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_12_0 ^ stackIn_15_1) != 0 ||
            this.systemEvent != null &&
            this.systemEvent.differsFrom((byte) 108, var6.systemEvent)) {
            var4 = 1;
            GetSniperCannonAimarc.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6.systemEvent + ", now=" + this.systemEvent);
          }
          if (var4 == 0) {
            return;
          }
          SetDebrisGrabbingRange.a((byte) -78, "This instance of CarouselEvent has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("uqb.F(");
          if (other == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isSystemEvent(int param0) {
        int var2 = -71 / ((param0 - 59) / 43);
        return null != this.systemEvent ? true : false;
    }

    final void setPlayerReadyEvent(int param0, int param1) {
        int var3 = -106 % ((-71 - param1) / 44);
        this.systemEvent = new CarouselSystemEvent();
        this.systemEvent.field_f = new PlayerReady(param0);
    }

    public void copyTo(byte param0, SerializableGameState param1) {
        CarouselEvent var3 = null;
        RuntimeException var3_ref = null;
        CarouselEvent var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CarouselEvent) (param1);
          var3 = var4;
          var4.tick = this.tick;
          if (param0 < 54) {
            return;
          }
          if (this.systemEvent == null) {
            var4.systemEvent = null;
            return;
          }
          if (null == var3.systemEvent ||
            var3.systemEvent.getClass() != this.systemEvent.getClass()) {
            var3.systemEvent = new CarouselSystemEvent();
          }
          this.systemEvent.copyTo((byte) 121, var3.systemEvent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("uqb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void applyCustomEvent(PlayerNameRegistry param0, int param1, CarouselSlot param2) {
        try {
          if (param1 != 0) {
            SerializableGameState var5 = (SerializableGameState) null;
            this.differsFrom((byte) -98, (SerializableGameState) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uqb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean needsApplication(byte param0) {
        if (param0 <= 21) {
          this.setPlayerReadyEvent(52, -95);
          return this.pendingApplication;
        }
        return this.pendingApplication;
    }

    public void readState(IsaacPacketBuffer param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.tick = param0.readBits(0, SetMissilesTopSpeed.field_p);
          if (param1) {
            return;
          }
          if (!LegacyOpenGlSpecularEffect.readBoolean(param1, param0)) {
            this.systemEvent = null;
            return;
          }
          if (this.systemEvent == null) {
            this.systemEvent = new CarouselSystemEvent();
          }
          this.systemEvent.readState(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uqb.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isConfirmed(int param0) {
        int var2 = -72 % ((param0 - 70) / 40);
        return this.confirmed;
    }

    CarouselEvent() {
        this.confirmed = true;
        this.pendingApplication = true;
    }

    static {
        field_h = 0;
    }
}
