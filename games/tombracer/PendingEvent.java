/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingEvent extends IntrusiveNode {
    private int room;
    private int duration;
    private int field_l;
    private int instigator;
    private GameEvent field_g;
    private int start;
    private int course;

    final boolean a(int param0, int param1) {
        if (this.b(120)) {
          if (param0 > this.room) {
            return true;
          }
          if (param1 != 3) {
            this.b(-6, -25);
            return false;
          }
          return false;
        }
        if (param1 == 3) {
          return false;
        }
        this.b(-6, -25);
        return false;
    }

    final boolean a(int param0, int param1, int param2) {
        if (this.a(param2, 3)) {
          return true;
        }
        if (param1 != -1) {
          this.a(-125, -75, 17);
          if (this.duration <= 0) {
            return false;
          }
          if (param0 >= this.field_l) {
            return true;
          }
          return false;
        }
        if (this.duration <= 0) {
          return false;
        }
        if (param0 >= this.field_l) {
          return true;
        }
        return false;
    }

    private final int a(boolean param0) {
        if (param0) {
          this.c(40, 38);
          return this.start;
        }
        return this.start;
    }

    PendingEvent(GameEvent param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4);
        try {
          this.room = param5;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(PendingEvent param0, int param1) {
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
          if (!this.field_g.a(false, param0.field_g)) {
            return false;
          }
          if (this.course != param0.course) {
            return false;
          }
          if (this.b(120) &&
            param0.room != this.room) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.duration != param1 &&
            param0.duration != 0) {
            var3_int = this.a(false);
            var4 = param0.a(false);
            var5 = this.c(-30481);
            var6 = param0.c(param1 ^ -30481);
            if (var4 <= var5 &&
              var6 >= var3_int) {
              var7 = iia.d(var5, var6, 2);
              var8 = et.b(var4, var3_int, param1 ^ -120);
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
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(int param0, int param1) {
        if (param1 < 95) {
          return false;
        }
        if (this.start > param0) {
          return false;
        }
        if (0 == this.duration) {
          return true;
        }
        if (param0 >= this.field_l) {
          return false;
        }
        return true;
    }

    final void a(PlayerSimulation param0, int param1) {
        int discarded$0 = 0;
        try {
          if (param1 > -52) {
            discarded$0 = this.c(22);
          }
          this.field_g.a(this.room, (byte) 102, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(PlayerSimulation param0, int param1, int param2) {
        try {
          if (param2 != 0) {
            this.toString();
          }
          this.field_g.a(param0, 113, this.room, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 3) {
          return -84;
        }
        return this.course;
    }

    private final void a(BitPacketBuffer param0, int param1) {
        try {
          param0.h((byte) 112);
          if (param1 > -108) {
            this.a(3, -70, 47);
          }
          this.field_g = EventFactory.readEvent(-90, param0, 26);
          this.instigator = param0.b((byte) 44, 3);
          this.course = param0.b((byte) 44, 3);
          this.start = param0.b((byte) 44, 32);
          this.duration = param0.b((byte) 44, 8);
          this.field_l = this.start + 50 * this.duration;
          if (this.b(122)) {
            this.room = param0.b((byte) 44, 5);
          }
          param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0) {
        if (param0 <= 118) {
          return true;
        }
        return this.field_g.a(false);
    }

    final int b(int param0, int param1) {
        if (param1 <= -15) {
          return param0 - this.start;
        }
        PlayerSimulation var4 = (PlayerSimulation) null;
        this.a((PlayerSimulation) null, -69);
        return param0 - this.start;
    }

    private final int c(int param0) {
        if (param0 != -30481) {
          return -32;
        }
        return this.field_l;
    }

    public final String toString() {
        String var1 = "PendingEvent";
        var1 = var1 + "(instigator: " + this.instigator + ", course:" + this.course;
        if (this.b(121)) {
          var1 = var1 + ", room:" + this.room;
        }
        var1 = var1 + ", start:" + this.start + ", duration:" + this.duration + ")";
        return var1;
    }

    private PendingEvent(GameEvent param0, int param1, int param2, int param3, int param4) {
        try {
          this.field_l = param4 * 50 + param3;
          this.field_g = param0;
          this.start = param3;
          this.duration = param4;
          this.course = param2;
          this.instigator = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    PendingEvent(BitPacketBuffer param0) {
        try {
          this.a(param0, -124);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(BitPacketBuffer param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.i(8);
          if (param1 != -19733) {
            this.c(123, -124);
          }
          this.field_g.a(param0, -5);
          param0.a((byte) -32, this.instigator, 3);
          param0.a((byte) -2, this.course, 3);
          param0.a((byte) -128, this.start, 32);
          param0.a((byte) 95, this.duration, 8);
          if (this.b(122)) {
            param0.a((byte) -125, this.room, 5);
            param0.k(-1826190686);
          } else {
            param0.k(-1826190686);
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
