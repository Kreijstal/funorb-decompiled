/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends me {
    static int field_l;
    private rg field_j;
    static volatile int field_k;

    final static boolean g(int param0) {
        int var2 = 0;
        ba var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ba var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (ba) (wg.field_f.a((byte) -95));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != -5591) {
            field_k = -92;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (var4.field_m[var2] != null &&
              var4.field_m[var2].field_c == 0) {
              return false;
            }
            if (null != var4.field_o[var2] &&
              var4.field_o[var2].field_c == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "cg.E(" + param0 + ')');
        }
    }

    cg(rg param0, rg param1) {
        super(param0);
        try {
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        int var1 = 118 / ((68 - param0) / 37);
        pg.a(0);
    }

    final rc a(int param0, String param1) {
        wa var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rc stackIn_7_0 = null;
        rc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 95) {
            var4 = (String) null;
            this.a(41, (String) null);
          }
          if (this.field_j instanceof ie) {
            var3 = ((ie) ((Object) this.field_j)).a((byte) 113);
            if (var3 != null &&
              var3.a(27835) != hi.field_b) {
              stackIn_7_0 = ec.field_d;
              return stackIn_7_0;
            }
          }
          if (!param1.equals(this.field_j.field_k)) {
            stackIn_11_0 = ec.field_d;
          } else {
            stackIn_11_0 = hi.field_b;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static ci a(byte param0, int param1) {
        if (param0 == -82) {
          return mh.a(-26159, false, true, false, 1, param1);
        }
        field_k = 79;
        return mh.a(-26159, false, true, false, 1, param1);
    }

    final String b(int param0, String param1) {
        wa var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_j instanceof ie) {
            var3 = ((ie) ((Object) this.field_j)).a((byte) 94);
            if (var3 != null) {
              if (var3.a(param0 ^ -27836) == hi.field_b &&
                !param1.equals(this.field_j.field_k)) {
                stackIn_6_0 = gl.field_C;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.c(param0 + 30524);
              return stackIn_8_0;
            }
          }
          if (param0 != -1) {
            stackIn_11_0 = (String) null;
            return stackIn_11_0;
          }
          if (param1.equals(this.field_j.field_k)) {
            return null;
          }
          stackIn_15_0 = gl.field_C;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("cg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_k = 0;
    }
}
