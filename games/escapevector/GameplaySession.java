/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class GameplaySession {
    DynamicTerrainRenderer dynamicTerrain;
    private int levelStartTicks;
    int[][] terrainMasks;
    static String field_cc;
    private int currentMusicVolume;
    int tilesWide;
    private int transitionTicks;
    private int destroyedInfrastructureCount;
    Vector levelObjects;
    int worldHeight;
    private int[][] initialTerrainMasks;
    private int initialInfrastructureCount;
    private SecondaryIntrusiveDeque pendingTargetEffects;
    boolean scoringEnabled;
    boolean timeHackMode;
    boolean easyMode;
    int tilesHigh;
    static int[] field_xb;
    IntrusiveDeque missionTargets;
    private int firstLevelIndex;
    int objectiveType;
    private int secondaryTheme;
    private int initialTilesHigh;
    private int terrainTheme;
    private byte[][] levelData;
    private TrackerMusicDefinition currentMusic;
    int levelIndex;
    int gameMode;
    int worldWidth;
    private IntrusiveDeque pointCloudEffects;
    private SelfDestructEffects selfDestructEffects;
    private PointCloudEffect exhaustParticles;
    int spawnXQ16;
    private int shipAngle256;
    private int field_Kb;
    int shipXQ16;
    private int activeExhaustParticles;
    private boolean triShotEnabled;
    private int thrustAccelerationQ16;
    private int tetheredVelocityXQ16;
    private boolean field_W;
    private int bulletCapacity;
    private int tutorialBackgroundPhase;
    private int fuel;
    private int tetheredYQ16;
    private int shipVelocityXQ16;
    private int activeBulletCount;
    private int tetheredVelocityYQ16;
    private int spawnYQ16;
    private int pickupAnimationTicks;
    private boolean shieldActive;
    private int shieldEnergy;
    private int tetheredXQ16;
    private IntrusiveNode lastActiveBullet;
    private int initialFuel;
    private int rockBusterAmmo;
    private int exhaustWriteIndex;
    int shipYQ16;
    int tetheredObjectType;
    private int shipVelocityYQ16;
    private int initialShieldEnergy;
    private IntrusiveDeque bullets;
    int field_M;
    private int gravityQ16;
    boolean cargoLost;
    private IntrusiveDeque seekerMines;
    private int previousLevelDestructionCount;
    boolean quitRequested;
    private int levelScore;
    int shieldPulsePhase;
    private int shotCooldownTicks;
    private int collisionNormalX;
    boolean shipDestroyed;
    int score;
    private boolean fatalHullContact;
    private int rockBusterCooldownTicks;
    private int livesRemaining;
    private IntrusiveDeque hudMessageQueue;
    boolean levelEnded;
    private boolean leftLandingContact;
    int elapsedTicks;
    private boolean shipLanded;
    private int collisionNormalY;
    private int previousLevelPowerupCount;
    boolean advanceLevelRequested;
    private IntrusiveDeque rockBusters;
    private int collectedPowerupCount;
    private boolean rightLandingContact;
    private int destructionAchievementCount;
    private int displayedAchievementCount;
    private int[] displayedAchievementIds;
    private Sprite noticeSprite;
    boolean countdownActive;
    private String hudMessageText;
    int countdownTicks;
    private int tutorialStep;
    private int activeSessionTicks;
    private int noticeTicks;
    private boolean shieldUsedThisLevel;
    private int[] pendingAchievementIds;
    private int countdownTrigger;
    private int displayedTutorialStep;
    private int pendingAchievementCount;
    private int hudMessageTicks;
    private int levelTitleTicks;
    Minimap minimap;
    private IntrusiveDeque initialPowerups;
    private boolean showingAchievementNotice;
    private PcmSampleStream field_f;
    private PcmSampleStream field_wb;
    private TetherHumStream field_fb;
    private PcmSampleStream field_v;
    private PcmSampleStream field_Eb;
    private PcmSampleStream field_Wb;
    private PcmSampleStream field_r;
    private IntrusiveDeque laserGateSpans;
    PcmSampleStream field_lc;
    private PcmSampleStream field_Z;
    private int laserGateCount;
    private PcmSampleStream field_jb;
    private PcmSampleStream field_R;
    private int laserCycleTicks;
    private boolean laserGateDestroyed;

    private final void drawTerrainBaseColumn(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var12 = EscapeVector.obfuscationControl;
        int var9 = (param5 << 5) - param1;
        if (param3 != 1395798865) {
          GameplaySession.openSessionScreen(true, -95);
        }
        int var10 = -param4 + (param2 << 5);
        if (var9 > 0) {
          var10 = this.drawTerrainBaseTile(param0, param2, -var9 + 32, -1 + param5, param7, var10, 32, 1299998021);
        }
        for (int var11 = param5; var11 < param6; var11++) {
          var10 = this.drawTerrainBaseTile(param0, param2, 0, var11, param7, var10, 32, 1299998021);
        }
        int var11Lifetime1 = 31 & -var9 + 480;
        if (var11Lifetime1 > 0) {
          int discarded$0 = this.drawTerrainBaseTile(param0, param2, 0, param6, param7, var10, var11Lifetime1, 1299998021);
        }
    }

    private final void scanShipHullTile(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        IntrusiveNode var21_ref_hg = null;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0Lifetime1;
        int stackIn_11_1Lifetime1;
        Object var27 = null;
        Object var29 = null;
        int var24 = EscapeVector.obfuscationControl;
        int[] var30 = this.terrainTile(param14, -1, param8);
        int[] var28 = var30;
        int[] var26 = var28;
        int[] var16 = var26;
        if (param1 < 78) {
          RockBuster var25 = (RockBuster) null;
          this.detonateRockBuster((RockBuster) null, -78);
        }
        if (var26 == null &&
          Bullet.collisionLaserCount == 0) {
          return;
        }
        param8 = param8 << 16;
        param14 = param14 << 16;
        int var17 = param11;
        while (true) {
          int stackIn_8_0 = param9;
          int stackIn_8_1 = var17;
          if (stackIn_8_0 < stackIn_8_1) {
            return;
          }
          int var18 = param7;
          while (true) {
            int stackIn_11_0 = ~var18;
            int stackIn_11_1 = ~param2;
            if (stackIn_11_0 < stackIn_11_1) {
              var17++;
              break;
            }
            int var19 = (var18 << 11) + param8;
            int var20 = param14 + (var17 << 11);
            int stackIn_8_0Lifetime1 = (param13 - param12) * (var20 - param3);
            int stackIn_8_1Lifetime1 = (-param12 + var19) * (-param3 + param4);
            if (stackIn_8_0Lifetime1 <= stackIn_8_1Lifetime1) {
              if (((param13 - param10) * (var20 - param6)) > ((param4 - param6) * (-param10 + var19)) &&
                (-param10 + param12) * (var20 - param6) < (param3 - param6) * (-param10 + var19)) {
                var21_ref_hg = IntrusiveDeque.field_f.first(false);
                for (var22 = 0; Bullet.collisionLaserCount > var22; var22++) {
                  LaserGateSpan var29_ref = (LaserGateSpan) (var21_ref_hg);
                  stackIn_11_0Lifetime1 = ~var20;
                  stackIn_11_1Lifetime1 = ~var29_ref.y;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    var29_ref.leftX <= var19 &&
                    var29_ref.rightX > var19) {
                    this.fatalHullContact = true;
                    return;
                  }
                  var21_ref_hg = var21_ref_hg.next;
                }
                if (!this.shipLanded &&
                  var26 != null &&
                  this.maskPixelIsSolid(var30, var18, (byte) -74, var17)) {
                  if ((255 & 24 + this.shipAngle256) > 48) {
                    this.fatalHullContact = true;
                    return;
                  }
                  if (65536 < (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8) + (this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8)) {
                    this.fatalHullContact = true;
                    return;
                  }
                  var21 = -param10 + var19;
                  var22 = -param6 + var20;
                  if (var22 * var22 + var21 * var21 >= 150994944) {
                    this.fatalHullContact = true;
                    return;
                  }
                  this.rightLandingContact = true;
                }
              }
            } else if (((var19 - param0) * (-param5 + param4)) > ((-param5 + var20) * (-param0 + param13)) &&
              ((-param5 + param3) * (-param0 + var19)) < ((-param0 + param12) * (var20 - param5))) {
              var21_ref_hg = IntrusiveDeque.field_f.first(false);
              for (var22 = 0; Bullet.collisionLaserCount > var22; var22++) {
                LaserGateSpan var27_ref = (LaserGateSpan) (var21_ref_hg);
                stackIn_11_0Lifetime1 = ~var20;
                stackIn_11_1Lifetime1 = ~var27_ref.y;
                if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                  var19 >= var27_ref.leftX &&
                  var27_ref.rightX > var19) {
                  this.fatalHullContact = true;
                  return;
                }
                var21_ref_hg = var21_ref_hg.next;
              }
              if (!this.shipLanded &&
                var26 != null &&
                this.maskPixelIsSolid(var30, var18, (byte) -74, var17)) {
                if ((255 & this.shipAngle256 + 24) > 48) {
                  this.fatalHullContact = true;
                  return;
                }
                if ((this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8) + (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8) > 65536) {
                  this.fatalHullContact = true;
                  return;
                }
                var21 = var19 - param0;
                var22 = -param5 + var20;
                if (var21 * var21 + var22 * var22 < 150994944) {
                  this.leftLandingContact = true;
                } else {
                  this.fatalHullContact = true;
                  return;
                }
              }
            }
            var18++;
          }
        }
    }

    private final void applyTriShotPickup(int objectType, byte guard) {
        if (10 != objectType) {
          return;
        }
        this.triShotEnabled = true;
        FullscreenFocusCanvas.a(0);
        this.showHudMessage(-128, DelegatingCanvas.field_a);
        if (guard != 59) {
          this.laserCycleTicks = -54;
        }
    }

    private final void scanShipHullTileRows(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        if ((param4 ^ param6) >> 5 == 0) {
          this.scanShipHullTile(param11, 94, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, param6 & 31, param1, param8, param6 >> 5);
        } else {
          this.scanShipHullTile(param11, 106, param9, param3, param0, param10, param13, param5, param12, 31, param2, 31 & param6, param1, param8, param6 >> 5);
          if (this.fatalHullContact) {
            return;
          }
          this.scanShipHullTile(param11, 104, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, 0, param1, param8, param4 >> 5);
        }
        int var15 = -29 / ((param7 - 71) / 38);
    }

    private final int greenComponent(int packed, int guard) {
        if (guard != 16082) {
          return -27;
        }
        return (packed & 65280) >> 8;
    }

    final void ensureTerrainRow(int tileY) {
        if (tileY >= this.tilesHigh) {
          int requiredTilesHigh = tileY + 1;
          int[][] expandedTerrain = new int[this.tilesWide * requiredTilesHigh][];
          for (int tileIndex = 0; tileIndex < this.tilesWide * this.tilesHigh; tileIndex++) {
            expandedTerrain[tileIndex] = this.terrainMasks[tileIndex];
          }
          int fillIndex = this.tilesWide * this.tilesHigh;
          int initialFillIndex = fillIndex;
          while (fillIndex < this.tilesWide * requiredTilesHigh) {
            expandedTerrain[fillIndex] = QuickChatPhraseDefinition.fullTileMask;
            fillIndex++;
          }
          this.tilesHigh = requiredTilesHigh;
          this.worldHeight = this.tilesHigh << 5;
          this.terrainMasks = expandedTerrain;
          return;
        }
    }

    private final void spawnBullet(int yQ16, int xQ16, int velocityYQ16, int guard, int kind, int velocityXQ16) {
        Bullet var7_ref;
        xQ16 = ((this.worldWidth << 16) + xQ16) % (this.worldWidth << 16);
        if (this.bulletCapacity != 0 &&
          ~this.bulletCapacity != ~this.activeBulletCount) {
          Object var7 = null;
          if (this.lastActiveBullet != null) {
            var7_ref = (Bullet) (this.lastActiveBullet.next);
          } else {
            var7_ref = (Bullet) (this.bullets.first(false));
          }
          var7_ref.reset(xQ16, false, velocityXQ16, velocityYQ16, (byte) -124, kind, yQ16, 250);
          this.activeBulletCount = this.activeBulletCount + 1;
          this.lastActiveBullet = (IntrusiveNode) ((Object) var7_ref);
        } else {
          IntrusiveNode var8 = (IntrusiveNode) ((Object) new Bullet(xQ16, yQ16, velocityXQ16, velocityYQ16, kind, 250));
          this.bullets.addLast(-12328, var8);
          this.bulletCapacity = this.bulletCapacity + 1;
          this.activeBulletCount = this.activeBulletCount + 1;
          this.lastActiveBullet = var8;
        }
        if (guard != 256) {
          this.ensureTerrainRow(-37);
        }
    }

    private final void loadTerrain(boolean headerOnly, int formatVersion, int guard, DataInputStream input) throws IOException {
        TerrainMap terrain = new TerrainMap(input, formatVersion);
        TextLayoutLine.b(1, terrain.terrainTheme);
        if (guard != 640) {
          this.saveLevelProgress(-13);
        }
        this.terrainTheme = terrain.terrainTheme;
        this.secondaryTheme = terrain.secondaryTheme;
        if (headerOnly) {
          return;
        }
        try {
          this.terrainMasks = terrain.tileMasks;
          this.worldWidth = terrain.pixelWidth;
          this.worldHeight = terrain.pixelHeight;
          this.tilesWide = terrain.tilesWide;
          this.tilesHigh = terrain.tilesHigh;
          this.snapshotTerrain((byte) 111);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.SF(" + headerOnly + ',' + formatVersion + ',' + guard + ',' + (input != null ? "{...}" : "null") + ')');
        }
    }

    private final void recordLevelCompletion(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        TrackerMusicDefinition.field_f.c(0, this.gameMode, this.levelIndex);
        this.checkCampaignAchievements(0);
        if (this.levelIndex == 15 &&
          this.firstLevelIndex <= 0) {
          if (90000 >= this.elapsedTicks) {
            this.awardAchievement(this.gameMode, false, 9, 246);
          }
          if (this.elapsedTicks <= 60000) {
            this.awardAchievement(this.gameMode, false, 10, 245);
          }
        }
        if (this.fuel > 2500) {
          this.awardAchievement(this.gameMode, false, 6, 249);
        }
        if (this.laserGateDestroyed) {
          this.awardAchievement(this.gameMode, false, 7, 248);
        }
        if (guard == this.levelIndex &&
          1700 == this.thrustAccelerationQ16) {
          this.awardAchievement(this.gameMode, false, 13, 242);
        }
        if (9 == this.levelIndex &&
          !this.shieldUsedThisLevel &&
          this.shotCooldownTicks < 0) {
          this.awardAchievement(this.gameMode, false, 14, 241);
        }
        if (this.levelIndex == 10) {
          int var2 = 0;
          int var3 = 0;
          while (true) {
            if (var3 < this.levelObjects.size()) {
              LevelObject var4 = (LevelObject) (this.levelObjects.elementAt(var3));
              int stackIn_28_0 = var4.objectType;
              int stackIn_28_1 = 2;
              if (stackIn_28_0 == stackIn_28_1) {
                var2++;
              }
              var3++;
              continue;
            }
            int stackIn_28_0Lifetime1 = 8;
            int stackIn_28_1Lifetime1 = var2;
            if (stackIn_28_0Lifetime1 > stackIn_28_1Lifetime1) {
              break;
            }
            this.awardAchievement(this.gameMode, false, 15, 240);
            break;
          }
        }
        if (this.levelIndex == 14 &&
          !this.shieldUsedThisLevel) {
          this.awardAchievement(this.gameMode, false, 16, 239);
        }
    }

    final int spatialVolume(int radiusQ16, int xQ16, int guard, int yQ16) {
        int var6 = EscapeVector.obfuscationControl;
        xQ16 = xQ16 - this.shipXQ16;
        yQ16 = yQ16 - this.shipYQ16;
        while (-this.worldWidth << 15 > xQ16) {
          xQ16 = xQ16 + (this.worldWidth << 16);
        }
        while (this.worldWidth << 15 < xQ16) {
          xQ16 = xQ16 - (this.worldWidth << 16);
        }
        int var5 = (int)Math.sqrt((double)yQ16 * (double)yQ16 + (double)xQ16 * (double)xQ16);
        if (var5 <= radiusQ16) {
          return IterableNodeHashTable.field_c * 6144 / 64;
        }
        if (guard != 96) {
          LaserGateSpan var7 = (LaserGateSpan) null;
          this.removeLaserGateSpan((LaserGateSpan) null, (byte) 83);
        }
        return IterableNodeHashTable.field_c * radiusQ16 / (var5 / 96);
    }

    private final String rockBusterPickupMessage(boolean guard, int count) {
        int var4 = EscapeVector.obfuscationControl;
        if (guard) {
          return (String) null;
        }
        String var3 = "";
        if (this.rockBusterAmmo == 0 &&
          count == 1) {
          var3 = ef.field_k;
        } else if (count == 1) {
          var3 = Minimap.field_p;
        } else if (this.rockBusterAmmo == 0 &&
          count == 5) {
          var3 = PcmResampler.field_b;
        } else if (5 == count) {
          var3 = FullscreenFocusCanvas.field_g;
        }
        return var3;
    }

    private final void resetSessionEffects(int guard, boolean option) {
        this.stopSessionAudio((byte) -41);
        this.pointCloudEffects.clear((byte) 118);
        this.selfDestructEffects = new SelfDestructEffects(this);
        this.exhaustParticles.f((byte) -125);
        if (guard != 24661) {
          PcmSample var4 = (PcmSample) null;
          this.spawnSpriteDebris(-10, -80, (Sprite) null, 116, (PcmSample) null);
        }
        ji.a(true);
        this.tutorialBackgroundPhase = 0;
        this.activeExhaustParticles = 0;
        this.hudMessageQueue = new IntrusiveDeque();
        this.activeSessionTicks = 0;
    }

    private final void updateHudMessage(int minimumTicks) {
        if (this.hudMessageTicks > minimumTicks) {
          this.hudMessageTicks = this.hudMessageTicks - 1;
          if (0 == this.hudMessageTicks) {
            this.hudMessageText = null;
          }
        }
        if (this.hudMessageText == null) {
          HudMessage var2 = this.pollHudMessage(-27521);
          if (var2 == null) {
            return;
          }
          this.hudMessageText = var2.text;
          this.hudMessageTicks = var2.durationTicks;
        }
    }

    private final void addLaserGateSpan(int rightX, int y, int leftX, int guard) {
        this.laserGateSpans.addFirst(new LaserGateSpan(leftX, rightX, y), 8364);
        if (guard != 2134602960) {
          this.levelTitleTicks = 65;
        }
        this.laserGateCount = this.laserGateCount + 1;
    }

    private final LevelObject readLevelObject(DataInputStream input, byte guard, int objectId, int formatVersion) throws IOException {
        LevelObject object = null;
        String stackIn_15_2 = null;
        try {
          int objectType = input.readUnsignedByte();
          if (formatVersion < 2 &&
            objectType >= 8) {
            objectType++;
          }
          int x = input.readUnsignedShort();
          int guardQuotient = -8 / ((guard + 7) / 47);
          int y = input.readUnsignedShort();
          if (formatVersion < 5) {
            object = new LevelObject(objectId, objectType, x, y);
          } else {
            object = this.readLevelObjectFlags(input, x, formatVersion, false, objectType, y, objectId);
          }
          if (objectType == 2 &&
            11 > formatVersion) {
          }
          LevelObject decodedObject = object;
          return decodedObject;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var5_ref;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.IF(");
          if (input == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(',').append(objectId).append(',').append(formatVersion).append(')').toString());
        }
    }

    private final void checkRetributionCampaignAchievement(int guard) {
        if (this.gameMode != 2) {
          return;
        }
        if (null == ua.field_c) {
          return;
        }
        if (!ua.field_c.c(115)) {
          return;
        }
        int var3 = 28;
        int var4 = var3 ^ 255;
        this.awardAchievement(this.gameMode, false, var3, var4);
        if (guard != -33) {
          this.bulletCapacity = -80;
        }
    }

    private final int classifyShipPixel(ShipHullGeometry geometry, byte guard, int pixelY, int pixelX) {
        String stackIn_20_2 = null;
        try {
          IntPoint var12 = geometry.cameraOrigin;
          IntPoint var6 = geometry.centerNotch;
          IntPoint var7 = geometry.nose;
          IntPoint var8 = geometry.rightWing;
          if (guard != 15) {
            this.rightLandingContact = false;
          }
          IntPoint var9 = geometry.leftWing;
          int var10 = var12.x + pixelX << 11;
          int var11 = pixelY + var12.y << 11;
          if (((var10 - var6.x) * (-var6.y + var7.y)) < ((-var6.x + var7.x) * (var11 - var6.y))) {
            if ((var7.y - var8.y) * (-var8.x + var10) > (-var8.y + var11) * (var7.x - var8.x) &&
              ((var6.y - var8.y) * (-var8.x + var10)) < ((-var8.y + var11) * (-var8.x + var6.x))) {
              int stackIn_6_0 = 1;
              return stackIn_6_0;
            }
            int stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if ((-var9.y + var7.y) * (-var9.x + var10) >= (var11 - var9.y) * (-var9.x + var7.x)) {
            return 0;
          }
          if ((var11 - var9.y) * (var6.x - var9.x) < (var6.y - var9.y) * (var10 - var9.x)) {
            int stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          int stackIn_16_0 = 0;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5;
          StringBuilder stackIn_19_1 = new StringBuilder().append("oe.RF(");
          if (geometry == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(pixelY).append(',').append(pixelX).append(')').toString());
        }
    }

    private final void snapshotTerrain(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        this.initialTilesHigh = this.tilesHigh;
        if (guard <= 110) {
          return;
        }
        this.initialTerrainMasks = new int[this.terrainMasks.length][];
        for (int var2 = 0; this.terrainMasks.length > var2; var2++) {
          if (this.terrainMasks[var2] != null &&
            this.terrainMasks[var2] != QuickChatPhraseDefinition.fullTileMask) {
            this.initialTerrainMasks[var2] = new int[32];
            for (int var3 = 0; var3 < 32; var3++) {
              this.initialTerrainMasks[var2][var3] = this.terrainMasks[var2][var3];
            }
          } else {
            this.initialTerrainMasks[var2] = this.terrainMasks[var2];
          }
        }
    }

    private final void drawGameOverOverlay(byte guard) {
        if (this.shipDestroyed &&
          this.livesRemaining == 0) {
          Sprite var2_ref_ed = HighscoreQuery.field_g;
          int var3 = -var2_ref_ed.fullWidth + 640 >> 1;
          int var4 = 480 - var2_ref_ed.fullHeight >> 1;
          if (this.countdownActive &&
            this.countdownTicks < 0) {
            int var5 = 1;
            var2_ref_ed.drawTinted(var3, var4, var5);
          } else {
            var2_ref_ed.drawTransparent(var3, var4);
          }
        }
        int var2 = -51 % ((-2 - guard) / 46);
    }

    private final void detachSessionAudio(int guard) {
        Throwable decompiledCaughtException = null;
        int var5 = EscapeVector.obfuscationControl;
        pl.field_n.removeSubstream(this.field_jb);
        pl.field_n.removeSubstream(this.field_Z);
        pl.field_n.removeSubstream(this.field_v);
        if (null != this.field_R) {
          pl.field_n.removeSubstream(this.field_R);
        }
        if (null != this.field_f) {
          pl.field_n.removeSubstream(this.field_f);
        }
        if (this.field_Eb != null) {
          this.field_Eb.setLoopCount(0);
        }
        pl.field_n.removeSubstream(this.field_Wb);
        pl.field_n.removeSubstream(this.field_wb);
        pl.field_n.removeSubstream(this.field_r);
        pl.field_n.removeSubstream(this.field_lc);
        pl.field_n.removeSubstream(this.field_fb);
        Object var2 = pl.field_n;
        synchronized (var2) {
          RockBuster var3 = (RockBuster) (this.rockBusters.first(false));
          while (true) {
            if (var3 != null) {
              int stackIn_15_0 = var3.remainingFlightTicks;
              if (stackIn_15_0 != 0) {
                pl.field_n.removeSubstream(var3.flightSound);
              }
              var3 = (RockBuster) (this.rockBusters.next((byte) 70));
              continue;
            }
            break;
          }
          int stackIn_15_0Lifetime1 = guard;
          if (stackIn_15_0Lifetime1 <= 60) {
            this.drawTerrainEdgeColumn(93, 112, 30, 56, 98, -40, 38, -71);
          }
          SeekerMine var3_ref = (SeekerMine) (this.seekerMines.first(false));
          while (var3_ref != null) {
            if (null != var3_ref.flightSound) {
              pl.field_n.removeSubstream(var3_ref.flightSound);
              pl.field_n.removeSubstream(var3_ref.proximitySound);
            }
            var3_ref = (SeekerMine) (this.seekerMines.next((byte) 70));
          }
        }
    }

    private final boolean spriteOverlapsShipHull(boolean guard, int y, int x, Sprite sprite) {
        String stackIn_58_2 = null;
        int var31 = EscapeVector.obfuscationControl;
        try {
          x = x + sprite.offsetX;
          y = y + sprite.offsetY;
          int var5_int = sprite.width + x - 1;
          int var6 = -1 + (sprite.height + y);
          double var7 = (double)this.shipAngle256 * 0.02454369260617026;
          int var9 = (int)(2048.0 * Math.sin(var7));
          int var10 = -(int)(2048.0 * Math.cos(var7));
          int var11 = -var10;
          int var12 = var9;
          if (guard) {
            this.worldHeight = 6;
          }
          int var13 = this.shipXQ16 >> 5;
          var13 = var13 + (this.worldWidth << 11);
          int var14 = this.shipYQ16 >> 5;
          int var15 = var13 + var9 * 10;
          int var16 = var13 - 2 * var9;
          int var17 = var14 + var10 * 10;
          int var18 = var14 - var10 * 2;
          int var19 = var13 + (-(var9 * 6) - 8 * var11);
          int var20 = -(var9 * 6) + var13 + var11 * 8;
          int var21 = -(6 * var10) + var14 - var12 * 8;
          int var22 = var12 * 8 + (var14 - 6 * var10);
          int var23 = var15;
          if (var23 > var19) {
            var23 = var19;
          }
          if (var20 < var23) {
            var23 = var20;
          }
          int var24 = var17;
          if (var24 > var21) {
            var24 = var21;
          }
          if (var22 < var24) {
            var24 = var22;
          }
          int var25 = var15;
          if (var25 < var19) {
            var25 = var19;
          }
          if (var25 < var20) {
            var25 = var20;
          }
          int var26 = var17;
          if (var21 > var26) {
            var26 = var21;
          }
          var23 = var23 >> 11;
          var25 = var25 >> 11;
          if (var26 < var22) {
            var26 = var22;
          }
          var24 = var24 >> 11;
          if (var24 < y) {
            var24 = y;
          }
          if (var5_int < var25) {
            var25 = var5_int;
          }
          if (var23 < x) {
            var23 = x;
          }
          var26 = var26 >> 11;
          if (var26 > var6) {
            var26 = var6;
          }
          int var27 = var24;
          while (true) {
            int stackIn_35_0 = var26;
            int stackIn_35_1 = var27;
            if (stackIn_35_0 < stackIn_35_1) {
              return false;
            }
            for (int var28 = var23; var25 >= var28; var28++) {
              int stackIn_35_0Lifetime1 = 0;
              int stackIn_35_1Lifetime1 = sprite.pixels[-x + ((var27 - y) * sprite.width + var28)];
              if (stackIn_35_0Lifetime1 != stackIn_35_1Lifetime1) {
                int var29 = var28 << 11;
                int var30 = var27 << 11;
                if (((var30 - var18) * (-var16 + var15)) > ((-var16 + var29) * (var17 - var18))) {
                  if ((var17 - var22) * (var29 - var20) > (var30 - var22) * (-var20 + var15) &&
                    (var16 - var20) * (var30 - var22) > (-var22 + var18) * (-var20 + var29)) {
                    return true;
                  }
                } else if ((-var21 + var17) * (-var19 + var29) < (-var19 + var15) * (var30 - var21) &&
                  ((-var19 + var16) * (var30 - var21)) < ((var29 - var19) * (var18 - var21))) {
                  return true;
                }
              }
            }
            var27++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_57_0 = var5;
          StringBuilder stackIn_57_1 = new StringBuilder().append("oe.UE(").append(guard).append(',').append(y).append(',').append(x).append(',');
          if (sprite == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    private final IntrusiveNode appendCollisionLaserSpan(IntrusiveNode last, int rightX, int leftX, boolean guard, int y) {
        LaserGateSpan var6_ref = null;
        String stackIn_14_2 = null;
        try {
          if (!guard) {
            this.destroyedInfrastructureCount = -120;
          }
          if (aa.field_a != 0 &&
            ~Bullet.collisionLaserCount != ~aa.field_a) {
            Object var6 = null;
            if (last == null) {
              var6_ref = (LaserGateSpan) (IntrusiveDeque.field_f.first(false));
            } else {
              var6_ref = (LaserGateSpan) (last.next);
            }
            Bullet.collisionLaserCount = Bullet.collisionLaserCount + 1;
            var6_ref.y = y;
            var6_ref.rightX = rightX;
            var6_ref.leftX = leftX;
            LaserGateSpan stackIn_8_0 = var6_ref;
            return (IntrusiveNode) ((Object) stackIn_8_0);
          }
          LaserGateSpan var6_refLifetime1 = new LaserGateSpan(leftX, rightX, y);
          IntrusiveDeque.field_f.addLast(-12328, var6_refLifetime1);
          aa.field_a = aa.field_a + 1;
          Bullet.collisionLaserCount = Bullet.collisionLaserCount + 1;
          LaserGateSpan stackIn_10_0 = var6_refLifetime1;
          return (IntrusiveNode) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref2 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var6_ref2;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.BD(");
          if (last == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(rightX).append(',').append(leftX).append(',').append(guard).append(',').append(y).append(')').toString());
        }
    }

    private final boolean spriteOverlapsTerrainTile(int param0, Sprite param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        String stackIn_37_2 = null;
        Object var18 = null;
        int var19 = EscapeVector.obfuscationControl;
        try {
          int[] var22 = this.terrainTile(param6, param4, param3);
          int[] var21 = var22;
          int[] var20 = var21;
          int[] var11 = var20;
          if (var20 == null &&
            0 == Bullet.collisionLaserCount) {
            return false;
          }
          param6 = param6 << 5;
          param3 = param3 << 5;
          int var12 = param5;
          while (true) {
            int stackIn_8_0 = ~param7;
            int stackIn_8_1 = ~var12;
            if (stackIn_8_0 > stackIn_8_1) {
              return false;
            }
            int var13 = param2;
            while (true) {
              int stackIn_11_0 = param8;
              int stackIn_11_1 = var13;
              if (stackIn_11_0 < stackIn_11_1) {
                var12++;
                break;
              }
              int var14 = param9 + var13;
              int var15 = var12 + param0;
              int stackIn_8_0Lifetime1 = -1;
              int stackIn_8_1Lifetime1 = ~param1.pixels[param1.width * var15 + var14];
              if (stackIn_8_0Lifetime1 != stackIn_8_1Lifetime1) {
                IntrusiveNode var16 = IntrusiveDeque.field_f.first(false);
                for (int var17 = 0; Bullet.collisionLaserCount > var17; var17++) {
                  LaserGateSpan var18_ref = (LaserGateSpan) (var16);
                  int stackIn_11_0Lifetime1 = var12 + param6;
                  int stackIn_11_1Lifetime1 = var18_ref.y;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    (var13 + param3) >= var18_ref.leftX &&
                    (var13 + param3) < var18_ref.rightX) {
                    return true;
                  }
                  var16 = var16.next;
                }
                if (var20 != null &&
                  this.maskPixelIsSolid(var22, var13, (byte) -74, var12)) {
                  return true;
                }
              }
              var13++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11_ref = decompiledCaughtException;
          RuntimeException stackIn_36_0 = var11_ref;
          StringBuilder stackIn_36_1 = new StringBuilder().append("oe.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void saveLevelProgress(int guard) {
        if (ua.field_c.b(15954, this.gameMode, this.levelIndex)) {
          ua.field_c.a(-15748, this.gameMode, this.levelIndex, ValidationIndicator.k(64));
        }
        if (guard != 6324320) {
          this.recordLevelResult((byte) 87, 37);
        }
    }

    private final void scanShipHullContacts(byte param0) {
        Object var25 = null;
        int var26 = EscapeVector.obfuscationControl;
        double var2 = (double)this.shipAngle256 * 0.02454369260617026;
        int var4 = (int)(Math.sin(var2) * 2048.0);
        int var5 = -(int)(Math.cos(var2) * 2048.0);
        int var6 = -var5;
        int var7 = var4;
        int var8 = this.shipXQ16 >> 5;
        var8 = var8 + (this.worldWidth << 11);
        int var9 = this.shipYQ16 >> 5;
        int var10 = var4 * 10 + var8;
        int var11 = -(2 * var4) + var8;
        int var12 = var5 * 10 + var9;
        int var13 = 26 / ((-43 - param0) / 47);
        int var14 = var9 - var5 * 2;
        int var15 = -(8 * var6) + (-(6 * var4) + var8);
        int var16 = var6 * 8 + (var8 - var4 * 6);
        int var17 = -(8 * var7) + (var9 - var5 * 6);
        int var18 = -(var5 * 6) + (var9 + 8 * var7);
        int var19 = var10;
        if (var19 > var15) {
          var19 = var15;
        }
        if (var16 < var19) {
          var19 = var16;
        }
        int var20 = var12;
        if (var17 < var20) {
          var20 = var17;
        }
        if (var20 > var18) {
          var20 = var18;
        }
        int var21 = var10;
        if (var21 < var15) {
          var21 = var15;
        }
        if (var21 < var16) {
          var21 = var16;
        }
        int var22 = var12;
        if (var17 > var22) {
          var22 = var17;
        }
        var21 = var21 >> 11;
        var19 = var19 >> 11;
        if (var22 < var18) {
          var22 = var18;
        }
        var20 = var20 >> 11;
        var22 = var22 >> 11;
        this.collectCollisionLaserSpans(94, var22, var20, var19, var21);
        IntrusiveNode var23 = IntrusiveDeque.field_f.first(false);
        for (int var24 = 0; Bullet.collisionLaserCount > var24; var24++) {
          LaserGateSpan var25_ref = (LaserGateSpan) (var23);
          var23 = var23.next;
          var25_ref.leftX = var25_ref.leftX << 11;
          var25_ref.rightX = var25_ref.rightX << 11;
          var25_ref.y = var25_ref.y << 11;
        }
        if (this.shipLanded &&
          Bullet.collisionLaserCount == 0) {
          return;
        }
        if ((var21 ^ var19) >> 5 != 0) {
          this.scanShipHullTileRows(var12, var11, var15, var14, var22, 31 & var19, var20, -5, var10, 31, var18, var16, var19 >> 5, var17);
          if (this.fatalHullContact) {
            return;
          }
          this.scanShipHullTileRows(var12, var11, var15, var14, var22, 0, var20, 112, var10, 31 & var21, var18, var16, var21 >> 5, var17);
        } else {
          this.scanShipHullTileRows(var12, var11, var15, var14, var22, 31 & var19, var20, -98, var10, var21 & 31, var18, var16, var19 >> 5, var17);
        }
    }

    private final void scanShieldTileRows(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        if ((param0 ^ param6) >> 5 != 0) {
          this.scanShieldContactTile(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 119, param7, 31);
          this.scanShieldContactTile(param4, 0, param1, param2, param6 >> 5, param3, (byte) 123, param7, 31 & param6);
        } else {
          this.scanShieldContactTile(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 123, param7, 31 & param6);
        }
        if (!param5) {
          this.tutorialStep = 64;
        }
    }

    private final void readSpawnAndFuel(byte guard, DataInputStream input, int formatVersion) throws IOException {
        try {
          if (formatVersion < 3) {
            this.spawnYQ16 = -8388608;
            this.spawnXQ16 = this.worldWidth << 15;
            this.initialFuel = 2500;
          } else {
            this.spawnXQ16 = input.readInt();
            this.spawnYQ16 = input.readInt();
            this.initialFuel = input.readInt();
            if (this.initialFuel <= 0) {
              this.initialFuel = 2500;
            }
          }
          int guardQuotient = -29 / ((79 - guard) / 37);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.FB(" + guard + ',' + (input != null ? "{...}" : "null") + ',' + formatVersion + ')');
        }
    }

    private final boolean isTerrainRayClear(int count, int stepYQ16, int yQ16, int xQ16, int stepXQ16, int guard) {
        int var12 = EscapeVector.obfuscationControl;
        if (guard != 0) {
          return true;
        }
        while (count > 0) {
          while (0 > xQ16) {
            xQ16 = xQ16 + (this.worldWidth << 16);
          }
          while (xQ16 >= this.worldWidth << 16) {
            xQ16 = xQ16 - (this.worldWidth << 16);
          }
          int var7 = xQ16 >> 16;
          int var8 = yQ16 >> 16;
          int var9 = var7 & 31;
          var7 = var7 >> 5;
          int var10 = var8 & 31;
          var8 = var8 >> 5;
          if (var8 >= 0) {
            if (var8 >= this.tilesHigh) {
              return false;
            }
            int[] var11 = this.terrainMasks[var7 + var8 * this.tilesWide];
            if (var11 != null && (var11 == QuickChatPhraseDefinition.fullTileMask ||
              (var11[var10] & 1 << var9) != 0)) {
              return false;
            }
          }
          yQ16 = yQ16 + stepYQ16;
          count--;
          xQ16 = xQ16 + stepXQ16;
        }
        return true;
    }

    private final boolean requiresExitBeforeCountdownEnds(int guard) {
        int var2 = 92 / ((guard + 57) / 36);
        if (this.countdownTrigger == 0) {
          return false;
        }
        if (0 == this.objectiveType &&
          this.countdownTrigger == 1) {
          return true;
        }
        if (this.objectiveType != 1) {
          return false;
        }
        if (this.countdownTrigger == 2) {
          return true;
        }
        return false;
    }

    private final void spawnSpriteDebris(int x, int guard, Sprite sprite, int y, PcmSample sound) {
        if (guard != -28311553) {
          return;
        }
        try {
          boolean var6_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var7 = ci.a((byte) -43, sound, y, sprite, (var6_int), x);
          this.pointCloudEffects.addLast(-12328, var7);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.D(" + x + ',' + guard + ',' + (sprite != null ? "{...}" : "null") + ',' + y + ',' + (sound != null ? "{...}" : "null") + ')');
        }
    }

    private final void objectiveTypeReadHook(int guard) {
        if (guard != -15474) {
          this.drawTutorialForeground(-86, -60, (byte) -9);
          return;
        }
    }

    private final int drawTerrainEdgeTile(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int[] param8) {
        String stackIn_55_2 = null;
        int var17 = EscapeVector.obfuscationControl;
        try {
          if (param3) {
            this.levelTitleTicks = -67;
          }
          regionExit1: {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            int[] var23 = this.initialTerrainTile(param7, (byte) -82, param1);
            int[] var21 = var23;
            int[] var18 = var21;
            int[] var10 = var18;
            int[] var22 = this.terrainTile(param1, -1, param7);
            int[] var20 = var22;
            int[] var11 = var20;
            if (var18 == null) {
              param0 = param0 + 640 * (-param6 + param4);
              for (int var12 = param5; param2 > var12; var12++) {
                param8[var12] = SpriteCheckboxPainter.bitwiseAnd(255, (param7 << 5) + var12);
              }
            } else {
              int[] var12_ref_int__ = PcmResampler.field_a[this.terrainTheme].pixels;
              if (var18 == QuickChatPhraseDefinition.fullTileMask) {
                int var13 = param6;
                while (true) {
                  int stackIn_7_0 = var13;
                  int stackIn_7_1 = param4;
                  if (stackIn_7_0 >= stackIn_7_1) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  boolean var14 = false;
                  for (int var15 = param5; var15 < param2; var15++) {
                    int stackIn_7_0Lifetime1 = param8[var15];
                    int stackIn_7_1Lifetime1 = 3840;
                    if (stackIn_7_0Lifetime1 < stackIn_7_1Lifetime1) {
                      if (0 <= var15 + param0 &&
                        var11 != null && (QuickChatPhraseDefinition.fullTileMask == var11 ||
                        0 != (var22[var13] >>> var15 & 1))) {
                        int var16 = var12_ref_int__[param8[var15]];
                        if (var16 != 0) {
                          SoftwareRasterizer.pixels[param0 + var15] = var16;
                        }
                      }
                      var14 = true;
                      param8[var15] = param8[var15] + 256;
                    }
                  }
                  if (!var14) {
                    param0 = param0 + 640 * (-var13 + param4);
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  param0 += 640;
                  var13++;
                }
              }
              if (decompiledFrameCompleted1 &&
                decompiledFrameCompleted0) {
                int var13Lifetime1 = param6;
                while (true) {
                  int stackIn_28_0 = ~var13Lifetime1;
                  int stackIn_28_1 = ~param4;
                  if (stackIn_28_0 <= stackIn_28_1) {
                    break;
                  }
                  int var14Lifetime1 = var23[var13Lifetime1];
                  int var19 = param5;
                  int var15Lifetime1 = var19;
                  while (var19 < param2) {
                    int stackIn_28_0Lifetime1 = -1;
                    int stackIn_28_1Lifetime1 = ~(1 & var14Lifetime1 >>> var19);
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_28_0Lifetime1 == stackIn_28_1Lifetime1) {
                      param8[var19] = SpriteCheckboxPainter.bitwiseAnd(var19 + (param7 << 5), 255);
                    } else if (param8[var19] < 3840) {
                      if (param0 + var19 >= 0 &&
                        var11 != null) {
                        if (QuickChatPhraseDefinition.fullTileMask != var11 &&
                          (1 & var22[var13Lifetime1] >>> var19) == 0) {
                          param8[var19] = param8[var19] + 256;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          int var16Lifetime1 = var12_ref_int__[param8[var19]];
                          if (var16Lifetime1 != 0) {
                            SoftwareRasterizer.pixels[param0 + var19] = var16Lifetime1;
                          }
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        param8[var19] = param8[var19] + 256;
                      }
                    }
                    var19++;
                  }
                  param0 += 640;
                  var13Lifetime1++;
                }
              }
            }
          }
          int stackIn_51_0 = param0;
          return stackIn_51_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_54_0 = var10_ref;
          StringBuilder stackIn_54_1 = new StringBuilder().append("oe.SD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    private final void queueRetrievalChapterIntro(int guard) {
        if (!EmailSyntaxValidator.a(this.gameMode, -2)) {
          return;
        }
        if (this.levelIndex == 0) {
          LevelObject.a(1, (byte) -86);
        }
        if (this.levelIndex == 0) {
          DialogueScreen var3 = new DialogueScreen(BoundedRandomAccessFile.field_c, SpriteCheckboxPainter.field_c, se.field_a, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var3);
        }
        if (2 == this.levelIndex) {
          DialogueScreen var4 = new DialogueScreen(bg.field_c, SpriteCheckboxPainter.field_c, SpriteCheckboxPainter.field_e, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var4);
        }
        if (4 == this.levelIndex) {
          DialogueScreen var5 = new DialogueScreen(DynamicTerrainRenderer.field_i, SpriteCheckboxPainter.field_c, co.field_e, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var5);
        }
        if (guard == ~this.levelIndex) {
          DialogueScreen var6 = new DialogueScreen(UiContainer.field_F, SpriteCheckboxPainter.field_c, LegacyMenuColumn.field_g, false);
          GradientOutlineTextPainter.enqueueDialogue(guard + 1829, var6);
        }
        if (this.levelIndex == 12) {
          DialogueScreen var7 = new DialogueScreen(TextLayoutLine.field_c, SpriteCheckboxPainter.field_c, SeekerPulseStream.field_t, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var7);
        }
    }

    private final boolean hitShipAtPoint(byte guard, int y, int x) {
        int var25 = EscapeVector.obfuscationControl;
        double var4 = 0.02454369260617026 * (double)this.shipAngle256;
        int var6 = (int)(2048.0 * Math.sin(var4));
        int var7 = -(int)(Math.cos(var4) * 2048.0);
        int var8 = -var7;
        int var9 = var6;
        int var10 = this.shipXQ16 >> 5;
        var10 = var10 + (this.worldWidth << 11);
        int var11 = this.shipYQ16 >> 5;
        int var12 = var6 * 10 + var10;
        int var13 = -(2 * var6) + var10;
        int var14 = var11 + var7 * 10;
        int var15 = var11 - var7 * 2;
        int var16 = var10 - 6 * var6 - var8 * 8;
        int var17 = var8 * 8 + var10 - 6 * var6;
        int var18 = -(var9 * 8) + (var11 - var7 * 6);
        int var19 = -(6 * var7) + (var11 + 8 * var9);
        int var20 = 48 % ((guard - 62) / 40);
        int var21 = var12;
        if (var16 < var21) {
          var21 = var16;
        }
        if (var21 > var17) {
          var21 = var17;
        }
        int var22 = var14;
        if (var22 > var18) {
          var22 = var18;
        }
        if (var19 < var22) {
          var22 = var19;
        }
        int var23 = var12;
        if (var16 > var23) {
          var23 = var16;
        }
        if (var17 > var23) {
          var23 = var17;
        }
        int var24 = var14;
        if (var18 > var24) {
          var24 = var18;
        }
        if (var24 < var19) {
          var24 = var19;
        }
        x = x << 11;
        y = y << 11;
        while (var21 > x) {
          x = x + (this.worldWidth << 11);
        }
        if (var23 >= x &&
          y >= var22 &&
          var24 >= y) {
          if ((x - var13) * (var14 - var15) < (var12 - var13) * (y - var15)) {
            if ((x - var17) * (-var19 + var14) > (-var19 + y) * (-var17 + var12) &&
              (var13 - var17) * (y - var19) > (-var17 + x) * (var15 - var19)) {
              this.destroyShip((byte) -118);
              return true;
            }
          } else if ((-var16 + x) * (-var18 + var14) < (-var18 + y) * (-var16 + var12)) {
            if (((y - var18) * (-var16 + var13)) >= ((-var16 + x) * (-var18 + var15))) {
              return false;
            }
            this.destroyShip((byte) -62);
            return true;
          }
          return false;
        }
        return false;
    }

    private final boolean areTerrainAssetsReady(byte guard) {
        if (guard < 26) {
          return false;
        }
        boolean var2 = true;
        if (6 == this.secondaryTheme) {
          var2 = (fg.c(0));
        }
        var2 = ((var2) & mm.a(4, this.terrainTheme));
        return (var2);
    }

    final int missionDialogueTier(byte guard) {
        if (4 > this.levelIndex) {
          return 0;
        }
        if (this.levelIndex < 12) {
          return 1;
        }
        if (guard != -84) {
          return -54;
        }
        return 2;
    }

    private final void decodeLevelBytes(byte[] bytes, int guard) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              this.loadLevelStream((InputStream) ((Object) new ByteArrayInputStream(bytes)), false);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3 = (IOException) (Object) decompiledCaughtException;
            }
            if (guard < 36) {
              this.selfDestructEffects = (SelfDestructEffects) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("oe.OD(");
            if (bytes == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean hitTetheredObjectAtPoint(int guard, int x, int y) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.tetheredObjectType >= 0 &&
          0 == this.pickupAnimationTicks) {
          Sprite var8 = mb.field_f[this.tetheredObjectType];
          int var5 = this.worldWidth + ((this.tetheredXQ16 - (var8.fullWidth << 15) >> 16) + var8.offsetX);
          int var6 = (-(var8.fullHeight << 15) + this.tetheredYQ16 >> 16) + var8.offsetY;
          while (x < var5) {
            x = x + this.worldWidth;
          }
          if (x < (var8.width + var5) &&
            y >= var6) {
            if (y >= (var6 + var8.height)) {
              return false;
            }
            if (var8.pixels[x + (y - var6) * var8.height - var5] == 0) {
              return false;
            }
            this.destroyTetheredObject((byte) 81);
            return true;
          }
          return false;
        }
        if (guard != -2) {
          this.levelData = (byte[][]) null;
        }
        return false;
    }

    final static void openSessionScreen(boolean option, int guard) {
        TextLayout.field_b = true;
        if (guard != 2560) {
          GameplaySession.resetSessionMenuState((byte) 49);
        }
        UiComponent.field_o = new pf(option);
        di.field_d = null;
        mj.field_d = 0;
        gi.a((byte) -93);
    }

    final void replayMissionBriefing(int guard) {
        this.queueRetrievalBriefing((byte) 94);
        if (guard != 256) {
          this.drawTutorialForeground(63, -69, (byte) -63);
        }
        this.queueRetributionBriefing(10974);
    }

    private final void loadCurrentLevel(int guard) {
        try {
          try {
            this.loadLevelStream((InputStream) ((Object) new ByteArrayInputStream(this.levelData[this.levelIndex])), false);
            if (guard > -123) {
              this.resetSessionEffects(42, false);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final PointCloudEffect createExhaustCloud(int count, int guard) {
        boolean var3 = (this.usesDynamicTerrain(8192));
        if (guard != -22944) {
          return (PointCloudEffect) null;
        }
        return BoundedRandomAccessFile.a(count, (var3), 8);
    }

    private final boolean maskPixelIsSolid(int[] rows, int bitX, byte guard, int rowY) {
        String stackIn_14_2 = null;
        try {
          if (guard != -74) {
            return false;
          }
          if (QuickChatPhraseDefinition.fullTileMask == rows) {
            return true;
          }
          boolean stackIn_10_0 = ((rows[rowY] & 1 << bitX) != 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.LF(");
          if (rows == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(bitX).append(',').append(guard).append(',').append(rowY).append(')').toString());
        }
    }

    private final boolean usesDynamicTerrain(int guard) {
        if (guard != 8192) {
          return false;
        }
        return this.terrainTheme == 4 ? true : false;
    }

    private final PointCloudEffect spawnObjectDebris(LevelObject object, byte guard) {
        String stackIn_7_2 = null;
        try {
          boolean var3_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var4 = LoginMethod.a(object, 14, (var3_int));
          this.pointCloudEffects.addLast(-12328, var4);
          if (guard != 42) {
            field_xb = (int[]) null;
          }
          PointCloudEffect stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oe.AC(");
          if (object == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void drawTutorialForeground(int cameraX, int cameraY, byte guard) {
        int var5 = 0;
        int var6 = EscapeVector.obfuscationControl;
        if (this.levelIndex < 0) {
          Sprite var4 = qf.field_d;
          if (var4 == null) {
            return;
          }
          for (var5 = -cameraX; var5 > -1024; var5 -= 1024) {
          }
          while (var5 < 640) {
            var4.drawTransparent(480 + var5, -cameraY);
            var5 += 1024;
          }
        }
        if (guard != -14) {
          this.field_fb = (TetherHumStream) null;
        }
    }

    private final void activateCountdown(int guard, int trigger) {
        if (this.countdownTrigger == 0) {
          return;
        }
        if (trigger != this.countdownTrigger) {
          return;
        }
        this.countdownActive = true;
        int var3 = 100;
        if (trigger == 3) {
          var3 = 164;
        }
        this.queueHudMessage(var3, (byte) 72, di.field_c);
        int var4 = -77 / ((guard + 30) / 34);
    }

    private final void drawTerrainEdges(int cameraY, int guard, int cameraX) {
        int var10 = EscapeVector.obfuscationControl;
        if (PcmResampler.field_a[this.terrainTheme] == null) {
          return;
        }
        while (0 > cameraX) {
          cameraX = cameraX + this.worldWidth;
        }
        int var4 = 31 + cameraX >> 5;
        int var5 = cameraY + 16 >> 5;
        int var6 = cameraX + 640 >> 5;
        int var7 = cameraY + 480 >> 5;
        int var8 = -cameraX + (var4 << 5);
        if (0 < var8) {
          this.drawTerrainEdgeColumn(-1 + var4, var5, cameraY, var7, 32 - var8, cameraX, 10943, 32);
        }
        int var9 = var4;
        if (guard != 8192) {
          this.gameMode = -7;
        }
        while (var6 > var9) {
          this.drawTerrainEdgeColumn(var9, var5, cameraY, var7, 0, cameraX, guard + 2751, 32);
          var9++;
        }
        var9 = 31 & -var8 + 640;
        if (var9 > 0) {
          this.drawTerrainEdgeColumn(var6, var5, cameraY, var7, 0, cameraX, 10943, var9);
        }
    }

    private final void recycleInactiveBullets(int guard) {
        int var8 = EscapeVector.obfuscationControl;
        int var2 = -49 % ((82 - guard) / 43);
        int var3 = 0;
        IntrusiveNode var4 = this.bullets.first(false);
        for (int var5 = 0; this.activeBulletCount > var5; var5++) {
          Bullet var6 = (Bullet) (var4);
          if (!var6.inactive) {
            var4 = var4.next;
          } else {
            var6.deactivate(-37);
            var3++;
            if (0 == this.activeBulletCount - var3) {
              this.lastActiveBullet = null;
            } else if (this.lastActiveBullet == var4) {
              this.lastActiveBullet = var4.previous;
            }
            IntrusiveNode var7 = var4;
            var4 = var4.next;
            var7.unlink((byte) -14);
            this.bullets.addLast(-12328, var7);
          }
        }
        this.activeBulletCount = this.activeBulletCount - var3;
    }

    private final void updateCampaignBestScore(boolean guard) {
        int var2 = this.score + this.levelScore;
        TrackerMusicDefinition.field_f.d((byte) -101, this.gameMode, var2);
        if (guard) {
          this.tilesWide = -77;
        }
    }

    private final void queueRetrievalBriefing(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (!EmailSyntaxValidator.a(this.gameMode, -2)) {
          return;
        }
        int var2 = 95 / ((51 - guard) / 36);
        if (this.levelIndex < 2) {
          DialogueScreen var5 = new DialogueScreen(BoundedRandomAccessFile.field_c, SpriteCheckboxPainter.field_c, se.field_a, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var5);
        } else if (this.levelIndex < 4) {
          DialogueScreen var6 = new DialogueScreen(bg.field_c, SpriteCheckboxPainter.field_c, SpriteCheckboxPainter.field_e, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var6);
        } else if (this.levelIndex < 8) {
          DialogueScreen var7 = new DialogueScreen(DynamicTerrainRenderer.field_i, SpriteCheckboxPainter.field_c, co.field_e, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var7);
        } else if (this.levelIndex < 12) {
          DialogueScreen var8 = new DialogueScreen(UiContainer.field_F, SpriteCheckboxPainter.field_c, LegacyMenuColumn.field_g, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var8);
        } else {
          DialogueScreen var9 = new DialogueScreen(TextLayoutLine.field_c, SpriteCheckboxPainter.field_c, SeekerPulseStream.field_t, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var9);
        }
    }

    private final void showHudMessage(int guard, String text) {
        try {
          int var3_int = -72 / ((guard + 38) / 58);
          this.queueHudMessage(100, (byte) 91, text);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.QB(" + guard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    private final void silenceSampleStream(int guard, PcmSampleStream stream) {
        if (stream == null) {
          return;
        }
        try {
          if (guard != 4) {
            Sprite var4 = (Sprite) null;
            boolean discarded$0 = this.spriteOverlapsTerrainColumns((Sprite) null, -82, -79, -108, -58, 107, 91, -47);
          }
          stream.setVolumeQ6(0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.JB(" + guard + ',' + (stream != null ? "{...}" : "null") + ')');
        }
    }

    private final int drawTerrainBaseTile(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13;
        int var14;
        int var16 = EscapeVector.obfuscationControl;
        int[] var19 = this.terrainTile(param3, param7 ^ -1299998022, param1);
        int[] var18 = var19;
        int[] var17 = var18;
        int[] var9 = var17;
        if (param7 != 1299998021) {
          this.applyRockBusterPickup(-25, 18);
        }
        if (var17 == null) {
          param5 = param5 + (-param2 + param6) * 640;
        } else {
          Sprite var10 = EmailValidationError.field_a[this.terrainTheme];
          int[] var11 = var10.pixels;
          int var12 = (param1 << 5) % var10.width + (param2 + (param3 << 5)) % var10.height * var10.width;
          if (QuickChatPhraseDefinition.fullTileMask == var17) {
            for (var13 = param2; var13 < param6; var13++) {
              for (var14 = param0; param4 > var14; var14++) {
                SoftwareRasterizer.pixels[var14 + param5] = var11[var12 + var14];
              }
              var12 = var12 + var10.width;
              param5 += 640;
            }
          } else {
            var13 = param2;
            while (param6 > var13) {
              var14 = var19[var13];
              int var15 = param0;
              while (var15 < param4) {
                int stackIn_14_0 = 0;
                int stackIn_14_1 = var14 >>> var15 & 1;
                if (stackIn_14_0 != stackIn_14_1) {
                  SoftwareRasterizer.pixels[var15 + param5] = var11[var12 + var15];
                }
                var15++;
              }
              int stackIn_14_0Lifetime1 = var12;
              int stackIn_14_1Lifetime1 = var10.width;
              var12 = stackIn_14_0Lifetime1 + stackIn_14_1Lifetime1;
              param5 += 640;
              var13++;
            }
          }
        }
        return param5;
    }

    private final String terrainLoadingMessage(int guard) {
        if (guard != 4251) {
          this.drawHudPanels(11);
        }
        return wk.a(TextFieldValidator.field_l, false, DebouncedValidator.field_d, da.field_d[this.terrainTheme], IndexedSpriteState.field_j);
    }

    private final void drawThemeBottomBackground(int x, int y, int guard) {
        Sprite var4 = sl.field_b[this.secondaryTheme][3];
        int var5 = -128 / ((43 - guard) / 45);
        if (var4 != null) {
          y = y + var4.fullHeight;
        }
        Sprite var6 = pf.field_g[this.secondaryTheme];
        if (var6 == null) {
          return;
        }
        this.tileParallaxLayer(true, false, 94, var6, y, x);
    }

    private final void readLevelObjects(int formatVersion, DataInputStream input, boolean guard) throws IOException {
        String stackIn_13_2 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          this.initialInfrastructureCount = 0;
          this.missionTargets = null;
          if (!guard) {
            this.drawShieldGlow((byte) 113);
          }
          this.destroyedInfrastructureCount = 0;
          this.pendingTargetEffects = null;
          int objectCount = input.readUnsignedByte();
          this.levelObjects.setSize(objectCount);
          for (int objectIndex = 0; objectCount > objectIndex; objectIndex++) {
            LevelObject object = this.readLevelObject(input, (byte) -67, objectIndex, formatVersion);
            this.levelObjects.setElementAt(object, objectIndex);
            if (object.countsAsInfrastructure((byte) -5)) {
              this.initialInfrastructureCount = this.initialInfrastructureCount + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oe.UA(").append(formatVersion).append(',');
          if (input == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean isMissionComplete(byte guard) {
        if (this.objectiveType == 0) {
          boolean stackIn_6_0 = (this.levelEnded) && (1 == this.tetheredObjectType);
          return stackIn_6_0;
        }
        if (this.objectiveType != 1) {
          if (guard <= -14) {
            return false;
          }
          this.levelData = (byte[][]) null;
          return false;
        }
        boolean stackIn_12_0 = (this.levelEnded) && (this.areMissionTargetsDestroyed(119));
        return stackIn_12_0;
    }

    final void selectLevel(int levelIndex, int guard) {
        if (levelIndex < 0) {
          return;
        }
        if (levelIndex >= this.levelData.length) {
          return;
        }
        this.levelIndex = levelIndex;
        this.installLevelBytes(false, this.levelData[levelIndex], true);
        int var3 = 20 / ((28 - guard) / 51);
    }

    private final void updateMissionOutcome(int objectiveType) {
        int var3 = EscapeVector.obfuscationControl;
        if (objectiveType == this.objectiveType &&
          this.hasShipReachedExit(true)) {
          this.levelEnded = true;
          if (1 == this.tetheredObjectType) {
            vj.b(97);
            pl.field_n.playSampleWithPan(AchievementQuery.field_k, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            if (this.scoringEnabled) {
              if (this.levelIndex >= 0) {
                this.transitionTicks = -150;
              }
              this.saveLevelProgress(objectiveType + 6324320);
              this.recordLevelCompletion(7);
            }
            this.recordLevelResult((byte) -109, 1);
          } else if (0 <= this.levelIndex ||
            !this.cargoLost) {
            pl.field_n.playSampleWithPan(gm.field_b, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            this.showHudMessage(-98, ki.field_I);
          }
        }
        if (this.objectiveType == 1) {
          if (this.areMissionTargetsDestroyed(98)) {
            if (this.requiresExitBeforeCountdownEnds(-108) &&
              !this.hasShipReachedExit(true)) {
              return;
            }
            this.levelEnded = true;
            vj.b(104);
            pl.field_n.playSampleWithPan(AchievementQuery.field_k, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
            if (this.scoringEnabled) {
              if (0 <= this.levelIndex) {
                this.transitionTicks = -150;
              }
              this.saveLevelProgress(objectiveType + 6324320);
              this.recordLevelCompletion(7);
            }
            this.recordLevelResult((byte) -124, 1);
          } else if (this.hasShipReachedExit(true)) {
            this.levelEnded = true;
            pl.field_n.playSampleWithPan(gm.field_b, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            this.showHudMessage(objectiveType ^ -101, LegacyTextBlock.field_c);
          }
        }
    }

    private final void queueHudMessage(int durationTicks, byte guard, String text) {
        try {
          HudMessage var4 = new HudMessage(text, durationTicks);
          if (guard <= 52) {
            int[] discarded$0 = this.initialTerrainTile(-114, (byte) -86, 65);
          }
          this.hudMessageQueue.addLast(-12328, var4);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.SB(" + durationTicks + ',' + guard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyRockBusterPickup(int guard, int objectType) {
        if (guard != 320) {
          this.rockBusterAmmo = -112;
        }
        int var3 = 0;
        if (objectType == 12) {
          var3 = 1;
        }
        if (objectType == 13) {
          var3 = 5;
        }
        if (0 == var3) {
          return;
        }
        String var4 = this.rockBusterPickupMessage(false, var3);
        this.showHudMessage(guard - 430, var4);
        this.rockBusterAmmo = this.rockBusterAmmo + var3;
        AccountRegistrationPanel.a(var3, -15655);
    }

    final void startSession(byte guard) {
        this.queueRetrievalChapterIntro(-9);
        if (guard != -40) {
          this.displayedTutorialStep = -86;
        }
        this.queueRetributionChapterIntro(-122);
    }

    private final void readGravity(int defaultGravityQ16, DataInputStream input, int formatVersion) throws IOException {
        String stackIn_15_2 = null;
        try {
          this.gravityQ16 = defaultGravityQ16;
          if (formatVersion < 8) {
            return;
          }
          int encodedGravityQ16 = input.readUnsignedShort();
          if (encodedGravityQ16 == 512) {
            this.gravityQ16 = 512;
          }
          if (encodedGravityQ16 == 768) {
            this.gravityQ16 = 768;
          }
          if (16 == encodedGravityQ16) {
            this.gravityQ16 = 16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.RB(").append(defaultGravityQ16).append(',');
          if (input == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(formatVersion).append(')').toString());
        }
    }

    private final HudMessage pollHudMessage(int guard) {
        if (this.hudMessageQueue == null) {
          return null;
        }
        if (guard != -27521) {
          this.resetSessionEffects(-27, true);
        }
        if (this.hudMessageQueue.isEmpty(-97)) {
          return null;
        }
        IntrusiveNode var2 = this.hudMessageQueue.first(false);
        if (var2 == null) {
          return null;
        }
        var2.unlink((byte) -59);
        return (HudMessage) (var2);
    }

    private final int blueComponent(int guard, int packed) {
        int var3 = 51 / ((-3 - guard) / 63);
        return packed & 255;
    }

    private final void queueCampaignConclusion(int guard) {
        if (EmailSyntaxValidator.a(this.gameMode, -2)) {
          DialogueScreen var2 = new DialogueScreen(SpriteOffset.field_e, SpriteCheckboxPainter.field_c, mb.field_b, true);
          var2.field_m = false;
          GradientOutlineTextPainter.enqueueDialogue(1820, var2);
        }
        if (~this.gameMode == guard) {
          String var2_ref = "vengeance_concl";
          String var3 = "scene";
          Sprite[] var4 = ug.field_a;
          String[] var5 = IntValueNode.field_h;
          DialogueScreen var6 = new DialogueScreen(var2_ref, var3, var4, var5, true);
          GradientOutlineTextPainter.enqueueDialogue(1820, var6);
        }
    }

    private final boolean shouldLoopMusic(byte guard) {
        boolean var2 = true;
        int var3 = this.musicThemeIndex(true);
        if (guard != -48) {
          this.displayedAchievementIds = (int[]) null;
        }
        boolean[] var4 = wk.field_b;
        if (var4 != null &&
          var3 >= 0 &&
          var4.length > var3) {
          var2 = (var4[var3]);
        }
        if (null != this.selfDestructEffects) {
          boolean var5 = false;
          TrackerMusicDefinition var6 = this.selfDestructEffects.b(true);
          if (var6 != null) {
            var2 = var5;
          }
        }
        return (var2);
    }

    private final int selectMusicVolume(int guard) {
        int var2 = -1;
        int var3 = this.musicThemeIndex(true);
        if (guard != -68661304) {
          Sprite var6 = (Sprite) null;
          this.renderShipHull(-94, (Sprite) null, -116, 123);
        }
        int[] var4 = wi.field_h;
        if (var4 != null &&
          var3 >= 0 &&
          var3 < var4.length &&
          var4[var3] >= 0) {
          var2 = var4[var3];
        }
        if (null != this.selfDestructEffects) {
          int var5 = this.selfDestructEffects.c(true);
          if (var5 >= 0) {
            var2 = var5;
          }
        }
        return var2;
    }

    private final void drawShieldGlow(byte guard) {
        int var2 = 124 % ((guard - 56) / 62);
        if (this.shieldActive) {
          int var3 = 10053375;
          SoftwareRasterizer.fillCircleAlpha(319, 239, 10, var3, 48);
          SoftwareRasterizer.fillCircleAlpha(320, 239, 10, var3, 48);
          SoftwareRasterizer.fillCircleAlpha(319, 240, 10, var3, 48);
          SoftwareRasterizer.fillCircleAlpha(320, 240, 10, var3, 48);
        }
    }

    private final void drawParallaxBackground(int guard, int cameraX, int cameraY) {
        cameraY -= 64;
        this.tileParallaxLayer(this.repeatSkyLayerVertically((byte) 90), false, 117, sl.field_b[this.secondaryTheme][0], (-cameraY >> 3) - (this.tutorialBackgroundPhase >> 1), -cameraX >> 3);
        int var4 = 26 / ((16 - guard) / 39);
        this.drawLevelTitle(-1, cameraY);
        this.tileParallaxLayer(false, false, 124, sl.field_b[this.secondaryTheme][1], -cameraY * 5 >> 3, 5 * -cameraX >> 3);
        this.tileParallaxLayer(false, false, 74, sl.field_b[this.secondaryTheme][2], -cameraY + (cameraY >> 2), (cameraX >> 2) - cameraX);
        this.tileParallaxLayer(false, true, 92, sl.field_b[this.secondaryTheme][3], (cameraY >> 3) - cameraY, -cameraX + (cameraX >> 3));
        this.drawThemeBottomBackground(-cameraX + (cameraX >> 3), -cameraY + (cameraY >> 3), -36);
        this.drawTutorialCavernBackground(cameraY, -7778, cameraX);
    }

    private final void decodeLevelStream(boolean headerOnly, int guard, InputStream input) throws IOException {
        try {
          DataInputStream levelInput = new DataInputStream(input);
          int formatVersion = levelInput.readByte();
          this.readObjectiveType(formatVersion, levelInput, (byte) 126);
          this.readCountdown(formatVersion, -8277, levelInput);
          this.loadTerrain(headerOnly, formatVersion, 640, levelInput);
          this.readLevelObjects(formatVersion, levelInput, true);
          this.readSeekerMines(formatVersion, levelInput, (byte) -17);
          this.readSpawnAndFuel((byte) 121, levelInput, formatVersion);
          if (guard != -1) {
            this.recordDestructionForAchievement((byte) -88);
          }
          this.readShieldEnergy(-112, levelInput, formatVersion);
          this.readInitialPowerups(levelInput, formatVersion, (byte) 71);
          this.readGravity(512, levelInput, formatVersion);
          levelInput.close();
          this.shipLanded = false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.FD(" + headerOnly + ',' + guard + ',' + (input != null ? "{...}" : "null") + ')');
        }
    }

    private final void updatePickupAnimation(boolean guard) {
        if (this.pickupAnimationTicks > 0) {
          this.pickupAnimationTicks = this.pickupAnimationTicks - 1;
          if (this.pickupAnimationTicks == 0) {
            this.applyPowerup(-123, this.tetheredObjectType);
            pl.field_n.playSampleWithPan(nm.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            int var2 = qj.a((byte) -38, this.tetheredObjectType, this.gameMode);
            this.levelScore = this.levelScore + var2;
            v.a(8, var2);
            this.tetheredObjectType = -1;
            if (this.scoringEnabled) {
              this.collectedPowerupCount = this.collectedPowerupCount + 1;
              mh.a((byte) 119);
              if (this.collectedPowerupCount == 19) {
                this.awardAchievement(this.gameMode, false, 11, 244);
              }
            }
          }
        }
        if (!guard) {
          this.shipDestroyed = true;
        }
    }

    private final boolean spriteOverlapsTerrainColumns(Sprite param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        String stackIn_14_2 = null;
        try {
          if (param6 != 31) {
            return true;
          }
          if ((param5 ^ param2) >> 5 == 0) {
            boolean stackIn_10_0 = this.spriteOverlapsTerrainTile(-(31 & param2), param0, param3, param1, param6 - 32, 31 & param2, param2 >> 5, param5 & 31, param7, param4);
            return stackIn_10_0;
          }
          if (!this.spriteOverlapsTerrainTile(-(31 & param2), param0, param3, param1, -1, 31 & param2, param2 >> 5, 31, param7, param4)) {
            boolean stackIn_8_0 = this.spriteOverlapsTerrainTile(-param2 & 31, param0, param3, param1, -1, 0, param5 >> 5, 31 & param5, param7, param4);
            return stackIn_8_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var9;
          StringBuilder stackIn_13_1 = new StringBuilder().append("oe.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int flatLevelIndex(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 0;
        for (int var3 = 0; var3 < this.gameMode; var3++) {
          var2 = var2 + je.a(false, var3);
        }
        var2 = var2 + this.levelIndex;
        if (guard != 20824) {
          this.field_M = -70;
        }
        return var2;
    }

    private final void updateNotices(byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.levelIndex < 0 &&
          !this.showingAchievementNotice) {
          if (!(this.pendingAchievementCount <= 0)) {
            if (0 < this.noticeTicks) {
              this.noticeTicks = this.noticeTicks - 1;
            }
            if (this.noticeTicks == 0) {
              this.showingAchievementNotice = true;
            }
          } else if (!this.shipDestroyed &&
            !this.levelEnded &&
            !this.cargoLost) {
            if (this.hudMessageTicks < 60) {
              if (this.tutorialStep == 0 &&
                58720256 > this.shipYQ16) {
                this.tutorialStep = 1;
              }
              if (this.tutorialStep == 1 &&
                this.shipLanded) {
                this.tutorialStep = 2;
              }
              if (this.tutorialStep <= 3 &&
                this.shipYQ16 < 33554432) {
                this.tutorialStep = 4;
              }
              if ((4 == this.tutorialStep ||
                this.tutorialStep == 5) &&
                this.shipYQ16 >= 33554432) {
                this.tutorialStep = 3;
              }
              if (4 == this.tutorialStep &&
                this.shieldUsedThisLevel) {
                this.tutorialStep = 5;
              }
              if (this.tetheredObjectType == 1 &&
                this.tutorialStep < 6) {
                this.tutorialStep = 6;
              }
              boolean var2_int = false;
              if (this.shipYQ16 < 20971520 &&
                this.tutorialStep >= 5 &&
                0 < this.levelObjects.size()) {
                LevelObject var8 = (LevelObject) (this.levelObjects.elementAt(0));
                if (var8.objectType == 8) {
                  var2_int = true;
                }
              }
              if (var2_int) {
                this.tutorialStep = 7;
              } else if (this.tutorialStep == 7) {
                if (this.tetheredObjectType >= 0) {
                  this.tutorialStep = 8;
                } else {
                  this.tutorialStep = 5;
                }
              }
              if (this.tutorialStep == 8 &&
                20971520 <= this.shipYQ16) {
                this.tutorialStep = 9;
              }
            }
            if (~this.tutorialStep != ~this.displayedTutorialStep) {
              if (this.noticeTicks > 0) {
                this.noticeTicks = this.noticeTicks - 1;
              }
              if (this.noticeTicks == 0) {
                this.displayedTutorialStep = this.tutorialStep;
                Sprite var2 = this.noticeSprite;
                this.noticeSprite.fullWidth = 638;
                var2.width = 638;
                Sprite var3_ref_ed = this.noticeSprite;
                this.noticeSprite.fullHeight = 60;
                var3_ref_ed.height = 60;
                this.noticeSprite.bindAsFramebuffer();
                SoftwareRasterizer.clearFramebuffer();
                fh.field_g.drawCentered(SeekerMine.field_k[3 * this.tutorialStep], 319, 20, 16777215, -1);
                fh.field_g.drawCentered(SeekerMine.field_k[this.tutorialStep * 3 + 1], 319, 40, 16777215, -1);
                fh.field_g.drawCentered(SeekerMine.field_k[2 + this.tutorialStep * 3], 319, 60, 16777215, -1);
                md.field_D.a(126);
              }
            }
            if (~this.displayedTutorialStep == ~this.tutorialStep &&
              !(this.noticeTicks >= 31)) {
              this.noticeTicks = this.noticeTicks + 1;
            }
            boolean decompiledFrameRemainder0 = false;
          } else if ((-32 <= this.transitionTicks ||
            this.noticeTicks < 31) && this.noticeTicks > 0) {
            this.noticeTicks = this.noticeTicks - 1;
          }
        }
        if (guard != 9) {
          this.drawLaserGates(-119, (byte) 66, 9);
        }
        if (this.levelIndex >= 0 ||
          this.showingAchievementNotice) {
          if (this.noticeTicks > 0) {
            this.noticeTicks = this.noticeTicks - 1;
          }
          if (this.noticeTicks == 0 &&
            this.pendingAchievementCount > 0) {
            this.displayedAchievementCount = 0;
            while (this.pendingAchievementCount > 0) {
              int stackIn_86_0 = this.displayedAchievementCount;
              int stackIn_86_1 = 3;
              if (stackIn_86_0 < stackIn_86_1) {
                int fieldTemp$0 = this.displayedAchievementCount;
                this.displayedAchievementCount = this.displayedAchievementCount + 1;
                this.displayedAchievementIds[fieldTemp$0] = this.pendingAchievementIds[0];
                this.pendingAchievementCount = this.pendingAchievementCount - 1;
                qg.a(this.pendingAchievementIds, 1, this.pendingAchievementIds, 0, this.pendingAchievementCount);
                continue;
              }
              break;
            }
            this.noticeSprite.fullWidth = -20 + this.displayedAchievementCount * 160;
            this.noticeSprite.width = -20 + this.displayedAchievementCount * 160;
            this.noticeTicks = 150;
            this.noticeSprite.fullHeight = 40;
            Sprite var2Lifetime1 = this.noticeSprite;
            var2Lifetime1.height = 40;
            this.noticeSprite.bindAsFramebuffer();
            SoftwareRasterizer.clearFramebuffer();
            int var3 = 0;
            for (int var4 = 0; var4 < this.displayedAchievementCount; var4++) {
              int var5 = this.displayedAchievementIds[var4];
              RasterSnapshot.field_m[var5].drawTransparent(var3, 4);
              int var6 = 39 - fh.field_g.wrappedLineCount(CachedArchiveProvider.field_r[var5], 100) * 10;
              fh.field_g.drawParagraph(CachedArchiveProvider.field_r[var5], var3 + 40, var6 - fh.field_g.maxAscent, 100, 1000, 16777215, -1, 0, 0, 20);
              var3 += 160;
            }
            md.field_D.a(113);
          }
          if (this.noticeTicks == 0) {
            int stackIn_86_0Lifetime1 = ~this.pendingAchievementCount;
            int stackIn_86_1Lifetime1 = -1;
            if (stackIn_86_0Lifetime1 == stackIn_86_1Lifetime1 &&
              0 > this.levelIndex) {
              this.showingAchievementNotice = false;
              this.displayedTutorialStep = -1;
              this.updateNotices((byte) 9);
            }
          }
        }
    }

    private final TrackerMusicDefinition selectMusic(byte guard) {
        Object var2 = null;
        int var3 = this.musicThemeIndex(true);
        TrackerMusicDefinition[] var4 = ObjectSpriteSet.field_d;
        if (var4 != null && var3 >= 0 && var4.length > var3 &&
          var4[var3] != null) {
          var2 = var4[var3];
        }
        if (guard >= -122) {
          this.laserGateSpans = (IntrusiveDeque) null;
        }
        if (this.selfDestructEffects != null) {
          TrackerMusicDefinition var5 = this.selfDestructEffects.b(true);
          if (var5 != null) {
            var2 = var5;
          }
        }
        return (TrackerMusicDefinition) (var2);
    }

    private final LevelObject findCargoContainer(boolean guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.levelObjects == null) {
          return null;
        }
        int var2 = this.levelObjects.size();
        int var3 = 0;
        if (guard) {
          return (LevelObject) null;
        }
        while (var2 > var3) {
          LevelObject var4 = (LevelObject) (this.levelObjects.elementAt(var3));
          if (var4.objectType == 1) {
            return var4;
          }
          var3++;
        }
        return null;
    }

    private final void showTntPickupMessage(int objectType, byte guard) {
        if (objectType != 5) {
          return;
        }
        String var3 = b.field_a;
        this.showHudMessage(guard ^ 101, var3);
        if (guard != -9) {
          int discarded$0 = this.greenComponent(-46, -122);
        }
    }

    private final void recordLevelResult(byte guard, int outcome) {
        if (aj.b(-100)) {
          return;
        }
        if (SelfDestructEffects.field_k) {
          return;
        }
        int var3 = this.flatLevelIndex(20824);
        if (guard >= -99) {
          this.easyMode = true;
        }
        if (var3 < 0) {
          return;
        }
        int var4 = this.activeSessionTicks / (Bzip2State.field_p + 1);
        if (var4 < 0) {
          return;
        }
        ua.a(var3, var4, outcome, 1);
    }

    private final void destroyLevelObjectAtPoint(int guard, int y, int x) {
        int var9;
        int var10 = EscapeVector.obfuscationControl;
        int var4 = -54 / ((guard - 18) / 38);
        for (int var5 = 0; this.levelObjects.size() > var5; var5++) {
          LevelObject var6 = (LevelObject) (this.levelObjects.elementAt(var5));
          if (var6.objectType != 6 &&
            var6.objectType != 7) {
            Sprite var7 = var6.collisionSprite;
            int var8 = var7.offsetY + var6.y;
            if (y >= var8 &&
              y < var7.height + var8) {
              for (var9 = var6.x + var7.offsetX; x > var9; var9 = var9 + this.worldWidth) {
              }
              while (x < var9) {
                var9 = var9 - this.worldWidth;
              }
              if (!((var7.width + var9) <= x) &&
                var7.pixels[(y - var8) * var7.width + (-var9 + x)] != 0) {
                this.destroyLevelObject(var6, -120, var5);
                return;
              }
            }
          }
        }
    }

    private final void drawSeekerMines(int cameraX, int cameraY, int guard) {
        boolean stackIn_8_0 = false;
        int var10 = EscapeVector.obfuscationControl;
        boolean var4 = (this.usesDynamicTerrain(8192));
        if (guard != 8) {
          return;
        }
        SeekerMine var5 = (SeekerMine) (this.seekerMines.first(false));
        while (true) {
          if (var5 == null) {
            return;
          }
          stackIn_8_0 = (null != var5.proximitySound &&
            (65536 & var5.proximitySound.field_r) != 0);
          boolean var6 = stackIn_8_0;
          int var7 = -16 + (var5.xQ16 >> 16) - cameraX;
          int stackIn_9_0 = -cameraY + (var5.yQ16 >> 16) - 16;
          int var8 = stackIn_9_0;
          while (-SelfDestructEffects.field_b.fullWidth < var7) {
            var7 = var7 - this.worldWidth;
          }
          for (var7 = var7 + this.worldWidth; 640 > var7; var7 = var7 + this.worldWidth) {
            Sprite var9 = Js5NetworkRequest.field_H;
            boolean stackIn_9_0Lifetime1 = var4;
            if (stackIn_9_0Lifetime1 &&
              null != TerrainMaskSupport.field_a) {
              var9 = TerrainMaskSupport.field_a;
            }
            var9.drawTransparent(8 + var7, var8 + 8);
            if (var6) {
              SelfDestructEffects.field_b.drawAdditive(var7, var8, 128);
            }
          }
          var5 = (SeekerMine) (this.seekerMines.next((byte) 70));
          continue;
        }
    }

    private final void accumulateShieldSpriteContacts(Sprite sprite, int y, int x, byte guard) {
        String stackIn_26_2 = null;
        int var19 = EscapeVector.obfuscationControl;
        try {
          x = x + sprite.offsetX;
          y = y + sprite.offsetY;
          int var5_int = -1 + x + sprite.width;
          int var6 = -1 + sprite.height + y;
          int var7 = this.shipXQ16 >> 5;
          int var9 = -53 % ((32 - guard) / 41);
          var7 = var7 + (this.worldWidth << 11);
          int var8 = this.shipYQ16 >> 5;
          int var10 = var7 - 24576;
          int var11 = -24576 + var8;
          int var12 = 24576 + var7;
          int var13 = var8 + 24576;
          var12 = var12 >> 11;
          var10 = var10 >> 11;
          var11 = var11 >> 11;
          if (var10 < x) {
            var10 = x;
          }
          if (var5_int < var12) {
            var12 = var5_int;
          }
          var13 = var13 >> 11;
          if (var11 < y) {
            var11 = y;
          }
          if (var6 < var13) {
            var13 = var6;
          }
          int var14 = var11;
          while (true) {
            int stackIn_13_0 = var14;
            int stackIn_13_1 = var13;
            if (stackIn_13_0 > stackIn_13_1) {
              return;
            }
            for (int var15 = var10; var12 >= var15; var15++) {
              int var16 = (var15 << 11) - var7;
              int var17 = -var8 + (var14 << 11);
              int var18 = var16 * var16 + var17 * var17;
              int stackIn_13_0Lifetime1 = var18;
              int stackIn_13_1Lifetime1 = 603979776;
              if (stackIn_13_0Lifetime1 < stackIn_13_1Lifetime1 &&
                sprite.pixels[-x + ((var14 - y) * sprite.width + var15)] != 0) {
                this.collisionNormalX = this.collisionNormalX + var16;
                this.collisionNormalY = this.collisionNormalY + var17;
              }
            }
            var14++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var5;
          StringBuilder stackIn_25_1 = new StringBuilder().append("oe.NC(");
          if (sprite == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(y).append(',').append(x).append(',').append(guard).append(')').toString());
        }
    }

    private final void checkCampaignAchievements(int guard) {
        this.checkSimulatorCampaignAchievement((byte) 102);
        this.checkRetributionCampaignAchievement(-33);
        if (guard != 0) {
          Sprite var3 = (Sprite) null;
          boolean discarded$0 = this.spriteOverlapsTerrainColumns((Sprite) null, -1, 116, -120, 58, 99, 61, 108);
        }
    }

    private final void drawTerrainBase(int cameraY, int cameraX, byte guard) {
        int var10 = EscapeVector.obfuscationControl;
        if (EmailValidationError.field_a[this.terrainTheme] == null) {
          return;
        }
        if (guard >= -53) {
          LevelObject discarded$0 = this.findCargoContainer(false);
        }
        while (cameraX < 0) {
          cameraX = cameraX + this.worldWidth;
        }
        int var4 = 31 + cameraX >> 5;
        int var5 = cameraY + 31 >> 5;
        int var6 = 640 + cameraX >> 5;
        int var7 = 480 + cameraY >> 5;
        int var8 = (var4 << 5) - cameraX;
        if (var8 > 0) {
          this.drawTerrainBaseColumn(-var8 + 32, cameraY, var4 - 1, 1395798865, cameraX, var5, var7, 32);
        }
        for (int var9 = var4; var9 < var6; var9++) {
          this.drawTerrainBaseColumn(0, cameraY, var9, 1395798865, cameraX, var5, var7, 32);
        }
        int var9Lifetime1 = -var8 + 640 & 31;
        if (0 < var9Lifetime1) {
          this.drawTerrainBaseColumn(0, cameraY, var6, 1395798865, cameraX, var5, var7, var9Lifetime1);
        }
    }

    private final void applyEngineBoostPickup(boolean guard, int objectType) {
        if (objectType != 11) {
          return;
        }
        this.thrustAccelerationQ16 = 2550;
        bh.c(-64);
        if (guard) {
          this.bulletCapacity = -101;
        }
        this.showHudMessage(113, oh.field_g);
    }

    private final void tileParallaxLayer(boolean repeatVertically, boolean fillBottom, int guard, Sprite sprite, int y, int x) {
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (sprite == null) {
            return;
          }
          y -= 48;
          scanLoop1: while (y < 480) {
            while (true) {
              int stackIn_17_0 = ~x;
              int stackIn_17_1 = -1;
              if (stackIn_17_0 < stackIn_17_1) {
                x = x - sprite.fullWidth;
                continue;
              }
              while (x < 640) {
                sprite.drawTransparent(x, y);
                x = x + sprite.fullWidth;
              }
              y = y + sprite.fullHeight;
              if (!repeatVertically) {
                break;
              }
              continue scanLoop1;
            }
            break;
          }
          if (fillBottom &&
            480 > y) {
            int var7_int = sprite.pixels[(-1 + sprite.height) * sprite.width];
            SoftwareRasterizer.fillRectangle(0, y, 640, 480 - y, var7_int);
          }
          int stackIn_17_0Lifetime1 = guard;
          int stackIn_17_1Lifetime1 = 66;
          if (stackIn_17_0Lifetime1 < stackIn_17_1Lifetime1) {
            GameplaySession.resetSessionMenuState((byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var7;
          StringBuilder stackIn_22_1 = new StringBuilder().append("oe.HD(").append(repeatVertically).append(',').append(fillBottom).append(',').append(guard).append(',');
          if (sprite == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(y).append(',').append(x).append(')').toString());
        }
    }

    private final void readShieldEnergy(int guard, DataInputStream input, int formatVersion) throws IOException {
        String stackIn_9_2 = null;
        try {
          if (formatVersion < 4) {
            this.initialShieldEnergy = 150;
          } else {
            this.initialShieldEnergy = input.readInt();
            if (this.initialShieldEnergy <= 0) {
              this.initialShieldEnergy = 150;
            }
          }
          int guardRemainder = -51 % ((10 - guard) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_8_0 = runtimeException;
          StringBuilder stackIn_8_1 = new StringBuilder().append("oe.HF(").append(guard).append(',');
          if (input == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(formatVersion).append(')').toString());
        }
    }

    private final void initializeLevelObjects(boolean buildTerrainRenderer, int guard) {
        int var8 = 0;
        int var9 = EscapeVector.obfuscationControl;
        this.laserGateCount = 0;
        this.laserGateDestroyed = false;
        int var3 = 0;
        scanLoop1: while (true) {
          int stackIn_2_0 = ~this.levelObjects.size();
          int stackIn_2_1 = ~var3;
          if (stackIn_2_0 < stackIn_2_1) {
            LevelObject var10 = (LevelObject) (this.levelObjects.elementAt(var3));
            var10.stampTerrain(true, this);
            int stackIn_17_0 = -7;
            int stackIn_17_1 = ~var10.objectType;
            if (stackIn_17_0 == stackIn_17_1) {
              for (int var5_int = 0; var5_int < this.levelObjects.size(); var5_int++) {
                LevelObject var6 = (LevelObject) (this.levelObjects.elementAt(var5_int));
                stackIn_2_0 = -8;
                stackIn_2_1 = ~var6.objectType;
                if (stackIn_2_0 == stackIn_2_1 &&
                  var10.y == var6.y) {
                  int var7 = (20 + var10.x) % this.worldWidth;
                  for (var8 = var6.x; var7 > var8; var8 = var8 + this.worldWidth) {
                  }
                  this.addLaserGateSpan(var8, var10.y + 14, var7, 2134602960);
                  break;
                }
              }
            }
            var3++;
            continue scanLoop1;
          }
          break;
        }
        int var3Lifetime1 = -109 % ((-71 - guard) / 35);
        this.resetShipState((byte) -101);
        this.shieldPulsePhase = 0;
        this.laserCycleTicks = 0;
        int stackIn_17_0Lifetime1 = this.levelScore;
        int stackIn_17_1Lifetime1 = 128;
        td.a(stackIn_17_0Lifetime1, stackIn_17_1Lifetime1);
        this.levelScore = 0;
        if (this.timeHackMode) {
          this.elapsedTicks = this.levelStartTicks;
        }
        ThreeSliceButtonPainter.a(111, -this.collectedPowerupCount);
        ReflectionCheck.a(-this.destructionAchievementCount, (byte) 44);
        this.destructionAchievementCount = this.previousLevelDestructionCount;
        this.collectedPowerupCount = this.previousLevelPowerupCount;
        ThreeSliceButtonPainter.a(77, this.previousLevelPowerupCount);
        ReflectionCheck.a(this.previousLevelDestructionCount, (byte) 44);
        if (0 <= this.levelIndex) {
          this.shieldUsedThisLevel = false;
        }
        this.exhaustParticles = this.createExhaustCloud(512, -22944);
        if (this.usesDynamicTerrain(8192) &&
          buildTerrainRenderer) {
          this.dynamicTerrain = new DynamicTerrainRenderer(this.terrainMasks, QuickChatPhraseDefinition.fullTileMask, (int[]) null, this.tilesWide, this.tilesHigh);
          SeekerMine.a(-101, this.dynamicTerrain.field_B);
        } else {
          this.dynamicTerrain = null;
        }
        this.activateCountdown(-75, 3);
        this.showObjectiveMessage(false);
        LevelObject var4 = this.findCargoContainer(false);
        this.minimap = new Minimap(this, var4, gj.a(this.levelIndex, this.gameMode, (byte) 54));
        this.applyInitialPowerups((byte) 0);
        en var5 = TrackerMusicDefinition.field_f;
        if (var5 != null) {
          var5.a((byte) 36);
        }
        return;
    }

    private final void destroySeekerMine(SeekerMine mine, int guard) {
        try {
          if (null != mine.flightSound) {
            pl.field_n.removeSubstream(mine.flightSound);
            pl.field_n.removeSubstream(mine.proximitySound);
            mine.proximitySound = null;
            mine.flightSound = null;
          }
          if (guard != 5) {
            this.bullets = (IntrusiveDeque) null;
          }
          this.spawnExplosion(125, mine.yQ16, MarkerSliderPainter.field_d, mine.xQ16);
          mine.unlink((byte) -11);
          this.recordDestructionForAchievement((byte) -128);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.RC(" + (mine != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void awardAchievement(int gameMode, boolean guard, int achievementId, int checksum) {
        if (guard) {
          this.noticeSprite = (Sprite) null;
        }
        if (TrackerMusicDefinition.field_f.a((byte) 54, checksum, achievementId, gameMode)) {
          int fieldTemp$0 = this.pendingAchievementCount;
          this.pendingAchievementCount = this.pendingAchievementCount + 1;
          this.pendingAchievementIds[fieldTemp$0] = achievementId;
        }
    }

    private final LevelObject readLevelObjectFlags(DataInputStream input, int x, int formatVersion, boolean guard, int objectType, int y, int objectId) throws IOException {
        String stackIn_23_2 = null;
        LevelObject object = null;
        try {
          int targetFlag = input.readByte();
          boolean targetFlagPresent = !(targetFlag == 0);
          boolean missionTarget = targetFlagPresent;
          boolean triggersCountdown = false;
          if (guard) {
            this.leftLandingContact = false;
          }
          if (formatVersion >= 6) {
            int countdownFlag = input.readByte();
            boolean countdownFlagPresent = !(countdownFlag == 0);
            triggersCountdown = countdownFlagPresent;
          }
          if (formatVersion >= 9) {
            int spriteFrame = input.readInt();
            object = new LevelObject(objectId, objectType, x, y, (missionTarget), (triggersCountdown), spriteFrame);
          } else {
            object = new LevelObject(objectId, objectType, x, y, (missionTarget), (triggersCountdown));
          }
          if (missionTarget) {
            if (null == this.missionTargets) {
              this.missionTargets = new IntrusiveDeque();
              this.pendingTargetEffects = new SecondaryIntrusiveDeque();
            }
            this.missionTargets.addLast(-12328, object);
          }
          LevelObject decodedObject = object;
          return decodedObject;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var8_ref;
          StringBuilder stackIn_22_1 = new StringBuilder().append("oe.EA(");
          if (input == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(x).append(',').append(formatVersion).append(',').append(guard).append(',').append(objectType).append(',').append(y).append(',').append(objectId).append(')').toString());
        }
    }

    private final int countdownColor(byte guard, int period, int normalColor, int expiredColor) {
        if (!this.countdownActive) {
          return normalColor;
        }
        if (this.countdownTicks <= 0) {
          return expiredColor;
        }
        int var5 = this.countdownTicks % period;
        period = period / 2;
        if (var5 < period) {
          int var6 = expiredColor;
          expiredColor = normalColor;
          normalColor = var6;
        }
        var5 = this.countdownTicks % period;
        if (guard < 72) {
          return -91;
        }
        int var6Lifetime1 = this.redComponent(expiredColor, 30351) - this.redComponent(normalColor, 30351);
        int var7 = this.greenComponent(expiredColor, 16082) - this.greenComponent(normalColor, 16082);
        int var8 = this.blueComponent(-99, expiredColor) - this.blueComponent(87, normalColor);
        int var9 = this.redComponent(normalColor, 30351) + var6Lifetime1 * var5 / period;
        int var10 = var7 * var5 / period + this.greenComponent(normalColor, 16082);
        int var11 = var5 * var8 / period + this.blueComponent(-128, normalColor);
        return this.packRgb(var11, var9, true, var10);
    }

    private final boolean pointInsideShield(int x, int guard, int y) {
        int var11 = EscapeVector.obfuscationControl;
        int var4 = this.shipXQ16 >> 5;
        var4 = var4 + (this.worldWidth << 11);
        int var5 = this.shipYQ16 >> 5;
        int var6 = -24576 + var4;
        int var7 = -24576 + var5;
        int var8 = 24576 + var4;
        y = y << 11;
        int var9 = var5 + 24576;
        if (guard != 32) {
          this.fatalHullContact = true;
        }
        for (x = x << 11; x < var6; x = x + (this.worldWidth << 11)) {
        }
        if (var8 >= x &&
          var7 <= y) {
          if (y > var9) {
            return false;
          }
          x = x - var4;
          y = y - var5;
          int var10 = y * y + x * x;
          return !(var10 >= 603979776);
        }
        return false;
    }

    private final void installLevelBytes(boolean buildTerrainRenderer, byte[] bytes, boolean guard) {
        try {
          if (!guard) {
            this.queueRetrievalChapterIntro(-93);
          }
          this.resetSessionEffects(24661, buildTerrainRenderer);
          this.decodeLevelBytes(bytes, 100);
          this.initializeLevelObjects(buildTerrainRenderer, -119);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.A(" + buildTerrainRenderer + ',' + (bytes != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    private final int[] terrainTile(int tileY, int guard, int tileX) {
        int[] stackIn_7_0 = null;
        if (guard != -1) {
          return (int[]) null;
        }
        if (tileY < 0) {
          return null;
        }
        if (tileY >= this.tilesHigh) {
          stackIn_7_0 = QuickChatPhraseDefinition.fullTileMask;
        } else {
          stackIn_7_0 = this.terrainMasks[this.tilesWide * tileY + tileX % this.tilesWide];
        }
        return stackIn_7_0;
    }

    private final void queueRetributionChapterIntro(int guard) {
        if (this.gameMode != 2) {
          return;
        }
        Sprite[] var12 = SpriteCheckboxPainter.field_c;
        if (this.levelIndex == 0) {
          LevelObject.a(2, (byte) -116);
        }
        if (guard >= -13) {
          int[] var6 = (int[]) null;
          boolean discarded$0 = this.maskPixelIsSolid((int[]) null, 7, (byte) -46, -81);
        }
        if (0 == this.levelIndex) {
          int[] var32 = uj.field_e;
          String[] var13 = lh.field_c;
          DialogueScreen var14 = new DialogueScreen(var32, var12, var13, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var14);
        }
        if (4 == this.levelIndex) {
          int[] var33 = p.field_j;
          String[] var16 = HudMessage.field_j;
          DialogueScreen var17 = new DialogueScreen(var33, var12, var16, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var17);
        }
        if (this.levelIndex == 8) {
          int[] var34 = ha.field_e;
          String[] var19 = pc.field_b;
          DialogueScreen var20 = new DialogueScreen(var34, var12, var19, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var20);
        }
        if (this.levelIndex == 12) {
          int[] var35 = w.field_bb;
          String[] var22 = vd.field_i;
          DialogueScreen var23 = new DialogueScreen(var35, var12, var22, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var23);
        }
    }

    private final void updatePointCloudEffects(boolean guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (!guard) {
          this.drawTutorialForeground(-35, -120, (byte) -53);
        }
        PointCloudEffect var2 = (PointCloudEffect) (this.pointCloudEffects.first(false));
        while (var2 != null) {
          if (!var2.field_B) {
            var2.a();
          } else {
            var2.unlink((byte) -71);
          }
          var2 = (PointCloudEffect) (this.pointCloudEffects.next((byte) 70));
        }
        this.removeFinishedTargetEffect(-20320);
    }

    private final void leaveSession(int guard) {
        this.detachSessionAudio(72);
        dh.field_b = BoundedRandomAccessFile.activeSession.gameMode;
        BoundedRandomAccessFile.activeSession = null;
        pl.field_q = new t();
        GameplaySession.resetSessionMenuState((byte) -28);
        mj.field_d = guard;
        if (aj.b(-89) && (null != IntValueNode.field_i ||
          TrackerMusicDefinition.field_f.b(-49) ||
          ua.field_c.d(17523))) {
          PacketBuffer.field_h = true;
          di.field_d = new wc(2);
          di.field_d.a(gb.a(dh.field_d, UiContainer.field_y, 8158), true, 4767999);
          boolean decompiledFrameRemainder0 = false;
        }
        else {
          ci.a(0);
        }
        gi.a((byte) -77);
    }

    private final void detonateRockBuster(RockBuster projectile, int guard) {
        pl.field_n.removeSubstream(projectile.flightSound);
        projectile.flightSound = null;
        if (guard < 7) {
          return;
        }
        try {
          this.spawnExplosion(123, projectile.yQ16, td.field_c, projectile.xQ16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.MC(" + (projectile != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    private final void applyShieldPickup(int objectType, byte guard) {
        if (9 != objectType) {
          return;
        }
        this.shieldEnergy = this.shieldEnergy + 150;
        if (guard > -107) {
          this.detachSessionAudio(105);
        }
        if (this.shieldEnergy >= 500) {
          this.shieldEnergy = 500;
        }
        this.showHudMessage(-116, qh.field_e);
    }

    private final void drawTutorialCavernBackground(int cameraY, int guard, int cameraX) {
        int var9 = EscapeVector.obfuscationControl;
        if (guard != -7778) {
          boolean discarded$1 = this.areMissionTargetsDestroyed(-71);
        }
        if (this.levelIndex < 0) {
          Sprite var10 = CipherPacketBuffer.field_n;
          if (var10 == null) {
            return;
          }
          int var5 = (cameraX >> 3) - cameraX;
          int var6 = (cameraY >> 3) - cameraY;
          var6 += 240;
          if (var6 > 0) {
            SoftwareRasterizer.setClip(0, var6, 640, 480);
          }
          boolean var7 = false;
          while (true) {
            if (0 < var5) {
              boolean stackIn_18_0 = var7;
              boolean stackIn_16_0 = !((stackIn_18_0));
              var7 = stackIn_16_0;
              var5 = var5 - var10.fullWidth;
              continue;
            }
            break;
          }
          int stackIn_18_0Lifetime1 = var6;
          int var8 = stackIn_18_0Lifetime1;
          while (var5 < 640) {
            if (var7) {
              var6 = var6 - var10.fullHeight / 2;
            }
            while (var6 < 480) {
              var10.drawTransparent(var5, var6);
              var6 = var6 + var10.fullHeight;
            }
            var5 = var5 + var10.fullWidth;
            boolean stackIn_28_0 = !((var7));
            var7 = stackIn_28_0;
            var6 = var8;
          }
          SoftwareRasterizer.resetClip();
        }
    }

    private final void applyInitialPowerups(byte guard) {
        int var8 = EscapeVector.obfuscationControl;
        if (this.initialPowerups == null) {
          return;
        }
        if (this.initialPowerups.isEmpty(-97)) {
          return;
        }
        int var2 = 9;
        int var3 = 5 + (var2 - 1);
        int var4 = -54 / ((guard - 75) / 48);
        IntrusiveNode var5 = this.initialPowerups.first(false);
        while (var5 != null) {
          IntValueNode var6 = (IntValueNode) (var5);
          int var7 = var6.value;
          if (var7 >= var2 &&
            var3 >= var7) {
            this.applyPowerup(-122, var7);
          }
          var5 = this.initialPowerups.next((byte) 70);
        }
    }

    private final void readCountdown(int formatVersion, int guard, DataInputStream input) throws IOException {
        String stackIn_9_2 = null;
        try {
          if (formatVersion < 6) {
            this.countdownActive = false;
            this.countdownTicks = 0;
            this.countdownTrigger = 0;
          } else {
            this.countdownTrigger = input.readUnsignedByte();
            this.countdownTicks = input.readInt();
            this.countdownActive = false;
          }
          this.sessionGuardNoOp(guard + 29079);
          if (guard != -8277) {
            this.rightLandingContact = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("oe.TF(").append(formatVersion).append(',').append(guard).append(',');
          if (input == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_xb = null;
        if (guard != 69) {
          field_cc = (String) null;
        }
        field_cc = null;
    }

    private final int packRgb(int blue, int red, boolean guard, int green) {
        if (!guard) {
          return -55;
        }
        green = green << 8;
        red = red << 16;
        int var5 = red & 16711680;
        var5 = var5 | green & 65280;
        var5 = var5 | 255 & blue;
        return var5;
    }

    private final void drawLevelTitle(int guard, int cameraY) {
        if (guard <= ~this.levelTitleTicks) {
          return;
        }
        mj.field_b.bindAsFramebuffer();
        SoftwareRasterizer.clearFramebuffer();
        String var3 = TrackerMusicDefinition.a((byte) 120, this.gameMode, this.levelIndex);
        fh.field_g.drawCentered(var3, 160, 22, 7899280, -1);
        md.field_D.a(126);
        cf.a(mj.field_b, true, 1);
        mj.field_b.addOutline(5267536);
        int var4 = this.levelTitleTicks;
        if (var4 > 128) {
          var4 = 128;
        }
        mj.field_b.drawScaledAlpha(-mj.field_b.fullWidth + 320, (-cameraY >> 3) + 40 - 44, 2 * mj.field_b.fullWidth, mj.field_b.fullHeight * 2, var4);
    }

    private final void removeLaserGateSpan(LaserGateSpan gate, byte guard) {
        try {
          gate.unlink((byte) -25);
          if (guard <= 10) {
            this.transitionTicks = -106;
          }
          this.laserGateDestroyed = true;
          this.laserGateCount = this.laserGateCount - 1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.E(" + (gate != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void resetSessionMenuState(byte guard) {
        wa.field_c = new IntrusiveDeque();
        QuickChatPhraseDefinition.field_u = new IntrusiveDeque();
        mh.field_e = 0;
        EmailSyntaxValidator.field_q = 6324320;
        int var1 = -7 / ((70 - guard) / 32);
    }

    private final void spawnExplosion(int guard, int y, PcmSample sound, int x) {
        String stackIn_6_2 = null;
        try {
          boolean var5_int = (this.usesDynamicTerrain(8192));
          PointCloudEffect var6 = MouseInputHandler.createExplosionCloud(y, x, (var5_int), true, sound);
          this.pointCloudEffects.addLast(-12328, var6);
          if (guard <= 120) {
            byte[] var7 = (byte[]) null;
            this.installLevelBytes(true, (byte[]) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var5;
          StringBuilder stackIn_5_1 = new StringBuilder().append("oe.LD(").append(guard).append(',').append(y).append(',');
          if (sound == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(x).append(')').toString());
        }
    }

    private final void destroyLevelObject(LevelObject object, int guard, int objectIndex) {
        String stackIn_16_2 = null;
        try {
          object.removeFromTerrain(this, (byte) 76);
          PointCloudEffect var6 = this.spawnObjectDebris(object, (byte) 42);
          this.levelObjects.removeElementAt(objectIndex);
          if (!this.shipDestroyed) {
            int var5 = ResourceArchive.objectScore(this.gameMode, object.objectType, -2);
            this.levelScore = this.levelScore + var5;
            v.a(8, var5);
          }
          int var5Lifetime1 = 33 % ((6 - guard) / 44);
          if (1 == object.objectType) {
            this.markCargoLost(0);
          } else if (9 > object.objectType &&
            object.objectType != 5) {
            this.recordDestructionForAchievement((byte) -117);
          }
          this.recordMissionTargetDestroyed(object, var6, -2);
          this.recordInfrastructureDestroyed((byte) 124, object);
          if (this.minimap != null) {
            this.minimap.a(object, 4236);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("oe.B(");
          if (object == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(objectIndex).append(')').toString());
        }
    }

    private final boolean areMissionTargetsDestroyed(int guard) {
        if (guard <= 90) {
          return true;
        }
        boolean stackIn_8_0 = (!this.shipDestroyed) && (this.missionTargets != null) && (this.missionTargets.isEmpty(-128)) && (this.pendingTargetEffects.isEmpty(-182442704));
        return stackIn_8_0;
    }

    final void updateMusic(boolean force, int guard) {
        if (guard != 0) {
          return;
        }
        TrackerMusicDefinition var3 = this.selectMusic((byte) -123);
        int var4 = this.selectMusicVolume(-68661304);
        boolean var5 = (this.shouldLoopMusic((byte) -48));
        if (var3 != null &&
          var4 >= 0 && (this.currentMusic != var3 ||
          force)) {
          TerrainMap.a(var4, var3, (var5), (byte) -93);
          this.currentMusicVolume = var4;
          this.currentMusic = var3;
        }
        this.updateMusicFade(86);
    }

    private final void checkSimulatorCampaignAchievement(byte guard) {
        if (this.gameMode != 3) {
          return;
        }
        if (ua.field_c == null) {
          return;
        }
        if (!ua.field_c.a(this.gameMode, false)) {
          return;
        }
        int var3 = 29;
        if (guard != 102) {
          this.updateSession(-34);
        }
        int var4 = 255 ^ var3;
        this.awardAchievement(this.gameMode, false, var3, var4);
    }

    private final boolean hasShipReachedExit(boolean guard) {
        if (!guard) {
          this.bullets = (IntrusiveDeque) null;
        }
        boolean stackIn_6_0 = (!this.shipDestroyed) && (-16777216 > this.shipYQ16);
        return stackIn_6_0;
    }

    final void renderSession(int guard) {
        boolean stackIn_91_0 = false;
        int var11 = EscapeVector.obfuscationControl;
        if (!this.areTerrainAssetsReady((byte) 59)) {
          SoftwareRasterizer.clearFramebuffer();
          fh.field_g.drawCentered(this.terrainLoadingMessage(4251), 320, 250, 16777215, -1);
          return;
        }
        int var2 = this.usesDynamicTerrain(8192) ? 1 : 0;
        int var3 = (this.shipXQ16 >> 16) - 319;
        int var4 = (this.shipYQ16 >> 16) - 239;
        this.drawParallaxBackground(guard - 48, (this.shipXQ16 >> 16) + this.field_Kb, this.shipYQ16 >> 16);
        if (this.dynamicTerrain != null) {
          this.dynamicTerrain.renderTerrain(guard + 640, var3, var4);
        }
        this.drawTutorialForeground(var3, var4, (byte) -14);
        RockBuster var5_ref_pi = (RockBuster) (this.rockBusters.first(false));
        while (var5_ref_pi != null) {
          var5_ref_pi.exhaustParticles.a(guard ^ 97, var3, var4);
          var5_ref_pi = (RockBuster) (this.rockBusters.next((byte) 70));
        }
        this.exhaustParticles.a(82, var3, var4);
        PointCloudEffect var12 = (PointCloudEffect) (this.pointCloudEffects.first(false));
        while (var12 != null) {
          var12.a(99, var3, var4);
          var12 = (PointCloudEffect) (this.pointCloudEffects.next((byte) 70));
        }
        if (null == this.dynamicTerrain) {
          this.drawTerrainBase(var4, var3, (byte) -115);
          this.drawTerrainEdges(var4, guard + 8192, var3);
        }
        this.drawLevelObjects(11905, var3, var4);
        RockBuster var5_ref_piLifetime1 = (RockBuster) (this.rockBusters.first(false));
        while (var5_ref_piLifetime1 != null) {
          int stackIn_31_0 = var5_ref_piLifetime1.remainingFlightTicks;
          if (stackIn_31_0 != 0) {
            int var6 = (var5_ref_piLifetime1.xQ16 >> 16) + (-var3 + 1);
            int var7 = 1 + ((var5_ref_piLifetime1.yQ16 >> 16) - var4);
            while (var6 > -7) {
              var6 = var6 - this.worldWidth;
            }
            for (var6 = var6 + this.worldWidth; var6 < 647; var6 = var6 + this.worldWidth) {
              Sprite var8_ref_ed = ResourceArchive.field_m;
              stackIn_31_0 = var2;
              if (stackIn_31_0 != 0 &&
                ej.field_a != null) {
                var8_ref_ed = ej.field_a;
              }
              var8_ref_ed.drawCenteredRotatedScaled(var6, (byte) 34, 4096, -var5_ref_piLifetime1.angle256 << 8, var7);
            }
          }
          var5_ref_piLifetime1 = (RockBuster) (this.rockBusters.next((byte) 70));
        }
        int stackIn_31_0Lifetime1 = -1;
        if (stackIn_31_0Lifetime1 >= ~this.tetheredObjectType) {
          Sprite var5_ref_ed = mb.field_f[this.tetheredObjectType];
          if (var2 != 0 &&
            ArchiveProvider.field_b[this.tetheredObjectType] != null) {
            var5_ref_ed = ArchiveProvider.field_b[this.tetheredObjectType];
          }
          int var6Lifetime1 = (this.tetheredXQ16 - (var5_ref_ed.fullWidth << 15) >> 16) - var3;
          int var7Lifetime1 = (this.tetheredYQ16 - (var5_ref_ed.fullHeight << 15) >> 16) - var4;
          if (640 - this.worldWidth >> 1 > var6Lifetime1) {
            var6Lifetime1 = var6Lifetime1 + this.worldWidth;
          } else if (var6Lifetime1 >= (640 + this.worldWidth >> 1)) {
            var6Lifetime1 = var6Lifetime1 - this.worldWidth;
          }
          int var8 = var5_ref_ed.width;
          int var9 = var5_ref_ed.height;
          if (this.pickupAnimationTicks > 0) {
            var7Lifetime1 = this.pickupAnimationTicks * (-240 + var7Lifetime1) / 50 + 240;
            var9 = var9 * this.pickupAnimationTicks / 50;
            var8 = this.pickupAnimationTicks * var8 / 50;
            var6Lifetime1 = this.pickupAnimationTicks * (-320 + var6Lifetime1) / 50 + 320;
          }
          if (!this.shipDestroyed) {
            int var10 = 16777215;
            if (var2 != 0 &&
              this.dynamicTerrain != null) {
              var10 = this.dynamicTerrain.field_z;
            }
            SoftwareRasterizer.drawLine(320, 240, var6Lifetime1 + (var8 >> 1), var7Lifetime1 + (var9 >> 1), var10);
          }
          if (this.pickupAnimationTicks > 0) {
            var5_ref_ed.drawScaled(var6Lifetime1, var7Lifetime1, var8, var9);
          } else {
            var5_ref_ed.drawTransparent(var6Lifetime1, var7Lifetime1);
          }
        }
        if (!this.shipDestroyed) {
          this.renderShipHull(var4, (Sprite) null, 65793, var3);
          this.drawShieldGlow((byte) -110);
        }
        this.drawSeekerMines(var3, var4, 8);
        this.drawBullets(var3, var4, guard);
        this.drawLaserGates(var3, (byte) -108, var4);
        if (null != this.selfDestructEffects) {
          this.selfDestructEffects.a((byte) -87, var3, var4);
        }
        this.drawNotice(guard ^ -32369);
        if (this.levelIndex >= 0) {
          this.drawHudPanels(3);
        } else if (null == da.field_c &&
          !this.quitRequested) {
          ProgressQuery.a((byte) 57, ek.field_c, 320, 476);
        }
        if (da.field_c == null) {
          if (this.isMissionComplete((byte) -91)) {
            if (this.scoringEnabled &&
              0 <= this.levelIndex) {
              IntPoint.field_b.drawTransparent(640 - IntPoint.field_b.fullWidth >> 1, -IntPoint.field_b.fullHeight + 212);
              if (-100 > this.transitionTicks) {
                ValidationIndicator.a(266, 340, (byte) -106, en.field_e);
                EscapeVector.a(Integer.toString(this.levelScore), 340, 266, (byte) 110);
              }
              if (this.transitionTicks < -75) {
                ValidationIndicator.a(286, 340, (byte) -102, EmailAvailabilityValidator.field_s);
                EscapeVector.a(Integer.toString(this.fuel), 340, 286, (byte) -5);
              }
              if (this.transitionTicks < -50) {
                ValidationIndicator.a(306, 340, (byte) -116, DualLinkNode.field_g);
                EscapeVector.a(Integer.toString(this.shieldEnergy + this.shieldEnergy), 340, 306, (byte) -43);
              }
              ValidationIndicator.a(336, 340, (byte) 85, BoundedUrlRequest.field_c);
              EscapeVector.a(Integer.toString(this.score), 340, 336, (byte) 119);
            } else {
              IntPoint.field_b.drawTransparent(640 - IntPoint.field_b.fullWidth >> 1, 480 - IntPoint.field_b.fullHeight >> 1);
            }
          }
          this.drawGameOverOverlay((byte) -76);
          if (0 < this.hudMessageTicks &&
            this.hudMessageTicks <= 100) {
            fh.field_g.drawCenteredAlpha(this.hudMessageText, 320, 174 + (this.hudMessageTicks >> 1), 16777215, -1, (this.hudMessageTicks << 8) / 100);
          }
        }
        if (this.transitionTicks > 0) {
          if (!this.shipDestroyed && (!this.cargoLost ||
            this.levelIndex >= 0) && !this.levelEnded) {
            stackIn_91_0 = false;
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_91_0 = true;
          }
          boolean var5 = stackIn_91_0;
          gh.a(this.transitionTicks + 1, 256 - (this.transitionTicks << 2), (var5), (var5));
        }
        if (null != this.minimap &&
          this.minimap.b((byte) -122)) {
          this.minimap.a((byte) -120);
        }
        return;
    }

    final void finishPendingBonuses(byte guard) {
        int var2 = 92 % ((-5 - guard) / 38);
        if (this.transitionTicks < 0) {
          if (this.isMissionComplete((byte) -127) &&
            this.scoringEnabled &&
            this.levelIndex >= 0) {
            if (this.transitionTicks < -100) {
              this.score = this.score + this.levelScore;
              this.levelScore = 0;
              this.levelStartTicks = this.elapsedTicks;
            }
            if (-75 > this.transitionTicks) {
              this.score = this.score + this.fuel;
              v.a(8, this.fuel);
            }
            if (this.transitionTicks < -50) {
              this.score = this.score + (this.shieldEnergy + this.shieldEnergy);
              v.a(8, this.shieldEnergy + this.shieldEnergy);
            }
            this.updateCampaignBestScore(false);
          }
          this.transitionTicks = 0;
        }
    }

    private final void loadLevelStream(InputStream input, boolean option) throws IOException {
        try {
          this.decodeLevelStream(option, -1, input);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.TC(" + (input != null ? "{...}" : "null") + ',' + option + ')');
        }
    }

    private final void sessionGuardNoOp(int guard) {
        if (guard != 20802) {
          return;
        }
    }

    private final int redComponent(int packed, int guard) {
        if (guard != 30351) {
          return -77;
        }
        return (16711680 & packed) >> 16;
    }

    private final void destroyShip(byte guard) {
        if (this.easyMode) {
          return;
        }
        this.renderShipHull(0, ResourceArchive.field_a, 65793, 0);
        this.spawnSpriteDebris(0, -28311553, ResourceArchive.field_a, 0, IntrusiveNodeHashTable.field_a);
        if (this.tetheredObjectType >= 0) {
          if (this.pickupAnimationTicks > 0) {
            this.pickupAnimationTicks = 0;
            this.tetheredObjectType = -1;
          }
          pl.field_n.playSampleWithPan(bc.field_c, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
        }
        this.shipDestroyed = true;
        if (!this.timeHackMode &&
          this.levelIndex >= 0) {
          this.livesRemaining = this.livesRemaining - 1;
          jc.a(1);
          this.recordLevelResult((byte) -106, 0);
        }
        if (guard >= -34) {
          this.terrainTheme = 112;
        }
    }

    private final String formatSessionTime(boolean guard) {
        String var2 = "12:00:00+";
        if (!guard) {
          this.noticeSprite = (Sprite) null;
        }
        int var3 = this.elapsedTicks;
        if (this.countdownActive) {
          var3 = this.countdownTicks;
        }
        if (2160000 > this.elapsedTicks ||
          this.countdownActive) {
          int var4 = var3 / 50;
          int var5 = var4 / 60;
          var4 = var4 - var5 * 60;
          int var6 = var5 / 60;
          var5 = var5 - var6 * 60;
          var2 = var6 + ":" + var5 / 10 + var5 % 10 + ":" + var4 / 10 + var4 % 10;
        }
        return var2;
    }

    private final void drawLevelObjects(int guard, int cameraX, int cameraY) {
        int var4;
        int var6 = EscapeVector.obfuscationControl;
        if (guard != 11905) {
          this.checkCampaignAchievements(65);
        }
        if (this.levelIndex < 0 &&
          WeightedLruCache.field_c[5]) {
          for (var4 = -cameraX; var4 > -1024; var4 -= 1024) {
          }
          while (var4 < 640) {
            SoftwareRasterizer.intersectClip(0, 0, 448 + var4, 480);
            for (int var5 = 0; var5 < 512; var5 += 32) {
              wa.field_e.drawTransparent(var4 + var5, -cameraY);
            }
            AccountRegistrationPanel.field_T.drawTransparent(var4 + 224, -cameraY + 96);
            for (int var5Lifetime1 = 256; 512 > var5Lifetime1; var5Lifetime1 += 32) {
              mj.field_f.drawTransparent(var5Lifetime1 + var4, 96 - cameraY);
            }
            SoftwareRasterizer.resetClip();
            SoftwareRasterizer.intersectClip(var4 + 576, 0, 640, 480);
            for (int var5Lifetime2 = 512; 1024 > var5Lifetime2; var5Lifetime2 += 32) {
              wa.field_e.drawTransparent(var5Lifetime2 + var4, -cameraY);
            }
            for (int var5Lifetime3 = 512; var5Lifetime3 < 768; var5Lifetime3 += 32) {
              mj.field_f.drawTransparent(var5Lifetime3 + var4, 96 - cameraY);
            }
            GrowableIntList.field_h.drawTransparent(var4 + 768, 96 - cameraY);
            SoftwareRasterizer.resetClip();
            UiTheme.field_e.drawTransparent(var4 + 448, -cameraY);
            wa.field_b.drawTransparent(544 + var4, -cameraY);
            gm.field_a.drawTransparent(448 + var4, 288 - cameraY);
            gm.field_a.drawTransparent(448 + var4, -cameraY + 480);
            SoftwareRasterizer.intersectClip(0, 128 - cameraY, 640, 480);
            for (int var5Lifetime4 = 128; var5Lifetime4 < 1024; var5Lifetime4 += 32) {
              PacketBuffer.field_l.drawTransparent(var4 + 224, -cameraY + var5Lifetime4);
              cj.field_a.drawTransparent(768 + var4, -cameraY + var5Lifetime4);
            }
            SoftwareRasterizer.resetClip();
            ej.field_e.drawTransparent(var4 + 224, 1024 - cameraY);
            for (int var5Lifetime5 = 256; var5Lifetime5 < 768; var5Lifetime5 += 32) {
              EmailAvailabilityValidator.field_r.drawTransparent(var5Lifetime5 + var4, -cameraY + 1024);
            }
            MarkerSlider.field_G.drawTransparent(768 + var4, -cameraY + 1024);
            var4 += 1024;
          }
        }
        for (int var4Lifetime1 = 0; this.levelObjects.size() > var4Lifetime1; var4Lifetime1++) {
          LevelObject var7 = (LevelObject) (this.levelObjects.elementAt(var4Lifetime1));
          var7.drawObject(cameraY, (byte) 109, cameraX);
        }
    }

    private final void recordInfrastructureDestroyed(byte guard, LevelObject object) {
        if (object == null) {
          return;
        }
        if (!object.countsAsInfrastructure((byte) -5)) {
          return;
        }
        this.destroyedInfrastructureCount = this.destroyedInfrastructureCount + 1;
        if (this.initialInfrastructureCount != this.destroyedInfrastructureCount) {
          return;
        }
        try {
          ua.field_c.a((byte) -64, this.gameMode, ValidationIndicator.k(64), this.levelIndex);
          int var3_int = 90 % ((42 - guard) / 62);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oe.VF(" + guard + ',' + (object != null ? "{...}" : "null") + ')');
        }
    }

    private final void initialPowerupReadHook(int objectType, int guard) {
        int var3 = 71 % ((guard - 6) / 36);
    }

    private final void readSeekerMines(int formatVersion, DataInputStream input, byte guard) throws IOException {
        String stackIn_12_2 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          this.seekerMines = new IntrusiveDeque();
          if (formatVersion >= 1) {
            int mineCount = input.readUnsignedByte();
            for (int mineIndex = 0; mineIndex < mineCount; mineIndex++) {
              SeekerMine mine = new SeekerMine();
              int homeXQ16 = input.readUnsignedShort() << 16;
              mine.homeXQ16 = homeXQ16;
              mine.xQ16 = homeXQ16;
              int homeYQ16 = input.readUnsignedShort() << 16;
              mine.homeYQ16 = homeYQ16;
              mine.yQ16 = homeYQ16;
              mine.velocityXQ16 = (int)(32769.0 * Math.random()) - 16384;
              mine.velocityYQ16 = -16384 + (int)(32769.0 * Math.random());
              this.seekerMines.addLast(-12328, mine);
            }
          }
          if (guard != -17) {
            this.triShotEnabled = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var4;
          StringBuilder stackIn_11_1 = new StringBuilder().append("oe.GB(").append(formatVersion).append(',');
          if (input == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void resolveShieldImpact(int param0) {
        double var2 = (double)this.collisionNormalX;
        double var4 = (double)this.collisionNormalY;
        if (param0 > -123) {
          this.bulletCapacity = 85;
        }
        double var6 = 1.0 / Math.sqrt(var4 * var4 + var2 * var2);
        var2 = var2 * var6;
        var4 = var4 * var6;
        double var6Lifetime1 = (double)this.shipVelocityYQ16 * var4 + var2 * (double)this.shipVelocityXQ16;
        if (var6Lifetime1 > -32768.0) {
          if (524288.0 < var6Lifetime1) {
            this.destroyShip((byte) -50);
            if (!this.scoringEnabled) {
              return;
            }
            if (this.levelIndex < 0 &&
              33554432 <= this.shipYQ16) {
              this.awardAchievement(this.gameMode, false, 8, 247);
            }
            return;
          }
          var6Lifetime1 = (!(32768.0 < var6Lifetime1)) ? (var6Lifetime1 + 32768.0) : (2.0 * var6Lifetime1);
          this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 - var6Lifetime1 * var2);
          this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 - var6Lifetime1 * var4);
          int var8 = (int)var6Lifetime1 >> 4;
          if (var8 > 6144) {
            var8 = 6144;
          }
          pl.field_n.playSampleWithPan(co.field_d, 100, IterableNodeHashTable.field_c * var8 / 64, 8192);
        }
    }

    private final void updateMusicFade(int guard) {
        if (this.currentMusic == null) {
          return;
        }
        if (this.currentMusicVolume < 0) {
          return;
        }
        if ((!this.shipDestroyed ||
          this.livesRemaining != 0) &&
          (!this.isMissionComplete((byte) -113) ||
          !AgeValidator.a(this.levelIndex + 1, this.gameMode, true))) {
          if ((this.quitRequested ||
            this.advanceLevelRequested) && this.transitionTicks >= 0 && 32 >= this.transitionTicks) {
            wa.a((32 - this.transitionTicks) * this.currentMusicVolume / 32, 32471);
          }
        } else if (this.transitionTicks >= -64 &&
          this.transitionTicks <= 0) {
          wa.a(this.currentMusicVolume * -this.transitionTicks / 64, 32471);
        }
        if (guard < 28) {
          boolean discarded$0 = this.areMissionTargetsDestroyed(71);
        }
    }

    private final void drawTerrainEdgeColumn(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = EscapeVector.obfuscationControl;
        int[] var14 = new int[32];
        int[] var18 = var14;
        for (int var10 = param4; param7 > var10; var10++) {
          var14[var10] = SpriteCheckboxPainter.bitwiseAnd((param0 << 5) + var10, 255);
        }
        int var10Lifetime1 = 15 - param2 + (param1 << 5);
        int var11 = -param5 + ((param0 << 5) - 9600);
        if (param6 != 10943) {
          return;
        }
        if (var10Lifetime1 > 0) {
          var11 = this.drawTerrainEdgeTile(var11, param1 - 1, param7, false, 32, param4, -var10Lifetime1 + 32, param0, var18);
        }
        for (int var12 = param1; var12 < param3; var12++) {
          var11 = this.drawTerrainEdgeTile(var11, var12, param7, false, 32, param4, 0, param0, var18);
        }
        int var12Lifetime1 = param2 + 480 & 31;
        if (var12Lifetime1 > 0) {
          int discarded$0 = this.drawTerrainEdgeTile(var11, param3, param7, false, var12Lifetime1, param4, 0, param0, var18);
        }
    }

    private final void recordDestructionForAchievement(byte guard) {
        if ((this.scoringEnabled || this.easyMode) &&
          this.levelIndex >= 0 &&
          !this.shipDestroyed) {
          this.destructionAchievementCount = this.destructionAchievementCount + 1;
          CipherPacketBuffer.m(-45);
          if (this.destructionAchievementCount == 76) {
            this.awardAchievement(this.gameMode, false, 12, 243);
          }
        }
        if (guard >= -115) {
          this.noticeSprite = (Sprite) null;
        }
    }

    private final void drawLaserGates(int cameraX, byte guard, int cameraY) {
        int var12 = EscapeVector.obfuscationControl;
        if (this.laserCycleTicks < 50) {
          IntrusiveNode var4 = this.laserGateSpans.first(false);
          int var5 = 0;
          while (true) {
            int stackIn_3_0 = this.laserGateCount;
            int stackIn_3_1 = var5;
            if (stackIn_3_0 <= stackIn_3_1) {
              break;
            }
            LaserGateSpan var6 = (LaserGateSpan) (var4);
            int var7 = var6.y - cameraY;
            int stackIn_26_0 = -1;
            int stackIn_26_1 = var7;
            if (stackIn_26_0 <= stackIn_26_1 &&
              var7 < 481) {
              int var8 = var6.leftX - cameraX;
              int var9 = var6.rightX - cameraX;
              while (0 < var9) {
                var9 = var9 - this.worldWidth;
                var8 = var8 - this.worldWidth;
              }
              var9 = var9 + this.worldWidth;
              var8 = var8 + this.worldWidth;
              while (var8 < 640) {
                int stackIn_3_0Lifetime1 = ~var8;
                int stackIn_3_1Lifetime1 = -1;
                int stackIn_17_0 = (stackIn_3_0Lifetime1 > stackIn_3_1Lifetime1) ? 0 : var8;
                int var10 = stackIn_17_0;
                int stackIn_20_0 = (var9 > 640) ? 640 : var9;
                int var11 = stackIn_20_0;
                while (var10 < var11) {
                  SoftwareRasterizer.addPixel(var10, var7, 16744512);
                  SoftwareRasterizer.addPixel(var10, var7 - 1, 8396804);
                  SoftwareRasterizer.addPixel(var10, 1 + var7, 8396804);
                  var10++;
                }
                var8 = var8 + this.worldWidth;
                var9 = var9 + this.worldWidth;
              }
            }
            var5++;
            var4 = var4.next;
          }
        }
        int stackIn_26_0Lifetime1 = guard;
        int stackIn_26_1Lifetime1 = -108;
        if (stackIn_26_0Lifetime1 != stackIn_26_1Lifetime1) {
          byte[] var13 = (byte[]) null;
          this.installLevelBytes(true, (byte[]) null, true);
        }
    }

    private final void readInitialPowerups(DataInputStream input, int formatVersion, byte guard) throws IOException {
        String stackIn_15_2 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          this.initialPowerups = new IntrusiveDeque();
          if (formatVersion < 7) {
            return;
          }
          int guardRemainder = 28 % ((guard + 29) / 46);
          int powerupCount = input.readUnsignedByte();
          if (0 == powerupCount) {
            return;
          }
          for (int powerupIndex = 0; powerupIndex < powerupCount; powerupIndex++) {
            int objectType = input.readUnsignedByte();
            if (ResourceArchive.isPowerupType(objectType, -64)) {
              IntValueNode powerup = new IntValueNode(objectType);
              this.initialPowerups.addLast(-12328, powerup);
              this.initialPowerupReadHook(objectType, 101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("oe.HB(");
          if (input == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(formatVersion).append(',').append(guard).append(')').toString());
        }
    }

    private final void readObjectiveType(int formatVersion, DataInputStream input, byte guard) throws IOException {
        String stackIn_13_2 = null;
        try {
          if (5 > formatVersion) {
            this.objectiveType = 0;
          } else {
            this.objectiveType = input.readUnsignedByte();
            if (this.objectiveType != 0 &&
              this.objectiveType != 1) {
              this.objectiveType = 0;
            }
          }
          if (guard < 28) {
            int discarded$0 = this.packRgb(-118, -50, true, 65);
          }
          this.objectiveTypeReadHook(-15474);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oe.WA(").append(formatVersion).append(',');
          if (input == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void drawNotice(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (guard != -32369) {
          this.quitRequested = true;
        }
        if (this.noticeTicks > 0) {
          int var2 = -(this.noticeSprite.fullWidth / 2) + 320;
          if (this.noticeTicks < 31) {
            if (null == da.field_c &&
              !this.quitRequested) {
              ResourceArchive.drawSpriteWithRowJitter(4, var2, 31 - this.noticeTicks, this.noticeSprite, -99);
            }
          } else if (this.noticeTicks <= 120) {
            AudioService.a(-this.noticeSprite.fullWidth, this.noticeSprite.pixels, 0, -this.noticeSprite.fullWidth + SoftwareRasterizer.width, (byte) -126, 0, 0, -this.noticeSprite.fullHeight, SoftwareRasterizer.pixels, 3 * SoftwareRasterizer.width + (-1 + var2));
            AudioService.a(-this.noticeSprite.fullWidth, this.noticeSprite.pixels, 0, -this.noticeSprite.fullWidth + SoftwareRasterizer.width, (byte) -84, 0, 0, -this.noticeSprite.fullHeight, SoftwareRasterizer.pixels, var2 + 1 + 3 * SoftwareRasterizer.width);
            AudioService.a(-this.noticeSprite.fullWidth, this.noticeSprite.pixels, 0, -this.noticeSprite.fullWidth + SoftwareRasterizer.width, (byte) -100, 0, 0, -this.noticeSprite.fullHeight, SoftwareRasterizer.pixels, -1 + (var2 + 5 * SoftwareRasterizer.width));
            AudioService.a(-this.noticeSprite.fullWidth, this.noticeSprite.pixels, 0, SoftwareRasterizer.width - this.noticeSprite.fullWidth, (byte) -81, 0, 0, -this.noticeSprite.fullHeight, SoftwareRasterizer.pixels, 1 + (var2 + 5 * SoftwareRasterizer.width));
            this.noticeSprite.drawTransparent(var2, 4);
          } else if (da.field_c == null &&
            !this.quitRequested) {
            ResourceArchive.drawSpriteWithRowJitter(4, var2, -120 + this.noticeTicks, this.noticeSprite, -123);
          }
        }

    }

    private final int musicThemeIndex(boolean guard) {
        if (!guard) {
          SeekerMine var3 = (SeekerMine) null;
          this.destroySeekerMine((SeekerMine) null, 48);
        }
        int var2 = this.terrainTheme;
        if (var2 == 0) {
          return 0;
        }
        if (var2 == 2) {
          return 1;
        }
        if (var2 == 1) {
          return 2;
        }
        if (var2 == 3) {
          return 3;
        }
        if (var2 == 4) {
          return 4;
        }
        if (var2 == 5) {
        }
        return 0;
    }

    final void updateSession(int guard) {
        int stackIn_228_2 = 0;
        int stackIn_231_2 = 0;
        int stackIn_247_3;
        int stackIn_260_0 = 0;
        int stackIn_543_0 = 0;
        int stackIn_543_1 = 0;
        int[] stackIn_586_0 = null;
        int stackIn_718_2 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6_double = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var10_double = 0.0;
        int var12 = 0;
        int var13_int = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var9Lifetime3;
        int var24Lifetime1;
        Object var32 = null;
        Object var33 = null;
        Object var34 = null;
        Object var37 = null;
        Object var40 = null;
        Object var21_ref = null;
        Object var22 = null;
        Object var29 = null;
        Object var44 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        if (this.dynamicTerrain != null) {
          pf.e((byte) -106);
        }
        if (this.levelIndex < 0) {
          this.tutorialBackgroundPhase = -1 + this.tutorialBackgroundPhase & 1023;
        }
        if (this.minimap != null) {
          this.minimap.field_c = this.minimap.field_c + 1;
        }
        scanLoop1: while (true) {
          if (pn.p(-116)) {
            if (~PasswordValidator.field_n == ~of.field_c &&
              this.minimap != null) {
              this.minimap.e((byte) -101);
              if (this.minimap.b((byte) -107)) {
                this.stopSessionAudio((byte) -41);
              }
            }
            if (this.minimap != null &&
              this.minimap.b((byte) -114) &&
              PasswordValidator.field_n == 13) {
              this.minimap.e((byte) -101);
            }
            if (PasswordValidator.field_n == 13 && (!this.shipDestroyed ||
              this.livesRemaining != 0) && !this.quitRequested) {
              if (this.minimap.b((byte) -122)) {
                this.minimap.e((byte) -101);
              }
              this.stopSessionAudio((byte) -41);
              da.field_c = new tf();
              mj.field_d = 0;
              gi.a((byte) -56);
              return;
            }
            if (SelfDestructEffects.field_k &&
              PasswordValidator.field_n == 12) {
              this.transitionTicks = 63;
              this.tetheredObjectType = 1;
              this.levelEnded = true;
              this.shipDestroyed = false;
              this.scoringEnabled = false;
              System.out.println("Level skip cheat activated");
            }
            if (SelfDestructEffects.field_k &&
              PasswordValidator.field_n == 11) {
              boolean stackIn_35_1 = !(this.easyMode);
              this.easyMode = stackIn_35_1;
              boolean stackIn_38_1 = !(this.easyMode);
              this.scoringEnabled = stackIn_38_1;
              System.out.println("Easypeasy cheat activated");
            }
            if (!SelfDestructEffects.field_k) {
              continue;
            }
            int stackIn_82_0 = ~PasswordValidator.field_n;
            int stackIn_82_1 = -11;
            if (stackIn_82_0 != stackIn_82_1) {
              continue;
            }
            boolean stackIn_46_1 = !(this.timeHackMode);
            this.timeHackMode = stackIn_46_1;
            boolean stackIn_49_1 = !(this.timeHackMode);
            this.scoringEnabled = stackIn_49_1;
            System.out.println("Timehack checking cheat activated");
            continue;
          }
          if (this.minimap.b((byte) -110)) {
            return;
          }
          this.activeSessionTicks = this.activeSessionTicks + 1;
          if (!this.areTerrainAssetsReady((byte) 94)) {
            return;
          }
          this.updateHudMessage(0);
          if (this.levelTitleTicks > 0) {
            this.levelTitleTicks = this.levelTitleTicks - 1;
          }
          if (!this.shipDestroyed &&
            !this.levelEnded &&
            !this.quitRequested && (!this.cargoLost ||
            0 <= this.levelIndex)) {
            if (this.transitionTicks <= 0) {
              if (this.levelIndex < 0) {
                break scanLoop1;
              }
              if (2160000 <= this.elapsedTicks) {
                break scanLoop1;
              }
              this.elapsedTicks = this.elapsedTicks + 1;
              EmailSyntaxValidator.d(false);
              break scanLoop1;
            }
            if (this.transitionTicks == 64) {
              pl.field_n.playSampleWithPan(PcmResampler.field_g, 100, IterableNodeHashTable.field_c * 1024 / 64, 8192);
            }
            this.transitionTicks = this.transitionTicks - 1;
            if (0 == this.transitionTicks) {
              this.transitionTicks = -64;
            }
            this.stopSessionAudio((byte) -41);
            return;
          }
          if (this.quitRequested ||
            this.transitionTicks < 0 ||
            this.noticeTicks == 0 ||
            this.levelIndex < 0 &&
            this.pendingAchievementCount == 0 &&
            !this.showingAchievementNotice) {
            int stackIn_82_0Lifetime1 = -1;
            int stackIn_82_1Lifetime1 = ~this.transitionTicks;
            if (stackIn_82_0Lifetime1 == stackIn_82_1Lifetime1) {
              PcmSampleStream var31 = PcmSampleStream.createAtRatePercentQ6(PcmResampler.field_g, 100, IterableNodeHashTable.field_c * 1024 / 64, 8192);
              var31.playBackwardFromEnd();
              pl.field_n.addSubstream(var31);
            }
            this.transitionTicks = this.transitionTicks + 1;
          }
          if (this.isMissionComplete((byte) -61) &&
            this.scoringEnabled &&
            0 <= this.levelIndex) {
            if (this.transitionTicks == -100) {
              this.score = this.score + this.levelScore;
              this.levelStartTicks = this.elapsedTicks;
              this.levelScore = 0;
              pl.field_n.playSampleWithPan(pl.field_o, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            }
            if (this.transitionTicks == -75) {
              var2 = ei.a(0, this.fuel, this.gameMode);
              this.score = this.score + var2;
              v.a(8, var2);
              pl.field_n.playSampleWithPan(pl.field_o, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            }
            if (this.transitionTicks == -50) {
              var2 = ei.a(0, this.shieldEnergy * 2, this.gameMode);
              this.score = this.score + var2;
              v.a(8, var2);
              pl.field_n.playSampleWithPan(pl.field_o, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            }
            this.updateCampaignBestScore(false);
          }
          if (this.transitionTicks < 64) {
            if (!this.levelEnded &&
              !this.quitRequested) {
              break scanLoop1;
            }
            this.stopSessionAudio((byte) -41);
            this.updateNotices((byte) 9);
            return;
          }
          if ((this.shipDestroyed ||
            this.quitRequested) &&
            !this.advanceLevelRequested) {
            if (this.livesRemaining == 0 ||
              this.quitRequested) {
              if (this.levelIndex >= 0) {
                this.submitCampaignScore((byte) 36, this.score + this.levelScore, this.levelIndex);
              }
              this.leaveSession(0);
              return;
            }
          } else if (this.isMissionComplete((byte) -122) ||
            this.advanceLevelRequested) {
            this.quitRequested = false;
            this.levelIndex = this.levelIndex + 1;
            this.previousLevelDestructionCount = this.destructionAchievementCount;
            this.advanceLevelRequested = false;
            this.previousLevelPowerupCount = this.collectedPowerupCount;
            if (this.levelIndex == 2 ||
              (this.levelIndex & 3) == 0) {
              if (this.levelIndex == 0) {
                this.noticeTicks = 0;
                this.queueHudMessage(164, (byte) 55, TetherHumStream.field_n);
              }
              this.startSession((byte) -40);
            }
            if (this.levelData != null &&
              this.levelData.length == this.levelIndex) {
              this.submitCampaignScore((byte) -122, this.score, this.levelData.length);
              this.queueCampaignConclusion(-3);
              this.leaveSession(0);
              return;
            }
            this.levelTitleTicks = 314;
          }
          this.initializeCurrentLevel((byte) -110);
          return;

        }
        var2 = 0;
        while (var2 < 64) {
          boolean stackIn_137_0 = this.exhaustParticles.field_E[this.exhaustWriteIndex + var2];
          if (stackIn_137_0) {
            this.activeExhaustParticles = this.activeExhaustParticles - 1;
            this.exhaustParticles.field_E[this.exhaustWriteIndex + var2] = false;
          }
          var2++;
        }
        this.exhaustParticles.a();
        this.shieldPulsePhase = 15 & 1 + this.shieldPulsePhase;
        this.updatePointCloudEffects(true);
        boolean stackIn_137_0Lifetime1 = this.shipDestroyed;
        if (!stackIn_137_0Lifetime1) {
          if (!this.shipLanded) {
            if (ScoreSubmission.field_h[97] &&
              !ScoreSubmission.field_h[96]) {
              if (!this.leftLandingContact) {
                this.shipAngle256 = 252 & 7 + this.shipAngle256;
              } else {
                this.shipAngle256 = this.shipAngle256 + 2 & 255;
              }
            }
            this.shipVelocityYQ16 = this.shipVelocityYQ16 + this.gravityQ16;
            if (ScoreSubmission.field_h[96] &&
              !ScoreSubmission.field_h[97]) {
              if (!this.rightLandingContact) {
                this.shipAngle256 = -4 + this.shipAngle256 & 252;
              } else {
                this.shipAngle256 = -2 + this.shipAngle256 & 255;
              }
            }
          }
          if (ScoreSubmission.field_h[98] &&
            this.fuel > 0 &&
            0 == this.pickupAnimationTicks) {
            this.field_jb.setVolumeQ6(1024 * IterableNodeHashTable.field_c / 64);
            this.rightLandingContact = false;
            this.shipLanded = false;
            this.leftLandingContact = false;
            double var2_double = 0.02454369260617026 * (double)this.shipAngle256;
            this.shipVelocityXQ16 = this.shipVelocityXQ16 + (int)((double)this.thrustAccelerationQ16 * Math.sin(var2_double));
            this.shipVelocityYQ16 = this.shipVelocityYQ16 - (int)((double)this.thrustAccelerationQ16 * Math.cos(var2_double));
            if (this.levelIndex >= 0) {
              if (!this.easyMode) {
                this.fuel = this.fuel - 1;
              }
              ji.a(true, -1);
            }
            if (this.fuel == 0) {
              this.showHudMessage(-111, RatingQuery.field_l);
            }
            for (var4 = 0; var4 < 64; var4++) {
              this.exhaustParticles.field_E[this.exhaustWriteIndex + var4] = true;
              double var5_double = var2_double + 0.2 * Math.random() - 0.1;
              double var7_double = (double)this.thrustAccelerationQ16 * 616.8094117647058 * (0.5 + Math.random());
              int var9 = -(int)(var7_double * Math.sin(var5_double));
              int var10 = (int)(var7_double * Math.cos(var5_double));
              this.exhaustParticles.field_x[this.exhaustWriteIndex + var4] = this.shipXQ16 + this.shipVelocityXQ16;
              this.exhaustParticles.field_A[this.exhaustWriteIndex + var4] = this.shipYQ16 + this.shipVelocityYQ16;
              double var11_double = Math.random();
              this.exhaustParticles.field_y[var4 + this.exhaustWriteIndex] = (int)((double)var9 * var11_double);
              this.exhaustParticles.field_C[this.exhaustWriteIndex + var4] = (int)(var11_double * (double)var10);
              this.exhaustParticles.field_w[this.exhaustWriteIndex + var4] = 0;
              this.exhaustParticles.i(var4 + this.exhaustWriteIndex);
              this.exhaustParticles.field_y[this.exhaustWriteIndex + var4] = var9 + this.shipVelocityXQ16;
              this.exhaustParticles.field_C[var4 + this.exhaustWriteIndex] = var10 + this.shipVelocityYQ16;
            }
            this.activeExhaustParticles = this.activeExhaustParticles + 64;
          } else {
            this.field_jb.setVolume(0);
          }
        } else {
          this.field_jb.setVolume(0);
        }
        var2 = 0;
        if (this.levelIndex < 0) {
          if (this.shipYQ16 >= 33554432) {
            if (18874368 > this.shipXQ16 ||
              this.shipXQ16 >= 48234496) {
              var2 = 1;
            }
            if (this.shipYQ16 < 35651584 &&
              this.shipXQ16 >= 28311552 &&
              this.shipXQ16 < 38797312) {
              var2 = 1;
            }
          }
          int var3 = (this.shipVelocityYQ16 >> 8) * (this.shipVelocityYQ16 >> 8) + (this.shipVelocityXQ16 >> 8) * (this.shipVelocityXQ16 >> 8);
          if (this.shipYQ16 >= 65011712 &&
            var3 > 50176) {
            var4 = -this.shipYQ16 + 67108864;
            if (1048576 > var4 ||
              (-1048576 + var4 >> 6) + 50176 < var3) {
              var2 = 1;
            }
          }
        }
        if (!this.shipDestroyed && (!bc.field_d &&
          ScoreSubmission.field_h[83] ||
          (ScoreSubmission.field_h[81] ||
          var2 != 0)) && (this.shieldEnergy > 0 &&
          this.pickupAnimationTicks == 0)) {
          if (var2 == 0) {
            this.shieldUsedThisLevel = true;
          }
          if (this.levelIndex >= 0) {
            this.shieldEnergy = this.shieldEnergy - 1;
            MouseWheelInput.b((byte) 76);
          }
          if (0 == this.shieldEnergy) {
            this.showHudMessage(-107, rc.field_c);
            pl.field_n.playSampleWithPan(gm.field_b, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
          }
          this.shieldActive = true;
          this.shipLanded = false;
          this.field_v.setVolumeQ6(IterableNodeHashTable.field_c * 16384 / 64);
          boolean decompiledFrameRemainder1 = false;
        }
        else {
          this.shieldActive = false;
          this.field_v.setVolumeQ6(0);
        }
        this.updatePickupAnimation(true);
        int var3Lifetime1 = 0;
        var4 = 0;
        long var5_long = 0L;
        long var7_long = 0L;
        int var9Lifetime1 = 0;
        while (this.levelObjects.size() > var9Lifetime1) {
          LevelObject forceFieldObject = (LevelObject) (this.levelObjects.elementAt(var9Lifetime1));
          int stackIn_324_0 = ~forceFieldObject.objectType;
          int stackIn_324_1 = -4;
          if (stackIn_324_0 == stackIn_324_1 ||
            4 == forceFieldObject.objectType) {
            forceFieldObject.glowActive = false;
            if (!this.shipDestroyed) {
              int var11 = 12 + forceFieldObject.x << 16;
              var12 = forceFieldObject.y + 12 << 16;
              double var13 = (double)(-var11 + this.shipXQ16);
              double var15 = (double)(this.shipYQ16 - var12);
              if ((double)(-this.worldWidth << 15) > var13) {
                var13 = var13 + (double)(this.worldWidth << 16);
              } else if ((double)(this.worldWidth << 15) <= var13) {
                var13 = var13 - (double)(this.worldWidth << 16);
              }
              double var17 = var15 * var15 + var13 * var13;
              if (var17 < 171798691840000.0) {
                forceFieldObject.glowActive = true;
                var19 = this.spatialVolume(1310720, var11, 96, var12);
                var19 = var19 * var19;
                long var20_long = (long)this.spatialPan(var11, 106) * (long)var19;
                if (forceFieldObject.objectType == 3) {
                  var4 = var4 + var19;
                  var7_long = var7_long + var20_long;
                } else {
                  var5_long = var5_long + var20_long;
                  var3Lifetime1 = var3Lifetime1 + var19;
                }
                if (!this.shipLanded) {
                  int var22_int = (int)(var13 * 4294967296.0 / var17);
                  int var23_int = (int)(4294967296.0 * var15 / var17);
                  if (forceFieldObject.objectType == 3) {
                    var22_int = -var22_int;
                    var23_int = -var23_int;
                  }
                  this.shipVelocityYQ16 = this.shipVelocityYQ16 + var23_int;
                  this.shipVelocityXQ16 = this.shipVelocityXQ16 + var22_int;
                }
              }
            }
          }
          var9Lifetime1++;
        }
        PcmSampleStream stackIn_227_0 = this.field_Wb;
        int stackIn_227_1 = (int)Math.sqrt((double)var3Lifetime1 + 0.5);
        if (0 == var3Lifetime1) {
          stackIn_228_2 = 8192;
        } else {
          stackIn_228_2 = (int)(var5_long / (long)var3Lifetime1);
        }
        ((PcmSampleStream) (Object) stackIn_227_0).setVolumeAndPanQ6(stackIn_227_1, stackIn_228_2);
        PcmSampleStream stackIn_230_0 = this.field_wb;
        int stackIn_230_1 = (int)Math.sqrt((double)var4 + 0.5);
        if (var4 != 0) {
          stackIn_231_2 = (int)(var7_long / (long)var4);
        } else {
          stackIn_231_2 = 8192;
        }
        ((PcmSampleStream) (Object) stackIn_230_0).setVolumeAndPanQ6(stackIn_230_1, stackIn_231_2);
        int var3Lifetime2 = 0;
        long var4_long = 0L;
        if (this.laserCycleTicks < 50) {
          IntrusiveNode var6_ref_hg = this.laserGateSpans.first(false);
          for (var7 = 0; var7 < this.laserGateCount; var7++) {
            LaserGateSpan laserGate = (LaserGateSpan) (var6_ref_hg);
            int var9Lifetime2 = laserGate.leftX << 16;
            int var10Lifetime1 = laserGate.leftX << 16;
            int var11Lifetime1 = laserGate.y << 16;
            while (this.shipXQ16 < var9Lifetime2) {
              var9Lifetime2 = var9Lifetime2 - (this.worldWidth << 16);
              var10Lifetime1 = var10Lifetime1 - (this.worldWidth << 16);
            }
            if (!(var10Lifetime1 <= this.shipXQ16)) {
              var12 = this.shipXQ16;
            } else if (this.shipXQ16 >= this.worldWidth + var10Lifetime1 >> 1) {
              var12 = var9Lifetime2;
            } else {
              var12 = var10Lifetime1;
            }
            var13_int = this.spatialVolume(1310720, var12, 96, var11Lifetime1);
            var13_int = var13_int * var13_int;
            var4_long = var4_long + (long)this.spatialPan(var12, 123) * (long)var13_int;
            var3Lifetime2 = var3Lifetime2 + var13_int;
            var6_ref_hg = var6_ref_hg.next;
          }
        }
        PcmSampleStream stackIn_246_0 = this.field_r;
        int stackIn_246_1 = AudioOutput.sampleRate / 100;
        int stackIn_246_2 = (int)Math.sqrt(0.5 + (double)var3Lifetime2);
        if (var3Lifetime2 == 0) {
          stackIn_247_3 = 8192;
        } else {
          stackIn_247_3 = (int)(var4_long / (long)var3Lifetime2);
        }
        ((PcmSampleStream) (Object) stackIn_246_0).rampVolumeAndPanQ6(stackIn_246_1, stackIn_246_2, stackIn_247_3);
        SeekerMine seekerMine = (SeekerMine) (this.seekerMines.first(false));
        while (seekerMine != null) {
          if (null == seekerMine.flightSound) {
            seekerMine.proximitySound = new SeekerPulseStream();
            seekerMine.flightSound = PcmSampleStream.createAtStepQ8(ci.field_a, 256, 0, 8192);
            seekerMine.proximitySound.field_k = PcmSampleStream.createAtStepQ8(qi.field_J, 256, 0, 8192);
            seekerMine.proximitySound.field_q = PcmSampleStream.createAtStepQ8(qi.field_J, 256, 0, 8192);
            seekerMine.flightSound.setLoopCount(-1);
            seekerMine.proximitySound.field_k.setLoopCount(-1);
            seekerMine.proximitySound.field_q.setLoopCount(-1);
            seekerMine.flightSound.setPosition((int)(Math.random() * (double)ci.field_a.samples.length));
            pl.field_n.addSubstream(seekerMine.flightSound);
            pl.field_n.addSubstream(seekerMine.proximitySound);
          }
          var4 = this.shipXQ16 - seekerMine.xQ16;
          var5 = this.shipYQ16 - seekerMine.yQ16;
          if (!(-this.worldWidth << 15 <= var4)) {
            var4 = var4 + (this.worldWidth << 16);
          } else if (var4 >= this.worldWidth << 15) {
            var4 = var4 - (this.worldWidth << 16);
          }
          var6_double = (double)var5 * (double)var5 + (double)var4 * (double)var4;
          stackIn_260_0 = (!this.shipDestroyed &&
            171798691840000.0 > var6_double) ? (1) : (0);
          var8 = stackIn_260_0;
          if (var8 == 0) {
            seekerMine.proximitySound.field_p = 0;
            var4 = seekerMine.homeXQ16 - seekerMine.xQ16;
            if (-this.worldWidth << 15 > var4) {
              var4 = var4 + (this.worldWidth << 16);
            } else if ((this.worldWidth << 15) <= var4) {
              var4 = var4 - (this.worldWidth << 16);
            }
            var4 = 32 + var4 >> 6;
            var5 = seekerMine.homeYQ16 - seekerMine.yQ16 + 16 >> 5;
            if (var5 > -64 &&
              var5 < 64) {
              var5 = (0 >= var5) ? -64 : 64;
            }
            if (var4 > -64 &&
              var4 < 64) {
              var4 = (var4 > 0) ? 64 : -64;
            }
            var9Lifetime3 = 30000 - (seekerMine.velocityYQ16 >> 6);
          } else {
            var6_double = Math.sqrt(var6_double);
            seekerMine.proximitySound.field_k.setSpeed((int)(Math.pow(0.8464491362763915, var6_double / 13107200.0) * 6668800.0) / AudioOutput.sampleRate);
            seekerMine.proximitySound.field_q.setSpeed((int)(Math.pow(0.5646606914212549, var6_double / 13107200.0) * 59980800.0) / AudioOutput.sampleRate);
            seekerMine.proximitySound.field_p = (int)(Math.pow(0.1, var6_double / 13107200.0) * 26214.4);
            seekerMine.homeYQ16 = seekerMine.yQ16;
            var6_double = 2949.12 / var6_double;
            seekerMine.homeXQ16 = seekerMine.xQ16;
            var9Lifetime3 = 40000;
            var5 = (int)((double)var5 * var6_double);
            var4 = (int)((double)var4 * var6_double);
          }
          if (seekerMine.soundPlaybackRate == 0) {
            seekerMine.soundPlaybackRate = var9Lifetime3;
          } else {
            seekerMine.soundPlaybackRate = seekerMine.soundPlaybackRate + (4 - seekerMine.soundPlaybackRate + var9Lifetime3 >> 3);
          }
          seekerMine.flightSound.setSpeed(seekerMine.soundPlaybackRate * 256 / AudioOutput.sampleRate);
          seekerMine.velocityYQ16 = seekerMine.velocityYQ16 + var5;
          seekerMine.velocityXQ16 = seekerMine.velocityXQ16 + var4;
          if (var8 == 0) {
            seekerMine.velocityXQ16 = seekerMine.velocityXQ16 + (32 + seekerMine.velocityXQ16 >> 6);
            seekerMine.velocityYQ16 = seekerMine.velocityYQ16 + (seekerMine.velocityYQ16 + 32 >> 6);
          } else {
            seekerMine.velocityYQ16 = seekerMine.velocityYQ16 - (seekerMine.velocityYQ16 + 32 >> 6);
            seekerMine.velocityXQ16 = seekerMine.velocityXQ16 - (seekerMine.velocityXQ16 + 32 >> 6);
          }
          var6_double = (double)seekerMine.velocityXQ16 * (double)seekerMine.velocityXQ16 + (double)seekerMine.velocityYQ16 * (double)seekerMine.velocityYQ16;
          double stackIn_288_0 = (var8 != 0) ? 38654705664.0 : 9663676416.0;
          var10_double = stackIn_288_0;
          if (var10_double < var6_double) {
            var6_double = Math.sqrt(var10_double / var6_double);
            seekerMine.velocityYQ16 = (int)((double)seekerMine.velocityYQ16 * var6_double);
            seekerMine.velocityXQ16 = (int)((double)seekerMine.velocityXQ16 * var6_double);
          }
          boolean decompiledFrameRemainder0 = true;
          seekerMine.yQ16 = seekerMine.yQ16 + seekerMine.velocityYQ16;
          seekerMine.xQ16 = ((this.worldWidth << 16) + (seekerMine.xQ16 + seekerMine.velocityXQ16)) % (this.worldWidth << 16);
          var12 = this.spatialVolume(4194304, seekerMine.xQ16, 96, seekerMine.yQ16);
          var13_int = this.spatialPan(seekerMine.xQ16, 117);
          seekerMine.flightSound.setVolumeAndPanQ6(var12 >> 1, var13_int);
          seekerMine.proximitySound.field_s = var12;
          seekerMine.proximitySound.field_n = var13_int;
          int var14 = this.worldWidth + (seekerMine.xQ16 >> 16);
          int var15_int = seekerMine.yQ16 >> 16;
          var16 = var14 - 8;
          var17_int = -8 + var15_int;
          if (!this.shipDestroyed) {
            if (this.shieldActive) {
              this.collisionNormalX = 0;
              this.collisionNormalY = 0;
              this.accumulateShieldSpriteContacts(Js5NetworkRequest.field_H, var17_int, var16, (byte) 83);
              if ((this.collisionNormalX | this.collisionNormalY) != 0) {
                int var18 = seekerMine.velocityXQ16 + 3 * this.shipVelocityXQ16 >> 2;
                this.shipVelocityXQ16 = this.shipVelocityXQ16 - var18;
                var19 = this.shipVelocityYQ16 * 3 + seekerMine.velocityYQ16 >> 2;
                this.shipVelocityYQ16 = this.shipVelocityYQ16 - var19;
                double var20_double = (double)this.collisionNormalX;
                double var22_double = (double)this.collisionNormalY;
                double var24_double = 1.0 / Math.sqrt(var20_double * var20_double + var22_double * var22_double);
                var22_double = var22_double * var24_double;
                var20_double = var20_double * var24_double;
                double var24_doubleLifetime1 = 49152.0 + ((double)this.shipVelocityXQ16 * var20_double + (double)this.shipVelocityYQ16 * var22_double);
                if (var24_doubleLifetime1 > 0.0) {
                  this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 - var24_doubleLifetime1 * var22_double);
                  this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 - var24_doubleLifetime1 * var20_double);
                }
                this.shipVelocityXQ16 = this.shipVelocityXQ16 + var18;
                this.shipVelocityYQ16 = this.shipVelocityYQ16 + var19;
                this.destroySeekerMine(seekerMine, 5);
                var12 = (int)var24_doubleLifetime1 >> 4;
                if (var12 > 6144) {
                  var12 = 6144;
                }
                pl.field_n.playSampleWithPan(co.field_d, 100, var12 * IterableNodeHashTable.field_c / 64, 8192);
                decompiledFrameRemainder0 = false;
              }
            } else if (this.spriteOverlapsShipHull(false, var17_int, var16, Js5NetworkRequest.field_H)) {
              this.destroyShip((byte) -62);
              this.destroySeekerMine(seekerMine, 5);
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (0 <= this.tetheredObjectType &&
              this.pickupAnimationTicks == 0) {
              Sprite tetheredSprite = mb.field_f[this.tetheredObjectType];
              for (var19 = -var16 + (this.tetheredXQ16 - (tetheredSprite.fullWidth << 15) >> 16); -this.worldWidth >> 1 > var19; var19 = var19 + this.worldWidth) {
              }
              while (var19 >= this.worldWidth >> 1) {
                var19 = var19 - this.worldWidth;
              }
              if (SpriteCollisionSupport.a(Js5NetworkRequest.field_H, 0, var17_int, tetheredSprite, var19, -(tetheredSprite.fullHeight << 15) + this.tetheredYQ16 >> 16)) {
                this.destroyTetheredObject((byte) 64);
                this.destroySeekerMine(seekerMine, 5);
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0 &&
              this.spriteOverlapsTerrainOrLasers(var16, Js5NetworkRequest.field_H, var17_int, -1)) {
              if (!this.shipDestroyed) {
                int var18Lifetime2 = TextButton.a(this.gameMode, (byte) 77);
                this.levelScore = this.levelScore + var18Lifetime2;
                v.a(8, var18Lifetime2);
              }
              this.destroySeekerMine(seekerMine, 5);
            }
          }
          seekerMine = (SeekerMine) (this.seekerMines.next((byte) 70));
        }
        this.laserCycleTicks = (1 + this.laserCycleTicks) % 200;
        if (!this.shipDestroyed ||
          this.tetheredObjectType >= 0) {
          int var3Lifetime3 = 0;
          var4 = 0;
          if (!this.shipDestroyed) {
            var4 = this.shipVelocityYQ16;
            var3Lifetime3 = this.shipVelocityXQ16;
          }
          int stackIn_324_0Lifetime1 = ~this.tetheredObjectType;
          int stackIn_324_1Lifetime1 = -1;
          if (stackIn_324_0Lifetime1 <= stackIn_324_1Lifetime1) {
            var3Lifetime3 = (this.tetheredVelocityXQ16 >> 2) + var3Lifetime3 - (var3Lifetime3 >> 2);
            var4 = (this.tetheredVelocityYQ16 >> 2) + (var4 - (var4 >> 2));
          }
          double var5_doubleLifetime1 = (double)var4 * (double)var4 + (double)var3Lifetime3 * (double)var3Lifetime3;
          if (1717986918400.0 <= var5_doubleLifetime1) {
            var5_doubleLifetime1 = Math.sqrt(1717986918400.0 / var5_doubleLifetime1);
            this.shipVelocityXQ16 = (int)((double)this.shipVelocityXQ16 * var5_doubleLifetime1);
            this.tetheredVelocityXQ16 = (int)((double)this.tetheredVelocityXQ16 * var5_doubleLifetime1);
            this.tetheredVelocityYQ16 = (int)((double)this.tetheredVelocityYQ16 * var5_doubleLifetime1);
            this.shipVelocityYQ16 = (int)((double)this.shipVelocityYQ16 * var5_doubleLifetime1);
          }
        }
        boolean var3Lifetime4 = false;
        if (!this.shipDestroyed) {
          if (!this.shipLanded) {
            int stackIn_337_0 = (this.shipYQ16 < 33554432) ? 0 : 1;
            var4 = stackIn_337_0;
            this.field_M = this.field_M + this.shipVelocityXQ16;
            this.shipXQ16 = this.shipXQ16 + this.shipVelocityXQ16;
            this.shipYQ16 = this.shipYQ16 + this.shipVelocityYQ16;
            int stackIn_340_0 = (!this.rightLandingContact) ? 0 : 1;
            var5 = stackIn_340_0;
            int stackIn_343_0 = (!this.leftLandingContact) ? 0 : 1;
            var6 = stackIn_343_0;
            this.fatalHullContact = false;
            this.leftLandingContact = false;
            this.rightLandingContact = false;
            if (!this.shieldActive) {
              this.scanShipHullContacts((byte) -102);
              if (this.fatalHullContact) {
                this.destroyShip((byte) -70);
              } else if (this.rightLandingContact ||
                this.leftLandingContact) {
                if (var5 != 0) {
                  this.rightLandingContact = true;
                } else if (this.rightLandingContact) {
                  pl.field_n.playSampleWithPan(TerrainMaskSupport.field_e, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
                }
                if (var6 != 0) {
                  this.leftLandingContact = true;
                } else if (this.leftLandingContact) {
                  pl.field_n.playSampleWithPan(ri.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
                }
                this.shipVelocityXQ16 = this.shipVelocityXQ16 >> 1;
                if (this.shipVelocityYQ16 > 65536) {
                  this.shipVelocityYQ16 = 65536;
                }
                if (this.rightLandingContact &&
                  this.leftLandingContact) {
                  if (this.shipVelocityYQ16 > 0) {
                    this.shipVelocityYQ16 = 0;
                  }
                  this.shipYQ16 = this.shipYQ16 - 65536;
                  if (!(-256 > this.shipVelocityXQ16) &&
                    !(this.shipVelocityXQ16 > 256)) {
                    this.shipVelocityYQ16 = 0;
                    var3Lifetime4 = true;
                    this.shipVelocityXQ16 = 0;
                    this.shipLanded = true;
                  }
                  boolean decompiledFrameRemainder2 = false;
                } else if (this.rightLandingContact) {
                  this.field_M = this.field_M + 16384;
                  this.shipXQ16 = this.shipXQ16 + 16384;
                  this.shipAngle256 = this.shipAngle256 + 1 & 255;
                } else {
                  this.shipXQ16 = this.shipXQ16 - 16384;
                  this.shipAngle256 = -1 + this.shipAngle256 & 255;
                  this.field_M = this.field_M - 16384;
                }
              }
            } else {
              this.collisionNormalX = 0;
              this.collisionNormalY = 0;
              this.scanShieldTerrainContacts((byte) 69);
              if (0 != (this.collisionNormalX | this.collisionNormalY)) {
                this.resolveShieldImpact(-125);
              }
            }
            if (this.levelIndex < 0 &&
              !this.cargoLost) {
              if (var4 != 0 &&
                this.shipYQ16 < 33554432) {
                this.showHudMessage(-114, bh.field_e);
                pl.field_n.playSampleWithPan(gm.field_b, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
              }
              if (var4 == 0 &&
                this.shipYQ16 >= 33554432) {
                this.showHudMessage(67, AudioService.field_a);
                pl.field_n.playSampleWithPan(gm.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
              }
            }
          } else {
            this.fatalHullContact = false;
            this.scanShipHullContacts((byte) 72);
            if (this.fatalHullContact) {
              this.destroyShip((byte) -112);
            }
          }
          while (this.shipXQ16 < 0) {
            this.shipXQ16 = this.shipXQ16 + (this.worldWidth << 16);
            this.field_Kb = this.field_Kb - this.worldWidth;
          }
          while (this.shipXQ16 >= this.worldWidth << 16) {
            this.shipXQ16 = this.shipXQ16 - (this.worldWidth << 16);
            this.field_Kb = this.field_Kb + this.worldWidth;
          }
        }
        Object var4_ref = this.field_f;
        PcmSampleStream var5_ref_hl = this.field_Eb;
        this.field_f = null;
        this.field_Eb = null;
        var6 = 0;
        while (var6 < this.levelObjects.size()) {
          LevelObject var34_ref = (LevelObject) (this.levelObjects.elementAt(var6));
          stackIn_543_0 = -1;
          stackIn_543_1 = ~var34_ref.objectType;
          if (stackIn_543_0 == stackIn_543_1) {
            var34_ref.glowActive = false;
            if (!this.shipDestroyed &&
              this.shipLanded) {
              var8 = (-var34_ref.x + ((this.shipXQ16 >> 16) + this.worldWidth)) % this.worldWidth;
              int var9Lifetime4 = -var34_ref.y + (this.shipYQ16 >> 16);
              if (var8 >= 7 &&
                var8 < 23 &&
                var9Lifetime4 >= 50 &&
                var9Lifetime4 < 55) {
                if (this.fuel < 5000) {
                  var34_ref.glowActive = true;
                  int var10Lifetime2 = 5000 - this.fuel;
                  if (var10Lifetime2 > 13) {
                    var10Lifetime2 = 13;
                  }
                  ji.a(true, var10Lifetime2);
                  this.fuel = this.fuel + 13;
                  if (this.fuel > 5000) {
                    this.fuel = 5000;
                  }
                  if (var4_ref != null) {
                    ((PcmSampleStream) (var4_ref)).setVolumeQ6(6144 * IterableNodeHashTable.field_c / 64);
                    this.field_R.setVolumeQ6(6144 * IterableNodeHashTable.field_c / 64);
                  } else {
                    this.field_R = PcmSampleStream.createAtRatePercentQ6(DropTargetWidget.field_E, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
                    pl.field_n.addSubstream(this.field_R);
                    PcmSampleStream var36 = PcmSampleStream.createAtRatePercentQ6(NameAvailabilityResult.field_d, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
                    var4_ref = var36;
                    var36.setLoopCount(-1);
                    pl.field_n.addSubstream(var36);
                  }
                  this.field_f = (PcmSampleStream) (var4_ref);
                } else {
                  if (var4_ref != null) {
                    pl.field_n.removeSubstream((PcmStream) (var4_ref));
                    pl.field_n.removeSubstream(this.field_R);
                    var4_ref = null;
                    this.field_R = null;
                  }
                  if (var5_ref_hl == null) {
                    PcmSampleStream var35 = PcmSampleStream.createAtRatePercentQ6(SpriteOffset.field_f, 100, 3584 * IterableNodeHashTable.field_c / 64, 8192);
                    var5_ref_hl = var35;
                    var35.setLoopCount(-1);
                    pl.field_n.addSubstream(var35);
                  }
                  this.field_Eb = var5_ref_hl;
                }
              }
              if (var8 >= 3 &&
                27 > var8 &&
                48 <= var9Lifetime4 &&
                var9Lifetime4 < 57) {
                var3Lifetime4 = false;
              }
            }
          }
          if (this.scoringEnabled &&
            this.levelIndex == 7 &&
            !this.shipDestroyed &&
            this.shipLanded &&
            var34_ref.objectType == 3) {
            var8 = this.shipXQ16 >> 16;
            int var9Lifetime4Lifetime1 = this.shipYQ16 >> 16;
            if (var8 >= (var34_ref.x - 20) &&
              var34_ref.x + 40 > var8 &&
              var9Lifetime4Lifetime1 >= -30 + var34_ref.y &&
              var34_ref.y > var9Lifetime4Lifetime1) {
              this.awardAchievement(this.gameMode, false, 17, 238);
            }
          }
          var6++;
        }
        if (var4_ref != null &&
          this.field_f == null) {
          pl.field_n.removeSubstream((PcmStream) (var4_ref));
          pl.field_n.removeSubstream(this.field_R);
          this.field_R = null;
          pl.field_n.playSampleWithPan(al.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
        }
        if (var5_ref_hl != null &&
          null == this.field_Eb) {
          var5_ref_hl.setLoopCount(0);
        }
        if (!this.shipDestroyed &&
          this.shipLanded &&
          this.fuel == 0) {
          this.destroyShip((byte) -61);
        }
        if (!this.shipDestroyed &&
          this.shipLanded &&
          this.tetheredObjectType < 0) {
          Object var4_refLifetime1 = null;
          var5 = 0;
          scanLoop2: while (true) {
            int stackIn_449_0 = ~var5;
            int stackIn_449_1 = -4;
            if (stackIn_449_0 <= stackIn_449_1) {
              if (!var3Lifetime4) {
                break scanLoop2;
              }
              if (var4_refLifetime1 == null) {
                break scanLoop2;
              }
              pl.field_n.playSampleWithPan(gm.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
              this.showHudMessage(127, (String) (var4_refLifetime1));
              break scanLoop2;
            }
            var6 = 0;
            while (var6 < this.levelObjects.size()) {
              LevelObject var37_ref = (LevelObject) (this.levelObjects.elementAt(var6));
              int stackIn_449_0Lifetime1 = ~var5;
              int stackIn_449_1Lifetime1 = -1;
              if (stackIn_449_0Lifetime1 == stackIn_449_1Lifetime1) {
                int stackIn_457_0 = (!ResourceArchive.isPowerupType(var37_ref.objectType, -64)) ? 0 : 1;
                var8 = stackIn_457_0;
              } else if (var5 != 1) {
                int stackIn_466_0 = (var37_ref.objectType != 1) ? 0 : 1;
                var8 = stackIn_466_0;
              } else {
                int stackIn_462_0 = (5 != var37_ref.objectType) ? 0 : 1;
                var8 = stackIn_462_0;
              }
              boolean decompiledFrameRemainder4 = true;
              if (var8 != 0) {
                Sprite var38 = var37_ref.collisionSprite;
                int var10Lifetime3 = ((var37_ref.x << 16) + (var38.fullWidth << 15)) % (this.worldWidth << 16);
                int var11Lifetime2 = (var38.fullHeight << 15) + (var37_ref.y << 16);
                for (var12 = -(var10Lifetime3 >> 16) + (this.shipXQ16 >> 16); (-this.worldWidth >> 1) > var12; var12 = var12 + this.worldWidth) {
                }
                while (this.worldWidth >> 1 <= var12) {
                  var12 = var12 - this.worldWidth;
                }
                var13_int = (this.shipYQ16 >> 16) - (var11Lifetime2 >> 16);
                if (-5 <= var12 &&
                  var12 <= 5 &&
                  -10 - var38.fullHeight / 2 <= var13_int &&
                  var13_int <= -(var38.fullHeight / 2) - 2) {
                  if (var37_ref.objectType >= 9) {
                    var4_refLifetime1 = on.field_d;
                    decompiledFrameRemainder4 = false;
                  }
                  else {
                    var13_int = 0;
                    var12 = 0;
                  }
                }
                if (decompiledFrameRemainder4) {
                  if (-5 <= var13_int &&
                    var13_int <= 5 &&
                    -32 <= var12 &&
                    var12 <= 32) {
                    this.levelObjects.removeElementAt(var6);
                    var37_ref.removeFromTerrain(this, (byte) 75);
                    var6--;
                    if (this.minimap != null) {
                      this.minimap.a(var37_ref, 4236);
                    }
                    this.tetheredObjectType = var37_ref.objectType;
                    this.activateCountdown(-118, 1);
                    this.tetheredXQ16 = var10Lifetime3;
                    this.tetheredVelocityYQ16 = 0;
                    this.tetheredYQ16 = var11Lifetime2;
                    this.tetheredVelocityXQ16 = 0;
                    this.field_W = false;
                    if (this.tetheredObjectType < 9) {
                      int var14Lifetime1 = qj.a((byte) -38, this.tetheredObjectType, this.gameMode);
                      this.levelScore = this.levelScore + var14Lifetime1;
                      v.a(8, var14Lifetime1);
                      this.showTntPickupMessage(this.tetheredObjectType, (byte) -9);
                    } else {
                      this.pickupAnimationTicks = 50;
                    }
                    pl.field_n.playSampleWithPan(fg.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
                    break scanLoop2;
                  }
                  if (var4_refLifetime1 != on.field_d &&
                    var13_int >= -15 &&
                    var13_int <= 15 &&
                    var12 >= -32 &&
                    32 >= var12) {
                    if (1 == var37_ref.objectType) {
                      var4_refLifetime1 = ff.field_f;
                    } else if (5 != var37_ref.objectType) {
                      var4_refLifetime1 = nn.field_c;
                    } else {
                      var4_refLifetime1 = ui.field_d;
                    }
                    decompiledFrameRemainder4 = false;
                  } else if (var4_refLifetime1 == null &&
                    var13_int >= -15 &&
                    15 >= var13_int &&
                    var12 >= -64 &&
                    var12 <= 64) {
                    var4_refLifetime1 = NineSliceFrame.field_e;
                  }
                }
              }
              var6++;
            }
            var5++;
          }
        }
        if (this.tetheredObjectType < 0) {
          this.field_fb.field_l = 0;
        } else {
          if (!this.field_W &&
            !this.shipDestroyed) {
            var4 = this.shipXQ16 - this.tetheredXQ16 >> 8;
            if (-this.worldWidth << 7 > var4) {
              var4 = var4 + (this.worldWidth << 8);
            } else if ((this.worldWidth << 7) <= var4) {
              var4 = var4 - (this.worldWidth << 8);
            }
            var5 = -this.tetheredYQ16 + this.shipYQ16 >> 8;
            var6 = this.shipVelocityXQ16;
            var7 = this.shipVelocityYQ16;
            if (this.pickupAnimationTicks > 0) {
              var6 = var6 + (var4 << 8) * (-this.pickupAnimationTicks + 50) / 2500;
              var7 = var7 + (-this.pickupAnimationTicks + 50) * (var5 << 8) / 2500;
              var5 = (125 - this.pickupAnimationTicks) * var5 / 75;
              var4 = var4 * (125 - this.pickupAnimationTicks) / 75;
            }
            var8 = var4 * var4 + var5 * var5;
            Object var9_ref_Object = pl.field_n;
            synchronized (var9_ref_Object) {
              var10_double = 0.000244140625 * Math.sqrt((double)var8);
              var5 = (int)((double)var5 / var10_double);
              var4 = (int)((double)var4 / var10_double);
              var12 = ((var6 >> 4) * var4 + var5 * (var7 >> 4)) * IterableNodeHashTable.field_c / 64 >> 6;
              if (this.pickupAnimationTicks == 0 &&
                var8 >= 150994944) {
                pl.field_n.playSample(ObjectSpriteSet.field_c, 100, var12 >> 11);
                this.field_W = true;
                this.field_fb.field_l = 0;
              } else {
                this.field_fb.field_l = var12;
                this.field_fb.field_o = var8 / 2304;
              }
            }
          } else {
            this.field_fb.field_l = 0;
          }
          if (this.field_W) {
            this.tetheredXQ16 = this.tetheredXQ16 + this.tetheredVelocityXQ16;
            this.tetheredVelocityYQ16 = this.tetheredVelocityYQ16 + this.gravityQ16;
            this.tetheredYQ16 = this.tetheredYQ16 + this.tetheredVelocityYQ16;
            if (!this.shipDestroyed) {
              stackIn_543_0 = -this.shipXQ16;
              stackIn_543_1 = this.tetheredXQ16;
              double var4_double = (double)(stackIn_543_0 + stackIn_543_1);
              if ((double)(-this.worldWidth << 15) > var4_double) {
                var4_double = var4_double + (double)(this.worldWidth << 16);
              } else if ((double)(this.worldWidth << 15) <= var4_double) {
                var4_double = var4_double - (double)(this.worldWidth << 16);
              }
              var6_double = (double)(this.tetheredYQ16 - this.shipYQ16);
              double var8_double = Math.sqrt(var6_double * var6_double + var4_double * var4_double);
              var4_double = var4_double / var8_double;
              var10_double = var8_double - 3145728.0;
              var6_double = var6_double / var8_double;
              var12 = (int)(var4_double * var10_double);
              var13_int = (int)(var10_double * var6_double);
              if (!this.shipLanded) {
                this.shipYQ16 = this.shipYQ16 + (var13_int >> 2);
                this.tetheredYQ16 = this.tetheredYQ16 - (var13_int - (var13_int >> 2));
                this.shipXQ16 = this.shipXQ16 + (var12 >> 2);
                this.tetheredXQ16 = this.tetheredXQ16 - (-(var12 >> 2) + var12);
                this.shipXQ16 = ((this.worldWidth << 16) + this.shipXQ16) % (this.worldWidth << 16);
                this.field_M = this.field_M + (var12 >> 2);
              } else {
                this.tetheredXQ16 = this.tetheredXQ16 - var12;
                this.tetheredYQ16 = this.tetheredYQ16 - var13_int;
              }
              double var14_double = (double)(this.tetheredVelocityYQ16 - this.shipVelocityYQ16) * var6_double + (double)(this.tetheredVelocityXQ16 - this.shipVelocityXQ16) * var4_double;
              var16 = (int)(var14_double * var4_double);
              var17_int = (int)(var6_double * var14_double);
              if (this.shipLanded) {
                this.tetheredVelocityYQ16 = this.tetheredVelocityYQ16 - var17_int;
                this.tetheredVelocityXQ16 = this.tetheredVelocityXQ16 - var16;
              } else {
                this.shipVelocityXQ16 = this.shipVelocityXQ16 + (var16 >> 2);
                this.shipVelocityYQ16 = this.shipVelocityYQ16 + (var17_int >> 2);
                this.tetheredVelocityXQ16 = this.tetheredVelocityXQ16 - (-(var16 >> 2) + var16);
                this.tetheredVelocityYQ16 = this.tetheredVelocityYQ16 - (-(var17_int >> 2) + var17_int);
              }
            }
            this.tetheredXQ16 = (this.tetheredXQ16 + (this.worldWidth << 16)) % (this.worldWidth << 16);
            this.tetheredVelocityYQ16 = this.tetheredVelocityYQ16 - this.tetheredVelocityYQ16 / 256;
            this.tetheredVelocityXQ16 = this.tetheredVelocityXQ16 - this.tetheredVelocityXQ16 / 256;
            Sprite var39 = mb.field_f[this.tetheredObjectType];
            var5 = (-(var39.fullWidth << 15) + this.tetheredXQ16 >> 16) + this.worldWidth;
            var6 = this.tetheredYQ16 - (var39.fullHeight << 15) >> 16;
            if (this.spriteOverlapsTerrainOrLasers(var5, var39, var6, -1)) {
              this.destroyTetheredObject((byte) 9);
            }
          }
        }
        var4 = 0;
        IntrusiveNode var5_ref_hg = this.bullets.first(false);
        var6 = 0;
        while (var6 < this.activeBulletCount) {
          Bullet bullet = (Bullet) (var5_ref_hg);
          int fieldTemp$0 = bullet.remainingTicks - 1;
          bullet.remainingTicks = bullet.remainingTicks - 1;
          int stackIn_608_0 = ~fieldTemp$0;
          int stackIn_608_1 = -1;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_608_0 == stackIn_608_1) {
            var4 = 1;
            bullet.inactive = true;
          } else {
            var8 = (bullet.xQ16 + bullet.velocityXQ16 + (this.worldWidth << 16)) % (this.worldWidth << 16);
            int var9Lifetime5 = bullet.velocityYQ16 + bullet.yQ16;
            bullet.xQ16 = var8;
            bullet.yQ16 = var9Lifetime5;
            var8 = var8 >> 16;
            var9Lifetime5 = var9Lifetime5 >> 16;
            if (bullet.kind == 0) {
              Sprite var41 = Js5NetworkRequest.field_H;
              SeekerMine hitMine = (SeekerMine) (this.seekerMines.first(false));
              while (hitMine != null) {
                var12 = var41.offsetY + ((hitMine.yQ16 >> 16) - 8);
                int stackIn_581_0 = ~var12;
                int stackIn_581_1 = ~var9Lifetime5;
                if (stackIn_581_0 >= stackIn_581_1 &&
                  (var41.height + var12) > var9Lifetime5) {
                  for (var13_int = var8 + (-(hitMine.xQ16 >> 16) + (8 - var41.offsetX)); var13_int < 0; var13_int = var13_int + this.worldWidth) {
                  }
                  var13_int = var13_int % this.worldWidth;
                  if (!(var41.width <= var13_int) &&
                    var41.pixels[(var9Lifetime5 - var12) * var41.width + var13_int] != 0) {
                    if (!this.shipDestroyed) {
                      int var14Lifetime2 = TextButton.a(this.gameMode, (byte) 112);
                      this.levelScore = this.levelScore + var14Lifetime2;
                      v.a(8, var14Lifetime2);
                    }
                    this.destroySeekerMine(hitMine, 5);
                    bullet.inactive = true;
                    var4 = 1;
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
                hitMine = (SeekerMine) (this.seekerMines.next((byte) 70));
              }
            }
            if (decompiledFrameCompleted1) {
              int stackIn_581_0Lifetime1 = var8;
              int stackIn_581_1Lifetime1 = 31;
              int var10Lifetime4 = stackIn_581_0Lifetime1 & stackIn_581_1Lifetime1;
              var8 = var8 >> 5;
              int var11Lifetime3 = var9Lifetime5 & 31;
              var9Lifetime5 = var9Lifetime5 >> 5;
              if (0 <= var9Lifetime5) {
                if (this.tilesHigh <= var9Lifetime5) {
                  stackIn_586_0 = QuickChatPhraseDefinition.fullTileMask;
                } else {
                  stackIn_586_0 = this.terrainMasks[var9Lifetime5 * this.tilesWide + var8];
                }
                int[] var46 = stackIn_586_0;
                int[] var42 = var46;
                int[] var12_ref_int__ = var42;
                if (var12_ref_int__ != null && (var12_ref_int__ == QuickChatPhraseDefinition.fullTileMask ||
                  (var46[var11Lifetime3] & 1 << var10Lifetime4) != 0)) {
                  if (0 == bullet.kind) {
                    this.destroyLevelObjectAtPoint(-90, var11Lifetime3 | var9Lifetime5 << 5, var10Lifetime4 | var8 << 5);
                  }
                  var4 = 1;
                  bullet.inactive = true;
                  decompiledFrameRemainder3 = false;
                }
              }
              if (decompiledFrameRemainder3 && (bullet.kind == 1 &&
                !this.shipDestroyed && (this.shieldActive &&
                this.pointInsideShield(var8 << 5 | var10Lifetime4, 32, var9Lifetime5 << 5 | var11Lifetime3) ||
                (this.hitShipAtPoint((byte) 105, var9Lifetime5 << 5 | var11Lifetime3, var8 << 5 | var10Lifetime4) ||
                this.hitTetheredObjectAtPoint(-2, var10Lifetime4 | var8 << 5, var9Lifetime5 << 5 | var11Lifetime3))))) {
                var4 = 1;
                bullet.inactive = true;
              }
            }
          }
          var5_ref_hg = var5_ref_hg.next;
          var6++;
        }
        if (var4 != 0) {
          this.recycleInactiveBullets(127);
        }
        var4 = this.activeExhaustParticles * IterableNodeHashTable.field_c / 32;
        int stackIn_608_0Lifetime1 = var4;
        int stackIn_608_1Lifetime1 = 8192;
        var5 = stackIn_608_0Lifetime1 * stackIn_608_1Lifetime1;
        RockBuster rockBuster = (RockBuster) (this.rockBusters.first(false));
        scanLoop3: while (rockBuster != null) {
          var7 = 0;
          while (var7 < 32) {
            boolean stackOut_612_0 = rockBuster.exhaustParticles.field_E[var7 + rockBuster.exhaustWriteIndex];
            int stackIn_618_0 = stackOut_612_0 ? 1 : 0;
            boolean stackIn_613_0 = stackOut_612_0;
            if (stackIn_613_0) {
              rockBuster.activeExhaustParticles = rockBuster.activeExhaustParticles - 1;
              rockBuster.exhaustParticles.field_E[rockBuster.exhaustWriteIndex + var7] = false;
            }
            var7++;
          }
          rockBuster.exhaustParticles.a();
          int stackIn_618_0Lifetime1 = -1;
          if (stackIn_618_0Lifetime1 > ~rockBuster.remainingFlightTicks) {
            double var7_doubleLifetime1 = 0.02454369260617026 * (double)rockBuster.angle256;
            rockBuster.velocityXQ16 = rockBuster.velocityXQ16 + (int)(2000.0 * Math.sin(var7_doubleLifetime1));
            rockBuster.velocityYQ16 = rockBuster.velocityYQ16 - (int)(2000.0 * Math.cos(var7_doubleLifetime1));
            for (int var9Lifetime6 = 0; 32 > var9Lifetime6; var9Lifetime6++) {
              rockBuster.exhaustParticles.field_E[var9Lifetime6 + rockBuster.exhaustWriteIndex] = true;
              var10_double = Math.random() * 0.2 + var7_doubleLifetime1 - 0.1;
              double var12_double = (0.5 + Math.random()) * 524288.0;
              int var14Lifetime3 = -(int)(Math.sin(var10_double) * var12_double);
              int var15_intLifetime1 = (int)(var12_double * Math.cos(var10_double));
              rockBuster.exhaustParticles.field_x[var9Lifetime6 + rockBuster.exhaustWriteIndex] = rockBuster.xQ16 + rockBuster.velocityXQ16;
              rockBuster.exhaustParticles.field_A[var9Lifetime6 + rockBuster.exhaustWriteIndex] = rockBuster.yQ16 + rockBuster.velocityYQ16;
              double var16_double = Math.random();
              rockBuster.exhaustParticles.field_y[rockBuster.exhaustWriteIndex + var9Lifetime6] = (int)(var16_double * (double)var14Lifetime3);
              rockBuster.exhaustParticles.field_C[rockBuster.exhaustWriteIndex + var9Lifetime6] = (int)(var16_double * (double)var15_intLifetime1);
              rockBuster.exhaustParticles.field_w[var9Lifetime6 + rockBuster.exhaustWriteIndex] = 0;
              rockBuster.exhaustParticles.i(var9Lifetime6 + rockBuster.exhaustWriteIndex);
              rockBuster.exhaustParticles.field_y[rockBuster.exhaustWriteIndex + var9Lifetime6] = rockBuster.velocityXQ16 + var14Lifetime3;
              rockBuster.exhaustParticles.field_C[rockBuster.exhaustWriteIndex + var9Lifetime6] = var15_intLifetime1 + rockBuster.velocityYQ16;
            }
            rockBuster.activeExhaustParticles = rockBuster.activeExhaustParticles + 32;
          }
          regionExit4: {
            boolean decompiledFrameCompleted0 = true;
            var7 = rockBuster.activeExhaustParticles * this.spatialVolume(2097152, rockBuster.xQ16, 96, rockBuster.yQ16) / 1024;
            var4 = var4 + var7;
            var5 = var5 + var7 * this.spatialPan(rockBuster.xQ16, 124);
            rockBuster.exhaustWriteIndex = (32 + rockBuster.exhaustWriteIndex) % 256;
            if (0 != rockBuster.remainingFlightTicks) {
              int fieldTemp$1 = rockBuster.remainingFlightTicks - 1;
              rockBuster.remainingFlightTicks = rockBuster.remainingFlightTicks - 1;
              if (fieldTemp$1 != 0) {
                ResourceArchive.field_a.offsetY = 0;
                Sprite var8_ref_ed = ResourceArchive.field_a;
                var8_ref_ed.offsetX = 0;
                Sprite var9_ref_ed = ResourceArchive.field_a;
                Sprite var10_ref_ed = ResourceArchive.field_a;
                ResourceArchive.field_a.height = 7;
                Sprite var11_ref_ed = ResourceArchive.field_a;
                var9_ref_ed.fullWidth = 7;
                var11_ref_ed.width = 7;
                var10_ref_ed.fullHeight = 7;
                ResourceArchive.field_a.bindAsFramebuffer();
                SoftwareRasterizer.clearFramebuffer();
                ResourceArchive.field_m.drawCenteredRotatedScaled(4, (byte) 34, 4096, -rockBuster.angle256 << 8, 4);
                md.field_D.a(120);
                var12 = (int)Math.sqrt((double)rockBuster.velocityYQ16 * (double)rockBuster.velocityYQ16 + (double)rockBuster.velocityXQ16 * (double)rockBuster.velocityXQ16);
                var13_int = var12 / 196608 + 1;
                int var14Lifetime3Lifetime1 = rockBuster.velocityXQ16;
                int var15_intLifetime1Lifetime1 = rockBuster.velocityYQ16;
                var16 = var13_int;
                scanLoop5: while (true) {
                  if (0 >= var16) {
                    if (rockBuster.field_h) {
                      rockBuster.field_h = false;
                      pl.field_n.addSubstream(rockBuster.flightSound);
                    }
                    rockBuster.flightSound.setVolumeAndPanQ6(this.spatialVolume(2097152, rockBuster.xQ16, 96, rockBuster.yQ16), this.spatialPan(rockBuster.xQ16, 125));
                    break regionExit4;
                  }
                  var17_int = var14Lifetime3Lifetime1 / var16;
                  int var18Lifetime1 = var15_intLifetime1Lifetime1 / var16;
                  var19 = ((this.worldWidth << 16) + rockBuster.xQ16 + var17_int) % (this.worldWidth << 16);
                  rockBuster.xQ16 = var19;
                  var20 = var18Lifetime1 + rockBuster.yQ16;
                  var14Lifetime3Lifetime1 = var14Lifetime3Lifetime1 - var17_int;
                  var19 = var19 >> 16;
                  var15_intLifetime1Lifetime1 = var15_intLifetime1Lifetime1 - var18Lifetime1;
                  rockBuster.yQ16 = var20;
                  var19 -= 4;
                  var20 = var20 >> 16;
                  var20 -= 4;
                  SeekerMine collidedMine = (SeekerMine) (this.seekerMines.first(false));
                  while (collidedMine != null) {
                    int var22_intLifetime1 = -(collidedMine.xQ16 >> 16) + var19 + 8;
                    int stackIn_675_0 = -(this.worldWidth >> 1);
                    int stackIn_675_1 = var22_intLifetime1;
                    if (!(stackIn_675_0 <= stackIn_675_1)) {
                      var22_intLifetime1 = var22_intLifetime1 + this.worldWidth;
                    } else if ((this.worldWidth >> 1) < var22_intLifetime1) {
                      var22_intLifetime1 = var22_intLifetime1 - this.worldWidth;
                    }
                    int var23_intLifetime1 = var20 + (-(collidedMine.yQ16 >> 16) + 8);
                    if (!SpriteCollisionSupport.a(Js5NetworkRequest.field_H, 0, 0, ResourceArchive.field_a, var22_intLifetime1, var23_intLifetime1)) {
                      collidedMine = (SeekerMine) (this.seekerMines.next((byte) 70));
                      continue;
                    }
                    if (!this.shipDestroyed) {
                      int var24 = TextButton.a(this.gameMode, (byte) 105);
                      this.levelScore = this.levelScore + var24;
                      v.a(8, var24);
                    }
                    this.destroySeekerMine(collidedMine, 5);
                    this.detonateRockBuster(rockBuster, 82);
                    rockBuster.remainingFlightTicks = 0;
                    break regionExit4;
                  }
                  if (!this.spriteOverlapsTerrainOrLasers(this.worldWidth + var19, ResourceArchive.field_a, var20, -1)) {
                    var16--;
                    continue scanLoop5;
                  }
                  break;
                }
                int var21 = 0;
                while (true) {
                  int stackIn_650_0 = this.levelObjects.size();
                  int stackIn_650_1 = var21;
                  if (stackIn_650_0 <= stackIn_650_1) {
                    this.detonateRockBuster(rockBuster, 78);
                    rockBuster.remainingFlightTicks = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  LevelObject hitObject = (LevelObject) (this.levelObjects.elementAt(var21));
                  Sprite var23 = hitObject.collisionSprite;
                  for (var24Lifetime1 = -var19 + hitObject.x; this.worldWidth >> 1 < var24Lifetime1; var24Lifetime1 = var24Lifetime1 - this.worldWidth) {
                  }
                  while ((-this.worldWidth >> 1) > var24Lifetime1) {
                    var24Lifetime1 = var24Lifetime1 + this.worldWidth;
                  }
                  int var25 = hitObject.y - var20;
                  if (SpriteCollisionSupport.a(ResourceArchive.field_a, 0, 0, var23, var24Lifetime1, var25)) {
                    this.destroyLevelObject(hitObject, 67, var21);
                    if (hitObject.objectType == 6 ||
                      hitObject.objectType == 7) {
                      int var26 = hitObject.y + 14;
                      IntrusiveNode var27 = this.laserGateSpans.first(false);
                      int var28 = 0;
                      while (this.laserGateCount > var28) {
                        LaserGateSpan hitGate = (LaserGateSpan) (var27);
                        int stackIn_650_0Lifetime1 = hitGate.y;
                        int stackIn_650_1Lifetime1 = var26;
                        if (stackIn_650_0Lifetime1 == stackIn_650_1Lifetime1) {
                          this.removeLaserGateSpan(hitGate, (byte) 27);
                          break;
                        }
                        var28++;
                        var27 = var27.next;
                      }
                    }
                  }
                  var21++;
                }
              }
              if (decompiledFrameCompleted0) {
                this.detonateRockBuster(rockBuster, 49);
              }
            } else {
              if (rockBuster.activeExhaustParticles != 0) {
                rockBuster = (RockBuster) (this.rockBusters.next((byte) 70));
                continue scanLoop3;
              }
              rockBuster.unlink((byte) -52);
            }
          }
          rockBuster = (RockBuster) (this.rockBusters.next((byte) 70));
        }
        if (!this.shipDestroyed) {
          int stackIn_675_0Lifetime1 = -1;
          int stackIn_675_1Lifetime1 = ~this.shotCooldownTicks;
          if (stackIn_675_0Lifetime1 > stackIn_675_1Lifetime1) {
            this.shotCooldownTicks = this.shotCooldownTicks - 1;
          } else if (!ScoreSubmission.field_p &&
            ScoreSubmission.field_h[82]) {
            var6_double = (double)this.shipAngle256 * 0.02454369260617026;
            var8 = (int)(Math.sin(var6_double) * 131072.0);
            int var9Lifetime7 = -(int)(Math.cos(var6_double) * 131072.0);
            this.spawnBullet(this.shipYQ16 + 5 * var9Lifetime7, this.shipXQ16 + 5 * var8, this.shipVelocityYQ16 + var9Lifetime7, 256, 0, var8 + this.shipVelocityXQ16);
            if (!this.triShotEnabled) {
              pl.field_n.playSampleWithPan(DraggableWidget.field_M, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
            } else {
              this.spawnBullet(this.shipYQ16 + var9Lifetime7 * 5, this.shipXQ16 + var8 * 5, (var8 >> 3) - (var9Lifetime7 >> 3) + (this.shipVelocityYQ16 + var9Lifetime7), 256, 0, this.shipVelocityXQ16 + (var8 - ((var8 >> 3) + (var9Lifetime7 >> 3))));
              this.spawnBullet(this.shipYQ16 + var9Lifetime7 * 5, 5 * var8 + this.shipXQ16, -(var8 >> 3) - (var9Lifetime7 >> 3) + (var9Lifetime7 + this.shipVelocityYQ16), 256, 0, (var9Lifetime7 >> 3) + this.shipVelocityXQ16 + (var8 - (var8 >> 3)));
              pl.field_n.playSampleWithPan(gn.field_e, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
            }
            this.shotCooldownTicks = 9;
          }
          if (!(0 >= this.rockBusterCooldownTicks)) {
            this.rockBusterCooldownTicks = this.rockBusterCooldownTicks - 1;
          } else if (this.rockBusterAmmo > 0 &&
            this.isRockBusterKeyDown((byte) 61)) {
            var6_double = 0.02454369260617026 * (double)this.shipAngle256;
            var8 = (int)(131072.0 * Math.sin(var6_double));
            int var9Lifetime7Lifetime1 = -(int)(Math.cos(var6_double) * 131072.0);
            RockBuster launchedRockBuster = new RockBuster();
            launchedRockBuster.velocityYQ16 = this.shipVelocityYQ16 + var9Lifetime7Lifetime1;
            launchedRockBuster.xQ16 = (this.shipXQ16 + (5 * var8 + (this.worldWidth << 16))) % (this.worldWidth << 16);
            launchedRockBuster.remainingFlightTicks = 100;
            launchedRockBuster.angle256 = this.shipAngle256;
            launchedRockBuster.velocityXQ16 = this.shipVelocityXQ16 + var8;
            launchedRockBuster.yQ16 = this.shipYQ16 + 5 * var9Lifetime7Lifetime1;
            launchedRockBuster.exhaustParticles = this.createExhaustCloud(256, -22944);
            launchedRockBuster.flightSound = PcmSampleStream.createAtRatePercentQ6(NameAvailabilityValidator.field_p, 100, this.spatialVolume(2097152, launchedRockBuster.xQ16, 96, launchedRockBuster.yQ16), this.spatialPan(launchedRockBuster.xQ16, 116));
            pl.field_n.addSubstream(launchedRockBuster.flightSound);
            this.rockBusters.addLast(-12328, launchedRockBuster);
            this.rockBusterAmmo = this.rockBusterAmmo - 1;
            fk.b(0);
            this.rockBusterCooldownTicks = 24;
          }
        }
        var6 = 0;
        while (var6 < this.levelObjects.size()) {
          LevelObject turret = (LevelObject) (this.levelObjects.elementAt(var6));
          int stackIn_713_0 = turret.objectType;
          int stackIn_713_1 = 2;
          if (stackIn_713_0 == stackIn_713_1) {
            if (turret.shotCooldownTicks > 0) {
              turret.shotCooldownTicks = turret.shotCooldownTicks - 1;
            } else if (!this.shipDestroyed) {
              SpriteOffset muzzleOffset = ValidationState.a(turret.spriteFrame, 16384);
              if (muzzleOffset != null) {
                int var9Lifetime8 = turret.x + muzzleOffset.x << 16;
                int var10Lifetime5 = muzzleOffset.y + turret.y << 16;
                int var11Lifetime4 = this.shipXQ16 - var9Lifetime8;
                var12 = this.shipYQ16 - var10Lifetime5;
                if (!(var11Lifetime4 >= (-this.worldWidth << 15))) {
                  var11Lifetime4 = var11Lifetime4 + (this.worldWidth << 16);
                } else if (var11Lifetime4 >= (this.worldWidth << 15)) {
                  var11Lifetime4 = var11Lifetime4 - (this.worldWidth << 16);
                }
                double var13Lifetime1 = (double)var11Lifetime4;
                double var15Lifetime1 = (double)var12;
                double var17Lifetime1 = Math.sqrt(var15Lifetime1 * var15Lifetime1 + var13Lifetime1 * var13Lifetime1);
                if (13107200.0 > var17Lifetime1) {
                  var13Lifetime1 = var13Lifetime1 / var17Lifetime1;
                  var15Lifetime1 = var15Lifetime1 / var17Lifetime1;
                  int var11Lifetime4Lifetime1 = (int)(131072.0 * var13Lifetime1);
                  var12 = (int)(var15Lifetime1 * 131072.0);
                  if (this.isTerrainRayClear((int)var17Lifetime1 >> 17, var12, 5 * var12 + var10Lifetime5, 5 * var11Lifetime4Lifetime1 + var9Lifetime8, var11Lifetime4Lifetime1, 0)) {
                    this.spawnBullet(var10Lifetime5 + 5 * var12, var11Lifetime4Lifetime1 * 5 + var9Lifetime8, var12, 256, 1, var11Lifetime4Lifetime1);
                    turret.shotCooldownTicks = 49;
                    pl.field_n.playSampleWithPan(ShipHullGeometry.field_j, 100, this.spatialVolume(6553600, var9Lifetime8, 96, var10Lifetime5), this.spatialPan(var9Lifetime8, 120));
                  }
                }
              }
            }
          }
          var6++;
        }
        this.updateCountdown((byte) 109);
        if (null != this.selfDestructEffects) {
          this.selfDestructEffects.c(-1);
        }
        this.updateMissionOutcome(0);
        int stackIn_713_0Lifetime1 = guard;
        int stackIn_713_1Lifetime1 = -7;
        if (stackIn_713_0Lifetime1 > stackIn_713_1Lifetime1) {
          return;
        }
        PcmSampleStream stackIn_717_0 = this.field_Z;
        int stackIn_717_1 = var4;
        if (var4 == 0) {
          stackIn_718_2 = 8192;
        } else {
          stackIn_718_2 = var5 / var4;
        }
        ((PcmSampleStream) (Object) stackIn_717_0).setVolumeAndPanQ6(stackIn_717_1, stackIn_718_2);
        this.exhaustWriteIndex = (64 + this.exhaustWriteIndex) % 512;
        if (this.scoringEnabled &&
          this.levelIndex >= 0) {
          this.updateCampaignBestScore(false);
        }
        this.updateNotices((byte) 9);
        if (!ScoreSubmission.field_h[82]) {
          ScoreSubmission.field_p = false;
        }
        if (!ScoreSubmission.field_h[84]) {
          Js5NetworkRequest.field_E = false;
        }
        if (!ScoreSubmission.field_h[83]) {
          bc.field_d = false;
        }
        return;
    }

    private final void scanShieldContactTile(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        Object var18 = null;
        int var19 = EscapeVector.obfuscationControl;
        if (param6 <= 115) {
          return;
        }
        int[] var20 = this.terrainTile(param4, -1, param0);
        int[] var22 = var20;
        int[] var21 = var22;
        int[] var10 = var21;
        if (var20 == null &&
          0 == Bullet.collisionLaserCount) {
          return;
        }
        param0 = param0 << 16;
        param4 = param4 << 16;
        int var11 = param1;
        while (true) {
          int stackIn_8_0 = ~param8;
          int stackIn_8_1 = ~var11;
          if (stackIn_8_0 > stackIn_8_1) {
            return;
          }
          int var12 = param7;
          while (true) {
            int stackIn_11_0 = ~var12;
            int stackIn_11_1 = ~param2;
            if (stackIn_11_0 < stackIn_11_1) {
              var11++;
              break;
            }
            int var13 = param0 + (var12 << 11) - param3;
            int var14 = -param5 + (var11 << 11) + param4;
            int var15 = var13 * var13 + var14 * var14;
            int stackIn_8_0Lifetime1 = var15;
            int stackIn_8_1Lifetime1 = 603979776;
            if (stackIn_8_0Lifetime1 < stackIn_8_1Lifetime1) {
              if (var10 != null &&
                this.maskPixelIsSolid(var22, var12, (byte) -74, var11)) {
                this.collisionNormalX = this.collisionNormalX + var13;
                this.collisionNormalY = this.collisionNormalY + var14;
              } else {
                IntrusiveNode var16 = IntrusiveDeque.field_f.first(false);
                for (int var17 = 0; Bullet.collisionLaserCount > var17; var17++) {
                  LaserGateSpan var18_ref = (LaserGateSpan) (var16);
                  int stackIn_11_0Lifetime1 = ~var18_ref.y;
                  int stackIn_11_1Lifetime1 = ~var14;
                  if (stackIn_11_0Lifetime1 == stackIn_11_1Lifetime1 &&
                    var18_ref.leftX <= var13 &&
                    var18_ref.rightX > var13) {
                    this.collisionNormalX = this.collisionNormalX + var13;
                    this.collisionNormalY = this.collisionNormalY + var14;
                    break;
                  }
                  var16 = var16.next;
                }
              }
            }
            var12++;
          }
        }
    }

    private final void drawHudPanels(int guard) {
        int stackIn_16_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_4 = 0;
        BinaryBitmapFont var13 = fh.field_g;
        int var3 = var13.stringWidth(di.field_b);
        int var4 = var13.stringWidth(TextWidgetPainter.field_p);
        if (var4 > var3) {
          var3 = var4;
        }
        int var5 = var13.stringWidth("0000");
        int var6 = 40;
        int var7 = 18;
        if (0 < this.rockBusterAmmo) {
          int var4Lifetime1 = var13.stringWidth(FullscreenFocusCanvas.field_f);
          var6 = var6 + var7;
          if (var3 < var4Lifetime1) {
            var3 = var4Lifetime1;
          }
        }
        if (this.objectiveType == 1) {
          var6 = var6 + var7;
          int var4Lifetime2 = var13.stringWidth(IntrusiveNode.field_f);
          if (var3 < var4Lifetime2) {
            var3 = var4Lifetime2;
          }
        }
        int var8 = 0;
        if (var8 >= 20) {
          stackIn_16_0 = 0;
        } else {
          stackIn_16_0 = (-var8 + 20) * 160 / 20;
        }
        int var9 = stackIn_16_0;
        if (guard != 3) {
          this.rockBusterAmmo = 30;
        }
        GameAppletShell.a(var9, -4, -4, 6320248, -2, var6 + 6, guard ^ -2, var5 + var3 + 6 + 10, 12110032, 3160124, 2 * var8);
        int var10 = 22;
        var13.drawRight(di.field_b, var3 + 6, var10, 10004656, -1);
        var13.drawLeft(Integer.toString(this.fuel), 6 + var3, var10, 16777215, -1);
        var10 = var10 + var7;
        var13.drawRight(TextWidgetPainter.field_p, var3 + 6, var10, 10004656, -1);
        var13.drawLeft(Integer.toString(this.shieldEnergy + this.shieldEnergy), 6 + var3, var10, 16777215, -1);
        var10 = var10 + var7;
        if (this.rockBusterAmmo > 0) {
          var13.drawRight(FullscreenFocusCanvas.field_f, var3 + 6, var10, 10004656, -1);
          var13.drawLeft(Integer.toString(this.rockBusterAmmo), 6 + var3, var10, 16777215, -1);
          var10 = var10 + var7;
        }
        if (this.objectiveType == 1) {
          int var11_int = 0;
          if (this.missionTargets != null) {
            var11_int = this.missionTargets.size((byte) 49);
          }
          var13.drawRight(IntrusiveNode.field_f, 6 + var3, var10, 10004656, -1);
          var13.drawLeft(Integer.toString(var11_int), var3 + 6, var10, 16777215, -1);
          var10 = var10 + var7;
        }
        int var3Lifetime1 = var13.stringWidth(jf.field_K);
        int var4Lifetime3 = var13.stringWidth(vd.field_c);
        int var5Lifetime1 = var13.stringWidth(Integer.toString(this.levelIndex + 1));
        if (var3Lifetime1 < var4Lifetime3) {
          var3Lifetime1 = var4Lifetime3;
        }
        int var4Lifetime4 = var13.stringWidth(Integer.toString(this.livesRemaining));
        if (var5Lifetime1 < var4Lifetime4) {
          var5Lifetime1 = var4Lifetime4;
        }
        int var6Lifetime1 = 40;
        String var11 = this.formatSessionTime(true);
        var6Lifetime1 += 18;
        int var4Lifetime5 = var13.stringWidth(ShipHullGeometry.field_a);
        if (var4Lifetime5 > var3Lifetime1) {
          var3Lifetime1 = var4Lifetime5;
        }
        int var4Lifetime6 = var13.stringWidth(Integer.toString(this.levelScore + this.score));
        if (var5Lifetime1 < var4Lifetime6) {
          var5Lifetime1 = var4Lifetime6;
        }
        if (SpriteState.field_r ||
          this.countdownActive) {
          var6Lifetime1 += 18;
          int var4Lifetime7 = var13.stringWidth(CheckboxPainter.field_f);
          if (var3Lifetime1 < var4Lifetime7) {
            var3Lifetime1 = var4Lifetime7;
          }
          int var4Lifetime7Lifetime1 = var13.stringWidth(var11);
          if (var5Lifetime1 < var4Lifetime7Lifetime1) {
            var5Lifetime1 = var4Lifetime7Lifetime1;
          }
        }
        int var8Lifetime1 = 0;
        if (20 > var8Lifetime1) {
          stackIn_44_0 = (3200 - var8Lifetime1 * 160) / 20;
        } else {
          stackIn_44_0 = 0;
        }
        int var9Lifetime1 = stackIn_44_0;
        GameAppletShell.a(var9Lifetime1, 634 - var5Lifetime1 - var3Lifetime1 - 10, -4, 6320248, -2, var6Lifetime1 + 6, -3, 644, 12110032, 3160124, var8Lifetime1 * 2);
        var13.drawRight(jf.field_K, -var5Lifetime1 + 634, 22, 10004656, -1);
        var13.drawLeft(Integer.toString(this.levelIndex + 1), -var5Lifetime1 + 634, 22, 16777215, -1);
        var13.drawRight(vd.field_c, -var5Lifetime1 + 634, 40, 10004656, -1);
        var13.drawLeft(Integer.toString(this.livesRemaining), -var5Lifetime1 + 634, 40, 16777215, -1);
        var13.drawRight(ShipHullGeometry.field_a, -var5Lifetime1 + 634, 58, 10004656, -1);
        BinaryBitmapFont stackIn_47_0 = var13;
        String stackIn_47_1 = Integer.toString(this.score + this.levelScore);
        int stackIn_47_2 = -var5Lifetime1 + 634;
        int stackIn_47_3 = 58;
        stackIn_48_4 = (!this.timeHackMode &&
          !this.scoringEnabled) ? (4227327) : (16777215);
        ((BinaryBitmapFont) (Object) stackIn_47_0).drawLeft(stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_48_4, -1);
        if (SpriteState.field_r ||
          this.countdownActive) {
          int var12 = this.countdownColor((byte) 114, 50, 16777215, 16711680);
          var13.drawRight(CheckboxPainter.field_f, -var5Lifetime1 + 634, 76, 10004656, -1);
          var13.drawLeft(var11, -var5Lifetime1 + 634, 76, var12, -1);
        }
    }

    private final void initializeSessionOption(byte guard, int option) {
        if (guard != 84) {
          this.laserCycleTicks = 82;
        }
        if (1 == option) {
        }
        if (0 != option) {
        }
    }

    private final void initializeCurrentLevel(byte guard) {
        this.resetSessionEffects(24661, true);
        if (this.levelIndex >= 0) {
          this.loadCurrentLevel(guard - 17);
        } else {
          this.buildTutorialTerrain((byte) -120);
        }
        this.initializeLevelObjects(true, 19);
        if (guard != -110) {
          this.queueRetrievalChapterIntro(110);
        }
    }

    private final boolean isRockBusterKeyDown(byte guard) {
        int var2 = -2 / ((guard + 28) / 60);
        if (!Js5NetworkRequest.field_E &&
          ScoreSubmission.field_h[84]) {
          return true;
        }
        if (ScoreSubmission.field_h[LegacyTextBlock.field_a]) {
          return true;
        }
        if (ScoreSubmission.field_h[86]) {
          return true;
        }
        return false;
    }

    final void stopSessionAudio(byte guard) {
        Throwable decompiledCaughtException = null;
        int var5 = EscapeVector.obfuscationControl;
        this.silenceSampleStream(guard + 45, this.field_jb);
        if (guard != -41) {
          return;
        }
        this.silenceSampleStream(4, this.field_Z);
        this.silenceSampleStream(4, this.field_v);
        this.silenceSampleStream(4, this.field_R);
        this.silenceSampleStream(4, this.field_f);
        if (null != this.field_Eb) {
          this.field_Eb.setLoopCount(0);
          this.field_Eb = null;
        }
        this.silenceSampleStream(4, this.field_Wb);
        this.silenceSampleStream(4, this.field_wb);
        if (this.field_r != null) {
          this.field_r.rampVolumeQ6(AudioOutput.sampleRate / 100, 0);
        }
        if (this.field_lc != null) {
          this.silenceSampleStream(guard ^ -45, this.field_lc);
        }
        if (null != this.field_fb) {
          this.field_fb.field_l = 0;
        }
        if (null != this.rockBusters) {
          Object var2 = pl.field_n;
          synchronized (var2) {
            RockBuster var3 = (RockBuster) (this.rockBusters.first(false));
            while (var3 != null) {
              if (var3.remainingFlightTicks != 0 &&
                var3.flightSound.isLinked((byte) 48)) {
                pl.field_n.removeSubstream(var3.flightSound);
                var3.field_h = true;
              }
              var3 = (RockBuster) (this.rockBusters.next((byte) 70));
            }
            SeekerMine var3_ref = (SeekerMine) (this.seekerMines.first(false));
            while (var3_ref != null) {
              if (null != var3_ref.flightSound) {
                pl.field_n.removeSubstream(var3_ref.flightSound);
                pl.field_n.removeSubstream(var3_ref.proximitySound);
                var3_ref.flightSound = null;
                var3_ref.proximitySound = null;
              }
              var3_ref = (SeekerMine) (this.seekerMines.next((byte) 70));
            }
          }
        }
    }

    private final void resetShipState(byte guard) {
        this.shieldEnergy = this.initialShieldEnergy;
        this.field_M = 0;
        this.triShotEnabled = false;
        this.rockBusterAmmo = 0;
        this.shieldActive = false;
        this.thrustAccelerationQ16 = 1700;
        this.shipAngle256 = 0;
        this.pickupAnimationTicks = 0;
        this.fuel = this.initialFuel;
        this.field_Kb = 0;
        this.shipVelocityYQ16 = 0;
        if (guard > -71) {
          this.laserGateCount = 121;
        }
        this.shipVelocityXQ16 = 0;
        this.shipXQ16 = this.spawnXQ16;
        this.cargoLost = false;
        this.hudMessageText = null;
        this.tetheredObjectType = -1;
        this.shotCooldownTicks = -1;
        this.hudMessageTicks = 0;
        this.shipYQ16 = this.spawnYQ16;
        this.rockBusters = new IntrusiveDeque();
        this.leftLandingContact = false;
        this.rockBusterCooldownTicks = 0;
        this.shipDestroyed = false;
        this.rightLandingContact = false;
        this.levelEnded = false;
        this.fatalHullContact = false;
        this.bullets = new IntrusiveDeque();
        this.activeBulletCount = 0;
        this.lastActiveBullet = null;
        this.bulletCapacity = 0;
        IntrusiveDeque.field_f = new IntrusiveDeque();
        aa.field_a = 0;
        Bullet.collisionLaserCount = 0;
    }

    private final void drawBullets(int cameraX, int cameraY, int firstIndex) {
        int var7 = EscapeVector.obfuscationControl;
        IntrusiveNode var4 = this.bullets.first(false);
        for (int var5 = firstIndex; this.activeBulletCount > var5; var5++) {
          Bullet var6 = (Bullet) (var4);
          var6.draw(cameraX, false, cameraY);
          var4 = var4.next;
        }
    }

    private final void destroyTetheredObject(byte guard) {
        if (this.easyMode &&
          this.tetheredObjectType == 1) {
          return;
        }
        if (!this.shipDestroyed) {
          int var2_int = ResourceArchive.objectScore(this.gameMode, this.tetheredObjectType, -2);
          this.levelScore = this.levelScore + var2_int;
          v.a(8, var2_int);
        }
        Sprite var3 = mb.field_f[this.tetheredObjectType];
        Sprite var2 = var3;
        this.spawnSpriteDebris(-(var3.fullWidth << 15) + this.tetheredXQ16 >> 16, -28311553, var2, -(var3.fullHeight << 15) + this.tetheredYQ16 >> 16, sf.field_e[this.tetheredObjectType]);
        if (this.tetheredObjectType == 1) {
          this.markCargoLost(0);
        }
        if (guard < 6) {
          return;
        }
        this.tetheredObjectType = -1;
        if (!this.shipDestroyed) {
          pl.field_n.playSampleWithPan(bc.field_c, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
        }
    }

    private final void collectCollisionLaserSpans(int guard, int bottomY, int topY, int leftX, int rightX) {
        int var12;
        int var13 = EscapeVector.obfuscationControl;
        Bullet.collisionLaserCount = 0;
        Object var6 = null;
        if (50 <= this.laserCycleTicks) {
          return;
        }
        IntrusiveNode var7 = this.laserGateSpans.first(false);
        int var8 = 0;
        while (this.laserGateCount > var8) {
          LaserGateSpan var9_ref_am = (LaserGateSpan) (var7);
          int var10 = var9_ref_am.y;
          int stackIn_18_0 = topY;
          int stackIn_18_1 = var10;
          if (stackIn_18_0 <= stackIn_18_1 &&
            var10 <= bottomY) {
            int var11 = var9_ref_am.leftX;
            for (var12 = var9_ref_am.rightX; leftX < var12; var12 = var12 - this.worldWidth) {
              var11 = var11 - this.worldWidth;
            }
            while (leftX >= var12) {
              var12 = var12 + this.worldWidth;
              var11 = var11 + this.worldWidth;
            }
            while (rightX >= var11) {
              var6 = this.appendCollisionLaserSpan((IntrusiveNode) (var6), var12, var11, true, var10);
              var11 = var11 + this.worldWidth;
              var12 = var12 + this.worldWidth;
            }
          }
          var8++;
          var7 = var7.next;
        }
        int stackIn_18_0Lifetime1 = -42;
        int stackIn_18_1Lifetime1 = (45 - guard) / 34;
        int var9 = stackIn_18_0Lifetime1 / stackIn_18_1Lifetime1;
        return;
    }

    private final void markCargoLost(int objectiveType) {
        if (this.objectiveType != objectiveType) {
          return;
        }
        this.cargoLost = true;
        if (!this.shipDestroyed) {
          this.showHudMessage(50, 0 > this.levelIndex ? qc.field_xb : EmailSyntaxValidator.field_n);
        }
    }

    private final void applyPowerup(int guard, int objectType) {
        this.applyShieldPickup(objectType, (byte) -111);
        this.applyTriShotPickup(objectType, (byte) 59);
        this.applyEngineBoostPickup(false, objectType);
        this.applyRockBusterPickup(320, objectType);
        if (guard > -70) {
          this.sessionGuardNoOp(44);
        }
    }

    private final void queueRetributionBriefing(int guard) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.gameMode != 2) {
          return;
        }
        if (guard != 10974) {
          this.queueCampaignConclusion(-55);
        }
        Sprite[] var12 = SpriteCheckboxPainter.field_c;
        if (this.levelIndex < 4) {
          int[] var35 = uj.field_e;
          String[] var22 = lh.field_c;
          DialogueScreen var23 = new DialogueScreen(var35, var12, var22, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var23);
        } else if (this.levelIndex < 8) {
          int[] var34 = p.field_j;
          String[] var19 = HudMessage.field_j;
          DialogueScreen var20 = new DialogueScreen(var34, var12, var19, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var20);
        } else if (this.levelIndex < 12) {
          int[] var33 = ha.field_e;
          String[] var16 = pc.field_b;
          DialogueScreen var17 = new DialogueScreen(var33, var12, var16, false);
          GradientOutlineTextPainter.enqueueDialogue(1820, var17);
        } else {
          int[] var32 = w.field_bb;
          String[] var13 = vd.field_i;
          DialogueScreen var14 = new DialogueScreen(var32, var12, var13, false);
          GradientOutlineTextPainter.enqueueDialogue(guard - 9154, var14);
        }
    }

    private final void rasterizeShipHull(int leftColor, int[] pixels, byte guard, int stride, int rightColor, ShipHullGeometry geometry) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          IntPoint var14 = geometry.boundsMin;
          if (guard != 43) {
            return;
          }
          IntPoint var8 = geometry.boundsMax;
          int var9 = var14.y * stride;
          int var10 = var14.y;
          while (true) {
            if (var8.y < var10) {
              return;
            }
            int var11 = var14.x;
            while (var11 <= var8.x) {
              int var12 = this.classifyShipPixel(geometry, (byte) 15, var10, var11);
              int stackIn_15_0 = ~var12;
              int stackIn_15_1 = -1;
              if (stackIn_15_0 < stackIn_15_1) {
                pixels[var9 + var11] = rightColor;
              }
              if (0 > var12) {
                pixels[var9 + var11] = leftColor;
              }
              var11++;
            }
            int stackIn_15_0Lifetime1 = var9;
            int stackIn_15_1Lifetime1 = stride;
            var9 = stackIn_15_0Lifetime1 + stackIn_15_1Lifetime1;
            var10++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var7;
          StringBuilder stackIn_19_1 = new StringBuilder().append("oe.IC(").append(leftColor).append(',');
          if (pixels == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(stride).append(',').append(rightColor).append(',');
          if (geometry == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void scanShieldTerrainContacts(byte param0) {
        int var11 = EscapeVector.obfuscationControl;
        int var2 = this.shipXQ16 >> 5;
        var2 = var2 + (this.worldWidth << 11);
        int var3 = this.shipYQ16 >> 5;
        int var4 = var2 - 24576;
        int var5 = -24576 + var3;
        int var6 = 24576 + var2;
        var4 = var4 >> 11;
        int var7 = 24576 + var3;
        var6 = var6 >> 11;
        var5 = var5 >> 11;
        var7 = var7 >> 11;
        if (param0 < 55) {
          this.rockBusters = (IntrusiveDeque) null;
        }
        this.collectCollisionLaserSpans(98, var7, var5, var4, var6);
        IntrusiveNode var8 = IntrusiveDeque.field_f.first(false);
        for (int var9 = 0; var9 < Bullet.collisionLaserCount; var9++) {
          LaserGateSpan var10 = (LaserGateSpan) (var8);
          var10.leftX = -var2 + (var10.leftX << 11);
          var10.rightX = -var2 + (var10.rightX << 11);
          var8 = var8.next;
          var10.y = (var10.y << 11) - var3;
        }
        if ((var6 ^ var4) >> 5 == 0) {
          this.scanShieldTileRows(var5, 31 & var6, var2, var3, var4 >> 5, true, var7, 31 & var4);
        } else {
          this.scanShieldTileRows(var5, 31, var2, var3, var4 >> 5, true, var7, var4 & 31);
          this.scanShieldTileRows(var5, var6 & 31, var2, var3, var6 >> 5, true, var7, 0);
        }
    }

    private final void recordMissionTargetDestroyed(LevelObject object, PointCloudEffect effect, int guard) {
        String stackIn_27_2 = null;
        String stackIn_30_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (~this.objectiveType != guard) {
            return;
          }
          if (this.missionTargets == null) {
            return;
          }
          if (this.missionTargets.isEmpty(-113)) {
            return;
          }
          if (object == null) {
            return;
          }
          if (!object.missionTarget) {
            return;
          }
          IntrusiveNode var4 = this.missionTargets.first(false);
          while (true) {
            if (var4 == null) {
              return;
            }
            LevelObject var5 = (LevelObject) (var4);
            if (var5.objectId != object.objectId) {
              var4 = this.missionTargets.next((byte) 70);
              continue;
            }
            break;
          }
          if (object.triggersCountdown) {
            this.activateCountdown(27, 2);
          }
          var4.unlink((byte) -101);
          this.pendingTargetEffects.addLast(guard + 1, effect);
          this.showHudMessage(-111, oi.field_J);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var4_ref;
          StringBuilder stackIn_26_1 = new StringBuilder().append("oe.UB(");
          if (object == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          StringBuilder stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (effect == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(guard).append(')').toString());
        }
    }

    final int spatialPan(int xQ16, int guard) {
        int var4 = EscapeVector.obfuscationControl;
        for (xQ16 = xQ16 - this.shipXQ16; (-this.worldWidth << 15) > xQ16; xQ16 = xQ16 + (this.worldWidth << 16)) {
        }
        while (this.worldWidth << 15 < xQ16) {
          xQ16 = xQ16 - (this.worldWidth << 16);
        }
        if (xQ16 < -this.worldWidth << 14) {
          xQ16 = -xQ16 + (-this.worldWidth << 15);
        }
        if (xQ16 > this.worldWidth << 14) {
          xQ16 = (this.worldWidth << 15) - xQ16;
        }
        if (xQ16 <= -20971520) {
          return 0;
        }
        if (xQ16 >= 20971520) {
          return 16384;
        }
        if (guard <= 94) {
          return 5;
        }
        return 8192 + xQ16 / 2560;
    }

    private final void showObjectiveMessage(boolean guard) {
        if (0 == this.objectiveType) {
          this.queueHudMessage(164, (byte) 127, tf.field_i);
        }
        if (1 == this.objectiveType) {
          this.queueHudMessage(164, (byte) 92, PairedTextColumns.field_r);
        }
        if (guard) {
          this.destroyLevelObjectAtPoint(70, -118, 0);
        }
    }

    private final int[] initialTerrainTile(int tileX, byte guard, int tileY) {
        int[] stackIn_7_0 = null;
        if (guard != -82) {
          return (int[]) null;
        }
        if (tileY < 0) {
          return null;
        }
        if (this.initialTilesHigh > tileY) {
          stackIn_7_0 = this.initialTerrainMasks[tileY * this.tilesWide + tileX % this.tilesWide];
        } else {
          stackIn_7_0 = QuickChatPhraseDefinition.fullTileMask;
        }
        return stackIn_7_0;
    }

    private final boolean spriteOverlapsTerrainOrLasers(int x, Sprite sprite, int y, int lastColumnAdjustment) {
        String stackIn_12_2 = null;
        try {
          x = x + sprite.offsetX;
          y = y + sprite.offsetY;
          int var5_int = lastColumnAdjustment + (sprite.width + x);
          int var6 = -1 + (y + sprite.height);
          this.collectCollisionLaserSpans(96, var6, y, x, var5_int);
          if ((var5_int ^ x) >> 5 == 0) {
            boolean stackIn_8_0 = this.spriteOverlapsTerrainColumns(sprite, x >> 5, y, 31 & x, -(31 & x), var6, 31, 31 & var5_int);
            return stackIn_8_0;
          }
          if (this.spriteOverlapsTerrainColumns(sprite, x >> 5, y, 31 & x, -(31 & x), var6, 31, 31)) {
            return true;
          }
          boolean stackIn_6_0 = this.spriteOverlapsTerrainColumns(sprite, var5_int >> 5, y, 0, -x & 31, var6, 31, 31 & var5_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("oe.EE(").append(x).append(',');
          if (sprite == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(y).append(',').append(lastColumnAdjustment).append(')').toString());
        }
    }

    private final void submitCampaignScore(byte guard, int score, int levelIndex) {
        regionExit1: {
          if (this.scoringEnabled) {
            if (score <= 0) {
              int var4 = -40 % ((guard - 78) / 38);
              break regionExit1;
            }
            if (levelIndex < 0) {
              pf.a(false, "EV1: " + score, (Throwable) null);
              return;
            }
            int var4Lifetime2 = this.firstLevelIndex;
            if (var4Lifetime2 < 0) {
              var4Lifetime2 = 0;
            }
            score = DialogueScreen.a(this.gameMode, (byte) 126, score);
            int var5 = -var4Lifetime2 + levelIndex;
            int var6 = var5 + 50 * (levelIndex + score * 50);
            int var7 = al.a(this.gameMode, 26504);
            if (var7 < 0) {
              return;
            }
            lh.a((byte) 99, score);
            int[] var11 = jm.j(-3282);
            int[] var10 = var11;
            int[] var8 = var10;
            if (var8 == null) {
              return;
            }
            if (4 != var11.length) {
              return;
            }
            IntValueNode.field_i = new ScoreSubmission(var7, var7 ^ 65535, var11[0], var11[1], var11[2], var11[3], new int[]{var6});
            if (!aj.b(-98)) {
              ml.a(IntValueNode.field_i, 3, (byte) 101);
            }
          }
          int var4Lifetime1 = -40 % ((guard - 78) / 38);
        }
    }

    private final void removeFinishedTargetEffect(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.pendingTargetEffects == null) {
          return;
        }
        if (this.pendingTargetEffects.isEmpty(-182442704)) {
          return;
        }
        DualLinkNode var2 = this.pendingTargetEffects.first(0);
        while (var2 != null) {
          PointCloudEffect var3 = (PointCloudEffect) (var2);
          boolean stackOut_5_0 = var3.field_B;
          int stackIn_10_0 = stackOut_5_0 ? 1 : 0;
          boolean stackIn_6_0 = stackOut_5_0;
          if (!stackIn_6_0) {
            var2 = this.pendingTargetEffects.next((byte) 124);
            continue;
          }
          var2.unlinkSecondary(guard ^ 20281);
          return;
        }
        int stackIn_10_0Lifetime1 = guard;
        if (stackIn_10_0Lifetime1 != -20320) {
          this.finishPendingBonuses((byte) 44);
        }
        return;
    }

    private final void updateCountdown(byte guard) {
        if (this.countdownTrigger == 0) {
          return;
        }
        if (guard <= 99) {
          return;
        }
        if (this.countdownActive &&
          0 <= this.countdownTicks) {
          this.countdownTicks = this.countdownTicks - 1;
          if (this.countdownTicks < 0 &&
            !this.shipDestroyed) {
            this.destroyShip((byte) -79);
          }
        }
    }

    private final boolean repeatSkyLayerVertically(byte guard) {
        if (this.levelIndex < 0) {
          return true;
        }
        if (guard != 90) {
          return true;
        }
        if (this.secondaryTheme != 6) {
          return false;
        }
        return true;
    }

    private final void buildTutorialTerrain(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.tutorialStep >= 2) {
          this.tutorialStep = 2;
        } else {
          this.tutorialStep = 0;
        }
        this.displayedTutorialStep = -1;
        this.tilesWide = 32;
        this.worldWidth = this.tilesWide << 5;
        this.tilesHigh = 32;
        this.worldHeight = this.tilesHigh << 5;
        this.secondaryTheme = 5;
        this.terrainTheme = 5;
        TextLayoutLine.b(1, 0);
        this.terrainMasks = new int[this.tilesHigh * this.tilesWide][];
        for (int var2 = 0; 4 > var2; var2++) {
          for (int var3 = 0; var3 < 15; var3++) {
            this.terrainMasks[this.tilesWide * var2 + var3] = QuickChatPhraseDefinition.fullTileMask;
          }
          for (int var3Lifetime3 = 17; 32 > var3Lifetime3; var3Lifetime3++) {
            this.terrainMasks[var3Lifetime3 + this.tilesWide * var2] = QuickChatPhraseDefinition.fullTileMask;
          }
        }
        if (guard > -29) {
          this.spawnXQ16 = -97;
        }
        for (int var2Lifetime1 = 4; var2Lifetime1 < 32; var2Lifetime1++) {
          for (int var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.terrainMasks[var2Lifetime1 * this.tilesWide + var3Lifetime1] = QuickChatPhraseDefinition.fullTileMask;
          }
          for (int var3Lifetime1Lifetime1 = 24; var3Lifetime1Lifetime1 < 32; var3Lifetime1Lifetime1++) {
            this.terrainMasks[var2Lifetime1 * this.tilesWide + var3Lifetime1Lifetime1] = QuickChatPhraseDefinition.fullTileMask;
          }
        }
        for (int var2Lifetime2 = 14; var2Lifetime2 < 18; var2Lifetime2++) {
          this.terrainMasks[9 * this.tilesWide + var2Lifetime2] = QuickChatPhraseDefinition.fullTileMask;
        }
        for (int var2Lifetime3 = 14; var2Lifetime3 < 18; var2Lifetime3++) {
          this.terrainMasks[var2Lifetime3 + this.tilesWide * 15] = QuickChatPhraseDefinition.fullTileMask;
        }
        this.snapshotTerrain((byte) 124);
        int var2Lifetime4 = 2;
        int var3Lifetime2 = 0;
        this.levelObjects.setSize(var2Lifetime4);
        int incrementValue$0 = var3Lifetime2;
        var3Lifetime2++;
        LevelObject var6 = new LevelObject(incrementValue$0, 8, 480, -mb.field_f[8].fullHeight + 128);
        this.levelObjects.setElementAt(var6, 0);
        int incrementValue$1 = var3Lifetime2;
        var3Lifetime2++;
        LevelObject var7 = new LevelObject(incrementValue$1, 1, 512 - mb.field_f[1].fullWidth / 2, 480 - mb.field_f[1].fullHeight);
        this.levelObjects.setElementAt(var7, 1);
        this.seekerMines = new IntrusiveDeque();
        this.spawnYQ16 = 66715648;
        this.gravityQ16 = 512;
        this.spawnXQ16 = this.worldWidth << 15;
        this.initialShieldEnergy = 150;
        this.initialFuel = 2500;
        this.shipLanded = true;
    }

    private final void renderShipHull(int cameraY, Sprite targetSprite, int color, int cameraX) {
        String stackIn_46_2 = null;
        int[] var25 = null;
        int var26 = 0;
        int var33 = EscapeVector.obfuscationControl;
        try {
          double var5_double = (double)this.shipAngle256 * 0.02454369260617026;
          int var7 = (int)(Math.sin(var5_double) * 2048.0);
          int var8 = -(int)(Math.cos(var5_double) * 2048.0);
          int var9 = -var8;
          int var10 = var7;
          int var11 = this.shipXQ16 >> 5;
          int var12 = this.shipYQ16 >> 5;
          int var13 = var11 + 10 * var7;
          int var14 = -(var7 * 2) + var11;
          int var15 = var12 + var8 * 10;
          int var16 = -(var8 * 2) + var12;
          int var17 = -(6 * var7) + (var11 - 8 * var9);
          int var18 = var11 + (-(6 * var7) + 8 * var9);
          int var19 = -(var10 * 8) + (-(6 * var8) + var12);
          int var20 = 8 * var10 - var8 * 6 + var12;
          int var21 = var13;
          if (var21 > var17) {
            var21 = var17;
          }
          if (var18 < var21) {
            var21 = var18;
          }
          int var22 = var15;
          if (var19 < var22) {
            var22 = var19;
          }
          if (var22 > var20) {
            var22 = var20;
          }
          int var23 = var13;
          if (var23 < var17) {
            var23 = var17;
          }
          if (var18 > var23) {
            var23 = var18;
          }
          int var24 = var15;
          if (var19 > var24) {
            var24 = var19;
          }
          var21 = -cameraX + (var21 >> 11);
          if (var24 < var20) {
            var24 = var20;
          }
          var22 = -cameraY + (var22 >> 11);
          var23 = -cameraX + (var23 >> 11);
          var24 = -cameraY + (var24 >> 11);
          if (targetSprite != null) {
            targetSprite.offsetY = var22;
            var23 = var23 - var21;
            targetSprite.offsetX = var21;
            var24 = var24 - var22;
            var21 = var21 << 11;
            var22 = var22 << 11;
            var13 = var13 - var21;
            var11 = var11 - var21;
            var18 = var18 - var21;
            var14 = var14 - var21;
            var15 = var15 - var22;
            var20 = var20 - var22;
            var19 = var19 - var22;
            var16 = var16 - var22;
            var12 = var12 - var22;
            var17 = var17 - var21;
            targetSprite.height = 1 + var24;
            var21 = 0;
            targetSprite.width = var23 + 1;
            var22 = 0;
            targetSprite.fullHeight = targetSprite.height + targetSprite.offsetY;
            targetSprite.fullWidth = targetSprite.offsetX + targetSprite.width;
            int var27 = targetSprite.width * targetSprite.height;
            if (targetSprite.pixels.length >= var27) {
              for (int var28 = 0; var28 < var27; var28++) {
                targetSprite.pixels[var28] = 0;
              }
            } else {
              targetSprite.pixels = new int[var27];
            }
            var25 = targetSprite.pixels;
            var26 = targetSprite.width;
          } else {
            if (var22 < 0) {
              var22 = 0;
            }
            if (var23 > 639) {
              var23 = 639;
            }
            var25 = SoftwareRasterizer.pixels;
            if (var24 > 479) {
              var24 = 479;
            }
            var26 = 640;
            if (var21 < 0) {
              var21 = 0;
            }
          }
          int var27Lifetime1 = -(var9 >> 5) + (var7 >> 7);
          int var28Lifetime1 = -(var10 >> 5) + (var8 >> 7);
          int var29 = color * (-(var27Lifetime1 >> 1) + (128 - var28Lifetime1));
          int var27Lifetime2 = (var7 >> 7) + (var9 >> 5);
          int var28Lifetime2 = (var8 >> 7) + (var10 >> 5);
          int var30 = 65793 * (-var28Lifetime2 + (128 - (var27Lifetime2 >> 1)));
          if (this.usesDynamicTerrain(8192) &&
            se.field_b != null) {
            var30 = se.field_b.field_b;
            var29 = se.field_b.field_b;
          }
          ShipHullGeometry var32 = SpriteCheckboxPainter.field_b;
          var32.cameraOrigin.set(cameraX, color ^ 65913, cameraY);
          var32.nose.set(var13, 126, var15);
          var32.centerNotch.set(var14, color ^ 65914, var16);
          var32.leftWing.set(var17, 124, var19);
          var32.rightWing.set(var18, 125, var20);
          var32.boundsMin.set(var21, 127, var22);
          var32.boundsMax.set(var23, 122, var24);
          this.rasterizeShipHull(var29, var25, (byte) 43, var26, var30, var32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_45_0 = var5;
          StringBuilder stackIn_45_1 = new StringBuilder().append("oe.GA(").append(cameraY).append(',');
          if (targetSprite == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(color).append(',').append(cameraX).append(')').toString());
        }
    }

    GameplaySession(byte[][] levelData, int option, int gameMode, int levelIndex) {
        try {
          this.easyMode = false;
          this.scoringEnabled = true;
          this.timeHackMode = false;
          this.objectiveType = 0;
          this.levelObjects = new Vector();
          this.pointCloudEffects = new IntrusiveDeque();
          this.selfDestructEffects = new SelfDestructEffects(this);
          this.exhaustParticles = new PointCloudEffect(512);
          this.exhaustWriteIndex = 0;
          this.activeExhaustParticles = 0;
          this.lastActiveBullet = null;
          this.bullets = new IntrusiveDeque();
          this.livesRemaining = 3;
          this.hudMessageQueue = new IntrusiveDeque();
          this.countdownTicks = 0;
          this.countdownActive = false;
          this.displayedAchievementIds = new int[3];
          this.activeSessionTicks = 0;
          this.countdownTrigger = 0;
          this.pendingAchievementIds = new int[32];
          this.noticeSprite = new Sprite(638, 60);
          this.initialPowerups = new IntrusiveDeque();
          this.laserGateSpans = new IntrusiveDeque();
          try {
            SelfDestructEffects.field_k = l.a((byte) -111);
            if (SelfDestructEffects.field_k) {
              System.out.println("Mod logged in: Cheats activated");
            }
            this.field_jb = PcmSampleStream.createAtRatePercent(ValidationIndicator.field_N, 100, 0);
            this.field_jb.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_jb);
            this.field_Z = PcmSampleStream.createAtRatePercent(ng.field_mb, 100, 0);
            this.field_Z.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_Z);
            this.field_v = PcmSampleStream.createAtRatePercent(Bzip2State.field_G, 100, 0);
            this.field_v.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_v);
            this.field_Wb = PcmSampleStream.createAtRatePercent(vi.field_c, 100, 0);
            this.field_Wb.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_Wb);
            this.field_wb = PcmSampleStream.createAtRatePercent(w.field_hb, 100, 0);
            this.field_wb.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_wb);
            this.field_r = PcmSampleStream.createAtRatePercent(of.field_h, 100, 0);
            this.field_r.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_r);
            this.field_lc = PcmSampleStream.createAtRatePercent(pa.field_a, 100, 0);
            this.field_lc.setLoopCount(-1);
            pl.field_n.addSubstream(this.field_lc);
            this.field_fb = new TetherHumStream();
            pl.field_n.addSubstream(this.field_fb);
            NetworkGameClient.a(127, levelIndex);
            this.levelData = levelData;
            this.levelIndex = levelIndex;
            this.gameMode = gameMode;
            this.firstLevelIndex = levelIndex;
            this.initializeCurrentLevel((byte) -110);
            this.transitionTicks = 64;
            if (levelIndex >= 0) {
              this.queueHudMessage(164, (byte) 122, TetherHumStream.field_n);
              this.levelTitleTicks = 314;
            }
            this.initializeSessionOption((byte) 84, option);
            this.checkCampaignAchievements(0);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (levelData != null ? "{...}" : "null") + ',' + option + ',' + gameMode + ',' + levelIndex + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    GameplaySession(byte[][] levelData) {
        try {
          this.easyMode = false;
          this.scoringEnabled = true;
          this.timeHackMode = false;
          this.objectiveType = 0;
          this.levelObjects = new Vector();
          this.pointCloudEffects = new IntrusiveDeque();
          this.selfDestructEffects = new SelfDestructEffects(this);
          this.exhaustParticles = new PointCloudEffect(512);
          this.exhaustWriteIndex = 0;
          this.activeExhaustParticles = 0;
          this.lastActiveBullet = null;
          this.bullets = new IntrusiveDeque();
          this.livesRemaining = 3;
          this.hudMessageQueue = new IntrusiveDeque();
          this.countdownTicks = 0;
          this.countdownActive = false;
          this.displayedAchievementIds = new int[3];
          this.activeSessionTicks = 0;
          this.countdownTrigger = 0;
          this.pendingAchievementIds = new int[32];
          this.noticeSprite = new Sprite(638, 60);
          this.initialPowerups = new IntrusiveDeque();
          this.laserGateSpans = new IntrusiveDeque();
          try {
            this.levelData = levelData;
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (levelData != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_cc = "...";
        field_xb = new int[8192];
    }
}
