/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du extends PacketBuffer {
    static as field_l;
    static String field_n;
    static String[] field_o;
    static vf field_m;
    static String[] field_p;

    final static void a(int param0, int param1, tp param2, ResourceArchive param3) {
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        int var3Lifetime1;
        if (param0 == -90) {
          var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)var3;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(var3 >> 8);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(var3 >> 16);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)(var3 >> 24);
          return;
        }
        du.k(67);
        var3Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)var3Lifetime1;
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(var3Lifetime1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(var3Lifetime1 >> 16);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(var3Lifetime1 >> 24);
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
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(var3 >> 24);
        if (param0 >= 59) {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(var3 >> 16);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(var3 >> 8);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)var3;
          return;
        }
        du.k(97);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(var3 >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(var3 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)var3;
    }

    static {
        field_o = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_n = "Accept";
        field_l = new as();
    }
}
