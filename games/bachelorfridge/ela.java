/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends EventEffect {
    private int field_k;
    static IndexedSprite[] field_j;
    static sna field_i;

    public static void d(byte param0) {
        if (param0 != 80) {
          field_i = (sna) null;
          field_j = null;
          field_i = null;
          return;
        }
        field_j = null;
        field_i = null;
    }

    final void a(PacketBuffer param0, byte param1) {
        try {
          int var3_int = 37 % ((34 - param1) / 58);
          super.a(param0, (byte) -49);
          FlirtAnimation.a(this.target, 108, param0);
          param0.writeByte(this.field_k, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ela.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(BattleCreature param0, BattleState param1, int param2) {
        BattleCreature var4 = this.target.a(param2 ^ 18, param1);
        if (var4 == null) {
          return;
        }
        try {
          var4.c(this.field_k, (byte) -79);
          if (param2 != 12) {
            ela.d((byte) 105);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ela.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ela(CreatureRef param0, int param1) {
        try {
          this.target = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ela.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
