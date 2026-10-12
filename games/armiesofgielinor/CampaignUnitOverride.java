/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignUnitOverride {
    int unitType;
    int strength;
    String displayName;
    static String field_c;
    static int[] field_d;

    public static void a(int param0) {
        try {
          field_d = null;
          field_c = null;
          if (param0 < 67) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "id.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2613_0;
            StringBuilder stackIn_2613_1;
            String stackIn_2614_2;
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
                this.stackIn_2613_0 = null;
                this.stackIn_2613_1 = null;
                this.stackIn_2614_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                qk.field_e = param1;
                var2 = NodeIterator.a(param0 + 132, "loginm3");
                if (null != var2) {
                  gu.field_a = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "loginm2");
                if (null != var2) {
                  DamageEvent.field_y = uu.a(var2, (byte) 51);
                }
                var2 = NodeIterator.a(50, "loginm1");
                if (var2 != null) {
                  uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "idlemessage20min");
                if (var2 != null) {
                  of.field_bc = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(param0 ^ -100, "error_js5crc");
                if (var2 != null) {
                  oq.field_k = uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(param0 + 132, "error_js5io");
                if (null != var2) {
                  CampaignMenu.field_k = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(50, "error_js5connect_full");
                if (null != var2) {
                  ResourceArchive.field_d = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "error_js5connect");
                if (var2 != null) {
                  wm.field_a = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "login_gameupdated");
                if (null != var2) {
                  fk.field_f = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "create_unable");
                if (null != var2) {
                  CampaignMission.field_s = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "create_ineligible");
                if (null != var2) {
                  ResourceProtocolClient.field_m = uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(param0 ^ -100, "usernameprompt");
                if (null != var2) {
                  uu.a(var2, (byte) 51);
                }
                var2 = NodeIterator.a(param0 ^ -100, "passwordprompt");
                if (null != var2) {
                  uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "andagainprompt");
                if (var2 != null) {
                  uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(50, "ticketing_read");
                if (var2 != null) {
                  uu.a(var2, (byte) 71);
                }
                var2 = NodeIterator.a(param0 + 132, "ticketing_ignore");
                if (null != var2) {
                  uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(param0 + 132, "ticketing_oneunread");
                if (var2 != null) {
                  TrianglePulse.field_a = uu.a(var2, (byte) 42);
                }
                var2 = NodeIterator.a(50, "ticketing_xunread");
                if (null != var2) {
                  lw.field_nb = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(param0 ^ -100, "ticketing_gotowebsite");
                if (null != var2) {
                  c.field_a = uu.a(var2, (byte) 5);
                }
                var2 = NodeIterator.a(50, "ticketing_waitingformessages");
                if (null != var2) {
                  uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mu_chat_on");
                if (var2 != null) {
                  QuickChatPhrase.field_v = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "mu_chat_friends");
                if (null != var2) {
                  IterableDualNodeDeque.field_a = uu.a(var2, (byte) 90);
                }
                var2 = NodeIterator.a(50, "mu_chat_off");
                if (var2 != null) {
                  cd.field_d = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "mu_chat_lobby");
                if (null != var2) {
                  ClientConnectionState.field_c = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "mu_chat_public");
                if (null != var2) {
                  wf.field_u = uu.a(var2, (byte) 8);
                }
                var2 = NodeIterator.a(50, "mu_chat_ignore");
                if (null != var2) {
                  op.field_e = uu.a(var2, (byte) 42);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mu_chat_tips");
                if (var2 != null) {
                  TeleportAction.field_x = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "mu_chat_game");
                if (var2 != null) {
                  ob.field_O = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "mu_chat_private");
                if (null != var2) {
                  tq.field_d = uu.a(var2, (byte) 29);
                }
                var2 = NodeIterator.a(50, "mu_x_entered_game");
                if (null != var2) {
                  GrowthEvent.field_B = uu.a(var2, (byte) 50);
                }
                var2 = NodeIterator.a(50, "mu_x_joined_your_game");
                if (var2 != null) {
                  ea.field_d = uu.a(var2, (byte) 24);
                }
                var2 = NodeIterator.a(50, "mu_x_entered_other_game");
                if (var2 != null) {
                  IterableNodeHashTable.field_b = uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(50, "mu_x_left_lobby");
                if (null != var2) {
                  DropdownOptionList.field_X = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mu_x_lost_con");
                if (var2 != null) {
                  ot.field_H = uu.a(var2, (byte) -128);
                }
                var2 = NodeIterator.a(50, "mu_x_cannot_join_full");
                if (null != var2) {
                  di.field_j = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "mu_x_cannot_join_inprogress");
                if (var2 != null) {
                  bh.field_I = uu.a(var2, (byte) 77);
                }
                var2 = NodeIterator.a(50, "mu_x_declined_invite");
                if (null != var2) {
                  oc.field_Nb = uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(50, "mu_x_withdrew_request");
                if (var2 != null) {
                  Spell.field_a = uu.a(var2, (byte) 52);
                }
                var2 = NodeIterator.a(50, "mu_x_removed");
                if (null != var2) {
                  DirectByteStorage.field_i = uu.a(var2, (byte) 52);
                }
                var2 = NodeIterator.a(50, "mu_x_dropped_out");
                if (null != var2) {
                  cp.field_f = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "mu_entered_other_game");
                if (var2 != null) {
                  vf.field_e = uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "mu_game_is_full");
                if (var2 != null) {
                  mo.field_l = uu.a(var2, (byte) 102);
                }
                var2 = NodeIterator.a(50, "mu_game_has_started");
                if (null != var2) {
                  qm.field_H = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "mu_you_declined_invite");
                if (null != var2) {
                  cd.field_b = uu.a(var2, (byte) 120);
                }
                var2 = NodeIterator.a(50, "mu_invite_withdrawn");
                if (null != var2) {
                  ke.field_d = uu.a(var2, (byte) 41);
                }
                var2 = NodeIterator.a(50, "mu_request_declined");
                if (var2 != null) {
                  wh.field_h = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "mu_request_withdrawn");
                if (var2 != null) {
                  qt.field_b = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "mu_all_players_have_left");
                if (null != var2) {
                  ActionSpell.field_i = uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(50, "mu_lobby_name");
                if (var2 != null) {
                  su.field_b = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "mu_lobby_rating");
                if (var2 != null) {
                  rh.field_g = uu.a(var2, (byte) 60);
                }
                var2 = NodeIterator.a(50, "mu_lobby_friend_add");
                if (null != var2) {
                  h.field_b = uu.a(var2, (byte) 72);
                }
                var2 = NodeIterator.a(50, "mu_lobby_friend_rm");
                if (var2 != null) {
                  AnimationFrameSet.field_y = uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(param0 + 132, "mu_lobby_name_add");
                if (var2 != null) {
                  lm.field_a = uu.a(var2, (byte) 94);
                }
                var2 = NodeIterator.a(50, "mu_lobby_name_rm");
                if (var2 != null) {
                  ArchiveIndex.field_u = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "mu_lobby_location");
                if (null != var2) {
                  nl.field_C = uu.a(var2, (byte) 43);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_all_games");
                if (null != var2) {
                  nr.field_d = uu.a(var2, (byte) 117);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_status");
                if (null != var2) {
                  IntrusiveNode.field_a = uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(param0 + 132, "mu_gamelist_owner");
                if (null != var2) {
                  wb.field_c = uu.a(var2, (byte) 5);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_players");
                if (var2 != null) {
                  fk.field_g = uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_avg_rating");
                if (var2 != null) {
                  fw.field_H = uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_options");
                if (null != var2) {
                  hs.field_D = uu.a(var2, (byte) 111);
                }
                var2 = NodeIterator.a(50, "mu_gamelist_elapsed_time");
                if (null != var2) {
                  RevivalEvent.field_B = uu.a(var2, (byte) -128);
                }
                var2 = NodeIterator.a(50, "mu_play_rated");
                if (var2 != null) {
                  l.field_f = uu.a(var2, (byte) 123);
                }
                var2 = NodeIterator.a(50, "mu_create_unrated");
                if (null != var2) {
                  CampaignMenuEntry.field_C = uu.a(var2, (byte) 95);
                }
                var2 = NodeIterator.a(50, "mu_options");
                if (null != var2) {
                  EffectPresentation.field_d = uu.a(var2, (byte) 49);
                }
                var2 = NodeIterator.a(50, "mu_options_whocanjoin");
                if (null != var2) {
                  et.field_c = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "mu_options_players");
                if (null != var2) {
                  ep.field_h = uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(50, "mu_options_dontmind");
                if (var2 != null) {
                  ki.field_a = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mu_options_allow_spectate");
                if (null != var2) {
                  GameEvent.field_p = uu.a(var2, (byte) 96);
                }
                var2 = NodeIterator.a(50, "mu_options_ratedgametype");
                if (var2 != null) {
                  AnimationFrameSet.field_u = uu.a(var2, (byte) 38);
                }
                var2 = NodeIterator.a(50, "yes");
                if (var2 != null) {
                  po.field_b = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "no");
                if (var2 != null) {
                  LeaderEscortCondition.field_e = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "mu_invite_players");
                if (var2 != null) {
                  TickCounter.field_d = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "close");
                if (var2 != null) {
                  dr.field_D = uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(50, "add_x_to_friends");
                if (var2 != null) {
                  vf.field_l = uu.a(var2, (byte) 88);
                }
                var2 = NodeIterator.a(50, "add_x_to_ignore");
                if (null != var2) {
                  sq.field_o = uu.a(var2, (byte) 64);
                }
                var2 = NodeIterator.a(50, "rm_x_from_friends");
                if (var2 != null) {
                  na.field_K = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "rm_x_from_ignore");
                if (var2 != null) {
                  oa.field_E = uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "send_pm_to_x");
                if (null != var2) {
                  mi.field_k = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "send_qc_to_x");
                if (null != var2) {
                  DeployRequest.field_w = uu.a(var2, (byte) 24);
                }
                var2 = NodeIterator.a(50, "send_pm");
                if (null != var2) {
                  eb.field_d = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "invite_accept_xs_game");
                if (null != var2) {
                  ByteStorage.field_b = uu.a(var2, (byte) 109);
                }
                var2 = NodeIterator.a(50, "invite_decline_xs_game");
                if (var2 != null) {
                  or.field_a = uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "join_xs_game");
                if (null != var2) {
                  ev.field_e = uu.a(var2, (byte) 122);
                }
                var2 = NodeIterator.a(50, "join_request_xs_game");
                if (null != var2) {
                  CampaignResult.field_d = uu.a(var2, (byte) 2);
                }
                var2 = NodeIterator.a(50, "join_withdraw_request_xs_game");
                if (var2 != null) {
                  eq.field_j = uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(50, "mu_gameopt_kick_x_from_this_game");
                if (null != var2) {
                  wc.field_R = uu.a(var2, (byte) 64);
                }
                var2 = NodeIterator.a(param0 + 132, "mu_gameopt_withdraw_invite_to_x");
                if (var2 != null) {
                  oe.field_zb = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "mu_gameopt_accept_x_into_game");
                if (var2 != null) {
                  ac.field_x = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "mu_gameopt_reject_x_from_game");
                if (var2 != null) {
                  vq.field_g = uu.a(var2, (byte) 8);
                }
                var2 = NodeIterator.a(50, "mu_gameopt_invite_x_to_game");
                if (null != var2) {
                  pk.field_W = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "report_x_for_abuse");
                if (var2 != null) {
                  IterableDualNodeDeque.field_e = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 + 132, "unable_to_send_message_password_a");
                if (null != var2) {
                  KingBlackDragonEvent.field_y = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(param0 + 132, "unable_to_send_message_password_b");
                if (var2 != null) {
                  ContextualRuntimeException.field_a = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "mu_chat_lobby_show_all");
                if (var2 != null) {
                  vl.field_o = uu.a(var2, (byte) 121);
                }
                var2 = NodeIterator.a(50, "mu_chat_lobby_friends_only");
                if (null != var2) {
                  pk.field_S = uu.a(var2, (byte) 20);
                }
                var2 = NodeIterator.a(50, "mu_chat_lobby_friends");
                if (var2 != null) {
                  li.field_m = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "mu_chat_lobby_hide");
                if (null != var2) {
                  ou.field_g = uu.a(var2, (byte) 47);
                }
                var2 = NodeIterator.a(50, "mu_chat_game_show_all");
                if (var2 != null) {
                  vk.field_c = uu.a(var2, (byte) 43);
                }
                var2 = NodeIterator.a(50, "mu_chat_game_friends_only");
                if (var2 != null) {
                  jj.field_b = uu.a(var2, (byte) 40);
                }
                var2 = NodeIterator.a(param0 + 132, "mu_chat_game_friends");
                if (var2 != null) {
                  fd.field_l = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "mu_chat_game_hide");
                if (var2 != null) {
                  fa.field_c = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "mu_chat_pm_show_all");
                if (var2 != null) {
                  SocketResourceClient.field_v = uu.a(var2, (byte) 93);
                }
                var2 = NodeIterator.a(50, "mu_chat_pm_friends_only");
                if (var2 != null) {
                  SummonRequest.field_C = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "mu_chat_pm_friends");
                if (null != var2) {
                  jj.field_e = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "mu_chat_invisible_and_silent_mode");
                if (var2 != null) {
                  ai.field_R = uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "you_have_been_removed_from_xs_game");
                if (var2 != null) {
                  ActionSpell.field_l = uu.a(var2, (byte) 121);
                }
                var2 = NodeIterator.a(50, "your_rating_is_x");
                if (null != var2) {
                  AttackEvent.field_F = uu.a(var2, (byte) 18);
                }
                var2 = NodeIterator.a(50, "you_are_on_x_server");
                if (var2 != null) {
                  ps.field_A = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "rated_game");
                if (var2 != null) {
                  uu.field_a = uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unrated_game");
                if (null != var2) {
                  CampaignProgress.field_c = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "rated_game_tips");
                if (var2 != null) {
                  AiActionCandidate.field_v = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "searching_for_opponent_singular");
                if (null != var2) {
                  PreparedAction.field_l = uu.a(var2, (byte) 72);
                }
                var2 = NodeIterator.a(50, "searching_for_opponents_plural");
                if (null != var2) {
                  p.field_f = uu.a(var2, (byte) 114);
                }
                var2 = NodeIterator.a(param0 ^ -100, "find_opponent_singular");
                if (null != var2) {
                  fk.field_e = uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(param0 ^ -100, "find_opponents_plural");
                if (var2 != null) {
                  qp.field_E = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "rated_game_tips_setup_singular");
                if (var2 != null) {
                  ov.field_k = uu.a(var2, (byte) 105);
                }
                var2 = NodeIterator.a(param0 ^ -100, "rated_game_tips_setup_plural");
                if (var2 != null) {
                  dr.field_x = uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "waiting_to_start_hint");
                if (var2 != null) {
                  cg.field_i = uu.a(var2, (byte) 64);
                }
                var2 = NodeIterator.a(50, "your_game");
                if (var2 != null) {
                  tp.field_f = uu.a(var2, (byte) 10);
                }
                var2 = NodeIterator.a(50, "game_full");
                if (var2 != null) {
                  TelefragEvent.field_y = uu.a(var2, (byte) 28);
                }
                var2 = NodeIterator.a(50, "join_requests_one");
                if (null != var2) {
                  vf.field_c = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "join_requests_many");
                if (null != var2) {
                  UnitSpell.field_h = uu.a(var2, (byte) 20);
                }
                var2 = NodeIterator.a(50, "xs_game");
                if (var2 != null) {
                  CampaignMenu.field_m = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "waiting_for_x_to_start_game");
                if (null != var2) {
                  wt.field_F = uu.a(var2, (byte) 119);
                }
                var2 = NodeIterator.a(50, "game_options_changed");
                if (null != var2) {
                  CorpseConditionMarker.field_t = uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "players_x_of_y");
                if (null != var2) {
                  ws.field_T = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "message_lobby");
                if (null != var2) {
                  wh.field_b = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(param0 + 132, "quickchat_lobby");
                if (null != var2) {
                  FixedQuaternion.field_g = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "message_game");
                if (null != var2) {
                  CampaignMenu.field_q = uu.a(var2, (byte) 51);
                }
                var2 = NodeIterator.a(50, "message_team");
                if (null != var2) {
                  l.field_d = uu.a(var2, (byte) 118);
                }
                var2 = NodeIterator.a(param0 ^ -100, "quickchat_game");
                if (var2 != null) {
                  CampaignMenuEntry.field_E = uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "kick");
                if (var2 != null) {
                  bq.field_a = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(param0 + 132, "inviting_x");
                if (null != var2) {
                  AiPlanningStrategy.field_g = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(param0 ^ -100, "x_wants_to_join");
                if (var2 != null) {
                  DeployEvent.field_G = uu.a(var2, (byte) 90);
                }
                var2 = NodeIterator.a(50, "accept");
                if (var2 != null) {
                  LeaderEscortCondition.field_g = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "reject");
                if (var2 != null) {
                  SpellConfirmationDialog.field_l = uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "invite");
                if (var2 != null) {
                  bq.field_b = uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(50, "status_concluded");
                if (null != var2) {
                  kw.field_Q = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "status_spectate");
                if (null != var2) {
                  re.field_E = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(param0 + 132, "status_playing");
                if (null != var2) {
                  bi.field_d = uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "status_join");
                if (null != var2) {
                  fl.field_l = uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "status_private");
                if (null != var2) {
                  ClientUiComponent.field_zb = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "status_full");
                if (var2 != null) {
                  AnimationFrameSet.field_I = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "players_in_game");
                if (var2 != null) {
                  dh.field_i = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "you_are_invited_to_xs_game");
                if (var2 != null) {
                  sq.field_n = uu.a(var2, (byte) 41);
                }
                var2 = NodeIterator.a(50, "asking_to_join_xs_game");
                if (var2 != null) {
                  GameplayController.field_A = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "who_can_join");
                if (null != var2) {
                  vu.field_P = uu.a(var2, (byte) 93);
                }
                var2 = NodeIterator.a(50, "you_can_join");
                if (null != var2) {
                  AttackEvent.field_K = uu.a(var2, (byte) 96);
                }
                var2 = NodeIterator.a(50, "you_can_ask_to_join");
                if (null != var2) {
                  mv.field_e = uu.a(var2, (byte) 82);
                }
                var2 = NodeIterator.a(50, "you_cannot_join_in_progress");
                if (var2 != null) {
                  SummonRequest.field_y = uu.a(var2, (byte) 82);
                }
                var2 = NodeIterator.a(param0 + 132, "you_can_spectate");
                if (null != var2) {
                  ak.field_e = uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "you_can_not_spectate");
                if (var2 != null) {
                  jj.field_d = uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "spectate_xs_game");
                if (null != var2) {
                  SectorCacheStore.field_k = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "hide_players_in_xs_game");
                if (null != var2) {
                  cp.field_g = uu.a(var2, (byte) 3);
                }
                var2 = NodeIterator.a(50, "show_players_in_xs_game");
                if (var2 != null) {
                  fs.field_a = uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "connecting_to_friend_server_twoline");
                if (null != var2) {
                  TeleportAction.field_u = uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "loading");
                if (null != var2) {
                  ef.field_a = uu.a(var2, (byte) 64);
                }
                var2 = NodeIterator.a(50, "offline");
                if (var2 != null) {
                  BattleTutorial.field_i = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "multiconst_invite_only");
                if (null != var2) {
                  AttackEvent.field_D = uu.a(var2, (byte) 89);
                }
                var2 = NodeIterator.a(50, "multiconst_clan");
                if (null != var2) {
                  pc.field_i = uu.a(var2, (byte) 9);
                }
                var2 = NodeIterator.a(50, "multiconst_friends");
                if (null != var2) {
                  kd.field_L = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "multiconst_similar_rating");
                if (null != var2) {
                  ek.field_f = uu.a(var2, (byte) 45);
                }
                var2 = NodeIterator.a(50, "multiconst_open");
                if (var2 != null) {
                  io.field_p = uu.a(var2, (byte) 83);
                }
                var2 = NodeIterator.a(50, "no_options_available");
                if (null != var2) {
                  QuickChatCategory.field_F = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "reportabuse");
                if (var2 != null) {
                  CampaignMenu.field_n = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "presstabtochat");
                if (null != var2) {
                  ll.field_Tb = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "pressf10toquickchat");
                if (var2 != null) {
                  ml.field_Lb = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "dob_chatdisabled");
                if (null != var2) {
                  dc.field_l = uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(param0 + 132, "dob_enterforchat");
                if (null != var2) {
                  QuickChatMenu.field_Nb = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "tab_hidechattemporarily");
                if (var2 != null) {
                  nk.field_t = uu.a(var2, (byte) 51);
                }
                var2 = NodeIterator.a(param0 + 132, "esc_cancelprivatemessage");
                if (var2 != null) {
                  bq.field_d = uu.a(var2, (byte) 113);
                }
                var2 = NodeIterator.a(50, "esc_cancelthisline");
                if (null != var2) {
                  FixedQuaternion.field_c = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "privatequickchat_from_x");
                if (var2 != null) {
                  ov.field_l = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "privatequickchat_to_x");
                if (var2 != null) {
                  ta.field_Q = uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(param0 + 132, "privatechat_blankarea_explanation");
                if (null != var2) {
                  os.field_q = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(param0 ^ -100, "publicchat_unavailable_ratedgame");
                if (null != var2) {
                  wc.field_K = uu.a(var2, (byte) 15);
                }
                var2 = NodeIterator.a(param0 + 132, "privatechat_friend_offline");
                if (var2 != null) {
                  pt.field_gb = uu.a(var2, (byte) 15);
                }
                var2 = NodeIterator.a(50, "privatechat_friend_notlisted");
                if (var2 != null) {
                  DiskCacheWorker.field_h = uu.a(var2, (byte) 28);
                }
                var2 = NodeIterator.a(param0 ^ -100, "chatviewscrolledup");
                if (var2 != null) {
                  CacheEntry.field_w = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(param0 + 132, "thisisrunescapeclan");
                if (var2 != null) {
                  ActionSpell.field_f = uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(param0 + 132, "thisisrunescapeclan_notowner");
                if (null != var2) {
                  op.field_a = uu.a(var2, (byte) 116);
                }
                var2 = NodeIterator.a(50, "runescapeclan");
                if (var2 != null) {
                  AiInfluenceMap.field_j = uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "rated_membersonly");
                if (null != var2) {
                  uh.field_a = uu.a(var2, (byte) 23);
                }
                var2 = NodeIterator.a(50, "gameopt_membersonly");
                if (var2 != null) {
                  gt.field_a = uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(50, "gameopt_1moreratedgame");
                if (null != var2) {
                  bt.field_a = uu.a(var2, (byte) 22);
                }
                var2 = NodeIterator.a(50, "gameopt_moreratedgames");
                if (var2 != null) {
                  ByteStorage.field_a = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_needrating");
                if (null != var2) {
                  AnimationSequence.field_k = uu.a(var2, (byte) 47);
                }
                var2 = NodeIterator.a(param0 ^ -100, "gameopt_unratedonly");
                if (var2 != null) {
                  TaggedMapData.field_h = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "gameopt_notunlocked");
                if (null != var2) {
                  ParasiteEvent.field_F = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "gameopt_cannotbecombined1");
                if (null != var2) {
                  ab.field_e = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "gameopt_cannotbecombined2");
                if (null != var2) {
                  mj.field_a = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "gameopt_playernotmember");
                if (var2 != null) {
                  TickCounter.field_b = uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(param0 ^ -100, "gameopt_younotmember");
                if (var2 != null) {
                  is.field_a = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "gameopt_playerneedsrating");
                if (var2 != null) {
                  bk.field_g = uu.a(var2, (byte) 24);
                }
                var2 = NodeIterator.a(50, "gameopt_youneedrating");
                if (var2 != null) {
                  vi.field_b = uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(param0 ^ -100, "gameopt_playerneedsratedgames");
                if (var2 != null) {
                  oc.field_Ib = uu.a(var2, (byte) 3);
                }
                var2 = NodeIterator.a(param0 ^ -100, "gameopt_youneedratedgames");
                if (var2 != null) {
                  GlobalSpell.field_j = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "gameopt_playerneeds1ratedgame");
                if (null != var2) {
                  co.field_r = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_youneed1ratedgame");
                if (var2 != null) {
                  tn.field_Y = uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "gameopt_playerhasntunlocked");
                if (null != var2) {
                  h.field_f = uu.a(var2, (byte) 15);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_youhaventunlocked");
                if (var2 != null) {
                  EventPresenter.field_l = uu.a(var2, (byte) 88);
                }
                var2 = NodeIterator.a(50, "gameopt_trychanging1");
                if (var2 != null) {
                  tp.field_c = uu.a(var2, (byte) 113);
                }
                var2 = NodeIterator.a(50, "gameopt_trychanging2");
                if (var2 != null) {
                  IterableDualNodeDeque.field_d = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_needchanging1");
                if (null != var2) {
                  BufferedFile.field_e = uu.a(var2, (byte) 41);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_needchanging2");
                if (null != var2) {
                  nm.field_u = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "gameopt_mightchange");
                if (null != var2) {
                  DirectByteStorage.field_l = uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(50, "gameopt_playersdontqualify");
                if (null != var2) {
                  ResourceArchive.field_f = uu.a(var2, (byte) 46);
                }
                var2 = NodeIterator.a(param0 ^ -100, "gameopt_playersdontqualify_selectgametab");
                if (var2 != null) {
                  Battlefield.field_pb = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "gameopt_unselectedoptions");
                if (null != var2) {
                  rd.field_f = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "gameopt_pleaseselectoption1");
                if (var2 != null) {
                  TeamRoster.field_d = uu.a(var2, (byte) 73);
                }
                var2 = NodeIterator.a(50, "gameopt_pleaseselectoption2");
                if (null != var2) {
                  ol.field_x = uu.a(var2, (byte) 93);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_badnumplayers");
                if (var2 != null) {
                  l.field_h = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(param0 + 132, "gameopt_inviteplayers_or_trychanging1");
                if (null != var2) {
                  er.field_c = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "gameopt_inviteplayers_or_trychanging2");
                if (null != var2) {
                  au.field_Jb = uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(50, "gameopt_novalidcombos");
                if (var2 != null) {
                  kp.field_e = uu.a(var2, (byte) -112);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = NodeIterator.a(50, "gameopt_pleasetrychanging");
                if (null != var2) {
                  ov.field_j = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "ra_title");
                if (null != var2) {
                  ij.field_u = uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "ra_mutethisplayer");
                if (var2 != null) {
                  SpellCastAction.field_v = uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(param0 ^ -100, "ra_suggestmute");
                if (null != var2) {
                  jq.field_E = uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "ra_intro");
                if (var2 != null) {
                  ii.field_c = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(50, "ra_intro_no_name");
                if (var2 != null) {
                  ot.field_F = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "ra_explanation");
                if (null != var2) {
                  mk.field_d = uu.a(var2, (byte) 107);
                }
                var2 = NodeIterator.a(50, "rule_pillar_0");
                if (var2 != null) {
                  is.field_g = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "rule_0_0");
                if (var2 != null) {
                  bs.field_c = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "rule_0_1");
                if (null != var2) {
                  wt.field_E = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(param0 + 132, "rule_0_2");
                if (var2 != null) {
                  ClientConnectionState.field_f = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(param0 ^ -100, "rule_0_3");
                if (var2 != null) {
                  vs.field_d = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "rule_0_4");
                if (null != var2) {
                  AnimationSkeleton.field_r = uu.a(var2, (byte) 8);
                }
                var2 = NodeIterator.a(param0 + 132, "rule_0_5");
                if (var2 != null) {
                  IntrusiveNode.field_c = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "rule_pillar_1");
                if (null != var2) {
                  SpellCastAction.field_y = uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "rule_1_0");
                if (null != var2) {
                  tv.field_e = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "rule_1_1");
                if (var2 != null) {
                  qc.field_b = uu.a(var2, (byte) 87);
                }
                var2 = NodeIterator.a(50, "rule_1_2");
                if (var2 != null) {
                  sf.field_Q = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 + 132, "rule_1_3");
                if (null != var2) {
                  ih.field_X = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "rule_1_4");
                if (var2 != null) {
                  MatchSetupPanel.field_d = uu.a(var2, (byte) 45);
                }
                var2 = NodeIterator.a(50, "rule_pillar_2");
                if (null != var2) {
                  op.field_d = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "rule_2_0");
                if (var2 != null) {
                  EffectPresentation.field_b = uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "rule_2_1");
                if (null != var2) {
                  dq.field_f = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "rule_2_2");
                if (null != var2) {
                  pf.field_f = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "createafreeaccount");
                if (var2 != null) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(50, "cancel");
                if (null != var2) {
                  ac.field_s = uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(50, "pleaselogintoplay");
                if (var2 != null) {
                  uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "pleaselogin");
                if (var2 != null) {
                  uu.a(var2, (byte) 60);
                }
                var2 = NodeIterator.a(50, "pleaselogin_member");
                if (var2 != null) {
                  uu.a(var2, (byte) 44);
                }
                var2 = NodeIterator.a(param0 + 132, "invaliduserorpass");
                if (var2 != null) {
                  rs.field_x = uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "pleasetryagain");
                if (null != var2) {
                  SummonAction.field_D = uu.a(var2, (byte) 125);
                }
                var2 = NodeIterator.a(50, "pleasereenterpass");
                if (var2 != null) {
                  uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(50, "playfreeversion");
                if (var2 != null) {
                  IconTextComponent.field_Jb = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "reloadgame");
                if (var2 != null) {
                  QuickChatCommandDefinition.field_d = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "toserverlist");
                if (var2 != null) {
                  te.field_m = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "tocustomersupport");
                if (null != var2) {
                  CombatEvent.field_O = uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(50, "changedisplayname");
                if (var2 != null) {
                  BattleTutorial.field_b = uu.a(var2, (byte) 63);
                }
                var2 = NodeIterator.a(50, "returntohomepage");
                if (var2 != null) {
                  uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "justplay");
                if (var2 != null) {
                  pi.field_O = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "justplay_excl");
                if (null != var2) {
                  uu.a(var2, (byte) 14);
                }
                var2 = NodeIterator.a(50, "login");
                if (null != var2) {
                  ResourceRequest.field_v = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(param0 + 132, "goback");
                if (null != var2) {
                  pt.field_Y = uu.a(var2, (byte) 67);
                }
                var2 = NodeIterator.a(50, "otheroptions");
                if (null != var2) {
                  uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "proceed");
                if (var2 != null) {
                  uu.a(var2, (byte) 43);
                }
                var2 = NodeIterator.a(50, "connectingtoserver");
                if (var2 != null) {
                  uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(param0 ^ -100, "pleasewait");
                if (null != var2) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "logging_in");
                if (var2 != null) {
                  MapLayout.field_o = uu.a(var2, (byte) 62);
                }
                var2 = NodeIterator.a(50, "reconnect");
                if (var2 != null) {
                  uu.a(var2, (byte) 99);
                }
                var2 = NodeIterator.a(50, "backtoerror");
                if (var2 != null) {
                  uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "pleasecheckinternet");
                if (var2 != null) {
                  uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "attemptingtoreconnect");
                if (var2 != null) {
                  uu.a(var2, (byte) 46);
                }
                var2 = NodeIterator.a(50, "connectionlost_reconnecting");
                if (null != var2) {
                  CachedArchiveProvider.field_z = uu.a(var2, (byte) 80);
                }
                var2 = NodeIterator.a(50, "connectionlost_withreason");
                if (null != var2) {
                  wv.field_d = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "passwordverificationrequired");
                if (var2 != null) {
                  uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "invalidpass");
                if (var2 != null) {
                  rq.field_o = uu.a(var2, (byte) 115);
                }
                var2 = NodeIterator.a(50, "retry");
                if (null != var2) {
                  RegionAnchor.field_k = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "back");
                if (null != var2) {
                  fj.field_a = uu.a(var2, (byte) 11);
                }
                var2 = NodeIterator.a(param0 + 132, "exitfullscreenmode");
                if (null != var2) {
                  uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "quittowebsite");
                if (var2 != null) {
                  dt.field_c = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(param0 ^ -100, "connectionrestored");
                if (null != var2) {
                  QuickChatCategory.field_B = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 + 132, "warning_ifyouquit");
                if (var2 != null) {
                  VineGrowthAction.field_v = uu.a(var2, (byte) 72);
                }
                var2 = NodeIterator.a(50, "warning_ifyouquitorleavepage");
                if (null != var2) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "resubscribe_withoutlosing_fs");
                if (null != var2) {
                  uu.a(var2, (byte) 29);
                }
                var2 = NodeIterator.a(50, "resubscribe_withoutlosing");
                if (var2 != null) {
                  uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(50, "customersupport_withoutlosing_fs");
                if (var2 != null) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "customersupport_withoutlosing");
                if (var2 != null) {
                  uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(50, "js5help_withoutlosing_fs");
                if (var2 != null) {
                  uu.a(var2, (byte) 36);
                }
                var2 = NodeIterator.a(50, "js5help_withoutlosing");
                if (var2 != null) {
                  uu.a(var2, (byte) 55);
                }
                var2 = NodeIterator.a(param0 + 132, "checkinternet_withoutlosing_fs");
                if (var2 != null) {
                  uu.a(var2, (byte) 66);
                }
                var2 = NodeIterator.a(50, "checkinternet_withoutlosing");
                if (var2 != null) {
                  uu.a(var2, (byte) 94);
                }
                var2 = NodeIterator.a(50, "create_intro");
                if (null != var2) {
                  uu.a(var2, (byte) 26);
                }
                var2 = NodeIterator.a(50, "create_sameaccounttip_unnamed");
                if (var2 != null) {
                  uu.a(var2, (byte) 51);
                }
                var2 = NodeIterator.a(50, "dateofbirthprompt");
                if (null != var2) {
                  uu.a(var2, (byte) 44);
                }
                var2 = NodeIterator.a(50, "fetchingcountrylist");
                if (var2 != null) {
                  uu.a(var2, (byte) 102);
                }
                var2 = NodeIterator.a(50, "countryprompt");
                if (var2 != null) {
                  uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "countrylisterror");
                if (var2 != null) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "theonlypersonalquestions");
                if (var2 != null) {
                  uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "create_submittingdata");
                if (var2 != null) {
                  uu.a(var2, (byte) 124);
                }
                var2 = NodeIterator.a(param0 ^ -100, "check");
                if (var2 != null) {
                  uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(50, "create_pleasechooseausername");
                if (null != var2) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "create_usernameblurb");
                if (var2 != null) {
                  uu.a(var2, (byte) 102);
                }
                var2 = NodeIterator.a(50, "checkingavailability");
                if (null != var2) {
                  uu.a(var2, (byte) 102);
                }
                var2 = NodeIterator.a(50, "checking");
                if (var2 != null) {
                  gt.field_h = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "create_namealreadytaken");
                if (null != var2) {
                  uu.a(var2, (byte) 36);
                }
                var2 = NodeIterator.a(50, "create_sameaccounttip_named");
                if (null != var2) {
                  uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "create_nosuggestions");
                if (var2 != null) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "create_alternativelygoback");
                if (var2 != null) {
                  uu.a(var2, (byte) 79);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_available");
                if (var2 != null) {
                  uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_willnowshowtermsandconditions");
                if (null != var2) {
                  uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "fetchingterms");
                if (var2 != null) {
                  uu.a(var2, (byte) 86);
                }
                var2 = NodeIterator.a(50, "termserror");
                if (null != var2) {
                  uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "create_iagree");
                if (var2 != null) {
                  uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "create_idisagree");
                if (var2 != null) {
                  uu.a(var2, (byte) 54);
                }
                var2 = NodeIterator.a(50, "create_pleasescrolldowntoaccept");
                if (null != var2) {
                  uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_linkaddress");
                if (var2 != null) {
                  uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "openinpopupwindow");
                if (var2 != null) {
                  DiskCacheRequest.field_I = uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "create");
                if (null != var2) {
                  ed.field_c = uu.a(var2, (byte) 94);
                }
                var2 = NodeIterator.a(50, "create_pleasechooseapassword");
                if (null != var2) {
                  uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "create_passwordblurb");
                if (null != var2) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "create_nevergivepassword");
                if (var2 != null) {
                  uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(param0 + 132, "creatingyouraccount");
                if (var2 != null) {
                  wm.field_d = uu.a(var2, (byte) 107);
                }
                var2 = NodeIterator.a(param0 + 132, "create_youmustaccept");
                if (null != var2) {
                  uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "create_passwordsdifferent");
                if (null != var2) {
                  uu.a(var2, (byte) 32);
                }
                var2 = NodeIterator.a(param0 + 132, "create_success");
                if (var2 != null) {
                  uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "day");
                if (null != var2) {
                  mi.field_z = uu.a(var2, (byte) 107);
                }
                var2 = NodeIterator.a(50, "month");
                if (var2 != null) {
                  eb.field_e = uu.a(var2, (byte) 94);
                }
                var2 = NodeIterator.a(param0 + 132, "year");
                if (null != var2) {
                  BattleTutorial.field_l = uu.a(var2, (byte) 89);
                }
                var2 = NodeIterator.a(50, "monthnames,0");
                if (var2 != null) {
                  fj.field_q[0] = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "monthnames,1");
                if (var2 != null) {
                  fj.field_q[1] = uu.a(var2, (byte) 26);
                }
                var2 = NodeIterator.a(50, "monthnames,2");
                if (var2 != null) {
                  fj.field_q[2] = uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "monthnames,3");
                if (var2 != null) {
                  fj.field_q[3] = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "monthnames,4");
                if (null != var2) {
                  fj.field_q[4] = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "monthnames,5");
                if (var2 != null) {
                  fj.field_q[5] = uu.a(var2, (byte) 68);
                }
                var2 = NodeIterator.a(50, "monthnames,6");
                if (var2 != null) {
                  fj.field_q[6] = uu.a(var2, (byte) 123);
                }
                var2 = NodeIterator.a(param0 + 132, "monthnames,7");
                if (var2 != null) {
                  fj.field_q[7] = uu.a(var2, (byte) 75);
                }
                var2 = NodeIterator.a(50, "monthnames,8");
                if (var2 != null) {
                  fj.field_q[8] = uu.a(var2, (byte) 122);
                }
                var2 = NodeIterator.a(50, "monthnames,9");
                if (null != var2) {
                  fj.field_q[9] = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(param0 ^ -100, "monthnames,10");
                if (var2 != null) {
                  fj.field_q[10] = uu.a(var2, (byte) 33);
                }
                var2 = NodeIterator.a(50, "monthnames,11");
                if (var2 != null) {
                  fj.field_q[11] = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "create_welcome");
                if (null != var2) {
                  aq.field_a = uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "create_u13_welcome");
                if (null != var2) {
                  uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "create_createanaccount");
                if (null != var2) {
                  li.field_p = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "create_username");
                if (var2 != null) {
                  uu.a(var2, (byte) 86);
                }
                var2 = NodeIterator.a(50, "create_displayname");
                if (var2 != null) {
                  fq.field_k = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "create_password");
                if (null != var2) {
                  jj.field_h = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "create_password_confirm");
                if (null != var2) {
                  tf.field_m = uu.a(var2, (byte) 68);
                }
                var2 = NodeIterator.a(50, "create_email");
                if (var2 != null) {
                  tn.field_X = uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(50, "create_email_confirm");
                if (null != var2) {
                  TrianglePulse.field_j = uu.a(var2, (byte) 48);
                }
                var2 = NodeIterator.a(50, "create_age");
                if (null != var2) {
                  kd.field_S = uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "create_u13_email");
                if (var2 != null) {
                  uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_u13_email_confirm");
                if (var2 != null) {
                  uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(50, "create_dob");
                if (null != var2) {
                  uu.a(var2, (byte) 38);
                }
                var2 = NodeIterator.a(50, "create_country");
                if (null != var2) {
                  uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "create_alternatives_header");
                if (var2 != null) {
                  uu.a(var2, (byte) 79);
                }
                var2 = NodeIterator.a(50, "create_alternatives_select");
                if (null != var2) {
                  uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "create_suggestions");
                if (null != var2) {
                  we.field_i = uu.a(var2, (byte) 12);
                }
                var2 = NodeIterator.a(50, "create_more_suggestions");
                if (null != var2) {
                  h.field_h = uu.a(var2, (byte) 57);
                }
                var2 = NodeIterator.a(50, "create_select_alternative");
                if (null != var2) {
                  wl.field_J = uu.a(var2, (byte) 19);
                }
                var2 = NodeIterator.a(param0 + 132, "create_optin_news");
                if (var2 != null) {
                  IterableDualNodeDeque.field_c = uu.a(var2, (byte) 86);
                }
                var2 = NodeIterator.a(50, "create_agreeterms");
                if (null != var2) {
                  StateChangeEvent.field_D = uu.a(var2, (byte) 116);
                }
                var2 = NodeIterator.a(50, "create_u13terms");
                if (var2 != null) {
                  ih.field_R = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(param0 + 132, "login_username_email");
                if (null != var2) {
                  bh.field_J = uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "login_username");
                if (null != var2) {
                  DualNodeDeque.field_h = uu.a(var2, (byte) 22);
                }
                var2 = NodeIterator.a(50, "login_email");
                if (var2 != null) {
                  DeployAction.field_t = uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(50, "login_username_tooltip");
                if (var2 != null) {
                  de.field_d = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "login_password_tooltip");
                if (null != var2) {
                  uu.a(var2, (byte) 39);
                }
                var2 = NodeIterator.a(50, "login_login_tooltip");
                if (var2 != null) {
                  uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(param0 + 132, "login_create_tooltip");
                if (var2 != null) {
                  hb.field_b = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "login_justplay_tooltip");
                if (var2 != null) {
                  CombatSandbox.field_e = uu.a(var2, (byte) 56);
                }
                var2 = NodeIterator.a(50, "login_back_tooltip");
                if (var2 != null) {
                  uu.a(var2, (byte) 21);
                }
                var2 = NodeIterator.a(param0 + 132, "login_no_displayname");
                if (null != var2) {
                  BattleTutorial.field_u = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_username_tooltip");
                if (var2 != null) {
                  uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "create_username_hint");
                if (null != var2) {
                  uu.a(var2, (byte) 25);
                }
                var2 = NodeIterator.a(50, "create_displayname_tooltip");
                if (var2 != null) {
                  DualLinkedNode.field_m = uu.a(var2, (byte) 60);
                }
                var2 = NodeIterator.a(50, "create_displayname_hint");
                if (var2 != null) {
                  dn.field_Ob = uu.a(var2, (byte) 40);
                }
                var2 = NodeIterator.a(50, "create_password_tooltip");
                if (null != var2) {
                  CachedArchiveProvider.field_k = uu.a(var2, (byte) 87);
                }
                var2 = NodeIterator.a(50, "create_password_hint");
                if (null != var2) {
                  TurnEffectEvent.field_B = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "create_password_confirm_tooltip");
                if (var2 != null) {
                  WeightedScoreStrategy.field_i = uu.a(var2, (byte) 21);
                }
                var2 = NodeIterator.a(50, "create_email_tooltip");
                if (var2 != null) {
                  NodeIterator.field_d = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "create_email_confirm_tooltip");
                if (var2 != null) {
                  oc.field_Jb = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(param0 + 132, "create_age_tooltip");
                if (var2 != null) {
                  StrongCacheEntry.field_A = uu.a(var2, (byte) 50);
                }
                var2 = NodeIterator.a(50, "create_optin_news_tooltip");
                if (var2 != null) {
                  rd.field_g = uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(50, "create_u13_email_tooltip");
                if (null != var2) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(50, "create_u13_email_confirm_tooltip");
                if (var2 != null) {
                  uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "create_dob_tooltip");
                if (null != var2) {
                  uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(param0 + 132, "create_country_tooltip");
                if (var2 != null) {
                  uu.a(var2, (byte) 85);
                }
                var2 = NodeIterator.a(50, "create_optin_tooltip");
                if (null != var2) {
                  uu.a(var2, (byte) 89);
                }
                var2 = NodeIterator.a(50, "create_continue");
                if (null != var2) {
                  uu.a(var2, (byte) 115);
                }
                var2 = NodeIterator.a(50, "create_username_unavailable");
                if (null != var2) {
                  oc.field_Ob = uu.a(var2, (byte) 11);
                }
                var2 = NodeIterator.a(50, "create_username_available");
                if (null != var2) {
                  fa.field_d = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "create_alert_namelength");
                if (null != var2) {
                  pu.field_G = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "create_alert_namechars");
                if (null != var2) {
                  od.field_h = uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "create_alert_nameleadingspace");
                if (var2 != null) {
                  kd.field_U = uu.a(var2, (byte) 103);
                }
                var2 = NodeIterator.a(50, "create_alert_doublespace");
                if (var2 != null) {
                  ul.field_o = uu.a(var2, (byte) 117);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_alert_passchars");
                if (null != var2) {
                  ea.field_c = uu.a(var2, (byte) 13);
                }
                var2 = NodeIterator.a(50, "create_alert_passrepeated");
                if (var2 != null) {
                  CampaignMenu.field_v = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "create_alert_passlength");
                if (null != var2) {
                  mp.field_Pb = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "create_alert_passcontainsname");
                if (null != var2) {
                  de.field_c = uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "create_alert_passcontainsemail");
                if (var2 != null) {
                  p.field_d = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "create_alert_passcontainsname_partial");
                if (null != var2) {
                  er.field_b = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "create_alert_checkname");
                if (null != var2) {
                  uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(param0 + 132, "create_alert_invalidemail");
                if (null != var2) {
                  ArmiesOfGielinor.field_H = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "create_alert_email_unavailable");
                if (null != var2) {
                  hk.field_Ib = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_alert_invaliddate");
                if (var2 != null) {
                  StateChangeEvent.field_z = uu.a(var2, (byte) 30);
                }
                var2 = NodeIterator.a(50, "create_alert_invalidage");
                if (null != var2) {
                  jg.field_n = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "create_alert_yearrange");
                if (var2 != null) {
                  CampaignMenu.field_r = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(param0 ^ -100, "create_alert_mismatch");
                if (var2 != null) {
                  ak.field_j = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "create_passwordvalid");
                if (var2 != null) {
                  vk.field_b = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "create_emailvalid");
                if (var2 != null) {
                  CampaignRewardPreview.field_a = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "create_account_success");
                if (null != var2) {
                  eq.field_i = uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "invalid_name");
                if (null != var2) {
                  SectorCacheStore.field_d = uu.a(var2, (byte) 56);
                }
                var2 = NodeIterator.a(50, "cannot_add_yourself");
                if (null != var2) {
                  MoveAttackRequest.field_F = uu.a(var2, (byte) 113);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unable_to_add_friend");
                if (null != var2) {
                  iv.field_c = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "unable_to_add_ignore");
                if (var2 != null) {
                  ct.field_m = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "unable_to_delete_friend");
                if (null != var2) {
                  PopupPresentation.field_l = uu.a(var2, (byte) 17);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unable_to_delete_ignore");
                if (var2 != null) {
                  EffectPresentation.field_a = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(param0 + 132, "friendlistfull");
                if (var2 != null) {
                  MapLayout.field_m = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "friendlistdupe");
                if (var2 != null) {
                  i.field_Ob = uu.a(var2, (byte) -128);
                }
                var2 = NodeIterator.a(50, "friendnotfound");
                if (null != var2) {
                  TaggedMapData.field_d = uu.a(var2, (byte) 109);
                }
                var2 = NodeIterator.a(50, "ignorelistfull");
                if (var2 != null) {
                  wh.field_d = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "ignorelistdupe");
                if (null != var2) {
                  ts.field_k = uu.a(var2, (byte) 121);
                }
                var2 = NodeIterator.a(50, "ignorenotfound");
                if (null != var2) {
                  CacheEntry.field_x = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "removeignorefirst");
                if (null != var2) {
                  km.field_a = uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(50, "removefriendfirst");
                if (var2 != null) {
                  PopupPresentation.field_p = uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(param0 + 132, "enterfriend_add");
                if (null != var2) {
                  iv.field_a = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "enterfriend_del");
                if (var2 != null) {
                  se.field_b = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(param0 ^ -100, "enterignore_add");
                if (null != var2) {
                  iw.field_o = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "enterignore_del");
                if (null != var2) {
                  lw.field_kb = uu.a(var2, (byte) 81);
                }
                var2 = NodeIterator.a(param0 + 132, "text_removed_from_game");
                if (null != var2) {
                  ContextualRuntimeException.field_d = uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(param0 ^ -100, "text_lobby_pleaselogin_free");
                if (var2 != null) {
                  SpellMenuGroup.field_l = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "opengl");
                if (null != var2) {
                  uu.a(var2, (byte) 109);
                }
                var2 = NodeIterator.a(param0 ^ -100, "sse");
                if (var2 != null) {
                  uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "purejava");
                if (null != var2) {
                  uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(param0 + 132, "waitingfor_graphics");
                if (null != var2) {
                  TileMetadata.field_i = uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "waitingfor_models");
                if (null != var2) {
                  uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(50, "waitingfor_fonts");
                if (var2 != null) {
                  is.field_f = uu.a(var2, (byte) 98);
                }
                var2 = NodeIterator.a(50, "waitingfor_soundeffects");
                if (var2 != null) {
                  ResourceProtocolClient.field_k = uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(param0 ^ -100, "waitingfor_music");
                if (var2 != null) {
                  PacketBuffer.field_m = uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(param0 + 132, "waitingfor_instruments");
                if (var2 != null) {
                  uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(param0 + 132, "waitingfor_levels");
                if (var2 != null) {
                  uu.a(var2, (byte) 92);
                }
                var2 = NodeIterator.a(50, "waitingfor_extradata");
                if (var2 != null) {
                  cr.field_eb = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(param0 ^ -100, "waitingfor_languages");
                if (null != var2) {
                  uu.a(var2, (byte) 45);
                }
                var2 = NodeIterator.a(50, "waitingfor_textures");
                if (null != var2) {
                  uu.a(var2, (byte) 106);
                }
                var2 = NodeIterator.a(50, "waitingfor_animations");
                if (var2 != null) {
                  uu.a(var2, (byte) 119);
                }
                var2 = NodeIterator.a(50, "loading_graphics");
                if (null != var2) {
                  Battlefield.field_nb = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "loading_models");
                if (null != var2) {
                  uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "loading_fonts");
                if (null != var2) {
                  QuickChatPhraseRepository.field_a = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(param0 + 132, "loading_soundeffects");
                if (null != var2) {
                  ds.field_b = uu.a(var2, (byte) -112);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = NodeIterator.a(50, "loading_music");
                if (null != var2) {
                  is.field_d = uu.a(var2, (byte) 119);
                }
                var2 = NodeIterator.a(50, "loading_instruments");
                if (null != var2) {
                  uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "loading_levels");
                if (var2 != null) {
                  uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(50, "loading_extradata");
                if (var2 != null) {
                  en.field_G = uu.a(var2, (byte) 82);
                }
                var2 = NodeIterator.a(50, "loading_languages");
                if (var2 != null) {
                  uu.a(var2, (byte) 101);
                }
                var2 = NodeIterator.a(50, "loading_textures");
                if (null != var2) {
                  uu.a(var2, (byte) 88);
                }
                var2 = NodeIterator.a(50, "loading_animations");
                if (var2 != null) {
                  uu.a(var2, (byte) 98);
                }
                var2 = NodeIterator.a(50, "unpacking_graphics");
                if (var2 != null) {
                  SectorCacheStore.field_i = uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "unpacking_models");
                if (null != var2) {
                  AiPlanner.field_R = uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "unpacking_soundeffects");
                if (var2 != null) {
                  ph.field_a = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "unpacking_music");
                if (var2 != null) {
                  ta.field_M = uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "unpacking_levels");
                if (null != var2) {
                  uu.a(var2, (byte) 101);
                }
                var2 = NodeIterator.a(param0 + 132, "unpacking_languages");
                if (var2 != null) {
                  uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "unpacking_animations");
                if (null != var2) {
                  uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "unpacking_toolkit");
                if (var2 != null) {
                  uu.a(var2, (byte) 28);
                }
                var2 = NodeIterator.a(50, "instructions");
                if (null != var2) {
                  PointerInputHandler.field_d = uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(param0 ^ -100, "tutorial");
                if (var2 != null) {
                  uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(param0 + 132, "playtutorial");
                if (null != var2) {
                  uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(50, "sound_colon");
                if (var2 != null) {
                  su.field_c = uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "music_colon");
                if (null != var2) {
                  InstructionsPanel.field_c = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "fullscreen");
                if (var2 != null) {
                  uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "screensize");
                if (null != var2) {
                  AiInfluenceMap.field_k = uu.a(var2, (byte) 39);
                }
                var2 = NodeIterator.a(param0 ^ -100, "highscores");
                if (var2 != null) {
                  bj.field_o = uu.a(var2, (byte) 126);
                }
                var2 = NodeIterator.a(param0 + 132, "rankings");
                if (var2 != null) {
                  el.field_a = uu.a(var2, (byte) 10);
                }
                var2 = NodeIterator.a(50, "achievements");
                if (var2 != null) {
                  s.field_b = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "achievementsthisgame");
                if (var2 != null) {
                  uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(param0 + 132, "achievementsthissession");
                if (var2 != null) {
                  uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "watchintroduction");
                if (var2 != null) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "quit");
                if (null != var2) {
                  InstructionsPanel.field_y = uu.a(var2, (byte) 96);
                }
                var2 = NodeIterator.a(50, "login_createaccount");
                if (null != var2) {
                  NodeHashIterator.field_h = uu.a(var2, (byte) 26);
                }
                var2 = NodeIterator.a(param0 + 132, "tohighscores");
                if (null != var2) {
                  uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "returntomainmenu");
                if (var2 != null) {
                  eq.field_e = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "returntopausemenu");
                if (var2 != null) {
                  uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "returntooptionsmenu_notpaused");
                if (null != var2) {
                  uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "mainmenu");
                if (null != var2) {
                  uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(param0 + 132, "pausemenu");
                if (null != var2) {
                  ai.field_U = uu.a(var2, (byte) 54);
                }
                var2 = NodeIterator.a(50, "optionsmenu_notpaused");
                if (var2 != null) {
                  hf.field_i = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "menu");
                if (var2 != null) {
                  gp.field_c = uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(param0 + 132, "selectlevel");
                if (var2 != null) {
                  uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "nextlevel");
                if (null != var2) {
                  uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "startgame");
                if (var2 != null) {
                  ArchiveProvider.field_b = uu.a(var2, (byte) 48);
                }
                var2 = NodeIterator.a(50, "newgame");
                if (null != var2) {
                  NetworkResourceRequest.field_G = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "resumegame");
                if (var2 != null) {
                  uu.a(var2, (byte) 66);
                }
                var2 = NodeIterator.a(param0 ^ -100, "resumetutorial");
                if (var2 != null) {
                  uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "skip");
                if (null != var2) {
                  StateChangeEvent.field_y = uu.a(var2, (byte) 33);
                }
                var2 = NodeIterator.a(50, "skiptutorial");
                if (var2 != null) {
                  uu.a(var2, (byte) 121);
                }
                var2 = NodeIterator.a(param0 ^ -100, "skipending");
                if (var2 != null) {
                  uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(param0 + 132, "restartlevel");
                if (var2 != null) {
                  GameEvent.field_u = uu.a(var2, (byte) 4);
                }
                var2 = NodeIterator.a(50, "endtest");
                if (var2 != null) {
                  uu.a(var2, (byte) 9);
                }
                var2 = NodeIterator.a(50, "endgame");
                if (var2 != null) {
                  PreparedAction.field_k = uu.a(var2, (byte) 101);
                }
                var2 = NodeIterator.a(param0 + 132, "endtutorial");
                if (var2 != null) {
                  uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "ok");
                if (var2 != null) {
                  ul.field_f = uu.a(var2, (byte) -125);
                }
                if (param0 != -82) {
                  field_c = (String) null;
                }
                var2 = NodeIterator.a(50, "on");
                if (null != var2) {
                  uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(param0 ^ -100, "off");
                if (var2 != null) {
                  uu.a(var2, (byte) 107);
                }
                var2 = NodeIterator.a(50, "previous");
                if (null != var2) {
                  hq.field_d = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "prev");
                if (null != var2) {
                  uu.a(var2, (byte) 82);
                }
                var2 = NodeIterator.a(50, "next");
                if (null != var2) {
                  ClientConnectionState.field_e = uu.a(var2, (byte) 101);
                }
                var2 = NodeIterator.a(50, "graphics_colon");
                if (null != var2) {
                  uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(param0 ^ -100, "hotseatmultiplayer");
                if (null != var2) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "entermultiplayerlobby");
                if (var2 != null) {
                  la.field_e = uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "singleplayergame");
                if (null != var2) {
                  uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "returntogame");
                if (var2 != null) {
                  ClientConnectionState.field_b = uu.a(var2, (byte) 75);
                }
                var2 = NodeIterator.a(50, "endgameresign");
                if (var2 != null) {
                  uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "offerdraw");
                if (null != var2) {
                  uu.field_c = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "canceldraw");
                if (null != var2) {
                  np.field_Jb = uu.a(var2, (byte) 69);
                }
                var2 = NodeIterator.a(50, "acceptdraw");
                if (null != var2) {
                  MatchSetupPanel.field_O = uu.a(var2, (byte) 118);
                }
                var2 = NodeIterator.a(param0 + 132, "resign");
                if (null != var2) {
                  tf.field_p = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "returntolobby");
                if (null != var2) {
                  DeployAction.field_v = uu.a(var2, (byte) 86);
                }
                var2 = NodeIterator.a(50, "cont");
                if (null != var2) {
                  ro.field_kb = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "continue_spectating");
                if (var2 != null) {
                  uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "messages");
                if (null != var2) {
                  uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(param0 ^ -100, "graphics_fastest");
                if (null != var2) {
                  uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "graphics_medium");
                if (var2 != null) {
                  uu.a(var2, (byte) 24);
                }
                var2 = NodeIterator.a(50, "graphics_best");
                if (null != var2) {
                  uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(50, "graphics_directx");
                if (null != var2) {
                  uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "graphics_opengl");
                if (null != var2) {
                  uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "graphics_java");
                if (var2 != null) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(50, "graphics_quality_high");
                if (var2 != null) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "graphics_quality_low");
                if (null != var2) {
                  uu.a(var2, (byte) 50);
                }
                var2 = NodeIterator.a(50, "graphics_mode");
                if (var2 != null) {
                  uu.a(var2, (byte) 99);
                }
                var2 = NodeIterator.a(50, "graphics_quality");
                if (var2 != null) {
                  uu.a(var2, (byte) 25);
                }
                var2 = NodeIterator.a(param0 + 132, "mode");
                if (null != var2) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(param0 ^ -100, "quality");
                if (null != var2) {
                  uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(50, "keys");
                if (null != var2) {
                  uu.a(var2, (byte) 98);
                }
                var2 = NodeIterator.a(param0 + 132, "objective");
                if (var2 != null) {
                  uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "currentobjective");
                if (null != var2) {
                  uu.a(var2, (byte) 119);
                }
                var2 = NodeIterator.a(50, "pressescforpausemenu");
                if (var2 != null) {
                  uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "pressescforpausemenuortoskiptutorial");
                if (null != var2) {
                  uu.a(var2, (byte) 120);
                }
                var2 = NodeIterator.a(param0 + 132, "pressescforoptionsmenu_doesntpause");
                if (null != var2) {
                  uu.a(var2, (byte) 78);
                }
                var2 = NodeIterator.a(50, "pressescforoptionsmenu_doesntpause_short");
                if (null != var2) {
                  uu.a(var2, (byte) 7);
                }
                var2 = NodeIterator.a(50, "powerups");
                if (null != var2) {
                  uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "latestlevel_suffix");
                if (var2 != null) {
                  uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unreachedlevel_name");
                if (var2 != null) {
                  uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unreachedlevel_cannotplayreason");
                if (null != var2) {
                  uu.a(var2, (byte) 116);
                }
                var2 = NodeIterator.a(50, "unreachedlevel_cannotplayreason_shorter");
                if (var2 != null) {
                  uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(50, "unreachedworld_cannotplayreason");
                if (var2 != null) {
                  uu.a(var2, (byte) 112);
                }
                var2 = NodeIterator.a(50, "memberslevel_name");
                if (null != var2) {
                  uu.a(var2, (byte) 48);
                }
                var2 = NodeIterator.a(50, "memberslevel_cannotplayreason");
                if (null != var2) {
                  uu.a(var2, (byte) 99);
                }
                var2 = NodeIterator.a(50, "membersworld_cannotplayreason");
                if (var2 != null) {
                  uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "unreachedlevel_createtip");
                if (null != var2) {
                  uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "unreachedlevel_createtip_line1");
                if (var2 != null) {
                  uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(param0 ^ -100, "unreachedlevel_createtip_line2");
                if (null != var2) {
                  uu.a(var2, (byte) -109);
                }
                var2 = NodeIterator.a(param0 + 132, "unreachedlevel_logintip");
                if (var2 != null) {
                  uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "memberslevel_logintip");
                if (var2 != null) {
                  uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "displayname_none");
                if (var2 != null) {
                  uu.a(var2, (byte) 91);
                }
                var2 = NodeIterator.a(param0 + 132, "levelxofy1");
                if (null != var2) {
                  uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(50, "levelxofy2");
                if (var2 != null) {
                  uu.a(var2, (byte) -103);
                }
                var2 = NodeIterator.a(50, "levelxofy");
                if (var2 != null) {
                  uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(50, "ingame_level");
                if (var2 != null) {
                  uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(50, "mouseoveranicon");
                if (var2 != null) {
                  ck.field_a = uu.a(var2, (byte) 96);
                }
                var2 = NodeIterator.a(50, "notyetachieved");
                if (null != var2) {
                  QuickChatCategoryRepository.field_g = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "achieved");
                if (null != var2) {
                  wd.field_f = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "orbpoints");
                if (var2 != null) {
                  uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "orbcoins");
                if (null != var2) {
                  uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "orbpoints_colon");
                if (var2 != null) {
                  rd.field_h = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(param0 ^ -100, "orbcoins_colon");
                if (null != var2) {
                  DiskCacheWorker.field_e = uu.a(var2, (byte) 113);
                }
                var2 = NodeIterator.a(param0 ^ -100, "achieved_colon_description");
                if (null != var2) {
                  uu.a(var2, (byte) 83);
                }
                var2 = NodeIterator.a(param0 + 132, "secretachievement");
                if (null != var2) {
                  UnitCycler.field_d = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "no_highscores");
                if (null != var2) {
                  ed.field_b = uu.a(var2, (byte) 98);
                }
                var2 = NodeIterator.a(50, "hs_name");
                if (null != var2) {
                  uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(param0 + 132, "hs_level");
                if (var2 != null) {
                  uu.a(var2, (byte) 109);
                }
                var2 = NodeIterator.a(50, "hs_fromlevel");
                if (null != var2) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "hs_tolevel");
                if (null != var2) {
                  uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "hs_score");
                if (null != var2) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "hs_end");
                if (var2 != null) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "ingame_score");
                if (var2 != null) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "score_colon");
                if (var2 != null) {
                  uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mp_leavegame");
                if (null != var2) {
                  uu.a(var2, (byte) 2);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mp_offerrematch");
                if (var2 != null) {
                  db.field_h = uu.a(var2, (byte) 78);
                }
                var2 = NodeIterator.a(50, "mp_offerrematch_unrated");
                if (var2 != null) {
                  fa.field_e = uu.a(var2, (byte) 47);
                }
                var2 = NodeIterator.a(50, "mp_acceptrematch");
                if (null != var2) {
                  lk.field_s = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(param0 + 132, "mp_acceptrematch_unrated");
                if (null != var2) {
                  field_c = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "mp_cancelrematch");
                if (var2 != null) {
                  is.field_c = uu.a(var2, (byte) -99);
                }
                var2 = NodeIterator.a(50, "mp_cancelrematch_unrated");
                if (var2 != null) {
                  ti.field_a = uu.a(var2, (byte) 64);
                }
                var2 = NodeIterator.a(50, "mp_rematchnewgame");
                if (var2 != null) {
                  ji.field_b = uu.a(var2, (byte) 28);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mp_rematchnewgame_unrated");
                if (null != var2) {
                  ml.field_Nb = uu.a(var2, (byte) 4);
                }
                var2 = NodeIterator.a(50, "mp_x_wantstodraw");
                if (null != var2) {
                  uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "mp_x_offersrematch");
                if (null != var2) {
                  uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "mp_x_offersrematch_unrated");
                if (var2 != null) {
                  uu.a(var2, (byte) 107);
                }
                var2 = NodeIterator.a(50, "mp_youofferrematch");
                if (var2 != null) {
                  uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "mp_youofferrematch_unrated");
                if (null != var2) {
                  uu.a(var2, (byte) -125);
                }
                var2 = NodeIterator.a(50, "mp_youofferdraw");
                if (var2 != null) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mp_youresigned");
                if (var2 != null) {
                  uu.a(var2, (byte) 126);
                }
                var2 = NodeIterator.a(50, "mp_youresigned_rematch");
                if (null != var2) {
                  uu.a(var2, (byte) 7);
                }
                var2 = NodeIterator.a(50, "mp_x_hasresignedandleft");
                if (var2 != null) {
                  uu.a(var2, (byte) 12);
                }
                var2 = NodeIterator.a(50, "mp_x_hasresigned_rematch");
                if (var2 != null) {
                  uu.a(var2, (byte) -119);
                }
                var2 = NodeIterator.a(50, "mp_x_hasresigned");
                if (null != var2) {
                  uu.a(var2, (byte) 88);
                }
                var2 = NodeIterator.a(50, "mp_x_hasleft");
                if (var2 != null) {
                  uu.a(var2, (byte) 112);
                }
                var2 = NodeIterator.a(50, "mp_x_haswon");
                if (null != var2) {
                  uu.a(var2, (byte) 44);
                }
                var2 = NodeIterator.a(50, "mp_youhavewon");
                if (var2 != null) {
                  uu.a(var2, (byte) 16);
                }
                var2 = NodeIterator.a(50, "mp_gamedrawn");
                if (null != var2) {
                  uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "mp_timeremaining");
                if (var2 != null) {
                  uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "mp_x_turn");
                if (var2 != null) {
                  uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "mp_yourturn");
                if (var2 != null) {
                  uu.a(var2, (byte) 73);
                }
                var2 = NodeIterator.a(50, "gameover");
                if (null != var2) {
                  uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "mp_hidechat");
                if (null != var2) {
                  bn.field_d = uu.a(var2, (byte) -100);
                }
                var2 = NodeIterator.a(50, "mp_showchat_nounread");
                if (null != var2) {
                  lw.field_pb = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(param0 + 132, "mp_showchat_unread1");
                if (var2 != null) {
                  CacheEntry.field_y = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "mp_showchat_unread2");
                if (null != var2) {
                  MovementPlanner.field_s = uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "click_to_quickchat");
                if (var2 != null) {
                  ps.field_z = uu.a(var2, (byte) 65);
                }
                var2 = NodeIterator.a(50, "autorespond");
                if (null != var2) {
                  kt.field_m = uu.a(var2, (byte) 115);
                }
                var2 = NodeIterator.a(50, "quickchat_help");
                if (var2 != null) {
                  GameEvent.field_x = uu.a(var2, (byte) -111);
                }
                var2 = NodeIterator.a(50, "quickchat_help_title");
                if (null != var2) {
                  co.field_j = uu.a(var2, (byte) -115);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_help,0");
                if (var2 != null) {
                  AiUnitPlanner.field_z[0] = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_help,1");
                if (null != var2) {
                  AiUnitPlanner.field_z[1] = uu.a(var2, (byte) -102);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_help,2");
                if (var2 != null) {
                  AiUnitPlanner.field_z[2] = uu.a(var2, (byte) 84);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_help,3");
                if (var2 != null) {
                  AiUnitPlanner.field_z[3] = uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_help,4");
                if (var2 != null) {
                  AiUnitPlanner.field_z[4] = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "quickchat_shortcut_help,5");
                if (var2 != null) {
                  AiUnitPlanner.field_z[5] = uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,0");
                if (var2 != null) {
                  bt.field_c[0] = uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,1");
                if (var2 != null) {
                  bt.field_c[1] = uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,2");
                if (var2 != null) {
                  bt.field_c[2] = uu.a(var2, (byte) 56);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,3");
                if (null != var2) {
                  bt.field_c[3] = uu.a(var2, (byte) 95);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,4");
                if (null != var2) {
                  bt.field_c[4] = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "quickchat_shortcut_keys,5");
                if (var2 != null) {
                  bt.field_c[5] = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(param0 + 132, "keychar_the_character_under_questionmark");
                if (var2 != null) {
                  et.field_a = we.decodeSingleByteCharacter(-121, var2[0]);
                }
                var2 = NodeIterator.a(param0 + 132, "rating_noratings");
                if (null != var2) {
                  wd.field_l = uu.a(var2, (byte) 102);
                }
                var2 = NodeIterator.a(50, "rating_rating");
                if (null != var2) {
                  CampaignQuicksave.field_i = uu.a(var2, (byte) 117);
                }
                var2 = NodeIterator.a(param0 + 132, "rating_played");
                if (var2 != null) {
                  ou.field_f = uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(50, "rating_won");
                if (var2 != null) {
                  ts.field_g = uu.a(var2, (byte) 29);
                }
                var2 = NodeIterator.a(50, "rating_lost");
                if (var2 != null) {
                  vi.field_c = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "rating_drawn");
                if (var2 != null) {
                  hq.field_c = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "benefits_fullscreen");
                if (null != var2) {
                  uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "benefits_noadverts");
                if (var2 != null) {
                  uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "benefits_price");
                if (var2 != null) {
                  uu.a(var2, (byte) 22);
                }
                var2 = NodeIterator.a(50, "members_expansion_benefits,0");
                if (null != var2) {
                  db.field_e[0] = uu.a(var2, (byte) 112);
                }
                var2 = NodeIterator.a(50, "members_expansion_benefits,1");
                if (var2 != null) {
                  db.field_e[1] = uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "members_expansion_benefits,2");
                if (var2 != null) {
                  db.field_e[2] = uu.a(var2, (byte) -101);
                }
                var2 = NodeIterator.a(50, "members_expansion_price_top");
                if (var2 != null) {
                  rv.field_a = uu.a(var2, (byte) 68);
                }
                var2 = NodeIterator.a(50, "members_expansion_price_bottom");
                if (var2 != null) {
                  AnimationFrameSet.field_B = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "reconnect_lost_seq,0");
                if (null != var2) {
                  QuickChatMenu.field_Lb[0] = uu.a(var2, (byte) 121);
                }
                var2 = NodeIterator.a(50, "reconnect_lost_seq,1");
                if (null != var2) {
                  QuickChatMenu.field_Lb[1] = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "reconnect_lost_seq,2");
                if (var2 != null) {
                  QuickChatMenu.field_Lb[2] = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "reconnect_lost_seq,3");
                if (var2 != null) {
                  QuickChatMenu.field_Lb[3] = uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "reconnect_lost");
                if (var2 != null) {
                  uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "reconnect_restored");
                if (null != var2) {
                  uu.a(var2, (byte) 59);
                }
                var2 = NodeIterator.a(50, "reconnect_please_check");
                if (null != var2) {
                  uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(50, "reconnect_wait");
                if (null != var2) {
                  uu.a(var2, (byte) -97);
                }
                var2 = NodeIterator.a(50, "reconnect_retry");
                if (var2 != null) {
                  uu.a(var2, (byte) 75);
                }
                var2 = NodeIterator.a(50, "reconnect_resume");
                if (null != var2) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "reconnect_or");
                if (var2 != null) {
                  uu.a(var2, (byte) 48);
                }
                var2 = NodeIterator.a(50, "reconnect_exitfs");
                if (var2 != null) {
                  uu.a(var2, (byte) 118);
                }
                var2 = NodeIterator.a(50, "reconnect_exitfs_quit");
                if (var2 != null) {
                  uu.a(var2, (byte) 108);
                }
                var2 = NodeIterator.a(50, "reconnect_quit");
                if (var2 != null) {
                  uu.a(var2, (byte) 68);
                }
                var2 = NodeIterator.a(50, "reconnect_check_fs");
                if (null != var2) {
                  uu.a(var2, (byte) 44);
                }
                var2 = NodeIterator.a(50, "reconnect_check_nonfs");
                if (null != var2) {
                  uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "fs_accept_beforeaccept");
                if (null != var2) {
                  c.field_d = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(50, "fs_button_accept");
                if (null != var2) {
                  DualNodeDeque.field_e = uu.a(var2, (byte) 5);
                }
                var2 = NodeIterator.a(param0 ^ -100, "fs_accept_afteraccept");
                if (null != var2) {
                  od.field_e = uu.a(var2, (byte) -106);
                }
                var2 = NodeIterator.a(50, "fs_button_cancel");
                if (var2 != null) {
                  WeightedScoreStrategy.field_m = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(param0 ^ -100, "fs_accept_aftercancel");
                if (null != var2) {
                  ts.field_f = uu.a(var2, (byte) 79);
                }
                var2 = NodeIterator.a(50, "fs_accept_countdown_sing");
                if (null != var2) {
                  db.field_f = uu.a(var2, (byte) 65);
                }
                var2 = NodeIterator.a(50, "fs_accept_countdown_pl");
                if (var2 != null) {
                  SummonAction.field_v = uu.a(var2, (byte) 30);
                }
                var2 = NodeIterator.a(50, "fs_nonmember");
                if (var2 != null) {
                  SummonRequest.field_z = uu.a(var2, (byte) -126);
                }
                var2 = NodeIterator.a(param0 ^ -100, "fs_button_close");
                if (null != var2) {
                  pd.field_f = uu.a(var2, (byte) 74);
                }
                var2 = NodeIterator.a(50, "fs_button_members");
                if (var2 != null) {
                  tg.field_j = uu.a(var2, (byte) 34);
                }
                var2 = NodeIterator.a(50, "fs_unavailable");
                if (null != var2) {
                  ud.field_ab = uu.a(var2, (byte) 70);
                }
                var2 = NodeIterator.a(50, "fs_unavailable_try_signed_applet");
                if (null != var2) {
                  NodeHashIterator.field_a = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "fs_focus");
                if (null != var2) {
                  MoveAttackRequest.field_y = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(param0 ^ -100, "fs_focus_or_resolution");
                if (var2 != null) {
                  ud.field_W = uu.a(var2, (byte) 120);
                }
                var2 = NodeIterator.a(param0 ^ -100, "fs_timeout");
                if (null != var2) {
                  hb.field_a = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(50, "fs_button_tryagain");
                if (var2 != null) {
                  oo.field_j = uu.a(var2, (byte) 73);
                }
                var2 = NodeIterator.a(50, "graphics_ui_fs_countdown");
                if (null != var2) {
                  ls.field_d = uu.a(var2, (byte) 29);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mb_caption_title");
                if (var2 != null) {
                  uu.a(var2, (byte) 5);
                }
                var2 = NodeIterator.a(50, "mb_including_gamename");
                if (null != var2) {
                  uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "mb_full_access_1");
                if (null != var2) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(param0 + 132, "mb_full_access_2");
                if (var2 != null) {
                  uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "mb_achievement_count_1");
                if (var2 != null) {
                  uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "mb_achievement_count_2");
                if (null != var2) {
                  uu.a(var2, (byte) 81);
                }
                var2 = NodeIterator.a(param0 + 132, "mb_exclusive_1");
                if (null != var2) {
                  uu.a(var2, (byte) 45);
                }
                var2 = NodeIterator.a(param0 + 132, "mb_exclusive_2");
                if (var2 != null) {
                  uu.a(var2, (byte) -112);
                }
                var2 = NodeIterator.a(50, "me_extra_benefits");
                if (var2 != null) {
                  UnitModelPreview.field_h = uu.a(var2, (byte) 72);
                }
                var2 = NodeIterator.a(50, "hs_friend_tip");
                if (var2 != null) {
                  uu.a(var2, (byte) -107);
                }
                var2 = NodeIterator.a(50, "hs_friend_tip_multi");
                if (var2 != null) {
                  uu.a(var2, (byte) 105);
                }
                var2 = NodeIterator.a(param0 ^ -100, "hs_mode_name,0");
                if (var2 != null) {
                  oc.field_Pb[0] = uu.a(var2, (byte) 60);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = NodeIterator.a(param0 ^ -100, "hs_mode_name,1");
                if (var2 != null) {
                  oc.field_Pb[1] = uu.a(var2, (byte) -120);
                }
                var2 = NodeIterator.a(param0 ^ -100, "hs_mode_name,2");
                if (null != var2) {
                  oc.field_Pb[2] = uu.a(var2, (byte) 55);
                }
                var2 = NodeIterator.a(50, "rating_mode_name,0");
                if (var2 != null) {
                  DelayedPacket.field_s[0] = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 ^ -100, "rating_mode_name,1");
                if (null != var2) {
                  DelayedPacket.field_s[1] = uu.a(var2, (byte) 61);
                }
                var2 = NodeIterator.a(50, "rating_mode_long_name,0");
                if (var2 != null) {
                  dr.field_C[0] = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "rating_mode_long_name,1");
                if (null != var2) {
                  dr.field_C[1] = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(param0 ^ -100, "graphics_config_fixed_size");
                if (var2 != null) {
                  oq.field_j = uu.a(var2, (byte) -118);
                }
                var2 = NodeIterator.a(50, "graphics_config_resizable");
                if (null != var2) {
                  Unit.field_n = uu.a(var2, (byte) 23);
                }
                var2 = NodeIterator.a(param0 ^ -100, "graphics_config_fullscreen");
                if (null != var2) {
                  oo.field_e = uu.a(var2, (byte) 30);
                }
                var2 = NodeIterator.a(50, "graphics_config_done");
                if (var2 != null) {
                  VineGrowthAction.field_w = uu.a(var2, (byte) 20);
                }
                var2 = NodeIterator.a(param0 + 132, "graphics_config_apply");
                if (null != var2) {
                  nr.field_f = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(param0 + 132, "graphics_config_title");
                if (var2 != null) {
                  uu.a(var2, (byte) -98);
                }
                var2 = NodeIterator.a(50, "graphics_config_instruction");
                if (var2 != null) {
                  GameEvent.field_l = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(param0 + 132, "graphics_config_need_memory");
                if (null != var2) {
                  fj.field_w = uu.a(var2, (byte) -128);
                }
                var2 = NodeIterator.a(50, "pleasewait_dotdotdot");
                if (var2 != null) {
                  fm.field_c = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "serviceunavailable");
                if (var2 != null) {
                  SocketResourceClient.field_s = uu.a(var2, (byte) 15);
                }
                var2 = NodeIterator.a(50, "createtouse");
                if (null != var2) {
                  eq.field_n = uu.a(var2, (byte) 79);
                }
                var2 = NodeIterator.a(50, "achievementsoffline");
                if (var2 != null) {
                  uu.a(var2, (byte) 58);
                }
                var2 = NodeIterator.a(param0 + 132, "warning");
                if (var2 != null) {
                  uu.a(var2, (byte) -124);
                }
                var2 = NodeIterator.a(50, "DEFAULT_PLAYER_NAME");
                if (null != var2) {
                  ko.field_a = uu.a(var2, (byte) -116);
                }
                var2 = NodeIterator.a(50, "mustlogin1");
                if (null != var2) {
                  uu.a(var2, (byte) -121);
                }
                var2 = NodeIterator.a(50, "mustlogin2,1");
                if (null != var2) {
                  gp.field_d[1] = uu.a(var2, (byte) 76);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mustlogin2,2");
                if (null != var2) {
                  gp.field_d[2] = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "mustlogin2,3");
                if (var2 != null) {
                  gp.field_d[3] = uu.a(var2, (byte) 96);
                }
                var2 = NodeIterator.a(50, "mustlogin2,4");
                if (null != var2) {
                  gp.field_d[4] = uu.a(var2, (byte) -123);
                }
                var2 = NodeIterator.a(50, "mustlogin2,5");
                if (null != var2) {
                  gp.field_d[5] = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "mustlogin2,6");
                if (null != var2) {
                  gp.field_d[6] = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(50, "mustlogin2,7");
                if (null != var2) {
                  gp.field_d[7] = uu.a(var2, (byte) 37);
                }
                var2 = NodeIterator.a(50, "mustlogin3,1");
                if (null != var2) {
                  DeployAction.field_y[1] = uu.a(var2, (byte) -94);
                }
                var2 = NodeIterator.a(50, "mustlogin3,2");
                if (null != var2) {
                  DeployAction.field_y[2] = uu.a(var2, (byte) -95);
                }
                var2 = NodeIterator.a(50, "mustlogin3,3");
                if (null != var2) {
                  DeployAction.field_y[3] = uu.a(var2, (byte) -96);
                }
                var2 = NodeIterator.a(param0 + 132, "mustlogin3,4");
                if (var2 != null) {
                  DeployAction.field_y[4] = uu.a(var2, (byte) 94);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mustlogin3,5");
                if (var2 != null) {
                  DeployAction.field_y[5] = uu.a(var2, (byte) -117);
                }
                var2 = NodeIterator.a(50, "mustlogin3,6");
                if (var2 != null) {
                  DeployAction.field_y[6] = uu.a(var2, (byte) -128);
                }
                var2 = NodeIterator.a(50, "mustlogin3,7");
                if (null != var2) {
                  DeployAction.field_y[7] = uu.a(var2, (byte) 54);
                }
                var2 = NodeIterator.a(50, "discard");
                if (var2 != null) {
                  dv.field_r = uu.a(var2, (byte) 103);
                }
                var2 = NodeIterator.a(param0 + 132, "mustlogin4,1");
                if (null != var2) {
                  StateChangeMarker.field_s[1] = uu.a(var2, (byte) 115);
                }
                var2 = NodeIterator.a(50, "mustlogin4,2");
                if (null != var2) {
                  StateChangeMarker.field_s[2] = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mustlogin4,3");
                if (null != var2) {
                  StateChangeMarker.field_s[3] = uu.a(var2, (byte) -110);
                }
                var2 = NodeIterator.a(50, "mustlogin4,4");
                if (var2 != null) {
                  StateChangeMarker.field_s[4] = uu.a(var2, (byte) 26);
                }
                var2 = NodeIterator.a(50, "mustlogin4,5");
                if (var2 != null) {
                  StateChangeMarker.field_s[5] = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "mustlogin4,6");
                if (var2 != null) {
                  StateChangeMarker.field_s[6] = uu.a(var2, (byte) -104);
                }
                var2 = NodeIterator.a(50, "mustlogin4,7");
                if (var2 != null) {
                  StateChangeMarker.field_s[7] = uu.a(var2, (byte) -113);
                }
                var2 = NodeIterator.a(50, "mustlogin_notloggedin");
                if (null != var2) {
                  pk.field_V = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "mustlogin_alternate,1");
                if (var2 != null) {
                  cp.field_b[1] = uu.a(var2, (byte) 120);
                }
                var2 = NodeIterator.a(50, "mustlogin_alternate,2");
                if (var2 != null) {
                  cp.field_b[2] = uu.a(var2, (byte) 69);
                }
                var2 = NodeIterator.a(param0 + 132, "mustlogin_alternate,3");
                if (null != var2) {
                  cp.field_b[3] = uu.a(var2, (byte) 66);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mustlogin_alternate,4");
                if (var2 != null) {
                  cp.field_b[4] = uu.a(var2, (byte) 13);
                }
                var2 = NodeIterator.a(param0 ^ -100, "mustlogin_alternate,5");
                if (null != var2) {
                  cp.field_b[5] = uu.a(var2, (byte) -93);
                }
                var2 = NodeIterator.a(50, "mustlogin_alternate,6");
                if (null != var2) {
                  cp.field_b[6] = uu.a(var2, (byte) -108);
                }
                var2 = NodeIterator.a(50, "mustlogin_alternate,7");
                if (null != var2) {
                  cp.field_b[7] = uu.a(var2, (byte) 77);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,0");
                if (var2 != null) {
                  AnimationSequence.field_c[0] = uu.a(var2, (byte) 13);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,1");
                if (null != var2) {
                  AnimationSequence.field_c[1] = uu.a(var2, (byte) -105);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,2");
                if (var2 != null) {
                  AnimationSequence.field_c[2] = uu.a(var2, (byte) 6);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,3");
                if (null != var2) {
                  AnimationSequence.field_c[3] = uu.a(var2, (byte) 127);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,4");
                if (null != var2) {
                  AnimationSequence.field_c[4] = uu.a(var2, (byte) 45);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,5");
                if (null != var2) {
                  AnimationSequence.field_c[5] = uu.a(var2, (byte) -122);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,6");
                if (null != var2) {
                  AnimationSequence.field_c[6] = uu.a(var2, (byte) 62);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,7");
                if (null != var2) {
                  AnimationSequence.field_c[7] = uu.a(var2, (byte) -127);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,8");
                if (var2 != null) {
                  AnimationSequence.field_c[8] = uu.a(var2, (byte) 100);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,9");
                if (var2 != null) {
                  AnimationSequence.field_c[9] = uu.a(var2, (byte) -114);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,10");
                if (var2 != null) {
                  AnimationSequence.field_c[10] = uu.a(var2, (byte) -92);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,11");
                if (var2 != null) {
                  AnimationSequence.field_c[11] = uu.a(var2, (byte) 118);
                }
                var2 = NodeIterator.a(50, "subscription_cost_monthly,12");
                if (var2 != null) {
                  AnimationSequence.field_c[12] = uu.a(var2, (byte) 67);
                }
                var2 = NodeIterator.a(param0 ^ -100, "sentence_separator");
                if (var2 != null) {
                  uu.a(var2, (byte) 27);
                }
                qk.field_e = null;
            }
            void run() {
                var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
                  stackIn_2613_0 = (RuntimeException) (var2_ref);
                  stackIn_2613_1 = new StringBuilder().append("id.D(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2614_2 = "null";
                  } else {
                    stackIn_2614_2 = "{...}";
                  }
                  throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_2613_0), ((StringBuilder) (Object) stackIn_2613_1).append(stackIn_2614_2).append(')').toString());
                }
                if (iv.field_k) {
                  ArmiesOfGielinor.obfuscationControl = (var3 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        try {
          rq.a((byte) -56);
          SoftwareRaster.b(param0, param3, param1, param2);
          if (param4 < 70) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, RgbSprite param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (0 == (3 & (param1.offsetY | (param1.offsetX | (param1.pixelWidth | param1.pixelHeight))))) {
            return;
          }
          var2_int = (3 & param1.offsetX) + param1.pixelWidth;
          var2_int = 4 - (3 & var2_int) + var2_int;
          var3 = (param1.offsetY & 3) + param1.pixelHeight;
          var3 = -(var3 & 3) - (-4 - var3);
          var4 = new int[var2_int * var3];
          var5 = 0;
          var6 = (3 & param1.offsetX) + (param1.offsetY & 3) * var2_int;
          var7 = 0;
          scanLoop1: while (true) {
            if (param1.pixelHeight > var7) {
              stackIn_15_0 = 0;
              if (var9 != 0) {
                break scanLoop1;
              }
              var8 = stackIn_15_0;
              while (var8 < param1.pixelWidth) {
                incrementValue$0 = var6;
                var6++;
                incrementValue$1 = var5;
                var5++;
                var4[incrementValue$0] = param1.pixels[incrementValue$1];
                var8++;
              }
              var6 = var6 + (-param1.pixelWidth + var2_int);
              var7++;
              continue scanLoop1;
            }
            param1.pixelHeight = var3;
            param1.offsetY = param1.offsetY & -4;
            param1.offsetX = param1.offsetX & -4;
            stackIn_15_0 = param0;
            break;
          }
          if (stackIn_15_0 != 300) {
            return;
          }
          param1.pixelWidth = var2_int;
          param1.pixels = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("id.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_c = "Accept unrated rematch";
        field_d = new int[]{600, 450, 450, 300, 300};
    }
}
