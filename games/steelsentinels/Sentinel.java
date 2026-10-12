/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Sentinel extends IntrusiveNode {
    int field_Ab;
    int[] moduleTypes;
    int field_Yb;
    int field_S;
    int field_y;
    int field_Fc;
    int field_mb;
    int field_wb;
    boolean field_Cb;
    int field_Db;
    private int field_Bc;
    private pc field_qb;
    NodeDeque pendingCommands;
    private int field_cc;
    ArticulatedPart[] weaponParts;
    private Sentinel field_Ib;
    private Sentinel field_L;
    private int field_O;
    private int field_Y;
    int field_W;
    boolean field_gc;
    private int field_G;
    boolean field_V;
    int field_vb;
    private int field_lc;
    private boolean field_Cc;
    int field_kc;
    int charge;
    private int field_eb;
    private int field_tc;
    int maximumArmour;
    int activeModuleType;
    boolean field_xb;
    private int[] field_jb;
    boolean field_Lb;
    int field_F;
    int field_J;
    private int moduleCount;
    Sentinel field_Vb;
    int[] field_Mb;
    int field_Q;
    int field_oc;
    ArticulatedPart chassis;
    private int field_yb;
    private int field_zc;
    int field_Dc;
    private int[] field_uc;
    int field_lb;
    static String field_Ob;
    int field_pb;
    private boolean field_Jb;
    private int field_bb;
    int field_fb;
    int velocityX;
    ArticulatedPart[] animatedParts;
    private int field_H;
    int field_C;
    int field_Qb;
    int field_Pb;
    int field_E;
    private boolean field_M;
    int field_Rb;
    private int field_Wb;
    boolean field_Hb;
    int field_Nb;
    int field_P;
    int field_tb;
    int field_cb;
    int field_o;
    private int field_vc;
    int field_ob;
    private int field_Sb;
    int field_ic;
    private int field_X;
    int field_Fb;
    boolean field_u;
    int field_w;
    int worldX;
    int field_t;
    int maximumCharge;
    private int field_R;
    static String field_I;
    private boolean field_zb;
    int field_q;
    boolean field_pc;
    private int field_yc;
    CombatWorld world;
    int armour;
    static IndexedSprite[] field_nc;
    static String field_D;
    int field_sb;
    int field_v;
    private int field_ac;
    int field_z;
    int field_mc;
    private int field_wc;
    int field_Ub;
    int field_fc;
    private int field_A;
    boolean field_dc;
    NodeDeque secondaryCommands;
    boolean field_ib;
    int field_p;
    int field_kb;
    int teamId;
    static int field_bc;
    int worldY;
    int field_U;
    private int field_N;
    private boolean field_sc;
    int field_r;
    int field_db;
    int field_Ac;
    int field_ec;
    static int[] field_T;
    int velocityY;
    int field_qc;
    private pc field_Kb;
    int field_hb;
    int playerId;
    int[] field_Xb;
    int field_ub;

    private final void d(int param0, int param1) {
        String[] array$0 = null;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        String stackIn_153_0;
        int stackIn_153_1;
        String[] stackIn_153_2;
        String[] stackIn_153_3;
        int stackIn_153_4;
        String stackIn_154_5;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        Explosion var7_ref_jb;
        int var8_int;
        String var8;
        ne var8_ref;
        String var9;
        int var10;
        Projectile var11;
        Projectile var12;
        Projectile var13;
        String var14;
        String var15;
        int var7Lifetime1;
        int var8_intLifetime1;
        var10 = SteelSentinels.obfuscationControl;
        if (null != this.field_Kb) {
          la.a(false, this.field_Kb);
        }
        if (null != this.field_qb) {
          la.a(false, this.field_qb);
        }
        this.field_qb = null;
        this.field_pb = 0;
        this.field_t = 0;
        this.field_Kb = null;
        if (this.field_Nb == 0) {
          this.world.field_f = this.world.field_f - 5;
          this.world.field_N = this.world.field_N + 12;
        } else {
          this.world.field_a = this.world.field_a - 104411;
          this.world.field_q = this.world.field_q + (this.world.field_cb + 104412);
        }
        var3 = this.worldX;
        var4 = this.worldY;
        this.field_U = 0;
        this.field_tc = this.field_tc + 1;
        var5 = 0;
        if (this.hasModuleType(20, param1 ^ -2736)) {
          var13 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, this, 1000, 0, -2);
          var13.field_O = 1000;
          fc.a((byte) -82, 104, this.worldX);
          var13.a(250, 1500, 0, -110, 50);
          var13.a(5000, 5000, 2, param1 - 2839, 500);
          var13.a(5000, 2500, 3, param1 - 2840, 500);
          if (this.world.field_b == 0) {
            this.world.field_b = 1;
          }
          var7 = 0;
          if (this.activeModuleType == 20) {
            var7 = 1;
          }
          for (var8_int = 0; var8_int < this.moduleCount; var8_int++) {
            if (this.moduleTypes[var8_int] == 20 &&
              var7 == 0) {
              this.moduleTypes[var8_int] = -1;
              var7 = 1;
              this.field_wb = this.field_wb - 10;
            }
          }
        } else {
          if (param0 != 109) {
            if (!this.field_M) {
              var12 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, this.maximumArmour, 0, -1);
              var12.field_O = 0;
              var12.field_ob = this.field_u;
              var7_ref_jb = new Explosion(this.worldX, this.worldY, this.velocityX, this.velocityY, 20, this.world, var12.affectedSentinels, var12);
              var7_ref_jb.field_U = 1000;
              var7_ref_jb.field_G = 100;
              var7_ref_jb.field_K = 0;
              this.world.explosions.addLast(3, var7_ref_jb);
            }
          } else {
            var11 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, this.maximumArmour, 0, -3);
            var11.field_O = 0;
            var11.field_ob = this.field_u;
            var7_ref_jb = new Explosion(this.worldX, this.worldY, this.velocityX, this.velocityY, 20, this.world, var11.affectedSentinels, var11);
            var7_ref_jb.field_U = 1;
            var7_ref_jb.field_K = 0;
            var7_ref_jb.field_G = 1;
            this.world.explosions.addLast(3, var7_ref_jb);
          }
        }
        if (param1 != 2741) {
          return;
        }
        fc.a((byte) -85, 9, this.worldX);
        if (!this.world.field_lb) {
          if (di.field_g == 10) {
            if (ol.field_Ub == 3) {
              stackIn_42_0 = (ge.field_j > 0) ? 1 : 0;
            } else {
              stackIn_42_0 = 1;
            }
          } else {
            stackIn_42_0 = 0;
          }
        } else {
          stackIn_42_0 = 1;
        }
        var6 = stackIn_42_0;
        stackIn_45_0 = (150 >= this.world.field_R) ? 0 : 1;
        var7Lifetime1 = stackIn_45_0;
        if (this.world.terrain.getTerrainType(91) == 4) {
          stackIn_49_0 = ((1 << this.teamId + 4 & this.world.field_v) == 0) ? 0 : 1;
          var7Lifetime1 = stackIn_49_0;
        }
        if (this.world.field_M == -1) {
          var6 = 0;
        }
        boolean decompiledFrameRemainder1 = true;
        if (this.field_Nb != 0 && (11 != this.field_Nb ||
          param0 == 92)) {
          this.field_Hb = true;
          this.field_gc = true;
          if (((this.field_Nb == 11)) &&
            ((param0 == 92)) &&
            ((this.world.field_A == this.playerId))) {
            this.world.field_A = -10;
          }
          decompiledFrameRemainder1 = false;
        }
        else {
          if (var7Lifetime1 == 0 && (!this.field_V ||
            this.world.field_lb)) {
            if (var6 != 0 &&
              this.world.field_M <= 0) {
              var5 = 1;
              this.field_Hb = true;
            } else {
              this.field_A = 0;
              if (var6 != 0) {
                this.world.field_M = this.world.field_M - 1;
              }
              this.restoreArmour(-20039);
              this.refillCharge(5);
              this.field_Qb = 0;
              this.field_pc = true;
              this.field_mc = 0;
              this.field_ub = 0;
              this.field_S = this.field_Q;
              this.field_Dc = 0;
              this.field_oc = 0;
              this.j(-5);
              fc.a((byte) -123, 8, this.worldX);
              this.worldY = -320000;
              this.field_fc = this.worldY;
              this.velocityX = 0;
              this.velocityY = 1000;
              if ((this.world.terrain.getTerrainType(param1 ^ 2753) == 4)) {
                this.field_u = true;
                this.field_Lb = true;
                this.worldY = -(this.world.terrain.getGroundHeightAt((byte) -113, this.worldX >> 4) << 4) - 500;
                this.field_fc = this.worldY;
                this.field_z = 600;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            this.field_Hb = true;
          }
        }
        if (this.field_Ib != null ||
          this.field_sc ||
          this.field_M ||
          this.field_dc) {
          if (!this.world.field_lb &&
            !this.world.field_h &&
            di.field_g == -1 && (this.field_sc ||
            this.field_dc ||
            null != this.field_L &&
            !(this.field_L.playerId < 0) &&
            (!(this.world.computerPlayerCount + this.world.playerCount <= this.field_L.playerId) ||
            this.field_L == this.world.spawnedSpecialSentinel) &&
            (this.playerId >= 0 &&
            this.world.computerPlayerCount + this.world.playerCount > this.playerId ||
            this.world.spawnedSpecialSentinel == this))) {
            boolean decompiledFrameRemainder0 = true;
            var8 = "";
            if (!this.field_dc) {
              if (!this.field_sc) {
                if (this.field_L != this) {
                  if (this.field_yc > -1 &&
                    pe.field_D.length > this.field_yc) {
                    var8 = pe.field_D[this.field_yc];
                    if (this.field_Cc) {
                      var8 = ch.field_I;
                    }
                    if ((this.field_zb)) {
                      if (this.field_yc != 6 &&
                        this.field_yc != 34) {
                        if (this.field_yc != 2) {
                          var8 = ki.field_pb;
                        } else {
                          var8 = gl.field_r;
                        }
                      } else {
                        var8 = vm.field_o;
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (-1 == this.field_yc) {
                      if (this.field_Ib == this.field_L &&
                        !this.field_M) {
                        var8 = pf.field_r;
                      } else {
                        var8 = IntKeyLookup.field_k;
                      }
                    } else {
                      if (this.field_yc != -2) {
                        if (this.field_yc == -3) {
                          var8 = un.field_k[0];
                        } else {
                          if (this.field_yc != -4) {
                            if (-5 != this.field_yc) {
                              if (this.field_L != null) {
                                if (this.field_Ib == this.field_L) {
                                  var8 = NodeDeque.field_f;
                                } else {
                                  var8 = cc.field_Tb;
                                }
                              } else {
                                var8 = ob.field_s;
                              }
                            } else {
                              var8 = un.field_k[3];
                            }
                          } else {
                            if (this.field_Ib == this.field_L &&
                              !this.field_M) {
                              var8 = un.field_k[2];
                            } else {
                              var8 = un.field_k[1];
                            }
                          }
                        }
                      } else {
                        if (this.field_Ib == this.field_L &&
                          !this.field_M) {
                          var8 = lb.field_Vb;
                        } else {
                          var8 = re.field_ab;
                        }
                      }
                    }
                  }
                } else {
                  var8 = l.field_a;
                }
              } else {
                if (this.world.terrain.getTerrainType(118) != 4) {
                  var8 = vb.field_h;
                } else {
                  var8 = gm.field_d;
                }
              }
            } else {
              var8 = ac.field_Z;
            }
            if (var8.length() > 0 &&
              this.field_Ib != this.field_L &&
              !this.field_sc) {
              if (4 == this.world.terrain.getTerrainType(126)) {
                var8 = var8 + da.field_i;
              } else {
                var8 = var8 + vc.field_k;
              }
            } else {
              if (this.field_M) {
                if (0 == var8.length()) {
                  var8 = kf.field_v;
                } else {
                  var8 = var8 + PartInstruction.field_c;
                }
              } else {
                var8 = var8 + ".";
              }
            }
            array$0 = new String[2];
            stackIn_153_0 = var8;
            stackIn_153_1 = -54;
            stackIn_153_2 = array$0;
            stackIn_153_3 = array$0;
            stackIn_153_4 = 0;
            if (null == this.field_L) {
              stackIn_154_5 = il.field_d;
            } else {
              stackIn_154_5 = this.world.d(-1661904765, this.field_L.playerId);
            }
            stackIn_153_3[stackIn_153_4] = stackIn_154_5;
            stackIn_153_2[1] = this.world.d(-1661904765, this.playerId);
            var14 = db.a(stackIn_153_0, stackIn_153_1, stackIn_153_2);
            bl.a(35020, var14, (byte) 121);
            bc.a(var14, this.world, (byte) 100);
          }
          this.field_R = 0;
          this.field_yb = 0;
          if (this.field_Ib != null) {
            if (8 != this.field_Nb) {
              if (this.teamId == this.field_Ib.teamId) {
                if (this.field_Ib != this ||
                  !this.world.field_lb) {
                  this.field_Ib.field_vb = this.field_Ib.field_vb - 5000 * Math.min(this.world.field_l, 3);
                }
                this.field_N = -1;
                if (this.field_Ib == this.field_L) {
                  this.field_Ib.field_kb = this.field_Ib.field_kb + 1;
                }
              } else {
                if (this.field_L != null &&
                  this.field_L.teamId != this.teamId) {
                  if (this.field_Ib.field_Cb) {
                    this.field_Ib.field_eb = this.field_Ib.field_eb + 1;
                  }
                  if (this.field_Cb) {
                    this.field_Ib.field_Y = this.field_Ib.field_Y + 1;
                  }
                  if (param0 == 92) {
                    if (this.field_Nb != 0) {
                      this.world.field_n = this.field_Ib.playerId;
                    }
                    this.field_N = this.field_Ib.playerId;
                    if (this.field_Lb &&
                      25 >= this.field_Sb) {
                    }
                  } else {
                    this.field_N = this.field_Ib.playerId;
                    if (this.field_Lb &&
                      25 >= this.field_Sb) {
                    }
                  }
                  if (this.playerId == this.field_Ib.field_N &&
                    !this.field_Ib.field_pc) {
                  }
                  if (-3 >= this.field_ac &&
                    -5 <= this.field_ac) {
                    this.field_Ib.field_wc = this.field_Ib.field_wc + 1;
                  } else {
                    if (this.field_ac >= 0 &&
                      this.field_ac < t.field_d.length) {
                      var8_intLifetime1 = t.field_d[this.field_ac];
                      if (var8_intLifetime1 >= 0) {
                        var8_intLifetime1 = hk.a(false, var8_intLifetime1);
                        this.field_Ib.field_jb[var8_intLifetime1 - 12] = this.field_Ib.field_jb[var8_intLifetime1 - 12] + 1;
                      }
                    }
                  }
                  this.field_Ib.field_A = this.field_Ib.field_A + 1;
                  if (0 > this.world.field_B) {
                    this.world.field_B = this.field_Ib.playerId;
                  }
                  this.field_Ib.field_w = this.field_Ib.field_w + 1;
                  this.field_Ib.field_R = this.field_Ib.field_R + 1;
                  if (this.field_Ib.field_Bc < this.field_Ib.field_A) {
                    this.field_Ib.field_Bc = this.field_Ib.field_A;
                  }
                  this.field_Ib.field_yb = 250;
                  if (this.field_Nb != 8) {
                    this.field_L.b((this.field_lb + wb.a(500, this.activeModuleType)) * this.world.field_l, param1 ^ 27962);
                  }
                  if (this.field_lb / 4 < this.field_Ib.field_lb) {
                  }
                }
              }
            } else {
              if (this.world.field_fb &&
                108 == param0 &&
                null != this.field_Ib) {
                this.field_Ib.field_kc = this.field_Ib.field_kc + 1;
                this.field_Ib.b(5000 * this.world.field_l, 26511);
              }
            }
          }
        }
        if (!this.world.field_h &&
          this == this.world.spawnedSpecialSentinel &&
          -2 != ed.field_j) {
          var15 = jd.field_mb[this.world.simulationTick % jd.field_mb.length];
          var9 = dc.field_a + ": " + var15;
          bl.a(16776960, var9, (byte) -102);
          bc.a(var9, this.world, (byte) 100);
        }
        this.field_sc = false;
        this.field_dc = false;
        this.field_M = false;
        if (var5 != 0) {
          this.world.field_j = true;
          if (!this.world.field_h &&
            10 == di.field_g &&
            0 == ge.field_j &&
            this.world.field_M == 0) {
            mj.a(0, 0, 1200, ol.field_Ub, 0, 0, 0, (byte) -65);
          }
        }
        if (this.world.terrain.getTerrainType(param1 ^ 2763) == 2) {
          if (this.field_Cb) {
            this.field_hb = 43;
          } else {
            if (this.field_Nb == 0 &&
              this.world.field_lb) {
              this.field_hb = 36;
            }
          }
        } else {
          if (this.field_Nb == 0 &&
            this.world.field_lb) {
            this.field_hb = 36;
          }
        }
        if (this.field_hb != -1) {
          this.world.field_N = this.world.field_N + this.field_hb * 100;
          var8_ref = new ne(this.world, this.field_hb);
          var8_ref.field_z = var3;
          var8_ref.field_I = var4;
          this.world.field_e.addLast(3, var8_ref);
          this.field_hb = -1;
        }
        if (this.activeModuleType == 20) {
          nh.a(true, this);
        }
        this.field_yc = -1;
        this.field_Ib = null;
        this.field_L = null;
        this.field_Cb = false;
        this.field_ac = -1;
        return;
    }

    private final void a(SentinelCommand param0, int param1) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Projectile var4 = null;
        Explosion var5 = null;
        try {
          stackIn_3_0 = (param0.actionType != 11) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0 &&
            this.charge < 5) {
            return;
          }
          if (var3_int != 0 &&
            this.activeModuleType != 24) {
            return;
          }
          if (param1 != 10) {
            return;
          }
          if (var3_int != 0) {
            nh.a(true, this);
          }
          if (!param0.activated &&
            var3_int == 0) {
            return;
          }
          if (var3_int == 0) {
            this.consumeCharge(true, this.charge);
          }
          var4 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, this.maximumArmour, 0, -1);
          var4.field_O = 0;
          var4.field_ob = this.field_u;
          var5 = new Explosion(this.worldX, this.worldY, this.velocityX, this.velocityY, 20, this.world, var4.affectedSentinels, var4);
          var5.field_K = 0;
          var5.field_G = 50;
          var5.field_U = 500;
          this.world.explosions.addLast(param1 ^ 9, var5);
          this.field_Jb = true;
          this.j(-5);
          this.worldY = -500 - (this.world.terrain.getGroundHeightAt((byte) -98, this.worldX >> 4) << 4);
          param0.activated = false;
          this.field_U = 0;
          this.field_fc = this.worldY;
          this.field_F = -250;
          this.field_Lb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("mb.NA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final int addModuleBonuses(int baseCount, int moduleType) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        var3 = baseCount;
        if (this.activeModuleType != moduleType) {
          if (this.activeModuleType == 40 && (moduleType == 33 ||
            moduleType == 32)) {
            var3++;
          }
        } else {
          var3++;
        }
        for (var4 = 0; var4 < this.moduleCount; var4++) {
          if (this.moduleTypes[var4] != moduleType &&
            34 != this.moduleTypes[var4]) {
            continue;
          }
          var3++;
          break;
        }
        return var3;
    }

    final void reduceArmour(int obfuscationGuard, int amount) {
        this.armour = this.armour - amount;
        if (this.playerId == 0) {
          this.world.field_q = this.world.field_q - 128 * amount;
        }
        if (obfuscationGuard != 128) {
          this.field_uc = (int[]) null;
        }
    }

    final void a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        Sentinel var6 = null;
        Projectile var6_ref = null;
        int var7 = SteelSentinels.obfuscationControl;
        if (param0 != -65) {
          this.g(-111, 33);
        }
        fc.a((byte) -118, 44, -1);
        NodeIterator var8 = new NodeIterator(this.world.sentinels);
        int var3 = this.world.terrain.getProfileLength(-128) << 4;
        for (var4 = 8192; var4 < var3; var4 += 16384) {
          var5 = 0;
          var6 = (Sentinel) (var8.b(2));
          while (var6 != null) {
            if (~this.teamId == ~var6.teamId &&
              24576 > Math.abs(-var4 + var6.worldX)) {
              var5 = 1;
              break;
            }
            var6 = (Sentinel) (var8.d(2));
          }
          if (var5 == 0) {
            var6_ref = new Projectile(var4, -160000, 0, -200 - (var4 >> 1), 5000, 0, 2, this.world, this, 300, 250, 20);
            this.world.field_db.addLast(3, var6_ref);
          }
        }
    }

    final void b(byte param0, SentinelCommand param1) {
        int var6_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Projectile var5 = null;
        Explosion var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_Yb > 0) {
            return;
          }
          if (param0 != -31) {
            this.field_wb = -34;
          }
          if (this.charge < 1) {
            return;
          }
          var3_int = 25;
          var4 = 500 * this.charge;
          var5 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 2, 18, this.world, this, var3_int, 10, -6);
          var5.field_kb = var4;
          for (var6_int = 0; var6_int < var5.affectedSentinels.length; var6_int++) {
            if (var5.affectedSentinels[var6_int] == this) {
              var5.affectedSentinels[var6_int] = null;
            }
          }
          var6 = new Explosion(var5.worldX, var5.worldY, this.velocityX, this.velocityY, this.charge * 10, this.world, var5.affectedSentinels, var5);
          var6.field_U = 800 * this.charge;
          var6.field_G = 10 * this.charge;
          var6.field_K = 8;
          this.world.explosions.addLast(param0 ^ -30, var6);
          this.field_Yb = 8 * this.charge;
          if (this.field_Nb != 0) {
            this.field_Yb = 1000;
          }
          if (param1 == null) {
            return;
          }
          fc.a((byte) 43, 17, this.worldX);
          if (param1.activated) {
            var7 = this.charge;
            if (var7 > 0) {
              this.consumeCharge(true, var7);
              if (this.field_ub < 0) {
                this.field_ub = this.field_ub + 3000;
                this.consumeCharge(true, 1);
              }
            }
            param1.activated = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("mb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param6 > -89) {
          this.armour = -93;
        }
        return this.a(param1, param5, param4, param0, (byte) 125, false, param3, param2);
    }

    private final void executeCommand(boolean obfuscationGuard, SentinelCommand command, int simulationTick) {
        int stackIn_120_0 = 0;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        String stackIn_170_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Explosion var5 = null;
        Explosion var6 = null;
        int var7 = 0;
        Projectile var8 = null;
        Projectile var9 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (!obfuscationGuard) {
            return;
          }
          if (this.world.field_j &&
            this.world.field_fb &&
            this.field_Nb == 8) {
            if (simulationTick - 8 >= command.startTick) {
              return;
            }
            if (simulationTick < command.startTick) {
              return;
            }
            if (this.field_pc &&
              6 != command.actionType) {
              if (command.actionType != 3) {
                return;
              }
              if (this.field_Qb >= 0) {
                return;
              }
            }
            if (!command.scheduled) {
              return;
            }
            if (this.charge <= 0 &&
              this.field_ub < 0 &&
              command.activated) {
              return;
            }
            if (command.actionType != 3) {
              command.unlink(4);
            } else {
              if (this.field_Dc == 0 && (!this.field_Lb ||
                this.field_cb > 0 ||
                this.field_pc &&
                this.field_Fb > 0)) {
                if (!this.field_Lb) {
                  if (this.field_Fb < 5 &&
                    this.field_oc == 0) {
                    if (this.field_cb < 15) {
                      this.consumeCharge(obfuscationGuard, 1);
                    } else {
                      this.field_ub = this.field_ub - 45000 / this.field_cb;
                      if (this.field_ub < 0) {
                        this.field_ub = this.field_ub + 3000;
                        this.consumeCharge(obfuscationGuard, 1);
                      }
                    }
                  }
                } else {
                  if (this.field_pc &&
                    this.world.terrain.getTerrainType(94) != 4) {
                    var8 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, 0, 0, -1);
                    var5 = new Explosion(this.worldX, this.worldY - (this.field_Db << 3), 0, 0, 20, this.world, var8.affectedSentinels, var8);
                    var5.field_U = 1500;
                    var5.field_G = 100;
                    var5.field_K = 0;
                    this.world.explosions.addLast(3, var5);
                  }
                  if (this.field_cb < 15) {
                    this.consumeCharge(true, 1);
                  } else {
                    this.field_ub = this.field_ub - 45000 / this.field_cb;
                    if (this.field_ub < 0) {
                      this.field_ub = this.field_ub + 3000;
                      this.consumeCharge(obfuscationGuard, 1);
                    }
                  }
                }
                this.a(command, (byte) -106);
                if (3 == di.field_g &&
                  1 == qh.field_Yb &&
                  this.field_Lb) {
                  tj.field_c = 1;
                }
              }
            }
            if (simulationTick >= command.startTick) {
              command.unlink(4);
              return;
            }
            if (command.endTick > command.startTick) {
              return;
            }
            command.unlink(4);
            return;
          }
          if (command.startTick != simulationTick) {
            if (simulationTick > command.startTick) {
              command.unlink(4);
              return;
            }
          } else {
            if (command.actionType == 10) {
              this.field_V = true;
            }
            if (this.field_pc &&
              command.actionType != 6) {
              if (command.actionType != 3) {
                command.unlink(4);
                return;
              }
              if (this.field_Qb >= 0) {
                command.unlink(4);
                return;
              }
            }
            if (!command.scheduled) {
              command.unlink(4);
              return;
            }
            if (this.charge <= 0 &&
              0 > this.field_ub &&
              command.activated) {
              command.unlink(4);
              return;
            }
            if (command.actionType == 0 &&
              !this.field_pc) {
              this.field_F = -Math.abs(this.field_F);
              this.c((byte) 69, command);
              command.activated = false;
            } else {
              if (3 == command.actionType) {
                stackIn_120_0 = (!this.field_Lb) ? 0 : 1;
                var4_int = stackIn_120_0;
                if (this.field_Dc == 0 && (var4_int == 0 ||
                  this.field_cb > 0 ||
                  this.field_pc &&
                  0 < this.field_Fb)) {
                  if (this.field_Lb) {
                    if (this.field_pc &&
                      this.world.terrain.getTerrainType(115) != 4) {
                      var9 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, 0, 0, -1);
                      var6 = new Explosion(this.worldX, -(this.field_Db << 3) + this.worldY, 0, 0, 20, this.world, var9.affectedSentinels, var9);
                      var6.field_U = 1500;
                      var6.field_K = 0;
                      var6.field_G = 100;
                      this.world.explosions.addLast(3, var6);
                    }
                    if (this.field_cb != 0) {
                      if (this.field_cb < 15) {
                        this.consumeCharge(obfuscationGuard, 1);
                      } else {
                        this.field_ub = this.field_ub - 45000 / this.field_cb;
                        if (this.field_ub < 0) {
                          this.field_ub = this.field_ub + 3000;
                          this.consumeCharge(true, 1);
                        }
                      }
                    }
                  } else {
                    if (this.field_Fb < 5 &&
                      this.field_oc == 0 &&
                      this.field_cb != 0) {
                      if (15 <= this.field_cb) {
                        this.field_ub = this.field_ub - 45000 / this.field_cb;
                        if (this.field_ub < 0) {
                          this.field_ub = this.field_ub + 3000;
                          this.consumeCharge(true, 1);
                        }
                      } else {
                        this.consumeCharge(true, 1);
                      }
                    }
                  }
                  if (var4_int == 0 &&
                    command.startTick != command.endTick - 100 + ka.field_G[o.a((byte) 84, this.chassis.componentId)][25][2] &&
                    39 != this.activeModuleType) {
                    this.field_U = 0;
                    if (command.startTick == -100 + command.endTick) {
                      this.field_oc = 1;
                    }
                    command.startTick = command.startTick + 1;
                  } else {
                    this.a(command, (byte) -96);
                  }
                  if (di.field_g == 3 &&
                    qh.field_Yb == 1 &&
                    var4_int != 0) {
                    tj.field_c = 1;
                  }
                }
              } else {
                if (5 != command.actionType) {
                  if (command.actionType == 12) {
                    this.field_Vb = null;
                  } else {
                    if (command.actionType == 6) {
                      var4_int = this.field_U;
                      this.field_U = command.actionVariant;
                      if (this.field_U < 0 ||
                        1 < this.field_U) {
                        this.field_U = -1;
                      }
                      if (0 == di.field_g) {
                        if (1 == qh.field_Yb &&
                          this.field_U < 0) {
                          tj.field_c = 1;
                        }
                        if (qh.field_Yb == 2 &&
                          this.field_U > 0) {
                          tj.field_c = 1;
                        }
                        if (3 == qh.field_Yb &&
                          this.field_U == 0) {
                          tj.field_c = 1;
                        }
                      }
                      if (var4_int != this.field_U) {
                        this.field_Pb = 0;
                      }
                    } else {
                      if (command.actionType != 7) {
                        if (8 == command.actionType) {
                          this.field_F = -Math.abs(this.field_F);
                          this.b((byte) -31, command);
                          command.activated = false;
                        } else {
                          if (9 == command.actionType ||
                            command.actionType == 11) {
                            this.field_F = -Math.abs(this.field_F);
                            this.a(command, 10);
                            command.activated = false;
                          }
                        }
                      } else {
                        this.field_F = -Math.abs(this.field_F);
                        this.a((byte) 10, command);
                      }
                    }
                  }
                } else {
                  this.consumeCharge(obfuscationGuard, 1);
                  this.field_Vb = this.world.findSentinelForPlayer(command.actionVariant, -128);
                  if (null != this.field_Vb) {
                    this.field_ec = 1000;
                    if (!this.field_Vb.hasModuleType(18, -27)) {
                      if (ed.field_j == this.playerId) {
                        fc.a((byte) 122, 79, -1);
                      } else {
                        fc.a((byte) 64, 26, -1);
                      }
                    } else {
                      this.field_ec = 250;
                      if (this.playerId == ed.field_j) {
                        fc.a((byte) -101, 80, -1);
                      } else {
                        fc.a((byte) -126, 26, -1);
                      }
                    }
                  }
                }
              }
            }
            if (simulationTick >= command.startTick) {
              command.unlink(4);
              return;
            }
            if (command.startTick >= command.endTick) {
              command.unlink(4);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_169_0 = var4;
          stackIn_169_1 = new StringBuilder().append("mb.T(").append(obfuscationGuard).append(',');
          if (command == null) {
            stackIn_170_2 = "null";
          } else {
            stackIn_170_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_169_0), ((StringBuilder) (Object) stackIn_169_1).append(stackIn_170_2).append(',').append(simulationTick).append(')').toString());
        }
    }

    private final void c(byte param0, SentinelCommand param1) {
        int stackIn_4_0 = 0;
        boolean stackIn_22_1 = false;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_144_2 = 0;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_164_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ArticulatedPart[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          stackIn_4_0 = (param1.aimAngle > 0) ? 1 : -1;
          var3_int = stackIn_4_0;
          if (param0 < 61) {
            return;
          }
          if (this.chassis == null) {
            return;
          }
          var4 = this.field_Lb ? 1 : 0;
          if (param1.actionVariant == 8 &&
            !param1.activated) {
            this.field_Lb = false;
          }
          var5 = this.chassis.a(0, this, new ArticulatedPart[]{}, var3_int * param1.aimAngle, param1.actionVariant);
          if (var5.length > 0) {
            this.field_E = var3_int;
          }
          if (var5.length > 0 &&
            19 == param1.actionVariant) {
            this.field_y = 0;
          }
          stackIn_22_1 = (var4 != 0);
          this.field_Lb = stackIn_22_1;
          this.chassis.a(param1.aimAngle * this.field_E, -97, param1.actionVariant);
          this.chassis.b((byte) -128, this.worldX, this.field_E, this.field_fc);
          if (param1.activated) {
            var6 = 0;
            for (var7 = 0; var5.length > var7; var7++) {
              var8 = var5[var7].componentId - 17;
              if (var8 == 4) {
                var6 += 25;
                if (this.hasModuleType(25, -27)) {
                  var6 += 25;
                }
              }
              if (var8 == 17) {
                var6 += 50;
                if (this.hasModuleType(25, -27)) {
                  var6 += 50;
                }
              }
              if (var8 == 30) {
                var6 += 200;
                if (this.hasModuleType(25, -27)) {
                  var6 += 200;
                }
              }
              if (var8 == 5) {
                var6 += 50;
                if (this.hasModuleType(23, -27)) {
                  var6 -= 25;
                }
              }
              if (var8 == 18) {
                var6 += 100;
                if (this.hasModuleType(23, -27)) {
                  var6 -= 50;
                }
              }
              if (31 == var8) {
                var6 += 200;
                if (this.hasModuleType(23, -27)) {
                  var6 -= 100;
                }
              }
              if (var8 == 10) {
                var6 += 10;
              }
              if (21 == var8) {
                var6 += 20;
              }
              if (35 == var8) {
                var6 += 200;
              }
              if (var8 == 3) {
                var6 += 20;
              }
              if (var8 == 16) {
                var6 += 50;
              }
              if (var8 == 29) {
                var6 += 100;
              }
            }
            if (var6 > 0) {
              if (100 <= var6) {
                this.consumeCharge(true, var6 / 100);
                var6 = var6 % 100;
              }
              this.field_ub = this.field_ub - 30 * var6;
              if (this.field_ub < 0) {
                this.field_ub = this.field_ub + 3000;
                this.consumeCharge(true, 1);
              }
            }
            param1.activated = false;
          }
          var6Lifetime1 = 1;
          if (0 < var5.length) {
            var7Lifetime1 = -17 + var5[0].componentId;
            if (var7Lifetime1 == 0) {
              param1.startTick = param1.startTick + 10;
            }
            if (var7Lifetime1 == 1) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 4) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 10) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 11) {
              param1.startTick = param1.startTick + 10;
            }
            if (12 == var7Lifetime1) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 17) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 21) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 23) {
              param1.startTick = param1.startTick + 1;
            }
            if (var7Lifetime1 == 26) {
              param1.startTick = param1.startTick + 1;
            }
            if (30 == var7Lifetime1) {
              if (-50 + param1.endTick > param1.startTick &&
                -99 + param1.endTick == param1.startTick) {
                this.field_Kb = fc.a((byte) 120, 64, this.worldX);
              }
              param1.startTick = param1.startTick + 1;
            }
            if (35 == var7Lifetime1) {
              param1.startTick = param1.startTick + 1;
            }
            if (bi.b(-72, var7Lifetime1 + 17) &&
              this.field_Lb &&
              param1.activated &&
              !this.hasModuleType(31, -27)) {
              var6Lifetime1 = 0;
            }
          }
          this.field_O = 0;
          if (var6Lifetime1 != 0) {
            var7Lifetime2 = 0;
            while (var5.length > var7Lifetime2) {
              var8Lifetime1 = 1;
              if (21 == var5[var7Lifetime2].componentId &&
                param1.startTick > param1.endTick - 45) {
                var8Lifetime1 = 0;
              }
              if (var5[var7Lifetime2].componentId == 34 &&
                0 != (param1.startTick - param1.endTick) % 5) {
                var8Lifetime1 = 0;
              }
              if (var5[var7Lifetime2].componentId == 47 &&
                param1.endTick - 50 > param1.startTick) {
                var8Lifetime1 = 0;
              }
              if (var5[var7Lifetime2].componentId == 18 &&
                0 != param1.startTick % 5) {
                var8Lifetime1 = 0;
              }
              if (29 == var5[var7Lifetime2].componentId &&
                param1.startTick % 5 != 0) {
                var8Lifetime1 = 0;
              }
              if (var5[var7Lifetime2].componentId == 43) {
                stackIn_143_0 = 0;
                stackIn_143_1 = param1.startTick;
                if (!this.field_Lb) {
                  stackIn_144_2 = 2;
                } else {
                  stackIn_144_2 = 4;
                }
                if (stackIn_143_0 != stackIn_143_1 % stackIn_144_2) {
                  var8Lifetime1 = 0;
                }
              }
              if (var5[var7Lifetime2].componentId == 27 &&
                (3 & param1.startTick) != 0) {
                var8Lifetime1 = 0;
              }
              if (38 == var5[var7Lifetime2].componentId &&
                param1.endTick - 15 < param1.startTick) {
                var8Lifetime1 = 0;
              }
              if (var8Lifetime1 != 0 &&
                !this.a(param1, -126, var5[var7Lifetime2])) {
                var7Lifetime2 = var5.length;
              }
              var7Lifetime2++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_163_0 = var3;
          stackIn_163_1 = new StringBuilder().append("mb.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_164_2 = "null";
          } else {
            stackIn_164_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_163_0), ((StringBuilder) (Object) stackIn_163_1).append(stackIn_164_2).append(')').toString());
        }
    }

    final void advanceCombatState(int obfuscationGuard, int simulationTick) {
        int stackIn_130_0 = 0;
        int stackIn_264_0 = 0;
        int stackIn_270_0 = 0;
        int var3;
        ParticleEffect var3_ref_qb;
        int var4;
        ParticleEffect var4_ref_qb;
        int var5;
        ParticleEffect var5_ref_qb;
        double var5_double;
        int var6;
        ParticleEffect var6_ref_qb;
        int var7;
        ParticleEffect var7_ref_qb;
        double var7_double;
        int var8;
        ParticleEffect var9;
        int var10;
        ArticulatedPart var11;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        ParticleEffect var4_ref_qbLifetime1;
        ParticleEffect var4_ref_qbLifetime2;
        ParticleEffect var4_ref_qbLifetime3;
        ParticleEffect var7_ref_qbLifetime1;
        var10 = SteelSentinels.obfuscationControl;
        if (this.field_Rb > 0) {
          this.field_Rb = this.field_Rb - 1;
        }
        if (this.field_q <= 0) {
          if (this.field_q < 0) {
            this.field_q = this.field_q + 1;
          }
        } else {
          this.field_q = this.field_q + 1;
        }
        for (var3 = 0; this.field_Mb.length > var3; var3++) {
          if (this.field_Mb[var3] > 0) {
            this.field_Mb[var3] = this.field_Mb[var3] - 1;
          }
        }
        if (this.field_cc < this.field_y) {
          this.field_cc = this.field_y;
        }
        if (this.field_Dc > 0) {
          if (this.hasModuleType(29, -27)) {
            this.field_Dc = 0;
          } else {
            this.field_Dc = this.field_Dc - 1;
          }
        }
        this.field_pb = this.field_pb + 1;
        if (0 < this.field_bb &&
          !this.world.field_h) {
          this.field_bb = this.field_bb - 1;
          if (this.field_bb > 10) {
            var3_ref_qb = ArticulatedPart.a(1, this.field_X, this.world, 97, -(this.field_Db << 3) + this.worldY, this.field_u, this.field_bb / 2, this.field_lc, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var3_ref_qb);
          } else {
            var3_ref_qb = ArticulatedPart.a(0, this.field_X, this.world, 89, this.worldY - (this.field_Db << 3), this.field_u, 2 * this.field_bb + 25, this.field_lc, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var3_ref_qb);
          }
        }
        if (-120000 > this.worldY &&
          !this.field_pc &&
          this.velocityY < 0) {
          this.velocityY = this.velocityY * 15 / 16;
        }
        if (this.activeModuleType != -1) {
          if (this.activeModuleType == 38) {
            this.restoreArmour(obfuscationGuard - 20040);
          }
          if (this.activeModuleType == 37) {
            this.consumeCharge(true, -40 + this.charge);
          }
          if (this.field_v != 2147483647) {
            this.field_v = this.field_v - 1;
          }
          if (this.field_v <= 0) {
            nh.a(true, this);
          }
        }
        if (this.field_Yb > 0) {
          this.field_Yb = this.field_Yb - 1;
        }
        if (this.world.terrain.getTerrainType(125) == 4 &&
          this.field_Nb == 0 &&
          !this.world.field_j) {
          if (this.field_z > 0) {
            this.field_S = this.field_Q;
            this.field_z = this.field_z - 1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < 2; var3Lifetime1++) {
            var4 = this.world.terrain.spawnPositions[var3Lifetime1];
            var5 = -1080;
            var6 = 4800;
            var7 = (this.worldX >> 4) - var4;
            var8 = (this.worldY >> 4) - var5;
            if (Math.abs(var7) <= var6 &&
              Math.abs(var8) <= var6 &&
              var6 * var6 > var7 * var7 + var8 * var8) {
              if (this.teamId == var3Lifetime1) {
                if (0 == (1 << 4 + var3Lifetime1 & this.world.field_v)) {
                  if (this.field_Cb) {
                    this.field_Cb = false;
                    this.world.a(this.teamId, (byte) 59, this);
                  }
                } else {
                  if (var3Lifetime1 != this.teamId &&
                    (this.world.field_v & 1 << var3Lifetime1 + 4) == 0) {
                    this.field_Cb = true;
                  }
                }
              } else {
                if (var3Lifetime1 != this.teamId &&
                  (this.world.field_v & 1 << var3Lifetime1 + 4) == 0) {
                  this.field_Cb = true;
                }
              }
            }
          }
        }
        if (this.field_Nb == 0 &&
          3 == this.world.terrain.getTerrainType(obfuscationGuard ^ 70) &&
          !this.world.field_j &&
          !this.field_pc &&
          !this.field_Hb &&
          !this.field_V &&
          0 == (15 & this.world.simulationTick)) {
          var3Lifetime2 = this.world.terrain.getProfileLength(obfuscationGuard - 125) >> 1;
          var4Lifetime1 = 600;
          var5Lifetime1 = 5120;
          var6Lifetime1 = (this.worldX >> 4) - var3Lifetime2;
          var7Lifetime1 = -var4Lifetime1 + (this.worldY >> 4);
          if (var6Lifetime1 * var6Lifetime1 + var7Lifetime1 * var7Lifetime1 < var5Lifetime1 * var5Lifetime1) {
            var8Lifetime1 = Math.min(this.world.playerCount * 16, 100);
            this.field_Ab = this.field_Ab + var8Lifetime1;
            this.field_vb = this.field_vb + var8Lifetime1;
            this.field_Fc = Math.max(this.field_Fc, 14);
            this.field_vc = this.field_vc + 1;
            this.field_Cb = true;
          } else {
            this.field_Cb = false;
          }
        }
        if (this.field_Nb == 0 &&
          2 == this.world.terrain.getTerrainType(101) &&
          !this.world.field_j &&
          !this.field_pc &&
          !this.field_Hb &&
          !this.field_V &&
          (15 & this.world.simulationTick) == 0 &&
          this.field_Cb) {
          var3Lifetime3 = Math.min(16 * this.world.playerCount, 100);
          this.field_Ab = this.field_Ab + var3Lifetime3;
          this.field_vb = this.field_vb + var3Lifetime3;
          this.field_Fc = Math.max(this.field_Fc, 14);
          this.field_vc = this.field_vc + 1;
        }
        if (this.field_Nb == 0 &&
          4 == this.world.terrain.getTerrainType(114) &&
          !this.world.field_j &&
          !this.field_pc &&
          this.world.simulationTick % 15 == 0 &&
          this.field_Cb) {
          this.field_vc = this.field_vc + 1;
        }
        if (!this.world.field_h &&
          this.field_fb == 3 &&
          this.charge >= 10 &&
          !this.field_pc &&
          !this.field_Hb) {
          var11 = this.chassis.a(0, "Energy Blade");
          this.chassis.b((byte) -128, this.worldX, this.field_E, this.worldY);
          var4Lifetime2 = this.field_E * (jh.a(var11.rotation - 5000 >> 3, 4096) * 100 >> 16);
          var5Lifetime2 = 100 * -kg.a(var11.rotation - 5000 >> 3, (byte) -119) >> 16;
          var6Lifetime2 = 100;
          var7_ref_qb = ArticulatedPart.a(12, var4Lifetime2 * -500 / var6Lifetime2 + this.velocityX, this.world, 99, var11.field_V + var5Lifetime2 * -700 / var6Lifetime2 - 500 * (this.field_E * var4Lifetime2) / var6Lifetime2, this.field_u, 50, this.velocityY + var5Lifetime2 * -500 / var6Lifetime2, var11.field_T + var4Lifetime2 * -700 / var6Lifetime2 + var5Lifetime2 * (this.field_E * 500) / var6Lifetime2, var11.field_T);
          this.world.field_o.addLast(3, var7_ref_qb);
        }
        if (!this.hasModuleType(30, -27)) {
          if (this.field_F > 0) {
            this.field_F = Math.max(this.field_F - 3, 0);
          } else {
            if (0 > this.field_F) {
              this.field_F = Math.min(this.field_F + 3, 0);
            }
          }
        } else {
          if (this.field_mc > 0) {
            this.field_F = -Math.abs(this.field_F);
          }
          if (this.field_ub < 0) {
            this.field_F = -Math.abs(this.field_F);
          }
          if (this.field_P > 0) {
            this.field_F = -Math.abs(this.field_F);
          }
          if (this.field_F < 250) {
            this.field_F = this.field_F + 3;
            if (this.field_F > 250) {
              this.field_F = 250;
            }
          }
        }
        if (this.field_oc > 0) {
          this.field_oc = this.field_oc + 1;
          if (this.field_oc >= ka.field_G[o.a((byte) 84, this.chassis.componentId)][25][2]) {
            this.field_oc = 0;
          }
        }
        if ((7 & this.world.simulationTick) == 0) {
          stackIn_130_0 = (this.hasModuleType(17, -27)) ? 1 : 0;
        } else {
          stackIn_130_0 = 0;
        }
        var3Lifetime4 = stackIn_130_0;
        if (this.field_zc < this.field_p) {
          this.field_zc = this.field_p;
        }
        if (this.field_R > this.field_H) {
          this.field_H = this.field_R;
        }
        if (0 < this.field_yb) {
          this.field_yb = this.field_yb - 1;
          if (0 >= this.field_yb) {
            this.field_R = 0;
          }
        }
        if (!this.pendingCommands.f(7) &&
          ((SentinelCommand) (this.pendingCommands.first(13058))).startTick <= this.world.simulationTick + 25) {
          var3Lifetime4 = 0;
        }
        if (var3Lifetime4 != 0) {
          this.a(true);
        }
        if (null != this.field_Vb) {
          this.field_ec = this.field_ec - 1;
          if (this.field_ec <= 0 ||
            this.field_Vb.field_pc ||
            !(this.field_Vb.armour > 0)) {
            this.field_Vb = null;
          }
        }
        if (this.field_pc) {
          if ((this.world.terrain.getTerrainType(89) != 4 ||
            0 == (1 & this.world.simulationTick)) &&
            this.field_Qb >= 0) {
            this.field_Qb = this.field_Qb + 1;
          }
          if (this.playerId >= 0 &&
            this.world.playerCount > this.playerId) {
            var4Lifetime3 = this.worldX;
            if (this.playerId == ed.field_j) {
              var4Lifetime3 = -1;
            }
            if (1 == this.field_Qb) {
              fc.a((byte) -86, 71, var4Lifetime3);
            }
            if (this.field_Qb == 50) {
              fc.a((byte) -109, 72, var4Lifetime3);
            }
            if (this.field_Qb == 100) {
              fc.a((byte) -125, 73, var4Lifetime3);
            }
            if (this.field_Qb == 150) {
              fc.a((byte) -116, 74, var4Lifetime3);
            }
            if (this.field_Qb == 200) {
              fc.a((byte) -74, 75, var4Lifetime3);
            }
            if (250 == this.field_Qb) {
              fc.a((byte) 69, 76, var4Lifetime3);
            }
            if (this.field_Qb == 300) {
              fc.a((byte) 121, 4, this.worldX);
            }
          }
          if (Math.abs(this.field_Qb) < 250 &&
            !this.world.field_h &&
            this.world.terrain.getTerrainType(71) != 4) {
            var4_ref_qb = ArticulatedPart.a(1, -2000 + (int)(-256.0 + 512.0 * Math.random()), this.world, 124, 5000 + this.worldY, false, 50, -2000 + (int)(-Math.random() * 1024.0), this.worldX - 1000, this.worldX);
            this.world.field_O.addLast(3, var4_ref_qb);
            var4_ref_qbLifetime1 = ArticulatedPart.a(1, -1000 + (int)(512.0 * Math.random() - 256.0), this.world, obfuscationGuard ^ 109, 6000 + this.worldY, false, 50, -2000 + (int)(1024.0 * -Math.random()), this.worldX, this.worldX);
            this.world.field_O.addLast(3, var4_ref_qbLifetime1);
            var4_ref_qbLifetime2 = ArticulatedPart.a(1, (int)(512.0 * Math.random() - 256.0) + 1000, this.world, 101, this.worldY + 6000, false, 50, (int)(-Math.random() * 1024.0) - 2000, this.worldX, this.worldX);
            this.world.field_O.addLast(3, var4_ref_qbLifetime2);
            var4_ref_qbLifetime3 = ArticulatedPart.a(1, 2000 + (int)(-256.0 + 512.0 * Math.random()), this.world, 100, 5000 + this.worldY, false, 50, (int)(-Math.random() * 1024.0) - 2000, 1000 + this.worldX, this.worldX);
            this.world.field_O.addLast(obfuscationGuard + 2, var4_ref_qbLifetime3);
          }
        }
        if (this.field_Lb &&
          !this.field_pc &&
          !this.field_Hb) {
          this.field_Sb = this.field_Sb + 1;
          if (this.field_Wb < this.field_Sb) {
            this.field_Wb = this.field_Sb;
          }
        } else {
          this.field_Sb = 0;
        }
        if (this.field_Hb) {
          return;
        }
        if (this.field_Nb == 1 ||
          this.field_Nb == 3) {
          this.velocityX = 0;
        }
        var4Lifetime4 = this.worldX;
        if (!this.field_pc ||
          !(Math.abs(this.field_Qb) < 250)) {
          this.worldX = this.worldX + this.velocityX;
          this.worldY = this.worldY + this.velocityY;
        }
        if (this.field_pc &&
          this.velocityY < 0) {
          this.velocityY = 0;
        }
        if (this.charge < 0) {
          this.field_ub = -1500;
          var5Lifetime3 = 3000 * this.charge / (this.field_wb + 20);
          this.field_ub = this.field_ub + (2 + this.field_wb) * var5Lifetime3;
          this.consumeCharge(true, this.charge);
          this.field_qb = fc.a((byte) 39, 90, this.worldX);
          if (!this.world.field_h) {
            for (var6Lifetime3 = 0; var6Lifetime3 < 4; var6Lifetime3++) {
              var7_ref_qbLifetime1 = ArticulatedPart.a(0, (int)(-256.0 + Math.random() * 512.0), this.world, 110, this.worldY, this.field_u, 250, (int)(-Math.random() * 1024.0), this.worldX, this.worldX);
              this.world.field_O.addLast(3, var7_ref_qbLifetime1);
            }
          }
        }
        if (0 > this.field_ub &&
          !this.world.field_h &&
          (15 & this.world.simulationTick) == 0) {
          var5_ref_qb = ArticulatedPart.a(8, (int)(512.0 * Math.random() - 256.0), this.world, obfuscationGuard + 88, this.worldY, this.field_u, 250, (int)(-Math.random() * 1024.0), this.worldX, this.worldX);
          this.world.field_O.addLast(obfuscationGuard ^ 2, var5_ref_qb);
        }
        if (this.field_Dc > 0 &&
          !this.world.field_h) {
          var5_double = Math.random() * 6.283185307179586;
          var7_double = Math.random() * 1024.0;
          var9 = ArticulatedPart.a(8, (int)((double)this.velocityX + Math.sin(var5_double) * (2.0 * var7_double)), this.world, 104, this.worldY - 16 * this.field_Db, this.field_u, 250, (int)((double)this.velocityY + Math.cos(var5_double) * var7_double), this.worldX, this.worldX);
          this.world.field_O.addLast(3, var9);
        }
        boolean decompiledFrameRemainder1 = true;
        if (nn.field_c[0] != this.chassis.componentId) {
          if (this.field_pc) {
            if (this.world.terrain.getTerrainType(102) != 4) {
              var5Lifetime4 = (-this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4) - 50000;
              if (!this.world.field_h) {
                if (this.worldY > var5Lifetime4) {
                  var6_ref_qb = ArticulatedPart.a(1, (int)(-256.0 + 512.0 * Math.random()) + (int)(Math.cos((double)this.field_Qb * 0.2) * 1000.0), this.world, 104, this.worldY, this.field_u, 50, (int)(-Math.random() * 1024.0) + 5000, this.worldX, this.worldX);
                  this.world.field_O.addLast(3, var6_ref_qb);
                  var6_ref_qb = ArticulatedPart.a(1, (int)(-256.0 + Math.random() * 512.0) - (int)(Math.cos((double)this.field_Qb * 0.2) * 1000.0), this.world, 126, this.worldY, this.field_u, 50, 5000 + (int)(-Math.random() * 1024.0), this.worldX, this.worldX);
                  this.world.field_O.addLast(obfuscationGuard ^ 2, var6_ref_qb);
                } else {
                  var6_ref_qb = ArticulatedPart.a(0, (int)(Math.random() * 512.0 - 256.0) - (int)(Math.sin(0.2 * (double)this.field_Qb) * 500.0), this.world, 89, this.worldY, this.field_u, 250, (int)(-Math.random() * 1024.0), this.worldX, this.worldX);
                  this.world.field_O.addLast(obfuscationGuard + 2, var6_ref_qb);
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (this.worldY > var5Lifetime4 &&
                100 < this.velocityY) {
                this.velocityY = this.velocityY - 25;
                if (this.velocityY < 500) {
                  this.velocityY = 500;
                }
                if (this.field_Qb > 0) {
                  this.field_Qb = -this.field_Qb;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.e((byte) 13);
                  if (!(this.field_Fc <= 0)) {
                    this.field_Fc = this.field_Fc - 1;
                    if ((this.field_Fc == 0)) {
                      this.field_Ab = 0;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                if (this.worldY <= var5Lifetime4) {
                  this.e((byte) 13);
                  if (!(this.field_Fc <= 0)) {
                    this.field_Fc = this.field_Fc - 1;
                    if ((this.field_Fc == 0)) {
                      this.field_Ab = 0;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (this.field_Qb <= 0) {
                    this.e((byte) 13);
                    if (!(this.field_Fc <= 0)) {
                      this.field_Fc = this.field_Fc - 1;
                      if ((this.field_Fc == 0)) {
                        this.field_Ab = 0;
                      }
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    this.field_Qb = -this.field_Qb;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                this.e((byte) 13);
                if (this.field_Fc > 0) {
                  this.field_Fc = this.field_Fc - 1;
                  if (this.field_Fc == 0) {
                    this.field_Ab = 0;
                  }
                }
              }
            } else {
              this.e((byte) 13);
              if (this.field_Fc > 0) {
                this.field_Fc = this.field_Fc - 1;
                if (this.field_Fc == 0) {
                  this.field_Ab = 0;
                }
              }
            }
          } else {
            this.e((byte) 13);
            if (this.field_Fc > 0) {
              this.field_Fc = this.field_Fc - 1;
              if (this.field_Fc == 0) {
                this.field_Ab = 0;
              }
            }
          }
        } else {
          this.e((byte) 13);
          if (this.field_Fc > 0) {
            this.field_Fc = this.field_Fc - 1;
            if (this.field_Fc == 0) {
              this.field_Ab = 0;
            }
          }
        }
        stackIn_264_0 = (!this.hasModuleType(35, obfuscationGuard ^ -28)) ? 0 : 1;
        var5Lifetime5 = stackIn_264_0;
        if (var5Lifetime5 == 0) {
          stackIn_270_0 = (this.hasModuleType(22, -27)) ? 1 : 0;
        } else {
          stackIn_270_0 = 1;
        }
        var6Lifetime4 = stackIn_270_0;
        for (var7Lifetime2 = 0; this.weaponParts.length > var7Lifetime2; var7Lifetime2++) {
          this.weaponParts[var7Lifetime2].a((byte) -37, var6Lifetime4 != 0, var5Lifetime5 != 0);
        }
        this.field_Jb = false;
        this.advanceCommandQueues((byte) 75, simulationTick);
        var5Lifetime6 = this.chassis.componentId;
        if (this.chassis != null) {
          this.g(-18, var5Lifetime6);
        }
        if (this.field_Jb) {
          var4Lifetime4 = this.worldX;
        }
        this.a(0, var4Lifetime4);
        if ((this.field_z > 0 ||
          this.activeModuleType == 38 ||
          this.field_pc &&
          var5Lifetime6 != 109) && !this.field_M) {
          this.restoreArmour(-20039);
        }
        if (obfuscationGuard == di.field_g &&
          qh.field_Yb == 13 &&
          this.field_Nb == 9 &&
          tj.field_c < 2 &&
          this.maximumArmour > this.armour) {
          tj.field_c = 2;
        }
        if (this.armour <= 0 &&
          -1 != this.field_Qb) {
          this.clearArmour(obfuscationGuard + 127);
          this.d(var5Lifetime6, obfuscationGuard ^ 2740);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        if (this.field_Hb) {
          return false;
        }
        int var5 = (this.field_Vb.worldX * param1 >> 16) + param0;
        int var6 = (param1 * (this.field_Vb.worldY - this.field_Vb.field_Db * 12) >> 16) + param3;
        int var7 = (this.field_Vb.field_Db + 128) * param1 >> 13;
        double var8 = Math.sin(3.141592653589793 * (double)(2 * this.world.simulationTick) / 50.0) * 4.0;
        String var10 = Integer.toString((this.field_ec + 49) / 50);
        int var11 = fk.field_d.c(var10);
        SoftwareRaster.c(-1 + (var5 - var11 / 2), -4 + var6, 2 + var11, 8, 0, 100);
        if (param2 != 23859) {
          return false;
        }
        fk.field_d.a(var10, var5, var6 + 4, 16711680, -1);
        var7 = var7 + (int)var8;
        dl.a(-var7 + var6, var5 - 5, 5 + var5, true, 16711680, -var7 + var6, var6 - var7 + 5, var5);
        dl.a(5 + var6, var5 - var7, var5 - var7, true, 16711680, -5 + var6, var6, var5 - var7 + 5);
        dl.a(var7 + var6, -5 + var5, var5 + 5, true, 16711680, var6 + var7, -5 + (var7 + var6), var5);
        dl.a(var6 + 5, var5 + var7, var5 + var7, true, 16711680, -5 + var6, var6, -5 + (var5 + var7));
        return false;
    }

    final void configureDesign(int[] design, boolean obfuscationGuard, boolean alternateConfiguration, int playerId, int teamId) {
        int var6_int = 0;
        SentinelCommand var7 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!obfuscationGuard) {
            var7 = (SentinelCommand) null;
            this.a((SentinelCommand) null, (byte) -56);
          }
          this.playerId = playerId;
          if (this.playerId == -1) {
            this.playerId = this.world.d(-3905);
          }
          this.moduleTypes = new int[8];
          this.field_uc = design;
          this.teamId = teamId;
          ii.a(this.field_uc, this.field_uc.length - 8, this.moduleTypes, 0, 8);
          this.chassis = hj.a(-24809, alternateConfiguration, this.moduleTypes, this.field_uc);
          kc.a(this.field_uc, this.moduleTypes, 2);
          if (null == this.chassis) {
            this.weaponParts = new ArticulatedPart[]{};
            this.field_Db = 64;
            this.field_Ub = 64;
            this.animatedParts = null;
            this.field_lb = 0;
            this.maximumArmour = 500;
          } else {
            this.maximumCharge = sl.a(this.chassis, this.moduleTypes, -7);
            this.field_wb = ef.a(this.chassis, 12258, this.moduleTypes);
            this.field_Q = bh.a(this.moduleTypes, 10, this.chassis);
            this.maximumArmour = this.chassis.getTotalArmour(8192);
            this.moduleCount = this.chassis.i(-128);
            var6_int = this.hasModuleType(34, -27) ? 1 : 0;
            if (this.hasModuleType(34, -27)) {
              if (this.field_ib) {
                this.field_ic = 131585;
              }
              this.maximumArmour = this.maximumArmour * 2;
            }
            this.field_lb = hm.a((byte) 127, this.moduleTypes, this.chassis);
            if (this.world.field_eb < this.field_lb && (!this.world.field_lb ||
              this.teamId == 0) && this.playerId < this.world.playerCount + this.world.computerPlayerCount) {
              this.world.field_eb = this.field_lb;
            }
            if (this.world.field_s < this.maximumArmour) {
              this.world.field_s = this.maximumArmour;
            }
            if (var6_int != 0) {
              if (this.field_ib) {
                this.field_ic = 131585;
              }
              this.maximumArmour = this.maximumArmour * 2;
              this.field_lb = this.field_lb * 4;
            }
            this.field_Fb = (int)((double)this.chassis.h(-31496) / Math.sqrt((double)this.chassis.getTotalArmour(8192)));
            this.field_cb = (int)((double)this.chassis.j(0) / Math.sqrt((double)this.chassis.getTotalArmour(8192)));
            if (this.field_Fb < 0) {
              this.field_Fb = 0;
            }
            if (this.field_cb < 0) {
              this.field_cb = 0;
            }
            if (this.hasModuleType(28, -27)) {
              this.field_Fb = this.field_Fb * 2;
            }
            if (this.hasModuleType(29, -27)) {
              this.field_cb = this.field_cb * 2;
            }
            if (null != this.chassis.a(59, (byte) -120)) {
              this.field_Fb = this.field_Fb + 5;
            }
            if (20 < this.field_Fb) {
              this.field_Fb = 20;
            }
            this.chassis.a(0, 0, 0, 0);
            this.field_Xb = this.chassis.c((byte) 125);
            this.field_Mb = new int[this.field_Xb.length];
            this.weaponParts = this.chassis.k(-123);
            hj.field_w = 4096;
            nj.field_V = 0;
            ti.field_y = 0;
            en.field_d = 0;
            lh.field_t = 0;
            this.chassis.a(0, false, 0, 0, (byte) 49, 0);
            this.field_fb = 0;
            this.field_Db = (-ti.field_y + lh.field_t) * 2;
            this.field_Ub = (en.field_d - nj.field_V) * 2;
            if (null != this.chassis.a(66, (byte) -47)) {
              this.field_fb = 1;
            }
            if (null != this.chassis.a(76, (byte) -38)) {
              this.field_fb = 2;
            }
            if (null != this.chassis.a(89, (byte) -124)) {
              this.field_fb = 3;
            }
            this.animatedParts = null;
            if (this.chassis.componentId == 0) {
              this.animatedParts = new ArticulatedPart[3];
              this.animatedParts[0] = this.chassis.a(0, "A");
              this.animatedParts[1] = this.chassis.a(0, "B");
              this.animatedParts[2] = this.chassis.a(0, "Golem Chassis");
            }
            if (55 == this.chassis.componentId) {
              this.animatedParts = new ArticulatedPart[11];
              this.animatedParts[0] = this.chassis.a(0, "Front0Leg");
              this.animatedParts[1] = this.chassis.a(0, "Front1Leg");
              this.animatedParts[2] = this.chassis.a(0, "Front2Leg");
              this.animatedParts[3] = this.chassis.a(0, "Front3Leg");
              this.animatedParts[4] = this.chassis.a(0, "Front4Leg");
              this.animatedParts[5] = this.chassis.a(0, "Back0Leg");
              this.animatedParts[6] = this.chassis.a(0, "Back1Leg");
              this.animatedParts[7] = this.chassis.a(0, "Back2Leg");
              this.animatedParts[8] = this.chassis.a(0, "Back3Leg");
              this.animatedParts[9] = this.chassis.a(0, "Back4Leg");
              this.animatedParts[10] = this.chassis.a(0, "Slave Chassis");
            }
            if (this.chassis.componentId == 57) {
              this.animatedParts = new ArticulatedPart[6];
              this.animatedParts[0] = this.chassis.a(0, "Aghilla Chassis");
              this.animatedParts[1] = this.chassis.a(0, "Torso");
              this.animatedParts[2] = this.chassis.a(0, "Front0Leg");
              this.animatedParts[3] = this.chassis.a(0, "Front1Leg");
              this.animatedParts[4] = this.chassis.a(0, "Back0Leg");
              this.animatedParts[5] = this.chassis.a(0, "Back1Leg");
            }
            if (62 == this.chassis.componentId) {
              this.animatedParts = new ArticulatedPart[19];
              this.animatedParts[0] = this.chassis.a(0, "F0");
              this.animatedParts[1] = this.chassis.a(0, "F1");
              this.animatedParts[2] = this.chassis.a(0, "F2");
              this.animatedParts[3] = this.chassis.a(0, "F3");
              this.animatedParts[4] = this.chassis.a(0, "F4");
              this.animatedParts[5] = this.chassis.a(0, "B0");
              this.animatedParts[6] = this.chassis.a(0, "B1");
              this.animatedParts[7] = this.chassis.a(0, "B2");
              this.animatedParts[8] = this.chassis.a(0, "B3");
              this.animatedParts[9] = this.chassis.a(0, "B4");
              this.animatedParts[10] = this.chassis.a(0, "2F1");
              this.animatedParts[11] = this.chassis.a(0, "2F2");
              this.animatedParts[12] = this.chassis.a(0, "2F3");
              this.animatedParts[13] = this.chassis.a(0, "2F4");
              this.animatedParts[14] = this.chassis.a(0, "2B1");
              this.animatedParts[15] = this.chassis.a(0, "2B2");
              this.animatedParts[16] = this.chassis.a(0, "2B3");
              this.animatedParts[17] = this.chassis.a(0, "2B4");
              this.animatedParts[18] = this.chassis.a(0, "Turtle Chassis");
            }
            if (72 == this.chassis.componentId) {
              this.animatedParts = new ArticulatedPart[11];
              this.animatedParts[0] = this.chassis.a(0, "SA");
              this.animatedParts[1] = this.chassis.a(0, "LA");
              this.animatedParts[2] = this.chassis.a(0, "BA");
              this.animatedParts[3] = this.chassis.a(0, "SC");
              this.animatedParts[4] = this.chassis.a(0, "PC");
              this.animatedParts[5] = this.chassis.a(0, "LC");
              this.animatedParts[6] = this.chassis.a(0, "BC");
              this.animatedParts[7] = this.chassis.a(0, "SD");
              this.animatedParts[8] = this.chassis.a(0, "LD");
              this.animatedParts[9] = this.chassis.a(0, "BD");
              this.animatedParts[10] = this.chassis.a(0, "Scorpion Chassis");
            }
            if (this.chassis.componentId == 69) {
              this.animatedParts = new ArticulatedPart[14];
              this.animatedParts[0] = this.chassis.a(0, "Hurricane Chassis");
              this.animatedParts[1] = this.chassis.a(0, "F0");
              this.animatedParts[2] = this.chassis.a(0, "F1");
              this.animatedParts[3] = this.chassis.a(0, "F2");
              this.animatedParts[4] = this.chassis.a(0, "MB0");
              this.animatedParts[5] = this.chassis.a(0, "MB1");
              this.animatedParts[6] = this.chassis.a(0, "MB2");
              this.animatedParts[7] = this.chassis.a(0, "MF0");
              this.animatedParts[8] = this.chassis.a(0, "MF1");
              this.animatedParts[9] = this.chassis.a(0, "MF2");
              this.animatedParts[10] = this.chassis.a(0, "B0");
              this.animatedParts[11] = this.chassis.a(0, "B1");
              this.animatedParts[12] = this.chassis.a(0, "B2");
              this.animatedParts[13] = this.chassis.a(0, "TopChassis");
            }
            if (this.chassis.componentId == 65) {
              this.animatedParts = new ArticulatedPart[7];
              this.animatedParts[0] = this.chassis.a(0, "Front0Leg");
              this.animatedParts[1] = this.chassis.a(0, "Front1Leg");
              this.animatedParts[2] = this.chassis.a(0, "FrontFoot");
              this.animatedParts[3] = this.chassis.a(0, "Back0Leg");
              this.animatedParts[4] = this.chassis.a(0, "Back1Leg");
              this.animatedParts[5] = this.chassis.a(0, "BackFoot");
              this.animatedParts[6] = this.chassis.a(0, "Commando Chassis");
            }
            if (this.chassis.componentId == 88) {
              this.animatedParts = new ArticulatedPart[12];
              this.animatedParts[0] = this.chassis.a(0, "Front0Leg");
              this.animatedParts[1] = this.chassis.a(0, "Front1Leg");
              this.animatedParts[2] = this.chassis.a(0, "Front2Leg");
              this.animatedParts[3] = this.chassis.a(0, "Front3Leg");
              this.animatedParts[4] = this.chassis.a(0, "Front4Leg");
              this.animatedParts[5] = this.chassis.a(0, "Back0Leg");
              this.animatedParts[6] = this.chassis.a(0, "Back1Leg");
              this.animatedParts[7] = this.chassis.a(0, "Back2Leg");
              this.animatedParts[8] = this.chassis.a(0, "Back3Leg");
              this.animatedParts[9] = this.chassis.a(0, "Back4Leg");
              this.animatedParts[10] = this.chassis.a(0, "Valhalla Chassis");
              this.animatedParts[11] = this.chassis.a(0, "TopChassis");
            }
            if (this.chassis.componentId == 75) {
              this.animatedParts = new ArticulatedPart[11];
              this.animatedParts[1] = this.chassis.a(0, "C1");
              this.animatedParts[2] = this.chassis.a(0, "C2");
              this.animatedParts[3] = this.chassis.a(0, "C3");
              this.animatedParts[4] = this.chassis.a(0, "C4");
              this.animatedParts[5] = this.chassis.a(0, "C5");
              this.animatedParts[6] = this.chassis.a(0, "C6");
              this.animatedParts[7] = this.chassis.a(0, "C7");
              this.animatedParts[8] = this.chassis.a(0, "C8");
              this.animatedParts[9] = this.chassis.a(0, "C9");
              this.animatedParts[10] = this.chassis.a(0, "C10");
              this.animatedParts[0] = this.chassis.a(0, "Crusher Chassis");
            }
            if (this.chassis.componentId == 79) {
              this.animatedParts = new ArticulatedPart[2];
              this.animatedParts[0] = this.chassis.a(0, "A");
              this.animatedParts[1] = this.chassis.a(0, "Bertha Chassis");
            }
            if (this.chassis.componentId == 84) {
              this.animatedParts = new ArticulatedPart[6];
              this.animatedParts[0] = this.chassis.a(0, "A");
              this.animatedParts[1] = this.chassis.a(0, "B");
              this.animatedParts[2] = this.chassis.a(0, "C");
              this.animatedParts[3] = this.chassis.a(0, "D");
              this.animatedParts[4] = this.chassis.a(0, "E");
              this.animatedParts[5] = this.chassis.a(0, "F");
            }
            if (this.chassis.componentId == 92) {
              this.animatedParts = new ArticulatedPart[13];
              this.animatedParts[1] = this.chassis.a(0, "B1");
              this.animatedParts[2] = this.chassis.a(0, "B2");
              this.animatedParts[3] = this.chassis.a(0, "B3");
              this.animatedParts[4] = this.chassis.a(0, "B4");
              this.animatedParts[5] = this.chassis.a(0, "B5");
              this.animatedParts[6] = this.chassis.a(0, "B6");
              this.animatedParts[7] = this.chassis.a(0, "B7");
              this.animatedParts[8] = this.chassis.a(0, "B8");
              this.animatedParts[9] = this.chassis.a(0, "B9");
              this.animatedParts[10] = this.chassis.a(0, "B10");
              this.animatedParts[11] = this.chassis.a(0, "B11");
              this.animatedParts[12] = this.chassis.a(0, "B12");
              this.animatedParts[0] = this.chassis.a(0, "Babel Chassis");
            }
          }
          this.refillCharge(5);
          this.field_S = this.field_Q;
          this.restoreArmour(-20039);
          this.field_G = this.armour;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_83_0 = var6;
          stackIn_83_1 = new StringBuilder().append("mb.DA(");
          if (design == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(obfuscationGuard).append(',').append(alternateConfiguration).append(',').append(playerId).append(',').append(teamId).append(')').toString());
        }
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -120) {
          return true;
        }
        stackIn_6_0 = (this.field_z <= 0) && (!this.hasModuleType(27, -27));
        return stackIn_6_0;
    }

    private final boolean a(SentinelCommand param0, int param1, ArticulatedPart param2) {
        int var25 = 0;
        int stackIn_205_0;
        int stackIn_205_1;
        CombatWorld stackIn_205_2;
        int stackIn_205_3;
        int stackIn_205_4;
        boolean stackIn_205_5;
        int stackIn_206_6 = 0;
        Projectile stackIn_244_0 = null;
        Sentinel stackIn_245_1 = null;
        int stackIn_249_0 = 0;
        RuntimeException stackIn_252_0 = null;
        StringBuilder stackIn_252_1 = null;
        String stackIn_253_2 = null;
        StringBuilder stackIn_255_1 = null;
        String stackIn_256_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8_double = 0.0;
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
        int var21_int = 0;
        Projectile var21 = null;
        int var22 = 0;
        int var23 = 0;
        ParticleEffect var24 = null;
        int var26 = 0;
        int var27 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var21_intLifetime1;
        int var22Lifetime1;
        int var22Lifetime2;
        var27 = SteelSentinels.obfuscationControl;
        try {
          if (di.field_g == 1 &&
            qh.field_Yb == 11) {
            tj.field_c = tj.field_c + 1;
          }
          var4_int = 1;
          var5 = 2;
          if ((param2.componentId == 18 ||
            29 == param2.componentId ||
            43 == param2.componentId ||
            param2.componentId == 21 ||
            param2.componentId == 34 ||
            param2.componentId == 47 ||
            param2.componentId == 52) && null != this.field_Vb) {
            param0.targetWorldX = this.field_Vb.worldX;
            param0.targetWorldY = this.field_Vb.worldY - (this.field_Vb.field_Db << 3);
            var6 = param0.targetWorldX - this.worldX;
            if (0 <= var6) {
              this.field_E = 1;
            } else {
              this.field_E = -1;
            }
            var7 = param0.targetWorldY - param2.field_V;
            if (this.field_E != this.field_U) {
              this.field_U = 0;
            }
            var8_double = Math.atan2((double)var6, (double)(-var7));
            param0.aimAngle = (int)(65536.0 * var8_double / 6.283185307179586);
            if (this.field_E < 0) {
              if (param0.aimAngle > 16384) {
                param0.aimAngle = param0.aimAngle - 65536;
              }
            } else {
              if (param0.aimAngle < -16384) {
                param0.aimAngle = param0.aimAngle + 65536;
              }
            }
            if (param2.field_K > this.field_E * param0.aimAngle) {
              param0.aimAngle = this.field_E * param2.field_K;
            }
            if (this.field_E * param0.aimAngle > param2.field_W) {
              param0.aimAngle = param2.field_W * this.field_E;
            }
          }
          var6Lifetime1 = -46 / ((param1 + 89) / 33);
          var7Lifetime1 = 0;
          var8 = 0;
          if (param2 == null) {
            return false;
          }
          var7Lifetime2 = param2.field_T;
          var8Lifetime1 = param2.field_V;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = -1;
          if (param2.componentId == 17) {
            var5 = 5;
            var10 = 4;
            var12 = 18;
          }
          if (param2.componentId == 18) {
            var10 = 5;
            var5 = 0;
            var12 = 16;
          }
          if (param2.componentId == 19) {
            var12 = 12;
            var10 = 25;
            var5 = 1;
          }
          if (param2.componentId == 20) {
            var12 = 13;
            var10 = 50;
            var5 = 6;
          }
          if (param2.componentId == 21) {
            var5 = 4;
            var10 = 10;
            if (param0.startTick == -49 + param0.endTick) {
              var12 = 15;
            }
            if (this.hasModuleType(25, -27)) {
              var10 = var10 * 2;
            }
          }
          if (param2.componentId == 22) {
            var12 = 19;
            var5 = 7;
            var10 = 100;
          }
          if (param2.componentId == 23) {
            var12 = 14;
            var10 = 100;
            var5 = 3;
          }
          if (param2.componentId == 24) {
            var5 = 2;
            var10 = 100;
            var12 = 20;
          }
          if (param2.componentId == 25) {
            var5 = 2;
            var12 = 20;
            var11 = 250;
            var10 = 25;
          }
          if (param2.componentId == 26) {
            var12 = 20;
            var10 = 15;
            var5 = 2;
          }
          if (27 == param2.componentId) {
            var5 = 4;
            var10 = 1;
            var11 = 50;
            var12 = 21;
          }
          if (param2.componentId == 38) {
            var11 = 100;
            var12 = 31;
            var5 = 4;
            var10 = 2;
          }
          if (param2.componentId == 28) {
            var10 = 10;
            var12 = 39;
            var5 = 5;
          }
          if (param2.componentId == 29) {
            var10 = 10;
            var5 = 0;
            var12 = 38;
          }
          if (30 == param2.componentId) {
            var10 = 50;
            var12 = 34;
            var5 = 1;
          }
          if (31 == param2.componentId) {
            var5 = 1;
            var12 = 35;
            var10 = 100;
          }
          if (32 == param2.componentId) {
            var12 = 43;
            var5 = 1;
            var10 = 75;
          }
          if (param2.componentId == 33) {
            var5 = 6;
            var12 = 40;
            var10 = 125;
          }
          if (param2.componentId == 34) {
            var5 = 4;
            if (-45 + param0.endTick == param0.startTick) {
              var12 = 67;
            }
            var10 = 12;
            if (this.hasModuleType(25, -27)) {
              var10 = var10 * 2;
            }
          }
          if (param2.componentId == 35) {
            var10 = 250;
            var12 = 42;
            var5 = 7;
          }
          if (36 == param2.componentId) {
            var10 = 200;
            var5 = 2;
            var12 = 44;
          }
          if (param2.componentId == 37) {
            var5 = 2;
            var10 = 300;
            var12 = 44;
          }
          if (param2.componentId == 46) {
            var5 = 6;
            var12 = 59;
            var10 = 250;
          }
          if (param2.componentId == 43) {
            var12 = 66;
            var5 = 0;
            var10 = 10;
          }
          if (param2.componentId == 44) {
            var12 = 65;
            var5 = 1;
            var10 = 150;
          }
          if (param2.componentId == 47) {
            var10 = 32;
            var5 = 4;
            if (this.hasModuleType(25, -27)) {
              var10 = 64;
            }
          }
          if (param2.componentId == 45) {
            var12 = 58;
            var5 = 1;
            var10 = 200;
          }
          if (param2.componentId == 48) {
            var12 = 62;
            var10 = 500;
            var5 = 7;
          }
          if (param2.componentId == 52) {
            var10 = 4;
            var11 = 500;
            if (param0.startTick == param0.endTick - 99) {
              var12 = 63;
            }
            var5 = 4;
          }
          if (param2.componentId == 51) {
            var12 = 61;
            var10 = 300;
            var5 = 3;
          }
          if (param2.componentId == 50) {
            var12 = 57;
            var10 = 500;
            var5 = 2;
          }
          if (param2.componentId == 49) {
            var10 = 2000;
            var5 = 2;
            var11 = 1000;
            var12 = 60;
          }
          if (var5 != 2) {
          }
          if (0 != var5 &&
            var5 == 1) {
          }
          if (var5 != 7) {
          }
          if (var5 != 3) {
          }
          if (this.activeModuleType == 42) {
            var11 += 50;
          }
          if (4 == var5) {
          }
          if (-1 != var12) {
            fc.a((byte) 119, var12, this.worldX);
          }
          var9Lifetime1 = eh.field_b[param2.componentId - 17];
          if (0 == var10) {
          }
          if (var9Lifetime1 > 0) {
            var4_int = 0;
            param2.field_C = var9Lifetime1 * 50;
          }
          var13 = 192;
          var14 = 0;
          var15 = 4;
          var16 = (7 * this.world.simulationTick & 15) + 30;
          if (param2.componentId == 18) {
            var16 -= 20;
          }
          if (29 == param2.componentId) {
            var16 -= 10;
          }
          if (param2.componentId == 43) {
            var16 -= 5;
          }
          if (5 == var5) {
            var14 = 7;
            var16 = (this.world.simulationTick * 7 & 15) + 30;
          }
          var17 = 1;
          if (var5 == 1) {
            var14 = 1;
            var13 = 256;
            var17 = 32;
            if (19 == param2.componentId) {
              var14 = 20;
            } else {
              if (param2.componentId == 31 ||
                param2.componentId == 45) {
                var13 = cl.a(param0.aimAngle, 12);
              }
            }
            var16 = 5000;
            var15 = 0;
          }
          if (var5 == 7) {
            var16 = 5000;
            var13 = 192;
            var17 = 250;
            var14 = 6;
            var15 = 0;
          }
          if (var5 == 2) {
            var15 = 0;
            var13 = 16;
            var14 = 2;
            var16 = 5000;
            var17 = 250;
          }
          if (var5 == 3) {
            var14 = 3;
            var13 = 16;
            var15 = 20;
            var16 = 5000;
            var17 = 250;
          }
          if (var5 == 4) {
            var13 = 256;
            var16 = 5;
            var14 = 4;
            var17 = 1;
            var15 = 32;
          }
          if (var5 == 0) {
            param0.aimAngle = param0.aimAngle + ((127 & this.world.simulationTick) - 64);
          }
          if (var5 == 6) {
            var17 = 1;
            var14 = 5;
            var13 = 512;
            var15 = 32;
            var16 = 5;
          }
          if (param2.componentId == 43 ||
            param2.componentId == 44 ||
            param2.componentId == 45) {
            param0.aimAngle = param0.aimAngle + (-64 + (this.world.simulationTick & 127));
          }
          var18 = 100 * jh.a(param0.aimAngle >> 3, 4096) >> 16;
          var19 = -kg.a(param0.aimAngle >> 3, (byte) -92) * 100 >> 16;
          if (var18 < 0) {
            this.field_E = -1;
          } else {
            this.field_E = 1;
          }
          if (this.field_E != this.field_U) {
            this.field_U = 0;
          }
          var20 = 100;
          if (IsaacRandom.field_f[-17 + param2.componentId] != null) {
            var21_int = -param2.field_G + IsaacRandom.field_f[-17 + param2.componentId][0];
            var22 = -param2.field_E + IsaacRandom.field_f[param2.componentId - 17][1];
            var8Lifetime1 = var8Lifetime1 - 32 * (var22 * var19) / var20;
            var7Lifetime2 = var7Lifetime2 - var22 * (var18 * 32) / var20;
            var7Lifetime2 = var7Lifetime2 - 32 * (var21_int * var19) * this.field_E / var20;
            var8Lifetime1 = var8Lifetime1 + this.field_E * var21_int * (var18 * 32) / var20;
          }
          if (!this.world.field_h) {
            var21_intLifetime1 = var18 * var13 / var20;
            var22Lifetime1 = var13 * var19 / var20;
            var23 = this.velocityX + 3 * (this.field_U * ka.field_G[o.a((byte) 84, this.chassis.componentId)][25][0]);
            if (var5 == 0) {
              var24 = ArticulatedPart.a(3, var22Lifetime1 + var21_intLifetime1 + var23, this.world, 114, var8Lifetime1, this.field_u, 50, this.velocityY + (var22Lifetime1 - var21_intLifetime1), var7Lifetime2, var7Lifetime2);
              this.world.field_o.addLast(3, var24);
              var24 = ArticulatedPart.a(3, var21_intLifetime1 - var22Lifetime1 + var23, this.world, 95, var8Lifetime1, this.field_u, 50, this.velocityY + (var21_intLifetime1 + var22Lifetime1), var7Lifetime2, var7Lifetime2);
              this.world.field_o.addLast(3, var24);
            } else {
              if (5 != var5) {
                if (1 == var5) {
                  var24 = ArticulatedPart.a(3, var21_intLifetime1 + (var22Lifetime1 + var23), this.world, 90, var8Lifetime1, this.field_u, 150, -var21_intLifetime1 + (var22Lifetime1 + this.velocityY), var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(3, 2 * var21_intLifetime1 + var22Lifetime1 + var23, this.world, 119, var8Lifetime1, this.field_u, 150, 2 * var22Lifetime1 - (var21_intLifetime1 - this.velocityY), var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(3, var23 + (var22Lifetime1 + 2 * var21_intLifetime1) / 2, this.world, 103, var8Lifetime1, this.field_u, 150, this.velocityY + (-var21_intLifetime1 + 2 * var22Lifetime1) / 2, var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(3, var23 + (2 * var21_intLifetime1 - var22Lifetime1) / 2, this.world, 112, var8Lifetime1, this.field_u, 150, (var21_intLifetime1 + 2 * var22Lifetime1) / 2 + this.velocityY, var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(3, var21_intLifetime1 * 2 - (var22Lifetime1 - var23), this.world, 109, var8Lifetime1, this.field_u, 150, this.velocityY + (var21_intLifetime1 + var22Lifetime1 * 2), var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(3, -var22Lifetime1 + (var21_intLifetime1 + var23), this.world, 91, var8Lifetime1, this.field_u, 150, var22Lifetime1 + (var21_intLifetime1 + this.velocityY), var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                  var24 = ArticulatedPart.a(1, var21_intLifetime1 * 3 + var23, this.world, 122, var8Lifetime1, this.field_u, 50, var22Lifetime1 * 3 + this.velocityY, var7Lifetime2, var7Lifetime2);
                  this.world.field_o.addLast(3, var24);
                } else {
                  if (6 == var5) {
                    for (var25 = 0; var25 < 5; var25++) {
                      var26 = 400 * var25;
                      var24 = ArticulatedPart.a(5, var23 + var22Lifetime1 * (1 + var25) / 10, this.world, 89, var8Lifetime1 + var26 * var19 / var20, this.field_u, var25 * 10 + 50, this.velocityX + -var21_intLifetime1 * (var25 + 1) / 10, var7Lifetime2 + var18 * var26 / var20, var7Lifetime2);
                      this.world.field_o.addLast(3, var24);
                      var24 = ArticulatedPart.a(5, var23 + (var25 + 1) * -var22Lifetime1 / 10, this.world, 120, var26 * var19 / var20 + var8Lifetime1, this.field_u, var25 * 10 + 50, this.velocityX + var21_intLifetime1 * (var25 + 1) / 10, var26 * var18 / var20 + var7Lifetime2, var7Lifetime2);
                      this.world.field_o.addLast(3, var24);
                    }
                  } else {
                    if (4 == var5) {
                      stackIn_205_0 = 13;
                      stackIn_205_1 = var23;
                      stackIn_205_2 = this.world;
                      stackIn_205_3 = 103;
                      stackIn_205_4 = var8Lifetime1 + var19 * 600 / var20;
                      stackIn_205_5 = this.field_u;
                      if (param2.componentId == 34) {
                        stackIn_206_6 = 125;
                      } else {
                        stackIn_206_6 = 25;
                      }
                      var24 = ArticulatedPart.a(stackIn_205_0, stackIn_205_1, stackIn_205_2, stackIn_205_3, stackIn_205_4, stackIn_205_5, stackIn_206_6, this.velocityY, var7Lifetime2 + var18 * 600 / var20, var7Lifetime2);
                      this.world.field_o.addLast(3, var24);
                      if (param2.componentId == 34) {
                        var24 = ArticulatedPart.a(14, (int)(Math.random() * 1000.0 - 500.0) + (var23 + var21_intLifetime1 * 2), this.world, 98, 600 * var19 / var20 + var8Lifetime1, this.field_u, 200, this.velocityY + var22Lifetime1 * 2 + (int)(-500.0 + 1000.0 * Math.random()), 600 * var18 / var20 + var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                      }
                      if (param2.componentId == 47) {
                        var24 = ArticulatedPart.a(13, var23 + 2 * var21_intLifetime1, this.world, 120, var22Lifetime1 * 15 + var8Lifetime1 + 600 * var19 / var20, this.field_u, 25, this.velocityY + var22Lifetime1 * 2, 15 * var21_intLifetime1 + (var7Lifetime2 + var18 * 600 / var20), var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(14, 2 * var21_intLifetime1 + (var23 + (int)(-500.0 + 1000.0 * Math.random())), this.world, 120, var8Lifetime1 + var19 * 600 / var20 + 25 * var22Lifetime1, this.field_u, 200, 2 * var22Lifetime1 + this.velocityY + (int)(1000.0 * Math.random() - 500.0), var7Lifetime2 + var18 * 600 / var20 + var21_intLifetime1 * 25, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(13, 6 * var21_intLifetime1 + var23, this.world, 105, 600 * var19 / var20 + (var8Lifetime1 + var22Lifetime1 * 40), this.field_u, 25, this.velocityY + var22Lifetime1 * 6, var21_intLifetime1 * 40 + (600 * var18 / var20 + var7Lifetime2), var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                      }
                    } else {
                      if (var5 == 7) {
                        var24 = ArticulatedPart.a(5, var23 + var21_intLifetime1 + var22Lifetime1, this.world, 112, var8Lifetime1, this.field_u, 150, var22Lifetime1 - var21_intLifetime1 + this.velocityY, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(5, var22Lifetime1 + (2 * var21_intLifetime1 + var23), this.world, 90, var8Lifetime1, this.field_u, 150, -var21_intLifetime1 + 2 * var22Lifetime1 + this.velocityY, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(5, var23 + (var22Lifetime1 + var21_intLifetime1 * 2) / 2, this.world, 108, var8Lifetime1, this.field_u, 150, (-var21_intLifetime1 + 2 * var22Lifetime1) / 2 + this.velocityY, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(5, (-var22Lifetime1 + var21_intLifetime1 * 2) / 2 + var23, this.world, 101, var8Lifetime1, this.field_u, 150, this.velocityY + (2 * var22Lifetime1 + var21_intLifetime1) / 2, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(5, var23 + var21_intLifetime1 * 2 - var22Lifetime1, this.world, 111, var8Lifetime1, this.field_u, 150, this.velocityY + var21_intLifetime1 + 2 * var22Lifetime1, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(5, var23 - var22Lifetime1 + var21_intLifetime1, this.world, 120, var8Lifetime1, this.field_u, 150, this.velocityY + var21_intLifetime1 + var22Lifetime1, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                        var24 = ArticulatedPart.a(4, 3 * var21_intLifetime1 + var23, this.world, 92, var8Lifetime1, this.field_u, 50, var22Lifetime1 * 3 + this.velocityY, var7Lifetime2, var7Lifetime2);
                        this.world.field_o.addLast(3, var24);
                      }
                    }
                  }
                }
              } else {
                var24 = ArticulatedPart.a(3, var21_intLifetime1 / 2 + var23, this.world, 115, var8Lifetime1, this.field_u, 100, this.velocityY + var22Lifetime1 / 2, var7Lifetime2, var7Lifetime2);
                this.world.field_o.addLast(3, var24);
              }
            }
          }
          if (this.activeModuleType == 41) {
            var10 = var10 * 4;
          }
          var21 = new Projectile(var7Lifetime2, var8Lifetime1, var18 * var13 / var20, var13 * var19 / var20, var16, var15, var14, this.world, this, var10, var17, param2.componentId - 17);
          this.field_O = this.field_O + 1;
          if (var14 == 20 &&
            this.field_O > 1) {
            var22Lifetime2 = this.field_O;
            if (var22Lifetime2 != 2) {
              if (var22Lifetime2 != 3) {
                if (var22Lifetime2 != 4) {
                  if (var22Lifetime2 == 5) {
                    var21.field_M = 2;
                  } else {
                    var21.field_M = 1;
                  }
                } else {
                  var21.field_M = 3;
                }
              } else {
                var21.field_M = 5;
              }
            } else {
              var21.field_M = 7;
            }
            var21.field_z = this.world.random.nextIntBounded(103, 25) + 25;
          }
          if (var21.field_E) {
            this.field_q = -200;
          }
          var21.field_S = 100 * var19 + var8Lifetime1;
          var21.field_K = 100 * var18 + var7Lifetime2;
          var21.field_kb = var11;
          if (var14 == 0 ||
            var14 == 4 ||
            var14 == 7) {
            var21.field_W = true;
            if (var14 == 4) {
              if (-param0.startTick + param0.endTick == 49) {
                var21.field_W = false;
              }
              var21.field_hb = param0.endTick - param0.startTick;
            }
          }
          stackIn_244_0 = var21;
          if (null == var21.sourceSentinel) {
            stackIn_245_1 = null;
          } else {
            stackIn_245_1 = var21.sourceSentinel.field_Vb;
          }
          stackIn_244_0.field_nb = stackIn_245_1;
          if (3 == var5) {
            var21.field_S = param0.targetWorldY;
            var21.field_K = param0.targetWorldX;
          }
          this.world.projectiles.addLast(3, var21);
          stackIn_249_0 = var4_int;
          return stackIn_249_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_252_0 = var4;
          stackIn_252_1 = new StringBuilder().append("mb.D(");
          if (param0 == null) {
            stackIn_253_2 = "null";
          } else {
            stackIn_253_2 = "{...}";
          }
          stackIn_255_1 = ((StringBuilder) (Object) stackIn_252_1).append(stackIn_253_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_256_2 = "null";
          } else {
            stackIn_256_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_252_0), ((StringBuilder) (Object) stackIn_255_1).append(stackIn_256_2).append(')').toString());
        }
    }

    final boolean i(int param0) {
        boolean discarded$1 = false;
        boolean stackIn_6_0 = false;
        if (param0 < 62) {
          discarded$1 = this.a(26, -22, -11, -26, false, 13, 87);
        }
        stackIn_6_0 = (this.field_F >= 250) && (this.field_S == 0);
        return stackIn_6_0;
    }

    private final void advanceCommandQueues(byte obfuscationGuard, int simulationTick) {
        if (this.field_V) {
          this.secondaryCommands.clear(obfuscationGuard ^ 77);
          this.pendingCommands.clear(6);
        }
        SentinelCommand primaryCommand = (SentinelCommand) (this.pendingCommands.first(obfuscationGuard + 12983));
        SentinelCommand secondaryCommand = (SentinelCommand) (this.secondaryCommands.first(13058));
        if (primaryCommand != null) {
          this.executeCommand(true, primaryCommand, simulationTick);
        }
        if (obfuscationGuard != 75) {
          return;
        }
        if (secondaryCommand != null) {
          this.executeCommand(true, secondaryCommand, simulationTick);
        }
    }

    private final void a(int param0, int param1) {
        int stackIn_10_0 = 0;
        boolean stackIn_34_1 = false;
        int stackIn_84_1 = 0;
        int stackIn_88_1 = 0;
        Object stackIn_95_0;
        int stackIn_95_1;
        int stackIn_95_2;
        int[] stackIn_95_3;
        Object stackIn_96_0;
        int stackIn_96_4;
        boolean stackIn_114_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ParticleEffect var9_ref_qb;
        int var10;
        int var11;
        int var12;
        int var13;
        ParticleEffect var14;
        Explosion var15;
        int var16;
        Projectile var17;
        int var9Lifetime1;
        ParticleEffect var9_ref_qbLifetime1;
        ParticleEffect var9_ref_qbLifetime2;
        ParticleEffect var9_ref_qbLifetime3;
        ParticleEffect var14Lifetime1;
        ParticleEffect var14Lifetime2;
        ParticleEffect var14Lifetime3;
        var16 = SteelSentinels.obfuscationControl;
        var3 = this.world.terrain.getGroundHeightAt((byte) -109, this.worldX >> 4) << 4;
        var4 = this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
        var5 = this.world.terrain.getSurfaceProfileAt((byte) 118, this.worldX >> 4) << 4;
        var6 = var3;
        if (!this.field_u &&
          var5 != var4) {
          var6 = var4;
        }
        var7 = -this.worldY;
        if (param0 <= this.velocityY) {
          stackIn_10_0 = (var6 >= var7) ? 1 : 0;
        } else {
          stackIn_10_0 = 0;
        }
        var8 = stackIn_10_0;
        if (4000 + var7 < var6 &&
          !this.field_u) {
          this.velocityX = 0;
          this.worldX = param1;
        }
        if (this.world.terrain.getTerrainType(param0 ^ 95) == 4 && (var7 < var3 - 2000 ||
          var7 <= 0)) {
          var8 = 0;
        }
        if (4 == this.world.terrain.getTerrainType(71) &&
          var7 < -20000) {
          this.field_M = true;
          this.clearArmour(128);
          this.field_z = 0;
        }
        if (var8 != 0) {
          if (Math.abs(this.velocityY) > Math.abs(this.velocityX)) {
            this.velocityX = 0;
          } else {
            if (this.hasModuleType(28, -27)) {
              this.velocityX = this.velocityX * 7 / 10;
            } else {
              if (this.velocityX < 0) {
                this.velocityX = -(-this.velocityX * 9 / 10);
              }
              if (this.velocityX > 0) {
                this.velocityX = this.velocityX * 9 / 10;
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.world.field_j && (this.field_ub >= 0 ||
            this.charge > 0)) {
            if (this.field_U != 0 &&
              !this.field_u &&
              this.world.terrain.getSecondaryHeightAt(false, this.field_U * 10 + (this.worldX >> 4)) + (this.worldY >> 4) > 250) {
              this.field_U = 0;
            }
            if ((0 != this.field_U)) {
              if (this.field_Pb > 0) {
                this.field_Pb = this.field_Pb - 1;
              }
              this.field_E = this.field_U;
              if (this.field_u) {
                if (this.world.terrain.getGroundHeightAt((byte) -103, (this.worldX >> 4) + 10 * this.field_E) <= (-this.worldY >> 4) + 5) {
                  stackIn_88_1 = this.field_Pb;
                } else {
                  stackIn_88_1 = 50;
                }
                this.field_Pb = stackIn_88_1;
              } else {
                if (this.world.terrain.getSecondaryHeightAt(false, (this.worldX >> 4) + 10 * this.field_E) <= (-this.worldY >> 4) + 5) {
                  stackIn_84_1 = this.field_Pb;
                } else {
                  stackIn_84_1 = 50;
                }
                this.field_Pb = stackIn_84_1;
              }
              if (this.field_Pb < 0) {
                this.field_Pb = 0;
              }
              if (this.activeModuleType == 39) {
                this.worldX = this.worldX + 500 * this.field_E;
              } else {
                stackIn_95_0 = this;
                stackIn_95_1 = this.worldX;
                stackIn_95_2 = this.field_E;
                stackIn_95_3 = ka.field_G[o.a((byte) 84, this.chassis.componentId)][25];
                if (0 != this.field_Pb) {
                  stackIn_96_0 = this;
                  stackIn_96_4 = 5;
                } else {
                  stackIn_96_0 = this;
                  stackIn_96_4 = 0;
                }
                this.worldX = stackIn_95_1 + stackIn_95_2 * (stackIn_95_3[stackIn_96_4] * 3);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_U = 0;
          }
          var9 = -this.world.terrain.getGroundHeightAt((byte) -99, this.worldX >> 4) << 4;
          var10 = -this.world.terrain.getSurfaceProfileAt((byte) 120, this.worldX >> 4) << 4;
          var11 = -this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
          var12 = var9;
          if (!this.field_u &&
            var10 != var11) {
            var12 = var11;
          }
          var8 = 0;
          var13 = 1024;
          if (this.worldX != param1 &&
            4000 < this.worldY - var12 &&
            this.worldY <= (-this.world.terrain.getGroundHeightAt((byte) -95, param1 >> 4) << 4) + 4000) {
            this.velocityX = 0;
            this.worldX = param1;
          } else {
            if (var12 - var13 <= this.worldY) {
              var8 = 1;
              this.worldY = var12;
            }
          }
          stackIn_114_1 = (var9 != var11) && (this.worldY > var11);
          this.field_u = stackIn_114_1;
          if (var8 == 0) {
            this.velocityY = this.velocityY + this.world.field_z;
            this.velocityX = this.field_E * ka.field_G[o.a((byte) 84, this.chassis.componentId)][25][0];
          } else {
            this.velocityY = 0;
          }
          if (this.field_Lb &&
            !this.world.field_h) {
            fc.a((byte) 66, 11, this.worldX);
            var14 = ArticulatedPart.a(0, -100, this.world, 104, this.worldY, this.field_u, 100, -50, -50 + this.worldX, this.worldX);
            this.world.field_o.addLast(3, var14);
            var14Lifetime1 = ArticulatedPart.a(0, 100, this.world, 113, this.worldY, this.field_u, 100, -50, this.worldX + 50, this.worldX);
            this.world.field_o.addLast(3, var14Lifetime1);
            var14Lifetime2 = ArticulatedPart.a(0, -400, this.world, 113, this.worldY, this.field_u, 200, -100, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var14Lifetime2);
            var14Lifetime3 = ArticulatedPart.a(0, 400, this.world, 116, this.worldY, this.field_u, 200, -100, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var14Lifetime3);
          }
          this.field_Dc = 0;
          this.field_Lb = false;
          if (this.field_pc) {
            if (4 != this.world.terrain.getTerrainType(123) &&
              nn.field_c[0] != this.chassis.componentId) {
              var17 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 0, 0, this.world, (Sentinel) null, 0, 0, -1);
              var15 = new Explosion(this.worldX, this.worldY - (this.field_Db << 3), 0, 0, 20, this.world, var17.affectedSentinels, var17);
              var15.field_U = 1500;
              var15.field_G = 100;
              var15.field_K = 0;
              this.world.explosions.addLast(3, var15);
            }
            this.field_pc = false;
          }
        } else {
          this.velocityY = this.velocityY + this.world.field_z;
          if (this.field_pc) {
            this.velocityY = this.velocityY - this.world.field_z * 3 / 4;
          }
          if (!this.field_Lb &&
            !this.world.field_h) {
            var9_ref_qb = ArticulatedPart.a(0, -100, this.world, 125, this.worldY, this.field_u, 100, -50, this.worldX - 50, this.worldX);
            this.world.field_o.addLast(3, var9_ref_qb);
            var9_ref_qbLifetime1 = ArticulatedPart.a(0, 100, this.world, param0 + 127, this.worldY, this.field_u, 100, -50, this.worldX + 50, this.worldX);
            this.world.field_o.addLast(3, var9_ref_qbLifetime1);
            var9_ref_qbLifetime2 = ArticulatedPart.a(0, -400, this.world, param0 ^ 99, this.worldY, this.field_u, 200, -100, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var9_ref_qbLifetime2);
            var9_ref_qbLifetime3 = ArticulatedPart.a(0, 400, this.world, param0 ^ 125, this.worldY, this.field_u, 200, -100, this.worldX, this.worldX);
            this.world.field_o.addLast(3, var9_ref_qbLifetime3);
          }
          this.field_Lb = true;
          var9 = -this.world.terrain.getGroundHeightAt((byte) -105, this.worldX >> 4) << 4;
          var10 = -this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
          var11 = -this.world.terrain.getSurfaceProfileAt((byte) 125, this.worldX >> 4) << 4;
          stackIn_34_1 = (var10 != var9) && (var10 < this.worldY);
          this.field_u = stackIn_34_1;
          if (this.field_u) {
            if (var10 != var11) {
              if (this.worldY < var11) {
                this.worldY = var10;
                this.field_u = false;
              } else {
                var11 = var11 + (this.field_Db << 4);
                if (this.worldY < var11 &&
                  this.world.b(this.worldX, param0 ^ -5)) {
                  if (this.world.terrain.getSecondaryHeightAt(false, param1 >> 4) != this.world.terrain.getSurfaceProfileAt((byte) 124, param1 >> 4)) {
                    if (this.velocityY < 0) {
                      this.velocityY = -this.velocityY / 2;
                    }
                    this.worldY = var11;
                  } else {
                    this.velocityX = -this.velocityX / 2;
                    this.worldX = param1;
                    this.velocityY = this.velocityY / 2;
                  }
                }
              }
            }
            if (this.worldY > var9 &&
              this.world.terrain.getTerrainType(param0 + 85) != 4) {
              this.worldY = var9;
            }
          } else {
            if (4 != this.world.terrain.getTerrainType(104)) {
              if (var10 == var11) {
                if (var10 < this.worldY) {
                  this.velocityX = this.velocityX / 2;
                  this.worldY = var10;
                }
              } else {
                if (this.worldY > var10) {
                  this.worldY = var10;
                  this.velocityX = this.velocityX / 2;
                }
              }
            }
          }
        }
        if (this.worldX < 2048) {
          this.worldX = 2048;
          this.velocityX = Math.abs(this.velocityX);
          this.field_U = 0;
          this.field_E = 1;
        }
        var9Lifetime1 = -2048 + (this.world.terrain.getProfileLength(86) << 4);
        if (var9Lifetime1 < this.worldX) {
          this.worldX = var9Lifetime1;
          this.velocityX = -Math.abs(this.velocityX);
          this.field_U = 0;
          this.field_E = -1;
        }
        if (0 == this.field_Nb &&
          !fk.field_c) {
          hb.field_f = false;
          if (0 != he.field_k &&
            -he.field_k + this.worldX <= 10000) {
            hb.field_f = true;
            if (128 + he.field_k > this.worldX) {
              this.worldX = 128 + he.field_k;
              this.velocityX = Math.abs(this.velocityX);
              this.field_U = 0;
              this.field_E = 1;
            }
          }
          if (ge.field_l != 0 &&
            -this.worldX + ge.field_l <= 10000) {
            hb.field_f = true;
            if (ge.field_l + 128 < this.worldX) {
              this.worldX = ge.field_l;
              this.velocityX = -Math.abs(this.velocityX);
              this.field_E = -1;
              this.field_U = 0;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        if (!param1) {
          this.i(2);
        }
    }

    final void j(int param0) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        NodeIterator var6;
        int var7;
        int var8;
        int var9_int;
        Sentinel var9;
        int var10;
        int var11;
        int var4Lifetime1;
        int var8Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        var2 = -1;
        var4 = 0;
        var5 = this.world.terrain.getProfileLength(param0 - 119);
        if (param0 != -5) {
          return;
        }
        var6 = new NodeIterator(this.world.sentinels);
        if (this.world.playerCount <= 0) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = (this.world.simulationTick * 77 + this.playerId * this.world.terrain.getProfileLength(param0 ^ 124) / this.world.playerCount) % this.world.terrain.getProfileLength(-124) << 4;
        }
        var7 = stackIn_5_0;
        for (var8 = 1; var8 <= 15; var8++) {
          var4Lifetime1 = var8 * var5 >> 6;
          var3 = 0;
          if (this.world.terrain.getTerrainType(58) == 4) {
            var9_int = this.teamId;
            if (this.field_Jb &&
              this.field_Cb) {
              var9_int = -var9_int + 1;
            }
            var4Lifetime1 = this.world.terrain.spawnPositions[var9_int] >> 2;
            if (var9_int == 0) {
              var4Lifetime1 = var4Lifetime1 - var8 * 70;
            }
            if (var9_int == 1) {
              var4Lifetime1 = var4Lifetime1 + var8 * 70;
            }
          } else {
            if (this.world.terrain.getTerrainType(121) == 1 &&
              di.field_g == -1) {
              var4Lifetime1 = var4Lifetime1 * 2 / 3;
              if (0 < this.teamId) {
                var4Lifetime1 = var4Lifetime1 + (var5 >> 2) / 3;
              }
            }
          }
          var9 = (Sentinel) (var6.b(2));
          while (var9 != null) {
            var10 = (Math.abs(-var4Lifetime1 + (var9.worldX >> 6)) >> 2) + 1;
            var3 = var3 + 1000 / var10;
            var9 = (Sentinel) (var6.d(2));
          }
          if (var2 == -1 ||
            var3 < var2) {
            var2 = var3;
            var7 = var4Lifetime1 << 6;
          }
        }
        this.worldX = var7;
        if (this.field_Nb == 0 &&
          -1 != di.field_g &&
          4 != di.field_g) {
          if (di.field_g == 10 &&
            ge.field_j != 0) {
            return;
          }
          var8Lifetime1 = vc.a((byte) 32);
          if (var8Lifetime1 >= 0) {
            this.worldX = var8Lifetime1;
          }
        }
        return;
    }

    public static void c(byte param0) {
        field_I = null;
        field_T = null;
        field_nc = null;
        if (param0 <= 52) {
          field_T = (int[]) null;
        }
        field_Ob = null;
        field_D = null;
    }

    final void b(int param0, int param1) {
        int var3;
        NodeIterator var4;
        int var5;
        int var6;
        Sentinel var7_ref_mb;
        int var7;
        Sentinel var8;
        int var9;
        var9 = SteelSentinels.obfuscationControl;
        if (this.world.field_j) {
          return;
        }
        if (this.field_lb > 0) {
          var3 = (int)((long)param0 * 25000L / (long)(4 * this.world.field_eb));
          if (var3 < 0 &&
            this.world.field_lb) {
            var3 = var3 * 10;
          }
          this.field_Ab = this.field_Ab + var3;
          this.field_Fc = 50;
          this.field_vb = this.field_vb + var3;
          var4 = new NodeIterator(this.world.sentinels);
          if (var3 > 0) {
            var5 = 0;
            var6 = 1;
            var7_ref_mb = (Sentinel) (var4.b(2));
            while (var7_ref_mb != null) {
              if (var7_ref_mb != this) {
                if (this.teamId != var7_ref_mb.teamId) {
                  var7_ref_mb = (Sentinel) (var4.d(2));
                  continue;
                }
                if (!var7_ref_mb.field_V) {
                  var6++;
                } else {
                  var5++;
                }
              }
              var7_ref_mb = (Sentinel) (var4.d(2));
            }
            var7 = var3 / 2;
            if (0 < var5) {
              if (this.world.field_lb) {
                var3 = var3 / 2;
                this.field_Ab = this.field_Ab - var3;
                this.field_vb = this.field_vb - var3;
              }
              var7 = var7 + var3 * var5 / (2 * var6);
            }
            var8 = (Sentinel) (var4.b(param1 ^ 26509));
            while (var8 != null) {
              if (this != var8 &&
                var8.teamId == this.teamId &&
                !var8.field_V) {
                var8.field_Fc = 50;
                var8.field_Ab = var8.field_Ab + var7;
                var8.field_vb = var8.field_vb + var7;
              }
              var8 = (Sentinel) (var4.d(2));
            }
          }
          if (this.world.field_lb &&
            this.teamId == 0 &&
            var3 > 0) {
            this.world.field_gb = this.world.field_gb + var3;
            if (this.world.field_d <= this.world.field_gb) {
              this.world.field_gb = this.world.field_gb - this.world.field_d;
              this.world.field_M = this.world.field_M + 1;
              this.world.field_d = this.world.field_d * 2;
            }
          }
        }
        if (param1 != 26511) {
          this.f(30, -10);
        }
    }

    final void g(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        var8 = SteelSentinels.obfuscationControl;
        if (109 == param1) {
          this.field_mb = this.field_mb + 8;
          if (50 < this.field_mb) {
            this.field_mb = this.field_mb - 50;
            this.field_r = this.field_r + 1;
            if (12 <= this.field_r) {
              this.field_r = 0;
            }
          }
          this.field_fc = this.worldY;
          return;
        }
        var3 = ka.field_G[o.a((byte) 84, param1)][25][1];
        var4 = ka.field_G[o.a((byte) 84, param1)][25][3];
        if (this.field_Pb > 0) {
          var3 = ka.field_G[o.a((byte) 84, param1)][25][6];
          var4 = ka.field_G[o.a((byte) 84, param1)][25][7];
        }
        if (param0 != -18) {
          this.field_Q = 125;
        }
        var5 = ka.field_G[o.a((byte) 84, param1)][25][4];
        var6 = ka.field_G[o.a((byte) 84, param1)][25][2];
        if (0 < this.field_oc &&
          var6 > this.field_oc) {
          this.field_mb = this.field_oc * 50 * var5 / var6 % 50;
          var7 = 9 + this.field_oc * var5 / var6;
          this.field_fc = this.worldY;
          this.field_Pb = 0;
          if (var7 != this.field_r) {
            this.field_J = this.field_r;
            this.field_r = var7;
          }
          return;
        }
        this.field_mb = this.field_mb + var3;
        var7Lifetime1 = 50;
        if (!this.field_Lb) {
          if (0 == this.field_U) {
            this.field_fc = (this.worldY + this.field_fc * 7) / 8;
          }
          if (3 <= var4 &&
            this.chassis.componentId != 57 &&
            this.chassis.componentId != 0 &&
            79 != this.chassis.componentId &&
            0 == this.field_Pb) {
            if (-2 + (var4 + 1) == this.field_r ||
              var4 / 2 - 1 == this.field_r) {
              this.field_fc = (this.worldY + 7 * this.field_fc) / 8;
            }
          } else {
            this.field_fc = this.worldY;
          }
          this.field_fc = this.worldY;
          if (this.field_mb >= var7Lifetime1) {
            if (this.field_Pb != 0) {
              this.field_J = this.field_r;
              if (var4 >= 3 && (var4 + 17 - 2 == this.field_r ||
                -2 + (17 + var4 / 2) == this.field_r)) {
                this.field_fc = this.worldY;
              }
              this.field_r = this.field_r + 1;
              if (var4 + 1 < this.field_r) {
                if (this.field_r < 17) {
                  this.field_r = 17;
                }
              } else {
                this.field_r = this.field_r + 16;
              }
              this.field_mb = this.field_mb - var7Lifetime1;
              if (this.field_r >= var4 + 17) {
                this.field_r = 17;
              }
              if (0 == this.field_U) {
                this.field_r = 0;
              }
            } else {
              if (var4 >= 3 && (this.field_r == -2 + var4 + 1 ||
                -2 + (1 + var4 / 2) == this.field_r)) {
                this.field_fc = this.worldY;
              }
              this.field_J = this.field_r;
              this.field_r = this.field_r + 1;
              this.field_mb = this.field_mb - var7Lifetime1;
              if (this.field_r >= var4 + 1) {
                this.field_r = 1;
              }
              if (this.field_U == 0) {
                this.field_r = 0;
              }
            }
            if (!this.world.field_h) {
              this.a(param1, true);
            }
          }
        } else {
          this.field_Pb = 0;
          this.field_fc = this.worldY;
          if (14 <= this.field_r) {
            if (this.velocityY >= 0) {
              this.field_mb = this.velocityY / 2;
              this.field_r = 16;
              this.field_J = 15;
              if (this.field_mb > 50) {
                this.field_mb = 50;
              }
            } else {
              if (this.field_r != 14) {
                this.field_J = 14;
                this.field_mb = 50 + this.velocityY / 2;
                this.field_r = 15;
                if (this.field_mb < 0) {
                  this.field_mb = 0;
                }
              } else {
                this.field_mb = this.field_mb + 5;
                if (this.velocityY / 2 + 50 > this.field_mb) {
                  this.field_mb = this.velocityY / 2 + 50;
                }
                if (this.field_mb >= 50) {
                  this.field_J = this.field_r;
                  this.field_mb = 0;
                  this.field_r = 15;
                }
              }
            }
          } else {
            this.field_J = this.field_r;
            this.field_mb = 0;
            this.field_r = 14;
            if (this.field_J == 0) {
              this.field_J = 8 + var5;
            }
          }
        }
        return;
    }

    private final void e(byte param0) {
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = SteelSentinels.obfuscationControl;
        if (this.field_mc > 0 &&
          !this.hasModuleType(27, -27) &&
          0 >= this.field_z) {
          this.field_mc = this.field_mc - 1;
        } else {
          this.field_mc = 0;
          if (this.maximumCharge <= this.charge) {
            this.field_ub = 0;
          } else {
            if (0 == this.charge &&
              0 > this.field_ub) {
              this.field_ub = this.field_ub + (2 + this.field_wb);
            } else {
              if (!this.hasModuleType(19, -27)) {
                this.field_ub = this.field_ub + this.field_wb;
                if (this.field_P == 0 &&
                  0 == this.field_U &&
                  !this.field_Lb) {
                  this.field_ub = this.field_ub + 20;
                }
              } else {
                this.field_ub = this.field_ub + this.field_wb;
              }
            }
            if (this.field_ub >= 3000) {
              this.field_ub = this.field_ub - 3000;
              this.consumeCharge(true, -1);
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = -109 / ((param0 - 67) / 52);
        if (this.field_P <= 0) {
          this.field_G = this.armour;
          if (this.field_Q > this.field_S &&
            this.charge > 0 &&
            this.world.simulationTick % 50 == 0) {
            this.field_S = this.field_S + this.field_wb;
          }
          var3 = 0;
          var4 = 0;
          var5 = 0;
          scanLoop1: while (true) {
            if (this.moduleCount > var5) {
              if (this.moduleTypes[var5] != 19) {
                if (this.moduleTypes[var5] == 34) {
                  var4 = 1;
                  break scanLoop1;
                }
              } else {
                var3 = 1;
              }
              var5++;
              continue;
            }
            break;
          }
          if (var4 != 0 &&
            this.armour < this.maximumArmour) {
            this.reduceArmour(128, -1);
          } else {
            if ((var3 != 0)) {
              stackIn_39_0 = -1;
              stackIn_39_1 = ~this.field_ub;
              if ((!(stackIn_39_0 < stackIn_39_1)) &&
                ((this.field_P == 0))) {
                if (0 == this.field_U &&
                  !this.field_Lb) {
                  if ((!(this.armour >= this.maximumArmour)) &&
                    (((7 & this.world.simulationTick) == 0))) {
                    this.reduceArmour(128, -1);
                  }
                } else {
                  if ((!(this.maximumArmour <= this.armour)) &&
                    (((this.world.simulationTick & 50) == 0))) {
                    this.reduceArmour(128, -1);
                  }
                }
              }
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_P = this.field_P - 1;
        }

    }

    private final void a(byte param0, SentinelCommand param1) {
        int var6_int = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Projectile var5 = null;
        Explosion var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 100;
          var4 = 0;
          if (this.field_fb == 2) {
            var3_int = 400;
          }
          if (this.field_fb == 1) {
            var4 = 500;
          }
          if (3 == this.field_fb) {
            var3_int = 125 * this.charge;
          }
          if (this.field_fb == 1) {
            this.velocityX = 300 * this.field_E;
            this.velocityY = -25;
          }
          if (this.field_fb == 2) {
            this.velocityX = 0;
          }
          if (3 == this.field_fb) {
            if (10 > this.charge) {
              return;
            }
            if (param1.startTick == -55 + param1.endTick) {
              fc.a((byte) 42, 103, this.worldX);
            }
            if (this.field_oc == 0) {
              if (param1.actionVariant == 3) {
                param1.actionVariant = 4;
                if (!this.field_Lb) {
                  this.field_oc = 1;
                }
              } else {
                if (!this.field_Lb) {
                  this.velocityX = 50 * this.field_E;
                  this.velocityY = this.velocityY - 32 * this.field_Fb;
                }
              }
            }
            if (param1.startTick < -1 + param1.endTick) {
              param1.startTick = param1.startTick + 1;
              param1.activated = true;
              return;
            }
            this.velocityX = 250 * this.field_E;
            this.velocityY = 500;
          }
          if (this.activeModuleType == 41) {
            var3_int = var3_int * 4;
          }
          if (param0 != 10) {
            this.consumeCharge(false, -69);
          }
          if (42 == this.activeModuleType) {
            var4 += 50;
          }
          var5 = new Projectile(this.worldX, this.worldY, 0, 0, 0, 2, 9, this.world, this, var3_int, 10, -this.field_fb - 2);
          var5.field_kb = var4;
          for (var6_int = 0; var5.affectedSentinels.length > var6_int; var6_int++) {
            if (var5.affectedSentinels[var6_int] == this) {
              var5.affectedSentinels[var6_int] = null;
            }
          }
          var6 = new Explosion(var5.worldX, var5.worldY, this.velocityX, this.velocityY, 25, this.world, var5.affectedSentinels, var5);
          var6.field_G = 100;
          var6.field_K = 5;
          var6.field_U = 500;
          if (this.field_fb == 1) {
            var6.velocityY = var6.velocityY * 2;
            var6.velocityX = var6.velocityX * 2;
          }
          if (this.field_fb == 2) {
            var6.field_K = 6;
            var6.field_U = 800;
          }
          if (this.field_fb == 3) {
            var6.field_K = 7;
            var6.velocityY = var6.velocityY * 2;
            var6.velocityX = var6.velocityX * 2;
            var6.field_U = 750;
          }
          if (this.activeModuleType == 41) {
            var6.field_G = var6.field_G * 4;
            var6.field_U = var6.field_U * 2;
          }
          var7 = this.field_fb;
          if (var7 != 1) {
            if (var7 != 2) {
              if (3 == var7) {
                fc.a((byte) -81, 23, this.worldX);
              }
            } else {
              fc.a((byte) -90, 24, this.worldX);
            }
          } else {
            fc.a((byte) -87, 22, this.worldX);
          }
          this.world.explosions.addLast(3, var6);
          if (param1.activated) {
            var7Lifetime1 = 0;
            if (1 == this.field_fb) {
              var7Lifetime1 = 1;
            }
            if (this.field_fb == 2) {
              var7Lifetime1 = 2;
            }
            if (3 == this.field_fb) {
              var7Lifetime1 = this.charge;
            }
            if (var7Lifetime1 > 0) {
              this.consumeCharge(true, var7Lifetime1);
              if (this.field_ub < 0) {
                this.field_ub = this.field_ub + 3000;
                this.consumeCharge(true, 1);
              }
            }
            param1.activated = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_82_0 = var3;
          stackIn_82_1 = new StringBuilder().append("mb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != -116) {
          return;
        }
        boolean discarded$0 = this.a(0, param1, param0, 0, false, param3, -92);
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != -22) {
          this.field_Rb = 58;
        }
        return this.a(param2, param1, param4, param3, true, 256, -125);
    }

    final void restoreArmour(int obfuscationGuard) {
        if (this.playerId == 0) {
          this.world.field_a = this.world.field_a - 128 * this.armour;
          this.world.field_q = this.world.field_q + 128 * this.maximumArmour;
        }
        if (obfuscationGuard != -20039) {
          this.j(-92);
        }
        this.armour = this.maximumArmour;
    }

    final void d(int param0) {
        int var2 = 0;
        if (this.teamId >= 0 &&
          this.teamId < 12) {
          var2 = fj.field_a[this.teamId];
          this.chassis.b(var2, -9);
        }
        if (param0 != -28033) {
          this.field_fc = 81;
        }
    }

    final void scheduleCommand(byte obfuscationGuard, SentinelCommand command) {
        NodeDeque commandQueue = null;
        SentinelCommand queuedCommand = null;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          commandQueue = this.pendingCommands;
          if (command.actionType == 6 ||
            command.actionType == 3 ||
            command.actionType == 4) {
            commandQueue = this.secondaryCommands;
          }
          if (obfuscationGuard <= 45) {
            return;
          }
          queuedCommand = (SentinelCommand) (commandQueue.first(13058));
          while (queuedCommand != null) {
            if (command.startTick > queuedCommand.startTick &&
              !queuedCommand.scheduled) {
              queuedCommand.unlink(4);
            } else {
              if (command.startTick == queuedCommand.startTick) {
                command.scheduled = true;
                IsaacRandom.insertNodeBefore(queuedCommand, 30, command);
                queuedCommand.unlink(4);
                return;
              }
              if (queuedCommand.startTick > command.startTick) {
                command.scheduled = true;
                IsaacRandom.insertNodeBefore(queuedCommand, 30, command);
                return;
              }
            }
            queuedCommand = (SentinelCommand) (commandQueue.next((byte) -36));
          }
          command.scheduled = true;
          commandQueue.addLast(3, command);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("mb.H(").append(obfuscationGuard).append(',');
          if (command == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int getStatistic(boolean obfuscationGuard, int statisticId) {
        int stackIn_16_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_108_0 = 0;
        int var3;
        SentinelCommand var4;
        if (12 <= statisticId &&
          statisticId < 19) {
          return this.field_jb[-12 + statisticId];
        }
        var3 = this.world.playerCount + this.world.computerPlayerCount;
        if (statisticId == 0) {
          return this.field_w;
        }
        if (statisticId == 1) {
          return this.field_Ac;
        }
        if (statisticId == 3) {
          if (var3 > 1 &&
            this.playerId == this.world.field_B) {
            stackIn_16_0 = 1;
          } else {
            stackIn_16_0 = 0;
          }
          return stackIn_16_0;
        }
        if (statisticId == 2) {
          return this.field_Bc;
        }
        if (statisticId != 4 &&
          statisticId != 5) {
          if (statisticId == 6) {
            if (var3 != 1 &&
              !this.world.field_lb &&
              !this.field_Hb) {
              stackIn_31_0 = 1;
            } else {
              stackIn_31_0 = 0;
            }
            return stackIn_31_0;
          }
          if (7 == statisticId) {
            return this.field_Wb / 50;
          }
          if (statisticId == 8) {
            if (var3 != 1) {
              stackIn_38_0 = this.field_vb / 100;
            } else {
              stackIn_38_0 = 0;
            }
            return stackIn_38_0;
          }
          if (9 == statisticId) {
            return this.field_ob;
          }
          if (statisticId == 10) {
            if (this.field_H < 2) {
              stackIn_46_0 = 0;
            } else {
              stackIn_46_0 = this.field_H;
            }
            return stackIn_46_0;
          }
          if (statisticId == 11) {
            return this.field_wc;
          }
          if (statisticId == 19) {
            return this.field_qc;
          }
          if (statisticId == 20) {
            if (var3 > 1 &&
              this.world.field_g == this.playerId) {
              stackIn_56_0 = 1;
            } else {
              stackIn_56_0 = 0;
            }
            return stackIn_56_0;
          }
          if (26 == statisticId) {
            stackIn_61_0 = (this.world.field_n == this.playerId) ? 1 : 0;
            return stackIn_61_0;
          }
          if (statisticId == 27) {
            if (this.field_db != 0) {
              stackIn_67_0 = this.field_db * 100 / (this.field_sb + this.field_db);
            } else {
              stackIn_67_0 = 0;
            }
            return stackIn_67_0;
          }
          if (statisticId == 28) {
            return this.field_tb;
          }
          if (statisticId == 21) {
            if (this.world.terrain.getTerrainType(81) == 4) {
              stackIn_75_0 = this.field_Y;
            } else {
              stackIn_75_0 = 0;
            }
            return stackIn_75_0;
          }
          if (22 == statisticId) {
            if (this.world.terrain.getTerrainType(127) == 2 &&
              this.field_Cb &&
              !this.field_Hb) {
              stackIn_84_0 = 1;
            } else {
              stackIn_84_0 = 0;
            }
            return stackIn_84_0;
          }
          if (23 == statisticId) {
            if (this.world.terrain.getTerrainType(97) == 2) {
              stackIn_89_0 = this.field_eb;
            } else {
              stackIn_89_0 = 0;
            }
            return stackIn_89_0;
          }
          if (statisticId == 24) {
            if (2 == this.world.terrain.getTerrainType(102)) {
              stackIn_94_0 = this.field_vc * 15 / 50;
            } else {
              stackIn_94_0 = 0;
            }
            return stackIn_94_0;
          }
          if (!obfuscationGuard) {
            var4 = (SentinelCommand) null;
            this.a((SentinelCommand) null, (byte) -26);
          }
          if (29 == statisticId) {
            if (2 != this.world.terrain.getTerrainType(107)) {
              stackIn_102_0 = 0;
            } else {
              stackIn_102_0 = this.field_Y;
            }
            return stackIn_102_0;
          }
          if (statisticId != 30) {
            if (statisticId == 31) {
              return this.field_kc;
            }
            return 0;
          }
          if (this.world.terrain.getTerrainType(101) == 3) {
            stackIn_108_0 = this.field_vc * 15 / 50;
          } else {
            stackIn_108_0 = 0;
          }
          return stackIn_108_0;
        }
        return this.field_tc;
    }

    final int[] f(int param0, int param1) {
        boolean discarded$0 = false;
        int var6 = 0;
        int[] var3;
        int var4;
        int[][] var5;
        int var7;
        var7 = SteelSentinels.obfuscationControl;
        var3 = new int[]{0, 0};
        if (param1 != 22742) {
          discarded$0 = this.a(-81, -111, true, -69, (byte) -49, true, 14, 52);
        }
        var4 = 50;
        var5 = ka.field_G[o.a((byte) 84, param0)];
        if (this.animatedParts != null &&
          var5[this.field_J] != null &&
          null != var5[this.field_r] &&
          var5[this.field_J].length >= this.animatedParts.length &&
          var5[this.field_r].length >= this.animatedParts.length) {
          for (var6 = 0; this.animatedParts.length > var6; var6++) {
            this.animatedParts[var6].rotation = ((var4 - this.field_mb) * var5[this.field_J][var6] + this.field_mb * var5[this.field_r][var6]) / var4;
          }
          var3[0] = (var5[this.field_J][var5[this.field_J].length - 1] * (-this.field_mb + var4) + var5[this.field_r][-1 + var5[this.field_r].length] * this.field_mb) / var4;
          var3[1] = (var5[this.field_J][var5[this.field_J].length - 2] * (var4 - this.field_mb) + this.field_mb * var5[this.field_r][-2 + var5[this.field_r].length]) / var4;
        }
        return var3;
    }

    final void refillCharge(int obfuscationGuard) {
        if (this.playerId == 0) {
          this.world.field_f = this.world.field_f + 128 * this.world.simulationTick;
          this.world.field_N = this.world.field_N + (-this.world.simulationTick + (-this.charge + this.maximumCharge)) * 256;
        }
        if (obfuscationGuard != 5) {
          return;
        }
        this.charge = this.maximumCharge;
    }

    private final void a(boolean param0) {
        int stackIn_37_0 = 0;
        int var2;
        Object var3;
        Projectile var4;
        ArticulatedPart[] var4_array;
        Object var5;
        SentinelCommand var5_ref;
        int var5_int;
        double var6;
        int var6_int;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        ArticulatedPart[] var20;
        SentinelCommand var21;
        SentinelCommand var22;
        SentinelCommand var23;
        Projectile var24;
        Projectile var25;
        double var6Lifetime1;
        double var6Lifetime2;
        double var6Lifetime3;
        int var11Lifetime1;
        ArticulatedPart[] var4_arrayLifetime1;
        var19 = SteelSentinels.obfuscationControl;
        if (!param0) {
          return;
        }
        var2 = 0;
        var3 = null;
        var4 = (Projectile) (this.world.field_db.first(13058));
        while (var4 != null) {
          if (var4.ageTicks > 8 &&
            !var4.field_T && (var4.sourceSentinel == null ||
            var4.sourceSentinel.teamId != this.teamId) && (var4.effectType == 3 ||
            var4.effectType == 2 ||
            20 == var4.effectType) && var4.sourceWeaponType != 32) {
            var5_int = this.worldX - var4.worldX;
            var6_int = -var4.worldY + this.worldY;
            if (var6_int * var4.velocityY + var5_int * var4.velocityX <= 0) {
              var4 = (Projectile) (this.world.field_db.next((byte) -23));
              continue;
            }
            if (var3 == null ||
              var5_int * var5_int + var6_int * var6_int < var2) {
              var2 = var5_int * var5_int + var6_int * var6_int;
              var3 = var4;
            }
          }
          var4 = (Projectile) (this.world.field_db.next((byte) -23));
        }
        if (var3 != null) {
          this.chassis.b((byte) -128, 0, this.field_E, 0);
          var4_array = new ArticulatedPart[]{};
          var5 = null;
          var8 = -this.worldX + ((Projectile) (var3)).worldX;
          var9 = ((Projectile) (var3)).worldY - this.worldY;
          var21 = new SentinelCommand(0, 1, 1 + this.world.simulationTick);
          var5_ref = var21;
          var21.targetWorldY = ((Projectile) (var3)).worldY;
          var21.targetWorldX = ((Projectile) (var3)).worldX;
          var6 = Math.atan2((double)var8, (double)(-var9));
          var21.aimAngle = (int)(65536.0 * var6 / 6.283185307179586);
          this.chassis.a(this.field_E * var21.aimAngle, -96, 1);
          var20 = this.chassis.a(0, this, new ArticulatedPart[]{}, var21.aimAngle * this.field_E, 1);
          var4_arrayLifetime1 = var20;
          if (var20.length == 0) {
            var22 = new SentinelCommand(0, 0, 1 + this.world.simulationTick);
            var5_ref = var22;
            var22.endTick = var22.startTick + 25;
            var22.targetWorldY = ((Projectile) (var3)).worldY;
            var22.targetWorldX = ((Projectile) (var3)).worldX;
            var6Lifetime1 = Math.atan2((double)var8, (double)(-var9));
            var22.aimAngle = (int)(65536.0 * var6Lifetime1 / 6.283185307179586);
            this.chassis.a(var22.aimAngle * this.field_E, -86, 0);
            var4_arrayLifetime1 = this.chassis.a(0, this, new ArticulatedPart[]{}, this.field_E * var22.aimAngle, 0);
          }
          if (var4_arrayLifetime1.length == 0 &&
            1 <= this.charge) {
            var23 = new SentinelCommand(0, 7, this.world.simulationTick + 1);
            var5_ref = var23;
            var23.targetWorldX = ((Projectile) (var3)).worldX;
            var23.targetWorldY = ((Projectile) (var3)).worldY;
            var6Lifetime2 = Math.atan2((double)var8, (double)(-var9));
            var23.aimAngle = (int)(var6Lifetime2 * 65536.0 / 6.283185307179586);
            this.chassis.a(var23.aimAngle * this.field_E, -95, 7);
            var4_arrayLifetime1 = this.chassis.a(0, this, new ArticulatedPart[]{}, var23.aimAngle * this.field_E, 7);
          }
          this.chassis.b((byte) -128, 0, this.field_E, 0);
          var10 = 0;
          for (var11 = 0; var11 < var4_arrayLifetime1.length; var11++) {
            var10 = var10 + var4_arrayLifetime1[var11].field_V;
          }
          var11Lifetime1 = 0;
          if (var4_arrayLifetime1.length > 0) {
            var12 = this.worldY + var10 / var4_arrayLifetime1.length;
            var13 = var5_ref.targetWorldX - this.worldX;
            var14 = var5_ref.targetWorldY - var12;
            var15 = this.worldX >> 4;
            var16 = var12 >> 4;
            var17 = var5_ref.targetWorldX >> 4;
            var18 = var5_ref.targetWorldY >> 4;
            stackIn_37_0 = (!this.world.a(var18, var14, var13, var16, var15, (byte) 112, var17)) ? 0 : 1;
            var11Lifetime1 = stackIn_37_0;
          }
          if (0 < var4_arrayLifetime1.length) {
            var9 = var9 - var10 / var4_arrayLifetime1.length;
            if ((var9 >> 4) * (var9 >> 4) + (var8 >> 4) * (var8 >> 4) < 10000000 &&
              var11Lifetime1 == 0) {
              ((Projectile) (var3)).field_T = true;
              this.field_ob = this.field_ob + 1;
              ((Projectile) (var3)).field_bb = true;
              if (17 != var4_arrayLifetime1[0].componentId) {
                if (var4_arrayLifetime1[0].componentId == 28) {
                  var25 = new Projectile(((Projectile) (var3)).worldX, ((Projectile) (var3)).worldY, 0, 0, 0, 0, 7, this.world, this, 0, 0, 0);
                  var25.a(10, 750, 2, -121, 500);
                }
              } else {
                var24 = new Projectile(((Projectile) (var3)).worldX, ((Projectile) (var3)).worldY, 0, 0, 0, 0, 7, this.world, this, 0, 0, 0);
                var24.a(2, 500, 2, -106, 100);
              }
              ((Projectile) (var3)).sourceSentinel = this;
            }
          }
          var6Lifetime3 = Math.atan2((double)var8, (double)(-var9));
          var5_ref.aimAngle = (int)(65536.0 * var6Lifetime3 / 6.283185307179586);
          if (this.field_E >= 0) {
            if (var5_ref.aimAngle < -16384) {
              var5_ref.aimAngle = var5_ref.aimAngle + 65536;
            }
          } else {
            if (var5_ref.aimAngle > 16384) {
              var5_ref.aimAngle = var5_ref.aimAngle - 65536;
            }
          }
          var5_ref.scheduled = true;
          if (!((Projectile) (var3)).field_T) {
            return;
          }
          this.pendingCommands.a(var5_ref, -21459);
          return;
        }
        return;
    }

    final void a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        IndexedSprite var9;
        Object var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int[] var14;
        if (this.activeModuleType == -1) {
          return;
        }
        var5 = 20;
        var6 = var5;
        if (this.field_xb) {
          var6 = var6 + (4 + fk.field_d.field_U);
        }
        var7 = var5;
        var8 = var6;
        if (0 != this.field_F &&
          param1) {
          var8 = var8 * (-Math.abs(this.field_F) + 250) / 250;
        }
        SoftwareRaster.c(-(var7 / 2) + param2, -var6 + param0, var7, var8, 0, 128);
        var9 = nc.a(this.activeModuleType, (byte) -102);
        SoftwareRaster.h(param2 - var7 / 2, param0 - var6, var7, var8, 16711935, 128 + jh.a(200 * this.world.simulationTick, param3 ^ 4141) / 513);
        if (param3 != 45) {
          var11 = (int[]) null;
          this.a(82, -14, (int[]) null, -75);
        }
        var10 = null;
        if (var8 < var6) {
          var14 = new int[4];
          var13 = var14;
          var12 = var13;
          var10 = var12;
          SoftwareRaster.b(var14);
          SoftwareRaster.h(-(var7 / 2) + param2, -var6 + param0, param2 + var7 / 2, -var6 + (param0 + var8));
        }
        var9.c(-(var5 / 2) + param2, -var5 + param0);
        if (this.field_xb) {
          fk.field_d.a(Integer.toString((49 + this.field_v) / 50), param2, -2 + (param0 - var5), 16777215, 0);
        }
        if (var10 != null) {
          SoftwareRaster.a((int[]) (var10));
        }
        return;
    }

    final void a(byte param0, Projectile param1) {
        boolean stackIn_21_1 = false;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sentinel var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Sentinel var6 = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var6 = param1.sourceSentinel;
          var3 = var6;
          if (var6 != null &&
            null != param1.field_G &&
            param1.field_G.teamId != var6.teamId &&
            var6.teamId == this.teamId ||
            var6 == this) {
            var3 = param1.field_G;
          }
          if (param0 <= 9) {
            this.advanceCommandQueues((byte) 19, 121);
          }
          this.field_Cc = false;
          if (var3 != null &&
            var3.teamId != this.teamId) {
            var3.field_pb = 0;
            var3.field_t = 0;
          }
          this.field_Ib = var3;
          if (var3 != null && (var3.field_Nb == 0 ||
            var3.field_Nb == 11)) {
            this.field_yc = param1.sourceWeaponType;
            this.field_L = var3;
            stackIn_21_1 = (var3 != param1.field_G);
            this.field_zb = stackIn_21_1;
            if (15 == param1.sourceWeaponType &&
              param1.ageTicks >= param1.field_jb &&
              param1.field_E) {
              this.field_Cc = true;
            }
          }
          this.field_ac = param1.sourceWeaponType;
          var4 = param1.effectType;
          if (var4 != 11 &&
            17 != var4) {
            if (var4 != 15 &&
              var4 != 14 &&
              var4 != 12) {
              if (var4 == 13) {
                this.field_dc = true;
                this.field_sc = false;
                return;
              }
              if (var4 != 16) {
                this.field_sc = param1.field_ab;
                return;
              }
            }
            this.field_dc = true;
            this.field_sc = false;
            return;
          }
          this.field_sc = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_40_0 = var3_ref;
          stackIn_40_1 = new StringBuilder().append("mb.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void clearArmour(int obfuscationGuard) {
        boolean discarded$0 = false;
        if (this.playerId == 0) {
          this.world.field_a = this.world.field_a - 128 * this.armour;
        }
        this.armour = 0;
        if (obfuscationGuard != 128) {
          discarded$0 = this.a(87, 110, false, 67, (byte) -33, true, -26, -114);
        }
    }

    final boolean a(int param0, int param1, int param2, Sentinel param3, int param4) {
        int stackIn_15_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        SentinelCommand var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        int var11Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var12Lifetime2;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_Hb) {
            return false;
          }
          if (param3 == null) {
            stackIn_15_0 = 0;
          } else {
            if (param3.hasModuleType(21, param2 - 16711707)) {
              if (this.field_F >= 250) {
                stackIn_15_0 = (0 < this.field_S) ? 1 : 0;
              } else {
                stackIn_15_0 = 1;
              }
            } else {
              stackIn_15_0 = 0;
            }
          }
          var6_int = stackIn_15_0;
          var7 = Math.abs(this.field_F) * 64 / 250;
          if (var7 > 64) {
            var7 = 64;
          }
          var7 = -var7 + 64;
          var8 = param1 * 12 >> 12;
          if (var8 < 1) {
            var8 = 1;
          }
          var9 = (this.worldX * param1 >> 16) + param4;
          var10 = (this.worldY * param1 >> 16) + param0;
          if (param2 != 16711680) {
            var17 = (SentinelCommand) null;
            this.scheduleCommand((byte) 107, (SentinelCommand) null);
          }
          if (this.chassis.componentId != 109 &&
            !this.field_pc &&
            param3 != this) {
            var11 = this.field_Ub * param1 >> 11;
            SoftwareRaster.c(-(var11 / 2) + (var9 - 1), 5 + (-1 + var10), 2 + var11, 5, 0, var7 * 3);
            var12 = Math.max(0, Math.min(this.armour * var11 / this.maximumArmour, var11));
            for (var13 = 1; var13 <= 5; var13++) {
              SoftwareRaster.c(-(var11 / 2) + (var9 + (var12 - var13 * var12 / 5)), var10 + 5, var13 * var12 / 5, 3, 65280, 2 * var7);
            }
            var13 = Math.max(0, Math.min(var11 * this.field_G / this.maximumArmour, var11));
            SoftwareRaster.c(var9 - var11 / 2 + var12, var10 + 5, -var12 + var13, 3, 16711680, var7 * 2 * this.field_P / 100);
            if (0 < this.field_Q) {
              var12Lifetime2 = Math.max(0, Math.min(var11 * this.field_S / this.field_Q, var11));
              for (var14 = 1; var14 <= 5; var14++) {
                SoftwareRaster.c(-(var14 * var12Lifetime2 / 5) + (-(var11 / 2) + (var9 + var12Lifetime2)), var10 + 6, var12Lifetime2 * var14 / 5, 1, 65535, var7);
                SoftwareRaster.c(-(var12Lifetime2 * var14 / 5) - var11 / 2 + (var9 + var12Lifetime2), var10 + 7, var12Lifetime2 * var14 / 5, 1, 65535, var7 * 2);
              }
            }
          }
          var11Lifetime1 = -(param1 * this.field_Db >> 12) + (var10 - 4);
          var12Lifetime1 = 0;
          var13 = di.field_g;
          if (0 != var13 &&
            1 != var13 &&
            var13 != 3 &&
            var13 != 5 &&
            var13 != 7) {
            if (var13 == 10 &&
              ge.field_j == 0 &&
              ol.field_Ub != 2) {
              var12Lifetime1 = 1;
            }
          } else {
            var12Lifetime1 = 1;
          }
          if (this != param3) {
            if (this.playerId >= 0 &&
              this.world.playerNames.length > this.playerId) {
              var20 = this.world.d(-1661904765, this.playerId);
              var14Lifetime1 = this.getTeamColour((byte) 104);
              if (var14Lifetime1 == PartInstruction.field_t[0]) {
                var14Lifetime1 = 12583104;
              }
              fk.field_d.c(var20, var9, 1 + var11Lifetime1, 0, -1, 3 * var7);
              fk.field_d.c(var20, 1 + var9, var11Lifetime1, 0, -1, 3 * var7);
              fk.field_d.c(var20, var9, var11Lifetime1, var14Lifetime1, -1, 4 * var7);
            } else {
              if (this.field_Nb == 11) {
                var23 = this.world.d(param2 ^ -1676781437, this.playerId);
                var14Lifetime1 = this.getTeamColour((byte) -123);
                fk.field_d.c(var23, var9, 1 + var11Lifetime1, 0, -1, var7 * 3);
                fk.field_d.c(var23, 1 + var9, var11Lifetime1, 0, -1, 3 * var7);
                fk.field_d.c(var23, var9, var11Lifetime1, var14Lifetime1, -1, 4 * var7);
              } else {
                if (var12Lifetime1 != 0 &&
                  ol.field_Ub == 0 &&
                  9 >= qh.field_Yb) {
                  var22 = db.field_f;
                  fk.field_d.c(var22, var9, 1 + var11Lifetime1, 0, -1, 3 * var7);
                  fk.field_d.c(var22, var9 + 1, var11Lifetime1, 0, -1, var7 * 3);
                  fk.field_d.c(var22, var9, var11Lifetime1, 10085888, -1, 4 * var7);
                } else {
                  var21 = "^";
                  stackIn_63_0 = (var12Lifetime1 != 0) ? 10085888 : 16711680;
                  var14Lifetime1 = stackIn_63_0;
                  dk.field_h.c(var21, var9, var11Lifetime1 + 1, 0, -1, var7 * 3);
                  dk.field_h.c(var21, var9 + 1, var11Lifetime1, 0, -1, 3 * var7);
                  dk.field_h.c(var21, var9, var11Lifetime1, var14Lifetime1, -1, 4 * var7);
                }
              }
            }
          }
          if (var6_int != 0) {
            var11Lifetime1 -= 10;
            if (this.field_Vb == param3 &&
              (16 & this.world.simulationTick) != 0) {
              fk.field_d.c(ac.field_gb, var9, var11Lifetime1, 16711680, 0, 128);
              var11Lifetime1 -= 10;
            }
            if (this.chassis.componentId != 109) {
              if (this.field_ub >= 0) {
                if (this.field_mc > 0) {
                  var13 = this.field_mc / 50;
                  var19 = db.a(f.field_E, -47, new String[]{Integer.toString(var13)});
                  var15 = db.a("<%0> - <%1>", -82, new String[]{r.field_i, var19});
                  fk.field_d.c(var15, var9, var11Lifetime1, 16777215, 0, 128);
                  var11Lifetime1 -= 10;
                }
              } else {
                var13 = -this.field_ub / (50 * (this.field_wb + 2));
                var18 = db.a(f.field_E, -56, new String[]{Integer.toString(var13)});
                var15 = db.a("<%0> - <%1>", -73, new String[]{hk.field_pc, var18});
                fk.field_d.c(var15, var9, var11Lifetime1, 16777215, 0, 128);
                var11Lifetime1 -= 10;
              }
            }
          }
          if (this.activeModuleType != -1) {
            if (Math.abs(this.field_F) >= 250) {
              return false;
            }
            var13 = -(param1 >> 5) + var11Lifetime1;
            this.a(var13, true, var9, (byte) 45);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_85_0 = var6;
          stackIn_85_1 = new StringBuilder().append("mb.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param4).append(')').toString());
        }
    }

    final void consumeCharge(boolean obfuscationGuard, int amount) {
        amount = Math.min(this.maximumCharge, this.charge - amount);
        if (this.activeModuleType == 37) {
          amount = 40;
        }
        if (!obfuscationGuard) {
          this.field_pb = -107;
        }
        if (this.playerId == 0) {
          this.world.field_N = this.world.field_N + (this.world.simulationTick + amount - this.charge) * 256;
          this.world.field_f = this.world.field_f - 128 * this.world.simulationTick;
        }
        this.charge = amount;
    }

    private final void a(SentinelCommand param0, byte param1) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (di.field_g == 0 &&
            qh.field_Yb == 6) {
            tj.field_c = 1;
          }
          var3_int = -this.worldX + param0.targetWorldX >> 4;
          var4 = param0.targetWorldY - this.worldY >> 4;
          var5 = ik.a(var3_int * var3_int + var4 * var4, 50);
          if (param1 > -72) {
            this.field_S = 104;
          }
          this.field_bb = 0;
          if (0 < var5) {
            var6 = 32 * this.field_Fb;
            if (this.field_Fb < 5) {
              var6 = 16 * this.field_cb;
              this.field_bb = 25 + this.field_cb;
            }
            if (var6 > 640) {
              var6 = 640;
            }
            if (!this.field_Lb) {
              fc.a((byte) 69, 1, this.worldX);
            } else {
              if (this.field_cb >= 15) {
                stackIn_15_0 = 15;
              } else {
                stackIn_15_0 = this.field_cb;
              }
              var6 = stackIn_15_0 * 32;
              fc.a((byte) -72, 2, this.worldX);
              this.field_bb = 25 + this.field_cb;
            }
            if (this.field_pc) {
              this.field_pc = false;
              if (var6 < 32 * this.field_Fb) {
                var6 = 32 * this.field_Fb;
              }
            }
            if (var5 / 2 < var6) {
              var6 = var5 / 2;
            }
            this.velocityY = var4 * var6 / var5;
            this.velocityX = var6 * var3_int / var5;
            if (0 > this.velocityX) {
              this.field_E = -1;
            }
            this.field_X = -this.velocityX;
            if (this.velocityX > 0) {
              this.field_E = 1;
            }
            this.field_lc = -this.velocityY;
          }
          if (this.world.field_fb &&
            null != this.chassis &&
            this.chassis.componentId == 108) {
            this.field_bb = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("mb.F(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 > -15) {
          this.field_yb = -7;
        }
        boolean discarded$0 = this.a(param0, param1, false, 0, (byte) -81, true, 0, param2);
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        try {
          if (param1 != 3) {
            this.field_qb = (pc) null;
          }
          this.configureDesign(param2, true, true, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "mb.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean hasModuleType(int moduleType, int obfuscationGuard) {
        int var3 = 0;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (moduleType == this.activeModuleType) {
          return true;
        }
        if (this.activeModuleType == 40) {
          if (moduleType == 27) {
            return true;
          }
          if (moduleType == 26) {
            return true;
          }
        }
        if (obfuscationGuard != -27) {
          this.j(53);
        }
        for (var3 = 0; var3 < this.moduleCount; var3++) {
          if (this.moduleTypes[var3] == moduleType) {
            return true;
          }
          if (this.moduleTypes[var3] == 34 &&
            moduleType < 35 &&
            20 != moduleType &&
            30 != moduleType) {
            return true;
          }
        }
        return false;
    }

    final int getTeamColour(byte obfuscationGuard) {
        int var2 = 118 % ((obfuscationGuard + 48) / 44);
        if (this.teamId >= 0 &&
          !(fj.field_h.length <= this.teamId)) {
          return fj.field_h[this.teamId];
        }
        if (this.teamId == 12) {
          return 16776960;
        }
        return 16777215;
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, byte param4, boolean param5, int param6, int param7) {
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_127_1 = 0;
        boolean stackIn_142_0 = false;
        IndexedSprite var9;
        IndexedSprite var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        double var19_double;
        int var19;
        int var20;
        double var21_double;
        int var21;
        double var22;
        int var23;
        int var24_int;
        double var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var32 = SteelSentinels.obfuscationControl;
        if (this.field_Hb) {
          return false;
        }
        var9 = this.chassis.field_U;
        var10 = this.chassis.field_H;
        if (this.world.field_fb &&
          this.chassis != null &&
          this.chassis.componentId == 108) {
          var11 = (this.playerId + this.world.simulationTick & 14) >> 1;
          this.chassis.field_U = ja.field_d[var11];
          this.chassis.field_H = ja.field_d[var11];
        }
        if (109 == this.chassis.componentId) {
          var11Lifetime1 = this.field_r;
          stackIn_12_0 = -8 + param0;
          if (param5) {
            stackIn_13_1 = 0;
          } else {
            stackIn_13_1 = this.worldX * param1 >> 16;
          }
          var12 = stackIn_12_0 + stackIn_13_1;
          if (param5) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.worldY * param1 >> 16;
          }
          var13_int = stackIn_16_0 + param7 - 11;
          if (0 < this.field_E) {
            ArchiveProvider.field_a[var11Lifetime1].b(var12, var13_int);
          } else {
            ArchiveProvider.field_a[var11Lifetime1].b().b(var12, var13_int);
          }
          return false;
        }
        var11Lifetime2 = param1 * (128 + this.field_Db) >> 13;
        var12Lifetime1 = 12 * param1 >> 12;
        if (1 > var12Lifetime1) {
          var12Lifetime1 = 1;
        }
        var13 = new int[]{0, 0};
        var14 = -101 / ((58 - param4) / 42);
        if (null != this.chassis) {
          if (this.teamId >= 0 &&
            12 > this.teamId) {
            for (var15 = 0; var15 < 64; var15++) {
              var16 = 16711935 & fj.field_a[this.teamId];
              var17 = 255 & fj.field_a[this.teamId] >> 8;
              var18 = 255 * var15 / 64;
              rm.field_h[var15 + 1] = ec.a(16711935, var16 * var18 >> 8) + ec.a(65280, var18 * var17);
              rm.field_h[64 + var15] = this.field_ic * (var18 >> 1);
            }
          } else {
            if (this.teamId == 12) {
              for (var15 = 0; var15 < 64; var15++) {
                var16 = fj.field_a[0] & 16711935;
                var17 = fj.field_a[0] >> 8 & 255;
                var18 = 255 * var15 / 64;
                rm.field_h[1 + var15] = ec.a(16711935, var18 * var16 >> 8) + ec.a(var18 * var17, 65280);
                rm.field_h[var15 + 64] = 65793 * (var18 >> 1);
              }
            }
          }
          var13 = this.f(this.chassis.componentId, 22742);
        }
        this.worldX = this.worldX + var13[0] * this.field_E;
        this.field_fc = this.field_fc + var13[1];
        if (param5) {
          stackIn_38_0 = 0;
        } else {
          stackIn_38_0 = this.worldX * param1 >> 16;
        }
        var15Lifetime1 = stackIn_38_0 + param0;
        stackIn_40_0 = param7;
        if (param5) {
          stackIn_41_1 = 0;
        } else {
          stackIn_41_1 = param1 * this.field_fc >> 16;
        }
        var16Lifetime1 = stackIn_40_0 + stackIn_41_1;
        var17Lifetime1 = Math.abs(this.field_F);
        if ((!this.field_pc ||
          4 == this.world.terrain.getTerrainType(48) &&
          this.field_Qb >= 225) && null != this.chassis) {
          hj.field_w = 2 * param1;
          if (var17Lifetime1 >= 250) {
            qh.b(1000, var16Lifetime1 - var11Lifetime2 << 4, 15, var15Lifetime1 << 4, var11Lifetime2 << 4);
          } else {
            if (var17Lifetime1 <= 100) {
              if (var17Lifetime1 > 50) {
                this.chassis.a((byte) 112, var15Lifetime1, var16Lifetime1, this.field_E);
                qh.b(var17Lifetime1 * 400 - 20000, -var11Lifetime2 + var16Lifetime1 << 4, 15, var15Lifetime1 << 4, var11Lifetime2 << 4);
              } else {
                this.chassis.a((byte) 125, var15Lifetime1, var16Lifetime1, this.field_E);
              }
            } else {
              hj.field_w = hj.field_w * (-var17Lifetime1 + 250) / 150;
              this.chassis.a((byte) 118, var15Lifetime1, var16Lifetime1 - var11Lifetime2 * (var17Lifetime1 - 100) / 150, this.field_E);
              qh.b(19000 * (-var17Lifetime1 + 250) / 150 + 1000, var16Lifetime1 - var11Lifetime2 << 4, 15, var15Lifetime1 << 4, var11Lifetime2 << 4);
            }
          }
        }
        this.field_fc = this.field_fc - var13[1];
        this.worldX = this.worldX - this.field_E * var13[0];
        this.chassis.field_H = var10;
        this.chassis.field_U = var9;
        if (this.field_pc) {
          stackIn_57_0 = param0;
          if (!param5) {
            stackIn_58_1 = param1 * this.worldX >> 16;
          } else {
            stackIn_58_1 = 0;
          }
          var15Lifetime1 = stackIn_57_0 + stackIn_58_1;
          if (param5) {
            stackIn_61_0 = 0;
          } else {
            stackIn_61_0 = param1 * this.field_fc >> 16;
          }
          var16Lifetime1 = stackIn_61_0 + param7;
          var18Lifetime1 = Math.abs(this.world.simulationTick) / 5 % 3;
          var19_double = 1.4;
          var21_double = var19_double * (double)param1 / 4096.0;
          var23 = (int)((double)this.field_Ub * var21_double);
          if (79 == this.chassis.componentId &&
            var23 < 36) {
            var23 = 36;
          }
          var24_int = (int)((double)this.field_Db * var21_double);
          if (var23 < var24_int) {
            var23 = var24_int;
          } else {
            if (var23 > var24_int) {
              var24_int = var23;
            }
          }
          stackIn_70_0 = param0;
          if (param5) {
            stackIn_71_1 = 0;
          } else {
            stackIn_71_1 = param1 * this.worldX >> 16;
          }
          var15Lifetime1 = stackIn_70_0 + stackIn_71_1;
          var25 = -(var23 / 2) + var15Lifetime1;
          var26 = var16Lifetime1 - (int)(((-1.0 + var19_double) / 2.0 + 1.0) * ((double)var24_int / var19_double));
          var27 = 16777215;
          if (di.field_g == -1 && (this.world.field_P == 3 &&
            this.world.playerCount > 1 ||
            (1 == this.world.field_P ||
            this.world.field_P == 2)) && (0 <= this.teamId &&
            fj.field_h.length > this.teamId)) {
            var27 = uj.a(fj.field_h[this.teamId], 124);
          }
          if (this.world.terrain.getTerrainType(50) != 4) {
            if (var27 == 16777215) {
              ml.field_c[var18Lifetime1].b(var25, var26, var23, var24_int);
            } else {
              ml.field_c[var18Lifetime1].a(var25, var26, var23, var24_int, var27);
            }
          } else {
            var28 = SoftwareRaster.field_i;
            var29 = SoftwareRaster.field_b;
            var30 = SoftwareRaster.field_l;
            var31 = SoftwareRaster.field_d;
            SoftwareRaster.h(0, 0, 640, var26 + var24_int);
            if (200 > this.field_Qb) {
              var26 = var26 + (-(this.field_Qb * var24_int / 200) + var24_int);
            }
            if (225 <= this.field_Qb) {
              var26 = var26 + var24_int * (-225 + this.field_Qb) / 25;
            }
            if (var27 != 16777215) {
              ml.field_c[var18Lifetime1].a(var25, var26, var23, var24_int, var27);
            } else {
              ml.field_c[var18Lifetime1].b(var25, var26, var23, var24_int);
            }
            SoftwareRaster.a(var28, var30, var29, var31);
          }
        }
        if (this.field_S > 0 &&
          !this.field_pc) {
          var18Lifetime2 = 1;
          var19 = 50;
          if (this.hasModuleType(11, -27)) {
            var19 = 100;
            var18Lifetime2 = 2;
          }
          if (this.hasModuleType(12, -27)) {
            var19 = 200;
            var18Lifetime2 = 3;
          }
          if (this.hasModuleType(13, -27)) {
            var19 = 500;
            var18Lifetime2 = 4;
          }
          if (this.hasModuleType(14, -27)) {
            var19 = 1000;
            var18Lifetime2 = 5;
          }
          var20 = var18Lifetime2 * (256 * this.field_S) / var19;
          if (256 * var18Lifetime2 < var20) {
            var20 = 256 * var18Lifetime2;
          }
          var21 = 6 + this.world.simulationTick / 4 % 6;
          if (this.world.field_P != 0) {
            if (0 <= this.teamId &&
              this.teamId < 12 &&
              fj.field_a[this.teamId] == 65535) {
              var21 -= 6;
            }
          } else {
            if (ed.field_j == this.playerId) {
              var21 -= 6;
            }
          }
          var22 = 1.4;
          if (this.field_P > 0) {
            var22 = var22 + Math.random() * 0.5;
          }
          var24 = (double)param1 * var22 / 4096.0;
          var26Lifetime1 = (int)((double)this.field_Ub * var24);
          var27Lifetime1 = (int)((double)this.field_Db * var24);
          if (var26Lifetime1 < var27Lifetime1 / 2) {
            var26Lifetime1 = var27Lifetime1 / 2;
          } else {
            if (var26Lifetime1 / 2 > var27Lifetime1) {
              var27Lifetime1 = var26Lifetime1 / 2;
            }
          }
          stackIn_126_0 = param0;
          if (param5) {
            stackIn_127_1 = 0;
          } else {
            stackIn_127_1 = param1 * this.worldX >> 16;
          }
          var15Lifetime1 = stackIn_126_0 + stackIn_127_1;
          var28Lifetime1 = var15Lifetime1 - var26Lifetime1 / 2;
          var29Lifetime1 = var16Lifetime1 - (int)((double)var27Lifetime1 / var22 * ((-1.0 + var22) / 2.0 + 1.0));
          if (var20 < 256) {
            b.field_n[var21].d(var28Lifetime1, var29Lifetime1, var26Lifetime1, var27Lifetime1, var20);
          } else {
            b.field_n[var21].d(var28Lifetime1, var29Lifetime1, var26Lifetime1, var27Lifetime1, 256);
          }
        }
        if (this.field_Cb) {
          var18Lifetime3 = this.getTeamColour((byte) -122);
          SoftwareRaster.c(var15Lifetime1, -var11Lifetime2 + var16Lifetime1, -(-4 + this.world.simulationTick / 10 & 7) + (var11Lifetime2 + 7), var18Lifetime3);
          SoftwareRaster.c(var15Lifetime1, var16Lifetime1 - var11Lifetime2, -(7 & this.world.simulationTick / 10) + var11Lifetime2 + 7, var18Lifetime3);
        }
        var18Lifetime4 = 4;
        if (-var18Lifetime4 + (var15Lifetime1 - var11Lifetime2) <= param3 &&
          param6 >= -var18Lifetime4 + (var16Lifetime1 - 2 * var11Lifetime2) &&
          param3 < var18Lifetime4 + var11Lifetime2 + var15Lifetime1) {
          if (var18Lifetime4 + var16Lifetime1 <= param6) {
            return false;
          }
          stackIn_142_0 = !(this.field_F >= 250) || !(this.field_S <= 0) || (this.field_Cb);
          return stackIn_142_0;
        }
        return false;
    }

    Sentinel(int param0, int param1, CombatWorld param2) {
        this.field_Yb = 0;
        this.field_kc = 0;
        this.field_cc = 0;
        this.field_Bc = 0;
        this.activeModuleType = -1;
        this.field_H = 0;
        this.field_C = 0;
        this.field_pb = 0;
        this.field_Wb = 0;
        this.field_fb = 0;
        this.field_tb = 0;
        this.field_y = 0;
        this.field_tc = 0;
        this.field_Jb = false;
        this.field_q = 0;
        this.field_W = -1;
        this.field_o = -1;
        this.field_yb = 0;
        this.field_t = 0;
        this.field_Sb = 0;
        this.field_zb = false;
        this.field_Y = 0;
        this.field_jb = new int[7];
        this.field_wc = 0;
        this.field_eb = 0;
        this.field_R = 0;
        this.field_V = false;
        this.field_kb = 0;
        this.field_sb = 0;
        this.field_ib = false;
        this.field_vc = 0;
        this.field_zc = 0;
        this.field_ob = 0;
        this.field_w = 0;
        this.field_O = 0;
        this.armour = 0;
        this.field_db = 0;
        this.field_u = false;
        this.field_p = 0;
        this.field_N = -1;
        this.field_A = 0;
        this.field_Ac = 0;
        this.field_qc = 0;
        this.field_hb = -1;
        this.field_Rb = 0;
        this.field_z = 0;
        try {
          this.worldX = param0;
          this.worldY = param1;
          this.world = param2;
          this.field_fc = this.worldY;
          this.velocityY = 0;
          this.velocityX = 0;
          if (this.worldX < 8 * this.world.terrain.getProfileLength(-120)) {
            this.field_E = 1;
          } else {
            this.field_E = -1;
          }
          this.secondaryCommands = new NodeDeque();
          this.pendingCommands = new NodeDeque();
          this.velocityY = 1000;
          this.field_Nb = 0;
          this.field_pc = true;
          this.field_gc = false;
          this.field_L = null;
          this.field_ic = 131586;
          this.field_Ib = null;
          this.field_Hb = false;
          this.field_vb = 0;
          this.velocityX = 0;
          this.field_ac = -1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "mb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = "Fire:";
        field_Ob = "This option cannot be combined with the current settings for:  ";
        field_D = "OK";
    }
}
