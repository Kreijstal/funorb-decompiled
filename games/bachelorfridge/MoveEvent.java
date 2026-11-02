/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MoveEvent extends CreatureEvent {
    static String field_s;
    static int field_r;
    int field_n;
    static String field_q;
    static int field_o;
    int field_p;
    boolean field_t;

    final void a(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        try {
          var3_int = this.field_n << 3 | this.field_p;
          if (param0 > -12) {
            field_o = -50;
          }
          if (this.field_t) {
            var3_int = var3_int | 128;
          }
          param1.writeByte(var3_int, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "df.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    MoveEvent(int param0, CreatureRef param1, int param2, int param3, boolean param4) {
        super(2, param0, param1);
        try {
          this.field_p = param2;
          this.field_t = param4 ? true : false;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "df.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        BattleState var4 = null;
        qf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (BattleState) null;
            this.apply((BattleState) null, false);
          }
          stackIn_3_0 = new qf(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("df.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static EventEffect b(PacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PacketBuffer var5 = null;
        bm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 33) {
            var5 = (PacketBuffer) null;
            MoveEvent.b((PacketBuffer) null, -113);
          }
          var2_int = param0.readUnsignedByte(16711935);
          var3 = param0.readUnsignedByte(16711935);
          var4 = param0.readUnsignedByte(16711935);
          stackIn_3_0 = new bm(var2_int, var3, var4);
          return (EventEffect) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("df.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void apply(BattleState param0, boolean param1) {
        BattleCreature var3 = null;
        try {
          var3 = this.creature.a(103, param0);
          var3.d(this.moveId, (byte) -104);
          var3.a(param1, this.field_n, this.field_p);
          var3.field_s = this.field_p;
          if (hl.a((byte) 109, this.moveId) &&
            !var3.g((byte) 85) &&
            33 != var3.statusId &&
            var3.statusId != 31) {
            var3.b((byte) 123, 2);
            var3.statusTurns = var3.statusTurns - 1;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "df.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    MoveEvent(PacketBuffer param0) {
        super(2, param0);
        int var2_int = 0;
        try {
          var2_int = param0.readUnsignedByte(16711935);
          this.field_p = 7 & var2_int;
          this.field_n = 15 & var2_int >> 3;
          this.field_t = (var2_int & 128) != 0 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_s = null;
        if (param0 != 15) {
          field_s = (String) null;
        }
    }

    static {
        field_o = 0;
        field_q = "This game option has not yet been unlocked for use.";
    }
}
