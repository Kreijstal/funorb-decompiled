/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements ml {
    private int field_h;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_j;
    static int[] field_b;
    static int[][] field_e;
    private int field_k;
    static String field_i;
    private ta field_f;
    private int field_g;

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        qj var13 = null;
        we stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        we stackOut_1_0 = null;
        L0: {
          var11 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (!(param1 instanceof qj)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (we) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (we) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var13 = (qj) (Object) stackIn_3_0;
        if (param4 < 19) {
          L1: {
            var12 = null;
            ((mc) this).a(false, (we) null, 106, 30, 56);
            ge.d(param3 - -param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, ((mc) this).field_g);
            if (var13 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          var7 = -(2 * var13.field_B) + param1.field_l;
          var8 = var13.field_B + param1.field_r + param3;
          var9 = var13.field_F + (param1.field_e + param2);
          ge.e(var8, var9, var8 - -var7, var9, ((mc) this).field_k);
          var10 = -1 + var13.a(true);
          L2: while (true) {
            if ((var10 ^ -1) > -1) {
              L3: {
                if (null != ((mc) this).field_f) {
                  ((mc) this).field_f.a(var13.field_s, var7 / 2 + var8, ((mc) this).field_f.field_t + (var9 - -var13.field_F), ((mc) this).field_j, ((mc) this).field_c);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              ge.f(var13.a(false, var10) * var7 / var13.k(-64) + var8, var9, ((mc) this).field_h, ((mc) this).field_d);
              var10--;
              continue L2;
            }
          }
        } else {
          L4: {
            ge.d(param3 - -param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, ((mc) this).field_g);
            if (var13 == null) {
              break L4;
            } else {
              break L4;
            }
          }
          var7 = -(2 * var13.field_B) + param1.field_l;
          var8 = var13.field_B + param1.field_r + param3;
          var9 = var13.field_F + (param1.field_e + param2);
          ge.e(var8, var9, var8 - -var7, var9, ((mc) this).field_k);
          var10 = -1 + var13.a(true);
          L5: while (true) {
            if ((var10 ^ -1) > -1) {
              L6: {
                if (null != ((mc) this).field_f) {
                  ((mc) this).field_f.a(var13.field_s, var7 / 2 + var8, ((mc) this).field_f.field_t + (var9 - -var13.field_F), ((mc) this).field_j, ((mc) this).field_c);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              ge.f(var13.a(false, var10) * var7 / var13.k(-64) + var8, var9, ((mc) this).field_h, ((mc) this).field_d);
              var10--;
              continue L5;
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        if (param0 >= -49) {
          var2 = null;
          mc.a(0, (le) null);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final static void a(int param0, le param1) {
        if (param0 != -8497) {
          mc.a(100);
          vf.a((byte) 109);
          ge.a(param1.field_s, param1.field_m, param1.field_n);
          return;
        } else {
          vf.a((byte) 109);
          ge.a(param1.field_s, param1.field_m, param1.field_n);
          return;
        }
    }

    mc(ta param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((mc) this).field_f = param0;
        ((mc) this).field_c = param2;
        ((mc) this).field_d = param6;
        ((mc) this).field_k = param3;
        ((mc) this).field_h = param5;
        ((mc) this).field_g = param4;
        ((mc) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[11];
        field_i = "You have 1 unread message!";
    }
}
