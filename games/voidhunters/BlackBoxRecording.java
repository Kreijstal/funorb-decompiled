/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlackBoxRecording extends DebugSendable implements DiffableState {
    private CarouselSlotStateDump clientStateDump;
    private CarouselCommongameInfo serverCarousel;

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        BlackBoxRecording var5 = null;
        try {
          super.reportDifferences(other, -43);
          var5 = (BlackBoxRecording) (other);
          if (this.serverCarousel != null &&
            var5.serverCarousel != null) {
            this.serverCarousel.reportDifferences(var5.serverCarousel, -42);
          }
          if (null != this.clientStateDump &&
            var5.clientStateDump != null) {
            this.clientStateDump.a(var5.clientStateDump, true);
          }
          var4 = 0;
          if (obfuscationGuard >= -19) {
            this.serverCarousel = (CarouselCommongameInfo) null;
          }
          stackIn_11_0 = (null != this.serverCarousel) ? 0 : 1;
          if (var5.serverCarousel != null) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if ((stackIn_11_0 ^ stackIn_14_1) != 0 ||
            null != this.serverCarousel &&
            this.serverCarousel.differsFrom((byte) 118, var5.serverCarousel)) {
            System.out.println("Carousel_commongame_Info server_carousel has changed. before=" + var5.serverCarousel + ", now=" + this.serverCarousel);
            var4 = 1;
          }
          stackIn_22_0 = (null != this.clientStateDump) ? 0 : 1;
          if (null != var5.clientStateDump) {
            stackIn_25_1 = 0;
          } else {
            stackIn_25_1 = 1;
          }
          if ((stackIn_22_0 ^ stackIn_25_1) != 0 ||
            this.clientStateDump != null &&
            this.clientStateDump.differsFrom((byte) 97, var5.clientStateDump)) {
            var4 = 1;
            System.out.println("CarouselSlotStateDump client_state_dump has changed. before=" + var5.clientStateDump + ", now=" + this.clientStateDump);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of BlackBoxRecording has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("af.F(");
          if (other == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final CarouselCommongameInfo getServerCarousel(int param0) {
        if (param0 <= 96) {
          return (CarouselCommongameInfo) null;
        }
        return this.serverCarousel;
    }

    private final void a(byte param0, IsaacPacketBuffer param1) {
        try {
          ParticleFactory.field_a = MonochromeRowCacheEntry.field_e;
          int var3_int = -88 % ((12 - param0) / 49);
          MonochromeRowCacheEntry.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "af.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          this.a(param0, (byte) -122);
          super.readState(param0, param1);
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            this.serverCarousel = null;
          } else {
            if (this.serverCarousel != null) {
              this.serverCarousel.readState(param0, param1);
            } else {
              this.serverCarousel = new CarouselCommongameInfo();
              this.serverCarousel.readState(param0, param1);
            }
          }
          if (LegacyOpenGlSpecularEffect.readBoolean(param1, param0)) {
            if (this.clientStateDump == null) {
              this.clientStateDump = new CarouselSlotStateDump();
            }
            this.clientStateDump.readState(param0, false);
          } else {
            this.clientStateDump = null;
          }
          this.a(116, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("af.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(IsaacPacketBuffer param0, int param1) {
        try {
          MonochromeRowCacheEntry.field_e = ParticleFactory.field_a;
          if (param1 <= 25) {
            this.getClientStateDump(-23);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, IsaacPacketBuffer param1) {
        try {
          MonochromeRowCacheEntry.field_e = ParticleFactory.field_a;
          if (param0 != 116) {
            BlackBoxRecording.a((byte) 124, -116, -59, -4, 46, 82);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "af.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final CarouselSlotStateDump getClientStateDump(int param0) {
        if (param0 != 116) {
          return (CarouselSlotStateDump) null;
        }
        return this.clientStateDump;
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        BlackBoxRecording var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        BlackBoxRecording var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          super.copyTo((byte) 91, param1);
          var5 = (BlackBoxRecording) (param1);
          var3 = var5;
          if (param0 <= 54) {
            this.getClientStateDump(-43);
          }
          if (this.serverCarousel != null) {
            if (null == var3.serverCarousel) {
              var3.serverCarousel = new CarouselCommongameInfo();
            }
            this.serverCarousel.copyTo((byte) 55, var3.serverCarousel);
          } else {
            var5.serverCarousel = null;
          }
          if (null == this.clientStateDump) {
            var3.clientStateDump = null;
            return;
          }
          if (null == var3.clientStateDump) {
            var3.clientStateDump = new CarouselSlotStateDump();
          }
          this.clientStateDump.copyTo((byte) 87, var3.clientStateDump);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("af.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(IsaacPacketBuffer param0, byte param1) {
        try {
          this.serverCarousel = new CarouselCommongameInfo();
          this.serverCarousel.replay = true;
          ParticleFactory.field_a = MonochromeRowCacheEntry.field_e;
          if (param1 >= -3) {
            IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
            this.readState((IsaacPacketBuffer) null, true);
          }
          MonochromeRowCacheEntry.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "af.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        SetAiFiringRangeUpshift.a(param4, param5, param2, (byte) 51, 116, param1, param3);
        if (param0 != -115) {
          BlackBoxRecording.a((byte) 25, -61, 61, -7, -52, -26);
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        BlackBoxRecording var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_23_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = 17 / ((param0 - 22) / 59);
          var4 = (BlackBoxRecording) (param1);
          if (!super.differsFrom((byte) 105, param1)) {
            stackIn_4_0 = (null != this.serverCarousel) ? 0 : 1;
            if (null != var4.serverCarousel) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.serverCarousel == null ||
              !this.serverCarousel.differsFrom((byte) -70, var4.serverCarousel))) {
              stackIn_14_0 = (this.clientStateDump != null) ? 0 : 1;
              if (null != var4.clientStateDump) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.clientStateDump == null ||
                !this.clientStateDump.differsFrom((byte) -116, var4.clientStateDump))) {
                stackIn_23_0 = false;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_23_0 = true;
          }
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("af.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    BlackBoxRecording() {
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          this.a((byte) -85, param0);
          if (param1 > -109) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.differsFrom((byte) 94, (SerializableGameState) null);
          }
          super.writeState(param0, -116);
          if (DateOfBirthInput.writeBoolean(param0, 110, this.serverCarousel != null ? true : false)) {
            this.serverCarousel.writeState(param0, -110);
          }
          if (DateOfBirthInput.writeBoolean(param0, -35, this.clientStateDump != null ? true : false)) {
            this.clientStateDump.writeState(param0, -120);
          }
          this.a(param0, 92);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "af.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
