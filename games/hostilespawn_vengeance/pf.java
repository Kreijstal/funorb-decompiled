/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    short[] field_P;
    int field_D;
    short[] field_y;
    short[] field_K;
    private boolean field_A;
    short[] field_w;
    short[] field_b;
    short[] field_g;
    int field_d;
    static int[] field_j;
    int[] field_F;
    int field_a;
    int[] field_p;
    short[] field_z;
    int field_C;
    short[] field_m;
    short field_c;
    int[] field_Q;
    short[] field_n;
    int[] field_e;
    static int field_o;
    byte field_f;
    int[] field_l;
    int field_J;
    short[] field_i;
    short[] field_s;
    byte[] field_x;
    int[] field_v;
    static String field_I;
    short[] field_q;
    int[] field_h;
    int field_t;
    short[] field_E;
    short[] field_u;
    short[] field_G;
    short[] field_r;
    short[] field_O;
    short[] field_H;
    short field_k;
    static String field_N;
    int[] field_B;
    short field_L;
    int[] field_M;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        for (var6 = 0; var6 < this.field_c; var6++) {
          this.field_n[var6] = (short)(this.field_n[var6] * param1 / param3);
          this.field_E[var6] = (short)(param0 * this.field_E[var6] / param3);
          this.field_H[var6] = (short)(this.field_H[var6] * param4 / param3);
        }
        if (param2 != 40) {
          this.field_n = (short[]) null;
        }
        this.a((byte) -59);
    }

    final static void b(int param0) {
        hk var1 = (hk) (ij.field_J.b(-27493));
        if (var1 == null) {
          var1 = new hk();
        }
        if (param0 != 511) {
          pf.b((byte) 22);
        }
        var1.a(si.field_e, si.field_i, si.field_a, -12131, si.field_j, si.field_l, si.field_b, si.field_k);
        ak.field_i.a(var1, 114);
    }

    final static void a(int param0, boolean param1, p param2, int param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (31 != param2.field_i &&
            param2.field_i != 35) {
            if (param2.field_i != 17) {
              var4_int = param2.field_e / 2;
            } else {
              if ((1 & param2.field_e) != 0) {
                return;
              }
              var4_int = param2.field_e / 4;
            }
          } else {
            var4_int = param2.field_e / 7;
          }
          if (0 > var4_int) {
            var4_int = 0;
          }
          if (!param1) {
            return;
          }
          if (me.field_ib.length <= var4_int) {
            var4_int = -1 + me.field_ib.length;
          }
          if (!kd.field_t) {
            me.field_ib[var4_int].a(true, 128, (int)param2.field_c, param3, param0);
          } else {
            nj.a(param3, 128, param0, 22173, me.field_ib[var4_int], (int)param2.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            param0[var2_int] = 0;
          }
          if (param1) {
            field_N = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(byte param0) {
        de.c(-1);
        rj.field_K = true;
        li.field_o = true;
        if (param0 != -64) {
          return;
        }
        im.field_e.f((byte) 32);
        qa.a(false, (byte) -37, uj.field_h);
    }

    public static void a(boolean param0) {
        field_j = null;
        field_I = null;
        if (!param0) {
          return;
        }
        field_N = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!pl.a(param2, 12864, param0)) {
            return false;
          }
          var3_int = 48 / ((20 - param1) / 39);
          for (var4 = 0; var4 < param0.length(); var4++) {
            if (!aa.a(param0.charAt(var4), (byte) 108)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("pf.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        bd var11 = null;
        bd var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var11 = di.field_b[param3];
          var12 = var11;
          var6 = 0;
          for (var7 = param2; var12.field_r > var7; var7++) {
            for (var8 = 0; var12.field_u > var8; var8++) {
              var9 = var11.field_D[var6 + var8];
              if (var9 != 0) {
                if (param4 == 16728128) {
                  var9 = 262401 * (((16713802 & var9) >> 16) / 4);
                }
                si.a(-1 + param0 + (var12.field_u - var8), var7 + param1, var9);
              }
            }
            var6 = var6 + var12.field_u;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "pf.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = HostileSpawn.field_I ? 1 : 0;
        int var5 = 0;
        if (param1 >= -15) {
          field_o = -32;
        }
        while (this.field_c > var5) {
          this.field_n[var5] = (short)(this.field_n[var5] + param0);
          this.field_E[var5] = (short)(this.field_E[var5] + param2);
          this.field_H[var5] = (short)(this.field_H[var5] + param3);
          var5++;
        }
        this.a((byte) 94);
    }

    final static boolean a(int param0) {
        if (param0 >= -109) {
          field_j = (int[]) null;
        }
        na.field_b = true;
        dh.field_c = 15000L + hn.a((byte) 80);
        return 11 == fa.field_c ? true : false;
    }

    private final void a(byte param0) {
        int var2 = 126 % ((28 - param0) / 56);
        this.field_A = false;
    }

    final void c(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        CharSequence var13;
        var12 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_A) {
          return;
        }
        this.field_A = true;
        if (param0 >= -71) {
          var13 = (CharSequence) null;
          pf.a((CharSequence) null, -79, true);
        }
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_c; var8++) {
          var9 = this.field_n[var8];
          var10 = this.field_E[var8];
          if (var3 > var10) {
            var3 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          var11 = this.field_H[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var4 > var11) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        this.field_d = var2;
        this.field_D = var4;
        this.field_C = var6;
        this.field_t = var7;
        this.field_a = var3;
        this.field_J = var5;
    }

    pf() {
        this.field_A = false;
        this.field_f = (byte) 0;
    }

    static {
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_o = 0;
        field_I = null;
        field_N = "To server list";
    }
}
