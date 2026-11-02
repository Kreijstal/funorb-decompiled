/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Ship extends ShipBody implements DiffableState, utb {
    private int[] field_x;
    private int energy;
    private int repairModeReload;
    private boolean repairModeOn;
    private int field_A;
    private boolean shieldsOn;
    private qua field_L;
    private ShipBlueprint targetBlueprint;
    private int team;
    static int field_H;
    private int dragging;
    static int field_E;
    private int selfDestructCountdown;
    private int shieldsToggleCooldown;
    boolean salvoJustFired;
    private int owner;
    private boolean selfDestructPrepared;
    private int spawnTimer;
    boolean field_D;
    private int reloadtimer;
    private int[] lastAttackers;
    private int maxEnergy;
    private boolean selfDestructActivated;
    boolean justAttachedSomething;
    private ShipAI ai;

    final void g(int param0, int param1) {
        int var3 = -108 % ((param1 - 35) / 49);
        this.owner = param0;
    }

    public final void a(faa param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, 32);
          this.owner = param0.i(0, 32);
          this.team = param0.i(param1 ^ 32, 32);
          this.dragging = param0.i(param1 - 32, 32);
          if (!kv.a(false, param0)) {
            this.ai = null;
          } else {
            if (this.ai == null) {
              this.ai = new ShipAI();
            }
            this.ai.a(param0, false);
          }
          this.energy = param0.i(0, 32);
          this.reloadtimer = param0.i(0, 32);
          this.maxEnergy = param0.i(0, 32);
          this.repairModeReload = param0.i(0, 32);
          this.repairModeOn = kv.a(false, param0);
          this.selfDestructPrepared = kv.a(false, param0);
          this.selfDestructActivated = kv.a(false, param0);
          this.selfDestructCountdown = param0.i(0, param1);
          this.salvoJustFired = kv.a(false, param0);
          this.justAttachedSomething = kv.a(false, param0);
          this.shieldsOn = kv.a(false, param0);
          this.shieldsToggleCooldown = param0.i(0, 32);
          this.lastAttackers = wkb.a((byte) 37, this.lastAttackers, param0, 4);
          if (!kv.a(false, param0)) {
            this.targetBlueprint = null;
          } else {
            if (this.targetBlueprint == null) {
              this.targetBlueprint = new ShipBlueprint();
            }
            this.targetBlueprint.a(param0, false);
          }
          this.spawnTimer = param0.i(0, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sg.L(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean q(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -6) {
          this.field_x = (int[]) null;
        }
        stackIn_6_0 = (this.repairModeOn) && (Particle.field_I == this.repairModeReload);
        return stackIn_6_0;
    }

    final void a(byte param0, ShipBlueprint param1) {
        try {
          int var3_int = -32 % ((-79 - param0) / 42);
          this.targetBlueprint = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int w(int param0) {
        if (param0 <= 36) {
          this.field_x = (int[]) null;
        }
        return this.repairModeReload;
    }

    final boolean s(int param0) {
        ShipAI var3;
        boolean stackIn_7_0 = false;
        if (param0 < 31) {
          var3 = (ShipAI) null;
          this.a((ShipAI) null, -101);
        }
        stackIn_7_0 = (1 == vqa.field_k) || !(this.g(false));
        return stackIn_7_0;
    }

    final void a(int[] param0, int param1) {
        if (param1 >= -7) {
          return;
        }
        try {
          this.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(qua param0, int param1) {
        try {
          this.field_L = param0;
          if (param1 != 3) {
            this.getOwner((byte) -104);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.ID(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 76 / ((param0 - 49) / 42);
        stackIn_4_0 = (this.ai == null) && (this.spawnTimer < Particle.field_A);
        return stackIn_4_0;
    }

    final boolean getShieldsOn(int param0) {
        if (param0 != 31390) {
          this.A(125);
        }
        return this.shieldsOn;
    }

    final int d(int param0) {
        if (param0 < 42) {
          field_H = -63;
          return 1;
        }
        return 1;
    }

    final void e(byte param0) {
        super.e(param0);
        this.maxEnergy = PartitionZone.field_e + this.chassis.a(0);
    }

    final boolean getSelfDestructPrepared(byte param0) {
        if (param0 >= -83) {
          return false;
        }
        return this.selfDestructPrepared;
    }

    final boolean s(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -90) {
          this.getSelfDestructPrepared((byte) -68);
        }
        stackIn_6_0 = (this.energy <= 0) && (this.reloadtimer > 0);
        return stackIn_6_0;
    }

    final void m(int param0) {
        if (param0 != -13539) {
          return;
        }
        if (this.shieldsToggleCooldown > 0) {
        } else {
          this.shieldsOn = !this.shieldsOn ? true : false;
          this.shieldsToggleCooldown = pca.field_i[3].d((byte) 64);
          this.d((byte) 39);
          if (!this.shieldsOn) {
            qba.a(20382, this.d(false), 25, this.g((byte) -3), 50);
          } else {
            qba.a(20382, this.d(false), 26, this.g((byte) -71), 50);
          }
        }
    }

    private final void B(int param0) {
        this.lastAttackers = null;
        if (param0 >= -127) {
          this.targetBlueprint = (ShipBlueprint) null;
        }
    }

    final void a(boolean param0, World param1) {
        try {
          if (!param0) {
            tv var4 = (tv) null;
            this.a((byte) 18, (tv) null);
          }
          this.ai.a(this, (byte) -73, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        if (0 <= this.owner &&
          !fwa.a(param0, 1, this.lastAttackers)) {
          this.lastAttackers = SetAutozoomSpeedDivide.a(param0, true, this.lastAttackers, (byte) -14);
        }
        if (param1 != 19581) {
          this.selfDestructCountdown = 18;
        }
    }

    final boolean b(int param0, byte param1) {
        int var3 = -67 % ((param1 + 53) / 48);
        return (this.field_A & param0) != 0 ? true : false;
    }

    final int y(int param0) {
        if (param0 != 8) {
          this.ai = (ShipAI) null;
        }
        return -Particle.field_e + this.selfDestructCountdown;
    }

    final int getTeam(byte param0) {
        if (param0 <= 63) {
          this.u(39);
        }
        return this.team;
    }

    final ShipBlueprint getTargetBlueprint(byte param0) {
        if (param0 != 28) {
          this.l(45);
        }
        return this.targetBlueprint;
    }

    final void a(IntrusiveDeque param0, int param1, boolean param2, boolean param3) {
        try {
          if (param1 != 9) {
            qua var6 = (qua) null;
            this.a((qua) null, 93);
          }
          if (1 == GetFightersPerPlayerMaximum.field_p) {
            param0.b(param1 ^ -10265, new ihb(4, this.repairModeOn ? 2 : 0));
          } else {
            param0.b(param1 - 10267, new ihb(4, this.repairModeReload));
          }
          if (!param2 &&
            !param3) {
            if (!this.selfDestructActivated) {
              param0.b(param1 ^ -10265, new ihb(8, 0));
            }
            if (this.selfDestructPrepared) {
              param0.b(-10258, new ihb(9, this.selfDestructCountdown));
            }
          }
          this.chassis.a(param0, this, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.LC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int c(int param0, byte param1) {
        int var3 = this.chassis.g(param0, param1 + 5);
        if (param1 != -2) {
          World var4 = (World) null;
          this.a(false, (World) null);
        }
        if (var3 > 0) {
          this.B(-128);
        }
        return var3;
    }

    final void r(int param0) {
        this.spawnTimer = Particle.field_A;
        if (param0 != -2) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, 59);
        }
    }

    final void a(boolean param0, lta param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var4_int = this.t(0);
          var5 = (int)((float)tu.field_d * param1.field_a);
          if (var5 < 8) {
            var5 = 8;
          }
          var6 = (int)((float)NebulaField.field_d * param1.field_a);
          if (1 > var6) {
            var6 = 1;
          }
          if (param2 != 32) {
            this.field_D = false;
          }
          var7 = (this.getBoundingbox((byte) -23)[0] + this.getBoundingbox((byte) -46)[1]) / 2;
          var8 = param1.a(var7, (byte) 117) - var5 / 2;
          var9 = param1.b(true, this.getBoundingbox((byte) -94)[2]) - 4 * var6;
          SetMissionTerrainDebrisProbability.a(qpb.a(false, this.team, param2 ^ 13894111), var4_int, var9, var6, param0, var5, var8, 2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.NC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_1 = 0;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Ship var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -46 % ((param0 - 22) / 59);
          var5 = (Ship) (param1);
          if (!super.a((byte) -43, param1) &&
            var5.owner == this.owner &&
            this.team == var5.team &&
            this.dragging == var5.dragging) {
            stackIn_7_0 = (null != var5.ai) ? 0 : 1;
            if (this.ai != null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if ((stackIn_7_0 ^ stackIn_10_1) == 0 && (null == this.ai ||
              !this.ai.a((byte) -43, var5.ai)) && (this.energy == var5.energy &&
              this.reloadtimer == var5.reloadtimer &&
              var5.repairModeReload == this.repairModeReload)) {
              stackIn_20_0 = (this.repairModeOn) ? 0 : 1;
              if (stackIn_20_0 != (var5.repairModeOn ? 1 : 0)) {
                stackIn_24_0 = (this.selfDestructPrepared) ? 0 : 1;
                if (var5.selfDestructPrepared) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if (stackIn_24_0 == stackIn_27_1) {
                  stackIn_30_0 = this.selfDestructActivated;
                  if (var5.selfDestructActivated) {
                    stackIn_31_1 = 0;
                  } else {
                    stackIn_31_1 = 1;
                  }
                  if ((stackIn_30_0 ? 1 : 0) != stackIn_31_1 &&
                    var5.selfDestructCountdown == this.selfDestructCountdown) {
                    stackIn_36_0 = (var5.salvoJustFired) ? 0 : 1;
                    if (stackIn_36_0 != (this.salvoJustFired ? 1 : 0)) {
                      stackIn_40_0 = (this.justAttachedSomething) ? 0 : 1;
                      if (stackIn_40_0 != (var5.justAttachedSomething ? 1 : 0)) {
                        stackIn_43_0 = this.shieldsOn;
                        if (var5.shieldsOn) {
                          stackIn_44_1 = 0;
                        } else {
                          stackIn_44_1 = 1;
                        }
                        if ((stackIn_43_0 ? 1 : 0) != stackIn_44_1 &&
                          this.shieldsToggleCooldown == var5.shieldsToggleCooldown &&
                          !SetBlueprintSaveTime.a(var5.lastAttackers, this.lastAttackers, (byte) 28)) {
                          stackIn_50_0 = (var5.targetBlueprint != null) ? 0 : 1;
                          if (this.targetBlueprint != null) {
                            stackIn_53_1 = 0;
                          } else {
                            stackIn_53_1 = 1;
                          }
                          if ((stackIn_50_0 ^ stackIn_53_1) == 0 && (null == this.targetBlueprint ||
                            !this.targetBlueprint.a((byte) -92, var5.targetBlueprint)) && var5.spawnTimer == this.spawnTimer) {
                            stackIn_61_0 = false;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_61_0 = true;
          }
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_64_0 = var3;
          stackIn_64_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(')').toString());
        }
    }

    final int getDragging(int param0) {
        int var2 = 10 / ((-20 - param0) / 55);
        return this.dragging;
    }

    final qua p(byte param0) {
        if (param0 != 49) {
          this.t(-25);
        }
        return this.field_L;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, false);
          this.owner = param0.i(0, 32);
          this.team = param0.i(0, 32);
          this.dragging = param0.i(0, 32);
          if (!kv.a(false, param0)) {
            this.ai = null;
          } else {
            if (null == this.ai) {
              this.ai = new ShipAI();
            }
            this.ai.a(param0, false);
          }
          this.energy = param0.i(0, 32);
          this.reloadtimer = param0.i(0, 32);
          this.repairModeReload = param0.i(0, 32);
          this.repairModeOn = kv.a(param1, param0);
          this.selfDestructPrepared = kv.a(false, param0);
          this.selfDestructActivated = kv.a(param1, param0);
          this.selfDestructCountdown = param0.i(0, 32);
          this.salvoJustFired = kv.a(false, param0);
          this.justAttachedSomething = kv.a(false, param0);
          this.shieldsOn = kv.a(false, param0);
          this.shieldsToggleCooldown = param0.i(0, 32);
          this.lastAttackers = wkb.a((byte) 37, this.lastAttackers, param0, 4);
          if (!kv.a(false, param0)) {
            this.targetBlueprint = null;
          } else {
            if (this.targetBlueprint == null) {
              this.targetBlueprint = new ShipBlueprint();
            }
            this.targetBlueprint.a(param0, false);
          }
          this.spawnTimer = param0.i(0, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("sg.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getOwner(byte param0) {
        if (param0 != -117) {
          field_H = -115;
        }
        return this.owner;
    }

    final boolean a(World param0, int param1, int param2, int param3) {
        int var11 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        ShipComponent[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ShipComponent var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ShipComponent[] var17 = null;
        ShipComponent[] var18 = null;
        int var8Lifetime1;
        int var14Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          if (!this.d(4, 67)) {
            return true;
          }
          this.chassis.i(param3 + 110);
          this.a(param0, true, (byte) 67, true);
          if (!this.q(-107)) {
            return false;
          }
          if (param3 != 0) {
            this.getShieldsOn(-12);
          }
          var17 = this.chassis.a((byte) 101, param1, GetMinimapWidth.field_o, (ShipComponent[]) null, param2);
          var18 = var17;
          var5 = var18;
          var6 = 1;
          if (var5 != null &&
            var17.length > 0) {
            var7 = -1;
            for (var8 = 0; var17.length > var8; var8++) {
              if (var17[var8] != this.chassis) {
                continue;
              }
              var7 = var8;
              break;
            }
            var8Lifetime1 = LoadSettings.field_p / var18.length;
            var9 = 0;
            var10 = 0;
            for (var11 = 0; var11 < var18.length; var11++) {
              var12 = var18[var11];
              var13 = var8Lifetime1 + var9;
              if (var11 != var7) {
                var9 = var12.a(true, false, var13);
              } else {
                var14 = var8Lifetime1 / 4;
                var9 = var13 - var14 + var12.a(true, false, var14);
              }
              var14Lifetime1 = -var9 + var13;
              if (var14Lifetime1 > 0) {
                var15 = var14Lifetime1 / 32;
                if (0 == var15) {
                  var15 = 1;
                }
                param0.a(5, var12.finaly, var12.finalx, 1000, 11184895, var15, 5);
                var10 = 1;
              }
            }
            if (var10 != 0) {
              GetGrapplingHookAimarc.a(param2, this.id, 73, 102, param1);
              var6 = 0;
            }
            if (var10 != 0 &&
              0 == SetMinimapWidth.field_o % 80) {
              qba.a(20382, param1, 19, param2, 20);
            }
          }
          if (var6 != 0) {
            stackIn_38_0 = param2;
            stackIn_38_1 = this.id;
            GetGrapplingHookAimarc.a(stackIn_38_0, stackIn_38_1, 72, -72, param1);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_43_0 = var5_ref;
          stackIn_43_1 = new StringBuilder().append("sg.HC(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(World param0, boolean param1, byte param2, boolean param3) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.energy <= 0) {
            this.reloadtimer = this.reloadtimer + 1;
          }
          this.spawnTimer = this.spawnTimer + 1;
          if (this.field_D) {
            this.field_D = false;
          }
          if (vdb.field_d <= this.reloadtimer) {
            this.reloadtimer = 0;
            this.energy = this.getMaxEnergy(true);
          }
          if (this.energy > 0) {
            this.energy = this.energy + sja.field_b;
            if (this.energy > this.getMaxEnergy(true)) {
              this.energy = this.getMaxEnergy(true);
            }
          }
          if (this.selfDestructActivated &&
            0 < this.selfDestructCountdown) {
            this.selfDestructCountdown = this.selfDestructCountdown - 1;
          }
          if (GetFightersPerPlayerMaximum.field_p != 1) {
            if (this.repairModeReload > 0) {
              this.repairModeReload = this.repairModeReload - 1;
            }
          } else {
            if (this.repairModeOn &&
              this.repairModeReload < Particle.field_I) {
              this.repairModeReload = this.repairModeReload + 1;
            }
            if (!this.repairModeOn &&
              this.repairModeReload > 0) {
              this.repairModeReload = this.repairModeReload - 1;
            }
          }
          if (this.selfDestructActivated &&
            this.selfDestructCountdown <= Particle.field_e) {
            this.chassis.a(400, param2 - 20, param0, (ShipBody) (this));
          }
          if (this.shieldsToggleCooldown > 0) {
            this.shieldsToggleCooldown = this.shieldsToggleCooldown - 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("sg.SA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        Ship var6 = null;
        Ship var7 = null;
        var4 = VoidHunters.field_G;
        try {
          var6 = (Ship) (param1);
          var7 = var6;
          super.b((byte) 89, param1);
          var6.owner = this.owner;
          var6.team = this.team;
          var6.dragging = this.dragging;
          if (this.ai != null) {
            if (null == var7.ai) {
              var7.ai = new ShipAI();
            }
            this.ai.b((byte) 103, var7.ai);
          } else {
            var6.ai = null;
          }
          var7.shieldsToggleCooldown = this.shieldsToggleCooldown;
          var7.shieldsOn = this.shieldsOn;
          var7.repairModeOn = this.repairModeOn;
          var7.selfDestructCountdown = this.selfDestructCountdown;
          var7.selfDestructActivated = this.selfDestructActivated;
          var7.salvoJustFired = this.salvoJustFired;
          var7.maxEnergy = this.maxEnergy;
          var7.energy = this.energy;
          var7.reloadtimer = this.reloadtimer;
          var7.repairModeReload = this.repairModeReload;
          var7.selfDestructPrepared = this.selfDestructPrepared;
          var7.justAttachedSomething = this.justAttachedSomething;
          if (param0 <= 54) {
            var5 = (faa) null;
            this.b((faa) null, -85);
          }
          var7.lastAttackers = SetTeamSelectionSpeedup.a(var7.lastAttackers, (byte) -102, this.lastAttackers);
          if (this.targetBlueprint != null) {
            if (null == var7.targetBlueprint) {
              var7.targetBlueprint = new ShipBlueprint();
            }
            this.targetBlueprint.b((byte) 89, var7.targetBlueprint);
          } else {
            var7.targetBlueprint = null;
          }
          var7.spawnTimer = this.spawnTimer;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("sg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        this.field_A = this.field_A | param1;
        if (param0 != 0) {
          this.l((byte) -73);
        }
    }

    final void a(ShipAI param0, int param1) {
        try {
          if (param1 != 4) {
            this.w(105);
          }
          this.ai = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sg.MC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int t(int param0) {
        int[] var5 = new int[2];
        int[] var2 = var5;
        this.chassis.a(var5, (byte) -17, true);
        int var3 = var5[0] * 256 / var5[1];
        var5[1] = param0;
        var5[0] = 0;
        this.chassis.a(var5, (byte) -17, false);
        int var4 = 256 * var5[0] / var5[1];
        if (var4 < var3) {
          var3 = var4;
        }
        return var3;
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -118);
          param0.a(-632, this.owner, 32);
          if (param1 >= -109) {
            this.s((byte) -86);
          }
          param0.a(-632, this.team, 32);
          param0.a(-632, this.dragging, 32);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -76;
          stackIn_5_2 = (this.ai != null);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.ai.b(param0, -113);
          }
          param0.a(-632, this.energy, 32);
          param0.a(-632, this.reloadtimer, 32);
          param0.a(-632, this.repairModeReload, 32);
          vq.a(param0, 81, this.repairModeOn);
          vq.a(param0, 47, this.selfDestructPrepared);
          vq.a(param0, 82, this.selfDestructActivated);
          param0.a(-632, this.selfDestructCountdown, 32);
          vq.a(param0, 70, this.salvoJustFired);
          vq.a(param0, -121, this.justAttachedSomething);
          vq.a(param0, 104, this.shieldsOn);
          param0.a(-632, this.shieldsToggleCooldown, 32);
          stackIn_9_0 = 4;
          if (this.lastAttackers != null) {
            stackIn_10_1 = this.lastAttackers.length;
          } else {
            stackIn_10_1 = 0;
          }
          pgb.a(stackIn_9_0, stackIn_10_1, -125, param0, this.lastAttackers);
          stackIn_12_0 = (faa) (param0);
          stackIn_12_1 = 78;
          stackIn_13_2 = (null != this.targetBlueprint);
          if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
            this.targetBlueprint.b(param0, -116);
          }
          param0.a(-632, this.spawnTimer, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(int param0, int param1) {
        tv var4;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        if (param1 <= 38) {
          var4 = (tv) null;
          this.b((byte) -22, (tv) null);
        }
        if (param0 != 4) {
          if (param0 != 9) {
            return false;
          }
          return this.selfDestructActivated;
        }
        if (GetFightersPerPlayerMaximum.field_p != 1) {
          stackIn_7_0 = !(this.repairModeReload <= pca.field_i[4].d((byte) 64));
          return stackIn_7_0;
        }
        stackIn_13_0 = (this.repairModeOn) || !(this.repairModeReload <= 0);
        return stackIn_13_0;
    }

    final void z(int param0) {
        if (param0 < 77) {
          faa var3 = (faa) null;
          this.b((faa) null, -12);
        }
        this.field_A = 0;
    }

    final int l(int param0) {
        if (param0 != -465) {
          this.energy = -114;
        }
        return this.shieldsToggleCooldown;
    }

    final int[] getLastAttackers(int param0) {
        if (param0 != -26448) {
          return (int[]) null;
        }
        return this.lastAttackers;
    }

    final void a(int param0, byte param1) {
        this.dragging = param0;
        if (param1 > -48) {
          field_E = 125;
        }
    }

    final void h(int param0, int param1) {
        if (param0 != 17704) {
          this.getAi((byte) -15);
        }
        this.team = param1;
    }

    final boolean getRepairModeOn(int param0) {
        if (param0 != 32) {
          return false;
        }
        return this.repairModeOn;
    }

    final int[] A(int param0) {
        if (param0 < 21) {
          this.y(-71);
        }
        return this.field_x;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != 11) {
          return false;
        }
        if (this.energy > 0) {
          this.energy = this.energy - param1;
          this.d((byte) -126);
          return true;
        }
        return false;
    }

    final void u(int param0) {
        this.chassis.f(14546);
        if (GetFightersPerPlayerMaximum.field_p == 1) {
          this.repairModeReload = 0;
          this.repairModeOn = false;
        }
        int var2 = 90 / ((72 - param0) / 44);
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, (byte) -107);
          param0.a(-632, this.owner, 32);
          param0.a(-632, this.team, 32);
          param0.a(-632, this.dragging, 32);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -128;
          stackIn_3_2 = (null != this.ai);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.ai.b(param0, -116);
          }
          param0.a(-632, this.energy, 32);
          param0.a(-632, this.reloadtimer, 32);
          param0.a(-632, this.maxEnergy, 32);
          param0.a(-632, this.repairModeReload, 32);
          vq.a(param0, -73, this.repairModeOn);
          vq.a(param0, 90, this.selfDestructPrepared);
          vq.a(param0, 113, this.selfDestructActivated);
          param0.a(-632, this.selfDestructCountdown, 32);
          vq.a(param0, -92, this.salvoJustFired);
          vq.a(param0, 107, this.justAttachedSomething);
          vq.a(param0, -102, this.shieldsOn);
          param0.a(-632, this.shieldsToggleCooldown, 32);
          stackIn_8_0 = 4;
          if (this.lastAttackers == null) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = this.lastAttackers.length;
          }
          pgb.a(stackIn_8_0, stackIn_9_1, -90, param0, this.lastAttackers);
          if (param1 > -91) {
            this.s(57);
          }
          stackIn_13_0 = (faa) (param0);
          stackIn_13_1 = 101;
          stackIn_14_2 = (null != this.targetBlueprint);
          if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
            this.targetBlueprint.b(param0, -118);
          }
          param0.a(-632, this.spawnTimer, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void t(byte param0) {
        int var2 = this.a((byte) 11, SetMissilesCooldown.field_p * (-fra.field_a + 1)) ? 1 : 0;
        int var3 = 85 % ((47 - param0) / 51);
        if (var2 == 0) {
          this.shieldsOn = false;
          this.d((byte) 124);
          return;
        }
    }

    final int m(byte param0) {
        if (param0 != -64) {
          return 120;
        }
        return this.reloadtimer * 255 / Math.max(vdb.field_d, 1);
    }

    final int o(int param0) {
        int var2 = -44 / ((param0 - 33) / 44);
        return 255 * this.energy / Math.max(this.getMaxEnergy(true), 1);
    }

    final void e(int param0, int param1) {
        if (!this.s((byte) -90) &&
          this.energy > 0) {
          this.energy = this.energy + param1;
          if (!(this.energy <= this.getMaxEnergy(true))) {
            this.energy = this.getMaxEnergy(true);
          }
        }
        if (param0 != -1) {
          this.selfDestructCountdown = 49;
        }
    }

    final void a(lta param0, int param1, World param2) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        try {
          var4_int = qpb.a(false, this.team, 13894143);
          if (this.j((byte) 108)) {
            var5 = this.b(true);
            if (var5 > 0) {
              var5 = Particle.field_A * var5 / (1 + this.spawnTimer);
              var6 = 256;
              for (var7 = 0; var7 < 5; var7++) {
                var8 = this.spawnTimer * ((var7 << 4) + var6);
                var9 = this.x + (GetNumStars.a(var8, (byte) 74) >> 8) * (var5 >> 8);
                var10 = this.y + (eu.a(var8, 77) >> 8) * (var5 >> 8);
                var11 = this.x + (GetNumStars.a(var8 + var6, (byte) -73) >> 8) * (var5 >> 8);
                var12 = this.y + (var5 >> 8) * (eu.a(var6 + var8, 56) >> 8);
                c.a(param0.b(true, var12), param0.a(var11, (byte) 122), param0.a(var9, (byte) 116), param0.b(true, var10), -16777216, var4_int);
              }
            }
            if ((this.spawnTimer & 8) != 0) {
              var4_int = var4_int ^ 4473924;
            }
          }
          super.a(param0, var4_int, param2, 16);
          if (param1 < 119) {
            this.ai = (ShipAI) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("sg.P(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final ShipAI getAi(byte param0) {
        if (param0 != -108) {
          this.getTeam((byte) -110);
        }
        return this.ai;
    }

    final boolean l(byte param0) {
        if (param0 != -10) {
          this.getTeam((byte) 25);
        }
        return null != this.ai ? true : false;
    }

    final void a(int param0, int param1, World param2, int param3, int param4) {
        boolean stackIn_6_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        uj var7 = null;
        uj var8 = null;
        uj var8Lifetime1;
        uj var8Lifetime2;
        try {
          super.a(-53, param1, param2, param3, param4);
          if (param1 == 4) {
            if (GetFightersPerPlayerMaximum.field_p != 1) {
              if (this.repairModeReload <= 0) {
                var7 = pca.field_i[4];
                var8 = var7;
                var8Lifetime2 = var7;
                this.repairModeReload = var7.d((byte) 64) + var7.b(-25131);
              }
            } else {
              stackIn_6_1 = !(this.repairModeOn);
              this.repairModeOn = stackIn_6_1;
              this.dragging = -1;
            }
          }
          if (param1 == 8 &&
            !this.selfDestructActivated) {
            stackIn_15_1 = !(this.selfDestructPrepared);
            this.selfDestructPrepared = stackIn_15_1;
          }
          if (param1 == 9 &&
            this.selfDestructPrepared &&
            !this.selfDestructActivated) {
            this.selfDestructActivated = true;
            var8Lifetime1 = pca.field_i[9];
            this.selfDestructCountdown = var8Lifetime1.d((byte) 64) + var8Lifetime1.b(-25131);
          }
          if (param0 > -36) {
            this.repairModeReload = -108;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("sg.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean g(boolean param0) {
        if (param0) {
          this.getSelfDestructPrepared((byte) -85);
        }
        return this.chassis.componentTypeId == 0 ? true : false;
    }

    final int getMaxEnergy(boolean param0) {
        if (!param0) {
          return 10;
        }
        return this.maxEnergy;
    }

    final void C(int param0) {
        this.spawnTimer = 0;
        this.field_D = true;
        if (param0 != 32) {
          faa var3 = (faa) null;
          this.a((faa) null, true);
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_41_1 = 0;
        boolean stackIn_45_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_51_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Ship var5 = null;
        try {
          super.reportDifferences(other, -85);
          var5 = (Ship) (other);
          if (null != this.ai &&
            null != var5.ai) {
            this.ai.reportDifferences(var5.ai, -49);
          }
          if (this.targetBlueprint != null &&
            null != var5.targetBlueprint) {
            this.targetBlueprint.reportDifferences(var5.targetBlueprint, -54);
          }
          var4 = 0;
          if (this.owner != var5.owner) {
            var4 = 1;
            System.out.println("int owner has changed. before=" + var5.owner + ", now=" + this.owner);
          }
          if (this.team != var5.team) {
            System.out.println("int team has changed. before=" + var5.team + ", now=" + this.team);
            var4 = 1;
          }
          if (var5.dragging != this.dragging) {
            System.out.println("int dragging has changed. before=" + var5.dragging + ", now=" + this.dragging);
            var4 = 1;
          }
          stackIn_19_0 = (null != this.ai) ? 0 : 1;
          if (null != var5.ai) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          if ((stackIn_19_0 ^ stackIn_22_1) != 0 ||
            this.ai != null &&
            this.ai.a((byte) 89, var5.ai)) {
            var4 = 1;
            System.out.println("ShipAI ai has changed. before=" + var5.ai + ", now=" + this.ai);
          }
          if (var5.energy != this.energy) {
            System.out.println("int energy has changed. before=" + var5.energy + ", now=" + this.energy);
            var4 = 1;
          }
          if (var5.reloadtimer != this.reloadtimer) {
            System.out.println("int reloadtimer has changed. before=" + var5.reloadtimer + ", now=" + this.reloadtimer);
            var4 = 1;
          }
          if (this.maxEnergy != var5.maxEnergy) {
            var4 = 1;
            System.out.println("int max_energy has changed. before=" + var5.maxEnergy + ", now=" + this.maxEnergy);
          }
          if (this.repairModeReload != var5.repairModeReload) {
            var4 = 1;
            System.out.println("int repair_mode_reload has changed. before=" + var5.repairModeReload + ", now=" + this.repairModeReload);
          }
          stackIn_40_0 = this.repairModeOn;
          if (var5.repairModeOn) {
            stackIn_41_1 = 0;
          } else {
            stackIn_41_1 = 1;
          }
          if ((stackIn_40_0 ? 1 : 0) == stackIn_41_1) {
            System.out.println("boolean repair_mode_on has changed. before=" + var5.repairModeOn + ", now=" + this.repairModeOn);
            var4 = 1;
          }
          stackIn_45_0 = var5.selfDestructPrepared;
          if (this.selfDestructPrepared) {
            stackIn_46_1 = 0;
          } else {
            stackIn_46_1 = 1;
          }
          if ((stackIn_45_0 ? 1 : 0) == stackIn_46_1) {
            var4 = 1;
            System.out.println("boolean self_destruct_prepared has changed. before=" + var5.selfDestructPrepared + ", now=" + this.selfDestructPrepared);
          }
          stackIn_50_0 = this.selfDestructActivated;
          if (var5.selfDestructActivated) {
            stackIn_51_1 = 0;
          } else {
            stackIn_51_1 = 1;
          }
          if ((stackIn_50_0 ? 1 : 0) == stackIn_51_1) {
            System.out.println("boolean self_destruct_activated has changed. before=" + var5.selfDestructActivated + ", now=" + this.selfDestructActivated);
            var4 = 1;
          }
          if (var5.selfDestructCountdown != this.selfDestructCountdown) {
            System.out.println("int self_destruct_countdown has changed. before=" + var5.selfDestructCountdown + ", now=" + this.selfDestructCountdown);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            this.field_A = 114;
          }
          stackIn_62_0 = (var5.salvoJustFired) ? 0 : 1;
          if (stackIn_62_0 == (this.salvoJustFired ? 1 : 0)) {
            var4 = 1;
            System.out.println("boolean salvo_just_fired has changed. before=" + var5.salvoJustFired + ", now=" + this.salvoJustFired);
          }
          if (var5.justAttachedSomething != this.justAttachedSomething) {
            var4 = 1;
            System.out.println("boolean just_attached_something has changed. before=" + var5.justAttachedSomething + ", now=" + this.justAttachedSomething);
          }
          stackIn_70_0 = (this.shieldsOn) ? 0 : 1;
          if (var5.shieldsOn) {
            stackIn_73_1 = 0;
          } else {
            stackIn_73_1 = 1;
          }
          if (stackIn_70_0 != stackIn_73_1) {
            System.out.println("boolean shields_on has changed. before=" + var5.shieldsOn + ", now=" + this.shieldsOn);
            var4 = 1;
          }
          if (this.shieldsToggleCooldown != var5.shieldsToggleCooldown) {
            var4 = 1;
            System.out.println("int shields_toggle_cooldown has changed. before=" + var5.shieldsToggleCooldown + ", now=" + this.shieldsToggleCooldown);
          }
          if (GetCountermeasuresCooldown.a(this.lastAttackers, var5.lastAttackers, false)) {
            var4 = 1;
            System.out.println("int[] last_attackers has changed. ");
          }
          stackIn_84_0 = (this.targetBlueprint != null) ? 0 : 1;
          if (var5.targetBlueprint != null) {
            stackIn_87_1 = 0;
          } else {
            stackIn_87_1 = 1;
          }
          if ((stackIn_84_0 ^ stackIn_87_1) != 0 ||
            null != this.targetBlueprint &&
            this.targetBlueprint.a((byte) -92, var5.targetBlueprint)) {
            var4 = 1;
            System.out.println("ShipBlueprint target_blueprint has changed. before=" + var5.targetBlueprint + ", now=" + this.targetBlueprint);
          }
          if (this.spawnTimer != var5.spawnTimer) {
            System.out.println("int spawn_timer has changed. before=" + var5.spawnTimer + ", now=" + this.spawnTimer);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of Ship has changed, where owner=" + this.owner);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("sg.F(");
          if (other == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public Ship() {
        this.dragging = -1;
        this.energy = PartitionZone.field_e;
        this.ai = null;
        this.team = 0;
        this.owner = -1;
        this.field_x = null;
        this.field_L = null;
    }

    static {
    }
}
