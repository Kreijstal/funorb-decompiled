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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = DungeonAssault.field_K;
        if (super.a(param0, param1, param2, param3, param4, (byte) 83, param6)) {
          L0: {
            var8 = -((eb) this).field_J + (param4 - param3);
            var9 = ((eb) this).field_x - 2 * ((eb) this).field_J;
            if (var8 <= var9) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (var8 <= -1) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = ((eb) this).field_Q * var8 / var9;
          if (-2 != param1) {
            if ((param1 ^ -1) == -3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((eb) this).field_K.a((byte) -44) <= var12) {
                  if ((var11 ^ -1) > -1) {
                    return true;
                  } else {
                    ((eb) this).field_K.b(var11, 100);
                    return true;
                  }
                } else {
                  var13 = -var8 + ((eb) this).field_K.a(-814, var12);
                  var13 = var13 * var13;
                  if (var13 < var10) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((eb) this).field_K.e(var8, -67);
            return true;
          }
        } else {
          var8 = -119 / ((param5 - -80) / 35);
          return false;
        }
    }

    final int i(int param0) {
        if (param0 <= 88) {
            int discarded$0 = ((eb) this).a(-112, 127);
            return ((eb) this).field_K.a((byte) -72);
        }
        return ((eb) this).field_K.a((byte) -72);
    }

    final int a(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (((eb) this).field_K.a((byte) -91) <= param1) {
            return -1;
          } else {
            return ((eb) this).field_K.a(-814, param1);
          }
        } else {
          return -1;
        }
    }

    public static void f(byte param0) {
        field_M = null;
        if (param0 != 86) {
          eb.f((byte) 0);
          field_O = null;
          field_L = null;
          field_I = null;
          field_P = null;
          return;
        } else {
          field_O = null;
          field_L = null;
          field_I = null;
          field_P = null;
          return;
        }
    }

    private eb() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        if (param0 >= -58) {
            field_L = null;
            return ((eb) this).field_Q;
        }
        return ((eb) this).field_Q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Select attack/defence balance";
        field_L = "<col=FF0000>Attack -2</col>, <%col_detect>Detect +2</col> in adjacent rooms.";
        field_M = "Grey-skinned, faceless and hairless, this gangly creature can reshape its body at will.";
        field_I = "Order your raider to attempt to leave the room without fighting the monster. The monster in the room will not be defeated; you can send in a different raider or find another path around the monster.<br><br>Requires: <col=0A7500>Defence</col>, <col=21634A>Dodge</col>";
    }
}
