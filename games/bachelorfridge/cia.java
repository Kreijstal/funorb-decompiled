/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cia extends bw {
    int field_h;
    int field_m;
    int field_l;
    static String[] field_f;
    static String field_n;
    int field_g;
    int field_i;
    static boolean field_j;
    int field_o;
    int field_p;
    int field_k;
    int field_q;

    final static boolean a(int param0) {
        if (param0 == 0) {
          if (dma.field_b != null) {
            if (uca.field_a != eia.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = null;
          if (dma.field_b != null) {
            if (uca.field_a != eia.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private cia(int param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 256, -2);
    }

    final boolean b(boolean param0) {
        ((cia) this).field_o = ((cia) this).field_o + ((cia) this).field_m;
        if (((cia) this).field_o + ((cia) this).field_m >= 0) {
          ((cia) this).field_q = ((cia) this).field_q + ((cia) this).field_g;
          ((cia) this).field_h = ((cia) this).field_h + ((cia) this).field_k;
          ((cia) this).field_i = ((cia) this).field_i + ((cia) this).field_p;
          if (!param0) {
            ((cia) this).field_k = 57;
            ((cia) this).field_k = ((cia) this).field_k + ((cia) this).field_l;
            return true;
          } else {
            ((cia) this).field_k = ((cia) this).field_k + ((cia) this).field_l;
            return true;
          }
        } else {
          ((cia) this).a(false);
          return false;
        }
    }

    cia(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param2, param3, param4, param5, param6, param7, 8);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((cia) this).field_k = param2;
        if (param0 != 0) {
          boolean discarded$2 = ((cia) this).b(false);
          ((cia) this).field_p = param3;
          ((cia) this).field_g = param1;
          return;
        } else {
          ((cia) this).field_p = param3;
          ((cia) this).field_g = param1;
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 15704) {
            return;
        }
        ((cia) this).field_h = param3;
        ((cia) this).field_i = param1;
        ((cia) this).field_q = param0;
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 >= -70) {
            return;
        }
        field_f = null;
    }

    final void a(int param0, int param1) {
        int var3 = 25 / ((param0 - -17) / 57);
        ((cia) this).field_l = param1;
    }

    final void a(int param0, int param1, int param2) {
        ((cia) this).field_o = param1;
        if (param0 < 33) {
            ((cia) this).field_o = 117;
            ((cia) this).field_m = param2;
            return;
        }
        ((cia) this).field_m = param2;
    }

    cia(int param0, int param1, int param2) {
        this(param0, param1, param2, 0, 0, 0);
    }

    private cia(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.b(param2, param0, 15704, param1);
        ((cia) this).a(0, param5, param4, param3);
        ((cia) this).a(124, param6, param7);
        ((cia) this).a(108, param8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unable to delete name - system busy";
        field_j = false;
    }
}
