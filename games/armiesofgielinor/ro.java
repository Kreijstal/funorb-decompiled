/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends pt implements WidgetActivationListener {
    private rj field_tb;
    private boolean field_sb;
    static String field_kb;
    private boolean field_wb;
    static BattleCamera modelProjectionCamera;
    private boolean field_mb;
    static int field_pb;
    static int[] field_lb;
    private boolean field_qb;
    static String field_vb;
    static int pointerButton;
    static IndexedSprite[] field_rb;
    private BitmapFont field_nb;

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
            ro.a((IntrusiveNode) null, (IntrusiveNode) null, false);
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
          this.b(true);
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

    ro(gk param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new ad((ro) null, param1, param2), 77, 10, 10);
        try {
          this.field_qb = false;
          this.field_mb = param3 ? true : false;
          this.field_wb = false;
          this.field_sb = param4 ? true : false;
          this.field_nb = param1;
          this.field_tb = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_tb.field_R = true;
          this.addChild((byte) 10, (Widget) (this.field_tb));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0) {
        if (!this.field_L) {
          return;
        }
        if (!param0) {
          field_rb = (IndexedSprite[]) null;
          this.field_L = false;
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
        this.field_L = false;
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
          null != no.roomSetup) {
          var3 = 0;
        }
        if (rs.outgoingChatChannel == 2 &&
          !vu.isChatRecipientAvailable(6)) {
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
            ta.appendSystemChatMessage((String) null, 2, -18119, (String) null, KingBlackDragonEvent.field_y, 0);
            var15 = (String) null;
            var14 = (String) null;
            ta.appendSystemChatMessage((String) null, 2, -18119, (String) null, ContextualRuntimeException.field_a, 0);
            rd.clearChatText(8445);
            return true;
          }
          var5 = rs.outgoingChatChannel;
          if (var5 == 0 &&
            null != vu.currentRoom) {
            var5 = 1;
          }
          if (kp.getChatFilter(var5, param1 ^ -97) == 2) {
            ud.setChatFilter(1, false, var5, param2);
          }
          it.writeChatMessage(-1, -83, rs.outgoingChatChannel, qd.chatRecipientName, param0, var4_ref_String);
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
          var56 = (CharSequence) ((Object) qd.chatRecipientName);
          var20 = fo.a(4800, ta.field_Q, new String[]{ug.a(16, var56)});
          var8 = fo.a(4800, ov.field_l, new String[]{var16});
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
        if (null == vu.currentRoom &&
          bq.field_c) {
          var7 = "[" + ClientConnectionState.field_c + "] ";
        }
        if (vu.currentRoom == null) {
          var54 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - IntrusiveNode.field_e.textWidth(var54);
          if (IntrusiveNode.field_e.textWidth(UpkeepEvent.chatTextBuffer.toString()) > var5Lifetime1) {
            PortalLossCondition.a(' ', UpkeepEvent.chatTextBuffer.length() - 1, UpkeepEvent.chatTextBuffer, true);
          }
          return true;
        }
        if (!TextCursor.field_f) {
          var7Lifetime1 = "[" + fo.a(param1 ^ -4859, CampaignMenu.field_m, new String[]{vu.currentRoom.ownerName}) + "] ";
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
        var7Lifetime2 = "[" + fo.a(param1 ^ -4859, CampaignMenu.field_m, new String[]{vu.currentRoom.ownerName}) + "] ";
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
          if (this.field_wb) {
            gl.a(122, 3);
            this.b(true);
          } else {
            ActionSpell.a(CombatEvent.d((byte) -125), -113, "tochangedisplayname.ws");
          }
          if (obfuscationGuard != 11) {
            ro.n(46);
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

    final void o(int param0) {
        ad var2 = null;
        if (param0 == 4259) {
          this.field_tb.c(4210752, 2121792, 27178);
          var2 = new ad(this, this.field_nb, QuickChatCategory.field_B);
          var2.a(ClientConnectionState.field_b, 15, 1);
          this.a(var2, (byte) -108);
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        boolean stackIn_7_1 = false;
        ad stackIn_12_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ad var6 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_qb) {
            return;
          }
          this.field_qb = true;
          stackIn_7_1 = (param0 == 256);
          this.field_wb = stackIn_7_1;
          this.field_tb.c(4210752, 8405024, 27178);
          var6 = new ad(this, this.field_nb, param2);
          var4 = var6;
          if (5 == param0) {
            var6.a(QuickChatCommandDefinition.field_d, 11, 1);
            var6.a(dt.field_c, 17, param1 ^ 99);
          } else {
            if (param0 != 256) {
              stackIn_12_0 = var6;
              if (this.field_mb) {
                stackIn_13_1 = RegionAnchor.field_k;
              } else {
                stackIn_13_1 = fj.field_a;
              }
              ((ad) (Object) stackIn_12_0).a(stackIn_13_1, -1, param1 ^ 99);
            } else {
              var6.a(RegionAnchor.field_k, (WidgetListener) (this), (byte) -89);
            }
          }
          if (param0 == 3) {
            var6.a(SoundPlaybackHandle.field_m, 7, 1);
          } else {
            if (param0 != 4) {
              if (param0 != 6) {
                if (param0 == 9) {
                  var6.a(BattleTutorial.field_b, (WidgetListener) (this), (byte) -55);
                }
              } else {
                var6.a(CombatEvent.field_O, 9, 1);
              }
            } else {
              var6.a(IconTextComponent.field_Jb, 8, 1);
            }
          }
          this.a(var6, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("ro.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
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
