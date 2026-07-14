/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private bi[] field_c;
    static int field_e;
    static String field_a;
    static volatile int field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            Object var2 = null;
            String discarded$0 = v.a((String) null, (byte) 104);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -102) {
          field_d = -42;
          em.a(param0, param3, 7, param2, ((v) this).field_c, param1);
          return;
        } else {
          em.a(param0, param3, 7, param2, ((v) this).field_c, param1);
          return;
        }
    }

    final static String a(String param0, byte param1) {
        int var2 = 0;
        L0: {
          var2 = wd.a(jd.field_i, (byte) 123, bs.field_b);
          if ((var2 ^ -1) == -2) {
            param0 = "<img=0>" + param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 4) {
          return null;
        } else {
          L1: {
            if (var2 == 2) {
              param0 = "<img=1>" + param0;
              break L1;
            } else {
              break L1;
            }
          }
          return param0;
        }
    }

    final static void a(byte param0) {
        cf.a(pd.field_f, (byte) 39);
        int var1 = -68 % ((param0 - -66) / 40);
    }

    v(bi[] param0) {
        ((v) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = 3;
        field_a = "Return to Main Menu";
    }
}
