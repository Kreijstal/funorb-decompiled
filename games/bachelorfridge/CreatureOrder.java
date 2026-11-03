/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CreatureOrder extends IntrusiveNode {
    CreatureRef creature;
    int field_f;
    int moveId;

    abstract CreatureEvent createEvent(BattleState param0, int param1);

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = -51 % ((-79 - param2) / 46);
        if (param3 < an.field_q) {
          return;
        }
        if (param3 <= ha.field_n) {
          param1 = cr.a(DualLinkNode.field_l, param1, SnowAnimation.field_x, 0);
          param4 = cr.a(DualLinkNode.field_l, param4, SnowAnimation.field_x, 0);
          ew.a(param1, param3, -82, param0, param4);
          return;
        }
    }

    CreatureOrder(int param0, int param1, CreatureRef param2) {
        try {
          this.creature = param2;
          this.field_f = param0;
          this.moveId = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "sfa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        BitPacketBuffer var3 = sja.field_fb;
        var3.writeCipheredByte(param0, (byte) 119);
        var3.writeByte(3, 0);
        var3.writeByte(10, 0);
        var3.b(param1, -125);
        if (!param2) {
          return;
        }
        CreatureOrder.a(-72, -127, false);
    }

    public final String toString() {
        MoveDefinition var1 = al.a(123, this.moveId);
        if (var1 == null) {
          return "Move not found.";
        }
        return var1.name;
    }

    void a(int param0, PacketBuffer param1) {
        try {
          int var3_int = 34 % ((param0 - 61) / 53);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "sfa.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
