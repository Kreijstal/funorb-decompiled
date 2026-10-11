/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport003 extends DualNode {
    int[] integerArrayState0004;
    String stringState0008;
    static String[] stringArrayState0001;
    char[] characterArrayState0001;
    static int integerState0017;
    boolean booleanState0002;
    int[] integerArrayState0005;
    static int integerState0018;
    char[] characterArrayState0002;
    static int integerState0019;

    final static void performAction0043(byte byteArgument1) {
        if (byteArgument1 > -68) {
          MixedSupport003.performAction0043((byte) 55);
        }
        MixedSupport074.integerState0396 = 0;
        RenderingSupport002.performAction0267(true);
    }

    final static RgbSprite[] computeRgbSpriteArray0040(int integerArgument1, String stringArgument2, String stringArgument3, ResourceArchive resourceArchiveArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          integerLocal1 = resourceArchiveArgument4.computeInteger0926(-1, stringArgument2);
          integerLocal3 = resourceArchiveArgument4.computeInteger0913(integerLocal1, 13030, stringArgument3);
          if (integerArgument1 != 0) {
            MixedSupport003.performAction0044((byte) 24);
          }
          stackRgbSpriteArrayLocal4 = NodeHashTable.computeRgbSpriteArray1704(integerLocal3, integerLocal1, resourceArchiveArgument4, (byte) -46);
          return stackRgbSpriteArrayLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("ac.C(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    final void performAction0039(byte byteArgument1, PacketBuffer packetBufferArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != -4) {
            this.stringState0008 = (String) null;
          }
          while (true) {
            integerLocal1 = packetBufferArgument2.computeInteger2085((byte) -60);
            if (integerLocal1 == 0) {
              return;
            }
            this.performAction0041(integerLocal1, packetBufferArgument2, -127);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("ac.F(").append(byteArgument1).append(',');
          if (packetBufferArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void performAction0044(byte byteArgument1) {
        if (byteArgument1 != -17) {
          MixedSupport003.performAction0044((byte) -64);
        }
        stringArrayState0001 = null;
    }

    private final void performAction0041(int integerArgument1, PacketBuffer packetBufferArgument2, int integerArgument3) {
        char[] stackCharacterArrayLocal1 = null;
        int stackIntegerLocal2 = 0;
        char stackCharacterLocal3 = 0;
        char[] stackCharacterArrayLocal4 = null;
        int stackIntegerLocal5 = 0;
        char stackCharacterLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 == 1) {
            this.stringState0008 = packetBufferArgument2.computeString2082((byte) -38);
          } else {
            if (integerArgument1 == 2) {
              integerLocal11 = packetBufferArgument2.computeInteger2085((byte) -47);
              this.characterArrayState0001 = new char[integerLocal11];
              this.integerArrayState0004 = new int[integerLocal11];
              for (integerLocal13 = 0; integerLocal13 < integerLocal11; integerLocal13++) {
                this.integerArrayState0004[integerLocal13] = packetBufferArgument2.computeInteger2089(3);
                integerLocal14 = packetBufferArgument2.computeByte2093((byte) -99);
                stackCharacterArrayLocal1 = this.characterArrayState0001;
                stackIntegerLocal2 = integerLocal13;
                if (0 == integerLocal14) {
                  stackCharacterLocal3 = (char)0;
                } else {
                  stackCharacterLocal3 = DiagnosticSupport002.computeCharacter0860((byte) integerLocal14, (byte) 78);
                }
                stackCharacterArrayLocal1[stackIntegerLocal2] = stackCharacterLocal3;
              }
            } else {
              if (3 == integerArgument1) {
                integerLocal11 = packetBufferArgument2.computeInteger2085((byte) -37);
                this.integerArrayState0005 = new int[integerLocal11];
                this.characterArrayState0002 = new char[integerLocal11];
                for (integerLocal13 = 0; integerLocal11 > integerLocal13; integerLocal13++) {
                  this.integerArrayState0005[integerLocal13] = packetBufferArgument2.computeInteger2089(3);
                  integerLocal14 = packetBufferArgument2.computeByte2093((byte) -107);
                  stackCharacterArrayLocal4 = this.characterArrayState0002;
                  stackIntegerLocal5 = integerLocal13;
                  if (integerLocal14 == 0) {
                    stackCharacterLocal6 = (char)0;
                  } else {
                    stackCharacterLocal6 = DiagnosticSupport002.computeCharacter0860((byte) integerLocal14, (byte) 88);
                  }
                  stackCharacterArrayLocal4[stackIntegerLocal5] = stackCharacterLocal6;
                }
              } else {
                if (integerArgument1 == 4) {
                  this.booleanState0002 = true;
                }
              }
            }
          }
          integerLocal16 = 8 % ((2 - integerArgument3) / 44);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal10 = caughtParameterLocal17;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal12;
          stackStringBuilderLocal8 = new StringBuilder().append("ac.B(").append(integerArgument1).append(',');
          if (packetBufferArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final void performAction0042(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal4;
        if (integerArgument1 != -1) {
          return;
        }
        if (this.integerArrayState0005 != null) {
          for (integerLocal2 = 0; integerLocal2 < this.integerArrayState0005.length; integerLocal2++) {
            this.integerArrayState0005[integerLocal2] = UiComponentPart006.computeInteger0388(this.integerArrayState0005[integerLocal2], 32768);
          }
        }
        if (this.integerArrayState0004 != null) {
          integerLocal1 = 0;
          integerLocal4 = integerLocal1;
          while (integerLocal1 < this.integerArrayState0004.length) {
            this.integerArrayState0004[integerLocal1] = UiComponentPart006.computeInteger0388(this.integerArrayState0004[integerLocal1], 32768);
            integerLocal1++;
          }
        }
    }

    MixedSupport003() {
        this.booleanState0002 = false;
    }

    static {
        stringArrayState0001 = new String[]{"Master Challenge: prove your prowess", "Unlock 4 more vibrant and varied themes", "Large bucket: grow shapes to the limit", "Use special items in multiplayer...", "...to turn things around spectacularly!", "Loads of extra Achievements", null, null};
        integerState0017 = 480;
    }
}
