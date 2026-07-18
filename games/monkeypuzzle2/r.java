/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int[] field_a;
    java.awt.Frame field_c;
    static String field_f;
    static int field_e;
    static String field_b;
    volatile boolean field_d;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(byte param0, md param1) {
        if (param0 != -107) {
            return;
        }
        try {
            rk.a(param1, ((r) this).field_c, false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "r.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((r) this).field_d = true;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "r.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == 71) {
          if (param1 >= 4096) {
            L0: {
              if (6144 > param1) {
                stackOut_18_0 = -tj.field_b[6144 + -param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = tj.field_b[-6144 + param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (2048 > param1) {
                stackOut_14_0 = tj.field_b[2048 - param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -tj.field_b[param1 - 2048];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = r.a((byte) -100, 80);
          if (param1 >= 4096) {
            L2: {
              if (6144 > param1) {
                stackOut_8_0 = -tj.field_b[6144 + -param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = tj.field_b[-6144 + param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (2048 > param1) {
                stackOut_4_0 = tj.field_b[2048 - param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -tj.field_b[param1 - 2048];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = 44;
        field_f = null;
    }

    r() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = "Invalid password.";
    }
}
