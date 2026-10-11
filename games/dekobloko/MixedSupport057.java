/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport057 {
    static String stringState0245;
    static NodeDeque nodeDequeState0010;
    static String stringState0246;
    static String stringState0247;
    static int integerState0296;
    static int integerState0297;
    static SceneWidget sceneWidgetState0051;

    final static int computeInteger0764(int integerArgument1) {
        if (integerArgument1 != 1) {
          return -83;
        }
        return PlatformSupport006.integerState0670;
    }

    public static void performAction0767(int integerArgument1) {
        stringState0245 = null;
        sceneWidgetState0051 = null;
        nodeDequeState0010 = null;
        stringState0246 = null;
        if (integerArgument1 != 28180) {
          return;
        }
        stringState0247 = null;
    }

    final static void performAction0765(PacketBuffer packetBufferArgument1, int integerArgument2) {
        try {
          int integerLocal1 = 0;
          byte[] byteArrayLocal2 = null;
          int integerLocal3 = 0;
          Exception exceptionLocal4 = null;
          int integerLocal5 = 0;
          byte[] byteArrayLocal6 = null;
          RuntimeException stackRuntimeExceptionLocal7 = null;
          StringBuilder stackStringBuilderLocal8 = null;
          String stackStringLocal9 = null;
          Throwable caughtExceptionLocal10 = null;
          RuntimeException runtimeExceptionLocal11 = null;
          integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            byteArrayLocal6 = new byte[24];
            byteArrayLocal2 = byteArrayLocal6;
            if (UiComponentPart008.mixedSupport091State0001 != null) {
              try {
                UiComponentPart008.mixedSupport091State0001.performAction1268(0L, (byte) -109);
                UiComponentPart008.mixedSupport091State0001.performAction1269(byteArrayLocal6, (byte) -76);
                for (integerLocal3 = 0; integerLocal3 < 24; integerLocal3++) {
                  if (byteArrayLocal2[integerLocal3] == 0) {
                    continue;
                  }
                  break;
                }
                if (integerLocal3 >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception caughtParameterLocal12) {
                caughtExceptionLocal10 = caughtParameterLocal12;
                exceptionLocal4 = (Exception) (Object) caughtExceptionLocal10;
                for (integerLocal1 = 0; integerLocal1 < 24; integerLocal1++) {
                  byteArrayLocal2[integerLocal1] = (byte)-1;
                }
              }
              packetBufferArgument1.performAction2074(false, 24, byteArrayLocal2, integerArgument2);
            } else {
              packetBufferArgument1.performAction2074(false, 24, byteArrayLocal2, integerArgument2);
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal13) {
            caughtExceptionLocal10 = caughtParameterLocal13;
            runtimeExceptionLocal11 = (RuntimeException) (Object) caughtExceptionLocal10;
            stackRuntimeExceptionLocal7 = runtimeExceptionLocal11;
            stackStringBuilderLocal8 = new StringBuilder().append("i.A(");
            if (packetBufferArgument1 == null) {
              stackStringLocal9 = "null";
            } else {
              stackStringLocal9 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal14) {
          throw uncheckedExceptionLocal14;
        } catch (Throwable checkedExceptionLocal15) {
          throw new RuntimeException(checkedExceptionLocal15);
        }
    }

    final static byte[] computeByteArray0766(byte[] byteArrayArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        byte[] byteArrayLocal6 = null;
        byte[] byteArrayLocal7 = null;
        PacketBuffer packetBufferLocal8 = null;
        byte[] byteArrayLocal9 = null;
        byte[] byteArrayLocal10 = null;
        byte[] byteArrayLocal11 = null;
        byte[] byteArrayLocal12 = null;
        byte[] stackByteArrayLocal13 = null;
        byte[] stackByteArrayLocal14 = null;
        RuntimeException stackRuntimeExceptionLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        Throwable caughtExceptionLocal18 = null;
        Object objectLocal19 = null;
        try {
          packetBufferLocal8 = new PacketBuffer(byteArrayArgument1);
          integerLocal2 = packetBufferLocal8.computeInteger2085((byte) -119);
          integerLocal4 = -11 / ((-4 - integerArgument2) / 59);
          integerLocal3 = packetBufferLocal8.computeInteger2096(7553);
          if (integerLocal3 >= 0 && (ResourceSupport001.integerState0025 == 0 ||
            !(integerLocal3 > ResourceSupport001.integerState0025))) {
            if (integerLocal2 == 0) {
              byteArrayLocal12 = new byte[integerLocal3];
              byteArrayLocal10 = byteArrayLocal12;
              byteArrayLocal6 = byteArrayLocal10;
              packetBufferLocal8.performAction2075(byteArrayLocal12, 0, (byte) 126, integerLocal3);
              stackByteArrayLocal14 = byteArrayLocal6;
              return stackByteArrayLocal14;
            }
            integerLocal5 = packetBufferLocal8.computeInteger2096(7553);
            if (integerLocal5 >= 0 && (ResourceSupport001.integerState0025 == 0 ||
              !(ResourceSupport001.integerState0025 < integerLocal5))) {
              byteArrayLocal11 = new byte[integerLocal5];
              byteArrayLocal9 = byteArrayLocal11;
              byteArrayLocal7 = byteArrayLocal9;
              if (1 != integerLocal2) {
                objectLocal19 = MixedSupport067.codecSupport001State0001;
                synchronized (objectLocal19) {
                  MixedSupport067.codecSupport001State0001.performAction1076((byte) 111, packetBufferLocal8, byteArrayLocal11);
                }
              } else {
                MixedSupport125.computeInteger1788(byteArrayLocal11, integerLocal5, byteArrayArgument1, integerLocal3, 9);
              }
              stackByteArrayLocal13 = byteArrayLocal7;
              return stackByteArrayLocal13;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal18 = caughtParameterLocal20;
          runtimeExceptionLocal1 = (RuntimeException) (Object) caughtExceptionLocal18;
          stackRuntimeExceptionLocal15 = runtimeExceptionLocal1;
          stackStringBuilderLocal16 = new StringBuilder().append("i.C(");
          if (byteArrayArgument1 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal15), ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        stringState0247 = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        stringState0246 = "Create a free Account";
        stringState0245 = "Accept";
    }
}
