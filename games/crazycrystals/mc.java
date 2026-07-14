/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mc extends ij {
    static long[] field_p;
    int field_o;
    int field_n;
    static int[] field_m;
    int field_t;
    static int field_s;
    static int field_r;
    static int field_q;
    int field_l;
    int field_u;
    int field_v;

    public static void b(byte param0) {
        if (param0 <= 104) {
            mc.b((byte) 31);
            field_m = null;
            field_p = null;
            return;
        }
        field_m = null;
        field_p = null;
    }

    final static String a(byte param0) {
        if (!co.field_F) {
          if (cl.field_o >= ih.field_a) {
            if (cl.field_o >= ih.field_a + u.field_a) {
              if (param0 == 6) {
                return null;
              } else {
                return null;
              }
            } else {
              return kf.field_f;
            }
          } else {
            if (param0 == 6) {
              return null;
            } else {
              return null;
            }
          }
        } else {
          if (param0 == 6) {
            return null;
          } else {
            return null;
          }
        }
    }

    final static dl a(int param0, int param1, int param2) {
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        dl var6 = null;
        var5 = CrazyCrystals.field_B;
        if (param1 < -10) {
          var6 = new dl(param0, param0);
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var3.field_w.length <= var4) {
              return var3;
            } else {
              var6.field_w[var4] = param2;
              var4++;
              continue L0;
            }
          }
        } else {
          field_m = null;
          var6 = new dl(param0, param0);
          var3 = var6;
          var4 = 0;
          L1: while (true) {
            if (var3.field_w.length <= var4) {
              return var3;
            } else {
              var6.field_w[var4] = param2;
              var4++;
              continue L1;
            }
          }
        }
    }

    mc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new long[32];
        field_m = new int[4];
    }
}
