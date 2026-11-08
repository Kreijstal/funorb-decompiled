/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static java.awt.Canvas field_c;
    static int field_g;
    static int field_h;
    String field_f;
    static String field_a;
    boolean field_j;
    String field_e;
    static String field_d;
    static String field_i;
    static String field_b;

    final static void changeMusic(int param0, int param1, boolean param2, boolean param3, MusicTrack param4) {
        MusicCrossfadeStream stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_3_0 = gg.field_h;
          stackIn_4_1 = !(param2);
          ((MusicCrossfadeStream) (Object) stackIn_3_0).switchTrack(stackIn_4_1, 1000000, (byte) -85, param1, param0, param4);
          if (!param3) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("on.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          if (param0 != 3) {
            on.releaseStatics(-25);
          }
          field_b = null;
          field_i = null;
          field_a = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "on.D(" + param0 + ')');
        }
    }

    final static int computeAngle(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -26 % ((param2 + 32) / 53);
          if (param0 == 0) {
            if (param1 == 0) {
              stackIn_5_0 = 0;
              return stackIn_5_0;
            }
            if (param1 < 0) {
              stackIn_10_0 = -2048;
              return stackIn_10_0;
            }
            stackIn_8_0 = 2048;
            return stackIn_8_0;
          }
          if (param0 < 0) {
            if (param1 == 0) {
              stackIn_26_0 = 4096;
              return stackIn_26_0;
            }
            if (0 <= param1) {
              stackIn_31_0 = -cc.approximateAngle(param1, -param0, -87) + 4096;
              return stackIn_31_0;
            }
            stackIn_29_0 = -4096 + cc.approximateAngle(-param1, -param0, -110);
            return stackIn_29_0;
          }
          if (param1 == 0) {
            stackIn_16_0 = 0;
            return stackIn_16_0;
          }
          if (param1 < 0) {
            stackIn_21_0 = -cc.approximateAngle(-param1, param0, -90);
            return stackIn_21_0;
          }
          stackIn_19_0 = cc.approximateAngle(param1, param0, -127);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "on.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static long longAnd(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "on.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void initializeLoginMessages(byte param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2624_0;
            StringBuilder stackIn_2624_1;
            String stackIn_2625_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            byte param0;
            ResourceArchive param1;
            boolean finished;
            $CfrPartitionedBody(byte initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2624_0 = null;
                this.stackIn_2624_1 = null;
                this.stackIn_2625_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                AlternateUsernameCredentials.field_q = param1;
                var2 = MusicPatch.loadNamedFile("loginm3", (byte) -45);
                if (null != var2) {
                  DualLinkDeque.field_a = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("loginm2", (byte) -45);
                if (var2 != null) {
                  NumericDateInputWidget.field_R = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("loginm1", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("idlemessage20min", (byte) -45);
                if (null != var2) {
                  TextFieldValidator.field_j = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("error_js5crc", (byte) -45);
                if (null != var2) {
                  JaggrabDownloader.field_e = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("error_js5io", (byte) -45);
                if (null != var2) {
                  BattleScreen.field_N = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("error_js5connect_full", (byte) -45);
                if (var2 != null) {
                  BevelTextPainter.field_p = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("error_js5connect", (byte) -45);
                if (null != var2) {
                  dd.field_a = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_gameupdated", (byte) -45);
                if (var2 != null) {
                  IndexedSpriteState.field_d = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_unable", (byte) -45);
                if (null != var2) {
                  fo.field_c = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_ineligible", (byte) -45);
                if (null != var2) {
                  g.field_c = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("usernameprompt", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("passwordprompt", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("andagainprompt", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_read", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_ignore", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_oneunread", (byte) -45);
                if (var2 != null) {
                  WrappedTextLayout.field_k = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_xunread", (byte) -45);
                if (null != var2) {
                  sk.field_g = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_gotowebsite", (byte) -45);
                if (var2 != null) {
                  IconTextSceneWidget.field_Hb = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("ticketing_waitingformessages", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_on", (byte) -45);
                if (var2 != null) {
                  GzipDecoder.field_e = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_friends", (byte) -45);
                if (null != var2) {
                  HuffmanCodec.field_d = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_off", (byte) -45);
                if (null != var2) {
                  TextButton.field_A = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_lobby", (byte) -45);
                if (var2 != null) {
                  NanoFrameClock.field_p = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_public", (byte) -45);
                if (null != var2) {
                  UiComponent.field_m = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_ignore", (byte) -45);
                if (null != var2) {
                  lm.field_g = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_tips", (byte) -45);
                if (var2 != null) {
                  CipherPacketBuffer.field_r = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_game", (byte) -45);
                if (var2 != null) {
                  ec.field_b = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_private", (byte) -45);
                if (var2 != null) {
                  he.field_c = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_entered_game", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_e = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_joined_your_game", (byte) -45);
                if (var2 != null) {
                  AudioService.field_h = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_entered_other_game", (byte) -45);
                if (var2 != null) {
                  SceneTabbedPanel.field_Gb = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_left_lobby", (byte) -45);
                if (var2 != null) {
                  DropTargetWidget.field_M = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_lost_con", (byte) -45);
                if (var2 != null) {
                  LinkButtonPainter.field_n = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_cannot_join_full", (byte) -45);
                if (null != var2) {
                  b.field_b = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_cannot_join_inprogress", (byte) -45);
                if (null != var2) {
                  ho.field_d = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_declined_invite", (byte) -45);
                if (var2 != null) {
                  c.field_c = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_withdrew_request", (byte) -45);
                if (null != var2) {
                  ui.field_w = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_removed", (byte) -45);
                if (null != var2) {
                  MenuInputState.field_n = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_x_dropped_out", (byte) -45);
                if (var2 != null) {
                  qo.field_d = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_entered_other_game", (byte) -45);
                if (null != var2) {
                  fm.field_a = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_game_is_full", (byte) -45);
                if (null != var2) {
                  rf.field_k = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_game_has_started", (byte) -45);
                if (null != var2) {
                  MenuButtonPainter.field_v = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_you_declined_invite", (byte) -45);
                if (var2 != null) {
                  mf.field_f = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_invite_withdrawn", (byte) -45);
                if (var2 != null) {
                  ViewportController.field_n = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_request_declined", (byte) -45);
                if (null != var2) {
                  oj.field_c = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_request_withdrawn", (byte) -45);
                if (null != var2) {
                  ResizableViewResizeListener.field_f = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_all_players_have_left", (byte) -45);
                if (var2 != null) {
                  KeyboardInputHandler.field_k = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_name", (byte) -45);
                if (null != var2) {
                  hb.field_Bb = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_rating", (byte) -45);
                if (var2 != null) {
                  SocketJs5Transport.field_q = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_friend_add", (byte) -45);
                if (var2 != null) {
                  AccountRegistrationPanel.field_T = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_friend_rm", (byte) -45);
                if (null != var2) {
                  Js5NetworkRequest.field_z = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_name_add", (byte) -45);
                if (null != var2) {
                  dm.field_I = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_name_rm", (byte) -45);
                if (null != var2) {
                  NumericDateInputWidget.field_M = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_lobby_location", (byte) -45);
                if (null != var2) {
                  ConditionalTextValue.field_d = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_all_games", (byte) -45);
                if (var2 != null) {
                  hb.field_Ib = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_status", (byte) -45);
                if (var2 != null) {
                  of.field_k = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_owner", (byte) -45);
                if (null != var2) {
                  MenuScreen.field_c = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_players", (byte) -45);
                if (var2 != null) {
                  PatchEnvelopeSet.field_c = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_avg_rating", (byte) -45);
                if (null != var2) {
                  CanvasRasterBuffer.field_h = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_options", (byte) -45);
                if (var2 != null) {
                  g.field_b = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gamelist_elapsed_time", (byte) -45);
                if (var2 != null) {
                  TextLayout.field_a = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_play_rated", (byte) -45);
                if (null != var2) {
                  fi.field_f = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_create_unrated", (byte) -45);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_t = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options", (byte) -45);
                if (var2 != null) {
                  MusicPatchNode.field_o = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options_whocanjoin", (byte) -45);
                if (null != var2) {
                  gg.field_i = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options_players", (byte) -45);
                if (var2 != null) {
                  ChatInputWidget.field_Bb = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options_dontmind", (byte) -45);
                if (null != var2) {
                  SceneTabbedPanel.field_Rb = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options_allow_spectate", (byte) -45);
                if (null != var2) {
                  SecondaryNodeDeque.field_b = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_options_ratedgametype", (byte) -45);
                if (var2 != null) {
                  fm.field_e = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("yes", (byte) -45);
                if (null != var2) {
                  cf.field_d = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("no", (byte) -45);
                if (null != var2) {
                  StrongCacheEntry.field_B = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_invite_players", (byte) -45);
                if (var2 != null) {
                  mb.field_O = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("close", (byte) -45);
                if (var2 != null) {
                  f.field_i = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("add_x_to_friends", (byte) -45);
                if (var2 != null) {
                  ArcanistsMulti.field_F = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("add_x_to_ignore", (byte) -45);
                if (var2 != null) {
                  tn.field_Lb = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("rm_x_from_friends", (byte) -45);
                if (null != var2) {
                  LabeledField.field_F = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("rm_x_from_ignore", (byte) -45);
                if (var2 != null) {
                  ja.field_t = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("send_pm_to_x", (byte) -45);
                if (null != var2) {
                  mb.field_S = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("send_qc_to_x", (byte) -45);
                if (null != var2) {
                  bh.field_b = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("send_pm", (byte) -45);
                if (var2 != null) {
                  KeyboardInputHandler.field_e = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("invite_accept_xs_game", (byte) -45);
                if (null != var2) {
                  LobbyGameEntry.field_Sb = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("invite_decline_xs_game", (byte) -45);
                if (null != var2) {
                  ValidationStatusIcon.field_I = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("join_xs_game", (byte) -45);
                if (null != var2) {
                  ec.field_a = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("join_request_xs_game", (byte) -45);
                if (var2 != null) {
                  bm.field_i = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("join_withdraw_request_xs_game", (byte) -45);
                if (var2 != null) {
                  hl.field_h = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gameopt_kick_x_from_this_game", (byte) -45);
                if (var2 != null) {
                  gg.field_a = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gameopt_withdraw_invite_to_x", (byte) -45);
                if (null != var2) {
                  LobbyGameEntry.field_gc = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gameopt_accept_x_into_game", (byte) -45);
                if (null != var2) {
                  DraggableWidget.field_L = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gameopt_reject_x_from_game", (byte) -45);
                if (null != var2) {
                  MidiPcmStream.field_z = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_gameopt_invite_x_to_game", (byte) -45);
                if (null != var2) {
                  StrongCacheEntry.field_x = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("report_x_for_abuse", (byte) -45);
                if (null != var2) {
                  ad.field_b = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_send_message_password_a", (byte) -45);
                if (null != var2) {
                  IconButtonPainter.field_q = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_send_message_password_b", (byte) -45);
                if (var2 != null) {
                  TextTableInitializer.field_b = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_lobby_show_all", (byte) -45);
                if (var2 != null) {
                  ReflectionCheckRequest.field_q = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_lobby_friends_only", (byte) -45);
                if (null != var2) {
                  MusicPatch.field_g = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_lobby_friends", (byte) -45);
                if (var2 != null) {
                  cj.field_c = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_lobby_hide", (byte) -45);
                if (var2 != null) {
                  jg.field_j = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_game_show_all", (byte) -45);
                if (var2 != null) {
                  IsaacCipher.field_f = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_game_friends_only", (byte) -45);
                if (null != var2) {
                  SocketConnector.field_a = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_game_friends", (byte) -45);
                if (null != var2) {
                  wa.field_Hb = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_game_hide", (byte) -45);
                if (var2 != null) {
                  dm.field_J = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_pm_show_all", (byte) -45);
                if (var2 != null) {
                  ChatInputWidget.field_Jb = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_pm_friends_only", (byte) -45);
                if (null != var2) {
                  va.field_d = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_pm_friends", (byte) -45);
                if (null != var2) {
                  Js5Transport.field_l = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("mu_chat_invisible_and_silent_mode", (byte) -45);
                if (null != var2) {
                  CameraFollowTarget.field_c = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_have_been_removed_from_xs_game", (byte) -45);
                if (var2 != null) {
                  i.field_b = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("your_rating_is_x", (byte) -45);
                if (var2 != null) {
                  SoundCache.field_j = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_are_on_x_server", (byte) -45);
                if (var2 != null) {
                  LoginPanel.field_C = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("rated_game", (byte) -45);
                if (null != var2) {
                  ri.field_c = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("unrated_game", (byte) -45);
                if (var2 != null) {
                  IntKeyLookup.field_h = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("rated_game_tips", (byte) -45);
                if (null != var2) {
                  BevelBoxPainter.field_e = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("searching_for_opponent_singular", (byte) -45);
                if (var2 != null) {
                  LoginMethod.field_e = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("searching_for_opponents_plural", (byte) -45);
                if (null != var2) {
                  bb.field_f = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("find_opponent_singular", (byte) -45);
                if (var2 != null) {
                  ah.field_d = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("find_opponents_plural", (byte) -45);
                if (null != var2) {
                  fi.field_b = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("rated_game_tips_setup_singular", (byte) -45);
                if (null != var2) {
                  ValidatedTextWidget.field_W = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("rated_game_tips_setup_plural", (byte) -45);
                if (var2 != null) {
                  NameCheckRequest.field_g = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("waiting_to_start_hint", (byte) -45);
                if (null != var2) {
                  MenuButtonPanel.field_R = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("your_game", (byte) -45);
                if (null != var2) {
                  fb.field_c = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("game_full", (byte) -45);
                if (var2 != null) {
                  ck.field_f = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("join_requests_one", (byte) -45);
                if (var2 != null) {
                  ContentTransitionDialog.field_pb = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("join_requests_many", (byte) -45);
                if (var2 != null) {
                  MenuButtonPainter.field_y = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("xs_game", (byte) -45);
                if (var2 != null) {
                  Bzip2State.field_j = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("waiting_for_x_to_start_game", (byte) -45);
                if (null != var2) {
                  uf.field_b = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("game_options_changed", (byte) -45);
                if (null != var2) {
                  SocketJs5Transport.field_v = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("players_x_of_y", (byte) -45);
                if (null != var2) {
                  IsaacCipher.field_h = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("message_lobby", (byte) -45);
                if (null != var2) {
                  IsaacRandom.field_i = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_lobby", (byte) -45);
                if (var2 != null) {
                  Js5Transport.field_h = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("message_game", (byte) -45);
                if (null != var2) {
                  Js5NetworkRequest.field_v = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("message_team", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_game", (byte) -45);
                if (var2 != null) {
                  SocketJs5Transport.field_s = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("kick", (byte) -45);
                if (var2 != null) {
                  TextHotspotWidget.field_L = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("inviting_x", (byte) -45);
                if (null != var2) {
                  mf.field_h = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("x_wants_to_join", (byte) -45);
                if (null != var2) {
                  TextFieldValidator.field_n = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("accept", (byte) -45);
                if (null != var2) {
                  SceneTextInput.field_Nb = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("reject", (byte) -45);
                if (var2 != null) {
                  qc.field_f = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("invite", (byte) -45);
                if (var2 != null) {
                  ah.field_a = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_concluded", (byte) -45);
                if (var2 != null) {
                  StrongCacheEntry.field_y = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_spectate", (byte) -45);
                if (null != var2) {
                  CameraFollowTarget.field_b = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_playing", (byte) -45);
                if (null != var2) {
                  ArrayWidgetContainer.field_x = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_join", (byte) -45);
                if (null != var2) {
                  qn.field_pb = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_private", (byte) -45);
                if (null != var2) {
                  DropdownList.field_C = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("status_full", (byte) -45);
                if (null != var2) {
                  lo.field_z = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("players_in_game", (byte) -45);
                if (null != var2) {
                  ad.field_a = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_are_invited_to_xs_game", (byte) -45);
                if (var2 != null) {
                  CanvasRasterBuffer.field_i = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("asking_to_join_xs_game", (byte) -45);
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_f = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("who_can_join", (byte) -45);
                if (null != var2) {
                  field_a = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_can_join", (byte) -45);
                if (null != var2) {
                  qo.field_g = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_can_ask_to_join", (byte) -45);
                if (var2 != null) {
                  fi.field_g = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_cannot_join_in_progress", (byte) -45);
                if (var2 != null) {
                  pc.field_c = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_can_spectate", (byte) -45);
                if (var2 != null) {
                  sk.field_d = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("you_can_not_spectate", (byte) -45);
                if (null != var2) {
                  bh.field_d = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("spectate_xs_game", (byte) -45);
                if (var2 != null) {
                  LinkButtonPainter.field_i = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("hide_players_in_xs_game", (byte) -45);
                if (null != var2) {
                  LoadingTracker.field_o = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("show_players_in_xs_game", (byte) -45);
                if (null != var2) {
                  FixedViewResizeListener.field_f = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("connecting_to_friend_server_twoline", (byte) -45);
                if (var2 != null) {
                  BattleScreen.field_db = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading", (byte) -45);
                if (null != var2) {
                  JaggrabDownloader.field_l = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("offline", (byte) -45);
                if (var2 != null) {
                  nk.field_o = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("multiconst_invite_only", (byte) -45);
                if (var2 != null) {
                  wm.field_F = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("multiconst_clan", (byte) -45);
                if (var2 != null) {
                  PlayerActionMenu.field_a = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("multiconst_friends", (byte) -45);
                if (var2 != null) {
                  um.field_d = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("multiconst_similar_rating", (byte) -45);
                if (var2 != null) {
                  NanoFrameClock.field_m = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("multiconst_open", (byte) -45);
                if (null != var2) {
                  MusicCrossfadeStream.field_C = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("no_options_available", (byte) -45);
                if (var2 != null) {
                  db.field_c = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("reportabuse", (byte) -45);
                if (var2 != null) {
                  qn.field_nb = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("presstabtochat", (byte) -45);
                if (null != var2) {
                  aj.field_i = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("pressf10toquickchat", (byte) -45);
                if (null != var2) {
                  ra.field_l = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("dob_chatdisabled", (byte) -45);
                if (null != var2) {
                  rk.field_N = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("dob_enterforchat", (byte) -45);
                if (null != var2) {
                  sm.field_b = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("tab_hidechattemporarily", (byte) -45);
                if (null != var2) {
                  fe.field_k = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("esc_cancelprivatemessage", (byte) -45);
                if (var2 != null) {
                  CanvasRasterBuffer.field_b = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("esc_cancelthisline", (byte) -45);
                if (var2 != null) {
                  um.field_e = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("privatequickchat_from_x", (byte) -45);
                if (null != var2) {
                  IterableNodeHashTable.field_f = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("privatequickchat_to_x", (byte) -45);
                if (var2 != null) {
                  ge.field_n = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("privatechat_blankarea_explanation", (byte) -45);
                if (var2 != null) {
                  tn.field_Db = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("publicchat_unavailable_ratedgame", (byte) -45);
                if (var2 != null) {
                  fn.field_i = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("privatechat_friend_offline", (byte) -45);
                if (var2 != null) {
                  QuickChatCategory.field_m = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("privatechat_friend_notlisted", (byte) -45);
                if (var2 != null) {
                  qc.field_b = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("chatviewscrolledup", (byte) -45);
                if (null != var2) {
                  oa.field_a = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("thisisrunescapeclan", (byte) -45);
                if (null != var2) {
                  UiTheme.field_m = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("thisisrunescapeclan_notowner", (byte) -45);
                if (var2 != null) {
                  ed.field_tb = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("runescapeclan", (byte) -45);
                if (var2 != null) {
                  IntKeyLookup.field_c = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("rated_membersonly", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_membersonly", (byte) -45);
                if (var2 != null) {
                  ff.field_g = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_1moreratedgame", (byte) -45);
                if (var2 != null) {
                  ta.field_a = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_moreratedgames", (byte) -45);
                if (null != var2) {
                  wa.field_Db = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_needrating", (byte) -45);
                if (null != var2) {
                  MembershipOfferScreen.field_m = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_unratedonly", (byte) -45);
                if (var2 != null) {
                  ArrayWidgetContainer.field_D = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_notunlocked", (byte) -45);
                if (null != var2) {
                  KeyboardInputHandler.field_a = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_cannotbecombined1", (byte) -45);
                if (var2 != null) {
                  gf.field_jb = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_cannotbecombined2", (byte) -45);
                if (var2 != null) {
                  ContentTransitionDialog.field_qb = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playernotmember", (byte) -45);
                if (var2 != null) {
                  UiComponent.field_p = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_younotmember", (byte) -45);
                if (var2 != null) {
                  NumericDateInputWidget.field_P = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playerneedsrating", (byte) -45);
                if (var2 != null) {
                  um.field_c = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_youneedrating", (byte) -45);
                if (var2 != null) {
                  SceneWidgetNode.field_n = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playerneedsratedgames", (byte) -45);
                if (null != var2) {
                  IndexedSpriteState.field_b = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_youneedratedgames", (byte) -45);
                if (var2 != null) {
                  UiContainer.field_A = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playerneeds1ratedgame", (byte) -45);
                if (var2 != null) {
                  nm.field_g = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_youneed1ratedgame", (byte) -45);
                if (null != var2) {
                  kj.field_a = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playerhasntunlocked", (byte) -45);
                if (null != var2) {
                  nm.field_a = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_youhaventunlocked", (byte) -45);
                if (null != var2) {
                  SocialListEntry.field_Rb = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_trychanging1", (byte) -45);
                if (null != var2) {
                  MeshModel.field_t = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_trychanging2", (byte) -45);
                if (var2 != null) {
                  ie.field_Ub = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_needchanging1", (byte) -45);
                if (null != var2) {
                  NumericDateInputWidget.field_I = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_needchanging2", (byte) -45);
                if (null != var2) {
                  LoginCredentials.field_d = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_mightchange", (byte) -45);
                if (var2 != null) {
                  ArchiveProvider.field_c = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = MusicPatch.loadNamedFile("gameopt_playersdontqualify", (byte) -45);
                if (var2 != null) {
                  DiskCacheRequest.field_G = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_playersdontqualify_selectgametab", (byte) -45);
                if (null != var2) {
                  DropTargetWidget.field_O = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_unselectedoptions", (byte) -45);
                if (var2 != null) {
                  hd.field_c = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_pleaseselectoption1", (byte) -45);
                if (null != var2) {
                  fo.field_b = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_pleaseselectoption2", (byte) -45);
                if (null != var2) {
                  rf.field_g = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_badnumplayers", (byte) -45);
                if (var2 != null) {
                  field_i = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_inviteplayers_or_trychanging1", (byte) -45);
                if (var2 != null) {
                  hb.field_Hb = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_inviteplayers_or_trychanging2", (byte) -45);
                if (null != var2) {
                  oj.field_d = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_novalidcombos", (byte) -45);
                if (null != var2) {
                  nm.field_f = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameopt_pleasetrychanging", (byte) -45);
                if (null != var2) {
                  IconButtonPainter.field_s = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_title", (byte) -45);
                if (var2 != null) {
                  qj.field_e = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_mutethisplayer", (byte) -45);
                if (var2 != null) {
                  no.field_wb = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_suggestmute", (byte) -45);
                if (null != var2) {
                  TextLine.field_a = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_intro", (byte) -45);
                if (null != var2) {
                  da.field_e = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_intro_no_name", (byte) -45);
                if (null != var2) {
                  mn.field_x = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("ra_explanation", (byte) -45);
                if (var2 != null) {
                  rf.field_q = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_pillar_0", (byte) -45);
                if (null != var2) {
                  ri.field_e = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_0", (byte) -45);
                if (var2 != null) {
                  lf.field_h = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_1", (byte) -45);
                if (null != var2) {
                  DiskCacheWorker.field_c = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_2", (byte) -45);
                if (null != var2) {
                  aa.field_i = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_3", (byte) -45);
                if (var2 != null) {
                  SpriteState.field_r = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_4", (byte) -45);
                if (null != var2) {
                  gg.field_d = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_0_5", (byte) -45);
                if (null != var2) {
                  cc.field_c = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_pillar_1", (byte) -45);
                if (var2 != null) {
                  Bzip2State.field_s = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_1_0", (byte) -45);
                if (var2 != null) {
                  OptionsDialog.field_sb = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_1_1", (byte) -45);
                if (var2 != null) {
                  MenuScreen.field_e = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_1_2", (byte) -45);
                if (var2 != null) {
                  ModalPanelStack.field_E = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_1_3", (byte) -45);
                if (null != var2) {
                  ArchiveRequest.field_r = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_1_4", (byte) -45);
                if (null != var2) {
                  ByteStorage.field_b = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_pillar_2", (byte) -45);
                if (var2 != null) {
                  ed.field_Db = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_2_0", (byte) -45);
                if (null != var2) {
                  DirectByteStorage.field_g = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_2_1", (byte) -45);
                if (var2 != null) {
                  ja.field_w = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("rule_2_2", (byte) -45);
                if (null != var2) {
                  sa.field_Gb = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("createafreeaccount", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("cancel", (byte) -45);
                if (null != var2) {
                  sa.field_Eb = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleaselogintoplay", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleaselogin", (byte) -45);
                if (null != var2) {
                  GameApplet.field_o = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleaselogin_member", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("invaliduserorpass", (byte) -45);
                if (null != var2) {
                  Bzip2State.field_v = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleasetryagain", (byte) -45);
                if (null != var2) {
                  CheckboxPainter.field_n = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleasereenterpass", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("playfreeversion", (byte) -45);
                if (null != var2) {
                  ad.field_e = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("reloadgame", (byte) -45);
                if (var2 != null) {
                  DebouncedValidator.field_f = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("toserverlist", (byte) -45);
                if (null != var2) {
                  LoginCredentials.field_b = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("tocustomersupport", (byte) -45);
                if (var2 != null) {
                  DiskCacheRequest.field_B = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("changedisplayname", (byte) -45);
                if (null != var2) {
                  fk.field_j = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntohomepage", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("justplay", (byte) -45);
                if (null != var2) {
                  LoadingTracker.field_n = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("justplay_excl", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("login", (byte) -45);
                if (var2 != null) {
                  ChatInputWidget.field_Qb = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("goback", (byte) -45);
                if (null != var2) {
                  OptionsDialog.field_rb = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("otheroptions", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("proceed", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("connectingtoserver", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleasewait", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("logging_in", (byte) -45);
                if (var2 != null) {
                  bj.field_qb = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("backtoerror", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleasecheckinternet", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("attemptingtoreconnect", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("connectionlost_reconnecting", (byte) -45);
                if (null != var2) {
                  fi.field_a = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("connectionlost_withreason", (byte) -45);
                if (null != var2) {
                  wa.field_Eb = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("passwordverificationrequired", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("invalidpass", (byte) -45);
                if (null != var2) {
                  nj.field_f = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("retry", (byte) -45);
                if (null != var2) {
                  sk.field_b = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("back", (byte) -45);
                if (var2 != null) {
                  ae.field_b = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("exitfullscreenmode", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("quittowebsite", (byte) -45);
                if (var2 != null) {
                  ki.field_u = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("connectionrestored", (byte) -45);
                if (null != var2) {
                  Bzip2State.field_k = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("warning_ifyouquit", (byte) -45);
                if (var2 != null) {
                  fo.field_e = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("warning_ifyouquitorleavepage", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("resubscribe_withoutlosing_fs", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("resubscribe_withoutlosing", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("customersupport_withoutlosing_fs", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("customersupport_withoutlosing", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("js5help_withoutlosing_fs", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("js5help_withoutlosing", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("checkinternet_withoutlosing_fs", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("checkinternet_withoutlosing", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_intro", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_sameaccounttip_unnamed", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("dateofbirthprompt", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("fetchingcountrylist", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("countryprompt", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("countrylisterror", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("theonlypersonalquestions", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_submittingdata", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("check", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_pleasechooseausername", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_usernameblurb", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("checkingavailability", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("checking", (byte) -45);
                if (var2 != null) {
                  DiskCacheRequest.field_D = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_namealreadytaken", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_sameaccounttip_named", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_nosuggestions", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alternativelygoback", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_available", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_willnowshowtermsandconditions", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("fetchingterms", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("termserror", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_iagree", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_idisagree", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_pleasescrolldowntoaccept", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_linkaddress", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("openinpopupwindow", (byte) -45);
                if (var2 != null) {
                  MenuButtonPainter.field_s = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("create", (byte) -45);
                if (var2 != null) {
                  wm.field_G = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_pleasechooseapassword", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_passwordblurb", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_nevergivepassword", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("creatingyouraccount", (byte) -45);
                if (null != var2) {
                  qe.field_l = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_youmustaccept", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_passwordsdifferent", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_success", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("day", (byte) -45);
                if (null != var2) {
                  PlayerActionMenu.field_f = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("month", (byte) -45);
                if (null != var2) {
                  GameApplet.field_y = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("year", (byte) -45);
                if (var2 != null) {
                  LoadingTracker.field_g = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,0", (byte) -45);
                if (var2 != null) {
                  rb.field_p[0] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,1", (byte) -45);
                if (var2 != null) {
                  rb.field_p[1] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,2", (byte) -45);
                if (null != var2) {
                  rb.field_p[2] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,3", (byte) -45);
                if (null != var2) {
                  rb.field_p[3] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,4", (byte) -45);
                if (var2 != null) {
                  rb.field_p[4] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,5", (byte) -45);
                if (var2 != null) {
                  rb.field_p[5] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,6", (byte) -45);
                if (null != var2) {
                  rb.field_p[6] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,7", (byte) -45);
                if (var2 != null) {
                  rb.field_p[7] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,8", (byte) -45);
                if (var2 != null) {
                  rb.field_p[8] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,9", (byte) -45);
                if (var2 != null) {
                  rb.field_p[9] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,10", (byte) -45);
                if (null != var2) {
                  rb.field_p[10] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("monthnames,11", (byte) -45);
                if (var2 != null) {
                  rb.field_p[11] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_welcome", (byte) -45);
                if (var2 != null) {
                  qe.field_j = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13_welcome", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_createanaccount", (byte) -45);
                if (var2 != null) {
                  BevelTextPainter.field_t = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_username", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_displayname", (byte) -45);
                if (null != var2) {
                  CredentialKind.field_h = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_password", (byte) -45);
                if (null != var2) {
                  ValidationState.field_a = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_password_confirm", (byte) -45);
                if (var2 != null) {
                  BattleScreen.field_A = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_email", (byte) -45);
                if (var2 != null) {
                  Checkbox.field_K = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_email_confirm", (byte) -45);
                if (null != var2) {
                  SceneScrollPane.field_Gb = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_age", (byte) -45);
                if (null != var2) {
                  ProxySocketConnector.field_n = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13_email", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13_email_confirm", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_dob", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_country", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alternatives_header", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alternatives_select", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_suggestions", (byte) -45);
                if (var2 != null) {
                  KeyboardInputHandler.field_f = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_more_suggestions", (byte) -45);
                if (null != var2) {
                  pc.field_d = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_select_alternative", (byte) -45);
                if (null != var2) {
                  CheckboxPainter.field_q = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_optin_news", (byte) -45);
                if (null != var2) {
                  AudioService.field_c = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_agreeterms", (byte) -45);
                if (null != var2) {
                  fn.field_d = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13terms", (byte) -45);
                if (null != var2) {
                  GameApplet.field_r = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_username_email", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_b = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_username", (byte) -45);
                if (var2 != null) {
                  wh.field_b = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_email", (byte) -45);
                if (var2 != null) {
                  BirthDateEntryPanel.field_H = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_username_tooltip", (byte) -45);
                if (var2 != null) {
                  AccountRegistrationPanel.field_L = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_password_tooltip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_login_tooltip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_create_tooltip", (byte) -45);
                if (var2 != null) {
                  SceneTextInput.field_Bb = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_justplay_tooltip", (byte) -45);
                if (var2 != null) {
                  hj.field_c = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_back_tooltip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_no_displayname", (byte) -45);
                if (var2 != null) {
                  NumericDateInputWidget.field_H = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_username_tooltip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_username_hint", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_displayname_tooltip", (byte) -45);
                if (null != var2) {
                  ValidationState.field_b = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_displayname_hint", (byte) -45);
                if (null != var2) {
                  bj.field_kb = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_password_tooltip", (byte) -45);
                if (null != var2) {
                  ao.field_c = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_password_hint", (byte) -45);
                if (null != var2) {
                  WhirlpoolHasher.field_p = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_password_confirm_tooltip", (byte) -45);
                if (null != var2) {
                  nk.field_j = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_email_tooltip", (byte) -45);
                if (null != var2) {
                  ArchiveIndex.field_s = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_email_confirm_tooltip", (byte) -45);
                if (var2 != null) {
                  SceneScrollPane.field_Fb = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_age_tooltip", (byte) -45);
                if (null != var2) {
                  MenuScreen.field_k = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_optin_news_tooltip", (byte) -45);
                if (null != var2) {
                  ce.field_l = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13_email_tooltip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_u13_email_confirm_tooltip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_dob_tooltip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_country_tooltip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_optin_tooltip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_continue", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_username_unavailable", (byte) -45);
                if (null != var2) {
                  ec.field_e = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_username_available", (byte) -45);
                if (var2 != null) {
                  PacketBuffer.field_i = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_namelength", (byte) -45);
                if (null != var2) {
                  lm.field_c = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_namechars", (byte) -45);
                if (null != var2) {
                  mb.field_N = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_nameleadingspace", (byte) -45);
                if (var2 != null) {
                  GridContainer.field_H = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_doublespace", (byte) -45);
                if (null != var2) {
                  ff.field_e = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passchars", (byte) -45);
                if (var2 != null) {
                  cm.field_h = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passrepeated", (byte) -45);
                if (var2 != null) {
                  ko.field_g = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passlength", (byte) -45);
                if (var2 != null) {
                  KeyboardInputHandler.field_i = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passcontainsname", (byte) -45);
                if (var2 != null) {
                  TextTableInitializer.field_f = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passcontainsemail", (byte) -45);
                if (null != var2) {
                  wj.field_c = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_passcontainsname_partial", (byte) -45);
                if (var2 != null) {
                  cj.field_e = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_checkname", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_invalidemail", (byte) -45);
                if (null != var2) {
                  gl.field_f = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_email_unavailable", (byte) -45);
                if (null != var2) {
                  oj.field_b = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_invaliddate", (byte) -45);
                if (null != var2) {
                  gl.field_d = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_invalidage", (byte) -45);
                if (null != var2) {
                  gf.field_V = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_yearrange", (byte) -45);
                if (var2 != null) {
                  af.field_Kb = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_alert_mismatch", (byte) -45);
                if (null != var2) {
                  lf.field_i = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_passwordvalid", (byte) -45);
                if (var2 != null) {
                  MusicPatchPcmStream.field_r = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_emailvalid", (byte) -45);
                if (var2 != null) {
                  StrongCacheEntry.field_v = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("create_account_success", (byte) -45);
                if (var2 != null) {
                  aa.field_h = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("invalid_name", (byte) -45);
                if (var2 != null) {
                  fn.field_h = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("cannot_add_yourself", (byte) -45);
                if (null != var2) {
                  BufferedRandomAccessFile.field_l = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_add_friend", (byte) -45);
                if (null != var2) {
                  nm.field_e = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_add_ignore", (byte) -45);
                if (var2 != null) {
                  FadingModalPanel.field_K = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_delete_friend", (byte) -45);
                if (var2 != null) {
                  QuickChatCategory.field_E = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("unable_to_delete_ignore", (byte) -45);
                if (null != var2) {
                  rk.field_L = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("friendlistfull", (byte) -45);
                if (var2 != null) {
                  TextTableInitializer.field_e = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("friendlistdupe", (byte) -45);
                if (var2 != null) {
                  gj.field_e = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("friendnotfound", (byte) -45);
                if (var2 != null) {
                  FixedViewResizeListener.field_c = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("ignorelistfull", (byte) -45);
                if (null != var2) {
                  StrongCacheEntry.field_u = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("ignorelistdupe", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.field_bb = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("ignorenotfound", (byte) -45);
                if (null != var2) {
                  BufferedSocket.field_f = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("removeignorefirst", (byte) -45);
                if (var2 != null) {
                  r.field_a = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("removefriendfirst", (byte) -45);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_q = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("enterfriend_add", (byte) -45);
                if (null != var2) {
                  NameValidator.field_v = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("enterfriend_del", (byte) -45);
                if (var2 != null) {
                  af.field_Gb = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("enterignore_add", (byte) -45);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  SecondaryNodeDequeIterator.field_a = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("enterignore_del", (byte) -45);
                if (null != var2) {
                  ResizableViewResizeListener.field_i = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("text_removed_from_game", (byte) -45);
                if (null != var2) {
                  we.field_e = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("text_lobby_pleaselogin_free", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("opengl", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("sse", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("purejava", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_graphics", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.field_Z = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_models", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_fonts", (byte) -45);
                if (var2 != null) {
                  wh.field_a = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_soundeffects", (byte) -45);
                if (var2 != null) {
                  fn.field_a = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_music", (byte) -45);
                if (var2 != null) {
                  TextLayout.field_e = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_instruments", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_levels", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_extradata", (byte) -45);
                if (var2 != null) {
                  NodeHashTable.field_c = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_languages", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_textures", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("waitingfor_animations", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_graphics", (byte) -45);
                if (var2 != null) {
                  LoadingProgressDialog.field_nb = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_models", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_fonts", (byte) -45);
                if (null != var2) {
                  ra.field_d = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_soundeffects", (byte) -45);
                if (var2 != null) {
                  StatefulTextPainter.field_v = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_music", (byte) -45);
                if (var2 != null) {
                  ii.field_e = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_instruments", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_levels", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_extradata", (byte) -45);
                if (var2 != null) {
                  MenuButtonPainter.field_t = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_languages", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_textures", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("loading_animations", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_graphics", (byte) -45);
                if (null != var2) {
                  hi.field_c = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_models", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_soundeffects", (byte) -45);
                if (var2 != null) {
                  DisplayNameForm.field_N = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_music", (byte) -45);
                if (null != var2) {
                  FadingModalPanel.field_J = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_levels", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_languages", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_animations", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("unpacking_toolkit", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("instructions", (byte) -45);
                if (null != var2) {
                  he.field_b = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("tutorial", (byte) -45);
                if (var2 != null) {
                  nj.field_g = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("playtutorial", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("sound_colon", (byte) -45);
                if (null != var2) {
                  BufferedRandomAccessFile.field_g = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("music_colon", (byte) -45);
                if (var2 != null) {
                  th.field_i = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("fullscreen", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("screensize", (byte) -45);
                if (null != var2) {
                  mb.field_Z = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("highscores", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("rankings", (byte) -45);
                if (null != var2) {
                  da.field_a = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("achievements", (byte) -45);
                if (null != var2) {
                  he.field_g = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("achievementsthisgame", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("achievementsthissession", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("watchintroduction", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("quit", (byte) -45);
                if (var2 != null) {
                  tm.field_f = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("login_createaccount", (byte) -45);
                if (null != var2) {
                  ArcanistsMulti.field_H = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("tohighscores", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntomainmenu", (byte) -45);
                if (var2 != null) {
                  DropdownList.field_M = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntopausemenu", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntooptionsmenu_notpaused", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mainmenu", (byte) -45);
                if (null != var2) {
                  DraggableWidget.field_J = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("pausemenu", (byte) -45);
                if (var2 != null) {
                  ja.field_r = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("optionsmenu_notpaused", (byte) -45);
                if (null != var2) {
                  DropTargetWidget.field_I = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("menu", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("selectlevel", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("nextlevel", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("startgame", (byte) -45);
                if (null != var2) {
                  CacheEntry.field_m = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("newgame", (byte) -45);
                if (null != var2) {
                  ScrollContainer.field_K = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("resumegame", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("resumetutorial", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("skip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("skiptutorial", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("skipending", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("restartlevel", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("endtest", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("endgame", (byte) -45);
                if (var2 != null) {
                  ed.field_xb = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("endtutorial", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("ok", (byte) -45);
                if (null != var2) {
                  UsernameCredentials.field_f = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("on", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("off", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("previous", (byte) -45);
                if (null != var2) {
                  CipherPacketBuffer.field_q = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("prev", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("next", (byte) -45);
                if (null != var2) {
                  mn.field_w = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_colon", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("hotseatmultiplayer", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("entermultiplayerlobby", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("singleplayergame", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntogame", (byte) -45);
                if (null != var2) {
                  r.field_e = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("endgameresign", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("offerdraw", (byte) -45);
                if (null != var2) {
                  BirthDateEntryPanel.field_K = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("canceldraw", (byte) -45);
                if (null != var2) {
                  ClipState.field_s = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("acceptdraw", (byte) -45);
                if (null != var2) {
                  ContextActionMenu.field_Nb = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("resign", (byte) -45);
                if (null != var2) {
                  ResourceArchive.field_d = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("returntolobby", (byte) -45);
                if (null != var2) {
                  SecondaryNodeDeque.field_a = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("cont", (byte) -45);
                if (null != var2) {
                  qn.field_lb = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("continue_spectating", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("messages", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_fastest", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_medium", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_best", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_directx", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_opengl", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_java", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_quality_high", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_quality_low", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_mode", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_quality", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("mode", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = MusicPatch.loadNamedFile("quality", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("keys", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("objective", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("currentobjective", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("pressescforpausemenu", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("pressescforpausemenuortoskiptutorial", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("pressescforoptionsmenu_doesntpause", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("pressescforoptionsmenu_doesntpause_short", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("powerups", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("latestlevel_suffix", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_name", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_cannotplayreason", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_cannotplayreason_shorter", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedworld_cannotplayreason", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("memberslevel_name", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("memberslevel_cannotplayreason", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("membersworld_cannotplayreason", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_createtip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_createtip_line1", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_createtip_line2", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("unreachedlevel_logintip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = MusicPatch.loadNamedFile("memberslevel_logintip", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("displayname_none", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("levelxofy1", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("levelxofy2", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("levelxofy", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("ingame_level", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mouseoveranicon", (byte) -45);
                if (null != var2) {
                  qo.field_c = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("notyetachieved", (byte) -45);
                if (null != var2) {
                  AlternateUsernameCredentials.field_l = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("achieved", (byte) -45);
                if (var2 != null) {
                  rk.field_H = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("orbpoints", (byte) -45);
                if (var2 != null) {
                  lo.field_x = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("orbcoins", (byte) -45);
                if (var2 != null) {
                  FullscreenFocusCanvas.field_c = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("orbpoints_colon", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("orbcoins_colon", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("achieved_colon_description", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("secretachievement", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("no_highscores", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_name", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_level", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_fromlevel", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_tolevel", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_score", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_end", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("ingame_score", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("score_colon", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_leavegame", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_offerrematch", (byte) -45);
                if (null != var2) {
                  ra.field_n = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_offerrematch_unrated", (byte) -45);
                if (null != var2) {
                  IconTextSceneWidget.field_Bb = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_acceptrematch", (byte) -45);
                if (null != var2) {
                  IntrusiveNodeHashTable.field_g = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_acceptrematch_unrated", (byte) -45);
                if (var2 != null) {
                  ng.field_H = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_cancelrematch", (byte) -45);
                if (null != var2) {
                  ValidationState.field_d = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_cancelrematch_unrated", (byte) -45);
                if (var2 != null) {
                  vm.field_e = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_rematchnewgame", (byte) -45);
                if (null != var2) {
                  rb.field_m = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_rematchnewgame_unrated", (byte) -45);
                if (null != var2) {
                  MenuInputState.field_b = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_wantstodraw", (byte) -45);
                if (null != var2) {
                  ph.field_d = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_offersrematch", (byte) -45);
                if (null != var2) {
                  CachedArchiveProvider.field_y = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_offersrematch_unrated", (byte) -45);
                if (var2 != null) {
                  pb.field_i = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youofferrematch", (byte) -45);
                if (null != var2) {
                  FadingModalPanel.field_R = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youofferrematch_unrated", (byte) -45);
                if (null != var2) {
                  ValidationStatusIcon.field_K = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youofferdraw", (byte) -45);
                if (null != var2) {
                  CacheEntry.field_t = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youresigned", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youresigned_rematch", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_hasresignedandleft", (byte) -45);
                if (null != var2) {
                  qc.field_g = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_hasresigned_rematch", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_hasresigned", (byte) -45);
                if (var2 != null) {
                  MenuScreen.field_a = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_hasleft", (byte) -45);
                if (var2 != null) {
                  BirthDateEntryPanel.field_Q = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_haswon", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_youhavewon", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_gamedrawn", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_timeremaining", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_x_turn", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_yourturn", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("gameover", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_hidechat", (byte) -45);
                if (null != var2) {
                  WhirlpoolHasher.field_a = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_showchat_nounread", (byte) -45);
                if (var2 != null) {
                  bm.field_b = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_showchat_unread1", (byte) -45);
                if (null != var2) {
                  ConnectionState.field_a = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("mp_showchat_unread2", (byte) -45);
                if (var2 != null) {
                  WeightedLruCache.field_d = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("click_to_quickchat", (byte) -45);
                if (null != var2) {
                  sb.field_b = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("autorespond", (byte) -45);
                if (null != var2) {
                  MidiPcmStream.field_O = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_help", (byte) -45);
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_j = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_help_title", (byte) -45);
                if (var2 != null) {
                  NameSuggestionsPanel.field_H = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,0", (byte) -45);
                if (var2 != null) {
                  MenuButtonPanel.field_L[0] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,1", (byte) -45);
                if (var2 != null) {
                  MenuButtonPanel.field_L[1] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,2", (byte) -45);
                if (null != var2) {
                  MenuButtonPanel.field_L[2] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,3", (byte) -45);
                if (var2 != null) {
                  MenuButtonPanel.field_L[3] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,4", (byte) -45);
                if (var2 != null) {
                  MenuButtonPanel.field_L[4] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_help,5", (byte) -45);
                if (var2 != null) {
                  MenuButtonPanel.field_L[5] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,0", (byte) -45);
                if (null != var2) {
                  no.field_vb[0] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,1", (byte) -45);
                if (var2 != null) {
                  no.field_vb[1] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,2", (byte) -45);
                if (null != var2) {
                  no.field_vb[2] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,3", (byte) -45);
                if (null != var2) {
                  no.field_vb[3] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,4", (byte) -45);
                if (null != var2) {
                  no.field_vb[4] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = MusicPatch.loadNamedFile("quickchat_shortcut_keys,5", (byte) -45);
                if (var2 != null) {
                  no.field_vb[5] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("keychar_the_character_under_questionmark", (byte) -45);
                if (var2 != null) {
                  DraggableWidget.field_E = hm.decodeCp1252Char(var2[0], 46);
                }
                var2 = MusicPatch.loadNamedFile("rating_noratings", (byte) -45);
                if (null != var2) {
                  WhirlpoolHasher.field_d = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_rating", (byte) -45);
                if (null != var2) {
                  FixedViewResizeListener.field_d = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_played", (byte) -45);
                if (null != var2) {
                  TextHotspotWidget.field_H = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_won", (byte) -45);
                if (null != var2) {
                  QuickChatCategory.field_o = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_lost", (byte) -45);
                if (null != var2) {
                  fc.field_d = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_drawn", (byte) -45);
                if (var2 != null) {
                  ScrollContainer.field_N = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("benefits_fullscreen", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("benefits_noadverts", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = MusicPatch.loadNamedFile("benefits_price", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("members_expansion_benefits,0", (byte) -45);
                if (var2 != null) {
                  Battle.field_qb[0] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("members_expansion_benefits,1", (byte) -45);
                if (var2 != null) {
                  Battle.field_qb[1] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("members_expansion_benefits,2", (byte) -45);
                if (var2 != null) {
                  Battle.field_qb[2] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("members_expansion_price_top", (byte) -45);
                if (var2 != null) {
                  WidgetStyleLayer.field_l = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = MusicPatch.loadNamedFile("members_expansion_price_bottom", (byte) -45);
                if (null != var2) {
                  ph.field_b = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_lost_seq,0", (byte) -45);
                if (var2 != null) {
                  QuickChatCategory.field_v[0] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_lost_seq,1", (byte) -45);
                if (null != var2) {
                  QuickChatCategory.field_v[1] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_lost_seq,2", (byte) -45);
                if (var2 != null) {
                  QuickChatCategory.field_v[2] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_lost_seq,3", (byte) -45);
                if (var2 != null) {
                  QuickChatCategory.field_v[3] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_lost", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_restored", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_please_check", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_wait", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_retry", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_resume", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_or", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_exitfs", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_exitfs_quit", (byte) -45);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_quit", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_check_fs", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("reconnect_check_nonfs", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_accept_beforeaccept", (byte) -45);
                if (var2 != null) {
                  PasswordFieldPainter.field_C = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_button_accept", (byte) -45);
                if (var2 != null) {
                  AccountRegistrationPanel.field_R = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_accept_afteraccept", (byte) -45);
                if (null != var2) {
                  NameSuggestionsPanel.field_G = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_button_cancel", (byte) -45);
                if (null != var2) {
                  ki.field_t = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_accept_aftercancel", (byte) -45);
                if (null != var2) {
                  we.field_d = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_accept_countdown_sing", (byte) -45);
                if (var2 != null) {
                  dm.field_F = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_accept_countdown_pl", (byte) -45);
                if (null != var2) {
                  bo.field_b = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_nonmember", (byte) -45);
                if (var2 != null) {
                  IntrusiveDequeCursor.field_d = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_button_close", (byte) -45);
                if (null != var2) {
                  dd.field_e = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_button_members", (byte) -45);
                if (var2 != null) {
                  la.field_e = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_unavailable", (byte) -45);
                if (var2 != null) {
                  of.field_l = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_unavailable_try_signed_applet", (byte) -45);
                if (null != var2) {
                  DirectByteStorage.field_j = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_focus", (byte) -45);
                if (null != var2) {
                  ki.field_w = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_focus_or_resolution", (byte) -45);
                if (var2 != null) {
                  CredentialKind.field_f = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_timeout", (byte) -45);
                if (var2 != null) {
                  fl.field_d = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("fs_button_tryagain", (byte) -45);
                if (null != var2) {
                  ScrollContainer.field_R = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_ui_fs_countdown", (byte) -45);
                if (null != var2) {
                  ClientException.field_f = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_caption_title", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_including_gamename", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_full_access_1", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_full_access_2", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_achievement_count_1", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_achievement_count_2", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_exclusive_1", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("mb_exclusive_2", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("me_extra_benefits", (byte) -45);
                if (var2 != null) {
                  MenuButtonPainter.field_r = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_friend_tip", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_friend_tip_multi", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_mode_name,0", (byte) -45);
                if (null != var2) {
                  lh.field_e[0] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_mode_name,1", (byte) -45);
                if (null != var2) {
                  lh.field_e[1] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("hs_mode_name,2", (byte) -45);
                if (null != var2) {
                  lh.field_e[2] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_mode_name,0", (byte) -45);
                if (null != var2) {
                  ValidationStatusIcon.field_P[0] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_mode_name,1", (byte) -45);
                if (null != var2) {
                  ValidationStatusIcon.field_P[1] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_mode_long_name,0", (byte) -45);
                if (var2 != null) {
                  WrappedTextLayout.field_t[0] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("rating_mode_long_name,1", (byte) -45);
                if (null != var2) {
                  WrappedTextLayout.field_t[1] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_fixed_size", (byte) -45);
                if (var2 != null) {
                  ci.field_b = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_resizable", (byte) -45);
                if (var2 != null) {
                  fo.field_f = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_fullscreen", (byte) -45);
                if (null != var2) {
                  oj.field_g = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_done", (byte) -45);
                if (null != var2) {
                  lm.field_a = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_apply", (byte) -45);
                if (null != var2) {
                  hj.field_e = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_title", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_instruction", (byte) -45);
                if (null != var2) {
                  field_b = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("graphics_config_need_memory", (byte) -45);
                if (var2 != null) {
                  tm.field_c = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("pleasewait_dotdotdot", (byte) -45);
                if (var2 != null) {
                  PatchEnvelopeSet.field_f = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("serviceunavailable", (byte) -45);
                if (var2 != null) {
                  rk.field_R = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = MusicPatch.loadNamedFile("createtouse", (byte) -45);
                if (var2 != null) {
                  FrameClock.field_c = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                if (param0 != -84) {
                  finished = true; return;
                }
                var2 = MusicPatch.loadNamedFile("achievementsoffline", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = MusicPatch.loadNamedFile("warning", (byte) -45);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("DEFAULT_PLAYER_NAME", (byte) -45);
                if (var2 != null) {
                  ResizableModalPanel.field_ib = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin1", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,1", (byte) -45);
                if (null != var2) {
                  ff.field_f[1] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,2", (byte) -45);
                if (var2 != null) {
                  ff.field_f[2] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,3", (byte) -45);
                if (null != var2) {
                  ff.field_f[3] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,4", (byte) -45);
                if (var2 != null) {
                  ff.field_f[4] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,5", (byte) -45);
                if (null != var2) {
                  ff.field_f[5] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,6", (byte) -45);
                if (var2 != null) {
                  ff.field_f[6] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin2,7", (byte) -45);
                if (null != var2) {
                  ff.field_f[7] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,1", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[1] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,2", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[2] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,3", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[3] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,4", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[4] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,5", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[5] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,6", (byte) -45);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c[6] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin3,7", (byte) -45);
                if (var2 != null) {
                  BoundedRandomAccessFile.field_c[7] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("discard", (byte) -45);
                if (var2 != null) {
                  lh.field_a = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,1", (byte) -45);
                if (null != var2) {
                  md.field_a[1] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,2", (byte) -45);
                if (null != var2) {
                  md.field_a[2] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,3", (byte) -45);
                if (null != var2) {
                  md.field_a[3] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,4", (byte) -45);
                if (null != var2) {
                  md.field_a[4] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,5", (byte) -45);
                if (null != var2) {
                  md.field_a[5] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,6", (byte) -45);
                if (null != var2) {
                  md.field_a[6] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin4,7", (byte) -45);
                if (var2 != null) {
                  md.field_a[7] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_notloggedin", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,1", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[1] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,2", (byte) -45);
                if (var2 != null) {
                  GrowableIntList.field_g[2] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,3", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[3] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,4", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[4] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,5", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[5] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,6", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[6] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = MusicPatch.loadNamedFile("mustlogin_alternate,7", (byte) -45);
                if (null != var2) {
                  GrowableIntList.field_g[7] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,0", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[0] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,1", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[1] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,2", (byte) -45);
                if (null != var2) {
                  Js5ArchiveManager.field_f[2] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,3", (byte) -45);
                if (null != var2) {
                  Js5ArchiveManager.field_f[3] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,4", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[4] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,5", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[5] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,6", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[6] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,7", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[7] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,8", (byte) -45);
                if (null != var2) {
                  Js5ArchiveManager.field_f[8] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,9", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[9] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,10", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[10] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,11", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[11] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = MusicPatch.loadNamedFile("subscription_cost_monthly,12", (byte) -45);
                if (var2 != null) {
                  Js5ArchiveManager.field_f[12] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = MusicPatch.loadNamedFile("sentence_separator", (byte) -45);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                AlternateUsernameCredentials.field_q = null;
            }
            void run() {
                var3 = ArcanistsMulti.field_G ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2624_0 = (RuntimeException) (var2_ref);
                  stackIn_2624_1 = new StringBuilder().append("on.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2625_2 = "null";
                  } else {
                    stackIn_2625_2 = "{...}";
                  }
                  throw aa.wrapException((Throwable) ((Object) stackIn_2624_0), ((StringBuilder) (Object) stackIn_2624_1).append(stackIn_2625_2).append(')').toString());
                }
                if (GameAppletShell.field_b != 0) {
                  ArcanistsMulti.field_G = (var3 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_g = -1;
        field_a = "Who can join";
        field_i = "You do not have a suitable number of players for the current options.";
        field_b = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
