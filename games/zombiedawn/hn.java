/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends le {
    le field_k;
    fn field_n;
    int field_i;
    static char[] field_o;
    static int field_m;
    static double field_j;
    static vn field_h;
    static vn field_p;
    static int[] field_q;
    static int field_l;

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (ng.field_a == null) {
                break L1;
              } else {
                ng.field_a.field_I.a(param1, (byte) 53);
                break L1;
              }
            }
            int discarded$4 = -67;
            hn.c();
            if (ni.field_c != null) {
              ni.field_c.field_I.a(param1, (byte) 76);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("hn.A(").append(0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void c() {
        field_q = null;
        int var1 = 31;
        field_p = null;
        field_h = null;
        field_o = null;
    }

    final static void a(int param0, int param1, mf param2) {
        try {
            cl.field_b = param2;
            pg.field_o = 0;
            el.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "hn.B(" + 1780 + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        mo.field_b = param0;
        ff.field_a = param2;
    }

    hn(fn param0, le param1) {
        try {
            ((hn) this).field_n = param0;
            ((hn) this).field_i = param0.k();
            ((hn) this).field_k = param1;
            ((hn) this).field_n.g(128 + ((hn) this).field_i * ge.field_c >> 8);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "hn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 71;
        field_o = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_j = Math.atan2(1.0, 0.0);
        field_q = new int[]{-1, 160, 342, 435};
        field_l = 8;
        field_p = new vn(720, 560);
    }
}
