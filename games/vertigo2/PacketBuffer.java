/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static boolean field_q;
    static int field_n;
    int position;
    static String field_r;
    static String field_o;
    static String field_s;
    byte[] payload;
    static boolean field_t;

    final void writeByte(int param0, int param1) {
        int var3 = 86 / ((param1 - 16) / 62);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final void patchShortLength(byte param0, int param1) {
        if (param0 > -110) {
          this.readSmart(-69);
        }
        this.payload[-2 - param1 + this.position] = (byte)(param1 >> 8);
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var6 = 36 / ((param3 + 2) / 61);
          for (var5_int = param0; var5_int < param2 + param0; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ed.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedMedium(int param0) {
        this.position = this.position + 3;
        if (param0 != 0) {
          return 87;
        }
        return (this.payload[this.position - 1] & 255) + ((this.payload[-3 + this.position] << 16 & 16711680) + (65280 & this.payload[-2 + this.position] << 8));
    }

    final void writeSignedSmart(int param0, byte param1) {
        if (param0 < 64 &&
          -64 <= param0) {
          this.writeByte(param0 + 64, -92);
          return;
        }
        if (param1 > -39) {
          this.readSignedByte(63);
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.writeShort(param0 + 49152, -1783);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readLargeSmart(int param0) {
        if (param0 < 41) {
          return -124;
        }
        if (this.payload[this.position] < 0) {
          return 2147483647 & this.readInt(true);
        }
        return this.readUnsignedShort((byte) -11);
    }

    final long readLong(int param0) {
        if (param0 != -31016) {
          return 69L;
        }
        long var2 = 4294967295L & (long)this.readInt(true);
        long var4 = 4294967295L & (long)this.readInt(true);
        return (var2 << 32) + var4;
    }

    final void b(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 < 4) {
          field_q = false;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param1;
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 < 84) {
          return;
        }
        field_r = null;
        field_o = null;
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 0) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
    }

    final void patchIntLength(int param0, int param1) {
        this.payload[-4 + (this.position - param0)] = (byte)(param0 >> 24);
        int var3 = -106 / ((param1 + 9) / 50);
        this.payload[-param0 + this.position - 3] = (byte)(param0 >> 16);
        this.payload[this.position - param0 - 2] = (byte)(param0 >> 8);
        this.payload[this.position - param0 - 1] = (byte)param0;
    }

    final int readInt(boolean param0) {
        if (!param0) {
          return 108;
        }
        this.position = this.position + 4;
        return (255 & this.payload[-1 + this.position]) + ((this.payload[-3 + this.position] & 255) << 16) + ((this.payload[this.position - 4] << 24 & -16777216) + (65280 & this.payload[this.position - 2] << 8));
    }

    final static Sprite a(int param0, int param1, boolean param2) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        Sprite var3 = new Sprite(param1, param1);
        int var4 = 0;
        if (param2) {
          field_q = true;
        }
        while (var3.field_F.length > var4) {
          var3.field_F[var4] = param0;
          var4++;
        }
        return var3;
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + l.a(param0 + 108, this.payload, var4, param1.length(), 0, this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ed.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != 684868900) {
            this.readLong(85);
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + l.a(87, this.payload, var4, param1.length(), 0, this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ed.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        if (param0) {
          this.position = -91;
        }
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    private final void a(long param0, int param1) {
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
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param0;
        if (param1 != -8245) {
          this.patchShortLength((byte) 75, 19);
        }
    }

    final void writeLong(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        if (param0 >= -108) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 24);
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

    final int readSignedShort(int param0) {
        this.position = this.position + param0;
        int var2 = (this.payload[-2 + this.position] << 8 & 65280) + (255 & this.payload[this.position - 1]);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final int readUnsignedByte(int param0) {
        if (param0 != -11) {
          field_r = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void writeSmart(int param0, byte param1) {
        if (param0 >= 0 &&
          128 > param0) {
          this.writeByte(param0, param1 ^ 61);
          return;
        }
        if (param1 != -73) {
          field_q = false;
        }
        if (param0 >= 0 &&
          param0 < 32768) {
          this.writeShort(param0 + 32768, param1 - 1710);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        java.math.BigInteger var14 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param2;
          var6 = (-param2 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              if (param3 != -123) {
                var14 = (java.math.BigInteger) null;
                this.a((java.math.BigInteger) null, (java.math.BigInteger) null, -97);
              }
              return;
            }
            var8 = this.readInt(true);
            var9 = this.readInt(true);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param0[(var10 & 6974) >>> 11] + var10);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param0[3 & var10] ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, 0);
            this.writeInt(var9, 0);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ed.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte readSignedByte(int param0) {
        if (param0 <= 78) {
          field_o = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final int readUnsignedShort(byte param0) {
        this.position = this.position + 2;
        if (param0 != -11) {
          return -23;
        }
        return ((255 & this.payload[-2 + this.position]) << 8) + (255 & this.payload[-1 + this.position]);
    }

    final void a(int[] param0, int param1) {
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
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = this.position / 8;
          if (param1 != -12257) {
            return;
          }
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt(true);
            var6 = this.readInt(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + ((var6 << 4 ^ var6 >>> 5) + var6 ^ param0[var7 & 3] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param0[(var7 & 6169) >>> 11] ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, 0);
            this.writeInt(var6, 0);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ed.JA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(long param0, int param1, byte param2) {
        BitPacketBuffer var4 = uh.field_Wb;
        var4.writeCipheredByte(param1, 127);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(7, 98);
        if (param2 > -95) {
          field_s = (String) null;
        }
        var4.writeLong((byte) -111, param0);
        var4.patchByteLength((byte) 11, -var5 + var4.position);
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -1783) {
          field_o = (String) null;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final int readSignedSmart(int param0) {
        if (param0 != -3084) {
          this.readSignedByte(-33);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return -49152 + this.readUnsignedShort((byte) -11);
        }
        return this.readUnsignedByte(param0 ^ 3073) - 64;
    }

    final int c(int param0, int param1) {
        int var3 = om.a(this.position, param0, this.payload, 255);
        int var4 = 104 % ((-61 - param1) / 59);
        this.writeInt(var3, 0);
        return var3;
    }

    final void b(int param0, int param1) {
        int var3 = -111 / ((58 - param1) / 32);
        if (0 != (-128 & param0)) {
          if ((param0 & -16384) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((param0 & -268435456) != 0) {
                this.writeByte(128 | param0 >>> 28, 104);
              }
              this.writeByte(128 | param0 >>> 21, 89);
            }
            this.writeByte(param0 >>> 14 | 128, 95);
          }
          this.writeByte(128 | param0 >>> 7, 80);
        }
        this.writeByte(127 & param0, 82);
    }

    final static void a(boolean param0, boolean param1) {
        IterableNodeHashTable.field_e = !param0 ? new lb(or.field_k, de.field_g) : new lb(GameKeyHandler.field_c, oi.field_a);
        hk.field_o = new UiPanel(0L, (UiPanel) null);
        hk.field_o.b(IterableNodeHashTable.field_e.field_b, 118);
        hk.field_o.b(ne.field_G, 118);
        wc.field_m = new UiPanel(0L, hb.field_D);
        lr.field_P = new UiPanel(0L, (UiPanel) null);
        wc.field_m.b(he.field_x, 118);
        wc.field_m.b(lr.field_P, 126);
        if (param1) {
          PacketBuffer.e(-28);
        }
        lr.field_P.b(im.field_j, 120);
        lr.field_P.b(Vertigo2.field_M, 120);
        ho.a(0, param0);
    }

    final boolean o(int param0) {
        if (param0 != -4111) {
          this.writeByte(113, 62);
        }
        this.position = this.position - 4;
        int var2 = om.a(this.position, 0, this.payload, 255);
        int var3 = this.readInt(true);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(0, var5, var4_int, -66);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          if (param2 != 9157) {
            this.readSignedByte(59);
          }
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, param2 ^ -9524);
          this.a(0, param2 ^ -1119, var8, var8.length);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ed.W(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = (long)param0;
          var7 = param1.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + var9 - 65);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(var9 + 2 - 97);
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + var9 + 28);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a(var3_long, -8245);
          this.a(var5, -8245);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ed.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final String c(boolean param0) {
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
        if (!param0) {
          field_n = 79;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.position);
        if (0 == var4) {
          return "";
        }
        return mj.a(87, this.payload, var3, var4);
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 != 2) {
          this.payload = (byte[]) null;
        }
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        if (param0 != 128) {
          this.c(56, 64);
        }
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + (-var2 + this.position);
        if (var3 != 0) {
          return mj.a(param0 - 236, this.payload, var2, var3);
        }
        return "";
    }

    final int readSmart(int param0) {
        if (param0 != -1317721944) {
          byte[] var3 = (byte[]) null;
          this.a(109, (byte[]) null, -99, 99);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.readUnsignedByte(param0 + 1317721933);
        }
        return this.readUnsignedShort((byte) -11) - 32768;
    }

    final String readNullableString(int param0) {
        if (0 == this.payload[this.position]) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 > -70) {
          return (String) null;
        }
        return this.readString(128);
    }

    final void writeMedium(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != -1725083856) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = vc.a(param0, (byte) -69);
    }

    final void patchByteLength(byte param0, int param1) {
        int var3 = 1 % ((-44 - param0) / 50);
        this.payload[this.position - (param1 + 1)] = (byte)param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != -10140) {
            return;
          }
          for (var5_int = param0; var5_int < param3 + param0; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ed.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 0;
        field_s = "Type your age in years";
        field_o = "Anonymous";
        field_t = false;
        field_r = "You must be a member to play with the current options.";
    }
}
