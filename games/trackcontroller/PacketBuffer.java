/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static nh field_m;
    static String field_l;
    byte[] payload;
    static int field_i;
    int position;

    final void writeLong(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param0;
        if (param1 != 2147483647) {
          byte[] var5 = (byte[]) null;
          this.a(30, 103, 56, (byte[]) null);
        }
    }

    final long readLong(byte param0) {
        if (param0 < 20) {
          this.position = -112;
        }
        long var2 = 4294967295L & (long)this.readInt((byte) 113);
        long var4 = 4294967295L & (long)this.readInt((byte) 113);
        return (var2 << 32) + var4;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 != -3869) {
          return;
        }
        while (this.position < param1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = cl.a(1, this.position, param0, this.payload);
        this.writeInt(param1, var3);
        return var3;
    }

    final void writeString(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (param0 != -57) {
            String var4 = (String) null;
            this.a((String) null, 6);
          }
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.position = this.position + sg.a(this.position, var5, this.payload, 87, 0, param1.length());
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "be.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int readSmart(int param0) {
        if (param0 != -1) {
          return -116;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -73) - 32768;
        }
        return this.readUnsignedByte(16383);
    }

    final void writeByte(int param0, byte param1) {
        if (param1 >= -58) {
          this.position = -79;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    public static void i(int param0) {
        field_m = null;
        field_l = null;
        if (param0 != 3) {
          PacketBuffer.i(33);
        }
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 != 22) {
          return (String) null;
        }
        return param2 + "/" + param1;
    }

    final int readUnsignedByte(int param0) {
        if (param0 != 16383) {
          return -75;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final void a(String param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var3_long = 0L;
          if (param1 != 27933) {
            field_i = 79;
          }
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + var9 - 65);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-95 + var9);
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + (var9 + 28));
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
          this.a(var3_long, (byte) -109);
          this.a(var5, (byte) -44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("be.Q(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readUnsignedShort(byte param0) {
        if (param0 >= -40) {
          PacketBuffer.i(45);
        }
        this.position = this.position + 2;
        return (65280 & this.payload[this.position - 2] << 8) + (255 & this.payload[this.position - 1]);
    }

    private final void a(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 48);
        if (param1 > -38) {
          this.a((byte) 5, -61);
        }
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
    }

    final static int d(byte param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            var2 += 16;
            param1 = param1 >> 16;
          }
          if (255 < param1) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 > 3) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            var2++;
            param1 = param1 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param1 < -65536) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param0 != -98) {
          field_m = (nh) null;
        }
        if (param1 < -16) {
          var2Lifetime1 += 4;
          param1 = param1 >> 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final String readOptionalString(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != 19016) {
          field_m = (nh) null;
        }
        return this.readString(0);
    }

    final void rsaEncrypt(java.math.BigInteger param0, java.math.BigInteger param1, boolean param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          if (param2) {
            field_m = (nh) null;
          }
          var5 = new byte[var4_int];
          this.a(111, var5, 0, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.b(var8.length, (byte) -120);
          this.a(var8.length, 118, 0, var8);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "be.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte readByte(int param0) {
        if (param0 > -124) {
          this.a(-51, false);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 <= 60) {
            field_l = (String) null;
          }
          for (var5_int = param2; var5_int < param2 + param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("be.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0, byte param1) {
        if (param1 != -96) {
          field_i = 62;
        }
        this.payload[-2 + (this.position - param0)] = (byte)(param0 >> 8);
        this.payload[this.position - param0 - 1] = (byte)param0;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          field_l = (String) null;
        }
        this.payload[this.position - (param1 + 1)] = (byte)param1;
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + (-var2 + this.position);
        if (var3 != param0) {
          return ka.a(var2, param0 ^ -129, this.payload, var3);
        }
        return "";
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
        if (param1 >= -117) {
          field_i = -55;
        }
    }

    final static java.awt.Container c(byte param0) {
        if (param0 > -105) {
          PacketBuffer.a((byte) -126, -44, 61);
        }
        if (null != ii.field_s) {
          return (java.awt.Container) ((Object) ii.field_s);
        }
        return (java.awt.Container) ((Object) CachedArchiveSource.b((byte) 77));
    }

    final void c(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != -38) {
          this.position = -75;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final void xteaEncrypt(int param0, int[] param1) {
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
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              if (param0 != 29715) {
                this.position = -77;
              }
              return;
            }
            var5 = this.readInt((byte) 113);
            var6 = this.readInt((byte) 113);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + param1[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param1[var7 >>> 11 & 796917763]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(false, var5);
            this.writeInt(false, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("be.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean checkCrcTrailer(boolean param0) {
        this.position = this.position - 4;
        if (param0) {
          field_i = 73;
        }
        int var2 = cl.a(1, this.position, 0, this.payload);
        int var3 = this.readInt((byte) 113);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (param1 <= 105) {
            this.position = 63;
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + sg.a(this.position, var4, this.payload, 70, 0, param0.length());
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "be.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String j(int param0) {
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
        var4 = this.position - var3 + param0;
        if (var4 == 0) {
          return "";
        }
        return ka.a(var3, param0 - 128, this.payload, var4);
    }

    final void b(byte param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((-16384 & param1) != 0) {
            if ((param1 & -2097152) != 0) {
              if (0 != (param1 & -268435456)) {
                this.writeByte(param1 >>> 28 | 128, (byte) -74);
              }
              this.writeByte(128 | param1 >>> 21, (byte) -121);
            }
            this.writeByte((param1 | 2098045) >>> 14, (byte) -106);
          }
          this.writeByte(param1 >>> 7 | 128, (byte) -69);
        }
        if (param0 > -77) {
          return;
        }
        this.writeByte(param1 & 127, (byte) -104);
    }

    final static void a(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        Model var4_ref_pf = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Model var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TrackController.field_F ? 1 : 0;
        try {
          ke.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ef.field_a.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_pf = ef.field_a[var3];
            var4_ref_pf.b(14702);
            MouseWheelInput.a((byte) -103, var3);
            var5 = var4_ref_pf.field_i + var4_ref_pf.field_u >> 1;
            var6 = var4_ref_pf.field_n + var4_ref_pf.field_p >> 1;
            var7 = var4_ref_pf.field_k + var4_ref_pf.field_w >> 1;
            var8 = ke.field_a[9] >> 2;
            var9 = ke.field_a[10] >> 2;
            var10_int = ke.field_a[11] >> 2;
            var11 = var10_int * ba.field_a[5] + (ba.field_a[4] * var9 + ba.field_a[3] * var8) >> 14;
            var12 = var10_int * ba.field_a[8] + (ba.field_a[7] * var9 + var8 * ba.field_a[6]) >> 14;
            var13 = ba.field_a[10] * var9 + ba.field_a[9] * var8 + var10_int * ba.field_a[11] >> 14;
            var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
          }
          var3Lifetime1 = ke.field_a[9] >> 8;
          var4 = ke.field_a[10] >> 8;
          var5Lifetime1 = ke.field_a[11] >> 8;
          var6Lifetime1 = fb.field_a << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = va.a(var6Lifetime1, (byte) -47) >> 8;
          var9Lifetime1 = mi.a(2048, var6Lifetime1) >> 8;
          if (kf.mouseX != -1 &&
            -1 != fg.mouseY) {
            var9Lifetime1 = -128;
            var8Lifetime1 = -fg.mouseY + 240;
            var7Lifetime1 = kf.mouseX - 320;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          if (param0 >= -77) {
            return;
          }
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; ef.field_a.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; ef.field_a.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = ef.field_a[var16];
            MouseWheelInput.a((byte) -107, var16);
            for (var18 = 0; var18 < 3; var18++) {
              ba.field_a[var18] = ba.field_a[var18] + kc.field_c[var15][var18];
            }
            oj.a(9, true, false, var17, ba.field_a, ke.field_a, false);
            qi.a(var13Lifetime1, var7Lifetime1, (byte) 3, var9Lifetime1, var14, var8Lifetime1, var12Lifetime1, var17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var1), "be.E(" + param0 + ')');
        }
    }

    final void writeInt(boolean param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0) {
          this.writeInt(false, -47);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final void a(int param0, int[] param1, int param2, boolean param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
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
        var13 = TrackController.field_F ? 1 : 0;
        try {
          if (param3) {
            return;
          }
          var5_int = this.position;
          this.position = param0;
          var6 = (param2 - param0) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) 113);
            var9 = this.readInt((byte) 113);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + param1[(6387 & var10) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + param1[var10 & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(false, var8);
            this.writeInt(false, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("be.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int e(int param0) {
        this.position = this.position + 3;
        if (param0 != 8) {
          return 67;
        }
        return ((255 & this.payload[-2 + this.position]) << 8) + ((this.payload[-3 + this.position] & 255) << 16) + (this.payload[this.position - 1] & 255);
    }

    final void a(int param0, long param1) {
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
        if (param0 != 2488) {
          java.math.BigInteger var5 = (java.math.BigInteger) null;
          this.rsaEncrypt((java.math.BigInteger) null, (java.math.BigInteger) null, false);
        }
    }

    final int k(int param0) {
        if (param0 < 116) {
          return -44;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -41) - 49152;
        }
        return this.readUnsignedByte(16383) - 64;
    }

    final int c(boolean param0) {
        if (param0) {
          this.writeLong(92L, -49);
        }
        if (this.payload[this.position] < 0) {
          return 2147483647 & this.readInt((byte) 113);
        }
        return this.readUnsignedShort((byte) -47);
    }

    final int m(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (param0 != 127) {
          field_l = (String) null;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = param2;
          if (param1 <= 72) {
            return;
          }
          while (var5_int < param2 + param0) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("be.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        int var3 = -49 % ((param0 - 40) / 60);
        this.payload[-4 + (-param1 + this.position)] = (byte)(param1 >> 24);
        this.payload[-3 + this.position - param1] = (byte)(param1 >> 16);
        this.payload[this.position - (param1 + 2)] = (byte)(param1 >> 8);
        this.payload[-1 - param1 + this.position] = (byte)param1;
    }

    final int readInt(byte param0) {
        this.position = this.position + 4;
        if (param0 != 113) {
          this.a(-36, -22L);
        }
        return (255 & this.payload[this.position - 1]) + (this.payload[-2 + this.position] << 8 & 65280) + (((255 & this.payload[this.position - 4]) << 24) + ((255 & this.payload[this.position - 3]) << 16));
    }

    PacketBuffer(int param0) {
        this.payload = ke.b(param0, -30001);
        this.position = 0;
    }

    final void b(int param0, int param1) {
        if (64 > param1 &&
          param1 >= -64) {
          this.writeByte(64 + param1, (byte) -98);
          return;
        }
        if (param0 != 16) {
          field_l = (String) null;
        }
        if (16384 > param1 &&
          param1 >= -16384) {
          this.b(49152 + param1, (byte) -122);
          return;
        }
        throw new IllegalArgumentException();
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "You have <%0> unread messages!";
        field_m = new nh(0);
        field_i = 0;
    }
}
