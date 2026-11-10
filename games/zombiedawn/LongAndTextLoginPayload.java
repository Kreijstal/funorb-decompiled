/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LongAndTextLoginPayload extends LoginCredentials {
    static int[] field_c;
    private long field_e;
    static int[] field_b;
    static int field_i;
    static long[][] field_h;
    static long[] field_g;
    static boolean field_f;
    private String field_d;

    public static void releaseStatics(int param0) {
        try {
          field_b = null;
          field_h = (long[][]) null;
          field_g = null;
          field_c = null;
          if (param0 != 5) {
            field_c = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "bn.J(" + param0 + ')');
        }
    }

    final static boolean compareDisplayModes(byte param0, FullscreenExitHelpers param1, FullscreenExitHelpers param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.field_a < param1.field_a) {
            return true;
          }
          if (param2.field_a == param1.field_a &&
            param2.field_d < param1.field_d) {
            return true;
          }
          if (param0 <= 81) {
            LongAndTextLoginPayload.releaseStatics(48);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("bn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void loadTextTable(int param0, Js5Archive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2595_0;
            StringBuilder stackIn_2595_1;
            String stackIn_2596_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int param0;
            Js5Archive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, Js5Archive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2595_0 = null;
                this.stackIn_2595_1 = null;
                this.stackIn_2596_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                EditableTextWidget.field_K = param1;
                var2 = RandomAccessCacheFile.getLoadingTextFile("loginm3", 0);
                if (null != var2) {
                  NodeHashTable.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loginm2", 0);
                if (null != var2) {
                  GrowableIntList.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loginm1", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("idlemessage20min", 0);
                if (var2 != null) {
                  AbstractSprite.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("error_js5crc", 0);
                if (null != var2) {
                  ByteStorage.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("error_js5io", 0);
                if (var2 != null) {
                  AreaSelectionScreen.field_o = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("error_js5connect_full", 0);
                if (var2 != null) {
                  TextLayoutLine.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("error_js5connect", 0);
                if (var2 != null) {
                  LoginPanel.field_T = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_gameupdated", 0);
                if (null != var2) {
                  MenuFontGlobals.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_unable", 0);
                if (var2 != null) {
                  Camera.field_z = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_ineligible", 0);
                if (var2 != null) {
                  CheckboxWidget.field_E = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("usernameprompt", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("passwordprompt", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("andagainprompt", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_read", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_ignore", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_oneunread", 0);
                if (var2 != null) {
                  ResizableDialog.field_M = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_xunread", 0);
                if (var2 != null) {
                  NameSuggestionsPanel.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_gotowebsite", 0);
                if (null != var2) {
                  IntrusiveNode.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ticketing_waitingformessages", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_on", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_friends", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_off", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_lobby", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_public", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_ignore", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_tips", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_private", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_entered_game", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_joined_your_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_entered_other_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_left_lobby", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_lost_con", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_cannot_join_full", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_cannot_join_inprogress", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_declined_invite", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_withdrew_request", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_removed", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_x_dropped_out", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_entered_other_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_game_is_full", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_game_has_started", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_you_declined_invite", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_invite_withdrawn", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_request_declined", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_request_withdrawn", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_all_players_have_left", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_name", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_rating", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_friend_add", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_friend_rm", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_name_add", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_name_rm", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_lobby_location", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_all_games", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_status", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_owner", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_players", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_avg_rating", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_options", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gamelist_elapsed_time", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_play_rated", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_create_unrated", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options_whocanjoin", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options_players", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options_dontmind", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options_allow_spectate", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_options_ratedgametype", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("yes", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("no", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_invite_players", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("close", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("add_x_to_friends", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("add_x_to_ignore", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rm_x_from_friends", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rm_x_from_ignore", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("send_pm_to_x", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("send_qc_to_x", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("send_pm", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invite_accept_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invite_decline_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("join_xs_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("join_request_xs_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("join_withdraw_request_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gameopt_kick_x_from_this_game", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gameopt_withdraw_invite_to_x", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gameopt_accept_x_into_game", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gameopt_reject_x_from_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_gameopt_invite_x_to_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("report_x_for_abuse", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_send_message_password_a", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_send_message_password_b", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_lobby_show_all", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_lobby_friends_only", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_lobby_friends", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_lobby_hide", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_game_show_all", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_game_friends_only", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_game_friends", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_game_hide", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_pm_show_all", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_pm_friends_only", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_pm_friends", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mu_chat_invisible_and_silent_mode", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_have_been_removed_from_xs_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("your_rating_is_x", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_are_on_x_server", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rated_game", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unrated_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rated_game_tips", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("searching_for_opponent_singular", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("searching_for_opponents_plural", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("find_opponent_singular", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("find_opponents_plural", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rated_game_tips_setup_singular", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rated_game_tips_setup_plural", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waiting_to_start_hint", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("your_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("game_full", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("join_requests_one", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("join_requests_many", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("xs_game", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waiting_for_x_to_start_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("game_options_changed", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("players_x_of_y", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("message_lobby", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_lobby", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("message_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("message_team", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("kick", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("inviting_x", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("x_wants_to_join", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("accept", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reject", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invite", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_concluded", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_spectate", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_playing", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_join", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_private", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("status_full", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("players_in_game", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_are_invited_to_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("asking_to_join_xs_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("who_can_join", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_can_join", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_can_ask_to_join", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_cannot_join_in_progress", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_can_spectate", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("you_can_not_spectate", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("spectate_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hide_players_in_xs_game", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("show_players_in_xs_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("connecting_to_friend_server_twoline", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading", 0);
                if (var2 != null) {
                  NameAvailabilityValidator.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("offline", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("multiconst_invite_only", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("multiconst_clan", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("multiconst_friends", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("multiconst_similar_rating", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("multiconst_open", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("no_options_available", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reportabuse", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("presstabtochat", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pressf10toquickchat", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("dob_chatdisabled", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("dob_enterforchat", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("tab_hidechattemporarily", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("esc_cancelprivatemessage", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("esc_cancelthisline", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("privatequickchat_from_x", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("privatequickchat_to_x", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("privatechat_blankarea_explanation", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("publicchat_unavailable_ratedgame", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("privatechat_friend_offline", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("privatechat_friend_notlisted", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("chatviewscrolledup", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("thisisrunescapeclan", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("thisisrunescapeclan_notowner", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("runescapeclan", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rated_membersonly", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_membersonly", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_1moreratedgame", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_moreratedgames", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_needrating", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_unratedonly", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_notunlocked", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_cannotbecombined1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_cannotbecombined2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playernotmember", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_younotmember", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playerneedsrating", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_youneedrating", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playerneedsratedgames", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_youneedratedgames", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playerneeds1ratedgame", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_youneed1ratedgame", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playerhasntunlocked", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_youhaventunlocked", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_trychanging1", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_trychanging2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_needchanging1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_needchanging2", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_mightchange", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playersdontqualify", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_playersdontqualify_selectgametab", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_unselectedoptions", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_pleaseselectoption1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_pleaseselectoption2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_badnumplayers", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_inviteplayers_or_trychanging1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_inviteplayers_or_trychanging2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_novalidcombos", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameopt_pleasetrychanging", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_title", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_mutethisplayer", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_suggestmute", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_intro", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_intro_no_name", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ra_explanation", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_pillar_0", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_0", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_1", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_2", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_3", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_4", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_0_5", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_pillar_1", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_1_0", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_1_1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_1_2", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_1_3", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_1_4", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_pillar_2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_2_0", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_2_1", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rule_2_2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("createafreeaccount", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("cancel", 0);
                if (var2 != null) {
                  NameCharacterHelpers.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleaselogintoplay", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleaselogin", 0);
                if (var2 != null) {
                  LoginPromptTexts.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleaselogin_member", 0);
                if (null != var2) {
                  GameWorld.field_Y = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invaliduserorpass", param0 ^ 32693);
                if (var2 != null) {
                  AccountResultHelpers.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleasetryagain", 0);
                if (var2 != null) {
                  AccountTermsPanel.field_L = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleasereenterpass", 0);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("playfreeversion", 0);
                if (null != var2) {
                  PopupMenuBuilder.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reloadgame", 0);
                if (var2 != null) {
                  Alien.field_R = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("toserverlist", 0);
                if (var2 != null) {
                  ByteStorage.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("tocustomersupport", 0);
                if (var2 != null) {
                  AccountWelcomePanel.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("changedisplayname", 0);
                if (var2 != null) {
                  GridContainer.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntohomepage", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("justplay", 0);
                if (var2 != null) {
                  NodeHashTableIterator.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("justplay_excl", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login", 0);
                if (null != var2) {
                  BloodSplat.field_H = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("goback", 0);
                if (null != var2) {
                  CheckboxPainter.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("otheroptions", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("proceed", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("connectingtoserver", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleasewait", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("logging_in", 0);
                if (var2 != null) {
                  AccountCreationDialog.field_wb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("backtoerror", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleasecheckinternet", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("attemptingtoreconnect", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("connectionlost_reconnecting", param0 ^ 32693);
                if (null != var2) {
                  GameKeyHandler.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("connectionlost_withreason", 0);
                if (var2 != null) {
                  PacketRequestHelpers.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("passwordverificationrequired", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invalidpass", 0);
                if (null != var2) {
                  GameResourceLoader.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("retry", 0);
                if (var2 != null) {
                  MarkerSliderPainter.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("back", 0);
                if (var2 != null) {
                  ArchivePreloader.field_g = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("exitfullscreenmode", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quittowebsite", 0);
                if (var2 != null) {
                  CutsceneStateHelpers.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("connectionrestored", 0);
                if (var2 != null) {
                  FrameSpriteHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("warning_ifyouquit", 0);
                if (var2 != null) {
                  LoginNameSupport.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("warning_ifyouquitorleavepage", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("resubscribe_withoutlosing_fs", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("resubscribe_withoutlosing", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("customersupport_withoutlosing_fs", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("customersupport_withoutlosing", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("js5help_withoutlosing_fs", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("js5help_withoutlosing", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("checkinternet_withoutlosing_fs", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("checkinternet_withoutlosing", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_intro", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_sameaccounttip_unnamed", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("dateofbirthprompt", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fetchingcountrylist", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("countryprompt", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("countrylisterror", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("theonlypersonalquestions", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_submittingdata", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("check", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_pleasechooseausername", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_usernameblurb", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("checkingavailability", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("checking", 0);
                if (var2 != null) {
                  RopeLadder.field_E = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_namealreadytaken", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_sameaccounttip_named", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_nosuggestions", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alternativelygoback", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_available", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_willnowshowtermsandconditions", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fetchingterms", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("termserror", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_iagree", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_idisagree", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_pleasescrolldowntoaccept", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_linkaddress", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("openinpopupwindow", 0);
                if (null != var2) {
                  FullscreenErrorReason.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create", 0);
                if (null != var2) {
                  MenuScreen.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_pleasechooseapassword", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_passwordblurb", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_nevergivepassword", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("creatingyouraccount", 0);
                if (null != var2) {
                  AccountPromptTexts.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_youmustaccept", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_passwordsdifferent", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_success", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("day", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("month", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("year", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,0", param0 - 32693);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,1", 0);
                if (null != var2) {
                  LogoPoseHelpers.field_a[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,2", param0 - 32693);
                if (null != var2) {
                  LogoPoseHelpers.field_a[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,3", 0);
                if (null != var2) {
                  LogoPoseHelpers.field_a[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,4", param0 - 32693);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,5", 0);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,6", 0);
                if (null != var2) {
                  LogoPoseHelpers.field_a[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,7", 0);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,8", 0);
                if (null != var2) {
                  LogoPoseHelpers.field_a[8] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,9", 0);
                if (null != var2) {
                  LogoPoseHelpers.field_a[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,10", 0);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("monthnames,11", 0);
                if (var2 != null) {
                  LogoPoseHelpers.field_a[11] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_welcome", 0);
                if (var2 != null) {
                  GameKeyHandler.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13_welcome", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_createanaccount", 0);
                if (null != var2) {
                  TrafficVehicle.field_P = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_username", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_displayname", param0 ^ 32693);
                if (null != var2) {
                  PendingIntArrayRequest.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_password", param0 - 32693);
                if (null != var2) {
                  AudioMixerHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_password_confirm", 0);
                if (var2 != null) {
                  BloodSplat.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_email", param0 ^ 32693);
                if (null != var2) {
                  ScriptedMinigunner.field_Vb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_email_confirm", 0);
                if (null != var2) {
                  ChatMessage.field_g = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_age", 0);
                if (var2 != null) {
                  Js5ArchiveManager.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13_email", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13_email_confirm", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_dob", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_country", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alternatives_header", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alternatives_select", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_suggestions", 0);
                if (null != var2) {
                  ValidatedTextWidget.field_Q = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_more_suggestions", 0);
                if (var2 != null) {
                  GooPuddle.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_select_alternative", 0);
                if (var2 != null) {
                  ResizableModeHelpers.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_optin_news", 0);
                if (var2 != null) {
                  LoginNameValue.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_agreeterms", 0);
                if (null != var2) {
                  SpriteCheckboxPainter.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13terms", 0);
                if (var2 != null) {
                  DialogLayer.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_username_email", 0);
                if (null != var2) {
                  ScrollContainer.field_C = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_username", 0);
                if (null != var2) {
                  PowerupBar.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_email", 0);
                if (var2 != null) {
                  RandomAccessCacheFile.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_username_tooltip", 0);
                if (var2 != null) {
                  MenuFontGlobals.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_password_tooltip", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_login_tooltip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_create_tooltip", param0 - 32693);
                if (null != var2) {
                  LoginPayloadKind.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_justplay_tooltip", 0);
                if (null != var2) {
                  PageReloadHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_back_tooltip", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_no_displayname", 0);
                if (null != var2) {
                  PendingRecordRequest.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_username_tooltip", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_username_hint", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_displayname_tooltip", 0);
                if (var2 != null) {
                  LoginMethod.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_displayname_hint", 0);
                if (var2 != null) {
                  BulletCasing.field_l = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_password_tooltip", 0);
                if (null != var2) {
                  BufferedSocket.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_password_hint", 0);
                if (null != var2) {
                  SweepingSpotlight.field_J = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_password_confirm_tooltip", param0 ^ 32693);
                if (null != var2) {
                  StatefulWidgetRenderer.field_t = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_email_tooltip", 0);
                if (var2 != null) {
                  LoginUiHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_email_confirm_tooltip", 0);
                if (null != var2) {
                  GameWorld.field_pb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_age_tooltip", 0);
                if (var2 != null) {
                  GlassShard.field_D = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_optin_news_tooltip", 0);
                if (var2 != null) {
                  FullscreenMembershipDialog.field_V = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13_email_tooltip", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_u13_email_confirm_tooltip", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_dob_tooltip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_country_tooltip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_optin_tooltip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_continue", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_username_unavailable", 0);
                if (var2 != null) {
                  MusicPatch.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_username_available", 0);
                if (null != var2) {
                  FullscreenMembershipDialog.field_X = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_namelength", 0);
                if (null != var2) {
                  MainMenuScreen.field_r = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_namechars", 0);
                if (var2 != null) {
                  ScorePopup.field_G = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_nameleadingspace", 0);
                if (var2 != null) {
                  DialogLayer.field_G = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_doublespace", 0);
                if (null != var2) {
                  NodeHashTableIterator.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passchars", 0);
                if (var2 != null) {
                  Js5Archive.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passrepeated", 0);
                if (var2 != null) {
                  AccountServerResult.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passlength", 0);
                if (var2 != null) {
                  GzipDecompressor.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passcontainsname", 0);
                if (var2 != null) {
                  AgeValidator.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passcontainsemail", 0);
                if (var2 != null) {
                  NodeHashTable.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_passcontainsname_partial", 0);
                if (var2 != null) {
                  IsaacCipher.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_checkname", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_invalidemail", 0);
                if (var2 != null) {
                  AddressHintGlobals.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_email_unavailable", 0);
                if (null != var2) {
                  LoginConnectionHelpers.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_invaliddate", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_invalidage", 0);
                if (null != var2) {
                  LoadingProgressDialog.field_Z = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_yearrange", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_alert_mismatch", 0);
                if (null != var2) {
                  LoginMethodCookieHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_passwordvalid", 0);
                if (var2 != null) {
                  LinkTextPainter.field_g = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_emailvalid", 0);
                if (null != var2) {
                  AccountRequestState.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("create_account_success", 0);
                if (var2 != null) {
                  ViewportController.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("invalid_name", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("cannot_add_yourself", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_add_friend", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_add_ignore", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_delete_friend", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unable_to_delete_ignore", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("friendlistfull", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("friendlistdupe", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("friendnotfound", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ignorelistfull", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ignorelistdupe", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ignorenotfound", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("removeignorefirst", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("removefriendfirst", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("enterfriend_add", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("enterfriend_del", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("enterignore_add", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("enterignore_del", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("text_removed_from_game", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("text_lobby_pleaselogin_free", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("opengl", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("sse", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("purejava", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_graphics", 0);
                if (var2 != null) {
                  DualLinkNode.field_o = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_models", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_fonts", param0 ^ 32693);
                if (var2 != null) {
                  PacketRequestHelpers.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_soundeffects", 0);
                if (null != var2) {
                  ScorePopup.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_music", 0);
                if (null != var2) {
                  MenuBackgroundActor.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_instruments", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_levels", param0 ^ 32693);
                if (var2 != null) {
                  KeyHandlerHolder.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_extradata", 0);
                if (null != var2) {
                  BitmapTextLayout.field_o = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_languages", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_textures", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("waitingfor_animations", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_graphics", 0);
                if (var2 != null) {
                  MarkerSliderPainter.field_m = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_models", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_fonts", 0);
                if (var2 != null) {
                  Bzip2State.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_soundeffects", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_music", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_instruments", 0);
                if (var2 != null) {
                  TutorialTipHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_levels", 0);
                if (var2 != null) {
                  LevelResultScreen.field_w = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_extradata", 0);
                if (null != var2) {
                  SavedDataRequest.field_p = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_languages", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_textures", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("loading_animations", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_graphics", param0 ^ 32693);
                if (null != var2) {
                  RasterBuffer.field_g = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_models", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_soundeffects", param0 ^ 32693);
                if (var2 != null) {
                  BitPacketBuffer.field_m = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_music", 0);
                if (null != var2) {
                  MessageDialogContent.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_levels", param0 ^ 32693);
                if (null != var2) {
                  LoginNameValue.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_languages", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_animations", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unpacking_toolkit", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("instructions", param0 ^ 32693);
                if (var2 != null) {
                  BootstrapLoadingHelpers.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("tutorial", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("playtutorial", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("sound_colon", 0);
                if (null != var2) {
                  QueuedStatSubmission.field_l = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("music_colon", 0);
                if (var2 != null) {
                  ObstacleFactory.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fullscreen", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("screensize", param0 - 32693);
                if (null != var2) {
                  FrameSpriteHelpers.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("highscores", param0 - 32693);
                if (var2 != null) {
                  SessionSocketHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rankings", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achievements", 0);
                if (var2 != null) {
                  SocketConnector.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achievementsthisgame", param0 ^ 32693);
                if (null != var2) {
                  CheckboxPainter.field_k = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achievementsthissession", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("watchintroduction", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quit", 0);
                if (null != var2) {
                  DelayedPacket.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("login_createaccount", param0 ^ 32693);
                if (var2 != null) {
                  PendingRecordRequest.field_r = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("tohighscores", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntomainmenu", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntopausemenu", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntooptionsmenu_notpaused", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mainmenu", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pausemenu", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("optionsmenu_notpaused", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("menu", 0);
                if (var2 != null) {
                  PaletteFontFactory.field_b = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("selectlevel", 0);
                if (null != var2) {
                  KeyStateHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("nextlevel", 0);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("startgame", param0 ^ 32693);
                if (var2 != null) {
                  MeleeHuman.field_Ab = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("newgame", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("resumegame", param0 - 32693);
                if (var2 != null) {
                  ExceptionWrapper.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("resumetutorial", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("skip", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("skiptutorial", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("skipending", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("restartlevel", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("endtest", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("endgame", 0);
                if (var2 != null) {
                  AudioMixerHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("endtutorial", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ok", 0);
                if (var2 != null) {
                  TileMap.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("on", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("off", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("previous", 0);
                if (var2 != null) {
                  QuickChatPhraseDefinition.field_q = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("prev", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("next", 0);
                if (var2 != null) {
                  TextLayoutLine.field_f = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_colon", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hotseatmultiplayer", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("entermultiplayerlobby", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("singleplayergame", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntogame", 0);
                if (var2 != null) {
                  AccountTermsPanel.field_F = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("endgameresign", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("offerdraw", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("canceldraw", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("acceptdraw", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("resign", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("returntolobby", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("cont", 0);
                if (null != var2) {
                  SpriteCheckboxPainter.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("continue_spectating", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("messages", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_fastest", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_medium", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_best", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_directx", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_opengl", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_java", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_quality_high", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_quality_low", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_mode", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_quality", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mode", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quality", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("keys", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("objective", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("currentobjective", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pressescforpausemenu", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pressescforpausemenuortoskiptutorial", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pressescforoptionsmenu_doesntpause", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pressescforoptionsmenu_doesntpause_short", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("powerups", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("latestlevel_suffix", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_name", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_cannotplayreason", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_cannotplayreason_shorter", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedworld_cannotplayreason", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("memberslevel_name", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("memberslevel_cannotplayreason", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("membersworld_cannotplayreason", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_createtip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_createtip_line1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_createtip_line2", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("unreachedlevel_logintip", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("memberslevel_logintip", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("displayname_none", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("levelxofy1", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("levelxofy2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("levelxofy", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ingame_level", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mouseoveranicon", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("notyetachieved", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achieved", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("orbpoints", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("orbcoins", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("orbpoints_colon", 0);
                if (var2 != null) {
                  AccountServerResult.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("orbcoins_colon", 0);
                if (null != var2) {
                  FrameSpriteHelpers.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achieved_colon_description", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("secretachievement", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("no_highscores", 0);
                if (null != var2) {
                  GridContainer.field_I = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_name", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_level", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_fromlevel", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_tolevel", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_score", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_end", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("ingame_score", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("score_colon", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_leavegame", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_offerrematch", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_offerrematch_unrated", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_acceptrematch", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_acceptrematch_unrated", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_cancelrematch", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_cancelrematch_unrated", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_rematchnewgame", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_rematchnewgame_unrated", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_wantstodraw", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_offersrematch", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_offersrematch_unrated", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youofferrematch", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youofferrematch_unrated", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youofferdraw", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youresigned", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youresigned_rematch", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_hasresignedandleft", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_hasresigned_rematch", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_hasresigned", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_hasleft", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_haswon", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_youhavewon", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_gamedrawn", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_timeremaining", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_x_turn", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_yourturn", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("gameover", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_hidechat", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_showchat_nounread", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_showchat_unread1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mp_showchat_unread2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("click_to_quickchat", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("autorespond", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_help", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_help_title", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,0", 0);
                if (null != var2) {
                  SecondaryNodeDeque.field_b[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,1", 0);
                if (var2 != null) {
                  SecondaryNodeDeque.field_b[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,2", 0);
                if (null != var2) {
                  SecondaryNodeDeque.field_b[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,3", param0 ^ 32693);
                if (var2 != null) {
                  SecondaryNodeDeque.field_b[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,4", 0);
                if (null != var2) {
                  SecondaryNodeDeque.field_b[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_help,5", param0 ^ 32693);
                if (null != var2) {
                  SecondaryNodeDeque.field_b[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,0", 0);
                if (var2 != null) {
                  DraggableWidget.field_M[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,1", param0 ^ 32693);
                if (null != var2) {
                  DraggableWidget.field_M[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,2", param0 - 32693);
                if (var2 != null) {
                  DraggableWidget.field_M[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,3", 0);
                if (var2 != null) {
                  DraggableWidget.field_M[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,4", 0);
                if (var2 != null) {
                  DraggableWidget.field_M[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("quickchat_shortcut_keys,5", 0);
                if (null != var2) {
                  DraggableWidget.field_M[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("keychar_the_character_under_questionmark", 0);
                if (null != var2) {
                  WhirlpoolHasher.decodeExtendedByteChar(var2[0], param0 ^ 23759);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_noratings", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_rating", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_played", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_won", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_lost", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_drawn", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("benefits_fullscreen", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("benefits_noadverts", param0 - 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("benefits_price", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("members_expansion_benefits,0", param0 - 32693);
                if (null != var2) {
                  NodeHashTable.field_a[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("members_expansion_benefits,1", 0);
                if (null != var2) {
                  NodeHashTable.field_a[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("members_expansion_benefits,2", 0);
                if (null != var2) {
                  NodeHashTable.field_a[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("members_expansion_price_top", 0);
                if (var2 != null) {
                  TextButton.field_y = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("members_expansion_price_bottom", 0);
                if (null != var2) {
                  ProxySocketConnector.field_i = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_lost_seq,0", 0);
                if (var2 != null) {
                  SweepingSpotlight.field_G[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_lost_seq,1", 0);
                if (var2 != null) {
                  SweepingSpotlight.field_G[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_lost_seq,2", 0);
                if (var2 != null) {
                  SweepingSpotlight.field_G[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_lost_seq,3", 0);
                if (var2 != null) {
                  SweepingSpotlight.field_G[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_lost", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_restored", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_please_check", param0 ^ 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_wait", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_retry", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_resume", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_or", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_exitfs", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_exitfs_quit", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_quit", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_check_fs", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("reconnect_check_nonfs", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_accept_beforeaccept", 0);
                if (null != var2) {
                  CacheEntry.field_p = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_button_accept", 0);
                if (var2 != null) {
                  LevelResultScreen.field_s = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_accept_afteraccept", 0);
                if (var2 != null) {
                  Tree.field_S = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_button_cancel", 0);
                if (var2 != null) {
                  ContentTransitionDialog.field_bb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_accept_aftercancel", 0);
                if (null != var2) {
                  LevelHud.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_accept_countdown_sing", 0);
                if (null != var2) {
                  TextFieldValidator.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_accept_countdown_pl", 0);
                if (null != var2) {
                  MusicPatch.field_q = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_nonmember", 0);
                if (var2 != null) {
                  NineSliceFrame.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_button_close", 0);
                if (var2 != null) {
                  FullscreenExitHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_button_members", 0);
                if (var2 != null) {
                  DiskArchiveRequest.field_w = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_unavailable", 0);
                if (null != var2) {
                  ArrivingPassenger.field_Cb = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_unavailable_try_signed_applet", 0);
                if (var2 != null) {
                  SavedDataRequest.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_focus", 0);
                if (null != var2) {
                  TutorialTipHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_focus_or_resolution", 0);
                if (var2 != null) {
                  FullscreenFocusText.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_timeout", 0);
                if (var2 != null) {
                  AppletHostHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("fs_button_tryagain", 0);
                if (null != var2) {
                  LoadingAndMapHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_ui_fs_countdown", 0);
                if (var2 != null) {
                  LevelObstacle.field_L = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_caption_title", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_including_gamename", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_full_access_1", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_full_access_2", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_achievement_count_1", param0 ^ 32693);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_achievement_count_2", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_exclusive_1", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mb_exclusive_2", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("me_extra_benefits", param0 ^ 32693);
                if (var2 != null) {
                  SecondaryNodeDequeIterator.field_e = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_friend_tip", param0 ^ 32693);
                if (var2 != null) {
                  IconButtonPainter.field_r = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_friend_tip_multi", 0);
                if (null != var2) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_mode_name,0", 0);
                if (var2 != null) {
                  MenuSpriteGlobals.field_a[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_mode_name,1", 0);
                if (null != var2) {
                  MenuSpriteGlobals.field_a[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("hs_mode_name,2", 0);
                if (null != var2) {
                  MenuSpriteGlobals.field_a[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_mode_name,0", param0 - 32693);
                if (null != var2) {
                  LoginNameValue.field_f[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_mode_name,1", 0);
                if (var2 != null) {
                  LoginNameValue.field_f[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_mode_long_name,0", 0);
                if (null != var2) {
                  SpriteState.field_p[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("rating_mode_long_name,1", 0);
                if (var2 != null) {
                  SpriteState.field_p[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_fixed_size", 0);
                if (var2 != null) {
                  LoginPromptTexts.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_resizable", 0);
                if (var2 != null) {
                  MusicPatch.field_n = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_fullscreen", param0 - 32693);
                if (var2 != null) {
                  ArchiveLoadStep.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_done", 0);
                if (null != var2) {
                  EmailAvailabilityValidator.field_j = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_apply", 0);
                if (null != var2) {
                  WhirlpoolHasher.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_title", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_instruction", 0);
                if (var2 != null) {
                  MarkerSliderPainter.field_h = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("graphics_config_need_memory", 0);
                if (var2 != null) {
                  PowerupNames.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("pleasewait_dotdotdot", param0 - 32693);
                if (null != var2) {
                  ArchiveIndex.field_l = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("serviceunavailable", param0 ^ 32693);
                if (var2 != null) {
                  BlastParticle.field_g = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("createtouse", 0);
                if (var2 != null) {
                  SpriteSheetDecoder.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("achievementsoffline", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("warning", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("DEFAULT_PLAYER_NAME", 0);
                if (var2 != null) {
                  SpecularTableHelpers.field_a = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin1", param0 ^ 32693);
                if (null != var2) {
                  BrowserUrlHelpers.field_d = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,1", 0);
                if (null != var2) {
                  CheckboxPainter.field_p[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,2", 0);
                if (null != var2) {
                  CheckboxPainter.field_p[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,3", param0 ^ 32693);
                if (var2 != null) {
                  CheckboxPainter.field_p[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,4", 0);
                if (var2 != null) {
                  CheckboxPainter.field_p[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,5", param0 ^ 32693);
                if (null != var2) {
                  CheckboxPainter.field_p[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,6", param0 ^ param0);
                if (null != var2) {
                  CheckboxPainter.field_p[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin2,7", 0);
                if (null != var2) {
                  CheckboxPainter.field_p[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,1", 0);
                if (null != var2) {
                  ErrorReportHelpers.field_b[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,2", 0);
                if (var2 != null) {
                  ErrorReportHelpers.field_b[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,3", param0 - 32693);
                if (null != var2) {
                  ErrorReportHelpers.field_b[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,4", param0 - 32693);
                if (null != var2) {
                  ErrorReportHelpers.field_b[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,5", 0);
                if (null != var2) {
                  ErrorReportHelpers.field_b[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,6", 0);
                if (var2 != null) {
                  ErrorReportHelpers.field_b[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin3,7", 0);
                if (null != var2) {
                  ErrorReportHelpers.field_b[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("discard", param0 ^ 32693);
                if (null != var2) {
                  BootstrapLoadingHelpers.field_c = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,1", 0);
                if (var2 != null) {
                  NameCheckRequest.field_e[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,2", 0);
                if (var2 != null) {
                  NameCheckRequest.field_e[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,3", param0 - 32693);
                if (null != var2) {
                  NameCheckRequest.field_e[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,4", 0);
                if (null != var2) {
                  NameCheckRequest.field_e[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,5", 0);
                if (null != var2) {
                  NameCheckRequest.field_e[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,6", 0);
                if (var2 != null) {
                  NameCheckRequest.field_e[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin4,7", 0);
                if (null != var2) {
                  NameCheckRequest.field_e[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_notloggedin", param0 - 32693);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,1", 0);
                if (null != var2) {
                  AccountPromptTexts.field_g[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,2", 0);
                if (var2 != null) {
                  AccountPromptTexts.field_g[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,3", 0);
                if (var2 != null) {
                  AccountPromptTexts.field_g[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,4", param0 ^ 32693);
                if (var2 != null) {
                  AccountPromptTexts.field_g[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,5", 0);
                if (var2 != null) {
                  AccountPromptTexts.field_g[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,6", 0);
                if (null != var2) {
                  AccountPromptTexts.field_g[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("mustlogin_alternate,7", 0);
                if (null != var2) {
                  AccountPromptTexts.field_g[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,0", 0);
                if (null != var2) {
                  AudioMixerHelpers.field_e[0] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,1", 0);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[1] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,2", param0 ^ 32693);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[2] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,3", param0 - 32693);
                if (null != var2) {
                  AudioMixerHelpers.field_e[3] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,4", param0 ^ 32693);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[4] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,5", param0 - 32693);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[5] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,6", param0 - 32693);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[6] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,7", 0);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[7] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,8", 0);
                if (null != var2) {
                  AudioMixerHelpers.field_e[8] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,9", 0);
                if (null != var2) {
                  AudioMixerHelpers.field_e[9] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,10", 0);
                if (null != var2) {
                  AudioMixerHelpers.field_e[10] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,11", 0);
                if (null != var2) {
                  AudioMixerHelpers.field_e[11] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("subscription_cost_monthly,12", 0);
                if (var2 != null) {
                  AudioMixerHelpers.field_e[12] = TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                var2 = RandomAccessCacheFile.getLoadingTextFile("sentence_separator", 0);
                if (var2 != null) {
                  TextDecodeHelpers.decodeText(var2, (byte) 56);
                }
                EditableTextWidget.field_K = null;
            }
            void run() {
                var3 = ZombieDawn.field_J;
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
                  stackIn_2595_0 = (RuntimeException) (var2_ref);
                  stackIn_2595_1 = new StringBuilder().append("bn.F(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2596_2 = "null";
                  } else {
                    stackIn_2596_2 = "{...}";
                  }
                  throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_2595_0), ((StringBuilder) (Object) stackIn_2595_1).append(stackIn_2596_2).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = GameApplet.field_f;
                  var4++;
                  GameApplet.field_f = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void writePayload(boolean param0, PacketBuffer param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param1.writeLong(this.field_e, -53);
          if (param0) {
            this.payloadKind((byte) -127);
          }
          param1.writeBase38Name(this.field_d, (byte) 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static Sprite loadSpriteByName(String param0, Js5Archive param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            field_g = (long[]) null;
          }
          var4_int = param1.getGroupIdByName(param2, (byte) 8);
          var5 = param1.getFileIdByName(var4_int, param0, true);
          stackIn_4_0 = HunterHuman.loadArchiveSprite(var5, var4_int, param1, 48);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bn.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    LoginPayloadKind payloadKind(byte param0) {
        RuntimeException var2 = null;
        LoginPayloadKind stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -102) {
            LongAndTextLoginPayload.compareDisplayModes((byte) 92, (FullscreenExitHelpers) null, (FullscreenExitHelpers) null);
          }
          stackIn_4_0 = SpriteFadeHelpers.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "bn.C(" + param0 + ')');
        }
    }

    LongAndTextLoginPayload(long param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param1;
          this.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("bn.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void detectMaxMemoryMb(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          RuntimeException var1_ref2 = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          try {
            if (param0 != 1818) {
              field_g = (long[]) null;
            }
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (null != var1) {
                try {
                  var2 = Runtime.getRuntime();
                  var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                  SavedDataRequest.field_l = 1 + (int)(var3.longValue() / 1048576L);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref2), "bn.H(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var14 = 0;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        long stackIn_6_0 = 0L;
        field_i = -1;
        field_h = new long[8][256];
        field_b = new int[12];
        field_f = true;
        field_g = new long[11];
        var0 = 0;
        scanLoop1: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) == 0) {
            stackIn_6_0 = (long)(var1 >>> 8);
          } else {
            stackIn_6_0 = (long)(var1 & 255);
          }
          var2 = stackIn_6_0;
          var4 = var2 << 1;
          if (var4 >= 256L) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var6 ^ var2;
          var10 = var6 << 1;
          if (256L <= var10) {
            var10 = var10 ^ 285L;
          }
          var12 = var2 ^ var10;
          field_h[0][var0] = LevelObstacle.bitOr(var12, LevelObstacle.bitOr(LevelObstacle.bitOr(var8 << 16, LevelObstacle.bitOr(LevelObstacle.bitOr(var2 << 32, LevelObstacle.bitOr(LevelObstacle.bitOr(var2 << 48, var2 << 56), var6 << 40)), var10 << 24)), var4 << 8));
          for (var14 = 1; var14 < 8; var14++) {
            field_h[var14][var0] = LevelObstacle.bitOr(field_h[-1 + var14][var0] << 56, field_h[var14 - 1][var0] >>> 8);
          }
          var0++;
        }
        field_g[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
          var1 = var0 * 8 - 8;
          field_g[var0] = MenuScreen.bitXor(WidgetStyleLayer.bitAnd(255L, field_h[7][7 + var1]), MenuScreen.bitXor(WidgetStyleLayer.bitAnd(field_h[6][6 + var1], 65280L), MenuScreen.bitXor(WidgetStyleLayer.bitAnd(16711680L, field_h[5][5 + var1]), MenuScreen.bitXor(MenuScreen.bitXor(MenuScreen.bitXor(WidgetStyleLayer.bitAnd(field_h[2][var1 + 2], 280375465082880L), MenuScreen.bitXor(WidgetStyleLayer.bitAnd(field_h[0][var1], -72057594037927936L), WidgetStyleLayer.bitAnd(71776119061217280L, field_h[1][var1 + 1]))), WidgetStyleLayer.bitAnd(field_h[3][var1 + 3], 1095216660480L)), WidgetStyleLayer.bitAnd(4278190080L, field_h[4][4 + var1])))));
        }
    }
}
