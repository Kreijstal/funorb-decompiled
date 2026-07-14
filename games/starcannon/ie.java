/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends kf {
    static int field_z;
    static gi field_y;
    static hl[] field_B;
    static int field_C;
    static volatile int field_D;
    int field_w;
    static pf field_x;
    static hl[] field_A;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (-1 != (param0 ^ -1)) {
            return;
        }
        if (!(null != ((ie) this).field_t)) {
            return;
        }
        if (!(((ie) this).field_w != 0)) {
            return;
        }
        if (!((((ie) this).field_w ^ -1) != -257)) {
            ((ie) this).field_t.a(param0, param1 - -((ie) this).field_s, (byte) 49, param3 + ((ie) this).field_j);
            return;
        }
        hl var6 = new hl(((ie) this).field_t.field_i, ((ie) this).field_t.field_f);
        bc.a(var6, 26095);
        ((ie) this).field_t.a(param0, 0, param2, 0);
        wf.a(-110);
        var6.e(((ie) this).field_s + param1, ((ie) this).field_j + param3, ((ie) this).field_w);
    }

    public static void h(int param0) {
        Object var2 = null;
        field_y = null;
        field_x = null;
        if (param0 != 24288) {
          var2 = null;
          ie.a(-11, (String) null, (String[]) null, -43);
          field_A = null;
          field_B = null;
          return;
        } else {
          field_A = null;
          field_B = null;
          return;
        }
    }

    ie(uj param0) {
        super(param0.field_s, param0.field_j, param0.field_i, param0.field_f, (de) null, (qg) null);
        param0.a(0, ((ie) this).field_i, (byte) 117, ((ie) this).field_f, 0);
        ((ie) this).field_w = 256;
        ((ie) this).field_t = param0;
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        Object var5 = null;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        field_x = s.field_f;
        if (param0 <= -99) {
          if (-256 != param3) {
            if (param3 >= 100) {
              if ((param3 ^ -1) >= -106) {
                var7 = param2;
                dl.a((byte) -12, var7);
                mf.field_a = hc.a(param2, 0);
                return;
              } else {
                mf.field_a = fb.a(param1, param3, 0);
                return;
              }
            } else {
              mf.field_a = fb.a(param1, param3, 0);
              return;
            }
          } else {
            L0: {
              if (-14 <= qb.field_a) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            mf.field_a = cf.a(stackIn_16_0 != 0, false);
            var5 = null;
            dl.a((byte) -12, (String[]) null);
            return;
          }
        } else {
          ie.g(-121);
          if (-256 != param3) {
            if (param3 >= 100) {
              if ((param3 ^ -1) >= -106) {
                var6 = param2;
                dl.a((byte) -12, var6);
                mf.field_a = hc.a(param2, 0);
                return;
              } else {
                mf.field_a = fb.a(param1, param3, 0);
                return;
              }
            } else {
              mf.field_a = fb.a(param1, param3, 0);
              return;
            }
          } else {
            L1: {
              if (-14 <= qb.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            mf.field_a = cf.a(stackIn_5_0 != 0, false);
            var5 = null;
            dl.a((byte) -12, (String[]) null);
            return;
          }
        }
    }

    final static void g(int param0) {
        if (param0 != -1) {
            field_y = null;
        }
    }

    public ie() {
        super(0, 0, 0, 0, (de) null, (qg) null);
        ((ie) this).field_w = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_C = 0;
    }
}
