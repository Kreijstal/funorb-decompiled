/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SimHuman extends SimUnit {
    static Sprite field_fb;
    private int[] field_ub;
    private int field_kb;
    private int field_ib;
    private sa field_mb;
    static String field_jb;
    private int field_tb;
    int field_lb;
    private boolean field_vb;
    SimZombie field_nb;
    private boolean field_wb;
    static cj field_gb;
    private int field_rb;
    boolean field_hb;
    static Sprite field_eb;
    private int[][] field_sb;
    private int[] field_qb;
    private int field_xb;
    static int field_pb;
    static String field_ob;

    private final boolean a(byte param0, int param1, int param2) {
        boolean stackIn_14_0 = false;
        param2 = param2 / 24;
        param1 = param1 / 24;
        if (param2 >= 0 &&
          param1 >= 0) {
          if (this.field_sb[0].length > param2 &&
            this.field_sb.length > param1) {
            if (param0 < 102) {
              this.field_mb = (sa) null;
            }
            stackIn_14_0 = (this.field_sb[param1][param2] != -1) && (this.field_sb[param1][param2] < 1);
            return stackIn_14_0;
          }
          return false;
        }
        return false;
    }

    final boolean a(boolean param0, SimUnit param1) {
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          this.field_kb = 200;
          stackIn_3_1 = (param0);
          this.field_wb = stackIn_3_1;
          var3_int = (param1.getX((byte) -112) + this.getX((byte) -112)) / 2;
          var4 = (param1.getY(1829947600) + this.getY(1829947600)) / 2;
          var5 = var3_int - this.getX((byte) -112);
          var6 = -this.getY(1829947600) + var4;
          var7 = 400;
          if (var7 <= var5 * var5 + var6 * var6) {
            var8 = 8;
            if (!this.a((byte) 117, var4, var3_int)) {
              var3_int = var3_int + (hp.a((byte) -107, g.field_a, 2 * var8) + (12 - var8));
              var4 = var4 + (12 + (hp.a((byte) 108, g.field_a, 2 * var8) - var8));
            }
            if (this.a((byte) 125, var4, var3_int) &&
              this.simulation.navigation.a(this.getY(1829947600), this.getX((byte) -112), -17201, var3_int, var4, false, false) != -1) {
              this.b(this.targetX, -94, this.targetY);
              this.targetX = var3_int;
              this.targetY = var4;
              this.b(this.targetY, (byte) -61, this.targetX);
            }
          } else {
            if (this.targetX == this.getX((byte) -112) &&
              this.targetY == this.getY(1829947600)) {
              return true;
            }
            this.targetX = this.getX((byte) -112);
            this.targetY = this.getY(1829947600);
          }
          this.moveToward(93, 28672 * this.speedMultiplier);
          this.needsSync = true;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("lm.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final SimZombie findVisibleZombie(boolean param0, int param1, int param2) {
        IntrusiveNode var4;
        int var8;
        SimZombie var5;
        int var6;
        int var7;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != 5690) {
          this.field_qb = (int[]) null;
        }
        var4 = this.simulation.entities.c(57);
        while (var4 instanceof SimEntity) {
          if (!(var4 instanceof SimZombie)) {
            var4 = var4.previous;
            continue;
          }
          var5 = (SimZombie) (var4);
          if (var5 != null &&
            var5.o(param2 ^ 5700)) {
            var6 = var5.getX((byte) -112) - this.getX((byte) -112);
            var7 = var5.getY(param2 ^ 1829953258) - this.getY(1829947600);
            if (var6 * var6 + var7 * var7 < param1 * param1 && (param0 ||
              this.simulation.navigation.a(var5.getY(1829947600), var5.getX((byte) -112), param2 ^ -21771, this.getX((byte) -112), this.getY(param2 + 1829941910), false, true) != -1)) {
              return var5;
            }
          }
          var4 = var4.previous;
        }
        return null;
    }

    final boolean k(byte param0) {
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_D;
        if (var2 == 0) {
          return false;
        }
        if (var2 != 1 &&
          var2 != 2) {
          if (var2 != 3 &&
            4 != var2 &&
            var2 != 5) {
            if (6 == var2) {
              return true;
            }
            if (var2 == 7) {
              return true;
            }
            if (var2 == 8) {
              return true;
            }
            if (9 == var2) {
              return false;
            }
            if (var2 == 10) {
              return true;
            }
            if (var2 == 11) {
              return false;
            }
            if (var2 != 12 &&
              var2 != 13 &&
              var2 != 14) {
              if (var2 == 15) {
                return true;
              }
              if (16 == var2) {
                return true;
              }
              if (var2 == 18) {
                return true;
              }
              if (19 == var2) {
                return true;
              }
              if (var2 == 20) {
                return true;
              }
              if (var2 == 21) {
                return false;
              }
              if (var2 == 22) {
                return true;
              }
              var2 = -61 % ((74 - param0) / 36);
              return true;
            }
            return true;
          }
          return true;
        }
        return false;
    }

    final boolean startFleeing(boolean param0) {
        this.resetFleePoints((byte) 99);
        if (param0) {
          this.becomeIdle(-67);
        }
        int var2 = this.chooseFleePoint(-18812);
        if (var2 == -1) {
          return false;
        }
        this.field_kb = 20;
        this.field_wb = false;
        this.targetX = this.field_ub[var2];
        this.targetY = this.field_qb[var2];
        this.b(this.getX((byte) -112), -80, this.getY(1829947600));
        this.b(this.targetY, (byte) -61, this.targetX);
        this.moveToward(-50, this.speedMultiplier * this.baseSpeed);
        this.setState(1, (byte) -89);
        return true;
    }

    private final boolean m(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        if (param0 != -7) {
          this.b(-71, -11, -39);
        }
        SimEntity var3 = (SimEntity) (this.simulation.entities.c(100));
        while (var3 != null) {
          if (var3 instanceof SimZombie &&
            ((SimZombie) (var3)).p((byte) 56)) {
            var4 = this.field_ub[-1 + this.field_lb] - var3.getX((byte) -112);
            var5 = this.field_qb[-1 + this.field_lb] - var3.getY(1829947600);
            var6 = var4 * var4;
            var7 = var5 * var5;
            var8 = 90000;
            if (var6 + var7 < var8) {
              var2 = 1;
              break;
            }
          }
          var3 = (SimEntity) (this.simulation.entities.b(~param0));
        }
        return var2 != 0;
    }

    final void c(boolean param0) {
        this.setState(32, (byte) -89);
        if (param0) {
          this.resetFleePoints((byte) -45);
        }
        this.needsSync = true;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 38 % ((-40 - param1) / 34);
        param2 = param2 / 24;
        param0 = param0 / 24;
        int[] dupTemp$0 = this.field_sb[param2];
        int dupTemp$1 = dupTemp$0[param0] - 1;
        dupTemp$0[param0] = dupTemp$1;
        if (0 > dupTemp$1) {
          this.field_sb[param2][param0] = 0;
        }
    }

    final void j(byte param0) {
        this.setState(20, (byte) -89);
        if (param0 <= 101) {
          this.field_lb = -17;
        }
    }

    private final int chooseFleePoint(int param0) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int var2;
        int var3;
        int var4;
        TertiaryLinkDeque var6;
        SimEntity var7;
        int var8;
        int var9;
        int var3Lifetime1;
        int var4Lifetime1;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.simulation.field_l) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = this.m(-7) ? 1 : 0;
        }
        var2 = stackIn_3_0;
        for (var3 = 0; this.field_lb > var3; var3++) {
          regionExit1: {
            ClientException.field_a[var3] = 0;
            if (~(-1 + this.field_lb) != ~var3 && (!this.a((byte) 108, this.field_qb[var3], this.field_ub[var3]) ||
              -1 == this.simulation.navigation.a(this.field_qb[var3], 95, this.field_ub[var3], this.getY(1829947600), this.getX((byte) -112)))) {
              ClientException.field_a[var3] = -1;
              break regionExit1;
            }
            for (var4 = this.cellX - 1; 1 + this.cellX >= var4; var4++) {
              for (var5 = this.cellY - 1; 1 + this.cellY >= var5; var5++) {
                var6 = this.simulation.getCell(true, var4, var5);
                if (var6 != null &&
                  var6.size(param0 ^ -18812) != 0) {
                  var7 = (SimEntity) (var6.first(false));
                  while (var7 != null) {
                    this.scoreFleePoint(var2 != 0, var7, var3, 2);
                    var7 = (SimEntity) (var6.next(-1));
                  }
                }
              }
            }
          }
        }
        var3Lifetime1 = -1;
        if (param0 != -18812) {
          return 34;
        }
        var9 = 0;
        var4Lifetime1 = var9;
        while (this.field_lb > var9) {
          if (ClientException.field_a[var9] != -1 && (var3Lifetime1 == -1 ||
            !(ClientException.field_a[var3Lifetime1] > ClientException.field_a[var9]))) {
            var3Lifetime1 = var9;
          }
          var9++;
        }
        if (var3Lifetime1 == this.field_lb - 1) {
          var3Lifetime1 = -1;
        }
        return var3Lifetime1;
    }

    final void remove(int param0) {
        this.setState(param0, (byte) -89);
        this.simulation.world.c(-112);
        super.remove(18);
    }

    final void tick(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        boolean stackIn_53_1 = false;
        boolean stackIn_61_1 = false;
        int stackIn_65_1 = 0;
        int var2;
        IntrusiveNode var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < 30) {
          this.p(110);
        }
        regionExit1: {
          super.tick(38);
          this.advanceAnimation((byte) 120, this.state);
          if (this.state == 0) {
            fieldTemp$0 = this.field_ib + 1;
            this.field_ib = this.field_ib + 1;
            if (this.field_rb < fieldTemp$0) {
              this.field_ib = 0;
              stackIn_61_1 = !(this.field_vb);
              this.field_vb = stackIn_61_1;
              if (this.field_vb) {
                this.field_rb = 53;
              } else {
                if (!this.field_vb) {
                  stackIn_65_1 = hp.a((byte) -77, g.field_a, 200) + 20;
                } else {
                  stackIn_65_1 = 65;
                }
                this.field_rb = stackIn_65_1;
              }
            }
            if (!this.field_vb) {
              this.animationFrame = 0;
            }
            fieldTemp$1 = this.field_kb;
            this.field_kb = this.field_kb + 1;
            if (20 <= fieldTemp$1) {
              this.field_kb = 0;
              this.l((byte) 111);
            }
          } else {
            if (this.state == 2) {
              this.applyVelocity((byte) 70);
              if (this.animationFrame >= 4) {
                if (this.animationFrame != 4) {
                  if (this.animationFrame == 6) {
                    this.setState(0, (byte) -89);
                    this.b(this.getY(1829947600), (byte) -61, this.getX((byte) -112));
                  }
                } else {
                  fieldTemp$7 = this.field_xb;
                  this.field_xb = this.field_xb + 1;
                  if (fieldTemp$7 >= 400) {
                    this.animationFrame = this.animationFrame + 1;
                  }
                  this.animationTicks = 0;
                  this.velocityY = 0;
                  this.velocityX = 0;
                }
              } else {
                this.animationTicks = this.animationTicks + 1;
              }
              if (!(this.simulation.navigation.a(this.positionX + this.velocityX >> 16, true, true, this.velocityY + this.positionY >> 16))) {
                this.positionY = this.positionY - this.velocityY;
                this.positionX = this.positionX - this.velocityX;
                this.velocityX = 0;
                this.velocityY = 0;
              }
              break regionExit1;
            }
            if (this.state == 1) {
              fieldTemp$2 = this.field_kb;
              this.field_kb = this.field_kb + 1;
              if (fieldTemp$2 >= 20) {
                this.field_kb = 0;
                var2 = 0;
                var3 = this.simulation.world.field_A.c(106);
                while (var3 instanceof bf) {
                  var2 = var2 != 0 | ((bf) (var3)).a(this, 0) ? 1 : 0;
                  var3 = var3.previous;
                }
                if (!this.field_wb &&
                  var2 != 0) {
                  this.moveToward(-110, this.baseSpeed >> 2);
                } else {
                  if (this.field_wb &&
                    var2 == 0) {
                    this.moveToward(119, this.baseSpeed);
                  }
                }
                stackIn_53_1 = (var2 != 0);
                this.field_wb = stackIn_53_1;
              }
              this.applyVelocity((byte) 38);
              if (!(!this.stepTowardTarget(2))) {
                this.setState(0, (byte) -89);
                this.l((byte) 111);
              }
              break regionExit1;
            }
            if (this.state == 3) {
              fieldTemp$3 = this.field_kb;
              this.field_kb = this.field_kb + 1;
              if (!(fieldTemp$3 < 20)) {
                this.field_kb = 0;
                this.l((byte) 111);
              }
              break regionExit1;
            }
            if (this.state == 16) {
              fieldTemp$4 = this.field_kb;
              this.field_kb = this.field_kb + 1;
              if (!(fieldTemp$4 < 20)) {
                this.field_kb = 0;
                if (!(!this.field_mb.b(true))) {
                  this.field_mb = null;
                  this.setState(0, (byte) -89);
                  this.needsSync = true;
                }
              }
              break regionExit1;
            }
            if (this.state != 20) {
              if (this.state == 25) {
                fieldTemp$5 = this.field_tb - 1;
                this.field_tb = this.field_tb - 1;
                if (!(fieldTemp$5 > 0)) {
                  this.setState(0, (byte) -89);
                  this.needsSync = true;
                  this.field_kb = 0;
                }
                break regionExit1;
              }
              if (this.state == 30) {
                this.applyVelocity((byte) 42);
                fieldTemp$6 = this.field_kb;
                this.field_kb = this.field_kb + 1;
                if (20 <= fieldTemp$6) {
                  this.field_kb = 0;
                  this.l((byte) 111);
                }
              }
            }
          }
        }
    }

    private final void scoreFleePoint(boolean param0, SimEntity param1, int param2, int param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        SimZombie var9 = null;
        try {
          if (param3 != 2) {
            field_pb = 1;
          }
          if (!(param1 instanceof SimZombie)) {
            if (param1 instanceof og) {
              var5_int = this.field_ub[param2] - param1.getX((byte) -112);
              var6 = this.field_qb[param2] - param1.getY(param3 ^ 1829947602);
              var7 = var5_int * var5_int + var6 * var6;
              if (ClientException.field_a[param2] != 0 &&
                var7 >= ClientException.field_a[param2]) {
                return;
              }
              ClientException.field_a[param2] = var7;
            }
          } else {
            var9 = (SimZombie) (param1);
            if (var9.q(param3 ^ -126)) {
              if (param0 &&
                !var9.p((byte) 76)) {
                return;
              }
              var6 = this.field_ub[param2] - param1.getX((byte) -112);
              var7 = this.field_qb[param2] - param1.getY(1829947600);
              var8 = var6 * var6 + var7 * var7;
              if (ClientException.field_a[param2] != 0 &&
                var8 >= ClientException.field_a[param2]) {
                return;
              }
              ClientException.field_a[param2] = var8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("lm.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int reverseBits(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -19863) {
            SimHuman.reverseBits(-75, -66, 106);
          }
          var3_int = 0;
          while (param2 > 0) {
            var3_int = param0 & 1 | var3_int << 1;
            param0 = param0 >>> 1;
            param2--;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "lm.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    SimHuman(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_ib = 0;
        this.field_vb = false;
        this.field_mb = null;
        this.field_wb = false;
        this.field_lb = 43;
        this.field_hb = false;
        this.field_rb = 0;
        this.field_nb = null;
        this.field_xb = 0;
        this.field_rb = hp.a((byte) 43, g.field_a, 200);
        this.field_ub = new int[43];
        this.field_qb = new int[43];
        this.resetFleePoints((byte) 119);
        this.field_kb = hp.a((byte) 20, g.field_a, 20);
    }

    final boolean isZombieWithin(boolean param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        TertiaryLinkDeque var12;
        Object var13;
        SimEntity var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = param1 * param1;
        stackIn_3_0 = (param0) ? 2 : 1;
        var5 = stackIn_3_0;
        var6 = var5 + this.cellX;
        var7 = var5 + this.cellY;
        var8 = this.getX((byte) -112);
        var9 = this.getY(1829947600);
        for (var10 = this.cellX - var5; var6 >= var10; var10++) {
          for (var11 = this.cellY - var5; var11 <= var7; var11++) {
            var12 = this.simulation.getCell(true, var10, var11);
            if (var12 != null) {
              var13 = var12.first(false);
              while (var13 instanceof SimEntity) {
                var14 = (SimEntity) (var13);
                if (var13 instanceof SimZombie &&
                  ((SimZombie) (var13)).q(-127) || var14 instanceof og) {
                  var15 = var14.getX((byte) -112);
                  var16 = var14.getY(1829947600);
                  var17 = -var8 + var15;
                  var18 = var16 - var9;
                  if (var4 > var17 * var17 + var18 * var18 && (param0 ||
                    this.simulation.navigation.a(var16, var15, -17201, var8, var9, false, true) != -1)) {
                    return true;
                  }
                }
                var13 = ((IntrusiveNode) (var13)).previous;
              }
            }
          }
        }
        if (param2 >= -13) {
          this.b(85, 115, -91);
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        if (this.state == 20) {
          return;
        }
        this.setState(25, (byte) -89);
        this.field_tb = param0;
        this.needsSync = param1 ? true : false;
    }

    final void p(int param0) {
        this.field_hb = true;
        this.field_D = !this.k((byte) 122) ? 21 : 22;
        if (param0 < 22) {
          this.field_nb = (SimZombie) null;
        }
    }

    final void attachToSimulation(int param0, GameSimulation param1) {
        try {
          super.attachToSimulation(param0, param1);
          this.field_sb = this.simulation.navigation.field_p;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "lm.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void n(byte param0) {
        int var2 = 19 % ((param0 - 2) / 44);
        this.field_tb = 0;
    }

    final void b(int param0, byte param1, int param2) {
        param2 = param2 / 24;
        param0 = param0 / 24;
        int[] dupTemp$0 = this.field_sb[param0];
        dupTemp$0[param2] = dupTemp$0[param2] + 1;
        if (param1 != -61) {
          this.startFleeing(true);
        }
    }

    private final void resetFleePoints(byte param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = this.getX((byte) -112);
        int var3 = this.getY(1829947600);
        int var4 = 0;
        if (param0 < 90) {
          this.l((byte) 59);
        }
        while (-1 + this.field_lb > var4) {
          this.field_ub[var4] = var2 + dm.field_dc[var4];
          this.field_qb[var4] = dm.field_Ib[var4] + var3;
          var4++;
        }
        this.field_ub[this.field_lb - 1] = var2;
        this.field_qb[-1 + this.field_lb] = var3;
    }

    final void a(int param0, sa param1) {
        if (this.state == 18 ||
          20 == this.state ||
          16 == this.state ||
          this.state == 2) {
          return;
        }
        try {
          if (param0 != -12) {
            field_ob = (String) null;
          }
          this.setState(16, (byte) -89);
          this.field_mb = param1;
          this.needsSync = true;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "lm.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int o(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = -103 % ((72 - param0) / 49);
        int var3 = this.field_D;
        if (2 != var3 &&
          var3 != 4 &&
          6 != var3) {
          return eb.field_A;
        }
        return n.field_i;
    }

    public static void n(int param0) {
        if (param0 != 0) {
          field_ob = (String) null;
        }
        field_ob = null;
        field_eb = null;
        field_fb = null;
        field_gb = null;
        field_jb = null;
    }

    final void becomeIdle(int param0) {
        if (param0 != -22882) {
          this.field_ub = (int[]) null;
        }
        this.setState(0, (byte) -89);
    }

    abstract void l(byte param0);

    static {
        field_jb = "";
        field_ob = "Do not yield to their technical powers!";
    }
}
