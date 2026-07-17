/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static int field_f;
    private oi field_d;
    static String field_c;
    static boolean field_g;
    static o field_b;
    private wl field_a;
    static char[] field_e;

    final static int c(byte param0) {
        int var1 = 48 / ((-9 - param0) / 52);
        return -fe.field_l + sj.field_n;
    }

    final wl b(int param0) {
        wl var2 = null;
        var2 = ((pf) this).field_a;
        if (param0 == 35) {
          if (((pf) this).field_d.field_a == var2) {
            ((pf) this).field_a = null;
            return null;
          } else {
            ((pf) this).field_a = var2.field_b;
            return var2;
          }
        } else {
          field_c = null;
          if (((pf) this).field_d.field_a == var2) {
            ((pf) this).field_a = null;
            return null;
          } else {
            ((pf) this).field_a = var2.field_b;
            return var2;
          }
        }
    }

    final wl a(wl param0, int param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wl stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        wl stackOut_9_0 = null;
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
              if (param1 < -59) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = ((pf) this).field_d.field_a.field_b;
                break L2;
              }
            }
            if (var3 == ((pf) this).field_d.field_a) {
              ((pf) this).field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (wl) (Object) stackIn_8_0;
            } else {
              ((pf) this).field_a = var3.field_b;
              stackOut_9_0 = (wl) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("pf.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 107) {
            return -123;
        }
        int var3 = param0 >>> 31;
        return (param0 - -var3) / param2 - var3;
    }

    final wl a(byte param0) {
        wl var2 = null;
        var2 = ((pf) this).field_d.field_a.field_b;
        if (((pf) this).field_d.field_a != var2) {
          ((pf) this).field_a = var2.field_b;
          if (param0 != 31) {
            ((pf) this).field_a = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pf) this).field_a = null;
          return null;
        }
    }

    final wl a(int param0, wl param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        wl stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        wl stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((pf) this).field_d.field_a.field_c;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (var3 == ((pf) this).field_d.field_a) {
              ((pf) this).field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (wl) (Object) stackIn_6_0;
            } else {
              var4 = -120 % ((param0 - 11) / 37);
              ((pf) this).field_a = var3.field_c;
              stackOut_7_0 = (wl) var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("pf.D(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final wl a(boolean param0) {
        wl var2 = null;
        var2 = ((pf) this).field_a;
        if (var2 != ((pf) this).field_d.field_a) {
          ((pf) this).field_a = var2.field_c;
          if (!param0) {
            field_g = true;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pf) this).field_a = null;
          return null;
        }
    }

    final wl b(byte param0) {
        wl var2 = ((pf) this).field_d.field_a.field_c;
        int var3 = -75 / ((-15 - param0) / 61);
        if (!(((pf) this).field_d.field_a != var2)) {
            ((pf) this).field_a = null;
            return null;
        }
        ((pf) this).field_a = var2.field_c;
        return var2;
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
    }

    pf(oi param0) {
        try {
            ((pf) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "pf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Visit the Account Management section on the main site to view.";
        field_e = new char[]{'[', ']', '#'};
    }
}
