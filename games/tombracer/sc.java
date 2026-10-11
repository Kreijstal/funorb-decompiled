/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends cg {
    private cg field_j;
    private int field_l;
    static int field_k;

    final void a(int param0) {
        if (this.field_l > param0) {
          this.field_l = this.field_l - param0;
          return;
        }
        param0 = param0 - this.field_l;
        this.field_j.field_a = this.field_a;
        this.field_l = 0;
        this.field_j.field_e = this.field_e;
        this.field_e.field_a = (vg) ((Object) this.field_j);
        this.field_a.field_e = (vg) ((Object) this.field_j);
        this.field_e = null;
        this.field_a = null;
        if (param0 <= 0) {
          return;
        }
        this.field_j.a(param0);
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < this.field_l) {
            this.field_l = this.field_l - param2;
            return;
          }
          param2 = param2 - this.field_l;
          param1 = param1 + this.field_l;
          this.field_l = 0;
          this.field_j.field_a = this.field_a;
          this.field_j.field_e = this.field_e;
          this.field_e.field_a = (vg) ((Object) this.field_j);
          this.field_a.field_e = (vg) ((Object) this.field_j);
          this.field_a = null;
          this.field_e = null;
          if (param2 <= 0) {
            return;
          }
          this.field_j.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sc.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final cg b() {
        return null;
    }

    final int d() {
        return this.field_j.d();
    }

    final int a() {
        return 0;
    }

    sc(cg param0, int param1) {
        try {
          this.field_j = param0;
          this.field_l = param1;
          this.field_i = this.field_j.field_i;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final cg c() {
        return null;
    }

    static {
    }
}
