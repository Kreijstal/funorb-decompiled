/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ia {
    private ia field_l;
    private int field_j;
    static String field_k;

    final static int a(CharSequence param0, boolean param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
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
              var3_int = 0;
              if (param1) {
                break L1;
              } else {
                boolean discarded$2 = cg.b(false);
                break L1;
              }
            }
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L3: {
                  if (param0.charAt(var5) == param2) {
                    var3_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cg.K(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    final int d() {
        return 0;
    }

    final static boolean b(boolean param0) {
        ff.field_k = param0 ? true : false;
        hi.field_G = 15000L + oa.a(-12520);
        return hj.field_a == 11 ? true : false;
    }

    final void b(int param0) {
        if (param0 < ((cg) this).field_j) {
            ((cg) this).field_j = ((cg) this).field_j - param0;
            return;
        }
        param0 = param0 - ((cg) this).field_j;
        ((cg) this).field_j = 0;
        ((cg) this).field_l.field_c = ((cg) this).field_c;
        ((cg) this).field_l.field_b = ((cg) this).field_b;
        ((cg) this).field_c.field_b = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_b.field_c = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_c = null;
        ((cg) this).field_b = null;
        if (!(0 >= param0)) {
            ((cg) this).field_l.b(param0);
        }
    }

    final ia b() {
        return null;
    }

    final int a() {
        return ((cg) this).field_l.a();
    }

    public static void c(byte param0) {
        if (param0 > -107) {
            cg.c((byte) -13);
        }
        field_k = null;
    }

    final ia c() {
        return null;
    }

    final static boolean a(byte param0) {
        return bj.field_s;
    }

    final void a(int[] param0, int param1, int param2) {
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
            if (((cg) this).field_j > param2) {
              ((cg) this).field_j = ((cg) this).field_j - param2;
              return;
            } else {
              L1: {
                param1 = param1 + ((cg) this).field_j;
                param2 = param2 - ((cg) this).field_j;
                ((cg) this).field_j = 0;
                ((cg) this).field_l.field_b = ((cg) this).field_b;
                ((cg) this).field_l.field_c = ((cg) this).field_c;
                ((cg) this).field_c.field_b = (hf) (Object) ((cg) this).field_l;
                ((cg) this).field_b.field_c = (hf) (Object) ((cg) this).field_l;
                ((cg) this).field_c = null;
                ((cg) this).field_b = null;
                if (param2 <= 0) {
                  break L1;
                } else {
                  ((cg) this).field_l.a(param0, param1, param2);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("cg.C(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    cg(ia param0, int param1) {
        try {
            ((cg) this).field_l = param0;
            ((cg) this).field_g = ((cg) this).field_l.field_g;
            ((cg) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
    }
}
