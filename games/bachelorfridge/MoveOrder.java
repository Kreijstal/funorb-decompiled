/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MoveOrder extends CreatureOrder {
    int field_l;
    static boolean field_k;
    static int[] field_j;
    int field_i;

    final void a(int param0, PacketBuffer param1) {
        try {
          int var3_int = -113 / ((61 - param0) / 53);
          param1.writeByte(this.field_i | this.field_l << 3, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "gm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0, BattleState param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BoardTile var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BattleCreature var10 = null;
        BattleCreature var11 = null;
        try {
          var10 = this.creature.a(42, param1);
          var11 = var10;
          var4 = param1.tiles[var10.tileX][var10.tileY];
          var5 = var11.a(51, (byte) -87) ? 1 : 0;
          var7 = 62 / ((param0 + 27) / 32);
          stackIn_3_0 = (var4.terrain != 27) ? 0 : 1;
          var6 = stackIn_3_0;
          if (1 == param1.field_E) {
            stackIn_9_0 = (!var4.field_i) ? 1 : 0;
          } else {
            stackIn_9_0 = 0;
          }
          var8 = stackIn_9_0;
          if (var5 == 0 &&
            var6 == 0 &&
            var8 == 0) {
            stackIn_14_0 = this.field_l;
            return stackIn_14_0;
          }
          var9 = this.field_l;
          if (var8 != 0) {
            var9 = var9 + (-1 + DiveBomberAnimation.a(3, param1.field_w, -2147483648));
            if (var9 < 1) {
              var9 = 1;
            }
          }
          if (var6 != 0) {
            if (var4.field_j == 1) {
              var9--;
            }
            if (var4.field_j == 2) {
              var9 -= 2;
            }
            if (3 == var4.field_j ||
              var4.field_j == 4) {
              var9 -= 3;
            }
            if (var9 < 1) {
              var9 = 1;
            }
          }
          stackIn_34_0 = param1.a(var9, var11, this.field_i, -1);
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("gm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final MoveEvent b(int param0, int param1, boolean param2) {
        if (param0 != 25683) {
          return (MoveEvent) null;
        }
        return new MoveEvent(this.moveId, this.creature, this.field_i, param1, param2);
    }

    MoveOrder(int param0, BattleCreature param1) {
        super(2, param0, new CreatureRef(param1));
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          if (param0 > param4) {
            var5_int = (param4 + param0) / 2;
            var6 = param4;
            var7 = param2[var5_int];
            param2[var5_int] = param2[param0];
            param2[param0] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param0];
            param3[param0] = var8;
            stackIn_5_0 = (2147483647 != var7) ? 1 : 0;
            var9 = stackIn_5_0;
            for (var10 = param4; param0 > var10; var10++) {
              if (param2[var10] > (var7 - (var10 & var9))) {
                var11 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param2[param0] = param2[var6];
            param2[var6] = var7;
            param3[param0] = param3[var6];
            param3[var6] = var8;
            MoveOrder.a(-1 + var6, -30111, param2, param3, param4);
            MoveOrder.a(param0, -30111, param2, param3, 1 + var6);
          }
          if (param1 != -30111) {
            field_k = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_j = null;
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        MoveEvent stackIn_3_0 = null;
        MoveEvent stackIn_8_0 = null;
        MoveEvent stackIn_13_0 = null;
        MoveEvent stackIn_20_0 = null;
        MoveEvent stackIn_63_0 = null;
        MoveEvent stackIn_65_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        BoardTile var6 = null;
        BattleCreature var7 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        BattleState var11 = null;
        BattleCreature var12 = null;
        BattleCreature var13 = null;
        var10 = BachelorFridge.field_y;
        try {
          var12 = this.creature.a(32, param0);
          var13 = var12;
          if (8 == var13.statusId) {
            stackIn_3_0 = this.b(25683, 0, true);
            return (CreatureEvent) ((Object) stackIn_3_0);
          }
          if (var13.statusId == 11 &&
            DiveBomberAnimation.a(100, param0.field_w, param1 + 2147483645) > 50) {
            stackIn_8_0 = this.b(25683, 0, true);
            return (CreatureEvent) ((Object) stackIn_8_0);
          }
          if (param0.tiles[var12.tileX][var12.tileY].terrain == 30 &&
            var13.statusId != 32) {
            stackIn_13_0 = this.b(25683, 0, true);
            return (CreatureEvent) ((Object) stackIn_13_0);
          }
          if (var13.statusId == 51) {
            this.field_i = 1 + DiveBomberAnimation.a(4, param0.field_w, -2147483648);
          }
          var13.field_s = this.field_i;
          this.field_l = this.a((byte) -97, param0);
          if (this.field_l == 0) {
            stackIn_20_0 = this.b(25683, 0, true);
            return (CreatureEvent) ((Object) stackIn_20_0);
          }
          var4 = var13.tileX;
          var5 = var13.tileY;
          if (this.field_i != 2) {
            if (this.field_i != 1) {
              if (this.field_i != 4) {
                if (this.field_i == 3) {
                  var5 = var5 + this.field_l;
                }
              } else {
                var4 = var4 + this.field_l;
              }
            } else {
              var5 = var5 - this.field_l;
            }
          } else {
            var4 = var4 - this.field_l;
          }
          if (param1 != 3) {
            var11 = (BattleState) null;
            this.createEvent((BattleState) null, -85);
          }
          if (param0.tiles[var4][var5].terrain == 22 ||
            param0.tiles[var4][var5].terrain == 28) {
            this.field_l = this.field_l - 1;
          }
          boolean decompiledFrameRemainder0 = true;
          var6 = param0.tiles[var4][var5];
          var7 = var6.occupant;
          if (var7 != null) {
            var8 = null;
            if (var7.field_k[1] < var12.field_k[1] &&
              var8 != null) {
              ((MoveEvent) (var8)).field_t = true;
              ((MoveEvent) (var8)).field_n = ((MoveEvent) (var8)).field_n - 1;
              param0.tiles[var12.tileX][var12.tileY].occupant = null;
              if (2 == ((MoveEvent) (var8)).field_p) {
                param0.tiles[1 + var12.tileX][var12.tileY].occupant = var7;
                var7.tileX = var7.tileX + 1;
              } else {
                if (((MoveEvent) (var8)).field_p == 4) {
                  param0.tiles[-1 + var13.tileX][var13.tileY].occupant = var7;
                  var7.tileX = var7.tileX - 1;
                } else {
                  if (((MoveEvent) (var8)).field_p == 1) {
                    param0.tiles[var13.tileX][1 + var13.tileY].occupant = var7;
                    var7.tileY = var7.tileY + 1;
                  } else {
                    if ((((MoveEvent) (var8)).field_p == 3)) {
                      param0.tiles[var13.tileX][-1 + var13.tileY].occupant = var7;
                      var7.tileY = var7.tileY - 1;
                    }
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var9 = -1 + this.field_l;
              while (0 < var9) {
                if ((this.field_i != 2 ||
                  null != param0.tiles[var13.tileX - var9][var13.tileY].occupant) &&
                  (1 != this.field_i ||
                  param0.tiles[var13.tileX][var13.tileY - var9].occupant != null) &&
                  (this.field_i != 4 ||
                  param0.tiles[var13.tileX + var9][var13.tileY].occupant != null)) {
                  if (this.field_i == 3 &&
                    param0.tiles[var13.tileX][var9 + var13.tileY].occupant == null) {
                    return (CreatureEvent) ((Object) this.b(25683, var9, true));
                  }
                  var9--;
                  continue;
                }
                break;
              }
              stackIn_63_0 = this.b(25683, var9, true);
              return (CreatureEvent) ((Object) stackIn_63_0);
            }
          }
          stackIn_65_0 = this.b(25683, this.field_l, false);
          return (CreatureEvent) ((Object) stackIn_65_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("gm.A(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = false;
        field_j = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
    }
}
