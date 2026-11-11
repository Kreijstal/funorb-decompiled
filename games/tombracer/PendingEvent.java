/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingEvent extends IntrusiveNode {
    private int room;
    private int duration;
    private int end;
    private int instigator;
    private GameEvent event;
    private int start;
    private int course;

    final boolean isStale(int param0, int param1) {
        if (this.isRoomScoped(120)) {
          if (param0 > this.room) {
            return true;
          }
          if (param1 != 3) {
            this.ticksSinceStart(-6, -25);
            return false;
          }
          return false;
        }
        if (param1 == 3) {
          return false;
        }
        this.ticksSinceStart(-6, -25);
        return false;
    }

    final boolean isFinished(int param0, int param1, int param2) {
        if (this.isStale(param2, 3)) {
          return true;
        }
        if (param1 != -1) {
          this.isFinished(-125, -75, 17);
          if (this.duration <= 0) {
            return false;
          }
          if (param0 >= this.end) {
            return true;
          }
          return false;
        }
        if (this.duration <= 0) {
          return false;
        }
        if (param0 >= this.end) {
          return true;
        }
        return false;
    }

    private final int getStart(boolean param0) {
        if (param0) {
          this.isActiveAt(40, 38);
          return this.start;
        }
        return this.start;
    }

    PendingEvent(GameEvent param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4);
        try {
          this.room = param5;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean isDuplicateOf(PendingEvent param0, int param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!this.event.isEquivalentTo(false, param0.event)) {
            return false;
          }
          if (this.course != param0.course) {
            return false;
          }
          if (this.isRoomScoped(120) &&
            param0.room != this.room) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.duration != param1 &&
            param0.duration != 0) {
            var3_int = this.getStart(false);
            var4 = param0.getStart(false);
            var5 = this.getEnd(-30481);
            var6 = param0.getEnd(param1 ^ -30481);
            if (var4 <= var5 &&
              var6 >= var3_int) {
              var7 = RandomBrickOperator.max(var5, var6, 2);
              var8 = MidiVoiceMixer.min(var4, var3_int, param1 ^ -120);
              if (this.duration < param0.duration) {
                this.instigator = param0.instigator;
              }
              this.start = var8;
              this.duration = var7 - var8;
              decompiledFrameRemainder0 = false;
            }
            else {
              return false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.duration == 0) {
              this.duration = 0;
              return true;
            }
            this.instigator = param0.instigator;
            this.duration = 0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("pi.J(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isActiveAt(int param0, int param1) {
        if (param1 < 95) {
          return false;
        }
        if (this.start > param0) {
          return false;
        }
        if (0 == this.duration) {
          return true;
        }
        if (param0 >= this.end) {
          return false;
        }
        return true;
    }

    final void finish(PlayerSimulation param0, int param1) {
        int discarded$0 = 0;
        try {
          if (param1 > -52) {
            discarded$0 = this.getEnd(22);
          }
          this.event.finish(this.room, (byte) 102, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void applyTick(PlayerSimulation param0, int param1, int param2) {
        try {
          if (param2 != 0) {
            this.toString();
          }
          this.event.applyTick(param0, 113, this.room, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int getCourse(int param0) {
        if (param0 != 3) {
          return -84;
        }
        return this.course;
    }

    private final void decode(BitPacketBuffer param0, int param1) {
        try {
          param0.beginBitAccess((byte) 112);
          if (param1 > -108) {
            this.isFinished(3, -70, 47);
          }
          this.event = EventFactory.readEvent(-90, param0, 26);
          this.instigator = param0.readBits((byte) 44, 3);
          this.course = param0.readBits((byte) 44, 3);
          this.start = param0.readBits((byte) 44, 32);
          this.duration = param0.readBits((byte) 44, 8);
          this.end = this.start + 50 * this.duration;
          if (this.isRoomScoped(122)) {
            this.room = param0.readBits((byte) 44, 5);
          }
          param0.endBitAccess((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean isRoomScoped(int param0) {
        if (param0 <= 118) {
          return true;
        }
        return this.event.isRoomScoped(false);
    }

    final int ticksSinceStart(int param0, int param1) {
        if (param1 <= -15) {
          return param0 - this.start;
        }
        PlayerSimulation var4 = (PlayerSimulation) null;
        this.finish((PlayerSimulation) null, -69);
        return param0 - this.start;
    }

    private final int getEnd(int param0) {
        if (param0 != -30481) {
          return -32;
        }
        return this.end;
    }

    public final String toString() {
        String var1 = "PendingEvent";
        var1 = var1 + "(instigator: " + this.instigator + ", course:" + this.course;
        if (this.isRoomScoped(121)) {
          var1 = var1 + ", room:" + this.room;
        }
        var1 = var1 + ", start:" + this.start + ", duration:" + this.duration + ")";
        return var1;
    }

    private PendingEvent(GameEvent param0, int param1, int param2, int param3, int param4) {
        try {
          this.end = param4 * 50 + param3;
          this.event = param0;
          this.start = param3;
          this.duration = param4;
          this.course = param2;
          this.instigator = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    PendingEvent(BitPacketBuffer param0) {
        try {
          this.decode(param0, -124);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void encode(BitPacketBuffer param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.beginBitWrite(8);
          if (param1 != -19733) {
            this.isActiveAt(123, -124);
          }
          this.event.encode(param0, -5);
          param0.writeBits((byte) -32, this.instigator, 3);
          param0.writeBits((byte) -2, this.course, 3);
          param0.writeBits((byte) -128, this.start, 32);
          param0.writeBits((byte) 95, this.duration, 8);
          if (this.isRoomScoped(122)) {
            param0.writeBits((byte) -125, this.room, 5);
            param0.endBitWrite(-1826190686);
          } else {
            param0.endBitWrite(-1826190686);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pi.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
