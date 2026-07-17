/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends java.awt.Canvas implements java.awt.event.FocusListener {
    private static int[] field_a;
    static wf[] field_g;
    volatile boolean field_e;
    static String field_c;
    java.awt.Frame field_b;
    static String field_f;
    static int field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((uk) this).field_e = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uk.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -118) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = uk.a((CharSequence) null, (byte) 121);
                break L1;
              }
            }
            stackOut_2_0 = vk.a(false, param0, -123);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("uk.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(dl param0, byte param1) {
        try {
            if (param1 != 67) {
                field_f = null;
            }
            fh.a(100, param0, ((uk) this).field_b);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uk.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        field_a = null;
        int var1 = 33;
    }

    uk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_g = new wf[79];
        field_c = "Orb coins: <%0>";
        field_a = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)(1 + (var0 << 1));
            var3 = (int)((var6 * var6 >> 18) - 32768L);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            if (var3 >= field_a.length) {
                var3 = field_a.length + -1;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
        field_f = "Cog spells deal with changing the course of time and manipulating your opponents.";
    }
}
