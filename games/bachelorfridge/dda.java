/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dda extends kj {
    static int field_j;
    boolean field_h;
    static boolean field_f;
    static String field_k;
    static String field_l;
    private boolean field_g;
    private int field_i;

    final void a(int param0) {
        super.a(param0);
        this.field_h = true;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.c((byte) -29);
        }
    }

    dda(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
          this.field_i = 150;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (param0 <= 21) {
          field_k = (String) null;
          if (this.field_g) {
            fieldTemp$0 = this.field_i + 1;
            this.field_i = this.field_i + 1;
            if (150 <= fieldTemp$0) {
              this.field_h = false;
              return true;
            }
            return false;
          }
          fieldTemp$1 = this.field_i - 1;
          this.field_i = this.field_i - 1;
          if (fieldTemp$1 < 0) {
            this.field_h = false;
            this.field_i = 0;
            return false;
          }
          return false;
        }
        if (this.field_g) {
          fieldTemp$2 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          if (150 <= fieldTemp$2) {
            this.field_h = false;
            return true;
          }
          return false;
        }
        int fieldTemp$3 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        if (fieldTemp$3 >= 0) {
          return false;
        }
        this.field_h = false;
        this.field_i = 0;
        return false;
    }

    public static void a(boolean param0) {
        field_k = null;
        field_l = null;
        if (param0) {
          dda.c(52);
        }
    }

    final static void c(int param0) {
        if (param0 == -31033) {
          gaa.a(qs.field_m, vg.field_k, (byte) 55, mda.field_c, qaa.field_d);
          return;
        }
        dda.c(-99);
        gaa.a(qs.field_m, vg.field_k, (byte) 55, mda.field_c, qaa.field_d);
    }

    final void c(byte param0) {
        if (param0 > -4) {
          this.field_h = true;
          this.field_g = true;
          return;
        }
        this.field_g = true;
    }

    final void a(int param0, int param1, int param2) {
        dg.a(dga.field_b);
        int var4 = this.field_i * 36 / 150;
        if (param1 == 0) {
          dg.a(param2, var4 + param0, 128 + param2, -var4 + (param0 + 64));
          this.field_e.field_s.field_k.field_b[109].a(param2, param0);
          dg.b(dga.field_b);
          return;
        }
        field_f = true;
        dg.a(param2, var4 + param0, 128 + param2, -var4 + (param0 + 64));
        this.field_e.field_s.field_k.field_b[109].a(param2, param0);
        dg.b(dga.field_b);
    }

    static {
        field_f = false;
        field_k = "Set up new game";
    }
}
