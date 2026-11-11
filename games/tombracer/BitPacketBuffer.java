/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    static String[][] field_l;
    private int bitPosition;
    private IsaacCipher opcodeCipher;
    static String field_p;
    static String field_j;
    static String field_m;
    private int bitsLeftInByte;
    static String field_o;

    BitPacketBuffer(byte[] param0) {
        super(param0);
    }

    final int readCipheredOpcode(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= -25) {
          this.bitPosition = 127;
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return 255 & this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(104);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$1] - this.opcodeCipher.nextInt(104);
    }

    final void writeBits(byte param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var4 = 9 / ((-85 - param0) / 40);
        param1 = param1 & fca.field_b[param2];
        while (this.bitsLeftInByte < param2) {
          param2 = param2 - this.bitsLeftInByte;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(this.payload[fieldTemp$1] + (param1 >>> param2));
          this.payload[this.position] = (byte) 0;
          this.bitsLeftInByte = 8;
        }
        if (this.bitsLeftInByte != param2) {
          this.bitsLeftInByte = this.bitsLeftInByte - param2;
          this.payload[this.position] = (byte)(this.payload[this.position] + (param1 << this.bitsLeftInByte));
          return;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.payload[fieldTemp$0] + param1);
        this.payload[this.position] = (byte) 0;
        this.bitsLeftInByte = 8;
        return;
    }

    BitPacketBuffer(int param0) {
        super(param0);
    }

    final void beginBitAccess(byte param0) {
        this.bitPosition = this.position * 8;
        int var2 = -117 % ((61 - param0) / 49);
    }

    final void beginBitWrite(int param0) {
        this.payload[this.position] = (byte) 0;
        this.bitsLeftInByte = param0;
    }

    final void initializeCipher(int param0, int[] param1) {
        try {
          this.opcodeCipher = new IsaacCipher(param1);
          if (param0 != -26185) {
            this.readBits((byte) -116, 2);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "kh.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int readBits(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (this.bitPosition & 7);
        int var5 = 0;
        this.bitPosition = this.bitPosition + param1;
        if (param0 == 44) {
          while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((fca.field_b[var4] & this.payload[incrementValue$0]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
          }
          if (var4 == param1) {
            var5 = var5 + (fca.field_b[var4] & this.payload[var3]);
          } else {
            var5 = var5 + (this.payload[var3] >> -param1 + var4 & fca.field_b[param1]);
          }
          return var5;
        }
        field_m = (String) null;
        while (var4 < param1) {
          incrementValue$1 = var3;
          var3++;
          var5 = var5 + ((fca.field_b[var4] & this.payload[incrementValue$1]) << -var4 + param1);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (var4 == param1) {
          var5 = var5 + (fca.field_b[var4] & this.payload[var3]);
        } else {
          var5 = var5 + (this.payload[var3] >> -param1 + var4 & fca.field_b[param1]);
        }
        return var5;
    }

    final void endBitAccess(byte param0) {
        this.position = (this.bitPosition + 7) / 8;
        if (param0 == 98) {
          return;
        }
        this.writeCipheredOpcode(-21, -101);
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int var3;
        int var3Lifetime1;
        param0 = param0 & 15;
        if (param1 == 4) {
          var3 = this.bitsLeftInByte;
          if (var3 == 4) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = (byte)(this.payload[fieldTemp$0] + param0);
            this.payload[this.position] = (byte) 0;
            this.bitsLeftInByte = 8;
            return;
          }
          if (var3 == 3) {
            fieldTemp$1 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$1] = (byte)(this.payload[fieldTemp$1] + (param0 >>> 1));
            this.payload[this.position] = (byte)(param0 << 7);
            this.bitsLeftInByte = 7;
            return;
          }
          if (var3 == 2) {
            fieldTemp$4 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$4] = (byte)(this.payload[fieldTemp$4] + (param0 >>> 2));
            this.payload[this.position] = (byte)(param0 << 6);
            this.bitsLeftInByte = 6;
            return;
          }
          if (var3 == 1) {
            fieldTemp$2 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$2] = (byte)(this.payload[fieldTemp$2] + (param0 >>> 3));
            this.payload[this.position] = (byte)(param0 << 5);
            this.bitsLeftInByte = 5;
            return;
          }
          if (var3 != 0) {
            this.bitsLeftInByte = this.bitsLeftInByte - 4;
            this.payload[this.position] = (byte)(this.payload[this.position] + (param0 << this.bitsLeftInByte));
            return;
          }
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)(param0 << 4);
          this.bitsLeftInByte = 4;
          return;
        }
        field_p = (String) null;
        var3Lifetime1 = this.bitsLeftInByte;
        if (var3Lifetime1 == 4) {
          fieldTemp$5 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$5] = (byte)(this.payload[fieldTemp$5] + param0);
          this.payload[this.position] = (byte) 0;
          this.bitsLeftInByte = 8;
          return;
        }
        if (var3Lifetime1 == 3) {
          fieldTemp$6 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$6] = (byte)(this.payload[fieldTemp$6] + (param0 >>> 1));
          this.payload[this.position] = (byte)(param0 << 7);
          this.bitsLeftInByte = 7;
          return;
        }
        if (var3Lifetime1 == 2) {
          fieldTemp$9 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$9] = (byte)(this.payload[fieldTemp$9] + (param0 >>> 2));
          this.payload[this.position] = (byte)(param0 << 6);
          this.bitsLeftInByte = 6;
          return;
        }
        if (var3Lifetime1 == 1) {
          fieldTemp$7 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$7] = (byte)(this.payload[fieldTemp$7] + (param0 >>> 3));
          this.payload[this.position] = (byte)(param0 << 5);
          this.bitsLeftInByte = 5;
          return;
        }
        if (var3Lifetime1 != 0) {
          this.bitsLeftInByte = this.bitsLeftInByte - 4;
          this.payload[this.position] = (byte)(this.payload[this.position] + (param0 << this.bitsLeftInByte));
          return;
        }
        fieldTemp$8 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$8] = (byte)(param0 << 4);
        this.bitsLeftInByte = 4;
        return;
    }

    final void readCipheredBytes(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 80 / ((70 - param1) / 50);
          while (var5_int < param3) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[param0 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(120));
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("kh.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void setGraphicsSettings(boolean param0, RendererMode param1, GraphicsQuality param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == GameFontMetrics.field_f &&
            Room.field_k == param1) {
            return;
          }
          if (!param0) {
            return;
          }
          GameFontMetrics.field_f = param2;
          Room.field_k = param1;
          if (WeaponShooterBehaviour.field_r == Room.field_k) {
            if (GameFontMetrics.field_f == baa.field_e) {
              baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) HuffmanCodec.field_a)});
            } else {
              if (tia.field_d == GameFontMetrics.field_f) {
                baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) DateInputWidget.field_z)});
              } else {
                if (GameFontMetrics.field_f == PitModel.field_s) {
                  baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) UsernameSuggestionsPanel.field_x)});
                }
              }
            }
          } else {
            if (GameFontMetrics.field_f != baa.field_e) {
              if (GameFontMetrics.field_f == tia.field_d) {
                baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) vea.field_c)});
              } else {
                if (GameFontMetrics.field_f == PitModel.field_s) {
                  baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) CharacterSelection.field_d)});
                }
              }
            } else {
              baa.field_d.setCandidates(0, new ToolkitCandidate[]{(ToolkitCandidate) ((Object) ControllerLocomotor.field_t)});
            }
          }
          if (null != mq.field_e) {
            mq.field_e.field_g = PitSnake.getCurrentGraphicsMode(5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("kh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void writeCipheredOpcode(int param0, int param1) {
        if (param1 != -2988) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.opcodeCipher.nextInt(104) + param0);
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_m = null;
        field_l = (String[][]) null;
        field_p = null;
        field_o = null;
        if (param0 == 0) {
          return;
        }
        field_j = (String) null;
    }

    final void endBitWrite(int param0) {
        if (8 > this.bitsLeftInByte) {
          this.bitsLeftInByte = 8;
          this.position = this.position + 1;
          if (param0 == -1826190686) {
            return;
          }
          field_o = (String) null;
          return;
        }
        if (param0 == -1826190686) {
          return;
        }
        field_o = (String) null;
    }

    static {
        field_p = "Game";
        field_j = "Close";
        field_m = "Rumour has it these bags o' loot were abandoned by ancient smugglers. Now you can smuggle them out for points.";
        field_o = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
