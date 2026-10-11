/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NetworkSupport006 {
    private boolean booleanState0112;
    static String stringState0339;
    private int[] integerArrayState0151;
    private int integerState0498;
    static int integerState0499;
    static int[] integerArrayState0152;
    private int integerState0500;

    final static boolean computeBoolean1152(boolean booleanArgument1, int integerArgument2) {
        try {
          long cachedLongLocal1 = 0L;
          int integerLocal2 = 0;
          CipherPacketBuffer cipherPacketBufferLocal3 = null;
          IOException iOExceptionLocal4 = null;
          int stackIntegerLocal5 = 0;
          Throwable caughtExceptionLocal6 = null;
          if (MixedSupport070.asyncTaskState0004 == null) {
            MixedSupport070.asyncTaskState0004 = CodecSupport001.platformServiceState0002.computeAsyncTask0568(114, MixedSupport085.stringState0340, MixedSupport052.integerState0270);
          }
          if (MixedSupport070.asyncTaskState0004.integerState0510 == 0) {
            return false;
          }
          cachedLongLocal1 = MixedSupport063.computeLong0827(4);
          ArchiveRequestManager.longState0011 = cachedLongLocal1;
          MixedSupport100.longState0040 = cachedLongLocal1;
          if (MixedSupport070.asyncTaskState0004.integerState0510 != 1) {
            UiComponentPart023.mixedSupport139State0009 = MixedSupport075.mixedSupport139State0005;
          } else {
            try {
              GameSession.bufferedSocketState0002 = new BufferedSocket((java.net.Socket) (MixedSupport070.asyncTaskState0004.objectState0004), CodecSupport001.platformServiceState0002);
              cipherPacketBufferLocal3 = UiComponentPart006.cipherPacketBufferState0001;
              SocketFactory.cipherPacketBufferState0002.position = 0;
              UiComponentPart023.mixedSupport139State0009 = ResourceSupport002.mixedSupport139State0001;
              stackIntegerLocal5 = (!booleanArgument1) ? -1 : -2;
              UiComponentPart017.integerState0438 = stackIntegerLocal5;
              GameDomainSupport001.integerState0051 = stackIntegerLocal5;
              ComponentContainer.integerState0378 = stackIntegerLocal5;
              cipherPacketBufferLocal3.position = 0;
              MixedSupport049.performAction0649(MixedSupport071.integerState0356, MixedSupport077.integerState0415, 17, SocketFactory.cipherPacketBufferState0002, BufferedSocket.integerState0662);
              UiComponentPart033.performAction2052(4792, -1);
            } catch (java.io.IOException caughtParameterLocal7) {
              caughtExceptionLocal6 = caughtParameterLocal7;
              iOExceptionLocal4 = (IOException) (Object) caughtExceptionLocal6;
              UiComponentPart023.mixedSupport139State0009 = MixedSupport075.mixedSupport139State0005;
              MixedSupport070.asyncTaskState0004 = null;
              integerLocal2 = 79 / ((integerArgument2 - 21) / 48);
              return true;
            }
          }
          MixedSupport070.asyncTaskState0004 = null;
          integerLocal2 = 79 / ((integerArgument2 - 21) / 48);
          return true;
        } catch (RuntimeException | Error uncheckedExceptionLocal8) {
          throw uncheckedExceptionLocal8;
        } catch (Throwable checkedExceptionLocal9) {
          throw new RuntimeException(checkedExceptionLocal9);
        }
    }

    final int computeInteger1147(int integerArgument1) {
        int integerLocal1 = 97 % ((integerArgument1 - 37) / 50);
        return this.integerState0498 + 1;
    }

    final static String computeString1149(int integerArgument1, MixedSupport056 mixedSupport056Argument2) {
        String stackStringLocal1 = null;
        Object stackObjectLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        Object objectLocal6 = null;
        String stringLocal7 = null;
        Object objectLocal8 = null;
        int integerLocal9 = 0;
        String stringLocal10 = null;
        String stringLocal11;
        Object objectLocal12;
        String stringLocal13;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          objectLocal6 = null;
          if (mixedSupport056Argument2.stringState0243 != null) {
            stringLocal10 = mixedSupport056Argument2.stringState0243;
            stringLocal7 = stringLocal10;
            stringLocal13 = stringLocal10;
            objectLocal6 = stringLocal10;
            if (mixedSupport056Argument2.integerState0288 == 1) {
              objectLocal6 = "<img=0>" + stringLocal10;
            }
            if (mixedSupport056Argument2.integerState0288 == 2) {
              objectLocal6 = "<img=1>" + (String) (objectLocal6);
              objectLocal8 = objectLocal6;
              objectLocal12 = objectLocal6;
            }
          }
          if (integerArgument1 <= 96) {
            integerState0499 = -12;
          }
          stringLocal11 = "";
          if (2 == mixedSupport056Argument2.integerState0290) {
            if (!mixedSupport056Argument2.booleanState0070) {
              if (0 == mixedSupport056Argument2.integerState0291 &&
                mixedSupport056Argument2.integerState0286 == 0) {
                stringLocal11 = CollectionSupport001.computeString0336(90, NetworkSupport009.stringState0388, new String[]{(String) (objectLocal6)});
              } else {
                stringLocal11 = CollectionSupport001.computeString0336(110, CacheWorkQueue.stringState0266, new String[]{(String) (objectLocal6)});
              }
            }
          } else {
            if (0 == mixedSupport056Argument2.integerState0290 &&
              MixedSupport061.booleanState0077) {
              stringLocal11 = "[" + MixedSupport134.stringState0554 + "] ";
            }
            if (mixedSupport056Argument2.integerState0290 == 1) {
              stringLocal11 = "[" + CollectionSupport001.computeString0336(125, PlatformSupport004.stringState0232, new String[]{mixedSupport056Argument2.stringState0244}) + "] ";
            }
            if (4 == mixedSupport056Argument2.integerState0290 &&
              MixedSupport033.stringState0158 != null) {
              stringLocal11 = "[" + MixedSupport033.stringState0158 + "] ";
            }
            if (mixedSupport056Argument2.integerState0290 == 3) {
              stringLocal11 = "[#" + mixedSupport056Argument2.stringState0244 + "] ";
            }
            if (!mixedSupport056Argument2.booleanState0070) {
              stringLocal11 = stringLocal11 + (String) (objectLocal6) + ": ";
            }
          }
          stackStringLocal1 = stringLocal11;
          return stackStringLocal1;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal5 = caughtParameterLocal14;
          objectLocal6 = caughtExceptionLocal5;
          stackObjectLocal2 = objectLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("mb.D(").append(integerArgument1).append(',');
          if (mixedSupport056Argument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final int computeInteger1154(int integerArgument1, int integerArgument2) {
        if (integerArgument1 > this.integerState0498) {
          throw new ArrayIndexOutOfBoundsException(integerArgument1);
        }
        if (integerArgument2 == 0) {
          return this.integerArrayState0151[integerArgument1];
        }
        this.integerState0500 = -5;
        return this.integerArrayState0151[integerArgument1];
    }

    private final void performAction1148(int integerArgument1, int integerArgument2) {
        int[] integerArrayLocal1 = new int[this.computeInteger1145((byte) -63, integerArgument1)];
        int[] integerArrayLocal2 = integerArrayLocal1;
        if (integerArgument2 < -4) {
          MixedSupport008.performAction0085(this.integerArrayState0151, 0, integerArrayLocal1, 0, this.integerArrayState0151.length);
          this.integerArrayState0151 = integerArrayLocal1;
          return;
        }
        this.computeInteger1154(9, -101);
        MixedSupport008.performAction0085(this.integerArrayState0151, 0, integerArrayLocal1, 0, this.integerArrayState0151.length);
        this.integerArrayState0151 = integerArrayLocal1;
    }

    private final int computeInteger1145(byte byteArgument1, int integerArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 == -63) {
          integerLocal1 = this.integerArrayState0151.length;
          while (integerArgument2 >= integerLocal1) {
            if (!this.booleanState0112) {
              integerLocal1 = integerLocal1 + this.integerState0500;
              continue;
            }
            if (integerLocal1 == 0) {
              integerLocal1 = 1;
              continue;
            }
            integerLocal1 = integerLocal1 * this.integerState0500;
          }
          return integerLocal1;
        }
        this.integerState0500 = -94;
        integerLocal3 = this.integerArrayState0151.length;
        while (integerArgument2 >= integerLocal3) {
          if (!this.booleanState0112) {
            integerLocal3 = integerLocal3 + this.integerState0500;
            continue;
          }
          if (integerLocal3 == 0) {
            integerLocal3 = 1;
            continue;
          }
          integerLocal3 = integerLocal3 * this.integerState0500;
        }
        return integerLocal3;
    }

    private final void performAction1146(byte byteArgument1, int integerArgument2, int integerArgument3) {
        if (this.integerState0498 < integerArgument2) {
          this.integerState0498 = integerArgument2;
          if (byteArgument1 < 38) {
            return;
          }
          if (integerArgument2 >= this.integerArrayState0151.length) {
            this.performAction1148(integerArgument2, -23);
            this.integerArrayState0151[integerArgument2] = integerArgument3;
            return;
          }
          this.integerArrayState0151[integerArgument2] = integerArgument3;
          return;
        }
        if (byteArgument1 < 38) {
          return;
        }
        if (integerArgument2 < this.integerArrayState0151.length) {
          this.integerArrayState0151[integerArgument2] = integerArgument3;
          return;
        }
        this.performAction1148(integerArgument2, -23);
        this.integerArrayState0151[integerArgument2] = integerArgument3;
    }

    private NetworkSupport006() throws Throwable {
        throw new Error();
    }

    final static int computeInteger1153(boolean booleanArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 256 + integerArgument2 * (-integerArgument5 + integerArgument4);
        if (booleanArgument1) {
          integerLocal1 += 64;
        }
        if (byteArgument3 == -122) {
          return integerLocal1;
        }
        stringState0339 = (String) null;
        return integerLocal1;
    }

    final void performAction1150(int integerArgument1, boolean booleanArgument2) {
        if (!booleanArgument2) {
          this.performAction1146((byte) 114, this.integerState0498 + 1, integerArgument1);
          return;
        }
        stringState0339 = (String) null;
        this.performAction1146((byte) 114, this.integerState0498 + 1, integerArgument1);
    }

    public static void performAction1151(boolean booleanArgument1) {
        stringState0339 = null;
        integerArrayState0152 = null;
        if (booleanArgument1) {
          stringState0339 = (String) null;
        }
    }

    final void performAction1155(int integerArgument1, int integerArgument2) {
        if (integerArgument2 < 0) {
          throw new ArrayIndexOutOfBoundsException(integerArgument2);
        }
        if (this.integerState0498 < integerArgument2) {
          throw new ArrayIndexOutOfBoundsException(integerArgument2);
        }
        if (integerArgument1 <= -25) {
          if (this.integerState0498 != integerArgument2) {
            MixedSupport008.performAction0085(this.integerArrayState0151, integerArgument2 + 1, this.integerArrayState0151, integerArgument2, this.integerState0498 - integerArgument2);
          }
          this.integerState0498 = this.integerState0498 - 1;
          return;
        }
        this.integerState0500 = 15;
        if (this.integerState0498 != integerArgument2) {
          MixedSupport008.performAction0085(this.integerArrayState0151, integerArgument2 + 1, this.integerArrayState0151, integerArgument2, this.integerState0498 - integerArgument2);
        }
        this.integerState0498 = this.integerState0498 - 1;
    }

    static {
        stringState0339 = "Special Items";
    }
}
