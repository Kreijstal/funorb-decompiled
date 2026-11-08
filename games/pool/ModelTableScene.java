/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModelTableScene extends TableScene {
    static String optionsmenuNotpaused;
    static String presstabtochat;
    static int field_K;
    int[][] field_M;
    static String pottingBallForYou;
    static int field_L;
    MeshBuilder[] field_O;

    final int a(int param0, MeshBuilder[][] param1, int[][][] param2, int param3, int param4) {
        int var6_int = 0;
        int var9 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          var7 = 0;
          for (var6_int = param0; param4 > var6_int; var6_int++) {
            var8 = -param0 + var6_int;
            param1[var8] = Atan2Support.a(91, this.field_O[var6_int]);
            var7 = var7 + param1[var8].length;
            param2[var8] = new int[param1[var8].length][3];
            for (var9 = 0; param1[var8].length > var9; var9++) {
              ModelOriginSupport.recenterModel(param2[var8][var9], 0, param1[var8][var9]);
              MarkerSliderPainter.a(param1[var8][var9], (byte) -37);
            }
          }
          if (param3 > -49) {
            this.field_M = (int[][]) null;
          }
          stackIn_10_0 = var7;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("vc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void e(boolean param0) {
        int var2;
        int var3;
        java.awt.Canvas var4;
        int var5;
        var3 = Pool.field_O;
        if (this.field_h) {
          for (var2 = 0; AccountProtocolStage.field_g.length > var2; var2++) {
            TimeTrialSelectScreen.field_L[var2] = ChatInputSupport.field_l[AccountProtocolStage.field_g[var2]].b(-13025, GzipDecoder.field_d);
            OpacityWidget.field_Q[var2] = ChatInputSupport.field_l[var2].a(param0, GzipDecoder.field_d);
          }
        } else {
          var5 = 0;
          var2 = var5;
          while (AccountProtocolStage.field_g.length > var5) {
            TimeTrialSelectScreen.field_L[var5] = ChatInputSupport.field_l[AccountProtocolStage.field_g[var5]].viewDepth(GzipDecoder.field_d, -31);
            OpacityWidget.field_Q[var5] = ChatInputSupport.field_l[var5].a(true, GzipDecoder.field_d);
            var5++;
          }
        }
        if (!param0) {
          var4 = (java.awt.Canvas) null;
          ModelTableScene.a(true, (java.awt.Canvas) null);
        }
    }

    final void d(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = Pool.field_O;
        int var2Lifetime1;
        if (ChatInputSupport.field_l != null) {
          AccountProtocolStage.field_g = new int[ChatInputSupport.field_l.length];
          TimeTrialSelectScreen.field_L = new int[ChatInputSupport.field_l.length];
          OpacityWidget.field_Q = new boolean[ChatInputSupport.field_l.length];
          for (var2 = 0; var2 < AccountProtocolStage.field_g.length; var2++) {
            AccountProtocolStage.field_g[var2] = var2;
          }
          var4 = 0;
          var2Lifetime1 = var4;
          while (var4 < ChatInputSupport.field_l.length) {
            ChatInputSupport.field_l[var4].a(288, 576, param0 ^ -113);
            var4++;
          }
        }
        if (param0 != 16) {
          this.field_M = (int[][]) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, ModelInstance[] param6) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var8 = null;
        int[] var14 = null;
        int[] var12 = null;
        int[] var10 = null;
        int[] var8Lifetime1;
        try {
          var13 = TransformSupport.identityTransform(-31121);
          var11 = var13;
          var9 = var11;
          var8 = var9;
          var9[param0] = param4 + this.field_M[param5][0];
          var9[1] = param2 + this.field_M[param5][1];
          var9[2] = param3 + this.field_M[param5][2];
          param6[param1 - 0] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var13, this.field_O[param5], -97)), var13);
          var14 = TransformRotationSupport.rotateTransformHalfTurnZ((byte) 78, LobbyPanelLayoutSupport.copyTransform((byte) 69, var13));
          var12 = var14;
          var10 = var12;
          var8Lifetime1 = var10;
          param6[1 + param1] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var14, this.field_O[param5], -82)), var14);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void initializeScene(boolean param0);

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
          if (PlasmaTableScene.field_ab == 11) {
            LoginPayloadFactory.validateLoginFactoryGuard(-125);
          }
          Cp1252DecodingSupport.showLoadingProgress(TextWidgetPainter.field_n, param0, PasswordValidator.field_o, CacheEntry.field_w);
          if (!param0) {
            optionsmenuNotpaused = (String) null;
          }
          ButtonWidget.drawRasterToCanvas(0, 0, (byte) -118, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ModelInstance[] param0, int param1, int param2, boolean param3, MeshBuilder param4, int param5, int[] param6, int param7) {
        MeshBuilder var10 = null;
        int[] var15 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var16 = null;
        int[] var12 = null;
        int[] var17 = null;
        int[] var13 = null;
        int[] var18 = null;
        int[] var14 = null;
        int[] var9Lifetime1;
        int[] var9Lifetime2;
        int[] var9Lifetime3;
        try {
          var10 = Cp1252DecodingSupport.mirrorVertically(!param3 ? true : false, new MeshBuilder(param4, false, param3, false, false));
          var15 = TransformSupport.identityTransform(-31121);
          var11 = var15;
          var9 = var11;
          var9[2] = param6[2] + param1;
          var9[1] = param2 + param6[1];
          var9[0] = param6[0] + param7;
          param0[0 + param5] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var15, param4, -115)), var15);
          var16 = TransformSupport.identityTransform(-31121);
          var12 = var16;
          var9Lifetime1 = var12;
          var9Lifetime1[2] = param6[2] + param1;
          var9Lifetime1[1] = -param6[1] - param2;
          var9Lifetime1[0] = param6[0] + param7;
          param0[param5 + 1] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var16, var10, -56)), var16);
          var17 = TransformSupport.identityTransform(-31121);
          var13 = var17;
          var9Lifetime2 = var13;
          var9Lifetime2[1] = param2 + param6[1];
          var9Lifetime2[2] = param6[2] + param1;
          var9Lifetime2[0] = param7 + param6[0];
          TransformRotationSupport.rotateTransformHalfTurnZ((byte) 114, var17);
          param0[param5 + 2] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var17, param4, -85)), var17);
          var18 = TransformSupport.identityTransform(-31121);
          var14 = var18;
          var9Lifetime3 = var14;
          var9Lifetime3[2] = param1 + param6[2];
          var9Lifetime3[0] = param6[0] + param7;
          var9Lifetime3[1] = -param2 - param6[1];
          TransformRotationSupport.rotateTransformHalfTurnZ((byte) -116, var18);
          param0[param5 + 3] = new ModelInstance((ModelMesh) (this.createModelMeshWithBallTransform(var18, var10, -76)), var18);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = TimeTrialSelectScreen.field_K.getGraphics();
            if (ProjectedLineSupport.field_c == null) {
              ProjectedLineSupport.field_c = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param0) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, LoginMethod.field_d, ArchiveIndex.field_c);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (PacketAvailabilitySupport.field_c == null) {
                PacketAvailabilitySupport.field_c = TimeTrialSelectScreen.field_K.createImage(304, 34);
              }
              var10 = PacketAvailabilitySupport.field_c.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param4 * 3, param1);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param4 * 3 + 2, 2, -(3 * param4) + 300, 30);
              var10.setFont(ProjectedLineSupport.field_c);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (304 - param2.length() * 6) / 2, 22);
              var9.drawImage(PacketAvailabilitySupport.field_c, LoginMethod.field_d / 2 - 152, ArchiveIndex.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = LoginMethod.field_d / 2 - 152;
              var8 = ArchiveIndex.field_c / 2 - 18;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, var8 + 2, 3 * param4, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, 1 + var8, 301, 31);
              var9.fillRect(param4 * 3 + (var7 + 2), 2 + var8, 300 - 3 * param4, 30);
              var9.setFont(ProjectedLineSupport.field_c);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, (-(6 * param2.length()) + 304) / 2 + var7, 22 + var8);
            }
            if (null != ImageProducerRasterBuffer.field_o) {
              var9.setFont(ProjectedLineSupport.field_c);
              var9.setColor(java.awt.Color.white);
              var9.drawString(ImageProducerRasterBuffer.field_o, LoginMethod.field_d / 2 - ImageProducerRasterBuffer.field_o.length() * 6 / 2, ArchiveIndex.field_c / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            TimeTrialSelectScreen.field_K.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 95) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          ModelTableScene.a(false, (java.awt.Canvas) null);
        }
        presstabtochat = null;
        pottingBallForYou = null;
        optionsmenuNotpaused = null;
    }

    ModelTableScene() {
    }

    void buildTableGeometry(PoolGameModel param0, int param1) {
        try {
          super.buildTableGeometry(param0, param1 ^ 0);
          this.initializeScene(true);
          this.d(16);
          if (param1 != 21894) {
            int[] var4 = (int[]) null;
            this.a((ModelInstance[]) null, 81, -71, false, (MeshBuilder) null, -4, (int[]) null, -24);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        presstabtochat = "Press TAB to chat or F10 to open Quick Chat.";
        optionsmenuNotpaused = "Options Menu";
        field_L = 100;
        pottingBallForYou = "Potting a ball for you: you are now <%0>";
    }
}
