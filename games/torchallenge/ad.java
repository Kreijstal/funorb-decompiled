/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends java.awt.Canvas implements java.awt.event.FocusListener {
    static boolean field_j;
    static ge field_e;
    static int[] field_h;
    java.awt.Frame field_d;
    volatile boolean field_i;
    static int[][][] field_b;
    static boolean field_a;
    static int field_c;
    static lj field_g;
    static String field_f;

    final static void a(int param0, ka param1) {
        try {
            wb.b((byte) -91);
            int var2_int = 53 % ((73 - param0) / 47);
            qg.a(param1.field_y, param1.field_q, param1.field_v);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ad.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static nf a(lj param0, lj param1, String param2, String param3, boolean param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        nf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                var7 = (String) null;
                ad.a((lj) null, (lj) null, (String) null, (String) null, false);
                break L1;
              }
            }
            var5_int = param0.a(param2, -91);
            var6 = param0.a(var5_int, param3, (byte) 91);
            stackIn_3_0 = al.a(param0, var6, var5_int, param1, -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ad.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_i = true;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ad.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != 0) {
                field_b = (int[][][]) null;
            }
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener(hl.field_d);
            param0.addFocusListener(hl.field_d);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ad.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_f = null;
        field_e = null;
        field_b = (int[][][]) null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(uj param0, int param1) {
        RuntimeException runtimeException = null;
        java.awt.event.FocusEvent var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              lg.a(param0, (byte) 49, this.field_d);
              if (param1 < -47) {
                break L1;
              } else {
                var4 = (java.awt.event.FocusEvent) null;
                this.focusLost((java.awt.event.FocusEvent) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ad.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ad() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_j = false;
        field_b = new int[9][2][2];
        field_h = new int[8192];
        field_c = 0;
        field_a = true;
        field_f = "Confirm Email:";
    }
}
