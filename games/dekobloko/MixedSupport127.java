/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport127 implements CallbackContract004 {
    static String[] stringArrayState0047;
    static RenderingSupport010 renderingSupport010State0006;
    static CollectionSupport003 collectionSupport003State0005;
    static SceneWidget sceneWidgetState0117;
    static SceneWidget sceneWidgetState0118;
    static int integerState0777;
    static String[][] stringArrayArrayState0008;
    static SceneWidget sceneWidgetState0119;
    static int integerState0778;

    public static void performAction1814(boolean booleanArgument1) {
        stringArrayArrayState0008 = (String[][]) null;
        stringArrayState0047 = null;
        sceneWidgetState0117 = null;
        renderingSupport010State0006 = null;
        sceneWidgetState0118 = null;
        if (!booleanArgument1) {
          collectionSupport003State0005 = null;
          sceneWidgetState0119 = null;
          return;
        }
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        RgbSprite rgbSpriteLocal8 = null;
        try {
          integerLocal5 = integerArgument2 + uiComponentArgument5.integerState0110;
          integerLocal7 = uiComponentArgument5.integerState0104 + integerArgument3;
          RenderingSupport008.performAction0965(integerLocal5, integerLocal7, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, (byte) 101);
          rgbSpriteLocal8 = MixedSupport129.rgbSpriteArrayState0028[1];
          if (uiComponentArgument5 instanceof InteractiveComponent &&
            ((InteractiveComponent) (uiComponentArgument5)).booleanState0034) {
            rgbSpriteLocal8.performAction0317((uiComponentArgument5.integerState0107 - rgbSpriteLocal8.integerState0254 >> 1) + integerLocal5 + 1, 1 + integerLocal7 + (uiComponentArgument5.integerState0108 - rgbSpriteLocal8.integerState0260 >> 1), 256);
          }
          if (uiComponentArgument5.computeBoolean0239(true)) {
            RenderingSupport007.performAction0958(-4 + uiComponentArgument5.integerState0107, 2 + integerLocal5, (byte) 124, 2 + integerLocal7, uiComponentArgument5.integerState0108 - 4);
          }
          if (byteArgument4 < -60) {
            return;
          }
          MixedSupport127.performAction1814(false);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal4 = caughtParameterLocal9;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("tg.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    final static void performAction1813(byte byteArgument1) {
        UiComponentPart018.performAction1160(9, 11, MixedSupport016.sceneWidgetPart013State0001.computeInteger1937(102));
        GameDomainSupport006.booleanState0227 = true;
        if (byteArgument1 >= -2) {
          sceneWidgetState0117 = (SceneWidget) null;
        }
    }

    final static RgbSprite computeRgbSprite1815(boolean booleanArgument1, int integerArgument2) {
        if (!booleanArgument1) {
          return (RgbSprite) null;
        }
        return MixedSupport063.rgbSpriteArrayArrayState0008[integerArgument2][(12 & CipherPacketBuffer.integerState0799) >> 2];
    }

    static {
        stringArrayArrayState0008 = new String[][]{new String[]{"Standard", "Large"}, new String[]{"Slow", "Medium", "Fast", "Maximum", "Panic!"}, new String[]{"3", "4", "5", "6", "7"}, new String[]{"None", "W/cards", "+Drills", "+Bombs", "All"}, new String[]{"Level 1", "Level 2", "Level 3", "Off"}};
    }
}
