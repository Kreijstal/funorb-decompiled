/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static int field_e;
    byte[] payload;
    int position;
    static String field_f;

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(var5, var4_int, -110, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.c(var8.length, 89);
          if (param0 > -125) {
            this.position = 9;
          }
          this.b(var8, var8.length, -2, 0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gk.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != -49152) {
          this.position = 61;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final int h(int param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 >= ~var2) {
          return -49152 + this.readUnsignedShort(17277);
        }
        return this.readUnsignedByte((byte) 114) - 64;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.position = this.position + ob.a(-124, var5, this.payload, 0, this.position, param1.length());
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          int var4 = 31 % ((param0 + 20) / 49);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gk.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int readUnsignedShort(int obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard != 17277) {
          this.a(false, -27);
        }
        return (this.payload[this.position - 2] << 8 & 65280) + (this.payload[-1 + this.position] & 255);
    }

    final void a(int param0, int param1, int param2, int[] param3) {
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
        byte[] var14 = null;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param0;
          var6 = (param1 - param0) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (param2 >= -54) {
                var14 = (byte[]) null;
                this.b((byte[]) null, -80, -100, 89);
              }
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(-122);
            var9 = this.readInt(127);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[(7088 & var10) >>> 11] ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ param3[3 & var10] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a(-803539344, var8);
            this.a(-803539344, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 < 64 &&
          -64 <= param0) {
          this.b(64 + param0, -49152);
          return;
        }
        if (param1) {
          this.position = -125;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.c(param0 + 49152, 90);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int o(int param0) {
        if (param0 != -1) {
          this.b(47, 64);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.readUnsignedByte((byte) 114);
        }
        return -32768 + this.readUnsignedShort(17277);
    }

    final int a(byte param0, int param1) {
        if (param0 >= -37) {
          return -68;
        }
        int var3 = rc.a(param1, this.position, 70, this.payload);
        this.a(-803539344, var3);
        return var3;
    }

    final void a(int param0, int param1) {
        if (param0 != -803539344) {
          field_e = -116;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final int m(int param0) {
        if (param0 != -25141) {
          this.a(-90, 72);
        }
        if (0 > this.payload[this.position]) {
          return this.readInt(127) & 2147483647;
        }
        return this.readUnsignedShort(17277);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != 5699) {
          this.readUnsignedShort(36);
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != -1268490168) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    final void a(int param0, int[] param1) {
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
        java.awt.Canvas var11 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param0 != 30350) {
            var11 = (java.awt.Canvas) null;
            PacketBuffer.a((java.awt.Canvas) null, 50, true);
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt(126);
            var6 = this.readInt(126);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (var7 + param1[3 & var7] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ param1[(8160 & var7) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a(-803539344, var5);
            this.a(-803539344, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 <= 58) {
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 > -85) {
            return;
          }
          for (var5_int = param3; var5_int < param1 + param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gk.DA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 != -2) {
            this.payload = (byte[]) null;
          }
          for (var5_int = param3; param3 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gk.P(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (mc.field_a >= 10) {
            if (!ub.b(true)) {
              ge.d();
              nj.a(-21639, 320, 240);
              oh.a(0, (byte) 76, 0, param0);
            } else {
              if (k.field_g != 0) {
                qi.a(param0, (byte) -114);
              } else {
                cc.a(192, false, param2);
                oh.a(0, (byte) 15, 0, param0);
              }
            }
          } else {
            var3_int = 0;
            if (gb.field_j) {
              var3_int = 1;
              gb.field_j = false;
            }
            m.a(dj.a((byte) 125), ch.field_i, rb.c((byte) 86), var3_int != 0, -3);
          }
          var3_intLifetime1 = -27 % ((-35 - param1) / 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("gk.O(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void e(int param0, int param1) {
        int var3 = 127 % ((param0 + 12) / 58);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + ob.a(-80, var5, this.payload, 0, this.position, param0.length());
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
          int var4 = -50 % ((39 - param1) / 63);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gk.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -66 / ((param1 + 43) / 54);
        this.payload[-1 + (-param0 + this.position)] = (byte)param0;
    }

    final void d(int param0, int param1) {
        this.payload[-param1 + (this.position - 2)] = (byte)(param1 >> 8);
        this.payload[-1 + (this.position - param1)] = (byte)param1;
        if (param0 != 6903) {
          PacketBuffer.a(111);
        }
    }

    public static void n(int param0) {
        if (param0 >= -73) {
          field_f = (String) null;
        }
        field_f = null;
    }

    final byte readByte(int obfuscationGuard) {
        int var2 = -81 % ((-22 - obfuscationGuard) / 44);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final int readUnsignedByte(byte obfuscationGuard) {
        if (obfuscationGuard != 114) {
          this.m(101);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final long readLong(int obfuscationGuard) {
        if (obfuscationGuard <= 2) {
          return 77L;
        }
        long var2 = (long)this.readInt(127) & 4294967295L;
        long var4 = (long)this.readInt(126) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final int readInt(int obfuscationGuard) {
        this.position = this.position + 4;
        int var2 = -12 / ((73 - obfuscationGuard) / 53);
        return (255 & this.payload[this.position - 1]) + ((this.payload[-3 + this.position] & 255) << 16) + ((-16777216 & this.payload[-4 + this.position] << 24) + ((255 & this.payload[this.position - 2]) << 8));
    }

    final int readUnsignedMedium(byte obfuscationGuard) {
        this.position = this.position + 3;
        int var2 = 21 % ((obfuscationGuard + 81) / 39);
        return (this.payload[-1 + this.position] & 255) + ((255 & this.payload[this.position - 3]) << 16) + (this.payload[this.position - 2] << 8 & 65280);
    }

    final String f(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -var2 + (this.position - 1);
        if (param0 == ~var3) {
          return "";
        }
        return sc.a(this.payload, var3, 122, var2);
    }

    final void a(String param0, byte param1) {
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          if (param1 < 15) {
            field_f = (String) null;
          }
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + (var9 - 65));
              } else {
                if (97 <= var9 &&
                  122 >= var9) {
                  var3_long = var3_long + (long)(var9 - 95);
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
          this.a(5699, var3_long);
          this.a(5699, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("gk.JA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean l(int param0) {
        if (param0 != -24685) {
          return true;
        }
        this.position = this.position - 4;
        int var2 = rc.a(0, this.position, 96, this.payload);
        int var3 = this.readInt(-125);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final String g(int param0) {
        if (param0 != -1185292952) {
          return (String) null;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.f(-1);
    }

    final void a(long param0, byte param1) {
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
        int var4 = 34 % ((param1 + 62) / 38);
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
    }

    final String b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        if (param0 < 90) {
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
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -var3 + (this.position - 1);
        if (var4 == 0) {
          return "";
        }
        return sc.a(this.payload, var4, -54, var3);
    }

    PacketBuffer(int capacity) {
        this.position = 0;
        this.payload = nj.a(0, capacity);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        java.awt.Canvas var5;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        while (param1 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (!param0) {
          var5 = (java.awt.Canvas) null;
          PacketBuffer.a((java.awt.Canvas) null, -43, true);
        }
    }

    PacketBuffer(byte[] payload) {
        try {
          this.position = 0;
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (payload != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != -1) {
          field_e = -5;
        }
        if (ol.field_g != null) {
          ol.field_g.a((byte) 73);
          ol.field_g = null;
        }
    }

    static {
        field_e = -1;
        field_f = "Loading levels";
    }
}
