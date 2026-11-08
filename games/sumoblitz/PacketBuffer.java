/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static char[] field_m;
    static int field_l;
    static boolean[] field_o;
    byte[] payload;
    int position;
    static qn field_k;

    final void a(String param0, int param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          var8 = 19;
          if (param1 < 19) {
            this.f(118);
          }
          while (var8 >= 0) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else if (97 <= var9 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(var9 - 20);
              } else {
                var3_long = var3_long + 1L;
              }
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            } else {
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            }
            var8--;
          }
          this.a(var3_long, 116);
          this.a(var5, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("fs.K(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != -123) {
            this.position = 98;
          }
          for (var5_int = param3; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fs.GA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static float a(byte param0, float param1) {
        if (param0 != 124) {
          field_l = 20;
        }
        return param1 * (param1 * param1) * (param1 * (-15.0f + 6.0f * param1) + 10.0f);
    }

    final static void a(PlatformTaskDispatcher param0, int param1, int param2, String param3, byte param4, int param5, int param6, int param7, int param8) {
        rl.field_q = param2;
        if (param4 != -56) {
          return;
        }
        try {
          gd.field_a = param3;
          rd.field_l = param7;
          ie.field_x = param1;
          CompactMeshGeometry.field_u = param0;
          qq.field_P = param5;
          ow.field_e = param8;
          bt.field_d = param6;
          jk.field_b = (gd) ((Object) new t());
          in.field_D = new ti(param0);
          wt.field_i = new ArchiveCatalog(jk.field_b, in.field_D);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + MusicPatchEnvelope.a(0, this.payload, (byte) -110, var5, param0.length(), this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          int var4 = 123 / ((param1 + 7) / 60);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        if (param0 != -31302) {
          this.d(-78);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final String g(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
        } while (0 != this.payload[fieldTemp$1]);
        var5 = 83 / ((param0 - 0) / 48);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return sd.a(this.payload, var3, var4, 26564);
        }
        return "";
    }

    final int c(boolean param0) {
        this.position = this.position + 4;
        if (!param0) {
          this.payload = (byte[]) null;
        }
        return (this.payload[this.position - 1] & 255) + (((this.payload[this.position - 3] & 255) << 16) + ((this.payload[-4 + this.position] & 255) << 24)) + (65280 & this.payload[-2 + this.position] << 8);
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          this.payload = (byte[]) null;
        }
        int var3 = rd.a(this.payload, param0, this.position, 1001);
        this.e(48, var3);
        return var3;
    }

    final void b(long param0, int param1) {
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
        if (param1 != 1105594440) {
          field_k = (qn) null;
        }
    }

    final void c(int param0, int param1) {
        this.payload[this.position - (param0 + 1)] = (byte)param0;
        if (param1 != -13745) {
          field_m = (char[]) null;
        }
    }

    final void a(int param0, byte param1, int param2, int[] param3) {
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
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param2;
          var6 = (-param2 + param0) / 8;
          if (param1 != 127) {
            return;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.c(true);
            var9 = this.c(true);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 + param3[-178257917 & var10 >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param3[3 & var10]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.e(48, var8);
            this.e(48, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if ((-128 & param0) != 0) {
          if ((param0 & -16384) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((param0 & -268435456) != 0) {
                this.b((byte) 115, param0 >>> 28 | 128);
              }
              this.b((byte) 90, (268682394 | param0) >>> 21);
            }
            this.b((byte) 64, (2099807 | param0) >>> 14);
          }
          this.b((byte) 120, (param0 | 16498) >>> 7);
        }
        this.b((byte) 17, 127 & param0);
        if (param1 >= -4) {
          field_l = -52;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
        int var3 = -16 / ((param1 - 43) / 34);
    }

    final boolean e(byte param0) {
        this.position = this.position - 4;
        int var2 = rd.a(this.payload, 0, this.position, param0 + 1010);
        if (param0 != -9) {
          String var4 = (String) null;
          PacketBuffer.a((PlatformTaskDispatcher) null, -93, 108, (String) null, (byte) 18, 23, 21, 60, 76);
        }
        int var3 = this.c(true);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final byte[] d(byte param0) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 120) {
          return (byte[]) null;
        }
        byte[] var5 = new byte[this.position];
        byte[] var2 = var5;
        for (var3 = 0; var3 < this.position; var3++) {
          var5[var3] = this.payload[var3];
        }
        return var2;
    }

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
          this.a(var5, var4_int, 0, (byte) -59);
          if (param0 <= 115) {
            field_l = 79;
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param1);
          var8 = var7.toByteArray();
          this.position = 0;
          this.b(-123, var8.length);
          this.a(var8, (byte) -123, var8.length, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
        if (param1 <= 104) {
          this.e(25, -112);
        }
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

    final int c(byte param0) {
        if (param0 <= 120) {
          return -109;
        }
        this.position = this.position + 3;
        return ((255 & this.payload[-2 + this.position]) << 8) + ((16711680 & this.payload[this.position - 3] << 16) + (255 & this.payload[-1 + this.position]));
    }

    final long a(byte param0) {
        if (param0 < 100) {
          return 61L;
        }
        long var2 = 4294967295L & (long)this.c(true);
        long var4 = 4294967295L & (long)this.c(true);
        return var4 + (var2 << 32);
    }

    final void a(boolean param0, int param1) {
        this.payload[-4 + this.position - param1] = (byte)(param1 >> 24);
        if (!param0) {
          this.d(true);
        }
        this.payload[-3 + (-param1 + this.position)] = (byte)(param1 >> 16);
        this.payload[-param1 + this.position - 2] = (byte)(param1 >> 8);
        this.payload[-1 + (this.position - param1)] = (byte)param1;
    }

    final void b(String param0, byte param1) {
        int var4 = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          int var3_int = -25 % ((param1 + 46) / 53);
          var4 = param0.indexOf('\0');
          if (0 <= var4) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + MusicPatchEnvelope.a(0, this.payload, (byte) -124, var5, param0.length(), this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0) {
          this.a(true, 72L);
        }
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

    final int a(int param0) {
        this.position = this.position + 2;
        if (param0 != 255) {
          this.a(124L, -47);
        }
        return (this.payload[this.position - 2] << 8 & 65280) + (255 & this.payload[this.position - 1]);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
        int var3 = -45 / ((param0 - 57) / 59);
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_m = null;
        if (param0 > -10) {
          field_l = 23;
        }
        field_k = null;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        while (this.position < param1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -3) {
          field_o = (boolean[]) null;
        }
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = this.position - var2 + param0;
        if (var3 != 0) {
          return sd.a(this.payload, var2, var3, 26564);
        }
        return "";
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
          field_m = (char[]) null;
        }
        this.payload[-2 + (this.position - param1)] = (byte)(param1 >> 8);
        this.payload[-1 + this.position - param1] = (byte)param1;
    }

    final byte d(boolean param0) {
        if (!param0) {
          return (byte) -80;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = jo.a(-44, param0);
    }

    final void a(int param0, byte param1) {
        if (param0 < 64 &&
          param0 >= -64) {
          this.b((byte) 108, param0 + 64);
          return;
        }
        if (param0 < 16384 &&
          -16384 <= param0) {
          this.b(120, 49152 + param0);
          return;
        }
        if (param1 >= 0) {
          this.b(58L, -106);
        }
        throw new IllegalArgumentException();
    }

    final int f(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 75) {
          this.position = -23;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int f(int param0) {
        if (param0 != 0) {
          return 40;
        }
        if (this.payload[this.position] >= 0) {
          return this.a(255);
        }
        return this.c(true) & 2147483647;
    }

    final void b(byte param0, int param1) {
        if (param0 < 14) {
          this.d(false);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
    }

    final void e(int param0, int param1) {
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
        if (param0 != 48) {
          field_o = (boolean[]) null;
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(byte param0) {
        int var2 = -125 % ((param0 + 56) / 44);
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.d(-1);
    }

    final int h(int param0) {
        if (param0 != -2858) {
          field_m = (char[]) null;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.e(param0 ^ 29036) - 64;
        }
        return -49152 + this.a(param0 + 3113);
    }

    final void a(byte[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 > -5) {
            return;
          }
          for (var5_int = param2; var5_int < param2 + param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fs.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int[] param0, int param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          if (param1 < 82) {
            return;
          }
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.c(true);
            var6 = this.c(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param0[3 & var7] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                var7 = var7 + var8;
                var6 = var6 + (param0[-513802237 & var7 >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.e(48, var5);
            this.e(48, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fs.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(boolean param0) {
        if (param0) {
          return -85;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return this.e(-31302);
        }
        return -32768 + this.a(255);
    }

    static {
        field_o = new boolean[8];
        field_m = new char[]{(char)91, (char)93, (char)35};
        field_l = 0;
    }
}
