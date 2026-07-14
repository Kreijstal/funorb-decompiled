/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du extends rb {
    static as field_l;
    static String field_n;
    static String[] field_o;
    static vf field_m;
    static String[] field_p;

    final static void a(int param0, int param1, tp param2, gk param3) {
        la.field_k = bl.a(113) * param0 / 1000;
        op.a(20786, param3);
        hn.a(param3, true);
        tr.a(param3, (byte) -88);
        lp.a(false);
        if (param1 <= 17) {
          field_l = (as) null;
          aq.b(540);
          it.field_c = 0 - la.field_k;
          return;
        } else {
          aq.b(540);
          it.field_c = 0 - la.field_k;
          return;
        }
    }

    final static void k(int param0) {
        so.field_d[61] = 27;
        so.field_d[47] = 73;
        so.field_d[192] = 28;
        so.field_d[520] = 59;
        so.field_d[222] = 58;
        so.field_d[92] = 74;
        so.field_d[91] = 42;
        so.field_d[46] = 72;
        so.field_d[59] = 57;
        so.field_d[44] = 71;
        so.field_d[93] = 43;
        so.field_d[45] = 26;
        if (param0 >= -119) {
            field_p = (String[]) null;
        }
    }

    final void b(byte param0, float param1) {
        int var3 = 0;
        if (param0 != -90) {
          du.k(67);
          var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)var3;
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 1870127112);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> -1474262288);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 1363638904);
          return;
        } else {
          var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)var3;
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 1870127112);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> -1474262288);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 1363638904);
          return;
        }
    }

    du(int param0) {
        super(param0);
    }

    public static void j(int param0) {
        field_p = null;
        field_n = null;
        int var1 = -10 % ((8 - param0) / 50);
        field_m = null;
        field_l = null;
        field_o = null;
    }

    final void a(byte param0, float param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        ((du) this).field_g = ((du) this).field_g + 1;
        ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> -717565960);
        if (param0 < 59) {
          du.k(97);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> -1869843472);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 784202600);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)var3;
          return;
        } else {
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> -1869843472);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)(var3 >> 784202600);
          ((du) this).field_g = ((du) this).field_g + 1;
          ((du) this).field_f[((du) this).field_g] = (byte)var3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_n = "Accept";
        field_l = new as();
    }
}
