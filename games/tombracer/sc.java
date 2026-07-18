/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends cg {
    private cg field_j;
    private int field_l;
    static int field_k;

    final void a(int param0) {
        if (((sc) this).field_l > param0) {
          ((sc) this).field_l = ((sc) this).field_l - param0;
          return;
        } else {
          param0 = param0 - ((sc) this).field_l;
          ((sc) this).field_j.field_a = ((sc) this).field_a;
          ((sc) this).field_l = 0;
          ((sc) this).field_j.field_e = ((sc) this).field_e;
          ((sc) this).field_e.field_a = (vg) (Object) ((sc) this).field_j;
          ((sc) this).field_a.field_e = (vg) (Object) ((sc) this).field_j;
          ((sc) this).field_e = null;
          ((sc) this).field_a = null;
          if (param0 > 0) {
            ((sc) this).field_j.a(param0);
            return;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2 >= ((sc) this).field_l) {
              param2 = param2 - ((sc) this).field_l;
              param1 = param1 + ((sc) this).field_l;
              ((sc) this).field_l = 0;
              ((sc) this).field_j.field_a = ((sc) this).field_a;
              ((sc) this).field_j.field_e = ((sc) this).field_e;
              ((sc) this).field_e.field_a = (vg) (Object) ((sc) this).field_j;
              ((sc) this).field_a.field_e = (vg) (Object) ((sc) this).field_j;
              ((sc) this).field_a = null;
              ((sc) this).field_e = null;
              if (param2 > 0) {
                ((sc) this).field_j.b(param0, param1, param2);
                break L0;
              } else {
                return;
              }
            } else {
              ((sc) this).field_l = ((sc) this).field_l - param2;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("sc.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final cg b() {
        return null;
    }

    final int d() {
        return ((sc) this).field_j.d();
    }

    final int a() {
        return 0;
    }

    sc(cg param0, int param1) {
        try {
            ((sc) this).field_j = param0;
            ((sc) this).field_l = param1;
            ((sc) this).field_i = ((sc) this).field_j.field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final cg c() {
        return null;
    }

    static {
    }
}
