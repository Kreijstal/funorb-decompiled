/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DemoIntegersCommand extends ConsoleCommand {
    static String field_C;
    static String field_A;
    static String field_B;
    static int field_D;
    static CommonGame field_F;
    static int field_E;

    DemoIntegersCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static IndexedSprite[] a(ResourceArchive param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(param2, -1);
          if (param1 != 17369) {
            DemoIntegersCommand.releaseStatics(27);
          }
          var5 = param0.getFileId((byte) -121, param3, var4_int);
          stackIn_3_0 = GoalStateAgent.a(var4_int, var5, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jo.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        UiLayoutNode var6 = null;
        int var7 = 0;
        int var8 = 0;
        ChatMessage var9 = null;
        var8 = Kickabout.field_G;
        try {
          if (SharedPanelFactory.field_b < TextPromptDialog.field_Bb) {
            SharedPanelFactory.field_b = SharedPanelFactory.field_b + 1;
          }
          if (VerticalScrollbar.field_Ab != ColorQuantizationBox.field_f.field_e) {
            ClientPacketFlushSupport.field_c = ClientPacketFlushSupport.field_c + (ColorQuantizationBox.field_f.field_e - VerticalScrollbar.field_Ab);
            VerticalScrollbar.field_Ab = ColorQuantizationBox.field_f.field_e;
          }
          if (SharedPanelFactory.field_b <= 0) {
            return;
          }
          WeightedLruCache.layoutAnimatedChatPanel(0);
          GrayscalePaletteSupport.field_a.updateInput(0, param0);
          if (null != PlayArea.field_a) {
            if (PacketBuffer.field_l) {
              PlayArea.field_a.processPointerFrame(GrayscalePaletteSupport.field_a.field_T, 31947, GrayscalePaletteSupport.field_a.field_F, param0);
            } else {
              PlayArea.field_a = null;
            }
          }
          var4_int = 52 / ((-26 - param3) / 46);
          for (var5_int = 0; var5_int < 5; var5_int++) {
            var6 = ValidatedTextWidget.field_W[var5_int];
            if (var6 != null) {
              if (var6.field_sb != 0) {
                DisplayModeSupport.openChatFilterMenu(var6, true, var5_int);
              }
              var7 = ClientProtocolStage.getChatFilterValue(0, var5_int);
              SocketConnector.field_b[var5_int].field_N = ClassDescriptorSupport.field_d[var7];
              ModelMaterialDecoder.field_a[var5_int].field_E = IntrusiveDeque.field_h[var7];
            }
          }
          if (0 != ChatInputState.field_a.field_sb) {
            TextPromptState.field_b = new TextPromptDialog(ChatInputState.field_a.field_F, ChatInputState.field_a.field_T, ChatInputState.field_a.field_q, ChatInputState.field_a.field_mb, param2, ChatMessage.field_e, AccountTermsPanel.field_H, DateInputValidator.field_f, ConsoleEvaluationException.field_e, MatchPhaseView.field_d, TextInputUiSupport.field_c, (String) null, 0L);
          }
          var9 = TextPromptDialog.rebuildChatHistory(param1, LineupPositionSupport.field_c, (byte) 26, DiskCacheWorker.field_b);
          if (var9 != null) {
            LineupView.openChatMessageContextMenu(var9, (byte) -60);
          }
          var5 = Trinket.updateChatComposeDisplay(-3);
          if (var5 != null) {
            UrlRequest.field_e = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var4), "jo.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ConsoleValue execute(byte param0, ConsoleValue[] param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            field_F = (CommonGame) null;
          }
          stackIn_3_0 = new ConsoleValue(KitStyleTile.createDemoIntegerValues(39));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_C = null;
        field_F = null;
        if (param0 != 0) {
          return;
        }
        field_B = null;
        field_A = null;
    }

    final static boolean a(IntrusiveDeque param0, boolean param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param1) {
            return false;
          }
          var2 = param0.first(24009);
          while (var2 instanceof WorldDrawEntry) {
            if (var2.field_d instanceof WorldDrawEntry) {
              if (((WorldDrawEntry) (var2)).getSortY((byte) -56) < ((WorldDrawEntry) (var2.field_d)).getSortY((byte) -9)) {
                return false;
              }
              var2 = var2.field_d;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("jo.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = "Reject";
        field_B = "tournament";
        field_C = "The Final starts in <%0> seconds...";
        field_E = 0;
    }
}
