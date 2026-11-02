/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattleCreature extends CreatureProfile {
    int tileX;
    int tileY;
    int friendly;
    int hp;
    boolean field_A;
    boolean field_G;
    int splitId;
    int field_s;
    BattleState battle;
    int statusId;
    int field_v;
    int rosterSlot;
    int statusTurns;
    int field_t;
    boolean field_z;
    int ownerIndex;
    int shield;
    int[] field_K;

    final boolean c(byte param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10) {
            this.field_K = (int[]) null;
          }
          var3 = ur.field_e[param1];
          if (this.statusId == 44) {
            return false;
          }
          if (this.statusId == 29) {
            return false;
          }
          if (35 == this.statusId &&
            1 < var3.field_l) {
            return false;
          }
          if (this.statusId == 2) {
            return false;
          }
          if (this.statusId == 9 &&
            var3.field_a == 1) {
            return false;
          }
          if (this.statusId == 8 &&
            var3.field_a == 2) {
            return false;
          }
          if (54 == this.statusId) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3_ref), "aga.U(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ur.field_e[param1];
          var4 = this.b(param1, (byte) -127);
          if (var3.field_g != param0 &&
            ~this.field_K[var4] != ~(1 + var3.field_g)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3_ref), "aga.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void d(boolean param0) {
        int[] var1 = InvincibleSpecial.c(106);
        if (param0) {
          return;
        }
        if (null == var1) {
          return;
        }
        try {
          mn.field_l = new hca(var1[0], var1[1], kda.b(97));
          ImageProducerRasterBuffer.field_h = new hca(320, 400, bf.field_h[CreatureType.field_n].field_j);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aga.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4_int = 0;
        oha var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (this.statusId != 0 &&
            this.statusId != 35) {
            this.statusTurns = this.statusTurns - 1;
          }
          if (param1 >= -7) {
            this.a(19, (byte) -77);
          }
          var4_int = 0;
          while (var4_int < this.field_K.length) {
            if (var6 != 0) {
              return;
            }
            if (this.field_m[var4_int] != -1) {
              var5 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var4_int]]];
              if (this.field_K[var4_int] < var5.field_g) {
                this.field_K[var4_int] = this.field_K[var4_int] + 1;
              }
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var4), "aga.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 <= 50) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.battle.tiles[this.tileX][this.tileY].terrain != 23 ||
            !this.battle.a(this.tileY, (byte) 124, this.tileX) ||
            this.ownerIndex == 0 ||
            this.g((byte) 85)) {
            if (24 == this.battle.tiles[this.tileX][this.tileY].terrain &&
              this.battle.a(this.tileY, (byte) 120, this.tileX) &&
              this.ownerIndex != 1 &&
              !this.g((byte) 85)) {
              this.b((byte) 125, 25);
              this.battle.field_T.field_G[1] = true;
              decompiledFrameRemainder1 = (var3 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (25 == this.battle.tiles[this.tileX][this.tileY].terrain &&
                this.battle.a(this.tileY, (byte) 115, this.tileX) &&
                this.ownerIndex != 2 &&
                !this.g((byte) 85)) {
                this.b((byte) 115, 26);
                this.battle.field_T.field_G[2] = true;
                decompiledFrameRemainder1 = (var3 != 0);
              }
              if ((decompiledFrameRemainder1) &&
                (this.battle.tiles[this.tileX][this.tileY].terrain == 26) &&
                (this.battle.a(this.tileY, (byte) 121, this.tileX)) &&
                (this.ownerIndex != 3) &&
                (!this.g((byte) 85))) {
                this.b((byte) 114, 27);
                this.battle.field_T.field_G[3] = true;
                if (var3 != 0) {
                  this.b((byte) 115, 24);
                  this.battle.field_T.field_G[0] = true;
                }
              }
            }
          } else {
            this.b((byte) 115, 24);
            this.battle.field_T.field_G[0] = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.i(23, 118) &&
            this.g((byte) 85) &&
            this.ownerIndex == 0) {
            this.battle.field_C[this.ownerIndex] = this.battle.field_C[this.ownerIndex] + 1;
            this.battle.field_T.field_s[this.ownerIndex] = this.battle.field_T.field_s[this.ownerIndex] + 1;
            var2_int = this.battle.b((byte) 65, this);
            if (var2_int != -1) {
              this.battle.a(var2_int, (byte) 82);
              this.statusId = 0;
            }
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!this.i(24, -105) ||
              !this.g((byte) 85) ||
              1 != this.ownerIndex) {
              if ((!this.i(25, 127) ||
                !this.g((byte) 85) ||
                this.ownerIndex != 2) &&
                (decompiledFrameRemainder0 = !(!this.i(26, 125))) &&
                (decompiledFrameRemainder0 = !(!this.g((byte) 85))) &&
                (decompiledFrameRemainder0 = (this.ownerIndex == 3))) {
                this.battle.field_C[this.ownerIndex] = this.battle.field_C[this.ownerIndex] + 1;
                this.battle.field_T.field_s[this.ownerIndex] = this.battle.field_T.field_s[this.ownerIndex] + 1;
                var2_intLifetime1 = this.battle.b((byte) 63, this);
                if (-1 != var2_intLifetime1) {
                  this.battle.a(var2_intLifetime1, (byte) 78);
                  this.statusId = 0;
                }
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.battle.field_C[this.ownerIndex] = this.battle.field_C[this.ownerIndex] + 1;
                this.battle.field_T.field_s[this.ownerIndex] = this.battle.field_T.field_s[this.ownerIndex] + 1;
                var2_intLifetime1 = this.battle.b((byte) 116, this);
                if (var2_intLifetime1 != -1) {
                  this.battle.a(var2_intLifetime1, (byte) 121);
                  this.statusId = 0;
                }
                if (var3 != 0) {
                  this.battle.field_C[this.ownerIndex] = this.battle.field_C[this.ownerIndex] + 1;
                  this.battle.field_T.field_s[this.ownerIndex] = this.battle.field_T.field_s[this.ownerIndex] + 1;
                  var2_intLifetime1 = this.battle.b((byte) 51, this);
                  if (var2_intLifetime1 != -1) {
                    this.battle.a(var2_intLifetime1, (byte) 120);
                    this.statusId = 0;
                  }
                }
              }
            } else {
              this.battle.field_C[this.ownerIndex] = this.battle.field_C[this.ownerIndex] + 1;
              this.battle.field_T.field_s[this.ownerIndex] = this.battle.field_T.field_s[this.ownerIndex] + 1;
              var2_intLifetime1 = this.battle.b((byte) 51, this);
              if (var2_intLifetime1 != -1) {
                this.battle.a(var2_intLifetime1, (byte) 120);
                this.statusId = 0;
              }
            }
          }
          if (this.battle.a(this.ownerIndex, this.tileX, this.tileY, (byte) -41) &&
            !this.g((byte) 85)) {
            this.battle.a(this.ownerIndex, (byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.K(" + param0 + ')');
        }
    }

    final void j(int param0) {
        int var2_int = 0;
        BattleCreature var3 = null;
        int var4 = 0;
        BattleCreature stackIn_14_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        BattleCreature stackOut_13_0;
        RuntimeException var2 = null;
        Object stackIn_33_0Lifetime1;
        var4 = BachelorFridge.field_y;
        try {
          if (param0 > -98) {
            return;
          }
          if (this.battle.field_o == 3 &&
            this.g((byte) 85)) {
            this.c(true);
          }
          boolean decompiledFrameCompleted0 = true;
          if (31 == this.statusId) {
            var2_int = 0;
            while (var2_int < 7) {
              var3 = this.battle.rosters[this.ownerIndex].field_b[var2_int];
              stackOut_13_0 = var3;
              stackIn_33_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if ((stackIn_14_0 != null ||
                var4 != 0) &&
                (!var3.isDown(-106) ||
                var4 != 0) &&
                var2_int != this.rosterSlot) {
                var3.h(121, this.field_t);
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.hp = 0;
            this.battle.tiles[this.tileX][this.tileY].occupant = null;
            this.statusTurns = 0;
            stackIn_33_0Lifetime1 = this;
          }
          this.statusId = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.BA(" + param0 + ')');
        }
    }

    final void c(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var3_int = 56 % ((param1 - 57) / 59);
          var4 = 0;
          var5 = 0;
          while (this.field_m.length > var5) {
            if (var7 != 0) {
              return;
            }
            if (this.field_m[var5] != -1) {
              var6 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var5]]];
              if ((var6.field_j != 3 ||
                var7 != 0) && this.field_K[var5] <= var6.field_g) {
                if (~param0 == ~var4) {
                  this.field_K[var5] = -3 + var6.field_g;
                }
                var4++;
              }
            }
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aga.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_t = (int)it.field_c[this.field_k[0]];
          if (this.hp > this.field_t) {
            this.hp = this.field_t;
          }
          if (param0 != -2) {
            this.c((byte) 99, -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.R(" + param0 + ')');
        }
    }

    final void j(int param0, int param1) {
        oha var3 = ur.field_e[this.field_o.field_g.field_b[this.field_m[param0]]];
        if (param1 != 0) {
          return;
        }
        try {
          this.field_K[param0] = var3.field_g + 1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aga.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0, byte param1) {
        RuntimeException runtimeException = null;
        oha var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.statusId == 42) {
            return;
          }
          var3 = ur.field_e[param0];
          if (param1 > -78) {
            this.j(-35, -54);
          }
          var4 = this.b(param0, (byte) -113);
          if (var3.a(-125)) {
            this.field_K[var4] = 2 + var3.field_g;
            if (BachelorFridge.field_y == 0) {
              return;
            }
          }
          this.field_K[var4] = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aga.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(rha param0, byte param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          param0.a(this.rosterSlot + ": " + this.field_o.field_f, 4819);
          param0.a(109, 2);
          param0.a("x: " + this.tileX + " y: " + this.tileY, 4819);
          param0.a("hp: " + this.hp + "/" + this.field_t, 4819);
          var3_int = 99 % ((-30 - param1) / 56);
          if (this.splitId != 0) {
            param0.a("splitid: " + this.splitId, 4819);
          }
          if (this.statusId != 0) {
            param0.a("status: " + pna.field_zb[this.statusId].field_d + " (" + this.statusTurns + " turns)", 4819);
          }
          if (37 == this.statusId) {
            param0.a("friendly: " + this.friendly, 4819);
          }
          if (this.shield != 0) {
            param0.a("shield: " + this.shield, 4819);
          }
          var4 = 0;
          while (var4 < 5) {
            var5 = this.field_m[var4];
            if (var8 != 0) {
              return;
            }
            if (-1 != var5 ||
              var8 != 0) {
              var6 = al.a(-80, this.field_o.field_g.field_b[var5]);
              var7 = this.field_K[var4];
              if (var7 == 0) {
                param0.a("move " + var4 + ": " + var6.field_f, 4819);
              } else {
                param0.a("move " + var4 + ": " + var6.field_f + " (cooldown " + var7 + ")", 4819);
              }
            }
            var4++;
          }
          param0.a("Creature checksum: " + Integer.toString(this.g(96), 16), 4819);
          param0.a(115, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("aga.N(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean i(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (this.tileX > 0 &&
            ~this.battle.tiles[-1 + this.tileX][this.tileY].terrain == ~param0) {
            return true;
          }
          if (this.tileX < (this.battle.width - 1) &&
            this.battle.tiles[1 + this.tileX][this.tileY].terrain == param0) {
            return true;
          }
          if (this.tileY > 0 &&
            param0 == this.battle.tiles[this.tileX][-1 + this.tileY].terrain) {
            return true;
          }
          if ((this.battle.height - 1) > this.tileY &&
            ~param0 == ~this.battle.tiles[this.tileX][1 + this.tileY].terrain) {
            return true;
          }
          var3_int = 36 % ((param1 - 83) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.T(" + param0 + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_7_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -91 % ((-21 - param0) / 54);
          if (0 <= this.ownerIndex &&
            this.battle.field_y.length > this.ownerIndex) {
            stackIn_7_0 = this.battle.field_y[this.ownerIndex];
          } else {
            stackIn_7_0 = Integer.toString(this.ownerIndex);
          }
          var3 = stackIn_7_0;
          stackIn_8_0 = "owner: " + var3 + " pos: " + this.rosterSlot + " type: " + this.field_o.field_f;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.O(" + param0 + ')');
        }
    }

    private final void h(int param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.hp = this.hp + param1;
          if (this.hp > this.field_t) {
            param1 = param1 + (-this.hp + this.field_t);
            this.hp = this.field_t;
          }
          this.battle.field_T.field_F[this.ownerIndex] = this.battle.field_T.field_F[this.ownerIndex] + param1;
          var3_int = -86 % ((param0 - 38) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (this.statusId == 33) {
            return false;
          }
          if (this.statusId == 3) {
            param1 = param1 >> 1;
          }
          var3_int = -36 / ((param0 + 23) / 44);
          if (this.shield > 0) {
            this.shield = this.shield - param1;
            if (this.shield <= 0) {
              this.b((byte) 125, 0);
            }
            return false;
          }
          if (37 == this.statusId &&
            param1 != 0) {
            this.b((byte) 116, 0);
          }
          if (param1 < 0) {
            this.h(-24, -param1);
            return false;
          }
          if (29 == this.statusId ||
            this.statusId == 44) {
            this.b((byte) 115, 0);
          }
          this.hp = this.hp - param1;
          this.battle.field_T.field_b[this.ownerIndex] = this.battle.field_T.field_b[this.ownerIndex] + param1;
          if (this.hp > 0) {
            return false;
          }
          this.j(-122);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(BoardTile param0, int param1) {
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          if (this.a(32, (byte) -66)) {
            return;
          }
          var3_int = param0.terrain;
          if (BuffVendorAnimation.field_w[this.battle.tiles[this.tileX][this.tileY].terrain].field_b &&
            this.battle.tiles[this.tileX][this.tileY].field_m &&
            !this.g((byte) 85) &&
            33 != this.statusId) {
            regionExit1: {
              if (var3_int != 11) {
                if (var3_int == 10) {
                  this.b((byte) 126, 18);
                  this.battle.field_T.field_e[this.ownerIndex] = this.battle.field_T.field_e[this.ownerIndex] + 1;
                }
                if (var3_int != 10 ||
                  var5 != 0) {
                  if (var3_int == 7) {
                    this.b((byte) 111, 4);
                  }
                  if (var3_int != 7 ||
                    var5 != 0) {
                    if (var3_int == 6) {
                      this.b((byte) 120, 16);
                      this.battle.field_T.field_e[this.ownerIndex] = this.battle.field_T.field_e[this.ownerIndex] + 1;
                    }
                    if (var3_int != 6 ||
                      var5 != 0) {
                      if (9 != var3_int ||
                        28 == this.statusId) {
                        switch (var3_int) {
                          case 8:
                            this.b((byte) 126, 17);
                            this.battle.field_T.field_e[this.ownerIndex] = this.battle.field_T.field_e[this.ownerIndex] + 1;
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          default:
                            break regionExit1;
                          case 29:
                            this.b((byte) 126, 12);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          case 12:
                            this.b((byte) 113, 19);
                            this.battle.field_T.field_e[this.ownerIndex] = this.battle.field_T.field_e[this.ownerIndex] + 1;
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          case 13:
                            this.b((byte) 116, 7);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                            break;
                        }
                      }
                      this.b((byte) 127, 5);
                      if (var5 != 0) {
                        this.b((byte) 110, 6);
                      }
                    }}}} else {
                this.b((byte) 110, 6);
              }
            }
            if (!this.battle.a(this.tileY, (byte) 120, this.tileX) &&
              29 != var3_int) {
              this.battle.tiles[this.tileX][this.tileY].field_m = false;
            }
            if (!this.battle.a(this.tileY, (byte) 117, this.tileX)) {
              this.battle.tiles[this.tileX][this.tileY].field_j = 5;
              if (var5 != 0) {
                this.battle.tiles[this.tileX][this.tileY].field_j = -1;
              }
            } else {
              this.battle.tiles[this.tileX][this.tileY].field_j = -1;
            }
            this.d(-127);
          }
          if (21 == var3_int) {
            this.j(-114);
            this.field_A = false;
          }
          if ((21 != var3_int ||
            var5 != 0) &&
            var3_int == 38) {
            if (0 == param0.field_j) {
              this.h(-23, 30);
              if (var5 != 0) {
                this.g(-67, 75);
              }
            } else {
              this.g(-67, 75);
            }
            this.battle.b((byte) 47, 0, this.tileX, this.tileY);
          }
          if (param1 >= -20) {
            this.field_v = -90;
          }
          if (this.battle.field_o == 3) {
            var4 = this.battle.a(1845, this.tileY, this.tileX);
            if (-1 != var4) {
              boolean decompiledSharedTail0 = (~this.ownerIndex != ~var4);
              if (!decompiledSharedTail0) {
                this.battle.a(this.ownerIndex, (byte) 46);
                this.battle.tiles[this.tileX][this.tileY].field_m = false;
                decompiledSharedTail0 = (var5 != 0);
              }
              if ((decompiledSharedTail0) &&
                (!this.g((byte) 85))) {
                this.b((byte) 111, var4 + 24);
                this.battle.tiles[this.tileX][this.tileY].field_m = false;
                this.battle.field_T.field_G[var4] = true;
              }
            }
          }
          if (this.battle.field_o == 3 &&
            this.g((byte) 85)) {
            var4 = this.battle.b((byte) 65, this);
            this.battle.field_c[var4] = new int[]{this.tileX, this.tileY};
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_125_0 = var3;
          stackIn_125_1 = new StringBuilder().append("aga.D(");
          if (param0 == null) {
            stackIn_126_2 = "null";
          } else {
            stackIn_126_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_125_0), ((StringBuilder) (Object) stackIn_125_1).append(stackIn_126_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oha var4 = null;
        int var5 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 <= 110) {
            this.a((byte) -104, (PacketBuffer) null);
          }
          var2_int = 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < this.field_m.length)))) {
            stackIn_15_0 = ~this.field_m[var3];
            if (var5 == 0) {
              if (stackIn_15_0 != 0) {
                var4 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var3]]];
                if (3 != var4.field_j) {
                  var2_int++;
                }
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = var2_int;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.W(" + param0 + ')');
        }
    }

    final void a(BoardTile param0, BoardChangeBatch param1, IntrusiveDeque param2, byte param3) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_127_2 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_131_2 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        EffectBatch var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        oha var8 = null;
        int var9 = 0;
        int var7_intLifetime1;
        int var7_intLifetime2;
        var9 = BachelorFridge.field_y;
        try {
          var5_int = param0.terrain;
          var6 = new EffectBatch();
          if (this.statusId != 0 &&
            35 != this.statusId &&
            this.statusId != 31 &&
            0 >= this.statusTurns &&
            !this.g((byte) 85) &&
            this.shield <= 0) {
            var6.a(true, new ks(new CreatureRef(this)));
            this.statusId = 0;
            this.d(114);
          }
          if (this.statusId == 42 &&
            this.field_G) {
            var6.a(true, new ks(new CreatureRef(this)));
            this.statusId = 0;
            this.d(param3 ^ -15);
          }
          if (param3 != 121) {
            return;
          }
          var7_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_K.length <= var7_int))) {
            stackIn_46_0 = 0;
            stackIn_46_1 = ~this.field_m[var7_int];
            if (var9 == 0) {
              if (stackIn_46_0 != stackIn_46_1) {
                var8 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var7_int]]];
                if (this.field_K[var7_int] == var8.field_g &&
                  var8.field_g != 0) {
                  this.j(var7_int, 0);
                  var6.a(true, new kt(new CreatureRef(this.ownerIndex, this.rosterSlot), var7_int));
                }
              }
              var7_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_46_0 = 1;
            stackIn_46_1 = this.statusId;
          }
          if (stackIn_46_0 == stackIn_46_1) {
            var6.a(true, new qq(new CreatureRef(this.ownerIndex, this.rosterSlot), -1, 5));
          }
          if (this.statusId == 12) {
            var6.a(true, new qq(new CreatureRef(this.ownerIndex, this.rosterSlot), -1, 20));
          }
          if (this.statusId == 14) {
            var7_intLifetime1 = -this.hp + this.field_t;
            if (var7_intLifetime1 > 5) {
              var7_intLifetime1 = 5;
            }
            if (var7_intLifetime1 > 0) {
              var6.a(true, new qq(new CreatureRef(this.ownerIndex, this.rosterSlot), -1, -var7_intLifetime1));
            }
          }
          if (44 == this.statusId) {
            var6.a(true, new qq(new CreatureRef(this.ownerIndex, this.rosterSlot), -1, -20));
          }
          if (this.statusId == 53) {
            var6.a(true, new qq(new CreatureRef(this.ownerIndex, this.rosterSlot), -1, 10));
          }
          if (this.statusId != 32) {
            if (var5_int == 29) {
              var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), 0, 12));
            }
            if (var5_int == 14) {
              var7_intLifetime2 = -this.hp + this.field_t;
              if (var7_intLifetime2 > 5) {
                var7_intLifetime2 = 5;
              }
              if (var7_intLifetime2 > 0) {
                var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), -var7_intLifetime2, -1));
              }
            }
            if (21 == var5_int) {
              var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), this.hp, -1));
            }
            if (15 == var5_int) {
              var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), 5, -1));
            }
            if (var5_int == 16) {
              var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), 0, DiveBomberAnimation.a(14, this.field_p, param3 + 2147483527) + 1));
            }
          }
          var7 = this.e(36, 73);
          if (null != var7) {
            var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), -30, -1));
          }
          if (var5_int == 36) {
            var6.a(true, new lia(new CreatureRef(this.ownerIndex, this.rosterSlot), -30, -1));
          }
          if (this.battle.field_R && (this.tileX == 0 ||
            0 == this.tileY ||
            ~(this.battle.width - 1) == ~this.tileX ||
            this.battle.height - 1 == this.tileY)) {
            param1.a(new ns(new CreatureRef(this)), (byte) 75);
            this.battle.field_R = false;
          }
          if (var6.field_m.g(0) > 0) {
            param2.a(var6, true);
          }
          var6.a(this.battle, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_126_0 = var5;
          stackIn_126_1 = new StringBuilder().append("aga.CA(");
          if (param0 == null) {
            stackIn_127_2 = "null";
          } else {
            stackIn_127_2 = "{...}";
          }
          stackIn_130_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_127_2).append(',');
          if (param1 == null) {
            stackIn_131_2 = "null";
          } else {
            stackIn_131_2 = "{...}";
          }
          stackIn_134_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_131_2).append(',');
          if (param2 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_126_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, BattleCreature param1, byte param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != 2) {
            return false;
          }
          if (null != param1 &&
            ~param1.ownerIndex != ~this.ownerIndex &&
            0 <= param0) {
            this.battle.field_T.field_f[param1.ownerIndex] = this.battle.field_T.field_f[param1.ownerIndex] + param0;
            this.battle.field_T.field_n[param1.ownerIndex] = this.battle.field_T.field_n[param1.ownerIndex] + param0;
            this.battle.field_T.field_b[this.ownerIndex] = this.battle.field_T.field_b[this.ownerIndex] + param0;
            this.battle.field_T.field_g[this.ownerIndex] = this.battle.field_T.field_g[this.ownerIndex] + 1;
            this.battle.field_T.field_y[param1.ownerIndex] = this.battle.field_T.field_y[param1.ownerIndex] + 1;
            this.battle.field_T.field_E[param1.ownerIndex] = this.battle.field_T.field_E[param1.ownerIndex] + 1;
          }
          if (param1 != null &&
            0 > param0) {
            this.battle.field_T.field_F[param1.ownerIndex] = this.battle.field_T.field_F[param1.ownerIndex] - param0;
            if (~param1.ownerIndex != ~this.ownerIndex) {
              this.battle.field_T.field_j[this.ownerIndex] = true;
            }
          }
          if (!this.g(param2 + 72, param0)) {
            return false;
          }
          if (param1 != null) {
            this.battle.field_T.field_w[param1.ownerIndex] = this.battle.field_T.field_w[param1.ownerIndex] + 1;
            if (20 == param1.field_o.field_b &&
              this.field_o.field_b == 3) {
              this.battle.field_T.field_x[param1.ownerIndex] = true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("aga.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    final void f(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          this.battle.tiles[this.tileX][this.tileY].occupant = this;
          if (this.a(param0, (byte) 126)) {
            return;
          }
          this.a(this.battle.tiles[this.tileX][this.tileY], -83);
          var2 = this.battle.field_i;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2.length <= var3))) {
            var4 = var2[var3];
            stackIn_21_0 = ~this.tileX;
            stackIn_21_1 = ~var4[0];
            if (var5 == 0) {
              if (stackIn_21_0 == stackIn_21_1 &&
                this.tileY == var4[1]) {
                if (~var4[2] != ~this.ownerIndex) {
                  this.battle.field_T.field_A[this.ownerIndex] = this.battle.field_T.field_A[this.ownerIndex] + 1;
                }
                var4[2] = this.ownerIndex;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = -4;
            stackIn_21_1 = ~this.battle.field_o;
          }
          if (stackIn_21_0 == stackIn_21_1) {
            this.e(77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "aga.FA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -40 % ((-5 - param1) / 58);
          stackIn_4_0 = (~this.statusId == ~param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 85) {
            this.c((byte) -17, 73);
          }
          if (this.statusId >= 24 &&
            27 >= this.statusId) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.PA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k[1] <= 0) {
            stackIn_2_0 = 2;
            return stackIn_2_0;
          }
          if (param0 > 117) {
            stackIn_7_0 = this.field_k[1] + 2;
            return stackIn_7_0;
          }
          stackIn_5_0 = 35;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.MA(" + param0 + ')');
        }
    }

    final static void a(Random param0, boolean param1, IntrusiveDeque param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        rea var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var4 = (rea) (param2.b((byte) 90));
          if (!param1) {
            return;
          }
          while (var4 != null) {
            if (var5 != 0) {
              return;
            }
            fieldTemp$0 = var4.field_n + var4.field_h;
            var4.field_n = var4.field_n + var4.field_h;
            if (0 > fieldTemp$0) {
              var4.unlink(false);
            } else {
              var4.field_l = var4.field_l + var4.field_o;
              DiveBomberAnimation.a(50, param0, -2147483648);
            }
            var4 = (rea) (param2.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("aga.EA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean k(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        int var5 = 0;
        try {
          if (28 == this.statusId &&
            5 == param1) {
            return false;
          }
          if (this.statusId == 31) {
            return false;
          }
          if (this.g((byte) 85)) {
            return false;
          }
          if (param1 == 42) {
            this.field_G = false;
          }
          if (param0 != -2049) {
            return false;
          }
          this.statusId = param1;
          this.statusTurns = 1 + is.field_b[this.statusId];
          if (16 == param1) {
            var3_double = 100.0 * ((double)this.hp / it.field_c[this.field_k[0]]);
            var5 = this.field_k[0] + 1;
            if (var5 > 5) {
              var5 = 5;
            }
            this.hp = (int)(var3_double * it.field_c[var5] / 100.0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int[] e(int param0, int param1) {
        int[] stackIn_11_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 < this.tileX &&
            ~param0 == ~this.battle.tiles[-1 + this.tileX][this.tileY].terrain) {
            stackIn_27_0 = new int[]{this.tileX - 1, this.tileY};
            return stackIn_27_0;
          }
          if (this.tileX < -1 + this.battle.width &&
            param0 == this.battle.tiles[1 + this.tileX][this.tileY].terrain) {
            stackIn_11_0 = new int[]{1 + this.tileX, this.tileY};
            return stackIn_11_0;
          }
          if (this.tileY > 0 &&
            this.battle.tiles[this.tileX][-1 + this.tileY].terrain == param0) {
            stackIn_17_0 = new int[]{this.tileX, this.tileY - 1};
            return stackIn_17_0;
          }
          if (-1 + this.battle.height > this.tileY &&
            ~this.battle.tiles[this.tileX][this.tileY + 1].terrain == ~param0) {
            stackIn_25_0 = new int[]{this.tileX, this.tileY + 1};
            return stackIn_25_0;
          }
          if (param1 < 69) {
            this.field_K = (int[]) null;
          }
          stackIn_32_0 = null;
          return (int[]) (stackIn_32_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.G(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return false;
          }
          if (this.battle.field_o == 3 &&
            ~this.ownerIndex == ~this.battle.b(false, param0)) {
            return false;
          }
          if (32 == this.statusId) {
            return true;
          }
          stackIn_15_0 = DiveBomberEvent.c(23745, param0);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.C(" + param0 + ',' + param1 + ')');
        }
    }

    BattleCreature(CreatureProfile param0, BattleState param1, int param2, int param3) {
        super(param0);
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        this.field_A = true;
        try {
          this.battle = param1;
          this.ownerIndex = param2;
          this.splitId = 0;
          this.rosterSlot = param3;
          this.field_t = (int)it.field_c[this.field_k[0]];
          this.hp = this.field_t;
          this.field_s = 4;
          this.field_K = new int[this.field_m.length];
          var5_int = 0;
          while (var5_int < this.field_K.length) {
            if (var6 != 0) {
              return;
            }
            if (this.field_m[var5_int] != -1) {
              this.field_K[var5_int] = 0;
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("aga.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final BattleCreature b(boolean param0) {
        BattleCreature var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        BattleCreature stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          var2 = new BattleCreature((CreatureProfile) (this), this.battle, this.ownerIndex, this.rosterSlot);
          var3 = 0;
          do {
            if (var3 >= 4) {
              this.field_t = this.field_t >> 1;
              var2.field_t = var2.field_t - this.field_t;
              this.hp = this.hp >> 1;
              var2.tileX = this.tileX;
              break;
            }
            this.field_k[var3] = this.field_k[var3] >> 1;
            var2.field_k[var3] = var2.field_k[var3] - this.field_k[var3];
            var3++;
          } while (var4 == 0);
          if (!param0) {
            this.b((byte) -95, 67);
          }
          var2.tileY = this.tileY;
          this.splitId = 5 + this.rosterSlot + 17 * this.ownerIndex;
          var2.splitId = 5 + this.rosterSlot + 17 * this.ownerIndex;
          var2.hp = this.hp;
          stackIn_12_0 = var2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2_ref), "aga.KA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.battle.b((byte) 122, this);
          if (this.g((byte) 85)) {
            this.statusId = 0;
          }
          this.battle.field_c[var2_int] = new int[]{this.tileX, this.tileY};
          if (this.battle.tiles[this.tileX][this.tileY].terrain == 21) {
            this.battle.a(var2_int, (byte) 115);
          }
          if (!param0) {
            this.shield = 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aga.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (!param2) {
            this.statusId = 87;
          }
          this.battle.field_T.field_i[this.ownerIndex] = this.battle.field_T.field_i[this.ownerIndex] + 1;
          this.tileX = param1;
          this.tileY = param0;
          this.f(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var4), "aga.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 79 / ((param1 + 47) / 57);
          var4 = 0;
          while (this.field_m.length > var4) {
            if (this.field_m[var4] != -1 &&
              ~param0 == ~this.field_o.field_g.field_b[this.field_m[var4]]) {
              stackIn_8_0 = var4;
              return stackIn_8_0;
            }
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          var4_int = this.tileX;
          var5 = this.tileY;
          if (param2 == 2) {
            var4_int = var4_int - param1;
          }
          if (param2 != 2 ||
            var7 != 0) {
            if (param2 == 4) {
              var4_int = var4_int + param1;
            }
            if (param2 != 4 ||
              var7 != 0) {
              if (param2 != 1) {
                if (param2 == 3) {
                  var5 = var5 + param1;
                  if (var7 != 0) {
                    var5 = var5 - param1;
                  }
                }
              } else {
                var5 = var5 - param1;
              }
            }}
          if (param0) {
            this.shield = 110;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.statusId == 43) {
            var6 = 0;
            while (param1 > var6) {
              stackIn_47_0 = param2;
              stackIn_47_1 = 2;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_47_0 == stackIn_47_1) {
                this.battle.b((byte) -49, 29, -var6 + this.tileX, this.tileY);
              } else if (param2 != 4) {
                if (param2 != 1) {
                  if (param2 == 3) {
                    this.battle.b((byte) -54, 29, this.tileX, var6 + this.tileY);
                  }
                } else {
                  this.battle.b((byte) -80, 29, this.tileX, -var6 + this.tileY);
                }
              } else {
                this.battle.b((byte) 50, 29, this.tileX + var6, this.tileY);
              }
              var6++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_47_0 = -41;
            stackIn_47_1 = ~this.statusId;
          }
          if (stackIn_47_0 == stackIn_47_1) {
            this.statusId = 0;
          }
          this.a(var4_int, var5, (byte) 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var4), "aga.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(boolean param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          var3 = ur.field_e[param1];
          var4 = this.b(param1, (byte) 30);
          stackIn_7_0 = (~(var3.field_g + 2) == ~this.field_K[var4]);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3_ref), "aga.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        PacketBuffer stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          super.a((byte) -74, param1);
          param1.b(this.hp, -126);
          param1.b(this.field_t, -119);
          param1.writeByte(this.ownerIndex, 0);
          param1.writeByte(this.rosterSlot, 0);
          param1.writeByte(this.splitId, 0);
          param1.writeByte(this.tileX, 0);
          param1.writeByte(this.tileY, 0);
          param1.writeByte(this.field_s, 0);
          param1.writeByte(this.statusId, 0);
          param1.writeByte(this.statusTurns, 0);
          param1.writeByte(this.friendly, 0);
          if (param0 >= -21) {
            this.field_A = true;
          }
          var3_int = 0;
          do {
            if (5 <= var3_int) {
              param1.writeByte(this.shield, 0);
              break;
            }
            param1.writeByte(this.field_K[var3_int], 0);
            var3_int++;
          } while (var4 == 0);
          stackIn_14_0 = (PacketBuffer) (param1);
          if (!this.field_A) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          ((PacketBuffer) (Object) stackIn_14_0).writeByte(stackIn_15_1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("aga.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = BachelorFridge.field_y;
        try {
          ArrayOperations.copy(this.field_o.field_l, 0, this.field_k, 0, this.field_k.length);
          if (this.a(84, 0, this.field_m)) {
            this.field_k[0] = this.field_k[0] + 1;
          }
          if (this.a(85, 0, this.field_m)) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          if (this.a(86, 0, this.field_m)) {
            this.field_k[2] = this.field_k[2] + 1;
          }
          if (this.a(87, 0, this.field_m)) {
            this.field_k[3] = this.field_k[3] + 1;
          }
          if (this.statusId == 7) {
            this.field_k[3] = this.field_k[3] - 1;
          }
          if (6 == this.statusId) {
            this.field_k[2] = this.field_k[2] - 1;
          }
          if (this.statusId == 5) {
            this.field_k[1] = this.field_k[1] - 1;
          }
          if (this.statusId == 4) {
            this.field_k[0] = this.field_k[0] - 1;
          }
          if (this.statusId == 18) {
            this.field_k[2] = this.field_k[2] + 1;
          }
          if (16 == this.statusId) {
            this.field_k[0] = this.field_k[0] + 1;
          }
          if (this.statusId == 17) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          if (this.statusId == 19) {
            this.field_k[3] = this.field_k[3] + 1;
          }
          if (this.statusId == 28) {
            this.field_k[1] = 5;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.statusId == 35) {
            var2_int = 0;
            while (!(var2_int >= this.field_k.length)) {
              this.field_k[var2_int] = 0;
              var2_int++;
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var2_int = 0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (4 <= var2_int))) {
            stackIn_69_0 = ~this.field_k[var2_int];
            stackIn_69_1 = -1;
            if (var3 == 0) {
              if (stackIn_69_0 > stackIn_69_1) {
                this.field_k[var2_int] = 0;
              }
              if (this.field_k[var2_int] > 5) {
                this.field_k[var2_int] = 5;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.h(-2);
            stackIn_69_0 = 75;
            stackIn_69_1 = (param0 + 49) / 38;
          }
          var2_intLifetime1 = stackIn_69_0 % stackIn_69_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.B(" + param0 + ')');
        }
    }

    final boolean isDown(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 33 / ((param0 + 7) / 62);
          stackIn_4_0 = !(this.hp > 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.S(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.battle.tiles[this.tileX][this.tileY].occupant = null;
          if (param2 != 17) {
            this.field_K = (int[]) null;
          }
          this.battle.field_T.field_i[this.ownerIndex] = this.battle.field_T.field_i[this.ownerIndex] + (Math.abs(-param0 + this.tileX) + Math.abs(this.tileY - param1));
          this.tileX = param0;
          this.tileY = param1;
          this.f(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var4), "aga.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 109) {
            return;
          }
          var3_int = this.statusId;
          if (!this.k(-2049, param1)) {
            return;
          }
          if (var3_int == 32 &&
            32 != this.statusId) {
            this.f(32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var3), "aga.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final int g(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = this.field_o.field_b * 74741;
          var2_int = var2_int ^ 37 * (5753 * this.tileX + this.tileY);
          var2_int = var2_int << 5 | var2_int >>> 27;
          var2_int = var2_int ^ this.hp * 912487 + 57123 * this.field_t;
          var2_int = var2_int << 15 | var2_int >>> 17;
          var2_int = var2_int ^ this.ownerIndex * 8676 + 78767 * this.rosterSlot;
          if (param0 < 86) {
            this.field_v = 3;
          }
          if (this.isDown(-100)) {
            stackIn_6_0 = var2_int;
            return stackIn_6_0;
          }
          var2_int = var2_int << 1 | var2_int >>> 31;
          if (this.splitId != 0) {
            var2_int = var2_int ^ this.splitId * 7;
            var2_int = var2_int >>> 20 | var2_int << 12;
          }
          if (this.statusId != 0) {
            var2_int = var2_int ^ (this.statusTurns + 575 * this.statusId) * 91911;
            var2_int = var2_int << 24 | var2_int >>> 8;
          }
          if (this.statusId == 37) {
            var2_int = var2_int ^ 74821 * this.friendly;
          }
          if (0 != this.shield) {
            var2_int = var2_int ^ 54857 * this.shield;
            var2_int = var2_int << 19 | var2_int >>> 13;
          }
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 5))) {
            var4 = this.field_m[var3];
            stackIn_31_0 = var4;
            if (var5 == 0) {
              if (stackIn_31_0 != -1) {
                var2_int = var2_int ^ 753 * (var4 + var3 * 1921);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = var2_int;
          }
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "aga.P(" + param0 + ')');
        }
    }

    static {
    }
}
