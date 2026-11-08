/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static String field_b;
    static UiLayoutNode field_d;
    static int field_c;
    static SoundCache field_a;

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        UiLayoutNode stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        int stackIn_6_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        UiLayoutNode var8_ref_hd = null;
        ContextMenuItem var9 = null;
        int var9_int = 0;
        ContextMenuItem var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        UiLayoutNode var14 = null;
        UiLayoutNode var15 = null;
        int var16 = 0;
        var13 = Kickabout.field_G;
        try {
          BufferedSocket.field_s = SoftwareRasterizer.field_f;
          ColorQuantizationBox.field_a = SoftwareRasterizer.field_g;
          stackIn_3_0 = 127;
          if (param1) {
            stackIn_4_1 = fj.field_a;
          } else {
            stackIn_4_1 = ee.field_b;
          }
          ConsoleEvaluationException.a(stackIn_3_0, stackIn_4_1);
          HighScoreQuery.field_l.layout(0, TrinketIcon.field_Cb.field_q, 0, -2 + (-40 + TrinketIcon.field_Cb.field_mb), (byte) -80);
          GameQuickChatResolver.field_c.setBounds(true, AchievementsScreen.field_C.field_q, 0, 0, sh.field_c);
          stackIn_6_0 = BufferedSocket.field_u;
          stackIn_6_1 = true;
          stackIn_6_2 = AchievementsScreen.field_C.field_q;
          if (!NetworkArchiveRequest.field_t) {
            stackIn_7_3 = 0;
          } else {
            stackIn_7_3 = 2 + (TeamSelectionAgent.field_f + 40 + 2);
          }
          ((UiLayoutNode) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2 - stackIn_7_3, 0, sh.field_c + 2, 18);
          DoSomethingCommand.field_D.setBounds(true, TeamSelectionAgent.field_f + 42, -40 - TeamSelectionAgent.field_f + (AchievementsScreen.field_C.field_q - 2), 2 + sh.field_c, 18);
          ClientException.field_c.setLayout(2, 124, -20 - sh.field_c + AchievementsScreen.field_C.field_mb - 2, 2 + sh.field_c + 20, 0, AchievementsScreen.field_C.field_q, TeamSelectionAgent.field_f);
          TrinketUnlockNotice.field_b.setBounds(true, TrinketIcon.field_Cb.field_q, 0, -40 + TrinketIcon.field_Cb.field_mb, 40);
          IterableDualLinkDeque.field_h.setBounds(true, AuctionItem.field_p.field_q, 0, 0, 30);
          sg.field_a.setBounds(true, AuctionItem.field_p.field_q, 0, 30, -40 + (AuctionItem.field_p.field_mb - 2) - 30);
          var2_int = 3 + ss.field_j;
          if (VertexNormal.field_d.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = (2 + sg.field_a.field_mb - 5 + (-5 + (-10 + (var2_int + 1) / 2))) / (1 + var2_int) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (sg.field_a.field_mb + (-5 - var2_int * (2 + var3)));
          if (40 < var4) {
            var4 = 40;
          }
          if (param0 < 81) {
            field_b = (String) null;
          }
          MouseInputHandler.field_d.setBounds(true, -10 + sg.field_a.field_q, 5, 5, var4);
          var5 = var4 + 5 + 2;
          for (var6 = 0; var6 < ss.field_j + 4; var6++) {
            if ((var6 != 1 ||
              !(VertexNormal.field_d.length < 2)) && (var6 != 3 ||
              !(MouseInputHandler.field_f <= 1))) {
              if (!param1 &&
                var6 == 3) {
                var14 = qr.field_b[var6];
                qr.field_b[var6].field_mb = 0;
                var14.field_q = 0;
                for (var8 = 0; SocialTabsPanel.field_c[var6].length > var8; var8++) {
                  if (SocialTabsPanel.field_c[var6][var8] != null) {
                    var9 = SocialTabsPanel.field_c[var6][var8];
                    SocialTabsPanel.field_c[var6][var8].field_mb = 0;
                    var9.field_q = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                var15 = qr.field_b[var6];
                qr.field_b[var6].field_mb = 0;
                var15.field_q = 0;
                for (var8 = 0; SocialTabsPanel.field_c[var6].length > var8; var8++) {
                  if (null != SocialTabsPanel.field_c[var6][var8]) {
                    var9 = SocialTabsPanel.field_c[var6][var8];
                    SocialTabsPanel.field_c[var6][var8].field_mb = 0;
                    var9.field_q = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (TextButton.field_z != null) {
                      stackIn_49_0 = (TextButton.field_z[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_49_0 = 0;
                    }
                  } else {
                    stackIn_49_0 = 0;
                  }
                } else {
                  stackIn_49_0 = 0;
                }
                var7 = stackIn_49_0;
                if (var7 != 0) {
                  var8_ref_hd = qr.field_b[var6];
                  qr.field_b[var6].field_mb = 0;
                  var8_ref_hd.field_q = 0;
                  var16 = 0;
                  var9_int = var16;
                  while (var16 < SocialTabsPanel.field_c[var6].length) {
                    if (null != SocialTabsPanel.field_c[var6][var16]) {
                      var10 = SocialTabsPanel.field_c[var6][var16];
                      SocialTabsPanel.field_c[var6][var16].field_mb = 0;
                      var10.field_q = 0;
                    }
                    var16++;
                  }
                } else {
                  qr.field_b[var6].setBounds(true, 103, 5, var5, var3);
                  var8 = 110;
                  if (!param1) {
                    if (null != SocialTabsPanel.field_c[var6][0]) {
                      var9 = SocialTabsPanel.field_c[var6][0];
                      SocialTabsPanel.field_c[var6][0].field_mb = 0;
                      var9.field_q = 0;
                    }
                  } else {
                    SocialTabsPanel.field_c[var6][0].a(mj.field_b, 2, 38, var5, var8, 15114, var3);
                    var8 += 40;
                  }
                  var9_int = -3 + (AuctionItem.field_p.field_q - var8);
                  var10_int = SocialTabsPanel.field_c[var6].length - 1;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var11 * var9_int / var10_int;
                    SocialTabsPanel.field_c[var6][var11 + 1].a(mj.field_b, 2, -var12 + ((1 + var11) * var9_int / var10_int - 2), var5, var12 + var8, 15114, var3);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          tn.field_f.setBounds(true, 360, -360 + SoftwareRasterizer.field_g >> 1, 10, SoftwareRasterizer.field_f - 120 - 4 - 10 - 10);
          is.field_b.setBounds(true, tn.field_f.field_q, 0, 0, 24);
          vj.field_g.setBounds(true, tn.field_f.field_q, 0, 24, -24 + tn.field_f.field_mb);
          vj.field_g.field_R = fs.a(vj.field_g.field_mb, 3, 1, 11579568, 8421504, (byte) 97);
          TickClock.field_d.setBounds(true, vj.field_g.field_q - 10, 5, 5, -10 + (vj.field_g.field_mb - 24) - 2);
          BlackFadeScreen.field_i.setBounds(true, 80, (-80 + vj.field_g.field_q) / 2, -24 + (-5 + vj.field_g.field_mb), 24);
          ClientException.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "bq.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        int var1 = -41 % ((param0 + 70) / 41);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              if (param0 <= 48) {
                return;
              }
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(qr.a(param1, var5, 3), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("bq.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Similar rating";
        field_c = 0;
    }
}
