/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameWorld {
    private boolean field_F;
    private boolean field_A;
    static String field_pb;
    int field_eb;
    private int field_I;
    static String field_Y;
    int field_K;
    private int field_C;
    private int field_ab;
    int field_g;
    private int field_c;
    static Sprite field_x;
    private IntrusiveDeque field_ob;
    private int field_Z;
    static AsyncRequest field_O;
    int field_r;
    private MoveTargetMarker field_b;
    int field_f;
    LevelNavigation navigation;
    int field_nb;
    int field_G;
    private int field_z;
    Camera camera;
    int field_P;
    int field_hb;
    private LevelHud field_gb;
    PowerupBar field_Q;
    int field_q;
    private int field_j;
    private IntrusiveDeque field_T;
    private int field_N;
    int[] field_u;
    private int field_k;
    private boolean field_p;
    private Sprite field_t;
    int field_db;
    private int field_jb;
    private IntrusiveDeque field_v;
    private boolean field_w;
    IntrusiveDeque zombies;
    private int field_U;
    private int[] field_s;
    private int field_B;
    private int field_o;
    int field_h;
    TileMap tileMap;
    private DualLinkDeque field_W;
    IntrusiveDeque field_e;
    SpatialGrid spatialGrid;
    private int field_fb;
    private PcmSampleStream field_L;
    private int field_ib;
    int[] field_J;
    private boolean field_X;
    private boolean field_M;
    private Sprite field_V;
    private IntrusiveDeque field_m;
    private Zombie field_kb;
    int field_bb;
    private int[] field_D;
    private int field_y;
    IntrusiveDeque field_lb;
    private IntrusiveDeque field_d;
    int field_l;
    private IntrusiveDeque field_i;
    private int field_cb;
    private Human field_a;
    private int field_E;

    private final void updateLevelOutcome(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_137_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        QueuedStatSubmission var4_ref_wg = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        LevelResultScreen var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var3Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var2_int = 58 / ((60 - param0) / 46);
          if (this.field_ib != -1) {
            if (this.field_ib != 0) {
              if (1 != this.field_ib &&
                this.field_ib != 2) {
                return;
              }
              this.field_p = false;
              fieldTemp$0 = this.field_cb;
              this.field_cb = this.field_cb - 1;
              if (fieldTemp$0 > 0) {
                return;
              }
              if (this.field_ib == 1) {
                var3 = this.getLevelSlot(86);
                if (var3 == IntroSpeedHelpers.field_b[this.field_bb]) {
                  IntroSpeedHelpers.field_b[this.field_bb] = var3 + 1;
                  if (!(SavedDataRequest.field_j < 2) ||
                    !this.field_F) {
                    var4_ref_wg = new QueuedStatSubmission(this.field_bb, -1 + IntroSpeedHelpers.field_b[this.field_bb], this.field_c, this.field_C, this.field_eb, this.field_Z);
                    if (MeleeHuman.isGuestSession(13296)) {
                      DialogLayer.field_D.addFirst(0, var4_ref_wg);
                      if (var8 != 0) {
                        HighscoreSubmissionHelpers.queueHighscoreSubmission(5, var4_ref_wg, -40);
                      }
                    } else {
                      HighscoreSubmissionHelpers.queueHighscoreSubmission(5, var4_ref_wg, -40);
                    }
                  }
                }
              }
              UiResourceHelpers.switchScreenMusic(false, true, 10);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_41_0 = (this.field_h != -1) ? 0 : 1;
            var3Lifetime1 = stackIn_41_0;
            stackIn_45_0 = (0 < OctaveNoiseMap.field_j) ? 0 : 1;
            var4 = stackIn_45_0;
            var6_int = 0;
            while (true) {
              if (3 > var6_int) {
                stackIn_62_0 = -1;
                if (var8 == 0) {
                  if (stackIn_62_0 > ~this.field_u[var6_int] &&
                    this.field_J[var6_int] == 0 &&
                    !this.field_gb.isQuotaReached(true)) {
                    Blast.handleTutorialEvent(-8, 6836);
                  }
                  var6_int++;
                  continue;
                }
              } else {
                stackIn_62_0 = 0;
              }
              break;
            }
            var5 = stackIn_62_0;
            if (HighscoresScreen.field_q >= 500) {
              var5 = 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if ((var3Lifetime1 == 0) &&
              (decompiledFrameRemainder0 = (this.field_gb.hasNoZombiesLeft(16954) ||
              this.field_gb.isQuotaReached(true)))) {
              var5 = 1;
            }
            if ((decompiledFrameRemainder0) &&
              (var3Lifetime1 != 0 ||
              var8 != 0)) {
              if ((this.field_q == 0 ||
                2 == this.field_q) &&
                (this.field_gb.isQuotaReached(true) ||
                this.field_gb.isTimeUp(16284))) {
                var5 = 1;
              }
              if (this.field_q == 1 &&
                this.field_gb.field_k == 0) {
                var5 = 1;
              }
              if (AchievementSubmission.field_i &&
                CivilianHuman.field_wb) {
                var5 = 1;
              }
              if ((4 == this.field_q ||
                this.field_q == 5) &&
                this.field_gb.isTimeUp(16284)) {
                var5 = 1;
              }
              if (6 == this.field_q && (this.field_gb.isTimeUp(16284) ||
                this.field_gb.field_k == 0)) {
                var5 = 1;
              }
            }
            if (var5 != 0) {
              var6 = (LevelResultScreen) (SweepingSpotlight.getScreen(10, 94));
              var7 = this.field_gb.field_k;
              if (var3Lifetime1 != 0) {
                if (1 != this.field_q &&
                  this.field_q != 6) {
                  if (this.field_q == 5) {
                    var7 = this.field_nb;
                    if (var8 != 0) {
                      var7 = this.field_gb.field_b;
                    }
                  }
                } else {
                  var7 = this.field_gb.field_b;
                }
              }
              this.saveLevelResult(true);
              var6.showLevelResult(this.field_G, this.field_q, this.field_gb.getTimerSeconds((byte) 117), (byte) -101, var7, this.field_gb.isQuotaReached(true), var3Lifetime1 != 0, var4 != 0);
              if (!AchievementSubmission.field_i) {
                MusicCrossfadeStream.playMusicTrack(100, false, ArchiveProvider.field_a[5]);
              }
              this.field_cb = 60;
              if (var3Lifetime1 == 0 &&
                !this.field_gb.isQuotaReached(true)) {
                stackIn_137_1 = 2;
              } else {
                stackIn_137_1 = 1;
              }
              this.field_ib = stackIn_137_1;
              if (this.field_ib == 1) {
                if (this.field_P == 250 &&
                  this.field_q == 0 &&
                  this.field_h == -1) {
                  this.awardAchievement(252, 3, (byte) -23);
                }
                if (this.field_gb.field_k >= 400 &&
                  this.field_q == 4 &&
                  this.field_h == -1) {
                  this.awardAchievement(239, 16, (byte) -23);
                }
                if (~this.field_f == ~this.field_P &&
                  this.field_q == 2 &&
                  -1 == this.field_h) {
                  this.awardAchievement(250, 5, (byte) -23);
                }
                if (this.field_q == 0 &&
                  5 == this.field_h) {
                  this.awardAchievement(247, 8, (byte) -23);
                }
                if (1 == this.field_q &&
                  this.field_h == 5 &&
                  this.field_y <= 7 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(246, 9, (byte) -23);
                }
                if (this.field_q == 2 &&
                  this.field_h == 5 &&
                  this.field_y <= 14 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(245, 10, (byte) -23);
                }
                if (this.field_q == 3 &&
                  5 == this.field_h &&
                  this.field_y <= 21 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(244, 11, (byte) -23);
                }
                if (this.field_q == 4 &&
                  5 == this.field_h &&
                  this.field_y <= 28 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(230, 25, (byte) -23);
                }
                if (this.field_q == 5 &&
                  this.field_h == 5 &&
                  this.field_y <= 35 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(229, 26, (byte) -23);
                }
                if (this.field_q == 6 &&
                  this.field_h == 5 &&
                  this.field_y <= 42 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(228, 27, (byte) -23);
                }
                if (7 == this.field_q &&
                  this.field_h == 5 &&
                  this.field_y <= 49 &&
                  NameCharacterHelpers.field_a) {
                  this.awardAchievement(227, 28, (byte) -23);
                }
              }
            }
            if (var8 == 0) {
              return;
            }
          }
          if (!this.camera.field_d) {
            this.field_ib = 0;
            Blast.handleTutorialEvent(-1, 6836);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.C(" + param0 + ')');
        }
    }

    private final void spawnEnemyReinforcement(boolean param0, Zombie param1) {
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        Path var4_ref_qh = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0) {
            return;
          }
          if (this.field_q == 6) {
            if (this.field_h == 3) {
              boolean decompiledSharedTail0 = (2 != param1.field_fb);
              if (!decompiledSharedTail0) {
                var3 = this.spawnZombie(80, (byte) 121, 180, 104, 694);
                ((Zombie) (var3)).field_gb = 30;
                ((Zombie) (var3)).field_fb = param1.field_fb;
                decompiledSharedTail0 = (var5 != 0);
              }
              if (decompiledSharedTail0) {
                var3 = this.spawnZombie(80, (byte) 124, 110, 1610, 150);
                ((Zombie) (var3)).field_gb = 30;
                ((Zombie) (var3)).field_fb = param1.field_fb;
              }
              this.field_gb.recountUnits((byte) -106);
              if (var5 == 0) {
                return;
              }
            }
            if (this.field_h != 4) {
              if (this.field_h != 5) {
                return;
              }
              var3 = this.spawnZombie(30, (byte) 126, 20, 1440, 400);
              var4_ref_qh = new Path();
              var4_ref_qh.addFirst(0, new Point(((Zombie) (var3)).getX(true) - 400, ((Zombie) (var3)).getY(237239984)));
              ((Zombie) (var3)).setPath(var4_ref_qh, true);
              ((Zombie) (var3)).field_fb = 2;
              this.field_gb.recountUnits((byte) -106);
              if (var5 == 0) {
                return;
              }
            }
            var3 = null;
            var4 = param1.field_fb;
            if (var4 == 1 &&
              var5 == 0) {
              var3 = this.spawnZombie(200, (byte) 126, 70, 350, 150);
            } else if (var4 == 2 &&
              var5 == 0) {
              var3 = this.spawnZombie(20, (byte) 120, 100, 650, 370);
            } else {
              if (var4 == 3) {
                var3 = this.spawnZombie(20, (byte) 123, 100, 720, 60);
              }
            }
            if (var3 != null) {
              ((Zombie) (var3)).field_fb = param1.field_fb;
              ((Zombie) (var3)).field_gb = 30;
            }
            this.field_gb.recountUnits((byte) -106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("hi.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final void awardAchievement(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4Lifetime1;
        int var5Lifetime1;
        try {
          if (NameCharacterHelpers.isBitSet(param1, Js5Archive.field_i, -88)) {
            return;
          }
          var4 = Js5Archive.field_i;
          var5 = param1;
          var4[var5 >> 5] = GameWorld.intOr(var4[var5 >> 5], 1 << TextHotspotRegion.bitAnd(31, var5));
          var4Lifetime1 = PasswordValidator.field_g;
          var5Lifetime1 = param1;
          if (param2 != -23) {
            this.field_q = -95;
          }
          var4Lifetime1[var5Lifetime1 >> 5] = GameWorld.intOr(var4Lifetime1[var5Lifetime1 >> 5], 1 << TextHotspotRegion.bitAnd(31, var5Lifetime1));
          this.field_ob.addFirst(0, new AchievementBanner(param1));
          if (!this.field_F) {
            Point.field_j.addFirst(0, new AchievementSubmission(param1, param0, this.field_c, this.field_C, this.field_eb, this.field_Z));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void onNavigationRebuilt(boolean param0) {
        RuntimeException runtimeException = null;
        WorldObject var2 = null;
        HunterHuman var3 = null;
        PatrollingGuard var3_ref = null;
        Zombie var3_ref2 = null;
        int var4 = 0;
        IntrusiveDeque stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          var2 = (WorldObject) (this.zombies.last((byte) 26));
          if (!param0) {
            return;
          }
          while (null != var2) {
            if (var4 != 0) {
              return;
            }
            if (!(var2 instanceof Zombie)) {
              if (var2 instanceof HunterHuman) {
                var3 = (HunterHuman) (var2);
                var3.tick(107);
              } else if (var2 instanceof PatrollingGuard) {
                var3_ref = (PatrollingGuard) (var2);
                var3_ref.updateBehaviour((byte) 52);
              }
            } else {
              var3_ref2 = (Zombie) (var2);
              if (var3_ref2.field_fb > 0) {
                var3_ref2.field_gb = SpriteEffectHelpers.randomInt(var3_ref2.field_sb);
              }
              var3_ref2.repathToGoal((byte) 82);
              if (!var3_ref2.isBusy((byte) 25)) {
                var3_ref2.followNextWaypoint(-124);
              }
            }
            stackIn_27_0 = this.zombies;
            stackIn_28_1 = !(param0);
            var2 = (WorldObject) (((IntrusiveDeque) (Object) stackIn_27_0).previous(stackIn_28_1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.BB(" + param0 + ')');
        }
    }

    final boolean hasRestartsLeft(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25983) {
            this.field_d = (IntrusiveDeque) null;
          }
          stackIn_7_0 = !(ArrayWidgetContainer.field_y <= 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.B(" + param0 + ')');
        }
    }

    final void update(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_29_0 = 0;
        Camera stackIn_39_0 = null;
        boolean stackIn_42_1 = false;
        boolean stackIn_49_2 = false;
        boolean stackIn_59_3 = false;
        int stackIn_63_4;
        boolean stackIn_66_5;
        boolean stackIn_79_0 = false;
        int stackIn_92_0 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_78_0;
        boolean stackOut_122_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (!this.field_X) {
            this.initializeLevel(false);
            return;
          }
          this.field_Z = this.field_Z + 1;
          this.field_eb = this.field_eb + this.field_c;
          if (this.field_r > 0) {
            fieldTemp$0 = this.field_r - 1;
            this.field_r = this.field_r - 1;
            if (fieldTemp$0 <= 0) {
              Js5Transport.stopSoundEffect((byte) 13, this.field_L);
            }
            if (this.field_r % 32 == 0) {
              this.navigation.startWaypointGraphBuild(true, 33);
            }
          }
          this.updateHover((byte) -127);
          this.handleInput((byte) -115);
          GooPuddle.flickerLightRadius((byte) 93);
          this.field_b.update(param0);
          if (this.field_p) {
            this.field_Q.updateHover(-1, -1, true);
            if (var7 != 0) {
              this.field_Q.updateHover(FadingModalPanel.field_K, KeyStateHelpers.field_b, true);
            }
          } else {
            this.field_Q.updateHover(FadingModalPanel.field_K, KeyStateHelpers.field_b, true);
          }
          if (!FadingModalPanel.updateTutorialTipState(param0 ^ 123) &&
            param1) {
            stackIn_29_0 = 0;
          } else {
            stackIn_29_0 = 1;
          }
          var3_int = stackIn_29_0;
          var4 = this.camera.x;
          var5 = this.camera.y;
          if (!param1) {
            this.camera.updateScrolling(false, false, false, (byte) -87, false, false);
          }
          if (param1 ||
            var7 != 0) {
            stackIn_39_0 = this.camera;
            stackIn_42_1 = (AchievementSubmission.field_p[99]) || (AchievementSubmission.field_p[AddressHintGlobals.field_e]);
            stackIn_49_2 = (AchievementSubmission.field_p[98]) || (AchievementSubmission.field_p[TextWidgetPainter.field_d]);
            boolean decompiledFrameRemainder1 = true;
            if (!AchievementSubmission.field_p[96] && (!AchievementSubmission.field_p[ValidatedTextWidget.field_P] ||
              AchievementSubmission.field_p[82])) {
              stackIn_59_3 = false;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_59_3 = true;
            }
            stackIn_63_4 = -48;
            stackIn_66_5 = (AchievementSubmission.field_p[97]) || (AchievementSubmission.field_p[ArrivingPassenger.field_Gb]);
            ((Camera) (Object) stackIn_39_0).updateScrolling(stackIn_42_1, stackIn_49_2, stackIn_59_3, (byte) stackIn_63_4, stackIn_66_5, AchievementSubmission.field_p[81]);
          }
          if (AchievementSubmission.field_i &&
            this.field_ib != -1 &&
            var3_int == 0) {
            this.camera.x = var4;
            this.camera.y = var5;
            var6 = 0;
            do {
              boolean decompiledFrameRemainder3 = true;
              if (this.field_A) {
                stackOut_78_0 = param1;
                stackIn_92_0 = stackOut_78_0 ? 1 : 0;
                stackIn_79_0 = stackOut_78_0;
                decompiledFrameRemainder3 = (var7 == 0);
                if ((decompiledFrameRemainder3) && (stackIn_79_0 &&
                  AchievementSubmission.field_p[80])) {
                  if (AchievementSubmission.field_p[81]) {
                    stackIn_92_0 = 16;
                  } else {
                    stackIn_92_0 = 8;
                  }
                  decompiledFrameRemainder3 = false;
                }
              }
              if (decompiledFrameRemainder3) {
                stackIn_92_0 = 1;
              }
              if (stackIn_92_0 <= var6) {
                break;
              }
              CheckboxPainter.updateCutscene(this.camera, this.field_gb, -91);
              var6++;
            } while (var7 == 0);
          }
          if (this.field_p &&
            1 == LaserBarrier.field_R) {
            this.field_B = this.field_B - (-var4 + this.camera.x);
            this.field_j = this.field_j - (this.camera.y - var5);
            if (this.field_B == -1) {
              this.field_B = this.field_B - 1;
            }
          }
          if (null != this.field_ob.last((byte) 26)) {
            fieldTemp$1 = this.field_z + 1;
            this.field_z = this.field_z + 1;
            if (fieldTemp$1 >= 335) {
              this.field_z = 0;
              this.field_ob.removeLast(62);
            }
          }
          if (this.field_h == -1 &&
            this.field_q == 1) {
            this.updateRoadCrossing(115);
          }
          this.navigation.field_A.updateAnimatedTileFrames(0, false);
          ObstacleFactory.removeFinishedSounds(0);
          if (var3_int == 0) {
            var6 = 0;
            do {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder2 = true;
              if (this.field_A) {
                stackOut_122_0 = param1;
                stackIn_137_0 = stackOut_122_0 ? 1 : 0;
                stackIn_123_0 = stackOut_122_0;
                decompiledFrameRemainder0 = (var7 == 0);
                if ((decompiledFrameRemainder0) && (stackIn_123_0 &&
                  AchievementSubmission.field_p[80])) {
                  if (AchievementSubmission.field_p[81]) {
                    stackIn_136_0 = 16;
                  } else {
                    stackIn_136_0 = 8;
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0)) {
                stackIn_136_0 = 1;
              }
              if (decompiledFrameRemainder0) {
                stackIn_137_0 = ~stackIn_136_0;
              }
              if (stackIn_137_0 >= ~var6) {
                break;
              }
              this.tickWorld((byte) 93);
              var6++;
            } while (var7 == 0);
          }
          if (0 < this.field_N && (0 == this.field_ib ||
            this.field_ib == -1 &&
            (double)this.camera.field_e > 0.95)) {
            this.field_N = this.field_N - 15;
          }
          this.updateLevelOutcome((byte) 125);
          SpriteEffectHelpers.sortByDepth(this.zombies);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "hi.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void startLevel(TileMap param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_X = false;
          if (param1 != -99) {
            return;
          }
          this.tileMap = param0;
          this.initializeLevel(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("hi.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void slowMoversInRadius(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        WorldObject var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          EmptyWidgetPainter.queueSoundEffect(78, false);
          if (!param2) {
            return;
          }
          var5_int = param1 >> 7;
          var6 = param0 >> 7;
          var7 = param3 * param3;
          var8 = (WorldObject) (this.spatialGrid.firstObjectNear((param3 >> 7) + 1, var6, 29845, var5_int));
          while (var8 != null) {
            if (var11 != 0) {
              return;
            }
            if (var8 instanceof Mover) {
              var9 = -param1 + var8.getX(true);
              var10 = var8.getY(237239984) - param0;
              if (var7 > (var9 * var9 + var10 * var10)) {
                ((Mover) (var8)).applySlowdown((byte) 126, 1000);
              }
            }
            var8 = (WorldObject) (this.spatialGrid.nextQueryObject(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void selectZombiesInRect(int param0, int param1, int param2, int param3, int param4) {
        IntrusiveNode var6 = null;
        Zombie var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = ZombieDawn.field_J;
        try {
          if (AchievementSubmission.field_i) {
            return;
          }
          if (param3 < 31) {
            this.triggerQuake((byte) 105);
          }
          var6 = this.zombies.last((byte) 26);
          while (var6 instanceof WorldObject) {
            if (var8 != 0) {
              return;
            }
            if (var6 instanceof Zombie) {
              var7 = (Zombie) (var6);
              if (var7.isPlayerOwned((byte) -126)) {
                var7.field_qb = false;
                if (var7.isInsideRect(param1, param4, param2, param0, false)) {
                  this.field_W.addLast(var7, (byte) -123);
                  var7.select(-31340);
                }
              }
            }
            var6 = var6.previous;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var6_ref), "hi.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final Zombie spawnZombie(int param0, byte param1, int param2, int param3, int param4) {
        Zombie var6 = null;
        RuntimeException var6_ref = null;
        Zombie stackIn_2_0 = null;
        Zombie stackIn_6_0;
        Zombie stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        Zombie stackIn_7_0;
        Zombie stackIn_7_1;
        boolean stackIn_7_4;
        Zombie stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 119) {
            stackIn_2_0 = (Zombie) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = param3 + GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, param2, 1);
          stackIn_6_3 = param4 + GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, param0, 1);
          if (GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 2, 1) != 1) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = false;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = true;
          }
          var6 = new Zombie(stackIn_6_2, stackIn_6_3, stackIn_7_4, 0);
          var6.field_gb = 500;
          this.zombies.addFirst(0, var6);
          this.field_gb.recountUnits((byte) -106);
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var6_ref), "hi.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void addGooPuddle(int param0, int param1, int param2) {
        try {
          this.field_lb.addFirst(0, new GooPuddle(param0, param2));
          if (param1 != 54) {
            field_O = (AsyncRequest) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void openSubscribePage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 < 117) {
                GameWorld.releaseStatics(true);
              }
              param0.getAppletContext().showDocument(PendingRecordRequest.appendSessionParameters(-1, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("hi.F(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void drawRain(int param0) {
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = 1 * WorldObject.cosFixed(1311979239, (int)(MusicCrossfadeStream.field_p << 1)) + 2 * DropTargetWidget.cosine(true, (int)(MusicCrossfadeStream.field_p >> 1)) >> 16;
          var3 = (-this.camera.x + (-1 + (int)MusicCrossfadeStream.field_p * WhirlpoolHasher.field_e)) % 1337;
          var4 = var3 / WhirlpoolHasher.field_e;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(DropdownList.field_P > var4)))) {
            stackIn_14_0 = (5 * var4 + var3 * 3) % 9;
            if (var6 == 0) {
              if (stackIn_14_0 == 0) {
                Rasterizer.drawLine(var3, var4, var2_int + var3 - 3, -7 + var4, 6715272);
              }
              var3 += 939;
              if (var3 <= WhirlpoolHasher.field_e) {
                continue;
              }
              var4 = var4 + var3 / WhirlpoolHasher.field_e;
              var3 = var3 % WhirlpoolHasher.field_e;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var3 = ((int)MusicCrossfadeStream.field_p * WhirlpoolHasher.field_e - 1 - this.camera.x) % 917;
            stackIn_14_0 = var3 / WhirlpoolHasher.field_e;
          }
          var4Lifetime1 = stackIn_14_0;
          while (true) {
            if (!(DropdownList.field_P > var4Lifetime1)) {
              var4Lifetime1 = -54 / ((-32 - param0) / 46);
              var3 = (-this.camera.x - 1 + (int)MusicCrossfadeStream.field_p * WhirlpoolHasher.field_e) % 593;
              stackIn_27_0 = var3 / WhirlpoolHasher.field_e;
              break;
            }
            stackIn_27_0 = (2 * var3 + 4 * var4Lifetime1) % 7;
            if (var6 == 0) {
              if (stackIn_27_0 == 0) {
                Rasterizer.drawLine(var3, var4Lifetime1, var2_int + (var3 - 3), var4Lifetime1 - 5, 3364192);
              }
              var3 += 547;
              if (WhirlpoolHasher.field_e >= var3) {
                continue;
              }
              var4Lifetime1 = var4Lifetime1 + var3 / WhirlpoolHasher.field_e;
              var3 = var3 % WhirlpoolHasher.field_e;
              continue;
            }
            break;
          }
          var5 = stackIn_27_0;
          while (DropdownList.field_P > var5) {
            if (var6 != 0) {
              return;
            }
            if ((4 * var5 + var3 * 2) % 7 == 0) {
              Rasterizer.drawLine(var3, var5, var3 - 4 + var2_int, -7 + var5, 5461344);
            }
            var3 += 375;
            if (var3 <= WhirlpoolHasher.field_e) {
              continue;
            }
            var5 = var5 + var3 / WhirlpoolHasher.field_e;
            var3 = var3 % WhirlpoolHasher.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.W(" + param0 + ')');
        }
    }

    final int getLevelSlot(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 37 / ((param0 - 28) / 37);
          stackIn_3_0 = 7 * (this.field_q % 4);
          if (this.field_h != -1) {
            stackIn_4_1 = this.field_h;
          } else {
            stackIn_4_1 = 6;
          }
          stackIn_5_0 = stackIn_3_0 + stackIn_4_1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.Q(" + param0 + ')');
        }
    }

    private final void configureThemeTiles(int param0, int param1) {
        int stackIn_42_0;
        int stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        int stackIn_43_4 = 0;
        int stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_47_4 = 0;
        int stackIn_50_0;
        int stackIn_50_1;
        int stackIn_50_2;
        int stackIn_50_3;
        int stackIn_51_4 = 0;
        int stackIn_54_0;
        int stackIn_54_1;
        int stackIn_54_2;
        int stackIn_54_3;
        int stackIn_55_4 = 0;
        int stackIn_58_0;
        int stackIn_58_1;
        int stackIn_58_2;
        int stackIn_58_3;
        int stackIn_59_4 = 0;
        int stackIn_62_0;
        int stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_63_4 = 0;
        int stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_67_4 = 0;
        int stackIn_70_0;
        int stackIn_70_1;
        int stackIn_70_2;
        int stackIn_70_3;
        int stackIn_71_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var12 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameRemainder0 = true;
          BulletCasing.clearAnimatedTiles((byte) 40);
          MeleeHuman.selectLevelResources(-1, param1);
          if (param1 != 0) {
            if (param1 != 1) {
              if (param1 != 2) {
                if ((param1 != 3) &&
                  (decompiledFrameRemainder0 = (param1 != 4))) {
                  if (param1 == 5) {
                    QuickChatPhraseCache.appendSubstitutedObjectId(397, (byte) -118);
                    QuickChatPhraseCache.appendSubstitutedObjectId(414, (byte) -116);
                    QuickChatPhraseCache.appendSubstitutedObjectId(415, (byte) -84);
                    QuickChatPhraseCache.appendSubstitutedObjectId(413, (byte) -83);
                    QuickChatPhraseCache.appendSubstitutedObjectId(430, (byte) -127);
                    QuickChatPhraseCache.appendSubstitutedObjectId(431, (byte) -105);
                    QuickChatPhraseCache.appendSubstitutedObjectId(429, (byte) -68);
                    SoundEffectNode.addObjectSubstitution(413, (byte) -77, true, 429);
                    SoundEffectNode.addObjectSubstitution(397, (byte) -77, true, 430);
                    SoundEffectNode.addObjectSubstitution(414, (byte) -77, true, 430);
                    SoundEffectNode.addObjectSubstitution(415, (byte) -77, true, 431);
                    QuickChatPhraseCache.appendSubstitutedObjectId(69, (byte) -79);
                    QuickChatPhraseCache.appendSubstitutedObjectId(68, (byte) -109);
                    SoundEffectNode.addObjectSubstitution(68, (byte) -77, false, 343);
                    SoundEffectNode.addObjectSubstitution(69, (byte) -77, false, 343);
                    var3_int = 16;
                    var4 = 2;
                    var5 = 1;
                    var6 = 22;
                    var7 = ArchiveRequest.sqrtFixed(131072, -80) >> 2;
                    var8 = 16384;
                    var8 = var8 << 1;
                    var9 = 18432;
                    var7 = var7 << 1;
                    var5Lifetime1 = 8 + var3_int;
                    var9 = var9 << 1;
                    var4Lifetime1 = 1;
                    TrafficVehicle.addAnimatedTileDefinition(var5Lifetime1 + 2, (byte) -23, var6, 0, var4Lifetime1 + (var5Lifetime1 + 2), -var7, var3_int - 0);
                    TrafficVehicle.addAnimatedTileDefinition(4 + var5Lifetime1, (byte) -23, var6, var8, var4Lifetime1 + (4 + var5Lifetime1), -var8, var3_int + 1);
                    TrafficVehicle.addAnimatedTileDefinition(0 + var5Lifetime1, (byte) -23, var6, var7, var4Lifetime1 + var5Lifetime1 + 0, 0, var3_int + 2);
                    TrafficVehicle.addAnimatedTileDefinition(6 + var5Lifetime1, (byte) -23, var6, var8, var5Lifetime1 + (6 + var4Lifetime1), var8, 3 + var3_int);
                    TrafficVehicle.addAnimatedTileDefinition(var4Lifetime1 + (2 + var5Lifetime1), (byte) -23, var6, 0, var5Lifetime1 + 2, var7, 4 + var3_int);
                    TrafficVehicle.addAnimatedTileDefinition(var4Lifetime1 + var5Lifetime1 + 4, (byte) -23, var6, -var8, var5Lifetime1 + 4, var8, 5 + var3_int);
                    TrafficVehicle.addAnimatedTileDefinition(0 + var5Lifetime1 + var4Lifetime1, (byte) -23, var6, -var7, var5Lifetime1 - 0, 0, var3_int + 6);
                    TrafficVehicle.addAnimatedTileDefinition(var4Lifetime1 + (var5Lifetime1 + 6), (byte) -23, var6, -var8, var5Lifetime1 + 6, -var8, 7 + var3_int);
                    var3_int += 32;
                    var10 = 0;
                    TrafficVehicle.addAnimatedTileDefinition(-16 + var10 + var3_int, (byte) -23, var6, var9, var10 + (var3_int - 16) + 1, -var8, var10 + var3_int);
                    var10Lifetime1 = 1;
                    TrafficVehicle.addAnimatedTileDefinition(-17 + var3_int + var10Lifetime1, (byte) -23, var6, -var8, var10Lifetime1 + var3_int - 16, var9, var10Lifetime1 + var3_int);
                    var10Lifetime2 = 2;
                    TrafficVehicle.addAnimatedTileDefinition(-16 + (var10Lifetime2 + var3_int), (byte) -23, var6, var8, 1 + var3_int + (var10Lifetime2 - 16), -var9, var3_int + var10Lifetime2);
                    var10Lifetime3 = 3;
                    TrafficVehicle.addAnimatedTileDefinition(var3_int - (-var10Lifetime3 + 17), (byte) -23, var6, -var9, -16 + (var3_int + var10Lifetime3), var8, var3_int + var10Lifetime3);
                    var10Lifetime4 = 4;
                    TrafficVehicle.addAnimatedTileDefinition(-16 + var10Lifetime4 + var3_int, (byte) -23, var6, var8, 1 + var3_int - (-var10Lifetime4 + 16), var9, var3_int + var10Lifetime4);
                    var10Lifetime5 = 5;
                    TrafficVehicle.addAnimatedTileDefinition(var3_int + var10Lifetime5 - 17, (byte) -23, var6, -var9, -16 + (var3_int + var10Lifetime5), -var8, var3_int + var10Lifetime5);
                    var10Lifetime6 = 6;
                    TrafficVehicle.addAnimatedTileDefinition(var3_int + var10Lifetime6 - 16, (byte) -23, var6, var9, 1 + (-16 + var10Lifetime6 + var3_int), var8, var3_int + var10Lifetime6);
                    var10Lifetime7 = 7;
                    TrafficVehicle.addAnimatedTileDefinition(-17 + var3_int + var10Lifetime7, (byte) -23, var6, -var8, var3_int + (var10Lifetime7 - 16), -var9, var10Lifetime7 + var3_int);
                    var11 = 150;
                    while (true) {
                      if (var11 < 180) {
                        ValidationStatusIcon.appendUnlockedId((byte) 9, var11);
                        var11++;
                        if (var12 == 0) {
                          continue;
                        }
                      } else {
                        ValidationStatusIcon.appendUnlockedId((byte) 9, 155);
                        ValidationStatusIcon.appendUnlockedId((byte) 9, 156);
                        ValidationStatusIcon.appendUnlockedId((byte) 9, 157);
                        ValidationStatusIcon.appendUnlockedId((byte) 9, 169);
                        ValidationStatusIcon.appendUnlockedId((byte) 9, 170);
                      }
                      break;
                    }
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (param1 != 6) {
                      if ((param1 != 7) &&
                        (decompiledFrameRemainder0 = (param1 == 8))) {
                        SoundEffectNode.addObjectSubstitution(184, (byte) -77, false, 200);
                        QuickChatPhraseCache.appendSubstitutedObjectId(184, (byte) -113);
                        QuickChatPhraseCache.appendSubstitutedObjectId(185, (byte) -111);
                        QuickChatPhraseCache.appendSubstitutedObjectId(186, (byte) -103);
                        QuickChatPhraseCache.appendSubstitutedObjectId(187, (byte) -115);
                        QuickChatPhraseCache.appendSubstitutedObjectId(200, (byte) -126);
                        SoundEffectNode.addObjectSubstitution(323, (byte) -77, false, 416);
                        SoundEffectNode.addObjectSubstitution(324, (byte) -77, false, 406);
                        SoundEffectNode.addObjectSubstitution(325, (byte) -77, false, 417);
                        QuickChatPhraseCache.appendSubstitutedObjectId(323, (byte) -118);
                        QuickChatPhraseCache.appendSubstitutedObjectId(324, (byte) -104);
                        QuickChatPhraseCache.appendSubstitutedObjectId(325, (byte) -113);
                        QuickChatPhraseCache.appendSubstitutedObjectId(416, (byte) -123);
                        QuickChatPhraseCache.appendSubstitutedObjectId(417, (byte) -85);
                        SoundEffectNode.addObjectSubstitution(260, (byte) -77, false, 407);
                        QuickChatPhraseCache.appendSubstitutedObjectId(260, (byte) -105);
                        QuickChatPhraseCache.appendSubstitutedObjectId(407, (byte) -72);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        stackIn_42_0 = 499;
                        stackIn_42_1 = 481;
                        stackIn_42_2 = 1;
                        stackIn_42_3 = -101;
                        if (this.field_h != -1) {
                          stackIn_43_4 = 0;
                        } else {
                          stackIn_43_4 = -1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_43_4);
                        stackIn_46_0 = 499;
                        stackIn_46_1 = 483;
                        stackIn_46_2 = 1;
                        stackIn_46_3 = -100;
                        if (-1 != this.field_h) {
                          stackIn_47_4 = 1;
                        } else {
                          stackIn_47_4 = -1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_47_4);
                        stackIn_50_0 = 499;
                        stackIn_50_1 = 485;
                        stackIn_50_2 = 1;
                        stackIn_50_3 = -110;
                        if (-1 != this.field_h) {
                          stackIn_51_4 = 2;
                        } else {
                          stackIn_51_4 = -1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_50_0, stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_51_4);
                        stackIn_54_0 = 499;
                        stackIn_54_1 = 487;
                        stackIn_54_2 = 1;
                        stackIn_54_3 = -114;
                        if (-1 == this.field_h) {
                          stackIn_55_4 = -1;
                        } else {
                          stackIn_55_4 = 3;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_54_0, stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_55_4);
                        stackIn_58_0 = 497;
                        stackIn_58_1 = 482;
                        stackIn_58_2 = 2;
                        stackIn_58_3 = param0 - 130;
                        if (this.field_h == -1) {
                          stackIn_59_4 = -1;
                        } else {
                          stackIn_59_4 = 0;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_58_0, stackIn_58_1, stackIn_58_2, stackIn_58_3, stackIn_59_4);
                        stackIn_62_0 = 497;
                        stackIn_62_1 = 484;
                        stackIn_62_2 = 2;
                        stackIn_62_3 = -96;
                        if (this.field_h == -1) {
                          stackIn_63_4 = -1;
                        } else {
                          stackIn_63_4 = 1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_62_0, stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_63_4);
                        stackIn_66_0 = 497;
                        stackIn_66_1 = 486;
                        stackIn_66_2 = 2;
                        stackIn_66_3 = param0 ^ -125;
                        if (-1 != this.field_h) {
                          stackIn_67_4 = 2;
                        } else {
                          stackIn_67_4 = -1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_67_4);
                        stackIn_70_0 = 497;
                        stackIn_70_1 = 488;
                        stackIn_70_2 = 2;
                        stackIn_70_3 = param0 - 131;
                        if (this.field_h != -1) {
                          stackIn_71_4 = 3;
                        } else {
                          stackIn_71_4 = -1;
                        }
                        ArmedHuman.registerSpecialTile(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_70_3, stackIn_71_4);
                        HighscoreRequest.setAlienTileId(510, (byte) -75);
                        QuickChatPhraseCache.appendSubstitutedObjectId(472, (byte) -91);
                        QuickChatPhraseCache.appendSubstitutedObjectId(473, (byte) -120);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      TrafficVehicle.addAnimatedTileDefinition(48, (byte) -23, 10, 0, 54, 0, 55);
                      TrafficVehicle.addAnimatedTileDefinition(56, (byte) -23, 10, 0, 62, 0, 63);
                      QuickChatPhraseCache.appendSubstitutedObjectId(329, (byte) -126);
                      SoundEffectNode.addObjectSubstitution(329, (byte) -77, false, 330);
                      decompiledFrameRemainder0 = (var12 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  QuickChatPhraseCache.appendSubstitutedObjectId(163, (byte) -108);
                  QuickChatPhraseCache.appendSubstitutedObjectId(164, (byte) -70);
                  QuickChatPhraseCache.appendSubstitutedObjectId(165, (byte) -69);
                  QuickChatPhraseCache.appendSubstitutedObjectId(213, (byte) -108);
                  QuickChatPhraseCache.appendSubstitutedObjectId(214, (byte) -89);
                  QuickChatPhraseCache.appendSubstitutedObjectId(215, (byte) -69);
                  SoundEffectNode.addObjectSubstitution(163, (byte) -77, true, 213);
                  SoundEffectNode.addObjectSubstitution(164, (byte) -77, true, 214);
                  SoundEffectNode.addObjectSubstitution(165, (byte) -77, true, 215);
                  QuickChatPhraseCache.appendSubstitutedObjectId(230, (byte) -124);
                  QuickChatPhraseCache.appendSubstitutedObjectId(246, (byte) -74);
                  SoundEffectNode.addObjectSubstitution(230, (byte) -77, false, 246);
                  QuickChatPhraseCache.appendSubstitutedObjectId(247, (byte) -72);
                  QuickChatPhraseCache.appendSubstitutedObjectId(263, (byte) -126);
                  SoundEffectNode.addObjectSubstitution(247, (byte) -77, false, 263);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                QuickChatPhraseCache.appendSubstitutedObjectId(132, (byte) -89);
                QuickChatPhraseCache.appendSubstitutedObjectId(133, (byte) -95);
                QuickChatPhraseCache.appendSubstitutedObjectId(70, (byte) -111);
                QuickChatPhraseCache.appendSubstitutedObjectId(264, (byte) -104);
                QuickChatPhraseCache.appendSubstitutedObjectId(265, (byte) -106);
                QuickChatPhraseCache.appendSubstitutedObjectId(266, (byte) -93);
                QuickChatPhraseCache.appendSubstitutedObjectId(267, (byte) -76);
                SoundEffectNode.addObjectSubstitution(133, (byte) -77, false, 132);
                SoundEffectNode.addObjectSubstitution(264, (byte) -77, false, 268);
                SoundEffectNode.addObjectSubstitution(265, (byte) -77, false, 269);
                SoundEffectNode.addObjectSubstitution(266, (byte) -77, false, 270);
                SoundEffectNode.addObjectSubstitution(267, (byte) -77, false, 271);
                decompiledFrameRemainder0 = (var12 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              QuickChatPhraseCache.appendSubstitutedObjectId(77, (byte) -124);
              QuickChatPhraseCache.appendSubstitutedObjectId(110, (byte) -67);
              QuickChatPhraseCache.appendSubstitutedObjectId(111, (byte) -117);
              QuickChatPhraseCache.appendSubstitutedObjectId(173, (byte) -106);
              QuickChatPhraseCache.appendSubstitutedObjectId(174, (byte) -71);
              QuickChatPhraseCache.appendSubstitutedObjectId(175, (byte) -122);
              SoundEffectNode.addObjectSubstitution(173, (byte) -77, true, 189);
              SoundEffectNode.addObjectSubstitution(174, (byte) -77, true, 190);
              SoundEffectNode.addObjectSubstitution(175, (byte) -77, true, 191);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (param1 == 0 ||
            var12 != 0)) {
            TrafficVehicle.addAnimatedTileDefinition(21, (byte) -23, 3, 0, 16, -16384, 22);
            TrafficVehicle.addAnimatedTileDefinition(16, (byte) -23, 3, 0, 21, 16384, 23);
            ArmedHuman.advanceAnimatedTiles((byte) 98);
            QuickChatPhraseCache.appendSubstitutedObjectId(59, (byte) -91);
            QuickChatPhraseCache.appendSubstitutedObjectId(60, (byte) -81);
            QuickChatPhraseCache.appendSubstitutedObjectId(61, (byte) -74);
            QuickChatPhraseCache.appendSubstitutedObjectId(71, (byte) -76);
            QuickChatPhraseCache.appendSubstitutedObjectId(70, (byte) -96);
            QuickChatPhraseCache.appendSubstitutedObjectId(110, (byte) -66);
            QuickChatPhraseCache.appendSubstitutedObjectId(111, (byte) -67);
            QuickChatPhraseCache.appendSubstitutedObjectId(120, (byte) -104);
            QuickChatPhraseCache.appendSubstitutedObjectId(121, (byte) -103);
            QuickChatPhraseCache.appendSubstitutedObjectId(122, (byte) -73);
            QuickChatPhraseCache.appendSubstitutedObjectId(156, (byte) -103);
            QuickChatPhraseCache.appendSubstitutedObjectId(157, (byte) -87);
            QuickChatPhraseCache.appendSubstitutedObjectId(158, (byte) -97);
            QuickChatPhraseCache.appendSubstitutedObjectId(276, (byte) -80);
            QuickChatPhraseCache.appendSubstitutedObjectId(277, (byte) -116);
            QuickChatPhraseCache.appendSubstitutedObjectId(278, (byte) -74);
            SoundEffectNode.addObjectSubstitution(120, (byte) -77, true, 276);
            SoundEffectNode.addObjectSubstitution(121, (byte) -77, true, 277);
            SoundEffectNode.addObjectSubstitution(122, (byte) -77, true, 278);
          }
          if (param0 != 8) {
            this.field_o = -16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "hi.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void deselectAll(byte param0) {
        RuntimeException runtimeException = null;
        Zombie var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (this.field_W.size(false) == 0) {
            return;
          }
          var3 = -60 / ((param0 + 57) / 38);
          var2 = (Zombie) (this.field_W.first((byte) 34));
          while (null != var2) {
            var2.deselect((byte) -119);
            var2 = (Zombie) (this.field_W.next((byte) 123));
            if (var4 != 0) {
              return;
            }
          }
          this.field_W.clear(65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.IA(" + param0 + ')');
        }
    }

    final static void drawDialogOverlay(byte param0) {
        try {
          ArchivePreloader.drawDialogOverlay(true, false);
          int var1_int = 92 % ((param0 - 56) / 63);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.DA(" + param0 + ')');
        }
    }

    final int getRestartsLeft(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -5402) {
            stackIn_4_0 = ArrayWidgetContainer.field_y;
            return stackIn_4_0;
          }
          stackIn_2_0 = 10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.M(" + param0 + ')');
        }
    }

    final void removeZombie(Zombie param0, boolean param1) {
        boolean stackIn_39_1 = false;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Zombie var4_ref_kd = null;
        int var4 = 0;
        Path var5 = null;
        Zombie var5_ref = null;
        Path var6 = null;
        int var7 = 0;
        int var3_intLifetime1;
        var7 = ZombieDawn.field_J;
        try {
          param0.unlinkFromBucket(0);
          param0.unlinkSecondary((byte) -48);
          param0.unlink(-27598);
          this.field_gb.recountUnits((byte) -106);
          if (!param1) {
            this.draw(69);
          }
          if (-1 == this.field_h &&
            this.field_q == 2 &&
            this.field_gb.field_k < 100) {
            var3_int = 0;
            while (var3_int < 2) {
              var4_ref_kd = this.spawnZombie(20, (byte) 125, 400, 160, 670);
              var5 = new Path();
              var5.addFirst(0, new Point(var4_ref_kd.getX(true), -110 + var4_ref_kd.getY(237239984)));
              var4_ref_kd.setPath(var5, true);
              var3_int++;
              if (var7 != 0) {
                return;
              }
            }
            if (var7 == 0) {
              return;
            }
          }
          if (this.field_h != 0 ||
            this.field_q != 7 ||
            param0.isPlayerOwned((byte) -126)) {
            if (param0.field_fb <= 0) {
              return;
            }
            if (6 != this.field_q) {
              return;
            }
            stackIn_39_1 = !(param1);
            this.spawnEnemyReinforcement(stackIn_39_1, param0);
            if (var7 == 0) {
              return;
            }
          }
          var3_intLifetime1 = 1;
          var4 = 0;
          while (var4 < var3_intLifetime1) {
            var5_ref = this.spawnZombie(90, (byte) 125, 90, 915 - (80 - 80 * param0.field_fb), 1600);
            var5_ref.field_fb = param0.field_fb;
            this.field_gb.recountUnits((byte) -106);
            var6 = new Path();
            var6.addFirst(0, new Point(960, 1090));
            var5_ref.setPath(var6, true);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_50_0 = var3;
          stackIn_50_1 = new StringBuilder().append("hi.EA(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(')').toString());
        }
    }

    final void onHumanHerded(RoamingCountryHuman param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_nb = this.field_nb + 1;
          if (param1 < 51) {
            this.selectZombiesInRect(-98, 109, 21, -13, -54);
          }
          if (this.field_nb >= 120) {
            this.awardAchievement(237, 18, (byte) -23);
          }
          var3_int = PatrollingGuard.field_Qb;
          var4 = var3_int;
          this.field_G = this.field_G + var4;
          this.field_l = this.field_l + var4;
          this.field_C = this.field_C + (var4 << 8);
          this.field_ab = this.field_ab + var4 * this.field_K;
          this.checkScoreAchievements(1);
          this.field_i.addFirst(0, new ScorePopup(param0.getX(true), -30 + param0.getY(237239984), var3_int, true));
          this.field_gb.recountUnits((byte) -106);
          EmptyWidgetPainter.queueSoundEffect(47, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hi.BA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void checkScoreAchievements(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_G >= 2000) {
            this.awardAchievement(255, 0, (byte) -23);
          }
          if (5000 <= this.field_G) {
            this.awardAchievement(254, 1, (byte) -23);
          }
          if (this.field_G >= 10000) {
            this.awardAchievement(253, 2, (byte) -23);
          }
          if (param0 != 1) {
            return;
          }
          if (this.field_G >= 16661) {
            this.awardAchievement(242, 13, (byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.J(" + param0 + ')');
        }
    }

    final void restartLevel(int param0) {
        int var3 = 0;
        if (!this.hasRestartsLeft(-25983)) {
          return;
        }
        try {
          int var2_int = -108 % ((param0 + 64) / 49);
          var3 = -this.field_l;
          this.field_ab = this.field_ab + var3 * this.field_K;
          this.field_l = this.field_l + var3;
          this.field_C = this.field_C + (var3 << 8);
          this.field_G = this.field_G + var3;
          this.checkScoreAchievements(1);
          this.saveLevelResult(true);
          this.startLevel(this.loadLevelMap(this.field_q, (byte) -103, this.field_h), (byte) -99);
          ArrayWidgetContainer.field_y = ArrayWidgetContainer.field_y - 1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.QA(" + param0 + ')');
        }
    }

    private final int getMusicTrack(boolean param0) {
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = -1;
          if (this.field_h != -1) {
            if (this.field_q == 0) {
              var2_int = 1;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (1 != this.field_q) {
                if (this.field_q == 2) {
                  var2_int = 3;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_q != 3) {
                    if (this.field_q != 4) {
                      if (this.field_q == 5) {
                        var2_int = 12;
                        decompiledFrameRemainder0 = (var3 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if ((7 != this.field_q) &&
                          (decompiledFrameRemainder0 = (this.field_q == 6))) {
                          var2_int = 11;
                          decompiledFrameRemainder0 = (var3 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          var2_int = 13;
                          decompiledFrameRemainder0 = (var3 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var2_int = 10;
                      decompiledFrameRemainder0 = (var3 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var2_int = 4;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                var2_int = 2;
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_q != 3) {
              if (this.field_q != 7) {
                var2_int = 7;
                if (var3 != 0) {
                  var2_int = 8;
                  var2_int = 8;
                }
              } else {
                var2_int = 8;
                if (var3 != 0) {
                  var2_int = 8;
                }
              }
            } else {
              var2_int = 8;
            }
          }
          if (param0) {
            this.field_h = 28;
          }
          stackIn_47_0 = var2_int;
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.R(" + param0 + ')');
        }
    }

    final void placeAreaPowerup(boolean param0, int param1, int param2, int param3) {
        RegionPowerupEffect var5 = null;
        RegionPowerupEffect stackIn_6_0;
        RegionPowerupEffect stackIn_6_1;
        LevelNavigation stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        RegionPowerupEffect stackIn_7_0 = null;
        RegionPowerupEffect stackIn_7_1 = null;
        int stackIn_7_5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1 != -6355) {
            this.handleKeyPress(105, 'ﾬ', -105);
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = this.navigation;
          stackIn_6_3 = param2;
          stackIn_6_4 = param3;
          if (!param0) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_5 = 0;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_5 = 1;
          }
          var5 = new RegionPowerupEffect(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
          stackIn_11_0 = (!param0) ? 77 : 76;
          EmptyWidgetPainter.queueSoundEffect(stackIn_11_0, false);
          this.field_v.addFirst(param1 + 6355, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5_ref), "hi.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void updateLightning(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PcmSampleStream var5 = null;
        int var6 = 0;
        PcmSampleStream var5Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (param0 != 1) {
            return;
          }
          if (0 < this.field_fb) {
            var2_int = this.field_fb * (3 - Math.abs(-3 + this.field_h)) / 3;
            Rasterizer.fillRectangleBlended(0, 0, WhirlpoolHasher.field_e, DropdownList.field_P, 13421772, var2_int);
            this.field_fb = this.field_fb - 14;
            if (var6 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var2_intLifetime1 = (int)(MusicCrossfadeStream.field_p % 157L);
          if ((var2_intLifetime1 < 2 ||
            var2_intLifetime1 >= 139 &&
            var2_intLifetime1 <= 141) && WorldObject.cosFixed(1311979239, (int)(MusicCrossfadeStream.field_p << 6)) < 0) {
            stackIn_18_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_18_0 = 0;
          }
          var3 = stackIn_18_0;
          if (var3 != 0) {
            this.field_fb = 70 + (40 * DropTargetWidget.cosine(true, (int)(MusicCrossfadeStream.field_p << 6)) >> 16);
            var4 = this.field_fb * (-Math.abs(this.field_h - 3) + 3) / 3;
            var5 = MusicCrossfadeStream.playSoundEffect(40, 97);
            if (null != var5) {
              var5.setVolume(var4 * AddressHintGlobals.field_c >> 8);
              var5.setPosition(300 + var4 * 150);
            }
            if (var6 == 0) {
              return;
            }
          }
          if (var2_intLifetime1 == 5 &&
            3 > WorldObject.cosFixed(param0 ^ 1311979238, (int)(MusicCrossfadeStream.field_p << 6))) {
            var4Lifetime1 = 70 + (40 * DropTargetWidget.cosine(true, (int)(MusicCrossfadeStream.field_p << 6)) >> 16);
            stackIn_33_0 = 84;
            if (0L != (MusicCrossfadeStream.field_p & 1L)) {
              stackIn_34_1 = 129;
            } else {
              stackIn_34_1 = 128;
            }
            var5Lifetime1 = MusicCrossfadeStream.playSoundEffect(stackIn_33_0, stackIn_34_1);
            if (var5Lifetime1 != null) {
              var5Lifetime1.setVolume(var4Lifetime1 * AddressHintGlobals.field_c >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.UA(" + param0 + ')');
        }
    }

    final boolean handleKeyPress(int param0, char param1, int param2) {
        boolean stackIn_49_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_89_0 = false;
        boolean stackIn_97_0 = false;
        boolean stackIn_105_0 = false;
        boolean stackIn_113_0 = false;
        boolean stackIn_121_0 = false;
        PowerupBar stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        int stackIn_129_2 = 0;
        boolean stackIn_158_0 = false;
        boolean stackIn_168_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_157_0;
        int var4_int = 0;
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          this.field_C = this.field_C - this.field_Z;
          this.field_c = this.field_c - 1;
          this.field_I = this.field_I - param0;
          this.field_g = this.field_g + param0;
          if (param0 == 13) {
            UiResourceHelpers.switchScreenMusic(false, true, 2);
            return true;
          }
          if (QueuedByteRecord.field_j == param0) {
            this.field_Q.toggleCardSelection(3158064, 0);
            return true;
          }
          if (~BufferedSocket.field_k == ~param0) {
            this.field_Q.toggleCardSelection(3158064, 1);
            return true;
          }
          if (param0 == NodeHashTable.field_c) {
            this.field_Q.toggleCardSelection(3158064, 2);
            return true;
          }
          if (param0 == MessageDialogContent.field_K) {
            this.field_Q.toggleCardSelection(3158064, 3);
            return true;
          }
          if (~param0 == ~DropTargetWidget.field_D) {
            this.field_Q.toggleCardSelection(3158064, 4);
            return true;
          }
          if (param0 == HunterHuman.field_Rb) {
            this.field_Q.toggleCardSelection(3158064, 5);
            return true;
          }
          if (ExceptionWrapper.field_g == param0) {
            this.field_Q.toggleCardSelection(param2 + 3187702, 6);
            return true;
          }
          if (~TrackedSoundStream.field_m == ~param0) {
            this.field_Q.toggleCardSelection(3158064, 7);
            return true;
          }
          if (param2 != -29638) {
            field_x = (Sprite) null;
          }
          if (this.field_A) {
            if (param0 == 34) {
              stackIn_49_0 = !(UiWidget.field_w);
              UiWidget.field_w = stackIn_49_0;
            }
            if (param0 == 36) {
              stackIn_57_0 = !(MenuSelection.field_m);
              MenuSelection.field_m = stackIn_57_0;
            }
            if (39 == param0) {
              stackIn_65_0 = !(MenuScreen.field_e);
              MenuScreen.field_e = stackIn_65_0;
            }
            if (param0 == 51) {
              stackIn_73_0 = !(Mover.field_Q);
              Mover.field_Q = stackIn_73_0;
            }
            if (param0 == 37) {
              stackIn_81_0 = !(AreaSelectionScreen.field_r);
              AreaSelectionScreen.field_r = stackIn_81_0;
            }
            if (param0 == 85) {
              stackIn_89_0 = !(BulletCasing.field_c);
              BulletCasing.field_c = stackIn_89_0;
            }
            if (param0 == 32) {
              stackIn_97_0 = !(LaserBarrier.field_Q);
              LaserBarrier.field_Q = stackIn_97_0;
            }
            if (param0 == 38) {
              stackIn_105_0 = !(LoginPayloadKind.field_d);
              LoginPayloadKind.field_d = stackIn_105_0;
            }
            if (param0 == 35) {
              stackIn_113_0 = !(PendingIntArrayRequest.field_h);
              PendingIntArrayRequest.field_h = stackIn_113_0;
            }
            if (param0 == 40) {
              stackIn_121_0 = !(ProxyAuthException.field_a);
              ProxyAuthException.field_a = stackIn_121_0;
            }
            if (param0 == 41) {
              this.field_F = true;
              stackIn_128_0 = this.field_Q;
              stackIn_128_1 = 122;
              if (AchievementSubmission.field_p[81]) {
                stackIn_129_2 = 9;
              } else {
                stackIn_129_2 = 0;
              }
              ((PowerupBar) (Object) stackIn_128_0).populateCards((byte) stackIn_128_1, stackIn_129_2);
              return true;
            }
            if (param0 == 73) {
              System.gc();
            }
            if (param0 >= 1 &&
              4 >= param0) {
              var4_int = -1 + param0;
              if (AchievementSubmission.field_p[81]) {
                var4_int += 4;
              }
              this.startLevel(this.loadLevelMap(var4_int, (byte) -77, 0), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 88) {
              ((IntroCutsceneScreen) (SweepingSpotlight.getScreen(12, param2 ^ -29608))).startIntro(param2 + 29510);
              UiResourceHelpers.switchScreenMusic(true, true, 12);
            }
            if (param0 == 5) {
              if (AchievementSubmission.field_i) {
                ByteArrayPool.skipEndingCutscene((byte) 80);
              }
              this.field_F = true;
              this.field_P = this.field_f;
              return true;
            }
            if (param0 == 6) {
              var4 = this.zombies.last((byte) 26);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (!(var4 instanceof WorldObject)))) {
                stackOut_157_0 = var4 instanceof Zombie;
                stackIn_168_0 = stackOut_157_0;
                stackIn_158_0 = stackOut_157_0;
                if (var5 == 0) {
                  if (stackIn_158_0 &&
                    !((Zombie) (var4)).startDetonate(11312)) {
                    ((Zombie) (var4)).takeLethalHit(0);
                  }
                  var4 = var4.previous;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                this.field_gb.recountUnits((byte) -106);
                this.field_F = true;
                stackIn_168_0 = true;
              }
              return stackIn_168_0;
            }
            if (param0 == 7) {
              this.field_gb.setTimerTicks(param2 + 29688);
              this.field_F = true;
              return true;
            }
            if (8 == param0) {
              this.advanceToNextLevel(true);
              this.field_F = true;
              return true;
            }
            if (param0 == 9) {
              this.startLevel(this.loadLevelMap(this.field_q, (byte) 98, -1), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 10) {
              this.startLevel(this.loadLevelMap(this.field_q, (byte) 126, this.field_h), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 11) {
              LoginDialogGlobals.field_c = 1;
              return true;
            }
            if (param0 == 12 &&
              AchievementSubmission.field_p[82]) {
              this.camera.startFlyover((byte) -99);
              return true;
            }
            if (param0 == 12) {
              this.field_gb.hideTimer(0);
              this.field_F = true;
              return true;
            }
          }
          if (AchievementSubmission.field_p[82] &&
            param0 == 48) {
            this.selectZombiesInRect(0, this.navigation.width, this.navigation.height, param2 ^ -29685, 0);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4_ref), "hi.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void updateRoadCrossing(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        IntrusiveNode var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 <= 75) {
            GameWorld.openSubscribePage((java.applet.Applet) null, -78);
          }
          var2 = this.zombies.last((byte) 26);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2 instanceof WorldObject)))) {
            var3 = var2.previous;
            stackIn_29_0 = this.field_ib;
            if (var5 == 0) {
              if (stackIn_29_0 == -1 &&
                var2 instanceof TrafficVehicle) {
                ((WorldObject) (var2)).tick(107);
              }
              if (var2 instanceof Zombie &&
                ((Zombie) (var2)).getY(237239984) < 200) {
                var2.unlink(-27598);
                ((DualLinkNode) (var2)).unlinkSecondary((byte) -10);
                this.field_i.addFirst(0, new ScorePopup(((Zombie) (var2)).getX(true), 200, AccountResultHelpers.field_e, false));
                var4 = AccountResultHelpers.field_e;
                this.field_g = this.field_g - var4 * this.field_K;
                this.field_l = this.field_l + var4;
                this.field_G = this.field_G + var4;
                this.field_eb = this.field_eb + (var4 << 8);
                this.checkScoreAchievements(1);
                this.field_gb.incrementCrossedCount(true);
              }
              if (this.field_gb.field_b >= 50) {
                this.awardAchievement(251, 4, (byte) -23);
              }
              var2 = var3;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = 0;
          }
          AccountCreationForm.tickPeriodicSpawn(stackIn_29_0 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2_ref), "hi.SA(" + param0 + ')');
        }
    }

    final void draw(int param0) {
        Sprite[] stackIn_27_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Blast var4 = null;
        int var4_int = 0;
        PaletteBitmapFont var4_ref = null;
        int var5_int = 0;
        BinaryBitmapFont var5 = null;
        int var6_int = 0;
        BinaryBitmapFont var6 = null;
        int var7_int = 0;
        AchievementBanner var7 = null;
        int var8_int = 0;
        long var8 = 0L;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        Blast var4Lifetime1;
        int stackIn_146_0Lifetime1;
        int stackIn_146_1Lifetime1;
        int var2_intLifetime1;
        int var5_intLifetime1;
        int var7_intLifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var5_intLifetime2;
        var14 = ZombieDawn.field_J;
        try {
          if (!this.field_X) {
            return;
          }
          if (0 < this.field_r) {
            var2_int = 16;
            if (this.field_r >= 200) {
              if (-this.field_r + 500 < 100) {
                var2_int = (500 - this.field_r) * 16 / 100;
                if (var14 != 0) {
                  var2_int = 16 * this.field_r / 200;
                }
              }
            } else {
              var2_int = 16 * this.field_r / 200;
            }
            this.field_L.setVolume(AddressHintGlobals.field_c * (220 * var2_int) / 16 >> 8);
            if (var2_int > 0) {
              this.camera.x = this.camera.x + (GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, var2_int, param0 - 9843) - var2_int / 2);
              this.camera.y = this.camera.y + (-(var2_int / 2) + GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, var2_int, 1));
            }
          }
          this.navigation.drawFloor(this.camera, false);
          if (-1 != this.navigation.field_A.field_c &&
            this.navigation.field_A.field_o != -1) {
            var2_intLifetime1 = this.camera.worldToScreenX(this.navigation.field_A.field_c, (byte) -100);
            var3 = this.camera.worldToScreenY(this.navigation.field_A.field_o, 0);
            stackIn_27_0 = LogoPoseHelpers.field_c;
            if (5 > LoginDialogGlobals.field_c) {
              stackIn_28_1 = LoginDialogGlobals.field_c;
            } else {
              stackIn_28_1 = 4;
            }
            ((Sprite) (Object) stackIn_27_0[stackIn_28_1]).drawTransparent(var2_intLifetime1 - 44, -44 + var3);
          }
          var2 = this.field_lb.last((byte) 26);
          while (null != var2) {
            ((GooPuddle) (var2)).draw((byte) 117, this.camera);
            var2 = this.field_lb.previous(false);
            if (var14 == 0) {
              continue;
            }
            break;
          }
          boolean decompiledFrameCompleted3 = true;
          var3 = AchievementSubmission.field_i ? 1 : 0;
          if (var3 != 0) {
            JaggrabDownloader.drawCutsceneShadows(-18996, this.camera);
          }
          if (var3 == 0 ||
            var14 != 0) {
            var2 = this.field_d.last((byte) 26);
            while (var2 != null) {
              ((BloodSplat) (var2)).draw((byte) -104, this.camera);
              var2 = this.field_d.previous(false);
              if (var14 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            var2 = this.field_e.last((byte) 26);
          }
          do {
            if (var2 == null) {
              var2 = this.field_m.last((byte) 26);
              break;
            }
            ((ScreechEffect) (var2)).draw(this.camera, true);
            var2 = this.field_e.previous(false);
          } while (var14 == 0);
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (null == var2))) {
            var4 = (Blast) (var2);
            stackIn_58_0 = -2;
            stackIn_58_1 = ~var4.field_o;
            if (var14 == 0) {
              if (stackIn_58_0 == stackIn_58_1) {
                var4.draw(this.camera, (byte) 110);
              }
              var2 = this.field_m.previous(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_58_0 = param0;
            stackIn_58_1 = 9844;
          }
          if (stackIn_58_0 != stackIn_58_1) {
            this.removeZombie((Zombie) null, false);
          }
          this.navigation.drawWallLayer(this.camera, 1, true, false);
          var2 = this.field_v.last((byte) 26);
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var2) {
              ((RegionPowerupEffect) (var2)).drawEffect(this.camera, -516);
              var2 = this.field_v.previous(false);
              if (var14 == 0) {
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              var2 = this.field_d.last((byte) 26);
              while (null != var2) {
                ((BloodSplat) (var2)).draw((byte) -82, this.camera);
                var2 = this.field_d.previous(false);
                if (var14 != 0) {
                  break scanLoop1;
                }
              }
            }
            LevelResultScreen.field_u = 0;
            QueuedStatSubmission.field_n = 0;
            break;
          }
          if (!(Math.abs(-TileMap.field_q + this.camera.x) <= 40) ||
            !(40 >= Math.abs(-AbstractSprite.field_b + this.camera.y))) {
            AbstractSprite.field_b = this.camera.y;
            AlternateLongAndNameCredentials.field_m = true;
            TileMap.field_q = this.camera.x;
            ContentTransitionDialog.setRasterTarget((byte) -120, TrackedSoundStream.field_p);
            Rasterizer.clear();
            SingleChildWidget.popRasterState(-21189);
            if (var14 != 0) {
              AlternateLongAndNameCredentials.field_m = false;
            }
          } else {
            AlternateLongAndNameCredentials.field_m = false;
          }
          var2 = this.zombies.last((byte) 26);
          do {
            if (var2 == null) {
              var2 = this.field_T.last((byte) 26);
              break;
            }
            ((WorldObject) (var2)).draw((byte) -101, this.camera);
            var2 = this.zombies.previous(false);
          } while (var14 == 0);
          do {
            if (null == var2) {
              var2 = this.field_m.last((byte) 26);
              break;
            }
            ((PowerupPickup) (var2)).draw((byte) -86, this.camera);
            var2 = this.field_T.previous(false);
          } while (var14 == 0);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var2))) {
            var4Lifetime1 = (Blast) (var2);
            stackIn_108_0 = var4Lifetime1.field_o;
            stackIn_108_1 = 1;
            if (var14 == 0) {
              if (stackIn_108_0 != stackIn_108_1) {
                var4Lifetime1.draw(this.camera, (byte) 110);
              }
              var2 = this.field_m.previous(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_108_0 = ~this.field_q;
            stackIn_108_1 = -6;
          }
          if (stackIn_108_0 == stackIn_108_1) {
            TrackedSoundStream.field_p.drawTransparent(-this.camera.x + TileMap.field_q - 40, -this.camera.y + (AbstractSprite.field_b - 40));
          }
          this.navigation.drawWallLayer(this.camera, 2, true, false);
          if (this.navigation.field_A.field_a == 6 &&
            this.field_h != -1) {
            this.updateLightning(1);
          }
          this.navigation.drawWallLayer(this.camera, 3, true, false);
          var2 = this.zombies.last((byte) 26);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackIn_127_0 = var2 instanceof Zombie;
            if (var14 == 0) {
              if (stackIn_127_0) {
                ((Zombie) (var2)).drawSelectionMarker(0, this.camera);
              }
              var2 = this.zombies.previous(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_b.draw((byte) 6, this.camera);
            stackIn_127_0 = LaserBarrier.field_Q;
          }
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_127_0) {
            var4_int = 0;
            while (var4_int < this.navigation.width) {
              var5_int = this.camera.worldToScreenX(var4_int, (byte) -92);
              stackIn_146_0 = ~var5_int;
              stackIn_146_1 = -1;
              if (var14 != 0) {
                if (stackIn_146_0 < stackIn_146_1) {
                  var5_int = this.camera.worldToScreenY(var4_int, 0);
                  stackIn_180_0 = ~var5_int;
                  stackIn_180_1 = -1;
                  decompiledFrameCompleted2 = false;
                  break;
                }
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_146_0 <= stackIn_146_1 && (!((WhirlpoolHasher.field_e * 2) < var5_int) ||
                var14 != 0)) {
                Rasterizer.drawVerticalLine(-1 + var5_int, 0, 2 * DropdownList.field_P, 255);
                Rasterizer.drawVerticalLine(var5_int, 0, 2 * DropdownList.field_P, 255);
                Rasterizer.drawVerticalLine(var5_int + 1, 0, DropdownList.field_P * 2, 255);
              }
              var4_int += 128;
            }
            if ((decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1)) {
              var4_int = 0;
              while (true) {
                stackIn_146_0Lifetime1 = ~this.navigation.height;
                stackIn_146_1Lifetime1 = ~var4_int;
                if (stackIn_146_0Lifetime1 >= stackIn_146_1Lifetime1) {
                  break;
                }
                var5_intLifetime2 = this.camera.worldToScreenY(var4_int, 0);
                stackIn_180_0 = ~var5_intLifetime2;
                stackIn_180_1 = -1;
                if (var14 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_180_0 <= stackIn_180_1 && (!(var5_intLifetime2 > (2 * DropdownList.field_P)) ||
                  var14 != 0)) {
                  Rasterizer.drawHorizontalLine(0, -1 + var5_intLifetime2, WhirlpoolHasher.field_e * 2, 255);
                  Rasterizer.drawHorizontalLine(0, var5_intLifetime2, 2 * WhirlpoolHasher.field_e, 255);
                  Rasterizer.drawHorizontalLine(0, 1 + var5_intLifetime2, WhirlpoolHasher.field_e * 2, 255);
                }
                var4_int += 128;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted0)) {
            if (this.field_p &&
              !this.field_w) {
              DisplaySettingsDialog.field_eb[8].drawTransparent(-12 + KeyStateHelpers.field_b, FadingModalPanel.field_K - 12);
            }
            if (this.field_p &&
              this.field_w) {
              var6_int = KeyStateHelpers.field_b - this.field_B;
              if (var6_int >= 0) {
                var4_int = this.field_B;
              }
              if (var6_int < 0 ||
                var14 != 0) {
                var6_int = -var6_int;
                var4_int = KeyStateHelpers.field_b;
              }
              var7_int = FadingModalPanel.field_K - this.field_j;
              if (var7_int < 0) {
                var7_int = -var7_int;
                var5_intLifetime1 = FadingModalPanel.field_K;
                if (var14 != 0) {
                  var5_intLifetime1 = this.field_j;
                }
              } else {
                var5_intLifetime1 = this.field_j;
              }
              Rasterizer.drawRectOutline(var4_int, var5_intLifetime1, var6_int, var7_int, 16777215);
              Rasterizer.drawRectangleOutlineAlpha(var4_int + 1, 1 + var5_intLifetime1, var6_int - 2, -2 + var7_int, 10066431, 32);
              Rasterizer.fillRectangleBlended(2 + var4_int, 2 + var5_intLifetime1, -4 + var6_int, -4 + var7_int, 3355647, 32);
            }
            stackIn_180_0 = -1;
            stackIn_180_1 = ~this.field_ib;
          }
          if (stackIn_180_0 == stackIn_180_1) {
            this.field_Q.drawAreaCursor(param0 - 11137);
          }
          GlowAreaSupport.drawGlowArea((byte) -17, this.camera);
          if (this.field_q == 5) {
            this.drawRain(param0 - 9934);
          }
          if (NameAvailabilityValidator.field_j >= 0.0f) {
            BlastParticle.field_f.drawTransparent(this.camera.worldToScreenX(MiasmaPuff.field_I, (byte) -124), this.camera.worldToScreenY(-(int)NameAvailabilityValidator.field_j + MarkerSliderPainter.field_g, param0 ^ 9844));
          }
          var2 = this.field_i.last((byte) 26);
          do {
            if (null == var2) {
              this.field_gb.draw(param0 ^ -9762);
              this.field_Q.draw((byte) -55);
              TextHotspotRegion.drawTutorialTip(0);
              break;
            }
            ((ScorePopup) (var2)).draw((byte) -106, this.camera);
            var2 = this.field_i.previous(false);
          } while (var14 == 0);
          var4_ref = ProgressMessageDialog.field_jb;
          var5 = CacheEntry.field_q;
          var6 = Js5Transport.field_k;
          if (!AchievementSubmission.field_i && ((this.camera.field_d ||
            0.0f < this.camera.field_g) &&
            (!(SpriteFadeHelpers.field_b <= 150) ||
            !(LevelObstacle.field_M <= 150)))) {
            var7_intLifetime1 = this.camera.worldToScreenX(this.camera.field_v, (byte) -102);
            var8_int = this.camera.worldToScreenY(this.camera.field_f, 0);
            var9 = var7_intLifetime1 - 320;
            var10_int = 320 + var7_intLifetime1;
            var11 = var8_int - 240;
            var12 = 240 + var8_int;
            if (!this.camera.field_d) {
              var13 = this.camera.field_g;
              var10_int = (int)((float)(WhirlpoolHasher.field_e - 5) * (1.0f - var13) + var13 * (float)var10_int);
              var9 = (int)(var13 * (float)var9 + (-var13 + 1.0f) * 5.0f);
              var11 = (int)(var13 * (float)var11 + 5.0f * (-var13 + 1.0f));
              var12 = (int)(var13 * (float)var12 + (-var13 + 1.0f) * (float)(DropdownList.field_P - 5));
              System.out.println("lit area: " + var9 + "," + var11 + "," + (-var9 + var10_int) + "," + (-var11 + var12));
            }
            Rasterizer.setClip(5, 5, -5 + WhirlpoolHasher.field_e, -5 + DropdownList.field_P);
            Rasterizer.fillRect(5, 5, -10 + WhirlpoolHasher.field_e, var11 - 5, 0);
            Rasterizer.fillRect(5, var12, WhirlpoolHasher.field_e - 10, DropdownList.field_P + (-5 - var12), 0);
            Rasterizer.fillRect(5, var11, -5 + var9, -var11 + var12, 0);
            Rasterizer.fillRect(var10_int, var11, -5 + WhirlpoolHasher.field_e - var10_int, -var11 + var12, 0);
          }
          if (this.field_ib == -1 ||
            this.field_N > 0) {
            Rasterizer.setClip(-this.field_N + (SpriteFadeHelpers.field_b + 640), 0, WhirlpoolHasher.field_e, DropdownList.field_P);
            if (this.field_h == -1) {
              var5.drawStringCentered(AgeValidator.field_g[this.field_q], WhirlpoolHasher.field_d, 280, 16777215, 0);
            }
            this.field_V.drawTransparent(-(this.field_V.field_w / 2) + WhirlpoolHasher.field_d, DropdownList.field_G - this.field_V.field_t);
            SpriteEffectHelpers.drawTransparent(this.field_t, WhirlpoolHasher.field_d + (-(this.field_V.field_w / 2) - 6), -6 + (-this.field_V.field_t + DropdownList.field_G));
            Rasterizer.resetClip();
          }
          var7 = (AchievementBanner) (this.field_ob.last((byte) 26));
          if (var7 != null) {
            var8_intLifetime1 = 10;
            var9Lifetime1 = 10;
            var10_intLifetime1 = var7.field_k;
            var11Lifetime1 = var5.textWidth(TrafficVehicle.field_J[var10_intLifetime1]) + 70;
            var12Lifetime1 = this.field_z;
            if (32 > var12Lifetime1 ||
              303 < var12Lifetime1) {
              if (var12Lifetime1 > 32) {
                var12Lifetime1 = -var12Lifetime1 + 335;
              }
              var8_intLifetime1 = -310 + var12Lifetime1 * 10;
            }
            Rasterizer.fillRoundedRectangleBlended(var8_intLifetime1, var9Lifetime1, var11Lifetime1, 40, 6, 0, 160);
            Rasterizer.drawRoundedRectangle(var8_intLifetime1, var9Lifetime1, var11Lifetime1, 40, 6, 7829367);
            MenuLayoutHelpers.field_a[var10_intLifetime1].drawQuarterSize(var8_intLifetime1 + 9, var9Lifetime1 + 5);
            var5.drawString(TrafficVehicle.field_J[var10_intLifetime1], var8_intLifetime1 + 50, var9Lifetime1 + 25, 16777215, 3355443);
          }
          WidgetTheme.drawScreenFrame(11690);
          if (MenuScreen.field_e) {
            Rasterizer.fillRectangleBlended(0, 22, 80, 105, 0, 128);
            var6.drawString(Integer.toString(this.field_c), 5, 40, 16777215, 0);
            var6.drawString(Integer.toString(this.field_C), 5, 60, 16777215, 0);
            var6.drawString(Integer.toString(this.field_eb), 5, 80, 16777215, 0);
            var6.drawString(Integer.toString(this.field_Z), 5, 100, 16777215, 0);
            var6.drawString(Integer.toString((this.field_G << 8) + this.getLevelSlot(param0 ^ -9799)), 5, 120, 16777215, 0);
          }
          if (MenuSelection.field_m ||
            AreaSelectionScreen.field_r ||
            LoginPayloadKind.field_d) {
            Rasterizer.fillRectangleBlended(0, 0, 640, 17, 0, 100);
          }
          if (MenuSelection.field_m) {
            Js5Transport.field_k.drawString("cam=(" + this.camera.x + ", " + this.camera.y + ") bk=" + GzipDecompressor.field_d + " k=" + LaserBarrier.field_R + " mouse=(" + KeyStateHelpers.field_b + "," + FadingModalPanel.field_K + ") trees=" + LevelResultScreen.field_u + " tree tiles=" + QueuedStatSubmission.field_n, 5, 13, 16777215, 0);
          }
          if (LoginPayloadKind.field_d) {
            Js5Transport.field_k.drawString("mouseover tile=(" + (-WhirlpoolHasher.field_d + KeyStateHelpers.field_b + this.camera.x) / 24 + ", " + (-DropdownList.field_G + (FadingModalPanel.field_K + this.camera.y)) / 24 + ")  pixel=(" + (KeyStateHelpers.field_b + (this.camera.x - WhirlpoolHasher.field_d)) + "," + (this.camera.y + FadingModalPanel.field_K - DropdownList.field_G) + ")", 5, 13, 16777215, 0);
          }
          if (this.field_F) {
            var5.drawStringRightAligned("Cheater!", 630, 410, 16776960, 0);
          }
          if (AreaSelectionScreen.field_r) {
            var8 = Runtime.getRuntime().totalMemory();
            var10 = Runtime.getRuntime().freeMemory();
            Js5Transport.field_k.drawStringRightAligned((var8 - var10) / 1024L + " kB / " + var8 / 1024L + " kB", 636, 13, 16777215, 0);
          }
          if (BulletCasing.field_c) {
            var4_ref.drawString(Integer.toString(NineSliceFrame.field_d), 10, 40, 2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2_ref), "hi.AB(" + param0 + ')');
        }
    }

    private final void issueMoveOrder(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        DualLinkDeque var5 = null;
        Zombie var6_ref_kd = null;
        int var6 = 0;
        Path var7_ref_qh = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        Zombie var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Zombie var13Lifetime1;
        int stackIn_41_0Lifetime1;
        int stackIn_63_0Lifetime1;
        int stackIn_79_0Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var18 = ZombieDawn.field_J;
        try {
          this.field_b.placeAt((byte) 75, param1, param0);
          if (1 < this.field_W.size(false)) {
            param1 = SpatialObject.randomSquadOffset(-126) + (-(param1 % 24) + param1);
            param0 = SpatialObject.randomSquadOffset(-127) + param0 - param0 % 24;
            if (var18 != 0) {
              param0 += 6;
            }
          } else {
            param0 += 6;
          }
          var4_int = 1;
          var5 = new DualLinkDeque();
          var6_ref_kd = (Zombie) (this.field_W.first((byte) 34));
          while (null != var6_ref_kd) {
            var7_ref_qh = this.navigation.findPath(true, var6_ref_kd.getX(true), param0, param1, var6_ref_kd.getY(237239984));
            if (var18 != 0) {
              return;
            }
            if (null == var7_ref_qh) {
              var6_ref_kd.unlinkSecondary((byte) -68);
              var5.addLast(var6_ref_kd, (byte) -128);
            } else {
              var4_int = 0;
            }
            var6_ref_kd = (Zombie) (this.field_W.next((byte) 116));
          }
          if (var4_int == 0) {
            this.field_b.markReachable(20);
            if (var18 == 0) {
              var6 = param1 / 24;
              var7 = param0 / 24;
              if (param2 <= 114) {
                this.field_F = false;
              }
              var8 = this.navigation.createDistanceGrid(8728);
              var8[var7][var6] = 1;
              var9 = 2;
              var10 = 1;
              var11 = this.field_W.size(false);
              while (var11 >= var9) {
                var12 = -1;
                var13_int = -1;
                stackIn_63_0 = 0;
                var14 = stackIn_63_0;
                scanLoop1: while (true) {
                  stackIn_31_0 = var8.length;
                  stackIn_31_1 = var14;
                  if (stackIn_31_0 > stackIn_31_1) {
                    stackIn_41_0 = 0;
                    var15 = stackIn_41_0;
                    while (var8[0].length > var15) {
                      stackIn_31_0 = ~var8[var14][var15];
                      stackIn_31_1 = ~var10;
                      if (stackIn_31_0 == stackIn_31_1) {
                        var12 = var15;
                        var13_int = var14;
                      }
                      var15++;
                    }
                    var14++;
                    continue scanLoop1;
                  }
                  break;
                }
                stackIn_41_0Lifetime1 = -1;
                if (stackIn_41_0Lifetime1 == var12 &&
                  var13_int == -1) {
                  return;
                }
                if (HotspotTextWidget.getGridCell(var12, -1 + var13_int, var8, 2) == 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var8[-1 + var13_int][var12] = incrementValue$0;
                }
                if (HotspotTextWidget.getGridCell(1 + var12, var13_int, var8, 2) == 0) {
                  incrementValue$1 = var9;
                  var9++;
                  var8[var13_int][var12 + 1] = incrementValue$1;
                }
                if (HotspotTextWidget.getGridCell(var12, var13_int + 1, var8, 2) == 0) {
                  incrementValue$2 = var9;
                  var9++;
                  var8[var13_int + 1][var12] = incrementValue$2;
                }
                var10++;
                if (HotspotTextWidget.getGridCell(-1 + var12, var13_int, var8, 2) == 0) {
                  incrementValue$3 = var9;
                  var9++;
                  var8[var13_int][-1 + var12] = incrementValue$3;
                }
              }
              stackIn_63_0Lifetime1 = 0;
              var12Lifetime1 = stackIn_63_0Lifetime1;
              var13 = (Zombie) (this.field_W.first((byte) 34));
              while (null != var13) {
                var12Lifetime1++;
                var14Lifetime1 = -1;
                var15Lifetime1 = -1;
                var16 = 0;
                scanLoop2: while (true) {
                  stackIn_68_0 = var8.length;
                  stackIn_68_1 = var16;
                  if (stackIn_68_0 > stackIn_68_1) {
                    stackIn_79_0 = 0;
                    var17 = stackIn_79_0;
                    while (var8[0].length > var17) {
                      stackIn_68_0 = ~var12Lifetime1;
                      stackIn_68_1 = ~var8[var16][var17];
                      if (stackIn_68_0 == stackIn_68_1) {
                        var14Lifetime1 = var17;
                        var15Lifetime1 = var16;
                      }
                      var17++;
                    }
                    var16++;
                    continue scanLoop2;
                  }
                  break;
                }
                stackIn_79_0Lifetime1 = ~var14Lifetime1;
                if (stackIn_79_0Lifetime1 == 0 &&
                  -1 == var15Lifetime1) {
                  return;
                }
                param1 = 24 * var14Lifetime1 + SpatialObject.randomSquadOffset(-128);
                param0 = SpatialObject.randomSquadOffset(49) + var15Lifetime1 * 24;
                var13.setPath(this.navigation.findPath(true, var13.getX(true), param0, param1, var13.getY(237239984)), true);
                if (7 == this.field_q &&
                  0 == this.field_h &&
                  !var13.isVisibleToHumans(52)) {
                  Blast.handleTutorialEvent(-12, 6836);
                }
                var13 = (Zombie) (this.field_W.next((byte) 114));
              }
              var13Lifetime1 = (Zombie) (var5.first((byte) 34));
              while (var13Lifetime1 != null) {
                var13Lifetime1.unlinkSecondary((byte) -85);
                this.field_W.addLast(var13Lifetime1, (byte) -109);
                var13Lifetime1 = (Zombie) (var5.next((byte) 122));
              }
              return;
            }
          }
          this.field_W = var5;
          this.field_b.markUnreachable((byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "hi.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final TileMap loadLevelMap(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        TileMap stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        byte[][] stackIn_9_1 = null;
        int stackIn_10_2 = 0;
        TileMap stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 3 &&
            0 >= OctaveNoiseMap.field_j) {
            stackIn_5_0 = this.loadLevelMap(0, (byte) -93, 0);
            return stackIn_5_0;
          }
          var4_int = -89 / ((param1 + 2) / 55);
          var5 = this.getLevelSlot(104) + 28 * this.field_bb;
          this.field_q = param0;
          this.field_bb = this.field_q / 4;
          this.field_h = param2;
          var6 = this.getLevelSlot(82) + this.field_bb * 28;
          this.field_C = this.field_C + (-var5 + var6);
          stackIn_9_0 = 124;
          stackIn_9_1 = DimensionOnlyResizer.field_c[this.field_q];
          if (this.field_h != -1) {
            stackIn_10_2 = this.field_h;
          } else {
            stackIn_10_2 = 6;
          }
          stackIn_11_0 = LoadingAndMapHelpers.decodeLevelMapIntArgs(stackIn_9_0, stackIn_9_1[stackIn_10_2]);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "hi.JA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final Mover findMoverAtScreen(int param0, boolean param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        WorldObject var9 = null;
        Mover var10 = null;
        int var11 = 0;
        Object stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          var5_int = this.camera.screenToWorldX(param3, false);
          var6 = this.camera.screenToWorldY(param0, true);
          var7 = null;
          var8 = -1;
          if (param2 >= -66) {
            this.selectZombiesInRect(112, -70, 11, 40, -44);
          }
          var9 = (WorldObject) (this.zombies.last((byte) 26));
          while (null != var9) {
            if (param1 &&
              var9 instanceof Human ||
              !param1 &&
              var9 instanceof Zombie) {
              var10 = (Mover) (var9);
              if (var10.containsPoint(76, var5_int, var6) &&
                var8 < var10.getY(237239984)) {
                var8 = var10.getY(237239984);
                var7 = var10;
              }
            }
            var9 = (WorldObject) (this.zombies.previous(false));
            if (var11 == 0) {
              continue;
            }
            break;
          }
          stackIn_23_0 = var7;
          return (Mover) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5), "hi.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void infectHuman(int param0, Human param1, byte param2, boolean param3, Point param4) {
        int stackIn_55_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Zombie var8 = null;
        int var9_int = 0;
        PcmSampleStream var9 = null;
        int var10 = 0;
        try {
          if (MatchingTextValidator.isClientOptionEnabled(0, -126)) {
            if (param1.field_t == 4 ||
              param1.field_t == 1) {
              this.field_U = this.field_U + 1;
            }
            if (this.field_U == 100) {
              this.awardAchievement(243, 12, (byte) -23);
            }
          }
          if (this.field_q == 5 &&
            this.field_h == 3 &&
            param1.field_t == 23) {
            this.field_o = this.field_o + 1;
            if (this.field_o == 7) {
              this.awardAchievement(238, 17, (byte) -23);
            }
          }
          var6_int = param1.getX(true);
          var7 = param1.getY(237239984);
          var8 = new Zombie(var6_int, var7, param1.isMaleVoice(10), param0);
          if (param1.field_kb) {
            var8.applySlowdown((byte) 124, 1000);
          }
          this.zombies.addFirst(0, var8);
          var8.updateGridCell((byte) 118);
          SpriteEffectHelpers.sortByDepth(this.zombies);
          if (param0 == 0) {
            if (param3) {
              var8.select(param2 ^ -31320);
              this.field_W.addLast(var8, (byte) -126);
              if (param4 != null) {
                var8.setPath(this.navigation.findPath(true, var6_int, param4.y, param4.x, var7), true);
              }
            }
            if (!(param1 instanceof ArmySoldier)) {
              this.field_P = this.field_P + 1;
            }
            param1.state = 18;
            if (param1.field_t == 28) {
              this.field_hb = this.field_hb + 1;
            }
            this.field_gb.recountUnits((byte) -106);
            if (this.field_q != 5 ||
              this.field_h != -1) {
              if (-1 == this.field_h) {
                stackIn_55_0 = UiWidget.field_r;
              } else {
                stackIn_55_0 = param1.getInfectionScore(24478);
              }
              var9_int = stackIn_55_0;
              if (0 != var9_int) {
                var10 = var9_int;
                this.field_C = this.field_C + (var10 << 8);
                this.field_l = this.field_l + var10;
                this.field_G = this.field_G + var10;
                this.field_ab = this.field_ab + var10 * this.field_K;
                this.checkScoreAchievements(1);
                this.field_i.addFirst(param2 ^ 60, new ScorePopup(param1.getX(true), param1.getY(237239984) - 30, var9_int, true));
              }
            }
            if (param1 instanceof ArmySoldier) {
              this.awardAchievement(249, 6, (byte) -23);
            }
            if (param1.field_ib) {
              if (this.field_q == 4 &&
                this.field_h == 5) {
                this.awardAchievement(226, 29, (byte) -23);
              }
              if (this.field_q == 5 &&
                this.field_h == 5 &&
                30 == param1.field_t) {
                this.awardAchievement(225, 30, (byte) -23);
              }
              if (this.field_q == 7 &&
                this.field_h == 3) {
                this.awardAchievement(224, 31, (byte) -23);
              }
            }
            Blast.handleTutorialEvent(-4, 6836);
          }
          if (param0 != 0 ||
            ZombieDawn.field_J != 0) {
            this.field_gb.recountUnits((byte) -106);
          }
          if (!this.field_gb.isQuotaReached(true)) {
            var8.playGroanSound(param2 - 165);
          }
          if (param2 != 60) {
            this.selectZombiesInRect(-64, -71, -114, -32, 40);
          }
          if (this.field_q == 4 &&
            5 == this.field_h &&
            IconButtonPainter.field_t == 20) {
            EmptyWidgetPainter.queueSoundEffect(122, false);
            var9 = EmptyWidgetPainter.queueSoundEffect(149, false);
            var9.setVolume(3 * var9.getTargetVolume() / 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_110_0 = var6;
          stackIn_110_1 = new StringBuilder().append("hi.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          stackIn_114_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
        }
    }

    private final void handleRightClick(int param0, int param1, int param2) {
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        Zombie var8 = null;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          this.field_Q.deselectCurrent((byte) -83);
          if (param2 != 31098) {
            return;
          }
          if (!this.field_A ||
            !AchievementSubmission.field_p[81]) {
            this.deselectAll((byte) 126);
            if (var9 == 0) {
              return;
            }
          }
          var4_int = this.camera.screenToWorldX(param0, false);
          var5 = this.camera.screenToWorldY(param1, true);
          if (this.navigation.isWalkable(false, var5, var4_int, true)) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (AchievementSubmission.field_p[82]) {
              boolean decompiledFrameRemainder0 = true;
              if (this.field_q != 4 ||
                -1 != this.field_h) {
                if (this.field_q == 5 &&
                  this.field_h == -1) {
                  var6_ref = new RoamingCountryHuman(var4_int, var5, 3);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (5 == this.field_q) {
                    var6_ref = AccountServerResult.createHuman(52, var4_int, 23, var5);
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (7 != this.field_q) {
                      var6_ref = AccountServerResult.createHuman(105, var4_int, SpriteEffectHelpers.randomInt(9), var5);
                      if (var9 != 0) {
                        var6_ref = AccountServerResult.createHuman(68, var4_int, 28, var5);
                        var6_ref = new ArrivingPassenger(var4_int, var5, 3);
                      }
                    } else {
                      var6_ref = AccountServerResult.createHuman(68, var4_int, 28, var5);
                      if (var9 != 0) {
                        var6_ref = new ArrivingPassenger(var4_int, var5, 3);
                      }
                    }
                  }
                }
              } else {
                var6_ref = new ArrivingPassenger(var4_int, var5, 3);
              }
              this.field_f = this.field_f + 1;
              this.zombies.addFirst(0, (IntrusiveNode) (var6_ref));
              this.field_gb.recountUnits((byte) -106);
              ((Human) (var6_ref)).updateGridCell((byte) 124);
              decompiledFrameRemainder1 = (var9 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (AchievementSubmission.field_p[74]) {
                this.addBloodSplatter(var5, true, 119, var4_int);
                decompiledFrameRemainder1 = (var9 != 0);
              }
              if (decompiledFrameRemainder1) {
                stackIn_50_0 = (AchievementSubmission.field_p[86]) ? 100 : 1;
                var6 = stackIn_50_0;
                var7 = 0;
                while (var7 < var6) {
                  var8 = new Zombie(var4_int, var5, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 2, param2 ^ 31099), 0);
                  this.zombies.addFirst(0, var8);
                  var8.updateGridCell((byte) -1);
                  var7++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  this.field_gb.recountUnits((byte) -106);
                }
              }
            }
            this.field_F = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "hi.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void updateHover(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          if (AchievementSubmission.field_i) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_ib == 0) {
            if (null == this.field_kb) {
              if (null != this.field_a) {
                this.field_a.field_ob = false;
                this.field_a = null;
                if (var3 != 0) {
                  this.field_kb.field_qb = false;
                  this.field_kb.field_cb = false;
                  this.field_kb = null;
                }
              }
            } else {
              this.field_kb.field_qb = false;
              this.field_kb.field_cb = false;
              this.field_kb = null;
            }
            this.field_a = (Human) (this.findMoverAtScreen(FadingModalPanel.field_K, true, (byte) -87, KeyStateHelpers.field_b));
            if ((this.field_Q.isHumanPowerupSelected(-112)) &&
              (decompiledFrameRemainder0 = (this.field_a != null))) {
              this.field_a.field_ob = true;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_kb = (Zombie) (this.findMoverAtScreen(FadingModalPanel.field_K, false, (byte) -83, KeyStateHelpers.field_b));
              if (null != this.field_kb) {
                if (!this.field_kb.isPlayerOwned((byte) -126)) {
                  this.field_kb = null;
                  if (var3 != 0) {
                    if (!this.field_Q.isZombiePowerupSelected((byte) 113)) {
                      this.field_kb.field_qb = true;
                      this.field_kb.field_cb = true;
                    } else {
                      this.field_kb.field_cb = true;
                    }
                  }
                } else {
                  if (!this.field_Q.isZombiePowerupSelected((byte) 113)) {
                    this.field_kb.field_qb = true;
                    if (var3 != 0) {
                      this.field_kb.field_cb = true;
                    }
                  } else {
                    this.field_kb.field_cb = true;
                  }
                }
              }
            }
          }
          if (param0 > -126) {
            this.field_m = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.AA(" + param0 + ')');
        }
    }

    static int intOr(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void triggerQuake(byte param0) {
        try {
          this.field_r = 500;
          this.field_L = MenuSelection.startTrackedSoundEffect(127, 74);
          if (param0 != 9) {
            field_Y = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.KA(" + param0 + ')');
        }
    }

    private final void tickWorld(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_10_0 = 0;
        IntrusiveNode stackIn_29_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_130_0 = false;
        int stackIn_226_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        IntrusiveNode var5_ref_le = null;
        Blast var5_ref_ck = null;
        GooPuddle var5_ref_mm = null;
        ScreechEffect var5_ref_nc = null;
        ScorePopup var5_ref_ao = null;
        int var5 = 0;
        IntrusiveNode var6 = null;
        Object var6_ref = null;
        RegionPowerupEffect var6_ref2 = null;
        RegionPowerupEffect var7_ref_mn = null;
        int var7 = 0;
        WorldObject var7_ref_fb = null;
        int[] var7_ref_int__ = null;
        Zombie var8_ref_kd = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RegionPowerupEffect var7_ref_mnLifetime1;
        boolean stackIn_130_0Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime3;
        int var8Lifetime3;
        int var9Lifetime4;
        int var10Lifetime2;
        var13 = ZombieDawn.field_J;
        try {
          if (param0 != 93) {
            return;
          }
          if (this.field_ib != -1) {
            stackIn_10_0 = (this.field_gb.isTimeUp(16284)) ? 0 : 1;
            var2_int = stackIn_10_0;
            this.field_gb.update(this.field_G, 0);
            if (var2_int != 0 &&
              this.field_gb.isTimeUp(16284)) {
              Blast.handleTutorialEvent(-6, 6836);
            }
            this.navigation.updateWaypointGraphBuild(false);
            var3 = 0;
            var4 = 0;
            var5_ref_le = this.zombies.last((byte) 26);
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (!(var5_ref_le instanceof WorldObject)))) {
              var6 = var5_ref_le.previous;
              ((WorldObject) (var5_ref_le)).tick(119);
              stackIn_29_0 = var5_ref_le;
              if (var13 == 0) {
                if (stackIn_29_0 instanceof Zombie) {
                  var3++;
                }
                if (var5_ref_le instanceof ArmySoldier) {
                  var4++;
                }
                var5_ref_le = var6;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_29_0 = this.field_m.last((byte) 26);
            }
            var5_ref_ck = (Blast) (stackIn_29_0);
            while (null != var5_ref_ck) {
              var5_ref_ck.tick(-11367);
              var5_ref_ck = (Blast) (this.field_m.previous(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_mm = (GooPuddle) (this.field_lb.last((byte) 26));
            while (null != var5_ref_mm) {
              var5_ref_mm.update(-25687);
              var5_ref_mm = (GooPuddle) (this.field_lb.previous(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_nc = (ScreechEffect) (this.field_e.last((byte) 26));
            while (null != var5_ref_nc) {
              var5_ref_nc.update(false);
              var5_ref_nc = (ScreechEffect) (this.field_e.previous(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_ao = (ScorePopup) (this.field_i.last((byte) 26));
            while (null != var5_ref_ao) {
              var5_ref_ao.tick(param0 + 21);
              var5_ref_ao = (ScorePopup) (this.field_i.previous(false));
              if (var13 != 0) {
                return;
              }
            }
            var5 = 0;
            var6_ref = null;
            var7_ref_mn = (RegionPowerupEffect) (this.field_v.last((byte) 26));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7_ref_mn))) {
              var6_ref2 = (RegionPowerupEffect) (this.field_v.previous(false));
              stackOut_55_0 = var7_ref_mn.update(true);
              stackIn_63_0 = stackOut_55_0 ? 1 : 0;
              stackIn_56_0 = stackOut_55_0;
              if (var13 == 0) {
                if (stackIn_56_0) {
                  var5 = 1;
                }
                var7_ref_mn = var6_ref2;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_63_0 = var5;
            }
            boolean decompiledFrameCompleted1 = true;
            if (stackIn_63_0 != 0) {
              var7_ref_mnLifetime1 = (RegionPowerupEffect) (this.field_v.last((byte) 26));
              while (var7_ref_mnLifetime1 != null) {
                var7_ref_mnLifetime1.finishImmediately((byte) 76);
                var7_ref_mnLifetime1 = (RegionPowerupEffect) (this.field_v.previous(false));
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                this.onWallsChanged(true);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_h == -1) {
              boolean decompiledFrameRemainder1 = true;
              var7 = this.field_q;
              if ((var7 != 4) &&
                (decompiledFrameRemainder1 = (5 != var7 ||
                var13 != 0))) {
                decompiledFrameRemainder2 = (var7 == 6);
                if ((decompiledFrameRemainder2) &&
                  (var13 == 0)) {
                  var7_ref_fb = (WorldObject) (this.spatialGrid.firstObjectInCellRect(0, 0, this.spatialGrid.field_d, 1, true));
                  while (null != var7_ref_fb) {
                    stackIn_130_0 = var7_ref_fb instanceof Zombie;
                    if (stackIn_130_0) {
                      var8_ref_kd = (Zombie) (var7_ref_fb);
                      if (var8_ref_kd.isPlayerOwned((byte) -126) &&
                        var8_ref_kd.getY(237239984) < 288) {
                        var8_ref_kd.field_fb = -1;
                        var8_ref_kd.field_qb = false;
                        var8_ref_kd.field_cb = false;
                        var8_ref_kd.unlinkSecondary((byte) -20);
                        var8_ref_kd.deselect((byte) -114);
                        var8_ref_kd.setPath(this.navigation.findPath(true, var8_ref_kd.getX(true), 120, this.navigation.width - 1, var8_ref_kd.getY(237239984)), true);
                        this.field_gb.incrementCrossedCount(true);
                        if (60 >= this.field_gb.getElapsedSeconds(-106)) {
                          this.awardAchievement(233, 22, (byte) -23);
                        }
                      }
                    }
                    var7_ref_fb = (WorldObject) (this.spatialGrid.nextQueryObject(false));
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                fieldTemp$0 = this.field_jb - 1;
                this.field_jb = this.field_jb - 1;
                decompiledFrameRemainder2 = !(fieldTemp$0 > 0);
                if (decompiledFrameRemainder2) {
                  this.field_jb = 100;
                  if (this.field_gb.field_a < 600) {
                    this.field_jb = 650;
                  }
                  var7Lifetime3 = SpriteEffectHelpers.randomInt(3);
                  var8 = 240 * var7Lifetime3 + 156;
                  var9 = 0;
                  var8 = -12 + (264 + 288 * var7Lifetime3);
                  var10 = 0;
                  while (var10 < 18) {
                    var11 = SpriteEffectHelpers.randomInt(24) + var8;
                    var12 = SpriteEffectHelpers.randomInt(9);
                    this.zombies.addFirst(0, new ArrivingPassenger(var11, var9, var12));
                    var9 -= 30;
                    var10++;
                    if (var13 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    decompiledFrameRemainder2 = (var13 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameCompleted0)) {
                fieldTemp$1 = this.field_jb - 1;
                this.field_jb = this.field_jb - 1;
                if (fieldTemp$1 <= 0) {
                  var7_ref_int__ = new int[]{0, 3, 5, 2, 30, 26, 24};
                  var8Lifetime3 = SpriteEffectHelpers.randomInt(this.field_k);
                  var9Lifetime4 = this.field_D[var8Lifetime3];
                  var10Lifetime2 = this.field_s[var8Lifetime3];
                  var11Lifetime1 = SpriteEffectHelpers.randomElement(var7_ref_int__);
                  var9Lifetime4 = var9Lifetime4 + SpriteEffectHelpers.randomInt(48);
                  var10Lifetime2 = var10Lifetime2 + SpriteEffectHelpers.randomInt(48);
                  this.field_jb = 25;
                  this.zombies.addFirst(0, new RoamingCountryHuman(var9Lifetime4, var10Lifetime2, var11Lifetime1));
                }
              }
            }
            stackIn_130_0Lifetime1 = this.field_gb.isTimeUp(16284);
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_130_0Lifetime1 &&
              this.field_h != -1) {
              if (LoginDialogGlobals.field_c == 0) {
                LoginDialogGlobals.field_c = 1;
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (LoginDialogGlobals.field_c == 4)) {
                if (LevelHud.field_f < 0.0f &&
                  0.0f > NameAvailabilityValidator.field_j) {
                  NameAvailabilityValidator.field_j = -1.0f;
                  LevelHud.field_f = 0.0f;
                  var7Lifetime1 = 0;
                  while (true) {
                    if (var7Lifetime1 < 4) {
                      var8Lifetime1 = -15 + GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 30, param0 - 92);
                      var9Lifetime1 = GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 30, 1) - 15;
                      this.zombies.addFirst(param0 ^ 93, AccountServerResult.createHuman(123, var8Lifetime1 + this.navigation.field_A.field_c, 19, this.navigation.field_A.field_o + var9Lifetime1));
                      var7Lifetime1++;
                      if (var13 == 0) {
                        continue;
                      }
                    } else {
                      this.addBlast(3, this.navigation.field_A.field_o, true, this.navigation.field_A.field_c);
                    }
                    break;
                  }
                  if (var13 != 0) {
                    if (0 == this.field_E &&
                      var3 > var4) {
                      NameAvailabilityValidator.field_j = 0.0f;
                      LevelHud.field_f = 6.0f;
                    }
                    fieldTemp$2 = this.field_E + 1;
                    this.field_E = this.field_E + 1;
                    if (fieldTemp$2 > 400) {
                      this.field_E = 0;
                    }
                  }
                } else {
                  if (0 == this.field_E &&
                    var3 > var4) {
                    NameAvailabilityValidator.field_j = 0.0f;
                    LevelHud.field_f = 6.0f;
                  }
                  fieldTemp$2 = this.field_E + 1;
                  this.field_E = this.field_E + 1;
                  if (fieldTemp$2 > 400) {
                    this.field_E = 0;
                  }
                }
              }
            }
            if (this.navigation.field_A.field_c != -1 &&
              this.navigation.field_A.field_o != -1) {
              if (NameAvailabilityValidator.field_j >= 0.0f) {
                NameAvailabilityValidator.field_j = NameAvailabilityValidator.field_j + LevelHud.field_f;
                LevelHud.field_f = LevelHud.field_f - 0.18000000715255737f;
              }
              if (LoginDialogGlobals.field_c > 0 &&
                LoginDialogGlobals.field_c < 4) {
                fieldTemp$3 = EmailSyntaxValidator.field_h + 1;
                EmailSyntaxValidator.field_h = EmailSyntaxValidator.field_h + 1;
                if (fieldTemp$3 > 2) {
                  EmailSyntaxValidator.field_h = 0;
                  fieldTemp$4 = LoginDialogGlobals.field_c + 1;
                  LoginDialogGlobals.field_c = LoginDialogGlobals.field_c + 1;
                  if (20 < fieldTemp$4) {
                    LoginDialogGlobals.field_c = 0;
                  }
                }
              }
            }
            var9Lifetime2 = this.field_q;
            if (var9Lifetime2 != 4 &&
              var9Lifetime2 != 5) {
              return;
            }
            if (var9Lifetime2 == 4 ||
              var13 != 0) {
              if (this.field_h == -1) {
                return;
              }
              if (this.field_h == 5 &&
                IconButtonPainter.field_t <= 40) {
                return;
              }
              var9Lifetime2 = 1793;
              var10Lifetime1 = (int)(MusicCrossfadeStream.field_p % (long)var9Lifetime2);
              if (var10Lifetime1 == 0) {
                EmptyWidgetPainter.queueSoundEffect(122, false);
              }
              if ((var10Lifetime1 != 0 ||
                var13 != 0) &&
                var10Lifetime1 == 60) {
                EmptyWidgetPainter.queueSoundEffect(SpriteEffectHelpers.randomInt(3) + 119, false);
              }
              if (var13 == 0) {
                return;
              }
            }
            var7Lifetime2 = 419;
            var8Lifetime2 = (int)(MusicCrossfadeStream.field_p % (long)var7Lifetime2);
            if (0 != var8Lifetime2) {
              return;
            }
            stackIn_226_0 = (MusicCrossfadeStream.field_p % 2L != 0L) ? 138 : 137;
            var9Lifetime3 = stackIn_226_0;
            EmptyWidgetPainter.queueSoundEffect(var9Lifetime3, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.T(" + param0 + ')');
        }
    }

    private final void handleLeftClick(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          var4_int = 109 % ((param0 + 77) / 40);
          if (!TutorialTipHelpers.handleTipClick(param2, false, param1)) {
            if (this.field_Q.handleBarClick((byte) 118, param2, param1)) {
              return;
            }
            if (this.field_Q.isZombiePowerupSelected((byte) 126) &&
              null != this.field_kb) {
              this.selectZombie(this.field_kb, (byte) -2);
              this.field_Q.applyToMover(67, this.field_kb);
              return;
            }
            if (this.field_Q.isHumanPowerupSelected(-107) &&
              null != this.field_a) {
              if (!AchievementSubmission.field_p[81]) {
                this.deselectAll((byte) -114);
              }
              this.field_Q.applyToMover(67, this.field_a);
              return;
            }
            if (!this.field_Q.isAreaPowerupSelected(true) &&
              !this.field_Q.isGlobalPowerupSelected(121)) {
              if (null == this.field_kb) {
                if (this.field_W.size(false) <= 0) {
                  return;
                }
                this.issueMoveOrder(this.camera.screenToWorldY(param2, true), this.camera.screenToWorldX(param1, false), 122);
                if (var5 == 0) {
                  return;
                }
              }
              this.selectZombie(this.field_kb, (byte) -2);
              Blast.handleTutorialEvent(-3, 6836);
              if (var5 == 0) {
                return;
              }
            }
            this.field_Q.applyAtPoint(this.camera.screenToWorldY(param2, true), this.camera.screenToWorldX(param1, false), false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var4), "hi.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void addBloodSplatter(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_d.size(-46) > 200) {
            var5_int = 0;
            while (var5_int < 5) {
              this.field_d.removeLast(67);
              var5_int++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_d.addFirst(0, new BloodSplat(param3, param0, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
            this.field_d.addFirst(0, new BloodSplat(param3 + 15, param0, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
            this.field_d.addFirst(0, new BloodSplat(-15 + param3, param0, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
            this.field_d.addFirst(0, new BloodSplat(param3, param0 - 15, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
          }
          if (param2 < 109) {
            this.selectZombie((Zombie) null, (byte) -74);
          }
          this.field_d.addFirst(0, new BloodSplat(param3, 15 + param0, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
          if (!this.navigation.isWalkable(false, param0 - 24, param3, true) &&
            !this.navigation.isWalkable(false, -24 + param0, param3 + 24, true) &&
            !this.navigation.isWalkable(false, param0 - 24, -24 + param3, true) &&
            this.navigation.isWalkable(false, param0, param3, true)) {
            param0 = param0 - (24 + param0 % 24);
            this.zombies.addFirst(0, new BloodSplat(param3, param0, 6 + GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
            this.field_d.addFirst(0, new BloodSplat(param3, 24 + param0, GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 6, 1), param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5), "hi.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void playLevelMusic(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 9091) {
            this.field_e = (IntrusiveDeque) null;
          }
          WhirlpoolHasher.playMusicById(this.getMusicTrack(false), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.MA(" + param0 + ')');
        }
    }

    private final void initializeLevel(boolean param0) {
        int stackIn_16_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_82_0 = 0;
        LevelHud stackIn_91_1 = null;
        LevelHud stackIn_91_2 = null;
        LevelHud stackIn_92_1 = null;
        LevelHud stackIn_92_2 = null;
        int stackIn_92_3 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        boolean stackIn_95_2 = false;
        boolean stackIn_117_0 = false;
        boolean stackIn_124_1 = false;
        int stackIn_142_0 = 0;
        int stackIn_143_1 = 0;
        LevelHud stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        boolean stackIn_160_2 = false;
        LevelHud stackIn_166_0 = null;
        boolean stackIn_167_1 = false;
        LevelHud stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        boolean stackIn_174_2 = false;
        LevelHud stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        boolean stackIn_184_2 = false;
        LevelHud stackIn_187_0 = null;
        boolean stackIn_188_1 = false;
        int stackIn_251_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        LaserBarrier stackIn_300_0 = null;
        boolean stackIn_301_1 = false;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_320_1 = 0;
        int stackIn_331_0 = 0;
        int stackIn_331_1 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_393_0 = 0;
        int stackIn_415_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        WorldObject var4 = null;
        String var4_ref = null;
        PaletteBitmapFont var5 = null;
        PcmSampleStream var6_ref_fn = null;
        boolean[][] var6_ref_boolean____ = null;
        int var6 = 0;
        boolean[][] var7_ref_boolean____ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        LaserBarrier var9_ref_kc = null;
        Zombie var9_ref_kd = null;
        int var10_int = 0;
        Path var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Zombie var9_ref_kdLifetime1;
        Path var10Lifetime1;
        int stackIn_304_0Lifetime1;
        int stackIn_304_1Lifetime1;
        int stackIn_331_0Lifetime1;
        int stackIn_331_1Lifetime1;
        int stackIn_351_0Lifetime1;
        int stackIn_351_1Lifetime1;
        int stackIn_374_0Lifetime1;
        int stackIn_374_1Lifetime1;
        int stackIn_393_0Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var16Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var11Lifetime2;
        int stackIn_351_0Lifetime1Lifetime1;
        int stackIn_351_1Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var17 = ZombieDawn.field_J;
        try {
          var2_int = 15 + this.getMusicTrack(false);
          BlastParticle.field_d.queueResourceGroup(false, 13);
          if (this.field_bb == 1) {
            BlastParticle.field_d.queueResourceGroup(false, 14);
          }
          BlastParticle.field_d.queueResourceGroup(param0, this.tileMap.field_a);
          BlastParticle.field_d.queueResourceGroup(param0, var2_int);
          if (!BlastParticle.field_d.isQueueEmpty((byte) 115)) {
            return;
          }
          boolean decompiledFrameRemainder4 = true;
          this.field_w = true;
          this.field_M = false;
          this.field_p = param0;
          this.field_kb = null;
          this.field_W = new DualLinkDeque();
          this.field_b = new MoveTargetMarker();
          this.field_nb = 0;
          EmailSyntaxValidator.field_h = 0;
          this.field_E = 0;
          TileMap.field_q = -1;
          AlternateLongAndNameCredentials.field_m = true;
          this.field_hb = 0;
          this.field_o = 0;
          LoginDialogGlobals.field_c = 0;
          this.field_P = 0;
          AbstractSprite.field_b = -1;
          this.field_r = 0;
          this.field_fb = 0;
          MouseWheelInput.field_c = 0;
          this.navigation = new LevelNavigation(this.tileMap);
          this.field_u = new int[3];
          this.field_J = new int[3];
          RegionPowerupEffect.resetLevelState(false);
          HotspotTextWidget.stopAllSoundEffects(9);
          this.spatialGrid = new SpatialGrid(1 + (this.navigation.width >> 7), 1 + (this.navigation.height >> 7));
          this.camera = new Camera(this.navigation.width, this.navigation.height);
          this.camera.setFlyoverCurve(this.tileMap.field_b[1], this.tileMap.field_b[3], this.tileMap.field_m[2], this.tileMap.field_m[0], this.tileMap.field_b[0], this.tileMap.field_m[1], this.tileMap.field_m[3], this.tileMap.field_b[2], 106);
          this.camera.startFlyover((byte) -98);
          this.configureThemeTiles(8, this.tileMap.field_a);
          this.tileMap.updateAnimatedTileFrames(0, true);
          this.field_m = new IntrusiveDeque();
          this.field_lb = new IntrusiveDeque();
          this.field_d = new IntrusiveDeque();
          this.field_e = new IntrusiveDeque();
          this.field_v = new IntrusiveDeque();
          this.field_T = new IntrusiveDeque();
          this.field_i = new IntrusiveDeque();
          this.zombies = this.tileMap.createLevelObjects((byte) 106);
          SpriteEffectHelpers.sortByDepth(this.zombies);
          this.field_f = 0;
          this.field_l = 0;
          LoginNameSupport.field_c = null;
          if ((this.field_q == 4 ||
            this.field_q == 7) && this.field_h == 0) {
            stackIn_16_0 = 1;
            decompiledFrameRemainder4 = false;
          }
          else {
            stackIn_16_0 = 0;
          }
          var3 = stackIn_16_0;
          var4 = (WorldObject) (this.zombies.last((byte) 26));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var4))) {
            stackOut_18_0 = var4 instanceof PowerupPickup;
            stackIn_82_0 = stackOut_18_0 ? 1 : 0;
            stackIn_19_0 = stackOut_18_0;
            if (var17 == 0) {
              boolean decompiledFrameRemainder3 = true;
              if (stackIn_19_0 &&
                var4.field_C &&
                NameCharacterHelpers.field_a) {
                var4.unlink(-27598);
              } else {
                if (var4 instanceof Human) {
                  if (var4.field_C &&
                    !NameCharacterHelpers.field_a) {
                    var4.unlink(-27598);
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    if (!((Human) (var4)).field_ib) {
                      this.field_f = this.field_f + 1;
                    }
                  }
                }
                if (decompiledFrameRemainder3) {
                  if (!(var4.field_z <= 0) ||
                    var4 instanceof Mover) {
                    var4.updateGridCell((byte) -85);
                    if (var4.matchesTypeMask((byte) 99, 4)) {
                      this.field_u[-1 + var4.field_z] = this.field_u[-1 + var4.field_z] + 1;
                    }
                    if (var4.matchesTypeMask((byte) 38, 1) &&
                      0 < var4.field_z) {
                      this.field_J[-1 + var4.field_z] = this.field_J[-1 + var4.field_z] + 1;
                    }
                  }
                  if (var4 instanceof Alien) {
                    var4.updateGridCell((byte) 127);
                  }
                  if (var3 != 0 &&
                    var4 instanceof Zombie) {
                    ((Zombie) (var4)).setDisguised(-23221);
                    if (this.field_q == 7) {
                      var3 = 0;
                    }
                  }
                  if (var4 instanceof LaserBarrier) {
                    ((LaserBarrier) (var4)).measureBeamLength(this.navigation, false);
                  }
                }
              }
              var4 = (WorldObject) (this.zombies.previous(false));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_db = 0;
            stackIn_82_0 = 6;
          }
          if (stackIn_82_0 == this.field_q &&
            3 == this.field_h) {
            this.field_db = 13;
          }
          this.field_Q = new PowerupBar();
          stackIn_91_1 = null;
          stackIn_91_2 = null;
          if (!NameCharacterHelpers.field_a) {
            stackIn_92_1 = null;
            stackIn_92_2 = null;
            stackIn_92_3 = 1 + this.tileMap.field_j;
          } else {
            stackIn_92_1 = null;
            stackIn_92_2 = null;
            stackIn_92_3 = this.tileMap.field_s + 1;
          }
          this.field_gb = new LevelHud(stackIn_92_3);
          TextDecodeHelpers.refreshMinimapPassability(128);
          ScreechEffect.createNoiseTexture(11800);
          RasterCanvasSizeTarget.buildPathDistanceGrid((byte) 100);
          SweepingSpotlight.createSoftCircleSprite(param0);
          stackIn_94_0 = this.field_q;
          stackIn_94_1 = this.field_h;
          stackIn_95_2 = !(param0);
          LoginPanel.resetTutorialTipState(stackIn_94_0, stackIn_94_1, stackIn_95_2);
          AchievementSubmission.field_i = false;
          if (-1 == this.field_h) {
            var4_ref = Alien.field_S;
            if (this.field_q == 3 ||
              this.field_q == 7) {
              if (7 != this.field_q) {
                if (3 == this.field_q) {
                  this.awardAchievement(248, 7, (byte) -23);
                  if (var17 != 0) {
                    this.awardAchievement(231, 24, (byte) -23);
                  }
                }
              } else {
                this.awardAchievement(231, 24, (byte) -23);
              }
              CutsceneStartHelpers.startCutscene(1, this.field_bb);
              var4_ref = HotspotTextWidget.field_M;
            }
          } else {
            var4_ref = WidgetStyleLayer.field_w[this.field_q][this.field_h];
          }
          var5 = ProgressMessageDialog.field_jb;
          this.field_V = new Sprite(var5.textWidth(var4_ref), var5.field_I + var5.field_x);
          this.field_t = new Sprite(12 + this.field_V.field_w, 12 + this.field_V.field_t);
          this.field_V.setAsRenderTarget();
          this.field_N = 640;
          var5.drawStringCentered(var4_ref, this.field_V.field_w / 2, this.field_V.field_t - var5.field_x, 2, -1);
          this.field_t.setAsRenderTarget();
          this.field_V.drawSilhouette(6, 6, 16777215);
          Rasterizer.blurRectangle(4, 4, 0, 0, Rasterizer.width, Rasterizer.height);
          this.field_V.drawSilhouette(6, 6, 0);
          DisplayState.field_f.makeRasterTarget(96);
          stackIn_117_0 = !param0;
          stackIn_124_1 = (this.field_q == 0) && (this.field_h == 5);
          boolean decompiledFrameRemainder1 = true;
          WeightedLruCache.setTorchlightMode(stackIn_117_0, stackIn_124_1);
          if (1 == this.field_q && (this.field_h == 1 ||
            this.field_h == 4)) {
            MenuSelection.startTrackedSoundEffect(125, 53);
            decompiledFrameRemainder1 = (var17 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_q == 5) {
              stackIn_142_0 = 127;
              if (0 == this.field_h % 2) {
                stackIn_143_1 = 147;
              } else {
                stackIn_143_1 = 148;
              }
              var6_ref_fn = MenuSelection.startTrackedSoundEffect(stackIn_142_0, stackIn_143_1);
              var6_ref_fn.setVolume(2 * var6_ref_fn.getTargetVolume());
              if (2 == this.field_h ||
                3 == this.field_h) {
                MenuSelection.startTrackedSoundEffect(126, 145);
              }
              decompiledFrameRemainder1 = (var17 != 0);
            }
            if ((decompiledFrameRemainder1) &&
              (6 != this.field_q)) {
            }
          }
          stackIn_159_0 = this.field_gb;
          stackIn_159_1 = 49;
          stackIn_160_2 = (7 == this.field_q) && (this.field_h == 5);
          ((LevelHud) (Object) stackIn_159_0).setSpecialTargetMode(stackIn_159_1, stackIn_160_2);
          stackIn_166_0 = this.field_gb;
          stackIn_167_1 = (this.field_q == 4) && (this.field_h == -1);
          ((LevelHud) (Object) stackIn_166_0).setCountOnlyMode(stackIn_167_1, (byte) -13);
          stackIn_173_0 = this.field_gb;
          stackIn_173_1 = 10;
          stackIn_174_2 = (this.field_q == 5) && (this.field_h == -1);
          boolean decompiledFrameRemainder2 = true;
          ((LevelHud) (Object) stackIn_173_0).setEnemyVictimMode(stackIn_173_1, stackIn_174_2);
          stackIn_178_0 = this.field_gb;
          stackIn_178_1 = 0;
          if ((1 == this.field_q ||
            this.field_q == 6) && this.field_h == -1) {
            stackIn_184_2 = true;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_184_2 = false;
          }
          ((LevelHud) (Object) stackIn_178_0).setCrossingCounterMode(stackIn_178_1, stackIn_184_2);
          stackIn_187_0 = this.field_gb;
          stackIn_188_1 = !(param0);
          ((LevelHud) (Object) stackIn_187_0).setLetterbox(stackIn_188_1, AchievementSubmission.field_i);
          if (this.field_q == 0 &&
            this.field_h != -1 ||
            1 == this.field_q &&
            5 == this.field_h ||
            this.field_q == 1 &&
            this.field_h == -1 ||
            this.field_q == 2 &&
            this.field_h == 5 ||
            this.field_q == 6 &&
            this.field_h == 3 ||
            this.field_q == 6 &&
            4 == this.field_h ||
            this.field_q == 6 &&
            this.field_h == 5 ||
            this.field_q == 5 &&
            this.field_h != -1 ||
            7 == this.field_q) {
            this.field_gb.hideTimer(0);
            this.navigation.field_A.field_c = -1;
            this.navigation.field_A.field_o = -1;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted1 = true;
          regionExit1: {
            boolean decompiledFrameCompleted2 = true;
            if (this.field_h == -1) {
              this.navigation.field_A.field_o = -1;
              this.navigation.field_A.field_c = -1;
              if (5 != this.field_q) {
                if (this.field_q != 6) {
                  break regionExit1;
                }
                var6_ref_boolean____ = new boolean[4][6];
                var7_ref_boolean____ = new boolean[4][6];
                var8 = 0;
                scanLoop2: while (true) {
                  stackIn_251_0 = -4;
                  scanLoop3: while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_251_0 >= ~var8) {
                      stackIn_257_0 = 5;
                      decompiledFrameRemainder0 = (var17 == 0);
                      if ((decompiledFrameRemainder0) &&
                        (stackIn_257_0 >= var8)) {
                        break scanLoop3;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var8 = 0;
                      stackIn_257_0 = 0;
                    }
                    var9 = stackIn_257_0;
                    var10_int = 0;
                    while (true) {
                      stackIn_259_0 = -5;
                      stackIn_259_1 = ~var10_int;
                      if (stackIn_259_0 < stackIn_259_1) {
                        var11 = 0;
                        stackIn_251_0 = 0;
                        if (var17 != 0) {
                          continue scanLoop3;
                        }
                        var12 = stackIn_251_0;
                        while (var12 < 6) {
                          var6_ref_boolean____[var10_int][var12] = true;
                          var7_ref_boolean____[var10_int][var12] = true;
                          stackIn_259_0 = var12;
                          stackIn_259_1 = 5;
                          if (stackIn_259_0 >= stackIn_259_1 ||
                            var10_int != 0 &&
                            !(SpriteEffectHelpers.randomInt(256) < 100)) {
                            var7_ref_boolean____[var10_int][var12] = true;
                            var13 = var12 - SpriteEffectHelpers.randomInt(var11 + 1);
                            if (var10_int == 0) {
                              var9 = var13;
                            } else {
                              if (var9 <= var12 &&
                                var9 >= (var12 - var11)) {
                                var8 = var8 + Math.abs(var9 - var13);
                                var9 = var13;
                              }
                            }
                            var6_ref_boolean____[var10_int][var13] = false;
                            var11 = 0;
                          } else {
                            var7_ref_boolean____[var10_int][var12] = false;
                            var11++;
                          }
                          var12++;
                        }
                        var10_int++;
                        continue;
                      }
                      break;
                    }
                    if (var17 == 0) {
                      continue scanLoop2;
                    }
                    break;
                  }
                  break;
                }
                var9_ref_kc = (LaserBarrier) (ScrollViewport.field_J.first((byte) 34));
                scanLoop4: while (true) {
                  if (var9_ref_kc != null) {
                    stackIn_304_0 = ~var9_ref_kc.field_V;
                    stackIn_304_1 = -2;
                    if (var17 != 0) {
                      if (stackIn_304_0 < stackIn_304_1) {
                        var9_ref_kd = this.spawnZombie(216, (byte) 122, -264 + this.navigation.width, 144, 48 + (this.navigation.height + 30));
                        var10 = new Path();
                        var10.addFirst(0, new Point(var9_ref_kd.getX(true), this.navigation.height - 168 + SpriteEffectHelpers.randomInt(96)));
                        var9_ref_kd.setPath(var10, true);
                        break regionExit1;
                      }
                      break scanLoop4;
                    }
                    if (stackIn_304_0 == stackIn_304_1) {
                      var10_intLifetime1 = (var9_ref_kc.getX(true) - 168) / 168;
                      var11Lifetime2 = (var9_ref_kc.getY(237239984) - 168) / 168;
                      var9_ref_kc.field_S = var7_ref_boolean____[var11Lifetime2][var10_intLifetime1];
                    } else {
                      stackIn_300_0 = var9_ref_kc;
                      stackIn_301_1 = !(param0);
                      var10_intLifetime1 = (((LaserBarrier) (Object) stackIn_300_0).getX(stackIn_301_1) - 24) / 168;
                      var11Lifetime2 = (var9_ref_kc.getY(237239984) - 288) / 168;
                      var9_ref_kc.field_S = var6_ref_boolean____[var11Lifetime2][var10_intLifetime1];
                    }
                    var9_ref_kc = (LaserBarrier) (ScrollViewport.field_J.next((byte) 111));
                    continue;
                  }
                  while (true) {
                    stackIn_304_0Lifetime1 = this.field_gb.field_k;
                    stackIn_304_1Lifetime1 = 99;
                    if (stackIn_304_0Lifetime1 >= stackIn_304_1Lifetime1) {
                      break;
                    }
                    var9_ref_kdLifetime1 = this.spawnZombie(216, (byte) 122, -264 + this.navigation.width, 144, 48 + (this.navigation.height + 30));
                    var10Lifetime1 = new Path();
                    var10Lifetime1.addFirst(0, new Point(var9_ref_kdLifetime1.getX(true), this.navigation.height - 168 + SpriteEffectHelpers.randomInt(96)));
                    var9_ref_kdLifetime1.setPath(var10Lifetime1, true);
                    if (var17 != 0) {
                      break regionExit1;
                    }
                  }
                  break;
                }
                if (var17 == 0) {
                  break regionExit1;
                }
              }
              this.field_s = new int[10];
              this.field_k = 0;
              this.field_D = new int[10];
              var6 = 0;
              var7 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (!(var7 < this.tileMap.field_r)))) {
                var8Lifetime2 = this.navigation.getRenderTile(var7, -34, var6) & 127;
                stackIn_320_0 = ~var8Lifetime2;
                stackIn_320_1 = -8;
                if (var17 == 0) {
                  if (stackIn_320_0 == stackIn_320_1) {
                    this.field_D[this.field_k] = (-2 + var6) * 24;
                    this.field_s[this.field_k] = var7 * 24;
                    this.field_k = this.field_k + 1;
                    this.navigation.field_A.tiles[var7][var6] = TextHotspotRegion.bitAnd(-128, this.navigation.field_A.tiles[var7][var6]);
                  }
                  var7++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_320_0 = this.tileMap.field_k;
                stackIn_320_1 = 1;
              }
              var6Lifetime2 = stackIn_320_0 - stackIn_320_1;
              var7Lifetime2 = 0;
              scanLoop5: while (true) {
                boolean decompiledFrameRemainder5 = true;
                if (this.tileMap.field_r > var7Lifetime2) {
                  var8Lifetime3 = 127 & this.navigation.getRenderTile(var7Lifetime2, 89, var6Lifetime2);
                  stackIn_331_0 = -8;
                  stackIn_331_1 = ~var8Lifetime3;
                  if (var17 != 0) {
                    if (stackIn_331_0 < stackIn_331_1) {
                      var8Lifetime3 = this.navigation.getRenderTile(var7Lifetime2, 109, var6Lifetime2) & 127;
                      stackIn_340_0 = ~var8Lifetime3;
                      stackIn_340_1 = -8;
                      break scanLoop5;
                    }
                    decompiledFrameRemainder5 = false;
                  }
                  else {
                    if (stackIn_331_0 == stackIn_331_1) {
                      this.field_D[this.field_k] = var6Lifetime2 * 24 + 24;
                      this.field_s[this.field_k] = 24 * var7Lifetime2;
                      this.field_k = this.field_k + 1;
                      this.navigation.field_A.tiles[var7Lifetime2][var6Lifetime2] = TextHotspotRegion.bitAnd(this.navigation.field_A.tiles[var7Lifetime2][var6Lifetime2], -128);
                    }
                    var7Lifetime2++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder5) {
                  var7Lifetime2 = 0;
                  var6Lifetime2 = 0;
                  while (true) {
                    stackIn_331_0Lifetime1 = var6Lifetime2;
                    stackIn_331_1Lifetime1 = this.tileMap.field_k;
                    if (stackIn_331_0Lifetime1 >= stackIn_331_1Lifetime1) {
                      break;
                    }
                    var8Lifetime3 = this.navigation.getRenderTile(var7Lifetime2, 109, var6Lifetime2) & 127;
                    stackIn_340_0 = ~var8Lifetime3;
                    stackIn_340_1 = -8;
                    if (var17 != 0) {
                      break scanLoop5;
                    }
                    if (stackIn_340_0 == stackIn_340_1) {
                      this.field_D[this.field_k] = 24 * var6Lifetime2 - 12;
                      this.field_s[this.field_k] = 24 * var7Lifetime2 - 48;
                      this.field_k = this.field_k + 1;
                      this.navigation.field_A.tiles[var7Lifetime2][var6Lifetime2] = TextHotspotRegion.bitAnd(-128, this.navigation.field_A.tiles[var7Lifetime2][var6Lifetime2]);
                    }
                    var6Lifetime2++;
                  }
                }
                stackIn_340_0 = this.tileMap.field_r;
                stackIn_340_1 = 1;
                break;
              }
              var7Lifetime3 = stackIn_340_0 - stackIn_340_1;
              var6Lifetime3 = 0;
              while (var6Lifetime3 < this.tileMap.field_k) {
                var8Lifetime4 = 127 & this.navigation.getRenderTile(var7Lifetime3, -63, var6Lifetime3);
                stackIn_351_0 = var8Lifetime4;
                stackIn_351_1 = 7;
                if (var17 != 0) {
                  if (stackIn_351_0 < stackIn_351_1) {
                    stackIn_371_0 = 0;
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_351_0 == stackIn_351_1) {
                  this.field_D[this.field_k] = (var6Lifetime3 - 1) * 24;
                  this.field_s[this.field_k] = 24 + var7Lifetime3 * 24;
                  this.field_k = this.field_k + 1;
                  this.navigation.field_A.tiles[var7Lifetime3][var6Lifetime3] = TextHotspotRegion.bitAnd(this.navigation.field_A.tiles[var7Lifetime3][var6Lifetime3], -128);
                }
                var6Lifetime3++;
              }
              if ((decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                this.navigation.field_A.rebuildDerivedLayers(0);
                var7Lifetime4 = 0;
                while (true) {
                  stackIn_351_0Lifetime1 = var7Lifetime4;
                  stackIn_351_1Lifetime1 = this.tileMap.field_r;
                  if (stackIn_351_0Lifetime1 >= stackIn_351_1Lifetime1) {
                    break;
                  }
                  stackIn_371_0 = 0;
                  if (var17 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var6Lifetime4 = stackIn_371_0;
                  while (var6Lifetime4 < this.tileMap.field_k) {
                    var8Lifetime5 = 127 & this.navigation.field_A.field_h[var7Lifetime4][var6Lifetime4];
                    stackIn_351_0Lifetime1Lifetime1 = var8Lifetime5;
                    stackIn_351_1Lifetime1Lifetime1 = 14;
                    if (stackIn_351_0Lifetime1Lifetime1 == stackIn_351_1Lifetime1Lifetime1 ||
                      var8Lifetime5 == 10 ||
                      2 == var8Lifetime5) {
                      this.navigation.field_A.field_h[var7Lifetime4][var6Lifetime4] = TextHotspotRegion.bitAnd(this.navigation.field_A.field_h[var7Lifetime4][var6Lifetime4], -128);
                    }
                    var6Lifetime4++;
                  }
                  var7Lifetime4++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted1)) {
            stackIn_371_0 = ~this.tileMap.field_a;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_371_0 == -9) {
            var6Lifetime1 = 0;
            while (true) {
              stackIn_374_0 = this.tileMap.field_r;
              stackIn_374_1 = var6Lifetime1;
              if (stackIn_374_0 <= stackIn_374_1) {
                break;
              }
              stackIn_415_0 = 0;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var7Lifetime1 = stackIn_415_0;
              while (true) {
                stackIn_378_0 = this.tileMap.field_k;
                stackIn_378_1 = var7Lifetime1;
                if (stackIn_378_0 > stackIn_378_1) {
                  var8Lifetime1 = this.navigation.field_A.field_h[var6Lifetime1][var7Lifetime1];
                  var9Lifetime1 = 127 & var8Lifetime1;
                  stackIn_374_0Lifetime1 = ~var9Lifetime1;
                  stackIn_374_1Lifetime1 = -61;
                  if (stackIn_374_0Lifetime1 <= stackIn_374_1Lifetime1) {
                    var10_array = new int[8];
                    var10_array[0] = TextHotspotRegion.bitAnd(this.navigation.field_A.field_h[-1 + var6Lifetime1][var7Lifetime1 - 1], 127);
                    var10_array[1] = TextHotspotRegion.bitAnd(this.navigation.field_A.field_h[0 + var6Lifetime1][var7Lifetime1 - 1], 127);
                    var10_array[2] = TextHotspotRegion.bitAnd(127, this.navigation.field_A.field_h[var6Lifetime1 + 1][-1 + var7Lifetime1]);
                    var10_array[3] = TextHotspotRegion.bitAnd(127, this.navigation.field_A.field_h[-1 + var6Lifetime1][0 + var7Lifetime1]);
                    var10_array[4] = TextHotspotRegion.bitAnd(127, this.navigation.field_A.field_h[var6Lifetime1 + 1][0 + var7Lifetime1]);
                    var10_array[5] = TextHotspotRegion.bitAnd(127, this.navigation.field_A.field_h[var6Lifetime1 - 1][1 + var7Lifetime1]);
                    var10_array[6] = TextHotspotRegion.bitAnd(this.navigation.field_A.field_h[0 + var6Lifetime1][1 + var7Lifetime1], 127);
                    var10_array[7] = TextHotspotRegion.bitAnd(this.navigation.field_A.field_h[1 + var6Lifetime1][var7Lifetime1 + 1], 127);
                    var11Lifetime1 = 1;
                    while (true) {
                      if (var11Lifetime1 != 0) {
                        var11Lifetime1 = 0;
                        stackIn_393_0 = 0;
                        var12Lifetime1 = stackIn_393_0;
                        while (var10_array.length - 1 > var12Lifetime1) {
                          stackIn_378_0 = var10_array[var12Lifetime1];
                          stackIn_378_1 = var10_array[1 + var12Lifetime1];
                          if (stackIn_378_0 > stackIn_378_1) {
                            var10_array[1 + var12Lifetime1] = DropTargetWidget.bitXor(var10_array[1 + var12Lifetime1], var10_array[var12Lifetime1]);
                            var10_array[var12Lifetime1] = DropTargetWidget.bitXor(var10_array[var12Lifetime1], var10_array[1 + var12Lifetime1]);
                            var10_array[1 + var12Lifetime1] = DropTargetWidget.bitXor(var10_array[1 + var12Lifetime1], var10_array[var12Lifetime1]);
                            var11Lifetime1 = 1;
                          }
                          var12Lifetime1++;
                        }
                        continue;
                      }
                      break;
                    }
                    stackIn_393_0Lifetime1 = 0;
                    var12Lifetime1Lifetime1 = stackIn_393_0Lifetime1;
                    var13Lifetime1 = 1;
                    var14 = var10_array[0];
                    var15 = 0;
                    var16 = 0;
                    while (var16 <= var10_array.length) {
                      stackIn_378_0 = ~var16;
                      stackIn_378_1 = ~var10_array.length;
                      if (stackIn_378_0 > stackIn_378_1 &&
                        ~var14 == ~var10_array[var16]) {
                        var15++;
                      } else {
                        if (var13Lifetime1 < var15) {
                          var12Lifetime1Lifetime1 = var14;
                          var13Lifetime1 = var15;
                        }
                        if (var10_array.length > var16) {
                          var14 = var10_array[var16];
                        }
                        var15 = 1;
                      }
                      var16++;
                    }
                    var16Lifetime1 = var12Lifetime1Lifetime1;
                    this.navigation.field_A.field_h[var6Lifetime1][var7Lifetime1] = GameWorld.intOr(TextHotspotRegion.bitAnd(-128, var8Lifetime1), var16Lifetime1);
                  }
                  var7Lifetime1++;
                  continue;
                }
                break;
              }
              var6Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            MarkerSliderPainter.field_g = this.navigation.field_A.field_o;
            this.field_ib = -1;
            NameAvailabilityValidator.field_j = -1.0f;
            MiasmaPuff.field_I = this.navigation.field_A.field_c;
            this.field_gb.update(this.field_G, 0);
            stackIn_415_0 = 120;
          }
          KeyStateHelpers.resetTrafficBoundsIntArgs(stackIn_415_0);
          this.playLevelMusic(9091);
          this.field_X = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.PA(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_Y = null;
          field_x = null;
          if (!param0) {
            field_Y = (String) null;
          }
          field_O = null;
          field_pb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "hi.G(" + param0 + ')');
        }
    }

    final boolean advanceToNextLevel(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.navigation &&
            null != this.navigation.field_A) {
            if (this.field_q == 3 &&
              this.field_h == -1) {
              return false;
            }
            if (!param0) {
              return true;
            }
            if (7 == this.field_q &&
              this.field_h == -1) {
              return false;
            }
            if (this.field_h == 5) {
              this.startLevel(this.loadLevelMap(this.field_q, (byte) 101, -1), (byte) -99);
              return true;
            }
            if (this.field_h != -1) {
              this.startLevel(this.loadLevelMap(this.field_q, (byte) 62, this.field_h + 1), (byte) -99);
              return true;
            }
            this.startLevel(this.loadLevelMap(this.field_q + 1, (byte) 54, 0), (byte) -99);
            return true;
          }
          this.startLevel(this.loadLevelMap(0, (byte) -124, 0), (byte) -99);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.FA(" + param0 + ')');
        }
    }

    private final void selectZombie(Zombie param0, byte param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0.isPlayerOwned((byte) -126)) {
            return;
          }
          if (!AchievementSubmission.field_p[81]) {
            this.deselectAll((byte) 25);
          }
          param0.select(param1 - 31338);
          if (param1 != -2) {
            this.addGooPuddle(-111, -8, -118);
          }
          this.field_W.addLast(param0, (byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hi.TA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void handleInput(byte param0) {
        boolean stackIn_38_0 = false;
        boolean stackIn_48_1 = false;
        int stackIn_96_0 = 0;
        int stackIn_97_1 = 0;
        boolean stackIn_118_0 = false;
        int stackIn_126_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0;
        boolean stackOut_117_0;
        WorldObject var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        WorldObject var4 = null;
        Zombie var5 = null;
        int var6 = 0;
        int var2_intLifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (AchievementSubmission.field_i) {
            return;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          this.field_C = this.field_C - this.field_Z * KeyStateHelpers.field_b;
          this.field_c = this.field_c - KeyStateHelpers.field_b;
          if ((this.field_ib == -1) &&
            (decompiledFrameRemainder1 = (GzipDecompressor.field_d == 1 ||
            AchievementSubmission.field_p[83]))) {
            this.field_ib = 0;
            Blast.handleTutorialEvent(-1, 6836);
            this.camera.resetPosition(-106);
            this.field_N = 0;
            decompiledFrameRemainder1 = (var6 != 0);
          }
          if ((decompiledFrameRemainder1) &&
            (this.field_ib == 0)) {
            if (GzipDecompressor.field_d == 1 ||
              2 == GzipDecompressor.field_d) {
              if (GzipDecompressor.field_d == 2 &&
                this.field_M &&
                this.field_p &&
                this.field_w) {
                var2 = (WorldObject) (this.zombies.last((byte) 26));
                while (null != var2) {
                  stackOut_37_0 = var2 instanceof Zombie;
                  stackIn_126_0 = stackOut_37_0 ? 1 : 0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var6 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_38_0) {
                    ((Zombie) (var2)).field_qb = false;
                  }
                  var2 = (WorldObject) (this.zombies.previous(false));
                }
              }
              if (decompiledFrameCompleted1) {
                this.field_M = true;
                this.field_B = KeyStateHelpers.field_b;
                stackIn_48_1 = (GzipDecompressor.field_d == 1);
                this.field_w = stackIn_48_1;
                this.field_j = FadingModalPanel.field_K;
                this.field_p = false;
                decompiledFrameRemainder1 = (var6 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted1)) {
              if ((!this.field_M ||
                LaserBarrier.field_R != 1 &&
                LaserBarrier.field_R != 2) &&
                (decompiledFrameRemainder1 = (this.field_M))) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledSharedTail0 = (this.field_p);
                if (!decompiledSharedTail0) {
                  if (this.field_w) {
                    this.handleLeftClick(96, KeyStateHelpers.field_b, FadingModalPanel.field_K);
                    decompiledFrameRemainder0 = (var6 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.handleRightClick(KeyStateHelpers.field_b, FadingModalPanel.field_K, 31098);
                    decompiledSharedTail0 = (var6 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledSharedTail0) &&
                  (this.field_w)) {
                  if (!AchievementSubmission.field_p[81] &&
                    !AchievementSubmission.field_p[82]) {
                    this.deselectAll((byte) 112);
                  }
                  this.selectZombiesInRect(this.camera.screenToWorldY(FadingModalPanel.field_K, true), this.camera.screenToWorldX(this.field_B, false), this.camera.screenToWorldY(this.field_j, true), 47, this.camera.screenToWorldX(KeyStateHelpers.field_b, false));
                  if (this.field_W.size(false) > 0) {
                    Blast.handleTutorialEvent(-3, 6836);
                  }
                }
                this.field_p = false;
                this.field_M = false;
                decompiledFrameRemainder1 = (var6 != 0);
              }
              if (decompiledFrameRemainder1) {
                var2_int = KeyStateHelpers.field_b - this.field_B;
                var3 = FadingModalPanel.field_K - this.field_j;
                if (!this.field_p) {
                  stackIn_96_0 = Math.abs(var2_int) + Math.abs(var3);
                  if (!this.field_w) {
                    stackIn_97_1 = 5;
                  } else {
                    stackIn_97_1 = 20;
                  }
                  if (stackIn_96_0 > stackIn_97_1) {
                    this.field_p = true;
                  }
                }
                if (this.field_p) {
                  if (!this.field_w) {
                    this.camera.scrollBy((byte) -123, var2_int, var3);
                    this.field_B = KeyStateHelpers.field_b;
                    this.field_j = FadingModalPanel.field_K;
                    decompiledFrameRemainder1 = (var6 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    this.field_Q.deselectCurrent((byte) -83);
                    if (!AchievementSubmission.field_p[81] &&
                      !AchievementSubmission.field_p[82]) {
                      this.deselectAll((byte) -112);
                    }
                    var4 = (WorldObject) (this.zombies.last((byte) 26));
                    while (var4 != null) {
                      stackOut_117_0 = var4 instanceof Zombie;
                      stackIn_126_0 = stackOut_117_0 ? 1 : 0;
                      stackIn_118_0 = stackOut_117_0;
                      if (var6 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_118_0) {
                        var5 = (Zombie) (var4);
                        if (var5.isPlayerOwned((byte) -126)) {
                          var5.field_qb = var5.isInsideRect(this.camera.screenToWorldX(this.field_B, false), this.camera.screenToWorldX(KeyStateHelpers.field_b, false), this.camera.screenToWorldY(this.field_j, true), this.camera.screenToWorldY(FadingModalPanel.field_K, true), false);
                        }
                      }
                      var4 = (WorldObject) (this.zombies.previous(false));
                    }
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_126_0 = -94 / ((-47 - param0) / 55);
          }
          var2_intLifetime1 = stackIn_126_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2_ref), "hi.V(" + param0 + ')');
        }
    }

    final void onWallsChanged(boolean param0) {
        boolean stackIn_4_0 = false;
        LevelNavigation stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        Mover stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        IntrusiveDeque stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        WorldObject var2 = null;
        RuntimeException var2_ref = null;
        Mover var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          Js5Archive.field_e.navigation.startWaypointGraphBuild(param0, -106);
          var2 = (WorldObject) (this.zombies.last((byte) 26));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackOut_3_0 = var2 instanceof Mover;
            stackIn_25_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var4 == 0) {
              if (stackIn_4_0) {
                var3 = (Mover) (var2);
                stackIn_10_0 = this.navigation;
                stackIn_11_1 = !(param0);
                if (!((LevelNavigation) (Object) stackIn_10_0).isWalkable(stackIn_11_1, var3.getY(237239984), var3.getX(true), false)) {
                  stackIn_17_0 = var3;
                  if (var3 instanceof Human) {
                    stackIn_18_1 = 0;
                  } else {
                    stackIn_18_1 = 4;
                  }
                  ((Mover) (Object) stackIn_17_0).setState(stackIn_18_1, -6904);
                }
              }
              stackIn_22_0 = this.zombies;
              stackIn_23_1 = !(param0);
              var2 = (WorldObject) (((IntrusiveDeque) (Object) stackIn_22_0).previous(stackIn_23_1));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = 6;
          }
          if (stackIn_25_0 != this.field_q ||
            this.field_h != 0) {
            if (this.field_q != 7) {
              return;
            }
            if (this.field_h != 0) {
              return;
            }
            if (!this.navigation.isWalkable(false, 1056, 972, false)) {
              return;
            }
            this.awardAchievement(232, 23, (byte) -23);
            if (var4 == 0) {
              return;
            }
          }
          if (0 == this.field_u[1] &&
            this.field_gb.getElapsedSeconds(-95) <= 120) {
            this.awardAchievement(236, 19, (byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2_ref), "hi.E(" + param0 + ')');
        }
    }

    final void addToSpatialGrid(boolean param0, WorldObject param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return;
          }
          this.spatialGrid.addObject(param1.field_u, -1, param1, param1.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("hi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean addBlast(int param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m.addFirst(0, new Blast(param3, param1, param0));
          if (!param2) {
            this.field_W = (DualLinkDeque) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5), "hi.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void saveLevelResult(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_p = false;
          }
          if (!MeleeHuman.isGuestSession(13296) &&
            !this.field_F) {
            stackIn_11_0 = 7 * this.field_q;
            if (this.field_h == -1) {
              stackIn_12_1 = 6;
            } else {
              stackIn_12_1 = this.field_h;
            }
            var2_int = stackIn_11_0 + stackIn_12_1;
            if (NameCharacterHelpers.field_a) {
              var2_int += 10000;
            }
            if (this.field_h != -1 &&
              !this.field_gb.isQuotaReached(true)) {
              stackIn_23_0 = 0;
            } else {
              stackIn_23_0 = 1;
            }
            var3 = stackIn_23_0;
            stackIn_27_0 = (var3 != 0) ? 1 : 0;
            var4 = stackIn_27_0;
            NameAvailabilityValidator.sendLevelResult(this.field_gb.getElapsedSeconds(-106), 16, var4, var2_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.VA(" + param0 + ')');
        }
    }

    final void submitScore(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_G > 0 &&
            !this.field_F &&
            null == BrowserUrlHelpers.field_b) {
            BrowserUrlHelpers.field_b = PacketRequestHelpers.createPendingRecordRequest(this.field_I, this.field_K, this.field_bb + 42, new int[]{this.field_G}, 1159192543, 3, this.field_ab, this.field_g, this.field_bb + 42 ^ 65535);
          }
          CutsceneStartHelpers.field_b = this.field_bb;
          if (param0) {
            this.spatialGrid = (SpatialGrid) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "hi.LA(" + param0 + ')');
        }
    }

    GameWorld(int param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_14_1 = false;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        this.field_eb = 0;
        this.field_c = 50340864;
        this.field_C = -604090368;
        this.field_F = false;
        this.field_Z = -12;
        this.field_ob = new IntrusiveDeque();
        this.field_r = 0;
        this.field_P = 0;
        this.field_nb = 0;
        this.field_G = 0;
        this.field_hb = 0;
        this.field_z = 0;
        this.field_b = new MoveTargetMarker();
        this.field_j = -1;
        this.field_B = -1;
        this.field_q = 0;
        this.field_p = false;
        this.field_o = 0;
        this.field_w = true;
        this.field_u = new int[3];
        this.field_U = 0;
        this.field_h = 0;
        this.field_X = false;
        this.field_kb = null;
        this.field_M = false;
        this.field_bb = 0;
        this.field_J = new int[3];
        this.field_cb = 0;
        this.field_l = 0;
        this.field_E = 0;
        this.field_a = null;
        try {
          Js5Archive.field_e = this;
          this.field_I = 47646;
          this.field_K = 15731621;
          stackIn_3_1 = param0 * 7;
          if (-1 != param1) {
            stackIn_4_2 = param1;
          } else {
            stackIn_4_2 = 6;
          }
          this.field_y = stackIn_3_1 + stackIn_4_2;
          this.field_g = 45364;
          this.field_ab = 799342592 + this.field_g;
          var3 = PasswordValidator.field_g;
          var4 = var3;
          var5 = 0;
          while (var5 < 8) {
            var4[var5] = 0;
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          stackIn_14_1 = !(SavedDataRequest.field_j < 2);
          this.field_A = stackIn_14_1;
          ArrayWidgetContainer.field_y = 3;
          this.startLevel(this.loadLevelMap(param0, (byte) -106, param1), (byte) -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hi.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_pb = "Type your email address again to make sure it's correct";
        field_Y = "Please log in as a subscribing member to access this feature.";
    }
}
