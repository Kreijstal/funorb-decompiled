/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cea {
    private int field_f;
    private int field_c;
    private int field_e;
    static byte[][] field_d;
    private double field_g;
    static wk field_h;
    static raa field_b;
    static kv field_i;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 65536) {
          field_i = null;
          field_i = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final static pia a(byte[] param0, int param1) {
        pia var2 = null;
        if (param0 != null) {
          if (param1 != 28450) {
            return null;
          } else {
            var2 = new pia(param0, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
            al.b(-18073);
            return var2;
          }
        } else {
          return null;
        }
    }

    cea(int param0, int param1, int param2) {
        ((cea) this).field_e = param0;
        ((cea) this).field_c = param2;
        ((cea) this).field_f = param1;
        int var4 = 65535 & ((cea) this).field_f - ((cea) this).field_e;
        int var5 = ((cea) this).field_e + -((cea) this).field_f & 65535;
        if (var4 <= var5) {
            ((cea) this).field_g = (double)var4 / (double)((cea) this).field_c;
        } else {
            ((cea) this).field_g = 0.0 - (double)var5 / (double)((cea) this).field_c;
        }
    }

    final int a(int param0, byte param1) {
        double var3 = 0.0;
        if (param1 != -52) {
          field_b = null;
          var3 = (double)((cea) this).field_e + (double)param0 * ((cea) this).field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        } else {
          var3 = (double)((cea) this).field_e + (double)param0 * ((cea) this).field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You cannot add yourself!";
    }
}
