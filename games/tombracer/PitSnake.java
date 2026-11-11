/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitSnake extends IntrusiveNode {
    private int scaredTicks;
    private int field_w;
    private int field_g;
    private int field_u;
    private int field_m;
    static String field_j;
    static String field_v;
    private boolean field_l;
    static int[] field_t;
    private int offsetY;
    private int field_s;
    private int offsetX;
    private int direction;
    private int field_h;
    private int field_p;
    private int size;
    private int cooldownTicks;
    private int field_o;

    final void calm(int param0, int param1, int param2, byte param3) {
        this.scaredTicks = 0;
        int var5 = -52 % ((param3 - 44) / 36);
        this.cooldownTicks = 0;
    }

    final int getOffsetY(int param0) {
        if (param0 != 0) {
          this.field_l = true;
        }
        return this.offsetY;
    }

    final void tick(int param0, int param1, int param2, int param3, byte param4, Trap param5, Room param6) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        IsaacCipher var17 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.cooldownTicks > 0) {
            this.cooldownTicks = this.cooldownTicks - 1;
            return;
          }
          var17 = param6.getRandom(57);
          if (param6.getSimulation(-1553494544).isEffectActive(8, 10915)) {
            this.field_o = 100 + var17.nextBounded(50, 0);
          }
          var9 = this.isScared(0) ? 1 : 0;
          var10 = this.h(21302) ? 1 : 0;
          if (param4 > -55) {
            this.getSize(-9);
          }
          var11 = 0;
          if (var9 == 0 &&
            var10 == 0 &&
            var17.nextBounded(500, 0) == 0) {
            var11 = 1;
          }
          if (this.field_h > 0) {
            this.field_h = this.field_h - 1;
            if (this.field_h == 0) {
              var11 = 1;
              if (0 < this.scaredTicks) {
                this.field_o = this.scaredTicks;
                this.scaredTicks = 0;
              }
            }
          }
          if (var11 != 0 &&
            !this.field_l) {
            this.field_p = 0;
            this.field_s = 0;
            if (var10 == 0 &&
              var9 == 0) {
              this.startCooldown(param6, -92);
            }
            return;
          }
          if (this.field_l) {
            var12 = 65536;
            this.field_s = var12 * VertexStreamLayout.field_f[this.direction][0];
            this.field_p = var12 * VertexStreamLayout.field_f[this.direction][1];
          }
          if (0 == this.field_s &&
            0 == this.field_p) {
            if (var9 == 0) {
              var13 = var17.nextBounded(8, 0);
              var12Lifetime1 = var17.nextBounded(32768, 0) + 32768;
            } else {
              var12Lifetime1 = 196608;
              var13 = var17.nextBounded(8, 0);
            }
            this.direction = var13;
            this.field_s = var12Lifetime1 * VertexStreamLayout.field_f[this.direction][0];
            this.field_p = VertexStreamLayout.field_f[this.direction][1] * var12Lifetime1;
            if (0 < this.scaredTicks) {
              if (this.field_s != 0 &&
                lw.signum(this.field_s, (byte) -87) == lw.signum(-this.offsetX + this.field_u, (byte) -87)) {
                this.field_s = -this.field_s;
                this.direction = EditableTextField.a(this.direction, 6);
              }
              if (this.field_p != 0 &&
                lw.signum(this.field_p, (byte) -95) == lw.signum(this.field_m - this.offsetY, (byte) -93)) {
                this.field_p = -this.field_p;
                this.direction = SweeperMountComponent.mirrorDirection(0, this.direction);
              }
            }
            if (0 != this.field_s &&
              this.field_p != 0) {
              this.field_s = 180 * (this.field_s >> 8);
              this.field_p = 180 * (this.field_p >> 8);
            }
            this.field_h = var17.nextBounded(75, 0) + 25;
          }
          if (0 < this.scaredTicks) {
            this.scaredTicks = this.scaredTicks - 1;
          }
          var12Lifetime2 = this.offsetX;
          this.offsetX = this.offsetX + this.field_s;
          var13Lifetime1 = this.offsetY;
          this.offsetY = this.offsetY + this.field_p;
          var14 = (-this.size + param1) / 2;
          if (-var14 > this.offsetX) {
            this.offsetX = -var14;
            this.field_h = 1;
          }
          var15 = (-this.size + param2) / 2;
          if (var14 < this.offsetX) {
            this.field_h = 1;
            this.offsetX = var14;
          }
          if (-var15 > this.offsetY) {
            this.offsetY = -var15;
            this.field_h = 1;
          }
          if (this.offsetY > var15) {
            this.field_h = 1;
            this.offsetY = var15;
          }
          if (var12Lifetime2 == this.offsetX &&
            this.offsetY == var13Lifetime1) {
            return;
          }
          if (param6.isBoxBlocked((Collidable) null, this.size, 2, 1, param3 + this.offsetY, param0 + this.offsetX, false, param5, this.size)) {
            this.field_o = this.field_o + 2;
            this.field_o = MidiVoiceMixer.min(75, this.field_o, 125);
            if (this.h(21302)) {
              this.offsetX = (this.offsetX - var12Lifetime2) / 4 + var12Lifetime2;
              this.offsetY = var13Lifetime1 + (-var13Lifetime1 + this.offsetY) / 4;
            } else {
              this.field_p = 0;
              this.offsetX = var12Lifetime2;
              this.offsetY = var13Lifetime1;
              this.field_s = 0;
            }
          } else {
            if (this.field_o > 0) {
              this.field_o = this.field_o - 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_79_0 = var8;
          stackIn_79_1 = new StringBuilder().append("aia.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param6 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final int getSize(int param0) {
        if (param0 != 0) {
          return -7;
        }
        return this.size;
    }

    final void mirror(int param0) {
        int var2 = -1 / ((param0 - 75) / 51);
        this.field_s = -this.field_s;
        this.offsetX = -this.offsetX;
        this.field_u = -this.field_u;
        this.direction = EditableTextField.a(this.direction, 6);
    }

    final void updateAgainstPlayer(int param0, boolean param1, int param2, int param3, Player param4) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7Lifetime1;
        try {
          if (param4.isDying(122)) {
            return;
          }
          if (param4.getIdleTicks((byte) -127) <= 0) {
            this.field_w = this.field_w + 1;
            if (this.field_w > 20) {
              this.field_g = 0;
            }
          } else {
            this.field_w = 0;
            this.field_g = this.field_g + 1;
          }
          stackIn_9_0 = (param4.getMoveSpeed(false) < 196608) ? 0 : 1;
          var6_int = stackIn_9_0;
          if (param1) {
            stackIn_13_0 = (15 > this.field_g) ? 0 : 1;
            var7 = stackIn_13_0;
            if (this.overlapsPlayer(-196609, param4, param2, param3) &&
              var6_int != 0 &&
              var7 != 0) {
              param4.kill(2, (byte) 97, 7);
            }
          }
          this.field_l = false;
          if (!this.isScared(0) &&
            !this.h(21302) &&
            var6_int != 0 &&
            param1 &&
            0 < this.field_g) {
            var7Lifetime1 = param3 + this.offsetX;
            var8 = this.offsetY + param2;
            var9 = -var7Lifetime1 + param4.getX(3);
            var10 = -var8 + param4.getY(9648);
            this.direction = ConstrainToCircleLocomotor.toDirection8(var9, var10, -111);
            this.field_l = true;
          }
          if (param0 <= 98) {
            this.getDirection(5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("aia.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int e(int param0) {
        if (null == baa.field_d.field_i) {
          BitPacketBuffer.a(true, WeaponShooterBehaviour.field_r, PitModel.field_s);
          return 4;
        }
        if (HuffmanCodec.field_a == baa.field_d.field_i.field_b) {
          return 0;
        }
        if (ControllerLocomotor.field_t == baa.field_d.field_i.field_b) {
          return 2;
        }
        if (baa.field_d.field_i.field_b == DateInputWidget.field_z) {
          return 1;
        }
        if (baa.field_d.field_i.field_b == vea.field_c) {
          return 3;
        }
        if (baa.field_d.field_i.field_b == UsernameSuggestionsPanel.field_x) {
          return 4;
        }
        if (param0 != 5) {
          byte[] var2 = (byte[]) null;
          PitSnake.computeCrc32((byte[]) null, 116, 108, 51);
        }
        if (CharacterSelection.field_d != baa.field_d.field_i.field_b) {
          return -1;
        }
        return 5;
    }

    final int getOffsetX(byte param0) {
        if (param0 < 32) {
          this.size = 85;
        }
        return this.offsetX;
    }

    private final boolean h(int param0) {
        if (param0 != 21302) {
          this.field_m = 121;
        }
        return 20 < this.field_o ? true : false;
    }

    final void scareFrom(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
          Room var6 = (Room) null;
          this.tick(-51, -111, -16, -86, (byte) -10, (Trap) null, (Room) null);
        }
        this.field_p = 0;
        if (0 == this.scaredTicks) {
          this.field_s = 0;
        }
        this.scaredTicks = 200;
        this.cooldownTicks = 0;
        this.field_u = param0;
        this.field_m = param2;
    }

    public static void releaseStatics(int param0) {
        field_v = null;
        field_t = null;
        int var1 = 12 % ((-7 - param0) / 47);
        field_j = null;
    }

    final int getDirection(int param0) {
        if (param0 != 2) {
          this.field_u = 118;
        }
        return this.direction;
    }

    final static int computeCrc32(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param3; param1 > var5; var5++) {
            var4_int = SpriteSampleOperator.field_q[(var4_int ^ param0[var5]) & 255] ^ var4_int >>> 8;
          }
          var5Lifetime1 = -75 % ((param2 + 33) / 55);
          var4_int = ~var4_int;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("aia.N(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean overlapsPlayer(int param0, Player param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -196609) {
            this.offsetY = 31;
          }
          stackIn_3_0 = io.centredBoxesOverlap(param1.getWidth(-28) / 2, this.offsetY + param2, (byte) -63, param1.getHeight((byte) 55) / 2, this.offsetX + param3, param1.getY(9648), this.size / 2, this.size / 2, param1.getX(3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("aia.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void startCooldown(Room param0, int param1) {
        try {
          if (param1 > -72) {
            this.getSize(-8);
          }
          this.cooldownTicks = 50 + param0.getRandom(-120).nextBounded(50, 0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "aia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isScared(int param0) {
        if (param0 != 0) {
          this.getSize(-80);
        }
        return 0 < this.scaredTicks ? true : false;
    }

    final boolean isCoolingDown(int param0) {
        if (param0 != 180) {
          Player var3 = (Player) null;
          this.updateAgainstPlayer(79, false, 55, 0, (Player) null);
        }
        return 0 < this.cooldownTicks ? true : false;
    }

    PitSnake(int param0, int param1, int param2) {
        this.offsetX = param0;
        this.size = param2;
        this.offsetY = param1;
    }

    static {
        field_t = new int[16384];
        field_v = "You are not currently logged in to the<nbsp>game.";
    }
}
