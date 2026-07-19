/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qja extends vg {
    int field_g;
    static String field_i;
    int field_h;
    static String field_k;
    static dk[] field_f;
    static jea field_j;

    public static void a(int param0) {
        field_f = null;
        if (param0 > -37) {
          qja.a(true, true, -119);
          field_j = null;
          field_i = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          field_k = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
          bea.c(0, 0, bea.field_g, bea.field_a, 0, 192);
          if (param2 > -121) {
            return;
          } else {
            tqa.a(param0, (byte) 106);
            return;
          }
        } else {
          bea.a();
          if (!TombRacer.field_G) {
            if (param2 > -121) {
              return;
            } else {
              tqa.a(param0, (byte) 106);
              return;
            }
          } else {
            bea.c(0, 0, bea.field_g, bea.field_a, 0, 192);
            if (param2 > -121) {
              return;
            } else {
              tqa.a(param0, (byte) 106);
              return;
            }
          }
        }
    }

    qja(int param0, int param1) {
        this.field_g = param1;
        this.field_h = param0;
    }

    static {
        field_i = "Achievements";
        field_k = "HOLD <img=8><img=9> TO DRAG OBJECTS";
    }
}
