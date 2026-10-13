/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanCodec {
    private byte[] codeLengths;
    static String[] field_h;
    private int[] decodeTrie;
    static NodeDeque field_f;
    static int field_g;
    static double field_b;
    static String field_c;
    private int[] codewords;
    static RgbSprite field_e;
    static String field_d;

    final static boolean a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.ensureIndex((byte) -127)) {
            return false;
          }
          if (!param1.ensureGroupAvailableByName("commonui", -28138)) {
            return false;
          }
          if (param3 > -63) {
            return true;
          }
          if (param0.ensureIndex((byte) -127) &&
            param0.ensureGroupAvailableByName("commonui", -28138)) {
            if (param2.ensureIndex((byte) -127) &&
              param2.ensureGroupAvailableByName("button.gif", -28138)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("fk.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = MatchResultScreen.field_t;
        if (param1 != 77) {
          return;
        }
        if (var3 >= 5) {
          if (105 > var3) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (120 > var3) {
              var3 = 120 - var3;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            }
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (4 == param0) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 7 ||
          param0 == 8) {
          var4 = -1;
          var5 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (13 == param0) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var4 = 1;
          var5 = 1;
        }
        MatchResultScreen.field_w = AchievementSubmission.createPitchYawPose(var4 * var2, 0, var2 * var5);
        return;
    }

    final static void a(int param0, QuickChatMenu param1) {
        if (param1 == null) {
          return;
        }
        try {
          hd.quickChatMenu = param1;
          if (param0 != 105) {
            String var3 = (String) null;
            HuffmanCodec.a((byte) 84, (java.applet.Applet) null, (String) null, false);
          }
          QuickChatPhraseDefinition.quickChatMenuRoot.children.clear((byte) -72);
          QuickChatPhraseDefinition.quickChatMenuRoot.addChild(hd.quickChatMenu, 0);
          TooltipSprite.field_p = true;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int compress(byte obfuscationGuard, int length, int inputOffset, byte[] output, int outputOffset, byte[] input) {
        int dupTemp$0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int pendingByte = 0;
        RuntimeException var7 = null;
        int bitPosition = 0;
        int symbol = 0;
        int codeword = 0;
        int codeLength = 0;
        int outputByteIndex = 0;
        int codeShift = 0;
        int lastOutputByte = 0;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          pendingByte = 0;
          length = length + inputOffset;
          bitPosition = outputOffset << 3;
          while (true) {
            if (inputOffset >= length) {
              if (obfuscationGuard >= -91) {
                HuffmanCodec.a(-104, (byte) 88);
              }
              stackIn_22_0 = (7 + bitPosition >> 3) - outputOffset;
              return stackIn_22_0;
            }
            symbol = input[inputOffset] & 255;
            codeword = this.codewords[symbol];
            codeLength = this.codeLengths[symbol];
            if (codeLength == 0) {
              throw new RuntimeException("" + symbol);
            }
            outputByteIndex = bitPosition >> 3;
            codeShift = bitPosition & 7;
            pendingByte = pendingByte & -codeShift >> 31;
            lastOutputByte = outputByteIndex + (codeShift + (codeLength - 1) >> 3);
            bitPosition = bitPosition + codeLength;
            codeShift += 24;
            dupTemp$0 = LevelSelectScreen.d(pendingByte, codeword >>> codeShift);
            pendingByte = dupTemp$0;
            output[outputByteIndex] = (byte)dupTemp$0;
            if (lastOutputByte > outputByteIndex) {
              outputByteIndex++;
              codeShift -= 8;
              pendingByte = codeword >>> codeShift;
              output[outputByteIndex] = (byte)(codeword >>> codeShift);
              if (lastOutputByte > outputByteIndex) {
                codeShift -= 8;
                outputByteIndex++;
                pendingByte = codeword >>> codeShift;
                output[outputByteIndex] = (byte)(codeword >>> codeShift);
                if (outputByteIndex < lastOutputByte) {
                  outputByteIndex++;
                  codeShift -= 8;
                  pendingByte = codeword >>> codeShift;
                  output[outputByteIndex] = (byte)(codeword >>> codeShift);
                  if (outputByteIndex < lastOutputByte) {
                    outputByteIndex++;
                    codeShift -= 8;
                    pendingByte = codeword << -codeShift;
                    output[outputByteIndex] = (byte)(codeword << -codeShift);
                  }
                }
              }
            }
            inputOffset++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("fk.F(").append(obfuscationGuard).append(',').append(length).append(',').append(inputOffset).append(',');
          if (output == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(outputOffset).append(',');
          if (input == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ResourceArchive var4 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != 14114) {
            var4 = (ResourceArchive) null;
            HuffmanCodec.a((ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, -121);
          }
          var1 = k.outgoingPackets;
          while (ik.a(104)) {
            var1.writeCipheredOpcode(-13413, 8);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            HighscoresScreen.a(var1, (byte) 9);
            k.outgoingPackets.backfillByteLength((byte) 118, -var2 + var1.position);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "fk.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -94) {
          HuffmanCodec.a(119, (byte) 34);
        }
        field_d = null;
    }

    final int decompress(int length, int outputOffset, int inputOffset, boolean obfuscationGuard, byte[] output, byte[] input) {
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
        int stackIn_4_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int trieIndex = 0;
        RuntimeException var7 = null;
        int inputByteIndex = 0;
        int inputByte = 0;
        int leaf = 0;
        int clientBranchFlag = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 == length) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!obfuscationGuard) {
            HuffmanCodec.a((byte) 104);
          }
          length = length + outputOffset;
          trieIndex = 0;
          inputByteIndex = inputOffset;
          scanLoop1: while (true) {
            inputByte = input[inputByteIndex];
            if (inputByte >= 0) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$0 = this.decodeTrie[trieIndex];
            leaf = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = outputOffset;
              outputOffset++;
              output[incrementValue$1] = (byte)(~leaf);
              if (outputOffset >= length) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if (0 != (64 & inputByte)) {
              trieIndex = this.decodeTrie[trieIndex];
            } else {
              trieIndex++;
            }
            dupTemp$2 = this.decodeTrie[trieIndex];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = outputOffset;
              outputOffset++;
              output[incrementValue$3] = (byte)(~var10Lifetime1);
              if (outputOffset >= length) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if ((32 & inputByte) == 0) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$4 = this.decodeTrie[trieIndex];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = outputOffset;
              outputOffset++;
              output[incrementValue$5] = (byte)(~var10Lifetime2);
              if (length <= outputOffset) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if ((16 & inputByte) == 0) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$6 = this.decodeTrie[trieIndex];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = outputOffset;
              outputOffset++;
              output[incrementValue$7] = (byte)(~var10Lifetime3);
              if (length <= outputOffset) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if (0 == (inputByte & 8)) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$8 = this.decodeTrie[trieIndex];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = outputOffset;
              outputOffset++;
              output[incrementValue$9] = (byte)(~var10Lifetime4);
              if (outputOffset >= length) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if ((inputByte & 4) != 0) {
              trieIndex = this.decodeTrie[trieIndex];
            } else {
              trieIndex++;
            }
            dupTemp$10 = this.decodeTrie[trieIndex];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = outputOffset;
              outputOffset++;
              output[incrementValue$11] = (byte)(~var10Lifetime5);
              if (outputOffset >= length) {
                return -inputOffset + (1 + inputByteIndex);
              }
              trieIndex = 0;
            }
            if ((2 & inputByte) == 0) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$12 = this.decodeTrie[trieIndex];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = outputOffset;
              outputOffset++;
              output[incrementValue$13] = (byte)(~var10Lifetime6);
              if (outputOffset >= length) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            if (0 == (inputByte & 1)) {
              trieIndex++;
            } else {
              trieIndex = this.decodeTrie[trieIndex];
            }
            dupTemp$14 = this.decodeTrie[trieIndex];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = outputOffset;
              outputOffset++;
              output[incrementValue$15] = (byte)(~var10Lifetime7);
              if (outputOffset >= length) {
                break scanLoop1;
              }
              trieIndex = 0;
            }
            inputByteIndex++;
            continue;

          }
          stackIn_70_0 = -inputOffset + (1 + inputByteIndex);
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("fk.A(").append(length).append(',').append(outputOffset).append(',').append(inputOffset).append(',').append(obfuscationGuard).append(',');
          if (output == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (input == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
          int var4_int = 0;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          java.net.MalformedURLException var5 = null;
          try {
            var4_int = 60 / ((1 - param0) / 62);
            if (PlatformServices.osNameLowercase.startsWith("win") &&
              MidiSynthesizer.a(param2, false)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              AlignedIconLabel.a("MGR1: " + param2, (Throwable) null, 77);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4;
            stackIn_10_1 = new StringBuilder().append("fk.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    HuffmanCodec(byte[] codeLengths) {
        int symbol = 0;
        int copyIndex = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int symbolCount = 0;
        RuntimeException var2 = null;
        int[] nextCodeByLength = null;
        int nextTrieSlot = 0;
        int codeLength = 0;
        int carryMask = 0;
        int codeword = 0;
        int nextCodeword = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] expandedTrie = null;
        int[] nextCodesAlias = null;
        int[] nextCodes = null;
        int longerLength;
        int trieIndex;
        int bitIndex;
        int bitMask;
        try {
          symbolCount = codeLengths.length;
          this.codeLengths = codeLengths;
          this.codewords = new int[symbolCount];
          nextCodes = new int[33];
          nextCodesAlias = nextCodes;
          nextCodeByLength = nextCodesAlias;
          this.decodeTrie = new int[8];
          nextTrieSlot = 0;
          for (symbol = 0; symbol < symbolCount; symbol++) {
            codeLength = codeLengths[symbol];
            if (codeLength != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              carryMask = 1 << -codeLength + 32;
              codeword = nextCodes[codeLength];
              this.codewords[symbol] = codeword;
              if ((codeword & carryMask) == 0) {
                nextCodeword = carryMask | codeword;
                var10 = codeLength - 1;
                while (var10 >= 1) {
                  var11 = nextCodes[var10];
                  if (~codeword != ~var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var12 & var11) != 0) {
                    nextCodeByLength[var10] = nextCodeByLength[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  nextCodeByLength[var10] = LevelSelectScreen.d(var12, var11);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                nextCodeword = nextCodeByLength[codeLength - 1];
              }
              nextCodes[codeLength] = nextCodeword;
              for (longerLength = codeLength + 1; longerLength <= 32; longerLength++) {
                if (codeword == nextCodes[longerLength]) {
                  nextCodes[longerLength] = nextCodeword;
                }
              }
              trieIndex = 0;
              for (bitIndex = 0; codeLength > bitIndex; bitIndex++) {
                bitMask = -2147483648 >>> bitIndex;
                if ((codeword & bitMask) == 0) {
                  trieIndex++;
                } else {
                  if (this.decodeTrie[trieIndex] == 0) {
                    this.decodeTrie[trieIndex] = nextTrieSlot;
                  }
                  trieIndex = this.decodeTrie[trieIndex];
                }
                if (this.decodeTrie.length <= trieIndex) {
                  expandedTrie = new int[this.decodeTrie.length * 2];
                  for (copyIndex = 0; this.decodeTrie.length > copyIndex; copyIndex++) {
                    expandedTrie[copyIndex] = this.decodeTrie[copyIndex];
                  }
                  this.decodeTrie = expandedTrie;
                }
                bitMask = bitMask >>> 1;
              }
              this.decodeTrie[trieIndex] = ~symbol;
              if (trieIndex >= nextTrieSlot) {
                nextTrieSlot = 1 + trieIndex;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("fk.<init>(");
          if (codeLengths == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_f = new NodeDeque();
        field_c = "Passwords can only contain letters and numbers";
        field_b = 0.0;
        field_d = "Age:";
    }
}
