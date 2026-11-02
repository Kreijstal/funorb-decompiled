/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static boolean field_l;
    static int field_m;
    int position;
    byte[] payload;
    static int[] field_o;
    static int field_k;

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
        if (param0 != 90) {
          String var4 = (String) null;
          this.a((byte) -79, (String) null);
        }
    }

    final int i(int param0) {
        if (param0 != 7088) {
          this.position = 48;
        }
        this.position = this.position + 2;
        return ((this.payload[this.position - 2] & 255) << 8) + (255 & this.payload[this.position - 1]);
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
        if (param1 < 44) {
          field_o = (int[]) null;
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        if (param0 >= -92) {
          field_m = -7;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final long b(int param0) {
        long var2 = (long)this.c((byte) -90) & 4294967295L;
        long var4 = (long)this.c((byte) -64) & 4294967295L;
        if (param0 <= 4) {
          this.position = -98;
        }
        return (var2 << 32) + var4;
    }

    final void b(byte param0, String param1) {
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        int var3_int = param1.indexOf('\0');
        if (param0 != 4) {
          return;
        }
        try {
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + ni.a(this.position, var4, 0, -12421, this.payload, param1.length());
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        if (param0 > -108) {
          this.position = -67;
        }
        int var2 = this.payload[this.position] & 255;
        if (128 > var2) {
          return this.i((byte) -101);
        }
        return -32768 + this.i(7088);
    }

    final String h(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 <= 112) {
          return (String) null;
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + (-var2 + this.position);
        if (0 == var3) {
          return "";
        }
        return GameApplet.a(var3, true, var2, this.payload);
    }

    final boolean h(int param0) {
        this.position = this.position - 4;
        int var2 = nn.a(7655, this.payload, 0, this.position);
        if (param0 != -31017) {
          return true;
        }
        int var3 = this.c((byte) -50);
        if (var3 != var2) {
          return false;
        }
        return true;
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
          this.a(48, var4_int, var5, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          if (param2 != -64) {
            this.position = -46;
          }
          var8 = var7.toByteArray();
          this.position = 0;
          this.a(var8.length, 73);
          this.a(var8.length, 0, var8, (byte) -101);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fj.WA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte f(byte param0) {
        if (param0 < 17) {
          field_l = false;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 != 60) {
          this.e((byte) 43);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final int g(int param0) {
        this.position = this.position + 2;
        int var2 = (65280 & this.payload[-2 + this.position] << 8) + (this.payload[this.position - 1] & 255);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        if (param0 != 65536) {
          field_k = 115;
        }
        return var2;
    }

    final String d(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        if (param0 != -7519) {
          this.d(56);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var4 = -var3 + this.position - 1;
        if (var4 != 0) {
          return GameApplet.a(var4, true, var3, this.payload);
        }
        return "";
    }

    final void a(byte param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = -66 / ((9 - param0) / 57);
          var8 = param1.length();
          for (var9 = 19; var9 >= 0; var9--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var8 > var9) {
              var10 = param1.charAt(var9);
              if (var10 >= 65 &&
                90 >= var10) {
                var3_long = var3_long + (long)(-65 + (var10 + 2));
              } else if (var10 >= 97 &&
                var10 <= 122) {
                var3_long = var3_long + (long)(-97 + (var10 + 2));
              } else if (var10 >= 48 &&
                57 >= var10) {
                var3_long = var3_long + (long)(28 + var10 - 48);
              } else {
                var3_long = var3_long + 1L;
              }
              decompiledFrameRemainder0 = (var9 == 10);
            } else {
              decompiledFrameRemainder0 = (var9 == 10);
            }
            if (decompiledFrameRemainder0) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a(var3_long, -1731457392);
          this.a(var5, -1731457392);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("fj.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 <= this.payload[this.position]) {
          return this.i(param0 ^ 7088);
        }
        return this.c((byte) -116) & 2147483647;
    }

    final int i(byte param0) {
        if (param0 != -101) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final int g(byte param0) {
        if (param0 >= -114) {
          this.b(-105);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return -64 + this.i((byte) -101);
        }
        return -49152 + this.i(7088);
    }

    final void b(long param0, int param1) {
        if (param1 != -19642) {
          return;
        }
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
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        try {
          if (param3 >= -35) {
            return;
          }
          for (var5_int = param1; var5_int < param0 + param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fj.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
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
        var6 = Torquing.field_u;
        try {
          if (param0 != 48) {
            return;
          }
          for (var5_int = param3; param3 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fj.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0, int param1) {
        this.payload[-param1 + this.position - 1] = (byte)param1;
        if (param0 != 48) {
          this.b((byte) -107, -29);
        }
    }

    PacketBuffer(int param0) {
        this.payload = mg.a(-95, param0);
        this.position = 0;
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int var4 = 4 % ((-37 - param0) / 53);
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

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Torquing.field_u;
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 < 87) {
          this.b((byte) 84, 64);
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
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
        var13 = Torquing.field_u;
        try {
          var5_int = this.position;
          if (param3 != 29269) {
            field_k = 91;
          }
          this.position = param0;
          var6 = (-param0 + param2) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.c((byte) -91);
            var9 = this.c((byte) -38);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param1[(var10 & 7088) >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ param1[3 & var10] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.b((byte) 60, var8);
            this.b((byte) 60, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fj.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != 19) {
          return (String) null;
        }
        return this.h((byte) 124);
    }

    public static void d(byte param0) {
        int var1 = 77 % ((param0 + 27) / 46);
        field_o = null;
    }

    final void c(int param0, int param1) {
        this.payload[this.position + (-param0 - 2)] = (byte)(param0 >> 8);
        this.payload[-1 + this.position - param0] = (byte)param0;
        if (param1 != 400369768) {
          this.position = 25;
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (param1 != -72) {
            field_l = false;
          }
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + ni.a(this.position, var4, 0, param1 ^ 12483, this.payload, param0.length());
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fj.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        var10 = Torquing.field_u;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              if (param0 != 5479) {
                this.payload = (byte[]) null;
              }
              return;
            }
            var5 = this.c((byte) -115);
            var6 = this.c((byte) -111);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (param1[var7 & 3] + var7 ^ (var6 << 4 ^ var6 >>> 5) + var6);
                var7 = var7 + var8;
                var6 = var6 + (param1[-182452221 & var7 >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.b((byte) 60, var5);
            this.b((byte) 60, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fj.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
          field_l = false;
        }
        int var3 = nn.a(7655, this.payload, param0, this.position);
        this.b((byte) 60, var3);
        return var3;
    }

    final int c(byte param0) {
        this.position = this.position + 4;
        if (param0 >= -32) {
          return 65;
        }
        return ((255 & this.payload[this.position - 2]) << 8) + ((-16777216 & this.payload[this.position - 4] << 24) + (this.payload[-3 + this.position] << 16 & 16711680)) + (this.payload[this.position - 1] & 255);
    }

    final void a(int param0, byte param1) {
        if (param0 < 64 &&
          -64 <= param0) {
          this.b(90, 64 + param0);
          return;
        }
        if (param0 < 16384 &&
          -16384 <= param0) {
          this.a(param0 + 49152, 96);
          return;
        }
        if (param1 != 106) {
          return;
        }
        throw new IllegalArgumentException();
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
        if (param1 != -1731457392) {
          this.d(65);
        }
    }

    final int e(byte param0) {
        this.position = this.position + 3;
        if (param0 != 62) {
          field_o = (int[]) null;
        }
        return (255 & this.payload[this.position - 1]) + ((this.payload[this.position - 3] << 16 & 16711680) + ((this.payload[-2 + this.position] & 255) << 8));
    }

    static {
        field_m = 10;
    }
}
