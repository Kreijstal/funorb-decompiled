/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia extends mu {
    int field_D;
    static llb field_M;
    private nva field_F;
    static String field_G;
    int field_H;
    static int[] field_J;
    static long field_C;
    Object[] field_L;
    static String field_K;
    int field_I;
    private no field_E;

    public static void a(int param0) {
        field_J = null;
        field_M = null;
        field_G = null;
        int var1 = -23 % ((-30 - param0) / 60);
        field_K = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        this.field_D = -1;
        if (!this.field_F.field_H) {
          return false;
        }
        if (!this.field_F.field_G.field_y.field_e) {
          return false;
        }
        if (this.field_L == null) {
          return super.a(param0, param1, param2, param3, (byte) 22);
        }
        param0 = param0 - (this.field_r + param3);
        param2 = param2 - (param1 + this.field_g);
        if (param2 >= 0 &&
          0 <= param0 &&
          param2 <= this.field_h &&
          this.field_f >= param0) {
          if (param4 != 22) {
            ((byte[]) (((Object[]) (this.field_L[16]))[0]))[25] = (byte) 98;
          }
          this.field_D = param0 / this.field_I;
          if (this.field_L.length > this.field_D) {
            return true;
          }
          this.field_D = -1;
          return true;
        }
        return false;
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.c(param0, param1, param2, param3);
        param3 = param3 - this.field_r;
        param1 = param1 - this.field_g;
        if (null != this.field_L) {
          var5 = param3 / this.field_I;
          if (var5 >= 0 &&
            this.field_L.length > var5) {
            this.field_H = var5;
            this.field_F.i(21694);
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = VoidHunters.field_G;
        if (param1 != 0) {
          return;
        }
        int var5 = this.field_g + param0;
        int var6 = this.field_r + param3;
        dma.d(var5, var6, this.field_h, this.field_f, 0);
        if (param2 <= 47) {
          return;
        }
        int var7 = this.field_H;
        if (-1 != this.field_D) {
          var7 = this.field_D;
        }
        if (this.field_L != null) {
          for (var8 = 0; var8 < this.field_L.length; var8++) {
            var9 = this.field_L[var8];
            var10 = var9.toString();
            if (var8 == var7) {
              dma.e(2 + var5, var6 + 4, this.field_h - 4, this.field_I, 2188450, 128);
            }
            var6 = var6 + this.field_I;
            this.field_E.c(var10, 2 + var5, var6, 10000536, -1);
          }
        }
    }

    final static int a(boolean param0, int param1, int param2, boolean param3) {
        if (param0) {
          tia.a(-64);
        }
        return rt.c(1);
    }

    final int e(int param0) {
        if (param0 != 4) {
          this.field_E = (no) (((Object[]) (this.field_L[1]))[15]);
        }
        return null != this.field_L ? this.field_I * (1 + this.field_L.length * 2) >> 1 : 200;
    }

    tia(nva param0, no param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.field_E = param1;
          this.field_F = param0;
          this.field_I = this.field_E.field_A + this.field_E.field_k;
          this.a(param3, 28, param2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object g(byte param0) {
        Object stackIn_7_0 = null;
        if (param0 != 96) {
          this.b(-103, 101, 5, -59);
        }
        if (null != this.field_L &&
          -1 != this.field_H) {
          stackIn_7_0 = this.field_L[this.field_H];
        } else {
          stackIn_7_0 = null;
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_L = param2;
          this.field_H = param0;
          this.field_D = -1;
          if (param1 != 28) {
            return;
          }
          if (param2 != null) {
            if (this.field_H >= -1 &&
              this.field_H < this.field_L.length) {
              return;
            }
            throw new IllegalStateException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tia.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_J = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_G = "To <%0>: ";
        field_K = "OK";
    }
}
