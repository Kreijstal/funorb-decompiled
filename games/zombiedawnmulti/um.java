/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static String field_f;
    static String field_i;
    static gb field_c;
    static int field_h;
    private float field_e;
    private float field_k;
    private float field_d;
    private float field_j;
    static int field_a;
    static ja[][] field_g;
    static String[] field_b;

    final void a(int param0, byte param1, ja param2, int param3, int param4, int param5) {
        if (param1 != 33) {
            return;
        }
        try {
            param2.e(-16 + (int)this.field_d + param5, -16 + (int)this.field_e + param0, param4);
            param2.c(param5 + (int)this.field_d - 16, (int)this.field_e + (param0 - 16), param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "um.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        boolean discarded$1 = false;
        this.field_d = this.field_d + this.field_j;
        this.field_e = this.field_e + this.field_k;
        if (param2 < -51) {
          if (0.0f != this.field_j) {
            if (fb.field_e.field_u.a(59, (int)(this.field_e + (float)param0), (int)((float)param1 + this.field_d))) {
              return;
            } else {
              this.field_j = 0.0f;
              this.field_k = 0.0f;
              return;
            }
          } else {
            if (0.0f != this.field_k) {
              if (!fb.field_e.field_u.a(59, (int)(this.field_e + (float)param0), (int)((float)param1 + this.field_d))) {
                this.field_j = 0.0f;
                this.field_k = 0.0f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          discarded$1 = um.b(-91);
          if (0.0f == this.field_j) {
            if (0.0f != this.field_k) {
              if (!fb.field_e.field_u.a(59, (int)(this.field_e + (float)param0), (int)((float)param1 + this.field_d))) {
                this.field_j = 0.0f;
                this.field_k = 0.0f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (!fb.field_e.field_u.a(59, (int)(this.field_e + (float)param0), (int)((float)param1 + this.field_d))) {
              this.field_j = 0.0f;
              this.field_k = 0.0f;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean b(int param0) {
        if (!(sq.field_N)) {
            return false;
        }
        if (!(va.field_a == 0)) {
            return false;
        }
        if (param0 >= -119) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        int var1 = 48 / ((param0 - -1) / 58);
        field_c = null;
        field_b = null;
        field_i = null;
        field_g = (ja[][]) null;
        field_f = null;
    }

    um(float param0, float param1) {
        this.field_d = 0.0f;
        this.field_k = param1;
        this.field_j = param0;
        this.field_e = 0.0f;
    }

    static {
        field_i = "Names can only contain letters, numbers, spaces and underscores";
        field_f = "members-only content";
        field_h = 50;
        field_c = new gb();
    }
}
