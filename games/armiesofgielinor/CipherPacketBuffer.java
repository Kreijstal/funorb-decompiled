/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static String[] field_u;
    private int bitPosition;
    static byte[] field_A;
    private int writeBitsRemaining;
    static BitmapFont field_t;
    static ScrollContainer field_x;
    private IsaacRandom opcodeCipher;
    static Battlefield currentBattlefield;

    final void setReadBitPosition(byte obfuscationGuard, int bitPosition) {
        this.bitPosition = bitPosition;
        if (obfuscationGuard < -16) {
          return;
        }
        int[] var4 = (int[]) null;
        this.initializeOpcodeCipher((int[]) null, -64);
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 ^ param1;
    }

    final int getReadBitPosition(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return 59;
        }
        return this.bitPosition;
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void writeCipheredOpcode(int obfuscationGuard, int opcode) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard == 32161) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(opcode + this.opcodeCipher.nextInt(256));
          return;
        }
    }

    final int readBits(int obfuscationGuard, int bitCount) {
        int incrementValue$0 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var5 = -82 / ((-41 - obfuscationGuard) / 57);
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (7 & this.bitPosition);
        this.bitPosition = this.bitPosition + bitCount;
        int var6 = 0;
        while (var4 < bitCount) {
          incrementValue$0 = var3;
          var3++;
          var6 = var6 + ((this.payload[incrementValue$0] & GameEvent.bitMasks[var4]) << -var4 + bitCount);
          bitCount = bitCount - var4;
          var4 = 8;
        }
        if (bitCount == var4) {
          var6 = var6 + (GameEvent.bitMasks[var4] & this.payload[var3]);
        } else {
          var6 = var6 + (this.payload[var3] >> var4 - bitCount & GameEvent.bitMasks[bitCount]);
        }
        return var6;
    }

    final void beginBitReading(int obfuscationGuard) {
        this.bitPosition = 8 * this.position;
        if (obfuscationGuard > 10) {
          return;
        }
        this.beginBitReading(52);
    }

    final void setWriteBitPosition(int bitPosition, byte obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        this.writeBitsRemaining = 8 - (bitPosition & 7);
        this.position = bitPosition >> 3;
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final void writeBits(int obfuscationGuard, int bitCount, int value) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var5Lifetime1;
        value = value & GameEvent.bitMasks[bitCount];
        if (obfuscationGuard == -16807) {
          while (this.writeBitsRemaining < bitCount) {
            bitCount = bitCount - this.writeBitsRemaining;
            this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(value >>> bitCount, rn.bitwiseAnd((int) this.payload[this.position], 255 << this.writeBitsRemaining));
            this.writeBitsRemaining = 8;
            this.position = this.position + 1;
          }
          if (bitCount == this.writeBitsRemaining) {
            this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(value, rn.bitwiseAnd((int) this.payload[this.position], 255 << this.writeBitsRemaining));
            this.position = this.position + 1;
            this.writeBitsRemaining = 8;
          } else {
            var4 = -bitCount + this.writeBitsRemaining;
            var5 = ~(GameEvent.bitMasks[bitCount] << var4);
            this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(rn.bitwiseAnd(var5, (int) this.payload[this.position]), value << var4);
            this.writeBitsRemaining = this.writeBitsRemaining - bitCount;
            return;
          }
          return;
        }
        this.setReadBitPosition((byte) -128, -74);
        while (this.writeBitsRemaining < bitCount) {
          bitCount = bitCount - this.writeBitsRemaining;
          this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(value >>> bitCount, rn.bitwiseAnd((int) this.payload[this.position], 255 << this.writeBitsRemaining));
          this.writeBitsRemaining = 8;
          this.position = this.position + 1;
        }
        if (bitCount == this.writeBitsRemaining) {
          this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(value, rn.bitwiseAnd((int) this.payload[this.position], 255 << this.writeBitsRemaining));
          this.position = this.position + 1;
          this.writeBitsRemaining = 8;
        } else {
          var4Lifetime1 = -bitCount + this.writeBitsRemaining;
          var5Lifetime1 = ~(GameEvent.bitMasks[bitCount] << var4Lifetime1);
          this.payload[this.position] = (byte)AccountRegistrationDialog.bitwiseOr(rn.bitwiseAnd(var5Lifetime1, (int) this.payload[this.position]), value << var4Lifetime1);
          this.writeBitsRemaining = this.writeBitsRemaining - bitCount;
          return;
        }
    }

    final int readCipheredOpcode(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard == 255) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(256) & 255;
        }
        this.bitPosition = -69;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.opcodeCipher.nextInt(256) & 255;
    }

    final void initializeOpcodeCipher(int[] seed, int obfuscationGuard) {
        try {
          if (obfuscationGuard >= -76) {
            currentBattlefield = (Battlefield) null;
          }
          this.opcodeCipher = new IsaacRandom(seed);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bv.I(" + (seed != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void k(byte param0) {
        field_x = null;
        field_t = null;
        field_A = null;
        currentBattlefield = null;
        field_u = null;
        if (param0 != -97) {
          CipherPacketBuffer.a(true, -32, -99, 30);
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var5_int = 0; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[param3 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(256));
          }
          if (param2) {
            this.beginBitReading(-70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bv.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param1 == jt.field_a) {
          return;
        }
        BufferedSocket.field_i = null;
        CampaignResult.a(73);
        DualNodeDeque.field_c = param3;
        if (0 != param1) {
          if (param1 == 23) {
            DualNodeDeque.field_c = 0;
          }
          if (param1 != -10) {
            mu.field_a = new cg();
          }
          qc.field_j = 0;
          if (MusicCrossfadeStream.a(jt.field_a, true)) {
            ConsoleTextNode.field_p[jt.field_a].clearSelectionResources(true);
          }
        } else {
          DualNodeDeque.field_c = 0;
          TrianglePulse.selectMusicTrackWithDefaultGain(-16147, 50, SocialListPanel.field_Ob, true);
          if (param1 != 23) {
            if (param1 != -10) {
              mu.field_a = new cg();
            }
            qc.field_j = 0;
            if (MusicCrossfadeStream.a(jt.field_a, true)) {
              ConsoleTextNode.field_p[jt.field_a].clearSelectionResources(true);
            }
          } else {
            DualNodeDeque.field_c = 0;
            if (param1 != -10) {
              mu.field_a = new cg();
              qc.field_j = 0;
              if (MusicCrossfadeStream.a(jt.field_a, true)) {
                ConsoleTextNode.field_p[jt.field_a].clearSelectionResources(true);
              }
            } else {
              qc.field_j = 0;
              if (!MusicCrossfadeStream.a(jt.field_a, true)) {
                if (!MusicCrossfadeStream.a(param1, true)) {
                  if (jt.field_a == 16) {
                    RasterState.a((byte) 111);
                    TextLineLayout.a((byte) -41);
                    vr.a(iw.field_l, 18);
                  }
                  jt.field_a = param1;
                  if (param2 == 1) {
                    return;
                  }
                  CipherPacketBuffer.k((byte) -51);
                  return;
                }
                var4 = -2;
                if (param1 == 15) {
                  var4 = -1;
                }
                if (param1 == 0) {
                  var4 = 2;
                }
                if (param1 == 7) {
                  var4 = 1;
                }
                if (param1 == 20) {
                  var4 = 0;
                }
                if (param1 == 12) {
                  var4 = 1;
                }
                if (param1 == 18) {
                  var4 = 2;
                }
                if (var4 == -2) {
                  ConsoleTextNode.field_p[param1].restoreStageSelection(71, param0, 0);
                } else {
                  ConsoleTextNode.field_p[param1].restoreStageSelection(85, param0, var4);
                }
                if (param1 == 15) {
                  SkeletonLimitMarker.a(param0, param2 - 1);
                }
                if (jt.field_a == 16) {
                  RasterState.a((byte) 111);
                  TextLineLayout.a((byte) -41);
                  vr.a(iw.field_l, 18);
                }
                jt.field_a = param1;
                if (param2 == 1) {
                  return;
                }
                CipherPacketBuffer.k((byte) -51);
                return;
              }
              ConsoleTextNode.field_p[jt.field_a].clearSelectionResources(true);
            }
          }
        }
        if (MusicCrossfadeStream.a(param1, true)) {
          var4Lifetime1 = -2;
          if (param1 == 15) {
            var4Lifetime1 = -1;
          }
          if (param1 == 0) {
            var4Lifetime1 = 2;
          }
          if (param1 == 7) {
            var4Lifetime1 = 1;
          }
          if (param1 == 20) {
            var4Lifetime1 = 0;
          }
          if (param1 == 12) {
            var4Lifetime1 = 1;
          }
          if (param1 == 18) {
            var4Lifetime1 = 2;
          }
          if (var4Lifetime1 == -2) {
            ConsoleTextNode.field_p[param1].restoreStageSelection(71, param0, 0);
          } else {
            ConsoleTextNode.field_p[param1].restoreStageSelection(85, param0, var4Lifetime1);
          }
          if (param1 == 15) {
            SkeletonLimitMarker.a(param0, param2 - 1);
          }
        }
        if (jt.field_a == 16) {
          RasterState.a((byte) 111);
          TextLineLayout.a((byte) -41);
          vr.a(iw.field_l, 18);
        }
        jt.field_a = param1;
        if (param2 == 1) {
          return;
        }
        CipherPacketBuffer.k((byte) -51);
    }

    final void endBitReading(int obfuscationGuard) {
        this.position = (7 + this.bitPosition) / 8;
        if (obfuscationGuard == -2) {
          return;
        }
        this.setWriteBitPosition(-66, (byte) 60);
    }

    static {
        field_u = new String[]{"aviansie_axe_spin", null, null, null, null, "spin", null};
        field_A = new byte[]{(byte)7, (byte)4, (byte)4, (byte)4, (byte)2, (byte) 5};
    }
}
