/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SceneWidgetNode extends DualNode {
    static String stringState0318;
    static RenderingSupport011 renderingSupport011State0002;
    static long longState0023;
    static PcmPlayer pcmPlayerState0002;
    static String stringState0319;
    static byte[] byteArrayState0012;

    final static boolean computeBoolean1036(int integerArgument1, int integerArgument2) {
        if (integerArgument2 != -8222) {
          return false;
        }
        return integerArgument1 >= 2 ? true : false;
    }

    SceneWidgetNode() {
    }

    public static void performAction1037(int integerArgument1) {
        if (integerArgument1 != 710) {
          return;
        }
        byteArrayState0012 = null;
        stringState0319 = null;
        stringState0318 = null;
        renderingSupport011State0002 = null;
        pcmPlayerState0002 = null;
    }

    final static byte[] computeByteArray1035(int integerArgument1, CharSequence charSequenceArgument2) {
        int integerLocal1 = 0;
        byte[] stackByteArrayLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        byte[] byteArrayLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != 6216) {
            byteArrayState0012 = (byte[]) null;
          }
          integerLocal7 = charSequenceArgument2.length();
          byteArrayLocal9 = new byte[integerLocal7];
          for (integerLocal1 = 0; integerLocal1 < integerLocal7; integerLocal1++) {
            {
              integerLocal10 = charSequenceArgument2.charAt(integerLocal1);
              if ((0 >= integerLocal10 ||
                integerLocal10 >= 128) && (integerLocal10 < 160 ||
                integerLocal10 > 255)) {
                switch (integerLocal10) {
                  case 8364:
                    byteArrayLocal9[integerLocal1] = (byte)-128;
                    break;
                  case 8218:
                    byteArrayLocal9[integerLocal1] = (byte)-126;
                    break;
                  case 402:
                    byteArrayLocal9[integerLocal1] = (byte)-125;
                    break;
                  case 8222:
                    byteArrayLocal9[integerLocal1] = (byte)-124;
                    break;
                  case 8230:
                    byteArrayLocal9[integerLocal1] = (byte)-123;
                    break;
                  case 8224:
                    byteArrayLocal9[integerLocal1] = (byte)-122;
                    break;
                  case 8225:
                    byteArrayLocal9[integerLocal1] = (byte)-121;
                    break;
                  case 710:
                    byteArrayLocal9[integerLocal1] = (byte)-120;
                    break;
                  case 8240:
                    byteArrayLocal9[integerLocal1] = (byte)-119;
                    break;
                  case 352:
                    byteArrayLocal9[integerLocal1] = (byte)-118;
                    break;
                  case 8249:
                    byteArrayLocal9[integerLocal1] = (byte)-117;
                    break;
                  case 338:
                    byteArrayLocal9[integerLocal1] = (byte)-116;
                    break;
                  case 381:
                    byteArrayLocal9[integerLocal1] = (byte)-114;
                    break;
                  case 8216:
                    byteArrayLocal9[integerLocal1] = (byte)-111;
                    break;
                  case 8217:
                    byteArrayLocal9[integerLocal1] = (byte)-110;
                    break;
                  case 8220:
                    byteArrayLocal9[integerLocal1] = (byte)-109;
                    break;
                  case 8221:
                    byteArrayLocal9[integerLocal1] = (byte)-108;
                    break;
                  case 8226:
                    byteArrayLocal9[integerLocal1] = (byte)-107;
                    break;
                  case 8211:
                    byteArrayLocal9[integerLocal1] = (byte)-106;
                    break;
                  case 8212:
                    byteArrayLocal9[integerLocal1] = (byte)-105;
                    break;
                  case 732:
                    byteArrayLocal9[integerLocal1] = (byte)-104;
                    break;
                  case 8482:
                    byteArrayLocal9[integerLocal1] = (byte)-103;
                    break;
                  case 353:
                    byteArrayLocal9[integerLocal1] = (byte)-102;
                    break;
                  case 8250:
                    byteArrayLocal9[integerLocal1] = (byte)-101;
                    break;
                  case 339:
                    byteArrayLocal9[integerLocal1] = (byte)-100;
                    break;
                  case 382:
                    byteArrayLocal9[integerLocal1] = (byte)-98;
                    break;
                  default:
                    byteArrayLocal9[integerLocal1] = (byte)63;
                    break;
                  case 376:
                    byteArrayLocal9[integerLocal1] = (byte)-97;
                    break;
                }
              } else {
                byteArrayLocal9[integerLocal1] = (byte)integerLocal10;
              }
            }
          }
          stackByteArrayLocal2 = byteArrayLocal9;
          return stackByteArrayLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal6 = caughtParameterLocal12;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("km.F(").append(integerArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    static {
        stringState0318 = "ESC - cancel this line";
        stringState0319 = "Advertising websites";
    }
}
