/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks extends EventEffect {
    static int field_i;

    final void a(PacketBuffer param0, byte param1) {
        try {
          FlirtAnimation.a(this.target, 121, param0);
          int var3_int = 30 / ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ks.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(BattleCreature param0, BattleState param1, int param2) {
        BattleCreature var4 = null;
        if (param2 != 12) {
          return;
        }
        try {
          var4 = this.target.a(123, param1);
          var4.b((byte) 117, 0);
          var4.d(param2 - 123);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ks.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ks(CreatureRef param0) {
        try {
          this.target = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ks.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
