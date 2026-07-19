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
        af discarded$0 = null;
        param0 = l.a(param1 + -34966, param0);
        if (-1 < (param0 ^ -1)) {
            return -1;
        }
        if ((param0 ^ -1) == -2) {
            return 1;
        }
        if (!(-1 != (param0 ^ -1))) {
            return 0;
        }
        if (!(param0 != 2)) {
            return 2;
        }
        if ((param0 ^ -1) == -4) {
            return 3;
        }
        if (param1 != 26504) {
            lk var3 = (lk) null;
            discarded$0 = al.a(-101, -4, (lk) null, 127, 70, -30);
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        ed discarded$0 = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -1) {
            discarded$0 = al.a((byte) 104);
        }
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
        if (param0 < 98) {
            field_a = (int[]) null;
        }
        return var4;
    }

    final static af a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        java.awt.Component discarded$9 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        af var7 = null;
        java.awt.Frame var8 = null;
        af stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        af stackOut_5_0 = null;
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
            var8 = ib.a((byte) 93, param0, param3, param2, param4, param5);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new af();
                var7.field_d = var8;
                discarded$9 = var7.field_d.add((java.awt.Component) ((Object) var7));
                if (param1 == -16493) {
                  break L1;
                } else {
                  field_b = (hh) null;
                  break L1;
                }
              }
              var7.setBounds(0, 0, param0, param3);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackOut_5_0 = (af) (var7);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("al.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_a = new int[256];
            field_f = new int[1024];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    field_a[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> 1337436961;
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
}
