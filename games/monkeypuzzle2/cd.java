/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;

    final void a(boolean param0, java.applet.Applet param1) {
        try {
          if (param0) {
            this.field_a = (String) null;
          }
          wg.a("jagex-last-login-method", param1, this.field_a, -26372, 31536000L);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "cd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cd(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            cd.a(51);
          }
          stackIn_3_0 = this.field_a.equals(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!vh.c((byte) -93)) {
            if (null != ba.field_f &&
              ba.field_f.field_d) {
              wl.e((byte) 120);
              si.field_o.b((byte) -56, new s(si.field_o, cg.field_c));
            }
            return;
          }
          var1_int = 63 / ((59 - param0) / 47);
          si.field_o.a(mb.field_a, mb.field_d, true, true);
          si.field_o.l(-43);
          while (ba.a(-1)) {
            si.field_o.a(oa.field_H, 121, rd.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "cd.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        fk.field_a = false;
        ah.field_h = false;
        qh.a(param0, true);
        ed.field_c = di.field_a;
        ch.field_d = di.field_a;
    }

    final static void a(hl param0, byte param1) {
        int var2_int = 0;
        RuntimeException runtimeException = null;
        hl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0.field_c == null) {
            return;
          }
          if (param0.field_g != 0 ||
            param0.field_k != 0) {
            for (var2_int = 0; var2_int < ea.field_c; var2_int++) {
              var3 = pg.field_e[var2_int];
              if (var3.field_i == 2 &&
                var3.field_g == param0.field_g &&
                var3.field_k == param0.field_k) {
                return;
              }
            }
          }
          if (param0.field_l == null) {
          }
          if (param1 != 20) {
            return;
          }
          qh.a(param0, 6191);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_23_0 = runtimeException;
          stackIn_23_1 = new StringBuilder().append("cd.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
