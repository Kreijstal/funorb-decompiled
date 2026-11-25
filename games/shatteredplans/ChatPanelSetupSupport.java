/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelSetupSupport {
    static int field_c;
    static String field_a;
    static String field_b;

    public static void releaseChatPanelSetupStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 0) {
            field_c = 101;
          }
          field_a = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "ba.A(" + param0 + ')');
        }
    }

    final static void initializeSharedChatPanel(AnimatedPanel param0, AnimatedPanel param1, int param2, AnimatedPanel param3, ScrollBar param4, AnimatedPanel param5, AnimatedPanel param6, AnimatedPanel param7, boolean param8, BitmapFont param9, AnimatedPanel param10, AnimatedPanel param11) {
        String stackIn_16_0 = null;
        int stackIn_34_0 = 0;
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
        AnimatedPanel var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          BufferedSocket.field_q[4] = 16711935;
          BufferedSocket.field_q[1] = 6356832;
          QuickChatHelpSupport.field_f = param9;
          BufferedSocket.field_q[0] = 16764000;
          BoundsRect.field_k = param11;
          LobbyCommandSupport.field_e = param8;
          BufferedSocket.field_q[2] = 9474303;
          BufferedSocket.field_q[3] = 16736511;
          IntroTextLine.field_l[1] = 6356832;
          BufferedSocket.field_q[4] = 16711935;
          QuickChatHelpSupport.field_c = 8421504;
          if (param2 <= 122) {
            field_a = (String) null;
          }
          IntroTextLine.field_l[3] = 16736511;
          IntroTextLine.field_l[0] = 16764000;
          IntroTextLine.field_l[2] = 16736352;
          var12 = new Sprite(4, 4);
          var13 = var12.field_B;
          var14 = var12.field_B;
          var15 = var12.field_B;
          var12.field_B[15] = 7368816;
          var14[5] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          DateValidationSupport.field_c = new AnimatedPanel(0L, param7);
          StatusContent.field_c = new AnimatedPanel(0L, param6);
          DateValidationSupport.field_c.addChild(4, StatusContent.field_c);
          var17 = new AnimatedPanel(0L, (AnimatedPanel) null);
          var17.field_M = new IntrusiveDeque();
          DateInputWidget.field_I = new ScrollPane(0L, var17, param1, param4);
          StatusContent.field_c.addChild(4, DateInputWidget.field_I);
          TaskAi.field_o = new AnimatedPanel(0L, param3);
          StatusContent.field_c.addChild(4, TaskAi.field_o);
          PopupPlacementSupport.field_j = new AnimatedPanel(0L, param10);
          PopupPlacementSupport.field_j.field_nb = QuickChatHelpSupport.field_f;
          TaskAi.field_o.addChild(4, PopupPlacementSupport.field_j);
          TaskAi.field_o.markDirty((byte) -128);
          OpacityWidget.field_C = new AnimatedPanel(0L, (AnimatedPanel) null);
          OpacityWidget.field_C.field_F = var16;
          TaskAi.field_o.addChild(4, OpacityWidget.field_C);
          DerelictMapReader.field_d = new AnimatedPanel[5];
          LobbyUiSetupSupport.field_a = new AnimatedPanel[5];
          DiplomacyNotice.field_n = new AnimatedPanel[5];
          TextReplacementEntry.field_b = new AnimatedPanel[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 == ~var18) {
                if (!LobbyCommandSupport.field_e) {
                  stackIn_16_0 = MapView.field_Fb;
                } else {
                  stackIn_16_0 = MessageKind.field_a;
                }
                var19 = stackIn_16_0;
              } else if (var18 != 1 ||
                !LobbyCommandSupport.field_e) {
                decompiledFrameRemainder0 = (2 == var18);
                if (decompiledFrameRemainder0) {
                  var19 = CellVertex.field_e;
                }
              } else {
                var19 = QuickChatPhraseRegistry.field_c;
              }
              if (decompiledFrameRemainder0) {
                TextReplacementEntry.field_b[var18] = new AnimatedPanel(0L, param5);
                LobbyUiSetupSupport.field_a[var18] = new AnimatedPanel(0L, BoundsRect.field_k, var19);
                DerelictMapReader.field_d[var18] = new AnimatedPanel(0L, (AnimatedPanel) null);
                DerelictMapReader.field_d[var18].field_G = 1;
                DiplomacyNotice.field_n[var18] = new AnimatedPanel(0L, BoundsRect.field_k);
                DiplomacyNotice.field_n[var18].field_G = 1;
                TextReplacementEntry.field_b[var18].addChild(4, LobbyUiSetupSupport.field_a[var18]);
                TextReplacementEntry.field_b[var18].addChild(4, DerelictMapReader.field_d[var18]);
                TextReplacementEntry.field_b[var18].addChild(4, DiplomacyNotice.field_n[var18]);
                TextReplacementEntry.field_b[var18].markDirty((byte) -126);
                DateValidationSupport.field_c.addChild(4, TextReplacementEntry.field_b[var18]);
                QuickChatParameterType.field_d = QuickChatParameterType.field_d + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ClientClockSupport.field_c = new AnimatedPanel(0L, param0);
            ClientClockSupport.field_c.field_z = TooltipSupport.field_c;
            DateValidationSupport.field_c.addChild(4, ClientClockSupport.field_c);
            stackIn_34_0 = DirectByteArrayStorage.b((byte) -121) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !LoginMethodPreference.field_g) {
            return;
          }
          wi.field_c = new BirthDateConfirmationForm(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_45_0 = var12_ref;
          stackIn_45_1 = new StringBuilder().append("ba.B(");
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
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param4 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param5 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param6 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param7 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
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
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    static {
        field_b = "Username: ";
        field_a = "Fleet Info";
    }
}
