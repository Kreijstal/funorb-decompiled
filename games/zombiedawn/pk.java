/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends gl {
    static int field_N;
    private nh field_M;
    int field_I;
    Object[] field_L;
    private rb field_H;
    int field_O;
    int field_K;
    static boolean field_J;

    private final void a(int param0, byte param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_K = param0;
          this.field_O = -1;
          this.field_L = param2;
          if (param1 != 94) {
            this.b(((int[]) (this.field_L[37]))[8], 8, ((int[]) (this.field_L[1]))[1], 39, -119);
          }
          if (param2 == null) {
            return;
          }
          if (this.field_K >= -1 &&
            this.field_K < this.field_L.length) {
            return;
          }
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("pk.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = ZombieDawn.field_J;
        if (param1 != 0) {
          return;
        }
        int var5 = param2 + this.field_k;
        int var6 = param0 + this.field_j;
        bi.b(var5, var6, this.field_i, this.field_n, 0);
        int var7 = this.field_K;
        if (param3 != ~this.field_O) {
          var7 = this.field_O;
        }
        if (this.field_L != null) {
          for (var8 = 0; this.field_L.length > var8; var8++) {
            var9 = this.field_L[var8];
            var10 = var9.toString();
            if (var8 == var7) {
              bi.a(2 + var5, var6 + 4, -4 + this.field_i, this.field_I, 2188450, 128);
            }
            var6 = var6 + this.field_I;
            this.field_H.c(var10, 2 + var5, var6, 10000536, -1);
          }
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = -12 / ((param1 + 12) / 56);
        super.b(param0, -103, param2, param3);
        param0 = param0 - this.field_k;
        param2 = param2 - this.field_j;
        if (null == this.field_L) {
          return;
        }
        int var6 = param2 / this.field_I;
        if (var6 < 0) {
          return;
        }
        if (this.field_L.length > var6) {
          this.field_K = var6;
          this.field_M.b(true);
          return;
        }
    }

    final Object g(int param0) {
        if (param0 != 0) {
          this.b(70, ((int[]) (this.field_L[25]))[1], ((int[]) (((Object[]) (this.field_L[4]))[1]))[5], ((int[]) (((Object[]) (this.field_L[6]))[4]))[0], ((int[]) (this.field_L[0]))[3]);
          if (null != this.field_L) {
            return this.field_K == -1 ? null : this.field_L[this.field_K];
          }
          return null;
        }
        if (null == this.field_L) {
          return null;
        }
        if (this.field_K != -1) {
          return this.field_L[this.field_K];
        }
        return null;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        this.field_O = -1;
        if (!this.field_M.field_H) {
          return false;
        }
        if (param1 != 21224) {
          this.field_H = (rb) null;
        }
        if (!this.field_M.field_F.field_D.field_l) {
          return false;
        }
        if (this.field_L == null) {
          return super.b(param0, 21224, param2, param3, param4);
        }
        param4 = param4 - (param3 + this.field_k);
        param0 = param0 - (param2 + this.field_j);
        if (0 > param4) {
          return false;
        }
        if (param0 < 0) {
          return false;
        }
        if (param4 > this.field_i) {
          return false;
        }
        if (param0 > this.field_n) {
          return false;
        }
        this.field_O = param0 / this.field_I;
        if (this.field_L.length <= this.field_O) {
          this.field_O = -1;
        }
        return true;
    }

    final int h(int param0) {
        if (param0 == 1227847265) {
          return null == this.field_L ? 200 : (2 * this.field_L.length + 1) * this.field_I >> 1;
        }
        this.a(49, (byte) -85, (Object[]) (this.field_L[5]));
        return null == this.field_L ? 200 : (2 * this.field_L.length + 1) * this.field_I >> 1;
    }

    pk(nh param0, rb param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.field_M = param0;
          this.field_H = param1;
          this.field_I = this.field_H.field_I + this.field_H.field_x;
          this.a(param3, (byte) 94, param2);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_N = 640;
        field_J = false;
    }
}
