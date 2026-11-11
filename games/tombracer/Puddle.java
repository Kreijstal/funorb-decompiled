/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Puddle extends PooledObject implements Renderable, Collidable, WorldBody {
    private int endSize;
    private Room room;
    private int field_n;
    static UiComponent field_v;
    private int size;
    private int startSize;
    private int previousY;
    private int field_t;
    private boolean expired;
    private int previousX;
    private int x;
    private int kind;
    private int y;
    private int field_m;
    private int field_w;

    final static void b(int param0, byte param1) {
        int var3 = 0;
        upa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > -101) {
            Puddle.b(-10, (byte) -8);
          }
          var4 = (upa) (LoadingStepList.field_d.first(-80));
          while (var4 != null) {
            GameClock.a(var4, param0, 2147);
            var4 = (upa) (LoadingStepList.field_d.next(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "mda.S(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return this.expired;
    }

    private final void init(int param0, int param1, int param2, Room param3, int param4, int param5) {
        try {
          this.expired = false;
          this.room = param3;
          this.startSize = param4 * 2;
          this.field_m = 0;
          this.field_n = param2;
          this.kind = param0;
          this.endSize = RandomBrickOperator.max(param1 * param5, 786432, 2);
          this.field_t = 0;
          this.size = this.startSize;
          this.savePreviousPosition(0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mda.R(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int resolveMove(int param0, int param1, int param2, int param3, int param4) {
        if (this.kind == 1) {
          int var6 = 80 / ((-23 - param1) / 56);
          return this.room.resolveMove((Collidable) (this), (WorldBody) (this), 1, this.size, param3, 12, this.size, this.x, param4, param0, this.y, param2, true);
        }
        return 0;
    }

    public final boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.kind != 1) {
            return false;
          }
          if (param0 != -1) {
            this.endSize = 97;
          }
          var5_int = SimulationObserver.clipBeamToBox(this.size, 12, this.y, this.size, param3, this.x, 2);
          if (var5_int == -1) {
            return false;
          }
          var6 = wm.a(4096, var5_int, 108);
          param3.shortenTo(var6, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("mda.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void mirrorInRoom(Room param0, int param1) {
        try {
          this.x = param0.mirrorX(this.x, (byte) 71);
          if (param1 >= -16) {
            Puddle.b(-115, (byte) 124, 61, -21);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mda.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int getWeight(int param0) {
        int var2 = -50 % ((param0 - 1) / 45);
        if (this.kind != 1) {
          return 0;
        }
        return this.size >> 17;
    }

    public final int getX(int param0) {
        if (param0 != 3) {
          return -56;
        }
        return this.x;
    }

    final void addToScene(RenderScene param0, int param1) {
        try {
          if (param1 != 5465) {
            this.field_m = -24;
          }
          param0.addToLayer((byte) 111, 6, (Renderable) (this));
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mda.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int applyBeamEffect(Effect param0, int param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SimulationObserver.clipBeamToBox(this.size, param1, this.y, this.size, param2, this.x, 2) < 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          stackIn_5_0 = this.reactToEffect(param0, -6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("mda.ED(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final boolean isPushable(byte param0, boolean param1) {
        boolean stackIn_7_0 = false;
        if (param0 != -55) {
          return true;
        }
        if (this.kind == 1) {
          stackIn_7_0 = true;
        } else {
          if (param1) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    public final boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.kind &&
            this.intersectsRect((byte) 110, param4, param6, param0, param3)) {
            return true;
          }
          if (param2 >= 55) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_11_0 = var9;
          stackIn_11_1 = new StringBuilder().append("mda.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final boolean isSolidFor(WorldBody param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            this.startSize = -102;
          }
          stackIn_5_0 = (this.kind == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mda.DA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int applyProjectileEffect(Effect param0, Projectile param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.getSize(-1);
          if (param2 >= -97) {
            this.room = (Room) null;
          }
          stackIn_3_0 = this.applyAreaEffect(param0, var4_int, param1.getX(3), 0, param1.getY(9648), var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mda.SD(");
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
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = 12 % ((param0 + 23) / 53);
        return this.x;
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          return 2;
        }
        return 0;
    }

    public final int getElevation(byte param0) {
        if (param0 != 115) {
          this.getRoom((byte) -93);
          return 0;
        }
        return 0;
    }

    final void setPosition(int param0, byte param1, int param2, int param3) {
        if (param1 == -78) {
          this.y = param2;
          this.x = param0;
          return;
        }
        Projectile var6 = (Projectile) null;
        this.applyProjectileEffect((Effect) null, (Projectile) null, -22);
        this.y = param2;
        this.x = param0;
    }

    final static boolean b(int param0, byte param1, int param2, int param3) {
        if (fua.field_g) {
          return apa.field_c.dispatchKeyInput((byte) -121, MenuEntry.field_h, HardwareOpenGlToolkit.field_td);
        }
        if (vo.field_b) {
          return KeySwitchComponent.c(param1 + 2097196, param0, param3);
        }
        if (GameScreen.a(param0, false, param3)) {
          return true;
        }
        if (PowerDownItemBehaviour.field_s) {
          return false;
        }
        if (param1 == -44) {
          return ChooseRewardFactory.a(param2, true, param0);
        }
        Puddle.releaseStatics((byte) -121);
        return ChooseRewardFactory.a(param2, true, param0);
    }

    public final int getY(int param0) {
        if (param0 == 9648) {
          return this.y;
        }
        Collidable var3 = (Collidable) null;
        this.overlapsBox(-103, (WorldBody) null, -104, -49, -55, (Collidable) null, -28, -39);
        return this.y;
    }

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          this.previousY = 45;
          return this.y;
        }
        return this.y;
    }

    public final int getFacingAngle(int param0) {
        if (param0 != -25787) {
          this.y = 118;
          return 0;
        }
        return 0;
    }

    private final int reactToEffect(Effect param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -6) {
            stackIn_3_0 = 114;
            return stackIn_3_0;
          }
          if (0 == this.kind) {
            if (param0.type == 3) {
              this.field_m = this.field_m + 25;
            } else {
              if (param0.type == 5) {
                this.expire((byte) -127);
                this.room.spawnPuddle(param1 + 30103, this.size / 2, 1, this.y, this.x);
                var3_int = param0.size;
              }
            }
          } else {
            if (this.kind == 1) {
              if (param0.type == 3) {
                this.expire((byte) -126);
                this.room.spawnPuddle(30097, this.size / 2, 0, this.y, this.x);
                var3_int = param0.size;
              } else {
                if (param0.type != 5 &&
                  param0.type == 0) {
                  this.size = this.size - 262144;
                  this.expireIfSmallerThan(786432);
                  var3_int = param0.size;
                }
              }
            }
          }
          stackIn_17_0 = var3_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("mda.K(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void expire(byte param0) {
        this.expired = true;
        if (param0 > -120) {
          return;
        }
        this.room.collisionGrid.remove((Collidable) (this), (byte) 82);
    }

    public final int getCollisionId(boolean param0) {
        if (!param0) {
          return 18;
        }
        return 11 * (1 + this.field_w);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 87) {
          Puddle.b(-56, (byte) 104, -90, 106);
          field_v = null;
          return;
        }
        field_v = null;
    }

    public final boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_17_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_34_0 = false;
        if (param0 <= 68) {
          this.field_t = -15;
          if (!this.isPushable((byte) -55, param1)) {
            return false;
          }
          if (param4 != 0) {
            this.savePreviousPosition(0);
            this.moveBy(param3, (byte) -36, param2, param4, param5);
            if (this.previousX + param4 != this.x) {
              return false;
            }
            if (this.y != this.previousY + param3) {
              return false;
            }
            return true;
          }
          if (param3 == 0) {
            return true;
          }
          this.savePreviousPosition(0);
          this.moveBy(param3, (byte) -36, param2, param4, param5);
          if (this.previousX + param4 != this.x) {
            return false;
          }
          stackIn_17_0 = (this.y == this.previousY + param3);
          return stackIn_17_0;
        }
        if (!this.isPushable((byte) -55, param1)) {
          return false;
        }
        if (param4 != 0) {
          this.savePreviousPosition(0);
          this.moveBy(param3, (byte) -36, param2, param4, param5);
          stackIn_27_0 = (this.previousX + param4 == this.x) && (this.y == this.previousY + param3);
          return stackIn_27_0;
        }
        if (param3 == 0) {
          return true;
        }
        this.savePreviousPosition(0);
        this.moveBy(param3, (byte) -36, param2, param4, param5);
        stackIn_34_0 = (this.previousX + param4 == this.x) && (this.y == this.previousY + param3);
        return stackIn_34_0;
    }

    public final boolean intersectsRect(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 == 110) {
          return io.centredBoxesOverlap(param4, this.y, (byte) -70, param3, this.x, param1, this.size, this.size, param2);
        }
        this.updateAnimation(-11);
        return io.centredBoxesOverlap(param4, this.y, (byte) -70, param3, this.x, param1, this.size, this.size, param2);
    }

    public final int getPreviousX(int param0) {
        if (param0 <= 90) {
          Puddle.b(122, (byte) -32, 39, 92);
          return this.previousX;
        }
        return this.previousX;
    }

    public final boolean isOutsideActiveVariant(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    public final void render(int param0, Camera param1) {
        try {
          if (param0 <= 103) {
            this.getWeight(-91);
          }
          DropAnimation.roomObjectRenderer.drawPuddle(this, 95, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mda.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void moveBy(int param0, byte param1, int param2, int param3, int param4) {
        int var6;
        int var6Lifetime1;
        if (1 != this.kind) {
          return;
        }
        this.savePreviousPosition(0);
        var6 = 0;
        if (param1 > -11) {
          return;
        }
        if (param3 != 0) {
          var6 = 1;
          this.x = this.x + param3;
        }
        if (var6 != 0 &&
          2 == this.resolveMove(this.x - this.previousX, -104, param4, 0, param2)) {
          this.x = this.previousX;
        }
        var6Lifetime1 = 0;
        if (0 != param0) {
          this.y = this.y + param0;
          var6Lifetime1 = 1;
        }
        if (var6Lifetime1 != 0 &&
          this.resolveMove(0, -103, param4, this.getY(9648) - this.previousY, param2) == 2) {
          this.y = this.previousY;
        }
        if (this.y == this.previousY &&
          this.x == this.previousX) {
          return;
        }
        this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -123);
        this.room.collisionGrid.insert((Collidable) (this), 7073);
        return;
    }

    final int getKind(int param0) {
        int var2 = -27 % ((param0 - 55) / 55);
        return this.kind;
    }

    public final int getHeight(byte param0) {
        if (param0 != 55) {
          return -104;
        }
        return this.size;
    }

    private final void savePreviousPosition(int param0) {
        this.previousX = this.x;
        if (param0 == 0) {
          this.previousY = this.y;
          return;
        }
        this.y = -105;
        this.previousY = this.y;
    }

    public final Room getRoom(byte param0) {
        int var2 = 38 / ((param0 - 0) / 61);
        return this.room;
    }

    final void spawn(Room param0, int param1, int param2, int param3, int param4, int param5) {
        IsaacCipher var7 = null;
        int var8 = 0;
        try {
          var7 = param0.getRandom(-79);
          if (param4 == 0) {
            var8 = 200 + var7.nextBounded(100, 0);
          } else {
            var8 = 0;
          }
          if (param2 <= 36) {
            this.field_t = -51;
          }
          this.init(param4, 1, var8, param0, param5, 2);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mda.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int getSize(int param0) {
        if (param0 != 1) {
          this.field_m = -125;
          return this.size;
        }
        return this.size;
    }

    final void restartGrowth(byte param0) {
        this.size = this.startSize;
        if (param0 == -1) {
          this.field_m = 0;
          return;
        }
        this.getRenderY((byte) 100);
        this.field_m = 0;
    }

    public final boolean restsOnFloor(int param0) {
        int var2 = 7 % ((param0 - 6) / 46);
        return 1 == this.kind ? true : false;
    }

    final PooledObject createInstance(boolean param0) {
        if (!param0) {
          this.getPreviousY(117);
          return (PooledObject) ((Object) new Puddle());
        }
        return (PooledObject) ((Object) new Puddle());
    }

    private final void expireIfSmallerThan(int param0) {
        if (param0 > this.size) {
          this.expire((byte) -121);
        }
    }

    public final boolean isExpired(int param0) {
        if (param0 != 18407) {
          return true;
        }
        return this.expired;
    }

    public final int getSurfaceCoverage(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          return 75;
        }
        return 0;
    }

    final void tick(int param0, boolean param1) {
        float var3;
        Player var5;
        Player var6;
        Player var7;
        float var3Lifetime1;
        float var3Lifetime2;
        if (this.expired) {
          return;
        }
        if (param1) {
          this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -50);
          if (0 < this.field_n) {
            var3 = (float)this.field_m / (float)this.field_n;
            this.size = (int)((float)(this.endSize - this.startSize) * var3 + (float)this.startSize);
          }
          this.expireIfSmallerThan(param0 ^ -786433);
          this.room.collisionGrid.insert((Collidable) (this), 7073);
          if (~this.kind != param0) {
            return;
          }
          var5 = this.room.getPlayer(-37);
          if (this.intersectsRect((byte) 110, var5.getY(9648), var5.getX(3), var5.getHeight((byte) 55), var5.getWidth(param0 ^ 104))) {
            var5.applySlow(31027);
          }
          return;
        }
        if (this.field_t > 0) {
          this.field_t = this.field_t - 1;
        } else {
          if (this.field_n > 0) {
            this.field_m = this.field_m + 1;
            if (this.field_n <= this.field_m) {
              this.expire((byte) -126);
              return;
            }
            this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -50);
            if (0 < this.field_n) {
              var3Lifetime1 = (float)this.field_m / (float)this.field_n;
              this.size = (int)((float)(this.endSize - this.startSize) * var3Lifetime1 + (float)this.startSize);
            }
            this.expireIfSmallerThan(param0 ^ -786433);
            this.room.collisionGrid.insert((Collidable) (this), 7073);
            if (~this.kind != param0) {
              return;
            }
            var6 = this.room.getPlayer(-37);
            if (this.intersectsRect((byte) 110, var6.getY(9648), var6.getX(3), var6.getHeight((byte) 55), var6.getWidth(param0 ^ 104))) {
              var6.applySlow(31027);
            }
            return;
          }
        }
        this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -50);
        if (0 < this.field_n) {
          var3Lifetime2 = (float)this.field_m / (float)this.field_n;
          this.size = (int)((float)(this.endSize - this.startSize) * var3Lifetime2 + (float)this.startSize);
        }
        this.expireIfSmallerThan(param0 ^ -786433);
        this.room.collisionGrid.insert((Collidable) (this), 7073);
        if (~this.kind != param0) {
          return;
        }
        var7 = this.room.getPlayer(-37);
        if (this.intersectsRect((byte) 110, var7.getY(9648), var7.getX(3), var7.getHeight((byte) 55), var7.getWidth(param0 ^ 104))) {
          var7.applySlow(31027);
        }
        return;
    }

    public final boolean canBeCrushedBy(WorldBody param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.room = (Room) null;
          }
          stackIn_3_0 = this.isSolidFor(param0, (byte) 61);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mda.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean crush(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.isSolidFor(param1, (byte) 61)) {
            return false;
          }
          if (param0 > -77) {
            this.field_n = -69;
          }
          this.expire((byte) -128);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mda.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.kind = 113;
        }
    }

    public final int getPreviousY(int param0) {
        if (param0 != -21185) {
          this.field_m = -67;
          return this.previousY;
        }
        return this.previousY;
    }

    public final int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.intersectsRect((byte) 110, param4, param2, param5, param1)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param3 != 0) {
            this.room = (Room) null;
          }
          stackIn_6_0 = this.reactToEffect(param0, -6);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("mda.WC(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    Puddle() {
        int fieldTemp$0 = SwitchableIdAllocator.field_a;
        SwitchableIdAllocator.field_a = SwitchableIdAllocator.field_a + 1;
        this.field_w = fieldTemp$0;
    }

    public final int getWidth(int param0) {
        if (param0 >= -11) {
          this.startSize = 88;
          return this.size;
        }
        return this.size;
    }

    public final boolean isFallingIntoPit(int param0) {
        if (param0 != -1) {
          this.isPushable((byte) -105, false);
          return false;
        }
        return false;
    }

    public final boolean isMobile(boolean param0) {
        if (param0) {
          return this.kind == 1 ? true : false;
        }
        this.field_w = -99;
        return this.kind == 1 ? true : false;
    }

    static {
    }
}
