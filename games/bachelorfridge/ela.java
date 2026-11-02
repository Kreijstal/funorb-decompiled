/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends EventEffect {
    private int field_k;
    static IndexedSprite[] field_j;
    static UiComponent field_i;

    public static void releaseStatics(byte param0) {
        if (param0 != 80) {
          field_i = (UiComponent) null;
          field_j = null;
          field_i = null;
          return;
        }
        field_j = null;
        field_i = null;
    }

    final void write(PacketBuffer param0, byte param1) {
        try {
          int var3_int = 37 % ((34 - param1) / 58);
          super.write(param0, (byte) -49);
          FlirtAnimation.a(this.target, 108, param0);
          param0.writeByte(this.field_k, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ela.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void apply(BattleCreature param0, BattleState param1, int param2) {
        BattleCreature var4 = this.target.a(param2 ^ 18, param1);
        if (var4 == null) {
          return;
        }
        try {
          var4.c(this.field_k, (byte) -79);
          if (param2 != 12) {
            ela.releaseStatics((byte) 105);
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
