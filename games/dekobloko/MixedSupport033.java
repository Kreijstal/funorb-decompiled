/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MixedSupport033 extends HashNode {
    static SceneWidget sceneWidgetState0024;
    static InputAdapter004 inputAdapter004State0001;
    int[] integerArrayState0042;
    static String stringState0158;
    boolean booleanState0041;
    static String stringState0159;
    static String stringState0160;
    static String stringState0161;
    static SceneWidget sceneWidgetState0025;
    static RenderingSupport008 renderingSupport008State0004;
    static String stringState0162;

    final static boolean computeBoolean0547(PacketBuffer packetBufferArgument1, int integerArgument2) {
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
          integerLocal1 = packetBufferArgument1.computeInteger2085((byte) -40);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static RenderingSupport008 computeRenderingSupport0080548(boolean booleanArgument1, boolean booleanArgument2, int integerArgument3, boolean booleanArgument4, boolean booleanArgument5, int integerArgument6, boolean booleanArgument7, boolean booleanArgument8) {
        RenderingSupport008 stackRenderingSupport008Local1 = null;
        boolean stackBooleanLocal2 = false;
        RenderingSupport008 stackRenderingSupport008Local3 = null;
        boolean stackBooleanLocal4 = false;
        GameDomainSupport002 stackGameDomainSupport002Local5 = null;
        GameDomainSupport002 stackGameDomainSupport002Local6 = null;
        int stackIntegerLocal7 = 0;
        RenderingSupport008 stackRenderingSupport008Local8 = null;
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
        RenderingSupport008 renderingSupport008Local19;
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
        renderingSupport008Local19 = new RenderingSupport008(12);
        stackRenderingSupport008Local1 = renderingSupport008Local19;
        stackBooleanLocal2 = (!booleanArgument8) ? false : true;
        stackRenderingSupport008Local1.booleanState0093 = stackBooleanLocal2;
        renderingSupport008Local19.integerState0371 = integerArgument3;
        stackRenderingSupport008Local3 = renderingSupport008Local19;
        stackBooleanLocal4 = (!booleanArgument1) ? false : true;
        stackRenderingSupport008Local3.booleanState0094 = stackBooleanLocal4;
        if (booleanArgument8) {
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(13, MixedSupport087.stringState0355, MixedSupport001.renderingSupport010State0001), integerArgument6 ^ 32284);
        } else {
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(1, NetworkSupport004.stringState0209, MixedSupport001.renderingSupport010State0001), integerArgument6 - 32232);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(2, UiComponentPart002.stringState0037, MixedSupport001.renderingSupport010State0001), integerArgument6 ^ 32281);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(3, MixedSupport094.stringState0373, MixedSupport001.renderingSupport010State0001), 117);
        }
        renderingSupport008Local19.performAction0969(new GameDomainSupport002(4, UiComponentPart006.stringState0109, MixedSupport001.renderingSupport010State0001), 117);
        if (booleanArgument4) {
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(5, UiComponentPart032.stringState0581, MixedSupport001.renderingSupport010State0001), 119);
        }
        if (integerArgument6 != 32357) {
          MixedSupport033.computeRenderingSupport0080548(false, true, 98, true, false, 42, false, false);
        }
        gameDomainSupport002Local10 = new GameDomainSupport002(6, MixedSupport106.stringState0434, MixedSupport001.renderingSupport010State0001);
        gameDomainSupport002Local11 = new GameDomainSupport002(7, MixedSupport040.stringState0179, MixedSupport001.renderingSupport010State0001);
        stackGameDomainSupport002Local5 = gameDomainSupport002Local10;
        stackGameDomainSupport002Local6 = gameDomainSupport002Local11;
        if (gameDomainSupport002Local11.integerState0176 < gameDomainSupport002Local10.integerState0176) {
          stackIntegerLocal7 = gameDomainSupport002Local10.integerState0176;
        } else {
          stackIntegerLocal7 = gameDomainSupport002Local11.integerState0176;
        }
        stackGameDomainSupport002Local6.integerState0176 = stackIntegerLocal7;
        stackGameDomainSupport002Local5.integerState0176 = stackIntegerLocal7;
        renderingSupport008Local19.performAction0969(gameDomainSupport002Local10, 125);
        renderingSupport008Local19.performAction0969(gameDomainSupport002Local11, 114);
        integerLocal12 = 1;
        if (booleanArgument8 &&
          Framebuffer.integerState0192 <= 0) {
          integerLocal12 = 0;
        }
        if (integerLocal12 != 0) {
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(8, CodecSupport003.stringState0468, MixedSupport001.renderingSupport010State0001), 105);
        }
        integerLocal13 = 116;
        if (booleanArgument8) {
          integerLocal14 = 0;
          integerLocal15 = LoginCredentials.tutorialTips.length;
          if (MixedSupport035.computeBoolean0553(0, 10040319, MixedSupport093.integerArrayState0172)) {
            integerLocal14 += 2;
            integerLocal15 -= 2;
          }
          renderingSupport008Local19.integerState0370 = UiComponentPart016.computeInteger0944((byte) 114, integerLocal15, UiComponentPart031.randomState0003) + integerLocal14;
          if (booleanArgument1) {
            integerLocal13 = 96;
            if (booleanArgument2) {
              renderingSupport008Local19.performAction0969(new GameDomainSupport002(15), 124);
              integerLocal13 = 86;
              integerLocal16 = MixedSupport001.renderingSupport010State0001.computeInteger1208(ComponentContainer.stringState0308);
              integerLocal17 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport027.stringState0131);
              if (integerLocal17 > integerLocal16) {
                integerLocal16 = integerLocal17;
              }
              integerLocal22 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport105.stringState0421);
              if (integerLocal16 < integerLocal22) {
                integerLocal16 = integerLocal22;
              }
              renderingSupport008Local19.gameDomainSupport002ArrayState0001[-1 + renderingSupport008Local19.mixedSupport121State0002.integerState0756].integerState0176 = integerLocal16 + 46;
              renderingSupport008Local19.performAction0969(new GameDomainSupport002(16, DualNodeDeque.stringState0006, MixedSupport001.renderingSupport010State0001), 116);
            }
            if (booleanArgument7) {
              renderingSupport008Local19.performAction0969(new GameDomainSupport002(17), 107);
              integerLocal20 = MixedSupport001.renderingSupport010State0001.computeInteger1208(ResourceArchive.stringState0287);
              integerLocal21 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport063.stringState0261);
              if (integerLocal20 < integerLocal21) {
                integerLocal20 = integerLocal21;
              }
              integerLocal23 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport070.stringState0294);
              if (integerLocal23 > integerLocal20) {
                integerLocal20 = integerLocal23;
              }
              integerLocal24 = MixedSupport001.renderingSupport010State0001.computeInteger1208(UiComponentPart033.stringState0623);
              if (integerLocal24 > integerLocal20) {
                integerLocal20 = integerLocal24;
              }
              integerLocal25 = MixedSupport001.renderingSupport010State0001.computeInteger1208(ProxySocketFactory.stringState0493);
              if (integerLocal20 < integerLocal25) {
                integerLocal20 = integerLocal25;
              }
              integerLocal26 = MixedSupport001.renderingSupport010State0001.computeInteger1208(AudioSupport004.stringState0467);
              if (integerLocal26 > integerLocal20) {
                integerLocal20 = integerLocal26;
              }
              integerLocal27 = MixedSupport001.renderingSupport010State0001.computeInteger1208(SceneWidgetPart005.stringState0254);
              if (integerLocal20 < integerLocal27) {
                integerLocal20 = integerLocal27;
              }
              integerLocal28 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport024.stringState0117);
              if (integerLocal20 < integerLocal28) {
                integerLocal20 = integerLocal28;
              }
              renderingSupport008Local19.gameDomainSupport002ArrayState0001[-1 + renderingSupport008Local19.mixedSupport121State0002.integerState0756].integerState0176 = 46 + integerLocal20;
            }
            renderingSupport008Local19.performAction0969(new GameDomainSupport002(18, MixedSupport098.stringState0389, MixedSupport001.renderingSupport010State0001), integerArgument6 - 32248);
          } else {
            renderingSupport008Local19.performAction0969(new GameDomainSupport002(14, MixedSupport078.stringState0322, MixedSupport001.renderingSupport010State0001), 99);
          }
        } else {
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(19, MixedSupport006.stringState0028, MixedSupport001.renderingSupport010State0001), 108);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(10, MixedSupport138.stringState0567, MixedSupport001.renderingSupport010State0001), 126);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(9, MixedSupport131.stringState0542, MixedSupport001.renderingSupport010State0001), 118);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(11, UiComponentPart019.stringState0350, MixedSupport001.renderingSupport010State0001), 108);
          renderingSupport008Local19.performAction0969(new GameDomainSupport002(12, TextLayout.stringState0084, MixedSupport001.renderingSupport010State0001), 112);
        }
        renderingSupport008Local19.performAction0966(integerLocal13, 320, true, 53, 24);
        stackRenderingSupport008Local8 = renderingSupport008Local19;
        stackIntegerLocal9 = (!booleanArgument5) ? 0 : 1;
        ((RenderingSupport008) (Object) stackRenderingSupport008Local8).performAction0968(stackIntegerLocal9, false, -129);
        renderingSupport008Local19.performAction0998((byte) -7);
        return renderingSupport008Local19;
    }

    final static int computeInteger0546(BucketBoard bucketBoardArgument1, BucketBoard bucketBoardArgument2, int integerArgument3, byte byteArgument4) {
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
            MixedSupport033.computeRenderingSupport0080548(false, true, -83, false, false, 55, true, true);
          }
          integerLocal1 = RenderingSupport003.computeInteger0632(bucketBoardArgument1, byteArgument4 ^ -54);
          integerLocal3 = RenderingSupport003.computeInteger0632(bucketBoardArgument2, 40);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument3).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final static MixedSupport016 computeMixedSupport0160544(int integerArgument1, String stringArgument2) {
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
            MixedSupport033.computeRenderingSupport0080548(false, false, 6, true, true, -105, true, true);
          }
          if (UiComponentPart022.mixedSupport004State0003 == UiComponentPart016.mixedSupport004State0001) {
            stackObjectLocal2 = null;
            return (MixedSupport016) (stackObjectLocal2);
          }
          if (UiComponentPart016.mixedSupport004State0001 == MixedSupport075.mixedSupport004State0002 &&
            stringArgument2.equals(UiComponentPart024.stringState0435)) {
            UiComponentPart016.mixedSupport004State0001 = MixedSupport134.mixedSupport004State0005;
            stackMixedSupport016Local4 = AudioSupport002.mixedSupport016State0002;
            return stackMixedSupport016Local4;
          }
          AudioSupport002.mixedSupport016State0002 = null;
          UiComponentPart016.mixedSupport004State0001 = UiComponentPart022.mixedSupport004State0003;
          UiComponentPart024.stringState0435 = stringArgument2;
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static void performAction0550(int integerArgument1) {
        MixedSupport099.performAction1379((byte) -100);
        MixedSupport137.performAction1887(ComponentContainer.integerState0377, MixedSupport146.integerState0855, UiComponentPart010.rgbSpriteArrayState0010[0].integerState0254, GameApplet.integerState0292, CollectionSupport003.integerState0540, integerArgument1 ^ -110);
        if (integerArgument1 != 18) {
          MixedSupport033.performAction0545(79, true);
        }
    }

    public static void performAction0549(int integerArgument1) {
        stringState0158 = null;
        stringState0162 = null;
        stringState0161 = null;
        inputAdapter004State0001 = null;
        if (integerArgument1 != 30061) {
          MixedSupport033.computeString0543(120);
        }
        sceneWidgetState0025 = null;
        stringState0159 = null;
        renderingSupport008State0004 = null;
        sceneWidgetState0024 = null;
        stringState0160 = null;
    }

    final static void performAction0545(int integerArgument1, boolean booleanArgument2) {
        if (RichTextLayout.computeBoolean0437((byte) 74)) {
          booleanArgument2 = false;
        }
        MixedSupport017.performAction0271(booleanArgument2, 0);
        if (UiComponentPart006.booleanState0027) {
          SoftwareRaster.performAction0737(AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0890, AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0903, AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0896, AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0915);
          AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.performAction1997(integerArgument1 ^ 1141039776, booleanArgument2);
        }
        MixedSupport029.performAction0445((byte) 127, booleanArgument2);
        if (integerArgument1 != 2) {
          MixedSupport033.performAction0545(123, false);
        }
    }

    MixedSupport033() {
        this.booleanState0041 = false;
    }

    final static String computeString0543(int integerArgument1) {
        if (UiComponentPart022.mixedSupport004State0003 == GameAssets.mixedSupport004State0004) {
          return MixedSupport126.stringState0527;
        }
        if (!ThemeTips.mixedSupport124State0001.computeBoolean1767(85)) {
          return ThemeTips.mixedSupport124State0001.computeString1773((byte) 62);
        }
        if (UiComponentPart016.mixedSupport004State0001 == UiComponentPart022.mixedSupport004State0003) {
          return ThemeTips.mixedSupport124State0001.computeString1773((byte) 123);
        }
        if (integerArgument1 == 116) {
          return SceneWidgetPart004.stringState0217;
        }
        return (String) null;
    }

    static {
        inputAdapter004State0001 = new InputAdapter004();
        stringState0161 = "The account name you use to access RuneScape and other Jagex.com games";
        stringState0160 = "<%0> cannot join; the game has started.";
        stringState0162 = "<%0> is already on your friend list.";
    }
}
