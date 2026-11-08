/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PolarTableScene extends ModelTableScene {
    static int field_lb;
    static String ballsetUsa8Group1;
    private PcmSample field_fb;
    private PolarObject[] field_U;
    PcmSample field_X;
    private PcmSample field_Z;
    private PcmSample field_ib;
    static String timerHoursMinutesSecondsFractions;
    private PcmSample field_ab;
    private PcmSample field_cb;
    private PcmSample field_W;
    private PcmSample field_T;
    PcmSample field_hb;
    private PcmSample field_mb;
    private PcmSample field_jb;
    private PcmSample field_kb;
    PcmSample field_bb;
    static ResourceArchive field_nb;
    private PcmSample field_S;
    PcmSample field_Y;
    private PcmSample field_db;
    private PcmSample field_V;
    private PcmSample field_eb;

    final void buildPalettes(int param0) {
        super.buildPalettes(param0);
    }

    final void updatePottedBalls(int param0, PoolMatchController param1) {
        int var3_int = 0;
        int var4 = Pool.field_O;
        try {
          super.updatePottedBalls(param0, param1);
          DebugTuningSlider.field_f = DebugTuningSlider.field_f + 1;
          for (var3_int = 0; var3_int < this.field_U.length; var3_int++) {
            this.field_U[var3_int].a(this, 10);
          }
          this.updateRollingSounds(24, 50, (byte) -121, new PcmSample[]{this.field_V, this.field_W, this.field_T, this.field_db, this.field_fb}, Pool.field_N);
          this.updateRollingSounds(24, 50, (byte) 125, new PcmSample[]{this.field_eb, this.field_Z, this.field_kb}, TextPairLoginPayload.field_g);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawScene(byte param0, PoolMatchController param1) {
        int var3_int = 0;
        int var6 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_21_4 = 0;
        boolean stackIn_24_2 = false;
        Object stackIn_37_0;
        int[] stackIn_37_1;
        int stackIn_37_2;
        boolean stackIn_37_3;
        Ball[] stackIn_37_4;
        Object stackIn_38_0;
        boolean stackIn_38_5;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Ball[] var4 = null;
        int[] var5 = null;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        PoolGameModel var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        SceneNode var15 = null;
        SceneNode var17 = null;
        int[] var19 = null;
        SceneNode var20 = null;
        SceneNode var22 = null;
        SceneNode var24 = null;
        SceneNode var26 = null;
        SceneNode var28 = null;
        SceneNode var30 = null;
        SceneNode var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var40 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        boolean[] var69 = null;
        int[] var70 = null;
        boolean[] var71 = null;
        int[] var6_ref_int__Lifetime1;
        var9 = Pool.field_O;
        try {
          var4 = param1.gameModel.balls;
          var37 = LobbyPanelLayoutSupport.a((byte) 53, param1.viewMatrix);
          var14 = var37;
          var5 = var14;
          var36 = var5;
          var13 = var36;
          var11 = var13;
          var6_ref_int__ = var11;
          if (param0 != -55) {
            var10 = (PoolGameModel) null;
            this.buildTableGeometry((PoolGameModel) null, 25);
          }
          GzipDecoder.field_d[0] = var36[0] - SpriteResourceSupport.floatToFixed3(288.0f, true) >> 2;
          GzipDecoder.field_d[1] = var36[1] - SpriteResourceSupport.floatToFixed3(144.0f, true) >> 2;
          GzipDecoder.field_d[2] = var36[2] >> 2;
          if (var6_ref_int__ != GzipDecoder.field_d) {
            GzipDecoder.field_d[6] = var36[6];
            GzipDecoder.field_d[3] = var36[3];
            GzipDecoder.field_d[7] = var36[7];
            GzipDecoder.field_d[8] = var36[8];
            GzipDecoder.field_d[5] = var36[5];
            GzipDecoder.field_d[11] = var36[11];
            GzipDecoder.field_d[4] = var36[4];
            GzipDecoder.field_d[9] = var36[9];
            GzipDecoder.field_d[10] = var36[10];
          }
          var5[2] = ArchiveLoadSequence.bitwiseAnd(var37[2], -4);
          var5[1] = ArchiveLoadSequence.bitwiseAnd(var37[1], -4);
          var5[0] = ArchiveLoadSequence.bitwiseAnd(var37[0], -4);
          CookieDateSupport.fillScreenWhite(-3143);
          this.a(true, param1);
          this.a();
          this.a(GzipDecoder.field_d, param1.camera.b(param0 - 72));
          this.prepareBallDrawOrder(false, var37, var4);
          if ((LinkButtonPainter.field_i & 1073741824L) == 0L) {
            this.drawBallsInOrder(var37, (byte) 122, false, var4, false);
          }
          var15 = EmailAvailabilityValidator.field_y;
          var61 = GzipDecoder.field_d;
          var15.sortModelsByDepth((byte) 111, 0, var15.field_j.length, var61);
          var17 = UsernameSuggestionSupport.field_e;
          var62 = GzipDecoder.field_d;
          var17.sortModelsByDepth((byte) -122, 0, var17.field_j.length, var62);
          for (var3_int = 0; FontPaletteSupport.field_j.length > var3_int; var3_int++) {
            var40 = UsernameSuggestionSupport.field_e.field_c[var3_int];
            var19 = var40;
            var12 = var19;
            var6_ref_int__Lifetime1 = var12;
            var7 = 576;
            var8 = 288;
            stackIn_13_0 = FontPaletteSupport.field_j;
            stackIn_13_1 = var3_int;
            stackIn_13_2 = -GzipDecoder.field_d[0] + var40[0];
            if (var40[0] >= -var7) {
              if (var7 < var40[0]) {
                stackIn_16_3 = -1;
              } else {
                stackIn_16_3 = 0;
              }
            } else {
              stackIn_16_3 = 1;
            }
            stackIn_18_2 = stackIn_13_2 * stackIn_16_3;
            stackIn_18_3 = -GzipDecoder.field_d[1] + var40[1];
            if (var40[1] >= -var8) {
              if (var40[1] > var8) {
                stackIn_21_4 = -1;
              } else {
                stackIn_21_4 = 0;
              }
            } else {
              stackIn_21_4 = 1;
            }
            stackIn_24_2 = !(stackIn_18_2 + stackIn_18_3 * stackIn_21_4 <= 0);
            stackIn_13_0[stackIn_13_1] = stackIn_24_2;
          }
          var20 = CollisionContact.field_s;
          var63 = GzipDecoder.field_d;
          var20.sortModelsByDepth((byte) 104, 0, var20.field_j.length, var63);
          var22 = FadingDialog.field_U;
          var64 = GzipDecoder.field_d;
          var22.sortModelsByDepth((byte) 119, 0, var22.field_j.length, var64);
          var24 = EmailAvailabilityValidator.field_y;
          var65 = GzipDecoder.field_d;
          var24.drawModelRange((byte) -65, 0, var24.field_j.length, var65);
          var26 = FadingDialog.field_U;
          var66 = GzipDecoder.field_d;
          var26.drawModelRange((byte) -96, 0, var26.field_j.length, var66);
          var28 = CollisionContact.field_s;
          var67 = GzipDecoder.field_d;
          var28.drawModelRange((byte) -113, 0, var28.field_j.length, var67);
          if ((LinkButtonPainter.field_i & 1073741824L) == 0L) {
            for (var6 = 0; var6 < var4.length; var6++) {
              if (var4[var6].inPlay) {
                this.drawBall(var37, var4[var6]);
              }
            }
          }
          var30 = UsernameSuggestionSupport.field_e;
          var68 = GzipDecoder.field_d;
          var69 = FontPaletteSupport.field_j;
          var30.drawSortedModels(false, 0, var30.field_j.length, (byte) 100, var68, var69);
          if (0L == (1073741824L & LinkButtonPainter.field_i)) {
            stackIn_37_0 = this;
            stackIn_37_1 = var5;
            stackIn_37_2 = 112;
            stackIn_37_3 = true;
            stackIn_37_4 = var4;
            if (param1.gameModel.currentShot(83).phase != 0) {
              stackIn_38_0 = this;
              stackIn_38_5 = false;
            } else {
              stackIn_38_0 = this;
              stackIn_38_5 = true;
            }
            this.drawBallsInOrder(stackIn_37_1, (byte) stackIn_37_2, stackIn_37_3, stackIn_37_4, stackIn_38_5);
          }
          var33 = UsernameSuggestionSupport.field_e;
          var70 = GzipDecoder.field_d;
          var71 = FontPaletteSupport.field_j;
          var33.drawSortedModels(true, 0, var33.field_j.length, (byte) 117, var70, var71);
          if ((LinkButtonPainter.field_i & 256L) != 0L) {
            FadingDialog.field_U.drawAllModels(GzipDecoder.field_d, 0);
            UsernameSuggestionSupport.field_e.drawAllModels(GzipDecoder.field_d, 0);
          }
          if ((1073741824L & LinkButtonPainter.field_i) == 0L) {
            param1.updateCueStick(-1);
            param1.buildAimPreviewTrail(-128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("vf.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        ballsetUsa8Group1 = null;
        int var1 = 104 / ((param0 + 10) / 36);
        timerHoursMinutesSecondsFractions = null;
        field_nb = null;
    }

    final void initializeScene(boolean param0) {
        SceneNode dupTemp$497 = null;
        SceneNode dupTemp$498 = null;
        SceneNode dupTemp$499 = null;
        SceneNode dupTemp$500 = null;
        SceneNode dupTemp$501 = null;
        int var2;
        IntrusiveDeque var3;
        IntrusiveDeque var4;
        IntrusiveDeque var5;
        SceneNode var6;
        SceneNode var7;
        SceneNode var8;
        SceneNode var9;
        SceneNode var10;
        SceneNode var11;
        SceneNode var12;
        SceneNode var13;
        SceneNode var14;
        int var20;
        MeshBuilder var22;
        MeshBuilder var23;
        MeshBuilder var24;
        SceneNode var25;
        MeshBuilder var26;
        SceneNode var27;
        MeshBuilder var28;
        SceneNode var29;
        IntrusiveDeque var33;
        int stackIn_15_0 = 0;
        MeshBuilder stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        boolean stackIn_16_3;
        SceneNode[] stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        int var15;
        MeshBuilder var15_ref_eg;
        int var16;
        SceneNode[] var17;
        int var18;
        int var19;
        PoolMatchController var21;
        SceneNode var30;
        MeshBuilder var31;
        SceneNode var32;
        SceneNode[] var34;
        MeshBuilder var36;
        SceneNode[] var37;
        SceneNode[] var39;
        int[] var47;
        int[] var48;
        int[] var49;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        var20 = Pool.field_O;
        var2 = 0;
        this.field_U = new PolarObject[-FullscreenErrorDialog.field_hb + ClassicBallSkin.field_m];
        var3 = new IntrusiveDeque();
        var4 = new IntrusiveDeque();
        var5 = new IntrusiveDeque();
        var6 = new SceneNode();
        var7 = new SceneNode();
        var8 = new SceneNode();
        var9 = new SceneNode(QuickChatDynamicCommand.field_a - ContextMenu.field_Ob);
        SceneNode dupTemp$489 = new SceneNode(BirthDateInputWidget.field_db - ByteRecordSubmission.field_n);
        var10 = dupTemp$489;
        SceneNode dupTemp$490 = new SceneNode((FixedPointVectorSupport.field_d - DialWidget.field_S) * 4);
        var11 = dupTemp$490;
        SceneNode dupTemp$491 = new SceneNode(new SceneNode[]{dupTemp$489, var6, dupTemp$490});
        UsernameSuggestionSupport.field_e = dupTemp$491;
        SceneNode dupTemp$492 = new SceneNode(BirthDateInputWidget.field_db - ByteRecordSubmission.field_n);
        var12 = dupTemp$492;
        SceneNode dupTemp$493 = new SceneNode(4 * (ByteStorage.field_e - ScoreboardNameRecord.field_g) + (ChatReplacementSupport.field_c - MonotonicClock.field_f) * 2);
        var13 = dupTemp$493;
        SceneNode dupTemp$494 = new SceneNode(new SceneNode[]{dupTemp$492, var7, dupTemp$493});
        FadingDialog.field_U = dupTemp$494;
        SceneNode dupTemp$495 = new SceneNode(4 * (DraggableWidget.field_V - DelayedServerPacket.field_t));
        CollisionContact.field_s = dupTemp$495;
        SceneNode dupTemp$496 = new SceneNode(new SceneNode[]{var8, var9});
        EmailAvailabilityValidator.field_y = dupTemp$496;
        var14 = new SceneNode(new SceneNode[]{dupTemp$491, dupTemp$494, dupTemp$495, dupTemp$496});
        for (var2Lifetime1 = ByteRecordSubmission.field_n; BirthDateInputWidget.field_db > var2Lifetime1; var2Lifetime1++) {
          if (BallDebugOverlay.field_f < this.field_O[var2Lifetime1].field_x + this.field_M[var2Lifetime1][2]) {
            BallDebugOverlay.field_f = this.field_M[var2Lifetime1][2] + this.field_O[var2Lifetime1].field_x;
          }
          var23 = TutorialController.b((byte) 122);
          var22 = TutorialController.b((byte) 121);
          JaggrabDownloader.a(0, var23, 0, false, -this.field_M[var2Lifetime1][2], 0, 0, 1, var22, this.field_O[var2Lifetime1]);
          var12.field_b[var2Lifetime1 - ByteRecordSubmission.field_n] = SceneNodeFactory.createSceneNode(var22, this.field_M[var2Lifetime1], (byte) 101);
          var10.field_b[-ByteRecordSubmission.field_n + var2Lifetime1] = SceneNodeFactory.createSceneNode(var23, this.field_M[var2Lifetime1], (byte) 101);
        }
        for (var2Lifetime2 = ContextMenu.field_Ob; QuickChatDynamicCommand.field_a > var2Lifetime2; var2Lifetime2++) {
          var9.field_b[-ContextMenu.field_Ob + var2Lifetime2] = SceneNodeFactory.createSceneNode(this.field_O[var2Lifetime2], this.field_M[var2Lifetime2], (byte) 101);
        }
        for (var2Lifetime3 = FullscreenErrorDialog.field_hb; ClassicBallSkin.field_m > var2Lifetime3; var2Lifetime3++) {
          var24 = this.field_O[var2Lifetime3];
          var33 = new IntrusiveDeque();
          var24.computeBounds();
          if (var24.field_V > -this.field_M[var2Lifetime3][2]) {
            dupTemp$497 = SceneNodeFactory.createSceneNode(var24, this.field_M[var2Lifetime3], (byte) 101);
            var30 = dupTemp$497;
            var4.addFirst((byte) -121, new SceneNodeEntry(dupTemp$497));
            var33.addFirst((byte) -39, new SceneNodeEntry(var30));
          } else {
            if (-this.field_M[var2Lifetime3][2] <= var24.field_x) {
              var28 = TutorialController.b((byte) 121);
              var26 = TutorialController.b((byte) 122);
              stackIn_15_0 = 0;
              stackIn_15_1 = var28;
              stackIn_15_2 = 0;
              stackIn_16_3 = !(param0);
              JaggrabDownloader.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_16_3, -this.field_M[var2Lifetime3][2], 0, 0, 1, var26, var24);
              dupTemp$498 = SceneNodeFactory.createSceneNode(var26, this.field_M[var2Lifetime3], (byte) 101);
              var27 = dupTemp$498;
              var4.addFirst((byte) -51, new SceneNodeEntry(dupTemp$498));
              var33.addFirst((byte) 125, new SceneNodeEntry(var27));
              dupTemp$499 = SceneNodeFactory.createSceneNode(var28, this.field_M[var2Lifetime3], (byte) 101);
              var29 = dupTemp$499;
              var3.addFirst((byte) -47, new SceneNodeEntry(dupTemp$499));
              var33.addFirst((byte) 122, new SceneNodeEntry(var29));
            } else {
              dupTemp$500 = SceneNodeFactory.createSceneNode(var24, this.field_M[var2Lifetime3], (byte) 101);
              var25 = dupTemp$500;
              var3.addFirst((byte) 97, new SceneNodeEntry(dupTemp$500));
              var33.addFirst((byte) 90, new SceneNodeEntry(var25));
            }
          }
          var31 = this.field_O[UsernameSuggestionsPanel.field_W + (var2Lifetime3 - FullscreenErrorDialog.field_hb)];
          var15_ref_eg = var31;
          var31.computeBounds();
          dupTemp$501 = SceneNodeFactory.createSceneNode(var15_ref_eg, this.field_M[UsernameSuggestionsPanel.field_W - FullscreenErrorDialog.field_hb + var2Lifetime3], (byte) 101);
          var32 = dupTemp$501;
          var5.addFirst((byte) 108, new SceneNodeEntry(dupTemp$501));
          var33.addFirst((byte) 84, new SceneNodeEntry(var32));
          this.field_U[-FullscreenErrorDialog.field_hb + var2Lifetime3] = new PolarObject(new SceneNode(var33));
        }
        var6.setChildren((byte) -120, var3);
        var7.setChildren((byte) 38, var4);
        if (!param0) {
          var21 = (PoolMatchController) null;
          this.drawScene((byte) 16, (PoolMatchController) null);
        }
        var8.setChildren((byte) 72, var5);
        var15 = 0;
        for (var2Lifetime4 = DialWidget.field_S; var2Lifetime4 < FixedPointVectorSupport.field_d; var2Lifetime4++) {
          var36 = this.field_O[var2Lifetime4];
          var47 = this.field_M[var2Lifetime4];
          var34 = var11.field_b;
          var19 = var15;
          MirroredSceneSupport.buildMirroredSceneEntries(var34, false, var47[1] - 0, 0 + var47[2], var36, var47[0] - 0, var19);
          var15 += 4;
        }
        var15Lifetime1 = 0;
        for (var2Lifetime5 = ScoreboardNameRecord.field_g; ByteStorage.field_e > var2Lifetime5; var2Lifetime5++) {
          var16 = var2Lifetime5;
          var37 = var13.field_b;
          var18 = var15Lifetime1;
          var48 = this.field_M[var16];
          MirroredSceneSupport.buildMirroredSceneEntries(var37, false, var48[1], var48[2], this.field_O[var16], var48[0], var18);
          var15Lifetime1 += 4;
        }
        for (var2Lifetime6 = MonotonicClock.field_f; var2Lifetime6 < ChatReplacementSupport.field_c; var2Lifetime6++) {
          var16Lifetime1 = var2Lifetime6;
          var39 = var13.field_b;
          var18Lifetime1 = var15Lifetime1;
          OptionsScreen.a(var18Lifetime1, this.field_M[var16Lifetime1][1], this.field_M[var16Lifetime1][2], 1, var39, this.field_M[var16Lifetime1][0], this.field_O[var16Lifetime1]);
          var15Lifetime1 += 2;
        }
        var15Lifetime2 = 0;
        for (var2Lifetime7 = DelayedServerPacket.field_t; var2Lifetime7 < DraggableWidget.field_V; var2Lifetime7++) {
          var16Lifetime2 = var2Lifetime7;
          var17 = CollisionContact.field_s.field_b;
          var18Lifetime2 = var15Lifetime2;
          var49 = this.field_M[var16Lifetime2];
          stackIn_34_0 = var17;
          stackIn_35_1 = !(param0);
          MirroredSceneSupport.buildMirroredSceneEntries(stackIn_34_0, stackIn_35_1, var49[1], var49[2], this.field_O[var16Lifetime2], var49[0], var18Lifetime2);
          var15Lifetime2 += 4;
        }
        var14.normalizeOffsets(0);
        new SceneNode(new SceneNode[]{var11, var10, var12}).mergeChildMeshes(false);
        new SceneNode(new SceneNode[]{var6, var7}).mergeChildMeshes(false);
        var14.bakeModels(this.field_q, this.field_e, this.field_F, (byte) -79, this.field_u, this.field_C);
        UsernameSuggestionSupport.field_e.allocateModelArrays(115);
        FontPaletteSupport.field_j = new boolean[UsernameSuggestionSupport.field_e.field_j.length];
        FadingDialog.field_U.allocateModelArrays(101);
        CollisionContact.field_s.allocateModelArrays(97);
        EmailAvailabilityValidator.field_y.allocateModelArrays(92);
    }

    private final void a(int[] param0, int param1) {
        int var4 = 0;
        int var19 = 0;
        int var3;
        int var5;
        int var6;
        int var7;
        int var12;
        int var13;
        int var14;
        int var15;
        int stackIn_3_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var16;
        int var17;
        int var18;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var16Lifetime1;
        int var16Lifetime1Lifetime1;
        var3 = 65536 / SoftwareRasterizer.width;
        if (SoftwareRasterizer.clipTop <= param1) {
          stackIn_3_0 = param1;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipTop;
        }
        for (var4 = stackIn_3_0; var4 < SoftwareRasterizer.clipBottom; var4++) {
          var5 = var4 - 240;
          var6 = var4 - param1;
          if (var6 >= 5) {
            var6 = 0;
          } else {
            var6 = (5 - var6) * 127 / 5;
          }
          var7 = 127 - var6;
          var12 = param0[9] + (param0[3] * (SoftwareRasterizer.clipLeft - 320) + param0[6] * var5 >> 9) >> 1;
          var13 = param0[10] + (param0[4] * (SoftwareRasterizer.clipLeft - 320) + param0[7] * var5 >> 9) >> 1;
          var14 = param0[11] + (param0[5] * (SoftwareRasterizer.clipLeft - 320) + param0[8] * var5 >> 9) >> 1;
          var15 = var12 * var12 + var13 * var13 + var14 * var14 >> 16;
          if (var15 > 0) {
            var15 = AccountDisplayNameSupport.inverseSquareRoot(var15, -128);
            var12 = ArchiveProvider.divideFixed16(var15, (byte) -80, (long)var12);
            var13 = ArchiveProvider.divideFixed16(var15, (byte) -100, (long)var13);
            var14 = ArchiveProvider.divideFixed16(var15, (byte) -92, (long)var14);
            if (var14 != 0) {
              var16 = ArchiveProvider.divideFixed16(var14, (byte) -90, (long)(BallDebugOverlay.field_f - param0[2]));
              var8 = param0[0] + (var16 * var12 >> 16) >> 3;
              var10 = param0[1] + (var16 * var13 >> 16) >> 3;
              var12 = param0[9] + (param0[3] * (SoftwareRasterizer.clipRight - 320) + param0[6] * var5 >> 9) >> 1;
              var13 = param0[10] + (param0[4] * (SoftwareRasterizer.clipRight - 320) + param0[7] * var5 >> 9) >> 1;
              var14 = param0[11] + (param0[5] * (SoftwareRasterizer.clipRight - 320) + param0[8] * var5 >> 9) >> 1;
              var15 = var12 * var12 + var13 * var13 + var14 * var14 >> 16;
              if (var15 > 0) {
                var15 = AccountDisplayNameSupport.inverseSquareRoot(var15, -121);
                var12 = ArchiveProvider.divideFixed16(var15, (byte) -67, (long)var12);
                var13 = ArchiveProvider.divideFixed16(var15, (byte) -120, (long)var13);
                var14 = ArchiveProvider.divideFixed16(var15, (byte) -119, (long)var14);
                if (var14 != 0) {
                  var16Lifetime1 = ArchiveProvider.divideFixed16(var14, (byte) -112, (long)(BallDebugOverlay.field_f - param0[2]));
                  var9 = param0[0] + (var16Lifetime1 * var12 >> 16) >> 3;
                  var11 = param0[1] + (var16Lifetime1 * var13 >> 16) >> 3;
                  var12 = var9 - var8;
                  var13 = var11 - var10;
                  var14 = var12 * var3;
                  var15 = var13 * var3;
                  var16Lifetime1Lifetime1 = (var8 << 16) + var14 * SoftwareRasterizer.clipLeft;
                  var17 = (var10 << 16) + var15 * SoftwareRasterizer.clipLeft;
                  var18 = var4 * SoftwareRasterizer.width + SoftwareRasterizer.clipLeft;
                  for (var19 = SoftwareRasterizer.clipLeft; var19 < SoftwareRasterizer.clipRight; var19++) {
                    if (SoftwareRasterizer.pixels[var18] == -1) {
                      var20 = ((var16Lifetime1Lifetime1 >> 16 & 255) << 8) + (var17 >> 16 & 255);
                      var21 = ResourceArchive.field_g >> 0;
                      var22 = 256 - var21;
                      var23 = ArchiveLoadStep.field_g[var20];
                      var24 = ModelInstance.field_c[var20];
                      var23 = ((var23 & 65280) * var22 >> 8) + ((var24 & 65280) * var21 >> 8) & 65280 | ((var23 & 16711935) * var22 >> 8) + ((var24 & 16711935) * var21 >> 8) & 16711935;
                      if (var6 != 0) {
                        var23 = ((var23 & 65280) * var7 >> 7) + (60928 * var6 >> 7) & 65280 | ((var23 & 16711935) * var7 >> 7) + (15597806 * var6 >> 7) & 16711935;
                      }
                      SoftwareRasterizer.pixels[var18] = var23;
                    }
                    var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + var14;
                    var17 = var17 + var15;
                    var18++;
                  }
                }
              }
            }
          }
        }
    }

    final void loadModels(ResourceArchive param0, int param1) {
        int incrementValue$61 = 0;
        int incrementValue$62 = 0;
        int incrementValue$63 = 0;
        int incrementValue$64 = 0;
        int incrementValue$65 = 0;
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int incrementValue$68 = 0;
        int incrementValue$69 = 0;
        int incrementValue$70 = 0;
        int incrementValue$71 = 0;
        int incrementValue$72 = 0;
        int incrementValue$73 = 0;
        int incrementValue$74 = 0;
        int incrementValue$75 = 0;
        int incrementValue$76 = 0;
        int incrementValue$77 = 0;
        int incrementValue$78 = 0;
        int incrementValue$79 = 0;
        int incrementValue$80 = 0;
        int incrementValue$81 = 0;
        int incrementValue$82 = 0;
        int incrementValue$83 = 0;
        int incrementValue$84 = 0;
        int incrementValue$85 = 0;
        int incrementValue$86 = 0;
        int incrementValue$87 = 0;
        int incrementValue$88 = 0;
        int incrementValue$89 = 0;
        int incrementValue$90 = 0;
        int incrementValue$91 = 0;
        int incrementValue$92 = 0;
        int incrementValue$93 = 0;
        int incrementValue$94 = 0;
        int incrementValue$95 = 0;
        int incrementValue$96 = 0;
        int incrementValue$97 = 0;
        int incrementValue$98 = 0;
        int incrementValue$99 = 0;
        int incrementValue$100 = 0;
        int incrementValue$101 = 0;
        int incrementValue$102 = 0;
        int incrementValue$103 = 0;
        int incrementValue$104 = 0;
        int incrementValue$105 = 0;
        int incrementValue$106 = 0;
        int incrementValue$107 = 0;
        int incrementValue$108 = 0;
        int incrementValue$109 = 0;
        int incrementValue$110 = 0;
        int incrementValue$111 = 0;
        int incrementValue$112 = 0;
        int incrementValue$113 = 0;
        int incrementValue$114 = 0;
        int incrementValue$115 = 0;
        int incrementValue$116 = 0;
        int incrementValue$117 = 0;
        int incrementValue$118 = 0;
        int incrementValue$119 = 0;
        int incrementValue$120 = 0;
        int incrementValue$121 = 0;
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var14 = Pool.field_O;
        try {
          var3_int = 0;
          this.field_O = new MeshBuilder[61];
          UsernameSuggestionsPanel.field_W = var3_int;
          incrementValue$61 = var3_int;
          var3_int++;
          this.field_O[incrementValue$61] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_a");
          incrementValue$62 = var3_int;
          var3_int++;
          this.field_O[incrementValue$62] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_b");
          incrementValue$63 = var3_int;
          var3_int++;
          this.field_O[incrementValue$63] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_c");
          incrementValue$64 = var3_int;
          var3_int++;
          this.field_O[incrementValue$64] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_d");
          incrementValue$65 = var3_int;
          var3_int++;
          this.field_O[incrementValue$65] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_e");
          incrementValue$66 = var3_int;
          var3_int++;
          this.field_O[incrementValue$66] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_f");
          incrementValue$67 = var3_int;
          var3_int++;
          this.field_O[incrementValue$67] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_g");
          incrementValue$68 = var3_int;
          var3_int++;
          this.field_O[incrementValue$68] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_h");
          incrementValue$69 = var3_int;
          var3_int++;
          this.field_O[incrementValue$69] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_i");
          incrementValue$70 = var3_int;
          var3_int++;
          this.field_O[incrementValue$70] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_us_j");
          FullscreenErrorDialog.field_hb = var3_int;
          incrementValue$71 = var3_int;
          var3_int++;
          this.field_O[incrementValue$71] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_a");
          incrementValue$72 = var3_int;
          var3_int++;
          this.field_O[incrementValue$72] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_b");
          incrementValue$73 = var3_int;
          var3_int++;
          this.field_O[incrementValue$73] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_c");
          incrementValue$74 = var3_int;
          var3_int++;
          this.field_O[incrementValue$74] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_d");
          incrementValue$75 = var3_int;
          var3_int++;
          this.field_O[incrementValue$75] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_e");
          incrementValue$76 = var3_int;
          var3_int++;
          this.field_O[incrementValue$76] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_f");
          incrementValue$77 = var3_int;
          var3_int++;
          this.field_O[incrementValue$77] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_g");
          incrementValue$78 = var3_int;
          var3_int++;
          this.field_O[incrementValue$78] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_h");
          incrementValue$79 = var3_int;
          var3_int++;
          this.field_O[incrementValue$79] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_i");
          incrementValue$80 = var3_int;
          var3_int++;
          this.field_O[incrementValue$80] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_isle_j");
          ContextMenu.field_Ob = var3_int;
          ClassicBallSkin.field_m = var3_int;
          incrementValue$81 = var3_int;
          var3_int++;
          this.field_O[incrementValue$81] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_a");
          incrementValue$82 = var3_int;
          var3_int++;
          this.field_O[incrementValue$82] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_b");
          incrementValue$83 = var3_int;
          var3_int++;
          this.field_O[incrementValue$83] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_c");
          incrementValue$84 = var3_int;
          var3_int++;
          this.field_O[incrementValue$84] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_d");
          incrementValue$85 = var3_int;
          var3_int++;
          this.field_O[incrementValue$85] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_e");
          incrementValue$86 = var3_int;
          var3_int++;
          this.field_O[incrementValue$86] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_f");
          incrementValue$87 = var3_int;
          var3_int++;
          this.field_O[incrementValue$87] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_g");
          incrementValue$88 = var3_int;
          var3_int++;
          this.field_O[incrementValue$88] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_h");
          incrementValue$89 = var3_int;
          var3_int++;
          this.field_O[incrementValue$89] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_i");
          incrementValue$90 = var3_int;
          var3_int++;
          this.field_O[incrementValue$90] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_j");
          incrementValue$91 = var3_int;
          var3_int++;
          this.field_O[incrementValue$91] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_k");
          incrementValue$92 = var3_int;
          var3_int++;
          this.field_O[incrementValue$92] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_l");
          incrementValue$93 = var3_int;
          var3_int++;
          this.field_O[incrementValue$93] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_m");
          incrementValue$94 = var3_int;
          var3_int++;
          this.field_O[incrementValue$94] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_n");
          incrementValue$95 = var3_int;
          var3_int++;
          this.field_O[incrementValue$95] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_o");
          incrementValue$96 = var3_int;
          var3_int++;
          this.field_O[incrementValue$96] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_us_p");
          QuickChatDynamicCommand.field_a = var3_int;
          incrementValue$97 = var3_int;
          var3_int++;
          this.field_O[incrementValue$97] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_sea");
          ByteRecordSubmission.field_n = var3_int;
          incrementValue$98 = var3_int;
          var3_int++;
          this.field_O[incrementValue$98] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_a");
          incrementValue$99 = var3_int;
          var3_int++;
          this.field_O[incrementValue$99] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_b");
          incrementValue$100 = var3_int;
          var3_int++;
          this.field_O[incrementValue$100] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_c");
          incrementValue$101 = var3_int;
          var3_int++;
          this.field_O[incrementValue$101] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_d");
          incrementValue$102 = var3_int;
          var3_int++;
          this.field_O[incrementValue$102] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_e");
          incrementValue$103 = var3_int;
          var3_int++;
          this.field_O[incrementValue$103] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_f");
          incrementValue$104 = var3_int;
          var3_int++;
          this.field_O[incrementValue$104] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_g");
          incrementValue$105 = var3_int;
          var3_int++;
          this.field_O[incrementValue$105] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_h");
          incrementValue$106 = var3_int;
          var3_int++;
          this.field_O[incrementValue$106] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_i");
          incrementValue$107 = var3_int;
          var3_int++;
          this.field_O[incrementValue$107] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_j");
          incrementValue$108 = var3_int;
          var3_int++;
          this.field_O[incrementValue$108] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_k");
          incrementValue$109 = var3_int;
          var3_int++;
          this.field_O[incrementValue$109] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_l");
          incrementValue$110 = var3_int;
          var3_int++;
          this.field_O[incrementValue$110] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_m");
          incrementValue$111 = var3_int;
          var3_int++;
          this.field_O[incrementValue$111] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_n");
          incrementValue$112 = var3_int;
          var3_int++;
          this.field_O[incrementValue$112] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_o");
          incrementValue$113 = var3_int;
          var3_int++;
          this.field_O[incrementValue$113] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_main_p");
          ScoreboardNameRecord.field_g = var3_int;
          BirthDateInputWidget.field_db = var3_int;
          incrementValue$114 = var3_int;
          var3_int++;
          this.field_O[incrementValue$114] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_hole_a");
          MonotonicClock.field_f = var3_int;
          ByteStorage.field_e = var3_int;
          incrementValue$115 = var3_int;
          var3_int++;
          this.field_O[incrementValue$115] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_hole_b");
          ChatReplacementSupport.field_c = var3_int;
          DialWidget.field_S = var3_int;
          incrementValue$116 = var3_int;
          var3_int++;
          this.field_O[incrementValue$116] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_corner");
          incrementValue$117 = var3_int;
          var3_int++;
          this.field_O[incrementValue$117] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_side_a");
          incrementValue$118 = var3_int;
          var3_int++;
          this.field_O[incrementValue$118] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_side_b");
          incrementValue$119 = var3_int;
          var3_int++;
          this.field_O[incrementValue$119] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_side_c");
          DelayedServerPacket.field_t = var3_int;
          FixedPointVectorSupport.field_d = var3_int;
          incrementValue$120 = var3_int;
          var3_int++;
          this.field_O[incrementValue$120] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_top_a");
          incrementValue$121 = var3_int;
          var3_int++;
          this.field_O[incrementValue$121] = MeshBuilder.loadFromArchive(param0, "", "polar_table/ice_top_b");
          DraggableWidget.field_V = var3_int;
          this.field_A = new CueStick();
          this.field_A.a(MeshBuilder.loadFromArchive(param0, "", "cues/ice_cue"), (byte) -105);
          for (var4 = 0; this.field_O.length > var4; var4++) {
            VerticalScrollbar.a(0, this.field_O[var4]);
          }
          var5 = 2147483647;
          var6 = -2147483648;
          var7 = 2147483647;
          var8 = -2147483648;
          var9 = 2147483647;
          var10 = -2147483648;
          for (var4Lifetime1 = DelayedServerPacket.field_t; DraggableWidget.field_V > var4Lifetime1; var4Lifetime1++) {
            MeshBoundsSupport.computeMeshBounds(this.field_O[var4Lifetime1], -23109);
            if (this.field_O[var4Lifetime1].field_D < var5) {
              var5 = this.field_O[var4Lifetime1].field_D;
            }
            if (var9 > this.field_O[var4Lifetime1].field_V) {
              var9 = this.field_O[var4Lifetime1].field_V;
            }
            if (this.field_O[var4Lifetime1].field_S > var8) {
              var8 = this.field_O[var4Lifetime1].field_S;
            }
            if (var6 < this.field_O[var4Lifetime1].field_w) {
              var6 = this.field_O[var4Lifetime1].field_w;
            }
            if (this.field_O[var4Lifetime1].field_y < var7) {
              var7 = this.field_O[var4Lifetime1].field_y;
            }
            if (this.field_O[var4Lifetime1].field_x > var10) {
              var10 = this.field_O[var4Lifetime1].field_x;
            }
          }
          var7 = 2 * var7 - var8;
          var5 = -var6 + 2 * var5;
          var11 = (var5 + var6) / 2;
          var12 = (var7 + var8) / 2;
          var13 = var10;
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_O.length; var4Lifetime2++) {
            TutorialFactory.translateMeshOrigin(var11, 57, var13, this.field_O[var4Lifetime2], var12);
          }
          this.field_M = new int[this.field_O.length][3];
          if (param1 >= -43) {
            this.field_V = (PcmSample) null;
          }
          for (var4Lifetime3 = 0; this.field_O.length > var4Lifetime3; var4Lifetime3++) {
            ModelOriginSupport.recenterModel(this.field_M[var4Lifetime3], 0, this.field_O[var4Lifetime3]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("vf.KA(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final void releaseModels(boolean param0) {
        ValueNoise.releaseNoiseTable();
        TableScene.field_w = null;
        BufferedSocket.field_p = null;
        ModelInstance.field_c = null;
        if (!param0) {
          return;
        }
        ArchiveLoadStep.field_g = null;
        this.stopSounds((byte) 119);
    }

    final void buildTableGeometry(PoolGameModel param0, int param1) {
        int[] var6 = null;
        int[] var5 = null;
        int[] var4 = null;
        super.buildTableGeometry(param0, param1 + 0);
        if (param1 != 21894) {
          return;
        }
        try {
          var6 = GradientPaletteSupport.buildGradientPalette(new int[]{0, 3368601, 3, 3381708}, 101);
          var5 = var6;
          var4 = var5;
          int[] var3 = var4;
          TableScene.field_w = GradientPaletteSupport.buildGradientPalette(new int[]{0, var6[0], 128, var6[1], 256, var6[2]}, param1 ^ 21919);
          ValueNoise.initializeTable();
          this.initSoundSlots(86, param0.balls.length);
          BufferedSocket.field_p = new int[65536];
          ArchiveLoadStep.field_g = new int[65536];
          ModelInstance.field_c = new int[65536];
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void loadMusicTracks(int param0, ResourceArchive param1) {
        try {
          this.field_b = MusicTrack.loadFromArchive(param1, "", "pool_polar");
          this.field_i = MusicTrack.loadFromArchive(param1, "", "pool_polar_win_jingle");
          this.field_n = MusicTrack.loadFromArchive(param1, "", "pool_polar_lose_jingle");
          if (param0 != 1) {
            this.releaseModels(true);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void playTableSound(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        regionExit1: {
          var7 = Pool.field_O;
          var5 = -125 / ((-44 - param2) / 56);
          var6 = param0;
          if (var6 == 5) {
            var6 = MaxLengthTextInputWidget.nextRandomInt(3, true, RankingsRequest.field_r);
            switch (var6) {
              case 1:
                MusicPatchEnvelope.a(100, this.field_cb, param3, param1);
                break;
              case 2:
                MusicPatchEnvelope.a(100, this.field_ab, param3, param1);
                break;
              case 0:
                MusicPatchEnvelope.a(100, this.field_ib, param3, param1);
                break;
              default:
                break;
            }
          } else {
            if (15 != var6) {
              if (2 != var6) {
                if (var6 != 16 &&
                  var6 != 3) {
                  switch (var6) {
                    case 0:
                      MusicPatchEnvelope.a(100, this.field_Y, param3, param1);
                      break regionExit1;
                    case 1:
                      MusicPatchEnvelope.a(100, this.field_X, param3, param1);
                      break regionExit1;
                    case 6:
                      MusicPatchEnvelope.a(100, this.field_S, param3, param1);
                      System.out.println("playing respot the white");
                      break regionExit1;
                    case 4:
                      MusicPatchEnvelope.a(100, this.field_jb, param3, param1);
                      break regionExit1;
                    default:
                      super.playTableSound(param0, param1, (byte) 115, param3);
                      break regionExit1;
                  }
                }
                MusicPatchEnvelope.a(100, this.field_hb, param3, param1);
              } else {
                MusicPatchEnvelope.a(100, this.field_bb, param3, param1);
              }
            } else {
              MusicPatchEnvelope.a(100, this.field_mb, param3, param1);
            }
          }
        }
    }

    final void loadSceneSprites(int param0, ResourceArchive param1) {
        try {
          if (param0 != -23569) {
            this.field_T = (PcmSample) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, PoolMatchController param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.camera.b(-128);
          if (!param0) {
            PolarTableScene.clearSharedReferences((byte) -126);
          }
          var4 = this.field_B.field_z << 1;
          var5 = this.field_B.field_A << 1;
          if (var3_int > 0) {
            var6 = (int)((double)var4 * -param1.camera.getYaw(param0) / 2.0 / 3.141592653589793);
            var7 = -var5 + var3_int;
            this.field_B.drawScaled(var6 - var4, var7, var4, var5);
            if (-640 + var4 > var6) {
              this.field_B.drawScaled(var6, var7, var4, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vf.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void a() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        int[] var2 = null;
        int var1 = ResourceArchive.field_g + 32;
        for (var2_int = ResourceArchive.field_g; var2_int < var1; var2_int++) {
          var3 = var2_int * 256;
          for (var4 = 0; var4 < 256; var4++) {
            incrementValue$0 = var3;
            var3++;
            BufferedSocket.field_p[incrementValue$0] = ValueNoise.a(var4 << 6, var2_int << 6, HotspotRectangle.field_r << 7, TableScene.field_w, 128, 6);
          }
        }
        if (var1 >= 256) {
          var2 = BufferedSocket.field_p;
          BufferedSocket.field_p = ArchiveLoadStep.field_g;
          ArchiveLoadStep.field_g = ModelInstance.field_c;
          ModelInstance.field_c = var2;
          var1 = 32;
          ResourceArchive.field_g = 0;
          HotspotRectangle.field_r = HotspotRectangle.field_r + 1;
        } else {
          ResourceArchive.field_g = ResourceArchive.field_g + 32;
        }
    }

    final void loadSounds(SoundCache param0, int param1) {
        try {
          this.field_mb = param0.getSynthesizedSound("", "polar_blackball_collision1", (byte) 127);
          this.field_jb = param0.getVorbisSound("polar_pot_ball_pocket2", true, "");
          this.field_S = param0.getSynthesizedSound("", "polar_respot_the_white1", (byte) 126);
          param0.getSynthesizedSound("", "polar_respot_the_white_penguin", (byte) 121);
          this.field_ib = param0.getSynthesizedSound("", "polar_ball_cushion1", (byte) 122);
          this.field_cb = param0.getSynthesizedSound("", "polar_ball_cushion2", (byte) 126);
          this.field_ab = param0.getSynthesizedSound("", "polar_ball_cushion3", (byte) 123);
          param0.getSynthesizedSound("", "polar_ball_cushion4", (byte) 125);
          param0.getSynthesizedSound("", "polar_bg_ice_crack1", (byte) 127);
          this.field_eb = param0.getSynthesizedSound("", "polar_bg_wave1", (byte) 126);
          this.field_Z = param0.getSynthesizedSound("", "polar_bg_wave2", (byte) 124);
          this.field_kb = param0.getSynthesizedSound("", "polar_bg_wave3", (byte) 123);
          this.field_V = param0.getSynthesizedSound("", "polar_bg_wind1", (byte) 126);
          int var3_int = -10 % ((param1 - 39) / 38);
          this.field_W = param0.getSynthesizedSound("", "polar_bg_wind2", (byte) 122);
          this.field_T = param0.getSynthesizedSound("", "polar_bg_wind3", (byte) 123);
          this.field_db = param0.getSynthesizedSound("", "polar_bg_wind4", (byte) 121);
          this.field_fb = param0.getSynthesizedSound("", "polar_bg_wind5", (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        super.b(param0);
        DebugTuningSlider.field_f = 0;
        for (var2 = 0; var2 < this.field_U.length; var2++) {
          this.field_U[var2].a(-40);
        }
    }

    final void loadBackdrop(int param0, ResourceArchive param1) {
        try {
          if (param0 != 5) {
            this.field_fb = (PcmSample) null;
          }
          this.field_B = new Sprite(param1.getFileByName(false, "polar-sky.jpg", ""), (java.awt.Component) ((Object) TimeTrialSelectScreen.field_K));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vf.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PolarTableScene() {
        this.field_v = 8559779;
        this.updateLightPosition(112);
    }

    static {
        ballsetUsa8Group1 = "Stripes";
        timerHoursMinutesSecondsFractions = "hh:mm:ss.ff";
    }
}
