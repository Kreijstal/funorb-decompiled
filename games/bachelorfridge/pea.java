/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea extends EventEffect {
    static Sprite field_k;
    static String field_l;
    private int field_j;
    private int field_i;

    final void apply(BattleCreature param0, BattleState param1, int param2) {
        Object var4 = null;
        if (null != this.target) {
          var4 = this.target.a(116, param1);
        }
        if (var4 == null) {
          var4 = param1.c(this.field_j, this.field_i, 112);
        }
        if (var4 == null) {
          return;
        }
        if (param2 != 12) {
          return;
        }
        try {
          ((BattleCreature) (var4)).field_A = false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pea.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_l = null;
        if (param0 != 116) {
          pea.e((byte) -2);
          field_k = null;
          return;
        }
        field_k = null;
    }

    final void write(PacketBuffer param0, byte param1) {
        try {
          int var3_int = 23 % ((param1 - 34) / 58);
          super.write(param0, (byte) 113);
          FlirtAnimation.a(this.target, 115, param0);
          param0.writeByte(this.field_j, 0);
          param0.writeByte(this.field_i, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pea.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pea(CreatureRef param0, int param1, int param2) {
        try {
          this.field_i = param2;
          this.target = param0;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          for (var1_int = 0; BananarangEvent.field_s.field_g.field_m.length > var1_int; var1_int++) {
            BananarangEvent.field_s.field_g.field_m[var1_int] = -1;
          }
          if (param0 > 113) {
            return;
          }
          pea.e((byte) 34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1), "pea.B(" + param0 + ')');
        }
    }

    static {
        field_l = "Drag and drop some food into the fridge.";
    }
}
