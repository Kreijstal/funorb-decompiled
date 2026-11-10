/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Projectile extends PooledObject implements Renderable, Collidable, t {
    private int field_j;
    private boolean field_p;
    private int x;
    private int field_w;
    private boolean field_l;
    private int velocityX;
    private boolean expired;
    private boolean field_C;
    private int field_x;
    private int field_J;
    private int velocityY;
    private int field_E;
    private int field_i;
    static ss field_k;
    private Room field_z;
    private int angle;
    private int y;
    private Effect effect;
    private boolean field_B;
    private int z;
    static ToolkitSprite field_n;
    static jea field_r;
    private int endSize;
    private int field_o;
    private int field_I;
    private on field_q;
    private int field_D;
    int field_m;

    final int g(int param0) {
        if (param0 != -1) {
          return 72;
        }
        return this.field_x;
    }

    final void a(int param0, int param1) {
        int var3 = -21 % ((20 - param1) / 42);
        this.field_i = param0;
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          this.field_z = (Room) null;
          return this.z;
        }
        return this.z;
    }

    public final int getHeight(byte param0) {
        if (param0 != 55) {
          uw var3 = (uw) null;
          this.a((uw) null, -69);
          return this.field_o;
        }
        return this.field_o;
    }

    final int getVelocityX(int param0) {
        int var2 = -72 / ((param0 + 24) / 39);
        return this.velocityX;
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
          field_n = (ToolkitSprite) null;
          return true;
        }
        return true;
    }

    private final void setXY(int param0, int param1, byte param2) {
        if (param2 > 17) {
          this.x = param0;
          this.y = param1;
          return;
        }
        this.a(65, (byte) -64, 122, false);
        this.x = param0;
        this.y = param1;
    }

    final void mirrorInRoom(Room param0, int param1) {
        try {
          this.x = param0.a(this.x, (byte) 71);
          this.velocityX = -this.velocityX;
          this.angle = dfa.a(-this.angle, 8192, 105);
          if (param1 >= -16) {
            this.field_I = 44;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setPosition(int param0, byte param1, int param2, int param3) {
        this.y = param2;
        this.z = param3;
        this.x = param0;
        if (param1 != -78) {
          this.a(53);
        }
    }

    final boolean isExpired(int param0) {
        if (param0 != 18407) {
          this.a(false, true);
          return this.expired;
        }
        return this.expired;
    }

    private final void b(boolean param0, boolean param1) {
        if (param0) {
          this.field_z.a(this.y, this.x, this.field_m, this.z, (byte) 6);
          if (this.field_B) {
            if (this.velocityX != 0) {
              this.velocityX = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.velocityY = 0;
              this.field_C = false;
              return;
            }
            if (this.velocityY != 0) {
              this.velocityX = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.velocityY = 0;
              this.field_C = false;
              return;
            }
          }
          this.h((byte) 32);
          if (param1) {
            this.a(true, 0);
          } else {
            this.field_I = this.field_I - 1;
            if (this.field_I <= 0) {
              this.a(true, 0);
            }
          }
          if (!this.field_C) {
            return;
          }
          this.effect.field_g = null;
          return;
        }
        this.field_o = -115;
        this.field_z.a(this.y, this.x, this.field_m, this.z, (byte) 6);
        if (!this.field_B) {
          this.h((byte) 32);
          if (!param1) {
            this.field_I = this.field_I - 1;
            if (this.field_I <= 0) {
              this.a(true, 0);
            }
          } else {
            this.a(true, 0);
          }
        } else {
          if (this.velocityX != 0) {
            this.velocityX = 0;
            this.field_B = false;
            this.field_J = this.field_J * 2;
            this.velocityY = 0;
            this.field_C = false;
            return;
          }
          if (this.velocityY != 0) {
            this.velocityX = 0;
            this.field_B = false;
            this.field_J = this.field_J * 2;
            this.velocityY = 0;
            this.field_C = false;
            return;
          }
          this.h((byte) 32);
          if (param1) {
            this.a(true, 0);
            if (!this.field_C) {
              return;
            }
            this.effect.field_g = null;
            return;
          }
          this.field_I = this.field_I - 1;
          if (this.field_I > 0) {
            if (!this.field_C) {
              return;
            }
            this.effect.field_g = null;
            return;
          }
          this.a(true, 0);
        }
        if (this.field_C) {
          this.effect.field_g = null;
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        Effect var10;
        int var6Lifetime1;
        int var6Lifetime2;
        Effect var10Lifetime1;
        Effect var10Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3) {
          var6 = 0;
          var7 = this.x;
          if (0 <= param0) {
            if (param0 > 0) {
              var6 = 1;
              this.x = this.x + param0;
            }
          } else {
            var6 = 1;
            this.x = this.x + param0;
          }
          var8 = this.y;
          if (var6 != 0 &&
            this.c(0, param0, 98)) {
            var5 = 1;
            this.b(true, false);
            this.velocityX = -this.velocityX;
            this.x = var7;
          }
          var6Lifetime2 = 0;
          if (param2 < 0) {
            var6Lifetime2 = 1;
            this.y = this.y + param2;
          } else {
            if (0 < param2) {
              this.y = this.y + param2;
              var6Lifetime2 = 1;
              if (var6Lifetime2 == 0) {
                if (param1 >= -51) {
                  var10 = (Effect) null;
                  this.setEffect(81, (Effect) null);
                }
                if (var5 != 0) {
                  return;
                }
                if (!param3 &&
                  this.effect.field_j == 0) {
                  return;
                }
                if (this.effect.field_j == 3) {
                  this.field_z.a(-40, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, 2 * this.field_o, this.x);
                }
                var6Lifetime2 = this.field_z.a(this, -16164, this.effect);
                if (var6Lifetime2 <= 0) {
                  return;
                }
                this.b(true, true);
                return;
              }
              if (this.c(param2, 0, 111)) {
                var5 = 1;
                this.b(true, false);
                this.velocityY = -this.velocityY;
                this.y = var8;
              }
              if (param1 < -51) {
                if (var5 != 0) {
                  return;
                }
                if (!param3 &&
                  this.effect.field_j == 0) {
                  return;
                }
                if (this.effect.field_j == 3) {
                  this.field_z.a(-40, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, 2 * this.field_o, this.x);
                }
                var6Lifetime2 = this.field_z.a(this, -16164, this.effect);
                if (var6Lifetime2 <= 0) {
                  return;
                }
                this.b(true, true);
                return;
              }
              var10 = (Effect) null;
              this.setEffect(81, (Effect) null);
              if (var5 != 0) {
                return;
              }
              if (!param3 &&
                this.effect.field_j == 0) {
                return;
              }
              if (this.effect.field_j == 3) {
                this.field_z.a(-40, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, 2 * this.field_o, this.x);
              }
              var6Lifetime2 = this.field_z.a(this, -16164, this.effect);
              if (var6Lifetime2 <= 0) {
                return;
              }
              this.b(true, true);
              return;
            }
          }
          if (var6Lifetime2 != 0) {
            if (!this.c(param2, 0, 111)) {
              if (param1 >= -51) {
                var10Lifetime2 = (Effect) null;
                this.setEffect(81, (Effect) null);
              }
              if (var5 != 0) {
                return;
              }
              if (!param3 &&
                this.effect.field_j == 0) {
                return;
              }
              if (this.effect.field_j == 3) {
                this.field_z.a(-40, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, 2 * this.field_o, this.x);
              }
              var6Lifetime2 = this.field_z.a(this, -16164, this.effect);
              if (var6Lifetime2 <= 0) {
                return;
              }
              this.b(true, true);
              return;
            }
            var5 = 1;
            this.b(true, false);
            this.velocityY = -this.velocityY;
            this.y = var8;
          }
        }
        if (param1 >= -51) {
          var10Lifetime1 = (Effect) null;
          this.setEffect(81, (Effect) null);
        }
        if (var5 != 0) {
          return;
        }
        if (!param3 &&
          this.effect.field_j == 0) {
          return;
        }
        if (this.effect.field_j == 3) {
          this.field_z.a(-40, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, 2 * this.field_o, this.x);
        }
        var6Lifetime1 = this.field_z.a(this, -16164, this.effect);
        if (var6Lifetime1 <= 0) {
          return;
        }
        this.b(true, true);
    }

    private final void h(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        int var3Lifetime1;
        int var2Lifetime1;
        if (param0 < 0) {
          this.c(true);
          var3 = this.effect.field_j;
          if (var3 == 4) {
            return;
          }
          if (var3 == 5) {
            return;
          }
          if (var3 != 3) {
            if (var3 == 0) {
              var2 = qva.a((byte) -35, this.velocityY, this.velocityX) + 4096;
              this.field_z.b(false).a(this.y, (byte) -83, 5, this.z, 3, var2, 10, 262144, this.x, 16, 8);
              return;
            }
            return;
          }
          this.field_z.b(false).a(this.y, (byte) -121, 4, this.z, 1, 0, 20, 0, this.x, this.field_o >> 18, this.field_o >> 17);
          return;
        }
        var3Lifetime1 = this.effect.field_j;
        if (var3Lifetime1 == 4) {
          return;
        }
        if (var3Lifetime1 == 5) {
          return;
        }
        if (var3Lifetime1 != 3) {
          if (var3Lifetime1 != 0) {
            return;
          }
          var2Lifetime1 = qva.a((byte) -35, this.velocityY, this.velocityX) + 4096;
          this.field_z.b(false).a(this.y, (byte) -83, 5, this.z, 3, var2Lifetime1, 10, 262144, this.x, 16, 8);
          return;
        }
        this.field_z.b(false).a(this.y, (byte) -121, 4, this.z, 1, 0, 20, 0, this.x, this.field_o >> 18, this.field_o >> 17);
    }

    private final int b(int param0, Effect param1) {
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 < 100) {
            stackIn_2_0 = 115;
            return stackIn_2_0;
          }
          if (this.effect.field_j == 4 &&
            5 == param1.field_j) {
            this.a(false, 0);
            this.field_z.b(30097, 1048576, 1, this.y, this.x);
            stackIn_32_0 = 0;
            return stackIn_32_0;
          }
          if (this.effect.field_j == 3 && (param1.field_j == 4 ||
            param1.field_j == 5)) {
            this.a(false, 0);
            this.field_z.b(false).c(this.x, 93, this.velocityY, this.z, this.velocityX, this.y);
            if (5 == param1.field_j) {
              this.field_z.b(30097, 1048576, 0, this.y, this.x);
            }
            stackIn_30_0 = 0;
            return stackIn_30_0;
          }
          if (3 != this.effect.field_j &&
            3 == param1.field_j) {
            var3_int = 1 + param1.size / 2;
            if (0 >= var3_int) {
              stackIn_15_0 = 0;
              return stackIn_15_0;
            }
            if (this.effect.field_j == 4 ||
              this.effect.field_j == 5) {
              var3_int = 0;
            }
            if (var3_int <= 0) {
              return 0;
            }
            if (!this.effect.d(6734)) {
              this.field_i = 4;
            }
            this.effect.a(29525, param1.getPreset(-344));
            stackIn_26_0 = 0;
            return stackIn_26_0;
          }
          stackIn_34_0 = 0;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("ep.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3) {
        RuntimeException var5 = null;
        iq var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            var6 = (iq) null;
            this.render(63, (iq) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ep.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final int getX(int param0) {
        if (param0 != 3) {
          this.expired = true;
          return this.x;
        }
        return this.x;
    }

    final int getAngle(boolean param0) {
        if (!param0) {
          this.hashState(42, (byte) 84);
          return this.angle;
        }
        return this.angle;
    }

    public final String toString() {
        return "Projectile (x=" + this.x + ", y=" + this.y + ", vx=" + this.velocityX + ", vy=" + this.velocityY + ", " + "angle=" + this.angle + ", endSize=" + this.endSize + ")";
    }

    final void c(boolean param0, boolean param1) {
        if (param0) {
          this.field_B = param1 ? true : false;
          return;
        }
        this.field_D = 124;
        this.field_B = param1 ? true : false;
    }

    public final boolean isPushable(byte param0, boolean param1) {
        if (param0 != -55) {
          return false;
        }
        return false;
    }

    final void b(boolean param0, int param1) {
        this.field_C = param0 ? true : false;
        int var3 = 43 / ((param1 - 14) / 38);
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3 == 0) {
          if (param1) {
            if (0 > param0) {
              var5 = 1;
              this.x = this.x + param0;
            } else {
              if (0 < param0) {
                var5 = 1;
                this.x = this.x + param0;
              }
            }
            if (0 > param2) {
              this.y = this.y + param2;
              var5 = 1;
              var6 = 0;
              if (param1 ||
                this.effect.field_j != 0) {
                if (this.effect.field_j == 3) {
                  this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
                }
                var7 = this.field_z.a(this, -16164, this.effect);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
              }
              if (var5 != 0 &&
                this.c(param2, param0, 122) &&
                var6 == 0) {
                this.b(true, true);
              }
              return;
            }
            if (param2 > 0) {
              this.y = this.y + param2;
              var5 = 1;
            }
          }
          var6 = 0;
          if (!param1 &&
            this.effect.field_j == 0) {
            if (var5 != 0 &&
              this.c(param2, param0, 122) &&
              var6 == 0) {
              this.b(true, true);
            }
            return;
          }
          if (this.effect.field_j == 3) {
            this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
          }
          var7 = this.field_z.a(this, -16164, this.effect);
          if (var7 <= 0) {
            if (var5 != 0 &&
              this.c(param2, param0, 122) &&
              var6 == 0) {
              this.b(true, true);
            }
            return;
          }
          var6 = 1;
          this.b(true, true);
        } else {
          this.field_w = -54;
          if (param1) {
            if (0 > param0) {
              var5 = 1;
              this.x = this.x + param0;
            } else {
              if (0 < param0) {
                var5 = 1;
                this.x = this.x + param0;
              }
            }
            if (0 > param2) {
              this.y = this.y + param2;
              var5 = 1;
              var6 = 0;
              if (param1) {
                if (this.effect.field_j == 3) {
                  this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
                }
                var7 = this.field_z.a(this, -16164, this.effect);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
                if (var5 != 0 &&
                  this.c(param2, param0, 122) &&
                  var6 == 0) {
                  this.b(true, true);
                }
                return;
              }
              if (this.effect.field_j != 0) {
                if (this.effect.field_j == 3) {
                  this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
                }
                var7 = this.field_z.a(this, -16164, this.effect);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
              }
              if (var5 != 0 &&
                this.c(param2, param0, 122) &&
                var6 == 0) {
                this.b(true, true);
              }
              return;
            }
            if (param2 > 0) {
              this.y = this.y + param2;
              var5 = 1;
            }
          }
          var6 = 0;
          if (param1) {
            if (this.effect.field_j == 3) {
              this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
            }
            var7 = this.field_z.a(this, -16164, this.effect);
            if (var7 > 0) {
              var6 = 1;
              this.b(true, true);
            }
          } else {
            if (this.effect.field_j != 0) {
              if (this.effect.field_j == 3) {
                this.field_z.a(param3 - 31, this.y, WindZoneBehaviour.field_o, 2 * this.field_o, this.field_o * 2, this.x);
              }
              var7 = this.field_z.a(this, -16164, this.effect);
              if (var7 > 0) {
                var6 = 1;
                this.b(true, true);
              }
            }
          }
        }
        if (var5 == 0) {
          return;
        }
        if (!this.c(param2, param0, 122)) {
          return;
        }
        if (var6 != 0) {
          return;
        }
        this.b(true, true);
    }

    final PooledObject createInstance(boolean param0) {
        if (!param0) {
          return (PooledObject) null;
        }
        return (PooledObject) ((Object) new Projectile());
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          this.getRenderZ((byte) -115);
          return 0;
        }
        return 0;
    }

    public final int b(int param0) {
        int var2 = -24 / ((param0 - 1) / 45);
        return 0;
    }

    final int l(int param0) {
        if (param0 != 5) {
          return 53;
        }
        return this.field_E;
    }

    public final int getWidth(int param0) {
        if (param0 >= -11) {
          return 67;
        }
        return this.field_o;
    }

    public final int getY(int param0) {
        if (param0 != 9648) {
          return -95;
        }
        return this.y;
    }

    private final boolean f(byte param0) {
        if (param0 >= -114) {
          this.c(false, false);
          if (!(this.effect.field_g instanceof Player)) {
            return this.effect.field_c instanceof Player ? true : false;
          }
          return true;
        }
        if (this.effect.field_g instanceof Player) {
          return true;
        }
        if (!(this.effect.field_c instanceof Player)) {
          return false;
        }
        return true;
    }

    private final void a(boolean param0, int param1) {
        if (param0) {
          if (this.effect.field_j != 4) {
            if (this.effect.field_j == 5) {
            }
          } else {
            if (this.field_z.b(param1 ^ 30097, 1048576, 0, this.y, this.x)) {
              this.h((byte) 100);
            }
          }
        }
        this.expired = true;
        this.field_z.collisionGrid.remove((Collidable) (this), (byte) 123);
        if (param1 == 0) {
          return;
        }
        this.field_m = 81;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.expired;
    }

    public static void releaseStatics(int param0) {
        if (param0 > 95) {
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        }
        Projectile.releaseStatics(-85);
        field_n = null;
        field_k = null;
        field_r = null;
    }

    final void setVelocity(int param0, int param1, byte param2) {
        this.velocityX = param0;
        this.velocityY = param1;
        int var4 = 118 / ((-51 - param2) / 40);
        this.angle = qva.a((byte) -29, param1, param0);
    }

    final void b(int param0, boolean param1) {
        this.field_p = param1 ? true : false;
        if (param0 != -1) {
          this.getVelocityY(false);
        }
    }

    public final void moveTo(int param0, int param1, int param2) {
        this.field_z.collisionGrid.remove((Collidable) (this), (byte) 98);
        this.setXY(param1, param0, (byte) 114);
        this.g((byte) -99);
        this.effect.field_g = null;
        if (param2 == 2) {
          this.field_z.collisionGrid.insert((Collidable) (this), param2 + 7071);
          return;
        }
        this.getX(107);
        this.field_z.collisionGrid.insert((Collidable) (this), param2 + 7071);
    }

    final void a(int param0, Room param1, int param2, int param3, int param4, int param5) {
        try {
          this.velocityY = 0;
          this.field_E = param4;
          this.field_l = false;
          this.field_J = param0 * 2;
          this.angle = 0;
          int var7_int = -121 / ((-17 - param3) / 49);
          this.field_p = false;
          this.field_B = false;
          this.endSize = 2 * param2;
          this.field_C = false;
          this.field_j = param5;
          this.field_w = 0;
          this.expired = false;
          this.field_z = param1;
          this.field_i = -1;
          this.velocityX = 0;
          this.field_x = 0;
          this.field_o = this.field_J;
          this.effect = null;
          this.field_I = 0;
          this.field_q.b((byte) 93);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int getVelocityY(boolean param0) {
        if (param0) {
          this.field_i = -106;
          return this.velocityY;
        }
        return this.velocityY;
    }

    final void setEffect(int param0, Effect param1) {
        try {
          this.effect = param1;
          if (param0 > -122) {
            this.x = -12;
          }
          this.field_I = 5;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
          this.velocityX = -53;
          return false;
        }
        return false;
    }

    public final int getRenderX(byte param0) {
        int var2 = 40 % ((-23 - param0) / 53);
        return this.x;
    }

    final void a(boolean param0, boolean param1) {
        this.field_l = param1 ? true : false;
        if (!param0) {
          this.createInstance(true);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 < 92) {
          return true;
        }
        if (this.field_C) {
          var4 = 3;
        } else {
          var4 = 1;
        }
        if (!this.field_p) {
          return this.field_z.a((Collidable) (this), this.field_J, 2, var4, this.y, this.x, false, this.effect.field_g, this.field_J);
        }
        return this.field_z.a((Collidable) (this), this.effect.field_g, var4, this.field_J, param0 / 4, 12, this.field_J, this.x, 1, param1 / 4, this.y, 0, false) != 0 ? true : false;
    }

    final int i(int param0) {
        if (param0 != -1) {
          this.field_q = (on) null;
          return this.field_o;
        }
        return this.field_o;
    }

    final void a(uw param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 5465) {
            this.isPushable((byte) 21, true);
          }
          if (this.z >= 0) {
            param0.a((byte) -116, 7, (Renderable) (this));
          } else {
            param0.a((byte) -128, 2, (Renderable) (this));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ep.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final on c(boolean param0) {
        if (param0) {
          this.field_I = -9;
          return this.field_q;
        }
        return this.field_q;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_q = (on) null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 61 % ((param0 - 6) / 46);
        return false;
    }

    final void b(int param0, int param1, int param2) {
        this.field_w = param1;
        if (param0 != 7) {
          return;
        }
        this.angle = param2;
    }

    public final boolean a(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -77) {
            return false;
          }
          this.endSize = 120;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void tick(int param0, boolean param1) {
        int stackIn_81_0 = 0;
        int var3;
        int var5;
        int var6;
        int var7;
        Particle var8;
        Particle var10;
        Particle var12;
        Particle var13;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        this.g((byte) -99);
        this.field_q.a(param0 + 87);
        if (param1) {
          if (this.f((byte) -118)) {
            var3 = 1;
            this.angle = this.angle + this.field_w;
            if (var3 != 0) {
              this.field_x = this.field_x + 1;
              if (this.field_x >= this.field_j) {
                this.a(true, param0 + 1);
                if (this.expired) {
                  return;
                }
              }
            }
            if (this.expired) {
              if (!this.expired) {
                this.field_z.collisionGrid.pruneOutsideBounds((Collidable) (this), -66);
                this.field_z.collisionGrid.insert((Collidable) (this), 7073);
              }
              if (!this.field_B ||
                this.velocityX != 0 ||
                this.velocityY != 0) {
                this.field_o = this.field_x * (-this.field_J + this.endSize) / this.field_j + this.field_J;
              }
              if (var3 != 0 &&
                this.field_i != -1) {
                var8 = this.field_z.spawnParticle(this.x, this.y, (byte) 100, this.z);
                var5 = 131072;
                var6 = -(var5 / 2) + uca.field_c.nextBounded(var5, 0);
                var7 = uca.field_c.nextBounded(var5, ~param0) - var5 / 2;
                var8.a(false, 24, this.field_i, 4, 10 + uca.field_c.nextBounded(10, 0));
                var8.b(121, var7, var6);
                var8.a(uca.field_c.nextBounded(8192, 0), -128 + uca.field_c.nextBounded(256, 0), param0 - 84);
              }
            } else {
              if (this.field_C) {
                this.a(this.velocityX, (byte) -127, this.velocityY, var3 != 0);
              } else {
                this.a(this.velocityX, var3 != 0, this.velocityY, ~param0);
              }
              if (this.expired) {
                if (!this.field_B ||
                  this.velocityX != 0 ||
                  this.velocityY != 0) {
                  this.field_o = this.field_x * (-this.field_J + this.endSize) / this.field_j + this.field_J;
                }
                if (var3 != 0 &&
                  this.field_i != -1) {
                  var10 = this.field_z.spawnParticle(this.x, this.y, (byte) 100, this.z);
                  var5 = 131072;
                  var6 = -(var5 / 2) + uca.field_c.nextBounded(var5, 0);
                  var7 = uca.field_c.nextBounded(var5, ~param0) - var5 / 2;
                  var10.a(false, 24, this.field_i, 4, 10 + uca.field_c.nextBounded(10, 0));
                  var10.b(121, var7, var6);
                  var10.a(uca.field_c.nextBounded(8192, 0), -128 + uca.field_c.nextBounded(256, 0), param0 - 84);
                }
              } else {
                this.field_z.collisionGrid.pruneOutsideBounds((Collidable) (this), -66);
                this.field_z.collisionGrid.insert((Collidable) (this), 7073);
                if (!this.field_B ||
                  this.velocityX != 0 ||
                  this.velocityY != 0) {
                  this.field_o = this.field_x * (-this.field_J + this.endSize) / this.field_j + this.field_J;
                }
                if (var3 != 0 &&
                  this.field_i != -1) {
                  var12 = this.field_z.spawnParticle(this.x, this.y, (byte) 100, this.z);
                  var5 = 131072;
                  var6 = -(var5 / 2) + uca.field_c.nextBounded(var5, 0);
                  var7 = uca.field_c.nextBounded(var5, ~param0) - var5 / 2;
                  var12.a(false, 24, this.field_i, 4, 10 + uca.field_c.nextBounded(10, 0));
                  var12.b(121, var7, var6);
                  var12.a(uca.field_c.nextBounded(8192, 0), -128 + uca.field_c.nextBounded(256, 0), param0 - 84);
                }
              }
            }
            if (this.x < 0) {
              this.expired = true;
            } else {
              if (this.y < 0) {
                this.expired = true;
              } else {
                if (this.x >= this.field_z.getWidth((byte) -86)) {
                  this.expired = true;
                } else {
                  if (this.y >= this.field_z.getHeight(-121)) {
                    this.expired = true;
                  }
                }
              }
            }
            if (param0 != -1) {
              this.effect = (Effect) null;
            }
            return;
          }
          stackIn_81_0 = 0;
        } else {
          stackIn_81_0 = 1;
        }
        var3Lifetime1 = stackIn_81_0;
        this.angle = this.angle + this.field_w;
        if (var3Lifetime1 != 0) {
          this.field_x = this.field_x + 1;
          if (this.field_x >= this.field_j) {
            this.a(true, param0 + 1);
            if (this.expired) {
              return;
            }
          }
        }
        if (!this.expired) {
          if (this.field_C) {
            this.a(this.velocityX, (byte) -127, this.velocityY, var3Lifetime1 != 0);
          } else {
            this.a(this.velocityX, var3Lifetime1 != 0, this.velocityY, ~param0);
          }
        }
        if (!this.expired) {
          this.field_z.collisionGrid.pruneOutsideBounds((Collidable) (this), -66);
          this.field_z.collisionGrid.insert((Collidable) (this), 7073);
        }
        if (!this.field_B ||
          this.velocityX != 0 ||
          this.velocityY != 0) {
          this.field_o = this.field_x * (-this.field_J + this.endSize) / this.field_j + this.field_J;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var3Lifetime1 != 0) {
          if (this.field_i == -1) {
            if (this.x >= 0 &&
              this.y >= 0 &&
              this.x < this.field_z.getWidth((byte) -86)) {
              if (!(this.y < this.field_z.getHeight(-121))) {
                this.expired = true;
                if (param0 != -1) {
                  this.effect = (Effect) null;
                }
                return;
              }
            } else {
              this.expired = true;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var13 = this.field_z.spawnParticle(this.x, this.y, (byte) 100, this.z);
            var5Lifetime1 = 131072;
            var6Lifetime1 = -(var5Lifetime1 / 2) + uca.field_c.nextBounded(var5Lifetime1, 0);
            var7Lifetime1 = uca.field_c.nextBounded(var5Lifetime1, ~param0) - var5Lifetime1 / 2;
            var13.a(false, 24, this.field_i, 4, 10 + uca.field_c.nextBounded(10, 0));
            var13.b(121, var7Lifetime1, var6Lifetime1);
            var13.a(uca.field_c.nextBounded(8192, 0), -128 + uca.field_c.nextBounded(256, 0), param0 - 84);
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.x < 0) {
            this.expired = true;
          } else {
            if (this.y < 0) {
              this.expired = true;
            } else {
              if (this.x >= this.field_z.getWidth((byte) -86)) {
                this.expired = true;
              } else {
                if (this.y >= this.field_z.getHeight(-121)) {
                  this.expired = true;
                }
              }
            }
          }
        }
        if (param0 == -1) {
          return;
        }
        this.effect = (Effect) null;
    }

    public final boolean a(WorldBody param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          field_r = (jea) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          this.field_q = (on) null;
          return this.y;
        }
        return this.y;
    }

    public final int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (!io.centredBoxesOverlap(param1, this.y, (byte) -90, param5, this.x, param4, this.field_o, this.field_o, param2)) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          if (param3 != 0) {
            this.field_m = -65;
          }
          stackIn_10_0 = this.b(109, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("ep.WC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int applyProjectileEffect(Effect param0, Projectile param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -97) {
            this.field_B = false;
          }
          stackIn_3_0 = this.applyAreaEffect(param0, param1.field_o, param1.x, 0, param1.y, param1.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ep.SD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void render(int param0, iq param1) {
        try {
          dea.field_a.a(param1, false, this);
          if (param0 < 103) {
            Collidable var4 = (Collidable) null;
            this.overlapsBox(40, (WorldBody) null, -76, 70, -19, (Collidable) null, -19, 65);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int applyBeamEffect(Effect param0, int param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (SimulationObserver.a(this.field_o, param1, this.y, this.field_o, param2, this.x, 2) >= 0) {
            stackIn_7_0 = this.b(115, param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ep.ED(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int hashState(int param0, byte param1) {
        param0 = fs.mixHash((byte) 88, param0, this.x);
        param0 = fs.mixHash((byte) 30, param0, this.y);
        if (param1 == -39) {
          param0 = fs.mixHash((byte) 32, param0, this.velocityX);
          param0 = fs.mixHash((byte) 120, param0, this.velocityY);
          param0 = fs.mixHash((byte) 58, param0, this.endSize);
          param0 = fs.mixHash((byte) 85, param0, this.angle);
          return param0;
        }
        boolean discarded$0 = this.f((byte) 2);
        param0 = fs.mixHash((byte) 32, param0, this.velocityX);
        param0 = fs.mixHash((byte) 120, param0, this.velocityY);
        param0 = fs.mixHash((byte) 58, param0, this.endSize);
        param0 = fs.mixHash((byte) 85, param0, this.angle);
        return param0;
    }

    public final int getCollisionId(boolean param0) {
        if (param0) {
          return 7 + 7 * this.field_D;
        }
        Effect var3 = (Effect) null;
        this.setEffect(-80, (Effect) null);
        return 7 + 7 * this.field_D;
    }

    final int e(boolean param0) {
        if (param0) {
          this.getRenderY((byte) 40);
          return this.field_j;
        }
        return this.field_j;
    }

    public final boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 55) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("ep.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 != -99) {
          this.velocityY = 18;
        }
    }

    Projectile() {
        this.field_i = -1;
        this.field_q = new on();
        int fieldTemp$0 = sd.field_G;
        sd.field_G = sd.field_G + 1;
        this.field_D = fieldTemp$0;
    }

    static {
    }
}
