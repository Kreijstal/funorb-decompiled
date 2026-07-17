/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static String field_j;
    static boolean field_k;
    private ul field_h;
    static int field_f;
    private ck field_a;
    static String field_i;
    static boolean field_d;
    static gk[] field_c;
    static wk field_b;
    static String field_e;
    static String field_g;

    final ck a(int param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
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
              if (param1 == null) {
                var3 = ((jc) this).field_h.field_e.field_i;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((jc) this).field_h.field_e != var3) {
              ((jc) this).field_a = var3.field_i;
              if (param0 == 24192) {
                stackOut_9_0 = (ck) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (ck) (Object) stackIn_8_0;
              }
            } else {
              ((jc) this).field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ck) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("jc.B(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final ck b(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            Object var3 = null;
            ck discarded$0 = ((jc) this).a(-4, (ck) null);
            var2 = ((jc) this).field_h.field_e.field_k;
            if (!(var2 != ((jc) this).field_h.field_e)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_k;
            return var2;
        }
        var2 = ((jc) this).field_h.field_e.field_k;
        if (!(var2 != ((jc) this).field_h.field_e)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_k;
        return var2;
    }

    final static String b() {
        if (!pg.field_A) {
          if (si.field_m >= ik.field_c) {
            if (ik.field_c + ni.field_c <= si.field_m) {
              return null;
            } else {
              return rc.field_b;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 2) {
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = null;
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    jc(ul param0) {
        try {
            ((jc) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "jc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final ck d(int param0) {
        ck var2 = null;
        if (param0 == 2) {
          var2 = ((jc) this).field_a;
          if (((jc) this).field_h.field_e == var2) {
            ((jc) this).field_a = null;
            return null;
          } else {
            ((jc) this).field_a = var2.field_k;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a() {
        nm.field_n = null;
        dj.field_j = null;
        vl.field_r = false;
        oc.field_d = null;
        a.field_g = null;
    }

    final ck c(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            ((jc) this).field_h = null;
            var2 = ((jc) this).field_h.field_e.field_i;
            if (!(var2 != ((jc) this).field_h.field_e)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_i;
            return var2;
        }
        var2 = ((jc) this).field_h.field_e.field_i;
        if (!(var2 != ((jc) this).field_h.field_e)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0) {
        ck var2 = null;
        if (!param0) {
            boolean discarded$0 = jc.a(-87);
            var2 = ((jc) this).field_a;
            if (!(((jc) this).field_h.field_e != var2)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_i;
            return var2;
        }
        var2 = ((jc) this).field_a;
        if (!(((jc) this).field_h.field_e != var2)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
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
              if (param1 == null) {
                var3 = ((jc) this).field_h.field_e.field_k;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((jc) this).field_h.field_e != var3) {
              ((jc) this).field_a = var3.field_k;
              if (!param0) {
                stackOut_9_0 = (ck) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (ck) (Object) stackIn_8_0;
              }
            } else {
              ((jc) this).field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ck) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("jc.A(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    public static void e() {
        field_i = null;
        field_j = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Movement and Navigation";
        field_f = 2;
        field_k = false;
        field_e = "RESIGNED";
        field_i = "Return to Main Menu";
        field_g = "Your ignore list is full. Max of 100 hit.";
    }
}
