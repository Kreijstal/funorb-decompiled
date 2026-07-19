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
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var14 = DungeonAssault.field_K;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, (byte) 83, param6)) {
              L1: {
                var8_int = -this.field_J + (param4 - param3);
                var9 = this.field_x - 2 * this.field_J;
                if (var8_int <= var9) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) <= -1) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_Q * var8_int / var9;
                if (-2 != (param1 ^ -1)) {
                  if ((param1 ^ -1) != -3) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_K.a((byte) -44) <= var12) {
                        if ((var11 ^ -1) <= -1) {
                          this.field_K.b(var11, 100);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        var13 = -var8_int + this.field_K.a(-814, var12);
                        var13 = var13 * var13;
                        if (var13 < var10) {
                          var11 = var12;
                          var10 = var13;
                          var12++;
                          continue L4;
                        } else {
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  this.field_K.e(var8_int, -67);
                  break L3;
                }
              }
              stackOut_18_0 = 1;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8_int = -119 / ((param5 - -80) / 35);
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var8);
            stackOut_22_1 = new StringBuilder().append("eb.U(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    final int i(int param0) {
        int discarded$0 = 0;
        if (param0 <= 88) {
            discarded$0 = this.a(-112, 127);
            return this.field_K.a((byte) -72);
        }
        return this.field_K.a((byte) -72);
    }

    final int a(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (this.field_K.a((byte) -91) <= param1) {
            return -1;
          } else {
            return this.field_K.a(-814, param1);
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
