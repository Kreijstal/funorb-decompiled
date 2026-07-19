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
          field_f = (String[]) null;
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
        int fieldTemp$2 = this.field_o + this.field_m;
        this.field_o = this.field_o + this.field_m;
        if (fieldTemp$2 >= 0) {
          this.field_q = this.field_q + this.field_g;
          this.field_h = this.field_h + this.field_k;
          this.field_i = this.field_i + this.field_p;
          if (!param0) {
            this.field_k = 57;
            this.field_k = this.field_k + this.field_l;
            return true;
          } else {
            this.field_k = this.field_k + this.field_l;
            return true;
          }
        } else {
          this.a(false);
          return false;
        }
    }

    cia(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param2, param3, param4, param5, param6, param7, 8);
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        this.field_k = param2;
        if (param0 != 0) {
          discarded$2 = this.b(false);
          this.field_p = param3;
          this.field_g = param1;
          return;
        } else {
          this.field_p = param3;
          this.field_g = param1;
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 15704) {
            return;
        }
        this.field_h = param3;
        this.field_i = param1;
        this.field_q = param0;
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
        this.field_l = param1;
    }

    final void a(int param0, int param1, int param2) {
        this.field_o = param1;
        if (param0 < 33) {
            this.field_o = 117;
            this.field_m = param2;
            return;
        }
        this.field_m = param2;
    }

    cia(int param0, int param1, int param2) {
        this(param0, param1, param2, 0, 0, 0);
    }

    private cia(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.b(param2, param0, 15704, param1);
        this.a(0, param5, param4, param3);
        this.a(124, param6, param7);
        this.a(108, param8);
    }

    static {
        field_n = "Unable to delete name - system busy";
        field_j = false;
    }
}
