/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends kn implements sh {
    private hc[] field_N;
    static int[] field_J;
    private f field_I;
    private String[] field_O;
    static String field_P;
    static boolean field_L;
    static bj field_Q;
    static String field_K;
    static ea field_M;

    public static void o(int param0) {
        field_J = null;
        field_K = null;
        if (param0 != -2638) {
          ei.n(115);
        }
        field_M = null;
        field_P = null;
        field_Q = null;
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nc var4 = null;
        int var5 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          this.field_G.a((byte) 55);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_O = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_O[var4_int] = dn.a((CharSequence) ((Object) param1[var4_int]), false).replace(' ', ' ');
            }
            var4 = new nc(bn.field_d, 0, 1);
            var5 = -58 % ((-20 - param0) / 54);
            this.field_N = new hc[1 + var3_int];
            for (var6 = 0; var6 < var3_int; var6++) {
              this.field_N[var6] = new hc(this.field_O[var6], (rm) (this));
              this.field_N[var6].field_A = (ad) ((Object) var4);
              this.field_N[var6].field_n = vl.field_I;
              this.field_N[var6].a(15, -52, 0, 80, 20 + var6 * 16);
              this.a(-1, this.field_N[var6]);
            }
            this.field_N[var3_int] = new hc(gl.field_t, (rm) (this));
            this.field_N[var3_int].field_A = (ad) ((Object) var4);
            this.field_N[var3_int].a(15, -112, 0, 100, 16 * (var3_int + 1) + 20);
            this.a(-1, this.field_N[var3_int]);
            return;
          }
          this.field_O = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ei.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int n(int param0) {
        if (param0 != 0) {
          ei.o(116);
        }
        return hn.field_b;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        we var5 = bn.field_d;
        if (null != this.field_O) {
          var5.a(wj.field_i, param1 + this.field_u, this.field_t + param2, this.field_v, 20, 16777215, -1, 0, 0, var5.field_E + var5.field_I);
        }
    }

    ei(f param0) {
        super(0, 0, 0, 0, (ad) null);
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_6_0 = this.b(param1, param2 ^ -79);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param1, (byte) 12);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ei.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          var6_int = 0;
          if (param1 != 6) {
            this.field_N = (hc[]) null;
          }
          while (var6_int < this.field_O.length) {
            if (param2 == this.field_N[var6_int]) {
              this.field_I.a(this.field_O[var6_int], param1 ^ -105);
            }
            var6_int++;
          }
          if (this.field_N[this.field_O.length] == param2) {
            this.field_I.a((byte) 47);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_J = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_J[var1] = var0;
        }
        field_K = "Climbing hooks: Allows sheer surfaces to be scaled.";
        field_P = "Waiting for levels";
    }
}
