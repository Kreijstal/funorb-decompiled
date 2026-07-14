/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pk implements qu {
    static ee[] field_b;
    private long field_d;
    static long field_c;
    static String[] field_a;

    public final void a(int param0) {
        if (param0 != 574) {
            return;
        }
        ((pk) this).field_d = f.b((byte) 73);
    }

    abstract String d(byte param0);

    public static void c(int param0) {
        if (param0 >= -41) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    abstract jg c(byte param0);

    public final String a(byte param0) {
        if (param0 >= 27) {
          if (!((pk) this).b((byte) 5)) {
            if ((f.b((byte) 73) ^ -1L) > (((pk) this).field_d - -350L ^ -1L)) {
              return null;
            } else {
              return ((pk) this).d((byte) 115);
            }
          } else {
            return null;
          }
        } else {
          String discarded$7 = ((pk) this).d((byte) -26);
          if (!((pk) this).b((byte) 5)) {
            if ((f.b((byte) 73) ^ -1L) > (((pk) this).field_d - -350L ^ -1L)) {
              return null;
            } else {
              return ((pk) this).d((byte) 115);
            }
          } else {
            return null;
          }
        }
    }

    final static String a(bca param0, boolean param1) {
        hd var2 = (hd) (Object) al.a(-56, param0.field_k);
        if (!param1) {
            return null;
        }
        return var2.field_f;
    }

    public final jg b(int param0) {
        if (((pk) this).b((byte) 5)) {
          return md.field_o;
        } else {
          if (param0 == -19704) {
            if ((f.b((byte) 73) ^ -1L) > (350L + ((pk) this).field_d ^ -1L)) {
              return cq.field_g;
            } else {
              return ((pk) this).c((byte) 35);
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
