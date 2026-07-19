/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gg implements jb {
    static String field_a;
    static fh field_b;
    static int field_f;
    static int field_g;
    static boolean[] field_i;
    static ei field_h;
    private long field_c;
    static od field_e;
    static String field_d;

    public final wd a(boolean param0) {
        if (param0) {
            field_h = (ei) null;
            if (this.b(true)) {
                return uk.field_b;
            }
            if (!((350L + this.field_c ^ -1L) >= (lj.a((byte) -31) ^ -1L))) {
                return ea.field_b;
            }
            return this.a((byte) -8);
        }
        if (this.b(true)) {
            return uk.field_b;
        }
        if (!((350L + this.field_c ^ -1L) >= (lj.a((byte) -31) ^ -1L))) {
            return ea.field_b;
        }
        return this.a((byte) -8);
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
        field_i = null;
        if (param0 < 123) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    abstract wd a(byte param0);

    public final String b(int param0) {
        int var2 = 0;
        if (!this.b(true)) {
          var2 = 93 % ((param0 - 54) / 33);
          if (this.field_c - -350L > lj.a((byte) -23)) {
            return null;
          } else {
            return this.b((byte) 95);
          }
        } else {
          return null;
        }
    }

    public final void a(int param0) {
        this.field_c = lj.a((byte) -116);
        if (param0 != -1283) {
            field_f = 78;
        }
    }

    abstract String b(byte param0);

    static {
        field_a = "Player";
        field_g = 200;
        field_f = -1;
        field_b = new fh(13, 0, 1, 0);
        field_d = "<%0>Blue Switches:<%1> Removes yellow barrier tiles from the level.";
    }
}
