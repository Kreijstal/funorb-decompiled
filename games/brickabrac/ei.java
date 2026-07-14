/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements ub {
    private int field_l;
    static String field_g;
    private int field_h;
    private int field_j;
    private int field_m;
    private int field_k;
    private int field_f;
    static String field_a;
    private int field_b;
    private int field_d;
    private int field_i;
    private int field_c;
    private dh field_n;
    private int field_e;

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        oc stackIn_3_0 = null;
        oc stackOut_2_0;
        Object stackOut_1_0;
        L0: {
          if (param3 instanceof bf) {
            stackOut_2_0 = (oc) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (oc) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (bf) (Object) stackIn_3_0;
          if (var11 != null) {
            param0 = param0 & var11.field_J;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (!param0) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        lb.g(param3.field_o + param2, param4 - -param3.field_w, param3.field_t, param3.field_s, ((ei) this).field_b);
        var8 = ((ei) this).field_m + param2 - -param3.field_o;
        var9 = ((ei) this).field_h + param4 - -param3.field_w;
        lb.a(var8, var9, ((ei) this).field_l, ((ei) this).field_d, 5592405);
        if (param1 == -20618) {
          lb.g(var8, var9, ((ei) this).field_l, ((ei) this).field_d, var7);
          if (var11.field_F) {
            L3: {
              lb.d(var8, var9, ((ei) this).field_l + var8, var9 - -((ei) this).field_d, 1);
              lb.d(var8 + ((ei) this).field_l, var9, var8, var9 - -((ei) this).field_d, 1);
              if (null != ((ei) this).field_n) {
                var10 = ((ei) this).field_l - -((ei) this).field_m - -((ei) this).field_f;
                int discarded$4 = ((ei) this).field_n.a(param3.field_A, param2 + (param3.field_o + var10), ((ei) this).field_c + (param3.field_w + param4), param3.field_t - (((ei) this).field_f + var10), param3.field_s - (((ei) this).field_f << 516393857), ((ei) this).field_e, ((ei) this).field_j, ((ei) this).field_i, ((ei) this).field_k, 0);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null != ((ei) this).field_n) {
                var10 = ((ei) this).field_l - -((ei) this).field_m - -((ei) this).field_f;
                int discarded$5 = ((ei) this).field_n.a(param3.field_A, param2 + (param3.field_o + var10), ((ei) this).field_c + (param3.field_w + param4), param3.field_t - (((ei) this).field_f + var10), param3.field_s - (((ei) this).field_f << 516393857), ((ei) this).field_e, ((ei) this).field_j, ((ei) this).field_i, ((ei) this).field_k, 0);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          ((ei) this).field_h = 116;
          lb.g(var8, var9, ((ei) this).field_l, ((ei) this).field_d, var7);
          if (!var11.field_F) {
            L5: {
              if (null != ((ei) this).field_n) {
                var10 = ((ei) this).field_l - -((ei) this).field_m - -((ei) this).field_f;
                int discarded$6 = ((ei) this).field_n.a(param3.field_A, param2 + (param3.field_o + var10), ((ei) this).field_c + (param3.field_w + param4), param3.field_t - (((ei) this).field_f + var10), param3.field_s - (((ei) this).field_f << 516393857), ((ei) this).field_e, ((ei) this).field_j, ((ei) this).field_i, ((ei) this).field_k, 0);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              lb.d(var8, var9, ((ei) this).field_l + var8, var9 - -((ei) this).field_d, 1);
              lb.d(var8 + ((ei) this).field_l, var9, var8, var9 - -((ei) this).field_d, 1);
              if (null != ((ei) this).field_n) {
                var10 = ((ei) this).field_l - -((ei) this).field_m - -((ei) this).field_f;
                int discarded$7 = ((ei) this).field_n.a(param3.field_A, param2 + (param3.field_o + var10), ((ei) this).field_c + (param3.field_w + param4), param3.field_t - (((ei) this).field_f + var10), param3.field_s - (((ei) this).field_f << 516393857), ((ei) this).field_e, ((ei) this).field_j, ((ei) this).field_i, ((ei) this).field_k, 0);
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 0) {
          ke.field_b = null;
          t.field_g = false;
          if (!cg.field_l) {
            var1 = fp.field_x;
            if (var1 > 0) {
              if (var1 != 1) {
                ke.field_b = rd.a(ed.field_c, new String[1], (byte) 103);
                ke.field_b = nm.a(new CharSequence[3], true);
                ej.field_I.m(param0 + 17);
                qa.e((byte) -117);
                return;
              } else {
                ke.field_b = ib.field_C;
                ke.field_b = nm.a(new CharSequence[3], true);
                ej.field_I.m(param0 + 17);
                qa.e((byte) -117);
                return;
              }
            } else {
              ej.field_I.m(param0 + 17);
              qa.e((byte) -117);
              return;
            }
          } else {
            ej.field_I.i((byte) -104);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
            return;
        }
        field_a = null;
    }

    ei(dh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ei) this).field_i = 1;
        ((ei) this).field_k = 1;
        ((ei) this).field_n = param0;
        ((ei) this).field_l = param8;
        ((ei) this).field_f = param1;
        ((ei) this).field_d = param7;
        ((ei) this).field_m = param5;
        ((ei) this).field_h = param6;
        ((ei) this).field_b = param9;
        ((ei) this).field_e = param3;
        ((ei) this).field_j = param4;
        ((ei) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "(1 player wants to join)";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
