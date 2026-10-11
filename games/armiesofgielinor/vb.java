/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends IntrusiveNode {
    eo field_u;
    int field_v;
    boolean field_z;
    private Battlefield field_k;
    int field_m;
    int field_x;
    private int field_p;
    private boolean field_s;
    boolean field_w;
    boolean field_n;
    static NodeDeque field_q;
    private GameplayController field_y;
    pa field_B;
    GameEvent field_r;
    static String field_l;
    static boolean[] field_o;
    static RgbSprite field_t;

    final boolean e(int param0) {
        MovementPlanner stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        int var2;
        TelefragEvent var3;
        int var3_int;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        if (0 != this.field_r.field_m) {
          if (this.field_r.field_m == 1) {
            this.field_z = true;
            this.field_B = (pa) ((Object) new sk(this.field_k, this.field_y.field_M, this));
            stackIn_135_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
            var2 = stackIn_135_0;
          } else {
            if (this.field_r.field_m == 6) {
              this.field_z = false;
              this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
              stackIn_131_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
              var2 = stackIn_131_0;
            } else {
              if (this.field_r.field_m != 21) {
                if (this.field_r.field_m != 26) {
                  if (this.field_r.field_m == 5) {
                    var3 = (TelefragEvent) (this.field_r);
                    if (var3.b(this.field_k, -75)) {
                      new DeathEvent(this.field_k.getUnitAt(var3.unit.tileY, true, var3.unit.tileX), true).a(this.field_y.field_pc, (byte) -86, this.field_y);
                    }
                    this.field_z = false;
                    this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                    stackIn_127_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                    var2 = stackIn_127_0;
                  } else {
                    if (this.field_r.field_m == 7) {
                      this.field_z = false;
                      this.field_B = (pa) ((Object) new qv(this.field_k, this.field_y.field_M, this));
                      stackIn_120_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                      var2 = stackIn_120_0;
                    } else {
                      if (10 == this.field_r.field_m) {
                        this.field_z = false;
                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                        stackIn_116_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                        var2 = stackIn_116_0;
                      } else {
                        if (this.field_r.field_m == 11) {
                          this.field_z = false;
                          this.field_r.applyToBattlefield(this.field_k, -26661);
                          this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                          stackIn_112_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                          var2 = stackIn_112_0;
                        } else {
                          if (this.field_r.field_m != 15) {
                            if (this.field_r.field_m != 14) {
                              if (12 != this.field_r.field_m) {
                                if (this.field_r.field_m != 16) {
                                  if (this.field_r.field_m == 17) {
                                    this.field_z = false;
                                    this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                                    stackIn_108_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                    var2 = stackIn_108_0;
                                  } else {
                                    if (this.field_r.field_m != 3) {
                                      if (18 == this.field_r.field_m) {
                                        this.field_z = false;
                                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                                        stackIn_104_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                        var2 = stackIn_104_0;
                                      } else {
                                        if (this.field_r.field_m != 20) {
                                          if (this.field_r.field_m != 19) {
                                            if (this.field_r.field_m != 2) {
                                              if (this.field_r.field_m == 25) {
                                                this.field_z = false;
                                                this.field_n = true;
                                                this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                                stackIn_100_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                                var2 = stackIn_100_0;
                                              } else {
                                                if (this.field_r.field_m != 23) {
                                                  if (this.field_r.field_m != 24) {
                                                    if (this.field_r.field_m == 27) {
                                                      this.field_z = false;
                                                      this.field_n = false;
                                                      var2 = 1;
                                                    }
                                                  } else {
                                                    this.field_z = true;
                                                    this.field_n = false;
                                                    this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                                    if (this.field_B.a(this.field_r, (byte) 57)) {
                                                      stackIn_94_0 = (-1 < this.field_y.field_q) ? 1 : 0;
                                                    } else {
                                                      stackIn_94_0 = 0;
                                                    }
                                                    var2 = stackIn_94_0;
                                                  }
                                                } else {
                                                  this.field_n = true;
                                                  this.field_z = false;
                                                  this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                                  stackIn_86_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                                  var2 = stackIn_86_0;
                                                }
                                              }
                                            } else {
                                              this.field_n = true;
                                              this.field_z = false;
                                              this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                              stackIn_80_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                              var2 = stackIn_80_0;
                                            }
                                          } else {
                                            this.field_n = true;
                                            this.field_z = false;
                                            this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                            stackIn_75_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                            var2 = stackIn_75_0;
                                          }
                                        } else {
                                          this.field_n = true;
                                          this.field_z = false;
                                          this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                                          stackIn_70_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                          var2 = stackIn_70_0;
                                        }
                                      }
                                    } else {
                                      this.field_z = false;
                                      this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                                      stackIn_64_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                      var2 = stackIn_64_0;
                                    }
                                  }
                                } else {
                                  this.field_z = false;
                                  this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                                  stackIn_58_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                  var2 = stackIn_58_0;
                                }
                              } else {
                                this.field_z = false;
                                this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                                stackIn_53_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                                var2 = stackIn_53_0;
                              }
                            } else {
                              this.field_z = false;
                              this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                              stackIn_48_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                              var2 = stackIn_48_0;
                            }
                          } else {
                            this.field_z = false;
                            this.field_r.applyToBattlefield(this.field_k, -26661);
                            this.field_n = true;
                            this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                            stackIn_43_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                            var2 = stackIn_43_0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.field_n = true;
                  this.field_z = false;
                  this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
                  stackIn_34_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                  var2 = stackIn_34_0;
                }
              } else {
                this.field_z = false;
                this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, this));
                stackIn_29_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
                var2 = stackIn_29_0;
              }
            }
          }
        } else {
          var3_int = ((MoveEvent) (this.field_r)).startX;
          var4 = ((MoveEvent) (this.field_r)).startY;
          if (var3_int < 0) {
            return false;
          }
          if (this.field_k.mapWidth <= var3_int) {
            return false;
          }
          if (0 > var4) {
            return false;
          }
          if (var4 >= this.field_k.mapHeight) {
            return false;
          }
          if (this.field_k.tiles[((MoveEvent) (this.field_r)).startX + ((MoveEvent) (this.field_r)).startY * this.field_k.mapWidth].occupant == null) {
            return false;
          }
          if (null != this.field_y.selectedUnit) {
            stackIn_17_0 = this.field_y.movementPlanner;
            stackIn_18_1 = (null != this.field_y.field_oc) ? false : true;
            ((MovementPlanner) (Object) stackIn_17_0).prepareForUnit(stackIn_18_1, param0 + 19769, this.field_y.field_q, this.field_y.selectedUnit, this.field_y.movementPlanner.field_y, this.field_y.movementPlanner.spellId);
          }
          this.field_B = (pa) ((Object) new qv(this.field_k, this.field_y.field_M, this));
          stackIn_22_0 = (!this.field_B.a(this.field_r, (byte) 57)) ? 0 : 1;
          var2 = stackIn_22_0;
        }
        if (var2 == 0) {
          this.field_r.c((byte) -71);
          this.field_s = true;
        }
        this.field_p = 0;
        if (param0 != -19702) {
          this.field_z = true;
        }
        return var2 != 0;
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_o = null;
        int var1 = -72 % ((param0 - 30) / 51);
        field_l = null;
    }

    final void a(int param0, int param1, boolean param2) {
        RgbSprite stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int[][] stackIn_14_3;
        int stackIn_15_4 = 0;
        int var4;
        int var5;
        if (this.field_n &&
          null != this.field_B) {
          if (param2) {
            this.field_B.a((byte) -52);
          } else {
            this.field_B.c((byte) -122);
          }
          return;
        }
        if (param2) {
          return;
        }
        if (null == this.field_r.unit) {
          return;
        }
        if (this.field_r.unit.field_x == null) {
          return;
        }
        var4 = -40 + this.field_r.unit.field_x.field_e[0];
        var5 = -20 + this.field_r.unit.field_x.field_e[1];
        stackIn_14_0 = TeamRoster.field_g;
        stackIn_14_1 = 10 + var4;
        stackIn_14_2 = var5 + 5;
        stackIn_14_3 = op.field_c;
        stackIn_15_4 = (this.field_k.teamGame) ? 1 : 0;
        ((RgbSprite) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2, stackIn_14_3[stackIn_15_4][this.field_r.unit.ownerPlayer]);
        if (param1 != 31785) {
          this.field_s = false;
        }
        if (this.field_y.selectedUnit == this.field_r.unit ||
          this.field_y.field_oc == this.field_r.unit) {
          TeamRoster.field_g.f(var4 + 10, 5 + var5, 128 + (int)(64.0 * Math.sin((double)param0 / 3.141592653589793)));
        }
        this.field_r.unit.field_x.a((byte) -72, false);
        return;
    }

    final boolean b(int param0, int param1, boolean param2) {
        int var4 = 0;
        if (24 != this.field_r.field_m) {
          this.field_n = true;
          this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
          var4 = ((ql) (this.field_B)).a(-98, param1, param0, this.field_r) ? 1 : 0;
        } else {
          this.field_z = false;
          this.field_n = true;
          this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, this));
          var4 = ((ql) (this.field_B)).a(-95, param1, param0, this.field_r) ? 1 : 0;
        }
        if (var4 == 0) {
          this.field_r.c((byte) -107);
          this.field_s = true;
        }
        if (!param2) {
          this.a(17, 99, true);
        }
        this.field_p = 0;
        return var4 != 0;
    }

    final boolean a(byte param0) {
        int var2 = -110 / ((27 - param0) / 35);
        if (this.field_B == null) {
          return false;
        }
        return this.field_B.b((byte) -91);
    }

    final void a(int param0) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_r.field_m != param0 &&
          null != this.field_B) {
          if (this.field_B.b(8865) &&
            !this.field_s) {
            this.field_r.c((byte) -118);
            this.field_s = true;
            this.field_B = null;
          } else {
            this.field_B.b(this.field_r, (byte) 23);
          }
        } else {
          if (!this.field_s) {
            this.field_s = true;
            this.field_r.c((byte) -64);
          }
        }
        this.field_p = this.field_p + 1;
        if (this.field_p >= 1000) {
          this.field_s = true;
          this.field_B = null;
          this.field_r.f(param0 + 7);
          oo.e(-387);
        }
    }

    vb(GameplayController param0, Battlefield param1, eo param2, GameEvent param3, boolean param4) {
        j discarded$0 = null;
        this.field_z = false;
        this.field_x = -1;
        try {
          this.field_k = param1;
          this.field_r = param3;
          this.field_u = param2;
          this.field_y = param0;
          discarded$0 = new j(240, param0.field_M);
          this.field_r.a(-97);
          this.field_p = 0;
          this.field_n = false;
          this.field_w = param4 ? true : false;
          this.field_s = false;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    vb(GameplayController param0, Battlefield param1, eo param2, GameEvent param3, int param4, int param5, boolean param6) {
        j discarded$0 = null;
        this.field_z = false;
        this.field_x = -1;
        try {
          this.field_r = param3;
          this.field_k = param1;
          this.field_u = param2;
          this.field_y = param0;
          discarded$0 = new j(240, param0.field_M);
          this.field_r.a(-97);
          this.field_n = false;
          this.field_w = param6 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = "You have not yet unlocked this option for use.";
        field_q = new NodeDeque();
    }
}
