/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelSetupHelpers {
    static int[] field_d;
    static GameClock field_b;
    static boolean field_c;
    static String field_a;

    final static void printEscapedError(String param0, int param1) {
        System.out.println("Error: " + FadeLayer.replaceAll(param0, (byte) -33, "\n", "%0a"));
        if (param1 != 0) {
          field_b = (GameClock) null;
        }
    }

    final static void initializeQuickChat(BitmapFont param0, boolean param1, Js5Archive param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        QuickChatCategory var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = FullscreenState.field_c;
          LogoRenderHelpers.field_h = new SpriteWidget(0L, (SpriteWidget) null);
          if (null == param2) {
            IconLabelWidget.reportClientError("QC1", (Throwable) null, 1);
            return;
          }
          param2.field_b = param1;
          param2.field_k = 0;
          CacheReference.field_v = new QuickChatCategoryCache(var3_int, param2, param2);
          ChatMessage.field_s = new QuickChatPhraseRegistry(var3_int, param2, param2, new PacketRequestHelpers());
          var4 = FadeLayer.findFirstActiveEntry(256);
          if (null == var4) {
            IconLabelWidget.reportClientError("QC2", (Throwable) null, 1);
            return;
          }
          ChatAndIgnoreHelpers.setDefaultQuickChatShortcut((byte) 124, var4);
          RankingsRequest.field_k = WidgetFactoryHelpers.createThemedWidget(4020342, -4841, 2245737, 1513239, 8947848, 0, 1513239, 1127256, (BitmapFont) null, 65793, 65793, 65793, 5138823);
          IterableNodeHashTable.field_e = WidgetFactoryHelpers.createThemedWidget(0, -4841, 0, 0, 0, 16764006, 0, 0, param0, 0, 0, 0, 0);
          ChatFilterHelpers.field_a = WidgetFactoryHelpers.createThemedWidget(0, -4841, 0, 0, 0, 16777215, 0, 0, param0, 0, 0, 0, 0);
          var5 = Rasterizer.field_e;
          var6 = Rasterizer.field_f;
          var7 = Rasterizer.field_d;
          QueuedResultSubmission.field_h = new Sprite(10, 14);
          QueuedResultSubmission.field_h.makeRasterTarget();
          var8 = 2;
          while (var8 < 7) {
            Rasterizer.drawVerticalLine(var8, var8 + 1, -(var8 << 1) + 14, 16777215);
            var8++;
            if (var9 != 0) {
              return;
            }
          }
          Rasterizer.setTarget(var7, var5, var6);
          ResizableDialog.field_V = RasterBuffer.buildQuickChatCategoryMenu(RankingsRequest.field_k, ChatFilterHelpers.field_a, var4, 49, IterableNodeHashTable.field_e);
          LogoRenderHelpers.field_h.field_W = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static int getDaysInMonth(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1 &&
            ArrayWidgetContainer.isLeapYear(-122, param1)) {
            stackIn_7_0 = 29;
            return stackIn_7_0;
          }
          if (param0) {
            ChatPanelSetupHelpers.setRenderTargetSprite((Sprite) null, -95);
          }
          stackIn_12_0 = MenuInputState.field_l[param2];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void setRenderTargetSprite(Sprite param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != 16865) {
            field_b = (GameClock) null;
          }
          AudioPumpThread.pushRasterState(param1 - 16865);
          Rasterizer.setTarget(param0.field_B, param0.field_u, param0.field_z);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void buildChatPanelComponents(SpriteWidget param0, SpriteWidget param1, VerticalScrollbar param2, SpriteWidget param3, SpriteWidget param4, SpriteWidget param5, SpriteWidget param6, SpriteWidget param7, boolean param8, int param9, BitmapFont param10, SpriteWidget param11) {
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        SpriteWidget var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = Virogrid.field_F ? 1 : 0;
        try {
          FullscreenErrorDialog.field_eb[0] = 16764000;
          FullscreenErrorDialog.field_eb[1] = 6356832;
          FullscreenErrorDialog.field_eb[3] = 16736511;
          FullscreenErrorDialog.field_eb[4] = 16711935;
          ByteStorage.field_d = param1;
          FullscreenErrorDialog.field_eb[2] = 9474303;
          DisplayModeInfo.field_e = param8;
          IconTextComponent.field_Ob = param10;
          CacheReference.field_w[3] = 16736511;
          CacheReference.field_w[0] = 16764000;
          CacheReference.field_w[2] = 16736352;
          QueuedListRequest.field_n = 8421504;
          CacheReference.field_w[1] = 6356832;
          FullscreenErrorDialog.field_eb[4] = 16711935;
          var12 = new Sprite(4, 4);
          var13 = var12.field_B;
          var14 = var12.field_B;
          var12.field_B[15] = 7368816;
          var15 = var12.field_B;
          var14[5] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          ClientEnvironmentHelpers.field_c = new SpriteWidget(0L, param7);
          QuickChatCategoryCache.field_k = new SpriteWidget(0L, param6);
          ClientEnvironmentHelpers.field_c.addChild(0, QuickChatCategoryCache.field_k);
          var17 = new SpriteWidget(0L, (SpriteWidget) null);
          var17.field_W = new IntrusiveDeque();
          StatusAndUrlHelpers.field_c = new ScrollPane(0L, var17, param4, param2);
          QuickChatCategoryCache.field_k.addChild(0, StatusAndUrlHelpers.field_c);
          PacketRequestHelpers.field_d = new SpriteWidget(0L, param5);
          QuickChatCategoryCache.field_k.addChild(0, PacketRequestHelpers.field_d);
          UsernameAvailabilityValidator.field_n = new SpriteWidget(0L, param3);
          UsernameAvailabilityValidator.field_n.field_C = IconTextComponent.field_Ob;
          PacketRequestHelpers.field_d.addChild(0, UsernameAvailabilityValidator.field_n);
          PacketRequestHelpers.field_d.markTreeDirty((byte) 42);
          EditableTextWidget.field_I = new SpriteWidget(0L, (SpriteWidget) null);
          EditableTextWidget.field_I.field_vb = var16;
          PacketRequestHelpers.field_d.addChild(0, EditableTextWidget.field_I);
          TextEncodingHelpers.field_d = new SpriteWidget[5];
          QuickChatPhraseDefinition.field_o = new SpriteWidget[5];
          NodeHashTable.field_i = new SpriteWidget[5];
          BoundedUrlRequest.field_g = new SpriteWidget[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_31_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 != 0) {
                if (1 != var18 ||
                  !DisplayModeInfo.field_e) {
                  decompiledFrameRemainder0 = (2 == var18);
                  if (decompiledFrameRemainder0) {
                    var19 = DateOfBirthValidator.field_i;
                  }
                } else {
                  var19 = StrongCacheReference.field_A;
                }
              } else {
                if (!DisplayModeInfo.field_e) {
                  stackIn_27_0 = LogoRenderHelpers.field_i;
                } else {
                  stackIn_27_0 = RankingArraySupport.field_a;
                }
                var19 = stackIn_27_0;
              }
              if (decompiledFrameRemainder0) {
                NodeHashTable.field_i[var18] = new SpriteWidget(0L, param11);
                TextEncodingHelpers.field_d[var18] = new SpriteWidget(0L, ByteStorage.field_d, var19);
                BoundedUrlRequest.field_g[var18] = new SpriteWidget(0L, (SpriteWidget) null);
                BoundedUrlRequest.field_g[var18].field_D = 1;
                QuickChatPhraseDefinition.field_o[var18] = new SpriteWidget(0L, ByteStorage.field_d);
                QuickChatPhraseDefinition.field_o[var18].field_D = 1;
                NodeHashTable.field_i[var18].addChild(0, TextEncodingHelpers.field_d[var18]);
                NodeHashTable.field_i[var18].addChild(0, BoundedUrlRequest.field_g[var18]);
                NodeHashTable.field_i[var18].addChild(0, QuickChatPhraseDefinition.field_o[var18]);
                NodeHashTable.field_i[var18].markTreeDirty((byte) 42);
                ClientEnvironmentHelpers.field_c.addChild(0, NodeHashTable.field_i[var18]);
                MenuInputState.field_h = MenuInputState.field_h + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            AccountCreationSupport.field_d = new SpriteWidget(0L, param0);
            AccountCreationSupport.field_d.field_V = ChatPanelUpdateHelpers.field_a;
            ClientEnvironmentHelpers.field_c.addChild(0, AccountCreationSupport.field_d);
            stackIn_31_0 = AudioSetupHelpers.isConnectedToLobby((byte) -101) ? 1 : 0;
          }
          if (stackIn_31_0 == 0 ||
            FrameSkin.field_f) {
            CameraAndLogoHelpers.field_c = new BirthDateEntryPanel(0, 0, 0, 0);
          }
          if (param9 > -5) {
            ChatPanelSetupHelpers.getDaysInMonth(true, 76, -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_45_0 = var12_ref;
          stackIn_45_1 = new StringBuilder().append("kb.B(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param2 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param4 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param5 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param6 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param11 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_a = null;
          int var1_int = 77 / ((param0 - 0) / 35);
          field_d = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "kb.E(" + param0 + ')');
        }
    }

    static {
        field_d = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
        field_a = "OK";
    }
}
