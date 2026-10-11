/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MixedSupport029 {
    static String[] stringArrayState0011;
    static String stringState0147;
    static Calendar calendarState0001;
    static String stringState0148;
    static int integerState0181;
    static int integerState0182;
    static String stringState0149;

    final static void performAction0447(int integerArgument1, int integerArgument2, String stringArgument3, int integerArgument4, byte byteArgument5, BitmapFont bitmapFontArgument6) {
        int integerLocal1 = 0;
        try {
          integerLocal1 = 2;
          if (UiComponentPart029.renderingSupport010State0005 == bitmapFontArgument6) {
            integerLocal1 = 1;
          }
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 - integerLocal1, integerArgument4 - integerLocal1, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, -integerLocal1 + integerArgument2, integerArgument4, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 - integerLocal1, integerArgument4 + integerLocal1, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2, integerArgument4 - integerLocal1, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2, integerLocal1 + integerArgument4, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 + integerLocal1, integerArgument4 - integerLocal1, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerLocal1 + integerArgument2, integerArgument4, 0, -1);
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 + integerLocal1, integerArgument4 + integerLocal1, 0, -1);
          if (bitmapFontArgument6 == SceneWidget.renderingSupport010State0007) {
            bitmapFontArgument6.performAction1224(stringArgument3, 1 + integerArgument2, integerArgument4 - integerLocal1, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 - 1, -integerLocal1 + integerArgument4, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 + integerLocal1, integerArgument4 - 1, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, -integerLocal1 + integerArgument2, -1 + integerArgument4, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerLocal1 + integerArgument2, 1 + integerArgument4, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 - integerLocal1, 1 + integerArgument4, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 + 1, integerLocal1 + integerArgument4, 0, -1);
            bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2 - 1, integerLocal1 + integerArgument4, 0, -1);
          }
          if (byteArgument5 != 75) {
            stringState0149 = (String) null;
          }
          bitmapFontArgument6.performAction1224(stringArgument3, integerArgument2, integerArgument4, integerArgument1, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ed.E(" + integerArgument1 + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + byteArgument5 + ',' + (bitmapFontArgument6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction0450(int integerArgument1) {
        stringState0148 = null;
        stringArrayState0011 = null;
        int integerLocal1 = -49 / ((-30 - integerArgument1) / 54);
        stringState0147 = null;
        calendarState0001 = null;
        stringState0149 = null;
    }

    final static void performAction0445(byte byteArgument1, boolean booleanArgument2) {
        int integerLocal1 = -33 / ((byteArgument1 - 79) / 41);
        RichTextLayout.sceneWidgetState0021.performAction1997(1141039778, booleanArgument2);
        UiComponentPart019 uiComponentPart019Local2 = MixedSupport009.uiComponentPart019State0001;
        if (uiComponentPart019Local2 == null) {
          return;
        }
        uiComponentPart019Local2.performAction0229(RichTextLayout.sceneWidgetState0021.integerState0886, RichTextLayout.sceneWidgetState0021.integerState0892, (byte) -72);
    }

    final static void performAction0449(ResourceArchive resourceArchiveArgument1, int integerArgument2, PcmStreamMixer pcmStreamMixerArgument3, int integerArgument4) {
        GameAssets.integerState0747 = integerArgument2 * InputAdapter004.computeInteger1233((byte) -74) / 1000;
        if (integerArgument4 != 20350) {
          return;
        }
        try {
          MixedSupport154.performAction2041((byte) -51, resourceArchiveArgument1);
          GameDomainSupport005.performAction1387(resourceArchiveArgument1, -2);
          MixedSupport032.performAction0520((byte) -113, resourceArchiveArgument1);
          MixedSupport010.performAction0153(-120);
          GameDomainSupport001.performAction0105(true);
          MixedSupport046.integerState0250 = 0 - GameAssets.integerState0747;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ed.A(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + (pcmStreamMixerArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ')');
        }
    }

    final static void performAction0446(int integerArgument1) {
        if (!MixedSupport141.booleanState0194) {
          throw new IllegalStateException();
        }
        UiComponentPart025.booleanState0152 = true;
        GameplayControls.performAction1982(true, 841566312);
        MixedSupport052.integerState0269 = 0;
        if (integerArgument1 > 101) {
          return;
        }
        String stringLocal1 = (String) null;
        MixedSupport029.computeSceneWidgetPart0140448((String) null, (byte) -16);
    }

    final static SceneWidgetPart014 computeSceneWidgetPart0140448(String stringArgument1, byte byteArgument2) {
        String stringLocal1 = null;
        int integerLocal2 = 0;
        SceneWidgetPart014 sceneWidgetPart014Local3 = null;
        String stringLocal4 = null;
        int integerLocal5 = 0;
        CharSequence charSequenceLocal6 = null;
        CharSequence charSequenceLocal7 = null;
        SceneWidgetPart014 stackSceneWidgetPart014Local8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (MixedSupport085.collectionSupport003State0003 == null) {
            return null;
          }
          if (stringArgument1 == null) {
            return null;
          }
          if (stringArgument1.length() == 0) {
            return null;
          }
          charSequenceLocal6 = (CharSequence) ((Object) stringArgument1);
          stringLocal1 = ComponentContainer.computeString1011(charSequenceLocal6, (byte) 2);
          integerLocal2 = 38 % ((-44 - byteArgument2) / 47);
          if (stringLocal1 == null) {
            return null;
          }
          sceneWidgetPart014Local3 = (SceneWidgetPart014) (MixedSupport085.collectionSupport003State0003.computeDualNode1280(24710, (long)stringLocal1.hashCode()));
          while (sceneWidgetPart014Local3 != null) {
            charSequenceLocal7 = (CharSequence) ((Object) sceneWidgetPart014Local3.stringState0606);
            stringLocal4 = ComponentContainer.computeString1011(charSequenceLocal7, (byte) 2);
            if (stringLocal4.equals(stringLocal1)) {
              stackSceneWidgetPart014Local8 = sceneWidgetPart014Local3;
              return stackSceneWidgetPart014Local8;
            }
            sceneWidgetPart014Local3 = (SceneWidgetPart014) (MixedSupport085.collectionSupport003State0003.computeDualNode1286(-17713));
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal13;
          stackStringBuilderLocal10 = new StringBuilder().append("ed.B(");
          if (stringArgument1 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(byteArgument2).append(')').toString());
        }
    }

    static {
        stringState0147 = "Name is available";
        calendarState0001 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        stringState0148 = null;
    }
}
