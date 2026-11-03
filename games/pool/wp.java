/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp implements si {
    static MouseHandler field_g;
    static String fsButtonMembers;
    static String[] field_f;
    static String returntomainmenu;
    static int field_d;
    static int field_c;
    static Sprite field_a;
    static String createEmailConfirmTooltip;

    final static byte[] decompressContainer(int param0, byte[] param1) {
        PacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_32_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2 = new PacketBuffer(param1);
          var3 = var2.readUnsignedByte(-72);
          var4 = var2.readInt(true);
          if (0 <= var4 && (sb.field_b == 0 ||
            !(var4 > sb.field_b))) {
            if (param0 == var3) {
              var5_ref_byte__ = new byte[var4];
              var2.a(0, (byte) -121, var5_ref_byte__, var4);
              stackIn_12_0 = var5_ref_byte__;
              return stackIn_12_0;
            }
            var5 = var2.readInt(true);
            if (var5 >= 0 && (0 == sb.field_b ||
              !(var5 > sb.field_b))) {
              var6 = new byte[var5];
              if (1 == var3) {
                Bzip2Decoder.decompressInto(var6, var5, param1, var4, 9);
              } else {
                var7 = VerticalScrollbar.field_Qb;
                synchronized (var7) {
                  VerticalScrollbar.field_Qb.decompress(var6, true, var2);
                }
              }
              stackIn_32_0 = var6;
              return stackIn_32_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_36_0 = var2_ref;
          stackIn_36_1 = new StringBuilder().append("wp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static SocialListEntry a(boolean param0, int param1, int param2) {
        ScrollPane stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        UiComponent stackIn_30_0 = null;
        String stackIn_31_1 = null;
        UiComponent stackIn_34_0 = null;
        String stackIn_35_1 = null;
        int stackIn_39_0 = 0;
        Object stackIn_88_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        Object var6_ref = null;
        int var6 = 0;
        SocialListEntry var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        PlayerContextMenu var17 = null;
        String var18 = null;
        PlayerContextMenu var17Lifetime1;
        String var18Lifetime1;
        try {
          stackIn_3_0 = NameEntryPopup.field_Mb.scrollPane;
          stackIn_3_1 = param0;
          stackIn_4_2 = (NameEntryPopup.field_Mb.scrollPane == WidgetStyleLayer.field_c);
          var3_int = ((ScrollPane) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_4_2, 2, (byte) 80, 2 + ArchiveIndex.field_x, (ArchiveIndex.field_x + 2) * (3 * param1)) ? 1 : 0;
          var4 = NameEntryPopup.field_Mb.content.children;
          var5 = null;
          if (2 == th.field_a) {
            SingleChildWidget.field_J.enabled = true;
            AccountContentDialog.field_sb.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{LocalGameSetupScreen.field_J}, -1, UiWidget.youAreOnXServer);
            NameEntryPopup.field_Mb.scrollPane.viewport.text = null;
            var6_ref = null;
            var7 = (SocialListEntry) (var4.last((byte) 60));
            while (null != var7) {
              var8 = 0;
              if (var7.children == null) {
                var7.field_Pb = new UiComponent(0L, PacketBuffer.field_s);
                var7.addChild(94, var7.field_Pb);
                var7.field_Nb = new UiComponent(0L, BallSkin.field_d);
                var7.addChild(-103, var7.field_Nb);
                var7.field_Ob = new UiComponent(0L, PacketBuffer.field_s);
                var7.addChild(-120, var7.field_Ob);
                var7.field_Nb.horizontalAlignment = 2;
                var7.markDescendantsToInheritVisualState((byte) -127);
                var8 = 1;
              }
              var7.width = NameEntryPopup.field_Mb.content.width;
              var9 = 0;
              if (var7.serverName != null) {
                if (LocalGameSetupScreen.field_J != var7.serverName) {
                  var10 = 13421568;
                  var11 = 16777062;
                } else {
                  var11 = 6750054;
                  var10 = 52224;
                }
              } else {
                var11 = 16737894;
                var10 = 13369344;
              }
              var12 = 0;
              if (var7.previousName != null &&
                !var7.previousName.equals("")) {
                var7.field_Ob.sprite = oi.field_o;
                var7.field_Ob.activeTextColor = var11;
                var12 = 1;
                var7.field_Ob.setBounds(var9, 2147483647, 0, 3 + oi.field_o.field_w, ArchiveIndex.field_x);
              }
              var7.field_Nb.selectedTextColor = var11;
              var7.field_Pb.selectedTextColor = var11;
              var7.field_Nb.capturedTextColor = var11;
              var7.field_Pb.capturedTextColor = var11;
              var7.field_Nb.textColor = var10;
              var7.field_Pb.textColor = var10;
              var7.field_Nb.activeTextColor = var11;
              var7.field_Pb.activeTextColor = var11;
              var13 = 0;
              var14 = -80 + (var7.width - 2);
              if (var12 != 0) {
                var13 = oi.field_o.field_w + 3;
                var14 = var14 - var13;
              }
              stackIn_30_0 = var7.field_Pb;
              if (var14 <= 0) {
                stackIn_31_1 = var7.name;
              } else {
                stackIn_31_1 = BitmapFont.truncateText(var7.field_Pb.font, var7.name, var14);
              }
              stackIn_30_0.text = stackIn_31_1;
              var7.field_Pb.setBounds(var9, 2147483647, var13, var14, ArchiveIndex.field_x);
              stackIn_34_0 = var7.field_Nb;
              if (null != var7.serverName) {
                stackIn_35_1 = var7.serverName;
              } else {
                stackIn_35_1 = ArchiveLoadStep.offline;
              }
              stackIn_34_0.text = stackIn_35_1;
              var7.field_Nb.setBounds(var9, 2147483647, var7.width - 80, 80, ArchiveIndex.field_x);
              stackIn_39_0 = (var7.field_Pb.text.equals(var7.name)) ? 0 : 1;
              var15 = stackIn_39_0;
              var9 = var9 + ArchiveIndex.field_x;
              if (var3_int == 0) {
                var7.remainingHeight = -var7.height + var9;
              }
              if (var8 != 0) {
                NameEntryPopup.field_Mb.content.placeBelow((UiComponent) (var6_ref), 2, var7, -78);
              }
              var6_ref = var7;
              if (null != var7.field_Ob &&
                var7.field_Ob.activeInside) {
                CacheEntry.field_B = var7.previousName;
              } else {
                if (0 != var7.pressedButton) {
                  var16 = var7.name;
                  dr.openPlayerContextMenu((String) null, -1, 0L, -1, NameEntryPopup.field_Mb.scrollPane, var16, 32540, var7, (int[]) null);
                  var5 = var7;
                  if (var7.serverName != null &&
                    !NineBallRules.a(PlasmaBallSkin.field_m.field_m, (byte) -101) &&
                    !ea.field_z) {
                    if (!ViewportController.field_y) {
                      var17 = PlasmaBallSkin.field_m;
                      var18 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var16}, -1, rp.sendPmToX);
                      var17.field_n.addAction(var18, 17130, 8);
                    }
                    var17Lifetime1 = PlasmaBallSkin.field_m;
                    var18Lifetime1 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var16}, -1, TutorialController.sendQcToX);
                    var17Lifetime1.field_n.addAction(var18Lifetime1, 17130, 18);
                  }
                } else {
                  if (var7.field_Pb.activeInside &&
                    var15 != 0) {
                    CacheEntry.field_B = var7.name;
                  }
                }
              }
              var7 = (SocialListEntry) (var4.previous((byte) -5));
            }
            if (0 != NameEntryPopup.field_Mb.leftFooter.pressedButton) {
              sm.field_C = new NameEntryPopup(NameEntryPopup.field_Mb.leftFooter.screenX, NameEntryPopup.field_Mb.leftFooter.screenY, NameEntryPopup.field_Mb.leftFooter.width, NameEntryPopup.field_Mb.leftFooter.height, cq.enterfriendAdd, ProgressDialog.field_qb, AlignedIconLabel.field_Lb, AlignedIconLabel.field_Lb);
              MatchingTextValidator.field_m = 0;
            }
            if (NameEntryPopup.field_Mb.rightFooter.pressedButton != 0) {
              sm.field_C = new NameEntryPopup(NameEntryPopup.field_Mb.rightFooter.screenX, NameEntryPopup.field_Mb.rightFooter.screenY, NameEntryPopup.field_Mb.rightFooter.width, NameEntryPopup.field_Mb.rightFooter.height, MidiPcmStream.enterfriendDel, ProgressDialog.field_qb, AlignedIconLabel.field_Lb, AlignedIconLabel.field_Lb);
              MatchingTextValidator.field_m = 1;
            }
          } else {
            SingleChildWidget.field_J.enabled = false;
            AccountContentDialog.field_sb.text = cl.pleasewaitDotdotdot;
            if (th.field_a == 1) {
              NameEntryPopup.field_Mb.scrollPane.viewport.text = CheckboxWidget.connectingToFriendServerTwoline;
            } else {
              NameEntryPopup.field_Mb.scrollPane.viewport.text = UiComponentNode.loading;
            }
            AudioService.a(NameEntryPopup.field_Mb.content, (byte) 109);
          }
          var6 = -31 / ((param2 - 31) / 62);
          stackIn_88_0 = var5;
          return (SocialListEntry) (stackIn_88_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "wp.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ea a(int param0, int param1, byte param2, int param3) {
        ea var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ea stackIn_12_0 = null;
        ea stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var4 = (ea) (rc.field_c.last((byte) -82));
          if (param2 <= 27) {
            field_g = (MouseHandler) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            if (var5 == 0) {
              if (param0 == var4.field_s) {
                stackIn_12_0 = var4;
                return stackIn_12_0;
              }
              var4 = (ea) (rc.field_c.previous((byte) -5));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var4 = new ea();
            var4.field_o = param1;
            var4.field_s = param0;
            rc.field_c.addFirst((byte) -114, var4);
            wb.a(var4, param3, (byte) -96);
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "wp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static FullscreenFocusCanvas openFullscreenCanvas(int param0, PlatformTaskDispatcher param1, byte param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        Object stackIn_2_0 = null;
        FullscreenFocusCanvas stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = nj.a(param3, param1, param0, false, param4, param5);
          if (null == var6) {
            stackIn_2_0 = null;
            return (FullscreenFocusCanvas) (stackIn_2_0);
          }
          var7 = new FullscreenFocusCanvas();
          var7.frame = var6;
          var7.frame.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param3);
          var7.addFocusListener(var7);
          if (param2 != 0) {
            field_f = (String[]) null;
          }
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("wp.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          fsButtonMembers = null;
          createEmailConfirmTooltip = null;
          field_g = null;
          returntomainmenu = null;
          if (param0 != 0) {
            field_a = (Sprite) null;
          }
          field_f = null;
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "wp.D(" + param0 + ')');
        }
    }

    static {
        fsButtonMembers = "Members";
        returntomainmenu = "Return to Main Menu";
        field_g = new MouseHandler();
        field_c = 50;
        createEmailConfirmTooltip = "Type your email address again to make sure it's correct";
    }
}
