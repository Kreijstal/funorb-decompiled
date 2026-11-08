/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TikiTableScene extends ModelTableScene {
    private PcmSample field_Z;
    private PcmSample field_hb;
    private PcmSample field_lb;
    private PcmSample field_gb;
    static UiComponent field_V;
    private PcmSample field_kb;
    static String playerXNowHasNLives;
    private PcmSample field_db;
    private PcmSample field_W;
    PcmSample field_mb;
    PcmSample field_rb;
    private PcmSample field_ab;
    static boolean[] field_fb;
    private PcmSample field_jb;
    private PcmSample field_cb;
    private PcmSample field_qb;
    private PcmSample field_ib;
    static int field_eb;
    private PcmSample field_Y;
    private PcmSample field_R;
    private PcmSample field_X;
    private PcmSample field_T;
    static String[] monthnames;
    PcmSample field_S;
    private PcmSample field_pb;
    private PcmSample field_sb;
    private PcmSample field_nb;
    PcmSample field_bb;
    private PcmSample field_Q;

    final void initializeScene(boolean param0) {
        this.field_l = CollisionContact.progressJungleBulk;
        this.field_G = 17;
        this.field_H = 0;
        DebugTuningSupport.field_g = param0 ? true : false;
    }

    final static StringBuilder resizeStringBuilder(char fill, int length, int obfuscationGuard, StringBuilder builder) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -2790) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          var4_int = builder.length();
          builder.setLength(length);
          for (var5 = var4_int; length > var5; var5++) {
            builder.setCharAt(var5, fill);
          }
          stackIn_7_0 = (StringBuilder) (builder);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cj.NA(").append(fill).append(',').append(length).append(',').append(obfuscationGuard).append(',');
          if (builder == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void loadBackdrop(int param0, ResourceArchive param1) {
        try {
          if (param0 != 5) {
            this.field_gb = (PcmSample) null;
          }
          this.field_B = new Sprite(param1.getFileByName(false, "tiki-sky.jpg", ""), (java.awt.Component) ((Object) TimeTrialSelectScreen.field_K));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePottedBalls(int param0, PoolMatchController param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          super.updatePottedBalls(param0, param1);
          if (ModelOriginSupport.field_t == 0) {
            RankingsScreen.field_N.unloadScoreAndResetSynthesis(true, -1);
          }
          if (500 > ModelOriginSupport.field_t) {
            this.updateRollingSounds(128, 50, (byte) 71, new PcmSample[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, FreePlayRules.field_j);
            if (MaxLengthTextInputWidget.nextRandomInt(400, true, RankingsRequest.field_r) == 0) {
              this.playAmbientSounds(-4577, 32);
            }
          } else {
            if (ModelOriginSupport.field_t != 500) {
              if (ModelOriginSupport.field_t < 2000) {
                var3_int = (128 * ModelOriginSupport.field_t - 64000) / 1500;
                this.updateRollingSounds(128 - var3_int * 7 / 8, 50, (byte) 34, new PcmSample[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, FreePlayRules.field_j);
                if (MaxLengthTextInputWidget.nextRandomInt(800, true, RankingsRequest.field_r) == 0) {
                  this.playAmbientSounds(-4577, 128 - 7 * var3_int / 8 >> 2);
                }
                RankingsScreen.field_N.setChannelVolumeScale((byte) 77, -1, var3_int);
              } else {
                if (ModelOriginSupport.field_t < 11200) {
                  this.updateRollingSounds(8, 50, (byte) -101, new PcmSample[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, FreePlayRules.field_j);
                } else {
                  if (ModelOriginSupport.field_t >= 12200) {
                    if (ModelOriginSupport.field_t == 12200) {
                      RankingsScreen.field_N.stopMusicPlayback(-1);
                    } else {
                      ModelOriginSupport.field_t = -1;
                    }
                  } else {
                    var3_int = 128 * (12200 - ModelOriginSupport.field_t) / 1000;
                    this.updateRollingSounds(128 - 7 * var3_int / 8, 50, (byte) -126, new PcmSample[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, FreePlayRules.field_j);
                    if (MaxLengthTextInputWidget.nextRandomInt(800, true, RankingsRequest.field_r) == 0) {
                      this.playAmbientSounds(-4577, 128 - var3_int * 7 / 8 >> 2);
                    }
                    RankingsScreen.field_N.setChannelVolumeScale((byte) 32, -1, var3_int);
                  }
                }
              }
            } else {
              RankingsScreen.field_N.setChannelVolumeScale((byte) 88, -1, 1);
              AnimatedNotification.field_u = this.field_b;
              RankingsScreen.field_N.loadScoreAndResetSynthesis(this.field_b, true, (byte) -14, true);
            }
          }
          ModelOriginSupport.field_t = ModelOriginSupport.field_t + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("cj.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void loadModels(ResourceArchive param0, int param1) {
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var22 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        MeshBuilder[] var14 = null;
        int var15 = 0;
        MeshBuilder[] var16 = null;
        MeshBuilder var17 = null;
        MeshBuilder[] var19 = null;
        int[] var20 = null;
        MeshBuilder var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var20Lifetime1;
        int[] var20Lifetime2;
        int[] var20Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        var22 = Pool.field_O;
        try {
          this.field_O = new MeshBuilder[22];
          var3_int = 0;
          LoginMethod.field_j = var3_int;
          incrementValue$22 = var3_int;
          var3_int++;
          this.field_O[incrementValue$22] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_extra_1");
          incrementValue$23 = var3_int;
          var3_int++;
          this.field_O[incrementValue$23] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_extra_2");
          incrementValue$24 = var3_int;
          var3_int++;
          this.field_O[incrementValue$24] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_extra_3");
          incrementValue$25 = var3_int;
          var3_int++;
          this.field_O[incrementValue$25] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_extra_4");
          MusicPatchEnvelope.field_f = var3_int;
          AccountCreationForm.field_T = var3_int;
          incrementValue$26 = var3_int;
          var3_int++;
          this.field_O[incrementValue$26] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_totnew");
          ViewportController.field_t = var3_int;
          DualLinkDequeIterator.field_a = var3_int;
          incrementValue$27 = var3_int;
          var3_int++;
          this.field_O[incrementValue$27] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_steps_extend");
          BallDebugOverlay.field_c = var3_int;
          FullscreenErrorDialog.field_ib = var3_int;
          incrementValue$28 = var3_int;
          var3_int++;
          this.field_O[incrementValue$28] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_leg_a");
          incrementValue$29 = var3_int;
          var3_int++;
          this.field_O[incrementValue$29] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_leg_b");
          SpaceObject.field_i = var3_int;
          LobbyPlayer.field_Wb = var3_int;
          incrementValue$30 = var3_int;
          var3_int++;
          this.field_O[incrementValue$30] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_a");
          incrementValue$31 = var3_int;
          var3_int++;
          this.field_O[incrementValue$31] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_b");
          incrementValue$32 = var3_int;
          var3_int++;
          this.field_O[incrementValue$32] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_c");
          incrementValue$33 = var3_int;
          var3_int++;
          this.field_O[incrementValue$33] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_d");
          incrementValue$34 = var3_int;
          var3_int++;
          this.field_O[incrementValue$34] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_e");
          incrementValue$35 = var3_int;
          var3_int++;
          this.field_O[incrementValue$35] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_block_f");
          BallEvent.field_h = var3_int;
          UiComponent.field_L = var3_int;
          incrementValue$36 = var3_int;
          var3_int++;
          this.field_O[incrementValue$36] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_hole_a");
          ThemeSelectScreen.field_S = var3_int;
          Camera.field_i = var3_int;
          incrementValue$37 = var3_int;
          var3_int++;
          this.field_O[incrementValue$37] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_hole_b");
          MarkerSliderPainter.field_l = var3_int;
          NineSliceFrame.field_e = var3_int;
          incrementValue$38 = var3_int;
          var3_int++;
          this.field_O[incrementValue$38] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_corner");
          incrementValue$39 = var3_int;
          var3_int++;
          this.field_O[incrementValue$39] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_side_a");
          if (param1 > -43) {
            this.field_Z = (PcmSample) null;
          }
          incrementValue$40 = var3_int;
          var3_int++;
          this.field_O[incrementValue$40] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_side_b");
          incrementValue$41 = var3_int;
          var3_int++;
          this.field_O[incrementValue$41] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_side_c");
          AgeValidator.field_q = var3_int;
          TextPairLoginPayload.field_h = var3_int;
          incrementValue$42 = var3_int;
          var3_int++;
          this.field_O[incrementValue$42] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_top_a");
          incrementValue$43 = var3_int;
          var3_int++;
          this.field_O[incrementValue$43] = MeshBuilder.loadFromArchive(param0, "", "tiki_table/tiki_top_b");
          TextInputPainter.field_x = var3_int;
          this.field_A = new CueStick();
          this.field_A.a(MeshBuilder.loadFromArchive(param0, "", "cues/jungle_cue"), (byte) -115);
          for (var4 = 0; var4 < this.field_O.length; var4++) {
            VerticalScrollbar.swapMeshYAndZ(0, this.field_O[var4]);
          }
          var5 = 2147483647;
          var6 = -2147483648;
          var7 = 2147483647;
          var8 = -2147483648;
          var9 = 2147483647;
          var10 = -2147483648;
          for (var4Lifetime1 = AgeValidator.field_q; TextInputPainter.field_x > var4Lifetime1; var4Lifetime1++) {
            MeshBoundsSupport.computeMeshBounds(this.field_O[var4Lifetime1], -23109);
            if (this.field_O[var4Lifetime1].field_S > var8) {
              var8 = this.field_O[var4Lifetime1].field_S;
            }
            if (this.field_O[var4Lifetime1].field_y < var7) {
              var7 = this.field_O[var4Lifetime1].field_y;
            }
            if (var9 > this.field_O[var4Lifetime1].field_V) {
              var9 = this.field_O[var4Lifetime1].field_V;
            }
            if (this.field_O[var4Lifetime1].field_x > var10) {
              var10 = this.field_O[var4Lifetime1].field_x;
            }
            if (var6 < this.field_O[var4Lifetime1].field_w) {
              var6 = this.field_O[var4Lifetime1].field_w;
            }
            if (this.field_O[var4Lifetime1].field_D < var5) {
              var5 = this.field_O[var4Lifetime1].field_D;
            }
          }
          var7 = -var8 + var7 * 2;
          var5 = -var6 + var5 * 2;
          var11 = (var6 + var5) / 2;
          var12 = (var7 + var8) / 2;
          var13 = var10;
          for (var4Lifetime2 = 0; this.field_O.length > var4Lifetime2; var4Lifetime2++) {
            if (null != this.field_O[var4Lifetime2]) {
              TutorialFactory.translateMeshOrigin(var11, 90, var13, this.field_O[var4Lifetime2], var12);
            }
          }
          this.field_M = new int[this.field_O.length][3];
          for (var4Lifetime3 = 0; this.field_O.length > var4Lifetime3; var4Lifetime3++) {
            if (this.field_O[var4Lifetime3] != null) {
              ModelOriginSupport.recenterModel(this.field_M[var4Lifetime3], 0, this.field_O[var4Lifetime3]);
            }
          }
          var14 = new MeshBuilder[4];
          for (var4Lifetime4 = DualLinkDequeIterator.field_a; FullscreenErrorDialog.field_ib > var4Lifetime4; var4Lifetime4++) {
            var15 = var4Lifetime4;
            var16 = var14;
            var17 = this.field_O[var15];
            var34 = this.field_M[var15];
            var19 = var16;
            var21 = Cp1252DecodingSupport.mirrorVertically(true, new MeshBuilder(var17, false, false, false, false));
            var29 = TransformSupport.identityTransform(-31121);
            var24 = var29;
            var20 = var24;
            var20[1] = var34[1] + 0;
            var20[0] = var34[0] - 0;
            var20[2] = 0 + var34[2];
            var19[0] = new MeshBuilder(var17, false, false, false, false);
            var19[0].transform(var29);
            var30 = TransformSupport.identityTransform(-31121);
            var25 = var30;
            var20Lifetime1 = var25;
            var20Lifetime1[2] = var34[2] - 0;
            var20Lifetime1[0] = 0 + var34[0];
            var20Lifetime1[1] = -(var34[1] + 0);
            var19[1] = new MeshBuilder(var21, false, false, false, false);
            var19[1].transform(var30);
            var31 = TransformSupport.identityTransform(-31121);
            var26 = var31;
            var20Lifetime2 = var26;
            var20Lifetime2[0] = 0 + var34[0];
            var20Lifetime2[2] = 0 + var34[2];
            var20Lifetime2[1] = 0 + var34[1];
            TransformRotationSupport.rotateTransformHalfTurnZ((byte) -121, var31);
            var19[2] = new MeshBuilder(var17, false, false, false, false);
            var19[2].transform(var31);
            var32 = TransformSupport.identityTransform(-31121);
            var27 = var32;
            var20Lifetime3 = var27;
            var20Lifetime3[0] = 0 + var34[0];
            var20Lifetime3[2] = 0 + var34[2];
            var20Lifetime3[1] = -(var34[1] - 0);
            TransformRotationSupport.rotateTransformHalfTurnZ((byte) 50, var32);
            var19[3] = new MeshBuilder(var21, false, false, false, false);
            var19[3].transform(var32);
            this.field_O[var4Lifetime4] = new MeshBuilder(var14, 4);
            this.field_O[var4Lifetime4].scaleVertices(1, 1, 1, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("cj.KA(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void splitMeshIntoCloudLayers(int[] transform, IntrusiveDeque[] layers, MeshBuilder mesh, int obfuscationGuard) {
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        MeshBuilder var8 = null;
        MeshBuilder var9 = null;
        int var10 = 0;
        MeshBuilder var11 = null;
        var11 = mesh;
        var10 = Pool.field_O;
        try {
          var5_int = mesh.field_V + transform[2];
          var6 = mesh.field_x + transform[2];
          var7 = 0;
          if (obfuscationGuard > -110) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("cj.K(");
          if (transform == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (layers == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (mesh == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
        stackIn_5_0 = Atan2Support.field_h;
        try {
          scanLoop1: while (true) {
            if (stackIn_5_0.length > var7) {
              Runtime.getRuntime().gc();
              if (Atan2Support.field_h[var7] <= var6) {
                if (Atan2Support.field_h[var7] < var6 &&
                  Atan2Support.field_h[var7] > var5_int) {
                  var8 = TutorialController.createEmptyMesh((byte) 125);
                  var9 = TutorialController.createEmptyMesh((byte) 127);
                  JaggrabDownloader.splitMeshByPlane(0, var9, 0, false, Atan2Support.field_h[var7] - transform[2], 0, 0, 1, var8, var11);
                  if (var9.faceCount > 0) {
                    var9.clearCaches();
                    var9.computeBounds();
                    layers[var7].addFirst((byte) 106, new SceneNodeEntry(SceneNodeFactory.createSceneNode(var9, transform, (byte) 101)));
                  }
                  var8.clearCaches();
                  var11 = var8;
                  mesh = var11;
                  var8.computeBounds();
                  if (0 == var11.faceCount) {
                    break scanLoop1;
                  }
                }
                var7++;
                stackIn_5_0 = Atan2Support.field_h;
                continue;
              }
              System.out.println("Model before the cloudline " + Atan2Support.field_h[var7]);
              layers[var7].addFirst((byte) -100, new SceneNodeEntry(SceneNodeFactory.createSceneNode(var11, transform, (byte) 101)));
              mesh = null;
            }
            break;
          }
          if (mesh != null) {
            if (mesh.faceCount <= 0) {
              return;
            }
            layers[layers.length - 1].addFirst((byte) -95, new SceneNodeEntry(SceneNodeFactory.createSceneNode(mesh, transform, (byte) 101)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("cj.K(");
          if (transform == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (layers == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (mesh == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void playTableSound(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var5 = 95 % ((param2 + 44) / 56);
        var6 = param0;
        if (5 != var6) {
          if (2 != var6) {
            if (var6 == 3) {
              MusicPatchEnvelope.a(100, this.field_S, param3, param1);
            } else {
              if (0 == var6) {
                MusicPatchEnvelope.a(100, this.field_rb, param3, param1);
              } else {
                if (var6 == 1) {
                  MusicPatchEnvelope.a(100, this.field_mb, param3, param1);
                } else {
                  if (var6 == 6) {
                    MusicPatchEnvelope.a(100, this.field_W, param3, param1);
                    System.out.println("playing respot the white");
                  } else {
                    if (var6 != 4) {
                      if (var6 != 10) {
                        super.playTableSound(param0, param1, (byte) -102, param3);
                      }
                    } else {
                      MusicPatchEnvelope.a(100, this.field_sb, param3, param1);
                    }
                  }
                }
              }
            }
          } else {
            MusicPatchEnvelope.a(100, this.field_bb, param3, param1);
          }
        } else {
          var6 = MaxLengthTextInputWidget.nextRandomInt(3, true, RankingsRequest.field_r);
          if (var6 != 0) {
            if (var6 != 1) {
              if (var6 == 2) {
                MusicPatchEnvelope.a(100, this.field_jb, param3, param1);
              }
            } else {
              MusicPatchEnvelope.a(100, this.field_ib, param3, param1);
            }
          } else {
            MusicPatchEnvelope.a(100, this.field_Q, param3, param1);
          }
        }
    }

    final void releaseModels(boolean param0) {
        super.releaseModels(param0);
        MusicVoice.c((byte) 90);
    }

    final void loadSceneSprites(int param0, ResourceArchive param1) {
        try {
          if (param0 != -23569) {
            this.field_pb = (PcmSample) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void buildSceneryLayers(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        IntrusiveDeque[] var7;
        MeshBuilder var8;
        int var9;
        int var10;
        StringBuilder var11;
        int var3Lifetime1;
        var10 = Pool.field_O;
        if (this.field_H == 0) {
          ModelOriginSupport.field_u = null;
          var2 = 500;
          Atan2Support.field_h = new int[]{var2, var2 + 50, 100 + var2, 200 + var2};
          ThemeSelectScreen.field_K = 1 + Atan2Support.field_h.length;
          ValidationMessageWidget.field_Y = new IntrusiveDeque[ThemeSelectScreen.field_K];
          for (var3 = 0; ThemeSelectScreen.field_K > var3; var3++) {
            ValidationMessageWidget.field_Y[var3] = new IntrusiveDeque();
          }
          CueAim.field_m = 80;
          ChatReplacementSupport.field_a = 4000;
        }
        var2 = LoginMethod.field_j;
        var3Lifetime1 = 1 + LoginMethod.field_j;
        var4 = LoginMethod.field_j + 2;
        var5 = LoginMethod.field_j + 3;
        var6 = AccountCreationForm.field_T;
        var9 = this.field_H;
        if (var9 != 1) {
          if (var9 == 2) {
            fieldTemp$0 = CueAim.field_m - 150;
            CueAim.field_m = CueAim.field_m - 150;
            this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$0, (byte) 103, this.field_O[var4], 0, ChatReplacementSupport.field_a);
          } else {
            if (3 == var9) {
              fieldTemp$1 = CueAim.field_m - 170;
              CueAim.field_m = CueAim.field_m - 170;
              this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$1, (byte) 124, this.field_O[var2], 0, ChatReplacementSupport.field_a);
            } else {
              if (4 != var9) {
                if (var9 != 5) {
                  if (6 != var9) {
                    if (var9 != 7) {
                      if (8 == var9) {
                        fieldTemp$2 = CueAim.field_m - 45;
                        CueAim.field_m = CueAim.field_m - 45;
                        this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$2, (byte) 111, this.field_O[var4], 800, ChatReplacementSupport.field_a + 600);
                      } else {
                        if (var9 == 9) {
                          fieldTemp$3 = CueAim.field_m - 130;
                          CueAim.field_m = CueAim.field_m - 130;
                          this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$3, (byte) 110, this.field_O[var3Lifetime1], 968, -700 + ChatReplacementSupport.field_a);
                        } else {
                          if (var9 != 10) {
                            if (var9 == 11) {
                              fieldTemp$4 = CueAim.field_m - 80;
                              CueAim.field_m = CueAim.field_m - 80;
                              this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$4, (byte) 109, this.field_O[var2], 0, ChatReplacementSupport.field_a);
                            } else {
                              if (12 == var9) {
                                var8 = this.field_O[var5];
                                var7 = ValidationMessageWidget.field_Y;
                                CueAim.field_m = -1536;
                                this.addRotatedCloudLayerMesh(var7, -1536, (byte) 82, var8, 0, -400 + ChatReplacementSupport.field_a);
                              } else {
                                if (var9 == 13) {
                                  fieldTemp$5 = CueAim.field_m - 200;
                                  CueAim.field_m = CueAim.field_m - 200;
                                  this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$5, (byte) 125, this.field_O[var4], 0, ChatReplacementSupport.field_a - 200);
                                } else {
                                  if (var9 == 14) {
                                    fieldTemp$6 = CueAim.field_m - 125;
                                    CueAim.field_m = CueAim.field_m - 125;
                                    this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$6, (byte) 98, this.field_O[var6], 0, ChatReplacementSupport.field_a);
                                    this.field_l = DualLinkDequeIterator.progressJungleFinishing;
                                  } else {
                                    if (15 == var9) {
                                      this.buildCloudLayerSceneNodes(param0 + 6);
                                    } else {
                                      if (var9 == 16) {
                                        this.buildStaticModelInstances(-16);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            fieldTemp$7 = CueAim.field_m - 170;
                            CueAim.field_m = CueAim.field_m - 170;
                            this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$7, (byte) 71, this.field_O[var6], 0, ChatReplacementSupport.field_a - 700);
                          }
                        }
                      }
                    } else {
                      fieldTemp$8 = CueAim.field_m - 170;
                      CueAim.field_m = CueAim.field_m - 170;
                      this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$8, (byte) 80, this.field_O[var6], 0, ChatReplacementSupport.field_a);
                    }
                  } else {
                    fieldTemp$9 = CueAim.field_m - 170;
                    CueAim.field_m = CueAim.field_m - 170;
                    this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$9, (byte) 107, this.field_O[var5], 0, ChatReplacementSupport.field_a);
                  }
                } else {
                  fieldTemp$10 = CueAim.field_m - 50;
                  CueAim.field_m = CueAim.field_m - 50;
                  this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$10, (byte) 108, this.field_O[var3Lifetime1], 0, ChatReplacementSupport.field_a - 50);
                }
              } else {
                fieldTemp$11 = CueAim.field_m - 100;
                CueAim.field_m = CueAim.field_m - 100;
                this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, fieldTemp$11, (byte) 109, this.field_O[var6], 0, ChatReplacementSupport.field_a + 500);
              }
            }
          }
        } else {
          this.addRotatedCloudLayerMesh(ValidationMessageWidget.field_Y, 80, (byte) 80, this.field_O[var3Lifetime1], 0, ChatReplacementSupport.field_a - 500);
        }
        if (param0 != 2) {
          var11 = (StringBuilder) null;
          TikiTableScene.resizeStringBuilder('\023', -105, -71, (StringBuilder) null);
        }
        this.field_H = this.field_H + 1;
    }

    final static GrowableIntList createSizedIntList(int capacity, int growthFactor, int obfuscationGuard) {
        GrowableIntList var3 = GrowableIntListFactory.createGrowableIntList(false, growthFactor);
        if (obfuscationGuard != 0) {
          playerXNowHasNLives = (String) null;
        }
        var3.values = new int[capacity];
        return var3;
    }

    final static boolean isLocalGameOwner(byte obfuscationGuard) {
        if (obfuscationGuard != 85) {
          StringBuilder var2 = (StringBuilder) null;
          TikiTableScene.resizeStringBuilder('ￅ', -57, 7, (StringBuilder) null);
        }
        return ~BitmapTextLayout.field_m == ~HighscoresScreen.field_L.field_Zb ? true : false;
    }

    private final void addRotatedCloudLayerMesh(IntrusiveDeque[] param0, int param1, byte param2, MeshBuilder param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        try {
          param3 = new MeshBuilder(param3, false, false, false, false);
          var7_int = param5 * SceneNodeFactory.cosine(2047, param1) >> 16;
          var8 = param5 * ScrollPaneWithFooter.sine(param1, true) >> 16;
          param1 = param1 + param4;
          param3.transform(new int[]{0, 0, 0, SceneNodeFactory.cosine(2047, 1536 + param1), ScrollPaneWithFooter.sine(1536 + param1, true), 0, -ScrollPaneWithFooter.sine(param1 + 1536, true), SceneNodeFactory.cosine(2047, param1 + 1536), 0, 0, 0, 65536});
          param3.computeBounds();
          if (param2 < 68) {
            this.releaseModels(false);
          }
          this.splitMeshIntoCloudLayers(new int[]{var7_int, var8, LobbyGame.field_vc}, param0, param3, -123);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        playerXNowHasNLives = null;
        field_fb = null;
        monthnames = null;
        field_V = null;
        if (param0 <= 90) {
          TikiTableScene.drawGradientBand(88, 124, 23, -78, -57);
        }
    }

    final void drawScene(byte param0, PoolMatchController param1) {
        Object stackIn_53_0;
        int[] stackIn_53_1;
        int stackIn_53_2;
        boolean stackIn_53_3;
        Ball[] stackIn_53_4;
        Object stackIn_54_0;
        boolean stackIn_54_5;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        Ball[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        MeshBuilder var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        SceneNode var19 = null;
        Ball[] var21 = null;
        SceneNode var22 = null;
        SceneNode var24 = null;
        SceneNode var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var5_ref_int__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Pool.field_O;
        try {
          var21 = param1.gameModel.balls;
          var3 = var21;
          var30 = LobbyPanelLayoutSupport.copyTransform((byte) -119, param1.viewMatrix);
          var18 = var30;
          var4 = var18;
          var28 = var4;
          var16 = var28;
          var13 = var16;
          var5_ref_int__ = var13;
          GzipDecoder.field_d[0] = var28[0] - SpriteResourceSupport.floatToFixed3(288.0f, true) >> 2;
          GzipDecoder.field_d[1] = var28[1] - SpriteResourceSupport.floatToFixed3(144.0f, true) >> 2;
          GzipDecoder.field_d[2] = var28[2] >> 2;
          if (var5_ref_int__ != GzipDecoder.field_d) {
            GzipDecoder.field_d[9] = var28[9];
            GzipDecoder.field_d[5] = var28[5];
            GzipDecoder.field_d[10] = var28[10];
            GzipDecoder.field_d[6] = var28[6];
            GzipDecoder.field_d[8] = var28[8];
            GzipDecoder.field_d[7] = var28[7];
            GzipDecoder.field_d[11] = var28[11];
            GzipDecoder.field_d[3] = var28[3];
            GzipDecoder.field_d[4] = var28[4];
          }
          var29 = var4;
          var17 = var29;
          var14 = var17;
          var5_ref_int__Lifetime1 = var14;
          ArchiveRequest.field_w[0] = var29[0] - SpriteResourceSupport.floatToFixed3(288.0f, true) >> 4;
          ArchiveRequest.field_w[1] = var29[1] - SpriteResourceSupport.floatToFixed3(144.0f, true) >> 4;
          ArchiveRequest.field_w[2] = var29[2] >> 4;
          if (ArchiveRequest.field_w != var5_ref_int__Lifetime1) {
            ArchiveRequest.field_w[7] = var29[7];
            ArchiveRequest.field_w[3] = var29[3];
            ArchiveRequest.field_w[10] = var29[10];
            ArchiveRequest.field_w[9] = var29[9];
            ArchiveRequest.field_w[8] = var29[8];
            ArchiveRequest.field_w[5] = var29[5];
            ArchiveRequest.field_w[4] = var29[4];
            ArchiveRequest.field_w[11] = var29[11];
            ArchiveRequest.field_w[6] = var29[6];
          }
          var4[1] = ArchiveLoadSequence.bitwiseAnd(var30[1], -4);
          var4[0] = ArchiveLoadSequence.bitwiseAnd(var30[0], -4);
          var4[2] = ArchiveLoadSequence.bitwiseAnd(var30[2], -4);
          this.e(true);
          for (var5 = 0; ModelOriginSupport.field_u.length > var5; var5++) {
            var19 = ModelOriginSupport.field_u[var5];
            var39 = ArchiveRequest.field_w;
            var19.sortModelsByDepth((byte) 112, 0, var19.field_j.length, var39);
          }
          this.prepareBallDrawOrder(false, var30, var21);
          PlayingSound.sortParallelArrays(GradientPaletteSupport.field_c, (byte) -104, TimeTrialSelectScreen.field_L, AccountProtocolStage.field_g, TutorialFactory.field_c);
          PlayingSound.sortParallelArrays(TextWidgetPainter.field_h, (byte) -104, TimeTrialSelectScreen.field_L, AccountProtocolStage.field_g, QuickChatMenuSupport.field_b);
          PlayingSound.sortParallelArrays(UsernameSuggestionSupport.field_d, (byte) -104, TimeTrialSelectScreen.field_L, AccountProtocolStage.field_g, CheckboxPainter.field_n);
          PlayingSound.sortParallelArrays(DelegatingCanvas.field_d, (byte) -104, TimeTrialSelectScreen.field_L, AccountProtocolStage.field_g, ClientException.field_e);
          PlayingSound.sortParallelArrays(ReflectionReplySupport.field_j, (byte) -104, TimeTrialSelectScreen.field_L, AccountProtocolStage.field_g, StartupInterfaceSupport.field_a);
          this.drawSky(param1, 9291);
          MusicVoice.a(ArchiveRequest.field_w, false);
          this.drawGradientOverlayBands(256, 3, 256, (byte) -86);
          var6 = TriangleRasterizer.colorPalette;
          for (var5Lifetime1 = ModelOriginSupport.field_u.length - 1; 1 < var5Lifetime1; var5Lifetime1--) {
            TriangleRasterizer.colorPalette = ShotEvent.field_m[-1 + var5Lifetime1];
            var22 = ModelOriginSupport.field_u[var5Lifetime1];
            var40 = ArchiveRequest.field_w;
            var22.drawModelRange((byte) -122, 0, var22.field_j.length, var40);
            if (0L != (256L & LinkButtonPainter.field_i)) {
              ModelOriginSupport.field_u[var5Lifetime1].drawAllModels(ArchiveRequest.field_w, 0);
            }
          }
          TriangleRasterizer.colorPalette = ShotEvent.field_m[0];
          if (param0 != -55) {
            var12 = (MeshBuilder) null;
            this.splitMeshIntoCloudLayers((int[]) null, (IntrusiveDeque[]) null, (MeshBuilder) null, -92);
          }
          var24 = ModelOriginSupport.field_u[1];
          var41 = ArchiveRequest.field_w;
          var24.drawModelRange((byte) -115, 0, var24.field_j.length, var41);
          if ((LinkButtonPainter.field_i & 256L) != 0L) {
            ModelOriginSupport.field_u[1].drawAllModels(ArchiveRequest.field_w, 0);
          }
          TriangleRasterizer.colorPalette = var6;
          var26 = ModelOriginSupport.field_u[0];
          var42 = ArchiveRequest.field_w;
          var26.drawModelRange((byte) -98, 0, var26.field_j.length, var42);
          if ((256L & LinkButtonPainter.field_i) != 0L) {
            ModelOriginSupport.field_u[0].drawAllModels(ArchiveRequest.field_w, 0);
          }
          if ((4194304L & LinkButtonPainter.field_i) != 0L) {
            return;
          }
          for (var5Lifetime2 = -1 + GradientPaletteSupport.field_c; TutorialFactory.field_c <= var5Lifetime2; var5Lifetime2--) {
            ChatInputSupport.field_l[AccountProtocolStage.field_g[var5Lifetime2]].c(6710886, GzipDecoder.field_d);
          }
          for (var5Lifetime3 = -1 + TextWidgetPainter.field_h; QuickChatMenuSupport.field_b <= var5Lifetime3; var5Lifetime3--) {
            ChatInputSupport.field_l[AccountProtocolStage.field_g[var5Lifetime3]].c(6710886, GzipDecoder.field_d);
          }
          for (var5Lifetime4 = UsernameSuggestionSupport.field_d - 1; var5Lifetime4 >= CheckboxPainter.field_n; var5Lifetime4--) {
            ChatInputSupport.field_l[AccountProtocolStage.field_g[var5Lifetime4]].c(6710886, GzipDecoder.field_d);
          }
          if ((1073741824L & LinkButtonPainter.field_i) == 0L) {
            this.drawBallsInOrder(var30, (byte) 106, false, var21, false);
          }
          for (var5Lifetime5 = ReflectionReplySupport.field_j - 1; var5Lifetime5 >= StartupInterfaceSupport.field_a; var5Lifetime5--) {
            ChatInputSupport.field_l[AccountProtocolStage.field_g[var5Lifetime5]].c(6710886, GzipDecoder.field_d);
          }
          if ((LinkButtonPainter.field_i & 1073741824L) == 0L) {
            for (var5Lifetime6 = 0; var21.length > var5Lifetime6; var5Lifetime6++) {
              if (var21[var5Lifetime6].inPlay) {
                this.drawBall(var30, var21[var5Lifetime6]);
              }
            }
          }
          var7 = ClientException.field_e;
          var8 = DelegatingCanvas.field_d;
          for (var10 = var8 - 1; var7 <= var10; var10--) {
            var9 = AccountProtocolStage.field_g[var10];
            if (!OpacityWidget.field_Q[var9]) {
              ChatInputSupport.field_l[var9].c(param0 ^ -6710865, GzipDecoder.field_d);
            }
          }
          if (0L == (1073741824L & LinkButtonPainter.field_i)) {
            stackIn_53_0 = this;
            stackIn_53_1 = var4;
            stackIn_53_2 = 102;
            stackIn_53_3 = true;
            stackIn_53_4 = var3;
            if (param1.gameModel.currentShot(29).phase != 0) {
              stackIn_54_0 = this;
              stackIn_54_5 = false;
            } else {
              stackIn_54_0 = this;
              stackIn_54_5 = true;
            }
            this.drawBallsInOrder(stackIn_53_1, (byte) stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_54_5);
          }
          var7Lifetime1 = ClientException.field_e;
          var8Lifetime1 = DelegatingCanvas.field_d;
          var15 = -1 + var8Lifetime1;
          var10Lifetime1 = var15;
          while (var15 >= var7Lifetime1) {
            var9Lifetime1 = AccountProtocolStage.field_g[var15];
            if (OpacityWidget.field_Q[var9Lifetime1]) {
              ChatInputSupport.field_l[var9Lifetime1].c(6710886, GzipDecoder.field_d);
            }
            var15--;
          }
          if ((1073741824L & LinkButtonPainter.field_i) == 0L) {
            param1.updateCueStick(-1);
          }
          if ((1073741824L & LinkButtonPainter.field_i) == 0L) {
            param1.buildAimPreviewTrail(-125);
          }
          if ((LinkButtonPainter.field_i & 256L) != 0L) {
            for (var5Lifetime7 = 0; ChatInputSupport.field_l.length > var5Lifetime7; var5Lifetime7++) {
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_73_0 = var3_ref;
          stackIn_73_1 = new StringBuilder().append("cj.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private final void drawGradientOverlayBands(int param0, int param1, int param2, byte param3) {
        if (KeyHandler.field_c[param1][0][0] != KeyHandler.field_c[param1][1][1]) {
          TikiTableScene.drawGradientBand(KeyHandler.field_c[param1][0][1], KeyHandler.field_c[param1][1][1], 13421772, 0, param0);
        }
        int var5 = 64 % ((-24 - param3) / 59);
        if (KeyHandler.field_c[param1][1][0] != KeyHandler.field_c[param1][2][1]) {
          TikiTableScene.drawGradientBand(KeyHandler.field_c[param1][1][1], KeyHandler.field_c[param1][2][1], 13421772, param0, param2);
        }
        if (KeyHandler.field_c[param1][3][1] != KeyHandler.field_c[param1][2][0]) {
          SoftwareRasterizer.fillRectangleAlpha(0, KeyHandler.field_c[param1][2][1], SoftwareRasterizer.width, KeyHandler.field_c[param1][3][1] - KeyHandler.field_c[param1][2][1], 13421772, param2);
        }
    }

    private final static void drawGradientBand(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5 = param4 - param3;
        int var6 = SoftwareRasterizer.clipRight - SoftwareRasterizer.clipLeft;
        int var7 = param1 - param0;
        for (var8 = 0; var8 < var7; var8++) {
          SoftwareRasterizer.drawHorizontalLineAlpha(SoftwareRasterizer.clipLeft, param0 + var8, var6, param2, param3 + var8 * var5 / var7);
        }
    }

    final void loadMusicTracks(int param0, ResourceArchive param1) {
        try {
          if (param0 != 1) {
            PoolGameModel var4 = (PoolGameModel) null;
            this.buildTableGeometry((PoolGameModel) null, 126);
          }
          this.field_b = MusicTrack.loadFromArchive(param1, "", "pool_jungle");
          this.field_i = MusicTrack.loadFromArchive(param1, "", "pool_jungle_win_jingle");
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void loadSounds(SoundCache param0, int param1) {
        try {
          int var3_int = 86 / ((param1 - 39) / 38);
          this.field_bb = param0.getVorbisSound("jungle_ball_hard", true, "");
          param0.getVorbisSound("jungle_ball_med", true, "");
          this.field_S = param0.getVorbisSound("jungle_ball_soft", true, "");
          this.field_rb = param0.getVorbisSound("jungle_cue_hard", true, "");
          this.field_mb = param0.getVorbisSound("jungle_cue_soft", true, "");
          this.field_sb = param0.getVorbisSound("jungle_pot", true, "");
          this.field_W = param0.getVorbisSound("jungle_respot_the_white", true, "");
          this.field_Q = param0.getVorbisSound("jungle_ball_cushion1", true, "");
          this.field_ib = param0.getVorbisSound("jungle_ball_cushion2", true, "");
          this.field_jb = param0.getVorbisSound("jungle_ball_cushion3", true, "");
          this.field_db = param0.getSynthesizedSound("", "jungle_bg_bird1", (byte) 122);
          this.field_nb = param0.getSynthesizedSound("", "jungle_bg_cricket1", (byte) 126);
          this.field_kb = param0.getSynthesizedSound("", "jungle_bg_cricket2", (byte) 123);
          this.field_pb = param0.getSynthesizedSound("", "jungle_bg_cricket3", (byte) 123);
          this.field_T = param0.getSynthesizedSound("", "jungle_bg_frog1", (byte) 127);
          this.field_Z = param0.getSynthesizedSound("", "jungle_bg_snake1", (byte) 125);
          this.field_ab = param0.getSynthesizedSound("", "jungle_bg_snake2", (byte) 124);
          this.field_X = param0.getVorbisSound("jungle_monkey1", true, "");
          this.field_cb = param0.getVorbisSound("jungle_monkey2", true, "");
          this.field_Y = param0.getVorbisSound("jungle_monkey3", true, "");
          this.field_gb = param0.getVorbisSound("jungle_monkey4", true, "");
          this.field_R = param0.getSynthesizedSound("", "jungle_bg_wind1", (byte) 122);
          this.field_hb = param0.getSynthesizedSound("", "jungle_bg_wind2", (byte) 123);
          this.field_lb = param0.getSynthesizedSound("", "jungle_bg_wind3", (byte) 121);
          this.field_qb = param0.getSynthesizedSound("", "jungle_bg_wind4", (byte) 124);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void buildCloudLayerSceneNodes(int obfuscationGuard) {
        int var2;
        IntrusiveDeque[] var3;
        int var4;
        int var5;
        int var8;
        int var6;
        int var7;
        int var9;
        int var2Lifetime1;
        int var4Lifetime1;
        var8 = Pool.field_O;
        var3 = new IntrusiveDeque[ThemeSelectScreen.field_K];
        for (var4 = 0; var4 < ThemeSelectScreen.field_K; var4++) {
          var3[var4] = new IntrusiveDeque();
        }
        var4Lifetime1 = 0;
        var2 = BallDebugOverlay.field_c;
        if (obfuscationGuard != 8) {
          return;
        }
        while (var2 < LobbyPlayer.field_Wb) {
          this.field_O[var2].computeBounds();
          var5 = this.field_O[var2].field_x + this.field_M[var2][2];
          if (var5 > var4Lifetime1) {
            var4Lifetime1 = var5;
          }
          var2++;
        }
        var4Lifetime1 = var4Lifetime1 >> 2;
        var9 = DualLinkDequeIterator.field_a;
        var2Lifetime1 = var9;
        while (var9 < FullscreenErrorDialog.field_ib) {
          this.field_O[var9].computeBounds();
          var5 = -this.field_O[var9].field_V + var4Lifetime1;
          this.splitMeshIntoCloudLayers(new int[]{0, 0, var5}, var3, this.field_O[var9], -116);
          var4Lifetime1 = this.field_O[var9].field_x + var5;
          var9++;
        }
        ShotEvent.field_m = new int[ThemeSelectScreen.field_K][];
        ModelOriginSupport.field_u = new SceneNode[ThemeSelectScreen.field_K];
        VertexNormal.field_e = new SceneNode[ThemeSelectScreen.field_K];
        for (var5 = 0; ThemeSelectScreen.field_K > var5; var5++) {
          var6 = 63 + var5 * 192 / ThemeSelectScreen.field_K;
          var7 = 128;
          ShotEvent.field_m[var5] = AccountStateQuery.a(RenderingInitializationSupport.bitwiseOr(var7, RenderingInitializationSupport.bitwiseOr(var7 << 16, var7 << 8)), var6, false);
          VertexNormal.field_e[var5] = new SceneNode();
          VertexNormal.field_e[var5].setChildren((byte) -112, var3[var5]);
          ValidationMessageWidget.field_Y[var5].addFirst((byte) -52, new SceneNodeEntry(VertexNormal.field_e[var5]));
          ModelOriginSupport.field_u[var5] = new SceneNode();
          ModelOriginSupport.field_u[var5].setChildren((byte) -121, ValidationMessageWidget.field_Y[var5]);
          ModelOriginSupport.field_u[var5].normalizeOffsets(0);
          ModelOriginSupport.field_u[var5].bakeModels(this.field_q, this.field_e, this.field_F, (byte) -35, this.field_u, this.field_C);
          ModelOriginSupport.field_u[var5].allocateModelArrays(105);
        }
        return;
    }

    final void buildPalettes(int param0) {
        super.buildPalettes(param0);
        this.field_v = 5609813;
    }

    private final void drawSky(PoolMatchController param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          var3_int = param0.camera.b(param1 - 9419);
          if (param1 != 9291) {
            return;
          }
          SoftwareRasterizer.fillVerticalGradient(0, var3_int, 640, -var3_int + 480, this.field_v, 16128);
          var4 = this.field_B.field_z << 1;
          var5 = this.field_B.field_A << 1;
          var6 = (int)(-param0.camera.getYaw(true) * (double)var4 / 2.0 / 3.141592653589793);
          var7 = -200 + var3_int;
          if (0 < var7) {
            SoftwareRasterizer.fillRectangle(0, 0, 640, var7, this.field_B.field_D[0]);
          }
          this.field_B.drawScaled(var6 - var4, var7, var4, var5);
          for (var8 = this.field_B.field_A + var7; var8 < SoftwareRasterizer.clipBottom; var8++) {
            this.field_B.drawRow(this.field_B.field_A - 1, -var4 + var6, var8);
          }
          if (-640 + this.field_B.field_z > var6 >> 16) {
            this.field_B.drawScaled(var6, var7, var4, var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cj.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int floorColor(int param0) {
        if (param0 != 684) {
          this.field_kb = (PcmSample) null;
        }
        return 11184810;
    }

    private final void playAmbientSounds(int param0, int param1) {
        int var3 = 0;
        int stackIn_11_0 = 0;
        int var4;
        PcmSample var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        if (param0 != -4577) {
          TikiTableScene.drawGradientBand(-42, 63, -74, 109, -107);
        }
        for (var3 = 2; var3 < FreePlayRules.field_j.length; var3++) {
          if (null == FreePlayRules.field_j[var3] ||
            FreePlayRules.field_j[var3].field_o.isSamplePositionOutOfRange() ||
            !FreePlayRules.field_j[var3].field_o.b(param0 ^ 4492)) {
            stackIn_11_0 = (FreePlayRules.field_j[var3] == null) ? 11 : 22;
            var4 = MaxLengthTextInputWidget.nextRandomInt(stackIn_11_0, true, RankingsRequest.field_r);
            var6 = var4;
            if (var6 == 0) {
              FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentQ6(this.field_db, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
            } else {
              if (var6 != 1) {
                if (2 == var6) {
                  FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentQ6(this.field_kb, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                } else {
                  if (var6 != 3) {
                    if (4 != var6) {
                      if (var6 == 5) {
                        FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentQ6(this.field_Z, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                      } else {
                        if (var6 != 6) {
                          if (var6 != 7) {
                            if (var6 != 8) {
                              if (var6 != 9) {
                                if (var6 == 10) {
                                  FreePlayRules.field_j[var3] = MusicCrossfadeStream.a(126, PcmSampleStream.createAtRatePercentQ6(this.field_gb, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                                } else {
                                  var5 = (PcmSample) (FreePlayRules.field_j[var3].field_o.field_n);
                                  if (var5 != this.field_X &&
                                    this.field_cb != var5 &&
                                    var5 != this.field_Y &&
                                    this.field_gb != var5) {
                                    FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentQ6(var5, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                                  } else {
                                    FreePlayRules.field_j[var3] = MusicCrossfadeStream.a(126, PcmSampleStream.createAtRatePercentQ6(var5, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                                  }
                                }
                              } else {
                                FreePlayRules.field_j[var3] = MusicCrossfadeStream.a(101, PcmSampleStream.createAtRatePercentQ6(this.field_Y, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                              }
                            } else {
                              FreePlayRules.field_j[var3] = MusicCrossfadeStream.a(124, PcmSampleStream.createAtRatePercentQ6(this.field_cb, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                            }
                          } else {
                            FreePlayRules.field_j[var3] = MusicCrossfadeStream.a(126, PcmSampleStream.createAtRatePercentQ6(this.field_X, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                          }
                        } else {
                          FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(param0 - 19719, PcmSampleStream.createAtRatePercentQ6(this.field_ab, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                        }
                      }
                    } else {
                      FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(param0 - 19719, PcmSampleStream.createAtRatePercentQ6(this.field_T, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                    }
                  } else {
                    FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(TutorialFactory.bitwiseXor(param0, 20231), PcmSampleStream.createAtRatePercentQ6(this.field_pb, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
                  }
                }
              } else {
                FreePlayRules.field_j[var3] = DualLinkDequeIterator.a(-24296, PcmSampleStream.createAtRatePercentQ6(this.field_nb, 100, param1, MaxLengthTextInputWidget.nextRandomInt(128, true, RankingsRequest.field_r)));
              }
            }
          }
        }
    }

    final void clampCamera(boolean param0, Camera param1) {
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        PoolGameModel var8 = null;
        var7 = Pool.field_O;
        try {
          if (param1.targetY < 0.0) {
            param1.targetY = 0.0;
          } else {
            if (288.0 < param1.targetY) {
              param1.targetY = 288.0;
            }
          }
          if (param1.targetX < 0.0) {
            param1.targetX = 0.0;
          } else {
            if (576.0 < param1.targetX) {
              param1.targetX = 576.0;
            }
          }
          if (param0) {
            var8 = (PoolGameModel) null;
            this.buildTableGeometry((PoolGameModel) null, 35);
          }
          var3_double = param1.getDistance(8);
          stackIn_14_0 = ((4194304L & LinkButtonPainter.field_i) != 0L) ? 12000.0 : 2048.0;
          var5 = stackIn_14_0;
          if (var3_double > var5) {
            param1.eyeX = param1.targetX + var5 * (param1.eyeX - param1.targetX) / var3_double;
            param1.eyeZ = param1.targetZ + var5 * (param1.eyeZ - param1.targetZ) / var3_double;
            param1.eyeY = param1.targetY + (param1.eyeY - param1.targetY) * var5 / var3_double;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cj.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void buildTableGeometry(PoolGameModel param0, int param1) {
        try {
          super.buildTableGeometry(param0, param1);
          PauseMenuScreen.a(0.8999999761581421f, 1.0f, 0.8999999761581421f, 0.0833333358168602f, -31792);
          ModelOriginSupport.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void buildStaticModelInstances(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        PoolMatchController var8;
        ModelInstance[] var9;
        ModelInstance[] var10;
        ModelInstance[] var11;
        ModelInstance[] var12;
        ModelInstance[] var13;
        ModelInstance[] var14;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        var7 = Pool.field_O;
        ChatInputSupport.field_l = new ModelInstance[-ThemeSelectScreen.field_S + MarkerSliderPainter.field_l + (DualLinkDequeIterator.field_a - FullscreenErrorDialog.field_ib + (-ViewportController.field_t + AccountCreationForm.field_T) + (this.field_O.length - MusicPatchEnvelope.field_f + (LoginMethod.field_j - BallDebugOverlay.field_c))) - (-LobbyPlayer.field_Wb - UiComponent.field_L + (SpaceObject.field_i - 3 * (-AgeValidator.field_q + TextInputPainter.field_x)) + (-((-BallEvent.field_h + Camera.field_i) * 3) - 3 * (TextPairLoginPayload.field_h - NineSliceFrame.field_e)))];
        var3 = 0;
        TutorialFactory.field_c = var3;
        var2 = BallDebugOverlay.field_c;
        if (obfuscationGuard > -11) {
          var8 = (PoolMatchController) null;
          this.drawScene((byte) 7, (PoolMatchController) null);
        }
        while (var2 < LobbyPlayer.field_Wb) {
          var4 = var2;
          var9 = ChatInputSupport.field_l;
          var6 = var3;
          this.a(0, var6, 0, 0, 0, var4, var9);
          var3 += 2;
          var2++;
        }
        QuickChatMenuSupport.field_b = var3;
        GradientPaletteSupport.field_c = var3;
        for (var2Lifetime1 = SpaceObject.field_i; UiComponent.field_L > var2Lifetime1; var2Lifetime1++) {
          var4Lifetime1 = var2Lifetime1;
          var10 = ChatInputSupport.field_l;
          var6Lifetime1 = var3;
          this.a(0, var6Lifetime1, 0, 0, 0, var4Lifetime1, var10);
          var3 += 2;
        }
        StartupInterfaceSupport.field_a = var3;
        TextWidgetPainter.field_h = var3;
        for (var2Lifetime2 = AgeValidator.field_q; var2Lifetime2 < TextInputPainter.field_x; var2Lifetime2++) {
          var4Lifetime2 = var2Lifetime2;
          var11 = ChatInputSupport.field_l;
          var6Lifetime2 = var3;
          this.a(var11, 0, 0, false, this.field_O[var4Lifetime2], var6Lifetime2, this.field_M[var4Lifetime2], 0);
          var3 += 4;
        }
        ReflectionReplySupport.field_j = var3;
        ClientException.field_e = var3;
        for (var2Lifetime3 = NineSliceFrame.field_e; TextPairLoginPayload.field_h > var2Lifetime3; var2Lifetime3++) {
          var4Lifetime3 = var2Lifetime3;
          var12 = ChatInputSupport.field_l;
          var6Lifetime3 = var3;
          this.a(var12, 0, 0, false, this.field_O[var4Lifetime3], var6Lifetime3, this.field_M[var4Lifetime3], 0);
          var3 += 4;
        }
        CheckboxPainter.field_n = var3;
        DelegatingCanvas.field_d = var3;
        for (var2Lifetime4 = BallEvent.field_h; var2Lifetime4 < Camera.field_i; var2Lifetime4++) {
          var4Lifetime4 = var2Lifetime4;
          var13 = ChatInputSupport.field_l;
          var6Lifetime4 = var3;
          this.a(var13, 0, 0, false, this.field_O[var4Lifetime4], var6Lifetime4, this.field_M[var4Lifetime4], 0);
          var3 += 4;
        }
        for (var2Lifetime5 = ThemeSelectScreen.field_S; MarkerSliderPainter.field_l > var2Lifetime5; var2Lifetime5++) {
          var4Lifetime5 = var2Lifetime5;
          var14 = ChatInputSupport.field_l;
          var6Lifetime5 = var3;
          this.a(0, var6Lifetime5, 0, 0, 0, var4Lifetime5, var14);
          var3 += 2;
        }
        UsernameSuggestionSupport.field_d = var3;
        AccountProtocolStage.field_g = new int[ChatInputSupport.field_l.length];
        TimeTrialSelectScreen.field_L = new int[ChatInputSupport.field_l.length];
        for (var4Lifetime6 = 0; AccountProtocolStage.field_g.length > var4Lifetime6; var4Lifetime6++) {
          AccountProtocolStage.field_g[var4Lifetime6] = var4Lifetime6;
        }
    }

    TikiTableScene() {
        this.field_m = 96;
        this.field_d = 32;
        this.field_z = 0.8009999990463257f;
        this.field_E = 16384.0;
        this.field_C = 69;
        this.field_j = 5.7246799465414;
        this.field_x = 60;
        this.field_p = 0.3316125578789226;
        this.updateLightPosition(113);
    }

    static {
        playerXNowHasNLives = "<%0> now has <%1> lives.";
        field_fb = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, false, false, false, false, false, false, true};
        monthnames = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
