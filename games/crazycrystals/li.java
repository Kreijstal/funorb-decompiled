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
        if (!((li) this).a((byte) -41)) {
          if (~lo.a((byte) -72) <= ~(350L + ((li) this).field_b)) {
            if (param0 != -16774) {
              ((li) this).b((byte) -60);
              return ((li) this).a(false);
            } else {
              return ((li) this).a(false);
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
          if (((li) this).a((byte) -41)) {
            return pe.field_p;
          } else {
            if (~(((li) this).field_b + 350L) < ~lo.a((byte) 84)) {
              return ta.field_h;
            } else {
              return ((li) this).b(51);
            }
          }
        } else {
          return null;
        }
    }

    public final void b(byte param0) {
        ((li) this).field_b = lo.a((byte) 76);
        if (param0 != 78) {
            field_e = null;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 350) {
            field_e = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract oi b(int param0);

    abstract String a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Two-Player Puzzles";
        field_c = 9;
    }
}
