/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private od field_a;
    private gk field_c;
    private gk field_b;

    final ne a(int param0, byte param1) {
        byte[] var4 = null;
        ne var3 = (ne) (this.field_a.a((long)param0, 1872));
        if (var3 != null) {
          return var3;
        }
        if (param0 >= 32768) {
          var4 = this.field_c.b(92, 32767 & param0, 1);
        } else {
          var4 = this.field_b.b(114, param0, 1);
        }
        var3 = new ne();
        if (param1 > -88) {
          return (ne) null;
        }
        if (var4 != null) {
          var3.a(-124, new wi(var4));
        }
        if (32768 > param0) {
          this.field_a.a(var3, (long)param0, 1);
          return var3;
        }
        var3.d(31680);
        this.field_a.a(var3, (long)param0, 1);
        return var3;
    }

    private kh() throws Throwable {
        throw new Error();
    }

    final static boolean a(si param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 30256) {
            stackIn_4_0 = param0.a((byte) 53);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kh.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(tg param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wa.a(true);
          na.a(param0.field_v, param0.field_t, param0.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("kh.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
