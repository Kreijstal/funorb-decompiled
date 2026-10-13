/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    static jp field_t;
    private IsaacGenerator opcodeCipher;
    private int writeBitsRemaining;
    static String field_s;
    private int bitPosition;
    static int[] field_o;
    static lo field_r;
    static n field_u;
    static int field_q;

    final void beginBitWrite(int obfuscationGuard) {
        this.data[this.position] = (byte) 0;
        this.writeBitsRemaining = 8;
        if (obfuscationGuard < 51) {
          this.finishBitWrite(126);
        }
    }

    BitPacketBuffer(byte[] data) {
        super(data);
    }

    final void initializeOpcodeCipher(int[] seed, int obfuscationGuard) {
        try {
          this.opcodeCipher = new IsaacGenerator(seed);
          int var3_int = -50 / ((obfuscationGuard - 22) / 37);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "pi.UA(" + (seed != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void clearStaticReferences(int obfuscationGuard) {
        field_t = null;
        field_o = null;
        if (obfuscationGuard != 60) {
          field_s = (String) null;
        }
        field_r = null;
        field_u = null;
        field_s = null;
    }

    BitPacketBuffer(int capacity) {
        super(capacity);
    }

    final void beginBitRead(int obfuscationGuard) {
        if (obfuscationGuard > -74) {
          field_u = (n) null;
        }
        this.bitPosition = 8 * this.position;
    }

    final void writeCipheredOpcode(int obfuscationGuard, int opcode) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(opcode + this.opcodeCipher.nextInt(111));
        if (obfuscationGuard != -13413) {
          this.finishBitRead((byte) -89);
        }
    }

    final static void drawBoard(byte obfuscationGuard, int playerId, int scaleDivisor, int destinationY, MultiplayerMatch match, int destinationX) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        Paddle var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        Ball var12_ref_vn = null;
        PowerUp var12_ref_ge = null;
        il var12_ref_il = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        PlayerBoard var24 = null;
        Object var25 = null;
        Ball var26 = null;
        kc var27 = null;
        ScorePopup var28 = null;
        var22 = null;
        var23 = null;
        var25 = null;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          var24 = match.playerBoards[playerId];
          var7 = var24.paddle;
          var8 = var24.boardWidth;
          var9 = var24.field_wb;
          lb.e(destinationX, destinationY, destinationX + var8 / scaleDivisor, var9 / scaleDivisor + destinationY);
          if (var24.brickGroups != null) {
            jo.a(scaleDivisor, var24, playerId, match, destinationX, 30, destinationY);
          }
          if (var24.field_M != -1) {
            var10_double = (double)(500 - var24.field_M);
            var10_double = (var10_double / 666.0 + 1.0) * (var10_double / 10.0);
            var10_double = 30.0 * Math.sin(var10_double) + 60.0;
            lb.d(destinationX, destinationY, var8 / scaleDivisor, var9 - scaleDivisor, 16724787, (int)var10_double);
          }
          stackIn_8_0 = (((match.playerMaskTwo | match.playerMaskOne | match.playerMaskThree) & 1 << playerId) == 0) ? 0 : 1;
          var10 = stackIn_8_0;
          if (var24.field_Z == 2 &&
            var10 == 0) {
            var11 = var24.activeBalls.size(127);
            var12_ref_vn = (Ball) (var24.activeBalls.first(-7));
            while (var12_ref_vn != null) {
              var13 = var12_ref_vn.centerXHistory256.latestIndex;
              if (var12_ref_vn.contactCount < 40) {
                stackIn_16_0 = (18 + var12_ref_vn.contactCount) / (var11 * 3);
              } else {
                stackIn_16_0 = 19 / var11;
              }
              var14 = stackIn_16_0;
              var15 = (var12_ref_vn.contactCount + 3) * 256 / (var12_ref_vn.contactCount + 6);
              var16 = var15 / (1 + var14);
              var17 = var12_ref_vn.radius256;
              var18 = 0;
              while (var13 >= 0) {
                if (var18 < var14) {
                  var19 = var12_ref_vn.centerXHistory256.get(var13, 1);
                  var20 = var12_ref_vn.centerYHistory256.get(var13, 1);
                  lb.a((destinationX << 4) + (var19 >> 4) / scaleDivisor, (var20 >> 4) / scaleDivisor + (destinationY << 4), var17 / scaleDivisor >> 4, var15, ag.field_M);
                  var15 = var15 - var16;
                  var17 = var17 * 252 >> 8;
                  var13--;
                  var18++;
                  continue;
                }
                break;
              }
              if (var12_ref_vn.contactCount >= 40) {
                al.a((var12_ref_vn.radius256 >> 8) / scaleDivisor + (destinationY + (var12_ref_vn.y256 >> 8) / scaleDivisor), 40 / scaleDivisor, 256, sa.a(100 * de.field_x, -4097) * 10 >> 16, 123, 20 / scaleDivisor, (var12_ref_vn.x256 >> 8) / scaleDivisor + destinationX + (var12_ref_vn.radius256 >> 8) / scaleDivisor);
                la.a((var12_ref_vn.x256 + var12_ref_vn.radius256 >> 4) / scaleDivisor + (destinationX << 4), (destinationY << 4) + (var12_ref_vn.y256 + var12_ref_vn.radius256 >> 4) / scaleDivisor, (var12_ref_vn.radius256 >> 3) / scaleDivisor, 4, 3, lj.field_n, var24.simulationTick / 5);
              }
              IntNode.a(var12_ref_vn, (byte) -119, scaleDivisor, destinationX, destinationY);
              var12_ref_vn = (Ball) (var24.activeBalls.next((byte) 116));
            }
            var26 = (Ball) (var24.queuedBalls.first(-76));
            while (var26 != null) {
              IntNode.a(var26, (byte) -119, scaleDivisor, destinationX, destinationY);
              var26 = (Ball) (var24.queuedBalls.next((byte) 116));
            }
            var12_ref_ge = (PowerUp) (var24.fallingPowerUps.first(-113));
            while (var12_ref_ge != null) {
              we.field_b[var12_ref_ge.typeId].c(destinationX + (var12_ref_ge.x256 >> 8) / scaleDivisor, (var12_ref_ge.y256 >> 8) / scaleDivisor + destinationY);
              var12_ref_ge = (PowerUp) (var24.fallingPowerUps.next((byte) 116));
            }
            var12_ref_il = (il) (var24.field_C.first(-20));
            while (var12_ref_il != null) {
              la.a((var12_ref_il.x256 >> 4) / scaleDivisor + (destinationX << 4), (var12_ref_il.y256 >> 4) / scaleDivisor + (destinationY << 4), (var12_ref_il.radius256 >> 4) / scaleDivisor, var12_ref_il.field_v);
              var12_ref_il = (il) (var24.field_C.next((byte) 116));
            }
          }
          if ((var24.field_Z == 2 ||
            var24.field_Z == 4 ||
            var24.field_Z == 1) &&
            var10 == 0) {
            oj.a(kb.a(match, playerId, 127, var24), var7, scaleDivisor, destinationY, (byte) 107, var24, destinationX);
          }
          var27 = (kc) (var24.field_x.first(-30));
          while (var27 != null) {
            var27.a(scaleDivisor, destinationX, destinationY, true);
            var27 = (kc) (var24.field_x.next((byte) 116));
          }
          if (match.playerCount == 1 &&
            var24.field_Z == 1) {
            var12 = 256;
            if (var24.field_P < 25) {
              var12 = var24.field_P * 256 / 25;
            } else {
              if (var24.field_P > 109) {
                var12 = 125 - var24.field_P;
                var12 = var12 * 256 / 15;
              }
            }
            lb.d(7, 280, 510, 45, 0, 96 * var12 / 256);
            w.field_r.b(7 + (-w.field_r.field_D + 510) / 2, 260, var12);
          }
          if (3 == var24.field_Z) {
            ja.a((byte) -113, v.field_b, var8, var9, var24);
          }
          if (var24.field_Z == 5) {
            ja.a((byte) -104, jk.field_u, var8, var9, var24);
          }
          if (null != var24.field_w) {
            jg.a(destinationX, var24, var24.field_w, scaleDivisor, 25, destinationY);
          }
          if (var24.field_D != null) {
            jg.a(destinationX, var24, var24.field_D, scaleDivisor, 25, destinationY);
          }
          var28 = (ScorePopup) (var24.scorePopups.first(-81));
          if (obfuscationGuard < 14) {
            return;
          }
          while (var28 != null) {
            cn.a(var28, var24, 10030, destinationX, destinationY);
            var28 = (ScorePopup) (var24.scorePopups.next((byte) 116));
          }
          if (0 != (match.playerMaskThree & 1 << playerId)) {
            cp.a(destinationX, var8, var9, (byte) 126, var24, destinationY, scaleDivisor);
          }
          if (0 != (1 << playerId & match.playerMaskTwo)) {
            bm.a(destinationX, destinationY, var9, var24, var8, scaleDivisor, ci.field_s.toLowerCase(), (byte) 123);
          }
          if ((match.playerMaskOne & 1 << playerId) != 0) {
            bm.a(destinationX, destinationY, var9, var24, var8, scaleDivisor, t.field_h.toLowerCase(), (byte) 76);
          }
          lb.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("pi.FB(").append(obfuscationGuard).append(',').append(playerId).append(',').append(scaleDivisor).append(',').append(destinationY).append(',');
          if (match == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(destinationX).append(')').toString());
        }
    }

    final void writeBits(int bitCount, int obfuscationGuard, int value) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        value = value & kk.bitMasks[bitCount];
        if (obfuscationGuard != -17566) {
          this.finishBitRead((byte) 28);
        }
        while (this.writeBitsRemaining < bitCount) {
          bitCount = bitCount - this.writeBitsRemaining;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$1] = (byte)(this.data[fieldTemp$1] + (value >>> bitCount));
          this.data[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        }
        if (this.writeBitsRemaining == bitCount) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte)(this.data[fieldTemp$0] + value);
          this.data[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        } else {
          this.writeBitsRemaining = this.writeBitsRemaining - bitCount;
          this.data[this.position] = (byte)(this.data[this.position] + (value << this.writeBitsRemaining));
        }
    }

    final int readCipheredOpcode(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_r = (lo) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.data[fieldTemp$0] - this.opcodeCipher.nextInt(99);
    }

    final void finishBitRead(byte obfuscationGuard) {
        this.position = (this.bitPosition + 7) / 8;
        if (obfuscationGuard < 69) {
          pb var3 = (pb) null;
          BitPacketBuffer.a((jp) null, (pb) null, 39, 118, (byte) 103, -79);
        }
    }

    final void readCipheredBytes(boolean obfuscationGuard, int destinationOffset, int length, byte[] destination) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          if (obfuscationGuard) {
            var7 = (byte[]) null;
            this.readCipheredBytes(true, 24, -63, (byte[]) null);
          }
          while (var5_int < length) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[destinationOffset + var5_int] = (byte)(this.data[fieldTemp$0] - this.opcodeCipher.nextInt(126));
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pi.GB(").append(obfuscationGuard).append(',').append(destinationOffset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(jp param0, pb param1, int param2, int param3, byte param4, int param5) {
        try {
          fc.a(-102, param1.field_p);
          lb.g(0, 0, param1.field_i, param1.field_q, hh.field_c[param2], 10792131);
          param0.c((param1.field_i - param0.field_x) / 2, -(75 / param3) - param0.field_z + (param5 + param1.field_q));
          sc.b(-102);
          if (param4 < 6) {
            BitPacketBuffer.clearStaticReferences(102);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "pi.LB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int readBits(int bitCount, byte obfuscationGuard) {
        int previousByteIndex = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 84 % ((-27 - obfuscationGuard) / 58);
        int byteIndex = this.bitPosition >> 3;
        int availableBits = -(7 & this.bitPosition) + 8;
        int value = 0;
        this.bitPosition = this.bitPosition + bitCount;
        while (bitCount > availableBits) {
          previousByteIndex = byteIndex;
          byteIndex++;
          value = value + ((kk.bitMasks[availableBits] & this.data[previousByteIndex]) << bitCount - availableBits);
          bitCount = bitCount - availableBits;
          availableBits = 8;
        }
        if (availableBits == bitCount) {
          value = value + (this.data[byteIndex] & kk.bitMasks[availableBits]);
        } else {
          value = value + (this.data[byteIndex] >> -bitCount + availableBits & kk.bitMasks[bitCount]);
        }
        return value;
    }

    final void finishBitWrite(int obfuscationGuard) {
        if (8 > this.writeBitsRemaining) {
          this.writeBitsRemaining = 8;
          this.position = this.position + 1;
        }
        int var2 = 53 % ((obfuscationGuard + 14) / 35);
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        ng.field_b = 2;
        if (param0 != 21846) {
          return;
        }
        try {
          tk.field_p = param1;
          var5 = (CharSequence) ((Object) param1);
          kb.field_Qb = gb.a(var5, 96);
          qn.field_n = param2;
          di.a((byte) -120);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "pi.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = "Unpacking sound effects";
        field_r = new lo();
        field_u = new n();
    }
}
