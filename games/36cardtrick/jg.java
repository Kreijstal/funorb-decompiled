/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends je {
    private int field_l;
    private je field_k;

    final void a(int param0) {
        if (this.field_l > param0) {
          this.field_l = this.field_l - param0;
          return;
        }
        param0 = param0 - this.field_l;
        this.field_k.field_d = this.field_d;
        this.field_k.field_a = this.field_a;
        this.field_l = 0;
        this.field_a.field_d = (qb) ((Object) this.field_k);
        this.field_d.field_a = (qb) ((Object) this.field_k);
        this.field_a = null;
        this.field_d = null;
        if (0 < param0) {
          this.field_k.a(param0);
        }
    }

    final je a() {
        return null;
    }

    final int d() {
        return this.field_k.d();
    }

    final int c() {
        return 0;
    }

    final je b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l > param2) {
            this.field_l = this.field_l - param2;
            return;
          }
          param1 = param1 + this.field_l;
          param2 = param2 - this.field_l;
          this.field_k.field_a = this.field_a;
          this.field_k.field_d = this.field_d;
          this.field_l = 0;
          this.field_a.field_d = (qb) ((Object) this.field_k);
          this.field_d.field_a = (qb) ((Object) this.field_k);
          this.field_a = null;
          this.field_d = null;
          if (param2 <= 0) {
            return;
          }
          this.field_k.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jg.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    jg(je param0, int param1) {
        try {
          this.field_k = param0;
          this.field_i = this.field_k.field_i;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
