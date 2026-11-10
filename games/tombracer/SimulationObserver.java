/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SimulationObserver {
    private IntrusiveDeque field_a;
    private IntrusiveDeque queuedEvents;

    final void queueEvent(GameEvent param0, Player param1, boolean param2) {
        try {
          this.queuedEvents.addLast((byte) -96, new QueuedPlayerEvent(param1, param0));
          if (!param2) {
            Room var5 = (Room) null;
            this.onRoomReset(-124, (Room) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "eha.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, BeamSegment param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          var7_int = -(param0 / param6) + param5;
          var8 = -(param3 / 2) + param2;
          if (ab.a(var8, param4.field_d, var8 + param3, param4.field_k, param0 + var7_int, var7_int, 112)) {
            var9 = 0;
          } else {
            var9 = OpenGlTexture2D.a(param4.field_a, (byte) -15, var7_int, var7_int + param0, var8 + param3, param1, param4.field_e, param4.field_k, param4.field_d, var8);
            if (var9 < -1) {
              System.out.println("Uh oh, collide.lineseg_box returned " + var9);
              System.out.println("collide.lineseg_box(" + param4.field_d + ", " + param4.field_k + ", " + param4.field_e + ", " + param4.field_a + ", " + var7_int + ", " + var8 + ", " + (param0 + var7_int) + ", " + (var8 + param3) + ", " + param1 + ")");
              var9 = 0;
            }
          }
          stackIn_6_0 = var9;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("eha.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, Player param2, Trap param3);

    abstract void a(Trap param0, int param1);

    final void a(PlayerSimulation param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 52) {
            this.field_a = (IntrusiveDeque) null;
          }
          if (!param0.h(126)) {
            return;
          }
          this.a((byte) -27, param0);
          param0.a(-1, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("eha.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        rfa.field_B = FleeLocomotor.field_B + " <b>" + vc.field_s + "</b> " + cq.field_c + " <b>" + mha.field_F + "</b> " + kka.field_p + "<br>" + "<br>" + wg.field_k;
        if (param0 != -27) {
          BeamSegment var2 = (BeamSegment) null;
          SimulationObserver.a(-114, -20, 86, 69, (BeamSegment) null, -36, 11);
        }
    }

    abstract void onRoomReset(int param0, Room param1);

    abstract void onRoomEntered(int param0, Player param1, Room param2);

    final void a(PlayerSimulation param0, PendingEvent param1, boolean param2) {
        int var5 = 0;
        Trap var6 = null;
        PendingEvent var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2) {
            var6 = (Trap) null;
            this.a(-16, -102, (Player) null, (Trap) null);
          }
          if (param1.a(param0.player.getCourseIndex(-108), 3)) {
            return;
          }
          var7 = (PendingEvent) (this.field_a.first(-80));
          while (var7 != null) {
            if (var7.a(param1, 0)) {
              return;
            }
            var7 = (PendingEvent) (this.field_a.next(107));
          }
          this.field_a.addLast((byte) -82, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("eha.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void clearQueuedEvents(int param0) {
        if (param0 > -111) {
          return;
        }
        this.queuedEvents.clear(8);
    }

    abstract void a(int param0, Player param1, int param2, Room param3, int param4, int param5);

    final QueuedPlayerEvent pollQueuedEvent(int param0) {
        if (param0 < 99) {
          return (QueuedPlayerEvent) null;
        }
        return (QueuedPlayerEvent) (this.queuedEvents.removeFirst(23));
    }

    abstract void a(Player param0, Room param1, boolean param2);

    protected SimulationObserver() {
        this.queuedEvents = new IntrusiveDeque();
        this.field_a = new IntrusiveDeque();
    }

    private final void a(byte param0, PlayerSimulation param1) {
        int var3_int = 0;
        int var4 = 0;
        PendingEvent var5 = null;
        int var6 = 0;
        Trap var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = param1.tick;
          var4 = param1.player.getCourseIndex(-102);
          if (param0 != -27) {
            var7 = (Trap) null;
            this.a(84, 86, (Player) null, (Trap) null);
          }
          var5 = (PendingEvent) (this.field_a.first(param0 - 53));
          while (var5 != null) {
            if (!var5.a(var3_int, -1, var4)) {
              if (var5.c(var3_int, 113)) {
                var5.a(param1, var5.b(var3_int, -87), param0 + 27);
              }
            } else {
              var5.a(param1, -102);
              var5.unlink(40);
            }
            var5 = (PendingEvent) (this.field_a.next(122));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("eha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
