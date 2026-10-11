/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioSupport004 implements Runnable {
    volatile PcmPlayer[] pcmPlayerArrayState0001;
    volatile boolean booleanState0160;
    volatile boolean booleanState0161;
    PlatformService platformServiceState0007;
    static NodeDeque nodeDequeState0028;
    static int integerState0685;
    static MusicTrack musicTrackState0005;
    static ResourceArchive resourceArchiveState0020;
    static String stringState0466;
    static String stringState0467;
    static InputAdapter006[] inputAdapter006ArrayState0001;
    static RawSound rawSoundState0019;

    final static int[] computeIntegerArray1602(int[] integerArrayArgument1, byte byteArgument2, int[] integerArrayArgument3) {
        int[] integerArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int[] integerArrayLocal5 = null;
        int[] stackIntegerArrayLocal6 = null;
        int[] stackIntegerArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerArrayLocal5 = new int[8];
          integerArrayLocal1 = integerArrayLocal5;
          integerLocal3 = 0;
          if (byteArgument2 != 47) {
            stackIntegerArrayLocal6 = (int[]) null;
            return stackIntegerArrayLocal6;
          }
          while (8 > integerLocal3) {
            integerArrayLocal5[integerLocal3] = MixedSupport079.computeInteger1051(~integerArrayArgument3[integerLocal3], integerArrayArgument1[integerLocal3]);
            integerLocal3++;
          }
          stackIntegerArrayLocal7 = integerArrayLocal1;
          return stackIntegerArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("rc.A(");
          if (integerArrayArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    public static void performAction1599(int integerArgument1) {
        stringState0466 = null;
        nodeDequeState0028 = null;
        resourceArchiveState0020 = null;
        inputAdapter006ArrayState0001 = null;
        if (integerArgument1 >= -103) {
          return;
        }
        stringState0467 = null;
        musicTrackState0005 = null;
        rawSoundState0019 = null;
    }

    public final void run() {
        int integerLocal1 = 0;
        PcmPlayer pcmPlayerLocal2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.booleanState0160 = true;
        try {
          while (!this.booleanState0161) {
            for (integerLocal1 = 0; integerLocal1 < 2; integerLocal1++) {
              pcmPlayerLocal2 = this.pcmPlayerArrayState0001[integerLocal1];
              if (pcmPlayerLocal2 != null) {
                pcmPlayerLocal2.performAction0541();
              }
            }
            MixedSupport132.performAction1837(10L, -128);
            DiagnosticSupport001.performAction0362(-68, (Object) null, this.platformServiceState0007);
          }
        } catch (Exception exception) {
          String stringLocal5 = (String) null;
          NetworkArchiveRequestManager.performAction1468((Throwable) ((Object) exception), 16408, (String) null);
        } finally {
          this.booleanState0160 = false;
        }
    }

    final static boolean computeBoolean1600(boolean booleanArgument1) {
        if (booleanArgument1) {
          AudioSupport004.computeBoolean1600(true);
        }
        return ComponentContainer.sceneWidgetState0069 != null ? true : false;
    }

    final static RenderingSupport008 computeRenderingSupport0081601(boolean booleanArgument1, boolean booleanArgument2, boolean booleanArgument3, byte byteArgument4, boolean booleanArgument5) {
        RenderingSupport008 stackRenderingSupport008Local1 = null;
        boolean stackBooleanLocal2 = false;
        RenderingSupport008 stackRenderingSupport008Local3 = null;
        boolean stackBooleanLocal4 = false;
        RenderingSupport008 stackRenderingSupport008Local5 = null;
        boolean stackBooleanLocal6 = false;
        int integerLocal7;
        int integerLocal8;
        RenderingSupport008 renderingSupport008Local9;
        RenderingSupport008 renderingSupport008Local10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        renderingSupport008Local9 = new RenderingSupport008(2);
        renderingSupport008Local10 = renderingSupport008Local9;
        stackRenderingSupport008Local1 = renderingSupport008Local10;
        stackBooleanLocal2 = (!booleanArgument2) ? false : true;
        stackRenderingSupport008Local1.booleanState0096 = stackBooleanLocal2;
        if (byteArgument4 > 0) {
          AudioSupport004.performAction1599(-21);
        }
        stackRenderingSupport008Local3 = renderingSupport008Local10;
        stackBooleanLocal4 = (!booleanArgument3) ? false : true;
        stackRenderingSupport008Local3.booleanState0092 = stackBooleanLocal4;
        stackRenderingSupport008Local5 = renderingSupport008Local10;
        stackBooleanLocal6 = (!booleanArgument1) ? false : true;
        stackRenderingSupport008Local5.booleanState0095 = stackBooleanLocal6;
        renderingSupport008Local10.performAction0969(new GameDomainSupport002(20, UiComponentPart026.stringState0461, MixedSupport001.renderingSupport010State0001), 115);
        renderingSupport008Local10.performAction0969(new GameDomainSupport002(21, UiComponentPart017.stringState0329, MixedSupport001.renderingSupport010State0001), 102);
        renderingSupport008Local9.gameDomainSupport002ArrayState0001[0].integerState0174 = 320 - renderingSupport008Local9.gameDomainSupport002ArrayState0001[0].integerState0176 / 2;
        renderingSupport008Local9.gameDomainSupport002ArrayState0001[0].integerState0178 = 150;
        renderingSupport008Local9.gameDomainSupport002ArrayState0001[1].integerState0178 = 250;
        renderingSupport008Local9.gameDomainSupport002ArrayState0001[1].integerState0174 = 320 - renderingSupport008Local9.gameDomainSupport002ArrayState0001[1].integerState0176 / 2;
        renderingSupport008Local10.performAction0968(-1, booleanArgument5, -129);
        integerLocal7 = renderingSupport008Local9.gameDomainSupport002ArrayState0001[0].integerState0176;
        integerLocal8 = renderingSupport008Local9.gameDomainSupport002ArrayState0001[1].integerState0176;
        if (integerLocal7 < integerLocal8) {
          integerLocal7 = integerLocal8;
        }
        integerLocal11 = SceneWidget.renderingSupport010State0007.computeInteger1208(NodeHashTable.stringState0509);
        if (integerLocal11 > integerLocal7) {
          integerLocal7 = integerLocal11;
        }
        integerLocal12 = SceneWidget.renderingSupport010State0007.computeInteger1208(MixedSupport047.computeString0638(-127, booleanArgument2, booleanArgument3, booleanArgument1));
        if (integerLocal7 < integerLocal12) {
          integerLocal7 = integerLocal12;
        }
        integerLocal13 = SceneWidget.renderingSupport010State0007.computeInteger1208(CodecSupport004.computeString1636(0, booleanArgument2, booleanArgument3, booleanArgument1));
        if (integerLocal13 > integerLocal7) {
          integerLocal7 = integerLocal13;
        }
        integerLocal14 = SceneWidget.renderingSupport010State0007.computeInteger1208(MixedSupport074.computeString1032(booleanArgument3, booleanArgument2, booleanArgument1, true));
        if (integerLocal7 < integerLocal14) {
          integerLocal7 = integerLocal14;
        }
        renderingSupport008Local10.integerState0375 = 76;
        renderingSupport008Local10.integerState0374 = -(integerLocal7 / 2) + 280;
        renderingSupport008Local10.integerState0372 = 260;
        renderingSupport008Local10.integerState0368 = -renderingSupport008Local10.integerState0374 + (integerLocal7 / 2 + 360);
        return renderingSupport008Local10;
    }

    AudioSupport004() {
        this.pcmPlayerArrayState0001 = new PcmPlayer[2];
        this.booleanState0161 = false;
        this.booleanState0160 = false;
    }

    static {
        int integerLocal1 = 0;
        integerState0685 = 0;
        stringState0466 = "Left";
        nodeDequeState0028 = new NodeDeque();
        inputAdapter006ArrayState0001 = new InputAdapter006[255];
        stringState0467 = "Cancel unrated rematch";
        for (integerLocal1 = 0; integerLocal1 < inputAdapter006ArrayState0001.length; integerLocal1++) {
          inputAdapter006ArrayState0001[integerLocal1] = new InputAdapter006();
        }
    }
}
