/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kj {
    kj field_b;
    gj field_e;
    int field_d;
    static String field_a;
    int field_c;

    abstract void a(int param0, boolean param1, int param2);

    public static void a(byte param0) {
        if (param0 != -110) {
          return;
        }
        field_a = null;
    }

    final static void b(byte param0) {
        if (!bp.e(-29919)) {
          sja.field_fb.c(78, (byte) 109);
          hb.field_j = true;
          if (param0 == -88) {
            uca.a(0, (byte) 101);
            return;
          }
          return;
        }
        pma.b(mg.field_m.field_g, 20208);
        er.e((byte) -93);
        if (param0 == -88) {
          uca.a(0, (byte) 101);
          return;
        }
    }

    abstract boolean b(int param0);

    void a(int param0) {
        int var3 = BachelorFridge.field_y;
        if (param0 != 0) {
          kj.b((byte) 107);
        }
        kj var2 = this.field_e.field_D[this.field_d][this.field_c];
        if (var2 == null) {
          this.field_e.field_D[this.field_d][this.field_c] = this;
          return;
        }
        while (null != var2.field_b) {
          var2 = var2.field_b;
        }
        var2.field_b = this;
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          return;
        }
        this.field_e.field_s.a(-1, param2, this.field_d, param0, this.field_c);
    }

    kj(gj param0, int param1, int param2) {
        try {
          this.field_e = param0;
          this.field_d = param1;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Waiting for graphics";
    }
}
