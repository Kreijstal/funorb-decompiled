/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MixedSupport033 extends HashNode {
    static SceneWidget sceneWidgetState0024;
    static KeyboardInputHandler keyboardInputHandlerState0001;
    int[] integerArrayState0042;
    static String stringState0158;
    boolean booleanState0041;
    static String stringState0159;
    static String stringState0160;
    static String stringState0161;
    static SceneWidget sceneWidgetState0025;
    static RenderingSupport007 renderingSupport007State0004;
    static String stringState0162;

    final static boolean computeBoolean0496(PacketBuffer packetBufferArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (integerArgument2 != 19) {
            return false;
          }
          integerLocal1 = packetBufferArgument1.readUnsignedByte((byte) -40);
          stackIntegerLocal4 = (integerLocal1 != 1) ? 0 : 1;
          integerLocal3 = stackIntegerLocal4;
          stackIntegerLocal5 = integerLocal3;
          return stackIntegerLocal5 != 0;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("f.C(");
          if (packetBufferArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static RenderingSupport007 computeRenderingSupport0070497(boolean booleanArgument1, boolean booleanArgument2, int integerArgument3, boolean booleanArgument4, boolean booleanArgument5, int integerArgument6, boolean booleanArgument7, boolean booleanArgument8) {
        RenderingSupport007 stackRenderingSupport007Local1 = null;
        boolean stackBooleanLocal2 = false;
        RenderingSupport007 stackRenderingSupport007Local3 = null;
        boolean stackBooleanLocal4 = false;
        GameDomainSupport002 stackGameDomainSupport002Local5 = null;
        GameDomainSupport002 stackGameDomainSupport002Local6 = null;
        int stackIntegerLocal7 = 0;
        RenderingSupport007 stackRenderingSupport007Local8 = null;
        int stackIntegerLocal9 = 0;
        GameDomainSupport002 gameDomainSupport002Local10;
        GameDomainSupport002 gameDomainSupport002Local11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        RenderingSupport007 renderingSupport007Local19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        integerLocal18 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        renderingSupport007Local19 = new RenderingSupport007(12);
        stackRenderingSupport007Local1 = renderingSupport007Local19;
        stackBooleanLocal2 = (!booleanArgument8) ? false : true;
        stackRenderingSupport007Local1.booleanState0093 = stackBooleanLocal2;
        renderingSupport007Local19.integerState0371 = integerArgument3;
        stackRenderingSupport007Local3 = renderingSupport007Local19;
        stackBooleanLocal4 = (!booleanArgument1) ? false : true;
        stackRenderingSupport007Local3.booleanState0094 = stackBooleanLocal4;
        if (booleanArgument8) {
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(13, MixedSupport083.stringState0355, DefaultTextWidgetRenderer.renderingSupport009State0001), integerArgument6 ^ 32284);
        } else {
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(1, NetworkSupport004.stringState0209, DefaultTextWidgetRenderer.renderingSupport009State0001), integerArgument6 - 32232);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(2, UiComponentPart002.stringState0037, DefaultTextWidgetRenderer.renderingSupport009State0001), integerArgument6 ^ 32281);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(3, MixedSupport089.stringState0373, DefaultTextWidgetRenderer.renderingSupport009State0001), 117);
        }
        renderingSupport007Local19.performAction0852(new GameDomainSupport002(4, LabeledWidgetContainer.stringState0109, DefaultTextWidgetRenderer.renderingSupport009State0001), 117);
        if (booleanArgument4) {
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(5, BirthDateInput.stringState0581, DefaultTextWidgetRenderer.renderingSupport009State0001), 119);
        }
        if (integerArgument6 != 32357) {
          MixedSupport033.computeRenderingSupport0070497(false, true, 98, true, false, 42, false, false);
        }
        gameDomainSupport002Local10 = new GameDomainSupport002(6, MixedSupport101.stringState0434, DefaultTextWidgetRenderer.renderingSupport009State0001);
        gameDomainSupport002Local11 = new GameDomainSupport002(7, MixedSupport040.stringState0179, DefaultTextWidgetRenderer.renderingSupport009State0001);
        stackGameDomainSupport002Local5 = gameDomainSupport002Local10;
        stackGameDomainSupport002Local6 = gameDomainSupport002Local11;
        if (gameDomainSupport002Local11.integerState0176 < gameDomainSupport002Local10.integerState0176) {
          stackIntegerLocal7 = gameDomainSupport002Local10.integerState0176;
        } else {
          stackIntegerLocal7 = gameDomainSupport002Local11.integerState0176;
        }
        stackGameDomainSupport002Local6.integerState0176 = stackIntegerLocal7;
        stackGameDomainSupport002Local5.integerState0176 = stackIntegerLocal7;
        renderingSupport007Local19.performAction0852(gameDomainSupport002Local10, 125);
        renderingSupport007Local19.performAction0852(gameDomainSupport002Local11, 114);
        integerLocal12 = 1;
        if (booleanArgument8 &&
          Framebuffer.integerState0192 <= 0) {
          integerLocal12 = 0;
        }
        if (integerLocal12 != 0) {
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(8, MatchingFieldValidator.stringState0468, DefaultTextWidgetRenderer.renderingSupport009State0001), 105);
        }
        integerLocal13 = 116;
        if (booleanArgument8) {
          integerLocal14 = 0;
          integerLocal15 = LoginCredentials.tutorialTips.length;
          if (MixedSupport035.computeBoolean0502(0, 10040319, MixedSupport088.integerArrayState0172)) {
            integerLocal14 += 2;
            integerLocal15 -= 2;
          }
          renderingSupport007Local19.integerState0370 = ModalDialogHost.computeInteger0830((byte) 114, integerLocal15, AccountRegistrationPanel.randomState0003) + integerLocal14;
          if (booleanArgument1) {
            integerLocal13 = 96;
            if (booleanArgument2) {
              renderingSupport007Local19.performAction0852(new GameDomainSupport002(15), 124);
              integerLocal13 = 86;
              integerLocal16 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(ComponentContainer.stringState0308);
              integerLocal17 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(MixedSupport027.stringState0131);
              if (integerLocal17 > integerLocal16) {
                integerLocal16 = integerLocal17;
              }
              integerLocal22 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(MixedSupport100.stringState0421);
              if (integerLocal16 < integerLocal22) {
                integerLocal16 = integerLocal22;
              }
              renderingSupport007Local19.gameDomainSupport002ArrayState0001[-1 + renderingSupport007Local19.mixedSupport116State0002.integerState0756].integerState0176 = integerLocal16 + 46;
              renderingSupport007Local19.performAction0852(new GameDomainSupport002(16, DualNodeDeque.stringState0006, DefaultTextWidgetRenderer.renderingSupport009State0001), 116);
            }
            if (booleanArgument7) {
              renderingSupport007Local19.performAction0852(new GameDomainSupport002(17), 107);
              integerLocal20 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(ResourceArchive.stringState0287);
              integerLocal21 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(MixedSupport062.stringState0261);
              if (integerLocal20 < integerLocal21) {
                integerLocal20 = integerLocal21;
              }
              integerLocal23 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(MixedSupport066.stringState0294);
              if (integerLocal23 > integerLocal20) {
                integerLocal20 = integerLocal23;
              }
              integerLocal24 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(AccountCreationResultPanel.stringState0623);
              if (integerLocal24 > integerLocal20) {
                integerLocal20 = integerLocal24;
              }
              integerLocal25 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(ProxySocketFactory.stringState0493);
              if (integerLocal20 < integerLocal25) {
                integerLocal20 = integerLocal25;
              }
              integerLocal26 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(PcmPlayerService.stringState0467);
              if (integerLocal26 > integerLocal20) {
                integerLocal20 = integerLocal26;
              }
              integerLocal27 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(SceneWidgetPart005.stringState0254);
              if (integerLocal20 < integerLocal27) {
                integerLocal20 = integerLocal27;
              }
              integerLocal28 = DefaultTextWidgetRenderer.renderingSupport009State0001.stringWidth(MixedSupport024.stringState0117);
              if (integerLocal20 < integerLocal28) {
                integerLocal20 = integerLocal28;
              }
              renderingSupport007Local19.gameDomainSupport002ArrayState0001[-1 + renderingSupport007Local19.mixedSupport116State0002.integerState0756].integerState0176 = 46 + integerLocal20;
            }
            renderingSupport007Local19.performAction0852(new GameDomainSupport002(18, MixedSupport093.stringState0389, DefaultTextWidgetRenderer.renderingSupport009State0001), integerArgument6 - 32248);
          } else {
            renderingSupport007Local19.performAction0852(new GameDomainSupport002(14, MixedSupport074.stringState0322, DefaultTextWidgetRenderer.renderingSupport009State0001), 99);
          }
        } else {
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(19, MixedSupport006.stringState0028, DefaultTextWidgetRenderer.renderingSupport009State0001), 108);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(10, MixedSupport131.stringState0567, DefaultTextWidgetRenderer.renderingSupport009State0001), 126);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(9, MixedSupport124.stringState0542, DefaultTextWidgetRenderer.renderingSupport009State0001), 118);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(11, BirthDateChatEnableForm.stringState0350, DefaultTextWidgetRenderer.renderingSupport009State0001), 108);
          renderingSupport007Local19.performAction0852(new GameDomainSupport002(12, TextLayout.stringState0084, DefaultTextWidgetRenderer.renderingSupport009State0001), 112);
        }
        renderingSupport007Local19.performAction0849(integerLocal13, 320, true, 53, 24);
        stackRenderingSupport007Local8 = renderingSupport007Local19;
        stackIntegerLocal9 = (!booleanArgument5) ? 0 : 1;
        ((RenderingSupport007) (Object) stackRenderingSupport007Local8).performAction0851(stackIntegerLocal9, false, -129);
        renderingSupport007Local19.performAction0881((byte) -7);
        return renderingSupport007Local19;
    }

    final static int computeInteger0495(BucketBoard bucketBoardArgument1, BucketBoard bucketBoardArgument2, int integerArgument3, byte byteArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (byteArgument4 != -119) {
            MixedSupport033.computeRenderingSupport0070497(false, true, -83, false, false, 55, true, true);
          }
          integerLocal1 = RenderingSupport003.computeInteger0572(bucketBoardArgument1, byteArgument4 ^ -54);
          integerLocal3 = RenderingSupport003.computeInteger0572(bucketBoardArgument2, 40);
          if (2 + integerLocal1 <= integerLocal3) {
            stackIntegerLocal6 = 3;
            return stackIntegerLocal6;
          }
          if (integerArgument3 == 3 &&
            1 + integerLocal1 <= integerLocal3) {
            stackIntegerLocal5 = 3;
            return stackIntegerLocal5;
          }
          stackIntegerLocal4 = integerLocal1;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("f.E(");
          if (bucketBoardArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (bucketBoardArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument3).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final static MixedSupport016 pollPlayerNameAvailability(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        Object stackObjectLocal3 = null;
        MixedSupport016 stackMixedSupport016Local4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument1 != -11079) {
            MixedSupport033.computeRenderingSupport0070497(false, false, 6, true, true, -105, true, true);
          }
          if (AccountFieldStatusIndicator.mixedSupport004State0003 == ModalDialogHost.mixedSupport004State0001) {
            stackObjectLocal2 = null;
            return (MixedSupport016) (stackObjectLocal2);
          }
          if (ModalDialogHost.mixedSupport004State0001 == MixedSupport071.mixedSupport004State0002 &&
            stringArgument2.equals(BirthDateTextFields.stringState0435)) {
            ModalDialogHost.mixedSupport004State0001 = MixedSupport127.mixedSupport004State0005;
            stackMixedSupport016Local4 = PcmResampler.mixedSupport016State0002;
            return stackMixedSupport016Local4;
          }
          PcmResampler.mixedSupport016State0002 = null;
          ModalDialogHost.mixedSupport004State0001 = AccountFieldStatusIndicator.mixedSupport004State0003;
          BirthDateTextFields.stringState0435 = stringArgument2;
          stackObjectLocal3 = null;
          return (MixedSupport016) (stackObjectLocal3);
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("f.D(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static void performAction0499(int integerArgument1) {
        MixedSupport094.performAction1203((byte) -100);
        ByteArrayPoolSupport.performAction1665(ComponentContainer.integerState0377, MixedSupport139.integerState0855, AlphaWidgetContainer.rgbSpriteArrayState0010[0].integerState0254, GameApplet.integerState0292, SecondaryNodeHashTable.integerState0540, integerArgument1 ^ -110);
        if (integerArgument1 != 18) {
          MixedSupport033.performAction0494(79, true);
        }
    }

    public static void performAction0498(int integerArgument1) {
        stringState0158 = null;
        stringState0162 = null;
        stringState0161 = null;
        keyboardInputHandlerState0001 = null;
        if (integerArgument1 != 30061) {
          MixedSupport033.computeString0493(120);
        }
        sceneWidgetState0025 = null;
        stringState0159 = null;
        renderingSupport007State0004 = null;
        sceneWidgetState0024 = null;
        stringState0160 = null;
    }

    final static void performAction0494(int integerArgument1, boolean booleanArgument2) {
        if (RichTextLayout.computeBoolean0399((byte) 74)) {
          booleanArgument2 = false;
        }
        MixedSupport017.performAction0250(booleanArgument2, 0);
        if (LabeledWidgetContainer.booleanState0027) {
          SoftwareRaster.darkenRectangleHalf(PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0890, PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0903, PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0896, PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0915);
          PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.performAction1767(integerArgument1 ^ 1141039776, booleanArgument2);
        }
        MixedSupport029.performAction0405((byte) 127, booleanArgument2);
        if (integerArgument1 != 2) {
          MixedSupport033.performAction0494(123, false);
        }
    }

    MixedSupport033() {
        this.booleanState0041 = false;
    }

    final static String computeString0493(int integerArgument1) {
        if (AccountFieldStatusIndicator.mixedSupport004State0003 == GameAssets.mixedSupport004State0004) {
          return PasswordValidator.stringState0527;
        }
        if (!ThemeTips.mixedSupport119State0001.computeBoolean1561(85)) {
          return ThemeTips.mixedSupport119State0001.computeString1566((byte) 62);
        }
        if (ModalDialogHost.mixedSupport004State0001 == AccountFieldStatusIndicator.mixedSupport004State0003) {
          return ThemeTips.mixedSupport119State0001.computeString1566((byte) 123);
        }
        if (integerArgument1 == 116) {
          return PlayerNamePrompt.stringState0217;
        }
        return (String) null;
    }

    static {
        keyboardInputHandlerState0001 = new KeyboardInputHandler();
        stringState0161 = "The account name you use to access RuneScape and other Jagex.com games";
        stringState0160 = "<%0> cannot join; the game has started.";
        stringState0162 = "<%0> is already on your friend list.";
    }
}
