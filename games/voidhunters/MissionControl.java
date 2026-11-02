/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionControl implements DiffableState {
    static String field_f;
    int selectedEvent;
    private int field_c;
    private MissionEvent[] events;
    static String field_a;
    private int[] reservedIds;
    int selectedConditionOrAction;

    final void f(byte param0) {
        MissionEvent var3 = null;
        MissionEvent var4 = null;
        int var2 = 19 / ((param0 - 35) / 63);
        if (null != this.events &&
          (this.selectedEvent > 0 && this.events.length > this.selectedEvent)) {
          var3 = this.events[-1 + this.selectedEvent];
          var4 = this.events[this.selectedEvent];
          this.events[-1 + this.selectedEvent] = var4;
          this.events[this.selectedEvent] = var3;
          this.selectedEvent = this.selectedEvent - 1;
        }
    }

    final boolean a(int param0, byte param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (null == this.reservedIds) {
          return true;
        }
        int var3 = 64 % ((-33 - param1) / 32);
        for (var4 = 0; var4 < this.reservedIds.length; var4++) {
          if (param0 == this.reservedIds[var4]) {
            return false;
          }
        }
        return true;
    }

    final void b(byte param0) {
        MissionEvent var2 = null;
        MissionCondition[] var3 = null;
        MissionAction[] var4 = null;
        int var5 = 0;
        if (this.events != null &&
          this.selectedEvent >= 0 &&
          this.events.length > this.selectedEvent) {
          var2 = this.events[this.selectedEvent];
          var3 = var2.getConditions((byte) -125);
          var4 = var2.getActions((byte) -42);
          var5 = (var4 != null ? var4.length : 0) + (var3 == null ? 0 : var3.length);
          this.selectedConditionOrAction = (this.selectedConditionOrAction + 1) % var5;
        }
        if (param0 > -123) {
          this.reservedIds = (int[]) null;
        }
    }

    final void e(byte param0) {
        MissionEvent var2 = null;
        if (this.events != null && this.selectedEvent >= 0 &&
          this.selectedEvent < this.events.length) {
          var2 = this.events[this.selectedEvent];
          var2.a(this.selectedConditionOrAction, (byte) -79);
          this.selectedConditionOrAction = this.selectedConditionOrAction - 1;
          if (this.selectedConditionOrAction < 0) {
            this.selectedConditionOrAction = 0;
          }
        }
        if (param0 != -99) {
          this.g((byte) -104);
        }
    }

    final void a(byte param0, MissionCondition param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.events != null &&
            this.selectedEvent >= 0 &&
            this.events.length > this.selectedEvent) {
            this.events[this.selectedEvent].a((byte) -105, param1);
          }
          if (param0 > -112) {
            this.a(121, (byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("una.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            tv var4 = (tv) null;
            this.b((byte) -44, (tv) null);
          }
          this.events = (MissionEvent[]) (SetAutoDetail.a(8, GetExplosionPushMultiplier.field_o, param0, 1, -115, this.events));
          this.selectedEvent = param0.i(0, 32);
          this.selectedConditionOrAction = param0.i(0, 32);
          this.reservedIds = wkb.a((byte) 37, this.reservedIds, param0, 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "una.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        faa var10 = null;
        faa var3 = null;
        MissionEvent[] var4 = null;
        int var5 = 0;
        MissionEvent[] var6 = null;
        int var7 = 0;
        MissionEvent var8 = null;
        int var9 = VoidHunters.field_G;
        if (param1 >= -109) {
          return;
        }
        try {
          var10 = param0;
          var3 = var10;
          var4 = this.events;
          var5 = var4 != null ? var4.length : 0;
          var10.a(-632, var5, 8);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              if (vq.a(var3, -126, var8 != null ? true : false)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var10, var8);
              }
            }
          }
          param0.a(-632, this.selectedEvent, 32);
          param0.a(-632, this.selectedConditionOrAction, 32);
          pgb.a(8, null == this.reservedIds ? 0 : this.reservedIds.length, -120, param0, this.reservedIds);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "una.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, GameSnapshot param1) {
        int var4 = VoidHunters.field_G;
        try {
          GetAngleset.b(false);
          if (param0 != -2374) {
            this.selectedConditionOrAction = 104;
          }
          if (null != this.events) {
            this.field_c = 0;
            while (this.events.length > this.field_c) {
              this.events[this.field_c].a(param1, -40);
              this.field_c = this.field_c + 1;
            }
            this.field_c = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "una.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, kb param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -29328) {
            field_f = (String) null;
          }
          if (SetGrapplingHookFireForce.field_o == param1) {
            stackIn_19_0 = 6407;
            return stackIn_19_0;
          }
          if (param1 == qua.field_d) {
            stackIn_17_0 = 6408;
            return stackIn_17_0;
          }
          if (GetMinimapWidth.field_p == param1) {
            stackIn_15_0 = 6406;
            return stackIn_15_0;
          }
          if (param1 == SetSniperCannonFireForce.field_p) {
            stackIn_7_0 = 6409;
            return stackIn_7_0;
          }
          if (wh.field_o == param1) {
            stackIn_10_0 = 6410;
            return stackIn_10_0;
          }
          if (GetReverbGain.field_o != param1) {
            throw new IllegalStateException();
          }
          stackIn_13_0 = 6145;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("una.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, World param2) {
        MissionEvent var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (null != this.events &&
            this.selectedEvent >= 0 &&
            this.events.length > this.selectedEvent) {
            var4 = this.events[this.selectedEvent];
            var5 = var4.a((byte) 127, this.selectedConditionOrAction, param1);
            var4.a(var5 - 1, -61, param1, this.selectedConditionOrAction, param2);
          }
          if (param0 != 1) {
            field_f = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("una.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        MissionControl var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 26 % ((22 - param0) / 59);
          var3 = (MissionControl) (param1);
          stackIn_7_0 = (SetCountermeasureLauncherAimspeed.a(var3.events, false, 1, this.events, 119)) || (var3.selectedEvent != this.selectedEvent) || (this.selectedConditionOrAction != var3.selectedConditionOrAction) || (SetBlueprintSaveTime.a(var3.reservedIds, this.reservedIds, (byte) 28));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("una.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        MissionControl var3 = null;
        try {
          var3 = (MissionControl) (param1);
          var3.events = (MissionEvent[]) (sqb.a(var3.events, this.events, 1, GetExplosionPushMultiplier.field_o, false));
          var3.selectedConditionOrAction = this.selectedConditionOrAction;
          if (param0 <= 54) {
            this.reservedIds = (int[]) null;
          }
          var3.selectedEvent = this.selectedEvent;
          var3.reservedIds = SetTeamSelectionSpeedup.a(var3.reservedIds, (byte) -59, this.reservedIds);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "una.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(MissionAction param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.events != null &&
            0 <= this.selectedEvent &&
            this.events.length > this.selectedEvent) {
            this.events[this.selectedEvent].a(param0, true);
          }
          if (param1 != 0) {
            MissionControl.a((byte) 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("una.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(byte param0) {
        if (param0 != 82) {
          return;
        }
        if (this.events != null) {
          this.selectedEvent = (1 + this.selectedEvent) % this.events.length;
          this.selectedConditionOrAction = 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -98) {
          field_f = (String) null;
        }
        field_a = null;
        field_f = null;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        MissionControl var5 = null;
        try {
          var5 = (MissionControl) (other);
          tja.a(var5.events, 1, this.events, false, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var5.events, false, 1, this.events, 115)) {
            var4 = 1;
            System.out.println("MissionEvent[] events has changed. ");
          }
          if (var5.selectedEvent != this.selectedEvent) {
            System.out.println("int selected_event has changed. before=" + var5.selectedEvent + ", now=" + this.selectedEvent);
            var4 = 1;
          }
          if (this.selectedConditionOrAction != var5.selectedConditionOrAction) {
            System.out.println("int selected_condition_or_action has changed. before=" + var5.selectedConditionOrAction + ", now=" + this.selectedConditionOrAction);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.reservedIds, var5.reservedIds, false)) {
            var4 = 1;
            System.out.println("int[] reserved_ids has changed. ");
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionControl has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("una.F(");
          if (other == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void c(int param0) {
        MissionEvent var2 = new MissionEvent();
        this.events = (MissionEvent[]) (ija.a(var2, this.events, param0, GetExplosionPushMultiplier.field_o));
        this.selectedEvent = -1 + this.events.length;
    }

    final void c(byte param0) {
        tv var3;
        if (param0 != 55) {
          var3 = (tv) null;
          this.a((byte) -25, (tv) null);
        }
        if (this.field_c >= 0) {
          this.events = (MissionEvent[]) (GetSalvoUsesAllEnergy.a(GetExplosionPushMultiplier.field_o, this.field_c, param0 ^ 15620, this.events));
          this.field_c = this.field_c - 1;
        } else {
          this.events = (MissionEvent[]) (GetSalvoUsesAllEnergy.a(GetExplosionPushMultiplier.field_o, this.selectedEvent, 15667, this.events));
          if (null != this.events &&
            this.events.length <= this.selectedEvent) {
            this.selectedEvent = -1 + this.events.length;
          }
          if (null == this.events ||
            this.events.length == 0) {
            this.selectedEvent = 0;
          }
        }
    }

    final void a(boolean param0, World param1, int param2) {
        MissionEvent var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (null != this.events &&
            0 <= this.selectedEvent &&
            this.events.length > this.selectedEvent) {
            var4 = this.events[this.selectedEvent];
            var5 = var4.a((byte) -82, this.selectedConditionOrAction, param2);
            var4.a(1 + var5, 118, param2, this.selectedConditionOrAction, param1);
          }
          if (param0) {
            this.selectedConditionOrAction = 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("una.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var4 = 0;
        int var2;
        MissionEvent[] var3;
        MissionEvent var5;
        MissionCondition[] var6;
        MissionAction[] var7;
        int var9;
        MissionCondition var10;
        MissionAction var10_ref;
        int var12;
        MissionCondition[] var13;
        MissionAction[] var14;
        int var15;
        MissionCondition var16;
        Object var17;
        MissionAction var18;
        Object var19;
        hd var20;
        hd var21;
        int var9Lifetime1;
        var17 = null;
        var19 = null;
        var12 = VoidHunters.field_G;
        var2 = 43 / ((-7 - param0) / 55);
        this.reservedIds = null;
        if (this.events != null) {
          var3 = this.events;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var6 = var5.getConditions((byte) -115);
            var7 = var5.getActions((byte) -42);
            if (var6 != null) {
              var13 = var6;
              for (var9 = 0; var9 < var13.length; var9++) {
                var16 = var13[var9];
                var10 = var16;
                if (var10 instanceof hd) {
                  var20 = (hd) ((Object) var16);
                  this.reservedIds = var20.a(121, this.reservedIds);
                }
              }
            }
            if (var7 != null) {
              var14 = var7;
              var15 = 0;
              var9Lifetime1 = var15;
              while (var14.length > var15) {
                var18 = var14[var15];
                var10_ref = var18;
                if (var10_ref instanceof hd) {
                  var21 = (hd) ((Object) var18);
                  this.reservedIds = var21.a(114, this.reservedIds);
                }
                var15++;
              }
            }
          }
        }
    }

    final MissionEvent[] getEvents(int param0) {
        if (param0 != 1) {
          GameSnapshot var3 = (GameSnapshot) null;
          this.a(23, (GameSnapshot) null);
        }
        return this.events;
    }

    public MissionControl() {
        this.field_c = -1;
    }

    final void a(int param0) {
        MissionEvent var2 = null;
        if (param0 != -828) {
          this.selectedEvent = 33;
        }
        if (null != this.events &&
          (this.selectedEvent >= 0 && this.selectedEvent < this.events.length)) {
          var2 = this.events[this.selectedEvent];
          var2.a(this.selectedConditionOrAction, -1);
        }
    }

    final void a(int param0, MissionEvent param1) {
        try {
          this.events = (MissionEvent[]) (ija.a(param1, this.events, param0, GetExplosionPushMultiplier.field_o));
          this.d((byte) -111);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "una.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "Maximum ship size reached";
    }
}
