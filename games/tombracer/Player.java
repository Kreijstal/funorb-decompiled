/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Player implements Renderable, WorldBody, Collidable, jfa, Teleportable {
    private PlayerAnimator animator;
    private int field_c;
    private int size;
    private int lifeState;
    private int velocityX;
    private int y;
    private int field_S;
    private int facingX;
    private boolean field_gb;
    static fta field_p;
    private int deathCause;
    private int lifeStateTimer;
    private Room room;
    private int velocityY;
    private int playerIndex;
    private IntrusiveDeque statusEffects;
    static IntrusiveDeque field_I;
    private int x;
    private int field_A;
    private int facingY;
    private Weapon weapon;
    private int field_h;
    private int field_t;
    private IntrusiveDeque collectedTreasures;
    private boolean field_q;
    private int previousX;
    private boolean[] statusFlags;
    private int previousY;
    private int field_m;
    private boolean field_L;
    private boolean field_l;
    private int field_Y;
    private boolean field_Z;
    static Sprite field_W;
    private int[] roomTreasure;
    private int field_N;
    private int heldItemWeight;
    static String[] loadingQuips;
    static String field_s;
    private int[] treasure;
    private int heldItemKind;
    private TeleportState field_jb;
    private int field_kb;
    private boolean field_o;
    private boolean field_V;
    private WorldBody carried;
    private int field_T;
    private int chosenReward;
    private WorldBody field_eb;
    private int field_F;
    private int score;
    private int respawnX;
    private int encodedDeathCount;
    private int[] deathCountsByCause;
    private int moveSpeed;
    private int respawnY;
    private boolean collectedTreasure;
    private int field_cb;
    private boolean field_db;
    private int animationStateTicks;
    private int elevation;
    private int animationStateTimer;
    private int field_O;
    private int animationState;
    private int total;

    public final TeleportState getTeleportState(boolean param0) {
        RuntimeException var2 = null;
        TeleportState stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.chosenReward = -109;
          }
          stackIn_4_0 = this.field_jb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BA(" + param0 + ')');
        }
    }

    public final void f(int param0) {
        try {
          if (param0 != -4366) {
            this.b(103, (WorldBody) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.N(" + param0 + ')');
        }
    }

    public final void render(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 103) {
            this.encodedDeathCount = -41;
          }
          if (null == this.animator) {
            return;
          }
          this.animator.render(106, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("hca.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int getAnimationState(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.animationState;
            return stackIn_4_0;
          }
          stackIn_2_0 = 23;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IB(" + param0 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1 &&
            !this.s((byte) 91)) {
            return;
          }
          this.getSimulation(-1).reportDeathPenalty(this, param0 - 16385);
          if (param0 != 16384) {
            return;
          }
          this.k(false);
          this.a(1, (byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "hca.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final void G(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 31027) {
            this.b(-101, (WorldBody) null);
          }
          this.field_A = 25;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BD(" + param0 + ')');
        }
    }

    final int getTreasure(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 196608) {
            this.w(49);
          }
          stackIn_4_0 = this.treasure[param1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.FB(" + param0 + ',' + param1 + ')');
        }
    }

    final void tick(int param0, int param1) {
        boolean stackIn_49_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        StatusEffect var3 = null;
        Particle var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_db) {
            this.y = this.y - 262144;
            if (3 == this.lifeState) {
              this.lifeStateTimer = this.lifeStateTimer - 1;
              if (0 < this.lifeStateTimer) {
                return;
              }
              this.getSimulation(param0 ^ -6).c(-1);
              if (var4 == 0) {
                return;
              }
            }
            if (this.room.g((byte) 104)) {
              this.a(60, (byte) 2);
            }
            return;
          }
          this.savePreviousPosition((byte) 120);
          this.field_jb.a(86);
          if (param0 != 5) {
            return;
          }
          this.animationStateTicks = this.animationStateTicks + 1;
          if (this.field_kb > 0) {
            this.field_kb = this.field_kb - 1;
          }
          if (this.field_S > 0) {
            this.field_S = this.field_S - 1;
          }
          if (this.field_A > 0) {
            this.field_A = this.field_A - 1;
          }
          var3_int = 0;
          while (true) {
            if (this.statusFlags.length > var3_int) {
              this.statusFlags[var3_int] = false;
              var3_int++;
              if (var4 == 0) {
                continue;
              }
            } else {
              var3 = (StatusEffect) (this.statusEffects.first(-80));
              while (true) {
                if (null != var3) {
                  var3.tick(-9);
                  stackIn_49_0 = var3.isExpired((byte) 81);
                  if (var4 == 0) {
                    if (!stackIn_49_0) {
                      this.statusFlags[var3.getKind((byte) 91)] = true;
                    } else {
                      var3.unlink(param0 ^ 93);
                    }
                    var3 = (StatusEffect) (this.statusEffects.next(117));
                    continue;
                  }
                } else {
                  stackIn_49_0 = this.field_q;
                }
                break;
              }
              if (stackIn_49_0) {
                this.statusFlags[5] = true;
                this.field_q = false;
              }
              this.field_l = false;
              if (this.field_Z) {
                this.field_Z = false;
                this.statusFlags[2] = true;
              }
              if (this.field_L) {
                this.statusFlags[3] = true;
                this.field_L = false;
              }
              if (this.weapon != null) {
                this.weapon.c(-28);
              }
              var3_int = this.lifeState;
            }
            break;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3_int == 0) {
            this.applyInput((byte) 111, param1);
            if (this.room.a(0, (WorldBody) (this)) != 1) {
            }
          } else {
            if (var3_int == 1 &&
              var4 == 0) {
              this.room.a(0, (WorldBody) (this));
              if (4 != this.deathCause) {
                this.velocityY = 0;
                this.velocityX = 0;
              } else {
                if (this.elevation > -17825792) {
                  this.elevation = this.elevation + this.field_O;
                  this.field_O = this.field_O - 16384;
                  if (this.elevation <= -17825792) {
                    if (this.field_T == 6) {
                      var3_ref = this.room.spawnParticle(this.x, this.y, (byte) 100, -17825792);
                      var3_ref.a(false, 32, 4, 16, 5 + uca.cosmeticRandom.nextBounded(5, 0));
                      var3_ref.b(param0 + 99, 0, 0);
                      var3_ref.a(uca.cosmeticRandom.nextBounded(8192, param0 ^ 5), -32 + uca.cosmeticRandom.nextBounded(64, param0 - 5), -125);
                    }
                    this.elevation = -17825793;
                  }
                }
              }
              this.lifeStateTimer = this.lifeStateTimer - 1;
              if (!(this.lifeStateTimer > 0)) {
                if (this.field_T != 5 &&
                  this.field_T != 6 &&
                  this.room.a(this.size, this.size, (WorldBody) (this), this.x, this.y, (byte) -126) == 0) {
                  this.room.recordDeath(8, this.createCorpse(-94));
                }
                this.room.restart((byte) -124);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var3_int == 2 &&
                var4 == 0) {
                this.facingY = -1;
                this.facingX = 0;
                this.lifeStateTimer = this.lifeStateTimer - 1;
                this.y = this.y - 393216;
                if (0 >= this.lifeStateTimer) {
                  this.velocityY = -393216;
                  this.lifeState = 0;
                  this.field_c = 40;
                }
                this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -46);
                this.room.collisionGrid.insert((Collidable) (this), 7073);
                decompiledFrameRemainder0 = false;
              } else {
                decompiledFrameRemainder0 = (var3_int == 3);
              }
              if (decompiledFrameRemainder0) {
                this.lifeStateTimer = this.lifeStateTimer - 1;
                if (0 >= this.lifeStateTimer) {
                  this.bankRoomTreasure(3);
                  this.getSimulation(-1).c(-1);
                }
              }
            }
          }
          this.field_V = false;
          if (this.animator != null) {
            this.animator.a(param0 ^ 21458);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref2), "hca.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final int getFacingX(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25763) {
            this.getRoomTreasure(113, -115);
          }
          stackIn_4_0 = this.facingX;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.NA(" + param0 + ')');
        }
    }

    final int getPlayerIndex(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = this.playerIndex;
            return stackIn_4_0;
          }
          stackIn_2_0 = 34;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.S(" + param0 + ')');
        }
    }

    final void setTotal(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 16) {
            this.L(-34);
          }
          this.total = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.EE(" + param0 + ',' + param1 + ')');
        }
    }

    final void setHeldItem(int param0, byte param1, int param2, int param3) {
        try {
          this.heldItemKind = param3;
          this.field_N = param2;
          int var5_int = 25 % ((-9 - param1) / 55);
          this.heldItemWeight = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.NE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void bankRoomTreasure(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          this.getSimulation(-1);
          if (param0 != 3) {
            this.field_L = false;
          }
          var2_int = 0;
          while (3 > var2_int) {
            this.treasure[var2_int] = this.treasure[var2_int] + this.roomTreasure[var2_int];
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.JA(" + param0 + ')');
        }
    }

    final int getHeldItemKind(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 124) {
            this.field_V = false;
          }
          stackIn_4_0 = this.heldItemKind;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.A(" + param0 + ')');
        }
    }

    public final boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        try {
          if (this.field_db) {
            return false;
          }
          if (param4 == 0 &&
            param3 == 0) {
            return true;
          }
          var7_int = this.x;
          if (param0 <= 68) {
            this.clearHeldItem(-3);
          }
          var8 = this.y;
          this.a(param3, 127, param4, param2, 0);
          if (var7_int == this.x &&
            this.y == var8) {
            stackIn_23_0 = 1;
          } else {
            stackIn_23_0 = 0;
          }
          var9 = stackIn_23_0;
          if (!param1 && (var9 != 0 ||
            0 == this.animationState ||
            this.animationState == 6)) {
            if (2 == param2) {
              this.facingX = lw.signum(-param4, (byte) -109);
              this.facingY = lw.signum(-param3, (byte) -119);
              this.setAnimationState(-5636, 2, false);
            }
            if (this.field_A == 0) {
              this.field_A = 2;
            }
          }
          return (var9 == 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean p(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -72) {
            stackIn_4_0 = this.field_l;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BB(" + param0 + ')');
        }
    }

    final void g(int param0, int param1) {
        try {
          this.room.a(this.y, this.x, param0, 0, (byte) 6);
          int var3_int = 35 % ((57 - param1) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(WorldBody param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_db) {
            return false;
          }
          if (this == param0) {
            return false;
          }
          if (this.q(param2 ^ 111)) {
            return false;
          }
          if (param2 < param1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("hca.KE(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int i(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -54 / ((1 - param0) / 51);
          stackIn_1_0 = this.field_m;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.JC(" + param0 + ')');
        }
    }

    public final int getRenderY(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 91) {
            this.field_gb = true;
          }
          stackIn_4_0 = this.y;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AB(" + param0 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = "(Player x=" + this.x + " y=" + this.y + " vx=" + this.velocityX + " vy=" + this.velocityY + ")";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "hca.toString()");
        }
    }

    final int getScore(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 72) {
            stackIn_4_0 = this.score;
            return stackIn_4_0;
          }
          stackIn_2_0 = 25;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AD(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.velocityX < 0) {
            this.velocityX = this.velocityX + param4;
            if (this.velocityX > 0) {
              this.velocityX = 0;
              if (var8 != 0 &&
                this.velocityX > 0) {
                this.velocityX = this.velocityX - param4;
                if (this.velocityX < 0) {
                  this.velocityX = 0;
                }
              }
            }
          } else {
            if (this.velocityX > 0) {
              this.velocityX = this.velocityX - param4;
              if (this.velocityX < 0) {
                this.velocityX = 0;
              }
            }
          }
          if (this.velocityY < 0) {
            this.velocityY = this.velocityY + param4;
            if (0 < this.velocityY) {
              this.velocityY = 0;
              if (var8 != 0 &&
                this.velocityY > 0) {
                this.velocityY = this.velocityY - param4;
                if (this.velocityY < 0) {
                  this.velocityY = 0;
                }
              }
            }
          } else {
            if (this.velocityY > 0) {
              this.velocityY = this.velocityY - param4;
              if (this.velocityY < 0) {
                this.velocityY = 0;
              }
            }
          }
          this.velocityX = this.velocityX + gqa.a(param3, (byte) 24, param2);
          this.velocityX = za.$cfr$intArgs$a$c604db63f465(-param0, 108, param0, this.velocityX);
          this.velocityY = this.velocityY + gqa.a(param3, (byte) 24, param1);
          this.velocityY = za.$cfr$intArgs$a$c604db63f465(-param0, 84, param0, this.velocityY);
          var7_int = -47 % ((75 - param5) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int applyBeamEffect(Effect param0, int param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == param0.field_g) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (this.statusFlags[2]) {
            stackIn_7_0 = 1;
            return stackIn_7_0;
          }
          if (SimulationObserver.a(this.size, param1, this.y, this.size, param2, this.x, 2) == -1) {
            stackIn_12_0 = 0;
            return stackIn_12_0;
          }
          stackIn_14_0 = this.a(param0, -1);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hca.ED(");
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
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void clearWeapon(byte param0, int param1) {
        Corpse discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 89) {
            discarded$1 = this.createCorpse(-67);
          }
          this.setWeapon(param1, (byte) -128, (Weapon) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.VD(" + param0 + ',' + param1 + ')');
        }
    }

    final void equipWeapon(Weapon param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            this.heldItemWeight = 91;
          }
          this.setWeapon(25, (byte) -127, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hca.PB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getWeight(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -29 % ((param0 - 1) / 45);
          var3 = this.heldItemWeight + 2;
          if (this.weapon != null) {
            var3 = var3 + this.weapon.d(70);
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HA(" + param0 + ')');
        }
    }

    final boolean s(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 77) {
            this.a(89, (uw) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CA(" + param0 + ')');
        }
    }

    final void addScore(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.score = this.score + param1;
          if (this.score < 0) {
            this.score = 0;
          }
          if (param0 != 0) {
            Player.D(123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.DC(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -61 % ((param1 - 53) / 35);
          if (this.lifeState != 3) {
            this.lifeState = 3;
            this.lifeStateTimer = param0;
            this.field_F = this.room.getTick((byte) 18) + param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "hca.WB(" + param0 + ',' + param1 + ')');
        }
    }

    final void kill(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        uw var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_db) {
            return;
          }
          if (this.q(97)) {
            return;
          }
          if (this.lifeState != 2 &&
            this.lifeState != 3) {
            if (param0 == 0) {
              return;
            }
            if (param0 == 4 &&
              this.statusFlags[4]) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            this.getSimulation(-1).reportPenalty(this, param0, 1, param2);
            this.room.collisionGrid.remove((Collidable) (this), (byte) 107);
            if (4 == param0) {
              var4 = this.room.getScene((byte) 52);
              if (null != var4 &&
                this.animator != null) {
                var4.a(7, this.animator, (byte) -33);
                var4.a((byte) -82, 2, this.animator);
              }
              this.setAnimationState(-5636, 12, true);
            }
            if (4 != param0 ||
              var5 != 0) {
              if (param0 != 1) {
                if (param0 != 2 ||
                  7 != param2) {
                  if (param2 != 9 &&
                    11 != param2) {
                    if (param2 == 14) {
                      this.setAnimationState(-5636, 20, true);
                    }
                    if (param2 != 14 ||
                      var5 != 0) {
                      if (param2 != 15 &&
                        param2 != 10) {
                        if (param2 != 8) {
                          this.setAnimationState(-5636, 14, true);
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          this.setAnimationState(-5636, 22, true);
                        }
                      }
                      if ((decompiledFrameRemainder0) && (param2 == 15 ||
                        param2 == 10 || var5 != 0)) {
                        this.setAnimationState(-5636, 21, true);
                        if (var5 != 0) {
                          this.setAnimationState(-5636, 17, true);
                          this.setAnimationState(-5636, 16, true);
                          this.setAnimationState(-5636, 13, true);
                          this.room.getParticleEffects(false).a((byte) 61, 2097152 + this.getElevation((byte) 115), this.x, this.y);
                        }
                      }
                    }} else {
                    this.setAnimationState(-5636, 17, true);
                    if (var5 != 0) {
                      this.setAnimationState(-5636, 16, true);
                      this.setAnimationState(-5636, 13, true);
                      this.room.getParticleEffects(false).a((byte) 61, 2097152 + this.getElevation((byte) 115), this.x, this.y);
                    }
                  }
                } else {
                  this.setAnimationState(-5636, 16, true);
                  if (var5 != 0) {
                    this.setAnimationState(-5636, 13, true);
                    this.room.getParticleEffects(false).a((byte) 61, 2097152 + this.getElevation((byte) 115), this.x, this.y);
                  }
                }
              } else {
                this.setAnimationState(-5636, 13, true);
                this.room.getParticleEffects(false).a((byte) 61, 2097152 + this.getElevation((byte) 115), this.x, this.y);
              }
            }
            this.dropHeldItem(30358);
            this.deathCause = param0;
            this.lifeState = 1;
            this.lifeStateTimer = DateFieldsWidget.field_C[param0];
            this.k(false);
            this.deathCountsByCause[param0] = this.deathCountsByCause[param0] + 1;
            var4_int = -81 % ((param1 + 64) / 41);
            this.encodedDeathCount = 18202625 ^ (18202625 ^ this.encodedDeathCount) + 1;
            this.field_T = param2;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "hca.QC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void respawn(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          boolean decompiledSharedTail0 = (this.room != null &&
            !(this.room.o((byte) -82)));
          if (!decompiledSharedTail0) {
            this.lifeState = 0;
            this.x = this.respawnX;
            this.y = this.respawnY;
            this.lifeStateTimer = 0;
            this.deathCause = 0;
            this.setAnimationState(-5636, 0, true);
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if (decompiledSharedTail0) {
            this.lifeStateTimer = 17;
            this.lifeState = 2;
            this.x = this.respawnX;
            this.deathCause = 0;
            this.y = 2097152 + (this.lifeStateTimer * 393216 + this.respawnY);
            this.setAnimationState(-5636, 4, true);
          }
          this.field_q = false;
          this.velocityY = 0;
          var3_int = -16 / ((-55 - param0) / 44);
          this.field_A = 0;
          this.field_h = 0;
          this.field_t = 0;
          this.field_c = 0;
          this.velocityX = 0;
          this.field_S = 0;
          this.field_V = false;
          this.facingX = 0;
          this.field_l = false;
          this.facingY = -1;
          this.field_O = 0;
          this.field_Z = false;
          this.field_L = false;
          this.field_Y = 0;
          this.v((byte) 74);
          this.savePreviousPosition((byte) 116);
          this.field_jb.b((byte) 93);
          this.animationStateTimer = 0;
          this.field_eb = null;
          this.field_kb = 0;
          this.elevation = 0;
          this.carried = null;
          if (param1) {
            this.statusEffects.clear(8);
            this.clearWeapon((byte) 89, 10);
            this.m(15876);
            this.field_o = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.CE(" + param0 + ',' + param1 + ')');
        }
    }

    public final int getRenderX(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -94 / ((-23 - param0) / 53);
          stackIn_1_0 = this.x;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.M(" + param0 + ')');
        }
    }

    final int getCourseIndex(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -95) {
            this.isCarryingLargeObject(-94);
          }
          stackIn_4_0 = this.room.getCourseIndex(81);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.GE(" + param0 + ')');
        }
    }

    final void t(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 < 115) {
            return;
          }
          while (var2_int < 3) {
            this.treasure[var2_int] = 0;
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          this.field_cb = 0;
          this.chosenReward = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "hca.GD(" + param0 + ')');
        }
    }

    final static Sprite[] c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        Sprite var9 = null;
        Sprite var10 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        Sprite var13 = null;
        Object var14 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -110) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var6 = SoftwareRasterizer.field_l;
          var7 = SoftwareRasterizer.field_g;
          var8 = SoftwareRasterizer.field_a;
          var9 = new Sprite(param2, -(param2 * 2) + param0);
          var9.c();
          SoftwareRasterizer.fillVerticalGradient(0, 0, param2, -(param2 * 2) + param0, param3, param5);
          var10 = new Sprite(param2, param2);
          var10.c();
          SoftwareRasterizer.fillRectangle(0, 0, param2, param2, param3);
          var11 = new Sprite(16, param2);
          var11.c();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param2, param3);
          var12 = new Sprite(param2, param2);
          var12.c();
          SoftwareRasterizer.fillRectangle(0, 0, param2, param2, param5);
          var13 = new Sprite(16, param2);
          var13.c();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param2, param5);
          var14 = null;
          if (param1 > 0) {
            var14 = new Sprite(16, 16);
            ((Sprite) (var14)).c();
            SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param1);
          }
          SoftwareRasterizer.a(var6, var7, var8);
          stackIn_8_0 = new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var12, var13, var12};
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6_ref), "hca.QE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final boolean intersectsRect(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 110) {
            stackIn_4_0 = io.centredBoxesOverlap(param4, this.y, (byte) -118, param3, this.x, param1, this.size, this.size, param2);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        Object stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        Object stackIn_6_0;
        int stackIn_6_4;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != -103) {
            return;
          }
          stackIn_5_0 = this;
          stackIn_5_1 = param0;
          stackIn_5_2 = 127;
          stackIn_5_3 = param1;
          if (!this.isHoldingItem(param2 + 223)) {
            stackIn_6_0 = this;
            stackIn_6_4 = 1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_4 = 0;
          }
          this.a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.SE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final int getPreviousY(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21185) {
            this.deathCountsByCause = (int[]) null;
          }
          stackIn_4_0 = this.previousY;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.U(" + param0 + ')');
        }
    }

    private final void dropHeldItem(int param0) {
        RuntimeException decompiledCaughtException = null;
        Trap var2 = null;
        RuntimeException var2_ref = null;
        MiscItemBehaviour var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.isHoldingItem(param0 ^ -30382)) {
            return;
          }
          var2 = new Trap(this.room, true);
          var2.b(437453352, this.y, this.x);
          if (param0 != 30358) {
            this.field_S = -25;
          }
          boolean decompiledFrameRemainder0 = true;
          var2.setSize((byte) -11, 2097152, 2097152);
          var2.setFloating((byte) 17, false);
          var2.setWeight((byte) -3, this.heldItemWeight);
          var2.a(92, true);
          var3 = new MiscItemBehaviour(this.room, true);
          var4 = this.heldItemKind;
          if (0 == var4 &&
            var5 == 0) {
            var3.setItemType(3, false);
            this.roomTreasure[2] = this.roomTreasure[2] - 1;
            decompiledFrameRemainder0 = false;
          } else {
            decompiledFrameRemainder0 = (var4 == 1);
          }
          if (decompiledFrameRemainder0) {
            var3.setItemType(0, false);
          }
          var3.a(true, (byte) 2);
          var2.addBehaviour((byte) 83, (Behaviour) (var3));
          var2.c(437453352, true);
          var2.setPushable(true, param0 ^ 30447);
          this.room.addTrap(var2, (byte) 32);
          this.clearHeldItem(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "hca.CC(" + param0 + ')');
        }
    }

    public static void D(int param0) {
        try {
          field_p = null;
          field_s = null;
          field_W = null;
          loadingQuips = null;
          field_I = null;
          if (param0 != -1) {
            Player.D(-63);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.TA(" + param0 + ')');
        }
    }

    private final void savePreviousPosition(byte param0) {
        try {
          this.previousX = this.x;
          this.previousY = this.y;
          int var2_int = 103 % ((-7 - param0) / 44);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.JE(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 40) {
            this.velocityX = 6;
          }
          var4_int = 1;
          while (3 >= var4_int) {
            if (var6 != 0) {
              return;
            }
            if (param1 == 0) {
              stackIn_16_0 = (param2 <= 0) ? -1 : 1;
              var5 = stackIn_16_0;
              if (this.a(-1, -1, 0, 0, var5, var4_int)) {
                return;
              }
              if (this.a(param0 - 41, 1, 0, 0, var5, var4_int)) {
                return;
              }
            } else {
              if (param2 == 0) {
                stackIn_30_0 = (0 >= param1) ? -1 : 1;
                var5 = stackIn_30_0;
                if (this.a(-1, 0, -1, var5, 0, var4_int)) {
                  return;
                }
                if (this.a(param0 ^ -41, 0, 1, var5, 0, var4_int)) {
                  return;
                }
              }
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.HB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void n(int param0) {
        try {
          this.field_Z = true;
          if (param0 != 21120) {
            this.field_kb = 32;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.RD(" + param0 + ')');
        }
    }

    final void q(byte param0) {
        boolean stackIn_7_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.x = this.room.mirrorX(this.x, (byte) 71);
          this.facingX = -this.facingX;
          if (param0 != -57) {
            this.addStatusEffect((StatusEffect) null, (byte) -39);
          }
          this.velocityX = -this.velocityX;
          stackIn_7_1 = !(this.field_o);
          this.field_o = stackIn_7_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MD(" + param0 + ')');
        }
    }

    final int getRoomTreasure(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 393216) {
            this.respawn(126, false);
          }
          stackIn_4_0 = this.roomTreasure[param1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.QA(" + param0 + ',' + param1 + ')');
        }
    }

    final int j(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.field_cb;
            return stackIn_4_0;
          }
          stackIn_2_0 = 104;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AC(" + param0 + ')');
        }
    }

    final int H(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > this.facingX &&
            this.facingY == 0) {
            stackIn_7_0 = 6;
            return stackIn_7_0;
          }
          if (this.facingX > 0 &&
            this.facingY == 0) {
            stackIn_13_0 = 2;
            return stackIn_13_0;
          }
          if (this.facingX == 0 &&
            this.facingY < 0) {
            stackIn_21_0 = 0;
            return stackIn_21_0;
          }
          if (this.facingX == 0 &&
            this.facingY > 0) {
            stackIn_27_0 = 4;
            return stackIn_27_0;
          }
          if (0 > this.facingX &&
            0 > this.facingY) {
            stackIn_33_0 = 7;
            return stackIn_33_0;
          }
          if (0 > this.facingX &&
            this.facingY > 0) {
            stackIn_39_0 = 5;
            return stackIn_39_0;
          }
          if (this.facingX > 0 &&
            this.facingY < 0) {
            stackIn_45_0 = 1;
            return stackIn_45_0;
          }
          if (0 < this.facingX &&
            0 < this.facingY) {
            stackIn_51_0 = 3;
            return stackIn_51_0;
          }
          stackIn_53_0 = -1;
          return stackIn_53_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MC(" + param0 + ')');
        }
    }

    private final void k(boolean param0) {
        try {
          this.m(15876);
          if (param0) {
            this.chosenReward = 21;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.NC(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int stackIn_31_0 = 0;
        boolean stackIn_36_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_35_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int[][] var9 = null;
        int var10 = 0;
        Collidable[] var11 = null;
        Collidable[] var12 = null;
        int var13 = 0;
        Collidable var14 = null;
        Trap var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_31_0Lifetime1;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.isHoldingItem(93) &&
            param0) {
            this.field_eb = null;
            var3_int = 1048576 + this.size / 2;
            if (!param1) {
              this.field_cb = 60;
            }
            var4 = lw.signum(this.facingX, (byte) -96);
            var5 = var3_int * var4 + this.x;
            var6 = lw.signum(this.facingY, (byte) -109);
            var7 = var6 * var3_int + this.y;
            if (null != this.carried) {
              if (!(this.carried instanceof Trap) ||
                ((Trap) (this.carried)).s((byte) 92)) {
                if (this.carried.intersectsRect((byte) 110, var7, var5, 2, 2)) {
                  this.field_eb = this.carried;
                  if (var20 != 0) {
                    this.field_eb = null;
                    this.field_eb = null;
                  }
                } else {
                  this.field_eb = null;
                  if (var20 != 0) {
                    this.field_eb = null;
                  }
                }
              } else {
                this.field_eb = null;
              }
            }
            regionExit1: {
              if (null == this.field_eb) {
                var8 = new int[][]{new int[]{var5, var7}, new int[]{this.x - var3_int * var4, this.y + var3_int * var6}, new int[]{this.x + var4 * var3_int, this.y - var6 * var3_int}, new int[]{-(var4 * var3_int) + this.x, -(var6 * var3_int) + this.y}};
                var9 = new int[][]{new int[]{this.facingX, this.facingY}, new int[]{-this.facingX, this.facingY}, new int[]{this.facingX, -this.facingY}, new int[]{-this.facingX, -this.facingY}};
                var10 = 0;
                scanLoop2: while (true) {
                  stackIn_31_0 = -5;
                  if (stackIn_31_0 >= ~var10) {
                    break scanLoop2;
                  }
                  var11 = this.room.collisionGrid.b(var8[var10][1], -1, var8[var10][0], 2, 2);
                  var12 = var11;
                  if (var20 != 0) {
                    break regionExit1;
                  }
                  var13 = 0;
                  while (var13 < var12.length) {
                    var14 = var12[var13];
                    stackOut_35_0 = var14 instanceof Trap;
                    stackIn_31_0Lifetime1 = stackOut_35_0 ? 1 : 0;
                    stackIn_36_0 = stackOut_35_0;
                    if (stackIn_36_0) {
                      var15 = (Trap) (var14);
                      if (var15.s((byte) -114) &&
                        var15.intersectsRect((byte) 110, var8[var10][1], var8[var10][0], 2, 2)) {
                        this.field_eb = (WorldBody) ((Object) var14);
                        var16 = this.field_eb.getX(3);
                        var17 = this.field_eb.getY(9648);
                        var18 = -this.x + var16;
                        var19 = -this.y + var17;
                        if (((var18 >> 8) * (var18 >> 8)) <= ((var19 >> 8) * (var19 >> 8))) {
                          if (var19 < 0) {
                            var19 = var19 + (this.size + this.field_eb.getHeight((byte) 55) >> 1);
                          } else {
                            if (var19 > 0) {
                              var19 = var19 - (this.size + this.field_eb.getHeight((byte) 55) >> 1);
                            }
                          }
                          this.y = this.y + var19;
                        } else {
                          if (var18 < 0) {
                            var18 = var18 + (this.size + this.field_eb.getWidth(-114) >> 1);
                          } else {
                            if (var18 > 0) {
                              var18 = var18 - (this.size + this.field_eb.getWidth(-110) >> 1);
                            }
                          }
                          this.x = this.x + var18;
                        }
                        this.facingX = var9[var10][0];
                        this.facingY = var9[var10][1];
                        break scanLoop2;
                      }
                    }
                    var13++;
                  }
                  var10++;
                }
              }
              if (null == this.field_eb) {
                this.carried = null;
                if (var20 == 0) {
                  return;
                }
              }
            }
            this.carried = this.field_eb;
            return;
          }
          this.carried = null;
          this.field_eb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.OC(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.b(24, (WorldBody) null);
          }
          var7_int = param5 * 393216 * param1;
          var8 = param5 * (393216 * param2);
          var9 = param3 * 786432;
          var10 = 786432 * param4;
          var11 = var9 / 2 + (var7_int + this.x);
          var12 = var10 / 2 + (var8 + this.y);
          var13 = this.size + ua.abs(var9, -113);
          var14 = this.size + ua.abs(var10, 67);
          if (!this.room.a(var11, 131072, var13, var14, var12, true)) {
            return false;
          }
          if (this.room.a((Collidable) (this), var14, param0 ^ -3, 1, var12, var11, false, (WorldBody) (this), var13)) {
            return false;
          }
          this.a(131072 * param2, param0 + 128, 131072 * param1, 0, 0);
          this.field_c = 0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int L(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2158) {
            this.statusFlags = (boolean[]) null;
          }
          stackIn_4_0 = this.field_F;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SC(" + param0 + ')');
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.room == null) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (0 < this.field_A) {
            param1 = param1 / 2;
            param4 = param4 / 2;
          }
          if (param0) {
            this.field_T = 52;
          }
          stackIn_11_0 = this.room.a((Collidable) (this), (WorldBody) (this), 1, this.size, param1, 12, this.size, this.x, param3, param4, this.y, param2, true);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.TC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = this.facingX;
          if (param2 >= 0) {
            if (param2 > 0) {
              this.facingX = 1;
              if (var6 != 0 &&
                param0 != 0) {
                this.facingX = 0;
                this.facingX = -1;
              }
            } else {
              if (param0 != 0) {
                this.facingX = 0;
                if (var6 != 0) {
                  this.facingX = -1;
                }
              }
            }
          } else {
            this.facingX = -1;
          }
          var5 = this.facingY;
          if (param0 < 0) {
            this.facingY = -1;
          }
          if (!(param0 < 0) ||
            var6 != 0) {
            if (param0 <= 0) {
              if (param2 != 0) {
                this.facingY = 0;
                if (var6 != 0) {
                  this.facingY = 1;
                }
              }
            } else {
              this.facingY = 1;
            }
          }
          if (param1 > -26) {
            this.t((byte) -73);
          }
          if (this.facingX == var4_int &&
            ~this.facingY == ~var5) {
            return;
          }
          this.field_kb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.LE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void addStatusEffect(StatusEffect param0, byte param1) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0.a((byte) -60, this)) {
            this.statusEffects.addLast((byte) -123, param0);
            while (!(3 >= this.statusEffects.size((byte) -16))) {
              this.statusEffects.removeFirst(param1 ^ -106);
              if (var4 != 0) {
                return;
              }
            }
          }
          if (param1 != 3) {
            this.c(-54, 121, 66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hca.FC(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getTotal(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.total;
            return stackIn_4_0;
          }
          stackIn_2_0 = -46;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.WD(" + param0 + ')');
        }
    }

    private final void b(int param0, WorldBody param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            this.a((byte) 121, 43, -99);
          }
          var3_int = param1.getX(3);
          var4 = param1.getY(9648);
          var5 = this.x - var3_int;
          var6 = -var4 + this.y;
          this.c(var6, param0 ^ -58, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hca.LD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int getMoveSpeed(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.moveSpeed;
            return stackIn_4_0;
          }
          stackIn_2_0 = -7;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AA(" + param0 + ')');
        }
    }

    final int w(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 85 / ((param0 - 15) / 48);
          stackIn_1_0 = this.x;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HC(" + param0 + ')');
        }
    }

    public final int getPreviousX(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 90) {
            this.q(127);
          }
          stackIn_4_0 = this.previousX;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.KA(" + param0 + ')');
        }
    }

    private final void v(byte param0) {
        if (param0 != 74) {
          this.chosenReward = -19;
        }
        if (this.room == null) {
          return;
        }
        try {
          za.$cfr$intArgs$a$c604db63f465(0, 108, this.room.getWidth((byte) -86), this.x);
          this.room.o(param0 - 66);
          this.field_m = za.$cfr$intArgs$a$c604db63f465(0, 73, this.room.getHeight(120), this.y) + this.room.n((byte) -51);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.TB(" + param0 + ')');
        }
    }

    final void collectTreasure(Trap param0, boolean param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.collectedTreasure = true;
          if (param1) {
            this.b(65, 76, -9, -128, -79, -56);
          }
          this.roomTreasure[param2] = this.roomTreasure[param2] + 1;
          if (null != param0 &&
            param2 != 0) {
            this.collectedTreasures.addLast((byte) -118, new vl(param2, param0));
          }
          this.getSimulation(-1).getObserver(9262).onTreasureCollected(param2, 15818, this, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("hca.UB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void applyInput(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_314_0 = 0;
        int stackIn_330_0 = 0;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var12Lifetime1;
        int var22Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var28Lifetime1;
        int var12Lifetime2;
        var29 = TombRacer.field_G ? 1 : 0;
        try {
          stackIn_5_0 = (0 == (1 & param1)) ? 0 : 1;
          var3_int = stackIn_5_0;
          stackIn_9_0 = (0 == (2 & param1)) ? 0 : 1;
          var4 = stackIn_9_0;
          stackIn_13_0 = (0 == (param1 & 4)) ? 0 : 1;
          var5 = stackIn_13_0;
          stackIn_17_0 = (0 == (8 & param1)) ? 0 : 1;
          var6 = stackIn_17_0;
          stackIn_21_0 = ((16 & param1) == 0) ? 0 : 1;
          var7 = stackIn_21_0;
          stackIn_25_0 = ((param1 & 128) == 0) ? 0 : 1;
          var8 = stackIn_25_0;
          stackIn_29_0 = (0 == (32 & param1)) ? 0 : 1;
          var9 = stackIn_29_0;
          stackIn_33_0 = ((256 & param1) == 0) ? 0 : 1;
          var10 = stackIn_33_0;
          stackIn_37_0 = ((64 & param1) == 0) ? 0 : 1;
          var11 = stackIn_37_0;
          if (var10 != 0 &&
            this.s((byte) 97)) {
            this.b(16384, false);
            return;
          }
          this.a(var9 != 0, true);
          if (this.getSimulation(-1).isEffectActive(1, 10915)) {
            var12 = var3_int;
            var3_int = var4;
            var4 = var12;
            var12Lifetime2 = var5;
            var5 = var6;
            var6 = var12Lifetime2;
          }
          var12Lifetime1 = 0;
          var13 = 0;
          if (var3_int != 0) {
            var12Lifetime1--;
          }
          if (var4 != 0) {
            var12Lifetime1++;
          }
          if (var5 != 0) {
            var13--;
          }
          if (var6 != 0) {
            var13++;
          }
          var14 = this.getSimulation(-1).g(113) ? 1 : 0;
          var15 = this.field_N;
          if (this.getSimulation(-1).isEffectActive(0, 10915)) {
            var15 = var15 / 2;
          }
          var16 = 0;
          if (param0 <= 81) {
            return;
          }
          if (this.statusFlags[1]) {
            var16 = 1;
          }
          stackIn_73_0 = (var11 != 0) ? 65536 : 393216;
          var17 = stackIn_73_0;
          if (var9 != 0 &&
            this.carried != null) {
            stackIn_80_0 = 1;
          } else {
            stackIn_80_0 = 0;
          }
          var18 = stackIn_80_0;
          if (var7 != 0 &&
            this.weapon != null) {
            stackIn_87_0 = 1;
          } else {
            stackIn_87_0 = 0;
          }
          boolean decompiledFrameRemainder2 = true;
          var19 = stackIn_87_0;
          if (var9 == 0) {
            if (this.field_eb != null) {
              if (this.field_eb.getWidth(-117) > 2097152 &&
                this.field_eb.getHeight((byte) 55) > 2097152) {
                stackIn_100_0 = 1;
              } else {
                stackIn_100_0 = 0;
              }
              var20 = stackIn_100_0;
              if (var20 != 0) {
                var17 = 131072;
              }
              if (var20 == 0 ||
                var29 != 0) {
                var17 = 196608;
              }
              decompiledFrameRemainder2 = (var29 != 0);
            }
            if ((decompiledFrameRemainder2) &&
              (null != this.carried)) {
              var20 = this.isCarryingLargeObject(5) ? 1 : 0;
              if (var20 == 0) {
                var17 = 196608;
                if (var29 != 0) {
                  var17 = 131072;
                }
              } else {
                var17 = 131072;
              }
            }
          }
          if (var19 != 0) {
            var17 = 262144;
            var16 = -1;
          }
          if (var18 != 0) {
            if (this.carried.getWidth(-64) > 2097152 &&
              2097152 < this.carried.getHeight((byte) 55)) {
              stackIn_122_0 = 1;
            } else {
              stackIn_122_0 = 0;
            }
            var20 = stackIn_122_0;
            if (var20 != 0) {
              var17 = 131072;
              if (var29 != 0) {
                var17 = 196608;
              }
            } else {
              var17 = 196608;
            }
          }
          this.moveSpeed = var17;
          if (var12Lifetime1 == 0 ||
            0 == var13) {
            var21 = var13 << 16;
            var20 = var12Lifetime1 << 16;
          }
          if (var12Lifetime1 != 0 &&
            0 != var13 || var29 != 0) {
            var21 = var13 * 46333;
            var20 = var12Lifetime1 * 46333;
          }
          boolean decompiledFrameRemainder3 = true;
          var22 = 0;
          var23 = 0;
          if (var19 == 0 && (var20 != 0 ||
            var21 != 0)) {
            stackIn_141_0 = 1;
            decompiledFrameRemainder3 = false;
          }
          else {
            stackIn_141_0 = 0;
          }
          var24 = stackIn_141_0;
          while (0 <= var16) {
            if (4 != this.animationState) {
              this.field_c = 0;
              if (var29 != 0) {
                this.field_c = this.field_c + 1;
              }
            } else {
              this.field_c = this.field_c + 1;
            }
            if (var24 == 0 && (this.animationState == 4 ||
              9 == this.animationState) && this.field_c > 40) {
              this.field_A = 5;
            }
            boolean decompiledSharedTail1 = !(this.field_A > 0);
            if (!decompiledSharedTail1) {
              var23 = 1;
              if (this.field_S <= 0) {
                var25 = 100000;
                var26 = 32000;
                this.room.a(this.y, 0, (byte) 126, this.x, this.velocityY * 6, this.velocityX * 6);
                if (var29 != 0) {
                  this.field_gb = true;
                  var22 = 1;
                  var25 = 20000;
                  var26 = 8000;
                }
              } else {
                this.field_gb = true;
                var22 = 1;
                var25 = 20000;
                var26 = 8000;
              }
              this.b(gqa.a(var17, (byte) 24, var15), var21, var20, gqa.a(var25, (byte) 24, var15), var26, 127);
              decompiledSharedTail1 = (var29 != 0);
            }
            if (decompiledSharedTail1) {
              this.a(var20, 89, gqa.a(var17, (byte) 24, var15), var21);
            }
            if (var14 == 0 &&
              0 == var16 &&
              this.getSimulation(-1).isEffectActive(8, 10915)) {
              this.field_gb = true;
              var22 = 1;
              this.velocityX = this.velocityX + (131072 - this.room.getRandom(-81).nextBounded(262144, 0));
              this.velocityY = this.velocityY + (131072 - this.room.getRandom(-83).nextBounded(262144, 0));
            }
            var16--;
            boolean decompiledSharedTail0 = (null == this.carried);
            if (!decompiledSharedTail0) {
              this.a((byte) 56, var21, var20);
              decompiledSharedTail0 = (var29 != 0);
            }
            if (decompiledSharedTail0) {
              this.a(this.velocityY, this.velocityX, (byte) -103);
              if (this.field_eb == null &&
                this.field_kb == 0 &&
                this.previousX == this.x &&
                ~this.previousY == ~this.y &&
                var24 != 0) {
                this.b((byte) 40, var20, var21);
              }
            }
            if (var16 < 0) {
              continue;
            }
            if (var29 == 0) {
              if (this.animator == null) {
                continue;
              }
              this.animator.a(21463);
              continue;
            }
            break;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.isHoldingItem(117)) {
            this.c(var21, -67, var20);
            decompiledFrameRemainder1 = (var9 != 0 ||
              var7 != 0);
            if (decompiledFrameRemainder1) {
              this.dropHeldItem(30358);
              decompiledFrameRemainder1 = (var29 != 0);
            }
          }
          if ((decompiledFrameRemainder1) && (var9 == 0 ||
            null == this.carried)) {
            if (var7 != 0) {
            }
            this.c(var21, -86, var20);
            if (this.weapon != null &&
              var7 != 0 &&
              this.field_kb <= 0) {
              this.fireWeapon(2);
            }
          }
          if (this.previousX == this.x &&
            ~this.y == ~this.previousY) {
            stackIn_241_0 = 0;
          } else {
            stackIn_241_0 = 1;
          }
          var25Lifetime1 = stackIn_241_0;
          if (this.field_A > 0 &&
            this.field_S <= 0 &&
            this.field_V) {
            var23 = 0;
            this.field_A = 0;
            this.animationStateTimer = 0;
          }
          boolean decompiledFrameRemainder4 = true;
          if (var22 == 0 && (var25Lifetime1 != 0 ||
            !this.room.a(false, this.y, (WorldBody) (this), this.x))) {
            stackIn_259_0 = 0;
            decompiledFrameRemainder4 = false;
          }
          else {
            stackIn_259_0 = 1;
          }
          var22Lifetime1 = stackIn_259_0;
          if (var24 != 0 &&
            var25Lifetime1 != 0 &&
            var23 == 0) {
            this.room.a(false, this.x, 0, -this.velocityX, this.y, -this.velocityY);
          }
          boolean decompiledFrameRemainder0 = true;
          var26Lifetime1 = -1;
          if (!this.isHoldingItem(-77)) {
            if (this.animationState != 0 &&
              this.animationState != 6 &&
              this.animationState == 18) {
            }
            if (0 >= this.animationStateTimer) {
              if (this.animationStateTimer != -1) {
                var26Lifetime1 = 0;
                if (var18 != 0) {
                  var26Lifetime1 = 2;
                  if (var29 != 0) {
                    this.animationStateTimer = this.animationStateTimer - 1;
                  }
                }
              }
            } else {
              this.animationStateTimer = this.animationStateTimer - 1;
            }
            if (this.animationState == 0 &&
              150 < this.animationStateTicks) {
              if (this.room.getRandom(-91).nextBounded(2, 0) == 0) {
                var26Lifetime1 = 6;
                if (var29 != 0) {
                  var26Lifetime1 = 18;
                }
              } else {
                var26Lifetime1 = 18;
              }
            }
            if (var22Lifetime1 == 0) {
              this.field_gb = true;
            }
            if ((var22Lifetime1 != 0 ||
              var29 != 0) &&
              this.field_gb) {
              var26Lifetime1 = 7;
            }
            if (var24 != 0 &&
              var25Lifetime1 != 0) {
              stackIn_314_0 = (var11 != 0) ? 19 : 4;
              var26Lifetime1 = stackIn_314_0;
            }
            if (var22Lifetime1 == 0 &&
              var23 != 0 && (0 != this.velocityX ||
              this.velocityY != 0)) {
              var26Lifetime1 = 5;
            }
            stackIn_330_0 = (this.field_kb <= 0) ? 0 : 1;
            var28 = stackIn_330_0;
            if (var24 != 0 && (var18 != 0 ||
              var28 != 0)) {
              if (var25Lifetime1 != 0) {
                if (var18 != 0 && ((this.facingX == 0 ||
                  ~var12Lifetime1 != ~this.facingX) &&
                  (this.facingY == 0 ||
                  this.facingY != var13))) {
                  var26Lifetime1 = 3;
                  if (var29 != 0) {
                    var26Lifetime1 = 1;
                    var26Lifetime1 = 2;
                  }
                } else {
                  var26Lifetime1 = 1;
                  if (var29 != 0) {
                    var26Lifetime1 = 2;
                  }
                }
              } else {
                var26Lifetime1 = 2;
              }
            }
            if (var24 != 0 &&
              var25Lifetime1 == 0) {
              var26Lifetime1 = 2;
            }
            if (var26Lifetime1 != 1 &&
              var26Lifetime1 != 3) {
            }
            decompiledFrameRemainder0 = (var29 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (var23 == 0 ||
              0 == this.velocityX &&
              this.velocityY == 0) {
              if (var24 == 0) {
                var26Lifetime1 = 8;
                if (var29 != 0) {
                  var26Lifetime1 = 9;
                  var26Lifetime1 = 10;
                }
              } else {
                var26Lifetime1 = 9;
                if (var29 != 0) {
                  var26Lifetime1 = 10;
                }
              }
            } else {
              var26Lifetime1 = 10;
            }
          }
          var27 = 0;
          if (var26Lifetime1 != -1) {
            this.animationStateTimer = 0;
            this.setAnimationState(-5636, var26Lifetime1, var27 != 0);
          }
          if (var8 != 0 &&
            !this.q(72)) {
            this.kill(2, (byte) -126, 1);
          }
          if (this.statusFlags[0]) {
            var28Lifetime1 = this.room.getRandom(-96).nextBounded(32, 0) + 256 << 16;
            this.room.a(-116, this.y, new Effect(4, 32), var28Lifetime1, var28Lifetime1, this.x);
          }
          if (this.room.g((byte) -67)) {
            this.a(1, (byte) -25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.LC(" + param0 + ',' + param1 + ')');
        }
    }

    public final int getHeight(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 55) {
            stackIn_4_0 = this.size;
            return stackIn_4_0;
          }
          stackIn_2_0 = -39;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.LA(" + param0 + ')');
        }
    }

    final boolean hasCollectedTreasure(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -75) {
            Player.D(-48);
          }
          stackIn_4_0 = this.collectedTreasure;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AE(" + param0 + ')');
        }
    }

    final int F(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 0;
          var2_int = var2_int + this.getRoomTreasure(param0 ^ -401207, 0) * gp.field_i[0];
          var2_int = var2_int + this.getRoomTreasure(393216, 1) * gp.field_i[1];
          if (param0 != -7991) {
            this.animator = (PlayerAnimator) null;
          }
          var2_int = var2_int + this.getRoomTreasure(393216, 2) * gp.field_i[2];
          stackIn_4_0 = var2_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.K(" + param0 + ')');
        }
    }

    final void i(boolean param0) {
        try {
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.JD(" + param0 + ')');
        }
    }

    public final boolean isRenderExpired(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 48) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.LB(" + param0 + ')');
        }
    }

    public final boolean b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.u(0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.E(" + param0 + ')');
        }
    }

    final void f(int param0, int param1) {
        if (param1 != -25915) {
          return;
        }
        try {
          this.field_cb = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.VB(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean l(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.statusEffects = (IntrusiveDeque) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IA(" + param0 + ')');
        }
    }

    private final void fireWeapon(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.facingX == 0 &&
            this.facingY == 0) {
            return;
          }
          if (this.getSimulation(param0 - 3).isEffectActive(2, 10915)) {
            return;
          }
          if (this.weapon == null) {
            return;
          }
          var2_int = PortalBehaviour.directionToAngle(this.facingY, this.facingX, param0 - 1);
          this.field_l = this.weapon.a(var2_int, 1572864, (WorldBody) (this), this.x, this.y, this.getRoom((byte) 80), this.velocityX, this.velocityY, this.size / param0, false);
          if (!this.field_l) {
            return;
          }
          this.setAnimationState(-5636, 11, true);
          if (this.weapon.getEffect((byte) -16).type == 3 &&
            this.field_A > 0) {
            this.field_A = 0;
          }
          if (!this.weapon.a(param0 ^ 12109)) {
            this.clearWeapon((byte) 89, 25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.JB(" + param0 + ')');
        }
    }

    final int hashState(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          param0 = CurveOperator.mixHash((byte) 114, param0, this.x);
          param0 = CurveOperator.mixHash((byte) 105, param0, this.y);
          if (param1 > -22) {
            this.elevation = -19;
          }
          param0 = CurveOperator.mixHash((byte) 44, param0, this.velocityX);
          param0 = CurveOperator.mixHash((byte) 38, param0, this.velocityY);
          stackIn_4_0 = param0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.UA(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean restsOnFloor(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 37 % ((param0 - 6) / 46);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.UD(" + param0 + ')');
        }
    }

    public final void moveTo(int param0, int param1, int param2) {
        this.room.collisionGrid.remove((Collidable) (this), (byte) 121);
        if (param2 != 2) {
          return;
        }
        try {
          this.setPosition(param1, param0, 76473160);
          this.savePreviousPosition((byte) -116);
          this.room.collisionGrid.insert((Collidable) (this), 7073);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.DD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void placeInRoom(Room param0, int param1, int param2, boolean param3) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.respawnX = param1;
          this.respawnY = param2;
          this.room = param0;
          if (this.field_db) {
            this.respawnY = this.respawnY + 157286400;
          }
          this.v((byte) 74);
          if (!param3) {
            discarded$1 = this.a((WorldBody) null, 119, -93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("hca.GA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void l(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 28) {
            this.field_o = true;
          }
          this.field_q = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PC(" + param0 + ')');
        }
    }

    final PlayerAnimator getAnimator(byte param0) {
        RuntimeException var2 = null;
        PlayerAnimator stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -36) {
            this.q(-3);
          }
          stackIn_4_0 = this.animator;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.GC(" + param0 + ')');
        }
    }

    public final int getWidth(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -11) {
            this.g(117, 73);
          }
          stackIn_4_0 = this.size;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.P(" + param0 + ')');
        }
    }

    final int getAnimationStateTicks(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.animationStateTicks;
            return stackIn_4_0;
          }
          stackIn_2_0 = 124;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BE(" + param0 + ')');
        }
    }

    public final int getRenderZ(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -86) {
            Player.D(-76);
          }
          stackIn_4_0 = this.getElevation((byte) 115);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.O(" + param0 + ')');
        }
    }

    final int getChosenReward(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -22 / ((-23 - param0) / 58);
          stackIn_1_0 = this.chosenReward;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MB(" + param0 + ')');
        }
    }

    public final boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param1, param7, 1)) {
            return false;
          }
          if (param2 <= 55) {
            this.animationStateTimer = 46;
          }
          if (!this.intersectsRect((byte) 110, param4, param6, param0, param3)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_18_0 = var9;
          stackIn_18_1 = new StringBuilder().append("hca.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean crush(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -77) {
            this.q((byte) -68);
          }
          this.kill(3, (byte) 25, 3);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hca.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean hasStatusFlag(byte param0, int param1) {
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = -117 % ((param0 + 29) / 60);
          stackIn_1_0 = this.statusFlags[param1];
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.KC(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            return true;
          }
          if (!this.a(param1, param2, 1)) {
            return false;
          }
          var5_int = SimulationObserver.a(this.size, 12, this.getY(9648), this.size, param3, this.getX(3), 2);
          if (-1 == var5_int) {
            return false;
          }
          var6 = wm.a(4096, var5_int, -110);
          param3.a(var6, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("hca.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void setAnimationState(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param2 &&
            ~param1 == ~this.animationState) {
            return;
          }
          if (this.animationState == 11 &&
            7 == param1 &&
            null != this.animator &&
            !this.animator.a((byte) -113)) {
            return;
          }
          if (param0 != -5636) {
            return;
          }
          if (param1 == 5) {
            this.animationStateTimer = 50;
          }
          if (param1 != 5 ||
            var5 != 0) {
            if (param1 != 15 &&
              11 != param1) {
              if (7 != param1) {
                if (param1 != 6) {
                  this.animationStateTimer = 0;
                  if (var5 != 0) {
                    this.animationStateTimer = 300;
                    this.animationStateTimer = 300;
                    this.animationStateTimer = -1;
                  }
                } else {
                  this.animationStateTimer = 300;
                  if (var5 != 0) {
                    this.animationStateTimer = 300;
                    this.animationStateTimer = -1;
                  }
                }
              } else {
                this.animationStateTimer = 300;
                if (var5 != 0) {
                  this.animationStateTimer = -1;
                }
              }
            } else {
              this.animationStateTimer = -1;
            }
          }
          this.animationState = param1;
          this.animationStateTicks = 0;
          if (null != this.animator) {
            this.animator.a(26, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.VC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setChosenReward(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 18202625) {
            this.playerIndex = -96;
          }
          this.chosenReward = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.ND(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean l(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.field_db;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.ME(" + param0 + ')');
        }
    }

    public final boolean canTeleport(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -102) {
            this.respawn(81, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.DE(" + param0 + ')');
        }
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_O = 60;
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.KD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(Effect param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        try {
          if (this.q(87)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param0.type == 4) {
            this.field_S = 25;
            this.field_A = 25;
          }
          if (param1 != -1) {
            this.q((byte) 16);
          }
          var3_int = 0;
          if (param0.size >= 3) {
            var4 = param0.c(-127);
            if (var4 != 0) {
              var5 = param0.e(-98);
              if (var5 == 14) {
                this.b(~param1, param0.source);
              }
              this.kill(var4, (byte) 89, var5);
            }
          }
          var3_intLifetime1 = param0.size;
          stackIn_22_0 = var3_intLifetime1;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("hca.F(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getDeathCount(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -41 % ((-37 - param0) / 49);
          stackIn_1_0 = 18202625 ^ this.encodedDeathCount;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.OE(" + param0 + ')');
        }
    }

    private final void setWeapon(int param0, byte param1, Weapon param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.weapon = param2;
          if (param1 >= -126) {
            this.getCollisionId(true);
          }
          if (this.weapon != null) {
            this.weapon.setCooldown(param0, (byte) 25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("hca.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final boolean canBeCrushedBy(WorldBody param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_eb = (WorldBody) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hca.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getElevation(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 115) {
            stackIn_4_0 = this.elevation;
            return stackIn_4_0;
          }
          stackIn_2_0 = 66;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.L(" + param0 + ')');
        }
    }

    public final boolean isPushable(byte param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -55) {
            this.setAnimationState(-42, -25, true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.RB(" + param0 + ',' + param1 + ')');
        }
    }

    private final Corpse createCorpse(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Corpse stackIn_12_0 = null;
        Corpse stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.x;
          if (this.field_o) {
            var2_int = this.room.mirrorX(var2_int, (byte) 71);
          }
          if (param0 > -76) {
            loadingQuips = (String[]) null;
          }
          if (this.lifeState == 1 &&
            this.deathCause == 4) {
            stackIn_12_0 = new Corpse(this, var2_int, this.y, -17825792, this.deathCause);
            return stackIn_12_0;
          }
          stackIn_14_0 = new Corpse(this, var2_int, this.y, 0, this.deathCause);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HD(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          do {
            if (var2_int >= 3) {
              this.collectedTreasures.clear(8);
              this.collectedTreasure = false;
              break;
            }
            this.roomTreasure[var2_int] = 0;
            var2_int++;
          } while (var3 == 0);
          if (param0 != 15876) {
            return;
          }
          this.clearHeldItem(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "hca.TD(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        try {
          this.field_db = param1;
          if (!param0) {
            this.G(118);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.V(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean isFallingIntoPit(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.applyAreaEffect((Effect) null, 58, -120, 50, 126, -106);
          }
          stackIn_10_0 = (1 == this.lifeState) && (this.deathCause == 4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.D(" + param0 + ')');
        }
    }

    public final int getFacingAngle(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -25787) {
            stackIn_4_0 = PortalBehaviour.directionToAngle(this.facingY, this.facingX, 1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 58;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.G(" + param0 + ')');
        }
    }

    public final Room getRoom(byte param0) {
        Room stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 45 / ((0 - param0) / 61);
          stackIn_1_0 = this.room;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SA(" + param0 + ')');
        }
    }

    final int k(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -79) {
            stackIn_4_0 = this.field_c;
            return stackIn_4_0;
          }
          stackIn_2_0 = 90;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.ID(" + param0 + ')');
        }
    }

    final int getVelocityY(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.animationStateTicks = 42;
          }
          stackIn_4_0 = this.velocityY;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RE(" + param0 + ')');
        }
    }

    final boolean isCarryingLargeObject(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_s = (String) null;
          }
          stackIn_13_0 = (this.carried != null) && (2097152 < this.carried.getWidth(-57)) && (this.carried.getHeight((byte) 55) > 2097152);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CB(" + param0 + ')');
        }
    }

    public final int getX(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            this.getTotal(true);
          }
          stackIn_4_0 = this.x;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.J(" + param0 + ')');
        }
    }

    final boolean u(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25561) {
            this.respawn(91, false);
          }
          stackIn_4_0 = this.hasStatusFlag((byte) -98, 5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.QD(" + param0 + ')');
        }
    }

    final void setAnimator(int param0, PlayerAnimator param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -27496) {
            Player.c(117, 34, -84, 122, 125, -27);
          }
          this.animator = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hca.PD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void setPosition(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.x = param0;
          if (param2 != 76473160) {
            this.field_V = false;
          }
          this.y = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean s(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.isExpired(45);
          }
          stackIn_7_0 = (this.heldItemKind == 1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IE(" + param0 + ')');
        }
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 69) {
            this.deathCountsByCause = (int[]) null;
          }
          stackIn_7_0 = (this.lifeState == 1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RC(" + param0 + ')');
        }
    }

    final int getVelocityX(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -41) {
            this.velocityY = 111;
          }
          stackIn_4_0 = this.velocityX;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.UC(" + param0 + ')');
        }
    }

    final Weapon getWeapon(int param0) {
        RuntimeException var2 = null;
        Weapon stackIn_2_0 = null;
        Weapon stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -163585215) {
            stackIn_4_0 = this.weapon;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Weapon) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.R(" + param0 + ')');
        }
    }

    final boolean canPickUp(MiscItemBehaviour param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.getItemType((byte) -106);
          if (param1 < 69) {
            this.field_L = false;
          }
          if ((var3_int == 0 ||
            var3_int == 3) &&
            this.carried != null) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("hca.T(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 56) {
            this.placeInRoom((Room) null, -116, 25, false);
          }
          var4_int = 0;
          if (this.facingX > 0 &&
            param2 > 0 ||
            this.facingX < 0 &&
            0 > param2 ||
            this.facingY > 0 &&
            param1 > 0 ||
            this.facingY < 0 &&
            param1 < 0) {
            var4_int = 1;
          }
          this.carried.tryPush(80, false, var4_int, this.velocityY, this.velocityX, 0);
          if (this.x == this.previousX &&
            ~this.y == ~this.previousY) {
            this.a(this.velocityY, this.velocityX, (byte) -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.KB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final boolean isExpired(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18407) {
            this.velocityY = 52;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PA(" + param0 + ')');
        }
    }

    final boolean isHoldingItem(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 68 % ((-19 - param0) / 37);
          stackIn_4_0 = (this.heldItemKind != -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PE(" + param0 + ')');
        }
    }

    final void clearHeldItem(int param0) {
        try {
          this.setHeldItem(param0, (byte) -103, 65536, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.GB(" + param0 + ')');
        }
    }

    public final int getCollisionId(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = 2 + 2 * this.playerIndex;
            return stackIn_4_0;
          }
          stackIn_2_0 = -125;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.FD(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          this.savePreviousPosition((byte) 45);
          var6_int = this.x;
          var7 = this.y;
          var8 = 0;
          if (param2 < 0) {
            var8 = 1;
            this.x = this.x + param2;
          }
          if ((param2 >= 0 ||
            var10 != 0) &&
            param2 > 0) {
            var8 = 1;
            this.x = this.x + param2;
          }
          if (var8 == 0) {
            this.field_t = this.field_t - 1;
            if (var10 != 0) {
              var9 = this.a(false, 0, param4, param3, param2);
              if (2 == var9) {
                this.velocityX = 0;
                this.field_V = true;
                this.x = var6_int;
              }
              if (1 == var9) {
                this.field_kb = 5;
              }
              if (var9 == 0) {
                this.field_t = this.field_t - 1;
                this.field_t = 2;
              } else {
                this.field_t = 2;
              }
            }
          } else {
            var9 = this.a(false, 0, param4, param3, param2);
            if (2 == var9) {
              this.velocityX = 0;
              this.field_V = true;
              this.x = var6_int;
            }
            if (1 == var9) {
              this.field_kb = 5;
            }
            if (var9 == 0) {
              this.field_t = this.field_t - 1;
              if (var10 != 0) {
                this.field_t = 2;
              }
            } else {
              this.field_t = 2;
            }
          }
          var8Lifetime1 = 0;
          if (0 > param0) {
            var8Lifetime1 = 1;
            this.y = this.y + param0;
          }
          if ((0 <= param0 ||
            var10 != 0) &&
            param0 > 0) {
            this.y = this.y + param0;
            var8Lifetime1 = 1;
          }
          if (var8Lifetime1 != 0) {
            var9Lifetime1 = this.a(false, param0, param4, param3, 0);
            if (0 == var9Lifetime1) {
              this.field_h = this.field_h - 1;
            }
            if (0 != var9Lifetime1 ||
              var10 != 0) {
              this.field_h = 2;
            }
            if (var9Lifetime1 == 1) {
              this.field_kb = 5;
            }
            if (var9Lifetime1 == 2) {
              this.y = var7;
              this.velocityY = 0;
              this.field_V = true;
            }
          }
          if (var8Lifetime1 == 0 ||
            var10 != 0) {
            this.field_h = this.field_h - 1;
          }
          boolean decompiledSharedTail0 = !(this.x < (this.size / 2));
          if (!decompiledSharedTail0) {
            this.x = this.size / 2;
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.x > this.room.getWidth((byte) -86) - this.size / 2)) {
            this.x = this.room.getWidth((byte) -86) - this.size / 2;
          }
          if (param1 <= 126) {
            this.respawnX = -23;
          }
          if (this.y > (this.room.getHeight(-125) - this.size / 2)) {
            this.y = this.room.getHeight(-121) - this.size / 2;
          }
          this.v((byte) 74);
          this.field_t = za.$cfr$intArgs$a$c604db63f465(0, 36, 5, this.field_t);
          this.field_h = za.$cfr$intArgs$a$c604db63f465(0, 89, 5, this.field_h);
          if (param2 == 0 &&
            param0 == 0) {
            this.field_Y = 5;
          }
          if (param2 != 0 ||
            param0 != 0 || var10 != 0) {
            this.field_Y = this.field_Y - 1;
            if (this.field_Y < 0) {
              this.field_Y = 0;
            }
          }
          this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -86);
          this.room.collisionGrid.insert((Collidable) (this), 7073);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_3_0 = 1;
          stackIn_3_1 = 71;
          stackIn_3_2 = 4;
          if (this.field_t <= 0) {
            stackIn_4_3 = 0;
          } else {
            stackIn_4_3 = 2;
          }
          var5_int = za.$cfr$intArgs$a$c604db63f465(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_4_3 + 2 * this.field_Y);
          if (param1 <= 85) {
            this.field_L = false;
          }
          stackIn_10_0 = 1;
          stackIn_10_1 = 74;
          stackIn_10_2 = 4;
          if (this.field_h > 0) {
            stackIn_11_3 = 2;
          } else {
            stackIn_11_3 = 0;
          }
          var6 = za.$cfr$intArgs$a$c604db63f465(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_11_3 + 2 * this.field_Y);
          this.velocityX = gqa.a(param0, (byte) 24, param2) / var5_int;
          this.velocityY = gqa.a(param3, (byte) 24, param2) / var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "hca.FE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == param0.field_g) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!this.intersectsRect((byte) 110, param4, param2, param5, param1)) {
            stackIn_9_0 = 0;
            return stackIn_9_0;
          }
          if (param3 != 0) {
            this.b((byte) -11, 86, 56);
          }
          stackIn_14_0 = this.a(param0, -1);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("hca.WC(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int getY(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9648) {
            this.field_S = 6;
          }
          stackIn_4_0 = this.y;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RA(" + param0 + ')');
        }
    }

    final int getFacingY(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 123) {
            stackIn_4_0 = this.facingY;
            return stackIn_4_0;
          }
          stackIn_2_0 = -120;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CD(" + param0 + ')');
        }
    }

    final PlayerSimulation getSimulation(int param0) {
        RuntimeException var2 = null;
        PlayerSimulation stackIn_2_0 = null;
        PlayerSimulation stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = this.room.getSimulation(-1553494544);
            return stackIn_4_0;
          }
          stackIn_2_0 = (PlayerSimulation) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.OB(" + param0 + ')');
        }
    }

    final void a(int param0, uw param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -37 / ((-23 - param0) / 38);
          if (this.animator != null) {
            param1.a((byte) -82, 7, this.animator);
            this.animator.a(30355, this.room);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("hca.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void setTreasure(boolean param0, int param1, int param2) {
        try {
          this.treasure[param1] = param2;
          if (!param0) {
            this.animationStateTicks = 119;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.HE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final int applyProjectileEffect(Effect param0, Projectile param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -97) {
            this.tick(125, 118);
          }
          if (this == param0.field_g) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (this.statusFlags[2]) {
            stackIn_10_0 = 1;
            return stackIn_10_0;
          }
          var4_int = param1.i(-1);
          if (!this.intersectsRect((byte) 110, param1.getY(9648), param1.getX(3), var4_int, var4_int)) {
            stackIn_15_0 = 0;
            return stackIn_15_0;
          }
          if (!this.room.k((byte) 53) &&
            param0.type == 4) {
            this.velocityX = this.velocityX + param1.getVelocityX(-71) / 8;
            this.velocityY = this.velocityY + param1.getVelocityY(false) / 8;
          }
          stackIn_23_0 = this.a(param0, -1);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("hca.SD(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final int f(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.y;
            return stackIn_4_0;
          }
          stackIn_2_0 = -61;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SB(" + param0 + ')');
        }
    }

    Player(int param0) {
        this.size = 1572864;
        this.statusEffects = new IntrusiveDeque();
        this.statusFlags = new boolean[6];
        this.collectedTreasures = new IntrusiveDeque();
        this.field_N = 65536;
        this.treasure = new int[3];
        this.roomTreasure = new int[3];
        this.heldItemKind = -1;
        this.field_jb = new TeleportState();
        this.field_F = -1;
        this.collectedTreasure = false;
        this.field_cb = 0;
        this.elevation = 0;
        this.chosenReward = -1;
        this.animationStateTimer = 0;
        this.deathCountsByCause = new int[5];
        this.encodedDeathCount = 18202625;
        try {
          this.playerIndex = param0;
          this.respawn(-101, true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hca.<init>(" + param0 + ')');
        }
    }

    static {
        field_p = new fta();
        field_I = new IntrusiveDeque();
        loadingQuips = new String[]{"Banging drums", "Shooting rival", "Uncompressing orchestra", "Performing dramatic piece", "Plotting route to treasure", "Found mum's diary", "Found the Ark", "Escaping mountain fortress", "Ordering MacGuffin", "Getting bored of hieroglyphs...", "Ordering stair lift", "Filling pits with snakes", "Filling pits with lava", "Ordering fragile rope bridges", "Setting dart shooters to kill", "Disregarding historical research", "Pacifying volcano god", "Killing time", "Leaving idols in tomb"};
        field_s = "Bobby-George Totems";
    }
}
