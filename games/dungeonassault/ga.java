/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends ip {
    static cn[] field_o;
    static int field_p;
    private be field_q;
    private String field_m;
    static int field_n;
    static cn field_r;
    private boolean field_s;

    public static void d(byte param0) {
        field_r = null;
        if (param0 != 75) {
          field_o = (cn[]) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q.a(param1, 65) == pd.field_J) {
            stackIn_3_0 = this.field_q.a((byte) 96, param1);
            return stackIn_3_0;
          }
          if (this.a(param1, 60) == pd.field_J) {
            stackIn_6_0 = pj.field_n;
            return stackIn_6_0;
          }
          if (param0 < 44) {
            var4 = (String) null;
            this.a((byte) 49, (String) null);
          }
          stackIn_10_0 = sh.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ga.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        me var4 = null;
        od stackIn_2_0 = null;
        od stackIn_7_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -10 / ((5 - param1) / 44);
          if (this.field_q.a(param0, 104) == pd.field_J) {
            stackIn_2_0 = pd.field_J;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_m)) {
            var4 = gk.a(-115, param0);
            if (!var4.b(36)) {
              stackIn_7_0 = oc.field_A;
              return stackIn_7_0;
            }
            this.field_m = param0;
            this.field_s = var4.a((byte) 109);
          }
          if (this.field_s) {
            stackIn_12_0 = c.field_d;
          } else {
            stackIn_12_0 = pd.field_J;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ga.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.awt.Frame a(qg param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        ki[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        ki[] var10 = null;
        pn var11 = null;
        var9 = DungeonAssault.field_K;
        try {
          if (!param0.a(50)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param2 == 0) {
            var10 = kc.a(param0, 10);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param1 == var10[var8].field_g &&
                var10[var8].field_d == param5 && ((param3 == 0 ||
                var10[var8].field_a == param3) &&
                (var7_int == 0 ||
                !(var10[var8].field_b <= param2)))) {
                param2 = var10[var8].field_b;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_24_0 = null;
              return (java.awt.Frame) (stackIn_24_0);
            }
          }
          var11 = param0.a((byte) -102, param3, param1, param2, param5);
          if (param4 <= 99) {
            field_o = (cn[]) null;
          }
          while (var11.field_c == 0) {
            pj.a(0, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_f);
          if (var7 == null) {
            stackIn_31_0 = null;
            return (java.awt.Frame) (stackIn_31_0);
          }
          if (2 != var11.field_c) {
            stackIn_36_0 = var7;
            return stackIn_36_0;
          }
          ng.a(param0, 48, var7);
          stackIn_34_0 = null;
          return (java.awt.Frame) (stackIn_34_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_39_0 = var6_ref;
          stackIn_39_1 = new StringBuilder().append("ga.B(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ga(rm param0, rm param1) {
        super(param0);
        this.field_m = "";
        this.field_s = false;
        try {
          this.field_q = new be(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = 250;
        field_n = 1;
    }
}
