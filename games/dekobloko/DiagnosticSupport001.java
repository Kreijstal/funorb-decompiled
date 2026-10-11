/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DiagnosticSupport001 extends IOException {
    static char[] characterArrayState0004;
    static SceneWidget sceneWidgetState0017;
    static String[] stringArrayState0004;
    static int[] integerArrayState0030;
    static boolean booleanState0024;
    static RgbSprite rgbSpriteState0011;
    static int integerState0125;

    public static void performAction0361(byte byteArgument1) {
        integerArrayState0030 = null;
        sceneWidgetState0017 = null;
        characterArrayState0004 = null;
        rgbSpriteState0011 = null;
        if (byteArgument1 > 40) {
          stringArrayState0004 = null;
          return;
        }
        String stringLocal1 = (String) null;
        DiagnosticSupport001.performAction0363(-81, (String) null, (String) null, false);
        stringArrayState0004 = null;
    }

    final static void performAction0363(int integerArgument1, String stringArgument2, String stringArgument3, boolean booleanArgument4) {
        try {
          SceneWidgetPart011.stringState0525 = stringArgument3;
          if (integerArgument1 >= -125) {
            java.awt.Component componentLocal1 = (java.awt.Component) null;
            DiagnosticSupport001.performAction0364((java.awt.Component) null, true);
          }
          SceneWidgetPart004.stringState0217 = stringArgument2;
          MixedSupport154.performAction2044(booleanArgument4, -83, MixedSupport066.stringState0273);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "db.A(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + booleanArgument4 + ')');
        }
    }

    final static void performAction0364(java.awt.Component componentArgument1, boolean booleanArgument2) {
        try {
          componentArgument1.setFocusTraversalKeysEnabled(booleanArgument2);
          componentArgument1.addKeyListener(MixedSupport033.inputAdapter004State0001);
          componentArgument1.addFocusListener(MixedSupport033.inputAdapter004State0001);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "db.B(" + (componentArgument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    final static String computeString0368(byte byteArgument1) {
        if (MixedSupport094.stringState0372 == null) {
          return "";
        }
        if (byteArgument1 < 59) {
          return (String) null;
        }
        return MixedSupport094.stringState0372;
    }

    final static void performAction0366(boolean booleanArgument1) {
        MixedSupport146.sceneWidgetPart004State0001 = null;
        if (!booleanArgument1) {
          DiagnosticSupport001.performAction0366(true);
        }
    }

    final static String computeString0367(CharSequence[] charSequenceArrayArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = 81 / ((integerArgument2 - 44) / 62);
          stackStringLocal3 = PlatformSupport004.computeString0701(charSequenceArrayArgument1.length, 0, charSequenceArrayArgument1, (byte) 74);
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("db.E(");
          if (charSequenceArrayArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    DiagnosticSupport001(String stringArgument1) {
        super(stringArgument1);
    }

    final static void performAction0362(int integerArgument1, Object objectArgument2, PlatformService platformServiceArgument3) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        Throwable caughtExceptionLocal7 = null;
        Exception exceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (platformServiceArgument3.eventQueueState0001 == null) {
            return;
          }
          for (integerLocal1 = 0; integerLocal1 < 50; integerLocal1++) {
            if (null != platformServiceArgument3.eventQueueState0001.peekEvent()) {
              MixedSupport132.performAction1837(1L, -128);
              continue;
            }
            break;
          }
          try {
            if (integerArgument1 >= -33) {
              DiagnosticSupport001.computeString0367((CharSequence[]) null, -126);
            }
            if (objectArgument2 == null) {
              return;
            }
            platformServiceArgument3.eventQueueState0001.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(objectArgument2, 1001, "dummy")));
            return;
          } catch (java.lang.Exception caughtParameterLocal11) {
            caughtExceptionLocal7 = caughtParameterLocal11;
            exceptionLocal8 = (Exception) (Object) caughtExceptionLocal7;
            return;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal7 = caughtParameterLocal12;
          runtimeExceptionLocal9 = (RuntimeException) (Object) caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal9;
          stackStringBuilderLocal3 = new StringBuilder().append("db.F(").append(integerArgument1).append(',');
          if (objectArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (platformServiceArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray0365(String stringArgument1, String stringArgument2, ResourceArchive resourceArchiveArgument3, boolean booleanArgument4, String stringArgument5) {
        RgbSprite cachedRgbSpriteLocal1 = null;
        RgbSprite cachedRgbSpriteLocal2 = null;
        RgbSprite cachedRgbSpriteLocal3 = null;
        RgbSprite[] rgbSpriteArrayLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        RgbSprite[] stackRgbSpriteArrayLocal6 = null;
        RgbSprite[] stackRgbSpriteArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        RuntimeException caughtExceptionLocal17 = null;
        try {
          rgbSpriteArrayLocal4 = new RgbSprite[9];
          if (!booleanArgument4) {
            stackRgbSpriteArrayLocal6 = (RgbSprite[]) null;
            return stackRgbSpriteArrayLocal6;
          }
          cachedRgbSpriteLocal1 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument3, stringArgument5, "", 8192);
          rgbSpriteArrayLocal4[8] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[6] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[2] = cachedRgbSpriteLocal1;
          rgbSpriteArrayLocal4[0] = cachedRgbSpriteLocal1;
          cachedRgbSpriteLocal2 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument3, stringArgument2, "", 8192);
          rgbSpriteArrayLocal4[7] = cachedRgbSpriteLocal2;
          rgbSpriteArrayLocal4[1] = cachedRgbSpriteLocal2;
          cachedRgbSpriteLocal3 = UiComponentPart015.computeRgbSprite0791(resourceArchiveArgument3, stringArgument1, "", 8192);
          rgbSpriteArrayLocal4[5] = cachedRgbSpriteLocal3;
          rgbSpriteArrayLocal4[3] = cachedRgbSpriteLocal3;
          stackRgbSpriteArrayLocal7 = rgbSpriteArrayLocal4;
          return stackRgbSpriteArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal17 = caughtParameterLocal18;
          runtimeExceptionLocal5 = caughtExceptionLocal17;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal5;
          stackStringBuilderLocal9 = new StringBuilder().append("db.D(");
          if (stringArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument2 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          stackStringBuilderLocal15 = ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(booleanArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(')').toString());
        }
    }

    static {
        characterArrayState0004 = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        stringArrayState0004 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
