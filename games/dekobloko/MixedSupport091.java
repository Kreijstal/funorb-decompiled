/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport091 {
    private long longState0033;
    private long longState0034;
    private long longState0035;
    private long longState0036;
    private long longState0037;
    private PlatformSupport004 platformSupport004State0004;
    private int integerState0538;
    private byte[] byteArrayState0018;
    private long longState0038;
    private byte[] byteArrayState0019;
    private int integerState0539;
    static MixedSupport111 mixedSupport111State0005;
    static boolean booleanState0120;
    static char[] characterArrayState0006;
    static String stringState0366;

    public static void performAction1264(byte byteArgument1) {
        stringState0366 = null;
        characterArrayState0006 = null;
        if (byteArgument1 != -73) {
          return;
        }
        mixedSupport111State0005 = null;
    }

    final void performAction1268(long longArgument1, byte byteArgument2) throws IOException {
        if (longArgument1 >= 0L) {
          this.longState0036 = longArgument1;
          if (byteArgument2 != -109) {
            MixedSupport091.performAction1264((byte) 91);
          }
          return;
        }
        throw new IOException();
    }

    private final void performAction1271(byte byteArgument1) throws IOException {
        int integerLocal1;
        long longLocal2;
        long longLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = 75 / ((byteArgument1 + 55) / 40);
        if (this.longState0037 != -1L) {
          if (~this.longState0037 != ~this.longState0033) {
            this.platformSupport004State0004.performAction0702(this.longState0037, 80);
            this.longState0033 = this.longState0037;
          }
          this.platformSupport004State0004.performAction0704(this.byteArrayState0019, 117, 0, this.integerState0539);
          this.longState0033 = this.longState0033 + (long)this.integerState0539;
          if (this.longState0034 < this.longState0033) {
            this.longState0034 = this.longState0033;
          }
          longLocal2 = -1L;
          if (this.longState0037 >= this.longState0038 &&
            this.longState0037 < (this.longState0038 + (long)this.integerState0538)) {
            longLocal2 = this.longState0037;
          } else {
            if (this.longState0037 <= this.longState0038 &&
              ((long)this.integerState0539 + this.longState0037) > this.longState0038) {
              longLocal2 = this.longState0038;
            }
          }
          longLocal3 = -1L;
          if (this.longState0038 < ((long)this.integerState0539 + this.longState0037) &&
            (long)this.integerState0538 + this.longState0038 >= (long)this.integerState0539 + this.longState0037) {
            longLocal3 = this.longState0037 + (long)this.integerState0539;
          } else {
            if ((long)this.integerState0538 + this.longState0038 > this.longState0037 &&
              this.longState0038 + (long)this.integerState0538 <= this.longState0037 + (long)this.integerState0539) {
              longLocal3 = this.longState0038 + (long)this.integerState0538;
            }
          }
          if (-1L < longLocal2 &&
            longLocal2 < longLocal3) {
            integerLocal4 = (int)(longLocal3 - longLocal2);
            MixedSupport008.performAction0082(this.byteArrayState0019, (int)(-this.longState0037 + longLocal2), this.byteArrayState0018, (int)(-this.longState0038 + longLocal2), integerLocal4);
          }
          this.longState0037 = -1L;
          this.integerState0539 = 0;
        }
    }

    final long computeLong1272(int integerArgument1) {
        int integerLocal1 = 93 / ((-25 - integerArgument1) / 62);
        return this.longState0035;
    }

    private final void performAction1266(int integerArgument1) throws IOException {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.integerState0538 = integerArgument1;
        if (this.longState0033 != this.longState0036) {
          this.platformSupport004State0004.performAction0702(this.longState0036, 123);
          this.longState0033 = this.longState0036;
        }
        this.longState0038 = this.longState0036;
        while (this.integerState0538 < this.byteArrayState0018.length) {
          integerLocal1 = -this.integerState0538 + this.byteArrayState0018.length;
          if (integerLocal1 > 200000000) {
            integerLocal1 = 200000000;
          }
          integerLocal2 = this.platformSupport004State0004.computeInteger0703(this.byteArrayState0018, (byte) -103, this.integerState0538, integerLocal1);
          if (-1 == integerLocal2) {
            break;
          }
          this.integerState0538 = this.integerState0538 + integerLocal2;
          this.longState0033 = this.longState0033 + (long)integerLocal2;
        }
    }

    final void performAction1267(int integerArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4) throws IOException {
        int previousIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        Throwable caughtExceptionLocal5 = null;
        long longLocal6 = 0L;
        IOException iOExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        long longLocal12 = 0L;
        long longLocal13 = 0L;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          try {
            if (integerArgument3 != 741) {
              MixedSupport091.performAction1265((byte) 18, 18);
            }
            if (byteArrayArgument2.length < integerArgument1 + integerArgument4) {
              throw new ArrayIndexOutOfBoundsException(-byteArrayArgument2.length + (integerArgument1 + integerArgument4));
            }
            if (this.longState0037 != -1L &&
              this.longState0036 >= this.longState0037 &&
              this.longState0036 + (long)integerArgument4 <= (long)this.integerState0539 + this.longState0037) {
              MixedSupport008.performAction0082(this.byteArrayState0019, (int)(-this.longState0037 + this.longState0036), byteArrayArgument2, integerArgument1, integerArgument4);
              this.longState0036 = this.longState0036 + (long)integerArgument4;
              return;
            }
            longLocal6 = this.longState0036;
            integerLocal9 = integerArgument1;
            integerLocal10 = integerArgument4;
            if (this.longState0036 >= this.longState0038 &&
              this.longState0036 < (long)this.integerState0538 + this.longState0038) {
              integerLocal11 = (int)((long)this.integerState0538 + (-this.longState0036 + this.longState0038));
              if (integerArgument4 < integerLocal11) {
                integerLocal11 = integerArgument4;
              }
              MixedSupport008.performAction0082(this.byteArrayState0018, (int)(this.longState0036 - this.longState0038), byteArrayArgument2, integerArgument1, integerLocal11);
              this.longState0036 = this.longState0036 + (long)integerLocal11;
              integerArgument4 = integerArgument4 - integerLocal11;
              integerArgument1 = integerArgument1 + integerLocal11;
            }
            boolean frameRemainderLocal19 = true;
            boolean frameCompletedLocal20 = true;
            if (integerArgument4 > this.byteArrayState0018.length) {
              this.platformSupport004State0004.performAction0702(this.longState0036, 23);
              this.longState0033 = this.longState0036;
              while (0 < integerArgument4) {
                integerLocal16 = this.platformSupport004State0004.computeInteger0703(byteArrayArgument2, (byte) -38, integerArgument1, integerArgument4);
                if (integerLocal16 == -1) {
                  frameCompletedLocal20 = false;
                  break;
                }
                this.longState0033 = this.longState0033 + (long)integerLocal16;
                integerArgument4 = integerArgument4 - integerLocal16;
                integerArgument1 = integerArgument1 + integerLocal16;
                this.longState0036 = this.longState0036 + (long)integerLocal16;
              }
              frameRemainderLocal19 = !(frameCompletedLocal20);
            }
            if ((frameRemainderLocal19) &&
              (frameCompletedLocal20) &&
              (integerArgument4 > 0)) {
              this.performAction1266(0);
              integerLocal18 = integerArgument4;
              if (this.integerState0538 < integerLocal18) {
                integerLocal18 = this.integerState0538;
              }
              MixedSupport008.performAction0082(this.byteArrayState0018, 0, byteArrayArgument2, integerArgument1, integerLocal18);
              integerArgument1 = integerArgument1 + integerLocal18;
              integerArgument4 = integerArgument4 - integerLocal18;
              this.longState0036 = this.longState0036 + (long)integerLocal18;
            }
            if (this.longState0037 != -1L) {
              if (this.longState0036 < this.longState0037 &&
                integerArgument4 > 0) {
                integerLocal17 = integerArgument1 + (int)(this.longState0037 - this.longState0036);
                if (integerLocal17 > integerArgument1 + integerArgument4) {
                  integerLocal17 = integerArgument4 + integerArgument1;
                }
                while (integerLocal17 > integerArgument1) {
                  integerArgument4--;
                  previousIntegerLocal1 = integerArgument1;
                  integerArgument1++;
                  byteArrayArgument2[previousIntegerLocal1] = (byte) 0;
                  this.longState0036 = this.longState0036 + 1L;
                }
              }
              longLocal12 = -1L;
              if (longLocal6 <= this.longState0037 &&
                this.longState0037 < longLocal6 + (long)integerLocal10) {
                longLocal12 = this.longState0037;
              } else {
                if (this.longState0037 <= longLocal6 &&
                  longLocal6 < ((long)this.integerState0539 + this.longState0037)) {
                  longLocal12 = longLocal6;
                }
              }
              longLocal13 = -1L;
              if ((long)this.integerState0539 + this.longState0037 > longLocal6 &&
                ((long)integerLocal10 + longLocal6) >= ((long)this.integerState0539 + this.longState0037)) {
                longLocal13 = this.longState0037 + (long)this.integerState0539;
              } else {
                if (this.longState0037 < (long)integerLocal10 + longLocal6 &&
                  ((long)this.integerState0539 + this.longState0037) >= (longLocal6 + (long)integerLocal10)) {
                  longLocal13 = (long)integerLocal10 + longLocal6;
                }
              }
              if (longLocal12 > -1L &&
                longLocal13 > longLocal12) {
                integerLocal14 = (int)(longLocal13 - longLocal12);
                MixedSupport008.performAction0082(this.byteArrayState0019, (int)(-this.longState0037 + longLocal12), byteArrayArgument2, integerLocal9 + (int)(-longLocal6 + longLocal12), integerLocal14);
                if (longLocal13 > this.longState0036) {
                  integerArgument4 = (int)((long)integerArgument4 - (-this.longState0036 + longLocal13));
                  this.longState0036 = longLocal13;
                }
              }
            }
          } catch (java.io.IOException caughtParameterLocal21) {
            caughtExceptionLocal5 = caughtParameterLocal21;
            iOExceptionLocal7 = (IOException) (Object) caughtExceptionLocal5;
            this.longState0033 = -1L;
            throw iOExceptionLocal7;
          }
          if (integerArgument4 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal5 = caughtParameterLocal22;
          runtimeExceptionLocal8 = (RuntimeException) (Object) caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal8;
          stackStringBuilderLocal3 = new StringBuilder().append("nh.H(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction1273(byte byteArgument1) throws IOException {
        this.performAction1271((byte) -99);
        this.platformSupport004State0004.performAction0700(-82);
        if (byteArgument1 < 113) {
          characterArrayState0006 = (char[]) null;
        }
    }

    final void performAction1270(byte[] byteArrayArgument1, byte byteArgument2, int integerArgument3, int integerArgument4) throws IOException {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        Throwable caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        long longLocal6 = 0L;
        IOException iOExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        long longLocal9 = 0L;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          try {
            if (this.longState0035 < (this.longState0036 + (long)integerArgument4)) {
              this.longState0035 = (long)integerArgument4 + this.longState0036;
            }
            if (-1L != this.longState0037 && (this.longState0036 < this.longState0037 ||
              this.longState0036 > (this.longState0037 + (long)this.integerState0539))) {
              this.performAction1271((byte) -120);
            }
            if (this.longState0037 != -1L &&
              this.longState0036 + (long)integerArgument4 > this.longState0037 + (long)this.byteArrayState0019.length) {
              integerLocal5 = (int)((long)this.byteArrayState0019.length + (this.longState0037 - this.longState0036));
              MixedSupport008.performAction0082(byteArrayArgument1, integerArgument3, this.byteArrayState0019, (int)(this.longState0036 - this.longState0037), integerLocal5);
              integerArgument3 = integerArgument3 + integerLocal5;
              integerArgument4 = integerArgument4 - integerLocal5;
              this.longState0036 = this.longState0036 + (long)integerLocal5;
              this.integerState0539 = this.byteArrayState0019.length;
              this.performAction1271((byte) -15);
            }
            if (this.byteArrayState0019.length >= integerArgument4) {
              if (byteArgument2 <= 91) {
                stringState0366 = (String) null;
              }
              if (integerArgument4 <= 0) {
                return;
              }
              if (this.longState0037 == -1L) {
                this.longState0037 = this.longState0036;
              }
              MixedSupport008.performAction0082(byteArrayArgument1, integerArgument3, this.byteArrayState0019, (int)(this.longState0036 - this.longState0037), integerArgument4);
              this.longState0036 = this.longState0036 + (long)integerArgument4;
              if ((this.longState0036 - this.longState0037) > (long)this.integerState0539) {
                this.integerState0539 = (int)(-this.longState0037 + this.longState0036);
              }
              return;
            }
            if (~this.longState0036 != ~this.longState0033) {
              this.platformSupport004State0004.performAction0702(this.longState0036, 47);
              this.longState0033 = this.longState0036;
            }
            this.platformSupport004State0004.performAction0704(byteArrayArgument1, 83, integerArgument3, integerArgument4);
            this.longState0033 = this.longState0033 + (long)integerArgument4;
            if (this.longState0033 > this.longState0034) {
              this.longState0034 = this.longState0033;
            }
            longLocal6 = -1L;
            if (this.longState0038 <= this.longState0036 &&
              this.longState0036 < this.longState0038 + (long)this.integerState0538) {
              longLocal6 = this.longState0036;
            } else {
              if (this.longState0038 >= this.longState0036 &&
                this.longState0038 < (long)integerArgument4 + this.longState0036) {
                longLocal6 = this.longState0038;
              }
            }
            longLocal9 = -1L;
            if (this.longState0038 < this.longState0036 + (long)integerArgument4 &&
              (long)this.integerState0538 + this.longState0038 >= (long)integerArgument4 + this.longState0036) {
              longLocal9 = this.longState0036 + (long)integerArgument4;
            } else {
              if ((long)this.integerState0538 + this.longState0038 > this.longState0036 &&
                (this.longState0038 + (long)this.integerState0538) <= ((long)integerArgument4 + this.longState0036)) {
                longLocal9 = this.longState0038 + (long)this.integerState0538;
              }
            }
            if (longLocal6 > -1L &&
              longLocal9 > longLocal6) {
              integerLocal10 = (int)(-longLocal6 + longLocal9);
              MixedSupport008.performAction0082(byteArrayArgument1, (int)(longLocal6 + ((long)integerArgument3 - this.longState0036)), this.byteArrayState0018, (int)(-this.longState0038 + longLocal6), integerLocal10);
            }
            this.longState0036 = this.longState0036 + (long)integerArgument4;
            return;
          } catch (java.io.IOException caughtParameterLocal12) {
            caughtExceptionLocal4 = caughtParameterLocal12;
            iOExceptionLocal7 = (IOException) (Object) caughtExceptionLocal4;
            this.longState0033 = -1L;
            throw iOExceptionLocal7;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal4 = caughtParameterLocal13;
          runtimeExceptionLocal8 = (RuntimeException) (Object) caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal8;
          stackStringBuilderLocal2 = new StringBuilder().append("nh.C(");
          if (byteArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction1265(byte byteArgument1, int integerArgument2) {
        if (byteArgument1 == 12) {
          BufferedSocket.integerState0667 = 3 & integerArgument2 >> 4;
          MixedSupport153.integerState0932 = (13 & integerArgument2) >> 2;
          if (2 < BufferedSocket.integerState0667) {
            BufferedSocket.integerState0667 = 2;
          }
          PacketBuffer.integerState0936 = 3 & integerArgument2;
          if (MixedSupport153.integerState0932 > 2) {
            MixedSupport153.integerState0932 = 2;
          }
          if (PacketBuffer.integerState0936 > 2) {
            PacketBuffer.integerState0936 = 2;
          }
          return;
        }
    }

    MixedSupport091(PlatformSupport004 platformSupport004Argument1, int integerArgument2, int integerArgument3) throws IOException {
        long cachedLongLocal1 = 0L;
        this.longState0038 = -1L;
        this.longState0037 = -1L;
        this.integerState0539 = 0;
        try {
          this.platformSupport004State0004 = platformSupport004Argument1;
          cachedLongLocal1 = platformSupport004Argument1.computeLong0699((byte) -50);
          this.longState0034 = cachedLongLocal1;
          this.longState0035 = cachedLongLocal1;
          this.byteArrayState0018 = new byte[integerArgument2];
          this.longState0036 = 0L;
          this.byteArrayState0019 = new byte[integerArgument3];
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "nh.<init>(" + (platformSupport004Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final void performAction1269(byte[] byteArrayArgument1, byte byteArgument2) throws IOException {
        try {
          this.performAction1267(0, byteArrayArgument1, 741, byteArrayArgument1.length);
          int integerLocal1 = 38 / ((byteArgument2 - 70) / 44);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "nh.D(" + (byteArrayArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    static {
        mixedSupport111State0005 = new MixedSupport111(0, 2, 2, 1);
        stringState0366 = "Show all lobby chat";
        characterArrayState0006 = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
