/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private nm field_f;
    static int[][] field_e;
    private vl field_g;
    static int field_a;
    static jp[][] field_d;
    static int[][] field_c;
    static mf field_i;
    static int[][] field_h;
    static jp field_b;

    public static void c() {
        field_b = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_e = null;
        field_c = null;
    }

    final nm a(boolean param0) {
        nm var2 = null;
        var2 = ((kh) this).field_g.field_e.field_b;
        if (param0) {
          if (var2 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          nm discarded$7 = ((kh) this).a(-11);
          if (var2 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var2.field_b;
            return var2;
          }
        }
    }

    final nm d(int param0) {
        if (param0 != -24706) {
            return null;
        }
        nm var2 = ((kh) this).field_f;
        if (!(((kh) this).field_g.field_e != var2)) {
            ((kh) this).field_f = null;
            return null;
        }
        ((kh) this).field_f = var2.field_b;
        return var2;
    }

    kh(vl param0) {
        try {
            ((kh) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final nm b(int param0) {
        nm var2 = null;
        if (param0 != 7) {
            Object var3 = null;
            nm discarded$0 = ((kh) this).b(16, (nm) null);
            var2 = ((kh) this).field_f;
            if (!(var2 != ((kh) this).field_g.field_e)) {
                ((kh) this).field_f = null;
                return null;
            }
            ((kh) this).field_f = var2.field_e;
            return var2;
        }
        var2 = ((kh) this).field_f;
        if (!(var2 != ((kh) this).field_g.field_e)) {
            ((kh) this).field_f = null;
            return null;
        }
        ((kh) this).field_f = var2.field_e;
        return var2;
    }

    final nm a(int param0) {
        nm var2 = null;
        var2 = ((kh) this).field_g.field_e.field_e;
        if (var2 == ((kh) this).field_g.field_e) {
          ((kh) this).field_f = null;
          return null;
        } else {
          ((kh) this).field_f = var2.field_e;
          if (param0 != 240) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final nm b(int param0, nm param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        nm stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((kh) this).field_g.field_e.field_b;
                break L1;
              }
            }
            L2: {
              if (param0 == 16802) {
                break L2;
              } else {
                nm discarded$2 = ((kh) this).d(-118);
                break L2;
              }
            }
            if (var3 != ((kh) this).field_g.field_e) {
              ((kh) this).field_f = var3.field_b;
              stackOut_8_0 = (nm) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((kh) this).field_f = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (nm) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("kh.F(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final nm a(int param0, nm param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        nm stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        nm stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((kh) this).field_g.field_e.field_e;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((kh) this).field_g.field_e == var3) {
              ((kh) this).field_f = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (nm) (Object) stackIn_6_0;
            } else {
              ((kh) this).field_f = var3.field_e;
              if (param0 >= 100) {
                stackOut_10_0 = (nm) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (nm) (Object) stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("kh.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[5][];
        field_c = new int[5][];
        field_h = new int[5][];
        field_c[0] = new int[1];
        field_c[3] = new int[5];
        field_c[4] = new int[5];
        field_c[2] = new int[5];
        field_c[1] = new int[2];
        field_e[4] = new int[5];
        field_e[3] = new int[5];
        field_e[2] = new int[5];
        field_e[1] = new int[2];
        field_e[0] = new int[1];
        field_h[0] = new int[1];
        field_h[2] = new int[5];
        field_h[4] = new int[5];
        field_h[3] = new int[5];
        field_h[1] = new int[2];
    }
}
