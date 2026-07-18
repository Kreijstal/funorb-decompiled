/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static boolean field_e;
    private ug field_c;
    static int field_b;
    static String field_f;
    static le[] field_a;
    private pj field_h;
    static String field_d;
    static int[] field_g;

    public static void b() {
        field_a = null;
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final ug a(byte param0, ug param1) {
        ug var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ug stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ug stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -127) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = ((ck) this).field_h.field_f.field_d;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (var3 == ((ck) this).field_h.field_f) {
              ((ck) this).field_c = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ug) (Object) stackIn_8_0;
            } else {
              ((ck) this).field_c = var3.field_d;
              stackOut_9_0 = (ug) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static le[] a(int param0, int param1) {
        le[] var3 = new le[9];
        le[] var2 = var3;
        var3[4] = sj.a(64, 74, param0);
        return var2;
    }

    final ug a(boolean param0) {
        ug var2 = null;
        var2 = ((ck) this).field_c;
        if (var2 != ((ck) this).field_h.field_f) {
          if (!param0) {
            field_d = null;
            ((ck) this).field_c = var2.field_d;
            return var2;
          } else {
            ((ck) this).field_c = var2.field_d;
            return var2;
          }
        } else {
          ((ck) this).field_c = null;
          return null;
        }
    }

    final ug b(byte param0) {
        ug var2 = null;
        if (param0 <= -95) {
          var2 = ((ck) this).field_h.field_f.field_c;
          if (var2 == ((ck) this).field_h.field_f) {
            ((ck) this).field_c = null;
            return null;
          } else {
            ((ck) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug a(int param0) {
        ug var2 = null;
        if (param0 != -3703) {
            ug discarded$0 = ((ck) this).a(false);
            var2 = ((ck) this).field_c;
            if (!(var2 != ((ck) this).field_h.field_f)) {
                ((ck) this).field_c = null;
                return null;
            }
            ((ck) this).field_c = var2.field_c;
            return var2;
        }
        var2 = ((ck) this).field_c;
        if (!(var2 != ((ck) this).field_h.field_f)) {
            ((ck) this).field_c = null;
            return null;
        }
        ((ck) this).field_c = var2.field_c;
        return var2;
    }

    ck(pj param0) {
        try {
            ((ck) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(byte param0) {
        ug var2 = null;
        var2 = ((ck) this).field_h.field_f.field_d;
        if (var2 == ((ck) this).field_h.field_f) {
          ((ck) this).field_c = null;
          return null;
        } else {
          ((ck) this).field_c = var2.field_d;
          if (param0 != -37) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final ug a(int param0, ug param1) {
        ug var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ug stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ug stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -11121) {
                break L1;
              } else {
                field_e = true;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((ck) this).field_h.field_f.field_c;
                break L2;
              }
            }
            if (((ck) this).field_h.field_f == var3) {
              ((ck) this).field_c = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ug) (Object) stackIn_8_0;
            } else {
              ((ck) this).field_c = var3.field_c;
              stackOut_9_0 = (ug) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ck.G(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_g = new int[]{0, 110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60};
        field_d = "This password is part of your Player Name, and would be easy to guess";
    }
}
