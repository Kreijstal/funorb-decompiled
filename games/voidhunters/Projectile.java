/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Projectile extends ara implements DiffableState {
    private int firedPlayer;
    private int damage;
    static String field_r;
    static int field_q;
    private int angle;
    int life;
    private int targetBody;
    static String[] field_k;
    private int firedTeam;
    private int type;

    final int a(ShipComponent param0, int param1) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          var3_int = 2147483647;
          if (param1 != 3) {
            stackIn_3_0 = 88;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < param0.finaloutline.length; var4 += 2) {
            var5 = param0.finaloutline[var4];
            var6 = param0.finaloutline[var4 + 1];
            var7 = param0.finaloutline[(2 + var4) % param0.finaloutline.length];
            var8 = param0.finaloutline[(var4 + 3) % param0.finaloutline.length];
            if (var7 <= var5) {
              var5 += 512;
              var7 -= 512;
            } else {
              var5 -= 512;
              var7 += 512;
            }
            if (var8 > var6) {
              var6 -= 512;
              var8 += 512;
            } else {
              var8 -= 512;
              var6 += 512;
            }
            var9 = ng.a(8, -this.dy + this.y, (byte) 89, -this.dx + this.x, var7, this.x, var6, var5, var8, this.y);
            if (var9 != -1 &&
              var9 < var3_int) {
              var3_int = var9;
            }
          }
          stackIn_20_0 = var3_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("tj.V(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -94) {
          World var4 = (World) null;
          this.a((byte) 43, (World) null);
        }
        this.targetBody = param0;
    }

    public static void g(int param0) {
        field_r = null;
        int var1 = -35 % ((param0 + 84) / 39);
        field_k = null;
    }

    final int getDamage(byte param0) {
        if (param0 <= 36) {
          return 21;
        }
        return this.damage;
    }

    final void a(byte param0, World param1) {
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var3_int = 0;
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
        ShipBody var15 = null;
        ShipBody var16 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          if (param0 != 93) {
            this.damage = -51;
          }
          this.life = this.life - 1;
          if (this.life < 0) {
            this.b(param0 ^ -3929);
            if (this.type == 6) {
              param1.a(0, gib.field_a, this.firedTeam, this.firedPlayer, false, this.x, this.y);
            }
          } else {
            if (3 != this.type &&
              this.type != 5) {
              param1.a(10, this.y, this.x, 0, 11184895, 1, 5);
              if (this.type != 1) {
                if (this.type == 6) {
                  var3 = null;
                  if (this.targetBody < 0) {
                    var16 = param1.a(true, this.y, this.x, this.firedTeam);
                    var3 = var16;
                    if (var16 != null) {
                      var4 = 0;
                      var5 = -this.x + var16.x;
                      var6 = var16.y - this.y;
                      if (ar.a(var5, (byte) 111, var6) < GetUseNiceTrails.field_p / 2 &&
                        !param1.a(var16, param0 ^ 39)) {
                        var4 = 1;
                      }
                      if (var4 == 0) {
                        var3 = null;
                      } else {
                        this.targetBody = var16.id;
                      }
                    }
                  } else {
                    var15 = param1.d((byte) -27, this.targetBody);
                    var3 = var15;
                    if (var15 == null ||
                      param1.a(var15, -76)) {
                      this.targetBody = -1;
                    }
                  }
                  if (var3 != null) {
                    var4Lifetime1 = ((ShipBody) (var3)).chassis.finalx;
                    var5Lifetime1 = ((ShipBody) (var3)).chassis.finaly;
                  } else {
                    var4Lifetime1 = this.x + (iea.field_d * GetNumStars.a(this.angle, (byte) 28) >> 8);
                    var5Lifetime1 = this.y + (iea.field_d * eu.a(this.angle, 70) >> 8);
                  }
                  var6Lifetime1 = var4Lifetime1 - this.x >> 6;
                  var7 = var5Lifetime1 - this.y >> 6;
                  var8 = ar.a(var6Lifetime1, (byte) 120, var7);
                  if (var8 > 0) {
                    var6Lifetime1 = var6Lifetime1 * la.field_k / var8;
                    var7 = var7 * la.field_k / var8;
                    var9 = var6Lifetime1 - this.dx;
                    var10 = -this.dy + var7;
                    var11 = ar.a(var9, (byte) 111, var10);
                    if (0 >= var11) {
                      this.y = this.y + this.dy;
                      this.x = this.x + this.dx;
                      return;
                    }
                    var12 = var9 * iea.field_d / var11;
                    this.dx = this.dx + var12;
                    var13 = var10 * iea.field_d / var11;
                    this.dy = this.dy + var13;
                  }
                }
              } else {
                this.dx = this.dx + (SetShieldsDirectionalRadius.field_o * GetNumStars.a(this.angle, (byte) 89) >> 16);
                this.dy = this.dy + (SetShieldsDirectionalRadius.field_o * eu.a(this.angle, 96) >> 16);
                var3_int = 128;
                param1.a(20, this.y, this.x, var3_int, param0 + 11184802, 1, 10);
              }
            }
          }
          this.y = this.y + this.dy;
          this.x = this.x + this.dx;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("tj.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void b(int param0, byte param1) {
        this.firedPlayer = param0;
        if (param1 != 47) {
          this.life = -66;
        }
    }

    final void a(int param0, lta param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var3_int = param1.a(this.x, (byte) 127);
          var4 = param1.b(true, this.y);
          if (param0 != this.type) {
            if (this.type == 4) {
              var5 = param1.a(-this.dx + this.x, (byte) 119);
              var6 = param1.b(true, this.y - this.dy);
              c.a(var6, var5, var3_int, var4, param0 ^ -16777216, 16746632);
              return;
            }
            if (this.type == 3) {
              var5 = param1.a(-this.dx + this.x, (byte) 112);
              var6 = param1.b(true, this.y - this.dy);
              var7 = qpb.a(false, this.firedTeam, 13894143);
              var8 = 255 * this.damage / hrb.field_a;
              kra.a(var7, 3, 16994, var4, var8 >> 1, var3_int, var5, var6);
              if (0 < this.angle) {
                SetMissileLauncherEnergyUsed.a(var7, (byte) 7, var4, Math.max(3.0f, (float)var8 * (11.0f * param1.field_a)), var8 >> 1, var3_int);
                SetMissileLauncherEnergyUsed.a(var7, (byte) 7, var4, Math.max(2.0f, 8.0f * param1.field_a * (float)var8), var8, var3_int);
              }
              SetMissileLauncherEnergyUsed.a(var7, (byte) 7, var6, Math.max(2.0f, param1.field_a * 8.0f * (float)var8), var8 >> 1, var5);
              SetMissileLauncherEnergyUsed.a(var7, (byte) 7, var6, Math.max(1.0f, (float)var8 * (param1.field_a * 4.0f)), var8, var5);
              SetShowTutorial.a(var3_int, (byte) 66, var5, var4, var7, var6, var8);
              return;
            }
            if (2 == this.type) {
              GetPhasedEnergyBeamReload.a(var4, param1.field_a * 400.0f, param0 - 106, var3_int, 65280);
              return;
            }
            if (this.type == 5) {
              GetPhasedEnergyBeamReload.a(var4, param1.field_a * 400.0f, -100, var3_int, 65280);
              return;
            }
            if (1 == this.type) {
              SetNumStars.a(2400.0f * param1.field_a, (byte) 96, var4, 65280, var3_int);
              GetPhasedEnergyBeamReload.a(var4, 1600.0f * param1.field_a, -110, var3_int, 65280);
              return;
            }
            if (6 != this.type) {
              return;
            }
            SetNumStars.a(1200.0f * param1.field_a, (byte) 80, var4, 16776960, var3_int);
            if (this.targetBody >= 0) {
              return;
            }
            var5 = GetUseNiceTrails.field_p / 2 >> 8;
            for (var6 = 0; var6 < 8; var6++) {
              var7Lifetime1 = (int)((float)(var5 * (GetNumStars.a(this.life + var6 << 5, (byte) 33) >> 8)) * param1.field_a) + var3_int;
              var8Lifetime1 = (int)((float)((eu.a(this.life + var6 << 5, 62) >> 8) * var5) * param1.field_a) + var4;
              SetShowTutorial.a(var3_int, (byte) 66, var7Lifetime1, var4, 65280, var8Lifetime1, 23);
            }
          } else {
            var5 = param1.a(this.x - this.dx, (byte) 123);
            var6 = param1.b(true, -this.dy + this.y);
            c.a(var6, var5, var3_int, var4, -16777216, 16776977);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("tj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        if (param0) {
          this.angle = -104;
        }
        return this.firedPlayer;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -111);
          param0.a(-632, this.angle, 32);
          param0.a(-632, this.life, 32);
          param0.a(-632, this.firedTeam, 32);
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          param0.a(-632, this.firedPlayer, 32);
          param0.a(-632, this.type, 32);
          param0.a(-632, this.targetBody, 32);
          param0.a(-632, this.damage, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.angle = param0.i(0, 32);
          this.life = param0.i(0, 32);
          this.firedTeam = param0.i(0, 32);
          if (param1) {
            field_r = (String) null;
          }
          this.firedPlayer = param0.i(0, 32);
          this.type = param0.i(0, 32);
          this.targetBody = param0.i(0, 32);
          this.damage = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3 = -117 % ((param0 - 63) / 42);
        this.firedTeam = param1;
    }

    final static boolean f(byte param0) {
        if (param0 != -21) {
          field_r = (String) null;
        }
        return tla.field_c;
    }

    final int getTargetBody(byte param0) {
        if (param0 != -119) {
          return 84;
        }
        return this.targetBody;
    }

    final void a(int param0, int param1, int param2) {
        this.y = this.y - this.dy;
        this.x = this.x - this.dx;
        int var4 = -this.x + param1;
        if (param2 <= 87) {
          this.getTargetBody((byte) -40);
        }
        int var5 = -this.y + param0;
        this.dx = var4;
        this.dy = var5;
        this.x = this.x + this.dx;
        this.y = this.y + this.dy;
        this.angle = this.angle | 1;
    }

    public final void b(byte param0, tv param1) {
        Projectile var5 = null;
        Projectile var6 = null;
        try {
          var5 = (Projectile) (param1);
          var6 = var5;
          super.b((byte) 103, param1);
          var6.life = this.life;
          var6.firedTeam = this.firedTeam;
          var6.targetBody = this.targetBody;
          var6.angle = this.angle;
          var6.damage = this.damage;
          var6.type = this.type;
          if (param0 <= 54) {
            this.angle = -107;
          }
          var6.firedPlayer = this.firedPlayer;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.damage = param0;
        if (param1 <= 50) {
          field_r = (String) null;
        }
    }

    final void f(int param0) {
        if (param0 != -24805) {
          return;
        }
        this.angle = this.angle | 1;
    }

    public final boolean a(byte param0, tv param1) {
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Projectile var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          var4 = -41 / ((param0 - 22) / 59);
          var3 = (Projectile) (param1);
          stackIn_11_0 = (super.a((byte) -121, param1)) || (this.angle != var3.angle) || (this.life != var3.life) || (this.firedTeam != var3.firedTeam) || (this.firedPlayer != var3.firedPlayer) || (this.type != var3.type) || (this.targetBody != var3.targetBody) || (var3.damage != this.damage);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getFiredTeam(int param0) {
        if (param0 != 512) {
          this.firedTeam = -93;
        }
        return this.firedTeam;
    }

    final int d(int param0) {
        if (param0 <= 100) {
          field_r = (String) null;
        }
        return this.x;
    }

    final void a(int param0, ShipComponent param1, sfa param2) {
        int var4_int = 0;
        if (this.type != 3 &&
          this.type != 4) {
          if (fra.a(param1.finaloutline, this.y, 2, this.x)) {
            param2.a(this.y, param1, this, (byte) 61, this.x);
          }
          return;
        }
        try {
          if (param0 != 24158) {
            field_k = (String[]) null;
          }
          var4_int = this.a(param1, 3);
          this.a(false, param2, param1, var4_int);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int e(byte param0) {
        if (param0 != -107) {
          this.e((byte) -9);
        }
        return this.y;
    }

    final int getType(byte param0) {
        if (param0 != -104) {
          field_k = (String[]) null;
        }
        return this.type;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Projectile var5 = null;
        try {
          var5 = (Projectile) (other);
          super.reportDifferences(other, -106);
          var4 = 0;
          if (var5.angle != this.angle) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.angle + ", now=" + this.angle);
          }
          if (this.life != var5.life) {
            var4 = 1;
            System.out.println("int life has changed. before=" + var5.life + ", now=" + this.life);
          }
          if (this.firedTeam != var5.firedTeam) {
            System.out.println("int fired_team has changed. before=" + var5.firedTeam + ", now=" + this.firedTeam);
            var4 = 1;
          }
          if (this.firedPlayer != var5.firedPlayer) {
            System.out.println("int fired_player has changed. before=" + var5.firedPlayer + ", now=" + this.firedPlayer);
            var4 = 1;
          }
          if (this.type != var5.type) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.type + ", now=" + this.type);
          }
          if (obfuscationGuard >= -19) {
            this.targetBody = -123;
          }
          if (this.targetBody != var5.targetBody) {
            System.out.println("int target_body has changed. before=" + var5.targetBody + ", now=" + this.targetBody);
            var4 = 1;
          }
          if (this.damage != var5.damage) {
            var4 = 1;
            System.out.println("int damage has changed. before=" + var5.damage + ", now=" + this.damage);
          }
          if (var4 != 0) {
            System.out.println("This instance of Projectile has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tj.F(");
          if (other == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (this.type == 3) {
          return true;
        }
        if (param0 < 82) {
          this.angle = 82;
          return false;
        }
        return false;
    }

    Projectile() {
    }

    Projectile(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.x = param0;
        this.firedPlayer = param7;
        this.y = param1;
        this.damage = 5;
        this.life = param5;
        this.dy = param3;
        this.dx = param2;
        this.targetBody = -1;
        this.angle = param4;
        this.type = param8;
        this.firedTeam = param6;
        this.damage = param9;
        if (fra.field_a == 1) {
          this.damage = this.damage * GetVelocitySustain.field_o;
        }
    }

    final void a(boolean param0, sfa param1, ShipComponent param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 2147483647) {
            var5_int = (param3 * this.dx >> 8) + (-this.dx + this.x);
            var6 = (this.dy * param3 >> 8) - this.dy + this.y;
            param1.a(var6, param2, this, (byte) 61, var5_int);
          }
          if (param0) {
            this.firedPlayer = 12;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("tj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
        field_q = 16384;
    }
}
