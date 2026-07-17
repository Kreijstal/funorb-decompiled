/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wh {
    private Object field_I;
    static int[] field_J;
    static int field_G;
    static int field_D;
    static String field_E;
    static int field_F;
    static he[] field_A;
    static int field_z;
    static int[] field_y;
    static vd field_C;
    static int field_B;

    final boolean a(byte param0) {
        if (param0 != 28) {
            return false;
        }
        return false;
    }

    final Object b(byte param0) {
        if (param0 <= 57) {
            Object var3 = null;
            he[] discarded$0 = rd.a(-9, true, -89, (vj) null);
            return ((rd) this).field_I;
        }
        return ((rd) this).field_I;
    }

    final static he[] a(int param0, boolean param1, int param2, vj param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          if (param1) {
            if (fl.a(param0, param3, param2, (byte) -98)) {
              return ih.k(24782);
            } else {
              return null;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (he[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("rd.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L0;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_C = null;
        field_J = null;
        field_E = null;
        field_A = null;
        if (param0 > -102) {
            rd.h(-77);
        }
    }

    final static void h(int param0) {
        if (param0 == 300) {
          if (-11 < dg.field_e) {
            lc.a(dg.field_e - 10, (byte) 24);
            return;
          } else {
            lc.a(0, (byte) 24);
            return;
          }
        } else {
          rd.g(37);
          if (-11 > dg.field_e) {
            lc.a(dg.field_e - 10, (byte) 24);
            return;
          } else {
            lc.a(0, (byte) 24);
            return;
          }
        }
    }

    rd(Object param0, int param1) {
        super(param1);
        try {
            ((rd) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "rd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "This password contains your email address, and would be easy to guess";
        field_J = new int[]{100, 100, 100, 100, 100, 300, 300, 200, 200, 100, 100, 200, 300, 200, 1000};
        ah.a((byte) 127, 50);
        field_y = new int[8192];
        field_C = new vd();
    }
}
