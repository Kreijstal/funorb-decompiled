/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    private StripedProgressWidget progressBar;
    private boolean field_sb;
    static String field_kb;
    private boolean successfulOutcome;
    static BattleCamera modelProjectionCamera;
    private boolean field_mb;
    static int field_pb;
    static int[] field_lb;
    private boolean resultShown;
    static String field_vb;
    static int pointerButton;
    static IndexedSprite[] field_rb;
    private BitmapFont font;

    final static void a(IntrusiveNode param0, IntrusiveNode param1, boolean param2) {
        IntrusiveNode var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(76);
          }
          param1.previous = param0;
          param1.next = param0.next;
          param1.previous.next = param1;
          param1.next.previous = param1;
          if (!param2) {
            var4 = (IntrusiveNode) null;
            ProgressMessageDialog.a((IntrusiveNode) null, (IntrusiveNode) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ro.SA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -12215) {
            field_pb = 103;
          }
          if (keyCode != 13) {
            stackIn_6_0 = super.handleKey(rootWidget, keyCode, character, -12215);
            return stackIn_6_0;
          }
          this.closeDialog(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ro.F(");
          if (rootWidget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ProgressMessageDialog(ModalDialogHost host, BitmapFont font, String message, boolean closeFlowA, boolean closeFlowB) {
        super(host, new DialogMessagePane((ProgressMessageDialog) null, font, message), 77, 10, 10);
        try {
          this.resultShown = false;
          this.field_mb = closeFlowA ? true : false;
          this.successfulOutcome = false;
          this.field_sb = closeFlowB ? true : false;
          this.font = font;
          this.progressBar = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.progressBar.animated = true;
          this.addChild((byte) 10, (Widget) (this.progressBar));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ro.<init>(" + (host != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + (message != null ? "{...}" : "null") + ',' + closeFlowA + ',' + closeFlowB + ')');
        }
    }

    final void closeDialog(boolean obfuscationGuard) {
        if (!this.open) {
          return;
        }
        if (!obfuscationGuard) {
          field_rb = (IndexedSprite[]) null;
          this.open = false;
          if (this.field_mb) {
            AttackEvent.d((byte) 83);
            return;
          }
          if (this.field_sb) {
            LobbyPlayer.d((byte) -24);
            return;
          }
          return;
        }
        this.open = false;
        if (this.field_mb) {
          AttackEvent.d((byte) 83);
          return;
        }
        if (!this.field_sb) {
          return;
        }
        LobbyPlayer.d((byte) -24);
    }

    public static void n(int param0) {
        field_lb = null;
        modelProjectionCamera = null;
        field_rb = null;
        if (param0 != 0) {
          return;
        }
        field_kb = null;
        field_vb = null;
    }

    final static boolean b(int param0, byte param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var20;
        String var51;
        String var52;
        String var53;
        String var54;
        Object var55;
        CharSequence var56;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var54Lifetime1;
        String var54Lifetime2;
        var55 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = 1;
        if (!cu.field_c &&
          null == UnitCycler.field_g) {
          var3 = 0;
        }
        if (0 == rs.outgoingChatChannel &&
          null != NumericDateInputWidget.roomSetup) {
          var3 = 0;
        }
        if (rs.outgoingChatChannel == 2 &&
          !ToggleWidget.isChatRecipientAvailable(6)) {
          var3 = 0;
        }
        if (rs.keyCode == 84) {
          if (var3 == 0) {
            if (0 == rs.outgoingChatChannel) {
              return true;
            }
            rd.clearChatText(8445);
            return true;
          }
          if (UpkeepEvent.chatTextBuffer.length() <= 0) {
            rd.clearChatText(8445);
            return true;
          }
          var4_ref_String = UpkeepEvent.chatTextBuffer.toString();
          if (FaceNormal.a(var4_ref_String, param1 + 134)) {
            var13 = (String) null;
            var12 = (String) null;
            LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, (String) null, KingBlackDragonEvent.field_y, 0);
            var15 = (String) null;
            var14 = (String) null;
            LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, (String) null, ContextualRuntimeException.field_a, 0);
            rd.clearChatText(8445);
            return true;
          }
          var5 = rs.outgoingChatChannel;
          if (var5 == 0 &&
            null != ToggleWidget.currentRoom) {
            var5 = 1;
          }
          if (kp.getChatFilter(var5, param1 ^ -97) == 2) {
            ud.setChatFilter(1, false, var5, param2);
          }
          it.writeChatMessage(-1, -83, rs.outgoingChatChannel, RegistrationAgreementPane.chatRecipientName, param0, var4_ref_String);
          rd.clearChatText(8445);
          return true;
        }
        if (85 == rs.keyCode) {
          if (var3 == 0) {
            return true;
          }
          if (UpkeepEvent.chatTextBuffer.length() <= 0) {
            return true;
          }
          PortalLossCondition.a(' ', -1 + UpkeepEvent.chatTextBuffer.length(), UpkeepEvent.chatTextBuffer, true);
          return true;
        }
        var4 = DualNodeDeque.typedCharacter;
        if (!uu.a(true, (char) var4)) {
          if (param1 == -59) {
          }
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (UpkeepEvent.chatTextBuffer.length() >= 80) {
          return true;
        }
        discarded$0 = UpkeepEvent.chatTextBuffer.append((char) var4);
        var5Lifetime1 = 485;
        var17 = mv.localAccountName;
        var16 = nt.a(param1 - 47, var17);
        var18 = var16;
        if (rs.outgoingChatChannel == 2) {
          var56 = (CharSequence) ((Object) RegistrationAgreementPane.chatRecipientName);
          var20 = EmailCheckResult.a(4800, LabeledWidgetContainer.field_Q, new String[]{ug.a(16, var56)});
          var8 = EmailCheckResult.a(4800, ov.field_l, new String[]{var16});
          var9 = IntrusiveNode.field_e.textWidth(var20);
          var10 = IntrusiveNode.field_e.textWidth(var8);
          if (var9 > var10) {
            var5Lifetime1 = var5Lifetime1 - var9;
            if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
              PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
            }
            return true;
          }
          var5Lifetime1 = var5Lifetime1 - var10;
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) <= var5Lifetime1) {
            return true;
          }
          PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          return true;
        }
        var7 = "";
        if (0 != rs.outgoingChatChannel) {
          var51 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var51);
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
            PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          }
          return true;
        }
        if (null == ToggleWidget.currentRoom &&
          bq.field_c) {
          var7 = "[" + ClientConnectionState.field_c + "] ";
        }
        if (ToggleWidget.currentRoom == null) {
          var54 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var54);
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
            PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          }
          return true;
        }
        if (!TextCursor.field_f) {
          var7Lifetime1 = "[" + EmailCheckResult.a(param1 ^ -4859, CampaignMenu.field_m, new String[]{ToggleWidget.currentRoom.ownerName}) + "] ";
          var54Lifetime1 = var7Lifetime1 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var54Lifetime1);
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
            PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          }
          return true;
        }
        if (TeleportAction.field_C != null) {
          var52 = "[" + TeleportAction.field_C + "] ";
          var53 = var52 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var53);
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
            PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          }
          return true;
        }
        var7Lifetime2 = "[" + EmailCheckResult.a(param1 ^ -4859, CampaignMenu.field_m, new String[]{ToggleWidget.currentRoom.ownerName}) + "] ";
        var54Lifetime2 = var7Lifetime2 + var18 + ": ";
        var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var54Lifetime2);
        if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
          PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
        }
        return true;
    }

    public void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.successfulOutcome) {
            gl.a(122, 3);
            this.closeDialog(true);
          } else {
            ActionSpell.a(CombatEvent.d((byte) -125), -113, "tochangedisplayname.ws");
          }
          if (obfuscationGuard != 11) {
            ProgressMessageDialog.n(46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ro.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void showConnectionFailure(int obfuscationGuard) {
        DialogMessagePane var2 = null;
        if (obfuscationGuard == 4259) {
          this.progressBar.setColours(4210752, 2121792, 27178);
          var2 = new DialogMessagePane(this, this.font, QuickChatCategory.field_B);
          var2.addActionButton(ClientConnectionState.field_b, 15, 1);
          this.replaceContent(var2, (byte) -108);
          return;
        }
    }

    final void showResult(int statusCode, byte obfuscationGuard, String message) {
        boolean success = false;
        DialogMessagePane paneAlias = null;
        String buttonLabel = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePane messagePane = null;
        RuntimeException failure = null;
        int obfuscationControl = 0;
        DialogMessagePane pane = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.resultShown) {
            return;
          }
          this.resultShown = true;
          success = (statusCode == 256);
          this.successfulOutcome = success;
          this.progressBar.setColours(4210752, 8405024, 27178);
          pane = new DialogMessagePane(this, this.font, message);
          messagePane = pane;
          if (5 == statusCode) {
            pane.addActionButton(QuickChatCommandDefinition.field_d, 11, 1);
            pane.addActionButton(dt.field_c, 17, obfuscationGuard ^ 99);
          } else {
            if (statusCode != 256) {
              paneAlias = pane;
              if (this.field_mb) {
                buttonLabel = RegionAnchor.field_k;
              } else {
                buttonLabel = fj.field_a;
              }
              ((DialogMessagePane) (Object) paneAlias).addActionButton(buttonLabel, -1, obfuscationGuard ^ 99);
            } else {
              pane.addListenerButton(RegionAnchor.field_k, (WidgetListener) (this), (byte) -89);
            }
          }
          if (statusCode == 3) {
            pane.addActionButton(SoundPlaybackHandle.field_m, 7, 1);
          } else {
            if (statusCode != 4) {
              if (statusCode != 6) {
                if (statusCode == 9) {
                  pane.addListenerButton(BattleTutorial.field_b, (WidgetListener) (this), (byte) -55);
                }
              } else {
                pane.addActionButton(CombatEvent.field_O, 9, 1);
              }
            } else {
              pane.addActionButton(IconTextComponent.field_Jb, 8, 1);
            }
          }
          this.replaceContent(pane, obfuscationGuard);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_27_0 = failure;
          stackIn_27_1 = new StringBuilder().append("ro.KA(").append(statusCode).append(',').append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_kb = "Continue";
        pointerButton = 0;
    }
}
