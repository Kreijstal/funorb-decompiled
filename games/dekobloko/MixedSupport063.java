/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport063 {
    static SceneWidgetPart002 sceneWidgetPart002State0001;
    static int[][] integerArrayArrayState0012;
    static RawPcmStream[] rawPcmStreamArrayState0002;
    static String[] stringArrayState0014;
    static RgbSprite[][] rgbSpriteArrayArrayState0008;
    static String stringState0261;
    static MouseInput mouseInputState0001;
    static String stringState0262;

    final static void performAction0828(int integerArgument1, RgbSprite rgbSpriteArgument2, String stringArgument3) {
        try {
          MixedSupport079.rgbSpriteState0030 = rgbSpriteArgument2;
          InputAdapter004.stringState0358 = stringArgument3;
          if (integerArgument1 != 200) {
            mouseInputState0001 = (MouseInput) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ik.G(" + integerArgument1 + ',' + (rgbSpriteArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0832(int integerArgument1) {
        if (integerArgument1 < 34) {
          integerArrayArrayState0012 = (int[][]) null;
          UiComponentPart008.performAction0407(MixedSupport152.rawSoundState0023, 22);
          return;
        }
        UiComponentPart008.performAction0407(MixedSupport152.rawSoundState0023, 22);
    }

    public static void performAction0831(int integerArgument1) {
        rawPcmStreamArrayState0002 = null;
        stringState0261 = null;
        mouseInputState0001 = null;
        if (integerArgument1 >= 74) {
          stringArrayState0014 = null;
          stringState0262 = null;
          rgbSpriteArrayArrayState0008 = (RgbSprite[][]) null;
          sceneWidgetPart002State0001 = null;
          integerArrayArrayState0012 = (int[][]) null;
          return;
        }
    }

    final synchronized static long computeLong0827(int integerArgument1) {
        long longLocal1 = 0L;
        if (integerArgument1 == 4) {
          longLocal1 = System.currentTimeMillis();
          if (!(MixedSupport067.longState0022 <= longLocal1)) {
            MixedSupport106.longState0042 = MixedSupport106.longState0042 + (-longLocal1 + MixedSupport067.longState0022);
          }
          MixedSupport067.longState0022 = longLocal1;
          return MixedSupport106.longState0042 + longLocal1;
        }
        return -114L;
    }

    final static int computeInteger0826(byte byteArgument1, int integerArgument2) {
        int integerLocal1 = -14 % ((byteArgument1 - 36) / 56);
        return 200 * (-1 + integerArgument2) * integerArgument2;
    }

    final static boolean computeBoolean0830(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument2 != -118) {
            rgbSpriteArrayArrayState0008 = (RgbSprite[][]) null;
          }
          stackBooleanLocal2 = (UiComponentPart011.computeSceneWidgetPart0140610(-3805, stringArgument1) != null);
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ik.D(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static MixedSupport124 computeMixedSupport1240829(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        MixedSupport124 stackMixedSupport124Local2 = null;
        MixedSupport124 stackMixedSupport124Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (ThemeTips.mixedSupport124State0001.computeBoolean1767(91) &&
            !stringArgument2.equals(ThemeTips.mixedSupport124State0001.computeString1773((byte) 86))) {
            ThemeTips.mixedSupport124State0001 = MusicTrack.computeMixedSupport1241883(0, stringArgument2);
          }
          if (integerArgument1 > 96) {
            stackMixedSupport124Local3 = ThemeTips.mixedSupport124State0001;
            return stackMixedSupport124Local3;
          }
          stackMixedSupport124Local2 = (MixedSupport124) null;
          return stackMixedSupport124Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ik.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        stringArrayState0014 = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        stringState0261 = "Offer unrated rematch";
        rgbSpriteArrayArrayState0008 = new RgbSprite[6][4];
        rawPcmStreamArrayState0002 = new RawPcmStream[8];
        mouseInputState0001 = new MouseInput();
        stringState0262 = "Open";
    }
}
