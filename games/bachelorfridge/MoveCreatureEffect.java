/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MoveCreatureEffect extends EventEffect {
    int field_i;
    static du field_k;
    static String field_j;
    int field_l;

    final static void a(byte[] param0, byte param1) {
        int var2_int = 0;
        int var5 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = BachelorFridge.field_y;
        try {
          lka.field_E = qs.a(false, new PacketBuffer(param0));
          uma.field_P = new kga[lka.field_E.length - 1];
          if (param1 != 22) {
            field_k = (du) null;
          }
          for (var2_int = 1; lka.field_E.length > var2_int; var2_int++) {
            var3 = vc.a(var2_int, 0, -16306);
            var4 = new int[15];
            for (var5 = 0; var4.length > var5; var5++) {
              var4[var5] = cl.a(var5 + 2, (byte) 107, var2_int);
            }
            HailSpecial.a(var4, var3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("bj.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 != -13) {
          field_k = (du) null;
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        try {
          super.a(param0, (byte) -28);
          FlirtAnimation.a(this.target, 122, param0);
          param0.writeByte(this.field_i, 0);
          int var3_int = -81 / ((34 - param1) / 58);
          param0.writeByte(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(BattleCreature param0, BattleState param1, int param2) {
        if (param2 != 12) {
          field_k = (du) null;
        }
        BattleCreature var5 = this.target.a(param2 ^ 30, param1);
        BattleCreature var4 = var5;
        if (null != param1.tiles[this.field_i][this.field_l].occupant) {
          return;
        }
        try {
          param1.tiles[var5.tileX][var5.tileY].occupant = null;
          var4.tileY = this.field_l;
          var4.tileX = this.field_i;
          param1.tiles[this.field_i][this.field_l].occupant = var4;
          var4.f(32);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    MoveCreatureEffect(CreatureRef param0, int param1, int param2) {
        try {
          this.target = param0;
          this.field_i = param1;
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = new du(2, 4, 4, 0);
        field_j = "***Target blocked!***";
    }
}
