/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport120 extends DualNode {
    static String[] stringArrayState0041;
    boolean booleanState0172;
    static int integerState0746;
    static int[] integerArrayState0205;
    static long[] longArrayState0009;
    volatile boolean booleanState0173;
    boolean booleanState0174;

    abstract byte[] computeByteArray0518(byte byteArgument1);

    final static String computeString1691(int integerArgument1) {
        String stackStringLocal1 = null;
        Object stackObjectLocal2 = null;
        RuntimeException caughtExceptionLocal3 = null;
        Object objectLocal4 = null;
        Object objectLocal5 = null;
        String stringLocal6 = null;
        int integerLocal7 = 0;
        String stringLocal8 = null;
        String stringLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        String stringLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        String stringLocal15;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          objectLocal4 = null;
          objectLocal5 = null;
          if (NetworkSupport010.integerState0585 == 0 &&
            UiComponentPart011.sceneWidgetPart013State0002 != null) {
            objectLocal5 = MixedSupport048.stringState0204;
          }
          if (2 == NetworkSupport010.integerState0585 &&
            !MixedSupport056.computeBoolean0745((byte) -53)) {
            if (!RenderingSupport013.computeBoolean1525(TextLayout.stringState0081, 3)) {
              objectLocal5 = CollectionSupport001.computeString0336(96, UiComponentPart029.stringState0496, new String[]{MixedSupport029.stringState0149});
              if (integerLocal14 != 0) {
                objectLocal5 = CollectionSupport001.computeString0336(87, MixedSupport023.stringState0105, new String[]{MixedSupport029.stringState0149});
              }
            } else {
              objectLocal5 = CollectionSupport001.computeString0336(87, MixedSupport023.stringState0105, new String[]{MixedSupport029.stringState0149});
            }
            if (GameDomainSupport004.booleanState0087) {
              UiComponentPart004.performAction0200((String) null, (String) null, (String) (objectLocal5), (byte) 125, 2, 0);
              UiComponentPart026.performAction1582(13);
            }
          }
          if (null == objectLocal5 &&
            !ProxySocketFactory.booleanState0169 &&
            UiComponentPart031.sceneWidgetState0116 == null) {
            objectLocal5 = UiComponentPart003.stringState0059;
          }
          if (null != objectLocal5) {
            MixedSupport020.performAction0320((String) null, 0, MixedSupport062.integerState0332, (String) (objectLocal5), -24503);
          } else {
            stringLocal6 = MixedSupport094.stringState0372;
            stringLocal6 = UiComponentPart002.computeString0088(107, stringLocal6);
            stringLocal8 = "";
            stringLocal9 = "|";
            integerLocal10 = NetworkSupport010.integerState0585;
            integerLocal11 = 0;
            if (integerLocal10 == 2) {
              stringLocal8 = CollectionSupport001.computeString0336(81, NetworkSupport009.stringState0388, new String[]{MixedSupport029.stringState0149});
              stringLocal12 = CollectionSupport001.computeString0336(125, CacheWorkQueue.stringState0266, new String[]{stringLocal6});
              integerLocal11 = -485 + DiagnosticSupport002.sceneWidgetState0057.integerState0896 + UiComponentPart033.sceneWidgetState0150.integerState0896 - (-MixedSupport038.bitmapFontState0013.computeInteger1208(stringLocal12) + MixedSupport038.bitmapFontState0013.computeInteger1208(stringLocal8));
              if (0 > integerLocal11) {
                integerLocal11 = 0;
              }
            }
            if (integerLocal10 != 2 ||
              integerLocal14 != 0) {
              if (0 == integerLocal10) {
                if (MixedSupport016.sceneWidgetPart013State0001 == null &&
                  MixedSupport061.booleanState0077) {
                  stringLocal8 = "[" + MixedSupport134.stringState0554 + "] ";
                }
                if (null != MixedSupport016.sceneWidgetPart013State0001) {
                  boolean sharedTailLocal16 = (!(MixedSupport153.booleanState0224) ||
                    null == MixedSupport033.stringState0158);
                  if (!sharedTailLocal16) {
                    stringLocal8 = "[" + MixedSupport033.stringState0158 + "] ";
                    sharedTailLocal16 = (integerLocal14 != 0);
                  }
                  if (sharedTailLocal16) {
                    stringLocal8 = "[" + CollectionSupport001.computeString0336(115, PlatformSupport004.stringState0232, new String[]{MixedSupport016.sceneWidgetPart013State0001.stringState0585}) + "] ";
                  }
                  integerLocal10 = 1;
                }
              }
              if (AudioSupport004.computeBoolean1600(false)) {
                stackStringLocal1 = ": ";
              } else {
                stackStringLocal1 = "<img=3>: ";
              }
              stringLocal15 = stackStringLocal1;
              stringLocal8 = stringLocal8 + stringLocal6 + stringLocal15;
              if (!MixedSupport151.booleanState0221) {
                if (PacketBuffer.booleanState0228) {
                  stringLocal9 = "";
                  stringLocal8 = "<col=999999>" + stringLocal8 + MixedSupport018.stringState0092 + "</col>";
                  if (integerLocal14 != 0) {
                    stringLocal9 = "";
                    stringLocal8 = "<col=999999>" + stringLocal8 + MixedSupport145.stringState0591 + "</col>";
                  }
                }
              } else {
                stringLocal9 = "";
                stringLocal8 = "<col=999999>" + stringLocal8 + MixedSupport145.stringState0591 + "</col>";
              }
              integerLocal13 = MixedSupport038.bitmapFontState0013.computeInteger1208(stringLocal8);
              if (!AudioSupport004.computeBoolean1600(false)) {
                if (UiComponentPart033.sceneWidgetState0150.booleanState0218 &&
                  (HashNode.integerState0069 - UiComponentPart033.sceneWidgetState0150.integerState0892) < integerLocal13) {
                  if (MixedSupport151.booleanState0221) {
                    objectLocal4 = "Broken!";
                  } else {
                    objectLocal4 = MixedSupport018.stringState0092;
                  }
                }
                if (UiComponentPart033.sceneWidgetState0150.integerState0891 != 0 &&
                  integerLocal13 > UiComponentPart033.sceneWidgetState0150.integerState0897 &&
                  !MixedSupport151.booleanState0221) {
                  NetworkSupport001.performAction0067(-1045);
                }
              }
            }
            MixedSupport020.performAction0320(stringLocal9, integerLocal11, MixedSupport129.integerArrayState0207[integerLocal10], stringLocal8 + BitmapFont.computeString1226(UiComponentPart008.stringBuilderState0001.toString()), -24503);
            if (!LoginCredentials.booleanState0085) {
              DiagnosticSupport002.sceneWidgetState0057.booleanState0218 = false;
            }
            if (DiagnosticSupport002.sceneWidgetState0057.booleanState0218) {
              objectLocal4 = CollectionSupport001.computeString0336(126, MixedSupport144.stringState0590, new String[]{stringLocal6, MixedSupport029.stringState0149});
            }
          }
          integerLocal7 = 125 % ((30 - integerArgument1) / 41);
          stackObjectLocal2 = objectLocal4;
          return (String) (stackObjectLocal2);
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal3 = caughtParameterLocal17;
          objectLocal4 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (objectLocal4), "sf.C(" + integerArgument1 + ')');
        }
    }

    abstract int computeInteger0516(boolean booleanArgument1);

    public static void performAction1692(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          longArrayState0009 = null;
          stringArrayState0041 = null;
          if (byteArgument1 > -123) {
            integerState0746 = -69;
          }
          integerArrayState0205 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "sf.A(" + byteArgument1 + ')');
        }
    }

    MixedSupport120() {
        this.booleanState0173 = true;
    }

    static {
        integerArrayState0205 = new int[8192];
        longArrayState0009 = new long[32];
        integerState0746 = 0;
        stringArrayState0041 = new String[]{"All scores", "My scores", "Best each"};
    }
}
