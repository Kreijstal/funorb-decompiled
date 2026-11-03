/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PetAttackEvent extends SpecialEvent {
    static String field_q;
    int field_t;
    static du field_r;
    int field_u;
    static Sprite field_s;

    PetAttackEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final void a(byte param0, PacketBuffer param1) {
        super.a((byte) -76, param1);
        if (param0 > -12) {
          return;
        }
        try {
          param1.writeByte(this.field_u, 0);
          param1.writeByte(this.field_t, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = 10 % ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_s = null;
        if (param0 != -89) {
          PetAttackEvent.d((byte) 8);
          field_r = null;
          return;
        }
        field_r = null;
    }

    PetAttackEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 81);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_u = param0.readUnsignedByte(16711935);
          this.field_t = param0.readUnsignedByte(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        BattleState var4 = null;
        PetAttackAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (BattleState) null;
            this.a((BattleState) null, -65);
          }
          stackIn_3_0 = new PetAttackAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_q = "Seriously offensive language";
        field_r = new du(10, 2, 2, 0);
    }
}
