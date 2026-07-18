/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_f;
    private wf[] field_d;
    private wf field_c;
    private int field_b;
    private wf field_a;
    private int field_e;

    final wf a(boolean param0) {
        if (param0) {
            return null;
        }
        ((ph) this).field_e = 0;
        return ((ph) this).a(0);
    }

    final wf a(byte param0, long param1) {
        wf var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        wf var4 = ((ph) this).field_d[(int)((long)(((ph) this).field_b + -1) & param1)];
        ((ph) this).field_a = var4.field_a;
        while (var4 != ((ph) this).field_a) {
            if (!(~param1 != ~((ph) this).field_a.field_b)) {
                var5 = ((ph) this).field_a;
                ((ph) this).field_a = ((ph) this).field_a.field_a;
                return var5;
            }
            ((ph) this).field_a = ((ph) this).field_a.field_a;
        }
        if (param0 != 106) {
            Object var7 = null;
            String discarded$0 = ph.a((String) null, 95);
        }
        ((ph) this).field_a = null;
        return null;
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-1 + var2_int - var4] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ph.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void b(int param0) {
        int var2 = 0;
        wf var3 = null;
        wf var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        for (var2 = param0; var2 < ((ph) this).field_b; var2++) {
            var3 = ((ph) this).field_d[var2];
            while (true) {
                var4 = var3.field_a;
                if (var3 == var4) {
                    break;
                }
                var4.c(-123);
            }
        }
        ((ph) this).field_c = null;
        ((ph) this).field_a = null;
    }

    final void a(int param0, long param1, wf param2) {
        wf var5 = null;
        try {
            if (!(null == param2.field_c)) {
                param2.c(-123);
            }
            var5 = ((ph) this).field_d[(int)(param1 & (long)(-1 + ((ph) this).field_b))];
            param2.field_a = var5;
            int var6 = -19 / ((param0 - 43) / 54);
            param2.field_c = var5.field_c;
            param2.field_c.field_a = param2;
            param2.field_a.field_c = param2;
            param2.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ph.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final wf a(int param0) {
        wf var2 = null;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (((ph) this).field_e > param0) {
            if (((ph) this).field_c != ((ph) this).field_d[((ph) this).field_e - 1]) {
                var2 = ((ph) this).field_c;
                ((ph) this).field_c = var2.field_a;
                return var2;
            }
        }
        do {
            if (((ph) this).field_e >= ((ph) this).field_b) {
                return null;
            }
            int fieldTemp$0 = ((ph) this).field_e;
            ((ph) this).field_e = ((ph) this).field_e + 1;
            var2 = ((ph) this).field_d[fieldTemp$0].field_a;
        } while (((ph) this).field_d[((ph) this).field_e - 1] == var2);
        ((ph) this).field_c = var2.field_a;
        return var2;
    }

    public static void c(int param0) {
        field_f = null;
    }

    ph(int param0) {
        int var2 = 0;
        wf var3 = null;
        ((ph) this).field_e = 0;
        ((ph) this).field_b = param0;
        ((ph) this).field_d = new wf[param0];
        for (var2 = 0; param0 > var2; var2++) {
            wf dupTemp$0 = new wf();
            var3 = dupTemp$0;
            ((ph) this).field_d[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_c = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
