/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmptyPainter implements WidgetPainter {
    static QuickChatInputHelpers[] field_b;
    static Sprite field_d;
    static String field_c;
    static int field_a;

    final static ListRequest findOrCreateListRequest(boolean param0, int param1, int param2, int param3) {
        ListRequest var6 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        ListRequest var4 = (ListRequest) (ContextActionMenu.field_Lb.first(12623));
        if (param0) {
          while (var4 != null) {
            if (param2 == var4.field_p) {
              return var4;
            }
            var4 = (ListRequest) (ContextActionMenu.field_Lb.next(0));
          }
          var6 = new ListRequest();
          var4 = var6;
          var6.field_p = param2;
          var6.field_t = param1;
          ContextActionMenu.field_Lb.addLast(var6, -1);
          BitAndSpriteHelpers.sendListRequest(-26971, var6, param3);
          return var6;
        }
        EmptyPainter.releaseStatics((byte) -57);
        while (var4 != null) {
          if (param2 == var4.field_p) {
            return var4;
          }
          var4 = (ListRequest) (ContextActionMenu.field_Lb.next(0));
        }
        ListRequest var7 = new ListRequest();
        var4 = var7;
        var7.field_p = param2;
        var7.field_t = param1;
        ContextActionMenu.field_Lb.addLast(var7, -1);
        BitAndSpriteHelpers.sendListRequest(-26971, var7, param3);
        return var7;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != 49) {
          return;
        }
        field_d = null;
    }

    public final void paint(UiComponent param0, int param1, int param2, int param3, boolean param4) {
        try {
          if (param1 != 5592405) {
            ChatLine var7 = (ChatLine) null;
            EmptyPainter.openChatLineMenu(-82, (ChatLine) null);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "eb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void setMusicVolume(int param0, boolean param1) {
        Bzip2State.field_A = param0;
        if (null != GrowableIntList.field_h) {
          GrowableIntList.field_h.setMasterVolume(param0, (byte) -66);
        }
        if (!param1) {
          if (DecodedSpriteHelpers.field_h != null) {
            DecodedSpriteHelpers.field_h.setFadeStep(2, param0);
          }
          return;
        }
        ChatLine var3 = (ChatLine) null;
        EmptyPainter.openChatLineMenu(84, (ChatLine) null);
        if (DecodedSpriteHelpers.field_h != null) {
          DecodedSpriteHelpers.field_h.setFadeStep(2, param0);
        }
    }

    final static void openChatLineMenu(int param0, ChatLine param1) {
        int stackIn_2_0;
        Object stackIn_2_1;
        Object stackIn_2_2;
        String stackIn_2_3;
        long stackIn_2_4;
        int stackIn_2_5;
        int stackIn_3_6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PlayerActionMenu var5 = null;
        String var6 = null;
        PlayerActionMenu var7 = null;
        String var8 = null;
        PlayerActionMenu var9 = null;
        String var10 = null;
        PlayerActionMenu var11 = null;
        String var12 = null;
        PlayerActionMenu var13 = null;
        try {
          stackIn_2_0 = -26335;
          stackIn_2_1 = null;
          stackIn_2_2 = null;
          stackIn_2_3 = param1.field_n;
          stackIn_2_4 = param1.field_h;
          stackIn_2_5 = param1.field_m;
          if (1 == param1.field_m) {
            stackIn_3_6 = param1.field_q;
          } else {
            stackIn_3_6 = 0;
          }
          ArcanistsMulti.openInfoPanel(stackIn_2_0, (int[]) (stackIn_2_1), (SceneScrollPane) (stackIn_2_2), stackIn_2_3, stackIn_2_4, stackIn_2_5, stackIn_3_6, param1.field_g, param1.field_a);
          if (param1.field_m == param0 &&
            !Js5Transport.isChatMode(-1) &&
            DirectByteStorage.field_f == null &&
            null == CapsuleBar.field_x) {
            if (!AlternateUsernameCredentials.field_p) {
              var5 = PackedShortHelpers.field_c;
              var6 = IsaacRandom.field_i;
              var5.field_l.addAction(14, var6, (byte) -26);
            }
            var7 = PackedShortHelpers.field_c;
            var8 = Js5Transport.field_h;
            var7.field_l.addAction(20, var8, (byte) -26);
          }
          if (param1.field_m == 1 &&
            !Js5Transport.isChatMode(-1) &&
            null != DirectByteStorage.field_f &&
            param1.field_q == DirectByteStorage.field_f.getSortKey((byte) 78)) {
            if (!AlternateUsernameCredentials.field_p) {
              var9 = PackedShortHelpers.field_c;
              var10 = Js5NetworkRequest.field_v;
              var9.field_l.addAction(14, var10, (byte) -26);
            }
            var11 = PackedShortHelpers.field_c;
            var12 = SocketJs5Transport.field_s;
            var11.field_l.addAction(20, var12, (byte) -26);
          }
          PackedShortHelpers.field_c.addSocialActions(3);
          PackedShortHelpers.field_c.populateActions((byte) 72, false);
          PackedShortHelpers.field_c.addGameActions(param1.field_m, param1.field_f, 13);
          PackedShortHelpers.field_c.addPrivateMessageAction(5552);
          PackedShortHelpers.field_c.addChatLineActions(19, param1);
          var13 = PackedShortHelpers.field_c;
          var3 = QueuedResponse.field_h;
          var4 = ConfirmedNameValidator.field_s;
          var13.field_l.openAt(0, 0, -29466, var4, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("eb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void drawSceneAndTooltip(boolean param0, int param1) {
        if (param1 > -81) {
          return;
        }
        StatefulTextPainter.drawSceneFullScreen(-6578, param0);
        if (null != TextLayout.field_c) {
          SoundEffectVoice.drawTooltipBox(0, TextLayout.field_c);
        }
    }

    final static void setFrameSprites(Sprite[] param0, int param1, int param2, int param3) {
        try {
          CameraFollowTarget.field_f = new SpriteFrame(param0);
          StatefulTextPainter.field_r = param3;
          int var4_int = -103 / ((param2 - 31) / 55);
          DualLinkDeque.field_d = param1;
          ResourceArchive.drawPointerSprite(403300833);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "eb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = null;
        field_c = "Just one target left!";
    }
}
