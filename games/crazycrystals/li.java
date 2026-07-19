/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li implements n {
    static String field_e;
    static qa[] field_d;
    static int field_c;
    private long field_b;
    static nj field_a;

    public final String a(int param0) {
        if (!this.a((byte) -41)) {
          if ((lo.a((byte) -72) ^ -1L) <= (350L + this.field_b ^ -1L)) {
            if (param0 != -16774) {
              this.b((byte) -60);
              return this.a(false);
            } else {
              return this.a(false);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final oi c(byte param0) {
        if (param0 == 45) {
          if (this.a((byte) -41)) {
            return pe.field_p;
          } else {
            if ((this.field_b + 350L ^ -1L) < (lo.a((byte) 84) ^ -1L)) {
              return ta.field_h;
            } else {
              return this.b(51);
            }
          }
        } else {
          return (oi) null;
        }
    }

    public final void b(byte param0) {
        this.field_b = lo.a((byte) 76);
        if (param0 != 78) {
            field_e = (String) null;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 350) {
            field_e = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract oi b(int param0);

    abstract String a(boolean param0);

    static {
        field_e = "Two-Player Puzzles";
        field_c = 9;
    }
}
