/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Room implements SwitchableScope, Renderable, noa {
    int formatVersion;
    static AsyncRequest field_R;
    private int id;
    private PlayerSimulation simulation;
    private int field_e;
    private int width;
    static String[] field_m;
    static kia field_k;
    private int field_C;
    private int courseIndex;
    private IntrusiveDeque obstacles;
    private int height;
    static ToolkitSprite field_j;
    static ToolkitSprite[][] field_p;
    private IntrusiveDeque traps;
    private IntrusiveDeque components;
    private IsaacCipher random;
    private RenderScene scene;
    private int randomSeed;
    int stateHash;
    private IntrusiveDeque recentDeaths;
    private ObjectPool projectilePool;
    private ObjectPool puddlePool;
    private ObjectPool particlePool;
    CollisionGrid collisionGrid;
    private IsaacCipher seededRandom;
    private CorpseList corpses;
    private TileGrid tileGrid;
    private int ticksSinceReset;
    private BitPacketBuffer data;
    private SwitchableIdAllocator trapIdAllocator;
    private bba field_U;
    private int tick;
    private boolean mirrored;
    private SwitchableIdAllocator componentIdAllocator;
    private Collidable mainSupporter;
    private int entranceX;
    private RoomHeader header;
    private int[] effectSlots;
    private int entranceY;
    private RoomEffectTraps effectTraps;
    private int deathCount;
    private int lightingPreset;
    private ParticleEffects particleEffects;
    private int field_A;
    SoundEventQueue soundQueue;

    private final Puddle allocatePuddle(int param0, int param1, int param2, int param3) {
        int var5 = 112 / ((param0 + 6) / 43);
        return (Puddle) (this.puddlePool.spawn(-2698, param1, param2, this.scene, param3));
    }

    final int classifySupportAt(int param0, int param1, WorldBody param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < -121) {
            stackIn_4_0 = this.classifySupport(param4, 32238, param2, param3, this.collisionGrid.b(param4, -1, param3, param0, param1), param0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -66;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("la.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final bba w(int param0) {
        if (param0 != 0) {
          this.field_C = 2;
        }
        return this.field_U;
    }

    private final int classifySupport(int param0, int param1, WorldBody param2, int param3, Collidable[] param4, int param5, int param6) {
        int stackIn_13_0 = 0;
        Collidable stackIn_19_0 = null;
        WorldBody stackIn_19_1 = null;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        Collidable var13 = null;
        int var14 = 0;
        Collidable var15 = null;
        Collidable var13Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = 0;
          var10 = null;
          var11 = 0;
          for (var12 = 0; param4.length > var12; var12++) {
            var15 = param4[var12];
            var13 = var15;
            if (var13 != param2) {
              var9 = var15.getSurfaceCoverage(true, param5, param0, param3, 0, param6);
              if (var9 > var8_int) {
                var10 = var13;
                var8_int = var9;
              }
              var11 = var11 + var9;
            }
          }
          if (var11 < (param5 >> 16) * (param6 >> 16)) {
            this.mainSupporter = (Collidable) (var10);
            stackIn_13_0 = 0;
            return stackIn_13_0;
          }
          var8_intLifetime1 = 0;
          if (param1 != 32238) {
            this.mirrored = false;
          }
          for (var12Lifetime1 = 0; param4.length > var12Lifetime1; var12Lifetime1++) {
            var13Lifetime1 = param4[var12Lifetime1];
            stackIn_19_0 = var13Lifetime1;
            stackIn_19_1 = (WorldBody) (param2);
            if (stackIn_19_0 != stackIn_19_1) {
              var9Lifetime1 = var13Lifetime1.getSurfaceCoverage(true, param5, param0, param3, 1, param6);
              if (var9Lifetime1 > var8_intLifetime1) {
                var8_intLifetime1 = var9Lifetime1;
                var10 = var13Lifetime1;
              }
            }
          }
          if (var8_intLifetime1 <= 0) {
            this.mainSupporter = null;
            stackIn_30_0 = 1;
            return stackIn_30_0;
          }
          this.mainSupporter = (Collidable) (var10);
          stackIn_28_0 = 2;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_33_0 = var8;
          stackIn_33_1 = new StringBuilder().append("la.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean spawnPuddle(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        IntrusiveDequeCursor var8;
        Puddle var9;
        int var10;
        int var11;
        Puddle var12;
        var11 = TombRacer.field_G ? 1 : 0;
        var6 = 262144;
        if (param1 < var6) {
          return false;
        }
        var7 = this.classifySupportAt(var6, var6, (WorldBody) null, param4, param3, (byte) -128);
        if (1 == var7) {
          return false;
        }
        var8 = new IntrusiveDequeCursor(this.puddlePool.active);
        if (param0 != 30097) {
          this.expandBorder(-85, -33);
        }
        var9 = (Puddle) (var8.first(true));
        while (var9 != null) {
          if (~var9.getKind(-70) == ~param2) {
            var10 = var9.getSize(param0 ^ 30096);
            if (io.centredBoxesOverlap(var6, var9.getY(9648), (byte) -78, var6, var9.getX(3), param3, var10, var10, param4)) {
              var9.restartGrowth((byte) -1);
              return true;
            }
          }
          var9 = (Puddle) (var8.next(param0 ^ -30098));
        }
        if (param2 == 1 &&
          this.isBoxBlocked((Collidable) null, param1 * 2, 2, 1, param3, param4, false, (WorldBody) null, 2 * param1)) {
          return false;
        }
        var12 = this.allocatePuddle(94, param3, 0, param4);
        var12.a(this, param4, 99, param3, param2, param1);
        this.collisionGrid.remove((Collidable) (var12), (byte) 124);
        return true;
    }

    final Particle spawnParticle(int param0, int param1, byte param2, int param3) {
        if (param2 != 100) {
          this.isTimeFrozen((byte) 119);
        }
        Particle var5 = (Particle) (this.particlePool.spawn(-2698, param1, param3, this.scene, param0));
        var5.a(true, uca.cosmeticRandom.nextBounded(100, 0));
        return var5;
    }

    final RenderScene getScene(byte param0) {
        int var2 = -2 % ((param0 + 2) / 36);
        return this.scene;
    }

    final int getDeathCount(int param0) {
        if (param0 != 0) {
          this.simulation = (PlayerSimulation) null;
        }
        return this.deathCount;
    }

    final int getHeight(int param0) {
        int var2 = -114 / ((param0 + 42) / 61);
        return this.height;
    }

    final ParticleEffects getParticleEffects(boolean param0) {
        if (param0) {
          this.tileGrid = (TileGrid) null;
        }
        return this.particleEffects;
    }

    final void setSoundQueue(int param0, SoundEventQueue param1) {
        try {
          if (param0 != 4855) {
            this.effectTraps = (RoomEffectTraps) null;
          }
          this.soundQueue = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void addTrap(Trap param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 32) {
            this.getDeathCount(-75);
          }
          if (param0.isTopLevel((byte) 121)) {
            this.traps.addLast((byte) -94, param0);
            param0.addToRoomRecursive(param1 + 82);
            param0.updateParentRotation((byte) -60);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void removeObjectsOutsideVariant(byte param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (-1 == param1) {
          return;
        }
        Trap var3 = (Trap) (this.traps.first(-80));
        while (var3 != null) {
          if (!var3.isInVariant(param1, 31749)) {
            this.removeTrap(var3, 2);
            var3.remove((byte) 109);
          } else {
            var3.removeChildrenOutsideVariant(param1, (byte) -55);
          }
          var3 = (Trap) (this.traps.next(115));
        }
        Obstacle var5 = (Obstacle) (this.obstacles.first(-80));
        while (var5 != null) {
          if (!var5.b(param1, 1569)) {
            this.removeObstacle(var5, -26755);
            var5.ensureModels(0);
          }
          var5 = (Obstacle) (this.obstacles.next(108));
        }
        if (null != this.tileGrid) {
          this.tileGrid.removeObjectsOutsideVariant(param1, (byte) -33);
        }
        if (param0 >= -4) {
          this.resetEntrance(7);
        }
        Trap var6 = (Trap) (this.traps.first(-80));
        while (var6 != null) {
          var6.refreshModelOccupancy(23645);
          var6 = (Trap) (this.traps.next(125));
        }
        Obstacle var7 = (Obstacle) (this.obstacles.first(-80));
        while (var7 != null) {
          var7.c(true);
          var7 = (Obstacle) (this.obstacles.next(114));
        }
    }

    final void setHeader(byte param0, RoomHeader param1) {
        try {
          this.header = param1;
          if (param0 != 46) {
            this.trapIdAllocator = (SwitchableIdAllocator) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.LC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final TileGrid getTileGrid(byte param0) {
        if (param0 != 93) {
          return (TileGrid) null;
        }
        return this.tileGrid;
    }

    final boolean isBoxInRoom(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param1 != 131072) {
          field_p = (ToolkitSprite[][]) null;
        }
        if (!param5) {
          return io.centredBoxesOverlap(this.width, param4, (byte) -123, this.height, param0, this.height / 2, param3, param2, this.width / 2);
        }
        return ck.containsCentredBox(param0, param3, this.width / 2, this.width, this.height, param4, (byte) 125, this.height / 2, param2);
    }

    final void restart(byte param0) {
        if (param0 >= -24) {
          this.spawnDust(true, 90, -98, 23, -45, -48);
        }
        this.enterAtEntrance((byte) -108, true);
    }

    final SimulationObserver getObserver(int param0) {
        if (param0 != -1) {
          SoundEventQueue var3 = (SoundEventQueue) null;
          this.setSoundQueue(15, (SoundEventQueue) null);
        }
        return this.getSimulation(-1553494544).getObserver(param0 + 9263);
    }

    final void mirrorRoom(int param0, boolean param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.tileGrid.mirror((byte) 64);
        Trap var6 = (Trap) (this.traps.first(param0 - 87));
        while (var6 != null) {
          var6.mirror(this, false);
          var6 = (Trap) (this.traps.next(115));
        }
        Obstacle var7 = (Obstacle) (this.obstacles.first(-80));
        while (var7 != null) {
          var7.a(-76, this);
          var7 = (Obstacle) (this.obstacles.next(122));
        }
        RoomComponent var8 = (RoomComponent) (this.components.first(-80));
        while (var8 != null) {
          var8.mirror(this, 1);
          var8 = (RoomComponent) (this.components.next(126));
        }
        if (param0 != 7) {
          WorldBody var5 = (WorldBody) null;
          this.sumSurfaceCoverage(-11, 100, 116, 16, 41, 79, (WorldBody) null);
        }
        this.entranceX = this.mirrorX(this.entranceX, (byte) 71);
        if (param1) {
          if (this.simulation.getCurrentRoom((byte) -3) == this) {
            this.getPlayer(-9).mirror((byte) -57);
          }
          this.corpses.mirrorInRoom(this, -110);
          this.projectilePool.a(121);
          this.puddlePool.a(119);
          this.particlePool.a(97);
        }
    }

    final IsaacCipher getSeededRandom(boolean param0) {
        if (!param0) {
          return (IsaacCipher) null;
        }
        return this.seededRandom;
    }

    private final void resetEntrance(int param0) {
        if (param0 <= 98) {
          this.lightingPreset = 98;
        }
        this.entranceX = this.width / 2;
        this.entranceY = this.height - 6291456;
    }

    final boolean isTimeFrozen(byte param0) {
        if (param0 != 53) {
          this.spawnPuddle(31, 62, -43, -109, -2);
        }
        return this.getSimulation(-1553494544).isTimeFrozen(110);
    }

    final void removeTileOccupancy(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 > -110) {
          this.effectTraps = (RoomEffectTraps) null;
        }
        this.tileGrid.removeOccupancy(param3, param6, true, param0, param1, param2, param5);
    }

    final IsaacCipher getRandom(int param0) {
        int var2 = 60 % ((-19 - param0) / 42);
        return this.random;
    }

    final Projectile spawnProjectile(int param0, int param1, int param2, int param3) {
        int var5 = -101 / ((29 - param2) / 33);
        return (Projectile) (this.projectilePool.spawn(-2698, param0, param3, this.scene, param1));
    }

    final boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.header.a(-25584);
    }

    private final void reset(boolean param0, byte param1) {
        PlayerSimulation var4;
        this.seededRandom = null;
        this.random = null;
        this.obstacles.clear(8);
        if (param1 <= 95) {
          Room.l(-107);
        }
        this.traps.clear(8);
        this.components.clear(8);
        if (this.soundQueue != null) {
          this.soundQueue.stopAll((byte) -127);
        }
        if (param0) {
          this.random = new IsaacCipher(new int[]{this.randomSeed});
          this.seededRandom = new IsaacCipher(new int[]{this.randomSeed});
          this.collisionGrid = new CollisionGrid(false, 16);
          this.particlePool = new ObjectPool(this, new Particle(), 100);
          this.projectilePool = new ObjectPool(this, new Projectile(), 25);
          this.puddlePool = new ObjectPool(this, new Puddle(), 50);
          this.tileGrid = new TileGrid(this, 2097152);
          this.particlePool.releaseAll((byte) 114);
          this.projectilePool.releaseAll((byte) 122);
          this.puddlePool.releaseAll((byte) 116);
          this.particleEffects = new ParticleEffects(this);
          if (this.field_U != null) {
          }
          this.ticksSinceReset = 0;
        }
        this.corpses.clear(-10430);
        var4 = this.getSimulation(-1553494544);
        if (var4 != null) {
          var4.onRoomReset(this, -9774);
        }
        if (this.scene != null) {
          this.scene.clear(10);
        }
        this.effectTraps.forgetTraps((byte) 100);
    }

    final boolean isOnFloorAt(boolean param0, int param1, WorldBody param2, int param3) {
        RuntimeException var5 = null;
        Effect var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var6 = (Effect) null;
            this.applyProjectileEffect((Projectile) null, -25, (Effect) null);
          }
          stackIn_5_0 = (1 == this.classifySupportAt(131072, 131072, param2, param3, param1, (byte) -128));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("la.PB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void assignSwitchableIds(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.trapIdAllocator.reset((byte) 97);
        Trap var2 = (Trap) (this.traps.first(-80));
        if (param0 != 9) {
          this.getComponentIdAllocator(-36);
        }
        while (var2 != null) {
          var2.assignSwitchableIds(true, false, this.trapIdAllocator, new SwitchableIdAllocator());
          var2 = (Trap) (this.traps.next(113));
        }
        this.componentIdAllocator.reset((byte) 74);
        RoomComponent var2_ref = (RoomComponent) (this.components.first(param0 ^ -71));
        while (var2_ref != null) {
          var2_ref.a(false, 6, this.componentIdAllocator, new SwitchableIdAllocator());
          var2_ref = (RoomComponent) (this.components.next(108));
        }
    }

    private final int applyBeamEffectToAll(boolean param0, BeamSegment param1, Effect param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        Collidable[] var5 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0) {
            this.trapIdAllocator = (SwitchableIdAllocator) null;
          }
          if (param2 == null) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          var4_int = 0;
          var5 = this.collisionGrid.a(param1, (byte) -103);
          for (var6 = 0; var6 < var5.length; var6++) {
            var4_int = var4_int + var5[var6].applyBeamEffect(param2, 12, param1);
          }
          stackIn_11_0 = var4_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("la.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean traceBeamSegment(int param0, BeamSegment param1, WorldBody param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        Collidable[] var6 = null;
        int var7 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var7 = 67 % ((param3 + 40) / 60);
          param1.blocked = false;
          var6 = this.collisionGrid.a(param1, (byte) -68);
          for (var8 = 0; var6.length > var8; var8++) {
            if (var6[var8].interceptsBeam(-1, param2, param0, param1)) {
              param1.blocked = true;
              var5_int = 1;
            }
          }
          stackIn_9_0 = var5_int;
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("la.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.effectSlots = (int[]) null;
        }
        return this.field_A;
    }

    public final Switchable findSwitchable(int param0, int param1, boolean param2) {
        IntrusiveDequeCursor var4;
        Trap var5;
        Switchable var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 28672) {
          this.toString();
        }
        var4 = new IntrusiveDequeCursor(this.traps);
        var5 = (Trap) (var4.first(true));
        while (var5 != null) {
          var6 = var5.findSwitchableRecursive(false, param1, (byte) -26);
          if (var6 != null) {
            return var6;
          }
          var5 = (Trap) (var4.next(-1));
        }
        return null;
    }

    final int getEffectSlot(int param0, int param1) {
        if (param0 > -95) {
          this.spawnPuddle(10, -88, -18, 76, -15);
        }
        return this.effectSlots[param1];
    }

    final void createScene(iq param0, int param1) {
        try {
          this.scene = new RenderScene(10);
          this.scene.setRenderTarget(-24343, param0);
          if (param1 <= 2) {
            field_R = (AsyncRequest) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void enterAtEntrance(byte param0, boolean param1) {
        RenderScene var3;
        SimulationObserver var3_ref;
        RoomComponent var4;
        int var5;
        WorldBody var6;
        Player var7;
        RenderScene var8;
        RoomComponent var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          this.loadFromData(8);
          if (null == this.field_U) {
            this.expandBorder(6, -20);
            var8 = this.scene;
            var3 = var8;
            this.scene = null;
            var4 = (RoomComponent) (this.components.first(-80));
            while (var4 != null) {
              var4.instantiate(false, true, this, 0, 0, 1, (Trap) null);
              var4 = (RoomComponent) (this.components.next(123));
            }
            var4Lifetime1 = (RoomComponent) (this.components.first(-80));
            while (var4Lifetime1 != null) {
              var4Lifetime1.a(true, 1);
              var4Lifetime1 = (RoomComponent) (this.components.next(115));
            }
            this.components.clear(8);
            this.removeObjectsOutsideVariant((byte) -12, 1);
            this.scene = var8;
          }
          var3_ref = this.getSimulation(-1553494544).getObserver(9262);
          if (var3_ref != null) {
            var3_ref.onRoomEntered(-2, this.getPlayer(-18), this);
          }
        }
        var7 = this.getPlayer(-22);
        var7.placeInRoom(this, this.entranceX, this.entranceY, true);
        var7.respawn(-127, param1);
        if (param0 >= -80) {
          var6 = (WorldBody) null;
          this.sumSurfaceCoverage(94, 108, 82, 71, 28, 102, (WorldBody) null);
        }
        this.collisionGrid.insert(this.getPlayer(-107), 7073);
        if (this.scene != null) {
          this.rebuildScene(-106);
        }
    }

    private final void rebuildScene(int param0) {
        iq var2;
        int var3;
        int var4;
        Trap var5;
        Obstacle var6;
        RoomComponent var7;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.scene == null) {
          return;
        }
        this.scene.clear(10);
        var2 = this.scene.getRenderTarget(0);
        if (param0 >= -86) {
          this.field_C = 71;
        }
        if (this.hasActiveVariant((byte) -82)) {
          var2.a(-128, (byte) -3, (this.height >> 16) + 128, -128, (this.width >> 16) + 128);
        } else {
          var3 = 192;
          var2.a(var3, (byte) -3, (this.height >> 16) - var3, var3, -var3 + (this.width >> 16));
        }
        this.getPlayer(-12).addToScene(25, this.scene);
        this.corpses.a(this.scene, -28255);
        this.projectilePool.a(this.scene, (byte) -89, true, 7);
        this.particlePool.a(this.scene, (byte) 126, true, 7);
        this.puddlePool.a(this.scene, (byte) -33, false, 6);
        var5 = (Trap) (this.traps.first(-80));
        while (var5 != null) {
          var5.addToSceneRecursive(122, this.scene);
          var5 = (Trap) (this.traps.next(107));
        }
        var6 = (Obstacle) (this.obstacles.first(-80));
        while (var6 != null) {
          var6.addToScene((byte) 48, this.scene);
          var6 = (Obstacle) (this.obstacles.next(108));
        }
        var7 = (RoomComponent) (this.components.first(-80));
        while (var7 != null) {
          var7.a(-1704, this.scene);
          var7 = (RoomComponent) (this.components.next(116));
        }
        dea.roomObjectRenderer.prepareRoom(121, this);
        this.tileGrid.a(this.scene, 0);
        if (null != this.soundQueue) {
          this.soundQueue.clear((byte) 119);
        }
        return;
    }

    final void dumpDebug(boolean param0) {
        System.out.println("Rooms ID: " + this.id);
        System.out.println("Projectiles: ");
        this.projectilePool.printAll(false);
        if (!param0) {
          WorldBody var3 = (WorldBody) null;
          this.traceBeamSegment(2, (BeamSegment) null, (WorldBody) null, (byte) 52);
        }
    }

    public final void render(int param0, iq param1) {
        try {
          if (param0 <= 103) {
            this.hasActiveVariant((byte) 66);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void removeTrap(Trap param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.isTopLevel((byte) 113)) {
            param0.unlink(120);
            param0.removeFromRoomRecursive(-165);
          }
          if (param1 != 2) {
            this.getObserver(85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getTicksSinceReset(byte param0) {
        if (param0 != 107) {
          WorldBody var3 = (WorldBody) null;
          this.updateSupport(33, (WorldBody) null);
        }
        return this.ticksSinceReset;
    }

    private final void removeObstacle(Obstacle param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.removeTileOccupancy(-1, param0.getHeight((byte) 55), param0.getWidth(-101), param0.getY(9648), -124, param0.getX(param1 ^ -26754), 0);
          param0.unlink(112);
          this.collisionGrid.remove((Collidable) (param0), (byte) 118);
          if (param1 != -26755) {
            this.components = (IntrusiveDeque) null;
          }
          if (null != this.scene) {
            param0.removeFromScene(this.scene, (byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void updateAnimation(int param0) {
        Trap[] discarded$0 = null;
        if (param0 != -4366) {
          discarded$0 = this.findTrapsInRect(54, 60, 37, -15, -117);
        }
    }

    final void clearEffectSlot(int param0, int param1) {
        this.effectSlots[param1] = -1;
        if (param0 != -22490) {
          this.restart((byte) -124);
        }
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          return 63;
        }
        return this.height / 2;
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          this.isBoxInRoom(121, 21, 23, -88, -121, true);
          return 0;
        }
        return 0;
    }

    private final Trap[] findTrapsInRect(int param0, int param1, int param2, int param3, int param4) {
        int var8_int = 0;
        ObjectList var6;
        Collidable[] var7;
        int var10;
        Trap[] var8;
        Trap var9;
        var10 = TombRacer.field_G ? 1 : 0;
        if (param2 <= 27) {
          return (Trap[]) null;
        }
        var6 = new ObjectList();
        var7 = this.collisionGrid.b(param1, -1, param4, param0, param3);
        for (var8_int = 0; var7.length > var8_int; var8_int++) {
          if (var7[var8_int] instanceof Trap) {
            var9 = (Trap) (var7[var8_int]);
            if (var9.intersectsRect((byte) 110, param1, param4, param3, param0)) {
              var6.add((byte) -37, var9);
            }
          }
        }
        var8 = new Trap[var6.size(-1)];
        var6.copyInto(var8, false);
        return var8;
    }

    final Trap[] getAllTraps(int param0) {
        if (param0 != 16) {
          return (Trap[]) null;
        }
        return this.findTrapsInRect(this.width, this.height / 2, 59, this.height, this.width / 2);
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_j = null;
        field_R = null;
        field_k = null;
        if (param0 != -128) {
          Room.l(-58);
        }
        field_p = (ToolkitSprite[][]) null;
    }

    final boolean isTileBoxOccupied(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6) {
        int var8 = -28 % ((param6 - 20) / 33);
        return this.tileGrid.isBoxOccupied(param3, param2, param4, 8597, param0, param1, param5);
    }

    final void queueSound(int param0, int param1, int param2, int param3, byte param4) {
        if (this.soundQueue == null) {
          return;
        }
        if (param4 != 6) {
          this.tileGrid = (TileGrid) null;
        }
        this.soundQueue.enqueue(param4 ^ -112, new SoundEvent(param2, param1, param0, param3));
    }

    final int o(int param0) {
        if (param0 != 8) {
          this.findComponent(true, 88, 35);
        }
        return this.field_C;
    }

    final void setCourseIndex(int param0, boolean param1) {
        if (param1) {
          this.spawnDust(false, -109, -42, 112, -101, -128);
        }
        this.courseIndex = param0;
    }

    final boolean isMirrored(byte param0) {
        if (param0 != -77) {
          this.clearEffectSlot(-56, 76);
        }
        return this.mirrored;
    }

    final void dispose(int param0) {
        this.reset(false, (byte) 123);
        this.tileGrid = null;
        if (param0 <= 43) {
          this.isTileBoxOccupied(-72, -34, 70, 80, true, 64, (byte) -83);
        }
        this.puddlePool = null;
        this.particlePool = null;
        this.particleEffects = null;
        this.projectilePool = null;
        this.collisionGrid = null;
    }

    final int getActiveVariant(int param0) {
        if (param0 != 6029) {
          return -14;
        }
        return null == this.field_U ? -1 : this.field_U.a(false);
    }

    final void setTick(byte param0, int param1) {
        if (param0 <= 14) {
          this.mainSupporter = (Collidable) null;
        }
        this.tick = param1;
    }

    final boolean hasActiveVariant(byte param0) {
        if (param0 != -82) {
          return true;
        }
        return this.field_U != null ? true : false;
    }

    final void addTileOccupancy(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 118) {
          Corpse var9 = (Corpse) null;
          this.recordDeath(-24, (Corpse) null);
        }
        this.tileGrid.addOccupancy(param1, param5, param4, param2, param0, param3, true);
    }

    private final void loadFromData(int param0) {
        int var7 = 0;
        RenderScene var2;
        BitPacketBuffer var3;
        int var4;
        int var5;
        int var6;
        Trap var7_ref_fsa;
        RoomComponent var8;
        int var9;
        Trap var10;
        RoomComponent var11;
        Obstacle var12;
        BitPacketBuffer var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        this.reset(true, (byte) 123);
        if (null == this.data) {
          return;
        }
        var2 = this.scene;
        this.scene = null;
        this.trapIdAllocator.reset((byte) -69);
        VariantMask.b((byte) 55);
        var3 = this.data;
        var3.position = 0;
        var3.beginBitAccess((byte) -64);
        this.formatVersion = var3.readBits((byte) 44, 8);
        this.header = new RoomHeader(this.formatVersion, var3);
        if (19 >= this.formatVersion) {
          this.width = var3.readBits((byte) 44, 12) << 16;
          this.height = var3.readBits((byte) 44, 12) << 16;
        } else {
          if (20 != this.formatVersion) {
            this.width = 2097152 * var3.readBits((byte) 44, 6);
            this.height = var3.readBits((byte) 44, 6) * 2097152;
          } else {
            this.width = 2097152 * var3.readBits((byte) 44, 8);
            this.height = var3.readBits((byte) 44, 8) * 2097152;
          }
        }
        this.tileGrid.resizeToRoom(2097152, this, 4);
        if (11 > this.formatVersion) {
          this.resetEntrance(109);
        } else {
          this.entranceX = var3.readBits((byte) 44, 12) << 16;
          this.entranceY = var3.readBits((byte) 44, 12) << 16;
        }
        var4 = var3.readBits((byte) 44, param0);
        for (var5 = 0; var4 > var5; var5++) {
          var12 = new Obstacle(this, var3);
          this.addObstacle(var12, true);
        }
        var5Lifetime1 = var3.readBits((byte) 44, 8);
        for (var6 = 0; var6 < var5Lifetime1; var6++) {
          var7_ref_fsa = new Trap(this, var3, false);
          this.addTrap(var7_ref_fsa, (byte) 32);
          var7_ref_fsa.saveTickStartPositions((byte) 118);
        }
        this.tileGrid.a((byte) 25, var3, this);
        if (this.formatVersion >= 11) {
          var6Lifetime1 = var3.readBits((byte) 44, 8);
          for (var7 = 0; var6Lifetime1 > var7; var7++) {
            var8 = vha.field_c.readComponent(var3, 55, this);
            if (var8 != null) {
              this.addComponent(var8, 33554432);
            }
          }
        }
        if (this.formatVersion == 12) {
          for (var6Lifetime2 = 0; 3 > var6Lifetime2; var6Lifetime2++) {
            var3.readBits((byte) 44, 10);
          }
        } else {
          if (this.formatVersion >= 13 &&
            26 > this.formatVersion) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 3; var6Lifetime2++) {
              var3.readBits((byte) 44, 8);
            }
          }
        }
        if (16 <= this.formatVersion) {
          this.field_A = var3.readBits((byte) 44, 2);
        }
        if (this.formatVersion >= 19) {
          this.lightingPreset = var3.readBits((byte) 44, 3);
        }
        var3.endBitAccess((byte) 98);
        this.assignSwitchableIds(param0 ^ 1);
        var10 = (Trap) (this.traps.first(-80));
        while (var10 != null) {
          var10.resolveSwitchLinks(true);
          var10.initializeAfterLoad(0);
          var10 = (Trap) (this.traps.next(115));
        }
        var11 = (RoomComponent) (this.components.first(-80));
        while (var11 != null) {
          var11.resolveAllTargetIds(true);
          var11 = (RoomComponent) (this.components.next(124));
        }
        var3.position = 0;
        if (this.formatVersion != 26) {
          if (this.formatVersion <= 19) {
            this.expandBorder(1, param0 - 28);
          }
          this.formatVersion = 26;
          var13 = new BitPacketBuffer(30000);
          this.encode(var13, -28426);
          this.data = var13;
          var13.position = 0;
        }
        if (var2 != null) {
          this.scene = var2;
        }
        if (this.mirrored) {
          this.mirrorRoom(param0 ^ 15, false);
        }
        return;
    }

    final boolean castBeamSegment(int param0, WorldBody param1, int param2, BeamSegment param3, WorldBody param4, Effect param5) {
        int discarded$3 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3.nextSegment = null;
          var7_int = 0;
          if (this.traceBeamSegment(param0, param3, param4, (byte) -127)) {
            var7_int = 1;
          }
          discarded$3 = this.applyBeamEffectToAll(true, param3, param5);
          if (param2 >= -38) {
            this.isTileBoxOccupied(99, -62, -70, -43, true, -109, (byte) -77);
          }
          stackIn_5_0 = var7_int;
          return stackIn_5_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("la.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean isBoxBlocked(Collidable param0, int param1, int param2, int param3, int param4, int param5, boolean param6, WorldBody param7, int param8) {
        int var11 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Collidable[] var10 = null;
        RuntimeException var10_ref = null;
        Collidable var12 = null;
        int var13 = 0;
        Collidable[] var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 == 0) {
            return false;
          }
          var14 = this.collisionGrid.b(param4, -1, param5, param8, param1);
          var10 = var14;
          if (param2 != 2) {
            Room.releaseStatics(-15);
          }
          for (var11 = 0; var14.length > var11; var11++) {
            boolean decompiledFrameRemainder0 = true;
            var12 = var14[var11];
            if (param0 != var12 &&
              var12.overlapsBox(param1, param7, 85, param8, param4, param0, param5, param3)) {
              if ((param7 != null &&
                param6) &&
                (decompiledFrameRemainder0 = !(var12.overlapsBox(param7.getHeight((byte) 55), param7, 107, param7.getWidth(-48), param7.getPreviousY(-21185), param0, param7.getPreviousX(103), param3)))) {
                return true;
              }
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_22_0 = var10_ref;
          stackIn_22_1 = new StringBuilder().append("la.BB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void addObstacle(Obstacle param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.obstacles.addLast((byte) -74, param0);
          this.collisionGrid.insert(param0, 7073);
          if (null != this.scene) {
            param0.addToScene((byte) 85, this.scene);
          }
          this.addTileOccupancy(0, -1, param0.getX(3), param0.getY(9648), param0.getWidth(-69), param0.getHeight((byte) 55), 126);
          if (!param1) {
            this.queueSound(30, 106, -59, -125, (byte) -34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.TC(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getLightingPreset(byte param0) {
        int var2 = 82 % ((81 - param0) / 35);
        return this.lightingPreset;
    }

    final void copyCorpsesFrom(Room param0, byte param1) {
        if (param1 <= 108) {
          return;
        }
        try {
          this.corpses.copyFrom(23436, param0.recentDeaths);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void addComponent(RoomComponent param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.components.addLast((byte) -88, param0);
          if (null != this.scene) {
            param0.a(param1 - 33556136, this.scene);
          }
          if (param1 != 33554432) {
            this.n((byte) -3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("la.OA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getId(byte param0) {
        if (param0 != -82) {
          return -41;
        }
        return this.id;
    }

    final void reenterAtEntrance(int param0) {
        int var2 = 112 / ((93 - param0) / 32);
        this.enterAtEntrance((byte) -125, false);
    }

    final int updateSupport(int param0, WorldBody param1) {
        int var11 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Collidable[] var7 = null;
        int var8 = 0;
        Collidable var9 = null;
        Collidable[] var10 = null;
        Collidable var12 = null;
        int var13 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 0) {
            this.getRenderZ((byte) 46);
          }
          var3_int = param1.getX(param0 ^ 3);
          var4 = param1.getY(9648);
          var5 = param1.getWidth(param0 ^ -38);
          var6 = param1.getHeight((byte) 55);
          var7 = this.collisionGrid.b(var4, param0 - 1, var3_int, var5, var6);
          var8 = this.classifySupport(var4, 32238, param1, var3_int, var7, var5, var6);
          var9 = this.mainSupporter;
          if (var8 != 0) {
            var10 = var7;
            for (var11 = 0; var11 < var10.length; var11++) {
              var12 = var10[var11];
              if (var12 instanceof Trap) {
                ((Trap) (var12)).notifySupport(26689, param1, var9, var8);
              }
            }
          }
          stackIn_11_0 = var8;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("la.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void renderScene(boolean param0) {
        if (null == this.scene) {
          return;
        }
        if (param0) {
          this.entranceX = 15;
        }
        this.scene.getRenderTarget(0);
        this.scene.b(1909106792);
        this.scene.render(30057);
    }

    final boolean hasEffect(int param0, byte param1) {
        if (param1 != -44) {
          Trap var4 = (Trap) null;
          this.removeTrap((Trap) null, 48);
        }
        return this.effectSlots[param0] != -1 ? true : false;
    }

    final boolean isPlayerNearTop(byte param0) {
        Player var2;
        int var3;
        boolean stackIn_4_0 = false;
        var3 = 23 / ((param0 - 24) / 33);
        var2 = this.getPlayer(-86);
        stackIn_4_0 = (this == var2.getRoom((byte) 64)) && (var2.getY(9648) <= 12582912);
        return stackIn_4_0;
    }

    final int applyAreaEffect(int param0, int param1, Effect param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        Collidable[] var8 = null;
        int var9 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          var8 = this.collisionGrid.b(param1, -1, param5, param4, param3);
          var9 = 96 / ((82 - param0) / 41);
          for (var10 = 0; var10 < var8.length; var10++) {
            var7_int = var7_int + var8[var10].applyAreaEffect(param2, param4, param5, 0, param1, param3);
          }
          stackIn_8_0 = var7_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("la.QC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final PlayerSimulation getSimulation(int param0) {
        if (param0 != -1553494544) {
          field_k = (kia) null;
        }
        return this.simulation;
    }

    final void tick(int param0, int param1) {
        Obstacle var4;
        Trap var5_ref_fsa;
        int var5;
        int var6;
        Trap var7;
        Player var8;
        IntrusiveDequeCursor var9;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = this.getPlayer(-62);
        if (var8 == null) {
          return;
        }
        var8.tick(5, param0);
        if (this != var8.getRoom((byte) -83)) {
          return;
        }
        if (!this.getSimulation(param1 - 1553494544).isActive(-19271)) {
          return;
        }
        this.stateHash = 6029;
        this.stateHash = var8.hashState(this.stateHash, -40);
        var4 = (Obstacle) (this.obstacles.first(param1 - 80));
        while (var4 != null) {
          var4.tickModels(param1 ^ 0);
          var4 = (Obstacle) (this.obstacles.next(120));
        }
        var9 = new IntrusiveDequeCursor(this.traps);
        var5_ref_fsa = (Trap) (var9.first(true));
        while (var5_ref_fsa != null) {
          var5_ref_fsa.tick(param1 + 106, false);
          this.stateHash = var5_ref_fsa.hashState(this.stateHash, -109);
          if (var5_ref_fsa.isExpired(param1 + 18407)) {
            var5_ref_fsa.unlink(param1 ^ 79);
          }
          var5_ref_fsa = (Trap) (var9.next(-1));
        }
        this.effectTraps.update(true);
        var5 = this.getSimulation(-1553494544).isTimeFrozen(param1 + 112) ? 1 : 0;
        if (param1 != 0) {
          var7 = (Trap) null;
          this.removeTrap((Trap) null, -31);
        }
        this.projectilePool.update(var5 != 0, (byte) -126);
        this.puddlePool.update(var5 != 0, (byte) -31);
        this.particlePool.update(var5 != 0, (byte) -103);
        this.stateHash = this.projectilePool.hashState(this.stateHash, -119);
        if (this.scene != null) {
          this.scene.updateAnimations(0);
          if (this.simulation.isEffectActive(8, param1 + 10915)) {
            this.scene.getRenderTarget(0).a(uca.cosmeticRandom.nextBounded(9, 0) - 4, 0, -4 + uca.cosmeticRandom.nextBounded(9, 0), 26768);
          }
        }
        if (null != this.soundQueue) {
          this.soundQueue.a(param1 + 82, false);
        }
        this.tick = this.tick + 1;
        this.ticksSinceReset = this.ticksSinceReset + 1;
        return;
    }

    public final String toString() {
        return "Room(courseIndex:" + this.courseIndex + ",id:" + this.id + ",diff:" + 1 + ")";
    }

    final int n(byte param0) {
        if (param0 > -36) {
          return 42;
        }
        return this.field_e;
    }

    final Player getPlayer(int param0) {
        if (param0 >= 0) {
          this.field_A = -11;
        }
        return this.getSimulation(-1553494544).player;
    }

    final int getWidth(byte param0) {
        if (param0 != -86) {
          this.isTileBoxOccupied(-23, -87, 7, -112, true, -64, (byte) -10);
        }
        return this.width;
    }

    final void setEffectSlot(boolean param0, int param1, int param2) {
        this.effectSlots[param2] = param1;
        if (param0) {
          this.effectTraps = (RoomEffectTraps) null;
        }
    }

    private final void expandBorder(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = param0 * 2097152;
        if (var3 == 0) {
          return;
        }
        this.entranceX = this.entranceX + var3;
        this.height = this.height + var3 * 2;
        this.width = this.width + 2 * var3;
        this.entranceY = this.entranceY + var3;
        this.tileGrid.expand(2097152, 2, var3);
        if (param1 != -20) {
          this.effectSlots = (int[]) null;
        }
        Trap var6 = (Trap) (this.traps.first(-80));
        while (var6 != null) {
          var6.shiftLocalPosition(var3, 81);
          var6 = (Trap) (this.traps.next(115));
        }
        RoomComponent var7 = (RoomComponent) (this.components.first(param1 ^ 92));
        while (var7 != null) {
          var7.a(var3, true);
          var7 = (RoomComponent) (this.components.next(param1 ^ -104));
        }
        Obstacle var8 = (Obstacle) (this.obstacles.first(-80));
        while (var8 != null) {
          var8.a(param1 - 105, var3);
          var8 = (Obstacle) (this.obstacles.next(108));
        }
    }

    final void spawnRunDust(int param0, int param1, byte param2, int param3, int param4, int param5) {
        TileGridCell var7 = this.tileGrid.getCellAt(param0, param3, (byte) 119);
        if (var7 == null) {
          return;
        }
        if (param2 < 104) {
          field_p = (ToolkitSprite[][]) null;
        }
        if (var7.b(0) ||
          uca.cosmeticRandom.nextBounded(5, 0) == 0) {
          this.particleEffects.b(param0, param3, param5, param1, 0, param4);
        }
    }

    final int mirrorX(int param0, byte param1) {
        if (param1 != 71) {
          return 111;
        }
        return -param0 - (-(this.width / 2) - this.width / 2);
    }

    final static void l(int param0) {
        if (vo.field_b) {
          ComponentTargetList.b(120);
        }
        if (param0 != 2097152) {
          Room.l(104);
        }
    }

    final int sumSurfaceCoverage(int param0, int param1, int param2, int param3, int param4, int param5, WorldBody param6) {
        int var10 = 0;
        Collidable[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        Collidable var11 = null;
        int var12 = 0;
        Collidable[] var13 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var13 = this.collisionGrid.b(param0, -1, param5, param1, param4);
          var8 = var13;
          var9 = 0;
          for (var10 = param2; var13.length > var10; var10++) {
            var11 = var13[var10];
            if (param6 != var11) {
              var9 = var9 + var11.getSurfaceCoverage(true, param1, param0, param5, param3, param4);
            }
          }
          stackIn_8_0 = var9;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_11_0 = var8_ref;
          stackIn_11_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int getTick(byte param0) {
        if (param0 < 14) {
          return -10;
        }
        return this.tick;
    }

    private final void encode(BitPacketBuffer param0, int param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Obstacle var5 = null;
        Trap var6 = null;
        RoomComponent var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.assignSwitchableIds(9);
          param0.beginBitWrite(8);
          param0.writeBits((byte) -127, 26, 8);
          this.header.encode(param0, 23);
          if (param1 != -28426) {
            this.hasActiveVariant((byte) 71);
          }
          param0.writeBits((byte) 59, this.width / 2097152, 6);
          param0.writeBits((byte) -125, this.height / 2097152, 6);
          param0.writeBits((byte) -126, this.entranceX >> 16, 12);
          param0.writeBits((byte) -128, this.entranceY >> 16, 12);
          param0.writeBits((byte) -125, this.obstacles.size((byte) -16), 8);
          var5 = (Obstacle) (this.obstacles.first(-80));
          while (var5 != null) {
            var5.encode(true, param0);
            var5 = (Obstacle) (this.obstacles.next(113));
          }
          param0.writeBits((byte) 119, this.traps.size((byte) -16), 8);
          var6 = (Trap) (this.traps.first(-80));
          while (var6 != null) {
            if (!var6.isIndependent((byte) -117)) {
              var6.encode(param0, -100);
            }
            var6 = (Trap) (this.traps.next(114));
          }
          this.tileGrid.a(8, param0);
          param0.writeBits((byte) 120, this.components.size((byte) -16), 8);
          var7 = (RoomComponent) (this.components.first(-80));
          while (var7 != null) {
            vha.field_c.writeComponent(var7, -16097, param0);
            var7 = (RoomComponent) (this.components.next(107));
          }
          param0.writeBits((byte) 102, this.field_A, 2);
          param0.writeBits((byte) 127, this.lightingPreset, 3);
          param0.endBitWrite(-1826190686);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("la.PC(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return false;
    }

    final void spawnDust(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        TileGridCell var7 = this.tileGrid.getCellAt(param4, param1, (byte) 119);
        if (var7 == null) {
          return;
        }
        if (var7.b(0) &&
          0 == uca.cosmeticRandom.nextBounded(5, 0)) {
          this.particleEffects.b(param4, param1, param3, param2, 0, param5);
        }
        if (param0) {
          this.spawnParticle(55, 54, (byte) -12, -30);
        }
    }

    final SwitchableIdAllocator getComponentIdAllocator(int param0) {
        if (param0 != -31957) {
          this.setEffectSlot(true, -14, -108);
        }
        return this.componentIdAllocator;
    }

    final SwitchableIdAllocator getTrapIdAllocator(int param0) {
        int var2 = 49 % ((param0 - 42) / 59);
        return this.trapIdAllocator;
    }

    final int applyProjectileEffect(Projectile param0, int param1, Effect param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        Collidable[] var5 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -16164) {
            this.formatVersion = 42;
          }
          if (param2 == null) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var4_int = 0;
          var5 = this.collisionGrid.a((byte) -26, param0);
          for (var6 = 0; var6 < var5.length; var6++) {
            var4_int = var4_int + var5[var6].applyProjectileEffect(param2, param0, -117);
          }
          stackIn_10_0 = var4_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("la.J(");
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
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int resolveMove(Collidable param0, WorldBody param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        Collidable stackIn_59_0 = null;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        Collidable[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var16Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          if (param8 == 0) {
            stackIn_6_0 = (!this.isBoxBlocked(param0, param6, 2, param2, param10, param7, param12, param1, param3)) ? 0 : 2;
            return stackIn_6_0;
          }
          if (param2 == 0) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          var14_int = 0;
          var15 = 0;
          var17 = this.collisionGrid.b(param10, -1, param7, param3, param6);
          if (param5 != 12) {
            stackIn_13_0 = -128;
            return stackIn_13_0;
          }
          var18 = 0;
          scanLoop1: while (true) {
            if (var18 < var17.length) {
              var16 = 0;
              if (var17[var18].overlapsBox(param6, param1, 97, param3, param10, param0, param7, param2)) {
                var14_int = 1;
                if (param1 == null ||
                  !param12 ||
                  !var17[var18].overlapsBox(param1.getHeight((byte) 55), param1, 81, param1.getWidth(-48), param1.getPreviousY(-21185), param0, param1.getPreviousX(param5 + 115), param2)) {
                  var16 = 1;
                  if (!var17[var18].isPushable((byte) -55, false)) {
                    var15 = 1;
                    break scanLoop1;
                  }
                }
              }
              if (var16 == 0) {
                var17[var18] = null;
              }
              var18++;
              continue;
            }
            break;
          }
          if (var15 != 0) {
            stackIn_32_0 = 2;
            return stackIn_32_0;
          }
          for (var18Lifetime1 = 0; var18Lifetime1 < var17.length; var18Lifetime1++) {
            if (var17[var18Lifetime1] != null) {
              var17[var18Lifetime1].tryPush(77, false, param8, param4, param9, param11);
              var16Lifetime1 = 1;
              if (!var17[var18Lifetime1].overlapsBox(param6, param1, param5 ^ 64, param3, param10, param0, param7, param2)) {
                var16Lifetime1 = 0;
              } else {
                if (var15 == 0) {
                  if (2 == param8) {
                    stackIn_45_0 = (var17[var18Lifetime1].canBeCrushedBy(param1, 0)) ? 0 : 1;
                    var15 = stackIn_45_0;
                  } else {
                    var15 = 1;
                  }
                }
              }
              if (var16Lifetime1 == 0) {
                var17[var18Lifetime1] = null;
              }
            }
          }
          if (var15 != 0) {
            stackIn_53_0 = 2;
            return stackIn_53_0;
          }
          if (param8 == 2) {
            for (var18Lifetime2 = 0; var17.length > var18Lifetime2; var18Lifetime2++) {
              stackIn_59_0 = var17[var18Lifetime2];
              if (stackIn_59_0 != null) {
                var17[var18Lifetime2].crush(-117, param1);
              }
            }
          }
          if (var14_int != 0) {
            stackIn_66_0 = 1;
            return stackIn_66_0;
          }
          stackIn_64_0 = 0;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_69_0 = var14;
          stackIn_69_1 = new StringBuilder().append("la.UB(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final void recordDeath(int param0, Corpse param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.recentDeaths.addLast((byte) -54, param1);
          while (this.recentDeaths.size((byte) -16) > 10) {
            this.recentDeaths.removeFirst(-99);
          }
          if (param0 != 8) {
            this.effectSlots = (int[]) null;
          }
          this.deathCount = this.deathCount + 1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "la.VB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = 81 / ((-23 - param0) / 53);
        return this.width / 2;
    }

    final int getCourseIndex(int param0) {
        int var2 = -6 % ((param0 - 1) / 54);
        return this.courseIndex;
    }

    final RoomComponent findComponent(boolean param0, int param1, int param2) {
        IntrusiveDequeCursor var4;
        RoomComponent var5;
        RoomComponent var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 != 6) {
          this.mainSupporter = (Collidable) null;
        }
        var4 = new IntrusiveDequeCursor(this.components);
        var5 = (RoomComponent) (var4.first(true));
        while (var5 != null) {
          var6 = var5.a(param1, false, false);
          if (var6 != null) {
            return var6;
          }
          var5 = (RoomComponent) (var4.next(-1));
        }
        return null;
    }

    Room(PlayerSimulation param0, int param1, BitPacketBuffer param2, int param3, boolean param4) {
        int var6_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.formatVersion = 26;
        this.obstacles = new IntrusiveDeque();
        this.traps = new IntrusiveDeque();
        this.components = new IntrusiveDeque();
        this.recentDeaths = new IntrusiveDeque();
        this.corpses = new CorpseList();
        this.trapIdAllocator = new SwitchableIdAllocator();
        this.componentIdAllocator = new SwitchableIdAllocator();
        this.effectSlots = new int[9];
        this.header = new RoomHeader();
        this.field_A = 0;
        this.lightingPreset = 0;
        try {
          for (var6_int = 0; this.effectSlots.length > var6_int; var6_int++) {
            this.effectSlots[var6_int] = -1;
          }
          this.simulation = param0;
          this.width = 33554432;
          this.data = param2;
          this.height = 33554432;
          this.id = param1;
          this.randomSeed = param3;
          stackIn_7_1 = (param4);
          this.mirrored = stackIn_7_1;
          this.effectTraps = new RoomEffectTraps(this);
          this.reset(false, (byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("la.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
