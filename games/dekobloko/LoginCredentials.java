/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentials {
    private boolean booleanState0084;
    static int[] integerArrayState0115;
    static String[] tutorialTips;
    static boolean booleanState0085;
    private String stringState0281;
    static int integerState0348;
    static RawSound rawSoundState0013;
    static int[] integerArrayState0116;
    static String stringState0282;
    static byte[][][] byteArrayArrayArrayState0001;
    static volatile boolean booleanState0086;
    static MusicTrack musicTrackState0004;

    public static void performAction0898(byte byteArgument1) {
        tutorialTips = null;
        integerArrayState0115 = null;
        integerArrayState0116 = null;
        musicTrackState0004 = null;
        rawSoundState0013 = null;
        int integerLocal1 = 26 / ((-24 - byteArgument1) / 49);
        byteArrayArrayArrayState0001 = (byte[][][]) null;
        stringState0282 = null;
    }

    final static void performAction0894(java.applet.Applet appletArgument1, int integerArgument2) {
        String stringLocal1 = null;
        String stringLocal2 = null;
        long longLocal3 = 0L;
        try {
          MixedSupport144.booleanState0209 = true;
          if (integerArgument2 != 0) {
            integerArrayState0115 = (int[]) null;
          }
          stringLocal1 = "tuhstatbut";
          stringLocal2 = "rvnadlm";
          longLocal3 = -1L;
          MixedSupport104.performAction1408(appletArgument1, stringLocal1, longLocal3, (byte) 89, stringLocal2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "jg.C(" + (appletArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final boolean computeBoolean0895(boolean booleanArgument1) {
        if (!booleanArgument1) {
          LoginCredentials.performAction0892(-65);
          return this.booleanState0084;
        }
        return this.booleanState0084;
    }

    final static void performAction0896(boolean booleanArgument1, String stringArgument2) {
        MixedSupport056.stringState0242 = stringArgument2;
        if (!booleanArgument1) {
          return;
        }
        try {
          InputAdapter003.performAction0749(12, (byte) -111);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "jg.G(" + booleanArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static MusicTrack computeMusicTrack0897(boolean booleanArgument1, NetworkSupport011 networkSupport011Argument2, int integerArgument3, int integerArgument4, ResourceArchive resourceArchiveArgument5) {
        byte[] byteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        byte[] byteArrayLocal4 = null;
        MusicTrack stackMusicTrackLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          byteArrayLocal4 = resourceArchiveArgument5.computeByteArray0912(integerArgument3, 108, integerArgument4);
          byteArrayLocal1 = byteArrayLocal4;
          if (!booleanArgument1) {
            stringLocal3 = (String) null;
            LoginCredentials.performAction0896(false, (String) null);
          }
          if (byteArrayLocal4 == null) {
            return null;
          }
          stackMusicTrackLocal5 = new MusicTrack(new PacketBuffer(byteArrayLocal4), networkSupport011Argument2);
          return stackMusicTrackLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("jg.B(").append(booleanArgument1).append(',');
          if (networkSupport011Argument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (resourceArchiveArgument5 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final static SceneWidget computeSceneWidget0899(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090;
        }
        ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
        LoginCredentials.computeMusicTrack0897(true, (NetworkSupport011) null, 58, 53, (ResourceArchive) null);
        return MixedSupport047.sceneWidgetPart008State0003.sceneWidgetState0090;
    }

    static long computeLong0893(long longArgument1, long longArgument2) {
        return longArgument1 & longArgument2;
    }

    LoginCredentials(String stringArgument1, boolean booleanArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          this.stringState0281 = stringArgument1;
          if (this.stringState0281 == null) {
            this.stringState0281 = "";
          }
          stackBooleanLocal2 = (booleanArgument2);
          this.booleanState0084 = stackBooleanLocal2;
          if (this.stringState0281.length() != 0) {
            return;
          }
          this.booleanState0084 = false;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("jg.<init>(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final String computeString0891(byte byteArgument1) {
        if (byteArgument1 == 56) {
          return this.stringState0281;
        }
        ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
        LoginCredentials.computeMusicTrack0897(true, (NetworkSupport011) null, -94, -75, (ResourceArchive) null);
        return this.stringState0281;
    }

    LoginCredentials(String stringArgument1) {
        this(stringArgument1, false);
    }

    final static void performAction0892(int integerArgument1) {
        NetworkSupport011.performAction1437(3970);
        if (integerArgument1 >= -38) {
          integerArrayState0116 = (int[]) null;
        }
    }

    static {
        booleanState0085 = true;
        integerState0348 = 0;
        tutorialTips = new String[]{"This shape is called a Deko:", "This shape is called a Bloko:", "You can activate special items by popping shapes next to them.", "Using 'Z' and 'X' for rotation will give you more control.", "If you pop 2 or more shapes in one go, you will be awarded a special item!", "If you pop 4 or more shapes in one go, you will be awarded 2 special items!", "If you pop 7 or more shapes in one go, you will be awarded 4 special items!", "In multiplayer, any special items you earn will be given to both you and your victim.", "Dropping shapes quickly using the 'DOWN' arrow will give you 'fast drop' bonus points.", "Try popping several shapes simultaneously for bonus points!", "Try popping several shapes in a row for bonus points! This is called a chain.", "A chain of 2 will give you 1000 points, but a chain of 4 will give you 6000 points!"};
        stringState0282 = "Players: ";
        integerArrayState0116 = new int[8192];
        booleanState0086 = false;
    }
}
