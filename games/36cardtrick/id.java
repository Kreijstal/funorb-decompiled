/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String field_f;
    static java.math.BigInteger field_c;
    static String field_d;
    static kc field_e;
    static int field_b;
    static qk field_a;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_e = null;
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0) {
        if ((mf.field_i ^ -1) < -11) {
          wf.a(-10 + mf.field_i, -22);
          if (param0 > 96) {
            return;
          } else {
            return;
          }
        } else {
          wf.a(0, -12);
          if (param0 > 96) {
            return;
          } else {
            return;
          }
        }
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 < 21) {
          L0: {
            id.a((byte) -72);
            var1 = System.currentTimeMillis();
            if (var1 < qb.field_c) {
              ec.field_m = ec.field_m + (qb.field_c - var1);
              break L0;
            } else {
              break L0;
            }
          }
          qb.field_c = var1;
          return ec.field_m + var1;
        } else {
          L1: {
            var1 = System.currentTimeMillis();
            if (var1 < qb.field_c) {
              ec.field_m = ec.field_m + (qb.field_c - var1);
              break L1;
            } else {
              break L1;
            }
          }
          qb.field_c = var1;
          return ec.field_m + var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Mouse over an icon for details";
        field_f = "Resume Game";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = new kc(540, 140);
        field_b = 10;
    }
}
