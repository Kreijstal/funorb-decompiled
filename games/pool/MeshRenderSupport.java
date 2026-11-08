/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshRenderSupport {
    static double field_b;
    static int field_a;

    final static boolean isIntroComplete(int obfuscationGuard) {
        RuntimeException var1 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 72) {
            MeshRenderSupport.splitMeshAcrossPlane(-96, 16, 11, false, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -65, (int[]) null, (int[]) null, -114, 112, (int[]) null, (byte[]) null, (int[]) null, (int[]) null, 52, (int[]) null, -56, (int[]) null, (MeshBuilder) null, 52, (int[]) null);
          }
          stackIn_7_0 = !(LobbyPlayer.field_fc <= 250);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "u.C(" + obfuscationGuard + ')');
        }
    }

    final static void splitMeshAcrossPlane(int param0, int param1, int param2, boolean param3, int[] param4, int[] param5, int[] param6, int[] param7, int param8, int[] param9, int[] param10, int param11, int param12, int[] param13, byte[] param14, int[] param15, int[] param16, int param17, int[] param18, int param19, int[] param20, MeshBuilder param21, int param22, int[] param23) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        byte[] fieldTemp$24 = null;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        short dupTemp$31 = 0;
        short dupTemp$32 = 0;
        short dupTemp$33 = 0;
        short[] fieldTemp$34 = null;
        short[] fieldTemp$35 = null;
        byte[] fieldTemp$36 = null;
        byte[] fieldTemp$37 = null;
        byte[] fieldTemp$38 = null;
        byte[] fieldTemp$39 = null;
        byte[] fieldTemp$40 = null;
        short[] fieldTemp$41 = null;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int stackIn_101_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_358_2 = null;
        StringBuilder stackIn_361_1 = null;
        String stackIn_362_2 = null;
        StringBuilder stackIn_365_1 = null;
        String stackIn_366_2 = null;
        StringBuilder stackIn_369_1 = null;
        String stackIn_370_2 = null;
        StringBuilder stackIn_373_1 = null;
        String stackIn_374_2 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_378_2 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_382_2 = null;
        StringBuilder stackIn_385_1 = null;
        String stackIn_386_2 = null;
        StringBuilder stackIn_389_1 = null;
        String stackIn_390_2 = null;
        StringBuilder stackIn_393_1 = null;
        String stackIn_394_2 = null;
        StringBuilder stackIn_397_1 = null;
        String stackIn_398_2 = null;
        StringBuilder stackIn_401_1 = null;
        String stackIn_402_2 = null;
        StringBuilder stackIn_405_1 = null;
        String stackIn_406_2 = null;
        StringBuilder stackIn_409_1 = null;
        String stackIn_410_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var24_int = 0;
        int[] var24 = null;
        RuntimeException var24_ref = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int[] var54Lifetime1;
        int[] var54Lifetime2;
        int[] var54Lifetime3;
        int[] var54Lifetime4;
        int[] var54Lifetime5;
        int[] var54Lifetime1Lifetime1;
        int[] var54Lifetime1Lifetime2;
        int[] var54Lifetime2Lifetime1;
        int[] var54Lifetime2Lifetime2;
        int[] var54Lifetime2Lifetime3;
        int[] var54Lifetime3Lifetime1;
        int[] var54Lifetime3Lifetime2;
        int[] var54Lifetime3Lifetime3;
        int var33Lifetime1;
        int var33Lifetime2;
        int var33Lifetime3;
        int var34Lifetime1;
        int var38Lifetime1;
        int var59Lifetime1;
        int var59Lifetime2;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var61Lifetime2;
        int var62Lifetime1;
        int var62Lifetime2;
        int var63Lifetime1;
        int var63Lifetime2;
        int var24_intLifetime1;
        int var33Lifetime3Lifetime1;
        int var34Lifetime1Lifetime1;
        int var38Lifetime1Lifetime1;
        var65 = Pool.field_O;
        try {
          if (QuickChatPhraseRegistry.field_j == null ||
            !(QuickChatPhraseRegistry.field_j.length >= param22)) {
            var24_int = 100 + param22;
            MultiHandleSliderWidget.field_T = new int[var24_int];
            QuickChatPhraseRegistry.field_j = new int[var24_int];
          }
          if (null == ViewportController.field_n ||
            !(param12 * 2 <= ViewportController.field_n.length)) {
            var24_intLifetime1 = 100 + param12 * 2;
            ArchiveRequest.field_B = new int[var24_intLifetime1];
            ViewportController.field_n = new int[var24_intLifetime1];
          }
          var24 = QuickChatPhraseRegistry.field_j;
          if (ClientInputResetSupport.field_d == null) {
            ClientInputResetSupport.field_d = new int[16];
          }
          var25 = MultiHandleSliderWidget.field_T;
          var26 = ClientInputResetSupport.field_d;
          if (!param3) {
            MeshRenderSupport.createArrowButton((byte) 100, -4, 66, true, 88);
          }
          var27 = ViewportController.field_n;
          TranslatedUiText.field_a = 0;
          PoolMatchController.field_W = 0;
          DebugTuningSupport.field_a = 0;
          var28 = ArchiveRequest.field_B;
          DateInputWidget.field_R = 0;
          if (QuickChatMenu.field_Yb == null ||
            !(QuickChatMenu.field_Yb.length >= param22)) {
            CollisionContact.field_r = new int[100 + param22];
            QuickChatMenu.field_Yb = new int[param22 + 100];
            ProjectedVertex.field_d = new int[100 + param22];
          }
          if (null == DirectByteStorage.field_k ||
            !(param12 <= DirectByteStorage.field_k.length)) {
            AccountWelcomePanel.field_P = new int[100 + param12];
            DirectByteStorage.field_k = new int[100 + param12];
            ReflectionRequestSupport.field_h = new int[param12 + 100];
          }
          if (param5 != null && (null == AchievementProtocolSupport.field_e ||
            !(AchievementProtocolSupport.field_e.length >= param12))) {
            AchievementProtocolSupport.field_e = new int[param12 + 100];
            ChatReplacementSupport.field_d = new int[param12 + 100];
            ByteArrayNode.field_o = new int[100 + param12];
          }
          if (null == HighScoreRequest.field_w ||
            !(HighScoreRequest.field_w.length >= param22)) {
            TransformSupport.field_a = new int[param22 + 100];
            CollisionContact.field_w = new int[param22 + 100];
            HighScoreRequest.field_w = new int[param22 + 100];
          }
          if (ReflectionReplySupport.field_d == null ||
            !(ReflectionReplySupport.field_d.length >= param12)) {
            TranslatedUiText.field_b = new int[100 + param12];
            ReflectionReplySupport.field_d = new int[param12 + 100];
            LobbyPanelLayoutSupport.field_b = new int[param12 + 100];
          }
          if (param5 != null && (ChatPanelSupport.field_d == null ||
            !(ChatPanelSupport.field_d.length >= param12))) {
            TextInputWidget.field_V = new int[param12 + 100];
            ChatPanelSupport.field_d = new int[100 + param12];
            ArchiveLoadSequence.field_b = new int[param12 + 100];
          }
          var29 = 0;
          var30 = 0;
          var31 = 0;
          var33 = 0;
          while (param22 > var33) {
            var24[var33] = -1;
            var33++;
            if (var65 == 0) {
              continue;
            }
            break;
          }
          var32 = 0;
          var33Lifetime1 = 0;
          while (var33Lifetime1 < param22) {
            var25[var33Lifetime1] = -1;
            var33Lifetime1++;
            if (var65 == 0) {
              continue;
            }
            break;
          }
          var35 = 0;
          var36 = 0;
          var37 = 0;
          var38 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var38 >= param12))) {
            var39 = param7[var38];
            var40 = param18[var38];
            var41 = param15[var38];
            var42 = param6[var39];
            var43 = param13[var39];
            var44 = param10[var39];
            var45 = param6[var40];
            var46 = param13[var40];
            var47 = param10[var40];
            var48 = param6[var41];
            var49 = param13[var41];
            var50 = param10[var41];
            var51 = (var44 - param1) * param17 + (param8 * (-param0 + var43) + (var42 - param11) * param2);
            var52 = param2 * (-param11 + var45) + ((-param0 + var46) * param8 + param17 * (-param1 + var47));
            var53 = (-param1 + var50) * param17 + (-param0 + var49) * param8 + param2 * (var48 - param11);
            stackIn_266_0 = ~(var53 | (var51 | var52));
            stackIn_266_1 = -1;
            if (var65 == 0) {
              if (stackIn_266_0 > stackIn_266_1) {
                if ((-var53 | (-var52 | -var51)) < 0) {
                  if (4 + var29 + param22 > QuickChatMenu.field_Yb.length) {
                    var54 = new int[var29 + (param22 + 104)];
                    ArrayOperations.copy(QuickChatMenu.field_Yb, 0, var54, 0, TranslatedUiText.field_a);
                    QuickChatMenu.field_Yb = var54;
                    var54Lifetime4 = new int[104 + param22 + var29];
                    ArrayOperations.copy(CollisionContact.field_r, 0, var54Lifetime4, 0, TranslatedUiText.field_a);
                    CollisionContact.field_r = var54Lifetime4;
                    var54Lifetime5 = new int[param22 - (-var29 - 104)];
                    ArrayOperations.copy(ProjectedVertex.field_d, 0, var54Lifetime5, 0, TranslatedUiText.field_a);
                    ProjectedVertex.field_d = var54Lifetime5;
                  }
                  if ((4 + (var31 + param22)) > HighScoreRequest.field_w.length) {
                    var54Lifetime1 = new int[104 + (var31 + param22)];
                    ArrayOperations.copy(HighScoreRequest.field_w, 0, var54Lifetime1, 0, DebugTuningSupport.field_a);
                    HighScoreRequest.field_w = var54Lifetime1;
                    var54Lifetime1Lifetime1 = new int[var31 + (param22 + 104)];
                    ArrayOperations.copy(TransformSupport.field_a, 0, var54Lifetime1Lifetime1, 0, DebugTuningSupport.field_a);
                    TransformSupport.field_a = var54Lifetime1Lifetime1;
                    var54Lifetime1Lifetime2 = new int[var31 + param22 + 104];
                    ArrayOperations.copy(CollisionContact.field_w, 0, var54Lifetime1Lifetime2, 0, DebugTuningSupport.field_a);
                    CollisionContact.field_w = var54Lifetime1Lifetime2;
                  }
                  var55 = TranslatedUiText.field_a;
                  var56 = DebugTuningSupport.field_a;
                  var57 = 0;
                  var58 = 0;
                  if (null == param14) {
                    if (null != param20) {
                      if (param20[var38] != -1 &&
                        param20[var38] != -2) {
                        stackIn_101_0 = 1;
                      } else {
                        stackIn_101_0 = 0;
                      }
                      var64 = stackIn_101_0;
                    } else {
                      var64 = 1;
                    }
                  } else {
                    stackIn_109_0 = ((1 & param14[var38]) != 0) ? 0 : 1;
                    var64 = stackIn_109_0;
                  }
                  if (null != param5) {
                    if (var64 != 0) {
                      var37 = 65535 & param20[var38];
                      var36 = param23[var38] & 65535;
                      var35 = 65535 & param5[var38];
                    } else {
                      var37 = param20[var38];
                      var35 = param5[var38];
                      var36 = param23[var38];
                    }
                  }
                  if (var51 >= 0) {
                    var34 = var24[var39];
                    if (var34 < 0) {
                      incrementValue$0 = var55;
                      var55++;
                      var34 = incrementValue$0;
                      var24[var39] = incrementValue$0;
                      QuickChatMenu.field_Yb[var34] = var42;
                      CollisionContact.field_r[var34] = var43;
                      ProjectedVertex.field_d[var34] = var44;
                    }
                    var26[var57 + 0] = var34;
                    var26[var57 + 8] = var35;
                    var57++;
                  }
                  if (var51 <= 0) {
                    var34 = var25[var39];
                    if (var34 < 0) {
                      incrementValue$1 = var56;
                      var56++;
                      var34 = incrementValue$1;
                      var25[var39] = incrementValue$1;
                      HighScoreRequest.field_w[var34] = var42;
                      TransformSupport.field_a[var34] = var43;
                      CollisionContact.field_w[var34] = var44;
                    }
                    var26[4 + var58] = var34;
                    var26[12 + var58] = var35;
                    var58++;
                  }
                  if (var51 != 0 &&
                    var52 != 0 &&
                    0 > (var52 ^ var51)) {
                    var63 = -var51 + var52;
                    var59 = (-(var51 * var45) + var52 * var42) / var63;
                    var60 = (-(var51 * var46) + var52 * var43) / var63;
                    incrementValue$2 = var55;
                    var55++;
                    var34 = incrementValue$2;
                    var61 = (-(var47 * var51) + var44 * var52) / var63;
                    var62 = (-(var51 * var36) + var52 * var35) / var63;
                    QuickChatMenu.field_Yb[var34] = var59;
                    CollisionContact.field_r[var34] = var60;
                    ProjectedVertex.field_d[var34] = var61;
                    var26[var57 + 0] = var34;
                    var26[var57 + 8] = var62;
                    var57++;
                    incrementValue$3 = var56;
                    var56++;
                    var34 = incrementValue$3;
                    HighScoreRequest.field_w[var34] = var59;
                    TransformSupport.field_a[var34] = var60;
                    CollisionContact.field_w[var34] = var61;
                    var26[4 + var58] = var34;
                    var26[12 + var58] = var62;
                    var58++;
                  }
                  if (var52 >= 0) {
                    var34 = var24[var40];
                    if (var34 < 0) {
                      incrementValue$4 = var55;
                      var55++;
                      var34 = incrementValue$4;
                      var24[var40] = incrementValue$4;
                      QuickChatMenu.field_Yb[var34] = var45;
                      CollisionContact.field_r[var34] = var46;
                      ProjectedVertex.field_d[var34] = var47;
                    }
                    var26[var57 + 0] = var34;
                    var26[8 + var57] = var36;
                    var57++;
                  }
                  if (var52 <= 0) {
                    var34 = var25[var40];
                    if (var34 < 0) {
                      incrementValue$5 = var56;
                      var56++;
                      var34 = incrementValue$5;
                      var25[var40] = incrementValue$5;
                      HighScoreRequest.field_w[var34] = var45;
                      TransformSupport.field_a[var34] = var46;
                      CollisionContact.field_w[var34] = var47;
                    }
                    var26[4 + var58] = var34;
                    var26[var58 + 12] = var36;
                    var58++;
                  }
                  if (var52 != 0 &&
                    var53 != 0 &&
                    (var53 ^ var52) < 0) {
                    var63Lifetime1 = -var52 + var53;
                    var61Lifetime1 = (-(var52 * var50) + var53 * var47) / var63Lifetime1;
                    var60Lifetime1 = (-(var49 * var52) + var53 * var46) / var63Lifetime1;
                    incrementValue$6 = var55;
                    var55++;
                    var34 = incrementValue$6;
                    var62Lifetime1 = (var53 * var36 - var52 * var37) / var63Lifetime1;
                    var59Lifetime1 = (var53 * var45 - var48 * var52) / var63Lifetime1;
                    QuickChatMenu.field_Yb[var34] = var59Lifetime1;
                    CollisionContact.field_r[var34] = var60Lifetime1;
                    ProjectedVertex.field_d[var34] = var61Lifetime1;
                    var26[0 + var57] = var34;
                    var26[var57 + 8] = var62Lifetime1;
                    incrementValue$7 = var56;
                    var56++;
                    var34 = incrementValue$7;
                    var57++;
                    HighScoreRequest.field_w[var34] = var59Lifetime1;
                    TransformSupport.field_a[var34] = var60Lifetime1;
                    CollisionContact.field_w[var34] = var61Lifetime1;
                    var26[4 + var58] = var34;
                    var26[var58 + 12] = var62Lifetime1;
                    var58++;
                  }
                  if (0 <= var53) {
                    var34 = var24[var41];
                    if (0 > var34) {
                      incrementValue$8 = var55;
                      var55++;
                      var34 = incrementValue$8;
                      var24[var41] = incrementValue$8;
                      QuickChatMenu.field_Yb[var34] = var48;
                      CollisionContact.field_r[var34] = var49;
                      ProjectedVertex.field_d[var34] = var50;
                    }
                    var26[var57 + 0] = var34;
                    var26[8 + var57] = var37;
                    var57++;
                  }
                  if (var53 <= 0) {
                    var34 = var25[var41];
                    if (0 > var34) {
                      incrementValue$9 = var56;
                      var56++;
                      var34 = incrementValue$9;
                      var25[var41] = incrementValue$9;
                      HighScoreRequest.field_w[var34] = var48;
                      TransformSupport.field_a[var34] = var49;
                      CollisionContact.field_w[var34] = var50;
                    }
                    var26[4 + var58] = var34;
                    var26[12 + var58] = var37;
                    var58++;
                  }
                  if ((var51 | var53) != 0 &&
                    (var53 ^ var51) < 0) {
                    var63Lifetime2 = var51 - var53;
                    var59Lifetime2 = (-(var42 * var53) + var48 * var51) / var63Lifetime2;
                    var61Lifetime2 = (-(var44 * var53) + var50 * var51) / var63Lifetime2;
                    incrementValue$10 = var55;
                    var55++;
                    var34 = incrementValue$10;
                    var62Lifetime2 = (var37 * var51 - var53 * var35) / var63Lifetime2;
                    var60Lifetime2 = (-(var53 * var43) + var51 * var49) / var63Lifetime2;
                    QuickChatMenu.field_Yb[var34] = var59Lifetime2;
                    CollisionContact.field_r[var34] = var60Lifetime2;
                    ProjectedVertex.field_d[var34] = var61Lifetime2;
                    var26[0 + var57] = var34;
                    var26[8 + var57] = var62Lifetime2;
                    var57++;
                    incrementValue$11 = var56;
                    var56++;
                    var34 = incrementValue$11;
                    HighScoreRequest.field_w[var34] = var59Lifetime2;
                    TransformSupport.field_a[var34] = var60Lifetime2;
                    CollisionContact.field_w[var34] = var61Lifetime2;
                    var26[4 + var58] = var34;
                    var26[var58 + 12] = var62Lifetime2;
                    var58++;
                  }
                  var29 = var29 + (var55 - TranslatedUiText.field_a);
                  var33Lifetime2 = PoolMatchController.field_W;
                  TranslatedUiText.field_a = var55;
                  if (DirectByteStorage.field_k.length < (-2 + (var30 + param12 + var57))) {
                    var54Lifetime2 = new int[98 + param12 - (-var30 - var57)];
                    ArrayOperations.copy(DirectByteStorage.field_k, 0, var54Lifetime2, 0, var33Lifetime2);
                    DirectByteStorage.field_k = var54Lifetime2;
                    var54Lifetime2Lifetime1 = new int[var57 + (var30 + param12 + 98)];
                    ArrayOperations.copy(ReflectionRequestSupport.field_h, 0, var54Lifetime2Lifetime1, 0, var33Lifetime2);
                    ReflectionRequestSupport.field_h = var54Lifetime2Lifetime1;
                    var54Lifetime2Lifetime2 = new int[98 + (var30 + param12) + var57];
                    ArrayOperations.copy(AccountWelcomePanel.field_P, 0, var54Lifetime2Lifetime2, 0, var33Lifetime2);
                    AccountWelcomePanel.field_P = var54Lifetime2Lifetime2;
                    if (null != param5) {
                      var54Lifetime2Lifetime3 = new int[param12 + var30 + var57 + 98];
                      ArrayOperations.copy(AchievementProtocolSupport.field_e, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      AchievementProtocolSupport.field_e = var54Lifetime2Lifetime3;
                      var54Lifetime2Lifetime3 = new int[var57 + (var30 + param12 + 98)];
                      ArrayOperations.copy(ByteArrayNode.field_o, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      ByteArrayNode.field_o = var54Lifetime2Lifetime3;
                      var54Lifetime2Lifetime3 = new int[var57 + (var30 + param12) + 98];
                      ArrayOperations.copy(ChatReplacementSupport.field_d, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      ChatReplacementSupport.field_d = var54Lifetime2Lifetime3;
                    }
                  }
                  DirectByteStorage.field_k[var33Lifetime2] = var26[0];
                  ReflectionRequestSupport.field_h[var33Lifetime2] = var26[1];
                  AccountWelcomePanel.field_P[var33Lifetime2] = var26[2];
                  if (null != param5) {
                    if (var64 != 0) {
                      AchievementProtocolSupport.field_e[var33Lifetime2] = var26[8];
                      ByteArrayNode.field_o[var33Lifetime2] = var26[9];
                      ChatReplacementSupport.field_d[var33Lifetime2] = var26[10];
                    } else {
                      AchievementProtocolSupport.field_e[var33Lifetime2] = var35;
                      ChatReplacementSupport.field_d[var33Lifetime2] = var37;
                    }
                  }
                  var27[var33Lifetime2++] = var38;
                  if (4 == var57) {
                    DirectByteStorage.field_k[var33Lifetime2] = var26[2];
                    ReflectionRequestSupport.field_h[var33Lifetime2] = var26[3];
                    AccountWelcomePanel.field_P[var33Lifetime2] = var26[0];
                    if (null != param5) {
                      if (var64 == 0) {
                        AchievementProtocolSupport.field_e[var33Lifetime2] = var35;
                        ChatReplacementSupport.field_d[var33Lifetime2] = var37;
                      } else {
                        AchievementProtocolSupport.field_e[var33Lifetime2] = var26[10];
                        ByteArrayNode.field_o[var33Lifetime2] = var26[11];
                        ChatReplacementSupport.field_d[var33Lifetime2] = var26[8];
                      }
                    }
                    var27[var33Lifetime2++] = var38;
                    var30++;
                  }
                  var31 = var31 + (var56 - DebugTuningSupport.field_a);
                  PoolMatchController.field_W = var33Lifetime2;
                  DebugTuningSupport.field_a = var56;
                  var33Lifetime2 = DateInputWidget.field_R;
                  if (ReflectionReplySupport.field_d.length < (-2 + var58 + param12 + var32)) {
                    var54Lifetime3 = new int[param12 + (var32 + var58 + 98)];
                    ArrayOperations.copy(ReflectionReplySupport.field_d, 0, var54Lifetime3, 0, var33Lifetime2);
                    ReflectionReplySupport.field_d = var54Lifetime3;
                    var54Lifetime3Lifetime1 = new int[98 + (var58 + var32) + param12];
                    ArrayOperations.copy(LobbyPanelLayoutSupport.field_b, 0, var54Lifetime3Lifetime1, 0, var33Lifetime2);
                    LobbyPanelLayoutSupport.field_b = var54Lifetime3Lifetime1;
                    var54Lifetime3Lifetime2 = new int[98 + (var58 + (var32 + param12))];
                    ArrayOperations.copy(TranslatedUiText.field_b, 0, var54Lifetime3Lifetime2, 0, var33Lifetime2);
                    TranslatedUiText.field_b = var54Lifetime3Lifetime2;
                    if (param5 != null) {
                      var54Lifetime3Lifetime3 = new int[98 + (var32 + param12) + var58];
                      ArrayOperations.copy(ChatPanelSupport.field_d, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      ChatPanelSupport.field_d = var54Lifetime3Lifetime3;
                      var54Lifetime3Lifetime3 = new int[98 + var58 + (var32 + param12)];
                      ArrayOperations.copy(TextInputWidget.field_V, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      TextInputWidget.field_V = var54Lifetime3Lifetime3;
                      var54Lifetime3Lifetime3 = new int[98 + var58 + (var32 + param12)];
                      ArrayOperations.copy(ArchiveLoadSequence.field_b, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      ArchiveLoadSequence.field_b = var54Lifetime3Lifetime3;
                    }
                  }
                  ReflectionReplySupport.field_d[var33Lifetime2] = var26[4];
                  LobbyPanelLayoutSupport.field_b[var33Lifetime2] = var26[5];
                  TranslatedUiText.field_b[var33Lifetime2] = var26[6];
                  if (null != param5) {
                    if (var64 != 0) {
                      ChatPanelSupport.field_d[var33Lifetime2] = var26[12];
                      TextInputWidget.field_V[var33Lifetime2] = var26[13];
                      ArchiveLoadSequence.field_b[var33Lifetime2] = var26[14];
                    } else {
                      ChatPanelSupport.field_d[var33Lifetime2] = var35;
                      ArchiveLoadSequence.field_b[var33Lifetime2] = var37;
                    }
                  }
                  var28[var33Lifetime2++] = var38;
                  if (var58 == 4) {
                    ReflectionReplySupport.field_d[var33Lifetime2] = var26[6];
                    LobbyPanelLayoutSupport.field_b[var33Lifetime2] = var26[7];
                    TranslatedUiText.field_b[var33Lifetime2] = var26[4];
                    if (param5 != null) {
                      if (var64 == 0) {
                        ChatPanelSupport.field_d[var33Lifetime2] = var35;
                        ArchiveLoadSequence.field_b[var33Lifetime2] = var37;
                      } else {
                        ChatPanelSupport.field_d[var33Lifetime2] = var26[14];
                        TextInputWidget.field_V[var33Lifetime2] = var26[15];
                        ArchiveLoadSequence.field_b[var33Lifetime2] = var26[12];
                      }
                    }
                    var28[var33Lifetime2++] = var38;
                    var32++;
                  }
                  DateInputWidget.field_R = var33Lifetime2;
                } else {
                  fieldTemp$16 = DateInputWidget.field_R;
                  DateInputWidget.field_R = DateInputWidget.field_R + 1;
                  var33Lifetime2 = fieldTemp$16;
                  var34 = var25[var39];
                  if (var34 < 0) {
                    fieldTemp$17 = DebugTuningSupport.field_a;
                    DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                    var34 = fieldTemp$17;
                    var25[var39] = fieldTemp$17;
                    HighScoreRequest.field_w[var34] = var42;
                    TransformSupport.field_a[var34] = var43;
                    CollisionContact.field_w[var34] = var44;
                  }
                  ReflectionReplySupport.field_d[var33Lifetime2] = var34;
                  var34 = var25[var40];
                  if (var34 < 0) {
                    fieldTemp$18 = DebugTuningSupport.field_a;
                    DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                    var34 = fieldTemp$18;
                    var25[var40] = fieldTemp$18;
                    HighScoreRequest.field_w[var34] = var45;
                    TransformSupport.field_a[var34] = var46;
                    CollisionContact.field_w[var34] = var47;
                  }
                  LobbyPanelLayoutSupport.field_b[var33Lifetime2] = var34;
                  var34 = var25[var41];
                  if (0 > var34) {
                    fieldTemp$19 = DebugTuningSupport.field_a;
                    DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                    var34 = fieldTemp$19;
                    var25[var41] = fieldTemp$19;
                    HighScoreRequest.field_w[var34] = var48;
                    TransformSupport.field_a[var34] = var49;
                    CollisionContact.field_w[var34] = var50;
                  }
                  TranslatedUiText.field_b[var33Lifetime2] = var34;
                  if (null != param5) {
                    ChatPanelSupport.field_d[var33Lifetime2] = param5[var38];
                    TextInputWidget.field_V[var33Lifetime2] = param23[var38];
                    ArchiveLoadSequence.field_b[var33Lifetime2] = param20[var38];
                  }
                  var28[var33Lifetime2] = var38;
                }
              } else {
                fieldTemp$20 = PoolMatchController.field_W;
                PoolMatchController.field_W = PoolMatchController.field_W + 1;
                var33Lifetime2 = fieldTemp$20;
                var34 = var24[var39];
                if (var34 < 0) {
                  fieldTemp$21 = TranslatedUiText.field_a;
                  TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                  var34 = fieldTemp$21;
                  var24[var39] = fieldTemp$21;
                  QuickChatMenu.field_Yb[var34] = var42;
                  CollisionContact.field_r[var34] = var43;
                  ProjectedVertex.field_d[var34] = var44;
                }
                DirectByteStorage.field_k[var33Lifetime2] = var34;
                var34 = var24[var40];
                if (var34 < 0) {
                  fieldTemp$22 = TranslatedUiText.field_a;
                  TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                  var34 = fieldTemp$22;
                  var24[var40] = fieldTemp$22;
                  QuickChatMenu.field_Yb[var34] = var45;
                  CollisionContact.field_r[var34] = var46;
                  ProjectedVertex.field_d[var34] = var47;
                }
                ReflectionRequestSupport.field_h[var33Lifetime2] = var34;
                var34 = var24[var41];
                if (0 > var34) {
                  fieldTemp$23 = TranslatedUiText.field_a;
                  TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                  var34 = fieldTemp$23;
                  var24[var41] = fieldTemp$23;
                  QuickChatMenu.field_Yb[var34] = var48;
                  CollisionContact.field_r[var34] = var49;
                  ProjectedVertex.field_d[var34] = var50;
                }
                AccountWelcomePanel.field_P[var33Lifetime2] = var34;
                if (param5 != null) {
                  AchievementProtocolSupport.field_e[var33Lifetime2] = param5[var38];
                  ByteArrayNode.field_o[var33Lifetime2] = param23[var38];
                  ChatReplacementSupport.field_d[var33Lifetime2] = param20[var38];
                }
                var27[var33Lifetime2] = var38;
              }
              var38++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ByteArrayPool.field_a = param19;
            WhirlpoolHasher.field_g = param19;
            MidiPcmStream.field_bb = DebugTuningSupport.field_a;
            LogoMaterial.field_d = TranslatedUiText.field_a;
            stackIn_266_0 = -1;
            stackIn_266_1 = ~param19;
          }
          if (stackIn_266_0 > stackIn_266_1) {
            if (param21 != null) {
              fieldTemp$24 = param21.field_o;
              MusicPatchEnvelope.field_h.field_o = param21.field_o;
              RankingsBufferSupport.field_e.field_o = fieldTemp$24;
              if (null == RankingsBufferSupport.field_e.field_p ||
                !(RankingsBufferSupport.field_e.field_p.length >= param19)) {
                RankingsBufferSupport.field_e.field_C = new short[param19];
                RankingsBufferSupport.field_e.field_H = new short[param19];
                RankingsBufferSupport.field_e.field_p = new short[param19];
              }
              if (null == MusicPatchEnvelope.field_h.field_p ||
                !(param19 <= MusicPatchEnvelope.field_h.field_p.length)) {
                MusicPatchEnvelope.field_h.field_p = new short[param19];
                MusicPatchEnvelope.field_h.field_C = new short[param19];
                MusicPatchEnvelope.field_h.field_H = new short[param19];
              }
              var38Lifetime1 = 0;
              while (true) {
                if (param19 > var38Lifetime1) {
                  if (var65 == 0) {
                    if (param21.field_o[var38Lifetime1] == 0) {
                      var33Lifetime3 = param21.field_p[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$25 = TranslatedUiText.field_a;
                        TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                        var34Lifetime1 = fieldTemp$25;
                        var24[var33Lifetime3] = fieldTemp$25;
                        QuickChatMenu.field_Yb[var34Lifetime1] = param6[var33Lifetime3];
                        CollisionContact.field_r[var34Lifetime1] = param13[var33Lifetime3];
                        ProjectedVertex.field_d[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      RankingsBufferSupport.field_e.field_p[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$26 = DebugTuningSupport.field_a;
                        DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                        var34Lifetime1 = fieldTemp$26;
                        var25[var33Lifetime3] = fieldTemp$26;
                        HighScoreRequest.field_w[var34Lifetime1] = param6[var33Lifetime3];
                        TransformSupport.field_a[var34Lifetime1] = param13[var33Lifetime3];
                        CollisionContact.field_w[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      MusicPatchEnvelope.field_h.field_p[var38Lifetime1] = (short)var34Lifetime1;
                      var33Lifetime3 = param21.field_H[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$27 = TranslatedUiText.field_a;
                        TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                        var34Lifetime1 = fieldTemp$27;
                        var24[var33Lifetime3] = fieldTemp$27;
                        QuickChatMenu.field_Yb[var34Lifetime1] = param6[var33Lifetime3];
                        CollisionContact.field_r[var34Lifetime1] = param13[var33Lifetime3];
                        ProjectedVertex.field_d[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      RankingsBufferSupport.field_e.field_H[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$28 = DebugTuningSupport.field_a;
                        DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                        var34Lifetime1 = fieldTemp$28;
                        var25[var33Lifetime3] = fieldTemp$28;
                        HighScoreRequest.field_w[var34Lifetime1] = param6[var33Lifetime3];
                        TransformSupport.field_a[var34Lifetime1] = param13[var33Lifetime3];
                        CollisionContact.field_w[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      MusicPatchEnvelope.field_h.field_H[var38Lifetime1] = (short)var34Lifetime1;
                      var33Lifetime3 = param21.field_C[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$29 = TranslatedUiText.field_a;
                        TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                        var34Lifetime1 = fieldTemp$29;
                        var24[var33Lifetime3] = fieldTemp$29;
                        QuickChatMenu.field_Yb[var34Lifetime1] = param6[var33Lifetime3];
                        CollisionContact.field_r[var34Lifetime1] = param13[var33Lifetime3];
                        ProjectedVertex.field_d[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      RankingsBufferSupport.field_e.field_C[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$30 = DebugTuningSupport.field_a;
                        DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                        var34Lifetime1 = fieldTemp$30;
                        var25[var33Lifetime3] = fieldTemp$30;
                        HighScoreRequest.field_w[var34Lifetime1] = param6[var33Lifetime3];
                        TransformSupport.field_a[var34Lifetime1] = param13[var33Lifetime3];
                        CollisionContact.field_w[var34Lifetime1] = param10[var33Lifetime3];
                      }
                      MusicPatchEnvelope.field_h.field_C[var38Lifetime1] = (short)var34Lifetime1;
                    } else {
                      dupTemp$31 = param21.field_p[var38Lifetime1];
                      MusicPatchEnvelope.field_h.field_p[var38Lifetime1] = dupTemp$31;
                      RankingsBufferSupport.field_e.field_p[var38Lifetime1] = dupTemp$31;
                      dupTemp$32 = param21.field_H[var38Lifetime1];
                      MusicPatchEnvelope.field_h.field_H[var38Lifetime1] = dupTemp$32;
                      RankingsBufferSupport.field_e.field_H[var38Lifetime1] = dupTemp$32;
                      dupTemp$33 = param21.field_C[var38Lifetime1];
                      MusicPatchEnvelope.field_h.field_C[var38Lifetime1] = dupTemp$33;
                      RankingsBufferSupport.field_e.field_C[var38Lifetime1] = dupTemp$33;
                    }
                    var38Lifetime1++;
                    continue;
                  }
                } else {
                  fieldTemp$34 = param21.field_E;
                  MusicPatchEnvelope.field_h.field_E = param21.field_E;
                  RankingsBufferSupport.field_e.field_E = fieldTemp$34;
                  fieldTemp$35 = param21.field_T;
                  MusicPatchEnvelope.field_h.field_T = param21.field_T;
                  RankingsBufferSupport.field_e.field_T = fieldTemp$35;
                  fieldTemp$36 = param21.field_F;
                  MusicPatchEnvelope.field_h.field_F = param21.field_F;
                  RankingsBufferSupport.field_e.field_F = fieldTemp$36;
                  fieldTemp$37 = param21.field_j;
                  MusicPatchEnvelope.field_h.field_j = param21.field_j;
                  RankingsBufferSupport.field_e.field_j = fieldTemp$37;
                  fieldTemp$38 = param21.field_R;
                  MusicPatchEnvelope.field_h.field_R = param21.field_R;
                  RankingsBufferSupport.field_e.field_R = fieldTemp$38;
                  fieldTemp$39 = param21.field_i;
                  MusicPatchEnvelope.field_h.field_i = param21.field_i;
                  RankingsBufferSupport.field_e.field_i = fieldTemp$39;
                  fieldTemp$40 = param21.field_z;
                  MusicPatchEnvelope.field_h.field_z = param21.field_z;
                  RankingsBufferSupport.field_e.field_z = fieldTemp$40;
                  fieldTemp$41 = param21.field_h;
                  MusicPatchEnvelope.field_h.field_h = param21.field_h;
                  RankingsBufferSupport.field_e.field_h = fieldTemp$41;
                }
                break;
              }
              if (var65 == 0) {
                return;
              }
            }
            if (BitmapTextLayout.field_w == null ||
              !(param19 <= BitmapTextLayout.field_w.length)) {
              CueStick.field_h = new int[param19];
              CanvasInputAttachmentSupport.field_e = new int[param19];
              BitmapTextLayout.field_w = new int[param19];
            }
            if (TextureCache.field_e == null ||
              !(param19 <= TextureCache.field_e.length)) {
              DualLinkNodeHashTable.field_e = new int[param19];
              TextureCache.field_e = new int[param19];
              CachedArchiveSource.field_p = new int[param19];
            }
            var38Lifetime1Lifetime1 = 0;
            while (param19 > var38Lifetime1Lifetime1) {
              var33Lifetime3Lifetime1 = param9[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (var65 != 0) {
                return;
              }
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$42 = TranslatedUiText.field_a;
                TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$42;
                var24[var33Lifetime3Lifetime1] = fieldTemp$42;
                QuickChatMenu.field_Yb[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                CollisionContact.field_r[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                ProjectedVertex.field_d[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              BitmapTextLayout.field_w[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$43 = DebugTuningSupport.field_a;
                DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$43;
                var25[var33Lifetime3Lifetime1] = fieldTemp$43;
                HighScoreRequest.field_w[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                TransformSupport.field_a[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                CollisionContact.field_w[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              TextureCache.field_e[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var33Lifetime3Lifetime1 = param4[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$44 = TranslatedUiText.field_a;
                TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$44;
                var24[var33Lifetime3Lifetime1] = fieldTemp$44;
                QuickChatMenu.field_Yb[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                CollisionContact.field_r[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                ProjectedVertex.field_d[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              CanvasInputAttachmentSupport.field_e[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$45 = DebugTuningSupport.field_a;
                DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$45;
                var25[var33Lifetime3Lifetime1] = fieldTemp$45;
                HighScoreRequest.field_w[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                TransformSupport.field_a[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                CollisionContact.field_w[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              CachedArchiveSource.field_p[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var33Lifetime3Lifetime1 = param16[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (0 > var34Lifetime1Lifetime1) {
                fieldTemp$46 = TranslatedUiText.field_a;
                TranslatedUiText.field_a = TranslatedUiText.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$46;
                var24[var33Lifetime3Lifetime1] = fieldTemp$46;
                QuickChatMenu.field_Yb[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                CollisionContact.field_r[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                ProjectedVertex.field_d[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              CueStick.field_h[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$47 = DebugTuningSupport.field_a;
                DebugTuningSupport.field_a = DebugTuningSupport.field_a + 1;
                var34Lifetime1Lifetime1 = fieldTemp$47;
                var25[var33Lifetime3Lifetime1] = fieldTemp$47;
                HighScoreRequest.field_w[var34Lifetime1Lifetime1] = param6[var33Lifetime3Lifetime1];
                TransformSupport.field_a[var34Lifetime1Lifetime1] = param13[var33Lifetime3Lifetime1];
                CollisionContact.field_w[var34Lifetime1Lifetime1] = param10[var33Lifetime3Lifetime1];
              }
              DualLinkNodeHashTable.field_e[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var38Lifetime1Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var24_ref = decompiledCaughtException;
          stackIn_357_0 = var24_ref;
          stackIn_357_1 = new StringBuilder().append("u.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_358_2 = "null";
          } else {
            stackIn_358_2 = "{...}";
          }
          stackIn_361_1 = ((StringBuilder) (Object) stackIn_357_1).append(stackIn_358_2).append(',');
          if (param5 == null) {
            stackIn_362_2 = "null";
          } else {
            stackIn_362_2 = "{...}";
          }
          stackIn_365_1 = ((StringBuilder) (Object) stackIn_361_1).append(stackIn_362_2).append(',');
          if (param6 == null) {
            stackIn_366_2 = "null";
          } else {
            stackIn_366_2 = "{...}";
          }
          stackIn_369_1 = ((StringBuilder) (Object) stackIn_365_1).append(stackIn_366_2).append(',');
          if (param7 == null) {
            stackIn_370_2 = "null";
          } else {
            stackIn_370_2 = "{...}";
          }
          stackIn_373_1 = ((StringBuilder) (Object) stackIn_369_1).append(stackIn_370_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_374_2 = "null";
          } else {
            stackIn_374_2 = "{...}";
          }
          stackIn_377_1 = ((StringBuilder) (Object) stackIn_373_1).append(stackIn_374_2).append(',');
          if (param10 == null) {
            stackIn_378_2 = "null";
          } else {
            stackIn_378_2 = "{...}";
          }
          stackIn_381_1 = ((StringBuilder) (Object) stackIn_377_1).append(stackIn_378_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_382_2 = "null";
          } else {
            stackIn_382_2 = "{...}";
          }
          stackIn_385_1 = ((StringBuilder) (Object) stackIn_381_1).append(stackIn_382_2).append(',');
          if (param14 == null) {
            stackIn_386_2 = "null";
          } else {
            stackIn_386_2 = "{...}";
          }
          stackIn_389_1 = ((StringBuilder) (Object) stackIn_385_1).append(stackIn_386_2).append(',');
          if (param15 == null) {
            stackIn_390_2 = "null";
          } else {
            stackIn_390_2 = "{...}";
          }
          stackIn_393_1 = ((StringBuilder) (Object) stackIn_389_1).append(stackIn_390_2).append(',');
          if (param16 == null) {
            stackIn_394_2 = "null";
          } else {
            stackIn_394_2 = "{...}";
          }
          stackIn_397_1 = ((StringBuilder) (Object) stackIn_393_1).append(stackIn_394_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_398_2 = "null";
          } else {
            stackIn_398_2 = "{...}";
          }
          stackIn_401_1 = ((StringBuilder) (Object) stackIn_397_1).append(stackIn_398_2).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_402_2 = "null";
          } else {
            stackIn_402_2 = "{...}";
          }
          stackIn_405_1 = ((StringBuilder) (Object) stackIn_401_1).append(stackIn_402_2).append(',');
          if (param21 == null) {
            stackIn_406_2 = "null";
          } else {
            stackIn_406_2 = "{...}";
          }
          stackIn_409_1 = ((StringBuilder) (Object) stackIn_405_1).append(stackIn_406_2).append(',').append(param22).append(',');
          if (param23 == null) {
            stackIn_410_2 = "null";
          } else {
            stackIn_410_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_357_0), ((StringBuilder) (Object) stackIn_409_1).append(stackIn_410_2).append(')').toString());
        }
    }

    final static UiComponent createArrowButton(byte obfuscationGuard, int x, int y, boolean reverse, int actionId) {
        Sprite var5 = null;
        RuntimeException var5_ref = null;
        UiComponent var6 = null;
        Sprite stackIn_7_0 = null;
        UiComponent stackIn_10_0 = null;
        Sprite stackIn_11_1 = null;
        UiComponent stackIn_14_0 = null;
        Sprite stackIn_15_1 = null;
        UiComponent stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 53) {
            MeshRenderSupport.splitMeshAcrossPlane(-58, -76, -84, false, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -35, (int[]) null, (int[]) null, -23, 17, (int[]) null, (byte[]) null, (int[]) null, (int[]) null, -54, (int[]) null, 18, (int[]) null, (MeshBuilder) null, 89, (int[]) null);
          }
          if (reverse) {
            stackIn_7_0 = CushionSegment.field_h;
          } else {
            stackIn_7_0 = SupportPageLauncher.field_b;
          }
          var5 = stackIn_7_0;
          var6 = new UiComponent((long)actionId, (UiComponent) null, x, y, var5.field_z, var5.field_A, (String) null);
          var6.sprite = var5;
          stackIn_10_0 = var6;
          if (!reverse) {
            stackIn_11_1 = ProgressBarWidget.field_T;
          } else {
            stackIn_11_1 = ScreenProjectionSupport.field_b;
          }
          stackIn_10_0.disabledSprite = stackIn_11_1;
          stackIn_14_0 = var6;
          if (reverse) {
            stackIn_15_1 = PacketAvailabilitySupport.field_a;
          } else {
            stackIn_15_1 = HighScoreRequest.field_y;
          }
          stackIn_14_0.selectedSprite = stackIn_15_1;
          stackIn_16_0 = var6;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5_ref), "u.A(" + obfuscationGuard + ',' + x + ',' + y + ',' + reverse + ',' + actionId + ')');
        }
    }

    static {
        field_b = 0.0;
    }
}
