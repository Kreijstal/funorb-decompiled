/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputAdapter006 {
    static String[] stringArrayState0042;
    static String stringState0498;
    String stringState0499;
    static int[] integerArrayState0206;
    String stringState0500;
    static SceneWidget sceneWidgetState0110;
    static String[] stringArrayState0043;
    boolean booleanState0175;
    static String[] stringArrayState0044;
    static RgbSprite rgbSpriteState0054;

    final static String computeString1696(String stringArgument1, String stringArgument2, int integerArgument3, byte byteArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        CipherPacketBuffer cipherPacketBufferLocal2 = null;
        int integerLocal3 = 0;
        SceneWidgetPart014 sceneWidgetPart014Local4 = null;
        CharSequence charSequenceLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        String stackStringLocal8 = null;
        String stackStringLocal9 = null;
        Object stackObjectLocal10 = null;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        try {
          if (byteArgument4 <= 122) {
            stackStringLocal6 = (String) null;
            return stackStringLocal6;
          }
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument1);
          if (!MixedSupport023.computeBoolean0371(charSequenceLocal5, (byte) -70)) {
            stackStringLocal7 = RenderingSupport003.stringState0199;
            return stackStringLocal7;
          }
          if (ThemeTips.integerState0351 != 2) {
            stackStringLocal8 = DualNode.stringState0043;
            return stackStringLocal8;
          }
          sceneWidgetPart014Local4 = UiComponentPart011.computeSceneWidgetPart0140610(-3805, stringArgument2);
          if (sceneWidgetPart014Local4 == null) {
            stackStringLocal9 = CollectionSupport001.computeString0336(97, MixedSupport061.stringState0258, new String[]{stringArgument2});
            return stackStringLocal9;
          }
          sceneWidgetPart014Local4.performAction0161((byte) 109);
          sceneWidgetPart014Local4.performAction0145((byte) 74);
          MixedSupport029.integerState0182 = MixedSupport029.integerState0182 - 1;
          cipherPacketBufferLocal2 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal2.performAction1861(integerArgument3, -4);
          cipherPacketBufferLocal2.position = cipherPacketBufferLocal2.position + 1;
          integerLocal3 = cipherPacketBufferLocal2.position;
          cipherPacketBufferLocal2.performAction2073(true, 3);
          cipherPacketBufferLocal2.performAction2066(0, stringArgument1);
          cipherPacketBufferLocal2.performAction2079(cipherPacketBufferLocal2.position - integerLocal3, true);
          stackObjectLocal10 = null;
          return (String) (stackObjectLocal10);
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal16 = caughtParameterLocal17;
          runtimeExceptionLocal1 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal11 = runtimeExceptionLocal1;
          stackStringBuilderLocal12 = new StringBuilder().append("sg.D(");
          if (stringArgument1 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',');
          if (stringArgument2 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(integerArgument3).append(',').append(byteArgument4).append(')').toString());
        }
    }

    public static void performAction1693(int integerArgument1) {
        sceneWidgetState0110 = null;
        rgbSpriteState0054 = null;
        if (integerArgument1 == 3) {
          stringArrayState0042 = null;
          stringArrayState0044 = null;
          stringArrayState0043 = null;
          stringState0498 = null;
          integerArrayState0206 = null;
          return;
        }
        String stringLocal1 = (String) null;
        InputAdapter006.computeString1696((String) null, (String) null, 114, (byte) 124);
        stringArrayState0042 = null;
        stringArrayState0044 = null;
        stringArrayState0043 = null;
        stringState0498 = null;
        integerArrayState0206 = null;
    }

    final static PlatformSupport006 computePlatformSupport0061694(int integerArgument1, PlatformService platformServiceArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        java.awt.Frame frameLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        PlatformSupport006 platformSupport006Local3 = null;
        PlatformService platformServiceLocal4 = null;
        java.awt.Frame frameLocal5 = null;
        PlatformSupport006 stackPlatformSupport006Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (integerArgument5 < 54) {
            platformServiceLocal4 = (PlatformService) null;
            InputAdapter006.computePlatformSupport0061694(-76, (PlatformService) null, 0, 22, 26, 93);
          }
          frameLocal5 = GameDomainSupport004.computeFrame0901(integerArgument6, platformServiceArgument2, integerArgument1, integerArgument3, false, integerArgument4);
          frameLocal1 = frameLocal5;
          if (frameLocal5 == null) {
            return null;
          }
          platformSupport006Local3 = new PlatformSupport006();
          platformSupport006Local3.frameState0003 = frameLocal5;
          platformSupport006Local3.frameState0003.add((java.awt.Component) ((Object) platformSupport006Local3));
          platformSupport006Local3.setBounds(0, 0, integerArgument1, integerArgument6);
          platformSupport006Local3.addFocusListener(platformSupport006Local3);
          platformSupport006Local3.requestFocus();
          stackPlatformSupport006Local6 = platformSupport006Local3;
          return stackPlatformSupport006Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("sg.B(").append(integerArgument1).append(',');
          if (platformServiceArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static void performAction1697(String[][] stringArrayArrayArgument1, boolean booleanArgument2, byte[] byteArrayArgument3, ResourceArchive resourceArchiveArgument4, int[] integerArrayArgument5, byte byteArgument6, String[][] stringArrayArrayArgument7, String[] stringArrayArgument8, int integerArgument9, byte[] byteArrayArgument10, IndexedSprite[] indexedSpriteArrayArgument11, int[] integerArrayArgument12, int integerArgument13, ResourceArchive resourceArchiveArgument14, String[] stringArrayArgument15, ResourceArchive resourceArchiveArgument16, RgbSprite[][] rgbSpriteArrayArrayArgument17, RgbSprite[][] rgbSpriteArrayArrayArgument18, int integerArgument19) {
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
        StringBuilder stackStringBuilderLocal24 = null;
        String stackStringLocal25 = null;
        StringBuilder stackStringBuilderLocal26 = null;
        String stackStringLocal27 = null;
        StringBuilder stackStringBuilderLocal28 = null;
        String stackStringLocal29 = null;
        RuntimeException caughtExceptionLocal30 = null;
        RuntimeException runtimeExceptionLocal31 = null;
        String[] stringArrayLocal32 = null;
        try {
          if (byteArgument6 > -2) {
            InputAdapter006.computeBoolean1695((String) null, 4, -122L);
          }
          stringArrayLocal32 = (String[]) null;
          SceneWidgetPart004.performAction0679(byteArrayArgument10, 1, indexedSpriteArrayArgument11, resourceArchiveArgument4, stringArrayArgument8, 3, integerArgument13, resourceArchiveArgument14, stringArrayArrayArgument7, rgbSpriteArrayArrayArgument18, booleanArgument2, integerArrayArgument5, rgbSpriteArrayArrayArgument17, byteArrayArgument3, stringArrayArrayArgument1, resourceArchiveArgument16, integerArgument19, stringArrayArgument15, integerArrayArgument12, (String[]) null);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal33) {
          caughtExceptionLocal30 = caughtParameterLocal33;
          runtimeExceptionLocal31 = caughtExceptionLocal30;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal31;
          stackStringBuilderLocal2 = new StringBuilder().append("sg.E(");
          if (stringArrayArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(booleanArgument2).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (integerArrayArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument6).append(',');
          if (stringArrayArrayArgument7 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (stringArrayArgument8 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument9).append(',');
          if (byteArrayArgument10 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',');
          if (indexedSpriteArrayArgument11 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',');
          if (integerArrayArgument12 == null) {
            stackStringLocal19 = "null";
          } else {
            stackStringLocal19 = "{...}";
          }
          stackStringBuilderLocal20 = ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',').append(integerArgument13).append(',');
          if (resourceArchiveArgument14 == null) {
            stackStringLocal21 = "null";
          } else {
            stackStringLocal21 = "{...}";
          }
          stackStringBuilderLocal22 = ((StringBuilder) (Object) stackStringBuilderLocal20).append(stackStringLocal21).append(',');
          if (stringArrayArgument15 == null) {
            stackStringLocal23 = "null";
          } else {
            stackStringLocal23 = "{...}";
          }
          stackStringBuilderLocal24 = ((StringBuilder) (Object) stackStringBuilderLocal22).append(stackStringLocal23).append(',');
          if (resourceArchiveArgument16 == null) {
            stackStringLocal25 = "null";
          } else {
            stackStringLocal25 = "{...}";
          }
          stackStringBuilderLocal26 = ((StringBuilder) (Object) stackStringBuilderLocal24).append(stackStringLocal25).append(',');
          if (rgbSpriteArrayArrayArgument17 == null) {
            stackStringLocal27 = "null";
          } else {
            stackStringLocal27 = "{...}";
          }
          stackStringBuilderLocal28 = ((StringBuilder) (Object) stackStringBuilderLocal26).append(stackStringLocal27).append(',');
          if (rgbSpriteArrayArrayArgument18 == null) {
            stackStringLocal29 = "null";
          } else {
            stackStringLocal29 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal28).append(stackStringLocal29).append(',').append(integerArgument19).append(')').toString());
        }
    }

    final static boolean computeBoolean1695(String stringArgument1, int integerArgument2, long longArgument3) {
        SceneWidgetPart014 sceneWidgetPart014Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          sceneWidgetPart014Local1 = MixedSupport029.computeSceneWidgetPart0140448(stringArgument1, (byte) 16);
          if (integerArgument2 <= 111) {
            sceneWidgetState0110 = (SceneWidget) null;
          }
          if (sceneWidgetPart014Local1 != null &&
            sceneWidgetPart014Local1.stringState0604 != null) {
            return true;
          }
          stackBooleanLocal3 = (MixedSupport016.sceneWidgetPart013State0001 != null) && (MixedSupport011.computeSceneWidgetPart0120169(longArgument3, (byte) 50) != null);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("sg.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(longArgument3).append(')').toString());
        }
    }

    static {
        stringArrayState0042 = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        stringArrayState0043 = new String[]{"Before playing a multiplayer game, please learn the ropes by completing the first 3 stages of Stamina Mode. It will only take a few minutes.", "Congratulations! The multiplayer game is now unlocked.<br><br>If you wish, you can continue playing Stamina Mode, or you can end this game any time and enter the multiplayer lobby. Press 'ESC' for the Options Menu."};
        stringArrayState0044 = new String[3];
        stringState0498 = "You are offering to draw.";
    }
}
