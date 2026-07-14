/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends pc {
    static int field_q;
    static String[][] field_n;
    static bg field_l;
    static String field_p;
    static long field_o;
    static int field_m;

    final static p a(String param0, bj param1, int param2, String param3, bj param4) {
        int var5 = 0;
        int var6 = 0;
        if (param2 != 2) {
          return null;
        } else {
          var5 = param1.a(-39, param3);
          var6 = param1.a(param0, var5, param2 + -121);
          return pj.a(-10, var5, param1, var6, param4);
        }
    }

    public static void c(byte param0) {
        int var1 = -51 % ((50 - param0) / 55);
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final static void b(byte param0) {
        if (param0 <= 67) {
          L0: {
            tl.b((byte) 89);
            if (mj.field_o != null) {
              mj.field_o.a();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != im.field_b) {
              im.field_b.a();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (mj.field_o != null) {
              mj.field_o.a();
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != im.field_b) {
              im.field_b.a();
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    tl(long param0, String param1) {
        super(param0, param1);
    }

    final ec b(int param0) {
        if (param0 != 0) {
            return null;
        }
        return fd.field_H;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_n = new String[][]{new String[1]};
        field_p = "Fullscreen";
        field_l = new bg(6, 0, 4, 2);
    }
}
