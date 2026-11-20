/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.io.PrintStream;

final class CarouselCommongameInfo implements DiffableState {
    private boolean showClientState;
    int tick;
    boolean replay;
    private int currentIndex;
    boolean outOfSync;
    private String debugDifferences;
    private PlayerNameRegistry playerNames;
    BlackBoxRecording recording;
    IntrusiveDeque events;
    int ticksBehind;
    private CarouselSlot[] history;
    private boolean shallowCopyFailed;

    private final void readCurrentState(IsaacPacketBuffer param0, byte param1) {
        CarouselEvent var5 = null;
        CarouselSlot var3 = null;
        int var4 = VoidHunters.field_G;
        try {
          this.tick = param0.readBits(0, SetMissilesTopSpeed.field_p);
          if (param1 <= 35) {
            this.showClientState = false;
          }
          var5 = (CarouselEvent) (this.events.first(0));
          while (var5 != null) {
            var5.pendingApplication = false;
            var5 = (CarouselEvent) (this.events.next((byte) 88));
          }
          var3 = this.getVisibleState(28120);
          var3.readState(param0, false);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final CarouselSlot getStateStepsAgo(int param0, int param1) {
        if (param1 > -65) {
          return (CarouselSlot) null;
        }
        if (param0 == 0) {
          return this.getVisibleState(28120);
        }
        if (this.showClientState) {
          return this.getRecordedClientStateOrCurrent(0);
        }
        return this.history[(-param0 + this.history.length + this.currentIndex) % this.history.length];
    }

    final static String getNativeLibraryName(byte param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -33) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (MessageFactory.field_b.startsWith("win")) {
            stackIn_5_0 = param1 + ".dll";
            return stackIn_5_0;
          }
          if (MessageFactory.field_b.startsWith("linux")) {
            stackIn_12_0 = "lib" + param1 + ".so";
            return stackIn_12_0;
          }
          if (!MessageFactory.field_b.startsWith("mac")) {
            return null;
          }
          stackIn_10_0 = "lib" + param1 + ".dylib";
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("mib.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void initialize(PlayerNameRegistry param0, boolean param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        try {
          var4_int = wsb.field_b;
          if (param1) {
            var4_int = lla.field_b;
          }
          this.history = new CarouselSlot[var4_int];
          for (var5 = 0; this.history.length > var5; var5++) {
            this.history[var5] = (CarouselSlot) (gva.field_a.create((byte) 94));
          }
          this.events = new IntrusiveDeque();
          this.playerNames = param0;
          this.currentIndex = 0;
          if (param2 >= -25) {
            this.shallowCopyFailed = false;
          }
          this.tick = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        CarouselCommongameInfo var3 = null;
        try {
          var3 = (CarouselCommongameInfo) (param1);
          if (param0 < 54) {
            this.debugDifferences = (String) null;
          }
          var3.currentIndex = this.currentIndex;
          var3.history = (CarouselSlot[]) (SpriteDimensions.copyStateArrayByMode(var3.history, this.history, 1, gva.field_a, false));
          this.copyEventHistoryTo(param1, -128);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void requestCatchUpToTick(int param0, boolean param1, int param2) {
        int var4 = 0;
        if (this.tick < param0) {
          var4 = -this.tick + param0;
          if (var4 > this.ticksBehind &&
            (1 == OpenGlUnderwaterMaterialEffect.field_o || param1)) {
            this.ticksBehind = var4;
          }
        }
        if (param2 != 0) {
          this.history = (CarouselSlot[]) null;
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            this.rewindToOldestState(47);
          }
          this.writeTimeline(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void initializePlayers(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        int var3 = 0;
        if (param1 < 103) {
          return;
        }
        while (this.history.length > var3) {
          this.history[var3].initializePlayers(param0, 113);
          var3++;
        }
    }

    final String getDebugDifferences(byte param0) {
        if (param0 != -75) {
          return (String) null;
        }
        return this.debugDifferences;
    }

    private final void copyEventHistoryTo(SerializableGameState param0, int param1) {
        CarouselCommongameInfo var3 = null;
        if (param1 >= -124) {
          return;
        }
        try {
          var3 = (CarouselCommongameInfo) (param0);
          var3.events = SetBloomCoefficientPercentage.a(var3.events, this.events, 1, IntrusiveDequeIterator.field_a, 77);
          var3.tick = this.tick;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.readTimeline((byte) 5, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void removeDuplicateEventPairs(byte param0) {
        int var2;
        IntrusiveDequeIterator var3_ref_wc;
        IntrusiveDequeIterator var4;
        Object var5;
        Object var6;
        CarouselEvent var7;
        CarouselEvent var8;
        int var9;
        int var3;
        var9 = VoidHunters.field_G;
        var2 = 0;
        do {
          var2 = 0;
          var3_ref_wc = new IntrusiveDequeIterator(this.events);
          var4 = new IntrusiveDequeIterator(this.events);
          var5 = null;
          var6 = null;
          var7 = (CarouselEvent) (var3_ref_wc.first(570));
          scanLoop1: while (true) {
            if (var7 != null) {
              var8 = (CarouselEvent) (var4.first(570));
              while (var8 != null) {
                if (var7 != var8 &&
                  !var7.differsFrom((byte) -51, var8)) {
                  var5 = var7;
                  var6 = var8;
                  break scanLoop1;
                }
                var8 = (CarouselEvent) (var4.next(19072));
              }
              var7 = (CarouselEvent) (var3_ref_wc.next(19072));
              continue;
            }
            break;
          }
          if (var5 != null &&
            var6 != null) {
            ((CarouselEvent) (var5)).unlink(-3846);
            ((CarouselEvent) (var6)).unlink(-3846);
            var2 = 1;
          }
        } while (var2 != 0);
        var3 = 62 % ((param0 - 9) / 53);
        return;
    }

    final boolean isReplay(int param0) {
        if (param0 != 1) {
          return true;
        }
        return this.replay;
    }

    final boolean addEvent(int param0, CarouselEvent param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CarouselEvent var5 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1.tick <= this.tick - (wsb.field_b - param0)) {
            SetDebrisGrabbingRange.a((byte) -84, "Oh dear, this action is off the end of the carousel: " + param1.toString() + ", tick=" + param1.tick + " (my tick=" + this.tick + ")");
            return false;
          }
          if (param1.systemEvent != null &&
            param1.systemEvent.field_c) {
            param1.systemEvent = null;
          } else {
            if (ujb.field_j) {
              var5 = (CarouselEvent) (this.events.first(param0 - 1));
              while (var5 != null) {
                if (param1 != var5 &&
                  !var5.differsFrom((byte) -41, param1)) {
                  var5.confirmed = true;
                  return true;
                }
                var5 = (CarouselEvent) (this.events.next((byte) 121));
              }
            }
          }
          this.events.addLast(-10258, param1);
          if (this.tick < param1.tick) {
            if (SetDebrisPartitioned.field_p != 1) {
              return true;
            }
            var3_int = param1.tick - this.tick;
            if (var3_int > this.ticksBehind) {
              this.ticksBehind = var3_int;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mib.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean isShowingClientState(int param0) {
        if (param0 < 11) {
          return true;
        }
        return this.showClientState;
    }

    private final void readTimeline(byte param0, IsaacPacketBuffer param1) {
        try {
          if (!MonochromeRowCacheEntry.field_e) {
            this.readHistoryAndState(param1, (byte) -19);
          } else {
            this.readCurrentState(param1, (byte) 42);
          }
          int var3_int = 64 % ((-35 - param0) / 33);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void writeCurrentState(int param0, IsaacPacketBuffer param1) {
        CarouselSlot var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1.writeBits(param0 - 631, this.tick, SetMissilesTopSpeed.field_p);
          var3 = this.getVisibleState(28120);
          var3.writeState(param1, param0 ^ 127);
          if (param0 != -1) {
            this.getPlayerNames(-85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("mib.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final int getHistoryLength(byte param0) {
        if (param0 <= 98) {
          return -50;
        }
        return this.history.length;
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int var4 = 0;
        IsaacPacketBuffer var5 = null;
        CarouselCommongameInfo var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var6 = (CarouselCommongameInfo) (other);
          var4 = 0;
          if (this.currentIndex != var6.currentIndex) {
            GetSniperCannonAimarc.a(-6940, "int carouselslot has changed. before=" + var6.currentIndex + ", now=" + this.currentIndex);
            var4 = 1;
          }
          CarouselSlot.reportStateArrayDifferences(var6.history, 1, this.history, false, 5547);
          SetUseFilledPolygons.a(1, this.events, 13, false, var6.events);
          if (SetCountermeasureLauncherAimspeed.a(var6.history, false, 1, this.history, -66)) {
            var4 = 1;
            GetSniperCannonAimarc.a(-6940, "CarouselSlot[] carousel has changed. ");
          }
          if (obfuscationGuard >= -19) {
            var5 = (IsaacPacketBuffer) null;
            this.writeCurrentState(87, (IsaacPacketBuffer) null);
          }
          if (SetCountermeasureLauncherAimspeed.a(hob.a(var6.events, 210377952), false, 1, hob.a(this.events, 210377952), 121)) {
            var4 = 1;
            GetSniperCannonAimarc.a(-6940, "linklist eventqueue has changed. ");
          }
          if (var4 != 0) {
            GetSniperCannonAimarc.a(-6940, "This instance of Carousel_commongame_Info has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("mib.F(");
          if (other == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void rewindToOldestState(int param0) {
        this.outOfSync = false;
        int var2 = -1 + this.history.length;
        this.debugDifferences = null;
        int var3 = 59 % ((param0 - 45) / 52);
        if (var2 > this.tick) {
          var2 = this.tick;
        }
        this.tick = -var2 + this.tick;
        this.currentIndex = -var2 + this.currentIndex;
        if (this.currentIndex < 0) {
          this.currentIndex = this.currentIndex + this.history.length;
        }
    }

    private final void readHistoryAndState(IsaacPacketBuffer param0, byte param1) {
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        CarouselEvent[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CarouselSlot var5 = null;
        int var7 = 0;
        SerializableGameState[] var8 = null;
        CarouselEvent[] var9 = null;
        CarouselEvent var10 = null;
        int var4Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          this.events = new IntrusiveDeque();
          var8 = (SerializableGameState[]) null;
          var9 = (CarouselEvent[]) (SetAutoDetail.a(12, IntrusiveDequeIterator.field_a, param0, 1, -71, (SerializableGameState[]) null));
          var3 = var9;
          if (var3 != null) {
            for (var4 = 0; var9.length > var4; var4++) {
              this.events.addLast(-10258, var9[var4]);
            }
          }
          this.tick = param0.readBits(param1 ^ -19, SetMissilesTopSpeed.field_p);
          var10 = (CarouselEvent) (this.events.first(0));
          if (param1 != -19) {
            this.getHistoryLength((byte) -98);
          }
          while (var10 != null) {
            var10.pendingApplication = false;
            var10 = (CarouselEvent) (this.events.next((byte) 40));
          }
          var4Lifetime1 = this.history.length - 1;
          if (var4Lifetime1 > this.tick) {
            var4Lifetime1 = this.tick;
          }
          var5 = this.history[this.currentIndex];
          var5.readState(param0, false);
          GetSniperCannonAimarc.a(param1 - 6921, "Tick was " + this.tick);
          this.tick = -var4Lifetime1 + this.tick;
          GetSniperCannonAimarc.a(-6940, "Running post read custom from tick=" + this.tick + " when ticksbehind=" + this.ticksBehind);
          for (var6 = 0; var6 < var4Lifetime1; var6++) {
            this.updateTimeline(0, (byte) 106);
          }
          GetSniperCannonAimarc.a(-6940, "Ends as " + this.tick);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("mib.M(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        CarouselCommongameInfo var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 1 / ((param0 - 22) / 59);
          var3 = (CarouselCommongameInfo) (param1);
          stackIn_5_0 = (SetCountermeasureLauncherAimspeed.a(hob.a(var3.events, 210377952), false, 1, hob.a(this.events, 210377952), 122)) || (var3.tick != this.tick);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("mib.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void writeTimeline(IsaacPacketBuffer param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!MonochromeRowCacheEntry.field_e) {
            this.writeHistoryAndState(param0, (byte) 43);
          } else {
            this.writeCurrentState(~param1, param0);
          }
          if (param1 != 0) {
            this.playerNames = (PlayerNameRegistry) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mib.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void catchUp(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (0 >= this.ticksBehind) {
          return;
        }
        GetSniperCannonAimarc.a(-6940, "Updating all the way with " + this.ticksBehind + " ticks behind");
        if (param0 != -1) {
          this.showClientState = true;
        }
        for (var2 = 0; this.ticksBehind > var2; var2++) {
          this.replayFromStepsAgo(0, param0 ^ -123);
          this.tick = this.tick + 1;
        }
        this.ticksBehind = 0;
    }

    final CarouselSlot getVisibleState(int param0) {
        if (param0 != 28120) {
          this.recording = (BlackBoxRecording) null;
        }
        if (this.showClientState) {
          return this.getRecordedClientStateOrCurrent(0);
        }
        return this.history[this.currentIndex];
    }

    final void adjustTickOffset(boolean param0, int param1) {
        if (Math.abs(param1) > Math.abs(this.ticksBehind)) {
          this.ticksBehind = (param1 + this.ticksBehind) / 2;
        }
        if (param0) {
          PlayerNameRegistry var4 = (PlayerNameRegistry) null;
          this.initialize((PlayerNameRegistry) null, false, (byte) -69);
        }
    }

    private final void writeHistoryAndState(IsaacPacketBuffer param0, byte param1) {
        IsaacPacketBuffer var11 = null;
        IsaacPacketBuffer var3 = null;
        SerializableGameState[] var10 = null;
        SerializableGameState[] var4 = null;
        int var5 = 0;
        SerializableGameState[] var6 = null;
        int var7 = 0;
        SerializableGameState var8 = null;
        int var3_int = 0;
        CarouselSlot var12 = null;
        int var9 = VoidHunters.field_G;
        try {
          var11 = param0;
          var3 = var11;
          var10 = hob.a(this.events, 210377952);
          var4 = var10;
          var5 = var4 == null ? 0 : var10.length;
          var11.writeBits(-632, var5, 12);
          if (var5 != 0) {
            var6 = var10;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              if (vq.writeBoolean(var3, 93, var8 != null ? true : false)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var11, var8);
              }
            }
          }
          param0.writeBits(-632, this.tick, SetMissilesTopSpeed.field_p);
          var3_int = this.history.length - 1;
          if (this.tick < var3_int) {
            var3_int = this.tick;
          }
          if (param1 != 43) {
            this.playerNames = (PlayerNameRegistry) null;
          }
          var12 = this.getStateStepsAgo(var3_int, -105);
          var12.writeState(param0, -120);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final CarouselSlot getRecordedClientStateOrCurrent(int param0) {
        if (param0 != 0) {
          this.ticksBehind = -42;
        }
        if (null != this.recording &&
          this.recording.getClientStateDump(116) != null) {
          return this.recording.getClientStateDump(param0 ^ 116).d(param0 + 0);
        }
        return this.history[this.currentIndex];
    }

    final void updateTimeline(int param0, byte param1) {
        Object var3;
        int var4;
        int var5;
        CarouselEvent var6_ref_uqb;
        int var6;
        PrintStream var7;
        int var7_int;
        PrintStream var9;
        CarouselSlot var10;
        int var11;
        CarouselEvent var12;
        IntrusiveDequeIterator var13;
        StringBuilder var14;
        int var4Lifetime1;
        var11 = VoidHunters.field_G;
        var3 = null;
        if (null != this.recording) {
          var3 = this.recording.getClientStateDump(116);
        }
        if (null != this.recording &&
          var3 != null) {
          var4 = ((CarouselSlotStateDump) (var3)).c(param1 - 161);
          this.showClientState = false;
          if (this.tick >= var4) {
            if (param0 % GetBombletSprayProjectileOndamageParticles.field_p > GetBombletSprayProjectileOndamageParticles.field_p / 2) {
              this.showClientState = true;
            }
            return;
          }
        }
        var4Lifetime1 = this.tick;
        var5 = this.tick;
        if (param1 != 106) {
          this.history = (CarouselSlot[]) null;
        }
        var6_ref_uqb = (CarouselEvent) (this.events.first(0));
        while (var6_ref_uqb != null) {
          if (this.tick - this.history.length > var6_ref_uqb.tick) {
            var6_ref_uqb.unlink(-3846);
          } else {
            if (!var6_ref_uqb.confirmed &&
              var5 > var6_ref_uqb.tick) {
              var7_int = 0;
              var13 = new IntrusiveDequeIterator(this.events);
              var12 = (CarouselEvent) (var13.first(570));
              while (true) {
                if (var12 != null) {
                  if (var6_ref_uqb != var12 &&
                    !var12.differsFrom((byte) -55, var6_ref_uqb)) {
                    var7_int = 1;
                  } else {
                    var12 = (CarouselEvent) (var13.next(19072));
                    continue;
                  }
                }
                if (var7_int != 0) {
                  break;
                }
                var5 = -2 + var6_ref_uqb.tick;
                break;
              }
            }
            if (var6_ref_uqb.pendingApplication &&
              var6_ref_uqb.tick < var4Lifetime1) {
              var4Lifetime1 = var6_ref_uqb.tick;
            }
          }
          var6_ref_uqb = (CarouselEvent) (this.events.next((byte) 52));
        }
        if (0 > this.ticksBehind && (OpenGlRenderbuffer.field_o == 0 ||
          (param0 & OpenGlRenderbuffer.field_o) != 0)) {
          this.ticksBehind = this.ticksBehind + 1;
          return;
        }
        if (var5 > this.tick - this.history.length) {
          this.replayFromStepsAgo(-var4Lifetime1 + this.tick, 113);
          this.tick = this.tick + 1;
          if (var5 > this.tick - this.history.length &&
            this.ticksBehind > 0 && (iob.field_g == 0 ||
            (param0 & iob.field_g) != 0)) {
            this.replayFromStepsAgo(0, 124);
            this.tick = this.tick + 1;
            this.ticksBehind = this.ticksBehind - 1;
          }
        }
        if (null != this.recording &&
          var3 != null) {
          var6 = ((CarouselSlotStateDump) (var3)).c(-80);
          if (var6 == this.tick) {
            var7 = System.out;
            var14 = new StringBuilder();
            var9 = new PrintStream((OutputStream) ((Object) new hp(var14)));
            System.setOut(var9);
            var10 = ((CarouselSlotStateDump) (var3)).d(0);
            var10.reportDifferences(this.history[this.currentIndex], -100);
            System.setOut(var7);
            this.debugDifferences = var14.toString();
            GetSniperCannonAimarc.a(param1 ^ -7026, "\n>>>>>> Black box recording debug diffs start");
            OpenGlGpuTexture2D.printDebug(var14.toString(), 0);
            GetSniperCannonAimarc.a(-6940, "<<<<<< Black box recording debug diffs end\n");
          }
        }
    }

    private final void replayFromStepsAgo(int param0, int param1) {
        CarouselSlot stackIn_23_0;
        CarouselSlot stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        boolean stackIn_24_4 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        CarouselEvent var8_ref_uqb;
        int var8;
        CarouselSlot var9;
        int var10;
        var10 = VoidHunters.field_G;
        var3 = (this.currentIndex + this.history.length - param0) % this.history.length;
        var4 = -param0 + this.tick;
        if (param1 <= 83) {
          return;
        }
        var5 = var3;
        while ((1 + this.currentIndex) % this.history.length != var5) {
          var6 = (var5 + 1) % this.history.length;
          if (tga.field_N) {
            ConsoleValue.beginReferenceTracking((byte) 68);
          }
          this.history[var5].copyTo((byte) 77, this.history[var6]);
          this.swapSlotsForDebug(var5, var6, -121);
          if (tga.field_N) {
            mba.a(-112);
          }
          var7 = 0;
          if (GetUseOffscreenRendering.field_o) {
            var7 = SetTestActionLag.a(this.history[var5], (byte) -9);
          }
          this.history[var6].prepareTick(false, var4);
          if (ProxyAuthenticationException.field_c == 1) {
            this.removeDuplicateEventPairs((byte) 71);
          }
          var8_ref_uqb = (CarouselEvent) (this.events.first(0));
          while (var8_ref_uqb != null) {
            if (var8_ref_uqb.tick == var4) {
              var8_ref_uqb.applyTo((byte) -122, this.playerNames, this.history[var6]);
              var8_ref_uqb.pendingApplication = false;
            }
            var8_ref_uqb = (CarouselEvent) (this.events.next((byte) 117));
          }
          stackIn_23_0 = this.history[var6];
          stackIn_23_1 = this.history[var5];
          stackIn_23_2 = var4;
          stackIn_23_3 = 1;
          stackIn_24_4 = (this.tick == var4);
          ((CarouselSlot) (Object) stackIn_23_0).advanceSimulation(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_24_4);
          if (GetUseOffscreenRendering.field_o) {
            UiStatefulStyle.c(9487);
            var8 = SetTestActionLag.a(this.history[var5], (byte) -117);
            if (var8 != var7) {
              var9 = dnb.c((byte) -39);
              UiStatefulStyle.c(9487);
              this.swapSlotsForDebug(var5, var6, 42);
              this.history[var5] = dnb.c((byte) -39);
              if (!this.shallowCopyFailed) {
                GetSniperCannonAimarc.a(-6940, "Carousel_commongame shallow copy check: A field was changed before it was prepared");
                GetSniperCannonAimarc.a(-6940, "******************************************");
                if (SetPointDefenceLaserProjectileDamage.field_o) {
                  var9.reportDifferences(this.history[var5], -109);
                }
              }
              this.shallowCopyFailed = true;
              this.tick = this.tick - 1;
              return;
            }
            this.shallowCopyFailed = false;
          }
          var4++;
          var5 = (1 + var5) % this.history.length;
        }
        this.currentIndex = (this.currentIndex + 1) % this.history.length;
        return;
    }

    private final void swapSlotsForDebug(int param0, int param1, int param2) {
        CarouselSlot var5 = null;
        int var4 = -85 % ((-55 - param2) / 38);
        if (1 == ko.field_g &&
          param0 == this.currentIndex) {
          var5 = this.history[param1];
          this.history[param1] = this.history[param0];
          this.history[param0] = var5;
        }
    }

    final PlayerNameRegistry getPlayerNames(int param0) {
        if (param0 <= 25) {
          this.ticksBehind = -62;
        }
        return this.playerNames;
    }

    CarouselCommongameInfo() {
        this.initialize((PlayerNameRegistry) null, false, (byte) -126);
    }

    CarouselCommongameInfo(PlayerNameRegistry param0) {
        try {
          this.initialize(param0, false, (byte) -55);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    CarouselCommongameInfo(PlayerNameRegistry param0, boolean param1) {
        try {
          this.initialize(param0, param1, (byte) -27);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
