/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class PacketBuffer extends IntrusiveNode {
    int position;
    static Random field_t;
    static String[][] field_s;
    static String field_q;
    static ResourceArchive field_r;
    static PalettedBitmapFont field_n;
    byte[] payload;
    static int field_p;

    final void writeBytes(int param0, int param1, boolean param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          for (var5_int = param0; param1 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
          }
          if (!param2) {
            field_n = (PalettedBitmapFont) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sb.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int readUnsignedMedium(int param0) {
        this.position = this.position + 3;
        if (param0 < 1) {
          return 50;
        }
        return (this.payload[this.position - 3] << 16 & 16711680) + ((65280 & this.payload[-2 + this.position] << 8) + (255 & this.payload[this.position - 1]));
    }

    final void writeLong40(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param1;
        if (param0 > -43) {
          field_p = 23;
        }
    }

    final void backpatchByteLength(int param0, int param1) {
        this.payload[param0 + (-param1 + this.position)] = (byte)param1;
    }

    final void backpatchIntLength(int param0, int param1) {
        this.payload[-4 - param0 + this.position] = (byte)(param0 >> 24);
        this.payload[-param0 + (this.position - 3)] = (byte)(param0 >> 16);
        this.payload[-param0 + this.position - 2] = (byte)(param0 >> 8);
        this.payload[this.position - (param0 + 1)] = (byte)param0;
        if (param1 > -90) {
          this.payload = (byte[]) null;
        }
    }

    final void writeSignedSmart(int param0, int param1) {
        if (param0 >= -3) {
          return;
        }
        if (64 > param1 &&
          param1 >= -64) {
          this.writeByte(64 + param1, 25564);
          return;
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.writeShort((byte) 123, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void encryptXtea(int[] param0, int param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          if (param1 != 31747) {
            this.position = -33;
          }
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt((byte) 24);
            var6 = this.readInt((byte) 35);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (param0[(var7 & 6233) >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) 106, var5);
            this.writeInt((byte) 111, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sb.EA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyRsa(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.position;
        this.position = 0;
        byte[] var5 = new byte[var4_int];
        this.readBytes(var5, (byte) -120, 0, var4_int);
        if (param0 > -31) {
          return;
        }
        try {
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort((byte) 125, var8.length);
          this.writeBytes(0, var8.length, true, var8);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "sb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void writePrefixedString(int param0, String param1) {
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        if (param0 != 8) {
          return;
        }
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + FullscreenNoticeType.encodeCp1252Subsequence(var4, this.payload, this.position, 0, param1.length(), 8211);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "sb.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void backpatchShortLength(int param0, int param1) {
        if (param1 != -506270856) {
          this.readUnsignedShort(13);
        }
        this.payload[this.position - param0 - 2] = (byte)(param0 >> 8);
        this.payload[-1 + (this.position - param0)] = (byte)param0;
    }

    final int readUnsignedShortOrInt(byte param0) {
        if (param0 >= -116) {
          byte[] var3 = (byte[]) null;
          this.readBytes((byte[]) null, (byte) -124, -10, -111);
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(-91);
        }
        return this.readInt((byte) 35) & 2147483647;
    }

    final void decryptXteaRange(int param0, int param1, int[] param2, boolean param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = MinerDisturbance.field_ab;
        try {
          var5_int = this.position;
          this.position = param0;
          var6 = (param1 - param0) / 8;
          var7 = 0;
          if (!param3) {
            return;
          }
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) 54);
            var9 = this.readInt((byte) 17);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param2[var10 >>> 11 & -1497366525] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (param2[3 & var10] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) 104, var8);
            this.writeInt((byte) 84, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("sb.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeMedium(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 != -113) {
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final int readUnsignedByte(byte param0) {
        if (param0 != -54) {
          PacketBuffer.a(-98);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final int readInt(byte param0) {
        if (param0 < 14) {
          field_s = (String[][]) null;
        }
        this.position = this.position + 4;
        return ((this.payload[-3 + this.position] & 255) << 16) + (this.payload[-4 + this.position] << 24 & -16777216) + ((this.payload[-2 + this.position] & 255) << 8) + (this.payload[this.position - 1] & 255);
    }

    final void writeInt(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        if (param0 <= 79) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final void writeByte(int param0, int param1) {
        if (param1 != 25564) {
          field_t = (Random) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final void readBytes(byte[] param0, byte param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          var5_int = param2;
          if (param1 != -120) {
            return;
          }
          while (var5_int < param2 + param3) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sb.FA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!kj.a(false) &&
          null == dm.field_f) {
          dm.field_f = fn.a(0, 6);
        }
        if (param0 != 6) {
          field_n = (PalettedBitmapFont) null;
        }
        if (!si.field_a &&
          null != dm.field_f && dm.field_f.field_q) {
          fn.a(dm.field_f.field_t, true);
          si.field_a = true;
          aa.field_j.a(35, pj.field_c);
          ck.a(param0 - 30839);
        }
    }

    final int readUnsignedShort(int param0) {
        if (param0 > -8) {
          return -93;
        }
        this.position = this.position + 2;
        return (this.payload[this.position - 1] & 255) + ((255 & this.payload[this.position - 2]) << 8);
    }

    final String readString(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0) {
          this.writeLong40(32, -68L);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = -var2 + (this.position - 1);
        if (var3 != 0) {
          return ph.decodeCp1252String((byte) 34, var3, this.payload, var2);
        }
        return "";
    }

    final int readSignedSmart(byte param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 <= 20) {
          return 42;
        }
        if (128 <= var2) {
          return this.readUnsignedShort(-113) - 49152;
        }
        return this.readUnsignedByte((byte) -54) - 64;
    }

    final void writeLong(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (param0 != -1) {
          field_p = 31;
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
    }

    final void writeShort(byte param0, int param1) {
        if (param0 <= 120) {
          this.readUnsignedShortOrInt((byte) 11);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
    }

    public static void clearStaticReferences(int param0) {
        field_t = null;
        field_q = null;
        field_n = null;
        int var1 = 59 % ((param0 + 1) / 44);
        field_s = (String[][]) null;
        field_r = null;
    }

    final byte readByte(int param0) {
        if (param0 != 4) {
          field_r = (ResourceArchive) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final String readPrefixedString(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -var3 + (this.position - 1);
        if (~var4 != param0) {
          return ph.decodeCp1252String((byte) 116, var4, this.payload, var3);
        }
        return "";
    }

    final int appendCrc32(int param0, int param1) {
        int var3 = 47 % ((-1 - param0) / 62);
        int var4 = qn.computeCrc32(-1648911295, param1, this.position, this.payload);
        this.writeInt((byte) 99, var4);
        return var4;
    }

    final void writeVarInt(int param0, int param1) {
        if (param0 >= -15) {
          return;
        }
        if ((-128 & param1) != 0) {
          if ((-16384 & param1) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.writeByte(128 | param1 >>> 28, 25564);
              }
              this.writeByte((269712780 | param1) >>> 21, 25564);
            }
            this.writeByte((param1 | 2106349) >>> 14, 25564);
          }
          this.writeByte(param1 >>> 7 | 128, 25564);
        }
        this.writeByte(127 & param1, 25564);
    }

    private final void writeLong56(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 != 63) {
          this.readUnsignedByte((byte) -44);
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param0;
    }

    final void padZerosTo(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = MinerDisturbance.field_ab;
        while (param1 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -1) {
          field_s = (String[][]) null;
        }
    }

    final void writeString(int param0, String param1) {
        int fieldTemp$0 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param1);
        this.position = this.position + FullscreenNoticeType.encodeCp1252Subsequence(var4, this.payload, this.position, 0, param1.length(), 8211);
        if (param0 != 23446) {
          return;
        }
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "sb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long readLong(int param0) {
        if (param0 < 1) {
          return -20L;
        }
        long var2 = (long)this.readInt((byte) 56) & 4294967295L;
        long var4 = (long)this.readInt((byte) 83) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final String readNullableString(int param0) {
        int var2 = 42 / ((-9 - param0) / 48);
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(false);
    }

    final void writeBase38String(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else if (var9 >= 97 &&
                122 >= var9) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (48 <= var9 &&
                57 >= var9) {
                var3_long = var3_long + (long)(-48 + (28 + var9));
              } else {
                var3_long = var3_long + 1L;
              }
              decompiledFrameRemainder0 = (var8 == 10);
            } else {
              decompiledFrameRemainder0 = (var8 == 10);
            }
            if (decompiledFrameRemainder0) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          if (param0 != 97) {
            return;
          }
          this.writeLong56(var3_long, 63);
          this.writeLong56(var5, 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("sb.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final int readUnsignedSmart(boolean param0) {
        if (!param0) {
          field_n = (PalettedBitmapFont) null;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return -32768 + this.readUnsignedShort(-11);
        }
        return this.readUnsignedByte((byte) -54);
    }

    final boolean verifyCrc32(int param0) {
        this.position = this.position - 4;
        int var2 = qn.computeCrc32(param0 - 1648911295, param0, this.position, this.payload);
        int var3 = this.readInt((byte) 108);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        if (param0 != 8) {
          field_n = (PalettedBitmapFont) null;
        }
        return var2 | var3;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = lh.a((byte) 33, param0);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new Random();
        field_q = "This entry doesn't match";
        field_s = new String[][]{null, new String[]{"Yuck, you're covered in oil. Swiming in the water for a few seconds will clean it off. Don't use a jetpack while covered in oil!"}};
    }
}
