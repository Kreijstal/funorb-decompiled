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
        try {
            la.field_k = bl.a(113) * param0 / 1000;
            op.a(20786, param3);
            hn.a(param3, true);
            tr.a(param3, (byte) -88);
            lp.a(false);
            if (param1 <= 17) {
                field_l = (as) null;
            }
            aq.b(540);
            it.field_c = 0 - la.field_k;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "du.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
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
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var3 = 0;
        if (param0 != -90) {
          du.k(67);
          var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
          fieldTemp$8 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$8] = (byte)var3;
          fieldTemp$9 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$9] = (byte)(var3 >> 1870127112);
          fieldTemp$10 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$10] = (byte)(var3 >> -1474262288);
          fieldTemp$11 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$11] = (byte)(var3 >> 1363638904);
          return;
        } else {
          var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
          fieldTemp$12 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$12] = (byte)var3;
          fieldTemp$13 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$13] = (byte)(var3 >> 1870127112);
          fieldTemp$14 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$14] = (byte)(var3 >> -1474262288);
          fieldTemp$15 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$15] = (byte)(var3 >> 1363638904);
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
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$7 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$7] = (byte)(var3 >> -717565960);
        if (param0 < 59) {
          du.k(97);
          fieldTemp$8 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$8] = (byte)(var3 >> -1869843472);
          fieldTemp$9 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$9] = (byte)(var3 >> 784202600);
          fieldTemp$10 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$10] = (byte)var3;
          return;
        } else {
          fieldTemp$11 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$11] = (byte)(var3 >> -1869843472);
          fieldTemp$12 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$12] = (byte)(var3 >> 784202600);
          fieldTemp$13 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$13] = (byte)var3;
          return;
        }
    }

    static {
        field_o = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_n = "Accept";
        field_l = new as();
    }
}
