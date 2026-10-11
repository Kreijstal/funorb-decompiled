/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport012 {
    static int integerState0758;
    private ResourceArchive resourceArchiveState0022;
    private MixedSupport078 mixedSupport078State0002;
    private ResourceArchive resourceArchiveState0023;
    static MixedSupport001 mixedSupport001State0001;
    static int integerState0759;

    final static int computeInteger1742(LoginCredentials loginCredentialsArgument1, LoginCredentials loginCredentialsArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          integerLocal1 = -118 / ((-48 - integerArgument3) / 32);
          stringLocal3 = (String) null;
          stackIntegerLocal4 = NetworkArchiveRequestManager.computeInteger1469(false, 0, loginCredentialsArgument1, 100, 0, loginCredentialsArgument2, (String) null);
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("sm.C(");
          if (loginCredentialsArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (loginCredentialsArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static RgbSprite computeRgbSprite1738(byte byteArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        RgbSprite rgbSpriteLocal2 = new RgbSprite(integerArgument2, integerArgument2);
        int integerLocal3 = 0;
        if (byteArgument1 >= -96) {
          integerState0759 = 97;
          while (rgbSpriteLocal2.integerArrayState0024.length > integerLocal3) {
            rgbSpriteLocal2.integerArrayState0024[integerLocal3] = integerArgument3;
            integerLocal3++;
          }
          return rgbSpriteLocal2;
        }
        while (rgbSpriteLocal2.integerArrayState0024.length > integerLocal3) {
          rgbSpriteLocal2.integerArrayState0024[integerLocal3] = integerArgument3;
          integerLocal3++;
        }
        return rgbSpriteLocal2;
    }

    public static void performAction1740(int integerArgument1) {
        if (integerArgument1 != 30553) {
          integerState0759 = 92;
          mixedSupport001State0001 = null;
          return;
        }
        mixedSupport001State0001 = null;
    }

    final static void performAction1739(byte byteArgument1, java.applet.Applet appletArgument2) {
        try {
          java.net.URL uRLLocal1 = null;
          Exception exceptionLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          RuntimeException stackRuntimeExceptionLocal4 = null;
          StringBuilder stackStringBuilderLocal5 = null;
          String stackStringLocal6 = null;
          Throwable caughtExceptionLocal7 = null;
          try {
            if (byteArgument1 != -65) {
              return;
            }
            try {
              uRLLocal1 = new java.net.URL(appletArgument2.getCodeBase(), "subscribe.ws");
              appletArgument2.getAppletContext().showDocument(NetworkSupport004.computeURL0662(uRLLocal1, -1, appletArgument2), "_top");
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
            stackStringBuilderLocal5 = new StringBuilder().append("sm.G(").append(byteArgument1).append(',');
            if (appletArgument2 == null) {
              stackStringLocal6 = "null";
            } else {
              stackStringLocal6 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    final static int computeInteger1737(byte byteArgument1) {
        if (byteArgument1 > -63) {
          integerState0759 = 90;
          return MixedSupport068.integerState0352;
        }
        return MixedSupport068.integerState0352;
    }

    final static boolean computeBoolean1743(int integerArgument1) {
        if (integerArgument1 != 1) {
          return false;
        }
        return TextLayout.booleanState0019;
    }

    NetworkSupport012(int integerArgument1, ResourceArchive resourceArchiveArgument2, ResourceArchive resourceArchiveArgument3, CallbackContract007 callbackContract007Argument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        this.mixedSupport078State0002 = new MixedSupport078(64);
        try {
          this.resourceArchiveState0022 = resourceArchiveArgument2;
          this.resourceArchiveState0023 = resourceArchiveArgument3;
          if (null != this.resourceArchiveState0022) {
            this.resourceArchiveState0022.computeInteger0925(-5228, 1);
          }
          if (null == this.resourceArchiveState0023) {
            return;
          }
          this.resourceArchiveState0023.computeInteger0925(-5228, 1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("sm.<init>(").append(integerArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (callbackContract007Argument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    final NetworkSupport007 computeNetworkSupport0071741(int integerArgument1, int integerArgument2) {
        byte[] byteArrayLocal1 = null;
        NetworkSupport007 networkSupport007Local2 = (NetworkSupport007) (this.mixedSupport078State0002.computeObject1046((long)integerArgument2, (byte) -63));
        if (networkSupport007Local2 != null) {
          return networkSupport007Local2;
        }
        if (integerArgument2 < 32768) {
          byteArrayLocal1 = this.resourceArchiveState0022.computeByteArray0912(integerArgument2, 88, 1);
        } else {
          byteArrayLocal1 = this.resourceArchiveState0023.computeByteArray0912(32767 & integerArgument2, -112, 1);
        }
        networkSupport007Local2 = new NetworkSupport007();
        if (byteArrayLocal1 != null) {
          networkSupport007Local2.performAction1167((byte) 80, new PacketBuffer(byteArrayLocal1));
        }
        if (32768 <= integerArgument2) {
          networkSupport007Local2.performAction1171(19423);
          this.mixedSupport078State0002.performAction1048(networkSupport007Local2, (long)integerArgument2, 125);
          if (integerArgument1 < 123) {
            NetworkSupport012.computeInteger1737((byte) 69);
            return networkSupport007Local2;
          }
          return networkSupport007Local2;
        }
        this.mixedSupport078State0002.performAction1048(networkSupport007Local2, (long)integerArgument2, 125);
        if (integerArgument1 >= 123) {
          return networkSupport007Local2;
        }
        NetworkSupport012.computeInteger1737((byte) 69);
        return networkSupport007Local2;
    }

    static {
    }
}
