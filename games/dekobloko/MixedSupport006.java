/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport006 {
    static RawSound rawSoundState0001;
    static String stringState0027;
    static String stringState0028;
    SceneWidgetPart011 sceneWidgetPart011State0001;
    static String stringState0029;
    static String stringState0030;
    static String stringState0031;
    static int integerState0039;
    static String stringState0032;

    final static int computeInteger0072(int integerArgument1, int integerArgument2, byte byteArgument3) {
        if (NetworkSupport002.rgbSpriteState0008 == null) {
          return -1;
        }
        if (MixedSupport025.integerState0151 <= integerArgument1 &&
          NetworkSupport002.rgbSpriteState0008.integerState0258 + MixedSupport025.integerState0151 > integerArgument1 &&
          MixedSupport121.integerState0751 <= integerArgument2 &&
          integerArgument2 < MixedSupport121.integerState0751 + NetworkSupport002.rgbSpriteState0008.integerState0255) {
          return 0;
        }
        if (byteArgument3 != 7) {
          MixedSupport006.performAction0074(32, 49, false, -4);
        }
        if (MixedSupport121.integerState0753 <= integerArgument1 &&
          NetworkSupport002.rgbSpriteState0008.integerState0258 + MixedSupport121.integerState0753 > integerArgument1 &&
          integerArgument2 >= CollectionSupport002.integerState0138 &&
          NetworkSupport002.rgbSpriteState0008.integerState0255 + CollectionSupport002.integerState0138 > integerArgument2) {
          return 1;
        }
        return -1;
    }

    final static void performAction0074(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4) {
        int integerLocal1;
        NetworkSupport002.rgbSpriteState0008.performAction0300(integerArgument1, integerArgument2);
        if (booleanArgument3) {
          integerLocal1 = MixedSupport112.integerState0682 % NetworkSupport002.rgbSpriteState0008.integerState0258 * 2;
          if (NetworkSupport002.rgbSpriteState0008.integerState0258 <= integerLocal1) {
            integerLocal1 = NetworkSupport002.rgbSpriteState0008.integerState0258 - (integerLocal1 - NetworkSupport002.rgbSpriteState0008.integerState0258);
          }
          if (integerLocal1 < 10) {
            integerLocal1 = 10;
          } else {
            if (integerLocal1 > -40 + NetworkSupport002.rgbSpriteState0008.integerState0258) {
              integerLocal1 = NetworkSupport002.rgbSpriteState0008.integerState0258 - 40;
            }
          }
          GameAssets.performAction1700(0, 80, 25547, integerArgument1, 30, 0, integerLocal1, NetworkSupport002.rgbSpriteState0008, integerArgument2);
        }
        if (integerArgument4 != 40) {
          MixedSupport006.performAction0074(43, 33, true, -46);
        }
    }

    public static void performAction0070(byte byteArgument1) {
        stringState0027 = null;
        rawSoundState0001 = null;
        stringState0031 = null;
        stringState0028 = null;
        stringState0029 = null;
        stringState0030 = null;
        stringState0032 = null;
        if (byteArgument1 != -112) {
          MixedSupport006.computeInteger0072(-56, -90, (byte) -84);
        }
    }

    final void performAction0073(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 24;
        int integerLocal2 = 5;
        this.sceneWidgetPart011State0001.performAction1779(integerArgument1, integerArgument5, integerArgument2, integerLocal2, integerLocal1, integerArgument3, -53);
        if (integerArgument4 < 97) {
          MixedSupport006.performAction0074(127, 8, false, -33);
        }
        MixedSupport066.sceneWidgetState0060.performAction1994(RenderingSupport015.sceneWidgetState0112.integerState0896, 0, 0, ComponentContainer.integerState0377, 0);
        SceneWidgetPart011.sceneWidgetState0114.performAction1994(-2 - MixedSupport146.integerState0855 + (RenderingSupport015.sceneWidgetState0112.integerState0896 - 80) - 2, 0, ComponentContainer.integerState0377 + 2, 18, 0);
        TextLayout.sceneWidgetState0010.performAction1994(MixedSupport146.integerState0855 + 82, 0, 2 + ComponentContainer.integerState0377, 18, -80 - MixedSupport146.integerState0855 + (RenderingSupport015.sceneWidgetState0112.integerState0896 - 2));
        MixedSupport070.sceneWidgetPart010State0003.performAction1664(0, 1, -ComponentContainer.integerState0377 + (RenderingSupport015.sceneWidgetState0112.integerState0915 - 22), ComponentContainer.integerState0377 + 22, MixedSupport146.integerState0855, 2, RenderingSupport015.sceneWidgetState0112.integerState0896, 20);
        RenderingSupport003.sceneWidgetPart010State0001.performAction1663(MixedSupport146.integerState0855, 20, 2, 16);
    }

    MixedSupport006(String stringArgument1, SceneWidget sceneWidgetArgument2) {
        String[] stringArrayLocal1 = null;
        SceneWidget[] sceneWidgetArrayLocal2 = null;
        try {
          stringArrayLocal1 = new String[]{stringArgument1, InputAdapter002.stringState0033, MixedSupport129.stringState0536};
          sceneWidgetArrayLocal2 = new SceneWidget[]{sceneWidgetArgument2, RenderingSupport015.sceneWidgetState0112, (SceneWidget) ((Object) RenderingSupport003.sceneWidgetPart010State0001)};
          this.sceneWidgetPart011State0001 = new SceneWidgetPart011(0L, GameDomainSupport002.sceneWidgetState0022, stringArrayLocal1, MixedSupport035.sceneWidgetState0026, sceneWidgetArrayLocal2, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ak.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static MixedSupport023[] computeMixedSupport023Array0071(byte byteArgument1, PlatformService platformServiceArgument2) {
        int integerLocal1 = 0;
        MixedSupport023[] stackMixedSupport023ArrayLocal2 = null;
        MixedSupport023[] stackMixedSupport023ArrayLocal3 = null;
        MixedSupport023[] stackMixedSupport023ArrayLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        int[] integerArrayLocal10 = null;
        MixedSupport023[] mixedSupport023ArrayLocal11 = null;
        MixedSupport023 mixedSupport023Local12 = null;
        int integerLocal13 = 0;
        AsyncTask asyncTaskLocal14 = null;
        int[] integerArrayLocal15 = null;
        int[] integerArrayLocal16 = null;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!platformServiceArgument2.computeBoolean0573(-86)) {
            stackMixedSupport023ArrayLocal2 = new MixedSupport023[]{};
            return stackMixedSupport023ArrayLocal2;
          }
          asyncTaskLocal14 = platformServiceArgument2.computeAsyncTask0561((byte) 123);
          while (asyncTaskLocal14.integerState0510 == 0) {
            MixedSupport132.performAction1837(10L, -128);
          }
          if (asyncTaskLocal14.integerState0510 == 2) {
            stackMixedSupport023ArrayLocal3 = new MixedSupport023[]{};
            return stackMixedSupport023ArrayLocal3;
          }
          integerArrayLocal16 = (int[]) (asyncTaskLocal14.objectState0004);
          integerArrayLocal15 = integerArrayLocal16;
          integerArrayLocal10 = integerArrayLocal15;
          mixedSupport023ArrayLocal11 = new MixedSupport023[integerArrayLocal16.length >> 2];
          for (integerLocal1 = 0; integerLocal1 < mixedSupport023ArrayLocal11.length; integerLocal1++) {
            mixedSupport023Local12 = new MixedSupport023();
            mixedSupport023ArrayLocal11[integerLocal1] = mixedSupport023Local12;
            mixedSupport023Local12.integerState0127 = integerArrayLocal10[integerLocal1 << 2];
            mixedSupport023Local12.integerState0126 = integerArrayLocal10[1 + (integerLocal1 << 2)];
            mixedSupport023Local12.integerState0128 = integerArrayLocal10[(integerLocal1 << 2) + 2];
            mixedSupport023Local12.integerState0129 = integerArrayLocal10[3 + (integerLocal1 << 2)];
          }
          if (byteArgument1 != -109) {
            MixedSupport006.performAction0074(94, -113, true, 89);
          }
          stackMixedSupport023ArrayLocal4 = mixedSupport023ArrayLocal11;
          return stackMixedSupport023ArrayLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal8 = caughtParameterLocal17;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal9;
          stackStringBuilderLocal6 = new StringBuilder().append("ak.E(").append(byteArgument1).append(',');
          if (platformServiceArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        stringState0028 = "Stamina Highscores";
        stringState0027 = "Connection lost - attempting to reconnect";
        stringState0031 = "Rating";
        stringState0032 = "Playing";
        stringState0029 = "Press 'SPACE' or 'ENTER' to continue";
        stringState0030 = "This entry doesn't match";
    }
}
