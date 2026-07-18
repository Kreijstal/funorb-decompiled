/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends je {
    private int field_l;
    private je field_k;

    final void a(int param0) {
        if (!(((jg) this).field_l <= param0)) {
            ((jg) this).field_l = ((jg) this).field_l - param0;
            return;
        }
        param0 = param0 - ((jg) this).field_l;
        ((jg) this).field_k.field_d = ((jg) this).field_d;
        ((jg) this).field_k.field_a = ((jg) this).field_a;
        ((jg) this).field_l = 0;
        ((jg) this).field_a.field_d = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_d.field_a = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_a = null;
        ((jg) this).field_d = null;
        if (!(0 >= param0)) {
            ((jg) this).field_k.a(param0);
        }
    }

    final je a() {
        return null;
    }

    final int d() {
        return ((jg) this).field_k.d();
    }

    final int c() {
        return 0;
    }

    final je b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((jg) this).field_l > param2) {
              ((jg) this).field_l = ((jg) this).field_l - param2;
              return;
            } else {
              param1 = param1 + ((jg) this).field_l;
              param2 = param2 - ((jg) this).field_l;
              ((jg) this).field_k.field_a = ((jg) this).field_a;
              ((jg) this).field_k.field_d = ((jg) this).field_d;
              ((jg) this).field_l = 0;
              ((jg) this).field_a.field_d = (qb) (Object) ((jg) this).field_k;
              ((jg) this).field_d.field_a = (qb) (Object) ((jg) this).field_k;
              ((jg) this).field_a = null;
              ((jg) this).field_d = null;
              if (param2 > 0) {
                ((jg) this).field_k.a(param0, param1, param2);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("jg.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    jg(je param0, int param1) {
        try {
            ((jg) this).field_k = param0;
            ((jg) this).field_i = ((jg) this).field_k.field_i;
            ((jg) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
