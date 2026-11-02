/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends EventEffect {
    static int field_k;
    static sna field_m;
    int field_l;
    static int field_j;
    static boolean field_i;

    final void a(PacketBuffer param0, byte param1) {
        try {
          FlirtAnimation.a(this.target, 120, param0);
          int var3_int = 51 % ((param1 - 34) / 58);
          param0.writeByte(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kt.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -23401) {
          kt.a(89);
          field_m = null;
          return;
        }
        field_m = null;
    }

    kt(CreatureRef param0, int param1) {
        try {
          this.field_l = param1;
          this.target = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(BattleCreature param0, BattleState param1, int param2) {
        BattleCreature var4 = null;
        try {
          var4 = this.target.a(param2 ^ 93, param1);
          var4.j(this.field_l, param2 ^ param2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kt.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
