/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kma implements nua {
    static String[] field_e;
    static String field_d;
    static String[] field_c;
    private long field_b;
    static String field_a;

    public final void c(int param0) {
        ((kma) this).field_b = bva.b((byte) -107);
        if (param0 > -63) {
            String discarded$0 = ((kma) this).a(109);
        }
    }

    abstract String e(int param0);

    public final String a(int param0) {
        if (!((kma) this).a(true)) {
          if (bva.b((byte) -107) >= ((kma) this).field_b + 350L) {
            if (param0 < 34) {
              kma.a((byte) -83);
              return ((kma) this).e(1890);
            } else {
              return ((kma) this).e(1890);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -91) {
          field_e = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    abstract it d(int param0);

    final static void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var3 = 0;
        if (null != fj.field_c) {
            var4 = fj.field_c.d(-1, param0);
            if (var4 == -2) {
                return;
            }
            if (!(var4 == -1)) {
                var5 = fj.field_c.c(false) ? 1 : 0;
                ok.a(var4, param2, (byte) 87, var5 != 0, fj.field_c.field_Db, fj.field_c.f(80));
            }
            fj.field_c = null;
            wp.a(-1);
        }
    }

    public final it b(int param0) {
        if (param0 != -4666) {
            String discarded$5 = ((kma) this).a(82);
            if (((kma) this).a(true)) {
                return fk.field_d;
            }
            if (!(bva.b((byte) -107) >= ((kma) this).field_b - -350L)) {
                return gla.field_p;
            }
            return ((kma) this).d(-1891);
        }
        if (((kma) this).a(true)) {
            return fk.field_d;
        }
        if (!(bva.b((byte) -107) >= ((kma) this).field_b - -350L)) {
            return gla.field_p;
        }
        return ((kma) this).d(-1891);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Borees";
        field_c = new String[]{"Player 1", "Player 2", "Player 3", "Player 4"};
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
