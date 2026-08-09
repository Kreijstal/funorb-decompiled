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
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_s) {
          var2 = 68 % ((67 - param0) / 47);
          if (0 != this.field_w) {
            if (16777215 >= this.field_v) {
              gf.a(this.field_k, this.field_t, this.field_m, this.field_i, this.field_w, this.field_v);
              return;
            } else {
              gf.a(this.field_k, this.field_t, this.field_m, this.field_i, this.field_w, 16777215 & this.field_v, this.field_v >> 1659829432);
              return;
            }
          } else {
            if (-16777216 <= (this.field_v ^ -1)) {
              gf.d(this.field_k, this.field_t, this.field_m, this.field_i, this.field_v);
              return;
            } else {
              gf.c(this.field_k, this.field_t, this.field_m, this.field_i, 16777215 & this.field_v, this.field_v >> 439500344);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, ob param1, String param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 2232) {
              L1: {
                var3_int = param2.length();
                if (-256 > (var3_int ^ -1)) {
                  var3_int = 255;
                  break L1;
                } else {
                  break L1;
                }
              }
              param1.c(var3_int, (byte) -60);
              var4 = 0;
              L2: while (true) {
                if (var3_int <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param1.c((int) param2.charAt(var4), (byte) -57);
                  var4++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("b.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        ka.a(7321, 50);
    }
}
