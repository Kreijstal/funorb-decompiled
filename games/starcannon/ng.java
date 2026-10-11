/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends fe implements ub {
    private int field_K;
    private he field_L;

    public final he a(boolean param0) {
        if (param0) {
          return (he) null;
        }
        return this.field_L;
    }

    ng(String param0, qg param1, int param2) {
        super(param0, param1, param2);
    }

    final static void h(byte param0) {
        int var1 = -66 / ((param0 - 23) / 56);
        String var2 = (String) null;
        kg.a((String) null, wj.field_c, (byte) 92);
    }

    final String d(int param0) {
        if (!this.field_h) {
          return null;
        }
        if (this.field_p == null) {
          return null;
        }
        vc.a(la.field_c, pe.field_d - this.field_K + this.field_i, 1);
        if (param0 != 12606) {
          return (String) null;
        }
        return this.field_p;
    }

    final static void k(int param0) {
        if (param0 <= 65) {
          ng.k(69);
        }
    }

    final void f(boolean param0) {
        super.f(param0);
        if (null != this.field_L) {
          this.field_L.a((byte) 58);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        if (param0 < 27) {
          return;
        }
        try {
          super.a(90, param1, param2, param3);
          this.field_K = -param1 + pe.field_d - this.field_s;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ng.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void j(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = StarCannon.field_A;
        try {
          var1_int = jf.field_a[0];
          for (var2 = param0; var2 < jf.field_a.length; var2++) {
            var3 = jf.field_a[var2];
            ug.a(ih.field_d, var2 << 4, ih.field_d, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ng.P(" + param0 + ')');
        }
    }

    final void a(he param0, int param1) {
        try {
          this.field_L = param0;
          if (param1 != 0) {
            he var4 = (he) null;
            this.a((he) null, 118);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ng.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static sk a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        sk var5 = null;
        sk stackIn_4_0 = null;
        sk stackIn_7_0 = null;
        sk stackIn_10_0 = null;
        sk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            if (param0 < 94) {
              stackIn_7_0 = (sk) null;
              return stackIn_7_0;
            }
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_10_0 = qb.field_b;
              return stackIn_10_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = vk.a((byte) 63, var3);
            if (var5 == null) {
              return b.a(var4, 112);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = tg.field_x;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ng.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
    }
}
