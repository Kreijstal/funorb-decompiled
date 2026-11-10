/*
 * Decompiled by CFR-JS 0.4.0.
 */
class FocusDelegatingButton extends TextButton {
    private UiWidget field_G;
    static int field_F;
    static NameCheckRequest field_E;

    final boolean focusNext(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 67) {
            stackIn_4_0 = this.field_G.focusNext((byte) 99, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void openLoginDialog(int param0, String param1, boolean param2, boolean param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          RoamingCountryHuman.resetLoginState((byte) -72);
          MessageDialogContent.field_S.hideAllDialogs(-636330975);
          if (param0 != -753) {
            FocusDelegatingButton.openLoginDialog(-39, (String) null, false, false);
          }
          LoginDialogGlobals.field_a = new LoginPanel(GameLoopApplet.field_B, (String) null, IntRecordReplyHelpers.field_c, param3, param2);
          HuffmanCodec.field_d = new LoginDialog(MessageDialogContent.field_S, LoginDialogGlobals.field_a);
          MessageDialogContent.field_S.addDialog(HuffmanCodec.field_d, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void loadInterfaceText(Js5Archive param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1234_0;
            StringBuilder stackIn_1234_1;
            String stackIn_1235_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            Js5Archive param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(Js5Archive initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1234_0 = null;
                this.stackIn_1234_1 = null;
                this.stackIn_1235_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                DirectByteStorage.field_f = param0;
                var2 = ClientException.getLoadingTextFile(-31, "game_name");
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 611, "waitingfor_patches");
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-41, "loading_patches");
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -684, "mouseoverathing");
                if (var2 != null) {
                  GameLoopApplet.field_C = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-44, "achievementsthisgame");
                if (var2 != null) {
                  ArrivingPassenger.field_Hb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 674, "ukexpansion");
                if (null != var2) {
                  SoundEffectCleanupHelpers.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "ukexpansioninstalled");
                if (null != var2) {
                  EmailSyntaxValidator.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(100, "benefits,0");
                if (var2 != null) {
                  IntroCutsceneScreen.field_o[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-85, "benefits,1");
                if (var2 != null) {
                  IntroCutsceneScreen.field_o[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 779, "benefits,2");
                if (var2 != null) {
                  IntroCutsceneScreen.field_o[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "benefits,3");
                if (null != var2) {
                  IntroCutsceneScreen.field_o[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-70, "nextlevel");
                if (var2 != null) {
                  StripedProgressBar.field_G = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 618, "retry");
                if (var2 != null) {
                  HighscoresScreen.field_s = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-57, "restart");
                if (null != var2) {
                  MainMenuScreen.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-105, "endofgame");
                if (var2 != null) {
                  AccountRequestState.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-43, "endoffreegame");
                if (null != var2) {
                  QueuedStatSubmission.field_o = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-76, "gameover");
                if (var2 != null) {
                  SocialListEntry.field_jb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-17, "selectarea");
                if (var2 != null) {
                  LoginPromptTexts.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 683, "selectlevel");
                if (var2 != null) {
                  CheckboxWidget.field_H = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -679, "paused");
                if (var2 != null) {
                  RankingQueryWriter.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "keycode_left");
                if (null != var2) {
                  ValidatedTextWidget.field_P = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(param1 - 837, "keycode_right");
                if (null != var2) {
                  ArrivingPassenger.field_Gb = 255 & var2[0];
                }
                var2 = ClientException.getLoadingTextFile(-101, "keycode_up");
                if (var2 != null) {
                  TextWidgetPainter.field_d = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -761, "keycode_down");
                if (var2 != null) {
                  AddressHintGlobals.field_e = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(-41, "keycode_powerup1");
                if (null != var2) {
                  QueuedByteRecord.field_j = 255 & var2[0];
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 676, "keycode_powerup2");
                if (null != var2) {
                  BufferedSocket.field_k = 255 & var2[0];
                }
                var2 = ClientException.getLoadingTextFile(106, "keycode_powerup3");
                if (null != var2) {
                  NodeHashTable.field_c = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(120, "keycode_powerup4");
                if (var2 != null) {
                  MessageDialogContent.field_K = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 680, "keycode_powerup5");
                if (null != var2) {
                  DropTargetWidget.field_D = 255 & var2[0];
                }
                var2 = ClientException.getLoadingTextFile(param1 - 862, "keycode_powerup6");
                if (null != var2) {
                  HunterHuman.field_Rb = 255 & var2[0];
                }
                var2 = ClientException.getLoadingTextFile(127, "keycode_powerup7");
                if (null != var2) {
                  ExceptionWrapper.field_g = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -732, "keycode_powerup8");
                if (var2 != null) {
                  TrackedSoundStream.field_m = var2[0] & 255;
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -688, "achievement_names,0");
                if (var2 != null) {
                  TrafficVehicle.field_J[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-114, "achievement_names,1");
                if (var2 != null) {
                  TrafficVehicle.field_J[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(119, "achievement_names,2");
                if (null != var2) {
                  TrafficVehicle.field_J[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "achievement_names,3");
                if (var2 != null) {
                  TrafficVehicle.field_J[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "achievement_names,4");
                if (null != var2) {
                  TrafficVehicle.field_J[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(106, "achievement_names,5");
                if (var2 != null) {
                  TrafficVehicle.field_J[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(117, "achievement_names,6");
                if (null != var2) {
                  TrafficVehicle.field_J[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(117, "achievement_names,7");
                if (null != var2) {
                  TrafficVehicle.field_J[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 818, "achievement_names,8");
                if (null != var2) {
                  TrafficVehicle.field_J[8] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-96, "achievement_names,9");
                if (var2 != null) {
                  TrafficVehicle.field_J[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "achievement_names,10");
                if (var2 != null) {
                  TrafficVehicle.field_J[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "achievement_names,11");
                if (null != var2) {
                  TrafficVehicle.field_J[11] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-62, "achievement_names,12");
                if (null != var2) {
                  TrafficVehicle.field_J[12] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-55, "achievement_names,13");
                if (null != var2) {
                  TrafficVehicle.field_J[13] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-17, "achievement_names,14");
                if (var2 != null) {
                  TrafficVehicle.field_J[14] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-67, "achievement_names,15");
                if (var2 != null) {
                  TrafficVehicle.field_J[15] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-74, "achievement_names,16");
                if (var2 != null) {
                  TrafficVehicle.field_J[16] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 774, "achievement_names,17");
                if (var2 != null) {
                  TrafficVehicle.field_J[17] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-122, "achievement_names,18");
                if (null != var2) {
                  TrafficVehicle.field_J[18] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 614, "achievement_names,19");
                if (var2 != null) {
                  TrafficVehicle.field_J[19] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-84, "achievement_names,20");
                if (null != var2) {
                  TrafficVehicle.field_J[20] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "achievement_names,21");
                if (null != var2) {
                  TrafficVehicle.field_J[21] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-25, "achievement_names,22");
                if (var2 != null) {
                  TrafficVehicle.field_J[22] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 760, "achievement_names,23");
                if (null != var2) {
                  TrafficVehicle.field_J[23] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "achievement_names,24");
                if (null != var2) {
                  TrafficVehicle.field_J[24] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(114, "achievement_names,25");
                if (var2 != null) {
                  TrafficVehicle.field_J[25] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-56, "achievement_names,26");
                if (var2 != null) {
                  TrafficVehicle.field_J[26] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-91, "achievement_names,27");
                if (null != var2) {
                  TrafficVehicle.field_J[27] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(106, "achievement_names,28");
                if (var2 != null) {
                  TrafficVehicle.field_J[28] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-50, "achievement_names,29");
                if (null != var2) {
                  TrafficVehicle.field_J[29] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(114, "achievement_names,30");
                if (var2 != null) {
                  TrafficVehicle.field_J[30] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-47, "achievement_names,31");
                if (var2 != null) {
                  TrafficVehicle.field_J[31] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 697, "achievement_criteria,0");
                if (null != var2) {
                  TriangleMesh.field_C[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(127, "achievement_criteria,1");
                if (var2 != null) {
                  TriangleMesh.field_C[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-10, "achievement_criteria,2");
                if (null != var2) {
                  TriangleMesh.field_C[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-126, "achievement_criteria,3");
                if (var2 != null) {
                  TriangleMesh.field_C[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 693, "achievement_criteria,4");
                if (var2 != null) {
                  TriangleMesh.field_C[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "achievement_criteria,5");
                if (var2 != null) {
                  TriangleMesh.field_C[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "achievement_criteria,6");
                if (var2 != null) {
                  TriangleMesh.field_C[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-12, "achievement_criteria,7");
                if (null != var2) {
                  TriangleMesh.field_C[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 621, "achievement_criteria,8");
                if (var2 != null) {
                  TriangleMesh.field_C[8] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "achievement_criteria,9");
                if (null != var2) {
                  TriangleMesh.field_C[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-43, "achievement_criteria,10");
                if (var2 != null) {
                  TriangleMesh.field_C[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 684, "achievement_criteria,11");
                if (null != var2) {
                  TriangleMesh.field_C[11] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 680, "achievement_criteria,12");
                if (null != var2) {
                  TriangleMesh.field_C[12] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-92, "achievement_criteria,13");
                if (null != var2) {
                  TriangleMesh.field_C[13] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 633, "achievement_criteria,14");
                if (var2 != null) {
                  TriangleMesh.field_C[14] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(127, "achievement_criteria,15");
                if (null != var2) {
                  TriangleMesh.field_C[15] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-70, "achievement_criteria,16");
                if (null != var2) {
                  TriangleMesh.field_C[16] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-109, "achievement_criteria,17");
                if (var2 != null) {
                  TriangleMesh.field_C[17] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 860, "achievement_criteria,18");
                if (var2 != null) {
                  TriangleMesh.field_C[18] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -641, "achievement_criteria,19");
                if (var2 != null) {
                  TriangleMesh.field_C[19] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-59, "achievement_criteria,20");
                if (null != var2) {
                  TriangleMesh.field_C[20] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-60, "achievement_criteria,21");
                if (null != var2) {
                  TriangleMesh.field_C[21] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-72, "achievement_criteria,22");
                if (var2 != null) {
                  TriangleMesh.field_C[22] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 612, "achievement_criteria,23");
                if (var2 != null) {
                  TriangleMesh.field_C[23] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(116, "achievement_criteria,24");
                if (null != var2) {
                  TriangleMesh.field_C[24] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 810, "achievement_criteria,25");
                if (var2 != null) {
                  TriangleMesh.field_C[25] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 693, "achievement_criteria,26");
                if (null != var2) {
                  TriangleMesh.field_C[26] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "achievement_criteria,27");
                if (var2 != null) {
                  TriangleMesh.field_C[27] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 697, "achievement_criteria,28");
                if (null != var2) {
                  TriangleMesh.field_C[28] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-82, "achievement_criteria,29");
                if (null != var2) {
                  TriangleMesh.field_C[29] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -739, "achievement_criteria,30");
                if (var2 != null) {
                  TriangleMesh.field_C[30] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "achievement_criteria,31");
                if (null != var2) {
                  TriangleMesh.field_C[31] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 623, "stage_name,0,0");
                if (var2 != null) {
                  IntrusiveDequeCursor.field_a[0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(118, "stage_name,0,1");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 840, "stage_name,0,2");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-27, "stage_name,0,3");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[0][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-30, "stage_name,1,0");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-106, "stage_name,1,1");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[1][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 684, "stage_name,1,2");
                if (null != var2) {
                  IntrusiveDequeCursor.field_a[1][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 614, "stage_name,1,3");
                if (var2 != null) {
                  IntrusiveDequeCursor.field_a[1][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-109, "levelselect_title,0,0");
                if (null != var2) {
                  WorldNames.field_c[0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-100, "levelselect_title,0,1");
                if (null != var2) {
                  WorldNames.field_c[0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(106, "levelselect_title,0,2");
                if (var2 != null) {
                  WorldNames.field_c[0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "levelselect_title,0,3");
                if (null != var2) {
                  WorldNames.field_c[0][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "levelselect_title,1,0");
                if (var2 != null) {
                  WorldNames.field_c[1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-39, "levelselect_title,1,1");
                if (var2 != null) {
                  WorldNames.field_c[1][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 682, "levelselect_title,1,2");
                if (var2 != null) {
                  WorldNames.field_c[1][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "levelselect_title,1,3");
                if (var2 != null) {
                  WorldNames.field_c[1][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(101, "title_locked");
                if (var2 != null) {
                  FullscreenMembershipDialog.field_Y = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-116, "locked_level");
                if (var2 != null) {
                  ArchivePreloader.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -767, "levelselect_questionmarks");
                if (null != var2) {
                  MembershipPromotionScreen.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-48, "achievement_hidden");
                if (null != var2) {
                  ExceptionWrapper.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -663, "levelselect_levelname");
                if (null != var2) {
                  ScriptedMinigunner.field_Zb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-53, "score_colon_space");
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-63, "esc_to_skip");
                if (var2 != null) {
                  ScrollViewport.field_L = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(103, "instructions,0,0");
                if (null != var2) {
                  WidgetStyleLayer.field_g[0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-67, "instructions,0,1");
                if (null != var2) {
                  WidgetStyleLayer.field_g[0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 741, "instructions,1,0");
                if (null != var2) {
                  WidgetStyleLayer.field_g[1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(113, "instructions,1,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[1][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-37, "instructions,1,2");
                if (null != var2) {
                  WidgetStyleLayer.field_g[1][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "instructions,1,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[1][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-120, "instructions,1,4");
                if (null != var2) {
                  WidgetStyleLayer.field_g[1][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "instructions,2,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-105, "instructions,2,1");
                if (null != var2) {
                  WidgetStyleLayer.field_g[2][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 677, "instructions,2,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[2][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(103, "instructions,2,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[2][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-114, "instructions,3,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-17, "instructions,4,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -695, "instructions,5,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -714, "instructions,6,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[6][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-35, "instructions,7,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[7][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-64, "instructions,8,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[8][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 850, "instructions,9,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[9][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 616, "instructions,10,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_g[10][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 619, "instructions,11,0");
                if (null != var2) {
                  WidgetStyleLayer.field_g[11][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-109, "instructions_titles,0,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -701, "instructions_titles,0,1");
                if (null != var2) {
                  WidgetStyleLayer.field_k[0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-59, "instructions_titles,1,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-46, "instructions_titles,2,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(100, "instructions_titles,3,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-58, "instructions_titles,4,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 790, "instructions_titles,5,0");
                if (null != var2) {
                  WidgetStyleLayer.field_k[5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-60, "instructions_titles,6,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[6][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-66, "instructions_titles,7,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[7][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(127, "instructions_titles,8,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[8][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-104, "instructions_titles,9,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_k[9][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-56, "instructions_titles,10,0");
                if (null != var2) {
                  WidgetStyleLayer.field_k[10][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "instructions_titles,11,0");
                if (null != var2) {
                  WidgetStyleLayer.field_k[11][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(127, "instructions_powerups,0");
                if (null != var2) {
                  WidgetStyleLayer.field_j[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 760, "instructions_powerups,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-39, "instructions_powerups,2");
                if (null != var2) {
                  WidgetStyleLayer.field_j[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 629, "instructions_powerups,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(126, "instructions_powerups,4");
                if (null != var2) {
                  WidgetStyleLayer.field_j[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-58, "instructions_powerups,5");
                if (null != var2) {
                  WidgetStyleLayer.field_j[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 676, "instructions_powerups,6");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(127, "instructions_powerups,7");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -642, "instructions_powerups,9");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-111, "instructions_powerups,10");
                if (var2 != null) {
                  WidgetStyleLayer.field_j[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-49, "instructions_powerups,12");
                if (null != var2) {
                  WidgetStyleLayer.field_j[12] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "instructions_powerups,13");
                if (null != var2) {
                  WidgetStyleLayer.field_j[13] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-23, "instructions_powerups,14");
                if (null != var2) {
                  WidgetStyleLayer.field_j[14] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "instructions_powerups,15");
                if (null != var2) {
                  WidgetStyleLayer.field_j[15] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(103, "instructions_survivors,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_p[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-114, "instructions_survivors,1");
                if (null != var2) {
                  WidgetStyleLayer.field_p[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "instructions_survivors,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_p[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 849, "instructions_survivors,3");
                if (null != var2) {
                  WidgetStyleLayer.field_p[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "instructions_survivors,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_p[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-121, "instructions_survivors,5");
                if (null != var2) {
                  WidgetStyleLayer.field_p[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-30, "instructions_survivors,6");
                if (null != var2) {
                  WidgetStyleLayer.field_p[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-83, "instructions_survivors,7");
                if (null != var2) {
                  WidgetStyleLayer.field_p[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(122, "instructions_survivors,8");
                if (var2 != null) {
                  WidgetStyleLayer.field_p[8] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 609, "instructions_survivors,9");
                if (var2 != null) {
                  WidgetStyleLayer.field_p[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -654, "instructions_survivors,10");
                if (null != var2) {
                  WidgetStyleLayer.field_p[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(125, "instructions_survivors,11");
                if (null != var2) {
                  WidgetStyleLayer.field_p[11] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-97, "intro_text,0");
                if (null != var2) {
                  WidgetStyleLayer.field_o[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 793, "intro_text,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_o[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-26, "intro_text,2");
                if (null != var2) {
                  WidgetStyleLayer.field_o[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-94, "intro_text,3");
                if (null != var2) {
                  WidgetStyleLayer.field_o[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(118, "intro_text,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_o[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 696, "intro_text,5");
                if (var2 != null) {
                  WidgetStyleLayer.field_o[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "intro_text,6");
                if (var2 != null) {
                  WidgetStyleLayer.field_o[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-71, "intro_text_uk,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_a[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 837, "intro_text_uk,1");
                if (null != var2) {
                  WidgetStyleLayer.field_a[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-100, "settings");
                if (var2 != null) {
                  SingleChildWidget.field_A = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -742, "area_names,0");
                if (var2 != null) {
                  CaptionedContainer.field_G[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "area_names,1");
                if (null != var2) {
                  CaptionedContainer.field_G[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "scorecolonspace");
                if (null != var2) {
                  MenuSelection.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(113, "bonuscount");
                if (null != var2) {
                  JaggrabDownloader.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "rank");
                if (var2 != null) {
                  NetworkArchiveRequest.field_z = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-40, "name");
                if (null != var2) {
                  SavedDataRequest.field_r = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-28, "score");
                if (null != var2) {
                  ZombieDawn.field_D = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-123, "youhavewon");
                if (null != var2) {
                  DropdownSelectorPainter.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-34, "youhavelost");
                if (null != var2) {
                  CheckboxWidget.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(126, "bonuslevelcomplete");
                if (var2 != null) {
                  InsetTextPainter.field_u = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 620, "zombiesremaining");
                if (null != var2) {
                  WidgetStyleLayer.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-28, "timeremaining");
                if (null != var2) {
                  UiContainer.field_y = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-68, "zombiesacross");
                if (var2 != null) {
                  LoadingProgressDialog.field_bb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-93, "humanscaptured");
                if (null != var2) {
                  NameSuggestionsPanel.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "overallscore");
                if (var2 != null) {
                  ClientException.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-35, "gamecomplete,0");
                if (var2 != null) {
                  StripedProgressBar.field_D[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -722, "gamecomplete,1");
                if (var2 != null) {
                  StripedProgressBar.field_D[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(108, "selectazombie");
                if (null != var2) {
                  GameKeyHandler.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(106, "selectahuman");
                if (null != var2) {
                  WidgetStyleLayer.field_m = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-70, "selectapoint");
                if (var2 != null) {
                  NameListEntry.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -741, "selectanywhere");
                if (var2 != null) {
                  AppletHostHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "powerup_speed");
                if (var2 != null) {
                  NameCheckRequest.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "powerup_meltdown");
                if (null != var2) {
                  GooPuddle.field_l = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(113, "powerup_phantom");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  Human.field_bb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "powerup_disguise");
                if (var2 != null) {
                  DimensionOnlyResizer.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(112, "powerup_detonate");
                if (null != var2) {
                  ScrollViewport.field_K = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 612, "powerup_screech");
                if (var2 != null) {
                  PopupMenuBuilder.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-53, "powerup_tough");
                if (var2 != null) {
                  DraggableWidget.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(122, "powerup_curse");
                if (null != var2) {
                  MidiNoteMask.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 835, "powerup_barrier");
                if (null != var2) {
                  AccountTermsPanel.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-35, "powerup_breach");
                if (var2 != null) {
                  LevelHud.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-38, "powerup_shackles");
                if (var2 != null) {
                  GameResourceLoader.field_k = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-90, "powerup_quake");
                if (null != var2) {
                  SingleChildWidget.field_C = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-99, "powerup_fear");
                if (var2 != null) {
                  RoamingCountryHuman.field_Bb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -766, "powerup_fireball");
                if (null != var2) {
                  QuickChatPhraseDefinition.field_s = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-96, "levelname,0,0");
                if (null != var2) {
                  WidgetStyleLayer.field_w[0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 616, "levelname,0,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-75, "levelname,0,2");
                if (null != var2) {
                  WidgetStyleLayer.field_w[0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-119, "levelname,0,3");
                if (null != var2) {
                  WidgetStyleLayer.field_w[0][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-30, "levelname,0,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[0][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-31, "levelname,0,5");
                if (null != var2) {
                  WidgetStyleLayer.field_w[0][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 678, "levelname,1,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -711, "levelname,1,1");
                if (null != var2) {
                  WidgetStyleLayer.field_w[1][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "levelname,1,2");
                if (null != var2) {
                  WidgetStyleLayer.field_w[1][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 611, "levelname,1,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[1][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -755, "levelname,1,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[1][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "levelname,1,5");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[1][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(108, "levelname,2,0");
                if (null != var2) {
                  WidgetStyleLayer.field_w[2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 810, "levelname,2,1");
                if (null != var2) {
                  WidgetStyleLayer.field_w[2][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(122, "levelname,2,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[2][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "levelname,2,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[2][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-11, "levelname,2,4");
                if (null != var2) {
                  WidgetStyleLayer.field_w[2][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(108, "levelname,2,5");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[2][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-103, "levelname,3,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-104, "levelname,3,1");
                if (null != var2) {
                  WidgetStyleLayer.field_w[3][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 676, "levelname,3,2");
                if (null != var2) {
                  WidgetStyleLayer.field_w[3][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(118, "levelname,3,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[3][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 691, "levelname,3,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[3][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-13, "levelname,3,5");
                if (null != var2) {
                  WidgetStyleLayer.field_w[3][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(123, "levelname,4,0");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(108, "levelname,4,1");
                if (null != var2) {
                  WidgetStyleLayer.field_w[4][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(113, "levelname,4,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[4][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(104, "levelname,4,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[4][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(120, "levelname,4,4");
                if (null != var2) {
                  WidgetStyleLayer.field_w[4][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-80, "levelname,4,5");
                if (null != var2) {
                  WidgetStyleLayer.field_w[4][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-22, "levelname,5,0");
                if (null != var2) {
                  WidgetStyleLayer.field_w[5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 628, "levelname,5,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[5][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-80, "levelname,5,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[5][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 838, "levelname,5,3");
                if (null != var2) {
                  WidgetStyleLayer.field_w[5][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 609, "levelname,5,4");
                if (null != var2) {
                  WidgetStyleLayer.field_w[5][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 617, "levelname,5,5");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[5][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-111, "levelname,6,0");
                if (null != var2) {
                  WidgetStyleLayer.field_w[6][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-37, "levelname,6,1");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[6][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-14, "levelname,6,2");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[6][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-27, "levelname,6,3");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[6][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-49, "levelname,6,4");
                if (null != var2) {
                  WidgetStyleLayer.field_w[6][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-79, "levelname,6,5");
                if (null != var2) {
                  WidgetStyleLayer.field_w[6][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "levelname,7,0");
                if (null != var2) {
                  WidgetStyleLayer.field_w[7][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-116, "levelname,7,1");
                if (null != var2) {
                  WidgetStyleLayer.field_w[7][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 680, "levelname,7,2");
                if (null != var2) {
                  WidgetStyleLayer.field_w[7][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-34, "levelname,7,3");
                if (null != var2) {
                  WidgetStyleLayer.field_w[7][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 677, "levelname,7,4");
                if (var2 != null) {
                  WidgetStyleLayer.field_w[7][4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-24, "levelname,7,5");
                if (null != var2) {
                  WidgetStyleLayer.field_w[7][5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-40, "bonuslevel");
                if (var2 != null) {
                  Alien.field_S = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 687, "theend");
                if (null != var2) {
                  HotspotTextWidget.field_M = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(125, "bonusleveltext,0");
                if (null != var2) {
                  AgeValidator.field_g[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-12, "bonusleveltext,1");
                if (null != var2) {
                  AgeValidator.field_g[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-13, "bonusleveltext,2");
                if (var2 != null) {
                  AgeValidator.field_g[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 836, "bonusleveltext,3");
                if (var2 != null) {
                  AgeValidator.field_g[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-47, "bonusleveltext,4");
                if (null != var2) {
                  AgeValidator.field_g[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(114, "bonusleveltext,5");
                if (null != var2) {
                  AgeValidator.field_g[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-33, "bonusleveltext,6");
                if (null != var2) {
                  AgeValidator.field_g[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(109, "bonusleveltext,7");
                if (var2 != null) {
                  AgeValidator.field_g[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-73, "tutorialtoggle,0");
                if (null != var2) {
                  AccountCreationDialog.field_qb[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "tutorialtoggle,1");
                if (null != var2) {
                  AccountCreationDialog.field_qb[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "difficultytoggle,0");
                if (var2 != null) {
                  ContentTransitionPhase.field_a[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(111, "difficultytoggle,1");
                if (null != var2) {
                  ContentTransitionPhase.field_a[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(102, "tutorial,0,0,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-34, "tutorial,0,0,1");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[0][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-12, "tutorial,0,0,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-56, "tutorial,0,0,3");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][0][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 698, "tutorial,0,1,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(126, "tutorial,0,1,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][1][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 624, "tutorial,0,1,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][1][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-106, "tutorial,0,2,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 693, "tutorial,0,2,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][2][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(112, "tutorial,0,2,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][2][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-73, "tutorial,0,2,3");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][2][3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(113, "tutorial,0,3,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[0][3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "tutorial,0,4,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-14, "tutorial,0,4,1");
                if (param1 != 734) {
                  finished = true; return;
                }
                if (null != var2) {
                  ArrivingPassenger.field_Fb[0][4][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "tutorial,0,4,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][4][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(105, "tutorial,0,5,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(104, "tutorial,0,5,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][5][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 752, "tutorial,0,5,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[0][5][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 624, "tutorial,1,0,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-86, "tutorial,1,0,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 627, "tutorial,1,1,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-105, "tutorial,1,2,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-34, "tutorial,1,2,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][2][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-110, "tutorial,1,4,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[1][4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(112, "tutorial,1,4,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][4][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(120, "tutorial,1,5,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[1][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 688, "tutorial,2,5,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[2][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(110, "tutorial,2,5,1");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[2][5][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-111, "tutorial,2,5,2");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[2][5][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 618, "tutorial,4,0,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-97, "tutorial,4,0,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 859, "tutorial,4,1,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-82, "tutorial,4,2,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-13, "tutorial,4,3,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[4][3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(122, "tutorial,4,3,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][3][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 678, "tutorial,4,4,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[4][4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-122, "tutorial,4,5,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[4][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-107, "tutorial,5,0,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[5][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "tutorial,5,0,1");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[5][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -661, "tutorial,5,0,2");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[5][0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(122, "tutorial,5,1,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[5][1][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 681, "tutorial,5,2,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[5][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-10, "tutorial,5,2,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[5][2][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-31, "tutorial,5,4,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[5][4][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(114, "tutorial,6,0,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[6][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(108, "tutorial,6,0,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[6][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-115, "tutorial,6,2,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[6][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(106, "tutorial,6,3,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[6][3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(115, "tutorial,6,3,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[6][3][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-37, "tutorial,6,3,2");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[6][3][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-46, "tutorial,6,5,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[6][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 607, "tutorial,7,0,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[7][0][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ 676, "tutorial,7,0,1");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[7][0][1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-65, "tutorial,7,0,2");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[7][0][2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(112, "tutorial,7,2,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[7][2][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-80, "tutorial,7,3,0");
                if (null != var2) {
                  ArrivingPassenger.field_Fb[7][3][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(121, "tutorial,7,5,0");
                if (var2 != null) {
                  ArrivingPassenger.field_Fb[7][5][0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-107, "tutorial_nokeycardsleft,0");
                if (var2 != null) {
                  MenuSelection.field_g[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-23, "tutorial_nokeycardsleft,1");
                if (var2 != null) {
                  MenuSelection.field_g[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-27, "tutorial_nokeycardsleft,2");
                if (null != var2) {
                  MenuSelection.field_g[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(-9, "tutorial_notenoughhumansleft,0");
                if (null != var2) {
                  SocketConnector.field_g[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 613, "tutorial_notenoughhumansleft,1");
                if (var2 != null) {
                  SocketConnector.field_g[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 - 825, "tutorial_notenoughhumansleft,2");
                if (var2 != null) {
                  SocketConnector.field_g[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(124, "clicktoclose");
                if (var2 != null) {
                  MusicPatchPcmStream.field_o = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = ClientException.getLoadingTextFile(param1 ^ -757, "ukexpansiontoosoon");
                if (null != var2) {
                  ByteArrayPool.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                DirectByteStorage.field_f = null;
            }
            void run() {
                var3 = ZombieDawn.field_J;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1234_0 = (RuntimeException) (var2_ref);
                  stackIn_1234_1 = new StringBuilder().append("gl.E(");
                  if (param0 == null) {
                    stackIn_1235_2 = "null";
                  } else {
                    stackIn_1235_2 = "{...}";
                  }
                  throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_1234_0), ((StringBuilder) (Object) stackIn_1234_1).append(stackIn_1235_2).append(',').append(param1).append(')').toString());
                }
                if (GameApplet.field_f != 0) {
                  var3++;
                  ZombieDawn.field_J = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    FocusDelegatingButton(UiWidget param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_G = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gl.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          return;
        }
        try {
          field_E = null;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "gl.G(" + param0 + ')');
        }
    }

    static {
    }
}
