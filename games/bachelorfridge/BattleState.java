/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattleState {
    int field_J;
    static String field_q;
    static Sprite[] field_I;
    int field_G;
    int field_m;
    static Sprite field_u;
    Random field_w;
    int field_Q;
    boolean field_R;
    int field_s;
    int field_F;
    private IntrusiveDeque field_P;
    int field_E;
    int field_A;
    private IntrusiveDeque[] field_t;
    BoardTile[][] tiles;
    int field_e;
    int field_f;
    private CreatureRef[] field_n;
    boolean field_l;
    boolean field_r;
    int[][] field_c;
    int field_h;
    PlayerMatchStats[] field_H;
    paa field_T;
    private int field_D;
    int field_O;
    String[] field_y;
    private int[] field_g;
    lr field_L;
    boolean field_N;
    IntrusiveDeque field_U;
    int height;
    int field_k;
    int[] field_C;
    PlayerRoster[] rosters;
    int field_v;
    int field_b;
    int width;
    boolean field_x;
    CreatureOrder[][] field_j;
    int[][] field_i;
    int field_o;
    int field_K;
    vg field_p;
    int playerCount;
    int field_M;

    final void g(int param0) {
        if (param0 < 126) {
          CreatureProfile[] var3 = (CreatureProfile[]) null;
          this.a(42, (CreatureProfile[]) null, -43);
        }
    }

    final void a(int param0, BattleCreature param1, int param2) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.tiles[param1.tileX][param1.tileY].terrain != 20) {
            this.b((byte) 123, param2, param1.tileX, param1.tileY);
          }
          if (0 <= -1 + param1.tileX &&
            this.tiles[-1 + param1.tileX][param1.tileY].terrain != 20) {
            this.b((byte) -63, param2, -1 + param1.tileX, param1.tileY);
          }
          if (1 + param1.tileX < this.width &&
            20 != this.tiles[1 + param1.tileX][param1.tileY].terrain) {
            this.b((byte) 91, param2, param1.tileX + 1, param1.tileY);
          }
          if (param0 != -25) {
            this.a((byte) 64, -97);
          }
          if (-1 + param1.tileY >= 0 &&
            this.tiles[param1.tileX][param1.tileY - 1].terrain != 20) {
            this.b((byte) -82, param2, param1.tileX, -1 + param1.tileY);
          }
          if (this.height > param1.tileY + 1 &&
            this.tiles[param1.tileX][param1.tileY + 1].terrain != 20) {
            this.b((byte) 119, param2, param1.tileX, param1.tileY + 1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("op.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0, BattleCreature param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        BoardTile var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          if (param3 != -1) {
            this.height = -3;
          }
          var5_int = 0;
          var6 = 1;
          while (true) {
            if (param0 < var6) {
              stackIn_33_0 = var5_int;
              return stackIn_33_0;
            }
            var7 = param1.tileX;
            var8 = param1.tileY;
            if (param2 != 2) {
              if (param2 == 4) {
                var7 = var7 + var6;
              } else {
                if (param2 != 1) {
                  if (3 == param2) {
                    var8 = var8 + var6;
                  }
                } else {
                  var8 = var8 - var6;
                }
              }
            } else {
              var7 = var7 - var6;
            }
            if (var7 >= 0 &&
              var7 < this.width &&
              0 <= var8 &&
              this.height > var8) {
              var9 = this.tiles[var7][var8];
              var10 = var9.terrain;
              if (var10 == 21) {
                stackIn_24_0 = var6;
                return stackIn_24_0;
              }
              if (!param1.a(var10, false)) {
                stackIn_27_0 = var6 - 1;
                return stackIn_27_0;
              }
              if (null == var9.occupant) {
                var5_int = var6;
              }
              var6++;
              continue;
            }
            break;
          }
          stackIn_20_0 = -1 + var6;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_36_0 = var5;
          stackIn_36_1 = new StringBuilder().append("op.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var6 = 0;
        int var2;
        int[] var2_ref_int__;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int[] var11;
        int[] var14;
        int[][] var17;
        int[] var18;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var8 = BachelorFridge.field_y;
        if (param0 <= 92) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_o == 2) {
          var14 = new int[this.playerCount];
          var11 = var14;
          var2_ref_int__ = var11;
          var3 = 0;
          var17 = this.field_i;
          for (var5 = 0; var17.length > var5; var5++) {
            var18 = var17[var5];
            var7 = var18[2];
            if (-1 == var7) {
              var3++;
            } else {
              var2_ref_int__[var7] = var2_ref_int__[var7] + 1;
            }
          }
          var4 = -1;
          var5Lifetime1 = var3;
          for (var6 = 0; var14.length > var6; var6++) {
            var7Lifetime1 = var14[var6];
            if (var7Lifetime1 > var5Lifetime1) {
              var4 = var6;
              var5Lifetime1 = var7Lifetime1;
            } else {
              if (var7Lifetime1 == var5Lifetime1) {
                var4 = -1;
              }
            }
          }
          if (var4 <= -1) {
            this.field_M = var4;
            this.field_Q = -1;
          } else {
            if (var4 == this.field_M) {
              this.field_Q = this.field_Q - 1;
            } else {
              this.field_M = var4;
              this.field_Q = 3;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_o == 3) {
            var2 = -1;
            var3Lifetime1 = 0;
            for (var4Lifetime1 = 0; this.playerCount > var4Lifetime1; var4Lifetime1++) {
              if (this.field_C[var4Lifetime1] > var3Lifetime1) {
                var2 = var4Lifetime1;
                var3Lifetime1 = this.field_C[var4Lifetime1];
              }
            }
            if (var3Lifetime1 > 3) {
              this.field_M = var2;
              this.field_Q = 0;
            }
          }
        }

    }

    final void b(PacketBuffer param0, byte param1) {
        try {
          param0.b(this.field_A, -126);
          param0.writeByte(this.field_N ? 1 : 0, 0);
          int var3_int = -55 / ((param1 - 85) / 37);
          param0.writeByte(this.field_M, 0);
          param0.writeByte(this.field_Q, 0);
          this.c(param0, (byte) 92);
          this.d(param0, (byte) -115);
          this.a(param0, (byte) 113);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "op.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(BattleCreature param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 0) {
            param2 = ov.b(param2, 60);
            param3 = -param3;
          }
          if (param1 >= 68) {
            stackIn_6_0 = this.a(param2, param3, param0, (byte) -44);
            return stackIn_6_0;
          }
          stackIn_4_0 = 9;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("op.GA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        BattleCreature var5 = null;
        PlayerRoster dupTemp$0 = null;
        int var6 = BachelorFridge.field_y;
        try {
          this.field_A = param1.readUnsignedShort((byte) 91);
          this.field_N = ~param1.readUnsignedByte(16711935) != param0 ? false : true;
          this.field_M = param1.b(true);
          this.field_Q = param1.readUnsignedByte(16711935);
          this.b(-1, param1);
          this.b(param1, 68);
          this.rosters = new PlayerRoster[this.playerCount];
          for (var3_int = 0; this.playerCount > var3_int; var3_int++) {
            this.rosters[var3_int] = new PlayerRoster(var3_int);
            for (var4 = 0; var4 < 7; var4++) {
              var5 = MoveInfoPanel.a(this, -51, param1);
              if (var5 != null) {
                this.rosters[var3_int].field_b[var4] = var5;
                dupTemp$0 = this.rosters[var3_int];
                dupTemp$0.field_a = dupTemp$0.field_a + 1;
              }
            }
          }
          this.j(-1);
          this.g(127);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "op.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_I = null;
        field_q = null;
        field_u = null;
        if (param0 < 34) {
          BattleState.e((byte) 67);
        }
    }

    final void i(byte param0) {
        int var3 = 0;
        int var2;
        BattleCreature var4;
        int var6;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        var6 = BachelorFridge.field_y;
        for (var2 = 0; var2 < 7; var2++) {
          this.field_t[var2] = new IntrusiveDeque();
        }
        this.field_n = new CreatureRef[7 * this.playerCount];
        for (var2Lifetime1 = 0; var2Lifetime1 < this.playerCount; var2Lifetime1++) {
          for (var3 = 0; var3 < 7; var3++) {
            var4 = this.rosters[var2Lifetime1].field_b[var3];
            if (var4 != null &&
              !var4.isDown(-118)) {
              var5 = var4.field_k[1];
              if (!var4.field_z) {
                var5++;
              }
              this.field_t[var5].a(new CreatureRef(var4.ownerIndex, var4.rosterSlot), true);
            }
          }
        }
        var2Lifetime2 = 89 / ((-14 - param0) / 32);
    }

    final void a(int[][] param0, byte param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        BoardTile var10 = null;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          if (param1 < 4) {
            this.field_o = -87;
          }
          for (var7_int = 0; param2 > var7_int; var7_int++) {
            var8 = param0[var7_int][0];
            var9 = param0[var7_int][1];
            if (var8 >= 0 &&
              this.width > var8 &&
              var9 >= 0 &&
              this.height > var9) {
              var10 = this.tiles[var8][var9];
              if (var10.terrain != 20 &&
                22 != var10.terrain &&
                var10.terrain != 21 &&
                23 != var10.terrain &&
                var10.terrain != 24 &&
                25 != var10.terrain &&
                var10.terrain != 26) {
                this.b((byte) -73, param3, var8, var9);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("op.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, BattleCreature param2, byte param3) {
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          var5_int = 1;
          while (true) {
            if (var5_int > param1) {
              if (param3 != -44) {
                this.a(-49, -74, false);
              }
              stackIn_29_0 = param1;
              return stackIn_29_0;
            }
            var6 = param2.tileX;
            var7 = param2.tileY;
            if (param0 == 2) {
              var6 = var6 - var5_int;
            } else {
              if (4 == param0) {
                var6 = var6 + var5_int;
              } else {
                if (param0 != 1) {
                  if (3 == param0) {
                    var7 = var7 + var5_int;
                  }
                } else {
                  var7 = var7 - var5_int;
                }
              }
            }
            if (var6 >= 0 &&
              this.width > var6 &&
              var7 >= 0 &&
              this.height > var7) {
              if (this.tiles[var6][var7].terrain == 21) {
                stackIn_20_0 = var5_int;
                return stackIn_20_0;
              }
              if (!this.a(param2, var7, var6, (byte) 54)) {
                stackIn_24_0 = var5_int - 1;
                return stackIn_24_0;
              }
              var5_int++;
              continue;
            }
            break;
          }
          stackIn_17_0 = -1 + var5_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("op.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, aj[] param1, int param2, byte param3) {
        int discarded$0 = 0;
        int var5_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        BoardTile var8 = null;
        int var9 = 0;
        BattleCreature var10 = null;
        var9 = BachelorFridge.field_y;
        try {
          if (param3 != -36) {
            var10 = (BattleCreature) null;
            discarded$0 = this.a(-106, -64, (BattleCreature) null, (byte) 29);
          }
          for (var5_int = 0; var5_int < param0; var5_int++) {
            var6 = param1[var5_int].field_c;
            var7 = param1[var5_int].field_a;
            if (var6 >= 0 &&
              this.width > var6 &&
              0 <= var7 &&
              this.height > var7) {
              var8 = this.tiles[var6][var7];
              if (var8.terrain != 20 &&
                var8.terrain != 22 &&
                var8.terrain != 21 &&
                var8.terrain != 23 &&
                24 != var8.terrain &&
                25 != var8.terrain &&
                var8.terrain != 26) {
                this.b((byte) 111, param2, var6, var7);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("op.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(BattleCreature param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            param1 >= 0 &&
            this.width > param2 &&
            param1 < this.height) {
            if (!param0.a(this.tiles[param2][param1].terrain, false)) {
              return false;
            }
            if (param3 != 54) {
              this.field_l = true;
            }
            if (param2 == param0.tileX &&
              param0.tileY == param1) {
              return true;
            }
            if (this.tiles[param2][param1].occupant == null) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("op.UB(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final BattleUpdate a(CreatureOrder param0, byte param1) {
        RuntimeException var3 = null;
        CreatureEvent var4 = null;
        int var5 = 0;
        BattleCreature var6 = null;
        BattleCreature var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        CreatureEvent stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = param0.creature.a(29, this);
          var7 = var6;
          if (var7 == null) {
            stackIn_5_0 = null;
            return (BattleUpdate) (stackIn_5_0);
          }
          if (var7.isDown(125)) {
            stackIn_8_0 = null;
            return (BattleUpdate) (stackIn_8_0);
          }
          var4 = param0.createEvent(this, 3);
          var7.field_z = true;
          var5 = this.field_T.field_w[var6.ownerIndex];
          if (param1 != 91) {
            this.e(-72, 2, 10);
          }
          ((BattleUpdate) ((Object) var4)).apply(this, false);
          if (3 <= -var5 + this.field_T.field_w[var6.ownerIndex]) {
            this.field_T.field_a[var6.ownerIndex] = true;
          }
          this.field_U.a(var4, true);
          stackIn_14_0 = var4;
          return (BattleUpdate) ((Object) stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("op.CC(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(CreatureOrder[] param0, boolean param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        MoveDefinition var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1) {
            this.b(-125);
          }
          var3_int = 0;
          for (var4 = 0; var4 < param0.length; var4++) {
            if (null != param0[var4]) {
              var5 = WhirlpoolDigest.field_e[param0[var4].moveId];
              if (var5 instanceof SpecialMoveDefinition) {
                var3_int++;
              }
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("op.KB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void i(int param0) {
        int var3 = 0;
        int var2;
        IntrusiveDeque var4;
        int var9;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        CreatureRef var5;
        int var6;
        int var7;
        int var8;
        var9 = BachelorFridge.field_y;
        var2 = param0;
        for (var3 = 6; var3 >= 0; var3--) {
          var4 = this.field_t[var3];
          if (var4 != null) {
            stackIn_6_0 = ~var4.g(0);
            stackIn_6_1 = -1;
            if (stackIn_6_0 != stackIn_6_1) {
              var5 = (CreatureRef) (var4.b((byte) 90));
              var6 = this.field_A / 2 % var4.g(0);
              var7 = 0;
              var8 = 0;
              while (var7 < var4.g(0)) {
                if (var6 > var8) {
                  var5 = (CreatureRef) (var4.c(0));
                  var8++;
                  continue;
                }
                this.field_n[var2] = var5;
                var2++;
                var5 = (CreatureRef) (var4.c(0));
                if (var5 == null) {
                  var5 = (CreatureRef) (var4.b((byte) 90));
                }
                var7++;
              }
            }
          }
        }
    }

    final void a(int param0) {
        BoardTile dupTemp$1 = null;
        BoardTile dupTemp$2 = null;
        BoardTile dupTemp$0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = BachelorFridge.field_y;
        if (param0 != 23189) {
          this.field_P = (IntrusiveDeque) null;
        }
        for (var2 = 0; var2 < this.tiles.length; var2++) {
          for (var3 = 0; this.tiles[0].length > var3; var3++) {
            if (this.tiles[var2][var3].occupant != null) {
              this.tiles[var2][var3].occupant.a(this.tiles[var2][var3].field_m, (byte) -82, this.tiles[var2][var3].terrain);
            }
            if (this.tiles[var2][var3].a(false, this)) {
              dupTemp$1 = this.tiles[var2][var3];
              dupTemp$1.field_j = dupTemp$1.field_j - 1;
            }
            if (BuffVendorAnimation.field_w[this.tiles[var2][var3].terrain].field_b &&
              !this.tiles[var2][var3].field_m) {
              dupTemp$2 = this.tiles[var2][var3];
              dupTemp$2.field_j = dupTemp$2.field_j - 1;
            }
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.tiles.length; var2Lifetime1++) {
          var5 = 0;
          var3Lifetime1 = var5;
          while (var5 < this.tiles[0].length) {
            if (this.tiles[var2Lifetime1][var5].terrain == 35 ||
              this.tiles[var2Lifetime1][var5].terrain == 37 ||
              this.tiles[var2Lifetime1][var5].terrain == 33) {
              dupTemp$0 = this.tiles[var2Lifetime1][var5];
              dupTemp$0.field_j = dupTemp$0.field_j - 1;
            }
            var5++;
          }
        }
        if (this.field_l) {
          this.field_F = this.field_F + 1;
        }
        if (this.field_x) {
          this.field_K = this.field_K + 1;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        BattleCreature var9;
        int var10;
        int var11;
        int var12;
        int var13;
        EffectBatch var14;
        var13 = BachelorFridge.field_y;
        var14 = new EffectBatch();
        if (param2 != -1) {
          this.field_t = (IntrusiveDeque[]) null;
        }
        for (var7 = 0; this.playerCount > var7; var7++) {
          if (!this.rosters[var7].field_c) {
            for (var8 = 0; 7 > var8; var8++) {
              var9 = this.rosters[var7].field_b[var8];
              if (var9 != null &&
                !var9.isDown(101)) {
                if (var9.tileX > param4) {
                  stackIn_19_0 = var9.tileX - param4;
                } else {
                  stackIn_19_0 = param4 - var9.tileX;
                }
                var10 = stackIn_19_0;
                if (var9.tileY > param0) {
                  stackIn_22_0 = -param0 + var9.tileY;
                } else {
                  stackIn_22_0 = param0 - var9.tileY;
                }
                var11 = stackIn_22_0;
                stackIn_25_0 = (var11 < var10) ? var10 : var11;
                var12 = stackIn_25_0;
                if (param1 >= var12) {
                  var14.a(true, new lia(new CreatureRef(var9), param3, -1));
                }
              }
            }
          }
        }
        if (!var14.field_m.e(12917)) {
          var14.apply(this, false);
          this.field_U.a(var14, true);
        }
    }

    final boolean a(int param0, BattleCreature param1, int param2, BattleCreature param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~param2 > param4) {
            param2 = -param2;
            param0 = ov.b(param0, 60);
          }
          var6_int = this.a(param0, param2, param1, (byte) -44);
          param1.a(false, var6_int, param0);
          if (!param1.a(32, (byte) 103) &&
            this.tiles[param1.tileX][param1.tileY].terrain == 21) {
            this.field_T.field_l[param3.ownerIndex] = this.field_T.field_l[param3.ownerIndex] + 1;
          }
          return !(var6_int < param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("op.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void h(byte param0) {
        this.field_j = new CreatureOrder[this.playerCount][7];
        int var2 = -34 % ((-46 - param0) / 53);
    }

    private final String a(byte param0) {
        if (param0 > -46) {
          this.c((byte) 75);
        }
        return ArenaTheme.a((byte) 48, this.field_E, new String[]{"Pizza", "Dessert", "Curry"});
    }

    final void a(int param0, int param1, int param2, int[][] param3, int param4) {
        int var10 = 0;
        int var11 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var14 = BachelorFridge.field_y;
        try {
          var6_int = 17;
          var7 = 17;
          var8 = -1 + var6_int >> 1;
          var9 = -1 + var7 >> 1;
          for (var10 = 0; var6_int > var10; var10++) {
            for (var11 = 0; var7 > var11; var11++) {
              if (1 == param3[var10][var11]) {
                var12 = param2 + (var10 - var8);
                var13 = param1 - (-var11 + var9);
                if (var12 >= 0 &&
                  var12 < this.width &&
                  0 <= var13 &&
                  this.height > var13) {
                  this.d(-1, var13, var12);
                }
              }
            }
          }
          if (param0 != 878) {
            this.k((byte) -48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("op.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_A = param0;
        this.field_N = param2 ? true : false;
        if (param1 != -16292) {
          this.e(-69, 112, 35);
        }
    }

    private final void b(PacketBuffer param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = BachelorFridge.field_y;
        try {
          var4 = 71 / ((-28 - param1) / 35);
          this.field_n = new CreatureRef[this.playerCount * 7];
          var3_int = param0.readUnsignedByte(16711935);
          for (var5 = 0; var5 < var3_int; var5++) {
            this.field_n[var5] = qi.a(param0, (byte) 48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("op.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6_int;
        BattleCreature var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6_intLifetime1;
        var8 = BachelorFridge.field_y;
        var3 = -115 % ((43 - param0) / 32);
        var2 = 45853 * this.field_E + (3611 * this.field_o + 2585 * this.playerCount);
        var2 = var2 ^ 668347 * (this.field_A + 1 >> 1);
        if (this.field_o == 2) {
          for (var4 = 0; this.field_i.length > var4; var4++) {
            var5 = this.field_i[var4][0];
            var6_int = this.field_i[var4][1];
            var7 = this.field_i[var4][2];
            var2 = var2 ^ (317 * var4 + 33919) * (var6_int * var7 + var5 * var6_int);
          }
        }
        if (this.field_o == 3) {
          for (var4Lifetime1 = 0; this.playerCount > var4Lifetime1; var4Lifetime1++) {
            var2 = var2 ^ 5935 * var4Lifetime1 * this.field_C[var4Lifetime1];
            var5Lifetime1 = this.field_c[var4Lifetime1][0];
            var6_intLifetime1 = this.field_c[var4Lifetime1][1];
            var2 = var2 ^ (585 + var4Lifetime1) * 291 * (var5Lifetime1 * var6_intLifetime1 + var6_intLifetime1);
          }
        }
        if (this.field_M != -1) {
          var2 = var2 ^ 667 * (this.field_Q + 487 * this.field_M);
        }
        var2 = var2 ^ 87 * this.width + (this.field_D * 599 + this.height * 713);
        for (var4Lifetime2 = 0; this.width > var4Lifetime2; var4Lifetime2++) {
          for (var5Lifetime2 = 0; this.height > var5Lifetime2; var5Lifetime2++) {
            var2 = var2 ^ this.tiles[var4Lifetime2][var5Lifetime2].d(1446291025) * (var5Lifetime2 * (var4Lifetime2 + 13) + 37 + var4Lifetime2);
          }
        }
        for (var4Lifetime3 = 0; var4Lifetime3 < this.playerCount; var4Lifetime3++) {
          for (var5Lifetime3 = 0; var5Lifetime3 < 7; var5Lifetime3++) {
            var6 = this.rosters[var4Lifetime3].field_b[var5Lifetime3];
            if (var6 != null) {
              var2 = var2 ^ var6.g(94) * (31 + (var4Lifetime3 * 59 + 53 * var5Lifetime3));
            }
          }
        }
        return var2;
    }

    private final void f(int param0) {
        BattleUpdate discarded$0 = null;
        int var3 = BachelorFridge.field_y;
        this.h(param0 ^ -26126);
        if (param0 != 26125) {
          BattleCreature var4 = (BattleCreature) null;
          this.a(-25, (BattleCreature) null, 68);
        }
        CreatureOrder var5 = (CreatureOrder) (this.field_P.b((byte) 90));
        while (var5 != null) {
          discarded$0 = this.a(var5, (byte) 91);
          var5 = (CreatureOrder) (this.field_P.c(param0 - 26125));
        }
    }

    final boolean a(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 > -11) {
          this.field_H = (PlayerMatchStats[]) null;
        }
        stackIn_6_0 = (param1 >= 0) && ((this.field_h & 1 << param1) != 0);
        return stackIn_6_0;
    }

    final BattleCreature c(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        BattleCreature var6;
        int var7;
        int var4Lifetime1;
        var7 = BachelorFridge.field_y;
        for (var4 = 0; this.playerCount > var4; var4++) {
          for (var5 = 0; var5 < 7; var5++) {
            var6 = this.rosters[var4].field_b[var5];
            if (var6 != null &&
              param0 == var6.tileX &&
              param1 == var6.tileY) {
              return var6;
            }
          }
        }
        var4Lifetime1 = -89 / ((param2 - 69) / 33);
        return null;
    }

    final int g(byte param0) {
        int var4 = 0;
        PlayerRoster var5 = null;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        PlayerRoster[] var3 = this.rosters;
        if (param0 != 79) {
          this.field_r = false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 + var5.b((byte) 84);
        }
        return var2;
    }

    private final void d(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        CreatureRef[] var5_ref_nq__ = null;
        int var6 = 0;
        CreatureRef var7 = null;
        int var5 = 0;
        int var8 = BachelorFridge.field_y;
        try {
          this.j(-1);
          var3_int = param0.position;
          var4 = 0;
          if (param1 > -80) {
            this.field_y = (String[]) null;
          }
          param0.position = param0.position + 1;
          var5_ref_nq__ = this.field_n;
          for (var6 = 0; var5_ref_nq__.length > var6; var6++) {
            var7 = var5_ref_nq__[var6];
            if (var7 != null) {
              var4++;
              FlirtAnimation.a(var7, 110, param0);
            }
          }
          var5 = param0.position;
          param0.position = var3_int;
          param0.writeByte(var4, 0);
          param0.position = var5;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "op.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, BattleCreature param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = BachelorFridge.field_y;
        try {
          var6 = 5 / ((55 - param0) / 37);
          var5_int = param3.tileX;
          var7 = param3.tileY;
          if (param2 == 2) {
            var5_int = var5_int - param1;
          } else {
            if (param2 != 4) {
              if (param2 != 1) {
                if (param2 != 3) {
                  return this.a(param3, var7, var5_int, (byte) 54);
                }
                var7 = var7 + param1;
              } else {
                var7 = var7 - param1;
              }
            } else {
              var5_int = var5_int + param1;
            }
          }
          stackIn_11_0 = this.a(param3, var7, var5_int, (byte) 54);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("op.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final CreatureOrder b(int param0, int param1) {
        int var3 = -48 / ((param0 + 60) / 52);
        if (param1 < 0) {
          return null;
        }
        if (param1 > this.field_n.length) {
          return null;
        }
        if (null == this.field_n[param1]) {
          return null;
        }
        return this.field_j[this.field_n[param1].field_g][this.field_n[param1].field_f];
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5;
        var5 = -64 / ((0 - param0) / 39);
        if (20 != this.tiles[param2][param3].terrain &&
          this.tiles[param2][param3].terrain != 22 &&
          21 != this.tiles[param2][param3].terrain &&
          23 != this.tiles[param2][param3].terrain &&
          this.tiles[param2][param3].terrain != 24 &&
          this.tiles[param2][param3].terrain != 25 &&
          this.tiles[param2][param3].terrain != 26) {
          if (param1 == 1) {
            this.tiles[param2][param3].field_i = true;
            param1 = 0;
          }
          this.tiles[param2][param3].terrain = param1;
          this.tiles[param2][param3].field_a = -1;
          this.tiles[param2][param3].field_j = 0;
          if (!BuffVendorAnimation.field_w[param1].field_c) {
            this.tiles[param2][param3].field_m = false;
          } else {
            this.tiles[param2][param3].field_a = param1 - 6;
            this.tiles[param2][param3].field_m = true;
          }
          if (35 == param1) {
            this.tiles[param2][param3].field_j = (param2 * 11 + this.field_A * param3) % 3 + 3;
          }
          if (27 == param1) {
            this.tiles[param2][param3].field_j = 0;
          }
          if (37 == param1) {
            this.tiles[param2][param3].field_j = (this.field_A * param3 + 37 * param2) % 3 + 2;
          }
          if (33 == param1) {
            this.tiles[param2][param3].field_j = 4;
          }
          this.tiles[param2][param3].field_h = BuffVendorAnimation.field_w[param1].field_e;
        }
    }

    final boolean b(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 < 5) {
          this.playerCount = 78;
        }
        stackIn_6_0 = (param1 >= 0) && ((this.field_v & 1 << param1) != 0);
        return stackIn_6_0;
    }

    private final void h(int param0) {
        int var3;
        CreatureOrder var4;
        int var6;
        IntrusiveDeque var7;
        MoveDefinition var5;
        int var3Lifetime1;
        CreatureOrder var4Lifetime1;
        var6 = BachelorFridge.field_y;
        if (~(this.field_A & 1) == param0) {
          this.d((byte) -74);
        }
        this.field_P = new IntrusiveDeque();
        this.field_U = new IntrusiveDeque();
        var7 = new IntrusiveDeque();
        for (var3 = 0; this.field_n.length > var3; var3++) {
          var4 = this.b(param0 - 112, var3);
          if (var4 != null) {
            var7.a(var4, true);
          }
        }
        for (var3Lifetime1 = 3; var3Lifetime1 >= 1; var3Lifetime1--) {
          var4Lifetime1 = (CreatureOrder) (var7.b((byte) 90));
          while (var4Lifetime1 != null) {
            var5 = al.a(120, var4Lifetime1.moveId);
            if (2 == var5.kind &&
              hl.a((byte) 121, var5.field_j) &&
              var5.field_l == var3Lifetime1) {
              this.field_P.a(var4Lifetime1, true);
            }
            var4Lifetime1 = (CreatureOrder) (var7.c(~param0));
          }
        }
        var7.a(this.field_P, 12632256);
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        if (param0 != 1845) {
          this.c(80);
        }
        for (var4 = 0; this.playerCount > var4; var4++) {
          if (param2 == this.field_c[var4][0] &&
            param1 == this.field_c[var4][1]) {
            return var4;
          }
        }
        return -1;
    }

    final boolean e(int param0, int param1, int param2) {
        if (this.tiles[param0][param1].occupant != null) {
          return false;
        }
        if (20 != this.tiles[param0][param1].terrain &&
          this.tiles[param0][param1].terrain != 22 &&
          this.tiles[param0][param1].terrain != 21 &&
          this.tiles[param0][param1].terrain != 23 &&
          this.tiles[param0][param1].terrain != 24 &&
          this.tiles[param0][param1].terrain != 25 &&
          this.tiles[param0][param1].terrain != 26) {
          return true;
        }
        if (param2 == -11066) {
          return false;
        }
        this.field_f = -16;
        return false;
    }

    private final void c(PacketBuffer param0, byte param1) {
        int var5 = 0;
        PacketBuffer stackIn_10_0 = null;
        int stackIn_11_1 = 0;
        PacketBuffer stackIn_13_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        BoardTile var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime2Lifetime1;
        var8 = BachelorFridge.field_y;
        try {
          param0.writeByte(this.field_D, 0);
          param0.writeByte(this.field_o, 0);
          param0.writeByte(this.field_E, 0);
          param0.writeByte(this.width, 0);
          var3_int = -73 / ((param1 + 9) / 63);
          param0.writeByte(this.height, 0);
          for (var4 = 0; var4 < this.height; var4++) {
            for (var5 = 0; this.width > var5; var5++) {
              var6 = this.tiles[var5][var4];
              var7 = var6.terrain;
              if (var6.field_i) {
                var7 = var7 | 128;
              }
              param0.writeByte(var7, 0);
              param0.writeByte(var6.field_j, 0);
              param0.writeByte(var6.field_a, 0);
              stackIn_10_0 = (PacketBuffer) (param0);
              if (var6.field_m) {
                stackIn_11_1 = 1;
              } else {
                stackIn_11_1 = 0;
              }
              ((PacketBuffer) (Object) stackIn_10_0).writeByte(stackIn_11_1, 0);
              param0.writeByte(var6.field_h, 0);
              stackIn_13_0 = (PacketBuffer) (param0);
              if (var6.field_d) {
                stackIn_14_1 = 1;
              } else {
                stackIn_14_1 = 0;
              }
              ((PacketBuffer) (Object) stackIn_13_0).writeByte(stackIn_14_1, 0);
            }
          }
          if (2 == this.field_o) {
            for (var4Lifetime1 = 0; this.field_i.length > var4Lifetime1; var4Lifetime1++) {
              param0.writeByte(this.field_i[var4Lifetime1][0], 0);
              param0.writeByte(this.field_i[var4Lifetime1][1], 0);
              param0.writeByte(this.field_i[var4Lifetime1][2], 0);
            }
          }
          if (3 == this.field_o) {
            for (var4Lifetime2 = 0; this.playerCount > var4Lifetime2; var4Lifetime2++) {
              param0.writeByte(this.field_c[var4Lifetime2][0], 0);
              param0.writeByte(this.field_c[var4Lifetime2][1], 0);
            }
            for (var4Lifetime2Lifetime1 = 0; var4Lifetime2Lifetime1 < this.playerCount; var4Lifetime2Lifetime1++) {
              param0.writeByte(this.field_C[var4Lifetime2Lifetime1], 0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("op.N(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0, int param1, int param2) {
        if (~param2 > param0) {
          return;
        }
        if (param1 >= 0 &&
          this.width > param2 &&
          this.height > param1) {
          this.tiles[param2][param1].field_d = true;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4;
        var4 = -126 % ((3 - param2) / 37);
        if (param0 >= 0 &&
          param1 >= 0 &&
          param0 < this.width &&
          param1 < this.height) {
          return DiveBomberEvent.c(23745, this.tiles[param0][param1].terrain);
        }
        return false;
    }

    private final boolean b(byte param0) {
        int var3 = 0;
        int var2;
        BattleCreature var4;
        int var5;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 != 10) {
          this.playerCount = 84;
        }
        while (var2 < this.playerCount) {
          for (var3 = 0; var3 < 7; var3++) {
            var4 = this.rosters[var2].field_b[var3];
            if (var4 != null) {
              if (var4 == this.tiles[var4.tileX][var4.tileY].occupant &&
                var4.isDown(69)) {
                return false;
              }
              if (!var4.isDown(-115) &&
                this.tiles[var4.tileX][var4.tileY].occupant != var4) {
                return false;
              }
            }
          }
          var2++;
        }
        return true;
    }

    private final void a(BattleCreature param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (!param1) {
            return;
          }
          while (true) {
            if (this.field_n.length <= var3_int) {
              return;
            }
            if (this.field_n[var3_int] != null) {
              var3_int++;
              continue;
            }
            break;
          }
          this.field_n[var3_int] = new CreatureRef(param0);
          param0.field_v = var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("op.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0) {
        BoardChangeBatch discarded$0 = null;
        if (this.field_r) {
          throw new IllegalStateException();
        }
        if (this.field_A > 0) {
          this.field_N = !this.field_N ? true : false;
          this.field_A = this.field_A + 1;
          this.f((byte) 103);
          this.f(param0 + 26125);
        }
        if (param0 != 0) {
          return;
        }
        if (!this.field_N) {
          discarded$0 = this.e(0);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5;
        var5 = -8 / ((50 - param1) / 63);
        if (!this.a((byte) -113, param2, param0 + 1, param3) &&
          !this.a((byte) -115, param2, param0 - 1, param3)) {
          if (this.a((byte) -105, param2, param0, param3 + 1)) {
            return true;
          }
          if (!this.a((byte) -126, param2, param0, -1 + param3)) {
            return false;
          }
          return true;
        }
        return true;
    }

    final void a(CreatureOrder[] param0, int param1, byte param2) {
        int var4_int = 0;
        Object stackIn_27_0 = null;
        BattleCreature stackIn_27_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        BattleCreature[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        CreatureOrder var5_ref_sfa = null;
        BattleCreature var6 = null;
        AttackOrder var7 = null;
        MoveOrder var7_ref = null;
        int var9 = 0;
        BattleCreature var10 = null;
        BattleCreature[] var13 = null;
        BattleCreature var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        BattleCreature[] var4Lifetime1;
        BattleCreature var6Lifetime1;
        BattleCreature var6Lifetime2;
        BattleCreature var6Lifetime3;
        int var5Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          for (var4_int = 0; var4_int < 7; var4_int++) {
            var5_ref_sfa = param0[var4_int];
            if (var5_ref_sfa != null) {
              this.field_j[param1][var5_ref_sfa.creature.field_f] = var5_ref_sfa;
            }
          }
          if (this.field_N &&
            this.rosters[param1].a((byte) -52, 42)) {
            var13 = this.rosters[param1].field_b;
            var4 = var13;
            for (var5 = 0; var13.length > var5; var5++) {
              var14 = var13[var5];
              var6 = var14;
              var6Lifetime2 = var14;
              var6Lifetime3 = var14;
              if (null != var14 &&
                !var14.isDown(115) &&
                var14.statusId == 42) {
                var7 = new AttackOrder(24, var14);
                var17 = this.a(var14, 0);
                var7.field_k = var17[1];
                var7.field_j = var17[0];
                this.field_j[param1][var14.rosterSlot] = (CreatureOrder) ((Object) var7);
              }
            }
          }
          if (param2 != -31) {
            var10 = (BattleCreature) null;
            this.b((BattleCreature) null, (byte) -16);
          }
          if (!this.field_N &&
            this.rosters[param1].a((byte) -49, 40)) {
            var4Lifetime1 = this.rosters[param1].field_b;
            for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime1.length; var5Lifetime1++) {
              var6Lifetime1 = var4Lifetime1[var5Lifetime1];
              stackIn_27_0 = null;
              stackIn_27_1 = var6Lifetime1;
              if (stackIn_27_0 != stackIn_27_1 &&
                !var6Lifetime1.isDown(124) &&
                var6Lifetime1.statusId == 40) {
                var7_ref = new MoveOrder(0, var6Lifetime1);
                var18 = this.a(true, var6Lifetime1);
                var7_ref.field_i = var18[0];
                var7_ref.field_l = var18[1];
                this.field_j[param1][var6Lifetime1.rosterSlot] = (CreatureOrder) ((Object) var7_ref);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_39_0 = var4_ref;
          stackIn_39_1 = new StringBuilder().append("op.TA(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int[][] param4, int param5) {
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        BoardTile var15 = null;
        int var16 = 0;
        var16 = BachelorFridge.field_y;
        try {
          var7_int = 17;
          var8 = 17;
          var9 = var7_int - 1 >> 1;
          var10 = var8 - 1 >> 1;
          for (var11 = param0; var11 < var7_int; var11++) {
            for (var12 = 0; var8 > var12; var12++) {
              if (param4[var11][var12] == 1) {
                var13 = param1 - (-var11 + var9);
                var14 = -var10 + (var12 + param2);
                if (var13 >= 0 &&
                  var13 < this.width &&
                  var14 >= 0 &&
                  var14 < this.height) {
                  var15 = this.tiles[var13][var14];
                  if (DiveBomberEvent.c(23745, var15.terrain) &&
                    20 != var15.terrain &&
                    var15.terrain != 23 &&
                    var15.terrain != 24 &&
                    var15.terrain != 25 &&
                    var15.terrain != 26 && (param3 ||
                    var15.occupant == null)) {
                    this.b((byte) -66, param5, var13, var14);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("op.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        BattleCreature var5;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 != -74) {
          var5 = (BattleCreature) null;
          this.a((BattleCreature) null, -119, 102, (byte) 43);
        }
        while (this.playerCount > var2) {
          for (var3 = 0; 7 > var3; var3++) {
            if (this.rosters[var2].field_b[var3] != null) {
              this.rosters[var2].field_b[var3].field_z = false;
            }
          }
          var2++;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 != 26) {
          return true;
        }
        int var4 = this.field_L.field_o[param2][param0].terrain + 19;
        if (23 == var4) {
          return true;
        }
        if (var4 != 24) {
          if (25 == var4) {
            return true;
          }
          if (26 != var4) {
            return false;
          }
        }
        return true;
    }

    private final int[] a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        for (var3 = param0; var3 < this.width; var3++) {
          for (var4 = 0; var4 < this.height; var4++) {
            if (param1 == 0 &&
              23 == this.tiles[var3][var4].terrain) {
              return new int[]{var3, var4};
            }
            if (param1 == 1 &&
              24 == this.tiles[var3][var4].terrain) {
              return new int[]{var3, var4};
            }
            if (param1 == 2 &&
              this.tiles[var3][var4].terrain == 25) {
              return new int[]{var3, var4};
            }
            if (param1 == 3 &&
              26 == this.tiles[var3][var4].terrain) {
              return new int[]{var3, var4};
            }
          }
        }
        return new int[]{-1, -1};
    }

    final void a(boolean param0, int param1) {
        boolean stackIn_3_1 = false;
        int var3;
        int var4;
        int var6;
        int var7;
        BattleCreature var8;
        BattleCreature var9;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        var6 = BachelorFridge.field_y;
        stackIn_3_1 = (param0);
        this.field_r = stackIn_3_1;
        this.field_b = param1;
        if (-1 != this.field_b) {
          this.field_g[this.field_b] = this.field_g[this.field_b] + 300;
        }
        for (var3 = 0; this.playerCount > var3; var3++) {
          for (var4 = 0; var4 < 7; var4++) {
            var8 = this.rosters[var3].field_b[var4];
            if (var8 != null) {
              if (var3 != this.field_b) {
                this.field_p.a((byte) -28, new dla(new CreatureRef(var8.ownerIndex, var8.rosterSlot)));
              } else {
                this.field_p.a((byte) -28, new qja(new CreatureRef(var8.ownerIndex, var8.rosterSlot)));
              }
            }
          }
        }
        for (var3Lifetime1 = 0; this.playerCount > var3Lifetime1; var3Lifetime1++) {
          var7 = 0;
          var4Lifetime1 = var7;
          while (var7 < 7) {
            var9 = this.rosters[var3Lifetime1].field_b[var7];
            if (var9 != null) {
              this.field_T.field_C[var3Lifetime1] = sr.a(this.field_T.field_C[var3Lifetime1], 1L << var9.field_o.field_b);
            }
            var7++;
          }
        }
        this.field_H = new PlayerMatchStats[this.playerCount];
        for (var3Lifetime2 = 0; var3Lifetime2 < this.playerCount; var3Lifetime2++) {
          this.field_H[var3Lifetime2] = this.field_T.a((byte) 9, var3Lifetime2);
        }
    }

    final void a(BattleCreature param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          return;
        }
        try {
          this.rosters[param2].field_b[param3] = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "op.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final BattleCreature a(byte param0, BattleCreature param1) {
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        BattleCreature var5 = null;
        BattleCreature var6 = null;
        BattleCreature var7 = null;
        BattleCreature var8 = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (this.rosters[param1.ownerIndex].field_a == 7) {
            return null;
          }
          var3_int = -21 / ((16 - param0) / 55);
          var4 = null;
          if (param1.tileX > 0 &&
            null == this.tiles[-1 + param1.tileX][param1.tileY].occupant &&
            this.tiles[param1.tileX - 1][param1.tileY].e(-35)) {
            var5 = param1.b(true);
            var4 = var5;
            var5.field_s = 2;
            var5.tileX = var5.tileX - 1;
          } else if (-1 + this.width > param1.tileX &&
            this.tiles[param1.tileX + 1][param1.tileY].occupant == null &&
            this.tiles[param1.tileX + 1][param1.tileY].e(-126)) {
            var8 = param1.b(true);
            var4 = var8;
            var8.tileX = var8.tileX + 1;
            var8.field_s = 4;
          } else if (param1.tileY > 0 &&
            null == this.tiles[param1.tileX][-1 + param1.tileY].occupant &&
            this.tiles[param1.tileX][-1 + param1.tileY].e(-120)) {
            var7 = param1.b(true);
            var4 = var7;
            var7.field_s = 1;
            var7.tileY = var7.tileY - 1;
          } else {
            if (param1.tileY < -1 + this.height &&
              null == this.tiles[param1.tileX][1 + param1.tileY].occupant &&
              this.tiles[param1.tileX][1 + param1.tileY].e(-36)) {
              var6 = param1.b(true);
              var4 = var6;
              var6.tileY = var6.tileY + 1;
              var6.field_s = 3;
            }
          }
          if (var4 == null) {
            stackIn_26_0 = null;
            return (BattleCreature) (stackIn_26_0);
          }
          this.rosters[param1.ownerIndex].a(-20836, (BattleCreature) (var4));
          this.tiles[((BattleCreature) (var4)).tileX][((BattleCreature) (var4)).tileY].occupant = (BattleCreature) (var4);
          param1.d(-107);
          ((BattleCreature) (var4)).d(3);
          stackIn_28_0 = var4;
          return (BattleCreature) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("op.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void j(int param0) {
        int var2 = 0;
        CreatureRef var3;
        int var4;
        var4 = BachelorFridge.field_y;
        for (var2 = 0; this.field_n.length > var2; var2++) {
          var3 = this.field_n[var2];
          if (var3 != null) {
            this.rosters[var3.field_g].field_b[var3.field_f].field_v = var2 + 1;
          }
        }
        if (param0 != -1) {
          this.a((int[][]) null, (byte) -21, -84, -59, 6, 41);
        }
    }

    final boolean a(BattleCreature param0, BattleCreature param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          if (!param1.a(this.tiles[param0.tileX][param0.tileY].terrain, false)) {
            return false;
          }
          if (!param0.a(this.tiles[param1.tileX][param1.tileY].terrain, false)) {
            return false;
          }
          if (param2 != 4) {
            return true;
          }
          var4_int = param1.tileX;
          var5 = param1.tileY;
          param1.a(param0.tileY, param0.tileX, true);
          param0.a(var5, var4_int, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("op.GB(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, PacketBuffer param1, int param2) {
        int discarded$1 = 0;
        int var4_int = 0;
        BattleCreature var5 = null;
        int var6 = 0;
        BattleCreature var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param2 >= -111) {
            var7 = (BattleCreature) null;
            discarded$1 = this.a(-84, 118, (BattleCreature) null, (byte) 51);
          }
          for (var4_int = 0; var4_int < 7; var4_int++) {
            var5 = this.rosters[param0].field_b[var4_int];
            rha.a(var5, param1, (byte) -118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("op.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        if (this.field_o != 3) {
          return false;
        }
        if (param1 <= 114) {
          this.field_K = -110;
        }
        for (var4 = 0; var4 < this.playerCount; var4++) {
          if (param2 == this.field_c[var4][0] &&
            param0 == this.field_c[var4][1]) {
            return true;
          }
        }
        return false;
    }

    private final int[] a(BattleCreature param0, int param1) {
        int[] stackIn_3_0 = null;
        int[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          if (param1 != 0) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var3_int = param0.tileX;
          var4 = param0.tileY;
          var5 = ((BasicMoveDefinition) (al.a(-97, 24))).field_t;
          var6 = 1 + DiveBomberAnimation.a(4, this.field_w, -2147483648);
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = var5;
          while (4 > var8) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted9 = true;
            boolean decompiledFrameCompleted8 = true;
            boolean decompiledFrameCompleted7 = true;
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var7 == 2) {
              for (var11 = 1; var11 < var5; var11++) {
                if (-var11 + var3_int < 0) {
                  decompiledFrameCompleted9 = false;
                  break;
                }
                if (!this.tiles[-var11 + var3_int][var4].e(-84)) {
                  decompiledFrameCompleted8 = false;
                  break;
                }
                if (-var11 + var3_int >= 0 &&
                  this.tiles[-var11 + var3_int][var4].occupant != null &&
                  var10 > var11) {
                  var10 = var11;
                  var9 = 2;
                  decompiledFrameCompleted7 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted9) &&
                (decompiledFrameCompleted8)) {
                decompiledFrameRemainder0 = !(decompiledFrameCompleted7);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted9) &&
              (decompiledFrameCompleted8) &&
              (decompiledFrameCompleted7)) {
              if (var7 == 4) {
                for (var11Lifetime1 = 1; var5 > var11Lifetime1; var11Lifetime1++) {
                  if ((-1 + this.width) < (var3_int + var11Lifetime1)) {
                    decompiledFrameCompleted6 = false;
                    break;
                  }
                  if (!this.tiles[var11Lifetime1 + var3_int][var4].e(-121)) {
                    var7++;
                    if (var7 == 5) {
                      decompiledFrameCompleted5 = false;
                      break;
                    }
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (this.width > var11Lifetime1 + var3_int &&
                    null != this.tiles[var3_int + var11Lifetime1][var4].occupant &&
                    var11Lifetime1 < var10) {
                    var9 = 4;
                    var10 = var11Lifetime1;
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted6) &&
                  (decompiledFrameCompleted5) &&
                  (decompiledFrameCompleted4)) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted3);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted6) &&
                (decompiledFrameCompleted5) &&
                (decompiledFrameCompleted4) &&
                (decompiledFrameCompleted3)) {
                if (var7 == 1) {
                  for (var11Lifetime1Lifetime1 = 1; var11Lifetime1Lifetime1 < var5; var11Lifetime1Lifetime1++) {
                    if (0 > var4 - var11Lifetime1Lifetime1) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    if (!this.tiles[var3_int][var4 - var11Lifetime1Lifetime1].e(-106)) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (-var11Lifetime1Lifetime1 + var4 >= 0 &&
                      this.tiles[var3_int][-var11Lifetime1Lifetime1 + var4].occupant != null &&
                      var11Lifetime1Lifetime1 < var10) {
                      var10 = var11Lifetime1Lifetime1;
                      var9 = 1;
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted2) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0) &&
                  (var7 == 3)) {
                  for (var11Lifetime1Lifetime1 = 1; var5 > var11Lifetime1Lifetime1; var11Lifetime1Lifetime1++) {
                    if ((-1 + this.height) < (var11Lifetime1Lifetime1 + var4)) {
                      break;
                    }
                    if (!this.tiles[var3_int][var4 + var11Lifetime1Lifetime1].e(-31)) {
                      break;
                    }
                    if (this.height > var4 + var11Lifetime1Lifetime1 &&
                      null != this.tiles[var3_int][var11Lifetime1Lifetime1 + var4].occupant &&
                      var11Lifetime1Lifetime1 < var10) {
                      var9 = 3;
                      var10 = var11Lifetime1Lifetime1;
                      break;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted5) &&
              (decompiledFrameCompleted4)) {
              var7++;
              decompiledFrameRemainder1 = (var7 == 5);
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted4)) {
              var7 = 1;
            }
            var8++;
          }
          if (0 == var9) {
            var9 = 1 + DiveBomberAnimation.a(4, this.field_w, -2147483648);
          }
          if (var10 == 0) {
            var10 = DiveBomberAnimation.a(var5, this.field_w, param1 ^ -2147483648);
          }
          stackIn_70_0 = new int[]{var9, -1 + var10};
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("op.P(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        int var7 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        BattleCreature var6_ref_aga;
        BattleCreature var8;
        int var9;
        EffectBatch var10;
        int var11;
        int var5Lifetime1;
        BattleCreature var8Lifetime1;
        BattleCreature var8Lifetime2;
        var11 = BachelorFridge.field_y;
        if (param0 <= 97) {
          this.field_G = -71;
        }
        var2 = 50 + 25 * (this.field_A - this.field_J >> 1);
        for (var3 = 0; var3 < this.playerCount; var3++) {
          var4 = 0;
          for (var5 = 0; var5 < 7; var5++) {
            var6_ref_aga = this.rosters[var3].field_b[var5];
            var8 = var6_ref_aga;
            var8Lifetime2 = var6_ref_aga;
            if (var6_ref_aga != null &&
              !var6_ref_aga.isDown(68)) {
              var4++;
            }
          }
          if (var4 != 0) {
            var5Lifetime1 = var2 / var4;
            var6 = var2 % var4;
            for (var7 = 0; var7 < 7; var7++) {
              var8Lifetime1 = this.rosters[var3].field_b[var7];
              if (var8Lifetime1 != null &&
                !var8Lifetime1.isDown(-120)) {
                var9 = var5Lifetime1;
                var6--;
                if (var6 >= 0) {
                  var9++;
                }
                var10 = new EffectBatch();
                var10.a(true, new qq(new CreatureRef(var8Lifetime1), -1, var9));
                var10.apply(this, false);
                this.field_U.a(var10, true);
              }
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        BoardTile var3;
        BattleCreature var4;
        this.field_c[param0] = this.a(0, param0);
        var3 = this.tiles[this.field_c[param0][0]][this.field_c[param0][1]];
        var3.field_m = true;
        if (param1 <= 43) {
          this.a(38, -108, -127, (int[][]) null, 91);
        }
        var4 = var3.occupant;
        if (var4 != null &&
          param0 != var4.ownerIndex &&
          !var4.g((byte) 85)) {
          var4.b((byte) 124, 24 + param0);
        }
    }

    final void a(int param0, BattleCreature param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param4 > -70) {
            this.field_w = (Random) null;
          }
          if (param3 == 2) {
            this.b((byte) -65, param2, -param0 + param1.tileX, param1.tileY);
          } else {
            if (param3 != 4) {
              if (param3 != 1) {
                if (param3 == 3) {
                  this.b((byte) -45, param2, param1.tileX, param0 + param1.tileY);
                }
              } else {
                this.b((byte) 62, param2, param1.tileX, param1.tileY - param0);
              }
            } else {
              this.b((byte) 50, param2, param1.tileX + param0, param1.tileY);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("op.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        int[] var5;
        BattleCreature var6;
        int[] var7;
        boolean stackIn_6_0 = false;
        var7 = this.a(0, param1);
        var5 = var7;
        if (param0 >= -95) {
          var6 = (BattleCreature) null;
          discarded$1 = this.a(-117, 19, (BattleCreature) null, (byte) -1);
        }
        stackIn_6_0 = (var7[0] == param2) && (var7[1] == param3);
        return stackIn_6_0;
    }

    private final void f(byte param0) {
        if (param0 != 103) {
          this.field_t = (IntrusiveDeque[]) null;
        }
    }

    private final void b(int param0, PacketBuffer param1) {
        int var6 = 0;
        BoardTile stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        BoardTile stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        BoardTile stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime2Lifetime1;
        var8 = BachelorFridge.field_y;
        try {
          this.field_D = param1.readUnsignedByte(16711935);
          this.field_L = StatusEffectInfo.field_g[this.field_D];
          this.field_o = param1.readUnsignedByte(16711935);
          this.field_E = param1.readUnsignedByte(param0 + 16711936);
          this.width = param1.readUnsignedByte(16711935);
          this.height = param1.readUnsignedByte(16711935);
          this.tiles = new BoardTile[this.width][this.height];
          this.field_i = new int[this.field_L.field_m][3];
          if (param0 != -1) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_i.length; var3_int++) {
            this.field_i[var3_int] = new int[]{-1, -1, -1};
          }
          var3_intLifetime1 = 3 + this.playerCount;
          if (var3_intLifetime1 > 9) {
            var3_intLifetime1 = 9;
          }
          var4 = 0;
          for (var5 = 0; this.height > var5; var5++) {
            for (var6 = 0; this.width > var6; var6++) {
              var7 = param1.readUnsignedByte(16711935);
              this.tiles[var6][var5] = new BoardTile(dda.a(var7, 127));
              stackIn_15_0 = this.tiles[var6][var5];
              stackIn_16_1 = ((var7 & 128) != 0);
              stackIn_15_0.field_i = stackIn_16_1;
              this.tiles[var6][var5].field_j = param1.readUnsignedByte(16711935);
              if (this.tiles[var6][var5].field_j == 255) {
                this.tiles[var6][var5].field_j = -1;
              }
              this.tiles[var6][var5].field_a = param1.b(true);
              stackIn_20_0 = this.tiles[var6][var5];
              stackIn_21_1 = (1 == param1.readUnsignedByte(16711935));
              stackIn_20_0.field_m = stackIn_21_1;
              if (this.tiles[var6][var5].terrain == 20) {
                this.field_i[var4][0] = var6;
                this.field_i[var4][1] = var5;
                this.field_i[var4][2] = -1;
                var4++;
              }
              this.tiles[var6][var5].field_h = param1.readUnsignedByte(param0 + 16711936);
              stackIn_26_0 = this.tiles[var6][var5];
              stackIn_27_1 = (1 == param1.readUnsignedByte(16711935));
              stackIn_26_0.field_d = stackIn_27_1;
            }
          }
          if (this.field_o == 2) {
            this.field_i = new int[this.field_L.field_m][3];
            for (var5Lifetime1 = 0; this.field_i.length > var5Lifetime1; var5Lifetime1++) {
              this.field_i[var5Lifetime1] = new int[]{param1.b(true), param1.b(true), param1.b(true)};
            }
          }
          if (this.field_o == 3) {
            this.field_c = new int[this.playerCount][0];
            for (var5Lifetime2 = 0; this.playerCount > var5Lifetime2; var5Lifetime2++) {
              this.field_c[var5Lifetime2] = new int[]{param1.readUnsignedByte(16711935), param1.readUnsignedByte(param0 + 16711936)};
            }
            this.field_C = new int[this.playerCount];
            for (var5Lifetime2Lifetime1 = 0; this.playerCount > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              this.field_C[var5Lifetime2Lifetime1] = param1.readUnsignedByte(16711935);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("op.IB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final boolean b(BattleCreature param0, byte param1) {
        RuntimeException var3 = null;
        aj[] var4 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 113) {
            var4 = (aj[]) null;
            this.a(2, (aj[]) null, 108, (byte) -104);
          }
          if (param0.ownerIndex == 0) {
            stackIn_14_0 = param0.i(23, 116);
            return stackIn_14_0;
          }
          if (1 == param0.ownerIndex) {
            stackIn_12_0 = param0.i(24, 126);
            return stackIn_12_0;
          }
          if (param0.ownerIndex == 2) {
            stackIn_6_0 = param0.i(25, 124);
            return stackIn_6_0;
          }
          if (3 != param0.ownerIndex) {
            return false;
          }
          stackIn_10_0 = param0.i(26, 122);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("op.SB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, PacketBuffer param2) {
        int var4_int = 0;
        BattleUpdate var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          var4_int = param2.position + param0;
          this.b(param2, -69);
          this.field_O = param2.readUnsignedByte(16711935);
          this.field_U = new IntrusiveDeque();
          while (var4_int > param2.position) {
            var5 = SplitAnimation.a(param2, (byte) -50);
            var5.field_j = param2.readInt(-98);
            this.field_U.a(var5, true);
          }
          if (!param1) {
            this.field_m = -104;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("op.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        if (23 == param1) {
          return 0;
        }
        if (param1 == 24) {
          return 1;
        }
        if (25 == param1) {
          return 2;
        }
        if (param1 == 26) {
          return 3;
        }
        if (param0) {
          this.rosters = (PlayerRoster[]) null;
        }
        return -1;
    }

    private final int[] a(boolean param0, BattleCreature param1) {
        int[] stackIn_3_0 = null;
        int[] stackIn_84_0 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          var3_int = param1.tileX;
          var4 = param1.tileY;
          var5 = param1.f((byte) 123);
          var6 = DiveBomberAnimation.a(4, this.field_w, -2147483648) + 1;
          if (!param0) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          while (var8 < 4) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var7 == 2) {
              for (var11 = 1; var11 < var5; var11++) {
                if (var3_int - var11 < 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
                if (!this.tiles[-var11 + var3_int][var4].e(-110)) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
                if (-var11 + var3_int >= 0 &&
                  this.tiles[-var11 + var3_int][var4].occupant == null &&
                  var11 > var10) {
                  var10 = var11;
                  var9 = 2;
                }
              }
              if (decompiledFrameCompleted5) {
                decompiledFrameRemainder0 = !(decompiledFrameCompleted4);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted5) &&
              (decompiledFrameCompleted4)) {
              if (var7 == 4) {
                for (var11Lifetime1 = 1; var11Lifetime1 < var5; var11Lifetime1++) {
                  if (var3_int + var11Lifetime1 > this.width - 1) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (!this.tiles[var11Lifetime1 + var3_int][var4].e(-80)) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  if (var3_int + var11Lifetime1 < this.width &&
                    null == this.tiles[var11Lifetime1 + var3_int][var4].occupant &&
                    var10 < var11Lifetime1) {
                    var10 = var11Lifetime1;
                    var9 = 4;
                  }
                }
                if (decompiledFrameCompleted3) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                if (1 == var7) {
                  for (var11Lifetime1Lifetime1 = 1; var11Lifetime1Lifetime1 < var5; var11Lifetime1Lifetime1++) {
                    if (0 > var4 - var11Lifetime1Lifetime1) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (!this.tiles[var3_int][var4 - var11Lifetime1Lifetime1].e(-88)) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (var4 - var11Lifetime1Lifetime1 >= 0 &&
                      this.tiles[var3_int][var4 - var11Lifetime1Lifetime1].occupant == null &&
                      var10 < var11Lifetime1Lifetime1) {
                      var9 = 1;
                      var10 = var11Lifetime1Lifetime1;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0) &&
                  (var7 == 3)) {
                  for (var11Lifetime1Lifetime1 = 1; var5 > var11Lifetime1Lifetime1; var11Lifetime1Lifetime1++) {
                    if ((this.height - 1) < (var11Lifetime1Lifetime1 + var4)) {
                      break;
                    }
                    if (!this.tiles[var3_int][var11Lifetime1Lifetime1 + var4].e(-35)) {
                      break;
                    }
                    if (this.height > var11Lifetime1Lifetime1 + var4 &&
                      null == this.tiles[var3_int][var11Lifetime1Lifetime1 + var4].occupant &&
                      var10 < var11Lifetime1Lifetime1) {
                      var9 = 3;
                      var10 = var11Lifetime1Lifetime1;
                    }
                  }
                }
              }
            }
            var7++;
            if (var7 == 5) {
              var7 = 1;
            }
            var8++;
          }
          if (var9 == 0) {
            var9 = 1 + DiveBomberAnimation.a(4, this.field_w, -2147483648);
          }
          if (var10 == 0) {
            var10 = DiveBomberAnimation.a(var5, this.field_w, -2147483648);
          }
          stackIn_84_0 = new int[]{var9, var10};
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_87_0 = var3;
          stackIn_87_1 = new StringBuilder().append("op.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    final void a(PacketBuffer param0, int param1) {
        BattleUpdate var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param1 != -1) {
            this.d(52, -96, -42);
          }
          this.d(param0, (byte) -116);
          param0.writeByte(this.field_O, 0);
          var3 = (BattleUpdate) (this.field_U.b((byte) 90));
          while (var3 != null) {
            nca.a(101, param0, var3);
            param0.writeInt(var3.field_j, -1615464796);
            var3 = (BattleUpdate) (this.field_U.c(~param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("op.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(byte param0, BattleCreature param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            this.field_n = (CreatureRef[]) null;
          }
          if (param1.g((byte) 85)) {
            if (param1.statusId == 24) {
              stackIn_15_0 = 0;
              return stackIn_15_0;
            }
            if (param1.statusId == 25) {
              stackIn_6_0 = 1;
              return stackIn_6_0;
            }
            if (26 == param1.statusId) {
              stackIn_13_0 = 2;
              return stackIn_13_0;
            }
            if (param1.statusId == 27) {
              stackIn_11_0 = 3;
              return stackIn_11_0;
            }
          }
          stackIn_17_0 = -1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("op.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final BoardChangeBatch e(int param0) {
        int var5 = 0;
        int incrementValue$1 = 0;
        int stackIn_38_0 = 0;
        int var3;
        int var4;
        ej var4_ref_ej;
        BoardTile var5_ref_wia;
        int var6;
        int var7;
        BoardChangeBatch var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var7 = BachelorFridge.field_y;
        boolean discarded$0 = this.b((byte) 10);
        this.i((byte) 56);
        this.i(0);
        this.j(-1);
        var8 = new BoardChangeBatch();
        this.a(23189);
        for (var3 = param0; var3 < this.width; var3++) {
          for (var4 = 0; this.height > var4; var4++) {
            if (null != this.tiles[var3][var4].occupant) {
              this.tiles[var3][var4].occupant.a(this.tiles[var3][var4], var8, this.field_U, (byte) 121);
            }
            if (this.tiles[var3][var4].terrain == 27 &&
              this.tiles[var3][var4].field_j <= 3) {
              var8.a(new fi(var3, var4), (byte) 113);
            }
            if (BuffVendorAnimation.field_w[this.tiles[var3][var4].terrain].field_b &&
              !this.tiles[var3][var4].field_m &&
              this.tiles[var3][var4].field_j == 0) {
              var8.a(new oca(var3, var4), (byte) 60);
            }
          }
        }
        for (var3Lifetime1 = 0; this.width > var3Lifetime1; var3Lifetime1++) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.height; var4Lifetime1++) {
            var5_ref_wia = this.tiles[var3Lifetime1][var4Lifetime1];
            if (var5_ref_wia.terrain == 33) {
              if (var5_ref_wia.field_j != 3) {
                if (var5_ref_wia.field_j == 2) {
                  stackIn_38_0 = 60;
                } else {
                  if (1 != var5_ref_wia.field_j) {
                    stackIn_38_0 = (var5_ref_wia.field_j != 0) ? 15 : 30;
                  } else {
                    stackIn_38_0 = 45;
                  }
                }
              } else {
                stackIn_38_0 = 75;
              }
              var6 = stackIn_38_0;
              this.a(var4Lifetime1, 3 - var5_ref_wia.field_j, -1, var6, var3Lifetime1);
            }
          }
        }
        for (var3Lifetime2 = 0; this.width > var3Lifetime2; var3Lifetime2++) {
          for (var4Lifetime2 = 0; var4Lifetime2 < this.height; var4Lifetime2++) {
            if (this.tiles[var3Lifetime2][var4Lifetime2].field_j == 0 && (this.tiles[var3Lifetime2][var4Lifetime2].terrain == 37 ||
              35 == this.tiles[var3Lifetime2][var4Lifetime2].terrain)) {
              var8.a(new wp(var3Lifetime2, var4Lifetime2), (byte) 93);
            }
            if (this.tiles[var3Lifetime2][var4Lifetime2].field_j == -1 &&
              this.tiles[var3Lifetime2][var4Lifetime2].terrain == 33) {
              var8.a(new tga(var3Lifetime2, var4Lifetime2), (byte) 51);
            }
          }
        }
        if (this.field_E == 2) {
          if (sh.field_C == null ||
            !(this.width * this.height <= sh.field_C.length)) {
            sh.field_C = new aj[this.width * this.height];
          }
          var3Lifetime3 = 0;
          for (var4Lifetime3 = 0; var4Lifetime3 < this.width; var4Lifetime3++) {
            for (var5 = 0; this.height > var5; var5++) {
              if (this.tiles[var4Lifetime3][var5].a((byte) -63) &&
                this.tiles[var4Lifetime3][var5].field_j == -1) {
                incrementValue$1 = var3Lifetime3;
                var3Lifetime3++;
                sh.field_C[incrementValue$1] = new aj(var4Lifetime3, var5);
              }
            }
          }
          if (var3Lifetime3 != 0) {
            var8.a(new ow(sh.field_C, var3Lifetime3), (byte) 93);
          }
        }
        if (this.field_x &&
          this.field_K >= 4) {
          for (var3Lifetime4 = 0; var3Lifetime4 < this.width; var3Lifetime4++) {
            for (var4Lifetime4 = 0; this.height > var4Lifetime4; var4Lifetime4++) {
              if (27 == this.tiles[var3Lifetime4][var4Lifetime4].terrain) {
                var8.a(new tga(var3Lifetime4, var4Lifetime4), (byte) 117);
              }
            }
          }
          var8.a(new bg(), (byte) 39);
        }
        if (this.field_l &&
          this.field_F >= 3) {
          var8.a(new bja(), (byte) 114);
        }
        var8.apply(this, false);
        this.field_U.a(var8, true);
        this.a(var8, (byte) 73);
        for (var3Lifetime5 = 0; var3Lifetime5 < this.playerCount; var3Lifetime5++) {
          if (!this.rosters[var3Lifetime5].field_c &&
            this.b((byte) 53, var3Lifetime5)) {
            var4_ref_ej = new ej(var3Lifetime5);
            var8.a(var4_ref_ej, (byte) 112);
            var4_ref_ej.a(false, this);
          }
        }
        if (this.field_A > this.field_J) {
          var3Lifetime6 = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < this.playerCount; var4Lifetime5++) {
            if (!this.rosters[var4Lifetime5].field_c) {
              var3Lifetime6++;
            }
          }
          if (var3Lifetime6 >= 2 ||
            1 == this.playerCount) {
            this.c(param0 ^ 101);
            this.a(var8, (byte) 73);
          }
        }
        for (var3Lifetime7 = 0; this.playerCount > var3Lifetime7; var3Lifetime7++) {
          if (this.field_T.field_n[var3Lifetime7] > this.field_T.field_o[var3Lifetime7]) {
            this.field_T.field_o[var3Lifetime7] = this.field_T.field_n[var3Lifetime7];
          }
          this.field_T.field_n[var3Lifetime7] = 0;
          if (this.field_T.field_q[var3Lifetime7] < this.field_T.field_y[var3Lifetime7]) {
            this.field_T.field_q[var3Lifetime7] = this.field_T.field_y[var3Lifetime7];
          }
          this.field_T.field_y[var3Lifetime7] = 0;
        }
        this.d(98);
        return var8;
    }

    private final void a(BoardChangeBatch param0, byte param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        BattleCreature var6 = null;
        int var7 = 0;
        PlayerRoster stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (param1 != 73) {
            this.field_Q = 29;
          }
          while (this.playerCount > var3_int) {
            var4 = 1;
            for (var5 = 0; var5 < 7; var5++) {
              var6 = this.rosters[var3_int].field_b[var5];
              if (var6 != null &&
                !var6.isDown(75)) {
                var4 = 0;
              }
            }
            stackIn_14_0 = this.rosters[var3_int];
            stackIn_15_1 = (var4 != 0);
            stackIn_14_0.field_c = stackIn_15_1;
            if (var4 != 0) {
              param0.a(new iia(var3_int), (byte) 116);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("op.VA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String j(byte param0) {
        if (param0 != 42) {
          return (String) null;
        }
        return ArenaTheme.a((byte) -122, this.field_o, new String[]{null, "Annihilation", "Take & Hold", "CTF"});
    }

    final void a(int param0, CreatureProfile[] param1, int param2) {
        int var5 = 0;
        int var7 = 0;
        PlayerRoster dupTemp$0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        BattleCreature[] var6 = null;
        CreatureProfile var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var14 = null;
        int[][] var17 = null;
        var11 = BachelorFridge.field_y;
        try {
          this.rosters[param2] = new PlayerRoster(param2);
          var14 = new int[7];
          var12 = var14;
          var4 = var12;
          for (var5 = 0; 7 > var5; var5++) {
            if (param1[var5] != null) {
              var4[var5] = -param1[var5].field_k[1];
            } else {
              var4[var5] = 2147483646;
            }
          }
          IncomingSpecial.$cfr$intArgs$a$e46325ef0b7e(param1, 96, var14);
          var17 = this.field_L.b(param2, -36);
          var6 = this.rosters[param2].field_b;
          for (var7 = 0; var17.length > var7; var7++) {
            if (var7 < param1.length) {
              var8 = param1[var7];
              if (var8 != null) {
                var9 = var17[var7][0];
                var10 = var17[var7][1];
                var6[var7] = new BattleCreature(var8, this, param2, var7);
                var6[var7].tileX = var9;
                var6[var7].tileY = var10;
                this.tiles[var9][var10].occupant = var6[var7];
                dupTemp$0 = this.rosters[param2];
                dupTemp$0.field_a = dupTemp$0.field_a + 1;
                continue;
              }
            }
            break;
          }
          if (param0 != 1) {
            this.field_y = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("op.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final String k(byte param0) {
        int var3;
        int var4;
        BattleCreature var5;
        int var5_int;
        int var6;
        int var7;
        rha var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        var6 = BachelorFridge.field_y;
        var8 = new rha();
        var8.a("gametype: " + this.j((byte) 42), 4819);
        var8.a("players: " + this.playerCount, 4819);
        var8.a(99, 2);
        for (var3 = 0; var3 < this.playerCount; var3++) {
          if (this.field_o == 3) {
            var8.a(this.field_y[var3] + ": " + this.field_C[var3], 4819);
          } else {
            var8.a(this.field_y[var3], 4819);
          }
        }
        var8.a(102, -2);
        var8.a("boardtype: " + this.a((byte) -83), 4819);
        var8.a("turnid: " + this.field_A, 4819);
        if (this.field_o == 3) {
          var8.a("flags:", 4819);
          var8.a(119, 2);
          for (var3Lifetime1 = 0; var3Lifetime1 < this.playerCount; var3Lifetime1++) {
            var8.a(this.field_c[var3Lifetime1][0] + ", " + this.field_c[var3Lifetime1][1], 4819);
          }
          var8.a(120, -2);
        }
        if (this.field_M != -1) {
          var8.a("winning: " + this.field_M + ": " + this.field_Q + " turns", 4819);
        }
        var8.a("map: " + this.field_D + " - " + this.width + "x" + this.height, 4819);
        for (var3Lifetime2 = 0; this.width > var3Lifetime2; var3Lifetime2++) {
          for (var4 = 0; this.height > var4; var4++) {
            var5_int = this.field_E * 2 + this.field_L.field_o[var3Lifetime2][var4].terrain;
            if (this.tiles[var3Lifetime2][var4].a(-27864, this, var5_int)) {
              this.tiles[var3Lifetime2][var4].a(-128, var3Lifetime2, var8, this, var4);
            }
          }
        }
        var3Lifetime3 = 0;
        if (param0 > -60) {
          this.field_U = (IntrusiveDeque) null;
        }
        while (var3Lifetime3 < this.playerCount) {
          var8.a("player: " + this.field_y[var3Lifetime3], 4819);
          var8.a(-17, 2);
          var7 = 0;
          var4Lifetime1 = var7;
          while (var7 < 7) {
            var5 = this.rosters[var3Lifetime3].field_b[var7];
            if (var5 != null) {
              var5.a(var8, (byte) 73);
            } else {
              var8.a(var7 + ": (empty)", 4819);
            }
            var7++;
          }
          var8.a(101, -2);
          var3Lifetime3++;
        }
        var8.a("Resultant checksum: " + Integer.toHexString(this.c((byte) -87)), 4819);
        return var8.a((byte) -128);
    }

    final boolean a(int param0, int param1, int param2, byte param3) {
        int var5;
        boolean stackIn_6_0 = false;
        if (3 != this.field_o) {
          return false;
        }
        var5 = 81 / ((38 - param3) / 53);
        stackIn_6_0 = (param1 == this.field_c[param0][0]) && (param2 == this.field_c[param0][1]);
        return stackIn_6_0;
    }

    private final void a(PacketBuffer param0, byte param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 40 % ((61 - param1) / 45);
          for (var4 = 0; var4 < this.playerCount; var4++) {
            this.a(var4, param0, -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("op.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final BattleCreature a(BattleCreature param0, byte param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        BattleCreature stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a((byte) 112, param0);
          if (param1 >= -39) {
            this.k((byte) -50);
          }
          if (var3 != null) {
            var3.f(32);
            this.a(var3, true);
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("op.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    BattleState(int param0, int param1, int param2, int param3, int param4, String[] param5) {
        BoardTile stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[][] var21 = null;
        int[] var22 = null;
        int var9Lifetime1;
        this.field_w = new Random();
        this.field_Q = -1;
        this.field_M = -1;
        try {
          this.field_G = param0;
          this.playerCount = param5.length;
          this.field_k = param2;
          this.field_o = param3;
          this.field_m = param4;
          this.field_J = st.field_d[this.field_m];
          this.field_y = param5;
          this.field_L = FloodSpecial.a(0, this.playerCount, this.field_o, this.field_k, af.field_a);
          this.field_D = this.field_L.field_g;
          if (null == this.field_L) {
            throw new RuntimeException();
          }
          var7_int = 3 + this.playerCount;
          if (var7_int > 9) {
            var7_int = 9;
          }
          this.height = this.field_L.field_q;
          this.field_E = param1;
          this.width = this.field_L.field_f;
          this.tiles = new BoardTile[this.width][this.height];
          for (var8 = 0; this.height > var8; var8++) {
            for (var9 = 0; var9 < this.width; var9++) {
              var10 = this.field_L.field_o[var9][var8].terrain;
              if (var10 < 2) {
                var10 = 0;
              } else {
                var10 += 19;
              }
              this.tiles[var9][var8] = new BoardTile(var10);
              stackIn_14_0 = this.tiles[var9][var8];
              stackIn_15_1 = (this.field_L.field_o[var9][var8].terrain == 1);
              stackIn_14_0.field_i = stackIn_15_1;
              if (this.tiles[var9][var8].a(false, this)) {
                this.tiles[var9][var8].field_j = DiveBomberAnimation.a(3, this.field_w, -2147483648);
              }
              if (-1 != this.field_L.field_o[var9][var8].field_a &&
                this.field_L.field_o[var9][var8].field_a < 13) {
                if (!this.b(var8, 26, var9)) {
                  this.tiles[var9][var8].terrain = this.field_L.field_o[var9][var8].field_a;
                  this.tiles[var9][var8].field_a = this.field_L.field_o[var9][var8].field_a;
                  this.tiles[var9][var8].field_m = true;
                } else {
                  this.tiles[var9][var8].field_a = -1;
                }
              }
            }
          }
          this.field_i = new int[this.field_L.field_m][3];
          for (var8 = 0; var8 < this.field_L.field_m; var8++) {
            if (this.field_o == 2) {
              this.field_i[var8] = new int[]{this.field_L.field_h[var8][0], this.field_L.field_h[var8][1], -1};
            } else {
              this.field_i[var8] = new int[]{-1, -1, -1};
            }
          }
          if (this.field_o == 2) {
            var21 = this.field_i;
            var14 = 0;
            var9Lifetime1 = var14;
            while (var14 < var21.length) {
              var22 = var21[var14];
              var11 = var22[0];
              var12 = var22[1];
              if (var11 != -1 ||
                -1 != var12) {
                this.tiles[var11][var12].terrain = 20;
                this.tiles[var11][var12].field_a = 8;
                var22[2] = -1;
              }
              var14++;
            }
          }
          this.rosters = new PlayerRoster[this.playerCount];
          for (var8 = 0; var8 < this.playerCount; var8++) {
            this.rosters[var8] = new PlayerRoster(var8);
          }
          if (3 == this.field_o) {
            this.field_c = new int[this.playerCount][2];
            for (var8 = 0; var8 < this.playerCount; var8++) {
              this.field_c[var8] = this.a(0, var8);
              if (this.field_c[var8][0] != -1 &&
                this.field_c[var8][1] != -1) {
                this.tiles[this.field_c[var8][0]][this.field_c[var8][1]].terrain = var8 + 23;
                this.tiles[this.field_c[var8][0]][this.field_c[var8][1]].field_m = true;
              }
            }
            this.field_C = new int[this.playerCount];
          }
          this.field_j = new CreatureOrder[this.playerCount][7];
          this.field_t = new IntrusiveDeque[7];
          this.field_n = new CreatureRef[7 * this.playerCount];
          this.field_g = new int[this.playerCount];
          this.field_p = new vg();
          this.field_T = new paa(this);
          if (af.field_a) {
            this.tiles[3][6].terrain = 39;
            this.tiles[3][6].field_h = 20;
            this.tiles[4][5].field_h = 20;
            this.tiles[4][5].terrain = 39;
            this.tiles[0][2].terrain = 39;
            this.field_e = 3;
            this.tiles[0][2].field_h = 20;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_53_0 = var7;
          stackIn_53_1 = new StringBuilder().append("op.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
        field_q = "Accept <%0> into this game";
    }
}
