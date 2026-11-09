/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanDecoder {
    private int[] decodeTrie;
    static IntrusiveDeque field_f;
    static String loadingFontsText;
    static String emailText;
    static int field_e;
    static byte[][] field_d;

    final int decode(int destinationOffset, int sourceOffset, byte[] destination, int guard, int outputLength, byte[] source) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 == outputLength) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          outputLength = outputLength + destinationOffset;
          var7_int = 0;
          var9 = -35 / ((52 - guard) / 59);
          var8 = sourceOffset;
          scanLoop1: while (true) {
            var10 = source[var8];
            if (var10 < 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.decodeTrie[var7_int];
            var11 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$1] = (byte)(~var11);
              if (outputLength <= destinationOffset) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((64 & var10) == 0) {
              var7_int++;
            } else {
              var7_int = this.decodeTrie[var7_int];
            }
            dupTemp$2 = this.decodeTrie[var7_int];
            var11Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$3] = (byte)(~var11Lifetime1);
              if (destinationOffset >= outputLength) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var10 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.decodeTrie[var7_int];
            }
            dupTemp$4 = this.decodeTrie[var7_int];
            var11Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$5] = (byte)(~var11Lifetime2);
              if (destinationOffset >= outputLength) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((16 & var10) != 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.decodeTrie[var7_int];
            var11Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$7] = (byte)(~var11Lifetime3);
              if (destinationOffset >= outputLength) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((8 & var10) != 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.decodeTrie[var7_int];
            var11Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$9] = (byte)(~var11Lifetime4);
              if (destinationOffset >= outputLength) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var10 & 4) != 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.decodeTrie[var7_int];
            var11Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$11] = (byte)(~var11Lifetime5);
              if (outputLength <= destinationOffset) {
                return -sourceOffset + var8 + 1;
              }
              var7_int = 0;
            }
            if ((2 & var10) != 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.decodeTrie[var7_int];
            var11Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$13] = (byte)(~var11Lifetime6);
              if (outputLength <= destinationOffset) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((1 & var10) != 0) {
              var7_int = this.decodeTrie[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.decodeTrie[var7_int];
            var11Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$15] = (byte)(~var11Lifetime7);
              if (destinationOffset >= outputLength) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_64_0 = -sourceOffset + var8 + 1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ow.C(").append(destinationOffset).append(',').append(sourceOffset).append(',');
          if (destination == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(guard).append(',').append(outputLength).append(',');
          if (source == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private HuffmanDecoder() throws Throwable {
        throw new Error();
    }

    final static void initializeNativeLibraryPaths(int guard, ResourceArchive archive, PlatformTaskDispatcher dispatcher) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          GraphicsToolkit.field_e = archive;
          OpenGlUnderwaterEffect.field_n = "";
          if (guard != -18527) {
            HuffmanDecoder.releaseStatics((byte) 19);
          }
          qn.field_e = dispatcher;
          if (!FixedPointPerlinNoise3D.field_h.startsWith("win")) {
            if (FixedPointPerlinNoise3D.field_h.startsWith("linux")) {
              OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "linux/";
            } else {
              if (FixedPointPerlinNoise3D.field_h.startsWith("mac")) {
                OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "macos/";
              }
            }
          } else {
            OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "windows/";
          }
          if (qn.field_e.field_t) {
            OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "msjava/";
            return;
          }
          if (!FixedPointPerlinNoise3D.field_d.startsWith("amd64") &&
            !FixedPointPerlinNoise3D.field_d.startsWith("x86_64")) {
            if (!FixedPointPerlinNoise3D.field_d.startsWith("i386") &&
              !FixedPointPerlinNoise3D.field_d.startsWith("i486") &&
              !FixedPointPerlinNoise3D.field_d.startsWith("i586") &&
              !FixedPointPerlinNoise3D.field_d.startsWith("x86")) {
              if (FixedPointPerlinNoise3D.field_d.startsWith("ppc")) {
                OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "ppc/";
                return;
              }
              OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "universal/";
              return;
            }
            OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "x86/";
            return;
          }
          OpenGlUnderwaterEffect.field_n = OpenGlUnderwaterEffect.field_n + "x86_64/";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("ow.B(").append(guard).append(',');
          if (archive == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (dispatcher == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 == 123) {
          loadingFontsText = null;
          field_d = (byte[][]) null;
          field_f = null;
          emailText = null;
          return;
        }
        field_f = (IntrusiveDeque) null;
        loadingFontsText = null;
        field_d = (byte[][]) null;
        field_f = null;
        emailText = null;
    }

    static {
        loadingFontsText = "Loading fonts";
        field_f = new IntrusiveDeque();
        emailText = "Email: ";
        field_d = new byte[250][];
    }
}
