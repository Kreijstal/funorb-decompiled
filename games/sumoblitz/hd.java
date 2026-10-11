/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ac {
    private ld field_M;
    Object[] field_K;
    static String field_I;
    static wb[] field_O;
    private vn field_P;
    static ki field_H;
    int field_J;
    int field_N;
    int field_L;

    public static void f(int param0) {
        field_I = null;
        field_H = null;
        int var1 = 84 / ((-18 - param0) / 55);
        field_O = null;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        this.field_N = -1;
        if (!this.field_M.field_A) {
          return false;
        }
        if (!this.field_M.field_J.field_D.field_k) {
          return false;
        }
        if (null == this.field_K) {
          return super.b(param0, -1, param2, param3, param4);
        }
        param3 = param3 - (this.field_v + param4);
        param0 = param0 - (this.field_r + param2);
        if (param1 < ~param0) {
          return false;
        }
        if (param3 < 0) {
          return false;
        }
        if (param0 > this.field_q) {
          return false;
        }
        if (param3 > this.field_p) {
          return false;
        }
        this.field_N = param3 / this.field_J;
        if (this.field_K.length > this.field_N) {
          return true;
        }
        this.field_N = -1;
        return true;
    }

    final int e(byte param0) {
        int var2 = -28 / ((param0 + 73) / 48);
        return this.field_K == null ? 200 : (1 + this.field_K.length * 2) * this.field_J >> 1;
    }

    final Object a(int param0) {
        if (param0 >= -22) {
          this.a(((int[]) (this.field_K[0]))[0], ((int[]) (this.field_K[1]))[7], (byte) -89, -41);
          if (null == this.field_K) {
            return null;
          }
          if (this.field_L != -1) {
            return this.field_K[this.field_L];
          }
          return null;
        }
        if (null == this.field_K) {
          return null;
        }
        if (this.field_L != -1) {
          return this.field_K[this.field_L];
        }
        return null;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        param3 = param3 - this.field_v;
        param1 = param1 - this.field_r;
        if (this.field_K == null) {
          return;
        }
        int var5 = param3 / this.field_J;
        if (var5 < 0) {
          return;
        }
        if (var5 < this.field_K.length) {
          this.field_L = var5;
          this.field_M.h(0);
          return;
        }
    }

    private final void a(int param0, int param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_K = param2;
          this.field_N = -1;
          this.field_L = param1;
          if (param2 != null && (this.field_L < -1 ||
            this.field_K.length <= this.field_L)) {
            throw new IllegalStateException();
          }
          if (param0 == -22994) {
            return;
          }
          this.field_N = ((int[]) (this.field_K[1]))[1];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hd.DB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        Object var14;
        String var15;
        Object var16;
        String var17;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (param3 != 0) {
          return;
        }
        if (param2 < -35) {
          var5 = param0 + this.field_r;
          var6 = param1 + this.field_v;
          lk.d(var5, var6, this.field_q, this.field_p, 0);
          var7 = this.field_L;
          if (-1 != this.field_N) {
            var7 = this.field_N;
          }
          if (this.field_K == null) {
            return;
          }
          for (var8 = 0; this.field_K.length > var8; var8++) {
            var16 = this.field_K[var8];
            var17 = var16.toString();
            if (var7 == var8) {
              lk.b(2 + var5, var6 + 4, -4 + this.field_q, this.field_J, 2188450, 128);
            }
            var6 = var6 + this.field_J;
            this.field_P.b(var17, 2 + var5, var6, 10000536, -1);
          }
          return;
        }
        this.b(56, -9, false, ((int[]) (this.field_K[0]))[2]);
        var5Lifetime1 = param0 + this.field_r;
        var6Lifetime1 = param1 + this.field_v;
        lk.d(var5Lifetime1, var6Lifetime1, this.field_q, this.field_p, 0);
        var7Lifetime1 = this.field_L;
        if (-1 != this.field_N) {
          var7Lifetime1 = this.field_N;
        }
        if (this.field_K == null) {
          return;
        }
        for (var8Lifetime1 = 0; this.field_K.length > var8Lifetime1; var8Lifetime1++) {
          var14 = this.field_K[var8Lifetime1];
          var15 = var14.toString();
          if (var7Lifetime1 == var8Lifetime1) {
            lk.b(2 + var5Lifetime1, var6Lifetime1 + 4, -4 + this.field_q, this.field_J, 2188450, 128);
          }
          var6Lifetime1 = var6Lifetime1 + this.field_J;
          this.field_P.b(var15, 2 + var5Lifetime1, var6Lifetime1, 10000536, -1);
        }
    }

    hd(ld param0, vn param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.field_M = param0;
          this.field_P = param1;
          this.field_J = this.field_P.field_I + this.field_P.field_s;
          this.a(-22994, param3, param2);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_I = "regular";
    }
}
