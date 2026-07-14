/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends si {
    private int field_I;
    private rf field_Q;
    private boolean field_P;
    private int field_O;
    private int field_K;
    static vi field_H;
    static he[] field_S;
    static String field_J;
    private String field_L;
    static he[] field_R;
    static lh field_N;
    static int field_M;

    dh(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, rf param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cg) null, (fd) null);
        ((dh) this).field_P = param5 ? true : false;
        ((dh) this).field_K = param6;
        ((dh) this).field_L = param10;
        ((dh) this).field_Q = param8;
        ((dh) this).field_O = param9;
        ((dh) this).field_I = param7;
        ((dh) this).field_z = param4;
        int var12 = -((dh) this).field_I + ((dh) this).field_K;
        int var13 = ((dh) this).field_Q.a(param10, var12, ((dh) this).field_Q.field_x) - -(2 * ((dh) this).field_I);
        if (param3 < var13) {
            ((dh) this).a(param1, var13, param0, 16535, param2);
        } else {
            var13 = param3;
        }
        int var14 = !((dh) this).field_P ? ((dh) this).field_K - -(2 * ((dh) this).field_I) : 0;
        ((dh) this).field_z.a((var13 - param3 >> 284774497) + ((dh) this).field_I, param3 + -(((dh) this).field_I * 2), var14, 16535, -(3 * ((dh) this).field_I) + (-((dh) this).field_K + param2));
    }

    public static void j(int param0) {
        field_H = null;
        field_S = null;
        if (param0 != 3) {
            field_M = 63;
        }
        field_N = null;
        field_R = null;
        field_J = null;
    }

    final static void k(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        lh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        je var11 = null;
        lh var12 = null;
        f var13 = null;
        int[] var14 = null;
        f var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == -3) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        L1: {
          var12 = field_N;
          var2 = var12.l(param0 ^ -31763);
          if (-1 == (var2 ^ -1)) {
            var10 = lk.c((byte) 8);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((od) (Object) var5).l(31760);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var15 = (f) (Object) ql.field_i.h(param0 + -11148);
                if (var15 == null) {
                  eg.a((byte) 126);
                  return;
                } else {
                  var15.field_l = true;
                  var15.field_j = var18[0];
                  var15.field_k = var3;
                  var15.a(-16175);
                  break L1;
                }
              } else {
                var9[var7] = ((od) (Object) var5).h(qk.a(param0, -2));
                var7++;
                continue L2;
              }
            }
          } else {
            if (1 == var2) {
              var11 = (je) (Object) aa.field_e.h(-11151);
              if (var11 != null) {
                var11.a(-16175);
                break L1;
              } else {
                eg.a((byte) 126);
                return;
              }
            } else {
              if ((var2 ^ -1) == -3) {
                var13 = (f) (Object) ql.field_i.h(-11151);
                if (var13 != null) {
                  var13.field_k = lk.c((byte) 8);
                  var13.field_l = true;
                  var13.field_j = var13.field_k[0];
                  var13.a(-16175);
                  break L1;
                } else {
                  eg.a((byte) 126);
                  return;
                }
              } else {
                gb.a((Throwable) null, "A1: " + al.a(-99), 10);
                eg.a((byte) 126);
                break L1;
              }
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 <= 0) {
            return;
        }
        kf.a(param1, true, (byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + ((dh) this).field_o;
        int var6 = ((dh) this).field_m - -param3;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = !((dh) this).field_P ? 0 : -((dh) this).field_K + ((dh) this).field_w + -(2 * ((dh) this).field_I);
        int discarded$0 = ((dh) this).field_Q.a(((dh) this).field_L, ((dh) this).field_I + var5 + var7, ((dh) this).field_I + var6, ((dh) this).field_K + -((dh) this).field_I, ((dh) this).field_k + -(((dh) this).field_I * 2), ((dh) this).field_O, -1, !((dh) this).field_P ? 2 : 0, 1, ((dh) this).field_Q.field_x);
    }

    final String e(int param0) {
        int var2 = ((dh) this).field_z.field_n ? 1 : 0;
        ((dh) this).field_z.field_n = ((dh) this).field_n;
        String var3 = ((dh) this).field_z.e(-76);
        if (param0 >= -39) {
            field_N = null;
        }
        ((dh) this).field_z.field_n = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        cl.field_o = 3 & param0 >> -1569715708;
        q.field_c = (12 & param0) >> -240116734;
        if ((cl.field_o ^ -1) < -3) {
            cl.field_o = 2;
        }
        int var2 = -12 % ((-62 - param1) / 40);
        pa.field_f = 3 & param0;
        if (!(-3 <= q.field_c)) {
            q.field_c = 2;
        }
        if (!(-3 >= pa.field_f)) {
            pa.field_f = 2;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 < 8) {
            field_N = null;
        }
        if (-12 == (af.field_b ^ -1)) {
            wa.a((byte) -43);
        }
        gm.a((byte) 32, oe.field_d, rh.field_d, kl.field_S);
        DrPhlogistonSavesTheEarth.a(0, -118, param1, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new vi();
        field_R = new he[4];
    }
}
