/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AvailabilityCheckRequest {
    static int field_i;
    static Sprite field_f;
    static int field_h;
    private String query;
    static String field_a;
    static String field_g;
    static String[] field_c;
    static DualLinkHashTable field_b;
    private boolean complete;
    private boolean result;

    final boolean getResult(byte param0) {
        if (param0 != -90) {
          return false;
        }
        return this.result;
    }

    final static int loadStadiumScenery(byte param0) {
        if (ValidationHelpWidget.field_T) {
          return -1;
        }
        if (!QuickChatKeysHelpPanel.field_Cb.a(false, "stadium")) {
          return QuickChatKeysHelpPanel.field_Cb.getGroupProgressByName("stadium", -16248);
        }
        DiskCacheWorker.field_i = new ArgbSprite[4];
        ValidationHelpWidget.field_T = true;
        DiskCacheWorker.field_i[0] = (ArgbSprite) (QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 74, "top_left_seats"));
        DiskCacheWorker.field_i[1] = (ArgbSprite) (QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 86, "top_right_seats"));
        DiskCacheWorker.field_i[2] = (ArgbSprite) (QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 46, "bot_left_seats"));
        DiskCacheWorker.field_i[3] = (ArgbSprite) (QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 115, "bot_right_seats"));
        ph.field_e = new IndexedSprite[4][3];
        ph.field_e[0][0] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "left_seats_1");
        ph.field_e[0][1] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "left_seats_2");
        ph.field_e[0][2] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "left_seats_3");
        MatchingTextValidator.field_k = QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 68, "ad_top");
        MusicPatchNode.field_m = QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 83, "ad_right");
        ManagerAction.field_f = QuickChatPhraseDefinition.a("stadium", QuickChatKeysHelpPanel.field_Cb, (byte) 108, "ad_left");
        ph.field_e[1][0] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "top_seats_1");
        ph.field_e[1][1] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "top_seats_2");
        ph.field_e[1][2] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "top_seats_3");
        ph.field_e[3][0] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "bot_seats_1");
        if (param0 != 28) {
          return -11;
        }
        ph.field_e[3][1] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "bot_seats_2");
        ph.field_e[3][2] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "bot_seats_3");
        ph.field_e[2][0] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "right_seats_1");
        ph.field_e[2][1] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "right_seats_2");
        ph.field_e[2][2] = MyPitchScreen.a(QuickChatKeysHelpPanel.field_Cb, "stadium", true, "right_seats_3");
        LineupView.field_s = new IndexedSprite[3][];
        LineupView.field_s[0] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, TrinketShopDialog.b((int) param0, 17349), "stadium", "top_seats_1_mask");
        LineupView.field_s[1] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "stadium", "top_seats_2_mask");
        LineupView.field_s[2] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "stadium", "top_seats_3_mask");
        LoginCredentials.field_c = new IndexedSprite[3][];
        LoginCredentials.field_c[0] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "stadium", "bot_seats_1_mask");
        LoginCredentials.field_c[1] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "stadium", "bot_seats_2_mask");
        LoginCredentials.field_c[2] = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "stadium", "bot_seats_3_mask");
        return -1;
    }

    final void complete(boolean param0, byte param1) {
        this.complete = true;
        int var3 = -109 % ((param1 - 48) / 55);
        this.result = param0 ? true : false;
    }

    final static void b(int param0) {
        if (!GameSoundEffect.field_f) {
          throw new IllegalStateException();
        }
        TutorialChoiceDialog.field_H = true;
        SumIntegersCommand.a(true, -91);
        vj.field_c = param0;
    }

    final boolean isComplete(byte param0) {
        if (param0 != -80) {
          AvailabilityCheckRequest.loadStadiumScenery((byte) -18);
          return this.complete;
        }
        return this.complete;
    }

    final static void a(int param0, int param1) {
        ManagerAction var2 = null;
        int var3 = Kickabout.field_G;
        ManagerAction var2Lifetime1;
        try {
          var2 = (ManagerAction) (MusicPatchNode.field_h.g(24009));
          if (param0 < 104) {
            field_i = -30;
          }
          while (var2 != null) {
            if (5 == var2.actionType) {
              var2.c((byte) -109);
            }
            var2 = (ManagerAction) (MusicPatchNode.field_h.c(33));
          }
          var2Lifetime1 = new ManagerAction(5, new int[]{param1});
          AchievementSubmission.applyAndQueueManagerAction(var2Lifetime1, 118);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kw.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != -122) {
          field_a = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final String getQuery(int param0) {
        if (param0 != 3) {
          this.complete = true;
          return this.query;
        }
        return this.query;
    }

    final static void b(boolean param0, byte param1) {
        int stackIn_10_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_69_0 = null;
        int stackIn_75_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_104_0 = null;
        int stackIn_112_0 = 0;
        Object stackIn_126_0 = null;
        int stackIn_134_0 = 0;
        Object stackIn_146_0 = null;
        int stackIn_152_0 = 0;
        Object stackIn_163_0 = null;
        int stackIn_169_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_195_0 = 0;
        Object var2_ref;
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (!EmailSyntaxValidator.c((byte) -42)) {
          if (!dr.field_a) {
            ArrayWidgetContainer.field_x = BytePlusOneCommand.field_A;
            us.field_j = ArchiveManager.field_m;
            if (param1 >= -99) {
              AvailabilityCheckRequest.releaseStatics((byte) -40);
            }
            vd.field_c = FootballerAgent.field_p;
            TrinketIcon.field_yb = HighScoreSubmission.field_q;
            ip.field_a = WidgetContainer.field_A;
            TabStrip.field_Eb = ReceivedAuctionItem.field_y;
            if (dr.field_a &&
              1 == vd.field_c) {
              stackIn_39_0 = 1;
            } else {
              stackIn_39_0 = 0;
            }
            var2 = stackIn_39_0;
          } else {
            if (320 == BytePlusOneCommand.field_A &&
              ArchiveManager.field_m == 240) {
              if (param1 >= -99) {
                AvailabilityCheckRequest.releaseStatics((byte) -40);
              }
              vd.field_c = FootballerAgent.field_p;
              TrinketIcon.field_yb = HighScoreSubmission.field_q;
              ip.field_a = WidgetContainer.field_A;
              TabStrip.field_Eb = ReceivedAuctionItem.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_10_0 = 1;
              } else {
                stackIn_10_0 = 0;
              }
              var2 = stackIn_10_0;
            } else {
              ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
              us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
              ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
              us.field_j = Math.max(0, Math.min(479, us.field_j));
              if (SplashScreen.field_m == null) {
                stackIn_20_0 = ic.field_d;
              } else {
                stackIn_20_0 = SplashScreen.field_m;
              }
              var2_ref = stackIn_20_0;
              oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
              if (param1 >= -99) {
                AvailabilityCheckRequest.releaseStatics((byte) -40);
              }
              vd.field_c = FootballerAgent.field_p;
              TrinketIcon.field_yb = HighScoreSubmission.field_q;
              ip.field_a = WidgetContainer.field_A;
              TabStrip.field_Eb = ReceivedAuctionItem.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_26_0 = 1;
              } else {
                stackIn_26_0 = 0;
              }
              var2 = stackIn_26_0;
            }
          }
        } else {
          if (param0 &&
            !dr.field_a) {
            RankingsScreen.a(false);
            if (!dr.field_a) {
              ArrayWidgetContainer.field_x = BytePlusOneCommand.field_A;
              us.field_j = ArchiveManager.field_m;
            } else {
              if (320 != BytePlusOneCommand.field_A ||
                ArchiveManager.field_m != 240) {
                ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
                us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
                ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (SplashScreen.field_m == null) {
                  stackIn_126_0 = ic.field_d;
                } else {
                  stackIn_126_0 = SplashScreen.field_m;
                }
                var2_ref = stackIn_126_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
              }
            }
            if (param1 >= -99) {
              AvailabilityCheckRequest.releaseStatics((byte) -40);
            }
            vd.field_c = FootballerAgent.field_p;
            TrinketIcon.field_yb = HighScoreSubmission.field_q;
            ip.field_a = WidgetContainer.field_A;
            TabStrip.field_Eb = ReceivedAuctionItem.field_y;
            if (dr.field_a &&
              1 == vd.field_c) {
              stackIn_134_0 = 1;
            } else {
              stackIn_134_0 = 0;
            }
            var2 = stackIn_134_0;
            if (var2 != 0 &&
              us.field_k < 6) {
              us.field_k = us.field_k + 2;
            }
            if (var2 == 0 &&
              us.field_k > 0) {
              us.field_k = us.field_k - 2;
            }
            return;
          }
          if (param0) {
            if (!dr.field_a) {
              ArrayWidgetContainer.field_x = BytePlusOneCommand.field_A;
              us.field_j = ArchiveManager.field_m;
              if (param1 >= -99) {
                AvailabilityCheckRequest.releaseStatics((byte) -40);
              }
              vd.field_c = FootballerAgent.field_p;
              TrinketIcon.field_yb = HighScoreSubmission.field_q;
              ip.field_a = WidgetContainer.field_A;
              TabStrip.field_Eb = ReceivedAuctionItem.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_88_0 = 1;
              } else {
                stackIn_88_0 = 0;
              }
              var2 = stackIn_88_0;
            } else {
              if (320 == BytePlusOneCommand.field_A &&
                ArchiveManager.field_m == 240) {
                if (param1 >= -99) {
                  AvailabilityCheckRequest.releaseStatics((byte) -40);
                }
                vd.field_c = FootballerAgent.field_p;
                TrinketIcon.field_yb = HighScoreSubmission.field_q;
                ip.field_a = WidgetContainer.field_A;
                TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_59_0 = 1;
                } else {
                  stackIn_59_0 = 0;
                }
                var2 = stackIn_59_0;
              } else {
                ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
                us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
                ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (SplashScreen.field_m == null) {
                  stackIn_69_0 = ic.field_d;
                } else {
                  stackIn_69_0 = SplashScreen.field_m;
                }
                var2_ref = stackIn_69_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                if (param1 >= -99) {
                  AvailabilityCheckRequest.releaseStatics((byte) -40);
                }
                vd.field_c = FootballerAgent.field_p;
                TrinketIcon.field_yb = HighScoreSubmission.field_q;
                ip.field_a = WidgetContainer.field_A;
                TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_75_0 = 1;
                } else {
                  stackIn_75_0 = 0;
                }
                var2 = stackIn_75_0;
              }
            }
          } else {
            if (dr.field_a) {
              ListRow.h(634588072);
              if (!dr.field_a) {
                ArrayWidgetContainer.field_x = BytePlusOneCommand.field_A;
                us.field_j = ArchiveManager.field_m;
              } else {
                if (320 != BytePlusOneCommand.field_A ||
                  ArchiveManager.field_m != 240) {
                  ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
                  us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
                  ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
                  us.field_j = Math.max(0, Math.min(479, us.field_j));
                  if (SplashScreen.field_m == null) {
                    stackIn_104_0 = ic.field_d;
                  } else {
                    stackIn_104_0 = SplashScreen.field_m;
                  }
                  var2_ref = stackIn_104_0;
                  oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                }
              }
              if (param1 >= -99) {
                AvailabilityCheckRequest.releaseStatics((byte) -40);
              }
              vd.field_c = FootballerAgent.field_p;
              TrinketIcon.field_yb = HighScoreSubmission.field_q;
              ip.field_a = WidgetContainer.field_A;
              TabStrip.field_Eb = ReceivedAuctionItem.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_112_0 = 1;
              } else {
                stackIn_112_0 = 0;
              }
              var2 = stackIn_112_0;
            } else {
              if (!dr.field_a) {
                ArrayWidgetContainer.field_x = BytePlusOneCommand.field_A;
                us.field_j = ArchiveManager.field_m;
                if (param1 >= -99) {
                  AvailabilityCheckRequest.releaseStatics((byte) -40);
                }
                vd.field_c = FootballerAgent.field_p;
                TrinketIcon.field_yb = HighScoreSubmission.field_q;
                ip.field_a = WidgetContainer.field_A;
                TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_195_0 = 1;
                } else {
                  stackIn_195_0 = 0;
                }
                var2 = stackIn_195_0;
                if (var2 != 0 &&
                  us.field_k < 6) {
                  us.field_k = us.field_k + 2;
                }
                if (var2 == 0 &&
                  us.field_k > 0) {
                  us.field_k = us.field_k - 2;
                  return;
                }
                return;
              }
              if (320 != BytePlusOneCommand.field_A) {
                ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
                us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
                ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (SplashScreen.field_m == null) {
                  stackIn_146_0 = ic.field_d;
                } else {
                  stackIn_146_0 = SplashScreen.field_m;
                }
                var2_ref = stackIn_146_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                if (param1 >= -99) {
                  AvailabilityCheckRequest.releaseStatics((byte) -40);
                }
                vd.field_c = FootballerAgent.field_p;
                TrinketIcon.field_yb = HighScoreSubmission.field_q;
                ip.field_a = WidgetContainer.field_A;
                TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_152_0 = 1;
                } else {
                  stackIn_152_0 = 0;
                }
                var2 = stackIn_152_0;
              } else {
                if (ArchiveManager.field_m == 240) {
                  if (param1 >= -99) {
                    AvailabilityCheckRequest.releaseStatics((byte) -40);
                  }
                  vd.field_c = FootballerAgent.field_p;
                  TrinketIcon.field_yb = HighScoreSubmission.field_q;
                  ip.field_a = WidgetContainer.field_A;
                  TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                  if (dr.field_a &&
                    1 == vd.field_c) {
                    stackIn_182_0 = 1;
                  } else {
                    stackIn_182_0 = 0;
                  }
                  var2 = stackIn_182_0;
                } else {
                  ArrayWidgetContainer.field_x = ArrayWidgetContainer.field_x + (BytePlusOneCommand.field_A - 320);
                  us.field_j = us.field_j + (-240 + ArchiveManager.field_m);
                  ArrayWidgetContainer.field_x = Math.max(0, Math.min(639, ArrayWidgetContainer.field_x));
                  us.field_j = Math.max(0, Math.min(479, us.field_j));
                  if (SplashScreen.field_m == null) {
                    stackIn_163_0 = ic.field_d;
                  } else {
                    stackIn_163_0 = SplashScreen.field_m;
                  }
                  var2_ref = stackIn_163_0;
                  oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                  if (param1 >= -99) {
                    AvailabilityCheckRequest.releaseStatics((byte) -40);
                  }
                  vd.field_c = FootballerAgent.field_p;
                  TrinketIcon.field_yb = HighScoreSubmission.field_q;
                  ip.field_a = WidgetContainer.field_A;
                  TabStrip.field_Eb = ReceivedAuctionItem.field_y;
                  if (dr.field_a &&
                    1 == vd.field_c) {
                    stackIn_169_0 = 1;
                  } else {
                    stackIn_169_0 = 0;
                  }
                  var2 = stackIn_169_0;
                }
              }
            }
          }
        }
        if (var2 != 0 &&
          us.field_k < 6) {
          us.field_k = us.field_k + 2;
        }
        if (var2 == 0 &&
          us.field_k > 0) {
          us.field_k = us.field_k - 2;
        }
    }

    AvailabilityCheckRequest(String param0) {
        this.result = false;
        this.complete = false;
        try {
          this.query = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"The Ultimate", "Grass Roots", "Muddying Your Knees", "In the Big Leagues", "Hot on the Heels", "Rising Star", "League of Their Own", "We are the Champions", "Notching up the Goals", "Team Player", "All Kitted Out", "World in Motion", "Aggregate Win", "A Decent Margin", "They Think It's All Over", "Globetrotter", "Beat Your Maker", "The Head of God", "The Untouchables", "Cinq Without a Trace", "A-Team", "Coach's Playbook", "Goldenballs", "Team Goldenballs", "Pinpoint Accuracy", "Blink and You'll Miss It", "Comeback Kid", "All Four One", "Pass and Move", "Don't Stop Me Now", "Save the Day", "Route-One", "Hallowe'en", "One for the Cabinet", "There can be Only One", "Undisputed", "Impenetrable", "I Got a Touch!", "Owned", "Pwned", "Slipping Away", "Holding On", "Never Gonna Give You Up", "Mod Off!", "Trapped", "Trampled", "Stomped", "Grounded", "Flattened", "Splatted", "On a Roll", "Hot Potato", "Brutal Contender", "Slow and Steady Wins the Race", "Diamonds Aren't Forever", "Blitzkrieg!", "Queen's Park", "Topper Harley", "Pacifist", "Slow Coach", "Tactically Superior", "Frontier", "The Wall", "By the Skin of Their Teeth", "It's a Funny Old Game", "Flair for Finishing", "The Veterans", "Slip 'n' Slide", "Keepy-uppy", "Longshot", "Wonder Goal", "Man of the Match", "Up, Under, and In"};
        field_a = "Accept";
        field_g = "Loading extra data (1/2)";
        field_f = new Sprite(256, 256);
    }
}
