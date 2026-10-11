/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ck {
    static String field_P;
    int field_J;
    private bp field_K;
    static String field_L;
    static String field_M;
    static cf[] field_O;
    int field_N;
    private int field_Q;
    static String field_I;

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var8_intLifetime1;
        var14 = DungeonAssault.field_K;
        try {
          if (!super.a(param0, param1, param2, param3, param4, (byte) 83, param6)) {
            var8_int = -119 / ((param5 + 80) / 35);
            return false;
          }
          var8_intLifetime1 = -this.field_J + (param4 - param3);
          var9 = this.field_x - 2 * this.field_J;
          if (var8_intLifetime1 > var9) {
            var8_intLifetime1 = var9;
          }
          if (var8_intLifetime1 < 0) {
            var8_intLifetime1 = 0;
          }
          var8_intLifetime1 = this.field_Q * var8_intLifetime1 / var9;
          if (param1 != 1) {
            if (param1 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_K.a((byte) -44) > var12; var12++) {
                var13 = -var8_intLifetime1 + this.field_K.a(-814, var12);
                var13 = var13 * var13;
                if (var13 < var10) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 >= 0) {
                this.field_K.b(var11, 100);
              }
            }
          } else {
            this.field_K.e(var8_intLifetime1, -67);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("eb.U(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int i(int param0) {
        if (param0 <= 88) {
          this.a(-112, 127);
          return this.field_K.a((byte) -72);
        }
        return this.field_K.a((byte) -72);
    }

    final int a(int param0, int param1) {
        if (~param1 > param0) {
          return -1;
        }
        if (this.field_K.a((byte) -91) > param1) {
          return this.field_K.a(-814, param1);
        }
        return -1;
    }

    public static void f(byte param0) {
        field_M = null;
        if (param0 == 86) {
          field_O = null;
          field_L = null;
          field_I = null;
          field_P = null;
          return;
        }
        eb.f((byte) 0);
        field_O = null;
        field_L = null;
        field_I = null;
        field_P = null;
    }

    private eb() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        if (param0 >= -58) {
          field_L = (String) null;
          return this.field_Q;
        }
        return this.field_Q;
    }

    static {
        field_P = "Select attack/defence balance";
        field_L = "<col=FF0000>Attack -2</col>, <%col_detect>Detect +2</col> in adjacent rooms.";
        field_M = "Grey-skinned, faceless and hairless, this gangly creature can reshape its body at will.";
        field_I = "Order your raider to attempt to leave the room without fighting the monster. The monster in the room will not be defeated; you can send in a different raider or find another path around the monster.<br><br>Requires: <col=0A7500>Defence</col>, <col=21634A>Dodge</col>";
    }
}
