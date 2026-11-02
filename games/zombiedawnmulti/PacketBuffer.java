/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    byte[] payload;
    static int field_k;
    static int[] field_n;
    static boolean field_f;
    static String field_h;
    static vp field_l;
    static cj field_g;
    static int[] field_i;

    final int e(byte param0) {
        if (param0 != -49) {
          field_k = -8;
        }
        if (this.payload[this.position] < 0) {
          return this.i(-1478490344) & 2147483647;
        }
        return this.d((byte) 69);
    }

    final void a(byte param0, int param1) {
        this.payload[this.position - param1 - 4] = (byte)(param1 >> 24);
        this.payload[this.position - param1 - 3] = (byte)(param1 >> 16);
        this.payload[this.position + (-param1 - 2)] = (byte)(param1 >> 8);
        this.payload[this.position - param1 - 1] = (byte)param1;
        if (param0 != 123) {
          this.e((byte) 75);
        }
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 <= 105) {
            field_k = -45;
          }
          for (var5_int = param2; param2 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("k.HB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_i = null;
        field_g = null;
        field_l = null;
        if (param0) {
          return;
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ka.field_f[lj.field_n] = param4;
        la.field_c[lj.field_n] = lj.field_n;
        lb.field_c[lj.field_n] = param3;
        if (ab.field_j > param3) {
          mj.field_Ub = param3;
        }
        if (!(param3 <= NodeHashTableIterator.field_d)) {
          ba.field_m = param3;
        }
        vk.field_J[lj.field_n] = param2;
        kj.field_p[lj.field_n] = param1;
        ie.field_ob[lj.field_n] = param5;
        int var6 = param5 + param2 + param1;
        int var7 = var6 != 0 ? param2 * 1000 / var6 : 0;
        hn.field_f[lj.field_n] = var7;
        if (param0 != 1000) {
          field_h = (String) null;
        }
        if (!(var7 <= ba.field_m)) {
          ba.field_m = var7;
        }
        lj.field_n = lj.field_n + 1;
        if (var7 < mj.field_Ub) {
          mj.field_Ub = var7;
        }
    }

    final int i(int param0) {
        if (param0 != -1478490344) {
          return 125;
        }
        this.position = this.position + 4;
        return (this.payload[this.position - 1] & 255) + ((this.payload[-2 + this.position] & 255) << 8) + ((-16777216 & this.payload[this.position - 4] << 24) + (16711680 & this.payload[-3 + this.position] << 16));
    }

    final static Sprite a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        Sprite var6 = new Sprite(param1, param1);
        Sprite var3 = var6;
        if (param0 >= -107) {
          PacketBuffer.a(-115, -116, 63);
        }
        for (var4 = 0; var3.pixels.length > var4; var4++) {
          var6.pixels[var4] = param2;
        }
        return var3;
    }

    final static cj f(int param0) {
        if (param0 != 23000) {
          PacketBuffer.f(-7);
        }
        return hf.field_e.field_Gb;
    }

    final int f(int param0, int param1) {
        if (param1 < 111) {
          this.e(-90, -121);
        }
        int var3 = c.a(this.payload, this.position, true, param0);
        this.b(8, var3);
        return var3;
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (param1 != 105) {
            this.a(68);
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + tg.a(this.position, var4, 0, param1 ^ -151, this.payload, param0.length());
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "k.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        dk.f(param1, 13758);
        if (param0 < 108) {
          return;
        }
        if (ui.field_j != null) {
          qk.a(ui.field_j, -113);
        }
    }

    final int h(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 != 22219) {
          return -13;
        }
        if (var2 < 128) {
          return this.g(31365) - 64;
        }
        return this.d((byte) 69) - 49152;
    }

    final void a(int param0, byte param1) {
        if (param1 >= -41) {
          field_h = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final void d(int param0, int param1) {
        if (param1 != -8593) {
          field_n = (int[]) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final void b(long param0, boolean param1) {
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
        if (!param1) {
          return;
        }
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    final void g(int param0, int param1) {
        if (param0 != (-128 & param1)) {
          if (0 != (param1 & -16384)) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.a(110, param1 >>> 28 | 128);
              }
              this.a(-59, param1 >>> 21 | 128);
            }
            this.a(113, 128 | param1 >>> 14);
          }
          this.a(-31, (16405 | param1) >>> 7);
        }
        this.a(111, 127 & param1);
    }

    final void a(int param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
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
                  var3_long = var3_long + (long)(-97 + (2 + var9));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(28 - (-var9 + 48));
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
          if (param0 != 13066) {
            this.a((byte) -11);
          }
          this.a(var3_long, param0 ^ -13160);
          this.a(var5, -112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("k.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final long a(byte param0) {
        if (param0 != -30) {
          this.c(-125);
        }
        long var2 = (long)this.i(param0 - 1478490314) & 4294967295L;
        long var4 = (long)this.i(-1478490344) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final int c(byte param0) {
        this.position = this.position + 2;
        int var2 = (65280 & this.payload[this.position - 2] << 8) + (this.payload[this.position - 1] & 255);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        if (param0 != -18) {
          return -120;
        }
        return var2;
    }

    final int d(byte param0) {
        this.position = this.position + 2;
        if (param0 != 69) {
          PacketBuffer.a(10, -33, 94, -107, -118, 82);
        }
        return (this.payload[this.position - 1] & 255) + (this.payload[this.position - 2] << 8 & 65280);
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(0, -6351, var4_int, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.a(var8.length, (byte) -101);
          this.a(var8, var8.length, 0, param1 ^ -2617);
          if (param1 != -2628) {
            field_l = (vp) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("k.WA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void b(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (param0 != -16171) {
            field_k = 118;
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + tg.a(this.position, var4, 0, -256, this.payload, param1.length());
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "k.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(byte param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != -89) {
          int[] var3 = (int[]) null;
          this.a(28, (int[]) null);
        }
        return this.f((byte) -48);
    }

    final String c(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (param0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 - var3 + this.position;
        if (0 == var4) {
          return "";
        }
        return oe.a(var4, this.payload, false, var3);
    }

    final String f(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 >= -4) {
          this.c(-126, -45);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + this.position - var2;
        if (var3 != 0) {
          return oe.a(var3, this.payload, false, var2);
        }
        return "";
    }

    final void e(int param0, int param1) {
        if (param0 < 15) {
          return;
        }
        this.payload[-1 - param1 + this.position] = (byte)param1;
    }

    final void c(int param0, int param1) {
        if (64 > param0 &&
          param0 >= -64) {
          this.a(121, 64 + param0);
          return;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.a(param0 + 49152, (byte) -83);
          return;
        }
        if (param1 != 0) {
          this.c(false);
        }
        throw new IllegalArgumentException();
    }

    final int g(int param0) {
        if (param0 != 31365) {
          field_h = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void b(boolean param0, int param1) {
        if (param0) {
          return;
        }
        this.payload[-2 + (-param1 + this.position)] = (byte)(param1 >> 8);
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int var3 = -96 % ((param0 + 58) / 41);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final int e(int param0) {
        if (param0 != 128) {
          return 54;
        }
        this.position = this.position + 3;
        return (255 & this.payload[this.position - 1]) + ((255 & this.payload[-2 + this.position]) << 8) + ((255 & this.payload[this.position - 3]) << 16);
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
        int var3 = 81 / ((param0 - 45) / 62);
    }

    final byte d(int param0) {
        if (param0 != -249699580) {
          this.b(-15, (byte) -127);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    private final void a(long param0, int param1) {
        int var4 = -44 % ((-13 - param1) / 42);
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
    }

    final int a(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = param0;
        while (0 > var2) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        byte[] var5;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 < 92) {
          var5 = (byte[]) null;
          this.a((byte[]) null, -125, -32, 77);
        }
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final boolean c(boolean param0) {
        this.position = this.position - 4;
        if (param0) {
          field_f = true;
        }
        int var2 = c.a(this.payload, this.position, true, 0);
        int var3 = this.i(-1478490344);
        if (var2 != var3) {
          return false;
        }
        return true;
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param3;
          var6 = (param0 - param3) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              if (param2 != -2564) {
                return;
              }
              this.position = var5_int;
              return;
            }
            var8 = this.i(param2 - 1478487780);
            var9 = this.i(-1478490344);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param1[var10 >>> 11 & -1663041533] + var10 ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + param1[3 & var10]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.b(-121, var8);
            this.b(22, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("k.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0, byte param1) {
        if (0 <= param0 &&
          128 > param0) {
          this.a(-53, param0);
          return;
        }
        if (param0 >= 0 &&
          param0 < 32768) {
          this.a(param0 + 32768, (byte) -75);
          return;
        }
        int var3 = 22 % ((param1 - 0) / 46);
        throw new IllegalArgumentException();
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          for (var5_int = param0; param2 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
          }
          if (param1 != -6351) {
            field_h = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("k.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int h(byte param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 > -102) {
          field_g = (cj) null;
        }
        if (var2 >= 128) {
          return -32768 + this.d((byte) 69);
        }
        return this.g(31365);
    }

    final void a(int param0, int[] param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = param0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.i(-1478490344);
            var6 = this.i(-1478490344);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$2 = var9;
              var9--;
              if (0 < incrementValue$2) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + param1[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + (param1[(6402 & var7) >>> 11] + var7 ^ (var5 << 4 ^ var5 >>> 5) + var5);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.b(-100, var5);
            this.b(-103, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("k.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (!param1) {
          return;
        }
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
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = fl.a(-105, param0);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = -1;
        field_n = InflaterDecompressor.a(8);
        field_h = "Counter";
    }
}
