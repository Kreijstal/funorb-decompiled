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
        ((dda) this).field_h = true;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((dda) this).c((byte) -29);
        }
    }

    dda(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            ((dda) this).field_i = 150;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dda.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean b(int param0) {
        if (param0 > 21) {
          if (!((dda) this).field_g) {
            int fieldTemp$4 = ((dda) this).field_i - 1;
            ((dda) this).field_i = ((dda) this).field_i - 1;
            if (fieldTemp$4 < 0) {
              ((dda) this).field_h = false;
              ((dda) this).field_i = 0;
              return false;
            } else {
              return false;
            }
          } else {
            int fieldTemp$5 = ((dda) this).field_i + 1;
            ((dda) this).field_i = ((dda) this).field_i + 1;
            if (150 > fieldTemp$5) {
              return false;
            } else {
              ((dda) this).field_h = false;
              return true;
            }
          }
        } else {
          field_k = null;
          if (!((dda) this).field_g) {
            int fieldTemp$6 = ((dda) this).field_i - 1;
            ((dda) this).field_i = ((dda) this).field_i - 1;
            if (fieldTemp$6 >= 0) {
              return false;
            } else {
              ((dda) this).field_h = false;
              ((dda) this).field_i = 0;
              return false;
            }
          } else {
            int fieldTemp$7 = ((dda) this).field_i + 1;
            ((dda) this).field_i = ((dda) this).field_i + 1;
            if (150 > fieldTemp$7) {
              return false;
            } else {
              ((dda) this).field_h = false;
              return true;
            }
          }
        }
    }

    public static void a() {
        field_k = null;
        field_l = null;
    }

    final static void c(int param0) {
        if (param0 != -31033) {
          dda.c(-99);
          gaa.a(qs.field_m, vg.field_k, (byte) 55, mda.field_c, qaa.field_d);
          return;
        } else {
          gaa.a(qs.field_m, vg.field_k, (byte) 55, mda.field_c, qaa.field_d);
          return;
        }
    }

    final void c(byte param0) {
        if (param0 > -4) {
            ((dda) this).field_h = true;
            ((dda) this).field_g = true;
            return;
        }
        ((dda) this).field_g = true;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        dg.a(dga.field_b);
        var4 = ((dda) this).field_i * 36 / 150;
        if (param1 != 0) {
          field_f = true;
          dg.a(param2, var4 + param0, 128 + param2, -var4 + (param0 + 64));
          ((dda) this).field_e.field_s.field_k.field_b[109].a(param2, param0);
          dg.b(dga.field_b);
          return;
        } else {
          dg.a(param2, var4 + param0, 128 + param2, -var4 + (param0 + 64));
          ((dda) this).field_e.field_s.field_k.field_b[109].a(param2, param0);
          dg.b(dga.field_b);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_k = "Set up new game";
    }
}
