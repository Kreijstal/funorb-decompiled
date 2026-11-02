/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private IntrusiveNode field_a;
    private IntrusiveNode field_e;
    private int field_h;
    static int field_b;
    private int field_f;
    private IntrusiveNode[] field_d;
    static vd field_g;
    static String[] field_c;
    static int[] field_i;

    final IntrusiveNode a(boolean param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        IntrusiveNode var4 = this.field_d[(int)(param1 & (long)(this.field_f - 1))];
        this.field_e = var4.next;
        while (var4 != this.field_e) {
          if (~param1 == ~this.field_e.key) {
            var5 = this.field_e;
            this.field_e = this.field_e.next;
            return var5;
          }
          this.field_e = this.field_e.next;
        }
        if (param0) {
          this.field_e = null;
          return null;
        }
        tg.a(84);
        this.field_e = null;
        return null;
    }

    final IntrusiveNode b(int param0) {
        if (param0 == -1) {
          this.field_h = 0;
          return this.a((byte) -114);
        }
        this.field_f = -101;
        this.field_h = 0;
        return this.a((byte) -114);
    }

    final IntrusiveNode a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var7;
        IntrusiveNode var8;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 >= this.field_h) {
          if (param0 != -114) {
            return (IntrusiveNode) null;
          }
          do {
            if (this.field_h >= this.field_f) {
              return null;
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            var8 = this.field_d[fieldTemp$0].next;
          } while (this.field_d[-1 + this.field_h] == var8);
          this.field_a = var8.next;
          return var8;
        }
        if (this.field_d[this.field_h - 1] != this.field_a) {
          var7 = this.field_a;
          this.field_a = var7.next;
          return var7;
        }
        if (param0 != -114) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.field_h >= this.field_f) {
            return null;
          }
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_d[fieldTemp$1].next;
        } while (this.field_d[-1 + this.field_h] == var4);
        this.field_a = var4.next;
        return var4;
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 == 0) {
          return;
        }
        field_i = (int[]) null;
    }

    tg(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_h = 0;
        this.field_d = new IntrusiveNode[param0];
        this.field_f = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final void a(IntrusiveNode param0, long param1, int param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.previous) {
            param0.unlink(-16175);
          }
          var5 = this.field_d[(int)(param1 & (long)(this.field_f + param2))];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.key = param1;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "tg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_g = new vd();
        field_i = new int[4];
    }
}
