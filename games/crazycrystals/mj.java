/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static String field_d;
    private int field_e;
    static dl[] field_f;
    int field_c;
    private int field_g;
    ma field_a;
    int field_b;

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        if (param0 != -64) {
            mj.a((byte) -53, false);
        }
    }

    final static void a(byte param0, boolean param1) {
        gk.field_e.a(-33, param1);
        if (param0 != -34) {
            mj.a((byte) -72);
        }
    }

    final dl b(byte param0) {
        if (param0 == 84) {
          if (((mj) this).field_e == 0) {
            return ac.field_j;
          } else {
            return qn.field_e;
          }
        } else {
          field_f = null;
          if (((mj) this).field_e == 0) {
            return ac.field_j;
          } else {
            return qn.field_e;
          }
        }
    }

    final void a(int param0) {
        ((mj) this).field_b = ((mj) this).field_b + ((mj) this).field_g;
        int var2 = 60 % ((param0 - 46) / 46);
        ((mj) this).field_c = ((mj) this).field_c + ((mj) this).field_e;
    }

    final dl a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        dl var5 = null;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (1 != param1) {
            var4 = -((mj) this).field_g;
            var3 = -((mj) this).field_e;
            break L0;
          } else {
            var4 = ((mj) this).field_g;
            var3 = ((mj) this).field_e;
            break L0;
          }
        }
        if (param0 == 13214) {
          if (((var4 | -((mj) this).field_e) ^ -1) <= -1) {
            if ((var3 | -((mj) this).field_g) >= 0) {
              var5 = ai.field_b;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            } else {
              var5 = ce.field_eb;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            }
          } else {
            if (((-((mj) this).field_g | var3) ^ -1) > -1) {
              var5 = en.field_M;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            } else {
              var5 = jl.field_b;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            }
          }
        } else {
          field_f = null;
          if (((var4 | -((mj) this).field_e) ^ -1) <= -1) {
            if ((var3 | -((mj) this).field_g) >= 0) {
              var5 = ai.field_b;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            } else {
              var5 = ce.field_eb;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            }
          } else {
            if (((-((mj) this).field_g | var3) ^ -1) > -1) {
              var5 = en.field_M;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            } else {
              var5 = jl.field_b;
              ((mj) this).field_g = var3;
              ((mj) this).field_e = var4;
              return var5;
            }
          }
        }
    }

    mj(int param0, int param1, int param2, int param3) {
        ((mj) this).field_a = null;
        ((mj) this).field_e = param3;
        ((mj) this).field_g = param2;
        ((mj) this).field_b = param0;
        ((mj) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Create a free Account";
    }
}
