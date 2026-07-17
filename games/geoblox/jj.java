/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    private ra field_e;
    static String field_c;
    private int field_d;
    private gi field_f;
    static String[] field_a;
    static int field_g;
    private int field_b;

    private final void a(long param0) {
        fj var4 = (fj) (Object) ((jj) this).field_f.a(param0, (byte) -72);
        this.a(-117, var4);
    }

    private final void a(long param0, int param1, boolean param2, Object param3) {
        fj var6 = null;
        gj var6_ref = null;
        int var7 = Geoblox.field_C;
        try {
            if (!(((jj) this).field_b >= 1)) {
                throw new IllegalStateException();
            }
            int discarded$0 = 0;
            this.a(param0);
            ((jj) this).field_d = ((jj) this).field_d - 1;
            while (0 > ((jj) this).field_d) {
                var6 = (fj) (Object) ((jj) this).field_e.a((byte) -41);
                this.a(114, var6);
            }
            var6_ref = new gj(param3, 1);
            ((jj) this).field_f.a(param0, -99, (hf) (Object) var6_ref);
            ((jj) this).field_e.a(-1, (rc) (Object) var6_ref);
            ((fj) (Object) var6_ref).field_i = 0L;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jj.F(" + param0 + 44 + 1 + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        gj var6 = null;
        fj var7 = null;
        var7 = (fj) (Object) ((jj) this).field_f.a(param1, (byte) 61);
        if (var7 != null) {
          var5 = var7.e((byte) 120);
          if (param0 >= 56) {
            if (var5 == null) {
              var7.a(false);
              var7.a((byte) 92);
              ((jj) this).field_d = ((jj) this).field_d + var7.field_n;
              return null;
            } else {
              if (var7.g(13)) {
                var6 = new gj(var5, var7.field_n);
                ((jj) this).field_f.a(var7.field_a, -81, (hf) (Object) var6);
                ((jj) this).field_e.a(-1, (rc) (Object) var6);
                ((fj) (Object) var6).field_i = 0L;
                var7.a(false);
                var7.a((byte) 93);
                return var5;
              } else {
                ((jj) this).field_e.a(-1, (rc) (Object) var7);
                var7.field_i = 0L;
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, long param1, Object param2) {
        try {
            int var5_int = 4 / ((param0 - 56) / 59);
            this.a(param1, 1, false, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jj.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b() {
        jk.field_d = 0;
    }

    private final void a(int param0, fj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3_int = -56 % ((61 - param0) / 42);
            if (param1 == null) {
              break L0;
            } else {
              param1.a(false);
              param1.a((byte) 75);
              ((jj) this).field_d = ((jj) this).field_d + param1.field_n;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("jj.B(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void a() {
        field_a = null;
        int var1 = 3;
        field_c = null;
    }

    private jj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Login: ";
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = 13;
    }
}
