/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String unpackingSoundeffects;
    static int field_a;
    static Sprite[] field_b;
    static UiComponent field_d;
    static IntrusiveDeque field_g;
    static int field_c;
    static String enterfriendAdd;

    public static void releaseStatics(byte param0) {
        if (param0 != -90) {
          cq.a(-5);
        }
        field_g = null;
        field_d = null;
        enterfriendAdd = null;
        field_b = null;
        unpackingSoundeffects = null;
    }

    final static void a(boolean param0, int param1) {
        TextInputValidator.field_j.a(param0, (byte) 118);
        if (param1 < 27) {
          field_a = -63;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3) {
        int var6 = Pool.field_O;
        Sprite[] var7 = new Sprite[9];
        Sprite[] var4 = var7;
        var7[0] = ArchiveIndex.a(param2, param0, 7);
        int var5 = 1;
        if (param1 != 4578) {
          cq.a(true, -89);
        }
        while (var5 < 9) {
          var4[var5] = var4[0];
          var5++;
        }
        var4[4] = ArchiveIndex.a(param3, 64, param1 - 4571);
        return var4;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        if (param8 == 0) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        var11 = ArchiveProvider.divideFixed16(param8, (byte) -75, (long)(param0 + ((param1 << 16) - param3)));
        var12 = ArchiveProvider.divideFixed16(param8, (byte) -81, (long)(-param3 + (-(param1 << 16) + param0)));
        if (0 < var11 &&
          -param6 + 65536 >= var11 &&
          var12 > var11) {
          var10 = param5 + NameEntryPopup.a(var11, false, param4);
          if (param7 < param9) {
            decompiledFrameRemainder0 = !(param7 > var10);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param9);
            }
          } else {
            decompiledFrameRemainder0 = !(var10 < param9);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param7);
            }
          }
          if (decompiledFrameRemainder0) {
            return param6 + var11;
          }
        }
        regionExit1: {
          if (var12 > 0 &&
            65536 - param6 >= var12) {
            var10Lifetime1 = param5 + NameEntryPopup.a(var12, false, param4);
            if (param7 >= param9) {
              if (var10Lifetime1 < param9) {
                break regionExit1;
              }
              if (param7 < var10Lifetime1) {
                break regionExit1;
              }
            } else {
              if (var10Lifetime1 < param7) {
                break regionExit1;
              }
              if (param9 < var10Lifetime1) {
                break regionExit1;
              }
            }
            return var12 + param6;
          }
        }
        if (param2 <= -61) {
          return -1;
        }
        return -43;
    }

    final static void a(int param0) {
        PoolGameModel.i(-27397);
        so.field_g = new TutorialController[3];
        so.field_g[0] = new TutorialController(jj.tutorialTitleBasics, -1, 3);
        so.field_g[0].field_d.addFirst((byte) 110, new bk(QuickChatHelpDialog.tutorialCameraRotate, 100, 0));
        so.field_g[0].field_d.addFirst((byte) -114, new bk(ResizableDialog.tutorialCameraZoom, 50, 1, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) -80, new bk(ie.tutorialCameraRecentre, 3, 2, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) -50, new bk(je.tutorialShotModeEnter, 1, 3, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) 91, new bk(en.tutorialShotModeRotate, 300, 4, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) 88, new bk(na.tutorialShotModePower, 150, 5, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) -78, new bk(AchievementsScreen.tutorialShotModeTake, 1, 7, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) -110, new bk(om.tutorialShotModeLeave, 1, 6, so.field_g[0].field_d));
        so.field_g[0].field_d.addFirst((byte) -74, new bk(TextLineLayout.tutorialBasicComplete, 1, -1, so.field_g[0].field_d));
        so.field_g[0].updateStepCount(false);
        TutorialController dupTemp$0 = new TutorialController(fc.tutorialTitleEightBall, 2, 0);
        TutorialController arrayValue$1 = so.field_g[0];
        so.field_g[1] = dupTemp$0;
        arrayValue$1.field_j = dupTemp$0;
        if (param0 != 4313) {
          return;
        }
        so.field_g[1].field_d.addFirst((byte) -59, new bk(MessageDialog.tutorialEightBallStartPlaceCueball, 40, 13, 128));
        so.field_g[1].field_d.addFirst((byte) -43, new bk(dr.tutorialEightBallBreak, 1, 8, 0));
        so.field_g[1].field_d.addFirst((byte) 99, new bk(ea.tutorialEightBallAfterbreak, 1, 9, 0));
        so.field_g[1].field_d.addFirst((byte) 87, new bk(gn.tutorialEightBallAfterfirstpot, 7, 11, 0));
        so.field_g[1].field_d.addFirst((byte) 99, new bk(ChatMessageLine.tutorialEightBallAftergrouppot, 1, 12, 0));
        so.field_g[1].field_d.addFirst((byte) -6, new bk(MusicPatch.tutorialEightBallComplete, 1, -1, 0));
        so.field_g[1].updateStepCount(false);
        so.field_g[2] = new TutorialController(NetworkGameClient.tutorialTitleNineBall, 2, 1);
        so.field_g[2].field_d.addFirst((byte) -90, new bk(TextPairLoginPayload.tutorialNineBallStartPlaceCueball, 40, 13, 128));
        so.field_g[2].field_d.addFirst((byte) -99, new bk(SoundCache.tutorialNineBallBreak, 1, 8, 0));
        so.field_g[2].field_d.addFirst((byte) -21, new bk(DateInputWidget.tutorialNineBallAfterbreak, 1, 14, 0));
        so.field_g[2].field_d.addFirst((byte) -9, new bk(pl.tutorialNineBallPottingABall, 1, 15, 0));
        so.field_g[2].field_d.addFirst((byte) -62, new bk(LoginForm.tutorialNineBallPottingNine, 1, 16, 0));
        so.field_g[2].field_d.addFirst((byte) 92, new bk(rc.tutorialNineBallFinal, 1, -1, 0));
        so.field_g[2].updateStepCount(false);
    }

    final static MeshBuilder a(int param0, int param1, int param2, MeshBuilder param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        MeshBuilder stackIn_3_0 = null;
        MeshBuilder stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var6 = Pool.field_O;
        try {
          var5_int = 0;
          if (param1 <= 53) {
            stackIn_3_0 = (MeshBuilder) null;
            return stackIn_3_0;
          }
          while (var5_int < param3.vertexX.length) {
            param3.vertexX[var5_int] = param3.vertexX[var5_int] - param0;
            var5_int++;
          }
          for (var5_intLifetime1 = 0; param3.vertexY.length > var5_intLifetime1; var5_intLifetime1++) {
            param3.vertexY[var5_intLifetime1] = param3.vertexY[var5_intLifetime1] - param4;
          }
          for (var5_intLifetime2 = 0; var5_intLifetime2 < param3.vertexZ.length; var5_intLifetime2++) {
            param3.vertexZ[var5_intLifetime2] = param3.vertexZ[var5_intLifetime2] - param2;
          }
          param3.clearCaches();
          stackIn_13_0 = (MeshBuilder) (param3);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("cq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        unpackingSoundeffects = "Unpacking sound effects";
        field_g = new IntrusiveDeque();
        enterfriendAdd = "Enter name of friend to add to list";
    }
}
