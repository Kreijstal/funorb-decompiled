/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static boolean field_l;
    int field_f;
    static String field_c;
    int field_g;
    byte[] field_h;
    int field_m;
    int field_a;
    int field_d;
    int field_e;
    static String[] field_k;
    static so field_j;
    byte[] field_b;
    int field_i;

    final static void a(byte param0) {
        int var1 = 0;
        L0: {
          if (-1 != ii.field_q) {
            var1 = -gk.field_bb + 50;
            t.a(var1, 70, nn.field_a, 48, 65793, 160);
            ha.field_b.a(nn.field_a + var1, 70, 160);
            de.field_c.a(var1 - 22, 70, 160);
            oo.field_c[ii.field_q].e(var1, 78);
            qj.field_e.a(tn.field_n[ii.field_q], var1 - -16 + 32, 99, 16777215, -1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 21) {
          un.b((byte) 89);
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = -31 % ((param1 - -38) / 44);
        if (!((param0 & 7) == 0)) {
            var2 = 8 + -(param0 & 7);
        }
        int var4 = var2 + param0;
        return var4;
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 != -6) {
            field_l = false;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(boolean param0) {
        ek.field_c = false;
        if (!param0) {
            field_j = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
        field_c = "<%0> has dropped out.";
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
