/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends vd {
    private int field_w;
    private int field_v;
    static int field_u;

    final static boolean d(byte param0) {
        int var1 = -7 % ((param0 - 76) / 32);
        return !ae.field_b ? true : false;
    }

    b(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        this.field_w = param4;
        this.field_v = param5;
    }

    final void a(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_s) {
          return;
        }
        int var2 = 68 % ((67 - param0) / 47);
        if (0 == this.field_w) {
          if (this.field_v > 16777215) {
            gf.c(this.field_k, this.field_t, this.field_m, this.field_i, 16777215 & this.field_v, this.field_v >> 24);
            return;
          }
          gf.d(this.field_k, this.field_t, this.field_m, this.field_i, this.field_v);
          return;
        }
        if (16777215 < this.field_v) {
          gf.a(this.field_k, this.field_t, this.field_m, this.field_i, this.field_w, 16777215 & this.field_v, this.field_v >> 24);
          return;
        }
        gf.a(this.field_k, this.field_t, this.field_m, this.field_i, this.field_w, this.field_v);
    }

    final static void a(int param0, ob param1, String param2) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != 2232) {
            return;
          }
          var3_int = param2.length();
          if (var3_int > 255) {
            var3_int = 255;
          }
          param1.c(var3_int, (byte) -60);
          for (var4 = 0; var3_int > var4; var4++) {
            param1.c((int) param2.charAt(var4), (byte) -57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("b.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        ka.a(7321, 50);
    }
}
