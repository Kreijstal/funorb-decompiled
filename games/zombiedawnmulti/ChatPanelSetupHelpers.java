/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ChatPanelSetupHelpers extends IOException {
    static UiComponent field_b;
    static String field_a;
    static String field_e;
    static String field_f;
    static int field_c;
    static FramePainter field_d;

    final static void setCursorType(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (PowerupEvent.field_t != param1) {
            PowerupEvent.field_t = param1;
          }
          if (param0 != -1) {
            ChatPanelSetupHelpers.getScrollPaneContent((byte) -66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "en.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 != 20964) {
          return;
        }
        try {
          field_d = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "en.C(" + param0 + ')');
        }
    }

    static long longAnd(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "en.E(" + param0 + ',' + param1 + ')');
        }
    }

    ChatPanelSetupHelpers(String param0) {
        super(param0);
    }

    final static UiComponent getScrollPaneContent(byte param0) {
        RuntimeException var1 = null;
        UiComponent stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -86) {
            ChatPanelSetupHelpers.releaseStatics(40);
          }
          stackIn_4_0 = SimEntity.field_H.field_Gb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "en.D(" + param0 + ')');
        }
    }

    final static LobbyPlayer findLobbyPlayer(byte param0, long param1) {
        RuntimeException var3 = null;
        LobbyPlayer stackIn_2_0 = null;
        LobbyPlayer stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 50) {
            stackIn_4_0 = (LobbyPlayer) (TextWidgetPainter.field_c.findByKey(param1, -22877));
            return stackIn_4_0;
          }
          stackIn_2_0 = (LobbyPlayer) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "en.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void buildChatPanelComponents(UiComponent param0, UiComponent param1, BitmapFont param2, UiComponent param3, UiComponent param4, UiComponent param5, boolean param6, VerticalScrollbar param7, int param8, UiComponent param9, UiComponent param10, UiComponent param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        UiComponent var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          PowerupAuraEffect.field_m[3] = param8;
          PowerupAuraEffect.field_m[4] = 16711935;
          PowerupAuraEffect.field_m[1] = 6356832;
          ContextMenu.field_Hb = param6;
          PowerupAuraEffect.field_m[0] = 16764000;
          MusicCrossfadeStream.field_A = param2;
          IntHashIndex.field_f = param0;
          PowerupAuraEffect.field_m[2] = 9474303;
          AudioServiceHelpers.field_c[3] = 16736511;
          AudioServiceHelpers.field_c[0] = 16764000;
          PowerupAuraEffect.field_m[4] = 16711935;
          AudioServiceHelpers.field_c[1] = 6356832;
          AudioServiceHelpers.field_c[2] = 16736352;
          SoundEffectInstance.field_g = 8421504;
          var12 = new Sprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          ImageProducerRasterBuffer.field_k = new UiComponent(0L, param10);
          GameHud.field_q = new UiComponent(0L, param9);
          ImageProducerRasterBuffer.field_k.addChild((byte) 50, GameHud.field_q);
          var17 = new UiComponent(0L, (UiComponent) null);
          var17.field_Cb = new IntrusiveDeque();
          NetworkArchiveRequest.field_A = new ScrollPane(0L, var17, param1, param7);
          GameHud.field_q.addChild((byte) 50, NetworkArchiveRequest.field_A);
          SimEntity.field_z = new UiComponent(0L, param3);
          GameHud.field_q.addChild((byte) 50, SimEntity.field_z);
          CookieHelpers.field_b = new UiComponent(0L, param4);
          CookieHelpers.field_b.field_yb = MusicCrossfadeStream.field_A;
          SimEntity.field_z.addChild((byte) 50, CookieHelpers.field_b);
          SimEntity.field_z.markDescendantsToInheritVisualState(-128);
          DraggableWidget.field_E = new UiComponent(0L, (UiComponent) null);
          DraggableWidget.field_E.field_ab = var16;
          SimEntity.field_z.addChild((byte) 50, DraggableWidget.field_E);
          GrowableIntList.field_h = new UiComponent[5];
          ChatInputHelpers.field_d = new UiComponent[5];
          CheckboxPainter.field_k = new UiComponent[5];
          MenuInputState.field_l = new UiComponent[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_28_0 = ~var18;
            stackIn_28_1 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 != stackIn_28_1) {
                if (1 != var18 ||
                  !ContextMenu.field_Hb) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = BitPackedArrayHelpers.field_c;
                  }
                } else {
                  var19 = RasterBuffer.field_d;
                }
              } else {
                if (!ContextMenu.field_Hb) {
                  stackIn_24_0 = BrowserPageHelpers.field_c;
                } else {
                  stackIn_24_0 = MessageDialog.field_vb;
                }
                var19 = stackIn_24_0;
              }
              if (decompiledFrameRemainder0) {
                GrowableIntList.field_h[var18] = new UiComponent(0L, param11);
                CheckboxPainter.field_k[var18] = new UiComponent(0L, IntHashIndex.field_f, var19);
                ChatInputHelpers.field_d[var18] = new UiComponent(0L, (UiComponent) null);
                ChatInputHelpers.field_d[var18].field_lb = 1;
                MenuInputState.field_l[var18] = new UiComponent(0L, IntHashIndex.field_f);
                MenuInputState.field_l[var18].field_lb = 1;
                GrowableIntList.field_h[var18].addChild((byte) 50, CheckboxPainter.field_k[var18]);
                GrowableIntList.field_h[var18].addChild((byte) 50, ChatInputHelpers.field_d[var18]);
                GrowableIntList.field_h[var18].addChild((byte) 50, MenuInputState.field_l[var18]);
                GrowableIntList.field_h[var18].markDescendantsToInheritVisualState(-128);
                ImageProducerRasterBuffer.field_k.addChild((byte) 50, GrowableIntList.field_h[var18]);
                LevelFileEntry.field_l = LevelFileEntry.field_l + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            LevelEncodingHelpers.field_b = new UiComponent(0L, param5);
            LevelEncodingHelpers.field_b.field_wb = SecondaryNodeDequeIterator.field_c;
            ImageProducerRasterBuffer.field_k.addChild((byte) 50, LevelEncodingHelpers.field_b);
            stackIn_28_0 = param8;
            stackIn_28_1 = -16736510;
          }
          if (IntroScreen.isLoggedInTransportActive(stackIn_28_0 + stackIn_28_1) &&
            !PendingRankingRequest.field_m) {
            return;
          }
          PendingIntArrayReply.field_f = new BirthDateEntryPanel(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_39_0 = var12_ref;
          stackIn_39_1 = new StringBuilder().append("en.A(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param5 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param10 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param11 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    static {
        field_e = "x???";
        field_a = "Create a free Account";
        field_f = "Traits";
    }
}
