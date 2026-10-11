/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends mf {
    static int field_l;
    private og field_k;

    fe(og param0, og param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ok a(int param0, String param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_4_0 = null;
        ok stackIn_7_0 = null;
        ok stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof wa) {
            var3 = ((wa) ((Object) this.field_k)).a((byte) 119);
            if (var3 != null &&
              var3.a(true) != gf.field_V) {
              stackIn_4_0 = hg.field_c;
              return stackIn_4_0;
            }
          }
          if (param0 != -1) {
            stackIn_7_0 = (ok) null;
            return stackIn_7_0;
          }
          if (!param1.equals(this.field_k.field_k)) {
            stackIn_11_0 = hg.field_c;
          } else {
            stackIn_11_0 = gf.field_V;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof wa) {
            var3 = ((wa) ((Object) this.field_k)).a((byte) 113);
            if (var3 != null) {
              if (var3.a(true) == gf.field_V &&
                !param0.equals(this.field_k.field_k)) {
                stackIn_8_0 = ec.field_h;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.a(-2864);
              return stackIn_10_0;
            }
          }
          if (param1 != -1) {
            fe.c((byte) -51);
          }
          if (param0.equals(this.field_k.field_k)) {
            return null;
          }
          stackIn_16_0 = ec.field_h;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        ob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ob var3 = null;
        ob var4 = null;
        var2 = wizardrun.field_H;
        try {
          var3 = new ob();
          var4 = var3;
          var4.field_b = 0;
          if (param0 <= 91) {
            return;
          }
          stackIn_5_0 = var4;
          while (stackIn_5_0.field_b < 20) {
            var4.field_a = 0;
            while (var4.field_a < 15) {
              if (tc.field_l.field_j[var3.a((byte) -68)] > 0) {
                lk.field_b[-1 + tc.field_l.field_j[var3.a((byte) -68)]].e(32 * var4.field_b, 32 * (-var4.field_a + 14));
              }
              if (0 < tc.field_l.field_a[var3.a((byte) -68)] &&
                oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]] != null) {
                oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]][0].e(var4.field_b * 32, 32 * (-1 + (15 - var4.field_a)));
              }
              if (tc.field_l.field_d[var3.a((byte) -68)] &&
                ke.field_w) {
                ed.d(32 * var4.field_b, -32 + (480 - var4.field_a * 32), 32, 32, 16777215, 128);
              }
              var4.field_a = var4.field_a + 1;
            }
            var4.field_b = var4.field_b + 1;
            stackIn_5_0 = var4;
          }
          if (wi.field_K != 0) {
            return;
          }
          ld.field_d.e(aa.field_ib.field_b * 24, 336 - aa.field_ib.field_a * 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "fe.B(" + param0 + ')');
        }
    }

    static {
    }
}
