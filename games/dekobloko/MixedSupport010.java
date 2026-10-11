/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport010 {
    static int integerState0066;
    static String stringState0046;
    static BitmapFont bitmapFontState0005;
    static int integerState0067;
    static String stringState0047;
    static String stringState0048;
    static String stringState0049;

    final static NetworkSupport002 computeNetworkSupport0020154(boolean booleanArgument1) {
        if (MixedSupport053.networkSupport002State0002 == null) {
          MixedSupport053.networkSupport002State0002 = new NetworkSupport002();
          MixedSupport053.networkSupport002State0002.performAction0195(13421772, GameDomainSupport003.bitmapFontState0015);
          MixedSupport053.networkSupport002State0002.integerState0086 = 14;
          MixedSupport053.networkSupport002State0002.bitmapFontState0008 = MixedSupport011.bitmapFontState0006;
          MixedSupport053.networkSupport002State0002.integerState0081 = 0;
          MixedSupport053.networkSupport002State0002.integerState0085 = 5;
          MixedSupport053.networkSupport002State0002.integerState0083 = 7697781;
          MixedSupport053.networkSupport002State0002.integerState0087 = 2763306;
          MixedSupport053.networkSupport002State0002.integerState0084 = 6;
          MixedSupport053.networkSupport002State0002.integerState0082 = 4;
        }
        if (booleanArgument1) {
          return MixedSupport053.networkSupport002State0002;
        }
        stringState0048 = (String) null;
        return MixedSupport053.networkSupport002State0002;
    }

    public static void performAction0152(byte byteArgument1) {
        stringState0048 = null;
        stringState0049 = null;
        bitmapFontState0005 = null;
        stringState0046 = null;
        stringState0047 = null;
        int integerLocal1 = -115 / ((byteArgument1 + 42) / 57);
    }

    final static void performAction0153(int integerArgument1) {
        int integerLocal1 = 0;
        double doubleLocal2 = 0.0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport109.performAction1539();
          MixedSupport017.integerArrayState0023 = new int[260];
          if (integerArgument1 > -113) {
            MixedSupport010.performAction0153(-59);
          }
          NetworkSupport007.integerState0503 = 11;
          for (integerLocal1 = 0; 256 > integerLocal1; integerLocal1++) {
            doubleLocal2 = 15.0;
            MixedSupport017.integerArrayState0023[integerLocal1] = (int)(255.0 * Math.pow((double)((float)integerLocal1 / 256.0f), doubleLocal2));
          }
          integerLocal4 = 256;
          integerLocal7 = integerLocal4;
          while (MixedSupport017.integerArrayState0023.length > integerLocal4) {
            MixedSupport017.integerArrayState0023[integerLocal4] = 255;
            integerLocal4++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal5 = caughtParameterLocal8;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "bg.A(" + integerArgument1 + ')');
        }
    }

    final static void performAction0155(byte[] byteArrayArgument1, int[] integerArrayArgument2, String[] stringArrayArgument3, byte[] byteArrayArgument4, int integerArgument5, String[][] stringArrayArrayArgument6, ResourceArchive resourceArchiveArgument7, int integerArgument8, int integerArgument9, ResourceArchive resourceArchiveArgument10, RgbSprite[][] rgbSpriteArrayArrayArgument11, RgbSprite[][] rgbSpriteArrayArrayArgument12, boolean booleanArgument13, ResourceArchive resourceArchiveArgument14, String[][] stringArrayArrayArgument15) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        StringBuilder stackStringBuilderLocal18 = null;
        String stackStringLocal19 = null;
        StringBuilder stackStringBuilderLocal20 = null;
        String stackStringLocal21 = null;
        StringBuilder stackStringBuilderLocal22 = null;
        String stackStringLocal23 = null;
        RuntimeException caughtExceptionLocal24 = null;
        RuntimeException runtimeExceptionLocal25 = null;
        try {
          SceneWidgetPart010.performAction1665(integerArgument9 ^ 25206, integerArgument5, rgbSpriteArrayArrayArgument12, byteArrayArgument4, rgbSpriteArrayArrayArgument11, integerArgument8, booleanArgument13, stringArrayArrayArgument15, integerArrayArgument2, byteArrayArgument1, resourceArchiveArgument7, (int[]) null, resourceArchiveArgument10, (IndexedSprite[]) null, stringArrayArgument3, stringArrayArrayArgument6, resourceArchiveArgument14);
          if (integerArgument9 != 25150) {
            MixedSupport010.performAction0152((byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal26) {
          caughtExceptionLocal24 = caughtParameterLocal26;
          runtimeExceptionLocal25 = caughtExceptionLocal24;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal25;
          stackStringBuilderLocal2 = new StringBuilder().append("bg.C(");
          if (byteArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (stringArrayArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (byteArrayArgument4 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument5).append(',');
          if (stringArrayArrayArgument6 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (resourceArchiveArgument7 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',');
          if (resourceArchiveArgument10 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',');
          if (rgbSpriteArrayArrayArgument11 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',');
          if (rgbSpriteArrayArrayArgument12 == null) {
            stackStringLocal19 = "null";
          } else {
            stackStringLocal19 = "{...}";
          }
          stackStringBuilderLocal20 = ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',').append(booleanArgument13).append(',');
          if (resourceArchiveArgument14 == null) {
            stackStringLocal21 = "null";
          } else {
            stackStringLocal21 = "{...}";
          }
          stackStringBuilderLocal22 = ((StringBuilder) (Object) stackStringBuilderLocal20).append(stackStringLocal21).append(',');
          if (stringArrayArrayArgument15 == null) {
            stackStringLocal23 = "null";
          } else {
            stackStringLocal23 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal22).append(stackStringLocal23).append(')').toString());
        }
    }

    static {
        stringState0046 = "<%0> has entered another game.";
        stringState0049 = "This password contains your email address, and would be easy to guess";
        stringState0048 = "Loading extra data";
        stringState0047 = "You do not have a suitable number of players for the current options.";
    }
}
