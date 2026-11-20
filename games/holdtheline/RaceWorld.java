/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class RaceWorld {
    int field_H;
    int field_g;
    int field_N;
    boolean field_f;
    private IndexedSprite roadLayerMask;
    private boolean field_c;
    private int field_P;
    int vehicleCount;
    int lapLimit;
    private Sprite bannerSprite;
    private boolean field_b;
    IntrusiveDeque resultObjects;
    int courseTheme;
    private int field_n;
    IntrusiveDeque[] trailParticles;
    private int[] field_x;
    int playerCount;
    private ue[] field_m;
    private int previousTutorialPage;
    private IntrusiveDeque pointLights;
    RoadSegment[] roadSegments;
    GrowableObjectList collisionBoundaryLoops;
    private int bannerTicks;
    int field_y;
    IntrusiveDeque[] lightParticles;
    int raceTicks;
    private int tutorialFlags;
    private int tutorialHighlight;
    static String navigationUrl;
    int field_p;
    private boolean field_kb;
    int field_l;
    static String field_K;
    private int lightningBrightness;
    private Vector2i shadowOffset;
    private int[] field_w;
    int tutorialPage;
    int gameMode;
    int field_t;
    private float field_A;
    private int[] field_eb;
    private int[] field_u;
    int[] field_rb;
    private int[] achievementQueue;
    IntrusiveDeque courseObjects;
    private int tutorialPageTicks;
    RaceVehicle[] vehicles;
    private int bannerCount;
    private byte field_L;
    private int ticks;
    private boolean paused;
    int field_hb;
    private int achievementTicks;
    IntrusiveDeque dynamicObjects;
    IntrusiveDeque[] sparkParticles;
    private Sprite lightMap;
    static IntrusiveDeque field_v;
    static String[][] field_gb;
    boolean raceFinished;
    private String[] banners;
    private GrowableObjectList roadBoundaryLoops;
    private boolean shadowsEnabled;
    private int achievementCount;
    boolean twoPlayerMode;
    boolean field_T;
    private int field_e;
    Sprite courseImage;
    private int tutorialHighlightAlpha;
    int field_ob;
    static String field_Z;
    RoadControlPointSpec[] field_i;
    private int field_X;

    private final void loadCourse(byte param0, int[] param1, CourseDefinition param2) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          RuntimeException var4_ref = null;
          try {
            try {
              this.decodeCourse(param2, param1, param0 ^ 39);
              if (param0 != 7) {
                this.drawTutorialCallout((String) null, -0.27448931336402893f, 32, (TutorialCalloutAnchor) null, (String) null);
              }
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException((String) null);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref;
            stackIn_9_1 = new StringBuilder().append("sg.R(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void applyLightMap(byte param0) {
        int dupTemp$1 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          this.lightMap.pixels[0] = 1;
          var7 = 307200;
          if (param0 > -7) {
            this.tutorialFlags = -116;
          }
          while (var7 > 0) {
            while (true) {
              if (var8 != 0) {
                return;
              }
              var7--;
              dupTemp$1 = this.lightMap.pixels[var7];
              var3 = dupTemp$1;
              if (dupTemp$1 == 0) {
                SoftwareRasterizer.pixels[var7] = 0;
                continue;
              }
              break;
            }
            var2_int = SoftwareRasterizer.pixels[var7];
            var6 = (var2_int & 255) * (255 & var3);
            var4 = (255 & var3 >> 16) * (16711680 & var2_int);
            var5 = ((var3 & 65280) >> 8) * (var2_int & 65280);
            SoftwareRasterizer.pixels[var7] = kc.a(kc.a(LoginChoicePanel.a(var4, -16777216), LoginChoicePanel.a(16711680, var5)), LoginChoicePanel.a(65280, var6)) >>> 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sg.MB(" + param0 + ')');
        }
    }

    private final int findTutorialPage(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param1 >= -109) {
            this.field_l = 103;
          }
          var3_int = 0;
          while (RasterBuffer.field_a.length > var3_int) {
            if (param0.equals(RasterBuffer.field_a[var3_int].tag)) {
              stackIn_10_0 = var3_int;
              return stackIn_10_0;
            }
            var3_int++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sg.I(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void queueBanner(String param0, byte param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (null == this.banners ||
            this.bannerCount >= this.banners.length) {
            var3_int = this.bannerCount + 1;
            var4 = new String[var3_int];
            var5 = 0;
            while (var5 < this.bannerCount) {
              var4[var5] = this.banners[var5];
              var5++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.banners = var4;
            }
          }
          if (param1 != 53) {
            this.sparkParticles = (IntrusiveDeque[]) null;
          }
          fieldTemp$1 = this.bannerCount;
          this.bannerCount = this.bannerCount + 1;
          this.banners[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void prepareCourseRendering(CourseDefinition param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.prepareCourseRendering(param0, 28978, false);
          var3_int = -22 / ((-32 - param1) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("sg.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawObjectLightShadow(int param0, int param1, int param2, byte param3, TrackObject param4, int param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11_int = 0;
        int[] var11 = null;
        float var12 = 0.0f;
        int[] var13_ref_int__ = null;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15_int = 0;
        float var15 = 0.0f;
        int var16_int = 0;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var7_intLifetime5;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        float var12Lifetime1;
        float var14Lifetime1;
        var18 = HoldTheLine.field_D;
        try {
          if (0 != (196608 & param4.flags)) {
            return;
          }
          var7_int = param4.position.x - param0;
          if (param3 != -35) {
            return;
          }
          var8 = param4.position.y - param1;
          var9 = (float)Math.sqrt((double)(var7_int * var7_int + var8 * var8));
          var10 = var9 / (float)param2;
          if (2.0f <= var10) {
            return;
          }
          var10 = 2.0f - var10;
          if (var10 > 1.0f) {
            var10 = 1.0f;
          }
          if (!param4.definition.rectangularCollision) {
            var11_int = param4.definition.collisionRadius / 2;
            if (var11_int < 4) {
              var11_int = 4;
            }
            var12 = (float)(6.283185307179586 / (double)var11_int);
            var13_ref_int__ = new int[var11_int * 4];
            var14 = 0.0f;
            var15_int = 0;
            while (true) {
              if (var11_int > var15_int) {
                var16_int = (int)((double)param4.position.x + (double)param4.definition.collisionRadius * Math.cos((double)var14));
                var7_intLifetime1 = var16_int - param0;
                var17_int = (int)((double)param4.position.y - (double)param4.definition.collisionRadius * Math.sin((double)var14));
                var13_ref_int__[var15_int * 4] = var16_int;
                var8Lifetime1 = var17_int - param1;
                var13_ref_int__[var15_int * 4 + 1] = var17_int;
                var13_ref_int__[2 + var15_int * 4] = var7_intLifetime1 / 4 + var16_int;
                var13_ref_int__[3 + 4 * var15_int] = var8Lifetime1 / 4 + var17_int;
                var14 = var14 + var12;
                var15_int++;
                if (var18 == 0) {
                  continue;
                }
              } else {
                var13_ref_int__ = TriangleMesh.convexHull(var13_ref_int__, (byte) -121);
              }
              break;
            }
            if (param5 > 256) {
              param5 = 256;
            }
            if (0 > param5) {
              param5 = 0;
            }
            lj.fillPolygonAlpha(0, (int)(var10 * (float)param5), 0, var13_ref_int__, (byte) -56, 0);
            if (var18 == 0) {
              return;
            }
          }
          var11 = new int[16];
          var12Lifetime1 = param4.direction.x;
          var13 = param4.direction.y;
          var14Lifetime1 = -var13;
          var15 = var12Lifetime1;
          var16 = (float)param4.definition.field_m;
          var17 = (float)param4.definition.field_h;
          NodeHashTableIterator.field_g = (int)((float)param4.position.x + var16 * var12Lifetime1 + var14Lifetime1 * var17);
          FullscreenErrorDialog.field_X = (int)(var16 * var13 + (float)param4.position.y + var15 * var17);
          var8Lifetime2 = -param1 + FullscreenErrorDialog.field_X;
          var7_intLifetime2 = NodeHashTableIterator.field_g - param0;
          var11[0] = NodeHashTableIterator.field_g;
          var11[1] = FullscreenErrorDialog.field_X;
          FullscreenErrorDialog.field_X = FullscreenErrorDialog.field_X + var8Lifetime2 / 4;
          NodeHashTableIterator.field_g = NodeHashTableIterator.field_g + var7_intLifetime2 / 4;
          var11[3] = FullscreenErrorDialog.field_X;
          var11[2] = NodeHashTableIterator.field_g;
          FullscreenErrorDialog.field_X = (int)(-(var13 * var16) + (float)param4.position.y + var15 * var17);
          NodeHashTableIterator.field_g = (int)(var17 * var14Lifetime1 + (-(var16 * var12Lifetime1) + (float)param4.position.x));
          var11[5] = FullscreenErrorDialog.field_X;
          var7_intLifetime3 = NodeHashTableIterator.field_g - param0;
          var11[4] = NodeHashTableIterator.field_g;
          var8Lifetime3 = FullscreenErrorDialog.field_X - param1;
          FullscreenErrorDialog.field_X = FullscreenErrorDialog.field_X + var8Lifetime3 / 4;
          NodeHashTableIterator.field_g = NodeHashTableIterator.field_g + var7_intLifetime3 / 4;
          var11[6] = NodeHashTableIterator.field_g;
          var11[7] = FullscreenErrorDialog.field_X;
          FullscreenErrorDialog.field_X = (int)(-(var15 * var17) + ((float)param4.position.y - var13 * var16));
          NodeHashTableIterator.field_g = (int)((float)param4.position.x - var16 * var12Lifetime1 - var14Lifetime1 * var17);
          var7_intLifetime4 = NodeHashTableIterator.field_g - param0;
          var11[8] = NodeHashTableIterator.field_g;
          var11[9] = FullscreenErrorDialog.field_X;
          var8Lifetime4 = -param1 + FullscreenErrorDialog.field_X;
          FullscreenErrorDialog.field_X = FullscreenErrorDialog.field_X + var8Lifetime4 / 4;
          NodeHashTableIterator.field_g = NodeHashTableIterator.field_g + var7_intLifetime4 / 4;
          var11[11] = FullscreenErrorDialog.field_X;
          var11[10] = NodeHashTableIterator.field_g;
          FullscreenErrorDialog.field_X = (int)(-(var15 * var17) + (var13 * var16 + (float)param4.position.y));
          NodeHashTableIterator.field_g = (int)(-(var14Lifetime1 * var17) + (var16 * var12Lifetime1 + (float)param4.position.x));
          var11[12] = NodeHashTableIterator.field_g;
          var11[13] = FullscreenErrorDialog.field_X;
          var7_intLifetime5 = -param0 + NodeHashTableIterator.field_g;
          var8Lifetime5 = FullscreenErrorDialog.field_X - param1;
          FullscreenErrorDialog.field_X = FullscreenErrorDialog.field_X + var8Lifetime5 / 4;
          NodeHashTableIterator.field_g = NodeHashTableIterator.field_g + var7_intLifetime5 / 4;
          var11[14] = NodeHashTableIterator.field_g;
          var11[15] = FullscreenErrorDialog.field_X;
          var11 = TriangleMesh.convexHull(var11, (byte) -113);
          if (param5 > 256) {
            param5 = 256;
          }
          if (0 > param5) {
            param5 = 0;
          }
          UrlPacketDownloader.fillPolygonAlpha(var11, (byte) -67, (int)(var10 * (float)param5), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_41_0 = runtimeException;
          stackIn_41_1 = new StringBuilder().append("sg.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int applyBlast(int param0, int param1, int param2, TrackObject param3, int param4, float param5) {
        RaceVehicle stackIn_7_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RaceVehicle stackOut_6_0;
        RaceVehicle var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9_int = 0;
        ZombiePedestrian var9 = null;
        RaceVehicle var10_ref_ja = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var7 = this.vehicles[3 & param3.flags];
          if (param0 != -30808) {
            this.prepareCourseRendering((CourseDefinition) null, 51, false);
          }
          var8 = 0;
          var9_int = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var9_int < this.vehicleCount) {
              var10_ref_ja = this.vehicles[var9_int];
              stackOut_6_0 = var10_ref_ja;
              stackIn_33_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var22 == 0) {
                if (stackIn_7_0 != null &&
                  1 >= -var10_ref_ja.layer + param3.layer &&
                  -var10_ref_ja.layer + param3.layer >= -1) {
                  var11 = var10_ref_ja.position.x - param3.position.x;
                  var12 = -param3.position.y + var10_ref_ja.position.y;
                  var13 = param4 + param3.collisionRadius + var10_ref_ja.collisionRadius;
                  var14 = var11 * var11 + var12 * var12;
                  if (var14 < var13 * var13) {
                    if (var10_ref_ja.lifeState == 0) {
                      var8++;
                    }
                    var15 = (float)Math.sqrt((double)var14);
                    if (var15 < (float)(var10_ref_ja.collisionRadius + param3.collisionRadius)) {
                      var15 = (float)(param3.collisionRadius + var10_ref_ja.collisionRadius);
                    }
                    var16 = 1.0f - ((float)(-param3.collisionRadius) + (var15 - (float)var10_ref_ja.collisionRadius)) / (float)(2 * param4);
                    var17 = param5 * var16;
                    if (var10_ref_ja.specialPowerup != 2) {
                      var18 = var10_ref_ja.definition.mass * var10_ref_ja.getDefenseMultiplier((byte) 118, CheckboxRenderer.field_c);
                      var19 = var17 / var18;
                      var20 = (float)(-param3.position.x + var10_ref_ja.position.x) / var15 * var19;
                      var21 = (float)(var10_ref_ja.position.y - param3.position.y) / var15 * var19;
                      var10_ref_ja.velocityX = var10_ref_ja.velocityX + var20;
                      var10_ref_ja.velocityY = var10_ref_ja.velocityY + var21;
                      var10_ref_ja.angularVelocity = DualLinkNode.signumFloat(-29407, var17) * 5.0f;
                      var10_ref_ja.applyImpactStun(2, param2);
                    }
                    var10_ref_ja.applyDamage(var16, param0 ^ -30808, var7, param1);
                  }
                }
                var9_int++;
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (null != AchievementUnlockRequest.field_n);
              if (decompiledFrameRemainder0) {
                stackIn_33_0 = AchievementUnlockRequest.field_n.first((byte) 125);
              }
            }
            if (decompiledFrameRemainder0) {
              var9 = (ZombiePedestrian) (stackIn_33_0);
              while (var9 != null) {
                SpriteButtonRenderer.field_q.y = 12 + var9.y;
                SpriteButtonRenderer.field_q.x = 12 + var9.x;
                var10 = SpriteButtonRenderer.field_q.x - param3.position.x;
                var11Lifetime1 = -param3.position.y + SpriteButtonRenderer.field_q.y;
                var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10 * var10;
                var13Lifetime1 = 6 * (param4 * param4);
                stackIn_44_0 = ~var13Lifetime1;
                if (var22 != 0) {
                  break scanLoop1;
                }
                if (stackIn_44_0 < ~var12Lifetime1) {
                  var14Lifetime1 = (var13Lifetime1 * 2 - var12Lifetime1) * 4096;
                  var10 = var14Lifetime1 * var10 / (var13Lifetime1 * 2);
                  var11Lifetime1 = var11Lifetime1 * var14Lifetime1 / (var13Lifetime1 * 2);
                  var9.hit(var7, var10, (byte) 24, var11Lifetime1);
                }
                var9 = (ZombiePedestrian) (AchievementUnlockRequest.field_n.next((byte) -94));
              }
            }
            stackIn_44_0 = var8;
            break;
          }
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_48_0 = var7_ref;
          stackIn_48_1 = new StringBuilder().append("sg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean handleVehicleObjectCollision(byte param0, TrackObject param1, RaceVehicle param2) {
        RaceVehicle stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        NamedSoundEffect stackIn_49_0 = null;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        String stackIn_230_2 = null;
        StringBuilder stackIn_233_1 = null;
        String stackIn_234_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        float var5_float = 0.0f;
        float var6 = 0.0f;
        NamedSoundEffect var7 = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (!IterableNodeHashTable.a(param2, param1, 32758)) {
            return false;
          }
          if (param0 >= -86) {
            this.previousTutorialPage = -68;
          }
          if ((param1.flags & 512) == 0) {
            if (0 != (1024 & param1.flags)) {
              if ((2048 & param1.flags) != 0 &&
                ~param2.playerIndex != ~(param1.flags & 3)) {
                this.detonateSmallProjectile(param1, false);
                return true;
              }
              return false;
            }
            if ((param1.flags & 8192) != 0) {
              if ((param1.flags & 2048) != 0 &&
                (param1.flags & 3) != param2.playerIndex) {
                this.detonateLargeProjectile(param1, 28977);
                if ((3 & param1.flags) == 0) {
                  this.tutorialFlags = this.tutorialFlags | 8;
                }
                return true;
              }
              return false;
            }
            if ((262144 & param1.flags) != 0) {
              return false;
            }
            param2.field_T = 20;
            stackIn_33_0 = (RaceVehicle) (param2);
            stackIn_34_1 = (this.gameMode != 2) && (this.gameMode != 6);
            stackIn_33_0.field_V = stackIn_34_1;
            param2.field_H = param2.getCourseHeading((byte) 45);
            SecondaryNodeDequeIterator.field_c.y = (float)(-(-param2.position.y + param1.position.y));
            SecondaryNodeDequeIterator.field_c.x = (float)(-(param1.position.x - param2.position.x));
            if (0.0f != SecondaryNodeDequeIterator.field_c.x ||
              SecondaryNodeDequeIterator.field_c.y != 0.0f) {
              SecondaryNodeDequeIterator.field_c.normalize(-1);
              var4_float = SecondaryNodeDequeIterator.field_c.y * param2.velocityY + SecondaryNodeDequeIterator.field_c.x * param2.velocityX;
              if (0.0f >= var4_float) {
                var5_float = 0.800000011920929f * param2.getDefenseMultiplier((byte) 112, ReflectionCheckQueue.field_c);
                var6 = var4_float * -(1.0f + var5_float);
                param2.velocityY = param2.velocityY + var6 * SecondaryNodeDequeIterator.field_c.y;
                param2.velocityX = param2.velocityX + var6 * SecondaryNodeDequeIterator.field_c.x;
                param2.applyDamage(-var4_float, 0, (RaceVehicle) null, 0);
                if (-30 + this.raceTicks > param2.lastCollisionTick) {
                  if (2 != param2.specialPowerup &&
                    param2.powerupLevels[2] <= 0) {
                    stackIn_49_0 = CheckboxWidget.field_K;
                  } else {
                    stackIn_49_0 = NineSlicePanel.field_h;
                  }
                  var7 = stackIn_49_0;
                  ValidationHelpWidget.a((byte) 54, param2, var7, var7.field_q);
                  param2.lastCollisionTick = this.raceTicks;
                }
                param2.recordCollisionForAiRecovery((byte) 109, param1);
              }
            }
            return true;
          }
          var4_int = 3 & param1.flags;
          if ((-1 == this.tutorialPage ||
            (this.tutorialFlags & 4) == 0 &&
            param2.keyBindings != null) && param2.collectPowerup(3, var4_int)) {
            param1.unlink(0);
            if (param2.playerIndex == 0) {
              this.field_rb[11] = -1;
              var5 = 0;
              while (true) {
                if (var5 < 3) {
                  stackIn_92_0 = var5;
                  stackIn_92_1 = var4_int;
                  if (var8 == 0) {
                    if (stackIn_92_0 != stackIn_92_1) {
                      this.field_rb[8 + var5] = -1;
                    }
                    var5++;
                    continue;
                  }
                } else {
                  stackIn_92_0 = ~this.field_rb[var4_int + 8];
                  stackIn_92_1 = -1;
                }
                if (stackIn_92_0 == stackIn_92_1) {
                  this.field_rb[var4_int + 8] = 1;
                }
                if (0 == var4_int) {
                  if ((256 & this.field_H) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 8);
                    this.field_H = this.field_H ^ 256;
                  }
                  if ((64 & this.field_H) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 6);
                    if (var8 != 0) {
                      this.field_N = this.field_N + (this.field_p * this.field_l << 6);
                    }
                  } else {
                    this.field_N = this.field_N + (this.field_p * this.field_l << 6);
                  }
                  this.field_H = this.field_H ^ 64;
                  if ((64 & this.field_H) == 64) {
                    if ((this.field_H & 67108864) == 0) {
                      this.field_N = this.field_N - (this.field_l * this.field_p << 26);
                      if (var8 != 0) {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 26);
                      }
                    } else {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 26);
                    }
                    this.field_H = this.field_H ^ 67108864;
                    if (0 == (67108864 & this.field_H)) {
                      if ((this.field_H & 512) != 0) {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 9);
                        if (var8 != 0) {
                          this.field_N = this.field_N - (this.field_l * this.field_p << 9);
                        }
                      } else {
                        this.field_N = this.field_N - (this.field_l * this.field_p << 9);
                      }
                      this.field_H = this.field_H ^ 512;
                    }
                  }
                }
                if (var4_int == 1) {
                  if ((this.field_H & 524288) == 524288) {
                    this.field_H = this.field_H ^ 524288;
                    this.field_N = this.field_N + (this.field_l * this.field_p << 19);
                  }
                  if ((this.field_H & 16777216) != 0) {
                    this.field_N = this.field_N + (this.field_l * this.field_p << 24);
                    if (var8 != 0) {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 24);
                    }
                  } else {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 24);
                  }
                  this.field_H = this.field_H ^ 16777216;
                  if ((16777216 & this.field_H) == 16777216) {
                    if ((this.field_H & 2097152) == 0) {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 21);
                      if (var8 != 0) {
                        this.field_N = this.field_N + (this.field_p * this.field_l << 21);
                      }
                    } else {
                      this.field_N = this.field_N + (this.field_p * this.field_l << 21);
                    }
                    this.field_H = this.field_H ^ 2097152;
                    if (2097152 == (2097152 & this.field_H)) {
                      if ((this.field_H & 2) == 0) {
                        this.field_N = this.field_N - (this.field_p * this.field_l << 1);
                        if (var8 != 0) {
                          this.field_N = this.field_N + (this.field_l * this.field_p << 1);
                        }
                      } else {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 1);
                      }
                      this.field_H = this.field_H ^ 2;
                    }
                  }
                }
                if (var4_int == 2) {
                  if (0 == (16 & this.field_H)) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 4);
                    this.field_H = this.field_H ^ 16;
                  }
                  if ((this.field_H & 1) == 0) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 0);
                    if (var8 != 0) {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 0);
                    }
                  } else {
                    this.field_N = this.field_N + (this.field_l * this.field_p << 0);
                  }
                  this.field_H = this.field_H ^ 1;
                  if ((this.field_H & 1) == 0) {
                    if ((536870912 & this.field_H) != 0) {
                      this.field_N = this.field_N + (this.field_l * this.field_p << 29);
                      if (var8 != 0) {
                        this.field_N = this.field_N - (this.field_p * this.field_l << 29);
                      }
                    } else {
                      this.field_N = this.field_N - (this.field_p * this.field_l << 29);
                    }
                    this.field_H = this.field_H ^ 536870912;
                    if (0 == (536870912 & this.field_H)) {
                      if ((131072 & this.field_H) == 0) {
                        this.field_N = this.field_N - (this.field_l * this.field_p << 17);
                        if (var8 != 0) {
                          this.field_N = this.field_N + (this.field_l * this.field_p << 17);
                        }
                      } else {
                        this.field_N = this.field_N + (this.field_l * this.field_p << 17);
                      }
                      this.field_H = this.field_H ^ 131072;
                    }
                  }
                }
                if (var4_int != 3) {
                  break;
                }
                if (8 == (8 & this.field_H)) {
                  this.field_H = this.field_H ^ 8;
                  this.field_N = this.field_N + (this.field_l * this.field_p << 3);
                }
                if ((32 & this.field_H) != 0) {
                  this.field_N = this.field_N + (this.field_l * this.field_p << 5);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 5);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_p * this.field_l << 5);
                }
                this.field_H = this.field_H ^ 32;
                if (0 != (32 & this.field_H)) {
                  break;
                }
                if ((this.field_H & 2048) != 0) {
                  this.field_N = this.field_N + (this.field_p * this.field_l << 11);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 11);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_p * this.field_l << 11);
                }
                this.field_H = this.field_H ^ 2048;
                if ((this.field_H & 2048) != 2048) {
                  break;
                }
                if (0 != (33554432 & this.field_H)) {
                  this.field_N = this.field_N + (this.field_p * this.field_l << 25);
                  if (var8 != 0) {
                    this.field_N = this.field_N - (this.field_l * this.field_p << 25);
                  }
                } else {
                  this.field_N = this.field_N - (this.field_l * this.field_p << 25);
                }
                this.field_H = this.field_H ^ 33554432;
                break;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_229_0 = var4;
          stackIn_229_1 = new StringBuilder().append("sg.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_230_2 = "null";
          } else {
            stackIn_230_2 = "{...}";
          }
          stackIn_233_1 = ((StringBuilder) (Object) stackIn_229_1).append(stackIn_230_2).append(',');
          if (param2 == null) {
            stackIn_234_2 = "null";
          } else {
            stackIn_234_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_229_0), ((StringBuilder) (Object) stackIn_233_1).append(stackIn_234_2).append(')').toString());
        }
    }

    private final void drawObjectSideShadow(TrackObject param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param1 >= -32) {
            this.roadLayerMask = (IndexedSprite) null;
          }
          if (0 == (param0.flags & 65536) &&
            this.shadowsEnabled) {
            if ((param0.flags & 16384) == 0 &&
              param0.definition.rectangularCollision) {
              var3 = new int[8];
              var4 = param0.direction.x;
              var5 = param0.direction.y;
              var6 = -var5;
              var7 = var4;
              var8 = param0.definition.field_h;
              if (0.0f < var4 + var5) {
                var8 = -var8;
              }
              var3[4] = (int)((float)param0.position.x - (float)(param0.definition.field_m >> 1) * var4 + (float)var8 * var6);
              var3[0] = (int)((float)param0.position.x + (float)param0.definition.field_m * var4 + (float)var8 * var6);
              var3[2] = (int)((float)param0.position.x - (float)param0.definition.field_m * var4 + (float)var8 * var6);
              var3[3] = (int)(-(var5 * (float)param0.definition.field_m) + (float)param0.position.y + (float)var8 * var7);
              var3[5] = (int)((float)param0.position.y - (float)(param0.definition.field_m >> 1) * var5 + (float)var8 * var7);
              var3[1] = (int)((float)var8 * var7 + ((float)param0.position.y + var5 * (float)param0.definition.field_m));
              var3[6] = (int)((float)(param0.definition.field_m >> 1) * var4 + (float)param0.position.x + var6 * (float)var8);
              var3[7] = (int)((float)param0.position.y + (float)(param0.definition.field_m >> 1) * var5 + (float)var8 * var7);
              var9 = 4;
              while (var9 < 8) {
                var3[var9] = var3[var9] + this.shadowOffset.x * 2;
                var3[1 + var9] = var3[1 + var9] + this.shadowOffset.y * 2;
                var9 += 2;
                if (var10 != 0) {
                  return;
                }
              }
              UrlPacketDownloader.fillPolygonAlpha(var3, (byte) -116, 128, 0);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("sg.DB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void updateLightning(byte param0, long param1) {
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        NamedSoundEffect stackIn_29_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        SoundPlayback var7 = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 != -3) {
            this.drawTutorialOverlay(-112);
          }
          if (this.lightningBrightness <= 0) {
            boolean decompiledFrameRemainder0 = true;
            var4_int = (int)(param1 % 157L);
            if ((var4_int < 2 ||
              var4_int >= 139 &&
              var4_int <= 141) && hc.a(0, (int)(param1 << 6)) < 0) {
              stackIn_18_0 = 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_18_0 = 0;
            }
            var5 = stackIn_18_0;
            if (var5 == 0) {
              if ((var4_int == 5) &&
                (!(hc.a(0, (int)(param1 << 6)) >= 3))) {
                var6 = 84 + (GrowableStringList.sinFixed((int)(param1 << 6), 5255) * 40 >> 16);
                stackIn_28_0 = param0 + 296;
                if (0L == (1L & param1)) {
                  stackIn_29_1 = IntWriteRequest.field_m;
                } else {
                  stackIn_29_1 = MeshMaterial.field_a;
                }
                var7 = MatchingTextValidator.playDefaultSample(stackIn_28_0, stackIn_29_1);
                if (null != var7) {
                  var7.setVolume((byte) -126, var6);
                }
                if (var8 != 0) {
                  this.lightningBrightness = 84 + (GrowableStringList.sinFixed((int)(param1 << 6), 5255) * 40 >> 16);
                  var6 = this.lightningBrightness;
                  var7 = MatchingTextValidator.playDefaultSample(293, TexturedRoadFillRenderer.field_j);
                  if (null != var7) {
                    var7.setVolume((byte) -125, var6);
                    var7.field_j.setSamplePosition(var6 * 150 + 300);
                  }
                }
              }
            } else {
              this.lightningBrightness = 84 + (GrowableStringList.sinFixed((int)(param1 << 6), 5255) * 40 >> 16);
              var6 = this.lightningBrightness;
              var7 = MatchingTextValidator.playDefaultSample(293, TexturedRoadFillRenderer.field_j);
              if (null != var7) {
                var7.setVolume((byte) -125, var6);
                var7.field_j.setSamplePosition(var6 * 150 + 300);
              }
            }
            if (var8 == 0) {
              return;
            }
          }
          this.lightningBrightness = this.lightningBrightness - 14;
          if (0 > this.lightningBrightness) {
            this.lightningBrightness = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void resolveVehicleCollision(int param0, RaceVehicle param1, RaceVehicle param2) {
        RaceVehicle stackIn_31_0;
        float stackIn_31_1;
        int stackIn_31_2;
        RaceVehicle stackIn_31_3;
        int stackIn_32_4 = 0;
        RaceVehicle stackIn_41_0;
        float stackIn_41_1;
        int stackIn_41_2;
        RaceVehicle stackIn_41_3;
        int stackIn_42_4 = 0;
        NamedSoundEffect stackIn_55_0 = null;
        NamedSoundEffect stackIn_66_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20_float = 0.0f;
        NamedSoundEffect var20 = null;
        float var21 = 0.0f;
        int var22 = 0;
        NamedSoundEffect var20Lifetime1;
        float var20_floatLifetime1;
        float var21Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          if (!MatchingTextValidator.overlapsEntities((byte) -73, param2, param1)) {
            return;
          }
          this.moveVehicle(param2, 0.0f, param0 ^ param0, -0.5f * EntitySound.field_k * SecondaryNodeDequeIterator.field_c.x, -0.5f * EntitySound.field_k * SecondaryNodeDequeIterator.field_c.y);
          this.moveVehicle(param1, 0.0f, 0, SecondaryNodeDequeIterator.field_c.x * (EntitySound.field_k * 0.5f), EntitySound.field_k * 0.5f * SecondaryNodeDequeIterator.field_c.y);
          param2.position.y = (int)param2.worldY;
          param2.position.x = (int)param2.worldX;
          param1.position.x = (int)param1.worldX;
          param1.position.y = (int)param1.worldY;
          var4_float = -param2.velocityX + param1.velocityX;
          var5 = -param2.velocityY + param1.velocityY;
          var6 = var5 * SecondaryNodeDequeIterator.field_c.y + SecondaryNodeDequeIterator.field_c.x * var4_float;
          if (var6 > 0.0f) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var7 = -RasterBuffer.field_d + (float)param2.position.x;
          var8 = (float)param2.position.y - IterableSecondaryNodeDeque.field_b;
          var9 = (-(SecondaryNodeDequeIterator.field_c.x * var8) + var7 * SecondaryNodeDequeIterator.field_c.y) / 3.5f;
          var10 = -RasterBuffer.field_d + (float)param1.position.x;
          var11 = (float)param1.position.y - IterableSecondaryNodeDeque.field_b;
          var12 = (-(SecondaryNodeDequeIterator.field_c.x * var11) + SecondaryNodeDequeIterator.field_c.y * var10) / 3.5f;
          var13 = var7 * param2.velocityX + param2.velocityY * var8;
          var14 = var11 * param1.velocityY + var10 * param1.velocityX;
          var15 = param2.definition.mass * param2.getDefenseMultiplier((byte) 97, DiskCacheWorker.field_f);
          var16 = param2.definition.momentOfInertia * param2.getDefenseMultiplier((byte) 113, DiskCacheWorker.field_e);
          var17 = param1.definition.mass * param1.getDefenseMultiplier((byte) 116, DiskCacheWorker.field_f);
          var18 = param1.definition.momentOfInertia * param1.getDefenseMultiplier((byte) 127, DiskCacheWorker.field_e);
          var19 = 0.800000011920929f * Math.max(param2.getDefenseMultiplier((byte) 109, UrlPacketDownloader.field_m), param1.getDefenseMultiplier((byte) 125, UrlPacketDownloader.field_m));
          if (param2.specialPowerup != 2 &&
            param1.specialPowerup != 2 ||
            param2.specialPowerup == 2 &&
            param1.specialPowerup == 2) {
            var20_float = var12 * var12 / var18 + (1.0f / var17 + 1.0f / var15 + var9 * var9 / var16);
            var21 = 1.7999999523162842f * var6 / var20_float;
            param2.velocityY = param2.velocityY + var21 / var15 * SecondaryNodeDequeIterator.field_c.y;
            param2.velocityX = param2.velocityX + var21 / var15 * SecondaryNodeDequeIterator.field_c.x;
            param1.velocityX = param1.velocityX - SecondaryNodeDequeIterator.field_c.x * (var21 / var17);
            param1.velocityY = param1.velocityY - SecondaryNodeDequeIterator.field_c.y * (var21 / var17);
            if (param2.specialPowerup == 2) {
              param2.angularVelocity = DualLinkNode.signumFloat(-29407, var9) * 5.0f;
              param2.applyImpactStun(param0 + 2, 100);
              param1.angularVelocity = 5.0f * DualLinkNode.signumFloat(-29407, var12);
              param1.applyImpactStun(2, 100);
            }
            decompiledFrameRemainder0 = (var22 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (param2.specialPowerup != 2) {
              var20_floatLifetime1 = var16 + var9 * (var9 * var15);
              var21Lifetime1 = var16 * (var6 * -(1.0f + var19)) / var20_floatLifetime1;
              param2.velocityX = param2.velocityX - var21Lifetime1 * SecondaryNodeDequeIterator.field_c.x;
              param2.velocityY = param2.velocityY - var21Lifetime1 * SecondaryNodeDequeIterator.field_c.y;
              param2.angularVelocity = DualLinkNode.signumFloat(-29407, var9) * 5.0f;
              param2.applyImpactStun(param0 ^ 2, 100);
              if (var22 != 0) {
                var20_floatLifetime1 = var12 * (var12 * var17) + var18;
                var21Lifetime1 = var18 * (-(var19 + 1.0f) * var6) / var20_floatLifetime1;
                param1.velocityY = param1.velocityY + SecondaryNodeDequeIterator.field_c.y * var21Lifetime1;
                param1.velocityX = param1.velocityX + var21Lifetime1 * SecondaryNodeDequeIterator.field_c.x;
                param1.angularVelocity = 5.0f * DualLinkNode.signumFloat(-29407, var12);
                param1.applyImpactStun(param0 + 2, 100);
              }
            } else {
              var20_floatLifetime1 = var12 * (var12 * var17) + var18;
              var21Lifetime1 = var18 * (-(var19 + 1.0f) * var6) / var20_floatLifetime1;
              param1.velocityY = param1.velocityY + SecondaryNodeDequeIterator.field_c.y * var21Lifetime1;
              param1.velocityX = param1.velocityX + var21Lifetime1 * SecondaryNodeDequeIterator.field_c.x;
              param1.angularVelocity = 5.0f * DualLinkNode.signumFloat(-29407, var12);
              param1.applyImpactStun(param0 + 2, 100);
            }
          }
          if (param1.specialPowerup != 2) {
            stackIn_31_0 = (RaceVehicle) (param2);
            stackIn_31_1 = -var6;
            stackIn_31_2 = 0;
            stackIn_31_3 = (RaceVehicle) (param1);
            if (!(var14 > var13)) {
              stackIn_32_4 = 2;
            } else {
              stackIn_32_4 = 1;
            }
            ((RaceVehicle) (Object) stackIn_31_0).applyDamage(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_32_4);
            if (var22 != 0) {
              param2.applyDamage(1.0f, param0 ^ 0, param1, 5);
            }
          } else {
            param2.applyDamage(1.0f, param0 ^ 0, param1, 5);
          }
          if (param2.specialPowerup != 2) {
            stackIn_41_0 = (RaceVehicle) (param1);
            stackIn_41_1 = -var6;
            stackIn_41_2 = 0;
            stackIn_41_3 = (RaceVehicle) (param2);
            if (var13 > var14) {
              stackIn_42_4 = 1;
            } else {
              stackIn_42_4 = 2;
            }
            ((RaceVehicle) (Object) stackIn_41_0).applyDamage(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_42_4);
            if (var22 != 0) {
              param1.applyDamage(1.0f, 0, param2, 5);
            }
          } else {
            param1.applyDamage(1.0f, 0, param2, 5);
          }
          if (param2.lastCollisionTick < this.raceTicks - 30) {
            if (param2.specialPowerup != 2 &&
              0 >= param2.powerupLevels[2]) {
              stackIn_55_0 = CheckboxWidget.field_K;
            } else {
              stackIn_55_0 = NineSlicePanel.field_h;
            }
            var20 = stackIn_55_0;
            ValidationHelpWidget.a((byte) 20, param2, var20, var20.field_q);
            param2.lastCollisionTick = this.raceTicks;
          }
          if (this.raceTicks - 30 > param1.lastCollisionTick) {
            if (param1.specialPowerup != 2 &&
              param1.powerupLevels[2] <= 0) {
              stackIn_66_0 = CheckboxWidget.field_K;
            } else {
              stackIn_66_0 = NineSlicePanel.field_h;
            }
            var20Lifetime1 = stackIn_66_0;
            ValidationHelpWidget.a((byte) 63, param1, var20Lifetime1, var20Lifetime1.field_q);
            param1.lastCollisionTick = this.raceTicks;
          }
          param2.recordCollisionForAiRecovery((byte) 103, param1);
          param1.recordCollisionForAiRecovery((byte) 68, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_72_0 = var4;
          stackIn_72_1 = new StringBuilder().append("sg.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final void unlockAchievement(int param0, int param1, byte param2) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        AchievementUnlockRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.twoPlayerMode) {
            throw new RuntimeException((String) null);
          }
          if ((GameMenu.field_z & 1 << param0) != 0) {
            return;
          }
          fieldTemp$1 = this.achievementCount;
          this.achievementCount = this.achievementCount + 1;
          this.achievementQueue[fieldTemp$1] = param0;
          ClientException.field_c = ClientException.field_c | 1 << param0;
          var4_int = -19 / ((param2 - 36) / 62);
          GameMenu.field_z = GameMenu.field_z | 1 << param0;
          if (!l.field_b) {
            var5 = new AchievementUnlockRequest(param0, param1, this.field_l, this.field_N, this.field_p, this.field_H);
            if (RoadShadowRenderer.isGuestMode((byte) 92)) {
              ScoreSubmission.field_n.addLast((byte) -117, var5);
              if (HoldTheLine.field_D == 0) {
                return;
              }
            }
            PointLight.queueAchievementUnlock(4, var5, (byte) -79);
            RotatedSpriteAsset.field_k = SpriteSheetAsset.requestAchievementStatus((byte) -101, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sg.LB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void blendRgbGradientSpan(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = HoldTheLine.field_D;
        try {
          if (param8 > -117) {
            RaceWorld.openPauseMenu(true);
          }
          while (true) {
            param6--;
            if (0 <= param6) {
              var10 = param5;
              var11 = param1;
              var12 = param9;
              var13 = param3;
              var14 = param7;
              var15 = (16711422 & var10[var11]) >> 1;
              var10[var11] = (LoginChoicePanel.a(var13, 33423793) >> 9) + (LoginChoicePanel.a(var12 >> 1, 16711680) + ((LoginChoicePanel.a(var14, 33439411) >> 17) + var15));
              param7 = param7 + param0;
              param1++;
              param3 = param3 + param4;
              param9 = param9 + param2;
              if (var16 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_13_0 = var10_ref;
          stackIn_13_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final boolean useParticleOnlyMissileEffects(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 47) {
            this.resultObjects = (IntrusiveDeque) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.A(" + param0 + ')');
        }
    }

    final int getRoadLayerMask(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            param0 >= 0 &&
            param1 < 640 &&
            480 > param0) {
            stackIn_13_0 = this.roadLayerMask.pixels[param1 + 640 * param0];
            return stackIn_13_0;
          }
          if (b.containsPointInBoundaryLoops(false, param1, param0, this.collisionBoundaryLoops)) {
            stackIn_21_0 = (!b.containsPointInBoundaryLoops(false, param1, param0, this.roadBoundaryLoops)) ? 8 : 12;
            return stackIn_21_0;
          }
          var4_int = 94 / ((12 - param2) / 42);
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void clearRaceParticipants(int param0) {
        RuntimeException runtimeException = null;
        TrackObject var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          this.lapLimit = -1;
          this.tutorialPageTicks = 0;
          this.raceTicks = 0;
          this.tutorialPage = 0;
          this.playerCount = 0;
          this.vehicleCount = 0;
          var2 = (TrackObject) (this.courseObjects.first((byte) 89));
          if (param0 != 4) {
            return;
          }
          while (null != var2) {
            if (var3 != 0) {
              return;
            }
            if ((var2.flags & 512) != 0) {
              var2.unlink(param0 ^ 4);
            }
            var2 = (TrackObject) (this.courseObjects.next((byte) 114));
          }
          this.paused = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sg.LA(" + param0 + ')');
        }
    }

    private final Point2i findVehicleOutsideBounds(RaceVehicle param0, int param1) {
        Sprite var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Point2i var6 = null;
        Point2i var7 = null;
        Point2i stackIn_4_0 = null;
        Point2i stackIn_7_0 = null;
        Point2i stackIn_12_0 = null;
        Point2i stackIn_17_0 = null;
        Point2i stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.definition.sprite.getByAngle(param0.heading, 27788);
          var4 = -(var3.width >> 1) + param0.position.x;
          var5 = param0.position.y - (var3.height >> 1);
          var6 = this.findSpriteOutsideBounds(var5, var4, var3, -95, param0.layer);
          if (var6 != null) {
            stackIn_4_0 = var6;
            return stackIn_4_0;
          }
          var7 = new Point2i(0, param1);
          var7.x = (int)(-((float)param0.definition.halfWidth * param0.direction.y) + param0.worldX + (float)param0.definition.halfLength * param0.direction.x);
          var7.y = (int)(param0.direction.y * (float)param0.definition.halfLength + ((float)param0.definition.halfWidth * param0.direction.x + param0.worldY));
          if (!this.isInsideCollisionBounds(param0.layer, var7.y, true, var7.x)) {
            stackIn_7_0 = var7;
            return stackIn_7_0;
          }
          var7.x = (int)(param0.direction.y * (float)param0.definition.halfWidth + param0.worldX + param0.direction.x * (float)param0.definition.halfLength);
          var7.y = (int)((float)param0.definition.halfLength * param0.direction.y + (param0.worldY - param0.direction.x * (float)param0.definition.halfWidth));
          if (!this.isInsideCollisionBounds(param0.layer, var7.y, true, var7.x)) {
            stackIn_12_0 = var7;
            return stackIn_12_0;
          }
          var7.x = (int)(-((float)param0.definition.halfLength * param0.direction.x) + (-(param0.direction.y * (float)param0.definition.halfWidth) + param0.worldX));
          var7.y = (int)(-((float)param0.definition.halfLength * param0.direction.y) + ((float)param0.definition.halfWidth * param0.direction.x + param0.worldY));
          if (!this.isInsideCollisionBounds(param0.layer, var7.y, true, var7.x)) {
            stackIn_17_0 = var7;
            return stackIn_17_0;
          }
          var7.x = (int)(param0.worldX + (float)param0.definition.halfWidth * param0.direction.y - param0.direction.x * (float)param0.definition.halfLength);
          var7.y = (int)(-(param0.direction.y * (float)param0.definition.halfLength) + (param0.worldY - param0.direction.x * (float)param0.definition.halfWidth));
          if (!this.isInsideCollisionBounds(param0.layer, var7.y, true, var7.x)) {
            stackIn_22_0 = var7;
            return stackIn_22_0;
          }
          stackIn_24_0 = null;
          return (Point2i) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_28_0 = var3_ref;
          stackIn_28_1 = new StringBuilder().append("sg.JB(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawObject(TrackObject param0, int param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var3 = null;
        RuntimeException var3_ref = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 < 39) {
            this.drawPointLight(-16, (PointLight) null);
          }
          if ((8192 & param0.flags) != 0 &&
            this.useParticleOnlyMissileEffects((byte) 47)) {
            return;
          }
          if (0 == (1048576 & param0.flags)) {
            var3 = param0.getCurrentSprite((byte) -124);
            if (var8 != 0) {
              var3 = param0.sprite;
            }
          } else {
            var3 = param0.sprite;
          }
          if (0 == (131072 & param0.flags)) {
            boolean decompiledSharedTail1 = ((param0.flags & 128) != 0);
            if (!decompiledSharedTail1) {
              var3.draw(-(var3.canvasWidth >> 1) + param0.position.x, param0.position.y - (var3.canvasHeight >> 1));
              decompiledSharedTail1 = (var8 != 0);
            }
            if (decompiledSharedTail1) {
              var3.drawTinted(-(var3.canvasWidth >> 1) + param0.position.x, param0.position.y - (var3.canvasHeight >> 1), this.vehicles[param0.flags & 3].field_Eb);
            }
            TutorialTransition.a(32381);
            this.lightMap.bindRaster();
            var3.drawMask(-(var3.canvasWidth >> 1) + param0.position.x, -(var3.canvasHeight >> 1) + param0.position.y, 0);
            MarkerSliderRenderer.restoreRasterTarget(-1);
            if (var8 == 0) {
              return;
            }
          }
          var4 = (float)param0.transitionTicks / 150.0f;
          var5 = 4.0f * var4 * (-var4 + 1.0f) + 1.0f;
          var6 = (int)((float)param0.sprite.canvasWidth * var5);
          var7 = (int)((float)param0.sprite.canvasHeight * var5);
          param0.getCurrentSprite((byte) -118);
          boolean decompiledSharedTail0 = ((param0.flags & 128) == 0);
          if (!decompiledSharedTail0) {
            var3.drawScaledTinted(-(var6 >> 1) + param0.position.x, -(var7 >> 1) + param0.position.y, var6, var7, this.vehicles[param0.flags & 3].field_Eb);
            decompiledSharedTail0 = (var8 != 0);
          }
          if (decompiledSharedTail0) {
            var3.drawScaled(-(var6 >> 1) + param0.position.x, param0.position.y - (var7 >> 1), var6, var7);
          }
          TutorialTransition.a(32381);
          this.lightMap.bindRaster();
          var3.drawScaledMask(param0.position.x - (var6 >> 1), param0.position.y - (var7 >> 1), var6, var7, 0);
          MarkerSliderRenderer.restoreRasterTarget(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("sg.VA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawDirectionArrow(byte param0, Vector2f param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        try {
          var8 = (int)(param1.y * 15.0f + param1.x * -15.0f) + param3;
          var9 = (int)(param1.y * -15.0f - param1.x * 15.0f) + param4;
          SoftwareRasterizer.drawLine(param3, param4, var8, var9, param2);
          var7 = var9;
          var6_int = var8;
          var9Lifetime1 = (int)(-(5.0f * param1.x) + -15.0f * param1.y) + param4;
          var8Lifetime1 = param3 + (int)(param1.x * -15.0f + 5.0f * param1.y);
          SoftwareRasterizer.drawLine(var6_int, var7, var8Lifetime1, var9Lifetime1, param2);
          var6_intLifetime1 = var8Lifetime1;
          var7Lifetime1 = var9Lifetime1;
          var8Lifetime2 = param3 + (int)(-25.0f * param1.x + param1.y * 5.0f);
          var9Lifetime2 = (int)(param1.y * -25.0f - param1.x * 5.0f) + param4;
          SoftwareRasterizer.drawLine(var6_intLifetime1, var7Lifetime1, var8Lifetime2, var9Lifetime2, param2);
          var7Lifetime2 = var9Lifetime2;
          var6_intLifetime2 = var8Lifetime2;
          var8Lifetime3 = (int)(-25.0f * param1.x - 5.0f * param1.y) + param3;
          var10 = 53 / ((param0 - 71) / 39);
          var9Lifetime3 = param4 + (int)(5.0f * param1.x + -25.0f * param1.y);
          SoftwareRasterizer.drawLine(var6_intLifetime2, var7Lifetime2, var8Lifetime3, var9Lifetime3, param2);
          var7Lifetime3 = var9Lifetime3;
          var6_intLifetime3 = var8Lifetime3;
          var9Lifetime4 = (int)(5.0f * param1.x + param1.y * -15.0f) + param4;
          var8Lifetime4 = (int)(param1.x * -15.0f - 5.0f * param1.y) + param3;
          SoftwareRasterizer.drawLine(var6_intLifetime3, var7Lifetime3, var8Lifetime4, var9Lifetime4, param2);
          var6_intLifetime4 = var8Lifetime4;
          var7Lifetime4 = var9Lifetime4;
          var8Lifetime5 = param3 + (int)(-(param1.y * 15.0f) + -15.0f * param1.x);
          var9Lifetime5 = param4 + (int)(15.0f * param1.x + param1.y * -15.0f);
          SoftwareRasterizer.drawLine(var6_intLifetime4, var7Lifetime4, var8Lifetime5, var9Lifetime5, param2);
          SoftwareRasterizer.drawLine(var8Lifetime5, var9Lifetime5, param3, param4, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("sg.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void drawHud(int param0) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_115_1 = 0;
        Vector2f stackIn_115_2 = null;
        Object stackIn_116_0;
        int stackIn_116_3;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RaceVehicle var5_ref_ja = null;
        int var5 = 0;
        int var6 = 0;
        float var6_float = 0.0f;
        TrackObject var7_ref_wm = null;
        int var7 = 0;
        Sprite var7_ref_hj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        RoadSegment var15_ref_wd = null;
        int var15 = 0;
        Point2i var16_ref_qm = null;
        int var16 = 0;
        Vector2f var17_ref_in = null;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        TrackObject var7_ref_wmLifetime1;
        int stackIn_31_0Lifetime1;
        int stackIn_31_0Lifetime2;
        int stackIn_31_1Lifetime1;
        int stackIn_31_1Lifetime2;
        int stackIn_157_0Lifetime1;
        int stackIn_157_1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        float var14Lifetime1;
        int var5Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        var19 = HoldTheLine.field_D;
        try {
          if (param0 != -16) {
            this.drawObject((TrackObject) null, 58);
          }
          this.drawPlayerHud((byte) -109);
          this.drawRaceTimer(true);
          var4 = 0;
          scanLoop1: while (var4 < this.playerCount) {
            var5_ref_ja = this.vehicles[var4];
            var6 = 0;
            if (var19 == 0) {
              var7_ref_wm = (TrackObject) (this.courseObjects.first((byte) 102));
              while (var7_ref_wm != null) {
                stackIn_31_0 = ~var5_ref_ja.layer;
                stackIn_31_1 = ~var7_ref_wm.layer;
                if (stackIn_31_0 > stackIn_31_1 &&
                  var7_ref_wm.containsPoint(2048, var5_ref_ja.position)) {
                  var6 = 1;
                } else {
                  var7_ref_wm = (TrackObject) (this.courseObjects.next((byte) 90));
                  continue;
                }
                break;
              }
              if (var6 == 0) {
                var7_ref_wmLifetime1 = (TrackObject) (this.dynamicObjects.first((byte) 107));
                while (var7_ref_wmLifetime1 != null) {
                  stackIn_31_0Lifetime1 = var7_ref_wmLifetime1.layer;
                  stackIn_31_1Lifetime1 = var5_ref_ja.layer;
                  if (stackIn_31_0Lifetime1 > stackIn_31_1Lifetime1 &&
                    var7_ref_wmLifetime1.containsPoint(2048, var5_ref_ja.position)) {
                    var6 = 1;
                    break;
                  }
                  var7_ref_wmLifetime1 = (TrackObject) (this.dynamicObjects.next((byte) -63));
                }
              }
              stackIn_31_0Lifetime2 = -265;
              stackIn_31_1Lifetime2 = ~var5_ref_ja.position.x;
              if (stackIn_31_0Lifetime2 > stackIn_31_1Lifetime2 &&
                var5_ref_ja.position.x < 394 &&
                var5_ref_ja.position.y < 40) {
                var6 = 1;
              }
              if (2 == this.gameMode) {
                stackIn_48_0 = (480 >= var5_ref_ja.position.x) ? 0 : 1;
                var9 = stackIn_48_0;
                stackIn_52_0 = (160 <= var5_ref_ja.position.x) ? 0 : 1;
                var8 = stackIn_52_0;
              } else {
                stackIn_59_0 = (var5_ref_ja.position.x >= 64) ? 0 : 1;
                var8 = stackIn_59_0;
                stackIn_63_0 = (var5_ref_ja.position.x <= 576) ? 0 : 1;
                var9 = stackIn_63_0;
              }
              stackIn_68_0 = (64 <= var5_ref_ja.position.y) ? 0 : 1;
              var10 = stackIn_68_0;
              stackIn_72_0 = (var5_ref_ja.position.y <= 416) ? 0 : 1;
              var11 = stackIn_72_0;
              if ((var8 != 0 ||
                var9 != 0) && (var10 != 0 ||
                var11 != 0)) {
                var12 = 0;
                if (var11 != 0) {
                  var12 += 2;
                }
                if (var9 != 0) {
                  var12++;
                }
                if (this.playerCount > var12) {
                  var6 = 1;
                }
              }
              if (0 < this.raceTicks &&
                var5_ref_ja.keyBindings != null &&
                var5_ref_ja.activeTicks > 50 &&
                0 == var5_ref_ja.courseRecoveryTicks) {
                stackIn_106_0 = 1;
              } else {
                stackIn_106_0 = 0;
              }
              var12Lifetime1 = stackIn_106_0;
              if (var6 != 0) {
                stackIn_115_1 = -72;
                stackIn_115_2 = var5_ref_ja.direction;
                if (var12Lifetime1 != 0 &&
                  this.ticks / 10 % 2 == 0) {
                  stackIn_116_0 = this;
                  stackIn_116_3 = 16777215;
                } else {
                  stackIn_116_0 = this;
                  stackIn_116_3 = var5_ref_ja.field_Eb;
                }
                this.drawDirectionArrow((byte) stackIn_115_1, stackIn_115_2, stackIn_116_3, var5_ref_ja.position.x, var5_ref_ja.position.y);
              }
              if (this.ticks % 20 < 10 &&
                null != var5_ref_ja.keyBindings &&
                var5_ref_ja.ticksWithoutForwardProgress > 50 &&
                this.gameMode != 2) {
                var13 = (int)var5_ref_ja.furthestCourseProgress;
                var14 = (float)(-var13) + var5_ref_ja.furthestCourseProgress;
                if (0.0f == var14 &&
                  ~var13 == ~this.roadSegments.length) {
                  var13--;
                  var14 = 1.0f;
                }
                var15_ref_wd = this.roadSegments[var13];
                var16_ref_qm = var15_ref_wd.pointAt(false, var14);
                var17_ref_in = var15_ref_wd.directionAt((byte) 120, var14);
                var18 = var5_ref_ja.field_Eb;
                this.drawDirectionArrow((byte) 13, var17_ref_in, var18, var16_ref_qm.x, var16_ref_qm.y);
              }
              var13Lifetime1 = var5_ref_ja.powerupLevels[2] + var5_ref_ja.powerupLevels[0] + (var5_ref_ja.powerupLevels[1] + var5_ref_ja.powerupLevels[3]);
              var14Lifetime1 = 0.0f;
              var15 = 0;
              while (var15 < 3) {
                var16 = 0;
                stackIn_157_0 = var5_ref_ja.heldPowerups[var15];
                stackIn_157_1 = -1;
                if (stackIn_157_0 != stackIn_157_1) {
                  if (var5_ref_ja.heldPowerups[var15] != 0) {
                    if (var5_ref_ja.heldPowerups[var15] == 1) {
                      var16 = 65280;
                    } else if (var5_ref_ja.heldPowerups[var15] == 2) {
                      var16 = 255;
                    }
                  } else {
                    var16 = 16711680;
                  }
                  var17 = 3.1415927410125732f * (2.0f * (float)(this.ticks % 100)) / 100.0f + var14Lifetime1;
                  var2_int = var5_ref_ja.position.x + (int)((double)var5_ref_ja.collisionRadius * Math.cos((double)var17));
                  var14Lifetime1 = var14Lifetime1 + 6.2831854820251465f / (float)var13Lifetime1;
                  var3 = var5_ref_ja.position.y - (int)((double)var5_ref_ja.collisionRadius * Math.sin((double)var17));
                  SoftwareRasterizer.fillCircle(var2_int, var3, 3, var16);
                  var16 = var16 >> 1 & 8355711;
                  SoftwareRasterizer.drawCircle(var2_int, var3, 3, var16);
                }
                var15++;
              }
              stackIn_157_0Lifetime1 = ~var5_ref_ja.field_ob;
              stackIn_157_1Lifetime1 = -26;
              if (stackIn_157_0Lifetime1 >= stackIn_157_1Lifetime1 &&
                0 < this.raceTicks) {
                UsernameLoginCredentials.a(hk.field_a[20 + var5_ref_ja.racePosition], param0 - 12, var5_ref_ja.position.y - 15, -25 + var5_ref_ja.position.x, 200 - (var5_ref_ja.field_ob * 8 - 512), 16777215);
              }
              var4++;
              continue scanLoop1;
            }
            break;
          }
          if (this.achievementCount > 0) {
            var5 = 0;
            if (50 <= this.achievementTicks) {
              if (!(this.achievementTicks <= 150)) {
                var6_float = (float)Math.exp(0.04000000283122063);
                var7 = -100 + (this.achievementTicks - 50);
                var5 = (int)((double)(640.0f / (-1.0f + var6_float)) * (1.0 - Math.exp((double)((float)var7 * 0.0020000000949949026f))));
                if (var19 != 0) {
                  var6_float = (float)Math.exp(1.0);
                  var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)this.achievementTicks)) - 1.0));
                }
              }
            } else {
              var6_float = (float)Math.exp(1.0);
              var5 = (int)((double)(640.0f / (var6_float - 1.0f)) * ((double)var6_float * Math.exp((double)(-0.019999999552965164f * (float)this.achievementTicks)) - 1.0));
            }
            var6Lifetime1 = this.achievementQueue[0];
            var7_ref_hj = ak.a(-40, false, var6Lifetime1);
            var8Lifetime1 = nm.field_c.measureText(ae.field_c[var6Lifetime1]) + 48;
            SoftwareRasterizer.fillRectangle(3 + var5, 3, var8Lifetime1, 36, 0);
            SoftwareRasterizer.drawRectangle(var5 + 2, 2, var8Lifetime1 + 2, 38, 16777215);
            var7_ref_hj.drawScaled(5 + var5, 5, 32, 32);
            if (var6Lifetime1 == 12) {
              pe.a(32, 4209, 21 + var5, 21);
            }
            nm.field_c.draw(ae.field_c[var6Lifetime1], 48 + var5, 30, 0, -1);
          }
          if (this.bannerCount > 0) {
            if (null == this.bannerSprite) {
              var5Lifetime1 = EmailAddressValidator.field_j.measureText(this.banners[0]);
              var6Lifetime2 = EmailAddressValidator.field_j.baseline;
              this.bannerSprite = new Sprite(var5Lifetime1, var6Lifetime2);
              vb.a(-121, this.bannerSprite);
              EmailAddressValidator.field_j.draw(this.banners[0], 0, EmailAddressValidator.field_j.ascent, 0, -1);
              MarkerSliderRenderer.restoreRasterTarget(param0 + 15);
            }
            var5Lifetime1Lifetime1 = 4096 - (this.bannerTicks << 12) / 50;
            var6Lifetime2Lifetime1 = var5Lifetime1Lifetime1 * this.bannerSprite.width >> 12;
            var7Lifetime1 = this.bannerSprite.height * var5Lifetime1Lifetime1 >> 12;
            this.bannerSprite.drawScaled(640 - var6Lifetime2Lifetime1 >> 1, 480 - var7Lifetime1 >> 1, var6Lifetime2Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.FB(" + param0 + ')');
        }
    }

    private final void executeTutorialAction(TutorialAction param0, int param1) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        RaceVehicle stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        boolean stackIn_184_1 = false;
        int stackIn_186_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        RuntimeException stackIn_194_0 = null;
        StringBuilder stackIn_194_1 = null;
        String stackIn_195_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        TrackObject var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted0 = true;
          if (0 == param0.opcode) {
            var3_int = this.playerCount;
            this.vehicleCount = 1 + param0.field_d;
            this.playerCount = 1 + param0.field_d;
            var4 = var3_int;
            while (var4 < this.playerCount) {
              this.vehicles[var4].reset(554646678);
              var4++;
              if (var5 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            if (decompiledFrameCompleted3) {
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3)) {
            if (param0.opcode != 1) {
              if (param0.opcode == 6) {
                if (param0.field_d != -1) {
                  this.tutorialFlags = this.tutorialFlags & -5;
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.tutorialFlags = this.tutorialFlags | 4;
                  decompiledFrameRemainder0 = (var5 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (param0.opcode == 2) {
                  if (-114 != param0.field_d) {
                    this.tutorialHighlight = param0.field_d;
                    if (-101 != param0.field_d) {
                      this.tutorialHighlightAlpha = 256;
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.tutorialHighlightAlpha = 0;
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    this.tutorialHighlightAlpha = 255;
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (3 != param0.opcode) {
                    if (param0.opcode != 4) {
                      if (param0.opcode == 5) {
                        if (-107 == param0.field_d) {
                          if (param0.field_h != -106) {
                            var3_int = 0;
                            do {
                              if (var3_int >= 4) {
                                var3_int = 0;
                                break;
                              }
                              this.vehicles[param0.field_h].powerupLevels[var3_int] = 0;
                              var3_int++;
                            } while (var5 == 0);
                            do {
                              if (3 <= var3_int) {
                                this.vehicles[param0.field_h].specialPowerup = -1;
                                break;
                              }
                              this.vehicles[param0.field_h].heldPowerups[var3_int] = -1;
                              var3_int++;
                            } while (var5 == 0);
                            decompiledFrameRemainder0 = (var5 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            var4 = 0;
                            while (this.playerCount > var4) {
                              stackIn_186_0 = 0;
                              if (var5 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              var3_int = stackIn_186_0;
                              while (var3_int < 4) {
                                this.vehicles[var4].powerupLevels[var3_int] = 0;
                                var3_int++;
                              }
                              var3_int = 0;
                              while (var3_int < 3) {
                                this.vehicles[var4].heldPowerups[var3_int] = -1;
                                var3_int++;
                              }
                              this.vehicles[var4].specialPowerup = -1;
                              var4++;
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = (var5 != 0);
                            }
                          }
                        }
                        if ((decompiledFrameRemainder0) &&
                          (decompiledFrameCompleted2)) {
                          var3 = (TrackObject) (this.courseObjects.first((byte) 106));
                          while (null != var3) {
                            stackIn_187_0 = 0;
                            stackIn_187_1 = var3.flags & 512;
                            if (var5 != 0) {
                              decompiledFrameCompleted1 = false;
                              break;
                            }
                            if (stackIn_187_0 != stackIn_187_1 && (param0.field_d == -106 ||
                              (var3.flags & 3) == param0.field_d)) {
                              var3.unlink(0);
                            }
                            var3 = (TrackObject) (this.courseObjects.next((byte) -52));
                          }
                          if (decompiledFrameCompleted1) {
                            decompiledFrameRemainder0 = (var5 != 0);
                          }
                        }
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted2) &&
                        (decompiledFrameCompleted1)) {
                        if (param0.opcode == 7) {
                          var3_int = 0;
                          while (true) {
                            if (var3_int < 4) {
                              this.vehicles[param0.field_d].powerupLevels[var3_int] = 0;
                              var3_int++;
                              if (var5 == 0) {
                                continue;
                              }
                            } else {
                              this.vehicles[param0.field_d].heldPowerups[0] = param0.field_h;
                              this.vehicles[param0.field_d].heldPowerups[1] = param0.field_e;
                              this.vehicles[param0.field_d].heldPowerups[2] = param0.field_k;
                            }
                            break;
                          }
                          if (param0.field_h != -1) {
                            dupTemp$0 = this.vehicles[param0.field_d].powerupLevels;
                            dupTemp$0[param0.field_h] = dupTemp$0[param0.field_h] + 1;
                          }
                          if (param0.field_e != -1) {
                            dupTemp$1 = this.vehicles[param0.field_d].powerupLevels;
                            dupTemp$1[param0.field_e] = dupTemp$1[param0.field_e] + 1;
                          }
                          if (-1 != param0.field_k) {
                            dupTemp$2 = this.vehicles[param0.field_d].powerupLevels;
                            dupTemp$2[param0.field_k] = dupTemp$2[param0.field_k] + 1;
                          }
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (param0.opcode != 8) {
                            if (param0.opcode == 9) {
                              stackIn_139_0 = this.vehicles[param0.field_d];
                              stackIn_140_1 = (param0.field_h != 0);
                              stackIn_139_0.field_jb = stackIn_140_1;
                              this.vehicles[param0.field_d].field_M = param0.field_h;
                              decompiledFrameRemainder0 = (var5 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if (10 != param0.opcode) {
                                if (param0.opcode == 11) {
                                  this.lapLimit = param0.field_d;
                                  this.raceFinished = false;
                                  this.field_ob = -1;
                                  decompiledFrameRemainder0 = (var5 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (param0.opcode == 12) {
                                    this.paused = false;
                                    this.tutorialPage = -1;
                                    decompiledFrameRemainder0 = (var5 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (param0.opcode == 13))) {
                                    this.tutorialPage = -1;
                                    PlayerStatsRequest.a(7, false, false);
                                    decompiledFrameRemainder0 = (var5 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                this.vehicleCount = param0.field_d;
                                this.playerCount = param0.field_d;
                                var3_int = 0;
                                while (var3_int < this.playerCount) {
                                  this.vehicles[var3_int].reset(554646678);
                                  var3_int++;
                                  if (var5 != 0) {
                                    decompiledFrameCompleted0 = false;
                                    break;
                                  }
                                }
                                if (decompiledFrameCompleted0) {
                                  decompiledFrameRemainder0 = (var5 != 0);
                                }
                              }
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameCompleted0)) {
                            this.vehicles[param0.field_d].lapsCompleted = param0.field_h;
                            if (var5 != 0) {
                              this.placePickupRows(24936, param0.field_h, param0.field_d);
                              this.placePickupRing(param0.field_d, -1, param0.field_h);
                              stackIn_184_1 = (param0.field_d == -1);
                              this.paused = stackIn_184_1;
                            }
                          }
                        }
                      }
                    } else {
                      this.placePickupRows(24936, param0.field_h, param0.field_d);
                      if (var5 != 0) {
                        this.placePickupRing(param0.field_d, -1, param0.field_h);
                        stackIn_184_1 = (param0.field_d == -1);
                        this.paused = stackIn_184_1;
                      }
                    }
                  } else {
                    this.placePickupRing(param0.field_d, -1, param0.field_h);
                    if (var5 != 0) {
                      stackIn_184_1 = (param0.field_d == -1);
                      this.paused = stackIn_184_1;
                    }
                  }
                }
              }
            } else {
              stackIn_184_1 = (param0.field_d == -1);
              this.paused = stackIn_184_1;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_186_0 = param1;
          }
          if (decompiledFrameCompleted1) {
            stackIn_187_0 = stackIn_186_0;
            stackIn_187_1 = -88;
          }
          if (stackIn_187_0 >= stackIn_187_1) {
            this.updateTutorialTransitions(-43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_194_0 = var3_ref;
          stackIn_194_1 = new StringBuilder().append("sg.AA(");
          if (param0 == null) {
            stackIn_195_2 = "null";
          } else {
            stackIn_195_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_194_0), ((StringBuilder) (Object) stackIn_194_1).append(stackIn_195_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawTutorialOverlay(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_85_0 = 0;
        TutorialCalloutAnchor stackIn_98_0 = null;
        TutorialCalloutAnchor stackIn_119_0 = null;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        TutorialCalloutAnchor stackIn_132_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        TutorialPage var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        TutorialCalloutAnchor var3 = null;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        TrackObject var6 = null;
        int var6_int = 0;
        RaceVehicle var6_ref = null;
        TutorialPage var6_ref2 = null;
        int var7_int = 0;
        RaceVehicle var7 = null;
        TutorialCalloutAnchor var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        TrackObject var6Lifetime1;
        int var4_intLifetime1;
        var9 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (this.tutorialHighlight != -101) {
            var2_int = this.ticks % 60;
            stackIn_5_0 = 10;
            if (var2_int > 30) {
              stackIn_6_1 = 60 - var2_int;
            } else {
              stackIn_6_1 = var2_int;
            }
            var3_int = stackIn_5_0 + stackIn_6_1 / 2;
            var4_int = (30 + this.ticks) % 60;
            stackIn_9_0 = 10;
            if (var4_int <= 30) {
              stackIn_10_1 = var4_int;
            } else {
              stackIn_10_1 = -var4_int + 60;
            }
            var5_int = stackIn_9_0 + stackIn_10_1 / 2;
            if (-101 >= this.tutorialHighlight ||
              15 <= this.ticks % 30) {
              if (-106 > this.tutorialHighlight) {
                if (-111 >= this.tutorialHighlight) {
                  if ((this.tutorialHighlight != -111) &&
                    (decompiledFrameRemainder0 = !(this.tutorialHighlight < -113))) {
                    var6 = (TrackObject) (this.courseObjects.first((byte) 114));
                    while (var6 != null) {
                      if (var9 != 0) {
                        decompiledFrameCompleted3 = false;
                        break;
                      }
                      stackIn_31_0 = 0;
                      stackIn_31_1 = var6.flags & 32768;
                      if (stackIn_31_0 != stackIn_31_1 && (this.tutorialHighlight == -112 &&
                        (var6.flags & 3) == 0 ||
                        this.tutorialHighlight == -113 &&
                        (3 & var6.flags) == 1)) {
                        var7_int = 0;
                        while (var7_int < 2) {
                          stackIn_31_0 = ~var7_int;
                          stackIn_31_1 = -1;
                          stackIn_51_0 = (stackIn_31_0 == stackIn_31_1) ? var3_int : var5_int;
                          var8 = stackIn_51_0;
                          SoftwareRasterizer.drawLineAlpha(var6.position.x + (int)(var6.direction.x * (float)(var6.halfLength + var8) + var6.direction.y * (float)(var8 + var6.halfWidth)), var6.position.y + (int)((float)(var6.halfLength + var8) * var6.direction.y - var6.direction.x * (float)(var6.halfWidth + var8)), (int)(var6.direction.x * (float)(var8 + var6.halfLength) - var6.direction.y * (float)(var6.halfWidth + var8)) + var6.position.x, (int)((float)(var8 + var6.halfWidth) * var6.direction.x + (float)(var8 + var6.halfLength) * var6.direction.y) + var6.position.y, 16777087, this.tutorialHighlightAlpha);
                          SoftwareRasterizer.drawLineAlpha(var6.position.x + (int)(var6.direction.x * (float)(var8 + var6.halfLength) - (float)(var8 + var6.halfWidth) * var6.direction.y), var6.position.y + (int)((float)(var6.halfLength + var8) * var6.direction.y + (float)(var6.halfWidth + var8) * var6.direction.x), var6.position.x + (int)((float)(var6.halfLength + var8) * -var6.direction.x - (float)(var6.halfWidth + var8) * var6.direction.y), var6.position.y + (int)(-var6.direction.y * (float)(var6.halfLength + var8) + var6.direction.x * (float)(var8 + var6.halfWidth)), 16777087, this.tutorialHighlightAlpha);
                          SoftwareRasterizer.drawLineAlpha((int)(-(var6.direction.y * (float)(var6.halfWidth + var8)) + (float)(var6.halfLength + var8) * -var6.direction.x) + var6.position.x, (int)(-var6.direction.y * (float)(var6.halfLength + var8) + (float)(var8 + var6.halfWidth) * var6.direction.x) + var6.position.y, var6.position.x + (int)(var6.direction.y * (float)(var8 + var6.halfWidth) + (float)(var6.halfLength + var8) * -var6.direction.x), var6.position.y + (int)(-var6.direction.y * (float)(var8 + var6.halfLength) - var6.direction.x * (float)(var6.halfWidth + var8)), 16777087, this.tutorialHighlightAlpha);
                          SoftwareRasterizer.drawLineAlpha((int)(var6.direction.y * (float)(var6.halfWidth + var8) + -var6.direction.x * (float)(var6.halfLength + var8)) + var6.position.x, var6.position.y + (int)(-((float)(var8 + var6.halfWidth) * var6.direction.x) + -var6.direction.y * (float)(var8 + var6.halfLength)), var6.position.x + (int)(var6.direction.x * (float)(var8 + var6.halfLength) + (float)(var8 + var6.halfWidth) * var6.direction.y), (int)((float)(var8 + var6.halfLength) * var6.direction.y - var6.direction.x * (float)(var6.halfWidth + var8)) + var6.position.y, 16777087, this.tutorialHighlightAlpha);
                          var7_int++;
                        }
                      }
                      var6 = (TrackObject) (this.courseObjects.next((byte) -84));
                      continue;
                    }
                    if (decompiledFrameCompleted3) {
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted3)) {
                    var6_int = 0;
                    while (var6_int < this.playerCount) {
                      var7 = this.vehicles[var6_int];
                      oc.fillCircleAlpha(var3_int, var7.position.y, var7.position.x, 16777087, (byte) -95, this.tutorialHighlightAlpha);
                      oc.fillCircleAlpha(var5_int, var7.position.y, var7.position.x, 16777087, (byte) -92, this.tutorialHighlightAlpha);
                      var6_int++;
                      if (var9 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted3) &&
                  (decompiledFrameCompleted2)) {
                  var6_ref = this.vehicles[-107 - this.tutorialHighlight];
                  oc.fillCircleAlpha(var3_int, var6_ref.position.y, var6_ref.position.x, 16777087, (byte) -102, this.tutorialHighlightAlpha);
                  oc.fillCircleAlpha(var5_int, var6_ref.position.y, var6_ref.position.x, 16777087, (byte) 108, this.tutorialHighlightAlpha);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                var6Lifetime1 = (TrackObject) (this.courseObjects.first((byte) 116));
                while (null != var6Lifetime1) {
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (0 != (512 & var6Lifetime1.flags) && (-106 == this.tutorialHighlight ||
                    -this.tutorialHighlight - 102 == (3 & var6Lifetime1.flags))) {
                    oc.fillCircleAlpha(var3_int, var6Lifetime1.position.y, var6Lifetime1.position.x, 16777087, (byte) 109, this.tutorialHighlightAlpha);
                    oc.fillCircleAlpha(var5_int, var6Lifetime1.position.y, var6Lifetime1.position.x, 16777087, (byte) 93, this.tutorialHighlightAlpha);
                  }
                  var6Lifetime1 = (TrackObject) (this.courseObjects.next((byte) -61));
                }
                if ((decompiledFrameCompleted1) &&
                  (var9 != 0)) {
                  if (this.tutorialHighlight >= 0) {
                    stackIn_85_0 = this.tutorialHighlight;
                  } else {
                    stackIn_85_0 = this.roadSegments.length + this.tutorialHighlight;
                  }
                  var6_int = stackIn_85_0;
                  ValidatedTextField.a(this.roadSegments, var6_int, false, 115, AlternateUsernameLoginCredentials.field_l, var6_int + 1);
                }
              }
            } else {
              if (this.tutorialHighlight >= 0) {
                stackIn_85_0 = this.tutorialHighlight;
              } else {
                stackIn_85_0 = this.roadSegments.length + this.tutorialHighlight;
              }
              var6_int = stackIn_85_0;
              ValidatedTextField.a(this.roadSegments, var6_int, false, 115, AlternateUsernameLoginCredentials.field_l, var6_int + 1);
            }
          }
          var2 = RasterBuffer.field_a[this.tutorialPage];
          if (param0 != -3) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          if (null != var2.field_j &&
            var2.field_g != null) {
            if (this.field_n != 1) {
              stackIn_98_0 = var2.field_j;
            } else {
              stackIn_98_0 = var2.field_g;
            }
            var3 = stackIn_98_0;
            var4_intLifetime1 = 0;
            while (var4_intLifetime1 < 2) {
              stackIn_124_0 = ~(var3.field_f - 30);
              stackIn_124_1 = ~this.vehicles[0].position.x;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_124_0 > stackIn_124_1 &&
                var3.field_f + var3.field_d + 30 > this.vehicles[0].position.x &&
                var3.field_c - 30 < this.vehicles[0].position.y &&
                var3.field_c + var3.field_g + 30 > this.vehicles[0].position.y) {
                this.field_n = 1 - this.field_n;
                if (this.field_n == 1) {
                  stackIn_119_0 = var2.field_g;
                } else {
                  stackIn_119_0 = var2.field_j;
                }
                var3 = stackIn_119_0;
              }
              var4_intLifetime1++;
            }
            if ((decompiledFrameCompleted0) &&
              (var9 != 0)) {
              var3 = var2.field_j;
            }
          } else {
            var3 = var2.field_j;
          }
          if (decompiledFrameCompleted0) {
            stackIn_124_0 = ~this.previousTutorialPage;
            stackIn_124_1 = ~this.tutorialPage;
          }
          if (stackIn_124_0 != stackIn_124_1) {
            var4 = (float)Math.exp((double)(-0.20000000298023224f * (float)this.tutorialPageTicks));
            var5 = -var4 + 1.0f;
            if (-1 != this.previousTutorialPage) {
              var6_ref2 = RasterBuffer.field_a[this.previousTutorialPage];
              if (this.field_n == 1) {
                stackIn_132_0 = var6_ref2.field_g;
              } else {
                stackIn_132_0 = var6_ref2.field_j;
              }
              var7_ref = stackIn_132_0;
              if (var7_ref != null) {
                this.drawTutorialCallout(var6_ref2.name, var5, param0 - 11237, var7_ref, var6_ref2.text);
              }
            }
            if (var3 != null) {
              this.drawTutorialCallout(var2.name, var4, param0 ^ 11237, var3, var2.text);
            }
            if (var9 == 0) {
              return;
            }
          }
          if (null != var3) {
            this.drawTutorialCallout(var2.name, 0.0f, -11240, var3, var2.text);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "sg.H(" + param0 + ')');
        }
    }

    private final void initializeRace(boolean param0, int param1, int param2, byte param3, int param4, CourseDefinition param5, boolean param6) {
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_150_0 = 0;
        RaceVehicle stackIn_201_0 = null;
        TrackObject stackIn_205_0 = null;
        Object stackIn_211_0 = null;
        Object stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        TrackObject stackOut_204_0;
        Object var8 = null;
        int var9_int = 0;
        Object var9 = null;
        ZombiePedestrian var10_ref_vf = null;
        int var10 = 0;
        Point2i var10_ref_qm = null;
        int var11_int = 0;
        TrackObject var11 = null;
        int var12 = 0;
        TrackObject var13 = null;
        int var14 = 0;
        int var10Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          MusicPatch.initializeCollisionScratch(9);
          this.gameMode = param2;
          this.field_kb = false;
          this.twoPlayerMode = param6;
          this.lightMap = new Sprite(640, 480);
          this.resetParticleQueues((byte) -69);
          this.raceFinished = false;
          this.lapLimit = 8;
          this.field_b = false;
          if (param3 < 3) {
            this.lightMap = (Sprite) null;
          }
          boolean decompiledFrameCompleted4 = true;
          this.vehicles = new RaceVehicle[64];
          this.field_P = 0;
          this.ticks = 0;
          this.paused = false;
          this.raceTicks = -150;
          var8 = null;
          if (this.gameMode == 0 &&
            DelegatingCanvas.field_d == 7) {
            var8 = new int[4];
            var9_int = 0;
            while (var9_int < 4) {
              stackIn_29_0 = ~var9_int;
              stackIn_29_1 = ~TextWidgetStyle.field_g;
              if (var14 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
              if (stackIn_29_0 > stackIn_29_1) {
                ((int[]) (var8))[var9_int] = 3 - var9_int;
              } else if (var9_int <= TextWidgetStyle.field_g) {
                ((int[]) (var8))[var9_int] = 0;
              } else {
                ((int[]) (var8))[var9_int] = -var9_int + 4;
              }
              var9_int++;
            }
          }
          if (decompiledFrameCompleted4) {
            this.loadCourse((byte) 7, (int[]) (var8), param5);
            stackIn_29_0 = 16616;
            stackIn_29_1 = 0;
          }
          boolean decompiledFrameCompleted3 = true;
          if (LoginCredentialType.isFeatureEnabled(stackIn_29_0, stackIn_29_1) &&
            2 == this.gameMode) {
            AchievementUnlockRequest.field_n = new IntrusiveDeque();
            var9_int = 0;
            while (var9_int < 200) {
              var10_ref_vf = new ZombiePedestrian();
              AchievementUnlockRequest.field_n.addLast((byte) -94, var10_ref_vf);
              var9_int++;
              if (var14 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            this.achievementQueue = new int[16];
            this.field_rb = new int[16];
            this.field_rb[6] = -1;
            this.field_t = LayeredWidgetStyle.field_d;
            this.bannerCount = 0;
            this.field_g = GrowableStringList.field_c;
            this.field_hb = ni.field_b;
            this.bannerTicks = 0;
            this.field_rb[11] = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.courseTheme != 0) {
            if (this.courseTheme != 1) {
              if (this.courseTheme != 2) {
                this.field_H = -2084705208;
                this.field_N = 1884993344;
                this.field_p = 1744876195;
                this.field_l = 674154881;
                decompiledFrameRemainder1 = (var14 != 0);
              }
              if (decompiledFrameRemainder1) {
                this.field_N = 1627384728;
                this.field_p = -81247984;
                this.field_H = -2084713400;
                this.field_l = 1752551195;
                if (var14 != 0) {
                  this.field_N = -1947303144;
                  this.field_p = 2016652736;
                  this.field_l = -1138652621;
                  this.field_H = -1816269752;
                  this.field_l = 723448452;
                  this.field_H = -1816277944;
                  this.field_N = -127488232;
                  this.field_p = -1996410128;
                }
              }
            } else {
              this.field_N = -1947303144;
              this.field_p = 2016652736;
              this.field_l = -1138652621;
              this.field_H = -1816269752;
              if (var14 != 0) {
                this.field_l = 723448452;
                this.field_H = -1816277944;
                this.field_N = -127488232;
                this.field_p = -1996410128;
              }
            }
          } else {
            this.field_l = 723448452;
            this.field_H = -1816277944;
            this.field_N = -127488232;
            this.field_p = -1996410128;
          }
          boolean decompiledFrameCompleted2 = true;
          this.achievementTicks = 0;
          this.field_y = cm.field_a;
          this.field_rb[7] = -1;
          if (param0) {
            stackIn_67_0 = (this.twoPlayerMode) ? 2 : 1;
            var9_int = stackIn_67_0;
            var10 = -var9_int + this.playerCount;
            if (var10 > 0) {
              var11_int = 0;
              while (var11_int < var10) {
                stackIn_82_0 = var9_int;
                if (var14 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                var12 = stackIn_82_0;
                while (var12 < (-1 + this.vehicleCount)) {
                  this.vehicles[var12] = this.vehicles[1 + var12];
                  var12++;
                }
                this.vehicleCount = this.vehicleCount - 1;
                this.playerCount = this.playerCount - 1;
                var11_int++;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_82_0 = this.twoPlayerMode ? 1 : 0;
          }
          if (stackIn_82_0 != 0) {
            this.vehicles[0].keyBindings = ae.field_f;
            this.vehicles[1].keyBindings = ChatMessage.field_c;
            if (param4 != -1) {
              this.vehicles[0].setVehicleDefinition(20385, ContentTransitionState.field_c[param4]);
            }
            if (param1 != -1) {
              this.vehicles[1].setVehicleDefinition(20385, ContentTransitionState.field_c[param1]);
              if ((var14 != 0) && (5 != this.gameMode &&
                this.gameMode != 6 &&
                this.gameMode != 4)) {
                this.vehicles[0].keyBindings = ValidationState.field_a;
                if (-1 != param4) {
                  this.vehicles[0].setVehicleDefinition(20385, ContentTransitionState.field_c[param4]);
                }
              }
            }
          } else {
            if (5 != this.gameMode &&
              this.gameMode != 6 &&
              this.gameMode != 4) {
              this.vehicles[0].keyBindings = ValidationState.field_a;
              if (-1 != param4) {
                this.vehicles[0].setVehicleDefinition(20385, ContentTransitionState.field_c[param4]);
              }
            }
          }
          var9_int = 0;
          scanLoop1: while (true) {
            if (var9_int < this.vehicleCount) {
              this.vehicles[var9_int].playerIndex = var9_int;
              stackIn_201_0 = this.vehicles[var9_int];
              if (var14 == 0) {
                if (stackIn_201_0.definition.sprite == null) {
                  this.vehicles[var9_int].definition.sprite = this.vehicles[var9_int].definition.spriteAsset.getRotatedSprites((byte) 51);
                }
                if (null == this.vehicles[var9_int].definition.shadowSprite) {
                  this.vehicles[var9_int].definition.shadowSprite = this.vehicles[var9_int].definition.shadowAsset.getRotatedSprites((byte) 7);
                }
                var9_int++;
                continue;
              }
            } else {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              if (this.gameMode == 5) {
                var9 = (TrackObject) (this.courseObjects.first((byte) 125));
                while (null != var9) {
                  stackIn_150_0 = ~(((TrackObject) (var9)).flags & 512);
                  if (var14 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_150_0 != -1) {
                    ((TrackObject) (var9)).unlink(0);
                  }
                  var9 = (TrackObject) (this.courseObjects.next((byte) -57));
                }
              } else {
                if (this.gameMode == 6) {
                  var9_int = 0;
                  while (8 > var9_int) {
                    var10_ref_qm = new Point2i(0, 0);
                    stackIn_150_0 = 0;
                    if (var14 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var11_int = stackIn_150_0;
                    do {
                      var10_ref_qm.x = SolidRoadStripRenderer.b(2, 640);
                      var10_ref_qm.y = SolidRoadStripRenderer.b(2, 480);
                      var11_int = this.getRoadLayerMask(var10_ref_qm.y, var10_ref_qm.x, -118);
                      stackIn_139_0 = -1;
                      stackIn_139_1 = ~var11_int;
                    } while (stackIn_139_0 == stackIn_139_1);
                    stackIn_139_0 = ~(var11_int & 48);
                    stackIn_139_1 = -1;
                    if (stackIn_139_0 == stackIn_139_1) {
                      stackIn_148_0 = ((var11_int & 12) == 0) ? -1 : 0;
                    } else {
                      stackIn_148_0 = 1;
                    }
                    var12 = stackIn_148_0;
                    var13 = new TrackObject(var10_ref_qm, 1, var12);
                    this.courseObjects.addLast((byte) -120, var13);
                    var9_int++;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                stackIn_150_0 = 0;
              }
              var9_int = stackIn_150_0;
              while (true) {
                if (var9_int < this.vehicleCount) {
                  this.vehicles[var9_int].preferredPickup = SolidRoadStripRenderer.b(2, 3);
                  var9_int++;
                  if (var14 == 0) {
                    continue;
                  }
                } else {
                  this.tutorialPage = -1;
                  this.previousTutorialPage = -1;
                  this.tutorialFlags = 0;
                  this.tutorialHighlight = -101;
                }
                boolean decompiledFrameRemainder0 = true;
                if (this.gameMode == 3) {
                  this.clearRaceParticipants(4);
                  decompiledFrameRemainder0 = (var14 != 0);
                }
                if (decompiledFrameRemainder0) {
                  boolean decompiledSharedTail0 = (2 != this.gameMode ||
                    LoginCredentialType.isFeatureEnabled(16616, 0) ||
                    param6 ||
                    !(QuickChatPhraseDefinition.field_s));
                  if (!decompiledSharedTail0) {
                    QuickChatPhraseDefinition.field_s = false;
                    GrowableStringList.savePlayerProgress(0);
                    this.enterTutorialPage("demolition", (byte) 8);
                    decompiledSharedTail0 = (var14 != 0);
                  }
                  if ((decompiledSharedTail0) && (this.courseTheme == 3 &&
                    ChatMessage.field_l &&
                    this.gameMode != 5 &&
                    this.gameMode != 6 &&
                    this.gameMode != 2)) {
                    ChatMessage.field_l = false;
                    GrowableStringList.savePlayerProgress(0);
                    this.enterTutorialPage("night", (byte) 8);
                  }
                }
                this.resultObjects = new IntrusiveDeque();
                if (this.gameMode >= 5) {
                  break scanLoop1;
                }
                if (param6) {
                  stackIn_201_0 = null;
                  break;
                }
                stackIn_201_0 = this.vehicles[0];
                break;
              }
            }
            NameRequestState.setSoundListener(stackIn_201_0, -15676);
            if (var14 == 0) {
              return;
            }
            break;
          }
          var9 = null;
          var10Lifetime1 = 0;
          var11 = (TrackObject) (this.courseObjects.first((byte) 89));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var11))) {
            stackOut_204_0 = var11;
            stackIn_211_0 = stackOut_204_0;
            stackIn_205_0 = stackOut_204_0;
            if (var14 == 0) {
              if (stackIn_205_0.position.x > var10Lifetime1) {
                var10Lifetime1 = var11.position.x;
                var9 = var11;
              }
              var11 = (TrackObject) (this.courseObjects.next((byte) -80));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_211_0 = var9;
          }
          NameRequestState.setSoundListener((MovingEntity) (stackIn_211_0), -15676);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_216_0 = var8;
          stackIn_216_1 = new StringBuilder().append("sg.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) (stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param6).append(')').toString());
        }
    }

    final void detonateSmallProjectile(TrackObject param0, boolean param1) {
        int discarded$6 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.unlink(0);
          RoadStripRenderer.playPositionalSound(NamedSoundEffect.field_p.field_q, param0.position, -78, NamedSoundEffect.field_p);
          ArchiveIndex.a(0, param0.position.y, 0, 64, 1, -16, param0.position.x, param0.layer, this.lightParticles, 16776960, 0, 255, 20);
          discarded$6 = this.applyBlast(-30808, 3, 25, param0, 32, 100000.0f);
          if (param1) {
            this.drawCourseBackground(-25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sg.DA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawVehicleHeadlights(int param0, RaceVehicle param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var3_int = 70 + param1.definition.halfLength;
          var4 = param1.heading;
          var4 = (float)((double)var4 * 10.185916357881302);
          var5 = Math.round(var4);
          scanLoop1: while (true) {
            if (var5 < 0) {
              var5 += 64;
              if (var9 == 0) {
                continue;
              }
            } else {
              while (var5 >= 64) {
                var5 -= 64;
                if (var9 != 0) {
                  break scanLoop1;
                }
              }
              var4 = 6.2831854820251465f * (float)var5 / (float)param0;
            }
            break;
          }
          var6 = param1.position.x + (int)((double)var3_int * Math.cos((double)var4));
          var7 = param1.position.y + (int)(-Math.sin((double)var4) * (double)var3_int);
          vb.a(param0 ^ -7, this.lightMap);
          var8 = TriangleMesh.field_f.getByAngle(param1.heading, param0 + 27724);
          WhirlpoolHasher.drawScreenBlendedSprite(-(var8.canvasHeight >> 1) + var7, -(var8.canvasWidth >> 1) + var6, 121, var8);
          MarkerSliderRenderer.restoreRasterTarget(param0 - 65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("sg.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void drawPlayerHud(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_184_2 = 0;
        int stackIn_184_3 = 0;
        int stackIn_184_4 = 0;
        int stackIn_204_3 = 0;
        int stackIn_207_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RaceVehicle var6 = null;
        int var7 = 0;
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
        var18 = HoldTheLine.field_D;
        try {
          if (param0 != -109) {
            this.field_m = (ue[]) null;
          }
          var2_int = 0;
          scanLoop1: while (true) {
            stackIn_6_0 = ~var2_int;
            stackIn_6_1 = ~this.playerCount;
            if (stackIn_6_0 > stackIn_6_1) {
              var6 = this.vehicles[var2_int];
              if (var18 != 0) {
                return;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 == this.gameMode ||
                this.gameMode == 3) {
                var7 = var6.playerIndex;
                switch ((var18 == 0
                  || var7 == 1
                  || var7 == 2
                  ) ? var7 : -1) {
                  case 0:
                    var4 = 30;
                    var3 = 10;
                    {
                      break;
                    }
                  case 1:
                    var3 = 580;
                    var4 = 30;
                    {
                      break;
                    }
                  case 2:
                    var3 = 10;
                    var4 = 420;
                    {
                      break;
                    }
                  default:
                    var3 = 580;
                    var4 = 420;
                }
                var7 = var6.field_tc;
                if (var6.field_ob <= 10 &&
                  !this.paused &&
                  dg.field_c == -1) {
                  stackIn_40_0 = -var6.field_ob + 10;
                } else {
                  stackIn_40_0 = 0;
                }
                var8 = stackIn_40_0;
                CheckboxRenderer.a(-1, 1024 + var8 * 16, hk.field_a[20 + var6.racePosition], var3, var7, var4);
                var9 = var6.playerIndex;
                switch ((var18 == 0
                  || var9 == 1
                  || var9 == 2
                  ) ? var9 : -1) {
                  case 0:
                    var4 = 3;
                    var3 = 5;
                    {
                      break;
                    }
                  case 1:
                    var4 = 3;
                    var3 = 615;
                    {
                      break;
                    }
                  case 2:
                    var4 = 453;
                    var3 = 5;
                    {
                      break;
                    }
                  default:
                    var3 = 615;
                    var4 = 453;
                }
                var9 = var6.lapsCompleted % 10;
                if (10 >= var6.field_X &&
                  !this.paused &&
                  dg.field_c == -1) {
                  stackIn_66_0 = 10 - var6.field_X;
                } else {
                  stackIn_66_0 = 0;
                }
                var8 = stackIn_66_0;
                if (this.lapLimit < var6.lapsCompleted &&
                  this.lapLimit != -1) {
                  var9 = this.lapLimit;
                  if (10 > this.ticks % 20) {
                    var7 = 16777215;
                  }
                }
                UsernameLoginCredentials.a(hk.field_a[var9 + 10], -100, var4, var3, 1024 + var8 * 16, var7);
                var10 = var6.playerIndex;
                switch ((var18 == 0
                  || var10 == 1
                  || var10 == 2
                  ) ? var10 : -1) {
                  case 0:
                    var4 = 3;
                    var3 = 20;
                    {
                      break;
                    }
                  case 1:
                    var3 = 576;
                    var4 = 3;
                    {
                      break;
                    }
                  case 2:
                    var3 = 22;
                    var4 = 453;
                    {
                      break;
                    }
                  default:
                    var3 = 577;
                    var4 = 453;
                }
                hk.field_a[24].draw(var3, var4);
              } else {
                if (this.gameMode == 2) {
                  var7 = var6.playerIndex;
                  switch ((var18 == 0
                    || var7 == 1
                    || var7 == 2
                    ) ? var7 : -1) {
                    case 0:
                      var4 = 30;
                      var3 = 10;
                      {
                        break;
                      }
                    case 1:
                      var3 = 580;
                      var4 = 30;
                      {
                        break;
                      }
                    case 2:
                      var4 = 420;
                      var3 = 10;
                      {
                        break;
                      }
                    default:
                      var4 = 420;
                      var3 = 580;
                  }
                  var7 = var6.field_tc;
                  if (var6.field_ob <= 10 &&
                    !this.paused &&
                    dg.field_c == -1) {
                    stackIn_120_0 = -var6.field_ob + 10;
                  } else {
                    stackIn_120_0 = 0;
                  }
                  var8 = stackIn_120_0;
                  CheckboxRenderer.a(-1, 16 * var8 + 1024, hk.field_a[var6.racePosition + 20], var3, var7, var4);
                  var9 = var6.playerIndex;
                  switch ((var18 == 0
                    || var9 == 2
                    ) ? var9 : -1) {
                    case 0:
                      var3 = 5;
                      var4 = 3;
                      {
                        break;
                      }
                    case 1:
                      var3 = 615;
                      var4 = 3;
                      {
                        break;
                      }
                    case 2:
                      var3 = 5;
                      var4 = 453;
                      {
                        break;
                      }
                    default:
                      var4 = 453;
                      var3 = 615;
                  }
                  if (var6.field_X <= 10 &&
                    !this.paused &&
                    dg.field_c == -1) {
                    stackIn_149_0 = -var6.field_X + 10;
                  } else {
                    stackIn_149_0 = 0;
                  }
                  var8 = stackIn_149_0;
                  stackIn_153_0 = (!LoginCredentialType.isFeatureEnabled(16616, 0)) ? 2 : 3;
                  var9 = stackIn_153_0;
                  if (var6.playerIndex == 0 ||
                    var6.playerIndex == 2) {
                    var3 = var3 + 12 * var9;
                  }
                  var10 = var6.kills;
                  var11 = 0;
                  while (var9 > var11) {
                    var12 = var10 % 10;
                    UsernameLoginCredentials.a(hk.field_a[var12 + 10], -95, var4, var3 - 12 * var11, 1024 + var8 * 16, var7);
                    var10 = var10 / 10;
                    var11++;
                  }
                  var11 = var6.playerIndex;
                  switch ((var18 == 0
                    || var11 == 1
                    || var11 == 2
                    ) ? var11 : -1) {
                    case 0:
                      var5 = 1;
                      var3 = 80;
                      var4 = 35;
                      {
                        break;
                      }
                    case 1:
                      var5 = 1;
                      var4 = 35;
                      var3 = 505;
                      {
                        break;
                      }
                    case 2:
                      var4 = 425;
                      var3 = 80;
                      var5 = 1;
                      {
                        break;
                      }
                    default:
                      var4 = 425;
                      var5 = 1;
                      var3 = 505;
                  }
                  var11 = (int)(var6.displayHealth * 80.0f / (float)var6.definition.maxHealth);
                  var12 = (int)(var6.health * 80.0f / (float)var6.definition.maxHealth);
                  var13 = 0;
                  scanLoop2: while (true) {
                    if (var13 >= 2) {
                      while (true) {
                        var13 = 0;
                        while (20 > var13) {
                          SoftwareRasterizer.drawHorizontalLine(-2 + (-(var5 * var13 / 2) + var3), var4 + var13, 2, 0);
                          SoftwareRasterizer.drawHorizontalLine(-(var5 * var13 / 2) + (80 + var3), var4 + var13, 2, 0);
                          var13++;
                        }
                        var13 = 0;
                        while (var13 < 3) {
                          SoftwareRasterizer.drawHorizontalLine(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb);
                          stackIn_207_0 = 0;
                          var14 = stackIn_207_0;
                          while (3 > var14) {
                            stackIn_184_0 = 80 + (var3 - (-(var14 * 10) + (30 + var13 * var5 / 2)));
                            stackIn_184_1 = var13 + var4;
                            stackIn_184_2 = 10;
                            stackIn_184_3 = 0;
                            stackIn_184_4 = var14 % 2;
                            if (stackIn_184_3 == stackIn_184_4) {
                              stackIn_204_3 = 16777215;
                            } else {
                              stackIn_204_3 = var6.field_Eb;
                            }
                            SoftwareRasterizer.drawHorizontalLine(stackIn_184_0, stackIn_184_1, stackIn_184_2, stackIn_204_3);
                            var14++;
                          }
                          var13++;
                        }
                        break scanLoop2;
                      }
                    } else {
                      SoftwareRasterizer.drawHorizontalLine((var13 + 1) * var5 / 2 + var3 - 2, -1 + (var4 - var13), 84, 0);
                      stackIn_184_0 = -2;
                      stackIn_184_1 = var3;
                      stackIn_184_2 = var5;
                      stackIn_184_3 = var13;
                      stackIn_184_4 = -20;
                      while (true) {
                        SoftwareRasterizer.drawHorizontalLine(stackIn_184_0 + (stackIn_184_1 - stackIn_184_2 * (stackIn_184_3 - stackIn_184_4) / 2), var4 + (20 + var13), 84, 0);
                        var13++;
                        continue scanLoop2;
                      }
                    }

                  }
                  stackIn_207_0 = 3;
                  var13 = stackIn_207_0;
                  while (var13 < 20) {
                    stackIn_6_0 = -51;
                    stackIn_6_1 = ~var11;
                    if (stackIn_6_0 >= stackIn_6_1) {
                      SoftwareRasterizer.drawHorizontalLineAlpha(var3 - var5 * var13 / 2, var13 + var4, 50, var6.field_Eb, 192);
                    } else {
                      SoftwareRasterizer.drawHorizontalLineAlpha(var3 - var5 * var13 / 2, var13 + var4, var11, var6.field_Eb, 192);
                      SoftwareRasterizer.drawHorizontalLineAlpha(var3 - (var5 * var13 / 2 - var11), var4 + var13, -var11 + 50, var6.field_Eb >> 1 & 8355711, 192);
                    }
                    var14 = 0;
                    while (3 > var14) {
                      stackIn_239_0 = -1;
                      stackIn_239_1 = ~(var14 % 2);
                      if (stackIn_239_0 != stackIn_239_1) {
                        stackIn_225_0 = var6.field_Eb;
                      } else {
                        stackIn_225_0 = 16777215;
                      }
                      var15 = stackIn_225_0;
                      var16 = (var15 & 16711422) >> 1;
                      var17 = 80 + (-30 + 10 * var14);
                      if (var11 < var17) {
                        SoftwareRasterizer.drawHorizontalLineAlpha(var3 + var17 - var5 * var13 / 2, var4 + var13, 10, var16, 192);
                      } else if (var17 + 10 <= var11) {
                        SoftwareRasterizer.drawHorizontalLineAlpha(var3 + var17 - var13 * var5 / 2, var4 + var13, 10, var15, 192);
                      } else {
                        SoftwareRasterizer.drawHorizontalLineAlpha(var3 + var17 - var13 * var5 / 2, var13 + var4, -var17 + var11, var15, 192);
                        SoftwareRasterizer.drawHorizontalLineAlpha(var3 + var11 - var5 * var13 / 2, var4 + var13, 10 - (-var17 + var11), var16, 192);
                      }
                      var14++;
                    }
                    stackIn_239_0 = ~var11;
                    stackIn_239_1 = ~var12;
                    if (stackIn_239_0 < stackIn_239_1) {
                      SoftwareRasterizer.drawHorizontalLineAlpha(-(var5 * var13 / 2) + var3 + var12, var4 + var13, -var12 + var11, 16777215, 256);
                    }
                    var13++;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (this.gameMode == 1 &&
                    var6.lapsCompleted > 0) {
                    var7 = var6.playerIndex;
                    switch ((var18 == 0
                      || var7 == 2
                      ) ? var7 : -1) {
                      case 0:
                        var4 = 10;
                        var3 = 10;
                        var5 = 12;
                        {
                          break;
                        }
                      case 1:
                        var5 = 12;
                        var3 = 575;
                        var4 = 10;
                        {
                          break;
                        }
                      case 2:
                        var3 = 10;
                        var5 = 12;
                        var4 = 450;
                        {
                          break;
                        }
                      default:
                        var4 = 450;
                        var5 = 12;
                        var3 = 575;
                    }
                    var7 = var6.field_ab / 50;
                    var7 = var7 % 100;
                    var8 = var7 / 10;
                    var9 = var7 % 10;
                    var10 = var6.field_ab % 50 / 5;
                    var11 = 2 * (var6.field_ab % 5);
                    CheckboxRenderer.a(-1, 1024, hk.field_a[10 + var8], var3, 16777215, var4);
                    CheckboxRenderer.a(-1, 1024, hk.field_a[10 + var9], var5 + var3, 16777215, var4);
                    CheckboxRenderer.a(-1, 768, hk.field_a[var10 + 10], var3 + var5 * 2, 16777215, var4 + 1);
                    CheckboxRenderer.a(-1, 768, hk.field_a[10 + var11], (11 * var5 >> 2) + var3, 16777215, 1 + var4);
                  }
                }
              }
              var2_int++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.BB(" + param0 + ')');
        }
    }

    private final void drawPointLight(int param0, PointLight param1) {
        RuntimeException runtimeException = null;
        Sprite var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          TutorialTransition.a(32381);
          this.lightMap.bindRaster();
          var3 = DisplayNameForm.field_Q;
          WhirlpoolHasher.drawScreenBlendedSprite(-(var3.height >> 1) + param1.y, param1.x - (var3.width >> 1), 103, var3);
          MarkerSliderRenderer.restoreRasterTarget(-1);
          if (param0 >= -24) {
            this.resultObjects = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("sg.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void drawCourseBackground(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 96) {
            this.field_eb = (int[]) null;
          }
          this.drawCourseBackground(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.NA(" + param0 + ')');
        }
    }

    private final void drawRaceTimer(boolean param0) {
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        try {
          var2_int = 264;
          var3 = 22;
          var4 = this.raceTicks;
          var5 = this.raceTicks;
          if (this.gameMode != 0 &&
            3 != this.gameMode) {
            if (this.gameMode == 1 &&
              0 < this.raceTicks) {
              var5 = this.vehicles[0].field_X;
              var4 = this.vehicles[0].field_X;
              if (HoldTheLine.field_D != 0 &&
                this.raceFinished) {
                var4 = this.field_ob;
              }
            }
          } else {
            if (this.raceFinished) {
              var4 = this.field_ob;
            }
          }
          if (this.raceTicks < 0) {
            var4 = -this.raceTicks;
          }
          var6 = var4 / 50;
          var7 = var6 / 60;
          var6 = var6 % 60;
          var8 = var7 / 10 % 10;
          var9 = var7 % 10;
          var10 = var6 / 10;
          var11 = var6 % 10;
          var12 = var4 % 50 / 5;
          var13 = 2 * (var4 % 5);
          var14 = NamedSoundEffect.a(50, var5, -3248);
          if (!param0) {
            this.drawDirectionArrow((byte) -128, (Vector2f) null, 61, -5, 7);
          }
          if (!this.raceFinished &&
            var14 <= 10) {
            stackIn_31_0 = -(var14 / 2) + 5;
          } else {
            stackIn_31_0 = 0;
          }
          var15 = stackIn_31_0;
          var16 = NamedSoundEffect.a(500, var5, -3248);
          if (!this.raceFinished &&
            var16 <= 10) {
            stackIn_38_0 = -(var16 / 2) + 5;
          } else {
            stackIn_38_0 = 0;
          }
          var17 = stackIn_38_0;
          var18 = NamedSoundEffect.a(3000, var5, -3248);
          if (!this.raceFinished &&
            var18 <= 10) {
            stackIn_45_0 = -(var18 / 2) + 5;
          } else {
            stackIn_45_0 = 0;
          }
          var19 = stackIn_45_0;
          var20 = NamedSoundEffect.a(30000, var5, -3248);
          if (!this.raceFinished &&
            var20 <= 10) {
            stackIn_52_0 = 5 - var20 / 2;
          } else {
            stackIn_52_0 = 0;
          }
          var21 = stackIn_52_0;
          if (this.paused ||
            dg.field_c != -1) {
            var17 = 0;
            var19 = 0;
            var21 = 0;
            var15 = 0;
          }
          stackIn_63_0 = (this.raceTicks < 0) ? 16760576 : 16777215;
          var22 = stackIn_63_0;
          CheckboxRenderer.a(-1, 1024, hk.field_a[27], var3 * 2 + var2_int, var22, 20);
          CheckboxRenderer.a(-1, 64 * var21 + 1024, hk.field_a[0 + var8], var2_int, var22, 10);
          CheckboxRenderer.a(-1, var19 * 64 + 1024, hk.field_a[0 + var9], var3 + var2_int, var22, 10);
          CheckboxRenderer.a(-1, 1024 + var17 * 64, hk.field_a[0 + var10], 8 + (2 * var3 + var2_int), var22, 10);
          CheckboxRenderer.a(-1, var15 * 64 + 1024, hk.field_a[var11 + 0], 8 + var2_int + var3 * 3, var22, 10);
          CheckboxRenderer.a(-1, 768, hk.field_a[var12 + 0], var2_int + (4 * var3 + 8), var22, 11);
          CheckboxRenderer.a(-1, 768, hk.field_a[0 + var13], 8 + ((19 * var3 >> 2) + var2_int), var22, 11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.HB(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_v = null;
          if (param0 != -26919) {
            RaceWorld.clearSharedReferences(-48);
          }
          field_gb = (String[][]) null;
          navigationUrl = null;
          field_Z = null;
          field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "sg.IB(" + param0 + ')');
        }
    }

    private final Point2i findSpriteOutsideBounds(int param0, int param1, Sprite param2, int param3, int param4) {
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_62_0 = null;
        Point2i stackIn_64_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_57_0Lifetime1;
        int stackIn_57_1Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          param1 = param1 + param2.offsetX;
          if (param1 < 640 &&
            param1 > -param2.width) {
            param0 = param0 + param2.offsetY;
            if (param0 < 480 &&
              -param2.height < param0) {
              stackIn_17_0 = (param1 <= 0) ? 0 : param1;
              var6_int = stackIn_17_0;
              var7 = param2.width + param1;
              if (var7 > 640) {
                var7 = 640;
              }
              stackIn_25_0 = (param0 <= 0) ? 0 : param0;
              var8 = stackIn_25_0;
              var9 = param2.height + param0;
              if (var9 > 480) {
                var9 = 480;
              }
              var7 = var7 - var6_int;
              var9 = var9 - var8;
              var10 = var8 * 640 + var6_int;
              if (param3 >= -57) {
                this.tutorialPageTicks = 21;
              }
              var11 = 640 - var7;
              var12 = var6_int - (param1 - (-param0 + var8) * param2.width);
              var13 = param2.width - var7;
              var14 = this.roadLayerMask.pixels;
              if (param4 >= 1) {
                stackIn_40_0 = 60;
              } else {
                stackIn_40_0 = (param4 <= -1) ? 15 : 63;
              }
              var15 = stackIn_40_0;
              var16 = 0;
              var17 = 0;
              var18 = 0;
              var6_int = var6_int + var7;
              var8 = var8 + var9;
              var19 = param2.pixels;
              var20 = -var9;
              scanLoop1: while (true) {
                if (var20 < 0) {
                  stackIn_59_0 = -var7;
                  if (var22 != 0) {
                    break scanLoop1;
                  }
                  var21 = stackIn_59_0;
                  while (var21 < 0) {
                    stackIn_57_0 = ~var19[var12];
                    stackIn_57_1 = -1;
                    if (stackIn_57_0 != stackIn_57_1 &&
                      0 == (var15 & var14[var10])) {
                      var16 = var16 + var21;
                      var17 = var17 + var20;
                      var18++;
                    }
                    var12++;
                    var10++;
                    var21++;
                  }
                  var10 = var10 + var11;
                  stackIn_57_0Lifetime1 = var12;
                  stackIn_57_1Lifetime1 = var13;
                  var12 = stackIn_57_0Lifetime1 + stackIn_57_1Lifetime1;
                  var20++;
                  continue scanLoop1;
                }
                stackIn_59_0 = var18;
                break;
              }
              if (stackIn_59_0 == 0) {
                stackIn_62_0 = null;
                return (Point2i) (stackIn_62_0);
              }
              stackIn_64_0 = new Point2i(var16 / var18 + (var7 + param1), var17 / var18 + var9 + param0);
              return stackIn_64_0;
            }
            stackIn_12_0 = null;
            return (Point2i) (stackIn_12_0);
          }
          stackIn_6_0 = null;
          return (Point2i) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_68_0 = var6;
          stackIn_68_1 = new StringBuilder().append("sg.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void drawVehicleLight(int param0, RaceVehicle param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.lightSprite == null) {
            param1.lightSprite = ImageProducerRasterBuffer.createRadialLightSprite(param1.definition.field_d, (byte) 27, param1.field_Eb);
          }
          vb.a(-67, this.lightMap);
          if (param0 != 32249) {
            this.drawRaceTimer(false);
          }
          WhirlpoolHasher.drawScreenBlendedSprite(param1.position.y - (param1.lightSprite.height >> 1), param1.position.x - (param1.lightSprite.width >> 1), 108, param1.lightSprite);
          MarkerSliderRenderer.restoreRasterTarget(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sg.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void resetParticleQueues(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted1 = true;
          var2_int = 5;
          if (null == this.trailParticles) {
            this.trailParticles = new IntrusiveDeque[var2_int];
            var3 = 0;
            while (this.trailParticles.length > var3) {
              this.trailParticles[var3] = new IntrusiveDeque();
              var3++;
              if (var4 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (var4 != 0)) {
              PathWaypoint.a(false, this.trailParticles);
            }
          } else {
            PathWaypoint.a(false, this.trailParticles);
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.sparkParticles == null) {
            this.sparkParticles = new IntrusiveDeque[var2_int];
            var3Lifetime1 = 0;
            while (var3Lifetime1 < this.sparkParticles.length) {
              this.sparkParticles[var3Lifetime1] = new IntrusiveDeque();
              var3Lifetime1++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var4 != 0)) {
              PathWaypoint.a(false, this.sparkParticles);
            }
          } else {
            PathWaypoint.a(false, this.sparkParticles);
          }
          if (this.lightParticles == null) {
            this.lightParticles = new IntrusiveDeque[var2_int];
            var3Lifetime2 = 0;
            while (this.lightParticles.length > var3Lifetime2) {
              this.lightParticles[var3Lifetime2] = new IntrusiveDeque();
              var3Lifetime2++;
              if (var4 != 0) {
                return;
              }
            }
            if (var4 != 0) {
              PathWaypoint.a(false, this.lightParticles);
            }
          } else {
            PathWaypoint.a(false, this.lightParticles);
          }
          this.pointLights = new IntrusiveDeque();
          var3Lifetime3 = -112 % ((param0 + 8) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.SA(" + param0 + ')');
        }
    }

    private final void applyDirectionalObjectEffect(TrackObject param0, RaceVehicle param1, byte param2) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        float var4_floatLifetime1;
        var6 = HoldTheLine.field_D;
        try {
          if (!IterableNodeHashTable.a(param1, param0, 32758)) {
            return;
          }
          if (param2 != 7) {
            this.field_f = false;
          }
          if ((3 & param0.flags) != 0) {
            if (1 == (3 & param0.flags)) {
              var4_float = param0.direction.y * param1.velocityY + param1.velocityX * param0.direction.x;
              if (10.0f < var4_float) {
                param1.velocityX = param1.velocityX * 0.949999988079071f;
                param1.velocityY = param1.velocityY * 0.949999988079071f;
              }
              if (var6 == 0) {
                return;
              }
            }
            if ((3 & param0.flags) != 2) {
              return;
            }
            var4_int = (int)(param1.worldX - (float)param1.definition.halfLength * param1.direction.x);
            var5 = (int)(param1.worldY - (float)param1.definition.halfLength * param1.direction.y);
            if ((param0.collisionRadius * param0.collisionRadius) > ((-param0.position.x + var4_int) * (-param0.position.x + var4_int) + (-param0.position.y + var5) * (var5 - param0.position.y))) {
              param1.steeringRecoveryTicks = 50;
            }
            if (var6 == 0) {
              return;
            }
          }
          var4_floatLifetime1 = param1.velocityY * param0.direction.y + param1.velocityX * param0.direction.x;
          if (-1.0f <= var4_floatLifetime1) {
            param1.velocityX = param1.velocityX + param0.direction.x * 2.0f;
            param1.velocityY = param1.velocityY + 2.0f * param0.direction.y;
            if (var6 == 0) {
              return;
            }
          }
          if (var4_floatLifetime1 < -5.0f) {
            param1.velocityY = param1.velocityY * 0.949999988079071f;
            param1.velocityX = param1.velocityX * 0.949999988079071f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("sg.O(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    final void update(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_32_1 = false;
        TrackObject stackIn_70_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        boolean stackIn_95_1 = false;
        boolean stackIn_114_1 = false;
        boolean stackIn_125_1 = false;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        RaceVehicle stackIn_179_0 = null;
        RaceVehicle stackIn_201_0 = null;
        Object stackIn_227_0 = null;
        ZombiePedestrian stackIn_231_0 = null;
        Object stackIn_240_0 = null;
        int stackIn_249_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_303_1 = 0;
        int stackIn_345_0 = 0;
        int stackIn_345_1 = 0;
        int stackIn_356_0 = 0;
        int stackIn_356_1 = 0;
        boolean stackIn_413_1 = false;
        int stackIn_505_0 = 0;
        int stackIn_505_1 = 0;
        int stackIn_535_0 = 0;
        int stackIn_535_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RaceVehicle stackOut_178_0;
        RaceVehicle stackOut_200_0;
        ZombiePedestrian stackOut_230_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        TrackObject var4 = null;
        int var4_int = 0;
        ZombiePedestrian var4_ref = null;
        TrackObject var5 = null;
        int var5_int = 0;
        RaceVehicle var5_ref = null;
        PointLight var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        TrackObject var4Lifetime1;
        ZombiePedestrian var4_refLifetime1;
        int stackIn_88_0Lifetime1;
        int stackIn_88_1Lifetime1;
        int stackIn_303_0Lifetime1;
        int stackIn_303_1Lifetime1;
        int stackIn_345_0Lifetime1;
        int stackIn_345_1Lifetime1;
        int var5_intLifetime1;
        int var7_intLifetime1;
        int var5_intLifetime2;
        var13 = HoldTheLine.field_D;
        try {
          if (this.tutorialPage != -1) {
            this.updateTutorialTransitions(31782);
          }
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted5 = true;
          if (5 > this.gameMode) {
            while (qh.pollKeyEvent(-64)) {
              stackIn_148_0 = DelayedServerPacket.field_n;
              stackIn_148_1 = 13;
              if (var13 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
              if (stackIn_148_0 == stackIn_148_1) {
                DropTargetWidget.setRequestedDisplayMode(1, (byte) 100, true);
                TrackObject.switchMenu(true, false, 1);
                return;
              }
              if (RotatedSpriteCache.field_c) {
                if (DelayedServerPacket.field_n == 1) {
                  stackIn_24_0 = !(LoginCredentialType.field_c);
                  LoginCredentialType.field_c = stackIn_24_0;
                }
                if (2 == DelayedServerPacket.field_n) {
                  stackIn_32_1 = !(this.field_kb);
                  this.field_kb = stackIn_32_1;
                }
                if (IterableSecondaryNodeDeque.field_g[82]) {
                  if (DelayedServerPacket.field_n == 9) {
                    var4 = (TrackObject) (this.courseObjects.first((byte) 110));
                    while (null != var4) {
                      stackIn_88_0 = ~(var4.flags & 512);
                      stackIn_88_1 = -1;
                      if (stackIn_88_0 != stackIn_88_1) {
                        var4.unlink(0);
                      }
                      var4 = (TrackObject) (this.courseObjects.next((byte) 127));
                    }
                    l.field_b = true;
                  } else {
                    var4_int = -1;
                    if (DelayedServerPacket.field_n == 5) {
                      var4_int = 0;
                    }
                    if (DelayedServerPacket.field_n == 6) {
                      var4_int = 1;
                    }
                    if (7 == DelayedServerPacket.field_n) {
                      var4_int = 2;
                    }
                    if (DelayedServerPacket.field_n == 8) {
                      var4_int = 3;
                    }
                    if (-1 != var4_int) {
                      l.field_b = true;
                      var5 = (TrackObject) (this.courseObjects.first((byte) 112));
                      while (null != var5) {
                        stackIn_88_0 = 0;
                        stackIn_88_1 = 512 & var5.flags;
                        if (stackIn_88_0 != stackIn_88_1) {
                          var5.flags = var5.flags & -4;
                          var5.flags = var5.flags | var4_int;
                          stackIn_70_0 = var5;
                          if (3 != var4_int) {
                            stackIn_71_1 = 2 + var4_int;
                          } else {
                            stackIn_71_1 = 1;
                          }
                          stackIn_70_0.definition = ArchiveCatalog.a(stackIn_71_1, (byte) 17);
                        }
                        var5 = (TrackObject) (this.courseObjects.next((byte) -72));
                      }
                    }
                  }
                } else {
                  if (5 == DelayedServerPacket.field_n) {
                    this.vehicles[0].collectPowerup(3, 0);
                    l.field_b = true;
                  }
                  if (DelayedServerPacket.field_n == 6) {
                    this.vehicles[0].collectPowerup(3, 1);
                    l.field_b = true;
                  }
                  if (DelayedServerPacket.field_n == 7) {
                    this.vehicles[0].collectPowerup(3, 2);
                    l.field_b = true;
                  }
                }
                stackIn_88_0Lifetime1 = DelayedServerPacket.field_n;
                stackIn_88_1Lifetime1 = 12;
                if (stackIn_88_0Lifetime1 == stackIn_88_1Lifetime1) {
                  stackIn_95_1 = !(this.field_T);
                  this.field_T = stackIn_95_1;
                  l.field_b = true;
                }
                if (DelayedServerPacket.field_n == 10) {
                  var2_int = 1;
                  while (var2_int < this.playerCount) {
                    this.vehicles[var2_int].lapsCompleted = this.lapLimit;
                    var2_int++;
                  }
                  l.field_b = true;
                }
                if (DelayedServerPacket.field_n == 11) {
                  l.field_b = true;
                  this.vehicles[0].lapsCompleted = this.lapLimit;
                }
                if (27 == DelayedServerPacket.field_n) {
                  stackIn_114_1 = !(this.field_c);
                  this.field_c = stackIn_114_1;
                  l.field_b = true;
                }
                if (28 == DelayedServerPacket.field_n) {
                  l.field_b = true;
                  this.vehicles[0].keyBindings = (int[][]) null;
                }
                if (DelayedServerPacket.field_n == 89) {
                  stackIn_125_1 = !(this.field_f);
                  this.field_f = stackIn_125_1;
                  l.field_b = true;
                }
              }
              if (DelayedServerPacket.field_n == 84) {
                this.tutorialFlags = this.tutorialFlags | 1;
              }
              if (DelayedServerPacket.field_n == 83) {
                this.tutorialFlags = this.tutorialFlags | 2;
              }
              if (DelayedServerPacket.field_n % 2 != 0) {
                this.field_N = this.field_N + this.field_l * this.field_H;
                this.field_t = this.field_t + this.field_hb;
                this.field_p = this.field_p - 1;
                this.field_g = this.field_g + 1;
                continue;
              }
              this.field_l = this.field_l + 1;
              this.field_t = this.field_t + 1;
              this.field_y = this.field_y - 1;
              this.field_N = this.field_N - this.field_p * this.field_H;
            }
          }
          if (decompiledFrameCompleted5) {
            this.ticks = this.ticks + 1;
            if (AchievementUnlockRequest.field_n != null) {
              var4_ref = (ZombiePedestrian) (AchievementUnlockRequest.field_n.first((byte) 113));
              while (null != var4_ref) {
                var4_ref.update(-19895);
                var4_ref = (ZombiePedestrian) (AchievementUnlockRequest.field_n.next((byte) -43));
                if (var13 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted4) {
              stackIn_148_0 = ~this.achievementCount;
              stackIn_148_1 = -1;
            }
          }
          if ((decompiledFrameCompleted4) &&
            (stackIn_148_0 < stackIn_148_1)) {
            fieldTemp$0 = this.achievementTicks + 1;
            this.achievementTicks = this.achievementTicks + 1;
            if (170 <= fieldTemp$0) {
              var2_int = 0;
              while (true) {
                if (this.achievementCount - 1 > var2_int) {
                  this.achievementQueue[var2_int] = this.achievementQueue[1 + var2_int];
                  var2_int++;
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.achievementTicks = 0;
                }
                break;
              }
              this.achievementCount = this.achievementCount - 1;
            }
          }
          if (this.bannerCount > 0) {
            fieldTemp$1 = this.bannerTicks + 1;
            this.bannerTicks = this.bannerTicks + 1;
            if (50 <= fieldTemp$1) {
              var2_int = 0;
              while (true) {
                if ((-1 + this.bannerCount) > var2_int) {
                  this.banners[var2_int] = this.banners[1 + var2_int];
                  var2_int++;
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.bannerCount = this.bannerCount - 1;
                  this.bannerSprite = null;
                }
                break;
              }
              this.bannerTicks = 0;
            }
          }
          if (this.paused) {
            return;
          }
          var2_int = 0;
          scanLoop1: while (true) {
            if (this.vehicleCount > var2_int) {
              stackOut_178_0 = this.vehicles[var2_int];
              stackIn_240_0 = stackOut_178_0;
              stackIn_179_0 = stackOut_178_0;
              if (var13 == 0) {
                if (stackIn_179_0 != null) {
                  this.vehicles[var2_int].update(-1245);
                }
                var2_int++;
                continue;
              }
            } else {
              boolean decompiledFrameCompleted3 = true;
              if (this.raceTicks > 0) {
                var2_int = 0;
                while (var2_int < this.vehicleCount) {
                  stackIn_227_0 = null;
                  if (var13 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_227_0 != this.vehicles[var2_int] ||
                    var13 != 0) {
                    this.vehicles[var2_int].updatePhysics(0);
                    this.moveVehicle(this.vehicles[var2_int], 0.019999999552965164f * this.vehicles[var2_int].angularVelocity, 0, 3.5f * this.vehicles[var2_int].velocityX * 0.019999999552965164f, this.vehicles[var2_int].velocityY * 3.5f * 0.019999999552965164f);
                  }
                  var2_int++;
                }
              }
              if (decompiledFrameCompleted3) {
                var2_int = 0;
                while (this.vehicleCount > var2_int) {
                  stackOut_200_0 = this.vehicles[var2_int];
                  stackIn_240_0 = stackOut_200_0;
                  stackIn_201_0 = stackOut_200_0;
                  if (var13 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_201_0 != null ||
                    var13 != 0) {
                    var3 = 1 + var2_int;
                    while (this.vehicleCount > var3) {
                      stackIn_227_0 = null;
                      if (stackIn_227_0 != this.vehicles[var3]) {
                        this.resolveVehicleCollision(0, this.vehicles[var3], this.vehicles[var2_int]);
                      }
                      if (this.vehicles[var2_int] != null) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (this.vehicles[var2_int] != null) {
                      this.vehicles[var2_int].updateCourseProgress((byte) 56);
                    }
                  }
                  var2_int++;
                }
                if (param0 > -35) {
                  this.drawPlayerHud((byte) 52);
                }
                stackIn_227_0 = null;
              }
              if (stackIn_227_0 != AchievementUnlockRequest.field_n) {
                var2_int = 0;
                while (var2_int < this.playerCount) {
                  stackOut_230_0 = (ZombiePedestrian) (AchievementUnlockRequest.field_n.first((byte) 113));
                  stackIn_240_0 = stackOut_230_0;
                  stackIn_231_0 = stackOut_230_0;
                  if (var13 != 0) {
                    break scanLoop1;
                  }
                  var4_refLifetime1 = stackIn_231_0;
                  while (null != var4_refLifetime1) {
                    this.handleZombieCollision(var4_refLifetime1, -103, this.vehicles[var2_int]);
                    var4_refLifetime1 = (ZombiePedestrian) (AchievementUnlockRequest.field_n.next((byte) -73));
                  }
                  var2_int++;
                }
              }
              stackIn_240_0 = this.courseObjects.first((byte) 86);
            }
            break;
          }
          var4Lifetime1 = (TrackObject) (stackIn_240_0);
          while (true) {
            if (null != var4Lifetime1) {
              var4Lifetime1.update(0);
              stackIn_266_0 = 8 & var4Lifetime1.flags;
              if (var13 == 0) {
                stackIn_249_0 = (stackIn_266_0 == 0) ? 0 : 1;
                if ((var4Lifetime1.flags & 4) == 0) {
                  stackIn_253_1 = 0;
                } else {
                  stackIn_253_1 = 1;
                }
                if ((stackIn_249_0 & stackIn_253_1) != 0) {
                  this.resolveObjectBoundaryCollision(-1, var4Lifetime1);
                }
                var4Lifetime1 = (TrackObject) (this.courseObjects.next((byte) -95));
                continue;
              }
            } else {
              var4Lifetime1 = (TrackObject) (this.dynamicObjects.first((byte) 127));
              while (true) {
                if (null != var4Lifetime1) {
                  var4Lifetime1.update(0);
                  var4Lifetime1 = (TrackObject) (this.dynamicObjects.next((byte) 95));
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  this.resultObjects.moveAllTo(-30510, this.courseObjects);
                }
                break;
              }
              stackIn_266_0 = 0;
            }
            break;
          }
          var2_int = stackIn_266_0;
          scanLoop2: while (true) {
            regionExit3: {
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameCompleted1 = true;
              if (var2_int < 5) {
                this.updateParticleQueue(false, this.trailParticles[var2_int]);
                this.updateParticleQueue(false, this.lightParticles[var2_int]);
                this.updateParticleQueue(false, this.sparkParticles[var2_int]);
                var2_int++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                if (this.gameMode != 0) {
                  if (this.gameMode != 2) {
                    if (this.gameMode != 3) {
                      break regionExit3;
                    }
                    if (this.lapLimit != -1) {
                      var5_int = 0;
                      var2_int = 0;
                      while (var2_int < this.playerCount) {
                        stackIn_303_0 = ~this.lapLimit;
                        stackIn_303_1 = ~this.vehicles[var2_int].lapsCompleted;
                        if (var13 != 0) {
                          if (stackIn_303_0 > stackIn_303_1) {
                            stackIn_535_0 = this.field_P;
                            stackIn_535_1 = this.vehicles[var2_int].lapsCompleted;
                            break scanLoop2;
                          }
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        if (stackIn_303_0 <= stackIn_303_1 &&
                          null != this.vehicles[var2_int].keyBindings) {
                          var5_int = 1;
                        }
                        var2_int++;
                      }
                      if ((decompiledFrameCompleted2) && (!this.raceFinished &&
                        var5_int == 0)) {
                        this.raceFinished = true;
                        this.field_ob = this.raceTicks;
                        this.queueBanner(MovingEntity.field_o, (byte) 53);
                        qh.requestMusicTrack(0, 1);
                      }
                    }
                    if (decompiledFrameCompleted2) {
                      var2_int = 0;
                      while (true) {
                        stackIn_303_0Lifetime1 = ~var2_int;
                        stackIn_303_1Lifetime1 = ~this.playerCount;
                        if (stackIn_303_0Lifetime1 <= stackIn_303_1Lifetime1) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        stackIn_535_0 = this.field_P;
                        stackIn_535_1 = this.vehicles[var2_int].lapsCompleted;
                        if (var13 != 0) {
                          break scanLoop2;
                        }
                        if (stackIn_535_0 < stackIn_535_1) {
                          this.field_P = this.vehicles[var2_int].lapsCompleted;
                          if (~this.lapLimit == ~this.field_P) {
                            this.queueBanner(hc.field_d, (byte) 53);
                          }
                        }
                        var2_int++;
                      }
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    var5_intLifetime2 = 0;
                    var2_int = 0;
                    scanLoop4: while (true) {
                      boolean decompiledFrameRemainder2 = true;
                      if (var2_int < this.playerCount) {
                        stackIn_345_0 = this.vehicles[var2_int].kills;
                        stackIn_345_1 = 5;
                        if (var13 != 0) {
                          if (stackIn_345_0 > stackIn_345_1) {
                            stackIn_356_0 = ~this.field_P;
                            stackIn_356_1 = ~this.vehicles[var2_int].kills;
                            break scanLoop4;
                          }
                          decompiledFrameRemainder2 = false;
                        }
                        else {
                          if (stackIn_345_0 >= stackIn_345_1) {
                            var5_intLifetime2 = 1;
                            if (var2_int == 0 &&
                              !this.twoPlayerMode &&
                              LoginCredentialType.isFeatureEnabled(16616, 0)) {
                              this.unlockAchievement(15, 240, (byte) 118);
                            }
                          }
                          var2_int++;
                          continue;
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        if (!this.raceFinished &&
                          var5_intLifetime2 != 0) {
                          this.field_ob = this.raceTicks;
                          this.raceFinished = true;
                          this.queueBanner(MovingEntity.field_o, (byte) 53);
                          if (2 <= this.vehicles[0].racePosition) {
                            qh.requestMusicTrack(0, 2);
                            if (var13 != 0) {
                              qh.requestMusicTrack(0, 1);
                            }
                          } else {
                            qh.requestMusicTrack(0, 1);
                          }
                        }
                        var2_int = 0;
                        while (true) {
                          stackIn_345_0Lifetime1 = this.playerCount;
                          stackIn_345_1Lifetime1 = var2_int;
                          if (stackIn_345_0Lifetime1 <= stackIn_345_1Lifetime1) {
                            break;
                          }
                          stackIn_356_0 = ~this.field_P;
                          stackIn_356_1 = ~this.vehicles[var2_int].kills;
                          if (var13 != 0) {
                            break scanLoop4;
                          }
                          if (stackIn_356_0 > stackIn_356_1) {
                            this.field_P = this.vehicles[var2_int].kills;
                          }
                          var2_int++;
                        }
                      }
                      stackIn_356_0 = this.field_e;
                      stackIn_356_1 = this.field_P;
                      break;
                    }
                    if (stackIn_356_0 < stackIn_356_1) {
                      boolean decompiledSharedTail0 = !(LoginCredentialType.isFeatureEnabled(16616, 0));
                      if (!decompiledSharedTail0) {
                        var6 = 25;
                        while (true) {
                          if (var6 <= 100) {
                            var7_int = 5 - var6;
                            stackIn_535_0 = this.field_e;
                            stackIn_535_1 = var7_int;
                            if (var13 != 0) {
                              break scanLoop2;
                            }
                            if (stackIn_535_0 < stackIn_535_1 &&
                              this.field_P >= var7_int) {
                              this.queueBanner(LoginCredentials.substituteIndexedTokens(SocketJs5Transport.field_p, new String[]{Integer.toString(var6)}, true), (byte) 53);
                            } else {
                              var6 += 25;
                              continue;
                            }
                          }
                          break;
                        }
                        decompiledSharedTail0 = (var13 != 0);
                      }
                      if (decompiledSharedTail0) {
                        if (this.field_P == 3) {
                          this.queueBanner(ChatMessage.field_n, (byte) 53);
                        }
                        if (4 == this.field_P) {
                          this.queueBanner(UsernameLoginCredentials.field_g, (byte) 53);
                        }
                      }
                      this.field_e = this.field_P;
                    }
                    if (var13 == 0) {
                      break regionExit3;
                    }
                  }
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var5_intLifetime1 = 0;
                var2_int = 0;
                scanLoop5: while (true) {
                  if (var2_int < this.playerCount) {
                    stackIn_505_0 = ~this.vehicles[var2_int].lapsCompleted;
                    stackIn_505_1 = ~this.lapLimit;
                    if (var13 == 0) {
                      if (stackIn_505_0 >= stackIn_505_1 &&
                        this.vehicles[var2_int].keyBindings != null) {
                        var5_intLifetime1 = 1;
                      }
                      var2_int++;
                      continue;
                    }
                  } else {
                    if (!this.raceFinished &&
                      var5_intLifetime1 == 0) {
                      this.raceFinished = true;
                      this.field_ob = this.raceTicks;
                      this.queueBanner(MovingEntity.field_o, (byte) 53);
                      if (!this.twoPlayerMode) {
                        stackIn_413_1 = (this.vehicles[0].racePosition == 0);
                        this.field_b = stackIn_413_1;
                        if (this.field_b) {
                          if (this.field_rb[11] == 1) {
                            this.unlockAchievement(11, 244, (byte) -60);
                          }
                          if (this.field_rb[8] == 1) {
                            this.unlockAchievement(8, 247, (byte) -38);
                          }
                          if (1 == this.field_rb[9]) {
                            this.unlockAchievement(9, 246, (byte) 99);
                          }
                          if (this.field_rb[10] == 1) {
                            this.unlockAchievement(10, 245, (byte) 99);
                          }
                          if (this.field_rb[12] == 1) {
                            this.unlockAchievement(12, 243, (byte) 100);
                          }
                        }
                        if (this.vehicles[0].racePosition < 2) {
                          qh.requestMusicTrack(0, 1);
                          if (var13 != 0) {
                            qh.requestMusicTrack(0, 2);
                          }
                        } else {
                          qh.requestMusicTrack(0, 2);
                        }
                        if ((7 == DelegatingCanvas.field_d) &&
                          (!(2 <= this.vehicles[0].racePosition)) &&
                          (~(MenuList.field_l[StrongCacheEntry.field_w] - 1) == ~LoginForm.field_P)) {
                          var6 = CurvedRoadSegment.field_y + this.field_ob;
                          if (StrongCacheEntry.field_w == 0 &&
                            22500 > var6) {
                            this.unlockAchievement(2, 253, (byte) -119);
                          }
                          if (StrongCacheEntry.field_w == 1 &&
                            30500 > var6) {
                            this.unlockAchievement(4, 251, (byte) 119);
                          }
                          if (StrongCacheEntry.field_w == 2 &&
                            var6 < 29000) {
                            this.unlockAchievement(3, 252, (byte) -34);
                          }
                          if (StrongCacheEntry.field_w == 3 &&
                            var6 < 34000) {
                            this.unlockAchievement(5, 250, (byte) -105);
                          }
                          PointPath.a(StrongCacheEntry.field_w, 5, var6);
                          var7_intLifetime1 = 1;
                          var8 = 0;
                          var2_int = 0;
                          while (true) {
                            if (4 > var2_int) {
                              stackIn_505_0 = d.field_c[var2_int];
                              stackIn_505_1 = -1;
                              if (var13 != 0) {
                                break scanLoop5;
                              }
                              if (stackIn_505_0 == stackIn_505_1) {
                                var7_intLifetime1 = 0;
                              } else {
                                var8 = var8 + d.field_c[var2_int];
                                var2_int++;
                                continue;
                              }
                            }
                            break;
                          }
                          if (var7_intLifetime1 != 0) {
                            this.unlockAchievement(0, 255, (byte) -94);
                            if (var8 < 109500) {
                              this.unlockAchievement(1, 254, (byte) -83);
                            }
                          }
                          if (var13 != 0) {
                            if (this.vehicles[0].racePosition == 0 ||
                              this.vehicles[1].racePosition == 0) {
                              qh.requestMusicTrack(0, 1);
                              qh.requestMusicTrack(0, 2);
                            } else {
                              qh.requestMusicTrack(0, 2);
                            }
                          }
                        }
                      } else {
                        if (this.vehicles[0].racePosition == 0 ||
                          this.vehicles[1].racePosition == 0) {
                          qh.requestMusicTrack(0, 1);
                          if (var13 != 0) {
                            qh.requestMusicTrack(0, 2);
                          }
                        } else {
                          qh.requestMusicTrack(0, 2);
                        }
                      }
                    }
                    var2_int = 0;
                    while (true) {
                      stackIn_505_0 = ~var2_int;
                      stackIn_505_1 = ~this.playerCount;
                      if (stackIn_505_0 <= stackIn_505_1) {
                        break regionExit3;
                      }
                      stackIn_535_0 = this.field_P;
                      stackIn_535_1 = this.vehicles[var2_int].lapsCompleted;
                      if (var13 != 0) {
                        break scanLoop2;
                      }
                      if (stackIn_535_0 < stackIn_535_1) {
                        this.field_P = this.vehicles[var2_int].lapsCompleted;
                        if (~this.field_P == ~this.lapLimit) {
                          this.queueBanner(hc.field_d, (byte) 53);
                        }
                      }
                      var2_int++;
                    }
                  }
                  break;
                }
                while (stackIn_505_0 > stackIn_505_1) {
                  stackIn_535_0 = this.field_P;
                  stackIn_535_1 = this.vehicles[var2_int].lapsCompleted;
                  if (var13 != 0) {
                    break scanLoop2;
                  }
                  if (stackIn_535_0 < stackIn_535_1) {
                    this.field_P = this.vehicles[var2_int].lapsCompleted;
                    if (~this.field_P == ~this.lapLimit) {
                      this.queueBanner(hc.field_d, (byte) 53);
                    }
                  }
                  var2_int++;
                  stackIn_505_0 = ~var2_int;
                  stackIn_505_1 = ~this.playerCount;
                }
              }
            }
            if (this.raceFinished &&
              -this.field_ob + this.raceTicks >= 150 &&
              !this.field_T &&
              this.gameMode != 3 &&
              this.achievementCount == 0) {
              PlayerStatsRequest.a(7, false, false);
            }
            stackIn_535_0 = this.courseTheme;
            stackIn_535_1 = 3;
            break;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_535_0 == stackIn_535_1 &&
            this.gameMode != 2) {
            var2_int = 0;
            do {
              if (this.field_w.length <= var2_int) {
                var2_int = 0;
                break;
              }
              this.field_eb[var2_int] = 0;
              var2_int++;
            } while (var13 == 0);
            while (var2_int < this.playerCount) {
              var5_ref = this.vehicles[var2_int];
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != var5_ref.keyBindings ||
                var13 != 0) {
                var6 = var5_ref.field_Eb;
                var7 = 0.0f;
                var3 = 0;
                while (var3 < (int)var5_ref.furthestCourseProgress) {
                  var7 = var7 + this.roadSegments[var3].length(50);
                  var3++;
                }
                if ((int)var5_ref.furthestCourseProgress != this.roadSegments.length) {
                  var7 = var7 + this.roadSegments[(int)var5_ref.furthestCourseProgress].length(50) * (var5_ref.furthestCourseProgress - (float)(int)var5_ref.furthestCourseProgress);
                }
                var8 = (int)(var7 / this.field_A);
                var3 = 1;
                while (4 > var3) {
                  var9 = (var3 + var8) % this.field_w.length;
                  var10 = (float)(-this.field_x[var9] + var5_ref.position.x);
                  var11 = (float)(var5_ref.position.y - this.field_u[var9]);
                  var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
                  var10 = var10 / var12;
                  var11 = var11 / var12;
                  this.field_eb[var9] = this.orInts(this.field_eb[var9], 6293, var6);
                  var3++;
                }
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            decompiledFrameRemainder0 = (!(LoginCredentialType.isFeatureEnabled(16616, 0)) ||
              2 != this.gameMode);
          }
          if (decompiledFrameRemainder0) {
            if (this.raceTicks == -100) {
              this.queueBanner(TextHotspotWidget.field_L, (byte) 53);
            }
            if (-50 == this.raceTicks) {
              this.queueBanner(AccountFormText.field_a, (byte) 53);
            }
            decompiledFrameRemainder1 = (this.raceTicks == 0);
            if (decompiledFrameRemainder1) {
              this.queueBanner(il.field_b, (byte) 53);
              decompiledFrameRemainder1 = (var13 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.raceTicks == -100) {
              this.queueBanner(BoundaryCurve.field_n, (byte) 53);
            }
            if (this.raceTicks == 0) {
              this.queueBanner(il.field_b, (byte) 53);
            }
          }
          fieldTemp$2 = this.raceTicks + 1;
          this.raceTicks = this.raceTicks + 1;
          if (fieldTemp$2 > 0 &&
            !this.raceFinished) {
            this.field_t = this.field_t + this.field_hb;
            this.field_N = this.field_N - this.field_p * this.field_l;
            this.field_H = this.field_H + 1;
            this.field_y = this.field_y - (CurvedRoadSegment.field_y + (this.raceTicks + this.field_g));
            this.field_hb = this.field_hb - 1;
          }
          if (this.raceTicks <= -50 &&
            this.courseTheme == 3) {
            var5_ref2 = (PointLight) (this.pointLights.first((byte) 104));
            while (null != var5_ref2) {
              if (var13 != 0) {
                return;
              }
              if (!var5_ref2.enabled) {
                if (!(SolidRoadStripRenderer.b(2, 400) >= this.raceTicks + 150)) {
                  var5_ref2.enabled = true;
                }
              } else {
                if (SolidRoadStripRenderer.b(2, 400) < (-50 - this.raceTicks)) {
                  var5_ref2.enabled = false;
                }
              }
              var5_ref2 = (PointLight) (this.pointLights.next((byte) 96));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "sg.B(" + param0 + ')');
        }
    }

    private final void detonateLargeProjectile(TrackObject param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          param0.unlink(0);
          RoadStripRenderer.playPositionalSound(ResizableDialog.field_O.field_q, param0.position, -124, ResizableDialog.field_O);
          ArchiveIndex.a(0, param0.position.y, 0, 128, param1 - 28976, -1, param0.position.x, 3, this.lightParticles, 16777215, 0, 32, 400);
          ArchiveIndex.a(0, param0.position.y, 0, 128, param1 ^ 28976, -4, param0.position.x, 3, this.lightParticles, 16777215, 0, 128, 60);
          ArchiveIndex.a(0, param0.position.y, 0, 128, param1 - 28976, -8, param0.position.x, 3, this.lightParticles, 16777215, 0, 255, 20);
          var3_int = this.applyBlast(param1 ^ -2407, 4, 250, param0, 32, 200000.0f);
          if (param1 != 28977) {
            this.drawObjectShadow((TrackObject) null, 63);
          }
          var4 = param0.flags & 3;
          if (0 == var4 &&
            !this.twoPlayerMode &&
            var3_int >= 3) {
            this.unlockAchievement(13, 242, (byte) 112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("sg.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isOnRoad(int param0, boolean param1, Point2i param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = this.isOnRoad(param0, param2.x, -3, param2.y);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("sg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void drawTutorialCallout(String param0, float param1, int param2, TutorialCalloutAnchor param3, String param4) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          var6_int = param3.field_f;
          var7 = param3.field_c;
          var8 = param3.field_d;
          if (var8 == -1) {
            var8 = 480;
          }
          var9 = param3.field_g;
          if (var9 == -1) {
            var9 = 13 + (nm.field_c.getLineCount(param0, var8) * 20 + 18 * HoldTheLine.field_F.getLineCount(param4, var8));
          }
          if (-1 == var6_int) {
            var6_int = -var8 + 640 >> 1;
          }
          if (-1 == var7) {
            var7 = 100;
          }
          var10 = param3.field_b;
          switch ((var12 == 0
            || var10 == 1
            || var10 == 3
            ) ? var10 : -1) {
            case 0:
              var6_int = (int)((float)var6_int - param1 * (float)(var6_int + (var8 + 40)));
              if (var12 == 0) {
                break;
              }
            case 1:
              var6_int = (int)((float)var6_int + param1 * (float)(-var6_int + 680));
              if (var12 == 0) {
                break;
              }
            case 2:
              var7 = (int)((float)var7 - param1 * (float)(var9 + var7 + 40));
              if (var12 == 0) {
                break;
              }
            case 3:
              var7 = (int)((float)var7 + param1 * (float)(-var7 + 520));
            default:
              break;
          }
          NanoTickClock.drawPanelWithShadow(var8, var9, var7, (byte) -42, var6_int);
          var10 = var7;
          var11 = nm.field_c.getLineCount(param0, var8);
          nm.field_c.drawParagraph(param0, var6_int, var10, var8, 20 * var11, 0, -1, 1, 0, 20);
          var10 = var10 + (5 + 20 * var11);
          HoldTheLine.field_F.drawParagraph(param4, var6_int, var10, var8, var9, 0, -1, 1, 0, 18);
          if (param2 != -11240) {
            this.tutorialFlags = 33;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_40_0 = var6;
          stackIn_40_1 = new StringBuilder().append("sg.UA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private final void drawParticles(boolean param0, int param1) {
        Point2i discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        Particle var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        try {
          param1++;
          if (param0) {
            discarded$0 = this.findVehicleOutsideBounds((RaceVehicle) null, 102);
          }
          var3 = (Particle) (this.trailParticles[param1].first((byte) 118));
          do {
            if (var3 == null) {
              var3 = (Particle) (this.lightParticles[param1].first((byte) 99));
              break;
            }
            SoftwareRasterizer.fillCircleAlpha(var3.fixedX >> 10, var3.fixedY >> 10, var3.fixedRadius >> 10, var3.color, var3.alpha >> 2);
            var3 = (Particle) (this.trailParticles[param1].next((byte) -23));
          } while (var4 == 0);
          do {
            if (null == var3) {
              var3 = (Particle) (this.sparkParticles[param1].first((byte) 87));
              break;
            }
            SoftwareRasterizer.fillCircleAlpha(var3.fixedX >> 10, var3.fixedY >> 10, var3.fixedRadius >> 10, var3.color, var3.alpha >> 2);
            var3 = (Particle) (this.lightParticles[param1].next((byte) 88));
          } while (var4 == 0);
          do {
            if (null == var3) {
              if (this.courseTheme != 3) {
                return;
              }
              vb.a(-76, this.lightMap);
              break;
            }
            SoftwareRasterizer.drawLineAlpha(-var3.fixedRadius + var3.fixedX >> 10, var3.fixedY >> 10, var3.fixedRadius + var3.fixedX >> 10, var3.fixedY >> 10, var3.color, var3.alpha >> 2);
            SoftwareRasterizer.drawLineAlpha(var3.fixedX >> 10, var3.fixedY - var3.fixedRadius >> 10, var3.fixedX >> 10, var3.fixedY + var3.fixedRadius >> 10, var3.color, var3.alpha >> 2);
            var3 = (Particle) (this.sparkParticles[param1].next((byte) -44));
          } while (var4 == 0);
          var3 = (Particle) (this.trailParticles[param1].first((byte) 94));
          do {
            if (null == var3) {
              var3 = (Particle) (this.lightParticles[param1].first((byte) 120));
              break;
            }
            SoftwareRasterizer.fillCircleAlpha(var3.fixedX >> 10, var3.fixedY >> 10, var3.fixedRadius >> 10, 16777215, var3.alpha >> 2);
            var3 = (Particle) (this.trailParticles[param1].next((byte) -68));
          } while (var4 == 0);
          do {
            if (var3 == null) {
              var3 = (Particle) (this.sparkParticles[param1].first((byte) 85));
              break;
            }
            SoftwareRasterizer.fillCircleAlpha(var3.fixedX >> 10, var3.fixedY >> 10, var3.fixedRadius >> 10, 16777215, var3.alpha >> 2);
            var3 = (Particle) (this.lightParticles[param1].next((byte) -84));
          } while (var4 == 0);
          while (var3 != null) {
            SoftwareRasterizer.drawLineAlpha(var3.fixedX - var3.fixedRadius >> 10, var3.fixedY >> 10, var3.fixedX + var3.fixedRadius >> 10, var3.fixedY >> 10, 16777215, var3.alpha >> 2);
            SoftwareRasterizer.drawLineAlpha(var3.fixedX >> 10, -var3.fixedRadius + var3.fixedY >> 10, var3.fixedX >> 10, var3.fixedRadius + var3.fixedY >> 10, 16777215, var3.alpha >> 2);
            var3 = (Particle) (this.sparkParticles[param1].next((byte) -32));
            if (var4 != 0) {
              return;
            }
          }
          MarkerSliderRenderer.restoreRasterTarget(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3_ref), "sg.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawCourseBackground(int param0) {
        try {
          this.courseImage.drawUnkeyed(0, param0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sg.TA(" + param0 + ')');
        }
    }

    final void render() {
        int var4_int = 0;
        int var1;
        int var2;
        TrackObject var3;
        PointLight var4;
        ZombiePedestrian var4_ref;
        int var1Lifetime1;
        int var2Lifetime1;
        int var1Lifetime1Lifetime1;
        int var1Lifetime1Lifetime2;
        int var1Lifetime1Lifetime3;
        TrackObject var3Lifetime1;
        TrackObject var3Lifetime2;
        TrackObject var3Lifetime3;
        if (this.courseTheme == 3) {
          if (!LoginCredentialType.isFeatureEnabled(16616, 0)) {
            var1 = 307200;
            while (var1 > 0) {
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
              var1--;
              this.lightMap.pixels[var1] = 0;
            }
          } else {
            var2 = this.lightningBrightness * 65793;
            var1 = 307200;
            while (var1 > 0) {
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
              var1--;
              this.lightMap.pixels[var1] = var2;
            }
          }
        }
        this.drawCourseBackground((byte) 106);
        for (var2Lifetime1 = -1; var2Lifetime1 <= 3; var2Lifetime1++) {
          var3 = (TrackObject) (this.dynamicObjects.first((byte) 102));
          while (var3 != null) {
            if (var3.layer == var2Lifetime1) {
              this.drawObjectSideShadow(var3, -127);
            }
            var3 = (TrackObject) (this.dynamicObjects.next((byte) -126));
          }
          var3Lifetime1 = (TrackObject) (this.dynamicObjects.first((byte) 105));
          while (var3Lifetime1 != null) {
            if (var3Lifetime1.layer == var2Lifetime1) {
              this.drawObject(var3Lifetime1, 115);
            }
            var3Lifetime1 = (TrackObject) (this.dynamicObjects.next((byte) -59));
          }
          if (this.courseTheme == 3 &&
            this.gameMode != 2) {
            for (var1Lifetime1 = 0; var1Lifetime1 < this.field_w.length; var1Lifetime1++) {
              if (this.roadSegments[this.field_w[var1Lifetime1]].layer == var2Lifetime1 &&
                this.field_eb[var1Lifetime1] != 0) {
                SoftwareRasterizer.fillRectangle(this.field_x[var1Lifetime1] - 1, this.field_u[var1Lifetime1] - 1, 3, 3, this.field_eb[var1Lifetime1]);
                TutorialTransition.a(32381);
                this.lightMap.bindRaster();
                SoftwareRasterizer.fillRectangle(this.field_x[var1Lifetime1] - 1, this.field_u[var1Lifetime1] - 1, 3, 3, 16777215);
                MarkerSliderRenderer.restoreRasterTarget(-1);
              }
            }
          }
          var4 = (PointLight) (this.pointLights.first((byte) 94));
          while (var4 != null) {
            if (var4.enabled &&
              var4.layer == var2Lifetime1) {
              this.drawPointLight(-28, var4);
            }
            var4 = (PointLight) (this.pointLights.next((byte) -125));
          }
          var3Lifetime2 = (TrackObject) (this.courseObjects.first((byte) 114));
          while (var3Lifetime2 != null) {
            if (var3Lifetime2.layer == var2Lifetime1) {
              this.drawObjectShadow(var3Lifetime2, 8192);
            }
            var3Lifetime2 = (TrackObject) (this.courseObjects.next((byte) 127));
          }
          for (var1Lifetime1Lifetime1 = 0; var1Lifetime1Lifetime1 < this.playerCount; var1Lifetime1Lifetime1++) {
            if (this.vehicles[var1Lifetime1Lifetime1] != null &&
              this.vehicles[var1Lifetime1Lifetime1].layer == var2Lifetime1) {
              for (var4_int = 0; var4_int < 8; var4_int++) {
                this.drawVehiclePowerupGlow(var4_int, -403, this.vehicles[var1Lifetime1Lifetime1]);
              }
            }
          }
          if (AchievementUnlockRequest.field_n != null &&
            var2Lifetime1 == 0) {
            var4_ref = (ZombiePedestrian) (AchievementUnlockRequest.field_n.first((byte) 105));
            while (var4_ref != null) {
              var4_ref.draw((byte) -99);
              var4_ref = (ZombiePedestrian) (AchievementUnlockRequest.field_n.next((byte) -59));
            }
          }
          var3Lifetime3 = (TrackObject) (this.courseObjects.first((byte) 126));
          while (var3Lifetime3 != null) {
            if (var3Lifetime3.layer == var2Lifetime1) {
              this.drawObject(var3Lifetime3, 122);
            }
            var3Lifetime3 = (TrackObject) (this.courseObjects.next((byte) -108));
          }
          for (var1Lifetime1Lifetime2 = 0; var1Lifetime1Lifetime2 < this.vehicleCount; var1Lifetime1Lifetime2++) {
            if (this.vehicles[var1Lifetime1Lifetime2] != null &&
              this.vehicles[var1Lifetime1Lifetime2].layer == var2Lifetime1) {
              this.drawVehicle(this.vehicles[var1Lifetime1Lifetime2], (byte) 101);
            }
          }
          if (this.courseTheme == 3) {
            for (var1Lifetime1Lifetime3 = 0; var1Lifetime1Lifetime3 < this.playerCount; var1Lifetime1Lifetime3++) {
              if (this.vehicles[var1Lifetime1Lifetime3] != null &&
                this.vehicles[var1Lifetime1Lifetime3].layer == var2Lifetime1) {
                this.drawVehicleHeadlights(64, this.vehicles[var1Lifetime1Lifetime3]);
              }
            }
          }
          this.drawParticles(false, var2Lifetime1);
        }
        if (LoginCredentialType.isFeatureEnabled(16616, 0)) {
          this.drawRain((long)this.ticks, true);
        }
        if (this.courseTheme == 3 &&
          !this.field_c) {
          this.applyLightMap((byte) -96);
        }
        if (this.gameMode < 5) {
          this.drawHud(-16);
        }
        if (this.tutorialPage != -1) {
          this.drawTutorialOverlay(-3);
        }
    }

    final boolean isOnRoad(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            0 <= param3 &&
            param1 < 640 &&
            param3 < 480) {
            var5_int = this.roadLayerMask.pixels[param3 * 640 + param1] & 85;
            if (param0 >= 1) {
              var5_int = var5_int & 60;
            }
            if (param0 <= -1) {
              var5_int = var5_int & 15;
            }
            return (var5_int != 0);
          }
          if (param2 != -3) {
            this.enterTutorialPage((String) null, (byte) -127);
          }
          stackIn_25_0 = b.containsPointInBoundaryLoops(false, param1, param3, this.roadBoundaryLoops);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var5), "sg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void openPauseMenu(boolean param0) {
        if (!LoginCredentialType.b(92)) {
          return;
        }
        try {
          pe.a(4, param0, (byte) 35);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sg.NB(" + param0 + ')');
        }
    }

    private final void placePickupRows(int param0, int param1, int param2) {
        float dupTemp$0 = 0.0f;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        Point2i var12 = null;
        Vector2f var13 = null;
        Point2i var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = HoldTheLine.field_D;
        try {
          var4_float = this.vehicles[0].courseProgress;
          var5 = OutlinedRoadStripRenderer.totalCurveLength(-1, this.roadSegments) / (float)(param1 + 1);
          var6 = (int)var4_float;
          var7 = this.roadSegments[var6].length(50);
          var8 = (-var4_float + (float)(var6 + 1)) * var7;
          var9 = var5;
          if (param0 != 24936) {
            this.drawVehiclePowerupGlow(33, 114, (RaceVehicle) null);
          }
          var10 = 0;
          scanLoop1: while (true) {
            stackIn_6_0 = ~var10;
            stackIn_6_1 = ~param1;
            if (stackIn_6_0 > stackIn_6_1) {
              while (true) {
                if (var17 != 0) {
                  return;
                }
                if (var9 > var8) {
                  var6++;
                  stackIn_6_0 = ~var6;
                  stackIn_6_1 = ~this.roadSegments.length;
                  if (stackIn_6_0 == stackIn_6_1) {
                    var6 = 0;
                  }
                  var9 = var9 - var8;
                  dupTemp$0 = this.roadSegments[var6].length(50);
                  var7 = dupTemp$0;
                  var8 = dupTemp$0;
                  continue;
                }
                break;
              }
              var8 = var8 - var9;
              var9 = var5;
              var11 = -(var8 / var7) + 1.0f;
              var12 = this.roadSegments[var6].pointAt(false, var11);
              var13 = this.roadSegments[var6].directionAt((byte) 125, var11);
              var14 = new Point2i(var12);
              var15 = -1;
              while (var15 <= 1) {
                var14.y = var12.y - (int)((float)(30 * var15) * var13.x);
                var14.x = (int)(var13.y * (float)(var15 * 30)) + var12.x;
                stackIn_6_0 = 0;
                stackIn_6_1 = ~param2;
                if (stackIn_6_0 != stackIn_6_1) {
                  if (param2 == 3) {
                    stackIn_25_0 = 0;
                  } else {
                    stackIn_25_0 = param2 + 1;
                  }
                } else {
                  stackIn_25_0 = 3 & var10 + (var15 + 1);
                }
                var16 = stackIn_25_0;
                this.courseObjects.addLast((byte) -64, new TrackObject(var14, var16 + 1, -1));
                var15++;
              }
              var10++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawVehicle(RaceVehicle param0, byte param1) {
        Point2i discarded$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_1 = 0;
        float stackIn_48_0 = 0.0f;
        boolean stackIn_51_0 = false;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_50_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        Sprite var4 = null;
        Point2i var4_ref = null;
        int var5 = 0;
        float var5_float = 0.0f;
        int var6_int = 0;
        PointLight var6 = null;
        int var7_int = 0;
        float var7 = 0.0f;
        Sprite var8_ref_hj = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        var11 = HoldTheLine.field_D;
        try {
          if (this.raceTicks < 0 &&
            null != param0.keyBindings) {
            stackIn_8_0 = 1;
          } else {
            stackIn_8_0 = 0;
          }
          var3_int = stackIn_8_0;
          stackIn_17_0 = var3_int;
          if (this.gameMode == 2 &&
            this.raceTicks > 0 &&
            param0.respawnTicks > 0) {
            stackIn_18_1 = 1;
          } else {
            stackIn_18_1 = 0;
          }
          var3_intLifetime1 = stackIn_17_0 | stackIn_18_1;
          stackIn_30_0 = var3_intLifetime1;
          if (this.raceTicks > 0 &&
            null != param0.keyBindings &&
            param0.activeTicks > 50 &&
            param0.courseRecoveryTicks == 0) {
            stackIn_31_1 = 1;
          } else {
            stackIn_31_1 = 0;
          }
          var3_intLifetime2 = stackIn_30_0 | stackIn_31_1;
          stackIn_34_0 = var3_intLifetime2;
          if (this.ticks / 10 % 2 != 0) {
            stackIn_35_1 = 0;
          } else {
            stackIn_35_1 = 1;
          }
          boolean decompiledFrameCompleted0 = true;
          var3_intLifetime3 = stackIn_34_0 & stackIn_35_1;
          var3_intLifetime3 = var3_intLifetime3 & 1;
          if (param0.lifeState != 2) {
            var4 = param0.definition.sprite.getByAngle(param0.heading, 27788);
            if (2 == this.gameMode) {
              var5 = (param0.respawnTicks << 12) / 150 + 4096;
              if (var5 != 4096) {
                TutorialTransition.a(32381);
                var6_int = var4.width * var5 >> 12;
                var7_int = var4.height * var5 >> 12;
                var8_ref_hj = new Sprite(var6_int, var7_int);
                var8_ref_hj.bindRaster();
                var4.drawScaled(0, 0, var6_int, var7_int);
                var4 = var8_ref_hj;
                MarkerSliderRenderer.restoreRasterTarget(-1);
              }
            }
            if (var3_intLifetime3 == 0) {
              stackIn_48_0 = (!this.shadowsEnabled) ? 0.5f : 1.0f;
              var5_float = stackIn_48_0;
              var6 = (PointLight) (this.pointLights.first((byte) 87));
              while (null != var6) {
                stackOut_50_0 = var6.enabled;
                stackIn_68_0 = stackOut_50_0 ? 1 : 0;
                stackIn_51_0 = stackOut_50_0;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_51_0) {
                  var7 = (float)(param0.position.x - var6.x);
                  var8 = (float)(param0.position.y - var6.y);
                  var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
                  var7 = var7 / var9;
                  var8 = var8 / var9;
                  var10 = -(var9 / (float)(2 * var6.radius)) + 1.0f;
                  if (0.0f < var10) {
                    var5_float = var5_float + var10;
                  }
                }
                var6 = (PointLight) (this.pointLights.next((byte) 94));
              }
              if (decompiledFrameCompleted0) {
                ViewportSizingController.drawCenteredTintedSprite(var4, param0.position.x, 0, param0.field_Eb, var5_float, param0.position.y);
              }
            }
            if (decompiledFrameCompleted0) {
              if (var3_intLifetime3 != 0 ||
                var11 != 0) {
                MusicPatch.drawCenteredSpriteMask(param0.field_Eb, param0.position.y, var4, param0.position.x, (byte) 98);
              }
              if (var11 != 0) {
                var4 = param0.definition.shadowSprite.getByAngle(param0.heading, 27788);
                var5 = (30000 - param0.respawnTicks) * 256 / 180;
                if (256 <= var5) {
                  var4.draw(-(var4.width >> 1) + param0.position.x, -(var4.height >> 1) + param0.position.y);
                  var4.drawAlpha(-(var4.width >> 1) + param0.position.x, param0.position.y - (var4.height >> 1), var5);
                } else {
                  var4.drawAlpha(-(var4.width >> 1) + param0.position.x, param0.position.y - (var4.height >> 1), var5);
                }
              }
            }
          } else {
            var4 = param0.definition.shadowSprite.getByAngle(param0.heading, 27788);
            var5 = (30000 - param0.respawnTicks) * 256 / 180;
            boolean decompiledSharedTail0 = !(256 <= var5);
            if (!decompiledSharedTail0) {
              var4.draw(-(var4.width >> 1) + param0.position.x, -(var4.height >> 1) + param0.position.y);
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              var4.drawAlpha(-(var4.width >> 1) + param0.position.x, param0.position.y - (var4.height >> 1), var5);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_68_0 = param1;
          }
          if (stackIn_68_0 < 96) {
            discarded$0 = this.findSpriteOutsideBounds(-17, 85, (Sprite) null, -39, 48);
          }
          if (this.field_kb &&
            param0.furthestCourseProgress != -1.0f) {
            var4_ref = ShadedRoadStripRenderer.pointAlongCurves(this.roadSegments, param0.furthestCourseProgress, (byte) -112);
            SoftwareRasterizer.fillCircle(var4_ref.x, var4_ref.y, 5, param0.field_Eb);
          }
          if (param0.specialPowerup != 2) {
            if (param0.powerupLevels[2] < 2) {
              if (param0.powerupLevels[2] == 1) {
                SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, param0.definition.field_d, 255, 32);
                if (var11 != 0) {
                  SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, param0.definition.field_d, 8355839, 128);
                  SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, (int)((float)param0.definition.field_d * 1.2999999523162842f), 8355839, 128);
                }
              }
            } else {
              SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, param0.definition.field_d, 8355839, 128);
              if (var11 != 0) {
                SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, (int)((float)param0.definition.field_d * 1.2999999523162842f), 8355839, 128);
              }
            }
          } else {
            SoftwareRasterizer.fillCircleAlpha(param0.position.x, param0.position.y, (int)((float)param0.definition.field_d * 1.2999999523162842f), 8355839, 128);
          }
          if (this.courseTheme == 3) {
            this.drawVehicleLight(32249, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("sg.S(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void resolveObjectBoundaryCollision(int param0, TrackObject param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Vector2f var3 = null;
        RuntimeException var3_ref = null;
        Point2i var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        try {
          if (param0 != -1) {
            field_Z = (String) null;
          }
          if (!this.isInsideCollisionBounds(param1.layer, param1.position.y, true, param1.position.x)) {
            var3 = new Vector2f(0.0f, 0.0f);
            var4 = StraightRoadSegment.closestBoundaryPoint(0, var3, this.collisionBoundaryLoops, param1.layer, param1.position);
            if ((8192 & param1.flags) != 0) {
              this.detonateLargeProjectile(param1, param0 ^ -28978);
              if ((3 & param1.flags) != 0) {
                return;
              }
              this.tutorialFlags = this.tutorialFlags | 16;
              if (HoldTheLine.field_D == 0) {
                return;
              }
            }
            param1.worldX = (float)var4.x;
            param1.worldY = (float)var4.y;
            var5 = param1.velocityY * var3.y + param1.velocityX * var3.x;
            var6 = -1.7999999523162842f * var5;
            param1.velocityX = param1.velocityX + var3.x * var6;
            param1.velocityY = param1.velocityY + var6 * var3.y;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("sg.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void decodeCourse(CourseDefinition param0, int[] param1, int param2) throws IOException {
        Point2i discarded$0 = null;
        int incrementValue$3 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_23_1 = 0;
        StraightRoadSegment stackIn_34_0;
        StraightRoadSegment stackIn_34_1;
        Point2i stackIn_34_2;
        Point2i stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_34_6;
        int stackIn_34_7;
        int stackIn_34_8;
        int stackIn_34_9;
        int stackIn_34_10;
        int stackIn_34_11;
        int stackIn_34_12;
        int stackIn_34_13;
        int stackIn_34_14;
        StraightRoadSegment stackIn_35_0 = null;
        StraightRoadSegment stackIn_35_1 = null;
        boolean stackIn_35_15 = false;
        boolean stackIn_38_16 = false;
        boolean stackIn_41_17 = false;
        boolean stackIn_44_18 = false;
        boolean stackIn_47_19 = false;
        boolean stackIn_50_20 = false;
        CurvedRoadSegment stackIn_53_0;
        CurvedRoadSegment stackIn_53_1;
        Point2i stackIn_53_2;
        int stackIn_53_3;
        float stackIn_53_4;
        float stackIn_53_5;
        int stackIn_53_6;
        int stackIn_53_7;
        int stackIn_53_8;
        int stackIn_53_9;
        int stackIn_53_10;
        Object stackIn_53_11;
        Object stackIn_53_12;
        Point2i stackIn_53_13;
        CurvedRoadSegment stackIn_54_0 = null;
        CurvedRoadSegment stackIn_54_1 = null;
        boolean stackIn_54_14 = false;
        boolean stackIn_57_15 = false;
        boolean stackIn_60_16 = false;
        boolean stackIn_63_17 = false;
        boolean stackIn_66_18 = false;
        boolean stackIn_69_19 = false;
        StraightRoadSegment stackIn_74_0;
        StraightRoadSegment stackIn_74_1;
        Point2i stackIn_74_2;
        Point2i stackIn_74_3;
        int stackIn_74_4;
        int stackIn_74_5;
        int stackIn_74_6;
        int stackIn_74_7;
        int stackIn_74_8;
        int stackIn_74_9;
        int stackIn_74_10;
        int stackIn_74_11;
        int stackIn_74_12;
        int stackIn_74_13;
        int stackIn_74_14;
        StraightRoadSegment stackIn_75_0 = null;
        StraightRoadSegment stackIn_75_1 = null;
        boolean stackIn_75_15 = false;
        boolean stackIn_78_16 = false;
        boolean stackIn_81_17 = false;
        boolean stackIn_84_18 = false;
        boolean stackIn_87_19 = false;
        boolean stackIn_90_20 = false;
        float stackIn_94_0 = 0.0f;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        float stackIn_135_0 = 0.0f;
        Object stackIn_139_0 = null;
        RoadSegment stackIn_162_0 = null;
        int stackIn_163_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        RaceVehicle[] stackIn_189_0;
        int stackIn_189_1;
        RaceVehicle stackIn_189_2;
        RaceVehicle stackIn_189_3;
        int stackIn_189_4;
        int stackIn_189_5;
        int stackIn_189_6;
        float stackIn_189_7;
        float stackIn_189_8;
        RaceVehicle stackIn_190_2 = null;
        RaceVehicle stackIn_190_3 = null;
        RoadSegment stackIn_190_9 = null;
        RaceVehicle[] stackIn_203_0;
        int stackIn_203_1;
        RaceVehicle stackIn_203_2;
        RaceVehicle stackIn_203_3;
        int stackIn_203_4;
        int stackIn_203_5;
        int stackIn_203_6;
        float stackIn_203_7;
        float stackIn_203_8;
        RaceVehicle stackIn_204_2 = null;
        RaceVehicle stackIn_204_3 = null;
        RoadSegment stackIn_204_9 = null;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_228_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_277_0 = 0;
        RuntimeException stackIn_295_0 = null;
        StringBuilder stackIn_295_1 = null;
        String stackIn_296_2 = null;
        StringBuilder stackIn_299_1 = null;
        String stackIn_300_2 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        GrowableObjectList var20 = null;
        Point2i var21 = null;
        Point2i var22 = null;
        StraightRoadSegment var23 = null;
        Point2i var24 = null;
        StraightRoadSegment var24_ref = null;
        int var25_int = 0;
        CurvedRoadSegment var25 = null;
        int[] var26 = null;
        CurvedRoadSegment var26_ref = null;
        float var27 = 0.0f;
        float var28_float = 0.0f;
        int var28 = 0;
        Point2i var29_ref_qm = null;
        int var29 = 0;
        CurvedRoadSegment var30_ref_hn = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        float var36 = 0.0f;
        float var37 = 0.0f;
        Object var38 = null;
        int var39_int = 0;
        Object var39 = null;
        int var40 = 0;
        StraightRoadSegment var40_ref_dd = null;
        CurvedRoadSegment var41_ref_hn = null;
        int var41 = 0;
        CurvedRoadSegment var42_ref_hn = null;
        int var42 = 0;
        Point2i var43_ref_qm = null;
        int var43 = 0;
        RaceVehicle var43_ref_ja = null;
        int var44_int = 0;
        RaceVehicle var44 = null;
        float var45 = 0.0f;
        VehicleDefinition var46 = null;
        float var46_float = 0.0f;
        TrackObject var46_ref = null;
        float var47_float = 0.0f;
        int var47 = 0;
        int var48 = 0;
        PointLight var49 = null;
        int var50 = 0;
        StraightRoadSegment stackIn_35_0Lifetime1;
        StraightRoadSegment stackIn_35_0Lifetime2;
        StraightRoadSegment stackIn_35_0Lifetime3;
        StraightRoadSegment stackIn_35_0Lifetime4;
        StraightRoadSegment stackIn_35_0Lifetime5;
        StraightRoadSegment stackIn_35_1Lifetime1;
        StraightRoadSegment stackIn_35_1Lifetime2;
        StraightRoadSegment stackIn_35_1Lifetime3;
        StraightRoadSegment stackIn_35_1Lifetime4;
        StraightRoadSegment stackIn_35_1Lifetime5;
        CurvedRoadSegment stackIn_54_0Lifetime1;
        CurvedRoadSegment stackIn_54_0Lifetime2;
        CurvedRoadSegment stackIn_54_0Lifetime3;
        CurvedRoadSegment stackIn_54_0Lifetime4;
        CurvedRoadSegment stackIn_54_0Lifetime5;
        CurvedRoadSegment stackIn_54_1Lifetime1;
        CurvedRoadSegment stackIn_54_1Lifetime2;
        CurvedRoadSegment stackIn_54_1Lifetime3;
        CurvedRoadSegment stackIn_54_1Lifetime4;
        CurvedRoadSegment stackIn_54_1Lifetime5;
        StraightRoadSegment stackIn_75_0Lifetime1;
        StraightRoadSegment stackIn_75_0Lifetime2;
        StraightRoadSegment stackIn_75_0Lifetime3;
        StraightRoadSegment stackIn_75_0Lifetime4;
        StraightRoadSegment stackIn_75_0Lifetime5;
        StraightRoadSegment stackIn_75_1Lifetime1;
        StraightRoadSegment stackIn_75_1Lifetime2;
        StraightRoadSegment stackIn_75_1Lifetime3;
        StraightRoadSegment stackIn_75_1Lifetime4;
        StraightRoadSegment stackIn_75_1Lifetime5;
        RoadSegment stackIn_162_0Lifetime1;
        Point2i var43_ref_qmLifetime1;
        int stackIn_174_0Lifetime1;
        int stackIn_174_1Lifetime1;
        int stackIn_259_0Lifetime1;
        int stackIn_259_1Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        float var27Lifetime1;
        int var43Lifetime1;
        int var44_intLifetime1;
        float var45Lifetime1;
        int var15Lifetime1Lifetime1;
        int var16Lifetime1Lifetime1;
        int var43Lifetime1Lifetime1;
        var50 = HoldTheLine.field_D;
        try {
          var4 = new PacketBuffer(param0.field_s);
          var5 = new byte[EmailAddressValidator.field_m.length];
          var4.readBytes(EmailAddressValidator.field_m.length, 0, (byte) 106, var5);
          if (!NameAvailabilityResult.equalByteArrays(EmailAddressValidator.field_m, 0, var5)) {
            throw new IOException("Invalid file format!");
          }
          boolean decompiledFrameRemainder1 = true;
          var6 = new byte[CourseVersionTag.bytes.length];
          var4.readBytes(CourseVersionTag.bytes.length, 0, (byte) 98, var6);
          if (NameAvailabilityResult.equalByteArrays(WeightedLruCache.field_b, param2 - 32, var6)) {
            var7 = 0;
            decompiledFrameRemainder1 = (var50 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (!NameAvailabilityResult.equalByteArrays(NodeHashTableIterator.field_e, 0, var6)) {
              throw new IOException("Invalid file version!");
            }
            var7 = 1;
          }
          this.field_L = (byte)var4.readUnsignedByte((byte) -48);
          this.field_X = this.field_L & 7;
          if (this.field_X != 0) {
            if (this.field_X >= 3) {
              if (this.field_X < 6) {
                stackIn_23_1 = 2;
              } else {
                stackIn_23_1 = 3;
              }
            } else {
              stackIn_23_1 = 1;
            }
          } else {
            stackIn_23_1 = 0;
          }
          this.courseTheme = stackIn_23_1;
          var8 = var4.readUnsignedByte((byte) -47);
          var9 = var4.readUnsignedByte((byte) -123);
          var10 = 0;
          var11 = 0;
          if (var7 != 0) {
            var10 = var4.readUnsignedByte((byte) -105);
            var11 = var4.readUnsignedByte((byte) -52);
          }
          var12 = var4.readUnsignedByte((byte) -104);
          var13 = new byte[var8 * 2];
          var4.readBytes(var8 * 2, 0, (byte) 115, var13);
          var20 = new GrowableObjectList();
          this.courseObjects = new IntrusiveDeque();
          this.dynamicObjects = new IntrusiveDeque();
          var14 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 <= var14))) {
            var21 = new Point2i(var4.readUnsignedShort(-48), var4.readUnsignedShort(-108));
            var22 = new Point2i(var4.readUnsignedShort(-113), var4.readUnsignedShort(93));
            var16 = var4.readByte(0);
            var17 = var4.readUnsignedByte((byte) -108);
            var18 = var4.readByte(0);
            var19 = var4.readByte(0);
            if (var50 == 0) {
              stackIn_34_0 = null;
              stackIn_34_1 = null;
              stackIn_34_2 = var21;
              stackIn_34_3 = var22;
              stackIn_34_4 = var16;
              stackIn_34_5 = 0;
              stackIn_34_6 = 0;
              stackIn_34_7 = 0;
              stackIn_34_8 = 0;
              stackIn_34_9 = 0;
              stackIn_34_10 = 0;
              stackIn_34_11 = 0;
              stackIn_34_12 = 0;
              stackIn_34_13 = var18;
              stackIn_34_14 = var19;
              if ((2 & var17) == 0) {
                stackIn_35_0 = null;
                stackIn_35_1 = null;
                stackIn_35_15 = false;
              } else {
                stackIn_35_0 = null;
                stackIn_35_1 = null;
                stackIn_35_15 = true;
              }
              if ((4 & var17) == 0) {
                stackIn_35_0Lifetime1 = null;
                stackIn_35_1Lifetime1 = null;
                stackIn_38_16 = false;
              } else {
                stackIn_35_0Lifetime1 = null;
                stackIn_35_1Lifetime1 = null;
                stackIn_38_16 = true;
              }
              if (0 == (var17 & 1)) {
                stackIn_35_0Lifetime2 = null;
                stackIn_35_1Lifetime2 = null;
                stackIn_41_17 = false;
              } else {
                stackIn_35_0Lifetime2 = null;
                stackIn_35_1Lifetime2 = null;
                stackIn_41_17 = true;
              }
              if ((var17 & 8) == 0) {
                stackIn_35_0Lifetime3 = null;
                stackIn_35_1Lifetime3 = null;
                stackIn_44_18 = false;
              } else {
                stackIn_35_0Lifetime3 = null;
                stackIn_35_1Lifetime3 = null;
                stackIn_44_18 = true;
              }
              if ((var17 & 16) == 0) {
                stackIn_35_0Lifetime4 = null;
                stackIn_35_1Lifetime4 = null;
                stackIn_47_19 = false;
              } else {
                stackIn_35_0Lifetime4 = null;
                stackIn_35_1Lifetime4 = null;
                stackIn_47_19 = true;
              }
              if ((32 & var17) == 0) {
                stackIn_35_0Lifetime5 = null;
                stackIn_35_1Lifetime5 = null;
                stackIn_50_20 = false;
              } else {
                stackIn_35_0Lifetime5 = null;
                stackIn_35_1Lifetime5 = null;
                stackIn_50_20 = true;
              }
              var23 = new StraightRoadSegment(stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_34_7, stackIn_34_8, stackIn_34_9, stackIn_34_10, stackIn_34_11, stackIn_34_12, stackIn_34_13, stackIn_34_14, stackIn_35_15, stackIn_38_16, stackIn_41_17, stackIn_44_18, stackIn_47_19, stackIn_50_20, 0.0f, 0.0f, 3.1415927410125732f);
              var20.add(var23, (byte) 6);
              var24 = new Point2i(var4.readUnsignedShort(96), var4.readUnsignedShort(-105));
              var25_int = var4.readUnsignedShort(param2 - 149);
              var26 = new int[]{-var4.readUnsignedByte((byte) -30), -var4.readUnsignedByte((byte) -51), var4.readUnsignedByte((byte) -23), var4.readUnsignedByte((byte) -47)};
              var17 = var4.readUnsignedByte((byte) -46);
              var27 = (float)var4.readShort(-14232) / 256.0f;
              var28_float = (float)var4.readShort(-14232) / 256.0f;
              var16 = var4.readByte(0);
              var29_ref_qm = new Point2i(var4.readUnsignedShort(param2 - 101), var4.readUnsignedShort(param2 + 83));
              stackIn_53_0 = null;
              stackIn_53_1 = null;
              stackIn_53_2 = var24;
              stackIn_53_3 = var25_int;
              stackIn_53_4 = var27;
              stackIn_53_5 = var28_float;
              stackIn_53_6 = var16;
              stackIn_53_7 = var26[1];
              stackIn_53_8 = var26[2];
              stackIn_53_9 = var26[0];
              stackIn_53_10 = var26[3];
              stackIn_53_11 = null;
              stackIn_53_12 = null;
              stackIn_53_13 = var29_ref_qm;
              if (0 == (var17 & 2)) {
                stackIn_54_0 = null;
                stackIn_54_1 = null;
                stackIn_54_14 = false;
              } else {
                stackIn_54_0 = null;
                stackIn_54_1 = null;
                stackIn_54_14 = true;
              }
              if (0 == (var17 & 4)) {
                stackIn_54_0Lifetime1 = null;
                stackIn_54_1Lifetime1 = null;
                stackIn_57_15 = false;
              } else {
                stackIn_54_0Lifetime1 = null;
                stackIn_54_1Lifetime1 = null;
                stackIn_57_15 = true;
              }
              if (0 == (var17 & 1)) {
                stackIn_54_0Lifetime2 = null;
                stackIn_54_1Lifetime2 = null;
                stackIn_60_16 = false;
              } else {
                stackIn_54_0Lifetime2 = null;
                stackIn_54_1Lifetime2 = null;
                stackIn_60_16 = true;
              }
              if ((var17 & 8) == 0) {
                stackIn_54_0Lifetime3 = null;
                stackIn_54_1Lifetime3 = null;
                stackIn_63_17 = false;
              } else {
                stackIn_54_0Lifetime3 = null;
                stackIn_54_1Lifetime3 = null;
                stackIn_63_17 = true;
              }
              if ((16 & var17) == 0) {
                stackIn_54_0Lifetime4 = null;
                stackIn_54_1Lifetime4 = null;
                stackIn_66_18 = false;
              } else {
                stackIn_54_0Lifetime4 = null;
                stackIn_54_1Lifetime4 = null;
                stackIn_66_18 = true;
              }
              if ((32 & var17) == 0) {
                stackIn_54_0Lifetime5 = null;
                stackIn_54_1Lifetime5 = null;
                stackIn_69_19 = false;
              } else {
                stackIn_54_0Lifetime5 = null;
                stackIn_54_1Lifetime5 = null;
                stackIn_69_19 = true;
              }
              var30_ref_hn = new CurvedRoadSegment(stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_53_5, stackIn_53_6, stackIn_53_7, stackIn_53_8, stackIn_53_9, stackIn_53_10, (Point2i) (stackIn_53_11), (Point2i) (stackIn_53_12), stackIn_53_13, stackIn_54_14, stackIn_57_15, stackIn_60_16, stackIn_63_17, stackIn_66_18, stackIn_69_19);
              var20.add(var30_ref_hn, (byte) 6);
              var14++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var21 = new Point2i(var4.readShort(-14232), var4.readShort(param2 ^ -14264));
            var22 = new Point2i(var4.readShort(-14232), var4.readShort(param2 - 14264));
            var16 = var4.readByte(0);
            var17 = var4.readUnsignedByte((byte) -75);
            var18 = var4.readByte(0);
            var19 = var4.readByte(0);
          }
          stackIn_74_0 = null;
          stackIn_74_1 = null;
          stackIn_74_2 = var21;
          stackIn_74_3 = var22;
          stackIn_74_4 = var16;
          stackIn_74_5 = 0;
          stackIn_74_6 = 0;
          stackIn_74_7 = 0;
          stackIn_74_8 = 0;
          stackIn_74_9 = 0;
          stackIn_74_10 = 0;
          stackIn_74_11 = 0;
          stackIn_74_12 = 0;
          stackIn_74_13 = var18;
          stackIn_74_14 = var19;
          if (0 == (2 & var17)) {
            stackIn_75_0 = null;
            stackIn_75_1 = null;
            stackIn_75_15 = false;
          } else {
            stackIn_75_0 = null;
            stackIn_75_1 = null;
            stackIn_75_15 = true;
          }
          if ((var17 & 4) == 0) {
            stackIn_75_0Lifetime1 = null;
            stackIn_75_1Lifetime1 = null;
            stackIn_78_16 = false;
          } else {
            stackIn_75_0Lifetime1 = null;
            stackIn_75_1Lifetime1 = null;
            stackIn_78_16 = true;
          }
          if ((var17 & 1) == 0) {
            stackIn_75_0Lifetime2 = null;
            stackIn_75_1Lifetime2 = null;
            stackIn_81_17 = false;
          } else {
            stackIn_75_0Lifetime2 = null;
            stackIn_75_1Lifetime2 = null;
            stackIn_81_17 = true;
          }
          if (0 == (8 & var17)) {
            stackIn_75_0Lifetime3 = null;
            stackIn_75_1Lifetime3 = null;
            stackIn_84_18 = false;
          } else {
            stackIn_75_0Lifetime3 = null;
            stackIn_75_1Lifetime3 = null;
            stackIn_84_18 = true;
          }
          if ((16 & var17) == 0) {
            stackIn_75_0Lifetime4 = null;
            stackIn_75_1Lifetime4 = null;
            stackIn_87_19 = false;
          } else {
            stackIn_75_0Lifetime4 = null;
            stackIn_75_1Lifetime4 = null;
            stackIn_87_19 = true;
          }
          if ((var17 & param2) == 0) {
            stackIn_75_0Lifetime5 = null;
            stackIn_75_1Lifetime5 = null;
            stackIn_90_20 = false;
          } else {
            stackIn_75_0Lifetime5 = null;
            stackIn_75_1Lifetime5 = null;
            stackIn_90_20 = true;
          }
          var23 = new StraightRoadSegment(stackIn_74_2, stackIn_74_3, stackIn_74_4, stackIn_74_5, stackIn_74_6, stackIn_74_7, stackIn_74_8, stackIn_74_9, stackIn_74_10, stackIn_74_11, stackIn_74_12, stackIn_74_13, stackIn_74_14, stackIn_75_15, stackIn_78_16, stackIn_81_17, stackIn_84_18, stackIn_87_19, stackIn_90_20, 0.0f, 0.0f, 3.1415927410125732f);
          var24_ref = (StraightRoadSegment) (var20.elements[0]);
          var25 = (CurvedRoadSegment) (var20.elements[1]);
          var26_ref = (CurvedRoadSegment) (var20.elements[-1 + var20.size]);
          var20.add(var23, (byte) 6);
          var27Lifetime1 = var23.length(50) / (var23.length(50) + var24_ref.length(50));
          var28 = var26_ref.leftRoadOffset;
          var29 = var25.leftRoadOffset;
          var30 = var26_ref.leftCollisionOffset;
          var31 = var25.leftCollisionOffset;
          var32 = var26_ref.rightRoadOffset;
          var33 = var25.rightRoadOffset;
          var34 = var26_ref.rightCollisionOffset;
          var35 = var25.rightCollisionOffset;
          var36 = (float)((double)var27Lifetime1 * 3.141592653589793);
          if (!(var25.endAngle > var25.startAngle)) {
            stackIn_94_0 = 3.1415927410125732f + var25.startAngle;
          } else {
            stackIn_94_0 = var25.startAngle;
          }
          boolean decompiledFrameCompleted3 = true;
          var37 = stackIn_94_0;
          var38 = null;
          if (var7 == 0) {
            this.field_i = null;
            this.field_m = null;
          }
          if (var7 != 0 ||
            var50 != 0) {
            var38 = new RoadSegment[var10];
            this.field_i = new RoadControlPointSpec[var10];
            var14 = 0;
            do {
              if (var10 <= var14) {
                this.field_m = new ue[var11];
                break;
              }
              this.field_i[var14] = new RoadControlPointSpec();
              var39_int = var4.readUnsignedByte((byte) -27);
              ((Object[]) (var38))[var14] = (RoadSegment) (var20.elements[var39_int]);
              this.field_i[var14].parameter = (float)var4.readUnsignedShort(106) / 32768.0f - 0.5f;
              var14++;
            } while (var50 == 0);
            var14 = 0;
            while (var11 > var14) {
              this.field_m[var14] = new ue();
              var4.readUnsignedByte((byte) -94);
              var4.readUnsignedByte((byte) -79);
              var39_int = var4.readUnsignedShort(-108);
              var40 = var4.readUnsignedShort(64);
              var4.readUnsignedShort(81);
              discarded$0 = new Point2i(var39_int, var40);
              var14++;
              if (var50 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            var23.rightCollisionStartOffset = var26_ref.rightCollisionOffset;
            var14 = 0;
            var23.blendEndAngle = var36;
            var24_ref.blendStartAngle = var36;
            var23.leftRoadStartOffset = var26_ref.leftRoadOffset;
            var23.leftCollisionStartOffset = var26_ref.leftCollisionOffset;
            var23.rightRoadStartOffset = var26_ref.rightRoadOffset;
          }
          var39 = null;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameRemainder4 = true;
            var40_ref_dd = (StraightRoadSegment) (var20.elements[var14]);
            var40_ref_dd.setOffsetDirection(param2 + 43, var37);
            if (~var40_ref_dd.start.x == ~var40_ref_dd.end.x) {
              stackIn_127_0 = ~var40_ref_dd.start.y;
              stackIn_127_1 = ~var40_ref_dd.end.y;
              decompiledFrameRemainder0 = (var50 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_127_0 == stackIn_127_1)) {
                var20.removeAt(true, var14);
                decompiledFrameRemainder4 = false;
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder0)) {
              var40_ref_dd.leftCollisionEndOffset = var31;
              var14++;
              var40_ref_dd.rightCollisionStartOffset = var34;
              var40_ref_dd.leftRoadStartOffset = var28;
              var40_ref_dd.leftCollisionStartOffset = var30;
              var40_ref_dd.rightCollisionEndOffset = var35;
              var40_ref_dd.rightRoadStartOffset = var32;
              var40_ref_dd.leftRoadEndOffset = var29;
              var40_ref_dd.rightRoadEndOffset = var33;
            }
            if (decompiledFrameRemainder0) {
              if (var39 != null) {
                ((CurvedRoadSegment) (var39)).controlPathEnd = var40_ref_dd.getControlPathStart(-1);
              }
              stackIn_127_0 = ~var14;
              stackIn_127_1 = ~var20.size;
            }
            if (stackIn_127_0 > stackIn_127_1 ||
              var50 != 0) {
              var41_ref_hn = (CurvedRoadSegment) (var20.elements[var14]);
              var41_ref_hn.controlPathStart = var40_ref_dd.getControlPathEnd((byte) -128);
              var14++;
              if (!(var41_ref_hn.endAngle > var41_ref_hn.startAngle)) {
                stackIn_135_0 = 3.1415927410125732f + var41_ref_hn.endAngle;
              } else {
                stackIn_135_0 = var41_ref_hn.endAngle;
              }
              var37 = stackIn_135_0;
              var28 = var29;
              if (var14 < var20.size - 1) {
                stackIn_139_0 = var20.elements[var14 + 1];
              } else {
                stackIn_139_0 = var25;
              }
              var42_ref_hn = (CurvedRoadSegment) (stackIn_139_0);
              var29 = var42_ref_hn.leftRoadOffset;
              var30 = var31;
              var31 = var42_ref_hn.leftCollisionOffset;
              var32 = var33;
              var34 = var35;
              var33 = var42_ref_hn.rightRoadOffset;
              var39 = var41_ref_hn;
              var35 = var42_ref_hn.rightCollisionOffset;
              if (var50 == 0) {
                continue;
              }
            }
            break;
          }
          this.roadSegments = new RoadSegment[var20.size];
          var14 = 0;
          scanLoop1: while (true) {
            if (var20.size > var14) {
              this.roadSegments[var14] = (RoadSegment) (var20.elements[var14]);
              var14++;
              if (var50 == 0) {
                continue;
              }
            } else {
              if (var7 != 0) {
                var14 = 0;
                while (var10 > var14) {
                  stackIn_163_0 = 0;
                  if (var50 != 0) {
                    break scanLoop1;
                  }
                  var15 = stackIn_163_0;
                  while (var15 < this.roadSegments.length) {
                    stackIn_162_0 = this.roadSegments[var15];
                    if (stackIn_162_0 == ((Object[]) (var38))[var14]) {
                      this.roadSegments[var15].controlPathAt(this.field_i[var14].parameter, param2 ^ 7561012);
                    }
                    var15++;
                  }
                  var14++;
                }
              }
            }
            stackIn_162_0Lifetime1 = this.roadSegments[this.roadSegments.length - 1];
            stackIn_163_0 = stackIn_162_0Lifetime1.layer;
            break;
          }
          var40 = stackIn_163_0;
          var41 = this.roadSegments[0].layer;
          var14 = 0;
          scanLoop2: while (true) {
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            if (var14 < this.roadSegments.length) {
              var42 = this.roadSegments[(1 + var14) % this.roadSegments.length].layer;
              stackIn_174_0 = 0;
              stackIn_174_1 = var41;
              if (var50 != 0) {
                if (stackIn_174_0 < stackIn_174_1) {
                  var43_ref_qm = new Point2i(var4.readShort(-14232), var4.readShort(-14232));
                  var44_int = var4.readUnsignedByte((byte) -24);
                  var45 = (float)(3.141592653589793 * (double)var4.readUnsignedByte((byte) -60) / 128.0);
                  var16Lifetime1 = var4.readByte(0);
                  stackIn_223_0 = var44_int;
                  stackIn_223_1 = 5;
                  break scanLoop2;
                }
                decompiledFrameRemainder3 = false;
              }
              else {
                if (stackIn_174_0 == stackIn_174_1) {
                  this.roadSegments[var14].layerSlope = (float)(var42 - var40) / this.roadSegments[var14].length(50);
                }
                var40 = var41;
                var41 = var42;
                var14++;
                continue;
              }
            }
            if (decompiledFrameRemainder3) {
              RoadControlPointSpec.field_a = this.roadSegments;
              var14 = 0;
              while (true) {
                stackIn_174_0Lifetime1 = var14;
                stackIn_174_1Lifetime1 = var12;
                if (stackIn_174_0Lifetime1 >= stackIn_174_1Lifetime1) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                var43_ref_qmLifetime1 = new Point2i(var4.readShort(-14232), var4.readShort(-14232));
                var44_intLifetime1 = var4.readUnsignedByte((byte) -24);
                var45Lifetime1 = (float)(3.141592653589793 * (double)var4.readUnsignedByte((byte) -60) / 128.0);
                var16Lifetime1Lifetime1 = var4.readByte(0);
                stackIn_223_0 = var44_intLifetime1;
                stackIn_223_1 = 5;
                if (var50 != 0) {
                  break scanLoop2;
                }
                if (stackIn_223_0 >= stackIn_223_1 &&
                  var44_intLifetime1 <= 8) {
                  var46 = ContentTransitionState.field_c[this.courseTheme * 2];
                  var47_float = InheritedWidgetStyle.findRoadParameter(this.roadSegments.length, 0.0f, -1, this.roadSegments, -24659, var43_ref_qmLifetime1, var16Lifetime1Lifetime1);
                  if (var47_float == -1.0f) {
                    break;
                  }
                  fieldTemp$1 = this.vehicleCount;
                  this.vehicleCount = this.vehicleCount + 1;
                  stackIn_189_0 = this.vehicles;
                  stackIn_189_1 = fieldTemp$1;
                  stackIn_189_2 = null;
                  stackIn_189_3 = null;
                  stackIn_189_4 = var43_ref_qmLifetime1.x;
                  stackIn_189_5 = var43_ref_qmLifetime1.y;
                  stackIn_189_6 = var16Lifetime1Lifetime1;
                  stackIn_189_7 = var45Lifetime1;
                  stackIn_189_8 = var47_float;
                  if (var47_float == (float)this.roadSegments.length) {
                    stackIn_190_2 = null;
                    stackIn_190_3 = null;
                    stackIn_190_9 = this.roadSegments[0];
                  } else {
                    stackIn_190_2 = null;
                    stackIn_190_3 = null;
                    stackIn_190_9 = this.roadSegments[(int)var47_float];
                  }
                  stackIn_189_0[stackIn_189_1] = new RaceVehicle(stackIn_189_4, stackIn_189_5, stackIn_189_6, stackIn_189_7, stackIn_189_8, stackIn_190_9, var46, 0);
                } else if (var44_intLifetime1 >= 62 &&
                  69 >= var44_intLifetime1) {
                  var46_float = InheritedWidgetStyle.findRoadParameter(this.roadSegments.length, 0.0f, 1, this.roadSegments, param2 ^ -24691, var43_ref_qmLifetime1, var16Lifetime1Lifetime1);
                  if (-1.0f == var46_float) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  fieldTemp$2 = this.vehicleCount;
                  this.vehicleCount = this.vehicleCount + 1;
                  stackIn_203_0 = this.vehicles;
                  stackIn_203_1 = fieldTemp$2;
                  stackIn_203_2 = null;
                  stackIn_203_3 = null;
                  stackIn_203_4 = var43_ref_qmLifetime1.x;
                  stackIn_203_5 = var43_ref_qmLifetime1.y;
                  stackIn_203_6 = var16Lifetime1Lifetime1;
                  stackIn_203_7 = var45Lifetime1;
                  stackIn_203_8 = var46_float;
                  if ((float)this.roadSegments.length == var46_float) {
                    stackIn_204_2 = null;
                    stackIn_204_3 = null;
                    stackIn_204_9 = this.roadSegments[0];
                  } else {
                    stackIn_204_2 = null;
                    stackIn_204_3 = null;
                    stackIn_204_9 = this.roadSegments[(int)var46_float];
                  }
                  stackIn_203_0[stackIn_203_1] = new RaceVehicle(stackIn_203_4, stackIn_203_5, stackIn_203_6, stackIn_203_7, stackIn_203_8, stackIn_204_9, ContentTransitionState.field_c[-62 + var44_intLifetime1], 1);
                } else {
                  var46_ref = new TrackObject(var43_ref_qmLifetime1, var44_intLifetime1, var16Lifetime1Lifetime1, var45Lifetime1, 0.0f, 0.0f);
                  if ((1048576 & var46_ref.flags) != 0) {
                    var46_ref.getCurrentSprite((byte) -113);
                    var46_ref.sprite = var46_ref.sprite.copy();
                  }
                  if ((var46_ref.flags & 32768) == 0) {
                    this.courseObjects.addLast((byte) -84, var46_ref);
                  } else {
                    this.dynamicObjects.addLast((byte) -92, var46_ref);
                  }
                  var46_ref.updateCourseMembership(-1, RoadControlPointSpec.field_a);
                  if (53 != var44_intLifetime1) {
                    if (54 == var44_intLifetime1) {
                      var47 = var43_ref_qmLifetime1.x - (int)(Math.sin((double)var45Lifetime1) * 35.0);
                      var48 = var43_ref_qmLifetime1.y - (int)(Math.cos((double)var45Lifetime1) * 35.0);
                      var49 = new PointLight(var47, var48, var16Lifetime1Lifetime1, 60, DisplayNameForm.field_Q);
                      this.pointLights.addLast((byte) -117, var49);
                      var47 = var43_ref_qmLifetime1.x + (int)(Math.sin((double)var45Lifetime1) * 35.0);
                      var48 = var43_ref_qmLifetime1.y + (int)(Math.cos((double)var45Lifetime1) * 35.0);
                      var49 = new PointLight(var47, var48, var16Lifetime1Lifetime1, 60, DisplayNameForm.field_Q);
                      this.pointLights.addLast((byte) -118, var49);
                    }
                  } else {
                    var47 = var43_ref_qmLifetime1.x - (int)(10.0 * Math.sin((double)var45Lifetime1));
                    var48 = var43_ref_qmLifetime1.y - (int)(Math.cos((double)var45Lifetime1) * 10.0);
                    var49 = new PointLight(var47, var48, var16Lifetime1Lifetime1, 60, DisplayNameForm.field_Q);
                    this.pointLights.addLast((byte) -81, var49);
                  }
                }
                var14++;
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                throw new RuntimeException((String) null);
              }
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameCompleted2)) {
              throw new RuntimeException((String) null);
            }
            stackIn_223_0 = ~this.vehicleCount;
            stackIn_223_1 = -1;
            break;
          }
          if (stackIn_223_0 == stackIn_223_1) {
            throw new RuntimeException((String) null);
          }
          var14 = 0;
          while (true) {
            stackIn_228_0 = var14;
            if (stackIn_228_0 < this.vehicleCount) {
              stackIn_247_0 = 0;
              if (var50 == 0) {
                if (stackIn_247_0 == this.vehicles[var14].lifeState) {
                  this.playerCount = this.playerCount + 1;
                  var43 = 0;
                  var15Lifetime1 = 0;
                  while (this.vehicleCount > var15Lifetime1) {
                    stackIn_228_0 = this.vehicles[var15Lifetime1].lifeState;
                    if (stackIn_228_0 == 0 &&
                      this.vehicles[var15Lifetime1].furthestCourseProgress > this.vehicles[var14].furthestCourseProgress) {
                      var43++;
                    }
                    var15Lifetime1++;
                  }
                  this.vehicles[var14].racePosition = var43;
                }
                var14++;
                continue;
              }
            } else {
              stackIn_247_0 = 0;
            }
            var15Lifetime1Lifetime1 = stackIn_247_0;
            var14 = this.playerCount;
            scanLoop3: while (true) {
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameCompleted0 = true;
              regionExit4: {
                if (this.vehicleCount > var14) {
                  stackIn_259_0 = 0;
                  stackIn_259_1 = this.vehicles[var14].lifeState;
                  if (var50 != 0) {
                    if (stackIn_259_0 < stackIn_259_1) {
                      var43Lifetime1 = param1[this.vehicles[var14].racePosition];
                      stackIn_269_0 = var43Lifetime1;
                      stackIn_269_1 = var14;
                      break regionExit4;
                    }
                    decompiledFrameRemainder5 = false;
                  }
                  else {
                    if (stackIn_259_0 == stackIn_259_1) {
                      var43_ref_ja = this.vehicles[var14];
                      this.vehicles[var14] = this.vehicles[var15Lifetime1Lifetime1];
                      incrementValue$3 = var15Lifetime1Lifetime1;
                      var15Lifetime1Lifetime1++;
                      this.vehicles[incrementValue$3] = var43_ref_ja;
                    }
                    var14++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder5) {
                  if (null == param1) {
                    param1 = new int[]{3, 2, 1, 0};
                  }
                  var14 = 0;
                  while (true) {
                    stackIn_259_0Lifetime1 = var14;
                    stackIn_259_1Lifetime1 = this.playerCount;
                    if (stackIn_259_0Lifetime1 >= stackIn_259_1Lifetime1) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var43Lifetime1 = param1[this.vehicles[var14].racePosition];
                    stackIn_269_0 = var43Lifetime1;
                    stackIn_269_1 = var14;
                    if (var50 != 0) {
                      break;
                    }
                    if (stackIn_269_0 != stackIn_269_1) {
                      var44 = this.vehicles[var43Lifetime1];
                      this.vehicles[var43Lifetime1] = this.vehicles[var14];
                      this.vehicles[var14] = var44;
                    }
                    var14++;
                  }
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameCompleted0)) {
                while (stackIn_269_0 > stackIn_269_1) {
                  this.vehicles[var14].field_Eb = NodeHashTableIterator.field_j[var14];
                  this.vehicles[var14].field_tc = ClientException.field_d[var14];
                  var43Lifetime1 = PolarSortVector.field_c[this.courseTheme];
                  stackIn_277_0 = var14 & 1;
                  if (var50 != 0) {
                    break scanLoop3;
                  }
                  if (stackIn_277_0 == 0) {
                    var43Lifetime1 = var43Lifetime1 ^ 1;
                  }
                  this.vehicles[var14].setVehicleDefinition(param2 + 20353, ContentTransitionState.field_c[var43Lifetime1]);
                  var14++;
                  stackIn_269_0 = ~var14;
                  stackIn_269_1 = ~this.playerCount;
                }
                decompiledFrameRemainder2 = false;
              }
              if (decompiledFrameRemainder2) {
                var14 = 0;
                while (true) {
                  stackIn_269_0 = ~var14;
                  stackIn_269_1 = ~this.playerCount;
                  if (stackIn_269_0 <= stackIn_269_1) {
                    break;
                  }
                  this.vehicles[var14].field_Eb = NodeHashTableIterator.field_j[var14];
                  this.vehicles[var14].field_tc = ClientException.field_d[var14];
                  var43Lifetime1Lifetime1 = PolarSortVector.field_c[this.courseTheme];
                  stackIn_277_0 = var14 & 1;
                  if (var50 != 0) {
                    break scanLoop3;
                  }
                  if (stackIn_277_0 == 0) {
                    var43Lifetime1Lifetime1 = var43Lifetime1Lifetime1 ^ 1;
                  }
                  this.vehicles[var14].setVehicleDefinition(param2 + 20353, ContentTransitionState.field_c[var43Lifetime1Lifetime1]);
                  var14++;
                }
              }
              stackIn_277_0 = this.playerCount;
              break;
            }
            var14 = stackIn_277_0;
            scanLoop5: while (true) {
              if (var14 < this.vehicleCount) {
                this.vehicles[var14].field_Eb = 8421504;
                this.vehicles[var14].field_tc = 0;
                var14++;
                if (var50 == 0) {
                  continue;
                }
              } else {
                if (3 == this.courseTheme) {
                  this.shadowsEnabled = false;
                  if (var50 == 0) {
                    break scanLoop5;
                  }
                }
                this.shadowsEnabled = true;
              }
              this.shadowOffset = new Vector2i(5, 5);
              break;
            }
            this.prepareCourseRendering(param0, -77);
            RoadControlPointSpec.field_a = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_295_0 = var4_ref;
          stackIn_295_1 = new StringBuilder().append("sg.W(");
          if (param0 == null) {
            stackIn_296_2 = "null";
          } else {
            stackIn_296_2 = "{...}";
          }
          stackIn_299_1 = ((StringBuilder) (Object) stackIn_295_1).append(stackIn_296_2).append(',');
          if (param1 == null) {
            stackIn_300_2 = "null";
          } else {
            stackIn_300_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_295_0), ((StringBuilder) (Object) stackIn_299_1).append(stackIn_300_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void updateParticleQueue(boolean param0, IntrusiveDeque param1) {
        RuntimeException runtimeException = null;
        Particle var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var3 = (Particle) (param1.first((byte) 124));
          if (param0) {
            this.gameMode = 78;
          }
          while (var3 != null) {
            if (var4 != 0) {
              return;
            }
            if (var3.lifetime != 0) {
              var3.update(-115);
              if (0 >= var3.lifetime) {
                var3.recycle((byte) -21);
              }
            }
            var3 = (Particle) (param1.next((byte) -76));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int orInts(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6293) {
            this.field_P = 13;
          }
          stackIn_4_0 = param0 | param2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawObjectShadow(TrackObject param0, int param1) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        Particle var4 = null;
        int[] var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        int var3_intLifetime1;
        var13 = HoldTheLine.field_D;
        try {
          if ((param0.flags & 65536) != 0) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.shadowsEnabled) {
            var3_int = param0.position.x;
            var4_int = param0.position.y;
            if ((131072 & param0.flags) != 0) {
              var4_int = param0.transitionY;
              var3_int = param0.transitionX;
            }
            if ((16384 & param0.flags) != 0) {
              hc.a(128, param0.getCurrentSprite((byte) -110), (byte) -108, this.shadowOffset.x + var3_int, this.shadowOffset.y + var4_int);
              decompiledFrameRemainder0 = (var13 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(param0.definition.rectangularCollision);
              if (!decompiledSharedTail0) {
                var5 = new int[16];
                var6 = param0.direction.x;
                var7 = param0.direction.y;
                var8 = -var7;
                var9 = var6;
                var10 = (float)param0.definition.field_m;
                var11 = (float)param0.definition.field_h;
                var5[7] = (int)((float)var4_int + var10 * var7 - var11 * var9);
                var5[2] = (int)(-(var10 * var6) + (float)var3_int + var8 * var11);
                var5[3] = (int)(-(var10 * var7) + (float)var4_int + var9 * var11);
                var5[1] = (int)((float)var4_int + var7 * var10 + var11 * var9);
                var5[0] = (int)(var11 * var8 + ((float)var3_int + var10 * var6));
                var5[4] = (int)(-(var10 * var6) + (float)var3_int - var11 * var8);
                var5[6] = (int)(-(var11 * var8) + ((float)var3_int + var6 * var10));
                var5[5] = (int)((float)var4_int - var7 * var10 - var9 * var11);
                var12 = 0;
                while (true) {
                  if (8 > var12) {
                    var5[var12 + 8] = var5[var12] + this.shadowOffset.x;
                    var5[var12 + 9] = var5[var12 + 1] + this.shadowOffset.y;
                    var12 += 2;
                    if (var13 == 0) {
                      continue;
                    }
                  } else {
                    var5 = TriangleMesh.convexHull(var5, (byte) -127);
                    UrlPacketDownloader.fillPolygonAlpha(var5, (byte) -106, 128, 0);
                  }
                  break;
                }
                decompiledSharedTail0 = (var13 != 0);
              }
              if (decompiledSharedTail0) {
                SoftwareRasterizer.fillCircleAlpha(var3_int + this.shadowOffset.x, var4_int + this.shadowOffset.y, param0.definition.collisionRadius, 0, 128);
              }
            }
          }
          if (param1 != 8192) {
            return;
          }
          var3_intLifetime1 = param0.layer + 1;
          while (var3_intLifetime1 < 4) {
            if (var13 != 0) {
              return;
            }
            var4 = (Particle) (this.lightParticles[var3_intLifetime1].first((byte) 111));
            while (var4 != null) {
              this.drawObjectLightShadow(var4.fixedX >> 10, var4.fixedY >> 10, var4.fixedRadius >> 10, (byte) -35, param0, var4.alpha * 2 >> 2);
              var4 = (Particle) (this.lightParticles[var3_intLifetime1].next((byte) 121));
            }
            var3_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("sg.GA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawRain(long param0, boolean param1) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = HoldTheLine.field_D;
        try {
          this.updateLightning((byte) -3, param0);
          if (3 != this.courseTheme) {
            var4_int = this.lightningBrightness + 128;
            if (this.gameMode == 2 ||
              this.gameMode == 6) {
              var4_int = var4_int + 256 >> 1;
            }
            o.a(128, 480, 0, var4_int, 640, -4441, 0);
          }
          var4_intLifetime1 = 1 * hc.a(0, (int)(param0 << 1)) + 2 * GrowableStringList.sinFixed((int)(param0 >> 1), 5255) >> 20;
          var5 = ((int)param0 * 640 - 1) % 1337;
          var6 = var5 / 640;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var6 >= 480))) {
            stackIn_23_0 = -1;
            stackIn_23_1 = ~((var5 * 3 + 5 * var6) % 9);
            if (var7 == 0) {
              if (stackIn_23_0 == stackIn_23_1) {
                SoftwareRasterizer.drawLine(var5, var6, -3 + (var5 + var4_intLifetime1), var6 - 7, 6715272);
              }
              var5 += 939;
              if (640 >= var5) {
                continue;
              }
              var6 = var6 + var5 / 640;
              var5 = var5 % 640;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            var5 = (-1 + (int)param0 * 640) % 917;
            stackIn_23_0 = var5;
            stackIn_23_1 = 640;
          }
          var6Lifetime1 = stackIn_23_0 / stackIn_23_1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6Lifetime1 >= 480))) {
            stackIn_36_0 = (var6Lifetime1 * 4 + var5 * 2) % 7;
            if (var7 == 0) {
              if (stackIn_36_0 == 0) {
                SoftwareRasterizer.drawLine(var5, var6Lifetime1, var4_intLifetime1 + (-3 + var5), -5 + var6Lifetime1, 3364192);
              }
              var5 += 547;
              if (640 >= var5) {
                continue;
              }
              var6Lifetime1 = var6Lifetime1 + var5 / 640;
              var5 = var5 % 640;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_36_0 = param1 ? 1 : 0;
          }
          if (stackIn_36_0 != 1) {
            this.courseImage = (Sprite) null;
          }
          var5Lifetime1 = (640 * (int)param0 - 1) % 593;
          var6Lifetime2 = var5Lifetime1 / 640;
          while (var6Lifetime2 < 480) {
            if ((2 * var5Lifetime1 + var6Lifetime2 * 4) % 7 == 0) {
              SoftwareRasterizer.drawLine(var5Lifetime1, var6Lifetime2, -4 + (var5Lifetime1 + var4_intLifetime1), -7 + var6Lifetime2, 5461344);
            }
            var5Lifetime1 += 375;
            if (var5Lifetime1 <= 640) {
              continue;
            }
            var6Lifetime2 = var6Lifetime2 + var5Lifetime1 / 640;
            var5Lifetime1 = var5Lifetime1 % 640;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void enterTutorialPage(String param0, byte param1) {
        int fieldTemp$1 = 0;
        TutorialPage var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.previousTutorialPage = this.tutorialPage;
          if (param0 != null) {
            this.tutorialPage = this.findTutorialPage(param0, -118);
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            fieldTemp$1 = this.tutorialPage + 1;
            this.tutorialPage = this.tutorialPage + 1;
            if (~fieldTemp$1 == ~RasterBuffer.field_a.length) {
              throw new RuntimeException();
            }
          }
          if (this.tutorialPage != this.previousTutorialPage) {
            this.tutorialPageTicks = 0;
          }
          var3 = RasterBuffer.field_a[this.tutorialPage];
          if (param1 != 8) {
            this.enterTutorialPage((String) null, (byte) 71);
          }
          var4 = 0;
          while (var4 < var3.field_c) {
            this.executeTutorialAction(var3.field_e[var4], -99);
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("sg.EA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawVehiclePowerupGlow(int param0, int param1, RaceVehicle param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= 3))) {
            stackIn_22_0 = param2.powerupLevels[var4_int];
            stackIn_22_1 = 3;
            if (var7 == 0) {
              if (stackIn_22_0 == stackIn_22_1) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                var6 = var4_int;
                if (var6 == 0) {
                  var5 = 16711680;
                  decompiledFrameRemainder1 = false;
                } else {
                  decompiledFrameRemainder0 = (var6 == 1);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  var5 = 65280;
                  decompiledFrameRemainder1 = false;
                }
                if (decompiledFrameRemainder1) {
                  var5 = 8355839;
                }
                SoftwareRasterizer.fillCircleAlpha(param2.position.x, param2.position.y, 4 + param0 * 4, var5, 16);
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_22_0 = param1;
            stackIn_22_1 = -403;
          }
          if (stackIn_22_0 != stackIn_22_1) {
            this.roadLayerMask = (IndexedSprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_29_0 = runtimeException;
          stackIn_29_1 = new StringBuilder().append("sg.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void updateTutorialTransitions(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_172_0 = 0;
        RuntimeException decompiledCaughtException = null;
        TutorialPage var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        TutorialTransition var4 = null;
        int var5 = 0;
        int var6 = 0;
        TutorialCondition var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_165_0Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          var2 = RasterBuffer.field_a[this.tutorialPage];
          var3 = 0;
          scanLoop1: while (true) {
            if (var3 < var2.field_b) {
              var4 = var2.field_p[var3];
              var5 = 1;
              stackIn_172_0 = 0;
              if (var10 != 0) {
                break scanLoop1;
              }
              var6 = stackIn_172_0;
              while (true) {
                if (var4.field_d > var6) {
                  var7 = var4.field_a[var6];
                  stackIn_165_0 = var7.opcode;
                  if (stackIn_165_0 == 0) {
                    stackIn_15_0 = var5;
                    if ((this.tutorialFlags & 1) == 0) {
                      stackIn_16_1 = 0;
                    } else {
                      stackIn_16_1 = 1;
                    }
                    var5 = stackIn_15_0 & stackIn_16_1;
                  } else if (var7.opcode != 1) {
                    if (var7.opcode == 2) {
                      if (var7.field_b < 0) {
                        stackIn_29_0 = var7.field_b + this.roadSegments.length;
                      } else {
                        stackIn_29_0 = var7.field_b;
                      }
                      var8 = stackIn_29_0;
                      var9 = (int)this.vehicles[0].courseProgress;
                      if (var9 < var8 &&
                        (var7.field_c & 1) == 0) {
                        var5 = 0;
                      }
                      if (var8 == var9 &&
                        (var7.field_c & 2) == 0) {
                        var5 = 0;
                      }
                      if (var8 < var9 &&
                        (4 & var7.field_c) == 0) {
                        var5 = 0;
                      }
                    } else if (3 != var7.opcode) {
                      if (var7.opcode == 4) {
                        if (this.vehicles[var7.field_c].specialPowerup != var7.field_b) {
                          var5 = 0;
                        }
                      } else if (var7.opcode == 5) {
                        var8 = this.vehicles[var7.field_c].lapsCompleted;
                        var9 = var7.field_e;
                        if (var8 < var9 &&
                          (var7.field_b & 1) == 0) {
                          var5 = 0;
                        }
                        if (var9 == var8 &&
                          (2 & var7.field_b) == 0) {
                          var5 = 0;
                        }
                        if (var9 < var8 &&
                          0 == (4 & var7.field_b)) {
                          var5 = 0;
                        }
                      } else if (var7.opcode != 9) {
                        if (var7.opcode == 6) {
                          stackIn_93_0 = var5;
                          if ((8 & this.tutorialFlags) == 0) {
                            stackIn_94_1 = 0;
                          } else {
                            stackIn_94_1 = 1;
                          }
                          var5 = stackIn_93_0 & stackIn_94_1;
                        } else if (7 == var7.opcode) {
                          stackIn_103_0 = var5;
                          if (0 == (16 & this.tutorialFlags)) {
                            stackIn_104_1 = 0;
                          } else {
                            stackIn_104_1 = 1;
                          }
                          var5 = stackIn_103_0 & stackIn_104_1;
                        } else if (8 == var7.opcode) {
                          stackIn_116_0 = var5;
                          if (this.raceFinished &&
                            -this.field_ob + this.raceTicks >= 150) {
                            stackIn_117_1 = 1;
                          } else {
                            stackIn_117_1 = 0;
                          }
                          var5 = stackIn_116_0 & stackIn_117_1;
                        }
                      } else {
                        var8 = this.vehicles[var7.field_c].racePosition;
                        var9 = var7.field_e;
                        if (var9 > var8 &&
                          0 == (1 & var7.field_b)) {
                          var5 = 0;
                        }
                        if (~var9 == ~var8 &&
                          0 == (2 & var7.field_b)) {
                          var5 = 0;
                        }
                        if (var8 > var9 &&
                          (var7.field_b & 4) == 0) {
                          var5 = 0;
                        }
                      }
                    } else {
                      var8 = this.vehicles[0].powerupLevels[var7.field_c];
                      var9 = var7.field_e;
                      if (var9 > var8 &&
                        (1 & var7.field_b) == 0) {
                        var5 = 0;
                      }
                      if (~var8 == ~var9 &&
                        (2 & var7.field_b) == 0) {
                        var5 = 0;
                      }
                      if (var8 > var9 &&
                        (var7.field_b & 4) == 0) {
                        var5 = 0;
                      }
                    }
                  } else {
                    stackIn_161_0 = var5;
                    if (0 == (2 & this.tutorialFlags)) {
                      stackIn_162_1 = 0;
                    } else {
                      stackIn_162_1 = 1;
                    }
                    var5 = stackIn_161_0 & stackIn_162_1;
                  }
                  var6++;
                  continue;
                }
                stackIn_165_0Lifetime1 = var5;
                if (stackIn_165_0Lifetime1 != 0) {
                  this.enterTutorialPage(var4.targetPage, (byte) 8);
                  break;
                }
                var3++;
                continue scanLoop1;
              }
            }
            stackIn_172_0 = param0;
            break;
          }
          if (stackIn_172_0 != 31782) {
            navigationUrl = (String) null;
          }
          if (0 < this.tutorialHighlightAlpha &&
            this.tutorialHighlightAlpha < 256) {
            fieldTemp$0 = this.tutorialHighlightAlpha - 3;
            this.tutorialHighlightAlpha = this.tutorialHighlightAlpha - 3;
            if (fieldTemp$0 <= 0) {
              this.tutorialHighlight = -101;
            }
          }
          if (~this.previousTutorialPage != ~this.tutorialPage) {
            fieldTemp$1 = this.tutorialPageTicks + 1;
            this.tutorialPageTicks = this.tutorialPageTicks + 1;
            if (fieldTemp$1 == 40) {
              this.previousTutorialPage = this.tutorialPage;
            }
          }
          this.tutorialFlags = this.tutorialFlags & -28;
          if (this.tutorialPage == -1) {
            MenuList.field_h = 255;
            if (var10 == 0) {
              return;
            }
          }
          if (null != RasterBuffer.field_a[this.tutorialPage].field_j) {
            fieldTemp$2 = MenuList.field_h - 4;
            MenuList.field_h = MenuList.field_h - 4;
            if (fieldTemp$2 >= 0) {
              return;
            }
            MenuList.field_h = 0;
            if (var10 == 0) {
              return;
            }
          }
          fieldTemp$3 = MenuList.field_h + 4;
          MenuList.field_h = MenuList.field_h + 4;
          if (fieldTemp$3 > 255) {
            MenuList.field_h = 255;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "sg.RA(" + param0 + ')');
        }
    }

    final boolean isInsideCollisionBounds(int param0, int param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_31_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          if (param3 >= 0 &&
            param1 >= 0 &&
            640 > param3 &&
            param1 < 480) {
            var5_int = this.roadLayerMask.pixels[param3 + 640 * param1];
            if (param0 >= 1) {
              var5_int = var5_int & 60;
            }
            if ((param0 < 1 ||
              HoldTheLine.field_D != 0) &&
              param0 <= -1) {
              var5_int = var5_int & 15;
            }
            return (0 != var5_int);
          }
          stackIn_31_0 = b.containsPointInBoundaryLoops(!param2, param3, param1, this.collisionBoundaryLoops);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var5), "sg.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void moveVehicle(RaceVehicle param0, float param1, int param2, float param3, float param4) {
        int stackIn_24_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var6_float = 0.0f;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8_int = 0;
        TrackObject var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var6_float = (float)Math.sqrt((double)(param3 * param3 + param4 * param4));
          var7 = 1 + (int)var6_float;
          param1 = param1 / (float)var7;
          param3 = param3 / (float)var7;
          param4 = param4 / (float)var7;
          var8_int = 0;
          while (var7 > var8_int) {
            if (0.0f != param1) {
              param0.heading = param0.heading + param1;
              param0.direction.setDirectionFromAngle(param0.heading, (byte) -54);
            }
            param0.worldX = param0.worldX + param3;
            param0.worldY = param0.worldY + param4;
            param0.position.y = (int)param0.worldY;
            param0.position.x = (int)param0.worldX;
            if (!this.resolveVehicleWorldCollision(true, param0) ||
              var9 != 0) {
              var8_int++;
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          var8 = (TrackObject) (this.dynamicObjects.first((byte) 108));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8))) {
            stackIn_24_0 = 262144 & var8.flags;
            if (var9 == 0) {
              if (stackIn_24_0 != 0) {
                this.applyDirectionalObjectEffect(var8, param0, (byte) 7);
              }
              var8 = (TrackObject) (this.dynamicObjects.next((byte) 92));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            param0.updateCourseMembership(-1, MusicPatchPcmStream.field_r.roadSegments);
            stackIn_24_0 = param2;
          }
          if (stackIn_24_0 != ~param0.courseSegment) {
            param0.layer = MusicPatchPcmStream.field_r.roadSegments[param0.courseSegment].layer;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("sg.P(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean resolveVehicleWorldCollision(boolean param0, RaceVehicle param1) {
        int fieldTemp$0 = 0;
        RaceVehicle stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        NamedSoundEffect stackIn_34_0 = null;
        Point2i stackIn_47_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        VehicleDefinition var3 = null;
        RuntimeException var3_ref = null;
        Point2i var4 = null;
        Vector2f var5_ref_in = null;
        int var5 = 0;
        int var6_int = 0;
        float var6_float = 0.0f;
        TrackObject var6 = null;
        Point2i var7 = null;
        float var7_float = 0.0f;
        float var8_float = 0.0f;
        Point2i var8 = null;
        float var9_float = 0.0f;
        Point2i var9 = null;
        float var10_float = 0.0f;
        Point2i var10 = null;
        float var11_float = 0.0f;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        NamedSoundEffect var16 = null;
        int var17 = 0;
        Point2i var7Lifetime1;
        var17 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameCompleted0 = true;
          var3 = param1.definition;
          var4 = this.findVehicleOutsideBounds(param1, 0);
          if (var4 != null) {
            var5_ref_in = new Vector2f(0.0f, 0.0f);
            var6_int = 0;
            while (true) {
              if (var6_int < 10) {
                StraightRoadSegment.closestBoundaryPoint(0, var5_ref_in, this.collisionBoundaryLoops, param1.layer, var4);
                param1.worldY = param1.worldY + var5_ref_in.y;
                param1.worldX = param1.worldX + var5_ref_in.x;
                param1.position.y = (int)param1.worldY;
                param1.position.x = (int)param1.worldX;
                var7 = this.findVehicleOutsideBounds(param1, 0);
                stackIn_47_0 = var7;
                if (var17 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_47_0 != null ||
                  var17 != 0) {
                  var4 = var7;
                  var6_int++;
                  continue;
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              var6_float = -param1.worldX + (float)var4.x;
              param1.field_T = 20;
              var7_float = -param1.worldY + (float)var4.y;
              stackIn_20_0 = (RaceVehicle) (param1);
              stackIn_21_1 = (this.gameMode != 2) && (this.gameMode != 6);
              stackIn_20_0.field_V = stackIn_21_1;
              param1.field_H = param1.getCourseHeading((byte) 45);
              var8_float = (-(var7_float * var5_ref_in.x) + var6_float * var5_ref_in.y) / 3.5f;
              var9_float = param1.angularVelocity * (-var7_float / 3.5f);
              var10_float = var6_float / 3.5f * param1.angularVelocity;
              var11_float = var8_float * (var8_float * var3.mass) + var3.momentOfInertia;
              var12 = var5_ref_in.y * (param1.velocityY + var10_float) + var5_ref_in.x * (param1.velocityX + var9_float);
              if (0.0f > var12) {
                var13 = 0.800000011920929f * param1.getDefenseMultiplier((byte) 114, ReflectionCheckQueue.field_c);
                var14 = -(1.0f + var13) * var12 * var3.momentOfInertia / var11_float;
                param1.velocityX = param1.velocityX + var14 * var5_ref_in.x;
                param1.velocityY = param1.velocityY + var14 * var5_ref_in.y;
                var15 = var12 * (-var8_float * -(var13 + 1.0f)) * var3.mass / var11_float;
                param1.angularVelocity = param1.angularVelocity + var15;
                param1.applyDamage(-var12, 0, (RaceVehicle) null, 0);
                if ((this.raceTicks - 30) > param1.lastCollisionTick) {
                  if (param1.specialPowerup != 2 &&
                    0 >= param1.powerupLevels[2]) {
                    stackIn_34_0 = CheckboxWidget.field_K;
                  } else {
                    stackIn_34_0 = NineSlicePanel.field_h;
                  }
                  var16 = stackIn_34_0;
                  ValidationHelpWidget.a((byte) 113, param1, var16, var16.field_q);
                  param1.lastCollisionTick = this.raceTicks;
                }
                param1.recordCollisionForAiRecovery((byte) 67, (MovingEntity) null);
                if (param1.keyBindings != null) {
                  this.field_rb[7] = -1;
                  this.field_rb[6] = -1;
                  if ((this.field_H & 134217728) == 0) {
                    this.field_N = this.field_N - (this.field_p * this.field_l << 27);
                    this.field_H = this.field_H ^ 134217728;
                  }
                  if ((this.field_H & 16384) == 16384) {
                    this.field_N = this.field_N + (this.field_p * this.field_l << 14);
                    this.field_H = this.field_H ^ 16384;
                  }
                }
              }
              param1.position.x = (int)param1.worldX;
              param1.position.y = (int)param1.worldY;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_47_0 = var4;
          }
          stackIn_51_0 = (stackIn_47_0 == null) ? 0 : 1;
          var5 = stackIn_51_0;
          var6 = (TrackObject) (this.courseObjects.first((byte) 98));
          do {
            if (null == var6) {
              var6 = (TrackObject) (this.dynamicObjects.first((byte) 117));
              break;
            }
            var5 = var5 != 0 | this.handleVehicleObjectCollision((byte) -96, var6, param1) ? 1 : 0;
            var6 = (TrackObject) (this.courseObjects.next((byte) -25));
          } while (var17 == 0);
          while (var6 != null) {
            var5 = var5 != 0 | this.handleVehicleObjectCollision((byte) -109, var6, param1) ? 1 : 0;
            var6 = (TrackObject) (this.dynamicObjects.next((byte) 86));
            if (var17 == 0) {
              continue;
            }
            break;
          }
          var7Lifetime1 = new Point2i(0, 0);
          var8 = new Point2i(0, 0);
          var9 = new Point2i(0, 0);
          var10 = new Point2i(0, 0);
          var7Lifetime1.y = (int)(param1.direction.y * (float)param1.definition.halfLength + ((float)param1.definition.halfWidth * param1.direction.x + param1.worldY));
          var7Lifetime1.x = (int)(-(param1.direction.y * (float)param1.definition.halfWidth) + param1.worldX + param1.direction.x * (float)param1.definition.halfLength);
          var8.x = (int)((float)param1.definition.halfLength * param1.direction.x + (param1.worldX + param1.direction.y * (float)param1.definition.halfWidth));
          var8.y = (int)(-((float)param1.definition.halfWidth * param1.direction.x) + param1.worldY + (float)param1.definition.halfLength * param1.direction.y);
          var9.x = (int)(-((float)param1.definition.halfLength * param1.direction.x) + (-((float)param1.definition.halfWidth * param1.direction.y) + param1.worldX));
          var9.y = (int)(-((float)param1.definition.halfLength * param1.direction.y) + (param1.worldY + (float)param1.definition.halfWidth * param1.direction.x));
          var10.y = (int)(-((float)param1.definition.halfWidth * param1.direction.x) + param1.worldY - param1.direction.y * (float)param1.definition.halfLength);
          var10.x = (int)(-((float)param1.definition.halfLength * param1.direction.x) + (param1.worldX + param1.direction.y * (float)param1.definition.halfWidth));
          var11 = 0;
          if (!this.isInsideCollisionBounds(param1.layer, var7Lifetime1.y, param0, var7Lifetime1.x)) {
            var11++;
          }
          if (!this.isInsideCollisionBounds(param1.layer, var8.y, param0, var8.x)) {
            var11++;
          }
          if (!this.isInsideCollisionBounds(param1.layer, var9.y, true, var9.x)) {
            var11++;
          }
          if (!this.isInsideCollisionBounds(param1.layer, var10.y, param0, var10.x)) {
            var11++;
          }
          boolean decompiledSharedTail0 = (!(this.isInsideCollisionBounds(param1.layer, (int)param1.worldY, true, (int)param1.worldX)) ||
            !(3 > var11));
          if (!decompiledSharedTail0) {
            param1.field_Zb.x = (int)param1.worldX;
            param1.field_db = 0;
            param1.field_Zb.y = (int)param1.worldY;
            decompiledSharedTail0 = (var17 != 0);
          }
          if (decompiledSharedTail0) {
            fieldTemp$0 = param1.field_db + 1;
            param1.field_db = param1.field_db + 1;
            if (fieldTemp$0 > 20) {
              param1.worldY = (float)param1.field_Zb.y;
              param1.worldX = (float)param1.field_Zb.x;
            }
          }
          stackIn_88_0 = var5;
          return stackIn_88_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_92_0 = var3_ref;
          stackIn_92_1 = new StringBuilder().append("sg.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    private final void placePickupRing(int param0, int param1, int param2) {
        float dupTemp$0 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        Point2i var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          var4_float = this.vehicles[0].courseProgress;
          var5 = OutlinedRoadStripRenderer.totalCurveLength(param1, this.roadSegments) / (float)(param2 + 1);
          var6 = (int)var4_float;
          var7 = this.roadSegments[var6].length(50);
          var8 = var7 * ((float)(1 + var6) - var4_float);
          var9 = var5;
          var10 = 0;
          scanLoop1: while (true) {
            stackIn_3_0 = ~var10;
            stackIn_3_1 = ~param2;
            if (stackIn_3_0 > stackIn_3_1) {
              while (true) {
                if (var13 != 0) {
                  return;
                }
                if (var9 > var8) {
                  var6++;
                  stackIn_3_0 = var6;
                  stackIn_3_1 = this.roadSegments.length;
                  if (stackIn_3_0 == stackIn_3_1) {
                    var6 = 0;
                  }
                  var9 = var9 - var8;
                  dupTemp$0 = this.roadSegments[var6].length(50);
                  var7 = dupTemp$0;
                  var8 = dupTemp$0;
                  continue;
                }
                break;
              }
              var8 = var8 - var9;
              var9 = var5;
              var11 = this.roadSegments[var6].pointAt(false, -(var8 / var7) + 1.0f);
              if (param0 == -1) {
                stackIn_21_0 = SolidRoadStripRenderer.b(2, 4);
              } else {
                if (3 != param0) {
                  stackIn_21_0 = 1 + param0;
                } else {
                  stackIn_21_0 = 0;
                }
              }
              var12 = stackIn_21_0;
              this.courseObjects.addLast((byte) -91, new TrackObject(var11, 1 + var12, -1));
              var10++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "sg.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void prepareCourseRendering(CourseDefinition param0, int param1, boolean param2) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        GrowableObjectList var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        GrowableObjectList var5 = null;
        int var6_int = 0;
        GrowableObjectList var6 = null;
        int var7_int = 0;
        GrowableObjectList var7 = null;
        GrowableObjectList var8 = null;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        Point2i var15 = null;
        int var16 = 0;
        var16 = HoldTheLine.field_D;
        try {
          if (this.roadLayerMask == null) {
            this.roadLayerMask = new IndexedSprite(640, 480, 256);
          }
          var4_int = 0;
          while (true) {
            stackIn_7_0 = 4;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_7_0 > var4_int) {
              stackIn_47_0 = 0;
              decompiledFrameRemainder0 = (var16 == 0);
              if (decompiledFrameRemainder0) {
                var5_int = stackIn_47_0;
                while (true) {
                  stackIn_11_0 = ~var5_int;
                  stackIn_11_1 = -5;
                  if (stackIn_11_0 > stackIn_11_1) {
                    stackIn_7_0 = 0;
                    var6_int = stackIn_7_0;
                    while (var6_int < 4) {
                      var7_int = 16 * var6_int + 4 * var5_int + var4_int;
                      this.roadLayerMask.palette[var7_int] = 0;
                      stackIn_11_0 = ~var4_int;
                      stackIn_11_1 = -4;
                      if (stackIn_11_0 != stackIn_11_1) {
                        if (var4_int == 2) {
                          this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 128);
                        }
                      } else {
                        this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 255);
                      }
                      if (var5_int == 3) {
                        this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 65280);
                      } else {
                        if (var5_int == 2) {
                          this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 32768);
                        }
                      }
                      if (3 != var6_int) {
                        if (2 == var6_int) {
                          this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 8388608);
                        }
                      } else {
                        this.roadLayerMask.palette[var7_int] = kc.a(this.roadLayerMask.palette[var7_int], 16711680);
                      }
                      var6_int++;
                    }
                    var5_int++;
                    continue;
                  }
                  break;
                }
                var4_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_47_0 = ~this.courseTheme;
            }
            if (stackIn_47_0 == -4) {
              GrowableStringList.drawCollisionRoadFill(this.roadSegments, 10000536, new RoadLayerMaskRenderer(this.roadLayerMask, (byte) 3));
            }
            if (stackIn_47_0 != -4 ||
              var16 != 0) {
              GrowableStringList.drawCollisionRoadFill(this.roadSegments, 10000536, new RoadLayerMaskRenderer(this.roadLayerMask, (byte) 2));
              mn.a(this.roadSegments, new RoadLayerMaskRenderer(this.roadLayerMask, (byte) 3), (byte) -20);
            }
            TutorialTransition.a(32381);
            if (this.courseImage == null) {
              this.courseImage = new Sprite(640, 480);
            }
            this.courseImage.bindRaster();
            LabeledField.a(this.gameMode, param0, false);
            var4 = new GrowableObjectList();
            if (param1 != 28978) {
              return;
            }
            regionExit1: {
              var5 = new GrowableObjectList();
              var6 = new GrowableObjectList();
              var7 = new GrowableObjectList();
              var8 = new GrowableObjectList();
              TextLineLayout.buildCourseBoundaries(var6, var8, var5, var4, this.roadSegments, var7, -110);
              var5 = NanoTickClock.removeShortBoundaryEdges(var5, (byte) -127);
              var7 = NanoTickClock.removeShortBoundaryEdges(var7, (byte) -127);
              var6 = NanoTickClock.removeShortBoundaryEdges(var6, (byte) -127);
              var8 = NanoTickClock.removeShortBoundaryEdges(var8, (byte) -127);
              this.roadBoundaryLoops = ao.a(var6, (byte) 21, param2, var5);
              this.collisionBoundaryLoops = ao.a(var8, (byte) 21, param2, var7);
              l.a(29824, param0);
              if (3 == this.courseTheme) {
                var9 = OutlinedRoadStripRenderer.totalCurveLength(-1, this.roadSegments);
                var10 = 1 + (int)(var9 / 72.0f);
                this.field_A = var9 / (float)var10;
                var11 = 0.0f;
                var12 = 0;
                this.field_u = new int[var10];
                this.field_w = new int[var10];
                this.field_x = new int[var10];
                this.field_eb = new int[var10];
                var13 = this.roadSegments[0].length(50);
                var14 = 0;
                while (var14 < var10) {
                  while (true) {
                    stackIn_73_0 = compareFloatsNaNHigh(var13, var11);
                    if (var16 != 0) {
                      break regionExit1;
                    }
                    if (stackIn_73_0 < 0) {
                      var11 = var11 - var13;
                      var12++;
                      var13 = this.roadSegments[var12].length(param1 - 28928);
                      continue;
                    }
                    break;
                  }
                  this.field_w[var14] = var12;
                  var15 = this.roadSegments[var12].pointAt(false, var11 / var13);
                  this.field_x[var14] = var15.x;
                  this.field_u[var14] = var15.y;
                  SoftwareRasterizer.fillRectangle(var15.x - 1, -1 + var15.y, 3, 3, 8421504);
                  var11 = var11 + this.field_A;
                  var14++;
                }
              }
              stackIn_73_0 = -1;
            }
            MarkerSliderRenderer.restoreRasterTarget(stackIn_73_0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_78_0 = var4_ref;
          stackIn_78_1 = new StringBuilder().append("sg.QA(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void handleZombieCollision(ZombiePedestrian param0, int param1, RaceVehicle param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param2.collidable &&
            param0.isAlive((byte) -111)) {
            SpriteButtonRenderer.field_q.x = param0.x + 12;
            SpriteButtonRenderer.field_q.y = param0.y + 12;
            var4_int = -param2.position.x + SpriteButtonRenderer.field_q.x;
            var5 = SpriteButtonRenderer.field_q.y - param2.position.y;
            var6 = param2.collisionRadius + 8;
            if ((var6 * var6) <= (var5 * var5 + var4_int * var4_int)) {
              return;
            }
            if (!ArchiveRequest.a(SpriteButtonRenderer.field_q, param2.halfWidth, param2.position, 8, param2.direction, param2.halfLength, 83)) {
              return;
            }
            param2.kills = param2.kills + 1;
            param0.hit(param2, (int)(param2.velocityX * 8192.0f), (byte) 62, (int)(param2.velocityY * 8192.0f));
            if (param1 >= -73) {
              this.roadBoundaryLoops = (GrowableObjectList) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("sg.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    RaceWorld(CourseDefinition param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.initializeRace(param3, param5, param1, (byte) 113, param4, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        navigationUrl = null;
        field_K = "Rocket boost";
        field_Z = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_v = new IntrusiveDeque();
    }

    private static int compareFloatsNaNHigh(float left, float right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
