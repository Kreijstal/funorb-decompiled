/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int[] field_f;
    static int[] field_a;
    static hf field_d;
    static hh field_b;
    static long field_e;
    static String field_c;

    final static int a(int param0, int param1) {
        param0 = l.a(-8462, param0);
        if (param0 < 0) {
            return -1;
        }
        if (param0 == 1) {
            return 1;
        }
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(param0 != 2)) {
            return 2;
        }
        if (param0 == 3) {
            return 3;
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_c = null;
    }

    final static ed a(byte param0) {
        int var4_int = 0;
        int var5 = EscapeVector.field_A;
        int var1 = bc.field_a[0] * qh.field_k[0];
        byte[] var2 = qe.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = qk.field_f[ae.a((int) var2[var4_int], 255)];
        }
        ed var4 = new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var3);
        of.a(false);
        return var4;
    }

    final static af a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        af var7 = null;
        java.awt.Frame var8 = null;
        af stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        af stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = ib.a((byte) 93, param0, param3, param2, 0, 0);
            var6 = var8;
            if (var8 != null) {
              var7 = new af();
              var7.field_d = var8;
              java.awt.Component discarded$2 = var7.field_d.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param0, param3);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (af) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("al.D(").append(param0).append(',').append(-16493).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + 0 + ',' + 0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_a = new int[256];
        field_f = new int[1024];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_a[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) == 1) {
                  var0 = -306674912 ^ var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
