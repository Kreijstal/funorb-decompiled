/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends na {
    private nq field_g;
    private String field_e;
    static os field_h;
    static String field_f;
    private boolean field_i;

    wk(dh param0, dh param1) {
        super(param0);
        this.field_e = "";
        this.field_i = false;
        try {
          this.field_g = new nq(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var4 = (String) null;
            this.a(-5, (String) null);
          }
          if (this.field_g.a((byte) 26, param1) == qr.field_e) {
            stackIn_4_0 = this.field_g.a(0, param1);
            return stackIn_4_0;
          }
          if (this.a((byte) 26, param1) != qr.field_e) {
            stackIn_9_0 = nw.field_h;
            return stackIn_9_0;
          }
          stackIn_7_0 = oj.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final gf a(byte param0, String param1) {
        bj var3 = null;
        RuntimeException var3_ref = null;
        gf stackIn_3_0 = null;
        gf stackIn_7_0 = null;
        gf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g.a(param0, param1) == qr.field_e) {
            stackIn_3_0 = qr.field_e;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_e)) {
            var3 = ov.a(param0 ^ 27, param1);
            if (!var3.a(true)) {
              stackIn_7_0 = kt.field_a;
              return stackIn_7_0;
            }
            this.field_e = param1;
            this.field_i = var3.c(-1);
          }
          if (this.field_i) {
            stackIn_12_0 = qe.field_a;
          } else {
            stackIn_12_0 = qr.field_e;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
          wk.b(true);
        }
    }

    static {
        field_h = new os();
    }
}
