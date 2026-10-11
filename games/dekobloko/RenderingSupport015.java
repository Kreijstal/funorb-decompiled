/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport015 {
    static SceneWidgetPart008 sceneWidgetPart008State0006;
    static SceneWidget sceneWidgetState0112;
    static String stringState0524;

    final static void performAction1777(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument6 > integerArgument1) {
          if (integerArgument2 > integerArgument6) {
            UiComponentPart014.performAction0784(integerArgument3, integerArgument6, integerArgument8, integerArgument2, integerArgument4, (byte) 117, integerArgument5, integerArgument1, SoftwareRaster.integerArrayState0063);
          } else {
            if (integerArgument1 >= integerArgument2) {
              UiComponentPart014.performAction0784(integerArgument8, integerArgument1, integerArgument5, integerArgument6, integerArgument4, (byte) 117, integerArgument3, integerArgument2, SoftwareRaster.integerArrayState0063);
            } else {
              UiComponentPart014.performAction0784(integerArgument3, integerArgument2, integerArgument5, integerArgument6, integerArgument4, (byte) 117, integerArgument8, integerArgument1, SoftwareRaster.integerArrayState0063);
            }
          }
        } else {
          if (integerArgument1 < integerArgument2) {
            UiComponentPart014.performAction0784(integerArgument5, integerArgument1, integerArgument8, integerArgument2, integerArgument4, (byte) 117, integerArgument3, integerArgument6, SoftwareRaster.integerArrayState0063);
          } else {
            if (integerArgument2 <= integerArgument6) {
              UiComponentPart014.performAction0784(integerArgument8, integerArgument6, integerArgument3, integerArgument1, integerArgument4, (byte) 117, integerArgument5, integerArgument2, SoftwareRaster.integerArrayState0063);
            } else {
              UiComponentPart014.performAction0784(integerArgument5, integerArgument2, integerArgument3, integerArgument1, integerArgument4, (byte) 117, integerArgument8, integerArgument6, SoftwareRaster.integerArrayState0063);
            }
          }
        }
        if (integerArgument7 > 8) {
          return;
        }
        sceneWidgetState0112 = (SceneWidget) null;
    }

    final static void performAction1776(int integerArgument1, int integerArgument2, int integerArgument3) {
        MixedSupport004.integerState0029 = integerArgument1;
        MixedSupport074.integerState0402 = integerArgument3;
        if (integerArgument2 != -25073) {
          RenderingSupport015.performAction1777(-106, -58, 44, 19, 93, -115, 108, -54);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void performAction1778(boolean booleanArgument1, RgbSprite rgbSpriteArgument2) {
        try {
          IterableNodeCollection.performAction1876(-9074);
          SoftwareRaster.performAction0724(rgbSpriteArgument2.integerArrayState0024, rgbSpriteArgument2.integerState0254, rgbSpriteArgument2.integerState0260);
          if (!booleanArgument1) {
            RenderingSupport015.performAction1776(60, 93, -89);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "tb.D(" + booleanArgument1 + ',' + (rgbSpriteArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1775(int integerArgument1) {
        sceneWidgetPart008State0006 = null;
        sceneWidgetState0112 = null;
        stringState0524 = null;
        if (integerArgument1 != 20908) {
          sceneWidgetState0112 = (SceneWidget) null;
        }
    }

    static {
        stringState0524 = "NEW THEME<br>UNLOCKED!";
    }
}
