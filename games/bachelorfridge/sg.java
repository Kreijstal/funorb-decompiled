/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends td {
    static eq field_p;
    static int[] field_q;
    static boolean field_r;

    final ii a(op param0, int param1) {
        int var6 = 0;
        ps stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ps var4 = null;
        int var5 = 0;
        aga var7 = null;
        int var8 = 0;
        op var9 = null;
        aga var10 = null;
        var8 = BachelorFridge.field_y;
        try {
          var10 = this.field_h.a(91, param0);
          var4 = new ps(this.field_g, new nq(var10));
          var5 = 0;
          if (param1 != 3) {
            var9 = (op) null;
            this.a((op) null, -50);
          }
          while (var5 < param0.field_d) {
            for (var6 = 0; 7 > var6; var6++) {
              if (null != param0.field_S[var5].field_b[var6]) {
                var7 = param0.field_S[var5].field_b[var6];
                if (var7.field_A &&
                  var7.i(68) &&
                  param0.field_a[var7.field_x][var7.field_J].field_l == null) {
                  var4.field_o.a(new iv(new nq(var7), false, 1, -10, 35), true);
                  var4.field_o.a(new cn(new nq(var7), var7.field_x, var7.field_J), true);
                }
              }
            }
            var5++;
          }
          stackIn_16_0 = var4;
          return (ii) ((Object) stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("sg.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    sg(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c(byte param0) {
        int var1 = 46 % ((param0 + 42) / 51);
        field_q = null;
        field_p = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1816304479) {
          field_r = false;
        }
        int var3 = param2 >> 31 & -1 + param0;
        return var3 + ((param2 >>> 31) + param2) % param0;
    }

    static {
        field_q = vv.a((byte) 121);
    }
}
