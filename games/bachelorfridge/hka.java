/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka extends aba {
    static int field_h;
    static int field_i;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        for (var6 = param3; var6 <= param2; var6++) {
            hba.a(param5, param0, tj.field_b[var6], param1 + 8, param4);
        }
        if (param1 != -1) {
            field_h = -122;
        }
    }

    final jg a(String param0, boolean param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (!vn.a((byte) 119, var4)) {
          return jt.field_f;
        } else {
          L0: {
            var5 = (CharSequence) (Object) param0;
            var3 = pd.a((byte) 47, var5);
            if (!param1) {
              break L0;
            } else {
              hka.a(-79, 12, 84, 122, 69, -84);
              break L0;
            }
          }
          L1: {
            if ((var3 ^ -1) >= -1) {
              break L1;
            } else {
              if ((var3 ^ -1) >= -131) {
                return cm.field_u;
              } else {
                break L1;
              }
            }
          }
          return jt.field_f;
        }
    }

    final String a(byte param0, String param1) {
        int var3 = 41 / ((param0 - -8) / 45);
        if (((hka) this).a(param1, false) != jt.field_f) {
            return null;
        }
        return ug.field_k;
    }

    hka(lka param0) {
        super(param0);
    }

    final static int a(boolean param0, boolean param1, String param2) {
        if (!param0) {
            return -13;
        }
        if (param1) {
            return lha.field_b.a(param2);
        }
        return qm.field_a.a(param2);
    }

    public static void d(int param0) {
        if (param0 >= 0) {
            Object var2 = null;
            int discarded$0 = hka.a(true, true, (String) null);
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Total Cost: ";
    }
}
