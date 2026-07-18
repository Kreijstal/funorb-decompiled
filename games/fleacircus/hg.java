/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends lh {
    int field_j;
    static String field_l;
    static String field_o;
    int field_m;
    static ob field_i;
    static int[] field_q;
    static sf field_n;
    static sf field_k;
    static String[] field_p;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("hg.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0) {
        vh.field_o = vh.field_o ^ ni.field_j;
        pg.field_d = pg.field_d ^ ni.field_j;
        if (null != pb.field_f.c((byte) 47)) {
            int fieldTemp$0 = hi.field_q + 1;
            hi.field_q = hi.field_q + 1;
            if (fieldTemp$0 == 335) {
                hi.field_q = 0;
                lh discarded$1 = pb.field_f.e(-22033);
            }
        }
        if (param0 > -74) {
            hg.a(15);
        }
        dh.field_d = dh.field_d - ag.field_f;
        se.field_b = se.field_b + ag.field_f;
    }

    public static void a(byte param0) {
        field_i = null;
        field_p = null;
        field_k = null;
        field_l = null;
        field_o = null;
        field_q = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 1 << param1;
        if (param0 != -25389) {
            hg.a(72, -8, -103, 2);
        }
        if (!(0 == (kh.field_b & var4))) {
            return;
        }
        fleas.field_L = fleas.field_L | var4;
        kh.field_b = kh.field_b | var4;
        pb.field_f.a(false, (lh) (Object) new kb(param1));
        a.field_e.a(false, (lh) (Object) new hi(param1, param2, lj.field_h, se.field_b, dh.field_d, e.field_b));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kh.field_g = param4;
        hb.field_t = param1;
        cm.field_f = param3;
        ta.field_y = param2;
    }

    private hg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Menu";
        field_o = "Start level";
        field_i = new ob();
        field_p = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
