/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport005 extends HashNode {
    static String[] stringArrayState0019;
    static ValidationStatus validationStatusState0003;
    int integerState0382;
    int integerState0383;
    int integerState0384;
    static String stringState0313;
    int integerState0385;
    static SceneWidgetPart008 sceneWidgetPart008State0004;
    int integerState0386;
    int integerState0387;

    final static MixedSupport056 computeMixedSupport0560907(int integerArgument1, boolean booleanArgument2) {
        boolean stackBooleanLocal1 = false;
        int stackIntegerLocal2 = 0;
        int[] stackIntegerArrayLocal3 = null;
        Throwable caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        Exception exceptionLocal8 = null;
        int integerLocal9 = 0;
        CipherPacketBuffer cipherPacketBufferLocal10 = null;
        NetworkSupport007 networkSupport007Local11 = null;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 0) {
          return (MixedSupport056) null;
        }
        cipherPacketBufferLocal10 = LabeledWidgetContainer.cipherPacketBufferState0001;
        integerLocal5 = cipherPacketBufferLocal10.readUnsignedByte((byte) -99);
        BirthDateChatEnableForm.integerState0505 = 127 & integerLocal5;
        stackBooleanLocal1 = ((integerLocal5 & 128) != 0);
        MixedSupport043.booleanState0050 = stackBooleanLocal1;
        MixedSupport121.integerState0777 = cipherPacketBufferLocal10.readUnsignedByte((byte) -71);
        MixedSupport036.longState0015 = cipherPacketBufferLocal10.readLong((byte) -108);
        if (BirthDateChatEnableForm.integerState0505 != 2) {
          Bzip2State.integerState0873 = 0;
          MixedSupport058.integerState0318 = 0;
        } else {
          Bzip2State.integerState0873 = cipherPacketBufferLocal10.readUnsignedShort(integerArgument1 + 3);
          MixedSupport058.integerState0318 = cipherPacketBufferLocal10.readUnsignedMedium(integerArgument1 + 65280);
        }
        stackIntegerLocal2 = (1 != cipherPacketBufferLocal10.readUnsignedByte((byte) -32)) ? 0 : 1;
        integerLocal6 = stackIntegerLocal2;
        ResourceSupport001.stringState0012 = cipherPacketBufferLocal10.readNullTerminatedString((byte) -38);
        if (integerLocal6 == 0) {
          MixedSupport112.stringState0489 = ResourceSupport001.stringState0012;
        } else {
          MixedSupport112.stringState0489 = cipherPacketBufferLocal10.readNullTerminatedString((byte) -38);
        }
        if (BirthDateChatEnableForm.integerState0505 == 1) {
          ClientException.integerState0141 = cipherPacketBufferLocal10.readUnsignedShort(3);
          MixedSupport106.stringState0456 = cipherPacketBufferLocal10.readNullTerminatedString((byte) -38);
        } else {
          if (BirthDateChatEnableForm.integerState0505 != 4) {
            MixedSupport106.stringState0456 = null;
            ClientException.integerState0141 = 0;
          } else {
            ClientException.integerState0141 = cipherPacketBufferLocal10.readUnsignedShort(3);
            MixedSupport106.stringState0456 = cipherPacketBufferLocal10.readNullTerminatedString((byte) -38);
          }
        }
        if (!booleanArgument2) {
          FullscreenStatusDialog.stringState0248 = MixedSupport077.computeString0958(80, 0, cipherPacketBufferLocal10);
          MixedSupport034.integerArrayState0043 = null;
          return new MixedSupport056(booleanArgument2);
        }
        integerLocal7 = cipherPacketBufferLocal10.readUnsignedShort(3);
        try {
          networkSupport007Local11 = AccountCreationResultPanel.networkSupport012State0001.computeNetworkSupport0071535(127, integerLocal7);
          FullscreenStatusDialog.stringState0248 = networkSupport007Local11.computeString1043((byte) -61);
          if (MixedSupport112.stringState0489.equals(MixedSupport089.stringState0372)) {
            stackIntegerArrayLocal3 = null;
          } else {
            stackIntegerArrayLocal3 = networkSupport007Local11.integerArrayState0154;
          }
          MixedSupport034.integerArrayState0043 = stackIntegerArrayLocal3;
        } catch (java.lang.Exception caughtParameterLocal12) {
          caughtExceptionLocal4 = caughtParameterLocal12;
          exceptionLocal8 = (Exception) (Object) caughtExceptionLocal4;
          NetworkArchiveRequestManager.performAction1289((Throwable) ((Object) exceptionLocal8), 16408, "CC1");
          FullscreenStatusDialog.stringState0248 = null;
          MixedSupport034.integerArrayState0043 = null;
          return new MixedSupport056(booleanArgument2);
        }
        return new MixedSupport056(booleanArgument2);
    }

    final static void performAction0906(byte byteArgument1, java.applet.Applet appletArgument2) {
        try {
          java.net.URL uRLLocal1 = null;
          Exception exceptionLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          RuntimeException stackRuntimeExceptionLocal4 = null;
          StringBuilder stackStringBuilderLocal5 = null;
          String stackStringLocal6 = null;
          Throwable caughtExceptionLocal7 = null;
          try {
            try {
              uRLLocal1 = new java.net.URL(appletArgument2.getCodeBase(), "toserverlist.ws");
              if (byteArgument1 != 96) {
                NetworkSupport005.performAction0908((byte) 42);
              }
              appletArgument2.getAppletContext().showDocument(NetworkSupport004.computeURL0599(uRLLocal1, byteArgument1 ^ -97, appletArgument2), "_top");
              return;
            } catch (java.lang.Exception caughtParameterLocal8) {
              caughtExceptionLocal7 = caughtParameterLocal8;
              exceptionLocal2 = (Exception) (Object) caughtExceptionLocal7;
              exceptionLocal2.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal9) {
            caughtExceptionLocal7 = caughtParameterLocal9;
            runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal7;
            stackRuntimeExceptionLocal4 = runtimeExceptionLocal3;
            stackStringBuilderLocal5 = new StringBuilder().append("ki.C(").append(byteArgument1).append(',');
            if (appletArgument2 == null) {
              stackStringLocal6 = "null";
            } else {
              stackStringLocal6 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    public static void performAction0908(byte byteArgument1) {
        validationStatusState0003 = null;
        sceneWidgetPart008State0004 = null;
        stringState0313 = null;
        if (byteArgument1 == 22) {
          stringArrayState0019 = null;
          return;
        }
        java.applet.Applet appletLocal1 = (java.applet.Applet) null;
        NetworkSupport005.performAction0906((byte) 121, (java.applet.Applet) null);
        stringArrayState0019 = null;
    }

    NetworkSupport005(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        this.integerState0385 = integerArgument1;
        this.integerState0387 = integerArgument5;
        this.integerState0384 = integerArgument6;
        this.integerState0382 = integerArgument3;
        this.integerState0383 = integerArgument2;
        this.integerState0386 = integerArgument4;
    }

    static {
        stringArrayState0019 = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        stringState0313 = "Any special items you earn will be given to both you and the player who gets your shapes!";
        validationStatusState0003 = new ValidationStatus();
    }
}
