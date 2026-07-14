/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static kc field_b;
    static String field_c;
    static String field_d;
    static int field_e;
    static w field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static kc a(boolean param0) {
        if ((oo.field_y ^ -1) >= -1) {
          if ((sm.field_a ^ -1) >= -1) {
            if (!param0) {
              return null;
            } else {
              return null;
            }
          } else {
            return mi.field_m;
          }
        } else {
          return mi.field_m;
        }
    }

    final static int a(int param0, boolean param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1) {
          kc discarded$1 = db.a(true);
          var4 = -1;
          var5 = param3;
          L0: while (true) {
            if (param0 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = bl.field_i[255 & (param2[var5] ^ var4)] ^ var4 >>> 288187208;
              var5++;
              continue L0;
            }
          }
        } else {
          var4 = -1;
          var5 = param3;
          L1: while (true) {
            if (param0 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = bl.field_i[255 & (param2[var5] ^ var4)] ^ var4 >>> 288187208;
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 255) {
            field_e = -80;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "No options available";
        field_d = "Familiars:";
    }
}
