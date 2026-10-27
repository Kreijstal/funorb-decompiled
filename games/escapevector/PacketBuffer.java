/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static Sprite field_l;
    static String field_j;
    static boolean field_h;
    byte[] payload;
    static volatile boolean field_i;
    static String field_k;
    int position;

    final int readUnsignedSmart(boolean guard) {
        if (!guard) {
          return 48;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return this.readUnsignedShort(1952) - 32768;
        }
        return this.readUnsignedByte(0);
    }

    final void a(byte param0, String param1) {
        int var3_int = param1.indexOf('\0');
        if (0 <= var3_int) {
          throw new IllegalArgumentException("");
        }
        if (param0 != 100) {
          return;
        }
        try {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          CharSequence var4 = (CharSequence) ((Object) param1);
          this.position = this.position + dg.a(param1.length(), this.position, 19409, var4, this.payload, 0);
          int fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "n.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final static boolean b(boolean param0, CharSequence param1, int param2) {
        String stackIn_39_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param1 == null) {
            return false;
          }
          int var3_int = param1.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            String var4 = sf.a(-93, param1);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!fd.a(true, var4.charAt(0)) &&
              !fd.a(true, var4.charAt(var4.length() - 1))) {
              int var5 = 0;
              for (int var6 = 0; var6 < param1.length(); var6++) {
                int var7 = param1.charAt(var6);
                if (fd.a(true, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (param2 <= 107) {
                field_j = (String) null;
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
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_38_0 = var3;
          StringBuilder stackIn_38_1 = new StringBuilder().append("n.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final int readUnsignedMedium(byte guard) {
        this.position = this.position + 3;
        if (guard >= -106) {
          this.f(100, 114);
        }
        return (this.payload[-1 + this.position] & 255) + (((255 & this.payload[this.position - 3]) << 16) + (65280 & this.payload[this.position - 2] << 8));
    }

    final void a(String param0, int param1) {
        int var3_int = param0.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        if (param1 < 76) {
          return;
        }
        try {
          CharSequence var4 = (CharSequence) ((Object) param0);
          this.position = this.position + dg.a(param0.length(), this.position, 19409, var4, this.payload, 0);
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "n.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        String stackIn_14_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = this.position;
          this.position = param0;
          if (param3 != 6528) {
            this.position = -116;
          }
          int var6 = (param2 - param0) / 8;
          int var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            int var8 = this.readInt(-5053);
            int var9 = this.readInt(-5053);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (true) {
              int incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param1[(var10 & 6528) >>> 11] ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var10 + param1[var10 & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a((byte) 125, var8);
            this.a((byte) 124, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("n.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0, int param1) {
        if (param1 >= -6) {
          field_l = (Sprite) null;
        }
        int var3 = ae.a(this.payload, (byte) -72, this.position, param0);
        this.a((byte) 126, var3);
        return var3;
    }

    final int readUnsignedShort(int guard) {
        this.position = this.position + 2;
        if (guard != 1952) {
          return -10;
        }
        return (255 & this.payload[-1 + this.position]) + (this.payload[-2 + this.position] << 8 & 65280);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != 1743120456) {
          field_j = (String) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final int j(int param0) {
        if (param0 != 2147483647) {
          field_i = false;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(param0 ^ 2147481695);
        }
        return this.readInt(-5053) & 2147483647;
    }

    final void g(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (param0 != -1) {
          field_h = false;
        }
        while (param1 > this.position) {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != 70) {
          PacketBuffer.a((byte) -107);
        }
        field_k = null;
    }

    final void e(int param0, int param1) {
        int var3 = -125 % ((33 - param0) / 40);
        this.payload[-1 - param1 + this.position] = (byte)param1;
    }

    final String c(boolean param0) {
        int fieldTemp$0 = 0;
        if (param0) {
          this.readInt(101);
        }
        int var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        int var3 = this.position - var2 - 1;
        if (var3 != 0) {
          return qi.a(var3, var2, this.payload, (byte) 20);
        }
        return "";
    }

    final String d(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != -15208) {
          this.d(-18, -7);
        }
        return this.c(false);
    }

    final void a(int param0, int[] param1) {
        String stackIn_13_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var3_int = this.position / 8;
          this.position = 0;
          if (param0 != 1527987844) {
            String var11 = (String) null;
            this.a((byte) 105, (String) null);
          }
          int var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            int var5 = this.readInt(param0 - 1527992897);
            int var6 = this.readInt(-5053);
            int var7 = 0;
            int var8 = -1640531527;
            int var9 = 32;
            while (true) {
              int incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ param1[var7 >>> 11 & 1115684867] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a((byte) 123, var5);
            this.a((byte) 125, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("n.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
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
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
        if (param1 != -23) {
          field_j = (String) null;
        }
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param0;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        String stackIn_10_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 21) {
            return;
          }
          for (int var5_int = param2; param2 + param0 > var5_int; var5_int++) {
            int fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("n.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int e(byte param0) {
        if (param0 <= 25) {
          return 97;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return -49152 + this.readUnsignedShort(1952);
        }
        return this.readUnsignedByte(0) - 64;
    }

    final long i(int param0) {
        if (param0 != -800509813) {
          java.math.BigInteger var6 = (java.math.BigInteger) null;
          this.a((byte) -121, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        long var2 = 4294967295L & (long)this.readInt(-5053);
        long var4 = 4294967295L & (long)this.readInt(-5053);
        return var4 + (var2 << 32);
    }

    final int readUnsignedByte(int guard) {
        if (guard != 0) {
          this.readInt(113);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        String stackIn_17_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var3_int = -97 / ((-8 - param2) / 36);
          if (!PacketBuffer.b(param0, param1, 109)) {
            return false;
          }
          for (int var4 = 0; param1.length() > var4; var4++) {
            if (!fn.a(param1.charAt(var4), (byte) -124)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var3;
          StringBuilder stackIn_16_1 = new StringBuilder().append("n.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int var4 = -54 % ((65 - param1) / 53);
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

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        try {
          int var4_int = this.position;
          this.position = 0;
          byte[] var5 = new byte[var4_int];
          this.a(var5, (byte) -96, 0, var4_int);
          java.math.BigInteger var6 = new java.math.BigInteger(var5);
          java.math.BigInteger var7 = var6.modPow(param2, param1);
          if (param0 >= -82) {
            this.readInt(-86);
          }
          byte[] var8 = var7.toByteArray();
          this.position = 0;
          this.h(-123, var8.length);
          this.a(var8.length, (byte) 21, 0, var8);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "n.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 <= 122) {
          field_j = (String) null;
        }
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

    final int readInt(int guard) {
        if (guard != -5053) {
          field_i = false;
        }
        this.position = this.position + 4;
        return (this.payload[this.position - 1] & 255) + ((255 & this.payload[this.position - 2]) << 8) + ((this.payload[this.position - 4] << 24 & -16777216) + ((this.payload[this.position - 3] & 255) << 16));
    }

    final byte a(boolean param0) {
        if (param0) {
          return (byte) -105;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void d(int param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.f(param1 + 64, param0 ^ -12787);
          return;
        }
        if (16384 > param1 &&
          param1 >= -16384) {
          this.h(-128, param1 + 49152);
          return;
        }
        if (param0 != 12680) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        String stackIn_10_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          for (int var5_int = param2; param2 + param3 > var5_int; var5_int++) {
            int fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
          }
          if (param1 != -96) {
            byte[] var7 = (byte[]) null;
            this.a((byte[]) null, (byte) -86, 15, 64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("n.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(int param0) {
        this.position = this.position - 4;
        int var2 = ae.a(this.payload, (byte) -50, this.position, param0);
        int var3 = this.readInt(-5053);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = jd.a(param0, true);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int var4 = -64 % ((-13 - param0) / 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
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

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0, int param1) {
        int var3 = -23 % ((-58 - param0) / 49);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final void i(int param0, int param1) {
        if (param1 != 32614) {
          return;
        }
        this.payload[-param0 + (this.position - 2)] = (byte)(param0 >> 8);
        this.payload[this.position - param0 - 1] = (byte)param0;
    }

    final void f(int param0, int param1) {
        if (param1 != -123) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final String f(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        int var2 = this.payload[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        int var4 = -93 / ((param0 - 6) / 33);
        int var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        int var5 = this.position - (var3 + 1);
        if (var5 != 0) {
          return qi.a(var5, var3, this.payload, (byte) -68);
        }
        return "";
    }

    final void a(String param0, byte param1) {
        String stackIn_28_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          long var3_long = 0L;
          long var5 = 0L;
          int var7 = param0.length();
          if (param1 != 111) {
            field_j = (String) null;
          }
          for (int var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              int var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + var9 - 65);
              } else if (97 <= var9 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                57 >= var9) {
                var3_long = var3_long + (long)(-48 + var9 + 28);
              } else {
                var3_long = var3_long + 1L;
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a(104, var3_long);
          this.a(111, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var3;
          StringBuilder stackIn_27_1 = new StringBuilder().append("n.W(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_j = "This password contains repeated characters, and would be easy to guess";
        field_k = "UP ARROW";
    }
}
