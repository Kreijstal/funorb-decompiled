/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanCodec {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] symbolCodes;
    static int packetDelayMillis;
    private byte[] symbolCodeLengths;
    static RgbSprite[] field_i;
    static IndexedSprite[] field_e;
    private int[] decodeTrie;

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 76 % ((param0 - 52) / 39);
        var3 = param1;
        var4 = param1;
        if (1 == var4) {
          var3Lifetime1 = 2;
        } else {
          if (var4 != 2) {
            if (var4 != 3) {
              var3Lifetime1 = (var4 == 4) ? 3 : param1;
            } else {
              var3Lifetime1 = 4;
            }
          } else {
            var3Lifetime1 = 1;
          }
        }
        return var3Lifetime1;
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -1) {
          field_d = (String) null;
        }
        field_i = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        try {
          if (param3) {
            no.field_P.pixelWidth = SoftwareRaster.width;
            no.field_P.pixels = SoftwareRaster.pixels;
            no.field_P.pixelHeight = SoftwareRaster.height;
            ku.field_J.b();
            SoftwareRaster.b();
            gq.b(SectorCacheStore.field_j[3][0], 0, 0, param1);
            fe.c(DeployRequest.a(param2, (byte) 42), uh.field_e[3][0] >> 1, 20 + (uh.field_e[3][1] >> 1), 2, true);
            no.field_P.b();
            ku.field_J.h(param0, param5);
          } else {
            gq.b(SectorCacheStore.field_j[3][0], param0, param5, param1);
            fe.c(DeployRequest.a(param2, (byte) 42), (uh.field_e[3][0] >> 1) + param0, 20 + (uh.field_e[3][1] >> 1) + param5, 2, true);
          }
          int var6_int = 67 % ((param4 - 48) / 53);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dq.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 7) {
            stackIn_4_0 = ob.a(10, true, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -59;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int compress(int inputOffset, byte[] input, int inputLength, byte[] output, int outputOffset, byte obfuscationGuard) {
        int dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int outputWord = 0;
        RuntimeException var7 = null;
        int outputBitPosition = 0;
        int symbol = 0;
        int symbolCode = 0;
        int codeLength = 0;
        int outputByteIndex = 0;
        int bitShift = 0;
        int lastOutputByte = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          outputWord = 0;
          outputBitPosition = outputOffset << 3;
          inputLength = inputLength + inputOffset;
          if (obfuscationGuard < 24) {
            stackIn_3_0 = -2;
            return stackIn_3_0;
          }
          while (true) {
            if (inputOffset >= inputLength) {
              stackIn_20_0 = (outputBitPosition + 7 >> 3) - outputOffset;
              return stackIn_20_0;
            }
            symbol = input[inputOffset] & 255;
            symbolCode = this.symbolCodes[symbol];
            codeLength = this.symbolCodeLengths[symbol];
            if (0 == codeLength) {
              throw new RuntimeException("" + symbol);
            }
            outputByteIndex = outputBitPosition >> 3;
            bitShift = outputBitPosition & 7;
            outputWord = outputWord & -bitShift >> 31;
            lastOutputByte = outputByteIndex + (codeLength + (bitShift - 1) >> 3);
            outputBitPosition = outputBitPosition + codeLength;
            bitShift += 24;
            dupTemp$0 = oe.bitwiseOr(outputWord, symbolCode >>> bitShift);
            outputWord = dupTemp$0;
            output[outputByteIndex] = (byte)dupTemp$0;
            if (outputByteIndex < lastOutputByte) {
              bitShift -= 8;
              outputByteIndex++;
              outputWord = symbolCode >>> bitShift;
              output[outputByteIndex] = (byte)(symbolCode >>> bitShift);
              if (outputByteIndex < lastOutputByte) {
                bitShift -= 8;
                outputByteIndex++;
                outputWord = symbolCode >>> bitShift;
                output[outputByteIndex] = (byte)(symbolCode >>> bitShift);
                if (lastOutputByte > outputByteIndex) {
                  bitShift -= 8;
                  outputByteIndex++;
                  outputWord = symbolCode >>> bitShift;
                  output[outputByteIndex] = (byte)(symbolCode >>> bitShift);
                  if (outputByteIndex < lastOutputByte) {
                    bitShift -= 8;
                    outputByteIndex++;
                    outputWord = symbolCode << -bitShift;
                    output[outputByteIndex] = (byte)(symbolCode << -bitShift);
                  }
                }
              }
            }
            inputOffset++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("dq.C(").append(inputOffset).append(',');
          if (input == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(inputLength).append(',');
          if (output == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(outputOffset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    HuffmanCodec(byte[] codeLengths) {
        int symbol = 0;
        int copyIndex = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int symbolCount = 0;
        RuntimeException var2 = null;
        int[] codeFrontier = null;
        int nextTrieSlot = 0;
        int codeLength = 0;
        int codeStep = 0;
        int symbolCode = 0;
        int nextCode = 0;
        int shorterLength = 0;
        int shorterCode = 0;
        int shorterStep = 0;
        int[] expandedTrie = null;
        int[] frontierAlias = null;
        int[] frontier = null;
        int longerLength;
        int trieSlot;
        int codeBit;
        int codeMask;
        try {
          symbolCount = codeLengths.length;
          this.symbolCodeLengths = codeLengths;
          this.symbolCodes = new int[symbolCount];
          frontier = new int[33];
          frontierAlias = frontier;
          codeFrontier = frontierAlias;
          this.decodeTrie = new int[8];
          nextTrieSlot = 0;
          for (symbol = 0; symbol < symbolCount; symbol++) {
            codeLength = codeLengths[symbol];
            if (codeLength != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              codeStep = 1 << -codeLength + 32;
              symbolCode = frontier[codeLength];
              this.symbolCodes[symbol] = symbolCode;
              if ((symbolCode & codeStep) == 0) {
                nextCode = symbolCode | codeStep;
                shorterLength = codeLength - 1;
                while (shorterLength >= 1) {
                  shorterCode = frontier[shorterLength];
                  if (~symbolCode != ~shorterCode) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  shorterStep = 1 << -shorterLength + 32;
                  if ((shorterCode & shorterStep) != 0) {
                    codeFrontier[shorterLength] = codeFrontier[-1 + shorterLength];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  codeFrontier[shorterLength] = oe.bitwiseOr(shorterCode, shorterStep);
                  shorterLength--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                nextCode = codeFrontier[codeLength - 1];
              }
              frontier[codeLength] = nextCode;
              for (longerLength = 1 + codeLength; longerLength <= 32; longerLength++) {
                if (~symbolCode == ~frontier[longerLength]) {
                  frontier[longerLength] = nextCode;
                }
              }
              trieSlot = 0;
              for (codeBit = 0; codeBit < codeLength; codeBit++) {
                codeMask = -2147483648 >>> codeBit;
                if ((symbolCode & codeMask) != 0) {
                  if (0 == this.decodeTrie[trieSlot]) {
                    this.decodeTrie[trieSlot] = nextTrieSlot;
                  }
                  trieSlot = this.decodeTrie[trieSlot];
                } else {
                  trieSlot++;
                }
                if (trieSlot >= this.decodeTrie.length) {
                  expandedTrie = new int[this.decodeTrie.length * 2];
                  for (copyIndex = 0; copyIndex < this.decodeTrie.length; copyIndex++) {
                    expandedTrie[copyIndex] = this.decodeTrie[copyIndex];
                  }
                  this.decodeTrie = expandedTrie;
                }
                codeMask = codeMask >>> 1;
              }
              if (nextTrieSlot <= trieSlot) {
                nextTrieSlot = 1 + trieSlot;
              }
              this.decodeTrie[trieSlot] = ~symbol;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("dq.<init>(");
          if (codeLengths == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int decompress(byte[] input, int inputOffset, boolean obfuscationGuard, int outputLength, int outputOffset, byte[] output) {
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
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int trieSlot = 0;
        RuntimeException var7 = null;
        int inputIndex = 0;
        int inputByte = 0;
        int decodedLeaf = 0;
        int obfuscationControl = 0;
        int leafBit6;
        int leafBit5;
        int leafBit4;
        int leafBit3;
        int leafBit2;
        int leafBit1;
        int leafBit0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (outputLength == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (obfuscationGuard) {
            this.symbolCodeLengths = (byte[]) null;
          }
          outputLength = outputLength + outputOffset;
          trieSlot = 0;
          inputIndex = inputOffset;
          scanLoop1: while (true) {
            inputByte = input[inputIndex];
            if (0 > inputByte) {
              trieSlot = this.decodeTrie[trieSlot];
            } else {
              trieSlot++;
            }
            dupTemp$0 = this.decodeTrie[trieSlot];
            decodedLeaf = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = outputOffset;
              outputOffset++;
              output[incrementValue$1] = (byte)(~decodedLeaf);
              if (outputLength <= outputOffset) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if ((inputByte & 64) != 0) {
              trieSlot = this.decodeTrie[trieSlot];
            } else {
              trieSlot++;
            }
            dupTemp$2 = this.decodeTrie[trieSlot];
            leafBit6 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = outputOffset;
              outputOffset++;
              output[incrementValue$3] = (byte)(~leafBit6);
              if (outputOffset >= outputLength) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if ((32 & inputByte) == 0) {
              trieSlot++;
            } else {
              trieSlot = this.decodeTrie[trieSlot];
            }
            dupTemp$4 = this.decodeTrie[trieSlot];
            leafBit5 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = outputOffset;
              outputOffset++;
              output[incrementValue$5] = (byte)(~leafBit5);
              if (outputLength <= outputOffset) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if ((inputByte & 16) == 0) {
              trieSlot++;
            } else {
              trieSlot = this.decodeTrie[trieSlot];
            }
            dupTemp$6 = this.decodeTrie[trieSlot];
            leafBit4 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = outputOffset;
              outputOffset++;
              output[incrementValue$7] = (byte)(~leafBit4);
              if (outputLength <= outputOffset) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if ((8 & inputByte) != 0) {
              trieSlot = this.decodeTrie[trieSlot];
            } else {
              trieSlot++;
            }
            dupTemp$8 = this.decodeTrie[trieSlot];
            leafBit3 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = outputOffset;
              outputOffset++;
              output[incrementValue$9] = (byte)(~leafBit3);
              if (outputOffset >= outputLength) {
                return 1 + (inputIndex - inputOffset);
              }
              trieSlot = 0;
            }
            if ((inputByte & 4) == 0) {
              trieSlot++;
            } else {
              trieSlot = this.decodeTrie[trieSlot];
            }
            dupTemp$10 = this.decodeTrie[trieSlot];
            leafBit2 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = outputOffset;
              outputOffset++;
              output[incrementValue$11] = (byte)(~leafBit2);
              if (outputOffset >= outputLength) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if ((2 & inputByte) != 0) {
              trieSlot = this.decodeTrie[trieSlot];
            } else {
              trieSlot++;
            }
            dupTemp$12 = this.decodeTrie[trieSlot];
            leafBit1 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = outputOffset;
              outputOffset++;
              output[incrementValue$13] = (byte)(~leafBit1);
              if (outputOffset >= outputLength) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            if (0 == (inputByte & 1)) {
              trieSlot++;
            } else {
              trieSlot = this.decodeTrie[trieSlot];
            }
            dupTemp$14 = this.decodeTrie[trieSlot];
            leafBit0 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = outputOffset;
              outputOffset++;
              output[incrementValue$15] = (byte)(~leafBit0);
              if (outputOffset >= outputLength) {
                break scanLoop1;
              }
              trieSlot = 0;
            }
            inputIndex++;
            continue;

          }
          stackIn_66_0 = 1 + (inputIndex - inputOffset);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("dq.F(");
          if (input == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(inputOffset).append(',').append(obfuscationGuard).append(',').append(outputLength).append(',').append(outputOffset).append(',');
          if (output == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
        packetDelayMillis = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}
