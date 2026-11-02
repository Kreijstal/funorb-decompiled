/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SnowEffect extends EventEffect {
    final void a(PacketBuffer param0, byte param1) {
        try {
          super.a(param0, (byte) 94);
          int var3_int = 13 / ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public SnowEffect() {
    }

    final void a(BattleCreature param0, BattleState param1, int param2) {
        if (param2 != 12) {
          return;
        }
        try {
          param1.field_x = true;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eba.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
