/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPromptHelpers {
    static IntrusiveDeque field_c;
    static String field_a;
    static int field_d;
    static int field_e;
    static int field_f;
    static UiComponent field_b;

    final static String buildChatInputPrompt(byte param0) {
        String stackIn_67_0 = null;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -104) {
            field_d = 67;
          }
          var1 = null;
          var2 = null;
          if (UrlLaunchHelpers.field_a == 0 &&
            BufferedSocket.field_n != null) {
            var2 = GlintButtonHelpers.field_d;
          }
          if (UrlLaunchHelpers.field_a == 2 &&
            !QuickChatPhraseDefinition.isPrivateRecipientReachable((byte) -20)) {
            if (!FriendListHelpers.isFriend((byte) -94, RasterStackHelpers.field_a)) {
              var2 = QueuedListRequest.substituteTemplateArguments(ProgressDialog.field_jb, new String[]{TextPopupHelpers.field_g}, 2);
              if (var10 != 0) {
                var2 = QueuedListRequest.substituteTemplateArguments(FrameCycleAnimation.field_k, new String[]{TextPopupHelpers.field_g}, 2);
              }
            } else {
              var2 = QueuedListRequest.substituteTemplateArguments(FrameCycleAnimation.field_k, new String[]{TextPopupHelpers.field_g}, 2);
            }
            if (LobbyScreenHelpers.field_b) {
              FullscreenErrorDialog.addChatMessage((String) null, 0, (String) null, (String) (var2), 2, 0);
              LoginDialog.closeChatInputIfOpen(33423425);
            }
          }
          if (var2 == null &&
            !CachedTextLayout.field_h &&
            null == ClickMarker.field_v) {
            var2 = IntrusiveDequeCursor.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2 != null) {
            IterableNodeHashTable.setChatTabLabel(6, SoundEffectInstance.field_g, 0, (String) (var2), (String) null);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = ProgressDialog.field_lb;
            var3 = PendingRankingRequest.prefixWithCrown(2, var3);
            var4 = "";
            var5 = "|";
            var6 = UrlLaunchHelpers.field_a;
            var7 = 0;
            if (var6 == 2) {
              var4 = QueuedListRequest.substituteTemplateArguments(LobbySlideLayout.field_c, new String[]{TextPopupHelpers.field_g}, 2);
              var8 = QueuedListRequest.substituteTemplateArguments(PulseEffect.field_n, new String[]{var3}, param0 + 106);
              var7 = -485 + DraggableWidget.field_E.field_zb + (CookieHelpers.field_b.field_zb - (-MusicCrossfadeStream.field_A.textWidth(var8) + MusicCrossfadeStream.field_A.textWidth(var4)));
              if (var7 < 0) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (JaggrabDownloader.field_c == null &&
                  ContextMenu.field_Hb) {
                  var4 = "[" + MessageDialog.field_vb + "] ";
                }
                if (null != JaggrabDownloader.field_c) {
                  var6 = 1;
                  boolean decompiledSharedTail1 = (!(MarkerSliderPainter.field_k) ||
                    null == AgeValidator.field_t);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + AgeValidator.field_t + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + QueuedListRequest.substituteTemplateArguments(GameEvent.field_g, new String[]{JaggrabDownloader.field_c.field_Nb}, 2) + "] ";
                  }
                }
              }
              if (!DualLinkDeque.isChatOverlayOpen(param0 + 104)) {
                stackIn_67_0 = "<img=3>: ";
              } else {
                stackIn_67_0 = ": ";
              }
              var8Lifetime1 = stackIn_67_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(PendingRankingRequest.field_m);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + ByteStorage.field_a + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (SimPortal.field_L)) {
                var4 = "<col=999999>" + var4 + UiWidget.field_v + "</col>";
                var5 = "";
              }
              var9 = MusicCrossfadeStream.field_A.textWidth(var4);
              if (!DualLinkDeque.isChatOverlayOpen(0)) {
                if (CookieHelpers.field_b.field_L &&
                  var9 > (-CookieHelpers.field_b.field_w + MouseInputHandler.field_g)) {
                  if (PendingRankingRequest.field_m) {
                    var1 = "Broken!";
                  } else {
                    var1 = UiWidget.field_v;
                  }
                }
                if (CookieHelpers.field_b.field_T != 0 &&
                  CookieHelpers.field_b.field_U < var9 &&
                  !PendingRankingRequest.field_m) {
                  SineTableHelpers.openPublicQuickChat(13151);
                }
              }
            }
            IterableNodeHashTable.setChatTabLabel(6, PowerupAuraEffect.field_m[var6], var7, var4 + BitmapFont.escapeMarkup(PowerupEventFactory.field_a.toString()), var5);
            if (!HotspotTextWidget.field_N) {
              DraggableWidget.field_E.field_L = false;
            }
            if (DraggableWidget.field_E.field_L) {
              var1 = QueuedListRequest.substituteTemplateArguments(LevelUpgradeHelpers.field_b, new String[]{var3, TextPopupHelpers.field_g}, param0 + 106);
            }
          }
          stackIn_104_0 = var1;
          return (String) (stackIn_104_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) (var1), "jp.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          field_a = null;
          int var1_int = 80 % ((56 - param0) / 61);
          field_b = null;
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jp.A(" + param0 + ')');
        }
    }

    static {
        field_c = new IntrusiveDeque();
        field_a = "Best";
        field_e = -1;
    }
}
