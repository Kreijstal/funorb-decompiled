/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryRegistry {
    static IntrusiveDeque field_a;
    private WeightedLruCache field_c;
    private ResourceArchive field_h;
    private ResourceArchive field_f;
    static Sprite field_b;
    static Sprite[] field_d;
    static String field_g;
    static Sprite field_e;

    final QuickChatCategoryDefinition getCategory(int param0, int param1) {
        byte[] var4 = null;
        QuickChatCategoryDefinition var3 = (QuickChatCategoryDefinition) (this.field_c.get((byte) 127, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (32768 <= param0) {
          var4 = this.field_h.getFile(0, true, 32767 & param0);
        } else {
          var4 = this.field_f.getFile(0, true, param0);
        }
        var3 = new QuickChatCategoryDefinition();
        if (var4 != null) {
          var3.decode(64, new PacketBuffer(var4));
        }
        if (param0 >= 32768) {
          var3.markGlobalIds((byte) -72);
        }
        this.field_c.put(var3, (long)param0, 1);
        if (param1 != 32767) {
          this.field_c = (WeightedLruCache) null;
        }
        return var3;
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
          QuickChatCategoryRegistry.updateChatPanel((byte) -89, 58, false, -109);
        }
        field_b = null;
        field_g = null;
    }

    QuickChatCategoryRegistry(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new WeightedLruCache(64);
        try {
          this.field_f = param1;
          this.field_h = param2;
          if (this.field_f != null) {
            this.field_f.getFileCount(0, -2);
          }
          if (this.field_h != null) {
            this.field_h.getFileCount(0, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void updateChatPanel(byte param0, int param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        int var6Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ByteStorage.field_e < IdleTickHelpers.field_d) {
            ByteStorage.field_e = ByteStorage.field_e + 1;
          }
          if (ValidationMessageWidget.field_cb != SocketConnector.field_h.field_f) {
            AppearanceScreen.field_t = AppearanceScreen.field_t + (SocketConnector.field_h.field_f - ValidationMessageWidget.field_cb);
            ValidationMessageWidget.field_cb = SocketConnector.field_h.field_f;
          }
          if (0 >= ByteStorage.field_e) {
            return;
          }
          MiasmaParticle.layoutAnimatedChatPanel((byte) 93);
          ImageProducerRasterBuffer.field_k.updateRoot(-11838, param2);
          if (PendingIntArrayReply.field_f != null) {
            if (PendingRankingRequest.field_m) {
              PendingIntArrayReply.field_f.processPointerFrame(ImageProducerRasterBuffer.field_k.field_w, (byte) -27, ImageProducerRasterBuffer.field_k.field_qb, param2);
            } else {
              PendingIntArrayReply.field_f = null;
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = GrowableIntList.field_h[var4_int];
            if (var5 != null) {
              if (var5.field_T != 0) {
                LobbyRequestHelpers.openChatFilterMenu(-105, var4_int, var5);
              }
              var6 = CipherPacketBuffer.getChatFilterMode(var4_int, true);
              ChatInputHelpers.field_d[var4_int].field_rb = AudioServiceHelpers.field_j[var6];
              MenuInputState.field_l[var4_int].field_wb = RankingsRequest.field_h[var6];
            }
          }
          if (LevelEncodingHelpers.field_b.field_T != 0) {
            DirectByteStorage.field_i = new ReportAbuseDialog(LevelEncodingHelpers.field_b.field_w, LevelEncodingHelpers.field_b.field_qb, LevelEncodingHelpers.field_b.field_zb, LevelEncodingHelpers.field_b.field_z, param3, MarkerSliderPainter.field_a, ScreenSizeGlobals.field_c, ReportDialogGlobals.field_a, IntroScreen.field_m, UpgradeAccessHelpers.field_h, LobbyRequestHelpers.field_b, (String) null, 0L);
          }
          var9 = ValidationMessageWidget.findChatLineAt(-7, param1, UpgradeAccessHelpers.field_f, MusicPatchEnvelope.field_h);
          if (var9 != null) {
            FriendListHelpers.openChatMessageContextMenu(-31806, var9);
          }
          var8 = ChatPromptHelpers.buildChatInputPrompt((byte) -104);
          if (var8 != null) {
            MeltdownPuddleCell.field_j = var8;
          }
          var6Lifetime1 = -44 % ((-68 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "ig.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = new IntrusiveDeque();
        field_g = "Research Points: <%0>";
    }
}
