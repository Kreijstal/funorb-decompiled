/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static uq[] field_o;
    static int[] field_q;
    private EditableTextField field_l;
    private EditableTextField field_p;
    static int field_n;
    static UiPanel field_m;

    final String getValidationMessage(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3614) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var3 = this.field_p.text.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = null;
            return (String) (stackIn_5_0);
          }
          var5 = var4;
          if (nh.a(var5, (byte) -113)) {
            stackIn_8_0 = IntrusiveDeque.field_f;
            return stackIn_8_0;
          }
          if (ByteArrayPoolSupport.a(-111, var5)) {
            stackIn_11_0 = s.field_r;
            return stackIn_11_0;
          }
          if (DialogMessagePane.a(288, var5)) {
            stackIn_14_0 = bq.field_C;
            return stackIn_14_0;
          }
          if (this.containsEmailComponent(param1, (byte) -67)) {
            stackIn_19_0 = mn.field_u;
            return stackIn_19_0;
          }
          if (var3.length() <= 0) {
            stackIn_22_0 = vl.field_h;
            return stackIn_22_0;
          }
          if (tj.a(param0 - 26311, var5, var3)) {
            stackIn_25_0 = kn.field_m;
            return stackIn_25_0;
          }
          if (hl.a((byte) -88, var3, var5)) {
            stackIn_30_0 = nd.field_l;
            return stackIn_30_0;
          }
          if (!gm.a(param0 ^ 3700, var3, var5)) {
            stackIn_35_0 = IntrusiveDeque.field_f;
            return stackIn_35_0;
          }
          stackIn_33_0 = kn.field_m;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_39_0 = var3_ref;
          stackIn_39_1 = new StringBuilder().append("wc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final ba getValidationStatus(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ba stackIn_2_0 = null;
        ba stackIn_7_0 = null;
        ba stackIn_12_0 = null;
        ba stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_p.text.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 == ~var4.length()) {
            stackIn_2_0 = ir.field_a;
            return stackIn_2_0;
          }
          if (!w.a(var4, var3, 0)) {
            stackIn_7_0 = ir.field_a;
            return stackIn_7_0;
          }
          if (this.containsEmailComponent(param1, (byte) -67)) {
            stackIn_12_0 = ir.field_a;
            return stackIn_12_0;
          }
          stackIn_14_0 = GuestPlayConfirmationForm.field_G;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        BitPacketBuffer var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = uh.field_Wb;
          var6.writeCipheredByte(param2, 119);
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte(4, -93);
          var6.writeByte(param1, 94);
          if (param3 > -24) {
            field_m = (UiPanel) null;
          }
          var8 = param5;
          if (param4) {
            var8 += 128;
          }
          var6.writeByte(var8, 105);
          var6.writeBytes(0, -10140, param0, param0.length);
          var6.patchByteLength((byte) 77, var6.position - var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("wc.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_m = (UiPanel) null;
          }
          stackIn_4_0 = Vertigo2.field_F.equals(rc.a((CharSequence) ((Object) param0), 320));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wc.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_m = null;
          field_q = null;
          if (param0 != 3) {
            PasswordValidator.g(-122);
          }
          field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var1), "wc.E(" + param0 + ')');
        }
    }

    final static void loadSharedInterfaceText(int param0, Archive param1) {
        class ClientTextLoader {
            RuntimeException stackIn_2643_0;
            StringBuilder stackIn_2643_1;
            String stackIn_2644_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int param0;
            Archive param1;
            boolean finished;
            ClientTextLoader(int initialParam0, Archive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2643_0 = null;
                this.stackIn_2643_1 = null;
                this.stackIn_2644_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void loadLoginLobbyAndChatText() throws java.lang.RuntimeException {
                GrowableIntArray.field_a = param1;
                var2 = ArchiveNetworkClient.a("loginm3", false);
                if (null != var2) {
                  tf.field_m = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loginm2", false);
                if (null != var2) {
                  ba.field_c = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("loginm1", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("idlemessage20min", false);
                if (null != var2) {
                  ml.field_A = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("error_js5crc", false);
                if (null != var2) {
                  ab.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("error_js5io", false);
                if (var2 != null) {
                  ec.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("error_js5connect_full", false);
                if (var2 != null) {
                  tq.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("error_js5connect", false);
                if (var2 != null) {
                  om.field_C = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_gameupdated", false);
                if (var2 != null) {
                  cb.field_Pb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_unable", false);
                if (null != var2) {
                  BirthDateChatEnableForm.field_K = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_ineligible", false);
                if (null != var2) {
                  DateInputWidget.field_J = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("usernameprompt", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("passwordprompt", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("andagainprompt", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_read", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_ignore", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_oneunread", false);
                if (null != var2) {
                  FullscreenNoticeType.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_xunread", false);
                if (var2 != null) {
                  kn.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_gotowebsite", false);
                if (null != var2) {
                  e.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ticketing_waitingformessages", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_on", false);
                if (var2 != null) {
                  lo.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_friends", false);
                if (null != var2) {
                  uo.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_off", false);
                if (var2 != null) {
                  vg.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_lobby", false);
                if (var2 != null) {
                  SpriteState.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_public", false);
                if (var2 != null) {
                  ua.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_ignore", false);
                if (var2 != null) {
                  dm.field_Ib = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_tips", false);
                if (var2 != null) {
                  GameKeyHandler.field_c = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_game", false);
                if (null != var2) {
                  or.field_k = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_private", false);
                if (var2 != null) {
                  TextureOperator.field_q = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_entered_game", false);
                if (null != var2) {
                  pc.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_joined_your_game", false);
                if (var2 != null) {
                  nd.field_j = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_entered_other_game", false);
                if (var2 != null) {
                  hq.field_q = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_left_lobby", false);
                if (null != var2) {
                  GameApplet.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_lost_con", false);
                if (null != var2) {
                  ea.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_cannot_join_full", false);
                if (null != var2) {
                  DefaultTextWidgetRenderer.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_cannot_join_inprogress", false);
                if (var2 != null) {
                  DebouncedFieldValidator.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_declined_invite", false);
                if (var2 != null) {
                  nk.field_Ib = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_withdrew_request", false);
                if (null != var2) {
                  GzipDecompressor.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_removed", false);
                if (var2 != null) {
                  fn.field_A = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_x_dropped_out", false);
                if (var2 != null) {
                  AccountRequestState.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_entered_other_game", false);
                if (var2 != null) {
                  j.field_s = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_game_is_full", false);
                if (null != var2) {
                  sk.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_game_has_started", false);
                if (null != var2) {
                  ResizableModalDialog.field_K = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_you_declined_invite", false);
                if (var2 != null) {
                  GrowableIntArray.field_c = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_invite_withdrawn", false);
                if (null != var2) {
                  ad.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_request_declined", false);
                if (var2 != null) {
                  SecondaryNodeDequeIterator.field_b = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_request_withdrawn", false);
                if (var2 != null) {
                  ProgressDialog.field_cb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_all_players_have_left", false);
                if (null != var2) {
                  bk.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_name", false);
                if (null != var2) {
                  kc.field_c = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_rating", false);
                if (var2 != null) {
                  f.field_D = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_friend_add", false);
                if (null != var2) {
                  StripedProgressWidget.field_J = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_friend_rm", false);
                if (var2 != null) {
                  nf.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_name_add", false);
                if (var2 != null) {
                  RichTextLayout.field_s = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_name_rm", false);
                if (null != var2) {
                  eq.field_B = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_lobby_location", false);
                if (var2 != null) {
                  BlastDebrisBatch.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_all_games", false);
                if (null != var2) {
                  MouseWheelInput.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_status", false);
                if (var2 != null) {
                  MusicPatchNode.field_u = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_owner", false);
                if (null != var2) {
                  he.field_B = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_players", false);
                if (null != var2) {
                  MenuSelectionCursor.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_avg_rating", false);
                if (var2 != null) {
                  SecondaryNodeHashTable.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_options", false);
                if (var2 != null) {
                  eq.field_C = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gamelist_elapsed_time", false);
                if (null != var2) {
                  fm.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_play_rated", false);
                if (var2 != null) {
                  ja.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_create_unrated", false);
                if (var2 != null) {
                  vl.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options", false);
                if (null != var2) {
                  me.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options_whocanjoin", false);
                if (null != var2) {
                  PlayerState.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options_players", false);
                if (null != var2) {
                  MusicPatchPcmStream.field_v = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options_dontmind", false);
                if (var2 != null) {
                  pp.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options_allow_spectate", false);
                if (var2 != null) {
                  in.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_options_ratedgametype", false);
                if (var2 != null) {
                  ArrayWidgetContainer.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("yes", false);
                if (null != var2) {
                  ProxyAuthenticationRequiredException.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("no", false);
                if (null != var2) {
                  nf.field_w = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_invite_players", false);
                if (null != var2) {
                  eh.field_g = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("close", false);
                if (null != var2) {
                  DateInputWidget.field_I = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("add_x_to_friends", false);
                if (null != var2) {
                  ln.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("add_x_to_ignore", false);
                if (var2 != null) {
                  BitPacketBuffer.field_x = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("rm_x_from_friends", false);
                if (var2 != null) {
                  ProgressDialog.field_X = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rm_x_from_ignore", false);
                if (null != var2) {
                  f.field_J = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("send_pm_to_x", false);
                if (null != var2) {
                  sc.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("send_qc_to_x", false);
                if (null != var2) {
                  hh.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("send_pm", false);
                if (null != var2) {
                  vj.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("invite_accept_xs_game", false);
                if (null != var2) {
                  DateInputWidget.field_G = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("invite_decline_xs_game", false);
                if (null != var2) {
                  aq.field_b = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("join_xs_game", false);
                if (var2 != null) {
                  kq.field_Ub = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("join_request_xs_game", false);
                if (null != var2) {
                  qj.field_a = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("join_withdraw_request_xs_game", false);
                if (null != var2) {
                  StripedProgressWidget.field_L = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gameopt_kick_x_from_this_game", false);
                if (null != var2) {
                  vi.field_s = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gameopt_withdraw_invite_to_x", false);
                if (var2 != null) {
                  kh.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gameopt_accept_x_into_game", false);
                if (var2 != null) {
                  te.field_y = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gameopt_reject_x_from_game", false);
                if (null != var2) {
                  sj.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_gameopt_invite_x_to_game", false);
                if (var2 != null) {
                  pp.field_v = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("report_x_for_abuse", false);
                if (null != var2) {
                  as.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_send_message_password_a", false);
                if (null != var2) {
                  pd.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_send_message_password_b", false);
                if (var2 != null) {
                  AccountServiceResult.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_lobby_show_all", false);
                if (null != var2) {
                  c.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_lobby_friends_only", false);
                if (var2 != null) {
                  jk.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_lobby_friends", false);
                if (var2 != null) {
                  mo.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_lobby_hide", false);
                if (null != var2) {
                  on.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_game_show_all", false);
                if (null != var2) {
                  qk.field_G = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_game_friends_only", false);
                if (null != var2) {
                  ng.field_b = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_game_friends", false);
                if (var2 != null) {
                  ArrayWidgetContainer.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_game_hide", false);
                if (null != var2) {
                  ResizableModalDialog.field_P = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_pm_show_all", false);
                if (var2 != null) {
                  ud.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_pm_friends_only", false);
                if (var2 != null) {
                  gm.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_pm_friends", false);
                if (var2 != null) {
                  qf.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mu_chat_invisible_and_silent_mode", false);
                if (null != var2) {
                  mo.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_have_been_removed_from_xs_game", false);
                if (var2 != null) {
                  ua.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("your_rating_is_x", false);
                if (null != var2) {
                  IntrusiveNode.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_are_on_x_server", false);
                if (var2 != null) {
                  pq.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("rated_game", false);
                if (null != var2) {
                  ej.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unrated_game", false);
                if (var2 != null) {
                  up.field_y = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rated_game_tips", false);
                if (null != var2) {
                  pp.field_y = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("searching_for_opponent_singular", false);
                if (null != var2) {
                  ValidationStatusIcon.field_J = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("searching_for_opponents_plural", false);
                if (null != var2) {
                  mo.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("find_opponent_singular", false);
                if (var2 != null) {
                  MatchSession.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("find_opponents_plural", false);
                if (null != var2) {
                  w.field_y = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rated_game_tips_setup_singular", false);
                if (var2 != null) {
                  h.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rated_game_tips_setup_plural", false);
                if (null != var2) {
                  gh.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waiting_to_start_hint", false);
                if (null != var2) {
                  MatchSession.field_A = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("your_game", false);
                if (null != var2) {
                  fq.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("game_full", false);
                if (var2 != null) {
                  ProgressDialog.field_db = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("join_requests_one", false);
                if (var2 != null) {
                  e.field_l = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("join_requests_many", false);
                if (var2 != null) {
                  uo.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("xs_game", false);
                if (null != var2) {
                  ie.field_Rb = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waiting_for_x_to_start_game", false);
                if (var2 != null) {
                  od.field_Ob = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("game_options_changed", false);
                if (null != var2) {
                  me.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("players_x_of_y", false);
                if (null != var2) {
                  DiskArchiveRequest.field_I = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("message_lobby", false);
                if (var2 != null) {
                  ck.field_K = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_lobby", false);
                if (null != var2) {
                  ri.field_x = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("message_game", false);
                if (var2 != null) {
                  up.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("message_team", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_game", false);
                if (null != var2) {
                  ja.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("kick", false);
                if (null != var2) {
                  LevelSimulation.field_F = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("inviting_x", false);
                if (null != var2) {
                  gk.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("x_wants_to_join", false);
                if (var2 != null) {
                  StripedProgressWidget.field_N = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("accept", false);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_k = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reject", false);
                if (var2 != null) {
                  bs.field_ac = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("invite", false);
                if (var2 != null) {
                  ti.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_concluded", false);
                if (null != var2) {
                  np.field_Mb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_spectate", false);
                if (var2 != null) {
                  vo.field_C = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_playing", false);
                if (var2 != null) {
                  or.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_join", false);
                if (var2 != null) {
                  mo.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_private", false);
                if (null != var2) {
                  bm.field_B = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("status_full", false);
                if (var2 != null) {
                  MouseWheelInput.field_i = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("players_in_game", false);
                if (null != var2) {
                  od.field_Ib = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_are_invited_to_xs_game", false);
                if (null != var2) {
                  g.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("asking_to_join_xs_game", false);
                if (var2 != null) {
                  kg.field_I = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("who_can_join", false);
                if (var2 != null) {
                  gn.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_can_join", false);
                if (var2 != null) {
                  rm.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_can_ask_to_join", false);
                if (null != var2) {
                  to.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_cannot_join_in_progress", false);
                if (var2 != null) {
                  NetworkArchiveRequest.field_E = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_can_spectate", false);
                if (var2 != null) {
                  n.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("you_can_not_spectate", false);
                if (var2 != null) {
                  in.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("spectate_xs_game", false);
                if (var2 != null) {
                  AccountServiceResult.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hide_players_in_xs_game", false);
                if (var2 != null) {
                  be.field_s = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("show_players_in_xs_game", false);
                if (null != var2) {
                  as.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("connecting_to_friend_server_twoline", false);
                if (var2 != null) {
                  tn.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading", false);
                if (null != var2) {
                  mq.field_t = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("offline", false);
                if (null != var2) {
                  aq.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("multiconst_invite_only", false);
                if (var2 != null) {
                  fh.field_x = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("multiconst_clan", false);
                if (var2 != null) {
                  DiskCacheWorker.field_k = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("multiconst_friends", false);
                if (var2 != null) {
                  fa.field_q = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("multiconst_similar_rating", false);
                if (var2 != null) {
                  ve.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("multiconst_open", false);
                if (null != var2) {
                  pq.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("no_options_available", false);
                if (null != var2) {
                  uk.field_y = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reportabuse", false);
                if (var2 != null) {
                  ad.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("presstabtochat", false);
                if (null != var2) {
                  kl.field_Nb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pressf10toquickchat", false);
                if (null != var2) {
                  qn.field_v = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("dob_chatdisabled", false);
                if (null != var2) {
                  ah.field_k = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("dob_enterforchat", false);
                if (null != var2) {
                  jq.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("tab_hidechattemporarily", false);
                if (var2 != null) {
                  AccountCreationResultPanel.field_rb = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("esc_cancelprivatemessage", false);
                if (null != var2) {
                  IntrusiveDeque.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("esc_cancelthisline", false);
                if (null != var2) {
                  ml.field_x = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("privatequickchat_from_x", false);
                if (var2 != null) {
                  DateInputWidget.field_L = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("privatequickchat_to_x", false);
                if (null != var2) {
                  di.field_B = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("privatechat_blankarea_explanation", false);
                if (null != var2) {
                  bd.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("publicchat_unavailable_ratedgame", false);
                if (null != var2) {
                  w.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("privatechat_friend_offline", false);
                if (null != var2) {
                  qo.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("privatechat_friend_notlisted", false);
                if (null != var2) {
                  RandomAccessCacheFile.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("chatviewscrolledup", false);
                if (null != var2) {
                  AgeValidator.field_l = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("thisisrunescapeclan", false);
                if (var2 != null) {
                  qn.field_z = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("thisisrunescapeclan_notowner", false);
                if (var2 != null) {
                  e.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("runescapeclan", false);
                if (null != var2) {
                  ec.field_z = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rated_membersonly", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_membersonly", false);
                if (var2 != null) {
                  GameplayScreen.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_1moreratedgame", false);
                if (var2 != null) {
                  jm.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_moreratedgames", false);
                if (var2 != null) {
                  kk.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_needrating", false);
                if (var2 != null) {
                  mf.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_unratedonly", false);
                if (null != var2) {
                  le.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_notunlocked", false);
                if (var2 != null) {
                  ld.field_c = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_cannotbecombined1", false);
                if (null != var2) {
                  ir.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_cannotbecombined2", false);
                if (null != var2) {
                  qc.field_u = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playernotmember", false);
                if (null != var2) {
                  rp.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_younotmember", false);
                if (var2 != null) {
                  PacketBuffer.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playerneedsrating", false);
                if (null != var2) {
                  ud.field_t = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_youneedrating", false);
                if (var2 != null) {
                  uq.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playerneedsratedgames", false);
                if (null != var2) {
                  fa.field_p = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_youneedratedgames", false);
                if (null != var2) {
                  DelegatingCanvas.field_d = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playerneeds1ratedgame", false);
                if (null != var2) {
                  jc.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_youneed1ratedgame", false);
                if (var2 != null) {
                  ak.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playerhasntunlocked", false);
                if (var2 != null) {
                  qn.field_o = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_youhaventunlocked", false);
                if (var2 != null) {
                  fm.field_f = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_trychanging1", false);
                if (null != var2) {
                  mq.field_u = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_trychanging2", false);
                if (null != var2) {
                  lb.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_needchanging1", false);
                if (var2 != null) {
                  in.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_needchanging2", false);
                if (null != var2) {
                  LabeledWidgetContainer.field_G = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_mightchange", false);
                if (null != var2) {
                  DropTargetWidgetContainer.field_J = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playersdontqualify", false);
                if (var2 != null) {
                  di.field_y = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_playersdontqualify_selectgametab", false);
                if (null != var2) {
                  pb.field_e = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_unselectedoptions", false);
                if (var2 != null) {
                  MovingLevelTile.field_y = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_pleaseselectoption1", false);
                if (var2 != null) {
                  fa.field_t = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_pleaseselectoption2", false);
                if (null != var2) {
                  NetworkArchiveRequest.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_badnumplayers", false);
                if (var2 != null) {
                  lo.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_inviteplayers_or_trychanging1", false);
                if (var2 != null) {
                  SocketArchiveNetworkClient.field_q = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_inviteplayers_or_trychanging2", false);
                if (null != var2) {
                  ni.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_novalidcombos", false);
                if (var2 != null) {
                  ValidationStatusWidget.field_X = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameopt_pleasetrychanging", false);
                if (var2 != null) {
                  ah.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_title", false);
                if (var2 != null) {
                  ol.field_z = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_mutethisplayer", false);
                if (var2 != null) {
                  tb.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_suggestmute", false);
                if (var2 != null) {
                  hm.field_z = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_intro", false);
                if (null != var2) {
                  WidgetWrapper.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_intro_no_name", false);
                if (var2 != null) {
                  ModalDialogHost.field_H = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("ra_explanation", false);
                if (null != var2) {
                  tl.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_pillar_0", false);
                if (null != var2) {
                  sk.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_0", false);
                if (var2 != null) {
                  hm.field_B = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_1", false);
                if (var2 != null) {
                  SocketConnector.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_2", false);
                if (var2 != null) {
                  TextLayout.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_3", false);
                if (null != var2) {
                  EmailFormatValidator.field_l = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_4", false);
                if (null != var2) {
                  pp.field_x = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_0_5", false);
                if (null != var2) {
                  ok.field_a = in.a(0, var2);
                }
            }
            void loadAccountFormsAndLoadingText() throws java.lang.RuntimeException {
                var2 = ArchiveNetworkClient.a("rule_pillar_1", false);
                if (null != var2) {
                  lh.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_1_0", false);
                if (null != var2) {
                  g.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_1_1", false);
                if (var2 != null) {
                  mm.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_1_2", false);
                if (var2 != null) {
                  bo.field_p = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_1_3", false);
                if (var2 != null) {
                  DropTargetWidgetContainer.field_M = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_1_4", false);
                if (var2 != null) {
                  hr.field_z = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_pillar_2", false);
                if (null != var2) {
                  hl.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_2_0", false);
                if (null != var2) {
                  jp.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_2_1", false);
                if (null != var2) {
                  LabeledWidgetContainer.field_L = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rule_2_2", false);
                if (null != var2) {
                  ie.field_Sb = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("createafreeaccount", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("cancel", false);
                if (null != var2) {
                  mp.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleaselogintoplay", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleaselogin", false);
                if (var2 != null) {
                  oc.field_x = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleaselogin_member", false);
                if (null != var2) {
                  LoginPanel.field_I = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("invaliduserorpass", false);
                if (var2 != null) {
                  rr.field_y = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleasetryagain", false);
                if (var2 != null) {
                  LevelRenderer.field_m = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleasereenterpass", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("playfreeversion", false);
                if (var2 != null) {
                  so.field_z = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reloadgame", false);
                if (var2 != null) {
                  jb.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("toserverlist", false);
                if (var2 != null) {
                  PlayerAvatarRenderer.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("tocustomersupport", false);
                if (null != var2) {
                  hm.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("changedisplayname", false);
                if (var2 != null) {
                  s.field_v = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntohomepage", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("justplay", false);
                if (var2 != null) {
                  fd.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("justplay_excl", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login", false);
                if (null != var2) {
                  wp.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("goback", false);
                if (null != var2) {
                  tc.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("otheroptions", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("proceed", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("connectingtoserver", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleasewait", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("logging_in", false);
                if (null != var2) {
                  gn.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("backtoerror", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleasecheckinternet", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("attemptingtoreconnect", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("connectionlost_reconnecting", false);
                if (null != var2) {
                  wp.field_c = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("connectionlost_withreason", false);
                if (var2 != null) {
                  ri.field_o = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("passwordverificationrequired", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("invalidpass", false);
                if (null != var2) {
                  ValidationStatusIcon.field_M = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("retry", false);
                if (null != var2) {
                  bk.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("back", false);
                if (null != var2) {
                  ap.field_f = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("exitfullscreenmode", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quittowebsite", false);
                if (var2 != null) {
                  jd.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("connectionrestored", false);
                if (var2 != null) {
                  qk.field_H = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("warning_ifyouquit", false);
                if (null != var2) {
                  fm.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("warning_ifyouquitorleavepage", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("resubscribe_withoutlosing_fs", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("resubscribe_withoutlosing", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("customersupport_withoutlosing_fs", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("customersupport_withoutlosing", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("js5help_withoutlosing_fs", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("js5help_withoutlosing", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("checkinternet_withoutlosing_fs", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("checkinternet_withoutlosing", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_intro", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_sameaccounttip_unnamed", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("dateofbirthprompt", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fetchingcountrylist", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("countryprompt", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("countrylisterror", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("theonlypersonalquestions", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_submittingdata", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("check", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_pleasechooseausername", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_usernameblurb", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("checkingavailability", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("checking", false);
                if (null != var2) {
                  ValidationStatusIcon.field_L = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_namealreadytaken", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_sameaccounttip_named", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_nosuggestions", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alternativelygoback", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_available", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_willnowshowtermsandconditions", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fetchingterms", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("termserror", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_iagree", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_idisagree", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_pleasescrolldowntoaccept", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_linkaddress", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("openinpopupwindow", false);
                if (null != var2) {
                  fm.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create", false);
                if (null != var2) {
                  DiskArchiveRequest.field_K = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_pleasechooseapassword", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_passwordblurb", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_nevergivepassword", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("creatingyouraccount", false);
                if (null != var2) {
                  DropTargetWidgetContainer.field_L = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_youmustaccept", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_passwordsdifferent", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_success", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("day", false);
                if (null != var2) {
                  MusicPatchEnvelope.field_m = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("month", false);
                if (var2 != null) {
                  ff.field_v = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("year", false);
                if (var2 != null) {
                  ArrayWidgetContainer.field_C = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,0", false);
                if (var2 != null) {
                  dp.field_F[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,1", false);
                if (var2 != null) {
                  dp.field_F[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,2", false);
                if (null != var2) {
                  dp.field_F[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,3", false);
                if (var2 != null) {
                  dp.field_F[3] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,4", false);
                if (var2 != null) {
                  dp.field_F[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,5", false);
                if (var2 != null) {
                  dp.field_F[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,6", false);
                if (var2 != null) {
                  dp.field_F[6] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,7", false);
                if (null != var2) {
                  dp.field_F[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,8", false);
                if (var2 != null) {
                  dp.field_F[8] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,9", false);
                if (var2 != null) {
                  dp.field_F[9] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,10", false);
                if (var2 != null) {
                  dp.field_F[10] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("monthnames,11", false);
                if (var2 != null) {
                  dp.field_F[11] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_welcome", false);
                if (null != var2) {
                  kl.field_Jb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13_welcome", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_createanaccount", false);
                if (null != var2) {
                  TextHotspotBounds.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_username", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_displayname", false);
                if (null != var2) {
                  GameShell.field_q = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_password", false);
                if (var2 != null) {
                  uc.field_c = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_password_confirm", false);
                if (var2 != null) {
                  ln.field_a = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_email", false);
                if (var2 != null) {
                  le.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_email_confirm", false);
                if (null != var2) {
                  GrowableIntArray.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_age", false);
                if (var2 != null) {
                  po.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13_email", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13_email_confirm", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_dob", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_country", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alternatives_header", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alternatives_select", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_suggestions", false);
                if (var2 != null) {
                  jd.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_more_suggestions", false);
                if (var2 != null) {
                  pl.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_select_alternative", false);
                if (null != var2) {
                  GameApplet.field_k = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_optin_news", false);
                if (var2 != null) {
                  FullscreenNoticeType.field_d = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_agreeterms", false);
                if (null != var2) {
                  GzipDecompressor.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13terms", false);
                if (null != var2) {
                  BlastDebrisModel.field_n = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_username_email", false);
                if (null != var2) {
                  FullscreenNoticeType.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_username", false);
                if (var2 != null) {
                  w.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_email", false);
                if (null != var2) {
                  la.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_username_tooltip", false);
                if (null != var2) {
                  wh.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_password_tooltip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_login_tooltip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_create_tooltip", false);
                if (var2 != null) {
                  ni.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_justplay_tooltip", false);
                if (null != var2) {
                  he.field_z = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_back_tooltip", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_no_displayname", false);
                if (null != var2) {
                  km.field_v = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_username_tooltip", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_username_hint", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_displayname_tooltip", false);
                if (null != var2) {
                  BlastDebrisBatch.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_displayname_hint", false);
                if (null != var2) {
                  LevelTile.field_m = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_password_tooltip", false);
                if (null != var2) {
                  dl.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_password_hint", false);
                if (var2 != null) {
                  ag.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_password_confirm_tooltip", false);
                if (var2 != null) {
                  jk.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_email_tooltip", false);
                if (var2 != null) {
                  ak.field_f = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_email_confirm_tooltip", false);
                if (null != var2) {
                  BirthDateValidator.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_age_tooltip", false);
                if (var2 != null) {
                  PacketBuffer.field_s = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_optin_news_tooltip", false);
                if (var2 != null) {
                  pq.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13_email_tooltip", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_u13_email_confirm_tooltip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_dob_tooltip", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_country_tooltip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_optin_tooltip", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_continue", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_username_unavailable", false);
                if (null != var2) {
                  IsaacCipher.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_username_available", false);
                if (var2 != null) {
                  sf.field_c = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_namelength", false);
                if (var2 != null) {
                  jn.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_namechars", false);
                if (var2 != null) {
                  ud.field_w = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_nameleadingspace", false);
                if (null != var2) {
                  Bzip2State.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_doublespace", false);
                if (var2 != null) {
                  mo.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passchars", false);
                if (var2 != null) {
                  s.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passrepeated", false);
                if (var2 != null) {
                  bq.field_C = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passlength", false);
                if (null != var2) {
                  IntrusiveDeque.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passcontainsname", false);
                if (var2 != null) {
                  kn.field_m = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passcontainsemail", false);
                if (null != var2) {
                  mn.field_u = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_passcontainsname_partial", false);
                if (null != var2) {
                  nd.field_l = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_checkname", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_invalidemail", false);
                if (var2 != null) {
                  SecondaryNodeDeque.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_email_unavailable", false);
                if (var2 != null) {
                  vl.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_invaliddate", false);
                if (null != var2) {
                  lb.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_invalidage", false);
                if (null != var2) {
                  ValidatedTextField.field_S = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_yearrange", false);
                if (null != var2) {
                  ea.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_alert_mismatch", false);
                if (null != var2) {
                  MusicPatchEnvelope.field_a = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_passwordvalid", false);
                if (var2 != null) {
                  vl.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_emailvalid", false);
                if (var2 != null) {
                  mh.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("create_account_success", false);
                if (null != var2) {
                  ByteStorage.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("invalid_name", false);
                if (null != var2) {
                  or.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("cannot_add_yourself", false);
                if (var2 != null) {
                  Vertigo2.field_K = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_add_friend", false);
                if (null != var2) {
                  ce.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_add_ignore", false);
                if (null != var2) {
                  jf.field_J = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_delete_friend", false);
                if (null != var2) {
                  ConfirmedEmailAvailabilityValidator.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unable_to_delete_ignore", false);
                if (var2 != null) {
                  DiskCacheWorker.field_n = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("friendlistfull", false);
                if (var2 != null) {
                  wh.field_B = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("friendlistdupe", false);
                if (null != var2) {
                  nh.field_n = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("friendnotfound", false);
                if (var2 != null) {
                  tq.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ignorelistfull", false);
                if (null != var2) {
                  eb.field_i = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("ignorelistdupe", false);
                if (null != var2) {
                  RasterBuffer.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ignorenotfound", false);
                if (var2 != null) {
                  jp.field_R = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("removeignorefirst", false);
                if (var2 != null) {
                  p.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("removefriendfirst", false);
                if (null != var2) {
                  wb.field_C = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("enterfriend_add", false);
                if (null != var2) {
                  kj.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("enterfriend_del", false);
                if (var2 != null) {
                  ce.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("enterignore_add", false);
                if (var2 != null) {
                  DualLinkNode.field_r = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("enterignore_del", false);
                if (null != var2) {
                  qc.field_y = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("text_removed_from_game", false);
                if (null != var2) {
                  qp.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("text_lobby_pleaselogin_free", false);
                if (var2 != null) {
                  HuffmanCodec.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("opengl", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("sse", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("purejava", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_graphics", false);
                if (var2 != null) {
                  ib.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_models", false);
                if (null != var2) {
                  StandardContentDialog.field_ib = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_fonts", false);
                if (var2 != null) {
                  ByteArrayPoolSupport.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_soundeffects", false);
                if (null != var2) {
                  lc.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_music", false);
                if (var2 != null) {
                  tm.field_c = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_instruments", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_levels", false);
                if (null != var2) {
                  eq.field_E = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_extradata", false);
                if (var2 != null) {
                  vj.field_a = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_languages", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_textures", false);
                if (null != var2) {
                  AccountRequestState.field_d = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("waitingfor_animations", false);
                if (null != var2) {
                  bb.field_G = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_graphics", false);
                if (null != var2) {
                  me.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_models", false);
                if (null != var2) {
                  ec.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_fonts", false);
                if (var2 != null) {
                  vd.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_soundeffects", false);
                if (null != var2) {
                  DebouncedFieldValidator.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_music", false);
                if (var2 != null) {
                  lo.field_b = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_instruments", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_levels", false);
                if (var2 != null) {
                  bm.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_extradata", false);
                if (null != var2) {
                  EmailFormatValidator.field_n = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_languages", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_textures", false);
                if (null != var2) {
                  ua.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("loading_animations", false);
                if (var2 != null) {
                  kq.field_Vb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_graphics", false);
                if (var2 != null) {
                  nh.field_p = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_models", false);
                if (var2 != null) {
                  cp.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_soundeffects", false);
                if (var2 != null) {
                  AccountCreationResultPanel.field_sb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_music", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_levels", false);
                if (var2 != null) {
                  RasterBuffer.field_g = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_languages", false);
                if (var2 != null) {
                  fa.field_v = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_animations", false);
                if (null != var2) {
                  ByteStorage.field_f = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unpacking_toolkit", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("instructions", false);
                if (var2 != null) {
                  AccountCreationResultPanel.field_vb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("tutorial", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("playtutorial", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("sound_colon", false);
                if (var2 != null) {
                  RichTextWidget.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("music_colon", false);
                if (var2 != null) {
                  FullscreenFocusCanvas.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fullscreen", false);
                if (var2 != null) {
                  mo.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("screensize", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("highscores", false);
                if (var2 != null) {
                  ClientException.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rankings", false);
                if (var2 != null) {
                  rr.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achievements", false);
                if (null != var2) {
                  rb.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achievementsthisgame", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achievementsthissession", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("watchintroduction", false);
                if (null != var2) {
                  in.a(0, var2);
                }
            }
            void loadMatchDisplayAndMembershipText() throws java.lang.RuntimeException {
                var2 = ArchiveNetworkClient.a("quit", false);
                if (null != var2) {
                  ld.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("login_createaccount", false);
                if (null != var2) {
                  ResizableModalDialog.field_Q = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("tohighscores", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntomainmenu", false);
                if (var2 != null) {
                  RichTextLayout.field_x = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntopausemenu", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntooptionsmenu_notpaused", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mainmenu", false);
                if (null != var2) {
                  ArchiveRequest.field_x = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pausemenu", false);
                if (var2 != null) {
                  po.field_d = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("optionsmenu_notpaused", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("menu", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("selectlevel", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("nextlevel", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("startgame", false);
                if (null != var2) {
                  gm.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("newgame", false);
                if (var2 != null) {
                  jm.field_C = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("resumegame", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("resumetutorial", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("skip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("skiptutorial", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("skipending", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("restartlevel", false);
                if (var2 != null) {
                  in.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("endtest", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("endgame", false);
                if (var2 != null) {
                  np.field_Jb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("endtutorial", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("ok", false);
                if (var2 != null) {
                  bm.field_y = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("on", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("off", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("previous", false);
                if (var2 != null) {
                  bb.field_y = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("prev", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("next", false);
                if (var2 != null) {
                  nn.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_colon", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("hotseatmultiplayer", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("entermultiplayerlobby", false);
                if (null != var2) {
                  no.field_a = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("singleplayergame", false);
                if (var2 != null) {
                  ByteStorage.field_b = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntogame", false);
                if (null != var2) {
                  gb.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("endgameresign", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("offerdraw", false);
                if (null != var2) {
                  dm.field_Jb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("canceldraw", false);
                if (null != var2) {
                  LabeledWidgetContainer.field_T = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("acceptdraw", false);
                if (null != var2) {
                  te.field_I = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("resign", false);
                if (var2 != null) {
                  fn.field_B = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("returntolobby", false);
                if (null != var2) {
                  pb.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("cont", false);
                if (var2 != null) {
                  vi.field_x = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("continue_spectating", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("messages", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_fastest", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_medium", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_best", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_directx", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_opengl", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_java", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_quality_high", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_quality_low", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_mode", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_quality", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mode", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("quality", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("keys", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("objective", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("currentobjective", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pressescforpausemenu", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pressescforpausemenuortoskiptutorial", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("pressescforoptionsmenu_doesntpause", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pressescforoptionsmenu_doesntpause_short", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("powerups", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("latestlevel_suffix", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_name", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_cannotplayreason", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_cannotplayreason_shorter", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedworld_cannotplayreason", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("memberslevel_name", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("memberslevel_cannotplayreason", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("membersworld_cannotplayreason", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_createtip", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_createtip_line1", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_createtip_line2", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("unreachedlevel_logintip", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("memberslevel_logintip", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("displayname_none", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("levelxofy1", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("levelxofy2", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("levelxofy", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ingame_level", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mouseoveranicon", false);
                if (var2 != null) {
                  ProgressMessageDialog.field_hb = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("notyetachieved", false);
                if (null != var2) {
                  UiPanel.field_Z = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achieved", false);
                if (null != var2) {
                  wj.field_a = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("orbpoints", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("orbcoins", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("orbpoints_colon", false);
                if (var2 != null) {
                  pl.field_j = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("orbcoins_colon", false);
                if (null != var2) {
                  vl.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achieved_colon_description", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("secretachievement", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("no_highscores", false);
                if (var2 != null) {
                  ej.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_name", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_level", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_fromlevel", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_tolevel", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_score", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_end", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("ingame_score", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("score_colon", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_leavegame", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_offerrematch", false);
                if (var2 != null) {
                  fq.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_offerrematch_unrated", false);
                if (var2 != null) {
                  oq.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_acceptrematch", false);
                if (var2 != null) {
                  en.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_acceptrematch_unrated", false);
                if (null != var2) {
                  LevelSimulation.field_H = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_cancelrematch", false);
                if (var2 != null) {
                  BlastDebrisBatch.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_cancelrematch_unrated", false);
                if (null != var2) {
                  BlastDebrisModel.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_rematchnewgame", false);
                if (null != var2) {
                  ii.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_rematchnewgame_unrated", false);
                if (null != var2) {
                  GameShell.field_B = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_wantstodraw", false);
                if (null != var2) {
                  mo.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_offersrematch", false);
                if (var2 != null) {
                  gn.field_e = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_offersrematch_unrated", false);
                if (null != var2) {
                  me.field_d = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_youofferrematch", false);
                if (var2 != null) {
                  bm.field_A = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_youofferrematch_unrated", false);
                if (var2 != null) {
                  RegistrationAgreementPane.field_H = in.a(param0 ^ 0, var2);
                }
                if (param0 != 0) {
                  PasswordValidator.loadSharedInterfaceText(6, (Archive) null);
                }
                var2 = ArchiveNetworkClient.a("mp_youofferdraw", false);
                if (null != var2) {
                  rb.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_youresigned", false);
                if (null != var2) {
                  cd.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_youresigned_rematch", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_hasresignedandleft", false);
                if (var2 != null) {
                  GameShell.field_m = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_hasresigned_rematch", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_hasresigned", false);
                if (null != var2) {
                  ca.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_hasleft", false);
                if (null != var2) {
                  mn.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_haswon", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_youhavewon", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_gamedrawn", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_timeremaining", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_x_turn", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_yourturn", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("gameover", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_hidechat", false);
                if (var2 != null) {
                  ol.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_showchat_nounread", false);
                if (null != var2) {
                  bl.field_q = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_showchat_unread1", false);
                if (var2 != null) {
                  ci.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mp_showchat_unread2", false);
                if (null != var2) {
                  ao.field_P = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("click_to_quickchat", false);
                if (null != var2) {
                  pb.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("autorespond", false);
                if (var2 != null) {
                  wp.field_b = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_help", false);
                if (var2 != null) {
                  ValidatedTextField.field_W = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_help_title", false);
                if (null != var2) {
                  DropTargetWidgetContainer.field_N = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,0", false);
                if (var2 != null) {
                  ModalDialogHost.field_M[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,1", false);
                if (var2 != null) {
                  ModalDialogHost.field_M[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,2", false);
                if (var2 != null) {
                  ModalDialogHost.field_M[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,3", false);
                if (null != var2) {
                  ModalDialogHost.field_M[3] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,4", false);
                if (var2 != null) {
                  ModalDialogHost.field_M[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_help,5", false);
                if (null != var2) {
                  ModalDialogHost.field_M[5] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,0", false);
                if (var2 != null) {
                  qr.field_k[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,1", false);
                if (null != var2) {
                  qr.field_k[1] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,2", false);
                if (null != var2) {
                  qr.field_k[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,3", false);
                if (null != var2) {
                  qr.field_k[3] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,4", false);
                if (var2 != null) {
                  qr.field_k[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("quickchat_shortcut_keys,5", false);
                if (var2 != null) {
                  qr.field_k[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("keychar_the_character_under_questionmark", false);
                if (var2 != null) {
                  v.field_c = mn.decodeCp1252Byte(var2[0], -115);
                }
                var2 = ArchiveNetworkClient.a("rating_noratings", false);
                if (null != var2) {
                  sq.field_d = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_rating", false);
                if (null != var2) {
                  ej.field_e = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_played", false);
                if (var2 != null) {
                  jl.field_h = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_won", false);
                if (null != var2) {
                  oq.field_D = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_lost", false);
                if (var2 != null) {
                  to.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_drawn", false);
                if (null != var2) {
                  sc.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("benefits_fullscreen", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("benefits_noadverts", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("benefits_price", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("members_expansion_benefits,0", false);
                if (var2 != null) {
                  DiskArchiveRequest.field_J[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("members_expansion_benefits,1", false);
                if (null != var2) {
                  DiskArchiveRequest.field_J[1] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("members_expansion_benefits,2", false);
                if (var2 != null) {
                  DiskArchiveRequest.field_J[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("members_expansion_price_top", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("members_expansion_price_bottom", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_lost_seq,0", false);
                if (null != var2) {
                  ff.field_n[0] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_lost_seq,1", false);
                if (var2 != null) {
                  ff.field_n[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_lost_seq,2", false);
                if (var2 != null) {
                  ff.field_n[2] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_lost_seq,3", false);
                if (var2 != null) {
                  ff.field_n[3] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_lost", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_restored", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_please_check", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_wait", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_retry", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_resume", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_or", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_exitfs", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_exitfs_quit", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_quit", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_check_fs", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("reconnect_check_nonfs", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_accept_beforeaccept", false);
                if (var2 != null) {
                  LevelRenderer.field_e = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_button_accept", false);
                if (var2 != null) {
                  ca.field_d = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_accept_afteraccept", false);
                if (var2 != null) {
                  lf.field_E = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_button_cancel", false);
                if (var2 != null) {
                  wn.field_i = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_accept_aftercancel", false);
                if (var2 != null) {
                  dc.field_K = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_accept_countdown_sing", false);
                if (var2 != null) {
                  bc.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_accept_countdown_pl", false);
                if (null != var2) {
                  TextLayout.field_f = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_nonmember", false);
                if (null != var2) {
                  qr.field_o = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_button_close", false);
                if (var2 != null) {
                  ValidationStatusIcon.field_N = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_button_members", false);
                if (var2 != null) {
                  dc.field_M = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_unavailable", false);
                if (null != var2) {
                  ArchiveNetworkClient.field_p = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_unavailable_try_signed_applet", false);
                if (null != var2) {
                  NumericDateInputWidget.field_U = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_focus", false);
                if (var2 != null) {
                  lh.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_focus_or_resolution", false);
                if (var2 != null) {
                  RasterBuffer.field_c = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_timeout", false);
                if (null != var2) {
                  w.field_D = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("fs_button_tryagain", false);
                if (null != var2) {
                  eo.field_n = in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_ui_fs_countdown", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_caption_title", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_including_gamename", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_full_access_1", false);
                if (null != var2) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_full_access_2", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_achievement_count_1", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_achievement_count_2", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_exclusive_1", false);
                if (null != var2) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mb_exclusive_2", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("me_extra_benefits", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_friend_tip", false);
                if (var2 != null) {
                  GameplayScreen.field_O = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_friend_tip_multi", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_mode_name,0", false);
                if (var2 != null) {
                  bq.field_G[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_mode_name,1", false);
                if (null != var2) {
                  bq.field_G[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("hs_mode_name,2", false);
                if (null != var2) {
                  bq.field_G[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_mode_name,0", false);
                if (null != var2) {
                  BirthDateValidator.field_n[0] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("rating_mode_name,1", false);
                if (var2 != null) {
                  BirthDateValidator.field_n[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_mode_long_name,0", false);
                if (null != var2) {
                  TextLineMetrics.field_e[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("rating_mode_long_name,1", false);
                if (var2 != null) {
                  TextLineMetrics.field_e[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_fixed_size", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_resizable", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_fullscreen", false);
                if (var2 != null) {
                  in.a(param0 ^ 0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_done", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_apply", false);
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_title", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_instruction", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("graphics_config_need_memory", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("pleasewait_dotdotdot", false);
                if (var2 != null) {
                  b.field_f = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("serviceunavailable", false);
                if (null != var2) {
                  ModalDialogHost.field_G = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("createtouse", false);
                if (null != var2) {
                  vg.field_b = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("achievementsoffline", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("warning", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("DEFAULT_PLAYER_NAME", false);
                if (null != var2) {
                  ByteStorage.field_a = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin1", false);
                if (null != var2) {
                  jl.field_f = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,1", false);
                if (null != var2) {
                  m.field_y[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,2", false);
                if (null != var2) {
                  m.field_y[2] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,3", false);
                if (var2 != null) {
                  m.field_y[3] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,4", false);
                if (var2 != null) {
                  m.field_y[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,5", false);
                if (null != var2) {
                  m.field_y[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,6", false);
                if (var2 != null) {
                  m.field_y[6] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin2,7", false);
                if (null != var2) {
                  m.field_y[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,1", false);
                if (null != var2) {
                  eh.field_d[1] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,2", false);
                if (null != var2) {
                  eh.field_d[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,3", false);
                if (var2 != null) {
                  eh.field_d[3] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,4", false);
                if (null != var2) {
                  eh.field_d[4] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,5", false);
                if (null != var2) {
                  eh.field_d[5] = in.a(ArchiveNetworkClient.bitwiseXor(param0, 0), var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,6", false);
                if (var2 != null) {
                  eh.field_d[6] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin3,7", false);
                if (null != var2) {
                  eh.field_d[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("discard", false);
                if (var2 != null) {
                  AccountRegistrationPanel.field_K = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,1", false);
                if (var2 != null) {
                  qn.field_t[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,2", false);
                if (var2 != null) {
                  qn.field_t[2] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,3", false);
                if (null != var2) {
                  qn.field_t[3] = in.a(0, var2);
                }
            }
            void loadLoginPromptsAndSubscriptionText() throws java.lang.RuntimeException {
                var2 = ArchiveNetworkClient.a("mustlogin4,4", false);
                if (null != var2) {
                  qn.field_t[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,5", false);
                if (var2 != null) {
                  qn.field_t[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,6", false);
                if (null != var2) {
                  qn.field_t[6] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin4,7", false);
                if (null != var2) {
                  qn.field_t[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_notloggedin", false);
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,1", false);
                if (null != var2) {
                  sk.field_f[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,2", false);
                if (null != var2) {
                  sk.field_f[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,3", false);
                if (var2 != null) {
                  sk.field_f[3] = in.a(param0 + 0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,4", false);
                if (var2 != null) {
                  sk.field_f[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,5", false);
                if (var2 != null) {
                  sk.field_f[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,6", false);
                if (var2 != null) {
                  sk.field_f[6] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("mustlogin_alternate,7", false);
                if (null != var2) {
                  sk.field_f[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,0", false);
                if (var2 != null) {
                  nn.field_t[0] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,1", false);
                if (null != var2) {
                  nn.field_t[1] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,2", false);
                if (var2 != null) {
                  nn.field_t[2] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,3", false);
                if (var2 != null) {
                  nn.field_t[3] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,4", false);
                if (null != var2) {
                  nn.field_t[4] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,5", false);
                if (var2 != null) {
                  nn.field_t[5] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,6", false);
                if (var2 != null) {
                  nn.field_t[6] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,7", false);
                if (null != var2) {
                  nn.field_t[7] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,8", false);
                if (null != var2) {
                  nn.field_t[8] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,9", false);
                if (var2 != null) {
                  nn.field_t[9] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,10", false);
                if (null != var2) {
                  nn.field_t[10] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,11", false);
                if (null != var2) {
                  nn.field_t[11] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("subscription_cost_monthly,12", false);
                if (var2 != null) {
                  nn.field_t[12] = in.a(0, var2);
                }
                var2 = ArchiveNetworkClient.a("sentence_separator", false);
                if (var2 != null) {
                  in.a(param0 + 0, var2);
                }
                GrowableIntArray.field_a = null;
            }
            void run() {
                var3 = Vertigo2.field_L ? 1 : 0;
                try {
                  loadLoginLobbyAndChatText();
                  if (finished) return;
                  loadAccountFormsAndLoadingText();
                  if (finished) return;
                  loadMatchDisplayAndMembershipText();
                  if (finished) return;
                  loadLoginPromptsAndSubscriptionText();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2643_0 = (RuntimeException) (var2_ref);
                  stackIn_2643_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2644_2 = "null";
                  } else {
                    stackIn_2644_2 = "{...}";
                  }
                  throw wn.wrapClientException((Throwable) ((Object) stackIn_2643_0), ((StringBuilder) (Object) stackIn_2643_1).append(stackIn_2644_2).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = GameApplet.field_a;
                  var4++;
                  GameApplet.field_a = var4;
                }
            }
        }
        ClientTextLoader decompiledBody = new ClientTextLoader(param0, param1);
        decompiledBody.run();
    }

    PasswordValidator(EditableTextField param0, EditableTextField param1, EditableTextField param2) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_p = param1;
          this.field_l = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean containsEmailComponent(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        try {
          if (param1 != -67) {
            field_m = (UiPanel) null;
          }
          var3 = this.field_l.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < (var3.length() - 1)) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("wc.G(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = new int[5];
    }
}
