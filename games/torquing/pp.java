/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_b;
    static String[] field_e;
    static vh field_f;
    java.awt.Frame field_d;
    static int field_a;
    static boolean field_c;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        ph.b(5 + param0, 7 + param3, 157, param4);
        ph.b(162 + param0, 8 + param3, 2, param4);
        ph.a(param0 - -163, 9 + param3, 2, param4);
        ph.b(4 + param0, param3 - -11, 159, param4);
        ph.a(3 + param0, 9 + param3, 2, param4);
        ph.b(param0 + 4, 8 + param3, 1, param4);
        if (param1 > -124) {
          field_f = null;
          ph.b(param0 + 5, param3 + 8, 157, param2);
          ph.b(param0 - -4, 9 + param3, 159, param2);
          ph.b(4 + param0, 10 + param3, 159, param2);
          return;
        } else {
          ph.b(param0 + 5, param3 + 8, 157, param2);
          ph.b(param0 - -4, 9 + param3, 159, param2);
          ph.b(4 + param0, 10 + param3, 159, param2);
          return;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((pp) this).field_b = true;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "pp.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(vh param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ka.a(-119, ((pp) this).field_d, param0);
              if (param1 == 159) {
                break L1;
              } else {
                var4 = null;
                ((pp) this).focusGained((java.awt.event.FocusEvent) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pp.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 == 2) {
          if (param0) {
            var4 += 2;
            var4++;
            return qa.field_m[var4];
          } else {
            var4++;
            return qa.field_m[var4];
          }
        } else {
          field_a = -28;
          if (!param0) {
            var4++;
            return qa.field_m[var4];
          } else {
            var4 += 2;
            var4++;
            return qa.field_m[var4];
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
    }

    pp() {
    }

    final static void a(boolean param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = true;
    }
}
