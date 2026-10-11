/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ei {
    private int field_J;
    static dd field_T;
    static java.applet.Applet field_W;
    static int field_S;
    static lr field_R;
    private int field_Q;
    private int field_I;
    private int field_M;
    private dd field_H;
    static vh field_K;
    boolean field_N;
    private int field_V;
    private dd[] field_O;
    int field_P;
    private dd field_U;
    static int field_G;
    private dd field_F;
    private int field_L;

    private final dd a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param2 < 82) {
          this.a(-24, (byte) -90, 11, -53);
        }
        dd var13 = new dd(2 * this.field_Q, this.field_y);
        kj.a(113, var13);
        int var5 = this.field_y >> 1;
        for (var6 = 0; var6 < this.field_y; var6++) {
          var7 = (2 * this.field_Q - 1) * (var6 >> 1) % (this.field_Q * 2);
          var8 = 16711935 & param1;
          var9 = param1 & 65280;
          var10 = var6 - var5;
          var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
          var12 = var11 >= 256 ? var8 | var9 : (var8 * var11 & -16711936 | var11 * var9 & 16711680) >>> 8;
          qh.f(var7, var6, this.field_Q, var12);
          qh.f(-(this.field_Q * 2) + var7, var6, this.field_Q, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = 16711935 & param0;
          var12Lifetime1 = 256 > var11 ? (-16711936 & var8Lifetime1 * var11 | var9Lifetime1 * var11 & 16711680) >>> 8 : var8Lifetime1 | var9Lifetime1;
          qh.f(this.field_Q + var7, var6, this.field_Q, var12Lifetime1);
          qh.f(-this.field_Q + var7, var6, this.field_Q, var12Lifetime1);
        }
        oc.a(122);
        return var13;
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!p.a(param1, (byte) -113, true)) {
            return false;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            if (!ul.a(param1.charAt(var2_int), (byte) 124)) {
              return false;
            }
          }
          if (param0 == -25908) {
            return true;
          }
          var3 = (byte[]) null;
          gj.a((byte[]) null, 26, -23);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) 33);
    }

    private final dd a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        dd discarded$0 = null;
        int var2 = this.field_y >> 1;
        dd var3 = new dd(var2, this.field_y);
        kj.a(55, var3);
        for (var4 = 0; var4 < this.field_y; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_y) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(var6 * 255.0) : 255;
            }
            qh.a(var5, var4, var8 | var8 << 8 | var8 << 16);
          }
        }
        if (param0 != 16711422) {
          discarded$0 = this.a(24, 48, (byte) -125);
        }
        oc.a(117);
        return var3;
    }

    private final void a(boolean param0, int param1, int param2, dd param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          var5_int = param1 + this.field_l;
          wh.a(param1 + this.field_U.field_z, param2, var5_int - this.field_U.field_z, (byte) 31, param2 + this.field_y);
          for (var6 = -this.field_J + param1; var5_int > var6; var6 = var6 + param3.field_z) {
            param3.c(var6, param2);
          }
          if (param0) {
            this.field_U = (dd) null;
          }
          oc.a(121);
          if (qh.field_b <= param1 + this.field_U.field_z) {
            kj.a(43, this.field_H);
            param3.c(-this.field_J, 0);
            param3.c(-this.field_J + 2 * this.field_Q, 0);
            this.field_F.d(0, 0);
            oc.a(114);
            this.field_H.c(param1, param2);
          }
          if (var5_int - this.field_U.field_z <= qh.field_j) {
            kj.a(86, this.field_H);
            for (var7 = -this.field_U.field_z + (this.field_l + this.field_J); var7 > this.field_Q * 2; var7 = var7 - this.field_Q * 2) {
            }
            param3.c(-var7, 0);
            param3.c(this.field_Q * 2 - var7, 0);
            this.field_U.d(0, 0);
            oc.a(121);
            this.field_H.c(var5_int - this.field_U.field_z, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, (param6 & 16711422) >> 1);
    }

    public static void a(boolean param0) {
        field_T = null;
        field_W = null;
        if (!param0) {
          field_K = (vh) null;
        }
        field_K = null;
        field_R = null;
    }

    final static boolean a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            field_R = (lr) null;
          }
          stackIn_6_0 = (2 <= param1) && (!nj.a(param1, 125, param0, ml.field_h));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gj.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        int var6 = 23 / ((-42 - param1) / 53);
        int var5 = this.field_C + param2;
        int var7 = this.field_D + param3;
        this.a(false, var5, var7, this.field_O[0]);
        if (this.field_P < 65536) {
          wh.a(var5 + (this.field_l * this.field_P >> 16), var7, this.field_l + var5, (byte) -116, var7 + this.field_y);
          this.a(false, var5, var7, this.field_O[1]);
          oc.a(112);
        }
    }

    private final void f(byte param0) {
        this.field_O = new dd[]{this.a(this.field_M, this.field_V, (byte) 108), this.a(this.field_L, this.field_I, (byte) 110)};
        if (param0 <= 8) {
          byte[] var3 = (byte[]) null;
          gj.a((byte[]) null, -61, 57);
        }
        this.field_U = this.a(16711422);
        this.field_F = this.field_U.a();
        this.field_H = new dd(this.field_y >> 1, this.field_y);
    }

    final void a(int param0, int param1, int param2) {
        this.field_M = param0;
        this.field_V = param2;
        this.field_L = (16711422 & param0) >> 1;
        if (param1 != 19365) {
          this.field_N = false;
        }
        this.field_I = 8355711 & param2 >> 1;
        this.f((byte) 83);
    }

    final static ij a(boolean param0, int param1, String param2, String param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_2_0 = null;
        ij stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          qg.a((byte) 48, param1);
          var4 = new ij(param1);
          if (!param0) {
            stackIn_2_0 = (ij) null;
            return stackIn_2_0;
          }
          var4.a(param2, (byte) 87, param3);
          nd.field_i.b((byte) 92, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("gj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 958) {
            this.a(-58, 31, -62, true, -86);
          }
          if (this.field_N) {
            this.field_J = this.field_J + 1;
            if (this.field_J <= this.field_Q * 2) {
              return;
            }
            this.field_J = this.field_J - 2 * this.field_Q;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gj.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_M = param6;
        this.field_L = param8;
        this.field_V = param5;
        this.field_I = param7;
        this.field_Q = param4;
        this.a(param2, param0, param3, false, param1);
    }

    static {
        field_G = 0;
    }
}
