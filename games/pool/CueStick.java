/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CueStick {
    private ModelMesh[] field_m;
    private MeshBuilder[] segments;
    boolean field_g;
    static QuickChatDynamicCommand field_i;
    private double[] segmentOffsets;
    static String timerHoursMinutesSeconds;
    static String youLostTwoLives;
    int[] field_l;
    static String playerYouFirstListAreOfferingDraw;
    private int[][] field_d;
    static String back;
    static int[] field_h;
    static String playerXLostALife;

    final static void a(boolean param0, boolean param1, ResourceArchive param2, ResourceArchive param3) {
        try {
          AlternateLongAndTextLoginPayload.a(RenderingInitializationSupport.field_d, FixedPointVectorSupport.field_c, TutorialFactory.field_d, RasterBuffer.field_f, AlignedIconLabel.field_Lb, UiWidget.field_A, TimeTrialSelectScreen.field_M, AchievementSubmission.field_l, param0, GameApplet.field_a, ScreenProjectionSupport.field_f, (byte) 37);
          if (param1) {
            ResourceArchive var5 = (ResourceArchive) null;
            CueStick.a(true, true, (ResourceArchive) null, (ResourceArchive) null);
          }
          ThemeSelectScreen.field_M = NameEntryPopup.a(0, "lobby", param2, "chatfilter");
          TranslatedUiText.field_i[1] = ProjectedLineSupport.muChatFriends;
          TranslatedUiText.field_i[2] = KillerRules.muChatOff;
          TranslatedUiText.field_i[0] = AccountCreationDialog.muChatOn;
          QuickChatMenuSupport.createQuickChatMenu(MembershipBenefitsLoader.field_a, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(MeshBuilder param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var7_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        MeshBuilder var3 = null;
        RuntimeException var3_ref = null;
        MeshBuilder var5_ref_eg = null;
        int var5 = 0;
        int var6_int = 0;
        MeshBuilder var6 = null;
        MeshBuilder var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        var9 = Pool.field_O;
        try {
          BrowserCookieWriter.a(param0, true);
          FaceBucketSupport.mirrorAlongZ(param0, 5);
          param0.computeBounds();
          while (1500 > -param0.field_V + param0.field_x) {
            for (var3_int = 0; param0.vertexCount > var3_int; var3_int++) {
              param0.vertexX[var3_int] = param0.vertexX[var3_int] << 1;
              param0.vertexY[var3_int] = param0.vertexY[var3_int] << 1;
              param0.vertexZ[var3_int] = param0.vertexZ[var3_int] << 1;
            }
            param0.clearCaches();
            param0.computeBounds();
          }
          var13 = new int[3];
          ModelOriginSupport.recenterModel(var13, 0, param0);
          this.segments = new MeshBuilder[2];
          if (param1 > -96) {
            this.field_m = (ModelMesh[]) null;
          }
          this.field_m = new ModelMesh[this.segments.length];
          this.segmentOffsets = new double[this.segments.length];
          this.field_d = new int[this.segments.length][3];
          var3 = param0;
          for (var4 = 0; var4 < this.segments.length; var4++) {
            if (var4 >= -1 + this.segments.length) {
              this.segments[var4] = var3;
            } else {
              this.segments[var4] = TutorialController.b((byte) 121);
              var5_ref_eg = TutorialController.b((byte) 124);
              var6_int = (-param0.field_V + param0.field_x) * (1 + var4) / this.segments.length + param0.field_V;
              JaggrabDownloader.a(0, this.segments[var4], 0, false, var6_int, 0, 0, 1, var5_ref_eg, var3);
              var3 = var5_ref_eg;
            }
            this.segments[var4].clearCaches();
            this.segments[var4].computeBounds();
            var6 = this.segments[var4];
            MeshBoundsSupport.computeMeshBounds(var6, -23109);
            var5 = (var6.field_V + var6.field_x) / 2;
            for (var7_int = 0; var6.vertexZ.length > var7_int; var7_int++) {
              var6.vertexZ[var7_int] = var6.vertexZ[var7_int] - var5;
            }
            var6.clearCaches();
            this.segmentOffsets[var4] = (double)KillerRules.e(-this.segments[0].field_V + var5, 3);
            if (var4 > 0) {
              var7 = this.segments[var4 - 1];
              var7.computeNormals();
              var8 = var7.field_V + var7.field_x >> 1;
              var7.mergeFrom(var6, 0, 0, -var8 + var5, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_24_0 = var3_ref;
          stackIn_24_1 = new StringBuilder().append("jk.I(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(long param0, int param1, int param2) {
        CipherPacketBuffer var4 = JaggrabDownloader.field_j;
        var4.writeCipheredOpcode(false, param1);
        var4.position = var4.position + 1;
        if (param2 != 0) {
          playerXLostALife = (String) null;
        }
        int var5 = var4.position;
        var4.writeByte(7, false);
        var4.writeLong(param0, (byte) -119);
        var4.writeByteLengthPrefix(var4.position - var5, true);
    }

    final void buildSegments(int param0) {
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = Pool.field_O;
        int var2 = (int)Math.ceil((double)((float)PotEvent.a(4885, 688.5) / (float)ModelMesh.field_Y.length));
        this.segments = new MeshBuilder[var2];
        if (param0 != 2) {
          return;
        }
        this.field_m = new ModelMesh[this.segments.length];
        this.segmentOffsets = new double[this.segments.length];
        for (var3 = 0; var3 < var2; var3++) {
          this.segments[var3] = new MeshBuilder(16, 16, 0);
          var4 = var3 + 1;
          var5 = (double)var3 * 456.0 / (double)var2;
          var7 = (double)var4 * 470.25 / (double)var2;
          var9 = (var7 + var5) / 2.0;
          var11 = (float)var3 * 3.0f / (float)var2 + ((float)var2 - (float)var3) * 1.0f / (float)var2;
          var12 = (float)var4 * 3.0f / (float)var2 + ((float)var2 - (float)var4) * 1.0f / (float)var2;
          for (var13 = 0; var13 < 8; var13++) {
            var14 = 1 + var13;
            var15 = this.segments[var3].addVertex(PotEvent.a(param0 ^ 4887, Math.cos((double)var13 * 3.141592653589793 * 2.0 / 8.0) * (double)var11), PotEvent.a(4885, (double)var11 * Math.sin(3.141592653589793 * (double)var13 * 2.0 / 8.0)), PotEvent.a(4885, var5 - var9));
            var16 = this.segments[var3].addVertex(PotEvent.a(param0 ^ 4887, Math.cos((double)var14 * 3.141592653589793 * 2.0 / 8.0) * (double)var11), PotEvent.a(4885, Math.sin(3.141592653589793 * (double)var14 * 2.0 / 8.0) * (double)var11), PotEvent.a(4885, var5 - var9));
            var17 = this.segments[var3].addVertex(PotEvent.a(4885, Math.cos((double)var13 * 3.141592653589793 * 2.0 / 8.0) * (double)var12 * 1.03125), PotEvent.a(param0 ^ 4887, Math.sin(2.0 * ((double)var13 * 3.141592653589793) / 8.0) * (double)var12 * 1.03125), PotEvent.a(4885, var7 - var9));
            var18 = this.segments[var3].addVertex(PotEvent.a(4885, Math.cos((double)var14 * 3.141592653589793 * 2.0 / 8.0) * (double)var12 * 1.03125), PotEvent.a(4885, Math.sin(2.0 * (3.141592653589793 * (double)var14) / 8.0) * (double)var12 * 1.03125), PotEvent.a(4885, var7 - var9));
            this.segments[var3].addFace(var15, var16, var17, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) 95, 10053171), (byte) 0);
            this.segments[var3].addFace(var18, var17, var16, (byte) 1, PackedColorSupport.rgbToPackedHsl((byte) -1, 10053171), (byte) 0);
          }
          this.segmentOffsets[var3] = var9;
          this.segments[var3].computeBounds();
        }
        this.field_d = new int[this.segmentOffsets.length][3];
    }

    final void drawSegments(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          for (var3_int = 0; var3_int < this.field_m.length; var3_int++) {
            this.field_l[0] = this.field_d[var3_int][0];
            this.field_l[1] = this.field_d[var3_int][1];
            this.field_l[2] = this.field_d[var3_int][2];
            this.field_m[var3_int].a(param1, this.field_l);
          }
          if (param0 != 32624) {
            this.segmentOffsets = (double[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        UiComponent stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        UiComponent stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        UiComponent stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        boolean stackIn_25_2 = false;
        UiComponent stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        QuickChatPhraseRegistry.a(-640 + SoftwareRasterizer.width >> 1, 0, SoftwareRasterizer.width + 640 >> 1, (byte) -88, SoftwareRasterizer.height);
        if (param1 <= 116) {
          return;
        }
        if (NodeHashTableIterator.field_a > 0) {
          if (null != KillerBallSkin.field_n) {
            KillerBallSkin.field_n.a(BufferedFile.field_a.localX, 0);
          }
          stackIn_9_0 = BufferedFile.field_a;
          stackIn_9_1 = -79;
          stackIn_10_2 = (param0) && (!LoginPayloadKind.field_d);
          ((UiComponent) (Object) stackIn_9_0).drawRoot((byte) stackIn_9_1, stackIn_10_2);
          stackIn_13_0 = IntegerRecordSubmission.field_n;
          stackIn_13_1 = -79;
          stackIn_14_2 = (param0) && (!LoginPayloadKind.field_d);
          ((UiComponent) (Object) stackIn_13_0).drawRoot((byte) stackIn_13_1, stackIn_14_2);
        }
        if (!(PoolMatchController.field_z <= 0) ||
          !(LogoMaterial.field_b <= 0)) {
          if (null != KillerBallSkin.field_n) {
            KillerBallSkin.field_n.a(SceneNode.field_k.localX, 0);
          }
          stackIn_24_0 = SceneNode.field_k;
          stackIn_24_1 = -79;
          stackIn_25_2 = (param0) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_24_0).drawRoot((byte) stackIn_24_1, stackIn_25_2);
          stackIn_28_0 = Bzip2DecoderState.field_f;
          stackIn_28_1 = -79;
          stackIn_29_2 = (param0) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_28_0).drawRoot((byte) stackIn_28_1, stackIn_29_2);
        }
        TriangleMesh.a(114);
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        playerXLostALife = null;
        timerHoursMinutesSeconds = null;
        playerYouFirstListAreOfferingDraw = null;
        back = null;
        youLostTwoLives = null;
        if (param0 > -60) {
          youLostTwoLives = (String) null;
        }
        field_h = null;
    }

    final static void a(int param0, QuickChatMenu param1) {
        if (param0 <= 106) {
          return;
        }
        if (param1 == null) {
          return;
        }
        try {
          LobbyPlayer.field_Ub = param1;
          ChoiceButtonSupport.field_a.children.clear((byte) 53);
          ChoiceButtonSupport.field_a.addChild(-112, LobbyPlayer.field_Ub);
          ArrayWidgetGroup.field_H = true;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jk.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void update(int param0, PoolMatchController param1) {
        try {
          this.positionSegments(param1, (byte) 95);
          this.bakeSegments((byte) 112);
          this.field_g = false;
          if (param0 != 0) {
            int[] var4 = (int[]) null;
            this.drawSegments(-44, (int[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jk.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void positionSegments(PoolMatchController param0, byte param1) {
        int var11 = 0;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var14 = Pool.field_O;
        try {
          var3_double = Math.sin((double)param0.cueAim.polarAngle * 3.141592653589793 / 1024.0);
          var5 = Math.cos(3.141592653589793 * (double)param0.cueAim.polarAngle / 1024.0);
          var7 = Math.sin((double)param0.cueAim.azimuth * 3.141592653589793 / 1024.0);
          var9 = Math.cos(3.141592653589793 * (double)param0.cueAim.azimuth / 1024.0);
          param0.gameModel.fillCueTransform(this.field_l, param0.cueAim.polarAngle, (byte) 49, param0.cueAim.azimuth, param0.cueAim.field_e, param0.cueAim.field_d);
          for (var11 = 0; var11 < this.segmentOffsets.length; var11++) {
            var12 = this.segmentOffsets[var11] + (double)param0.cuePullbackDistance;
            this.field_d[var11][0] = (this.field_l[0] >> 13) + PotEvent.a(4885, var9 * (var3_double * var12));
            this.field_d[var11][1] = (this.field_l[1] >> 13) + PotEvent.a(4885, var12 * var3_double * var7);
            this.field_d[var11][2] = (this.field_l[2] >> 13) + PotEvent.a(4885, var12 * var5);
          }
          if (param1 < 11) {
            this.bakeSegments((byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jk.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void bakeSegments(byte param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        for (var2 = 0; this.segments.length > var2; var2++) {
          this.field_m[var2] = (ModelMesh) (LobbyGame.field_gc.createModelMeshWithBallTransform(this.field_l, this.segments[var2], -72));
        }
        if (param0 <= 84) {
          this.field_l = (int[]) null;
        }
    }

    public CueStick() {
        this.field_g = true;
        this.field_l = new int[12];
    }

    static {
        timerHoursMinutesSeconds = "hh:mm:ss";
        playerYouFirstListAreOfferingDraw = "You<%0> all want to draw.";
        youLostTwoLives = "You lost 2 lives!";
        field_i = new QuickChatDynamicCommand(7, 0, 1, 1);
        back = "Back";
        playerXLostALife = "<%0> lost 1 life!";
    }
}
