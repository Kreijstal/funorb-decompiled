/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends lf {
    static t field_o;
    uh field_r;
    static t field_n;
    private int[] field_p;
    static String field_q;

    final int a() {
        return 0;
    }

    final lf b() {
        return null;
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 != 160) {
          return;
        }
        field_q = null;
        field_o = null;
    }

    final lf c() {
        return (lf) ((Object) this.field_r);
    }

    final int d() {
        return 255 * on.field_c / 160;
    }

    final void a(int param0) {
        this.field_r.a(param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var6 = Torquing.field_u;
        try {
          if (!pi.field_r) {
            stackIn_4_0 = param2;
          } else {
            stackIn_4_0 = param2 << 1;
          }
          var4_int = stackIn_4_0;
          if (this.field_p != null &&
            var4_int <= this.field_p.length) {
            dk.a(this.field_p, 0, var4_int);
          } else {
            this.field_p = new int[var4_int];
          }
          this.field_r.b(this.field_p, 0, param2);
          if (pi.field_r) {
            param1 = param1 << 1;
          }
          var5 = 0;
          while (var4_int > var5) {
            incrementValue$0 = param1;
            param1++;
            incrementValue$1 = var5;
            var5++;
            param0[incrementValue$0] = param0[incrementValue$0] + on.field_c * this.field_p[incrementValue$1] / 160;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kk.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    kk() {
        this.field_r = new uh();
    }

    static {
        field_q = "Click to skip this page";
    }
}
