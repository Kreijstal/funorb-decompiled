/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sb extends pi {
    int field_o;
    static Random field_t;
    static String[][] field_s;
    static String field_q;
    static bj field_r;
    static p field_n;
    byte[] field_u;
    static int field_p;

    final void a(int param0, int param1, boolean param2, byte[] param3) {
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
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$0] = param3[var5_int];
          }
          if (!param2) {
            field_n = (p) null;
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
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int i(int param0) {
        this.field_o = this.field_o + 3;
        if (param0 < 1) {
          return 50;
        }
        return (this.field_u[this.field_o - 3] << 16 & 16711680) + ((65280 & this.field_u[-2 + this.field_o] << 8) + (255 & this.field_u[this.field_o - 1]));
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)param1;
        if (param0 > -43) {
          field_p = 23;
        }
    }

    final void g(int param0, int param1) {
        this.field_u[param0 + (-param1 + this.field_o)] = (byte)param1;
    }

    final void f(int param0, int param1) {
        this.field_u[-4 - param0 + this.field_o] = (byte)(param0 >> 24);
        this.field_u[-param0 + (this.field_o - 3)] = (byte)(param0 >> 16);
        this.field_u[-param0 + this.field_o - 2] = (byte)(param0 >> 8);
        this.field_u[this.field_o - (param0 + 1)] = (byte)param0;
        if (param1 > -90) {
          this.field_u = (byte[]) null;
        }
    }

    final void d(int param0, int param1) {
        if (param0 >= -3) {
          return;
        }
        if (64 > param1 &&
          param1 >= -64) {
          this.c(64 + param1, 25564);
          return;
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.b((byte) 123, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
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
        var10 = MinerDisturbance.field_ab;
        try {
          if (param1 != 31747) {
            this.field_o = -33;
          }
          var3_int = this.field_o / 8;
          this.field_o = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.b((byte) 24);
            var6 = this.b((byte) 35);
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
            this.field_o = this.field_o - 8;
            this.a((byte) 106, var5);
            this.a((byte) 111, var6);
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
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_o;
        this.field_o = 0;
        byte[] var5 = new byte[var4_int];
        this.a(var5, (byte) -120, 0, var4_int);
        if (param0 > -31) {
          return;
        }
        try {
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          this.field_o = 0;
          this.b((byte) 125, var8.length);
          this.a(0, var8.length, true, var8);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
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
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_o = this.field_o + r.a(var4, this.field_u, this.field_o, 0, param1.length(), 8211);
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sb.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != -506270856) {
          this.e(13);
        }
        this.field_u[this.field_o - param0 - 2] = (byte)(param0 >> 8);
        this.field_u[-1 + (this.field_o - param0)] = (byte)param0;
    }

    final int a(byte param0) {
        if (param0 >= -116) {
          byte[] var3 = (byte[]) null;
          this.a((byte[]) null, (byte) -124, -10, -111);
        }
        if (this.field_u[this.field_o] >= 0) {
          return this.e(-91);
        }
        return this.b((byte) 35) & 2147483647;
    }

    final void a(int param0, int param1, int[] param2, boolean param3) {
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
          var5_int = this.field_o;
          this.field_o = param0;
          var6 = (param1 - param0) / 8;
          var7 = 0;
          if (!param3) {
            return;
          }
          while (true) {
            if (var6 <= var7) {
              this.field_o = var5_int;
              return;
            }
            var8 = this.b((byte) 54);
            var9 = this.b((byte) 17);
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
            this.field_o = this.field_o - 8;
            this.a((byte) 104, var8);
            this.a((byte) 84, var9);
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
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 != -113) {
          return;
        }
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)param0;
    }

    final int d(byte param0) {
        if (param0 != -54) {
          sb.a(-98);
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        return this.field_u[fieldTemp$0] & 255;
    }

    final int b(byte param0) {
        if (param0 < 14) {
          field_s = (String[][]) null;
        }
        this.field_o = this.field_o + 4;
        return ((this.field_u[-3 + this.field_o] & 255) << 16) + (this.field_u[-4 + this.field_o] << 24 & -16777216) + ((this.field_u[-2 + this.field_o] & 255) << 8) + (this.field_u[this.field_o - 1] & 255);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param1 >> 16);
        if (param0 <= 79) {
          return;
        }
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)param1;
    }

    final void c(int param0, int param1) {
        if (param1 != 25564) {
          field_t = (Random) null;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)param0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
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
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            param0[var5_int] = this.field_u[fieldTemp$0];
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
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!kj.a(false) &&
          null == dm.field_f) {
          dm.field_f = fn.a(0, 6);
        }
        if (param0 != 6) {
          field_n = (p) null;
        }
        if (!si.field_a &&
          null != dm.field_f && dm.field_f.field_q) {
          fn.a(dm.field_f.field_t, true);
          si.field_a = true;
          aa.field_j.a(35, pj.field_c);
          ck.a(param0 - 30839);
        }
    }

    final int e(int param0) {
        if (param0 > -8) {
          return -93;
        }
        this.field_o = this.field_o + 2;
        return (this.field_u[this.field_o - 1] & 255) + ((255 & this.field_u[this.field_o - 2]) << 8);
    }

    final String a(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0) {
          this.a(32, -68L);
        }
        var2 = this.field_o;
        do {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
        } while (0 != this.field_u[fieldTemp$0]);
        var3 = -var2 + (this.field_o - 1);
        if (var3 != 0) {
          return ph.a((byte) 34, var3, this.field_u, var2);
        }
        return "";
    }

    final int c(byte param0) {
        int var2 = 255 & this.field_u[this.field_o];
        if (param0 <= 20) {
          return 42;
        }
        if (128 <= var2) {
          return this.e(-113) - 49152;
        }
        return this.d((byte) -54) - 64;
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (param0 != -1) {
          field_p = 31;
        }
        int fieldTemp$5 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$7] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        if (param0 <= 120) {
          this.a((byte) 11);
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)param1;
    }

    public static void l(int param0) {
        field_t = null;
        field_q = null;
        field_n = null;
        int var1 = 59 % ((param0 + 1) / 44);
        field_s = (String[][]) null;
        field_r = null;
    }

    final byte m(int param0) {
        if (param0 != 4) {
          field_r = (bj) null;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        return this.field_u[fieldTemp$0];
    }

    final String g(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        var2 = this.field_u[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_o;
        do {
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
        } while (this.field_u[fieldTemp$1] != 0);
        var4 = -var3 + (this.field_o - 1);
        if (~var4 != param0) {
          return ph.a((byte) 116, var4, this.field_u, var3);
        }
        return "";
    }

    final int e(int param0, int param1) {
        int var3 = 47 % ((-1 - param0) / 62);
        int var4 = qn.a(-1648911295, param1, this.field_o, this.field_u);
        this.a((byte) 99, var4);
        return var4;
    }

    final void h(int param0, int param1) {
        if (param0 >= -15) {
          return;
        }
        if ((-128 & param1) != 0) {
          if ((-16384 & param1) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.c(128 | param1 >>> 28, 25564);
              }
              this.c((269712780 | param1) >>> 21, 25564);
            }
            this.c((param1 | 2106349) >>> 14, 25564);
          }
          this.c(param1 >>> 7 | 128, 25564);
        }
        this.c(127 & param1, 25564);
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 != 63) {
          this.d((byte) -44);
        }
        int fieldTemp$5 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = MinerDisturbance.field_ab;
        while (param1 > this.field_o) {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -1) {
          field_s = (String[][]) null;
        }
    }

    final void b(int param0, String param1) {
        int fieldTemp$0 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param1);
        this.field_o = this.field_o + r.a(var4, this.field_u, this.field_o, 0, param1.length(), 8211);
        if (param0 != 23446) {
          return;
        }
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long h(int param0) {
        if (param0 < 1) {
          return -20L;
        }
        long var2 = (long)this.b((byte) 56) & 4294967295L;
        long var4 = (long)this.b((byte) 83) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final String j(int param0) {
        int var2 = 42 / ((-9 - param0) / 48);
        if (this.field_u[this.field_o] == 0) {
          this.field_o = this.field_o + 1;
          return null;
        }
        return this.a(false);
    }

    final void a(byte param0, String param1) {
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
          this.a(var3_long, 63);
          this.a(var5, 63);
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
          throw lj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        if (!param0) {
          field_n = (p) null;
        }
        int var2 = 255 & this.field_u[this.field_o];
        if (var2 >= 128) {
          return -32768 + this.e(-11);
        }
        return this.d((byte) -54);
    }

    final boolean f(int param0) {
        this.field_o = this.field_o - 4;
        int var2 = qn.a(param0 - 1648911295, param0, this.field_o, this.field_u);
        int var3 = this.b((byte) 108);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final int k(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        var2 = this.field_u[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          var2 = this.field_u[fieldTemp$1];
        }
        if (param0 != 8) {
          field_n = (p) null;
        }
        return var2 | var3;
    }

    sb(int param0) {
        this.field_o = 0;
        this.field_u = lh.a((byte) 33, param0);
    }

    sb(byte[] param0) {
        try {
          this.field_u = param0;
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new Random();
        field_q = "This entry doesn't match";
        field_s = new String[][]{null, new String[]{"Yuck, you're covered in oil. Swiming in the water for a few seconds will clean it off. Don't use a jetpack while covered in oil!"}};
    }
}
