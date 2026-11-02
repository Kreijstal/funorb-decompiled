/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static int field_n;
    static String[] field_o;
    int position;
    static String field_l;
    static ResourceArchive field_p;
    byte[] payload;

    final int j(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 127) {
          return 3;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (127 & var2 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 > -71) {
            var7 = (String) null;
            this.b((byte) -93, (String) null);
          }
          for (var5_int = param1; param1 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("we.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeShort(int obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
        if (obfuscationGuard != 1276387944) {
          field_l = (String) null;
        }
    }

    final void b(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        if (param0 != -41) {
          return;
        }
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + cl.a(this.position, this.payload, param1.length(), var4, 0, param0 ^ 21784);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "we.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeLong(boolean obfuscationGuard, long value) {
        if (obfuscationGuard) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(value >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(value >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(value >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(value >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)value;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int var4 = 93 % ((param1 - 34) / 46);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 < 24) {
          String var5 = (String) null;
          this.a(-15, (String) null);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
    }

    final int readUnsignedMedium(byte obfuscationGuard) {
        this.position = this.position + 3;
        if (obfuscationGuard != 13) {
          return 125;
        }
        return (16711680 & this.payload[-3 + this.position] << 16) + (65280 & this.payload[this.position - 2] << 8) + (this.payload[-1 + this.position] & 255);
    }

    final void a(int param0, boolean param1) {
        this.payload[-4 + (-param0 + this.position)] = (byte)(param0 >> 24);
        this.payload[this.position - param0 - 3] = (byte)(param0 >> 16);
        this.payload[-2 + this.position - param0] = (byte)(param0 >> 8);
        this.payload[this.position + (-param0 - 1)] = (byte)param0;
        if (param1) {
          field_o = (String[]) null;
        }
    }

    final int l(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 != -20729) {
          this.position = -103;
        }
        if (var2 >= 128) {
          return -49152 + this.a((byte) -118);
        }
        return -64 + this.f(255);
    }

    final void c(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (!param1) {
          field_p = (ResourceArchive) null;
        }
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = param2;
          var5 = new byte[var4_int];
          this.a(var5, 0, -75, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(1276387944, var8.length);
          this.a(var8.length, 0, param2 - 3493, var8);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "we.S(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_o = null;
        field_p = null;
        field_l = null;
        if (param0 < 103) {
          PacketBuffer.b(true);
        }
    }

    final void writeByte(int obfuscationGuard, int value) {
        if (obfuscationGuard != 160) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)value;
    }

    final void a(byte param0, int param1) {
        if (param1 >= 0 &&
          param1 < 128) {
          this.writeByte(160, param1);
          return;
        }
        if (0 <= param1 &&
          param1 < 32768) {
          this.writeShort(1276387944, 32768 + param1);
          return;
        }
        if (param0 < 67) {
          this.payload = (byte[]) null;
        }
        throw new IllegalArgumentException();
    }

    final int readInt(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return 32;
        }
        this.position = this.position + 4;
        return (this.payload[this.position - 4] << 24 & -16777216) + ((this.payload[this.position - 3] & 255) << 16) - (-((255 & this.payload[this.position - 2]) << 8) - (this.payload[-1 + this.position] & 255));
    }

    final int b(int param0, byte param1) {
        int var3 = da.a(this.payload, (byte) 122, param0, this.position);
        if (param1 <= 27) {
          field_p = (ResourceArchive) null;
        }
        this.d(var3, -104);
        return var3;
    }

    final String e(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        if (param0 <= 70) {
          return (String) null;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var4 = -var3 + (this.position - 1);
        if (var4 == 0) {
          return "";
        }
        return ui.a(true, this.payload, var3, var4);
    }

    final boolean d(byte param0) {
        this.position = this.position - 4;
        int var2 = da.a(this.payload, (byte) 117, 0, this.position);
        int var3 = this.readInt(param0 ^ 124);
        if (param0 != 124) {
          return false;
        }
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final long a(boolean param0) {
        long var2 = (long)this.readInt(0) & 4294967295L;
        if (param0) {
          this.e((byte) 9);
        }
        long var4 = (long)this.readInt(0) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        CharSequence stackIn_25_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        if (param2 == null) {
          return false;
        }
        try {
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = dh.a(param2, (byte) 58);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ii.a((byte) 123, var4.charAt(0)) &&
              !ii.a((byte) 124, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              var6 = 0;
              if (param1 != 5832) {
                return false;
              }
              stackIn_25_0 = (CharSequence) (param2);
              while (((CharSequence) (Object) stackIn_25_0).length() > var6) {
                var7 = param2.charAt(var6);
                if (!ii.a((byte) 119, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
                var6++;
                stackIn_25_0 = (CharSequence) (param2);
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("we.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final int g(int param0) {
        if (param0 != 21231) {
          return 53;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return this.f(255);
        }
        return -32768 + this.a((byte) -114);
    }

    final void a(int param0, String param1) {
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
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 != -129) {
            this.a(-61);
          }
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-63 + var9);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-97 + (2 + var9));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(var9 + 28 - 48);
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
          this.a((byte) 112, var3_long);
          this.a((byte) 102, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("we.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != 255) {
          this.l(-57);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final int a(byte param0) {
        int var2 = 43 % ((param0 + 63) / 48);
        this.position = this.position + 2;
        return ((255 & this.payload[this.position - 2]) << 8) + (this.payload[-1 + this.position] & 255);
    }

    final String h(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + (-var2 + this.position);
        if (param0 != 5) {
          return (String) null;
        }
        if (var3 == 0) {
          return "";
        }
        return ui.a(true, this.payload, var2, var3);
    }

    final void a(boolean param0, int[] param1) {
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
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (!param0) {
            return;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt(0);
            var6 = this.readInt(0);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ param1[(var7 & 8088) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var5, -70);
            this.d(var6, -113);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("we.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final byte a(int param0) {
        if (param0 != 0) {
          this.writeShort(105, -119);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final static void b(boolean param0) {
        wg.field_b = SoftwareRasterizer.field_d;
        ni.field_q = SoftwareRasterizer.field_j;
        c.m(21);
        cl.field_g.a(ql.field_n.field_K, -2 + (-40 + ql.field_n.field_nb), 0, 0, 5);
        gk.field_lb.a(0, fq.field_q, 0, 256, vd.field_c.field_K);
        int var1 = 2 + fq.field_q;
        oc.field_O.a(!f.field_n ? 0 : var1, vd.field_c.field_nb - (!f.field_n ? 0 : var1), 0, 256, vd.field_c.field_K);
        mi.b(param0);
        gk.field_cb.a(-40 + ql.field_n.field_nb, 40, 0, 256, ql.field_n.field_K);
        sd.field_P.a(0, 30, 0, 256, MidiPcmStream.field_E.field_K);
        DiskCacheWorker.field_a.a(30, -70 + MidiPcmStream.field_E.field_nb - 2, 0, 256, MidiPcmStream.field_E.field_K);
        wc.field_n.a(5, 30, 5, 256, 68);
        IsaacRandom.field_b.a(5, 30, 75, 256, 78);
        on.field_pb.a(5, 30, 155, 256, 48);
        be.field_P.a(5, 30, 205, 256, 48);
        int var2 = f.field_n ? 250 : 200;
        g.field_o.a(5, 30, var2 + 5, 256, 363 - var2);
        SocketJs5Transport.field_t.a(5, 30, 370, 256, -375 + MidiPcmStream.field_E.field_K);
        aj.field_k.a(5, 2, (byte) 52, -5 + DiskCacheWorker.field_a.field_K - 5, 37, -10 + DiskCacheWorker.field_a.field_nb - 32, DelegatingCanvas.field_b);
        int var3 = (2 + MidiPcmStream.field_E.field_K) / 2;
        lg.field_c.a(-40 + MidiPcmStream.field_E.field_nb, 40, 0, 256, var3 - 2);
        if (!f.field_n) {
          var3 = 0;
        }
        MusicPatchNode.field_p.a(-40 + MidiPcmStream.field_E.field_nb, 40, var3, 256, -var3 + MidiPcmStream.field_E.field_K);
    }

    final void a(int param0, int param1) {
        if (64 > param0 &&
          param0 >= -64) {
          this.writeByte(160, 64 + param0);
          return;
        }
        if (param1 != -14596) {
          return;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.writeShort(1276387944, 49152 + param0);
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
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param2;
          var6 = (param3 - param2) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              if (param1 != 19324) {
                field_p = (ResourceArchive) null;
              }
              return;
            }
            var8 = this.readInt(0);
            var9 = this.readInt(param1 - 19324);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - (var10 + param0[(var10 & 7807) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param0[3 & var10]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var8, -111);
            this.d(var9, param1 ^ -19202);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("we.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String e(byte param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 <= 5) {
          field_n = 56;
        }
        return this.h(5);
    }

    final void b(int param0, boolean param1) {
        if ((param0 & -128) != 0) {
          if ((-16384 & param0) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((-268435456 & param0) != 0) {
                this.writeByte(160, param0 >>> 28 | 128);
              }
              this.writeByte(160, param0 >>> 21 | 128);
            }
            this.writeByte(160, (2108687 | param0) >>> 14);
          }
          this.writeByte(160, (param0 | 16435) >>> 7);
        }
        if (!param1) {
          field_l = (String) null;
        }
        this.writeByte(160, 127 & param0);
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 >= -32) {
          field_n = 84;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
    }

    final static String b(long param0, int param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (0L == param0 % 37L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (0L != var4) {
          var4 = var4 / 37L;
          var3++;
        }
        var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = CachedArchiveProvider.field_h[(int)(var7 - param0 * 37L)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param1 != -7067) {
          return (String) null;
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != -66) {
            field_l = (String) null;
          }
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + cl.a(this.position, this.payload, param1.length(), var4, 0, -21809);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "we.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 != 109) {
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
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
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = param1;
          if (param2 != -3493) {
            field_l = (String) null;
          }
          while (param1 + param0 > var5_int) {
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
          stackIn_8_1 = new StringBuilder().append("we.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        this.payload[-param1 + (this.position - 2)] = (byte)(param1 >> 8);
        this.payload[this.position - (param1 + 1)] = (byte)param1;
        if (param0 != 7519) {
          this.position = -59;
        }
    }

    PacketBuffer(int param0) {
        this.payload = fd.a(-5001, param0);
        this.position = 0;
    }

    final void f(int param0, int param1) {
        this.payload[param1 + (-param0 + this.position)] = (byte)param0;
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int i(int param0) {
        if (param0 != 9997) {
          this.h(-58);
        }
        if (this.payload[this.position] >= 0) {
          return this.a((byte) 76);
        }
        return 2147483647 & this.readInt(0);
    }

    static {
        field_l = "The '<%0>' setting needs to be changed.";
    }
}
