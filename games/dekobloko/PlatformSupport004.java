/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlatformSupport004 {
    static String stringState0228;
    static String stringState0229;
    static String stringState0230;
    static RgbSprite[][] rgbSpriteArrayArrayState0007;
    static String stringState0231;
    private RandomAccessFile randomAccessFileState0001;
    static String stringState0232;
    private long longState0019;
    private long longState0020;

    final int computeInteger0703(byte[] byteArrayArgument1, byte byteArgument2, int integerArgument3, int integerArgument4) throws IOException {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (byteArgument2 > -33) {
            stringState0231 = (String) null;
          }
          integerLocal1 = this.randomAccessFileState0001.read(byteArrayArgument1, integerArgument3, integerArgument4);
          if (0 < integerLocal1) {
            this.longState0020 = this.longState0020 + (long)integerLocal1;
          }
          stackIntegerLocal3 = integerLocal1;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("hf.G(");
          if (byteArrayArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public static void performAction0705(int integerArgument1) {
        stringState0230 = null;
        stringState0231 = null;
        stringState0229 = null;
        if (integerArgument1 != 12741) {
          stringState0230 = (String) null;
        }
        stringState0232 = null;
        stringState0228 = null;
        rgbSpriteArrayArrayState0007 = (RgbSprite[][]) null;
    }

    final void performAction0700(int integerArgument1) throws IOException {
        if (this.randomAccessFileState0001 != null) {
          this.randomAccessFileState0001.close();
          this.randomAccessFileState0001 = null;
        }
        if (integerArgument1 >= -4) {
          CharSequence[] charSequenceArrayLocal1 = (CharSequence[]) null;
          PlatformSupport004.computeString0701(-21, 99, (CharSequence[]) null, (byte) 32);
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.randomAccessFileState0001) {
          System.out.println("");
          this.performAction0700(-86);
        }
    }

    final void performAction0702(long longArgument1, int integerArgument2) throws IOException {
        this.randomAccessFileState0001.seek(longArgument1);
        this.longState0020 = longArgument1;
        if (integerArgument2 < 3) {
          CharSequence[] charSequenceArrayLocal1 = (CharSequence[]) null;
          PlatformSupport004.computeString0701(69, 18, (CharSequence[]) null, (byte) 126);
        }
    }

    final static String computeString0701(int integerArgument1, int integerArgument2, CharSequence[] charSequenceArrayArgument3, byte byteArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        CharSequence charSequenceLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        StringBuilder stringBuilderLocal16 = null;
        CharSequence charSequenceLocal17 = null;
        CharSequence charSequenceLocal18 = null;
        int integerLocal19 = 0;
        CharSequence[] charSequenceArrayLocal20 = null;
        CharSequence charSequenceLocal21 = null;
        integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 == 0) {
            stackStringLocal5 = "";
            return stackStringLocal5;
          }
          if (integerArgument1 == 1) {
            charSequenceLocal21 = charSequenceArrayArgument3[integerArgument2];
            charSequenceLocal13 = charSequenceLocal21;
            if (charSequenceLocal13 != null) {
              return charSequenceLocal21.toString();
            }
            stackStringLocal6 = "null";
            return stackStringLocal6;
          }
          integerLocal12 = integerArgument1 + integerArgument2;
          integerLocal15 = 0;
          for (integerLocal1 = integerArgument2; integerLocal1 < integerLocal12; integerLocal1++) {
            charSequenceLocal17 = charSequenceArrayArgument3[integerLocal1];
            if (charSequenceLocal17 == null) {
              integerLocal15 += 4;
            } else {
              integerLocal15 = integerLocal15 + charSequenceLocal17.length();
            }
          }
          stringBuilderLocal16 = new StringBuilder(integerLocal15);
          if (byteArgument4 != 74) {
            charSequenceArrayLocal20 = (CharSequence[]) null;
            PlatformSupport004.computeString0701(-7, 123, (CharSequence[]) null, (byte) 21);
          }
          for (integerLocal2 = integerArgument2; integerLocal2 < integerLocal12; integerLocal2++) {
            charSequenceLocal18 = charSequenceArrayArgument3[integerLocal2];
            if (charSequenceLocal18 == null) {
              discarded$0 = stringBuilderLocal16.append("null");
            } else {
              discarded$1 = stringBuilderLocal16.append(charSequenceLocal18);
            }
          }
          stackStringLocal7 = stringBuilderLocal16.toString();
          return stackStringLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal11 = caughtParameterLocal22;
          runtimeExceptionLocal14 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal14;
          stackStringBuilderLocal9 = new StringBuilder().append("hf.D(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (charSequenceArrayArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final long computeLong0699(byte byteArgument1) throws IOException {
        if (byteArgument1 != -50) {
          return -2L;
        }
        return this.randomAccessFileState0001.length();
    }

    final void performAction0704(byte[] byteArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4) throws IOException {
        try {
          if (((long)integerArgument4 + this.longState0020) > this.longState0019) {
            this.randomAccessFileState0001.seek(this.longState0019);
            this.randomAccessFileState0001.write(1);
            throw new EOFException();
          }
          int integerLocal1 = 96 % ((integerArgument2 + 35) / 49);
          this.randomAccessFileState0001.write(byteArrayArgument1, integerArgument3, integerArgument4);
          this.longState0020 = this.longState0020 + (long)integerArgument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hf.B(" + (byteArrayArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    PlatformSupport004(File fileArgument1, String stringArgument2, long longArgument3) throws IOException {
        int integerLocal1 = 0;
        try {
          if (-1L == longArgument3) {
            longArgument3 = 9223372036854775807L;
          }
          if (longArgument3 < fileArgument1.length()) {
            fileArgument1.delete();
          }
          this.randomAccessFileState0001 = new RandomAccessFile(fileArgument1, stringArgument2);
          this.longState0020 = 0L;
          this.longState0019 = longArgument3;
          integerLocal1 = this.randomAccessFileState0001.read();
          if (integerLocal1 != -1 &&
            !stringArgument2.equals("r")) {
            this.randomAccessFileState0001.seek(0L);
            this.randomAccessFileState0001.write(integerLocal1);
          }
          this.randomAccessFileState0001.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hf.<init>(" + (fileArgument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + longArgument3 + ')');
        }
    }

    static {
        stringState0228 = "Visit the Account Management section on the main site to view.";
        stringState0232 = "<%0>'s game";
        stringState0231 = "Report abuse";
        rgbSpriteArrayArrayState0007 = new RgbSprite[8][];
        stringState0230 = "No players";
        stringState0229 = "<%0> has joined your game.";
    }
}
