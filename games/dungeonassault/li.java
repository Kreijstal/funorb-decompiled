/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static md field_a;
    static cn[] field_l;
    static int field_j;
    static int field_k;
    static String[] field_b;
    static int field_h;
    static String field_d;
    static String field_c;
    static int field_g;
    static String field_e;
    static String field_i;
    static String[] field_f;

    final static void c(int param0) {
        ta.field_a.b(1, (lm) (Object) new ia());
        if (param0 != 316) {
            field_j = 24;
        }
    }

    final static void a() {
        np.a((byte) -123, m.c(true));
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_l = null;
    }

    final static cn[] a(int param0, int param1, nh param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        cn[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (kk.a(param2, 1, param0, param1)) {
              stackOut_4_0 = ib.b(-10718);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cn[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("li.E(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 4 + 41);
        }
        return stackIn_5_0;
    }

    final static void b() {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        try {
            jh.c();
            if (!(null != wm.field_c)) {
                bn.field_f = new cn(256, 256);
                wm.field_c = new cn(316, 316);
                wm.field_c.field_w = -16;
                wm.field_c.field_A = -16;
            }
            bn.field_f.e();
            gf.a();
            var1_int = 0;
            for (var2 = 0; var2 < 7; var2++) {
                for (var3 = 0; var3 < 7; var3++) {
                    if (!(null == qj.field_c[var1_int])) {
                        gf.b(var3 * 36 + 4, 4 - -(36 * var2), 32, 32, 16777215);
                    }
                    var1_int++;
                }
            }
            wm.field_c.e();
            gf.a();
            bn.field_f.e(16, 16, 8454143);
            gf.d(8, 8, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
            bn.field_f.e(16, 16, 0);
            gf.d(4, 4, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
            jh.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "li.D(" + -107 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 3;
        field_c = "Select two rooms to spy out";
        field_d = "Try not to get snared in this spider's webs; the gigantic tarantula is always alert; it likes nothing more than the sweet meat of a raider or two.";
        field_b = new String[6];
        field_e = "Risk of waking dragon: ";
        field_a = new md();
        field_i = "More suggestions";
        field_f = new String[]{"Scout", "A creature born to the labyrinth, the enhanced senses of the <%0> can sometimes be used to determine what lies beyond the next door. (Single use)"};
    }
}
